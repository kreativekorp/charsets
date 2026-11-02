#!/usr/bin/env python3

import os
import re
import subprocess
import sys
import tablint

def get_icu_version():
	p = subprocess.Popen(['uconv', '-V'], stdout=subprocess.PIPE)
	for line in p.stdout:
		line = line.decode('UTF-8').strip()
		return re.split(r'\s+', line)[3]
	return None

def get_icudata_name():
	v = get_icu_version()
	if v is not None:
		return 'icudt%s%s' % (v.split('.')[0], sys.byteorder[0])
	return None

def uconv_has(encoding, icu_data=None):
	cmd = ['uconv', '-f', encoding, '-t', encoding]
	env = None if icu_data is None else {'ICU_DATA': icu_data}
	p = subprocess.Popen(cmd, stdin=subprocess.DEVNULL, stdout=subprocess.DEVNULL, env=env)
	p.wait()
	return p.returncode == 0

def uconv(byte_string, from_encoding, to_encoding, icu_data=None):
	cmd = ['uconv', '--callback', 'substitute']
	if from_encoding:
		cmd.append('-f')
		cmd.append(from_encoding)
	if to_encoding:
		cmd.append('-t')
		cmd.append(to_encoding)
	env = None if icu_data is None else {'ICU_DATA': icu_data}
	p = subprocess.Popen(cmd, stdin=subprocess.PIPE, stdout=subprocess.PIPE, env=env)
	with p.stdin as pin:
		pin.write(byte_string)
	with p.stdout as pout:
		return pout.read()

def verify(name, canonical_name, bytes_to_chars, chars_to_bytes, icu_data=None):
	if not uconv_has(canonical_name, icu_data):
		print('  %s Unsupported encoding: %s' % (tablint.ERROR, canonical_name))
		return False
	ok = True
	surrogates = 0
	for bs in bytes_to_chars:
		expected = bytes_to_chars[bs]
		if any(0xD800 <= c <= 0xDFFF for c in expected):
			if not surrogates:
				print('  Skipping tests with unpaired surrogates')
			surrogates += 1
			continue
		actual = tuple(ord(c) for c in uconv(bytes(bs), canonical_name, 'UTF-8', icu_data).decode('UTF-8'))
		if actual != expected:
			print('  %s Decode failed for byte sequence 0x%s' % (tablint.ERROR, ''.join('%02X' % b for b in bs)))
			print('  * Got: U+%s * Want: U+%s' % (
				'+'.join('%04X' % c for c in actual) if actual else '<null>',
				'+'.join('%04X' % c for c in expected) if expected else '<null>'
			))
			ok = False
	for cs in chars_to_bytes:
		if any(0xD800 <= c <= 0xDFFF for c in cs):
			if not surrogates:
				print('  Skipping tests with unpaired surrogates')
			surrogates += 1
			continue
		expected = chars_to_bytes[cs]
		actual = tuple(uconv(''.join(chr(c) for c in cs).encode('UTF-8'), 'UTF-8', canonical_name, icu_data))
		if actual != expected:
			print('  %s Encode failed for character sequence U+%s' % (tablint.ERROR, '+'.join('%04X' % c for c in cs)))
			print('  * Got: 0x%s * Want: 0x%s' % (
				''.join('%02X' % b for b in actual) if actual else '<null>',
				''.join('%02X' % b for b in expected) if expected else '<null>'
			))
			ok = False
	if surrogates:
		print('  Skipped %d tests with unpaired surrogates' % surrogates)
	return ok

def main():
	icudata_name = get_icudata_name()
	if icudata_name is None:
		print('Cannot find ICU.')
		return False
	tools = os.path.dirname(os.path.realpath(__file__))
	tmp = os.path.join(tools, 'tmp')
	os.makedirs(tmp, exist_ok=True)
	dt = os.path.join(tmp, icudata_name)
	if os.path.exists(dt):
		os.remove(dt)
	cnv = os.path.join(tools, '..', 'icu', 'cnv')
	os.symlink(cnv, dt)
	verify_fn = lambda n, cn, b2c, c2b: verify(n, cn, b2c, c2b, tmp)

	args = sys.argv[1:]
	if args:
		parse_opts = True
		round_trip = True
		ok = True
		for arg in args:
			if parse_opts and arg.startswith('-'):
				if arg == '--':
					parse_opts = False
				elif arg == '-t':
					round_trip = False
				elif arg == '-T':
					round_trip = True
				else:
					print('%s Unknown option: %s' % (ERROR, arg))
					ok = False
			elif not tablint.lint(arg, round_trip, then_call=verify_fn):
				ok = False
	else:
		ok1 = tablint.lint(os.path.join(tools, '..', 'tables'), True, then_call=verify_fn)
		ok2 = tablint.lint(os.path.join(tools, '..', 'tests'), False, then_call=verify_fn)
		ok = ok1 and ok2
	if ok:
		print(tablint.ALL_OK)

	os.remove(dt)
	os.rmdir(tmp)
	return ok

if __name__ == '__main__':
	if not main():
		sys.exit(1)

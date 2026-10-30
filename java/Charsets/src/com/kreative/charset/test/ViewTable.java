package com.kreative.charset.test;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.Scrollable;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ViewTable {
	private static final Pattern BYTES_TO_CHARS = Pattern.compile("^0x(([0-9A-F]{2})+)\\s+U((\\+([1-9A-F]|10)?[0-9A-F]{4})+)$");
	private static final Pattern CHARS_TO_BYTES = Pattern.compile("^U((\\+([1-9A-F]|10)?[0-9A-F]{4})+)\\s+0x(([0-9A-F]{2})+)$");
	
	private static byte[] hexToBytes(String hex) {
		byte[] b = new byte[hex.length() / 2];
		for (int i = 0; i < hex.length(); i += 2) {
			String bs = hex.substring(i, i+2);
			int bi = Integer.parseInt(bs, 16);
			b[i / 2] = (byte)bi;
		}
		return b;
	}
	
	private static String hexToChars(String hex) {
		StringBuffer s = new StringBuffer();
		for (String cs : hex.split("[+]")) {
			int ci = Integer.parseInt(cs, 16);
			s.append(Character.toChars(ci));
		}
		return s.toString();
	}
	
	private static String charsToHex(String chars) {
		StringBuffer s = new StringBuffer();
		int i = 0; int n = chars.length();
		while (i < n) {
			if (i != 0) s.append("+");
			int ch = chars.codePointAt(i);
			String h = Integer.toHexString(ch);
			while (h.length() < 4) h = "0" + h;
			s.append(h.toUpperCase());
			i += Character.charCount(ch);
		}
		return s.toString();
	}
	
	private static String charsToHTML(String chars, String[] controlLabels) {
		StringBuffer s = new StringBuffer();
		s.append("<html>&#8203;");
		int i = 0; int n = chars.length();
		while (i < n) {
			int ch = chars.codePointAt(i);
			if (ch <= 0x20) {
				s.append("<small>" + controlLabels[ch] + "</small>");
			} else if (ch == '&') {
				s.append("&amp;");
			} else if (ch == '<') {
				s.append("&lt;");
			} else if (ch == '>') {
				s.append("&gt;");
			} else if (ch < 0x7F) {
				s.append(Character.toChars(ch));
			} else if (ch <= 0xA0) {
				s.append("<small>" + controlLabels[ch - 94] + "</small>");
			} else if (ch == 0xAD) {
				s.append("<small>" + controlLabels[67] + "</small>");
			} else if (ch < 0xF000) {
				s.append(Character.toChars(ch));
			} else if (ch <= 0xF0FF) {
				s.append("<small>EUDC</small>");
			} else {
				s.append(Character.toChars(ch));
			}
			i += Character.charCount(ch);
		}
		s.append("&#8203;</html>");
		return s.toString();
	}
	
	private static class CharacterCell extends JPanel {
		private static final long serialVersionUID = 1L;
		public CharacterCell(String mapsTo, String[] mapsFrom, String[] controlLabels) {
			super(new BorderLayout());
			
			JLabel glyphLabel = new JLabel((mapsTo != null) ? charsToHTML(mapsTo, controlLabels) : "\uFFFD");
			glyphLabel.setFont(glyphLabel.getFont().deriveFont(24f));
			glyphLabel.setHorizontalAlignment(JLabel.CENTER);
			add(glyphLabel, BorderLayout.PAGE_START);
			
			boolean roundTrips = false;
			JPanel innerCodePanel = new JPanel(new GridLayout(0,1));
			JLabel toCodeLabel = new JLabel((mapsTo != null) ? charsToHex(mapsTo) : "???");
			toCodeLabel.setFont(toCodeLabel.getFont().deriveFont(Font.BOLD));
			toCodeLabel.setHorizontalAlignment(JLabel.CENTER);
			innerCodePanel.add(toCodeLabel);
			if (mapsFrom != null) {
				for (String s : mapsFrom) {
					if (s.equals(mapsTo)) {
						roundTrips = true;
					} else {
						JLabel fromCodeLabel = new JLabel(charsToHex(s));
						fromCodeLabel.setFont(fromCodeLabel.getFont().deriveFont(Font.PLAIN));
						fromCodeLabel.setHorizontalAlignment(JLabel.CENTER);
						innerCodePanel.add(fromCodeLabel);
					}
				}
			}
			
			if (!roundTrips) {
				glyphLabel.setForeground(Color.lightGray);
				toCodeLabel.setForeground(Color.lightGray);
				for (Component c : innerCodePanel.getComponents()) {
					c.setForeground(Color.lightGray);
				}
			}
			
			JPanel outerCodePanel = new JPanel(new BorderLayout());
			outerCodePanel.add(innerCodePanel, BorderLayout.PAGE_START);
			add(outerCodePanel, BorderLayout.CENTER);
			
			setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(Color.gray),
				BorderFactory.createEmptyBorder(2, 2, 0, 2)
			));
		}
	}
	
	private static class TablePanel extends JPanel {
		private static final long serialVersionUID = 1L;
		public TablePanel(
			Map<Integer,String> mapsTo,
			Map<Integer,List<String>> mapsFrom,
			String[] controlLabels
		) {
			super(new GridLayout(16,16));
			for (int i = 0; i < 256; i++) {
				String cMapsTo = mapsTo.get(i);
				String[] cMapsFromA = new String[0];
				List<String> cMapsFromL = mapsFrom.get(i);
				if (cMapsFromL != null) cMapsFromA = cMapsFromL.toArray(cMapsFromA);
				CharacterCell c = new CharacterCell(cMapsTo, cMapsFromA, controlLabels);
				add(c);
			}
		}
	}
	
	private static final int[] EBCDIC_BYTES = {
		0xFF,0x3F,0x3D,0x3C,0x3B,0x3A,0x39,0x38,0x37,0x36,0x35,0x34,0x33,0x32,0x2F,
		0x2E,0x2D,0x2C,0x2B,0x2A,0x29,0x28,0x27,0x26,0x24,0x23,0x22,0x21,0x20,0x1F,
		0x1E,0x1D,0x1C,0x1B,0x1A,0x19,0x18,0x17,0x16,0x14,0x13,0x12,0x11,0x10,0x0F,
		0x0E,0x0D,0x0C,0x0B,0x0A,0x09,0x08,0x07,0x06,0x05,0x04,0x03,0x02,0x01,0x00
	};
	private static final char[] EBCDIC_CHARS = {
		0x9F,0x1A,0x15,0x14,0x9B,0x9A,0x99,0x98,0x04,0x96,0x95,0x94,0x93,0x16,0x07,
		0x06,0x05,0x8C,0x8B,0x8A,0x89,0x88,0x1B,0x17,0x84,0x83,0x82,0x81,0x80,0x1F,
		0x1E,0x1D,0x1C,0x8F,0x92,0x19,0x18,0x87,0x08,0x9D,0x13,0x12,0x11,0x10,0x0F,
		0x0E,0x0D,0x0C,0x0B,0x8E,0x8D,0x97,0x7F,0x86,0x09,0x9C,0x03,0x02,0x01,0x00
	};
	private static boolean isEBCDIC(Map<Integer,String> mapsTo) {
		for (int i = 0; i < 60; i++) {
			String expected = String.valueOf(EBCDIC_CHARS[i]);
			String actual = mapsTo.get(EBCDIC_BYTES[i]);
			if (!expected.equals(actual)) return false;
		}
		return true;
	}
	
	private static final int[] FIELDATA_BYTES = {
		0x7F,0x7E,0x6F,0x45,0x43,0x42,0x41,0x40,0x3F,0x3E,
		0x3D,0x3C,0x3B,0x3A,0x38,0x37,0x36,0x35,0x34,0x33,
		0x32,0x31,0x30,0x2B,0x2A,0x29,0x28,0x27,0x26,0x25,
		0x24,0x23,0x22,0x21,0x20,0x05,0x03,0x02,0x01,0x00
	};
	private static final char[] FIELDATA_CHARS = {
		0x08,0x9B,0x14,0x20,0x09,0x0E,0x0F,0x80,0x7F,0x1B,
		0x1D,0x8C,0x8B,0x8A,0x15,0x06,0x83,0x04,0x03,0x02,
		0x13,0x12,0x11,0x01,0x81,0x99,0x98,0x97,0x96,0x95,
		0x94,0x93,0x92,0x91,0x90,0xA0,0x89,0x8E,0x8F,0x00
	};
	private static boolean isFIELDATA(Map<Integer,String> mapsTo) {
		for (int i = 0; i < 40; i++) {
			String expected = String.valueOf(FIELDATA_CHARS[i]);
			String actual = mapsTo.get(FIELDATA_BYTES[i]);
			if (!expected.equals(actual)) return false;
		}
		return true;
	}
	
	private static final String[] EBCDIC_CONTROLS = {
		"NUL","SOH","STX","ETX","EOT","ENQ","ACK","BEL",
		"BS","HT","LF","VT","FF","CR","SO","SI",
		"DLE","DC1","DC2","DC3","DC4","NAK","SYN","ETB",
		"CAN","EM","SUB","ESC","IFS","IGS","IRS","IUS",
		"SP","DEL",
		"DS","SOS","FS","WUS","BYP","NL","RNL","POC",
		"SA","SFE","SM","CSP","MFA","SPS","RPT","CU1",
		"XXX","XXX","UBS","IR","PP","TRN","NBS","GE",
		"SBS","IT","RFF","CU3","SEL","RES","XXX","EO",
		"NBSP","SHY"
	};
	private static final String[] FIELDATA_CONTROLS = {
		"IDL","SBK","EBE","EBK","EOF","XXX","ACK","XXX",
		"BS","HT","LF","VT","FF","CR","LC","UC",
		"XXX","RTT","RTR","NRR","ST","RPT","XXX","XXX",
		"XXX","XXX","XXX","SPC","XXX","SAC","XXX","XXX",
		"SP","DEL",
		"MS","SCB","XXX","ECB","XXX","XXX","XXX","XXX",
		"XXX","CHT","INS","NIS","CWF","CCR","CLC","CUC",
		"D0","D1","D2","D3","D4","D5","D6","D7",
		"D8","D9","XXX","SPEC","XXX","XXX","XXX","XXX",
		"CSP","SHY"
	};
	private static final String[] ASCII_CONTROLS = {
		"NUL","SOH","STX","ETX","EOT","ENQ","ACK","BEL",
		"BS","HT","LF","VT","FF","CR","SO","SI",
		"DLE","DC1","DC2","DC3","DC4","NAK","SYN","ETB",
		"CAN","EM","SUB","ESC","FS","GS","RS","US",
		"SP","DEL",
		"PAD","HOP","BPH","NBH","IND","NEL","SSA","ESA",
		"HTS","HTJ","VTS","PLD","PLU","RI","SS2","SS3",
		"DCS","PU1","PU2","STS","CCH","MW","SPA","EPA",
		"SOS","SGCI","SCI","CSI","ST","OSC","PM","APC",
		"NBSP","SHY"
	};
	private static String[] getControlLabels(Map<Integer,String> mapsTo) {
		if (isEBCDIC(mapsTo)) return EBCDIC_CONTROLS;
		if (isFIELDATA(mapsTo)) return FIELDATA_CONTROLS;
		return ASCII_CONTROLS;
	}
	
	private static TablePanel loadPanel(File file) {
		Map<Integer,String> mapsTo = new HashMap<Integer,String>();
		Map<Integer,List<String>> mapsFrom = new HashMap<Integer,List<String>>();
		try {
			Scanner scan = new Scanner(file);
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				int o = line.indexOf('#');
				line = (o < 0) ? line.trim() : line.substring(0, o).trim();
				if (line.length() == 0) continue;
				Matcher bm = BYTES_TO_CHARS.matcher(line);
				if (bm.matches()) {
					byte[] bs = hexToBytes(bm.group(1));
					String cs = hexToChars(bm.group(3).substring(1));
					if (bs.length == 1) mapsTo.put(bs[0] & 0xFF, cs);
				}
				Matcher cm = CHARS_TO_BYTES.matcher(line);
				if (cm.matches()) {
					String cs = hexToChars(cm.group(1).substring(1));
					byte[] bs = hexToBytes(cm.group(4));
					if (bs.length == 1) {
						List<String> a = mapsFrom.get(bs[0] & 0xFF);
						if (a == null) {
							a = new ArrayList<String>();
							mapsFrom.put(bs[0] & 0xFF, a);
						}
						a.add(cs);
					}
				}
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		if (mapsTo.isEmpty() && mapsFrom.isEmpty()) return null;
		return new TablePanel(mapsTo, mapsFrom, getControlLabels(mapsTo));
	}
	
	private static class MultiTableCardPanel extends JPanel implements Scrollable {
		private static final long serialVersionUID = 1L;
		private final CardLayout cl;
		private boolean scrolling;
		public MultiTableCardPanel(SortedMap<String,TablePanel> panels) {
			setLayout((this.cl = new CardLayout()));
			for (Map.Entry<String,TablePanel> e : panels.entrySet()) {
				add(e.getValue(), e.getKey());
			}
		}
		public void show(String which) {
			this.cl.show(this, which);
		}
		public boolean isScrolling() {
			return this.scrolling;
		}
		public void setScrolling(boolean scrolling) {
			this.scrolling = scrolling;
			this.invalidate();
		}
		public Dimension getPreferredScrollableViewportSize() {
			return getPreferredSize();
		}
		public int getScrollableUnitIncrement(Rectangle vr, int ori, int dir) {
			return ((Container)this.getComponent(0)).getComponent(0).getHeight();
		}
		public int getScrollableBlockIncrement(Rectangle vr, int ori, int dir) {
			return vr.height;
		}
		public boolean getScrollableTracksViewportWidth() { return true; }
		public boolean getScrollableTracksViewportHeight() { return !scrolling; }
	}
	
	private static class MultiTableListPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		private final JList list;
		private final MultiTableCardPanel tables;
		public MultiTableListPanel(SortedMap<String,TablePanel> panels) {
			super(new BorderLayout());
			
			this.list = new JList(panels.keySet().toArray(new String[0]));
			list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			JScrollPane listPane = new JScrollPane(
				list,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
			);
			add(listPane, BorderLayout.LINE_START);
			
			this.tables = new MultiTableCardPanel(panels);
			JScrollPane tablePane = new JScrollPane(
				tables,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
			);
			add(tablePane, BorderLayout.CENTER);
			
			list.addListSelectionListener(new ListSelectionListener() {
				public void valueChanged(ListSelectionEvent e) {
					Object which = list.getSelectedValue();
					if (which != null) tables.show(which.toString());
				}
			});
		}
	}
	
	private static SortedMap<String,TablePanel> loadPanels(SortedMap<String,TablePanel> panels, File... files) {
		if (panels == null) panels = new TreeMap<String,TablePanel>();
		for (File file : files) {
			if (file.isFile()) {
				String name = file.getName();
				if (name.endsWith(".txt")) name = name.substring(0, name.length() - 4);
				TablePanel panel = loadPanel(file);
				if (panel != null) panels.put(name, panel);
			}
			if (file.isDirectory()) {
				for (File child : file.listFiles()) {
					String cname = child.getName();
					if (cname.startsWith(".") || cname.endsWith("\r")) continue;
					if (child.isDirectory() || cname.endsWith(".txt")) loadPanels(panels, child);
				}
			}
		}
		return panels;
	}
	
	public static void main(String[] args) {
		final List<File> files = new ArrayList<File>();
		for (String arg : args) files.add(new File(arg));
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				final File[] a = files.toArray(new File[files.size()]);
				final SortedMap<String,TablePanel> m = loadPanels(null, a);
				final MultiTableListPanel p = new MultiTableListPanel(m);
				final JFrame f = new JFrame("Oh how the turn tables...");
				f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				f.setContentPane(p);
				f.setSize(1152, 864);
				f.setLocationRelativeTo(null);
				f.setVisible(true);
				
				final JRootPane root = f.getRootPane();
				KeyStroke ks = KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0);
				root.getInputMap(JRootPane.WHEN_IN_FOCUSED_WINDOW).put(ks, "toggleScrolling");
				root.getActionMap().put("toggleScrolling", new AbstractAction() {
					private static final long serialVersionUID = 1L;
					public void actionPerformed(ActionEvent e) {
						MultiTableCardPanel cp = p.tables;
						cp.setScrolling(!cp.isScrolling());
						root.validate();
					}
				});
			}
		});
	}
}

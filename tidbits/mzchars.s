; MZCHARS
; Prints table of ASCII codes on left side of screen
; and table of display codes on right side of screen.
; July 2022, Rebecca Bettencourt, Kreative Software
MZChars:
  CALL ClsPri
  LD   HL,$D0A2
MZChrLp:
  CALL PrtRow
  CP   B
  JR   NZ,MZChrLp

; Keyboard loop.
; Press P for primary character set.
; Press A for alternate character set.
; Press Q to quit.
KbdLp:
  CALL $09B3
  CALL KbdEx
  JR   KbdLp
KbdEx:
  CP   $10
  JR   Z,Pri
  CP   $01
  JR   Z,Alt
  CP   $11
  RET  NZ

; Clear screen and return to monitor.
Exit:
  CALL ClsPri
  JP   $0000

; Print row (in B) of character table (at address in HL).
; Returns with A = 0, B += $10, C unaffected, DE unaffected, HL += 40.
PrtRow:
  LD   A,B
  CALL $0BB9
  LD   (HL),A
  INC  HL
  INC  B
  LD   A,B
  AND  $0F
  JR   NZ,PrtRow
  INC  HL
  INC  HL
  INC  HL
  INC  HL
  DEC  B
  LD   A,B
  AND  $F0
  LD   B,A
PrtRowD:
  LD   (HL),B
  INC  HL
  INC  B
  LD   A,B
  AND  $0F
  JR   NZ,PrtRowD
  INC  HL
  INC  HL
  INC  HL
  INC  HL
  RET

; Clear screen and set primary character set.
ClsPri:
  LD   A,$16
  CALL $0012

; Set entire screen to primary character set.
; Returns with A = 0, BC = 0, DE unaffected, HL = $DBE8.
Pri:
  LD   BC,$03E8
  LD   HL,$D800
PriLp:
  RES  7,(HL)
  INC  HL
  DEC  BC
  LD   A,B
  OR   C
  JR   NZ,PriLp
  RET

; Set entire screen to alternate character set.
; Returns with A = 0, BC = 0, DE unaffected, HL = $DBE8.
Alt:
  LD   BC,$03E8
  LD   HL,$D800
AltLp:
  SET  7,(HL)
  INC  HL
  DEC  BC
  LD   A,B
  OR   C
  JR   NZ,AltLp
  RET

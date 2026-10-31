; MZCODES
; Prints character code mappings according to ACDISP and DISPAC routines.
; September 2022, Rebecca Bettencourt, Kreative Software
MZCodes:

; Clear screen
  LD   A,$16
  CALL $0012

; Print "ACDISP"
  LD   DE,ACDispSt
  CALL $0015
  CALL $0009

; Print ACDISP table
  LD   B,$00
ACDispLp:
  LD   A,B
  CALL $0BB9
  CALL $03C3
  INC  B
  JR   NZ,ACDispLp
  CALL $0009

; Wait for N key
KbdLp1:
  CALL $09B3
  CP   $0E
  JR   NZ,KbdLp1

; Clear screen
  LD   A,$16
  CALL $0012

; Print "DISPAC"
  LD   DE,DispACSt
  CALL $0015
  CALL $0009

; Print DISPAC table
  LD   B,$00
DispACLp:
  LD   A,B
  CALL $0BCE
  CALL $03C3
  INC  B
  JR   NZ,DispACLp
  CALL $0009

; Wait for N key
KbdLp2:
  CALL $09B3
  CP   $0E
  JR   NZ,KbdLp2

  JR   MZCodes

ACDispSt:
.DB "ACDISP"
.DB $0D

DispACSt:
.DB "DISPAC"
.DB $0D

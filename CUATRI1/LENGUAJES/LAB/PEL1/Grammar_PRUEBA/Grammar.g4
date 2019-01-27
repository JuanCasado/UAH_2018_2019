grammar Grammar;		
init:	((math|assigment)NEWLINE)* ;
assigment: VAR ASSIGN (VAR|math)
    ;
math:   math OPL1 math
    |   math OPL2 math
    |	math OPL3 math
    |   math LOGICL1 math
    |   math LOGICL2 math
    |   math LOGICL3 math
    |   TRIG PI math PD
    |	INT
    |   FLOAT
    |   STR
    |	PI math PD
    |   FUNC PI (math (SEP math)*)? PD
    |   VAR
    ;
number: INT|FLOAT;

NEWLINE : [\r\n]+ ;
FUNC    : 'fun';
TRIG    : 'cos'|'sen'|'tan';
OPL1    : ('^'|'@');
OPL2    : ('*'|'/');
OPL3    : ('+'|'-');
LOGICL1 : ('||'|'&&');
LOGICL2 : ('|'|'&');
LOGICL3 : ('<'|'>'|'<='|'>='|'=='|'!=');
PI      : '(';
PD      : ')';
SEP     : ',';
ASSIGN  : '=';
INT     : NUMBER+ ;
FLOAT   : (NUMBER+'.'NUMBER*)|(NUMBER*'.'NUMBER+);
STR     : '"' (ESC.)*? '"';
VAR     : LETTER(LETTER|NUMBER)*;
fragment ESC    : '\\'[btrn"\\];
fragment LETTER : [a-zA-Z];
fragment NUMBER : [0-9];

COMMENT1 : '//' .*? '\n' -> skip;
COMMENT2 : '/*' .*? '*/' -> skip;
WS: [ \r\n\t\b]+ -> skip;

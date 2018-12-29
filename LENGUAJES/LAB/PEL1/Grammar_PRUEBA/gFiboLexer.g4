lexer grammar gFiboLexer;

INFORMATION_START       : '/***' -> pushMode(INFORMATION);
COMMENT_BLOCK_START : (COMMENT_BLOCK_START_DOUBLE | COMMENT_BLOCK_START_SIMPLE) -> pushMode(COMMENT_MULTILINE);
fragment COMMENT_BLOCK_START_DOUBLE   : '/**';
fragment COMMENT_BLOCK_START_SIMPLE   : '/*';
COMMENT_LINE_START      : '//' -> pushMode(COMMENT_LINE);

INCLUDE_START   : 'include' -> pushMode(INCLUDE);
ASSIGN          : ':=';
END             : ';';
RETURN_TYPE     : ':';
RETURN          : 'devolver';
DECLARATION     :'function';
BODY_START      : 'begin';
BODY_END        : 'end';
INTEGER         : 'numero';
STRING          : 'cadena';
VOID            : 'void';
WHILE           : 'while';
TRIG            : 'cos'|'sen'|'tan';
POW             : '^';
SQRT            : '@';
MUL             : '*';
DIV             : '/';
ADD             : '+';
SUB             : '-';
OR              : '||';
AND             : '&&';
OR_B            : '|';
AND_B           : '&';
MIN             : '<';
MAX             : '>';
MINEQ           : '<=';
MAXEQ           : '>=';
EQ              : '==';
NEQ             : '!=';
ARGUMENT_START  : '(';
ARGUMENT_END    : ')';
SEPARATOR       : ',';
INT             : NUMBER+ ;
FLOAT           : (NUMBER+'.'NUMBER*)|(NUMBER*'.'NUMBER+);
STR             : '"' (ESC|.)*? '"';
VAR             : LETTER(LETTER|NUMBER)*;
fragment LETTER : [a-zA-Z];
fragment NUMBER : [0-9];
fragment ESC    : '\\'[btrn"\\];

WS  : [ \r\n\t\b]+ -> skip;
SS  : ' ' -> skip;

mode COMMENT_MULTILINE;
COMMENT_BLOCK_END : (COMMENT_BLOCK_END_DOUBLE | COMMENT_BLOCK_END_SIMPLE) -> popMode;
fragment COMMENT_BLOCK_END_DOUBLE   : '**/';
fragment COMMENT_BLOCK_END_SIMPLE   : '*/';
TXT_MULTILINE   : .+?;
WS_COMMENT_MULTILINE: [ \r\n\t\b]+ -> skip;

mode INFORMATION;
INFORMATION_END         : '***/'->popMode;
TAG_START   : '@' -> pushMode(TAG);
TXT_INFORMATION : .+?;
WS_INFORMATION: [ \r\n\t\b]+ -> skip;

mode COMMENT_LINE;
COMMENT_LINE_END        : '\r\n' -> popMode;
TXT_LINE    : .+?;
WS_COMMENT_LINE: [ \t\b]+ -> skip;

mode TAG;
TAG_END     : '\r\n' -> popMode;
TAG_ID      : AUTHOR|DESCRIPTION|TARGET;
fragment AUTHOR         : 'author';
fragment DESCRIPTION    : 'description';
fragment TARGET         : 'target';
TAG_LIMIT   : ':';
TXT_TAG     : .+?;
WS_TAG: [ \t\b]+ -> skip;

mode INCLUDE;
INCLUDE_END     : ';' -> popMode;
LIBRARY_NAME    : [a-zA-Z][a-zA-Z0-9]*;

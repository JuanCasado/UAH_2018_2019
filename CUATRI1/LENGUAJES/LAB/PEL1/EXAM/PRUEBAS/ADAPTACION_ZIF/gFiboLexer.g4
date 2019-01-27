lexer grammar gFiboLexer;

INFORMATION_START       : '/***' -> pushMode(INFORMATION);
COMMENT_BLOCK_START : (COMMENT_BLOCK_START_DOUBLE | COMMENT_BLOCK_START_SIMPLE) -> pushMode(COMMENT_MULTILINE);
fragment COMMENT_BLOCK_START_DOUBLE   : '/**';
fragment COMMENT_BLOCK_START_SIMPLE   : '/*';
COMMENT_LINE_START      : '//' -> pushMode(COMMENT_LINE);

INCLUDE_START   : 'include';
ASSIGN          : ':=';
END             : ';';
RETURN_TYPE     : ':';
RETURN          : 'devolver';
DECLARATION     :'function';
SWITCH          : 'switch';
DEFAULT         : 'default';
END_SWITCH      : 'endswitch';
CASE            : 'case ';
BREAK           : 'break';
BODY_START      : 'begin';
BODY_END        : 'end';
IF_START        : 'then';
ELSE            : 'else';
IF_END          : 'endif';
INTEGER         : 'numero';
STRING          : 'cadena';
VOID            : 'void';
WHILE           : 'while';
IF              : 'if';
COS             : 'cos';
SEN             : 'sen';
TAN             :'tan';
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
VAR             : LETTER(LETTER|NUMBER|UNDER)*;
fragment LETTER : [a-zA-Z];
fragment NUMBER : [0-9];
fragment UNDER  : '_';

WS  : [ \r\n\b\t]+;

STR_START   : '"'-> pushMode(STR_MODE);


mode COMMENT_MULTILINE;
COMMENT_BLOCK_END : (COMMENT_BLOCK_END_DOUBLE | COMMENT_BLOCK_END_SIMPLE) -> popMode;
fragment COMMENT_BLOCK_END_DOUBLE   : '**/';
fragment COMMENT_BLOCK_END_SIMPLE   : '*/';
TXT_MULTILINE   : .+?;

mode INFORMATION;
INFORMATION_END         : '***/'->popMode;
TAG_START   : '@' -> pushMode(TAG);
TXT_INFORMATION : .+?;

mode COMMENT_LINE;
COMMENT_LINE_END        : [\r\n]+ -> popMode;
TXT_LINE    : .+?;

mode TAG;
TAG_END     : [\r\n]+ -> popMode;
TAG_ID      : AUTHOR|DESCRIPTION|TARGET;
fragment AUTHOR         : 'author';
fragment DESCRIPTION    : 'description';
fragment TARGET         : 'target';
TAG_LIMIT   : ':';
TXT_TAG     : .+?;



mode STR_MODE;
STR_END : '"'-> popMode;
ESC     : '\\'[btrn"\\];
STR_VAR : INICIO_STR_VAR[a-zA-Z];
fragment INICIO_STR_VAR :'%';
STR_TXT : .+?;
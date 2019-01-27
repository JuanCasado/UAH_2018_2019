grammar Grammar_FIBO;
init    : (information_block
        | comment
        | NEWLINE)*
        ;
information_block   : INFORMATION_START ((txt* information txt*)|txt)* INFORMATION_END;
information         : information_id information_content;
information_id      : AUTHOR | DESCRIPTION | TARGET;
information_content : txt*;

comment : COMMENT_BLOCK_START (txt|NEWLINE)* COMMENT_BLOCK_END
        | COMMENT_LINE  txt*
        ;

txt : TXT+;

NEWLINE : [\r\n]+;
INFORMATION_START       : '/***';
INFORMATION_END         : '***/';
AUTHOR         : '@author:';
DESCRIPTION    : '@description:';
TARGET         : '@target:';

COMMENT_BLOCK_START : COMMENT_BLOCK_START_DOUBLE | COMMENT_BLOCK_START_SIMPLE;
fragment COMMENT_BLOCK_START_DOUBLE   : '/**';
fragment COMMENT_BLOCK_START_SIMPLE   : '/*';
COMMENT_BLOCK_END : COMMENT_BLOCK_END_DOUBLE | COMMENT_BLOCK_END_SIMPLE;
fragment COMMENT_BLOCK_END_DOUBLE   : '**/';
fragment COMMENT_BLOCK_END_SIMPLE   : '*/';
COMMENT_LINE    : '//';

TXT             : .+?;

WS: [ \r\n\t\b]+ -> skip;
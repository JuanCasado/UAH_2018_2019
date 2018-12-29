parser grammar gFiboParser;
options {
    tokenVocab = gFiboLexer;
    language = Java;
}

init    : exp*;

information_block   : INFORMATION_START (information |txt)* INFORMATION_END;
information         : TAG_START tag_name TAG_LIMIT tag_content* TAG_END;
tag_name            : TAG_ID;
tag_content         : txt|TAG_ID;

comment : COMMENT_BLOCK_START txt* COMMENT_BLOCK_END
        | COMMENT_LINE_START  txt* COMMENT_LINE_END
        | information_block
        ;

txt : (TXT_LINE
    | TXT_MULTILINE
    | TXT_INFORMATION
    | TXT_TAG
    ) +
    ;

exp : include
    | assigment
    | declaration
    | assigment_declaration
    | procedure
    | system_function
    | custom_function
    | comment
    | dev
    ;

include : INCLUDE_START library INCLUDE_END;
library : LIBRARY_NAME;

assigment: var_name ASSIGN math END;
declaration : var_type var_name END;
assigment_declaration : var_type var_name ASSIGN math END;
procedure : function_call END;
var_type : INTEGER | STRING | VOID;
var_name : VAR;
math:   math (POW|SQRT) math
    |   math (MUL|DIV) math
    |	math (ADD|SUB) math
    |   math (OR|AND) math
    |   math (OR_B|AND_B) math
    |   math (MIN|MAX|MINEQ|MAXEQ|EQ|NEQ) math
    |   TRIG ARGUMENT_START math ARGUMENT_END
    |   lieteral
    |   var_name
    |   function_call;
lieteral: number | str;
number : INT | FLOAT;
str : STR;
function_call : function_name ARGUMENT_START (math comment? (SEPARATOR math comment?)*)? ARGUMENT_END;
function_name : VAR;

system_function     :   system_function_name ARGUMENT_START math ARGUMENT_END 
                        BODY_START exp* BODY_END;
system_function_name : WHILE; 

custom_function     :   DECLARATION custom_function_name ARGUMENT_START 
                            (parameter comment? (SEPARATOR parameter comment?)*)?
                        ARGUMENT_END RETURN_TYPE var_type
                        BODY_START 
                            exp* 
                        BODY_END;
custom_function_name    : VAR;
parameter               : var_type var_name;
dev                     : RETURN ARGUMENT_START math ARGUMENT_END END;
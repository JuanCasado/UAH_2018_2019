parser grammar gFiboParser;
options {
    tokenVocab = gFiboLexer;
    language = Java;
}

init    : (prog|mem|trash)*;

information         : tag_start tag_name tag_end tag_content* TAG_END;
tag_name            : TAG_ID;
tag_content         : txt|TAG_ID;
tag_start: TAG_START;
tag_end: TAG_LIMIT;

comment : comment_block_start txt* comment_block_end
        | comment_line_start  txt* COMMENT_LINE_END
        | information_start (information |txt)* information_end
        ;
comment_block_start: COMMENT_BLOCK_START;
comment_block_end: COMMENT_BLOCK_END;
information_start: INFORMATION_START;
information_end : INFORMATION_END;
comment_line_start : COMMENT_LINE_START;

txt : (TXT_LINE
    | TXT_MULTILINE
    | TXT_INFORMATION
    | TXT_TAG
    ) +
    ;

prog    :      custom_function
        |   include end_exp
        |   trash prog
        |   prog trash
        ;

mem :   trash mem
    |   mem trash
    |   assigment end_exp
    |   declaration end_exp
    |   assigment_declaration end_exp
    |   function_call end_exp
    |   system_function 
    ;

end_exp: trash* END trash*;
exp :   trash exp
    |   exp trash
    |   argument_start exp argument_end
    |   parameter
    |   exp mathL1 exp
    |   exp mathL2 exp
    |	exp mathL3 exp
    |   exp logicL1 exp
    |   exp logicL2 exp
    |   exp logicL3 exp
    |   trig argument_start exp argument_end
    |   lieteral
    |   var_name
    |   function_call
    ;

mathL1      : (POW|SQRT);
mathL2      : (MUL|DIV);
mathL3      : (ADD|SUB);
logicL1     : (OR|AND);
logicL2     : (OR_B|AND_B);
logicL3     : (MIN|MAX|MINEQ|MAXEQ|EQ|NEQ);
trig        : (COS|SEN|TAN);

include : include_start trash* library;
include_start: INCLUDE_START;
library : VAR;
assigment: var_name assign exp;
declaration : var_type var_name;
assigment_declaration : var_type var_name assign exp;
var_type : trash* (INTEGER | STRING | VOID) trash* ;
var_name : VAR;
lieteral: number | str;
number : INT | FLOAT;
str         : str_start (str_txt|esc|str_var)* str_end;
str_start   : STR_START;
str_end     : STR_END;
str_txt     : STR_TXT+;
esc         : ESC;
str_var     : STR_VAR;
function_call : function_name argument_start (exp (separator exp)*)? argument_end;
function_name : VAR;

system_function     :   system_header system_body;
                        
system_header : system_function_name argument_start exp* argument_end;
system_body   :body_start mem* body_end;
system_function_name : trash* (WHILE | IF) trash*; 

custom_function     :   custom_header custom_body;
                        
custom_header   :   function_declaration custom_function_name argument_start 
                        (exp (separator exp)*)?
                    argument_end return_type var_type;
custom_body     :   body_start  mem* dev? body_end;

custom_function_name    : VAR;
parameter               : var_type var_name;
dev                     : return_word argument_start exp argument_end end_exp;

separator: SEPARATOR;
return_type : trash* RETURN_TYPE trash*;
return_word : trash* RETURN trash*;
function_declaration : trash* DECLARATION trash*;
argument_start: trash* ARGUMENT_START trash*;
argument_end: trash* ARGUMENT_END trash*;
body_start: trash* BODY_START trash*;
body_end: trash* BODY_END trash*;
assign : trash* ASSIGN trash*;
trash: comment | WS;
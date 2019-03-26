grammar ProLang;

//@header {
//package tk.dadle8.antlr4;
//}

CHAR : '[^\']';
HEX : '0'[xX][0-9A-Fa-f]+;
BITS : '0'[bB][01]+;
BOOL : 'true'|'false';
DEC : [0-9]+;
IDENTIFIER : [a-zA-Z_]([a-zA-Z_0-9])*;
STR : '"' (~('\\'|'"'))* '"' ;
argDef : IDENTIFIER ('as' typeRef)?;
built: 'bool'|'byte'|'int'|'uint'|'long'|'ulong'|'char'|'string';
BINOP : '>' | '<' | '=' | '+' | '-';
UNOP : '!';
lit : BOOL|STR|CHAR|HEX|BITS|DEC;
WS : [ \t\r\n]+ -> skip;
COMMENT
    : '/*' .*? '*/'  -> skip
    ;


source: sourceItem* EOF;

sourceItem : funcDef;

funcDef : 'function' funcSignature statement* 'end' 'function';

funcSignature : IDENTIFIER '('  (argDef (',' argDef)*)? ')' ('as' typeRef)?;

typeRef
    : built #builtin
    | IDENTIFIER #custom
    | typeRef '(' (',')* ')' #array
    ;

statement
    : 'dim' (IDENTIFIER (',' IDENTIFIER)*)? 'as' typeRef #statementVar
    | 'if' expr 'then' statement* ('else' statement*)? 'end' 'if' #statementIf
    | 'while' expr statement* 'wend' #statementWhile
    | 'do' statement* 'loop' ('while'|'until') expr #statementDo
    | 'break' #statementBreak
    | expr ';' #exp
    ;

expr
    : expr BINOP expr #binary
    | UNOP expr #unari
    |'(' expr ')' #braces
    | expr '(' (expr (',' expr)*)? ')' #callOrIndexer
    | IDENTIFIER #place
    | lit #literal
    ;

grammar calc;

prog    :   stat+;

stat    : expr';'          #printExpression
        | ID '=' expr';'   #assignment
        |';'               #blank
        ;

expr    : expr op=('/'|'*'|'+'|'-') expr #mathematicalOperations
        | INT                            #integer
        | ID                             #identifier
        | '(' expr ')'                   #parenthesis
        ;

EQUAL : '=' ;
DIV : '/' ;
MUL : '*' ;
ADD : '+' ;
SUB : '-' ;
LPAREN : '(' ;
RPAREN : ')' ;

ID:[a-zA-Z]+;
INT: [0-9]+;


SL_COMMENT : '//'~[\r\n]* ->skip;

WS:      [ \t\r\n]->skip;






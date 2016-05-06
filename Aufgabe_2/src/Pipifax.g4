grammar Pipifax;

program
	: (var_decl | func_def )*
	;

var_decl
	: 'var' ID type
	;

func_def
	: 'func' ID '(' param_list ')' type? block
	;

type
	: 'int'
	| 'double'
	| 'string'
	| '[' INT ']' type
	;

param_list
	: (param (',' param)*)?
	;

param
	: ID param_type
	;

param_type
	: type
	| '*' type
	| '*' '[' ']' type
	;

block
	: '{' block_decl* '}'
	;

block_decl
	: statement
	| var_decl
	;

statement
	: if_stmt
	| while_stmt
	| assigment
	| func_stmt
	;

if_stmt
	: 'if' expr block ('else' block)?
	;

while_stmt
	: 'while' expr block
	;

assigment
	: lvalue '=' expr
	;

func_stmt
	: func_call
	;

func_call
	: ID '(' expr_list ')'
	;

expr_list
	: (expr (',' expr)* )?
	;

lvalue
	: ID
	| lvalue '[' expr ']'
	;

expr
	: INT
	| DOUBLE
	| STRING
	| lvalue
	| func_call
	| '(' expr ')'
	| '-' expr
	| '(' 'int' ')' expr
	| '(' 'double' ')' expr
	| expr '*' expr
	| expr '/' expr
	| expr '+' expr
	| expr '-' expr
	| expr '<' expr
	| expr '<=' expr
	| expr '>' expr
	| expr '>=' expr
	| expr '==' expr
	| expr '!=' expr
	| expr '&&' expr
	| expr '||' expr
	;

fragment D
	: [0-9]
	;

fragment N
	: D+
	;

fragment E
	: ('e'|'E') ('+'|'-')? N
	;

fragment L
	: [_A-Za-z]
	;

ID
	: L (D|L)*
	;

INT
	: N
	;

DOUBLE
	: N ('.' N)? E?
	;

STRING
	: '"' ~'"'*? '"'
	;

COMMENT
	: '#' ~[\r\n]* '\r'? '\n' -> skip
	;

WS
	: [ \t\n\r]+ -> skip
	;

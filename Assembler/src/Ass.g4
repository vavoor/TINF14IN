grammar Ass;

prog
  : line*
  ;

line
  : label instruction opt_comment
  | instruction opt_comment
  | label opt_comment
  | opt_comment
  ;
  
label
  : Label ':'
  ;
  
instruction
  : op3 reg ',' reg ',' reg
  ;

op3
  : 'ADD'
  | 'SUB'
  ;
  
reg
  : 'R1'
  | 'R2'
  | 'R3'
  ;
  
opt_comment
  : Comment? NL
  ;
  
fragment L
  : [A-Za-z_]
  ;
  
fragment D
  : [0-9]
  ;
  
Label
  : L (L|D)*
  ;
  
NL
  : '\r'? '\n'
  ;

Comment
  : ';' ~[\n]*
  ;
  
WS
  : [ \t] -> skip
  ;
grammar Pipifax;

program : Integer;

fragment
INT : [0-9]+ ;

Integer : INT ;

Double : INT ('.' INT)? ([eE] ('+'|'-')? INT)? ;

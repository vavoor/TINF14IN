grammar FSM;

fsm
  : 'start' Name stateDef*
  ;

stateDef
  : 'state' Name ':' ('do' Name)? transition*
  ;

transition
  : 'on' Name 'goto' Name
  ;

Name
  : [A-Za-z0-9_]+
  ;

WS
  : [ \n\r\t]+ -> skip
  ;

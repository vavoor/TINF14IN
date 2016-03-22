/**
 * This is the base class to implement the parser methods of the
 * recursive descent parser.
 */

import java.io.IOException;

abstract class FSMParser {
    private TokenStream inp;
    private Token la;

    private FSM pAutomat() throws IllegalInputException, IOException {
        String startState = pStartZustand();
        FSM fsm = new FSM(startState);
        while (la.type()==Token.TOKEN.STATE) {
            State state = pZustand();
            fsm.addState(state);
        }
        return fsm;
    }

    private String pStartZustand() throws IllegalInputException, IOException {
        match(Token.TOKEN.START);
        Token id = la;
        match(Token.TOKEN.ID);
        return id.value();
    }

    private State pZustand() throws IllegalInputException, IOException {
        match(Token.TOKEN.STATE);
        Token id = la;
        match(Token.TOKEN.ID);
        State state = new State(id.value());
        match(Token.TOKEN.COLON);
        if (la.type()==Token.TOKEN.DO) {
            String a = pAktion();
            state.addAction(a);
        }
        while (la.type()==Token.TOKEN.ON) {
            Transition t = pTransition();
            state.addTransition(t);
        }
        return state;
    }

    private String pAktion() throws IllegalInputException, IOException {
        match(Token.TOKEN.DO);
        Token action = la;
        match(Token.TOKEN.ID);
        return action.value();
    }

    private Transition pTransition() throws IllegalInputException, IOException {
        match(Token.TOKEN.ON);
        Token id = la;
        match(Token.TOKEN.ID);
        match(Token.TOKEN.GOTO);
        Token destination = la;
        match(Token.TOKEN.ID);
        return new Transition(id.value(),destination.value());
    }

    private void match(Token.TOKEN expected) throws IllegalInputException, IOException {
        if (la.type()!=expected) {
            throw new IllegalInputException("'"+expected+"' expected",la.line());
        }
        la = inp.nextToken();
    }

    protected FSM parse() throws IllegalInputException, IOException {
        la = inp.nextToken();
        FSM fsm = pAutomat();
        return fsm;
    }

    FSMParser(TokenStream input) {
        inp = input;
    }
}

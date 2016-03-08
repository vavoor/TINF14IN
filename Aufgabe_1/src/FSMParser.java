/**
 * This is the base class to implement the parser methods of the
 * recursive descent parser.
 */

import java.io.IOException;

abstract class FSMParser {
	private TokenStream inp;
	private Token la;

	private void pAutomat() throws IllegalInputException, IOException {
		pStartZustand();
		while (la.type()==Token.TOKEN.STATE) {
			pZustand();
		}
	}

	private void pStartZustand() throws IllegalInputException, IOException {
		match(Token.TOKEN.START);
		match(Token.TOKEN.ID);
	}

	private void pZustand() throws IllegalInputException, IOException {
		match(Token.TOKEN.STATE);
		match(Token.TOKEN.ID);
		match(Token.TOKEN.COLON);
		if (la.type()==Token.TOKEN.DO) {
			pAktion();
		}
		while (la.type()==Token.TOKEN.ON) {
			pTransition();
		}
	}

	private void pAktion() throws IllegalInputException, IOException {
		match(Token.TOKEN.DO);
		match(Token.TOKEN.ID);
	}

	private void pTransition() throws IllegalInputException, IOException {
		match(Token.TOKEN.ON);
		match(Token.TOKEN.ID);
		match(Token.TOKEN.GOTO);
		match(Token.TOKEN.ID);
	}

	private void match(Token.TOKEN expected) throws IllegalInputException, IOException {
		if (la.type()!=expected) {
			throw new IllegalInputException("'"+expected+"' expected",la.line());
		}
		la = inp.nextToken();
	}

	void parse() throws IllegalInputException, IOException {
		la = inp.nextToken();
		pAutomat();
	}

	FSMParser(TokenStream input) {
		inp = input;
	}
}

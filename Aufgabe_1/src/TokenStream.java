import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.IOException;

/**
 * Implementation of the scanner for the FSM Generator
 */
public class TokenStream {

    private LineNumberReader input;
    private int lookahead = -1;

    /**
     * Starts the scanner.
     *
     * Use ist as
     * TokenStream ts = new TokenStream(FileInputStream(filename));
     * Then call nextToken() until you receive the EOF token.
     */
    public TokenStream(InputStream input) {
        this.input = new LineNumberReader(new InputStreamReader(input));

    }

    /**
     * Returns the next token from the TokenStream.
     */
    public Token nextToken()
    throws IllegalInputException, IOException {
        skipSpaces();
        int line = input.getLineNumber()+1;
        if (lookahead==-1) {
            input.close();
            return new Token(Token.TOKEN.EOF,"",line);
        }
        else if (lookahead==':') {
            lookahead = input.read();
            return new Token(Token.TOKEN.COLON,":",line);
        }
        else if (Character.isJavaIdentifierStart(lookahead)) {
            StringBuffer value = new StringBuffer();
            while (Character.isJavaIdentifierPart(lookahead)) {
                value.append((char)lookahead);
                lookahead = input.read();
            }
            String asStr = value.toString();
            Token.TOKEN token;
            if (asStr.compareTo("start")==0) {
                token = Token.TOKEN.START;
            }
            else if (asStr.compareTo("state")==0) {
                token = Token.TOKEN.STATE;
            }
            else if (asStr.compareTo("do")==0) {
                token = Token.TOKEN.DO;
            }
            else if (asStr.compareTo("on")==0) {
                token = Token.TOKEN.ON;
            }
            else if (asStr.compareTo("goto")==0) {
                token = Token.TOKEN.GOTO;
            }
            else  {
                token = Token.TOKEN.ID;
            }
            return new Token(token,asStr,line);
        }
        else {
            throw new IllegalInputException("Illegal character '"+(char)lookahead+"'",line);
        }
    }

    private void skipSpaces() throws IOException {
        if (lookahead==-1) {
            lookahead = input.read();
        }
        while (Character.isWhitespace(lookahead)) {
            lookahead = input.read();
        }
    }
}

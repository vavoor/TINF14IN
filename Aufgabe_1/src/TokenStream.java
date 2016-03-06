import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.EOFException;
import java.io.IOException;

public class TokenStream {

  private LineNumberReader input;
  private int lookahead = -1;

  public TokenStream(InputStream input) {
    this.input = new LineNumberReader(new InputStreamReader(input));

  }

  public Token nextToken()
  throws IllegalInputException, EOFException, IOException {
    skipSpaces();
    int line = input.getLineNumber();
    if (lookahead==-1) {
      throw new EOFException();
    }
    else if (lookahead==':') {
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
      throw new IllegalInputException("Illegal character "+(char)lookahead,line);
    }
  }

  private void skipSpaces() throws IOException {
    if (lookahead==-1) {
      lookahead = input.read();
    }
    while (Character.isSpaceChar(lookahead)) {
      lookahead = input.read();
    }
  }
}

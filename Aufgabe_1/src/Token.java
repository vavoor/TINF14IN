public class Token {
  public enum TOKEN {ID, START, STATE, DO, ON, GOTO, COLON }

  private TOKEN type;
  private int line;
  private String val;

  Token(TOKEN type, String value, int line) {
    this.type = type;
    this.val = value;
    this.line = line;
  }

  public String value() {
    return val;
  }

  public int line() {
    return line;
  }
}

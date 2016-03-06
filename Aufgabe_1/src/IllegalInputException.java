public class IllegalInputException extends Exception {

  int lineNumber;

  public IllegalInputException(String msg) {
    super(msg);
  }

  public IllegalInputException(String msg, int lineNumber) {
    super(msg);
    this.lineNumber = lineNumber;
  }
}

public class IllegalInputException extends Exception {

  private String filename;
  int lineNumber;

  public IllegalInputException(String msg) {
    super(msg);
  }

  public IllegalInputException(String msg, String filename, int lineNumber) {
    super(msg);
    this.filename = filename;
    this.lineNumber = lineNumber;
  }
}

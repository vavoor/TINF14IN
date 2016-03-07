/**
 * A token read from a TokenStream.
 */
public class Token {
    public enum TOKEN {EOF, ID, START, STATE, DO, ON, GOTO, COLON }
    
    private TOKEN type;
    private int line;
    private String val;
    
    Token(TOKEN type, String value, int line) {
        this.type = type;
        this.val = value;
        this.line = line;
    }
    
    /**
     * Returns the string representation of the token
     */
    public String value() {
        return val;
    }
    
    /**
     * Returns the token type (EOF, ID, START, ...) 
     */
    public TOKEN type() {
        return type;
    }
    
    /**
     * Returns the line number where the token has been found
     */
    public int line() {
        return line;
    }
    
    /**
     * Returns a string representation of the Token object for debugging purposes
     */
    public String toString() {
        return "TOKEN("+type+"):"+line+":"+val;
    }
}

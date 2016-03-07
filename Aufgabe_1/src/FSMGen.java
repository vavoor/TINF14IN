import java.io.FileInputStream;

public class FSMGen extends FSMParser {
    public static void main(String[] args) {
        try {
            TokenStream inp = new TokenStream(new FileInputStream(args[0]));
            // run parser
            // run the semantic checks
            // generate the output
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}

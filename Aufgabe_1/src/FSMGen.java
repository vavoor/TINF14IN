import java.io.FileInputStream;

public class FSMGen extends FSMParser {
	FSMGen(TokenStream inp) {
		super(inp);
	}

    public static void main(String[] args) {
        try {
            TokenStream inp = new TokenStream(new FileInputStream(args[0]));
            FSMGen gen = new FSMGen(inp);
            gen.parse();
            // run the semantic checks
            // generate the output
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}

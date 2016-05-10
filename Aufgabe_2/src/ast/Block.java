package ast;
import java.util.ArrayList;

public class Block extends AST {
	private ArrayList<AST> entries = new ArrayList<>();

	public void add(AST node) {
		entries.add(node);
	}
}

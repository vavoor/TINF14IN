package ast;

public class VarDeclaration extends AST {
	private String name;
	private Type type;

	public VarDeclaration(String name, Type type) {
		this.name = name;
		this.type = type;
	}

	public String name() {
		return this.name;
	};
}

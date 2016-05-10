package ast;
import java.util.LinkedHashMap;

public class FuncDefinition extends AST {
	private String name;
	private Type type;
	private LinkedHashMap<String,VarDeclaration> parameters = new LinkedHashMap<>();

	public FuncDefinition(String name, Type type) {
		this.name = name;
		this.type = type;
	}

	public void addParameter(VarDeclaration d) {
		if (parameters.containsKey(d.name())) {
			// @todo error handling
		}
		else {
			parameters.put(d.name(),d);
		}
	}

	public String name() {
		return this.name;
	}
}

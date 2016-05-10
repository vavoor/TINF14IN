package ast;

import java.util.LinkedHashMap;

public class Program extends AST {
	private LinkedHashMap<String,VarDeclaration> variables = new LinkedHashMap<>();
	private LinkedHashMap<String,FuncDefinition> functions = new LinkedHashMap<>();

	public void addGlobalVariable(VarDeclaration decl) {
		if (variables.containsKey(decl.name())) {
			// @todo error handling
		}
		else {
			variables.put(decl.name(),decl);
		}
	}

	public void addFunction(FuncDefinition def) {
		if (functions.containsKey(def.name())) {
			// @todo error handling
		}
		else {
			functions.put(def.name(),def);
		}
	}
}

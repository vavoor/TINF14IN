package ast;

public class ReferenceType extends Type {
	private Type baseType;

	public ReferenceType(Type type) {
		baseType = type;
	}
}

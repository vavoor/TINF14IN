package ast;

public class VoidType extends Type {
	private static Type instance = new VoidType();

	public static Type instance() {
		return VoidType.instance;
	}

	private VoidType() {
	}
}

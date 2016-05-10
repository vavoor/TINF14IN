package ast;

public class IntType extends Type {
	private static Type instance = new IntType();

	public static Type instance() {
		return IntType.instance;
	}

	private IntType() {
	}
}
package ast;

public class DoubleType extends Type {
	private static Type instance = new DoubleType();

	public static Type instance() {
		return DoubleType.instance;
	}

	private DoubleType() {
	}
}

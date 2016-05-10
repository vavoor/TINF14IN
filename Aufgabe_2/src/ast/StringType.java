package ast;

public class StringType extends Type {
	private static Type instance = new StringType();

	public static Type instance() {
		return StringType.instance;
	}

	private StringType() {
	}
}
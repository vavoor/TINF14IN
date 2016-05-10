package ast;

public class ArrayType extends Type {
	private Type baseType;
	private int length; // length==0 is an array of unknown size

	public ArrayType(int length, Type type) {
		if (length<=0) {
			// @todo error handling
		}
		baseType = type;
		this.length = length;
	}

	// Creates an array of unknown size
	public ArrayType(Type type) {
		length = 0;
		baseType = type;
	}
}

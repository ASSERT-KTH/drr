

package com.google.javascript.rhino.jstype;


public enum BooleanLiteralSet {
EMPTY, TRUE, FALSE, BOTH;
	private com.google.javascript.rhino.jstype.BooleanLiteralSet fromOrdinal(int ordinal) {
		switch (ordinal) {
			case 0 :
				return com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
			case 1 :
				return com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
			case 2 :
				return com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
			case 3 :
				return com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
			default :
				throw new java.lang.IllegalArgumentException(("Ordinal: " + ordinal));
		}
	}

	public com.google.javascript.rhino.jstype.BooleanLiteralSet intersection(com.google.javascript.rhino.jstype.BooleanLiteralSet that) {
		return fromOrdinal(((com.google.javascript.rhino.jstype.BooleanLiteralSet.this.ordinal()) & (that.ordinal())));
	}

	public com.google.javascript.rhino.jstype.BooleanLiteralSet union(com.google.javascript.rhino.jstype.BooleanLiteralSet that) {
		return fromOrdinal(((com.google.javascript.rhino.jstype.BooleanLiteralSet.this.ordinal()) | (that.ordinal())));
	}

	public boolean contains(boolean literalValue) {
		switch (com.google.javascript.rhino.jstype.BooleanLiteralSet.this.ordinal()) {
			case 0 :
				return false;
			case 1 :
				return literalValue;
			case 2 :
				return !literalValue;
			case 3 :
				return true;
			default :
				throw new java.lang.IndexOutOfBoundsException(("Ordinal: " + (com.google.javascript.rhino.jstype.BooleanLiteralSet.this.ordinal())));
		}
	}

	public static com.google.javascript.rhino.jstype.BooleanLiteralSet get(boolean literalValue) {
		return literalValue ? com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE : com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
	}
}


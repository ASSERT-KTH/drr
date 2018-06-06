

package com.google.javascript.rhino;


public final class UniqueTag implements java.io.Serializable {
	static final long serialVersionUID = -4320556826714577259L;

	private static final int ID_NOT_FOUND = 1;

	private static final int ID_NULL_VALUE = 2;

	private static final int ID_DOUBLE_MARK = 3;

	public static final com.google.javascript.rhino.UniqueTag NOT_FOUND = new com.google.javascript.rhino.UniqueTag(com.google.javascript.rhino.UniqueTag.ID_NOT_FOUND);

	public static final com.google.javascript.rhino.UniqueTag NULL_VALUE = new com.google.javascript.rhino.UniqueTag(com.google.javascript.rhino.UniqueTag.ID_NULL_VALUE);

	public static final com.google.javascript.rhino.UniqueTag DOUBLE_MARK = new com.google.javascript.rhino.UniqueTag(com.google.javascript.rhino.UniqueTag.ID_DOUBLE_MARK);

	private final int tagId;

	private UniqueTag(int tagId) {
		this.tagId = tagId;
	}

	public java.lang.Object readResolve() {
		switch (tagId) {
			case com.google.javascript.rhino.UniqueTag.ID_NOT_FOUND :
				return com.google.javascript.rhino.UniqueTag.NOT_FOUND;
			case com.google.javascript.rhino.UniqueTag.ID_NULL_VALUE :
				return com.google.javascript.rhino.UniqueTag.NULL_VALUE;
			case com.google.javascript.rhino.UniqueTag.ID_DOUBLE_MARK :
				return com.google.javascript.rhino.UniqueTag.DOUBLE_MARK;
		}
		throw new java.lang.IllegalStateException(java.lang.String.valueOf(tagId));
	}

	@java.lang.Override
	public java.lang.String toString() {
		java.lang.String name;
		switch (tagId) {
			case com.google.javascript.rhino.UniqueTag.ID_NOT_FOUND :
				name = "NOT_FOUND";
				break;
			case com.google.javascript.rhino.UniqueTag.ID_NULL_VALUE :
				name = "NULL_VALUE";
				break;
			case com.google.javascript.rhino.UniqueTag.ID_DOUBLE_MARK :
				name = "DOUBLE_MARK";
				break;
			default :
				throw com.google.javascript.rhino.Kit.codeBug();
		}
		return ((super.toString()) + ": ") + name;
	}
}


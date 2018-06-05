

package com.google.javascript.rhino.jstype;


final class IndexedType extends com.google.javascript.rhino.jstype.ProxyObjectType {
	private static final long serialVersionUID = 1L;

	final com.google.javascript.rhino.jstype.JSType indexType;

	IndexedType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, com.google.javascript.rhino.jstype.ObjectType objectType, com.google.javascript.rhino.jstype.JSType indexType) {
		super(registry, objectType);
		this.indexType = indexType;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getIndexType() {
		return indexType;
	}
}


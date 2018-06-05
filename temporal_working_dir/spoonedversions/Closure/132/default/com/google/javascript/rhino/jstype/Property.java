

package com.google.javascript.rhino.jstype;


public final class Property implements com.google.javascript.rhino.jstype.StaticReference<com.google.javascript.rhino.jstype.JSType> , com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> , java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private final java.lang.String name;

	private com.google.javascript.rhino.jstype.JSType type;

	private final boolean inferred;

	private com.google.javascript.rhino.Node propertyNode;

	private com.google.javascript.rhino.JSDocInfo docInfo = null;

	Property(java.lang.String name, com.google.javascript.rhino.jstype.JSType type, boolean inferred, com.google.javascript.rhino.Node propertyNode) {
		this.name = name;
		com.google.javascript.rhino.jstype.Property.this.type = type;
		this.inferred = inferred;
		com.google.javascript.rhino.jstype.Property.this.propertyNode = propertyNode;
	}

	@java.lang.Override
	public java.lang.String getName() {
		return name;
	}

	@java.lang.Override
	public com.google.javascript.rhino.Node getNode() {
		return propertyNode;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.StaticSourceFile getSourceFile() {
		return (propertyNode) == null ? null : propertyNode.getStaticSourceFile();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.Property getSymbol() {
		return com.google.javascript.rhino.jstype.Property.this;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.Property getDeclaration() {
		return (propertyNode) == null ? null : com.google.javascript.rhino.jstype.Property.this;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getType() {
		return type;
	}

	@java.lang.Override
	public boolean isTypeInferred() {
		return inferred;
	}

	boolean isFromExterns() {
		return (propertyNode) == null ? false : propertyNode.isFromExterns();
	}

	void setType(com.google.javascript.rhino.jstype.JSType type) {
		com.google.javascript.rhino.jstype.Property.this.type = type;
	}

	@java.lang.Override
	public com.google.javascript.rhino.JSDocInfo getJSDocInfo() {
		return com.google.javascript.rhino.jstype.Property.this.docInfo;
	}

	void setJSDocInfo(com.google.javascript.rhino.JSDocInfo info) {
		com.google.javascript.rhino.jstype.Property.this.docInfo = info;
	}

	public void setNode(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.jstype.Property.this.propertyNode = n;
	}
}


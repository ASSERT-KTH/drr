

package com.google.javascript.rhino;


public final class JSTypeExpression implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private final com.google.javascript.rhino.Node root;

	private final java.lang.String sourceName;

	public JSTypeExpression(com.google.javascript.rhino.Node root, java.lang.String sourceName) {
		this.root = root;
		this.sourceName = sourceName;
	}

	public static com.google.javascript.rhino.JSTypeExpression makeOptionalArg(com.google.javascript.rhino.JSTypeExpression expr) {
		if ((expr.isOptionalArg()) || (expr.isVarArgs())) {
			return expr;
		}else {
			return new com.google.javascript.rhino.JSTypeExpression(new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EQUALS, expr.root), expr.sourceName);
		}
	}

	public boolean isOptionalArg() {
		return (root.getType()) == (com.google.javascript.rhino.Token.EQUALS);
	}

	public boolean isVarArgs() {
		return (root.getType()) == (com.google.javascript.rhino.Token.ELLIPSIS);
	}

	public com.google.javascript.rhino.jstype.JSType evaluate(com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope, com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
		return registry.createFromTypeNodes(root, sourceName, scope);
	}

	@java.lang.Override
	public boolean equals(java.lang.Object other) {
		return (other instanceof com.google.javascript.rhino.JSTypeExpression) && (((com.google.javascript.rhino.JSTypeExpression) (other)).root.isEquivalentTo(root));
	}

	@java.lang.Override
	public int hashCode() {
		return root.toStringTree().hashCode();
	}

	com.google.javascript.rhino.Node getRoot() {
		return root;
	}
}




package com.google.javascript.rhino.jstype;


class UnresolvedTypeExpression extends com.google.javascript.rhino.jstype.UnknownType {
	private static final long serialVersionUID = 1L;

	private final com.google.javascript.rhino.Node typeExpr;

	private final java.lang.String sourceName;

	private boolean forgiving = false;

	UnresolvedTypeExpression(com.google.javascript.rhino.jstype.JSTypeRegistry registry, com.google.javascript.rhino.Node typeExpr, java.lang.String sourceName, boolean forgiving) {
		super(registry, false);
		com.google.common.base.Preconditions.checkNotNull(typeExpr);
		this.typeExpr = typeExpr;
		this.sourceName = sourceName;
		com.google.javascript.rhino.jstype.UnresolvedTypeExpression.this.forgiving = forgiving;
	}

	@java.lang.Override
	com.google.javascript.rhino.jstype.JSType resolveInternal(com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> enclosing) {
		return registry.createFromTypeNodes(typeExpr, sourceName, enclosing, forgiving);
	}
}




package com.google.javascript.jscomp;


class MemoizedScopeCreator implements com.google.javascript.jscomp.ScopeCreator {
	private final java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope> scopes = com.google.common.collect.Maps.newHashMap();

	private final com.google.javascript.jscomp.ScopeCreator delegate;

	MemoizedScopeCreator(com.google.javascript.jscomp.ScopeCreator delegate) {
		this.delegate = delegate;
	}

	@java.lang.Override
	public com.google.javascript.jscomp.Scope createScope(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.Scope parent) {
		com.google.javascript.jscomp.Scope scope = scopes.get(n);
		if (scope == null) {
			scope = delegate.createScope(n, parent);
			scopes.put(n, scope);
		}else {
			com.google.common.base.Preconditions.checkState((parent == (scope.getParent())));
		}
		return scope;
	}

	public com.google.javascript.jscomp.Scope getScopeIfMemoized(com.google.javascript.rhino.Node n) {
		return scopes.get(n);
	}
}


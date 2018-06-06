

package com.google.javascript.jscomp;


class MemoizedScopeCreator implements com.google.javascript.jscomp.ScopeCreator , com.google.javascript.rhino.jstype.StaticSymbolTable<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.Scope.Var> {
	private final java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope> scopes = com.google.common.collect.Maps.newHashMap();

	private final com.google.javascript.jscomp.ScopeCreator delegate;

	MemoizedScopeCreator(com.google.javascript.jscomp.ScopeCreator delegate) {
		this.delegate = delegate;
	}

	@java.lang.Override
	public java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> getReferences(com.google.javascript.jscomp.Scope.Var var) {
		return com.google.common.collect.ImmutableList.of(var);
	}

	@java.lang.Override
	public com.google.javascript.jscomp.Scope getScope(com.google.javascript.jscomp.Scope.Var var) {
		return var.scope;
	}

	@java.lang.Override
	public java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> getAllSymbols() {
		java.util.List<com.google.javascript.jscomp.Scope.Var> vars = com.google.common.collect.Lists.newArrayList();
		for (com.google.javascript.jscomp.Scope s : scopes.values()) {
			com.google.common.collect.Iterables.addAll(vars, s.getAllSymbols());
		}
		return vars;
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

	java.util.Collection<com.google.javascript.jscomp.Scope> getAllMemoizedScopes() {
		return java.util.Collections.unmodifiableCollection(scopes.values());
	}

	com.google.javascript.jscomp.Scope getScopeIfMemoized(com.google.javascript.rhino.Node n) {
		return scopes.get(n);
	}

	void removeScopesForScript(java.lang.String scriptName) {
		for (com.google.javascript.rhino.Node scopeRoot : com.google.common.collect.ImmutableSet.copyOf(scopes.keySet())) {
			if (scriptName.equals(scopeRoot.getSourceFileName())) {
				scopes.remove(scopeRoot);
			}
		}
	}
}


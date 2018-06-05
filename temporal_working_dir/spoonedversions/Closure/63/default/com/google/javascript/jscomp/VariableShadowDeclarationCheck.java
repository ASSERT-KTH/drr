

package com.google.javascript.jscomp;


class VariableShadowDeclarationCheck implements com.google.javascript.jscomp.CompilerPass {
	static final com.google.javascript.jscomp.DiagnosticType SHADOW_VAR_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_REDECL_NOSHADOW_VARIABLE", ("Highly error prone shadowing of variable name {0}." + "Consider using a different local variable name."));

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.CheckLevel checkLevel;

	private final java.util.Set<java.lang.String> externalNoShadowVariableNames;

	VariableShadowDeclarationCheck(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.CheckLevel checkLevel) {
		this.compiler = compiler;
		this.checkLevel = checkLevel;
		this.externalNoShadowVariableNames = com.google.common.collect.Sets.newHashSet();
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, externs, new com.google.javascript.jscomp.VariableShadowDeclarationCheck.NoShadowAnnotationGatheringCallback());
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.VariableShadowDeclarationCheck.ShadowDeclarationCheckingCallback());
	}

	private class NoShadowAnnotationGatheringCallback implements com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
		@java.lang.Override
		public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
			com.google.javascript.jscomp.Scope scope = t.getScope();
			for (java.util.Iterator<com.google.javascript.jscomp.Scope.Var> vars = scope.getVars(); vars.hasNext();) {
				com.google.javascript.jscomp.Scope.Var var = vars.next();
				if (var.isNoShadow()) {
					externalNoShadowVariableNames.add(var.getName());
				}
			}
		}

		@java.lang.Override
		public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
		}

		@java.lang.Override
		public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal nodeTraversal, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			return true;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		}
	}

	private class ShadowDeclarationCheckingCallback implements com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
		@java.lang.Override
		public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
			if (t.inGlobalScope()) {
				return ;
			}
			com.google.javascript.jscomp.Scope scope = t.getScope();
			com.google.javascript.jscomp.Scope parentScope = scope.getParent();
			for (java.util.Iterator<com.google.javascript.jscomp.Scope.Var> vars = scope.getVars(); vars.hasNext();) {
				com.google.javascript.jscomp.Scope.Var var = vars.next();
				if (externalNoShadowVariableNames.contains(var.getName())) {
					compiler.report(t.makeError(var.nameNode, checkLevel, com.google.javascript.jscomp.VariableShadowDeclarationCheck.SHADOW_VAR_ERROR, var.getName()));
					continue;
				}
				com.google.javascript.jscomp.Scope.Var shadowedVar = parentScope.getVar(var.getName());
				if ((shadowedVar != null) && ((shadowedVar.isNoShadow()) || (shadowedVar.isLocal()))) {
					compiler.report(t.makeError(var.nameNode, checkLevel, com.google.javascript.jscomp.VariableShadowDeclarationCheck.SHADOW_VAR_ERROR, var.getName()));
					continue;
				}
			}
		}

		@java.lang.Override
		public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
		}

		@java.lang.Override
		public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal nodeTraversal, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			return true;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		}
	}
}


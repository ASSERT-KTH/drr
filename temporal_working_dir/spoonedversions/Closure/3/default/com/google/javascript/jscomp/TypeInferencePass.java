

package com.google.javascript.jscomp;


class TypeInferencePass implements com.google.javascript.jscomp.CompilerPass {
	static final com.google.javascript.jscomp.DiagnosticType DATAFLOW_ERROR = com.google.javascript.jscomp.DiagnosticType.warning("JSC_INTERNAL_ERROR_DATAFLOW", "non-monotonic data-flow analysis");

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseInterpreter;

	private com.google.javascript.jscomp.Scope topScope;

	private com.google.javascript.jscomp.MemoizedScopeCreator scopeCreator;

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionsMap;

	TypeInferencePass(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseInterpreter, com.google.javascript.jscomp.Scope topScope, com.google.javascript.jscomp.MemoizedScopeCreator scopeCreator) {
		this.compiler = compiler;
		this.reverseInterpreter = reverseInterpreter;
		com.google.javascript.jscomp.TypeInferencePass.this.topScope = topScope;
		com.google.javascript.jscomp.TypeInferencePass.this.scopeCreator = scopeCreator;
		assertionFunctionsMap = com.google.common.collect.Maps.newHashMap();
		for (com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFucntion : compiler.getCodingConvention().getAssertionFunctions()) {
			assertionFunctionsMap.put(assertionFucntion.getFunctionName(), assertionFucntion);
		}
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externsRoot, com.google.javascript.rhino.Node jsRoot) {
		com.google.javascript.rhino.Node externsAndJs = jsRoot.getParent();
		com.google.common.base.Preconditions.checkState((externsAndJs != null));
		com.google.common.base.Preconditions.checkState(((externsRoot == null) || (externsAndJs.hasChild(externsRoot))));
		inferAllScopes(externsAndJs);
	}

	void inferAllScopes(com.google.javascript.rhino.Node node) {
		new com.google.javascript.jscomp.NodeTraversal(compiler, new com.google.javascript.jscomp.TypeInferencePass.FirstScopeBuildingCallback(), scopeCreator).traverseWithScope(node, topScope);
		new com.google.javascript.jscomp.NodeTraversal(compiler, new com.google.javascript.jscomp.TypeInferencePass.SecondScopeBuildingCallback(), scopeCreator).traverseWithScope(node, topScope);
	}

	void inferScope(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.Scope scope) {
		com.google.javascript.jscomp.TypeInference typeInference = new com.google.javascript.jscomp.TypeInference(compiler, computeCfg(n), reverseInterpreter, scope, assertionFunctionsMap);
		try {
			typeInference.analyze();
			compiler.getTypeRegistry().resolveTypesInScope(scope);
		} catch (com.google.javascript.jscomp.DataFlowAnalysis.MaxIterationsExceededException e) {
			compiler.report(com.google.javascript.jscomp.JSError.make(n.getSourceFileName(), n, com.google.javascript.jscomp.TypeInferencePass.DATAFLOW_ERROR));
		}
	}

	private class FirstScopeBuildingCallback extends com.google.javascript.jscomp.NodeTraversal.AbstractScopedCallback {
		@java.lang.Override
		public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
			t.getScope();
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		}
	}

	private class SecondScopeBuildingCallback extends com.google.javascript.jscomp.NodeTraversal.AbstractScopedCallback {
		@java.lang.Override
		public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
			inferScope(t.getCurrentNode(), t.getScope());
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		}
	}

	private com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> computeCfg(com.google.javascript.rhino.Node n) {
		com.google.javascript.jscomp.ControlFlowAnalysis cfa = new com.google.javascript.jscomp.ControlFlowAnalysis(compiler, false, false);
		cfa.process(null, n);
		return cfa.getCfg();
	}
}


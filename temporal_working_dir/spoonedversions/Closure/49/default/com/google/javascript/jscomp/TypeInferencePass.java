

package com.google.javascript.jscomp;


class TypeInferencePass implements com.google.javascript.jscomp.CompilerPass {
	static final com.google.javascript.jscomp.DiagnosticType DATAFLOW_ERROR = com.google.javascript.jscomp.DiagnosticType.warning("JSC_INTERNAL_ERROR_DATAFLOW", "non-monotonic data-flow analysis");

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.ReverseAbstractInterpreter reverseInterpreter;

	private com.google.javascript.jscomp.Scope topScope;

	private com.google.javascript.jscomp.ScopeCreator scopeCreator;

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionsMap;

	private final com.google.common.collect.Multimap<com.google.javascript.jscomp.Scope, com.google.javascript.jscomp.Scope.Var> escapedLocalVars = com.google.common.collect.HashMultimap.create();

	TypeInferencePass(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.ReverseAbstractInterpreter reverseInterpreter, com.google.javascript.jscomp.Scope topScope, com.google.javascript.jscomp.ScopeCreator scopeCreator) {
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
		inferTypes(externsAndJs);
	}

	void inferTypes(com.google.javascript.rhino.Node node) {
		com.google.javascript.jscomp.NodeTraversal inferTypes = new com.google.javascript.jscomp.NodeTraversal(compiler, new com.google.javascript.jscomp.TypeInferencePass.TypeInferringCallback(), scopeCreator);
		inferTypes.traverseWithScope(node, topScope);
	}

	private java.util.Collection<com.google.javascript.jscomp.Scope.Var> getUnflowableVars(com.google.javascript.jscomp.Scope scope) {
		java.util.List<com.google.javascript.jscomp.Scope.Var> vars = com.google.common.collect.Lists.newArrayList();
		for (com.google.javascript.jscomp.Scope current = scope; current.isLocal(); current = current.getParent()) {
			vars.addAll(escapedLocalVars.get(current));
		}
		return vars;
	}

	void inferTypes(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.jscomp.Scope scope) {
		com.google.javascript.jscomp.TypeInference typeInference = new com.google.javascript.jscomp.TypeInference(compiler, computeCfg(n), reverseInterpreter, scope, assertionFunctionsMap);
		try {
			typeInference.analyze();
			compiler.getTypeRegistry().resolveTypesInScope(scope);
		} catch (com.google.javascript.jscomp.DataFlowAnalysis.MaxIterationsExceededException e) {
			compiler.report(t.makeError(n, com.google.javascript.jscomp.TypeInferencePass.DATAFLOW_ERROR));
		}
	}

	private class TypeInferringCallback implements com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
		@java.lang.Override
		public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
			com.google.javascript.jscomp.Scope scope = t.getScope();
			com.google.javascript.rhino.Node node = t.getCurrentNode();
			if (scope.isGlobal()) {
				inferTypes(t, node, scope);
			}
		}

		@java.lang.Override
		public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
			com.google.javascript.jscomp.Scope scope = t.getScope();
			com.google.javascript.rhino.Node node = t.getCurrentNode();
			if (scope.isLocal()) {
				inferTypes(t, node, scope);
			}
		}

		@java.lang.Override
		public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			return true;
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


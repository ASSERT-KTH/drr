

package com.google.javascript.jscomp;


public abstract class PassConfig {
	final com.google.javascript.jscomp.CompilerOptions options;

	com.google.javascript.jscomp.MemoizedScopeCreator typedScopeCreator;

	com.google.javascript.jscomp.Scope topScope = null;

	public PassConfig(com.google.javascript.jscomp.CompilerOptions options) {
		this.options = options;
	}

	void regenerateGlobalTypedScope(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.rhino.Node root) {
		typedScopeCreator = new com.google.javascript.jscomp.MemoizedScopeCreator(new com.google.javascript.jscomp.TypedScopeCreator(compiler));
		topScope = typedScopeCreator.createScope(root, null);
	}

	com.google.javascript.jscomp.ScopeCreator getScopeCreator() {
		return typedScopeCreator;
	}

	com.google.javascript.jscomp.Scope getTopScope() {
		return topScope;
	}

	protected abstract java.util.List<com.google.javascript.jscomp.PassFactory> getChecks();

	protected abstract java.util.List<com.google.javascript.jscomp.PassFactory> getOptimizations();

	com.google.javascript.jscomp.graph.GraphvizGraph getPassGraph() {
		com.google.javascript.jscomp.graph.LinkedDirectedGraph<java.lang.String, java.lang.String> graph = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
		java.lang.Iterable<com.google.javascript.jscomp.PassFactory> allPasses = com.google.common.collect.Iterables.concat(getChecks(), getOptimizations());
		java.lang.String lastPass = null;
		java.lang.String loopStart = null;
		for (com.google.javascript.jscomp.PassFactory pass : allPasses) {
			java.lang.String passName = pass.getName();
			int i = 1;
			while (graph.hasNode(passName)) {
				passName = (pass.getName()) + (i++);
			} 
			graph.createNode(passName);
			if ((loopStart == null) && (!(pass.isOneTimePass()))) {
				loopStart = passName;
			}else
				if ((loopStart != null) && (pass.isOneTimePass())) {
					graph.connect(lastPass, "loop", loopStart);
					loopStart = null;
				}
			
			if (lastPass != null) {
				graph.connect(lastPass, "", passName);
			}
			lastPass = passName;
		}
		return graph;
	}

	final com.google.javascript.jscomp.TypeInferencePass makeTypeInference(com.google.javascript.jscomp.AbstractCompiler compiler) {
		return new com.google.javascript.jscomp.TypeInferencePass(compiler, compiler.getReverseAbstractInterpreter(), topScope, typedScopeCreator);
	}

	final com.google.javascript.jscomp.TypeCheck makeTypeCheck(com.google.javascript.jscomp.AbstractCompiler compiler) {
		return new com.google.javascript.jscomp.TypeCheck(compiler, compiler.getReverseAbstractInterpreter(), compiler.getTypeRegistry(), topScope, typedScopeCreator, options.reportMissingOverride, options.reportUnknownTypes).reportMissingProperties(options.enables(com.google.javascript.jscomp.DiagnosticGroup.forType(com.google.javascript.jscomp.TypeCheck.INEXISTENT_PROPERTY)));
	}

	static final void addPassFactoryBefore(java.util.List<com.google.javascript.jscomp.PassFactory> factoryList, com.google.javascript.jscomp.PassFactory factory, java.lang.String passName) {
		factoryList.add(com.google.javascript.jscomp.PassConfig.findPassIndexByName(factoryList, passName), factory);
	}

	static final void replacePassFactory(java.util.List<com.google.javascript.jscomp.PassFactory> factoryList, com.google.javascript.jscomp.PassFactory factory) {
		factoryList.set(com.google.javascript.jscomp.PassConfig.findPassIndexByName(factoryList, factory.getName()), factory);
	}

	private static int findPassIndexByName(java.util.List<com.google.javascript.jscomp.PassFactory> factoryList, java.lang.String name) {
		for (int i = 0; i < (factoryList.size()); i++) {
			if (factoryList.get(i).getName().equals(name)) {
				return i;
			}
		}
		throw new java.lang.IllegalArgumentException((("No factory named '" + name) + "' in the factory list"));
	}

	final com.google.javascript.jscomp.PassConfig getBasePassConfig() {
		com.google.javascript.jscomp.PassConfig current = com.google.javascript.jscomp.PassConfig.this;
		while (current instanceof com.google.javascript.jscomp.PassConfig.PassConfigDelegate) {
			current = ((com.google.javascript.jscomp.PassConfig.PassConfigDelegate) (current)).delegate;
		} 
		return current;
	}

	abstract com.google.javascript.jscomp.PassConfig.State getIntermediateState();

	abstract void setIntermediateState(com.google.javascript.jscomp.PassConfig.State state);

	static class PassConfigDelegate extends com.google.javascript.jscomp.PassConfig {
		private final com.google.javascript.jscomp.PassConfig delegate;

		PassConfigDelegate(com.google.javascript.jscomp.PassConfig delegate) {
			super(delegate.options);
			this.delegate = delegate;
		}

		@java.lang.Override
		protected java.util.List<com.google.javascript.jscomp.PassFactory> getChecks() {
			return delegate.getChecks();
		}

		@java.lang.Override
		protected java.util.List<com.google.javascript.jscomp.PassFactory> getOptimizations() {
			return delegate.getOptimizations();
		}

		@java.lang.Override
		com.google.javascript.jscomp.ScopeCreator getScopeCreator() {
			return delegate.getScopeCreator();
		}

		@java.lang.Override
		com.google.javascript.jscomp.Scope getTopScope() {
			return delegate.getTopScope();
		}

		@java.lang.Override
		com.google.javascript.jscomp.PassConfig.State getIntermediateState() {
			return delegate.getIntermediateState();
		}

		@java.lang.Override
		void setIntermediateState(com.google.javascript.jscomp.PassConfig.State state) {
			delegate.setIntermediateState(state);
		}
	}

	static class State implements java.io.Serializable {
		private static final long serialVersionUID = 1L;

		final java.util.Map<java.lang.String, java.lang.Integer> cssNames;

		final java.util.Set<java.lang.String> exportedNames;

		final com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator crossModuleIdGenerator;

		final com.google.javascript.jscomp.VariableMap variableMap;

		final com.google.javascript.jscomp.VariableMap propertyMap;

		final com.google.javascript.jscomp.VariableMap anonymousFunctionNameMap;

		final com.google.javascript.jscomp.VariableMap stringMap;

		final com.google.javascript.jscomp.FunctionNames functionNames;

		final java.lang.String idGeneratorMap;

		State(java.util.Map<java.lang.String, java.lang.Integer> cssNames, java.util.Set<java.lang.String> exportedNames, com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator crossModuleIdGenerator, com.google.javascript.jscomp.VariableMap variableMap, com.google.javascript.jscomp.VariableMap propertyMap, com.google.javascript.jscomp.VariableMap anonymousFunctionNameMap, com.google.javascript.jscomp.VariableMap stringMap, com.google.javascript.jscomp.FunctionNames functionNames, java.lang.String idGeneratorMap) {
			this.cssNames = cssNames;
			this.exportedNames = exportedNames;
			this.crossModuleIdGenerator = crossModuleIdGenerator;
			this.variableMap = variableMap;
			this.propertyMap = propertyMap;
			this.anonymousFunctionNameMap = anonymousFunctionNameMap;
			this.stringMap = stringMap;
			this.idGeneratorMap = idGeneratorMap;
			this.functionNames = functionNames;
		}
	}
}


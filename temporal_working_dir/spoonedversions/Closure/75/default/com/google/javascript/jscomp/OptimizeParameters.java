

package com.google.javascript.jscomp;


class OptimizeParameters implements com.google.javascript.jscomp.CompilerPass , com.google.javascript.jscomp.OptimizeCalls.CallGraphCompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	OptimizeParameters(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	OptimizeParameters(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.NameReferenceGraph unused) {
		this(compiler);
	}

	@java.lang.Override
	@com.google.common.annotations.VisibleForTesting
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.SimpleDefinitionFinder defFinder = new com.google.javascript.jscomp.SimpleDefinitionFinder(compiler);
		defFinder.process(externs, root);
		process(externs, root, defFinder);
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root, com.google.javascript.jscomp.SimpleDefinitionFinder definitions) {
		for (com.google.javascript.jscomp.DefinitionSite defSite : definitions.getDefinitionSites()) {
			if (canChangeSignature(defSite, definitions)) {
				tryEliminateConstantArgs(defSite, definitions);
				tryEliminateOptionalArgs(defSite, definitions);
			}
		}
	}

	private boolean canChangeSignature(com.google.javascript.jscomp.DefinitionSite definitionSite, com.google.javascript.jscomp.SimpleDefinitionFinder defFinder) {
		com.google.javascript.jscomp.DefinitionsRemover.Definition definition = definitionSite.definition;
		if (definitionSite.inExterns) {
			return false;
		}
		com.google.javascript.rhino.Node rValue = definition.getRValue();
		if (((rValue == null) || (!(com.google.javascript.jscomp.NodeUtil.isFunction(rValue)))) || (com.google.javascript.jscomp.NodeUtil.isVarArgsFunction(rValue))) {
			return false;
		}
		if (!(com.google.javascript.jscomp.SimpleDefinitionFinder.isSimpleFunctionDeclaration(rValue))) {
			return false;
		}
		if (com.google.javascript.jscomp.SimpleDefinitionFinder.maybeExported(compiler, definition)) {
			return false;
		}
		java.util.Collection<com.google.javascript.jscomp.UseSite> useSites = defFinder.getUseSites(definition);
		if (useSites.isEmpty()) {
			return false;
		}
		for (com.google.javascript.jscomp.UseSite site : useSites) {
			if (!(com.google.javascript.jscomp.SimpleDefinitionFinder.isCallOrNewSite(site))) {
				return false;
			}
			com.google.javascript.rhino.Node nameNode = site.node;
			java.util.Collection<com.google.javascript.jscomp.DefinitionsRemover.Definition> singleSiteDefinitions = defFinder.getDefinitionsReferencedAt(nameNode);
			if ((singleSiteDefinitions.size()) > 1) {
				return false;
			}
			com.google.common.base.Preconditions.checkState((!(singleSiteDefinitions.isEmpty())));
			com.google.common.base.Preconditions.checkState(singleSiteDefinitions.contains(definition));
		}
		return true;
	}

	private void tryEliminateOptionalArgs(com.google.javascript.jscomp.DefinitionSite defSite, com.google.javascript.jscomp.SimpleDefinitionFinder defFinder) {
		int maxArgs = -1;
		com.google.javascript.jscomp.DefinitionsRemover.Definition definition = defSite.definition;
		java.util.Collection<com.google.javascript.jscomp.UseSite> useSites = defFinder.getUseSites(definition);
		for (com.google.javascript.jscomp.UseSite site : useSites) {
			com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.SimpleDefinitionFinder.isCallOrNewSite(site));
			com.google.javascript.rhino.Node call = site.node.getParent();
			int numArgs = (call.getChildCount()) - 1;
			if (numArgs > maxArgs) {
				maxArgs = numArgs;
			}
		}
		eliminateParamsAfter(definition.getRValue(), maxArgs);
	}

	private void tryEliminateConstantArgs(com.google.javascript.jscomp.DefinitionSite defSite, com.google.javascript.jscomp.SimpleDefinitionFinder defFinder) {
		java.util.List<com.google.javascript.jscomp.OptimizeParameters.Parameter> parameters = com.google.common.collect.Lists.newArrayList();
		boolean firstCall = true;
		com.google.javascript.jscomp.DefinitionsRemover.Definition definition = defSite.definition;
		java.util.Collection<com.google.javascript.jscomp.UseSite> useSites = defFinder.getUseSites(definition);
		for (com.google.javascript.jscomp.UseSite site : useSites) {
			com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.SimpleDefinitionFinder.isCallOrNewSite(site));
			com.google.javascript.rhino.Node call = site.node.getParent();
			com.google.javascript.rhino.Node cur = call.getFirstChild();
			if (firstCall) {
				buildParameterList(parameters, cur);
				firstCall = false;
			}else {
				findConstantParameters(parameters, cur);
			}
		}
		for (com.google.javascript.jscomp.UseSite site : useSites) {
			com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.SimpleDefinitionFinder.isCallOrNewSite(site));
			com.google.javascript.rhino.Node call = site.node.getParent();
			optimizeCallSite(parameters, call);
		}
		com.google.javascript.rhino.Node function = definition.getRValue();
		if (com.google.javascript.jscomp.NodeUtil.isFunction(function)) {
			optimizeFunctionDefinition(parameters, function);
		}
	}

	private void findConstantParameters(java.util.List<com.google.javascript.jscomp.OptimizeParameters.Parameter> parameters, com.google.javascript.rhino.Node cur) {
		int index = 0;
		while ((cur = cur.getNext()) != null) {
			if (index >= (parameters.size())) {
				parameters.add(new com.google.javascript.jscomp.OptimizeParameters.Parameter(cur, false));
			}else
				if (parameters.get(index).shouldRemove()) {
					com.google.javascript.rhino.Node value = parameters.get(index).getArg();
					if (!(nodesAreEqual(cur, value))) {
						parameters.get(index).setShouldRemove(false);
					}
				}
			
			index++;
		} 
		for (; index < (parameters.size()); index++) {
			parameters.get(index).setShouldRemove(false);
		}
	}

	private void buildParameterList(java.util.List<com.google.javascript.jscomp.OptimizeParameters.Parameter> parameters, com.google.javascript.rhino.Node cur) {
		while ((cur = cur.getNext()) != null) {
			parameters.add(new com.google.javascript.jscomp.OptimizeParameters.Parameter(cur, com.google.javascript.jscomp.NodeUtil.isLiteralValue(cur, false)));
		} 
	}

	private void optimizeFunctionDefinition(java.util.List<com.google.javascript.jscomp.OptimizeParameters.Parameter> parameters, com.google.javascript.rhino.Node function) {
		for (int index = (parameters.size()) - 1; index >= 0; index--) {
			if (parameters.get(index).shouldRemove()) {
				com.google.javascript.rhino.Node paramName = eliminateFunctionParamAt(function, index);
				if (paramName != null) {
					addVariableToFunction(function, paramName, parameters.get(index).getArg());
				}
			}
		}
	}

	private void optimizeCallSite(java.util.List<com.google.javascript.jscomp.OptimizeParameters.Parameter> parameters, com.google.javascript.rhino.Node call) {
		for (int index = (parameters.size()) - 1; index >= 0; index--) {
			if (parameters.get(index).shouldRemove()) {
				eliminateCallParamAt(call, index);
			}
		}
	}

	private boolean nodesAreEqual(com.google.javascript.rhino.Node n1, com.google.javascript.rhino.Node n2) {
		return ((com.google.javascript.jscomp.NodeUtil.isImmutableValue(n1)) && (com.google.javascript.jscomp.NodeUtil.isImmutableValue(n2))) && (n1.isEquivalentTo(n2));
	}

	private static class Parameter {
		private final com.google.javascript.rhino.Node arg;

		private boolean shouldRemove;

		public Parameter(com.google.javascript.rhino.Node arg, boolean shouldRemove) {
			com.google.javascript.jscomp.OptimizeParameters.Parameter.this.shouldRemove = shouldRemove;
			this.arg = arg;
		}

		public com.google.javascript.rhino.Node getArg() {
			return arg;
		}

		public boolean shouldRemove() {
			return shouldRemove;
		}

		public void setShouldRemove(boolean value) {
			shouldRemove = value;
		}
	}

	private void addVariableToFunction(com.google.javascript.rhino.Node function, com.google.javascript.rhino.Node varName, com.google.javascript.rhino.Node value) {
		com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isFunction(function), "Node must be a function.");
		com.google.javascript.rhino.Node block = function.getLastChild();
		com.google.common.base.Preconditions.checkArgument(((block.getType()) == (com.google.javascript.rhino.Token.BLOCK)), "Node must be a block.");
		com.google.javascript.rhino.Node newVar = com.google.javascript.jscomp.NodeUtil.newVarNode(varName.getQualifiedName(), value.cloneTree());
		block.addChildToFront(newVar);
		compiler.reportCodeChange();
	}

	private boolean eliminateParamsAfter(com.google.javascript.rhino.Node function, int argIndex) {
		boolean paramRemoved = false;
		com.google.javascript.rhino.Node formalArgPtr = function.getFirstChild().getNext().getFirstChild();
		while ((argIndex != 0) && (formalArgPtr != null)) {
			formalArgPtr = formalArgPtr.getNext();
			argIndex--;
		} 
		return eliminateParamsAfter(function, formalArgPtr);
	}

	private boolean eliminateParamsAfter(com.google.javascript.rhino.Node fnNode, com.google.javascript.rhino.Node argNode) {
		if (argNode != null) {
			eliminateParamsAfter(fnNode, argNode.getNext());
			argNode.detachFromParent();
			com.google.javascript.rhino.Node var = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VAR, argNode).copyInformationFrom(argNode);
			fnNode.getLastChild().addChildrenToFront(var);
			compiler.reportCodeChange();
			return true;
		}
		return false;
	}

	private com.google.javascript.rhino.Node eliminateFunctionParamAt(com.google.javascript.rhino.Node function, int argIndex) {
		com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isFunction(function), "Node must be a function.");
		com.google.javascript.rhino.Node formalArgPtr = com.google.javascript.jscomp.NodeUtil.getArgumentForFunction(function, argIndex);
		if (formalArgPtr != null) {
			function.getFirstChild().getNext().removeChild(formalArgPtr);
		}
		return formalArgPtr;
	}

	private com.google.javascript.rhino.Node eliminateCallParamAt(com.google.javascript.rhino.Node call, int argIndex) {
		com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isCallOrNew(call), "Node must be a call or new.");
		com.google.javascript.rhino.Node formalArgPtr = com.google.javascript.jscomp.NodeUtil.getArgumentForCallOrNew(call, argIndex);
		if (formalArgPtr != null) {
			call.removeChild(formalArgPtr);
			compiler.reportCodeChange();
		}
		return formalArgPtr;
	}
}


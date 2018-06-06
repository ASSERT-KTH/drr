

package com.google.javascript.jscomp;


class OptimizeParameters implements com.google.javascript.jscomp.CompilerPass , com.google.javascript.jscomp.OptimizeCalls.CallGraphCompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private java.util.List<com.google.javascript.rhino.Node> removedNodes = com.google.common.collect.Lists.newArrayList();

	OptimizeParameters(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	@com.google.common.annotations.VisibleForTesting
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.common.base.Preconditions.checkState(((compiler.getLifeCycleStage()) == (com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage.NORMALIZED)));
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
		for (com.google.javascript.rhino.Node n : removedNodes) {
			definitions.removeReferences(n);
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
		boolean continueLooking = false;
		for (com.google.javascript.jscomp.UseSite site : useSites) {
			com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.SimpleDefinitionFinder.isCallOrNewSite(site));
			com.google.javascript.rhino.Node call = site.node.getParent();
			com.google.javascript.rhino.Node cur = call.getFirstChild();
			if (firstCall) {
				continueLooking = buildParameterList(parameters, cur, site.scope);
				firstCall = false;
			}else {
				continueLooking = findFixedParameters(parameters, cur);
			}
			if (!continueLooking) {
				return ;
			}
		}
		continueLooking = adjustForSideEffects(parameters);
		if (!continueLooking) {
			return ;
		}
		for (com.google.javascript.jscomp.UseSite site : useSites) {
			com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.SimpleDefinitionFinder.isCallOrNewSite(site));
			com.google.javascript.rhino.Node call = site.node.getParent();
			optimizeCallSite(defFinder, parameters, call);
		}
		com.google.javascript.rhino.Node function = definition.getRValue();
		if (com.google.javascript.jscomp.NodeUtil.isFunction(function)) {
			optimizeFunctionDefinition(parameters, function);
		}
	}

	private boolean adjustForSideEffects(java.util.List<com.google.javascript.jscomp.OptimizeParameters.Parameter> parameters) {
		boolean anyMovable = false;
		boolean seenUnmovableSideEffects = false;
		boolean seenUnmoveableSideEfffected = false;
		for (int i = (parameters.size()) - 1; i >= 0; i--) {
			com.google.javascript.jscomp.OptimizeParameters.Parameter current = parameters.get(i);
			if ((current.shouldRemove) && ((seenUnmovableSideEffects && (current.canBeSideEffected())) || (seenUnmoveableSideEfffected && (current.hasSideEffects())))) {
				current.shouldRemove = false;
			}
			if (current.shouldRemove) {
				anyMovable = true;
			}else {
				if (current.canBeSideEffected) {
					seenUnmoveableSideEfffected = true;
				}
				if (current.hasSideEffects) {
					seenUnmovableSideEffects = true;
				}
			}
		}
		return anyMovable;
	}

	private boolean findFixedParameters(java.util.List<com.google.javascript.jscomp.OptimizeParameters.Parameter> parameters, com.google.javascript.rhino.Node cur) {
		boolean anyMovable = false;
		int index = 0;
		while ((cur = cur.getNext()) != null) {
			com.google.javascript.jscomp.OptimizeParameters.Parameter p;
			if (index >= (parameters.size())) {
				p = new com.google.javascript.jscomp.OptimizeParameters.Parameter(cur, false);
				parameters.add(p);
			}else {
				p = parameters.get(index);
				if (p.shouldRemove()) {
					com.google.javascript.rhino.Node value = p.getArg();
					if (!(cur.isEquivalentTo(value))) {
						p.setShouldRemove(false);
					}else {
						anyMovable = true;
					}
				}
			}
			setParameterSideEffectInfo(p, cur);
			index++;
		} 
		for (; index < (parameters.size()); index++) {
			parameters.get(index).setShouldRemove(false);
		}
		return anyMovable;
	}

	private boolean buildParameterList(java.util.List<com.google.javascript.jscomp.OptimizeParameters.Parameter> parameters, com.google.javascript.rhino.Node cur, com.google.javascript.jscomp.Scope s) {
		boolean anyMovable = false;
		while ((cur = cur.getNext()) != null) {
			boolean movable = isMovableValue(cur, s);
			com.google.javascript.jscomp.OptimizeParameters.Parameter p = new com.google.javascript.jscomp.OptimizeParameters.Parameter(cur, movable);
			setParameterSideEffectInfo(p, cur);
			parameters.add(p);
			if (movable) {
				anyMovable = true;
			}
		} 
		return anyMovable;
	}

	private void setParameterSideEffectInfo(com.google.javascript.jscomp.OptimizeParameters.Parameter p, com.google.javascript.rhino.Node value) {
		if (!(p.hasSideEffects())) {
			p.setHasSideEffects(com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(value, compiler));
		}
		if (!(p.canBeSideEffected())) {
			p.setCanBeSideEffected(com.google.javascript.jscomp.NodeUtil.canBeSideEffected(value));
		}
	}

	private boolean isMovableValue(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.Scope s) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.THIS :
				return false;
			case com.google.javascript.rhino.Token.FUNCTION :
				return false;
			case com.google.javascript.rhino.Token.NAME :
				if (n.getString().equals("arguments")) {
					return false;
				}else {
					com.google.javascript.jscomp.Scope.Var v = s.getVar(n.getString());
					if ((v != null) && (v.isLocal())) {
						return false;
					}
				}
				break;
		}
		for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
			if (!(isMovableValue(c, s))) {
				return false;
			}
		}
		return true;
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

	private void optimizeCallSite(com.google.javascript.jscomp.SimpleDefinitionFinder defFinder, java.util.List<com.google.javascript.jscomp.OptimizeParameters.Parameter> parameters, com.google.javascript.rhino.Node call) {
		for (int index = (parameters.size()) - 1; index >= 0; index--) {
			com.google.javascript.jscomp.OptimizeParameters.Parameter p = parameters.get(index);
			if (p.shouldRemove()) {
				eliminateCallParamAt(defFinder, p, call, index);
			}
		}
	}

	private static class Parameter {
		private final com.google.javascript.rhino.Node arg;

		private boolean shouldRemove;

		private boolean hasSideEffects;

		private boolean canBeSideEffected;

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

		public void setHasSideEffects(boolean hasSideEffects) {
			com.google.javascript.jscomp.OptimizeParameters.Parameter.this.hasSideEffects = hasSideEffects;
		}

		public boolean hasSideEffects() {
			return hasSideEffects;
		}

		public void setCanBeSideEffected(boolean canBeSideEffected) {
			com.google.javascript.jscomp.OptimizeParameters.Parameter.this.canBeSideEffected = canBeSideEffected;
		}

		public boolean canBeSideEffected() {
			return canBeSideEffected;
		}
	}

	private void addVariableToFunction(com.google.javascript.rhino.Node function, com.google.javascript.rhino.Node varName, com.google.javascript.rhino.Node value) {
		com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isFunction(function), "Node must be a function.");
		com.google.javascript.rhino.Node block = function.getLastChild();
		com.google.common.base.Preconditions.checkArgument(((block.getType()) == (com.google.javascript.rhino.Token.BLOCK)), "Node must be a block.");
		com.google.common.base.Preconditions.checkState(((value.getParent()) == null));
		com.google.javascript.rhino.Node newVar = com.google.javascript.jscomp.NodeUtil.newVarNode(varName.getString(), value);
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

	private com.google.javascript.rhino.Node eliminateCallParamAt(com.google.javascript.jscomp.SimpleDefinitionFinder defFinder, com.google.javascript.jscomp.OptimizeParameters.Parameter p, com.google.javascript.rhino.Node call, int argIndex) {
		com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isCallOrNew(call), "Node must be a call or new.");
		com.google.javascript.rhino.Node formalArgPtr = com.google.javascript.jscomp.NodeUtil.getArgumentForCallOrNew(call, argIndex);
		if (formalArgPtr != null) {
			call.removeChild(formalArgPtr);
			if ((p.getArg()) != formalArgPtr) {
				removedNodes.add(formalArgPtr);
			}
			compiler.reportCodeChange();
		}
		return formalArgPtr;
	}
}


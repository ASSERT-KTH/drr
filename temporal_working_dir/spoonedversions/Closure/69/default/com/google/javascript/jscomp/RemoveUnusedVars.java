

package com.google.javascript.jscomp;


class RemoveUnusedVars implements com.google.javascript.jscomp.CompilerPass , com.google.javascript.jscomp.OptimizeCalls.CallGraphCompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.CodingConvention codingConvention;

	private final boolean removeGlobals;

	private boolean preserveFunctionExpressionNames;

	private final java.util.Set<com.google.javascript.jscomp.Scope.Var> referenced = com.google.common.collect.Sets.newHashSet();

	private final java.util.List<com.google.javascript.jscomp.Scope.Var> maybeUnreferenced = com.google.common.collect.Lists.newArrayList();

	private final java.util.List<com.google.javascript.jscomp.Scope> allFunctionScopes = com.google.common.collect.Lists.newArrayList();

	private final com.google.common.collect.Multimap<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.RemoveUnusedVars.Assign> assignsByVar = com.google.common.collect.ArrayListMultimap.create();

	private final java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.RemoveUnusedVars.Assign> assignsByNode = com.google.common.collect.Maps.newHashMap();

	private final com.google.common.collect.Multimap<com.google.javascript.jscomp.Scope.Var, com.google.javascript.rhino.Node> inheritsCalls = com.google.common.collect.ArrayListMultimap.create();

	private final com.google.common.collect.Multimap<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.RemoveUnusedVars.Continuation> continuations = com.google.common.collect.ArrayListMultimap.create();

	private boolean modifyCallSites;

	private com.google.javascript.jscomp.RemoveUnusedVars.CallSiteOptimizer callSiteOptimizer;

	RemoveUnusedVars(com.google.javascript.jscomp.AbstractCompiler compiler, boolean removeGlobals, boolean preserveFunctionExpressionNames, boolean modifyCallSites) {
		this.compiler = compiler;
		this.codingConvention = compiler.getCodingConvention();
		this.removeGlobals = removeGlobals;
		com.google.javascript.jscomp.RemoveUnusedVars.this.preserveFunctionExpressionNames = preserveFunctionExpressionNames;
		com.google.javascript.jscomp.RemoveUnusedVars.this.modifyCallSites = modifyCallSites;
	}

	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.common.base.Preconditions.checkState(compiler.getLifeCycleStage().isNormalized());
		com.google.javascript.jscomp.SimpleDefinitionFinder defFinder = null;
		if (modifyCallSites) {
			defFinder = new com.google.javascript.jscomp.SimpleDefinitionFinder(compiler);
			defFinder.process(externs, root);
		}
		process(externs, root, defFinder);
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root, com.google.javascript.jscomp.SimpleDefinitionFinder defFinder) {
		if (modifyCallSites) {
			com.google.common.base.Preconditions.checkNotNull(defFinder);
			callSiteOptimizer = new com.google.javascript.jscomp.RemoveUnusedVars.CallSiteOptimizer(compiler, defFinder);
		}
		traverseAndRemoveUnusedReferences(root);
		if ((callSiteOptimizer) != null) {
			callSiteOptimizer.applyChanges();
		}
	}

	private void traverseAndRemoveUnusedReferences(com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.Scope scope = new com.google.javascript.jscomp.SyntacticScopeCreator(compiler).createScope(root, null);
		traverseNode(root, null, scope);
		if (removeGlobals) {
			collectMaybeUnreferencedVars(scope);
		}
		interpretAssigns();
		removeUnreferencedVars();
		for (com.google.javascript.jscomp.Scope fnScope : allFunctionScopes) {
			removeUnreferencedFunctionArgs(fnScope);
		}
	}

	private void traverseNode(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent, com.google.javascript.jscomp.Scope scope) {
		int type = n.getType();
		com.google.javascript.jscomp.Scope.Var var = null;
		switch (type) {
			case com.google.javascript.rhino.Token.FUNCTION :
				if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n)) {
					var = scope.getVar(n.getFirstChild().getString());
				}
				if ((var != null) && (isRemovableVar(var))) {
					continuations.put(var, new com.google.javascript.jscomp.RemoveUnusedVars.Continuation(n, scope));
				}else {
					traverseFunction(n, scope);
				}
				return ;
			case com.google.javascript.rhino.Token.ASSIGN :
				com.google.javascript.jscomp.RemoveUnusedVars.Assign maybeAssign = com.google.javascript.jscomp.RemoveUnusedVars.Assign.maybeCreateAssign(n);
				if (maybeAssign != null) {
					var = scope.getVar(maybeAssign.nameNode.getString());
					if (var != null) {
						assignsByVar.put(var, maybeAssign);
						assignsByNode.put(maybeAssign.nameNode, maybeAssign);
						if ((isRemovableVar(var)) && (!(maybeAssign.mayHaveSecondarySideEffects))) {
							continuations.put(var, new com.google.javascript.jscomp.RemoveUnusedVars.Continuation(n, scope));
							return ;
						}
					}
				}
				break;
			case com.google.javascript.rhino.Token.CALL :
				com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship = codingConvention.getClassesDefinedByCall(n);
				if (subclassRelationship != null) {
					com.google.javascript.jscomp.Scope.Var subclassVar = scope.getVar(subclassRelationship.subclassName);
					if (((subclassVar != null) && (subclassVar.isGlobal())) && (!(referenced.contains(subclassVar)))) {
						inheritsCalls.put(subclassVar, parent);
						continuations.put(subclassVar, new com.google.javascript.jscomp.RemoveUnusedVars.Continuation(n, scope));
						return ;
					}
				}
				break;
			case com.google.javascript.rhino.Token.NAME :
				var = scope.getVar(n.getString());
				if ((parent.getType()) == (com.google.javascript.rhino.Token.VAR)) {
					com.google.javascript.rhino.Node value = n.getFirstChild();
					if ((((value != null) && (var != null)) && (isRemovableVar(var))) && (!(com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(value)))) {
						continuations.put(var, new com.google.javascript.jscomp.RemoveUnusedVars.Continuation(n, scope));
						return ;
					}
				}else {
					if (("arguments".equals(n.getString())) && (scope.isLocal())) {
						com.google.javascript.rhino.Node lp = scope.getRootNode().getFirstChild().getNext();
						for (com.google.javascript.rhino.Node a = lp.getFirstChild(); a != null; a = a.getNext()) {
							markReferencedVar(scope.getVar(a.getString()));
						}
					}
					if (var != null) {
						if (isRemovableVar(var)) {
							if (!(assignsByNode.containsKey(n))) {
								markReferencedVar(var);
							}
						}else {
							markReferencedVar(var);
						}
					}
				}
				break;
		}
		for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
			traverseNode(c, n, scope);
		}
	}

	private boolean isRemovableVar(com.google.javascript.jscomp.Scope.Var var) {
		if ((!(removeGlobals)) && (var.isGlobal())) {
			return false;
		}
		if (referenced.contains(var)) {
			return false;
		}
		if (codingConvention.isExported(var.getName())) {
			return false;
		}
		return true;
	}

	private void traverseFunction(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.Scope parentScope) {
		com.google.common.base.Preconditions.checkState(((n.getChildCount()) == 3));
		com.google.common.base.Preconditions.checkState(((n.getType()) == (com.google.javascript.rhino.Token.FUNCTION)));
		final com.google.javascript.rhino.Node body = n.getLastChild();
		com.google.common.base.Preconditions.checkState((((body.getNext()) == null) && ((body.getType()) == (com.google.javascript.rhino.Token.BLOCK))));
		com.google.javascript.jscomp.Scope fnScope = new com.google.javascript.jscomp.SyntacticScopeCreator(compiler).createScope(n, parentScope);
		traverseNode(body, n, fnScope);
		collectMaybeUnreferencedVars(fnScope);
		allFunctionScopes.add(fnScope);
	}

	private void collectMaybeUnreferencedVars(com.google.javascript.jscomp.Scope scope) {
		for (java.util.Iterator<com.google.javascript.jscomp.Scope.Var> it = scope.getVars(); it.hasNext();) {
			com.google.javascript.jscomp.Scope.Var var = it.next();
			if (isRemovableVar(var)) {
				maybeUnreferenced.add(var);
			}
		}
	}

	private void removeUnreferencedFunctionArgs(com.google.javascript.jscomp.Scope fnScope) {
		com.google.javascript.rhino.Node function = fnScope.getRootNode();
		com.google.common.base.Preconditions.checkState(((function.getType()) == (com.google.javascript.rhino.Token.FUNCTION)));
		if (com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(function.getParent())) {
			return ;
		}
		com.google.javascript.rhino.Node argList = com.google.javascript.jscomp.RemoveUnusedVars.getFunctionArgList(function);
		boolean modifyCallers = (modifyCallSites) && (callSiteOptimizer.canModifyCallers(function));
		if (!modifyCallers) {
			com.google.javascript.rhino.Node lastArg;
			while ((lastArg = argList.getLastChild()) != null) {
				com.google.javascript.jscomp.Scope.Var var = fnScope.getVar(lastArg.getString());
				if (!(referenced.contains(var))) {
					com.google.common.base.Preconditions.checkNotNull((var == null));
					argList.removeChild(lastArg);
					compiler.reportCodeChange();
				}else {
					break;
				}
			} 
		}else {
			callSiteOptimizer.optimize(fnScope, referenced);
		}
	}

	private static com.google.javascript.rhino.Node getFunctionArgList(com.google.javascript.rhino.Node function) {
		return function.getFirstChild().getNext();
	}

	private static class CallSiteOptimizer {
		private final com.google.javascript.jscomp.AbstractCompiler compiler;

		private final com.google.javascript.jscomp.SimpleDefinitionFinder defFinder;

		private final java.util.List<com.google.javascript.rhino.Node> toRemove = com.google.common.collect.Lists.newArrayList();

		private final java.util.List<com.google.javascript.rhino.Node> toReplaceWithZero = com.google.common.collect.Lists.newArrayList();

		CallSiteOptimizer(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.SimpleDefinitionFinder defFinder) {
			this.compiler = compiler;
			this.defFinder = defFinder;
		}

		public void optimize(com.google.javascript.jscomp.Scope fnScope, java.util.Set<com.google.javascript.jscomp.Scope.Var> referenced) {
			com.google.javascript.rhino.Node function = fnScope.getRootNode();
			com.google.common.base.Preconditions.checkState(((function.getType()) == (com.google.javascript.rhino.Token.FUNCTION)));
			com.google.javascript.rhino.Node argList = com.google.javascript.jscomp.RemoveUnusedVars.getFunctionArgList(function);
			boolean changeCallSignature = canChangeSignature(function);
			markUnreferencedFunctionArgs(fnScope, function, referenced, argList.getFirstChild(), 0, changeCallSignature);
		}

		public void applyChanges() {
			for (com.google.javascript.rhino.Node n : toRemove) {
				n.getParent().removeChild(n);
				compiler.reportCodeChange();
			}
			for (com.google.javascript.rhino.Node n : toReplaceWithZero) {
				n.getParent().replaceChild(n, com.google.javascript.rhino.Node.newNumber(0).copyInformationFrom(n));
				compiler.reportCodeChange();
			}
		}

		private boolean markUnreferencedFunctionArgs(com.google.javascript.jscomp.Scope scope, com.google.javascript.rhino.Node function, java.util.Set<com.google.javascript.jscomp.Scope.Var> referenced, com.google.javascript.rhino.Node param, int paramIndex, boolean canChangeSignature) {
			if (param != null) {
				boolean hasFollowing = markUnreferencedFunctionArgs(scope, function, referenced, param.getNext(), (paramIndex + 1), canChangeSignature);
				com.google.javascript.jscomp.Scope.Var var = scope.getVar(param.getString());
				if (!(referenced.contains(var))) {
					com.google.common.base.Preconditions.checkNotNull(var);
					boolean modifyAllCallSites = canChangeSignature || (!hasFollowing);
					if (modifyAllCallSites) {
						modifyAllCallSites = canRemoveArgFromCallSites(function, paramIndex);
					}
					tryRemoveArgFromCallSites(function, paramIndex, modifyAllCallSites);
					if (modifyAllCallSites || (!hasFollowing)) {
						toRemove.add(param);
						return hasFollowing;
					}
				}
				return true;
			}else {
				tryRemoveAllFollowingArgs(function, (paramIndex - 1));
				return false;
			}
		}

		private boolean canRemoveArgFromCallSites(com.google.javascript.rhino.Node function, int argIndex) {
			com.google.javascript.jscomp.DefinitionsRemover.Definition definition = getFunctionDefinition(function);
			for (com.google.javascript.jscomp.UseSite site : defFinder.getUseSites(definition)) {
				if (com.google.javascript.jscomp.RemoveUnusedVars.CallSiteOptimizer.isModifiableCallSite(site)) {
					com.google.javascript.rhino.Node arg = com.google.javascript.jscomp.RemoveUnusedVars.CallSiteOptimizer.getArgumentForCallOrNewOrDotCall(site, argIndex);
					if ((arg != null) && (com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(arg, compiler))) {
						return false;
					}
				}else {
					return false;
				}
			}
			return true;
		}

		private void tryRemoveArgFromCallSites(com.google.javascript.rhino.Node function, int argIndex, boolean canModifyAllSites) {
			com.google.javascript.jscomp.DefinitionsRemover.Definition definition = getFunctionDefinition(function);
			for (com.google.javascript.jscomp.UseSite site : defFinder.getUseSites(definition)) {
				if (com.google.javascript.jscomp.RemoveUnusedVars.CallSiteOptimizer.isModifiableCallSite(site)) {
					com.google.javascript.rhino.Node arg = com.google.javascript.jscomp.RemoveUnusedVars.CallSiteOptimizer.getArgumentForCallOrNewOrDotCall(site, argIndex);
					if (arg != null) {
						com.google.javascript.rhino.Node argParent = arg.getParent();
						if (canModifyAllSites || (((arg.getNext()) == null) && (!(com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(arg, compiler))))) {
							toRemove.add(arg);
						}else {
							if ((!(com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(arg, compiler))) && (((arg.getType()) != (com.google.javascript.rhino.Token.NUMBER)) || ((arg.getDouble()) != 0))) {
								toReplaceWithZero.add(arg);
							}
						}
					}
				}
			}
		}

		private void tryRemoveAllFollowingArgs(com.google.javascript.rhino.Node function, final int argIndex) {
			com.google.javascript.jscomp.DefinitionsRemover.Definition definition = getFunctionDefinition(function);
			for (com.google.javascript.jscomp.UseSite site : defFinder.getUseSites(definition)) {
				if (!(com.google.javascript.jscomp.RemoveUnusedVars.CallSiteOptimizer.isModifiableCallSite(site))) {
					continue;
				}
				com.google.javascript.rhino.Node arg = com.google.javascript.jscomp.RemoveUnusedVars.CallSiteOptimizer.getArgumentForCallOrNewOrDotCall(site, (argIndex + 1));
				while (arg != null) {
					if (!(com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(arg))) {
						toRemove.add(arg);
					}
					arg = arg.getNext();
				} 
			}
		}

		private static com.google.javascript.rhino.Node getArgumentForCallOrNewOrDotCall(com.google.javascript.jscomp.UseSite site, final int argIndex) {
			int adjustedArgIndex = argIndex;
			com.google.javascript.rhino.Node parent = site.node.getParent();
			if (com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(parent)) {
				adjustedArgIndex++;
			}
			return com.google.javascript.jscomp.NodeUtil.getArgumentForCallOrNew(parent, adjustedArgIndex);
		}

		boolean canModifyCallers(com.google.javascript.rhino.Node function) {
			if (com.google.javascript.jscomp.NodeUtil.isVarArgsFunction(function)) {
				return false;
			}
			com.google.javascript.jscomp.DefinitionSite defSite = defFinder.getDefinitionForFunction(function);
			if (defSite == null) {
				return false;
			}
			com.google.javascript.jscomp.DefinitionsRemover.Definition definition = defSite.definition;
			if (!(com.google.javascript.jscomp.SimpleDefinitionFinder.isSimpleFunctionDeclaration(function))) {
				return false;
			}
			return defFinder.canModifyDefinition(definition);
		}

		private static boolean isModifiableCallSite(com.google.javascript.jscomp.UseSite site) {
			return (com.google.javascript.jscomp.SimpleDefinitionFinder.isCallOrNewSite(site)) && (!(com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(site.node.getParent())));
		}

		private boolean canChangeSignature(com.google.javascript.rhino.Node function) {
			com.google.javascript.jscomp.DefinitionsRemover.Definition definition = getFunctionDefinition(function);
			com.google.javascript.jscomp.CodingConvention convention = compiler.getCodingConvention();
			com.google.common.base.Preconditions.checkState((!(definition.isExtern())));
			java.util.Collection<com.google.javascript.jscomp.UseSite> useSites = defFinder.getUseSites(definition);
			for (com.google.javascript.jscomp.UseSite site : useSites) {
				com.google.javascript.rhino.Node parent = site.node.getParent();
				if ((com.google.javascript.jscomp.NodeUtil.isCall(parent)) && ((convention.getClassesDefinedByCall(parent)) != null)) {
					continue;
				}
				if (!(com.google.javascript.jscomp.SimpleDefinitionFinder.isCallOrNewSite(site))) {
					if (!((com.google.javascript.jscomp.NodeUtil.isGetProp(parent)) && (com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(parent.getParent())))) {
						return false;
					}
				}
				if (com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(parent)) {
					return false;
				}
				com.google.javascript.rhino.Node nameNode = site.node;
				java.util.Collection<com.google.javascript.jscomp.DefinitionsRemover.Definition> singleSiteDefinitions = defFinder.getDefinitionsReferencedAt(nameNode);
				com.google.common.base.Preconditions.checkState(((singleSiteDefinitions.size()) == 1));
				com.google.common.base.Preconditions.checkState(singleSiteDefinitions.contains(definition));
			}
			return true;
		}

		private com.google.javascript.jscomp.DefinitionsRemover.Definition getFunctionDefinition(com.google.javascript.rhino.Node function) {
			com.google.javascript.jscomp.DefinitionSite definitionSite = defFinder.getDefinitionForFunction(function);
			com.google.common.base.Preconditions.checkNotNull(definitionSite);
			com.google.javascript.jscomp.DefinitionsRemover.Definition definition = definitionSite.definition;
			com.google.common.base.Preconditions.checkState((!(definitionSite.inExterns)));
			com.google.common.base.Preconditions.checkState(((definition.getRValue()) == function));
			return definition;
		}
	}

	private void interpretAssigns() {
		boolean changes = false;
		do {
			changes = false;
			for (int current = 0; current < (maybeUnreferenced.size()); current++) {
				com.google.javascript.jscomp.Scope.Var var = maybeUnreferenced.get(current);
				if (referenced.contains(var)) {
					maybeUnreferenced.remove(current);
					current--;
				}else {
					boolean assignedToUnknownValue = false;
					boolean hasPropertyAssign = false;
					if (((var.getParentNode().getType()) == (com.google.javascript.rhino.Token.VAR)) && (!(com.google.javascript.jscomp.NodeUtil.isForIn(var.getParentNode().getParent())))) {
						com.google.javascript.rhino.Node value = var.getInitialValue();
						assignedToUnknownValue = (value != null) && (!(com.google.javascript.jscomp.NodeUtil.isLiteralValue(value, true)));
					}else {
						assignedToUnknownValue = true;
					}
					for (com.google.javascript.jscomp.RemoveUnusedVars.Assign assign : assignsByVar.get(var)) {
						if (assign.isPropertyAssign) {
							hasPropertyAssign = true;
						}else
							if (!(com.google.javascript.jscomp.NodeUtil.isLiteralValue(assign.assignNode.getLastChild(), true))) {
								assignedToUnknownValue = true;
							}
						
					}
					if (assignedToUnknownValue && hasPropertyAssign) {
						changes = (markReferencedVar(var)) || changes;
						maybeUnreferenced.remove(current);
						current--;
					}
				}
			}
		} while (changes );
	}

	private void removeAllAssigns(com.google.javascript.jscomp.Scope.Var var) {
		for (com.google.javascript.jscomp.RemoveUnusedVars.Assign assign : assignsByVar.get(var)) {
			assign.remove();
			compiler.reportCodeChange();
		}
	}

	private boolean markReferencedVar(com.google.javascript.jscomp.Scope.Var var) {
		if (referenced.add(var)) {
			for (com.google.javascript.jscomp.RemoveUnusedVars.Continuation c : continuations.get(var)) {
				c.apply();
			}
			return true;
		}
		return false;
	}

	private void removeUnreferencedVars() {
		com.google.javascript.jscomp.CodingConvention convention = codingConvention;
		for (java.util.Iterator<com.google.javascript.jscomp.Scope.Var> it = maybeUnreferenced.iterator(); it.hasNext();) {
			com.google.javascript.jscomp.Scope.Var var = it.next();
			for (com.google.javascript.rhino.Node exprCallNode : inheritsCalls.get(var)) {
				com.google.javascript.jscomp.NodeUtil.removeChild(exprCallNode.getParent(), exprCallNode);
				compiler.reportCodeChange();
			}
			removeAllAssigns(var);
			compiler.addToDebugLog(("Unreferenced var: " + (var.name)));
			com.google.javascript.rhino.Node nameNode = var.nameNode;
			com.google.javascript.rhino.Node toRemove = nameNode.getParent();
			com.google.javascript.rhino.Node parent = toRemove.getParent();
			com.google.common.base.Preconditions.checkState(((((toRemove.getType()) == (com.google.javascript.rhino.Token.VAR)) || ((toRemove.getType()) == (com.google.javascript.rhino.Token.FUNCTION))) || (((toRemove.getType()) == (com.google.javascript.rhino.Token.LP)) && ((parent.getType()) == (com.google.javascript.rhino.Token.FUNCTION)))), "We should only declare vars and functions and function args");
			if (((toRemove.getType()) == (com.google.javascript.rhino.Token.LP)) && ((parent.getType()) == (com.google.javascript.rhino.Token.FUNCTION))) {
			}else
				if (com.google.javascript.jscomp.NodeUtil.isFunctionExpression(toRemove)) {
					if (!(preserveFunctionExpressionNames)) {
						toRemove.getFirstChild().setString("");
						compiler.reportCodeChange();
					}
				}else
					if (((parent != null) && ((parent.getType()) == (com.google.javascript.rhino.Token.FOR))) && ((parent.getChildCount()) < 4)) {
					}else
						if ((((toRemove.getType()) == (com.google.javascript.rhino.Token.VAR)) && (nameNode.hasChildren())) && (com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(nameNode.getFirstChild()))) {
							if ((toRemove.getChildCount()) == 1) {
								parent.replaceChild(toRemove, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT, nameNode.removeFirstChild()));
								compiler.reportCodeChange();
							}
						}else
							if (((toRemove.getType()) == (com.google.javascript.rhino.Token.VAR)) && ((toRemove.getChildCount()) > 1)) {
								toRemove.removeChild(nameNode);
								compiler.reportCodeChange();
							}else
								if (parent != null) {
									com.google.javascript.jscomp.NodeUtil.removeChild(parent, toRemove);
									compiler.reportCodeChange();
								}
							
						
					
				
			
		}
	}

	private class Continuation {
		private final com.google.javascript.rhino.Node node;

		private final com.google.javascript.jscomp.Scope scope;

		Continuation(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.Scope scope) {
			this.node = node;
			this.scope = scope;
		}

		void apply() {
			if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node)) {
				traverseFunction(node, scope);
			}else {
				for (com.google.javascript.rhino.Node child = node.getFirstChild(); child != null; child = child.getNext()) {
					traverseNode(child, node, scope);
				}
			}
		}
	}

	private static class Assign {
		final com.google.javascript.rhino.Node assignNode;

		final com.google.javascript.rhino.Node nameNode;

		final boolean isPropertyAssign;

		final boolean mayHaveSecondarySideEffects;

		Assign(com.google.javascript.rhino.Node assignNode, com.google.javascript.rhino.Node nameNode, boolean isPropertyAssign) {
			com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.NodeUtil.isAssignmentOp(assignNode));
			this.assignNode = assignNode;
			this.nameNode = nameNode;
			this.isPropertyAssign = isPropertyAssign;
			this.mayHaveSecondarySideEffects = (((assignNode.getParent().getType()) != (com.google.javascript.rhino.Token.EXPR_RESULT)) || (com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(assignNode.getFirstChild()))) || (com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(assignNode.getLastChild()));
		}

		static com.google.javascript.jscomp.RemoveUnusedVars.Assign maybeCreateAssign(com.google.javascript.rhino.Node assignNode) {
			com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.NodeUtil.isAssignmentOp(assignNode));
			boolean isPropAssign = false;
			com.google.javascript.rhino.Node current = assignNode.getFirstChild();
			if (com.google.javascript.jscomp.NodeUtil.isGet(current)) {
				current = current.getFirstChild();
				isPropAssign = true;
				if (((current.getType()) == (com.google.javascript.rhino.Token.GETPROP)) && (current.getLastChild().getString().equals("prototype"))) {
					current = current.getFirstChild();
				}
			}
			if ((current.getType()) == (com.google.javascript.rhino.Token.NAME)) {
				return new com.google.javascript.jscomp.RemoveUnusedVars.Assign(assignNode, current, isPropAssign);
			}
			return null;
		}

		void remove() {
			com.google.javascript.rhino.Node parent = assignNode.getParent();
			if (mayHaveSecondarySideEffects) {
				com.google.javascript.rhino.Node replacement = assignNode.getLastChild().detachFromParent();
				for (com.google.javascript.rhino.Node current = assignNode.getFirstChild(); (current.getType()) != (com.google.javascript.rhino.Token.NAME); current = current.getFirstChild()) {
					if ((current.getType()) == (com.google.javascript.rhino.Token.GETELEM)) {
						replacement = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.COMMA, current.getLastChild().detachFromParent(), replacement);
						replacement.copyInformationFrom(current);
					}
				}
				parent.replaceChild(assignNode, replacement);
			}else {
				com.google.javascript.rhino.Node gramps = parent.getParent();
				if ((parent.getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT)) {
					gramps.removeChild(parent);
				}else {
					parent.replaceChild(assignNode, assignNode.getLastChild().detachFromParent());
				}
			}
		}
	}
}


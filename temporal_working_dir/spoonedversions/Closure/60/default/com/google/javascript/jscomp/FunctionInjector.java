

package com.google.javascript.jscomp;


class FunctionInjector {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.common.base.Supplier<java.lang.String> safeNameIdSupplier;

	private final boolean allowDecomposition;

	private java.util.Set<java.lang.String> knownConstants = com.google.common.collect.Sets.newHashSet();

	private final boolean assumeStrictThis;

	public FunctionInjector(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.common.base.Supplier<java.lang.String> safeNameIdSupplier, boolean allowDecomposition, boolean assumeStrictThis) {
		com.google.common.base.Preconditions.checkNotNull(compiler);
		com.google.common.base.Preconditions.checkNotNull(safeNameIdSupplier);
		this.compiler = compiler;
		this.safeNameIdSupplier = safeNameIdSupplier;
		this.allowDecomposition = allowDecomposition;
		this.assumeStrictThis = assumeStrictThis;
	}

	enum InliningMode {
DIRECT, BLOCK;	}

	static class Reference {
		final com.google.javascript.rhino.Node callNode;

		final com.google.javascript.jscomp.JSModule module;

		final com.google.javascript.jscomp.FunctionInjector.InliningMode mode;

		Reference(com.google.javascript.rhino.Node callNode, com.google.javascript.jscomp.JSModule module, com.google.javascript.jscomp.FunctionInjector.InliningMode mode) {
			this.callNode = callNode;
			this.module = module;
			this.mode = mode;
		}
	}

	private static final int NAME_COST_ESTIMATE = com.google.javascript.jscomp.InlineCostEstimator.ESTIMATED_IDENTIFIER_COST;

	private static final int COMMA_COST = 1;

	private static final int PAREN_COST = 2;

	boolean doesFunctionMeetMinimumRequirements(final java.lang.String fnName, com.google.javascript.rhino.Node fnNode) {
		com.google.javascript.rhino.Node block = com.google.javascript.jscomp.NodeUtil.getFunctionBody(fnNode);
		final java.lang.String fnRecursionName = fnNode.getFirstChild().getString();
		com.google.common.base.Preconditions.checkState((fnRecursionName != null));
		com.google.common.base.Predicate<com.google.javascript.rhino.Node> p = new com.google.common.base.Predicate<com.google.javascript.rhino.Node>() {
			public boolean apply(com.google.javascript.rhino.Node n) {
				if ((n.getType()) == (com.google.javascript.rhino.Token.NAME)) {
					return (((n.getString().equals("arguments")) || (n.getString().equals("eval"))) || (n.getString().equals(fnName))) || ((!(fnRecursionName.isEmpty())) && (n.getString().equals(fnRecursionName)));
				}
				return false;
			}
		};
		return !(com.google.javascript.jscomp.NodeUtil.has(block, p, com.google.common.base.Predicates.<com.google.javascript.rhino.Node>alwaysTrue()));
	}

	com.google.javascript.jscomp.FunctionInjector.CanInlineResult canInlineReferenceToFunction(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node callNode, com.google.javascript.rhino.Node fnNode, java.util.Set<java.lang.String> needAliases, com.google.javascript.jscomp.FunctionInjector.InliningMode mode, boolean referencesThis, boolean containsFunctions) {
		if (!(isSupportedCallType(callNode))) {
			return com.google.javascript.jscomp.FunctionInjector.CanInlineResult.NO;
		}
		if (containsFunctions && (!(t.inGlobalScope()))) {
			return com.google.javascript.jscomp.FunctionInjector.CanInlineResult.NO;
		}
		if (referencesThis && (!(com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(callNode)))) {
			return com.google.javascript.jscomp.FunctionInjector.CanInlineResult.NO;
		}
		if (mode == (com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT)) {
			return canInlineReferenceDirectly(callNode, fnNode);
		}else {
			return canInlineReferenceAsStatementBlock(t, callNode, fnNode, needAliases);
		}
	}

	private boolean isSupportedCallType(com.google.javascript.rhino.Node callNode) {
		if ((callNode.getFirstChild().getType()) != (com.google.javascript.rhino.Token.NAME)) {
			if (com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(callNode)) {
				if (!(assumeStrictThis)) {
					com.google.javascript.rhino.Node thisValue = callNode.getFirstChild().getNext();
					if ((thisValue == null) || ((thisValue.getType()) != (com.google.javascript.rhino.Token.THIS))) {
						return false;
					}
				}
			}else
				if (com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(callNode)) {
					return false;
				}
			
		}
		return true;
	}

	com.google.javascript.rhino.Node inline(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node callNode, java.lang.String fnName, com.google.javascript.rhino.Node fnNode, com.google.javascript.jscomp.FunctionInjector.InliningMode mode) {
		com.google.common.base.Preconditions.checkState(compiler.getLifeCycleStage().isNormalized());
		if (mode == (com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT)) {
			return inlineReturnValue(callNode, fnNode);
		}else {
			return inlineFunction(callNode, fnNode, fnName);
		}
	}

	private com.google.javascript.rhino.Node inlineReturnValue(com.google.javascript.rhino.Node callNode, com.google.javascript.rhino.Node fnNode) {
		com.google.javascript.rhino.Node block = fnNode.getLastChild();
		com.google.javascript.rhino.Node callParentNode = callNode.getParent();
		java.util.Map<java.lang.String, com.google.javascript.rhino.Node> argMap = com.google.javascript.jscomp.FunctionArgumentInjector.getFunctionCallParameterMap(fnNode, callNode, com.google.javascript.jscomp.FunctionInjector.this.safeNameIdSupplier);
		com.google.javascript.rhino.Node newExpression;
		if (!(block.hasChildren())) {
			com.google.javascript.rhino.Node srcLocation = block;
			newExpression = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(srcLocation);
		}else {
			com.google.javascript.rhino.Node returnNode = block.getFirstChild();
			com.google.common.base.Preconditions.checkArgument(((returnNode.getType()) == (com.google.javascript.rhino.Token.RETURN)));
			com.google.javascript.rhino.Node safeReturnNode = returnNode.cloneTree();
			com.google.javascript.rhino.Node inlineResult = com.google.javascript.jscomp.FunctionArgumentInjector.inject(null, safeReturnNode, null, argMap);
			com.google.common.base.Preconditions.checkArgument((safeReturnNode == inlineResult));
			newExpression = safeReturnNode.removeFirstChild();
		}
		callParentNode.replaceChild(callNode, newExpression);
		return newExpression;
	}

	private enum CallSiteType {
UNSUPPORTED, SIMPLE_CALL, SIMPLE_ASSIGNMENT, VAR_DECL_SIMPLE_ASSIGNMENT, EXPRESSION, DECOMPOSABLE_EXPRESSION;	}

	private com.google.javascript.jscomp.FunctionInjector.CallSiteType classifyCallSite(com.google.javascript.rhino.Node callNode) {
		com.google.javascript.rhino.Node parent = callNode.getParent();
		com.google.javascript.rhino.Node grandParent = parent.getParent();
		if (com.google.javascript.jscomp.NodeUtil.isExprCall(parent)) {
			return com.google.javascript.jscomp.FunctionInjector.CallSiteType.SIMPLE_CALL;
		}else
			if ((((com.google.javascript.jscomp.NodeUtil.isExprAssign(grandParent)) && (!(com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(callNode, parent)))) && ((parent.getFirstChild().getType()) == (com.google.javascript.rhino.Token.NAME))) && (!(com.google.javascript.jscomp.NodeUtil.isConstantName(parent.getFirstChild())))) {
				return com.google.javascript.jscomp.FunctionInjector.CallSiteType.SIMPLE_ASSIGNMENT;
			}else
				if (((((parent.getType()) == (com.google.javascript.rhino.Token.NAME)) && (!(com.google.javascript.jscomp.NodeUtil.isConstantName(parent)))) && ((grandParent.getType()) == (com.google.javascript.rhino.Token.VAR))) && (grandParent.hasOneChild())) {
					return com.google.javascript.jscomp.FunctionInjector.CallSiteType.VAR_DECL_SIMPLE_ASSIGNMENT;
				}else {
					com.google.javascript.rhino.Node expressionRoot = com.google.javascript.jscomp.ExpressionDecomposer.findExpressionRoot(callNode);
					if (expressionRoot != null) {
						com.google.javascript.jscomp.ExpressionDecomposer decomposer = new com.google.javascript.jscomp.ExpressionDecomposer(compiler, safeNameIdSupplier, knownConstants);
						com.google.javascript.jscomp.ExpressionDecomposer.DecompositionType type = decomposer.canExposeExpression(callNode);
						if (type == (com.google.javascript.jscomp.ExpressionDecomposer.DecompositionType.MOVABLE)) {
							return com.google.javascript.jscomp.FunctionInjector.CallSiteType.EXPRESSION;
						}else
							if (type == (com.google.javascript.jscomp.ExpressionDecomposer.DecompositionType.DECOMPOSABLE)) {
								return com.google.javascript.jscomp.FunctionInjector.CallSiteType.DECOMPOSABLE_EXPRESSION;
							}else {
								com.google.common.base.Preconditions.checkState((type == (com.google.javascript.jscomp.ExpressionDecomposer.DecompositionType.UNDECOMPOSABLE)));
							}
						
					}
				}
			
		
		return com.google.javascript.jscomp.FunctionInjector.CallSiteType.UNSUPPORTED;
	}

	private com.google.javascript.rhino.Node inlineFunction(com.google.javascript.rhino.Node callNode, com.google.javascript.rhino.Node fnNode, java.lang.String fnName) {
		com.google.javascript.rhino.Node parent = callNode.getParent();
		com.google.javascript.rhino.Node grandParent = parent.getParent();
		com.google.javascript.jscomp.FunctionInjector.CallSiteType callSiteType = classifyCallSite(callNode);
		com.google.common.base.Preconditions.checkArgument((callSiteType != (com.google.javascript.jscomp.FunctionInjector.CallSiteType.UNSUPPORTED)));
		java.lang.String resultName = null;
		boolean needsDefaultReturnResult = true;
		switch (callSiteType) {
			case SIMPLE_ASSIGNMENT :
				resultName = parent.getFirstChild().getString();
				break;
			case VAR_DECL_SIMPLE_ASSIGNMENT :
				resultName = parent.getString();
				break;
			case SIMPLE_CALL :
				resultName = null;
				needsDefaultReturnResult = false;
				break;
			case EXPRESSION :
				resultName = getUniqueResultName();
				needsDefaultReturnResult = false;
				break;
			case DECOMPOSABLE_EXPRESSION :
				throw new java.lang.IllegalStateException("Decomposable expressions must decomposed before inlining.");
			default :
				throw new java.lang.IllegalStateException("Unexpected call site type.");
		}
		boolean isCallInLoop = com.google.javascript.jscomp.NodeUtil.isWithinLoop(callNode);
		com.google.javascript.jscomp.FunctionToBlockMutator mutator = new com.google.javascript.jscomp.FunctionToBlockMutator(compiler, com.google.javascript.jscomp.FunctionInjector.this.safeNameIdSupplier);
		com.google.javascript.rhino.Node newBlock = mutator.mutate(fnName, fnNode, callNode, resultName, needsDefaultReturnResult, isCallInLoop);
		com.google.javascript.rhino.Node greatGrandParent = grandParent.getParent();
		switch (callSiteType) {
			case VAR_DECL_SIMPLE_ASSIGNMENT :
				parent.removeChild(parent.getFirstChild());
				com.google.common.base.Preconditions.checkState(((parent.getFirstChild()) == null));
				greatGrandParent.addChildAfter(newBlock, grandParent);
				break;
			case SIMPLE_ASSIGNMENT :
				com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.NodeUtil.isExpressionNode(grandParent));
				greatGrandParent.replaceChild(grandParent, newBlock);
				break;
			case SIMPLE_CALL :
				com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.NodeUtil.isExpressionNode(parent));
				grandParent.replaceChild(parent, newBlock);
				break;
			case EXPRESSION :
				com.google.javascript.rhino.Node injectionPoint = com.google.javascript.jscomp.ExpressionDecomposer.findInjectionPoint(callNode);
				com.google.common.base.Preconditions.checkNotNull(injectionPoint);
				com.google.javascript.rhino.Node injectionPointParent = injectionPoint.getParent();
				com.google.common.base.Preconditions.checkNotNull(injectionPointParent);
				com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.NodeUtil.isStatementBlock(injectionPointParent));
				newBlock.addChildrenToFront(com.google.javascript.jscomp.NodeUtil.newVarNode(resultName, null).copyInformationFromForTree(callNode));
				injectionPointParent.addChildBefore(newBlock, injectionPoint);
				parent.replaceChild(callNode, com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, resultName));
				break;
			default :
				throw new java.lang.IllegalStateException("Unexpected call site type.");
		}
		return newBlock;
	}

	boolean isDirectCallNodeReplacementPossible(com.google.javascript.rhino.Node fnNode) {
		com.google.javascript.rhino.Node block = com.google.javascript.jscomp.NodeUtil.getFunctionBody(fnNode);
		if (!(block.hasChildren())) {
			return true;
		}else
			if (block.hasOneChild()) {
				if (((block.getFirstChild().getType()) == (com.google.javascript.rhino.Token.RETURN)) && ((block.getFirstChild().getFirstChild()) != null)) {
					return true;
				}
			}
		
		return false;
	}

	enum CanInlineResult {
YES, AFTER_DECOMPOSITION, NO;	}

	private com.google.javascript.jscomp.FunctionInjector.CanInlineResult canInlineReferenceAsStatementBlock(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node callNode, com.google.javascript.rhino.Node fnNode, java.util.Set<java.lang.String> namesToAlias) {
		com.google.javascript.jscomp.FunctionInjector.CallSiteType callSiteType = classifyCallSite(callNode);
		if (callSiteType == (com.google.javascript.jscomp.FunctionInjector.CallSiteType.UNSUPPORTED)) {
			return com.google.javascript.jscomp.FunctionInjector.CanInlineResult.NO;
		}
		if ((!(allowDecomposition)) && (callSiteType == (com.google.javascript.jscomp.FunctionInjector.CallSiteType.DECOMPOSABLE_EXPRESSION))) {
			return com.google.javascript.jscomp.FunctionInjector.CanInlineResult.NO;
		}
		if (!(callMeetsBlockInliningRequirements(t, callNode, fnNode, namesToAlias))) {
			return com.google.javascript.jscomp.FunctionInjector.CanInlineResult.NO;
		}
		if (callSiteType == (com.google.javascript.jscomp.FunctionInjector.CallSiteType.DECOMPOSABLE_EXPRESSION)) {
			return com.google.javascript.jscomp.FunctionInjector.CanInlineResult.AFTER_DECOMPOSITION;
		}else {
			return com.google.javascript.jscomp.FunctionInjector.CanInlineResult.YES;
		}
	}

	private boolean callMeetsBlockInliningRequirements(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node callNode, com.google.javascript.rhino.Node fnNode, java.util.Set<java.lang.String> namesToAlias) {
		boolean fnContainsVars = com.google.javascript.jscomp.NodeUtil.has(com.google.javascript.jscomp.NodeUtil.getFunctionBody(fnNode), new com.google.javascript.jscomp.NodeUtil.MatchDeclaration(), new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement());
		boolean callerContainsFunction = false;
		if (!(t.inGlobalScope())) {
			com.google.javascript.rhino.Node fnCaller = t.getScopeRoot();
			com.google.javascript.rhino.Node fnCallerBody = fnCaller.getLastChild();
			callerContainsFunction = com.google.javascript.jscomp.NodeUtil.containsFunction(fnCallerBody);
		}
		if (fnContainsVars && callerContainsFunction) {
			return false;
		}
		if (callerContainsFunction) {
			java.util.Map<java.lang.String, com.google.javascript.rhino.Node> args = com.google.javascript.jscomp.FunctionArgumentInjector.getFunctionCallParameterMap(fnNode, callNode, com.google.javascript.jscomp.FunctionInjector.this.safeNameIdSupplier);
			boolean hasArgs = !(args.isEmpty());
			if (hasArgs) {
				java.util.Set<java.lang.String> allNamesToAlias = com.google.common.collect.Sets.newHashSet(namesToAlias);
				com.google.javascript.jscomp.FunctionArgumentInjector.maybeAddTempsForCallArguments(fnNode, args, allNamesToAlias, compiler.getCodingConvention());
				if (!(allNamesToAlias.isEmpty())) {
					return false;
				}
			}
		}
		return true;
	}

	private com.google.javascript.jscomp.FunctionInjector.CanInlineResult canInlineReferenceDirectly(com.google.javascript.rhino.Node callNode, com.google.javascript.rhino.Node fnNode) {
		if (!(isDirectCallNodeReplacementPossible(fnNode))) {
			return com.google.javascript.jscomp.FunctionInjector.CanInlineResult.NO;
		}
		com.google.javascript.rhino.Node block = fnNode.getLastChild();
		com.google.javascript.rhino.Node cArg = callNode.getFirstChild().getNext();
		if ((callNode.getFirstChild().getType()) != (com.google.javascript.rhino.Token.NAME)) {
			if (com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(callNode)) {
				if ((cArg == null) || ((cArg.getType()) != (com.google.javascript.rhino.Token.THIS))) {
					return com.google.javascript.jscomp.FunctionInjector.CanInlineResult.NO;
				}
				cArg = cArg.getNext();
			}else {
				com.google.common.base.Preconditions.checkState((!(com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(callNode))));
			}
		}
		com.google.javascript.rhino.Node fnParam = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(fnNode).getFirstChild();
		while ((cArg != null) || (fnParam != null)) {
			if (fnParam != null) {
				if (cArg != null) {
					if ((com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(cArg)) && ((com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(block, fnParam.getString())) > 1)) {
						return com.google.javascript.jscomp.FunctionInjector.CanInlineResult.NO;
					}
				}
				fnParam = fnParam.getNext();
			}
			if (cArg != null) {
				if (com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(cArg)) {
					return com.google.javascript.jscomp.FunctionInjector.CanInlineResult.NO;
				}
				cArg = cArg.getNext();
			}
		} 
		return com.google.javascript.jscomp.FunctionInjector.CanInlineResult.YES;
	}

	private java.lang.String getUniqueResultName() {
		return ("JSCompiler_inline_result" + (com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer.UNIQUE_ID_SEPARATOR)) + (safeNameIdSupplier.get());
	}

	boolean inliningLowersCost(com.google.javascript.jscomp.JSModule fnModule, com.google.javascript.rhino.Node fnNode, java.util.Collection<? extends com.google.javascript.jscomp.FunctionInjector.Reference> refs, java.util.Set<java.lang.String> namesToAlias, boolean isRemovable, boolean referencesThis) {
		int referenceCount = refs.size();
		if (referenceCount == 0) {
			return true;
		}
		int referencesUsingBlockInlining = 0;
		boolean checkModules = isRemovable && (fnModule != null);
		com.google.javascript.jscomp.JSModuleGraph moduleGraph = compiler.getModuleGraph();
		for (com.google.javascript.jscomp.FunctionInjector.Reference ref : refs) {
			if ((ref.mode) == (com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK)) {
				referencesUsingBlockInlining++;
			}
			if (checkModules && ((ref.module) != null)) {
				if (((ref.module) != fnModule) && (!(moduleGraph.dependsOn(ref.module, fnModule)))) {
					isRemovable = false;
					checkModules = false;
				}
			}
		}
		int referencesUsingDirectInlining = referenceCount - referencesUsingBlockInlining;
		if (((referenceCount == 1) && isRemovable) && (referencesUsingDirectInlining == 1)) {
			return true;
		}
		int callCost = com.google.javascript.jscomp.FunctionInjector.estimateCallCost(fnNode, referencesThis);
		int overallCallCost = callCost * referenceCount;
		int costDeltaDirect = com.google.javascript.jscomp.FunctionInjector.inlineCostDelta(fnNode, namesToAlias, com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT);
		int costDeltaBlock = com.google.javascript.jscomp.FunctionInjector.inlineCostDelta(fnNode, namesToAlias, com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK);
		return doesLowerCost(fnNode, overallCallCost, referencesUsingDirectInlining, costDeltaDirect, referencesUsingBlockInlining, costDeltaBlock, isRemovable);
	}

	private boolean doesLowerCost(com.google.javascript.rhino.Node fnNode, int callCost, int directInlines, int costDeltaDirect, int blockInlines, int costDeltaBlock, boolean removable) {
		int fnInstanceCount = (directInlines + blockInlines) - (removable ? 1 : 0);
		if (fnInstanceCount == 0) {
			if ((blockInlines > 0) && (costDeltaBlock > 0)) {
				return false;
			}
			return true;
		}
		int costDelta = (directInlines * costDeltaDirect) + (blockInlines * costDeltaBlock);
		int threshold = (callCost - costDelta) / fnInstanceCount;
		return (com.google.javascript.jscomp.InlineCostEstimator.getCost(fnNode, (threshold + 1))) <= threshold;
	}

	private static int estimateCallCost(com.google.javascript.rhino.Node fnNode, boolean referencesThis) {
		com.google.javascript.rhino.Node argsNode = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(fnNode);
		int numArgs = argsNode.getChildCount();
		int callCost = (com.google.javascript.jscomp.FunctionInjector.NAME_COST_ESTIMATE) + (com.google.javascript.jscomp.FunctionInjector.PAREN_COST);
		if (numArgs > 0) {
			callCost += (numArgs * (com.google.javascript.jscomp.FunctionInjector.NAME_COST_ESTIMATE)) + ((numArgs - 1) * (com.google.javascript.jscomp.FunctionInjector.COMMA_COST));
		}
		if (referencesThis) {
			callCost += 5 + 5;
		}
		return callCost;
	}

	private static int inlineCostDelta(com.google.javascript.rhino.Node fnNode, java.util.Set<java.lang.String> namesToAlias, com.google.javascript.jscomp.FunctionInjector.InliningMode mode) {
		int paramCount = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(fnNode).getChildCount();
		int commaCount = paramCount > 1 ? paramCount - 1 : 0;
		int costDeltaFunctionOverhead = (15 + commaCount) + (paramCount * (com.google.javascript.jscomp.InlineCostEstimator.ESTIMATED_IDENTIFIER_COST));
		com.google.javascript.rhino.Node block = fnNode.getLastChild();
		if (!(block.hasChildren())) {
			return -costDeltaFunctionOverhead;
		}
		if (mode == (com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT)) {
			return -(costDeltaFunctionOverhead + 7);
		}else {
			int aliasCount = namesToAlias.size();
			final int INLINE_BLOCK_OVERHEAD = 4;
			final int PER_RETURN_OVERHEAD = 2;
			final int PER_RETURN_RESULT_OVERHEAD = 3;
			final int PER_ALIAS_OVERHEAD = 3;
			int returnCount = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(block, com.google.javascript.rhino.Token.RETURN, new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement());
			int resultCount = returnCount > 0 ? returnCount - 1 : 0;
			int baseOverhead = returnCount > 0 ? INLINE_BLOCK_OVERHEAD : 0;
			int overhead = ((baseOverhead + (returnCount * PER_RETURN_OVERHEAD)) + (resultCount * PER_RETURN_RESULT_OVERHEAD)) + (aliasCount * PER_ALIAS_OVERHEAD);
			return overhead - costDeltaFunctionOverhead;
		}
	}

	public void setKnownConstants(java.util.Set<java.lang.String> knownConstants) {
		com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.FunctionInjector.this.knownConstants.isEmpty());
		com.google.javascript.jscomp.FunctionInjector.this.knownConstants = knownConstants;
	}
}


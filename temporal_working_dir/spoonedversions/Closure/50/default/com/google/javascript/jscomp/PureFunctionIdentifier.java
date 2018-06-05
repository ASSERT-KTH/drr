

package com.google.javascript.jscomp;


class PureFunctionIdentifier implements com.google.javascript.jscomp.CompilerPass {
	static final com.google.javascript.jscomp.DiagnosticType INVALID_NO_SIDE_EFFECT_ANNOTATION = com.google.javascript.jscomp.DiagnosticType.error("JSC_INVALID_NO_SIDE_EFFECT_ANNOTATION", "@nosideeffects may only appear in externs files.");

	static final com.google.javascript.jscomp.DiagnosticType INVALID_MODIFIES_ANNOTATION = com.google.javascript.jscomp.DiagnosticType.error("JSC_INVALID_MODIFIES_ANNOTATION", "@modifies may only appear in externs files.");

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.DefinitionProvider definitionProvider;

	private final java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation> functionSideEffectMap;

	private final java.util.List<com.google.javascript.rhino.Node> allFunctionCalls;

	private com.google.javascript.rhino.Node externs;

	private com.google.javascript.rhino.Node root;

	public PureFunctionIdentifier(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.DefinitionProvider definitionProvider) {
		this.compiler = compiler;
		this.definitionProvider = definitionProvider;
		this.functionSideEffectMap = com.google.common.collect.Maps.newHashMap();
		this.allFunctionCalls = com.google.common.collect.Lists.newArrayList();
		com.google.javascript.jscomp.PureFunctionIdentifier.this.externs = null;
		com.google.javascript.jscomp.PureFunctionIdentifier.this.root = null;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externsAst, com.google.javascript.rhino.Node srcAst) {
		if (((externs) != null) || ((root) != null)) {
			throw new java.lang.IllegalStateException(("It is illegal to call PureFunctionIdentifier.process " + ("twice the same instance.  Please use a new " + "PureFunctionIdentifier instance each time.")));
		}
		externs = externsAst;
		root = srcAst;
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, externs, new com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer(true));
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer(false));
		propagateSideEffects();
		markPureFunctionCalls();
	}

	java.lang.String getDebugReport() {
		com.google.common.base.Preconditions.checkNotNull(externs);
		com.google.common.base.Preconditions.checkNotNull(root);
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		com.google.javascript.jscomp.FunctionNames functionNames = new com.google.javascript.jscomp.FunctionNames(compiler);
		functionNames.process(null, externs);
		functionNames.process(null, root);
		sb.append("Pure functions:\n");
		for (java.util.Map.Entry<com.google.javascript.rhino.Node, com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation> entry : functionSideEffectMap.entrySet()) {
			com.google.javascript.rhino.Node function = entry.getKey();
			com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation functionInfo = entry.getValue();
			boolean isPure = (functionInfo.mayBePure()) && (!(functionInfo.mayHaveSideEffects()));
			if (isPure) {
				sb.append((("  " + (functionNames.getFunctionName(function))) + "\n"));
			}
		}
		sb.append("\n");
		for (java.util.Map.Entry<com.google.javascript.rhino.Node, com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation> entry : functionSideEffectMap.entrySet()) {
			com.google.javascript.rhino.Node function = entry.getKey();
			com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation functionInfo = entry.getValue();
			java.util.Set<java.lang.String> depFunctionNames = com.google.common.collect.Sets.newHashSet();
			for (com.google.javascript.rhino.Node callSite : functionInfo.getCallsInFunctionBody()) {
				java.util.Collection<com.google.javascript.jscomp.DefinitionsRemover.Definition> defs = com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(definitionProvider, callSite.getFirstChild());
				if (defs == null) {
					depFunctionNames.add("<null def list>");
					continue;
				}
				for (com.google.javascript.jscomp.DefinitionsRemover.Definition def : defs) {
					depFunctionNames.add(functionNames.getFunctionName(def.getRValue()));
				}
			}
			sb.append(((((((functionNames.getFunctionName(function)) + " ") + (functionInfo.toString())) + " Calls: ") + depFunctionNames) + "\n"));
		}
		return sb.toString();
	}

	private static java.util.Collection<com.google.javascript.jscomp.DefinitionsRemover.Definition> getCallableDefinitions(com.google.javascript.jscomp.DefinitionProvider definitionProvider, com.google.javascript.rhino.Node name) {
		if ((com.google.javascript.jscomp.NodeUtil.isGetProp(name)) || (com.google.javascript.jscomp.NodeUtil.isName(name))) {
			java.util.List<com.google.javascript.jscomp.DefinitionsRemover.Definition> result = com.google.common.collect.Lists.newArrayList();
			java.util.Collection<com.google.javascript.jscomp.DefinitionsRemover.Definition> decls = definitionProvider.getDefinitionsReferencedAt(name);
			if (decls == null) {
				return null;
			}
			for (com.google.javascript.jscomp.DefinitionsRemover.Definition current : decls) {
				com.google.javascript.rhino.Node rValue = current.getRValue();
				if ((rValue != null) && (com.google.javascript.jscomp.NodeUtil.isFunction(rValue))) {
					result.add(current);
				}else {
					return null;
				}
			}
			return result;
		}else
			if (((name.getType()) == (com.google.javascript.rhino.Token.OR)) || ((name.getType()) == (com.google.javascript.rhino.Token.HOOK))) {
				com.google.javascript.rhino.Node firstVal;
				if ((name.getType()) == (com.google.javascript.rhino.Token.HOOK)) {
					firstVal = name.getFirstChild().getNext();
				}else {
					firstVal = name.getFirstChild();
				}
				java.util.Collection<com.google.javascript.jscomp.DefinitionsRemover.Definition> defs1 = com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(definitionProvider, firstVal);
				java.util.Collection<com.google.javascript.jscomp.DefinitionsRemover.Definition> defs2 = com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(definitionProvider, firstVal.getNext());
				if ((defs1 != null) && (defs2 != null)) {
					defs1.addAll(defs2);
					return defs1;
				}else {
					return null;
				}
			}else
				if (com.google.javascript.jscomp.NodeUtil.isFunctionExpression(name)) {
					return com.google.common.collect.Lists.newArrayList(((com.google.javascript.jscomp.DefinitionsRemover.Definition) (new com.google.javascript.jscomp.DefinitionsRemover.FunctionExpressionDefinition(name, false))));
				}else {
					return null;
				}
			
		
	}

	private void propagateSideEffects() {
		com.google.javascript.jscomp.graph.DiGraph<com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation, com.google.javascript.rhino.Node> sideEffectGraph = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
		for (com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation functionInfo : functionSideEffectMap.values()) {
			sideEffectGraph.createNode(functionInfo);
		}
		for (com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation functionInfo : functionSideEffectMap.values()) {
			if (!(functionInfo.mayHaveSideEffects())) {
				continue;
			}
			for (com.google.javascript.rhino.Node callSite : functionInfo.getCallsInFunctionBody()) {
				com.google.javascript.rhino.Node callee = callSite.getFirstChild();
				java.util.Collection<com.google.javascript.jscomp.DefinitionsRemover.Definition> defs = com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(definitionProvider, callee);
				if (defs == null) {
					functionInfo.setTaintsUnknown();
					break;
				}
				for (com.google.javascript.jscomp.DefinitionsRemover.Definition def : defs) {
					com.google.javascript.rhino.Node defValue = def.getRValue();
					com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation dep = functionSideEffectMap.get(defValue);
					com.google.common.base.Preconditions.checkNotNull(dep);
					sideEffectGraph.connect(dep, callSite, functionInfo);
				}
			}
		}
		com.google.javascript.jscomp.graph.FixedPointGraphTraversal.newTraversal(new com.google.javascript.jscomp.PureFunctionIdentifier.SideEffectPropagationCallback()).computeFixedPoint(sideEffectGraph);
		for (com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation functionInfo : functionSideEffectMap.values()) {
			if (functionInfo.mayBePure()) {
				functionInfo.setIsPure();
			}
		}
	}

	private void markPureFunctionCalls() {
		for (com.google.javascript.rhino.Node callNode : allFunctionCalls) {
			com.google.javascript.rhino.Node name = callNode.getFirstChild();
			java.util.Collection<com.google.javascript.jscomp.DefinitionsRemover.Definition> defs = com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(definitionProvider, name);
			com.google.javascript.rhino.Node.SideEffectFlags flags = new com.google.javascript.rhino.Node.SideEffectFlags();
			if (defs == null) {
				flags.setMutatesGlobalState();
				flags.setThrows();
				flags.setReturnsTainted();
			}else {
				flags.clearAllFlags();
				for (com.google.javascript.jscomp.DefinitionsRemover.Definition def : defs) {
					com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation functionInfo = functionSideEffectMap.get(def.getRValue());
					com.google.common.base.Preconditions.checkNotNull(functionInfo);
					if (functionInfo.mutatesGlobalState()) {
						flags.setMutatesGlobalState();
					}
					if (functionInfo.functionThrows) {
						flags.setThrows();
					}
					if (!(com.google.javascript.jscomp.NodeUtil.isNew(callNode))) {
						if (functionInfo.taintsThis) {
							flags.setMutatesThis();
						}
					}
					if (functionInfo.taintsReturn) {
						flags.setReturnsTainted();
					}
					if (flags.areAllFlagsSet()) {
						break;
					}
				}
			}
			if (com.google.javascript.jscomp.NodeUtil.isCall(callNode)) {
				com.google.common.base.Preconditions.checkState(((compiler) != null));
				if (!(com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(callNode, compiler))) {
					flags.clearSideEffectFlags();
				}
			}else
				if (com.google.javascript.jscomp.NodeUtil.isNew(callNode)) {
					if (!(com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(callNode))) {
						flags.clearSideEffectFlags();
					}
				}
			
			callNode.setSideEffectFlags(flags.valueOf());
		}
	}

	private class FunctionAnalyzer implements com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
		private final boolean inExterns;

		FunctionAnalyzer(boolean inExterns) {
			this.inExterns = inExterns;
		}

		@java.lang.Override
		public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal traversal, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
			if (com.google.javascript.jscomp.NodeUtil.isFunction(node)) {
				com.google.javascript.rhino.Node gramp = parent.getParent();
				visitFunction(traversal, node, parent, gramp);
			}
			return true;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal traversal, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
			if (inExterns) {
				return ;
			}
			if ((!(com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node))) && ((node.getType()) != (com.google.javascript.rhino.Token.RETURN))) {
				return ;
			}
			if ((com.google.javascript.jscomp.NodeUtil.isCall(node)) || (com.google.javascript.jscomp.NodeUtil.isNew(node))) {
				allFunctionCalls.add(node);
			}
			com.google.javascript.rhino.Node enclosingFunction = traversal.getEnclosingFunction();
			if (enclosingFunction != null) {
				com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation sideEffectInfo = functionSideEffectMap.get(enclosingFunction);
				com.google.common.base.Preconditions.checkNotNull(sideEffectInfo);
				if (com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node)) {
					visitAssignmentOrUnaryOperator(sideEffectInfo, traversal.getScope(), node, node.getFirstChild(), node.getLastChild());
				}else {
					switch (node.getType()) {
						case com.google.javascript.rhino.Token.CALL :
						case com.google.javascript.rhino.Token.NEW :
							visitCall(sideEffectInfo, node);
							break;
						case com.google.javascript.rhino.Token.DELPROP :
						case com.google.javascript.rhino.Token.DEC :
						case com.google.javascript.rhino.Token.INC :
							visitAssignmentOrUnaryOperator(sideEffectInfo, traversal.getScope(), node, node.getFirstChild(), null);
							break;
						case com.google.javascript.rhino.Token.NAME :
							com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node));
							com.google.javascript.rhino.Node value = node.getFirstChild();
							if ((value != null) && (!(com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(value)))) {
								com.google.javascript.jscomp.Scope scope = traversal.getScope();
								com.google.javascript.jscomp.Scope.Var var = scope.getVar(node.getString());
								sideEffectInfo.blacklistLocal(var);
							}
							break;
						case com.google.javascript.rhino.Token.THROW :
							visitThrow(sideEffectInfo);
							break;
						case com.google.javascript.rhino.Token.RETURN :
							if ((node.hasChildren()) && (!(com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node.getFirstChild())))) {
								sideEffectInfo.setTaintsReturn();
							}
							break;
						default :
							throw new java.lang.IllegalArgumentException(("Unhandled side effect node type " + (com.google.javascript.rhino.Token.name(node.getType()))));
					}
				}
			}
		}

		@java.lang.Override
		public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
		}

		@java.lang.Override
		public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
			if (t.inGlobalScope()) {
				return ;
			}
			com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation sideEffectInfo = functionSideEffectMap.get(t.getScopeRoot());
			if (sideEffectInfo.mutatesGlobalState()) {
				sideEffectInfo.resetLocalVars();
				return ;
			}
			for (java.util.Iterator<com.google.javascript.jscomp.Scope.Var> i = t.getScope().getVars(); i.hasNext();) {
				com.google.javascript.jscomp.Scope.Var v = i.next();
				boolean localVar = false;
				if ((v.getParentNode().getType()) == (com.google.javascript.rhino.Token.VAR)) {
					sideEffectInfo.knownLocals.add(v.getName());
					localVar = true;
				}
				if ((!localVar) || (sideEffectInfo.blacklisted.contains(v))) {
					if (sideEffectInfo.taintedLocals.contains(v)) {
						sideEffectInfo.setTaintsUnknown();
						sideEffectInfo.resetLocalVars();
						break;
					}
				}
			}
			sideEffectInfo.taintedLocals = null;
			sideEffectInfo.blacklisted = null;
		}

		private void visitAssignmentOrUnaryOperator(com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation sideEffectInfo, com.google.javascript.jscomp.Scope scope, com.google.javascript.rhino.Node op, com.google.javascript.rhino.Node lhs, com.google.javascript.rhino.Node rhs) {
			if (com.google.javascript.jscomp.NodeUtil.isName(lhs)) {
				com.google.javascript.jscomp.Scope.Var var = scope.getVar(lhs.getString());
				if ((var == null) || ((var.scope) != scope)) {
					sideEffectInfo.setTaintsGlobalState();
				}else {
					com.google.common.base.Preconditions.checkState((((com.google.javascript.jscomp.NodeUtil.isAssignmentOp(op)) || (com.google.javascript.jscomp.PureFunctionIdentifier.isIncDec(op))) || ((op.getType()) == (com.google.javascript.rhino.Token.DELPROP))));
					if (((rhs != null) && (com.google.javascript.jscomp.NodeUtil.isAssign(op))) && (!(com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(rhs)))) {
						sideEffectInfo.blacklistLocal(var);
					}
				}
			}else
				if (com.google.javascript.jscomp.NodeUtil.isGet(lhs)) {
					if (com.google.javascript.jscomp.NodeUtil.isThis(lhs.getFirstChild())) {
						sideEffectInfo.setTaintsThis();
					}else {
						com.google.javascript.jscomp.Scope.Var var = null;
						com.google.javascript.rhino.Node objectNode = lhs.getFirstChild();
						if (com.google.javascript.jscomp.NodeUtil.isName(objectNode)) {
							var = scope.getVar(objectNode.getString());
						}
						if ((var == null) || ((var.scope) != scope)) {
							sideEffectInfo.setTaintsUnknown();
						}else {
							sideEffectInfo.addTaintedLocalObject(var);
						}
					}
				}else {
					sideEffectInfo.setTaintsUnknown();
				}
			
		}

		private void visitCall(com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation sideEffectInfo, com.google.javascript.rhino.Node node) {
			if ((com.google.javascript.jscomp.NodeUtil.isCall(node)) && (!(com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(node, compiler)))) {
				return ;
			}
			if ((com.google.javascript.jscomp.NodeUtil.isNew(node)) && (!(com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(node)))) {
				return ;
			}
			sideEffectInfo.appendCall(node);
		}

		private void visitFunction(com.google.javascript.jscomp.NodeTraversal traversal, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node gramp) {
			com.google.common.base.Preconditions.checkArgument((!(functionSideEffectMap.containsKey(node))));
			com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation sideEffectInfo = new com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation(inExterns);
			functionSideEffectMap.put(node, sideEffectInfo);
			if (inExterns) {
				com.google.javascript.rhino.jstype.JSType jstype = node.getJSType();
				boolean knownLocalResult = false;
				com.google.javascript.rhino.jstype.FunctionType functionType = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(jstype);
				if (functionType != null) {
					com.google.javascript.rhino.jstype.JSType jstypeReturn = functionType.getReturnType();
					if (isLocalValueType(jstypeReturn, true)) {
						knownLocalResult = true;
					}
				}
				if (!knownLocalResult) {
					sideEffectInfo.setTaintsReturn();
				}
			}
			com.google.javascript.rhino.JSDocInfo info = getJSDocInfoForFunction(node, parent, gramp);
			if (info != null) {
				boolean hasSpecificSideEffects = false;
				if (hasSideEffectsThisAnnotation(info)) {
					if (inExterns) {
						hasSpecificSideEffects = true;
						sideEffectInfo.setTaintsThis();
					}else {
						traversal.report(node, com.google.javascript.jscomp.PureFunctionIdentifier.INVALID_MODIFIES_ANNOTATION);
					}
				}
				if (hasSideEffectsArgumentsAnnotation(info)) {
					if (inExterns) {
						hasSpecificSideEffects = true;
						sideEffectInfo.setTaintsArguments();
					}else {
						traversal.report(node, com.google.javascript.jscomp.PureFunctionIdentifier.INVALID_MODIFIES_ANNOTATION);
					}
				}
				if (!hasSpecificSideEffects) {
					if (hasNoSideEffectsAnnotation(info)) {
						if (inExterns) {
							sideEffectInfo.setIsPure();
						}else {
							traversal.report(node, com.google.javascript.jscomp.PureFunctionIdentifier.INVALID_NO_SIDE_EFFECT_ANNOTATION);
						}
					}else
						if (inExterns) {
							sideEffectInfo.setTaintsGlobalState();
						}
					
				}
			}else {
				if (inExterns) {
					sideEffectInfo.setTaintsGlobalState();
				}
			}
		}

		private boolean isLocalValueType(com.google.javascript.rhino.jstype.JSType jstype, boolean recurse) {
			com.google.common.base.Preconditions.checkNotNull(jstype);
			com.google.javascript.rhino.jstype.JSType subtype = jstype.getGreatestSubtype(compiler.getTypeRegistry().getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE));
			return subtype.isNoType();
		}

		private void visitThrow(com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation sideEffectInfo) {
			sideEffectInfo.setFunctionThrows();
		}

		private com.google.javascript.rhino.JSDocInfo getJSDocInfoForFunction(com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node gramp) {
			com.google.javascript.rhino.JSDocInfo info = node.getJSDocInfo();
			if (info != null) {
				return info;
			}else
				if (com.google.javascript.jscomp.NodeUtil.isName(parent)) {
					return gramp.hasOneChild() ? gramp.getJSDocInfo() : null;
				}else
					if (com.google.javascript.jscomp.NodeUtil.isAssign(parent)) {
						return parent.getJSDocInfo();
					}else {
						return null;
					}
				
			
		}

		private boolean hasNoSideEffectsAnnotation(com.google.javascript.rhino.JSDocInfo docInfo) {
			com.google.common.base.Preconditions.checkNotNull(docInfo);
			return docInfo.isNoSideEffects();
		}

		private boolean hasSideEffectsThisAnnotation(com.google.javascript.rhino.JSDocInfo docInfo) {
			com.google.common.base.Preconditions.checkNotNull(docInfo);
			return docInfo.getModifies().contains("this");
		}

		private boolean hasSideEffectsArgumentsAnnotation(com.google.javascript.rhino.JSDocInfo docInfo) {
			com.google.common.base.Preconditions.checkNotNull(docInfo);
			java.util.Set<java.lang.String> modifies = docInfo.getModifies();
			return ((modifies.size()) > 1) || (((modifies.size()) == 1) && (!(modifies.contains("this"))));
		}
	}

	private static boolean isIncDec(com.google.javascript.rhino.Node n) {
		int type = n.getType();
		return (type == (com.google.javascript.rhino.Token.INC)) || (type == (com.google.javascript.rhino.Token.DEC));
	}

	@java.lang.SuppressWarnings(value = "unused")
	private static boolean isKnownLocalValue(final com.google.javascript.rhino.Node value) {
		com.google.common.base.Predicate<com.google.javascript.rhino.Node> taintingPredicate = new com.google.common.base.Predicate<com.google.javascript.rhino.Node>() {
			@java.lang.Override
			public boolean apply(com.google.javascript.rhino.Node value) {
				switch (value.getType()) {
					case com.google.javascript.rhino.Token.ASSIGN :
						return false;
					case com.google.javascript.rhino.Token.THIS :
						return false;
					case com.google.javascript.rhino.Token.NAME :
						return false;
					case com.google.javascript.rhino.Token.GETELEM :
					case com.google.javascript.rhino.Token.GETPROP :
						return false;
					case com.google.javascript.rhino.Token.CALL :
						return false;
				}
				return false;
			}
		};
		return com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(value, taintingPredicate);
	}

	private static class SideEffectPropagationCallback implements com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback<com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation, com.google.javascript.rhino.Node> {
		@java.lang.Override
		public boolean traverseEdge(com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation callee, com.google.javascript.rhino.Node callSite, com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation caller) {
			com.google.common.base.Preconditions.checkArgument((((callSite.getType()) == (com.google.javascript.rhino.Token.CALL)) || ((callSite.getType()) == (com.google.javascript.rhino.Token.NEW))));
			boolean changed = false;
			if ((!(caller.mutatesGlobalState())) && (callee.mutatesGlobalState())) {
				caller.setTaintsGlobalState();
				changed = true;
			}
			if ((!(caller.functionThrows())) && (callee.functionThrows())) {
				caller.setFunctionThrows();
				changed = true;
			}
			if (callee.mutatesThis()) {
				if ((callSite.getType()) != (com.google.javascript.rhino.Token.NEW)) {
					com.google.javascript.rhino.Node objectNode = com.google.javascript.jscomp.PureFunctionIdentifier.getCallThisObject(callSite);
					if (((objectNode != null) && (com.google.javascript.jscomp.NodeUtil.isName(objectNode))) && (!(com.google.javascript.jscomp.PureFunctionIdentifier.isCallOrApply(callSite)))) {
						java.lang.String name = objectNode.getString();
						if (!(caller.mutatesGlobalState())) {
							caller.setTaintsGlobalState();
							changed = true;
						}
					}else
						if ((objectNode != null) && (com.google.javascript.jscomp.NodeUtil.isThis(objectNode))) {
							if (!(caller.mutatesThis())) {
								caller.setTaintsThis();
								changed = true;
							}
						}else
							if (((objectNode != null) && (com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(objectNode))) && (!(com.google.javascript.jscomp.PureFunctionIdentifier.isCallOrApply(callSite)))) {
							}else
								if (!(caller.mutatesGlobalState())) {
									caller.setTaintsGlobalState();
									changed = true;
								}
							
						
					
				}
			}
			return changed;
		}
	}

	private static com.google.javascript.rhino.Node getCallThisObject(com.google.javascript.rhino.Node callSite) {
		com.google.javascript.rhino.Node callTarget = callSite.getFirstChild();
		if (!(com.google.javascript.jscomp.NodeUtil.isGet(callTarget))) {
			return null;
		}
		java.lang.String propString = callTarget.getLastChild().getString();
		if ((propString.equals("call")) || (propString.equals("apply"))) {
			return callTarget.getNext();
		}else {
			return callTarget.getFirstChild();
		}
	}

	private static boolean isCallOrApply(com.google.javascript.rhino.Node callSite) {
		com.google.javascript.rhino.Node callTarget = callSite.getFirstChild();
		if (com.google.javascript.jscomp.NodeUtil.isGet(callTarget)) {
			java.lang.String propString = callTarget.getLastChild().getString();
			if ((propString.equals("call")) || (propString.equals("apply"))) {
				return true;
			}
		}
		return false;
	}

	private static class FunctionInformation {
		private final boolean extern;

		private final java.util.List<com.google.javascript.rhino.Node> callsInFunctionBody = com.google.common.collect.Lists.newArrayList();

		private java.util.Set<com.google.javascript.jscomp.Scope.Var> blacklisted = com.google.common.collect.Sets.newHashSet();

		private java.util.Set<com.google.javascript.jscomp.Scope.Var> taintedLocals = com.google.common.collect.Sets.newHashSet();

		private java.util.Set<java.lang.String> knownLocals = com.google.common.collect.Sets.newHashSet();

		private boolean pureFunction = false;

		private boolean functionThrows = false;

		private boolean taintsGlobalState = false;

		private boolean taintsThis = false;

		private boolean taintsArguments = false;

		private boolean taintsUnknown = false;

		private boolean taintsReturn = false;

		FunctionInformation(boolean extern) {
			this.extern = extern;
			checkInvariant();
		}

		void addTaintedLocalObject(com.google.javascript.jscomp.Scope.Var var) {
			taintedLocals.add(var);
		}

		void resetLocalVars() {
			blacklisted = null;
			taintedLocals = null;
			knownLocals = java.util.Collections.emptySet();
		}

		public void blacklistLocal(com.google.javascript.jscomp.Scope.Var var) {
			blacklisted.add(var);
		}

		boolean mayBePure() {
			return !(((((functionThrows) || (taintsGlobalState)) || (taintsThis)) || (taintsArguments)) || (taintsUnknown));
		}

		boolean mayHaveSideEffects() {
			return !(pureFunction);
		}

		void setIsPure() {
			pureFunction = true;
			checkInvariant();
		}

		void setTaintsGlobalState() {
			taintsGlobalState = true;
			checkInvariant();
		}

		void setTaintsThis() {
			taintsThis = true;
			checkInvariant();
		}

		void setTaintsArguments() {
			taintsArguments = true;
			checkInvariant();
		}

		void setFunctionThrows() {
			functionThrows = true;
			checkInvariant();
		}

		void setTaintsUnknown() {
			taintsUnknown = true;
			checkInvariant();
		}

		void setTaintsReturn() {
			taintsReturn = true;
			checkInvariant();
		}

		boolean mutatesGlobalState() {
			return ((taintsGlobalState) || (taintsArguments)) || (taintsUnknown);
		}

		boolean mutatesThis() {
			return taintsThis;
		}

		boolean functionThrows() {
			return functionThrows;
		}

		private void checkInvariant() {
			boolean invariant = (mayBePure()) || (mayHaveSideEffects());
			if (!invariant) {
				throw new java.lang.IllegalStateException(("Invariant failed.  " + (toString())));
			}
		}

		void appendCall(com.google.javascript.rhino.Node callNode) {
			callsInFunctionBody.add(callNode);
		}

		java.util.List<com.google.javascript.rhino.Node> getCallsInFunctionBody() {
			return callsInFunctionBody;
		}

		@java.lang.Override
		public java.lang.String toString() {
			java.util.List<java.lang.String> status = com.google.common.collect.Lists.newArrayList();
			if (extern) {
				status.add("extern");
			}
			if (pureFunction) {
				status.add("pure");
			}
			if (taintsThis) {
				status.add("this");
			}
			if (taintsGlobalState) {
				status.add("global");
			}
			if (functionThrows) {
				status.add("throw");
			}
			if (taintsUnknown) {
				status.add("complex");
			}
			return "Side effects: " + (status.toString());
		}
	}

	static class Driver implements com.google.javascript.jscomp.CompilerPass {
		private final com.google.javascript.jscomp.AbstractCompiler compiler;

		private final java.lang.String reportPath;

		private final boolean useNameReferenceGraph;

		Driver(com.google.javascript.jscomp.AbstractCompiler compiler, java.lang.String reportPath, boolean useNameReferenceGraph) {
			this.compiler = compiler;
			this.reportPath = reportPath;
			this.useNameReferenceGraph = useNameReferenceGraph;
		}

		@java.lang.Override
		public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
			com.google.javascript.jscomp.DefinitionProvider definitionProvider = null;
			if (useNameReferenceGraph) {
				com.google.javascript.jscomp.NameReferenceGraphConstruction graphBuilder = new com.google.javascript.jscomp.NameReferenceGraphConstruction(compiler);
				graphBuilder.process(externs, root);
				definitionProvider = graphBuilder.getNameReferenceGraph();
			}else {
				com.google.javascript.jscomp.SimpleDefinitionFinder defFinder = new com.google.javascript.jscomp.SimpleDefinitionFinder(compiler);
				defFinder.process(externs, root);
				definitionProvider = defFinder;
			}
			com.google.javascript.jscomp.PureFunctionIdentifier pureFunctionIdentifier = new com.google.javascript.jscomp.PureFunctionIdentifier(compiler, definitionProvider);
			pureFunctionIdentifier.process(externs, root);
			if ((reportPath) != null) {
				try {
					com.google.common.io.Files.write(pureFunctionIdentifier.getDebugReport(), new java.io.File(reportPath), com.google.common.base.Charsets.UTF_8);
				} catch (java.io.IOException e) {
					throw new java.lang.RuntimeException(e);
				}
			}
		}
	}
}


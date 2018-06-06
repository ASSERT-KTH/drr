

package com.google.javascript.jscomp;


class InlineFunctions implements com.google.javascript.jscomp.SpecializationAwareCompilerPass {
	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.InlineFunctions.FunctionState> fns = com.google.common.collect.Maps.newHashMap();

	private final java.util.Map<com.google.javascript.rhino.Node, java.lang.String> anonFns = com.google.common.collect.Maps.newHashMap();

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.FunctionInjector injector;

	private final boolean blockFunctionInliningEnabled;

	private final boolean inlineGlobalFunctions;

	private final boolean inlineLocalFunctions;

	private com.google.javascript.jscomp.SpecializeModule.SpecializationState specializationState;

	InlineFunctions(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.common.base.Supplier<java.lang.String> safeNameIdSupplier, boolean inlineGlobalFunctions, boolean inlineLocalFunctions, boolean blockFunctionInliningEnabled, boolean assumeStrictThis) {
		com.google.common.base.Preconditions.checkArgument((compiler != null));
		com.google.common.base.Preconditions.checkArgument((safeNameIdSupplier != null));
		this.compiler = compiler;
		this.inlineGlobalFunctions = inlineGlobalFunctions;
		this.inlineLocalFunctions = inlineLocalFunctions;
		this.blockFunctionInliningEnabled = blockFunctionInliningEnabled;
		this.injector = new com.google.javascript.jscomp.FunctionInjector(compiler, safeNameIdSupplier, true, assumeStrictThis);
	}

	com.google.javascript.jscomp.InlineFunctions.FunctionState getOrCreateFunctionState(java.lang.String fnName) {
		com.google.javascript.jscomp.InlineFunctions.FunctionState fs = fns.get(fnName);
		if (fs == null) {
			fs = new com.google.javascript.jscomp.InlineFunctions.FunctionState();
			fns.put(fnName, fs);
		}
		return fs;
	}

	@java.lang.Override
	public void enableSpecialization(com.google.javascript.jscomp.SpecializeModule.SpecializationState specializationState) {
		com.google.javascript.jscomp.InlineFunctions.this.specializationState = specializationState;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.common.base.Preconditions.checkState(compiler.getLifeCycleStage().isNormalized());
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.InlineFunctions.FindCandidateFunctions());
		if (fns.isEmpty()) {
			return ;
		}
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.InlineFunctions.FindCandidatesReferences(fns, anonFns));
		trimCanidatesNotMeetingMinimumRequirements();
		if (fns.isEmpty()) {
			return ;
		}
		java.util.Set<java.lang.String> fnNames = com.google.common.collect.Sets.newHashSet(fns.keySet());
		injector.setKnownConstants(fnNames);
		trimCanidatesUsingOnCost();
		if (fns.isEmpty()) {
			return ;
		}
		resolveInlineConflicts();
		decomposeExpressions(fnNames);
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.InlineFunctions.CallVisitor(fns, anonFns, new com.google.javascript.jscomp.InlineFunctions.Inline(injector, specializationState)));
		removeInlinedFunctions();
	}

	private class FindCandidateFunctions implements com.google.javascript.jscomp.NodeTraversal.Callback {
		private int callsSeen = 0;

		@java.lang.Override
		public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal nodeTraversal, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			return (inlineLocalFunctions) || (nodeTraversal.inGlobalScope());
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (((t.inGlobalScope()) && (inlineGlobalFunctions)) || ((!(t.inGlobalScope())) && (inlineLocalFunctions))) {
				findNamedFunctions(t, n, parent);
				findFunctionExpressions(t, n);
			}
		}

		public void findNamedFunctions(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (!(com.google.javascript.jscomp.NodeUtil.isStatement(n))) {
				return ;
			}
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.VAR :
					com.google.common.base.Preconditions.checkState(n.hasOneChild());
					com.google.javascript.rhino.Node nameNode = n.getFirstChild();
					if ((((nameNode.getType()) == (com.google.javascript.rhino.Token.NAME)) && (nameNode.hasChildren())) && ((nameNode.getFirstChild().getType()) == (com.google.javascript.rhino.Token.FUNCTION))) {
						maybeAddFunction(new com.google.javascript.jscomp.InlineFunctions.FunctionVar(n), t.getModule());
					}
					break;
				case com.google.javascript.rhino.Token.FUNCTION :
					com.google.common.base.Preconditions.checkState(((com.google.javascript.jscomp.NodeUtil.isStatementBlock(parent)) || ((parent.getType()) == (com.google.javascript.rhino.Token.LABEL))));
					if (!(com.google.javascript.jscomp.NodeUtil.isFunctionExpression(n))) {
						com.google.javascript.jscomp.InlineFunctions.Function fn = new com.google.javascript.jscomp.InlineFunctions.NamedFunction(n);
						maybeAddFunction(fn, t.getModule());
					}
					break;
			}
		}

		public void findFunctionExpressions(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.CALL :
					com.google.javascript.rhino.Node fnNode = null;
					if ((n.getFirstChild().getType()) == (com.google.javascript.rhino.Token.FUNCTION)) {
						fnNode = n.getFirstChild();
					}else
						if (com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(n)) {
							com.google.javascript.rhino.Node fnIdentifingNode = n.getFirstChild().getFirstChild();
							if ((fnIdentifingNode.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) {
								fnNode = fnIdentifingNode;
							}
						}
					
					if (fnNode != null) {
						com.google.javascript.jscomp.InlineFunctions.Function fn = new com.google.javascript.jscomp.InlineFunctions.FunctionExpression(fnNode, ((callsSeen)++));
						maybeAddFunction(fn, t.getModule());
						anonFns.put(fnNode, fn.getName());
					}
					break;
			}
		}
	}

	private void maybeAddFunction(com.google.javascript.jscomp.InlineFunctions.Function fn, com.google.javascript.jscomp.JSModule module) {
		java.lang.String name = fn.getName();
		com.google.javascript.jscomp.InlineFunctions.FunctionState fs = getOrCreateFunctionState(name);
		if (fs.hasExistingFunctionDefinition()) {
			fs.setInline(false);
		}else {
			if (fs.canInline()) {
				fs.setFn(fn);
				if (injector.isDirectCallNodeReplacementPossible(fn.getFunctionNode())) {
					fs.inlineDirectly(true);
				}
				if (!(isCandidateFunction(fn))) {
					fs.setInline(false);
				}
				if (fs.canInline()) {
					fs.setModule(module);
					com.google.javascript.rhino.Node fnNode = fn.getFunctionNode();
					java.util.Set<java.lang.String> namesToAlias = com.google.javascript.jscomp.FunctionArgumentInjector.findModifiedParameters(fnNode);
					if (!(namesToAlias.isEmpty())) {
						fs.inlineDirectly(false);
						fs.setNamesToAlias(namesToAlias);
					}
					com.google.javascript.rhino.Node block = com.google.javascript.jscomp.NodeUtil.getFunctionBody(fnNode);
					if (com.google.javascript.jscomp.NodeUtil.referencesThis(block)) {
						fs.setReferencesThis(true);
					}
					if (com.google.javascript.jscomp.NodeUtil.containsFunction(block)) {
						fs.setHasInnerFunctions(true);
						if (hasLocalNames(fnNode)) {
							fs.setInline(false);
						}
					}
				}
				if ((fs.canInline()) && (!(fs.canInlineDirectly()))) {
					if (!(blockFunctionInliningEnabled)) {
						fs.setInline(false);
					}
				}
			}
		}
	}

	private boolean hasLocalNames(com.google.javascript.rhino.Node fnNode) {
		com.google.javascript.rhino.Node block = com.google.javascript.jscomp.NodeUtil.getFunctionBody(fnNode);
		return (com.google.javascript.jscomp.NodeUtil.getFunctionParameters(fnNode).hasChildren()) || (com.google.javascript.jscomp.NodeUtil.has(block, new com.google.javascript.jscomp.NodeUtil.MatchDeclaration(), new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement()));
	}

	private static com.google.javascript.rhino.Node getContainingFunction(com.google.javascript.jscomp.NodeTraversal t) {
		return t.inGlobalScope() ? null : t.getScopeRoot();
	}

	private boolean isCandidateFunction(com.google.javascript.jscomp.InlineFunctions.Function fn) {
		java.lang.String fnName = fn.getName();
		if (compiler.getCodingConvention().isExported(fnName)) {
			return false;
		}
		if (com.google.javascript.jscomp.RenameProperties.RENAME_PROPERTY_FUNCTION_NAME.equals(fnName)) {
			return false;
		}
		if (((specializationState) != null) && (!(specializationState.canFixupFunction(fn.getFunctionNode())))) {
			return false;
		}
		com.google.javascript.rhino.Node fnNode = fn.getFunctionNode();
		return injector.doesFunctionMeetMinimumRequirements(fnName, fnNode);
	}

	private interface CallVisitorCallback {
		public void visitCallSite(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node callNode, com.google.javascript.rhino.Node parent, com.google.javascript.jscomp.InlineFunctions.FunctionState fs);
	}

	private static class CallVisitor extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		protected com.google.javascript.jscomp.InlineFunctions.CallVisitorCallback callback;

		private java.util.Map<java.lang.String, com.google.javascript.jscomp.InlineFunctions.FunctionState> functionMap;

		private java.util.Map<com.google.javascript.rhino.Node, java.lang.String> anonFunctionMap;

		CallVisitor(java.util.Map<java.lang.String, com.google.javascript.jscomp.InlineFunctions.FunctionState> fns, java.util.Map<com.google.javascript.rhino.Node, java.lang.String> anonFns, com.google.javascript.jscomp.InlineFunctions.CallVisitorCallback callback) {
			com.google.javascript.jscomp.InlineFunctions.CallVisitor.this.functionMap = fns;
			com.google.javascript.jscomp.InlineFunctions.CallVisitor.this.anonFunctionMap = anonFns;
			com.google.javascript.jscomp.InlineFunctions.CallVisitor.this.callback = callback;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.CALL :
					com.google.javascript.rhino.Node child = n.getFirstChild();
					java.lang.String name = null;
					if ((child.getType()) == (com.google.javascript.rhino.Token.NAME)) {
						name = child.getString();
					}else
						if ((child.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) {
							name = anonFunctionMap.get(child);
						}else
							if (com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(n)) {
								com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.NodeUtil.isGet(child));
								com.google.javascript.rhino.Node fnIdentifingNode = child.getFirstChild();
								if ((fnIdentifingNode.getType()) == (com.google.javascript.rhino.Token.NAME)) {
									name = fnIdentifingNode.getString();
								}else
									if ((fnIdentifingNode.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) {
										name = anonFunctionMap.get(fnIdentifingNode);
									}
								
							}
						
					
					if (name != null) {
						com.google.javascript.jscomp.InlineFunctions.FunctionState fs = functionMap.get(name);
						if (fs != null) {
							callback.visitCallSite(t, n, parent, fs);
						}
					}
					break;
			}
		}
	}

	static boolean isCandidateUsage(com.google.javascript.rhino.Node name) {
		com.google.javascript.rhino.Node parent = name.getParent();
		com.google.common.base.Preconditions.checkState(((name.getType()) == (com.google.javascript.rhino.Token.NAME)));
		if (((parent.getType()) == (com.google.javascript.rhino.Token.VAR)) || ((parent.getType()) == (com.google.javascript.rhino.Token.FUNCTION))) {
			return true;
		}
		if (((parent.getType()) == (com.google.javascript.rhino.Token.CALL)) && ((parent.getFirstChild()) == name)) {
			return true;
		}
		if ((((com.google.javascript.jscomp.NodeUtil.isGet(parent)) && (name == (parent.getFirstChild()))) && ((name.getNext().getType()) == (com.google.javascript.rhino.Token.STRING))) && (name.getNext().getString().equals("call"))) {
			com.google.javascript.rhino.Node gramps = name.getAncestor(2);
			if (((gramps.getType()) == (com.google.javascript.rhino.Token.CALL)) && ((gramps.getFirstChild()) == parent)) {
				return true;
			}
		}
		return false;
	}

	private class FindCandidatesReferences extends com.google.javascript.jscomp.InlineFunctions.CallVisitor implements com.google.javascript.jscomp.InlineFunctions.CallVisitorCallback {
		FindCandidatesReferences(java.util.Map<java.lang.String, com.google.javascript.jscomp.InlineFunctions.FunctionState> fns, java.util.Map<com.google.javascript.rhino.Node, java.lang.String> anonFns) {
			super(fns, anonFns, null);
			com.google.javascript.jscomp.InlineFunctions.FindCandidatesReferences.this.callback = com.google.javascript.jscomp.InlineFunctions.FindCandidatesReferences.this;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			super.visit(t, n, parent);
			if ((n.getType()) == (com.google.javascript.rhino.Token.NAME)) {
				checkNameUsage(t, n, parent);
			}
		}

		@java.lang.Override
		public void visitCallSite(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node callNode, com.google.javascript.rhino.Node parent, com.google.javascript.jscomp.InlineFunctions.FunctionState fs) {
			maybeAddReference(t, fs, callNode, t.getModule());
		}

		void maybeAddReference(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.jscomp.InlineFunctions.FunctionState fs, com.google.javascript.rhino.Node callNode, com.google.javascript.jscomp.JSModule module) {
			if (!(fs.canInline())) {
				return ;
			}
			boolean referenceAdded = false;
			com.google.javascript.jscomp.FunctionInjector.InliningMode mode = fs.canInlineDirectly() ? com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT : com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
			referenceAdded = maybeAddReferenceUsingMode(t, fs, callNode, module, mode);
			if (((!referenceAdded) && (mode == (com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT))) && (blockFunctionInliningEnabled)) {
				mode = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
				referenceAdded = maybeAddReferenceUsingMode(t, fs, callNode, module, mode);
			}
			if (!referenceAdded) {
				fs.setRemove(false);
			}
		}

		private boolean maybeAddReferenceUsingMode(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.jscomp.InlineFunctions.FunctionState fs, com.google.javascript.rhino.Node callNode, com.google.javascript.jscomp.JSModule module, com.google.javascript.jscomp.FunctionInjector.InliningMode mode) {
			if ((specializationState) != null) {
				com.google.javascript.rhino.Node containingFunction = com.google.javascript.jscomp.InlineFunctions.getContainingFunction(t);
				if ((containingFunction != null) && (!(specializationState.canFixupFunction(containingFunction)))) {
					return false;
				}
			}
			com.google.javascript.jscomp.FunctionInjector.CanInlineResult result = injector.canInlineReferenceToFunction(t, callNode, fs.getFn().getFunctionNode(), fs.getNamesToAlias(), mode, fs.getReferencesThis(), fs.hasInnerFunctions());
			if (result != (com.google.javascript.jscomp.FunctionInjector.CanInlineResult.NO)) {
				boolean decompose = result == (com.google.javascript.jscomp.FunctionInjector.CanInlineResult.AFTER_DECOMPOSITION);
				fs.addReference(new com.google.javascript.jscomp.InlineFunctions.Reference(callNode, module, mode, decompose));
				return true;
			}
			return false;
		}

		private void checkNameUsage(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			com.google.common.base.Preconditions.checkState(((n.getType()) == (com.google.javascript.rhino.Token.NAME)));
			if (com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(n)) {
				return ;
			}
			java.lang.String name = n.getString();
			com.google.javascript.jscomp.InlineFunctions.FunctionState fs = fns.get(name);
			if (fs == null) {
				return ;
			}
			if ((parent.getType()) == (com.google.javascript.rhino.Token.NEW)) {
				com.google.javascript.rhino.Node target = parent.getFirstChild();
				if (((target.getType()) == (com.google.javascript.rhino.Token.NAME)) && (target.getString().equals(com.google.javascript.jscomp.ObjectPropertyStringPreprocess.EXTERN_OBJECT_PROPERTY_STRING))) {
					fs.setInline(false);
				}
			}
			if (((parent.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) && ((parent.getFirstChild()) == n)) {
				fs.setInline(false);
			}else {
				fs.setRemove(false);
			}
		}
	}

	private static class Inline implements com.google.javascript.jscomp.InlineFunctions.CallVisitorCallback {
		private final com.google.javascript.jscomp.FunctionInjector injector;

		private final com.google.javascript.jscomp.SpecializeModule.SpecializationState specializationState;

		Inline(com.google.javascript.jscomp.FunctionInjector injector, com.google.javascript.jscomp.SpecializeModule.SpecializationState specializationState) {
			this.injector = injector;
			this.specializationState = specializationState;
		}

		@java.lang.Override
		public void visitCallSite(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node callNode, com.google.javascript.rhino.Node parent, com.google.javascript.jscomp.InlineFunctions.FunctionState fs) {
			com.google.common.base.Preconditions.checkState(fs.hasExistingFunctionDefinition());
			if (fs.canInline()) {
				com.google.javascript.jscomp.InlineFunctions.Reference ref = fs.getReference(callNode);
				if (ref != null) {
					if ((specializationState) != null) {
						com.google.javascript.rhino.Node containingFunction = com.google.javascript.jscomp.InlineFunctions.getContainingFunction(t);
						if (containingFunction != null) {
							specializationState.reportSpecializedFunction(containingFunction);
						}
					}
					inlineFunction(t, callNode, fs, ref.mode);
					ref.inlined = true;
				}
			}
		}

		private void inlineFunction(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node callNode, com.google.javascript.jscomp.InlineFunctions.FunctionState fs, com.google.javascript.jscomp.FunctionInjector.InliningMode mode) {
			com.google.javascript.jscomp.InlineFunctions.Function fn = fs.getFn();
			java.lang.String fnName = fn.getName();
			com.google.javascript.rhino.Node fnNode = fs.getSafeFnNode();
			com.google.javascript.rhino.Node newCode = injector.inline(t, callNode, fnName, fnNode, mode);
			t.getCompiler().reportCodeChange();
			t.getCompiler().addToDebugLog(("Inlined function: " + (fn.getName())));
		}
	}

	private void trimCanidatesNotMeetingMinimumRequirements() {
		java.util.Iterator<java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.InlineFunctions.FunctionState>> i;
		for (i = fns.entrySet().iterator(); i.hasNext();) {
			com.google.javascript.jscomp.InlineFunctions.FunctionState fs = i.next().getValue();
			if ((!(fs.hasExistingFunctionDefinition())) || (!(fs.canInline()))) {
				i.remove();
			}
		}
	}

	void trimCanidatesUsingOnCost() {
		java.util.Iterator<java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.InlineFunctions.FunctionState>> i;
		for (i = fns.entrySet().iterator(); i.hasNext();) {
			com.google.javascript.jscomp.InlineFunctions.FunctionState fs = i.next().getValue();
			if (fs.hasReferences()) {
				boolean lowersCost = mimimizeCost(fs);
				if (!lowersCost) {
					i.remove();
				}
			}else
				if (!(fs.canRemove())) {
					i.remove();
				}
			
		}
	}

	private boolean mimimizeCost(com.google.javascript.jscomp.InlineFunctions.FunctionState fs) {
		if (!(inliningLowersCost(fs))) {
			if (fs.hasBlockInliningReferences()) {
				fs.setRemove(false);
				fs.removeBlockInliningReferences();
				if ((!(fs.hasReferences())) || (!(inliningLowersCost(fs)))) {
					return false;
				}
			}else {
				return false;
			}
		}
		return true;
	}

	private boolean inliningLowersCost(com.google.javascript.jscomp.InlineFunctions.FunctionState fs) {
		return injector.inliningLowersCost(fs.getModule(), fs.getFn().getFunctionNode(), fs.getReferences(), fs.getNamesToAlias(), fs.canRemove(), fs.getReferencesThis());
	}

	private void resolveInlineConflicts() {
		for (com.google.javascript.jscomp.InlineFunctions.FunctionState fs : fns.values()) {
			resolveInlineConflictsForFunction(fs);
		}
	}

	private void resolveInlineConflictsForFunction(com.google.javascript.jscomp.InlineFunctions.FunctionState fs) {
		if (!(fs.hasReferences())) {
			return ;
		}
		com.google.javascript.rhino.Node fnNode = fs.getFn().getFunctionNode();
		java.util.Set<java.lang.String> names = findCalledFunctions(fnNode);
		if (!(names.isEmpty())) {
			for (java.lang.String name : names) {
				com.google.javascript.jscomp.InlineFunctions.FunctionState fsCalled = fns.get(name);
				if ((fsCalled != null) && (fsCalled.canRemove())) {
					fsCalled.setRemove(false);
					if (!(mimimizeCost(fsCalled))) {
						fsCalled.setInline(false);
					}
				}
			}
			fs.setSafeFnNode(fs.getFn().getFunctionNode().cloneTree());
		}
	}

	private java.util.Set<java.lang.String> findCalledFunctions(com.google.javascript.rhino.Node node) {
		java.util.Set<java.lang.String> changed = com.google.common.collect.Sets.newHashSet();
		findCalledFunctions(com.google.javascript.jscomp.NodeUtil.getFunctionBody(node), changed);
		return changed;
	}

	private void findCalledFunctions(com.google.javascript.rhino.Node node, java.util.Set<java.lang.String> changed) {
		com.google.common.base.Preconditions.checkArgument((changed != null));
		if ((node.getType()) == (com.google.javascript.rhino.Token.NAME)) {
			if (com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(node)) {
				changed.add(node.getString());
			}
		}
		for (com.google.javascript.rhino.Node c = node.getFirstChild(); c != null; c = c.getNext()) {
			findCalledFunctions(c, changed);
		}
	}

	private void decomposeExpressions(java.util.Set<java.lang.String> fnNames) {
		com.google.javascript.jscomp.ExpressionDecomposer decomposer = new com.google.javascript.jscomp.ExpressionDecomposer(compiler, compiler.getUniqueNameIdSupplier(), fnNames);
		for (com.google.javascript.jscomp.InlineFunctions.FunctionState fs : fns.values()) {
			if (fs.canInline()) {
				for (com.google.javascript.jscomp.InlineFunctions.Reference ref : fs.getReferences()) {
					if (ref.requiresDecomposition) {
						decomposer.maybeDecomposeExpression(ref.callNode);
					}
				}
			}
		}
	}

	void removeInlinedFunctions() {
		for (com.google.javascript.jscomp.InlineFunctions.FunctionState fs : fns.values()) {
			if (fs.canRemove()) {
				com.google.javascript.jscomp.InlineFunctions.Function fn = fs.getFn();
				com.google.common.base.Preconditions.checkState(fs.canInline());
				com.google.common.base.Preconditions.checkState((fn != null));
				verifyAllReferencesInlined(fs);
				if ((specializationState) != null) {
					specializationState.reportRemovedFunction(fn.getFunctionNode(), fn.getDeclaringBlock());
				}
				fn.remove();
				compiler.reportCodeChange();
			}
		}
	}

	void verifyAllReferencesInlined(com.google.javascript.jscomp.InlineFunctions.FunctionState fs) {
		for (com.google.javascript.jscomp.InlineFunctions.Reference ref : fs.getReferences()) {
			if (!(ref.inlined)) {
				throw new java.lang.IllegalStateException(((("Call site missed.\n call: " + (ref.callNode.toStringTree())) + "\n parent:  ") + (ref.callNode.getParent().toStringTree())));
			}
		}
	}

	private static class FunctionState {
		private com.google.javascript.jscomp.InlineFunctions.Function fn = null;

		private com.google.javascript.rhino.Node safeFnNode = null;

		private boolean inline = true;

		private boolean remove = true;

		private boolean inlineDirectly = false;

		private boolean referencesThis = false;

		private boolean hasInnerFunctions = false;

		private java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.InlineFunctions.Reference> references = null;

		private com.google.javascript.jscomp.JSModule module = null;

		private java.util.Set<java.lang.String> namesToAlias = null;

		boolean hasExistingFunctionDefinition() {
			return (fn) != null;
		}

		public void setReferencesThis(boolean referencesThis) {
			com.google.javascript.jscomp.InlineFunctions.FunctionState.this.referencesThis = referencesThis;
		}

		public boolean getReferencesThis() {
			return com.google.javascript.jscomp.InlineFunctions.FunctionState.this.referencesThis;
		}

		public void setHasInnerFunctions(boolean hasInnerFunctions) {
			com.google.javascript.jscomp.InlineFunctions.FunctionState.this.hasInnerFunctions = hasInnerFunctions;
		}

		public boolean hasInnerFunctions() {
			return hasInnerFunctions;
		}

		void removeBlockInliningReferences() {
			java.util.Iterator<java.util.Map.Entry<com.google.javascript.rhino.Node, com.google.javascript.jscomp.InlineFunctions.Reference>> i;
			for (i = getReferencesInternal().entrySet().iterator(); i.hasNext();) {
				java.util.Map.Entry<com.google.javascript.rhino.Node, com.google.javascript.jscomp.InlineFunctions.Reference> entry = i.next();
				if ((entry.getValue().mode) == (com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK)) {
					i.remove();
				}
			}
		}

		public boolean hasBlockInliningReferences() {
			for (com.google.javascript.jscomp.InlineFunctions.Reference r : getReferencesInternal().values()) {
				if ((r.mode) == (com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK)) {
					return true;
				}
			}
			return false;
		}

		public com.google.javascript.jscomp.InlineFunctions.Function getFn() {
			return fn;
		}

		public void setFn(com.google.javascript.jscomp.InlineFunctions.Function fn) {
			com.google.common.base.Preconditions.checkState(((com.google.javascript.jscomp.InlineFunctions.FunctionState.this.fn) == null));
			com.google.javascript.jscomp.InlineFunctions.FunctionState.this.fn = fn;
		}

		public com.google.javascript.rhino.Node getSafeFnNode() {
			return (safeFnNode) != null ? safeFnNode : fn.getFunctionNode();
		}

		public void setSafeFnNode(com.google.javascript.rhino.Node safeFnNode) {
			com.google.javascript.jscomp.InlineFunctions.FunctionState.this.safeFnNode = safeFnNode;
		}

		public boolean canInline() {
			return inline;
		}

		public void setInline(boolean inline) {
			com.google.javascript.jscomp.InlineFunctions.FunctionState.this.inline = inline;
			if (inline == false) {
				references = null;
				remove = false;
			}
		}

		public boolean canRemove() {
			return remove;
		}

		public void setRemove(boolean remove) {
			com.google.javascript.jscomp.InlineFunctions.FunctionState.this.remove = remove;
		}

		public boolean canInlineDirectly() {
			return inlineDirectly;
		}

		public void inlineDirectly(boolean directReplacement) {
			com.google.javascript.jscomp.InlineFunctions.FunctionState.this.inlineDirectly = directReplacement;
		}

		public boolean hasReferences() {
			return ((references) != null) && (!(references.isEmpty()));
		}

		private java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.InlineFunctions.Reference> getReferencesInternal() {
			if ((references) == null) {
				return java.util.Collections.emptyMap();
			}
			return references;
		}

		public void addReference(com.google.javascript.jscomp.InlineFunctions.Reference ref) {
			if ((references) == null) {
				references = com.google.common.collect.Maps.newHashMap();
			}
			references.put(ref.callNode, ref);
		}

		public java.util.Collection<com.google.javascript.jscomp.InlineFunctions.Reference> getReferences() {
			return getReferencesInternal().values();
		}

		public com.google.javascript.jscomp.InlineFunctions.Reference getReference(com.google.javascript.rhino.Node n) {
			return getReferencesInternal().get(n);
		}

		public java.util.Set<java.lang.String> getNamesToAlias() {
			if ((namesToAlias) == null) {
				return java.util.Collections.emptySet();
			}
			return java.util.Collections.unmodifiableSet(namesToAlias);
		}

		public void setNamesToAlias(java.util.Set<java.lang.String> names) {
			namesToAlias = names;
		}

		public void setModule(com.google.javascript.jscomp.JSModule module) {
			com.google.javascript.jscomp.InlineFunctions.FunctionState.this.module = module;
		}

		public com.google.javascript.jscomp.JSModule getModule() {
			return module;
		}
	}

	private static interface Function {
		public java.lang.String getName();

		public com.google.javascript.rhino.Node getFunctionNode();

		public void remove();

		public com.google.javascript.rhino.Node getDeclaringBlock();
	}

	private static class NamedFunction implements com.google.javascript.jscomp.InlineFunctions.Function {
		private final com.google.javascript.rhino.Node fn;

		public NamedFunction(com.google.javascript.rhino.Node fn) {
			this.fn = fn;
		}

		@java.lang.Override
		public java.lang.String getName() {
			return fn.getFirstChild().getString();
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getFunctionNode() {
			return fn;
		}

		@java.lang.Override
		public void remove() {
			com.google.javascript.jscomp.NodeUtil.removeChild(fn.getParent(), fn);
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getDeclaringBlock() {
			return fn.getParent();
		}
	}

	private static class FunctionVar implements com.google.javascript.jscomp.InlineFunctions.Function {
		private final com.google.javascript.rhino.Node var;

		public FunctionVar(com.google.javascript.rhino.Node var) {
			this.var = var;
		}

		@java.lang.Override
		public java.lang.String getName() {
			return var.getFirstChild().getString();
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getFunctionNode() {
			return var.getFirstChild().getFirstChild();
		}

		@java.lang.Override
		public void remove() {
			com.google.javascript.jscomp.NodeUtil.removeChild(var.getParent(), var);
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getDeclaringBlock() {
			return var.getParent();
		}
	}

	private static class FunctionExpression implements com.google.javascript.jscomp.InlineFunctions.Function {
		private final com.google.javascript.rhino.Node fn;

		private final java.lang.String fakeName;

		public FunctionExpression(com.google.javascript.rhino.Node fn, int index) {
			this.fn = fn;
			this.fakeName = java.lang.String.valueOf(index);
		}

		@java.lang.Override
		public java.lang.String getName() {
			return fakeName;
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getFunctionNode() {
			return fn;
		}

		@java.lang.Override
		public void remove() {
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getDeclaringBlock() {
			return null;
		}
	}

	class Reference extends com.google.javascript.jscomp.FunctionInjector.Reference {
		final boolean requiresDecomposition;

		boolean inlined = false;

		Reference(com.google.javascript.rhino.Node callNode, com.google.javascript.jscomp.JSModule module, com.google.javascript.jscomp.FunctionInjector.InliningMode mode, boolean decompose) {
			super(callNode, module, mode);
			this.requiresDecomposition = decompose;
		}
	}
}


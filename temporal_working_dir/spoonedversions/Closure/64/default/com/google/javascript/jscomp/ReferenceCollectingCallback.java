

package com.google.javascript.jscomp;


class ReferenceCollectingCallback implements com.google.javascript.jscomp.HotSwapCompilerPass , com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
	private final java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> referenceMap = com.google.common.collect.Maps.newHashMap();

	private final java.util.Deque<com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock> blockStack = new java.util.ArrayDeque<com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock>();

	private final com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior;

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varFilter;

	ReferenceCollectingCallback(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior) {
		this(compiler, behavior, com.google.common.base.Predicates.<com.google.javascript.jscomp.Scope.Var>alwaysTrue());
	}

	ReferenceCollectingCallback(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior, com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varFilter) {
		this.compiler = compiler;
		this.behavior = behavior;
		this.varFilter = varFilter;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.ReferenceCollectingCallback.this);
	}

	@java.lang.Override
	public void hotSwapScript(com.google.javascript.rhino.Node scriptRoot) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, scriptRoot, com.google.javascript.jscomp.ReferenceCollectingCallback.this);
	}

	public java.util.Set<com.google.javascript.jscomp.Scope.Var> getReferencedVariables() {
		return referenceMap.keySet();
	}

	public com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection getReferenceCollection(com.google.javascript.jscomp.Scope.Var v) {
		return referenceMap.get(v);
	}

	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if ((n.getType()) == (com.google.javascript.rhino.Token.NAME)) {
			com.google.javascript.jscomp.Scope.Var v;
			if (n.getString().equals("arguments")) {
				v = t.getScope().getArgumentsVar();
			}else {
				v = t.getScope().getVar(n.getString());
			}
			if ((v != null) && (varFilter.apply(v))) {
				addReference(t, v, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference(n, t, blockStack.peek()));
			}
		}
		if (com.google.javascript.jscomp.ReferenceCollectingCallback.isBlockBoundary(n, parent)) {
			blockStack.pop();
		}
	}

	public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
		com.google.javascript.rhino.Node n = t.getScope().getRootNode();
		com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock parent = blockStack.isEmpty() ? null : blockStack.peek();
		blockStack.push(new com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock(parent, n));
	}

	public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
		blockStack.pop();
		if (t.getScope().isGlobal()) {
			compiler.updateGlobalVarReferences(referenceMap, t.getScopeRoot());
			behavior.afterExitScope(t, compiler.getGlobalVarReferences());
		}else {
			behavior.afterExitScope(t, new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMapWrapper(referenceMap));
		}
	}

	public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal nodeTraversal, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if (com.google.javascript.jscomp.ReferenceCollectingCallback.isBlockBoundary(n, parent)) {
			blockStack.push(new com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock(blockStack.peek(), n));
		}
		return true;
	}

	private static boolean isBlockBoundary(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if (parent != null) {
			switch (parent.getType()) {
				case com.google.javascript.rhino.Token.DO :
				case com.google.javascript.rhino.Token.FOR :
				case com.google.javascript.rhino.Token.TRY :
				case com.google.javascript.rhino.Token.WHILE :
				case com.google.javascript.rhino.Token.WITH :
					return true;
				case com.google.javascript.rhino.Token.AND :
				case com.google.javascript.rhino.Token.HOOK :
				case com.google.javascript.rhino.Token.IF :
				case com.google.javascript.rhino.Token.OR :
					return n != (parent.getFirstChild());
			}
		}
		return (n.getType()) == (com.google.javascript.rhino.Token.CASE);
	}

	private void addReference(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.jscomp.Scope.Var v, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference) {
		com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceInfo = referenceMap.get(v);
		if (referenceInfo == null) {
			referenceInfo = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
			referenceMap.put(v, referenceInfo);
		}
		referenceInfo.add(reference, t, v);
	}

	interface ReferenceMap {
		com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection getReferences(com.google.javascript.jscomp.Scope.Var var);
	}

	private static class ReferenceMapWrapper implements com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap {
		private final java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> referenceMap;

		public ReferenceMapWrapper(java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> referenceMap) {
			this.referenceMap = referenceMap;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection getReferences(com.google.javascript.jscomp.Scope.Var var) {
			return referenceMap.get(var);
		}
	}

	interface Behavior {
		void afterExitScope(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap);
	}

	static com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior DO_NOTHING_BEHAVIOR = new com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior() {
		@java.lang.Override
		public void afterExitScope(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap) {
		}
	};

	static class ReferenceCollection {
		java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> references = com.google.common.collect.Lists.newArrayList();

		void add(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference, com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.jscomp.Scope.Var v) {
			references.add(reference);
		}

		protected boolean isWellDefined() {
			int size = references.size();
			if (size == 0) {
				return false;
			}
			com.google.javascript.jscomp.ReferenceCollectingCallback.Reference init = getInitializingReference();
			if (init == null) {
				return false;
			}
			com.google.common.base.Preconditions.checkState(references.get(0).isDeclaration());
			com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock initBlock = init.getBasicBlock();
			for (int i = 1; i < size; i++) {
				if (!(initBlock.provablyExecutesBefore(references.get(i).getBasicBlock()))) {
					return false;
				}
			}
			return true;
		}

		boolean isEscaped() {
			com.google.javascript.jscomp.Scope scope = null;
			for (com.google.javascript.jscomp.ReferenceCollectingCallback.Reference ref : references) {
				if (scope == null) {
					scope = ref.scope;
				}else
					if (scope != (ref.scope)) {
						return true;
					}
				
			}
			return false;
		}

		private boolean isInitializingDeclarationAt(int index) {
			com.google.javascript.jscomp.ReferenceCollectingCallback.Reference maybeInit = references.get(index);
			if (maybeInit.isInitializingDeclaration()) {
				return true;
			}
			return false;
		}

		private boolean isInitializingAssignmentAt(int index) {
			if ((index < (references.size())) && (index > 0)) {
				com.google.javascript.jscomp.ReferenceCollectingCallback.Reference maybeDecl = references.get((index - 1));
				if (maybeDecl.isVarDeclaration()) {
					com.google.common.base.Preconditions.checkState((!(maybeDecl.isInitializingDeclaration())));
					com.google.javascript.jscomp.ReferenceCollectingCallback.Reference maybeInit = references.get(index);
					if (maybeInit.isSimpleAssignmentToName()) {
						return true;
					}
				}
			}
			return false;
		}

		com.google.javascript.jscomp.ReferenceCollectingCallback.Reference getInitializingReference() {
			if (isInitializingDeclarationAt(0)) {
				return references.get(0);
			}else
				if (isInitializingAssignmentAt(1)) {
					return references.get(1);
				}
			
			return null;
		}

		com.google.javascript.jscomp.ReferenceCollectingCallback.Reference getInitializingReferenceForConstants() {
			int size = references.size();
			for (int i = 0; i < size; i++) {
				if ((isInitializingDeclarationAt(i)) || (isInitializingAssignmentAt(i))) {
					return references.get(i);
				}
			}
			return null;
		}

		boolean isAssignedOnceInLifetime() {
			com.google.javascript.jscomp.ReferenceCollectingCallback.Reference ref = getOneAndOnlyAssignment();
			if (ref == null) {
				return false;
			}
			for (com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock block = ref.getBasicBlock(); block != null; block = block.getParent()) {
				if (block.isFunction) {
					break;
				}else
					if (block.isLoop) {
						return false;
					}
				
			}
			return true;
		}

		private com.google.javascript.jscomp.ReferenceCollectingCallback.Reference getOneAndOnlyAssignment() {
			com.google.javascript.jscomp.ReferenceCollectingCallback.Reference assignment = null;
			int size = references.size();
			for (int i = 0; i < size; i++) {
				com.google.javascript.jscomp.ReferenceCollectingCallback.Reference ref = references.get(i);
				if ((ref.isLvalue()) || (ref.isInitializingDeclaration())) {
					if (assignment == null) {
						assignment = ref;
					}else {
						return null;
					}
				}
			}
			return assignment;
		}

		boolean isNeverAssigned() {
			int size = references.size();
			for (int i = 0; i < size; i++) {
				com.google.javascript.jscomp.ReferenceCollectingCallback.Reference ref = references.get(i);
				if ((ref.isLvalue()) || (ref.isInitializingDeclaration())) {
					return false;
				}
			}
			return true;
		}

		boolean firstReferenceIsAssigningDeclaration() {
			int size = references.size();
			if ((size > 0) && (references.get(0).isInitializingDeclaration())) {
				return true;
			}
			return false;
		}
	}

	static final class Reference implements com.google.javascript.rhino.jstype.StaticReference {
		private static final java.util.Set<java.lang.Integer> DECLARATION_PARENTS = com.google.common.collect.ImmutableSet.of(com.google.javascript.rhino.Token.VAR, com.google.javascript.rhino.Token.FUNCTION, com.google.javascript.rhino.Token.CATCH);

		private final com.google.javascript.rhino.Node nameNode;

		private final com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock basicBlock;

		private final com.google.javascript.jscomp.Scope scope;

		private final com.google.javascript.rhino.jstype.StaticSourceFile sourceFile;

		Reference(com.google.javascript.rhino.Node nameNode, com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock basicBlock) {
			this(nameNode, basicBlock, t.getScope(), t.getInput());
		}

		static com.google.javascript.jscomp.ReferenceCollectingCallback.Reference newBleedingFunction(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock basicBlock, com.google.javascript.rhino.Node func) {
			return new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference(func.getFirstChild(), basicBlock, t.getScope(), t.getInput());
		}

		@com.google.common.annotations.VisibleForTesting
		static com.google.javascript.jscomp.ReferenceCollectingCallback.Reference createRefForTest(java.lang.String sourceName) {
			return new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference(new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.NAME), null, null, new com.google.javascript.rhino.jstype.SimpleSourceFile(sourceName, false));
		}

		private Reference(com.google.javascript.rhino.Node nameNode, com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock basicBlock, com.google.javascript.jscomp.Scope scope, com.google.javascript.rhino.jstype.StaticSourceFile sourceFile) {
			this.nameNode = nameNode;
			this.basicBlock = basicBlock;
			this.scope = scope;
			this.sourceFile = sourceFile;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.Scope.Var getSymbol() {
			return scope.getVar(nameNode.getString());
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getNode() {
			return nameNode;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.StaticSourceFile getSourceFile() {
			return sourceFile;
		}

		boolean isDeclaration() {
			com.google.javascript.rhino.Node parent = getParent();
			com.google.javascript.rhino.Node grandparent = parent.getParent();
			return (com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.DECLARATION_PARENTS.contains(parent.getType())) || (((parent.getType()) == (com.google.javascript.rhino.Token.LP)) && ((grandparent.getType()) == (com.google.javascript.rhino.Token.FUNCTION)));
		}

		boolean isVarDeclaration() {
			return (getParent().getType()) == (com.google.javascript.rhino.Token.VAR);
		}

		boolean isHoistedFunction() {
			return com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(getParent());
		}

		boolean isInitializingDeclaration() {
			return ((isDeclaration()) && ((getParent().getType()) != (com.google.javascript.rhino.Token.VAR))) || ((nameNode.getFirstChild()) != null);
		}

		com.google.javascript.rhino.Node getAssignedValue() {
			com.google.javascript.rhino.Node parent = getParent();
			return (parent.getType()) == (com.google.javascript.rhino.Token.FUNCTION) ? parent : com.google.javascript.jscomp.NodeUtil.getAssignedValue(nameNode);
		}

		com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock getBasicBlock() {
			return basicBlock;
		}

		com.google.javascript.rhino.Node getParent() {
			return getNode().getParent();
		}

		com.google.javascript.rhino.Node getGrandparent() {
			com.google.javascript.rhino.Node parent = getParent();
			return parent == null ? null : parent.getParent();
		}

		private static boolean isLhsOfForInExpression(com.google.javascript.rhino.Node n) {
			com.google.javascript.rhino.Node parent = n.getParent();
			if ((parent.getType()) == (com.google.javascript.rhino.Token.VAR)) {
				return com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.isLhsOfForInExpression(parent);
			}
			return (com.google.javascript.jscomp.NodeUtil.isForIn(parent)) && ((parent.getFirstChild()) == n);
		}

		boolean isSimpleAssignmentToName() {
			com.google.javascript.rhino.Node parent = getParent();
			return ((parent.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) && ((parent.getFirstChild()) == (nameNode));
		}

		boolean isLvalue() {
			com.google.javascript.rhino.Node parent = getParent();
			int parentType = parent.getType();
			return (((((parentType == (com.google.javascript.rhino.Token.VAR)) && ((nameNode.getFirstChild()) != null)) || (parentType == (com.google.javascript.rhino.Token.INC))) || (parentType == (com.google.javascript.rhino.Token.DEC))) || ((com.google.javascript.jscomp.NodeUtil.isAssignmentOp(parent)) && ((parent.getFirstChild()) == (nameNode)))) || (com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.isLhsOfForInExpression(nameNode));
		}

		com.google.javascript.jscomp.Scope getScope() {
			return scope;
		}
	}

	static final class BasicBlock {
		private final com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock parent;

		private final boolean isHoisted;

		private final boolean isFunction;

		private final boolean isLoop;

		BasicBlock(com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock parent, com.google.javascript.rhino.Node root) {
			this.parent = parent;
			this.isHoisted = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(root);
			this.isFunction = (root.getType()) == (com.google.javascript.rhino.Token.FUNCTION);
			if ((root.getParent()) != null) {
				int pType = root.getParent().getType();
				this.isLoop = ((pType == (com.google.javascript.rhino.Token.DO)) || (pType == (com.google.javascript.rhino.Token.WHILE))) || (pType == (com.google.javascript.rhino.Token.FOR));
			}else {
				this.isLoop = false;
			}
		}

		com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock getParent() {
			return parent;
		}

		boolean isGlobalScopeBlock() {
			return (getParent()) == null;
		}

		boolean provablyExecutesBefore(com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock thatBlock) {
			com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock currentBlock;
			for (currentBlock = thatBlock; (currentBlock != null) && (currentBlock != (com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock.this)); currentBlock = currentBlock.getParent()) {
				if (currentBlock.isHoisted) {
					return false;
				}
			}
			if (currentBlock == (com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock.this)) {
				return true;
			}
			if ((isGlobalScopeBlock()) && (thatBlock.isGlobalScopeBlock())) {
				return true;
			}
			return false;
		}
	}
}


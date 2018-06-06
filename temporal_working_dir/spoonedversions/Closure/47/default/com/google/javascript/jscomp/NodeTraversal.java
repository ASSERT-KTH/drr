

package com.google.javascript.jscomp;


public class NodeTraversal {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.NodeTraversal.Callback callback;

	private com.google.javascript.rhino.Node curNode;

	public static final com.google.javascript.jscomp.DiagnosticType NODE_TRAVERSAL_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_NODE_TRAVERSAL_ERROR", "{0}");

	private final java.util.Deque<com.google.javascript.jscomp.Scope> scopes = new java.util.ArrayDeque<com.google.javascript.jscomp.Scope>();

	private final java.util.Deque<com.google.javascript.rhino.Node> scopeRoots = new java.util.ArrayDeque<com.google.javascript.rhino.Node>();

	java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> cfgs = new java.util.LinkedList<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>>();

	private java.lang.String sourceName;

	private com.google.javascript.rhino.InputId inputId;

	private com.google.javascript.jscomp.ScopeCreator scopeCreator;

	private com.google.javascript.jscomp.NodeTraversal.ScopedCallback scopeCallback;

	public interface Callback {
		boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal nodeTraversal, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent);

		void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent);
	}

	public interface ScopedCallback extends com.google.javascript.jscomp.NodeTraversal.Callback {
		void enterScope(com.google.javascript.jscomp.NodeTraversal t);

		void exitScope(com.google.javascript.jscomp.NodeTraversal t);
	}

	public abstract static class AbstractPostOrderCallback implements com.google.javascript.jscomp.NodeTraversal.Callback {
		@java.lang.Override
		public final boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal nodeTraversal, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			return true;
		}
	}

	public abstract static class AbstractScopedCallback implements com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
		@java.lang.Override
		public final boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal nodeTraversal, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			return true;
		}

		@java.lang.Override
		public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
		}

		@java.lang.Override
		public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
		}
	}

	public abstract static class AbstractShallowCallback implements com.google.javascript.jscomp.NodeTraversal.Callback {
		@java.lang.Override
		public final boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal nodeTraversal, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			return ((parent == null) || ((parent.getType()) != (com.google.javascript.rhino.Token.FUNCTION))) || (n == (parent.getFirstChild()));
		}
	}

	public abstract static class AbstractShallowStatementCallback implements com.google.javascript.jscomp.NodeTraversal.Callback {
		@java.lang.Override
		public final boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal nodeTraversal, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			return ((parent == null) || (com.google.javascript.jscomp.NodeUtil.isControlStructure(parent))) || (com.google.javascript.jscomp.NodeUtil.isStatementBlock(parent));
		}
	}

	public abstract static class AbstractNodeTypePruningCallback implements com.google.javascript.jscomp.NodeTraversal.Callback {
		private final java.util.Set<java.lang.Integer> nodeTypes;

		private final boolean include;

		public AbstractNodeTypePruningCallback(java.util.Set<java.lang.Integer> nodeTypes) {
			this(nodeTypes, true);
		}

		public AbstractNodeTypePruningCallback(java.util.Set<java.lang.Integer> nodeTypes, boolean include) {
			this.nodeTypes = nodeTypes;
			this.include = include;
		}

		@java.lang.Override
		public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal nodeTraversal, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			return (include) == (nodeTypes.contains(n.getType()));
		}
	}

	public NodeTraversal(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.NodeTraversal.Callback cb) {
		this(compiler, cb, new com.google.javascript.jscomp.SyntacticScopeCreator(compiler));
	}

	public NodeTraversal(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.NodeTraversal.Callback cb, com.google.javascript.jscomp.ScopeCreator scopeCreator) {
		this.callback = cb;
		if (cb instanceof com.google.javascript.jscomp.NodeTraversal.ScopedCallback) {
			com.google.javascript.jscomp.NodeTraversal.this.scopeCallback = ((com.google.javascript.jscomp.NodeTraversal.ScopedCallback) (cb));
		}
		this.compiler = compiler;
		com.google.javascript.jscomp.NodeTraversal.this.inputId = null;
		com.google.javascript.jscomp.NodeTraversal.this.sourceName = "";
		com.google.javascript.jscomp.NodeTraversal.this.scopeCreator = scopeCreator;
	}

	private void throwUnexpectedException(java.lang.Exception unexpectedException) {
		java.lang.String message = unexpectedException.getMessage();
		if ((inputId) != null) {
			message = (((unexpectedException.getMessage()) + "\n") + (formatNodeContext("Node", curNode))) + ((curNode) == null ? "" : formatNodeContext("Parent", curNode.getParent()));
		}
		compiler.throwInternalError(message, unexpectedException);
	}

	private java.lang.String formatNodeContext(java.lang.String label, com.google.javascript.rhino.Node n) {
		if (n == null) {
			return ("  " + label) + ": NULL";
		}
		return (((("  " + label) + "(") + (n.toString(false, false, false))) + "): ") + (formatNodePosition(n));
	}

	public void traverse(com.google.javascript.rhino.Node root) {
		try {
			inputId = com.google.javascript.jscomp.NodeUtil.getInputId(root);
			sourceName = "";
			curNode = root;
			pushScope(root);
			traverseBranch(root, null);
			popScope();
		} catch (java.lang.Exception unexpectedException) {
			throwUnexpectedException(unexpectedException);
		}
	}

	public void traverseRoots(com.google.javascript.rhino.Node... roots) {
		traverseRoots(com.google.common.collect.Lists.newArrayList(roots));
	}

	public void traverseRoots(java.util.List<com.google.javascript.rhino.Node> roots) {
		if (roots.isEmpty()) {
			return ;
		}
		try {
			com.google.javascript.rhino.Node scopeRoot = roots.get(0).getParent();
			com.google.common.base.Preconditions.checkState((scopeRoot != null));
			inputId = com.google.javascript.jscomp.NodeUtil.getInputId(scopeRoot);
			sourceName = "";
			curNode = scopeRoot;
			pushScope(scopeRoot);
			for (com.google.javascript.rhino.Node root : roots) {
				com.google.common.base.Preconditions.checkState(((root.getParent()) == scopeRoot));
				traverseBranch(root, scopeRoot);
			}
			popScope();
		} catch (java.lang.Exception unexpectedException) {
			throwUnexpectedException(unexpectedException);
		}
	}

	private static final java.lang.String MISSING_SOURCE = "[source unknown]";

	private java.lang.String formatNodePosition(com.google.javascript.rhino.Node n) {
		if (n == null) {
			return (com.google.javascript.jscomp.NodeTraversal.MISSING_SOURCE) + "\n";
		}
		int lineNumber = n.getLineno();
		int columnNumber = n.getCharno();
		java.lang.String src = compiler.getSourceLine(sourceName, lineNumber);
		if (src == null) {
			src = com.google.javascript.jscomp.NodeTraversal.MISSING_SOURCE;
		}
		return (((((((sourceName) + ":") + lineNumber) + ":") + columnNumber) + "\n") + src) + "\n";
	}

	void traverseWithScope(com.google.javascript.rhino.Node root, com.google.javascript.jscomp.Scope s) {
		com.google.common.base.Preconditions.checkState(s.isGlobal());
		inputId = null;
		sourceName = "";
		curNode = root;
		pushScope(s);
		traverseBranch(root, null);
		popScope();
	}

	void traverseAtScope(com.google.javascript.jscomp.Scope s) {
		com.google.javascript.rhino.Node n = s.getRootNode();
		if (n.isFunction()) {
			if ((inputId) == null) {
				inputId = com.google.javascript.jscomp.NodeUtil.getInputId(n);
			}
			sourceName = com.google.javascript.jscomp.NodeTraversal.getSourceName(n);
			curNode = n;
			pushScope(s);
			com.google.javascript.rhino.Node args = n.getFirstChild().getNext();
			com.google.javascript.rhino.Node body = args.getNext();
			traverseBranch(args, n);
			traverseBranch(body, n);
			popScope();
		}else {
			traverseWithScope(n, s);
		}
	}

	protected void traverseInnerNode(com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent, com.google.javascript.jscomp.Scope refinedScope) {
		com.google.common.base.Preconditions.checkNotNull(parent);
		if ((refinedScope != null) && ((getScope()) != refinedScope)) {
			curNode = node;
			pushScope(refinedScope);
			traverseBranch(node, parent);
			popScope();
		}else {
			traverseBranch(node, parent);
		}
	}

	public com.google.javascript.jscomp.Compiler getCompiler() {
		return ((com.google.javascript.jscomp.Compiler) (compiler));
	}

	public int getLineNumber() {
		com.google.javascript.rhino.Node cur = curNode;
		while (cur != null) {
			int line = cur.getLineno();
			if (line >= 0) {
				return line;
			}
			cur = cur.getParent();
		} 
		return 0;
	}

	public java.lang.String getSourceName() {
		return sourceName;
	}

	public com.google.javascript.jscomp.CompilerInput getInput() {
		return compiler.getInput(inputId);
	}

	public com.google.javascript.jscomp.JSModule getModule() {
		com.google.javascript.jscomp.CompilerInput input = getInput();
		return input == null ? null : input.getModule();
	}

	public com.google.javascript.rhino.Node getCurrentNode() {
		return curNode;
	}

	public static void traverse(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.rhino.Node root, com.google.javascript.jscomp.NodeTraversal.Callback cb) {
		com.google.javascript.jscomp.NodeTraversal t = new com.google.javascript.jscomp.NodeTraversal(compiler, cb);
		t.traverse(root);
	}

	public static void traverseRoots(com.google.javascript.jscomp.AbstractCompiler compiler, java.util.List<com.google.javascript.rhino.Node> roots, com.google.javascript.jscomp.NodeTraversal.Callback cb) {
		com.google.javascript.jscomp.NodeTraversal t = new com.google.javascript.jscomp.NodeTraversal(compiler, cb);
		t.traverseRoots(roots);
	}

	public static void traverseRoots(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.NodeTraversal.Callback cb, com.google.javascript.rhino.Node... roots) {
		com.google.javascript.jscomp.NodeTraversal t = new com.google.javascript.jscomp.NodeTraversal(compiler, cb);
		t.traverseRoots(roots);
	}

	@java.lang.SuppressWarnings(value = "fallthrough")
	private void traverseBranch(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		int type = n.getType();
		if (type == (com.google.javascript.rhino.Token.SCRIPT)) {
			inputId = n.getInputId();
			sourceName = com.google.javascript.jscomp.NodeTraversal.getSourceName(n);
		}
		curNode = n;
		if (!(callback.shouldTraverse(com.google.javascript.jscomp.NodeTraversal.this, n, parent)))
			return ;
		
		switch (type) {
			case com.google.javascript.rhino.Token.FUNCTION :
				traverseFunction(n, parent);
				break;
			default :
				for (com.google.javascript.rhino.Node child = n.getFirstChild(); child != null;) {
					com.google.javascript.rhino.Node next = child.getNext();
					traverseBranch(child, n);
					child = next;
				}
				break;
		}
		curNode = n;
		callback.visit(com.google.javascript.jscomp.NodeTraversal.this, n, parent);
	}

	private void traverseFunction(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		com.google.common.base.Preconditions.checkState(((n.getChildCount()) == 3));
		com.google.common.base.Preconditions.checkState(n.isFunction());
		final com.google.javascript.rhino.Node fnName = n.getFirstChild();
		boolean isFunctionExpression = (parent != null) && (com.google.javascript.jscomp.NodeUtil.isFunctionExpression(n));
		if (!isFunctionExpression) {
			traverseBranch(fnName, n);
		}
		curNode = n;
		pushScope(n);
		if (isFunctionExpression) {
			traverseBranch(fnName, n);
		}
		final com.google.javascript.rhino.Node args = fnName.getNext();
		final com.google.javascript.rhino.Node body = args.getNext();
		traverseBranch(args, n);
		com.google.common.base.Preconditions.checkState((((body.getNext()) == null) && (body.isBlock())));
		traverseBranch(body, n);
		popScope();
	}

	@java.lang.SuppressWarnings(value = "unchecked")
	public com.google.javascript.rhino.Node getEnclosingFunction() {
		if (((scopes.size()) + (scopeRoots.size())) < 2) {
			return null;
		}else {
			if (scopeRoots.isEmpty()) {
				return scopes.peek().getRootNode();
			}else {
				return scopeRoots.peek();
			}
		}
	}

	private void pushScope(com.google.javascript.rhino.Node node) {
		com.google.common.base.Preconditions.checkState(((curNode) != null));
		scopeRoots.push(node);
		cfgs.push(null);
		if ((scopeCallback) != null) {
			scopeCallback.enterScope(com.google.javascript.jscomp.NodeTraversal.this);
		}
	}

	private void pushScope(com.google.javascript.jscomp.Scope s) {
		com.google.common.base.Preconditions.checkState(((curNode) != null));
		scopes.push(s);
		cfgs.push(null);
		if ((scopeCallback) != null) {
			scopeCallback.enterScope(com.google.javascript.jscomp.NodeTraversal.this);
		}
	}

	private void popScope() {
		if ((scopeCallback) != null) {
			scopeCallback.exitScope(com.google.javascript.jscomp.NodeTraversal.this);
		}
		if (scopeRoots.isEmpty()) {
			scopes.pop();
		}else {
			scopeRoots.pop();
		}
		cfgs.pop();
	}

	public com.google.javascript.jscomp.Scope getScope() {
		com.google.javascript.jscomp.Scope scope = scopes.isEmpty() ? null : scopes.peek();
		if (scopeRoots.isEmpty()) {
			return scope;
		}
		java.util.Iterator<com.google.javascript.rhino.Node> it = scopeRoots.descendingIterator();
		while (it.hasNext()) {
			scope = scopeCreator.createScope(it.next(), scope);
			scopes.push(scope);
		} 
		scopeRoots.clear();
		return scope;
	}

	public com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> getControlFlowGraph() {
		if ((cfgs.peek()) == null) {
			com.google.javascript.jscomp.ControlFlowAnalysis cfa = new com.google.javascript.jscomp.ControlFlowAnalysis(compiler, false, true);
			cfa.process(null, getScopeRoot());
			cfgs.pop();
			cfgs.push(cfa.getCfg());
		}
		return cfgs.peek();
	}

	public com.google.javascript.rhino.Node getScopeRoot() {
		if (scopeRoots.isEmpty()) {
			return scopes.peek().getRootNode();
		}else {
			return scopeRoots.peek();
		}
	}

	boolean inGlobalScope() {
		return (getScopeDepth()) <= 1;
	}

	int getScopeDepth() {
		return (scopes.size()) + (scopeRoots.size());
	}

	public boolean hasScope() {
		return !((scopes.isEmpty()) && (scopeRoots.isEmpty()));
	}

	public void report(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.DiagnosticType diagnosticType, java.lang.String... arguments) {
		com.google.javascript.jscomp.JSError error = com.google.javascript.jscomp.JSError.make(getSourceName(), n, diagnosticType, arguments);
		compiler.report(error);
	}

	private static java.lang.String getSourceName(com.google.javascript.rhino.Node n) {
		java.lang.String name = n.getSourceFileName();
		return name == null ? "" : name;
	}

	com.google.javascript.rhino.InputId getInputId() {
		return inputId;
	}

	public com.google.javascript.jscomp.JSError makeError(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.CheckLevel level, com.google.javascript.jscomp.DiagnosticType type, java.lang.String... arguments) {
		return com.google.javascript.jscomp.JSError.make(getSourceName(), n, level, type, arguments);
	}

	public com.google.javascript.jscomp.JSError makeError(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.DiagnosticType type, java.lang.String... arguments) {
		return com.google.javascript.jscomp.JSError.make(getSourceName(), n, type, arguments);
	}
}


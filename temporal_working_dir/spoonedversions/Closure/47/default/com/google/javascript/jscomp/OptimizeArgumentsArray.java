

package com.google.javascript.jscomp;


class OptimizeArgumentsArray implements com.google.javascript.jscomp.CompilerPass , com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
	private static final java.lang.String ARGUMENTS = "arguments";

	private static final java.lang.String PARAMETER_PREFIX = "JSCompiler_OptimizeArgumentsArray_p";

	private final java.lang.String paramPredix;

	private int uniqueId = 0;

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.Deque<java.util.List<com.google.javascript.rhino.Node>> argumentsAccessStack = com.google.common.collect.Lists.newLinkedList();

	private java.util.List<com.google.javascript.rhino.Node> currentArgumentsAccess = null;

	OptimizeArgumentsArray(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this(compiler, com.google.javascript.jscomp.OptimizeArgumentsArray.PARAMETER_PREFIX);
	}

	OptimizeArgumentsArray(com.google.javascript.jscomp.AbstractCompiler compiler, java.lang.String paramPrefix) {
		this.compiler = com.google.common.base.Preconditions.checkNotNull(compiler);
		this.paramPredix = com.google.common.base.Preconditions.checkNotNull(paramPrefix);
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, com.google.common.base.Preconditions.checkNotNull(root), com.google.javascript.jscomp.OptimizeArgumentsArray.this);
	}

	@java.lang.Override
	public void enterScope(com.google.javascript.jscomp.NodeTraversal traversal) {
		com.google.common.base.Preconditions.checkNotNull(traversal);
		com.google.javascript.rhino.Node function = traversal.getScopeRoot();
		if (!(function.isFunction())) {
			return ;
		}
		if ((currentArgumentsAccess) != null) {
			argumentsAccessStack.push(currentArgumentsAccess);
		}
		currentArgumentsAccess = com.google.common.collect.Lists.newLinkedList();
	}

	@java.lang.Override
	public void exitScope(com.google.javascript.jscomp.NodeTraversal traversal) {
		com.google.common.base.Preconditions.checkNotNull(traversal);
		if ((currentArgumentsAccess) == null) {
			return ;
		}
		if (tryReplaceArguments(traversal.getScope())) {
			traversal.getCompiler().reportCodeChange();
		}
		if (!(argumentsAccessStack.isEmpty())) {
			currentArgumentsAccess = argumentsAccessStack.pop();
		}else {
			currentArgumentsAccess = null;
		}
	}

	@java.lang.Override
	public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal nodeTraversal, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
		return true;
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal traversal, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
		com.google.common.base.Preconditions.checkNotNull(traversal);
		com.google.common.base.Preconditions.checkNotNull(node);
		if ((currentArgumentsAccess) == null) {
			return ;
		}
		if ((node.isName()) && (com.google.javascript.jscomp.OptimizeArgumentsArray.ARGUMENTS.equals(node.getString()))) {
			currentArgumentsAccess.add(node);
		}
	}

	private boolean tryReplaceArguments(com.google.javascript.jscomp.Scope scope) {
		com.google.javascript.rhino.Node parametersList = scope.getRootNode().getFirstChild().getNext();
		com.google.common.base.Preconditions.checkState(parametersList.isParamList());
		boolean changed = false;
		int numNamedParameter = parametersList.getChildCount();
		int highestIndex = numNamedParameter - 1;
		for (com.google.javascript.rhino.Node ref : currentArgumentsAccess) {
			com.google.javascript.rhino.Node getElem = ref.getParent();
			if ((getElem.getType()) != (com.google.javascript.rhino.Token.GETELEM)) {
				return false;
			}
			com.google.javascript.rhino.Node index = ref.getNext();
			if ((index.getType()) != (com.google.javascript.rhino.Token.NUMBER)) {
				return false;
			}
			com.google.javascript.rhino.Node getElemParent = getElem.getParent();
			if ((getElemParent.isCall()) && ((getElemParent.getFirstChild()) == getElem)) {
				return false;
			}
			int value = ((int) (index.getDouble()));
			if (value > highestIndex) {
				highestIndex = value;
			}
		}
		int numExtraArgs = (highestIndex - numNamedParameter) + 1;
		java.lang.String[] argNames = new java.lang.String[numExtraArgs];
		for (int i = 0; i < numExtraArgs; i++) {
			java.lang.String name = getNewName();
			argNames[i] = name;
			parametersList.addChildrenToBack(com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, name));
			changed = true;
		}
		for (com.google.javascript.rhino.Node ref : currentArgumentsAccess) {
			com.google.javascript.rhino.Node index = ref.getNext();
			if ((index.getType()) != (com.google.javascript.rhino.Token.NUMBER)) {
				continue;
			}
			int value = ((int) (index.getDouble()));
			if (value >= numNamedParameter) {
				ref.getParent().getParent().replaceChild(ref.getParent(), com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, argNames[(value - numNamedParameter)]));
			}else {
				com.google.javascript.rhino.Node name = parametersList.getFirstChild();
				for (int i = 0; i < value; i++) {
					name = name.getNext();
				}
				ref.getParent().getParent().replaceChild(ref.getParent(), com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, name.getString()));
			}
			changed = true;
		}
		return changed;
	}

	private java.lang.String getNewName() {
		return (paramPredix) + ((uniqueId)++);
	}
}


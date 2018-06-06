

package com.google.javascript.jscomp;


class OperaCompoundAssignFix extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass , com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
	private com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.Deque<com.google.javascript.jscomp.VariableNameGenerator> names;

	@java.lang.Override
	public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
		names.push(new com.google.javascript.jscomp.VariableNameGenerator(t.getScope()));
	}

	@java.lang.Override
	public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
		names.pop();
	}

	OperaCompoundAssignFix(com.google.javascript.jscomp.AbstractCompiler compiler) {
		com.google.javascript.jscomp.OperaCompoundAssignFix.this.compiler = compiler;
		names = com.google.common.collect.Lists.newLinkedList();
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		java.util.List<com.google.javascript.rhino.Node> code = com.google.common.collect.Lists.newArrayList(externs, root);
		com.google.javascript.jscomp.NodeTraversal.traverseRoots(compiler, code, com.google.javascript.jscomp.OperaCompoundAssignFix.this);
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if (!(com.google.javascript.jscomp.NodeUtil.isName(n))) {
			return ;
		}
		if (!(com.google.javascript.jscomp.NodeUtil.isGet(parent))) {
			return ;
		}
		boolean nested = false;
		boolean reassign = false;
		com.google.javascript.rhino.Node lastAssign = null;
		com.google.javascript.rhino.Node prevParent = n;
		while (!((com.google.javascript.jscomp.NodeUtil.isExpressionNode(parent)) || (com.google.javascript.jscomp.NodeUtil.isStatementBlock(parent)))) {
			if ((((com.google.javascript.jscomp.NodeUtil.isAssign(parent)) && (com.google.javascript.jscomp.NodeUtil.isName(parent.getFirstChild()))) && (parent.getFirstChild().getString().equals(n.getString()))) && nested) {
				reassign = true;
				break;
			}else
				if ((com.google.javascript.jscomp.NodeUtil.isAssignmentOp(parent)) && ((parent.getLastChild()) == prevParent)) {
					if (lastAssign == null) {
						nested = true;
					}
					lastAssign = parent;
				}
			
			prevParent = parent;
			parent = parent.getParent();
		} 
		if (!(reassign && nested)) {
			return ;
		}
		applyWorkAround(parent, t);
	}

	private void applyWorkAround(com.google.javascript.rhino.Node assign, com.google.javascript.jscomp.NodeTraversal t) {
		com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isAssign(assign));
		com.google.javascript.rhino.Node parent = assign.getParent();
		com.google.javascript.rhino.Node comma = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.COMMA);
		comma.copyInformationFrom(assign);
		parent.replaceChild(assign, comma);
		java.lang.String newName = names.peek().getNextNewName();
		com.google.javascript.rhino.Node newAssign = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ASSIGN, com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, newName));
		newAssign.copyInformationFromForTree(assign);
		newAssign.addChildToBack(assign.getLastChild().detachFromParent());
		comma.addChildrenToBack(newAssign);
		assign.addChildrenToBack(com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, newName).copyInformationFrom(assign));
		comma.addChildrenToBack(assign);
		com.google.javascript.rhino.Node root = t.getScopeRoot();
		com.google.javascript.rhino.Node var = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VAR, com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, newName));
		var.copyInformationFromForTree(assign);
		if (com.google.javascript.jscomp.NodeUtil.isStatementBlock(root)) {
			root = compiler.getNodeForCodeInsertion(t.getModule());
			root.addChildrenToFront(var);
		}else {
			root.getLastChild().addChildrenToFront(var);
		}
		compiler.reportCodeChange();
	}
}


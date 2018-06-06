

package com.google.javascript.jscomp;


class MinimizeExitPoints extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
	com.google.javascript.jscomp.AbstractCompiler compiler;

	MinimizeExitPoints(com.google.javascript.jscomp.AbstractCompiler compiler) {
		com.google.javascript.jscomp.MinimizeExitPoints.this.compiler = compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.MinimizeExitPoints.this);
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.LABEL :
				tryMinimizeExits(n.getLastChild(), com.google.javascript.rhino.Token.BREAK, n.getFirstChild().getString());
				break;
			case com.google.javascript.rhino.Token.FOR :
			case com.google.javascript.rhino.Token.WHILE :
				tryMinimizeExits(com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(n), com.google.javascript.rhino.Token.CONTINUE, null);
				break;
			case com.google.javascript.rhino.Token.DO :
				tryMinimizeExits(com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(n), com.google.javascript.rhino.Token.CONTINUE, null);
				com.google.javascript.rhino.Node cond = com.google.javascript.jscomp.NodeUtil.getConditionExpression(n);
				if ((com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(cond)) == (com.google.javascript.rhino.jstype.TernaryValue.FALSE)) {
					tryMinimizeExits(n.getFirstChild(), com.google.javascript.rhino.Token.BREAK, null);
				}
				break;
			case com.google.javascript.rhino.Token.FUNCTION :
				tryMinimizeExits(n.getLastChild(), com.google.javascript.rhino.Token.RETURN, null);
				break;
		}
	}

	void tryMinimizeExits(com.google.javascript.rhino.Node n, int exitType, java.lang.String labelName) {
		if (com.google.javascript.jscomp.MinimizeExitPoints.matchingExitNode(n, exitType, labelName)) {
			com.google.javascript.jscomp.NodeUtil.removeChild(n.getParent(), n);
			compiler.reportCodeChange();
			return ;
		}
		if ((n.getType()) == (com.google.javascript.rhino.Token.IF)) {
			com.google.javascript.rhino.Node ifBlock = n.getFirstChild().getNext();
			tryMinimizeExits(ifBlock, exitType, labelName);
			com.google.javascript.rhino.Node elseBlock = ifBlock.getNext();
			if (elseBlock != null) {
				tryMinimizeExits(elseBlock, exitType, labelName);
			}
			return ;
		}
		if ((n.getType()) == (com.google.javascript.rhino.Token.TRY)) {
			com.google.javascript.rhino.Node tryBlock = n.getFirstChild();
			tryMinimizeExits(tryBlock, exitType, labelName);
			com.google.javascript.rhino.Node allCatchNodes = com.google.javascript.jscomp.NodeUtil.getCatchBlock(n);
			if (com.google.javascript.jscomp.NodeUtil.hasCatchHandler(allCatchNodes)) {
				com.google.common.base.Preconditions.checkState(allCatchNodes.hasOneChild());
				com.google.javascript.rhino.Node catchNode = allCatchNodes.getFirstChild();
				com.google.javascript.rhino.Node catchCodeBlock = catchNode.getLastChild();
				tryMinimizeExits(catchCodeBlock, exitType, labelName);
			}
			if (com.google.javascript.jscomp.NodeUtil.hasFinally(n)) {
				com.google.javascript.rhino.Node finallyBlock = n.getLastChild();
				tryMinimizeExits(finallyBlock, exitType, labelName);
			}
		}
		if ((n.getType()) == (com.google.javascript.rhino.Token.LABEL)) {
			com.google.javascript.rhino.Node labelBlock = n.getLastChild();
			tryMinimizeExits(labelBlock, exitType, labelName);
		}
		if (((n.getType()) != (com.google.javascript.rhino.Token.BLOCK)) || ((n.getLastChild()) == null)) {
			return ;
		}
		for (com.google.javascript.rhino.Node c : n.children()) {
			if ((c.getType()) == (com.google.javascript.rhino.Token.IF)) {
				com.google.javascript.rhino.Node ifTree = c;
				com.google.javascript.rhino.Node trueBlock;
				com.google.javascript.rhino.Node falseBlock;
				trueBlock = ifTree.getFirstChild().getNext();
				falseBlock = trueBlock.getNext();
				tryMinimizeIfBlockExits(trueBlock, falseBlock, ifTree, exitType, labelName);
				trueBlock = ifTree.getFirstChild().getNext();
				falseBlock = trueBlock.getNext();
				if (falseBlock != null) {
					tryMinimizeIfBlockExits(falseBlock, trueBlock, ifTree, exitType, labelName);
				}
			}
			if (c == (n.getLastChild())) {
				break;
			}
		}
		for (com.google.javascript.rhino.Node c = n.getLastChild(); c != null; c = n.getLastChild()) {
			tryMinimizeExits(c, exitType, labelName);
			if (c == (n.getLastChild())) {
				break;
			}
		}
	}

	private void tryMinimizeIfBlockExits(com.google.javascript.rhino.Node srcBlock, com.google.javascript.rhino.Node destBlock, com.google.javascript.rhino.Node ifNode, int exitType, java.lang.String labelName) {
		com.google.javascript.rhino.Node exitNodeParent = null;
		com.google.javascript.rhino.Node exitNode = null;
		if ((srcBlock.getType()) == (com.google.javascript.rhino.Token.BLOCK)) {
			if (!(srcBlock.hasChildren())) {
				return ;
			}
			exitNodeParent = srcBlock;
			exitNode = exitNodeParent.getLastChild();
		}else {
			exitNodeParent = ifNode;
			exitNode = srcBlock;
		}
		if (!(com.google.javascript.jscomp.MinimizeExitPoints.matchingExitNode(exitNode, exitType, labelName))) {
			return ;
		}
		if ((ifNode.getNext()) != null) {
			com.google.javascript.rhino.Node newDestBlock = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BLOCK).copyInformationFrom(ifNode);
			if (destBlock == null) {
				ifNode.addChildToBack(newDestBlock);
			}else
				if ((destBlock.getType()) == (com.google.javascript.rhino.Token.EMPTY)) {
					ifNode.replaceChild(destBlock, newDestBlock);
				}else
					if ((destBlock.getType()) == (com.google.javascript.rhino.Token.BLOCK)) {
						newDestBlock = destBlock;
					}else {
						ifNode.replaceChild(destBlock, newDestBlock);
						newDestBlock.addChildToBack(destBlock);
					}
				
			
			com.google.javascript.jscomp.MinimizeExitPoints.moveAllFollowing(ifNode, ifNode.getParent(), newDestBlock);
		}
		com.google.javascript.jscomp.NodeUtil.removeChild(exitNodeParent, exitNode);
		compiler.reportCodeChange();
	}

	private static boolean matchingExitNode(com.google.javascript.rhino.Node n, int type, java.lang.String labelName) {
		if ((n.getType()) == type) {
			if (type == (com.google.javascript.rhino.Token.RETURN)) {
				return !(n.hasChildren());
			}else {
				if (labelName == null) {
					return !(n.hasChildren());
				}else {
					return (n.hasChildren()) && (labelName.equals(n.getFirstChild().getString()));
				}
			}
		}
		return false;
	}

	private static void moveAllFollowing(com.google.javascript.rhino.Node start, com.google.javascript.rhino.Node srcParent, com.google.javascript.rhino.Node destParent) {
		for (com.google.javascript.rhino.Node n = start.getNext(); n != null; n = start.getNext()) {
			boolean isFunctionDeclaration = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n);
			srcParent.removeChild(n);
			if (isFunctionDeclaration) {
				destParent.addChildToFront(n);
			}else {
				destParent.addChildToBack(n);
			}
		}
	}
}


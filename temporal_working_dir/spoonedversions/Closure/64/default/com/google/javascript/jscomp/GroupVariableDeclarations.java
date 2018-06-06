

package com.google.javascript.jscomp;


class GroupVariableDeclarations implements com.google.javascript.jscomp.CompilerPass , com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	GroupVariableDeclarations(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.GroupVariableDeclarations.this);
	}

	public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
		java.util.Set<com.google.javascript.rhino.Node> varNodes = com.google.common.collect.Sets.newLinkedHashSet();
		java.util.Iterator<com.google.javascript.jscomp.Scope.Var> scopeVarIter = t.getScope().getVars();
		while (scopeVarIter.hasNext()) {
			com.google.javascript.rhino.Node parentNode = scopeVarIter.next().getParentNode();
			if ((parentNode.getType()) == (com.google.javascript.rhino.Token.VAR)) {
				varNodes.add(parentNode);
			}
		} 
		if ((varNodes.size()) <= 1) {
			return ;
		}
		java.util.Iterator<com.google.javascript.rhino.Node> varNodeIter = varNodes.iterator();
		com.google.javascript.rhino.Node firstVarNode = varNodeIter.next();
		while (varNodeIter.hasNext()) {
			com.google.javascript.rhino.Node varNode = varNodeIter.next();
			applyGroupingToVar(firstVarNode, varNode);
		} 
	}

	public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
	}

	public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal nodeTraversal, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		return true;
	}

	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
	}

	private void applyGroupingToVar(com.google.javascript.rhino.Node firstVar, com.google.javascript.rhino.Node groupVar) {
		com.google.javascript.rhino.Node child = groupVar.getFirstChild();
		com.google.javascript.rhino.Node initializedName = null;
		while (child != null) {
			if (child.hasChildren()) {
				if (initializedName != null) {
					return ;
				}
				initializedName = child;
			}
			child = child.getNext();
		} 
		com.google.javascript.rhino.Node groupVarParent = groupVar.getParent();
		if (initializedName != null) {
			if (com.google.javascript.jscomp.NodeUtil.isForIn(groupVarParent)) {
				return ;
			}
			com.google.javascript.rhino.Node clone = initializedName.cloneNode();
			groupVar.replaceChild(initializedName, clone);
			com.google.javascript.rhino.Node initializedVal = initializedName.getFirstChild();
			initializedName.removeChild(initializedVal);
			com.google.javascript.rhino.Node assignmentNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ASSIGN, initializedName);
			assignmentNode.addChildAfter(initializedVal, initializedName);
			if ((groupVarParent.getType()) == (com.google.javascript.rhino.Token.FOR)) {
				groupVarParent.replaceChild(groupVar, assignmentNode);
			}else {
				com.google.javascript.rhino.Node exprNode = com.google.javascript.jscomp.NodeUtil.newExpr(assignmentNode);
				groupVarParent.replaceChild(groupVar, exprNode);
			}
		}else {
			if ((groupVarParent.getType()) == (com.google.javascript.rhino.Token.FOR)) {
				if (com.google.javascript.jscomp.NodeUtil.isForIn(groupVarParent)) {
					com.google.javascript.rhino.Node nameNodeClone = groupVar.getFirstChild().cloneNode();
					groupVarParent.replaceChild(groupVar, nameNodeClone);
				}else {
					com.google.javascript.rhino.Node emptyNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EMPTY);
					groupVarParent.replaceChild(groupVar, emptyNode);
				}
			}else {
				groupVarParent.removeChild(groupVar);
			}
		}
		com.google.javascript.rhino.Node children = groupVar.removeChildren();
		firstVar.addChildrenToBack(children);
		compiler.reportCodeChange();
	}
}




package com.google.javascript.jscomp;


class CollapseVariableDeclarations implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private static class Collapse {
		final com.google.javascript.rhino.Node firstVarNode;

		final com.google.javascript.rhino.Node parent;

		Collapse(com.google.javascript.rhino.Node firstVarNode, com.google.javascript.rhino.Node parent) {
			this.firstVarNode = firstVarNode;
			this.parent = parent;
		}
	}

	private final java.util.List<com.google.javascript.jscomp.CollapseVariableDeclarations.Collapse> collapses = com.google.common.collect.Lists.newArrayList();

	private final java.util.Set<com.google.javascript.rhino.Node> nodesToCollapse = com.google.common.collect.Sets.newHashSet();

	CollapseVariableDeclarations(com.google.javascript.jscomp.AbstractCompiler compiler) {
		com.google.common.base.Preconditions.checkState((!(compiler.getLifeCycleStage().isNormalized())));
		this.compiler = compiler;
	}

	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		collapses.clear();
		nodesToCollapse.clear();
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.CombinedCompilerPass(compiler, new com.google.javascript.jscomp.CollapseVariableDeclarations.ExploitAssigns(), new com.google.javascript.jscomp.CollapseVariableDeclarations.GatherCollapses()));
		if (!(collapses.isEmpty())) {
			applyCollapses();
			compiler.reportCodeChange();
		}
	}

	private class ExploitAssigns extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node expr, com.google.javascript.rhino.Node exprParent) {
			if (!(com.google.javascript.jscomp.NodeUtil.isExprAssign(expr))) {
				return ;
			}
			collapseAssign(t, expr.getFirstChild(), expr, exprParent);
		}

		private void collapseAssign(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node assign, com.google.javascript.rhino.Node expr, com.google.javascript.rhino.Node exprParent) {
			com.google.javascript.rhino.Node leftValue = assign.getFirstChild();
			com.google.javascript.rhino.Node rightValue = leftValue.getNext();
			if ((isCollapsibleValue(leftValue, true)) && (collapseAssignEqualTo(expr, exprParent, leftValue))) {
				t.getCompiler().reportCodeChange();
			}else
				if ((isCollapsibleValue(rightValue, false)) && (collapseAssignEqualTo(expr, exprParent, rightValue))) {
					t.getCompiler().reportCodeChange();
				}else
					if ((rightValue.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) {
						collapseAssign(t, rightValue, expr, exprParent);
					}
				
			
		}

		private boolean isCollapsibleValue(com.google.javascript.rhino.Node value, boolean isLValue) {
			switch (value.getType()) {
				case com.google.javascript.rhino.Token.GETPROP :
					return (!isLValue) || ((value.getFirstChild().getType()) == (com.google.javascript.rhino.Token.THIS));
				case com.google.javascript.rhino.Token.NAME :
				case com.google.javascript.rhino.Token.NUMBER :
				case com.google.javascript.rhino.Token.TRUE :
				case com.google.javascript.rhino.Token.FALSE :
				case com.google.javascript.rhino.Token.NULL :
				case com.google.javascript.rhino.Token.STRING :
					return true;
			}
			return false;
		}

		private boolean collapseAssignEqualTo(com.google.javascript.rhino.Node expr, com.google.javascript.rhino.Node exprParent, com.google.javascript.rhino.Node value) {
			com.google.javascript.rhino.Node assign = expr.getFirstChild();
			com.google.javascript.rhino.Node parent = exprParent;
			com.google.javascript.rhino.Node next = expr.getNext();
			while (next != null) {
				switch (next.getType()) {
					case com.google.javascript.rhino.Token.AND :
					case com.google.javascript.rhino.Token.OR :
					case com.google.javascript.rhino.Token.HOOK :
					case com.google.javascript.rhino.Token.IF :
					case com.google.javascript.rhino.Token.RETURN :
					case com.google.javascript.rhino.Token.EXPR_RESULT :
						parent = next;
						next = next.getFirstChild();
						break;
					case com.google.javascript.rhino.Token.VAR :
						if (next.getFirstChild().hasChildren()) {
							parent = next.getFirstChild();
							next = parent.getFirstChild();
							break;
						}
						return false;
					case com.google.javascript.rhino.Token.GETPROP :
					case com.google.javascript.rhino.Token.NAME :
						if (next.isQualifiedName()) {
							java.lang.String nextName = next.getQualifiedName();
							if ((value.isQualifiedName()) && (nextName.equals(value.getQualifiedName()))) {
								if (!(isSafeReplacement(next, assign))) {
									return false;
								}
								exprParent.removeChild(expr);
								expr.removeChild(assign);
								parent.replaceChild(next, assign);
								return true;
							}
						}
						return false;
					case com.google.javascript.rhino.Token.NUMBER :
					case com.google.javascript.rhino.Token.TRUE :
					case com.google.javascript.rhino.Token.FALSE :
					case com.google.javascript.rhino.Token.NULL :
					case com.google.javascript.rhino.Token.STRING :
						if ((value.getType()) == (next.getType())) {
							if ((((next.getType()) == (com.google.javascript.rhino.Token.STRING)) || ((next.getType()) == (com.google.javascript.rhino.Token.NUMBER))) && (!(next.isEquivalentTo(value)))) {
								return false;
							}
							exprParent.removeChild(expr);
							expr.removeChild(assign);
							parent.replaceChild(next, assign);
							return true;
						}
						return false;
					case com.google.javascript.rhino.Token.ASSIGN :
						com.google.javascript.rhino.Node leftSide = next.getFirstChild();
						if (((leftSide.getType()) == (com.google.javascript.rhino.Token.NAME)) || (((leftSide.getType()) == (com.google.javascript.rhino.Token.GETPROP)) && ((leftSide.getFirstChild().getType()) == (com.google.javascript.rhino.Token.THIS)))) {
							parent = next;
							next = leftSide.getNext();
							break;
						}else {
							return false;
						}
					default :
						return false;
				}
			} 
			return false;
		}
	}

	private boolean isSafeReplacement(com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node replacement) {
		if ((node.getType()) == (com.google.javascript.rhino.Token.NAME)) {
			return true;
		}
		com.google.common.base.Preconditions.checkArgument(((node.getType()) == (com.google.javascript.rhino.Token.GETPROP)));
		com.google.javascript.rhino.Node name = node.getFirstChild();
		if (((name.getType()) == (com.google.javascript.rhino.Token.NAME)) && (isNameAssignedTo(name.getString(), replacement))) {
			return false;
		}
		return true;
	}

	private boolean isNameAssignedTo(java.lang.String name, com.google.javascript.rhino.Node node) {
		for (com.google.javascript.rhino.Node c = node.getFirstChild(); c != null; c = c.getNext()) {
			if (isNameAssignedTo(name, c)) {
				return true;
			}
		}
		if ((node.getType()) == (com.google.javascript.rhino.Token.NAME)) {
			com.google.javascript.rhino.Node parent = node.getParent();
			if (((parent.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) && ((parent.getFirstChild()) == node)) {
				if (name.equals(node.getString())) {
					return true;
				}
			}
		}
		return false;
	}

	private class GatherCollapses extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.getType()) != (com.google.javascript.rhino.Token.VAR))
				return ;
			
			if (nodesToCollapse.contains(n))
				return ;
			
			if ((parent.getType()) == (com.google.javascript.rhino.Token.IF))
				return ;
			
			com.google.javascript.rhino.Node varNode = n;
			n = n.getNext();
			boolean hasNodesToCollapse = false;
			while ((n != null) && ((n.getType()) == (com.google.javascript.rhino.Token.VAR))) {
				nodesToCollapse.add(n);
				hasNodesToCollapse = true;
				n = n.getNext();
			} 
			if (hasNodesToCollapse) {
				nodesToCollapse.add(varNode);
				collapses.add(new com.google.javascript.jscomp.CollapseVariableDeclarations.Collapse(varNode, parent));
			}
		}
	}

	private void applyCollapses() {
		for (com.google.javascript.jscomp.CollapseVariableDeclarations.Collapse collapse : collapses) {
			com.google.javascript.rhino.Node first = collapse.firstVarNode;
			while (((first.getNext()) != null) && ((first.getNext().getType()) == (com.google.javascript.rhino.Token.VAR))) {
				com.google.javascript.rhino.Node next = collapse.parent.removeChildAfter(first);
				first.addChildrenToBack(next.removeChildren());
			} 
		}
	}
}


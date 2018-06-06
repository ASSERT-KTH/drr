

package com.google.javascript.jscomp;


class CollapseVariableDeclarations implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private static class Collapse {
		final com.google.javascript.rhino.Node startNode;

		final com.google.javascript.rhino.Node endNode;

		final com.google.javascript.rhino.Node parent;

		Collapse(com.google.javascript.rhino.Node startNode, com.google.javascript.rhino.Node endNode, com.google.javascript.rhino.Node parent) {
			this.startNode = startNode;
			this.endNode = endNode;
			this.parent = parent;
		}
	}

	private final java.util.List<com.google.javascript.jscomp.CollapseVariableDeclarations.Collapse> collapses = com.google.common.collect.Lists.newArrayList();

	private final java.util.Set<com.google.javascript.rhino.Node> nodesToCollapse = com.google.common.collect.Sets.newHashSet();

	CollapseVariableDeclarations(com.google.javascript.jscomp.AbstractCompiler compiler) {
		com.google.common.base.Preconditions.checkState((!(compiler.getLifeCycleStage().isNormalized())));
		this.compiler = compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		collapses.clear();
		nodesToCollapse.clear();
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.CollapseVariableDeclarations.GatherCollapses());
		if (!(collapses.isEmpty())) {
			applyCollapses();
			compiler.reportCodeChange();
		}
	}

	private class GatherCollapses extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		private final java.util.Set<com.google.javascript.jscomp.Scope.Var> blacklistedVars = com.google.common.collect.Sets.newHashSet();

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (n.isVar()) {
				blacklistStubVars(t, n);
			}
			if (((n.getType()) != (com.google.javascript.rhino.Token.VAR)) && (!(canBeRedeclared(n, t.getScope()))))
				return ;
			
			if (nodesToCollapse.contains(n))
				return ;
			
			if (parent.isIf())
				return ;
			
			com.google.javascript.rhino.Node varNode = n;
			boolean hasVar = n.isVar();
			n = n.getNext();
			boolean hasNodesToCollapse = false;
			while ((n != null) && ((n.isVar()) || (canBeRedeclared(n, t.getScope())))) {
				if (n.isVar()) {
					blacklistStubVars(t, n);
					hasVar = true;
				}
				nodesToCollapse.add(n);
				hasNodesToCollapse = true;
				n = n.getNext();
			} 
			if (hasNodesToCollapse && hasVar) {
				nodesToCollapse.add(varNode);
				collapses.add(new com.google.javascript.jscomp.CollapseVariableDeclarations.Collapse(varNode, n, parent));
			}
		}

		private void blacklistStubVars(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node varNode) {
			for (com.google.javascript.rhino.Node child = varNode.getFirstChild(); child != null; child = child.getNext()) {
				if ((child.getFirstChild()) == null) {
					blacklistedVars.add(t.getScope().getVar(child.getString()));
				}
			}
		}

		private boolean canBeRedeclared(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.Scope s) {
			if (!(com.google.javascript.jscomp.NodeUtil.isExprAssign(n))) {
				return false;
			}
			com.google.javascript.rhino.Node assign = n.getFirstChild();
			com.google.javascript.rhino.Node lhs = assign.getFirstChild();
			if (!(lhs.isName())) {
				return false;
			}
			com.google.javascript.jscomp.Scope.Var var = s.getVar(lhs.getString());
			return ((var != null) && ((var.getScope()) == s)) && (!(blacklistedVars.contains(var)));
		}
	}

	private void applyCollapses() {
		for (com.google.javascript.jscomp.CollapseVariableDeclarations.Collapse collapse : collapses) {
			com.google.javascript.rhino.Node var = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VAR);
			var.copyInformationFrom(collapse.startNode);
			collapse.parent.addChildBefore(var, collapse.startNode);
			boolean redeclaration = false;
			for (com.google.javascript.rhino.Node n = collapse.startNode; n != (collapse.endNode);) {
				com.google.javascript.rhino.Node next = n.getNext();
				com.google.common.base.Preconditions.checkState(((var.getNext()) == n));
				collapse.parent.removeChildAfter(var);
				if (n.isVar()) {
					while (n.hasChildren()) {
						var.addChildToBack(n.removeFirstChild());
					} 
				}else {
					com.google.javascript.rhino.Node assign = n.getFirstChild();
					com.google.javascript.rhino.Node lhs = assign.getFirstChild();
					com.google.common.base.Preconditions.checkState(lhs.isName());
					com.google.javascript.rhino.Node rhs = assign.getLastChild();
					lhs.addChildToBack(rhs.detachFromParent());
					var.addChildToBack(lhs.detachFromParent());
					redeclaration = true;
				}
				n = next;
			}
			if (redeclaration) {
				com.google.javascript.rhino.JSDocInfo info = new com.google.javascript.rhino.JSDocInfo();
				info.addSuppression("duplicate");
				var.setJSDocInfo(info);
			}
		}
	}
}


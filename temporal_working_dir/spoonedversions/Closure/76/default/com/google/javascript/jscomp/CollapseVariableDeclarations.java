

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
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.CollapseVariableDeclarations.GatherCollapses());
		if (!(collapses.isEmpty())) {
			applyCollapses();
			compiler.reportCodeChange();
		}
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


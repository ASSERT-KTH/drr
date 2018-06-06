

package com.google.javascript.jscomp;


class MoveFunctionDeclarations implements com.google.javascript.jscomp.CompilerPass , com.google.javascript.jscomp.NodeTraversal.Callback {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.Map<com.google.javascript.jscomp.JSModule, java.util.List<com.google.javascript.rhino.Node>> functions;

	MoveFunctionDeclarations(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
		functions = com.google.common.collect.Maps.newHashMap();
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.MoveFunctionDeclarations.this);
		for (java.util.Map.Entry<com.google.javascript.jscomp.JSModule, java.util.List<com.google.javascript.rhino.Node>> entry : functions.entrySet()) {
			com.google.javascript.jscomp.JSModule module = entry.getKey();
			com.google.javascript.rhino.Node addingRoot = compiler.getNodeForCodeInsertion(module);
			for (com.google.javascript.rhino.Node n : com.google.common.collect.Lists.reverse(entry.getValue())) {
				addingRoot.addChildToFront(n);
			}
		}
	}

	@java.lang.Override
	public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		com.google.javascript.rhino.Node gramps = n.getAncestor(2);
		return (gramps == null) || ((gramps.getType()) != (com.google.javascript.rhino.Token.SCRIPT));
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if ((parent == null) || ((parent.getType()) != (com.google.javascript.rhino.Token.SCRIPT))) {
			return ;
		}
		if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n)) {
			parent.removeChild(n);
			compiler.reportCodeChange();
			com.google.javascript.jscomp.JSModule module = t.getModule();
			java.util.List<com.google.javascript.rhino.Node> moduleFunctions = functions.get(module);
			if (moduleFunctions == null) {
				moduleFunctions = com.google.common.collect.Lists.newArrayList();
				functions.put(module, moduleFunctions);
			}
			moduleFunctions.add(n);
		}
	}
}


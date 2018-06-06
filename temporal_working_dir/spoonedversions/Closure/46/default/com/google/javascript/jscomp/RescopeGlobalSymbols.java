

package com.google.javascript.jscomp;


class RescopeGlobalSymbols implements com.google.javascript.jscomp.CompilerPass {
	private static final java.lang.String DISAMBIGUATION_SUFFIX = "$";

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.lang.String globalSymbolNamespace;

	private final boolean addExtern;

	RescopeGlobalSymbols(com.google.javascript.jscomp.AbstractCompiler compiler, java.lang.String globalSymbolNamespace, boolean addExtern) {
		this.compiler = compiler;
		this.globalSymbolNamespace = globalSymbolNamespace;
		this.addExtern = addExtern;
	}

	RescopeGlobalSymbols(com.google.javascript.jscomp.AbstractCompiler compiler, java.lang.String globalSymbolNamespace) {
		this(compiler, globalSymbolNamespace, true);
	}

	private void addExternForGlobalSymbolNamespace() {
		com.google.javascript.rhino.Node nameNode = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, globalSymbolNamespace);
		com.google.javascript.rhino.Node varNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VAR);
		varNode.addChildToBack(nameNode);
		com.google.javascript.jscomp.CompilerInput input = compiler.newExternInput("{RescopeGlobalSymbolsNamespaceVar}");
		input.getAstRoot(compiler).addChildrenToBack(varNode);
		compiler.reportCodeChange();
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		if (addExtern) {
			addExternForGlobalSymbolNamespace();
		}
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.RescopeGlobalSymbols.RewriteGlobalFunctionStatementsToVarAssignmentsCallback());
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.RescopeGlobalSymbols.RewriteScopeCallback());
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.RescopeGlobalSymbols.RemoveGlobalVarCallback());
	}

	private class RewriteGlobalFunctionStatementsToVarAssignmentsCallback extends com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n)) {
				java.lang.String name = com.google.javascript.jscomp.NodeUtil.getFunctionName(n);
				n.getFirstChild().setString("");
				com.google.javascript.rhino.Node prev = parent.getChildBefore(n);
				n.detachFromParent();
				com.google.javascript.rhino.Node var = com.google.javascript.jscomp.NodeUtil.newVarNode(name, n);
				if (prev == null) {
					parent.addChildToFront(var);
				}else {
					parent.addChildAfter(var, prev);
				}
				compiler.reportCodeChange();
			}
		}
	}

	private class RewriteScopeCallback extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (!(n.isName())) {
				return ;
			}
			java.lang.String name = n.getString();
			if ((parent.isFunction()) && ((name.length()) == 0)) {
				return ;
			}
			com.google.javascript.jscomp.Scope.Var var = t.getScope().getVar(name);
			if (var == null) {
				return ;
			}
			if (var.isExtern()) {
				return ;
			}
			if ((!(var.isExtern())) && ((name.equals(globalSymbolNamespace)) || ((name.indexOf(((globalSymbolNamespace) + (com.google.javascript.jscomp.RescopeGlobalSymbols.DISAMBIGUATION_SUFFIX)))) == 0))) {
				n.setString((name + (com.google.javascript.jscomp.RescopeGlobalSymbols.DISAMBIGUATION_SUFFIX)));
				compiler.reportCodeChange();
			}
			if (!(var.isGlobal())) {
				return ;
			}
			com.google.javascript.rhino.Node nameNode = var.getNameNode();
			if (((nameNode != null) && ((nameNode.getParent()) != null)) && (nameNode.getParent().isCatch())) {
				return ;
			}
			replaceSymbol(n, name);
		}

		private void replaceSymbol(com.google.javascript.rhino.Node node, java.lang.String name) {
			com.google.javascript.rhino.Node parent = node.getParent();
			com.google.javascript.rhino.Node replacement = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.GETPROP, com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, globalSymbolNamespace).copyInformationFrom(node), com.google.javascript.rhino.Node.newString(name).copyInformationFrom(node));
			replacement.copyInformationFrom(node);
			if (node.hasChildren()) {
				com.google.javascript.rhino.Node assign = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ASSIGN, replacement, node.removeFirstChild());
				parent.replaceChild(node, assign);
			}else {
				parent.replaceChild(node, replacement);
			}
			compiler.reportCodeChange();
		}
	}

	private class RemoveGlobalVarCallback extends com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (!(n.isVar())) {
				return ;
			}
			java.util.List<com.google.javascript.rhino.Node> commas = new java.util.ArrayList<com.google.javascript.rhino.Node>();
			java.util.List<com.google.javascript.rhino.Node> interestingChildren = new java.util.ArrayList<com.google.javascript.rhino.Node>();
			for (com.google.javascript.rhino.Node c : n.children()) {
				if ((c.isAssign()) || (parent.isFor())) {
					interestingChildren.add(c);
				}
			}
			for (com.google.javascript.rhino.Node c : interestingChildren) {
				if ((parent.isFor()) && ((parent.getFirstChild()) == n)) {
					commas.add(c.cloneTree());
				}else {
					com.google.javascript.rhino.Node expr = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT);
					expr.copyInformationFrom(c);
					expr.addChildToBack(c.cloneTree());
					parent.addChildBefore(expr, n);
				}
			}
			if ((commas.size()) > 0) {
				com.google.javascript.rhino.Node comma = joinOnComma(commas, n);
				parent.addChildBefore(comma, n);
			}
			parent.removeChild(n);
			compiler.reportCodeChange();
		}

		private com.google.javascript.rhino.Node joinOnComma(java.util.List<com.google.javascript.rhino.Node> commas, com.google.javascript.rhino.Node source) {
			com.google.javascript.rhino.Node comma = commas.get(0);
			for (int i = 1; i < (commas.size()); i++) {
				com.google.javascript.rhino.Node nextComma = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.COMMA, comma, commas.get(i));
				nextComma.copyInformationFrom(source);
				comma = nextComma;
			}
			return comma;
		}
	}
}


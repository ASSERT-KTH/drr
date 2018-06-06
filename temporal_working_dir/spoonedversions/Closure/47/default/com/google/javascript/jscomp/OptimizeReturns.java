

package com.google.javascript.jscomp;


class OptimizeReturns implements com.google.javascript.jscomp.CompilerPass , com.google.javascript.jscomp.OptimizeCalls.CallGraphCompilerPass {
	private com.google.javascript.jscomp.AbstractCompiler compiler;

	OptimizeReturns(com.google.javascript.jscomp.AbstractCompiler compiler) {
		com.google.javascript.jscomp.OptimizeReturns.this.compiler = compiler;
	}

	@java.lang.Override
	@com.google.common.annotations.VisibleForTesting
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.SimpleDefinitionFinder defFinder = new com.google.javascript.jscomp.SimpleDefinitionFinder(compiler);
		defFinder.process(externs, root);
		process(externs, root, defFinder);
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root, com.google.javascript.jscomp.SimpleDefinitionFinder definitions) {
		java.util.List<com.google.javascript.rhino.Node> toOptimize = com.google.common.collect.Lists.newArrayList();
		for (com.google.javascript.jscomp.DefinitionSite defSite : definitions.getDefinitionSites()) {
			if ((!(defSite.inExterns)) && (!(callResultsMaybeUsed(definitions, defSite)))) {
				toOptimize.add(defSite.definition.getRValue());
			}
		}
		for (com.google.javascript.rhino.Node node : toOptimize) {
			rewriteReturns(definitions, node);
		}
	}

	private boolean callResultsMaybeUsed(com.google.javascript.jscomp.SimpleDefinitionFinder defFinder, com.google.javascript.jscomp.DefinitionSite definitionSite) {
		com.google.javascript.jscomp.DefinitionsRemover.Definition definition = definitionSite.definition;
		com.google.javascript.rhino.Node rValue = definition.getRValue();
		if ((rValue == null) || (!(rValue.isFunction()))) {
			return true;
		}
		if (!(com.google.javascript.jscomp.SimpleDefinitionFinder.isSimpleFunctionDeclaration(rValue))) {
			return true;
		}
		if (!(defFinder.canModifyDefinition(definition))) {
			return true;
		}
		java.util.Collection<com.google.javascript.jscomp.UseSite> useSites = defFinder.getUseSites(definition);
		for (com.google.javascript.jscomp.UseSite site : useSites) {
			com.google.javascript.rhino.Node useNodeParent = site.node.getParent();
			if (com.google.javascript.jscomp.OptimizeReturns.isCall(site)) {
				com.google.javascript.rhino.Node callNode = useNodeParent;
				com.google.common.base.Preconditions.checkState(callNode.isCall());
				if (com.google.javascript.jscomp.NodeUtil.isExpressionResultUsed(callNode)) {
					return true;
				}
			}else {
				if (!(useNodeParent.isVar())) {
					return true;
				}
			}
		}
		return false;
	}

	private void rewriteReturns(final com.google.javascript.jscomp.SimpleDefinitionFinder defFinder, com.google.javascript.rhino.Node fnNode) {
		com.google.common.base.Preconditions.checkState(fnNode.isFunction());
		com.google.javascript.jscomp.NodeUtil.visitPostOrder(fnNode.getLastChild(), new com.google.javascript.jscomp.NodeUtil.Visitor() {
			@java.lang.Override
			public void visit(com.google.javascript.rhino.Node node) {
				if ((node.isReturn()) && (node.hasOneChild())) {
					boolean keepValue = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node.getFirstChild(), compiler);
					if (!keepValue) {
						defFinder.removeReferences(node.getFirstChild());
					}
					com.google.javascript.rhino.Node result = node.removeFirstChild();
					if (keepValue) {
						node.getParent().addChildBefore(new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT, result).copyInformationFrom(result), node);
					}
					compiler.reportCodeChange();
				}
			}
		}, new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement());
	}

	private static boolean isCall(com.google.javascript.jscomp.UseSite site) {
		com.google.javascript.rhino.Node node = site.node;
		com.google.javascript.rhino.Node parent = node.getParent();
		return ((parent.getFirstChild()) == node) && (parent.isCall());
	}
}


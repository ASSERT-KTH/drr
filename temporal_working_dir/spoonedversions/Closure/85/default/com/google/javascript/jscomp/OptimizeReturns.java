

package com.google.javascript.jscomp;


public class OptimizeReturns implements com.google.javascript.jscomp.CompilerPass , com.google.javascript.jscomp.OptimizeCalls.CallGraphCompilerPass {
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
		for (com.google.javascript.jscomp.DefinitionSite defSite : definitions.getDefinitionSites().toArray(new com.google.javascript.jscomp.DefinitionSite[0])) {
			if (definitions.getDefinitionSites().contains(defSite)) {
				optimizeResultsIfEligible(defSite, definitions);
			}
		}
	}

	private void optimizeResultsIfEligible(com.google.javascript.jscomp.DefinitionSite defSite, com.google.javascript.jscomp.SimpleDefinitionFinder defFinder) {
		if ((defSite.inExterns) || (callResultsMaybeUsed(defFinder, defSite))) {
			return ;
		}
		rewriteReturns(defFinder, defSite.definition.getRValue());
	}

	private boolean callResultsMaybeUsed(com.google.javascript.jscomp.SimpleDefinitionFinder defFinder, com.google.javascript.jscomp.DefinitionSite definitionSite) {
		com.google.javascript.jscomp.DefinitionsRemover.Definition definition = definitionSite.definition;
		com.google.javascript.rhino.Node rValue = definition.getRValue();
		if ((rValue == null) || (!(com.google.javascript.jscomp.NodeUtil.isFunction(rValue)))) {
			return true;
		}
		if (!(com.google.javascript.jscomp.SimpleDefinitionFinder.isSimpleFunctionDeclaration(rValue))) {
			return true;
		}
		if (com.google.javascript.jscomp.SimpleDefinitionFinder.maybeExported(compiler, definition)) {
			return true;
		}
		java.util.Collection<com.google.javascript.jscomp.UseSite> useSites = defFinder.getUseSites(definition);
		if (useSites.isEmpty()) {
			return true;
		}
		for (com.google.javascript.jscomp.UseSite site : useSites) {
			com.google.javascript.rhino.Node nameNode = site.node;
			java.util.Collection<com.google.javascript.jscomp.DefinitionsRemover.Definition> singleSiteDefinitions = defFinder.getDefinitionsReferencedAt(nameNode);
			if ((singleSiteDefinitions.size()) > 1) {
				return true;
			}
			com.google.javascript.rhino.Node useNodeParent = site.node.getParent();
			if (com.google.javascript.jscomp.OptimizeReturns.isCall(site)) {
				com.google.javascript.rhino.Node callNode = useNodeParent;
				com.google.common.base.Preconditions.checkState(((callNode.getType()) == (com.google.javascript.rhino.Token.CALL)));
				if (com.google.javascript.jscomp.OptimizeReturns.isValueUsed(callNode)) {
					return true;
				}
			}else {
				if (!(com.google.javascript.jscomp.NodeUtil.isVar(useNodeParent))) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean isValueUsed(com.google.javascript.rhino.Node node) {
		com.google.javascript.rhino.Node parent = node.getParent();
		switch (parent.getType()) {
			case com.google.javascript.rhino.Token.EXPR_RESULT :
				return false;
			case com.google.javascript.rhino.Token.HOOK :
			case com.google.javascript.rhino.Token.AND :
			case com.google.javascript.rhino.Token.OR :
				return node == (parent.getFirstChild()) ? true : com.google.javascript.jscomp.OptimizeReturns.isValueUsed(parent);
			case com.google.javascript.rhino.Token.COMMA :
				return node == (parent.getFirstChild()) ? false : com.google.javascript.jscomp.OptimizeReturns.isValueUsed(parent);
			case com.google.javascript.rhino.Token.FOR :
				if (com.google.javascript.jscomp.NodeUtil.isForIn(parent)) {
					return true;
				}else {
					return (parent.getChildAtIndex(1)) == node;
				}
			default :
				return true;
		}
	}

	private void rewriteReturns(final com.google.javascript.jscomp.SimpleDefinitionFinder defFinder, com.google.javascript.rhino.Node fnNode) {
		com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.NodeUtil.isFunction(fnNode));
		com.google.javascript.jscomp.NodeUtil.visitPostOrder(fnNode.getLastChild(), new com.google.javascript.jscomp.NodeUtil.Visitor() {
			@java.lang.Override
			public void visit(com.google.javascript.rhino.Node node) {
				if (((node.getType()) == (com.google.javascript.rhino.Token.RETURN)) && (node.hasOneChild())) {
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
		return ((parent.getFirstChild()) == node) && (com.google.javascript.jscomp.NodeUtil.isCall(parent));
	}
}


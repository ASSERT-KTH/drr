

package com.google.javascript.jscomp;


class FlowSensitiveInlineVariables extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass , com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.Set<com.google.javascript.jscomp.Scope.Var> inlinedNewDependencies = com.google.common.collect.Sets.newHashSet();

	private com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> cfg;

	private java.util.List<com.google.javascript.jscomp.FlowSensitiveInlineVariables.Candidate> candidates;

	private com.google.javascript.jscomp.MustBeReachingVariableDef reachingDef;

	private com.google.javascript.jscomp.MaybeReachingVariableUse reachingUses;

	private static final com.google.common.base.Predicate<com.google.javascript.rhino.Node> SIDE_EFFECT_PREDICATE = new com.google.common.base.Predicate<com.google.javascript.rhino.Node>() {
		@java.lang.Override
		public boolean apply(com.google.javascript.rhino.Node n) {
			if (n == null) {
				return false;
			}
			if ((n.isCall()) && (com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(n))) {
				return true;
			}
			if ((n.isNew()) && (com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(n))) {
				return true;
			}
			if (n.isDelProp()) {
				return true;
			}
			for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
				if ((!(com.google.javascript.jscomp.ControlFlowGraph.isEnteringNewCfgNode(c))) && (apply(c))) {
					return true;
				}
			}
			return false;
		}
	};

	public FlowSensitiveInlineVariables(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
		if (t.inGlobalScope()) {
			return ;
		}
		if ((com.google.javascript.jscomp.LiveVariablesAnalysis.MAX_VARIABLES_TO_ANALYZE) < (t.getScope().getVarCount())) {
			return ;
		}
		com.google.javascript.jscomp.ControlFlowAnalysis cfa = new com.google.javascript.jscomp.ControlFlowAnalysis(compiler, false, true);
		com.google.common.base.Preconditions.checkState(t.getScopeRoot().isFunction());
		cfa.process(null, t.getScopeRoot().getLastChild());
		cfg = cfa.getCfg();
		reachingDef = new com.google.javascript.jscomp.MustBeReachingVariableDef(cfg, t.getScope(), compiler);
		reachingDef.analyze();
		candidates = com.google.common.collect.Lists.newLinkedList();
		new com.google.javascript.jscomp.NodeTraversal(compiler, new com.google.javascript.jscomp.FlowSensitiveInlineVariables.GatherCandiates()).traverse(t.getScopeRoot().getLastChild());
		reachingUses = new com.google.javascript.jscomp.MaybeReachingVariableUse(cfg, t.getScope(), compiler);
		reachingUses.analyze();
		for (com.google.javascript.jscomp.FlowSensitiveInlineVariables.Candidate c : candidates) {
			if (c.canInline()) {
				c.inlineVariable();
				if (!(c.defMetadata.depends.isEmpty())) {
					inlinedNewDependencies.add(t.getScope().getVar(c.varName));
				}
			}
		}
	}

	@java.lang.Override
	public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		new com.google.javascript.jscomp.NodeTraversal(compiler, com.google.javascript.jscomp.FlowSensitiveInlineVariables.this).traverseRoots(externs, root);
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
	}

	private class GatherCandiates extends com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> graphNode = cfg.getDirectedGraphNode(n);
			if (graphNode == null) {
				return ;
			}
			com.google.javascript.jscomp.DataFlowAnalysis.FlowState<com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef> state = graphNode.getAnnotation();
			final com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef defs = state.getIn();
			final com.google.javascript.rhino.Node cfgNode = n;
			com.google.javascript.jscomp.ControlFlowGraph.AbstractCfgNodeTraversalCallback gatherCb = new com.google.javascript.jscomp.ControlFlowGraph.AbstractCfgNodeTraversalCallback() {
				@java.lang.Override
				public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
					if (n.isName()) {
						if (parent == null) {
							return ;
						}
						if (((((((com.google.javascript.jscomp.NodeUtil.isAssignmentOp(parent)) && ((parent.getFirstChild()) == n)) || (parent.isVar())) || (parent.isInc())) || (parent.isDec())) || (parent.isParamList())) || (parent.isCatch())) {
							return ;
						}
						java.lang.String name = n.getString();
						if (compiler.getCodingConvention().isExported(name)) {
							return ;
						}
						com.google.javascript.jscomp.MustBeReachingVariableDef.Definition def = reachingDef.getDef(name, cfgNode);
						if ((def != null) && (!(reachingDef.dependsOnOuterScopeVars(def)))) {
							candidates.add(new com.google.javascript.jscomp.FlowSensitiveInlineVariables.Candidate(name, def, n, cfgNode));
						}
					}
				}
			};
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, cfgNode, gatherCb);
		}
	}

	private class Candidate {
		private final java.lang.String varName;

		private com.google.javascript.rhino.Node def;

		private final com.google.javascript.jscomp.MustBeReachingVariableDef.Definition defMetadata;

		private final com.google.javascript.rhino.Node use;

		private final com.google.javascript.rhino.Node useCfgNode;

		private int numUseWithinUseCfgNode;

		Candidate(java.lang.String varName, com.google.javascript.jscomp.MustBeReachingVariableDef.Definition defMetadata, com.google.javascript.rhino.Node use, com.google.javascript.rhino.Node useCfgNode) {
			com.google.common.base.Preconditions.checkArgument(use.isName());
			this.varName = varName;
			this.defMetadata = defMetadata;
			this.use = use;
			this.useCfgNode = useCfgNode;
		}

		private com.google.javascript.rhino.Node getDefCfgNode() {
			return defMetadata.node;
		}

		private boolean canInline() {
			if (getDefCfgNode().isFunction()) {
				return false;
			}
			for (com.google.javascript.jscomp.Scope.Var dependency : defMetadata.depends) {
				if (inlinedNewDependencies.contains(dependency)) {
					return false;
				}
			}
			getDefinition(getDefCfgNode(), null);
			getNumUseInUseCfgNode(useCfgNode, null);
			if ((def) == null) {
				return false;
			}
			if ((def.isAssign()) && (!(com.google.javascript.jscomp.NodeUtil.isExprAssign(def.getParent())))) {
				return false;
			}
			if (com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkRightOf(def, getDefCfgNode(), com.google.javascript.jscomp.FlowSensitiveInlineVariables.SIDE_EFFECT_PREDICATE)) {
				return false;
			}
			if (com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf(use, useCfgNode, com.google.javascript.jscomp.FlowSensitiveInlineVariables.SIDE_EFFECT_PREDICATE)) {
				return false;
			}
			if (com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(def.getLastChild(), compiler)) {
				return false;
			}
			if ((numUseWithinUseCfgNode) != 1) {
				return false;
			}
			if (com.google.javascript.jscomp.NodeUtil.isWithinLoop(use)) {
				return false;
			}
			java.util.Collection<com.google.javascript.rhino.Node> uses = reachingUses.getUses(varName, getDefCfgNode());
			if ((uses.size()) != 1) {
				return false;
			}
			if (com.google.javascript.jscomp.NodeUtil.has(def.getLastChild(), new com.google.common.base.Predicate<com.google.javascript.rhino.Node>() {
				@java.lang.Override
				public boolean apply(com.google.javascript.rhino.Node input) {
					switch (input.getType()) {
						case com.google.javascript.rhino.Token.GETELEM :
						case com.google.javascript.rhino.Token.GETPROP :
						case com.google.javascript.rhino.Token.ARRAYLIT :
						case com.google.javascript.rhino.Token.OBJECTLIT :
						case com.google.javascript.rhino.Token.REGEXP :
						case com.google.javascript.rhino.Token.NEW :
							return true;
					}
					return false;
				}
			}, new com.google.common.base.Predicate<com.google.javascript.rhino.Node>() {
				@java.lang.Override
				public boolean apply(com.google.javascript.rhino.Node input) {
					return !(input.isFunction());
				}
			})) {
				return false;
			}
			if ((com.google.javascript.jscomp.NodeUtil.isStatementBlock(getDefCfgNode().getParent())) && ((getDefCfgNode().getNext()) != (useCfgNode))) {
				com.google.javascript.jscomp.CheckPathsBetweenNodes<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> pathCheck = new com.google.javascript.jscomp.CheckPathsBetweenNodes<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>(cfg, cfg.getDirectedGraphNode(getDefCfgNode()), cfg.getDirectedGraphNode(useCfgNode), com.google.javascript.jscomp.FlowSensitiveInlineVariables.SIDE_EFFECT_PREDICATE, com.google.common.base.Predicates.<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>>alwaysTrue(), false);
				if (pathCheck.somePathsSatisfyPredicate()) {
					return false;
				}
			}
			return true;
		}

		private void inlineVariable() {
			com.google.javascript.rhino.Node defParent = def.getParent();
			com.google.javascript.rhino.Node useParent = use.getParent();
			if (def.isAssign()) {
				com.google.javascript.rhino.Node rhs = def.getLastChild();
				rhs.detachFromParent();
				com.google.common.base.Preconditions.checkState(defParent.isExprResult());
				while (defParent.getParent().isLabel()) {
					defParent = defParent.getParent();
				} 
				defParent.detachFromParent();
				useParent.replaceChild(use, rhs);
			}else
				if (defParent.isVar()) {
					com.google.javascript.rhino.Node rhs = def.getLastChild();
					def.removeChild(rhs);
					useParent.replaceChild(use, rhs);
				}else {
					com.google.common.base.Preconditions.checkState(false, "No other definitions can be inlined.");
				}
			
			compiler.reportCodeChange();
		}

		private void getDefinition(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			com.google.javascript.jscomp.ControlFlowGraph.AbstractCfgNodeTraversalCallback gatherCb = new com.google.javascript.jscomp.ControlFlowGraph.AbstractCfgNodeTraversalCallback() {
				@java.lang.Override
				public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
					switch (n.getType()) {
						case com.google.javascript.rhino.Token.NAME :
							if ((n.getString().equals(varName)) && (n.hasChildren())) {
								def = n;
							}
							return ;
						case com.google.javascript.rhino.Token.ASSIGN :
							com.google.javascript.rhino.Node lhs = n.getFirstChild();
							if ((lhs.isName()) && (lhs.getString().equals(varName))) {
								def = n;
							}
							return ;
					}
				}
			};
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, n, gatherCb);
		}

		private void getNumUseInUseCfgNode(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parant) {
			com.google.javascript.jscomp.ControlFlowGraph.AbstractCfgNodeTraversalCallback gatherCb = new com.google.javascript.jscomp.ControlFlowGraph.AbstractCfgNodeTraversalCallback() {
				@java.lang.Override
				public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
					if (((n.isName()) && (n.getString().equals(varName))) && (!((parent.isAssign()) && ((parent.getFirstChild()) == n)))) {
						(numUseWithinUseCfgNode)++;
					}
				}
			};
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, n, gatherCb);
		}
	}

	private static boolean checkRightOf(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node expressionRoot, com.google.common.base.Predicate<com.google.javascript.rhino.Node> predicate) {
		for (com.google.javascript.rhino.Node p = n; p != expressionRoot; p = p.getParent()) {
			for (com.google.javascript.rhino.Node cur = p.getNext(); cur != null; cur = cur.getNext()) {
				if (predicate.apply(cur)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean checkLeftOf(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node expressionRoot, com.google.common.base.Predicate<com.google.javascript.rhino.Node> predicate) {
		for (com.google.javascript.rhino.Node p = n.getParent(); p != expressionRoot; p = p.getParent()) {
			for (com.google.javascript.rhino.Node cur = p.getParent().getFirstChild(); cur != p; cur = cur.getNext()) {
				if (predicate.apply(cur)) {
					return true;
				}
			}
		}
		return false;
	}
}


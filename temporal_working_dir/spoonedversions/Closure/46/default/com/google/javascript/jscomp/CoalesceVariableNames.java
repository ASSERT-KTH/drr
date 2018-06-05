

package com.google.javascript.jscomp;


class CoalesceVariableNames extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass , com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.Deque<com.google.javascript.jscomp.graph.GraphColoring<com.google.javascript.jscomp.Scope.Var, java.lang.Void>> colorings;

	private final boolean usePseudoNames;

	private static final java.util.Comparator<com.google.javascript.jscomp.Scope.Var> coloringTieBreaker = new java.util.Comparator<com.google.javascript.jscomp.Scope.Var>() {
		@java.lang.Override
		public int compare(com.google.javascript.jscomp.Scope.Var v1, com.google.javascript.jscomp.Scope.Var v2) {
			return (v1.index) - (v2.index);
		}
	};

	CoalesceVariableNames(com.google.javascript.jscomp.AbstractCompiler compiler, boolean usePseudoNames) {
		com.google.common.base.Preconditions.checkState((!(compiler.getLifeCycleStage().isNormalized())));
		this.compiler = compiler;
		colorings = com.google.common.collect.Lists.newLinkedList();
		this.usePseudoNames = usePseudoNames;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.CoalesceVariableNames.this);
	}

	private static boolean shouldOptimizeScope(com.google.javascript.jscomp.Scope scope) {
		if (scope.isGlobal()) {
			return false;
		}
		if ((com.google.javascript.jscomp.LiveVariablesAnalysis.MAX_VARIABLES_TO_ANALYZE) < (scope.getVarCount())) {
			return false;
		}
		return true;
	}

	@java.lang.Override
	public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
		com.google.javascript.jscomp.Scope scope = t.getScope();
		if (!(com.google.javascript.jscomp.CoalesceVariableNames.shouldOptimizeScope(scope))) {
			return ;
		}
		com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> cfg = t.getControlFlowGraph();
		com.google.javascript.jscomp.LiveVariablesAnalysis liveness = new com.google.javascript.jscomp.LiveVariablesAnalysis(cfg, scope, compiler);
		if ((scope.getRootNode().getFirstChild().getNext().getChildCount()) == 2) {
			liveness.markAllParametersEscaped();
		}
		liveness.analyze();
		com.google.javascript.jscomp.graph.UndiGraph<com.google.javascript.jscomp.Scope.Var, java.lang.Void> interferenceGraph = computeVariableNamesInterferenceGraph(t, cfg, liveness.getEscapedLocals());
		com.google.javascript.jscomp.graph.GraphColoring<com.google.javascript.jscomp.Scope.Var, java.lang.Void> coloring = new com.google.javascript.jscomp.graph.GraphColoring.GreedyGraphColoring<com.google.javascript.jscomp.Scope.Var, java.lang.Void>(interferenceGraph, com.google.javascript.jscomp.CoalesceVariableNames.coloringTieBreaker);
		coloring.color();
		colorings.push(coloring);
	}

	@java.lang.Override
	public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
		if (!(com.google.javascript.jscomp.CoalesceVariableNames.shouldOptimizeScope(t.getScope()))) {
			return ;
		}
		colorings.pop();
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if (((colorings.isEmpty()) || (!(n.isName()))) || (parent.isFunction())) {
			return ;
		}
		com.google.javascript.jscomp.Scope.Var var = t.getScope().getVar(n.getString());
		com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.jscomp.Scope.Var, ?> vNode = colorings.peek().getGraph().getNode(var);
		if (vNode == null) {
			return ;
		}
		com.google.javascript.jscomp.Scope.Var coalescedVar = colorings.peek().getPartitionSuperNode(var);
		if (!(usePseudoNames)) {
			if (vNode.getValue().equals(coalescedVar)) {
				return ;
			}
			n.setString(coalescedVar.name);
			compiler.reportCodeChange();
			if (parent.isVar()) {
				removeVarDeclaration(n);
			}
		}else {
			java.lang.String pseudoName = null;
			java.util.Set<java.lang.String> allMergedNames = com.google.common.collect.Sets.newTreeSet();
			for (java.util.Iterator<com.google.javascript.jscomp.Scope.Var> i = t.getScope().getVars(); i.hasNext();) {
				com.google.javascript.jscomp.Scope.Var iVar = i.next();
				if (((colorings.peek().getGraph().getNode(iVar)) != null) && (coalescedVar.equals(colorings.peek().getPartitionSuperNode(iVar)))) {
					allMergedNames.add(iVar.name);
				}
			}
			if ((allMergedNames.size()) == 1) {
				return ;
			}
			pseudoName = com.google.common.base.Joiner.on("_").join(allMergedNames);
			while (t.getScope().isDeclared(pseudoName, true)) {
				pseudoName += "$";
			} 
			n.setString(pseudoName);
			compiler.reportCodeChange();
			if ((!(vNode.getValue().equals(coalescedVar))) && (parent.isVar())) {
				removeVarDeclaration(n);
			}
		}
	}

	private com.google.javascript.jscomp.graph.UndiGraph<com.google.javascript.jscomp.Scope.Var, java.lang.Void> computeVariableNamesInterferenceGraph(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> cfg, java.util.Set<com.google.javascript.jscomp.Scope.Var> escaped) {
		com.google.javascript.jscomp.graph.UndiGraph<com.google.javascript.jscomp.Scope.Var, java.lang.Void> interferenceGraph = com.google.javascript.jscomp.graph.LinkedUndirectedGraph.create();
		com.google.javascript.jscomp.Scope scope = t.getScope();
		for (java.util.Iterator<com.google.javascript.jscomp.Scope.Var> i = scope.getVars(); i.hasNext();) {
			com.google.javascript.jscomp.Scope.Var v = i.next();
			if (!(escaped.contains(v))) {
				if (!(v.getParentNode().isFunction())) {
					interferenceGraph.createNode(v);
				}
			}
		}
		for (java.util.Iterator<com.google.javascript.jscomp.Scope.Var> i1 = scope.getVars(); i1.hasNext();) {
			com.google.javascript.jscomp.Scope.Var v1 = i1.next();
			NEXT_VAR_PAIR : for (java.util.Iterator<com.google.javascript.jscomp.Scope.Var> i2 = scope.getVars(); i2.hasNext();) {
				com.google.javascript.jscomp.Scope.Var v2 = i2.next();
				if ((v1.index) >= (v2.index)) {
					continue;
				}
				if ((!(interferenceGraph.hasNode(v1))) || (!(interferenceGraph.hasNode(v2)))) {
					continue NEXT_VAR_PAIR;
				}
				if ((v1.getParentNode().isParamList()) && (v2.getParentNode().isParamList())) {
					interferenceGraph.connectIfNotFound(v1, null, v2);
					continue NEXT_VAR_PAIR;
				}
				NEXT_CROSS_CFG_NODE : for (com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> cfgNode : cfg.getDirectedGraphNodes()) {
					if (cfg.isImplicitReturn(cfgNode)) {
						continue NEXT_CROSS_CFG_NODE;
					}
					com.google.javascript.jscomp.DataFlowAnalysis.FlowState<com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice> state = cfgNode.getAnnotation();
					if (((state.getIn().isLive(v1)) && (state.getIn().isLive(v2))) || ((state.getOut().isLive(v1)) && (state.getOut().isLive(v2)))) {
						interferenceGraph.connectIfNotFound(v1, null, v2);
						continue NEXT_VAR_PAIR;
					}
				}
				NEXT_INTRA_CFG_NODE : for (com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> cfgNode : cfg.getDirectedGraphNodes()) {
					if (cfg.isImplicitReturn(cfgNode)) {
						continue NEXT_INTRA_CFG_NODE;
					}
					com.google.javascript.jscomp.DataFlowAnalysis.FlowState<com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice> state = cfgNode.getAnnotation();
					boolean v1OutLive = state.getOut().isLive(v1);
					boolean v2OutLive = state.getOut().isLive(v2);
					com.google.javascript.jscomp.CoalesceVariableNames.CombinedLiveRangeChecker checker = new com.google.javascript.jscomp.CoalesceVariableNames.CombinedLiveRangeChecker(new com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker(v1, (v2OutLive ? null : v2)), new com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker(v2, (v1OutLive ? null : v1)));
					com.google.javascript.jscomp.NodeTraversal.traverse(compiler, cfgNode.getValue(), checker);
					if (checker.connectIfCrossed(interferenceGraph)) {
						continue NEXT_VAR_PAIR;
					}
				}
			}
		}
		return interferenceGraph;
	}

	private static class CombinedLiveRangeChecker extends com.google.javascript.jscomp.ControlFlowGraph.AbstractCfgNodeTraversalCallback {
		private final com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker callback1;

		private final com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker callback2;

		CombinedLiveRangeChecker(com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker callback1, com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker callback2) {
			this.callback1 = callback1;
			this.callback2 = callback2;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker.shouldVisit(n)) {
				callback1.visit(t, n, parent);
				callback2.visit(t, n, parent);
			}
		}

		boolean connectIfCrossed(com.google.javascript.jscomp.graph.UndiGraph<com.google.javascript.jscomp.Scope.Var, java.lang.Void> interferenceGraph) {
			if ((callback1.crossed) || (callback2.crossed)) {
				com.google.javascript.jscomp.Scope.Var v1 = callback1.getDef();
				com.google.javascript.jscomp.Scope.Var v2 = callback2.getDef();
				interferenceGraph.connectIfNotFound(v1, null, v2);
				return true;
			}
			return false;
		}
	}

	private void removeVarDeclaration(com.google.javascript.rhino.Node name) {
		com.google.javascript.rhino.Node var = name.getParent();
		com.google.javascript.rhino.Node parent = var.getParent();
		if (com.google.javascript.jscomp.NodeUtil.isForIn(parent)) {
			var.removeChild(name);
			parent.replaceChild(var, name);
		}else
			if (var.hasOneChild()) {
				if (name.hasChildren()) {
					com.google.javascript.rhino.Node value = name.removeFirstChild();
					var.removeChild(name);
					com.google.javascript.rhino.Node assign = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ASSIGN, name, value).copyInformationFrom(name);
					if (!(parent.isFor())) {
						assign = com.google.javascript.jscomp.NodeUtil.newExpr(assign);
					}
					parent.replaceChild(var, assign);
				}else {
					com.google.javascript.jscomp.NodeUtil.removeChild(parent, var);
				}
			}else {
				if (!(name.hasChildren())) {
					var.removeChild(name);
				}
			}
		
	}

	private static class LiveRangeChecker extends com.google.javascript.jscomp.ControlFlowGraph.AbstractCfgNodeTraversalCallback {
		boolean defFound = false;

		boolean crossed = false;

		private final com.google.javascript.jscomp.Scope.Var def;

		private final com.google.javascript.jscomp.Scope.Var use;

		public LiveRangeChecker(com.google.javascript.jscomp.Scope.Var def, com.google.javascript.jscomp.Scope.Var use) {
			this.def = def;
			this.use = use;
		}

		com.google.javascript.jscomp.Scope.Var getDef() {
			return def;
		}

		public static boolean shouldVisit(com.google.javascript.rhino.Node n) {
			return (n.isName()) || ((n.hasChildren()) && (n.getFirstChild().isName()));
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((!(defFound)) && (com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker.isAssignTo(def, n, parent))) {
				defFound = true;
			}
			if ((defFound) && (((use) == null) || (com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker.isReadFrom(use, n)))) {
				crossed = true;
			}
		}

		private static boolean isAssignTo(com.google.javascript.jscomp.Scope.Var var, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (((n.isName()) && (var.getName().equals(n.getString()))) && (parent != null)) {
				if (parent.isParamList()) {
					return true;
				}else
					if (parent.isVar()) {
						return n.hasChildren();
					}
				
				return false;
			}else {
				com.google.javascript.rhino.Node name = n.getFirstChild();
				return (((name != null) && (name.isName())) && (var.getName().equals(name.getString()))) && (com.google.javascript.jscomp.NodeUtil.isAssignmentOp(n));
			}
		}

		private static boolean isReadFrom(com.google.javascript.jscomp.Scope.Var var, com.google.javascript.rhino.Node name) {
			return (((name != null) && (name.isName())) && (var.getName().equals(name.getString()))) && (!(com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(name, name.getParent())));
		}
	}
}




package com.google.javascript.jscomp;


abstract class DataFlowAnalysis<N, L extends com.google.javascript.jscomp.LatticeElement> {
	private final com.google.javascript.jscomp.ControlFlowGraph<N> cfg;

	final com.google.javascript.jscomp.JoinOp<L> joinOp;

	protected final java.util.Set<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch>> orderedWorkSet;

	public static final int MAX_STEPS = 200000;

	DataFlowAnalysis(com.google.javascript.jscomp.ControlFlowGraph<N> targetCfg, com.google.javascript.jscomp.JoinOp<L> joinOp) {
		this.cfg = targetCfg;
		this.joinOp = joinOp;
		java.util.Comparator<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch>> nodeComparator = cfg.getOptionalNodeComparator(isForward());
		if (nodeComparator != null) {
			this.orderedWorkSet = com.google.common.collect.Sets.newTreeSet(nodeComparator);
		}else {
			this.orderedWorkSet = com.google.common.collect.Sets.newLinkedHashSet();
		}
	}

	final com.google.javascript.jscomp.ControlFlowGraph<N> getCfg() {
		return cfg;
	}

	L getExitLatticeElement() {
		com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch> node = getCfg().getImplicitReturn();
		com.google.javascript.jscomp.DataFlowAnalysis.FlowState<L> state = node.getAnnotation();
		return state.getIn();
	}

	@java.lang.SuppressWarnings(value = "unchecked")
	protected L join(L latticeA, L latticeB) {
		return joinOp.apply(com.google.common.collect.Lists.<L>newArrayList(latticeA, latticeB));
	}

	abstract boolean isForward();

	abstract L flowThrough(N node, L input);

	final void analyze() {
		analyze(com.google.javascript.jscomp.DataFlowAnalysis.MAX_STEPS);
	}

	final void analyze(int maxSteps) {
		initialize();
		int step = 0;
		while (!(orderedWorkSet.isEmpty())) {
			if (step > maxSteps) {
				throw new com.google.javascript.jscomp.DataFlowAnalysis.MaxIterationsExceededException((("Analysis did not terminate after " + maxSteps) + " iterations"));
			}
			com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch> curNode = orderedWorkSet.iterator().next();
			orderedWorkSet.remove(curNode);
			joinInputs(curNode);
			if (flow(curNode)) {
				java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch>> nextNodes = isForward() ? cfg.getDirectedSuccNodes(curNode) : cfg.getDirectedPredNodes(curNode);
				for (com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch> nextNode : nextNodes) {
					if (nextNode != (cfg.getImplicitReturn())) {
						orderedWorkSet.add(nextNode);
					}
				}
			}
			step++;
		} 
		if (isForward()) {
			joinInputs(getCfg().getImplicitReturn());
		}
	}

	abstract L createInitialEstimateLattice();

	abstract L createEntryLattice();

	protected void initialize() {
		orderedWorkSet.clear();
		for (com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch> node : cfg.getDirectedGraphNodes()) {
			node.setAnnotation(new com.google.javascript.jscomp.DataFlowAnalysis.FlowState<L>(createInitialEstimateLattice(), createInitialEstimateLattice()));
			if (node != (cfg.getImplicitReturn())) {
				orderedWorkSet.add(node);
			}
		}
	}

	protected boolean flow(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch> node) {
		com.google.javascript.jscomp.DataFlowAnalysis.FlowState<L> state = node.getAnnotation();
		if (isForward()) {
			L outBefore = state.out;
			state.out = flowThrough(node.getValue(), state.in);
			return !(outBefore.equals(state.out));
		}else {
			L inBefore = state.in;
			state.in = flowThrough(node.getValue(), state.out);
			return !(inBefore.equals(state.in));
		}
	}

	protected void joinInputs(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch> node) {
		com.google.javascript.jscomp.DataFlowAnalysis.FlowState<L> state = node.getAnnotation();
		if (isForward()) {
			if ((cfg.getEntry()) == node) {
				state.setIn(createEntryLattice());
			}else {
				java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch>> inNodes = cfg.getDirectedPredNodes(node);
				if ((inNodes.size()) == 1) {
					com.google.javascript.jscomp.DataFlowAnalysis.FlowState<L> inNodeState = inNodes.get(0).getAnnotation();
					state.setIn(inNodeState.getOut());
				}else
					if ((inNodes.size()) > 1) {
						java.util.List<L> values = new java.util.ArrayList<L>(inNodes.size());
						for (com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch> currentNode : inNodes) {
							com.google.javascript.jscomp.DataFlowAnalysis.FlowState<L> currentNodeState = currentNode.getAnnotation();
							values.add(currentNodeState.getOut());
						}
						state.setIn(joinOp.apply(values));
					}
				
			}
		}else {
			java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch>> inNodes = cfg.getDirectedSuccNodes(node);
			if ((inNodes.size()) == 1) {
				com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch> inNode = inNodes.get(0);
				if (inNode == (cfg.getImplicitReturn())) {
					state.setOut(createEntryLattice());
				}else {
					com.google.javascript.jscomp.DataFlowAnalysis.FlowState<L> inNodeState = inNode.getAnnotation();
					state.setOut(inNodeState.getIn());
				}
			}else
				if ((inNodes.size()) > 1) {
					java.util.List<L> values = new java.util.ArrayList<L>(inNodes.size());
					for (com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch> currentNode : inNodes) {
						com.google.javascript.jscomp.DataFlowAnalysis.FlowState<L> currentNodeState = currentNode.getAnnotation();
						values.add(currentNodeState.getIn());
					}
					state.setOut(joinOp.apply(values));
				}
			
		}
	}

	static class FlowState<L extends com.google.javascript.jscomp.LatticeElement> implements com.google.javascript.jscomp.graph.Annotation {
		private L in;

		private L out;

		private FlowState(L inState, L outState) {
			com.google.common.base.Preconditions.checkNotNull(inState);
			com.google.common.base.Preconditions.checkNotNull(outState);
			com.google.javascript.jscomp.DataFlowAnalysis.FlowState.this.in = inState;
			com.google.javascript.jscomp.DataFlowAnalysis.FlowState.this.out = outState;
		}

		L getIn() {
			return in;
		}

		void setIn(L in) {
			com.google.common.base.Preconditions.checkNotNull(in);
			com.google.javascript.jscomp.DataFlowAnalysis.FlowState.this.in = in;
		}

		L getOut() {
			return out;
		}

		void setOut(L out) {
			com.google.common.base.Preconditions.checkNotNull(out);
			com.google.javascript.jscomp.DataFlowAnalysis.FlowState.this.out = out;
		}

		@java.lang.Override
		public java.lang.String toString() {
			return java.lang.String.format("IN: %s OUT: %s", in, out);
		}

		@java.lang.Override
		public int hashCode() {
			return com.google.common.base.Objects.hashCode(in, out);
		}
	}

	static class MaxIterationsExceededException extends java.lang.RuntimeException {
		private static final long serialVersionUID = 1L;

		MaxIterationsExceededException(java.lang.String msg) {
			super(msg);
		}
	}

	abstract static class BranchedForwardDataFlowAnalysis<N, L extends com.google.javascript.jscomp.LatticeElement> extends com.google.javascript.jscomp.DataFlowAnalysis<N, L> {
		@java.lang.Override
		protected void initialize() {
			orderedWorkSet.clear();
			for (com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch> node : getCfg().getDirectedGraphNodes()) {
				int outEdgeCount = getCfg().getOutEdges(node.getValue()).size();
				java.util.List<L> outLattices = com.google.common.collect.Lists.newArrayList();
				for (int i = 0; i < outEdgeCount; i++) {
					outLattices.add(createInitialEstimateLattice());
				}
				node.setAnnotation(new com.google.javascript.jscomp.DataFlowAnalysis.BranchedFlowState<L>(createInitialEstimateLattice(), outLattices));
				if (node != (getCfg().getImplicitReturn())) {
					orderedWorkSet.add(node);
				}
			}
		}

		BranchedForwardDataFlowAnalysis(com.google.javascript.jscomp.ControlFlowGraph<N> targetCfg, com.google.javascript.jscomp.JoinOp<L> joinOp) {
			super(targetCfg, joinOp);
		}

		@java.lang.Override
		L getExitLatticeElement() {
			com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch> node = getCfg().getImplicitReturn();
			com.google.javascript.jscomp.DataFlowAnalysis.BranchedFlowState<L> state = node.getAnnotation();
			return state.getIn();
		}

		@java.lang.Override
		final boolean isForward() {
			return true;
		}

		abstract java.util.List<L> branchedFlowThrough(N node, L input);

		@java.lang.Override
		protected final boolean flow(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch> node) {
			com.google.javascript.jscomp.DataFlowAnalysis.BranchedFlowState<L> state = node.getAnnotation();
			java.util.List<L> outBefore = state.out;
			state.out = branchedFlowThrough(node.getValue(), state.in);
			com.google.common.base.Preconditions.checkState(((outBefore.size()) == (state.out.size())));
			for (int i = 0; i < (outBefore.size()); i++) {
				if (!(outBefore.get(i).equals(state.out.get(i)))) {
					return true;
				}
			}
			return false;
		}

		@java.lang.Override
		protected void joinInputs(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch> node) {
			com.google.javascript.jscomp.DataFlowAnalysis.BranchedFlowState<L> state = node.getAnnotation();
			java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch>> predNodes = getCfg().getDirectedPredNodes(node);
			java.util.List<L> values = new java.util.ArrayList<L>(predNodes.size());
			for (com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, com.google.javascript.jscomp.ControlFlowGraph.Branch> predNode : predNodes) {
				com.google.javascript.jscomp.DataFlowAnalysis.BranchedFlowState<L> predNodeState = predNode.getAnnotation();
				L in = predNodeState.out.get(getCfg().getDirectedSuccNodes(predNode).indexOf(node));
				values.add(in);
			}
			if ((getCfg().getEntry()) == node) {
				state.setIn(createEntryLattice());
			}else
				if (!(values.isEmpty())) {
					state.setIn(joinOp.apply(values));
				}
			
		}
	}

	static class BranchedFlowState<L extends com.google.javascript.jscomp.LatticeElement> implements com.google.javascript.jscomp.graph.Annotation {
		private L in;

		private java.util.List<L> out;

		private BranchedFlowState(L inState, java.util.List<L> outState) {
			com.google.common.base.Preconditions.checkNotNull(inState);
			com.google.common.base.Preconditions.checkNotNull(outState);
			com.google.javascript.jscomp.DataFlowAnalysis.BranchedFlowState.this.in = inState;
			com.google.javascript.jscomp.DataFlowAnalysis.BranchedFlowState.this.out = outState;
		}

		L getIn() {
			return in;
		}

		void setIn(L in) {
			com.google.common.base.Preconditions.checkNotNull(in);
			com.google.javascript.jscomp.DataFlowAnalysis.BranchedFlowState.this.in = in;
		}

		java.util.List<L> getOut() {
			return out;
		}

		void setOut(java.util.List<L> out) {
			com.google.common.base.Preconditions.checkNotNull(out);
			for (L item : out) {
				com.google.common.base.Preconditions.checkNotNull(item);
			}
			com.google.javascript.jscomp.DataFlowAnalysis.BranchedFlowState.this.out = out;
		}

		@java.lang.Override
		public java.lang.String toString() {
			return java.lang.String.format("IN: %s OUT: %s", in, out);
		}

		@java.lang.Override
		public int hashCode() {
			return com.google.common.base.Objects.hashCode(in, out);
		}
	}

	static void computeEscaped(final com.google.javascript.jscomp.Scope jsScope, final java.util.Set<com.google.javascript.jscomp.Scope.Var> escaped, com.google.javascript.jscomp.AbstractCompiler compiler) {
		com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback finder = new com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback() {
			@java.lang.Override
			public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
				if (((jsScope == (t.getScope())) || (!(com.google.javascript.jscomp.NodeUtil.isName(n)))) || (com.google.javascript.jscomp.NodeUtil.isFunction(parent))) {
					return ;
				}
				java.lang.String name = n.getString();
				com.google.javascript.jscomp.Scope.Var var = t.getScope().getVar(name);
				if ((var != null) && ((var.scope) == jsScope)) {
					escaped.add(jsScope.getVar(name));
				}
			}
		};
		com.google.javascript.jscomp.NodeTraversal t = new com.google.javascript.jscomp.NodeTraversal(compiler, finder);
		t.traverseAtScope(jsScope);
		for (java.util.Iterator<com.google.javascript.jscomp.Scope.Var> i = jsScope.getVars(); i.hasNext();) {
			com.google.javascript.jscomp.Scope.Var var = i.next();
			if (((var.getParentNode().getType()) == (com.google.javascript.rhino.Token.CATCH)) || (compiler.getCodingConvention().isExported(var.getName()))) {
				escaped.add(var);
			}
		}
	}
}


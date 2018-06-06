

package com.google.javascript.jscomp;


final class MustBeReachingVariableDef extends com.google.javascript.jscomp.DataFlowAnalysis<com.google.javascript.rhino.Node, com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef> {
	private final com.google.javascript.jscomp.Scope jsScope;

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.Set<com.google.javascript.jscomp.Scope.Var> escaped;

	MustBeReachingVariableDef(com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> cfg, com.google.javascript.jscomp.Scope jsScope, com.google.javascript.jscomp.AbstractCompiler compiler) {
		super(cfg, new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDefJoin());
		this.jsScope = jsScope;
		this.compiler = compiler;
		this.escaped = com.google.common.collect.Sets.newHashSet();
		com.google.javascript.jscomp.DataFlowAnalysis.computeEscaped(jsScope, escaped, compiler);
	}

	private static class Definition {
		final com.google.javascript.rhino.Node node;

		final java.util.Set<com.google.javascript.jscomp.Scope.Var> depends = com.google.common.collect.Sets.newHashSet();

		Definition(com.google.javascript.rhino.Node node) {
			this.node = node;
		}

		@java.lang.Override
		public boolean equals(java.lang.Object other) {
			if (!(other instanceof com.google.javascript.jscomp.MustBeReachingVariableDef.Definition)) {
				return false;
			}
			com.google.javascript.jscomp.MustBeReachingVariableDef.Definition otherDef = ((com.google.javascript.jscomp.MustBeReachingVariableDef.Definition) (other));
			return (otherDef.node) == (node);
		}
	}

	static final class MustDef implements com.google.javascript.jscomp.LatticeElement {
		final java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.MustBeReachingVariableDef.Definition> reachingDef;

		public MustDef() {
			reachingDef = com.google.common.collect.Maps.newHashMap();
		}

		public MustDef(java.util.Iterator<com.google.javascript.jscomp.Scope.Var> vars) {
			this();
			while (vars.hasNext()) {
				com.google.javascript.jscomp.Scope.Var var = vars.next();
				reachingDef.put(var, new com.google.javascript.jscomp.MustBeReachingVariableDef.Definition(var.scope.getRootNode()));
			} 
		}

		public MustDef(com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef other) {
			reachingDef = com.google.common.collect.Maps.newHashMap(other.reachingDef);
		}

		@java.lang.Override
		public boolean equals(java.lang.Object other) {
			return (other instanceof com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef) && (((com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef) (other)).reachingDef.equals(com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef.this.reachingDef));
		}
	}

	private static class MustDefJoin extends com.google.javascript.jscomp.JoinOp.BinaryJoinOp<com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef> {
		@java.lang.Override
		public com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef apply(com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef a, com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef b) {
			com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef result = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
			java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.MustBeReachingVariableDef.Definition> resultMap = result.reachingDef;
			for (com.google.javascript.jscomp.Scope.Var var : a.reachingDef.keySet()) {
				com.google.javascript.jscomp.MustBeReachingVariableDef.Definition aDef = a.reachingDef.get(var);
				if (aDef == null) {
					resultMap.put(var, null);
					continue;
				}
				com.google.javascript.rhino.Node aNode = aDef.node;
				if (b.reachingDef.containsKey(var)) {
					com.google.javascript.jscomp.MustBeReachingVariableDef.Definition bDef = b.reachingDef.get(var);
					if (aDef.equals(bDef)) {
						resultMap.put(var, aDef);
					}else {
						resultMap.put(var, null);
					}
				}else {
					resultMap.put(var, aDef);
				}
			}
			for (com.google.javascript.jscomp.Scope.Var var : b.reachingDef.keySet()) {
				if (!(a.reachingDef.containsKey(var))) {
					resultMap.put(var, b.reachingDef.get(var));
				}
			}
			return result;
		}
	}

	@java.lang.Override
	boolean isForward() {
		return true;
	}

	@java.lang.Override
	com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef createEntryLattice() {
		return new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(jsScope.getVars());
	}

	@java.lang.Override
	com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef createInitialEstimateLattice() {
		return new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
	}

	@java.lang.Override
	com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef flowThrough(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef input) {
		com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef output = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(input);
		computeMustDef(n, n, output, false);
		return output;
	}

	private void computeMustDef(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node cfgNode, com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef output, boolean conditional) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.BLOCK :
			case com.google.javascript.rhino.Token.FUNCTION :
				return ;
			case com.google.javascript.rhino.Token.WHILE :
			case com.google.javascript.rhino.Token.DO :
			case com.google.javascript.rhino.Token.IF :
				computeMustDef(com.google.javascript.jscomp.NodeUtil.getConditionExpression(n), cfgNode, output, conditional);
				return ;
			case com.google.javascript.rhino.Token.FOR :
				if (!(com.google.javascript.jscomp.NodeUtil.isForIn(n))) {
					computeMustDef(com.google.javascript.jscomp.NodeUtil.getConditionExpression(n), cfgNode, output, conditional);
				}else {
					com.google.javascript.rhino.Node lhs = n.getFirstChild();
					com.google.javascript.rhino.Node rhs = lhs.getNext();
					if (com.google.javascript.jscomp.NodeUtil.isVar(lhs)) {
						lhs = lhs.getLastChild();
					}
					if (com.google.javascript.jscomp.NodeUtil.isName(lhs)) {
						addToDefIfLocal(lhs.getString(), cfgNode, rhs, output);
					}
				}
				return ;
			case com.google.javascript.rhino.Token.AND :
			case com.google.javascript.rhino.Token.OR :
				computeMustDef(n.getFirstChild(), cfgNode, output, conditional);
				computeMustDef(n.getLastChild(), cfgNode, output, true);
				return ;
			case com.google.javascript.rhino.Token.HOOK :
				computeMustDef(n.getFirstChild(), cfgNode, output, conditional);
				computeMustDef(n.getFirstChild().getNext(), cfgNode, output, true);
				computeMustDef(n.getLastChild(), cfgNode, output, true);
				return ;
			case com.google.javascript.rhino.Token.VAR :
				for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
					if (c.hasChildren()) {
						computeMustDef(c.getFirstChild(), cfgNode, output, conditional);
						addToDefIfLocal(c.getString(), (conditional ? null : cfgNode), c.getFirstChild(), output);
					}
				}
				return ;
			default :
				if (com.google.javascript.jscomp.NodeUtil.isAssignmentOp(n)) {
					if (com.google.javascript.jscomp.NodeUtil.isName(n.getFirstChild())) {
						com.google.javascript.rhino.Node name = n.getFirstChild();
						computeMustDef(name.getNext(), cfgNode, output, conditional);
						addToDefIfLocal(name.getString(), (conditional ? null : cfgNode), n.getLastChild(), output);
						return ;
					}else
						if (com.google.javascript.jscomp.NodeUtil.isGet(n.getFirstChild())) {
							com.google.javascript.rhino.Node obj = n.getFirstChild().getFirstChild();
							if ((com.google.javascript.jscomp.NodeUtil.isName(obj)) && ("arguments".equals(obj.getString()))) {
								escapeParameters(output);
							}
						}
					
				}
				if ((com.google.javascript.jscomp.NodeUtil.isName(n)) && ("arguments".equals(n.getString()))) {
					escapeParameters(output);
				}
				if (((n.getType()) == (com.google.javascript.rhino.Token.DEC)) || ((n.getType()) == (com.google.javascript.rhino.Token.INC))) {
					com.google.javascript.rhino.Node target = n.getFirstChild();
					if (com.google.javascript.jscomp.NodeUtil.isName(target)) {
						addToDefIfLocal(target.getString(), (conditional ? null : cfgNode), null, output);
						return ;
					}
				}
				for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
					computeMustDef(c, cfgNode, output, conditional);
				}
		}
	}

	private void addToDefIfLocal(java.lang.String name, @javax.annotation.Nullable
	com.google.javascript.rhino.Node node, @javax.annotation.Nullable
	com.google.javascript.rhino.Node rValue, com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef def) {
		com.google.javascript.jscomp.Scope.Var var = jsScope.getVar(name);
		if ((var == null) || ((var.scope) != (jsScope))) {
			return ;
		}
		for (com.google.javascript.jscomp.Scope.Var other : def.reachingDef.keySet()) {
			com.google.javascript.jscomp.MustBeReachingVariableDef.Definition otherDef = def.reachingDef.get(other);
			if (otherDef == null) {
				continue;
			}
			if (otherDef.depends.contains(var)) {
				def.reachingDef.put(other, null);
			}
		}
		if (!(escaped.contains(var))) {
			if (node == null) {
				def.reachingDef.put(var, null);
			}else {
				com.google.javascript.jscomp.MustBeReachingVariableDef.Definition definition = new com.google.javascript.jscomp.MustBeReachingVariableDef.Definition(node);
				if (rValue != null) {
					computeDependence(definition, rValue);
				}
				def.reachingDef.put(var, definition);
			}
		}
	}

	private void escapeParameters(com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef output) {
		for (java.util.Iterator<com.google.javascript.jscomp.Scope.Var> i = jsScope.getVars(); i.hasNext();) {
			com.google.javascript.jscomp.Scope.Var v = i.next();
			if ((v.getParentNode().getType()) == (com.google.javascript.rhino.Token.LP)) {
				output.reachingDef.put(v, null);
			}
		}
	}

	private void computeDependence(final com.google.javascript.jscomp.MustBeReachingVariableDef.Definition def, com.google.javascript.rhino.Node rValue) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, rValue, new com.google.javascript.jscomp.ControlFlowGraph.AbstractCfgNodeTraversalCallback() {
			@java.lang.Override
			public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
				if ((com.google.javascript.jscomp.NodeUtil.isName(n)) && (jsScope.isDeclared(n.getString(), true))) {
					def.depends.add(jsScope.getVar(n.getString()));
				}
			}
		});
	}

	com.google.javascript.rhino.Node getDef(java.lang.String name, com.google.javascript.rhino.Node useNode) {
		com.google.common.base.Preconditions.checkArgument(getCfg().hasNode(useNode));
		com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> n = getCfg().getNode(useNode);
		com.google.javascript.jscomp.DataFlowAnalysis.FlowState<com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef> state = n.getAnnotation();
		com.google.javascript.jscomp.MustBeReachingVariableDef.Definition def = state.getIn().reachingDef.get(jsScope.getVar(name));
		if (def == null) {
			return null;
		}else {
			return def.node;
		}
	}

	boolean dependsOnOuterScopeVars(java.lang.String name, com.google.javascript.rhino.Node useNode) {
		com.google.common.base.Preconditions.checkArgument(getCfg().hasNode(useNode));
		com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> n = getCfg().getNode(useNode);
		com.google.javascript.jscomp.DataFlowAnalysis.FlowState<com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef> state = n.getAnnotation();
		com.google.javascript.jscomp.MustBeReachingVariableDef.Definition def = state.getIn().reachingDef.get(jsScope.getVar(name));
		for (com.google.javascript.jscomp.Scope.Var s : def.depends) {
			if ((s.scope) != (jsScope)) {
				return true;
			}
		}
		return false;
	}
}


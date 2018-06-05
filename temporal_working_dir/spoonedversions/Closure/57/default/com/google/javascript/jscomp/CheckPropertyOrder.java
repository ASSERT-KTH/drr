

package com.google.javascript.jscomp;


class CheckPropertyOrder extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
	static final com.google.javascript.jscomp.DiagnosticType UNASSIGNED_PROPERTY = com.google.javascript.jscomp.DiagnosticType.error("UNASSIGNED_PROPERTY", "not all control paths assign property {1} in function {0}");

	static final com.google.javascript.jscomp.DiagnosticType UNEQUAL_PROPERTIES = com.google.javascript.jscomp.DiagnosticType.error("UNEQUAL_PROPERTIES", ("different control paths produce different (ordered) property lists:" + " {0} vs. {1}"));

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.CheckLevel level;

	private final boolean onlyOneError;

	private int errorCount;

	CheckPropertyOrder(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.CheckLevel level) {
		this(compiler, level, false);
	}

	CheckPropertyOrder(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.CheckLevel level, boolean onlyOneError) {
		this.compiler = compiler;
		this.level = level;
		this.onlyOneError = onlyOneError;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.CheckPropertyOrder.this);
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		com.google.javascript.rhino.Node func = null;
		java.lang.String funcName = null;
		if ((com.google.javascript.jscomp.NodeUtil.isFunction(n)) && (com.google.javascript.jscomp.CheckPropertyOrder.isConstructor(n))) {
			func = n;
			funcName = n.getFirstChild().getString();
		}else
			if (((com.google.javascript.jscomp.NodeUtil.isAssign(n)) && (com.google.javascript.jscomp.NodeUtil.isFunction(n.getFirstChild().getNext()))) && (com.google.javascript.jscomp.CheckPropertyOrder.isConstructor(n))) {
				func = n.getFirstChild().getNext();
				funcName = n.getFirstChild().getQualifiedName();
			}
		
		if (func != null) {
			com.google.javascript.rhino.jstype.FunctionType funcType = ((com.google.javascript.rhino.jstype.FunctionType) (func.getJSType()));
			checkConstructor(func, (funcType != null ? funcType.getInstanceType() : null), t.getSourceName(), funcName);
		}
	}

	private static boolean isConstructor(com.google.javascript.rhino.Node n) {
		return ((n.getJSDocInfo()) != null) && (n.getJSDocInfo().isConstructor());
	}

	@java.lang.SuppressWarnings(value = "unchecked")
	private void checkConstructor(com.google.javascript.rhino.Node func, com.google.javascript.rhino.jstype.ObjectType objType, java.lang.String sourceName, java.lang.String funcName) {
		com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isFunction(func));
		com.google.javascript.jscomp.ControlFlowAnalysis cfa = new com.google.javascript.jscomp.ControlFlowAnalysis(compiler, false, false);
		cfa.process(null, func.getFirstChild().getNext().getNext());
		com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> cfg = cfa.getCfg();
		new com.google.javascript.jscomp.CheckPropertyOrder.PropertyOrdersFlowAnalysis(cfa.getCfg()).analyze();
		com.google.javascript.jscomp.graph.Annotation ann = cfa.getCfg().getImplicitReturn().getAnnotation();
		java.util.List<java.lang.String>[] orders = ((com.google.javascript.jscomp.DataFlowAnalysis.FlowState<com.google.javascript.jscomp.CheckPropertyOrder.PropertyOrders>) (ann)).getIn().getOrders();
		if ((orders.length) == 0) {
			throw new java.lang.AssertionError((("no paths through constructor " + funcName) + "?"));
		}
		if ((orders.length) > 1) {
			report(sourceName, func, com.google.javascript.jscomp.CheckPropertyOrder.UNEQUAL_PROPERTIES, com.google.javascript.jscomp.CheckPropertyOrder.reverse(orders[0]).toString(), com.google.javascript.jscomp.CheckPropertyOrder.reverse(orders[1]).toString());
		}
		if (objType != null) {
			for (java.lang.String propName : objType.getOwnPropertyNames()) {
				if (!(orders[0].contains(propName))) {
					report(sourceName, func, com.google.javascript.jscomp.CheckPropertyOrder.UNASSIGNED_PROPERTY, funcName, propName);
				}
			}
		}
	}

	private void report(java.lang.String srcName, com.google.javascript.rhino.Node node, com.google.javascript.jscomp.DiagnosticType type, java.lang.String... args) {
		if ((!(onlyOneError)) || ((++(errorCount)) <= 1)) {
			compiler.report(com.google.javascript.jscomp.JSError.make(srcName, node, level, type, args));
		}
	}

	private static <T> java.util.List<T> reverse(java.util.List<T> seq) {
		if (seq.isEmpty()) {
			return seq;
		}
		java.util.List<T> rev = com.google.common.collect.Lists.newArrayList(seq);
		java.util.Collections.reverse(seq);
		return rev;
	}

	private static class OrdersJoinOp extends com.google.javascript.jscomp.JoinOp.BinaryJoinOp<com.google.javascript.jscomp.CheckPropertyOrder.PropertyOrders> {
		@java.lang.Override
		public com.google.javascript.jscomp.CheckPropertyOrder.PropertyOrders apply(com.google.javascript.jscomp.CheckPropertyOrder.PropertyOrders a, com.google.javascript.jscomp.CheckPropertyOrder.PropertyOrders b) {
			return new com.google.javascript.jscomp.CheckPropertyOrder.PropertyOrders(com.google.common.collect.Sets.newHashSet(com.google.common.collect.Sets.union(a.orders, b.orders)));
		}
	}

	private static class PropertyOrders implements com.google.javascript.jscomp.LatticeElement {
		public static final com.google.javascript.jscomp.CheckPropertyOrder.PropertyOrders EMPTY = new com.google.javascript.jscomp.CheckPropertyOrder.PropertyOrders(com.google.common.collect.Sets.<java.util.List<java.lang.String>>newHashSet());

		private final java.util.Set<java.util.List<java.lang.String>> orders;

		private PropertyOrders(java.util.Set<java.util.List<java.lang.String>> orders) {
			this.orders = orders;
		}

		@java.lang.Override
		public boolean equals(java.lang.Object other) {
			if (!(other instanceof com.google.javascript.jscomp.CheckPropertyOrder.PropertyOrders)) {
				return false;
			}
			return orders.equals(((com.google.javascript.jscomp.CheckPropertyOrder.PropertyOrders) (other)).orders);
		}

		public com.google.javascript.jscomp.CheckPropertyOrder.PropertyOrders copyAndAdd(java.lang.String propName) {
			java.util.Set<java.util.List<java.lang.String>> orders = com.google.common.collect.Sets.newHashSet();
			for (java.util.List<java.lang.String> order : com.google.javascript.jscomp.CheckPropertyOrder.PropertyOrders.this.orders) {
				if (!(order.contains(propName))) {
					java.util.List<java.lang.String> nOrder = com.google.common.collect.Lists.newArrayList(order);
					nOrder.add(propName);
					order = nOrder;
				}
				orders.add(order);
			}
			return new com.google.javascript.jscomp.CheckPropertyOrder.PropertyOrders(orders);
		}

		@java.lang.SuppressWarnings(value = "unchecked")
		public java.util.List<java.lang.String>[] getOrders() {
			int minSize = java.lang.Integer.MAX_VALUE;
			for (java.util.List<java.lang.String> seq : com.google.javascript.jscomp.CheckPropertyOrder.PropertyOrders.this.orders) {
				minSize = java.lang.Math.min(minSize, seq.size());
			}
			java.util.Set<java.util.List<java.lang.String>> orders = com.google.common.collect.Sets.newHashSet();
			for (java.util.List<java.lang.String> seq : com.google.javascript.jscomp.CheckPropertyOrder.PropertyOrders.this.orders) {
				orders.add(seq.subList(0, minSize));
			}
			return orders.toArray(((java.util.List<java.lang.String>[]) (new java.util.List<?>[orders.size()])));
		}

		@java.lang.Override
		public java.lang.String toString() {
			return ("{" + (com.google.common.base.Joiner.on(", ").join(orders))) + "}";
		}
	}

	private static class PropertyOrdersFlowAnalysis extends com.google.javascript.jscomp.DataFlowAnalysis<com.google.javascript.rhino.Node, com.google.javascript.jscomp.CheckPropertyOrder.PropertyOrders> {
		public PropertyOrdersFlowAnalysis(com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> cfg) {
			super(cfg, new com.google.javascript.jscomp.CheckPropertyOrder.OrdersJoinOp());
		}

		@java.lang.Override
		public boolean isForward() {
			return true;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.CheckPropertyOrder.PropertyOrders createInitialEstimateLattice() {
			return com.google.javascript.jscomp.CheckPropertyOrder.PropertyOrders.EMPTY;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.CheckPropertyOrder.PropertyOrders createEntryLattice() {
			java.util.Set<java.util.List<java.lang.String>> orders = com.google.common.collect.Sets.newHashSet();
			orders.add(new java.util.Stack<java.lang.String>());
			return new com.google.javascript.jscomp.CheckPropertyOrder.PropertyOrders(orders);
		}

		@java.lang.Override
		public com.google.javascript.jscomp.CheckPropertyOrder.PropertyOrders flowThrough(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.CheckPropertyOrder.PropertyOrders input) {
			switch (node.getType()) {
				case com.google.javascript.rhino.Token.BLOCK :
				case com.google.javascript.rhino.Token.LABEL :
				case com.google.javascript.rhino.Token.FUNCTION :
					return input;
				case com.google.javascript.rhino.Token.IF :
				case com.google.javascript.rhino.Token.WHILE :
				case com.google.javascript.rhino.Token.DO :
					return flowThrough(com.google.javascript.jscomp.NodeUtil.getConditionExpression(node), input);
				case com.google.javascript.rhino.Token.SWITCH :
				case com.google.javascript.rhino.Token.WITH :
					return flowThrough(node.getFirstChild(), input);
				case com.google.javascript.rhino.Token.FOR :
					if ((node.getChildCount()) == 4) {
						com.google.javascript.rhino.Node pre = node.getFirstChild();
						com.google.javascript.rhino.Node cond = pre.getNext();
						return flowThrough(cond, flowThrough(pre, input));
					}else {
						com.google.javascript.rhino.Node lhs = node.getFirstChild();
						com.google.javascript.rhino.Node rhs = lhs.getNext();
						return flowThrough(rhs, flowThrough(lhs, input));
					}
				case com.google.javascript.rhino.Token.HOOK :
					com.google.javascript.rhino.Node cond = node.getFirstChild();
					input = flowThrough(cond, input);
					com.google.javascript.rhino.Node ifTrue = cond.getNext();
					com.google.javascript.rhino.Node ifFalse = ifTrue.getNext();
					return join(flowThrough(ifTrue, input), flowThrough(ifFalse, input));
				case com.google.javascript.rhino.Token.AND :
				case com.google.javascript.rhino.Token.OR :
					com.google.javascript.rhino.Node left = node.getFirstChild();
					com.google.javascript.rhino.Node right = left.getNext();
					input = flowThrough(left, input);
					return join(input, flowThrough(right, input));
				case com.google.javascript.rhino.Token.ASSIGN :
					com.google.javascript.rhino.Node lhs = node.getFirstChild();
					com.google.javascript.rhino.Node rhs = lhs.getNext();
					if ((lhs.getType()) == (com.google.javascript.rhino.Token.GETPROP)) {
						com.google.javascript.rhino.Node llhs = lhs.getFirstChild();
						com.google.javascript.rhino.Node lrhs = llhs.getNext();
						if ((((llhs.getType()) == (com.google.javascript.rhino.Token.THIS)) && ((lrhs.getType()) == (com.google.javascript.rhino.Token.STRING))) && ((lrhs.getNext()) == null)) {
							return flowThrough(rhs, input.copyAndAdd(lrhs.getString()));
						}
					}
					return flowThrough(rhs, flowThrough(lhs, input));
				default :
					for (node = node.getFirstChild(); node != null; node = node.getNext()) {
						input = flowThrough(node, input);
					}
					return input;
			}
		}
	}
}


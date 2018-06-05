

package com.google.javascript.jscomp;


final class ControlFlowAnalysis implements com.google.javascript.jscomp.CompilerPass , com.google.javascript.jscomp.NodeTraversal.Callback {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> cfg;

	private java.util.Map<com.google.javascript.rhino.Node, java.lang.Integer> astPosition;

	private java.util.Map<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>, java.lang.Integer> nodePriorities;

	private final java.util.Comparator<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>> priorityComparator = new java.util.Comparator<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>>() {
		@java.lang.Override
		public int compare(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> a, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> b) {
			return (astPosition.get(a.getValue())) - (astPosition.get(b.getValue()));
		}
	};

	private int astPositionCounter;

	private int priorityCounter;

	private final boolean shouldTraverseFunctions;

	private final boolean edgeAnnotations;

	private com.google.javascript.rhino.Node root;

	private final java.util.Deque<com.google.javascript.rhino.Node> exceptionHandler = new java.util.ArrayDeque<com.google.javascript.rhino.Node>();

	private final com.google.common.collect.Multimap<com.google.javascript.rhino.Node, com.google.javascript.rhino.Node> finallyMap = com.google.common.collect.HashMultimap.create();

	ControlFlowAnalysis(com.google.javascript.jscomp.AbstractCompiler compiler, boolean shouldTraverseFunctions, boolean edgeAnnotations) {
		this.compiler = compiler;
		this.shouldTraverseFunctions = shouldTraverseFunctions;
		this.edgeAnnotations = edgeAnnotations;
	}

	com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> getCfg() {
		return cfg;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.ControlFlowAnalysis.this.root = root;
		astPositionCounter = 0;
		astPosition = com.google.common.collect.Maps.newHashMap();
		nodePriorities = com.google.common.collect.Maps.newHashMap();
		cfg = new com.google.javascript.jscomp.ControlFlowAnalysis.AstControlFlowGraph(com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(root), nodePriorities, edgeAnnotations);
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.ControlFlowAnalysis.this);
		astPosition.put(null, (++(astPositionCounter)));
		priorityCounter = 0;
		com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> entry = cfg.getEntry();
		prioritizeFromEntryNode(entry);
		if (shouldTraverseFunctions) {
			for (com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> candidate : cfg.getDirectedGraphNodes()) {
				com.google.javascript.rhino.Node value = candidate.getValue();
				if ((value != null) && (value.isFunction())) {
					com.google.common.base.Preconditions.checkState(((!(nodePriorities.containsKey(candidate))) || (candidate == entry)));
					prioritizeFromEntryNode(candidate);
				}
			}
		}
		for (com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> candidate : cfg.getDirectedGraphNodes()) {
			if (!(nodePriorities.containsKey(candidate))) {
				nodePriorities.put(candidate, (++(priorityCounter)));
			}
		}
		nodePriorities.put(cfg.getImplicitReturn(), (++(priorityCounter)));
	}

	private void prioritizeFromEntryNode(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> entry) {
		java.util.PriorityQueue<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>> worklist = new java.util.PriorityQueue<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>>(10, priorityComparator);
		worklist.add(entry);
		while (!(worklist.isEmpty())) {
			com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> current = worklist.remove();
			if (nodePriorities.containsKey(current)) {
				continue;
			}
			nodePriorities.put(current, (++(priorityCounter)));
			java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>> successors = cfg.getDirectedSuccNodes(current);
			for (com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> candidate : successors) {
				worklist.add(candidate);
			}
		} 
	}

	@java.lang.Override
	public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal nodeTraversal, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		astPosition.put(n, ((astPositionCounter)++));
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.FUNCTION :
				if ((shouldTraverseFunctions) || (n == (cfg.getEntry().getValue()))) {
					exceptionHandler.push(n);
					return true;
				}
				return false;
			case com.google.javascript.rhino.Token.TRY :
				exceptionHandler.push(n);
				return true;
		}
		if (parent != null) {
			switch (parent.getType()) {
				case com.google.javascript.rhino.Token.FOR :
					return n == (parent.getLastChild());
				case com.google.javascript.rhino.Token.IF :
				case com.google.javascript.rhino.Token.WHILE :
				case com.google.javascript.rhino.Token.WITH :
					return n != (parent.getFirstChild());
				case com.google.javascript.rhino.Token.DO :
					return n != (parent.getFirstChild().getNext());
				case com.google.javascript.rhino.Token.SWITCH :
				case com.google.javascript.rhino.Token.CASE :
				case com.google.javascript.rhino.Token.CATCH :
				case com.google.javascript.rhino.Token.LABEL :
					return n != (parent.getFirstChild());
				case com.google.javascript.rhino.Token.FUNCTION :
					return n == (parent.getFirstChild().getNext().getNext());
				case com.google.javascript.rhino.Token.CONTINUE :
				case com.google.javascript.rhino.Token.BREAK :
				case com.google.javascript.rhino.Token.EXPR_RESULT :
				case com.google.javascript.rhino.Token.VAR :
				case com.google.javascript.rhino.Token.RETURN :
				case com.google.javascript.rhino.Token.THROW :
					return false;
				case com.google.javascript.rhino.Token.TRY :
					if (n == (parent.getFirstChild().getNext())) {
						com.google.common.base.Preconditions.checkState(((exceptionHandler.peek()) == parent));
						exceptionHandler.pop();
					}
			}
		}
		return true;
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.IF :
				handleIf(n);
				return ;
			case com.google.javascript.rhino.Token.WHILE :
				handleWhile(n);
				return ;
			case com.google.javascript.rhino.Token.DO :
				handleDo(n);
				return ;
			case com.google.javascript.rhino.Token.FOR :
				handleFor(n);
				return ;
			case com.google.javascript.rhino.Token.SWITCH :
				handleSwitch(n);
				return ;
			case com.google.javascript.rhino.Token.CASE :
				handleCase(n);
				return ;
			case com.google.javascript.rhino.Token.DEFAULT_CASE :
				handleDefault(n);
				return ;
			case com.google.javascript.rhino.Token.BLOCK :
			case com.google.javascript.rhino.Token.SCRIPT :
				handleStmtList(n);
				return ;
			case com.google.javascript.rhino.Token.FUNCTION :
				handleFunction(n);
				return ;
			case com.google.javascript.rhino.Token.EXPR_RESULT :
				handleExpr(n);
				return ;
			case com.google.javascript.rhino.Token.THROW :
				handleThrow(n);
				return ;
			case com.google.javascript.rhino.Token.TRY :
				handleTry(n);
				return ;
			case com.google.javascript.rhino.Token.CATCH :
				handleCatch(n);
				return ;
			case com.google.javascript.rhino.Token.BREAK :
				handleBreak(n);
				return ;
			case com.google.javascript.rhino.Token.CONTINUE :
				handleContinue(n);
				return ;
			case com.google.javascript.rhino.Token.RETURN :
				handleReturn(n);
				return ;
			case com.google.javascript.rhino.Token.WITH :
				handleWith(n);
				return ;
			case com.google.javascript.rhino.Token.LABEL :
				return ;
			default :
				handleStmt(n);
				return ;
		}
	}

	private void handleIf(com.google.javascript.rhino.Node node) {
		com.google.javascript.rhino.Node thenBlock = node.getFirstChild().getNext();
		com.google.javascript.rhino.Node elseBlock = thenBlock.getNext();
		createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_TRUE, com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(thenBlock));
		if (elseBlock == null) {
			createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_FALSE, com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(node, com.google.javascript.jscomp.ControlFlowAnalysis.this));
		}else {
			createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_FALSE, com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(elseBlock));
		}
		connectToPossibleExceptionHandler(node, com.google.javascript.jscomp.NodeUtil.getConditionExpression(node));
	}

	private void handleWhile(com.google.javascript.rhino.Node node) {
		createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_TRUE, com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(node.getFirstChild().getNext()));
		createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_FALSE, com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(node, com.google.javascript.jscomp.ControlFlowAnalysis.this));
		connectToPossibleExceptionHandler(node, com.google.javascript.jscomp.NodeUtil.getConditionExpression(node));
	}

	private void handleDo(com.google.javascript.rhino.Node node) {
		createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_TRUE, com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(node.getFirstChild()));
		createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_FALSE, com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(node, com.google.javascript.jscomp.ControlFlowAnalysis.this));
		connectToPossibleExceptionHandler(node, com.google.javascript.jscomp.NodeUtil.getConditionExpression(node));
	}

	private void handleFor(com.google.javascript.rhino.Node forNode) {
		if ((forNode.getChildCount()) == 4) {
			com.google.javascript.rhino.Node init = forNode.getFirstChild();
			com.google.javascript.rhino.Node cond = init.getNext();
			com.google.javascript.rhino.Node iter = cond.getNext();
			com.google.javascript.rhino.Node body = iter.getNext();
			createEdge(init, com.google.javascript.jscomp.ControlFlowGraph.Branch.UNCOND, forNode);
			createEdge(forNode, com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_TRUE, com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(body));
			createEdge(forNode, com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_FALSE, com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(forNode, com.google.javascript.jscomp.ControlFlowAnalysis.this));
			createEdge(iter, com.google.javascript.jscomp.ControlFlowGraph.Branch.UNCOND, forNode);
			connectToPossibleExceptionHandler(init, init);
			connectToPossibleExceptionHandler(forNode, cond);
			connectToPossibleExceptionHandler(iter, iter);
		}else {
			com.google.javascript.rhino.Node item = forNode.getFirstChild();
			com.google.javascript.rhino.Node collection = item.getNext();
			com.google.javascript.rhino.Node body = collection.getNext();
			createEdge(forNode, com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_TRUE, com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(body));
			createEdge(forNode, com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_FALSE, com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(forNode, com.google.javascript.jscomp.ControlFlowAnalysis.this));
			connectToPossibleExceptionHandler(forNode, collection);
		}
	}

	private void handleSwitch(com.google.javascript.rhino.Node node) {
		com.google.javascript.rhino.Node next = com.google.javascript.jscomp.ControlFlowAnalysis.getNextSiblingOfType(node.getFirstChild().getNext(), com.google.javascript.rhino.Token.CASE, com.google.javascript.rhino.Token.EMPTY);
		if (next != null) {
			createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.UNCOND, next);
		}else {
			if ((node.getFirstChild().getNext()) != null) {
				createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.UNCOND, node.getFirstChild().getNext());
			}else {
				createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.UNCOND, com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(node, com.google.javascript.jscomp.ControlFlowAnalysis.this));
			}
		}
		connectToPossibleExceptionHandler(node, node.getFirstChild());
	}

	private void handleCase(com.google.javascript.rhino.Node node) {
		createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_TRUE, node.getFirstChild().getNext());
		com.google.javascript.rhino.Node next = com.google.javascript.jscomp.ControlFlowAnalysis.getNextSiblingOfType(node.getNext(), com.google.javascript.rhino.Token.CASE);
		if (next != null) {
			com.google.common.base.Preconditions.checkState(next.isCase());
			createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_FALSE, next);
		}else {
			com.google.javascript.rhino.Node parent = node.getParent();
			com.google.javascript.rhino.Node deflt = com.google.javascript.jscomp.ControlFlowAnalysis.getNextSiblingOfType(parent.getFirstChild().getNext(), com.google.javascript.rhino.Token.DEFAULT_CASE);
			if (deflt != null) {
				createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_FALSE, deflt);
			}else {
				createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_FALSE, com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(node, com.google.javascript.jscomp.ControlFlowAnalysis.this));
			}
		}
		connectToPossibleExceptionHandler(node, node.getFirstChild());
	}

	private void handleDefault(com.google.javascript.rhino.Node node) {
		createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.UNCOND, node.getFirstChild());
	}

	private void handleWith(com.google.javascript.rhino.Node node) {
		createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.UNCOND, node.getLastChild());
		connectToPossibleExceptionHandler(node, node.getFirstChild());
	}

	private void handleStmtList(com.google.javascript.rhino.Node node) {
		com.google.javascript.rhino.Node parent = node.getParent();
		if (((((node.isBlock()) && (parent != null)) && (parent.isTry())) && ((com.google.javascript.jscomp.NodeUtil.getCatchBlock(parent)) == node)) && (!(com.google.javascript.jscomp.NodeUtil.hasCatchHandler(node)))) {
			return ;
		}
		com.google.javascript.rhino.Node child = node.getFirstChild();
		while ((child != null) && (child.isFunction())) {
			child = child.getNext();
		} 
		if (child != null) {
			createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.UNCOND, com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(child));
		}else {
			createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.UNCOND, com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(node, com.google.javascript.jscomp.ControlFlowAnalysis.this));
		}
		if (parent != null) {
			switch (parent.getType()) {
				case com.google.javascript.rhino.Token.DEFAULT_CASE :
				case com.google.javascript.rhino.Token.CASE :
				case com.google.javascript.rhino.Token.TRY :
					break;
				default :
					if ((node.isBlock()) && (node.isSyntheticBlock())) {
						createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.SYN_BLOCK, com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(node, com.google.javascript.jscomp.ControlFlowAnalysis.this));
					}
					break;
			}
		}
	}

	private void handleFunction(com.google.javascript.rhino.Node node) {
		com.google.common.base.Preconditions.checkState(((node.getChildCount()) >= 3));
		createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.UNCOND, com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(node.getFirstChild().getNext().getNext()));
		com.google.common.base.Preconditions.checkState(((exceptionHandler.peek()) == node));
		exceptionHandler.pop();
	}

	private void handleExpr(com.google.javascript.rhino.Node node) {
		createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.UNCOND, com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(node, com.google.javascript.jscomp.ControlFlowAnalysis.this));
		connectToPossibleExceptionHandler(node, node);
	}

	private void handleThrow(com.google.javascript.rhino.Node node) {
		connectToPossibleExceptionHandler(node, node);
	}

	private void handleTry(com.google.javascript.rhino.Node node) {
		createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.UNCOND, node.getFirstChild());
	}

	private void handleCatch(com.google.javascript.rhino.Node node) {
		createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.UNCOND, node.getLastChild());
	}

	private void handleBreak(com.google.javascript.rhino.Node node) {
		java.lang.String label = null;
		if (node.hasChildren()) {
			label = node.getFirstChild().getString();
		}
		com.google.javascript.rhino.Node cur;
		com.google.javascript.rhino.Node previous = null;
		com.google.javascript.rhino.Node lastJump;
		com.google.javascript.rhino.Node parent = node.getParent();
		for (cur = node, lastJump = node; !(com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(cur, label)); cur = parent , parent = parent.getParent()) {
			if (((cur.isTry()) && (com.google.javascript.jscomp.NodeUtil.hasFinally(cur))) && ((cur.getLastChild()) != previous)) {
				if (lastJump == node) {
					createEdge(lastJump, com.google.javascript.jscomp.ControlFlowGraph.Branch.UNCOND, com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(cur.getLastChild()));
				}else {
					finallyMap.put(lastJump, com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(cur.getLastChild()));
				}
				lastJump = cur;
			}
			if (parent == null) {
				if (compiler.isIdeMode()) {
					return ;
				}else {
					throw new java.lang.IllegalStateException("Cannot find break target.");
				}
			}
			previous = cur;
		}
		if (lastJump == node) {
			createEdge(lastJump, com.google.javascript.jscomp.ControlFlowGraph.Branch.UNCOND, com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(cur, com.google.javascript.jscomp.ControlFlowAnalysis.this));
		}else {
			finallyMap.put(lastJump, com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(cur, com.google.javascript.jscomp.ControlFlowAnalysis.this));
		}
	}

	private void handleContinue(com.google.javascript.rhino.Node node) {
		java.lang.String label = null;
		if (node.hasChildren()) {
			label = node.getFirstChild().getString();
		}
		com.google.javascript.rhino.Node cur;
		com.google.javascript.rhino.Node previous = null;
		com.google.javascript.rhino.Node lastJump;
		com.google.javascript.rhino.Node parent = node.getParent();
		for (cur = node, lastJump = node; !(com.google.javascript.jscomp.ControlFlowAnalysis.isContinueTarget(cur, parent, label)); cur = parent , parent = parent.getParent()) {
			if (((cur.isTry()) && (com.google.javascript.jscomp.NodeUtil.hasFinally(cur))) && ((cur.getLastChild()) != previous)) {
				if (lastJump == node) {
					createEdge(lastJump, com.google.javascript.jscomp.ControlFlowGraph.Branch.UNCOND, cur.getLastChild());
				}else {
					finallyMap.put(lastJump, com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(cur.getLastChild()));
				}
				lastJump = cur;
			}
			com.google.common.base.Preconditions.checkState((parent != null), "Cannot find continue target.");
			previous = cur;
		}
		com.google.javascript.rhino.Node iter = cur;
		if ((cur.getChildCount()) == 4) {
			iter = cur.getFirstChild().getNext().getNext();
		}
		if (lastJump == node) {
			createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.UNCOND, iter);
		}else {
			finallyMap.put(lastJump, iter);
		}
	}

	private void handleReturn(com.google.javascript.rhino.Node node) {
		com.google.javascript.rhino.Node lastJump = null;
		for (java.util.Iterator<com.google.javascript.rhino.Node> iter = exceptionHandler.iterator(); iter.hasNext();) {
			com.google.javascript.rhino.Node curHandler = iter.next();
			if (curHandler.isFunction()) {
				break;
			}
			if (com.google.javascript.jscomp.NodeUtil.hasFinally(curHandler)) {
				if (lastJump == null) {
					createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.UNCOND, curHandler.getLastChild());
				}else {
					finallyMap.put(lastJump, com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(curHandler.getLastChild()));
				}
				lastJump = curHandler;
			}
		}
		if (node.hasChildren()) {
			connectToPossibleExceptionHandler(node, node.getFirstChild());
		}
		if (lastJump == null) {
			createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.UNCOND, null);
		}else {
			finallyMap.put(lastJump, null);
		}
	}

	private void handleStmt(com.google.javascript.rhino.Node node) {
		createEdge(node, com.google.javascript.jscomp.ControlFlowGraph.Branch.UNCOND, com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(node, com.google.javascript.jscomp.ControlFlowAnalysis.this));
		connectToPossibleExceptionHandler(node, node);
	}

	static com.google.javascript.rhino.Node computeFollowNode(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.ControlFlowAnalysis cfa) {
		return com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(node, node, cfa);
	}

	static com.google.javascript.rhino.Node computeFollowNode(com.google.javascript.rhino.Node node) {
		return com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(node, node, null);
	}

	private static com.google.javascript.rhino.Node computeFollowNode(com.google.javascript.rhino.Node fromNode, com.google.javascript.rhino.Node node, com.google.javascript.jscomp.ControlFlowAnalysis cfa) {
		com.google.javascript.rhino.Node parent = node.getParent();
		if (((parent == null) || (parent.isFunction())) || ((cfa != null) && (node == (cfa.root)))) {
			return null;
		}
		switch (parent.getType()) {
			case com.google.javascript.rhino.Token.IF :
				return com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(fromNode, parent, cfa);
			case com.google.javascript.rhino.Token.CASE :
			case com.google.javascript.rhino.Token.DEFAULT_CASE :
				if ((parent.getNext()) != null) {
					if (parent.getNext().isCase()) {
						return parent.getNext().getFirstChild().getNext();
					}else
						if (parent.getNext().isDefaultCase()) {
							return parent.getNext().getFirstChild();
						}else {
							com.google.common.base.Preconditions.checkState(false, "Not reachable");
						}
					
				}else {
					return com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(fromNode, parent, cfa);
				}
				break;
			case com.google.javascript.rhino.Token.FOR :
				if (com.google.javascript.jscomp.NodeUtil.isForIn(parent)) {
					return parent;
				}else {
					return parent.getFirstChild().getNext().getNext();
				}
			case com.google.javascript.rhino.Token.WHILE :
			case com.google.javascript.rhino.Token.DO :
				return parent;
			case com.google.javascript.rhino.Token.TRY :
				if ((parent.getFirstChild()) == node) {
					if (com.google.javascript.jscomp.NodeUtil.hasFinally(parent)) {
						return com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(parent.getLastChild());
					}else {
						return com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(fromNode, parent, cfa);
					}
				}else
					if ((com.google.javascript.jscomp.NodeUtil.getCatchBlock(parent)) == node) {
						if (com.google.javascript.jscomp.NodeUtil.hasFinally(parent)) {
							return com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(node.getNext());
						}else {
							return com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(fromNode, parent, cfa);
						}
					}else
						if ((parent.getLastChild()) == node) {
							if (cfa != null) {
								for (com.google.javascript.rhino.Node finallyNode : cfa.finallyMap.get(parent)) {
									cfa.createEdge(fromNode, com.google.javascript.jscomp.ControlFlowGraph.Branch.UNCOND, finallyNode);
								}
							}
							return com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(fromNode, parent, cfa);
						}
					
				
		}
		com.google.javascript.rhino.Node nextSibling = node.getNext();
		while ((nextSibling != null) && (nextSibling.isFunction())) {
			nextSibling = nextSibling.getNext();
		} 
		if (nextSibling != null) {
			return com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(nextSibling);
		}else {
			return com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(fromNode, parent, cfa);
		}
	}

	static com.google.javascript.rhino.Node computeFallThrough(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.DO :
				return com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(n.getFirstChild());
			case com.google.javascript.rhino.Token.FOR :
				if (com.google.javascript.jscomp.NodeUtil.isForIn(n)) {
					return n;
				}
				return com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(n.getFirstChild());
			case com.google.javascript.rhino.Token.LABEL :
				return com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(n.getLastChild());
			default :
				return n;
		}
	}

	private void createEdge(com.google.javascript.rhino.Node fromNode, com.google.javascript.jscomp.ControlFlowGraph.Branch branch, com.google.javascript.rhino.Node toNode) {
		cfg.createNode(fromNode);
		cfg.createNode(toNode);
		cfg.connectIfNotFound(fromNode, branch, toNode);
	}

	private void connectToPossibleExceptionHandler(com.google.javascript.rhino.Node cfgNode, com.google.javascript.rhino.Node target) {
		if ((com.google.javascript.jscomp.ControlFlowAnalysis.mayThrowException(target)) && (!(exceptionHandler.isEmpty()))) {
			com.google.javascript.rhino.Node lastJump = cfgNode;
			for (com.google.javascript.rhino.Node handler : exceptionHandler) {
				if (handler.isFunction()) {
					return ;
				}
				com.google.common.base.Preconditions.checkState(handler.isTry());
				com.google.javascript.rhino.Node catchBlock = com.google.javascript.jscomp.NodeUtil.getCatchBlock(handler);
				if (!(com.google.javascript.jscomp.NodeUtil.hasCatchHandler(catchBlock))) {
					if (lastJump == cfgNode) {
						createEdge(cfgNode, com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_EX, handler.getLastChild());
					}else {
						finallyMap.put(lastJump, handler.getLastChild());
					}
				}else {
					if (lastJump == cfgNode) {
						createEdge(cfgNode, com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_EX, catchBlock);
						return ;
					}else {
						finallyMap.put(lastJump, catchBlock);
					}
				}
				lastJump = handler;
			}
		}
	}

	private static com.google.javascript.rhino.Node getNextSiblingOfType(com.google.javascript.rhino.Node first, int... types) {
		for (com.google.javascript.rhino.Node c = first; c != null; c = c.getNext()) {
			for (int type : types) {
				if ((c.getType()) == type) {
					return c;
				}
			}
		}
		return null;
	}

	public static boolean isBreakTarget(com.google.javascript.rhino.Node target, java.lang.String label) {
		return (com.google.javascript.jscomp.ControlFlowAnalysis.isBreakStructure(target, (label != null))) && (com.google.javascript.jscomp.ControlFlowAnalysis.matchLabel(target.getParent(), label));
	}

	private static boolean isContinueTarget(com.google.javascript.rhino.Node target, com.google.javascript.rhino.Node parent, java.lang.String label) {
		return (com.google.javascript.jscomp.ControlFlowAnalysis.isContinueStructure(target)) && (com.google.javascript.jscomp.ControlFlowAnalysis.matchLabel(parent, label));
	}

	private static boolean matchLabel(com.google.javascript.rhino.Node target, java.lang.String label) {
		if (label == null) {
			return true;
		}
		while (target.isLabel()) {
			if (target.getFirstChild().getString().equals(label)) {
				return true;
			}
			target = target.getParent();
		} 
		return false;
	}

	public static boolean mayThrowException(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.CALL :
			case com.google.javascript.rhino.Token.GETPROP :
			case com.google.javascript.rhino.Token.GETELEM :
			case com.google.javascript.rhino.Token.THROW :
			case com.google.javascript.rhino.Token.NEW :
			case com.google.javascript.rhino.Token.ASSIGN :
			case com.google.javascript.rhino.Token.INC :
			case com.google.javascript.rhino.Token.DEC :
			case com.google.javascript.rhino.Token.INSTANCEOF :
				return true;
			case com.google.javascript.rhino.Token.FUNCTION :
				return false;
		}
		for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
			if ((!(com.google.javascript.jscomp.ControlFlowGraph.isEnteringNewCfgNode(c))) && (com.google.javascript.jscomp.ControlFlowAnalysis.mayThrowException(c))) {
				return true;
			}
		}
		return false;
	}

	static boolean isBreakStructure(com.google.javascript.rhino.Node n, boolean labeled) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.FOR :
			case com.google.javascript.rhino.Token.DO :
			case com.google.javascript.rhino.Token.WHILE :
			case com.google.javascript.rhino.Token.SWITCH :
				return true;
			case com.google.javascript.rhino.Token.BLOCK :
			case com.google.javascript.rhino.Token.IF :
			case com.google.javascript.rhino.Token.TRY :
				return labeled;
			default :
				return false;
		}
	}

	static boolean isContinueStructure(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.FOR :
			case com.google.javascript.rhino.Token.DO :
			case com.google.javascript.rhino.Token.WHILE :
				return true;
			default :
				return false;
		}
	}

	static com.google.javascript.rhino.Node getExceptionHandler(com.google.javascript.rhino.Node n) {
		for (com.google.javascript.rhino.Node cur = n; (!(cur.isScript())) && (!(cur.isFunction())); cur = cur.getParent()) {
			com.google.javascript.rhino.Node catchNode = com.google.javascript.jscomp.ControlFlowAnalysis.getCatchHandlerForBlock(cur);
			if (catchNode != null) {
				return catchNode;
			}
		}
		return null;
	}

	static com.google.javascript.rhino.Node getCatchHandlerForBlock(com.google.javascript.rhino.Node block) {
		if (((block.isBlock()) && (block.getParent().isTry())) && ((block.getParent().getFirstChild()) == block)) {
			for (com.google.javascript.rhino.Node s = block.getNext(); s != null; s = s.getNext()) {
				if (com.google.javascript.jscomp.NodeUtil.hasCatchHandler(s)) {
					return s.getFirstChild();
				}
			}
		}
		return null;
	}

	private static class AstControlFlowGraph extends com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> {
		private final java.util.Map<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>, java.lang.Integer> priorities;

		private AstControlFlowGraph(com.google.javascript.rhino.Node entry, java.util.Map<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>, java.lang.Integer> priorities, boolean edgeAnnotations) {
			super(entry, true, edgeAnnotations);
			this.priorities = priorities;
		}

		@java.lang.Override
		public java.util.Comparator<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>> getOptionalNodeComparator(boolean isForward) {
			if (isForward) {
				return new java.util.Comparator<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>>() {
					@java.lang.Override
					public int compare(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> n1, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> n2) {
						return (getPosition(n1)) - (getPosition(n2));
					}
				};
			}else {
				return new java.util.Comparator<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>>() {
					@java.lang.Override
					public int compare(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> n1, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> n2) {
						return (getPosition(n2)) - (getPosition(n1));
					}
				};
			}
		}

		private int getPosition(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> n) {
			java.lang.Integer priority = priorities.get(n);
			com.google.common.base.Preconditions.checkNotNull(priority);
			return priority;
		}
	}
}


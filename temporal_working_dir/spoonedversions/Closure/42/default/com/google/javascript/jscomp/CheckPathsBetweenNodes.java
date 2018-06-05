

package com.google.javascript.jscomp;


class CheckPathsBetweenNodes<N, E> {
	private final com.google.common.base.Predicate<N> nodePredicate;

	private final com.google.common.base.Predicate<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E>> edgePredicate;

	private final boolean inclusive;

	private static final com.google.javascript.jscomp.graph.Annotation BACK_EDGE = new com.google.javascript.jscomp.graph.Annotation() {	};

	private static final com.google.javascript.jscomp.graph.Annotation VISITED_EDGE = new com.google.javascript.jscomp.graph.Annotation() {	};

	private static final com.google.javascript.jscomp.graph.Annotation WHITE = null;

	private static final com.google.javascript.jscomp.graph.Annotation GRAY = new com.google.javascript.jscomp.graph.Annotation() {	};

	private static final com.google.javascript.jscomp.graph.Annotation BLACK = new com.google.javascript.jscomp.graph.Annotation() {	};

	private final com.google.javascript.jscomp.graph.DiGraph<N, E> graph;

	private final com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> start;

	private final com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> end;

	CheckPathsBetweenNodes(com.google.javascript.jscomp.graph.DiGraph<N, E> graph, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> a, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> b, com.google.common.base.Predicate<N> nodePredicate, com.google.common.base.Predicate<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E>> edgePredicate, boolean inclusive) {
		this.graph = graph;
		this.start = a;
		this.end = b;
		this.nodePredicate = nodePredicate;
		this.edgePredicate = edgePredicate;
		this.inclusive = inclusive;
	}

	CheckPathsBetweenNodes(com.google.javascript.jscomp.graph.DiGraph<N, E> graph, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> a, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> b, com.google.common.base.Predicate<N> nodePredicate, com.google.common.base.Predicate<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E>> edgePredicate) {
		this(graph, a, b, nodePredicate, edgePredicate, true);
	}

	public boolean allPathsSatisfyPredicate() {
		setUp();
		boolean result = checkAllPathsWithoutBackEdges(start, end);
		tearDown();
		return result;
	}

	public boolean somePathsSatisfyPredicate() {
		setUp();
		boolean result = checkSomePathsWithoutBackEdges(start, end);
		tearDown();
		return result;
	}

	private void setUp() {
		graph.pushNodeAnnotations();
		graph.pushEdgeAnnotations();
		discoverBackEdges(com.google.javascript.jscomp.CheckPathsBetweenNodes.this.start);
	}

	private void tearDown() {
		graph.popNodeAnnotations();
		graph.popEdgeAnnotations();
	}

	private void discoverBackEdges(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> u) {
		u.setAnnotation(com.google.javascript.jscomp.CheckPathsBetweenNodes.GRAY);
		for (com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E> e : u.getOutEdges()) {
			if (ignoreEdge(e)) {
				continue;
			}
			com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> v = e.getDestination();
			if ((v.getAnnotation()) == (com.google.javascript.jscomp.CheckPathsBetweenNodes.WHITE)) {
				discoverBackEdges(v);
			}else
				if ((v.getAnnotation()) == (com.google.javascript.jscomp.CheckPathsBetweenNodes.GRAY)) {
					e.setAnnotation(com.google.javascript.jscomp.CheckPathsBetweenNodes.BACK_EDGE);
				}
			
		}
		u.setAnnotation(com.google.javascript.jscomp.CheckPathsBetweenNodes.BLACK);
	}

	private boolean ignoreEdge(com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E> e) {
		return !(edgePredicate.apply(e));
	}

	private boolean checkAllPathsWithoutBackEdges(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> a, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> b) {
		if ((nodePredicate.apply(a.getValue())) && ((inclusive) || ((a != (start)) && (a != (end))))) {
			return true;
		}
		if (a == b) {
			return false;
		}
		for (com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E> e : a.getOutEdges()) {
			if ((e.getAnnotation()) == (com.google.javascript.jscomp.CheckPathsBetweenNodes.VISITED_EDGE)) {
				continue;
			}
			e.setAnnotation(com.google.javascript.jscomp.CheckPathsBetweenNodes.VISITED_EDGE);
			if (ignoreEdge(e)) {
				continue;
			}
			if ((e.getAnnotation()) == (com.google.javascript.jscomp.CheckPathsBetweenNodes.BACK_EDGE)) {
				continue;
			}
			com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> next = e.getDestination();
			if (!(checkAllPathsWithoutBackEdges(next, b))) {
				return false;
			}
		}
		return true;
	}

	private boolean checkSomePathsWithoutBackEdges(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> a, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> b) {
		if ((nodePredicate.apply(a.getValue())) && ((inclusive) || ((a != (start)) && (a != (end))))) {
			return true;
		}
		if (a == b) {
			return false;
		}
		for (com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E> e : a.getOutEdges()) {
			if ((e.getAnnotation()) == (com.google.javascript.jscomp.CheckPathsBetweenNodes.VISITED_EDGE)) {
				continue;
			}
			e.setAnnotation(com.google.javascript.jscomp.CheckPathsBetweenNodes.VISITED_EDGE);
			if (ignoreEdge(e)) {
				continue;
			}
			if ((e.getAnnotation()) == (com.google.javascript.jscomp.CheckPathsBetweenNodes.BACK_EDGE)) {
				continue;
			}
			com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> next = e.getDestination();
			if (checkSomePathsWithoutBackEdges(next, b)) {
				return true;
			}
		}
		return false;
	}
}


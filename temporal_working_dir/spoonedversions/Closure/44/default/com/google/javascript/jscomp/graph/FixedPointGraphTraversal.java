

package com.google.javascript.jscomp.graph;


public final class FixedPointGraphTraversal<N, E> {
	private final com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback<N, E> callback;

	public static final java.lang.String NON_HALTING_ERROR_MSG = "Fixed point computation not halting";

	public FixedPointGraphTraversal(com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback<N, E> callback) {
		this.callback = callback;
	}

	public static <NODE, EDGE> com.google.javascript.jscomp.graph.FixedPointGraphTraversal<NODE, EDGE> newTraversal(com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback<NODE, EDGE> callback) {
		return new com.google.javascript.jscomp.graph.FixedPointGraphTraversal<NODE, EDGE>(callback);
	}

	public void computeFixedPoint(com.google.javascript.jscomp.graph.DiGraph<N, E> graph) {
		java.util.Set<N> nodes = com.google.common.collect.Sets.newHashSet();
		for (com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> node : graph.getDirectedGraphNodes()) {
			nodes.add(node.getValue());
		}
		computeFixedPoint(graph, nodes);
	}

	public void computeFixedPoint(com.google.javascript.jscomp.graph.DiGraph<N, E> graph, N entry) {
		java.util.Set<N> entrySet = com.google.common.collect.Sets.newHashSet();
		entrySet.add(entry);
		computeFixedPoint(graph, entrySet);
	}

	public void computeFixedPoint(com.google.javascript.jscomp.graph.DiGraph<N, E> graph, java.util.Set<N> entrySet) {
		int cycleCount = 0;
		long nodeCount = graph.getNodes().size();
		long maxIterations = java.lang.Math.max(((nodeCount * nodeCount) * nodeCount), 100);
		java.util.LinkedHashSet<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E>> workSet = com.google.common.collect.Sets.newLinkedHashSet();
		for (N n : entrySet) {
			workSet.add(graph.getDirectedGraphNode(n));
		}
		for (; (!(workSet.isEmpty())) && (cycleCount < maxIterations); cycleCount++) {
			com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> source = workSet.iterator().next();
			N sourceValue = source.getValue();
			workSet.remove(source);
			java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E>> outEdges = source.getOutEdges();
			for (com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E> edge : outEdges) {
				N destNode = edge.getDestination().getValue();
				if (callback.traverseEdge(sourceValue, edge.getValue(), destNode)) {
					workSet.add(edge.getDestination());
				}
			}
		}
		com.google.common.base.Preconditions.checkState((cycleCount != maxIterations), com.google.javascript.jscomp.graph.FixedPointGraphTraversal.NON_HALTING_ERROR_MSG);
	}

	public static interface EdgeCallback<Node, Edge> {
		boolean traverseEdge(Node source, Edge e, Node destination);
	}
}


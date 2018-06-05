

package com.google.javascript.jscomp.graph;


public class GraphReachability<N, E> implements com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback<N, E> {
	private final com.google.javascript.jscomp.graph.DiGraph<N, E> graph;

	private final com.google.common.base.Predicate<com.google.javascript.jscomp.graph.GraphReachability.EdgeTuple<N, E>> edgePredicate;

	public GraphReachability(com.google.javascript.jscomp.graph.DiGraph<N, E> graph) {
		this(graph, null);
	}

	public GraphReachability(com.google.javascript.jscomp.graph.DiGraph<N, E> graph, com.google.common.base.Predicate<com.google.javascript.jscomp.graph.GraphReachability.EdgeTuple<N, E>> edgePredicate) {
		this.graph = graph;
		this.edgePredicate = edgePredicate;
	}

	public void compute(N entry) {
		graph.clearNodeAnnotations();
		graph.getNode(entry).setAnnotation(com.google.javascript.jscomp.graph.GraphReachability.REACHABLE);
		com.google.javascript.jscomp.graph.FixedPointGraphTraversal.newTraversal(com.google.javascript.jscomp.graph.GraphReachability.this).computeFixedPoint(graph, entry);
	}

	public void recompute(N reachableNode) {
		com.google.javascript.jscomp.graph.GraphNode<N, E> newReachable = graph.getNode(reachableNode);
		com.google.common.base.Preconditions.checkState(((newReachable.getAnnotation()) != (com.google.javascript.jscomp.graph.GraphReachability.REACHABLE)));
		newReachable.setAnnotation(com.google.javascript.jscomp.graph.GraphReachability.REACHABLE);
		com.google.javascript.jscomp.graph.FixedPointGraphTraversal.newTraversal(com.google.javascript.jscomp.graph.GraphReachability.this).computeFixedPoint(graph, reachableNode);
	}

	@java.lang.Override
	public boolean traverseEdge(N source, E e, N destination) {
		if (((graph.getNode(source).getAnnotation()) == (com.google.javascript.jscomp.graph.GraphReachability.REACHABLE)) && (((edgePredicate) == null) || (edgePredicate.apply(new com.google.javascript.jscomp.graph.GraphReachability.EdgeTuple<N, E>(source, e, destination))))) {
			com.google.javascript.jscomp.graph.GraphNode<N, E> destNode = graph.getNode(destination);
			if ((destNode.getAnnotation()) != (com.google.javascript.jscomp.graph.GraphReachability.REACHABLE)) {
				destNode.setAnnotation(com.google.javascript.jscomp.graph.GraphReachability.REACHABLE);
				return true;
			}
		}
		return false;
	}

	public static final com.google.javascript.jscomp.graph.Annotation REACHABLE = new com.google.javascript.jscomp.graph.Annotation() {	};

	public static final class EdgeTuple<N, E> {
		public final N sourceNode;

		public final E edge;

		public final N destNode;

		public EdgeTuple(N sourceNode, E edge, N destNode) {
			this.sourceNode = sourceNode;
			this.edge = edge;
			this.destNode = destNode;
		}
	}
}


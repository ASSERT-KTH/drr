

package com.google.javascript.jscomp.graph;


public abstract class DiGraph<N, E> extends com.google.javascript.jscomp.graph.Graph<N, E> {
	public abstract java.lang.Iterable<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E>> getDirectedGraphNodes();

	public abstract java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E>> getOutEdges(N nodeValue);

	public abstract java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E>> getInEdges(N nodeValue);

	public abstract java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E>> getDirectedPredNodes(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> n);

	public abstract java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E>> getDirectedSuccNodes(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> n);

	public abstract java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E>> getDirectedPredNodes(N nodeValue);

	public abstract java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E>> getDirectedSuccNodes(N nodeValue);

	public abstract com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> createDirectedGraphNode(N nodeValue);

	public abstract com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> getDirectedGraphNode(N nodeValue);

	public abstract java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E>> getDirectedGraphEdges(N n1, N n2);

	public abstract void disconnectInDirection(N n1, N n2);

	public abstract boolean isConnectedInDirection(N n1, N n2);

	public abstract boolean isConnectedInDirection(N n1, E edgeValue, N n2);

	@java.lang.Override
	public boolean isConnected(N n1, N n2) {
		return (isConnectedInDirection(n1, n2)) || (isConnectedInDirection(n2, n1));
	}

	@java.lang.Override
	public boolean isConnected(N n1, E e, N n2) {
		return (isConnectedInDirection(n1, e, n2)) || (isConnectedInDirection(n2, e, n1));
	}

	public static interface DiGraphNode<N, E> extends com.google.javascript.jscomp.graph.GraphNode<N, E> {
		public java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E>> getOutEdges();

		public java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E>> getInEdges();
	}

	public static interface DiGraphEdge<N, E> extends com.google.javascript.jscomp.graph.Graph.GraphEdge<N, E> {
		public com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> getSource();

		public com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> getDestination();

		public void setSource(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> node);

		public void setDestination(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> node);
	}
}


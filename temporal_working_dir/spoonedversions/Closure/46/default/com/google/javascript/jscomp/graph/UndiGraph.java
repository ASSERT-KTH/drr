

package com.google.javascript.jscomp.graph;


public abstract class UndiGraph<N, E> extends com.google.javascript.jscomp.graph.Graph<N, E> {
	abstract java.util.Collection<com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode<N, E>> getUndirectedGraphNodes();

	abstract com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode<N, E> createUndirectedGraphNode(N nodeValue);

	public abstract com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode<N, E> getUndirectedGraphNode(N nodeValue);

	abstract java.util.List<com.google.javascript.jscomp.graph.UndiGraph.UndiGraphEdge<N, E>> getUndirectedGraphEdges(N n1, N n2);

	public static interface UndiGraphNode<N, E> extends com.google.javascript.jscomp.graph.GraphNode<N, E> {
		public java.util.List<com.google.javascript.jscomp.graph.UndiGraph.UndiGraphEdge<N, E>> getNeighborEdges();

		public java.util.Iterator<com.google.javascript.jscomp.graph.UndiGraph.UndiGraphEdge<N, E>> getNeighborEdgesIterator();
	}

	public static interface UndiGraphEdge<N, E> extends com.google.javascript.jscomp.graph.Graph.GraphEdge<N, E> {	}
}


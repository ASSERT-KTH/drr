

package com.google.javascript.jscomp.graph;


public interface AdjacencyGraph<N, E> {
	java.util.Collection<com.google.javascript.jscomp.graph.GraphNode<N, E>> getNodes();

	com.google.javascript.jscomp.graph.GraphNode<N, E> getNode(N value);

	com.google.javascript.jscomp.graph.SubGraph<N, E> newSubGraph();

	void clearNodeAnnotations();

	int getWeight(N value);
}


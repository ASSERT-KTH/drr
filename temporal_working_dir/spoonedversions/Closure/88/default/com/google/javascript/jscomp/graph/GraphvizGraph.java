

package com.google.javascript.jscomp.graph;


public interface GraphvizGraph {
	java.lang.String getName();

	boolean isDirected();

	java.util.List<com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizNode> getGraphvizNodes();

	java.util.List<com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizEdge> getGraphvizEdges();

	interface GraphvizNode {
		java.lang.String getId();

		java.lang.String getColor();

		java.lang.String getLabel();
	}

	interface GraphvizEdge {
		java.lang.String getNode1Id();

		java.lang.String getNode2Id();

		java.lang.String getColor();

		java.lang.String getLabel();
	}
}


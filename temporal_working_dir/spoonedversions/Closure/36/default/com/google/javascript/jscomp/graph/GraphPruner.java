

package com.google.javascript.jscomp.graph;


public class GraphPruner<N, E> {
	private final com.google.javascript.jscomp.graph.DiGraph<N, E> graph;

	public GraphPruner(com.google.javascript.jscomp.graph.DiGraph<N, E> graph) {
		this.graph = graph;
	}

	public com.google.javascript.jscomp.graph.LinkedDirectedGraph<N, E> prune(com.google.common.base.Predicate<N> keep) {
		com.google.javascript.jscomp.graph.LinkedDirectedGraph<N, E> workGraph = com.google.javascript.jscomp.graph.GraphPruner.cloneGraph(graph);
		for (com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> node : workGraph.getDirectedGraphNodes()) {
			for (com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E> inEdge : node.getInEdges()) {
				for (com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E> outEdge : node.getOutEdges()) {
					N source = inEdge.getSource().getValue();
					N dest = outEdge.getDestination().getValue();
					if (!(workGraph.isConnectedInDirection(source, dest))) {
						workGraph.connect(source, outEdge.getValue(), dest);
					}
				}
			}
		}
		com.google.javascript.jscomp.graph.LinkedDirectedGraph<N, E> resultGraph = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
		for (com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> node : workGraph.getDirectedGraphNodes()) {
			if (keep.apply(node.getValue())) {
				resultGraph.createNode(node.getValue());
				for (com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E> outEdge : node.getOutEdges()) {
					N source = node.getValue();
					N dest = outEdge.getDestination().getValue();
					if (keep.apply(dest)) {
						resultGraph.createNode(dest);
						if ((source != dest) && (!(resultGraph.isConnectedInDirection(source, dest)))) {
							resultGraph.connect(source, outEdge.getValue(), dest);
						}
					}
				}
			}
		}
		return resultGraph;
	}

	private static <N, E> com.google.javascript.jscomp.graph.LinkedDirectedGraph<N, E> cloneGraph(com.google.javascript.jscomp.graph.DiGraph<N, E> graph) {
		com.google.javascript.jscomp.graph.LinkedDirectedGraph<N, E> newGraph = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
		for (com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> node : graph.getDirectedGraphNodes()) {
			newGraph.createNode(node.getValue());
			for (com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E> outEdge : node.getOutEdges()) {
				N dest = outEdge.getDestination().getValue();
				newGraph.createNode(dest);
				newGraph.connect(node.getValue(), outEdge.getValue(), dest);
			}
		}
		return newGraph;
	}
}


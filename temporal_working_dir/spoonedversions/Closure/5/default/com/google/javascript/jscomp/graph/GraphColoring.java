

package com.google.javascript.jscomp.graph;


public abstract class GraphColoring<N, E> {
	protected N[] colorToNodeMap;

	protected final com.google.javascript.jscomp.graph.AdjacencyGraph<N, E> graph;

	public GraphColoring(com.google.javascript.jscomp.graph.AdjacencyGraph<N, E> graph) {
		this.graph = graph;
	}

	public abstract int color();

	public N getPartitionSuperNode(N node) {
		com.google.common.base.Preconditions.checkNotNull(colorToNodeMap, "No coloring founded. color() should be called first.");
		com.google.javascript.jscomp.graph.GraphColoring.Color color = graph.getNode(node).getAnnotation();
		N headNode = colorToNodeMap[color.value];
		if (headNode == null) {
			colorToNodeMap[color.value] = node;
			return node;
		}else {
			return headNode;
		}
	}

	public com.google.javascript.jscomp.graph.AdjacencyGraph<N, E> getGraph() {
		return graph;
	}

	public static class Color implements com.google.javascript.jscomp.graph.Annotation {
		int value = 0;

		Color(int value) {
			com.google.javascript.jscomp.graph.GraphColoring.Color.this.value = value;
		}

		@java.lang.Override
		public boolean equals(java.lang.Object other) {
			if (!(other instanceof com.google.javascript.jscomp.graph.GraphColoring.Color)) {
				return false;
			}else {
				return (value) == (((com.google.javascript.jscomp.graph.GraphColoring.Color) (other)).value);
			}
		}

		@java.lang.Override
		public int hashCode() {
			return value;
		}
	}

	public static class GreedyGraphColoring<N, E> extends com.google.javascript.jscomp.graph.GraphColoring<N, E> {
		private final java.util.Comparator<N> tieBreaker;

		public GreedyGraphColoring(com.google.javascript.jscomp.graph.AdjacencyGraph<N, E> graph) {
			this(graph, null);
		}

		public GreedyGraphColoring(com.google.javascript.jscomp.graph.AdjacencyGraph<N, E> graph, java.util.Comparator<N> tieBreaker) {
			super(graph);
			this.tieBreaker = tieBreaker;
		}

		@java.lang.Override
		public int color() {
			graph.clearNodeAnnotations();
			java.util.List<com.google.javascript.jscomp.graph.GraphNode<N, E>> worklist = com.google.common.collect.Lists.newArrayList(graph.getNodes());
			java.util.Collections.sort(worklist, new java.util.Comparator<com.google.javascript.jscomp.graph.GraphNode<N, E>>() {
				@java.lang.Override
				public int compare(com.google.javascript.jscomp.graph.GraphNode<N, E> o1, com.google.javascript.jscomp.graph.GraphNode<N, E> o2) {
					int result = (graph.getWeight(o2.getValue())) - (graph.getWeight(o1.getValue()));
					return (result == 0) && ((tieBreaker) != null) ? tieBreaker.compare(o1.getValue(), o2.getValue()) : result;
				}
			});
			int count = 0;
			do {
				com.google.javascript.jscomp.graph.GraphColoring.Color color = new com.google.javascript.jscomp.graph.GraphColoring.Color(count);
				com.google.javascript.jscomp.graph.SubGraph<N, E> subgraph = graph.newSubGraph();
				for (java.util.Iterator<com.google.javascript.jscomp.graph.GraphNode<N, E>> i = worklist.iterator(); i.hasNext();) {
					com.google.javascript.jscomp.graph.GraphNode<N, E> node = i.next();
					if (subgraph.isIndependentOf(node.getValue())) {
						subgraph.addNode(node.getValue());
						node.setAnnotation(color);
						i.remove();
					}
				}
				count++;
			} while (!(worklist.isEmpty()) );
			@java.lang.SuppressWarnings(value = "unchecked")
			N[] map = ((N[]) (new java.lang.Object[count]));
			colorToNodeMap = map;
			return count;
		}
	}
}


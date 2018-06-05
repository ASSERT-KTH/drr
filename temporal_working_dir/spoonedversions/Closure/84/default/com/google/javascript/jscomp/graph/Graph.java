

package com.google.javascript.jscomp.graph;


public abstract class Graph<N, E> implements com.google.javascript.jscomp.graph.AdjacencyGraph<N, E> {
	private static final class AnnotationState {
		private final com.google.javascript.jscomp.graph.Annotatable first;

		private final com.google.javascript.jscomp.graph.Annotation second;

		public AnnotationState(com.google.javascript.jscomp.graph.Annotatable annotatable, com.google.javascript.jscomp.graph.Annotation annotation) {
			this.first = annotatable;
			this.second = annotation;
		}
	}

	private static class GraphAnnotationState extends java.util.ArrayList<com.google.javascript.jscomp.graph.Graph.AnnotationState> {
		private static final long serialVersionUID = 1L;

		public GraphAnnotationState(int size) {
			super(size);
		}
	}

	private java.util.Deque<com.google.javascript.jscomp.graph.Graph.GraphAnnotationState> nodeAnnotationStack;

	private java.util.Deque<com.google.javascript.jscomp.graph.Graph.GraphAnnotationState> edgeAnnotationStack;

	public abstract void connect(N n1, E edge, N n2);

	public abstract void disconnect(N n1, N n2);

	public final void connectIfNotFound(N n1, E edge, N n2) {
		if (!(isConnected(n1, edge, n2))) {
			connect(n1, edge, n2);
		}
	}

	public abstract com.google.javascript.jscomp.graph.GraphNode<N, E> createNode(N value);

	public abstract java.util.Collection<com.google.javascript.jscomp.graph.GraphNode<N, E>> getNodes();

	public abstract java.util.List<com.google.javascript.jscomp.graph.Graph.GraphEdge<N, E>> getEdges();

	public abstract int getNodeDegree(N value);

	public int getWeight(N value) {
		return getNodeDegree(value);
	}

	public abstract java.util.List<com.google.javascript.jscomp.graph.GraphNode<N, E>> getNeighborNodes(N value);

	public abstract java.util.Iterator<com.google.javascript.jscomp.graph.GraphNode<N, E>> getNeighborNodesIterator(N value);

	public abstract java.util.List<com.google.javascript.jscomp.graph.Graph.GraphEdge<N, E>> getEdges(N n1, N n2);

	public final boolean hasNode(N n) {
		return (getNode(n)) != null;
	}

	public abstract boolean isConnected(N n1, N n2);

	public abstract boolean isConnected(N n1, E e, N n2);

	@java.lang.SuppressWarnings(value = "unchecked")
	<T extends com.google.javascript.jscomp.graph.GraphNode<N, E>> T getNodeOrFail(N val) {
		T node = ((T) (getNode(val)));
		if (node == null) {
			throw new java.lang.IllegalArgumentException((val + " does not exist in graph"));
		}
		return node;
	}

	public final void clearNodeAnnotations() {
		for (com.google.javascript.jscomp.graph.GraphNode<N, E> n : getNodes()) {
			n.setAnnotation(null);
		}
	}

	public final void clearEdgeAnnotations() {
		for (com.google.javascript.jscomp.graph.Graph.GraphEdge<N, E> e : getEdges()) {
			e.setAnnotation(null);
		}
	}

	public final void pushNodeAnnotations() {
		if ((nodeAnnotationStack) == null) {
			nodeAnnotationStack = com.google.common.collect.Lists.newLinkedList();
		}
		com.google.javascript.jscomp.graph.Graph.pushAnnotations(nodeAnnotationStack, getNodes());
	}

	public final void popNodeAnnotations() {
		com.google.common.base.Preconditions.checkNotNull(nodeAnnotationStack, "Popping node annotations without pushing.");
		com.google.javascript.jscomp.graph.Graph.popAnnotations(nodeAnnotationStack);
	}

	public final void pushEdgeAnnotations() {
		if ((edgeAnnotationStack) == null) {
			edgeAnnotationStack = com.google.common.collect.Lists.newLinkedList();
		}
		com.google.javascript.jscomp.graph.Graph.pushAnnotations(edgeAnnotationStack, getEdges());
	}

	public final void popEdgeAnnotations() {
		com.google.common.base.Preconditions.checkNotNull(edgeAnnotationStack, "Popping edge annotations without pushing.");
		com.google.javascript.jscomp.graph.Graph.popAnnotations(edgeAnnotationStack);
	}

	public interface GraphEdge<N, E> extends com.google.javascript.jscomp.graph.Annotatable {
		E getValue();

		com.google.javascript.jscomp.graph.GraphNode<N, E> getNodeA();

		com.google.javascript.jscomp.graph.GraphNode<N, E> getNodeB();
	}

	class SimpleSubGraph<N, E> implements com.google.javascript.jscomp.graph.SubGraph<N, E> {
		private com.google.javascript.jscomp.graph.Graph<N, E> graph;

		private java.util.List<com.google.javascript.jscomp.graph.GraphNode<N, E>> nodes = com.google.common.collect.Lists.newArrayList();

		SimpleSubGraph(com.google.javascript.jscomp.graph.Graph<N, E> graph) {
			com.google.javascript.jscomp.graph.Graph.SimpleSubGraph.this.graph = graph;
		}

		public boolean isIndependentOf(N value) {
			com.google.javascript.jscomp.graph.GraphNode<N, E> node = graph.getNode(value);
			for (com.google.javascript.jscomp.graph.GraphNode<N, E> n : nodes) {
				if (graph.getNeighborNodes(n.getValue()).contains(node)) {
					return false;
				}
			}
			return true;
		}

		public void addNode(N value) {
			nodes.add(graph.getNodeOrFail(value));
		}
	}

	private static void pushAnnotations(java.util.Deque<com.google.javascript.jscomp.graph.Graph.GraphAnnotationState> stack, java.util.Collection<? extends com.google.javascript.jscomp.graph.Annotatable> haveAnnotations) {
		stack.push(new com.google.javascript.jscomp.graph.Graph.GraphAnnotationState(haveAnnotations.size()));
		for (com.google.javascript.jscomp.graph.Annotatable h : haveAnnotations) {
			stack.peek().add(new com.google.javascript.jscomp.graph.Graph.AnnotationState(h, h.getAnnotation()));
			h.setAnnotation(null);
		}
	}

	private static void popAnnotations(java.util.Deque<com.google.javascript.jscomp.graph.Graph.GraphAnnotationState> stack) {
		for (com.google.javascript.jscomp.graph.Graph.AnnotationState as : stack.pop()) {
			as.first.setAnnotation(as.second);
		}
	}
}


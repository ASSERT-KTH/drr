

package com.google.javascript.jscomp.graph;


public class LinkedUndirectedGraph<N, E> extends com.google.javascript.jscomp.graph.UndiGraph<N, E> implements com.google.javascript.jscomp.graph.GraphvizGraph {
	protected final java.util.Map<N, com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode<N, E>> nodes = com.google.common.collect.Maps.newHashMap();

	public com.google.javascript.jscomp.graph.SubGraph<N, E> newSubGraph() {
		return new SimpleSubGraph<N, E>(com.google.javascript.jscomp.graph.LinkedUndirectedGraph.this);
	}

	@java.lang.Override
	public void connect(N srcValue, E edgeValue, N destValue) {
		com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode<N, E> src = getNodeOrFail(srcValue);
		com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode<N, E> dest = getNodeOrFail(destValue);
		com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge<N, E> edge = new com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge<N, E>(src, edgeValue, dest);
		src.getNeighborEdges().add(edge);
		dest.getNeighborEdges().add(edge);
	}

	@java.lang.Override
	public void disconnect(N srcValue, N destValue) {
		com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode<N, E> src = getNodeOrFail(srcValue);
		com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode<N, E> dest = getNodeOrFail(destValue);
		for (com.google.javascript.jscomp.graph.UndiGraph.UndiGraphEdge<N, E> edge : getUndirectedGraphEdges(srcValue, destValue)) {
			src.getNeighborEdges().remove(edge);
			dest.getNeighborEdges().remove(edge);
		}
	}

	@java.lang.Override
	public com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode<N, E> createUndirectedGraphNode(N nodeValue) {
		com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode<N, E> node = nodes.get(nodeValue);
		if (node == null) {
			node = new com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode<N, E>(nodeValue);
			nodes.put(nodeValue, node);
		}
		return node;
	}

	@java.lang.Override
	public java.util.List<com.google.javascript.jscomp.graph.GraphNode<N, E>> getNeighborNodes(N value) {
		com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode<N, E> uNode = getUndirectedGraphNode(value);
		java.util.List<com.google.javascript.jscomp.graph.GraphNode<N, E>> nodeList = com.google.common.collect.Lists.newArrayList();
		for (java.util.Iterator<com.google.javascript.jscomp.graph.GraphNode<N, E>> i = getNeighborNodesIterator(value); i.hasNext();) {
			nodeList.add(i.next());
		}
		return nodeList;
	}

	@java.lang.Override
	public java.util.Iterator<com.google.javascript.jscomp.graph.GraphNode<N, E>> getNeighborNodesIterator(N value) {
		com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode<N, E> uNode = getUndirectedGraphNode(value);
		com.google.common.base.Preconditions.checkNotNull(uNode, (value + " should be in the graph."));
		return ((com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode<N, E>) (uNode)).neighborIterator();
	}

	@java.lang.SuppressWarnings(value = "unchecked")
	@java.lang.Override
	public java.util.List<com.google.javascript.jscomp.graph.UndiGraph.UndiGraphEdge<N, E>> getUndirectedGraphEdges(N n1, N n2) {
		com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode<N, E> dNode1 = nodes.get(n1);
		if (dNode1 == null) {
			return null;
		}
		com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode<N, E> dNode2 = nodes.get(n2);
		if (dNode2 == null) {
			return null;
		}
		java.util.List<com.google.javascript.jscomp.graph.UndiGraph.UndiGraphEdge<N, E>> edges = com.google.common.collect.Lists.newArrayList();
		for (com.google.javascript.jscomp.graph.UndiGraph.UndiGraphEdge<N, E> outEdge : dNode1.getNeighborEdges()) {
			if (((outEdge.getNodeA()) == dNode2) || ((outEdge.getNodeB()) == dNode2)) {
				edges.add(outEdge);
			}
		}
		return edges;
	}

	@java.lang.Override
	public com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode<N, E> getUndirectedGraphNode(N nodeValue) {
		return nodes.get(nodeValue);
	}

	@java.lang.Override
	public java.util.Collection<com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode<N, E>> getUndirectedGraphNodes() {
		return java.util.Collections.<com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode<N, E>>unmodifiableCollection(nodes.values());
	}

	@java.lang.Override
	public com.google.javascript.jscomp.graph.GraphNode<N, E> createNode(N value) {
		return createUndirectedGraphNode(value);
	}

	@java.lang.Override
	public java.util.List<com.google.javascript.jscomp.graph.Graph.GraphEdge<N, E>> getEdges(N n1, N n2) {
		return java.util.Collections.<com.google.javascript.jscomp.graph.Graph.GraphEdge<N, E>>unmodifiableList(getUndirectedGraphEdges(n1, n2));
	}

	@java.lang.Override
	public com.google.javascript.jscomp.graph.GraphNode<N, E> getNode(N value) {
		return getUndirectedGraphNode(value);
	}

	@java.lang.Override
	public boolean isConnected(N n1, N n2) {
		return isConnected(n1, com.google.common.base.Predicates.<E>alwaysTrue(), n2);
	}

	@java.lang.Override
	public boolean isConnected(N n1, E e, N n2) {
		return isConnected(n1, com.google.common.base.Predicates.<E>equalTo(e), n2);
	}

	private boolean isConnected(N n1, com.google.common.base.Predicate<E> edgePredicate, N n2) {
		com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode<N, E> dNode1 = nodes.get(n1);
		if (dNode1 == null) {
			return false;
		}
		com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode<N, E> dNode2 = nodes.get(n2);
		if (dNode2 == null) {
			return false;
		}
		for (com.google.javascript.jscomp.graph.UndiGraph.UndiGraphEdge<N, E> outEdge : dNode1.getNeighborEdges()) {
			if ((((outEdge.getNodeA()) == dNode1) && ((outEdge.getNodeB()) == dNode2)) || (((outEdge.getNodeA()) == dNode2) && ((outEdge.getNodeB()) == dNode1))) {
				if (edgePredicate.apply(outEdge.getValue())) {
					return true;
				}
			}
		}
		return false;
	}

	@java.lang.Override
	public java.util.List<com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizEdge> getGraphvizEdges() {
		java.util.List<com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizEdge> edgeList = com.google.common.collect.Lists.newArrayList();
		for (com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode<N, E> node : nodes.values()) {
			for (com.google.javascript.jscomp.graph.UndiGraph.UndiGraphEdge<N, E> edge : node.getNeighborEdges()) {
				if ((edge.getNodeA()) == node) {
					edgeList.add(((com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizEdge) (edge)));
				}
			}
		}
		return edgeList;
	}

	@java.lang.Override
	public java.lang.String getName() {
		return "LinkedUndirectedGraph";
	}

	@java.lang.Override
	public java.util.List<com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizNode> getGraphvizNodes() {
		java.util.List<com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizNode> nodeList = com.google.common.collect.Lists.newArrayListWithCapacity(nodes.size());
		for (com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode<N, E> node : nodes.values()) {
			nodeList.add(node);
		}
		return nodeList;
	}

	@java.lang.Override
	public boolean isDirected() {
		return false;
	}

	@java.lang.Override
	public java.util.Collection<com.google.javascript.jscomp.graph.GraphNode<N, E>> getNodes() {
		return java.util.Collections.<com.google.javascript.jscomp.graph.GraphNode<N, E>>unmodifiableCollection(nodes.values());
	}

	@java.lang.SuppressWarnings(value = "unchecked")
	@java.lang.Override
	public java.util.List<com.google.javascript.jscomp.graph.Graph.GraphEdge<N, E>> getEdges() {
		java.util.List<com.google.javascript.jscomp.graph.Graph.GraphEdge<N, E>> result = com.google.common.collect.Lists.newArrayList();
		for (com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode<N, E> node : nodes.values()) {
			for (com.google.javascript.jscomp.graph.UndiGraph.UndiGraphEdge<N, E> edge : node.getNeighborEdges()) {
				if ((edge.getNodeA()) == node) {
					result.add(edge);
				}
			}
		}
		return result;
	}

	@java.lang.Override
	public int getNodeDegree(N value) {
		com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode<N, E> uNode = getUndirectedGraphNode(value);
		if (uNode == null) {
			throw new java.lang.IllegalArgumentException((value + " not found in graph"));
		}
		return uNode.getNeighborEdges().size();
	}

	static class LinkedUndirectedGraphNode<N, E> implements com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizNode , com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode<N, E> {
		private java.util.List<com.google.javascript.jscomp.graph.UndiGraph.UndiGraphEdge<N, E>> neighborList = com.google.common.collect.Lists.newArrayList();

		private final N value;

		private com.google.javascript.jscomp.graph.Annotation annotation;

		private int id;

		private static int totalNodes = 0;

		public LinkedUndirectedGraphNode(N nodeValue) {
			this.value = nodeValue;
			com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.this.id = (com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.totalNodes)++;
		}

		@java.lang.Override
		public java.util.List<com.google.javascript.jscomp.graph.UndiGraph.UndiGraphEdge<N, E>> getNeighborEdges() {
			return neighborList;
		}

		@java.lang.SuppressWarnings(value = "unchecked")
		@java.lang.Override
		public <A extends com.google.javascript.jscomp.graph.Annotation> A getAnnotation() {
			return ((A) (annotation));
		}

		@java.lang.Override
		public N getValue() {
			return value;
		}

		@java.lang.Override
		public void setAnnotation(com.google.javascript.jscomp.graph.Annotation data) {
			annotation = data;
		}

		@java.lang.Override
		public java.lang.String getColor() {
			return "white";
		}

		@java.lang.Override
		public java.lang.String getId() {
			return "LDN" + (id);
		}

		@java.lang.Override
		public java.lang.String getLabel() {
			return (value) != null ? value.toString() : "null";
		}

		public java.util.Iterator<com.google.javascript.jscomp.graph.GraphNode<N, E>> neighborIterator() {
			return new NeighborIterator();
		}

		private class NeighborIterator implements java.util.Iterator<com.google.javascript.jscomp.graph.GraphNode<N, E>> {
			private final java.util.Iterator<com.google.javascript.jscomp.graph.UndiGraph.UndiGraphEdge<N, E>> edgeIterator = neighborList.iterator();

			@java.lang.Override
			public boolean hasNext() {
				return edgeIterator.hasNext();
			}

			@java.lang.Override
			public com.google.javascript.jscomp.graph.GraphNode<N, E> next() {
				com.google.javascript.jscomp.graph.UndiGraph.UndiGraphEdge<N, E> edge = edgeIterator.next();
				if ((edge.getNodeA()) == (com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.this)) {
					return edge.getNodeB();
				}else {
					return edge.getNodeA();
				}
			}

			@java.lang.Override
			public void remove() {
				throw new java.lang.UnsupportedOperationException("Remove not supported.");
			}
		}
	}

	static class LinkedUndirectedGraphEdge<N, E> implements com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizEdge , com.google.javascript.jscomp.graph.UndiGraph.UndiGraphEdge<N, E> {
		private com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode<N, E> nodeA;

		private com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode<N, E> nodeB;

		protected final E value;

		protected com.google.javascript.jscomp.graph.Annotation annotation;

		public LinkedUndirectedGraphEdge(com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode<N, E> nodeA, E edgeValue, com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode<N, E> nodeB) {
			this.value = edgeValue;
			com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge.this.nodeA = nodeA;
			com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge.this.nodeB = nodeB;
		}

		@java.lang.Override
		public E getValue() {
			return value;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.graph.GraphNode<N, E> getNodeA() {
			return nodeA;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.graph.GraphNode<N, E> getNodeB() {
			return nodeB;
		}

		@java.lang.SuppressWarnings(value = "unchecked")
		@java.lang.Override
		public <A extends com.google.javascript.jscomp.graph.Annotation> A getAnnotation() {
			return ((A) (annotation));
		}

		@java.lang.Override
		public void setAnnotation(com.google.javascript.jscomp.graph.Annotation data) {
			annotation = data;
		}

		@java.lang.Override
		public java.lang.String getColor() {
			return "black";
		}

		@java.lang.Override
		public java.lang.String getLabel() {
			return (value) != null ? value.toString() : "null";
		}

		@java.lang.SuppressWarnings(value = "unchecked")
		@java.lang.Override
		public java.lang.String getNode1Id() {
			return ((com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode<N, E>) (nodeA)).getId();
		}

		@java.lang.SuppressWarnings(value = "unchecked")
		@java.lang.Override
		public java.lang.String getNode2Id() {
			return ((com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode<N, E>) (nodeB)).getId();
		}

		@java.lang.Override
		public java.lang.String toString() {
			return ((nodeA.toString()) + " -- ") + (nodeB.toString());
		}
	}
}




package com.google.javascript.jscomp.graph;


public class LinkedDirectedGraph<N, E> extends com.google.javascript.jscomp.graph.DiGraph<N, E> implements com.google.javascript.jscomp.graph.GraphvizGraph {
	protected final java.util.Map<N, com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode<N, E>> nodes = com.google.common.collect.Maps.newHashMap();

	public com.google.javascript.jscomp.graph.SubGraph<N, E> newSubGraph() {
		return new SimpleSubGraph<N, E>(com.google.javascript.jscomp.graph.LinkedDirectedGraph.this);
	}

	public static <N, E> com.google.javascript.jscomp.graph.LinkedDirectedGraph<N, E> createWithoutAnnotations() {
		return new com.google.javascript.jscomp.graph.LinkedDirectedGraph<N, E>(false, false);
	}

	public static <N, E> com.google.javascript.jscomp.graph.LinkedDirectedGraph<N, E> createWithNodeAnnotations() {
		return new com.google.javascript.jscomp.graph.LinkedDirectedGraph<N, E>(true, false);
	}

	public static <N, E> com.google.javascript.jscomp.graph.LinkedDirectedGraph<N, E> createWithEdgeAnnotations() {
		return new com.google.javascript.jscomp.graph.LinkedDirectedGraph<N, E>(false, true);
	}

	public static <N, E> com.google.javascript.jscomp.graph.LinkedDirectedGraph<N, E> create() {
		return new com.google.javascript.jscomp.graph.LinkedDirectedGraph<N, E>(true, true);
	}

	private final boolean useNodeAnnotations;

	private final boolean useEdgeAnnotations;

	protected LinkedDirectedGraph(boolean useNodeAnnotations, boolean useEdgeAnnotations) {
		this.useNodeAnnotations = useNodeAnnotations;
		this.useEdgeAnnotations = useEdgeAnnotations;
	}

	@java.lang.Override
	public void connect(N srcValue, E edgeValue, N destValue) {
		com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode<N, E> src = getNodeOrFail(srcValue);
		com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode<N, E> dest = getNodeOrFail(destValue);
		com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphEdge<N, E> edge = useEdgeAnnotations ? new com.google.javascript.jscomp.graph.LinkedDirectedGraph.AnnotatedLinkedDirectedGraphEdge<N, E>(src, edgeValue, dest) : new com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphEdge<N, E>(src, edgeValue, dest);
		src.getOutEdges().add(edge);
		dest.getInEdges().add(edge);
	}

	@java.lang.Override
	public void disconnect(N n1, N n2) {
		disconnectInDirection(n1, n2);
		disconnectInDirection(n2, n1);
	}

	@java.lang.Override
	public void disconnectInDirection(N srcValue, N destValue) {
		com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode<N, E> src = getNodeOrFail(srcValue);
		com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode<N, E> dest = getNodeOrFail(destValue);
		for (com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<?, E> edge : getDirectedGraphEdges(srcValue, destValue)) {
			src.getOutEdges().remove(edge);
			dest.getInEdges().remove(edge);
		}
	}

	@java.lang.Override
	public java.lang.Iterable<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E>> getDirectedGraphNodes() {
		return java.util.Collections.<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E>>unmodifiableCollection(nodes.values());
	}

	@java.lang.Override
	public com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> getDirectedGraphNode(N nodeValue) {
		return nodes.get(nodeValue);
	}

	@java.lang.Override
	public com.google.javascript.jscomp.graph.GraphNode<N, E> getNode(N nodeValue) {
		return getDirectedGraphNode(nodeValue);
	}

	@java.lang.Override
	public java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E>> getInEdges(N nodeValue) {
		com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode<N, E> node = getNodeOrFail(nodeValue);
		return java.util.Collections.<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E>>unmodifiableList(node.getInEdges());
	}

	@java.lang.Override
	public java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E>> getOutEdges(N nodeValue) {
		com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode<N, E> node = getNodeOrFail(nodeValue);
		return java.util.Collections.<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E>>unmodifiableList(node.getOutEdges());
	}

	@java.lang.Override
	public com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> createDirectedGraphNode(N nodeValue) {
		com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode<N, E> node = nodes.get(nodeValue);
		if (node == null) {
			node = (useNodeAnnotations) ? new com.google.javascript.jscomp.graph.LinkedDirectedGraph.AnnotatedLinkedDirectedGraphNode<N, E>(nodeValue) : new com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode<N, E>(nodeValue);
			nodes.put(nodeValue, node);
		}
		return node;
	}

	@java.lang.Override
	public java.util.List<com.google.javascript.jscomp.graph.Graph.GraphEdge<N, E>> getEdges(N n1, N n2) {
		java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E>> forwardEdges = getDirectedGraphEdges(n1, n2);
		java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E>> backwardEdges = getDirectedGraphEdges(n2, n1);
		int totalSize = (forwardEdges.size()) + (backwardEdges.size());
		java.util.List<com.google.javascript.jscomp.graph.Graph.GraphEdge<N, E>> edges = com.google.common.collect.Lists.newArrayListWithCapacity(totalSize);
		edges.addAll(forwardEdges);
		edges.addAll(backwardEdges);
		return edges;
	}

	@java.lang.Override
	public com.google.javascript.jscomp.graph.Graph.GraphEdge<N, E> getFirstEdge(N n1, N n2) {
		com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> dNode1 = getNodeOrFail(n1);
		com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> dNode2 = getNodeOrFail(n2);
		for (com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E> outEdge : dNode1.getOutEdges()) {
			if ((outEdge.getDestination()) == dNode2) {
				return outEdge;
			}
		}
		for (com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E> outEdge : dNode2.getOutEdges()) {
			if ((outEdge.getDestination()) == dNode1) {
				return outEdge;
			}
		}
		return null;
	}

	@java.lang.Override
	public com.google.javascript.jscomp.graph.GraphNode<N, E> createNode(N value) {
		return createDirectedGraphNode(value);
	}

	@java.lang.Override
	public java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E>> getDirectedGraphEdges(N n1, N n2) {
		com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> dNode1 = getNodeOrFail(n1);
		com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> dNode2 = getNodeOrFail(n2);
		java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E>> edges = com.google.common.collect.Lists.newArrayList();
		for (com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E> outEdge : dNode1.getOutEdges()) {
			if ((outEdge.getDestination()) == dNode2) {
				edges.add(outEdge);
			}
		}
		return edges;
	}

	@java.lang.Override
	public boolean isConnectedInDirection(N n1, N n2) {
		return isConnectedInDirection(n1, com.google.common.base.Predicates.<E>alwaysTrue(), n2);
	}

	@java.lang.Override
	public boolean isConnectedInDirection(N n1, E edgeValue, N n2) {
		return isConnectedInDirection(n1, com.google.common.base.Predicates.equalTo(edgeValue), n2);
	}

	private boolean isConnectedInDirection(N n1, com.google.common.base.Predicate<E> edgeMatcher, N n2) {
		com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> dNode1 = getNodeOrFail(n1);
		com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> dNode2 = getNodeOrFail(n2);
		for (com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E> outEdge : dNode1.getOutEdges()) {
			if (((outEdge.getDestination()) == dNode2) && (edgeMatcher.apply(outEdge.getValue()))) {
				return true;
			}
		}
		return false;
	}

	@java.lang.Override
	public java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E>> getDirectedPredNodes(N nodeValue) {
		return getDirectedPredNodes(nodes.get(nodeValue));
	}

	@java.lang.Override
	public java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E>> getDirectedSuccNodes(N nodeValue) {
		return getDirectedSuccNodes(nodes.get(nodeValue));
	}

	@java.lang.Override
	public java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E>> getDirectedPredNodes(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> dNode) {
		if (dNode == null) {
			throw new java.lang.IllegalArgumentException((dNode + " is null"));
		}
		java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E>> nodeList = com.google.common.collect.Lists.newArrayList();
		for (com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E> edge : dNode.getInEdges()) {
			nodeList.add(edge.getSource());
		}
		return nodeList;
	}

	@java.lang.Override
	public java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E>> getDirectedSuccNodes(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> dNode) {
		if (dNode == null) {
			throw new java.lang.IllegalArgumentException((dNode + " is null"));
		}
		java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E>> nodeList = com.google.common.collect.Lists.newArrayList();
		for (com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E> edge : dNode.getOutEdges()) {
			nodeList.add(edge.getDestination());
		}
		return nodeList;
	}

	@java.lang.Override
	public java.util.List<com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizEdge> getGraphvizEdges() {
		java.util.List<com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizEdge> edgeList = com.google.common.collect.Lists.newArrayList();
		for (com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode<N, E> node : nodes.values()) {
			for (com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E> edge : node.getOutEdges()) {
				edgeList.add(((com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphEdge<N, E>) (edge)));
			}
		}
		return edgeList;
	}

	@java.lang.Override
	public java.util.List<com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizNode> getGraphvizNodes() {
		java.util.List<com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizNode> nodeList = com.google.common.collect.Lists.newArrayListWithCapacity(nodes.size());
		for (com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode<N, E> node : nodes.values()) {
			nodeList.add(node);
		}
		return nodeList;
	}

	@java.lang.Override
	public java.lang.String getName() {
		return "LinkedGraph";
	}

	@java.lang.Override
	public boolean isDirected() {
		return true;
	}

	@java.lang.Override
	public java.util.Collection<com.google.javascript.jscomp.graph.GraphNode<N, E>> getNodes() {
		return java.util.Collections.<com.google.javascript.jscomp.graph.GraphNode<N, E>>unmodifiableCollection(nodes.values());
	}

	@java.lang.Override
	public java.util.List<com.google.javascript.jscomp.graph.GraphNode<N, E>> getNeighborNodes(N value) {
		com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> node = getDirectedGraphNode(value);
		return getNeighborNodes(node);
	}

	public java.util.List<com.google.javascript.jscomp.graph.GraphNode<N, E>> getNeighborNodes(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> node) {
		java.util.List<com.google.javascript.jscomp.graph.GraphNode<N, E>> result = com.google.common.collect.Lists.newArrayList();
		for (java.util.Iterator<com.google.javascript.jscomp.graph.GraphNode<N, E>> i = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode<N, E>) (node)).neighborIterator(); i.hasNext();) {
			result.add(i.next());
		}
		return result;
	}

	@java.lang.Override
	public java.util.Iterator<com.google.javascript.jscomp.graph.GraphNode<N, E>> getNeighborNodesIterator(N value) {
		com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode<N, E> node = nodes.get(value);
		com.google.common.base.Preconditions.checkNotNull(node);
		return node.neighborIterator();
	}

	@java.lang.Override
	public java.util.List<com.google.javascript.jscomp.graph.Graph.GraphEdge<N, E>> getEdges() {
		java.util.List<com.google.javascript.jscomp.graph.Graph.GraphEdge<N, E>> result = com.google.common.collect.Lists.newArrayList();
		for (com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> node : nodes.values()) {
			for (com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E> edge : node.getOutEdges()) {
				result.add(edge);
			}
		}
		return java.util.Collections.unmodifiableList(result);
	}

	@java.lang.Override
	public int getNodeDegree(N value) {
		com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> node = getNodeOrFail(value);
		return (node.getInEdges().size()) + (node.getOutEdges().size());
	}

	static class LinkedDirectedGraphNode<N, E> implements com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> , com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizNode {
		java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E>> inEdgeList = com.google.common.collect.Lists.newArrayList();

		java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E>> outEdgeList = com.google.common.collect.Lists.newArrayList();

		protected final N value;

		LinkedDirectedGraphNode(N nodeValue) {
			this.value = nodeValue;
		}

		@java.lang.Override
		public N getValue() {
			return value;
		}

		@java.lang.Override
		public <A extends com.google.javascript.jscomp.graph.Annotation> A getAnnotation() {
			throw new java.lang.UnsupportedOperationException("Graph initialized with node annotations turned off");
		}

		@java.lang.Override
		public void setAnnotation(com.google.javascript.jscomp.graph.Annotation data) {
			throw new java.lang.UnsupportedOperationException("Graph initialized with node annotations turned off");
		}

		@java.lang.Override
		public java.lang.String getColor() {
			return "white";
		}

		@java.lang.Override
		public java.lang.String getId() {
			return "LDN" + (hashCode());
		}

		@java.lang.Override
		public java.lang.String getLabel() {
			return (value) != null ? value.toString() : "null";
		}

		@java.lang.Override
		public java.lang.String toString() {
			return getLabel();
		}

		@java.lang.Override
		public java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E>> getInEdges() {
			return inEdgeList;
		}

		@java.lang.Override
		public java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E>> getOutEdges() {
			return outEdgeList;
		}

		private java.util.Iterator<com.google.javascript.jscomp.graph.GraphNode<N, E>> neighborIterator() {
			return new NeighborIterator();
		}

		private class NeighborIterator implements java.util.Iterator<com.google.javascript.jscomp.graph.GraphNode<N, E>> {
			private final java.util.Iterator<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E>> in = inEdgeList.iterator();

			private final java.util.Iterator<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E>> out = outEdgeList.iterator();

			@java.lang.Override
			public boolean hasNext() {
				return (in.hasNext()) || (out.hasNext());
			}

			@java.lang.Override
			public com.google.javascript.jscomp.graph.GraphNode<N, E> next() {
				boolean isOut = !(in.hasNext());
				java.util.Iterator<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E>> curIterator = isOut ? out : in;
				com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E> s = curIterator.next();
				return isOut ? s.getDestination() : s.getSource();
			}

			@java.lang.Override
			public void remove() {
				throw new java.lang.UnsupportedOperationException("Remove not supported.");
			}
		}
	}

	static class AnnotatedLinkedDirectedGraphNode<N, E> extends com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode<N, E> {
		protected com.google.javascript.jscomp.graph.Annotation annotation;

		AnnotatedLinkedDirectedGraphNode(N nodeValue) {
			super(nodeValue);
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
	}

	static class LinkedDirectedGraphEdge<N, E> implements com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<N, E> , com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizEdge {
		private com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> sourceNode;

		private com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> destNode;

		protected final E value;

		LinkedDirectedGraphEdge(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> sourceNode, E edgeValue, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> destNode) {
			this.value = edgeValue;
			com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphEdge.this.sourceNode = sourceNode;
			com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphEdge.this.destNode = destNode;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> getSource() {
			return sourceNode;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> getDestination() {
			return destNode;
		}

		@java.lang.Override
		public void setDestination(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> node) {
			destNode = node;
		}

		@java.lang.Override
		public void setSource(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> node) {
			sourceNode = node;
		}

		@java.lang.Override
		public E getValue() {
			return value;
		}

		@java.lang.Override
		public <A extends com.google.javascript.jscomp.graph.Annotation> A getAnnotation() {
			throw new java.lang.UnsupportedOperationException("Graph initialized with edge annotations turned off");
		}

		@java.lang.Override
		public void setAnnotation(com.google.javascript.jscomp.graph.Annotation data) {
			throw new java.lang.UnsupportedOperationException("Graph initialized with edge annotations turned off");
		}

		@java.lang.Override
		public java.lang.String getColor() {
			return "black";
		}

		@java.lang.Override
		public java.lang.String getLabel() {
			return (value) != null ? value.toString() : "null";
		}

		@java.lang.Override
		public java.lang.String getNode1Id() {
			return ((com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode<N, E>) (sourceNode)).getId();
		}

		@java.lang.Override
		public java.lang.String getNode2Id() {
			return ((com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode<N, E>) (destNode)).getId();
		}

		@java.lang.Override
		public java.lang.String toString() {
			return ((sourceNode.toString()) + " -> ") + (destNode.toString());
		}

		@java.lang.Override
		public com.google.javascript.jscomp.graph.GraphNode<N, E> getNodeA() {
			return sourceNode;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.graph.GraphNode<N, E> getNodeB() {
			return destNode;
		}
	}

	static class AnnotatedLinkedDirectedGraphEdge<N, E> extends com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphEdge<N, E> {
		protected com.google.javascript.jscomp.graph.Annotation annotation;

		AnnotatedLinkedDirectedGraphEdge(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> sourceNode, E edgeValue, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<N, E> destNode) {
			super(sourceNode, edgeValue, destNode);
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
	}
}


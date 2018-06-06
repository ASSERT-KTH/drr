

package com.google.javascript.jscomp.graph;


public class StandardUnionFind<E> implements com.google.javascript.jscomp.graph.UnionFind<E> , java.io.Serializable {
	private static final long serialVersionUID = -1L;

	private final java.util.Map<E, com.google.javascript.jscomp.graph.StandardUnionFind.Node<E>> elmap = com.google.common.collect.Maps.newLinkedHashMap();

	public StandardUnionFind() {
	}

	public StandardUnionFind(com.google.javascript.jscomp.graph.UnionFind<E> other) {
		for (E elem : other.elements()) {
			union(elem, other.find(elem));
		}
	}

	@java.lang.Override
	public void add(E e) {
		union(e, e);
	}

	@java.lang.Override
	public E union(E a, E b) {
		com.google.javascript.jscomp.graph.StandardUnionFind.Node<E> nodeA = findRootOrCreateNode(a);
		com.google.javascript.jscomp.graph.StandardUnionFind.Node<E> nodeB = findRootOrCreateNode(b);
		if (nodeA == nodeB) {
			return nodeA.element;
		}
		if ((nodeA.rank) > (nodeB.rank)) {
			nodeB.parent = nodeA;
			nodeA.size += nodeB.size;
			return nodeA.element;
		}
		nodeA.parent = nodeB;
		if ((nodeA.rank) == (nodeB.rank)) {
			(nodeB.rank)++;
		}
		nodeB.size += nodeA.size;
		return nodeB.element;
	}

	@java.lang.Override
	public E find(E e) {
		com.google.common.base.Preconditions.checkArgument(elmap.containsKey(e), "Element does not exist: %s", e);
		return findRoot(elmap.get(e)).element;
	}

	@java.lang.Override
	public boolean areEquivalent(E a, E b) {
		E aRep = find(a);
		E bRep = find(b);
		return aRep == bRep;
	}

	@java.lang.Override
	public java.util.Set<E> elements() {
		return java.util.Collections.unmodifiableSet(elmap.keySet());
	}

	@java.lang.Override
	public java.util.Collection<java.util.Set<E>> allEquivalenceClasses() {
		java.util.Map<com.google.javascript.jscomp.graph.StandardUnionFind.Node<E>, com.google.common.collect.ImmutableSet.Builder<E>> groupsTmp = com.google.common.collect.Maps.newHashMap();
		for (com.google.javascript.jscomp.graph.StandardUnionFind.Node<E> elem : elmap.values()) {
			com.google.javascript.jscomp.graph.StandardUnionFind.Node<E> root = findRoot(elem);
			com.google.common.collect.ImmutableSet.Builder<E> builder = groupsTmp.get(root);
			if (builder == null) {
				builder = com.google.common.collect.ImmutableSet.builder();
				groupsTmp.put(root, builder);
			}
			builder.add(elem.element);
		}
		com.google.common.collect.ImmutableList.Builder<java.util.Set<E>> result = com.google.common.collect.ImmutableList.builder();
		for (com.google.common.collect.ImmutableSet.Builder<E> group : groupsTmp.values()) {
			result.add(group.build());
		}
		return result.build();
	}

	private com.google.javascript.jscomp.graph.StandardUnionFind.Node<E> findRootOrCreateNode(E e) {
		com.google.javascript.jscomp.graph.StandardUnionFind.Node<E> node = elmap.get(e);
		if (node != null) {
			return findRoot(node);
		}
		node = new com.google.javascript.jscomp.graph.StandardUnionFind.Node<E>(e);
		elmap.put(e, node);
		return node;
	}

	private com.google.javascript.jscomp.graph.StandardUnionFind.Node<E> findRoot(com.google.javascript.jscomp.graph.StandardUnionFind.Node<E> node) {
		if ((node.parent) != node) {
			node.parent = findRoot(node.parent);
		}
		return node.parent;
	}

	@java.lang.Override
	public java.util.Set<E> findAll(final E value) {
		com.google.common.base.Preconditions.checkArgument(elmap.containsKey(value), ("Element does not exist: " + value));
		final com.google.common.base.Predicate<java.lang.Object> isSameRoot = new com.google.common.base.Predicate<java.lang.Object>() {
			com.google.javascript.jscomp.graph.StandardUnionFind.Node<E> nodeForValue = elmap.get(value);

			@java.lang.Override
			public boolean apply(@javax.annotation.Nullable
			java.lang.Object b) {
				if (com.google.common.base.Objects.equal(value, b)) {
					return true;
				}
				com.google.javascript.jscomp.graph.StandardUnionFind.Node<E> nodeForB = elmap.get(b);
				if (nodeForB == null) {
					return false;
				}
				nodeForValue = findRoot(nodeForValue);
				return (findRoot(nodeForB)) == (nodeForValue);
			}
		};
		return new java.util.AbstractSet<E>() {
			@java.lang.Override
			public boolean contains(java.lang.Object o) {
				return isSameRoot.apply(o);
			}

			@java.lang.Override
			public java.util.Iterator<E> iterator() {
				return com.google.common.collect.Iterators.filter(elmap.keySet().iterator(), isSameRoot);
			}

			@java.lang.Override
			public int size() {
				return findRoot(elmap.get(value)).size;
			}
		};
	}

	private static class Node<E> {
		com.google.javascript.jscomp.graph.StandardUnionFind.Node<E> parent;

		final E element;

		int rank = 0;

		int size = 1;

		Node(E element) {
			com.google.javascript.jscomp.graph.StandardUnionFind.Node.this.parent = com.google.javascript.jscomp.graph.StandardUnionFind.Node.this;
			this.element = element;
		}
	}
}


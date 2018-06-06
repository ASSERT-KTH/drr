

package com.google.javascript.jscomp.graph;


public interface UnionFind<E> {
	public void add(E e);

	public E union(E a, E b);

	public E find(E e);

	public boolean areEquivalent(E a, E b);

	public java.util.Set<E> elements();

	public java.util.Collection<java.util.Set<E>> allEquivalenceClasses();

	public java.util.Set<E> findAll(final E value);
}


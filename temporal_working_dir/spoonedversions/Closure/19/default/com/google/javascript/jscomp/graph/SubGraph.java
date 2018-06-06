

package com.google.javascript.jscomp.graph;


public interface SubGraph<N, E> {
	boolean isIndependentOf(N node);

	void addNode(N value);
}


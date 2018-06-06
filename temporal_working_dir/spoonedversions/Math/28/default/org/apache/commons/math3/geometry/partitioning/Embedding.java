

package org.apache.commons.math3.geometry.partitioning;


public interface Embedding<S extends org.apache.commons.math3.geometry.Space, T extends org.apache.commons.math3.geometry.Space> {
	org.apache.commons.math3.geometry.Vector<T> toSubSpace(org.apache.commons.math3.geometry.Vector<S> point);

	org.apache.commons.math3.geometry.Vector<S> toSpace(org.apache.commons.math3.geometry.Vector<T> point);
}


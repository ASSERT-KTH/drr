

package org.apache.commons.math.geometry.partitioning;


public interface Embedding<S extends org.apache.commons.math.geometry.Space, T extends org.apache.commons.math.geometry.Space> {
	org.apache.commons.math.geometry.Vector<T> toSubSpace(org.apache.commons.math.geometry.Vector<S> point);

	org.apache.commons.math.geometry.Vector<S> toSpace(org.apache.commons.math.geometry.Vector<T> point);
}


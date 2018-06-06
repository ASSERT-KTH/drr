

package org.apache.commons.math3.geometry.partitioning;


public interface Transform<S extends org.apache.commons.math3.geometry.Space, T extends org.apache.commons.math3.geometry.Space> {
	org.apache.commons.math3.geometry.Vector<S> apply(org.apache.commons.math3.geometry.Vector<S> point);

	org.apache.commons.math3.geometry.partitioning.Hyperplane<S> apply(org.apache.commons.math3.geometry.partitioning.Hyperplane<S> hyperplane);

	org.apache.commons.math3.geometry.partitioning.SubHyperplane<T> apply(org.apache.commons.math3.geometry.partitioning.SubHyperplane<T> sub, org.apache.commons.math3.geometry.partitioning.Hyperplane<S> original, org.apache.commons.math3.geometry.partitioning.Hyperplane<S> transformed);
}




package org.apache.commons.math3.geometry.partitioning;


public interface Hyperplane<S extends org.apache.commons.math3.geometry.Space> {
	org.apache.commons.math3.geometry.partitioning.Hyperplane<S> copySelf();

	double getOffset(org.apache.commons.math3.geometry.Vector<S> point);

	boolean sameOrientationAs(org.apache.commons.math3.geometry.partitioning.Hyperplane<S> other);

	org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> wholeHyperplane();

	org.apache.commons.math3.geometry.partitioning.Region<S> wholeSpace();
}


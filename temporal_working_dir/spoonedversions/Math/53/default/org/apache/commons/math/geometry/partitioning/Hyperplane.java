

package org.apache.commons.math.geometry.partitioning;


public interface Hyperplane<S extends org.apache.commons.math.geometry.Space> {
	org.apache.commons.math.geometry.partitioning.Hyperplane<S> copySelf();

	double getOffset(org.apache.commons.math.geometry.Vector<S> point);

	boolean sameOrientationAs(org.apache.commons.math.geometry.partitioning.Hyperplane<S> other);

	org.apache.commons.math.geometry.partitioning.SubHyperplane<S> wholeHyperplane();

	org.apache.commons.math.geometry.partitioning.Region<S> wholeSpace();
}


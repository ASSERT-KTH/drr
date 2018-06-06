

package org.apache.commons.math.geometry.partitioning;


public interface Region<S extends org.apache.commons.math.geometry.Space> {
	public static enum Location {
INSIDE, OUTSIDE, BOUNDARY;	}

	org.apache.commons.math.geometry.partitioning.Region<S> buildNew(org.apache.commons.math.geometry.partitioning.BSPTree<S> newTree);

	org.apache.commons.math.geometry.partitioning.Region<S> copySelf();

	boolean isEmpty();

	boolean isEmpty(final org.apache.commons.math.geometry.partitioning.BSPTree<S> node);

	boolean contains(final org.apache.commons.math.geometry.partitioning.Region<S> region);

	org.apache.commons.math.geometry.partitioning.Region.Location checkPoint(final org.apache.commons.math.geometry.Vector<S> point);

	org.apache.commons.math.geometry.partitioning.BSPTree<S> getTree(final boolean includeBoundaryAttributes);

	double getBoundarySize();

	double getSize();

	org.apache.commons.math.geometry.Vector<S> getBarycenter();

	org.apache.commons.math.geometry.partitioning.Side side(final org.apache.commons.math.geometry.partitioning.Hyperplane<S> hyperplane);

	org.apache.commons.math.geometry.partitioning.SubHyperplane<S> intersection(final org.apache.commons.math.geometry.partitioning.SubHyperplane<S> sub);
}


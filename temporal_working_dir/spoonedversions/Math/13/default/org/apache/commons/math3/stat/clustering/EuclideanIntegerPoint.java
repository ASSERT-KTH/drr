

package org.apache.commons.math3.stat.clustering;


public class EuclideanIntegerPoint implements java.io.Serializable , org.apache.commons.math3.stat.clustering.Clusterable<org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint> {
	private static final long serialVersionUID = 3946024775784901369L;

	private final int[] point;

	public EuclideanIntegerPoint(final int[] point) {
		this.point = point;
	}

	public int[] getPoint() {
		return point;
	}

	public double distanceFrom(final org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint p) {
		return org.apache.commons.math3.util.MathArrays.distance(point, p.getPoint());
	}

	public org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint centroidOf(final java.util.Collection<org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint> points) {
		int[] centroid = new int[getPoint().length];
		for (org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint p : points) {
			for (int i = 0; i < (centroid.length); i++) {
				centroid[i] += p.getPoint()[i];
			}
		}
		for (int i = 0; i < (centroid.length); i++) {
			centroid[i] /= points.size();
		}
		return new org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint(centroid);
	}

	@java.lang.Override
	public boolean equals(final java.lang.Object other) {
		if (!(other instanceof org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint)) {
			return false;
		}
		return java.util.Arrays.equals(point, ((org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint) (other)).point);
	}

	@java.lang.Override
	public int hashCode() {
		return java.util.Arrays.hashCode(point);
	}

	@java.lang.Override
	public java.lang.String toString() {
		return java.util.Arrays.toString(point);
	}
}


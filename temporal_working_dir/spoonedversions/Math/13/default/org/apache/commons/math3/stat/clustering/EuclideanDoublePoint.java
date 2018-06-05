

package org.apache.commons.math3.stat.clustering;


public class EuclideanDoublePoint implements java.io.Serializable , org.apache.commons.math3.stat.clustering.Clusterable<org.apache.commons.math3.stat.clustering.EuclideanDoublePoint> {
	private static final long serialVersionUID = 8026472786091227632L;

	private final double[] point;

	public EuclideanDoublePoint(final double[] point) {
		this.point = point;
	}

	public org.apache.commons.math3.stat.clustering.EuclideanDoublePoint centroidOf(final java.util.Collection<org.apache.commons.math3.stat.clustering.EuclideanDoublePoint> points) {
		final double[] centroid = new double[getPoint().length];
		for (final org.apache.commons.math3.stat.clustering.EuclideanDoublePoint p : points) {
			for (int i = 0; i < (centroid.length); i++) {
				centroid[i] += p.getPoint()[i];
			}
		}
		for (int i = 0; i < (centroid.length); i++) {
			centroid[i] /= points.size();
		}
		return new org.apache.commons.math3.stat.clustering.EuclideanDoublePoint(centroid);
	}

	public double distanceFrom(final org.apache.commons.math3.stat.clustering.EuclideanDoublePoint p) {
		return org.apache.commons.math3.util.MathArrays.distance(point, p.getPoint());
	}

	@java.lang.Override
	public boolean equals(final java.lang.Object other) {
		if (!(other instanceof org.apache.commons.math3.stat.clustering.EuclideanDoublePoint)) {
			return false;
		}
		return java.util.Arrays.equals(point, ((org.apache.commons.math3.stat.clustering.EuclideanDoublePoint) (other)).point);
	}

	public double[] getPoint() {
		return point;
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


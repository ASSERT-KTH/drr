

package org.apache.commons.math.geometry.euclidean.threed;


public class Line implements org.apache.commons.math.geometry.partitioning.Embedding<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D, org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> {
	private org.apache.commons.math.geometry.euclidean.threed.Vector3D direction;

	private org.apache.commons.math.geometry.euclidean.threed.Vector3D zero;

	public Line(final org.apache.commons.math.geometry.euclidean.threed.Vector3D p, final org.apache.commons.math.geometry.euclidean.threed.Vector3D direction) {
		reset(p, direction);
	}

	public void reset(final org.apache.commons.math.geometry.euclidean.threed.Vector3D p, final org.apache.commons.math.geometry.euclidean.threed.Vector3D dir) {
		final double norm = dir.getNorm();
		if (norm == 0.0) {
			throw new java.lang.IllegalArgumentException("null norm");
		}
		org.apache.commons.math.geometry.euclidean.threed.Line.this.direction = new org.apache.commons.math.geometry.euclidean.threed.Vector3D((1.0 / norm), dir);
		zero = new org.apache.commons.math.geometry.euclidean.threed.Vector3D(1.0, p, (-(org.apache.commons.math.geometry.euclidean.threed.Vector3D.dotProduct(p, org.apache.commons.math.geometry.euclidean.threed.Line.this.direction))), org.apache.commons.math.geometry.euclidean.threed.Line.this.direction);
	}

	public org.apache.commons.math.geometry.euclidean.threed.Line revert() {
		return new org.apache.commons.math.geometry.euclidean.threed.Line(zero, direction.negate());
	}

	public org.apache.commons.math.geometry.euclidean.threed.Vector3D getDirection() {
		return direction;
	}

	public org.apache.commons.math.geometry.euclidean.threed.Vector3D getOrigin() {
		return zero;
	}

	public org.apache.commons.math.geometry.euclidean.oned.Vector1D toSubSpace(final org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D> point) {
		org.apache.commons.math.geometry.euclidean.threed.Vector3D p3 = ((org.apache.commons.math.geometry.euclidean.threed.Vector3D) (point));
		return new org.apache.commons.math.geometry.euclidean.oned.Vector1D(org.apache.commons.math.geometry.euclidean.threed.Vector3D.dotProduct(p3.subtract(zero), direction));
	}

	public org.apache.commons.math.geometry.euclidean.threed.Vector3D toSpace(final org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> point) {
		org.apache.commons.math.geometry.euclidean.oned.Vector1D p1 = ((org.apache.commons.math.geometry.euclidean.oned.Vector1D) (point));
		return new org.apache.commons.math.geometry.euclidean.threed.Vector3D(1.0, zero, p1.getX(), direction);
	}

	public boolean isSimilarTo(final org.apache.commons.math.geometry.euclidean.threed.Line line) {
		final double angle = org.apache.commons.math.geometry.euclidean.threed.Vector3D.angle(direction, line.direction);
		return ((angle < 1.0E-10) || (angle > ((org.apache.commons.math.util.FastMath.PI) - 1.0E-10))) && (contains(line.zero));
	}

	public boolean contains(final org.apache.commons.math.geometry.euclidean.threed.Vector3D p) {
		return (distance(p)) < 1.0E-10;
	}

	public double distance(final org.apache.commons.math.geometry.euclidean.threed.Vector3D p) {
		final org.apache.commons.math.geometry.euclidean.threed.Vector3D d = p.subtract(zero);
		final org.apache.commons.math.geometry.euclidean.threed.Vector3D n = new org.apache.commons.math.geometry.euclidean.threed.Vector3D(1.0, d, (-(org.apache.commons.math.geometry.euclidean.threed.Vector3D.dotProduct(d, direction))), direction);
		return n.getNorm();
	}

	public double distance(final org.apache.commons.math.geometry.euclidean.threed.Line line) {
		final org.apache.commons.math.geometry.euclidean.threed.Vector3D normal = org.apache.commons.math.geometry.euclidean.threed.Vector3D.crossProduct(direction, line.direction);
		if ((normal.getNorm()) < 1.0E-10) {
			return distance(line.zero);
		}
		final org.apache.commons.math.geometry.euclidean.threed.Plane middle = new org.apache.commons.math.geometry.euclidean.threed.Plane(new org.apache.commons.math.geometry.euclidean.threed.Vector3D(0.5, zero, 0.5, line.zero), normal);
		return 2 * (org.apache.commons.math.util.FastMath.abs(middle.getOffset(zero)));
	}
}


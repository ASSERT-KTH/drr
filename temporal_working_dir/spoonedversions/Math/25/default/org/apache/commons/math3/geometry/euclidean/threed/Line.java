

package org.apache.commons.math3.geometry.euclidean.threed;


public class Line implements org.apache.commons.math3.geometry.partitioning.Embedding<org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> {
	private org.apache.commons.math3.geometry.euclidean.threed.Vector3D direction;

	private org.apache.commons.math3.geometry.euclidean.threed.Vector3D zero;

	public Line(final org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1, final org.apache.commons.math3.geometry.euclidean.threed.Vector3D p2) {
		reset(p1, p2);
	}

	public Line(final org.apache.commons.math3.geometry.euclidean.threed.Line line) {
		org.apache.commons.math3.geometry.euclidean.threed.Line.this.direction = line.direction;
		org.apache.commons.math3.geometry.euclidean.threed.Line.this.zero = line.zero;
	}

	public void reset(final org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1, final org.apache.commons.math3.geometry.euclidean.threed.Vector3D p2) {
		final org.apache.commons.math3.geometry.euclidean.threed.Vector3D delta = p2.subtract(p1);
		final double norm2 = delta.getNormSq();
		if (norm2 == 0.0) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM);
		}
		org.apache.commons.math3.geometry.euclidean.threed.Line.this.direction = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((1.0 / (org.apache.commons.math3.util.FastMath.sqrt(norm2))), delta);
		zero = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D(1.0, p1, ((-(p1.dotProduct(delta))) / norm2), delta);
	}

	public org.apache.commons.math3.geometry.euclidean.threed.Line revert() {
		return new org.apache.commons.math3.geometry.euclidean.threed.Line(zero, zero.subtract(direction));
	}

	public org.apache.commons.math3.geometry.euclidean.threed.Vector3D getDirection() {
		return direction;
	}

	public org.apache.commons.math3.geometry.euclidean.threed.Vector3D getOrigin() {
		return zero;
	}

	public double getAbscissa(final org.apache.commons.math3.geometry.euclidean.threed.Vector3D point) {
		return point.subtract(zero).dotProduct(direction);
	}

	public org.apache.commons.math3.geometry.euclidean.threed.Vector3D pointAt(final double abscissa) {
		return new org.apache.commons.math3.geometry.euclidean.threed.Vector3D(1.0, zero, abscissa, direction);
	}

	public org.apache.commons.math3.geometry.euclidean.oned.Vector1D toSubSpace(final org.apache.commons.math3.geometry.Vector<org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D> point) {
		return new org.apache.commons.math3.geometry.euclidean.oned.Vector1D(getAbscissa(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D) (point))));
	}

	public org.apache.commons.math3.geometry.euclidean.threed.Vector3D toSpace(final org.apache.commons.math3.geometry.Vector<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> point) {
		return pointAt(((org.apache.commons.math3.geometry.euclidean.oned.Vector1D) (point)).getX());
	}

	public boolean isSimilarTo(final org.apache.commons.math3.geometry.euclidean.threed.Line line) {
		final double angle = org.apache.commons.math3.geometry.euclidean.threed.Vector3D.angle(direction, line.direction);
		return ((angle < 1.0E-10) || (angle > ((org.apache.commons.math3.util.FastMath.PI) - 1.0E-10))) && (contains(line.zero));
	}

	public boolean contains(final org.apache.commons.math3.geometry.euclidean.threed.Vector3D p) {
		return (distance(p)) < 1.0E-10;
	}

	public double distance(final org.apache.commons.math3.geometry.euclidean.threed.Vector3D p) {
		final org.apache.commons.math3.geometry.euclidean.threed.Vector3D d = p.subtract(zero);
		final org.apache.commons.math3.geometry.euclidean.threed.Vector3D n = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D(1.0, d, (-(d.dotProduct(direction))), direction);
		return n.getNorm();
	}

	public double distance(final org.apache.commons.math3.geometry.euclidean.threed.Line line) {
		final org.apache.commons.math3.geometry.euclidean.threed.Vector3D normal = org.apache.commons.math3.geometry.euclidean.threed.Vector3D.crossProduct(direction, line.direction);
		final double n = normal.getNorm();
		if (n < (org.apache.commons.math3.util.Precision.SAFE_MIN)) {
			return distance(line.zero);
		}
		final double offset = (line.zero.subtract(zero).dotProduct(normal)) / n;
		return org.apache.commons.math3.util.FastMath.abs(offset);
	}

	public org.apache.commons.math3.geometry.euclidean.threed.Vector3D closestPoint(final org.apache.commons.math3.geometry.euclidean.threed.Line line) {
		final double cos = direction.dotProduct(line.direction);
		final double n = 1 - (cos * cos);
		if (n < (org.apache.commons.math3.util.Precision.EPSILON)) {
			return zero;
		}
		final org.apache.commons.math3.geometry.euclidean.threed.Vector3D delta0 = line.zero.subtract(zero);
		final double a = delta0.dotProduct(direction);
		final double b = delta0.dotProduct(line.direction);
		return new org.apache.commons.math3.geometry.euclidean.threed.Vector3D(1, zero, ((a - (b * cos)) / n), direction);
	}

	public org.apache.commons.math3.geometry.euclidean.threed.Vector3D intersection(final org.apache.commons.math3.geometry.euclidean.threed.Line line) {
		final org.apache.commons.math3.geometry.euclidean.threed.Vector3D closest = closestPoint(line);
		return line.contains(closest) ? closest : null;
	}

	public org.apache.commons.math3.geometry.euclidean.threed.SubLine wholeLine() {
		return new org.apache.commons.math3.geometry.euclidean.threed.SubLine(org.apache.commons.math3.geometry.euclidean.threed.Line.this, new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet());
	}
}


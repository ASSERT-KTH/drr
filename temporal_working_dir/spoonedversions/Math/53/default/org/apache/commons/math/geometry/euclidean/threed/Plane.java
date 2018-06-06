

package org.apache.commons.math.geometry.euclidean.threed;


public class Plane implements org.apache.commons.math.geometry.partitioning.Embedding<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D, org.apache.commons.math.geometry.euclidean.twod.Euclidean2D> , org.apache.commons.math.geometry.partitioning.Hyperplane<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D> {
	private double originOffset;

	private org.apache.commons.math.geometry.euclidean.threed.Vector3D origin;

	private org.apache.commons.math.geometry.euclidean.threed.Vector3D u;

	private org.apache.commons.math.geometry.euclidean.threed.Vector3D v;

	private org.apache.commons.math.geometry.euclidean.threed.Vector3D w;

	public Plane(final org.apache.commons.math.geometry.euclidean.threed.Vector3D normal) {
		setNormal(normal);
		originOffset = 0;
		setFrame();
	}

	public Plane(final org.apache.commons.math.geometry.euclidean.threed.Vector3D p, final org.apache.commons.math.geometry.euclidean.threed.Vector3D normal) {
		setNormal(normal);
		originOffset = -(org.apache.commons.math.geometry.euclidean.threed.Vector3D.dotProduct(p, w));
		setFrame();
	}

	public Plane(final org.apache.commons.math.geometry.euclidean.threed.Vector3D p1, final org.apache.commons.math.geometry.euclidean.threed.Vector3D p2, final org.apache.commons.math.geometry.euclidean.threed.Vector3D p3) {
		this(p1, org.apache.commons.math.geometry.euclidean.threed.Vector3D.crossProduct(p2.subtract(p1), p3.subtract(p1)));
	}

	public Plane(final org.apache.commons.math.geometry.euclidean.threed.Plane plane) {
		originOffset = plane.originOffset;
		origin = plane.origin;
		u = plane.u;
		v = plane.v;
		w = plane.w;
	}

	public org.apache.commons.math.geometry.euclidean.threed.Plane copySelf() {
		return new org.apache.commons.math.geometry.euclidean.threed.Plane(org.apache.commons.math.geometry.euclidean.threed.Plane.this);
	}

	public void reset(final org.apache.commons.math.geometry.euclidean.threed.Vector3D p, final org.apache.commons.math.geometry.euclidean.threed.Vector3D normal) {
		setNormal(normal);
		originOffset = -(org.apache.commons.math.geometry.euclidean.threed.Vector3D.dotProduct(p, w));
		setFrame();
	}

	public void reset(final org.apache.commons.math.geometry.euclidean.threed.Plane original) {
		originOffset = original.originOffset;
		origin = original.origin;
		u = original.u;
		v = original.v;
		w = original.w;
	}

	private void setNormal(final org.apache.commons.math.geometry.euclidean.threed.Vector3D normal) {
		final double norm = normal.getNorm();
		if (norm < 1.0E-10) {
			throw new java.lang.IllegalArgumentException("null norm");
		}
		w = new org.apache.commons.math.geometry.euclidean.threed.Vector3D((1.0 / norm), normal);
	}

	private void setFrame() {
		origin = new org.apache.commons.math.geometry.euclidean.threed.Vector3D((-(originOffset)), w);
		u = w.orthogonal();
		v = org.apache.commons.math.geometry.euclidean.threed.Vector3D.crossProduct(w, u);
	}

	public org.apache.commons.math.geometry.euclidean.threed.Vector3D getOrigin() {
		return origin;
	}

	public org.apache.commons.math.geometry.euclidean.threed.Vector3D getNormal() {
		return w;
	}

	public org.apache.commons.math.geometry.euclidean.threed.Vector3D getU() {
		return u;
	}

	public org.apache.commons.math.geometry.euclidean.threed.Vector3D getV() {
		return v;
	}

	public void revertSelf() {
		final org.apache.commons.math.geometry.euclidean.threed.Vector3D tmp = u;
		u = v;
		v = tmp;
		w = w.negate();
		originOffset = -(originOffset);
	}

	public org.apache.commons.math.geometry.euclidean.twod.Vector2D toSubSpace(final org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D> point) {
		final org.apache.commons.math.geometry.euclidean.threed.Vector3D p3D = ((org.apache.commons.math.geometry.euclidean.threed.Vector3D) (point));
		return new org.apache.commons.math.geometry.euclidean.twod.Vector2D(org.apache.commons.math.geometry.euclidean.threed.Vector3D.dotProduct(p3D, u), org.apache.commons.math.geometry.euclidean.threed.Vector3D.dotProduct(p3D, v));
	}

	public org.apache.commons.math.geometry.euclidean.threed.Vector3D toSpace(final org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.twod.Euclidean2D> point) {
		final org.apache.commons.math.geometry.euclidean.twod.Vector2D p2D = ((org.apache.commons.math.geometry.euclidean.twod.Vector2D) (point));
		return new org.apache.commons.math.geometry.euclidean.threed.Vector3D(p2D.getX(), u, p2D.getY(), v, (-(originOffset)), w);
	}

	public org.apache.commons.math.geometry.euclidean.threed.Vector3D getPointAt(final org.apache.commons.math.geometry.euclidean.twod.Vector2D inPlane, final double offset) {
		return new org.apache.commons.math.geometry.euclidean.threed.Vector3D(inPlane.getX(), u, inPlane.getY(), v, (offset - (originOffset)), w);
	}

	public boolean isSimilarTo(final org.apache.commons.math.geometry.euclidean.threed.Plane plane) {
		final double angle = org.apache.commons.math.geometry.euclidean.threed.Vector3D.angle(w, plane.w);
		return ((angle < 1.0E-10) && ((org.apache.commons.math.util.FastMath.abs(((originOffset) - (plane.originOffset)))) < 1.0E-10)) || ((angle > ((org.apache.commons.math.util.FastMath.PI) - 1.0E-10)) && ((org.apache.commons.math.util.FastMath.abs(((originOffset) + (plane.originOffset)))) < 1.0E-10));
	}

	public org.apache.commons.math.geometry.euclidean.threed.Plane rotate(final org.apache.commons.math.geometry.euclidean.threed.Vector3D center, final org.apache.commons.math.geometry.euclidean.threed.Rotation rotation) {
		final org.apache.commons.math.geometry.euclidean.threed.Vector3D delta = origin.subtract(center);
		final org.apache.commons.math.geometry.euclidean.threed.Plane plane = new org.apache.commons.math.geometry.euclidean.threed.Plane(center.add(rotation.applyTo(delta)), rotation.applyTo(w));
		plane.u = rotation.applyTo(u);
		plane.v = rotation.applyTo(v);
		return plane;
	}

	public org.apache.commons.math.geometry.euclidean.threed.Plane translate(final org.apache.commons.math.geometry.euclidean.threed.Vector3D translation) {
		final org.apache.commons.math.geometry.euclidean.threed.Plane plane = new org.apache.commons.math.geometry.euclidean.threed.Plane(origin.add(translation), w);
		plane.u = u;
		plane.v = v;
		return plane;
	}

	public org.apache.commons.math.geometry.euclidean.threed.Vector3D intersection(final org.apache.commons.math.geometry.euclidean.threed.Line line) {
		final org.apache.commons.math.geometry.euclidean.threed.Vector3D direction = line.getDirection();
		final double dot = org.apache.commons.math.geometry.euclidean.threed.Vector3D.dotProduct(w, direction);
		if ((org.apache.commons.math.util.FastMath.abs(dot)) < 1.0E-10) {
			return null;
		}
		final org.apache.commons.math.geometry.euclidean.threed.Vector3D point = ((org.apache.commons.math.geometry.euclidean.threed.Vector3D) (line.toSpace(org.apache.commons.math.geometry.euclidean.oned.Vector1D.ZERO)));
		final double k = (-((originOffset) + (org.apache.commons.math.geometry.euclidean.threed.Vector3D.dotProduct(w, point)))) / dot;
		return new org.apache.commons.math.geometry.euclidean.threed.Vector3D(1.0, point, k, direction);
	}

	public org.apache.commons.math.geometry.euclidean.threed.Line intersection(final org.apache.commons.math.geometry.euclidean.threed.Plane other) {
		final org.apache.commons.math.geometry.euclidean.threed.Vector3D direction = org.apache.commons.math.geometry.euclidean.threed.Vector3D.crossProduct(w, other.w);
		if ((direction.getNorm()) < 1.0E-10) {
			return null;
		}
		return new org.apache.commons.math.geometry.euclidean.threed.Line(org.apache.commons.math.geometry.euclidean.threed.Plane.intersection(org.apache.commons.math.geometry.euclidean.threed.Plane.this, other, new org.apache.commons.math.geometry.euclidean.threed.Plane(direction)), direction);
	}

	public static org.apache.commons.math.geometry.euclidean.threed.Vector3D intersection(final org.apache.commons.math.geometry.euclidean.threed.Plane plane1, final org.apache.commons.math.geometry.euclidean.threed.Plane plane2, final org.apache.commons.math.geometry.euclidean.threed.Plane plane3) {
		final double a1 = plane1.w.getX();
		final double b1 = plane1.w.getY();
		final double c1 = plane1.w.getZ();
		final double d1 = plane1.originOffset;
		final double a2 = plane2.w.getX();
		final double b2 = plane2.w.getY();
		final double c2 = plane2.w.getZ();
		final double d2 = plane2.originOffset;
		final double a3 = plane3.w.getX();
		final double b3 = plane3.w.getY();
		final double c3 = plane3.w.getZ();
		final double d3 = plane3.originOffset;
		final double a23 = (b2 * c3) - (b3 * c2);
		final double b23 = (c2 * a3) - (c3 * a2);
		final double c23 = (a2 * b3) - (a3 * b2);
		final double determinant = ((a1 * a23) + (b1 * b23)) + (c1 * c23);
		if ((org.apache.commons.math.util.FastMath.abs(determinant)) < 1.0E-10) {
			return null;
		}
		final double r = 1.0 / determinant;
		return new org.apache.commons.math.geometry.euclidean.threed.Vector3D((((((-a23) * d1) - (((c1 * b3) - (c3 * b1)) * d2)) - (((c2 * b1) - (c1 * b2)) * d3)) * r), (((((-b23) * d1) - (((c3 * a1) - (c1 * a3)) * d2)) - (((c1 * a2) - (c2 * a1)) * d3)) * r), (((((-c23) * d1) - (((b1 * a3) - (b3 * a1)) * d2)) - (((b2 * a1) - (b1 * a2)) * d3)) * r));
	}

	public org.apache.commons.math.geometry.euclidean.threed.SubPlane wholeHyperplane() {
		return new org.apache.commons.math.geometry.euclidean.threed.SubPlane(org.apache.commons.math.geometry.euclidean.threed.Plane.this, new org.apache.commons.math.geometry.euclidean.twod.PolygonsSet());
	}

	public org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet wholeSpace() {
		return new org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet();
	}

	public boolean contains(final org.apache.commons.math.geometry.euclidean.threed.Vector3D p) {
		return (org.apache.commons.math.util.FastMath.abs(getOffset(p))) < 1.0E-10;
	}

	public double getOffset(final org.apache.commons.math.geometry.euclidean.threed.Plane plane) {
		return (originOffset) + (sameOrientationAs(plane) ? -(plane.originOffset) : plane.originOffset);
	}

	public double getOffset(final org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D> point) {
		return (org.apache.commons.math.geometry.euclidean.threed.Vector3D.dotProduct(((org.apache.commons.math.geometry.euclidean.threed.Vector3D) (point)), w)) + (originOffset);
	}

	public boolean sameOrientationAs(final org.apache.commons.math.geometry.partitioning.Hyperplane<org.apache.commons.math.geometry.euclidean.threed.Euclidean3D> other) {
		return (org.apache.commons.math.geometry.euclidean.threed.Vector3D.dotProduct(((org.apache.commons.math.geometry.euclidean.threed.Plane) (other)).w, w)) > 0.0;
	}
}


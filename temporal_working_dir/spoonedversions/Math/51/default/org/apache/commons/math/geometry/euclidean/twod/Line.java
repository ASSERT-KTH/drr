

package org.apache.commons.math.geometry.euclidean.twod;


public class Line implements org.apache.commons.math.geometry.partitioning.Embedding<org.apache.commons.math.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> , org.apache.commons.math.geometry.partitioning.Hyperplane<org.apache.commons.math.geometry.euclidean.twod.Euclidean2D> {
	private double angle;

	private double cos;

	private double sin;

	private double originOffset;

	public Line(final org.apache.commons.math.geometry.euclidean.twod.Vector2D p1, final org.apache.commons.math.geometry.euclidean.twod.Vector2D p2) {
		reset(p1, p2);
	}

	public Line(final org.apache.commons.math.geometry.euclidean.twod.Vector2D p, final double angle) {
		reset(p, angle);
	}

	private Line(final double angle, final double cos, final double sin, final double originOffset) {
		org.apache.commons.math.geometry.euclidean.twod.Line.this.angle = angle;
		org.apache.commons.math.geometry.euclidean.twod.Line.this.cos = cos;
		org.apache.commons.math.geometry.euclidean.twod.Line.this.sin = sin;
		org.apache.commons.math.geometry.euclidean.twod.Line.this.originOffset = originOffset;
	}

	public Line(final org.apache.commons.math.geometry.euclidean.twod.Line line) {
		angle = org.apache.commons.math.util.MathUtils.normalizeAngle(line.angle, org.apache.commons.math.util.FastMath.PI);
		cos = org.apache.commons.math.util.FastMath.cos(angle);
		sin = org.apache.commons.math.util.FastMath.sin(angle);
		originOffset = line.originOffset;
	}

	public org.apache.commons.math.geometry.euclidean.twod.Line copySelf() {
		return new org.apache.commons.math.geometry.euclidean.twod.Line(org.apache.commons.math.geometry.euclidean.twod.Line.this);
	}

	public void reset(final org.apache.commons.math.geometry.euclidean.twod.Vector2D p1, final org.apache.commons.math.geometry.euclidean.twod.Vector2D p2) {
		final double dx = (p2.getX()) - (p1.getX());
		final double dy = (p2.getY()) - (p1.getY());
		final double d = org.apache.commons.math.util.FastMath.hypot(dx, dy);
		if (d == 0.0) {
			angle = 0.0;
			cos = 1.0;
			sin = 0.0;
			originOffset = p1.getY();
		}else {
			angle = (org.apache.commons.math.util.FastMath.PI) + (org.apache.commons.math.util.FastMath.atan2((-dy), (-dx)));
			cos = org.apache.commons.math.util.FastMath.cos(angle);
			sin = org.apache.commons.math.util.FastMath.sin(angle);
			originOffset = (((p2.getX()) * (p1.getY())) - ((p1.getX()) * (p2.getY()))) / d;
		}
	}

	public void reset(final org.apache.commons.math.geometry.euclidean.twod.Vector2D p, final double alpha) {
		org.apache.commons.math.geometry.euclidean.twod.Line.this.angle = org.apache.commons.math.util.MathUtils.normalizeAngle(alpha, org.apache.commons.math.util.FastMath.PI);
		cos = org.apache.commons.math.util.FastMath.cos(org.apache.commons.math.geometry.euclidean.twod.Line.this.angle);
		sin = org.apache.commons.math.util.FastMath.sin(org.apache.commons.math.geometry.euclidean.twod.Line.this.angle);
		originOffset = ((cos) * (p.getY())) - ((sin) * (p.getX()));
	}

	public void revertSelf() {
		if ((angle) < (org.apache.commons.math.util.FastMath.PI)) {
			angle += org.apache.commons.math.util.FastMath.PI;
		}else {
			angle -= org.apache.commons.math.util.FastMath.PI;
		}
		cos = -(cos);
		sin = -(sin);
		originOffset = -(originOffset);
	}

	public org.apache.commons.math.geometry.euclidean.twod.Line getReverse() {
		return new org.apache.commons.math.geometry.euclidean.twod.Line(((angle) < (org.apache.commons.math.util.FastMath.PI) ? (angle) + (org.apache.commons.math.util.FastMath.PI) : (angle) - (org.apache.commons.math.util.FastMath.PI)), (-(cos)), (-(sin)), (-(originOffset)));
	}

	public org.apache.commons.math.geometry.euclidean.oned.Vector1D toSubSpace(final org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.twod.Euclidean2D> point) {
		org.apache.commons.math.geometry.euclidean.twod.Vector2D p2 = ((org.apache.commons.math.geometry.euclidean.twod.Vector2D) (point));
		return new org.apache.commons.math.geometry.euclidean.oned.Vector1D((((cos) * (p2.getX())) + ((sin) * (p2.getY()))));
	}

	public org.apache.commons.math.geometry.euclidean.twod.Vector2D toSpace(final org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> point) {
		final double abscissa = ((org.apache.commons.math.geometry.euclidean.oned.Vector1D) (point)).getX();
		return new org.apache.commons.math.geometry.euclidean.twod.Vector2D(((abscissa * (cos)) - ((originOffset) * (sin))), ((abscissa * (sin)) + ((originOffset) * (cos))));
	}

	public org.apache.commons.math.geometry.euclidean.twod.Vector2D intersection(final org.apache.commons.math.geometry.partitioning.Hyperplane<org.apache.commons.math.geometry.euclidean.twod.Euclidean2D> other) {
		final org.apache.commons.math.geometry.euclidean.twod.Line otherL = ((org.apache.commons.math.geometry.euclidean.twod.Line) (other));
		final double d = ((sin) * (otherL.cos)) - ((otherL.sin) * (cos));
		if ((org.apache.commons.math.util.FastMath.abs(d)) < 1.0E-10) {
			return null;
		}
		return new org.apache.commons.math.geometry.euclidean.twod.Vector2D(((((cos) * (otherL.originOffset)) - ((otherL.cos) * (originOffset))) / d), ((((sin) * (otherL.originOffset)) - ((otherL.sin) * (originOffset))) / d));
	}

	public org.apache.commons.math.geometry.euclidean.twod.SubLine wholeHyperplane() {
		return new org.apache.commons.math.geometry.euclidean.twod.SubLine(org.apache.commons.math.geometry.euclidean.twod.Line.this, new org.apache.commons.math.geometry.euclidean.oned.IntervalsSet());
	}

	public org.apache.commons.math.geometry.euclidean.twod.PolygonsSet wholeSpace() {
		return new org.apache.commons.math.geometry.euclidean.twod.PolygonsSet();
	}

	public double getOffset(final org.apache.commons.math.geometry.euclidean.twod.Line line) {
		return (originOffset) + ((((cos) * (line.cos)) + ((sin) * (line.sin))) > 0 ? -(line.originOffset) : line.originOffset);
	}

	public double getOffset(final org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.twod.Euclidean2D> point) {
		org.apache.commons.math.geometry.euclidean.twod.Vector2D p2 = ((org.apache.commons.math.geometry.euclidean.twod.Vector2D) (point));
		return (((sin) * (p2.getX())) - ((cos) * (p2.getY()))) + (originOffset);
	}

	public boolean sameOrientationAs(final org.apache.commons.math.geometry.partitioning.Hyperplane<org.apache.commons.math.geometry.euclidean.twod.Euclidean2D> other) {
		final org.apache.commons.math.geometry.euclidean.twod.Line otherL = ((org.apache.commons.math.geometry.euclidean.twod.Line) (other));
		return (((sin) * (otherL.sin)) + ((cos) * (otherL.cos))) >= 0.0;
	}

	public org.apache.commons.math.geometry.euclidean.twod.Vector2D getPointAt(final org.apache.commons.math.geometry.euclidean.oned.Vector1D abscissa, final double offset) {
		final double x = abscissa.getX();
		final double dOffset = offset - (originOffset);
		return new org.apache.commons.math.geometry.euclidean.twod.Vector2D(((x * (cos)) + (dOffset * (sin))), ((x * (sin)) - (dOffset * (cos))));
	}

	public boolean contains(final org.apache.commons.math.geometry.euclidean.twod.Vector2D p) {
		return (org.apache.commons.math.util.FastMath.abs(getOffset(p))) < 1.0E-10;
	}

	public boolean isParallelTo(final org.apache.commons.math.geometry.euclidean.twod.Line line) {
		return (org.apache.commons.math.util.FastMath.abs((((sin) * (line.cos)) - ((cos) * (line.sin))))) < 1.0E-10;
	}

	public void translateToPoint(final org.apache.commons.math.geometry.euclidean.twod.Vector2D p) {
		originOffset = ((cos) * (p.getY())) - ((sin) * (p.getX()));
	}

	public double getAngle() {
		return org.apache.commons.math.util.MathUtils.normalizeAngle(angle, org.apache.commons.math.util.FastMath.PI);
	}

	public void setAngle(final double angle) {
		org.apache.commons.math.geometry.euclidean.twod.Line.this.angle = org.apache.commons.math.util.MathUtils.normalizeAngle(angle, org.apache.commons.math.util.FastMath.PI);
		cos = org.apache.commons.math.util.FastMath.cos(org.apache.commons.math.geometry.euclidean.twod.Line.this.angle);
		sin = org.apache.commons.math.util.FastMath.sin(org.apache.commons.math.geometry.euclidean.twod.Line.this.angle);
	}

	public double getOriginOffset() {
		return originOffset;
	}

	public void setOriginOffset(final double offset) {
		originOffset = offset;
	}

	public static org.apache.commons.math.geometry.partitioning.Transform<org.apache.commons.math.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> getTransform(final java.awt.geom.AffineTransform transform) throws org.apache.commons.math.exception.MathIllegalArgumentException {
		return new org.apache.commons.math.geometry.euclidean.twod.Line.LineTransform(transform);
	}

	private static class LineTransform implements org.apache.commons.math.geometry.partitioning.Transform<org.apache.commons.math.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> {
		private double cXX;

		private double cXY;

		private double cX1;

		private double cYX;

		private double cYY;

		private double cY1;

		private double c1Y;

		private double c1X;

		private double c11;

		public LineTransform(final java.awt.geom.AffineTransform transform) throws org.apache.commons.math.exception.MathIllegalArgumentException {
			final double[] m = new double[6];
			transform.getMatrix(m);
			cXX = m[0];
			cXY = m[2];
			cX1 = m[4];
			cYX = m[1];
			cYY = m[3];
			cY1 = m[5];
			c1Y = ((cXY) * (cY1)) - ((cYY) * (cX1));
			c1X = ((cXX) * (cY1)) - ((cYX) * (cX1));
			c11 = ((cXX) * (cYY)) - ((cYX) * (cXY));
			if ((org.apache.commons.math.util.FastMath.abs(c11)) < 1.0E-20) {
				throw new org.apache.commons.math.exception.MathIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.NON_INVERTIBLE_TRANSFORM);
			}
		}

		public org.apache.commons.math.geometry.euclidean.twod.Vector2D apply(final org.apache.commons.math.geometry.Vector<org.apache.commons.math.geometry.euclidean.twod.Euclidean2D> point) {
			final org.apache.commons.math.geometry.euclidean.twod.Vector2D p2D = ((org.apache.commons.math.geometry.euclidean.twod.Vector2D) (point));
			final double x = p2D.getX();
			final double y = p2D.getY();
			return new org.apache.commons.math.geometry.euclidean.twod.Vector2D(((((cXX) * x) + ((cXY) * y)) + (cX1)), ((((cYX) * x) + ((cYY) * y)) + (cY1)));
		}

		public org.apache.commons.math.geometry.euclidean.twod.Line apply(final org.apache.commons.math.geometry.partitioning.Hyperplane<org.apache.commons.math.geometry.euclidean.twod.Euclidean2D> hyperplane) {
			final org.apache.commons.math.geometry.euclidean.twod.Line line = ((org.apache.commons.math.geometry.euclidean.twod.Line) (hyperplane));
			final double rOffset = (((c1X) * (line.cos)) + ((c1Y) * (line.sin))) + ((c11) * (line.originOffset));
			final double rCos = ((cXX) * (line.cos)) + ((cXY) * (line.sin));
			final double rSin = ((cYX) * (line.cos)) + ((cYY) * (line.sin));
			final double inv = 1.0 / (org.apache.commons.math.util.FastMath.sqrt(((rSin * rSin) + (rCos * rCos))));
			return new org.apache.commons.math.geometry.euclidean.twod.Line(((org.apache.commons.math.util.FastMath.PI) + (org.apache.commons.math.util.FastMath.atan2((-rSin), (-rCos)))), (inv * rCos), (inv * rSin), (inv * rOffset));
		}

		public org.apache.commons.math.geometry.partitioning.SubHyperplane<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> apply(final org.apache.commons.math.geometry.partitioning.SubHyperplane<org.apache.commons.math.geometry.euclidean.oned.Euclidean1D> sub, final org.apache.commons.math.geometry.partitioning.Hyperplane<org.apache.commons.math.geometry.euclidean.twod.Euclidean2D> original, final org.apache.commons.math.geometry.partitioning.Hyperplane<org.apache.commons.math.geometry.euclidean.twod.Euclidean2D> transformed) {
			final org.apache.commons.math.geometry.euclidean.oned.OrientedPoint op = ((org.apache.commons.math.geometry.euclidean.oned.OrientedPoint) (sub.getHyperplane()));
			final org.apache.commons.math.geometry.euclidean.twod.Line originalLine = ((org.apache.commons.math.geometry.euclidean.twod.Line) (original));
			final org.apache.commons.math.geometry.euclidean.twod.Line transformedLine = ((org.apache.commons.math.geometry.euclidean.twod.Line) (transformed));
			final org.apache.commons.math.geometry.euclidean.oned.Vector1D newLoc = transformedLine.toSubSpace(apply(originalLine.toSpace(op.getLocation())));
			return new org.apache.commons.math.geometry.euclidean.oned.OrientedPoint(newLoc, op.isDirect()).wholeHyperplane();
		}
	}
}


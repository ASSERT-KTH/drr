

package org.apache.commons.math3.geometry.euclidean.twod;


public class Segment {
	private final org.apache.commons.math3.geometry.euclidean.twod.Vector2D start;

	private final org.apache.commons.math3.geometry.euclidean.twod.Vector2D end;

	private final org.apache.commons.math3.geometry.euclidean.twod.Line line;

	public Segment(final org.apache.commons.math3.geometry.euclidean.twod.Vector2D start, final org.apache.commons.math3.geometry.euclidean.twod.Vector2D end, final org.apache.commons.math3.geometry.euclidean.twod.Line line) {
		this.start = start;
		this.end = end;
		this.line = line;
	}

	public org.apache.commons.math3.geometry.euclidean.twod.Vector2D getStart() {
		return start;
	}

	public org.apache.commons.math3.geometry.euclidean.twod.Vector2D getEnd() {
		return end;
	}

	public org.apache.commons.math3.geometry.euclidean.twod.Line getLine() {
		return line;
	}

	public double distance(final org.apache.commons.math3.geometry.euclidean.twod.Vector2D p) {
		final double deltaX = (end.getX()) - (start.getX());
		final double deltaY = (end.getY()) - (start.getY());
		final double r = ((((p.getX()) - (start.getX())) * deltaX) + (((p.getY()) - (start.getY())) * deltaY)) / ((deltaX * deltaX) + (deltaY * deltaY));
		if ((r < 0) || (r > 1)) {
			final double dist1 = getStart().distance(p);
			final double dist2 = getEnd().distance(p);
			return org.apache.commons.math3.util.FastMath.min(dist1, dist2);
		}else {
			final double px = (start.getX()) + (r * deltaX);
			final double py = (start.getY()) + (r * deltaY);
			final org.apache.commons.math3.geometry.euclidean.twod.Vector2D interPt = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D(px, py);
			return interPt.distance(p);
		}
	}
}


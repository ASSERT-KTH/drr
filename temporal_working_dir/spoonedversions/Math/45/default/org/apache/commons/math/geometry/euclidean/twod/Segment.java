

package org.apache.commons.math.geometry.euclidean.twod;


public class Segment {
	private final org.apache.commons.math.geometry.euclidean.twod.Vector2D start;

	private final org.apache.commons.math.geometry.euclidean.twod.Vector2D end;

	private final org.apache.commons.math.geometry.euclidean.twod.Line line;

	public Segment(final org.apache.commons.math.geometry.euclidean.twod.Vector2D start, final org.apache.commons.math.geometry.euclidean.twod.Vector2D end, final org.apache.commons.math.geometry.euclidean.twod.Line line) {
		this.start = start;
		this.end = end;
		this.line = line;
	}

	public org.apache.commons.math.geometry.euclidean.twod.Vector2D getStart() {
		return start;
	}

	public org.apache.commons.math.geometry.euclidean.twod.Vector2D getEnd() {
		return end;
	}

	public org.apache.commons.math.geometry.euclidean.twod.Line getLine() {
		return line;
	}
}


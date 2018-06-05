

package org.apache.commons.math.geometry.euclidean.threed;


public class Segment {
	private final org.apache.commons.math.geometry.euclidean.threed.Vector3D start;

	private final org.apache.commons.math.geometry.euclidean.threed.Vector3D end;

	private final org.apache.commons.math.geometry.euclidean.threed.Line line;

	public Segment(final org.apache.commons.math.geometry.euclidean.threed.Vector3D start, final org.apache.commons.math.geometry.euclidean.threed.Vector3D end, final org.apache.commons.math.geometry.euclidean.threed.Line line) {
		this.start = start;
		this.end = end;
		this.line = line;
	}

	public org.apache.commons.math.geometry.euclidean.threed.Vector3D getStart() {
		return start;
	}

	public org.apache.commons.math.geometry.euclidean.threed.Vector3D getEnd() {
		return end;
	}

	public org.apache.commons.math.geometry.euclidean.threed.Line getLine() {
		return line;
	}
}


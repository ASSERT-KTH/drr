

package org.apache.commons.math3.geometry.euclidean.oned;


public class Interval {
	private final double lower;

	private final double upper;

	public Interval(final double lower, final double upper) {
		this.lower = lower;
		this.upper = upper;
	}

	public double getLower() {
		return lower;
	}

	public double getUpper() {
		return upper;
	}

	public double getLength() {
		return (upper) - (lower);
	}

	public double getMidPoint() {
		return 0.5 * ((lower) + (upper));
	}
}


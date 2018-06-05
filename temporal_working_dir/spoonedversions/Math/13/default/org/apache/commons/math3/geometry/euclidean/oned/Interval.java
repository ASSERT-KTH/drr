

package org.apache.commons.math3.geometry.euclidean.oned;


public class Interval {
	private final double lower;

	private final double upper;

	public Interval(final double lower, final double upper) {
		this.lower = lower;
		this.upper = upper;
	}

	public double getInf() {
		return lower;
	}

	@java.lang.Deprecated
	public double getLower() {
		return getInf();
	}

	public double getSup() {
		return upper;
	}

	@java.lang.Deprecated
	public double getUpper() {
		return getSup();
	}

	public double getSize() {
		return (upper) - (lower);
	}

	@java.lang.Deprecated
	public double getLength() {
		return getSize();
	}

	public double getBarycenter() {
		return 0.5 * ((lower) + (upper));
	}

	@java.lang.Deprecated
	public double getMidPoint() {
		return getBarycenter();
	}

	public org.apache.commons.math3.geometry.partitioning.Region.Location checkPoint(final double point, final double tolerance) {
		if ((point < ((lower) - tolerance)) || (point > ((upper) + tolerance))) {
			return org.apache.commons.math3.geometry.partitioning.Region.Location.OUTSIDE;
		}else
			if ((point > ((lower) + tolerance)) && (point < ((upper) - tolerance))) {
				return org.apache.commons.math3.geometry.partitioning.Region.Location.INSIDE;
			}else {
				return org.apache.commons.math3.geometry.partitioning.Region.Location.BOUNDARY;
			}
		
	}
}


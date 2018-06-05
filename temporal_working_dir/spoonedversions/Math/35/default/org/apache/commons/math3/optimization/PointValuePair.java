

package org.apache.commons.math3.optimization;


public class PointValuePair extends org.apache.commons.math3.util.Pair<double[], java.lang.Double> {
	public PointValuePair(final double[] point, final double value) {
		this(point, value, true);
	}

	public PointValuePair(final double[] point, final double value, final boolean copyArray) {
		super((copyArray ? point == null ? null : point.clone() : point), value);
	}

	public double[] getPoint() {
		final double[] p = getKey();
		return p == null ? null : p.clone();
	}

	public double[] getPointRef() {
		return getKey();
	}
}


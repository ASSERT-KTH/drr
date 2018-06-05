

package org.apache.commons.math.optimization;


public class PointVectorValuePair extends org.apache.commons.math.util.Pair<double[], double[]> {
	public PointVectorValuePair(final double[] point, final double[] value) {
		this(point, value, true);
	}

	public PointVectorValuePair(final double[] point, final double[] value, final boolean copyArray) {
		super((copyArray ? point == null ? null : point.clone() : point), (copyArray ? value == null ? null : value.clone() : value));
	}

	public double[] getPoint() {
		final double[] p = getKey();
		return p == null ? null : p.clone();
	}

	public double[] getPointRef() {
		return getKey();
	}

	@java.lang.Override
	public double[] getValue() {
		final double[] v = super.getValue();
		return v == null ? null : v.clone();
	}

	public double[] getValueRef() {
		return super.getValue();
	}
}


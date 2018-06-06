

package org.apache.commons.math.optimization;


public class VectorialPointValuePair implements java.io.Serializable {
	private static final long serialVersionUID = 1003888396256744753L;

	private final double[] point;

	private final double[] value;

	public VectorialPointValuePair(final double[] point, final double[] value) {
		this.point = (point == null) ? null : point.clone();
		this.value = (value == null) ? null : value.clone();
	}

	public VectorialPointValuePair(final double[] point, final double[] value, final boolean copyArray) {
		this.point = (copyArray) ? point == null ? null : point.clone() : point;
		this.value = (copyArray) ? value == null ? null : value.clone() : value;
	}

	public double[] getPoint() {
		return (point) == null ? null : point.clone();
	}

	public double[] getPointRef() {
		return point;
	}

	public double[] getValue() {
		return (value) == null ? null : value.clone();
	}

	public double[] getValueRef() {
		return value;
	}
}




package org.apache.commons.math3.optimization;


@java.lang.Deprecated
public class PointVectorValuePair extends org.apache.commons.math3.util.Pair<double[], double[]> implements java.io.Serializable {
	private static final long serialVersionUID = 20120513L;

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

	private java.lang.Object writeReplace() {
		return new org.apache.commons.math3.optimization.PointVectorValuePair.DataTransferObject(getKey(), getValue());
	}

	private static class DataTransferObject implements java.io.Serializable {
		private static final long serialVersionUID = 20120513L;

		private final double[] point;

		private final double[] value;

		public DataTransferObject(final double[] point, final double[] value) {
			this.point = point.clone();
			this.value = value.clone();
		}

		private java.lang.Object readResolve() {
			return new org.apache.commons.math3.optimization.PointVectorValuePair(point, value, false);
		}
	}
}


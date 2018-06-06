

package org.apache.commons.math3.optimization;


public class PointValuePair extends org.apache.commons.math3.util.Pair<double[], java.lang.Double> implements java.io.Serializable {
	private static final long serialVersionUID = 20120513L;

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

	private java.lang.Object writeReplace() {
		return new org.apache.commons.math3.optimization.PointValuePair.DataTransferObject(getKey(), getValue());
	}

	private static class DataTransferObject implements java.io.Serializable {
		private static final long serialVersionUID = 20120513L;

		final double[] point;

		final double value;

		public DataTransferObject(final double[] point, final double value) {
			this.point = point.clone();
			this.value = value;
		}

		private java.lang.Object readResolve() {
			return new org.apache.commons.math3.optimization.PointValuePair(point, value, false);
		}
	}
}


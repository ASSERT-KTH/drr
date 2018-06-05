

package org.apache.commons.math.stat.descriptive;


public abstract class AbstractUnivariateStatistic implements org.apache.commons.math.stat.descriptive.UnivariateStatistic {
	public double evaluate(final double[] values) {
		test(values, 0, 0);
		return evaluate(values, 0, values.length);
	}

	public abstract double evaluate(final double[] values, final int begin, final int length);

	public abstract org.apache.commons.math.stat.descriptive.UnivariateStatistic copy();

	protected boolean test(final double[] values, final int begin, final int length) {
		if (values == null) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("input values array is null");
		}
		if (begin < 0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("start position cannot be negative ({0})", begin);
		}
		if (length < 0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("length cannot be negative ({0})", length);
		}
		if ((begin + length) > (values.length)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("subarray ends after array end");
		}
		if (length == 0) {
			return false;
		}
		return true;
	}
}


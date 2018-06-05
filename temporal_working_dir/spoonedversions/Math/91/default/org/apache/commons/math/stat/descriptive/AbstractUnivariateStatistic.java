

package org.apache.commons.math.stat.descriptive;


public abstract class AbstractUnivariateStatistic implements java.io.Serializable , org.apache.commons.math.stat.descriptive.UnivariateStatistic {
	private static final long serialVersionUID = -8007759382851708045L;

	public double evaluate(final double[] values) {
		test(values, 0, 0);
		return evaluate(values, 0, values.length);
	}

	public abstract double evaluate(final double[] values, final int begin, final int length);

	public abstract org.apache.commons.math.stat.descriptive.UnivariateStatistic copy();

	protected boolean test(final double[] values, final int begin, final int length) {
		if (values == null) {
			throw new java.lang.IllegalArgumentException("input value array is null");
		}
		if (begin < 0) {
			throw new java.lang.IllegalArgumentException("start position cannot be negative");
		}
		if (length < 0) {
			throw new java.lang.IllegalArgumentException("length cannot be negative");
		}
		if ((begin + length) > (values.length)) {
			throw new java.lang.IllegalArgumentException("begin + length > values.length");
		}
		if (length == 0) {
			return false;
		}
		return true;
	}
}


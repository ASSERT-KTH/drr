

package org.apache.commons.math3.stat.descriptive;


public abstract class AbstractUnivariateStatistic implements org.apache.commons.math3.stat.descriptive.UnivariateStatistic {
	private double[] storedData;

	public void setData(final double[] values) {
		storedData = (values == null) ? null : values.clone();
	}

	public double[] getData() {
		return (storedData) == null ? null : storedData.clone();
	}

	protected double[] getDataRef() {
		return storedData;
	}

	public void setData(final double[] values, final int begin, final int length) {
		storedData = new double[length];
		java.lang.System.arraycopy(values, begin, storedData, 0, length);
	}

	public double evaluate() {
		return evaluate(storedData);
	}

	public double evaluate(final double[] values) {
		test(values, 0, 0);
		return evaluate(values, 0, values.length);
	}

	public abstract double evaluate(final double[] values, final int begin, final int length);

	public abstract org.apache.commons.math3.stat.descriptive.UnivariateStatistic copy();

	protected boolean test(final double[] values, final int begin, final int length) {
		return test(values, begin, length, false);
	}

	protected boolean test(final double[] values, final int begin, final int length, final boolean allowEmpty) {
		if (values == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.INPUT_ARRAY);
		}
		if (begin < 0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.START_POSITION, begin);
		}
		if (length < 0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.LENGTH, length);
		}
		if ((begin + length) > (values.length)) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(org.apache.commons.math3.exception.util.LocalizedFormats.SUBARRAY_ENDS_AFTER_ARRAY_END, (begin + length), values.length, true);
		}
		if ((length == 0) && (!allowEmpty)) {
			return false;
		}
		return true;
	}

	protected boolean test(final double[] values, final double[] weights, final int begin, final int length) {
		return test(values, weights, begin, length, false);
	}

	protected boolean test(final double[] values, final double[] weights, final int begin, final int length, final boolean allowEmpty) {
		if (weights == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.INPUT_ARRAY);
		}
		if ((weights.length) != (values.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(weights.length, values.length);
		}
		boolean containsPositiveWeight = false;
		for (int i = begin; i < (begin + length); i++) {
			if (java.lang.Double.isNaN(weights[i])) {
				throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.NAN_ELEMENT_AT_INDEX, i);
			}
			if (java.lang.Double.isInfinite(weights[i])) {
				throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_ARRAY_ELEMENT, weights[i], i);
			}
			if ((weights[i]) < 0) {
				throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX, i, weights[i]);
			}
			if ((!containsPositiveWeight) && ((weights[i]) > 0.0)) {
				containsPositiveWeight = true;
			}
		}
		if (!containsPositiveWeight) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.WEIGHT_AT_LEAST_ONE_NON_ZERO);
		}
		return test(values, begin, length, allowEmpty);
	}
}


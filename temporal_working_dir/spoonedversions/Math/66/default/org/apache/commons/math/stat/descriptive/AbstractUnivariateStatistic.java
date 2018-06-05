

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
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.util.LocalizedFormats.NULL_INPUT_ARRAY);
		}
		if (begin < 0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.util.LocalizedFormats.NEGATIVE_START_POSITION, begin);
		}
		if (length < 0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.util.LocalizedFormats.NEGATIVE_LENGTH, length);
		}
		if ((begin + length) > (values.length)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.util.LocalizedFormats.SUBARRAY_ENDS_AFTER_ARRAY_END);
		}
		if (length == 0) {
			return false;
		}
		return true;
	}

	protected boolean test(final double[] values, final double[] weights, final int begin, final int length) {
		if (weights == null) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.util.LocalizedFormats.NULL_INPUT_ARRAY);
		}
		if ((weights.length) != (values.length)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.util.LocalizedFormats.DIMENSIONS_MISMATCH_SIMPLE, weights.length, values.length);
		}
		boolean containsPositiveWeight = false;
		for (int i = begin; i < (begin + length); i++) {
			if (java.lang.Double.isNaN(weights[i])) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.util.LocalizedFormats.NAN_ELEMENT_AT_INDEX, i);
			}
			if (java.lang.Double.isInfinite(weights[i])) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.util.LocalizedFormats.INFINITE_ARRAY_ELEMENT, weights[i], i);
			}
			if ((weights[i]) < 0) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX, i, weights[i]);
			}
			if ((!containsPositiveWeight) && ((weights[i]) > 0.0)) {
				containsPositiveWeight = true;
			}
		}
		if (!containsPositiveWeight) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.util.LocalizedFormats.WEIGHT_AT_LEAST_ONE_NON_ZERO);
		}
		return test(values, begin, length);
	}
}


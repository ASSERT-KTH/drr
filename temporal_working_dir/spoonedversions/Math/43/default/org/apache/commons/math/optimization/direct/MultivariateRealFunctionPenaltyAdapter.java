

package org.apache.commons.math.optimization.direct;


public class MultivariateRealFunctionPenaltyAdapter implements org.apache.commons.math.analysis.MultivariateRealFunction {
	private final org.apache.commons.math.analysis.MultivariateRealFunction bounded;

	private final double[] lower;

	private final double[] upper;

	private final double offset;

	private final double[] scale;

	public MultivariateRealFunctionPenaltyAdapter(final org.apache.commons.math.analysis.MultivariateRealFunction bounded, final double[] lower, final double[] upper, final double offset, final double[] scale) {
		org.apache.commons.math.util.MathUtils.checkNotNull(lower);
		org.apache.commons.math.util.MathUtils.checkNotNull(upper);
		org.apache.commons.math.util.MathUtils.checkNotNull(scale);
		if ((lower.length) != (upper.length)) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(lower.length, upper.length);
		}
		if ((lower.length) != (scale.length)) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(lower.length, scale.length);
		}
		for (int i = 0; i < (lower.length); ++i) {
			if (!((upper[i]) >= (lower[i]))) {
				throw new org.apache.commons.math.exception.NumberIsTooSmallException(upper[i], lower[i], true);
			}
		}
		this.bounded = bounded;
		this.lower = lower.clone();
		this.upper = upper.clone();
		this.offset = offset;
		this.scale = scale.clone();
	}

	public double value(double[] point) {
		for (int i = 0; i < (scale.length); ++i) {
			if (((point[i]) < (lower[i])) || ((point[i]) > (upper[i]))) {
				double sum = 0;
				for (int j = i; j < (scale.length); ++j) {
					final double overshoot;
					if ((point[j]) < (lower[j])) {
						overshoot = (lower[j]) - (point[j]);
					}else
						if ((point[j]) > (upper[j])) {
							overshoot = (point[j]) - (upper[j]);
						}else {
							overshoot = 0;
						}
					
					sum += org.apache.commons.math.util.FastMath.sqrt(overshoot);
				}
				return (offset) + sum;
			}
		}
		return bounded.value(point);
	}
}


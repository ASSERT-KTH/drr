

package org.apache.commons.math3.optimization.direct;


@java.lang.Deprecated
public class MultivariateFunctionMappingAdapter implements org.apache.commons.math3.analysis.MultivariateFunction {
	private final org.apache.commons.math3.analysis.MultivariateFunction bounded;

	private final org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.Mapper[] mappers;

	public MultivariateFunctionMappingAdapter(final org.apache.commons.math3.analysis.MultivariateFunction bounded, final double[] lower, final double[] upper) {
		org.apache.commons.math3.util.MathUtils.checkNotNull(lower);
		org.apache.commons.math3.util.MathUtils.checkNotNull(upper);
		if ((lower.length) != (upper.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(lower.length, upper.length);
		}
		for (int i = 0; i < (lower.length); ++i) {
			if (!((upper[i]) >= (lower[i]))) {
				throw new org.apache.commons.math3.exception.NumberIsTooSmallException(upper[i], lower[i], true);
			}
		}
		this.bounded = bounded;
		this.mappers = new org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.Mapper[lower.length];
		for (int i = 0; i < (mappers.length); ++i) {
			if (java.lang.Double.isInfinite(lower[i])) {
				if (java.lang.Double.isInfinite(upper[i])) {
					mappers[i] = new org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.NoBoundsMapper();
				}else {
					mappers[i] = new org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.UpperBoundMapper(upper[i]);
				}
			}else {
				if (java.lang.Double.isInfinite(upper[i])) {
					mappers[i] = new org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.LowerBoundMapper(lower[i]);
				}else {
					mappers[i] = new org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.LowerUpperBoundMapper(lower[i], upper[i]);
				}
			}
		}
	}

	public double[] unboundedToBounded(double[] point) {
		final double[] mapped = new double[mappers.length];
		for (int i = 0; i < (mappers.length); ++i) {
			mapped[i] = mappers[i].unboundedToBounded(point[i]);
		}
		return mapped;
	}

	public double[] boundedToUnbounded(double[] point) {
		final double[] mapped = new double[mappers.length];
		for (int i = 0; i < (mappers.length); ++i) {
			mapped[i] = mappers[i].boundedToUnbounded(point[i]);
		}
		return mapped;
	}

	public double value(double[] point) {
		return bounded.value(unboundedToBounded(point));
	}

	private interface Mapper {
		double unboundedToBounded(double y);

		double boundedToUnbounded(double x);
	}

	private static class NoBoundsMapper implements org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.Mapper {
		public NoBoundsMapper() {
		}

		public double unboundedToBounded(final double y) {
			return y;
		}

		public double boundedToUnbounded(final double x) {
			return x;
		}
	}

	private static class LowerBoundMapper implements org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.Mapper {
		private final double lower;

		public LowerBoundMapper(final double lower) {
			this.lower = lower;
		}

		public double unboundedToBounded(final double y) {
			return (lower) + (org.apache.commons.math3.util.FastMath.exp(y));
		}

		public double boundedToUnbounded(final double x) {
			return org.apache.commons.math3.util.FastMath.log((x - (lower)));
		}
	}

	private static class UpperBoundMapper implements org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.Mapper {
		private final double upper;

		public UpperBoundMapper(final double upper) {
			this.upper = upper;
		}

		public double unboundedToBounded(final double y) {
			return (upper) - (org.apache.commons.math3.util.FastMath.exp((-y)));
		}

		public double boundedToUnbounded(final double x) {
			return -(org.apache.commons.math3.util.FastMath.log(((upper) - x)));
		}
	}

	private static class LowerUpperBoundMapper implements org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.Mapper {
		private final org.apache.commons.math3.analysis.UnivariateFunction boundingFunction;

		private final org.apache.commons.math3.analysis.UnivariateFunction unboundingFunction;

		public LowerUpperBoundMapper(final double lower, final double upper) {
			boundingFunction = new org.apache.commons.math3.analysis.function.Sigmoid(lower, upper);
			unboundingFunction = new org.apache.commons.math3.analysis.function.Logit(lower, upper);
		}

		public double unboundedToBounded(final double y) {
			return boundingFunction.value(y);
		}

		public double boundedToUnbounded(final double x) {
			return unboundingFunction.value(x);
		}
	}
}


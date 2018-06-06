

package org.apache.commons.math.optimization.direct;


public class MultivariateRealFunctionMappingAdapter implements org.apache.commons.math.analysis.MultivariateRealFunction {
	private final org.apache.commons.math.analysis.MultivariateRealFunction bounded;

	private final org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.Mapper[] mappers;

	public MultivariateRealFunctionMappingAdapter(final org.apache.commons.math.analysis.MultivariateRealFunction bounded, final double[] lower, final double[] upper) {
		org.apache.commons.math.util.MathUtils.checkNotNull(lower);
		org.apache.commons.math.util.MathUtils.checkNotNull(upper);
		if ((lower.length) != (upper.length)) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(lower.length, upper.length);
		}
		for (int i = 0; i < (lower.length); ++i) {
			if (!((upper[i]) >= (lower[i]))) {
				throw new org.apache.commons.math.exception.NumberIsTooSmallException(upper[i], lower[i], true);
			}
		}
		this.bounded = bounded;
		this.mappers = new org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.Mapper[lower.length];
		for (int i = 0; i < (mappers.length); ++i) {
			if (java.lang.Double.isInfinite(lower[i])) {
				if (java.lang.Double.isInfinite(upper[i])) {
					mappers[i] = new org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.NoBoundsMapper();
				}else {
					mappers[i] = new org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.UpperBoundMapper(upper[i]);
				}
			}else {
				if (java.lang.Double.isInfinite(upper[i])) {
					mappers[i] = new org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.LowerBoundMapper(lower[i]);
				}else {
					mappers[i] = new org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.LowerUpperBoundMapper(lower[i], upper[i]);
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

	private static interface Mapper {
		public double unboundedToBounded(double y);

		public double boundedToUnbounded(double x);
	}

	private static class NoBoundsMapper implements org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.Mapper {
		public NoBoundsMapper() {
		}

		public double unboundedToBounded(final double y) {
			return y;
		}

		public double boundedToUnbounded(final double x) {
			return x;
		}
	}

	private static class LowerBoundMapper implements org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.Mapper {
		private final double lower;

		public LowerBoundMapper(final double lower) {
			this.lower = lower;
		}

		public double unboundedToBounded(final double y) {
			return (lower) + (org.apache.commons.math.util.FastMath.exp(y));
		}

		public double boundedToUnbounded(final double x) {
			return org.apache.commons.math.util.FastMath.log((x - (lower)));
		}
	}

	private static class UpperBoundMapper implements org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.Mapper {
		private final double upper;

		public UpperBoundMapper(final double upper) {
			this.upper = upper;
		}

		public double unboundedToBounded(final double y) {
			return (upper) - (org.apache.commons.math.util.FastMath.exp((-y)));
		}

		public double boundedToUnbounded(final double x) {
			return -(org.apache.commons.math.util.FastMath.log(((upper) - x)));
		}
	}

	private static class LowerUpperBoundMapper implements org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.Mapper {
		private final org.apache.commons.math.analysis.UnivariateRealFunction boundingFunction;

		private final org.apache.commons.math.analysis.UnivariateRealFunction unboundingFunction;

		public LowerUpperBoundMapper(final double lower, final double upper) {
			boundingFunction = new org.apache.commons.math.analysis.function.Sigmoid(lower, upper);
			unboundingFunction = new org.apache.commons.math.analysis.function.Logit(lower, upper);
		}

		public double unboundedToBounded(final double y) {
			return boundingFunction.value(y);
		}

		public double boundedToUnbounded(final double x) {
			return unboundingFunction.value(x);
		}
	}
}


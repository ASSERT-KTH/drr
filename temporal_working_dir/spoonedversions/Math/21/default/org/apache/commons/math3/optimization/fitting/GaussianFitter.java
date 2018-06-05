

package org.apache.commons.math3.optimization.fitting;


public class GaussianFitter extends org.apache.commons.math3.optimization.fitting.CurveFitter<org.apache.commons.math3.analysis.function.Gaussian.Parametric> {
	public GaussianFitter(org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer optimizer) {
		super(optimizer);
	}

	public double[] fit(double[] initialGuess) {
		final org.apache.commons.math3.analysis.function.Gaussian.Parametric f = new org.apache.commons.math3.analysis.function.Gaussian.Parametric() {
			@java.lang.Override
			public double value(double x, double... p) {
				double v = java.lang.Double.POSITIVE_INFINITY;
				try {
					v = super.value(x, p);
				} catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
				}
				return v;
			}

			@java.lang.Override
			public double[] gradient(double x, double... p) {
				double[] v = new double[]{ java.lang.Double.POSITIVE_INFINITY , java.lang.Double.POSITIVE_INFINITY , java.lang.Double.POSITIVE_INFINITY };
				try {
					v = super.gradient(x, p);
				} catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
				}
				return v;
			}
		};
		return fit(f, initialGuess);
	}

	public double[] fit() {
		final double[] guess = new org.apache.commons.math3.optimization.fitting.GaussianFitter.ParameterGuesser(getObservations()).guess();
		return fit(guess);
	}

	public static class ParameterGuesser {
		private final double norm;

		private final double mean;

		private final double sigma;

		public ParameterGuesser(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] observations) {
			if (observations == null) {
				throw new org.apache.commons.math3.exception.NullArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.INPUT_ARRAY);
			}
			if ((observations.length) < 3) {
				throw new org.apache.commons.math3.exception.NumberIsTooSmallException(observations.length, 3, true);
			}
			final org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] sorted = sortObservations(observations);
			final double[] params = basicGuess(sorted);
			norm = params[0];
			mean = params[1];
			sigma = params[2];
		}

		public double[] guess() {
			return new double[]{ norm , mean , sigma };
		}

		private org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] sortObservations(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] unsorted) {
			final org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] observations = unsorted.clone();
			final java.util.Comparator<org.apache.commons.math3.optimization.fitting.WeightedObservedPoint> cmp = new java.util.Comparator<org.apache.commons.math3.optimization.fitting.WeightedObservedPoint>() {
				public int compare(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint p1, org.apache.commons.math3.optimization.fitting.WeightedObservedPoint p2) {
					if ((p1 == null) && (p2 == null)) {
						return 0;
					}
					if (p1 == null) {
						return -1;
					}
					if (p2 == null) {
						return 1;
					}
					if ((p1.getX()) < (p2.getX())) {
						return -1;
					}
					if ((p1.getX()) > (p2.getX())) {
						return 1;
					}
					if ((p1.getY()) < (p2.getY())) {
						return -1;
					}
					if ((p1.getY()) > (p2.getY())) {
						return 1;
					}
					if ((p1.getWeight()) < (p2.getWeight())) {
						return -1;
					}
					if ((p1.getWeight()) > (p2.getWeight())) {
						return 1;
					}
					return 0;
				}
			};
			java.util.Arrays.sort(observations, cmp);
			return observations;
		}

		private double[] basicGuess(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] points) {
			final int maxYIdx = findMaxY(points);
			final double n = points[maxYIdx].getY();
			final double m = points[maxYIdx].getX();
			double fwhmApprox;
			try {
				final double halfY = n + ((m - n) / 2);
				final double fwhmX1 = interpolateXAtY(points, maxYIdx, (-1), halfY);
				final double fwhmX2 = interpolateXAtY(points, maxYIdx, 1, halfY);
				fwhmApprox = fwhmX2 - fwhmX1;
			} catch (org.apache.commons.math3.exception.OutOfRangeException e) {
				fwhmApprox = (points[((points.length) - 1)].getX()) - (points[0].getX());
			}
			final double s = fwhmApprox / (2 * (org.apache.commons.math3.util.FastMath.sqrt((2 * (org.apache.commons.math3.util.FastMath.log(2))))));
			return new double[]{ n , m , s };
		}

		private int findMaxY(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] points) {
			int maxYIdx = 0;
			for (int i = 1; i < (points.length); i++) {
				if ((points[i].getY()) > (points[maxYIdx].getY())) {
					maxYIdx = i;
				}
			}
			return maxYIdx;
		}

		private double interpolateXAtY(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] points, int startIdx, int idxStep, double y) throws org.apache.commons.math3.exception.OutOfRangeException {
			if (idxStep == 0) {
				throw new org.apache.commons.math3.exception.ZeroException();
			}
			final org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] twoPoints = getInterpolationPointsForY(points, startIdx, idxStep, y);
			final org.apache.commons.math3.optimization.fitting.WeightedObservedPoint p1 = twoPoints[0];
			final org.apache.commons.math3.optimization.fitting.WeightedObservedPoint p2 = twoPoints[1];
			if ((p1.getY()) == y) {
				return p1.getX();
			}
			if ((p2.getY()) == y) {
				return p2.getX();
			}
			return (p1.getX()) + (((y - (p1.getY())) * ((p2.getX()) - (p1.getX()))) / ((p2.getY()) - (p1.getY())));
		}

		private org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] getInterpolationPointsForY(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] points, int startIdx, int idxStep, double y) throws org.apache.commons.math3.exception.OutOfRangeException {
			if (idxStep == 0) {
				throw new org.apache.commons.math3.exception.ZeroException();
			}
			for (int i = startIdx; idxStep < 0 ? (i + idxStep) >= 0 : (i + idxStep) < (points.length); i += idxStep) {
				final org.apache.commons.math3.optimization.fitting.WeightedObservedPoint p1 = points[i];
				final org.apache.commons.math3.optimization.fitting.WeightedObservedPoint p2 = points[(i + idxStep)];
				if (isBetween(y, p1.getY(), p2.getY())) {
					if (idxStep < 0) {
						return new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[]{ p2 , p1 };
					}else {
						return new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[]{ p1 , p2 };
					}
				}
			}
			throw new org.apache.commons.math3.exception.OutOfRangeException(y, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
		}

		private boolean isBetween(double value, double boundary1, double boundary2) {
			return ((value >= boundary1) && (value <= boundary2)) || ((value >= boundary2) && (value <= boundary1));
		}
	}
}


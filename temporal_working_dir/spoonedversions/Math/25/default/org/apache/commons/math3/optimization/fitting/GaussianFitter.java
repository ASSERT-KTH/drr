

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
		private final org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] observations;

		private double[] parameters;

		public ParameterGuesser(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] observations) {
			if (observations == null) {
				throw new org.apache.commons.math3.exception.NullArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.INPUT_ARRAY);
			}
			if ((observations.length) < 3) {
				throw new org.apache.commons.math3.exception.NumberIsTooSmallException(observations.length, 3, true);
			}
			this.observations = observations.clone();
		}

		public double[] guess() {
			if ((parameters) == null) {
				parameters = basicGuess(observations);
			}
			return parameters.clone();
		}

		private double[] basicGuess(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] points) {
			java.util.Arrays.sort(points, createWeightedObservedPointComparator());
			double[] params = new double[3];
			int maxYIdx = findMaxY(points);
			params[0] = points[maxYIdx].getY();
			params[1] = points[maxYIdx].getX();
			double fwhmApprox;
			try {
				double halfY = (params[0]) + (((params[1]) - (params[0])) / 2.0);
				double fwhmX1 = interpolateXAtY(points, maxYIdx, (-1), halfY);
				double fwhmX2 = interpolateXAtY(points, maxYIdx, (+1), halfY);
				fwhmApprox = fwhmX2 - fwhmX1;
			} catch (org.apache.commons.math3.exception.OutOfRangeException e) {
				fwhmApprox = (points[((points.length) - 1)].getX()) - (points[0].getX());
			}
			params[2] = fwhmApprox / (2.0 * (java.lang.Math.sqrt((2.0 * (java.lang.Math.log(2.0))))));
			return params;
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
			org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] twoPoints = getInterpolationPointsForY(points, startIdx, idxStep, y);
			org.apache.commons.math3.optimization.fitting.WeightedObservedPoint pointA = twoPoints[0];
			org.apache.commons.math3.optimization.fitting.WeightedObservedPoint pointB = twoPoints[1];
			if ((pointA.getY()) == y) {
				return pointA.getX();
			}
			if ((pointB.getY()) == y) {
				return pointB.getX();
			}
			return (pointA.getX()) + (((y - (pointA.getY())) * ((pointB.getX()) - (pointA.getX()))) / ((pointB.getY()) - (pointA.getY())));
		}

		private org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] getInterpolationPointsForY(org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] points, int startIdx, int idxStep, double y) throws org.apache.commons.math3.exception.OutOfRangeException {
			if (idxStep == 0) {
				throw new org.apache.commons.math3.exception.ZeroException();
			}
			for (int i = startIdx; idxStep < 0 ? (i + idxStep) >= 0 : (i + idxStep) < (points.length); i += idxStep) {
				if (isBetween(y, points[i].getY(), points[(i + idxStep)].getY())) {
					return idxStep < 0 ? new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[]{ points[(i + idxStep)] , points[i] } : new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[]{ points[i] , points[(i + idxStep)] };
				}
			}
			double minY = java.lang.Double.POSITIVE_INFINITY;
			double maxY = java.lang.Double.NEGATIVE_INFINITY;
			for (final org.apache.commons.math3.optimization.fitting.WeightedObservedPoint point : points) {
				minY = java.lang.Math.min(minY, point.getY());
				maxY = java.lang.Math.max(maxY, point.getY());
			}
			throw new org.apache.commons.math3.exception.OutOfRangeException(y, minY, maxY);
		}

		private boolean isBetween(double value, double boundary1, double boundary2) {
			return ((value >= boundary1) && (value <= boundary2)) || ((value >= boundary2) && (value <= boundary1));
		}

		private java.util.Comparator<org.apache.commons.math3.optimization.fitting.WeightedObservedPoint> createWeightedObservedPointComparator() {
			return new java.util.Comparator<org.apache.commons.math3.optimization.fitting.WeightedObservedPoint>() {
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
		}
	}
}




package org.apache.commons.math3.fitting;


public class HarmonicFitter extends org.apache.commons.math3.fitting.CurveFitter<org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric> {
	public HarmonicFitter(final org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer optimizer) {
		super(optimizer);
	}

	public double[] fit(double[] initialGuess) {
		return fit(new org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric(), initialGuess);
	}

	public double[] fit() {
		return fit(new org.apache.commons.math3.fitting.HarmonicFitter.ParameterGuesser(getObservations()).guess());
	}

	public static class ParameterGuesser {
		private final double a;

		private final double omega;

		private final double phi;

		public ParameterGuesser(org.apache.commons.math3.fitting.WeightedObservedPoint[] observations) {
			if ((observations.length) < 4) {
				throw new org.apache.commons.math3.exception.NumberIsTooSmallException(org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_OBSERVED_POINTS_IN_SAMPLE, observations.length, 4, true);
			}
			final org.apache.commons.math3.fitting.WeightedObservedPoint[] sorted = sortObservations(observations);
			final double[] aOmega = guessAOmega(sorted);
			a = aOmega[0];
			omega = aOmega[1];
			phi = guessPhi(sorted);
		}

		public double[] guess() {
			return new double[]{ a , omega , phi };
		}

		private org.apache.commons.math3.fitting.WeightedObservedPoint[] sortObservations(org.apache.commons.math3.fitting.WeightedObservedPoint[] unsorted) {
			final org.apache.commons.math3.fitting.WeightedObservedPoint[] observations = unsorted.clone();
			org.apache.commons.math3.fitting.WeightedObservedPoint curr = observations[0];
			for (int j = 1; j < (observations.length); ++j) {
				org.apache.commons.math3.fitting.WeightedObservedPoint prec = curr;
				curr = observations[j];
				if ((curr.getX()) < (prec.getX())) {
					int i = j - 1;
					org.apache.commons.math3.fitting.WeightedObservedPoint mI = observations[i];
					while ((i >= 0) && ((curr.getX()) < (mI.getX()))) {
						observations[(i + 1)] = mI;
						if ((i--) != 0) {
							mI = observations[i];
						}
					} 
					observations[(i + 1)] = curr;
					curr = observations[j];
				}
			}
			return observations;
		}

		private double[] guessAOmega(org.apache.commons.math3.fitting.WeightedObservedPoint[] observations) {
			final double[] aOmega = new double[2];
			double sx2 = 0;
			double sy2 = 0;
			double sxy = 0;
			double sxz = 0;
			double syz = 0;
			double currentX = observations[0].getX();
			double currentY = observations[0].getY();
			double f2Integral = 0;
			double fPrime2Integral = 0;
			final double startX = currentX;
			for (int i = 1; i < (observations.length); ++i) {
				final double previousX = currentX;
				final double previousY = currentY;
				currentX = observations[i].getX();
				currentY = observations[i].getY();
				final double dx = currentX - previousX;
				final double dy = currentY - previousY;
				final double f2StepIntegral = (dx * (((previousY * previousY) + (previousY * currentY)) + (currentY * currentY))) / 3;
				final double fPrime2StepIntegral = (dy * dy) / dx;
				final double x = currentX - startX;
				f2Integral += f2StepIntegral;
				fPrime2Integral += fPrime2StepIntegral;
				sx2 += x * x;
				sy2 += f2Integral * f2Integral;
				sxy += x * f2Integral;
				sxz += x * fPrime2Integral;
				syz += f2Integral * fPrime2Integral;
			}
			double c1 = (sy2 * sxz) - (sxy * syz);
			double c2 = (sxy * sxz) - (sx2 * syz);
			double c3 = (sx2 * sy2) - (sxy * sxy);
			if (((c1 / c2) < 0) || ((c2 / c3) < 0)) {
				final int last = (observations.length) - 1;
				final double xRange = (observations[last].getX()) - (observations[0].getX());
				if (xRange == 0) {
					throw new org.apache.commons.math3.exception.ZeroException();
				}
				aOmega[1] = (2 * (java.lang.Math.PI)) / xRange;
				double yMin = java.lang.Double.POSITIVE_INFINITY;
				double yMax = java.lang.Double.NEGATIVE_INFINITY;
				for (int i = 1; i < (observations.length); ++i) {
					final double y = observations[i].getY();
					if (y < yMin) {
						yMin = y;
					}
					if (y > yMax) {
						yMax = y;
					}
				}
				aOmega[0] = 0.5 * (yMax - yMin);
			}else {
				if (c2 == 0) {
					throw new org.apache.commons.math3.exception.MathIllegalStateException(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_DENOMINATOR);
				}
				aOmega[0] = org.apache.commons.math3.util.FastMath.sqrt((c1 / c2));
				aOmega[1] = org.apache.commons.math3.util.FastMath.sqrt((c2 / c3));
			}
			return aOmega;
		}

		private double guessPhi(org.apache.commons.math3.fitting.WeightedObservedPoint[] observations) {
			double fcMean = 0;
			double fsMean = 0;
			double currentX = observations[0].getX();
			double currentY = observations[0].getY();
			for (int i = 1; i < (observations.length); ++i) {
				final double previousX = currentX;
				final double previousY = currentY;
				currentX = observations[i].getX();
				currentY = observations[i].getY();
				final double currentYPrime = (currentY - previousY) / (currentX - previousX);
				double omegaX = (omega) * currentX;
				double cosine = org.apache.commons.math3.util.FastMath.cos(omegaX);
				double sine = org.apache.commons.math3.util.FastMath.sin(omegaX);
				fcMean += (((omega) * currentY) * cosine) - (currentYPrime * sine);
				fsMean += (((omega) * currentY) * sine) + (currentYPrime * cosine);
			}
			return org.apache.commons.math3.util.FastMath.atan2((-fsMean), fcMean);
		}
	}
}


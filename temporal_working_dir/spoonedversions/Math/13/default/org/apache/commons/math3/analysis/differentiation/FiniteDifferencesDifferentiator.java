

package org.apache.commons.math3.analysis.differentiation;


public class FiniteDifferencesDifferentiator implements java.io.Serializable , org.apache.commons.math3.analysis.differentiation.UnivariateFunctionDifferentiator , org.apache.commons.math3.analysis.differentiation.UnivariateMatrixFunctionDifferentiator , org.apache.commons.math3.analysis.differentiation.UnivariateVectorFunctionDifferentiator {
	private static final long serialVersionUID = 20120917L;

	private final int nbPoints;

	private final double stepSize;

	private final double halfSampleSpan;

	private final double tMin;

	private final double tMax;

	public FiniteDifferencesDifferentiator(final int nbPoints, final double stepSize) throws org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		this(nbPoints, stepSize, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
	}

	public FiniteDifferencesDifferentiator(final int nbPoints, final double stepSize, final double tLower, final double tUpper) throws org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NumberIsTooLargeException, org.apache.commons.math3.exception.NumberIsTooSmallException {
		if (nbPoints <= 1) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(stepSize, 1, false);
		}
		this.nbPoints = nbPoints;
		if (stepSize <= 0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(stepSize);
		}
		this.stepSize = stepSize;
		halfSampleSpan = (0.5 * stepSize) * (nbPoints - 1);
		if ((2 * (halfSampleSpan)) >= (tUpper - tLower)) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException((2 * (halfSampleSpan)), (tUpper - tLower), false);
		}
		final double safety = org.apache.commons.math3.util.FastMath.ulp(halfSampleSpan);
		this.tMin = (tLower + (halfSampleSpan)) + safety;
		this.tMax = (tUpper - (halfSampleSpan)) - safety;
	}

	public int getNbPoints() {
		return nbPoints;
	}

	public double getStepSize() {
		return stepSize;
	}

	private org.apache.commons.math3.analysis.differentiation.DerivativeStructure evaluate(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure t, final double t0, final double[] y) throws org.apache.commons.math3.exception.NumberIsTooLargeException {
		final double[] top = new double[nbPoints];
		final double[] bottom = new double[nbPoints];
		for (int i = 0; i < (nbPoints); ++i) {
			bottom[i] = y[i];
			for (int j = 1; j <= i; ++j) {
				bottom[(i - j)] = ((bottom[((i - j) + 1)]) - (bottom[(i - j)])) / (j * (stepSize));
			}
			top[i] = bottom[0];
		}
		final int order = t.getOrder();
		final int parameters = t.getFreeParameters();
		final double[] derivatives = t.getAllDerivatives();
		final double dt0 = (t.getValue()) - t0;
		org.apache.commons.math3.analysis.differentiation.DerivativeStructure interpolation = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(parameters, order, 0.0);
		org.apache.commons.math3.analysis.differentiation.DerivativeStructure monomial = null;
		for (int i = 0; i < (nbPoints); ++i) {
			if (i == 0) {
				monomial = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(parameters, order, 1.0);
			}else {
				derivatives[0] = dt0 - ((i - 1) * (stepSize));
				final org.apache.commons.math3.analysis.differentiation.DerivativeStructure deltaX = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(parameters, order, derivatives);
				monomial = monomial.multiply(deltaX);
			}
			interpolation = interpolation.add(monomial.multiply(top[i]));
		}
		return interpolation;
	}

	public org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction differentiate(final org.apache.commons.math3.analysis.UnivariateFunction function) {
		return new org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction() {
			public double value(final double x) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
				return function.value(x);
			}

			public org.apache.commons.math3.analysis.differentiation.DerivativeStructure value(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure t) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
				if ((t.getOrder()) >= (nbPoints)) {
					throw new org.apache.commons.math3.exception.NumberIsTooLargeException(t.getOrder(), nbPoints, false);
				}
				final double t0 = (org.apache.commons.math3.util.FastMath.max(org.apache.commons.math3.util.FastMath.min(t.getValue(), tMax), tMin)) - (halfSampleSpan);
				final double[] y = new double[nbPoints];
				for (int i = 0; i < (nbPoints); ++i) {
					y[i] = function.value((t0 + (i * (stepSize))));
				}
				return evaluate(t, t0, y);
			}
		};
	}

	public org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableVectorFunction differentiate(final org.apache.commons.math3.analysis.UnivariateVectorFunction function) {
		return new org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableVectorFunction() {
			public double[] value(final double x) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
				return function.value(x);
			}

			public org.apache.commons.math3.analysis.differentiation.DerivativeStructure[] value(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure t) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
				if ((t.getOrder()) >= (nbPoints)) {
					throw new org.apache.commons.math3.exception.NumberIsTooLargeException(t.getOrder(), nbPoints, false);
				}
				final double t0 = (org.apache.commons.math3.util.FastMath.max(org.apache.commons.math3.util.FastMath.min(t.getValue(), tMax), tMin)) - (halfSampleSpan);
				double[][] y = null;
				for (int i = 0; i < (nbPoints); ++i) {
					final double[] v = function.value((t0 + (i * (stepSize))));
					if (i == 0) {
						y = new double[v.length][nbPoints];
					}
					for (int j = 0; j < (v.length); ++j) {
						y[j][i] = v[j];
					}
				}
				final org.apache.commons.math3.analysis.differentiation.DerivativeStructure[] value = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure[y.length];
				for (int j = 0; j < (value.length); ++j) {
					value[j] = evaluate(t, t0, y[j]);
				}
				return value;
			}
		};
	}

	public org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableMatrixFunction differentiate(final org.apache.commons.math3.analysis.UnivariateMatrixFunction function) {
		return new org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableMatrixFunction() {
			public double[][] value(final double x) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
				return function.value(x);
			}

			public org.apache.commons.math3.analysis.differentiation.DerivativeStructure[][] value(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure t) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
				if ((t.getOrder()) >= (nbPoints)) {
					throw new org.apache.commons.math3.exception.NumberIsTooLargeException(t.getOrder(), nbPoints, false);
				}
				final double t0 = (org.apache.commons.math3.util.FastMath.max(org.apache.commons.math3.util.FastMath.min(t.getValue(), tMax), tMin)) - (halfSampleSpan);
				double[][][] y = null;
				for (int i = 0; i < (nbPoints); ++i) {
					final double[][] v = function.value((t0 + (i * (stepSize))));
					if (i == 0) {
						y = new double[v.length][v[0].length][nbPoints];
					}
					for (int j = 0; j < (v.length); ++j) {
						for (int k = 0; k < (v[j].length); ++k) {
							y[j][k][i] = v[j][k];
						}
					}
				}
				final org.apache.commons.math3.analysis.differentiation.DerivativeStructure[][] value = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure[y.length][y[0].length];
				for (int j = 0; j < (value.length); ++j) {
					for (int k = 0; k < (y[j].length); ++k) {
						value[j][k] = evaluate(t, t0, y[j][k]);
					}
				}
				return value;
			}
		};
	}
}


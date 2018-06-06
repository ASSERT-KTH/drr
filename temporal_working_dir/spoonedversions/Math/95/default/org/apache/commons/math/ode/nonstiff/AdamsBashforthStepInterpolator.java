

package org.apache.commons.math.ode.nonstiff;


class AdamsBashforthStepInterpolator extends org.apache.commons.math.ode.nonstiff.MultistepStepInterpolator {
	private static final long serialVersionUID = -7179861704951334960L;

	private double[] neville;

	private double[] rollback;

	private double[] gamma;

	private int[][] bdArray;

	private double nonTruncatedEnd;

	private double nonTruncatedH;

	public AdamsBashforthStepInterpolator() {
	}

	public AdamsBashforthStepInterpolator(final org.apache.commons.math.ode.nonstiff.AdamsBashforthStepInterpolator interpolator) {
		super(interpolator);
		nonTruncatedEnd = interpolator.nonTruncatedEnd;
		nonTruncatedH = interpolator.nonTruncatedH;
	}

	protected org.apache.commons.math.ode.sampling.StepInterpolator doCopy() {
		return new org.apache.commons.math.ode.nonstiff.AdamsBashforthStepInterpolator(org.apache.commons.math.ode.nonstiff.AdamsBashforthStepInterpolator.this);
	}

	protected void initializeCoefficients() {
		neville = new double[previousF.length];
		rollback = new double[previousF.length];
		bdArray = org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator.computeBackwardDifferencesArray(previousF.length);
		org.apache.commons.math.fraction.Fraction[] fGamma = org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator.computeGammaArray(previousF.length);
		gamma = new double[fGamma.length];
		for (int i = 0; i < (fGamma.length); ++i) {
			gamma[i] = fGamma[i].doubleValue();
		}
	}

	public void storeTime(final double t) {
		nonTruncatedEnd = t;
		nonTruncatedH = (nonTruncatedEnd) - (previousTime);
		super.storeTime(t);
	}

	void truncateStep(final double truncatedEndTime) {
		currentTime = truncatedEndTime;
		h = (currentTime) - (previousTime);
	}

	public void setInterpolatedTime(final double time) throws org.apache.commons.math.ode.DerivativeException {
		interpolatedTime = time;
		final double oneMinusThetaH = (nonTruncatedEnd) - (interpolatedTime);
		final double theta = (nonTruncatedH) == 0 ? 0 : ((nonTruncatedH) - oneMinusThetaH) / (nonTruncatedH);
		computeInterpolatedState(theta, oneMinusThetaH);
	}

	protected void computeInterpolatedState(final double theta, final double oneMinusThetaH) {
		interpolateDerivatives();
		interpolateState(theta);
	}

	private void interpolateDerivatives() {
		for (int i = 0; i < (interpolatedDerivatives.length); ++i) {
			for (int k = 0; k < (previousF.length); ++k) {
				neville[k] = previousF[k][i];
			}
			for (int l = 1; l < (neville.length); ++l) {
				for (int m = (neville.length) - 1; m >= l; --m) {
					final double xm = previousT[m];
					final double xmMl = previousT[(m - l)];
					neville[m] = ((((interpolatedTime) - xm) * (neville[(m - 1)])) + ((xmMl - (interpolatedTime)) * (neville[m]))) / (xmMl - xm);
				}
			}
			interpolatedDerivatives[i] = neville[((neville.length) - 1)];
		}
	}

	private void interpolateState(final double theta) {
		computeRollback(((previousT.length) - 1), theta);
		for (int j = 0; j < (interpolatedState.length); ++j) {
			double sum = 0;
			for (int l = 0; l < (previousT.length); ++l) {
				sum += (rollback[l]) * (previousF[l][j]);
			}
			interpolatedState[j] = (currentState[j]) - ((h) * sum);
		}
	}

	private void computeRollback(final int order, final double theta) {
		double product = theta;
		rollback[0] = theta;
		for (int i = 1; i < order; ++i) {
			product *= (i + theta) / (i + 1);
			double g = product;
			for (int j = 1; j <= i; ++j) {
				g -= (rollback[(i - j)]) / (j + 1);
			}
			rollback[i] = g;
		}
		for (int i = 0; i < order; ++i) {
			rollback[i] -= gamma[i];
		}
		for (int i = 0; i < order; ++i) {
			double f = 0;
			for (int j = i; j <= order; ++j) {
				f -= (rollback[j]) * (bdArray[j][i]);
			}
			rollback[i] = f;
		}
	}

	public void writeExternal(final java.io.ObjectOutput out) throws java.io.IOException {
		super.writeExternal(out);
		out.writeDouble(nonTruncatedEnd);
	}

	public void readExternal(final java.io.ObjectInput in) throws java.io.IOException {
		nonTruncatedEnd = in.readDouble();
	}
}


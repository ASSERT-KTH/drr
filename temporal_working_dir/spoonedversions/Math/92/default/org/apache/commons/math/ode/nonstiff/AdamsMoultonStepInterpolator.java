

package org.apache.commons.math.ode.nonstiff;


class AdamsMoultonStepInterpolator extends org.apache.commons.math.ode.nonstiff.MultistepStepInterpolator {
	private static final long serialVersionUID = 735568489801241899L;

	private double[] neville;

	private double[] rollback;

	private double[] gammaStar;

	private int[][] bdArray;

	private double nonTruncatedEnd;

	private double nonTruncatedH;

	public AdamsMoultonStepInterpolator() {
	}

	public AdamsMoultonStepInterpolator(final org.apache.commons.math.ode.nonstiff.AdamsMoultonStepInterpolator interpolator) {
		super(interpolator);
		nonTruncatedEnd = interpolator.nonTruncatedEnd;
		nonTruncatedH = interpolator.nonTruncatedH;
	}

	protected org.apache.commons.math.ode.sampling.StepInterpolator doCopy() {
		return new org.apache.commons.math.ode.nonstiff.AdamsMoultonStepInterpolator(org.apache.commons.math.ode.nonstiff.AdamsMoultonStepInterpolator.this);
	}

	protected void initializeCoefficients() {
		neville = new double[previousF.length];
		rollback = new double[previousF.length];
		bdArray = org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator.computeBackwardDifferencesArray(previousF.length);
		org.apache.commons.math.fraction.Fraction[] fGammaStar = org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator.computeGammaStarArray(previousF.length);
		gammaStar = new double[fGammaStar.length];
		for (int i = 0; i < (fGammaStar.length); ++i) {
			gammaStar[i] = fGammaStar[i].doubleValue();
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
		double product = theta - 1;
		rollback[0] = theta;
		for (int i = 1; i <= order; ++i) {
			product *= ((i - 1) + theta) / (i + 1);
			double gStar = product;
			for (int j = 1; j <= i; ++j) {
				gStar -= (rollback[(i - j)]) / (j + 1);
			}
			rollback[i] = gStar;
		}
		for (int i = 0; i <= order; ++i) {
			rollback[i] -= gammaStar[i];
		}
		for (int i = 0; i <= order; ++i) {
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


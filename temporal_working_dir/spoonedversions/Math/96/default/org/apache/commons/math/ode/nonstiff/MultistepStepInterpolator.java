

package org.apache.commons.math.ode.nonstiff;


abstract class MultistepStepInterpolator extends org.apache.commons.math.ode.sampling.AbstractStepInterpolator {
	protected double[] previousT;

	protected double[][] previousF;

	protected MultistepStepInterpolator() {
		previousT = null;
		previousF = null;
	}

	public MultistepStepInterpolator(final org.apache.commons.math.ode.nonstiff.MultistepStepInterpolator interpolator) {
		super(interpolator);
		if ((interpolator.currentState) != null) {
			previousT = interpolator.previousT.clone();
			previousF = new double[interpolator.previousF.length][];
			for (int k = 0; k < (interpolator.previousF.length); ++k) {
				previousF[k] = interpolator.previousF[k].clone();
			}
			initializeCoefficients();
		}else {
			previousT = null;
			previousF = null;
		}
	}

	public void reinitialize(final double[] y, final double[] previousT, final double[][] previousF, final boolean forward) {
		reinitialize(y, forward);
		org.apache.commons.math.ode.nonstiff.MultistepStepInterpolator.this.previousT = previousT;
		org.apache.commons.math.ode.nonstiff.MultistepStepInterpolator.this.previousF = previousF;
		initializeCoefficients();
	}

	protected abstract void initializeCoefficients();

	public void writeExternal(final java.io.ObjectOutput out) throws java.io.IOException {
		writeBaseExternal(out);
		out.writeInt(previousT.length);
		for (int k = 0; k < (previousF.length); ++k) {
			out.writeDouble(previousT[k]);
			for (int i = 0; i < (currentState.length); ++i) {
				out.writeDouble(previousF[k][i]);
			}
		}
	}

	public void readExternal(final java.io.ObjectInput in) throws java.io.IOException {
		final double t = readBaseExternal(in);
		final int kMax = in.readInt();
		previousT = new double[kMax];
		previousF = new double[kMax][];
		for (int k = 0; k < kMax; ++k) {
			previousT[k] = in.readDouble();
			previousF[k] = new double[currentState.length];
			for (int i = 0; i < (currentState.length); ++i) {
				previousF[k][i] = in.readDouble();
			}
		}
		initializeCoefficients();
		try {
			setInterpolatedTime(t);
		} catch (org.apache.commons.math.ode.DerivativeException e) {
			throw new java.io.IOException(e.getMessage());
		}
	}
}


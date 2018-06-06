

package org.apache.commons.math.ode.sampling;


public class NordsieckStepInterpolator extends org.apache.commons.math.ode.sampling.AbstractStepInterpolator {
	private static final long serialVersionUID = -7179861704951334960L;

	private double scalingH;

	private double[] scaled;

	private org.apache.commons.math.linear.RealMatrix nordsieck;

	public NordsieckStepInterpolator() {
	}

	public NordsieckStepInterpolator(final org.apache.commons.math.ode.sampling.NordsieckStepInterpolator interpolator) {
		super(interpolator);
		scalingH = interpolator.scalingH;
		if ((interpolator.scaled) != null) {
			scaled = interpolator.scaled.clone();
		}
		if ((interpolator.nordsieck) != null) {
			nordsieck = interpolator.nordsieck.copy();
		}
	}

	@java.lang.Override
	protected org.apache.commons.math.ode.sampling.StepInterpolator doCopy() {
		return new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator(org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.this);
	}

	@java.lang.Override
	public void reinitialize(final double[] y, final boolean forward) {
		super.reinitialize(y, forward);
	}

	public void reinitialize(final double scalingH, final double[] scaled, final org.apache.commons.math.linear.RealMatrix nordsieck) {
		org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.this.scalingH = scalingH;
		org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.this.scaled = scaled;
		org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.this.nordsieck = nordsieck;
	}

	@java.lang.Override
	public void storeTime(final double t) {
		currentTime = t;
		h = (currentTime) - (previousTime);
		interpolatedTime = t;
		computeInterpolatedState(1.0, 0.0);
	}

	@java.lang.Override
	protected void computeInterpolatedState(final double theta, final double oneMinusThetaH) {
		final double x = theta * (h);
		nordsieck.walkInOptimizedOrder(new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.StateEstimator(x, (x / (scalingH))));
	}

	private class StateEstimator implements org.apache.commons.math.linear.RealMatrixPreservingVisitor {
		private final double scale;

		private final double lowPower;

		private final double[] highPowers;

		public StateEstimator(final double scale, final double theta) {
			this.scale = scale;
			lowPower = theta;
			highPowers = new double[nordsieck.getRowDimension()];
			double thetaN = theta;
			for (int i = 0; i < (highPowers.length); ++i) {
				thetaN *= theta;
				highPowers[i] = thetaN;
			}
		}

		public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
			java.util.Arrays.fill(interpolatedState, 0.0);
			java.util.Arrays.fill(interpolatedDerivatives, 0.0);
		}

		public void visit(int row, int column, double value) {
			final double d = value * (highPowers[row]);
			interpolatedState[column] += d;
			interpolatedDerivatives[column] += (row + 2) * d;
		}

		public double end() {
			for (int j = 0; j < (currentState.length); ++j) {
				interpolatedState[j] += (currentState[j]) + ((scaled[j]) * (lowPower));
				interpolatedDerivatives[j] = ((interpolatedDerivatives[j]) + ((scaled[j]) * (lowPower))) / (scale);
			}
			return 0;
		}
	}

	@java.lang.Override
	public void writeExternal(final java.io.ObjectOutput out) throws java.io.IOException {
		writeBaseExternal(out);
		final int n = (currentState) == null ? -1 : currentState.length;
		if ((scaled) == null) {
			out.writeBoolean(false);
		}else {
			out.writeBoolean(true);
			for (int j = 0; j < n; ++j) {
				out.writeDouble(scaled[j]);
			}
		}
		if ((nordsieck) == null) {
			out.writeBoolean(false);
		}else {
			out.writeBoolean(true);
			final int rows = nordsieck.getRowDimension();
			out.writeInt(rows);
			for (int i = 0; i < rows; ++i) {
				for (int j = 0; j < n; ++j) {
					out.writeDouble(nordsieck.getEntry(i, j));
				}
			}
		}
	}

	@java.lang.Override
	public void readExternal(final java.io.ObjectInput in) throws java.io.IOException {
		final double t = readBaseExternal(in);
		final int n = (currentState) == null ? -1 : currentState.length;
		final boolean hasScaled = in.readBoolean();
		if (hasScaled) {
			scaled = new double[n];
			for (int j = 0; j < n; ++j) {
				scaled[j] = in.readDouble();
			}
		}else {
			scaled = null;
		}
		final boolean hasNordsieck = in.readBoolean();
		if (hasNordsieck) {
			final int rows = in.readInt();
			final double[][] nData = new double[rows][n];
			for (int i = 0; i < rows; ++i) {
				final double[] nI = nData[i];
				for (int j = 0; j < n; ++j) {
					nI[j] = in.readDouble();
				}
			}
			nordsieck = new org.apache.commons.math.linear.RealMatrixImpl(nData, false);
		}else {
			nordsieck = null;
		}
		try {
			if (hasScaled && hasNordsieck) {
				setInterpolatedTime(t);
			}
		} catch (org.apache.commons.math.ode.DerivativeException e) {
			throw org.apache.commons.math.MathRuntimeException.createIOException(e);
		}
	}
}


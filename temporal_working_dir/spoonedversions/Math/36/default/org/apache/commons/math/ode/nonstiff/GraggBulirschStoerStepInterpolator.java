

package org.apache.commons.math.ode.nonstiff;


class GraggBulirschStoerStepInterpolator extends org.apache.commons.math.ode.sampling.AbstractStepInterpolator {
	private static final long serialVersionUID = 20110928L;

	private double[] y0Dot;

	private double[] y1;

	private double[] y1Dot;

	private double[][] yMidDots;

	private double[][] polynomials;

	private double[] errfac;

	private int currentDegree;

	public GraggBulirschStoerStepInterpolator() {
		y0Dot = null;
		y1 = null;
		y1Dot = null;
		yMidDots = null;
		resetTables((-1));
	}

	public GraggBulirschStoerStepInterpolator(final double[] y, final double[] y0Dot, final double[] y1, final double[] y1Dot, final double[][] yMidDots, final boolean forward, final org.apache.commons.math.ode.EquationsMapper primaryMapper, final org.apache.commons.math.ode.EquationsMapper[] secondaryMappers) {
		super(y, forward, primaryMapper, secondaryMappers);
		org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.this.y0Dot = y0Dot;
		org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.this.y1 = y1;
		org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.this.y1Dot = y1Dot;
		org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.this.yMidDots = yMidDots;
		resetTables(((yMidDots.length) + 4));
	}

	public GraggBulirschStoerStepInterpolator(final org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator interpolator) {
		super(interpolator);
		final int dimension = currentState.length;
		y0Dot = null;
		y1 = null;
		y1Dot = null;
		yMidDots = null;
		if ((interpolator.polynomials) == null) {
			polynomials = null;
			currentDegree = -1;
		}else {
			resetTables(interpolator.currentDegree);
			for (int i = 0; i < (polynomials.length); ++i) {
				polynomials[i] = new double[dimension];
				java.lang.System.arraycopy(interpolator.polynomials[i], 0, polynomials[i], 0, dimension);
			}
			currentDegree = interpolator.currentDegree;
		}
	}

	private void resetTables(final int maxDegree) {
		if (maxDegree < 0) {
			polynomials = null;
			errfac = null;
			currentDegree = -1;
		}else {
			final double[][] newPols = new double[maxDegree + 1][];
			if ((polynomials) != null) {
				java.lang.System.arraycopy(polynomials, 0, newPols, 0, polynomials.length);
				for (int i = polynomials.length; i < (newPols.length); ++i) {
					newPols[i] = new double[currentState.length];
				}
			}else {
				for (int i = 0; i < (newPols.length); ++i) {
					newPols[i] = new double[currentState.length];
				}
			}
			polynomials = newPols;
			if (maxDegree <= 4) {
				errfac = null;
			}else {
				errfac = new double[maxDegree - 4];
				for (int i = 0; i < (errfac.length); ++i) {
					final int ip5 = i + 5;
					errfac[i] = 1.0 / (ip5 * ip5);
					final double e = 0.5 * (org.apache.commons.math.util.FastMath.sqrt((((double) (i + 1)) / ip5)));
					for (int j = 0; j <= i; ++j) {
						errfac[i] *= e / (j + 1);
					}
				}
			}
			currentDegree = 0;
		}
	}

	@java.lang.Override
	protected org.apache.commons.math.ode.sampling.StepInterpolator doCopy() {
		return new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator(org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.this);
	}

	public void computeCoefficients(final int mu, final double h) {
		if (((polynomials) == null) || ((polynomials.length) <= (mu + 4))) {
			resetTables((mu + 4));
		}
		currentDegree = mu + 4;
		for (int i = 0; i < (currentState.length); ++i) {
			final double yp0 = h * (y0Dot[i]);
			final double yp1 = h * (y1Dot[i]);
			final double ydiff = (y1[i]) - (currentState[i]);
			final double aspl = ydiff - yp1;
			final double bspl = yp0 - ydiff;
			polynomials[0][i] = currentState[i];
			polynomials[1][i] = ydiff;
			polynomials[2][i] = aspl;
			polynomials[3][i] = bspl;
			if (mu < 0) {
				return ;
			}
			final double ph0 = (0.5 * ((currentState[i]) + (y1[i]))) + (0.125 * (aspl + bspl));
			polynomials[4][i] = 16 * ((yMidDots[0][i]) - ph0);
			if (mu > 0) {
				final double ph1 = ydiff + (0.25 * (aspl - bspl));
				polynomials[5][i] = 16 * ((yMidDots[1][i]) - ph1);
				if (mu > 1) {
					final double ph2 = yp1 - yp0;
					polynomials[6][i] = 16 * (((yMidDots[2][i]) - ph2) + (polynomials[4][i]));
					if (mu > 2) {
						final double ph3 = 6 * (bspl - aspl);
						polynomials[7][i] = 16 * (((yMidDots[3][i]) - ph3) + (3 * (polynomials[5][i])));
						for (int j = 4; j <= mu; ++j) {
							final double fac1 = (0.5 * j) * (j - 1);
							final double fac2 = ((2 * fac1) * (j - 2)) * (j - 3);
							polynomials[(j + 4)][i] = 16 * (((yMidDots[j][i]) + (fac1 * (polynomials[(j + 2)][i]))) - (fac2 * (polynomials[j][i])));
						}
					}
				}
			}
		}
	}

	public double estimateError(final double[] scale) {
		double error = 0;
		if ((currentDegree) >= 5) {
			for (int i = 0; i < (scale.length); ++i) {
				final double e = (polynomials[currentDegree][i]) / (scale[i]);
				error += e * e;
			}
			error = (org.apache.commons.math.util.FastMath.sqrt((error / (scale.length)))) * (errfac[((currentDegree) - 5)]);
		}
		return error;
	}

	@java.lang.Override
	protected void computeInterpolatedStateAndDerivatives(final double theta, final double oneMinusThetaH) {
		final int dimension = currentState.length;
		final double oneMinusTheta = 1.0 - theta;
		final double theta05 = theta - 0.5;
		final double tOmT = theta * oneMinusTheta;
		final double t4 = tOmT * tOmT;
		final double t4Dot = (2 * tOmT) * (1 - (2 * theta));
		final double dot1 = 1.0 / (h);
		final double dot2 = (theta * (2 - (3 * theta))) / (h);
		final double dot3 = ((((3 * theta) - 4) * theta) + 1) / (h);
		for (int i = 0; i < dimension; ++i) {
			final double p0 = polynomials[0][i];
			final double p1 = polynomials[1][i];
			final double p2 = polynomials[2][i];
			final double p3 = polynomials[3][i];
			interpolatedState[i] = p0 + (theta * (p1 + (oneMinusTheta * ((p2 * theta) + (p3 * oneMinusTheta)))));
			interpolatedDerivatives[i] = ((dot1 * p1) + (dot2 * p2)) + (dot3 * p3);
			if ((currentDegree) > 3) {
				double cDot = 0;
				double c = polynomials[currentDegree][i];
				for (int j = (currentDegree) - 1; j > 3; --j) {
					final double d = 1.0 / (j - 3);
					cDot = d * ((theta05 * cDot) + c);
					c = (polynomials[j][i]) + ((c * d) * theta05);
				}
				interpolatedState[i] += t4 * c;
				interpolatedDerivatives[i] += ((t4 * cDot) + (t4Dot * c)) / (h);
			}
		}
		if ((h) == 0) {
			java.lang.System.arraycopy(yMidDots[1], 0, interpolatedDerivatives, 0, dimension);
		}
	}

	@java.lang.Override
	public void writeExternal(final java.io.ObjectOutput out) throws java.io.IOException {
		final int dimension = (currentState) == null ? -1 : currentState.length;
		writeBaseExternal(out);
		out.writeInt(currentDegree);
		for (int k = 0; k <= (currentDegree); ++k) {
			for (int l = 0; l < dimension; ++l) {
				out.writeDouble(polynomials[k][l]);
			}
		}
	}

	@java.lang.Override
	public void readExternal(final java.io.ObjectInput in) throws java.io.IOException, java.lang.ClassNotFoundException {
		final double t = readBaseExternal(in);
		final int dimension = (currentState) == null ? -1 : currentState.length;
		final int degree = in.readInt();
		resetTables(degree);
		currentDegree = degree;
		for (int k = 0; k <= (currentDegree); ++k) {
			for (int l = 0; l < dimension; ++l) {
				polynomials[k][l] = in.readDouble();
			}
		}
		setInterpolatedTime(t);
	}
}


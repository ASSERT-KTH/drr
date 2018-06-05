

package org.apache.commons.math.ode;


class GraggBulirschStoerStepInterpolator extends org.apache.commons.math.ode.AbstractStepInterpolator {
	private double[] y0Dot;

	private double[] y1;

	private double[] y1Dot;

	private double[][] yMidDots;

	private double[][] polynoms;

	private double[] errfac;

	private int currentDegree;

	private void resetTables(int maxDegree) {
		if (maxDegree < 0) {
			polynoms = null;
			errfac = null;
			currentDegree = -1;
		}else {
			double[][] newPols = new double[maxDegree + 1][];
			if ((polynoms) != null) {
				java.lang.System.arraycopy(polynoms, 0, newPols, 0, polynoms.length);
				for (int i = polynoms.length; i < (newPols.length); ++i) {
					newPols[i] = new double[currentState.length];
				}
			}else {
				for (int i = 0; i < (newPols.length); ++i) {
					newPols[i] = new double[currentState.length];
				}
			}
			polynoms = newPols;
			if (maxDegree <= 4) {
				errfac = null;
			}else {
				errfac = new double[maxDegree - 4];
				for (int i = 0; i < (errfac.length); ++i) {
					int ip5 = i + 5;
					errfac[i] = 1.0 / (ip5 * ip5);
					double e = 0.5 * (java.lang.Math.sqrt((((double) (i + 1)) / ip5)));
					for (int j = 0; j <= i; ++j) {
						errfac[i] *= e / (j + 1);
					}
				}
			}
			currentDegree = 0;
		}
	}

	public GraggBulirschStoerStepInterpolator() {
		y0Dot = null;
		y1 = null;
		y1Dot = null;
		yMidDots = null;
		resetTables((-1));
	}

	public GraggBulirschStoerStepInterpolator(double[] y, double[] y0Dot, double[] y1, double[] y1Dot, double[][] yMidDots, boolean forward) {
		super(y, forward);
		org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.this.y0Dot = y0Dot;
		org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.this.y1 = y1;
		org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.this.y1Dot = y1Dot;
		org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.this.yMidDots = yMidDots;
		resetTables(((yMidDots.length) + 4));
	}

	public GraggBulirschStoerStepInterpolator(org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator interpolator) {
		super(interpolator);
		int dimension = currentState.length;
		y0Dot = null;
		y1 = null;
		y1Dot = null;
		yMidDots = null;
		if ((interpolator.polynoms) == null) {
			polynoms = null;
			currentDegree = -1;
		}else {
			resetTables(interpolator.currentDegree);
			for (int i = 0; i < (polynoms.length); ++i) {
				polynoms[i] = new double[dimension];
				java.lang.System.arraycopy(interpolator.polynoms[i], 0, polynoms[i], 0, dimension);
			}
			currentDegree = interpolator.currentDegree;
		}
	}

	public java.lang.Object clone() {
		return new org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator(org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.this);
	}

	public void computeCoefficients(int mu, double h) {
		if (((polynoms) == null) || ((polynoms.length) <= (mu + 4))) {
			resetTables((mu + 4));
		}
		currentDegree = mu + 4;
		for (int i = 0; i < (currentState.length); ++i) {
			double yp0 = h * (y0Dot[i]);
			double yp1 = h * (y1Dot[i]);
			double ydiff = (y1[i]) - (currentState[i]);
			double aspl = ydiff - yp1;
			double bspl = yp0 - ydiff;
			polynoms[0][i] = currentState[i];
			polynoms[1][i] = ydiff;
			polynoms[2][i] = aspl;
			polynoms[3][i] = bspl;
			if (mu < 0) {
				return ;
			}
			double ph0 = (0.5 * ((currentState[i]) + (y1[i]))) + (0.125 * (aspl + bspl));
			polynoms[4][i] = 16 * ((yMidDots[0][i]) - ph0);
			if (mu > 0) {
				double ph1 = ydiff + (0.25 * (aspl - bspl));
				polynoms[5][i] = 16 * ((yMidDots[1][i]) - ph1);
				if (mu > 1) {
					double ph2 = yp1 - yp0;
					polynoms[6][i] = 16 * (((yMidDots[2][i]) - ph2) + (polynoms[4][i]));
					if (mu > 2) {
						double ph3 = 6 * (bspl - aspl);
						polynoms[7][i] = 16 * (((yMidDots[3][i]) - ph3) + (3 * (polynoms[5][i])));
						for (int j = 4; j <= mu; ++j) {
							double fac1 = (0.5 * j) * (j - 1);
							double fac2 = ((2 * fac1) * (j - 2)) * (j - 3);
							polynoms[(j + 4)][i] = 16 * (((yMidDots[j][i]) + (fac1 * (polynoms[(j + 2)][i]))) - (fac2 * (polynoms[j][i])));
						}
					}
				}
			}
		}
	}

	public double estimateError(double[] scale) {
		double error = 0;
		if ((currentDegree) >= 5) {
			for (int i = 0; i < (currentState.length); ++i) {
				double e = (polynoms[currentDegree][i]) / (scale[i]);
				error += e * e;
			}
			error = (java.lang.Math.sqrt((error / (currentState.length)))) * (errfac[((currentDegree) - 5)]);
		}
		return error;
	}

	protected void computeInterpolatedState(double theta, double oneMinusThetaH) throws org.apache.commons.math.ode.DerivativeException {
		int dimension = currentState.length;
		double oneMinusTheta = 1.0 - theta;
		double theta05 = theta - 0.5;
		double t4 = theta * oneMinusTheta;
		t4 = t4 * t4;
		for (int i = 0; i < dimension; ++i) {
			interpolatedState[i] = (polynoms[0][i]) + (theta * ((polynoms[1][i]) + (oneMinusTheta * (((polynoms[2][i]) * theta) + ((polynoms[3][i]) * oneMinusTheta)))));
			if ((currentDegree) > 3) {
				double c = polynoms[currentDegree][i];
				for (int j = (currentDegree) - 1; j > 3; --j) {
					c = (polynoms[j][i]) + ((c * theta05) / (j - 3));
				}
				interpolatedState[i] += t4 * c;
			}
		}
	}

	public void writeExternal(java.io.ObjectOutput out) throws java.io.IOException {
		int dimension = currentState.length;
		writeBaseExternal(out);
		out.writeInt(currentDegree);
		for (int k = 0; k <= (currentDegree); ++k) {
			for (int l = 0; l < dimension; ++l) {
				out.writeDouble(polynoms[k][l]);
			}
		}
	}

	public void readExternal(java.io.ObjectInput in) throws java.io.IOException {
		double t = readBaseExternal(in);
		int dimension = currentState.length;
		int degree = in.readInt();
		resetTables(degree);
		currentDegree = degree;
		for (int k = 0; k <= (currentDegree); ++k) {
			for (int l = 0; l < dimension; ++l) {
				polynoms[k][l] = in.readDouble();
			}
		}
		try {
			setInterpolatedTime(t);
		} catch (org.apache.commons.math.ode.DerivativeException e) {
			throw new java.io.IOException(e.getMessage());
		}
	}

	private static final long serialVersionUID = 7320613236731409847L;
}


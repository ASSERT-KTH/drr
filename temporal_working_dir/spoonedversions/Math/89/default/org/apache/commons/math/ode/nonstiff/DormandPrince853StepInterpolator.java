

package org.apache.commons.math.ode.nonstiff;


class DormandPrince853StepInterpolator extends org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator {
	public DormandPrince853StepInterpolator() {
		super();
		yDotKLast = null;
		v = null;
		vectorsInitialized = false;
	}

	public DormandPrince853StepInterpolator(final org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator interpolator) {
		super(interpolator);
		if ((interpolator.currentState) == null) {
			yDotKLast = null;
			v = null;
			vectorsInitialized = false;
		}else {
			final int dimension = interpolator.currentState.length;
			yDotKLast = new double[3][];
			for (int k = 0; k < (yDotKLast.length); ++k) {
				yDotKLast[k] = new double[dimension];
				java.lang.System.arraycopy(interpolator.yDotKLast[k], 0, yDotKLast[k], 0, dimension);
			}
			v = new double[7][];
			for (int k = 0; k < (v.length); ++k) {
				v[k] = new double[dimension];
				java.lang.System.arraycopy(interpolator.v[k], 0, v[k], 0, dimension);
			}
			vectorsInitialized = interpolator.vectorsInitialized;
		}
	}

	@java.lang.Override
	protected org.apache.commons.math.ode.sampling.StepInterpolator doCopy() {
		return new org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator(org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.this);
	}

	@java.lang.Override
	public void reinitialize(final org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, final double[] y, final double[][] yDotK, final boolean forward) {
		super.reinitialize(equations, y, yDotK, forward);
		final int dimension = currentState.length;
		yDotKLast = new double[3][];
		for (int k = 0; k < (yDotKLast.length); ++k) {
			yDotKLast[k] = new double[dimension];
		}
		v = new double[7][];
		for (int k = 0; k < (v.length); ++k) {
			v[k] = new double[dimension];
		}
		vectorsInitialized = false;
	}

	@java.lang.Override
	public void storeTime(final double t) {
		super.storeTime(t);
		vectorsInitialized = false;
	}

	@java.lang.Override
	protected void computeInterpolatedState(final double theta, final double oneMinusThetaH) throws org.apache.commons.math.ode.DerivativeException {
		if (!(vectorsInitialized)) {
			if ((v) == null) {
				v = new double[7][];
				for (int k = 0; k < 7; ++k) {
					v[k] = new double[interpolatedState.length];
				}
			}
			finalizeStep();
			for (int i = 0; i < (interpolatedState.length); ++i) {
				final double yDot1 = yDotK[0][i];
				final double yDot6 = yDotK[5][i];
				final double yDot7 = yDotK[6][i];
				final double yDot8 = yDotK[7][i];
				final double yDot9 = yDotK[8][i];
				final double yDot10 = yDotK[9][i];
				final double yDot11 = yDotK[10][i];
				final double yDot12 = yDotK[11][i];
				final double yDot13 = yDotK[12][i];
				final double yDot14 = yDotKLast[0][i];
				final double yDot15 = yDotKLast[1][i];
				final double yDot16 = yDotKLast[2][i];
				v[0][i] = ((((((((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_01) * yDot1) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_06) * yDot6)) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_07) * yDot7)) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_08) * yDot8)) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_09) * yDot9)) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_10) * yDot10)) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_11) * yDot11)) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_12) * yDot12);
				v[1][i] = yDot1 - (v[0][i]);
				v[2][i] = ((v[0][i]) - (v[1][i])) - (yDotK[12][i]);
				for (int k = 0; k < (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.d.length); ++k) {
					v[(k + 3)][i] = ((((((((((((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.d[k][0]) * yDot1) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.d[k][1]) * yDot6)) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.d[k][2]) * yDot7)) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.d[k][3]) * yDot8)) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.d[k][4]) * yDot9)) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.d[k][5]) * yDot10)) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.d[k][6]) * yDot11)) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.d[k][7]) * yDot12)) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.d[k][8]) * yDot13)) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.d[k][9]) * yDot14)) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.d[k][10]) * yDot15)) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.d[k][11]) * yDot16);
				}
			}
			vectorsInitialized = true;
		}
		final double eta = 1 - theta;
		final double twoTheta = 2 * theta;
		final double theta2 = theta * theta;
		final double dot1 = 1 - twoTheta;
		final double dot2 = theta * (2 - (3 * theta));
		final double dot3 = twoTheta * (1 + (theta * (twoTheta - 3)));
		final double dot4 = theta2 * (3 + (theta * ((5 * theta) - 8)));
		final double dot5 = theta2 * (3 + (theta * ((-12) + (theta * (15 - (6 * theta))))));
		final double dot6 = (theta2 * theta) * (4 + (theta * ((-15) + (theta * (18 - (7 * theta))))));
		for (int i = 0; i < (interpolatedState.length); ++i) {
			interpolatedState[i] = (currentState[i]) - (oneMinusThetaH * ((v[0][i]) - (theta * ((v[1][i]) + (theta * ((v[2][i]) + (eta * ((v[3][i]) + (theta * ((v[4][i]) + (eta * ((v[5][i]) + (theta * (v[6][i]))))))))))))));
			interpolatedDerivatives[i] = ((((((v[0][i]) + (dot1 * (v[1][i]))) + (dot2 * (v[2][i]))) + (dot3 * (v[3][i]))) + (dot4 * (v[4][i]))) + (dot5 * (v[5][i]))) + (dot6 * (v[6][i]));
		}
	}

	@java.lang.Override
	protected void doFinalize() throws org.apache.commons.math.ode.DerivativeException {
		if ((currentState) == null) {
			return ;
		}
		double s;
		final double[] yTmp = new double[currentState.length];
		for (int j = 0; j < (currentState.length); ++j) {
			s = (((((((((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k14_01) * (yDotK[0][j])) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k14_06) * (yDotK[5][j]))) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k14_07) * (yDotK[6][j]))) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k14_08) * (yDotK[7][j]))) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k14_09) * (yDotK[8][j]))) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k14_10) * (yDotK[9][j]))) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k14_11) * (yDotK[10][j]))) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k14_12) * (yDotK[11][j]))) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k14_13) * (yDotK[12][j]));
			yTmp[j] = (currentState[j]) + ((h) * s);
		}
		equations.computeDerivatives(((previousTime) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.c14) * (h))), yTmp, yDotKLast[0]);
		for (int j = 0; j < (currentState.length); ++j) {
			s = ((((((((((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k15_01) * (yDotK[0][j])) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k15_06) * (yDotK[5][j]))) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k15_07) * (yDotK[6][j]))) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k15_08) * (yDotK[7][j]))) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k15_09) * (yDotK[8][j]))) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k15_10) * (yDotK[9][j]))) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k15_11) * (yDotK[10][j]))) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k15_12) * (yDotK[11][j]))) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k15_13) * (yDotK[12][j]))) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k15_14) * (yDotKLast[0][j]));
			yTmp[j] = (currentState[j]) + ((h) * s);
		}
		equations.computeDerivatives(((previousTime) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.c15) * (h))), yTmp, yDotKLast[1]);
		for (int j = 0; j < (currentState.length); ++j) {
			s = (((((((((((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k16_01) * (yDotK[0][j])) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k16_06) * (yDotK[5][j]))) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k16_07) * (yDotK[6][j]))) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k16_08) * (yDotK[7][j]))) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k16_09) * (yDotK[8][j]))) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k16_10) * (yDotK[9][j]))) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k16_11) * (yDotK[10][j]))) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k16_12) * (yDotK[11][j]))) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k16_13) * (yDotK[12][j]))) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k16_14) * (yDotKLast[0][j]))) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.k16_15) * (yDotKLast[1][j]));
			yTmp[j] = (currentState[j]) + ((h) * s);
		}
		equations.computeDerivatives(((previousTime) + ((org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.c16) * (h))), yTmp, yDotKLast[2]);
	}

	@java.lang.Override
	public void writeExternal(final java.io.ObjectOutput out) throws java.io.IOException {
		try {
			finalizeStep();
		} catch (org.apache.commons.math.ode.DerivativeException e) {
			throw org.apache.commons.math.MathRuntimeException.createIOException(e);
		}
		out.writeInt(currentState.length);
		for (int i = 0; i < (currentState.length); ++i) {
			out.writeDouble(yDotKLast[0][i]);
			out.writeDouble(yDotKLast[1][i]);
			out.writeDouble(yDotKLast[2][i]);
		}
		super.writeExternal(out);
	}

	@java.lang.Override
	public void readExternal(final java.io.ObjectInput in) throws java.io.IOException {
		yDotKLast = new double[3][];
		final int dimension = in.readInt();
		yDotKLast[0] = new double[dimension];
		yDotKLast[1] = new double[dimension];
		yDotKLast[2] = new double[dimension];
		for (int i = 0; i < dimension; ++i) {
			yDotKLast[0][i] = in.readDouble();
			yDotKLast[1][i] = in.readDouble();
			yDotKLast[2][i] = in.readDouble();
		}
		super.readExternal(in);
	}

	private double[][] yDotKLast;

	private double[][] v;

	private boolean vectorsInitialized;

	private static final double b_01 = 104257.0 / 1920240.0;

	private static final double b_06 = 3399327.0 / 763840.0;

	private static final double b_07 = 6.6578432E7 / 3.5198415E7;

	private static final double b_08 = (-1.674902723E9) / 2.887164E8;

	private static final double b_09 = 5.4980371265625E13 / 1.76692375811392E14;

	private static final double b_10 = (-734375.0) / 4826304.0;

	private static final double b_11 = 1.71414593E8 / 8.512614E8;

	private static final double b_12 = 137909.0 / 3084480.0;

	private static final double c14 = 1.0 / 10.0;

	private static final double k14_01 = (1.3481885573E10 / 2.4003E11) - (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_01);

	private static final double k14_06 = 0.0 - (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_06);

	private static final double k14_07 = (1.39418837528E11 / 5.49975234375E11) - (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_07);

	private static final double k14_08 = ((-1.1108320068443E13) / 4.51119375E13) - (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_08);

	private static final double k14_09 = ((-1.769651421925959E15) / 1.424938514608E16) - (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_09);

	private static final double k14_10 = (5.7799439E7 / 3.77055E8) - (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_10);

	private static final double k14_11 = (7.93322643029E11 / 9.673425E13) - (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_11);

	private static final double k14_12 = (1.458939311E9 / 1.9278E11) - (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_12);

	private static final double k14_13 = (-4149.0) / 500000.0;

	private static final double c15 = 1.0 / 5.0;

	private static final double k15_01 = (1.595561272731E12 / 5.01202735E13) - (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_01);

	private static final double k15_06 = (9.75183916491E11 / 3.445768803125E13) - (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_06);

	private static final double k15_07 = (3.8492013932672E13 / 7.18912673015625E14) - (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_07);

	private static final double k15_08 = ((-1.114881286517557E15) / 2.02987107675E16) - (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_08);

	private static final double k15_09 = 0.0 - (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_09);

	private static final double k15_10 = 0.0 - (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_10);

	private static final double k15_11 = ((-2.538710946863E12) / 2.343122786125E16) - (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_11);

	private static final double k15_12 = (8.824659001E9 / 2.306671678125E13) - (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_12);

	private static final double k15_13 = (-1.1518334563E10) / 3.38311846125E13;

	private static final double k15_14 = 1.912306948E9 / 1.3532473845E10;

	private static final double c16 = 7.0 / 9.0;

	private static final double k16_01 = ((-1.3613986967E10) / 3.1741908048E10) - (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_01);

	private static final double k16_06 = ((-4.755612631E9) / 1.012344804E9) - (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_06);

	private static final double k16_07 = (4.2939257944576E13 / 5.588559685701E12) - (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_07);

	private static final double k16_08 = (7.7881972900277E13 / 1.9140370552944E13) - (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_08);

	private static final double k16_09 = (2.2719829234375E13 / 6.3689648654052E13) - (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_09);

	private static final double k16_10 = 0.0 - (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_10);

	private static final double k16_11 = 0.0 - (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_11);

	private static final double k16_12 = 0.0 - (org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.b_12);

	private static final double k16_13 = (-1.199007803E9) / 8.57031517296E11;

	private static final double k16_14 = 1.57882067E11 / 5.3564469831E10;

	private static final double k16_15 = (-2.90468882375E11) / 3.1741908048E10;

	private static final double[][] d = new double[][]{ new double[]{ (-1.7751989329E10) / 2.10607656E9 , 4.272954039E9 / 7.53986464E9 , (-1.18476319744E11) / 3.8604839385E10 , 7.55123450731E11 / 3.166577316E11 , 3.6923844612348283E18 / 1.7441304416342505E18 , (-4.612609375E9) / 5.293382976E9 , 2.091772278379E12 / 9.336445866E11 , 2.136624137E9 / 3.38298912E9 , (-126493.0) / 1421424.0 , 9.835E7 / 5419179.0 , (-1.8878125E7) / 2053168.0 , (-1.944542619E9) / 4.38351368E8 } , new double[]{ 3.2941697297E10 / 3.15911484E9 , 4.56696183123E11 / 1.88496616E9 , 1.9132610714624E13 / 1.15814518155E11 , (-1.77904688592943E14) / 4.749865974E11 , (-4.8211399418367652E18) / 2.18016305204281312E17 , 3.0702015625E10 / 3.970037232E9 , (-8.5916079474274E13) / 2.8009337598E12 , (-5.919468007E9) / 6.3431046E8 , 2479159.0 / 157936.0 , (-1.875E7) / 602131.0 , (-1.9203125E7) / 2053168.0 , 1.5700361463E10 / 4.38351368E8 } , new double[]{ 1.2627015655E10 / 6.31822968E8 , (-7.2955222965E10) / 1.88496616E8 , (-1.314574495232E13) / 6.9488710893E10 , 3.0084216194513E13 / 5.6998391688E10 , (-2.9685876100664064E17) / 2.5648977082856624E16 , 5.69140625E8 / 8.2709109E7 , (-1.8684190637E10) / 1.8672891732E10 , 6.9644045E7 / 8.9549712E7 , (-1.1847025E7) / 4264272.0 , (-9.7865E8) / 1.6257537E7 , 5.19371875E8 / 6159504.0 , 5.256837225E9 / 4.38351368E8 } , new double[]{ (-4.50944925E8) / 1.7550638E7 , (-1.4532122925E10) / 9.4248308E7 , (-5.958769664E11) / 2.573655959E9 , 1.88748653015E11 / 5.27762886E8 , 2.5454854581152343E18 / 2.7252038150535164E16 , (-1.376953125E9) / 3.6759604E7 , 5.3995596795E10 / 5.18691437E8 , 2.10311225E8 / 7047894.0 , (-1718875.0) / 39484.0 , 5.8E7 / 602131.0 , (-1546875.0) / 39484.0 , (-1.262172375E9) / 8429834.0 } };

	private static final long serialVersionUID = 7152276390558450974L;
}


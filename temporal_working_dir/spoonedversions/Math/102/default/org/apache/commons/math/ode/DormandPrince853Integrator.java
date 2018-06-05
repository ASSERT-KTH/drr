

package org.apache.commons.math.ode;


public class DormandPrince853Integrator extends org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator {
	private static final java.lang.String methodName = "Dormand-Prince 8 (5, 3)";

	private static final double sqrt6 = java.lang.Math.sqrt(6.0);

	private static final double[] staticC = new double[]{ (12.0 - (2.0 * (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6))) / 135.0 , (6.0 - (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6)) / 45.0 , (6.0 - (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6)) / 30.0 , (6.0 + (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6)) / 30.0 , 1.0 / 3.0 , 1.0 / 4.0 , 4.0 / 13.0 , 127.0 / 195.0 , 3.0 / 5.0 , 6.0 / 7.0 , 1.0 , 1.0 };

	private static final double[][] staticA = new double[][]{ new double[]{ (12.0 - (2.0 * (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6))) / 135.0 } , new double[]{ (6.0 - (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6)) / 180.0 , (6.0 - (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6)) / 60.0 } , new double[]{ (6.0 - (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6)) / 120.0 , 0.0 , (6.0 - (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6)) / 40.0 } , new double[]{ (462.0 + (107.0 * (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6))) / 3000.0 , 0.0 , ((-402.0) - (197.0 * (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6))) / 1000.0 , (168.0 + (73.0 * (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6))) / 375.0 } , new double[]{ 1.0 / 27.0 , 0.0 , 0.0 , (16.0 + (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6)) / 108.0 , (16.0 - (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6)) / 108.0 } , new double[]{ 19.0 / 512.0 , 0.0 , 0.0 , (118.0 + (23.0 * (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6))) / 1024.0 , (118.0 - (23.0 * (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6))) / 1024.0 , (-9.0) / 512.0 } , new double[]{ 13772.0 / 371293.0 , 0.0 , 0.0 , (51544.0 + (4784.0 * (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6))) / 371293.0 , (51544.0 - (4784.0 * (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6))) / 371293.0 , (-5688.0) / 371293.0 , 3072.0 / 371293.0 } , new double[]{ 5.8656157643E10 / 9.3983540625E10 , 0.0 , 0.0 , ((-1.324889724104E12) - (3.18801444819E11 * (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6))) / 6.265569375E11 , ((-1.324889724104E12) + (3.18801444819E11 * (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6))) / 6.265569375E11 , 9.6044563816E10 / 3.480871875E9 , 5.682451879168E12 / 2.81950621875E11 , (-1.65125654E8) / 3796875.0 } , new double[]{ 8909899.0 / 1.8653125E7 , 0.0 , 0.0 , ((-4521408.0) - (1137963.0 * (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6))) / 2937500.0 , ((-4521408.0) + (1137963.0 * (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6))) / 2937500.0 , 9.6663078E7 / 4553125.0 , 2.107245056E9 / 1.37915625E8 , (-4.913652016E9) / 1.47609375E8 , (-7.889427E7) / 3.880452869E9 } , new double[]{ (-2.0401265806E10) / 2.1769653311E10 , 0.0 , 0.0 , (354216.0 + (94326.0 * (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6))) / 112847.0 , (354216.0 - (94326.0 * (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6))) / 112847.0 , (-4.3306765128E10) / 5.313852383E9 , (-2.0866708358144E13) / 1.126708119789E12 , 1.488600343802E13 / 6.54632330667E11 , 3.5290686222309376E16 / 1.4152473387134412E16 , (-1.477884375E9) / 4.85066827E8 } , new double[]{ 3.9815761E7 / 1.7514443E7 , 0.0 , 0.0 , ((-3457480.0) - (960905.0 * (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6))) / 551636.0 , ((-3457480.0) + (960905.0 * (org.apache.commons.math.ode.DormandPrince853Integrator.sqrt6))) / 551636.0 , (-8.44554132E8) / 4.7026969E7 , 8.444996352E9 / 3.02158619E8 , (-2.509602342E9) / 8.77790785E8 , (-2.8388795297996248E16) / 3.199510091356783E15 , 2.2671625E8 / 1.8341897E7 , 1.371316744E9 / 2.131383595E9 } , new double[]{ 104257.0 / 1920240.0 , 0.0 , 0.0 , 0.0 , 0.0 , 3399327.0 / 763840.0 , 6.6578432E7 / 3.5198415E7 , (-1.674902723E9) / 2.887164E8 , 5.4980371265625E13 / 1.76692375811392E14 , (-734375.0) / 4826304.0 , 1.71414593E8 / 8.512614E8 , 137909.0 / 3084480.0 } };

	private static final double[] staticB = new double[]{ 104257.0 / 1920240.0 , 0.0 , 0.0 , 0.0 , 0.0 , 3399327.0 / 763840.0 , 6.6578432E7 / 3.5198415E7 , (-1.674902723E9) / 2.887164E8 , 5.4980371265625E13 / 1.76692375811392E14 , (-734375.0) / 4826304.0 , 1.71414593E8 / 8.512614E8 , 137909.0 / 3084480.0 , 0.0 };

	private static final double e1_01 = 1.16092271E8 / 8.84846592E9;

	private static final double e1_06 = (-1871647.0) / 1527680.0;

	private static final double e1_07 = (-6.9799717E7) / 1.4079366E8;

	private static final double e1_08 = 1.230164450203E12 / 7.39113984E11;

	private static final double e1_09 = (-1.980813971228885E15) / 5.654156025964544E15;

	private static final double e1_10 = 4.64500805E8 / 1.389975552E9;

	private static final double e1_11 = 1.606764981773E12 / 1.9613062656E13;

	private static final double e1_12 = (-137909.0) / 6168960.0;

	private static final double e2_01 = (-364463.0) / 1920240.0;

	private static final double e2_06 = 3399327.0 / 763840.0;

	private static final double e2_07 = 6.6578432E7 / 3.5198415E7;

	private static final double e2_08 = (-1.674902723E9) / 2.887164E8;

	private static final double e2_09 = (-7.4684743568175E13) / 1.76692375811392E14;

	private static final double e2_10 = (-734375.0) / 4826304.0;

	private static final double e2_11 = 1.71414593E8 / 8.512614E8;

	private static final double e2_12 = 69869.0 / 3084480.0;

	public DormandPrince853Integrator(double minStep, double maxStep, double scalAbsoluteTolerance, double scalRelativeTolerance) {
		super(true, org.apache.commons.math.ode.DormandPrince853Integrator.staticC, org.apache.commons.math.ode.DormandPrince853Integrator.staticA, org.apache.commons.math.ode.DormandPrince853Integrator.staticB, new org.apache.commons.math.ode.DormandPrince853StepInterpolator(), minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);
	}

	public DormandPrince853Integrator(double minStep, double maxStep, double[] vecAbsoluteTolerance, double[] vecRelativeTolerance) {
		super(true, org.apache.commons.math.ode.DormandPrince853Integrator.staticC, org.apache.commons.math.ode.DormandPrince853Integrator.staticA, org.apache.commons.math.ode.DormandPrince853Integrator.staticB, new org.apache.commons.math.ode.DormandPrince853StepInterpolator(), minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance);
	}

	public java.lang.String getName() {
		return org.apache.commons.math.ode.DormandPrince853Integrator.methodName;
	}

	public int getOrder() {
		return 8;
	}

	protected double estimateError(double[][] yDotK, double[] y0, double[] y1, double h) {
		double error1 = 0;
		double error2 = 0;
		for (int j = 0; j < (y0.length); ++j) {
			double errSum1 = ((((((((org.apache.commons.math.ode.DormandPrince853Integrator.e1_01) * (yDotK[0][j])) + ((org.apache.commons.math.ode.DormandPrince853Integrator.e1_06) * (yDotK[5][j]))) + ((org.apache.commons.math.ode.DormandPrince853Integrator.e1_07) * (yDotK[6][j]))) + ((org.apache.commons.math.ode.DormandPrince853Integrator.e1_08) * (yDotK[7][j]))) + ((org.apache.commons.math.ode.DormandPrince853Integrator.e1_09) * (yDotK[8][j]))) + ((org.apache.commons.math.ode.DormandPrince853Integrator.e1_10) * (yDotK[9][j]))) + ((org.apache.commons.math.ode.DormandPrince853Integrator.e1_11) * (yDotK[10][j]))) + ((org.apache.commons.math.ode.DormandPrince853Integrator.e1_12) * (yDotK[11][j]));
			double errSum2 = ((((((((org.apache.commons.math.ode.DormandPrince853Integrator.e2_01) * (yDotK[0][j])) + ((org.apache.commons.math.ode.DormandPrince853Integrator.e2_06) * (yDotK[5][j]))) + ((org.apache.commons.math.ode.DormandPrince853Integrator.e2_07) * (yDotK[6][j]))) + ((org.apache.commons.math.ode.DormandPrince853Integrator.e2_08) * (yDotK[7][j]))) + ((org.apache.commons.math.ode.DormandPrince853Integrator.e2_09) * (yDotK[8][j]))) + ((org.apache.commons.math.ode.DormandPrince853Integrator.e2_10) * (yDotK[9][j]))) + ((org.apache.commons.math.ode.DormandPrince853Integrator.e2_11) * (yDotK[10][j]))) + ((org.apache.commons.math.ode.DormandPrince853Integrator.e2_12) * (yDotK[11][j]));
			double yScale = java.lang.Math.max(java.lang.Math.abs(y0[j]), java.lang.Math.abs(y1[j]));
			double tol = (vecAbsoluteTolerance) == null ? (scalAbsoluteTolerance) + ((scalRelativeTolerance) * yScale) : (vecAbsoluteTolerance[j]) + ((vecRelativeTolerance[j]) * yScale);
			double ratio1 = errSum1 / tol;
			error1 += ratio1 * ratio1;
			double ratio2 = errSum2 / tol;
			error2 += ratio2 * ratio2;
		}
		double den = error1 + (0.01 * error2);
		if (den <= 0.0) {
			den = 1.0;
		}
		return ((java.lang.Math.abs(h)) * error1) / (java.lang.Math.sqrt(((y0.length) * den)));
	}
}


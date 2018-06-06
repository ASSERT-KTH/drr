

package org.apache.commons.math.ode;


public class HighamHall54Integrator extends org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator {
	private static final java.lang.String methodName = "Higham-Hall 5(4)";

	private static final double[] staticC = new double[]{ 2.0 / 9.0 , 1.0 / 3.0 , 1.0 / 2.0 , 3.0 / 5.0 , 1.0 , 1.0 };

	private static final double[][] staticA = new double[][]{ new double[]{ 2.0 / 9.0 } , new double[]{ 1.0 / 12.0 , 1.0 / 4.0 } , new double[]{ 1.0 / 8.0 , 0.0 , 3.0 / 8.0 } , new double[]{ 91.0 / 500.0 , (-27.0) / 100.0 , 78.0 / 125.0 , 8.0 / 125.0 } , new double[]{ (-11.0) / 20.0 , 27.0 / 20.0 , 12.0 / 5.0 , (-36.0) / 5.0 , 5.0 } , new double[]{ 1.0 / 12.0 , 0.0 , 27.0 / 32.0 , (-4.0) / 3.0 , 125.0 / 96.0 , 5.0 / 48.0 } };

	private static final double[] staticB = new double[]{ 1.0 / 12.0 , 0.0 , 27.0 / 32.0 , (-4.0) / 3.0 , 125.0 / 96.0 , 5.0 / 48.0 , 0.0 };

	private static final double[] staticE = new double[]{ (-1.0) / 20.0 , 0.0 , 81.0 / 160.0 , (-6.0) / 5.0 , 25.0 / 32.0 , 1.0 / 16.0 , (-1.0) / 10.0 };

	public HighamHall54Integrator(double minStep, double maxStep, double scalAbsoluteTolerance, double scalRelativeTolerance) {
		super(false, org.apache.commons.math.ode.HighamHall54Integrator.staticC, org.apache.commons.math.ode.HighamHall54Integrator.staticA, org.apache.commons.math.ode.HighamHall54Integrator.staticB, new org.apache.commons.math.ode.HighamHall54StepInterpolator(), minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);
	}

	public HighamHall54Integrator(double minStep, double maxStep, double[] vecAbsoluteTolerance, double[] vecRelativeTolerance) {
		super(false, org.apache.commons.math.ode.HighamHall54Integrator.staticC, org.apache.commons.math.ode.HighamHall54Integrator.staticA, org.apache.commons.math.ode.HighamHall54Integrator.staticB, new org.apache.commons.math.ode.HighamHall54StepInterpolator(), minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance);
	}

	public java.lang.String getName() {
		return org.apache.commons.math.ode.HighamHall54Integrator.methodName;
	}

	public int getOrder() {
		return 5;
	}

	protected double estimateError(double[][] yDotK, double[] y0, double[] y1, double h) {
		double error = 0;
		for (int j = 0; j < (y0.length); ++j) {
			double errSum = (org.apache.commons.math.ode.HighamHall54Integrator.staticE[0]) * (yDotK[0][j]);
			for (int l = 1; l < (org.apache.commons.math.ode.HighamHall54Integrator.staticE.length); ++l) {
				errSum += (org.apache.commons.math.ode.HighamHall54Integrator.staticE[l]) * (yDotK[l][j]);
			}
			double yScale = java.lang.Math.max(java.lang.Math.abs(y0[j]), java.lang.Math.abs(y1[j]));
			double tol = (vecAbsoluteTolerance) == null ? (scalAbsoluteTolerance) + ((scalRelativeTolerance) * yScale) : (vecAbsoluteTolerance[j]) + ((vecRelativeTolerance[j]) * yScale);
			double ratio = (h * errSum) / tol;
			error += ratio * ratio;
		}
		return java.lang.Math.sqrt((error / (y0.length)));
	}
}


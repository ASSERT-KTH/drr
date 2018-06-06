

package org.apache.commons.math.ode;


public class FirstOrderConverter implements org.apache.commons.math.ode.FirstOrderDifferentialEquations {
	private static final long serialVersionUID = -8233657110042144146L;

	public FirstOrderConverter(org.apache.commons.math.ode.SecondOrderDifferentialEquations equations) {
		org.apache.commons.math.ode.FirstOrderConverter.this.equations = equations;
		dimension = equations.getDimension();
		z = new double[dimension];
		zDot = new double[dimension];
		zDDot = new double[dimension];
	}

	public int getDimension() {
		return 2 * (dimension);
	}

	public void computeDerivatives(double t, double[] y, double[] yDot) throws org.apache.commons.math.ode.DerivativeException {
		java.lang.System.arraycopy(y, 0, z, 0, dimension);
		java.lang.System.arraycopy(y, dimension, zDot, 0, dimension);
		equations.computeSecondDerivatives(t, z, zDot, zDDot);
		java.lang.System.arraycopy(zDot, 0, yDot, 0, dimension);
		java.lang.System.arraycopy(zDDot, 0, yDot, dimension, dimension);
	}

	private org.apache.commons.math.ode.SecondOrderDifferentialEquations equations;

	private int dimension;

	private double[] z;

	private double[] zDot;

	private double[] zDDot;
}


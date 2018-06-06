

package org.apache.commons.math.optimization.linear;


public class LinearObjectiveFunction implements java.io.Serializable {
	private static final long serialVersionUID = -4531815507568396090L;

	private final org.apache.commons.math.linear.RealVector coefficients;

	private final double constantTerm;

	public LinearObjectiveFunction(double[] coefficients, double constantTerm) {
		this(new org.apache.commons.math.linear.RealVectorImpl(coefficients), constantTerm);
	}

	public LinearObjectiveFunction(org.apache.commons.math.linear.RealVector coefficients, double constantTerm) {
		this.coefficients = coefficients;
		this.constantTerm = constantTerm;
	}

	public org.apache.commons.math.linear.RealVector getCoefficients() {
		return coefficients;
	}

	public double getConstantTerm() {
		return constantTerm;
	}

	public double getValue(final double[] point) {
		return (coefficients.dotProduct(point)) + (constantTerm);
	}

	public double getValue(final org.apache.commons.math.linear.RealVector point) {
		return (coefficients.dotProduct(point)) + (constantTerm);
	}
}


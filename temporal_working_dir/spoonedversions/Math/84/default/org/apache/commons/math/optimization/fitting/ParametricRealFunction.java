

package org.apache.commons.math.optimization.fitting;


public interface ParametricRealFunction {
	public double value(double x, double[] parameters) throws org.apache.commons.math.FunctionEvaluationException;

	public double[] gradient(double x, double[] parameters) throws org.apache.commons.math.FunctionEvaluationException;
}


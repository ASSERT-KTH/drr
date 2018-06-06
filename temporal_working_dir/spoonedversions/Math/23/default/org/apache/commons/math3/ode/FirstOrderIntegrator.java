

package org.apache.commons.math3.ode;


public interface FirstOrderIntegrator extends org.apache.commons.math3.ode.ODEIntegrator {
	double integrate(org.apache.commons.math3.ode.FirstOrderDifferentialEquations equations, double t0, double[] y0, double t, double[] y) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NoBracketingException, org.apache.commons.math3.exception.NumberIsTooSmallException;
}




package org.apache.commons.math3.ode;


class ParameterizedWrapper implements org.apache.commons.math3.ode.ParameterizedODE {
	private final org.apache.commons.math3.ode.FirstOrderDifferentialEquations fode;

	public ParameterizedWrapper(final org.apache.commons.math3.ode.FirstOrderDifferentialEquations ode) {
		this.fode = ode;
	}

	public int getDimension() {
		return fode.getDimension();
	}

	public void computeDerivatives(double t, double[] y, double[] yDot) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException {
		fode.computeDerivatives(t, y, yDot);
	}

	public java.util.Collection<java.lang.String> getParametersNames() {
		return new java.util.ArrayList<java.lang.String>();
	}

	public boolean isSupported(java.lang.String name) {
		return false;
	}

	public double getParameter(java.lang.String name) throws org.apache.commons.math3.ode.UnknownParameterException {
		if (!(isSupported(name))) {
			throw new org.apache.commons.math3.ode.UnknownParameterException(name);
		}
		return java.lang.Double.NaN;
	}

	public void setParameter(java.lang.String name, double value) {
	}
}


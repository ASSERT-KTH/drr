

package org.apache.commons.math.ode;


class ParameterizedWrapper implements org.apache.commons.math.ode.ParameterizedODE {
	private final org.apache.commons.math.ode.FirstOrderDifferentialEquations fode;

	public ParameterizedWrapper(final org.apache.commons.math.ode.FirstOrderDifferentialEquations ode) {
		this.fode = ode;
	}

	public int getDimension() {
		return fode.getDimension();
	}

	public void computeDerivatives(double t, double[] y, double[] yDot) {
		fode.computeDerivatives(t, y, yDot);
	}

	public java.util.Collection<java.lang.String> getParametersNames() {
		return new java.util.ArrayList<java.lang.String>();
	}

	public boolean isSupported(java.lang.String name) {
		return false;
	}

	public double getParameter(java.lang.String name) throws org.apache.commons.math.exception.MathIllegalArgumentException {
		if (!(isSupported(name))) {
			throw new org.apache.commons.math.exception.MathIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.UNKNOWN_PARAMETER, name);
		}
		return java.lang.Double.NaN;
	}

	public void setParameter(java.lang.String name, double value) {
	}
}


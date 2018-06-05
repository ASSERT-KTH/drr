

package org.apache.commons.math3.ode;


class ParameterJacobianWrapper implements org.apache.commons.math3.ode.ParameterJacobianProvider {
	private final org.apache.commons.math3.ode.FirstOrderDifferentialEquations fode;

	private final org.apache.commons.math3.ode.ParameterizedODE pode;

	private final java.util.Map<java.lang.String, java.lang.Double> hParam;

	public ParameterJacobianWrapper(final org.apache.commons.math3.ode.FirstOrderDifferentialEquations fode, final org.apache.commons.math3.ode.ParameterizedODE pode, final org.apache.commons.math3.ode.ParameterConfiguration[] paramsAndSteps) {
		this.fode = fode;
		this.pode = pode;
		this.hParam = new java.util.HashMap<java.lang.String, java.lang.Double>();
		for (final org.apache.commons.math3.ode.ParameterConfiguration param : paramsAndSteps) {
			final java.lang.String name = param.getParameterName();
			if (pode.isSupported(name)) {
				hParam.put(name, param.getHP());
			}
		}
	}

	public java.util.Collection<java.lang.String> getParametersNames() {
		return pode.getParametersNames();
	}

	public boolean isSupported(java.lang.String name) {
		return pode.isSupported(name);
	}

	public void computeParameterJacobian(double t, double[] y, double[] yDot, java.lang.String paramName, double[] dFdP) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException {
		final int n = fode.getDimension();
		if (pode.isSupported(paramName)) {
			final double[] tmpDot = new double[n];
			final double p = pode.getParameter(paramName);
			final double hP = hParam.get(paramName);
			pode.setParameter(paramName, (p + hP));
			fode.computeDerivatives(t, y, tmpDot);
			for (int i = 0; i < n; ++i) {
				dFdP[i] = ((tmpDot[i]) - (yDot[i])) / hP;
			}
			pode.setParameter(paramName, p);
		}else {
			java.util.Arrays.fill(dFdP, 0, n, 0.0);
		}
	}
}


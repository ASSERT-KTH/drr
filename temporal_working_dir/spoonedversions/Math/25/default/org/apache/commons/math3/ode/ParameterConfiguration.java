

package org.apache.commons.math3.ode;


class ParameterConfiguration implements java.io.Serializable {
	private static final long serialVersionUID = 2247518849090889379L;

	private java.lang.String parameterName;

	private double hP;

	public ParameterConfiguration(final java.lang.String parameterName, final double hP) {
		org.apache.commons.math3.ode.ParameterConfiguration.this.parameterName = parameterName;
		org.apache.commons.math3.ode.ParameterConfiguration.this.hP = hP;
	}

	public java.lang.String getParameterName() {
		return parameterName;
	}

	public double getHP() {
		return hP;
	}

	public void setHP(final double hParam) {
		org.apache.commons.math3.ode.ParameterConfiguration.this.hP = hParam;
	}
}


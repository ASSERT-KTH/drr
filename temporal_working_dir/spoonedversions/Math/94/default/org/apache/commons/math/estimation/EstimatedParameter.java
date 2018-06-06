

package org.apache.commons.math.estimation;


public class EstimatedParameter implements java.io.Serializable {
	public EstimatedParameter(java.lang.String name, double firstEstimate) {
		org.apache.commons.math.estimation.EstimatedParameter.this.name = name;
		estimate = firstEstimate;
		bound = false;
	}

	public EstimatedParameter(java.lang.String name, double firstEstimate, boolean bound) {
		org.apache.commons.math.estimation.EstimatedParameter.this.name = name;
		estimate = firstEstimate;
		org.apache.commons.math.estimation.EstimatedParameter.this.bound = bound;
	}

	public EstimatedParameter(org.apache.commons.math.estimation.EstimatedParameter parameter) {
		name = parameter.name;
		estimate = parameter.estimate;
		bound = parameter.bound;
	}

	public void setEstimate(double estimate) {
		org.apache.commons.math.estimation.EstimatedParameter.this.estimate = estimate;
	}

	public double getEstimate() {
		return estimate;
	}

	public java.lang.String getName() {
		return name;
	}

	public void setBound(boolean bound) {
		org.apache.commons.math.estimation.EstimatedParameter.this.bound = bound;
	}

	public boolean isBound() {
		return bound;
	}

	private java.lang.String name;

	protected double estimate;

	private boolean bound;

	private static final long serialVersionUID = -555440800213416949L;
}


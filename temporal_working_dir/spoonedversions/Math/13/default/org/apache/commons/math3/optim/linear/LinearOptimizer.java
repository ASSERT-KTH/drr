

package org.apache.commons.math3.optim.linear;


public abstract class LinearOptimizer extends org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer {
	private org.apache.commons.math3.optim.linear.LinearObjectiveFunction function;

	private java.util.Collection<org.apache.commons.math3.optim.linear.LinearConstraint> linearConstraints;

	private boolean nonNegative;

	protected LinearOptimizer() {
		super(null);
	}

	protected boolean isRestrictedToNonNegative() {
		return nonNegative;
	}

	protected org.apache.commons.math3.optim.linear.LinearObjectiveFunction getFunction() {
		return function;
	}

	protected java.util.Collection<org.apache.commons.math3.optim.linear.LinearConstraint> getConstraints() {
		return java.util.Collections.unmodifiableCollection(linearConstraints);
	}

	@java.lang.Override
	public org.apache.commons.math3.optim.PointValuePair optimize(org.apache.commons.math3.optim.OptimizationData... optData) throws org.apache.commons.math3.exception.TooManyIterationsException {
		parseOptimizationData(optData);
		return super.optimize(optData);
	}

	private void parseOptimizationData(org.apache.commons.math3.optim.OptimizationData... optData) {
		for (org.apache.commons.math3.optim.OptimizationData data : optData) {
			if (data instanceof org.apache.commons.math3.optim.linear.LinearObjectiveFunction) {
				function = ((org.apache.commons.math3.optim.linear.LinearObjectiveFunction) (data));
				continue;
			}
			if (data instanceof org.apache.commons.math3.optim.linear.LinearConstraintSet) {
				linearConstraints = ((org.apache.commons.math3.optim.linear.LinearConstraintSet) (data)).getConstraints();
				continue;
			}
			if (data instanceof org.apache.commons.math3.optim.linear.NonNegativeConstraint) {
				nonNegative = ((org.apache.commons.math3.optim.linear.NonNegativeConstraint) (data)).isRestrictedToNonNegative();
				continue;
			}
		}
	}
}


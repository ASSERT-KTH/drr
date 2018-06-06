

package org.apache.commons.math3.optim.linear;


public class LinearConstraintSet implements org.apache.commons.math3.optim.OptimizationData {
	private final java.util.Set<org.apache.commons.math3.optim.linear.LinearConstraint> linearConstraints = new java.util.HashSet<org.apache.commons.math3.optim.linear.LinearConstraint>();

	public LinearConstraintSet(org.apache.commons.math3.optim.linear.LinearConstraint... constraints) {
		for (org.apache.commons.math3.optim.linear.LinearConstraint c : constraints) {
			linearConstraints.add(c);
		}
	}

	public LinearConstraintSet(java.util.Collection<org.apache.commons.math3.optim.linear.LinearConstraint> constraints) {
		linearConstraints.addAll(constraints);
	}

	public java.util.Collection<org.apache.commons.math3.optim.linear.LinearConstraint> getConstraints() {
		return java.util.Collections.unmodifiableSet(linearConstraints);
	}
}


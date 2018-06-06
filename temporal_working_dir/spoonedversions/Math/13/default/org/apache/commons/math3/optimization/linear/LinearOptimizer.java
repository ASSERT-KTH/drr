

package org.apache.commons.math3.optimization.linear;


@java.lang.Deprecated
public interface LinearOptimizer {
	void setMaxIterations(int maxIterations);

	int getMaxIterations();

	int getIterations();

	org.apache.commons.math3.optimization.PointValuePair optimize(org.apache.commons.math3.optimization.linear.LinearObjectiveFunction f, java.util.Collection<org.apache.commons.math3.optimization.linear.LinearConstraint> constraints, org.apache.commons.math3.optimization.GoalType goalType, boolean restrictToNonNegative) throws org.apache.commons.math3.exception.MathIllegalStateException;
}


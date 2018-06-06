

package org.apache.commons.math3.optim.nonlinear.scalar;


public class MultiStartMultivariateOptimizer extends org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer<org.apache.commons.math3.optim.PointValuePair> {
	private final org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer optimizer;

	private final java.util.List<org.apache.commons.math3.optim.PointValuePair> optima = new java.util.ArrayList<org.apache.commons.math3.optim.PointValuePair>();

	public MultiStartMultivariateOptimizer(final org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer optimizer, final int starts, final org.apache.commons.math3.random.RandomVectorGenerator generator) throws org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.NullArgumentException {
		super(optimizer, starts, generator);
		this.optimizer = optimizer;
	}

	@java.lang.Override
	public org.apache.commons.math3.optim.PointValuePair[] getOptima() {
		java.util.Collections.sort(optima, getPairComparator());
		return optima.toArray(new org.apache.commons.math3.optim.PointValuePair[0]);
	}

	@java.lang.Override
	protected void store(org.apache.commons.math3.optim.PointValuePair optimum) {
		optima.add(optimum);
	}

	@java.lang.Override
	protected void clear() {
		optima.clear();
	}

	private java.util.Comparator<org.apache.commons.math3.optim.PointValuePair> getPairComparator() {
		return new java.util.Comparator<org.apache.commons.math3.optim.PointValuePair>() {
			public int compare(final org.apache.commons.math3.optim.PointValuePair o1, final org.apache.commons.math3.optim.PointValuePair o2) {
				if (o1 == null) {
					return o2 == null ? 0 : 1;
				}else
					if (o2 == null) {
						return -1;
					}
				
				final double v1 = o1.getValue();
				final double v2 = o2.getValue();
				return (optimizer.getGoalType()) == (org.apache.commons.math3.optim.nonlinear.scalar.GoalType.MINIMIZE) ? java.lang.Double.compare(v1, v2) : java.lang.Double.compare(v2, v1);
			}
		};
	}
}


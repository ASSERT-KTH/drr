

package org.apache.commons.math3.optim.nonlinear.vector;


public class MultiStartMultivariateVectorOptimizer extends org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer<org.apache.commons.math3.optim.PointVectorValuePair> {
	private final org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer optimizer;

	private final java.util.List<org.apache.commons.math3.optim.PointVectorValuePair> optima = new java.util.ArrayList<org.apache.commons.math3.optim.PointVectorValuePair>();

	public MultiStartMultivariateVectorOptimizer(final org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer optimizer, final int starts, final org.apache.commons.math3.random.RandomVectorGenerator generator) throws org.apache.commons.math3.exception.NotStrictlyPositiveException, org.apache.commons.math3.exception.NullArgumentException {
		super(optimizer, starts, generator);
		this.optimizer = optimizer;
	}

	@java.lang.Override
	public org.apache.commons.math3.optim.PointVectorValuePair[] getOptima() {
		java.util.Collections.sort(optima, getPairComparator());
		return optima.toArray(new org.apache.commons.math3.optim.PointVectorValuePair[0]);
	}

	@java.lang.Override
	protected void store(org.apache.commons.math3.optim.PointVectorValuePair optimum) {
		optima.add(optimum);
	}

	@java.lang.Override
	protected void clear() {
		optima.clear();
	}

	private java.util.Comparator<org.apache.commons.math3.optim.PointVectorValuePair> getPairComparator() {
		return new java.util.Comparator<org.apache.commons.math3.optim.PointVectorValuePair>() {
			private final org.apache.commons.math3.linear.RealVector target = new org.apache.commons.math3.linear.ArrayRealVector(optimizer.getTarget(), false);

			private final org.apache.commons.math3.linear.RealMatrix weight = optimizer.getWeight();

			public int compare(final org.apache.commons.math3.optim.PointVectorValuePair o1, final org.apache.commons.math3.optim.PointVectorValuePair o2) {
				if (o1 == null) {
					return o2 == null ? 0 : 1;
				}else
					if (o2 == null) {
						return -1;
					}
				
				return java.lang.Double.compare(weightedResidual(o1), weightedResidual(o2));
			}

			private double weightedResidual(final org.apache.commons.math3.optim.PointVectorValuePair pv) {
				final org.apache.commons.math3.linear.RealVector v = new org.apache.commons.math3.linear.ArrayRealVector(pv.getValueRef(), false);
				final org.apache.commons.math3.linear.RealVector r = target.subtract(v);
				return r.dotProduct(weight.operate(r));
			}
		};
	}
}


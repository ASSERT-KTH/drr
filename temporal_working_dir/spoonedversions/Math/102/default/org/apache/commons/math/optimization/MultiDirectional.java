

package org.apache.commons.math.optimization;


public class MultiDirectional extends org.apache.commons.math.optimization.DirectSearchOptimizer {
	public MultiDirectional() {
		super();
		org.apache.commons.math.optimization.MultiDirectional.this.khi = 2.0;
		org.apache.commons.math.optimization.MultiDirectional.this.gamma = 0.5;
	}

	public MultiDirectional(double khi, double gamma) {
		super();
		org.apache.commons.math.optimization.MultiDirectional.this.khi = khi;
		org.apache.commons.math.optimization.MultiDirectional.this.gamma = gamma;
	}

	protected void iterateSimplex() throws org.apache.commons.math.optimization.CostException {
		while (true) {
			org.apache.commons.math.optimization.PointCostPair[] original = simplex;
			double originalCost = original[0].cost;
			double reflectedCost = evaluateNewSimplex(original, 1.0);
			if (reflectedCost < originalCost) {
				org.apache.commons.math.optimization.PointCostPair[] reflected = simplex;
				double expandedCost = evaluateNewSimplex(original, khi);
				if (reflectedCost <= expandedCost) {
					simplex = reflected;
				}
				return ;
			}
			double contractedCost = evaluateNewSimplex(original, gamma);
			if (contractedCost < originalCost) {
				return ;
			}
		} 
	}

	private double evaluateNewSimplex(org.apache.commons.math.optimization.PointCostPair[] original, double coeff) throws org.apache.commons.math.optimization.CostException {
		double[] xSmallest = original[0].point;
		int n = xSmallest.length;
		simplex = new org.apache.commons.math.optimization.PointCostPair[n + 1];
		simplex[0] = original[0];
		for (int i = 1; i <= n; ++i) {
			double[] xOriginal = original[i].point;
			double[] xTransformed = new double[n];
			for (int j = 0; j < n; ++j) {
				xTransformed[j] = (xSmallest[j]) + (coeff * ((xSmallest[j]) - (xOriginal[j])));
			}
			simplex[i] = new org.apache.commons.math.optimization.PointCostPair(xTransformed, java.lang.Double.NaN);
		}
		evaluateSimplex();
		return simplex[0].cost;
	}

	private double khi;

	private double gamma;
}




package org.apache.commons.math.optimization;


public class NelderMead extends org.apache.commons.math.optimization.DirectSearchOptimizer {
	public NelderMead() {
		super();
		org.apache.commons.math.optimization.NelderMead.this.rho = 1.0;
		org.apache.commons.math.optimization.NelderMead.this.khi = 2.0;
		org.apache.commons.math.optimization.NelderMead.this.gamma = 0.5;
		org.apache.commons.math.optimization.NelderMead.this.sigma = 0.5;
	}

	public NelderMead(double rho, double khi, double gamma, double sigma) {
		super();
		org.apache.commons.math.optimization.NelderMead.this.rho = rho;
		org.apache.commons.math.optimization.NelderMead.this.khi = khi;
		org.apache.commons.math.optimization.NelderMead.this.gamma = gamma;
		org.apache.commons.math.optimization.NelderMead.this.sigma = sigma;
	}

	protected void iterateSimplex() throws org.apache.commons.math.optimization.CostException {
		int n = (simplex.length) - 1;
		double smallest = simplex[0].getCost();
		double secondLargest = simplex[(n - 1)].getCost();
		double largest = simplex[n].getCost();
		double[] xLargest = simplex[n].getPoint();
		double[] centroid = new double[n];
		for (int i = 0; i < n; ++i) {
			double[] x = simplex[i].getPoint();
			for (int j = 0; j < n; ++j) {
				centroid[j] += x[j];
			}
		}
		double scaling = 1.0 / n;
		for (int j = 0; j < n; ++j) {
			centroid[j] *= scaling;
		}
		double[] xR = new double[n];
		for (int j = 0; j < n; ++j) {
			xR[j] = (centroid[j]) + ((rho) * ((centroid[j]) - (xLargest[j])));
		}
		double costR = evaluateCost(xR);
		if ((smallest <= costR) && (costR < secondLargest)) {
			replaceWorstPoint(new org.apache.commons.math.optimization.PointCostPair(xR, costR));
		}else
			if (costR < smallest) {
				double[] xE = new double[n];
				for (int j = 0; j < n; ++j) {
					xE[j] = (centroid[j]) + ((khi) * ((xR[j]) - (centroid[j])));
				}
				double costE = evaluateCost(xE);
				if (costE < costR) {
					replaceWorstPoint(new org.apache.commons.math.optimization.PointCostPair(xE, costE));
				}else {
					replaceWorstPoint(new org.apache.commons.math.optimization.PointCostPair(xR, costR));
				}
			}else {
				if (costR < largest) {
					double[] xC = new double[n];
					for (int j = 0; j < n; ++j) {
						xC[j] = (centroid[j]) + ((gamma) * ((xR[j]) - (centroid[j])));
					}
					double costC = evaluateCost(xC);
					if (costC <= costR) {
						replaceWorstPoint(new org.apache.commons.math.optimization.PointCostPair(xC, costC));
						return ;
					}
				}else {
					double[] xC = new double[n];
					for (int j = 0; j < n; ++j) {
						xC[j] = (centroid[j]) - ((gamma) * ((centroid[j]) - (xLargest[j])));
					}
					double costC = evaluateCost(xC);
					if (costC < largest) {
						replaceWorstPoint(new org.apache.commons.math.optimization.PointCostPair(xC, costC));
						return ;
					}
				}
				double[] xSmallest = simplex[0].getPoint();
				for (int i = 1; i < (simplex.length); ++i) {
					double[] x = simplex[i].getPoint();
					for (int j = 0; j < n; ++j) {
						x[j] = (xSmallest[j]) + ((sigma) * ((x[j]) - (xSmallest[j])));
					}
					simplex[i] = new org.apache.commons.math.optimization.PointCostPair(x, java.lang.Double.NaN);
				}
				evaluateSimplex();
			}
		
	}

	private double rho;

	private double khi;

	private double gamma;

	private double sigma;
}


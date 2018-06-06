

package org.apache.commons.math.optimization;


public abstract class DirectSearchOptimizer {
	protected DirectSearchOptimizer() {
	}

	public org.apache.commons.math.optimization.PointCostPair minimizes(org.apache.commons.math.optimization.CostFunction f, int maxEvaluations, org.apache.commons.math.optimization.ConvergenceChecker checker, double[] vertexA, double[] vertexB) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.optimization.CostException {
		buildSimplex(vertexA, vertexB);
		setSingleStart();
		return minimizes(f, maxEvaluations, checker);
	}

	public org.apache.commons.math.optimization.PointCostPair minimizes(org.apache.commons.math.optimization.CostFunction f, int maxEvaluations, org.apache.commons.math.optimization.ConvergenceChecker checker, double[] vertexA, double[] vertexB, int starts, long seed) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.optimization.CostException {
		buildSimplex(vertexA, vertexB);
		double[] mean = new double[vertexA.length];
		double[] standardDeviation = new double[vertexA.length];
		for (int i = 0; i < (vertexA.length); ++i) {
			mean[i] = 0.5 * ((vertexA[i]) + (vertexB[i]));
			standardDeviation[i] = 0.5 * (java.lang.Math.abs(((vertexA[i]) - (vertexB[i]))));
		}
		org.apache.commons.math.random.RandomGenerator rg = new org.apache.commons.math.random.JDKRandomGenerator();
		rg.setSeed(seed);
		org.apache.commons.math.random.UniformRandomGenerator urg = new org.apache.commons.math.random.UniformRandomGenerator(rg);
		org.apache.commons.math.random.RandomVectorGenerator rvg = new org.apache.commons.math.random.UncorrelatedRandomVectorGenerator(mean, standardDeviation, urg);
		setMultiStart(starts, rvg);
		return minimizes(f, maxEvaluations, checker);
	}

	public org.apache.commons.math.optimization.PointCostPair minimizes(org.apache.commons.math.optimization.CostFunction f, int maxEvaluations, org.apache.commons.math.optimization.ConvergenceChecker checker, double[][] vertices) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.optimization.CostException {
		buildSimplex(vertices);
		setSingleStart();
		return minimizes(f, maxEvaluations, checker);
	}

	public org.apache.commons.math.optimization.PointCostPair minimizes(org.apache.commons.math.optimization.CostFunction f, int maxEvaluations, org.apache.commons.math.optimization.ConvergenceChecker checker, double[][] vertices, int starts, long seed) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.optimization.CostException, org.apache.commons.math.random.NotPositiveDefiniteMatrixException {
		try {
			buildSimplex(vertices);
			org.apache.commons.math.stat.descriptive.moment.VectorialMean meanStat = new org.apache.commons.math.stat.descriptive.moment.VectorialMean(vertices[0].length);
			org.apache.commons.math.stat.descriptive.moment.VectorialCovariance covStat = new org.apache.commons.math.stat.descriptive.moment.VectorialCovariance(vertices[0].length);
			for (int i = 0; i < (vertices.length); ++i) {
				meanStat.increment(vertices[i]);
				covStat.increment(vertices[i]);
			}
			double[] mean = meanStat.getResult();
			org.apache.commons.math.linear.RealMatrix covariance = covStat.getResult();
			org.apache.commons.math.random.RandomGenerator rg = new org.apache.commons.math.random.JDKRandomGenerator();
			rg.setSeed(seed);
			org.apache.commons.math.random.RandomVectorGenerator rvg = new org.apache.commons.math.random.CorrelatedRandomVectorGenerator(mean, covariance, (1.0E-12 * (covariance.getNorm())), new org.apache.commons.math.random.UniformRandomGenerator(rg));
			setMultiStart(starts, rvg);
			return minimizes(f, maxEvaluations, checker);
		} catch (org.apache.commons.math.DimensionMismatchException dme) {
			throw new java.lang.RuntimeException("internal error");
		}
	}

	public org.apache.commons.math.optimization.PointCostPair minimizes(org.apache.commons.math.optimization.CostFunction f, int maxEvaluations, org.apache.commons.math.optimization.ConvergenceChecker checker, org.apache.commons.math.random.RandomVectorGenerator generator) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.optimization.CostException {
		buildSimplex(generator);
		setSingleStart();
		return minimizes(f, maxEvaluations, checker);
	}

	public org.apache.commons.math.optimization.PointCostPair minimizes(org.apache.commons.math.optimization.CostFunction f, int maxEvaluations, org.apache.commons.math.optimization.ConvergenceChecker checker, org.apache.commons.math.random.RandomVectorGenerator generator, int starts) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.optimization.CostException {
		buildSimplex(generator);
		setMultiStart(starts, generator);
		return minimizes(f, maxEvaluations, checker);
	}

	private void buildSimplex(double[] vertexA, double[] vertexB) {
		int n = vertexA.length;
		simplex = new org.apache.commons.math.optimization.PointCostPair[n + 1];
		for (int i = 0; i <= n; ++i) {
			double[] vertex = new double[n];
			if (i > 0) {
				java.lang.System.arraycopy(vertexB, 0, vertex, 0, i);
			}
			if (i < n) {
				java.lang.System.arraycopy(vertexA, i, vertex, i, (n - i));
			}
			simplex[i] = new org.apache.commons.math.optimization.PointCostPair(vertex, java.lang.Double.NaN);
		}
	}

	private void buildSimplex(double[][] vertices) {
		int n = (vertices.length) - 1;
		simplex = new org.apache.commons.math.optimization.PointCostPair[n + 1];
		for (int i = 0; i <= n; ++i) {
			simplex[i] = new org.apache.commons.math.optimization.PointCostPair(vertices[i], java.lang.Double.NaN);
		}
	}

	private void buildSimplex(org.apache.commons.math.random.RandomVectorGenerator generator) {
		double[] vertex = generator.nextVector();
		int n = vertex.length;
		simplex = new org.apache.commons.math.optimization.PointCostPair[n + 1];
		simplex[0] = new org.apache.commons.math.optimization.PointCostPair(vertex, java.lang.Double.NaN);
		for (int i = 1; i <= n; ++i) {
			simplex[i] = new org.apache.commons.math.optimization.PointCostPair(generator.nextVector(), java.lang.Double.NaN);
		}
	}

	private void setSingleStart() {
		starts = 1;
		generator = null;
		minima = null;
	}

	public void setMultiStart(int starts, org.apache.commons.math.random.RandomVectorGenerator generator) {
		if (starts < 2) {
			org.apache.commons.math.optimization.DirectSearchOptimizer.this.starts = 1;
			org.apache.commons.math.optimization.DirectSearchOptimizer.this.generator = null;
			minima = null;
		}else {
			org.apache.commons.math.optimization.DirectSearchOptimizer.this.starts = starts;
			org.apache.commons.math.optimization.DirectSearchOptimizer.this.generator = generator;
			minima = null;
		}
	}

	public org.apache.commons.math.optimization.PointCostPair[] getMinima() {
		return ((org.apache.commons.math.optimization.PointCostPair[]) (minima.clone()));
	}

	private org.apache.commons.math.optimization.PointCostPair minimizes(org.apache.commons.math.optimization.CostFunction f, int maxEvaluations, org.apache.commons.math.optimization.ConvergenceChecker checker) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.optimization.CostException {
		org.apache.commons.math.optimization.DirectSearchOptimizer.this.f = f;
		minima = new org.apache.commons.math.optimization.PointCostPair[starts];
		for (int i = 0; i < (starts); ++i) {
			evaluations = 0;
			evaluateSimplex();
			for (boolean loop = true; loop;) {
				if (checker.converged(simplex)) {
					minima[i] = simplex[0];
					loop = false;
				}else
					if ((evaluations) >= maxEvaluations) {
						minima[i] = null;
						loop = false;
					}else {
						iterateSimplex();
					}
				
			}
			if (i < ((starts) - 1)) {
				buildSimplex(generator);
			}
		}
		java.util.Arrays.sort(minima, org.apache.commons.math.optimization.DirectSearchOptimizer.pointCostPairComparator);
		if ((minima[0]) == null) {
			throw new org.apache.commons.math.ConvergenceException(("none of the {0} start points" + " lead to convergence"), new java.lang.String[]{ java.lang.Integer.toString(starts) });
		}
		return minima[0];
	}

	protected abstract void iterateSimplex() throws org.apache.commons.math.optimization.CostException;

	protected double evaluateCost(double[] x) throws org.apache.commons.math.optimization.CostException {
		(evaluations)++;
		return f.cost(x);
	}

	protected void evaluateSimplex() throws org.apache.commons.math.optimization.CostException {
		for (int i = 0; i < (simplex.length); ++i) {
			org.apache.commons.math.optimization.PointCostPair pair = simplex[i];
			if (java.lang.Double.isNaN(pair.cost)) {
				simplex[i] = new org.apache.commons.math.optimization.PointCostPair(pair.point, evaluateCost(pair.point));
			}
		}
		java.util.Arrays.sort(simplex, org.apache.commons.math.optimization.DirectSearchOptimizer.pointCostPairComparator);
	}

	protected void replaceWorstPoint(org.apache.commons.math.optimization.PointCostPair pointCostPair) {
		int n = (simplex.length) - 1;
		for (int i = 0; i < n; ++i) {
			if ((simplex[i].cost) > (pointCostPair.cost)) {
				org.apache.commons.math.optimization.PointCostPair tmp = simplex[i];
				simplex[i] = pointCostPair;
				pointCostPair = tmp;
			}
		}
		simplex[n] = pointCostPair;
	}

	private static java.util.Comparator pointCostPairComparator = new java.util.Comparator() {
		public int compare(java.lang.Object o1, java.lang.Object o2) {
			if (o1 == null) {
				return o2 == null ? 0 : +1;
			}else
				if (o2 == null) {
					return -1;
				}else {
					double cost1 = ((org.apache.commons.math.optimization.PointCostPair) (o1)).cost;
					double cost2 = ((org.apache.commons.math.optimization.PointCostPair) (o2)).cost;
					return cost1 < cost2 ? -1 : o1 == o2 ? 0 : +1;
				}
			
		}
	};

	protected org.apache.commons.math.optimization.PointCostPair[] simplex;

	private org.apache.commons.math.optimization.CostFunction f;

	private int evaluations;

	private int starts;

	private org.apache.commons.math.random.RandomVectorGenerator generator;

	private org.apache.commons.math.optimization.PointCostPair[] minima;
}


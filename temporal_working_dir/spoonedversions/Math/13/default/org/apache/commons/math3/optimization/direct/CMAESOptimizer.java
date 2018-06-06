

package org.apache.commons.math3.optimization.direct;


@java.lang.Deprecated
public class CMAESOptimizer extends org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer<org.apache.commons.math3.analysis.MultivariateFunction> implements org.apache.commons.math3.optimization.MultivariateOptimizer {
	public static final int DEFAULT_CHECKFEASABLECOUNT = 0;

	public static final double DEFAULT_STOPFITNESS = 0;

	public static final boolean DEFAULT_ISACTIVECMA = true;

	public static final int DEFAULT_MAXITERATIONS = 30000;

	public static final int DEFAULT_DIAGONALONLY = 0;

	public static final org.apache.commons.math3.random.RandomGenerator DEFAULT_RANDOMGENERATOR = new org.apache.commons.math3.random.MersenneTwister();

	private int lambda;

	private boolean isActiveCMA;

	private int checkFeasableCount;

	private double[] inputSigma;

	private int dimension;

	private int diagonalOnly = 0;

	private boolean isMinimize = true;

	private boolean generateStatistics = false;

	private int maxIterations;

	private double stopFitness;

	private double stopTolUpX;

	private double stopTolX;

	private double stopTolFun;

	private double stopTolHistFun;

	private int mu;

	private double logMu2;

	private org.apache.commons.math3.linear.RealMatrix weights;

	private double mueff;

	private double sigma;

	private double cc;

	private double cs;

	private double damps;

	private double ccov1;

	private double ccovmu;

	private double chiN;

	private double ccov1Sep;

	private double ccovmuSep;

	private org.apache.commons.math3.linear.RealMatrix xmean;

	private org.apache.commons.math3.linear.RealMatrix pc;

	private org.apache.commons.math3.linear.RealMatrix ps;

	private double normps;

	private org.apache.commons.math3.linear.RealMatrix B;

	private org.apache.commons.math3.linear.RealMatrix D;

	private org.apache.commons.math3.linear.RealMatrix BD;

	private org.apache.commons.math3.linear.RealMatrix diagD;

	private org.apache.commons.math3.linear.RealMatrix C;

	private org.apache.commons.math3.linear.RealMatrix diagC;

	private int iterations;

	private double[] fitnessHistory;

	private int historySize;

	private org.apache.commons.math3.random.RandomGenerator random;

	private java.util.List<java.lang.Double> statisticsSigmaHistory = new java.util.ArrayList<java.lang.Double>();

	private java.util.List<org.apache.commons.math3.linear.RealMatrix> statisticsMeanHistory = new java.util.ArrayList<org.apache.commons.math3.linear.RealMatrix>();

	private java.util.List<java.lang.Double> statisticsFitnessHistory = new java.util.ArrayList<java.lang.Double>();

	private java.util.List<org.apache.commons.math3.linear.RealMatrix> statisticsDHistory = new java.util.ArrayList<org.apache.commons.math3.linear.RealMatrix>();

	public CMAESOptimizer() {
		this(0);
	}

	public CMAESOptimizer(int lambda) {
		this(lambda, null, org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_MAXITERATIONS, org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_STOPFITNESS, org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_ISACTIVECMA, org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_DIAGONALONLY, org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_CHECKFEASABLECOUNT, org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR, false, null);
	}

	@java.lang.Deprecated
	public CMAESOptimizer(int lambda, double[] inputSigma) {
		this(lambda, inputSigma, org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_MAXITERATIONS, org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_STOPFITNESS, org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_ISACTIVECMA, org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_DIAGONALONLY, org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_CHECKFEASABLECOUNT, org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR, false);
	}

	@java.lang.Deprecated
	public CMAESOptimizer(int lambda, double[] inputSigma, int maxIterations, double stopFitness, boolean isActiveCMA, int diagonalOnly, int checkFeasableCount, org.apache.commons.math3.random.RandomGenerator random, boolean generateStatistics) {
		this(lambda, inputSigma, maxIterations, stopFitness, isActiveCMA, diagonalOnly, checkFeasableCount, random, generateStatistics, new org.apache.commons.math3.optimization.SimpleValueChecker());
	}

	@java.lang.Deprecated
	public CMAESOptimizer(int lambda, double[] inputSigma, int maxIterations, double stopFitness, boolean isActiveCMA, int diagonalOnly, int checkFeasableCount, org.apache.commons.math3.random.RandomGenerator random, boolean generateStatistics, org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> checker) {
		super(checker);
		org.apache.commons.math3.optimization.direct.CMAESOptimizer.this.lambda = lambda;
		org.apache.commons.math3.optimization.direct.CMAESOptimizer.this.inputSigma = (inputSigma == null) ? null : ((double[]) (inputSigma.clone()));
		org.apache.commons.math3.optimization.direct.CMAESOptimizer.this.maxIterations = maxIterations;
		org.apache.commons.math3.optimization.direct.CMAESOptimizer.this.stopFitness = stopFitness;
		org.apache.commons.math3.optimization.direct.CMAESOptimizer.this.isActiveCMA = isActiveCMA;
		org.apache.commons.math3.optimization.direct.CMAESOptimizer.this.diagonalOnly = diagonalOnly;
		org.apache.commons.math3.optimization.direct.CMAESOptimizer.this.checkFeasableCount = checkFeasableCount;
		org.apache.commons.math3.optimization.direct.CMAESOptimizer.this.random = random;
		org.apache.commons.math3.optimization.direct.CMAESOptimizer.this.generateStatistics = generateStatistics;
	}

	public CMAESOptimizer(int maxIterations, double stopFitness, boolean isActiveCMA, int diagonalOnly, int checkFeasableCount, org.apache.commons.math3.random.RandomGenerator random, boolean generateStatistics, org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> checker) {
		super(checker);
		org.apache.commons.math3.optimization.direct.CMAESOptimizer.this.maxIterations = maxIterations;
		org.apache.commons.math3.optimization.direct.CMAESOptimizer.this.stopFitness = stopFitness;
		org.apache.commons.math3.optimization.direct.CMAESOptimizer.this.isActiveCMA = isActiveCMA;
		org.apache.commons.math3.optimization.direct.CMAESOptimizer.this.diagonalOnly = diagonalOnly;
		org.apache.commons.math3.optimization.direct.CMAESOptimizer.this.checkFeasableCount = checkFeasableCount;
		org.apache.commons.math3.optimization.direct.CMAESOptimizer.this.random = random;
		org.apache.commons.math3.optimization.direct.CMAESOptimizer.this.generateStatistics = generateStatistics;
	}

	public java.util.List<java.lang.Double> getStatisticsSigmaHistory() {
		return statisticsSigmaHistory;
	}

	public java.util.List<org.apache.commons.math3.linear.RealMatrix> getStatisticsMeanHistory() {
		return statisticsMeanHistory;
	}

	public java.util.List<java.lang.Double> getStatisticsFitnessHistory() {
		return statisticsFitnessHistory;
	}

	public java.util.List<org.apache.commons.math3.linear.RealMatrix> getStatisticsDHistory() {
		return statisticsDHistory;
	}

	public static class Sigma implements org.apache.commons.math3.optimization.OptimizationData {
		private final double[] sigma;

		public Sigma(double[] s) throws org.apache.commons.math3.exception.NotPositiveException {
			for (int i = 0; i < (s.length); i++) {
				if ((s[i]) < 0) {
					throw new org.apache.commons.math3.exception.NotPositiveException(s[i]);
				}
			}
			sigma = s.clone();
		}

		public double[] getSigma() {
			return sigma.clone();
		}
	}

	public static class PopulationSize implements org.apache.commons.math3.optimization.OptimizationData {
		private final int lambda;

		public PopulationSize(int size) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
			if (size <= 0) {
				throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(size);
			}
			lambda = size;
		}

		public int getPopulationSize() {
			return lambda;
		}
	}

	@java.lang.Override
	protected org.apache.commons.math3.optimization.PointValuePair optimizeInternal(int maxEval, org.apache.commons.math3.analysis.MultivariateFunction f, org.apache.commons.math3.optimization.GoalType goalType, org.apache.commons.math3.optimization.OptimizationData... optData) {
		parseOptimizationData(optData);
		return super.optimizeInternal(maxEval, f, goalType, optData);
	}

	@java.lang.Override
	protected org.apache.commons.math3.optimization.PointValuePair doOptimize() {
		checkParameters();
		isMinimize = getGoalType().equals(org.apache.commons.math3.optimization.GoalType.MINIMIZE);
		final org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction fitfun = new org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction();
		final double[] guess = getStartPoint();
		dimension = guess.length;
		initializeCMA(guess);
		iterations = 0;
		double bestValue = fitfun.value(guess);
		org.apache.commons.math3.optimization.direct.CMAESOptimizer.push(fitnessHistory, bestValue);
		org.apache.commons.math3.optimization.PointValuePair optimum = new org.apache.commons.math3.optimization.PointValuePair(getStartPoint(), (isMinimize ? bestValue : -bestValue));
		org.apache.commons.math3.optimization.PointValuePair lastResult = null;
		generationLoop : for (iterations = 1; (iterations) <= (maxIterations); (iterations)++) {
			final org.apache.commons.math3.linear.RealMatrix arz = randn1(dimension, lambda);
			final org.apache.commons.math3.linear.RealMatrix arx = org.apache.commons.math3.optimization.direct.CMAESOptimizer.zeros(dimension, lambda);
			final double[] fitness = new double[lambda];
			for (int k = 0; k < (lambda); k++) {
				org.apache.commons.math3.linear.RealMatrix arxk = null;
				for (int i = 0; i < ((checkFeasableCount) + 1); i++) {
					if ((diagonalOnly) <= 0) {
						arxk = xmean.add(BD.multiply(arz.getColumnMatrix(k)).scalarMultiply(sigma));
					}else {
						arxk = xmean.add(org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(diagD, arz.getColumnMatrix(k)).scalarMultiply(sigma));
					}
					if ((i >= (checkFeasableCount)) || (fitfun.isFeasible(arxk.getColumn(0)))) {
						break;
					}
					arz.setColumn(k, randn(dimension));
				}
				org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn(arxk, 0, arx, k);
				try {
					fitness[k] = fitfun.value(arx.getColumn(k));
				} catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
					break generationLoop;
				}
			}
			final int[] arindex = sortedIndices(fitness);
			final org.apache.commons.math3.linear.RealMatrix xold = xmean;
			final org.apache.commons.math3.linear.RealMatrix bestArx = org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(arx, org.apache.commons.math3.util.MathArrays.copyOf(arindex, mu));
			xmean = bestArx.multiply(weights);
			final org.apache.commons.math3.linear.RealMatrix bestArz = org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(arz, org.apache.commons.math3.util.MathArrays.copyOf(arindex, mu));
			final org.apache.commons.math3.linear.RealMatrix zmean = bestArz.multiply(weights);
			final boolean hsig = updateEvolutionPaths(zmean, xold);
			if ((diagonalOnly) <= 0) {
				updateCovariance(hsig, bestArx, arz, arindex, xold);
			}else {
				updateCovarianceDiagonalOnly(hsig, bestArz);
			}
			sigma *= java.lang.Math.exp(java.lang.Math.min(1, (((((normps) / (chiN)) - 1) * (cs)) / (damps))));
			final double bestFitness = fitness[arindex[0]];
			final double worstFitness = fitness[arindex[((arindex.length) - 1)]];
			if (bestValue > bestFitness) {
				bestValue = bestFitness;
				lastResult = optimum;
				optimum = new org.apache.commons.math3.optimization.PointValuePair(fitfun.repair(bestArx.getColumn(0)), (isMinimize ? bestFitness : -bestFitness));
				if (((getConvergenceChecker()) != null) && (lastResult != null)) {
					if (getConvergenceChecker().converged(iterations, optimum, lastResult)) {
						break generationLoop;
					}
				}
			}
			if ((stopFitness) != 0) {
				if (bestFitness < (isMinimize ? stopFitness : -(stopFitness))) {
					break generationLoop;
				}
			}
			final double[] sqrtDiagC = org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt(diagC).getColumn(0);
			final double[] pcCol = pc.getColumn(0);
			for (int i = 0; i < (dimension); i++) {
				if (((sigma) * (java.lang.Math.max(java.lang.Math.abs(pcCol[i]), sqrtDiagC[i]))) > (stopTolX)) {
					break;
				}
				if (i >= ((dimension) - 1)) {
					break generationLoop;
				}
			}
			for (int i = 0; i < (dimension); i++) {
				if (((sigma) * (sqrtDiagC[i])) > (stopTolUpX)) {
					break generationLoop;
				}
			}
			final double historyBest = org.apache.commons.math3.optimization.direct.CMAESOptimizer.min(fitnessHistory);
			final double historyWorst = org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(fitnessHistory);
			if (((iterations) > 2) && (((java.lang.Math.max(historyWorst, worstFitness)) - (java.lang.Math.min(historyBest, bestFitness))) < (stopTolFun))) {
				break generationLoop;
			}
			if (((iterations) > (fitnessHistory.length)) && ((historyWorst - historyBest) < (stopTolHistFun))) {
				break generationLoop;
			}
			if (((org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(diagD)) / (org.apache.commons.math3.optimization.direct.CMAESOptimizer.min(diagD))) > 1.0E7) {
				break generationLoop;
			}
			if ((getConvergenceChecker()) != null) {
				final org.apache.commons.math3.optimization.PointValuePair current = new org.apache.commons.math3.optimization.PointValuePair(bestArx.getColumn(0), (isMinimize ? bestFitness : -bestFitness));
				if ((lastResult != null) && (getConvergenceChecker().converged(iterations, current, lastResult))) {
					break generationLoop;
				}
				lastResult = current;
			}
			if (bestValue == (fitness[arindex[((int) (0.1 + ((lambda) / 4.0)))]])) {
				sigma = (sigma) * (java.lang.Math.exp((0.2 + ((cs) / (damps)))));
			}
			if (((iterations) > 2) && (((java.lang.Math.max(historyWorst, bestFitness)) - (java.lang.Math.min(historyBest, bestFitness))) == 0)) {
				sigma = (sigma) * (java.lang.Math.exp((0.2 + ((cs) / (damps)))));
			}
			org.apache.commons.math3.optimization.direct.CMAESOptimizer.push(fitnessHistory, bestFitness);
			fitfun.setValueRange((worstFitness - bestFitness));
			if (generateStatistics) {
				statisticsSigmaHistory.add(sigma);
				statisticsFitnessHistory.add(bestFitness);
				statisticsMeanHistory.add(xmean.transpose());
				statisticsDHistory.add(diagD.transpose().scalarMultiply(100000.0));
			}
		}
		return optimum;
	}

	private void parseOptimizationData(org.apache.commons.math3.optimization.OptimizationData... optData) {
		for (org.apache.commons.math3.optimization.OptimizationData data : optData) {
			if (data instanceof org.apache.commons.math3.optimization.direct.CMAESOptimizer.Sigma) {
				inputSigma = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer.Sigma) (data)).getSigma();
				continue;
			}
			if (data instanceof org.apache.commons.math3.optimization.direct.CMAESOptimizer.PopulationSize) {
				lambda = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer.PopulationSize) (data)).getPopulationSize();
				continue;
			}
		}
	}

	private void checkParameters() {
		final double[] init = getStartPoint();
		final double[] lB = getLowerBound();
		final double[] uB = getUpperBound();
		if ((inputSigma) != null) {
			if ((inputSigma.length) != (init.length)) {
				throw new org.apache.commons.math3.exception.DimensionMismatchException(inputSigma.length, init.length);
			}
			for (int i = 0; i < (init.length); i++) {
				if ((inputSigma[i]) < 0) {
					throw new org.apache.commons.math3.exception.NotPositiveException(inputSigma[i]);
				}
				if ((inputSigma[i]) > ((uB[i]) - (lB[i]))) {
					throw new org.apache.commons.math3.exception.OutOfRangeException(inputSigma[i], 0, ((uB[i]) - (lB[i])));
				}
			}
		}
	}

	private void initializeCMA(double[] guess) {
		if ((lambda) <= 0) {
			lambda = 4 + ((int) (3 * (java.lang.Math.log(dimension))));
		}
		final double[][] sigmaArray = new double[guess.length][1];
		for (int i = 0; i < (guess.length); i++) {
			sigmaArray[i][0] = ((inputSigma) == null) ? 0.3 : inputSigma[i];
		}
		final org.apache.commons.math3.linear.RealMatrix insigma = new org.apache.commons.math3.linear.Array2DRowRealMatrix(sigmaArray, false);
		sigma = org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(insigma);
		stopTolUpX = 1000.0 * (org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(insigma));
		stopTolX = 1.0E-11 * (org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(insigma));
		stopTolFun = 1.0E-12;
		stopTolHistFun = 1.0E-13;
		mu = (lambda) / 2;
		logMu2 = java.lang.Math.log(((mu) + 0.5));
		weights = org.apache.commons.math3.optimization.direct.CMAESOptimizer.log(org.apache.commons.math3.optimization.direct.CMAESOptimizer.sequence(1, mu, 1)).scalarMultiply((-1)).scalarAdd(logMu2);
		double sumw = 0;
		double sumwq = 0;
		for (int i = 0; i < (mu); i++) {
			double w = weights.getEntry(i, 0);
			sumw += w;
			sumwq += w * w;
		}
		weights = weights.scalarMultiply((1 / sumw));
		mueff = (sumw * sumw) / sumwq;
		cc = (4 + ((mueff) / (dimension))) / (((dimension) + 4) + ((2 * (mueff)) / (dimension)));
		cs = ((mueff) + 2) / (((dimension) + (mueff)) + 3.0);
		damps = ((1 + (2 * (java.lang.Math.max(0, ((java.lang.Math.sqrt((((mueff) - 1) / ((dimension) + 1)))) - 1))))) * (java.lang.Math.max(0.3, (1 - ((dimension) / (1.0E-6 + (maxIterations))))))) + (cs);
		ccov1 = 2 / ((((dimension) + 1.3) * ((dimension) + 1.3)) + (mueff));
		ccovmu = java.lang.Math.min((1 - (ccov1)), ((2 * (((mueff) - 2) + (1 / (mueff)))) / ((((dimension) + 2) * ((dimension) + 2)) + (mueff))));
		ccov1Sep = java.lang.Math.min(1, (((ccov1) * ((dimension) + 1.5)) / 3));
		ccovmuSep = java.lang.Math.min((1 - (ccov1)), (((ccovmu) * ((dimension) + 1.5)) / 3));
		chiN = (java.lang.Math.sqrt(dimension)) * ((1 - (1 / (((double) (4)) * (dimension)))) + (1 / ((((double) (21)) * (dimension)) * (dimension))));
		xmean = org.apache.commons.math3.linear.MatrixUtils.createColumnRealMatrix(guess);
		diagD = insigma.scalarMultiply((1 / (sigma)));
		diagC = org.apache.commons.math3.optimization.direct.CMAESOptimizer.square(diagD);
		pc = org.apache.commons.math3.optimization.direct.CMAESOptimizer.zeros(dimension, 1);
		ps = org.apache.commons.math3.optimization.direct.CMAESOptimizer.zeros(dimension, 1);
		normps = ps.getFrobeniusNorm();
		B = org.apache.commons.math3.optimization.direct.CMAESOptimizer.eye(dimension, dimension);
		D = org.apache.commons.math3.optimization.direct.CMAESOptimizer.ones(dimension, 1);
		BD = org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(B, org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat(diagD.transpose(), dimension, 1));
		C = B.multiply(org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag(org.apache.commons.math3.optimization.direct.CMAESOptimizer.square(D)).multiply(B.transpose()));
		historySize = 10 + ((int) (((3 * 10) * (dimension)) / ((double) (lambda))));
		fitnessHistory = new double[historySize];
		for (int i = 0; i < (historySize); i++) {
			fitnessHistory[i] = java.lang.Double.MAX_VALUE;
		}
	}

	private boolean updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix zmean, org.apache.commons.math3.linear.RealMatrix xold) {
		ps = ps.scalarMultiply((1 - (cs))).add(B.multiply(zmean).scalarMultiply(java.lang.Math.sqrt((((cs) * (2 - (cs))) * (mueff)))));
		normps = ps.getFrobeniusNorm();
		final boolean hsig = (((normps) / (java.lang.Math.sqrt((1 - (java.lang.Math.pow((1 - (cs)), (2 * (iterations)))))))) / (chiN)) < (1.4 + (2 / (((double) (dimension)) + 1)));
		pc = pc.scalarMultiply((1 - (cc)));
		if (hsig) {
			pc = pc.add(xmean.subtract(xold).scalarMultiply(((java.lang.Math.sqrt((((cc) * (2 - (cc))) * (mueff)))) / (sigma))));
		}
		return hsig;
	}

	private void updateCovarianceDiagonalOnly(boolean hsig, final org.apache.commons.math3.linear.RealMatrix bestArz) {
		double oldFac = hsig ? 0 : ((ccov1Sep) * (cc)) * (2 - (cc));
		oldFac += (1 - (ccov1Sep)) - (ccovmuSep);
		diagC = diagC.scalarMultiply(oldFac).add(org.apache.commons.math3.optimization.direct.CMAESOptimizer.square(pc).scalarMultiply(ccov1Sep)).add(org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(diagC, org.apache.commons.math3.optimization.direct.CMAESOptimizer.square(bestArz).multiply(weights)).scalarMultiply(ccovmuSep));
		diagD = org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt(diagC);
		if (((diagonalOnly) > 1) && ((iterations) > (diagonalOnly))) {
			diagonalOnly = 0;
			B = org.apache.commons.math3.optimization.direct.CMAESOptimizer.eye(dimension, dimension);
			BD = org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag(diagD);
			C = org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag(diagC);
		}
	}

	private void updateCovariance(boolean hsig, final org.apache.commons.math3.linear.RealMatrix bestArx, final org.apache.commons.math3.linear.RealMatrix arz, final int[] arindex, final org.apache.commons.math3.linear.RealMatrix xold) {
		double negccov = 0;
		if (((ccov1) + (ccovmu)) > 0) {
			final org.apache.commons.math3.linear.RealMatrix arpos = bestArx.subtract(org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat(xold, 1, mu)).scalarMultiply((1 / (sigma)));
			final org.apache.commons.math3.linear.RealMatrix roneu = pc.multiply(pc.transpose()).scalarMultiply(ccov1);
			double oldFac = hsig ? 0 : ((ccov1) * (cc)) * (2 - (cc));
			oldFac += (1 - (ccov1)) - (ccovmu);
			if (isActiveCMA) {
				negccov = (((1 - (ccovmu)) * 0.25) * (mueff)) / ((java.lang.Math.pow(((dimension) + 2), 1.5)) + (2 * (mueff)));
				final double negminresidualvariance = 0.66;
				final double negalphaold = 0.5;
				final int[] arReverseIndex = org.apache.commons.math3.optimization.direct.CMAESOptimizer.reverse(arindex);
				org.apache.commons.math3.linear.RealMatrix arzneg = org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(arz, org.apache.commons.math3.util.MathArrays.copyOf(arReverseIndex, mu));
				org.apache.commons.math3.linear.RealMatrix arnorms = org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt(org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows(org.apache.commons.math3.optimization.direct.CMAESOptimizer.square(arzneg)));
				final int[] idxnorms = sortedIndices(arnorms.getRow(0));
				final org.apache.commons.math3.linear.RealMatrix arnormsSorted = org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(arnorms, idxnorms);
				final int[] idxReverse = org.apache.commons.math3.optimization.direct.CMAESOptimizer.reverse(idxnorms);
				final org.apache.commons.math3.linear.RealMatrix arnormsReverse = org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(arnorms, idxReverse);
				arnorms = org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide(arnormsReverse, arnormsSorted);
				final int[] idxInv = org.apache.commons.math3.optimization.direct.CMAESOptimizer.inverse(idxnorms);
				final org.apache.commons.math3.linear.RealMatrix arnormsInv = org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(arnorms, idxInv);
				final double negcovMax = (1 - negminresidualvariance) / (org.apache.commons.math3.optimization.direct.CMAESOptimizer.square(arnormsInv).multiply(weights).getEntry(0, 0));
				if (negccov > negcovMax) {
					negccov = negcovMax;
				}
				arzneg = org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(arzneg, org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat(arnormsInv, dimension, 1));
				final org.apache.commons.math3.linear.RealMatrix artmp = BD.multiply(arzneg);
				final org.apache.commons.math3.linear.RealMatrix Cneg = artmp.multiply(org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag(weights)).multiply(artmp.transpose());
				oldFac += negalphaold * negccov;
				C = C.scalarMultiply(oldFac).add(roneu).add(arpos.scalarMultiply(((ccovmu) + ((1 - negalphaold) * negccov))).multiply(org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat(weights, 1, dimension), arpos.transpose()))).subtract(Cneg.scalarMultiply(negccov));
			}else {
				C = C.scalarMultiply(oldFac).add(roneu).add(arpos.scalarMultiply(ccovmu).multiply(org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat(weights, 1, dimension), arpos.transpose())));
			}
		}
		updateBD(negccov);
	}

	private void updateBD(double negccov) {
		if (((((ccov1) + (ccovmu)) + negccov) > 0) && ((((((iterations) % 1.0) / (((ccov1) + (ccovmu)) + negccov)) / (dimension)) / 10.0) < 1)) {
			C = org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu(C, 0).add(org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu(C, 1).transpose());
			final org.apache.commons.math3.linear.EigenDecomposition eig = new org.apache.commons.math3.linear.EigenDecomposition(C);
			B = eig.getV();
			D = eig.getD();
			diagD = org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag(D);
			if ((org.apache.commons.math3.optimization.direct.CMAESOptimizer.min(diagD)) <= 0) {
				for (int i = 0; i < (dimension); i++) {
					if ((diagD.getEntry(i, 0)) < 0) {
						diagD.setEntry(i, 0, 0);
					}
				}
				final double tfac = (org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(diagD)) / 1.0E14;
				C = C.add(org.apache.commons.math3.optimization.direct.CMAESOptimizer.eye(dimension, dimension).scalarMultiply(tfac));
				diagD = diagD.add(org.apache.commons.math3.optimization.direct.CMAESOptimizer.ones(dimension, 1).scalarMultiply(tfac));
			}
			if ((org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(diagD)) > (1.0E14 * (org.apache.commons.math3.optimization.direct.CMAESOptimizer.min(diagD)))) {
				final double tfac = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(diagD)) / 1.0E14) - (org.apache.commons.math3.optimization.direct.CMAESOptimizer.min(diagD));
				C = C.add(org.apache.commons.math3.optimization.direct.CMAESOptimizer.eye(dimension, dimension).scalarMultiply(tfac));
				diagD = diagD.add(org.apache.commons.math3.optimization.direct.CMAESOptimizer.ones(dimension, 1).scalarMultiply(tfac));
			}
			diagC = org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag(C);
			diagD = org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt(diagD);
			BD = org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(B, org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat(diagD.transpose(), dimension, 1));
		}
	}

	private static void push(double[] vals, double val) {
		for (int i = (vals.length) - 1; i > 0; i--) {
			vals[i] = vals[(i - 1)];
		}
		vals[0] = val;
	}

	private int[] sortedIndices(final double[] doubles) {
		final org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex[] dis = new org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex[doubles.length];
		for (int i = 0; i < (doubles.length); i++) {
			dis[i] = new org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex(doubles[i], i);
		}
		java.util.Arrays.sort(dis);
		final int[] indices = new int[doubles.length];
		for (int i = 0; i < (doubles.length); i++) {
			indices[i] = dis[i].index;
		}
		return indices;
	}

	private static class DoubleIndex implements java.lang.Comparable<org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex> {
		private final double value;

		private final int index;

		DoubleIndex(double value, int index) {
			this.value = value;
			this.index = index;
		}

		public int compareTo(org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex o) {
			return java.lang.Double.compare(value, o.value);
		}

		@java.lang.Override
		public boolean equals(java.lang.Object other) {
			if ((org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex.this) == other) {
				return true;
			}
			if (other instanceof org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex) {
				return (java.lang.Double.compare(value, ((org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex) (other)).value)) == 0;
			}
			return false;
		}

		@java.lang.Override
		public int hashCode() {
			long bits = java.lang.Double.doubleToLongBits(value);
			return ((int) (((1438542 ^ (bits >>> 32)) ^ bits) & -1));
		}
	}

	private class FitnessFunction {
		private double valueRange;

		private final boolean isRepairMode;

		public FitnessFunction() {
			valueRange = 1;
			isRepairMode = true;
		}

		public double value(final double[] point) {
			double value;
			if (isRepairMode) {
				double[] repaired = repair(point);
				value = (org.apache.commons.math3.optimization.direct.CMAESOptimizer.this.computeObjectiveValue(repaired)) + (penalty(point, repaired));
			}else {
				value = org.apache.commons.math3.optimization.direct.CMAESOptimizer.this.computeObjectiveValue(point);
			}
			return isMinimize ? value : -value;
		}

		public boolean isFeasible(final double[] x) {
			final double[] lB = org.apache.commons.math3.optimization.direct.CMAESOptimizer.this.getLowerBound();
			final double[] uB = org.apache.commons.math3.optimization.direct.CMAESOptimizer.this.getUpperBound();
			for (int i = 0; i < (x.length); i++) {
				if ((x[i]) < (lB[i])) {
					return false;
				}
				if ((x[i]) > (uB[i])) {
					return false;
				}
			}
			return true;
		}

		public void setValueRange(double valueRange) {
			org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.this.valueRange = valueRange;
		}

		private double[] repair(final double[] x) {
			final double[] lB = org.apache.commons.math3.optimization.direct.CMAESOptimizer.this.getLowerBound();
			final double[] uB = org.apache.commons.math3.optimization.direct.CMAESOptimizer.this.getUpperBound();
			final double[] repaired = new double[x.length];
			for (int i = 0; i < (x.length); i++) {
				if ((x[i]) < (lB[i])) {
					repaired[i] = lB[i];
				}else
					if ((x[i]) > (uB[i])) {
						repaired[i] = uB[i];
					}else {
						repaired[i] = x[i];
					}
				
			}
			return repaired;
		}

		private double penalty(final double[] x, final double[] repaired) {
			double penalty = 0;
			for (int i = 0; i < (x.length); i++) {
				double diff = java.lang.Math.abs(((x[i]) - (repaired[i])));
				penalty += diff * (valueRange);
			}
			return isMinimize ? penalty : -penalty;
		}
	}

	private static org.apache.commons.math3.linear.RealMatrix log(final org.apache.commons.math3.linear.RealMatrix m) {
		final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
		for (int r = 0; r < (m.getRowDimension()); r++) {
			for (int c = 0; c < (m.getColumnDimension()); c++) {
				d[r][c] = java.lang.Math.log(m.getEntry(r, c));
			}
		}
		return new org.apache.commons.math3.linear.Array2DRowRealMatrix(d, false);
	}

	private static org.apache.commons.math3.linear.RealMatrix sqrt(final org.apache.commons.math3.linear.RealMatrix m) {
		final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
		for (int r = 0; r < (m.getRowDimension()); r++) {
			for (int c = 0; c < (m.getColumnDimension()); c++) {
				d[r][c] = java.lang.Math.sqrt(m.getEntry(r, c));
			}
		}
		return new org.apache.commons.math3.linear.Array2DRowRealMatrix(d, false);
	}

	private static org.apache.commons.math3.linear.RealMatrix square(final org.apache.commons.math3.linear.RealMatrix m) {
		final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
		for (int r = 0; r < (m.getRowDimension()); r++) {
			for (int c = 0; c < (m.getColumnDimension()); c++) {
				double e = m.getEntry(r, c);
				d[r][c] = e * e;
			}
		}
		return new org.apache.commons.math3.linear.Array2DRowRealMatrix(d, false);
	}

	private static org.apache.commons.math3.linear.RealMatrix times(final org.apache.commons.math3.linear.RealMatrix m, final org.apache.commons.math3.linear.RealMatrix n) {
		final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
		for (int r = 0; r < (m.getRowDimension()); r++) {
			for (int c = 0; c < (m.getColumnDimension()); c++) {
				d[r][c] = (m.getEntry(r, c)) * (n.getEntry(r, c));
			}
		}
		return new org.apache.commons.math3.linear.Array2DRowRealMatrix(d, false);
	}

	private static org.apache.commons.math3.linear.RealMatrix divide(final org.apache.commons.math3.linear.RealMatrix m, final org.apache.commons.math3.linear.RealMatrix n) {
		final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
		for (int r = 0; r < (m.getRowDimension()); r++) {
			for (int c = 0; c < (m.getColumnDimension()); c++) {
				d[r][c] = (m.getEntry(r, c)) / (n.getEntry(r, c));
			}
		}
		return new org.apache.commons.math3.linear.Array2DRowRealMatrix(d, false);
	}

	private static org.apache.commons.math3.linear.RealMatrix selectColumns(final org.apache.commons.math3.linear.RealMatrix m, final int[] cols) {
		final double[][] d = new double[m.getRowDimension()][cols.length];
		for (int r = 0; r < (m.getRowDimension()); r++) {
			for (int c = 0; c < (cols.length); c++) {
				d[r][c] = m.getEntry(r, cols[c]);
			}
		}
		return new org.apache.commons.math3.linear.Array2DRowRealMatrix(d, false);
	}

	private static org.apache.commons.math3.linear.RealMatrix triu(final org.apache.commons.math3.linear.RealMatrix m, int k) {
		final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
		for (int r = 0; r < (m.getRowDimension()); r++) {
			for (int c = 0; c < (m.getColumnDimension()); c++) {
				d[r][c] = (r <= (c - k)) ? m.getEntry(r, c) : 0;
			}
		}
		return new org.apache.commons.math3.linear.Array2DRowRealMatrix(d, false);
	}

	private static org.apache.commons.math3.linear.RealMatrix sumRows(final org.apache.commons.math3.linear.RealMatrix m) {
		final double[][] d = new double[1][m.getColumnDimension()];
		for (int c = 0; c < (m.getColumnDimension()); c++) {
			double sum = 0;
			for (int r = 0; r < (m.getRowDimension()); r++) {
				sum += m.getEntry(r, c);
			}
			d[0][c] = sum;
		}
		return new org.apache.commons.math3.linear.Array2DRowRealMatrix(d, false);
	}

	private static org.apache.commons.math3.linear.RealMatrix diag(final org.apache.commons.math3.linear.RealMatrix m) {
		if ((m.getColumnDimension()) == 1) {
			final double[][] d = new double[m.getRowDimension()][m.getRowDimension()];
			for (int i = 0; i < (m.getRowDimension()); i++) {
				d[i][i] = m.getEntry(i, 0);
			}
			return new org.apache.commons.math3.linear.Array2DRowRealMatrix(d, false);
		}else {
			final double[][] d = new double[m.getRowDimension()][1];
			for (int i = 0; i < (m.getColumnDimension()); i++) {
				d[i][0] = m.getEntry(i, i);
			}
			return new org.apache.commons.math3.linear.Array2DRowRealMatrix(d, false);
		}
	}

	private static void copyColumn(final org.apache.commons.math3.linear.RealMatrix m1, int col1, org.apache.commons.math3.linear.RealMatrix m2, int col2) {
		for (int i = 0; i < (m1.getRowDimension()); i++) {
			m2.setEntry(i, col2, m1.getEntry(i, col1));
		}
	}

	private static org.apache.commons.math3.linear.RealMatrix ones(int n, int m) {
		final double[][] d = new double[n][m];
		for (int r = 0; r < n; r++) {
			java.util.Arrays.fill(d[r], 1);
		}
		return new org.apache.commons.math3.linear.Array2DRowRealMatrix(d, false);
	}

	private static org.apache.commons.math3.linear.RealMatrix eye(int n, int m) {
		final double[][] d = new double[n][m];
		for (int r = 0; r < n; r++) {
			if (r < m) {
				d[r][r] = 1;
			}
		}
		return new org.apache.commons.math3.linear.Array2DRowRealMatrix(d, false);
	}

	private static org.apache.commons.math3.linear.RealMatrix zeros(int n, int m) {
		return new org.apache.commons.math3.linear.Array2DRowRealMatrix(n, m);
	}

	private static org.apache.commons.math3.linear.RealMatrix repmat(final org.apache.commons.math3.linear.RealMatrix mat, int n, int m) {
		final int rd = mat.getRowDimension();
		final int cd = mat.getColumnDimension();
		final double[][] d = new double[n * rd][m * cd];
		for (int r = 0; r < (n * rd); r++) {
			for (int c = 0; c < (m * cd); c++) {
				d[r][c] = mat.getEntry((r % rd), (c % cd));
			}
		}
		return new org.apache.commons.math3.linear.Array2DRowRealMatrix(d, false);
	}

	private static org.apache.commons.math3.linear.RealMatrix sequence(double start, double end, double step) {
		final int size = ((int) (((end - start) / step) + 1));
		final double[][] d = new double[size][1];
		double value = start;
		for (int r = 0; r < size; r++) {
			d[r][0] = value;
			value += step;
		}
		return new org.apache.commons.math3.linear.Array2DRowRealMatrix(d, false);
	}

	private static double max(final org.apache.commons.math3.linear.RealMatrix m) {
		double max = -(java.lang.Double.MAX_VALUE);
		for (int r = 0; r < (m.getRowDimension()); r++) {
			for (int c = 0; c < (m.getColumnDimension()); c++) {
				double e = m.getEntry(r, c);
				if (max < e) {
					max = e;
				}
			}
		}
		return max;
	}

	private static double min(final org.apache.commons.math3.linear.RealMatrix m) {
		double min = java.lang.Double.MAX_VALUE;
		for (int r = 0; r < (m.getRowDimension()); r++) {
			for (int c = 0; c < (m.getColumnDimension()); c++) {
				double e = m.getEntry(r, c);
				if (min > e) {
					min = e;
				}
			}
		}
		return min;
	}

	private static double max(final double[] m) {
		double max = -(java.lang.Double.MAX_VALUE);
		for (int r = 0; r < (m.length); r++) {
			if (max < (m[r])) {
				max = m[r];
			}
		}
		return max;
	}

	private static double min(final double[] m) {
		double min = java.lang.Double.MAX_VALUE;
		for (int r = 0; r < (m.length); r++) {
			if (min > (m[r])) {
				min = m[r];
			}
		}
		return min;
	}

	private static int[] inverse(final int[] indices) {
		final int[] inverse = new int[indices.length];
		for (int i = 0; i < (indices.length); i++) {
			inverse[indices[i]] = i;
		}
		return inverse;
	}

	private static int[] reverse(final int[] indices) {
		final int[] reverse = new int[indices.length];
		for (int i = 0; i < (indices.length); i++) {
			reverse[i] = indices[(((indices.length) - i) - 1)];
		}
		return reverse;
	}

	private double[] randn(int size) {
		final double[] randn = new double[size];
		for (int i = 0; i < size; i++) {
			randn[i] = random.nextGaussian();
		}
		return randn;
	}

	private org.apache.commons.math3.linear.RealMatrix randn1(int size, int popSize) {
		final double[][] d = new double[size][popSize];
		for (int r = 0; r < size; r++) {
			for (int c = 0; c < popSize; c++) {
				d[r][c] = random.nextGaussian();
			}
		}
		return new org.apache.commons.math3.linear.Array2DRowRealMatrix(d, false);
	}
}


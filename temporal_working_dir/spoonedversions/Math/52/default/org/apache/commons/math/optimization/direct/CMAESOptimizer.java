

package org.apache.commons.math.optimization.direct;


public class CMAESOptimizer extends org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer<org.apache.commons.math.analysis.MultivariateRealFunction> implements org.apache.commons.math.optimization.MultivariateRealOptimizer {
	public static final int DEFAULT_CHECKFEASABLECOUNT = 0;

	public static final double DEFAULT_STOPFITNESS = 0;

	public static final boolean DEFAULT_ISACTIVECMA = true;

	public static final int DEFAULT_MAXITERATIONS = 30000;

	public static final int DEFAULT_DIAGONALONLY = 0;

	public static final org.apache.commons.math.random.RandomGenerator DEFAULT_RANDOMGENERATOR = new org.apache.commons.math.random.MersenneTwister();

	private int lambda;

	private boolean isActiveCMA;

	private int checkFeasableCount;

	private double[][] boundaries;

	private double[] inputSigma;

	private int dimension;

	private int diagonalOnly = 0;

	private boolean isMinimize = true;

	private boolean generateStatistics = false;

	private int maxIterations;

	private double stopfitness;

	private double stopTolUpX;

	private double stopTolX;

	private double stopTolFun;

	private double stopTolHistFun;

	private int mu;

	private double logMu2;

	private org.apache.commons.math.linear.RealMatrix weights;

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

	private org.apache.commons.math.linear.RealMatrix xmean;

	private org.apache.commons.math.linear.RealMatrix pc;

	private org.apache.commons.math.linear.RealMatrix ps;

	private double normps;

	private org.apache.commons.math.linear.RealMatrix B;

	private org.apache.commons.math.linear.RealMatrix D;

	private org.apache.commons.math.linear.RealMatrix BD;

	private org.apache.commons.math.linear.RealMatrix diagD;

	private org.apache.commons.math.linear.RealMatrix C;

	private org.apache.commons.math.linear.RealMatrix diagC;

	private int iterations;

	private double[] fitnessHistory;

	private int historySize;

	private org.apache.commons.math.random.RandomGenerator random;

	private java.util.List<java.lang.Double> statisticsSigmaHistory = new java.util.ArrayList<java.lang.Double>();

	private java.util.List<org.apache.commons.math.linear.RealMatrix> statisticsMeanHistory = new java.util.ArrayList<org.apache.commons.math.linear.RealMatrix>();

	private java.util.List<java.lang.Double> statisticsFitnessHistory = new java.util.ArrayList<java.lang.Double>();

	private java.util.List<org.apache.commons.math.linear.RealMatrix> statisticsDHistory = new java.util.ArrayList<org.apache.commons.math.linear.RealMatrix>();

	public CMAESOptimizer() {
		this(0);
	}

	public CMAESOptimizer(int lambda) {
		this(lambda, null, null, org.apache.commons.math.optimization.direct.CMAESOptimizer.DEFAULT_MAXITERATIONS, org.apache.commons.math.optimization.direct.CMAESOptimizer.DEFAULT_STOPFITNESS, org.apache.commons.math.optimization.direct.CMAESOptimizer.DEFAULT_ISACTIVECMA, org.apache.commons.math.optimization.direct.CMAESOptimizer.DEFAULT_DIAGONALONLY, org.apache.commons.math.optimization.direct.CMAESOptimizer.DEFAULT_CHECKFEASABLECOUNT, org.apache.commons.math.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR, false);
	}

	public CMAESOptimizer(int lambda, double[] inputSigma, double[][] boundaries) {
		this(lambda, inputSigma, boundaries, org.apache.commons.math.optimization.direct.CMAESOptimizer.DEFAULT_MAXITERATIONS, org.apache.commons.math.optimization.direct.CMAESOptimizer.DEFAULT_STOPFITNESS, org.apache.commons.math.optimization.direct.CMAESOptimizer.DEFAULT_ISACTIVECMA, org.apache.commons.math.optimization.direct.CMAESOptimizer.DEFAULT_DIAGONALONLY, org.apache.commons.math.optimization.direct.CMAESOptimizer.DEFAULT_CHECKFEASABLECOUNT, org.apache.commons.math.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR, false);
	}

	public CMAESOptimizer(int lambda, double[] inputSigma, double[][] boundaries, int maxIterations, double stopfitness, boolean isActiveCMA, int diagonalOnly, int checkFeasableCount, org.apache.commons.math.random.RandomGenerator random, boolean generateStatistics) {
		org.apache.commons.math.optimization.direct.CMAESOptimizer.this.lambda = lambda;
		org.apache.commons.math.optimization.direct.CMAESOptimizer.this.inputSigma = (inputSigma == null) ? null : ((double[]) (inputSigma.clone()));
		if (boundaries == null) {
			org.apache.commons.math.optimization.direct.CMAESOptimizer.this.boundaries = null;
		}else {
			final int len = boundaries.length;
			org.apache.commons.math.optimization.direct.CMAESOptimizer.this.boundaries = new double[len][];
			for (int i = 0; i < len; i++) {
				org.apache.commons.math.optimization.direct.CMAESOptimizer.this.boundaries[i] = ((boundaries[i]) == null) ? null : ((double[]) (boundaries[i].clone()));
			}
		}
		org.apache.commons.math.optimization.direct.CMAESOptimizer.this.maxIterations = maxIterations;
		org.apache.commons.math.optimization.direct.CMAESOptimizer.this.stopfitness = stopfitness;
		org.apache.commons.math.optimization.direct.CMAESOptimizer.this.isActiveCMA = isActiveCMA;
		org.apache.commons.math.optimization.direct.CMAESOptimizer.this.diagonalOnly = diagonalOnly;
		org.apache.commons.math.optimization.direct.CMAESOptimizer.this.checkFeasableCount = checkFeasableCount;
		org.apache.commons.math.optimization.direct.CMAESOptimizer.this.random = random;
		org.apache.commons.math.optimization.direct.CMAESOptimizer.this.generateStatistics = generateStatistics;
	}

	public java.util.List<java.lang.Double> getStatisticsSigmaHistory() {
		return statisticsSigmaHistory;
	}

	public java.util.List<org.apache.commons.math.linear.RealMatrix> getStatisticsMeanHistory() {
		return statisticsMeanHistory;
	}

	public java.util.List<java.lang.Double> getStatisticsFitnessHistory() {
		return statisticsFitnessHistory;
	}

	public java.util.List<org.apache.commons.math.linear.RealMatrix> getStatisticsDHistory() {
		return statisticsDHistory;
	}

	@java.lang.Override
	protected org.apache.commons.math.optimization.RealPointValuePair doOptimize() {
		checkParameters();
		isMinimize = getGoalType().equals(org.apache.commons.math.optimization.GoalType.MINIMIZE);
		final org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction fitfun = new org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction();
		final double[] guess = fitfun.encode(getStartPoint());
		dimension = guess.length;
		initializeCMA(guess);
		iterations = 0;
		double bestValue = fitfun.value(guess);
		org.apache.commons.math.optimization.direct.CMAESOptimizer.push(fitnessHistory, bestValue);
		org.apache.commons.math.optimization.RealPointValuePair optimum = new org.apache.commons.math.optimization.RealPointValuePair(getStartPoint(), (isMinimize ? bestValue : -bestValue));
		org.apache.commons.math.optimization.RealPointValuePair lastResult = null;
		generationLoop : for (iterations = 1; (iterations) <= (maxIterations); (iterations)++) {
			org.apache.commons.math.linear.RealMatrix arz = randn1(dimension, lambda);
			org.apache.commons.math.linear.RealMatrix arx = org.apache.commons.math.optimization.direct.CMAESOptimizer.zeros(dimension, lambda);
			double[] fitness = new double[lambda];
			for (int k = 0; k < (lambda); k++) {
				org.apache.commons.math.linear.RealMatrix arxk = null;
				for (int i = 0; i < ((checkFeasableCount) + 1); i++) {
					if ((diagonalOnly) <= 0) {
						arxk = xmean.add(BD.multiply(arz.getColumnMatrix(k)).scalarMultiply(sigma));
					}else {
						arxk = xmean.add(org.apache.commons.math.optimization.direct.CMAESOptimizer.times(diagD, arz.getColumnMatrix(k)).scalarMultiply(sigma));
					}
					if ((i >= (checkFeasableCount)) || (fitfun.isFeasible(arxk.getColumn(0)))) {
						break;
					}
					arz.setColumn(k, randn(dimension));
				}
				org.apache.commons.math.optimization.direct.CMAESOptimizer.copyColumn(arxk, 0, arx, k);
				try {
					fitness[k] = fitfun.value(arx.getColumn(k));
				} catch (org.apache.commons.math.exception.TooManyEvaluationsException e) {
					break generationLoop;
				}
			}
			int[] arindex = sortedIndices(fitness);
			org.apache.commons.math.linear.RealMatrix xold = xmean;
			org.apache.commons.math.linear.RealMatrix bestArx = org.apache.commons.math.optimization.direct.CMAESOptimizer.selectColumns(arx, org.apache.commons.math.util.MathUtils.copyOf(arindex, mu));
			xmean = bestArx.multiply(weights);
			org.apache.commons.math.linear.RealMatrix bestArz = org.apache.commons.math.optimization.direct.CMAESOptimizer.selectColumns(arz, org.apache.commons.math.util.MathUtils.copyOf(arindex, mu));
			org.apache.commons.math.linear.RealMatrix zmean = bestArz.multiply(weights);
			boolean hsig = updateEvolutionPaths(zmean, xold);
			if ((diagonalOnly) <= 0) {
				updateCovariance(hsig, bestArx, arz, arindex, xold);
			}else {
				updateCovarianceDiagonalOnly(hsig, bestArz, xold);
			}
			sigma *= java.lang.Math.exp(java.lang.Math.min(1.0, (((((normps) / (chiN)) - 1.0) * (cs)) / (damps))));
			double bestFitness = fitness[arindex[0]];
			double worstFitness = fitness[arindex[((arindex.length) - 1)]];
			if (bestValue > bestFitness) {
				bestValue = bestFitness;
				lastResult = optimum;
				optimum = new org.apache.commons.math.optimization.RealPointValuePair(fitfun.decode(bestArx.getColumn(0)), (isMinimize ? bestFitness : -bestFitness));
				if (((getConvergenceChecker()) != null) && (lastResult != null)) {
					if (getConvergenceChecker().converged(iterations, optimum, lastResult)) {
						break generationLoop;
					}
				}
			}
			if ((stopfitness) != 0) {
				if (bestFitness < (isMinimize ? stopfitness : -(stopfitness))) {
					break generationLoop;
				}
			}
			double[] sqrtDiagC = org.apache.commons.math.optimization.direct.CMAESOptimizer.sqrt(diagC).getColumn(0);
			double[] pcCol = pc.getColumn(0);
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
			double historyBest = org.apache.commons.math.optimization.direct.CMAESOptimizer.min(fitnessHistory);
			double historyWorst = org.apache.commons.math.optimization.direct.CMAESOptimizer.max(fitnessHistory);
			if (((iterations) > 2) && (((java.lang.Math.max(historyWorst, worstFitness)) - (java.lang.Math.min(historyBest, bestFitness))) < (stopTolFun))) {
				break generationLoop;
			}
			if (((iterations) > (fitnessHistory.length)) && ((historyWorst - historyBest) < (stopTolHistFun))) {
				break generationLoop;
			}
			if (((org.apache.commons.math.optimization.direct.CMAESOptimizer.max(diagD)) / (org.apache.commons.math.optimization.direct.CMAESOptimizer.min(diagD))) > 1.0E7) {
				break generationLoop;
			}
			if ((getConvergenceChecker()) != null) {
				org.apache.commons.math.optimization.RealPointValuePair current = new org.apache.commons.math.optimization.RealPointValuePair(bestArx.getColumn(0), (isMinimize ? bestFitness : -bestFitness));
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
			org.apache.commons.math.optimization.direct.CMAESOptimizer.push(fitnessHistory, bestFitness);
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

	private void checkParameters() {
		double[] init = getStartPoint();
		if ((boundaries) != null) {
			if ((boundaries.length) != 2) {
				throw new org.apache.commons.math.exception.MultiDimensionMismatchException(new java.lang.Integer[]{ boundaries.length }, new java.lang.Integer[]{ 2 });
			}
			if (((boundaries[0]) == null) || ((boundaries[1]) == null)) {
				throw new org.apache.commons.math.exception.NoDataException();
			}
			if ((boundaries[0].length) != (init.length)) {
				throw new org.apache.commons.math.exception.MultiDimensionMismatchException(new java.lang.Integer[]{ boundaries[0].length }, new java.lang.Integer[]{ init.length });
			}
			if ((boundaries[1].length) != (init.length)) {
				throw new org.apache.commons.math.exception.MultiDimensionMismatchException(new java.lang.Integer[]{ boundaries[1].length }, new java.lang.Integer[]{ init.length });
			}
			for (int i = 0; i < (init.length); i++) {
				if (((boundaries[0][i]) > (init[i])) || ((boundaries[1][i]) < (init[i]))) {
					throw new org.apache.commons.math.exception.OutOfRangeException(init[i], boundaries[0][i], boundaries[1][i]);
				}
			}
		}
		if ((inputSigma) != null) {
			if ((inputSigma.length) != (init.length)) {
				throw new org.apache.commons.math.exception.MultiDimensionMismatchException(new java.lang.Integer[]{ inputSigma.length }, new java.lang.Integer[]{ init.length });
			}
			for (int i = 0; i < (init.length); i++) {
				if ((inputSigma[i]) < 0) {
					throw new org.apache.commons.math.exception.NotPositiveException(inputSigma[i]);
				}
				if ((boundaries) != null) {
					if ((inputSigma[i]) > 1.0) {
						throw new org.apache.commons.math.exception.OutOfRangeException(inputSigma[i], 0, 1.0);
					}
				}
			}
		}
	}

	private void initializeCMA(double[] guess) {
		if ((lambda) <= 0) {
			lambda = 4 + ((int) (3.0 * (java.lang.Math.log(dimension))));
		}
		double[][] sigmaArray = new double[guess.length][1];
		for (int i = 0; i < (guess.length); i++) {
			sigmaArray[i][0] = ((inputSigma) != null) ? inputSigma[i] : 0.3;
		}
		org.apache.commons.math.linear.RealMatrix insigma = new org.apache.commons.math.linear.Array2DRowRealMatrix(sigmaArray, false);
		sigma = org.apache.commons.math.optimization.direct.CMAESOptimizer.max(insigma);
		stopTolUpX = 1000.0 * (org.apache.commons.math.optimization.direct.CMAESOptimizer.max(insigma));
		stopTolX = 1.0E-11 * (org.apache.commons.math.optimization.direct.CMAESOptimizer.max(insigma));
		stopTolFun = 1.0E-12;
		stopTolHistFun = 1.0E-13;
		mu = (lambda) / 2;
		logMu2 = java.lang.Math.log(((mu) + 0.5));
		weights = org.apache.commons.math.optimization.direct.CMAESOptimizer.log(org.apache.commons.math.optimization.direct.CMAESOptimizer.sequence(1, mu, 1)).scalarMultiply((-1.0)).scalarAdd(logMu2);
		double sumw = 0;
		double sumwq = 0;
		for (int i = 0; i < (mu); i++) {
			double w = weights.getEntry(i, 0);
			sumw += w;
			sumwq += w * w;
		}
		weights = weights.scalarMultiply((1.0 / sumw));
		mueff = (sumw * sumw) / sumwq;
		cc = (4.0 + ((mueff) / (dimension))) / (((dimension) + 4.0) + ((2.0 * (mueff)) / (dimension)));
		cs = ((mueff) + 2.0) / (((dimension) + (mueff)) + 3.0);
		damps = ((1.0 + (2.0 * (java.lang.Math.max(0, ((java.lang.Math.sqrt((((mueff) - 1.0) / ((dimension) + 1.0)))) - 1.0))))) * (java.lang.Math.max(0.3, (1.0 - ((dimension) / (1.0E-6 + (java.lang.Math.min(maxIterations, ((getMaxEvaluations()) / (lambda)))))))))) + (cs);
		ccov1 = 2.0 / ((((dimension) + 1.3) * ((dimension) + 1.3)) + (mueff));
		ccovmu = java.lang.Math.min((1 - (ccov1)), ((2.0 * (((mueff) - 2.0) + (1.0 / (mueff)))) / ((((dimension) + 2.0) * ((dimension) + 2.0)) + (mueff))));
		ccov1Sep = java.lang.Math.min(1, (((ccov1) * ((dimension) + 1.5)) / 3.0));
		ccovmuSep = java.lang.Math.min((1 - (ccov1)), (((ccovmu) * ((dimension) + 1.5)) / 3.0));
		chiN = (java.lang.Math.sqrt(dimension)) * ((1.0 - (1.0 / (4.0 * (dimension)))) + (1 / ((21.0 * (dimension)) * (dimension))));
		xmean = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(guess);
		diagD = insigma.scalarMultiply((1.0 / (sigma)));
		diagC = org.apache.commons.math.optimization.direct.CMAESOptimizer.square(diagD);
		pc = org.apache.commons.math.optimization.direct.CMAESOptimizer.zeros(dimension, 1);
		ps = org.apache.commons.math.optimization.direct.CMAESOptimizer.zeros(dimension, 1);
		normps = ps.getFrobeniusNorm();
		B = org.apache.commons.math.optimization.direct.CMAESOptimizer.eye(dimension, dimension);
		D = org.apache.commons.math.optimization.direct.CMAESOptimizer.ones(dimension, 1);
		BD = org.apache.commons.math.optimization.direct.CMAESOptimizer.times(B, org.apache.commons.math.optimization.direct.CMAESOptimizer.repmat(diagD.transpose(), dimension, 1));
		C = B.multiply(org.apache.commons.math.optimization.direct.CMAESOptimizer.diag(org.apache.commons.math.optimization.direct.CMAESOptimizer.square(D)).multiply(B.transpose()));
		historySize = 10 + ((int) (((3.0 * 10.0) * (dimension)) / (lambda)));
		fitnessHistory = new double[historySize];
		for (int i = 0; i < (historySize); i++) {
			fitnessHistory[i] = java.lang.Double.MAX_VALUE;
		}
	}

	private boolean updateEvolutionPaths(org.apache.commons.math.linear.RealMatrix zmean, org.apache.commons.math.linear.RealMatrix xold) {
		ps = ps.scalarMultiply((1.0 - (cs))).add(B.multiply(zmean).scalarMultiply(java.lang.Math.sqrt((((cs) * (2.0 - (cs))) * (mueff)))));
		normps = ps.getFrobeniusNorm();
		boolean hsig = (((normps) / (java.lang.Math.sqrt((1.0 - (java.lang.Math.pow((1.0 - (cs)), (2.0 * (iterations)))))))) / (chiN)) < (1.4 + (2.0 / ((dimension) + 1.0)));
		pc = pc.scalarMultiply((1.0 - (cc)));
		if (hsig) {
			pc = pc.add(xmean.subtract(xold).scalarMultiply(((java.lang.Math.sqrt((((cc) * (2.0 - (cc))) * (mueff)))) / (sigma))));
		}
		return hsig;
	}

	private void updateCovarianceDiagonalOnly(boolean hsig, final org.apache.commons.math.linear.RealMatrix bestArz, final org.apache.commons.math.linear.RealMatrix xold) {
		double oldFac = hsig ? 0 : ((ccov1Sep) * (cc)) * (2.0 - (cc));
		oldFac += (1.0 - (ccov1Sep)) - (ccovmuSep);
		diagC = diagC.scalarMultiply(oldFac).add(org.apache.commons.math.optimization.direct.CMAESOptimizer.square(pc).scalarMultiply(ccov1Sep)).add(org.apache.commons.math.optimization.direct.CMAESOptimizer.times(diagC, org.apache.commons.math.optimization.direct.CMAESOptimizer.square(bestArz).multiply(weights)).scalarMultiply(ccovmuSep));
		diagD = org.apache.commons.math.optimization.direct.CMAESOptimizer.sqrt(diagC);
		if (((diagonalOnly) > 1) && ((iterations) > (diagonalOnly))) {
			diagonalOnly = 0;
			B = org.apache.commons.math.optimization.direct.CMAESOptimizer.eye(dimension, dimension);
			BD = org.apache.commons.math.optimization.direct.CMAESOptimizer.diag(diagD);
			C = org.apache.commons.math.optimization.direct.CMAESOptimizer.diag(diagC);
		}
	}

	private void updateCovariance(boolean hsig, final org.apache.commons.math.linear.RealMatrix bestArx, final org.apache.commons.math.linear.RealMatrix arz, final int[] arindex, final org.apache.commons.math.linear.RealMatrix xold) {
		double negccov = 0;
		if (((ccov1) + (ccovmu)) > 0) {
			org.apache.commons.math.linear.RealMatrix arpos = bestArx.subtract(org.apache.commons.math.optimization.direct.CMAESOptimizer.repmat(xold, 1, mu)).scalarMultiply((1.0 / (sigma)));
			org.apache.commons.math.linear.RealMatrix roneu = pc.multiply(pc.transpose()).scalarMultiply(ccov1);
			double oldFac = hsig ? 0 : ((ccov1) * (cc)) * (2.0 - (cc));
			oldFac += (1.0 - (ccov1)) - (ccovmu);
			if (isActiveCMA) {
				negccov = (((1.0 - (ccovmu)) * 0.25) * (mueff)) / ((java.lang.Math.pow(((dimension) + 2.0), 1.5)) + (2.0 * (mueff)));
				double negminresidualvariance = 0.66;
				double negalphaold = 0.5;
				int[] arReverseIndex = org.apache.commons.math.optimization.direct.CMAESOptimizer.reverse(arindex);
				org.apache.commons.math.linear.RealMatrix arzneg = org.apache.commons.math.optimization.direct.CMAESOptimizer.selectColumns(arz, org.apache.commons.math.util.MathUtils.copyOf(arReverseIndex, mu));
				org.apache.commons.math.linear.RealMatrix arnorms = org.apache.commons.math.optimization.direct.CMAESOptimizer.sqrt(org.apache.commons.math.optimization.direct.CMAESOptimizer.sumRows(org.apache.commons.math.optimization.direct.CMAESOptimizer.square(arzneg)));
				int[] idxnorms = sortedIndices(arnorms.getRow(0));
				org.apache.commons.math.linear.RealMatrix arnormsSorted = org.apache.commons.math.optimization.direct.CMAESOptimizer.selectColumns(arnorms, idxnorms);
				int[] idxReverse = org.apache.commons.math.optimization.direct.CMAESOptimizer.reverse(idxnorms);
				org.apache.commons.math.linear.RealMatrix arnormsReverse = org.apache.commons.math.optimization.direct.CMAESOptimizer.selectColumns(arnorms, idxReverse);
				arnorms = org.apache.commons.math.optimization.direct.CMAESOptimizer.divide(arnormsReverse, arnormsSorted);
				int[] idxInv = org.apache.commons.math.optimization.direct.CMAESOptimizer.inverse(idxnorms);
				org.apache.commons.math.linear.RealMatrix arnormsInv = org.apache.commons.math.optimization.direct.CMAESOptimizer.selectColumns(arnorms, idxInv);
				double negcovMax = (1.0 - negminresidualvariance) / (org.apache.commons.math.optimization.direct.CMAESOptimizer.square(arnormsInv).multiply(weights).getEntry(0, 0));
				if (negccov > negcovMax) {
					negccov = negcovMax;
				}
				arzneg = org.apache.commons.math.optimization.direct.CMAESOptimizer.times(arzneg, org.apache.commons.math.optimization.direct.CMAESOptimizer.repmat(arnormsInv, dimension, 1));
				org.apache.commons.math.linear.RealMatrix artmp = BD.multiply(arzneg);
				org.apache.commons.math.linear.RealMatrix Cneg = artmp.multiply(org.apache.commons.math.optimization.direct.CMAESOptimizer.diag(weights)).multiply(artmp.transpose());
				oldFac += negalphaold * negccov;
				C = C.scalarMultiply(oldFac).add(roneu).add(arpos.scalarMultiply(((ccovmu) + ((1.0 - negalphaold) * negccov))).multiply(org.apache.commons.math.optimization.direct.CMAESOptimizer.times(org.apache.commons.math.optimization.direct.CMAESOptimizer.repmat(weights, 1, dimension), arpos.transpose()))).subtract(Cneg.scalarMultiply(negccov));
			}else {
				C = C.scalarMultiply(oldFac).add(roneu).add(arpos.scalarMultiply(ccovmu).multiply(org.apache.commons.math.optimization.direct.CMAESOptimizer.times(org.apache.commons.math.optimization.direct.CMAESOptimizer.repmat(weights, 1, dimension), arpos.transpose())));
			}
		}
		updateBD(negccov);
	}

	private void updateBD(double negccov) {
		if (((((ccov1) + (ccovmu)) + negccov) > 0) && ((((((iterations) % 1.0) / (((ccov1) + (ccovmu)) + negccov)) / (dimension)) / 10.0) < 1.0)) {
			C = org.apache.commons.math.optimization.direct.CMAESOptimizer.triu(C, 0).add(org.apache.commons.math.optimization.direct.CMAESOptimizer.triu(C, 1).transpose());
			org.apache.commons.math.linear.EigenDecomposition eig = new org.apache.commons.math.linear.EigenDecompositionImpl(C, 1.0);
			B = eig.getV();
			D = eig.getD();
			diagD = org.apache.commons.math.optimization.direct.CMAESOptimizer.diag(D);
			if ((org.apache.commons.math.optimization.direct.CMAESOptimizer.min(diagD)) <= 0) {
				for (int i = 0; i < (dimension); i++) {
					if ((diagD.getEntry(i, 0)) < 0) {
						diagD.setEntry(i, 0, 0.0);
					}
				}
				double tfac = (org.apache.commons.math.optimization.direct.CMAESOptimizer.max(diagD)) / 1.0E14;
				C = C.add(org.apache.commons.math.optimization.direct.CMAESOptimizer.eye(dimension, dimension).scalarMultiply(tfac));
				diagD = diagD.add(org.apache.commons.math.optimization.direct.CMAESOptimizer.ones(dimension, 1).scalarMultiply(tfac));
			}
			if ((org.apache.commons.math.optimization.direct.CMAESOptimizer.max(diagD)) > (1.0E14 * (org.apache.commons.math.optimization.direct.CMAESOptimizer.min(diagD)))) {
				double tfac = ((org.apache.commons.math.optimization.direct.CMAESOptimizer.max(diagD)) / 1.0E14) - (org.apache.commons.math.optimization.direct.CMAESOptimizer.min(diagD));
				C = C.add(org.apache.commons.math.optimization.direct.CMAESOptimizer.eye(dimension, dimension).scalarMultiply(tfac));
				diagD = diagD.add(org.apache.commons.math.optimization.direct.CMAESOptimizer.ones(dimension, 1).scalarMultiply(tfac));
			}
			diagC = org.apache.commons.math.optimization.direct.CMAESOptimizer.diag(C);
			diagD = org.apache.commons.math.optimization.direct.CMAESOptimizer.sqrt(diagD);
			BD = org.apache.commons.math.optimization.direct.CMAESOptimizer.times(B, org.apache.commons.math.optimization.direct.CMAESOptimizer.repmat(diagD.transpose(), dimension, 1));
		}
	}

	private static void push(double[] vals, double val) {
		for (int i = (vals.length) - 1; i > 0; i--) {
			vals[i] = vals[(i - 1)];
		}
		vals[0] = val;
	}

	private int[] sortedIndices(final double[] doubles) {
		org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex[] dis = new org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex[doubles.length];
		for (int i = 0; i < (doubles.length); i++) {
			dis[i] = new org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex(doubles[i], i);
		}
		java.util.Arrays.sort(dis);
		int[] indices = new int[doubles.length];
		for (int i = 0; i < (doubles.length); i++) {
			indices[i] = dis[i].index;
		}
		return indices;
	}

	private static class DoubleIndex implements java.lang.Comparable<org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex> {
		private double value;

		private int index;

		DoubleIndex(double value, int index) {
			org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex.this.value = value;
			org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex.this.index = index;
		}

		public int compareTo(org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex o) {
			return java.lang.Double.compare(value, o.value);
		}

		@java.lang.Override
		public boolean equals(java.lang.Object other) {
			if ((org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex.this) == other) {
				return true;
			}
			if (other instanceof org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex) {
				return (java.lang.Double.compare(value, ((org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex) (other)).value)) == 0;
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

		private boolean isRepairMode;

		public FitnessFunction() {
			valueRange = 1.0;
			isRepairMode = true;
		}

		public double[] encode(final double[] x) {
			if ((boundaries) == null) {
				return x;
			}
			double[] res = new double[x.length];
			for (int i = 0; i < (x.length); i++) {
				double diff = (boundaries[1][i]) - (boundaries[0][i]);
				res[i] = ((x[i]) - (boundaries[0][i])) / diff;
			}
			return res;
		}

		public double[] decode(final double[] x) {
			if ((boundaries) == null) {
				return x;
			}
			double[] res = new double[x.length];
			for (int i = 0; i < (x.length); i++) {
				double diff = (boundaries[1][i]) - (boundaries[0][i]);
				res[i] = (diff * (x[i])) + (boundaries[0][i]);
			}
			return res;
		}

		public double value(final double[] point) {
			double value;
			if (((boundaries) != null) && (isRepairMode)) {
				double[] repaired = repair(point);
				value = (org.apache.commons.math.optimization.direct.CMAESOptimizer.this.computeObjectiveValue(decode(repaired))) + (penalty(point, repaired));
			}else {
				value = org.apache.commons.math.optimization.direct.CMAESOptimizer.this.computeObjectiveValue(decode(point));
			}
			return isMinimize ? value : -value;
		}

		public boolean isFeasible(final double[] x) {
			if ((boundaries) == null) {
				return true;
			}
			for (int i = 0; i < (x.length); i++) {
				if ((x[i]) < 0) {
					return false;
				}
				if ((x[i]) > 1.0) {
					return false;
				}
			}
			return true;
		}

		public void setValueRange(double valueRange) {
			org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.this.valueRange = valueRange;
		}

		private double[] repair(final double[] x) {
			double[] repaired = new double[x.length];
			for (int i = 0; i < (x.length); i++) {
				if ((x[i]) < 0) {
					repaired[i] = 0;
				}else
					if ((x[i]) > 1.0) {
						repaired[i] = 1.0;
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

	private static org.apache.commons.math.linear.RealMatrix log(final org.apache.commons.math.linear.RealMatrix m) {
		double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
		for (int r = 0; r < (m.getRowDimension()); r++) {
			for (int c = 0; c < (m.getColumnDimension()); c++) {
				d[r][c] = java.lang.Math.log(m.getEntry(r, c));
			}
		}
		return new org.apache.commons.math.linear.Array2DRowRealMatrix(d, false);
	}

	private static org.apache.commons.math.linear.RealMatrix sqrt(final org.apache.commons.math.linear.RealMatrix m) {
		double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
		for (int r = 0; r < (m.getRowDimension()); r++) {
			for (int c = 0; c < (m.getColumnDimension()); c++) {
				d[r][c] = java.lang.Math.sqrt(m.getEntry(r, c));
			}
		}
		return new org.apache.commons.math.linear.Array2DRowRealMatrix(d, false);
	}

	private static org.apache.commons.math.linear.RealMatrix square(final org.apache.commons.math.linear.RealMatrix m) {
		double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
		for (int r = 0; r < (m.getRowDimension()); r++) {
			for (int c = 0; c < (m.getColumnDimension()); c++) {
				double e = m.getEntry(r, c);
				d[r][c] = e * e;
			}
		}
		return new org.apache.commons.math.linear.Array2DRowRealMatrix(d, false);
	}

	private static org.apache.commons.math.linear.RealMatrix times(final org.apache.commons.math.linear.RealMatrix m, final org.apache.commons.math.linear.RealMatrix n) {
		double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
		for (int r = 0; r < (m.getRowDimension()); r++) {
			for (int c = 0; c < (m.getColumnDimension()); c++) {
				d[r][c] = (m.getEntry(r, c)) * (n.getEntry(r, c));
			}
		}
		return new org.apache.commons.math.linear.Array2DRowRealMatrix(d, false);
	}

	private static org.apache.commons.math.linear.RealMatrix divide(final org.apache.commons.math.linear.RealMatrix m, final org.apache.commons.math.linear.RealMatrix n) {
		double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
		for (int r = 0; r < (m.getRowDimension()); r++) {
			for (int c = 0; c < (m.getColumnDimension()); c++) {
				d[r][c] = (m.getEntry(r, c)) / (n.getEntry(r, c));
			}
		}
		return new org.apache.commons.math.linear.Array2DRowRealMatrix(d, false);
	}

	private static org.apache.commons.math.linear.RealMatrix selectColumns(final org.apache.commons.math.linear.RealMatrix m, final int[] cols) {
		double[][] d = new double[m.getRowDimension()][cols.length];
		for (int r = 0; r < (m.getRowDimension()); r++) {
			for (int c = 0; c < (cols.length); c++) {
				d[r][c] = m.getEntry(r, cols[c]);
			}
		}
		return new org.apache.commons.math.linear.Array2DRowRealMatrix(d, false);
	}

	private static org.apache.commons.math.linear.RealMatrix triu(final org.apache.commons.math.linear.RealMatrix m, int k) {
		double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
		for (int r = 0; r < (m.getRowDimension()); r++) {
			for (int c = 0; c < (m.getColumnDimension()); c++) {
				d[r][c] = (r <= (c - k)) ? m.getEntry(r, c) : 0;
			}
		}
		return new org.apache.commons.math.linear.Array2DRowRealMatrix(d, false);
	}

	private static org.apache.commons.math.linear.RealMatrix sumRows(final org.apache.commons.math.linear.RealMatrix m) {
		double[][] d = new double[1][m.getColumnDimension()];
		for (int c = 0; c < (m.getColumnDimension()); c++) {
			double sum = 0;
			for (int r = 0; r < (m.getRowDimension()); r++) {
				sum += m.getEntry(r, c);
			}
			d[0][c] = sum;
		}
		return new org.apache.commons.math.linear.Array2DRowRealMatrix(d, false);
	}

	private static org.apache.commons.math.linear.RealMatrix diag(final org.apache.commons.math.linear.RealMatrix m) {
		if ((m.getColumnDimension()) == 1) {
			double[][] d = new double[m.getRowDimension()][m.getRowDimension()];
			for (int i = 0; i < (m.getRowDimension()); i++) {
				d[i][i] = m.getEntry(i, 0);
			}
			return new org.apache.commons.math.linear.Array2DRowRealMatrix(d, false);
		}else {
			double[][] d = new double[m.getRowDimension()][1];
			for (int i = 0; i < (m.getColumnDimension()); i++) {
				d[i][0] = m.getEntry(i, i);
			}
			return new org.apache.commons.math.linear.Array2DRowRealMatrix(d, false);
		}
	}

	private static void copyColumn(final org.apache.commons.math.linear.RealMatrix m1, int col1, org.apache.commons.math.linear.RealMatrix m2, int col2) {
		for (int i = 0; i < (m1.getRowDimension()); i++) {
			m2.setEntry(i, col2, m1.getEntry(i, col1));
		}
	}

	private static org.apache.commons.math.linear.RealMatrix ones(int n, int m) {
		double[][] d = new double[n][m];
		for (int r = 0; r < n; r++) {
			java.util.Arrays.fill(d[r], 1.0);
		}
		return new org.apache.commons.math.linear.Array2DRowRealMatrix(d, false);
	}

	private static org.apache.commons.math.linear.RealMatrix eye(int n, int m) {
		double[][] d = new double[n][m];
		for (int r = 0; r < n; r++) {
			if (r < m) {
				d[r][r] = 1;
			}
		}
		return new org.apache.commons.math.linear.Array2DRowRealMatrix(d, false);
	}

	private static org.apache.commons.math.linear.RealMatrix zeros(int n, int m) {
		return new org.apache.commons.math.linear.Array2DRowRealMatrix(n, m);
	}

	private static org.apache.commons.math.linear.RealMatrix repmat(final org.apache.commons.math.linear.RealMatrix mat, int n, int m) {
		int rd = mat.getRowDimension();
		int cd = mat.getColumnDimension();
		double[][] d = new double[n * rd][m * cd];
		for (int r = 0; r < (n * rd); r++) {
			for (int c = 0; c < (m * cd); c++) {
				d[r][c] = mat.getEntry((r % rd), (c % cd));
			}
		}
		return new org.apache.commons.math.linear.Array2DRowRealMatrix(d, false);
	}

	private static org.apache.commons.math.linear.RealMatrix sequence(double start, double end, double step) {
		int size = ((int) (((end - start) / step) + 1));
		double[][] d = new double[size][1];
		double value = start;
		for (int r = 0; r < size; r++) {
			d[r][0] = value;
			value += step;
		}
		return new org.apache.commons.math.linear.Array2DRowRealMatrix(d, false);
	}

	private static double max(final org.apache.commons.math.linear.RealMatrix m) {
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

	private static double min(final org.apache.commons.math.linear.RealMatrix m) {
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
		int[] inverse = new int[indices.length];
		for (int i = 0; i < (indices.length); i++) {
			inverse[indices[i]] = i;
		}
		return inverse;
	}

	private static int[] reverse(final int[] indices) {
		int[] reverse = new int[indices.length];
		for (int i = 0; i < (indices.length); i++) {
			reverse[i] = indices[(((indices.length) - i) - 1)];
		}
		return reverse;
	}

	private double[] randn(int size) {
		double[] randn = new double[size];
		for (int i = 0; i < size; i++) {
			randn[i] = random.nextGaussian();
		}
		return randn;
	}

	private org.apache.commons.math.linear.RealMatrix randn1(int size, int popSize) {
		double[][] d = new double[size][popSize];
		for (int r = 0; r < size; r++) {
			for (int c = 0; c < popSize; c++) {
				d[r][c] = random.nextGaussian();
			}
		}
		return new org.apache.commons.math.linear.Array2DRowRealMatrix(d, false);
	}
}


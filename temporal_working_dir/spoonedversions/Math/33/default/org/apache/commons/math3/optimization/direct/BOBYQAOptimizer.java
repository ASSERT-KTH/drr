

package org.apache.commons.math3.optimization.direct;


public class BOBYQAOptimizer extends org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer<org.apache.commons.math3.analysis.MultivariateFunction> implements org.apache.commons.math3.optimization.MultivariateOptimizer {
	public static final int MINIMUM_PROBLEM_DIMENSION = 2;

	public static final double DEFAULT_INITIAL_RADIUS = 10.0;

	public static final double DEFAULT_STOPPING_RADIUS = 1.0E-8;

	private static final double ZERO = 0.0;

	private static final double ONE = 1.0;

	private static final double TWO = 2.0;

	private static final double TEN = 10.0;

	private static final double SIXTEEN = 16.0;

	private static final double TWO_HUNDRED_FIFTY = 250.0;

	private static final double MINUS_ONE = -(org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE);

	private static final double HALF = (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE) / 2;

	private static final double ONE_OVER_FOUR = (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE) / 4;

	private static final double ONE_OVER_EIGHT = (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE) / 8;

	private static final double ONE_OVER_TEN = (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE) / 10;

	private static final double ONE_OVER_A_THOUSAND = (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE) / 1000;

	private final int numberOfInterpolationPoints;

	private double initialTrustRegionRadius;

	private final double stoppingTrustRegionRadius;

	private boolean isMinimize;

	private org.apache.commons.math3.linear.ArrayRealVector currentBest;

	private double[] boundDifference;

	private int trustRegionCenterInterpolationPointIndex;

	private org.apache.commons.math3.linear.Array2DRowRealMatrix bMatrix;

	private org.apache.commons.math3.linear.Array2DRowRealMatrix zMatrix;

	private org.apache.commons.math3.linear.Array2DRowRealMatrix interpolationPoints;

	private org.apache.commons.math3.linear.ArrayRealVector originShift;

	private org.apache.commons.math3.linear.ArrayRealVector fAtInterpolationPoints;

	private org.apache.commons.math3.linear.ArrayRealVector trustRegionCenterOffset;

	private org.apache.commons.math3.linear.ArrayRealVector gradientAtTrustRegionCenter;

	private org.apache.commons.math3.linear.ArrayRealVector lowerDifference;

	private org.apache.commons.math3.linear.ArrayRealVector upperDifference;

	private org.apache.commons.math3.linear.ArrayRealVector modelSecondDerivativesParameters;

	private org.apache.commons.math3.linear.ArrayRealVector newPoint;

	private org.apache.commons.math3.linear.ArrayRealVector alternativeNewPoint;

	private org.apache.commons.math3.linear.ArrayRealVector trialStepPoint;

	private org.apache.commons.math3.linear.ArrayRealVector lagrangeValuesAtNewPoint;

	private org.apache.commons.math3.linear.ArrayRealVector modelSecondDerivativesValues;

	public BOBYQAOptimizer(int numberOfInterpolationPoints) {
		this(numberOfInterpolationPoints, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.DEFAULT_INITIAL_RADIUS, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.DEFAULT_STOPPING_RADIUS);
	}

	public BOBYQAOptimizer(int numberOfInterpolationPoints, double initialTrustRegionRadius, double stoppingTrustRegionRadius) {
		this.numberOfInterpolationPoints = numberOfInterpolationPoints;
		org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.this.initialTrustRegionRadius = initialTrustRegionRadius;
		this.stoppingTrustRegionRadius = stoppingTrustRegionRadius;
	}

	@java.lang.Override
	protected org.apache.commons.math3.optimization.PointValuePair doOptimize() {
		final double[] lowerBound = getLowerBound();
		final double[] upperBound = getUpperBound();
		setup(lowerBound, upperBound);
		isMinimize = (getGoalType()) == (org.apache.commons.math3.optimization.GoalType.MINIMIZE);
		currentBest = new org.apache.commons.math3.linear.ArrayRealVector(getStartPoint());
		final double value = bobyqa(lowerBound, upperBound);
		return new org.apache.commons.math3.optimization.PointValuePair(currentBest.getDataRef(), (isMinimize ? value : -value));
	}

	private double bobyqa(double[] lowerBound, double[] upperBound) {
		org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printMethod();
		final int n = currentBest.getDimension();
		for (int j = 0; j < n; j++) {
			final double boundDiff = boundDifference[j];
			lowerDifference.setEntry(j, ((lowerBound[j]) - (currentBest.getEntry(j))));
			upperDifference.setEntry(j, ((upperBound[j]) - (currentBest.getEntry(j))));
			if ((lowerDifference.getEntry(j)) >= (-(initialTrustRegionRadius))) {
				if ((lowerDifference.getEntry(j)) >= (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
					currentBest.setEntry(j, lowerBound[j]);
					lowerDifference.setEntry(j, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO);
					upperDifference.setEntry(j, boundDiff);
				}else {
					currentBest.setEntry(j, ((lowerBound[j]) + (initialTrustRegionRadius)));
					lowerDifference.setEntry(j, (-(initialTrustRegionRadius)));
					final double deltaOne = (upperBound[j]) - (currentBest.getEntry(j));
					upperDifference.setEntry(j, java.lang.Math.max(deltaOne, initialTrustRegionRadius));
				}
			}else
				if ((upperDifference.getEntry(j)) <= (initialTrustRegionRadius)) {
					if ((upperDifference.getEntry(j)) <= (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
						currentBest.setEntry(j, upperBound[j]);
						lowerDifference.setEntry(j, (-boundDiff));
						upperDifference.setEntry(j, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO);
					}else {
						currentBest.setEntry(j, ((upperBound[j]) - (initialTrustRegionRadius)));
						final double deltaOne = (lowerBound[j]) - (currentBest.getEntry(j));
						final double deltaTwo = -(initialTrustRegionRadius);
						lowerDifference.setEntry(j, java.lang.Math.min(deltaOne, deltaTwo));
						upperDifference.setEntry(j, initialTrustRegionRadius);
					}
				}
			
		}
		return bobyqb(lowerBound, upperBound);
	}

	private double bobyqb(double[] lowerBound, double[] upperBound) {
		org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printMethod();
		final int n = currentBest.getDimension();
		final int npt = numberOfInterpolationPoints;
		final int np = n + 1;
		final int nptm = npt - np;
		final int nh = (n * np) / 2;
		final org.apache.commons.math3.linear.ArrayRealVector work1 = new org.apache.commons.math3.linear.ArrayRealVector(n);
		final org.apache.commons.math3.linear.ArrayRealVector work2 = new org.apache.commons.math3.linear.ArrayRealVector(npt);
		final org.apache.commons.math3.linear.ArrayRealVector work3 = new org.apache.commons.math3.linear.ArrayRealVector(npt);
		double cauchy = java.lang.Double.NaN;
		double alpha = java.lang.Double.NaN;
		double dsq = java.lang.Double.NaN;
		double crvmin = java.lang.Double.NaN;
		trustRegionCenterInterpolationPointIndex = 0;
		prelim(lowerBound, upperBound);
		double xoptsq = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
		for (int i = 0; i < n; i++) {
			trustRegionCenterOffset.setEntry(i, interpolationPoints.getEntry(trustRegionCenterInterpolationPointIndex, i));
			final double deltaOne = trustRegionCenterOffset.getEntry(i);
			xoptsq += deltaOne * deltaOne;
		}
		double fsave = fAtInterpolationPoints.getEntry(0);
		final int kbase = 0;
		int ntrits = 0;
		int itest = 0;
		int knew = 0;
		int nfsav = getEvaluations();
		double rho = initialTrustRegionRadius;
		double delta = rho;
		double diffa = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
		double diffb = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
		double diffc = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
		double f = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
		double beta = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
		double adelt = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
		double denom = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
		double ratio = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
		double dnorm = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
		double scaden = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
		double biglsq = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
		double distsq = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
		int state = 20;
		for (; ;)
			switch (state) {
				case 20 :
					{
						org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printState(20);
						if ((trustRegionCenterInterpolationPointIndex) != kbase) {
							int ih = 0;
							for (int j = 0; j < n; j++) {
								for (int i = 0; i <= j; i++) {
									if (i < j) {
										gradientAtTrustRegionCenter.setEntry(j, ((gradientAtTrustRegionCenter.getEntry(j)) + ((modelSecondDerivativesValues.getEntry(ih)) * (trustRegionCenterOffset.getEntry(i)))));
									}
									gradientAtTrustRegionCenter.setEntry(i, ((gradientAtTrustRegionCenter.getEntry(i)) + ((modelSecondDerivativesValues.getEntry(ih)) * (trustRegionCenterOffset.getEntry(j)))));
									ih++;
								}
							}
							if ((getEvaluations()) > npt) {
								for (int k = 0; k < npt; k++) {
									double temp = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
									for (int j = 0; j < n; j++) {
										temp += (interpolationPoints.getEntry(k, j)) * (trustRegionCenterOffset.getEntry(j));
									}
									temp *= modelSecondDerivativesParameters.getEntry(k);
									for (int i = 0; i < n; i++) {
										gradientAtTrustRegionCenter.setEntry(i, ((gradientAtTrustRegionCenter.getEntry(i)) + (temp * (interpolationPoints.getEntry(k, i)))));
									}
								}
							}
						}
					}
				case 60 :
					{
						org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printState(60);
						final org.apache.commons.math3.linear.ArrayRealVector gnew = new org.apache.commons.math3.linear.ArrayRealVector(n);
						final org.apache.commons.math3.linear.ArrayRealVector xbdi = new org.apache.commons.math3.linear.ArrayRealVector(n);
						final org.apache.commons.math3.linear.ArrayRealVector s = new org.apache.commons.math3.linear.ArrayRealVector(n);
						final org.apache.commons.math3.linear.ArrayRealVector hs = new org.apache.commons.math3.linear.ArrayRealVector(n);
						final org.apache.commons.math3.linear.ArrayRealVector hred = new org.apache.commons.math3.linear.ArrayRealVector(n);
						final double[] dsqCrvmin = trsbox(delta, gnew, xbdi, s, hs, hred);
						dsq = dsqCrvmin[0];
						crvmin = dsqCrvmin[1];
						double deltaOne = delta;
						double deltaTwo = java.lang.Math.sqrt(dsq);
						dnorm = java.lang.Math.min(deltaOne, deltaTwo);
						if (dnorm < ((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF) * rho)) {
							ntrits = -1;
							deltaOne = (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.TEN) * rho;
							distsq = deltaOne * deltaOne;
							if ((getEvaluations()) <= (nfsav + 2)) {
								state = 650;
								break;
							}
							deltaOne = java.lang.Math.max(diffa, diffb);
							final double errbig = java.lang.Math.max(deltaOne, diffc);
							final double frhosq = (rho * (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE_OVER_EIGHT)) * rho;
							if ((crvmin > (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) && (errbig > (frhosq * crvmin))) {
								state = 650;
								break;
							}
							final double bdtol = errbig / rho;
							for (int j = 0; j < n; j++) {
								double bdtest = bdtol;
								if ((newPoint.getEntry(j)) == (lowerDifference.getEntry(j))) {
									bdtest = work1.getEntry(j);
								}
								if ((newPoint.getEntry(j)) == (upperDifference.getEntry(j))) {
									bdtest = -(work1.getEntry(j));
								}
								if (bdtest < bdtol) {
									double curv = modelSecondDerivativesValues.getEntry(((j + (j * j)) / 2));
									for (int k = 0; k < npt; k++) {
										final double d1 = interpolationPoints.getEntry(k, j);
										curv += (modelSecondDerivativesParameters.getEntry(k)) * (d1 * d1);
									}
									bdtest += ((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF) * curv) * rho;
									if (bdtest < bdtol) {
										state = 650;
										break;
									}
								}
							}
							state = 680;
							break;
						}
						++ntrits;
					}
				case 90 :
					{
						org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printState(90);
						if (dsq <= (xoptsq * (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE_OVER_A_THOUSAND))) {
							final double fracsq = xoptsq * (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE_OVER_FOUR);
							double sumpq = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int k = 0; k < npt; k++) {
								sumpq += modelSecondDerivativesParameters.getEntry(k);
								double sum = (-(org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF)) * xoptsq;
								for (int i = 0; i < n; i++) {
									sum += (interpolationPoints.getEntry(k, i)) * (trustRegionCenterOffset.getEntry(i));
								}
								work2.setEntry(k, sum);
								final double temp = fracsq - ((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF) * sum);
								for (int i = 0; i < n; i++) {
									work1.setEntry(i, bMatrix.getEntry(k, i));
									lagrangeValuesAtNewPoint.setEntry(i, ((sum * (interpolationPoints.getEntry(k, i))) + (temp * (trustRegionCenterOffset.getEntry(i)))));
									final int ip = npt + i;
									for (int j = 0; j <= i; j++) {
										bMatrix.setEntry(ip, j, (((bMatrix.getEntry(ip, j)) + ((work1.getEntry(i)) * (lagrangeValuesAtNewPoint.getEntry(j)))) + ((lagrangeValuesAtNewPoint.getEntry(i)) * (work1.getEntry(j)))));
									}
								}
							}
							for (int m = 0; m < nptm; m++) {
								double sumz = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
								double sumw = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
								for (int k = 0; k < npt; k++) {
									sumz += zMatrix.getEntry(k, m);
									lagrangeValuesAtNewPoint.setEntry(k, ((work2.getEntry(k)) * (zMatrix.getEntry(k, m))));
									sumw += lagrangeValuesAtNewPoint.getEntry(k);
								}
								for (int j = 0; j < n; j++) {
									double sum = ((fracsq * sumz) - ((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF) * sumw)) * (trustRegionCenterOffset.getEntry(j));
									for (int k = 0; k < npt; k++) {
										sum += (lagrangeValuesAtNewPoint.getEntry(k)) * (interpolationPoints.getEntry(k, j));
									}
									work1.setEntry(j, sum);
									for (int k = 0; k < npt; k++) {
										bMatrix.setEntry(k, j, ((bMatrix.getEntry(k, j)) + (sum * (zMatrix.getEntry(k, m)))));
									}
								}
								for (int i = 0; i < n; i++) {
									final int ip = i + npt;
									final double temp = work1.getEntry(i);
									for (int j = 0; j <= i; j++) {
										bMatrix.setEntry(ip, j, ((bMatrix.getEntry(ip, j)) + (temp * (work1.getEntry(j)))));
									}
								}
							}
							int ih = 0;
							for (int j = 0; j < n; j++) {
								work1.setEntry(j, (((-(org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF)) * sumpq) * (trustRegionCenterOffset.getEntry(j))));
								for (int k = 0; k < npt; k++) {
									work1.setEntry(j, ((work1.getEntry(j)) + ((modelSecondDerivativesParameters.getEntry(k)) * (interpolationPoints.getEntry(k, j)))));
									interpolationPoints.setEntry(k, j, ((interpolationPoints.getEntry(k, j)) - (trustRegionCenterOffset.getEntry(j))));
								}
								for (int i = 0; i <= j; i++) {
									modelSecondDerivativesValues.setEntry(ih, (((modelSecondDerivativesValues.getEntry(ih)) + ((work1.getEntry(i)) * (trustRegionCenterOffset.getEntry(j)))) + ((trustRegionCenterOffset.getEntry(i)) * (work1.getEntry(j)))));
									bMatrix.setEntry((npt + i), j, bMatrix.getEntry((npt + j), i));
									ih++;
								}
							}
							for (int i = 0; i < n; i++) {
								originShift.setEntry(i, ((originShift.getEntry(i)) + (trustRegionCenterOffset.getEntry(i))));
								newPoint.setEntry(i, ((newPoint.getEntry(i)) - (trustRegionCenterOffset.getEntry(i))));
								lowerDifference.setEntry(i, ((lowerDifference.getEntry(i)) - (trustRegionCenterOffset.getEntry(i))));
								upperDifference.setEntry(i, ((upperDifference.getEntry(i)) - (trustRegionCenterOffset.getEntry(i))));
								trustRegionCenterOffset.setEntry(i, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO);
							}
							xoptsq = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
						}
						if (ntrits == 0) {
							state = 210;
							break;
						}
						state = 230;
						break;
					}
				case 210 :
					{
						org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printState(210);
						final double[] alphaCauchy = altmov(knew, adelt);
						alpha = alphaCauchy[0];
						cauchy = alphaCauchy[1];
						for (int i = 0; i < n; i++) {
							trialStepPoint.setEntry(i, ((newPoint.getEntry(i)) - (trustRegionCenterOffset.getEntry(i))));
						}
					}
				case 230 :
					{
						org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printState(230);
						for (int k = 0; k < npt; k++) {
							double suma = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
							double sumb = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
							double sum = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int j = 0; j < n; j++) {
								suma += (interpolationPoints.getEntry(k, j)) * (trialStepPoint.getEntry(j));
								sumb += (interpolationPoints.getEntry(k, j)) * (trustRegionCenterOffset.getEntry(j));
								sum += (bMatrix.getEntry(k, j)) * (trialStepPoint.getEntry(j));
							}
							work3.setEntry(k, (suma * (((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF) * suma) + sumb)));
							lagrangeValuesAtNewPoint.setEntry(k, sum);
							work2.setEntry(k, suma);
						}
						beta = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
						for (int m = 0; m < nptm; m++) {
							double sum = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int k = 0; k < npt; k++) {
								sum += (zMatrix.getEntry(k, m)) * (work3.getEntry(k));
							}
							beta -= sum * sum;
							for (int k = 0; k < npt; k++) {
								lagrangeValuesAtNewPoint.setEntry(k, ((lagrangeValuesAtNewPoint.getEntry(k)) + (sum * (zMatrix.getEntry(k, m)))));
							}
						}
						dsq = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
						double bsum = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
						double dx = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
						for (int j = 0; j < n; j++) {
							final double d1 = trialStepPoint.getEntry(j);
							dsq += d1 * d1;
							double sum = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int k = 0; k < npt; k++) {
								sum += (work3.getEntry(k)) * (bMatrix.getEntry(k, j));
							}
							bsum += sum * (trialStepPoint.getEntry(j));
							final int jp = npt + j;
							for (int i = 0; i < n; i++) {
								sum += (bMatrix.getEntry(jp, i)) * (trialStepPoint.getEntry(i));
							}
							lagrangeValuesAtNewPoint.setEntry(jp, sum);
							bsum += sum * (trialStepPoint.getEntry(j));
							dx += (trialStepPoint.getEntry(j)) * (trustRegionCenterOffset.getEntry(j));
						}
						beta = (((dx * dx) + (dsq * (((xoptsq + dx) + dx) + ((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF) * dsq)))) + beta) - bsum;
						lagrangeValuesAtNewPoint.setEntry(trustRegionCenterInterpolationPointIndex, ((lagrangeValuesAtNewPoint.getEntry(trustRegionCenterInterpolationPointIndex)) + (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE)));
						if (ntrits == 0) {
							final double d1 = lagrangeValuesAtNewPoint.getEntry(knew);
							denom = (d1 * d1) + (alpha * beta);
							if ((denom < cauchy) && (cauchy > (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO))) {
								for (int i = 0; i < n; i++) {
									newPoint.setEntry(i, alternativeNewPoint.getEntry(i));
									trialStepPoint.setEntry(i, ((newPoint.getEntry(i)) - (trustRegionCenterOffset.getEntry(i))));
								}
								cauchy = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
								state = 230;
								break;
							}
						}else {
							final double delsq = delta * delta;
							scaden = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
							biglsq = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
							knew = 0;
							for (int k = 0; k < npt; k++) {
								if (k == (trustRegionCenterInterpolationPointIndex)) {
									continue;
								}
								double hdiag = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
								for (int m = 0; m < nptm; m++) {
									final double d1 = zMatrix.getEntry(k, m);
									hdiag += d1 * d1;
								}
								final double d2 = lagrangeValuesAtNewPoint.getEntry(k);
								final double den = (beta * hdiag) + (d2 * d2);
								distsq = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
								for (int j = 0; j < n; j++) {
									final double d3 = (interpolationPoints.getEntry(k, j)) - (trustRegionCenterOffset.getEntry(j));
									distsq += d3 * d3;
								}
								final double d4 = distsq / delsq;
								final double temp = java.lang.Math.max(org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE, (d4 * d4));
								if ((temp * den) > scaden) {
									scaden = temp * den;
									knew = k;
									denom = den;
								}
								final double d5 = lagrangeValuesAtNewPoint.getEntry(k);
								biglsq = java.lang.Math.max(biglsq, (temp * (d5 * d5)));
							}
						}
					}
				case 360 :
					{
						org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printState(360);
						for (int i = 0; i < n; i++) {
							final double d3 = lowerBound[i];
							final double d4 = (originShift.getEntry(i)) + (newPoint.getEntry(i));
							final double d1 = java.lang.Math.max(d3, d4);
							final double d2 = upperBound[i];
							currentBest.setEntry(i, java.lang.Math.min(d1, d2));
							if ((newPoint.getEntry(i)) == (lowerDifference.getEntry(i))) {
								currentBest.setEntry(i, lowerBound[i]);
							}
							if ((newPoint.getEntry(i)) == (upperDifference.getEntry(i))) {
								currentBest.setEntry(i, upperBound[i]);
							}
						}
						f = computeObjectiveValue(currentBest.toArray());
						if (!(isMinimize))
							f = -f;
						
						if (ntrits == (-1)) {
							fsave = f;
							state = 720;
							break;
						}
						final double fopt = fAtInterpolationPoints.getEntry(trustRegionCenterInterpolationPointIndex);
						double vquad = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
						int ih = 0;
						for (int j = 0; j < n; j++) {
							vquad += (trialStepPoint.getEntry(j)) * (gradientAtTrustRegionCenter.getEntry(j));
							for (int i = 0; i <= j; i++) {
								double temp = (trialStepPoint.getEntry(i)) * (trialStepPoint.getEntry(j));
								if (i == j) {
									temp *= org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF;
								}
								vquad += (modelSecondDerivativesValues.getEntry(ih)) * temp;
								ih++;
							}
						}
						for (int k = 0; k < npt; k++) {
							final double d1 = work2.getEntry(k);
							final double d2 = d1 * d1;
							vquad += ((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF) * (modelSecondDerivativesParameters.getEntry(k))) * d2;
						}
						final double diff = (f - fopt) - vquad;
						diffc = diffb;
						diffb = diffa;
						diffa = java.lang.Math.abs(diff);
						if (dnorm > rho) {
							nfsav = getEvaluations();
						}
						if (ntrits > 0) {
							if (vquad >= (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
								throw new org.apache.commons.math3.exception.MathIllegalStateException(org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED, vquad);
							}
							ratio = (f - fopt) / vquad;
							final double hDelta = (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF) * delta;
							if (ratio <= (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE_OVER_TEN)) {
								delta = java.lang.Math.min(hDelta, dnorm);
							}else
								if (ratio <= 0.7) {
									delta = java.lang.Math.max(hDelta, dnorm);
								}else {
									delta = java.lang.Math.max(hDelta, (2 * dnorm));
								}
							
							if (delta <= (rho * 1.5)) {
								delta = rho;
							}
							if (f < fopt) {
								final int ksav = knew;
								final double densav = denom;
								final double delsq = delta * delta;
								scaden = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
								biglsq = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
								knew = 0;
								for (int k = 0; k < npt; k++) {
									double hdiag = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
									for (int m = 0; m < nptm; m++) {
										final double d1 = zMatrix.getEntry(k, m);
										hdiag += d1 * d1;
									}
									final double d1 = lagrangeValuesAtNewPoint.getEntry(k);
									final double den = (beta * hdiag) + (d1 * d1);
									distsq = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
									for (int j = 0; j < n; j++) {
										final double d2 = (interpolationPoints.getEntry(k, j)) - (newPoint.getEntry(j));
										distsq += d2 * d2;
									}
									final double d3 = distsq / delsq;
									final double temp = java.lang.Math.max(org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE, (d3 * d3));
									if ((temp * den) > scaden) {
										scaden = temp * den;
										knew = k;
										denom = den;
									}
									final double d4 = lagrangeValuesAtNewPoint.getEntry(k);
									final double d5 = temp * (d4 * d4);
									biglsq = java.lang.Math.max(biglsq, d5);
								}
								if (scaden <= ((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF) * biglsq)) {
									knew = ksav;
									denom = densav;
								}
							}
						}
						update(beta, denom, knew);
						ih = 0;
						final double pqold = modelSecondDerivativesParameters.getEntry(knew);
						modelSecondDerivativesParameters.setEntry(knew, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO);
						for (int i = 0; i < n; i++) {
							final double temp = pqold * (interpolationPoints.getEntry(knew, i));
							for (int j = 0; j <= i; j++) {
								modelSecondDerivativesValues.setEntry(ih, ((modelSecondDerivativesValues.getEntry(ih)) + (temp * (interpolationPoints.getEntry(knew, j)))));
								ih++;
							}
						}
						for (int m = 0; m < nptm; m++) {
							final double temp = diff * (zMatrix.getEntry(knew, m));
							for (int k = 0; k < npt; k++) {
								modelSecondDerivativesParameters.setEntry(k, ((modelSecondDerivativesParameters.getEntry(k)) + (temp * (zMatrix.getEntry(k, m)))));
							}
						}
						fAtInterpolationPoints.setEntry(knew, f);
						for (int i = 0; i < n; i++) {
							interpolationPoints.setEntry(knew, i, newPoint.getEntry(i));
							work1.setEntry(i, bMatrix.getEntry(knew, i));
						}
						for (int k = 0; k < npt; k++) {
							double suma = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int m = 0; m < nptm; m++) {
								suma += (zMatrix.getEntry(knew, m)) * (zMatrix.getEntry(k, m));
							}
							double sumb = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int j = 0; j < n; j++) {
								sumb += (interpolationPoints.getEntry(k, j)) * (trustRegionCenterOffset.getEntry(j));
							}
							final double temp = suma * sumb;
							for (int i = 0; i < n; i++) {
								work1.setEntry(i, ((work1.getEntry(i)) + (temp * (interpolationPoints.getEntry(k, i)))));
							}
						}
						for (int i = 0; i < n; i++) {
							gradientAtTrustRegionCenter.setEntry(i, ((gradientAtTrustRegionCenter.getEntry(i)) + (diff * (work1.getEntry(i)))));
						}
						if (f < fopt) {
							trustRegionCenterInterpolationPointIndex = knew;
							xoptsq = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
							ih = 0;
							for (int j = 0; j < n; j++) {
								trustRegionCenterOffset.setEntry(j, newPoint.getEntry(j));
								final double d1 = trustRegionCenterOffset.getEntry(j);
								xoptsq += d1 * d1;
								for (int i = 0; i <= j; i++) {
									if (i < j) {
										gradientAtTrustRegionCenter.setEntry(j, ((gradientAtTrustRegionCenter.getEntry(j)) + ((modelSecondDerivativesValues.getEntry(ih)) * (trialStepPoint.getEntry(i)))));
									}
									gradientAtTrustRegionCenter.setEntry(i, ((gradientAtTrustRegionCenter.getEntry(i)) + ((modelSecondDerivativesValues.getEntry(ih)) * (trialStepPoint.getEntry(j)))));
									ih++;
								}
							}
							for (int k = 0; k < npt; k++) {
								double temp = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
								for (int j = 0; j < n; j++) {
									temp += (interpolationPoints.getEntry(k, j)) * (trialStepPoint.getEntry(j));
								}
								temp *= modelSecondDerivativesParameters.getEntry(k);
								for (int i = 0; i < n; i++) {
									gradientAtTrustRegionCenter.setEntry(i, ((gradientAtTrustRegionCenter.getEntry(i)) + (temp * (interpolationPoints.getEntry(k, i)))));
								}
							}
						}
						if (ntrits > 0) {
							for (int k = 0; k < npt; k++) {
								lagrangeValuesAtNewPoint.setEntry(k, ((fAtInterpolationPoints.getEntry(k)) - (fAtInterpolationPoints.getEntry(trustRegionCenterInterpolationPointIndex))));
								work3.setEntry(k, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO);
							}
							for (int j = 0; j < nptm; j++) {
								double sum = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
								for (int k = 0; k < npt; k++) {
									sum += (zMatrix.getEntry(k, j)) * (lagrangeValuesAtNewPoint.getEntry(k));
								}
								for (int k = 0; k < npt; k++) {
									work3.setEntry(k, ((work3.getEntry(k)) + (sum * (zMatrix.getEntry(k, j)))));
								}
							}
							for (int k = 0; k < npt; k++) {
								double sum = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
								for (int j = 0; j < n; j++) {
									sum += (interpolationPoints.getEntry(k, j)) * (trustRegionCenterOffset.getEntry(j));
								}
								work2.setEntry(k, work3.getEntry(k));
								work3.setEntry(k, (sum * (work3.getEntry(k))));
							}
							double gqsq = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
							double gisq = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int i = 0; i < n; i++) {
								double sum = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
								for (int k = 0; k < npt; k++) {
									sum += ((bMatrix.getEntry(k, i)) * (lagrangeValuesAtNewPoint.getEntry(k))) + ((interpolationPoints.getEntry(k, i)) * (work3.getEntry(k)));
								}
								if ((trustRegionCenterOffset.getEntry(i)) == (lowerDifference.getEntry(i))) {
									final double d1 = java.lang.Math.min(org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO, gradientAtTrustRegionCenter.getEntry(i));
									gqsq += d1 * d1;
									final double d2 = java.lang.Math.min(org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO, sum);
									gisq += d2 * d2;
								}else
									if ((trustRegionCenterOffset.getEntry(i)) == (upperDifference.getEntry(i))) {
										final double d1 = java.lang.Math.max(org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO, gradientAtTrustRegionCenter.getEntry(i));
										gqsq += d1 * d1;
										final double d2 = java.lang.Math.max(org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO, sum);
										gisq += d2 * d2;
									}else {
										final double d1 = gradientAtTrustRegionCenter.getEntry(i);
										gqsq += d1 * d1;
										gisq += sum * sum;
									}
								
								lagrangeValuesAtNewPoint.setEntry((npt + i), sum);
							}
							++itest;
							if (gqsq < ((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.TEN) * gisq)) {
								itest = 0;
							}
							if (itest >= 3) {
								for (int i = 0, max = java.lang.Math.max(npt, nh); i < max; i++) {
									if (i < n) {
										gradientAtTrustRegionCenter.setEntry(i, lagrangeValuesAtNewPoint.getEntry((npt + i)));
									}
									if (i < npt) {
										modelSecondDerivativesParameters.setEntry(i, work2.getEntry(i));
									}
									if (i < nh) {
										modelSecondDerivativesValues.setEntry(i, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO);
									}
									itest = 0;
								}
							}
						}
						if (ntrits == 0) {
							state = 60;
							break;
						}
						if (f <= (fopt + ((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE_OVER_TEN) * vquad))) {
							state = 60;
							break;
						}
						final double d1 = (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.TWO) * delta;
						final double d2 = (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.TEN) * rho;
						distsq = java.lang.Math.max((d1 * d1), (d2 * d2));
					}
				case 650 :
					{
						org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printState(650);
						knew = -1;
						for (int k = 0; k < npt; k++) {
							double sum = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int j = 0; j < n; j++) {
								final double d1 = (interpolationPoints.getEntry(k, j)) - (trustRegionCenterOffset.getEntry(j));
								sum += d1 * d1;
							}
							if (sum > distsq) {
								knew = k;
								distsq = sum;
							}
						}
						if (knew >= 0) {
							final double dist = java.lang.Math.sqrt(distsq);
							if (ntrits == (-1)) {
								delta = java.lang.Math.min(((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE_OVER_TEN) * delta), ((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF) * dist));
								if (delta <= (rho * 1.5)) {
									delta = rho;
								}
							}
							ntrits = 0;
							final double d1 = java.lang.Math.min(((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE_OVER_TEN) * dist), delta);
							adelt = java.lang.Math.max(d1, rho);
							dsq = adelt * adelt;
							state = 90;
							break;
						}
						if (ntrits == (-1)) {
							state = 680;
							break;
						}
						if (ratio > (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
							state = 60;
							break;
						}
						if ((java.lang.Math.max(delta, dnorm)) > rho) {
							state = 60;
							break;
						}
					}
				case 680 :
					{
						org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printState(680);
						if (rho > (stoppingTrustRegionRadius)) {
							delta = (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF) * rho;
							ratio = rho / (stoppingTrustRegionRadius);
							if (ratio <= (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.SIXTEEN)) {
								rho = stoppingTrustRegionRadius;
							}else
								if (ratio <= (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.TWO_HUNDRED_FIFTY)) {
									rho = (java.lang.Math.sqrt(ratio)) * (stoppingTrustRegionRadius);
								}else {
									rho *= org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE_OVER_TEN;
								}
							
							delta = java.lang.Math.max(delta, rho);
							ntrits = 0;
							nfsav = getEvaluations();
							state = 60;
							break;
						}
						if (ntrits == (-1)) {
							state = 360;
							break;
						}
					}
				case 720 :
					{
						org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printState(720);
						if ((fAtInterpolationPoints.getEntry(trustRegionCenterInterpolationPointIndex)) <= fsave) {
							for (int i = 0; i < n; i++) {
								final double d3 = lowerBound[i];
								final double d4 = (originShift.getEntry(i)) + (trustRegionCenterOffset.getEntry(i));
								final double d1 = java.lang.Math.max(d3, d4);
								final double d2 = upperBound[i];
								currentBest.setEntry(i, java.lang.Math.min(d1, d2));
								if ((trustRegionCenterOffset.getEntry(i)) == (lowerDifference.getEntry(i))) {
									currentBest.setEntry(i, lowerBound[i]);
								}
								if ((trustRegionCenterOffset.getEntry(i)) == (upperDifference.getEntry(i))) {
									currentBest.setEntry(i, upperBound[i]);
								}
							}
							f = fAtInterpolationPoints.getEntry(trustRegionCenterInterpolationPointIndex);
						}
						return f;
					}
				default :
					{
						throw new org.apache.commons.math3.exception.MathIllegalStateException(org.apache.commons.math3.exception.util.LocalizedFormats.SIMPLE_MESSAGE, "bobyqb");
					}
			}
		
	}

	private double[] altmov(int knew, double adelt) {
		org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printMethod();
		final int n = currentBest.getDimension();
		final int npt = numberOfInterpolationPoints;
		final org.apache.commons.math3.linear.ArrayRealVector glag = new org.apache.commons.math3.linear.ArrayRealVector(n);
		final org.apache.commons.math3.linear.ArrayRealVector hcol = new org.apache.commons.math3.linear.ArrayRealVector(npt);
		final org.apache.commons.math3.linear.ArrayRealVector work1 = new org.apache.commons.math3.linear.ArrayRealVector(n);
		final org.apache.commons.math3.linear.ArrayRealVector work2 = new org.apache.commons.math3.linear.ArrayRealVector(n);
		for (int k = 0; k < npt; k++) {
			hcol.setEntry(k, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO);
		}
		for (int j = 0, max = (npt - n) - 1; j < max; j++) {
			final double tmp = zMatrix.getEntry(knew, j);
			for (int k = 0; k < npt; k++) {
				hcol.setEntry(k, ((hcol.getEntry(k)) + (tmp * (zMatrix.getEntry(k, j)))));
			}
		}
		final double alpha = hcol.getEntry(knew);
		final double ha = (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF) * alpha;
		for (int i = 0; i < n; i++) {
			glag.setEntry(i, bMatrix.getEntry(knew, i));
		}
		for (int k = 0; k < npt; k++) {
			double tmp = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
			for (int j = 0; j < n; j++) {
				tmp += (interpolationPoints.getEntry(k, j)) * (trustRegionCenterOffset.getEntry(j));
			}
			tmp *= hcol.getEntry(k);
			for (int i = 0; i < n; i++) {
				glag.setEntry(i, ((glag.getEntry(i)) + (tmp * (interpolationPoints.getEntry(k, i)))));
			}
		}
		double presav = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
		double step = java.lang.Double.NaN;
		int ksav = 0;
		int ibdsav = 0;
		double stpsav = 0;
		for (int k = 0; k < npt; k++) {
			if (k == (trustRegionCenterInterpolationPointIndex)) {
				continue;
			}
			double dderiv = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
			double distsq = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
			for (int i = 0; i < n; i++) {
				final double tmp = (interpolationPoints.getEntry(k, i)) - (trustRegionCenterOffset.getEntry(i));
				dderiv += (glag.getEntry(i)) * tmp;
				distsq += tmp * tmp;
			}
			double subd = adelt / (java.lang.Math.sqrt(distsq));
			double slbd = -subd;
			int ilbd = 0;
			int iubd = 0;
			final double sumin = java.lang.Math.min(org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE, subd);
			for (int i = 0; i < n; i++) {
				final double tmp = (interpolationPoints.getEntry(k, i)) - (trustRegionCenterOffset.getEntry(i));
				if (tmp > (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
					if ((slbd * tmp) < ((lowerDifference.getEntry(i)) - (trustRegionCenterOffset.getEntry(i)))) {
						slbd = ((lowerDifference.getEntry(i)) - (trustRegionCenterOffset.getEntry(i))) / tmp;
						ilbd = (-i) - 1;
					}
					if ((subd * tmp) > ((upperDifference.getEntry(i)) - (trustRegionCenterOffset.getEntry(i)))) {
						subd = java.lang.Math.max(sumin, (((upperDifference.getEntry(i)) - (trustRegionCenterOffset.getEntry(i))) / tmp));
						iubd = i + 1;
					}
				}else
					if (tmp < (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
						if ((slbd * tmp) > ((upperDifference.getEntry(i)) - (trustRegionCenterOffset.getEntry(i)))) {
							slbd = ((upperDifference.getEntry(i)) - (trustRegionCenterOffset.getEntry(i))) / tmp;
							ilbd = i + 1;
						}
						if ((subd * tmp) < ((lowerDifference.getEntry(i)) - (trustRegionCenterOffset.getEntry(i)))) {
							subd = java.lang.Math.max(sumin, (((lowerDifference.getEntry(i)) - (trustRegionCenterOffset.getEntry(i))) / tmp));
							iubd = (-i) - 1;
						}
					}
				
			}
			step = slbd;
			int isbd = ilbd;
			double vlag = java.lang.Double.NaN;
			if (k == knew) {
				final double diff = dderiv - (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE);
				vlag = slbd * (dderiv - (slbd * diff));
				final double d1 = subd * (dderiv - (subd * diff));
				if ((java.lang.Math.abs(d1)) > (java.lang.Math.abs(vlag))) {
					step = subd;
					vlag = d1;
					isbd = iubd;
				}
				final double d2 = (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF) * dderiv;
				final double d3 = d2 - (diff * slbd);
				final double d4 = d2 - (diff * subd);
				if ((d3 * d4) < (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
					final double d5 = (d2 * d2) / diff;
					if ((java.lang.Math.abs(d5)) > (java.lang.Math.abs(vlag))) {
						step = d2 / diff;
						vlag = d5;
						isbd = 0;
					}
				}
			}else {
				vlag = slbd * ((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE) - slbd);
				final double tmp = subd * ((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE) - subd);
				if ((java.lang.Math.abs(tmp)) > (java.lang.Math.abs(vlag))) {
					step = subd;
					vlag = tmp;
					isbd = iubd;
				}
				if (subd > (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF)) {
					if ((java.lang.Math.abs(vlag)) < (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE_OVER_FOUR)) {
						step = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF;
						vlag = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE_OVER_FOUR;
						isbd = 0;
					}
				}
				vlag *= dderiv;
			}
			final double tmp = (step * ((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE) - step)) * distsq;
			final double predsq = (vlag * vlag) * ((vlag * vlag) + ((ha * tmp) * tmp));
			if (predsq > presav) {
				presav = predsq;
				ksav = k;
				stpsav = step;
				ibdsav = isbd;
			}
		}
		for (int i = 0; i < n; i++) {
			final double tmp = (trustRegionCenterOffset.getEntry(i)) + (stpsav * ((interpolationPoints.getEntry(ksav, i)) - (trustRegionCenterOffset.getEntry(i))));
			newPoint.setEntry(i, java.lang.Math.max(lowerDifference.getEntry(i), java.lang.Math.min(upperDifference.getEntry(i), tmp)));
		}
		if (ibdsav < 0) {
			newPoint.setEntry(((-ibdsav) - 1), lowerDifference.getEntry(((-ibdsav) - 1)));
		}
		if (ibdsav > 0) {
			newPoint.setEntry((ibdsav - 1), upperDifference.getEntry((ibdsav - 1)));
		}
		final double bigstp = adelt + adelt;
		int iflag = 0;
		double cauchy = java.lang.Double.NaN;
		double csave = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
		while (true) {
			double wfixsq = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
			double ggfree = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
			for (int i = 0; i < n; i++) {
				final double glagValue = glag.getEntry(i);
				work1.setEntry(i, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO);
				if (((java.lang.Math.min(((trustRegionCenterOffset.getEntry(i)) - (lowerDifference.getEntry(i))), glagValue)) > (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) || ((java.lang.Math.max(((trustRegionCenterOffset.getEntry(i)) - (upperDifference.getEntry(i))), glagValue)) < (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO))) {
					work1.setEntry(i, bigstp);
					ggfree += glagValue * glagValue;
				}
			}
			if (ggfree == (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
				return new double[]{ alpha , org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO };
			}
			final double tmp1 = (adelt * adelt) - wfixsq;
			if (tmp1 > (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
				step = java.lang.Math.sqrt((tmp1 / ggfree));
				ggfree = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
				for (int i = 0; i < n; i++) {
					if ((work1.getEntry(i)) == bigstp) {
						final double tmp2 = (trustRegionCenterOffset.getEntry(i)) - (step * (glag.getEntry(i)));
						if (tmp2 <= (lowerDifference.getEntry(i))) {
							work1.setEntry(i, ((lowerDifference.getEntry(i)) - (trustRegionCenterOffset.getEntry(i))));
							final double d1 = work1.getEntry(i);
							wfixsq += d1 * d1;
						}else
							if (tmp2 >= (upperDifference.getEntry(i))) {
								work1.setEntry(i, ((upperDifference.getEntry(i)) - (trustRegionCenterOffset.getEntry(i))));
								final double d1 = work1.getEntry(i);
								wfixsq += d1 * d1;
							}else {
								final double d1 = glag.getEntry(i);
								ggfree += d1 * d1;
							}
						
					}
				}
			}
			double gw = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
			for (int i = 0; i < n; i++) {
				final double glagValue = glag.getEntry(i);
				if ((work1.getEntry(i)) == bigstp) {
					work1.setEntry(i, ((-step) * glagValue));
					final double min = java.lang.Math.min(upperDifference.getEntry(i), ((trustRegionCenterOffset.getEntry(i)) + (work1.getEntry(i))));
					alternativeNewPoint.setEntry(i, java.lang.Math.max(lowerDifference.getEntry(i), min));
				}else
					if ((work1.getEntry(i)) == (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
						alternativeNewPoint.setEntry(i, trustRegionCenterOffset.getEntry(i));
					}else
						if (glagValue > (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
							alternativeNewPoint.setEntry(i, lowerDifference.getEntry(i));
						}else {
							alternativeNewPoint.setEntry(i, upperDifference.getEntry(i));
						}
					
				
				gw += glagValue * (work1.getEntry(i));
			}
			double curv = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
			for (int k = 0; k < npt; k++) {
				double tmp = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
				for (int j = 0; j < n; j++) {
					tmp += (interpolationPoints.getEntry(k, j)) * (work1.getEntry(j));
				}
				curv += ((hcol.getEntry(k)) * tmp) * tmp;
			}
			if (iflag == 1) {
				curv = -curv;
			}
			if ((curv > (-gw)) && (curv < ((-gw) * ((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE) + (java.lang.Math.sqrt(org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.TWO)))))) {
				final double scale = (-gw) / curv;
				for (int i = 0; i < n; i++) {
					final double tmp = (trustRegionCenterOffset.getEntry(i)) + (scale * (work1.getEntry(i)));
					alternativeNewPoint.setEntry(i, java.lang.Math.max(lowerDifference.getEntry(i), java.lang.Math.min(upperDifference.getEntry(i), tmp)));
				}
				final double d1 = ((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF) * gw) * scale;
				cauchy = d1 * d1;
			}else {
				final double d1 = gw + ((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF) * curv);
				cauchy = d1 * d1;
			}
			if (iflag == 0) {
				for (int i = 0; i < n; i++) {
					glag.setEntry(i, (-(glag.getEntry(i))));
					work2.setEntry(i, alternativeNewPoint.getEntry(i));
				}
				csave = cauchy;
				iflag = 1;
			}else {
				break;
			}
		} 
		if (csave > cauchy) {
			for (int i = 0; i < n; i++) {
				alternativeNewPoint.setEntry(i, work2.getEntry(i));
			}
			cauchy = csave;
		}
		return new double[]{ alpha , cauchy };
	}

	private void prelim(double[] lowerBound, double[] upperBound) {
		org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printMethod();
		final int n = currentBest.getDimension();
		final int npt = numberOfInterpolationPoints;
		final int ndim = bMatrix.getRowDimension();
		final double rhosq = (initialTrustRegionRadius) * (initialTrustRegionRadius);
		final double recip = 1.0 / rhosq;
		final int np = n + 1;
		for (int j = 0; j < n; j++) {
			originShift.setEntry(j, currentBest.getEntry(j));
			for (int k = 0; k < npt; k++) {
				interpolationPoints.setEntry(k, j, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO);
			}
			for (int i = 0; i < ndim; i++) {
				bMatrix.setEntry(i, j, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO);
			}
		}
		for (int i = 0, max = (n * np) / 2; i < max; i++) {
			modelSecondDerivativesValues.setEntry(i, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO);
		}
		for (int k = 0; k < npt; k++) {
			modelSecondDerivativesParameters.setEntry(k, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO);
			for (int j = 0, max = npt - np; j < max; j++) {
				zMatrix.setEntry(k, j, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO);
			}
		}
		int ipt = 0;
		int jpt = 0;
		double fbeg = java.lang.Double.NaN;
		do {
			final int nfm = getEvaluations();
			final int nfx = nfm - n;
			final int nfmm = nfm - 1;
			final int nfxm = nfx - 1;
			double stepa = 0;
			double stepb = 0;
			if (nfm <= (2 * n)) {
				if ((nfm >= 1) && (nfm <= n)) {
					stepa = initialTrustRegionRadius;
					if ((upperDifference.getEntry(nfmm)) == (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
						stepa = -stepa;
					}
					interpolationPoints.setEntry(nfm, nfmm, stepa);
				}else
					if (nfm > n) {
						stepa = interpolationPoints.getEntry(nfx, nfxm);
						stepb = -(initialTrustRegionRadius);
						if ((lowerDifference.getEntry(nfxm)) == (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
							stepb = java.lang.Math.min(((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.TWO) * (initialTrustRegionRadius)), upperDifference.getEntry(nfxm));
						}
						if ((upperDifference.getEntry(nfxm)) == (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
							stepb = java.lang.Math.max(((-(org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.TWO)) * (initialTrustRegionRadius)), lowerDifference.getEntry(nfxm));
						}
						interpolationPoints.setEntry(nfm, nfxm, stepb);
					}
				
			}else {
				final int tmp1 = (nfm - np) / n;
				jpt = (nfm - (tmp1 * n)) - n;
				ipt = jpt + tmp1;
				if (ipt > n) {
					final int tmp2 = jpt;
					jpt = ipt - n;
					ipt = tmp2;
				}
				final int iptMinus1 = ipt - 1;
				final int jptMinus1 = jpt - 1;
				interpolationPoints.setEntry(nfm, iptMinus1, interpolationPoints.getEntry(ipt, iptMinus1));
				interpolationPoints.setEntry(nfm, jptMinus1, interpolationPoints.getEntry(jpt, jptMinus1));
			}
			for (int j = 0; j < n; j++) {
				currentBest.setEntry(j, java.lang.Math.min(java.lang.Math.max(lowerBound[j], ((originShift.getEntry(j)) + (interpolationPoints.getEntry(nfm, j)))), upperBound[j]));
				if ((interpolationPoints.getEntry(nfm, j)) == (lowerDifference.getEntry(j))) {
					currentBest.setEntry(j, lowerBound[j]);
				}
				if ((interpolationPoints.getEntry(nfm, j)) == (upperDifference.getEntry(j))) {
					currentBest.setEntry(j, upperBound[j]);
				}
			}
			final double objectiveValue = computeObjectiveValue(currentBest.toArray());
			final double f = isMinimize ? objectiveValue : -objectiveValue;
			final int numEval = getEvaluations();
			fAtInterpolationPoints.setEntry(nfm, f);
			if (numEval == 1) {
				fbeg = f;
				trustRegionCenterInterpolationPointIndex = 0;
			}else
				if (f < (fAtInterpolationPoints.getEntry(trustRegionCenterInterpolationPointIndex))) {
					trustRegionCenterInterpolationPointIndex = nfm;
				}
			
			if (numEval <= ((2 * n) + 1)) {
				if ((numEval >= 2) && (numEval <= (n + 1))) {
					gradientAtTrustRegionCenter.setEntry(nfmm, ((f - fbeg) / stepa));
					if (npt < (numEval + n)) {
						final double oneOverStepA = (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE) / stepa;
						bMatrix.setEntry(0, nfmm, (-oneOverStepA));
						bMatrix.setEntry(nfm, nfmm, oneOverStepA);
						bMatrix.setEntry((npt + nfmm), nfmm, ((-(org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF)) * rhosq));
					}
				}else
					if (numEval >= (n + 2)) {
						final int ih = ((nfx * (nfx + 1)) / 2) - 1;
						final double tmp = (f - fbeg) / stepb;
						final double diff = stepb - stepa;
						modelSecondDerivativesValues.setEntry(ih, (((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.TWO) * (tmp - (gradientAtTrustRegionCenter.getEntry(nfxm)))) / diff));
						gradientAtTrustRegionCenter.setEntry(nfxm, ((((gradientAtTrustRegionCenter.getEntry(nfxm)) * stepb) - (tmp * stepa)) / diff));
						if ((stepa * stepb) < (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
							if (f < (fAtInterpolationPoints.getEntry((nfm - n)))) {
								fAtInterpolationPoints.setEntry(nfm, fAtInterpolationPoints.getEntry((nfm - n)));
								fAtInterpolationPoints.setEntry((nfm - n), f);
								if ((trustRegionCenterInterpolationPointIndex) == nfm) {
									trustRegionCenterInterpolationPointIndex = nfm - n;
								}
								interpolationPoints.setEntry((nfm - n), nfxm, stepb);
								interpolationPoints.setEntry(nfm, nfxm, stepa);
							}
						}
						bMatrix.setEntry(0, nfxm, ((-(stepa + stepb)) / (stepa * stepb)));
						bMatrix.setEntry(nfm, nfxm, ((-(org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF)) / (interpolationPoints.getEntry((nfm - n), nfxm))));
						bMatrix.setEntry((nfm - n), nfxm, ((-(bMatrix.getEntry(0, nfxm))) - (bMatrix.getEntry(nfm, nfxm))));
						zMatrix.setEntry(0, nfxm, ((java.lang.Math.sqrt(org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.TWO)) / (stepa * stepb)));
						zMatrix.setEntry(nfm, nfxm, ((java.lang.Math.sqrt(org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF)) / rhosq));
						zMatrix.setEntry((nfm - n), nfxm, ((-(zMatrix.getEntry(0, nfxm))) - (zMatrix.getEntry(nfm, nfxm))));
					}
				
			}else {
				zMatrix.setEntry(0, nfxm, recip);
				zMatrix.setEntry(nfm, nfxm, recip);
				zMatrix.setEntry(ipt, nfxm, (-recip));
				zMatrix.setEntry(jpt, nfxm, (-recip));
				final int ih = (((ipt * (ipt - 1)) / 2) + jpt) - 1;
				final double tmp = (interpolationPoints.getEntry(nfm, (ipt - 1))) * (interpolationPoints.getEntry(nfm, (jpt - 1)));
				modelSecondDerivativesValues.setEntry(ih, ((((fbeg - (fAtInterpolationPoints.getEntry(ipt))) - (fAtInterpolationPoints.getEntry(jpt))) + f) / tmp));
			}
		} while ((getEvaluations()) < npt );
	}

	private double[] trsbox(double delta, org.apache.commons.math3.linear.ArrayRealVector gnew, org.apache.commons.math3.linear.ArrayRealVector xbdi, org.apache.commons.math3.linear.ArrayRealVector s, org.apache.commons.math3.linear.ArrayRealVector hs, org.apache.commons.math3.linear.ArrayRealVector hred) {
		org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printMethod();
		final int n = currentBest.getDimension();
		final int npt = numberOfInterpolationPoints;
		double dsq = java.lang.Double.NaN;
		double crvmin = java.lang.Double.NaN;
		double ds;
		int iu;
		double dhd;
		double dhs;
		double cth;
		double shs;
		double sth;
		double ssq;
		double beta = 0;
		double sdec;
		double blen;
		int iact = -1;
		int nact = 0;
		double angt = 0;
		double qred;
		int isav;
		double temp = 0;
		double xsav = 0;
		double xsum = 0;
		double angbd = 0;
		double dredg = 0;
		double sredg = 0;
		int iterc;
		double resid = 0;
		double delsq = 0;
		double ggsav = 0;
		double tempa = 0;
		double tempb = 0;
		double redmax = 0;
		double dredsq = 0;
		double redsav = 0;
		double gredsq = 0;
		double rednew = 0;
		int itcsav = 0;
		double rdprev = 0;
		double rdnext = 0;
		double stplen = 0;
		double stepsq = 0;
		int itermax = 0;
		iterc = 0;
		nact = 0;
		for (int i = 0; i < n; i++) {
			xbdi.setEntry(i, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO);
			if ((trustRegionCenterOffset.getEntry(i)) <= (lowerDifference.getEntry(i))) {
				if ((gradientAtTrustRegionCenter.getEntry(i)) >= (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
					xbdi.setEntry(i, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.MINUS_ONE);
				}
			}else
				if ((trustRegionCenterOffset.getEntry(i)) >= (upperDifference.getEntry(i))) {
					if ((gradientAtTrustRegionCenter.getEntry(i)) <= (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
						xbdi.setEntry(i, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE);
					}
				}
			
			if ((xbdi.getEntry(i)) != (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
				++nact;
			}
			trialStepPoint.setEntry(i, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO);
			gnew.setEntry(i, gradientAtTrustRegionCenter.getEntry(i));
		}
		delsq = delta * delta;
		qred = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
		crvmin = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.MINUS_ONE;
		int state = 20;
		for (; ;) {
			switch (state) {
				case 20 :
					{
						org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printState(20);
						beta = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
					}
				case 30 :
					{
						org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printState(30);
						stepsq = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
						for (int i = 0; i < n; i++) {
							if ((xbdi.getEntry(i)) != (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
								s.setEntry(i, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO);
							}else
								if (beta == (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
									s.setEntry(i, (-(gnew.getEntry(i))));
								}else {
									s.setEntry(i, ((beta * (s.getEntry(i))) - (gnew.getEntry(i))));
								}
							
							final double d1 = s.getEntry(i);
							stepsq += d1 * d1;
						}
						if (stepsq == (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
							state = 190;
							break;
						}
						if (beta == (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
							gredsq = stepsq;
							itermax = (iterc + n) - nact;
						}
						if ((gredsq * delsq) <= ((qred * 1.0E-4) * qred)) {
							state = 190;
							break;
						}
						state = 210;
						break;
					}
				case 50 :
					{
						org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printState(50);
						resid = delsq;
						ds = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
						shs = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
						for (int i = 0; i < n; i++) {
							if ((xbdi.getEntry(i)) == (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
								final double d1 = trialStepPoint.getEntry(i);
								resid -= d1 * d1;
								ds += (s.getEntry(i)) * (trialStepPoint.getEntry(i));
								shs += (s.getEntry(i)) * (hs.getEntry(i));
							}
						}
						if (resid <= (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
							state = 90;
							break;
						}
						temp = java.lang.Math.sqrt(((stepsq * resid) + (ds * ds)));
						if (ds < (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
							blen = (temp - ds) / stepsq;
						}else {
							blen = resid / (temp + ds);
						}
						stplen = blen;
						if (shs > (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
							stplen = java.lang.Math.min(blen, (gredsq / shs));
						}
						iact = -1;
						for (int i = 0; i < n; i++) {
							if ((s.getEntry(i)) != (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
								xsum = (trustRegionCenterOffset.getEntry(i)) + (trialStepPoint.getEntry(i));
								if ((s.getEntry(i)) > (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
									temp = ((upperDifference.getEntry(i)) - xsum) / (s.getEntry(i));
								}else {
									temp = ((lowerDifference.getEntry(i)) - xsum) / (s.getEntry(i));
								}
								if (temp < stplen) {
									stplen = temp;
									iact = i;
								}
							}
						}
						sdec = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
						if (stplen > (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
							++iterc;
							temp = shs / stepsq;
							if ((iact == (-1)) && (temp > (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO))) {
								crvmin = java.lang.Math.min(crvmin, temp);
								if (crvmin == (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.MINUS_ONE)) {
									crvmin = temp;
								}
							}
							ggsav = gredsq;
							gredsq = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int i = 0; i < n; i++) {
								gnew.setEntry(i, ((gnew.getEntry(i)) + (stplen * (hs.getEntry(i)))));
								if ((xbdi.getEntry(i)) == (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
									final double d1 = gnew.getEntry(i);
									gredsq += d1 * d1;
								}
								trialStepPoint.setEntry(i, ((trialStepPoint.getEntry(i)) + (stplen * (s.getEntry(i)))));
							}
							final double d1 = stplen * (ggsav - (((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF) * stplen) * shs));
							sdec = java.lang.Math.max(d1, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO);
							qred += sdec;
						}
						if (iact >= 0) {
							++nact;
							xbdi.setEntry(iact, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE);
							if ((s.getEntry(iact)) < (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
								xbdi.setEntry(iact, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.MINUS_ONE);
							}
							final double d1 = trialStepPoint.getEntry(iact);
							delsq -= d1 * d1;
							if (delsq <= (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
								state = 190;
								break;
							}
							state = 20;
							break;
						}
						if (stplen < blen) {
							if (iterc == itermax) {
								state = 190;
								break;
							}
							if (sdec <= (qred * 0.01)) {
								state = 190;
								break;
							}
							beta = gredsq / ggsav;
							state = 30;
							break;
						}
					}
				case 90 :
					{
						org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printState(90);
						crvmin = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
					}
				case 100 :
					{
						org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printState(100);
						if (nact >= (n - 1)) {
							state = 190;
							break;
						}
						dredsq = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
						dredg = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
						gredsq = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
						for (int i = 0; i < n; i++) {
							if ((xbdi.getEntry(i)) == (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
								double d1 = trialStepPoint.getEntry(i);
								dredsq += d1 * d1;
								dredg += (trialStepPoint.getEntry(i)) * (gnew.getEntry(i));
								d1 = gnew.getEntry(i);
								gredsq += d1 * d1;
								s.setEntry(i, trialStepPoint.getEntry(i));
							}else {
								s.setEntry(i, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO);
							}
						}
						itcsav = iterc;
						state = 210;
						break;
					}
				case 120 :
					{
						org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printState(120);
						++iterc;
						temp = (gredsq * dredsq) - (dredg * dredg);
						if (temp <= ((qred * 1.0E-4) * qred)) {
							state = 190;
							break;
						}
						temp = java.lang.Math.sqrt(temp);
						for (int i = 0; i < n; i++) {
							if ((xbdi.getEntry(i)) == (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
								s.setEntry(i, (((dredg * (trialStepPoint.getEntry(i))) - (dredsq * (gnew.getEntry(i)))) / temp));
							}else {
								s.setEntry(i, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO);
							}
						}
						sredg = -temp;
						angbd = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE;
						iact = -1;
						for (int i = 0; i < n; i++) {
							if ((xbdi.getEntry(i)) == (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
								tempa = ((trustRegionCenterOffset.getEntry(i)) + (trialStepPoint.getEntry(i))) - (lowerDifference.getEntry(i));
								tempb = ((upperDifference.getEntry(i)) - (trustRegionCenterOffset.getEntry(i))) - (trialStepPoint.getEntry(i));
								if (tempa <= (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
									++nact;
									xbdi.setEntry(i, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.MINUS_ONE);
									state = 100;
									break;
								}else
									if (tempb <= (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
										++nact;
										xbdi.setEntry(i, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE);
										state = 100;
										break;
									}
								
								double d1 = trialStepPoint.getEntry(i);
								double d2 = s.getEntry(i);
								ssq = (d1 * d1) + (d2 * d2);
								d1 = (trustRegionCenterOffset.getEntry(i)) - (lowerDifference.getEntry(i));
								temp = ssq - (d1 * d1);
								if (temp > (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
									temp = (java.lang.Math.sqrt(temp)) - (s.getEntry(i));
									if ((angbd * temp) > tempa) {
										angbd = tempa / temp;
										iact = i;
										xsav = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.MINUS_ONE;
									}
								}
								d1 = (upperDifference.getEntry(i)) - (trustRegionCenterOffset.getEntry(i));
								temp = ssq - (d1 * d1);
								if (temp > (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
									temp = (java.lang.Math.sqrt(temp)) + (s.getEntry(i));
									if ((angbd * temp) > tempb) {
										angbd = tempb / temp;
										iact = i;
										xsav = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE;
									}
								}
							}
						}
						state = 210;
						break;
					}
				case 150 :
					{
						org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printState(150);
						shs = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
						dhs = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
						dhd = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
						for (int i = 0; i < n; i++) {
							if ((xbdi.getEntry(i)) == (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
								shs += (s.getEntry(i)) * (hs.getEntry(i));
								dhs += (trialStepPoint.getEntry(i)) * (hs.getEntry(i));
								dhd += (trialStepPoint.getEntry(i)) * (hred.getEntry(i));
							}
						}
						redmax = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
						isav = -1;
						redsav = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
						iu = ((int) ((angbd * 17.0) + 3.1));
						for (int i = 0; i < iu; i++) {
							angt = (angbd * i) / iu;
							sth = (angt + angt) / ((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE) + (angt * angt));
							temp = shs + (angt * (((angt * dhd) - dhs) - dhs));
							rednew = sth * (((angt * dredg) - sredg) - (((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF) * sth) * temp));
							if (rednew > redmax) {
								redmax = rednew;
								isav = i;
								rdprev = redsav;
							}else
								if (i == (isav + 1)) {
									rdnext = rednew;
								}
							
							redsav = rednew;
						}
						if (isav < 0) {
							state = 190;
							break;
						}
						if (isav < iu) {
							temp = (rdnext - rdprev) / (((redmax + redmax) - rdprev) - rdnext);
							angt = (angbd * (isav + ((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF) * temp))) / iu;
						}
						cth = ((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE) - (angt * angt)) / ((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE) + (angt * angt));
						sth = (angt + angt) / ((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE) + (angt * angt));
						temp = shs + (angt * (((angt * dhd) - dhs) - dhs));
						sdec = sth * (((angt * dredg) - sredg) - (((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.HALF) * sth) * temp));
						if (sdec <= (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
							state = 190;
							break;
						}
						dredg = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
						gredsq = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
						for (int i = 0; i < n; i++) {
							gnew.setEntry(i, (((gnew.getEntry(i)) + ((cth - (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE)) * (hred.getEntry(i)))) + (sth * (hs.getEntry(i)))));
							if ((xbdi.getEntry(i)) == (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
								trialStepPoint.setEntry(i, ((cth * (trialStepPoint.getEntry(i))) + (sth * (s.getEntry(i)))));
								dredg += (trialStepPoint.getEntry(i)) * (gnew.getEntry(i));
								final double d1 = gnew.getEntry(i);
								gredsq += d1 * d1;
							}
							hred.setEntry(i, ((cth * (hred.getEntry(i))) + (sth * (hs.getEntry(i)))));
						}
						qred += sdec;
						if ((iact >= 0) && (isav == iu)) {
							++nact;
							xbdi.setEntry(iact, xsav);
							state = 100;
							break;
						}
						if (sdec > (qred * 0.01)) {
							state = 120;
							break;
						}
					}
				case 190 :
					{
						org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printState(190);
						dsq = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
						for (int i = 0; i < n; i++) {
							final double min = java.lang.Math.min(((trustRegionCenterOffset.getEntry(i)) + (trialStepPoint.getEntry(i))), upperDifference.getEntry(i));
							newPoint.setEntry(i, java.lang.Math.max(min, lowerDifference.getEntry(i)));
							if ((xbdi.getEntry(i)) == (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.MINUS_ONE)) {
								newPoint.setEntry(i, lowerDifference.getEntry(i));
							}
							if ((xbdi.getEntry(i)) == (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE)) {
								newPoint.setEntry(i, upperDifference.getEntry(i));
							}
							trialStepPoint.setEntry(i, ((newPoint.getEntry(i)) - (trustRegionCenterOffset.getEntry(i))));
							final double d1 = trialStepPoint.getEntry(i);
							dsq += d1 * d1;
						}
						return new double[]{ dsq , crvmin };
					}
				case 210 :
					{
						org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printState(210);
						int ih = 0;
						for (int j = 0; j < n; j++) {
							hs.setEntry(j, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO);
							for (int i = 0; i <= j; i++) {
								if (i < j) {
									hs.setEntry(j, ((hs.getEntry(j)) + ((modelSecondDerivativesValues.getEntry(ih)) * (s.getEntry(i)))));
								}
								hs.setEntry(i, ((hs.getEntry(i)) + ((modelSecondDerivativesValues.getEntry(ih)) * (s.getEntry(j)))));
								ih++;
							}
						}
						final org.apache.commons.math3.linear.RealVector tmp = interpolationPoints.operate(s).ebeMultiply(modelSecondDerivativesParameters);
						for (int k = 0; k < npt; k++) {
							if ((modelSecondDerivativesParameters.getEntry(k)) != (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
								for (int i = 0; i < n; i++) {
									hs.setEntry(i, ((hs.getEntry(i)) + ((tmp.getEntry(k)) * (interpolationPoints.getEntry(k, i)))));
								}
							}
						}
						if (crvmin != (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO)) {
							state = 50;
							break;
						}
						if (iterc > itcsav) {
							state = 150;
							break;
						}
						for (int i = 0; i < n; i++) {
							hred.setEntry(i, hs.getEntry(i));
						}
						state = 120;
						break;
					}
				default :
					{
						throw new org.apache.commons.math3.exception.MathIllegalStateException(org.apache.commons.math3.exception.util.LocalizedFormats.SIMPLE_MESSAGE, "trsbox");
					}
			}
		}
	}

	private void update(double beta, double denom, int knew) {
		org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printMethod();
		final int n = currentBest.getDimension();
		final int npt = numberOfInterpolationPoints;
		final int nptm = (npt - n) - 1;
		final org.apache.commons.math3.linear.ArrayRealVector work = new org.apache.commons.math3.linear.ArrayRealVector((npt + n));
		double ztest = org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO;
		for (int k = 0; k < npt; k++) {
			for (int j = 0; j < nptm; j++) {
				ztest = java.lang.Math.max(ztest, java.lang.Math.abs(zMatrix.getEntry(k, j)));
			}
		}
		ztest *= 1.0E-20;
		for (int j = 1; j < nptm; j++) {
			final double d1 = zMatrix.getEntry(knew, j);
			if ((java.lang.Math.abs(d1)) > ztest) {
				final double d2 = zMatrix.getEntry(knew, 0);
				final double d3 = zMatrix.getEntry(knew, j);
				final double d4 = java.lang.Math.sqrt(((d2 * d2) + (d3 * d3)));
				final double d5 = (zMatrix.getEntry(knew, 0)) / d4;
				final double d6 = (zMatrix.getEntry(knew, j)) / d4;
				for (int i = 0; i < npt; i++) {
					final double d7 = (d5 * (zMatrix.getEntry(i, 0))) + (d6 * (zMatrix.getEntry(i, j)));
					zMatrix.setEntry(i, j, ((d5 * (zMatrix.getEntry(i, j))) - (d6 * (zMatrix.getEntry(i, 0)))));
					zMatrix.setEntry(i, 0, d7);
				}
			}
			zMatrix.setEntry(knew, j, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ZERO);
		}
		for (int i = 0; i < npt; i++) {
			work.setEntry(i, ((zMatrix.getEntry(knew, 0)) * (zMatrix.getEntry(i, 0))));
		}
		final double alpha = work.getEntry(knew);
		final double tau = lagrangeValuesAtNewPoint.getEntry(knew);
		lagrangeValuesAtNewPoint.setEntry(knew, ((lagrangeValuesAtNewPoint.getEntry(knew)) - (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.ONE)));
		final double sqrtDenom = java.lang.Math.sqrt(denom);
		final double d1 = tau / sqrtDenom;
		final double d2 = (zMatrix.getEntry(knew, 0)) / sqrtDenom;
		for (int i = 0; i < npt; i++) {
			zMatrix.setEntry(i, 0, ((d1 * (zMatrix.getEntry(i, 0))) - (d2 * (lagrangeValuesAtNewPoint.getEntry(i)))));
		}
		for (int j = 0; j < n; j++) {
			final int jp = npt + j;
			work.setEntry(jp, bMatrix.getEntry(knew, j));
			final double d3 = ((alpha * (lagrangeValuesAtNewPoint.getEntry(jp))) - (tau * (work.getEntry(jp)))) / denom;
			final double d4 = (((-beta) * (work.getEntry(jp))) - (tau * (lagrangeValuesAtNewPoint.getEntry(jp)))) / denom;
			for (int i = 0; i <= jp; i++) {
				bMatrix.setEntry(i, j, (((bMatrix.getEntry(i, j)) + (d3 * (lagrangeValuesAtNewPoint.getEntry(i)))) + (d4 * (work.getEntry(i)))));
				if (i >= npt) {
					bMatrix.setEntry(jp, (i - npt), bMatrix.getEntry(i, j));
				}
			}
		}
	}

	private void setup(double[] lowerBound, double[] upperBound) {
		org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printMethod();
		double[] init = getStartPoint();
		final int dimension = init.length;
		if (dimension < (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.MINIMUM_PROBLEM_DIMENSION)) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(dimension, org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.MINIMUM_PROBLEM_DIMENSION, true);
		}
		final int[] nPointsInterval = new int[]{ dimension + 2 , ((dimension + 2) * (dimension + 1)) / 2 };
		if (((numberOfInterpolationPoints) < (nPointsInterval[0])) || ((numberOfInterpolationPoints) > (nPointsInterval[1]))) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_INTERPOLATION_POINTS, numberOfInterpolationPoints, nPointsInterval[0], nPointsInterval[1]);
		}
		boundDifference = new double[dimension];
		double requiredMinDiff = 2 * (initialTrustRegionRadius);
		double minDiff = java.lang.Double.POSITIVE_INFINITY;
		for (int i = 0; i < dimension; i++) {
			boundDifference[i] = (upperBound[i]) - (lowerBound[i]);
			minDiff = java.lang.Math.min(minDiff, boundDifference[i]);
		}
		if (minDiff < requiredMinDiff) {
			initialTrustRegionRadius = minDiff / 3.0;
		}
		bMatrix = new org.apache.commons.math3.linear.Array2DRowRealMatrix((dimension + (numberOfInterpolationPoints)), dimension);
		zMatrix = new org.apache.commons.math3.linear.Array2DRowRealMatrix(numberOfInterpolationPoints, (((numberOfInterpolationPoints) - dimension) - 1));
		interpolationPoints = new org.apache.commons.math3.linear.Array2DRowRealMatrix(numberOfInterpolationPoints, dimension);
		originShift = new org.apache.commons.math3.linear.ArrayRealVector(dimension);
		fAtInterpolationPoints = new org.apache.commons.math3.linear.ArrayRealVector(numberOfInterpolationPoints);
		trustRegionCenterOffset = new org.apache.commons.math3.linear.ArrayRealVector(dimension);
		gradientAtTrustRegionCenter = new org.apache.commons.math3.linear.ArrayRealVector(dimension);
		lowerDifference = new org.apache.commons.math3.linear.ArrayRealVector(dimension);
		upperDifference = new org.apache.commons.math3.linear.ArrayRealVector(dimension);
		modelSecondDerivativesParameters = new org.apache.commons.math3.linear.ArrayRealVector(numberOfInterpolationPoints);
		newPoint = new org.apache.commons.math3.linear.ArrayRealVector(dimension);
		alternativeNewPoint = new org.apache.commons.math3.linear.ArrayRealVector(dimension);
		trialStepPoint = new org.apache.commons.math3.linear.ArrayRealVector(dimension);
		lagrangeValuesAtNewPoint = new org.apache.commons.math3.linear.ArrayRealVector((dimension + (numberOfInterpolationPoints)));
		modelSecondDerivativesValues = new org.apache.commons.math3.linear.ArrayRealVector(((dimension * (dimension + 1)) / 2));
	}

	private static double[] fillNewArray(int n, double value) {
		double[] ds = new double[n];
		java.util.Arrays.fill(ds, value);
		return ds;
	}

	private static java.lang.String caller(int n) {
		final java.lang.Throwable t = new java.lang.Throwable();
		final java.lang.StackTraceElement[] elements = t.getStackTrace();
		final java.lang.StackTraceElement e = elements[n];
		return (((e.getMethodName()) + " (at line ") + (e.getLineNumber())) + ")";
	}

	private static void printState(int s) {
	}

	private static void printMethod() {
	}

	private static class PathIsExploredException extends java.lang.RuntimeException {
		private static final long serialVersionUID = 745350979634801853L;

		private static final java.lang.String PATH_IS_EXPLORED = "If this exception is thrown, just remove it from the code";

		PathIsExploredException() {
			super((((org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.PathIsExploredException.PATH_IS_EXPLORED) + " ") + (org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.caller(3))));
		}
	}
}






package org.apache.commons.math.optimization.direct;


public class BOBYQAOptimizer extends org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer<org.apache.commons.math.analysis.MultivariateRealFunction> implements org.apache.commons.math.optimization.MultivariateRealOptimizer {
	private static final double ZERO = 0.0;

	private static final double ONE = 1.0;

	private static final double TWO = 2.0;

	private static final double TEN = 10.0;

	private static final double SIXTEEN = 16.0;

	private static final double TWO_HUNDRED_FIFTY = 250.0;

	private static final double MINUS_ONE = -(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE);

	private static final double HALF = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) / 2;

	private static final double ONE_OVER_FOUR = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) / 4;

	private static final double ONE_OVER_EIGHT = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) / 8;

	private static final double ONE_OVER_TEN = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) / 10;

	private static final double ONE_OVER_A_THOUSAND = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) / 1000;

	public static final int MINIMUM_PROBLEM_DIMENSION = 2;

	public static final double DEFAULT_INITIAL_RADIUS = 10.0;

	public static final double DEFAULT_STOPPING_RADIUS = 1.0E-8;

	private final int numberOfInterpolationPoints;

	private double initialTrustRegionRadius;

	private final double stoppingTrustRegionRadius;

	private double[] lowerBound;

	private double[] upperBound;

	private boolean isMinimize;

	private org.apache.commons.math.linear.ArrayRealVector currentBest;

	private double[] boundDifference;

	private int trustRegionCenterInterpolationPointIndex;

	public BOBYQAOptimizer(int numberOfInterpolationPoints) {
		this(numberOfInterpolationPoints, null, null);
	}

	public BOBYQAOptimizer(int numberOfInterpolationPoints, double[] lowerBound, double[] upperBound) {
		this(numberOfInterpolationPoints, lowerBound, upperBound, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.DEFAULT_INITIAL_RADIUS, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.DEFAULT_STOPPING_RADIUS);
	}

	public BOBYQAOptimizer(int numberOfInterpolationPoints, double[] lowerBound, double[] upperBound, double initialTrustRegionRadius, double stoppingTrustRegionRadius) {
		org.apache.commons.math.optimization.direct.BOBYQAOptimizer.this.lowerBound = (lowerBound == null) ? null : org.apache.commons.math.util.MathUtils.copyOf(lowerBound);
		org.apache.commons.math.optimization.direct.BOBYQAOptimizer.this.upperBound = (upperBound == null) ? null : org.apache.commons.math.util.MathUtils.copyOf(upperBound);
		this.numberOfInterpolationPoints = numberOfInterpolationPoints;
		org.apache.commons.math.optimization.direct.BOBYQAOptimizer.this.initialTrustRegionRadius = initialTrustRegionRadius;
		this.stoppingTrustRegionRadius = stoppingTrustRegionRadius;
	}

	@java.lang.Override
	protected org.apache.commons.math.optimization.RealPointValuePair doOptimize() {
		setup();
		isMinimize = (getGoalType()) == (org.apache.commons.math.optimization.GoalType.MINIMIZE);
		currentBest = new org.apache.commons.math.linear.ArrayRealVector(getStartPoint());
		final double value = bobyqa();
		return new org.apache.commons.math.optimization.RealPointValuePair(currentBest.getDataRef(), (isMinimize ? value : -value));
	}

	private double bobyqa() {
		final int n = currentBest.getDimension();
		final int npt = numberOfInterpolationPoints;
		final int np = n + 1;
		final int ndim = npt + n;
		final org.apache.commons.math.linear.ArrayRealVector xbase = new org.apache.commons.math.linear.ArrayRealVector(n);
		final org.apache.commons.math.linear.Array2DRowRealMatrix xpt = new org.apache.commons.math.linear.Array2DRowRealMatrix(npt, n);
		final org.apache.commons.math.linear.ArrayRealVector fval = new org.apache.commons.math.linear.ArrayRealVector(npt);
		final org.apache.commons.math.linear.ArrayRealVector xopt = new org.apache.commons.math.linear.ArrayRealVector(n);
		final org.apache.commons.math.linear.ArrayRealVector gopt = new org.apache.commons.math.linear.ArrayRealVector(n);
		final org.apache.commons.math.linear.ArrayRealVector hq = new org.apache.commons.math.linear.ArrayRealVector(((n * np) / 2));
		final org.apache.commons.math.linear.ArrayRealVector pq = new org.apache.commons.math.linear.ArrayRealVector(npt);
		final org.apache.commons.math.linear.Array2DRowRealMatrix bmat = new org.apache.commons.math.linear.Array2DRowRealMatrix(ndim, n);
		final org.apache.commons.math.linear.Array2DRowRealMatrix zmat = new org.apache.commons.math.linear.Array2DRowRealMatrix(npt, (npt - np));
		final org.apache.commons.math.linear.ArrayRealVector sl = new org.apache.commons.math.linear.ArrayRealVector(n);
		final org.apache.commons.math.linear.ArrayRealVector su = new org.apache.commons.math.linear.ArrayRealVector(n);
		final org.apache.commons.math.linear.ArrayRealVector xnew = new org.apache.commons.math.linear.ArrayRealVector(n);
		final org.apache.commons.math.linear.ArrayRealVector xalt = new org.apache.commons.math.linear.ArrayRealVector(n);
		final org.apache.commons.math.linear.ArrayRealVector d__ = new org.apache.commons.math.linear.ArrayRealVector(n);
		final org.apache.commons.math.linear.ArrayRealVector vlag = new org.apache.commons.math.linear.ArrayRealVector(ndim);
		for (int j = 0; j < n; j++) {
			final double boundDiff = boundDifference[j];
			sl.setEntry(j, ((lowerBound[j]) - (currentBest.getEntry(j))));
			su.setEntry(j, ((upperBound[j]) - (currentBest.getEntry(j))));
			if ((sl.getEntry(j)) >= (-(initialTrustRegionRadius))) {
				if ((sl.getEntry(j)) >= (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
					currentBest.setEntry(j, lowerBound[j]);
					sl.setEntry(j, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
					su.setEntry(j, boundDiff);
				}else {
					currentBest.setEntry(j, ((lowerBound[j]) + (initialTrustRegionRadius)));
					sl.setEntry(j, (-(initialTrustRegionRadius)));
					final double deltaOne = (upperBound[j]) - (currentBest.getEntry(j));
					su.setEntry(j, java.lang.Math.max(deltaOne, initialTrustRegionRadius));
				}
			}else
				if ((su.getEntry(j)) <= (initialTrustRegionRadius)) {
					if ((su.getEntry(j)) <= (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
						currentBest.setEntry(j, upperBound[j]);
						sl.setEntry(j, (-boundDiff));
						su.setEntry(j, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
					}else {
						currentBest.setEntry(j, ((upperBound[j]) - (initialTrustRegionRadius)));
						final double deltaOne = (lowerBound[j]) - (currentBest.getEntry(j));
						final double deltaTwo = -(initialTrustRegionRadius);
						sl.setEntry(j, java.lang.Math.min(deltaOne, deltaTwo));
						su.setEntry(j, initialTrustRegionRadius);
					}
				}
			
		}
		return bobyqb(xbase, xpt, fval, xopt, gopt, hq, pq, bmat, zmat, sl, su, xnew, xalt, d__, vlag);
	}

	private double bobyqb(org.apache.commons.math.linear.ArrayRealVector xbase, org.apache.commons.math.linear.Array2DRowRealMatrix xpt, org.apache.commons.math.linear.ArrayRealVector fval, org.apache.commons.math.linear.ArrayRealVector xopt, org.apache.commons.math.linear.ArrayRealVector gopt, org.apache.commons.math.linear.ArrayRealVector hq, org.apache.commons.math.linear.ArrayRealVector pq, org.apache.commons.math.linear.Array2DRowRealMatrix bmat, org.apache.commons.math.linear.Array2DRowRealMatrix zmat, org.apache.commons.math.linear.ArrayRealVector sl, org.apache.commons.math.linear.ArrayRealVector su, org.apache.commons.math.linear.ArrayRealVector xnew, org.apache.commons.math.linear.ArrayRealVector xalt, org.apache.commons.math.linear.ArrayRealVector d__, org.apache.commons.math.linear.ArrayRealVector vlag) {
		final int n = currentBest.getDimension();
		final int npt = numberOfInterpolationPoints;
		final int np = n + 1;
		final int nptm = npt - np;
		final int nh = (n * np) / 2;
		final org.apache.commons.math.linear.ArrayRealVector work1 = new org.apache.commons.math.linear.ArrayRealVector(n);
		final org.apache.commons.math.linear.ArrayRealVector work2 = new org.apache.commons.math.linear.ArrayRealVector(npt);
		final org.apache.commons.math.linear.ArrayRealVector work3 = new org.apache.commons.math.linear.ArrayRealVector(npt);
		double cauchy = java.lang.Double.NaN;
		double alpha = java.lang.Double.NaN;
		double dsq = java.lang.Double.NaN;
		double crvmin = java.lang.Double.NaN;
		double d__1;
		double d__2;
		double d__3;
		double d__4;
		double f = 0;
		int ih;
		int ip;
		int jp;
		double dx;
		double den = 0;
		double rho = 0;
		double sum = 0;
		double diff = 0;
		double beta = 0;
		double gisq = 0;
		int knew = 0;
		double temp;
		double suma;
		double sumb;
		double bsum;
		double fopt;
		double curv;
		int ksav;
		double gqsq = 0;
		double dist = 0;
		double sumw = 0;
		double sumz = 0;
		double diffa = 0;
		double diffb = 0;
		double diffc = 0;
		double hdiag = 0;
		int kbase;
		double delta = 0;
		double adelt = 0;
		double denom = 0;
		double fsave = 0;
		double bdtol = 0;
		double delsq = 0;
		int nfsav;
		double ratio = 0;
		double dnorm = 0;
		double vquad = 0;
		double pqold = 0;
		int itest;
		double sumpq;
		double scaden;
		double errbig;
		double fracsq;
		double biglsq;
		double densav;
		double bdtest;
		double frhosq;
		double distsq = 0;
		int ntrits;
		trustRegionCenterInterpolationPointIndex = 0;
		prelim(currentBest, xbase, xpt, fval, gopt, hq, pq, bmat, zmat, sl, su);
		double xoptsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
		for (int i = 0; i < n; i++) {
			xopt.setEntry(i, xpt.getEntry(trustRegionCenterInterpolationPointIndex, i));
			final double deltaOne = xopt.getEntry(i);
			xoptsq += deltaOne * deltaOne;
		}
		fsave = fval.getEntry(0);
		kbase = 0;
		rho = initialTrustRegionRadius;
		delta = rho;
		ntrits = 0;
		diffa = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
		diffb = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
		itest = 0;
		nfsav = getEvaluations();
		int state = 20;
		for (; ;)
			switch (state) {
				case 20 :
					{
						if ((trustRegionCenterInterpolationPointIndex) != kbase) {
							ih = 0;
							for (int j = 0; j < n; j++) {
								for (int i = 0; i <= j; i++) {
									if (i < j) {
										gopt.setEntry(j, ((gopt.getEntry(j)) + ((hq.getEntry(ih)) * (xopt.getEntry(i)))));
									}
									gopt.setEntry(i, ((gopt.getEntry(i)) + ((hq.getEntry(ih)) * (xopt.getEntry(j)))));
									ih++;
								}
							}
							if ((getEvaluations()) > npt) {
								for (int k = 0; k < npt; k++) {
									temp = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
									for (int j = 0; j < n; j++) {
										temp += (xpt.getEntry(k, j)) * (xopt.getEntry(j));
									}
									temp = (pq.getEntry(k)) * temp;
									for (int i = 0; i < n; i++) {
										gopt.setEntry(i, ((gopt.getEntry(i)) + (temp * (xpt.getEntry(k, i)))));
									}
								}
								throw new org.apache.commons.math.optimization.direct.PathIsExploredException();
							}
						}
					}
				case 60 :
					{
						final org.apache.commons.math.linear.ArrayRealVector gnew = new org.apache.commons.math.linear.ArrayRealVector(n);
						final org.apache.commons.math.linear.ArrayRealVector xbdi = new org.apache.commons.math.linear.ArrayRealVector(n);
						final org.apache.commons.math.linear.ArrayRealVector s = new org.apache.commons.math.linear.ArrayRealVector(n);
						final org.apache.commons.math.linear.ArrayRealVector hs = new org.apache.commons.math.linear.ArrayRealVector(n);
						final org.apache.commons.math.linear.ArrayRealVector hred = new org.apache.commons.math.linear.ArrayRealVector(n);
						final double[] dsqCrvmin = trsbox(xpt, xopt, gopt, hq, pq, sl, su, delta, xnew, d__, gnew, xbdi, s, hs, hred);
						dsq = dsqCrvmin[0];
						crvmin = dsqCrvmin[1];
						double deltaOne = delta;
						double deltaTwo = java.lang.Math.sqrt(dsq);
						dnorm = java.lang.Math.min(deltaOne, deltaTwo);
						if (dnorm < ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * rho)) {
							ntrits = -1;
							deltaOne = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.TEN) * rho;
							distsq = deltaOne * deltaOne;
							if ((getEvaluations()) <= (nfsav + 2)) {
								state = 650;
								break;
							}
							deltaOne = java.lang.Math.max(diffa, diffb);
							errbig = java.lang.Math.max(deltaOne, diffc);
							frhosq = (rho * (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE_OVER_EIGHT)) * rho;
							if ((crvmin > (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) && (errbig > (frhosq * crvmin))) {
								state = 650;
								break;
							}
							bdtol = errbig / rho;
							for (int j = 0; j < n; j++) {
								bdtest = bdtol;
								if ((xnew.getEntry(j)) == (sl.getEntry(j))) {
									bdtest = work1.getEntry(j);
								}
								if ((xnew.getEntry(j)) == (su.getEntry(j))) {
									bdtest = -(work1.getEntry(j));
								}
								if (bdtest < bdtol) {
									curv = hq.getEntry((((j + (j * j)) / 2) - 1));
									for (int k = 0; k < npt; k++) {
										final double d1 = xpt.getEntry(k, j);
										curv += (pq.getEntry(k)) * (d1 * d1);
									}
									bdtest += ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * curv) * rho;
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
						if (dsq <= (xoptsq * (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE_OVER_A_THOUSAND))) {
							fracsq = xoptsq * (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE_OVER_FOUR);
							sumpq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int k = 0; k < npt; k++) {
								sumpq += pq.getEntry(k);
								sum = (-(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF)) * xoptsq;
								for (int i = 0; i < n; i++) {
									sum += (xpt.getEntry(k, i)) * (xopt.getEntry(i));
								}
								work2.setEntry(k, sum);
								temp = fracsq - ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * sum);
								for (int i = 0; i < n; i++) {
									work1.setEntry(i, bmat.getEntry(k, i));
									vlag.setEntry(i, ((sum * (xpt.getEntry(k, i))) + (temp * (xopt.getEntry(i)))));
									ip = npt + i;
									for (int j = 0; j <= i; j++) {
										bmat.setEntry(ip, j, (((bmat.getEntry(ip, j)) + ((work1.getEntry(i)) * (vlag.getEntry(j)))) + ((vlag.getEntry(i)) * (work1.getEntry(j)))));
									}
								}
							}
							for (int m = 0; m < nptm; m++) {
								sumz = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
								sumw = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
								for (int k = 0; k < npt; k++) {
									sumz += zmat.getEntry(k, m);
									vlag.setEntry(k, ((work2.getEntry(k)) * (zmat.getEntry(k, m))));
									sumw += vlag.getEntry(k);
								}
								for (int j = 0; j < n; j++) {
									sum = ((fracsq * sumz) - ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * sumw)) * (xopt.getEntry(j));
									for (int k = 0; k < npt; k++) {
										sum += (vlag.getEntry(k)) * (xpt.getEntry(k, j));
									}
									work1.setEntry(j, sum);
									for (int k = 0; k < npt; k++) {
										bmat.setEntry(k, j, ((bmat.getEntry(k, j)) + (sum * (zmat.getEntry(k, m)))));
									}
								}
								for (int i = 0; i < n; i++) {
									ip = i + npt;
									temp = work1.getEntry(i);
									for (int j = 0; j <= i; j++) {
										bmat.setEntry(ip, j, ((bmat.getEntry(ip, j)) + (temp * (work1.getEntry(j)))));
									}
								}
							}
							ih = 0;
							for (int j = 0; j < n; j++) {
								work1.setEntry(j, (((-(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF)) * sumpq) * (xopt.getEntry(j))));
								for (int k = 0; k < npt; k++) {
									work1.setEntry(j, ((work1.getEntry(j)) + ((pq.getEntry(k)) * (xpt.getEntry(k, j)))));
									xpt.setEntry(k, j, ((xpt.getEntry(k, j)) - (xopt.getEntry(j))));
								}
								for (int i = 0; i <= j; i++) {
									hq.setEntry(ih, (((hq.getEntry(ih)) + ((work1.getEntry(i)) * (xopt.getEntry(j)))) + ((xopt.getEntry(i)) * (work1.getEntry(j)))));
									bmat.setEntry((npt + i), j, bmat.getEntry((npt + j), i));
									ih++;
								}
							}
							for (int i = 0; i < n; i++) {
								xbase.setEntry(i, ((xbase.getEntry(i)) + (xopt.getEntry(i))));
								xnew.setEntry(i, ((xnew.getEntry(i)) - (xopt.getEntry(i))));
								sl.setEntry(i, ((sl.getEntry(i)) - (xopt.getEntry(i))));
								su.setEntry(i, ((su.getEntry(i)) - (xopt.getEntry(i))));
								xopt.setEntry(i, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
							}
							xoptsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
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
						final double[] alphaCauchy = altmov(xpt, xopt, bmat, zmat, sl, su, knew, adelt, xnew, xalt);
						alpha = alphaCauchy[0];
						cauchy = alphaCauchy[1];
						for (int i = 0; i < n; i++) {
							d__.setEntry(i, ((xnew.getEntry(i)) - (xopt.getEntry(i))));
						}
					}
				case 230 :
					{
						for (int k = 0; k < npt; k++) {
							suma = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							sumb = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							sum = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int j = 0; j < n; j++) {
								suma += (xpt.getEntry(k, j)) * (d__.getEntry(j));
								sumb += (xpt.getEntry(k, j)) * (xopt.getEntry(j));
								sum += (bmat.getEntry(k, j)) * (d__.getEntry(j));
							}
							work3.setEntry(k, (suma * (((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * suma) + sumb)));
							vlag.setEntry(k, sum);
							work2.setEntry(k, suma);
						}
						beta = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						for (int m = 0; m < nptm; m++) {
							sum = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int k = 0; k < npt; k++) {
								sum += (zmat.getEntry(k, m)) * (work3.getEntry(k));
							}
							beta -= sum * sum;
							for (int k = 0; k < npt; k++) {
								vlag.setEntry(k, ((vlag.getEntry(k)) + (sum * (zmat.getEntry(k, m)))));
							}
						}
						dsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						bsum = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						dx = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						for (int j = 0; j < n; j++) {
							final double d1 = d__.getEntry(j);
							dsq += d1 * d1;
							sum = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int k = 0; k < npt; k++) {
								sum += (work3.getEntry(k)) * (bmat.getEntry(k, j));
							}
							bsum += sum * (d__.getEntry(j));
							jp = npt + j;
							for (int i = 0; i < n; i++) {
								sum += (bmat.getEntry(jp, i)) * (d__.getEntry(i));
							}
							vlag.setEntry(jp, sum);
							bsum += sum * (d__.getEntry(j));
							dx += (d__.getEntry(j)) * (xopt.getEntry(j));
						}
						beta = (((dx * dx) + (dsq * (((xoptsq + dx) + dx) + ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * dsq)))) + beta) - bsum;
						vlag.setEntry(trustRegionCenterInterpolationPointIndex, ((vlag.getEntry(trustRegionCenterInterpolationPointIndex)) + (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE)));
						if (ntrits == 0) {
							final double d1 = vlag.getEntry(knew);
							denom = (d1 * d1) + (alpha * beta);
							if ((denom < cauchy) && (cauchy > (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO))) {
								for (int i = 0; i < n; i++) {
									xnew.setEntry(i, xalt.getEntry(i));
									d__.setEntry(i, ((xnew.getEntry(i)) - (xopt.getEntry(i))));
								}
								cauchy = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
								state = 230;
								break;
							}
						}else {
							delsq = delta * delta;
							scaden = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							biglsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							knew = 0;
							for (int k = 0; k < npt; k++) {
								if (k == (trustRegionCenterInterpolationPointIndex)) {
									continue;
								}
								hdiag = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
								for (int m = 0; m < nptm; m++) {
									final double d1 = zmat.getEntry(k, m);
									hdiag += d1 * d1;
								}
								d__1 = vlag.getEntry(k);
								den = (beta * hdiag) + (d__1 * d__1);
								distsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
								for (int j = 0; j < n; j++) {
									final double d1 = (xpt.getEntry(k, j)) - (xopt.getEntry(j));
									distsq += d1 * d1;
								}
								d__3 = distsq / delsq;
								d__1 = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE;
								d__2 = d__3 * d__3;
								temp = java.lang.Math.max(d__1, d__2);
								if ((temp * den) > scaden) {
									scaden = temp * den;
									knew = k;
									denom = den;
								}
								d__3 = vlag.getEntry(k);
								d__1 = biglsq;
								d__2 = temp * (d__3 * d__3);
								biglsq = java.lang.Math.max(d__1, d__2);
							}
						}
					}
				case 360 :
					{
						for (int i = 0; i < n; i++) {
							d__3 = lowerBound[i];
							d__4 = (xbase.getEntry(i)) + (xnew.getEntry(i));
							d__1 = java.lang.Math.max(d__3, d__4);
							d__2 = upperBound[i];
							currentBest.setEntry(i, java.lang.Math.min(d__1, d__2));
							if ((xnew.getEntry(i)) == (sl.getEntry(i))) {
								currentBest.setEntry(i, lowerBound[i]);
							}
							if ((xnew.getEntry(i)) == (su.getEntry(i))) {
								currentBest.setEntry(i, upperBound[i]);
							}
						}
						f = computeObjectiveValue(currentBest.getData());
						if (!(isMinimize))
							f = -f;
						
						if (ntrits == (-1)) {
							fsave = f;
							state = 720;
							break;
						}
						fopt = fval.getEntry(trustRegionCenterInterpolationPointIndex);
						vquad = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						ih = 0;
						for (int j = 0; j < n; j++) {
							vquad += (d__.getEntry(j)) * (gopt.getEntry(j));
							for (int i = 0; i <= j; i++) {
								temp = (d__.getEntry(i)) * (d__.getEntry(j));
								if (i == j) {
									temp = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * temp;
								}
								vquad += (hq.getEntry(ih)) * temp;
								ih++;
							}
						}
						for (int k = 0; k < npt; k++) {
							final double d1 = work2.getEntry(k);
							final double d2 = d1 * d1;
							vquad += ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * (pq.getEntry(k))) * d2;
						}
						diff = (f - fopt) - vquad;
						diffc = diffb;
						diffb = diffa;
						diffa = java.lang.Math.abs(diff);
						if (dnorm > rho) {
							nfsav = getEvaluations();
						}
						if (ntrits > 0) {
							if (vquad >= (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
								throw new org.apache.commons.math.exception.MathIllegalStateException(org.apache.commons.math.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED, vquad);
							}
							ratio = (f - fopt) / vquad;
							if (ratio <= (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE_OVER_TEN)) {
								d__1 = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * delta;
								delta = java.lang.Math.min(d__1, dnorm);
							}else
								if (ratio <= 0.7) {
									d__1 = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * delta;
									delta = java.lang.Math.max(d__1, dnorm);
								}else {
									d__1 = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * delta;
									d__2 = dnorm + dnorm;
									delta = java.lang.Math.max(d__1, d__2);
								}
							
							if (delta <= (rho * 1.5)) {
								delta = rho;
							}
							if (f < fopt) {
								ksav = knew;
								densav = denom;
								delsq = delta * delta;
								scaden = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
								biglsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
								knew = 0;
								for (int k = 0; k < npt; k++) {
									hdiag = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
									for (int m = 0; m < nptm; m++) {
										final double d1 = zmat.getEntry(k, m);
										hdiag += d1 * d1;
									}
									d__1 = vlag.getEntry(k);
									den = (beta * hdiag) + (d__1 * d__1);
									distsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
									for (int j = 0; j < n; j++) {
										final double d1 = (xpt.getEntry(k, j)) - (xnew.getEntry(j));
										distsq += d1 * d1;
									}
									d__3 = distsq / delsq;
									d__1 = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE;
									d__2 = d__3 * d__3;
									temp = java.lang.Math.max(d__1, d__2);
									if ((temp * den) > scaden) {
										scaden = temp * den;
										knew = k;
										denom = den;
									}
									d__3 = vlag.getEntry(k);
									d__1 = biglsq;
									d__2 = temp * (d__3 * d__3);
									biglsq = java.lang.Math.max(d__1, d__2);
								}
								if (scaden <= ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * biglsq)) {
									knew = ksav;
									denom = densav;
								}
							}
						}
						update(bmat, zmat, vlag, beta, denom, knew);
						ih = 0;
						pqold = pq.getEntry(knew);
						pq.setEntry(knew, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
						for (int i = 0; i < n; i++) {
							temp = pqold * (xpt.getEntry(knew, i));
							for (int j = 0; j <= i; j++) {
								hq.setEntry(ih, ((hq.getEntry(ih)) + (temp * (xpt.getEntry(knew, j)))));
								ih++;
							}
						}
						for (int m = 0; m < nptm; m++) {
							temp = diff * (zmat.getEntry(knew, m));
							for (int k = 0; k < npt; k++) {
								pq.setEntry(k, ((pq.getEntry(k)) + (temp * (zmat.getEntry(k, m)))));
							}
						}
						fval.setEntry(knew, f);
						for (int i = 0; i < n; i++) {
							xpt.setEntry(knew, i, xnew.getEntry(i));
							work1.setEntry(i, bmat.getEntry(knew, i));
						}
						for (int k = 0; k < npt; k++) {
							suma = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int m = 0; m < nptm; m++) {
								suma += (zmat.getEntry(knew, m)) * (zmat.getEntry(k, m));
							}
							sumb = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int j = 0; j < n; j++) {
								sumb += (xpt.getEntry(k, j)) * (xopt.getEntry(j));
							}
							temp = suma * sumb;
							for (int i = 0; i < n; i++) {
								work1.setEntry(i, ((work1.getEntry(i)) + (temp * (xpt.getEntry(k, i)))));
							}
						}
						for (int i = 0; i < n; i++) {
							gopt.setEntry(i, ((gopt.getEntry(i)) + (diff * (work1.getEntry(i)))));
						}
						if (f < fopt) {
							trustRegionCenterInterpolationPointIndex = knew;
							xoptsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							ih = 0;
							for (int j = 0; j < n; j++) {
								xopt.setEntry(j, xnew.getEntry(j));
								final double d1 = xopt.getEntry(j);
								xoptsq += d1 * d1;
								for (int i = 0; i <= j; i++) {
									if (i < j) {
										gopt.setEntry(j, ((gopt.getEntry(j)) + ((hq.getEntry(ih)) * (d__.getEntry(i)))));
									}
									gopt.setEntry(i, ((gopt.getEntry(i)) + ((hq.getEntry(ih)) * (d__.getEntry(j)))));
									ih++;
								}
							}
							for (int k = 0; k < npt; k++) {
								temp = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
								for (int j = 0; j < n; j++) {
									temp += (xpt.getEntry(k, j)) * (d__.getEntry(j));
								}
								temp = (pq.getEntry(k)) * temp;
								for (int i = 0; i < n; i++) {
									gopt.setEntry(i, ((gopt.getEntry(i)) + (temp * (xpt.getEntry(k, i)))));
								}
							}
						}
						if (ntrits > 0) {
							for (int k = 0; k < npt; k++) {
								vlag.setEntry(k, ((fval.getEntry(k)) - (fval.getEntry(trustRegionCenterInterpolationPointIndex))));
								work3.setEntry(k, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
							}
							for (int j = 0; j < nptm; j++) {
								sum = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
								for (int k = 0; k < npt; k++) {
									sum += (zmat.getEntry(k, j)) * (vlag.getEntry(k));
								}
								for (int k = 0; k < npt; k++) {
									work3.setEntry(k, ((work3.getEntry(k)) + (sum * (zmat.getEntry(k, j)))));
								}
							}
							for (int k = 0; k < npt; k++) {
								sum = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
								for (int j = 0; j < n; j++) {
									sum += (xpt.getEntry(k, j)) * (xopt.getEntry(j));
								}
								work2.setEntry(k, work3.getEntry(k));
								work3.setEntry(k, (sum * (work3.getEntry(k))));
							}
							gqsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							gisq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int i = 0; i < n; i++) {
								sum = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
								for (int k = 0; k < npt; k++) {
									sum += ((bmat.getEntry(k, i)) * (vlag.getEntry(k))) + ((xpt.getEntry(k, i)) * (work3.getEntry(k)));
								}
								if ((xopt.getEntry(i)) == (sl.getEntry(i))) {
									d__2 = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
									d__3 = gopt.getEntry(i);
									d__1 = java.lang.Math.min(d__2, d__3);
									gqsq += d__1 * d__1;
									d__1 = java.lang.Math.min(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO, sum);
									gisq += d__1 * d__1;
								}else
									if ((xopt.getEntry(i)) == (su.getEntry(i))) {
										d__2 = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
										d__3 = gopt.getEntry(i);
										d__1 = java.lang.Math.max(d__2, d__3);
										gqsq += d__1 * d__1;
										d__1 = java.lang.Math.max(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO, sum);
										gisq += d__1 * d__1;
									}else {
										d__1 = gopt.getEntry(i);
										gqsq += d__1 * d__1;
										gisq += sum * sum;
									}
								
								vlag.setEntry((npt + i), sum);
							}
							++itest;
							if (gqsq < ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.TEN) * gisq)) {
								itest = 0;
							}
							if (itest >= 3) {
								for (int i = 0, max = java.lang.Math.max(npt, nh); i < max; i++) {
									if (i < n) {
										gopt.setEntry(i, vlag.getEntry((npt + i)));
									}
									if (i < npt) {
										pq.setEntry(i, work2.getEntry(i));
									}
									if (i < nh) {
										hq.setEntry(i, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
									}
									itest = 0;
								}
							}
						}
						if (ntrits == 0) {
							state = 60;
							break;
						}
						if (f <= (fopt + ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE_OVER_TEN) * vquad))) {
							state = 60;
							break;
						}
						d__3 = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.TWO) * delta;
						d__4 = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.TEN) * rho;
						d__1 = d__3 * d__3;
						d__2 = d__4 * d__4;
						distsq = java.lang.Math.max(d__1, d__2);
					}
				case 650 :
					{
						knew = -1;
						for (int k = 0; k < npt; k++) {
							sum = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int j = 0; j < n; j++) {
								final double d1 = (xpt.getEntry(k, j)) - (xopt.getEntry(j));
								sum += d1 * d1;
							}
							if (sum > distsq) {
								knew = k;
								distsq = sum;
							}
						}
						if (knew >= 0) {
							dist = java.lang.Math.sqrt(distsq);
							if (ntrits == (-1)) {
								d__1 = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE_OVER_TEN) * delta;
								d__2 = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * dist;
								delta = java.lang.Math.min(d__1, d__2);
								if (delta <= (rho * 1.5)) {
									delta = rho;
								}
							}
							ntrits = 0;
							d__2 = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE_OVER_TEN) * dist;
							d__1 = java.lang.Math.min(d__2, delta);
							adelt = java.lang.Math.max(d__1, rho);
							dsq = adelt * adelt;
							state = 90;
							break;
						}
						if (ntrits == (-1)) {
							state = 680;
							break;
						}
						if (ratio > (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
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
						if (rho > (stoppingTrustRegionRadius)) {
							delta = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * rho;
							ratio = rho / (stoppingTrustRegionRadius);
							if (ratio <= (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.SIXTEEN)) {
								rho = stoppingTrustRegionRadius;
							}else
								if (ratio <= (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.TWO_HUNDRED_FIFTY)) {
									rho = (java.lang.Math.sqrt(ratio)) * (stoppingTrustRegionRadius);
								}else {
									rho = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE_OVER_TEN) * rho;
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
						if ((fval.getEntry(trustRegionCenterInterpolationPointIndex)) <= fsave) {
							for (int i = 0; i < n; i++) {
								d__3 = lowerBound[i];
								d__4 = (xbase.getEntry(i)) + (xopt.getEntry(i));
								d__1 = java.lang.Math.max(d__3, d__4);
								d__2 = upperBound[i];
								currentBest.setEntry(i, java.lang.Math.min(d__1, d__2));
								if ((xopt.getEntry(i)) == (sl.getEntry(i))) {
									currentBest.setEntry(i, lowerBound[i]);
								}
								if ((xopt.getEntry(i)) == (su.getEntry(i))) {
									currentBest.setEntry(i, upperBound[i]);
								}
							}
							f = fval.getEntry(trustRegionCenterInterpolationPointIndex);
						}
						return f;
					}
				default :
					{
						throw new org.apache.commons.math.exception.MathIllegalStateException(org.apache.commons.math.exception.util.LocalizedFormats.SIMPLE_MESSAGE, "bobyqb");
					}
			}
		
	}

	private double[] altmov(org.apache.commons.math.linear.Array2DRowRealMatrix xpt, org.apache.commons.math.linear.ArrayRealVector xopt, org.apache.commons.math.linear.Array2DRowRealMatrix bmat, org.apache.commons.math.linear.Array2DRowRealMatrix zmat, org.apache.commons.math.linear.ArrayRealVector sl, org.apache.commons.math.linear.ArrayRealVector su, int knew, double adelt, org.apache.commons.math.linear.ArrayRealVector xnew, org.apache.commons.math.linear.ArrayRealVector xalt) {
		final int n = currentBest.getDimension();
		final int npt = numberOfInterpolationPoints;
		final org.apache.commons.math.linear.ArrayRealVector glag = new org.apache.commons.math.linear.ArrayRealVector(n);
		final org.apache.commons.math.linear.ArrayRealVector hcol = new org.apache.commons.math.linear.ArrayRealVector(npt);
		final org.apache.commons.math.linear.ArrayRealVector work1 = new org.apache.commons.math.linear.ArrayRealVector(n);
		final org.apache.commons.math.linear.ArrayRealVector work2 = new org.apache.commons.math.linear.ArrayRealVector(n);
		for (int k = 0; k < npt; k++) {
			hcol.setEntry(k, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
		}
		for (int j = 0, max = (npt - n) - 1; j < max; j++) {
			final double tmp = zmat.getEntry(knew, j);
			for (int k = 0; k < npt; k++) {
				hcol.setEntry(k, ((hcol.getEntry(k)) + (tmp * (zmat.getEntry(k, j)))));
			}
		}
		final double alpha = hcol.getEntry(knew);
		final double ha = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * alpha;
		for (int i = 0; i < n; i++) {
			glag.setEntry(i, bmat.getEntry(knew, i));
		}
		for (int k = 0; k < npt; k++) {
			double tmp = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
			for (int j = 0; j < n; j++) {
				tmp += (xpt.getEntry(k, j)) * (xopt.getEntry(j));
			}
			tmp *= hcol.getEntry(k);
			for (int i = 0; i < n; i++) {
				glag.setEntry(i, ((glag.getEntry(i)) + (tmp * (xpt.getEntry(k, i)))));
			}
		}
		double presav = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
		double step = java.lang.Double.NaN;
		int ksav = 0;
		int ibdsav = 0;
		double stpsav = 0;
		for (int k = 0; k < npt; k++) {
			if (k == (trustRegionCenterInterpolationPointIndex)) {
				continue;
			}
			double dderiv = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
			double distsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
			for (int i = 0; i < n; i++) {
				final double tmp = (xpt.getEntry(k, i)) - (xopt.getEntry(i));
				dderiv += (glag.getEntry(i)) * tmp;
				distsq += tmp * tmp;
			}
			double subd = adelt / (java.lang.Math.sqrt(distsq));
			double slbd = -subd;
			int ilbd = 0;
			int iubd = 0;
			final double sumin = java.lang.Math.min(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE, subd);
			for (int i = 0; i < n; i++) {
				final double tmp = (xpt.getEntry(k, i)) - (xopt.getEntry(i));
				if (tmp > (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
					if ((slbd * tmp) < ((sl.getEntry(i)) - (xopt.getEntry(i)))) {
						slbd = ((sl.getEntry(i)) - (xopt.getEntry(i))) / tmp;
						ilbd = (-i) - 1;
					}
					if ((subd * tmp) > ((su.getEntry(i)) - (xopt.getEntry(i)))) {
						subd = java.lang.Math.max(sumin, (((su.getEntry(i)) - (xopt.getEntry(i))) / tmp));
						iubd = i + 1;
					}
				}else
					if (tmp < (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
						if ((slbd * tmp) > ((su.getEntry(i)) - (xopt.getEntry(i)))) {
							slbd = ((su.getEntry(i)) - (xopt.getEntry(i))) / tmp;
							ilbd = i + 1;
						}
						if ((subd * tmp) < ((sl.getEntry(i)) - (xopt.getEntry(i)))) {
							subd = java.lang.Math.max(sumin, (((sl.getEntry(i)) - (xopt.getEntry(i))) / tmp));
							iubd = (-i) - 1;
						}
					}
				
			}
			step = slbd;
			int isbd = ilbd;
			double vlag = java.lang.Double.NaN;
			if (k == knew) {
				final double diff = dderiv - (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE);
				vlag = slbd * (dderiv - (slbd * diff));
				final double d1 = subd * (dderiv - (subd * diff));
				if ((java.lang.Math.abs(d1)) > (java.lang.Math.abs(vlag))) {
					step = subd;
					vlag = d1;
					isbd = iubd;
				}
				final double d2 = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * dderiv;
				final double d3 = d2 - (diff * slbd);
				final double d4 = d2 - (diff * subd);
				if ((d3 * d4) < (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
					final double d5 = (d2 * d2) / diff;
					if ((java.lang.Math.abs(d5)) > (java.lang.Math.abs(vlag))) {
						step = d2 / diff;
						vlag = d5;
						isbd = 0;
					}
				}
			}else {
				vlag = slbd * ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) - slbd);
				final double tmp = subd * ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) - subd);
				if ((java.lang.Math.abs(tmp)) > (java.lang.Math.abs(vlag))) {
					step = subd;
					vlag = tmp;
					isbd = iubd;
				}
				if (subd > (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF)) {
					if ((java.lang.Math.abs(vlag)) < (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE_OVER_FOUR)) {
						step = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF;
						vlag = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE_OVER_FOUR;
						isbd = 0;
					}
				}
				vlag *= dderiv;
			}
			final double tmp = (step * ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) - step)) * distsq;
			final double predsq = (vlag * vlag) * ((vlag * vlag) + ((ha * tmp) * tmp));
			if (predsq > presav) {
				presav = predsq;
				ksav = k;
				stpsav = step;
				ibdsav = isbd;
			}
		}
		for (int i = 0; i < n; i++) {
			final double tmp = (xopt.getEntry(i)) + (stpsav * ((xpt.getEntry(ksav, i)) - (xopt.getEntry(i))));
			xnew.setEntry(i, java.lang.Math.max(sl.getEntry(i), java.lang.Math.min(su.getEntry(i), tmp)));
		}
		if (ibdsav < 0) {
			xnew.setEntry(((-ibdsav) - 1), sl.getEntry(((-ibdsav) - 1)));
		}
		if (ibdsav > 0) {
			xnew.setEntry((ibdsav - 1), su.getEntry((ibdsav - 1)));
		}
		final double bigstp = adelt + adelt;
		int iflag = 0;
		double cauchy = java.lang.Double.NaN;
		double csave = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
		while (true) {
			double wfixsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
			double ggfree = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
			for (int i = 0; i < n; i++) {
				final double glagValue = glag.getEntry(i);
				work1.setEntry(i, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
				if (((java.lang.Math.min(((xopt.getEntry(i)) - (sl.getEntry(i))), glagValue)) > (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) || ((java.lang.Math.max(((xopt.getEntry(i)) - (su.getEntry(i))), glagValue)) < (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO))) {
					work1.setEntry(i, bigstp);
					ggfree += glagValue * glagValue;
				}
			}
			if (ggfree == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
				return new double[]{ alpha , org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO };
			}
			L120 : {
				final double tmp = (adelt * adelt) - wfixsq;
				if (tmp > (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
					final double wsqsav = wfixsq;
					step = java.lang.Math.sqrt((tmp / ggfree));
					ggfree = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
					for (int i = 0; i < n; i++) {
						if ((work1.getEntry(i)) == bigstp) {
							final double tmp2 = (xopt.getEntry(i)) - (step * (glag.getEntry(i)));
							if (tmp2 <= (sl.getEntry(i))) {
								work1.setEntry(i, ((sl.getEntry(i)) - (xopt.getEntry(i))));
								final double d1 = work1.getEntry(i);
								wfixsq += d1 * d1;
							}else
								if (tmp2 >= (su.getEntry(i))) {
									work1.setEntry(i, ((su.getEntry(i)) - (xopt.getEntry(i))));
									final double d1 = work1.getEntry(i);
									wfixsq += d1 * d1;
								}else {
									final double d1 = glag.getEntry(i);
									ggfree += d1 * d1;
								}
							
						}
					}
					if (!((wfixsq > wsqsav) && (ggfree > (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)))) {
						break L120;
					}
				}
			}
			double gw = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
			for (int i = 0; i < n; i++) {
				final double glagValue = glag.getEntry(i);
				if ((work1.getEntry(i)) == bigstp) {
					work1.setEntry(i, ((-step) * glagValue));
					final double min = java.lang.Math.min(su.getEntry(i), ((xopt.getEntry(i)) + (work1.getEntry(i))));
					xalt.setEntry(i, java.lang.Math.max(sl.getEntry(i), min));
				}else
					if ((work1.getEntry(i)) == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
						xalt.setEntry(i, xopt.getEntry(i));
					}else
						if (glagValue > (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
							xalt.setEntry(i, sl.getEntry(i));
						}else {
							xalt.setEntry(i, su.getEntry(i));
						}
					
				
				gw += glagValue * (work1.getEntry(i));
			}
			double curv = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
			for (int k = 0; k < npt; k++) {
				double tmp = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
				for (int j = 0; j < n; j++) {
					tmp += (xpt.getEntry(k, j)) * (work1.getEntry(j));
				}
				curv += ((hcol.getEntry(k)) * tmp) * tmp;
			}
			if (iflag == 1) {
				curv = -curv;
			}
			if ((curv > (-gw)) && (curv < ((-gw) * ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) + (java.lang.Math.sqrt(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.TWO)))))) {
				final double scale = (-gw) / curv;
				for (int i = 0; i < n; i++) {
					final double tmp = (xopt.getEntry(i)) + (scale * (work1.getEntry(i)));
					xalt.setEntry(i, java.lang.Math.max(sl.getEntry(i), java.lang.Math.min(su.getEntry(i), tmp)));
				}
				final double d1 = ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * gw) * scale;
				cauchy = d1 * d1;
			}else {
				final double d1 = gw + ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * curv);
				cauchy = d1 * d1;
			}
			if (iflag == 0) {
				for (int i = 0; i < n; i++) {
					glag.setEntry(i, (-(glag.getEntry(i))));
					work2.setEntry(i, xalt.getEntry(i));
				}
				csave = cauchy;
				iflag = 1;
			}else {
				break;
			}
		} 
		if (csave > cauchy) {
			for (int i = 0; i < n; i++) {
				xalt.setEntry(i, work2.getEntry(i));
			}
			cauchy = csave;
		}
		return new double[]{ alpha , cauchy };
	}

	private void prelim(org.apache.commons.math.linear.ArrayRealVector currentBest, org.apache.commons.math.linear.ArrayRealVector xbase, org.apache.commons.math.linear.Array2DRowRealMatrix xpt, org.apache.commons.math.linear.ArrayRealVector fval, org.apache.commons.math.linear.ArrayRealVector gopt, org.apache.commons.math.linear.ArrayRealVector hq, org.apache.commons.math.linear.ArrayRealVector pq, org.apache.commons.math.linear.Array2DRowRealMatrix bmat, org.apache.commons.math.linear.Array2DRowRealMatrix zmat, org.apache.commons.math.linear.ArrayRealVector sl, org.apache.commons.math.linear.ArrayRealVector su) {
		final int n = currentBest.getDimension();
		final int npt = numberOfInterpolationPoints;
		final int ndim = bmat.getRowDimension();
		final double rhosq = (initialTrustRegionRadius) * (initialTrustRegionRadius);
		final double recip = 1.0 / rhosq;
		final int np = n + 1;
		for (int j = 0; j < n; j++) {
			xbase.setEntry(j, currentBest.getEntry(j));
			for (int k = 0; k < npt; k++) {
				xpt.setEntry(k, j, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
			}
			for (int i = 0; i < ndim; i++) {
				bmat.setEntry(i, j, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
			}
		}
		for (int i = 0, max = (n * np) / 2; i < max; i++) {
			hq.setEntry(i, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
		}
		for (int k = 0; k < npt; k++) {
			pq.setEntry(k, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
			for (int j = 0, max = npt - np; j < max; j++) {
				zmat.setEntry(k, j, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
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
					if ((su.getEntry(nfmm)) == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
						stepa = -stepa;
						throw new org.apache.commons.math.optimization.direct.PathIsExploredException();
					}
					xpt.setEntry(nfm, nfmm, stepa);
				}else
					if (nfm > n) {
						stepa = xpt.getEntry(nfx, nfxm);
						stepb = -(initialTrustRegionRadius);
						if ((sl.getEntry(nfxm)) == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
							stepb = java.lang.Math.min(((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.TWO) * (initialTrustRegionRadius)), su.getEntry(nfxm));
							throw new org.apache.commons.math.optimization.direct.PathIsExploredException();
						}
						if ((su.getEntry(nfxm)) == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
							stepb = java.lang.Math.max(((-(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.TWO)) * (initialTrustRegionRadius)), sl.getEntry(nfxm));
							throw new org.apache.commons.math.optimization.direct.PathIsExploredException();
						}
						xpt.setEntry(nfm, nfxm, stepb);
					}
				
			}else {
				final int tmp1 = (nfm - np) / n;
				jpt = (nfm - (tmp1 * n)) - n;
				ipt = jpt + tmp1;
				if (ipt > n) {
					final int tmp2 = jpt;
					jpt = ipt - n;
					ipt = tmp2;
					throw new org.apache.commons.math.optimization.direct.PathIsExploredException();
				}
				xpt.setEntry(nfm, ipt, xpt.getEntry(ipt, ipt));
				xpt.setEntry(nfm, jpt, xpt.getEntry(jpt, jpt));
			}
			for (int j = 0; j < n; j++) {
				currentBest.setEntry(j, java.lang.Math.min(java.lang.Math.max(lowerBound[j], ((xbase.getEntry(j)) + (xpt.getEntry(nfm, j)))), upperBound[j]));
				if ((xpt.getEntry(nfm, j)) == (sl.getEntry(j))) {
					currentBest.setEntry(j, lowerBound[j]);
				}
				if ((xpt.getEntry(nfm, j)) == (su.getEntry(j))) {
					currentBest.setEntry(j, upperBound[j]);
				}
			}
			final double objectiveValue = computeObjectiveValue(currentBest.getData());
			final double f = isMinimize ? objectiveValue : -objectiveValue;
			final int numEval = getEvaluations();
			fval.setEntry(nfm, f);
			if (numEval == 1) {
				fbeg = f;
				trustRegionCenterInterpolationPointIndex = 0;
			}else
				if (f < (fval.getEntry(trustRegionCenterInterpolationPointIndex))) {
					trustRegionCenterInterpolationPointIndex = nfm;
				}
			
			if (numEval <= ((2 * n) + 1)) {
				if ((numEval >= 2) && (numEval <= (n + 1))) {
					gopt.setEntry(nfmm, ((f - fbeg) / stepa));
					if (npt < (numEval + n)) {
						final double oneOverStepA = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) / stepa;
						bmat.setEntry(0, nfmm, (-oneOverStepA));
						bmat.setEntry(nfm, nfmm, oneOverStepA);
						bmat.setEntry((npt + nfmm), nfmm, ((-(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF)) * rhosq));
						throw new org.apache.commons.math.optimization.direct.PathIsExploredException();
					}
				}else
					if (numEval >= (n + 2)) {
						final int ih = ((nfx * (nfx + 1)) / 2) - 1;
						final double tmp = (f - fbeg) / stepb;
						final double diff = stepb - stepa;
						hq.setEntry(ih, (((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.TWO) * (tmp - (gopt.getEntry(nfxm)))) / diff));
						gopt.setEntry(nfxm, ((((gopt.getEntry(nfxm)) * stepb) - (tmp * stepa)) / diff));
						if ((stepa * stepb) < (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
							if (f < (fval.getEntry((nfm - n)))) {
								fval.setEntry(nfm, fval.getEntry((nfm - n)));
								fval.setEntry((nfm - n), f);
								if ((trustRegionCenterInterpolationPointIndex) == nfm) {
									trustRegionCenterInterpolationPointIndex = nfm - n;
								}
								xpt.setEntry((nfm - n), nfxm, stepb);
								xpt.setEntry(nfm, nfxm, stepa);
							}
						}
						bmat.setEntry(0, nfxm, ((-(stepa + stepb)) / (stepa * stepb)));
						bmat.setEntry(nfm, nfxm, ((-(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF)) / (xpt.getEntry((nfm - n), nfxm))));
						bmat.setEntry((nfm - n), nfxm, ((-(bmat.getEntry(0, nfxm))) - (bmat.getEntry(nfm, nfxm))));
						zmat.setEntry(0, nfxm, ((java.lang.Math.sqrt(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.TWO)) / (stepa * stepb)));
						zmat.setEntry(nfm, nfxm, ((java.lang.Math.sqrt(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF)) / rhosq));
						zmat.setEntry((nfm - n), nfxm, ((-(zmat.getEntry(0, nfxm))) - (zmat.getEntry(nfm, nfxm))));
					}
				
			}else {
				zmat.setEntry(0, nfxm, recip);
				zmat.setEntry(nfm, nfxm, recip);
				zmat.setEntry(ipt, nfxm, (-recip));
				zmat.setEntry(jpt, nfxm, (-recip));
				final int ih = (((ipt * (ipt - 1)) / 2) + jpt) - 1;
				final double tmp = (xpt.getEntry(nfm, (ipt - 1))) * (xpt.getEntry(nfm, (jpt - 1)));
				hq.setEntry(ih, ((((fbeg - (fval.getEntry(ipt))) - (fval.getEntry(jpt))) + f) / tmp));
				throw new org.apache.commons.math.optimization.direct.PathIsExploredException();
			}
		} while ((getEvaluations()) < npt );
	}

	private double[] trsbox(org.apache.commons.math.linear.Array2DRowRealMatrix xpt, org.apache.commons.math.linear.ArrayRealVector xopt, org.apache.commons.math.linear.ArrayRealVector gopt, org.apache.commons.math.linear.ArrayRealVector hq, org.apache.commons.math.linear.ArrayRealVector pq, org.apache.commons.math.linear.ArrayRealVector sl, org.apache.commons.math.linear.ArrayRealVector su, double delta, org.apache.commons.math.linear.ArrayRealVector xnew, org.apache.commons.math.linear.ArrayRealVector d__, org.apache.commons.math.linear.ArrayRealVector gnew, org.apache.commons.math.linear.ArrayRealVector xbdi, org.apache.commons.math.linear.ArrayRealVector s, org.apache.commons.math.linear.ArrayRealVector hs, org.apache.commons.math.linear.ArrayRealVector hred) {
		final int n = currentBest.getDimension();
		final int npt = numberOfInterpolationPoints;
		double dsq = java.lang.Double.NaN;
		double crvmin = java.lang.Double.NaN;
		int ih;
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
			xbdi.setEntry(i, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
			if ((xopt.getEntry(i)) <= (sl.getEntry(i))) {
				if ((gopt.getEntry(i)) >= (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
					xbdi.setEntry(i, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.MINUS_ONE);
				}
			}else
				if ((xopt.getEntry(i)) >= (su.getEntry(i))) {
					if ((gopt.getEntry(i)) <= (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
						xbdi.setEntry(i, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE);
					}
				}
			
			if ((xbdi.getEntry(i)) != (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
				++nact;
			}
			d__.setEntry(i, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
			gnew.setEntry(i, gopt.getEntry(i));
		}
		delsq = delta * delta;
		qred = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
		crvmin = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.MINUS_ONE;
		int state = 20;
		for (; ;) {
			switch (state) {
				case 20 :
					{
						beta = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
					}
				case 30 :
					{
						stepsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						for (int i = 0; i < n; i++) {
							if ((xbdi.getEntry(i)) != (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
								s.setEntry(i, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
							}else
								if (beta == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
									s.setEntry(i, (-(gnew.getEntry(i))));
								}else {
									s.setEntry(i, ((beta * (s.getEntry(i))) - (gnew.getEntry(i))));
								}
							
							final double d1 = s.getEntry(i);
							stepsq += d1 * d1;
						}
						if (stepsq == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
							state = 190;
							break;
						}
						if (beta == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
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
						resid = delsq;
						ds = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						shs = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						for (int i = 0; i < n; i++) {
							if ((xbdi.getEntry(i)) == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
								final double d1 = d__.getEntry(i);
								resid -= d1 * d1;
								ds += (s.getEntry(i)) * (d__.getEntry(i));
								shs += (s.getEntry(i)) * (hs.getEntry(i));
							}
						}
						if (resid <= (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
							state = 90;
							break;
						}
						temp = java.lang.Math.sqrt(((stepsq * resid) + (ds * ds)));
						if (ds < (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
							blen = (temp - ds) / stepsq;
						}else {
							blen = resid / (temp + ds);
						}
						stplen = blen;
						if (shs > (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
							stplen = java.lang.Math.min(blen, (gredsq / shs));
						}
						iact = -1;
						for (int i = 0; i < n; i++) {
							if ((s.getEntry(i)) != (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
								xsum = (xopt.getEntry(i)) + (d__.getEntry(i));
								if ((s.getEntry(i)) > (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
									temp = ((su.getEntry(i)) - xsum) / (s.getEntry(i));
								}else {
									temp = ((sl.getEntry(i)) - xsum) / (s.getEntry(i));
								}
								if (temp < stplen) {
									stplen = temp;
									iact = i;
								}
							}
						}
						sdec = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						if (stplen > (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
							++iterc;
							temp = shs / stepsq;
							if ((iact == (-1)) && (temp > (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO))) {
								crvmin = java.lang.Math.min(crvmin, temp);
								if (crvmin == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.MINUS_ONE)) {
									crvmin = temp;
								}
							}
							ggsav = gredsq;
							gredsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int i = 0; i < n; i++) {
								gnew.setEntry(i, ((gnew.getEntry(i)) + (stplen * (hs.getEntry(i)))));
								if ((xbdi.getEntry(i)) == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
									final double d1 = gnew.getEntry(i);
									gredsq += d1 * d1;
								}
								d__.setEntry(i, ((d__.getEntry(i)) + (stplen * (s.getEntry(i)))));
							}
							final double d1 = stplen * (ggsav - (((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * stplen) * shs));
							sdec = java.lang.Math.max(d1, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
							qred += sdec;
						}
						if (iact >= 0) {
							++nact;
							xbdi.setEntry(iact, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE);
							if ((s.getEntry(iact)) < (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
								xbdi.setEntry(iact, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.MINUS_ONE);
							}
							final double d1 = d__.getEntry(iact);
							delsq -= d1 * d1;
							if (delsq <= (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
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
						crvmin = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
					}
				case 100 :
					{
						if (nact >= (n - 1)) {
							state = 190;
							break;
						}
						dredsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						dredg = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						gredsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						for (int i = 0; i < n; i++) {
							if ((xbdi.getEntry(i)) == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
								double d1 = d__.getEntry(i);
								dredsq += d1 * d1;
								dredg += (d__.getEntry(i)) * (gnew.getEntry(i));
								d1 = gnew.getEntry(i);
								gredsq += d1 * d1;
								s.setEntry(i, d__.getEntry(i));
							}else {
								s.setEntry(i, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
							}
						}
						itcsav = iterc;
						state = 210;
						break;
					}
				case 120 :
					{
						++iterc;
						temp = (gredsq * dredsq) - (dredg * dredg);
						if (temp <= ((qred * 1.0E-4) * qred)) {
							state = 190;
							break;
						}
						temp = java.lang.Math.sqrt(temp);
						for (int i = 0; i < n; i++) {
							if ((xbdi.getEntry(i)) == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
								s.setEntry(i, (((dredg * (d__.getEntry(i))) - (dredsq * (gnew.getEntry(i)))) / temp));
							}else {
								s.setEntry(i, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
							}
						}
						sredg = -temp;
						angbd = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE;
						iact = -1;
						for (int i = 0; i < n; i++) {
							if ((xbdi.getEntry(i)) == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
								tempa = ((xopt.getEntry(i)) + (d__.getEntry(i))) - (sl.getEntry(i));
								tempb = ((su.getEntry(i)) - (xopt.getEntry(i))) - (d__.getEntry(i));
								if (tempa <= (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
									++nact;
									xbdi.setEntry(i, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.MINUS_ONE);
									state = 100;
									break;
								}else
									if (tempb <= (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
										++nact;
										xbdi.setEntry(i, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE);
										state = 100;
										break;
									}
								
								double d1 = d__.getEntry(i);
								double d2 = s.getEntry(i);
								ssq = (d1 * d1) + (d2 * d2);
								d1 = (xopt.getEntry(i)) - (sl.getEntry(i));
								temp = ssq - (d1 * d1);
								if (temp > (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
									temp = (java.lang.Math.sqrt(temp)) - (s.getEntry(i));
									if ((angbd * temp) > tempa) {
										angbd = tempa / temp;
										iact = i;
										xsav = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.MINUS_ONE;
									}
								}
								d1 = (su.getEntry(i)) - (xopt.getEntry(i));
								temp = ssq - (d1 * d1);
								if (temp > (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
									temp = (java.lang.Math.sqrt(temp)) + (s.getEntry(i));
									if ((angbd * temp) > tempb) {
										angbd = tempb / temp;
										iact = i;
										xsav = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE;
									}
								}
							}
						}
						state = 210;
						break;
					}
				case 150 :
					{
						shs = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						dhs = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						dhd = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						for (int i = 0; i < n; i++) {
							if ((xbdi.getEntry(i)) == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
								shs += (s.getEntry(i)) * (hs.getEntry(i));
								dhs += (d__.getEntry(i)) * (hs.getEntry(i));
								dhd += (d__.getEntry(i)) * (hred.getEntry(i));
							}
						}
						redmax = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						isav = -1;
						redsav = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						iu = ((int) ((angbd * 17.0) + 3.1));
						for (int i = 0; i < iu; i++) {
							angt = (angbd * ((double) (i))) / ((double) (iu));
							sth = (angt + angt) / ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) + (angt * angt));
							temp = shs + (angt * (((angt * dhd) - dhs) - dhs));
							rednew = sth * (((angt * dredg) - sredg) - (((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * sth) * temp));
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
							angt = (angbd * (((double) (isav)) + ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * temp))) / ((double) (iu));
						}
						cth = ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) - (angt * angt)) / ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) + (angt * angt));
						sth = (angt + angt) / ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) + (angt * angt));
						temp = shs + (angt * (((angt * dhd) - dhs) - dhs));
						sdec = sth * (((angt * dredg) - sredg) - (((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * sth) * temp));
						if (sdec <= (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
							state = 190;
							break;
						}
						dredg = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						gredsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						for (int i = 0; i < n; i++) {
							gnew.setEntry(i, (((gnew.getEntry(i)) + ((cth - (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE)) * (hred.getEntry(i)))) + (sth * (hs.getEntry(i)))));
							if ((xbdi.getEntry(i)) == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
								d__.setEntry(i, ((cth * (d__.getEntry(i))) + (sth * (s.getEntry(i)))));
								dredg += (d__.getEntry(i)) * (gnew.getEntry(i));
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
						dsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						for (int i = 0; i < n; i++) {
							final double min = java.lang.Math.min(((xopt.getEntry(i)) + (d__.getEntry(i))), su.getEntry(i));
							xnew.setEntry(i, java.lang.Math.max(min, sl.getEntry(i)));
							if ((xbdi.getEntry(i)) == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.MINUS_ONE)) {
								xnew.setEntry(i, sl.getEntry(i));
							}
							if ((xbdi.getEntry(i)) == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE)) {
								xnew.setEntry(i, su.getEntry(i));
							}
							d__.setEntry(i, ((xnew.getEntry(i)) - (xopt.getEntry(i))));
							final double d1 = d__.getEntry(i);
							dsq += d1 * d1;
						}
						return new double[]{ dsq , crvmin };
					}
				case 210 :
					{
						ih = 0;
						for (int j = 0; j < n; j++) {
							hs.setEntry(j, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
							for (int i = 0; i <= j; i++) {
								if (i < j) {
									hs.setEntry(j, ((hs.getEntry(j)) + ((hq.getEntry(ih)) * (s.getEntry(i)))));
								}
								hs.setEntry(i, ((hs.getEntry(i)) + ((hq.getEntry(ih)) * (s.getEntry(j)))));
								ih++;
							}
						}
						final org.apache.commons.math.linear.RealVector tmp = xpt.operate(s).ebeMultiply(pq);
						for (int k = 0; k < npt; k++) {
							if ((pq.getEntry(k)) != (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
								for (int i = 0; i < n; i++) {
									hs.setEntry(i, ((hs.getEntry(i)) + ((tmp.getEntry(k)) * (xpt.getEntry(k, i)))));
								}
							}
						}
						if (crvmin != (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
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
						throw new org.apache.commons.math.exception.MathIllegalStateException(org.apache.commons.math.exception.util.LocalizedFormats.SIMPLE_MESSAGE, "trsbox");
					}
			}
		}
	}

	private void update(org.apache.commons.math.linear.Array2DRowRealMatrix bmat, org.apache.commons.math.linear.Array2DRowRealMatrix zmat, org.apache.commons.math.linear.ArrayRealVector vlag, double beta, double denom, int knew) {
		final int n = currentBest.getDimension();
		final int npt = numberOfInterpolationPoints;
		final int nptm = (npt - n) - 1;
		final org.apache.commons.math.linear.ArrayRealVector work = new org.apache.commons.math.linear.ArrayRealVector((npt + n));
		double ztest = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
		for (int k = 0; k < npt; k++) {
			for (int j = 0; j < nptm; j++) {
				ztest = java.lang.Math.max(ztest, java.lang.Math.abs(zmat.getEntry(k, j)));
			}
		}
		ztest *= 1.0E-20;
		for (int j = 1; j < nptm; j++) {
			final double d1 = zmat.getEntry(knew, j);
			if ((java.lang.Math.abs(d1)) > ztest) {
				final double d2 = zmat.getEntry(knew, 0);
				final double d3 = zmat.getEntry(knew, j);
				final double d4 = java.lang.Math.sqrt(((d2 * d2) + (d3 * d3)));
				final double d5 = (zmat.getEntry(knew, 0)) / d4;
				final double d6 = (zmat.getEntry(knew, j)) / d4;
				for (int i = 0; i < npt; i++) {
					final double d7 = (d5 * (zmat.getEntry(i, 0))) + (d6 * (zmat.getEntry(i, j)));
					zmat.setEntry(i, j, ((d5 * (zmat.getEntry(i, j))) - (d6 * (zmat.getEntry(i, 0)))));
					zmat.setEntry(i, 0, d7);
				}
			}
			zmat.setEntry(knew, j, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
		}
		for (int i = 0; i < npt; i++) {
			work.setEntry(i, ((zmat.getEntry(knew, 0)) * (zmat.getEntry(i, 0))));
		}
		final double alpha = work.getEntry(knew);
		final double tau = vlag.getEntry(knew);
		vlag.setEntry(knew, ((vlag.getEntry(knew)) - (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE)));
		final double sqrtDenom = java.lang.Math.sqrt(denom);
		final double d1 = tau / sqrtDenom;
		final double d2 = (zmat.getEntry(knew, 0)) / sqrtDenom;
		for (int i = 0; i < npt; i++) {
			zmat.setEntry(i, 0, ((d1 * (zmat.getEntry(i, 0))) - (d2 * (vlag.getEntry(i)))));
		}
		for (int j = 0; j < n; j++) {
			final int jp = npt + j;
			work.setEntry(jp, bmat.getEntry(knew, j));
			final double d3 = ((alpha * (vlag.getEntry(jp))) - (tau * (work.getEntry(jp)))) / denom;
			final double d4 = (((-beta) * (work.getEntry(jp))) - (tau * (vlag.getEntry(jp)))) / denom;
			for (int i = 0; i <= jp; i++) {
				bmat.setEntry(i, j, (((bmat.getEntry(i, j)) + (d3 * (vlag.getEntry(i)))) + (d4 * (work.getEntry(i)))));
				if (i >= npt) {
					bmat.setEntry(jp, (i - npt), bmat.getEntry(i, j));
				}
			}
		}
	}

	private void setup() {
		double[] init = getStartPoint();
		final int dimension = init.length;
		if (dimension < (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.MINIMUM_PROBLEM_DIMENSION)) {
			throw new org.apache.commons.math.exception.NumberIsTooSmallException(dimension, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.MINIMUM_PROBLEM_DIMENSION, true);
		}
		final int[] nPointsInterval = new int[]{ dimension + 2 , ((dimension + 2) * (dimension + 1)) / 2 };
		if (((numberOfInterpolationPoints) < (nPointsInterval[0])) || ((numberOfInterpolationPoints) > (nPointsInterval[1]))) {
			throw new org.apache.commons.math.exception.OutOfRangeException(org.apache.commons.math.exception.util.LocalizedFormats.NUMBER_OF_INTERPOLATION_POINTS, numberOfInterpolationPoints, nPointsInterval[0], nPointsInterval[1]);
		}
		if ((lowerBound) == null) {
			lowerBound = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.fillNewArray(dimension, java.lang.Double.NEGATIVE_INFINITY);
		}else
			if ((lowerBound.length) != (init.length)) {
				throw new org.apache.commons.math.exception.DimensionMismatchException(lowerBound.length, dimension);
			}
		
		if ((upperBound) == null) {
			upperBound = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.fillNewArray(dimension, java.lang.Double.POSITIVE_INFINITY);
		}else
			if ((upperBound.length) != (init.length)) {
				throw new org.apache.commons.math.exception.DimensionMismatchException(upperBound.length, dimension);
			}
		
		for (int i = 0; i < dimension; i++) {
			final double v = init[i];
			final double lo = lowerBound[i];
			final double hi = upperBound[i];
			if ((v < lo) || (v > hi)) {
				throw new org.apache.commons.math.exception.OutOfRangeException(v, lo, hi);
			}
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
	}

	private static double[] fillNewArray(int n, double value) {
		double[] ds = new double[n];
		java.util.Arrays.fill(ds, value);
		return ds;
	}
}

class PathIsExploredException extends java.lang.RuntimeException {
	private static final java.lang.String PATH_IS_EXPLORED = "If this exception is thrown, just remove it from the code";

	PathIsExploredException() {
		super(org.apache.commons.math.optimization.direct.PathIsExploredException.PATH_IS_EXPLORED);
	}
}




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
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray xbase = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(n);
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix xpt = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix(npt, n);
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray fval = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(npt);
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray xopt = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(n);
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray gopt = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(n);
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray hq = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(((n * np) / 2));
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray pq = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(npt);
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix bmat = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix(ndim, n);
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix zmat = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix(npt, (npt - np));
		final org.apache.commons.math.linear.ArrayRealVector sl = new org.apache.commons.math.linear.ArrayRealVector(n);
		final org.apache.commons.math.linear.ArrayRealVector su = new org.apache.commons.math.linear.ArrayRealVector(n);
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray xnew = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(n);
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray xalt = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(n);
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray d__ = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(n);
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray vlag = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(ndim);
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
		return bobyqb(xbase, xpt, fval, xopt, gopt, hq, pq, bmat, zmat, new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(sl), new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(su), xnew, xalt, d__, vlag);
	}

	private double bobyqb(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray xbase, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix xpt, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray fval, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray xopt, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray gopt, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray hq, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray pq, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix bmat, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix zmat, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray sl, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray su, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray xnew, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray xalt, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray d__, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray vlag) {
		final int n = currentBest.getDimension();
		final int npt = numberOfInterpolationPoints;
		final int ndim = bmat.getRowDimension();
		final int np = n + 1;
		final int nptm = npt - np;
		final int nh = (n * np) / 2;
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray work1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(n);
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray work2 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(npt);
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray work3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(npt);
		double cauchy = java.lang.Double.NaN;
		double alpha = java.lang.Double.NaN;
		double dsq = java.lang.Double.NaN;
		double crvmin = java.lang.Double.NaN;
		int xpt_offset;
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
		int nresc;
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
		for (int i = 1; i <= n; i++) {
			xopt.setEntry(i, xpt.getEntry(trustRegionCenterInterpolationPointIndex, i));
			final double deltaOne = xopt.getEntry(i);
			xoptsq += deltaOne * deltaOne;
		}
		fsave = fval.getEntry(1);
		kbase = 1;
		rho = initialTrustRegionRadius;
		delta = rho;
		nresc = getEvaluations();
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
							for (int j = 1; j <= n; j++) {
								for (int i = 1; i <= j; i++) {
									++ih;
									if (i < j) {
										gopt.setEntry(j, ((gopt.getEntry(j)) + ((hq.getEntry(ih)) * (xopt.getEntry(i)))));
									}
									gopt.setEntry(i, ((gopt.getEntry(i)) + ((hq.getEntry(ih)) * (xopt.getEntry(j)))));
								}
							}
							if ((getEvaluations()) > npt) {
								for (int k = 1; k <= npt; k++) {
									temp = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
									for (int j = 1; j <= n; j++) {
										temp += (xpt.getEntry(k, j)) * (xopt.getEntry(j));
									}
									temp = (pq.getEntry(k)) * temp;
									for (int i = 1; i <= n; i++) {
										gopt.setEntry(i, ((gopt.getEntry(i)) + (temp * (xpt.getEntry(k, i)))));
									}
								}
							}
						}
					}
				case 60 :
					{
						final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray gnew = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(n);
						final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray xbdi = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(n);
						final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray s = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(n);
						final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray hs = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(n);
						final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray hred = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(n);
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
							for (int j = 1; j <= n; j++) {
								bdtest = bdtol;
								if ((xnew.getEntry(j)) == (sl.getEntry(j))) {
									bdtest = work1.getEntry(j);
								}
								if ((xnew.getEntry(j)) == (su.getEntry(j))) {
									bdtest = -(work1.getEntry(j));
								}
								if (bdtest < bdtol) {
									curv = hq.getEntry(((j + (j * j)) / 2));
									for (int k = 1; k <= npt; k++) {
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
							for (int k = 1; k <= npt; k++) {
								sumpq += pq.getEntry(k);
								sum = (-(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF)) * xoptsq;
								for (int i = 1; i <= n; i++) {
									sum += (xpt.getEntry(k, i)) * (xopt.getEntry(i));
								}
								work2.setEntry(k, sum);
								temp = fracsq - ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * sum);
								for (int i = 1; i <= n; i++) {
									work1.setEntry(i, bmat.getEntry(k, i));
									vlag.setEntry(i, ((sum * (xpt.getEntry(k, i))) + (temp * (xopt.getEntry(i)))));
									ip = npt + i;
									for (int j = 1; j <= i; j++) {
										bmat.setEntry(ip, j, (((bmat.getEntry(ip, j)) + ((work1.getEntry(i)) * (vlag.getEntry(j)))) + ((vlag.getEntry(i)) * (work1.getEntry(j)))));
									}
								}
							}
							for (int m = 1; m <= nptm; m++) {
								sumz = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
								sumw = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
								for (int k = 1; k <= npt; k++) {
									sumz += zmat.getEntry(k, m);
									vlag.setEntry(k, ((work2.getEntry(k)) * (zmat.getEntry(k, m))));
									sumw += vlag.getEntry(k);
								}
								for (int j = 1; j <= n; j++) {
									sum = ((fracsq * sumz) - ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * sumw)) * (xopt.getEntry(j));
									for (int k = 1; k <= npt; k++) {
										sum += (vlag.getEntry(k)) * (xpt.getEntry(k, j));
									}
									work1.setEntry(j, sum);
									for (int k = 1; k <= npt; k++) {
										bmat.setEntry(k, j, ((bmat.getEntry(k, j)) + (sum * (zmat.getEntry(k, m)))));
									}
								}
								for (int i = 1; i <= n; i++) {
									ip = i + npt;
									temp = work1.getEntry(i);
									for (int j = 1; j <= i; j++) {
										bmat.setEntry(ip, j, ((bmat.getEntry(ip, j)) + (temp * (work1.getEntry(j)))));
									}
								}
							}
							ih = 0;
							for (int j = 1; j <= n; j++) {
								work1.setEntry(j, (((-(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF)) * sumpq) * (xopt.getEntry(j))));
								for (int k = 1; k <= npt; k++) {
									work1.setEntry(j, ((work1.getEntry(j)) + ((pq.getEntry(k)) * (xpt.getEntry(k, j)))));
									xpt.setEntry(k, j, ((xpt.getEntry(k, j)) - (xopt.getEntry(j))));
								}
								for (int i = 1; i <= j; i++) {
									++ih;
									hq.setEntry(ih, (((hq.getEntry(ih)) + ((work1.getEntry(i)) * (xopt.getEntry(j)))) + ((xopt.getEntry(i)) * (work1.getEntry(j)))));
									bmat.setEntry((npt + i), j, bmat.getEntry((npt + j), i));
								}
							}
							for (int i = 1; i <= n; i++) {
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
				case 190 :
					{
						nfsav = getEvaluations();
						kbase = trustRegionCenterInterpolationPointIndex;
						rescue(xbase, xpt, fval, xopt, gopt, hq, pq, bmat, zmat, sl, su, delta, vlag);
						xoptsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						if ((trustRegionCenterInterpolationPointIndex) != kbase) {
							for (int i = 1; i <= n; i++) {
								xopt.setEntry(i, xpt.getEntry(trustRegionCenterInterpolationPointIndex, i));
								final double d1 = xopt.getEntry(i);
								xoptsq += d1 * d1;
							}
						}
						nresc = getEvaluations();
						if (nfsav < (getEvaluations())) {
							nfsav = getEvaluations();
							state = 20;
							break;
						}
						if (ntrits > 0) {
							state = 60;
							break;
						}
					}
				case 210 :
					{
						final double[] alphaCauchy = altmov(xpt, xopt, bmat, zmat, sl, su, knew, adelt, xnew, xalt);
						alpha = alphaCauchy[0];
						cauchy = alphaCauchy[1];
						for (int i = 1; i <= n; i++) {
							d__.setEntry(i, ((xnew.getEntry(i)) - (xopt.getEntry(i))));
						}
					}
				case 230 :
					{
						for (int k = 1; k <= npt; k++) {
							suma = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							sumb = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							sum = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int j = 1; j <= n; j++) {
								suma += (xpt.getEntry(k, j)) * (d__.getEntry(j));
								sumb += (xpt.getEntry(k, j)) * (xopt.getEntry(j));
								sum += (bmat.getEntry(k, j)) * (d__.getEntry(j));
							}
							work3.setEntry(k, (suma * (((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * suma) + sumb)));
							vlag.setEntry(k, sum);
							work2.setEntry(k, suma);
						}
						beta = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						for (int m = 1; m <= nptm; m++) {
							sum = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int k = 1; k <= npt; k++) {
								sum += (zmat.getEntry(k, m)) * (work3.getEntry(k));
							}
							beta -= sum * sum;
							for (int k = 1; k <= npt; k++) {
								vlag.setEntry(k, ((vlag.getEntry(k)) + (sum * (zmat.getEntry(k, m)))));
							}
						}
						dsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						bsum = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						dx = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						for (int j = 1; j <= n; j++) {
							final double d1 = d__.getEntry(j);
							dsq += d1 * d1;
							sum = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int k = 1; k <= npt; k++) {
								sum += (work3.getEntry(k)) * (bmat.getEntry(k, j));
							}
							bsum += sum * (d__.getEntry(j));
							jp = npt + j;
							for (int i = 1; i <= n; i++) {
								sum += (bmat.getEntry(jp, i)) * (d__.getEntry(i));
							}
							vlag.setEntry(jp, sum);
							bsum += sum * (d__.getEntry(j));
							dx += (d__.getEntry(j)) * (xopt.getEntry(j));
						}
						beta = (((dx * dx) + (dsq * (((xoptsq + dx) + dx) + ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * dsq)))) + beta) - bsum;
						vlag.setEntry(trustRegionCenterInterpolationPointIndex, ((vlag.getEntry(trustRegionCenterInterpolationPointIndex)) + (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE)));
						if (ntrits == 0) {
							d__1 = vlag.getEntry(knew);
							denom = (d__1 * d__1) + (alpha * beta);
							if ((denom < cauchy) && (cauchy > (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO))) {
								for (int i = 1; i <= n; i++) {
									xnew.setEntry(i, xalt.getEntry(i));
									d__.setEntry(i, ((xnew.getEntry(i)) - (xopt.getEntry(i))));
								}
								cauchy = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
								state = 230;
								break;
							}
							d__1 = vlag.getEntry(knew);
							if (denom <= ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * (d__1 * d__1))) {
								if ((getEvaluations()) > nresc) {
									state = 190;
									break;
								}
								throw new org.apache.commons.math.exception.MathIllegalStateException(org.apache.commons.math.exception.util.LocalizedFormats.TOO_MUCH_CANCELLATION, vquad);
							}
						}else {
							delsq = delta * delta;
							scaden = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							biglsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							knew = 0;
							for (int k = 1; k <= npt; k++) {
								if (k == (trustRegionCenterInterpolationPointIndex)) {
									continue;
								}
								hdiag = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
								for (int m = 1; m <= nptm; m++) {
									final double d1 = zmat.getEntry(k, m);
									hdiag += d1 * d1;
								}
								d__1 = vlag.getEntry(k);
								den = (beta * hdiag) + (d__1 * d__1);
								distsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
								for (int j = 1; j <= n; j++) {
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
							if (scaden <= ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * biglsq)) {
								if ((getEvaluations()) > nresc) {
									state = 190;
									break;
								}
								throw new org.apache.commons.math.exception.MathIllegalStateException(org.apache.commons.math.exception.util.LocalizedFormats.TOO_MUCH_CANCELLATION, vquad);
							}
						}
					}
				case 360 :
					{
						for (int i = 1; i <= n; i++) {
							d__3 = lowerBound[org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(i)];
							d__4 = (xbase.getEntry(i)) + (xnew.getEntry(i));
							d__1 = java.lang.Math.max(d__3, d__4);
							d__2 = upperBound[org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(i)];
							currentBest.setEntry(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(i), java.lang.Math.min(d__1, d__2));
							if ((xnew.getEntry(i)) == (sl.getEntry(i))) {
								currentBest.setEntry(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(i), lowerBound[org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(i)]);
							}
							if ((xnew.getEntry(i)) == (su.getEntry(i))) {
								currentBest.setEntry(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(i), upperBound[org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(i)]);
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
						for (int j = 1; j <= n; j++) {
							vquad += (d__.getEntry(j)) * (gopt.getEntry(j));
							for (int i = 1; i <= j; i++) {
								++ih;
								temp = (d__.getEntry(i)) * (d__.getEntry(j));
								if (i == j) {
									temp = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * temp;
								}
								vquad += (hq.getEntry(ih)) * temp;
							}
						}
						for (int k = 1; k <= npt; k++) {
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
								for (int k = 1; k <= npt; k++) {
									hdiag = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
									for (int m = 1; m <= nptm; m++) {
										final double d1 = zmat.getEntry(k, m);
										hdiag += d1 * d1;
									}
									d__1 = vlag.getEntry(k);
									den = (beta * hdiag) + (d__1 * d__1);
									distsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
									for (int j = 1; j <= n; j++) {
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
						for (int i = 1; i <= n; i++) {
							temp = pqold * (xpt.getEntry(knew, i));
							for (int j = 1; j <= i; j++) {
								++ih;
								hq.setEntry(ih, ((hq.getEntry(ih)) + (temp * (xpt.getEntry(knew, j)))));
							}
						}
						for (int m = 1; m <= nptm; m++) {
							temp = diff * (zmat.getEntry(knew, m));
							for (int k = 1; k <= npt; k++) {
								pq.setEntry(k, ((pq.getEntry(k)) + (temp * (zmat.getEntry(k, m)))));
							}
						}
						fval.setEntry(knew, f);
						for (int i = 1; i <= n; i++) {
							xpt.setEntry(knew, i, xnew.getEntry(i));
							work1.setEntry(i, bmat.getEntry(knew, i));
						}
						for (int k = 1; k <= npt; k++) {
							suma = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int m = 1; m <= nptm; m++) {
								suma += (zmat.getEntry(knew, m)) * (zmat.getEntry(k, m));
							}
							sumb = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int j = 1; j <= n; j++) {
								sumb += (xpt.getEntry(k, j)) * (xopt.getEntry(j));
							}
							temp = suma * sumb;
							for (int i = 1; i <= n; i++) {
								work1.setEntry(i, ((work1.getEntry(i)) + (temp * (xpt.getEntry(k, i)))));
							}
						}
						for (int i = 1; i <= n; i++) {
							gopt.setEntry(i, ((gopt.getEntry(i)) + (diff * (work1.getEntry(i)))));
						}
						if (f < fopt) {
							trustRegionCenterInterpolationPointIndex = knew;
							xoptsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							ih = 0;
							for (int j = 1; j <= n; j++) {
								xopt.setEntry(j, xnew.getEntry(j));
								final double d1 = xopt.getEntry(j);
								xoptsq += d1 * d1;
								for (int i = 1; i <= j; i++) {
									++ih;
									if (i < j) {
										gopt.setEntry(j, ((gopt.getEntry(j)) + ((hq.getEntry(ih)) * (d__.getEntry(i)))));
									}
									gopt.setEntry(i, ((gopt.getEntry(i)) + ((hq.getEntry(ih)) * (d__.getEntry(j)))));
								}
							}
							for (int k = 1; k <= npt; k++) {
								temp = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
								for (int j = 1; j <= n; j++) {
									temp += (xpt.getEntry(k, j)) * (d__.getEntry(j));
								}
								temp = (pq.getEntry(k)) * temp;
								for (int i = 1; i <= n; i++) {
									gopt.setEntry(i, ((gopt.getEntry(i)) + (temp * (xpt.getEntry(k, i)))));
								}
							}
						}
						if (ntrits > 0) {
							for (int k = 1; k <= npt; k++) {
								vlag.setEntry(k, ((fval.getEntry(k)) - (fval.getEntry(trustRegionCenterInterpolationPointIndex))));
								work3.setEntry(k, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
							}
							for (int j = 1; j <= nptm; j++) {
								sum = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
								for (int k = 1; k <= npt; k++) {
									sum += (zmat.getEntry(k, j)) * (vlag.getEntry(k));
								}
								for (int k = 1; k <= npt; k++) {
									work3.setEntry(k, ((work3.getEntry(k)) + (sum * (zmat.getEntry(k, j)))));
								}
							}
							for (int k = 1; k <= npt; k++) {
								sum = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
								for (int j = 1; j <= n; j++) {
									sum += (xpt.getEntry(k, j)) * (xopt.getEntry(j));
								}
								work2.setEntry(k, work3.getEntry(k));
								work3.setEntry(k, (sum * (work3.getEntry(k))));
							}
							gqsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							gisq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int i = 1; i <= n; i++) {
								sum = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
								for (int k = 1; k <= npt; k++) {
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
								for (int i = 1, max = java.lang.Math.max(npt, nh); i <= max; i++) {
									if (i <= n) {
										gopt.setEntry(i, vlag.getEntry((npt + i)));
									}
									if (i <= npt) {
										pq.setEntry(i, work2.getEntry(i));
									}
									if (i <= nh) {
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
						knew = 0;
						for (int k = 1; k <= npt; k++) {
							sum = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int j = 1; j <= n; j++) {
								final double d1 = (xpt.getEntry(k, j)) - (xopt.getEntry(j));
								sum += d1 * d1;
							}
							if (sum > distsq) {
								knew = k;
								distsq = sum;
							}
						}
						if (knew > 0) {
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
							for (int i = 1; i <= n; i++) {
								d__3 = lowerBound[org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(i)];
								d__4 = (xbase.getEntry(i)) + (xopt.getEntry(i));
								d__1 = java.lang.Math.max(d__3, d__4);
								d__2 = upperBound[org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(i)];
								currentBest.setEntry(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(i), java.lang.Math.min(d__1, d__2));
								if ((xopt.getEntry(i)) == (sl.getEntry(i))) {
									currentBest.setEntry(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(i), lowerBound[org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(i)]);
								}
								if ((xopt.getEntry(i)) == (su.getEntry(i))) {
									currentBest.setEntry(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(i), upperBound[org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(i)]);
								}
							}
							f = fval.getEntry(trustRegionCenterInterpolationPointIndex);
						}
						return f;
					}
			}
		
	}

	private double[] altmov(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix xpt, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray xopt, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix bmat, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix zmat, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray sl, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray su, int knew, double adelt, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray xnew, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray xalt) {
		final int n = currentBest.getDimension();
		final int npt = numberOfInterpolationPoints;
		final int ndim = bmat.getRowDimension();
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray glag = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(n);
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray hcol = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(npt);
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray work1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(n);
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray work2 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(n);
		double alpha = java.lang.Double.NaN;
		double cauchy = java.lang.Double.NaN;
		double d__1;
		double d__2;
		double d__3;
		double d__4;
		double ha;
		double gw;
		double diff;
		int ilbd;
		int isbd;
		double slbd;
		int iubd;
		double vlag;
		double subd;
		double temp;
		int ksav = 0;
		double step = 0;
		double curv = 0;
		int iflag;
		double scale = 0;
		double csave = 0;
		double tempa = 0;
		double tempb = 0;
		double tempd = 0;
		double const__ = 0;
		double sumin = 0;
		double ggfree = 0;
		int ibdsav = 0;
		double dderiv = 0;
		double bigstp = 0;
		double predsq = 0;
		double presav = 0;
		double distsq = 0;
		double stpsav = 0;
		double wfixsq = 0;
		double wsqsav = 0;
		const__ = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) + (java.lang.Math.sqrt(2.0));
		for (int k = 1; k <= npt; k++) {
			hcol.setEntry(k, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
		}
		for (int j = 1, max = (npt - n) - 1; j <= max; j++) {
			temp = zmat.getEntry(knew, j);
			for (int k = 1; k <= npt; k++) {
				hcol.setEntry(k, ((hcol.getEntry(k)) + (temp * (zmat.getEntry(k, j)))));
			}
		}
		alpha = hcol.getEntry(knew);
		ha = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * alpha;
		for (int i = 1; i <= n; i++) {
			glag.setEntry(i, bmat.getEntry(knew, i));
		}
		for (int k = 1; k <= npt; k++) {
			temp = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
			for (int j = 1; j <= n; j++) {
				temp += (xpt.getEntry(k, j)) * (xopt.getEntry(j));
			}
			temp = (hcol.getEntry(k)) * temp;
			for (int i = 1; i <= n; i++) {
				glag.setEntry(i, ((glag.getEntry(i)) + (temp * (xpt.getEntry(k, i)))));
			}
		}
		presav = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
		for (int k = 1; k <= npt; k++) {
			if (k == (trustRegionCenterInterpolationPointIndex)) {
				continue;
			}
			dderiv = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
			distsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
			for (int i = 1; i <= n; i++) {
				temp = (xpt.getEntry(k, i)) - (xopt.getEntry(i));
				dderiv += (glag.getEntry(i)) * temp;
				distsq += temp * temp;
			}
			subd = adelt / (java.lang.Math.sqrt(distsq));
			slbd = -subd;
			ilbd = 0;
			iubd = 0;
			sumin = java.lang.Math.min(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE, subd);
			for (int i = 1; i <= n; i++) {
				temp = (xpt.getEntry(k, i)) - (xopt.getEntry(i));
				if (temp > (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
					if ((slbd * temp) < ((sl.getEntry(i)) - (xopt.getEntry(i)))) {
						slbd = ((sl.getEntry(i)) - (xopt.getEntry(i))) / temp;
						ilbd = -i;
					}
					if ((subd * temp) > ((su.getEntry(i)) - (xopt.getEntry(i)))) {
						d__1 = sumin;
						d__2 = ((su.getEntry(i)) - (xopt.getEntry(i))) / temp;
						subd = java.lang.Math.max(d__1, d__2);
						iubd = i;
					}
				}else
					if (temp < (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
						if ((slbd * temp) > ((su.getEntry(i)) - (xopt.getEntry(i)))) {
							slbd = ((su.getEntry(i)) - (xopt.getEntry(i))) / temp;
							ilbd = i;
						}
						if ((subd * temp) < ((sl.getEntry(i)) - (xopt.getEntry(i)))) {
							d__1 = sumin;
							d__2 = ((sl.getEntry(i)) - (xopt.getEntry(i))) / temp;
							subd = java.lang.Math.max(d__1, d__2);
							iubd = -i;
						}
					}
				
			}
			if (k == knew) {
				diff = dderiv - (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE);
				step = slbd;
				vlag = slbd * (dderiv - (slbd * diff));
				isbd = ilbd;
				temp = subd * (dderiv - (subd * diff));
				if ((java.lang.Math.abs(temp)) > (java.lang.Math.abs(vlag))) {
					step = subd;
					vlag = temp;
					isbd = iubd;
				}
				tempd = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * dderiv;
				tempa = tempd - (diff * slbd);
				tempb = tempd - (diff * subd);
				if ((tempa * tempb) < (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
					temp = (tempd * tempd) / diff;
					if ((java.lang.Math.abs(temp)) > (java.lang.Math.abs(vlag))) {
						step = tempd / diff;
						vlag = temp;
						isbd = 0;
					}
				}
			}else {
				step = slbd;
				vlag = slbd * ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) - slbd);
				isbd = ilbd;
				temp = subd * ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) - subd);
				if ((java.lang.Math.abs(temp)) > (java.lang.Math.abs(vlag))) {
					step = subd;
					vlag = temp;
					isbd = iubd;
				}
				if (subd > (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF)) {
					if ((java.lang.Math.abs(vlag)) < 0.25) {
						step = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF;
						vlag = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE_OVER_FOUR;
						isbd = 0;
					}
				}
				vlag *= dderiv;
			}
			temp = (step * ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) - step)) * distsq;
			predsq = (vlag * vlag) * ((vlag * vlag) + ((ha * temp) * temp));
			if (predsq > presav) {
				presav = predsq;
				ksav = k;
				stpsav = step;
				ibdsav = isbd;
			}
		}
		for (int i = 1; i <= n; i++) {
			temp = (xopt.getEntry(i)) + (stpsav * ((xpt.getEntry(ksav, i)) - (xopt.getEntry(i))));
			d__3 = su.getEntry(i);
			d__1 = sl.getEntry(i);
			d__2 = java.lang.Math.min(d__3, temp);
			xnew.setEntry(i, java.lang.Math.max(d__1, d__2));
		}
		if (ibdsav < 0) {
			xnew.setEntry((-ibdsav), sl.getEntry((-ibdsav)));
		}
		if (ibdsav > 0) {
			xnew.setEntry(ibdsav, su.getEntry(ibdsav));
		}
		bigstp = adelt + adelt;
		iflag = 0;
		L100 : for (; ;) {
			wfixsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
			ggfree = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
			for (int i = 1; i <= n; i++) {
				work1.setEntry(i, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
				d__1 = (xopt.getEntry(i)) - (sl.getEntry(i));
				d__2 = glag.getEntry(i);
				tempa = java.lang.Math.min(d__1, d__2);
				d__1 = (xopt.getEntry(i)) - (su.getEntry(i));
				d__2 = glag.getEntry(i);
				tempb = java.lang.Math.max(d__1, d__2);
				if ((tempa > (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) || (tempb < (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO))) {
					work1.setEntry(i, bigstp);
					final double d1 = glag.getEntry(i);
					ggfree += d1 * d1;
				}
			}
			if (ggfree == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
				cauchy = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
				return new double[]{ alpha , cauchy };
			}
			L120 : {
				temp = (adelt * adelt) - wfixsq;
				if (temp > (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
					wsqsav = wfixsq;
					step = java.lang.Math.sqrt((temp / ggfree));
					ggfree = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
					for (int i = 1; i <= n; i++) {
						if ((work1.getEntry(i)) == bigstp) {
							temp = (xopt.getEntry(i)) - (step * (glag.getEntry(i)));
							if (temp <= (sl.getEntry(i))) {
								work1.setEntry(i, ((sl.getEntry(i)) - (xopt.getEntry(i))));
								final double d1 = work1.getEntry(i);
								wfixsq += d1 * d1;
							}else
								if (temp >= (su.getEntry(i))) {
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
			gw = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
			for (int i = 1; i <= n; i++) {
				if ((work1.getEntry(i)) == bigstp) {
					work1.setEntry(i, ((-step) * (glag.getEntry(i))));
					final double min = java.lang.Math.min(su.getEntry(i), ((xopt.getEntry(i)) + (work1.getEntry(i))));
					xalt.setEntry(i, java.lang.Math.max(sl.getEntry(i), min));
				}else
					if ((work1.getEntry(i)) == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
						xalt.setEntry(i, xopt.getEntry(i));
					}else
						if ((glag.getEntry(i)) > (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
							xalt.setEntry(i, sl.getEntry(i));
						}else {
							xalt.setEntry(i, su.getEntry(i));
						}
					
				
				gw += (glag.getEntry(i)) * (work1.getEntry(i));
			}
			curv = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
			for (int k = 1; k <= npt; k++) {
				temp = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
				for (int j = 1; j <= n; j++) {
					temp += (xpt.getEntry(k, j)) * (work1.getEntry(j));
				}
				curv += ((hcol.getEntry(k)) * temp) * temp;
			}
			if (iflag == 1) {
				curv = -curv;
			}
			if ((curv > (-gw)) && (curv < ((-const__) * gw))) {
				scale = (-gw) / curv;
				for (int i = 1; i <= n; i++) {
					temp = (xopt.getEntry(i)) + (scale * (work1.getEntry(i)));
					d__3 = su.getEntry(i);
					d__2 = java.lang.Math.min(d__3, temp);
					xalt.setEntry(i, java.lang.Math.max(sl.getEntry(i), d__2));
				}
				final double d1 = ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * gw) * scale;
				cauchy = d1 * d1;
			}else {
				final double d1 = gw + ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * curv);
				cauchy = d1 * d1;
			}
			if (iflag == 0) {
				for (int i = 1; i <= n; i++) {
					glag.setEntry(i, (-(glag.getEntry(i))));
					work2.setEntry(i, xalt.getEntry(i));
				}
				csave = cauchy;
				iflag = 1;
			}else {
				break L100;
			}
		}
		if (csave > cauchy) {
			for (int i = 1; i <= n; i++) {
				xalt.setEntry(i, work2.getEntry(i));
			}
			cauchy = csave;
		}
		return new double[]{ alpha , cauchy };
	}

	private void prelim(org.apache.commons.math.linear.ArrayRealVector currentBest, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray xbase, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix xpt, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray fval, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray gopt, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray hq, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray pq, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix bmat, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix zmat, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray sl, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray su) {
		final int n = currentBest.getDimension();
		final int npt = numberOfInterpolationPoints;
		final int ndim = bmat.getRowDimension();
		final double rhosq = (initialTrustRegionRadius) * (initialTrustRegionRadius);
		final double recip = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) / rhosq;
		final int np = n + 1;
		double d__1;
		double d__2;
		double d__3;
		double d__4;
		double f;
		int ih;
		int nfm;
		int nfx = 0;
		int ipt = 0;
		int jpt = 0;
		double fbeg = 0;
		double diff = 0;
		double temp = 0;
		double stepa = 0;
		double stepb = 0;
		int itemp;
		for (int j = 1; j <= n; j++) {
			xbase.setEntry(j, currentBest.getEntry(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(j)));
			for (int k = 1; k <= npt; k++) {
				xpt.setEntry(k, j, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
			}
			for (int i = 1; i <= ndim; i++) {
				bmat.setEntry(i, j, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
			}
		}
		for (int i = 1, max = (n * np) / 2; i <= max; i++) {
			hq.setEntry(i, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
		}
		for (int k = 1; k <= npt; k++) {
			pq.setEntry(k, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
			for (int j = 1, max = npt - np; j <= max; j++) {
				zmat.setEntry(k, j, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
			}
		}
		do {
			nfm = getEvaluations();
			nfx = (getEvaluations()) - n;
			final int curNumEvalPlusOne = (getEvaluations()) + 1;
			if (nfm <= (n << 1)) {
				if ((nfm >= 1) && (nfm <= n)) {
					stepa = initialTrustRegionRadius;
					if ((su.getEntry(nfm)) == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
						stepa = -stepa;
					}
					xpt.setEntry(curNumEvalPlusOne, nfm, stepa);
				}else
					if (nfm > n) {
						stepa = xpt.getEntry((curNumEvalPlusOne - n), nfx);
						stepb = -(initialTrustRegionRadius);
						if ((sl.getEntry(nfx)) == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
							final double d1 = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.TWO) * (initialTrustRegionRadius);
							stepb = java.lang.Math.min(d1, su.getEntry(nfx));
						}
						if ((su.getEntry(nfx)) == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
							final double d1 = (-(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.TWO)) * (initialTrustRegionRadius);
							stepb = java.lang.Math.max(d1, sl.getEntry(nfx));
						}
						xpt.setEntry(curNumEvalPlusOne, nfx, stepb);
					}
				
			}else {
				itemp = (nfm - np) / n;
				jpt = (nfm - (itemp * n)) - n;
				ipt = jpt + itemp;
				if (ipt > n) {
					itemp = jpt;
					jpt = ipt - n;
					ipt = itemp;
				}
				xpt.setEntry(curNumEvalPlusOne, ipt, xpt.getEntry((ipt + 1), ipt));
				xpt.setEntry(curNumEvalPlusOne, jpt, xpt.getEntry((jpt + 1), jpt));
			}
			for (int j = 1; j <= n; j++) {
				d__3 = lowerBound[org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(j)];
				d__4 = (xbase.getEntry(j)) + (xpt.getEntry(curNumEvalPlusOne, j));
				d__1 = java.lang.Math.max(d__3, d__4);
				d__2 = upperBound[org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(j)];
				currentBest.setEntry(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(j), java.lang.Math.min(d__1, d__2));
				if ((xpt.getEntry(curNumEvalPlusOne, j)) == (sl.getEntry(j))) {
					currentBest.setEntry(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(j), lowerBound[org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(j)]);
				}
				if ((xpt.getEntry(curNumEvalPlusOne, j)) == (su.getEntry(j))) {
					currentBest.setEntry(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(j), upperBound[org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(j)]);
				}
			}
			f = computeObjectiveValue(currentBest.getData());
			if (!(isMinimize))
				f = -f;
			
			fval.setEntry(getEvaluations(), f);
			if ((getEvaluations()) == 1) {
				fbeg = f;
				trustRegionCenterInterpolationPointIndex = 1;
			}else
				if (f < (fval.getEntry(trustRegionCenterInterpolationPointIndex))) {
					trustRegionCenterInterpolationPointIndex = getEvaluations();
				}
			
			if ((getEvaluations()) <= ((n << 1) + 1)) {
				if (((getEvaluations()) >= 2) && ((getEvaluations()) <= (n + 1))) {
					gopt.setEntry(nfm, ((f - fbeg) / stepa));
					if (npt < ((getEvaluations()) + n)) {
						bmat.setEntry(1, nfm, ((-(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE)) / stepa));
						bmat.setEntry(getEvaluations(), nfm, ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) / stepa));
						bmat.setEntry((npt + nfm), nfm, ((-(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF)) * rhosq));
					}
				}else
					if ((getEvaluations()) >= (n + 2)) {
						ih = (nfx * (nfx + 1)) / 2;
						temp = (f - fbeg) / stepb;
						diff = stepb - stepa;
						hq.setEntry(ih, (((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.TWO) * (temp - (gopt.getEntry(nfx)))) / diff));
						gopt.setEntry(nfx, ((((gopt.getEntry(nfx)) * stepb) - (temp * stepa)) / diff));
						if ((stepa * stepb) < (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
							if (f < (fval.getEntry(((getEvaluations()) - n)))) {
								fval.setEntry(getEvaluations(), fval.getEntry(((getEvaluations()) - n)));
								fval.setEntry(((getEvaluations()) - n), f);
								if ((trustRegionCenterInterpolationPointIndex) == (getEvaluations())) {
									trustRegionCenterInterpolationPointIndex = (getEvaluations()) - n;
								}
								xpt.setEntry(((getEvaluations()) - n), nfx, stepb);
								xpt.setEntry(getEvaluations(), nfx, stepa);
							}
						}
						bmat.setEntry(1, nfx, ((-(stepa + stepb)) / (stepa * stepb)));
						bmat.setEntry(getEvaluations(), nfx, ((-(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF)) / (xpt.getEntry(((getEvaluations()) - n), nfx))));
						bmat.setEntry(((getEvaluations()) - n), nfx, ((-(bmat.getEntry(1, nfx))) - (bmat.getEntry(getEvaluations(), nfx))));
						zmat.setEntry(1, nfx, ((java.lang.Math.sqrt(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.TWO)) / (stepa * stepb)));
						zmat.setEntry(getEvaluations(), nfx, ((java.lang.Math.sqrt(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF)) / rhosq));
						zmat.setEntry(((getEvaluations()) - n), nfx, ((-(zmat.getEntry(1, nfx))) - (zmat.getEntry(getEvaluations(), nfx))));
					}
				
			}else {
				ih = ((ipt * (ipt - 1)) / 2) + jpt;
				zmat.setEntry(1, nfx, recip);
				zmat.setEntry(getEvaluations(), nfx, recip);
				zmat.setEntry((ipt + 1), nfx, (-recip));
				zmat.setEntry((jpt + 1), nfx, (-recip));
				temp = (xpt.getEntry(getEvaluations(), ipt)) * (xpt.getEntry(getEvaluations(), jpt));
				hq.setEntry(ih, ((((fbeg - (fval.getEntry((ipt + 1)))) - (fval.getEntry((jpt + 1)))) + f) / temp));
			}
		} while ((getEvaluations()) < npt );
	}

	private void rescue(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray xbase, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix xpt, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray fval, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray xopt, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray gopt, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray hq, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray pq, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix bmat, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix zmat, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray sl, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray su, double delta, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray vlag) {
		final int n = currentBest.getDimension();
		final int npt = numberOfInterpolationPoints;
		final int ndim = bmat.getRowDimension();
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix ptsaux = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix(n, 2);
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray ptsid = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(npt);
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray work1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(npt);
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray work2 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(n);
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray work3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray(npt);
		final int np = n + 1;
		final double sfrac = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) / ((double) (np));
		final int nptm = npt - np;
		double d__1;
		double d__2;
		double d__3;
		double d__4;
		double f;
		int ih;
		int jp;
		int ip;
		int iq;
		double xp = 0;
		double xq = 0;
		double den = 0;
		int ihp = 0;
		int jpn;
		int kpt;
		double sum = 0;
		double diff = 0;
		double beta = 0;
		int kold;
		double winc;
		int nrem;
		int knew;
		double temp;
		double bsum;
		double hdiag = 0;
		double fbase = 0;
		double denom = 0;
		double vquad = 0;
		double sumpq = 0;
		double dsqmin;
		double distsq;
		double vlmxsq;
		sumpq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
		winc = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
		for (int k = 1; k <= npt; k++) {
			distsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
			for (int j = 1; j <= n; j++) {
				xpt.setEntry(k, j, ((xpt.getEntry(k, j)) - (xopt.getEntry(j))));
				final double d1 = xpt.getEntry(k, j);
				distsq += d1 * d1;
			}
			sumpq += pq.getEntry(k);
			work3.setEntry(k, distsq);
			winc = java.lang.Math.max(winc, distsq);
			for (int j = 1; j <= nptm; j++) {
				zmat.setEntry(k, j, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
			}
		}
		ih = 0;
		for (int j = 1; j <= n; j++) {
			work2.setEntry(j, (((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * sumpq) * (xopt.getEntry(j))));
			for (int k = 1; k <= npt; k++) {
				work2.setEntry(j, ((work2.getEntry(j)) + ((pq.getEntry(k)) * (xpt.getEntry(k, j)))));
			}
			for (int i = 1; i <= j; i++) {
				++ih;
				hq.setEntry(ih, (((hq.getEntry(ih)) + ((work2.getEntry(i)) * (xopt.getEntry(j)))) + ((work2.getEntry(j)) * (xopt.getEntry(i)))));
			}
		}
		for (int j = 1; j <= n; j++) {
			xbase.setEntry(j, ((xbase.getEntry(j)) + (xopt.getEntry(j))));
			sl.setEntry(j, ((sl.getEntry(j)) - (xopt.getEntry(j))));
			su.setEntry(j, ((su.getEntry(j)) - (xopt.getEntry(j))));
			xopt.setEntry(j, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
			d__1 = delta;
			d__2 = su.getEntry(j);
			ptsaux.setEntry(j, 1, java.lang.Math.min(d__1, d__2));
			d__1 = -delta;
			d__2 = sl.getEntry(j);
			ptsaux.setEntry(j, 2, java.lang.Math.max(d__1, d__2));
			if (((ptsaux.getEntry(j, 1)) + (ptsaux.getEntry(j, 2))) < (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
				temp = ptsaux.getEntry(j, 1);
				ptsaux.setEntry(j, 1, ptsaux.getEntry(j, 2));
				ptsaux.setEntry(j, 2, temp);
			}
			d__2 = ptsaux.getEntry(j, 2);
			d__1 = ptsaux.getEntry(j, 1);
			if ((java.lang.Math.abs(d__2)) < ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * (java.lang.Math.abs(d__1)))) {
				ptsaux.setEntry(j, 2, ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * (ptsaux.getEntry(j, 1))));
			}
			for (int i = 1; i <= ndim; i++) {
				bmat.setEntry(i, j, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
			}
		}
		fbase = fval.getEntry(trustRegionCenterInterpolationPointIndex);
		ptsid.setEntry(1, sfrac);
		for (int j = 1; j <= n; j++) {
			jp = j + 1;
			jpn = jp + n;
			ptsid.setEntry(jp, (((double) (j)) + sfrac));
			if (jpn <= npt) {
				ptsid.setEntry(jpn, ((((double) (j)) / ((double) (np))) + sfrac));
				temp = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) / ((ptsaux.getEntry(j, 1)) - (ptsaux.getEntry(j, 2)));
				bmat.setEntry(jp, j, ((-temp) + ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) / (ptsaux.getEntry(j, 1)))));
				bmat.setEntry(jpn, j, (temp + ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) / (ptsaux.getEntry(j, 2)))));
				bmat.setEntry(1, j, ((-(bmat.getEntry(jp, j))) - (bmat.getEntry(jpn, j))));
				final double d1 = (ptsaux.getEntry(j, 1)) * (ptsaux.getEntry(j, 2));
				zmat.setEntry(1, j, ((java.lang.Math.sqrt(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.TWO)) / (java.lang.Math.abs(d1))));
				zmat.setEntry(jp, j, (((zmat.getEntry(1, j)) * (ptsaux.getEntry(j, 2))) * temp));
				zmat.setEntry(jpn, j, (((-(zmat.getEntry(1, j))) * (ptsaux.getEntry(j, 1))) * temp));
			}else {
				bmat.setEntry(1, j, ((-(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE)) / (ptsaux.getEntry(j, 1))));
				bmat.setEntry(jp, j, ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) / (ptsaux.getEntry(j, 1))));
				final double d1 = ptsaux.getEntry(j, 1);
				bmat.setEntry((j + npt), j, ((-(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF)) * (d1 * d1)));
			}
		}
		if (npt >= (n + np)) {
			for (int k = np << 1; k <= npt; k++) {
				int iw = ((int) ((((double) (k - np)) - (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF)) / ((double) (n))));
				ip = (k - np) - (iw * n);
				iq = ip + iw;
				if (iq > n) {
					iq -= n;
				}
				ptsid.setEntry(k, ((((double) (ip)) + (((double) (iq)) / ((double) (np)))) + sfrac));
				temp = (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE) / ((ptsaux.getEntry(ip, 1)) * (ptsaux.getEntry(iq, 1)));
				zmat.setEntry(1, (k - np), temp);
				zmat.setEntry((ip + 1), (k - np), (-temp));
				zmat.setEntry((iq + 1), (k - np), (-temp));
				zmat.setEntry(k, (k - np), temp);
			}
		}
		nrem = npt;
		kold = 1;
		knew = trustRegionCenterInterpolationPointIndex;
		int state = 80;
		for (; ;)
			switch (state) {
				case 80 :
					{
						for (int j = 1; j <= n; j++) {
							temp = bmat.getEntry(kold, j);
							bmat.setEntry(kold, j, bmat.getEntry(knew, j));
							bmat.setEntry(knew, j, temp);
						}
						for (int j = 1; j <= nptm; j++) {
							temp = zmat.getEntry(kold, j);
							zmat.setEntry(kold, j, zmat.getEntry(knew, j));
							zmat.setEntry(knew, j, temp);
						}
						ptsid.setEntry(kold, ptsid.getEntry(knew));
						ptsid.setEntry(knew, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
						work3.setEntry(knew, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
						--nrem;
						if (knew != (trustRegionCenterInterpolationPointIndex)) {
							temp = vlag.getEntry(kold);
							vlag.setEntry(kold, vlag.getEntry(knew));
							vlag.setEntry(knew, temp);
							update(bmat, zmat, vlag, beta, denom, knew);
							if (nrem == 0) {
								return ;
							}
							for (int k = 1; k <= npt; k++) {
								work3.setEntry(k, java.lang.Math.abs(work3.getEntry(k)));
							}
						}
					}
				case 120 :
					{
						dsqmin = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						for (int k = 1; k <= npt; k++) {
							final double v1 = work3.getEntry(k);
							if (v1 > (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
								if ((dsqmin == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) || (v1 < dsqmin)) {
									knew = k;
									dsqmin = v1;
								}
							}
						}
						if (dsqmin == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
							state = 260;
							break;
						}
						for (int j = 1; j <= n; j++) {
							work2.setEntry(j, xpt.getEntry(knew, j));
						}
						for (int k = 1; k <= npt; k++) {
							sum = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							if (k == (trustRegionCenterInterpolationPointIndex)) {
							}else
								if ((ptsid.getEntry(k)) == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
									for (int j = 1; j <= n; j++) {
										sum += (work2.getEntry(j)) * (xpt.getEntry(k, j));
									}
								}else {
									ip = ((int) (ptsid.getEntry(k)));
									if (ip > 0) {
										sum = (work2.getEntry(ip)) * (ptsaux.getEntry(ip, 1));
									}
									iq = ((int) ((((double) (np)) * (ptsid.getEntry(k))) - ((double) (ip * np))));
									if (iq > 0) {
										int iw = 1;
										if (ip == 0) {
											iw = 2;
										}
										sum += (work2.getEntry(iq)) * (ptsaux.getEntry(iq, iw));
									}
								}
							
							work1.setEntry(k, (((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * sum) * sum));
						}
						for (int k = 1; k <= npt; k++) {
							sum = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int j = 1; j <= n; j++) {
								sum += (bmat.getEntry(k, j)) * (work2.getEntry(j));
							}
							vlag.setEntry(k, sum);
						}
						beta = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						for (int j = 1; j <= nptm; j++) {
							sum = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int k = 1; k <= npt; k++) {
								sum += (zmat.getEntry(k, j)) * (work1.getEntry(k));
							}
							beta -= sum * sum;
							for (int k = 1; k <= npt; k++) {
								vlag.setEntry(k, ((vlag.getEntry(k)) + (sum * (zmat.getEntry(k, j)))));
							}
						}
						bsum = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						distsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						for (int j = 1; j <= n; j++) {
							sum = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int k = 1; k <= npt; k++) {
								sum += (bmat.getEntry(k, j)) * (work1.getEntry(k));
							}
							jp = j + npt;
							bsum += sum * (work2.getEntry(j));
							for (int k = 1; k <= n; k++) {
								sum += (bmat.getEntry((npt + k), j)) * (work2.getEntry(k));
							}
							bsum += sum * (work2.getEntry(j));
							vlag.setEntry(jp, sum);
							final double d1 = xpt.getEntry(knew, j);
							distsq += d1 * d1;
						}
						beta = ((((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * distsq) * distsq) + beta) - bsum;
						vlag.setEntry(trustRegionCenterInterpolationPointIndex, ((vlag.getEntry(trustRegionCenterInterpolationPointIndex)) + (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE)));
						denom = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						vlmxsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						for (int k = 1; k <= npt; k++) {
							if ((ptsid.getEntry(k)) != (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
								hdiag = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
								for (int j = 1; j <= nptm; j++) {
									final double d1 = zmat.getEntry(k, j);
									hdiag += d1 * d1;
								}
								final double d1 = vlag.getEntry(k);
								den = (beta * hdiag) + (d1 * d1);
								if (den > denom) {
									kold = k;
									denom = den;
								}
							}
							final double d3 = vlag.getEntry(k);
							vlmxsq = java.lang.Math.max(vlmxsq, (d3 * d3));
						}
						if (denom <= (vlmxsq * 0.01)) {
							work3.setEntry(knew, ((-(work3.getEntry(knew))) - winc));
							state = 120;
							break;
						}
						state = 80;
						break;
					}
				case 260 :
					{
						for (kpt = 1; kpt <= npt; kpt++) {
							if ((ptsid.getEntry(kpt)) == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
								continue;
							}
							ih = 0;
							for (int j = 1; j <= n; j++) {
								work2.setEntry(j, xpt.getEntry(kpt, j));
								xpt.setEntry(kpt, j, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
								temp = (pq.getEntry(kpt)) * (work2.getEntry(j));
								for (int i = 1; i <= j; i++) {
									++ih;
									hq.setEntry(ih, ((hq.getEntry(ih)) + (temp * (work2.getEntry(i)))));
								}
							}
							pq.setEntry(kpt, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
							ip = ((int) (ptsid.getEntry(kpt)));
							iq = ((int) ((((double) (np)) * (ptsid.getEntry(kpt))) - ((double) (ip * np))));
							if (ip > 0) {
								xp = ptsaux.getEntry(ip, 1);
								xpt.setEntry(kpt, ip, xp);
							}
							if (iq > 0) {
								xq = ptsaux.getEntry(iq, 1);
								if (ip == 0) {
									xq = ptsaux.getEntry(iq, 2);
								}
								xpt.setEntry(kpt, iq, xq);
							}
							vquad = fbase;
							if (ip > 0) {
								ihp = (ip + (ip * ip)) / 2;
								vquad += xp * ((gopt.getEntry(ip)) + (((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * xp) * (hq.getEntry(ihp))));
							}
							if (iq > 0) {
								int ihq = (iq + (iq * iq)) / 2;
								vquad += xq * ((gopt.getEntry(iq)) + (((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * xq) * (hq.getEntry(ihq))));
								if (ip > 0) {
									int iiw = (java.lang.Math.max(ihp, ihq)) - (java.lang.Math.abs((ip - iq)));
									vquad += (xp * xq) * (hq.getEntry(iiw));
								}
							}
							for (int k = 1; k <= npt; k++) {
								temp = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
								if (ip > 0) {
									temp += xp * (xpt.getEntry(k, ip));
								}
								if (iq > 0) {
									temp += xq * (xpt.getEntry(k, iq));
								}
								vquad += (((org.apache.commons.math.optimization.direct.BOBYQAOptimizer.HALF) * (pq.getEntry(k))) * temp) * temp;
							}
							for (int i = 1; i <= n; i++) {
								d__3 = lowerBound[org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(i)];
								d__4 = (xbase.getEntry(i)) + (xpt.getEntry(kpt, i));
								d__1 = java.lang.Math.max(d__3, d__4);
								d__2 = upperBound[org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(i)];
								work2.setEntry(i, java.lang.Math.min(d__1, d__2));
								if ((xpt.getEntry(kpt, i)) == (sl.getEntry(i))) {
									work2.setEntry(i, lowerBound[org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(i)]);
								}
								if ((xpt.getEntry(kpt, i)) == (su.getEntry(i))) {
									work2.setEntry(i, upperBound[org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(i)]);
								}
							}
							f = computeObjectiveValue(work2.getData());
							if (!(isMinimize))
								f = -f;
							
							fval.setEntry(kpt, f);
							if (f < (fval.getEntry(trustRegionCenterInterpolationPointIndex))) {
								trustRegionCenterInterpolationPointIndex = kpt;
							}
							diff = f - vquad;
							for (int i = 1; i <= n; i++) {
								gopt.setEntry(i, ((gopt.getEntry(i)) + (diff * (bmat.getEntry(kpt, i)))));
							}
							for (int k = 1; k <= npt; k++) {
								sum = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
								for (int j = 1; j <= nptm; j++) {
									sum += (zmat.getEntry(k, j)) * (zmat.getEntry(kpt, j));
								}
								temp = diff * sum;
								if ((ptsid.getEntry(k)) == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
									pq.setEntry(k, ((pq.getEntry(k)) + temp));
								}else {
									ip = ((int) (ptsid.getEntry(k)));
									iq = ((int) ((((double) (np)) * (ptsid.getEntry(k))) - ((double) (ip * np))));
									int ihq = ((iq * iq) + iq) / 2;
									if (ip == 0) {
										final double d1 = ptsaux.getEntry(iq, 2);
										hq.setEntry(ihq, ((hq.getEntry(ihq)) + (temp * (d1 * d1))));
									}else {
										ihp = ((ip * ip) + ip) / 2;
										final double d1 = ptsaux.getEntry(ip, 1);
										hq.setEntry(ihp, ((hq.getEntry(ihp)) + (temp * (d1 * d1))));
										if (iq > 0) {
											final double d2 = ptsaux.getEntry(iq, 1);
											hq.setEntry(ihq, ((hq.getEntry(ihq)) + (temp * (d2 * d2))));
											int iw = (java.lang.Math.max(ihp, ihq)) - (java.lang.Math.abs((iq - ip)));
											hq.setEntry(iw, ((hq.getEntry(iw)) + ((temp * (ptsaux.getEntry(ip, 1))) * (ptsaux.getEntry(iq, 1)))));
										}
									}
								}
							}
							ptsid.setEntry(kpt, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
						}
						return ;
					}
			}
		
	}

	private double[] trsbox(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix xpt, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray xopt, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray gopt, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray hq, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray pq, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray sl, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray su, double delta, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray xnew, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray d__, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray gnew, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray xbdi, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray s, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray hs, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray hred) {
		final int n = currentBest.getDimension();
		final int npt = numberOfInterpolationPoints;
		double dsq = java.lang.Double.NaN;
		double crvmin = java.lang.Double.NaN;
		double d__1;
		double d__2;
		double d__3;
		double d__4;
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
		int iact = 0;
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
		for (int i = 1; i <= n; i++) {
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
		for (; ;)
			switch (state) {
				case 20 :
					{
						beta = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
					}
				case 30 :
					{
						stepsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						for (int i = 1; i <= n; i++) {
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
						for (int i = 1; i <= n; i++) {
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
						iact = 0;
						for (int i = 1; i <= n; i++) {
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
							if ((iact == 0) && (temp > (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO))) {
								crvmin = java.lang.Math.min(crvmin, temp);
								if (crvmin == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.MINUS_ONE)) {
									crvmin = temp;
								}
							}
							ggsav = gredsq;
							gredsq = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
							for (int i = 1; i <= n; i++) {
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
						if (iact > 0) {
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
						for (int i = 1; i <= n; i++) {
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
						for (int i = 1; i <= n; i++) {
							if ((xbdi.getEntry(i)) == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
								s.setEntry(i, (((dredg * (d__.getEntry(i))) - (dredsq * (gnew.getEntry(i)))) / temp));
							}else {
								s.setEntry(i, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
							}
						}
						sredg = -temp;
						angbd = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE;
						iact = 0;
						for (int i = 1; i <= n; i++) {
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
						for (int i = 1; i <= n; i++) {
							if ((xbdi.getEntry(i)) == (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
								shs += (s.getEntry(i)) * (hs.getEntry(i));
								dhs += (d__.getEntry(i)) * (hs.getEntry(i));
								dhd += (d__.getEntry(i)) * (hred.getEntry(i));
							}
						}
						redmax = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						isav = 0;
						redsav = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
						iu = ((int) ((angbd * 17.0) + 3.1));
						for (int i = 1; i <= iu; i++) {
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
						if (isav == 0) {
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
						for (int i = 1; i <= n; i++) {
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
						if ((iact > 0) && (isav == iu)) {
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
						for (int i = 1; i <= n; i++) {
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
						for (int j = 1; j <= n; j++) {
							hs.setEntry(j, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
							for (int i = 1; i <= j; i++) {
								++ih;
								if (i < j) {
									hs.setEntry(j, ((hs.getEntry(j)) + ((hq.getEntry(ih)) * (s.getEntry(i)))));
								}
								hs.setEntry(i, ((hs.getEntry(i)) + ((hq.getEntry(ih)) * (s.getEntry(j)))));
							}
						}
						for (int k = 1; k <= npt; k++) {
							if ((pq.getEntry(k)) != (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO)) {
								temp = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
								for (int j = 1; j <= n; j++) {
									temp += (xpt.getEntry(k, j)) * (s.getEntry(j));
								}
								temp *= pq.getEntry(k);
								for (int i = 1; i <= n; i++) {
									hs.setEntry(i, ((hs.getEntry(i)) + (temp * (xpt.getEntry(k, i)))));
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
						for (int i = 1; i <= n; i++) {
							hred.setEntry(i, hs.getEntry(i));
						}
						state = 120;
						break;
					}
			}
		
	}

	private void update(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix bmat, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix zmat, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray vlag, double beta, double denom, int knew) {
		final int n = currentBest.getDimension();
		final int npt = numberOfInterpolationPoints;
		final int nptm = (npt - n) - 1;
		final org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray work = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray((npt + n));
		double d__1;
		double d__2;
		double d__3;
		int jp;
		double tau;
		double temp;
		double alpha;
		double tempa;
		double tempb;
		double ztest;
		ztest = org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO;
		for (int k = 1; k <= npt; k++) {
			for (int j = 1; j <= nptm; j++) {
				ztest = java.lang.Math.max(ztest, java.lang.Math.abs(zmat.getEntry(k, j)));
			}
		}
		ztest *= 1.0E-20;
		for (int j = 2; j <= nptm; j++) {
			d__1 = zmat.getEntry(knew, j);
			if ((java.lang.Math.abs(d__1)) > ztest) {
				d__1 = zmat.getEntry(knew, 1);
				d__2 = zmat.getEntry(knew, j);
				temp = java.lang.Math.sqrt(((d__1 * d__1) + (d__2 * d__2)));
				tempa = (zmat.getEntry(knew, 1)) / temp;
				tempb = (zmat.getEntry(knew, j)) / temp;
				for (int i = 1; i <= npt; i++) {
					temp = (tempa * (zmat.getEntry(i, 1))) + (tempb * (zmat.getEntry(i, j)));
					zmat.setEntry(i, j, ((tempa * (zmat.getEntry(i, j))) - (tempb * (zmat.getEntry(i, 1)))));
					zmat.setEntry(i, 1, temp);
				}
			}
			zmat.setEntry(knew, j, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ZERO);
		}
		for (int i = 1; i <= npt; i++) {
			work.setEntry(i, ((zmat.getEntry(knew, 1)) * (zmat.getEntry(i, 1))));
		}
		alpha = work.getEntry(knew);
		tau = vlag.getEntry(knew);
		vlag.setEntry(knew, ((vlag.getEntry(knew)) - (org.apache.commons.math.optimization.direct.BOBYQAOptimizer.ONE)));
		temp = java.lang.Math.sqrt(denom);
		tempb = (zmat.getEntry(knew, 1)) / temp;
		tempa = tau / temp;
		for (int i = 1; i <= npt; i++) {
			zmat.setEntry(i, 1, ((tempa * (zmat.getEntry(i, 1))) - (tempb * (vlag.getEntry(i)))));
		}
		for (int j = 1; j <= n; j++) {
			jp = npt + j;
			work.setEntry(jp, bmat.getEntry(knew, j));
			tempa = ((alpha * (vlag.getEntry(jp))) - (tau * (work.getEntry(jp)))) / denom;
			tempb = (((-beta) * (work.getEntry(jp))) - (tau * (vlag.getEntry(jp)))) / denom;
			for (int i = 1; i <= jp; i++) {
				bmat.setEntry(i, j, (((bmat.getEntry(i, j)) + (tempa * (vlag.getEntry(i)))) + (tempb * (work.getEntry(i)))));
				if (i > npt) {
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

	private static class FortranArray extends org.apache.commons.math.linear.ArrayRealVector {
		public FortranArray(int size) {
			super(size);
		}

		public FortranArray(org.apache.commons.math.linear.ArrayRealVector data) {
			super(data, false);
		}

		public double getEntry(int index) {
			return super.getEntry((index - 1));
		}

		public void setEntry(int index, double value) {
			super.setEntry((index - 1), value);
		}
	}

	private static class FortranMatrix extends org.apache.commons.math.linear.Array2DRowRealMatrix {
		public FortranMatrix(int row, int column) {
			super(row, column);
		}

		public double getEntry(int row, int col) {
			return super.getEntry((row - 1), (col - 1));
		}

		public void setEntry(int row, int col, double value) {
			super.setEntry((row - 1), (col - 1), value);
		}
	}

	private static double[] fillNewArray(int n, double value) {
		double[] ds = new double[n];
		java.util.Arrays.fill(ds, value);
		return ds;
	}

	private static int f2jai(int j) {
		return j - 1;
	}
}


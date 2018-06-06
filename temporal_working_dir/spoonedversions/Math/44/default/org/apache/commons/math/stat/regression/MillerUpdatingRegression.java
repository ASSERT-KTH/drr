

package org.apache.commons.math.stat.regression;


public class MillerUpdatingRegression implements org.apache.commons.math.stat.regression.UpdatingMultipleLinearRegression {
	private final int nvars;

	private final double[] d;

	private final double[] rhs;

	private final double[] r;

	private final double[] tol;

	private final double[] rss;

	private final int[] vorder;

	private final double[] work_tolset;

	private long nobs = 0;

	private double sserr = 0.0;

	private boolean rss_set = false;

	private boolean tol_set = false;

	private final boolean[] lindep;

	private final double[] x_sing;

	private final double[] work_sing;

	private double sumy = 0.0;

	private double sumsqy = 0.0;

	private boolean hasIntercept;

	private final double epsilon;

	@java.lang.SuppressWarnings(value = "unused")
	private MillerUpdatingRegression() {
		this.d = null;
		org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.hasIntercept = false;
		this.lindep = null;
		org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nobs = -1;
		this.nvars = -1;
		this.r = null;
		this.rhs = null;
		this.rss = null;
		org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.rss_set = false;
		org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.sserr = java.lang.Double.NaN;
		org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.sumsqy = java.lang.Double.NaN;
		org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.sumy = java.lang.Double.NaN;
		this.tol = null;
		org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.tol_set = false;
		this.vorder = null;
		this.work_sing = null;
		this.work_tolset = null;
		this.x_sing = null;
		this.epsilon = java.lang.Double.NaN;
	}

	public MillerUpdatingRegression(int numberOfVariables, boolean includeConstant, double errorTolerance) {
		if (numberOfVariables < 1) {
			throw new org.apache.commons.math.stat.regression.ModelSpecificationException(org.apache.commons.math.exception.util.LocalizedFormats.NO_REGRESSORS);
		}
		if (includeConstant) {
			this.nvars = numberOfVariables + 1;
		}else {
			this.nvars = numberOfVariables;
		}
		org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.hasIntercept = includeConstant;
		org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nobs = 0;
		this.d = new double[org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars];
		this.rhs = new double[org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars];
		this.r = new double[((org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars) * ((org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars) - 1)) / 2];
		this.tol = new double[org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars];
		this.rss = new double[org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars];
		this.vorder = new int[org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars];
		this.x_sing = new double[org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars];
		this.work_sing = new double[org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars];
		this.work_tolset = new double[org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars];
		this.lindep = new boolean[org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars];
		for (int i = 0; i < (org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars); i++) {
			vorder[i] = i;
		}
		if (errorTolerance > 0) {
			this.epsilon = errorTolerance;
		}else {
			this.epsilon = -errorTolerance;
		}
		return ;
	}

	public MillerUpdatingRegression(int numberOfVariables, boolean includeConstant) {
		this(numberOfVariables, includeConstant, org.apache.commons.math.util.MathUtils.EPSILON);
	}

	public boolean hasIntercept() {
		return org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.hasIntercept;
	}

	public long getN() {
		return org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nobs;
	}

	public void addObservation(final double[] x, final double y) {
		if (((!(org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.hasIntercept)) && ((x.length) != (nvars))) || ((org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.hasIntercept) && (((x.length) + 1) != (nvars)))) {
			throw new org.apache.commons.math.stat.regression.ModelSpecificationException(org.apache.commons.math.exception.util.LocalizedFormats.INVALID_REGRESSION_OBSERVATION, x.length, nvars);
		}
		if (!(org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.hasIntercept)) {
			include(org.apache.commons.math.util.MathArrays.copyOf(x, x.length), 1.0, y);
		}else {
			double[] tmp = new double[(x.length) + 1];
			java.lang.System.arraycopy(x, 0, tmp, 1, x.length);
			tmp[0] = 1.0;
			include(tmp, 1.0, y);
		}
		++(nobs);
		return ;
	}

	public void addObservations(double[][] x, double[] y) {
		if (((x == null) || (y == null)) || ((x.length) != (y.length))) {
			throw new org.apache.commons.math.stat.regression.ModelSpecificationException(org.apache.commons.math.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_SIMPLE, (x == null ? 0 : x.length), (y == null ? 0 : y.length));
		}
		if ((x.length) == 0) {
			throw new org.apache.commons.math.stat.regression.ModelSpecificationException(org.apache.commons.math.exception.util.LocalizedFormats.NO_DATA);
		}
		if (((x[0].length) + 1) > (x.length)) {
			throw new org.apache.commons.math.stat.regression.ModelSpecificationException(org.apache.commons.math.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS, x.length, x[0].length);
		}
		for (int i = 0; i < (x.length); i++) {
			org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.addObservation(x[i], y[i]);
		}
		return ;
	}

	private void include(final double[] x, final double wi, final double yi) {
		int nextr = 0;
		double w = wi;
		double y = yi;
		double xi;
		double di;
		double wxi;
		double dpi;
		double xk;
		double _w;
		org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.rss_set = false;
		sumy = smartAdd(yi, sumy);
		sumsqy = smartAdd(sumsqy, (yi * yi));
		for (int i = 0; i < (x.length); i++) {
			if (w == 0.0) {
				return ;
			}
			xi = x[i];
			if (xi == 0.0) {
				nextr += ((nvars) - i) - 1;
				continue;
			}
			di = d[i];
			wxi = w * xi;
			_w = w;
			if (di != 0.0) {
				dpi = smartAdd(di, (wxi * xi));
				double tmp = (wxi * xi) / di;
				if ((org.apache.commons.math.util.FastMath.abs(tmp)) > (org.apache.commons.math.util.MathUtils.EPSILON)) {
					w = (di * w) / dpi;
				}
			}else {
				dpi = wxi * xi;
				w = 0.0;
			}
			d[i] = dpi;
			for (int k = i + 1; k < (nvars); k++) {
				xk = x[k];
				x[k] = smartAdd(xk, ((-xi) * (r[nextr])));
				if (di != 0.0) {
					r[nextr] = (smartAdd((di * (r[nextr])), ((_w * xi) * xk))) / dpi;
				}else {
					r[nextr] = xk / xi;
				}
				++nextr;
			}
			xk = y;
			y = smartAdd(xk, ((-xi) * (rhs[i])));
			if (di != 0.0) {
				rhs[i] = (smartAdd((di * (rhs[i])), (wxi * xk))) / dpi;
			}else {
				rhs[i] = xk / xi;
			}
		}
		sserr = smartAdd(sserr, ((w * y) * y));
		return ;
	}

	private double smartAdd(double a, double b) {
		double _a = org.apache.commons.math.util.FastMath.abs(a);
		double _b = org.apache.commons.math.util.FastMath.abs(b);
		if (_a > _b) {
			double eps = _a * (org.apache.commons.math.util.MathUtils.EPSILON);
			if (_b > eps) {
				return a + b;
			}
			return a;
		}else {
			double eps = _b * (org.apache.commons.math.util.MathUtils.EPSILON);
			if (_a > eps) {
				return a + b;
			}
			return b;
		}
	}

	public void clear() {
		java.util.Arrays.fill(org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.d, 0.0);
		java.util.Arrays.fill(org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.rhs, 0.0);
		java.util.Arrays.fill(org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.r, 0.0);
		java.util.Arrays.fill(org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.tol, 0.0);
		java.util.Arrays.fill(org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.rss, 0.0);
		java.util.Arrays.fill(org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.work_tolset, 0.0);
		java.util.Arrays.fill(org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.work_sing, 0.0);
		java.util.Arrays.fill(org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.x_sing, 0.0);
		java.util.Arrays.fill(org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.lindep, false);
		for (int i = 0; i < (nvars); i++) {
			org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.vorder[i] = i;
		}
		org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nobs = 0;
		org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.sserr = 0.0;
		org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.sumy = 0.0;
		org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.sumsqy = 0.0;
		org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.rss_set = false;
		org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.tol_set = false;
		return ;
	}

	private void tolset() {
		int pos;
		double total;
		final double eps = org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.epsilon;
		for (int i = 0; i < (nvars); i++) {
			org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.work_tolset[i] = java.lang.Math.sqrt(d[i]);
		}
		tol[0] = eps * (org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.work_tolset[0]);
		for (int col = 1; col < (nvars); col++) {
			pos = col - 1;
			total = work_tolset[col];
			for (int row = 0; row < col; row++) {
				total += (java.lang.Math.abs(r[pos])) * (work_tolset[row]);
				pos += ((nvars) - row) - 2;
			}
			tol[col] = eps * total;
		}
		tol_set = true;
		return ;
	}

	private double[] regcf(int nreq) {
		int nextr;
		if (nreq < 1) {
			throw new org.apache.commons.math.stat.regression.ModelSpecificationException(org.apache.commons.math.exception.util.LocalizedFormats.NO_REGRESSORS);
		}
		if (nreq > (org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars)) {
			throw new org.apache.commons.math.stat.regression.ModelSpecificationException(org.apache.commons.math.exception.util.LocalizedFormats.TOO_MANY_REGRESSORS, nreq, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars);
		}
		if (!(org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.tol_set)) {
			tolset();
		}
		double[] ret = new double[nreq];
		boolean rankProblem = false;
		for (int i = nreq - 1; i > (-1); i--) {
			if ((java.lang.Math.sqrt(d[i])) < (tol[i])) {
				ret[i] = 0.0;
				d[i] = 0.0;
				rankProblem = true;
			}else {
				ret[i] = rhs[i];
				nextr = (i * ((((nvars) + (nvars)) - i) - 1)) / 2;
				for (int j = i + 1; j < nreq; j++) {
					ret[i] = smartAdd(ret[i], ((-(r[nextr])) * (ret[j])));
					++nextr;
				}
			}
		}
		if (rankProblem) {
			for (int i = 0; i < nreq; i++) {
				if (org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.lindep[i]) {
					ret[i] = java.lang.Double.NaN;
				}
			}
		}
		return ret;
	}

	private void singcheck() {
		double temp;
		double y;
		double weight;
		int pos;
		for (int i = 0; i < (nvars); i++) {
			work_sing[i] = java.lang.Math.sqrt(d[i]);
		}
		for (int col = 0; col < (nvars); col++) {
			temp = tol[col];
			pos = col - 1;
			for (int row = 0; row < (col - 1); row++) {
				if (((java.lang.Math.abs(r[pos])) * (work_sing[row])) < temp) {
					r[pos] = 0.0;
				}
				pos += ((nvars) - row) - 2;
			}
			lindep[col] = false;
			if ((work_sing[col]) < temp) {
				lindep[col] = true;
				if (col < ((nvars) - 1)) {
					java.util.Arrays.fill(x_sing, 0.0);
					int _pi = (col * ((((nvars) + (nvars)) - col) - 1)) / 2;
					for (int _xi = col + 1; _xi < (nvars); _xi++ , _pi++) {
						x_sing[_xi] = r[_pi];
						r[_pi] = 0.0;
					}
					y = rhs[col];
					weight = d[col];
					d[col] = 0.0;
					rhs[col] = 0.0;
					org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.include(x_sing, weight, y);
				}else {
					sserr += ((d[col]) * (rhs[col])) * (rhs[col]);
				}
			}
		}
		return ;
	}

	private void ss() {
		double total = sserr;
		rss[((nvars) - 1)] = sserr;
		for (int i = (nvars) - 1; i > 0; i--) {
			total += ((d[i]) * (rhs[i])) * (rhs[i]);
			rss[(i - 1)] = total;
		}
		rss_set = true;
		return ;
	}

	private double[] cov(int nreq) {
		if ((org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nobs) <= nreq) {
			return null;
		}
		double rnk = 0.0;
		for (int i = 0; i < nreq; i++) {
			if (!(org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.lindep[i])) {
				rnk += 1.0;
			}
		}
		double var = (rss[(nreq - 1)]) / ((nobs) - rnk);
		double[] rinv = new double[(nreq * (nreq - 1)) / 2];
		inverse(rinv, nreq);
		double[] covmat = new double[(nreq * (nreq + 1)) / 2];
		java.util.Arrays.fill(covmat, java.lang.Double.NaN);
		int pos2;
		int pos1;
		int start = 0;
		double total = 0;
		for (int row = 0; row < nreq; row++) {
			pos2 = start;
			if (!(org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.lindep[row])) {
				for (int col = row; col < nreq; col++) {
					if (!(org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.lindep[col])) {
						pos1 = (start + col) - row;
						if (row == col) {
							total = 1.0 / (d[col]);
						}else {
							total = (rinv[(pos1 - 1)]) / (d[col]);
						}
						for (int k = col + 1; k < nreq; k++) {
							if (!(org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.lindep[k])) {
								total += ((rinv[pos1]) * (rinv[pos2])) / (d[k]);
							}
							++pos1;
							++pos2;
						}
						covmat[((((col + 1) * col) / 2) + row)] = total * var;
					}else {
						pos2 += (nreq - col) - 1;
					}
				}
			}
			start += (nreq - row) - 1;
		}
		return covmat;
	}

	private void inverse(double[] rinv, int nreq) {
		int pos = ((nreq * (nreq - 1)) / 2) - 1;
		int pos1 = -1;
		int pos2 = -1;
		double total = 0.0;
		int start;
		java.util.Arrays.fill(rinv, java.lang.Double.NaN);
		for (int row = nreq - 1; row > 0; --row) {
			if (!(org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.lindep[row])) {
				start = ((row - 1) * (((nvars) + (nvars)) - row)) / 2;
				for (int col = nreq; col > row; --col) {
					pos1 = start;
					pos2 = pos;
					total = 0.0;
					for (int k = row; k < (col - 1); k++) {
						pos2 += (nreq - k) - 1;
						if (!(org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.lindep[k])) {
							total += (-(r[pos1])) * (rinv[pos2]);
						}
						++pos1;
					}
					rinv[pos] = total - (r[pos1]);
					--pos;
				}
			}else {
				pos -= nreq - row;
			}
		}
		return ;
	}

	public double[] getPartialCorrelations(int in) {
		double[] output = new double[((((nvars) - in) + 1) * ((nvars) - in)) / 2];
		int base_pos;
		int pos;
		int pos1;
		int pos2;
		int rms_off = -in;
		int wrk_off = -(in + 1);
		double[] rms = new double[(nvars) - in];
		double[] work = new double[((nvars) - in) - 1];
		double sumxx;
		double sumxy;
		double sumyy;
		int offXX = (((nvars) - in) * (((nvars) - in) - 1)) / 2;
		if ((in < (-1)) || (in >= (nvars))) {
			return null;
		}
		int nvm = (nvars) - 1;
		base_pos = (r.length) - (((nvm - in) * ((nvm - in) + 1)) / 2);
		if ((d[in]) > 0.0) {
			rms[(in + rms_off)] = 1.0 / (java.lang.Math.sqrt(d[in]));
		}
		for (int col = in + 1; col < (nvars); col++) {
			pos = ((base_pos + col) - 1) - in;
			sumxx = d[col];
			for (int row = in; row < col; row++) {
				sumxx += ((d[row]) * (r[pos])) * (r[pos]);
				pos += ((nvars) - row) - 2;
			}
			if (sumxx > 0.0) {
				rms[(col + rms_off)] = 1.0 / (java.lang.Math.sqrt(sumxx));
			}else {
				rms[(col + rms_off)] = 0.0;
			}
		}
		sumyy = sserr;
		for (int row = in; row < (nvars); row++) {
			sumyy += ((d[row]) * (rhs[row])) * (rhs[row]);
		}
		if (sumyy > 0.0) {
			sumyy = 1.0 / (java.lang.Math.sqrt(sumyy));
		}
		pos = 0;
		for (int col1 = in; col1 < (nvars); col1++) {
			sumxy = 0.0;
			java.util.Arrays.fill(work, 0.0);
			pos1 = ((base_pos + col1) - in) - 1;
			for (int row = in; row < col1; row++) {
				pos2 = pos1 + 1;
				for (int col2 = col1 + 1; col2 < (nvars); col2++) {
					work[(col2 + wrk_off)] += ((d[row]) * (r[pos1])) * (r[pos2]);
					pos2++;
				}
				sumxy += ((d[row]) * (r[pos1])) * (rhs[row]);
				pos1 += ((nvars) - row) - 2;
			}
			pos2 = pos1 + 1;
			for (int col2 = col1 + 1; col2 < (nvars); col2++) {
				work[(col2 + wrk_off)] += (d[col1]) * (r[pos2]);
				++pos2;
				output[((((((col2 - 1) - in) * (col2 - in)) / 2) + col1) - in)] = ((work[(col2 + wrk_off)]) * (rms[(col1 + rms_off)])) * (rms[(col2 + rms_off)]);
				++pos;
			}
			sumxy += (d[col1]) * (rhs[col1]);
			output[((col1 + rms_off) + offXX)] = (sumxy * (rms[(col1 + rms_off)])) * sumyy;
		}
		return output;
	}

	private void vmove(int from, int to) {
		double d1;
		double d2;
		double X;
		double d1new;
		double d2new;
		double cbar;
		double sbar;
		double Y;
		int first;
		int inc;
		int m1;
		int m2;
		int mp1;
		int pos;
		boolean bSkipTo40 = false;
		if (from == to) {
			return ;
		}
		if (!(org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.rss_set)) {
			ss();
		}
		int count = 0;
		if (from < to) {
			first = from;
			inc = 1;
			count = to - from;
		}else {
			first = from - 1;
			inc = -1;
			count = from - to;
		}
		int m = first;
		int idx = 0;
		while (idx < count) {
			m1 = (m * ((((nvars) + (nvars)) - m) - 1)) / 2;
			m2 = ((m1 + (nvars)) - m) - 1;
			mp1 = m + 1;
			d1 = d[m];
			d2 = d[mp1];
			if ((d1 > (org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.epsilon)) || (d2 > (org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.epsilon))) {
				X = r[m1];
				if (((java.lang.Math.abs(X)) * (java.lang.Math.sqrt(d1))) < (tol[mp1])) {
					X = 0.0;
				}
				if ((d1 < (org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.epsilon)) || ((java.lang.Math.abs(X)) < (org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.epsilon))) {
					d[m] = d2;
					d[mp1] = d1;
					r[m1] = 0.0;
					for (int col = m + 2; col < (nvars); col++) {
						++m1;
						X = r[m1];
						r[m1] = r[m2];
						r[m2] = X;
						++m2;
					}
					X = rhs[m];
					rhs[m] = rhs[mp1];
					rhs[mp1] = X;
					bSkipTo40 = true;
				}else
					if (d2 < (org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.epsilon)) {
						d[m] = (d1 * X) * X;
						r[m1] = 1.0 / X;
						for (int _i = m1 + 1; _i < (((m1 + (nvars)) - m) - 1); _i++) {
							r[_i] /= X;
						}
						rhs[m] = (rhs[m]) / X;
						bSkipTo40 = true;
					}
				
				if (!bSkipTo40) {
					d1new = d2 + ((d1 * X) * X);
					cbar = d2 / d1new;
					sbar = (X * d1) / d1new;
					d2new = d1 * cbar;
					d[m] = d1new;
					d[mp1] = d2new;
					r[m1] = sbar;
					for (int col = m + 2; col < (nvars); col++) {
						++m1;
						Y = r[m1];
						r[m1] = (cbar * (r[m2])) + (sbar * Y);
						r[m2] = Y - (X * (r[m2]));
						++m2;
					}
					Y = rhs[m];
					rhs[m] = (cbar * (rhs[mp1])) + (sbar * Y);
					rhs[mp1] = Y - (X * (rhs[mp1]));
				}
			}
			if (m > 0) {
				pos = m;
				for (int row = 0; row < m; row++) {
					X = r[pos];
					r[pos] = r[(pos - 1)];
					r[(pos - 1)] = X;
					pos += ((nvars) - row) - 2;
				}
			}
			m1 = vorder[m];
			vorder[m] = vorder[mp1];
			vorder[mp1] = m1;
			X = tol[m];
			tol[m] = tol[mp1];
			tol[mp1] = X;
			rss[m] = (rss[mp1]) + (((d[mp1]) * (rhs[mp1])) * (rhs[mp1]));
			m += inc;
			++idx;
		} 
	}

	private int reorderRegressors(int[] list, int pos1) {
		int next;
		int i;
		int l;
		if (((list.length) < 1) || ((list.length) > (((nvars) + 1) - pos1))) {
			return -1;
		}
		next = pos1;
		i = pos1;
		while (i < (nvars)) {
			l = vorder[i];
			for (int j = 0; j < (list.length); j++) {
				if (l == (list[j])) {
					if (i > next) {
						org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.vmove(i, next);
						++next;
						if (next >= ((list.length) + pos1)) {
							return 0;
						}else {
							break;
						}
					}
				}
			}
			++i;
		} 
		return 0;
	}

	public double getDiagonalOfHatMatrix(double[] row_data) {
		double[] wk = new double[org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars];
		int pos;
		double total;
		if ((row_data.length) > (nvars)) {
			return java.lang.Double.NaN;
		}
		double[] xrow;
		if (org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.hasIntercept) {
			xrow = new double[(row_data.length) + 1];
			xrow[0] = 1.0;
			java.lang.System.arraycopy(row_data, 0, xrow, 1, row_data.length);
		}else {
			xrow = row_data;
		}
		double hii = 0.0;
		for (int col = 0; col < (xrow.length); col++) {
			if ((java.lang.Math.sqrt(d[col])) < (tol[col])) {
				wk[col] = 0.0;
			}else {
				pos = col - 1;
				total = xrow[col];
				for (int row = 0; row < col; row++) {
					total = smartAdd(total, ((-(wk[row])) * (r[pos])));
					pos += ((nvars) - row) - 2;
				}
				wk[col] = total;
				hii = smartAdd(hii, ((total * total) / (d[col])));
			}
		}
		return hii;
	}

	public int[] getOrderOfRegressors() {
		return org.apache.commons.math.util.MathArrays.copyOf(vorder);
	}

	public org.apache.commons.math.stat.regression.RegressionResults regress() throws org.apache.commons.math.stat.regression.ModelSpecificationException {
		return regress(org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars);
	}

	public org.apache.commons.math.stat.regression.RegressionResults regress(int numberOfRegressors) throws org.apache.commons.math.stat.regression.ModelSpecificationException {
		if ((org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nobs) <= numberOfRegressors) {
			throw new org.apache.commons.math.stat.regression.ModelSpecificationException(org.apache.commons.math.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nobs, numberOfRegressors);
		}
		if (numberOfRegressors > (org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars)) {
			throw new org.apache.commons.math.stat.regression.ModelSpecificationException(org.apache.commons.math.exception.util.LocalizedFormats.TOO_MANY_REGRESSORS, numberOfRegressors, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars);
		}
		org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.tolset();
		org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.singcheck();
		double[] beta = org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.regcf(numberOfRegressors);
		org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.ss();
		double[] cov = org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.cov(numberOfRegressors);
		int rnk = 0;
		for (int i = 0; i < (org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.lindep.length); i++) {
			if (!(org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.lindep[i])) {
				++rnk;
			}
		}
		boolean needsReorder = false;
		for (int i = 0; i < numberOfRegressors; i++) {
			if ((org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.vorder[i]) != i) {
				needsReorder = true;
				break;
			}
		}
		if (!needsReorder) {
			return new org.apache.commons.math.stat.regression.RegressionResults(beta, new double[][]{ cov }, true, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nobs, rnk, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.sumy, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.sumsqy, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.sserr, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.hasIntercept, false);
		}else {
			double[] betaNew = new double[beta.length];
			double[] covNew = new double[cov.length];
			int[] newIndices = new int[beta.length];
			for (int i = 0; i < (nvars); i++) {
				for (int j = 0; j < numberOfRegressors; j++) {
					if ((org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.vorder[j]) == i) {
						betaNew[i] = beta[j];
						newIndices[i] = j;
					}
				}
			}
			int idx1 = 0;
			int idx2;
			int _i;
			int _j;
			for (int i = 0; i < (beta.length); i++) {
				_i = newIndices[i];
				for (int j = 0; j <= i; j++ , idx1++) {
					_j = newIndices[j];
					if (_i > _j) {
						idx2 = ((_i * (_i + 1)) / 2) + _j;
					}else {
						idx2 = ((_j * (_j + 1)) / 2) + _i;
					}
					covNew[idx1] = cov[idx2];
				}
			}
			return new org.apache.commons.math.stat.regression.RegressionResults(betaNew, new double[][]{ covNew }, true, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nobs, rnk, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.sumy, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.sumsqy, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.sserr, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.hasIntercept, false);
		}
	}

	public org.apache.commons.math.stat.regression.RegressionResults regress(int[] variablesToInclude) throws org.apache.commons.math.stat.regression.ModelSpecificationException {
		if ((variablesToInclude.length) > (org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars)) {
			throw new org.apache.commons.math.stat.regression.ModelSpecificationException(org.apache.commons.math.exception.util.LocalizedFormats.TOO_MANY_REGRESSORS, variablesToInclude.length, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars);
		}
		if ((org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nobs) <= (org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars)) {
			throw new org.apache.commons.math.stat.regression.ModelSpecificationException(org.apache.commons.math.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nobs, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars);
		}
		java.util.Arrays.sort(variablesToInclude);
		int iExclude = 0;
		for (int i = 0; i < (variablesToInclude.length); i++) {
			if (i >= (org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars)) {
				throw new org.apache.commons.math.stat.regression.ModelSpecificationException(org.apache.commons.math.exception.util.LocalizedFormats.INDEX_LARGER_THAN_MAX, i, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars);
			}
			if ((i > 0) && ((variablesToInclude[i]) == (variablesToInclude[(i - 1)]))) {
				variablesToInclude[i] = -1;
				++iExclude;
			}
		}
		int[] series;
		if (iExclude > 0) {
			int j = 0;
			series = new int[(variablesToInclude.length) - iExclude];
			for (int i = 0; i < (variablesToInclude.length); i++) {
				if ((variablesToInclude[i]) > (-1)) {
					series[j] = variablesToInclude[i];
					++j;
				}
			}
		}else {
			series = variablesToInclude;
		}
		org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.reorderRegressors(series, 0);
		org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.tolset();
		org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.singcheck();
		double[] beta = org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.regcf(series.length);
		org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.ss();
		double[] cov = org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.cov(series.length);
		int rnk = 0;
		for (int i = 0; i < (org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.lindep.length); i++) {
			if (!(org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.lindep[i])) {
				++rnk;
			}
		}
		boolean needsReorder = false;
		for (int i = 0; i < (org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nvars); i++) {
			if ((org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.vorder[i]) != (series[i])) {
				needsReorder = true;
				break;
			}
		}
		if (!needsReorder) {
			return new org.apache.commons.math.stat.regression.RegressionResults(beta, new double[][]{ cov }, true, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nobs, rnk, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.sumy, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.sumsqy, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.sserr, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.hasIntercept, false);
		}else {
			double[] betaNew = new double[beta.length];
			int[] newIndices = new int[beta.length];
			for (int i = 0; i < (series.length); i++) {
				for (int j = 0; j < (org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.vorder.length); j++) {
					if ((org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.vorder[j]) == (series[i])) {
						betaNew[i] = beta[j];
						newIndices[i] = j;
					}
				}
			}
			double[] covNew = new double[cov.length];
			int idx1 = 0;
			int idx2;
			int _i;
			int _j;
			for (int i = 0; i < (beta.length); i++) {
				_i = newIndices[i];
				for (int j = 0; j <= i; j++ , idx1++) {
					_j = newIndices[j];
					if (_i > _j) {
						idx2 = ((_i * (_i + 1)) / 2) + _j;
					}else {
						idx2 = ((_j * (_j + 1)) / 2) + _i;
					}
					covNew[idx1] = cov[idx2];
				}
			}
			return new org.apache.commons.math.stat.regression.RegressionResults(betaNew, new double[][]{ covNew }, true, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.nobs, rnk, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.sumy, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.sumsqy, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.sserr, org.apache.commons.math.stat.regression.MillerUpdatingRegression.this.hasIntercept, false);
		}
	}
}


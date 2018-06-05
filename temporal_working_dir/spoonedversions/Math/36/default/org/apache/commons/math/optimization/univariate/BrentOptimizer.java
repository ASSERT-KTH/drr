

package org.apache.commons.math.optimization.univariate;


public class BrentOptimizer extends org.apache.commons.math.optimization.univariate.BaseAbstractUnivariateOptimizer {
	private static final double GOLDEN_SECTION = 0.5 * (3 - (org.apache.commons.math.util.FastMath.sqrt(5)));

	private static final double MIN_RELATIVE_TOLERANCE = 2 * (org.apache.commons.math.util.FastMath.ulp(1.0));

	private final double relativeThreshold;

	private final double absoluteThreshold;

	public BrentOptimizer(double rel, double abs, org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.univariate.UnivariatePointValuePair> checker) {
		super(checker);
		if (rel < (org.apache.commons.math.optimization.univariate.BrentOptimizer.MIN_RELATIVE_TOLERANCE)) {
			throw new org.apache.commons.math.exception.NumberIsTooSmallException(rel, org.apache.commons.math.optimization.univariate.BrentOptimizer.MIN_RELATIVE_TOLERANCE, true);
		}
		if (abs <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(abs);
		}
		relativeThreshold = rel;
		absoluteThreshold = abs;
	}

	public BrentOptimizer(double rel, double abs) {
		this(rel, abs, null);
	}

	@java.lang.Override
	protected org.apache.commons.math.optimization.univariate.UnivariatePointValuePair doOptimize() {
		final boolean isMinim = (getGoalType()) == (org.apache.commons.math.optimization.GoalType.MINIMIZE);
		final double lo = getMin();
		final double mid = getStartValue();
		final double hi = getMax();
		final org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.univariate.UnivariatePointValuePair> checker = getConvergenceChecker();
		double a;
		double b;
		if (lo < hi) {
			a = lo;
			b = hi;
		}else {
			a = hi;
			b = lo;
		}
		double x = mid;
		double v = x;
		double w = x;
		double d = 0;
		double e = 0;
		double fx = computeObjectiveValue(x);
		if (!isMinim) {
			fx = -fx;
		}
		double fv = fx;
		double fw = fx;
		org.apache.commons.math.optimization.univariate.UnivariatePointValuePair previous = null;
		org.apache.commons.math.optimization.univariate.UnivariatePointValuePair current = new org.apache.commons.math.optimization.univariate.UnivariatePointValuePair(x, (isMinim ? fx : -fx));
		int iter = 0;
		while (true) {
			final double m = 0.5 * (a + b);
			final double tol1 = ((relativeThreshold) * (org.apache.commons.math.util.FastMath.abs(x))) + (absoluteThreshold);
			final double tol2 = 2 * tol1;
			final boolean stop = (org.apache.commons.math.util.FastMath.abs((x - m))) <= (tol2 - (0.5 * (b - a)));
			if (!stop) {
				double p = 0;
				double q = 0;
				double r = 0;
				double u = 0;
				if ((org.apache.commons.math.util.FastMath.abs(e)) > tol1) {
					r = (x - w) * (fx - fv);
					q = (x - v) * (fx - fw);
					p = ((x - v) * q) - ((x - w) * r);
					q = 2 * (q - r);
					if (q > 0) {
						p = -p;
					}else {
						q = -q;
					}
					r = e;
					e = d;
					if (((p > (q * (a - x))) && (p < (q * (b - x)))) && ((org.apache.commons.math.util.FastMath.abs(p)) < (org.apache.commons.math.util.FastMath.abs(((0.5 * q) * r))))) {
						d = p / q;
						u = x + d;
						if (((u - a) < tol2) || ((b - u) < tol2)) {
							if (x <= m) {
								d = tol1;
							}else {
								d = -tol1;
							}
						}
					}else {
						if (x < m) {
							e = b - x;
						}else {
							e = a - x;
						}
						d = (org.apache.commons.math.optimization.univariate.BrentOptimizer.GOLDEN_SECTION) * e;
					}
				}else {
					if (x < m) {
						e = b - x;
					}else {
						e = a - x;
					}
					d = (org.apache.commons.math.optimization.univariate.BrentOptimizer.GOLDEN_SECTION) * e;
				}
				if ((org.apache.commons.math.util.FastMath.abs(d)) < tol1) {
					if (d >= 0) {
						u = x + tol1;
					}else {
						u = x - tol1;
					}
				}else {
					u = x + d;
				}
				double fu = computeObjectiveValue(u);
				if (!isMinim) {
					fu = -fu;
				}
				if (fu <= fx) {
					if (u < x) {
						b = x;
					}else {
						a = x;
					}
					v = w;
					fv = fw;
					w = x;
					fw = fx;
					x = u;
					fx = fu;
				}else {
					if (u < x) {
						a = u;
					}else {
						b = u;
					}
					if ((fu <= fw) || (org.apache.commons.math.util.Precision.equals(w, x))) {
						v = w;
						fv = fw;
						w = u;
						fw = fu;
					}else
						if (((fu <= fv) || (org.apache.commons.math.util.Precision.equals(v, x))) || (org.apache.commons.math.util.Precision.equals(v, w))) {
							v = u;
							fv = fu;
						}
					
				}
				previous = current;
				current = new org.apache.commons.math.optimization.univariate.UnivariatePointValuePair(x, (isMinim ? fx : -fx));
				if (checker != null) {
					if (checker.converged(iter, previous, current)) {
						return current;
					}
				}
			}else {
				return current;
			}
			++iter;
		} 
	}
}


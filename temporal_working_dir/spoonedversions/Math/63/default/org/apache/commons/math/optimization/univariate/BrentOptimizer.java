

package org.apache.commons.math.optimization.univariate;


public class BrentOptimizer extends org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer {
	private static final double GOLDEN_SECTION = 0.5 * (3 - (org.apache.commons.math.util.FastMath.sqrt(5)));

	public static class BrentConvergenceChecker extends org.apache.commons.math.optimization.AbstractConvergenceChecker<org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair> {
		private static final double MIN_RELATIVE_TOLERANCE = 2 * (org.apache.commons.math.util.FastMath.ulp(1.0));

		public BrentConvergenceChecker(final double rel, final double abs) {
			super(rel, abs);
			if (rel < (org.apache.commons.math.optimization.univariate.BrentOptimizer.BrentConvergenceChecker.MIN_RELATIVE_TOLERANCE)) {
				throw new org.apache.commons.math.exception.NumberIsTooSmallException(rel, org.apache.commons.math.optimization.univariate.BrentOptimizer.BrentConvergenceChecker.MIN_RELATIVE_TOLERANCE, true);
			}
			if (abs <= 0) {
				throw new org.apache.commons.math.exception.NotStrictlyPositiveException(abs);
			}
		}

		public boolean converged(final int iteration, final org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair... points) {
			if ((points.length) != 3) {
				throw new org.apache.commons.math.exception.DimensionMismatchException(points.length, 3);
			}
			final double a = points[0].getPoint();
			final double x = points[1].getPoint();
			final double b = points[2].getPoint();
			final double tol1 = ((getRelativeThreshold()) * (org.apache.commons.math.util.FastMath.abs(x))) + (getAbsoluteThreshold());
			final double tol2 = 2 * tol1;
			final double m = 0.5 * (a + b);
			return (org.apache.commons.math.util.FastMath.abs((x - m))) <= (tol2 - (0.5 * (b - a)));
		}
	}

	@java.lang.Override
	public void setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair> checker) {
		if (checker instanceof org.apache.commons.math.optimization.univariate.BrentOptimizer.BrentConvergenceChecker) {
			super.setConvergenceChecker(checker);
		}else {
			throw new org.apache.commons.math.exception.MathUnsupportedOperationException();
		}
	}

	protected org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair doOptimize() throws org.apache.commons.math.FunctionEvaluationException {
		final boolean isMinim = (getGoalType()) == (org.apache.commons.math.optimization.GoalType.MINIMIZE);
		final double lo = getMin();
		final double mid = getStartValue();
		final double hi = getMax();
		final org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair> checker = getConvergenceChecker();
		final double eps = checker.getRelativeThreshold();
		final double t = checker.getAbsoluteThreshold();
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
		int iter = 0;
		while (true) {
			double m = 0.5 * (a + b);
			final double tol1 = (eps * (org.apache.commons.math.util.FastMath.abs(x))) + t;
			final double tol2 = 2 * tol1;
			if (!(getConvergenceChecker().converged(iter, new org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair(a, java.lang.Double.NaN), new org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair(x, java.lang.Double.NaN), new org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair(b, java.lang.Double.NaN)))) {
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
					if ((fu <= fw) || (w == x)) {
						v = w;
						fv = fw;
						w = u;
						fw = fu;
					}else
						if (((fu <= fv) || (v == x)) || (v == w)) {
							v = u;
							fv = fu;
						}
					
				}
			}else {
				return new org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair(x, (isMinim ? fx : -fx));
			}
			++iter;
		} 
	}
}


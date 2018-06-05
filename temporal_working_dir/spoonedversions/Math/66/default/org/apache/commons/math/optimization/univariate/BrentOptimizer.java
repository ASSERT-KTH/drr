

package org.apache.commons.math.optimization.univariate;


public class BrentOptimizer extends org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer {
	private static final double GOLDEN_SECTION = 0.5 * (3 - (java.lang.Math.sqrt(5)));

	public BrentOptimizer() {
		setMaxEvaluations(java.lang.Integer.MAX_VALUE);
		setMaximalIterationCount(100);
		setAbsoluteAccuracy(1.0E-10);
		setRelativeAccuracy(1.0E-14);
	}

	protected double doOptimize() throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.MaxIterationsExceededException {
		throw new java.lang.UnsupportedOperationException();
	}

	public double optimize(final org.apache.commons.math.analysis.UnivariateRealFunction f, final org.apache.commons.math.optimization.GoalType goalType, final double min, final double max, final double startValue) throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.MaxIterationsExceededException {
		clearResult();
		return localMin(((getGoalType()) == (org.apache.commons.math.optimization.GoalType.MINIMIZE)), f, goalType, min, startValue, max, getRelativeAccuracy(), getAbsoluteAccuracy());
	}

	public double optimize(final org.apache.commons.math.analysis.UnivariateRealFunction f, final org.apache.commons.math.optimization.GoalType goalType, final double min, final double max) throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.MaxIterationsExceededException {
		return optimize(f, goalType, min, max, (min + ((org.apache.commons.math.optimization.univariate.BrentOptimizer.GOLDEN_SECTION) * (max - min))));
	}

	private double localMin(boolean isMinim, org.apache.commons.math.analysis.UnivariateRealFunction f, org.apache.commons.math.optimization.GoalType goalType, double lo, double mid, double hi, double eps, double t) throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.MaxIterationsExceededException {
		if (eps <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(eps);
		}
		if (t <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(t);
		}
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
		double fx = computeObjectiveValue(f, x);
		if (goalType == (org.apache.commons.math.optimization.GoalType.MAXIMIZE)) {
			fx = -fx;
		}
		double fv = fx;
		double fw = fx;
		int count = 0;
		while (count < (maximalIterationCount)) {
			double m = 0.5 * (a + b);
			final double tol1 = (eps * (java.lang.Math.abs(x))) + t;
			final double tol2 = 2 * tol1;
			if ((java.lang.Math.abs((x - m))) > (tol2 - (0.5 * (b - a)))) {
				double p = 0;
				double q = 0;
				double r = 0;
				double u = 0;
				if ((java.lang.Math.abs(e)) > tol1) {
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
					if (((p > (q * (a - x))) && (p < (q * (b - x)))) && ((java.lang.Math.abs(p)) < (java.lang.Math.abs(((0.5 * q) * r))))) {
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
				if ((java.lang.Math.abs(d)) < tol1) {
					if (d >= 0) {
						u = x + tol1;
					}else {
						u = x - tol1;
					}
				}else {
					u = x + d;
				}
				double fu = computeObjectiveValue(f, u);
				if (goalType == (org.apache.commons.math.optimization.GoalType.MAXIMIZE)) {
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
				setResult(x, (goalType == (org.apache.commons.math.optimization.GoalType.MAXIMIZE) ? -fx : fx), count);
				return x;
			}
			++count;
		} 
		throw new org.apache.commons.math.MaxIterationsExceededException(maximalIterationCount);
	}
}


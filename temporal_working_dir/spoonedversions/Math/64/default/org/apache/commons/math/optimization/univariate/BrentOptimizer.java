

package org.apache.commons.math.optimization.univariate;


public class BrentOptimizer extends org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer {
	private static final double GOLDEN_SECTION = 0.5 * (3 - (java.lang.Math.sqrt(5)));

	public BrentOptimizer() {
		setMaxEvaluations(1000);
		setMaximalIterationCount(100);
		setAbsoluteAccuracy(1.0E-11);
		setRelativeAccuracy(1.0E-9);
	}

	protected double doOptimize() throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.MaxIterationsExceededException {
		return localMin(((getGoalType()) == (org.apache.commons.math.optimization.GoalType.MINIMIZE)), getMin(), getStartValue(), getMax(), getRelativeAccuracy(), getAbsoluteAccuracy());
	}

	private double localMin(boolean isMinim, double lo, double mid, double hi, double eps, double t) throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.MaxIterationsExceededException {
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
		double fx = computeObjectiveValue(x);
		if (!isMinim) {
			fx = -fx;
		}
		double fv = fx;
		double fw = fx;
		while (true) {
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
				setFunctionValue((isMinim ? fx : -fx));
				return x;
			}
			incrementIterationsCounter();
		} 
	}
}


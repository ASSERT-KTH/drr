

package org.apache.commons.math.analysis.minimization;


public class BrentMinimizer extends org.apache.commons.math.analysis.minimization.UnivariateRealMinimizerImpl {
	private static final long serialVersionUID = 7185472920191999565L;

	private static final double c = 0.5 * (3 - (java.lang.Math.sqrt(5)));

	public BrentMinimizer() {
		super(100, 1.0E-10);
	}

	public double minimize(final org.apache.commons.math.analysis.UnivariateRealFunction f, final double min, final double max, final double startValue) throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.MaxIterationsExceededException {
		return minimize(f, min, max);
	}

	public double minimize(final org.apache.commons.math.analysis.UnivariateRealFunction f, final double min, final double max) throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.MaxIterationsExceededException {
		clearResult();
		return localMin(min, max, relativeAccuracy, absoluteAccuracy, f);
	}

	private double localMin(double a, double b, final double eps, final double t, final org.apache.commons.math.analysis.UnivariateRealFunction f) throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.MaxIterationsExceededException {
		double x = a + ((org.apache.commons.math.analysis.minimization.BrentMinimizer.c) * (b - a));
		double v = x;
		double w = x;
		double e = 0;
		double fx = f.value(x);
		double fv = fx;
		double fw = fx;
		int count = 0;
		while (count < (maximalIterationCount)) {
			double m = 0.5 * (a + b);
			double tol = (eps * (java.lang.Math.abs(x))) + t;
			double t2 = 2 * tol;
			if ((java.lang.Math.abs((x - m))) > (t2 - (0.5 * (b - a)))) {
				double p = 0;
				double q = 0;
				double r = 0;
				double d = 0;
				double u = 0;
				if ((java.lang.Math.abs(e)) > tol) {
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
				}
				if ((((java.lang.Math.abs(p)) < (java.lang.Math.abs(((0.5 * q) * r)))) && (p < (q * (a - x)))) && (p < (q * (b - x)))) {
					d = p / q;
					u = x + d;
					if (((u - a) < t2) || ((b - u) < t2)) {
						d = (x < m) ? tol : -tol;
					}
				}else {
					e = (x < m ? b : a) - x;
					d = (org.apache.commons.math.analysis.minimization.BrentMinimizer.c) * e;
				}
				u = x + ((java.lang.Math.abs(d)) > tol ? d : d > 0 ? tol : -tol);
				double fu = f.value(u);
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
				setResult(x, fx, count);
				return x;
			}
			++count;
		} 
		throw new org.apache.commons.math.MaxIterationsExceededException(maximalIterationCount);
	}
}


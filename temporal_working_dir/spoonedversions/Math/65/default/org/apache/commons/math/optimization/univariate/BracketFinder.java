

package org.apache.commons.math.optimization.univariate;


public class BracketFinder {
	private static final double EPS_MIN = 1.0E-21;

	private static final double GOLD = 1.618034;

	private final double growLimit;

	private final int maxIterations;

	private int iterations;

	private int evaluations;

	private double lo;

	private double hi;

	private double mid;

	private double fLo;

	private double fHi;

	private double fMid;

	public BracketFinder() {
		this(100, 50);
	}

	public BracketFinder(double growLimit, int maxIterations) {
		if (growLimit <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(growLimit);
		}
		if (maxIterations <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(maxIterations);
		}
		this.growLimit = growLimit;
		this.maxIterations = maxIterations;
	}

	public void search(org.apache.commons.math.analysis.UnivariateRealFunction func, org.apache.commons.math.optimization.GoalType goal, double xA, double xB) throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.MaxIterationsExceededException {
		reset();
		final boolean isMinim = goal == (org.apache.commons.math.optimization.GoalType.MINIMIZE);
		double fA = eval(func, xA);
		double fB = eval(func, xB);
		if (isMinim ? fA < fB : fA > fB) {
			double tmp = xA;
			xA = xB;
			xB = tmp;
			tmp = fA;
			fA = fB;
			fB = tmp;
		}
		double xC = xB + ((org.apache.commons.math.optimization.univariate.BracketFinder.GOLD) * (xB - xA));
		double fC = eval(func, xC);
		while (isMinim ? fC < fB : fC > fB) {
			if ((++(iterations)) > (maxIterations)) {
				throw new org.apache.commons.math.MaxIterationsExceededException(maxIterations);
			}
			double tmp1 = (xB - xA) * (fB - fC);
			double tmp2 = (xB - xC) * (fB - fA);
			double val = tmp2 - tmp1;
			double denom = (java.lang.Math.abs(val)) < (org.apache.commons.math.optimization.univariate.BracketFinder.EPS_MIN) ? 2 * (org.apache.commons.math.optimization.univariate.BracketFinder.EPS_MIN) : 2 * val;
			double w = xB - ((((xB - xC) * tmp2) - ((xB - xA) * tmp1)) / denom);
			double wLim = xB + ((growLimit) * (xC - xB));
			double fW;
			if (((w - xC) * (xB - w)) > 0) {
				fW = eval(func, w);
				if (isMinim ? fW < fC : fW > fC) {
					xA = xB;
					xB = w;
					fA = fB;
					fB = fW;
					break;
				}else
					if (isMinim ? fW > fB : fW < fB) {
						xC = w;
						fC = fW;
						break;
					}
				
				w = xC + ((org.apache.commons.math.optimization.univariate.BracketFinder.GOLD) * (xC - xB));
				fW = eval(func, w);
			}else
				if (((w - wLim) * (wLim - xC)) >= 0) {
					w = wLim;
					fW = eval(func, w);
				}else
					if (((w - wLim) * (xC - w)) > 0) {
						fW = eval(func, w);
						if (isMinim ? fW < fC : fW > fC) {
							xB = xC;
							xC = w;
							w = xC + ((org.apache.commons.math.optimization.univariate.BracketFinder.GOLD) * (xC - xB));
							fB = fC;
							fC = fW;
							fW = eval(func, w);
						}
					}else {
						w = xC + ((org.apache.commons.math.optimization.univariate.BracketFinder.GOLD) * (xC - xB));
						fW = eval(func, w);
					}
				
			
			xA = xB;
			xB = xC;
			xC = w;
			fA = fB;
			fB = fC;
			fC = fW;
		} 
		lo = xA;
		mid = xB;
		hi = xC;
		fLo = fA;
		fMid = fB;
		fHi = fC;
	}

	public int getIterations() {
		return iterations;
	}

	public int getEvaluations() {
		return evaluations;
	}

	public double getLo() {
		return lo;
	}

	public double getFLow() {
		return fLo;
	}

	public double getHi() {
		return hi;
	}

	public double getFHi() {
		return fHi;
	}

	public double getMid() {
		return mid;
	}

	public double getFMid() {
		return fMid;
	}

	private double eval(org.apache.commons.math.analysis.UnivariateRealFunction f, double x) throws org.apache.commons.math.FunctionEvaluationException {
		++(evaluations);
		return f.value(x);
	}

	private void reset() {
		iterations = 0;
		evaluations = 0;
	}
}


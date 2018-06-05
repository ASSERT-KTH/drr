

package org.apache.commons.math3.optim.univariate;


public class BracketFinder {
	private static final double EPS_MIN = 1.0E-21;

	private static final double GOLD = 1.618034;

	private final double growLimit;

	private final org.apache.commons.math3.util.Incrementor evaluations = new org.apache.commons.math3.util.Incrementor();

	private double lo;

	private double hi;

	private double mid;

	private double fLo;

	private double fHi;

	private double fMid;

	public BracketFinder() {
		this(100, 50);
	}

	public BracketFinder(double growLimit, int maxEvaluations) {
		if (growLimit <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(growLimit);
		}
		if (maxEvaluations <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(maxEvaluations);
		}
		this.growLimit = growLimit;
		evaluations.setMaximalCount(maxEvaluations);
	}

	public void search(org.apache.commons.math3.analysis.UnivariateFunction func, org.apache.commons.math3.optim.nonlinear.scalar.GoalType goal, double xA, double xB) {
		evaluations.resetCount();
		final boolean isMinim = goal == (org.apache.commons.math3.optim.nonlinear.scalar.GoalType.MINIMIZE);
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
		double xC = xB + ((org.apache.commons.math3.optim.univariate.BracketFinder.GOLD) * (xB - xA));
		double fC = eval(func, xC);
		while (isMinim ? fC < fB : fC > fB) {
			double tmp1 = (xB - xA) * (fB - fC);
			double tmp2 = (xB - xC) * (fB - fA);
			double val = tmp2 - tmp1;
			double denom = (java.lang.Math.abs(val)) < (org.apache.commons.math3.optim.univariate.BracketFinder.EPS_MIN) ? 2 * (org.apache.commons.math3.optim.univariate.BracketFinder.EPS_MIN) : 2 * val;
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
				
				w = xC + ((org.apache.commons.math3.optim.univariate.BracketFinder.GOLD) * (xC - xB));
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
							w = xC + ((org.apache.commons.math3.optim.univariate.BracketFinder.GOLD) * (xC - xB));
							fB = fC;
							fC = fW;
							fW = eval(func, w);
						}
					}else {
						w = xC + ((org.apache.commons.math3.optim.univariate.BracketFinder.GOLD) * (xC - xB));
						fW = eval(func, w);
					}
				
			
			xA = xB;
			fA = fB;
			xB = xC;
			fB = fC;
			xC = w;
			fC = fW;
		} 
		lo = xA;
		fLo = fA;
		mid = xB;
		fMid = fB;
		hi = xC;
		fHi = fC;
		if ((lo) > (hi)) {
			double tmp = lo;
			lo = hi;
			hi = tmp;
			tmp = fLo;
			fLo = fHi;
			fHi = tmp;
		}
	}

	public int getMaxEvaluations() {
		return evaluations.getMaximalCount();
	}

	public int getEvaluations() {
		return evaluations.getCount();
	}

	public double getLo() {
		return lo;
	}

	public double getFLo() {
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

	private double eval(org.apache.commons.math3.analysis.UnivariateFunction f, double x) {
		try {
			evaluations.incrementCount();
		} catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
			throw new org.apache.commons.math3.exception.TooManyEvaluationsException(e.getMax());
		}
		return f.value(x);
	}
}


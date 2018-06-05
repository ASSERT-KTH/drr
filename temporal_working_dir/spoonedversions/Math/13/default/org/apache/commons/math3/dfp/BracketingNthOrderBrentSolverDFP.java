

package org.apache.commons.math3.dfp;


public class BracketingNthOrderBrentSolverDFP {
	private static final int MAXIMAL_AGING = 2;

	private final int maximalOrder;

	private final org.apache.commons.math3.dfp.Dfp functionValueAccuracy;

	private final org.apache.commons.math3.dfp.Dfp absoluteAccuracy;

	private final org.apache.commons.math3.dfp.Dfp relativeAccuracy;

	private final org.apache.commons.math3.util.Incrementor evaluations = new org.apache.commons.math3.util.Incrementor();

	public BracketingNthOrderBrentSolverDFP(final org.apache.commons.math3.dfp.Dfp relativeAccuracy, final org.apache.commons.math3.dfp.Dfp absoluteAccuracy, final org.apache.commons.math3.dfp.Dfp functionValueAccuracy, final int maximalOrder) throws org.apache.commons.math3.exception.NumberIsTooSmallException {
		if (maximalOrder < 2) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(maximalOrder, 2, true);
		}
		this.maximalOrder = maximalOrder;
		this.absoluteAccuracy = absoluteAccuracy;
		this.relativeAccuracy = relativeAccuracy;
		this.functionValueAccuracy = functionValueAccuracy;
	}

	public int getMaximalOrder() {
		return maximalOrder;
	}

	public int getMaxEvaluations() {
		return evaluations.getMaximalCount();
	}

	public int getEvaluations() {
		return evaluations.getCount();
	}

	public org.apache.commons.math3.dfp.Dfp getAbsoluteAccuracy() {
		return absoluteAccuracy;
	}

	public org.apache.commons.math3.dfp.Dfp getRelativeAccuracy() {
		return relativeAccuracy;
	}

	public org.apache.commons.math3.dfp.Dfp getFunctionValueAccuracy() {
		return functionValueAccuracy;
	}

	public org.apache.commons.math3.dfp.Dfp solve(final int maxEval, final org.apache.commons.math3.dfp.UnivariateDfpFunction f, final org.apache.commons.math3.dfp.Dfp min, final org.apache.commons.math3.dfp.Dfp max, final org.apache.commons.math3.analysis.solvers.AllowedSolution allowedSolution) throws org.apache.commons.math3.exception.NoBracketingException, org.apache.commons.math3.exception.NullArgumentException {
		return solve(maxEval, f, min, max, min.add(max).divide(2), allowedSolution);
	}

	public org.apache.commons.math3.dfp.Dfp solve(final int maxEval, final org.apache.commons.math3.dfp.UnivariateDfpFunction f, final org.apache.commons.math3.dfp.Dfp min, final org.apache.commons.math3.dfp.Dfp max, final org.apache.commons.math3.dfp.Dfp startValue, final org.apache.commons.math3.analysis.solvers.AllowedSolution allowedSolution) throws org.apache.commons.math3.exception.NoBracketingException, org.apache.commons.math3.exception.NullArgumentException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(f);
		evaluations.setMaximalCount(maxEval);
		evaluations.resetCount();
		org.apache.commons.math3.dfp.Dfp zero = startValue.getZero();
		org.apache.commons.math3.dfp.Dfp nan = zero.newInstance(((byte) (1)), org.apache.commons.math3.dfp.Dfp.QNAN);
		final org.apache.commons.math3.dfp.Dfp[] x = new org.apache.commons.math3.dfp.Dfp[(maximalOrder) + 1];
		final org.apache.commons.math3.dfp.Dfp[] y = new org.apache.commons.math3.dfp.Dfp[(maximalOrder) + 1];
		x[0] = min;
		x[1] = startValue;
		x[2] = max;
		evaluations.incrementCount();
		y[1] = f.value(x[1]);
		if (y[1].isZero()) {
			return x[1];
		}
		evaluations.incrementCount();
		y[0] = f.value(x[0]);
		if (y[0].isZero()) {
			return x[0];
		}
		int nbPoints;
		int signChangeIndex;
		if (y[0].multiply(y[1]).negativeOrNull()) {
			nbPoints = 2;
			signChangeIndex = 1;
		}else {
			evaluations.incrementCount();
			y[2] = f.value(x[2]);
			if (y[2].isZero()) {
				return x[2];
			}
			if (y[1].multiply(y[2]).negativeOrNull()) {
				nbPoints = 3;
				signChangeIndex = 2;
			}else {
				throw new org.apache.commons.math3.exception.NoBracketingException(x[0].toDouble(), x[2].toDouble(), y[0].toDouble(), y[2].toDouble());
			}
		}
		final org.apache.commons.math3.dfp.Dfp[] tmpX = new org.apache.commons.math3.dfp.Dfp[x.length];
		org.apache.commons.math3.dfp.Dfp xA = x[(signChangeIndex - 1)];
		org.apache.commons.math3.dfp.Dfp yA = y[(signChangeIndex - 1)];
		org.apache.commons.math3.dfp.Dfp absXA = xA.abs();
		org.apache.commons.math3.dfp.Dfp absYA = yA.abs();
		int agingA = 0;
		org.apache.commons.math3.dfp.Dfp xB = x[signChangeIndex];
		org.apache.commons.math3.dfp.Dfp yB = y[signChangeIndex];
		org.apache.commons.math3.dfp.Dfp absXB = xB.abs();
		org.apache.commons.math3.dfp.Dfp absYB = yB.abs();
		int agingB = 0;
		while (true) {
			org.apache.commons.math3.dfp.Dfp maxX = absXA.lessThan(absXB) ? absXB : absXA;
			org.apache.commons.math3.dfp.Dfp maxY = absYA.lessThan(absYB) ? absYB : absYA;
			final org.apache.commons.math3.dfp.Dfp xTol = absoluteAccuracy.add(relativeAccuracy.multiply(maxX));
			if ((xB.subtract(xA).subtract(xTol).negativeOrNull()) || (maxY.lessThan(functionValueAccuracy))) {
				switch (allowedSolution) {
					case ANY_SIDE :
						return absYA.lessThan(absYB) ? xA : xB;
					case LEFT_SIDE :
						return xA;
					case RIGHT_SIDE :
						return xB;
					case BELOW_SIDE :
						return yA.lessThan(zero) ? xA : xB;
					case ABOVE_SIDE :
						return yA.lessThan(zero) ? xB : xA;
					default :
						throw new org.apache.commons.math3.exception.MathInternalError(null);
				}
			}
			org.apache.commons.math3.dfp.Dfp targetY;
			if (agingA >= (org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFP.MAXIMAL_AGING)) {
				targetY = yB.divide(16).negate();
			}else
				if (agingB >= (org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFP.MAXIMAL_AGING)) {
					targetY = yA.divide(16).negate();
				}else {
					targetY = zero;
				}
			
			org.apache.commons.math3.dfp.Dfp nextX;
			int start = 0;
			int end = nbPoints;
			do {
				java.lang.System.arraycopy(x, start, tmpX, start, (end - start));
				nextX = guessX(targetY, tmpX, y, start, end);
				if (!((nextX.greaterThan(xA)) && (nextX.lessThan(xB)))) {
					if ((signChangeIndex - start) >= (end - signChangeIndex)) {
						++start;
					}else {
						--end;
					}
					nextX = nan;
				}
			} while ((nextX.isNaN()) && ((end - start) > 1) );
			if (nextX.isNaN()) {
				nextX = xA.add(xB.subtract(xA).divide(2));
				start = signChangeIndex - 1;
				end = signChangeIndex;
			}
			evaluations.incrementCount();
			final org.apache.commons.math3.dfp.Dfp nextY = f.value(nextX);
			if (nextY.isZero()) {
				return nextX;
			}
			if ((nbPoints > 2) && ((end - start) != nbPoints)) {
				nbPoints = end - start;
				java.lang.System.arraycopy(x, start, x, 0, nbPoints);
				java.lang.System.arraycopy(y, start, y, 0, nbPoints);
				signChangeIndex -= start;
			}else
				if (nbPoints == (x.length)) {
					nbPoints--;
					if (signChangeIndex >= (((x.length) + 1) / 2)) {
						java.lang.System.arraycopy(x, 1, x, 0, nbPoints);
						java.lang.System.arraycopy(y, 1, y, 0, nbPoints);
						--signChangeIndex;
					}
				}
			
			java.lang.System.arraycopy(x, signChangeIndex, x, (signChangeIndex + 1), (nbPoints - signChangeIndex));
			x[signChangeIndex] = nextX;
			java.lang.System.arraycopy(y, signChangeIndex, y, (signChangeIndex + 1), (nbPoints - signChangeIndex));
			y[signChangeIndex] = nextY;
			++nbPoints;
			if (nextY.multiply(yA).negativeOrNull()) {
				xB = nextX;
				yB = nextY;
				absYB = yB.abs();
				++agingA;
				agingB = 0;
			}else {
				xA = nextX;
				yA = nextY;
				absYA = yA.abs();
				agingA = 0;
				++agingB;
				signChangeIndex++;
			}
		} 
	}

	private org.apache.commons.math3.dfp.Dfp guessX(final org.apache.commons.math3.dfp.Dfp targetY, final org.apache.commons.math3.dfp.Dfp[] x, final org.apache.commons.math3.dfp.Dfp[] y, final int start, final int end) {
		for (int i = start; i < (end - 1); ++i) {
			final int delta = (i + 1) - start;
			for (int j = end - 1; j > i; --j) {
				x[j] = x[j].subtract(x[(j - 1)]).divide(y[j].subtract(y[(j - delta)]));
			}
		}
		org.apache.commons.math3.dfp.Dfp x0 = targetY.getZero();
		for (int j = end - 1; j >= start; --j) {
			x0 = x[j].add(x0.multiply(targetY.subtract(y[j])));
		}
		return x0;
	}
}


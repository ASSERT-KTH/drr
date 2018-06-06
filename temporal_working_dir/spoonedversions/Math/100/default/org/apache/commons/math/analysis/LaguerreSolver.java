

package org.apache.commons.math.analysis;


public class LaguerreSolver extends org.apache.commons.math.analysis.UnivariateRealSolverImpl {
	private static final long serialVersionUID = -3775334783473775723L;

	private org.apache.commons.math.analysis.PolynomialFunction p;

	public LaguerreSolver(org.apache.commons.math.analysis.UnivariateRealFunction f) throws java.lang.IllegalArgumentException {
		super(f, 100, 1.0E-6);
		if (f instanceof org.apache.commons.math.analysis.PolynomialFunction) {
			p = ((org.apache.commons.math.analysis.PolynomialFunction) (f));
		}else {
			throw new java.lang.IllegalArgumentException("Function is not polynomial.");
		}
	}

	public org.apache.commons.math.analysis.PolynomialFunction getPolynomialFunction() {
		return new org.apache.commons.math.analysis.PolynomialFunction(p.getCoefficients());
	}

	public double solve(double min, double max, double initial) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.FunctionEvaluationException {
		if ((p.value(min)) == 0.0) {
			return min;
		}
		if ((p.value(max)) == 0.0) {
			return max;
		}
		if ((p.value(initial)) == 0.0) {
			return initial;
		}
		verifyBracketing(min, max, p);
		verifySequence(min, initial, max);
		if (isBracketing(min, initial, p)) {
			return solve(min, initial);
		}else {
			return solve(initial, max);
		}
	}

	public double solve(double min, double max) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.FunctionEvaluationException {
		if ((p.value(min)) == 0.0) {
			return min;
		}
		if ((p.value(max)) == 0.0) {
			return max;
		}
		verifyBracketing(min, max, p);
		double[] coefficients = p.getCoefficients();
		org.apache.commons.math.complex.Complex[] c = new org.apache.commons.math.complex.Complex[coefficients.length];
		for (int i = 0; i < (coefficients.length); i++) {
			c[i] = new org.apache.commons.math.complex.Complex(coefficients[i], 0.0);
		}
		org.apache.commons.math.complex.Complex initial = new org.apache.commons.math.complex.Complex((0.5 * (min + max)), 0.0);
		org.apache.commons.math.complex.Complex z = solve(c, initial);
		if (isRootOK(min, max, z)) {
			setResult(z.getReal(), iterationCount);
			return result;
		}
		org.apache.commons.math.complex.Complex[] root = solveAll(c, initial);
		for (int i = 0; i < (root.length); i++) {
			if (isRootOK(min, max, root[i])) {
				setResult(root[i].getReal(), iterationCount);
				return result;
			}
		}
		throw new org.apache.commons.math.ConvergenceException();
	}

	protected boolean isRootOK(double min, double max, org.apache.commons.math.complex.Complex z) {
		double tolerance = java.lang.Math.max(((relativeAccuracy) * (z.abs())), absoluteAccuracy);
		return (isSequence(min, z.getReal(), max)) && (((java.lang.Math.abs(z.getImaginary())) <= tolerance) || ((z.abs()) <= (functionValueAccuracy)));
	}

	public org.apache.commons.math.complex.Complex[] solveAll(double[] coefficients, double initial) throws org.apache.commons.math.ConvergenceException, org.apache.commons.math.FunctionEvaluationException {
		org.apache.commons.math.complex.Complex[] c = new org.apache.commons.math.complex.Complex[coefficients.length];
		org.apache.commons.math.complex.Complex z = new org.apache.commons.math.complex.Complex(initial, 0.0);
		for (int i = 0; i < (c.length); i++) {
			c[i] = new org.apache.commons.math.complex.Complex(coefficients[i], 0.0);
		}
		return solveAll(c, z);
	}

	public org.apache.commons.math.complex.Complex[] solveAll(org.apache.commons.math.complex.Complex[] coefficients, org.apache.commons.math.complex.Complex initial) throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.MaxIterationsExceededException {
		int n = (coefficients.length) - 1;
		int iterationCount = 0;
		if (n < 1) {
			throw new java.lang.IllegalArgumentException(("Polynomial degree must be positive: degree=" + n));
		}
		org.apache.commons.math.complex.Complex[] c = new org.apache.commons.math.complex.Complex[n + 1];
		for (int i = 0; i <= n; i++) {
			c[i] = coefficients[i];
		}
		org.apache.commons.math.complex.Complex[] root = new org.apache.commons.math.complex.Complex[n];
		for (int i = 0; i < n; i++) {
			org.apache.commons.math.complex.Complex[] subarray = new org.apache.commons.math.complex.Complex[(n - i) + 1];
			java.lang.System.arraycopy(c, 0, subarray, 0, subarray.length);
			root[i] = solve(subarray, initial);
			org.apache.commons.math.complex.Complex newc = c[(n - i)];
			org.apache.commons.math.complex.Complex oldc = null;
			for (int j = (n - i) - 1; j >= 0; j--) {
				oldc = c[j];
				c[j] = newc;
				newc = oldc.add(newc.multiply(root[i]));
			}
			iterationCount += org.apache.commons.math.analysis.LaguerreSolver.this.iterationCount;
		}
		resultComputed = true;
		org.apache.commons.math.analysis.LaguerreSolver.this.iterationCount = iterationCount;
		return root;
	}

	public org.apache.commons.math.complex.Complex solve(org.apache.commons.math.complex.Complex[] coefficients, org.apache.commons.math.complex.Complex initial) throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.MaxIterationsExceededException {
		int n = (coefficients.length) - 1;
		if (n < 1) {
			throw new java.lang.IllegalArgumentException(("Polynomial degree must be positive: degree=" + n));
		}
		org.apache.commons.math.complex.Complex N = new org.apache.commons.math.complex.Complex(((double) (n)), 0.0);
		org.apache.commons.math.complex.Complex N1 = new org.apache.commons.math.complex.Complex(((double) (n - 1)), 0.0);
		int i = 1;
		org.apache.commons.math.complex.Complex pv = null;
		org.apache.commons.math.complex.Complex dv = null;
		org.apache.commons.math.complex.Complex d2v = null;
		org.apache.commons.math.complex.Complex G = null;
		org.apache.commons.math.complex.Complex G2 = null;
		org.apache.commons.math.complex.Complex H = null;
		org.apache.commons.math.complex.Complex delta = null;
		org.apache.commons.math.complex.Complex denominator = null;
		org.apache.commons.math.complex.Complex z = initial;
		org.apache.commons.math.complex.Complex oldz = new org.apache.commons.math.complex.Complex(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
		while (i <= (maximalIterationCount)) {
			pv = coefficients[n];
			dv = org.apache.commons.math.complex.Complex.ZERO;
			d2v = org.apache.commons.math.complex.Complex.ZERO;
			for (int j = n - 1; j >= 0; j--) {
				d2v = dv.add(z.multiply(d2v));
				dv = pv.add(z.multiply(dv));
				pv = coefficients[j].add(z.multiply(pv));
			}
			d2v = d2v.multiply(new org.apache.commons.math.complex.Complex(2.0, 0.0));
			double tolerance = java.lang.Math.max(((relativeAccuracy) * (z.abs())), absoluteAccuracy);
			if ((z.subtract(oldz).abs()) <= tolerance) {
				resultComputed = true;
				iterationCount = i;
				return z;
			}
			if ((pv.abs()) <= (functionValueAccuracy)) {
				resultComputed = true;
				iterationCount = i;
				return z;
			}
			G = dv.divide(pv);
			G2 = G.multiply(G);
			H = G2.subtract(d2v.divide(pv));
			delta = N1.multiply(N.multiply(H).subtract(G2));
			org.apache.commons.math.complex.Complex deltaSqrt = delta.sqrt();
			org.apache.commons.math.complex.Complex dplus = G.add(deltaSqrt);
			org.apache.commons.math.complex.Complex dminus = G.subtract(deltaSqrt);
			denominator = ((dplus.abs()) > (dminus.abs())) ? dplus : dminus;
			if (denominator.equals(new org.apache.commons.math.complex.Complex(0.0, 0.0))) {
				z = z.add(new org.apache.commons.math.complex.Complex(absoluteAccuracy, absoluteAccuracy));
				oldz = new org.apache.commons.math.complex.Complex(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
			}else {
				oldz = z;
				z = z.subtract(N.divide(denominator));
			}
			i++;
		} 
		throw new org.apache.commons.math.MaxIterationsExceededException(maximalIterationCount);
	}
}


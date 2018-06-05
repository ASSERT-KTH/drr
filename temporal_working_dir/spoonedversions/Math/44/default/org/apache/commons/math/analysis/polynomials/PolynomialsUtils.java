

package org.apache.commons.math.analysis.polynomials;


public class PolynomialsUtils {
	private static final java.util.List<org.apache.commons.math.fraction.BigFraction> CHEBYSHEV_COEFFICIENTS;

	private static final java.util.List<org.apache.commons.math.fraction.BigFraction> HERMITE_COEFFICIENTS;

	private static final java.util.List<org.apache.commons.math.fraction.BigFraction> LAGUERRE_COEFFICIENTS;

	private static final java.util.List<org.apache.commons.math.fraction.BigFraction> LEGENDRE_COEFFICIENTS;

	private static final java.util.Map<org.apache.commons.math.analysis.polynomials.PolynomialsUtils.JacobiKey, java.util.List<org.apache.commons.math.fraction.BigFraction>> JACOBI_COEFFICIENTS;

	static {
		CHEBYSHEV_COEFFICIENTS = new java.util.ArrayList<org.apache.commons.math.fraction.BigFraction>();
		org.apache.commons.math.analysis.polynomials.PolynomialsUtils.CHEBYSHEV_COEFFICIENTS.add(org.apache.commons.math.fraction.BigFraction.ONE);
		org.apache.commons.math.analysis.polynomials.PolynomialsUtils.CHEBYSHEV_COEFFICIENTS.add(org.apache.commons.math.fraction.BigFraction.ZERO);
		org.apache.commons.math.analysis.polynomials.PolynomialsUtils.CHEBYSHEV_COEFFICIENTS.add(org.apache.commons.math.fraction.BigFraction.ONE);
		HERMITE_COEFFICIENTS = new java.util.ArrayList<org.apache.commons.math.fraction.BigFraction>();
		org.apache.commons.math.analysis.polynomials.PolynomialsUtils.HERMITE_COEFFICIENTS.add(org.apache.commons.math.fraction.BigFraction.ONE);
		org.apache.commons.math.analysis.polynomials.PolynomialsUtils.HERMITE_COEFFICIENTS.add(org.apache.commons.math.fraction.BigFraction.ZERO);
		org.apache.commons.math.analysis.polynomials.PolynomialsUtils.HERMITE_COEFFICIENTS.add(org.apache.commons.math.fraction.BigFraction.TWO);
		LAGUERRE_COEFFICIENTS = new java.util.ArrayList<org.apache.commons.math.fraction.BigFraction>();
		org.apache.commons.math.analysis.polynomials.PolynomialsUtils.LAGUERRE_COEFFICIENTS.add(org.apache.commons.math.fraction.BigFraction.ONE);
		org.apache.commons.math.analysis.polynomials.PolynomialsUtils.LAGUERRE_COEFFICIENTS.add(org.apache.commons.math.fraction.BigFraction.ONE);
		org.apache.commons.math.analysis.polynomials.PolynomialsUtils.LAGUERRE_COEFFICIENTS.add(org.apache.commons.math.fraction.BigFraction.MINUS_ONE);
		LEGENDRE_COEFFICIENTS = new java.util.ArrayList<org.apache.commons.math.fraction.BigFraction>();
		org.apache.commons.math.analysis.polynomials.PolynomialsUtils.LEGENDRE_COEFFICIENTS.add(org.apache.commons.math.fraction.BigFraction.ONE);
		org.apache.commons.math.analysis.polynomials.PolynomialsUtils.LEGENDRE_COEFFICIENTS.add(org.apache.commons.math.fraction.BigFraction.ZERO);
		org.apache.commons.math.analysis.polynomials.PolynomialsUtils.LEGENDRE_COEFFICIENTS.add(org.apache.commons.math.fraction.BigFraction.ONE);
		JACOBI_COEFFICIENTS = new java.util.HashMap<org.apache.commons.math.analysis.polynomials.PolynomialsUtils.JacobiKey, java.util.List<org.apache.commons.math.fraction.BigFraction>>();
	}

	private PolynomialsUtils() {
	}

	public static org.apache.commons.math.analysis.polynomials.PolynomialFunction createChebyshevPolynomial(final int degree) {
		return org.apache.commons.math.analysis.polynomials.PolynomialsUtils.buildPolynomial(degree, org.apache.commons.math.analysis.polynomials.PolynomialsUtils.CHEBYSHEV_COEFFICIENTS, new org.apache.commons.math.analysis.polynomials.PolynomialsUtils.RecurrenceCoefficientsGenerator() {
			private final org.apache.commons.math.fraction.BigFraction[] coeffs = new org.apache.commons.math.fraction.BigFraction[]{ org.apache.commons.math.fraction.BigFraction.ZERO , org.apache.commons.math.fraction.BigFraction.TWO , org.apache.commons.math.fraction.BigFraction.ONE };

			public org.apache.commons.math.fraction.BigFraction[] generate(int k) {
				return coeffs;
			}
		});
	}

	public static org.apache.commons.math.analysis.polynomials.PolynomialFunction createHermitePolynomial(final int degree) {
		return org.apache.commons.math.analysis.polynomials.PolynomialsUtils.buildPolynomial(degree, org.apache.commons.math.analysis.polynomials.PolynomialsUtils.HERMITE_COEFFICIENTS, new org.apache.commons.math.analysis.polynomials.PolynomialsUtils.RecurrenceCoefficientsGenerator() {
			public org.apache.commons.math.fraction.BigFraction[] generate(int k) {
				return new org.apache.commons.math.fraction.BigFraction[]{ org.apache.commons.math.fraction.BigFraction.ZERO , org.apache.commons.math.fraction.BigFraction.TWO , new org.apache.commons.math.fraction.BigFraction((2 * k)) };
			}
		});
	}

	public static org.apache.commons.math.analysis.polynomials.PolynomialFunction createLaguerrePolynomial(final int degree) {
		return org.apache.commons.math.analysis.polynomials.PolynomialsUtils.buildPolynomial(degree, org.apache.commons.math.analysis.polynomials.PolynomialsUtils.LAGUERRE_COEFFICIENTS, new org.apache.commons.math.analysis.polynomials.PolynomialsUtils.RecurrenceCoefficientsGenerator() {
			public org.apache.commons.math.fraction.BigFraction[] generate(int k) {
				final int kP1 = k + 1;
				return new org.apache.commons.math.fraction.BigFraction[]{ new org.apache.commons.math.fraction.BigFraction(((2 * k) + 1), kP1) , new org.apache.commons.math.fraction.BigFraction((-1), kP1) , new org.apache.commons.math.fraction.BigFraction(k, kP1) };
			}
		});
	}

	public static org.apache.commons.math.analysis.polynomials.PolynomialFunction createLegendrePolynomial(final int degree) {
		return org.apache.commons.math.analysis.polynomials.PolynomialsUtils.buildPolynomial(degree, org.apache.commons.math.analysis.polynomials.PolynomialsUtils.LEGENDRE_COEFFICIENTS, new org.apache.commons.math.analysis.polynomials.PolynomialsUtils.RecurrenceCoefficientsGenerator() {
			public org.apache.commons.math.fraction.BigFraction[] generate(int k) {
				final int kP1 = k + 1;
				return new org.apache.commons.math.fraction.BigFraction[]{ org.apache.commons.math.fraction.BigFraction.ZERO , new org.apache.commons.math.fraction.BigFraction((k + kP1), kP1) , new org.apache.commons.math.fraction.BigFraction(k, kP1) };
			}
		});
	}

	public static org.apache.commons.math.analysis.polynomials.PolynomialFunction createJacobiPolynomial(final int degree, final int v, final int w) {
		final org.apache.commons.math.analysis.polynomials.PolynomialsUtils.JacobiKey key = new org.apache.commons.math.analysis.polynomials.PolynomialsUtils.JacobiKey(v, w);
		if (!(org.apache.commons.math.analysis.polynomials.PolynomialsUtils.JACOBI_COEFFICIENTS.containsKey(key))) {
			final java.util.List<org.apache.commons.math.fraction.BigFraction> list = new java.util.ArrayList<org.apache.commons.math.fraction.BigFraction>();
			org.apache.commons.math.analysis.polynomials.PolynomialsUtils.JACOBI_COEFFICIENTS.put(key, list);
			list.add(org.apache.commons.math.fraction.BigFraction.ONE);
			list.add(new org.apache.commons.math.fraction.BigFraction((v - w), 2));
			list.add(new org.apache.commons.math.fraction.BigFraction(((2 + v) + w), 2));
		}
		return org.apache.commons.math.analysis.polynomials.PolynomialsUtils.buildPolynomial(degree, org.apache.commons.math.analysis.polynomials.PolynomialsUtils.JACOBI_COEFFICIENTS.get(key), new org.apache.commons.math.analysis.polynomials.PolynomialsUtils.RecurrenceCoefficientsGenerator() {
			public org.apache.commons.math.fraction.BigFraction[] generate(int k) {
				k++;
				final int kvw = (k + v) + w;
				final int twoKvw = kvw + k;
				final int twoKvwM1 = twoKvw - 1;
				final int twoKvwM2 = twoKvw - 2;
				final int den = ((2 * k) * kvw) * twoKvwM2;
				return new org.apache.commons.math.fraction.BigFraction[]{ new org.apache.commons.math.fraction.BigFraction((twoKvwM1 * ((v * v) - (w * w))), den) , new org.apache.commons.math.fraction.BigFraction(((twoKvwM1 * twoKvw) * twoKvwM2), den) , new org.apache.commons.math.fraction.BigFraction((((2 * ((k + v) - 1)) * ((k + w) - 1)) * twoKvw), den) };
			}
		});
	}

	private static class JacobiKey {
		private final int v;

		private final int w;

		public JacobiKey(final int v, final int w) {
			this.v = v;
			this.w = w;
		}

		public int hashCode() {
			return ((v) << 16) ^ (w);
		}

		public boolean equals(final java.lang.Object key) {
			if ((key == null) || (!(key instanceof org.apache.commons.math.analysis.polynomials.PolynomialsUtils.JacobiKey))) {
				return false;
			}
			final org.apache.commons.math.analysis.polynomials.PolynomialsUtils.JacobiKey otherK = ((org.apache.commons.math.analysis.polynomials.PolynomialsUtils.JacobiKey) (key));
			return ((v) == (otherK.v)) && ((w) == (otherK.w));
		}
	}

	public static double[] shift(final double[] coefficients, final double shift) {
		final int dp1 = coefficients.length;
		final double[] newCoefficients = new double[dp1];
		final int[][] coeff = new int[dp1][dp1];
		for (int i = 0; i < dp1; i++) {
			for (int j = 0; j <= i; j++) {
				coeff[i][j] = ((int) (org.apache.commons.math.util.ArithmeticUtils.binomialCoefficient(i, j)));
			}
		}
		for (int i = 0; i < dp1; i++) {
			newCoefficients[0] += (coefficients[i]) * (org.apache.commons.math.util.FastMath.pow(shift, i));
		}
		final int d = dp1 - 1;
		for (int i = 0; i < d; i++) {
			for (int j = i; j < d; j++) {
				newCoefficients[(i + 1)] += ((coeff[(j + 1)][(j - i)]) * (coefficients[(j + 1)])) * (org.apache.commons.math.util.FastMath.pow(shift, (j - i)));
			}
		}
		return newCoefficients;
	}

	private static org.apache.commons.math.analysis.polynomials.PolynomialFunction buildPolynomial(final int degree, final java.util.List<org.apache.commons.math.fraction.BigFraction> coefficients, final org.apache.commons.math.analysis.polynomials.PolynomialsUtils.RecurrenceCoefficientsGenerator generator) {
		final int maxDegree = ((int) (org.apache.commons.math.util.FastMath.floor(org.apache.commons.math.util.FastMath.sqrt((2 * (coefficients.size())))))) - 1;
		synchronized(org.apache.commons.math.analysis.polynomials.PolynomialsUtils.class) {
			if (degree > maxDegree) {
				org.apache.commons.math.analysis.polynomials.PolynomialsUtils.computeUpToDegree(degree, maxDegree, generator, coefficients);
			}
		}
		final int start = (degree * (degree + 1)) / 2;
		final double[] a = new double[degree + 1];
		for (int i = 0; i <= degree; ++i) {
			a[i] = coefficients.get((start + i)).doubleValue();
		}
		return new org.apache.commons.math.analysis.polynomials.PolynomialFunction(a);
	}

	private static void computeUpToDegree(final int degree, final int maxDegree, final org.apache.commons.math.analysis.polynomials.PolynomialsUtils.RecurrenceCoefficientsGenerator generator, final java.util.List<org.apache.commons.math.fraction.BigFraction> coefficients) {
		int startK = ((maxDegree - 1) * maxDegree) / 2;
		for (int k = maxDegree; k < degree; ++k) {
			int startKm1 = startK;
			startK += k;
			org.apache.commons.math.fraction.BigFraction[] ai = generator.generate(k);
			org.apache.commons.math.fraction.BigFraction ck = coefficients.get(startK);
			org.apache.commons.math.fraction.BigFraction ckm1 = coefficients.get(startKm1);
			coefficients.add(ck.multiply(ai[0]).subtract(ckm1.multiply(ai[2])));
			for (int i = 1; i < k; ++i) {
				final org.apache.commons.math.fraction.BigFraction ckPrev = ck;
				ck = coefficients.get((startK + i));
				ckm1 = coefficients.get((startKm1 + i));
				coefficients.add(ck.multiply(ai[0]).add(ckPrev.multiply(ai[1])).subtract(ckm1.multiply(ai[2])));
			}
			final org.apache.commons.math.fraction.BigFraction ckPrev = ck;
			ck = coefficients.get((startK + k));
			coefficients.add(ck.multiply(ai[0]).add(ckPrev.multiply(ai[1])));
			coefficients.add(ck.multiply(ai[1]));
		}
	}

	private interface RecurrenceCoefficientsGenerator {
		org.apache.commons.math.fraction.BigFraction[] generate(int k);
	}
}


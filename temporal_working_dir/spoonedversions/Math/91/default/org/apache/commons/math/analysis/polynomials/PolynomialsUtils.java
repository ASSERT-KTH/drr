

package org.apache.commons.math.analysis.polynomials;


public class PolynomialsUtils {
	private static final java.util.ArrayList<org.apache.commons.math.fraction.Fraction> CHEBYSHEV_COEFFICIENTS;

	private static final java.util.ArrayList<org.apache.commons.math.fraction.Fraction> HERMITE_COEFFICIENTS;

	private static final java.util.ArrayList<org.apache.commons.math.fraction.Fraction> LAGUERRE_COEFFICIENTS;

	private static final java.util.ArrayList<org.apache.commons.math.fraction.Fraction> LEGENDRE_COEFFICIENTS;

	static {
		CHEBYSHEV_COEFFICIENTS = new java.util.ArrayList<org.apache.commons.math.fraction.Fraction>();
		org.apache.commons.math.analysis.polynomials.PolynomialsUtils.CHEBYSHEV_COEFFICIENTS.add(org.apache.commons.math.fraction.Fraction.ONE);
		org.apache.commons.math.analysis.polynomials.PolynomialsUtils.CHEBYSHEV_COEFFICIENTS.add(org.apache.commons.math.fraction.Fraction.ZERO);
		org.apache.commons.math.analysis.polynomials.PolynomialsUtils.CHEBYSHEV_COEFFICIENTS.add(org.apache.commons.math.fraction.Fraction.ONE);
		HERMITE_COEFFICIENTS = new java.util.ArrayList<org.apache.commons.math.fraction.Fraction>();
		org.apache.commons.math.analysis.polynomials.PolynomialsUtils.HERMITE_COEFFICIENTS.add(org.apache.commons.math.fraction.Fraction.ONE);
		org.apache.commons.math.analysis.polynomials.PolynomialsUtils.HERMITE_COEFFICIENTS.add(org.apache.commons.math.fraction.Fraction.ZERO);
		org.apache.commons.math.analysis.polynomials.PolynomialsUtils.HERMITE_COEFFICIENTS.add(org.apache.commons.math.fraction.Fraction.TWO);
		LAGUERRE_COEFFICIENTS = new java.util.ArrayList<org.apache.commons.math.fraction.Fraction>();
		org.apache.commons.math.analysis.polynomials.PolynomialsUtils.LAGUERRE_COEFFICIENTS.add(org.apache.commons.math.fraction.Fraction.ONE);
		org.apache.commons.math.analysis.polynomials.PolynomialsUtils.LAGUERRE_COEFFICIENTS.add(org.apache.commons.math.fraction.Fraction.ONE);
		org.apache.commons.math.analysis.polynomials.PolynomialsUtils.LAGUERRE_COEFFICIENTS.add(org.apache.commons.math.fraction.Fraction.MINUS_ONE);
		LEGENDRE_COEFFICIENTS = new java.util.ArrayList<org.apache.commons.math.fraction.Fraction>();
		org.apache.commons.math.analysis.polynomials.PolynomialsUtils.LEGENDRE_COEFFICIENTS.add(org.apache.commons.math.fraction.Fraction.ONE);
		org.apache.commons.math.analysis.polynomials.PolynomialsUtils.LEGENDRE_COEFFICIENTS.add(org.apache.commons.math.fraction.Fraction.ZERO);
		org.apache.commons.math.analysis.polynomials.PolynomialsUtils.LEGENDRE_COEFFICIENTS.add(org.apache.commons.math.fraction.Fraction.ONE);
	}

	private PolynomialsUtils() {
	}

	public static org.apache.commons.math.analysis.polynomials.PolynomialFunction createChebyshevPolynomial(final int degree) {
		return org.apache.commons.math.analysis.polynomials.PolynomialsUtils.buildPolynomial(degree, org.apache.commons.math.analysis.polynomials.PolynomialsUtils.CHEBYSHEV_COEFFICIENTS, new org.apache.commons.math.analysis.polynomials.PolynomialsUtils.RecurrenceCoefficientsGenerator() {
			private final org.apache.commons.math.fraction.Fraction[] coeffs = new org.apache.commons.math.fraction.Fraction[]{ org.apache.commons.math.fraction.Fraction.ZERO , org.apache.commons.math.fraction.Fraction.TWO , org.apache.commons.math.fraction.Fraction.ONE };

			public org.apache.commons.math.fraction.Fraction[] generate(int k) {
				return coeffs;
			}
		});
	}

	public static org.apache.commons.math.analysis.polynomials.PolynomialFunction createHermitePolynomial(final int degree) {
		return org.apache.commons.math.analysis.polynomials.PolynomialsUtils.buildPolynomial(degree, org.apache.commons.math.analysis.polynomials.PolynomialsUtils.HERMITE_COEFFICIENTS, new org.apache.commons.math.analysis.polynomials.PolynomialsUtils.RecurrenceCoefficientsGenerator() {
			public org.apache.commons.math.fraction.Fraction[] generate(int k) {
				return new org.apache.commons.math.fraction.Fraction[]{ org.apache.commons.math.fraction.Fraction.ZERO , org.apache.commons.math.fraction.Fraction.TWO , new org.apache.commons.math.fraction.Fraction((2 * k), 1) };
			}
		});
	}

	public static org.apache.commons.math.analysis.polynomials.PolynomialFunction createLaguerrePolynomial(final int degree) {
		return org.apache.commons.math.analysis.polynomials.PolynomialsUtils.buildPolynomial(degree, org.apache.commons.math.analysis.polynomials.PolynomialsUtils.LAGUERRE_COEFFICIENTS, new org.apache.commons.math.analysis.polynomials.PolynomialsUtils.RecurrenceCoefficientsGenerator() {
			public org.apache.commons.math.fraction.Fraction[] generate(int k) {
				final int kP1 = k + 1;
				return new org.apache.commons.math.fraction.Fraction[]{ new org.apache.commons.math.fraction.Fraction(((2 * k) + 1), kP1) , new org.apache.commons.math.fraction.Fraction((-1), kP1) , new org.apache.commons.math.fraction.Fraction(k, kP1) };
			}
		});
	}

	public static org.apache.commons.math.analysis.polynomials.PolynomialFunction createLegendrePolynomial(final int degree) {
		return org.apache.commons.math.analysis.polynomials.PolynomialsUtils.buildPolynomial(degree, org.apache.commons.math.analysis.polynomials.PolynomialsUtils.LEGENDRE_COEFFICIENTS, new org.apache.commons.math.analysis.polynomials.PolynomialsUtils.RecurrenceCoefficientsGenerator() {
			public org.apache.commons.math.fraction.Fraction[] generate(int k) {
				final int kP1 = k + 1;
				return new org.apache.commons.math.fraction.Fraction[]{ org.apache.commons.math.fraction.Fraction.ZERO , new org.apache.commons.math.fraction.Fraction((k + kP1), kP1) , new org.apache.commons.math.fraction.Fraction(k, kP1) };
			}
		});
	}

	private static org.apache.commons.math.analysis.polynomials.PolynomialFunction buildPolynomial(final int degree, final java.util.ArrayList<org.apache.commons.math.fraction.Fraction> coefficients, final org.apache.commons.math.analysis.polynomials.PolynomialsUtils.RecurrenceCoefficientsGenerator generator) {
		final int maxDegree = ((int) (java.lang.Math.floor(java.lang.Math.sqrt((2 * (coefficients.size())))))) - 1;
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

	private static void computeUpToDegree(final int degree, final int maxDegree, final org.apache.commons.math.analysis.polynomials.PolynomialsUtils.RecurrenceCoefficientsGenerator generator, final java.util.ArrayList<org.apache.commons.math.fraction.Fraction> coefficients) {
		int startK = ((maxDegree - 1) * maxDegree) / 2;
		for (int k = maxDegree; k < degree; ++k) {
			int startKm1 = startK;
			startK += k;
			org.apache.commons.math.fraction.Fraction[] ai = generator.generate(k);
			org.apache.commons.math.fraction.Fraction ck = coefficients.get(startK);
			org.apache.commons.math.fraction.Fraction ckm1 = coefficients.get(startKm1);
			coefficients.add(ck.multiply(ai[0]).subtract(ckm1.multiply(ai[2])));
			for (int i = 1; i < k; ++i) {
				final org.apache.commons.math.fraction.Fraction ckPrev = ck;
				ck = coefficients.get((startK + i));
				ckm1 = coefficients.get((startKm1 + i));
				coefficients.add(ck.multiply(ai[0]).add(ckPrev.multiply(ai[1])).subtract(ckm1.multiply(ai[2])));
			}
			final org.apache.commons.math.fraction.Fraction ckPrev = ck;
			ck = coefficients.get((startK + k));
			coefficients.add(ck.multiply(ai[0]).add(ckPrev.multiply(ai[1])));
			coefficients.add(ck.multiply(ai[1]));
		}
	}

	private static interface RecurrenceCoefficientsGenerator {
		org.apache.commons.math.fraction.Fraction[] generate(int k);
	}
}


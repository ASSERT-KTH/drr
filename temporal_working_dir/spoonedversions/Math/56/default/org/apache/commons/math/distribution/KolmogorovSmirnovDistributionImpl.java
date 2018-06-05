

package org.apache.commons.math.distribution;


public class KolmogorovSmirnovDistributionImpl implements java.io.Serializable , org.apache.commons.math.distribution.KolmogorovSmirnovDistribution {
	private static final long serialVersionUID = -4670676796862967187L;

	private int n;

	public KolmogorovSmirnovDistributionImpl(int n) {
		if (n <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.NOT_POSITIVE_NUMBER_OF_SAMPLES, n);
		}
		org.apache.commons.math.distribution.KolmogorovSmirnovDistributionImpl.this.n = n;
	}

	public double cdf(double d) throws org.apache.commons.math.exception.MathArithmeticException {
		return org.apache.commons.math.distribution.KolmogorovSmirnovDistributionImpl.this.cdf(d, false);
	}

	public double cdfExact(double d) throws org.apache.commons.math.exception.MathArithmeticException {
		return org.apache.commons.math.distribution.KolmogorovSmirnovDistributionImpl.this.cdf(d, true);
	}

	public double cdf(double d, boolean exact) throws org.apache.commons.math.exception.MathArithmeticException {
		final double ninv = 1 / ((double) (n));
		final double ninvhalf = 0.5 * ninv;
		if (d <= ninvhalf) {
			return 0;
		}else
			if ((ninvhalf < d) && (d <= ninv)) {
				double res = 1;
				double f = (2 * d) - ninv;
				for (int i = 1; i <= (n); ++i) {
					res *= i * f;
				}
				return res;
			}else
				if (((1 - ninv) <= d) && (d < 1)) {
					return 1 - (2 * (java.lang.Math.pow((1 - d), n)));
				}else
					if (1 <= d) {
						return 1;
					}
				
			
		
		return exact ? exactK(d) : roundedK(d);
	}

	private double exactK(double d) throws org.apache.commons.math.exception.MathArithmeticException {
		final int k = ((int) (java.lang.Math.ceil(((n) * d))));
		final org.apache.commons.math.linear.FieldMatrix<org.apache.commons.math.fraction.BigFraction> H = org.apache.commons.math.distribution.KolmogorovSmirnovDistributionImpl.this.createH(d);
		final org.apache.commons.math.linear.FieldMatrix<org.apache.commons.math.fraction.BigFraction> Hpower = H.power(n);
		org.apache.commons.math.fraction.BigFraction pFrac = Hpower.getEntry((k - 1), (k - 1));
		for (int i = 1; i <= (n); ++i) {
			pFrac = pFrac.multiply(i).divide(n);
		}
		return pFrac.bigDecimalValue(20, java.math.BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	private double roundedK(double d) throws org.apache.commons.math.exception.MathArithmeticException {
		final int k = ((int) (java.lang.Math.ceil(((n) * d))));
		final org.apache.commons.math.linear.FieldMatrix<org.apache.commons.math.fraction.BigFraction> HBigFraction = org.apache.commons.math.distribution.KolmogorovSmirnovDistributionImpl.this.createH(d);
		final int m = HBigFraction.getRowDimension();
		final org.apache.commons.math.linear.RealMatrix H = new org.apache.commons.math.linear.Array2DRowRealMatrix(m, m);
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < m; ++j) {
				H.setEntry(i, j, HBigFraction.getEntry(i, j).doubleValue());
			}
		}
		final org.apache.commons.math.linear.RealMatrix Hpower = H.power(n);
		double pFrac = Hpower.getEntry((k - 1), (k - 1));
		for (int i = 1; i <= (n); ++i) {
			pFrac *= ((double) (i)) / ((double) (n));
		}
		return pFrac;
	}

	private org.apache.commons.math.linear.FieldMatrix<org.apache.commons.math.fraction.BigFraction> createH(double d) throws org.apache.commons.math.exception.MathArithmeticException {
		int k = ((int) (java.lang.Math.ceil(((n) * d))));
		int m = (2 * k) - 1;
		double hDouble = k - ((n) * d);
		if (hDouble >= 1) {
			throw new java.lang.ArithmeticException("Could not ");
		}
		org.apache.commons.math.fraction.BigFraction h = null;
		try {
			h = new org.apache.commons.math.fraction.BigFraction(hDouble, 1.0E-20, 10000);
		} catch (org.apache.commons.math.fraction.FractionConversionException e1) {
			try {
				h = new org.apache.commons.math.fraction.BigFraction(hDouble, 1.0E-10, 10000);
			} catch (org.apache.commons.math.fraction.FractionConversionException e2) {
				try {
					h = new org.apache.commons.math.fraction.BigFraction(hDouble, 1.0E-5, 10000);
				} catch (org.apache.commons.math.fraction.FractionConversionException e3) {
					throw new org.apache.commons.math.exception.MathArithmeticException(org.apache.commons.math.exception.util.LocalizedFormats.CANNOT_CONVERT_OBJECT_TO_FRACTION, hDouble);
				}
			}
		}
		final org.apache.commons.math.fraction.BigFraction[][] Hdata = new org.apache.commons.math.fraction.BigFraction[m][m];
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < m; ++j) {
				if (((i - j) + 1) < 0)
					Hdata[i][j] = org.apache.commons.math.fraction.BigFraction.ZERO;
				else
					Hdata[i][j] = org.apache.commons.math.fraction.BigFraction.ONE;
				
			}
		}
		final org.apache.commons.math.fraction.BigFraction[] hPowers = new org.apache.commons.math.fraction.BigFraction[m];
		hPowers[0] = h;
		for (int i = 1; i < m; ++i) {
			hPowers[i] = h.multiply(hPowers[(i - 1)]);
		}
		for (int i = 0; i < m; ++i) {
			Hdata[i][0] = Hdata[i][0].subtract(hPowers[i]);
			Hdata[(m - 1)][i] = Hdata[(m - 1)][i].subtract(hPowers[((m - i) - 1)]);
		}
		if ((h.compareTo(org.apache.commons.math.fraction.BigFraction.ONE_HALF)) == 1) {
			Hdata[(m - 1)][0] = Hdata[(m - 1)][0].add(h.multiply(2).subtract(1).pow(m));
		}
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < (i + 1); ++j) {
				if (((i - j) + 1) > 0) {
					for (int g = 2; g <= ((i - j) + 1); ++g) {
						Hdata[i][j] = Hdata[i][j].divide(g);
					}
				}
			}
		}
		return new org.apache.commons.math.linear.Array2DRowFieldMatrix<org.apache.commons.math.fraction.BigFraction>(Hdata);
	}
}


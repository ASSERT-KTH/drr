

package org.apache.commons.math.ode;


public class NordsieckTransformer implements java.io.Serializable {
	private static final long serialVersionUID = -2707468304560314664L;

	private final org.apache.commons.math.linear.RealMatrix matNtoMWD;

	private final org.apache.commons.math.linear.RealMatrix matMWDtoN;

	private final org.apache.commons.math.linear.RealMatrix matNtoM;

	private final org.apache.commons.math.linear.RealMatrix matMtoN;

	public NordsieckTransformer(final int n) {
		final java.math.BigInteger[][] bigNtoMWD = org.apache.commons.math.ode.NordsieckTransformer.buildNordsieckToMultistepWithoutDerivatives(n);
		double[][] dataNtoMWD = new double[n][n];
		for (int i = 0; i < n; ++i) {
			double[] dRow = dataNtoMWD[i];
			java.math.BigInteger[] bRow = bigNtoMWD[i];
			for (int j = 0; j < n; ++j) {
				dRow[j] = bRow[j].doubleValue();
			}
		}
		matNtoMWD = new org.apache.commons.math.linear.RealMatrixImpl(dataNtoMWD, false);
		final org.apache.commons.math.fraction.BigFraction[][] bigToN = org.apache.commons.math.ode.NordsieckTransformer.buildMultistepWithoutDerivativesToNordsieck(n);
		double[][] dataMWDtoN = new double[n][n];
		for (int i = 0; i < n; ++i) {
			double[] dRow = dataMWDtoN[i];
			org.apache.commons.math.fraction.BigFraction[] bRow = bigToN[i];
			for (int j = 0; j < n; ++j) {
				dRow[j] = bRow[j].doubleValue();
			}
		}
		matMWDtoN = new org.apache.commons.math.linear.RealMatrixImpl(dataMWDtoN, false);
		final java.math.BigInteger[][] bigNtoM = org.apache.commons.math.ode.NordsieckTransformer.buildNordsieckToMultistep(n);
		double[][] dataNtoM = new double[n][n];
		for (int i = 0; i < n; ++i) {
			double[] dRow = dataNtoM[i];
			java.math.BigInteger[] bRow = bigNtoM[i];
			for (int j = 0; j < n; ++j) {
				dRow[j] = bRow[j].doubleValue();
			}
		}
		matNtoM = new org.apache.commons.math.linear.RealMatrixImpl(dataNtoM, false);
		org.apache.commons.math.ode.NordsieckTransformer.convertMWDtNtoMtN(bigToN);
		double[][] dataMtoN = new double[n][n];
		for (int i = 0; i < n; ++i) {
			double[] dRow = dataMtoN[i];
			org.apache.commons.math.fraction.BigFraction[] bRow = bigToN[i];
			for (int j = 0; j < n; ++j) {
				dRow[j] = bRow[j].doubleValue();
			}
		}
		matMtoN = new org.apache.commons.math.linear.RealMatrixImpl(dataMtoN, false);
	}

	public static java.math.BigInteger[][] buildNordsieckToMultistepWithoutDerivatives(final int n) {
		final java.math.BigInteger[][] array = new java.math.BigInteger[n][n];
		array[0][0] = java.math.BigInteger.ONE;
		java.util.Arrays.fill(array[0], 1, n, java.math.BigInteger.ZERO);
		for (int i = 1; i < n; ++i) {
			final java.math.BigInteger[] row = array[i];
			final java.math.BigInteger factor = java.math.BigInteger.valueOf((-i));
			java.math.BigInteger aj = java.math.BigInteger.ONE;
			for (int j = 0; j < n; ++j) {
				row[j] = aj;
				aj = aj.multiply(factor);
			}
		}
		return array;
	}

	public static org.apache.commons.math.fraction.BigFraction[][] buildMultistepWithoutDerivativesToNordsieck(final int n) {
		final java.math.BigInteger[][] iArray = new java.math.BigInteger[n][n];
		iArray[0][0] = java.math.BigInteger.ONE;
		java.util.Arrays.fill(iArray[0], 1, n, java.math.BigInteger.ZERO);
		for (int i = 1; i < n; ++i) {
			final java.math.BigInteger bigI = java.math.BigInteger.valueOf(i);
			java.math.BigInteger[] rowK = iArray[i];
			java.math.BigInteger[] rowKm1 = iArray[(i - 1)];
			for (int j = 0; j < i; ++j) {
				rowK[j] = java.math.BigInteger.ONE;
			}
			rowK[i] = rowKm1[0];
			for (int k = i - 1; k > 0; --k) {
				rowK = rowKm1;
				rowKm1 = iArray[(k - 1)];
				for (int j = 0; j < i; ++j) {
					rowK[j] = rowK[j].multiply(bigI).add(rowKm1[j]);
				}
				rowK[i] = rowKm1[0];
			}
			rowKm1[0] = rowKm1[0].multiply(bigI);
		}
		final java.math.BigInteger factorial = iArray[0][0];
		final org.apache.commons.math.fraction.BigFraction[][] fArray = new org.apache.commons.math.fraction.BigFraction[n][n];
		for (int i = 0; i < n; ++i) {
			final org.apache.commons.math.fraction.BigFraction[] fRow = fArray[i];
			final java.math.BigInteger[] iRow = iArray[i];
			java.math.BigInteger binomial = java.math.BigInteger.ONE;
			for (int j = 0; j < n; ++j) {
				fRow[j] = new org.apache.commons.math.fraction.BigFraction(binomial.multiply(iRow[j]), factorial);
				binomial = binomial.negate().multiply(java.math.BigInteger.valueOf(((n - j) - 1))).divide(java.math.BigInteger.valueOf((j + 1)));
			}
		}
		return fArray;
	}

	public static java.math.BigInteger[][] buildNordsieckToMultistep(final int n) {
		final java.math.BigInteger[][] array = new java.math.BigInteger[n][n];
		array[0][0] = java.math.BigInteger.ONE;
		java.util.Arrays.fill(array[0], 1, n, java.math.BigInteger.ZERO);
		if (n > 1) {
			array[1][0] = java.math.BigInteger.ZERO;
			array[1][1] = java.math.BigInteger.ONE;
			java.util.Arrays.fill(array[1], 2, n, java.math.BigInteger.ZERO);
			for (int i = 2; i < n; ++i) {
				final java.math.BigInteger[] row = array[i];
				final java.math.BigInteger factor = java.math.BigInteger.valueOf((1 - i));
				java.math.BigInteger aj = java.math.BigInteger.ONE;
				for (int j = 0; j < n; ++j) {
					row[j] = aj;
					aj = aj.multiply(factor);
				}
			}
		}
		return array;
	}

	public static org.apache.commons.math.fraction.BigFraction[][] buildMultistepToNordsieck(final int n) {
		final org.apache.commons.math.fraction.BigFraction[][] array = org.apache.commons.math.ode.NordsieckTransformer.buildMultistepWithoutDerivativesToNordsieck(n);
		org.apache.commons.math.ode.NordsieckTransformer.convertMWDtNtoMtN(array);
		return array;
	}

	private static void convertMWDtNtoMtN(org.apache.commons.math.fraction.BigFraction[][] array) {
		final int n = array.length;
		if (n == 1) {
			return ;
		}
		final org.apache.commons.math.fraction.BigFraction[] secondRow = array[1];
		final org.apache.commons.math.fraction.BigFraction[] solved = new org.apache.commons.math.fraction.BigFraction[n];
		final org.apache.commons.math.fraction.BigFraction f = secondRow[(n - 1)].reciprocal().negate();
		solved[0] = secondRow[0].multiply(f);
		solved[1] = f.negate();
		for (int j = 2; j < n; ++j) {
			solved[j] = secondRow[(j - 1)].multiply(f);
		}
		for (int i = 0; i < n; ++i) {
			final org.apache.commons.math.fraction.BigFraction[] rowI = array[i];
			final org.apache.commons.math.fraction.BigFraction last = rowI[(n - 1)];
			for (int j = n - 1; j > 1; --j) {
				rowI[j] = rowI[(j - 1)].add(last.multiply(solved[j]));
			}
			rowI[1] = last.multiply(solved[1]);
			rowI[0] = rowI[0].add(last.multiply(solved[0]));
		}
	}

	public double[] multistepToNordsieck(final double[] multistepHistory) {
		return matMtoN.operate(multistepHistory);
	}

	public org.apache.commons.math.linear.RealMatrix multistepToNordsieck(final org.apache.commons.math.linear.RealMatrix multistepHistory) {
		return matMtoN.multiply(multistepHistory);
	}

	public double[] nordsieckToMultistep(final double[] nordsieckHistory) {
		return matNtoM.operate(nordsieckHistory);
	}

	public org.apache.commons.math.linear.RealMatrix nordsieckToMultistep(final org.apache.commons.math.linear.RealMatrix nordsieckHistory) {
		return matNtoM.multiply(nordsieckHistory);
	}

	public double[] multistepWithoutDerivativesToNordsieck(final double[] mwdHistory) {
		return matMWDtoN.operate(mwdHistory);
	}

	public org.apache.commons.math.linear.RealMatrix multistepWithoutDerivativesToNordsieck(final org.apache.commons.math.linear.RealMatrix mwdHistory) {
		return matMWDtoN.multiply(mwdHistory);
	}

	public double[] nordsieckToMultistepWithoutDerivatives(final double[] nordsieckHistory) {
		return matNtoMWD.operate(nordsieckHistory);
	}

	public org.apache.commons.math.linear.RealMatrix nordsieckToMultistepWithoutDerivatives(final org.apache.commons.math.linear.RealMatrix nordsieckHistory) {
		return matNtoMWD.multiply(nordsieckHistory);
	}
}




package org.apache.commons.math.ode.nonstiff;


public class AdamsNordsieckTransformer {
	private static final java.util.Map<java.lang.Integer, org.apache.commons.math.ode.nonstiff.AdamsNordsieckTransformer> CACHE = new java.util.HashMap<java.lang.Integer, org.apache.commons.math.ode.nonstiff.AdamsNordsieckTransformer>();

	private final org.apache.commons.math.linear.Array2DRowRealMatrix update;

	private final double[] c1;

	private AdamsNordsieckTransformer(final int nSteps) {
		org.apache.commons.math.linear.FieldMatrix<org.apache.commons.math.fraction.BigFraction> bigP = buildP(nSteps);
		org.apache.commons.math.linear.FieldDecompositionSolver<org.apache.commons.math.fraction.BigFraction> pSolver = new org.apache.commons.math.linear.FieldLUDecompositionImpl<org.apache.commons.math.fraction.BigFraction>(bigP).getSolver();
		org.apache.commons.math.fraction.BigFraction[] u = new org.apache.commons.math.fraction.BigFraction[nSteps];
		java.util.Arrays.fill(u, org.apache.commons.math.fraction.BigFraction.ONE);
		org.apache.commons.math.fraction.BigFraction[] bigC1 = pSolver.solve(u);
		org.apache.commons.math.fraction.BigFraction[][] shiftedP = bigP.getData();
		for (int i = (shiftedP.length) - 1; i > 0; --i) {
			shiftedP[i] = shiftedP[(i - 1)];
		}
		shiftedP[0] = new org.apache.commons.math.fraction.BigFraction[nSteps];
		java.util.Arrays.fill(shiftedP[0], org.apache.commons.math.fraction.BigFraction.ZERO);
		org.apache.commons.math.linear.FieldMatrix<org.apache.commons.math.fraction.BigFraction> bigMSupdate = pSolver.solve(new org.apache.commons.math.linear.Array2DRowFieldMatrix<org.apache.commons.math.fraction.BigFraction>(shiftedP, false));
		update = org.apache.commons.math.linear.MatrixUtils.bigFractionMatrixToRealMatrix(bigMSupdate);
		c1 = new double[nSteps];
		for (int i = 0; i < nSteps; ++i) {
			c1[i] = bigC1[i].doubleValue();
		}
	}

	public static org.apache.commons.math.ode.nonstiff.AdamsNordsieckTransformer getInstance(final int nSteps) {
		synchronized(org.apache.commons.math.ode.nonstiff.AdamsNordsieckTransformer.CACHE) {
			org.apache.commons.math.ode.nonstiff.AdamsNordsieckTransformer t = org.apache.commons.math.ode.nonstiff.AdamsNordsieckTransformer.CACHE.get(nSteps);
			if (t == null) {
				t = new org.apache.commons.math.ode.nonstiff.AdamsNordsieckTransformer(nSteps);
				org.apache.commons.math.ode.nonstiff.AdamsNordsieckTransformer.CACHE.put(nSteps, t);
			}
			return t;
		}
	}

	public int getNSteps() {
		return c1.length;
	}

	private org.apache.commons.math.linear.FieldMatrix<org.apache.commons.math.fraction.BigFraction> buildP(final int nSteps) {
		final org.apache.commons.math.fraction.BigFraction[][] pData = new org.apache.commons.math.fraction.BigFraction[nSteps][nSteps];
		for (int i = 0; i < (pData.length); ++i) {
			final org.apache.commons.math.fraction.BigFraction[] pI = pData[i];
			final int factor = -(i + 1);
			int aj = factor;
			for (int j = 0; j < (pI.length); ++j) {
				pI[j] = new org.apache.commons.math.fraction.BigFraction((aj * (j + 2)));
				aj *= factor;
			}
		}
		return new org.apache.commons.math.linear.Array2DRowFieldMatrix<org.apache.commons.math.fraction.BigFraction>(pData, false);
	}

	public org.apache.commons.math.linear.Array2DRowRealMatrix initializeHighOrderDerivatives(final double h, final double[] t, final double[][] y, final double[][] yDot) {
		final double[][] a = new double[2 * ((y.length) - 1)][c1.length];
		final double[][] b = new double[2 * ((y.length) - 1)][y[0].length];
		final double[] y0 = y[0];
		final double[] yDot0 = yDot[0];
		for (int i = 1; i < (y.length); ++i) {
			final double di = (t[i]) - (t[0]);
			final double ratio = di / h;
			double dikM1Ohk = 1 / h;
			final double[] aI = a[((2 * i) - 2)];
			final double[] aDotI = a[((2 * i) - 1)];
			for (int j = 0; j < (aI.length); ++j) {
				dikM1Ohk *= ratio;
				aI[j] = di * dikM1Ohk;
				aDotI[j] = (j + 2) * dikM1Ohk;
			}
			final double[] yI = y[i];
			final double[] yDotI = yDot[i];
			final double[] bI = b[((2 * i) - 2)];
			final double[] bDotI = b[((2 * i) - 1)];
			for (int j = 0; j < (yI.length); ++j) {
				bI[j] = ((yI[j]) - (y0[j])) - (di * (yDot0[j]));
				bDotI[j] = (yDotI[j]) - (yDot0[j]);
			}
		}
		org.apache.commons.math.linear.QRDecomposition decomposition = new org.apache.commons.math.linear.QRDecompositionImpl(new org.apache.commons.math.linear.Array2DRowRealMatrix(a, false));
		return new org.apache.commons.math.linear.Array2DRowRealMatrix(decomposition.getSolver().solve(b), false);
	}

	public org.apache.commons.math.linear.Array2DRowRealMatrix updateHighOrderDerivativesPhase1(final org.apache.commons.math.linear.Array2DRowRealMatrix highOrder) {
		return update.multiply(highOrder);
	}

	public void updateHighOrderDerivativesPhase2(final double[] start, final double[] end, final org.apache.commons.math.linear.Array2DRowRealMatrix highOrder) {
		final double[][] data = highOrder.getDataRef();
		for (int i = 0; i < (data.length); ++i) {
			final double[] dataI = data[i];
			final double c1I = c1[i];
			for (int j = 0; j < (dataI.length); ++j) {
				dataI[j] += c1I * ((start[j]) - (end[j]));
			}
		}
	}
}


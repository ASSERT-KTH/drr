

package org.apache.commons.math.linear;


public class QRDecompositionImpl implements org.apache.commons.math.linear.QRDecomposition {
	private double[][] qr;

	private double[] rDiag;

	private int m;

	private int n;

	public QRDecompositionImpl(org.apache.commons.math.linear.RealMatrix matrix) {
		m = matrix.getRowDimension();
		n = matrix.getColumnDimension();
		qr = matrix.getData();
		rDiag = new double[n];
		for (int minor = 0; minor < (java.lang.Math.min(m, n)); minor++) {
			double xNormSqr = 0;
			for (int row = minor; row < (m); row++) {
				xNormSqr += (qr[row][minor]) * (qr[row][minor]);
			}
			double a = java.lang.Math.sqrt(xNormSqr);
			if ((qr[minor][minor]) > 0)
				a = -a;
			
			rDiag[minor] = a;
			if (a != 0.0) {
				qr[minor][minor] -= a;
				for (int col = minor + 1; col < (n); col++) {
					double alpha = 0;
					for (int row = minor; row < (m); row++) {
						alpha -= (qr[row][col]) * (qr[row][minor]);
					}
					alpha /= a * (qr[minor][minor]);
					for (int row = minor; row < (m); row++) {
						qr[row][col] -= alpha * (qr[row][minor]);
					}
				}
			}
		}
	}

	public org.apache.commons.math.linear.RealMatrix getR() {
		org.apache.commons.math.linear.RealMatrixImpl ret = new org.apache.commons.math.linear.RealMatrixImpl(m, n);
		double[][] r = ret.getDataRef();
		for (int row = (java.lang.Math.min(m, n)) - 1; row >= 0; row--) {
			r[row][row] = rDiag[row];
			for (int col = row + 1; col < (n); col++) {
				r[row][col] = qr[row][col];
			}
		}
		return ret;
	}

	public org.apache.commons.math.linear.RealMatrix getQ() {
		org.apache.commons.math.linear.RealMatrixImpl ret = new org.apache.commons.math.linear.RealMatrixImpl(m, m);
		double[][] Q = ret.getDataRef();
		for (int minor = (m) - 1; minor >= (java.lang.Math.min(m, n)); minor--) {
			Q[minor][minor] = 1;
		}
		for (int minor = (java.lang.Math.min(m, n)) - 1; minor >= 0; minor--) {
			Q[minor][minor] = 1;
			if ((qr[minor][minor]) != 0.0) {
				for (int col = minor; col < (m); col++) {
					double alpha = 0;
					for (int row = minor; row < (m); row++) {
						alpha -= (Q[row][col]) * (qr[row][minor]);
					}
					alpha /= (rDiag[minor]) * (qr[minor][minor]);
					for (int row = minor; row < (m); row++) {
						Q[row][col] -= alpha * (qr[row][minor]);
					}
				}
			}
		}
		return ret;
	}
}


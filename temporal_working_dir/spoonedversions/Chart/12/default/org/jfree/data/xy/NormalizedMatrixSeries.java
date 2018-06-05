

package org.jfree.data.xy;


public class NormalizedMatrixSeries extends org.jfree.data.xy.MatrixSeries {
	public static final double DEFAULT_SCALE_FACTOR = 1.0;

	private double m_scaleFactor = org.jfree.data.xy.NormalizedMatrixSeries.DEFAULT_SCALE_FACTOR;

	private double m_totalSum;

	public NormalizedMatrixSeries(java.lang.String name, int rows, int columns) {
		super(name, rows, columns);
		org.jfree.data.xy.NormalizedMatrixSeries.this.m_totalSum = java.lang.Double.MIN_VALUE;
	}

	public java.lang.Number getItem(int itemIndex) {
		int i = getItemRow(itemIndex);
		int j = getItemColumn(itemIndex);
		double mij = (get(i, j)) * (org.jfree.data.xy.NormalizedMatrixSeries.this.m_scaleFactor);
		java.lang.Number n = new java.lang.Double((mij / (org.jfree.data.xy.NormalizedMatrixSeries.this.m_totalSum)));
		return n;
	}

	public void setScaleFactor(double factor) {
		org.jfree.data.xy.NormalizedMatrixSeries.this.m_scaleFactor = factor;
	}

	public double getScaleFactor() {
		return org.jfree.data.xy.NormalizedMatrixSeries.this.m_scaleFactor;
	}

	public void update(int i, int j, double mij) {
		org.jfree.data.xy.NormalizedMatrixSeries.this.m_totalSum -= get(i, j);
		org.jfree.data.xy.NormalizedMatrixSeries.this.m_totalSum += mij;
		super.update(i, j, mij);
	}

	public void zeroAll() {
		org.jfree.data.xy.NormalizedMatrixSeries.this.m_totalSum = 0;
		super.zeroAll();
	}
}


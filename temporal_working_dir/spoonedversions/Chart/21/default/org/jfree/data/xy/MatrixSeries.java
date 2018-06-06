

package org.jfree.data.xy;


public class MatrixSeries extends org.jfree.data.general.Series implements java.io.Serializable {
	private static final long serialVersionUID = 7934188527308315704L;

	protected double[][] data;

	public MatrixSeries(java.lang.String name, int rows, int columns) {
		super(name);
		org.jfree.data.xy.MatrixSeries.this.data = new double[rows][columns];
		zeroAll();
	}

	public int getColumnsCount() {
		return org.jfree.data.xy.MatrixSeries.this.data[0].length;
	}

	public java.lang.Number getItem(int itemIndex) {
		int i = getItemRow(itemIndex);
		int j = getItemColumn(itemIndex);
		java.lang.Number n = new java.lang.Double(get(i, j));
		return n;
	}

	public int getItemColumn(int itemIndex) {
		return itemIndex % (getColumnsCount());
	}

	public int getItemCount() {
		return (getRowCount()) * (getColumnsCount());
	}

	public int getItemRow(int itemIndex) {
		return itemIndex / (getColumnsCount());
	}

	public int getRowCount() {
		return org.jfree.data.xy.MatrixSeries.this.data.length;
	}

	public double get(int i, int j) {
		return org.jfree.data.xy.MatrixSeries.this.data[i][j];
	}

	public void update(int i, int j, double mij) {
		org.jfree.data.xy.MatrixSeries.this.data[i][j] = mij;
		fireSeriesChanged();
	}

	public void zeroAll() {
		int rows = getRowCount();
		int columns = getColumnsCount();
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				org.jfree.data.xy.MatrixSeries.this.data[row][column] = 0.0;
			}
		}
		fireSeriesChanged();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.xy.MatrixSeries.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.xy.MatrixSeries)) {
			return false;
		}
		org.jfree.data.xy.MatrixSeries that = ((org.jfree.data.xy.MatrixSeries) (obj));
		if (!((getRowCount()) == (that.getRowCount()))) {
			return false;
		}
		if (!((getColumnsCount()) == (that.getColumnsCount()))) {
			return false;
		}
		for (int r = 0; r < (getRowCount()); r++) {
			for (int c = 0; c < (getColumnsCount()); c++) {
				if ((get(r, c)) != (that.get(r, c))) {
					return false;
				}
			}
		}
		return super.equals(obj);
	}
}


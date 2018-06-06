

package org.jfree.chart.plot;


public class CategoryCrosshairState extends org.jfree.chart.plot.CrosshairState {
	private java.lang.Comparable rowKey;

	private java.lang.Comparable columnKey;

	public CategoryCrosshairState() {
		org.jfree.chart.plot.CategoryCrosshairState.this.rowKey = null;
		org.jfree.chart.plot.CategoryCrosshairState.this.columnKey = null;
	}

	public java.lang.Comparable getRowKey() {
		return org.jfree.chart.plot.CategoryCrosshairState.this.rowKey;
	}

	public void setRowKey(java.lang.Comparable key) {
		org.jfree.chart.plot.CategoryCrosshairState.this.rowKey = key;
	}

	public java.lang.Comparable getColumnKey() {
		return org.jfree.chart.plot.CategoryCrosshairState.this.columnKey;
	}

	public void setColumnKey(java.lang.Comparable key) {
		org.jfree.chart.plot.CategoryCrosshairState.this.columnKey = key;
	}

	public void updateCrosshairPoint(java.lang.Comparable rowKey, java.lang.Comparable columnKey, double value, int datasetIndex, double transX, double transY, org.jfree.chart.plot.PlotOrientation orientation) {
		java.awt.geom.Point2D anchor = getAnchor();
		if (anchor != null) {
			double xx = anchor.getX();
			double yy = anchor.getY();
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				double temp = yy;
				yy = xx;
				xx = temp;
			}
			double d = ((transX - xx) * (transX - xx)) + ((transY - yy) * (transY - yy));
			if (d < (getCrosshairDistance())) {
				org.jfree.chart.plot.CategoryCrosshairState.this.rowKey = rowKey;
				org.jfree.chart.plot.CategoryCrosshairState.this.columnKey = columnKey;
				setCrosshairY(value);
				setDatasetIndex(datasetIndex);
				setCrosshairDistance(d);
			}
		}
	}

	public void updateCrosshairX(java.lang.Comparable rowKey, java.lang.Comparable columnKey, int datasetIndex, double transX, org.jfree.chart.plot.PlotOrientation orientation) {
		java.awt.geom.Point2D anchor = getAnchor();
		if (anchor != null) {
			double anchorX = anchor.getX();
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				anchorX = anchor.getY();
			}
			double d = java.lang.Math.abs((transX - anchorX));
			if (d < (getCrosshairDistance())) {
				org.jfree.chart.plot.CategoryCrosshairState.this.rowKey = rowKey;
				org.jfree.chart.plot.CategoryCrosshairState.this.columnKey = columnKey;
				setDatasetIndex(datasetIndex);
				setCrosshairDistance(d);
			}
		}
	}
}


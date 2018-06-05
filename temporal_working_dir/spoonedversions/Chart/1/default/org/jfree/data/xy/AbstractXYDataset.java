

package org.jfree.data.xy;


public abstract class AbstractXYDataset extends org.jfree.data.general.AbstractSeriesDataset implements org.jfree.data.xy.XYDataset {
	public org.jfree.data.DomainOrder getDomainOrder() {
		return org.jfree.data.DomainOrder.NONE;
	}

	public double getXValue(int series, int item) {
		double result = java.lang.Double.NaN;
		java.lang.Number x = getX(series, item);
		if (x != null) {
			result = x.doubleValue();
		}
		return result;
	}

	public double getYValue(int series, int item) {
		double result = java.lang.Double.NaN;
		java.lang.Number y = getY(series, item);
		if (y != null) {
			result = y.doubleValue();
		}
		return result;
	}

	private org.jfree.data.xy.XYDatasetSelectionState selectionState;

	public org.jfree.data.xy.XYDatasetSelectionState getSelectionState() {
		return org.jfree.data.xy.AbstractXYDataset.this.selectionState;
	}

	public void setSelectionState(org.jfree.data.xy.XYDatasetSelectionState state) {
		org.jfree.data.xy.AbstractXYDataset.this.selectionState = state;
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}
}


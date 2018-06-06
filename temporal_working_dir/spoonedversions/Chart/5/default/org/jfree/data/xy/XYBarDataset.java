

package org.jfree.data.xy;


public class XYBarDataset extends org.jfree.data.xy.AbstractIntervalXYDataset implements org.jfree.chart.util.PublicCloneable , org.jfree.data.general.DatasetChangeListener , org.jfree.data.xy.IntervalXYDataset {
	private org.jfree.data.xy.XYDataset underlying;

	private double barWidth;

	public XYBarDataset(org.jfree.data.xy.XYDataset underlying, double barWidth) {
		org.jfree.data.xy.XYBarDataset.this.underlying = underlying;
		org.jfree.data.xy.XYBarDataset.this.underlying.addChangeListener(org.jfree.data.xy.XYBarDataset.this);
		org.jfree.data.xy.XYBarDataset.this.barWidth = barWidth;
	}

	public org.jfree.data.xy.XYDataset getUnderlyingDataset() {
		return org.jfree.data.xy.XYBarDataset.this.underlying;
	}

	public double getBarWidth() {
		return org.jfree.data.xy.XYBarDataset.this.barWidth;
	}

	public void setBarWidth(double barWidth) {
		org.jfree.data.xy.XYBarDataset.this.barWidth = barWidth;
		notifyListeners(new org.jfree.data.general.DatasetChangeEvent(org.jfree.data.xy.XYBarDataset.this, org.jfree.data.xy.XYBarDataset.this));
	}

	public int getSeriesCount() {
		return org.jfree.data.xy.XYBarDataset.this.underlying.getSeriesCount();
	}

	public java.lang.Comparable getSeriesKey(int series) {
		return org.jfree.data.xy.XYBarDataset.this.underlying.getSeriesKey(series);
	}

	public int getItemCount(int series) {
		return org.jfree.data.xy.XYBarDataset.this.underlying.getItemCount(series);
	}

	public java.lang.Number getX(int series, int item) {
		return org.jfree.data.xy.XYBarDataset.this.underlying.getX(series, item);
	}

	public double getXValue(int series, int item) {
		return org.jfree.data.xy.XYBarDataset.this.underlying.getXValue(series, item);
	}

	public java.lang.Number getY(int series, int item) {
		return org.jfree.data.xy.XYBarDataset.this.underlying.getY(series, item);
	}

	public double getYValue(int series, int item) {
		return org.jfree.data.xy.XYBarDataset.this.underlying.getYValue(series, item);
	}

	public java.lang.Number getStartX(int series, int item) {
		java.lang.Number result = null;
		java.lang.Number xnum = org.jfree.data.xy.XYBarDataset.this.underlying.getX(series, item);
		if (xnum != null) {
			result = new java.lang.Double(((xnum.doubleValue()) - ((org.jfree.data.xy.XYBarDataset.this.barWidth) / 2.0)));
		}
		return result;
	}

	public double getStartXValue(int series, int item) {
		return (getXValue(series, item)) - ((org.jfree.data.xy.XYBarDataset.this.barWidth) / 2.0);
	}

	public java.lang.Number getEndX(int series, int item) {
		java.lang.Number result = null;
		java.lang.Number xnum = org.jfree.data.xy.XYBarDataset.this.underlying.getX(series, item);
		if (xnum != null) {
			result = new java.lang.Double(((xnum.doubleValue()) + ((org.jfree.data.xy.XYBarDataset.this.barWidth) / 2.0)));
		}
		return result;
	}

	public double getEndXValue(int series, int item) {
		return (getXValue(series, item)) + ((org.jfree.data.xy.XYBarDataset.this.barWidth) / 2.0);
	}

	public java.lang.Number getStartY(int series, int item) {
		return org.jfree.data.xy.XYBarDataset.this.underlying.getY(series, item);
	}

	public double getStartYValue(int series, int item) {
		return getYValue(series, item);
	}

	public java.lang.Number getEndY(int series, int item) {
		return org.jfree.data.xy.XYBarDataset.this.underlying.getY(series, item);
	}

	public double getEndYValue(int series, int item) {
		return getYValue(series, item);
	}

	public void datasetChanged(org.jfree.data.general.DatasetChangeEvent event) {
		notifyListeners(event);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.xy.XYBarDataset.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.xy.XYBarDataset)) {
			return false;
		}
		org.jfree.data.xy.XYBarDataset that = ((org.jfree.data.xy.XYBarDataset) (obj));
		if (!(org.jfree.data.xy.XYBarDataset.this.underlying.equals(that.underlying))) {
			return false;
		}
		if ((org.jfree.data.xy.XYBarDataset.this.barWidth) != (that.barWidth)) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.xy.XYBarDataset clone = ((org.jfree.data.xy.XYBarDataset) (super.clone()));
		if ((org.jfree.data.xy.XYBarDataset.this.underlying) instanceof org.jfree.chart.util.PublicCloneable) {
			org.jfree.chart.util.PublicCloneable pc = ((org.jfree.chart.util.PublicCloneable) (org.jfree.data.xy.XYBarDataset.this.underlying));
			clone.underlying = ((org.jfree.data.xy.XYDataset) (pc.clone()));
		}
		return clone;
	}
}


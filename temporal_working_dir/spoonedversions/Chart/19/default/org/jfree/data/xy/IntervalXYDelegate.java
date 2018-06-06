

package org.jfree.data.xy;


public class IntervalXYDelegate implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable , org.jfree.data.DomainInfo , org.jfree.data.general.DatasetChangeListener {
	private static final long serialVersionUID = -685166711639592857L;

	private org.jfree.data.xy.XYDataset dataset;

	private boolean autoWidth;

	private double intervalPositionFactor;

	private double fixedIntervalWidth;

	private double autoIntervalWidth;

	public IntervalXYDelegate(org.jfree.data.xy.XYDataset dataset) {
		this(dataset, true);
	}

	public IntervalXYDelegate(org.jfree.data.xy.XYDataset dataset, boolean autoWidth) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		org.jfree.data.xy.IntervalXYDelegate.this.dataset = dataset;
		org.jfree.data.xy.IntervalXYDelegate.this.autoWidth = autoWidth;
		org.jfree.data.xy.IntervalXYDelegate.this.intervalPositionFactor = 0.5;
		org.jfree.data.xy.IntervalXYDelegate.this.autoIntervalWidth = java.lang.Double.POSITIVE_INFINITY;
		org.jfree.data.xy.IntervalXYDelegate.this.fixedIntervalWidth = 1.0;
	}

	public boolean isAutoWidth() {
		return org.jfree.data.xy.IntervalXYDelegate.this.autoWidth;
	}

	public void setAutoWidth(boolean b) {
		org.jfree.data.xy.IntervalXYDelegate.this.autoWidth = b;
		if (b) {
			org.jfree.data.xy.IntervalXYDelegate.this.autoIntervalWidth = recalculateInterval();
		}
	}

	public double getIntervalPositionFactor() {
		return org.jfree.data.xy.IntervalXYDelegate.this.intervalPositionFactor;
	}

	public void setIntervalPositionFactor(double d) {
		if ((d < 0.0) || (1.0 < d)) {
			throw new java.lang.IllegalArgumentException("Argument 'd' outside valid range.");
		}
		org.jfree.data.xy.IntervalXYDelegate.this.intervalPositionFactor = d;
	}

	public double getFixedIntervalWidth() {
		return org.jfree.data.xy.IntervalXYDelegate.this.fixedIntervalWidth;
	}

	public void setFixedIntervalWidth(double w) {
		if (w < 0.0) {
			throw new java.lang.IllegalArgumentException("Negative 'w' argument.");
		}
		org.jfree.data.xy.IntervalXYDelegate.this.fixedIntervalWidth = w;
		org.jfree.data.xy.IntervalXYDelegate.this.autoWidth = false;
	}

	public double getIntervalWidth() {
		if ((isAutoWidth()) && (!(java.lang.Double.isInfinite(org.jfree.data.xy.IntervalXYDelegate.this.autoIntervalWidth)))) {
			return org.jfree.data.xy.IntervalXYDelegate.this.autoIntervalWidth;
		}else {
			return org.jfree.data.xy.IntervalXYDelegate.this.fixedIntervalWidth;
		}
	}

	public java.lang.Number getStartX(int series, int item) {
		java.lang.Number startX = null;
		java.lang.Number x = org.jfree.data.xy.IntervalXYDelegate.this.dataset.getX(series, item);
		if (x != null) {
			startX = new java.lang.Double(((x.doubleValue()) - ((getIntervalPositionFactor()) * (getIntervalWidth()))));
		}
		return startX;
	}

	public double getStartXValue(int series, int item) {
		return (org.jfree.data.xy.IntervalXYDelegate.this.dataset.getXValue(series, item)) - ((getIntervalPositionFactor()) * (getIntervalWidth()));
	}

	public java.lang.Number getEndX(int series, int item) {
		java.lang.Number endX = null;
		java.lang.Number x = org.jfree.data.xy.IntervalXYDelegate.this.dataset.getX(series, item);
		if (x != null) {
			endX = new java.lang.Double(((x.doubleValue()) + ((1.0 - (getIntervalPositionFactor())) * (getIntervalWidth()))));
		}
		return endX;
	}

	public double getEndXValue(int series, int item) {
		return (org.jfree.data.xy.IntervalXYDelegate.this.dataset.getXValue(series, item)) + ((1.0 - (getIntervalPositionFactor())) * (getIntervalWidth()));
	}

	public double getDomainLowerBound(boolean includeInterval) {
		double result = java.lang.Double.NaN;
		org.jfree.data.Range r = getDomainBounds(includeInterval);
		if (r != null) {
			result = r.getLowerBound();
		}
		return result;
	}

	public double getDomainUpperBound(boolean includeInterval) {
		double result = java.lang.Double.NaN;
		org.jfree.data.Range r = getDomainBounds(includeInterval);
		if (r != null) {
			result = r.getUpperBound();
		}
		return result;
	}

	public org.jfree.data.Range getDomainBounds(boolean includeInterval) {
		org.jfree.data.Range range = org.jfree.data.general.DatasetUtilities.findDomainBounds(org.jfree.data.xy.IntervalXYDelegate.this.dataset, false);
		if (includeInterval && (range != null)) {
			double lowerAdj = (getIntervalWidth()) * (getIntervalPositionFactor());
			double upperAdj = (getIntervalWidth()) - lowerAdj;
			range = new org.jfree.data.Range(((range.getLowerBound()) - lowerAdj), ((range.getUpperBound()) + upperAdj));
		}
		return range;
	}

	public void datasetChanged(org.jfree.data.general.DatasetChangeEvent e) {
		if (org.jfree.data.xy.IntervalXYDelegate.this.autoWidth) {
			org.jfree.data.xy.IntervalXYDelegate.this.autoIntervalWidth = recalculateInterval();
		}
	}

	private double recalculateInterval() {
		double result = java.lang.Double.POSITIVE_INFINITY;
		int seriesCount = org.jfree.data.xy.IntervalXYDelegate.this.dataset.getSeriesCount();
		for (int series = 0; series < seriesCount; series++) {
			result = java.lang.Math.min(result, calculateIntervalForSeries(series));
		}
		return result;
	}

	private double calculateIntervalForSeries(int series) {
		double result = java.lang.Double.POSITIVE_INFINITY;
		int itemCount = org.jfree.data.xy.IntervalXYDelegate.this.dataset.getItemCount(series);
		if (itemCount > 1) {
			double prev = org.jfree.data.xy.IntervalXYDelegate.this.dataset.getXValue(series, 0);
			for (int item = 1; item < itemCount; item++) {
				double x = org.jfree.data.xy.IntervalXYDelegate.this.dataset.getXValue(series, item);
				result = java.lang.Math.min(result, (x - prev));
				prev = x;
			}
		}
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.xy.IntervalXYDelegate.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.xy.IntervalXYDelegate)) {
			return false;
		}
		org.jfree.data.xy.IntervalXYDelegate that = ((org.jfree.data.xy.IntervalXYDelegate) (obj));
		if ((org.jfree.data.xy.IntervalXYDelegate.this.autoWidth) != (that.autoWidth)) {
			return false;
		}
		if ((org.jfree.data.xy.IntervalXYDelegate.this.intervalPositionFactor) != (that.intervalPositionFactor)) {
			return false;
		}
		if ((org.jfree.data.xy.IntervalXYDelegate.this.fixedIntervalWidth) != (that.fixedIntervalWidth)) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}


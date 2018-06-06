

package org.jfree.data.statistics;


public class DefaultBoxAndWhiskerXYDataset extends org.jfree.data.xy.AbstractXYDataset implements org.jfree.data.RangeInfo , org.jfree.data.statistics.BoxAndWhiskerXYDataset {
	private java.lang.Comparable seriesKey;

	private java.util.List dates;

	private java.util.List items;

	private java.lang.Number minimumRangeValue;

	private java.lang.Number maximumRangeValue;

	private org.jfree.data.Range rangeBounds;

	private double outlierCoefficient = 1.5;

	private double faroutCoefficient = 2.0;

	public DefaultBoxAndWhiskerXYDataset(java.lang.Comparable seriesKey) {
		org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.seriesKey = seriesKey;
		org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.dates = new java.util.ArrayList();
		org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.items = new java.util.ArrayList();
		org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.minimumRangeValue = null;
		org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.maximumRangeValue = null;
		org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.rangeBounds = null;
	}

	public void add(java.util.Date date, org.jfree.data.statistics.BoxAndWhiskerItem item) {
		org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.dates.add(date);
		org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.items.add(item);
		if ((org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.minimumRangeValue) == null) {
			org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.minimumRangeValue = item.getMinRegularValue();
		}else {
			if ((item.getMinRegularValue().doubleValue()) < (org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.minimumRangeValue.doubleValue())) {
				org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.minimumRangeValue = item.getMinRegularValue();
			}
		}
		if ((org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.maximumRangeValue) == null) {
			org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.maximumRangeValue = item.getMaxRegularValue();
		}else {
			if ((item.getMaxRegularValue().doubleValue()) > (org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.maximumRangeValue.doubleValue())) {
				org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.maximumRangeValue = item.getMaxRegularValue();
			}
		}
		org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.rangeBounds = new org.jfree.data.Range(org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.minimumRangeValue.doubleValue(), org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.maximumRangeValue.doubleValue());
	}

	public java.lang.Comparable getSeriesKey(int i) {
		return org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.seriesKey;
	}

	public org.jfree.data.statistics.BoxAndWhiskerItem getItem(int series, int item) {
		return ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.items.get(item)));
	}

	public java.lang.Number getX(int series, int item) {
		return new java.lang.Long(((java.util.Date) (org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.dates.get(item))).getTime());
	}

	public java.util.Date getXDate(int series, int item) {
		return ((java.util.Date) (org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.dates.get(item)));
	}

	public java.lang.Number getY(int series, int item) {
		return new java.lang.Double(getMeanValue(series, item).doubleValue());
	}

	public java.lang.Number getMeanValue(int series, int item) {
		java.lang.Number result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem stats = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.items.get(item)));
		if (stats != null) {
			result = stats.getMean();
		}
		return result;
	}

	public java.lang.Number getMedianValue(int series, int item) {
		java.lang.Number result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem stats = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.items.get(item)));
		if (stats != null) {
			result = stats.getMedian();
		}
		return result;
	}

	public java.lang.Number getQ1Value(int series, int item) {
		java.lang.Number result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem stats = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.items.get(item)));
		if (stats != null) {
			result = stats.getQ1();
		}
		return result;
	}

	public java.lang.Number getQ3Value(int series, int item) {
		java.lang.Number result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem stats = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.items.get(item)));
		if (stats != null) {
			result = stats.getQ3();
		}
		return result;
	}

	public java.lang.Number getMinRegularValue(int series, int item) {
		java.lang.Number result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem stats = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.items.get(item)));
		if (stats != null) {
			result = stats.getMinRegularValue();
		}
		return result;
	}

	public java.lang.Number getMaxRegularValue(int series, int item) {
		java.lang.Number result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem stats = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.items.get(item)));
		if (stats != null) {
			result = stats.getMaxRegularValue();
		}
		return result;
	}

	public java.lang.Number getMinOutlier(int series, int item) {
		java.lang.Number result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem stats = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.items.get(item)));
		if (stats != null) {
			result = stats.getMinOutlier();
		}
		return result;
	}

	public java.lang.Number getMaxOutlier(int series, int item) {
		java.lang.Number result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem stats = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.items.get(item)));
		if (stats != null) {
			result = stats.getMaxOutlier();
		}
		return result;
	}

	public java.util.List getOutliers(int series, int item) {
		java.util.List result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem stats = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.items.get(item)));
		if (stats != null) {
			result = stats.getOutliers();
		}
		return result;
	}

	public double getOutlierCoefficient() {
		return org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.outlierCoefficient;
	}

	public double getFaroutCoefficient() {
		return org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.faroutCoefficient;
	}

	public int getSeriesCount() {
		return 1;
	}

	public int getItemCount(int series) {
		return org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.dates.size();
	}

	public void setOutlierCoefficient(double outlierCoefficient) {
		org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.outlierCoefficient = outlierCoefficient;
	}

	public void setFaroutCoefficient(double faroutCoefficient) {
		if (faroutCoefficient > (getOutlierCoefficient())) {
			org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.faroutCoefficient = faroutCoefficient;
		}else {
			throw new java.lang.IllegalArgumentException(((("Farout value must be greater " + "than the outlier value, which is currently set at: (") + (getOutlierCoefficient())) + ")"));
		}
	}

	public double getRangeLowerBound(boolean includeInterval) {
		double result = java.lang.Double.NaN;
		if ((org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.minimumRangeValue) != null) {
			result = org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.minimumRangeValue.doubleValue();
		}
		return result;
	}

	public double getRangeUpperBound(boolean includeInterval) {
		double result = java.lang.Double.NaN;
		if ((org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.maximumRangeValue) != null) {
			result = org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.maximumRangeValue.doubleValue();
		}
		return result;
	}

	public org.jfree.data.Range getRangeBounds(boolean includeInterval) {
		return org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset.this.rangeBounds;
	}
}


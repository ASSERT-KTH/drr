

package org.jfree.data.statistics;


public class DefaultBoxAndWhiskerCategoryDataset extends org.jfree.data.general.AbstractDataset implements org.jfree.data.RangeInfo , org.jfree.data.statistics.BoxAndWhiskerCategoryDataset {
	protected org.jfree.data.KeyedObjects2D data;

	private java.lang.Number minimumRangeValue;

	private java.lang.Number maximumRangeValue;

	private org.jfree.data.Range rangeBounds;

	public DefaultBoxAndWhiskerCategoryDataset() {
		org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data = new org.jfree.data.KeyedObjects2D();
		org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.minimumRangeValue = null;
		org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.maximumRangeValue = null;
		org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.rangeBounds = new org.jfree.data.Range(0.0, 0.0);
	}

	public void add(java.util.List list, java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		org.jfree.data.statistics.BoxAndWhiskerItem item = org.jfree.data.statistics.BoxAndWhiskerCalculator.calculateBoxAndWhiskerStatistics(list);
		add(item, rowKey, columnKey);
	}

	public void add(org.jfree.data.statistics.BoxAndWhiskerItem item, java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.addObject(item, rowKey, columnKey);
		double minval = java.lang.Double.NaN;
		if ((item.getMinOutlier()) != null) {
			minval = item.getMinOutlier().doubleValue();
		}
		double maxval = java.lang.Double.NaN;
		if ((item.getMaxOutlier()) != null) {
			maxval = item.getMaxOutlier().doubleValue();
		}
		if ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.maximumRangeValue) == null) {
			org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.maximumRangeValue = new java.lang.Double(maxval);
		}else
			if (maxval > (org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.maximumRangeValue.doubleValue())) {
				org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.maximumRangeValue = new java.lang.Double(maxval);
			}
		
		if ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.minimumRangeValue) == null) {
			org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.minimumRangeValue = new java.lang.Double(minval);
		}else
			if (minval < (org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.minimumRangeValue.doubleValue())) {
				org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.minimumRangeValue = new java.lang.Double(minval);
			}
		
		org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.rangeBounds = new org.jfree.data.Range(org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.minimumRangeValue.doubleValue(), org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.maximumRangeValue.doubleValue());
		fireDatasetChanged();
	}

	public org.jfree.data.statistics.BoxAndWhiskerItem getItem(int row, int column) {
		return ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getObject(row, column)));
	}

	public java.lang.Number getValue(int row, int column) {
		return getMedianValue(row, column);
	}

	public java.lang.Number getValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		return getMedianValue(rowKey, columnKey);
	}

	public java.lang.Number getMeanValue(int row, int column) {
		java.lang.Number result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem item = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getObject(row, column)));
		if (item != null) {
			result = item.getMean();
		}
		return result;
	}

	public java.lang.Number getMeanValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		java.lang.Number result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem item = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getObject(rowKey, columnKey)));
		if (item != null) {
			result = item.getMean();
		}
		return result;
	}

	public java.lang.Number getMedianValue(int row, int column) {
		java.lang.Number result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem item = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getObject(row, column)));
		if (item != null) {
			result = item.getMedian();
		}
		return result;
	}

	public java.lang.Number getMedianValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		java.lang.Number result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem item = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getObject(rowKey, columnKey)));
		if (item != null) {
			result = item.getMedian();
		}
		return result;
	}

	public java.lang.Number getQ1Value(int row, int column) {
		java.lang.Number result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem item = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getObject(row, column)));
		if (item != null) {
			result = item.getQ1();
		}
		return result;
	}

	public java.lang.Number getQ1Value(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		java.lang.Number result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem item = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getObject(rowKey, columnKey)));
		if (item != null) {
			result = item.getQ1();
		}
		return result;
	}

	public java.lang.Number getQ3Value(int row, int column) {
		java.lang.Number result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem item = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getObject(row, column)));
		if (item != null) {
			result = item.getQ3();
		}
		return result;
	}

	public java.lang.Number getQ3Value(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		java.lang.Number result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem item = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getObject(rowKey, columnKey)));
		if (item != null) {
			result = item.getQ3();
		}
		return result;
	}

	public int getColumnIndex(java.lang.Comparable key) {
		return org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getColumnIndex(key);
	}

	public java.lang.Comparable getColumnKey(int column) {
		return org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getColumnKey(column);
	}

	public java.util.List getColumnKeys() {
		return org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getColumnKeys();
	}

	public int getRowIndex(java.lang.Comparable key) {
		return org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getRowIndex(key);
	}

	public java.lang.Comparable getRowKey(int row) {
		return org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getRowKey(row);
	}

	public java.util.List getRowKeys() {
		return org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getRowKeys();
	}

	public int getRowCount() {
		return org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getRowCount();
	}

	public int getColumnCount() {
		return org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getColumnCount();
	}

	public double getRangeLowerBound(boolean includeInterval) {
		double result = java.lang.Double.NaN;
		if ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.minimumRangeValue) != null) {
			result = org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.minimumRangeValue.doubleValue();
		}
		return result;
	}

	public double getRangeUpperBound(boolean includeInterval) {
		double result = java.lang.Double.NaN;
		if ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.maximumRangeValue) != null) {
			result = org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.maximumRangeValue.doubleValue();
		}
		return result;
	}

	public org.jfree.data.Range getRangeBounds(boolean includeInterval) {
		return org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.rangeBounds;
	}

	public java.lang.Number getMinRegularValue(int row, int column) {
		java.lang.Number result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem item = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getObject(row, column)));
		if (item != null) {
			result = item.getMinRegularValue();
		}
		return result;
	}

	public java.lang.Number getMinRegularValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		java.lang.Number result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem item = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getObject(rowKey, columnKey)));
		if (item != null) {
			result = item.getMinRegularValue();
		}
		return result;
	}

	public java.lang.Number getMaxRegularValue(int row, int column) {
		java.lang.Number result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem item = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getObject(row, column)));
		if (item != null) {
			result = item.getMaxRegularValue();
		}
		return result;
	}

	public java.lang.Number getMaxRegularValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		java.lang.Number result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem item = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getObject(rowKey, columnKey)));
		if (item != null) {
			result = item.getMaxRegularValue();
		}
		return result;
	}

	public java.lang.Number getMinOutlier(int row, int column) {
		java.lang.Number result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem item = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getObject(row, column)));
		if (item != null) {
			result = item.getMinOutlier();
		}
		return result;
	}

	public java.lang.Number getMinOutlier(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		java.lang.Number result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem item = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getObject(rowKey, columnKey)));
		if (item != null) {
			result = item.getMinOutlier();
		}
		return result;
	}

	public java.lang.Number getMaxOutlier(int row, int column) {
		java.lang.Number result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem item = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getObject(row, column)));
		if (item != null) {
			result = item.getMaxOutlier();
		}
		return result;
	}

	public java.lang.Number getMaxOutlier(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		java.lang.Number result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem item = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getObject(rowKey, columnKey)));
		if (item != null) {
			result = item.getMaxOutlier();
		}
		return result;
	}

	public java.util.List getOutliers(int row, int column) {
		java.util.List result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem item = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getObject(row, column)));
		if (item != null) {
			result = item.getOutliers();
		}
		return result;
	}

	public java.util.List getOutliers(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		java.util.List result = null;
		org.jfree.data.statistics.BoxAndWhiskerItem item = ((org.jfree.data.statistics.BoxAndWhiskerItem) (org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data.getObject(rowKey, columnKey)));
		if (item != null) {
			result = item.getOutliers();
		}
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this)) {
			return true;
		}
		if (obj instanceof org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset) {
			org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset dataset = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset) (obj));
			return org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.this.data, dataset.data);
		}
		return false;
	}
}


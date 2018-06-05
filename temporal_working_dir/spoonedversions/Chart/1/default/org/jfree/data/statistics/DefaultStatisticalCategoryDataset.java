

package org.jfree.data.statistics;


public class DefaultStatisticalCategoryDataset extends org.jfree.data.general.AbstractDataset implements org.jfree.chart.util.PublicCloneable , org.jfree.data.RangeInfo , org.jfree.data.statistics.StatisticalCategoryDataset {
	private org.jfree.data.KeyedObjects2D data;

	private double minimumRangeValue;

	private int minimumRangeValueRow;

	private int minimumRangeValueColumn;

	private double minimumRangeValueIncStdDev;

	private int minimumRangeValueIncStdDevRow;

	private int minimumRangeValueIncStdDevColumn;

	private double maximumRangeValue;

	private int maximumRangeValueRow;

	private int maximumRangeValueColumn;

	private double maximumRangeValueIncStdDev;

	private int maximumRangeValueIncStdDevRow;

	private int maximumRangeValueIncStdDevColumn;

	public DefaultStatisticalCategoryDataset() {
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data = new org.jfree.data.KeyedObjects2D();
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValue = java.lang.Double.NaN;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueRow = -1;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueColumn = -1;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValue = java.lang.Double.NaN;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueRow = -1;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueColumn = -1;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDev = java.lang.Double.NaN;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDevRow = -1;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDevColumn = -1;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDev = java.lang.Double.NaN;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDevRow = -1;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDevColumn = -1;
	}

	public java.lang.Number getMeanValue(int row, int column) {
		java.lang.Number result = null;
		org.jfree.data.statistics.MeanAndStandardDeviation masd = ((org.jfree.data.statistics.MeanAndStandardDeviation) (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.getObject(row, column)));
		if (masd != null) {
			result = masd.getMean();
		}
		return result;
	}

	public java.lang.Number getValue(int row, int column) {
		return getMeanValue(row, column);
	}

	public java.lang.Number getValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		return getMeanValue(rowKey, columnKey);
	}

	public java.lang.Number getMeanValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		java.lang.Number result = null;
		org.jfree.data.statistics.MeanAndStandardDeviation masd = ((org.jfree.data.statistics.MeanAndStandardDeviation) (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.getObject(rowKey, columnKey)));
		if (masd != null) {
			result = masd.getMean();
		}
		return result;
	}

	public java.lang.Number getStdDevValue(int row, int column) {
		java.lang.Number result = null;
		org.jfree.data.statistics.MeanAndStandardDeviation masd = ((org.jfree.data.statistics.MeanAndStandardDeviation) (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.getObject(row, column)));
		if (masd != null) {
			result = masd.getStandardDeviation();
		}
		return result;
	}

	public java.lang.Number getStdDevValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		java.lang.Number result = null;
		org.jfree.data.statistics.MeanAndStandardDeviation masd = ((org.jfree.data.statistics.MeanAndStandardDeviation) (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.getObject(rowKey, columnKey)));
		if (masd != null) {
			result = masd.getStandardDeviation();
		}
		return result;
	}

	public int getColumnIndex(java.lang.Comparable key) {
		return org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.getColumnIndex(key);
	}

	public java.lang.Comparable getColumnKey(int column) {
		return org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.getColumnKey(column);
	}

	public java.util.List getColumnKeys() {
		return org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.getColumnKeys();
	}

	public int getRowIndex(java.lang.Comparable key) {
		return org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.getRowIndex(key);
	}

	public java.lang.Comparable getRowKey(int row) {
		return org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.getRowKey(row);
	}

	public java.util.List getRowKeys() {
		return org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.getRowKeys();
	}

	public int getRowCount() {
		return org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.getRowCount();
	}

	public int getColumnCount() {
		return org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.getColumnCount();
	}

	public void add(double mean, double standardDeviation, java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		add(new java.lang.Double(mean), new java.lang.Double(standardDeviation), rowKey, columnKey);
	}

	public void add(java.lang.Number mean, java.lang.Number standardDeviation, java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		org.jfree.data.statistics.MeanAndStandardDeviation item = new org.jfree.data.statistics.MeanAndStandardDeviation(mean, standardDeviation);
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.addObject(item, rowKey, columnKey);
		double m = java.lang.Double.NaN;
		double sd = java.lang.Double.NaN;
		if (mean != null) {
			m = mean.doubleValue();
		}
		if (standardDeviation != null) {
			sd = standardDeviation.doubleValue();
		}
		int r = org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.getColumnIndex(columnKey);
		int c = org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.getRowIndex(rowKey);
		if (((((r == (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueRow)) && (c == (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueColumn))) || ((r == (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDevRow)) && (c == (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDevColumn)))) || ((r == (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueRow)) && (c == (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueColumn)))) || ((r == (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDevRow)) && (c == (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDevColumn)))) {
			updateBounds();
		}else {
			if (!(java.lang.Double.isNaN(m))) {
				if ((java.lang.Double.isNaN(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValue)) || (m > (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValue))) {
					org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValue = m;
					org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueRow = r;
					org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueColumn = c;
				}
			}
			if (!(java.lang.Double.isNaN((m + sd)))) {
				if ((java.lang.Double.isNaN(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDev)) || ((m + sd) > (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDev))) {
					org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDev = m + sd;
					org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDevRow = r;
					org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDevColumn = c;
				}
			}
			if (!(java.lang.Double.isNaN(m))) {
				if ((java.lang.Double.isNaN(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValue)) || (m < (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValue))) {
					org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValue = m;
					org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueRow = r;
					org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueColumn = c;
				}
			}
			if (!(java.lang.Double.isNaN((m - sd)))) {
				if ((java.lang.Double.isNaN(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDev)) || ((m - sd) < (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDev))) {
					org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDev = m - sd;
					org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDevRow = r;
					org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDevColumn = c;
				}
			}
		}
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public void remove(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		int r = getRowIndex(rowKey);
		int c = getColumnIndex(columnKey);
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.removeObject(rowKey, columnKey);
		if (((((r == (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueRow)) && (c == (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueColumn))) || ((r == (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDevRow)) && (c == (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDevColumn)))) || ((r == (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueRow)) && (c == (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueColumn)))) || ((r == (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDevRow)) && (c == (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDevColumn)))) {
			updateBounds();
		}
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public void removeRow(int rowIndex) {
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.removeRow(rowIndex);
		updateBounds();
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public void removeRow(java.lang.Comparable rowKey) {
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.removeRow(rowKey);
		updateBounds();
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public void removeColumn(int columnIndex) {
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.removeColumn(columnIndex);
		updateBounds();
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public void removeColumn(java.lang.Comparable columnKey) {
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.removeColumn(columnKey);
		updateBounds();
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public void clear() {
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.clear();
		updateBounds();
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	private void updateBounds() {
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValue = java.lang.Double.NaN;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueRow = -1;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueColumn = -1;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValue = java.lang.Double.NaN;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueRow = -1;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueColumn = -1;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDev = java.lang.Double.NaN;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDevRow = -1;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDevColumn = -1;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDev = java.lang.Double.NaN;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDevRow = -1;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDevColumn = -1;
		int rowCount = org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.getRowCount();
		int columnCount = org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.getColumnCount();
		for (int r = 0; r < rowCount; r++) {
			for (int c = 0; c < columnCount; c++) {
				double m = java.lang.Double.NaN;
				double sd = java.lang.Double.NaN;
				org.jfree.data.statistics.MeanAndStandardDeviation masd = ((org.jfree.data.statistics.MeanAndStandardDeviation) (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.getObject(r, c)));
				if (masd == null) {
					continue;
				}
				m = masd.getMeanValue();
				sd = masd.getStandardDeviationValue();
				if (!(java.lang.Double.isNaN(m))) {
					if (java.lang.Double.isNaN(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValue)) {
						org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValue = m;
						org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueRow = r;
						org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueColumn = c;
					}else {
						if (m > (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValue)) {
							org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValue = m;
							org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueRow = r;
							org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueColumn = c;
						}
					}
					if (java.lang.Double.isNaN(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValue)) {
						org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValue = m;
						org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueRow = r;
						org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueColumn = c;
					}else {
						if (m < (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValue)) {
							org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValue = m;
							org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueRow = r;
							org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueColumn = c;
						}
					}
					if (!(java.lang.Double.isNaN(sd))) {
						if (java.lang.Double.isNaN(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDev)) {
							org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDev = m + sd;
							org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDevRow = r;
							org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDevColumn = c;
						}else {
							if ((m + sd) > (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDev)) {
								org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDev = m + sd;
								org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDevRow = r;
								org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDevColumn = c;
							}
						}
						if (java.lang.Double.isNaN(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDev)) {
							org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDev = m - sd;
							org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDevRow = r;
							org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDevColumn = c;
						}else {
							if ((m - sd) < (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDev)) {
								org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDev = m - sd;
								org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDevRow = r;
								org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDevColumn = c;
							}
						}
					}
				}
			}
		}
	}

	public double getRangeLowerBound(boolean includeInterval) {
		if (includeInterval) {
			return org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDev;
		}else {
			return org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValue;
		}
	}

	public double getRangeUpperBound(boolean includeInterval) {
		if (includeInterval) {
			return org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDev;
		}else {
			return org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValue;
		}
	}

	public org.jfree.data.Range getRangeBounds(boolean includeInterval) {
		org.jfree.data.Range result = null;
		if (includeInterval) {
			if ((!(java.lang.Double.isNaN(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDev))) && (!(java.lang.Double.isNaN(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDev)))) {
				result = new org.jfree.data.Range(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDev, org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDev);
			}
		}else {
			if ((!(java.lang.Double.isNaN(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValue))) && (!(java.lang.Double.isNaN(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValue)))) {
				result = new org.jfree.data.Range(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValue, org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValue);
			}
		}
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.statistics.DefaultStatisticalCategoryDataset)) {
			return false;
		}
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset that = ((org.jfree.data.statistics.DefaultStatisticalCategoryDataset) (obj));
		if (!(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.equals(that.data))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset clone = ((org.jfree.data.statistics.DefaultStatisticalCategoryDataset) (super.clone()));
		clone.data = ((org.jfree.data.KeyedObjects2D) (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data.clone()));
		return clone;
	}
}


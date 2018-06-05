

package org.jfree.data.statistics;


public class DefaultStatisticalCategoryDataset extends org.jfree.data.general.AbstractDataset implements org.jfree.chart.util.PublicCloneable , org.jfree.data.RangeInfo , org.jfree.data.statistics.StatisticalCategoryDataset {
	private org.jfree.data.KeyedObjects2D data;

	private double minimumRangeValue;

	private double minimumRangeValueIncStdDev;

	private double maximumRangeValue;

	private double maximumRangeValueIncStdDev;

	public DefaultStatisticalCategoryDataset() {
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.data = new org.jfree.data.KeyedObjects2D();
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValue = java.lang.Double.NaN;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValue = java.lang.Double.NaN;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDev = java.lang.Double.NaN;
		org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDev = java.lang.Double.NaN;
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
		double m = 0.0;
		double sd = 0.0;
		if (mean != null) {
			m = mean.doubleValue();
		}
		if (standardDeviation != null) {
			sd = standardDeviation.doubleValue();
		}
		if (!(java.lang.Double.isNaN(m))) {
			if ((java.lang.Double.isNaN(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValue)) || (m > (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValue))) {
				org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValue = m;
			}
		}
		if (!(java.lang.Double.isNaN((m + sd)))) {
			if ((java.lang.Double.isNaN(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDev)) || ((m + sd) > (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDev))) {
				org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDev = m + sd;
			}
		}
		if (!(java.lang.Double.isNaN(m))) {
			if ((java.lang.Double.isNaN(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValue)) || (m < (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValue))) {
				org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValue = m;
			}
		}
		if (!(java.lang.Double.isNaN((m - sd)))) {
			if ((java.lang.Double.isNaN(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDev)) || ((m - sd) < (org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDev))) {
				org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDev = m - sd;
			}
		}
		fireDatasetChanged();
	}

	public double getRangeLowerBound(boolean includeInterval) {
		return org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValue;
	}

	public double getRangeUpperBound(boolean includeInterval) {
		return org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValue;
	}

	public org.jfree.data.Range getRangeBounds(boolean includeInterval) {
		org.jfree.data.Range result = null;
		if (includeInterval) {
			if ((!(java.lang.Double.isNaN(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDev))) && (!(java.lang.Double.isNaN(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDev))))
				result = new org.jfree.data.Range(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValueIncStdDev, org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValueIncStdDev);
			
		}else {
			if ((!(java.lang.Double.isNaN(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValue))) && (!(java.lang.Double.isNaN(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValue))))
				result = new org.jfree.data.Range(org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.minimumRangeValue, org.jfree.data.statistics.DefaultStatisticalCategoryDataset.this.maximumRangeValue);
			
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


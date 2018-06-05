

package org.jfree.data.gantt;


public class SlidingGanttCategoryDataset extends org.jfree.data.general.AbstractDataset implements org.jfree.data.gantt.GanttCategoryDataset {
	private org.jfree.data.gantt.GanttCategoryDataset underlying;

	private int firstCategoryIndex;

	private int maximumCategoryCount;

	public SlidingGanttCategoryDataset(org.jfree.data.gantt.GanttCategoryDataset underlying, int firstColumn, int maxColumns) {
		org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying = underlying;
		org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex = firstColumn;
		org.jfree.data.gantt.SlidingGanttCategoryDataset.this.maximumCategoryCount = maxColumns;
	}

	public org.jfree.data.gantt.GanttCategoryDataset getUnderlyingDataset() {
		return org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying;
	}

	public int getFirstCategoryIndex() {
		return org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex;
	}

	public void setFirstCategoryIndex(int first) {
		if ((first < 0) || (first >= (org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getColumnCount()))) {
			throw new java.lang.IllegalArgumentException("Invalid index.");
		}
		org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex = first;
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public int getMaximumCategoryCount() {
		return org.jfree.data.gantt.SlidingGanttCategoryDataset.this.maximumCategoryCount;
	}

	public void setMaximumCategoryCount(int max) {
		if (max < 0) {
			throw new java.lang.IllegalArgumentException("Requires 'max' >= 0.");
		}
		org.jfree.data.gantt.SlidingGanttCategoryDataset.this.maximumCategoryCount = max;
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	private int lastCategoryIndex() {
		if ((org.jfree.data.gantt.SlidingGanttCategoryDataset.this.maximumCategoryCount) == 0) {
			return -1;
		}
		return (java.lang.Math.min(((org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex) + (org.jfree.data.gantt.SlidingGanttCategoryDataset.this.maximumCategoryCount)), org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getColumnCount())) - 1;
	}

	public int getColumnIndex(java.lang.Comparable key) {
		int index = org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getColumnIndex(key);
		if ((index >= (org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex)) && (index <= (lastCategoryIndex()))) {
			return index - (org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex);
		}
		return -1;
	}

	public java.lang.Comparable getColumnKey(int column) {
		return org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getColumnKey((column + (org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex)));
	}

	public java.util.List getColumnKeys() {
		java.util.List result = new java.util.ArrayList();
		int last = lastCategoryIndex();
		for (int i = org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex; i < last; i++) {
			result.add(org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getColumnKey(i));
		}
		return java.util.Collections.unmodifiableList(result);
	}

	public int getRowIndex(java.lang.Comparable key) {
		return org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getRowIndex(key);
	}

	public java.lang.Comparable getRowKey(int row) {
		return org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getRowKey(row);
	}

	public java.util.List getRowKeys() {
		return org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getRowKeys();
	}

	public java.lang.Number getValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		int r = getRowIndex(rowKey);
		int c = getColumnIndex(columnKey);
		if (c != (-1)) {
			return org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getValue(r, (c + (org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex)));
		}else {
			throw new org.jfree.data.UnknownKeyException(("Unknown columnKey: " + columnKey));
		}
	}

	public int getColumnCount() {
		int last = lastCategoryIndex();
		if (last == (-1)) {
			return 0;
		}else {
			return java.lang.Math.max(((last - (org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex)) + 1), 0);
		}
	}

	public int getRowCount() {
		return org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getRowCount();
	}

	public java.lang.Number getValue(int row, int column) {
		return org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getValue(row, (column + (org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex)));
	}

	public java.lang.Number getPercentComplete(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		int r = getRowIndex(rowKey);
		int c = getColumnIndex(columnKey);
		if (c != (-1)) {
			return org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getPercentComplete(r, (c + (org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex)));
		}else {
			throw new org.jfree.data.UnknownKeyException(("Unknown columnKey: " + columnKey));
		}
	}

	public java.lang.Number getPercentComplete(java.lang.Comparable rowKey, java.lang.Comparable columnKey, int subinterval) {
		int r = getRowIndex(rowKey);
		int c = getColumnIndex(columnKey);
		if (c != (-1)) {
			return org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getPercentComplete(r, (c + (org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex)), subinterval);
		}else {
			throw new org.jfree.data.UnknownKeyException(("Unknown columnKey: " + columnKey));
		}
	}

	public java.lang.Number getEndValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey, int subinterval) {
		int r = getRowIndex(rowKey);
		int c = getColumnIndex(columnKey);
		if (c != (-1)) {
			return org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getEndValue(r, (c + (org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex)), subinterval);
		}else {
			throw new org.jfree.data.UnknownKeyException(("Unknown columnKey: " + columnKey));
		}
	}

	public java.lang.Number getEndValue(int row, int column, int subinterval) {
		return org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getEndValue(row, (column + (org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex)), subinterval);
	}

	public java.lang.Number getPercentComplete(int series, int category) {
		return org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getPercentComplete(series, (category + (org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex)));
	}

	public java.lang.Number getPercentComplete(int row, int column, int subinterval) {
		return org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getPercentComplete(row, (column + (org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex)), subinterval);
	}

	public java.lang.Number getStartValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey, int subinterval) {
		int r = getRowIndex(rowKey);
		int c = getColumnIndex(columnKey);
		if (c != (-1)) {
			return org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getStartValue(r, (c + (org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex)), subinterval);
		}else {
			throw new org.jfree.data.UnknownKeyException(("Unknown columnKey: " + columnKey));
		}
	}

	public java.lang.Number getStartValue(int row, int column, int subinterval) {
		return org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getStartValue(row, (column + (org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex)), subinterval);
	}

	public int getSubIntervalCount(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		int r = getRowIndex(rowKey);
		int c = getColumnIndex(columnKey);
		if (c != (-1)) {
			return org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getSubIntervalCount(r, (c + (org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex)));
		}else {
			throw new org.jfree.data.UnknownKeyException(("Unknown columnKey: " + columnKey));
		}
	}

	public int getSubIntervalCount(int row, int column) {
		return org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getSubIntervalCount(row, (column + (org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex)));
	}

	public java.lang.Number getStartValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		int r = getRowIndex(rowKey);
		int c = getColumnIndex(columnKey);
		if (c != (-1)) {
			return org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getStartValue(r, (c + (org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex)));
		}else {
			throw new org.jfree.data.UnknownKeyException(("Unknown columnKey: " + columnKey));
		}
	}

	public java.lang.Number getStartValue(int row, int column) {
		return org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getStartValue(row, (column + (org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex)));
	}

	public java.lang.Number getEndValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		int r = getRowIndex(rowKey);
		int c = getColumnIndex(columnKey);
		if (c != (-1)) {
			return org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getEndValue(r, (c + (org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex)));
		}else {
			throw new org.jfree.data.UnknownKeyException(("Unknown columnKey: " + columnKey));
		}
	}

	public java.lang.Number getEndValue(int series, int category) {
		return org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.getEndValue(series, (category + (org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex)));
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.gantt.SlidingGanttCategoryDataset.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.gantt.SlidingGanttCategoryDataset)) {
			return false;
		}
		org.jfree.data.gantt.SlidingGanttCategoryDataset that = ((org.jfree.data.gantt.SlidingGanttCategoryDataset) (obj));
		if ((org.jfree.data.gantt.SlidingGanttCategoryDataset.this.firstCategoryIndex) != (that.firstCategoryIndex)) {
			return false;
		}
		if ((org.jfree.data.gantt.SlidingGanttCategoryDataset.this.maximumCategoryCount) != (that.maximumCategoryCount)) {
			return false;
		}
		if (!(org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying.equals(that.underlying))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.gantt.SlidingGanttCategoryDataset clone = ((org.jfree.data.gantt.SlidingGanttCategoryDataset) (super.clone()));
		if ((org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying) instanceof org.jfree.chart.util.PublicCloneable) {
			org.jfree.chart.util.PublicCloneable pc = ((org.jfree.chart.util.PublicCloneable) (org.jfree.data.gantt.SlidingGanttCategoryDataset.this.underlying));
			clone.underlying = ((org.jfree.data.gantt.GanttCategoryDataset) (pc.clone()));
		}
		return clone;
	}
}


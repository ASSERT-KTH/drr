

package org.jfree.data.category;


public class SlidingCategoryDataset extends org.jfree.data.general.AbstractDataset implements org.jfree.data.category.CategoryDataset {
	private org.jfree.data.category.CategoryDataset underlying;

	private int firstCategoryIndex;

	private int maximumCategoryCount;

	public SlidingCategoryDataset(org.jfree.data.category.CategoryDataset underlying, int firstColumn, int maxColumns) {
		org.jfree.data.category.SlidingCategoryDataset.this.underlying = underlying;
		org.jfree.data.category.SlidingCategoryDataset.this.firstCategoryIndex = firstColumn;
		org.jfree.data.category.SlidingCategoryDataset.this.maximumCategoryCount = maxColumns;
	}

	public org.jfree.data.category.CategoryDataset getUnderlyingDataset() {
		return org.jfree.data.category.SlidingCategoryDataset.this.underlying;
	}

	public int getFirstCategoryIndex() {
		return org.jfree.data.category.SlidingCategoryDataset.this.firstCategoryIndex;
	}

	public void setFirstCategoryIndex(int first) {
		if ((first < 0) || (first >= (org.jfree.data.category.SlidingCategoryDataset.this.underlying.getColumnCount()))) {
			throw new java.lang.IllegalArgumentException("Invalid index.");
		}
		org.jfree.data.category.SlidingCategoryDataset.this.firstCategoryIndex = first;
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public int getMaximumCategoryCount() {
		return org.jfree.data.category.SlidingCategoryDataset.this.maximumCategoryCount;
	}

	public void setMaximumCategoryCount(int max) {
		if (max < 0) {
			throw new java.lang.IllegalArgumentException("Requires 'max' >= 0.");
		}
		org.jfree.data.category.SlidingCategoryDataset.this.maximumCategoryCount = max;
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	private int lastCategoryIndex() {
		if ((org.jfree.data.category.SlidingCategoryDataset.this.maximumCategoryCount) == 0) {
			return -1;
		}
		return (java.lang.Math.min(((org.jfree.data.category.SlidingCategoryDataset.this.firstCategoryIndex) + (org.jfree.data.category.SlidingCategoryDataset.this.maximumCategoryCount)), org.jfree.data.category.SlidingCategoryDataset.this.underlying.getColumnCount())) - 1;
	}

	public int getColumnIndex(java.lang.Comparable key) {
		int index = org.jfree.data.category.SlidingCategoryDataset.this.underlying.getColumnIndex(key);
		if ((index >= (org.jfree.data.category.SlidingCategoryDataset.this.firstCategoryIndex)) && (index <= (lastCategoryIndex()))) {
			return index - (org.jfree.data.category.SlidingCategoryDataset.this.firstCategoryIndex);
		}
		return -1;
	}

	public java.lang.Comparable getColumnKey(int column) {
		return org.jfree.data.category.SlidingCategoryDataset.this.underlying.getColumnKey((column + (org.jfree.data.category.SlidingCategoryDataset.this.firstCategoryIndex)));
	}

	public java.util.List getColumnKeys() {
		java.util.List result = new java.util.ArrayList();
		int last = lastCategoryIndex();
		for (int i = org.jfree.data.category.SlidingCategoryDataset.this.firstCategoryIndex; i <= last; i++) {
			result.add(org.jfree.data.category.SlidingCategoryDataset.this.underlying.getColumnKey(i));
		}
		return java.util.Collections.unmodifiableList(result);
	}

	public int getRowIndex(java.lang.Comparable key) {
		return org.jfree.data.category.SlidingCategoryDataset.this.underlying.getRowIndex(key);
	}

	public java.lang.Comparable getRowKey(int row) {
		return org.jfree.data.category.SlidingCategoryDataset.this.underlying.getRowKey(row);
	}

	public java.util.List getRowKeys() {
		return org.jfree.data.category.SlidingCategoryDataset.this.underlying.getRowKeys();
	}

	public java.lang.Number getValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		int r = getRowIndex(rowKey);
		int c = getColumnIndex(columnKey);
		if (c != (-1)) {
			return org.jfree.data.category.SlidingCategoryDataset.this.underlying.getValue(r, (c + (org.jfree.data.category.SlidingCategoryDataset.this.firstCategoryIndex)));
		}else {
			throw new org.jfree.data.UnknownKeyException(("Unknown columnKey: " + columnKey));
		}
	}

	public int getColumnCount() {
		int last = lastCategoryIndex();
		if (last == (-1)) {
			return 0;
		}else {
			return java.lang.Math.max(((last - (org.jfree.data.category.SlidingCategoryDataset.this.firstCategoryIndex)) + 1), 0);
		}
	}

	public int getRowCount() {
		return org.jfree.data.category.SlidingCategoryDataset.this.underlying.getRowCount();
	}

	public java.lang.Number getValue(int row, int column) {
		return org.jfree.data.category.SlidingCategoryDataset.this.underlying.getValue(row, (column + (org.jfree.data.category.SlidingCategoryDataset.this.firstCategoryIndex)));
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.category.SlidingCategoryDataset.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.category.SlidingCategoryDataset)) {
			return false;
		}
		org.jfree.data.category.SlidingCategoryDataset that = ((org.jfree.data.category.SlidingCategoryDataset) (obj));
		if ((org.jfree.data.category.SlidingCategoryDataset.this.firstCategoryIndex) != (that.firstCategoryIndex)) {
			return false;
		}
		if ((org.jfree.data.category.SlidingCategoryDataset.this.maximumCategoryCount) != (that.maximumCategoryCount)) {
			return false;
		}
		if (!(org.jfree.data.category.SlidingCategoryDataset.this.underlying.equals(that.underlying))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.category.SlidingCategoryDataset clone = ((org.jfree.data.category.SlidingCategoryDataset) (super.clone()));
		if ((org.jfree.data.category.SlidingCategoryDataset.this.underlying) instanceof org.jfree.chart.util.PublicCloneable) {
			org.jfree.chart.util.PublicCloneable pc = ((org.jfree.chart.util.PublicCloneable) (org.jfree.data.category.SlidingCategoryDataset.this.underlying));
			clone.underlying = ((org.jfree.data.category.CategoryDataset) (pc.clone()));
		}
		return clone;
	}
}


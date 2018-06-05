

package org.jfree.data.statistics;


public class DefaultMultiValueCategoryDataset extends org.jfree.data.general.AbstractDataset implements org.jfree.chart.util.PublicCloneable , org.jfree.data.RangeInfo , org.jfree.data.statistics.MultiValueCategoryDataset {
	protected org.jfree.data.KeyedObjects2D data;

	private java.lang.Number minimumRangeValue;

	private java.lang.Number maximumRangeValue;

	private org.jfree.data.Range rangeBounds;

	public DefaultMultiValueCategoryDataset() {
		org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.data = new org.jfree.data.KeyedObjects2D();
		org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.minimumRangeValue = null;
		org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.maximumRangeValue = null;
		org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.rangeBounds = new org.jfree.data.Range(0.0, 0.0);
	}

	public void add(java.util.List values, java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		if (values == null) {
			throw new java.lang.IllegalArgumentException("Null 'values' argument.");
		}
		if (rowKey == null) {
			throw new java.lang.IllegalArgumentException("Null 'rowKey' argument.");
		}
		if (columnKey == null) {
			throw new java.lang.IllegalArgumentException("Null 'columnKey' argument.");
		}
		java.util.List vlist = new java.util.ArrayList(values.size());
		java.util.Iterator iterator = values.listIterator();
		while (iterator.hasNext()) {
			java.lang.Object obj = iterator.next();
			if (obj instanceof java.lang.Number) {
				java.lang.Number n = ((java.lang.Number) (obj));
				double v = n.doubleValue();
				if (!(java.lang.Double.isNaN(v))) {
					vlist.add(n);
				}
			}
		} 
		java.util.Collections.sort(vlist);
		org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.data.addObject(vlist, rowKey, columnKey);
		if ((vlist.size()) > 0) {
			double maxval = java.lang.Double.NEGATIVE_INFINITY;
			double minval = java.lang.Double.POSITIVE_INFINITY;
			for (int i = 0; i < (vlist.size()); i++) {
				java.lang.Number n = ((java.lang.Number) (vlist.get(i)));
				double v = n.doubleValue();
				minval = java.lang.Math.min(minval, v);
				maxval = java.lang.Math.max(maxval, v);
			}
			if ((org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.maximumRangeValue) == null) {
				org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.maximumRangeValue = new java.lang.Double(maxval);
			}else
				if (maxval > (org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.maximumRangeValue.doubleValue())) {
					org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.maximumRangeValue = new java.lang.Double(maxval);
				}
			
			if ((org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.minimumRangeValue) == null) {
				org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.minimumRangeValue = new java.lang.Double(minval);
			}else
				if (minval < (org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.minimumRangeValue.doubleValue())) {
					org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.minimumRangeValue = new java.lang.Double(minval);
				}
			
			org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.rangeBounds = new org.jfree.data.Range(org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.minimumRangeValue.doubleValue(), org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.maximumRangeValue.doubleValue());
		}
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public java.util.List getValues(int row, int column) {
		java.util.List values = ((java.util.List) (org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.data.getObject(row, column)));
		if (values != null) {
			return java.util.Collections.unmodifiableList(values);
		}else {
			return java.util.Collections.EMPTY_LIST;
		}
	}

	public java.util.List getValues(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		return java.util.Collections.unmodifiableList(((java.util.List) (org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.data.getObject(rowKey, columnKey))));
	}

	public java.lang.Number getValue(java.lang.Comparable row, java.lang.Comparable column) {
		java.util.List l = ((java.util.List) (org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.data.getObject(row, column)));
		double average = 0.0;
		int count = 0;
		if ((l != null) && ((l.size()) > 0)) {
			for (int i = 0; i < (l.size()); i++) {
				java.lang.Number n = ((java.lang.Number) (l.get(i)));
				average += n.doubleValue();
				count += 1;
			}
			if (count > 0) {
				average = average / count;
			}
		}
		if (count == 0) {
			return null;
		}
		return new java.lang.Double(average);
	}

	public java.lang.Number getValue(int row, int column) {
		java.util.List l = ((java.util.List) (org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.data.getObject(row, column)));
		double average = 0.0;
		int count = 0;
		if ((l != null) && ((l.size()) > 0)) {
			for (int i = 0; i < (l.size()); i++) {
				java.lang.Number n = ((java.lang.Number) (l.get(i)));
				average += n.doubleValue();
				count += 1;
			}
			if (count > 0) {
				average = average / count;
			}
		}
		if (count == 0) {
			return null;
		}
		return new java.lang.Double(average);
	}

	public int getColumnIndex(java.lang.Comparable key) {
		return org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.data.getColumnIndex(key);
	}

	public java.lang.Comparable getColumnKey(int column) {
		return org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.data.getColumnKey(column);
	}

	public java.util.List getColumnKeys() {
		return org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.data.getColumnKeys();
	}

	public int getRowIndex(java.lang.Comparable key) {
		return org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.data.getRowIndex(key);
	}

	public java.lang.Comparable getRowKey(int row) {
		return org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.data.getRowKey(row);
	}

	public java.util.List getRowKeys() {
		return org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.data.getRowKeys();
	}

	public int getRowCount() {
		return org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.data.getRowCount();
	}

	public int getColumnCount() {
		return org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.data.getColumnCount();
	}

	public double getRangeLowerBound(boolean includeInterval) {
		double result = java.lang.Double.NaN;
		if ((org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.minimumRangeValue) != null) {
			result = org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.minimumRangeValue.doubleValue();
		}
		return result;
	}

	public double getRangeUpperBound(boolean includeInterval) {
		double result = java.lang.Double.NaN;
		if ((org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.maximumRangeValue) != null) {
			result = org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.maximumRangeValue.doubleValue();
		}
		return result;
	}

	public org.jfree.data.Range getRangeBounds(boolean includeInterval) {
		return org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.rangeBounds;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.statistics.DefaultMultiValueCategoryDataset)) {
			return false;
		}
		org.jfree.data.statistics.DefaultMultiValueCategoryDataset that = ((org.jfree.data.statistics.DefaultMultiValueCategoryDataset) (obj));
		return org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.data.equals(that.data);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.statistics.DefaultMultiValueCategoryDataset clone = ((org.jfree.data.statistics.DefaultMultiValueCategoryDataset) (super.clone()));
		clone.data = ((org.jfree.data.KeyedObjects2D) (org.jfree.data.statistics.DefaultMultiValueCategoryDataset.this.data.clone()));
		return clone;
	}
}


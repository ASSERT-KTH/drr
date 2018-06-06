

package org.jfree.data.category;


public class CategoryToPieDataset extends org.jfree.data.pie.AbstractPieDataset implements org.jfree.data.event.DatasetChangeListener , org.jfree.data.pie.PieDataset {
	static final long serialVersionUID = 5516396319762189617L;

	private org.jfree.data.category.CategoryDataset source;

	private org.jfree.chart.util.TableOrder extract;

	private int index;

	public CategoryToPieDataset(org.jfree.data.category.CategoryDataset source, org.jfree.chart.util.TableOrder extract, int index) {
		if (extract == null) {
			throw new java.lang.IllegalArgumentException("Null 'extract' argument.");
		}
		org.jfree.data.category.CategoryToPieDataset.this.source = source;
		if ((org.jfree.data.category.CategoryToPieDataset.this.source) != null) {
			org.jfree.data.category.CategoryToPieDataset.this.source.addChangeListener(org.jfree.data.category.CategoryToPieDataset.this);
		}
		org.jfree.data.category.CategoryToPieDataset.this.extract = extract;
		org.jfree.data.category.CategoryToPieDataset.this.index = index;
	}

	public org.jfree.data.category.CategoryDataset getUnderlyingDataset() {
		return org.jfree.data.category.CategoryToPieDataset.this.source;
	}

	public org.jfree.chart.util.TableOrder getExtractType() {
		return org.jfree.data.category.CategoryToPieDataset.this.extract;
	}

	public int getExtractIndex() {
		return org.jfree.data.category.CategoryToPieDataset.this.index;
	}

	public int getItemCount() {
		int result = 0;
		if ((org.jfree.data.category.CategoryToPieDataset.this.source) != null) {
			if ((org.jfree.data.category.CategoryToPieDataset.this.extract) == (org.jfree.chart.util.TableOrder.BY_ROW)) {
				result = org.jfree.data.category.CategoryToPieDataset.this.source.getColumnCount();
			}else
				if ((org.jfree.data.category.CategoryToPieDataset.this.extract) == (org.jfree.chart.util.TableOrder.BY_COLUMN)) {
					result = org.jfree.data.category.CategoryToPieDataset.this.source.getRowCount();
				}
			
		}
		return result;
	}

	public java.lang.Number getValue(int item) {
		java.lang.Number result = null;
		if ((item < 0) || (item >= (getItemCount()))) {
			throw new java.lang.IndexOutOfBoundsException("The 'item' index is out of bounds.");
		}
		if ((org.jfree.data.category.CategoryToPieDataset.this.extract) == (org.jfree.chart.util.TableOrder.BY_ROW)) {
			result = org.jfree.data.category.CategoryToPieDataset.this.source.getValue(org.jfree.data.category.CategoryToPieDataset.this.index, item);
		}else
			if ((org.jfree.data.category.CategoryToPieDataset.this.extract) == (org.jfree.chart.util.TableOrder.BY_COLUMN)) {
				result = org.jfree.data.category.CategoryToPieDataset.this.source.getValue(item, org.jfree.data.category.CategoryToPieDataset.this.index);
			}
		
		return result;
	}

	public java.lang.Comparable getKey(int index) {
		java.lang.Comparable result = null;
		if ((index < 0) || (index >= (getItemCount()))) {
			throw new java.lang.IndexOutOfBoundsException(("Invalid 'index': " + index));
		}
		if ((org.jfree.data.category.CategoryToPieDataset.this.extract) == (org.jfree.chart.util.TableOrder.BY_ROW)) {
			result = org.jfree.data.category.CategoryToPieDataset.this.source.getColumnKey(index);
		}else
			if ((org.jfree.data.category.CategoryToPieDataset.this.extract) == (org.jfree.chart.util.TableOrder.BY_COLUMN)) {
				result = org.jfree.data.category.CategoryToPieDataset.this.source.getRowKey(index);
			}
		
		return result;
	}

	public int getIndex(java.lang.Comparable key) {
		int result = -1;
		if ((org.jfree.data.category.CategoryToPieDataset.this.source) != null) {
			if ((org.jfree.data.category.CategoryToPieDataset.this.extract) == (org.jfree.chart.util.TableOrder.BY_ROW)) {
				result = org.jfree.data.category.CategoryToPieDataset.this.source.getColumnIndex(key);
			}else
				if ((org.jfree.data.category.CategoryToPieDataset.this.extract) == (org.jfree.chart.util.TableOrder.BY_COLUMN)) {
					result = org.jfree.data.category.CategoryToPieDataset.this.source.getRowIndex(key);
				}
			
		}
		return result;
	}

	public java.util.List getKeys() {
		java.util.List result = java.util.Collections.EMPTY_LIST;
		if ((org.jfree.data.category.CategoryToPieDataset.this.source) != null) {
			if ((org.jfree.data.category.CategoryToPieDataset.this.extract) == (org.jfree.chart.util.TableOrder.BY_ROW)) {
				result = org.jfree.data.category.CategoryToPieDataset.this.source.getColumnKeys();
			}else
				if ((org.jfree.data.category.CategoryToPieDataset.this.extract) == (org.jfree.chart.util.TableOrder.BY_COLUMN)) {
					result = org.jfree.data.category.CategoryToPieDataset.this.source.getRowKeys();
				}
			
		}
		return result;
	}

	public java.lang.Number getValue(java.lang.Comparable key) {
		java.lang.Number result = null;
		int keyIndex = getIndex(key);
		if (keyIndex != (-1)) {
			if ((org.jfree.data.category.CategoryToPieDataset.this.extract) == (org.jfree.chart.util.TableOrder.BY_ROW)) {
				result = org.jfree.data.category.CategoryToPieDataset.this.source.getValue(org.jfree.data.category.CategoryToPieDataset.this.index, keyIndex);
			}else
				if ((org.jfree.data.category.CategoryToPieDataset.this.extract) == (org.jfree.chart.util.TableOrder.BY_COLUMN)) {
					result = org.jfree.data.category.CategoryToPieDataset.this.source.getValue(keyIndex, org.jfree.data.category.CategoryToPieDataset.this.index);
				}
			
		}
		return result;
	}

	public void datasetChanged(org.jfree.data.event.DatasetChangeEvent event) {
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.category.CategoryToPieDataset.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.pie.PieDataset)) {
			return false;
		}
		org.jfree.data.pie.PieDataset that = ((org.jfree.data.pie.PieDataset) (obj));
		int count = getItemCount();
		if ((that.getItemCount()) != count) {
			return false;
		}
		for (int i = 0; i < count; i++) {
			java.lang.Comparable k1 = getKey(i);
			java.lang.Comparable k2 = that.getKey(i);
			if (!(k1.equals(k2))) {
				return false;
			}
			java.lang.Number v1 = getValue(i);
			java.lang.Number v2 = that.getValue(i);
			if (v1 == null) {
				if (v2 != null) {
					return false;
				}
			}else {
				if (!(v1.equals(v2))) {
					return false;
				}
			}
		}
		return true;
	}
}


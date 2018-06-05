

package org.jfree.data.general;


public class DefaultPieDataset extends org.jfree.data.general.AbstractDataset implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable , org.jfree.data.general.PieDataset {
	private static final long serialVersionUID = 2904745139106540618L;

	private org.jfree.data.DefaultKeyedValues data;

	public DefaultPieDataset() {
		org.jfree.data.general.DefaultPieDataset.this.data = new org.jfree.data.DefaultKeyedValues();
	}

	public DefaultPieDataset(org.jfree.data.KeyedValues data) {
		if (data == null) {
			throw new java.lang.IllegalArgumentException("Null 'data' argument.");
		}
		org.jfree.data.general.DefaultPieDataset.this.data = new org.jfree.data.DefaultKeyedValues();
		for (int i = 0; i < (data.getItemCount()); i++) {
			org.jfree.data.general.DefaultPieDataset.this.data.addValue(data.getKey(i), data.getValue(i));
		}
	}

	public int getItemCount() {
		return org.jfree.data.general.DefaultPieDataset.this.data.getItemCount();
	}

	public java.util.List getKeys() {
		return java.util.Collections.unmodifiableList(org.jfree.data.general.DefaultPieDataset.this.data.getKeys());
	}

	public java.lang.Comparable getKey(int item) {
		return org.jfree.data.general.DefaultPieDataset.this.data.getKey(item);
	}

	public int getIndex(java.lang.Comparable key) {
		return org.jfree.data.general.DefaultPieDataset.this.data.getIndex(key);
	}

	public java.lang.Number getValue(int item) {
		java.lang.Number result = null;
		if ((getItemCount()) > item) {
			result = org.jfree.data.general.DefaultPieDataset.this.data.getValue(item);
		}
		return result;
	}

	public java.lang.Number getValue(java.lang.Comparable key) {
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		return org.jfree.data.general.DefaultPieDataset.this.data.getValue(key);
	}

	public void setValue(java.lang.Comparable key, java.lang.Number value) {
		org.jfree.data.general.DefaultPieDataset.this.data.setValue(key, value);
		fireDatasetChanged();
	}

	public void setValue(java.lang.Comparable key, double value) {
		setValue(key, new java.lang.Double(value));
	}

	public void insertValue(int position, java.lang.Comparable key, double value) {
		insertValue(position, key, new java.lang.Double(value));
	}

	public void insertValue(int position, java.lang.Comparable key, java.lang.Number value) {
		org.jfree.data.general.DefaultPieDataset.this.data.insertValue(position, key, value);
		fireDatasetChanged();
	}

	public void remove(java.lang.Comparable key) {
		org.jfree.data.general.DefaultPieDataset.this.data.removeValue(key);
		fireDatasetChanged();
	}

	public void clear() {
		if ((getItemCount()) > 0) {
			org.jfree.data.general.DefaultPieDataset.this.data.clear();
			fireDatasetChanged();
		}
	}

	public void sortByKeys(org.jfree.chart.util.SortOrder order) {
		org.jfree.data.general.DefaultPieDataset.this.data.sortByKeys(order);
		fireDatasetChanged();
	}

	public void sortByValues(org.jfree.chart.util.SortOrder order) {
		org.jfree.data.general.DefaultPieDataset.this.data.sortByValues(order);
		fireDatasetChanged();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.general.DefaultPieDataset.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.general.PieDataset)) {
			return false;
		}
		org.jfree.data.general.PieDataset that = ((org.jfree.data.general.PieDataset) (obj));
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

	public int hashCode() {
		return org.jfree.data.general.DefaultPieDataset.this.data.hashCode();
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.general.DefaultPieDataset clone = ((org.jfree.data.general.DefaultPieDataset) (super.clone()));
		clone.data = ((org.jfree.data.DefaultKeyedValues) (org.jfree.data.general.DefaultPieDataset.this.data.clone()));
		return clone;
	}
}




package org.jfree.data;


public class DefaultKeyedValues implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable , org.jfree.data.KeyedValues {
	private static final long serialVersionUID = 8468154364608194797L;

	private java.util.ArrayList keys;

	private java.util.ArrayList values;

	private java.util.HashMap indexMap;

	public DefaultKeyedValues() {
		org.jfree.data.DefaultKeyedValues.this.keys = new java.util.ArrayList();
		org.jfree.data.DefaultKeyedValues.this.values = new java.util.ArrayList();
		org.jfree.data.DefaultKeyedValues.this.indexMap = new java.util.HashMap();
	}

	public int getItemCount() {
		return org.jfree.data.DefaultKeyedValues.this.indexMap.size();
	}

	public java.lang.Number getValue(int item) {
		return ((java.lang.Number) (org.jfree.data.DefaultKeyedValues.this.values.get(item)));
	}

	public java.lang.Comparable getKey(int index) {
		return ((java.lang.Comparable) (org.jfree.data.DefaultKeyedValues.this.keys.get(index)));
	}

	public int getIndex(java.lang.Comparable key) {
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		final java.lang.Integer i = ((java.lang.Integer) (org.jfree.data.DefaultKeyedValues.this.indexMap.get(key)));
		if (i == null) {
			return -1;
		}
		return i.intValue();
	}

	public java.util.List getKeys() {
		return ((java.util.List) (org.jfree.data.DefaultKeyedValues.this.keys.clone()));
	}

	public java.lang.Number getValue(java.lang.Comparable key) {
		int index = getIndex(key);
		if (index < 0) {
			throw new org.jfree.data.UnknownKeyException(("Key not found: " + key));
		}
		return getValue(index);
	}

	public void addValue(java.lang.Comparable key, double value) {
		addValue(key, new java.lang.Double(value));
	}

	public void addValue(java.lang.Comparable key, java.lang.Number value) {
		setValue(key, value);
	}

	public void setValue(java.lang.Comparable key, double value) {
		setValue(key, new java.lang.Double(value));
	}

	public void setValue(java.lang.Comparable key, java.lang.Number value) {
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		int keyIndex = getIndex(key);
		if (keyIndex >= 0) {
			org.jfree.data.DefaultKeyedValues.this.keys.set(keyIndex, key);
			org.jfree.data.DefaultKeyedValues.this.values.set(keyIndex, value);
		}else {
			org.jfree.data.DefaultKeyedValues.this.keys.add(key);
			org.jfree.data.DefaultKeyedValues.this.values.add(value);
			org.jfree.data.DefaultKeyedValues.this.indexMap.put(key, new java.lang.Integer(((org.jfree.data.DefaultKeyedValues.this.keys.size()) - 1)));
		}
	}

	public void insertValue(int position, java.lang.Comparable key, double value) {
		insertValue(position, key, new java.lang.Double(value));
	}

	public void insertValue(int position, java.lang.Comparable key, java.lang.Number value) {
		if ((position < 0) || (position > (getItemCount()))) {
			throw new java.lang.IllegalArgumentException("'position' out of bounds.");
		}
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		int pos = getIndex(key);
		if (pos == position) {
			org.jfree.data.DefaultKeyedValues.this.keys.set(pos, key);
			org.jfree.data.DefaultKeyedValues.this.values.set(pos, value);
		}else {
			if (pos >= 0) {
				org.jfree.data.DefaultKeyedValues.this.keys.remove(pos);
				org.jfree.data.DefaultKeyedValues.this.values.remove(pos);
			}
			org.jfree.data.DefaultKeyedValues.this.keys.add(position, key);
			org.jfree.data.DefaultKeyedValues.this.values.add(position, value);
			rebuildIndex();
		}
	}

	private void rebuildIndex() {
		org.jfree.data.DefaultKeyedValues.this.indexMap.clear();
		for (int i = 0; i < (org.jfree.data.DefaultKeyedValues.this.keys.size()); i++) {
			final java.lang.Object key = org.jfree.data.DefaultKeyedValues.this.keys.get(i);
			org.jfree.data.DefaultKeyedValues.this.indexMap.put(key, new java.lang.Integer(i));
		}
	}

	public void removeValue(int index) {
		org.jfree.data.DefaultKeyedValues.this.keys.remove(index);
		org.jfree.data.DefaultKeyedValues.this.values.remove(index);
		rebuildIndex();
	}

	public void removeValue(java.lang.Comparable key) {
		int index = getIndex(key);
		if (index < 0) {
			throw new org.jfree.data.UnknownKeyException((("The key (" + key) + ") is not recognised."));
		}
		removeValue(index);
	}

	public void clear() {
		org.jfree.data.DefaultKeyedValues.this.keys.clear();
		org.jfree.data.DefaultKeyedValues.this.values.clear();
		org.jfree.data.DefaultKeyedValues.this.indexMap.clear();
	}

	public void sortByKeys(org.jfree.chart.util.SortOrder order) {
		final int size = org.jfree.data.DefaultKeyedValues.this.keys.size();
		final org.jfree.data.DefaultKeyedValue[] data = new org.jfree.data.DefaultKeyedValue[size];
		for (int i = 0; i < size; i++) {
			data[i] = new org.jfree.data.DefaultKeyedValue(((java.lang.Comparable) (org.jfree.data.DefaultKeyedValues.this.keys.get(i))), ((java.lang.Number) (org.jfree.data.DefaultKeyedValues.this.values.get(i))));
		}
		java.util.Comparator comparator = new org.jfree.data.KeyedValueComparator(org.jfree.data.KeyedValueComparatorType.BY_KEY, order);
		java.util.Arrays.sort(data, comparator);
		clear();
		for (int i = 0; i < (data.length); i++) {
			final org.jfree.data.DefaultKeyedValue value = data[i];
			addValue(value.getKey(), value.getValue());
		}
	}

	public void sortByValues(org.jfree.chart.util.SortOrder order) {
		final int size = org.jfree.data.DefaultKeyedValues.this.keys.size();
		final org.jfree.data.DefaultKeyedValue[] data = new org.jfree.data.DefaultKeyedValue[size];
		for (int i = 0; i < size; i++) {
			data[i] = new org.jfree.data.DefaultKeyedValue(((java.lang.Comparable) (org.jfree.data.DefaultKeyedValues.this.keys.get(i))), ((java.lang.Number) (org.jfree.data.DefaultKeyedValues.this.values.get(i))));
		}
		java.util.Comparator comparator = new org.jfree.data.KeyedValueComparator(org.jfree.data.KeyedValueComparatorType.BY_VALUE, order);
		java.util.Arrays.sort(data, comparator);
		clear();
		for (int i = 0; i < (data.length); i++) {
			final org.jfree.data.DefaultKeyedValue value = data[i];
			addValue(value.getKey(), value.getValue());
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.DefaultKeyedValues.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.KeyedValues)) {
			return false;
		}
		org.jfree.data.KeyedValues that = ((org.jfree.data.KeyedValues) (obj));
		int count = getItemCount();
		if (count != (that.getItemCount())) {
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
		return (org.jfree.data.DefaultKeyedValues.this.keys) != null ? org.jfree.data.DefaultKeyedValues.this.keys.hashCode() : 0;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.DefaultKeyedValues clone = ((org.jfree.data.DefaultKeyedValues) (super.clone()));
		clone.keys = ((java.util.ArrayList) (org.jfree.data.DefaultKeyedValues.this.keys.clone()));
		clone.values = ((java.util.ArrayList) (org.jfree.data.DefaultKeyedValues.this.values.clone()));
		clone.indexMap = ((java.util.HashMap) (org.jfree.data.DefaultKeyedValues.this.indexMap.clone()));
		return clone;
	}
}




package org.jfree.data;


public class DefaultKeyedValues implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable , org.jfree.data.KeyedValues {
	private static final long serialVersionUID = 8468154364608194797L;

	private java.util.List data;

	public DefaultKeyedValues() {
		org.jfree.data.DefaultKeyedValues.this.data = new java.util.ArrayList();
	}

	public int getItemCount() {
		return org.jfree.data.DefaultKeyedValues.this.data.size();
	}

	public java.lang.Number getValue(int item) {
		java.lang.Number result = null;
		org.jfree.data.KeyedValue kval = ((org.jfree.data.KeyedValue) (org.jfree.data.DefaultKeyedValues.this.data.get(item)));
		if (kval != null) {
			result = kval.getValue();
		}
		return result;
	}

	public java.lang.Comparable getKey(int index) {
		java.lang.Comparable result = null;
		org.jfree.data.KeyedValue item = ((org.jfree.data.KeyedValue) (org.jfree.data.DefaultKeyedValues.this.data.get(index)));
		if (item != null) {
			result = item.getKey();
		}
		return result;
	}

	public int getIndex(java.lang.Comparable key) {
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		int i = 0;
		java.util.Iterator iterator = org.jfree.data.DefaultKeyedValues.this.data.iterator();
		while (iterator.hasNext()) {
			org.jfree.data.KeyedValue kv = ((org.jfree.data.KeyedValue) (iterator.next()));
			if (kv.getKey().equals(key)) {
				return i;
			}
			i++;
		} 
		return -1;
	}

	public java.util.List getKeys() {
		java.util.List result = new java.util.ArrayList();
		java.util.Iterator iterator = org.jfree.data.DefaultKeyedValues.this.data.iterator();
		while (iterator.hasNext()) {
			org.jfree.data.KeyedValue kv = ((org.jfree.data.KeyedValue) (iterator.next()));
			result.add(kv.getKey());
		} 
		return result;
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
			org.jfree.data.DefaultKeyedValue kv = ((org.jfree.data.DefaultKeyedValue) (org.jfree.data.DefaultKeyedValues.this.data.get(keyIndex)));
			kv.setValue(value);
		}else {
			org.jfree.data.KeyedValue kv = new org.jfree.data.DefaultKeyedValue(key, value);
			org.jfree.data.DefaultKeyedValues.this.data.add(kv);
		}
	}

	public void insertValue(int position, java.lang.Comparable key, double value) {
		insertValue(position, key, new java.lang.Double(value));
	}

	public void insertValue(int position, java.lang.Comparable key, java.lang.Number value) {
		if ((position < 0) || (position > (org.jfree.data.DefaultKeyedValues.this.data.size()))) {
			throw new java.lang.IllegalArgumentException("'position' out of bounds.");
		}
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		int pos = org.jfree.data.DefaultKeyedValues.this.getIndex(key);
		if (pos >= 0) {
			org.jfree.data.DefaultKeyedValues.this.data.remove(pos);
		}
		org.jfree.data.KeyedValue kv = new org.jfree.data.DefaultKeyedValue(key, value);
		if (position <= (org.jfree.data.DefaultKeyedValues.this.data.size())) {
			org.jfree.data.DefaultKeyedValues.this.data.add(position, kv);
		}else {
			org.jfree.data.DefaultKeyedValues.this.data.add(kv);
		}
	}

	public void removeValue(int index) {
		org.jfree.data.DefaultKeyedValues.this.data.remove(index);
	}

	public void removeValue(java.lang.Comparable key) {
		int index = getIndex(key);
		if (index >= 0) {
			removeValue(index);
		}
	}

	public void clear() {
		org.jfree.data.DefaultKeyedValues.this.data.clear();
	}

	public void sortByKeys(org.jfree.chart.util.SortOrder order) {
		java.util.Comparator comparator = new org.jfree.data.KeyedValueComparator(org.jfree.data.KeyedValueComparatorType.BY_KEY, order);
		java.util.Collections.sort(org.jfree.data.DefaultKeyedValues.this.data, comparator);
	}

	public void sortByValues(org.jfree.chart.util.SortOrder order) {
		java.util.Comparator comparator = new org.jfree.data.KeyedValueComparator(org.jfree.data.KeyedValueComparatorType.BY_VALUE, order);
		java.util.Collections.sort(org.jfree.data.DefaultKeyedValues.this.data, comparator);
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
		return (org.jfree.data.DefaultKeyedValues.this.data) != null ? org.jfree.data.DefaultKeyedValues.this.data.hashCode() : 0;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.DefaultKeyedValues clone = ((org.jfree.data.DefaultKeyedValues) (super.clone()));
		clone.data = ((java.util.List) (org.jfree.chart.util.ObjectUtilities.deepClone(org.jfree.data.DefaultKeyedValues.this.data)));
		return clone;
	}
}




package org.jfree.data;


public class DefaultKeyedValues2D implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable , org.jfree.data.KeyedValues2D {
	private static final long serialVersionUID = -5514169970951994748L;

	private java.util.List rowKeys;

	private java.util.List columnKeys;

	private java.util.List rows;

	private boolean sortRowKeys;

	public DefaultKeyedValues2D() {
		this(false);
	}

	public DefaultKeyedValues2D(boolean sortRowKeys) {
		org.jfree.data.DefaultKeyedValues2D.this.rowKeys = new java.util.ArrayList();
		org.jfree.data.DefaultKeyedValues2D.this.columnKeys = new java.util.ArrayList();
		org.jfree.data.DefaultKeyedValues2D.this.rows = new java.util.ArrayList();
		org.jfree.data.DefaultKeyedValues2D.this.sortRowKeys = sortRowKeys;
	}

	public int getRowCount() {
		return org.jfree.data.DefaultKeyedValues2D.this.rowKeys.size();
	}

	public int getColumnCount() {
		return org.jfree.data.DefaultKeyedValues2D.this.columnKeys.size();
	}

	public java.lang.Number getValue(int row, int column) {
		java.lang.Number result = null;
		org.jfree.data.DefaultKeyedValues rowData = ((org.jfree.data.DefaultKeyedValues) (org.jfree.data.DefaultKeyedValues2D.this.rows.get(row)));
		if (rowData != null) {
			java.lang.Comparable columnKey = ((java.lang.Comparable) (org.jfree.data.DefaultKeyedValues2D.this.columnKeys.get(column)));
			int index = rowData.getIndex(columnKey);
			if (index >= 0) {
				result = rowData.getValue(index);
			}
		}
		return result;
	}

	public java.lang.Comparable getRowKey(int row) {
		return ((java.lang.Comparable) (org.jfree.data.DefaultKeyedValues2D.this.rowKeys.get(row)));
	}

	public int getRowIndex(java.lang.Comparable key) {
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		if (org.jfree.data.DefaultKeyedValues2D.this.sortRowKeys) {
			return java.util.Collections.binarySearch(org.jfree.data.DefaultKeyedValues2D.this.rowKeys, key);
		}else {
			return org.jfree.data.DefaultKeyedValues2D.this.rowKeys.indexOf(key);
		}
	}

	public java.util.List getRowKeys() {
		return java.util.Collections.unmodifiableList(org.jfree.data.DefaultKeyedValues2D.this.rowKeys);
	}

	public java.lang.Comparable getColumnKey(int column) {
		return ((java.lang.Comparable) (org.jfree.data.DefaultKeyedValues2D.this.columnKeys.get(column)));
	}

	public int getColumnIndex(java.lang.Comparable key) {
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		return org.jfree.data.DefaultKeyedValues2D.this.columnKeys.indexOf(key);
	}

	public java.util.List getColumnKeys() {
		return java.util.Collections.unmodifiableList(org.jfree.data.DefaultKeyedValues2D.this.columnKeys);
	}

	public java.lang.Number getValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		if (rowKey == null) {
			throw new java.lang.IllegalArgumentException("Null 'rowKey' argument.");
		}
		if (columnKey == null) {
			throw new java.lang.IllegalArgumentException("Null 'columnKey' argument.");
		}
		if (!(org.jfree.data.DefaultKeyedValues2D.this.columnKeys.contains(columnKey))) {
			throw new org.jfree.data.UnknownKeyException(("Unrecognised columnKey: " + columnKey));
		}
		int row = getRowIndex(rowKey);
		if (row >= 0) {
			org.jfree.data.DefaultKeyedValues rowData = ((org.jfree.data.DefaultKeyedValues) (org.jfree.data.DefaultKeyedValues2D.this.rows.get(row)));
			int col = rowData.getIndex(columnKey);
			return col >= 0 ? rowData.getValue(col) : null;
		}else {
			throw new org.jfree.data.UnknownKeyException(("Unrecognised rowKey: " + rowKey));
		}
	}

	public void addValue(java.lang.Number value, java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		setValue(value, rowKey, columnKey);
	}

	public void setValue(java.lang.Number value, java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		org.jfree.data.DefaultKeyedValues row;
		int rowIndex = getRowIndex(rowKey);
		if (rowIndex >= 0) {
			row = ((org.jfree.data.DefaultKeyedValues) (org.jfree.data.DefaultKeyedValues2D.this.rows.get(rowIndex)));
		}else {
			row = new org.jfree.data.DefaultKeyedValues();
			if (org.jfree.data.DefaultKeyedValues2D.this.sortRowKeys) {
				rowIndex = (-rowIndex) - 1;
				org.jfree.data.DefaultKeyedValues2D.this.rowKeys.add(rowIndex, rowKey);
				org.jfree.data.DefaultKeyedValues2D.this.rows.add(rowIndex, row);
			}else {
				org.jfree.data.DefaultKeyedValues2D.this.rowKeys.add(rowKey);
				org.jfree.data.DefaultKeyedValues2D.this.rows.add(row);
			}
		}
		row.setValue(columnKey, value);
		int columnIndex = org.jfree.data.DefaultKeyedValues2D.this.columnKeys.indexOf(columnKey);
		if (columnIndex < 0) {
			org.jfree.data.DefaultKeyedValues2D.this.columnKeys.add(columnKey);
		}
	}

	public void removeValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		setValue(null, rowKey, columnKey);
		boolean allNull = true;
		int rowIndex = getRowIndex(rowKey);
		org.jfree.data.DefaultKeyedValues row = ((org.jfree.data.DefaultKeyedValues) (org.jfree.data.DefaultKeyedValues2D.this.rows.get(rowIndex)));
		for (int item = 0, itemCount = row.getItemCount(); item < itemCount; item++) {
			if ((row.getValue(item)) != null) {
				allNull = false;
				break;
			}
		}
		if (allNull) {
			org.jfree.data.DefaultKeyedValues2D.this.rowKeys.remove(rowIndex);
			org.jfree.data.DefaultKeyedValues2D.this.rows.remove(rowIndex);
		}
		allNull = true;
		for (int item = 0, itemCount = org.jfree.data.DefaultKeyedValues2D.this.rows.size(); item < itemCount; item++) {
			row = ((org.jfree.data.DefaultKeyedValues) (org.jfree.data.DefaultKeyedValues2D.this.rows.get(item)));
			int columnIndex = row.getIndex(columnKey);
			if ((columnIndex >= 0) && ((row.getValue(columnIndex)) != null)) {
				allNull = false;
				break;
			}
		}
		if (allNull) {
			for (int item = 0, itemCount = org.jfree.data.DefaultKeyedValues2D.this.rows.size(); item < itemCount; item++) {
				row = ((org.jfree.data.DefaultKeyedValues) (org.jfree.data.DefaultKeyedValues2D.this.rows.get(item)));
				int columnIndex = row.getIndex(columnKey);
				if (columnIndex >= 0) {
					row.removeValue(columnIndex);
				}
			}
			org.jfree.data.DefaultKeyedValues2D.this.columnKeys.remove(columnKey);
		}
	}

	public void removeRow(int rowIndex) {
		org.jfree.data.DefaultKeyedValues2D.this.rowKeys.remove(rowIndex);
		org.jfree.data.DefaultKeyedValues2D.this.rows.remove(rowIndex);
	}

	public void removeRow(java.lang.Comparable rowKey) {
		if (rowKey == null) {
			throw new java.lang.IllegalArgumentException("Null 'rowKey' argument.");
		}
		int index = getRowIndex(rowKey);
		if (index >= 0) {
			removeRow(index);
		}else {
			throw new org.jfree.data.UnknownKeyException(("Unknown key: " + rowKey));
		}
	}

	public void removeColumn(int columnIndex) {
		java.lang.Comparable columnKey = getColumnKey(columnIndex);
		removeColumn(columnKey);
	}

	public void removeColumn(java.lang.Comparable columnKey) {
		if (columnKey == null) {
			throw new java.lang.IllegalArgumentException("Null 'columnKey' argument.");
		}
		if (!(org.jfree.data.DefaultKeyedValues2D.this.columnKeys.contains(columnKey))) {
			throw new org.jfree.data.UnknownKeyException(("Unknown key: " + columnKey));
		}
		java.util.Iterator iterator = org.jfree.data.DefaultKeyedValues2D.this.rows.iterator();
		while (iterator.hasNext()) {
			org.jfree.data.DefaultKeyedValues rowData = ((org.jfree.data.DefaultKeyedValues) (iterator.next()));
			int index = rowData.getIndex(columnKey);
			if (index >= 0) {
				rowData.removeValue(columnKey);
			}
		} 
		org.jfree.data.DefaultKeyedValues2D.this.columnKeys.remove(columnKey);
	}

	public void clear() {
		org.jfree.data.DefaultKeyedValues2D.this.rowKeys.clear();
		org.jfree.data.DefaultKeyedValues2D.this.columnKeys.clear();
		org.jfree.data.DefaultKeyedValues2D.this.rows.clear();
	}

	public boolean equals(java.lang.Object o) {
		if (o == null) {
			return false;
		}
		if (o == (org.jfree.data.DefaultKeyedValues2D.this)) {
			return true;
		}
		if (!(o instanceof org.jfree.data.KeyedValues2D)) {
			return false;
		}
		org.jfree.data.KeyedValues2D kv2D = ((org.jfree.data.KeyedValues2D) (o));
		if (!(getRowKeys().equals(kv2D.getRowKeys()))) {
			return false;
		}
		if (!(getColumnKeys().equals(kv2D.getColumnKeys()))) {
			return false;
		}
		int rowCount = getRowCount();
		if (rowCount != (kv2D.getRowCount())) {
			return false;
		}
		int colCount = getColumnCount();
		if (colCount != (kv2D.getColumnCount())) {
			return false;
		}
		for (int r = 0; r < rowCount; r++) {
			for (int c = 0; c < colCount; c++) {
				java.lang.Number v1 = getValue(r, c);
				java.lang.Number v2 = kv2D.getValue(r, c);
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
		}
		return true;
	}

	public int hashCode() {
		int result;
		result = org.jfree.data.DefaultKeyedValues2D.this.rowKeys.hashCode();
		result = (29 * result) + (org.jfree.data.DefaultKeyedValues2D.this.columnKeys.hashCode());
		result = (29 * result) + (org.jfree.data.DefaultKeyedValues2D.this.rows.hashCode());
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.DefaultKeyedValues2D clone = ((org.jfree.data.DefaultKeyedValues2D) (super.clone()));
		clone.columnKeys = new java.util.ArrayList(org.jfree.data.DefaultKeyedValues2D.this.columnKeys);
		clone.rowKeys = new java.util.ArrayList(org.jfree.data.DefaultKeyedValues2D.this.rowKeys);
		clone.rows = ((java.util.List) (org.jfree.chart.util.ObjectUtilities.deepClone(org.jfree.data.DefaultKeyedValues2D.this.rows)));
		return clone;
	}
}


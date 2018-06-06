

package org.jfree.data;


public interface KeyedValues2D extends org.jfree.data.Values2D {
	public java.lang.Comparable getRowKey(int row);

	public int getRowIndex(java.lang.Comparable key);

	public java.util.List getRowKeys();

	public java.lang.Comparable getColumnKey(int column);

	public int getColumnIndex(java.lang.Comparable key);

	public java.util.List getColumnKeys();

	public java.lang.Number getValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey);
}


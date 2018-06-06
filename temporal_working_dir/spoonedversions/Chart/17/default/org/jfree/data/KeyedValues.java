

package org.jfree.data;


public interface KeyedValues extends org.jfree.data.Values {
	public java.lang.Comparable getKey(int index);

	public int getIndex(java.lang.Comparable key);

	public java.util.List getKeys();

	public java.lang.Number getValue(java.lang.Comparable key);
}


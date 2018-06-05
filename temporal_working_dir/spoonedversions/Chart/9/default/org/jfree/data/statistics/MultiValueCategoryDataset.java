

package org.jfree.data.statistics;


public interface MultiValueCategoryDataset extends org.jfree.data.category.CategoryDataset {
	public java.util.List getValues(int row, int column);

	public java.util.List getValues(java.lang.Comparable rowKey, java.lang.Comparable columnKey);
}


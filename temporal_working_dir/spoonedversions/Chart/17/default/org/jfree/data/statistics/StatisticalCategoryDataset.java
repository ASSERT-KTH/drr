

package org.jfree.data.statistics;


public interface StatisticalCategoryDataset extends org.jfree.data.category.CategoryDataset {
	public java.lang.Number getMeanValue(int row, int column);

	public java.lang.Number getMeanValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey);

	public java.lang.Number getStdDevValue(int row, int column);

	public java.lang.Number getStdDevValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey);
}


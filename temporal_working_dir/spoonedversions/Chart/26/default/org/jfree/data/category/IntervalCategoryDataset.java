

package org.jfree.data.category;


public interface IntervalCategoryDataset extends org.jfree.data.category.CategoryDataset {
	public java.lang.Number getStartValue(int series, int category);

	public java.lang.Number getStartValue(java.lang.Comparable series, java.lang.Comparable category);

	public java.lang.Number getEndValue(int series, int category);

	public java.lang.Number getEndValue(java.lang.Comparable series, java.lang.Comparable category);
}


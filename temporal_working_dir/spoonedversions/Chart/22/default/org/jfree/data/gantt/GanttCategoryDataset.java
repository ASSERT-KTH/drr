

package org.jfree.data.gantt;


public interface GanttCategoryDataset extends org.jfree.data.category.IntervalCategoryDataset {
	public java.lang.Number getPercentComplete(int row, int column);

	public java.lang.Number getPercentComplete(java.lang.Comparable rowKey, java.lang.Comparable columnKey);

	public int getSubIntervalCount(int row, int column);

	public int getSubIntervalCount(java.lang.Comparable rowKey, java.lang.Comparable columnKey);

	public java.lang.Number getStartValue(int row, int column, int subinterval);

	public java.lang.Number getStartValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey, int subinterval);

	public java.lang.Number getEndValue(int row, int column, int subinterval);

	public java.lang.Number getEndValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey, int subinterval);

	public java.lang.Number getPercentComplete(int row, int column, int subinterval);

	public java.lang.Number getPercentComplete(java.lang.Comparable rowKey, java.lang.Comparable columnKey, int subinterval);
}


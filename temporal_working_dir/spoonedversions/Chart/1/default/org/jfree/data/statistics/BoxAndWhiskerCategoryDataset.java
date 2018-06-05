

package org.jfree.data.statistics;


public interface BoxAndWhiskerCategoryDataset extends org.jfree.data.category.CategoryDataset {
	public java.lang.Number getMeanValue(int row, int column);

	public java.lang.Number getMeanValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey);

	public java.lang.Number getMedianValue(int row, int column);

	public java.lang.Number getMedianValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey);

	public java.lang.Number getQ1Value(int row, int column);

	public java.lang.Number getQ1Value(java.lang.Comparable rowKey, java.lang.Comparable columnKey);

	public java.lang.Number getQ3Value(int row, int column);

	public java.lang.Number getQ3Value(java.lang.Comparable rowKey, java.lang.Comparable columnKey);

	public java.lang.Number getMinRegularValue(int row, int column);

	public java.lang.Number getMinRegularValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey);

	public java.lang.Number getMaxRegularValue(int row, int column);

	public java.lang.Number getMaxRegularValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey);

	public java.lang.Number getMinOutlier(int row, int column);

	public java.lang.Number getMinOutlier(java.lang.Comparable rowKey, java.lang.Comparable columnKey);

	public java.lang.Number getMaxOutlier(int row, int column);

	public java.lang.Number getMaxOutlier(java.lang.Comparable rowKey, java.lang.Comparable columnKey);

	public java.util.List getOutliers(int row, int column);

	public java.util.List getOutliers(java.lang.Comparable rowKey, java.lang.Comparable columnKey);
}


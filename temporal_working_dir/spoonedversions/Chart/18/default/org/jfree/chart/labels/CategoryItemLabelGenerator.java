

package org.jfree.chart.labels;


public interface CategoryItemLabelGenerator {
	public java.lang.String generateRowLabel(org.jfree.data.category.CategoryDataset dataset, int row);

	public java.lang.String generateColumnLabel(org.jfree.data.category.CategoryDataset dataset, int column);

	public java.lang.String generateLabel(org.jfree.data.category.CategoryDataset dataset, int row, int column);
}


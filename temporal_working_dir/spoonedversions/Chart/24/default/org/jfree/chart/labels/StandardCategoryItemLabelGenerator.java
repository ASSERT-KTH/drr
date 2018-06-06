

package org.jfree.chart.labels;


public class StandardCategoryItemLabelGenerator extends org.jfree.chart.labels.AbstractCategoryItemLabelGenerator implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.labels.CategoryItemLabelGenerator , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 3499701401211412882L;

	public static final java.lang.String DEFAULT_LABEL_FORMAT_STRING = "{2}";

	public StandardCategoryItemLabelGenerator() {
		super(org.jfree.chart.labels.StandardCategoryItemLabelGenerator.DEFAULT_LABEL_FORMAT_STRING, java.text.NumberFormat.getInstance());
	}

	public StandardCategoryItemLabelGenerator(java.lang.String labelFormat, java.text.NumberFormat formatter) {
		super(labelFormat, formatter);
	}

	public StandardCategoryItemLabelGenerator(java.lang.String labelFormat, java.text.NumberFormat formatter, java.text.NumberFormat percentFormatter) {
		super(labelFormat, formatter, percentFormatter);
	}

	public StandardCategoryItemLabelGenerator(java.lang.String labelFormat, java.text.DateFormat formatter) {
		super(labelFormat, formatter);
	}

	public java.lang.String generateLabel(org.jfree.data.category.CategoryDataset dataset, int row, int column) {
		return generateLabelString(dataset, row, column);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.labels.StandardCategoryItemLabelGenerator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.labels.StandardCategoryItemLabelGenerator)) {
			return false;
		}
		return super.equals(obj);
	}
}


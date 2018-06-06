

package org.jfree.chart.labels;


public class StandardCategoryToolTipGenerator extends org.jfree.chart.labels.AbstractCategoryItemLabelGenerator implements java.io.Serializable , org.jfree.chart.labels.CategoryToolTipGenerator {
	private static final long serialVersionUID = -6768806592218710764L;

	public static final java.lang.String DEFAULT_TOOL_TIP_FORMAT_STRING = "({0}, {1}) = {2}";

	public StandardCategoryToolTipGenerator() {
		super(org.jfree.chart.labels.StandardCategoryToolTipGenerator.DEFAULT_TOOL_TIP_FORMAT_STRING, java.text.NumberFormat.getInstance());
	}

	public StandardCategoryToolTipGenerator(java.lang.String labelFormat, java.text.NumberFormat formatter) {
		super(labelFormat, formatter);
	}

	public StandardCategoryToolTipGenerator(java.lang.String labelFormat, java.text.DateFormat formatter) {
		super(labelFormat, formatter);
	}

	public java.lang.String generateToolTip(org.jfree.data.category.CategoryDataset dataset, int row, int column) {
		return generateLabelString(dataset, row, column);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.labels.StandardCategoryToolTipGenerator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.labels.StandardCategoryToolTipGenerator)) {
			return false;
		}
		return super.equals(obj);
	}
}


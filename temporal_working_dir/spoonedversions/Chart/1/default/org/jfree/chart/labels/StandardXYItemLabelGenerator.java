

package org.jfree.chart.labels;


public class StandardXYItemLabelGenerator extends org.jfree.chart.labels.AbstractXYItemLabelGenerator implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.labels.XYItemLabelGenerator , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 7807668053171837925L;

	public static final java.lang.String DEFAULT_ITEM_LABEL_FORMAT = "{2}";

	public StandardXYItemLabelGenerator() {
		this(org.jfree.chart.labels.StandardXYItemLabelGenerator.DEFAULT_ITEM_LABEL_FORMAT, java.text.NumberFormat.getNumberInstance(), java.text.NumberFormat.getNumberInstance());
	}

	public StandardXYItemLabelGenerator(java.lang.String formatString) {
		this(formatString, java.text.NumberFormat.getNumberInstance(), java.text.NumberFormat.getNumberInstance());
	}

	public StandardXYItemLabelGenerator(java.lang.String formatString, java.text.NumberFormat xFormat, java.text.NumberFormat yFormat) {
		super(formatString, xFormat, yFormat);
	}

	public StandardXYItemLabelGenerator(java.lang.String formatString, java.text.DateFormat xFormat, java.text.NumberFormat yFormat) {
		super(formatString, xFormat, yFormat);
	}

	public StandardXYItemLabelGenerator(java.lang.String formatString, java.text.NumberFormat xFormat, java.text.DateFormat yFormat) {
		super(formatString, xFormat, yFormat);
	}

	public StandardXYItemLabelGenerator(java.lang.String formatString, java.text.DateFormat xFormat, java.text.DateFormat yFormat) {
		super(formatString, xFormat, yFormat);
	}

	public java.lang.String generateLabel(org.jfree.data.xy.XYDataset dataset, int series, int item) {
		return generateLabelString(dataset, series, item);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.labels.StandardXYItemLabelGenerator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.labels.StandardXYItemLabelGenerator)) {
			return false;
		}
		return super.equals(obj);
	}
}


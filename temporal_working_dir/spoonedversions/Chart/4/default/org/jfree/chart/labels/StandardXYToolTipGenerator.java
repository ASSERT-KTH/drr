

package org.jfree.chart.labels;


public class StandardXYToolTipGenerator extends org.jfree.chart.labels.AbstractXYItemLabelGenerator implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.labels.XYToolTipGenerator , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -3564164459039540784L;

	public static final java.lang.String DEFAULT_TOOL_TIP_FORMAT = "{0}: ({1}, {2})";

	public static org.jfree.chart.labels.StandardXYToolTipGenerator getTimeSeriesInstance() {
		return new org.jfree.chart.labels.StandardXYToolTipGenerator(org.jfree.chart.labels.StandardXYToolTipGenerator.DEFAULT_TOOL_TIP_FORMAT, java.text.DateFormat.getInstance(), java.text.NumberFormat.getInstance());
	}

	public StandardXYToolTipGenerator() {
		this(org.jfree.chart.labels.StandardXYToolTipGenerator.DEFAULT_TOOL_TIP_FORMAT, java.text.NumberFormat.getNumberInstance(), java.text.NumberFormat.getNumberInstance());
	}

	public StandardXYToolTipGenerator(java.lang.String formatString, java.text.NumberFormat xFormat, java.text.NumberFormat yFormat) {
		super(formatString, xFormat, yFormat);
	}

	public StandardXYToolTipGenerator(java.lang.String formatString, java.text.DateFormat xFormat, java.text.NumberFormat yFormat) {
		super(formatString, xFormat, yFormat);
	}

	public StandardXYToolTipGenerator(java.lang.String formatString, java.text.NumberFormat xFormat, java.text.DateFormat yFormat) {
		super(formatString, xFormat, yFormat);
	}

	public StandardXYToolTipGenerator(java.lang.String formatString, java.text.DateFormat xFormat, java.text.DateFormat yFormat) {
		super(formatString, xFormat, yFormat);
	}

	public java.lang.String generateToolTip(org.jfree.data.xy.XYDataset dataset, int series, int item) {
		return generateLabelString(dataset, series, item);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.labels.StandardXYToolTipGenerator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.labels.StandardXYToolTipGenerator)) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}


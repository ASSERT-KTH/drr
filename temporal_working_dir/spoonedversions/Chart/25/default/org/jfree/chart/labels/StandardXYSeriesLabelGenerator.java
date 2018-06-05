

package org.jfree.chart.labels;


public class StandardXYSeriesLabelGenerator implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.labels.XYSeriesLabelGenerator , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 1916017081848400024L;

	public static final java.lang.String DEFAULT_LABEL_FORMAT = "{0}";

	private java.lang.String formatPattern;

	public StandardXYSeriesLabelGenerator() {
		this(org.jfree.chart.labels.StandardXYSeriesLabelGenerator.DEFAULT_LABEL_FORMAT);
	}

	public StandardXYSeriesLabelGenerator(java.lang.String format) {
		if (format == null) {
			throw new java.lang.IllegalArgumentException("Null 'format' argument.");
		}
		org.jfree.chart.labels.StandardXYSeriesLabelGenerator.this.formatPattern = format;
	}

	public java.lang.String generateLabel(org.jfree.data.xy.XYDataset dataset, int series) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		java.lang.String label = java.text.MessageFormat.format(org.jfree.chart.labels.StandardXYSeriesLabelGenerator.this.formatPattern, createItemArray(dataset, series));
		return label;
	}

	protected java.lang.Object[] createItemArray(org.jfree.data.xy.XYDataset dataset, int series) {
		java.lang.Object[] result = new java.lang.Object[1];
		result[0] = dataset.getSeriesKey(series).toString();
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.labels.StandardXYSeriesLabelGenerator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.labels.StandardXYSeriesLabelGenerator)) {
			return false;
		}
		org.jfree.chart.labels.StandardXYSeriesLabelGenerator that = ((org.jfree.chart.labels.StandardXYSeriesLabelGenerator) (obj));
		if (!(org.jfree.chart.labels.StandardXYSeriesLabelGenerator.this.formatPattern.equals(that.formatPattern))) {
			return false;
		}
		return true;
	}
}


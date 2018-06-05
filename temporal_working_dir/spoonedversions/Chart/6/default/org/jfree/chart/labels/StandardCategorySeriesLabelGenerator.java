

package org.jfree.chart.labels;


public class StandardCategorySeriesLabelGenerator implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.labels.CategorySeriesLabelGenerator , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 4630760091523940820L;

	public static final java.lang.String DEFAULT_LABEL_FORMAT = "{0}";

	private java.lang.String formatPattern;

	public StandardCategorySeriesLabelGenerator() {
		this(org.jfree.chart.labels.StandardCategorySeriesLabelGenerator.DEFAULT_LABEL_FORMAT);
	}

	public StandardCategorySeriesLabelGenerator(java.lang.String format) {
		if (format == null) {
			throw new java.lang.IllegalArgumentException("Null 'format' argument.");
		}
		org.jfree.chart.labels.StandardCategorySeriesLabelGenerator.this.formatPattern = format;
	}

	public java.lang.String generateLabel(org.jfree.data.category.CategoryDataset dataset, int series) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		java.lang.String label = java.text.MessageFormat.format(org.jfree.chart.labels.StandardCategorySeriesLabelGenerator.this.formatPattern, createItemArray(dataset, series));
		return label;
	}

	protected java.lang.Object[] createItemArray(org.jfree.data.category.CategoryDataset dataset, int series) {
		java.lang.Object[] result = new java.lang.Object[1];
		result[0] = dataset.getRowKey(series).toString();
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.labels.StandardCategorySeriesLabelGenerator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.labels.StandardCategorySeriesLabelGenerator)) {
			return false;
		}
		org.jfree.chart.labels.StandardCategorySeriesLabelGenerator that = ((org.jfree.chart.labels.StandardCategorySeriesLabelGenerator) (obj));
		if (!(org.jfree.chart.labels.StandardCategorySeriesLabelGenerator.this.formatPattern.equals(that.formatPattern))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 127;
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.labels.StandardCategorySeriesLabelGenerator.this.formatPattern);
		return result;
	}
}


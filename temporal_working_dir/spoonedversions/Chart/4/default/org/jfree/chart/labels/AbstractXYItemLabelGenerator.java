

package org.jfree.chart.labels;


public class AbstractXYItemLabelGenerator implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = 5869744396278660636L;

	private java.lang.String formatString;

	private java.text.NumberFormat xFormat;

	private java.text.DateFormat xDateFormat;

	private java.text.NumberFormat yFormat;

	private java.text.DateFormat yDateFormat;

	private java.lang.String nullYString = "null";

	protected AbstractXYItemLabelGenerator() {
		this("{2}", java.text.NumberFormat.getNumberInstance(), java.text.NumberFormat.getNumberInstance());
	}

	protected AbstractXYItemLabelGenerator(java.lang.String formatString, java.text.NumberFormat xFormat, java.text.NumberFormat yFormat) {
		if (formatString == null) {
			throw new java.lang.IllegalArgumentException("Null 'formatString' argument.");
		}
		if (xFormat == null) {
			throw new java.lang.IllegalArgumentException("Null 'xFormat' argument.");
		}
		if (yFormat == null) {
			throw new java.lang.IllegalArgumentException("Null 'yFormat' argument.");
		}
		org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.formatString = formatString;
		org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.xFormat = xFormat;
		org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.yFormat = yFormat;
	}

	protected AbstractXYItemLabelGenerator(java.lang.String formatString, java.text.DateFormat xFormat, java.text.NumberFormat yFormat) {
		this(formatString, java.text.NumberFormat.getInstance(), yFormat);
		org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.xDateFormat = xFormat;
	}

	protected AbstractXYItemLabelGenerator(java.lang.String formatString, java.text.NumberFormat xFormat, java.text.DateFormat yFormat) {
		this(formatString, xFormat, java.text.NumberFormat.getInstance());
		org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.yDateFormat = yFormat;
	}

	protected AbstractXYItemLabelGenerator(java.lang.String formatString, java.text.DateFormat xFormat, java.text.DateFormat yFormat) {
		this(formatString, java.text.NumberFormat.getInstance(), java.text.NumberFormat.getInstance());
		org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.xDateFormat = xFormat;
		org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.yDateFormat = yFormat;
	}

	public java.lang.String getFormatString() {
		return org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.formatString;
	}

	public java.text.NumberFormat getXFormat() {
		return org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.xFormat;
	}

	public java.text.DateFormat getXDateFormat() {
		return org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.xDateFormat;
	}

	public java.text.NumberFormat getYFormat() {
		return org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.yFormat;
	}

	public java.text.DateFormat getYDateFormat() {
		return org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.yDateFormat;
	}

	public java.lang.String generateLabelString(org.jfree.data.xy.XYDataset dataset, int series, int item) {
		java.lang.String result = null;
		java.lang.Object[] items = createItemArray(dataset, series, item);
		result = java.text.MessageFormat.format(org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.formatString, items);
		return result;
	}

	public java.lang.String getNullYString() {
		return org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.nullYString;
	}

	protected java.lang.Object[] createItemArray(org.jfree.data.xy.XYDataset dataset, int series, int item) {
		java.lang.Object[] result = new java.lang.Object[3];
		result[0] = dataset.getSeriesKey(series).toString();
		double x = dataset.getXValue(series, item);
		if ((org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.xDateFormat) != null) {
			result[1] = org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.xDateFormat.format(new java.util.Date(((long) (x))));
		}else {
			result[1] = org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.xFormat.format(x);
		}
		double y = dataset.getYValue(series, item);
		if ((java.lang.Double.isNaN(y)) && ((dataset.getY(series, item)) == null)) {
			result[2] = org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.nullYString;
		}else {
			if ((org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.yDateFormat) != null) {
				result[2] = org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.yDateFormat.format(new java.util.Date(((long) (y))));
			}else {
				result[2] = org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.yFormat.format(y);
			}
		}
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.labels.AbstractXYItemLabelGenerator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.labels.AbstractXYItemLabelGenerator)) {
			return false;
		}
		org.jfree.chart.labels.AbstractXYItemLabelGenerator that = ((org.jfree.chart.labels.AbstractXYItemLabelGenerator) (obj));
		if (!(org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.formatString.equals(that.formatString))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.xFormat, that.xFormat))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.xDateFormat, that.xDateFormat))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.yFormat, that.yFormat))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.yDateFormat, that.yDateFormat))) {
			return false;
		}
		if (!(org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.nullYString.equals(that.nullYString))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 127;
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.formatString);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.xFormat);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.xDateFormat);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.yFormat);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.yDateFormat);
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.labels.AbstractXYItemLabelGenerator clone = ((org.jfree.chart.labels.AbstractXYItemLabelGenerator) (super.clone()));
		if ((org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.xFormat) != null) {
			clone.xFormat = ((java.text.NumberFormat) (org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.xFormat.clone()));
		}
		if ((org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.yFormat) != null) {
			clone.yFormat = ((java.text.NumberFormat) (org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.yFormat.clone()));
		}
		if ((org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.xDateFormat) != null) {
			clone.xDateFormat = ((java.text.DateFormat) (org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.xDateFormat.clone()));
		}
		if ((org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.yDateFormat) != null) {
			clone.yDateFormat = ((java.text.DateFormat) (org.jfree.chart.labels.AbstractXYItemLabelGenerator.this.yDateFormat.clone()));
		}
		return clone;
	}
}


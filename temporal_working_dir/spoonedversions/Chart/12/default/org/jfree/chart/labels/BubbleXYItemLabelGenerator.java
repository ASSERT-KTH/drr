

package org.jfree.chart.labels;


public class BubbleXYItemLabelGenerator extends org.jfree.chart.labels.AbstractXYItemLabelGenerator implements java.io.Serializable , org.jfree.chart.labels.XYItemLabelGenerator {
	static final long serialVersionUID = -8458568928021240922L;

	public static final java.lang.String DEFAULT_FORMAT_STRING = "{3}";

	private java.text.NumberFormat zFormat;

	private java.text.DateFormat zDateFormat;

	public BubbleXYItemLabelGenerator() {
		this(org.jfree.chart.labels.BubbleXYItemLabelGenerator.DEFAULT_FORMAT_STRING, java.text.NumberFormat.getNumberInstance(), java.text.NumberFormat.getNumberInstance(), java.text.NumberFormat.getNumberInstance());
	}

	public BubbleXYItemLabelGenerator(java.lang.String formatString, java.text.NumberFormat xFormat, java.text.NumberFormat yFormat, java.text.NumberFormat zFormat) {
		super(formatString, xFormat, yFormat);
		if (zFormat == null) {
			throw new java.lang.IllegalArgumentException("Null 'zFormat' argument.");
		}
		org.jfree.chart.labels.BubbleXYItemLabelGenerator.this.zFormat = zFormat;
	}

	public BubbleXYItemLabelGenerator(java.lang.String formatString, java.text.DateFormat xFormat, java.text.DateFormat yFormat, java.text.DateFormat zFormat) {
		super(formatString, xFormat, yFormat);
		if (zFormat == null) {
			throw new java.lang.IllegalArgumentException("Null 'zFormat' argument.");
		}
		org.jfree.chart.labels.BubbleXYItemLabelGenerator.this.zDateFormat = zFormat;
	}

	public java.text.NumberFormat getZFormat() {
		return org.jfree.chart.labels.BubbleXYItemLabelGenerator.this.zFormat;
	}

	public java.text.DateFormat getZDateFormat() {
		return org.jfree.chart.labels.BubbleXYItemLabelGenerator.this.zDateFormat;
	}

	public java.lang.String generateLabel(org.jfree.data.xy.XYDataset dataset, int series, int item) {
		return generateLabelString(dataset, series, item);
	}

	public java.lang.String generateLabelString(org.jfree.data.xy.XYDataset dataset, int series, int item) {
		java.lang.String result = null;
		java.lang.Object[] items = null;
		if (dataset instanceof org.jfree.data.xy.XYZDataset) {
			items = createItemArray(((org.jfree.data.xy.XYZDataset) (dataset)), series, item);
		}else {
			items = createItemArray(dataset, series, item);
		}
		result = java.text.MessageFormat.format(getFormatString(), items);
		return result;
	}

	protected java.lang.Object[] createItemArray(org.jfree.data.xy.XYZDataset dataset, int series, int item) {
		java.lang.Object[] result = new java.lang.Object[4];
		result[0] = dataset.getSeriesKey(series).toString();
		java.lang.Number x = dataset.getX(series, item);
		java.text.DateFormat xf = getXDateFormat();
		if (xf != null) {
			result[1] = xf.format(x);
		}else {
			result[1] = getXFormat().format(x);
		}
		java.lang.Number y = dataset.getY(series, item);
		java.text.DateFormat yf = getYDateFormat();
		if (yf != null) {
			result[2] = yf.format(y);
		}else {
			result[2] = getYFormat().format(y);
		}
		java.lang.Number z = dataset.getZ(series, item);
		if ((org.jfree.chart.labels.BubbleXYItemLabelGenerator.this.zDateFormat) != null) {
			result[3] = org.jfree.chart.labels.BubbleXYItemLabelGenerator.this.zDateFormat.format(z);
		}else {
			result[3] = org.jfree.chart.labels.BubbleXYItemLabelGenerator.this.zFormat.format(z);
		}
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.labels.BubbleXYItemLabelGenerator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.labels.BubbleXYItemLabelGenerator)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.labels.BubbleXYItemLabelGenerator that = ((org.jfree.chart.labels.BubbleXYItemLabelGenerator) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.labels.BubbleXYItemLabelGenerator.this.zFormat, that.zFormat))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.labels.BubbleXYItemLabelGenerator.this.zDateFormat, that.zDateFormat))) {
			return false;
		}
		return true;
	}
}


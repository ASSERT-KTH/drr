

package org.jfree.chart.labels;


public class StandardXYZToolTipGenerator extends org.jfree.chart.labels.StandardXYToolTipGenerator implements java.io.Serializable , org.jfree.chart.labels.XYZToolTipGenerator {
	private static final long serialVersionUID = -2961577421889473503L;

	public static final java.lang.String DEFAULT_TOOL_TIP_FORMAT = "{0}: ({1}, {2}, {3})";

	private java.text.NumberFormat zFormat;

	private java.text.DateFormat zDateFormat;

	public StandardXYZToolTipGenerator() {
		this(org.jfree.chart.labels.StandardXYZToolTipGenerator.DEFAULT_TOOL_TIP_FORMAT, java.text.NumberFormat.getNumberInstance(), java.text.NumberFormat.getNumberInstance(), java.text.NumberFormat.getNumberInstance());
	}

	public StandardXYZToolTipGenerator(java.lang.String formatString, java.text.NumberFormat xFormat, java.text.NumberFormat yFormat, java.text.NumberFormat zFormat) {
		super(formatString, xFormat, yFormat);
		if (zFormat == null) {
			throw new java.lang.IllegalArgumentException("Null 'zFormat' argument.");
		}
		org.jfree.chart.labels.StandardXYZToolTipGenerator.this.zFormat = zFormat;
	}

	public StandardXYZToolTipGenerator(java.lang.String formatString, java.text.DateFormat xFormat, java.text.DateFormat yFormat, java.text.DateFormat zFormat) {
		super(formatString, xFormat, yFormat);
		if (zFormat == null) {
			throw new java.lang.IllegalArgumentException("Null 'zFormat' argument.");
		}
		org.jfree.chart.labels.StandardXYZToolTipGenerator.this.zDateFormat = zFormat;
	}

	public java.text.NumberFormat getZFormat() {
		return org.jfree.chart.labels.StandardXYZToolTipGenerator.this.zFormat;
	}

	public java.text.DateFormat getZDateFormat() {
		return org.jfree.chart.labels.StandardXYZToolTipGenerator.this.zDateFormat;
	}

	public java.lang.String generateToolTip(org.jfree.data.xy.XYZDataset dataset, int series, int item) {
		return generateLabelString(dataset, series, item);
	}

	public java.lang.String generateLabelString(org.jfree.data.xy.XYDataset dataset, int series, int item) {
		java.lang.String result = null;
		java.lang.Object[] items = createItemArray(((org.jfree.data.xy.XYZDataset) (dataset)), series, item);
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
		if ((org.jfree.chart.labels.StandardXYZToolTipGenerator.this.zDateFormat) != null) {
			result[3] = org.jfree.chart.labels.StandardXYZToolTipGenerator.this.zDateFormat.format(z);
		}else {
			result[3] = org.jfree.chart.labels.StandardXYZToolTipGenerator.this.zFormat.format(z);
		}
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.labels.StandardXYZToolTipGenerator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.labels.StandardXYZToolTipGenerator)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.labels.StandardXYZToolTipGenerator that = ((org.jfree.chart.labels.StandardXYZToolTipGenerator) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.labels.StandardXYZToolTipGenerator.this.zFormat, that.zFormat))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.labels.StandardXYZToolTipGenerator.this.zDateFormat, that.zDateFormat))) {
			return false;
		}
		return true;
	}
}


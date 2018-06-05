

package org.jfree.chart.labels;


public class IntervalXYItemLabelGenerator extends org.jfree.chart.labels.AbstractXYItemLabelGenerator implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.labels.XYItemLabelGenerator , org.jfree.chart.util.PublicCloneable {
	public static final java.lang.String DEFAULT_ITEM_LABEL_FORMAT = "{5} - {6}";

	public IntervalXYItemLabelGenerator() {
		this(org.jfree.chart.labels.IntervalXYItemLabelGenerator.DEFAULT_ITEM_LABEL_FORMAT, java.text.NumberFormat.getNumberInstance(), java.text.NumberFormat.getNumberInstance());
	}

	public IntervalXYItemLabelGenerator(java.lang.String formatString, java.text.NumberFormat xFormat, java.text.NumberFormat yFormat) {
		super(formatString, xFormat, yFormat);
	}

	public IntervalXYItemLabelGenerator(java.lang.String formatString, java.text.DateFormat xFormat, java.text.NumberFormat yFormat) {
		super(formatString, xFormat, yFormat);
	}

	public IntervalXYItemLabelGenerator(java.lang.String formatString, java.text.NumberFormat xFormat, java.text.DateFormat yFormat) {
		super(formatString, xFormat, yFormat);
	}

	public IntervalXYItemLabelGenerator(java.lang.String formatString, java.text.DateFormat xFormat, java.text.DateFormat yFormat) {
		super(formatString, xFormat, yFormat);
	}

	protected java.lang.Object[] createItemArray(org.jfree.data.xy.XYDataset dataset, int series, int item) {
		org.jfree.data.xy.IntervalXYDataset intervalDataset = null;
		if (dataset instanceof org.jfree.data.xy.IntervalXYDataset) {
			intervalDataset = ((org.jfree.data.xy.IntervalXYDataset) (dataset));
		}
		java.lang.Object[] result = new java.lang.Object[7];
		result[0] = dataset.getSeriesKey(series).toString();
		double x = dataset.getXValue(series, item);
		double xs = x;
		double xe = x;
		double y = dataset.getYValue(series, item);
		double ys = y;
		double ye = y;
		if (intervalDataset != null) {
			xs = intervalDataset.getStartXValue(series, item);
			xe = intervalDataset.getEndXValue(series, item);
			ys = intervalDataset.getStartYValue(series, item);
			ye = intervalDataset.getEndYValue(series, item);
		}
		java.text.DateFormat xdf = getXDateFormat();
		if (xdf != null) {
			result[1] = xdf.format(new java.util.Date(((long) (x))));
			result[2] = xdf.format(new java.util.Date(((long) (xs))));
			result[3] = xdf.format(new java.util.Date(((long) (xe))));
		}else {
			java.text.NumberFormat xnf = getXFormat();
			result[1] = xnf.format(x);
			result[2] = xnf.format(xs);
			result[3] = xnf.format(xe);
		}
		java.text.NumberFormat ynf = getYFormat();
		java.text.DateFormat ydf = getYDateFormat();
		if ((java.lang.Double.isNaN(y)) && ((dataset.getY(series, item)) == null)) {
			result[4] = getNullYString();
		}else {
			if (ydf != null) {
				result[4] = ydf.format(new java.util.Date(((long) (y))));
			}else {
				result[4] = ynf.format(y);
			}
		}
		if ((java.lang.Double.isNaN(ys)) && ((intervalDataset.getStartY(series, item)) == null)) {
			result[5] = getNullYString();
		}else {
			if (ydf != null) {
				result[5] = ydf.format(new java.util.Date(((long) (ys))));
			}else {
				result[5] = ynf.format(ys);
			}
		}
		if ((java.lang.Double.isNaN(ye)) && ((intervalDataset.getEndY(series, item)) == null)) {
			result[6] = getNullYString();
		}else {
			if (ydf != null) {
				result[6] = ydf.format(new java.util.Date(((long) (ye))));
			}else {
				result[6] = ynf.format(ye);
			}
		}
		return result;
	}

	public java.lang.String generateLabel(org.jfree.data.xy.XYDataset dataset, int series, int item) {
		return generateLabelString(dataset, series, item);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.labels.IntervalXYItemLabelGenerator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.labels.IntervalXYItemLabelGenerator)) {
			return false;
		}
		return super.equals(obj);
	}
}


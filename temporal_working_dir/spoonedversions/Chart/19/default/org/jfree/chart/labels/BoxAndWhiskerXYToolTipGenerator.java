

package org.jfree.chart.labels;


public class BoxAndWhiskerXYToolTipGenerator extends org.jfree.chart.labels.StandardXYToolTipGenerator implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.labels.XYToolTipGenerator {
	private static final long serialVersionUID = -2648775791161459710L;

	public static final java.lang.String DEFAULT_TOOL_TIP_FORMAT = "X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ";

	public BoxAndWhiskerXYToolTipGenerator() {
		super(org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator.DEFAULT_TOOL_TIP_FORMAT, java.text.NumberFormat.getInstance(), java.text.NumberFormat.getInstance());
	}

	public BoxAndWhiskerXYToolTipGenerator(java.lang.String toolTipFormat, java.text.DateFormat dateFormat, java.text.NumberFormat numberFormat) {
		super(toolTipFormat, dateFormat, numberFormat);
	}

	protected java.lang.Object[] createItemArray(org.jfree.data.xy.XYDataset dataset, int series, int item) {
		java.lang.Object[] result = new java.lang.Object[8];
		result[0] = dataset.getSeriesKey(series).toString();
		java.lang.Number x = dataset.getX(series, item);
		if ((getXDateFormat()) != null) {
			result[1] = getXDateFormat().format(new java.util.Date(x.longValue()));
		}else {
			result[1] = getXFormat().format(x);
		}
		java.text.NumberFormat formatter = getYFormat();
		if (dataset instanceof org.jfree.data.statistics.BoxAndWhiskerXYDataset) {
			org.jfree.data.statistics.BoxAndWhiskerXYDataset d = ((org.jfree.data.statistics.BoxAndWhiskerXYDataset) (dataset));
			result[2] = formatter.format(d.getMeanValue(series, item));
			result[3] = formatter.format(d.getMedianValue(series, item));
			result[4] = formatter.format(d.getMinRegularValue(series, item));
			result[5] = formatter.format(d.getMaxRegularValue(series, item));
			result[6] = formatter.format(d.getQ1Value(series, item));
			result[7] = formatter.format(d.getQ3Value(series, item));
		}
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator)) {
			return false;
		}
		return super.equals(obj);
	}
}


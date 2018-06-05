

package org.jfree.chart.labels;


public class BoxAndWhiskerToolTipGenerator extends org.jfree.chart.labels.StandardCategoryToolTipGenerator implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.labels.CategoryToolTipGenerator , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -6076837753823076334L;

	public static final java.lang.String DEFAULT_TOOL_TIP_FORMAT = "X: {1} Mean: {2} Median: {3} Min: {4} Max: {5} Q1: {6} Q3: {7} ";

	public BoxAndWhiskerToolTipGenerator() {
		super(org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator.DEFAULT_TOOL_TIP_FORMAT, java.text.NumberFormat.getInstance());
	}

	public BoxAndWhiskerToolTipGenerator(java.lang.String format, java.text.NumberFormat formatter) {
		super(format, formatter);
	}

	protected java.lang.Object[] createItemArray(org.jfree.data.category.CategoryDataset dataset, int series, int item) {
		java.lang.Object[] result = new java.lang.Object[8];
		result[0] = dataset.getRowKey(series);
		java.lang.Number y = dataset.getValue(series, item);
		java.text.NumberFormat formatter = getNumberFormat();
		result[1] = formatter.format(y);
		if (dataset instanceof org.jfree.data.statistics.BoxAndWhiskerCategoryDataset) {
			org.jfree.data.statistics.BoxAndWhiskerCategoryDataset d = ((org.jfree.data.statistics.BoxAndWhiskerCategoryDataset) (dataset));
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
		if (obj == (org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator.this)) {
			return true;
		}
		if (obj instanceof org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator) {
			return super.equals(obj);
		}
		return false;
	}
}


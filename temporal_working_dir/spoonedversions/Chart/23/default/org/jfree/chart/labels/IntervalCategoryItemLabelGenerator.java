

package org.jfree.chart.labels;


public class IntervalCategoryItemLabelGenerator extends org.jfree.chart.labels.StandardCategoryItemLabelGenerator implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.labels.CategoryItemLabelGenerator , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 5056909225610630529L;

	public static final java.lang.String DEFAULT_LABEL_FORMAT_STRING = "({0}, {1}) = {3} - {4}";

	public IntervalCategoryItemLabelGenerator() {
		super(org.jfree.chart.labels.IntervalCategoryItemLabelGenerator.DEFAULT_LABEL_FORMAT_STRING, java.text.NumberFormat.getInstance());
	}

	public IntervalCategoryItemLabelGenerator(java.lang.String labelFormat, java.text.NumberFormat formatter) {
		super(labelFormat, formatter);
	}

	public IntervalCategoryItemLabelGenerator(java.lang.String labelFormat, java.text.DateFormat formatter) {
		super(labelFormat, formatter);
	}

	protected java.lang.Object[] createItemArray(org.jfree.data.category.CategoryDataset dataset, int row, int column) {
		java.lang.Object[] result = new java.lang.Object[5];
		result[0] = dataset.getRowKey(row).toString();
		result[1] = dataset.getColumnKey(column).toString();
		java.lang.Number value = dataset.getValue(row, column);
		if ((getNumberFormat()) != null) {
			result[2] = getNumberFormat().format(value);
		}else
			if ((getDateFormat()) != null) {
				result[2] = getDateFormat().format(value);
			}
		
		if (dataset instanceof org.jfree.data.category.IntervalCategoryDataset) {
			org.jfree.data.category.IntervalCategoryDataset icd = ((org.jfree.data.category.IntervalCategoryDataset) (dataset));
			java.lang.Number start = icd.getStartValue(row, column);
			java.lang.Number end = icd.getEndValue(row, column);
			if ((getNumberFormat()) != null) {
				result[3] = getNumberFormat().format(start);
				result[4] = getNumberFormat().format(end);
			}else
				if ((getDateFormat()) != null) {
					result[3] = getDateFormat().format(start);
					result[4] = getDateFormat().format(end);
				}
			
		}
		return result;
	}
}


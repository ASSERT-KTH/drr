

package org.jfree.chart.labels;


public class IntervalCategoryToolTipGenerator extends org.jfree.chart.labels.StandardCategoryToolTipGenerator {
	private static final long serialVersionUID = -3853824986520333437L;

	public static final java.lang.String DEFAULT_TOOL_TIP_FORMAT_STRING = "({0}, {1}) = {3} - {4}";

	public IntervalCategoryToolTipGenerator() {
		super(org.jfree.chart.labels.IntervalCategoryToolTipGenerator.DEFAULT_TOOL_TIP_FORMAT_STRING, java.text.NumberFormat.getInstance());
	}

	public IntervalCategoryToolTipGenerator(java.lang.String labelFormat, java.text.NumberFormat formatter) {
		super(labelFormat, formatter);
	}

	public IntervalCategoryToolTipGenerator(java.lang.String labelFormat, java.text.DateFormat formatter) {
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

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.labels.IntervalCategoryToolTipGenerator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.labels.IntervalCategoryToolTipGenerator)) {
			return false;
		}
		return super.equals(obj);
	}
}


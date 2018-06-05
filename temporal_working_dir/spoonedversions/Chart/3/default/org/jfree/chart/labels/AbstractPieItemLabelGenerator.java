

package org.jfree.chart.labels;


public class AbstractPieItemLabelGenerator implements java.io.Serializable {
	private static final long serialVersionUID = 7347703325267846275L;

	private java.lang.String labelFormat;

	private java.text.NumberFormat numberFormat;

	private java.text.NumberFormat percentFormat;

	protected AbstractPieItemLabelGenerator(java.lang.String labelFormat, java.text.NumberFormat numberFormat, java.text.NumberFormat percentFormat) {
		if (labelFormat == null) {
			throw new java.lang.IllegalArgumentException("Null 'labelFormat' argument.");
		}
		if (numberFormat == null) {
			throw new java.lang.IllegalArgumentException("Null 'numberFormat' argument.");
		}
		if (percentFormat == null) {
			throw new java.lang.IllegalArgumentException("Null 'percentFormat' argument.");
		}
		org.jfree.chart.labels.AbstractPieItemLabelGenerator.this.labelFormat = labelFormat;
		org.jfree.chart.labels.AbstractPieItemLabelGenerator.this.numberFormat = numberFormat;
		org.jfree.chart.labels.AbstractPieItemLabelGenerator.this.percentFormat = percentFormat;
	}

	public java.lang.String getLabelFormat() {
		return org.jfree.chart.labels.AbstractPieItemLabelGenerator.this.labelFormat;
	}

	public java.text.NumberFormat getNumberFormat() {
		return org.jfree.chart.labels.AbstractPieItemLabelGenerator.this.numberFormat;
	}

	public java.text.NumberFormat getPercentFormat() {
		return org.jfree.chart.labels.AbstractPieItemLabelGenerator.this.percentFormat;
	}

	protected java.lang.Object[] createItemArray(org.jfree.data.pie.PieDataset dataset, java.lang.Comparable key) {
		java.lang.Object[] result = new java.lang.Object[4];
		double total = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(dataset);
		result[0] = key.toString();
		java.lang.Number value = dataset.getValue(key);
		if (value != null) {
			result[1] = org.jfree.chart.labels.AbstractPieItemLabelGenerator.this.numberFormat.format(value);
		}else {
			result[1] = "null";
		}
		double percent = 0.0;
		if (value != null) {
			double v = value.doubleValue();
			if (v > 0.0) {
				percent = v / total;
			}
		}
		result[2] = org.jfree.chart.labels.AbstractPieItemLabelGenerator.this.percentFormat.format(percent);
		result[3] = org.jfree.chart.labels.AbstractPieItemLabelGenerator.this.numberFormat.format(total);
		return result;
	}

	protected java.lang.String generateSectionLabel(org.jfree.data.pie.PieDataset dataset, java.lang.Comparable key) {
		java.lang.String result = null;
		if (dataset != null) {
			java.lang.Object[] items = createItemArray(dataset, key);
			result = java.text.MessageFormat.format(org.jfree.chart.labels.AbstractPieItemLabelGenerator.this.labelFormat, items);
		}
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.labels.AbstractPieItemLabelGenerator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.labels.AbstractPieItemLabelGenerator)) {
			return false;
		}
		org.jfree.chart.labels.AbstractPieItemLabelGenerator that = ((org.jfree.chart.labels.AbstractPieItemLabelGenerator) (obj));
		if (!(org.jfree.chart.labels.AbstractPieItemLabelGenerator.this.labelFormat.equals(that.labelFormat))) {
			return false;
		}
		if (!(org.jfree.chart.labels.AbstractPieItemLabelGenerator.this.numberFormat.equals(that.numberFormat))) {
			return false;
		}
		if (!(org.jfree.chart.labels.AbstractPieItemLabelGenerator.this.percentFormat.equals(that.percentFormat))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 127;
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.labels.AbstractPieItemLabelGenerator.this.labelFormat);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.labels.AbstractPieItemLabelGenerator.this.numberFormat);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.labels.AbstractPieItemLabelGenerator.this.percentFormat);
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.labels.AbstractPieItemLabelGenerator clone = ((org.jfree.chart.labels.AbstractPieItemLabelGenerator) (super.clone()));
		if ((org.jfree.chart.labels.AbstractPieItemLabelGenerator.this.numberFormat) != null) {
			clone.numberFormat = ((java.text.NumberFormat) (org.jfree.chart.labels.AbstractPieItemLabelGenerator.this.numberFormat.clone()));
		}
		if ((org.jfree.chart.labels.AbstractPieItemLabelGenerator.this.percentFormat) != null) {
			clone.percentFormat = ((java.text.NumberFormat) (org.jfree.chart.labels.AbstractPieItemLabelGenerator.this.percentFormat.clone()));
		}
		return clone;
	}
}




package org.jfree.chart.labels;


public abstract class AbstractCategoryItemLabelGenerator implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -7108591260223293197L;

	private java.lang.String labelFormat;

	private java.lang.String nullValueString;

	private java.text.NumberFormat numberFormat;

	private java.text.DateFormat dateFormat;

	private java.text.NumberFormat percentFormat;

	protected AbstractCategoryItemLabelGenerator(java.lang.String labelFormat, java.text.NumberFormat formatter) {
		this(labelFormat, formatter, java.text.NumberFormat.getPercentInstance());
	}

	protected AbstractCategoryItemLabelGenerator(java.lang.String labelFormat, java.text.NumberFormat formatter, java.text.NumberFormat percentFormatter) {
		if (labelFormat == null) {
			throw new java.lang.IllegalArgumentException("Null 'labelFormat' argument.");
		}
		if (formatter == null) {
			throw new java.lang.IllegalArgumentException("Null 'formatter' argument.");
		}
		if (percentFormatter == null) {
			throw new java.lang.IllegalArgumentException("Null 'percentFormatter' argument.");
		}
		org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.labelFormat = labelFormat;
		org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.numberFormat = formatter;
		org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.percentFormat = percentFormatter;
		org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.dateFormat = null;
		org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.nullValueString = "-";
	}

	protected AbstractCategoryItemLabelGenerator(java.lang.String labelFormat, java.text.DateFormat formatter) {
		if (labelFormat == null) {
			throw new java.lang.IllegalArgumentException("Null 'labelFormat' argument.");
		}
		if (formatter == null) {
			throw new java.lang.IllegalArgumentException("Null 'formatter' argument.");
		}
		org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.labelFormat = labelFormat;
		org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.numberFormat = null;
		org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.percentFormat = java.text.NumberFormat.getPercentInstance();
		org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.dateFormat = formatter;
		org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.nullValueString = "-";
	}

	public java.lang.String generateRowLabel(org.jfree.data.category.CategoryDataset dataset, int row) {
		return dataset.getRowKey(row).toString();
	}

	public java.lang.String generateColumnLabel(org.jfree.data.category.CategoryDataset dataset, int column) {
		return dataset.getColumnKey(column).toString();
	}

	public java.lang.String getLabelFormat() {
		return org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.labelFormat;
	}

	public java.text.NumberFormat getNumberFormat() {
		return org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.numberFormat;
	}

	public java.text.DateFormat getDateFormat() {
		return org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.dateFormat;
	}

	protected java.lang.String generateLabelString(org.jfree.data.category.CategoryDataset dataset, int row, int column) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		java.lang.String result = null;
		java.lang.Object[] items = createItemArray(dataset, row, column);
		result = java.text.MessageFormat.format(org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.labelFormat, items);
		return result;
	}

	protected java.lang.Object[] createItemArray(org.jfree.data.category.CategoryDataset dataset, int row, int column) {
		java.lang.Object[] result = new java.lang.Object[4];
		result[0] = dataset.getRowKey(row).toString();
		result[1] = dataset.getColumnKey(column).toString();
		java.lang.Number value = dataset.getValue(row, column);
		if (value != null) {
			if ((org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.numberFormat) != null) {
				result[2] = org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.numberFormat.format(value);
			}else
				if ((org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.dateFormat) != null) {
					result[2] = org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.dateFormat.format(value);
				}
			
		}else {
			result[2] = org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.nullValueString;
		}
		if (value != null) {
			double total = org.jfree.data.DataUtilities.calculateColumnTotal(dataset, column);
			double percent = (value.doubleValue()) / total;
			result[3] = org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.percentFormat.format(percent);
		}
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.labels.AbstractCategoryItemLabelGenerator)) {
			return false;
		}
		org.jfree.chart.labels.AbstractCategoryItemLabelGenerator that = ((org.jfree.chart.labels.AbstractCategoryItemLabelGenerator) (obj));
		if (!(org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.labelFormat.equals(that.labelFormat))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.dateFormat, that.dateFormat))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.numberFormat, that.numberFormat))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 127;
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.labelFormat);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.nullValueString);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.dateFormat);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.numberFormat);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.percentFormat);
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.labels.AbstractCategoryItemLabelGenerator clone = ((org.jfree.chart.labels.AbstractCategoryItemLabelGenerator) (super.clone()));
		if ((org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.numberFormat) != null) {
			clone.numberFormat = ((java.text.NumberFormat) (org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.numberFormat.clone()));
		}
		if ((org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.dateFormat) != null) {
			clone.dateFormat = ((java.text.DateFormat) (org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.this.dateFormat.clone()));
		}
		return clone;
	}
}


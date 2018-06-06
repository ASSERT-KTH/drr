

package org.jfree.chart.labels;


public class MultipleXYSeriesLabelGenerator implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.labels.XYSeriesLabelGenerator , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 138976236941898560L;

	public static final java.lang.String DEFAULT_LABEL_FORMAT = "{0}";

	private java.lang.String formatPattern;

	private java.lang.String additionalFormatPattern;

	private java.util.Map seriesLabelLists;

	public MultipleXYSeriesLabelGenerator() {
		this(org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.DEFAULT_LABEL_FORMAT);
	}

	public MultipleXYSeriesLabelGenerator(java.lang.String format) {
		if (format == null) {
			throw new java.lang.IllegalArgumentException("Null 'format' argument.");
		}
		org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.this.formatPattern = format;
		org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.this.additionalFormatPattern = "\n{0}";
		org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.this.seriesLabelLists = new java.util.HashMap();
	}

	public void addSeriesLabel(int series, java.lang.String label) {
		java.lang.Integer key = new java.lang.Integer(series);
		java.util.List labelList = ((java.util.List) (org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.this.seriesLabelLists.get(key)));
		if (labelList == null) {
			labelList = new java.util.ArrayList();
			org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.this.seriesLabelLists.put(key, labelList);
		}
		labelList.add(label);
	}

	public void clearSeriesLabels(int series) {
		java.lang.Integer key = new java.lang.Integer(series);
		org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.this.seriesLabelLists.put(key, null);
	}

	public java.lang.String generateLabel(org.jfree.data.xy.XYDataset dataset, int series) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		java.lang.StringBuffer label = new java.lang.StringBuffer();
		label.append(java.text.MessageFormat.format(org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.this.formatPattern, createItemArray(dataset, series)));
		java.lang.Integer key = new java.lang.Integer(series);
		java.util.List extraLabels = ((java.util.List) (org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.this.seriesLabelLists.get(key)));
		if (extraLabels != null) {
			java.lang.Object[] temp = new java.lang.Object[1];
			for (int i = 0; i < (extraLabels.size()); i++) {
				temp[0] = extraLabels.get(i);
				java.lang.String labelAddition = java.text.MessageFormat.format(org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.this.additionalFormatPattern, temp);
				label.append(labelAddition);
			}
		}
		return label.toString();
	}

	protected java.lang.Object[] createItemArray(org.jfree.data.xy.XYDataset dataset, int series) {
		java.lang.Object[] result = new java.lang.Object[1];
		result[0] = dataset.getSeriesKey(series).toString();
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.labels.MultipleXYSeriesLabelGenerator clone = ((org.jfree.chart.labels.MultipleXYSeriesLabelGenerator) (super.clone()));
		clone.seriesLabelLists = new java.util.HashMap();
		java.util.Set keys = org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.this.seriesLabelLists.keySet();
		java.util.Iterator iterator = keys.iterator();
		while (iterator.hasNext()) {
			java.lang.Object key = iterator.next();
			java.lang.Object entry = org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.this.seriesLabelLists.get(key);
			java.lang.Object toAdd = entry;
			if (entry instanceof org.jfree.chart.util.PublicCloneable) {
				org.jfree.chart.util.PublicCloneable pc = ((org.jfree.chart.util.PublicCloneable) (entry));
				toAdd = pc.clone();
			}
			clone.seriesLabelLists.put(key, toAdd);
		} 
		return clone;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.labels.MultipleXYSeriesLabelGenerator)) {
			return false;
		}
		org.jfree.chart.labels.MultipleXYSeriesLabelGenerator that = ((org.jfree.chart.labels.MultipleXYSeriesLabelGenerator) (obj));
		if (!(org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.this.formatPattern.equals(that.formatPattern))) {
			return false;
		}
		if (!(org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.this.additionalFormatPattern.equals(that.additionalFormatPattern))) {
			return false;
		}
		if (!(org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.this.seriesLabelLists.equals(that.seriesLabelLists))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 127;
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.this.formatPattern);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.this.additionalFormatPattern);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.this.seriesLabelLists);
		return result;
	}
}


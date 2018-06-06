

package org.jfree.chart.labels;


public class HighLowItemLabelGenerator implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.labels.XYItemLabelGenerator , org.jfree.chart.labels.XYToolTipGenerator , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 5617111754832211830L;

	private java.text.DateFormat dateFormatter;

	private java.text.NumberFormat numberFormatter;

	public HighLowItemLabelGenerator() {
		this(java.text.DateFormat.getInstance(), java.text.NumberFormat.getInstance());
	}

	public HighLowItemLabelGenerator(java.text.DateFormat dateFormatter, java.text.NumberFormat numberFormatter) {
		if (dateFormatter == null) {
			throw new java.lang.IllegalArgumentException("Null 'dateFormatter' argument.");
		}
		if (numberFormatter == null) {
			throw new java.lang.IllegalArgumentException("Null 'numberFormatter' argument.");
		}
		org.jfree.chart.labels.HighLowItemLabelGenerator.this.dateFormatter = dateFormatter;
		org.jfree.chart.labels.HighLowItemLabelGenerator.this.numberFormatter = numberFormatter;
	}

	public java.lang.String generateToolTip(org.jfree.data.xy.XYDataset dataset, int series, int item) {
		java.lang.String result = null;
		if (dataset instanceof org.jfree.data.xy.OHLCDataset) {
			org.jfree.data.xy.OHLCDataset d = ((org.jfree.data.xy.OHLCDataset) (dataset));
			java.lang.Number high = d.getHigh(series, item);
			java.lang.Number low = d.getLow(series, item);
			java.lang.Number open = d.getOpen(series, item);
			java.lang.Number close = d.getClose(series, item);
			java.lang.Number x = d.getX(series, item);
			result = d.getSeriesKey(series).toString();
			if (x != null) {
				java.util.Date date = new java.util.Date(x.longValue());
				result = (result + "--> Date=") + (org.jfree.chart.labels.HighLowItemLabelGenerator.this.dateFormatter.format(date));
				if (high != null) {
					result = (result + " High=") + (org.jfree.chart.labels.HighLowItemLabelGenerator.this.numberFormatter.format(high.doubleValue()));
				}
				if (low != null) {
					result = (result + " Low=") + (org.jfree.chart.labels.HighLowItemLabelGenerator.this.numberFormatter.format(low.doubleValue()));
				}
				if (open != null) {
					result = (result + " Open=") + (org.jfree.chart.labels.HighLowItemLabelGenerator.this.numberFormatter.format(open.doubleValue()));
				}
				if (close != null) {
					result = (result + " Close=") + (org.jfree.chart.labels.HighLowItemLabelGenerator.this.numberFormatter.format(close.doubleValue()));
				}
			}
		}
		return result;
	}

	public java.lang.String generateLabel(org.jfree.data.xy.XYDataset dataset, int series, int category) {
		return null;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.labels.HighLowItemLabelGenerator clone = ((org.jfree.chart.labels.HighLowItemLabelGenerator) (super.clone()));
		if ((org.jfree.chart.labels.HighLowItemLabelGenerator.this.dateFormatter) != null) {
			clone.dateFormatter = ((java.text.DateFormat) (org.jfree.chart.labels.HighLowItemLabelGenerator.this.dateFormatter.clone()));
		}
		if ((org.jfree.chart.labels.HighLowItemLabelGenerator.this.numberFormatter) != null) {
			clone.numberFormatter = ((java.text.NumberFormat) (org.jfree.chart.labels.HighLowItemLabelGenerator.this.numberFormatter.clone()));
		}
		return clone;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.labels.HighLowItemLabelGenerator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.labels.HighLowItemLabelGenerator)) {
			return false;
		}
		org.jfree.chart.labels.HighLowItemLabelGenerator generator = ((org.jfree.chart.labels.HighLowItemLabelGenerator) (obj));
		if (!(org.jfree.chart.labels.HighLowItemLabelGenerator.this.dateFormatter.equals(generator.dateFormatter))) {
			return false;
		}
		if (!(org.jfree.chart.labels.HighLowItemLabelGenerator.this.numberFormatter.equals(generator.numberFormatter))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 127;
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.labels.HighLowItemLabelGenerator.this.dateFormatter);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.labels.HighLowItemLabelGenerator.this.numberFormatter);
		return result;
	}
}


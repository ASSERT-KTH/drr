

package org.jfree.chart.labels;


public class StandardCrosshairLabelGenerator implements java.io.Serializable , org.jfree.chart.labels.CrosshairLabelGenerator {
	private java.lang.String labelTemplate;

	private java.text.NumberFormat numberFormat;

	public StandardCrosshairLabelGenerator() {
		this("{0}", java.text.NumberFormat.getNumberInstance());
	}

	public StandardCrosshairLabelGenerator(java.lang.String labelTemplate, java.text.NumberFormat numberFormat) {
		super();
		if (labelTemplate == null) {
			throw new java.lang.IllegalArgumentException("Null 'labelTemplate' argument.");
		}
		if (numberFormat == null) {
			throw new java.lang.IllegalArgumentException("Null 'numberFormat' argument.");
		}
		org.jfree.chart.labels.StandardCrosshairLabelGenerator.this.labelTemplate = labelTemplate;
		org.jfree.chart.labels.StandardCrosshairLabelGenerator.this.numberFormat = numberFormat;
	}

	public java.lang.String getLabelTemplate() {
		return org.jfree.chart.labels.StandardCrosshairLabelGenerator.this.labelTemplate;
	}

	public java.text.NumberFormat getNumberFormat() {
		return org.jfree.chart.labels.StandardCrosshairLabelGenerator.this.numberFormat;
	}

	public java.lang.String generateLabel(org.jfree.chart.plot.Crosshair crosshair) {
		java.lang.Object[] v = new java.lang.Object[]{ org.jfree.chart.labels.StandardCrosshairLabelGenerator.this.numberFormat.format(crosshair.getValue()) };
		java.lang.String result = java.text.MessageFormat.format(org.jfree.chart.labels.StandardCrosshairLabelGenerator.this.labelTemplate, v);
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.labels.StandardCrosshairLabelGenerator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.labels.StandardCrosshairLabelGenerator)) {
			return false;
		}
		org.jfree.chart.labels.StandardCrosshairLabelGenerator that = ((org.jfree.chart.labels.StandardCrosshairLabelGenerator) (obj));
		if (!(org.jfree.chart.labels.StandardCrosshairLabelGenerator.this.labelTemplate.equals(that.labelTemplate))) {
			return false;
		}
		if (!(org.jfree.chart.labels.StandardCrosshairLabelGenerator.this.numberFormat.equals(that.numberFormat))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.chart.labels.StandardCrosshairLabelGenerator.this.labelTemplate.hashCode();
	}
}


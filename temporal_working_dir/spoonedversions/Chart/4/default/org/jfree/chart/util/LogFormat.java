

package org.jfree.chart.util;


public class LogFormat extends java.text.NumberFormat {
	private double base;

	private double baseLog;

	private java.lang.String baseLabel;

	private java.lang.String powerLabel;

	private boolean showBase;

	private java.text.NumberFormat formatter = new java.text.DecimalFormat("0.0#");

	public LogFormat() {
		this(10.0, "10", true);
	}

	public LogFormat(double base, java.lang.String baseLabel, boolean showBase) {
		this(base, baseLabel, "^", showBase);
	}

	public LogFormat(double base, java.lang.String baseLabel, java.lang.String powerLabel, boolean showBase) {
		if (baseLabel == null) {
			throw new java.lang.IllegalArgumentException("Null 'baseLabel' argument.");
		}
		if (powerLabel == null) {
			throw new java.lang.IllegalArgumentException("Null 'powerLabel' argument.");
		}
		org.jfree.chart.util.LogFormat.this.base = base;
		org.jfree.chart.util.LogFormat.this.baseLog = java.lang.Math.log(org.jfree.chart.util.LogFormat.this.base);
		org.jfree.chart.util.LogFormat.this.baseLabel = baseLabel;
		org.jfree.chart.util.LogFormat.this.showBase = showBase;
		org.jfree.chart.util.LogFormat.this.powerLabel = powerLabel;
	}

	public java.text.NumberFormat getExponentFormat() {
		return ((java.text.NumberFormat) (org.jfree.chart.util.LogFormat.this.formatter.clone()));
	}

	public void setExponentFormat(java.text.NumberFormat format) {
		if (format == null) {
			throw new java.lang.IllegalArgumentException("Null 'format' argument.");
		}
		org.jfree.chart.util.LogFormat.this.formatter = format;
	}

	private double calculateLog(double value) {
		return (java.lang.Math.log(value)) / (org.jfree.chart.util.LogFormat.this.baseLog);
	}

	public java.lang.StringBuffer format(double number, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) {
		java.lang.StringBuffer result = new java.lang.StringBuffer();
		if (org.jfree.chart.util.LogFormat.this.showBase) {
			result.append(org.jfree.chart.util.LogFormat.this.baseLabel);
			result.append(org.jfree.chart.util.LogFormat.this.powerLabel);
		}
		result.append(org.jfree.chart.util.LogFormat.this.formatter.format(calculateLog(number)));
		return result;
	}

	public java.lang.StringBuffer format(long number, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) {
		java.lang.StringBuffer result = new java.lang.StringBuffer();
		if (org.jfree.chart.util.LogFormat.this.showBase) {
			result.append(org.jfree.chart.util.LogFormat.this.baseLabel);
			result.append("^");
		}
		result.append(org.jfree.chart.util.LogFormat.this.formatter.format(calculateLog(number)));
		return result;
	}

	public java.lang.Number parse(java.lang.String source, java.text.ParsePosition parsePosition) {
		return null;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.util.LogFormat.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.util.LogFormat)) {
			return false;
		}
		org.jfree.chart.util.LogFormat that = ((org.jfree.chart.util.LogFormat) (obj));
		if ((org.jfree.chart.util.LogFormat.this.base) != (that.base)) {
			return false;
		}
		if (!(org.jfree.chart.util.LogFormat.this.baseLabel.equals(that.baseLabel))) {
			return false;
		}
		if ((org.jfree.chart.util.LogFormat.this.baseLog) != (that.baseLog)) {
			return false;
		}
		if ((org.jfree.chart.util.LogFormat.this.showBase) != (that.showBase)) {
			return false;
		}
		if (!(org.jfree.chart.util.LogFormat.this.formatter.equals(that.formatter))) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() {
		org.jfree.chart.util.LogFormat clone = ((org.jfree.chart.util.LogFormat) (super.clone()));
		clone.formatter = ((java.text.NumberFormat) (org.jfree.chart.util.LogFormat.this.formatter.clone()));
		return clone;
	}
}


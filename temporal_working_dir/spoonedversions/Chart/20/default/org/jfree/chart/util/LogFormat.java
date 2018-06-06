

package org.jfree.chart.util;


public class LogFormat extends java.text.NumberFormat {
	private double base;

	private double baseLog;

	private java.lang.String baseLabel;

	private boolean showBase;

	private java.text.NumberFormat formatter = new java.text.DecimalFormat("0.0");

	public LogFormat(double base, java.lang.String baseLabel, boolean showBase) {
		org.jfree.chart.util.LogFormat.this.base = base;
		org.jfree.chart.util.LogFormat.this.baseLog = java.lang.Math.log(org.jfree.chart.util.LogFormat.this.base);
		org.jfree.chart.util.LogFormat.this.baseLabel = baseLabel;
		org.jfree.chart.util.LogFormat.this.showBase = showBase;
	}

	private double calculateLog(double value) {
		return (java.lang.Math.log(value)) / (org.jfree.chart.util.LogFormat.this.baseLog);
	}

	public java.lang.StringBuffer format(double number, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) {
		java.lang.StringBuffer result = new java.lang.StringBuffer();
		if (org.jfree.chart.util.LogFormat.this.showBase) {
			result.append(org.jfree.chart.util.LogFormat.this.baseLabel);
			result.append("^");
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
}


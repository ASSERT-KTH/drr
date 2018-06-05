

package org.jfree.chart.axis;


public class StandardTickUnitSource implements org.jfree.chart.axis.TickUnitSource {
	private static final double LOG_10_VALUE = java.lang.Math.log(10.0);

	public org.jfree.chart.axis.TickUnit getLargerTickUnit(org.jfree.chart.axis.TickUnit unit) {
		double x = unit.getSize();
		double log = (java.lang.Math.log(x)) / (org.jfree.chart.axis.StandardTickUnitSource.LOG_10_VALUE);
		double higher = java.lang.Math.ceil(log);
		return new org.jfree.chart.axis.NumberTickUnit(java.lang.Math.pow(10, higher), new java.text.DecimalFormat("0.0E0"));
	}

	public org.jfree.chart.axis.TickUnit getCeilingTickUnit(org.jfree.chart.axis.TickUnit unit) {
		return getLargerTickUnit(unit);
	}

	public org.jfree.chart.axis.TickUnit getCeilingTickUnit(double size) {
		double log = (java.lang.Math.log(size)) / (org.jfree.chart.axis.StandardTickUnitSource.LOG_10_VALUE);
		double higher = java.lang.Math.ceil(log);
		return new org.jfree.chart.axis.NumberTickUnit(java.lang.Math.pow(10, higher), new java.text.DecimalFormat("0.0E0"));
	}
}


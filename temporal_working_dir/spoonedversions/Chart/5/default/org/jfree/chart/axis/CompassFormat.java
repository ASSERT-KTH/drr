

package org.jfree.chart.axis;


public class CompassFormat extends java.text.NumberFormat {
	private static final java.lang.String N = "N";

	private static final java.lang.String E = "E";

	private static final java.lang.String S = "S";

	private static final java.lang.String W = "W";

	public static final java.lang.String[] DIRECTIONS = new java.lang.String[]{ org.jfree.chart.axis.CompassFormat.N , ((org.jfree.chart.axis.CompassFormat.N) + (org.jfree.chart.axis.CompassFormat.N)) + (org.jfree.chart.axis.CompassFormat.E) , (org.jfree.chart.axis.CompassFormat.N) + (org.jfree.chart.axis.CompassFormat.E) , ((org.jfree.chart.axis.CompassFormat.E) + (org.jfree.chart.axis.CompassFormat.N)) + (org.jfree.chart.axis.CompassFormat.E) , org.jfree.chart.axis.CompassFormat.E , ((org.jfree.chart.axis.CompassFormat.E) + (org.jfree.chart.axis.CompassFormat.S)) + (org.jfree.chart.axis.CompassFormat.E) , (org.jfree.chart.axis.CompassFormat.S) + (org.jfree.chart.axis.CompassFormat.E) , ((org.jfree.chart.axis.CompassFormat.S) + (org.jfree.chart.axis.CompassFormat.S)) + (org.jfree.chart.axis.CompassFormat.E) , org.jfree.chart.axis.CompassFormat.S , ((org.jfree.chart.axis.CompassFormat.S) + (org.jfree.chart.axis.CompassFormat.S)) + (org.jfree.chart.axis.CompassFormat.W) , (org.jfree.chart.axis.CompassFormat.S) + (org.jfree.chart.axis.CompassFormat.W) , ((org.jfree.chart.axis.CompassFormat.W) + (org.jfree.chart.axis.CompassFormat.S)) + (org.jfree.chart.axis.CompassFormat.W) , org.jfree.chart.axis.CompassFormat.W , ((org.jfree.chart.axis.CompassFormat.W) + (org.jfree.chart.axis.CompassFormat.N)) + (org.jfree.chart.axis.CompassFormat.W) , (org.jfree.chart.axis.CompassFormat.N) + (org.jfree.chart.axis.CompassFormat.W) , ((org.jfree.chart.axis.CompassFormat.N) + (org.jfree.chart.axis.CompassFormat.N)) + (org.jfree.chart.axis.CompassFormat.W) , org.jfree.chart.axis.CompassFormat.N };

	public CompassFormat() {
		super();
	}

	public java.lang.String getDirectionCode(double direction) {
		direction = direction % 360;
		if (direction < 0.0) {
			direction = direction + 360.0;
		}
		int index = (((int) (java.lang.Math.floor((direction / 11.25)))) + 1) / 2;
		return org.jfree.chart.axis.CompassFormat.DIRECTIONS[index];
	}

	public java.lang.StringBuffer format(double number, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) {
		return toAppendTo.append(getDirectionCode(number));
	}

	public java.lang.StringBuffer format(long number, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) {
		return toAppendTo.append(getDirectionCode(number));
	}

	public java.lang.Number parse(java.lang.String source, java.text.ParsePosition parsePosition) {
		return null;
	}
}


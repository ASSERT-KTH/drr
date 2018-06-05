

package org.jfree.chart.axis;


public class AxisState {
	private double cursor;

	private java.util.List ticks;

	private double max;

	public AxisState() {
		this(0.0);
	}

	public AxisState(double cursor) {
		org.jfree.chart.axis.AxisState.this.cursor = cursor;
		org.jfree.chart.axis.AxisState.this.ticks = new java.util.ArrayList();
	}

	public double getCursor() {
		return org.jfree.chart.axis.AxisState.this.cursor;
	}

	public void setCursor(double cursor) {
		org.jfree.chart.axis.AxisState.this.cursor = cursor;
	}

	public void moveCursor(double units, org.jfree.chart.util.RectangleEdge edge) {
		if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
			cursorUp(units);
		}else
			if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
				cursorDown(units);
			}else
				if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
					cursorLeft(units);
				}else
					if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
						cursorRight(units);
					}
				
			
		
	}

	public void cursorUp(double units) {
		org.jfree.chart.axis.AxisState.this.cursor = (org.jfree.chart.axis.AxisState.this.cursor) - units;
	}

	public void cursorDown(double units) {
		org.jfree.chart.axis.AxisState.this.cursor = (org.jfree.chart.axis.AxisState.this.cursor) + units;
	}

	public void cursorLeft(double units) {
		org.jfree.chart.axis.AxisState.this.cursor = (org.jfree.chart.axis.AxisState.this.cursor) - units;
	}

	public void cursorRight(double units) {
		org.jfree.chart.axis.AxisState.this.cursor = (org.jfree.chart.axis.AxisState.this.cursor) + units;
	}

	public java.util.List getTicks() {
		return org.jfree.chart.axis.AxisState.this.ticks;
	}

	public void setTicks(java.util.List ticks) {
		org.jfree.chart.axis.AxisState.this.ticks = ticks;
	}

	public double getMax() {
		return org.jfree.chart.axis.AxisState.this.max;
	}

	public void setMax(double max) {
		org.jfree.chart.axis.AxisState.this.max = max;
	}
}


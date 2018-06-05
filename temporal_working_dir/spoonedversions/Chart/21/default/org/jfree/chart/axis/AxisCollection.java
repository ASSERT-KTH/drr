

package org.jfree.chart.axis;


public class AxisCollection {
	private java.util.List axesAtTop;

	private java.util.List axesAtBottom;

	private java.util.List axesAtLeft;

	private java.util.List axesAtRight;

	public AxisCollection() {
		org.jfree.chart.axis.AxisCollection.this.axesAtTop = new java.util.ArrayList();
		org.jfree.chart.axis.AxisCollection.this.axesAtBottom = new java.util.ArrayList();
		org.jfree.chart.axis.AxisCollection.this.axesAtLeft = new java.util.ArrayList();
		org.jfree.chart.axis.AxisCollection.this.axesAtRight = new java.util.ArrayList();
	}

	public java.util.List getAxesAtTop() {
		return org.jfree.chart.axis.AxisCollection.this.axesAtTop;
	}

	public java.util.List getAxesAtBottom() {
		return org.jfree.chart.axis.AxisCollection.this.axesAtBottom;
	}

	public java.util.List getAxesAtLeft() {
		return org.jfree.chart.axis.AxisCollection.this.axesAtLeft;
	}

	public java.util.List getAxesAtRight() {
		return org.jfree.chart.axis.AxisCollection.this.axesAtRight;
	}

	public void add(org.jfree.chart.axis.Axis axis, org.jfree.chart.util.RectangleEdge edge) {
		if (axis == null) {
			throw new java.lang.IllegalArgumentException("Null 'axis' argument.");
		}
		if (edge == null) {
			throw new java.lang.IllegalArgumentException("Null 'edge' argument.");
		}
		if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
			org.jfree.chart.axis.AxisCollection.this.axesAtTop.add(axis);
		}else
			if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
				org.jfree.chart.axis.AxisCollection.this.axesAtBottom.add(axis);
			}else
				if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
					org.jfree.chart.axis.AxisCollection.this.axesAtLeft.add(axis);
				}else
					if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
						org.jfree.chart.axis.AxisCollection.this.axesAtRight.add(axis);
					}
				
			
		
	}
}


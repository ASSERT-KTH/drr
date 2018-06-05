

package org.jfree.chart.axis;


public class ModuloAxis extends org.jfree.chart.axis.NumberAxis {
	private org.jfree.data.Range fixedRange;

	private double displayStart;

	private double displayEnd;

	public ModuloAxis(java.lang.String label, org.jfree.data.Range fixedRange) {
		super(label);
		org.jfree.chart.axis.ModuloAxis.this.fixedRange = fixedRange;
		org.jfree.chart.axis.ModuloAxis.this.displayStart = 270.0;
		org.jfree.chart.axis.ModuloAxis.this.displayEnd = 90.0;
	}

	public double getDisplayStart() {
		return org.jfree.chart.axis.ModuloAxis.this.displayStart;
	}

	public double getDisplayEnd() {
		return org.jfree.chart.axis.ModuloAxis.this.displayEnd;
	}

	public void setDisplayRange(double start, double end) {
		org.jfree.chart.axis.ModuloAxis.this.displayStart = mapValueToFixedRange(start);
		org.jfree.chart.axis.ModuloAxis.this.displayEnd = mapValueToFixedRange(end);
		if ((org.jfree.chart.axis.ModuloAxis.this.displayStart) < (org.jfree.chart.axis.ModuloAxis.this.displayEnd)) {
			setRange(org.jfree.chart.axis.ModuloAxis.this.displayStart, org.jfree.chart.axis.ModuloAxis.this.displayEnd);
		}else {
			setRange(org.jfree.chart.axis.ModuloAxis.this.displayStart, ((org.jfree.chart.axis.ModuloAxis.this.fixedRange.getUpperBound()) + ((org.jfree.chart.axis.ModuloAxis.this.displayEnd) - (org.jfree.chart.axis.ModuloAxis.this.fixedRange.getLowerBound()))));
		}
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.ModuloAxis.this));
	}

	protected void autoAdjustRange() {
		setRange(org.jfree.chart.axis.ModuloAxis.this.fixedRange, false, false);
	}

	public double valueToJava2D(double value, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge) {
		double result = 0.0;
		double v = mapValueToFixedRange(value);
		if ((org.jfree.chart.axis.ModuloAxis.this.displayStart) < (org.jfree.chart.axis.ModuloAxis.this.displayEnd)) {
			result = trans(v, area, edge);
		}else {
			double cutoff = ((org.jfree.chart.axis.ModuloAxis.this.displayStart) + (org.jfree.chart.axis.ModuloAxis.this.displayEnd)) / 2.0;
			double length1 = (org.jfree.chart.axis.ModuloAxis.this.fixedRange.getUpperBound()) - (org.jfree.chart.axis.ModuloAxis.this.displayStart);
			double length2 = (org.jfree.chart.axis.ModuloAxis.this.displayEnd) - (org.jfree.chart.axis.ModuloAxis.this.fixedRange.getLowerBound());
			if (v > cutoff) {
				result = transStart(v, area, edge, length1, length2);
			}else {
				result = transEnd(v, area, edge, length1, length2);
			}
		}
		return result;
	}

	private double trans(double value, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge) {
		double min = 0.0;
		double max = 0.0;
		if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(edge)) {
			min = area.getX();
			max = (area.getX()) + (area.getWidth());
		}else
			if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
				min = area.getMaxY();
				max = (area.getMaxY()) - (area.getHeight());
			}
		
		if (isInverted()) {
			return max - (((value - (org.jfree.chart.axis.ModuloAxis.this.displayStart)) / ((org.jfree.chart.axis.ModuloAxis.this.displayEnd) - (org.jfree.chart.axis.ModuloAxis.this.displayStart))) * (max - min));
		}else {
			return min + (((value - (org.jfree.chart.axis.ModuloAxis.this.displayStart)) / ((org.jfree.chart.axis.ModuloAxis.this.displayEnd) - (org.jfree.chart.axis.ModuloAxis.this.displayStart))) * (max - min));
		}
	}

	private double transStart(double value, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge, double length1, double length2) {
		double min = 0.0;
		double max = 0.0;
		if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(edge)) {
			min = area.getX();
			max = (area.getX()) + (((area.getWidth()) * length1) / (length1 + length2));
		}else
			if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
				min = area.getMaxY();
				max = (area.getMaxY()) - (((area.getHeight()) * length1) / (length1 + length2));
			}
		
		if (isInverted()) {
			return max - (((value - (org.jfree.chart.axis.ModuloAxis.this.displayStart)) / ((org.jfree.chart.axis.ModuloAxis.this.fixedRange.getUpperBound()) - (org.jfree.chart.axis.ModuloAxis.this.displayStart))) * (max - min));
		}else {
			return min + (((value - (org.jfree.chart.axis.ModuloAxis.this.displayStart)) / ((org.jfree.chart.axis.ModuloAxis.this.fixedRange.getUpperBound()) - (org.jfree.chart.axis.ModuloAxis.this.displayStart))) * (max - min));
		}
	}

	private double transEnd(double value, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge, double length1, double length2) {
		double min = 0.0;
		double max = 0.0;
		if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(edge)) {
			max = area.getMaxX();
			min = (area.getMaxX()) - (((area.getWidth()) * length2) / (length1 + length2));
		}else
			if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
				max = area.getMinY();
				min = (area.getMinY()) + (((area.getHeight()) * length2) / (length1 + length2));
			}
		
		if (isInverted()) {
			return max - (((value - (org.jfree.chart.axis.ModuloAxis.this.fixedRange.getLowerBound())) / ((org.jfree.chart.axis.ModuloAxis.this.displayEnd) - (org.jfree.chart.axis.ModuloAxis.this.fixedRange.getLowerBound()))) * (max - min));
		}else {
			return min + (((value - (org.jfree.chart.axis.ModuloAxis.this.fixedRange.getLowerBound())) / ((org.jfree.chart.axis.ModuloAxis.this.displayEnd) - (org.jfree.chart.axis.ModuloAxis.this.fixedRange.getLowerBound()))) * (max - min));
		}
	}

	private double mapValueToFixedRange(double value) {
		double lower = org.jfree.chart.axis.ModuloAxis.this.fixedRange.getLowerBound();
		double length = org.jfree.chart.axis.ModuloAxis.this.fixedRange.getLength();
		if (value < lower) {
			return (lower + length) + ((value - lower) % length);
		}else {
			return lower + ((value - lower) % length);
		}
	}

	public double java2DToValue(double java2DValue, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge) {
		double result = 0.0;
		if ((org.jfree.chart.axis.ModuloAxis.this.displayStart) < (org.jfree.chart.axis.ModuloAxis.this.displayEnd)) {
			result = super.java2DToValue(java2DValue, area, edge);
		}else {
		}
		return result;
	}

	private double getDisplayLength() {
		if ((org.jfree.chart.axis.ModuloAxis.this.displayStart) < (org.jfree.chart.axis.ModuloAxis.this.displayEnd)) {
			return (org.jfree.chart.axis.ModuloAxis.this.displayEnd) - (org.jfree.chart.axis.ModuloAxis.this.displayStart);
		}else {
			return ((org.jfree.chart.axis.ModuloAxis.this.fixedRange.getUpperBound()) - (org.jfree.chart.axis.ModuloAxis.this.displayStart)) + ((org.jfree.chart.axis.ModuloAxis.this.displayEnd) - (org.jfree.chart.axis.ModuloAxis.this.fixedRange.getLowerBound()));
		}
	}

	private double getDisplayCentralValue() {
		return mapValueToFixedRange(((org.jfree.chart.axis.ModuloAxis.this.displayStart) + ((getDisplayLength()) / 2)));
	}

	public void resizeRange(double percent) {
		resizeRange(percent, getDisplayCentralValue());
	}

	public void resizeRange(double percent, double anchorValue) {
		if (percent > 0.0) {
			double halfLength = ((getDisplayLength()) * percent) / 2;
			setDisplayRange((anchorValue - halfLength), (anchorValue + halfLength));
		}else {
			setAutoRange(true);
		}
	}

	public double lengthToJava2D(double length, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge) {
		double axisLength = 0.0;
		if ((org.jfree.chart.axis.ModuloAxis.this.displayEnd) > (org.jfree.chart.axis.ModuloAxis.this.displayStart)) {
			axisLength = (org.jfree.chart.axis.ModuloAxis.this.displayEnd) - (org.jfree.chart.axis.ModuloAxis.this.displayStart);
		}else {
			axisLength = ((org.jfree.chart.axis.ModuloAxis.this.fixedRange.getUpperBound()) - (org.jfree.chart.axis.ModuloAxis.this.displayStart)) + ((org.jfree.chart.axis.ModuloAxis.this.displayEnd) - (org.jfree.chart.axis.ModuloAxis.this.fixedRange.getLowerBound()));
		}
		double areaLength = 0.0;
		if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
			areaLength = area.getHeight();
		}else {
			areaLength = area.getWidth();
		}
		return (length / axisLength) * areaLength;
	}
}




package org.jfree.chart.plot;


public class CrosshairState {
	private boolean calculateDistanceInDataSpace = false;

	private double anchorX;

	private double anchorY;

	private java.awt.geom.Point2D anchor;

	private double crosshairX;

	private double crosshairY;

	private int domainAxisIndex;

	private int rangeAxisIndex;

	private double distance;

	public CrosshairState() {
		this(false);
	}

	public CrosshairState(boolean calculateDistanceInDataSpace) {
		org.jfree.chart.plot.CrosshairState.this.calculateDistanceInDataSpace = calculateDistanceInDataSpace;
	}

	public double getCrosshairDistance() {
		return org.jfree.chart.plot.CrosshairState.this.distance;
	}

	public void setCrosshairDistance(double distance) {
		org.jfree.chart.plot.CrosshairState.this.distance = distance;
	}

	public void updateCrosshairPoint(double x, double y, int domainAxisIndex, int rangeAxisIndex, double transX, double transY, org.jfree.chart.plot.PlotOrientation orientation) {
		if ((org.jfree.chart.plot.CrosshairState.this.anchor) != null) {
			double d = 0.0;
			if (org.jfree.chart.plot.CrosshairState.this.calculateDistanceInDataSpace) {
				d = ((x - (org.jfree.chart.plot.CrosshairState.this.anchorX)) * (x - (org.jfree.chart.plot.CrosshairState.this.anchorX))) + ((y - (org.jfree.chart.plot.CrosshairState.this.anchorY)) * (y - (org.jfree.chart.plot.CrosshairState.this.anchorY)));
			}else {
				double xx = org.jfree.chart.plot.CrosshairState.this.anchor.getX();
				double yy = org.jfree.chart.plot.CrosshairState.this.anchor.getY();
				if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					double temp = yy;
					yy = xx;
					xx = temp;
				}
				d = ((transX - xx) * (transX - xx)) + ((transY - yy) * (transY - yy));
			}
			if (d < (org.jfree.chart.plot.CrosshairState.this.distance)) {
				org.jfree.chart.plot.CrosshairState.this.crosshairX = x;
				org.jfree.chart.plot.CrosshairState.this.crosshairY = y;
				org.jfree.chart.plot.CrosshairState.this.domainAxisIndex = domainAxisIndex;
				org.jfree.chart.plot.CrosshairState.this.rangeAxisIndex = rangeAxisIndex;
				org.jfree.chart.plot.CrosshairState.this.distance = d;
			}
		}
	}

	public void updateCrosshairX(double candidateX, int domainAxisIndex) {
		double d = java.lang.Math.abs((candidateX - (org.jfree.chart.plot.CrosshairState.this.anchorX)));
		if (d < (org.jfree.chart.plot.CrosshairState.this.distance)) {
			org.jfree.chart.plot.CrosshairState.this.crosshairX = candidateX;
			org.jfree.chart.plot.CrosshairState.this.domainAxisIndex = domainAxisIndex;
			org.jfree.chart.plot.CrosshairState.this.distance = d;
		}
	}

	public void updateCrosshairY(double candidateY, int rangeAxisIndex) {
		double d = java.lang.Math.abs((candidateY - (org.jfree.chart.plot.CrosshairState.this.anchorY)));
		if (d < (org.jfree.chart.plot.CrosshairState.this.distance)) {
			org.jfree.chart.plot.CrosshairState.this.crosshairY = candidateY;
			org.jfree.chart.plot.CrosshairState.this.rangeAxisIndex = rangeAxisIndex;
			org.jfree.chart.plot.CrosshairState.this.distance = d;
		}
	}

	public java.awt.geom.Point2D getAnchor() {
		return org.jfree.chart.plot.CrosshairState.this.anchor;
	}

	public void setAnchor(java.awt.geom.Point2D anchor) {
		org.jfree.chart.plot.CrosshairState.this.anchor = anchor;
	}

	public double getAnchorX() {
		return org.jfree.chart.plot.CrosshairState.this.anchorX;
	}

	public void setAnchorX(double x) {
		org.jfree.chart.plot.CrosshairState.this.anchorX = x;
	}

	public double getAnchorY() {
		return org.jfree.chart.plot.CrosshairState.this.anchorY;
	}

	public void setAnchorY(double y) {
		org.jfree.chart.plot.CrosshairState.this.anchorY = y;
	}

	public double getCrosshairX() {
		return org.jfree.chart.plot.CrosshairState.this.crosshairX;
	}

	public void setCrosshairX(double x) {
		org.jfree.chart.plot.CrosshairState.this.crosshairX = x;
	}

	public double getCrosshairY() {
		return org.jfree.chart.plot.CrosshairState.this.crosshairY;
	}

	public void setCrosshairY(double y) {
		org.jfree.chart.plot.CrosshairState.this.crosshairY = y;
	}

	public int getDomainAxisIndex() {
		return org.jfree.chart.plot.CrosshairState.this.domainAxisIndex;
	}

	public int getRangeAxisIndex() {
		return org.jfree.chart.plot.CrosshairState.this.rangeAxisIndex;
	}
}


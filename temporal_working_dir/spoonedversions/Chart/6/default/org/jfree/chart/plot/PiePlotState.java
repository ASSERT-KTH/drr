

package org.jfree.chart.plot;


public class PiePlotState extends org.jfree.chart.renderer.RendererState {
	private int passesRequired;

	private double total;

	private double latestAngle;

	private java.awt.geom.Rectangle2D explodedPieArea;

	private java.awt.geom.Rectangle2D pieArea;

	private double pieCenterX;

	private double pieCenterY;

	private double pieHRadius;

	private double pieWRadius;

	private java.awt.geom.Rectangle2D linkArea;

	public PiePlotState(org.jfree.chart.plot.PlotRenderingInfo info) {
		super(info);
		org.jfree.chart.plot.PiePlotState.this.passesRequired = 1;
		org.jfree.chart.plot.PiePlotState.this.total = 0.0;
	}

	public int getPassesRequired() {
		return org.jfree.chart.plot.PiePlotState.this.passesRequired;
	}

	public void setPassesRequired(int passes) {
		org.jfree.chart.plot.PiePlotState.this.passesRequired = passes;
	}

	public double getTotal() {
		return org.jfree.chart.plot.PiePlotState.this.total;
	}

	public void setTotal(double total) {
		org.jfree.chart.plot.PiePlotState.this.total = total;
	}

	public double getLatestAngle() {
		return org.jfree.chart.plot.PiePlotState.this.latestAngle;
	}

	public void setLatestAngle(double angle) {
		org.jfree.chart.plot.PiePlotState.this.latestAngle = angle;
	}

	public java.awt.geom.Rectangle2D getPieArea() {
		return org.jfree.chart.plot.PiePlotState.this.pieArea;
	}

	public void setPieArea(java.awt.geom.Rectangle2D area) {
		org.jfree.chart.plot.PiePlotState.this.pieArea = area;
	}

	public java.awt.geom.Rectangle2D getExplodedPieArea() {
		return org.jfree.chart.plot.PiePlotState.this.explodedPieArea;
	}

	public void setExplodedPieArea(java.awt.geom.Rectangle2D area) {
		org.jfree.chart.plot.PiePlotState.this.explodedPieArea = area;
	}

	public double getPieCenterX() {
		return org.jfree.chart.plot.PiePlotState.this.pieCenterX;
	}

	public void setPieCenterX(double x) {
		org.jfree.chart.plot.PiePlotState.this.pieCenterX = x;
	}

	public double getPieCenterY() {
		return org.jfree.chart.plot.PiePlotState.this.pieCenterY;
	}

	public void setPieCenterY(double y) {
		org.jfree.chart.plot.PiePlotState.this.pieCenterY = y;
	}

	public java.awt.geom.Rectangle2D getLinkArea() {
		return org.jfree.chart.plot.PiePlotState.this.linkArea;
	}

	public void setLinkArea(java.awt.geom.Rectangle2D area) {
		org.jfree.chart.plot.PiePlotState.this.linkArea = area;
	}

	public double getPieHRadius() {
		return org.jfree.chart.plot.PiePlotState.this.pieHRadius;
	}

	public void setPieHRadius(double radius) {
		org.jfree.chart.plot.PiePlotState.this.pieHRadius = radius;
	}

	public double getPieWRadius() {
		return org.jfree.chart.plot.PiePlotState.this.pieWRadius;
	}

	public void setPieWRadius(double radius) {
		org.jfree.chart.plot.PiePlotState.this.pieWRadius = radius;
	}
}


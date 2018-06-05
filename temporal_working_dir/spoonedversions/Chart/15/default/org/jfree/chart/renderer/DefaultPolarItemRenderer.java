

package org.jfree.chart.renderer;


public class DefaultPolarItemRenderer extends org.jfree.chart.renderer.AbstractRenderer implements org.jfree.chart.renderer.PolarItemRenderer {
	private org.jfree.chart.plot.PolarPlot plot;

	private org.jfree.chart.util.BooleanList seriesFilled;

	public DefaultPolarItemRenderer() {
		org.jfree.chart.renderer.DefaultPolarItemRenderer.this.seriesFilled = new org.jfree.chart.util.BooleanList();
	}

	public void setPlot(org.jfree.chart.plot.PolarPlot plot) {
		org.jfree.chart.renderer.DefaultPolarItemRenderer.this.plot = plot;
	}

	public org.jfree.chart.plot.PolarPlot getPlot() {
		return org.jfree.chart.renderer.DefaultPolarItemRenderer.this.plot;
	}

	public org.jfree.chart.plot.DrawingSupplier getDrawingSupplier() {
		org.jfree.chart.plot.DrawingSupplier result = null;
		org.jfree.chart.plot.PolarPlot p = getPlot();
		if (p != null) {
			result = p.getDrawingSupplier();
		}
		return result;
	}

	public boolean isSeriesFilled(int series) {
		boolean result = false;
		java.lang.Boolean b = org.jfree.chart.renderer.DefaultPolarItemRenderer.this.seriesFilled.getBoolean(series);
		if (b != null) {
			result = b.booleanValue();
		}
		return result;
	}

	public void setSeriesFilled(int series, boolean filled) {
		org.jfree.chart.renderer.DefaultPolarItemRenderer.this.seriesFilled.setBoolean(series, java.lang.Boolean.valueOf(filled));
	}

	public void drawSeries(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo info, org.jfree.chart.plot.PolarPlot plot, org.jfree.data.xy.XYDataset dataset, int seriesIndex) {
		java.awt.Polygon poly = new java.awt.Polygon();
		int numPoints = dataset.getItemCount(seriesIndex);
		for (int i = 0; i < numPoints; i++) {
			double theta = dataset.getXValue(seriesIndex, i);
			double radius = dataset.getYValue(seriesIndex, i);
			java.awt.Point p = plot.translateValueThetaRadiusToJava2D(theta, radius, dataArea);
			poly.addPoint(p.x, p.y);
		}
		g2.setPaint(lookupSeriesPaint(seriesIndex));
		g2.setStroke(lookupSeriesStroke(seriesIndex));
		if (isSeriesFilled(seriesIndex)) {
			java.awt.Composite savedComposite = g2.getComposite();
			g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, 0.5F));
			g2.fill(poly);
			g2.setComposite(savedComposite);
		}else {
			g2.draw(poly);
		}
	}

	public void drawAngularGridLines(java.awt.Graphics2D g2, org.jfree.chart.plot.PolarPlot plot, java.util.List ticks, java.awt.geom.Rectangle2D dataArea) {
		g2.setFont(plot.getAngleLabelFont());
		g2.setStroke(plot.getAngleGridlineStroke());
		g2.setPaint(plot.getAngleGridlinePaint());
		double axisMin = plot.getAxis().getLowerBound();
		double maxRadius = plot.getMaxRadius();
		java.awt.Point center = plot.translateValueThetaRadiusToJava2D(axisMin, axisMin, dataArea);
		java.util.Iterator iterator = ticks.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.axis.NumberTick tick = ((org.jfree.chart.axis.NumberTick) (iterator.next()));
			java.awt.Point p = plot.translateValueThetaRadiusToJava2D(tick.getNumber().doubleValue(), maxRadius, dataArea);
			g2.setPaint(plot.getAngleGridlinePaint());
			g2.drawLine(center.x, center.y, p.x, p.y);
			if (plot.isAngleLabelsVisible()) {
				int x = p.x;
				int y = p.y;
				g2.setPaint(plot.getAngleLabelPaint());
				org.jfree.chart.text.TextUtilities.drawAlignedString(tick.getText(), g2, x, y, org.jfree.chart.text.TextAnchor.CENTER);
			}
		} 
	}

	public void drawRadialGridLines(java.awt.Graphics2D g2, org.jfree.chart.plot.PolarPlot plot, org.jfree.chart.axis.ValueAxis radialAxis, java.util.List ticks, java.awt.geom.Rectangle2D dataArea) {
		g2.setFont(radialAxis.getTickLabelFont());
		g2.setPaint(plot.getRadiusGridlinePaint());
		g2.setStroke(plot.getRadiusGridlineStroke());
		double axisMin = radialAxis.getLowerBound();
		java.awt.Point center = plot.translateValueThetaRadiusToJava2D(axisMin, axisMin, dataArea);
		java.util.Iterator iterator = ticks.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.axis.NumberTick tick = ((org.jfree.chart.axis.NumberTick) (iterator.next()));
			java.awt.Point p = plot.translateValueThetaRadiusToJava2D(90.0, tick.getNumber().doubleValue(), dataArea);
			int r = (p.x) - (center.x);
			int upperLeftX = (center.x) - r;
			int upperLeftY = (center.y) - r;
			int d = 2 * r;
			java.awt.geom.Ellipse2D ring = new java.awt.geom.Ellipse2D.Double(upperLeftX, upperLeftY, d, d);
			g2.setPaint(plot.getRadiusGridlinePaint());
			g2.draw(ring);
		} 
	}

	public org.jfree.chart.LegendItem getLegendItem(int series) {
		org.jfree.chart.LegendItem result = null;
		org.jfree.chart.plot.PolarPlot polarPlot = getPlot();
		if (polarPlot != null) {
			org.jfree.data.xy.XYDataset dataset = polarPlot.getDataset();
			if (dataset != null) {
				java.lang.String label = dataset.getSeriesKey(series).toString();
				java.lang.String description = label;
				java.awt.Shape shape = lookupSeriesShape(series);
				java.awt.Paint paint = lookupSeriesPaint(series);
				java.awt.Paint outlinePaint = lookupSeriesOutlinePaint(series);
				java.awt.Stroke outlineStroke = lookupSeriesOutlineStroke(series);
				result = new org.jfree.chart.LegendItem(label, description, null, null, shape, paint, outlineStroke, outlinePaint);
				result.setDataset(dataset);
			}
		}
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof org.jfree.chart.renderer.DefaultPolarItemRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.DefaultPolarItemRenderer that = ((org.jfree.chart.renderer.DefaultPolarItemRenderer) (obj));
		if (!(org.jfree.chart.renderer.DefaultPolarItemRenderer.this.seriesFilled.equals(that.seriesFilled))) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.renderer.DefaultPolarItemRenderer clone = ((org.jfree.chart.renderer.DefaultPolarItemRenderer) (super.clone()));
		clone.seriesFilled = ((org.jfree.chart.util.BooleanList) (org.jfree.chart.renderer.DefaultPolarItemRenderer.this.seriesFilled.clone()));
		return clone;
	}
}


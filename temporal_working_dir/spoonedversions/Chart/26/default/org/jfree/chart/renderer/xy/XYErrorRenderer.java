

package org.jfree.chart.renderer.xy;


public class XYErrorRenderer extends org.jfree.chart.renderer.xy.XYLineAndShapeRenderer {
	private boolean drawXError;

	private boolean drawYError;

	private double capLength;

	private transient java.awt.Paint errorPaint;

	public XYErrorRenderer() {
		super(false, true);
		org.jfree.chart.renderer.xy.XYErrorRenderer.this.drawXError = true;
		org.jfree.chart.renderer.xy.XYErrorRenderer.this.drawYError = true;
		org.jfree.chart.renderer.xy.XYErrorRenderer.this.errorPaint = null;
		org.jfree.chart.renderer.xy.XYErrorRenderer.this.capLength = 4.0;
	}

	public boolean getDrawXError() {
		return org.jfree.chart.renderer.xy.XYErrorRenderer.this.drawXError;
	}

	public void setDrawXError(boolean draw) {
		if ((org.jfree.chart.renderer.xy.XYErrorRenderer.this.drawXError) != draw) {
			org.jfree.chart.renderer.xy.XYErrorRenderer.this.drawXError = draw;
			org.jfree.chart.renderer.xy.XYErrorRenderer.this.notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.XYErrorRenderer.this));
		}
	}

	public boolean getDrawYError() {
		return org.jfree.chart.renderer.xy.XYErrorRenderer.this.drawYError;
	}

	public void setDrawYError(boolean draw) {
		if ((org.jfree.chart.renderer.xy.XYErrorRenderer.this.drawYError) != draw) {
			org.jfree.chart.renderer.xy.XYErrorRenderer.this.drawYError = draw;
			notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.XYErrorRenderer.this));
		}
	}

	public double getCapLength() {
		return org.jfree.chart.renderer.xy.XYErrorRenderer.this.capLength;
	}

	public void setCapLength(double length) {
		org.jfree.chart.renderer.xy.XYErrorRenderer.this.capLength = length;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.XYErrorRenderer.this));
	}

	public java.awt.Paint getErrorPaint() {
		return org.jfree.chart.renderer.xy.XYErrorRenderer.this.errorPaint;
	}

	public void setErrorPaint(java.awt.Paint paint) {
		org.jfree.chart.renderer.xy.XYErrorRenderer.this.errorPaint = paint;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.XYErrorRenderer.this));
	}

	public org.jfree.data.Range findDomainBounds(org.jfree.data.xy.XYDataset dataset) {
		if (dataset != null) {
			return org.jfree.data.general.DatasetUtilities.findDomainBounds(dataset, true);
		}else {
			return null;
		}
	}

	public org.jfree.data.Range findRangeBounds(org.jfree.data.xy.XYDataset dataset) {
		if (dataset != null) {
			return org.jfree.data.general.DatasetUtilities.findRangeBounds(dataset, true);
		}else {
			return null;
		}
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo info, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, org.jfree.chart.plot.CrosshairState crosshairState, int pass) {
		if (((pass == 0) && (dataset instanceof org.jfree.data.xy.IntervalXYDataset)) && (getItemVisible(series, item))) {
			org.jfree.data.xy.IntervalXYDataset ixyd = ((org.jfree.data.xy.IntervalXYDataset) (dataset));
			org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
			if (org.jfree.chart.renderer.xy.XYErrorRenderer.this.drawXError) {
				double x0 = ixyd.getStartXValue(series, item);
				double x1 = ixyd.getEndXValue(series, item);
				double y = ixyd.getYValue(series, item);
				org.jfree.chart.util.RectangleEdge edge = plot.getDomainAxisEdge();
				double xx0 = domainAxis.valueToJava2D(x0, dataArea, edge);
				double xx1 = domainAxis.valueToJava2D(x1, dataArea, edge);
				double yy = rangeAxis.valueToJava2D(y, dataArea, plot.getRangeAxisEdge());
				java.awt.geom.Line2D line;
				java.awt.geom.Line2D cap1 = null;
				java.awt.geom.Line2D cap2 = null;
				double adj = (org.jfree.chart.renderer.xy.XYErrorRenderer.this.capLength) / 2.0;
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					line = new java.awt.geom.Line2D.Double(xx0, yy, xx1, yy);
					cap1 = new java.awt.geom.Line2D.Double(xx0, (yy - adj), xx0, (yy + adj));
					cap2 = new java.awt.geom.Line2D.Double(xx1, (yy - adj), xx1, (yy + adj));
				}else {
					line = new java.awt.geom.Line2D.Double(yy, xx0, yy, xx1);
					cap1 = new java.awt.geom.Line2D.Double((yy - adj), xx0, (yy + adj), xx0);
					cap2 = new java.awt.geom.Line2D.Double((yy - adj), xx1, (yy + adj), xx1);
				}
				g2.setStroke(new java.awt.BasicStroke(1.0F));
				if ((org.jfree.chart.renderer.xy.XYErrorRenderer.this.errorPaint) != null) {
					g2.setPaint(org.jfree.chart.renderer.xy.XYErrorRenderer.this.errorPaint);
				}else {
					g2.setPaint(getItemPaint(series, item));
				}
				g2.draw(line);
				g2.draw(cap1);
				g2.draw(cap2);
			}
			if (org.jfree.chart.renderer.xy.XYErrorRenderer.this.drawYError) {
				double y0 = ixyd.getStartYValue(series, item);
				double y1 = ixyd.getEndYValue(series, item);
				double x = ixyd.getXValue(series, item);
				org.jfree.chart.util.RectangleEdge edge = plot.getRangeAxisEdge();
				double yy0 = rangeAxis.valueToJava2D(y0, dataArea, edge);
				double yy1 = rangeAxis.valueToJava2D(y1, dataArea, edge);
				double xx = domainAxis.valueToJava2D(x, dataArea, plot.getDomainAxisEdge());
				java.awt.geom.Line2D line;
				java.awt.geom.Line2D cap1 = null;
				java.awt.geom.Line2D cap2 = null;
				double adj = (org.jfree.chart.renderer.xy.XYErrorRenderer.this.capLength) / 2.0;
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					line = new java.awt.geom.Line2D.Double(xx, yy0, xx, yy1);
					cap1 = new java.awt.geom.Line2D.Double((xx - adj), yy0, (xx + adj), yy0);
					cap2 = new java.awt.geom.Line2D.Double((xx - adj), yy1, (xx + adj), yy1);
				}else {
					line = new java.awt.geom.Line2D.Double(yy0, xx, yy1, xx);
					cap1 = new java.awt.geom.Line2D.Double(yy0, (xx - adj), yy0, (xx + adj));
					cap2 = new java.awt.geom.Line2D.Double(yy1, (xx - adj), yy1, (xx + adj));
				}
				g2.setStroke(new java.awt.BasicStroke(1.0F));
				if ((org.jfree.chart.renderer.xy.XYErrorRenderer.this.errorPaint) != null) {
					g2.setPaint(org.jfree.chart.renderer.xy.XYErrorRenderer.this.errorPaint);
				}else {
					g2.setPaint(getItemPaint(series, item));
				}
				g2.draw(line);
				g2.draw(cap1);
				g2.draw(cap2);
			}
		}
		super.drawItem(g2, state, dataArea, info, plot, domainAxis, rangeAxis, dataset, series, item, crosshairState, pass);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.XYErrorRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.XYErrorRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.xy.XYErrorRenderer that = ((org.jfree.chart.renderer.xy.XYErrorRenderer) (obj));
		if ((org.jfree.chart.renderer.xy.XYErrorRenderer.this.drawXError) != (that.drawXError)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYErrorRenderer.this.drawYError) != (that.drawYError)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYErrorRenderer.this.capLength) != (that.capLength)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.xy.XYErrorRenderer.this.errorPaint, that.errorPaint))) {
			return false;
		}
		return super.equals(obj);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.xy.XYErrorRenderer.this.errorPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.xy.XYErrorRenderer.this.errorPaint, stream);
	}
}


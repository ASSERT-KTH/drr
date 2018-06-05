

package org.jfree.chart.renderer.xy;


public class HighLowRenderer extends org.jfree.chart.renderer.xy.AbstractXYItemRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.renderer.xy.XYItemRenderer , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -8135673815876552516L;

	private boolean drawOpenTicks;

	private boolean drawCloseTicks;

	private transient java.awt.Paint openTickPaint;

	private transient java.awt.Paint closeTickPaint;

	private double tickLength;

	public HighLowRenderer() {
		super();
		org.jfree.chart.renderer.xy.HighLowRenderer.this.drawOpenTicks = true;
		org.jfree.chart.renderer.xy.HighLowRenderer.this.drawCloseTicks = true;
		org.jfree.chart.renderer.xy.HighLowRenderer.this.tickLength = 2.0;
	}

	public boolean getDrawOpenTicks() {
		return org.jfree.chart.renderer.xy.HighLowRenderer.this.drawOpenTicks;
	}

	public void setDrawOpenTicks(boolean draw) {
		org.jfree.chart.renderer.xy.HighLowRenderer.this.drawOpenTicks = draw;
		fireChangeEvent();
	}

	public boolean getDrawCloseTicks() {
		return org.jfree.chart.renderer.xy.HighLowRenderer.this.drawCloseTicks;
	}

	public void setDrawCloseTicks(boolean draw) {
		org.jfree.chart.renderer.xy.HighLowRenderer.this.drawCloseTicks = draw;
		fireChangeEvent();
	}

	public java.awt.Paint getOpenTickPaint() {
		return org.jfree.chart.renderer.xy.HighLowRenderer.this.openTickPaint;
	}

	public void setOpenTickPaint(java.awt.Paint paint) {
		org.jfree.chart.renderer.xy.HighLowRenderer.this.openTickPaint = paint;
		fireChangeEvent();
	}

	public java.awt.Paint getCloseTickPaint() {
		return org.jfree.chart.renderer.xy.HighLowRenderer.this.closeTickPaint;
	}

	public void setCloseTickPaint(java.awt.Paint paint) {
		org.jfree.chart.renderer.xy.HighLowRenderer.this.closeTickPaint = paint;
		fireChangeEvent();
	}

	public double getTickLength() {
		return org.jfree.chart.renderer.xy.HighLowRenderer.this.tickLength;
	}

	public void setTickLength(double length) {
		org.jfree.chart.renderer.xy.HighLowRenderer.this.tickLength = length;
		fireChangeEvent();
	}

	public org.jfree.data.Range findRangeBounds(org.jfree.data.xy.XYDataset dataset) {
		if (dataset != null) {
			return org.jfree.data.general.DatasetUtilities.findRangeBounds(dataset, true);
		}else {
			return null;
		}
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo info, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, org.jfree.chart.plot.CrosshairState crosshairState, int pass) {
		double x = dataset.getXValue(series, item);
		if (!(domainAxis.getRange().contains(x))) {
			return ;
		}
		double xx = domainAxis.valueToJava2D(x, dataArea, plot.getDomainAxisEdge());
		java.awt.Shape entityArea = null;
		org.jfree.chart.entity.EntityCollection entities = null;
		if (info != null) {
			entities = info.getOwner().getEntityCollection();
		}
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		org.jfree.chart.util.RectangleEdge location = plot.getRangeAxisEdge();
		java.awt.Paint itemPaint = getItemPaint(series, item);
		java.awt.Stroke itemStroke = getItemStroke(series, item);
		g2.setPaint(itemPaint);
		g2.setStroke(itemStroke);
		if (dataset instanceof org.jfree.data.xy.OHLCDataset) {
			org.jfree.data.xy.OHLCDataset hld = ((org.jfree.data.xy.OHLCDataset) (dataset));
			double yHigh = hld.getHighValue(series, item);
			double yLow = hld.getLowValue(series, item);
			if ((!(java.lang.Double.isNaN(yHigh))) && (!(java.lang.Double.isNaN(yLow)))) {
				double yyHigh = rangeAxis.valueToJava2D(yHigh, dataArea, location);
				double yyLow = rangeAxis.valueToJava2D(yLow, dataArea, location);
				if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					g2.draw(new java.awt.geom.Line2D.Double(yyLow, xx, yyHigh, xx));
					entityArea = new java.awt.geom.Rectangle2D.Double(java.lang.Math.min(yyLow, yyHigh), (xx - 1.0), java.lang.Math.abs((yyHigh - yyLow)), 2.0);
				}else
					if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
						g2.draw(new java.awt.geom.Line2D.Double(xx, yyLow, xx, yyHigh));
						entityArea = new java.awt.geom.Rectangle2D.Double((xx - 1.0), java.lang.Math.min(yyLow, yyHigh), 2.0, java.lang.Math.abs((yyHigh - yyLow)));
					}
				
			}
			double delta = getTickLength();
			if (domainAxis.isInverted()) {
				delta = -delta;
			}
			if (getDrawOpenTicks()) {
				double yOpen = hld.getOpenValue(series, item);
				if (!(java.lang.Double.isNaN(yOpen))) {
					double yyOpen = rangeAxis.valueToJava2D(yOpen, dataArea, location);
					if ((org.jfree.chart.renderer.xy.HighLowRenderer.this.openTickPaint) != null) {
						g2.setPaint(org.jfree.chart.renderer.xy.HighLowRenderer.this.openTickPaint);
					}else {
						g2.setPaint(itemPaint);
					}
					if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
						g2.draw(new java.awt.geom.Line2D.Double(yyOpen, (xx + delta), yyOpen, xx));
					}else
						if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
							g2.draw(new java.awt.geom.Line2D.Double((xx - delta), yyOpen, xx, yyOpen));
						}
					
				}
			}
			if (getDrawCloseTicks()) {
				double yClose = hld.getCloseValue(series, item);
				if (!(java.lang.Double.isNaN(yClose))) {
					double yyClose = rangeAxis.valueToJava2D(yClose, dataArea, location);
					if ((org.jfree.chart.renderer.xy.HighLowRenderer.this.closeTickPaint) != null) {
						g2.setPaint(org.jfree.chart.renderer.xy.HighLowRenderer.this.closeTickPaint);
					}else {
						g2.setPaint(itemPaint);
					}
					if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
						g2.draw(new java.awt.geom.Line2D.Double(yyClose, xx, yyClose, (xx - delta)));
					}else
						if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
							g2.draw(new java.awt.geom.Line2D.Double(xx, yyClose, (xx + delta), yyClose));
						}
					
				}
			}
		}else {
			if (item > 0) {
				double x0 = dataset.getXValue(series, (item - 1));
				double y0 = dataset.getYValue(series, (item - 1));
				double y = dataset.getYValue(series, item);
				if (((java.lang.Double.isNaN(x0)) || (java.lang.Double.isNaN(y0))) || (java.lang.Double.isNaN(y))) {
					return ;
				}
				double xx0 = domainAxis.valueToJava2D(x0, dataArea, plot.getDomainAxisEdge());
				double yy0 = rangeAxis.valueToJava2D(y0, dataArea, location);
				double yy = rangeAxis.valueToJava2D(y, dataArea, location);
				if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					g2.draw(new java.awt.geom.Line2D.Double(yy0, xx0, yy, xx));
				}else
					if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
						g2.draw(new java.awt.geom.Line2D.Double(xx0, yy0, xx, yy));
					}
				
			}
		}
		if (entities != null) {
			addEntity(entities, entityArea, dataset, series, item, 0.0, 0.0);
		}
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.renderer.xy.HighLowRenderer.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.HighLowRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.xy.HighLowRenderer that = ((org.jfree.chart.renderer.xy.HighLowRenderer) (obj));
		if ((org.jfree.chart.renderer.xy.HighLowRenderer.this.drawOpenTicks) != (that.drawOpenTicks)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.HighLowRenderer.this.drawCloseTicks) != (that.drawCloseTicks)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.xy.HighLowRenderer.this.openTickPaint, that.openTickPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.xy.HighLowRenderer.this.closeTickPaint, that.closeTickPaint))) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.HighLowRenderer.this.tickLength) != (that.tickLength)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		return true;
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.xy.HighLowRenderer.this.openTickPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.renderer.xy.HighLowRenderer.this.closeTickPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.xy.HighLowRenderer.this.openTickPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.xy.HighLowRenderer.this.closeTickPaint, stream);
	}
}


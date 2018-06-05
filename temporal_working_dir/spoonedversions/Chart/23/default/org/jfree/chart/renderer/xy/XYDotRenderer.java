

package org.jfree.chart.renderer.xy;


public class XYDotRenderer extends org.jfree.chart.renderer.xy.AbstractXYItemRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.renderer.xy.XYItemRenderer , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -2764344339073566425L;

	private int dotWidth;

	private int dotHeight;

	public XYDotRenderer() {
		super();
		org.jfree.chart.renderer.xy.XYDotRenderer.this.dotWidth = 1;
		org.jfree.chart.renderer.xy.XYDotRenderer.this.dotHeight = 1;
	}

	public int getDotWidth() {
		return org.jfree.chart.renderer.xy.XYDotRenderer.this.dotWidth;
	}

	public void setDotWidth(int w) {
		if (w < 1) {
			throw new java.lang.IllegalArgumentException("Requires w > 0.");
		}
		org.jfree.chart.renderer.xy.XYDotRenderer.this.dotWidth = w;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.XYDotRenderer.this));
	}

	public int getDotHeight() {
		return org.jfree.chart.renderer.xy.XYDotRenderer.this.dotHeight;
	}

	public void setDotHeight(int h) {
		if (h < 1) {
			throw new java.lang.IllegalArgumentException("Requires h > 0.");
		}
		org.jfree.chart.renderer.xy.XYDotRenderer.this.dotHeight = h;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.XYDotRenderer.this));
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo info, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, org.jfree.chart.plot.CrosshairState crosshairState, int pass) {
		double x = dataset.getXValue(series, item);
		double y = dataset.getYValue(series, item);
		double adjx = ((org.jfree.chart.renderer.xy.XYDotRenderer.this.dotWidth) - 1) / 2.0;
		double adjy = ((org.jfree.chart.renderer.xy.XYDotRenderer.this.dotHeight) - 1) / 2.0;
		if (!(java.lang.Double.isNaN(y))) {
			org.jfree.chart.util.RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
			org.jfree.chart.util.RectangleEdge yAxisLocation = plot.getRangeAxisEdge();
			double transX = (domainAxis.valueToJava2D(x, dataArea, xAxisLocation)) - adjx;
			double transY = (rangeAxis.valueToJava2D(y, dataArea, yAxisLocation)) - adjy;
			g2.setPaint(getItemPaint(series, item));
			org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				g2.fillRect(((int) (transY)), ((int) (transX)), org.jfree.chart.renderer.xy.XYDotRenderer.this.dotHeight, org.jfree.chart.renderer.xy.XYDotRenderer.this.dotWidth);
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					g2.fillRect(((int) (transX)), ((int) (transY)), org.jfree.chart.renderer.xy.XYDotRenderer.this.dotWidth, org.jfree.chart.renderer.xy.XYDotRenderer.this.dotHeight);
				}
			
			int domainAxisIndex = plot.getDomainAxisIndex(domainAxis);
			int rangeAxisIndex = plot.getRangeAxisIndex(rangeAxis);
			updateCrosshairValues(crosshairState, x, y, domainAxisIndex, rangeAxisIndex, transX, transY, orientation);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.XYDotRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.XYDotRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.xy.XYDotRenderer that = ((org.jfree.chart.renderer.xy.XYDotRenderer) (obj));
		if ((org.jfree.chart.renderer.xy.XYDotRenderer.this.dotWidth) != (that.dotWidth)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYDotRenderer.this.dotHeight) != (that.dotHeight)) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}


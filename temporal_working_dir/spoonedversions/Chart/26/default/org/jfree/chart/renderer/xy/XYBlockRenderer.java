

package org.jfree.chart.renderer.xy;


public class XYBlockRenderer extends org.jfree.chart.renderer.xy.AbstractXYItemRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.renderer.xy.XYItemRenderer {
	private double blockWidth = 1.0;

	private double blockHeight = 1.0;

	private org.jfree.chart.util.RectangleAnchor blockAnchor = org.jfree.chart.util.RectangleAnchor.CENTER;

	private double xOffset;

	private double yOffset;

	private org.jfree.chart.renderer.PaintScale paintScale;

	public XYBlockRenderer() {
		updateOffsets();
		org.jfree.chart.renderer.xy.XYBlockRenderer.this.paintScale = new org.jfree.chart.renderer.LookupPaintScale();
	}

	public double getBlockWidth() {
		return org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockWidth;
	}

	public void setBlockWidth(double width) {
		if (width <= 0.0) {
			throw new java.lang.IllegalArgumentException("The 'width' argument must be > 0.0");
		}
		org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockWidth = width;
		updateOffsets();
		org.jfree.chart.renderer.xy.XYBlockRenderer.this.notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.XYBlockRenderer.this));
	}

	public double getBlockHeight() {
		return org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockHeight;
	}

	public void setBlockHeight(double height) {
		if (height <= 0.0) {
			throw new java.lang.IllegalArgumentException("The 'height' argument must be > 0.0");
		}
		org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockHeight = height;
		updateOffsets();
		org.jfree.chart.renderer.xy.XYBlockRenderer.this.notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.XYBlockRenderer.this));
	}

	public org.jfree.chart.util.RectangleAnchor getBlockAnchor() {
		return org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockAnchor;
	}

	public void setBlockAnchor(org.jfree.chart.util.RectangleAnchor anchor) {
		if (anchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'anchor' argument.");
		}
		if (org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockAnchor.equals(anchor)) {
			return ;
		}
		org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockAnchor = anchor;
		updateOffsets();
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.XYBlockRenderer.this));
	}

	public org.jfree.chart.renderer.PaintScale getPaintScale() {
		return org.jfree.chart.renderer.xy.XYBlockRenderer.this.paintScale;
	}

	public void setPaintScale(org.jfree.chart.renderer.PaintScale scale) {
		if (scale == null) {
			throw new java.lang.IllegalArgumentException("Null 'scale' argument.");
		}
		org.jfree.chart.renderer.xy.XYBlockRenderer.this.paintScale = scale;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.XYBlockRenderer.this));
	}

	private void updateOffsets() {
		if (org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockAnchor.equals(org.jfree.chart.util.RectangleAnchor.BOTTOM_LEFT)) {
			org.jfree.chart.renderer.xy.XYBlockRenderer.this.xOffset = 0.0;
			org.jfree.chart.renderer.xy.XYBlockRenderer.this.yOffset = 0.0;
		}else
			if (org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockAnchor.equals(org.jfree.chart.util.RectangleAnchor.BOTTOM)) {
				org.jfree.chart.renderer.xy.XYBlockRenderer.this.xOffset = (-(org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockWidth)) / 2.0;
				org.jfree.chart.renderer.xy.XYBlockRenderer.this.yOffset = 0.0;
			}else
				if (org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockAnchor.equals(org.jfree.chart.util.RectangleAnchor.BOTTOM_RIGHT)) {
					org.jfree.chart.renderer.xy.XYBlockRenderer.this.xOffset = -(org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockWidth);
					org.jfree.chart.renderer.xy.XYBlockRenderer.this.yOffset = 0.0;
				}else
					if (org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockAnchor.equals(org.jfree.chart.util.RectangleAnchor.LEFT)) {
						org.jfree.chart.renderer.xy.XYBlockRenderer.this.xOffset = 0.0;
						org.jfree.chart.renderer.xy.XYBlockRenderer.this.yOffset = (-(org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockHeight)) / 2.0;
					}else
						if (org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockAnchor.equals(org.jfree.chart.util.RectangleAnchor.CENTER)) {
							org.jfree.chart.renderer.xy.XYBlockRenderer.this.xOffset = (-(org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockWidth)) / 2.0;
							org.jfree.chart.renderer.xy.XYBlockRenderer.this.yOffset = (-(org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockHeight)) / 2.0;
						}else
							if (org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockAnchor.equals(org.jfree.chart.util.RectangleAnchor.RIGHT)) {
								org.jfree.chart.renderer.xy.XYBlockRenderer.this.xOffset = -(org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockWidth);
								org.jfree.chart.renderer.xy.XYBlockRenderer.this.yOffset = (-(org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockHeight)) / 2.0;
							}else
								if (org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockAnchor.equals(org.jfree.chart.util.RectangleAnchor.TOP_LEFT)) {
									org.jfree.chart.renderer.xy.XYBlockRenderer.this.xOffset = 0.0;
									org.jfree.chart.renderer.xy.XYBlockRenderer.this.yOffset = -(org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockHeight);
								}else
									if (org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockAnchor.equals(org.jfree.chart.util.RectangleAnchor.TOP)) {
										org.jfree.chart.renderer.xy.XYBlockRenderer.this.xOffset = (-(org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockWidth)) / 2.0;
										org.jfree.chart.renderer.xy.XYBlockRenderer.this.yOffset = -(org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockHeight);
									}else
										if (org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockAnchor.equals(org.jfree.chart.util.RectangleAnchor.TOP_RIGHT)) {
											org.jfree.chart.renderer.xy.XYBlockRenderer.this.xOffset = -(org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockWidth);
											org.jfree.chart.renderer.xy.XYBlockRenderer.this.yOffset = -(org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockHeight);
										}
									
								
							
						
					
				
			
		
	}

	public org.jfree.data.Range findDomainBounds(org.jfree.data.xy.XYDataset dataset) {
		if (dataset != null) {
			org.jfree.data.Range r = org.jfree.data.general.DatasetUtilities.findDomainBounds(dataset, false);
			return new org.jfree.data.Range(((r.getLowerBound()) + (org.jfree.chart.renderer.xy.XYBlockRenderer.this.xOffset)), (((r.getUpperBound()) + (org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockWidth)) + (org.jfree.chart.renderer.xy.XYBlockRenderer.this.xOffset)));
		}else {
			return null;
		}
	}

	public org.jfree.data.Range findRangeBounds(org.jfree.data.xy.XYDataset dataset) {
		if (dataset != null) {
			org.jfree.data.Range r = org.jfree.data.general.DatasetUtilities.findRangeBounds(dataset, false);
			return new org.jfree.data.Range(((r.getLowerBound()) + (org.jfree.chart.renderer.xy.XYBlockRenderer.this.yOffset)), (((r.getUpperBound()) + (org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockHeight)) + (org.jfree.chart.renderer.xy.XYBlockRenderer.this.yOffset)));
		}else {
			return null;
		}
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo info, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, org.jfree.chart.plot.CrosshairState crosshairState, int pass) {
		double x = dataset.getXValue(series, item);
		double y = dataset.getYValue(series, item);
		double z = 0.0;
		if (dataset instanceof org.jfree.data.xy.XYZDataset) {
			z = ((org.jfree.data.xy.XYZDataset) (dataset)).getZValue(series, item);
		}
		java.awt.Paint p = org.jfree.chart.renderer.xy.XYBlockRenderer.this.paintScale.getPaint(z);
		double xx0 = domainAxis.valueToJava2D((x + (org.jfree.chart.renderer.xy.XYBlockRenderer.this.xOffset)), dataArea, plot.getDomainAxisEdge());
		double yy0 = rangeAxis.valueToJava2D((y + (org.jfree.chart.renderer.xy.XYBlockRenderer.this.yOffset)), dataArea, plot.getRangeAxisEdge());
		double xx1 = domainAxis.valueToJava2D(((x + (org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockWidth)) + (org.jfree.chart.renderer.xy.XYBlockRenderer.this.xOffset)), dataArea, plot.getDomainAxisEdge());
		double yy1 = rangeAxis.valueToJava2D(((y + (org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockHeight)) + (org.jfree.chart.renderer.xy.XYBlockRenderer.this.yOffset)), dataArea, plot.getRangeAxisEdge());
		java.awt.geom.Rectangle2D block;
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		if (orientation.equals(org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			block = new java.awt.geom.Rectangle2D.Double(java.lang.Math.min(yy0, yy1), java.lang.Math.min(xx0, xx1), java.lang.Math.abs((yy1 - yy0)), java.lang.Math.abs((xx0 - xx1)));
		}else {
			block = new java.awt.geom.Rectangle2D.Double(java.lang.Math.min(xx0, xx1), java.lang.Math.min(yy0, yy1), java.lang.Math.abs((xx1 - xx0)), java.lang.Math.abs((yy1 - yy0)));
		}
		g2.setPaint(p);
		g2.fill(block);
		g2.setStroke(new java.awt.BasicStroke(1.0F));
		g2.draw(block);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.XYBlockRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.XYBlockRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.xy.XYBlockRenderer that = ((org.jfree.chart.renderer.xy.XYBlockRenderer) (obj));
		if ((org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockHeight) != (that.blockHeight)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockWidth) != (that.blockWidth)) {
			return false;
		}
		if (!(org.jfree.chart.renderer.xy.XYBlockRenderer.this.blockAnchor.equals(that.blockAnchor))) {
			return false;
		}
		if (!(org.jfree.chart.renderer.xy.XYBlockRenderer.this.paintScale.equals(that.paintScale))) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.renderer.xy.XYBlockRenderer clone = ((org.jfree.chart.renderer.xy.XYBlockRenderer) (super.clone()));
		if ((org.jfree.chart.renderer.xy.XYBlockRenderer.this.paintScale) instanceof org.jfree.chart.util.PublicCloneable) {
			org.jfree.chart.util.PublicCloneable pc = ((org.jfree.chart.util.PublicCloneable) (org.jfree.chart.renderer.xy.XYBlockRenderer.this.paintScale));
			clone.paintScale = ((org.jfree.chart.renderer.PaintScale) (pc.clone()));
		}
		return clone;
	}
}


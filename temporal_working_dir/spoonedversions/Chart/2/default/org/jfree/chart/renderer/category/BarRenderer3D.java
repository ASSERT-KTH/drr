

package org.jfree.chart.renderer.category;


public class BarRenderer3D extends org.jfree.chart.renderer.category.BarRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.Effect3D , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 7686976503536003636L;

	public static final double DEFAULT_X_OFFSET = 12.0;

	public static final double DEFAULT_Y_OFFSET = 8.0;

	public static final java.awt.Paint DEFAULT_WALL_PAINT = new java.awt.Color(221, 221, 221);

	private double xOffset;

	private double yOffset;

	private transient java.awt.Paint wallPaint;

	public BarRenderer3D() {
		this(org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_X_OFFSET, org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_Y_OFFSET);
	}

	public BarRenderer3D(double xOffset, double yOffset) {
		super();
		org.jfree.chart.renderer.category.BarRenderer3D.this.xOffset = xOffset;
		org.jfree.chart.renderer.category.BarRenderer3D.this.yOffset = yOffset;
		org.jfree.chart.renderer.category.BarRenderer3D.this.wallPaint = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
		org.jfree.chart.labels.ItemLabelPosition p1 = new org.jfree.chart.labels.ItemLabelPosition(org.jfree.chart.labels.ItemLabelAnchor.INSIDE12, org.jfree.chart.text.TextAnchor.TOP_CENTER);
		setBasePositiveItemLabelPosition(p1);
		org.jfree.chart.labels.ItemLabelPosition p2 = new org.jfree.chart.labels.ItemLabelPosition(org.jfree.chart.labels.ItemLabelAnchor.INSIDE12, org.jfree.chart.text.TextAnchor.TOP_CENTER);
		setBaseNegativeItemLabelPosition(p2);
	}

	public double getXOffset() {
		return org.jfree.chart.renderer.category.BarRenderer3D.this.xOffset;
	}

	public double getYOffset() {
		return org.jfree.chart.renderer.category.BarRenderer3D.this.yOffset;
	}

	public java.awt.Paint getWallPaint() {
		return org.jfree.chart.renderer.category.BarRenderer3D.this.wallPaint;
	}

	public void setWallPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.renderer.category.BarRenderer3D.this.wallPaint = paint;
		fireChangeEvent();
	}

	public org.jfree.chart.renderer.category.CategoryItemRendererState initialise(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.data.category.CategoryDataset dataset, org.jfree.chart.plot.PlotRenderingInfo info) {
		java.awt.geom.Rectangle2D adjusted = new java.awt.geom.Rectangle2D.Double(dataArea.getX(), ((dataArea.getY()) + (getYOffset())), ((dataArea.getWidth()) - (getXOffset())), ((dataArea.getHeight()) - (getYOffset())));
		org.jfree.chart.renderer.category.CategoryItemRendererState state = super.initialise(g2, adjusted, plot, dataset, info);
		return state;
	}

	public void drawBackground(java.awt.Graphics2D g2, org.jfree.chart.plot.CategoryPlot plot, java.awt.geom.Rectangle2D dataArea) {
		float x0 = ((float) (dataArea.getX()));
		float x1 = x0 + ((float) (java.lang.Math.abs(org.jfree.chart.renderer.category.BarRenderer3D.this.xOffset)));
		float x3 = ((float) (dataArea.getMaxX()));
		float x2 = x3 - ((float) (java.lang.Math.abs(org.jfree.chart.renderer.category.BarRenderer3D.this.xOffset)));
		float y0 = ((float) (dataArea.getMaxY()));
		float y1 = y0 - ((float) (java.lang.Math.abs(org.jfree.chart.renderer.category.BarRenderer3D.this.yOffset)));
		float y3 = ((float) (dataArea.getMinY()));
		float y2 = y3 + ((float) (java.lang.Math.abs(org.jfree.chart.renderer.category.BarRenderer3D.this.yOffset)));
		java.awt.geom.GeneralPath clip = new java.awt.geom.GeneralPath();
		clip.moveTo(x0, y0);
		clip.lineTo(x0, y2);
		clip.lineTo(x1, y3);
		clip.lineTo(x3, y3);
		clip.lineTo(x3, y1);
		clip.lineTo(x2, y0);
		clip.closePath();
		java.awt.Composite originalComposite = g2.getComposite();
		g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, plot.getBackgroundAlpha()));
		java.awt.Paint backgroundPaint = plot.getBackgroundPaint();
		if (backgroundPaint != null) {
			g2.setPaint(backgroundPaint);
			g2.fill(clip);
		}
		java.awt.geom.GeneralPath leftWall = new java.awt.geom.GeneralPath();
		leftWall.moveTo(x0, y0);
		leftWall.lineTo(x0, y2);
		leftWall.lineTo(x1, y3);
		leftWall.lineTo(x1, y1);
		leftWall.closePath();
		g2.setPaint(getWallPaint());
		g2.fill(leftWall);
		java.awt.geom.GeneralPath bottomWall = new java.awt.geom.GeneralPath();
		bottomWall.moveTo(x0, y0);
		bottomWall.lineTo(x1, y1);
		bottomWall.lineTo(x3, y1);
		bottomWall.lineTo(x2, y0);
		bottomWall.closePath();
		g2.setPaint(getWallPaint());
		g2.fill(bottomWall);
		g2.setPaint(java.awt.Color.lightGray);
		java.awt.geom.Line2D corner = new java.awt.geom.Line2D.Double(x0, y0, x1, y1);
		g2.draw(corner);
		corner.setLine(x1, y1, x1, y3);
		g2.draw(corner);
		corner.setLine(x1, y1, x3, y1);
		g2.draw(corner);
		java.awt.Image backgroundImage = plot.getBackgroundImage();
		if (backgroundImage != null) {
			java.awt.geom.Rectangle2D adjusted = new java.awt.geom.Rectangle2D.Double(((dataArea.getX()) + (getXOffset())), dataArea.getY(), ((dataArea.getWidth()) - (getXOffset())), ((dataArea.getHeight()) - (getYOffset())));
			plot.drawBackgroundImage(g2, adjusted);
		}
		g2.setComposite(originalComposite);
	}

	public void drawOutline(java.awt.Graphics2D g2, org.jfree.chart.plot.CategoryPlot plot, java.awt.geom.Rectangle2D dataArea) {
		float x0 = ((float) (dataArea.getX()));
		float x1 = x0 + ((float) (java.lang.Math.abs(org.jfree.chart.renderer.category.BarRenderer3D.this.xOffset)));
		float x3 = ((float) (dataArea.getMaxX()));
		float x2 = x3 - ((float) (java.lang.Math.abs(org.jfree.chart.renderer.category.BarRenderer3D.this.xOffset)));
		float y0 = ((float) (dataArea.getMaxY()));
		float y1 = y0 - ((float) (java.lang.Math.abs(org.jfree.chart.renderer.category.BarRenderer3D.this.yOffset)));
		float y3 = ((float) (dataArea.getMinY()));
		float y2 = y3 + ((float) (java.lang.Math.abs(org.jfree.chart.renderer.category.BarRenderer3D.this.yOffset)));
		java.awt.geom.GeneralPath clip = new java.awt.geom.GeneralPath();
		clip.moveTo(x0, y0);
		clip.lineTo(x0, y2);
		clip.lineTo(x1, y3);
		clip.lineTo(x3, y3);
		clip.lineTo(x3, y1);
		clip.lineTo(x2, y0);
		clip.closePath();
		java.awt.Stroke outlineStroke = plot.getOutlineStroke();
		java.awt.Paint outlinePaint = plot.getOutlinePaint();
		if ((outlineStroke != null) && (outlinePaint != null)) {
			g2.setStroke(outlineStroke);
			g2.setPaint(outlinePaint);
			g2.draw(clip);
		}
	}

	public void drawDomainGridline(java.awt.Graphics2D g2, org.jfree.chart.plot.CategoryPlot plot, java.awt.geom.Rectangle2D dataArea, double value) {
		java.awt.geom.Line2D line1 = null;
		java.awt.geom.Line2D line2 = null;
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			double y0 = value;
			double y1 = value - (getYOffset());
			double x0 = dataArea.getMinX();
			double x1 = x0 + (getXOffset());
			double x2 = dataArea.getMaxX();
			line1 = new java.awt.geom.Line2D.Double(x0, y0, x1, y1);
			line2 = new java.awt.geom.Line2D.Double(x1, y1, x2, y1);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				double x0 = value;
				double x1 = value + (getXOffset());
				double y0 = dataArea.getMaxY();
				double y1 = y0 - (getYOffset());
				double y2 = dataArea.getMinY();
				line1 = new java.awt.geom.Line2D.Double(x0, y0, x1, y1);
				line2 = new java.awt.geom.Line2D.Double(x1, y1, x1, y2);
			}
		
		java.awt.Paint paint = plot.getDomainGridlinePaint();
		java.awt.Stroke stroke = plot.getDomainGridlineStroke();
		g2.setPaint((paint != null ? paint : org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT));
		g2.setStroke((stroke != null ? stroke : org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE));
		g2.draw(line1);
		g2.draw(line2);
	}

	public void drawRangeGridline(java.awt.Graphics2D g2, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.ValueAxis axis, java.awt.geom.Rectangle2D dataArea, double value) {
		org.jfree.data.Range range = axis.getRange();
		if (!(range.contains(value))) {
			return ;
		}
		java.awt.geom.Rectangle2D adjusted = new java.awt.geom.Rectangle2D.Double(dataArea.getX(), ((dataArea.getY()) + (getYOffset())), ((dataArea.getWidth()) - (getXOffset())), ((dataArea.getHeight()) - (getYOffset())));
		java.awt.geom.Line2D line1 = null;
		java.awt.geom.Line2D line2 = null;
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			double x0 = axis.valueToJava2D(value, adjusted, plot.getRangeAxisEdge());
			double x1 = x0 + (getXOffset());
			double y0 = dataArea.getMaxY();
			double y1 = y0 - (getYOffset());
			double y2 = dataArea.getMinY();
			line1 = new java.awt.geom.Line2D.Double(x0, y0, x1, y1);
			line2 = new java.awt.geom.Line2D.Double(x1, y1, x1, y2);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				double y0 = axis.valueToJava2D(value, adjusted, plot.getRangeAxisEdge());
				double y1 = y0 - (getYOffset());
				double x0 = dataArea.getMinX();
				double x1 = x0 + (getXOffset());
				double x2 = dataArea.getMaxX();
				line1 = new java.awt.geom.Line2D.Double(x0, y0, x1, y1);
				line2 = new java.awt.geom.Line2D.Double(x1, y1, x2, y1);
			}
		
		java.awt.Paint paint = plot.getRangeGridlinePaint();
		java.awt.Stroke stroke = plot.getRangeGridlineStroke();
		g2.setPaint((paint != null ? paint : org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT));
		g2.setStroke((stroke != null ? stroke : org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE));
		g2.draw(line1);
		g2.draw(line2);
	}

	public void drawRangeLine(java.awt.Graphics2D g2, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.ValueAxis axis, java.awt.geom.Rectangle2D dataArea, double value, java.awt.Paint paint, java.awt.Stroke stroke) {
		org.jfree.data.Range range = axis.getRange();
		if (!(range.contains(value))) {
			return ;
		}
		java.awt.geom.Rectangle2D adjusted = new java.awt.geom.Rectangle2D.Double(dataArea.getX(), ((dataArea.getY()) + (getYOffset())), ((dataArea.getWidth()) - (getXOffset())), ((dataArea.getHeight()) - (getYOffset())));
		java.awt.geom.Line2D line1 = null;
		java.awt.geom.Line2D line2 = null;
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			double x0 = axis.valueToJava2D(value, adjusted, plot.getRangeAxisEdge());
			double x1 = x0 + (getXOffset());
			double y0 = dataArea.getMaxY();
			double y1 = y0 - (getYOffset());
			double y2 = dataArea.getMinY();
			line1 = new java.awt.geom.Line2D.Double(x0, y0, x1, y1);
			line2 = new java.awt.geom.Line2D.Double(x1, y1, x1, y2);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				double y0 = axis.valueToJava2D(value, adjusted, plot.getRangeAxisEdge());
				double y1 = y0 - (getYOffset());
				double x0 = dataArea.getMinX();
				double x1 = x0 + (getXOffset());
				double x2 = dataArea.getMaxX();
				line1 = new java.awt.geom.Line2D.Double(x0, y0, x1, y1);
				line2 = new java.awt.geom.Line2D.Double(x1, y1, x2, y1);
			}
		
		g2.setPaint(paint);
		g2.setStroke(stroke);
		g2.draw(line1);
		g2.draw(line2);
	}

	public void drawRangeMarker(java.awt.Graphics2D g2, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.ValueAxis axis, org.jfree.chart.plot.Marker marker, java.awt.geom.Rectangle2D dataArea) {
		java.awt.geom.Rectangle2D adjusted = new java.awt.geom.Rectangle2D.Double(dataArea.getX(), ((dataArea.getY()) + (getYOffset())), ((dataArea.getWidth()) - (getXOffset())), ((dataArea.getHeight()) - (getYOffset())));
		if (marker instanceof org.jfree.chart.plot.ValueMarker) {
			org.jfree.chart.plot.ValueMarker vm = ((org.jfree.chart.plot.ValueMarker) (marker));
			double value = vm.getValue();
			org.jfree.data.Range range = axis.getRange();
			if (!(range.contains(value))) {
				return ;
			}
			java.awt.geom.GeneralPath path = null;
			org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				float x = ((float) (axis.valueToJava2D(value, adjusted, plot.getRangeAxisEdge())));
				float y = ((float) (adjusted.getMaxY()));
				path = new java.awt.geom.GeneralPath();
				path.moveTo(x, y);
				path.lineTo(((float) (x + (getXOffset()))), (y - ((float) (getYOffset()))));
				path.lineTo(((float) (x + (getXOffset()))), ((float) ((adjusted.getMinY()) - (getYOffset()))));
				path.lineTo(x, ((float) (adjusted.getMinY())));
				path.closePath();
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					float y = ((float) (axis.valueToJava2D(value, adjusted, plot.getRangeAxisEdge())));
					float x = ((float) (dataArea.getX()));
					path = new java.awt.geom.GeneralPath();
					path.moveTo(x, y);
					path.lineTo((x + ((float) (org.jfree.chart.renderer.category.BarRenderer3D.this.xOffset))), (y - ((float) (org.jfree.chart.renderer.category.BarRenderer3D.this.yOffset))));
					path.lineTo(((float) ((adjusted.getMaxX()) + (org.jfree.chart.renderer.category.BarRenderer3D.this.xOffset))), (y - ((float) (org.jfree.chart.renderer.category.BarRenderer3D.this.yOffset))));
					path.lineTo(((float) (adjusted.getMaxX())), y);
					path.closePath();
				}
			
			g2.setPaint(marker.getPaint());
			g2.fill(path);
			g2.setPaint(marker.getOutlinePaint());
			g2.draw(path);
			java.lang.String label = marker.getLabel();
			org.jfree.chart.util.RectangleAnchor anchor = marker.getLabelAnchor();
			if (label != null) {
				java.awt.Font labelFont = marker.getLabelFont();
				g2.setFont(labelFont);
				g2.setPaint(marker.getLabelPaint());
				java.awt.geom.Point2D coordinates = calculateRangeMarkerTextAnchorPoint(g2, orientation, dataArea, path.getBounds2D(), marker.getLabelOffset(), org.jfree.chart.util.LengthAdjustmentType.EXPAND, anchor);
				org.jfree.chart.text.TextUtilities.drawAlignedString(label, g2, ((float) (coordinates.getX())), ((float) (coordinates.getY())), marker.getLabelTextAnchor());
			}
		}else {
			super.drawRangeMarker(g2, plot, axis, marker, adjusted);
		}
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, boolean selected, int pass) {
		java.lang.Number dataValue = dataset.getValue(row, column);
		if (dataValue == null) {
			return ;
		}
		double value = dataValue.doubleValue();
		java.awt.geom.Rectangle2D adjusted = new java.awt.geom.Rectangle2D.Double(dataArea.getX(), ((dataArea.getY()) + (getYOffset())), ((dataArea.getWidth()) - (getXOffset())), ((dataArea.getHeight()) - (getYOffset())));
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		double barW0 = calculateBarW0(plot, orientation, adjusted, domainAxis, state, row, column);
		double[] barL0L1 = calculateBarL0L1(value, rangeAxis.getLowerBound(), rangeAxis.getUpperBound());
		if (barL0L1 == null) {
			return ;
		}
		org.jfree.chart.util.RectangleEdge edge = plot.getRangeAxisEdge();
		double transL0 = rangeAxis.valueToJava2D(barL0L1[0], adjusted, edge);
		double transL1 = rangeAxis.valueToJava2D(barL0L1[1], adjusted, edge);
		double barL0 = java.lang.Math.min(transL0, transL1);
		double barLength = java.lang.Math.abs((transL1 - transL0));
		java.awt.geom.Rectangle2D bar = null;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			bar = new java.awt.geom.Rectangle2D.Double(barL0, barW0, barLength, state.getBarWidth());
		}else {
			bar = new java.awt.geom.Rectangle2D.Double(barW0, barL0, state.getBarWidth(), barLength);
		}
		java.awt.Paint itemPaint = getItemPaint(row, column, selected);
		g2.setPaint(itemPaint);
		g2.fill(bar);
		double x0 = bar.getMinX();
		double x1 = x0 + (getXOffset());
		double x2 = bar.getMaxX();
		double x3 = x2 + (getXOffset());
		double y0 = (bar.getMinY()) - (getYOffset());
		double y1 = bar.getMinY();
		double y2 = (bar.getMaxY()) - (getYOffset());
		double y3 = bar.getMaxY();
		java.awt.geom.GeneralPath bar3dRight = null;
		java.awt.geom.GeneralPath bar3dTop = null;
		if (barLength > 0.0) {
			bar3dRight = new java.awt.geom.GeneralPath();
			bar3dRight.moveTo(((float) (x2)), ((float) (y3)));
			bar3dRight.lineTo(((float) (x2)), ((float) (y1)));
			bar3dRight.lineTo(((float) (x3)), ((float) (y0)));
			bar3dRight.lineTo(((float) (x3)), ((float) (y2)));
			bar3dRight.closePath();
			if (itemPaint instanceof java.awt.Color) {
				g2.setPaint(((java.awt.Color) (itemPaint)).darker());
			}
			g2.fill(bar3dRight);
		}
		bar3dTop = new java.awt.geom.GeneralPath();
		bar3dTop.moveTo(((float) (x0)), ((float) (y1)));
		bar3dTop.lineTo(((float) (x1)), ((float) (y0)));
		bar3dTop.lineTo(((float) (x3)), ((float) (y0)));
		bar3dTop.lineTo(((float) (x2)), ((float) (y1)));
		bar3dTop.closePath();
		g2.fill(bar3dTop);
		if ((isDrawBarOutline()) && ((state.getBarWidth()) > (org.jfree.chart.renderer.category.BarRenderer.BAR_OUTLINE_WIDTH_THRESHOLD))) {
			g2.setStroke(getItemOutlineStroke(row, column, selected));
			g2.setPaint(getItemOutlinePaint(row, column, selected));
			g2.draw(bar);
			if (bar3dRight != null) {
				g2.draw(bar3dRight);
			}
			if (bar3dTop != null) {
				g2.draw(bar3dTop);
			}
		}
		org.jfree.chart.labels.CategoryItemLabelGenerator generator = getItemLabelGenerator(row, column, selected);
		if ((generator != null) && (isItemLabelVisible(row, column, selected))) {
			drawItemLabelForBar(g2, plot, dataset, row, column, selected, generator, bar, (value < 0.0));
		}
		org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
		if (entities != null) {
			java.awt.geom.GeneralPath barOutline = new java.awt.geom.GeneralPath();
			barOutline.moveTo(((float) (x0)), ((float) (y3)));
			barOutline.lineTo(((float) (x0)), ((float) (y1)));
			barOutline.lineTo(((float) (x1)), ((float) (y0)));
			barOutline.lineTo(((float) (x3)), ((float) (y0)));
			barOutline.lineTo(((float) (x3)), ((float) (y2)));
			barOutline.lineTo(((float) (x2)), ((float) (y3)));
			barOutline.closePath();
			addEntity(entities, barOutline, dataset, row, column, selected);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.category.BarRenderer3D.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.category.BarRenderer3D)) {
			return false;
		}
		org.jfree.chart.renderer.category.BarRenderer3D that = ((org.jfree.chart.renderer.category.BarRenderer3D) (obj));
		if ((org.jfree.chart.renderer.category.BarRenderer3D.this.xOffset) != (that.xOffset)) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.BarRenderer3D.this.yOffset) != (that.yOffset)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.category.BarRenderer3D.this.wallPaint, that.wallPaint))) {
			return false;
		}
		return super.equals(obj);
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.category.BarRenderer3D.this.wallPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.category.BarRenderer3D.this.wallPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}


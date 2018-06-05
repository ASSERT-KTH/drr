

package org.jfree.chart.renderer.category;


public class LineRenderer3D extends org.jfree.chart.renderer.category.LineAndShapeRenderer implements java.io.Serializable , org.jfree.chart.Effect3D {
	private static final long serialVersionUID = 5467931468380928736L;

	public static final double DEFAULT_X_OFFSET = 12.0;

	public static final double DEFAULT_Y_OFFSET = 8.0;

	public static final java.awt.Paint DEFAULT_WALL_PAINT = new java.awt.Color(221, 221, 221);

	private double xOffset;

	private double yOffset;

	private transient java.awt.Paint wallPaint;

	public LineRenderer3D() {
		super(true, false);
		org.jfree.chart.renderer.category.LineRenderer3D.this.xOffset = org.jfree.chart.renderer.category.LineRenderer3D.DEFAULT_X_OFFSET;
		org.jfree.chart.renderer.category.LineRenderer3D.this.yOffset = org.jfree.chart.renderer.category.LineRenderer3D.DEFAULT_Y_OFFSET;
		org.jfree.chart.renderer.category.LineRenderer3D.this.wallPaint = org.jfree.chart.renderer.category.LineRenderer3D.DEFAULT_WALL_PAINT;
	}

	public double getXOffset() {
		return org.jfree.chart.renderer.category.LineRenderer3D.this.xOffset;
	}

	public double getYOffset() {
		return org.jfree.chart.renderer.category.LineRenderer3D.this.yOffset;
	}

	public void setXOffset(double xOffset) {
		org.jfree.chart.renderer.category.LineRenderer3D.this.xOffset = xOffset;
		fireChangeEvent();
	}

	public void setYOffset(double yOffset) {
		org.jfree.chart.renderer.category.LineRenderer3D.this.yOffset = yOffset;
		fireChangeEvent();
	}

	public java.awt.Paint getWallPaint() {
		return org.jfree.chart.renderer.category.LineRenderer3D.this.wallPaint;
	}

	public void setWallPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.renderer.category.LineRenderer3D.this.wallPaint = paint;
		fireChangeEvent();
	}

	public void drawBackground(java.awt.Graphics2D g2, org.jfree.chart.plot.CategoryPlot plot, java.awt.geom.Rectangle2D dataArea) {
		float x0 = ((float) (dataArea.getX()));
		float x1 = x0 + ((float) (java.lang.Math.abs(org.jfree.chart.renderer.category.LineRenderer3D.this.xOffset)));
		float x3 = ((float) (dataArea.getMaxX()));
		float x2 = x3 - ((float) (java.lang.Math.abs(org.jfree.chart.renderer.category.LineRenderer3D.this.xOffset)));
		float y0 = ((float) (dataArea.getMaxY()));
		float y1 = y0 - ((float) (java.lang.Math.abs(org.jfree.chart.renderer.category.LineRenderer3D.this.yOffset)));
		float y3 = ((float) (dataArea.getMinY()));
		float y2 = y3 + ((float) (java.lang.Math.abs(org.jfree.chart.renderer.category.LineRenderer3D.this.yOffset)));
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
		float x1 = x0 + ((float) (java.lang.Math.abs(org.jfree.chart.renderer.category.LineRenderer3D.this.xOffset)));
		float x3 = ((float) (dataArea.getMaxX()));
		float x2 = x3 - ((float) (java.lang.Math.abs(org.jfree.chart.renderer.category.LineRenderer3D.this.xOffset)));
		float y0 = ((float) (dataArea.getMaxY()));
		float y1 = y0 - ((float) (java.lang.Math.abs(org.jfree.chart.renderer.category.LineRenderer3D.this.yOffset)));
		float y3 = ((float) (dataArea.getMinY()));
		float y2 = y3 + ((float) (java.lang.Math.abs(org.jfree.chart.renderer.category.LineRenderer3D.this.yOffset)));
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
		
		g2.setPaint(plot.getDomainGridlinePaint());
		g2.setStroke(plot.getDomainGridlineStroke());
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
		
		g2.setPaint(plot.getRangeGridlinePaint());
		g2.setStroke(plot.getRangeGridlineStroke());
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
					path.lineTo((x + ((float) (org.jfree.chart.renderer.category.LineRenderer3D.this.xOffset))), (y - ((float) (org.jfree.chart.renderer.category.LineRenderer3D.this.yOffset))));
					path.lineTo(((float) ((adjusted.getMaxX()) + (org.jfree.chart.renderer.category.LineRenderer3D.this.xOffset))), (y - ((float) (org.jfree.chart.renderer.category.LineRenderer3D.this.yOffset))));
					path.lineTo(((float) (adjusted.getMaxX())), y);
					path.closePath();
				}
			
			g2.setPaint(marker.getPaint());
			g2.fill(path);
			g2.setPaint(marker.getOutlinePaint());
			g2.draw(path);
		}else {
			super.drawRangeMarker(g2, plot, axis, marker, adjusted);
		}
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, boolean selected, int pass) {
		if (!(getItemVisible(row, column))) {
			return ;
		}
		java.lang.Number v = dataset.getValue(row, column);
		if (v == null) {
			return ;
		}
		java.awt.geom.Rectangle2D adjusted = new java.awt.geom.Rectangle2D.Double(dataArea.getX(), ((dataArea.getY()) + (getYOffset())), ((dataArea.getWidth()) - (getXOffset())), ((dataArea.getHeight()) - (getYOffset())));
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		double x1 = domainAxis.getCategoryMiddle(column, getColumnCount(), adjusted, plot.getDomainAxisEdge());
		double value = v.doubleValue();
		double y1 = rangeAxis.valueToJava2D(value, adjusted, plot.getRangeAxisEdge());
		java.awt.Shape shape = getItemShape(row, column, selected);
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			shape = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape, y1, x1);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				shape = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape, x1, y1);
			}
		
		if (getItemLineVisible(row, column)) {
			if (column != 0) {
				java.lang.Number previousValue = dataset.getValue(row, (column - 1));
				if (previousValue != null) {
					double previous = previousValue.doubleValue();
					double x0 = domainAxis.getCategoryMiddle((column - 1), getColumnCount(), adjusted, plot.getDomainAxisEdge());
					double y0 = rangeAxis.valueToJava2D(previous, adjusted, plot.getRangeAxisEdge());
					double x2 = x0 + (getXOffset());
					double y2 = y0 - (getYOffset());
					double x3 = x1 + (getXOffset());
					double y3 = y1 - (getYOffset());
					java.awt.geom.GeneralPath clip = new java.awt.geom.GeneralPath();
					if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
						clip.moveTo(((float) (y0)), ((float) (x0)));
						clip.lineTo(((float) (y1)), ((float) (x1)));
						clip.lineTo(((float) (y3)), ((float) (x3)));
						clip.lineTo(((float) (y2)), ((float) (x2)));
						clip.lineTo(((float) (y0)), ((float) (x0)));
						clip.closePath();
					}else
						if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
							clip.moveTo(((float) (x0)), ((float) (y0)));
							clip.lineTo(((float) (x1)), ((float) (y1)));
							clip.lineTo(((float) (x3)), ((float) (y3)));
							clip.lineTo(((float) (x2)), ((float) (y2)));
							clip.lineTo(((float) (x0)), ((float) (y0)));
							clip.closePath();
						}
					
					g2.setPaint(getItemPaint(row, column, selected));
					g2.fill(clip);
					g2.setStroke(getItemOutlineStroke(row, column, selected));
					g2.setPaint(getItemOutlinePaint(row, column, selected));
					g2.draw(clip);
				}
			}
		}
		if (isItemLabelVisible(row, column, selected)) {
			drawItemLabel(g2, orientation, dataset, row, column, selected, x1, y1, (value < 0.0));
		}
		org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
		if (entities != null) {
			addEntity(entities, shape, dataset, row, column, selected);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.category.LineRenderer3D.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.category.LineRenderer3D)) {
			return false;
		}
		org.jfree.chart.renderer.category.LineRenderer3D that = ((org.jfree.chart.renderer.category.LineRenderer3D) (obj));
		if ((org.jfree.chart.renderer.category.LineRenderer3D.this.xOffset) != (that.xOffset)) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.LineRenderer3D.this.yOffset) != (that.yOffset)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.category.LineRenderer3D.this.wallPaint, that.wallPaint))) {
			return false;
		}
		return super.equals(obj);
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.category.LineRenderer3D.this.wallPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.category.LineRenderer3D.this.wallPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}


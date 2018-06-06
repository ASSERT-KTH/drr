

package org.jfree.chart.title;


public class PaintScaleLegend extends org.jfree.chart.title.Title implements org.jfree.chart.util.PublicCloneable {
	private org.jfree.chart.renderer.PaintScale scale;

	private org.jfree.chart.axis.ValueAxis axis;

	private org.jfree.chart.axis.AxisLocation axisLocation;

	private double axisOffset;

	private double stripWidth;

	private boolean stripOutlineVisible;

	private transient java.awt.Paint stripOutlinePaint;

	private transient java.awt.Stroke stripOutlineStroke;

	private transient java.awt.Paint backgroundPaint;

	public PaintScaleLegend(org.jfree.chart.renderer.PaintScale scale, org.jfree.chart.axis.ValueAxis axis) {
		if (axis == null) {
			throw new java.lang.IllegalArgumentException("Null 'axis' argument.");
		}
		org.jfree.chart.title.PaintScaleLegend.this.scale = scale;
		org.jfree.chart.title.PaintScaleLegend.this.axis = axis;
		org.jfree.chart.title.PaintScaleLegend.this.axisLocation = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_LEFT;
		org.jfree.chart.title.PaintScaleLegend.this.axisOffset = 0.0;
		org.jfree.chart.title.PaintScaleLegend.this.stripWidth = 15.0;
		org.jfree.chart.title.PaintScaleLegend.this.stripOutlineVisible = false;
		org.jfree.chart.title.PaintScaleLegend.this.stripOutlinePaint = java.awt.Color.gray;
		org.jfree.chart.title.PaintScaleLegend.this.stripOutlineStroke = new java.awt.BasicStroke(0.5F);
		org.jfree.chart.title.PaintScaleLegend.this.backgroundPaint = java.awt.Color.white;
	}

	public org.jfree.chart.renderer.PaintScale getScale() {
		return org.jfree.chart.title.PaintScaleLegend.this.scale;
	}

	public void setScale(org.jfree.chart.renderer.PaintScale scale) {
		if (scale == null) {
			throw new java.lang.IllegalArgumentException("Null 'scale' argument.");
		}
		org.jfree.chart.title.PaintScaleLegend.this.scale = scale;
		notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.PaintScaleLegend.this));
	}

	public org.jfree.chart.axis.ValueAxis getAxis() {
		return org.jfree.chart.title.PaintScaleLegend.this.axis;
	}

	public void setAxis(org.jfree.chart.axis.ValueAxis axis) {
		if (axis == null) {
			throw new java.lang.IllegalArgumentException("Null 'axis' argument.");
		}
		org.jfree.chart.title.PaintScaleLegend.this.axis = axis;
		notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.PaintScaleLegend.this));
	}

	public org.jfree.chart.axis.AxisLocation getAxisLocation() {
		return org.jfree.chart.title.PaintScaleLegend.this.axisLocation;
	}

	public void setAxisLocation(org.jfree.chart.axis.AxisLocation location) {
		if (location == null) {
			throw new java.lang.IllegalArgumentException("Null 'location' argument.");
		}
		org.jfree.chart.title.PaintScaleLegend.this.axisLocation = location;
		notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.PaintScaleLegend.this));
	}

	public double getAxisOffset() {
		return org.jfree.chart.title.PaintScaleLegend.this.axisOffset;
	}

	public void setAxisOffset(double offset) {
		org.jfree.chart.title.PaintScaleLegend.this.axisOffset = offset;
		notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.PaintScaleLegend.this));
	}

	public double getStripWidth() {
		return org.jfree.chart.title.PaintScaleLegend.this.stripWidth;
	}

	public void setStripWidth(double width) {
		org.jfree.chart.title.PaintScaleLegend.this.stripWidth = width;
		notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.PaintScaleLegend.this));
	}

	public boolean isStripOutlineVisible() {
		return org.jfree.chart.title.PaintScaleLegend.this.stripOutlineVisible;
	}

	public void setStripOutlineVisible(boolean visible) {
		org.jfree.chart.title.PaintScaleLegend.this.stripOutlineVisible = visible;
		notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.PaintScaleLegend.this));
	}

	public java.awt.Paint getStripOutlinePaint() {
		return org.jfree.chart.title.PaintScaleLegend.this.stripOutlinePaint;
	}

	public void setStripOutlinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.title.PaintScaleLegend.this.stripOutlinePaint = paint;
		notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.PaintScaleLegend.this));
	}

	public java.awt.Stroke getStripOutlineStroke() {
		return org.jfree.chart.title.PaintScaleLegend.this.stripOutlineStroke;
	}

	public void setStripOutlineStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.title.PaintScaleLegend.this.stripOutlineStroke = stroke;
		notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.PaintScaleLegend.this));
	}

	public java.awt.Paint getBackgroundPaint() {
		return org.jfree.chart.title.PaintScaleLegend.this.backgroundPaint;
	}

	public void setBackgroundPaint(java.awt.Paint paint) {
		org.jfree.chart.title.PaintScaleLegend.this.backgroundPaint = paint;
		notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.PaintScaleLegend.this));
	}

	public org.jfree.chart.util.Size2D arrange(java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		org.jfree.chart.block.RectangleConstraint cc = toContentConstraint(constraint);
		org.jfree.chart.block.LengthConstraintType w = cc.getWidthConstraintType();
		org.jfree.chart.block.LengthConstraintType h = cc.getHeightConstraintType();
		org.jfree.chart.util.Size2D contentSize = null;
		if (w == (org.jfree.chart.block.LengthConstraintType.NONE)) {
			if (h == (org.jfree.chart.block.LengthConstraintType.NONE)) {
				contentSize = new org.jfree.chart.util.Size2D(getWidth(), getHeight());
			}else
				if (h == (org.jfree.chart.block.LengthConstraintType.RANGE)) {
					throw new java.lang.RuntimeException("Not yet implemented.");
				}else
					if (h == (org.jfree.chart.block.LengthConstraintType.FIXED)) {
						throw new java.lang.RuntimeException("Not yet implemented.");
					}
				
			
		}else
			if (w == (org.jfree.chart.block.LengthConstraintType.RANGE)) {
				if (h == (org.jfree.chart.block.LengthConstraintType.NONE)) {
					throw new java.lang.RuntimeException("Not yet implemented.");
				}else
					if (h == (org.jfree.chart.block.LengthConstraintType.RANGE)) {
						contentSize = arrangeRR(g2, cc.getWidthRange(), cc.getHeightRange());
					}else
						if (h == (org.jfree.chart.block.LengthConstraintType.FIXED)) {
							throw new java.lang.RuntimeException("Not yet implemented.");
						}
					
				
			}else
				if (w == (org.jfree.chart.block.LengthConstraintType.FIXED)) {
					if (h == (org.jfree.chart.block.LengthConstraintType.NONE)) {
						throw new java.lang.RuntimeException("Not yet implemented.");
					}else
						if (h == (org.jfree.chart.block.LengthConstraintType.RANGE)) {
							throw new java.lang.RuntimeException("Not yet implemented.");
						}else
							if (h == (org.jfree.chart.block.LengthConstraintType.FIXED)) {
								throw new java.lang.RuntimeException("Not yet implemented.");
							}
						
					
				}
			
		
		return new org.jfree.chart.util.Size2D(calculateTotalWidth(contentSize.getWidth()), calculateTotalHeight(contentSize.getHeight()));
	}

	protected org.jfree.chart.util.Size2D arrangeRR(java.awt.Graphics2D g2, org.jfree.data.Range widthRange, org.jfree.data.Range heightRange) {
		org.jfree.chart.util.RectangleEdge position = getPosition();
		if ((position == (org.jfree.chart.util.RectangleEdge.TOP)) || (position == (org.jfree.chart.util.RectangleEdge.BOTTOM))) {
			float maxWidth = ((float) (widthRange.getUpperBound()));
			org.jfree.chart.axis.AxisSpace space = org.jfree.chart.title.PaintScaleLegend.this.axis.reserveSpace(g2, null, new java.awt.geom.Rectangle2D.Double(0, 0, maxWidth, 100), org.jfree.chart.util.RectangleEdge.BOTTOM, null);
			return new org.jfree.chart.util.Size2D(maxWidth, ((((org.jfree.chart.title.PaintScaleLegend.this.stripWidth) + (org.jfree.chart.title.PaintScaleLegend.this.axisOffset)) + (space.getTop())) + (space.getBottom())));
		}else
			if ((position == (org.jfree.chart.util.RectangleEdge.LEFT)) || (position == (org.jfree.chart.util.RectangleEdge.RIGHT))) {
				float maxHeight = ((float) (heightRange.getUpperBound()));
				org.jfree.chart.axis.AxisSpace space = org.jfree.chart.title.PaintScaleLegend.this.axis.reserveSpace(g2, null, new java.awt.geom.Rectangle2D.Double(0, 0, 100, maxHeight), org.jfree.chart.util.RectangleEdge.RIGHT, null);
				return new org.jfree.chart.util.Size2D(((((org.jfree.chart.title.PaintScaleLegend.this.stripWidth) + (org.jfree.chart.title.PaintScaleLegend.this.axisOffset)) + (space.getLeft())) + (space.getRight())), maxHeight);
			}else {
				throw new java.lang.RuntimeException("Unrecognised position.");
			}
		
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		draw(g2, area, null);
	}

	private static final int SUBDIVISIONS = 200;

	public java.lang.Object draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.lang.Object params) {
		java.awt.geom.Rectangle2D target = ((java.awt.geom.Rectangle2D) (area.clone()));
		target = trimMargin(target);
		if ((org.jfree.chart.title.PaintScaleLegend.this.backgroundPaint) != null) {
			g2.setPaint(org.jfree.chart.title.PaintScaleLegend.this.backgroundPaint);
			g2.fill(target);
		}
		getFrame().draw(g2, target);
		getFrame().getInsets().trim(target);
		target = trimPadding(target);
		double base = org.jfree.chart.title.PaintScaleLegend.this.axis.getLowerBound();
		double increment = (org.jfree.chart.title.PaintScaleLegend.this.axis.getRange().getLength()) / (org.jfree.chart.title.PaintScaleLegend.SUBDIVISIONS);
		java.awt.geom.Rectangle2D r = new java.awt.geom.Rectangle2D.Double();
		if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(getPosition())) {
			org.jfree.chart.util.RectangleEdge axisEdge = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(org.jfree.chart.title.PaintScaleLegend.this.axisLocation, org.jfree.chart.plot.PlotOrientation.HORIZONTAL);
			double ww = java.lang.Math.ceil(((target.getWidth()) / (org.jfree.chart.title.PaintScaleLegend.SUBDIVISIONS)));
			if (axisEdge == (org.jfree.chart.util.RectangleEdge.TOP)) {
				for (int i = 0; i < (org.jfree.chart.title.PaintScaleLegend.SUBDIVISIONS); i++) {
					double v = base + (i * increment);
					java.awt.Paint p = org.jfree.chart.title.PaintScaleLegend.this.scale.getPaint(v);
					double vv = org.jfree.chart.title.PaintScaleLegend.this.axis.valueToJava2D(v, target, org.jfree.chart.util.RectangleEdge.BOTTOM);
					r.setRect(vv, ((target.getMaxY()) - (org.jfree.chart.title.PaintScaleLegend.this.stripWidth)), ww, org.jfree.chart.title.PaintScaleLegend.this.stripWidth);
					g2.setPaint(p);
					g2.fill(r);
				}
				g2.setPaint(org.jfree.chart.title.PaintScaleLegend.this.stripOutlinePaint);
				g2.setStroke(org.jfree.chart.title.PaintScaleLegend.this.stripOutlineStroke);
				g2.draw(new java.awt.geom.Rectangle2D.Double(target.getMinX(), ((target.getMaxY()) - (org.jfree.chart.title.PaintScaleLegend.this.stripWidth)), target.getWidth(), org.jfree.chart.title.PaintScaleLegend.this.stripWidth));
				org.jfree.chart.title.PaintScaleLegend.this.axis.draw(g2, (((target.getMaxY()) - (org.jfree.chart.title.PaintScaleLegend.this.stripWidth)) - (org.jfree.chart.title.PaintScaleLegend.this.axisOffset)), target, target, org.jfree.chart.util.RectangleEdge.TOP, null);
			}else
				if (axisEdge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
					for (int i = 0; i < (org.jfree.chart.title.PaintScaleLegend.SUBDIVISIONS); i++) {
						double v = base + (i * increment);
						java.awt.Paint p = org.jfree.chart.title.PaintScaleLegend.this.scale.getPaint(v);
						double vv = org.jfree.chart.title.PaintScaleLegend.this.axis.valueToJava2D(v, target, org.jfree.chart.util.RectangleEdge.BOTTOM);
						r.setRect(vv, target.getMinY(), ww, org.jfree.chart.title.PaintScaleLegend.this.stripWidth);
						g2.setPaint(p);
						g2.fill(r);
					}
					g2.setPaint(org.jfree.chart.title.PaintScaleLegend.this.stripOutlinePaint);
					g2.setStroke(org.jfree.chart.title.PaintScaleLegend.this.stripOutlineStroke);
					g2.draw(new java.awt.geom.Rectangle2D.Double(target.getMinX(), target.getMinY(), target.getWidth(), org.jfree.chart.title.PaintScaleLegend.this.stripWidth));
					org.jfree.chart.title.PaintScaleLegend.this.axis.draw(g2, (((target.getMinY()) + (org.jfree.chart.title.PaintScaleLegend.this.stripWidth)) + (org.jfree.chart.title.PaintScaleLegend.this.axisOffset)), target, target, org.jfree.chart.util.RectangleEdge.BOTTOM, null);
				}
			
		}else {
			org.jfree.chart.util.RectangleEdge axisEdge = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(org.jfree.chart.title.PaintScaleLegend.this.axisLocation, org.jfree.chart.plot.PlotOrientation.VERTICAL);
			double hh = java.lang.Math.ceil(((target.getHeight()) / (org.jfree.chart.title.PaintScaleLegend.SUBDIVISIONS)));
			if (axisEdge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
				for (int i = 0; i < (org.jfree.chart.title.PaintScaleLegend.SUBDIVISIONS); i++) {
					double v = base + (i * increment);
					java.awt.Paint p = org.jfree.chart.title.PaintScaleLegend.this.scale.getPaint(v);
					double vv = org.jfree.chart.title.PaintScaleLegend.this.axis.valueToJava2D(v, target, org.jfree.chart.util.RectangleEdge.LEFT);
					r.setRect(((target.getMaxX()) - (org.jfree.chart.title.PaintScaleLegend.this.stripWidth)), (vv - hh), org.jfree.chart.title.PaintScaleLegend.this.stripWidth, hh);
					g2.setPaint(p);
					g2.fill(r);
				}
				g2.setPaint(org.jfree.chart.title.PaintScaleLegend.this.stripOutlinePaint);
				g2.setStroke(org.jfree.chart.title.PaintScaleLegend.this.stripOutlineStroke);
				g2.draw(new java.awt.geom.Rectangle2D.Double(((target.getMaxX()) - (org.jfree.chart.title.PaintScaleLegend.this.stripWidth)), target.getMinY(), org.jfree.chart.title.PaintScaleLegend.this.stripWidth, target.getHeight()));
				org.jfree.chart.title.PaintScaleLegend.this.axis.draw(g2, (((target.getMaxX()) - (org.jfree.chart.title.PaintScaleLegend.this.stripWidth)) - (org.jfree.chart.title.PaintScaleLegend.this.axisOffset)), target, target, org.jfree.chart.util.RectangleEdge.LEFT, null);
			}else
				if (axisEdge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
					for (int i = 0; i < (org.jfree.chart.title.PaintScaleLegend.SUBDIVISIONS); i++) {
						double v = base + (i * increment);
						java.awt.Paint p = org.jfree.chart.title.PaintScaleLegend.this.scale.getPaint(v);
						double vv = org.jfree.chart.title.PaintScaleLegend.this.axis.valueToJava2D(v, target, org.jfree.chart.util.RectangleEdge.LEFT);
						r.setRect(target.getMinX(), (vv - hh), org.jfree.chart.title.PaintScaleLegend.this.stripWidth, hh);
						g2.setPaint(p);
						g2.fill(r);
					}
					g2.setPaint(org.jfree.chart.title.PaintScaleLegend.this.stripOutlinePaint);
					g2.setStroke(org.jfree.chart.title.PaintScaleLegend.this.stripOutlineStroke);
					g2.draw(new java.awt.geom.Rectangle2D.Double(target.getMinX(), target.getMinY(), org.jfree.chart.title.PaintScaleLegend.this.stripWidth, target.getHeight()));
					org.jfree.chart.title.PaintScaleLegend.this.axis.draw(g2, (((target.getMinX()) + (org.jfree.chart.title.PaintScaleLegend.this.stripWidth)) + (org.jfree.chart.title.PaintScaleLegend.this.axisOffset)), target, target, org.jfree.chart.util.RectangleEdge.RIGHT, null);
				}
			
		}
		return null;
	}

	public boolean equals(java.lang.Object obj) {
		if (!(obj instanceof org.jfree.chart.title.PaintScaleLegend)) {
			return false;
		}
		org.jfree.chart.title.PaintScaleLegend that = ((org.jfree.chart.title.PaintScaleLegend) (obj));
		if (!(org.jfree.chart.title.PaintScaleLegend.this.scale.equals(that.scale))) {
			return false;
		}
		if (!(org.jfree.chart.title.PaintScaleLegend.this.axis.equals(that.axis))) {
			return false;
		}
		if (!(org.jfree.chart.title.PaintScaleLegend.this.axisLocation.equals(that.axisLocation))) {
			return false;
		}
		if ((org.jfree.chart.title.PaintScaleLegend.this.axisOffset) != (that.axisOffset)) {
			return false;
		}
		if ((org.jfree.chart.title.PaintScaleLegend.this.stripWidth) != (that.stripWidth)) {
			return false;
		}
		if ((org.jfree.chart.title.PaintScaleLegend.this.stripOutlineVisible) != (that.stripOutlineVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.title.PaintScaleLegend.this.stripOutlinePaint, that.stripOutlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.title.PaintScaleLegend.this.stripOutlineStroke.equals(that.stripOutlineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.title.PaintScaleLegend.this.backgroundPaint, that.backgroundPaint))) {
			return false;
		}
		return super.equals(obj);
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.title.PaintScaleLegend.this.backgroundPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.title.PaintScaleLegend.this.stripOutlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.title.PaintScaleLegend.this.stripOutlineStroke, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.title.PaintScaleLegend.this.backgroundPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.title.PaintScaleLegend.this.stripOutlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.title.PaintScaleLegend.this.stripOutlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
	}
}


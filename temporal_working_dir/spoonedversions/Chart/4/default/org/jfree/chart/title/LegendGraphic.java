

package org.jfree.chart.title;


public class LegendGraphic extends org.jfree.chart.block.AbstractBlock implements org.jfree.chart.block.Block , org.jfree.chart.util.PublicCloneable {
	static final long serialVersionUID = -1338791523854985009L;

	private boolean shapeVisible;

	private transient java.awt.Shape shape;

	private org.jfree.chart.util.RectangleAnchor shapeLocation;

	private org.jfree.chart.util.RectangleAnchor shapeAnchor;

	private boolean shapeFilled;

	private transient java.awt.Paint fillPaint;

	private org.jfree.chart.util.GradientPaintTransformer fillPaintTransformer;

	private boolean shapeOutlineVisible;

	private transient java.awt.Paint outlinePaint;

	private transient java.awt.Stroke outlineStroke;

	private boolean lineVisible;

	private transient java.awt.Shape line;

	private transient java.awt.Stroke lineStroke;

	private transient java.awt.Paint linePaint;

	public LegendGraphic(java.awt.Shape shape, java.awt.Paint fillPaint) {
		if (shape == null) {
			throw new java.lang.IllegalArgumentException("Null 'shape' argument.");
		}
		if (fillPaint == null) {
			throw new java.lang.IllegalArgumentException("Null 'fillPaint' argument.");
		}
		org.jfree.chart.title.LegendGraphic.this.shapeVisible = true;
		org.jfree.chart.title.LegendGraphic.this.shape = shape;
		org.jfree.chart.title.LegendGraphic.this.shapeAnchor = org.jfree.chart.util.RectangleAnchor.CENTER;
		org.jfree.chart.title.LegendGraphic.this.shapeLocation = org.jfree.chart.util.RectangleAnchor.CENTER;
		org.jfree.chart.title.LegendGraphic.this.shapeFilled = true;
		org.jfree.chart.title.LegendGraphic.this.fillPaint = fillPaint;
		org.jfree.chart.title.LegendGraphic.this.fillPaintTransformer = new org.jfree.chart.util.StandardGradientPaintTransformer();
		setPadding(2.0, 2.0, 2.0, 2.0);
	}

	public boolean isShapeVisible() {
		return org.jfree.chart.title.LegendGraphic.this.shapeVisible;
	}

	public void setShapeVisible(boolean visible) {
		org.jfree.chart.title.LegendGraphic.this.shapeVisible = visible;
	}

	public java.awt.Shape getShape() {
		return org.jfree.chart.title.LegendGraphic.this.shape;
	}

	public void setShape(java.awt.Shape shape) {
		org.jfree.chart.title.LegendGraphic.this.shape = shape;
	}

	public boolean isShapeFilled() {
		return org.jfree.chart.title.LegendGraphic.this.shapeFilled;
	}

	public void setShapeFilled(boolean filled) {
		org.jfree.chart.title.LegendGraphic.this.shapeFilled = filled;
	}

	public java.awt.Paint getFillPaint() {
		return org.jfree.chart.title.LegendGraphic.this.fillPaint;
	}

	public void setFillPaint(java.awt.Paint paint) {
		org.jfree.chart.title.LegendGraphic.this.fillPaint = paint;
	}

	public org.jfree.chart.util.GradientPaintTransformer getFillPaintTransformer() {
		return org.jfree.chart.title.LegendGraphic.this.fillPaintTransformer;
	}

	public void setFillPaintTransformer(org.jfree.chart.util.GradientPaintTransformer transformer) {
		if (transformer == null) {
			throw new java.lang.IllegalArgumentException("Null 'transformer' argument.");
		}
		org.jfree.chart.title.LegendGraphic.this.fillPaintTransformer = transformer;
	}

	public boolean isShapeOutlineVisible() {
		return org.jfree.chart.title.LegendGraphic.this.shapeOutlineVisible;
	}

	public void setShapeOutlineVisible(boolean visible) {
		org.jfree.chart.title.LegendGraphic.this.shapeOutlineVisible = visible;
	}

	public java.awt.Paint getOutlinePaint() {
		return org.jfree.chart.title.LegendGraphic.this.outlinePaint;
	}

	public void setOutlinePaint(java.awt.Paint paint) {
		org.jfree.chart.title.LegendGraphic.this.outlinePaint = paint;
	}

	public java.awt.Stroke getOutlineStroke() {
		return org.jfree.chart.title.LegendGraphic.this.outlineStroke;
	}

	public void setOutlineStroke(java.awt.Stroke stroke) {
		org.jfree.chart.title.LegendGraphic.this.outlineStroke = stroke;
	}

	public org.jfree.chart.util.RectangleAnchor getShapeAnchor() {
		return org.jfree.chart.title.LegendGraphic.this.shapeAnchor;
	}

	public void setShapeAnchor(org.jfree.chart.util.RectangleAnchor anchor) {
		if (anchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'anchor' argument.");
		}
		org.jfree.chart.title.LegendGraphic.this.shapeAnchor = anchor;
	}

	public org.jfree.chart.util.RectangleAnchor getShapeLocation() {
		return org.jfree.chart.title.LegendGraphic.this.shapeLocation;
	}

	public void setShapeLocation(org.jfree.chart.util.RectangleAnchor location) {
		if (location == null) {
			throw new java.lang.IllegalArgumentException("Null 'location' argument.");
		}
		org.jfree.chart.title.LegendGraphic.this.shapeLocation = location;
	}

	public boolean isLineVisible() {
		return org.jfree.chart.title.LegendGraphic.this.lineVisible;
	}

	public void setLineVisible(boolean visible) {
		org.jfree.chart.title.LegendGraphic.this.lineVisible = visible;
	}

	public java.awt.Shape getLine() {
		return org.jfree.chart.title.LegendGraphic.this.line;
	}

	public void setLine(java.awt.Shape line) {
		org.jfree.chart.title.LegendGraphic.this.line = line;
	}

	public java.awt.Paint getLinePaint() {
		return org.jfree.chart.title.LegendGraphic.this.linePaint;
	}

	public void setLinePaint(java.awt.Paint paint) {
		org.jfree.chart.title.LegendGraphic.this.linePaint = paint;
	}

	public java.awt.Stroke getLineStroke() {
		return org.jfree.chart.title.LegendGraphic.this.lineStroke;
	}

	public void setLineStroke(java.awt.Stroke stroke) {
		org.jfree.chart.title.LegendGraphic.this.lineStroke = stroke;
	}

	public org.jfree.chart.util.Size2D arrange(java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		org.jfree.chart.block.RectangleConstraint contentConstraint = toContentConstraint(constraint);
		org.jfree.chart.block.LengthConstraintType w = contentConstraint.getWidthConstraintType();
		org.jfree.chart.block.LengthConstraintType h = contentConstraint.getHeightConstraintType();
		org.jfree.chart.util.Size2D contentSize = null;
		if (w == (org.jfree.chart.block.LengthConstraintType.NONE)) {
			if (h == (org.jfree.chart.block.LengthConstraintType.NONE)) {
				contentSize = arrangeNN(g2);
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
						throw new java.lang.RuntimeException("Not yet implemented.");
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
								contentSize = new org.jfree.chart.util.Size2D(contentConstraint.getWidth(), contentConstraint.getHeight());
							}
						
					
				}
			
		
		return new org.jfree.chart.util.Size2D(calculateTotalWidth(contentSize.getWidth()), calculateTotalHeight(contentSize.getHeight()));
	}

	protected org.jfree.chart.util.Size2D arrangeNN(java.awt.Graphics2D g2) {
		java.awt.geom.Rectangle2D contentSize = new java.awt.geom.Rectangle2D.Double();
		if ((org.jfree.chart.title.LegendGraphic.this.line) != null) {
			contentSize.setRect(org.jfree.chart.title.LegendGraphic.this.line.getBounds2D());
		}
		if ((org.jfree.chart.title.LegendGraphic.this.shape) != null) {
			contentSize = contentSize.createUnion(org.jfree.chart.title.LegendGraphic.this.shape.getBounds2D());
		}
		return new org.jfree.chart.util.Size2D(contentSize.getWidth(), contentSize.getHeight());
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		area = trimMargin(area);
		drawBorder(g2, area);
		area = trimBorder(area);
		area = trimPadding(area);
		if (org.jfree.chart.title.LegendGraphic.this.lineVisible) {
			java.awt.geom.Point2D location = org.jfree.chart.util.RectangleAnchor.coordinates(area, org.jfree.chart.title.LegendGraphic.this.shapeLocation);
			java.awt.Shape aLine = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(getLine(), org.jfree.chart.title.LegendGraphic.this.shapeAnchor, location.getX(), location.getY());
			g2.setPaint(org.jfree.chart.title.LegendGraphic.this.linePaint);
			g2.setStroke(org.jfree.chart.title.LegendGraphic.this.lineStroke);
			g2.draw(aLine);
		}
		if (org.jfree.chart.title.LegendGraphic.this.shapeVisible) {
			java.awt.geom.Point2D location = org.jfree.chart.util.RectangleAnchor.coordinates(area, org.jfree.chart.title.LegendGraphic.this.shapeLocation);
			java.awt.Shape s = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(org.jfree.chart.title.LegendGraphic.this.shape, org.jfree.chart.title.LegendGraphic.this.shapeAnchor, location.getX(), location.getY());
			if (org.jfree.chart.title.LegendGraphic.this.shapeFilled) {
				java.awt.Paint p = org.jfree.chart.title.LegendGraphic.this.fillPaint;
				if (p instanceof java.awt.GradientPaint) {
					java.awt.GradientPaint gp = ((java.awt.GradientPaint) (org.jfree.chart.title.LegendGraphic.this.fillPaint));
					p = org.jfree.chart.title.LegendGraphic.this.fillPaintTransformer.transform(gp, s);
				}
				g2.setPaint(p);
				g2.fill(s);
			}
			if (org.jfree.chart.title.LegendGraphic.this.shapeOutlineVisible) {
				g2.setPaint(org.jfree.chart.title.LegendGraphic.this.outlinePaint);
				g2.setStroke(org.jfree.chart.title.LegendGraphic.this.outlineStroke);
				g2.draw(s);
			}
		}
	}

	public java.lang.Object draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.lang.Object params) {
		draw(g2, area);
		return null;
	}

	public boolean equals(java.lang.Object obj) {
		if (!(obj instanceof org.jfree.chart.title.LegendGraphic)) {
			return false;
		}
		org.jfree.chart.title.LegendGraphic that = ((org.jfree.chart.title.LegendGraphic) (obj));
		if ((org.jfree.chart.title.LegendGraphic.this.shapeVisible) != (that.shapeVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.ShapeUtilities.equal(org.jfree.chart.title.LegendGraphic.this.shape, that.shape))) {
			return false;
		}
		if ((org.jfree.chart.title.LegendGraphic.this.shapeFilled) != (that.shapeFilled)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.title.LegendGraphic.this.fillPaint, that.fillPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.title.LegendGraphic.this.fillPaintTransformer, that.fillPaintTransformer))) {
			return false;
		}
		if ((org.jfree.chart.title.LegendGraphic.this.shapeOutlineVisible) != (that.shapeOutlineVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.title.LegendGraphic.this.outlinePaint, that.outlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.title.LegendGraphic.this.outlineStroke, that.outlineStroke))) {
			return false;
		}
		if ((org.jfree.chart.title.LegendGraphic.this.shapeAnchor) != (that.shapeAnchor)) {
			return false;
		}
		if ((org.jfree.chart.title.LegendGraphic.this.shapeLocation) != (that.shapeLocation)) {
			return false;
		}
		if ((org.jfree.chart.title.LegendGraphic.this.lineVisible) != (that.lineVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.ShapeUtilities.equal(org.jfree.chart.title.LegendGraphic.this.line, that.line))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.title.LegendGraphic.this.linePaint, that.linePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.title.LegendGraphic.this.lineStroke, that.lineStroke))) {
			return false;
		}
		return super.equals(obj);
	}

	public int hashCode() {
		int result = 193;
		result = (37 * result) + (org.jfree.chart.util.ObjectUtilities.hashCode(org.jfree.chart.title.LegendGraphic.this.fillPaint));
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.title.LegendGraphic clone = ((org.jfree.chart.title.LegendGraphic) (super.clone()));
		clone.shape = org.jfree.chart.util.ShapeUtilities.clone(org.jfree.chart.title.LegendGraphic.this.shape);
		clone.line = org.jfree.chart.util.ShapeUtilities.clone(org.jfree.chart.title.LegendGraphic.this.line);
		return clone;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.title.LegendGraphic.this.shape, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.title.LegendGraphic.this.fillPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.title.LegendGraphic.this.outlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.title.LegendGraphic.this.outlineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.title.LegendGraphic.this.line, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.title.LegendGraphic.this.linePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.title.LegendGraphic.this.lineStroke, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.title.LegendGraphic.this.shape = org.jfree.chart.util.SerialUtilities.readShape(stream);
		org.jfree.chart.title.LegendGraphic.this.fillPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.title.LegendGraphic.this.outlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.title.LegendGraphic.this.outlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.title.LegendGraphic.this.line = org.jfree.chart.util.SerialUtilities.readShape(stream);
		org.jfree.chart.title.LegendGraphic.this.linePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.title.LegendGraphic.this.lineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
	}
}


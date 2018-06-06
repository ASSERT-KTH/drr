

package org.jfree.chart.title;


public class TextTitle extends org.jfree.chart.title.Title implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 8372008692127477443L;

	public static final java.awt.Font DEFAULT_FONT = new java.awt.Font("SansSerif", java.awt.Font.BOLD, 12);

	public static final java.awt.Paint DEFAULT_TEXT_PAINT = java.awt.Color.black;

	private java.lang.String text;

	private java.awt.Font font;

	private org.jfree.chart.util.HorizontalAlignment textAlignment;

	private transient java.awt.Paint paint;

	private transient java.awt.Paint backgroundPaint;

	private java.lang.String toolTipText;

	private java.lang.String urlText;

	private org.jfree.chart.text.TextBlock content;

	private boolean expandToFitSpace = false;

	public TextTitle() {
		this("");
	}

	public TextTitle(java.lang.String text) {
		this(text, org.jfree.chart.title.TextTitle.DEFAULT_FONT, org.jfree.chart.title.TextTitle.DEFAULT_TEXT_PAINT, org.jfree.chart.title.Title.DEFAULT_POSITION, org.jfree.chart.title.Title.DEFAULT_HORIZONTAL_ALIGNMENT, org.jfree.chart.title.Title.DEFAULT_VERTICAL_ALIGNMENT, org.jfree.chart.title.Title.DEFAULT_PADDING);
	}

	public TextTitle(java.lang.String text, java.awt.Font font) {
		this(text, font, org.jfree.chart.title.TextTitle.DEFAULT_TEXT_PAINT, org.jfree.chart.title.Title.DEFAULT_POSITION, org.jfree.chart.title.Title.DEFAULT_HORIZONTAL_ALIGNMENT, org.jfree.chart.title.Title.DEFAULT_VERTICAL_ALIGNMENT, org.jfree.chart.title.Title.DEFAULT_PADDING);
	}

	public TextTitle(java.lang.String text, java.awt.Font font, java.awt.Paint paint, org.jfree.chart.util.RectangleEdge position, org.jfree.chart.util.HorizontalAlignment horizontalAlignment, org.jfree.chart.util.VerticalAlignment verticalAlignment, org.jfree.chart.util.RectangleInsets padding) {
		super(position, horizontalAlignment, verticalAlignment, padding);
		if (text == null) {
			throw new java.lang.NullPointerException("Null 'text' argument.");
		}
		if (font == null) {
			throw new java.lang.NullPointerException("Null 'font' argument.");
		}
		if (paint == null) {
			throw new java.lang.NullPointerException("Null 'paint' argument.");
		}
		org.jfree.chart.title.TextTitle.this.text = text;
		org.jfree.chart.title.TextTitle.this.font = font;
		org.jfree.chart.title.TextTitle.this.paint = paint;
		org.jfree.chart.title.TextTitle.this.textAlignment = horizontalAlignment;
		org.jfree.chart.title.TextTitle.this.backgroundPaint = null;
		org.jfree.chart.title.TextTitle.this.content = null;
		org.jfree.chart.title.TextTitle.this.toolTipText = null;
		org.jfree.chart.title.TextTitle.this.urlText = null;
	}

	public java.lang.String getText() {
		return org.jfree.chart.title.TextTitle.this.text;
	}

	public void setText(java.lang.String text) {
		if (text == null) {
			throw new java.lang.IllegalArgumentException("Null 'text' argument.");
		}
		if (!(org.jfree.chart.title.TextTitle.this.text.equals(text))) {
			org.jfree.chart.title.TextTitle.this.text = text;
			notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.TextTitle.this));
		}
	}

	public org.jfree.chart.util.HorizontalAlignment getTextAlignment() {
		return org.jfree.chart.title.TextTitle.this.textAlignment;
	}

	public void setTextAlignment(org.jfree.chart.util.HorizontalAlignment alignment) {
		if (alignment == null) {
			throw new java.lang.IllegalArgumentException("Null 'alignment' argument.");
		}
		org.jfree.chart.title.TextTitle.this.textAlignment = alignment;
		notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.TextTitle.this));
	}

	public java.awt.Font getFont() {
		return org.jfree.chart.title.TextTitle.this.font;
	}

	public void setFont(java.awt.Font font) {
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		if (!(org.jfree.chart.title.TextTitle.this.font.equals(font))) {
			org.jfree.chart.title.TextTitle.this.font = font;
			notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.TextTitle.this));
		}
	}

	public java.awt.Paint getPaint() {
		return org.jfree.chart.title.TextTitle.this.paint;
	}

	public void setPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		if (!(org.jfree.chart.title.TextTitle.this.paint.equals(paint))) {
			org.jfree.chart.title.TextTitle.this.paint = paint;
			notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.TextTitle.this));
		}
	}

	public java.awt.Paint getBackgroundPaint() {
		return org.jfree.chart.title.TextTitle.this.backgroundPaint;
	}

	public void setBackgroundPaint(java.awt.Paint paint) {
		org.jfree.chart.title.TextTitle.this.backgroundPaint = paint;
		notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.TextTitle.this));
	}

	public java.lang.String getToolTipText() {
		return org.jfree.chart.title.TextTitle.this.toolTipText;
	}

	public void setToolTipText(java.lang.String text) {
		org.jfree.chart.title.TextTitle.this.toolTipText = text;
		notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.TextTitle.this));
	}

	public java.lang.String getURLText() {
		return org.jfree.chart.title.TextTitle.this.urlText;
	}

	public void setURLText(java.lang.String text) {
		org.jfree.chart.title.TextTitle.this.urlText = text;
		notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.TextTitle.this));
	}

	public boolean getExpandToFitSpace() {
		return org.jfree.chart.title.TextTitle.this.expandToFitSpace;
	}

	public void setExpandToFitSpace(boolean expand) {
		org.jfree.chart.title.TextTitle.this.expandToFitSpace = expand;
		notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.TextTitle.this));
	}

	public org.jfree.chart.util.Size2D arrange(java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		org.jfree.chart.block.RectangleConstraint cc = toContentConstraint(constraint);
		org.jfree.chart.block.LengthConstraintType w = cc.getWidthConstraintType();
		org.jfree.chart.block.LengthConstraintType h = cc.getHeightConstraintType();
		org.jfree.chart.util.Size2D contentSize = null;
		if (w == (org.jfree.chart.block.LengthConstraintType.NONE)) {
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
			g2.setFont(org.jfree.chart.title.TextTitle.this.font);
			org.jfree.chart.title.TextTitle.this.content = org.jfree.chart.text.TextUtilities.createTextBlock(org.jfree.chart.title.TextTitle.this.text, org.jfree.chart.title.TextTitle.this.font, org.jfree.chart.title.TextTitle.this.paint, maxWidth, new org.jfree.chart.text.G2TextMeasurer(g2));
			org.jfree.chart.title.TextTitle.this.content.setLineAlignment(org.jfree.chart.title.TextTitle.this.textAlignment);
			org.jfree.chart.util.Size2D contentSize = org.jfree.chart.title.TextTitle.this.content.calculateDimensions(g2);
			if (org.jfree.chart.title.TextTitle.this.expandToFitSpace) {
				return new org.jfree.chart.util.Size2D(maxWidth, contentSize.getHeight());
			}else {
				return contentSize;
			}
		}else
			if ((position == (org.jfree.chart.util.RectangleEdge.LEFT)) || (position == (org.jfree.chart.util.RectangleEdge.RIGHT))) {
				float maxWidth = ((float) (heightRange.getUpperBound()));
				g2.setFont(org.jfree.chart.title.TextTitle.this.font);
				org.jfree.chart.title.TextTitle.this.content = org.jfree.chart.text.TextUtilities.createTextBlock(org.jfree.chart.title.TextTitle.this.text, org.jfree.chart.title.TextTitle.this.font, org.jfree.chart.title.TextTitle.this.paint, maxWidth, new org.jfree.chart.text.G2TextMeasurer(g2));
				org.jfree.chart.title.TextTitle.this.content.setLineAlignment(org.jfree.chart.title.TextTitle.this.textAlignment);
				org.jfree.chart.util.Size2D contentSize = org.jfree.chart.title.TextTitle.this.content.calculateDimensions(g2);
				if (org.jfree.chart.title.TextTitle.this.expandToFitSpace) {
					return new org.jfree.chart.util.Size2D(contentSize.getHeight(), maxWidth);
				}else {
					return new org.jfree.chart.util.Size2D(contentSize.height, contentSize.width);
				}
			}else {
				throw new java.lang.RuntimeException("Unrecognised exception.");
			}
		
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		draw(g2, area, null);
	}

	public java.lang.Object draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.lang.Object params) {
		if ((org.jfree.chart.title.TextTitle.this.content) == null) {
			return null;
		}
		area = trimMargin(area);
		drawBorder(g2, area);
		if (org.jfree.chart.title.TextTitle.this.text.equals("")) {
			return null;
		}
		org.jfree.chart.entity.ChartEntity entity = null;
		if (params instanceof org.jfree.chart.block.EntityBlockParams) {
			org.jfree.chart.block.EntityBlockParams p = ((org.jfree.chart.block.EntityBlockParams) (params));
			if (p.getGenerateEntities()) {
				entity = new org.jfree.chart.entity.ChartEntity(area, org.jfree.chart.title.TextTitle.this.toolTipText, org.jfree.chart.title.TextTitle.this.urlText);
			}
		}
		area = trimBorder(area);
		if ((org.jfree.chart.title.TextTitle.this.backgroundPaint) != null) {
			g2.setPaint(org.jfree.chart.title.TextTitle.this.backgroundPaint);
			g2.fill(area);
		}
		area = trimPadding(area);
		org.jfree.chart.util.RectangleEdge position = getPosition();
		if ((position == (org.jfree.chart.util.RectangleEdge.TOP)) || (position == (org.jfree.chart.util.RectangleEdge.BOTTOM))) {
			drawHorizontal(g2, area);
		}else
			if ((position == (org.jfree.chart.util.RectangleEdge.LEFT)) || (position == (org.jfree.chart.util.RectangleEdge.RIGHT))) {
				drawVertical(g2, area);
			}
		
		org.jfree.chart.block.BlockResult result = new org.jfree.chart.block.BlockResult();
		if (entity != null) {
			org.jfree.chart.entity.StandardEntityCollection sec = new org.jfree.chart.entity.StandardEntityCollection();
			sec.add(entity);
			result.setEntityCollection(sec);
		}
		return result;
	}

	protected void drawHorizontal(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		java.awt.geom.Rectangle2D titleArea = ((java.awt.geom.Rectangle2D) (area.clone()));
		g2.setFont(org.jfree.chart.title.TextTitle.this.font);
		g2.setPaint(org.jfree.chart.title.TextTitle.this.paint);
		org.jfree.chart.text.TextBlockAnchor anchor = null;
		float x = 0.0F;
		org.jfree.chart.util.HorizontalAlignment horizontalAlignment = getHorizontalAlignment();
		if (horizontalAlignment == (org.jfree.chart.util.HorizontalAlignment.LEFT)) {
			x = ((float) (titleArea.getX()));
			anchor = org.jfree.chart.text.TextBlockAnchor.TOP_LEFT;
		}else
			if (horizontalAlignment == (org.jfree.chart.util.HorizontalAlignment.RIGHT)) {
				x = ((float) (titleArea.getMaxX()));
				anchor = org.jfree.chart.text.TextBlockAnchor.TOP_RIGHT;
			}else
				if (horizontalAlignment == (org.jfree.chart.util.HorizontalAlignment.CENTER)) {
					x = ((float) (titleArea.getCenterX()));
					anchor = org.jfree.chart.text.TextBlockAnchor.TOP_CENTER;
				}
			
		
		float y = 0.0F;
		org.jfree.chart.util.RectangleEdge position = getPosition();
		if (position == (org.jfree.chart.util.RectangleEdge.TOP)) {
			y = ((float) (titleArea.getY()));
		}else
			if (position == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
				y = ((float) (titleArea.getMaxY()));
				if (horizontalAlignment == (org.jfree.chart.util.HorizontalAlignment.LEFT)) {
					anchor = org.jfree.chart.text.TextBlockAnchor.BOTTOM_LEFT;
				}else
					if (horizontalAlignment == (org.jfree.chart.util.HorizontalAlignment.CENTER)) {
						anchor = org.jfree.chart.text.TextBlockAnchor.BOTTOM_CENTER;
					}else
						if (horizontalAlignment == (org.jfree.chart.util.HorizontalAlignment.RIGHT)) {
							anchor = org.jfree.chart.text.TextBlockAnchor.BOTTOM_RIGHT;
						}
					
				
			}
		
		org.jfree.chart.title.TextTitle.this.content.draw(g2, x, y, anchor);
	}

	protected void drawVertical(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		java.awt.geom.Rectangle2D titleArea = ((java.awt.geom.Rectangle2D) (area.clone()));
		g2.setFont(org.jfree.chart.title.TextTitle.this.font);
		g2.setPaint(org.jfree.chart.title.TextTitle.this.paint);
		org.jfree.chart.text.TextBlockAnchor anchor = null;
		float y = 0.0F;
		org.jfree.chart.util.VerticalAlignment verticalAlignment = getVerticalAlignment();
		if (verticalAlignment == (org.jfree.chart.util.VerticalAlignment.TOP)) {
			y = ((float) (titleArea.getY()));
			anchor = org.jfree.chart.text.TextBlockAnchor.TOP_RIGHT;
		}else
			if (verticalAlignment == (org.jfree.chart.util.VerticalAlignment.BOTTOM)) {
				y = ((float) (titleArea.getMaxY()));
				anchor = org.jfree.chart.text.TextBlockAnchor.TOP_LEFT;
			}else
				if (verticalAlignment == (org.jfree.chart.util.VerticalAlignment.CENTER)) {
					y = ((float) (titleArea.getCenterY()));
					anchor = org.jfree.chart.text.TextBlockAnchor.TOP_CENTER;
				}
			
		
		float x = 0.0F;
		org.jfree.chart.util.RectangleEdge position = getPosition();
		if (position == (org.jfree.chart.util.RectangleEdge.LEFT)) {
			x = ((float) (titleArea.getX()));
		}else
			if (position == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
				x = ((float) (titleArea.getMaxX()));
				if (verticalAlignment == (org.jfree.chart.util.VerticalAlignment.TOP)) {
					anchor = org.jfree.chart.text.TextBlockAnchor.BOTTOM_RIGHT;
				}else
					if (verticalAlignment == (org.jfree.chart.util.VerticalAlignment.CENTER)) {
						anchor = org.jfree.chart.text.TextBlockAnchor.BOTTOM_CENTER;
					}else
						if (verticalAlignment == (org.jfree.chart.util.VerticalAlignment.BOTTOM)) {
							anchor = org.jfree.chart.text.TextBlockAnchor.BOTTOM_LEFT;
						}
					
				
			}
		
		org.jfree.chart.title.TextTitle.this.content.draw(g2, x, y, anchor, x, y, ((-(java.lang.Math.PI)) / 2.0));
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.title.TextTitle.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.title.TextTitle)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.title.TextTitle that = ((org.jfree.chart.title.TextTitle) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.title.TextTitle.this.text, that.text))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.title.TextTitle.this.font, that.font))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.title.TextTitle.this.paint, that.paint))) {
			return false;
		}
		if ((org.jfree.chart.title.TextTitle.this.textAlignment) != (that.textAlignment)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.title.TextTitle.this.backgroundPaint, that.backgroundPaint))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = super.hashCode();
		result = (29 * result) + ((org.jfree.chart.title.TextTitle.this.text) != null ? org.jfree.chart.title.TextTitle.this.text.hashCode() : 0);
		result = (29 * result) + ((org.jfree.chart.title.TextTitle.this.font) != null ? org.jfree.chart.title.TextTitle.this.font.hashCode() : 0);
		result = (29 * result) + ((org.jfree.chart.title.TextTitle.this.paint) != null ? org.jfree.chart.title.TextTitle.this.paint.hashCode() : 0);
		result = (29 * result) + ((org.jfree.chart.title.TextTitle.this.backgroundPaint) != null ? org.jfree.chart.title.TextTitle.this.backgroundPaint.hashCode() : 0);
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.title.TextTitle.this.paint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.title.TextTitle.this.backgroundPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.title.TextTitle.this.paint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.title.TextTitle.this.backgroundPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}


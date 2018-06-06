

package org.jfree.chart.block;


public class LabelBlock extends org.jfree.chart.block.AbstractBlock implements org.jfree.chart.block.Block , org.jfree.chart.util.PublicCloneable {
	static final long serialVersionUID = 249626098864178017L;

	private java.lang.String text;

	private org.jfree.chart.text.TextBlock label;

	private java.awt.Font font;

	private java.lang.String toolTipText;

	private java.lang.String urlText;

	public static final java.awt.Paint DEFAULT_PAINT = java.awt.Color.black;

	private transient java.awt.Paint paint;

	private org.jfree.chart.text.TextBlockAnchor contentAlignmentPoint;

	private org.jfree.chart.util.RectangleAnchor textAnchor;

	public LabelBlock(java.lang.String label) {
		this(label, new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 10), org.jfree.chart.block.LabelBlock.DEFAULT_PAINT);
	}

	public LabelBlock(java.lang.String text, java.awt.Font font) {
		this(text, font, org.jfree.chart.block.LabelBlock.DEFAULT_PAINT);
	}

	public LabelBlock(java.lang.String text, java.awt.Font font, java.awt.Paint paint) {
		org.jfree.chart.block.LabelBlock.this.text = text;
		org.jfree.chart.block.LabelBlock.this.paint = paint;
		org.jfree.chart.block.LabelBlock.this.label = org.jfree.chart.text.TextUtilities.createTextBlock(text, font, org.jfree.chart.block.LabelBlock.this.paint);
		org.jfree.chart.block.LabelBlock.this.font = font;
		org.jfree.chart.block.LabelBlock.this.toolTipText = null;
		org.jfree.chart.block.LabelBlock.this.urlText = null;
		org.jfree.chart.block.LabelBlock.this.contentAlignmentPoint = org.jfree.chart.text.TextBlockAnchor.CENTER;
		org.jfree.chart.block.LabelBlock.this.textAnchor = org.jfree.chart.util.RectangleAnchor.CENTER;
	}

	public java.awt.Font getFont() {
		return org.jfree.chart.block.LabelBlock.this.font;
	}

	public void setFont(java.awt.Font font) {
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		org.jfree.chart.block.LabelBlock.this.font = font;
		org.jfree.chart.block.LabelBlock.this.label = org.jfree.chart.text.TextUtilities.createTextBlock(org.jfree.chart.block.LabelBlock.this.text, font, org.jfree.chart.block.LabelBlock.this.paint);
	}

	public java.awt.Paint getPaint() {
		return org.jfree.chart.block.LabelBlock.this.paint;
	}

	public void setPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.block.LabelBlock.this.paint = paint;
		org.jfree.chart.block.LabelBlock.this.label = org.jfree.chart.text.TextUtilities.createTextBlock(org.jfree.chart.block.LabelBlock.this.text, org.jfree.chart.block.LabelBlock.this.font, org.jfree.chart.block.LabelBlock.this.paint);
	}

	public java.lang.String getToolTipText() {
		return org.jfree.chart.block.LabelBlock.this.toolTipText;
	}

	public void setToolTipText(java.lang.String text) {
		org.jfree.chart.block.LabelBlock.this.toolTipText = text;
	}

	public java.lang.String getURLText() {
		return org.jfree.chart.block.LabelBlock.this.urlText;
	}

	public void setURLText(java.lang.String text) {
		org.jfree.chart.block.LabelBlock.this.urlText = text;
	}

	public org.jfree.chart.text.TextBlockAnchor getContentAlignmentPoint() {
		return org.jfree.chart.block.LabelBlock.this.contentAlignmentPoint;
	}

	public void setContentAlignmentPoint(org.jfree.chart.text.TextBlockAnchor anchor) {
		if (anchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'anchor' argument.");
		}
		org.jfree.chart.block.LabelBlock.this.contentAlignmentPoint = anchor;
	}

	public org.jfree.chart.util.RectangleAnchor getTextAnchor() {
		return org.jfree.chart.block.LabelBlock.this.textAnchor;
	}

	public void setTextAnchor(org.jfree.chart.util.RectangleAnchor anchor) {
		org.jfree.chart.block.LabelBlock.this.textAnchor = anchor;
	}

	public org.jfree.chart.util.Size2D arrange(java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		g2.setFont(org.jfree.chart.block.LabelBlock.this.font);
		org.jfree.chart.util.Size2D s = org.jfree.chart.block.LabelBlock.this.label.calculateDimensions(g2);
		return new org.jfree.chart.util.Size2D(calculateTotalWidth(s.getWidth()), calculateTotalHeight(s.getHeight()));
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		draw(g2, area, null);
	}

	public java.lang.Object draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.lang.Object params) {
		area = trimMargin(area);
		drawBorder(g2, area);
		area = trimBorder(area);
		area = trimPadding(area);
		org.jfree.chart.block.EntityBlockParams ebp = null;
		org.jfree.chart.entity.StandardEntityCollection sec = null;
		java.awt.Shape entityArea = null;
		if (params instanceof org.jfree.chart.block.EntityBlockParams) {
			ebp = ((org.jfree.chart.block.EntityBlockParams) (params));
			if (ebp.getGenerateEntities()) {
				sec = new org.jfree.chart.entity.StandardEntityCollection();
				entityArea = ((java.awt.Shape) (area.clone()));
			}
		}
		g2.setPaint(org.jfree.chart.block.LabelBlock.this.paint);
		g2.setFont(org.jfree.chart.block.LabelBlock.this.font);
		java.awt.geom.Point2D pt = org.jfree.chart.util.RectangleAnchor.coordinates(area, org.jfree.chart.block.LabelBlock.this.textAnchor);
		org.jfree.chart.block.LabelBlock.this.label.draw(g2, ((float) (pt.getX())), ((float) (pt.getY())), org.jfree.chart.block.LabelBlock.this.contentAlignmentPoint);
		org.jfree.chart.block.BlockResult result = null;
		if ((ebp != null) && (sec != null)) {
			if (((org.jfree.chart.block.LabelBlock.this.toolTipText) != null) || ((org.jfree.chart.block.LabelBlock.this.urlText) != null)) {
				org.jfree.chart.entity.ChartEntity entity = new org.jfree.chart.entity.ChartEntity(entityArea, org.jfree.chart.block.LabelBlock.this.toolTipText, org.jfree.chart.block.LabelBlock.this.urlText);
				sec.add(entity);
				result = new org.jfree.chart.block.BlockResult();
				result.setEntityCollection(sec);
			}
		}
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (!(obj instanceof org.jfree.chart.block.LabelBlock)) {
			return false;
		}
		org.jfree.chart.block.LabelBlock that = ((org.jfree.chart.block.LabelBlock) (obj));
		if (!(org.jfree.chart.block.LabelBlock.this.text.equals(that.text))) {
			return false;
		}
		if (!(org.jfree.chart.block.LabelBlock.this.font.equals(that.font))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.block.LabelBlock.this.paint, that.paint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.block.LabelBlock.this.toolTipText, that.toolTipText))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.block.LabelBlock.this.urlText, that.urlText))) {
			return false;
		}
		if (!(org.jfree.chart.block.LabelBlock.this.contentAlignmentPoint.equals(that.contentAlignmentPoint))) {
			return false;
		}
		if (!(org.jfree.chart.block.LabelBlock.this.textAnchor.equals(that.textAnchor))) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.block.LabelBlock.this.paint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.block.LabelBlock.this.paint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}


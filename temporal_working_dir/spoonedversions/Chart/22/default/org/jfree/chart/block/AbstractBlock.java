

package org.jfree.chart.block;


public class AbstractBlock implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = 7689852412141274563L;

	private java.lang.String id;

	private org.jfree.chart.util.RectangleInsets margin;

	private org.jfree.chart.block.BlockFrame frame;

	private org.jfree.chart.util.RectangleInsets padding;

	private double width;

	private double height;

	private transient java.awt.geom.Rectangle2D bounds;

	protected AbstractBlock() {
		org.jfree.chart.block.AbstractBlock.this.id = null;
		org.jfree.chart.block.AbstractBlock.this.width = 0.0;
		org.jfree.chart.block.AbstractBlock.this.height = 0.0;
		org.jfree.chart.block.AbstractBlock.this.bounds = new java.awt.geom.Rectangle2D.Float();
		org.jfree.chart.block.AbstractBlock.this.margin = org.jfree.chart.util.RectangleInsets.ZERO_INSETS;
		org.jfree.chart.block.AbstractBlock.this.frame = org.jfree.chart.block.BlockBorder.NONE;
		org.jfree.chart.block.AbstractBlock.this.padding = org.jfree.chart.util.RectangleInsets.ZERO_INSETS;
	}

	public java.lang.String getID() {
		return org.jfree.chart.block.AbstractBlock.this.id;
	}

	public void setID(java.lang.String id) {
		org.jfree.chart.block.AbstractBlock.this.id = id;
	}

	public double getWidth() {
		return org.jfree.chart.block.AbstractBlock.this.width;
	}

	public void setWidth(double width) {
		org.jfree.chart.block.AbstractBlock.this.width = width;
	}

	public double getHeight() {
		return org.jfree.chart.block.AbstractBlock.this.height;
	}

	public void setHeight(double height) {
		org.jfree.chart.block.AbstractBlock.this.height = height;
	}

	public org.jfree.chart.util.RectangleInsets getMargin() {
		return org.jfree.chart.block.AbstractBlock.this.margin;
	}

	public void setMargin(org.jfree.chart.util.RectangleInsets margin) {
		if (margin == null) {
			throw new java.lang.IllegalArgumentException("Null 'margin' argument.");
		}
		org.jfree.chart.block.AbstractBlock.this.margin = margin;
	}

	public void setMargin(double top, double left, double bottom, double right) {
		setMargin(new org.jfree.chart.util.RectangleInsets(top, left, bottom, right));
	}

	public org.jfree.chart.block.BlockFrame getFrame() {
		return org.jfree.chart.block.AbstractBlock.this.frame;
	}

	public void setFrame(org.jfree.chart.block.BlockFrame frame) {
		if (frame == null) {
			throw new java.lang.IllegalArgumentException("Null 'frame' argument.");
		}
		org.jfree.chart.block.AbstractBlock.this.frame = frame;
	}

	public org.jfree.chart.util.RectangleInsets getPadding() {
		return org.jfree.chart.block.AbstractBlock.this.padding;
	}

	public void setPadding(org.jfree.chart.util.RectangleInsets padding) {
		if (padding == null) {
			throw new java.lang.IllegalArgumentException("Null 'padding' argument.");
		}
		org.jfree.chart.block.AbstractBlock.this.padding = padding;
	}

	public void setPadding(double top, double left, double bottom, double right) {
		setPadding(new org.jfree.chart.util.RectangleInsets(top, left, bottom, right));
	}

	public double getContentXOffset() {
		return ((org.jfree.chart.block.AbstractBlock.this.margin.getLeft()) + (org.jfree.chart.block.AbstractBlock.this.frame.getInsets().getLeft())) + (org.jfree.chart.block.AbstractBlock.this.padding.getLeft());
	}

	public double getContentYOffset() {
		return ((org.jfree.chart.block.AbstractBlock.this.margin.getTop()) + (org.jfree.chart.block.AbstractBlock.this.frame.getInsets().getTop())) + (org.jfree.chart.block.AbstractBlock.this.padding.getTop());
	}

	public org.jfree.chart.util.Size2D arrange(java.awt.Graphics2D g2) {
		return arrange(g2, org.jfree.chart.block.RectangleConstraint.NONE);
	}

	public org.jfree.chart.util.Size2D arrange(java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		org.jfree.chart.util.Size2D base = new org.jfree.chart.util.Size2D(getWidth(), getHeight());
		return constraint.calculateConstrainedSize(base);
	}

	public java.awt.geom.Rectangle2D getBounds() {
		return org.jfree.chart.block.AbstractBlock.this.bounds;
	}

	public void setBounds(java.awt.geom.Rectangle2D bounds) {
		if (bounds == null) {
			throw new java.lang.IllegalArgumentException("Null 'bounds' argument.");
		}
		org.jfree.chart.block.AbstractBlock.this.bounds = bounds;
	}

	protected double trimToContentWidth(double fixedWidth) {
		double result = org.jfree.chart.block.AbstractBlock.this.margin.trimWidth(fixedWidth);
		result = org.jfree.chart.block.AbstractBlock.this.frame.getInsets().trimWidth(result);
		result = org.jfree.chart.block.AbstractBlock.this.padding.trimWidth(result);
		return java.lang.Math.max(result, 0.0);
	}

	protected double trimToContentHeight(double fixedHeight) {
		double result = org.jfree.chart.block.AbstractBlock.this.margin.trimHeight(fixedHeight);
		result = org.jfree.chart.block.AbstractBlock.this.frame.getInsets().trimHeight(result);
		result = org.jfree.chart.block.AbstractBlock.this.padding.trimHeight(result);
		return java.lang.Math.max(result, 0.0);
	}

	protected org.jfree.chart.block.RectangleConstraint toContentConstraint(org.jfree.chart.block.RectangleConstraint c) {
		if (c == null) {
			throw new java.lang.IllegalArgumentException("Null 'c' argument.");
		}
		if (c.equals(org.jfree.chart.block.RectangleConstraint.NONE)) {
			return c;
		}
		double w = c.getWidth();
		org.jfree.data.Range wr = c.getWidthRange();
		double h = c.getHeight();
		org.jfree.data.Range hr = c.getHeightRange();
		double ww = trimToContentWidth(w);
		double hh = trimToContentHeight(h);
		org.jfree.data.Range wwr = trimToContentWidth(wr);
		org.jfree.data.Range hhr = trimToContentHeight(hr);
		return new org.jfree.chart.block.RectangleConstraint(ww, wwr, c.getWidthConstraintType(), hh, hhr, c.getHeightConstraintType());
	}

	private org.jfree.data.Range trimToContentWidth(org.jfree.data.Range r) {
		if (r == null) {
			return null;
		}
		double lowerBound = 0.0;
		double upperBound = java.lang.Double.POSITIVE_INFINITY;
		if ((r.getLowerBound()) > 0.0) {
			lowerBound = trimToContentWidth(r.getLowerBound());
		}
		if ((r.getUpperBound()) < (java.lang.Double.POSITIVE_INFINITY)) {
			upperBound = trimToContentWidth(r.getUpperBound());
		}
		return new org.jfree.data.Range(lowerBound, upperBound);
	}

	private org.jfree.data.Range trimToContentHeight(org.jfree.data.Range r) {
		if (r == null) {
			return null;
		}
		double lowerBound = 0.0;
		double upperBound = java.lang.Double.POSITIVE_INFINITY;
		if ((r.getLowerBound()) > 0.0) {
			lowerBound = trimToContentHeight(r.getLowerBound());
		}
		if ((r.getUpperBound()) < (java.lang.Double.POSITIVE_INFINITY)) {
			upperBound = trimToContentHeight(r.getUpperBound());
		}
		return new org.jfree.data.Range(lowerBound, upperBound);
	}

	protected double calculateTotalWidth(double contentWidth) {
		double result = contentWidth;
		result = org.jfree.chart.block.AbstractBlock.this.padding.extendWidth(result);
		result = org.jfree.chart.block.AbstractBlock.this.frame.getInsets().extendWidth(result);
		result = org.jfree.chart.block.AbstractBlock.this.margin.extendWidth(result);
		return result;
	}

	protected double calculateTotalHeight(double contentHeight) {
		double result = contentHeight;
		result = org.jfree.chart.block.AbstractBlock.this.padding.extendHeight(result);
		result = org.jfree.chart.block.AbstractBlock.this.frame.getInsets().extendHeight(result);
		result = org.jfree.chart.block.AbstractBlock.this.margin.extendHeight(result);
		return result;
	}

	protected java.awt.geom.Rectangle2D trimMargin(java.awt.geom.Rectangle2D area) {
		org.jfree.chart.block.AbstractBlock.this.margin.trim(area);
		return area;
	}

	protected java.awt.geom.Rectangle2D trimBorder(java.awt.geom.Rectangle2D area) {
		org.jfree.chart.block.AbstractBlock.this.frame.getInsets().trim(area);
		return area;
	}

	protected java.awt.geom.Rectangle2D trimPadding(java.awt.geom.Rectangle2D area) {
		org.jfree.chart.block.AbstractBlock.this.padding.trim(area);
		return area;
	}

	protected void drawBorder(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		org.jfree.chart.block.AbstractBlock.this.frame.draw(g2, area);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.block.AbstractBlock.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.block.AbstractBlock)) {
			return false;
		}
		org.jfree.chart.block.AbstractBlock that = ((org.jfree.chart.block.AbstractBlock) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.block.AbstractBlock.this.id, that.id))) {
			return false;
		}
		if (!(org.jfree.chart.block.AbstractBlock.this.frame.equals(that.frame))) {
			return false;
		}
		if (!(org.jfree.chart.block.AbstractBlock.this.bounds.equals(that.bounds))) {
			return false;
		}
		if (!(org.jfree.chart.block.AbstractBlock.this.margin.equals(that.margin))) {
			return false;
		}
		if (!(org.jfree.chart.block.AbstractBlock.this.padding.equals(that.padding))) {
			return false;
		}
		if ((org.jfree.chart.block.AbstractBlock.this.height) != (that.height)) {
			return false;
		}
		if ((org.jfree.chart.block.AbstractBlock.this.width) != (that.width)) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.block.AbstractBlock clone = ((org.jfree.chart.block.AbstractBlock) (super.clone()));
		clone.bounds = ((java.awt.geom.Rectangle2D) (org.jfree.chart.util.ShapeUtilities.clone(org.jfree.chart.block.AbstractBlock.this.bounds)));
		if ((org.jfree.chart.block.AbstractBlock.this.frame) instanceof org.jfree.chart.util.PublicCloneable) {
			org.jfree.chart.util.PublicCloneable pc = ((org.jfree.chart.util.PublicCloneable) (org.jfree.chart.block.AbstractBlock.this.frame));
			clone.frame = ((org.jfree.chart.block.BlockFrame) (pc.clone()));
		}
		return clone;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.block.AbstractBlock.this.bounds, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.block.AbstractBlock.this.bounds = ((java.awt.geom.Rectangle2D) (org.jfree.chart.util.SerialUtilities.readShape(stream)));
	}
}


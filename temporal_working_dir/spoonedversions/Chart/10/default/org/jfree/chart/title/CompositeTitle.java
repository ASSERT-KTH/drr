

package org.jfree.chart.title;


public class CompositeTitle extends org.jfree.chart.title.Title implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = -6770854036232562290L;

	private org.jfree.chart.block.BlockContainer container;

	public CompositeTitle() {
		this(new org.jfree.chart.block.BlockContainer(new org.jfree.chart.block.BorderArrangement()));
	}

	public CompositeTitle(org.jfree.chart.block.BlockContainer container) {
		if (container == null) {
			throw new java.lang.IllegalArgumentException("Null 'container' argument.");
		}
		org.jfree.chart.title.CompositeTitle.this.container = container;
	}

	public org.jfree.chart.block.BlockContainer getContainer() {
		return org.jfree.chart.title.CompositeTitle.this.container;
	}

	public void setTitleContainer(org.jfree.chart.block.BlockContainer container) {
		if (container == null) {
			throw new java.lang.IllegalArgumentException("Null 'container' argument.");
		}
		org.jfree.chart.title.CompositeTitle.this.container = container;
	}

	public org.jfree.chart.util.Size2D arrange(java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		org.jfree.chart.block.RectangleConstraint contentConstraint = toContentConstraint(constraint);
		org.jfree.chart.util.Size2D contentSize = org.jfree.chart.title.CompositeTitle.this.container.arrange(g2, contentConstraint);
		return new org.jfree.chart.util.Size2D(calculateTotalWidth(contentSize.getWidth()), calculateTotalHeight(contentSize.getHeight()));
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		area = trimMargin(area);
		drawBorder(g2, area);
		area = trimBorder(area);
		area = trimPadding(area);
		org.jfree.chart.title.CompositeTitle.this.container.draw(g2, area);
	}

	public java.lang.Object draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.lang.Object params) {
		draw(g2, area);
		return null;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.title.CompositeTitle.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.title.CompositeTitle)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.title.CompositeTitle that = ((org.jfree.chart.title.CompositeTitle) (obj));
		if (!(org.jfree.chart.title.CompositeTitle.this.container.equals(that.container))) {
			return false;
		}
		return true;
	}
}


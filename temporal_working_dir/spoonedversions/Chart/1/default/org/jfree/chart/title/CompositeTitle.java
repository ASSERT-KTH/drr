

package org.jfree.chart.title;


public class CompositeTitle extends org.jfree.chart.title.Title implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = -6770854036232562290L;

	private transient java.awt.Paint backgroundPaint;

	private org.jfree.chart.block.BlockContainer container;

	public CompositeTitle() {
		this(new org.jfree.chart.block.BlockContainer(new org.jfree.chart.block.BorderArrangement()));
	}

	public CompositeTitle(org.jfree.chart.block.BlockContainer container) {
		if (container == null) {
			throw new java.lang.IllegalArgumentException("Null 'container' argument.");
		}
		org.jfree.chart.title.CompositeTitle.this.container = container;
		org.jfree.chart.title.CompositeTitle.this.backgroundPaint = null;
	}

	public java.awt.Paint getBackgroundPaint() {
		return org.jfree.chart.title.CompositeTitle.this.backgroundPaint;
	}

	public void setBackgroundPaint(java.awt.Paint paint) {
		org.jfree.chart.title.CompositeTitle.this.backgroundPaint = paint;
		notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.CompositeTitle.this));
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
		draw(g2, area, null);
	}

	public java.lang.Object draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.lang.Object params) {
		area = trimMargin(area);
		drawBorder(g2, area);
		area = trimBorder(area);
		if ((org.jfree.chart.title.CompositeTitle.this.backgroundPaint) != null) {
			g2.setPaint(org.jfree.chart.title.CompositeTitle.this.backgroundPaint);
			g2.fill(area);
		}
		area = trimPadding(area);
		return org.jfree.chart.title.CompositeTitle.this.container.draw(g2, area, params);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.title.CompositeTitle.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.title.CompositeTitle)) {
			return false;
		}
		org.jfree.chart.title.CompositeTitle that = ((org.jfree.chart.title.CompositeTitle) (obj));
		if (!(org.jfree.chart.title.CompositeTitle.this.container.equals(that.container))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.title.CompositeTitle.this.backgroundPaint, that.backgroundPaint))) {
			return false;
		}
		return super.equals(obj);
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.title.CompositeTitle.this.backgroundPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.title.CompositeTitle.this.backgroundPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}


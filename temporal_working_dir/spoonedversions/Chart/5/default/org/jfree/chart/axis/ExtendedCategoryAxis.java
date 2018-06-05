

package org.jfree.chart.axis;


public class ExtendedCategoryAxis extends org.jfree.chart.axis.CategoryAxis {
	static final long serialVersionUID = -3004429093959826567L;

	private java.util.Map sublabels;

	private java.awt.Font sublabelFont;

	private transient java.awt.Paint sublabelPaint;

	public ExtendedCategoryAxis(java.lang.String label) {
		super(label);
		org.jfree.chart.axis.ExtendedCategoryAxis.this.sublabels = new java.util.HashMap();
		org.jfree.chart.axis.ExtendedCategoryAxis.this.sublabelFont = new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 10);
		org.jfree.chart.axis.ExtendedCategoryAxis.this.sublabelPaint = java.awt.Color.black;
	}

	public java.awt.Font getSubLabelFont() {
		return org.jfree.chart.axis.ExtendedCategoryAxis.this.sublabelFont;
	}

	public void setSubLabelFont(java.awt.Font font) {
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		org.jfree.chart.axis.ExtendedCategoryAxis.this.sublabelFont = font;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.ExtendedCategoryAxis.this));
	}

	public java.awt.Paint getSubLabelPaint() {
		return org.jfree.chart.axis.ExtendedCategoryAxis.this.sublabelPaint;
	}

	public void setSubLabelPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.axis.ExtendedCategoryAxis.this.sublabelPaint = paint;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.ExtendedCategoryAxis.this));
	}

	public void addSubLabel(java.lang.Comparable category, java.lang.String label) {
		org.jfree.chart.axis.ExtendedCategoryAxis.this.sublabels.put(category, label);
	}

	protected org.jfree.chart.text.TextBlock createLabel(java.lang.Comparable category, float width, org.jfree.chart.util.RectangleEdge edge, java.awt.Graphics2D g2) {
		org.jfree.chart.text.TextBlock label = super.createLabel(category, width, edge, g2);
		java.lang.String s = ((java.lang.String) (org.jfree.chart.axis.ExtendedCategoryAxis.this.sublabels.get(category)));
		if (s != null) {
			if ((edge == (org.jfree.chart.util.RectangleEdge.TOP)) || (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM))) {
				org.jfree.chart.text.TextLine line = new org.jfree.chart.text.TextLine(s, org.jfree.chart.axis.ExtendedCategoryAxis.this.sublabelFont, org.jfree.chart.axis.ExtendedCategoryAxis.this.sublabelPaint);
				label.addLine(line);
			}else
				if ((edge == (org.jfree.chart.util.RectangleEdge.LEFT)) || (edge == (org.jfree.chart.util.RectangleEdge.RIGHT))) {
					org.jfree.chart.text.TextLine line = label.getLastLine();
					if (line != null) {
						line.addFragment(new org.jfree.chart.text.TextFragment(("  " + s), org.jfree.chart.axis.ExtendedCategoryAxis.this.sublabelFont, org.jfree.chart.axis.ExtendedCategoryAxis.this.sublabelPaint));
					}
				}
			
		}
		return label;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.axis.ExtendedCategoryAxis.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.ExtendedCategoryAxis)) {
			return false;
		}
		org.jfree.chart.axis.ExtendedCategoryAxis that = ((org.jfree.chart.axis.ExtendedCategoryAxis) (obj));
		if (!(org.jfree.chart.axis.ExtendedCategoryAxis.this.sublabelFont.equals(that.sublabelFont))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.axis.ExtendedCategoryAxis.this.sublabelPaint, that.sublabelPaint))) {
			return false;
		}
		if (!(org.jfree.chart.axis.ExtendedCategoryAxis.this.sublabels.equals(that.sublabels))) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.axis.ExtendedCategoryAxis clone = ((org.jfree.chart.axis.ExtendedCategoryAxis) (super.clone()));
		clone.sublabels = new java.util.HashMap(org.jfree.chart.axis.ExtendedCategoryAxis.this.sublabels);
		return clone;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.axis.ExtendedCategoryAxis.this.sublabelPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.axis.ExtendedCategoryAxis.this.sublabelPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}


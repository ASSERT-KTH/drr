

package org.jfree.chart.text;


public class TextLine implements java.io.Serializable {
	private static final long serialVersionUID = 7100085690160465444L;

	private java.util.List fragments;

	public TextLine() {
		org.jfree.chart.text.TextLine.this.fragments = new java.util.ArrayList();
	}

	public TextLine(java.lang.String text) {
		this(text, org.jfree.chart.text.TextFragment.DEFAULT_FONT);
	}

	public TextLine(java.lang.String text, java.awt.Font font) {
		org.jfree.chart.text.TextLine.this.fragments = new java.util.ArrayList();
		org.jfree.chart.text.TextFragment fragment = new org.jfree.chart.text.TextFragment(text, font);
		org.jfree.chart.text.TextLine.this.fragments.add(fragment);
	}

	public TextLine(java.lang.String text, java.awt.Font font, java.awt.Paint paint) {
		if (text == null) {
			throw new java.lang.IllegalArgumentException("Null 'text' argument.");
		}
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.text.TextLine.this.fragments = new java.util.ArrayList();
		org.jfree.chart.text.TextFragment fragment = new org.jfree.chart.text.TextFragment(text, font, paint);
		org.jfree.chart.text.TextLine.this.fragments.add(fragment);
	}

	public void addFragment(org.jfree.chart.text.TextFragment fragment) {
		org.jfree.chart.text.TextLine.this.fragments.add(fragment);
	}

	public void removeFragment(org.jfree.chart.text.TextFragment fragment) {
		org.jfree.chart.text.TextLine.this.fragments.remove(fragment);
	}

	public void draw(java.awt.Graphics2D g2, float anchorX, float anchorY, org.jfree.chart.text.TextAnchor anchor, float rotateX, float rotateY, double angle) {
		float x = anchorX;
		float yOffset = calculateBaselineOffset(g2, anchor);
		java.util.Iterator iterator = org.jfree.chart.text.TextLine.this.fragments.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.text.TextFragment fragment = ((org.jfree.chart.text.TextFragment) (iterator.next()));
			org.jfree.chart.util.Size2D d = fragment.calculateDimensions(g2);
			fragment.draw(g2, x, (anchorY + yOffset), org.jfree.chart.text.TextAnchor.BASELINE_LEFT, rotateX, rotateY, angle);
			x = x + ((float) (d.getWidth()));
		} 
	}

	public org.jfree.chart.util.Size2D calculateDimensions(java.awt.Graphics2D g2) {
		double width = 0.0;
		double height = 0.0;
		java.util.Iterator iterator = org.jfree.chart.text.TextLine.this.fragments.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.text.TextFragment fragment = ((org.jfree.chart.text.TextFragment) (iterator.next()));
			org.jfree.chart.util.Size2D dimension = fragment.calculateDimensions(g2);
			width = width + (dimension.getWidth());
			height = java.lang.Math.max(height, dimension.getHeight());
		} 
		return new org.jfree.chart.util.Size2D(width, height);
	}

	public org.jfree.chart.text.TextFragment getFirstTextFragment() {
		org.jfree.chart.text.TextFragment result = null;
		if ((org.jfree.chart.text.TextLine.this.fragments.size()) > 0) {
			result = ((org.jfree.chart.text.TextFragment) (org.jfree.chart.text.TextLine.this.fragments.get(0)));
		}
		return result;
	}

	public org.jfree.chart.text.TextFragment getLastTextFragment() {
		org.jfree.chart.text.TextFragment result = null;
		if ((org.jfree.chart.text.TextLine.this.fragments.size()) > 0) {
			result = ((org.jfree.chart.text.TextFragment) (org.jfree.chart.text.TextLine.this.fragments.get(((org.jfree.chart.text.TextLine.this.fragments.size()) - 1))));
		}
		return result;
	}

	private float calculateBaselineOffset(java.awt.Graphics2D g2, org.jfree.chart.text.TextAnchor anchor) {
		float result = 0.0F;
		java.util.Iterator iterator = org.jfree.chart.text.TextLine.this.fragments.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.text.TextFragment fragment = ((org.jfree.chart.text.TextFragment) (iterator.next()));
			result = java.lang.Math.max(result, fragment.calculateBaselineOffset(g2, anchor));
		} 
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == (org.jfree.chart.text.TextLine.this)) {
			return true;
		}
		if (obj instanceof org.jfree.chart.text.TextLine) {
			org.jfree.chart.text.TextLine line = ((org.jfree.chart.text.TextLine) (obj));
			return org.jfree.chart.text.TextLine.this.fragments.equals(line.fragments);
		}
		return false;
	}

	public int hashCode() {
		return (org.jfree.chart.text.TextLine.this.fragments) != null ? org.jfree.chart.text.TextLine.this.fragments.hashCode() : 0;
	}
}




package org.jfree.chart.text;


public class TextBlock implements java.io.Serializable {
	private static final long serialVersionUID = -4333175719424385526L;

	private java.util.List lines;

	private org.jfree.chart.util.HorizontalAlignment lineAlignment;

	public TextBlock() {
		org.jfree.chart.text.TextBlock.this.lines = new java.util.ArrayList();
		org.jfree.chart.text.TextBlock.this.lineAlignment = org.jfree.chart.util.HorizontalAlignment.CENTER;
	}

	public org.jfree.chart.util.HorizontalAlignment getLineAlignment() {
		return org.jfree.chart.text.TextBlock.this.lineAlignment;
	}

	public void setLineAlignment(org.jfree.chart.util.HorizontalAlignment alignment) {
		if (alignment == null) {
			throw new java.lang.IllegalArgumentException("Null 'alignment' argument.");
		}
		org.jfree.chart.text.TextBlock.this.lineAlignment = alignment;
	}

	public void addLine(java.lang.String text, java.awt.Font font, java.awt.Paint paint) {
		addLine(new org.jfree.chart.text.TextLine(text, font, paint));
	}

	public void addLine(org.jfree.chart.text.TextLine line) {
		org.jfree.chart.text.TextBlock.this.lines.add(line);
	}

	public org.jfree.chart.text.TextLine getLastLine() {
		org.jfree.chart.text.TextLine last = null;
		final int index = (org.jfree.chart.text.TextBlock.this.lines.size()) - 1;
		if (index >= 0) {
			last = ((org.jfree.chart.text.TextLine) (org.jfree.chart.text.TextBlock.this.lines.get(index)));
		}
		return last;
	}

	public java.util.List getLines() {
		return java.util.Collections.unmodifiableList(org.jfree.chart.text.TextBlock.this.lines);
	}

	public org.jfree.chart.util.Size2D calculateDimensions(java.awt.Graphics2D g2) {
		double width = 0.0;
		double height = 0.0;
		java.util.Iterator iterator = org.jfree.chart.text.TextBlock.this.lines.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.text.TextLine line = ((org.jfree.chart.text.TextLine) (iterator.next()));
			org.jfree.chart.util.Size2D dimension = line.calculateDimensions(g2);
			width = java.lang.Math.max(width, dimension.getWidth());
			height = height + (dimension.getHeight());
		} 
		return new org.jfree.chart.util.Size2D(width, height);
	}

	public java.awt.Shape calculateBounds(java.awt.Graphics2D g2, float anchorX, float anchorY, org.jfree.chart.text.TextBlockAnchor anchor, float rotateX, float rotateY, double angle) {
		org.jfree.chart.util.Size2D d = calculateDimensions(g2);
		float[] offsets = calculateOffsets(anchor, d.getWidth(), d.getHeight());
		java.awt.geom.Rectangle2D bounds = new java.awt.geom.Rectangle2D.Double((anchorX + (offsets[0])), (anchorY + (offsets[1])), d.getWidth(), d.getHeight());
		java.awt.Shape rotatedBounds = org.jfree.chart.util.ShapeUtilities.rotateShape(bounds, angle, rotateX, rotateY);
		return rotatedBounds;
	}

	public void draw(java.awt.Graphics2D g2, float x, float y, org.jfree.chart.text.TextBlockAnchor anchor) {
		draw(g2, x, y, anchor, 0.0F, 0.0F, 0.0);
	}

	public void draw(java.awt.Graphics2D g2, float anchorX, float anchorY, org.jfree.chart.text.TextBlockAnchor anchor, float rotateX, float rotateY, double angle) {
		org.jfree.chart.util.Size2D d = calculateDimensions(g2);
		float[] offsets = calculateOffsets(anchor, d.getWidth(), d.getHeight());
		java.util.Iterator iterator = org.jfree.chart.text.TextBlock.this.lines.iterator();
		float yCursor = 0.0F;
		while (iterator.hasNext()) {
			org.jfree.chart.text.TextLine line = ((org.jfree.chart.text.TextLine) (iterator.next()));
			org.jfree.chart.util.Size2D dimension = line.calculateDimensions(g2);
			float lineOffset = 0.0F;
			if ((org.jfree.chart.text.TextBlock.this.lineAlignment) == (org.jfree.chart.util.HorizontalAlignment.CENTER)) {
				lineOffset = ((float) ((d.getWidth()) - (dimension.getWidth()))) / 2.0F;
			}else
				if ((org.jfree.chart.text.TextBlock.this.lineAlignment) == (org.jfree.chart.util.HorizontalAlignment.RIGHT)) {
					lineOffset = ((float) ((d.getWidth()) - (dimension.getWidth())));
				}
			
			line.draw(g2, ((anchorX + (offsets[0])) + lineOffset), ((anchorY + (offsets[1])) + yCursor), org.jfree.chart.text.TextAnchor.TOP_LEFT, rotateX, rotateY, angle);
			yCursor = yCursor + ((float) (dimension.getHeight()));
		} 
	}

	private float[] calculateOffsets(org.jfree.chart.text.TextBlockAnchor anchor, double width, double height) {
		float[] result = new float[2];
		float xAdj = 0.0F;
		float yAdj = 0.0F;
		if (((anchor == (org.jfree.chart.text.TextBlockAnchor.TOP_CENTER)) || (anchor == (org.jfree.chart.text.TextBlockAnchor.CENTER))) || (anchor == (org.jfree.chart.text.TextBlockAnchor.BOTTOM_CENTER))) {
			xAdj = ((float) (-width)) / 2.0F;
		}else
			if (((anchor == (org.jfree.chart.text.TextBlockAnchor.TOP_RIGHT)) || (anchor == (org.jfree.chart.text.TextBlockAnchor.CENTER_RIGHT))) || (anchor == (org.jfree.chart.text.TextBlockAnchor.BOTTOM_RIGHT))) {
				xAdj = ((float) (-width));
			}
		
		if (((anchor == (org.jfree.chart.text.TextBlockAnchor.TOP_LEFT)) || (anchor == (org.jfree.chart.text.TextBlockAnchor.TOP_CENTER))) || (anchor == (org.jfree.chart.text.TextBlockAnchor.TOP_RIGHT))) {
			yAdj = 0.0F;
		}else
			if (((anchor == (org.jfree.chart.text.TextBlockAnchor.CENTER_LEFT)) || (anchor == (org.jfree.chart.text.TextBlockAnchor.CENTER))) || (anchor == (org.jfree.chart.text.TextBlockAnchor.CENTER_RIGHT))) {
				yAdj = ((float) (-height)) / 2.0F;
			}else
				if (((anchor == (org.jfree.chart.text.TextBlockAnchor.BOTTOM_LEFT)) || (anchor == (org.jfree.chart.text.TextBlockAnchor.BOTTOM_CENTER))) || (anchor == (org.jfree.chart.text.TextBlockAnchor.BOTTOM_RIGHT))) {
					yAdj = ((float) (-height));
				}
			
		
		result[0] = xAdj;
		result[1] = yAdj;
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.text.TextBlock.this)) {
			return true;
		}
		if (obj instanceof org.jfree.chart.text.TextBlock) {
			final org.jfree.chart.text.TextBlock block = ((org.jfree.chart.text.TextBlock) (obj));
			return org.jfree.chart.text.TextBlock.this.lines.equals(block.lines);
		}
		return false;
	}

	public int hashCode() {
		return (org.jfree.chart.text.TextBlock.this.lines) != null ? org.jfree.chart.text.TextBlock.this.lines.hashCode() : 0;
	}
}


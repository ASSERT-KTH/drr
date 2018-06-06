

package org.jfree.chart.title;


public class ShortTextTitle extends org.jfree.chart.title.TextTitle {
	public ShortTextTitle(java.lang.String text) {
		setText(text);
	}

	public org.jfree.chart.util.Size2D arrange(java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		org.jfree.chart.block.RectangleConstraint cc = toContentConstraint(constraint);
		org.jfree.chart.block.LengthConstraintType w = cc.getWidthConstraintType();
		org.jfree.chart.block.LengthConstraintType h = cc.getHeightConstraintType();
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
					contentSize = arrangeRN(g2, cc.getWidthRange());
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
						contentSize = arrangeFN(g2, cc.getWidth());
					}else
						if (h == (org.jfree.chart.block.LengthConstraintType.RANGE)) {
							throw new java.lang.RuntimeException("Not yet implemented.");
						}else
							if (h == (org.jfree.chart.block.LengthConstraintType.FIXED)) {
								throw new java.lang.RuntimeException("Not yet implemented.");
							}
						
					
				}
			
		
		if (((contentSize.width) <= 0.0) || ((contentSize.height) <= 0.0)) {
			return new org.jfree.chart.util.Size2D(0.0, 0.0);
		}else {
			return new org.jfree.chart.util.Size2D(calculateTotalWidth(contentSize.getWidth()), calculateTotalHeight(contentSize.getHeight()));
		}
	}

	protected org.jfree.chart.util.Size2D arrangeNN(java.awt.Graphics2D g2) {
		org.jfree.data.Range max = new org.jfree.data.Range(0.0, java.lang.Float.MAX_VALUE);
		return arrangeRR(g2, max, max);
	}

	protected org.jfree.chart.util.Size2D arrangeRN(java.awt.Graphics2D g2, org.jfree.data.Range widthRange) {
		org.jfree.chart.util.Size2D s = arrangeNN(g2);
		if (widthRange.contains(s.getWidth())) {
			return s;
		}
		double ww = widthRange.constrain(s.getWidth());
		return arrangeFN(g2, ww);
	}

	protected org.jfree.chart.util.Size2D arrangeFN(java.awt.Graphics2D g2, double w) {
		g2.setFont(getFont());
		java.awt.FontMetrics fm = g2.getFontMetrics(getFont());
		java.awt.geom.Rectangle2D bounds = org.jfree.chart.text.TextUtilities.getTextBounds(getText(), g2, fm);
		if ((bounds.getWidth()) <= w) {
			return new org.jfree.chart.util.Size2D(w, bounds.getHeight());
		}else {
			return new org.jfree.chart.util.Size2D(0.0, 0.0);
		}
	}

	protected org.jfree.chart.util.Size2D arrangeRR(java.awt.Graphics2D g2, org.jfree.data.Range widthRange, org.jfree.data.Range heightRange) {
		g2.setFont(getFont());
		java.awt.FontMetrics fm = g2.getFontMetrics(getFont());
		java.awt.geom.Rectangle2D bounds = org.jfree.chart.text.TextUtilities.getTextBounds(getText(), g2, fm);
		if (((bounds.getWidth()) <= (widthRange.getUpperBound())) && ((bounds.getHeight()) <= (heightRange.getUpperBound()))) {
			return new org.jfree.chart.util.Size2D(bounds.getWidth(), bounds.getHeight());
		}else {
			return new org.jfree.chart.util.Size2D(0.0, 0.0);
		}
	}

	public java.lang.Object draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.lang.Object params) {
		if (area.isEmpty()) {
			return null;
		}
		area = trimMargin(area);
		drawBorder(g2, area);
		area = trimBorder(area);
		area = trimPadding(area);
		g2.setFont(getFont());
		g2.setPaint(getPaint());
		org.jfree.chart.text.TextUtilities.drawAlignedString(getText(), g2, ((float) (area.getMinX())), ((float) (area.getMinY())), org.jfree.chart.text.TextAnchor.TOP_LEFT);
		return null;
	}
}


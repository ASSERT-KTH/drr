

package org.jfree.chart.renderer.xy;


public class StandardXYBarPainter implements java.io.Serializable , org.jfree.chart.renderer.xy.XYBarPainter {
	public StandardXYBarPainter() {
	}

	public void paintBar(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYBarRenderer renderer, int row, int column, java.awt.geom.RectangularShape bar, org.jfree.chart.util.RectangleEdge base) {
		java.awt.Paint itemPaint = renderer.getItemPaint(row, column);
		org.jfree.chart.util.GradientPaintTransformer t = renderer.getGradientPaintTransformer();
		if ((t != null) && (itemPaint instanceof java.awt.GradientPaint)) {
			itemPaint = t.transform(((java.awt.GradientPaint) (itemPaint)), bar);
		}
		g2.setPaint(itemPaint);
		g2.fill(bar);
		if (renderer.isDrawBarOutline()) {
			java.awt.Stroke stroke = renderer.getItemOutlineStroke(row, column);
			java.awt.Paint paint = renderer.getItemOutlinePaint(row, column);
			if ((stroke != null) && (paint != null)) {
				g2.setStroke(stroke);
				g2.setPaint(paint);
				g2.draw(bar);
			}
		}
	}

	public void paintBarShadow(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYBarRenderer renderer, int row, int column, java.awt.geom.RectangularShape bar, org.jfree.chart.util.RectangleEdge base, boolean pegShadow) {
		java.awt.Paint itemPaint = renderer.getItemPaint(row, column);
		if (itemPaint instanceof java.awt.Color) {
			java.awt.Color c = ((java.awt.Color) (itemPaint));
			if ((c.getAlpha()) == 0) {
				return ;
			}
		}
		java.awt.geom.RectangularShape shadow = createShadow(bar, renderer.getShadowXOffset(), renderer.getShadowYOffset(), base, pegShadow);
		g2.setPaint(java.awt.Color.gray);
		g2.fill(shadow);
	}

	private java.awt.geom.Rectangle2D createShadow(java.awt.geom.RectangularShape bar, double xOffset, double yOffset, org.jfree.chart.util.RectangleEdge base, boolean pegShadow) {
		double x0 = bar.getMinX();
		double x1 = bar.getMaxX();
		double y0 = bar.getMinY();
		double y1 = bar.getMaxY();
		if (base == (org.jfree.chart.util.RectangleEdge.TOP)) {
			x0 += xOffset;
			x1 += xOffset;
			if (!pegShadow) {
				y0 += yOffset;
			}
			y1 += yOffset;
		}else
			if (base == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
				x0 += xOffset;
				x1 += xOffset;
				y0 += yOffset;
				if (!pegShadow) {
					y1 += yOffset;
				}
			}else
				if (base == (org.jfree.chart.util.RectangleEdge.LEFT)) {
					if (!pegShadow) {
						x0 += xOffset;
					}
					x1 += xOffset;
					y0 += yOffset;
					y1 += yOffset;
				}else
					if (base == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
						x0 += xOffset;
						if (!pegShadow) {
							x1 += xOffset;
						}
						y0 += yOffset;
						y1 += yOffset;
					}
				
			
		
		return new java.awt.geom.Rectangle2D.Double(x0, y0, (x1 - x0), (y1 - y0));
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.StandardXYBarPainter.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.StandardXYBarPainter)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int hash = 37;
		return hash;
	}
}


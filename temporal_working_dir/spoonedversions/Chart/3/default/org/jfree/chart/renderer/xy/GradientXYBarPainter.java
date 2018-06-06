

package org.jfree.chart.renderer.xy;


public class GradientXYBarPainter implements java.io.Serializable , org.jfree.chart.renderer.xy.XYBarPainter {
	private double g1;

	private double g2;

	private double g3;

	public GradientXYBarPainter() {
		this(0.1, 0.2, 0.8);
	}

	public GradientXYBarPainter(double g1, double g2, double g3) {
		org.jfree.chart.renderer.xy.GradientXYBarPainter.this.g1 = g1;
		org.jfree.chart.renderer.xy.GradientXYBarPainter.this.g2 = g2;
		org.jfree.chart.renderer.xy.GradientXYBarPainter.this.g3 = g3;
	}

	public void paintBar(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYBarRenderer renderer, int row, int column, boolean selected, java.awt.geom.RectangularShape bar, org.jfree.chart.util.RectangleEdge base) {
		java.awt.Paint itemPaint = renderer.getItemPaint(row, column, selected);
		java.awt.Color c0;
		java.awt.Color c1;
		if (itemPaint instanceof java.awt.Color) {
			c0 = ((java.awt.Color) (itemPaint));
			c1 = c0.brighter();
		}else
			if (itemPaint instanceof java.awt.GradientPaint) {
				java.awt.GradientPaint gp = ((java.awt.GradientPaint) (itemPaint));
				c0 = gp.getColor1();
				c1 = gp.getColor2();
			}else {
				c0 = java.awt.Color.blue;
				c1 = java.awt.Color.blue.brighter();
			}
		
		if ((c0.getAlpha()) == 0) {
			return ;
		}
		if ((base == (org.jfree.chart.util.RectangleEdge.TOP)) || (base == (org.jfree.chart.util.RectangleEdge.BOTTOM))) {
			java.awt.geom.Rectangle2D[] regions = splitVerticalBar(bar, org.jfree.chart.renderer.xy.GradientXYBarPainter.this.g1, org.jfree.chart.renderer.xy.GradientXYBarPainter.this.g2, org.jfree.chart.renderer.xy.GradientXYBarPainter.this.g3);
			java.awt.GradientPaint gp = new java.awt.GradientPaint(((float) (regions[0].getMinX())), 0.0F, c0, ((float) (regions[0].getMaxX())), 0.0F, java.awt.Color.white);
			g2.setPaint(gp);
			g2.fill(regions[0]);
			gp = new java.awt.GradientPaint(((float) (regions[1].getMinX())), 0.0F, java.awt.Color.white, ((float) (regions[1].getMaxX())), 0.0F, c0);
			g2.setPaint(gp);
			g2.fill(regions[1]);
			gp = new java.awt.GradientPaint(((float) (regions[2].getMinX())), 0.0F, c0, ((float) (regions[2].getMaxX())), 0.0F, c1);
			g2.setPaint(gp);
			g2.fill(regions[2]);
			gp = new java.awt.GradientPaint(((float) (regions[3].getMinX())), 0.0F, c1, ((float) (regions[3].getMaxX())), 0.0F, c0);
			g2.setPaint(gp);
			g2.fill(regions[3]);
		}else
			if ((base == (org.jfree.chart.util.RectangleEdge.LEFT)) || (base == (org.jfree.chart.util.RectangleEdge.RIGHT))) {
				java.awt.geom.Rectangle2D[] regions = splitHorizontalBar(bar, org.jfree.chart.renderer.xy.GradientXYBarPainter.this.g1, org.jfree.chart.renderer.xy.GradientXYBarPainter.this.g2, org.jfree.chart.renderer.xy.GradientXYBarPainter.this.g3);
				java.awt.GradientPaint gp = new java.awt.GradientPaint(0.0F, ((float) (regions[0].getMinY())), c0, 0.0F, ((float) (regions[0].getMaxX())), java.awt.Color.white);
				g2.setPaint(gp);
				g2.fill(regions[0]);
				gp = new java.awt.GradientPaint(0.0F, ((float) (regions[1].getMinY())), java.awt.Color.white, 0.0F, ((float) (regions[1].getMaxY())), c0);
				g2.setPaint(gp);
				g2.fill(regions[1]);
				gp = new java.awt.GradientPaint(0.0F, ((float) (regions[2].getMinY())), c0, 0.0F, ((float) (regions[2].getMaxY())), c1);
				g2.setPaint(gp);
				g2.fill(regions[2]);
				gp = new java.awt.GradientPaint(0.0F, ((float) (regions[3].getMinY())), c1, 0.0F, ((float) (regions[3].getMaxY())), c0);
				g2.setPaint(gp);
				g2.fill(regions[3]);
			}
		
		if (renderer.isDrawBarOutline()) {
			java.awt.Stroke stroke = renderer.getItemOutlineStroke(row, column, selected);
			java.awt.Paint paint = renderer.getItemOutlinePaint(row, column, selected);
			if ((stroke != null) && (paint != null)) {
				g2.setStroke(stroke);
				g2.setPaint(paint);
				g2.draw(bar);
			}
		}
	}

	public void paintBarShadow(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYBarRenderer renderer, int row, int column, boolean selected, java.awt.geom.RectangularShape bar, org.jfree.chart.util.RectangleEdge base, boolean pegShadow) {
		java.awt.Paint itemPaint = renderer.getItemPaint(row, column, selected);
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

	private java.awt.geom.Rectangle2D[] splitVerticalBar(java.awt.geom.RectangularShape bar, double a, double b, double c) {
		java.awt.geom.Rectangle2D[] result = new java.awt.geom.Rectangle2D[4];
		double x0 = bar.getMinX();
		double x1 = java.lang.Math.rint((x0 + ((bar.getWidth()) * a)));
		double x2 = java.lang.Math.rint((x0 + ((bar.getWidth()) * b)));
		double x3 = java.lang.Math.rint((x0 + ((bar.getWidth()) * c)));
		result[0] = new java.awt.geom.Rectangle2D.Double(bar.getMinX(), bar.getMinY(), (x1 - x0), bar.getHeight());
		result[1] = new java.awt.geom.Rectangle2D.Double(x1, bar.getMinY(), (x2 - x1), bar.getHeight());
		result[2] = new java.awt.geom.Rectangle2D.Double(x2, bar.getMinY(), (x3 - x2), bar.getHeight());
		result[3] = new java.awt.geom.Rectangle2D.Double(x3, bar.getMinY(), ((bar.getMaxX()) - x3), bar.getHeight());
		return result;
	}

	private java.awt.geom.Rectangle2D[] splitHorizontalBar(java.awt.geom.RectangularShape bar, double a, double b, double c) {
		java.awt.geom.Rectangle2D[] result = new java.awt.geom.Rectangle2D[4];
		double y0 = bar.getMinY();
		double y1 = java.lang.Math.rint((y0 + ((bar.getHeight()) * a)));
		double y2 = java.lang.Math.rint((y0 + ((bar.getHeight()) * b)));
		double y3 = java.lang.Math.rint((y0 + ((bar.getHeight()) * c)));
		result[0] = new java.awt.geom.Rectangle2D.Double(bar.getMinX(), bar.getMinY(), bar.getWidth(), (y1 - y0));
		result[1] = new java.awt.geom.Rectangle2D.Double(bar.getMinX(), y1, bar.getWidth(), (y2 - y1));
		result[2] = new java.awt.geom.Rectangle2D.Double(bar.getMinX(), y2, bar.getWidth(), (y3 - y2));
		result[3] = new java.awt.geom.Rectangle2D.Double(bar.getMinX(), y3, bar.getWidth(), ((bar.getMaxY()) - y3));
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.GradientXYBarPainter.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.GradientXYBarPainter)) {
			return false;
		}
		org.jfree.chart.renderer.xy.GradientXYBarPainter that = ((org.jfree.chart.renderer.xy.GradientXYBarPainter) (obj));
		if ((org.jfree.chart.renderer.xy.GradientXYBarPainter.this.g1) != (that.g1)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.GradientXYBarPainter.this.g2) != (that.g2)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.GradientXYBarPainter.this.g3) != (that.g3)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int hash = 37;
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.renderer.xy.GradientXYBarPainter.this.g1);
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.renderer.xy.GradientXYBarPainter.this.g2);
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.renderer.xy.GradientXYBarPainter.this.g3);
		return hash;
	}
}


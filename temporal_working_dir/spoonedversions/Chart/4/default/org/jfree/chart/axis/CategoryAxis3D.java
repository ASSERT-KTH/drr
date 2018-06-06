

package org.jfree.chart.axis;


public class CategoryAxis3D extends org.jfree.chart.axis.CategoryAxis implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = 4114732251353700972L;

	public CategoryAxis3D() {
		this(null);
	}

	public CategoryAxis3D(java.lang.String label) {
		super(label);
	}

	public org.jfree.chart.axis.AxisState draw(java.awt.Graphics2D g2, double cursor, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge, org.jfree.chart.plot.PlotRenderingInfo plotState) {
		if (!(isVisible())) {
			return new org.jfree.chart.axis.AxisState(cursor);
		}
		org.jfree.chart.plot.CategoryPlot plot = ((org.jfree.chart.plot.CategoryPlot) (getPlot()));
		java.awt.geom.Rectangle2D adjustedDataArea = new java.awt.geom.Rectangle2D.Double();
		if ((plot.getRenderer()) instanceof org.jfree.chart.Effect3D) {
			org.jfree.chart.Effect3D e3D = ((org.jfree.chart.Effect3D) (plot.getRenderer()));
			double adjustedX = dataArea.getMinX();
			double adjustedY = dataArea.getMinY();
			double adjustedW = (dataArea.getWidth()) - (e3D.getXOffset());
			double adjustedH = (dataArea.getHeight()) - (e3D.getYOffset());
			if ((edge == (org.jfree.chart.util.RectangleEdge.LEFT)) || (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM))) {
				adjustedY += e3D.getYOffset();
			}else
				if ((edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) || (edge == (org.jfree.chart.util.RectangleEdge.TOP))) {
					adjustedX += e3D.getXOffset();
				}
			
			adjustedDataArea.setRect(adjustedX, adjustedY, adjustedW, adjustedH);
		}else {
			adjustedDataArea.setRect(dataArea);
		}
		if (isAxisLineVisible()) {
			drawAxisLine(g2, cursor, adjustedDataArea, edge);
		}
		org.jfree.chart.axis.AxisState state = new org.jfree.chart.axis.AxisState(cursor);
		if (isTickMarksVisible()) {
			drawTickMarks(g2, cursor, adjustedDataArea, edge, state);
		}
		state = drawCategoryLabels(g2, plotArea, adjustedDataArea, edge, state, plotState);
		state = drawLabel(getLabel(), g2, plotArea, dataArea, edge, state, plotState);
		return state;
	}

	public double getCategoryJava2DCoordinate(org.jfree.chart.axis.CategoryAnchor anchor, int category, int categoryCount, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge) {
		double result = 0.0;
		java.awt.geom.Rectangle2D adjustedArea = area;
		org.jfree.chart.plot.CategoryPlot plot = ((org.jfree.chart.plot.CategoryPlot) (getPlot()));
		org.jfree.chart.renderer.category.CategoryItemRenderer renderer = plot.getRenderer();
		if (renderer instanceof org.jfree.chart.Effect3D) {
			org.jfree.chart.Effect3D e3D = ((org.jfree.chart.Effect3D) (renderer));
			double adjustedX = area.getMinX();
			double adjustedY = area.getMinY();
			double adjustedW = (area.getWidth()) - (e3D.getXOffset());
			double adjustedH = (area.getHeight()) - (e3D.getYOffset());
			if ((edge == (org.jfree.chart.util.RectangleEdge.LEFT)) || (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM))) {
				adjustedY += e3D.getYOffset();
			}else
				if ((edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) || (edge == (org.jfree.chart.util.RectangleEdge.TOP))) {
					adjustedX += e3D.getXOffset();
				}
			
			adjustedArea = new java.awt.geom.Rectangle2D.Double(adjustedX, adjustedY, adjustedW, adjustedH);
		}
		if (anchor == (org.jfree.chart.axis.CategoryAnchor.START)) {
			result = getCategoryStart(category, categoryCount, adjustedArea, edge);
		}else
			if (anchor == (org.jfree.chart.axis.CategoryAnchor.MIDDLE)) {
				result = getCategoryMiddle(category, categoryCount, adjustedArea, edge);
			}else
				if (anchor == (org.jfree.chart.axis.CategoryAnchor.END)) {
					result = getCategoryEnd(category, categoryCount, adjustedArea, edge);
				}
			
		
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}




package org.jfree.chart.axis;


public class NumberAxis3D extends org.jfree.chart.axis.NumberAxis implements java.io.Serializable {
	private static final long serialVersionUID = -1790205852569123512L;

	public NumberAxis3D() {
		this(null);
	}

	public NumberAxis3D(java.lang.String label) {
		super(label);
		setAxisLineVisible(false);
	}

	public org.jfree.chart.axis.AxisState draw(java.awt.Graphics2D g2, double cursor, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge, org.jfree.chart.plot.PlotRenderingInfo plotState) {
		if (!(isVisible())) {
			org.jfree.chart.axis.AxisState state = new org.jfree.chart.axis.AxisState(cursor);
			java.util.List ticks = refreshTicks(g2, state, dataArea, edge);
			state.setTicks(ticks);
			return state;
		}
		double xOffset = 0.0;
		double yOffset = 0.0;
		org.jfree.chart.plot.Plot plot = getPlot();
		if (plot instanceof org.jfree.chart.plot.CategoryPlot) {
			org.jfree.chart.plot.CategoryPlot cp = ((org.jfree.chart.plot.CategoryPlot) (plot));
			org.jfree.chart.renderer.category.CategoryItemRenderer r = cp.getRenderer();
			if (r instanceof org.jfree.chart.Effect3D) {
				org.jfree.chart.Effect3D e3D = ((org.jfree.chart.Effect3D) (r));
				xOffset = e3D.getXOffset();
				yOffset = e3D.getYOffset();
			}
		}
		double adjustedX = dataArea.getMinX();
		double adjustedY = dataArea.getMinY();
		double adjustedW = (dataArea.getWidth()) - xOffset;
		double adjustedH = (dataArea.getHeight()) - yOffset;
		if ((edge == (org.jfree.chart.util.RectangleEdge.LEFT)) || (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM))) {
			adjustedY += yOffset;
		}else
			if ((edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) || (edge == (org.jfree.chart.util.RectangleEdge.TOP))) {
				adjustedX += xOffset;
			}
		
		java.awt.geom.Rectangle2D adjustedDataArea = new java.awt.geom.Rectangle2D.Double(adjustedX, adjustedY, adjustedW, adjustedH);
		org.jfree.chart.axis.AxisState info = drawTickMarksAndLabels(g2, cursor, plotArea, adjustedDataArea, edge, plotState);
		info = drawLabel(getLabel(), g2, plotArea, dataArea, edge, info, plotState);
		return info;
	}
}


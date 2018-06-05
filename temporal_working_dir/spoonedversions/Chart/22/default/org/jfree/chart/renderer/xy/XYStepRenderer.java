

package org.jfree.chart.renderer.xy;


public class XYStepRenderer extends org.jfree.chart.renderer.xy.XYLineAndShapeRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.renderer.xy.XYItemRenderer , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -8918141928884796108L;

	public XYStepRenderer() {
		this(null, null);
	}

	public XYStepRenderer(org.jfree.chart.labels.XYToolTipGenerator toolTipGenerator, org.jfree.chart.urls.XYURLGenerator urlGenerator) {
		super();
		setBaseToolTipGenerator(toolTipGenerator);
		setBaseURLGenerator(urlGenerator);
		setBaseShapesVisible(false);
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo info, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, org.jfree.chart.plot.CrosshairState crosshairState, int pass) {
		if (!(getItemVisible(series, item))) {
			return ;
		}
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		java.awt.Paint seriesPaint = getItemPaint(series, item);
		java.awt.Stroke seriesStroke = getItemStroke(series, item);
		g2.setPaint(seriesPaint);
		g2.setStroke(seriesStroke);
		double x1 = dataset.getXValue(series, item);
		double y1 = dataset.getYValue(series, item);
		if (java.lang.Double.isNaN(y1)) {
			return ;
		}
		org.jfree.chart.util.RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
		org.jfree.chart.util.RectangleEdge yAxisLocation = plot.getRangeAxisEdge();
		double transX1 = domainAxis.valueToJava2D(x1, dataArea, xAxisLocation);
		double transY1 = rangeAxis.valueToJava2D(y1, dataArea, yAxisLocation);
		if (item > 0) {
			double x0 = dataset.getXValue(series, (item - 1));
			double y0 = dataset.getYValue(series, (item - 1));
			if (!(java.lang.Double.isNaN(y0))) {
				double transX0 = domainAxis.valueToJava2D(x0, dataArea, xAxisLocation);
				double transY0 = rangeAxis.valueToJava2D(y0, dataArea, yAxisLocation);
				java.awt.geom.Line2D line = state.workingLine;
				if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					if (transY0 == transY1) {
						line.setLine(transY0, transX0, transY1, transX1);
						g2.draw(line);
					}else {
						line.setLine(transY0, transX0, transY0, transX1);
						g2.draw(line);
						line.setLine(transY0, transX1, transY1, transX1);
						g2.draw(line);
					}
				}else
					if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
						if (transY0 == transY1) {
							line.setLine(transX0, transY0, transX1, transY1);
							g2.draw(line);
						}else {
							line.setLine(transX0, transY0, transX1, transY0);
							g2.draw(line);
							line.setLine(transX1, transY0, transX1, transY1);
							g2.draw(line);
						}
					}
				
			}
		}
		if (isItemLabelVisible(series, item)) {
			double xx = transX1;
			double yy = transY1;
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				xx = transY1;
				yy = transX1;
			}
			drawItemLabel(g2, orientation, dataset, series, item, xx, yy, (y1 < 0.0));
		}
		int domainAxisIndex = plot.getDomainAxisIndex(domainAxis);
		int rangeAxisIndex = plot.getRangeAxisIndex(rangeAxis);
		updateCrosshairValues(crosshairState, x1, y1, domainAxisIndex, rangeAxisIndex, transX1, transY1, orientation);
		org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
		if (entities != null) {
			addEntity(entities, null, dataset, series, item, transX1, transY1);
		}
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}


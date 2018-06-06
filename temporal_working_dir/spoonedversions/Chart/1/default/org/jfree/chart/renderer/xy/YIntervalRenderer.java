

package org.jfree.chart.renderer.xy;


public class YIntervalRenderer extends org.jfree.chart.renderer.xy.AbstractXYItemRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.renderer.xy.XYItemRenderer , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -2951586537224143260L;

	private org.jfree.chart.labels.XYItemLabelGenerator additionalItemLabelGenerator;

	public YIntervalRenderer() {
		super();
		org.jfree.chart.renderer.xy.YIntervalRenderer.this.additionalItemLabelGenerator = null;
	}

	public org.jfree.chart.labels.XYItemLabelGenerator getAdditionalItemLabelGenerator() {
		return org.jfree.chart.renderer.xy.YIntervalRenderer.this.additionalItemLabelGenerator;
	}

	public void setAdditionalItemLabelGenerator(org.jfree.chart.labels.XYItemLabelGenerator generator) {
		org.jfree.chart.renderer.xy.YIntervalRenderer.this.additionalItemLabelGenerator = generator;
		fireChangeEvent();
	}

	public org.jfree.data.Range findRangeBounds(org.jfree.data.xy.XYDataset dataset) {
		return findRangeBounds(dataset, true);
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, boolean selected, int pass) {
		org.jfree.chart.entity.EntityCollection entities = null;
		if ((state.getInfo()) != null) {
			entities = state.getInfo().getOwner().getEntityCollection();
		}
		org.jfree.data.xy.IntervalXYDataset intervalDataset = ((org.jfree.data.xy.IntervalXYDataset) (dataset));
		double x = intervalDataset.getXValue(series, item);
		double yLow = intervalDataset.getStartYValue(series, item);
		double yHigh = intervalDataset.getEndYValue(series, item);
		org.jfree.chart.util.RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
		org.jfree.chart.util.RectangleEdge yAxisLocation = plot.getRangeAxisEdge();
		double xx = domainAxis.valueToJava2D(x, dataArea, xAxisLocation);
		double yyLow = rangeAxis.valueToJava2D(yLow, dataArea, yAxisLocation);
		double yyHigh = rangeAxis.valueToJava2D(yHigh, dataArea, yAxisLocation);
		java.awt.Paint p = getItemPaint(series, item, selected);
		java.awt.Stroke s = getItemStroke(series, item, selected);
		java.awt.geom.Line2D line = null;
		java.awt.Shape shape = getItemShape(series, item, selected);
		java.awt.Shape top = null;
		java.awt.Shape bottom = null;
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			line = new java.awt.geom.Line2D.Double(yyLow, xx, yyHigh, xx);
			top = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape, yyHigh, xx);
			bottom = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape, yyLow, xx);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				line = new java.awt.geom.Line2D.Double(xx, yyLow, xx, yyHigh);
				top = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape, xx, yyHigh);
				bottom = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape, xx, yyLow);
			}
		
		g2.setPaint(p);
		g2.setStroke(s);
		g2.draw(line);
		g2.fill(top);
		g2.fill(bottom);
		if (isItemLabelVisible(series, item, selected)) {
			drawItemLabel(g2, orientation, dataset, series, item, selected, xx, yyHigh, false);
			drawAdditionalItemLabel(g2, orientation, dataset, series, item, xx, yyLow);
		}
		if (entities != null) {
			addEntity(entities, line.getBounds(), dataset, series, item, selected, 0.0, 0.0);
		}
	}

	private void drawAdditionalItemLabel(java.awt.Graphics2D g2, org.jfree.chart.plot.PlotOrientation orientation, org.jfree.data.xy.XYDataset dataset, int series, int item, double x, double y) {
		if ((org.jfree.chart.renderer.xy.YIntervalRenderer.this.additionalItemLabelGenerator) == null) {
			return ;
		}
		java.awt.Font labelFont = getItemLabelFont(series, item, false);
		java.awt.Paint paint = getItemLabelPaint(series, item, false);
		g2.setFont(labelFont);
		g2.setPaint(paint);
		java.lang.String label = org.jfree.chart.renderer.xy.YIntervalRenderer.this.additionalItemLabelGenerator.generateLabel(dataset, series, item);
		org.jfree.chart.labels.ItemLabelPosition position = getNegativeItemLabelPosition(series, item, false);
		java.awt.geom.Point2D anchorPoint = calculateLabelAnchorPoint(position.getItemLabelAnchor(), x, y, orientation);
		org.jfree.chart.text.TextUtilities.drawRotatedString(label, g2, ((float) (anchorPoint.getX())), ((float) (anchorPoint.getY())), position.getTextAnchor(), position.getAngle(), position.getRotationAnchor());
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.YIntervalRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.YIntervalRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.xy.YIntervalRenderer that = ((org.jfree.chart.renderer.xy.YIntervalRenderer) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.xy.YIntervalRenderer.this.additionalItemLabelGenerator, that.additionalItemLabelGenerator))) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}


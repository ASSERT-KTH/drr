

package org.jfree.chart.renderer.category;


public class IntervalBarRenderer extends org.jfree.chart.renderer.category.BarRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.renderer.category.CategoryItemRenderer , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -5068857361615528725L;

	public IntervalBarRenderer() {
		super();
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, int pass) {
		if (dataset instanceof org.jfree.data.category.IntervalCategoryDataset) {
			org.jfree.data.category.IntervalCategoryDataset d = ((org.jfree.data.category.IntervalCategoryDataset) (dataset));
			drawInterval(g2, state, dataArea, plot, domainAxis, rangeAxis, d, row, column);
		}else {
			super.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, row, column, pass);
		}
	}

	protected void drawInterval(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.IntervalCategoryDataset dataset, int row, int column) {
		int seriesCount = getRowCount();
		int categoryCount = getColumnCount();
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		double rectX = 0.0;
		double rectY = 0.0;
		org.jfree.chart.util.RectangleEdge domainAxisLocation = plot.getDomainAxisEdge();
		org.jfree.chart.util.RectangleEdge rangeAxisLocation = plot.getRangeAxisEdge();
		java.lang.Number value0 = dataset.getEndValue(row, column);
		if (value0 == null) {
			return ;
		}
		double java2dValue0 = rangeAxis.valueToJava2D(value0.doubleValue(), dataArea, rangeAxisLocation);
		java.lang.Number value1 = dataset.getStartValue(row, column);
		if (value1 == null) {
			return ;
		}
		double java2dValue1 = rangeAxis.valueToJava2D(value1.doubleValue(), dataArea, rangeAxisLocation);
		if (java2dValue1 < java2dValue0) {
			double temp = java2dValue1;
			java2dValue1 = java2dValue0;
			java2dValue0 = temp;
			java.lang.Number tempNum = value1;
			value1 = value0;
			value0 = tempNum;
		}
		double rectWidth = state.getBarWidth();
		double rectHeight = java.lang.Math.abs((java2dValue1 - java2dValue0));
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			rectY = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, domainAxisLocation);
			if (seriesCount > 1) {
				double seriesGap = ((dataArea.getHeight()) * (getItemMargin())) / (categoryCount * (seriesCount - 1));
				rectY = rectY + (row * ((state.getBarWidth()) + seriesGap));
			}else {
				rectY = rectY + (row * (state.getBarWidth()));
			}
			rectX = java2dValue0;
			rectHeight = state.getBarWidth();
			rectWidth = java.lang.Math.abs((java2dValue1 - java2dValue0));
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				rectX = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, domainAxisLocation);
				if (seriesCount > 1) {
					double seriesGap = ((dataArea.getWidth()) * (getItemMargin())) / (categoryCount * (seriesCount - 1));
					rectX = rectX + (row * ((state.getBarWidth()) + seriesGap));
				}else {
					rectX = rectX + (row * (state.getBarWidth()));
				}
				rectY = java2dValue0;
			}
		
		java.awt.geom.Rectangle2D bar = new java.awt.geom.Rectangle2D.Double(rectX, rectY, rectWidth, rectHeight);
		java.awt.Paint seriesPaint = getItemPaint(row, column);
		g2.setPaint(seriesPaint);
		g2.fill(bar);
		if ((state.getBarWidth()) > (org.jfree.chart.renderer.category.BarRenderer.BAR_OUTLINE_WIDTH_THRESHOLD)) {
			java.awt.Stroke stroke = getItemOutlineStroke(row, column);
			java.awt.Paint paint = getItemOutlinePaint(row, column);
			if ((stroke != null) && (paint != null)) {
				g2.setStroke(stroke);
				g2.setPaint(paint);
				g2.draw(bar);
			}
		}
		org.jfree.chart.labels.CategoryItemLabelGenerator generator = getItemLabelGenerator(row, column);
		if ((generator != null) && (isItemLabelVisible(row, column))) {
			drawItemLabel(g2, dataset, row, column, plot, generator, bar, false);
		}
		org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
		if (entities != null) {
			addItemEntity(entities, dataset, row, column, bar);
		}
	}
}


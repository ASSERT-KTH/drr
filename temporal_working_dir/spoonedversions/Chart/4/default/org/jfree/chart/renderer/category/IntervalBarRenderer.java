

package org.jfree.chart.renderer.category;


public class IntervalBarRenderer extends org.jfree.chart.renderer.category.BarRenderer {
	private static final long serialVersionUID = -5068857361615528725L;

	public IntervalBarRenderer() {
		super();
	}

	public org.jfree.data.Range findRangeBounds(org.jfree.data.category.CategoryDataset dataset) {
		return findRangeBounds(dataset, true);
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, boolean selected, int pass) {
		if (dataset instanceof org.jfree.data.category.IntervalCategoryDataset) {
			org.jfree.data.category.IntervalCategoryDataset d = ((org.jfree.data.category.IntervalCategoryDataset) (dataset));
			drawInterval(g2, state, dataArea, plot, domainAxis, rangeAxis, d, row, column, selected);
		}else {
			super.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, row, column, selected, pass);
		}
	}

	protected void drawInterval(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.IntervalCategoryDataset dataset, int row, int column, boolean selected) {
		int visibleRow = state.getVisibleSeriesIndex(row);
		if (visibleRow < 0) {
			return ;
		}
		int seriesCount = (state.getVisibleSeriesCount()) >= 0 ? state.getVisibleSeriesCount() : getRowCount();
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
		}
		double rectWidth = state.getBarWidth();
		double rectHeight = java.lang.Math.abs((java2dValue1 - java2dValue0));
		org.jfree.chart.util.RectangleEdge barBase = org.jfree.chart.util.RectangleEdge.LEFT;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			rectY = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, domainAxisLocation);
			if (seriesCount > 1) {
				double seriesGap = ((dataArea.getHeight()) * (getItemMargin())) / (categoryCount * (seriesCount - 1));
				rectY = rectY + (visibleRow * ((state.getBarWidth()) + seriesGap));
			}else {
				rectY = rectY + (visibleRow * (state.getBarWidth()));
			}
			rectX = java2dValue0;
			rectHeight = state.getBarWidth();
			rectWidth = java.lang.Math.abs((java2dValue1 - java2dValue0));
			barBase = org.jfree.chart.util.RectangleEdge.LEFT;
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				rectX = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, domainAxisLocation);
				if (seriesCount > 1) {
					double seriesGap = ((dataArea.getWidth()) * (getItemMargin())) / (categoryCount * (seriesCount - 1));
					rectX = rectX + (visibleRow * ((state.getBarWidth()) + seriesGap));
				}else {
					rectX = rectX + (visibleRow * (state.getBarWidth()));
				}
				rectY = java2dValue0;
				barBase = org.jfree.chart.util.RectangleEdge.BOTTOM;
			}
		
		java.awt.geom.Rectangle2D bar = new java.awt.geom.Rectangle2D.Double(rectX, rectY, rectWidth, rectHeight);
		org.jfree.chart.renderer.category.BarPainter painter = getBarPainter();
		if (getShadowsVisible()) {
			painter.paintBarShadow(g2, org.jfree.chart.renderer.category.IntervalBarRenderer.this, row, column, selected, bar, barBase, false);
		}
		getBarPainter().paintBar(g2, org.jfree.chart.renderer.category.IntervalBarRenderer.this, row, column, selected, bar, barBase);
		org.jfree.chart.labels.CategoryItemLabelGenerator generator = getItemLabelGenerator(row, column, selected);
		if ((generator != null) && (isItemLabelVisible(row, column, selected))) {
			drawItemLabelForBar(g2, plot, dataset, row, column, selected, generator, bar, false);
		}
		org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
		if (entities != null) {
			addEntity(entities, bar, dataset, row, column, selected);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.category.IntervalBarRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.category.IntervalBarRenderer)) {
			return false;
		}
		return super.equals(obj);
	}
}




package org.jfree.chart.renderer.category;


public class LevelRenderer extends org.jfree.chart.renderer.category.AbstractCategoryItemRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -8204856624355025117L;

	public static final double DEFAULT_ITEM_MARGIN = 0.2;

	private double itemMargin;

	private double maxItemWidth;

	public LevelRenderer() {
		super();
		org.jfree.chart.renderer.category.LevelRenderer.this.itemMargin = org.jfree.chart.renderer.category.LevelRenderer.DEFAULT_ITEM_MARGIN;
		org.jfree.chart.renderer.category.LevelRenderer.this.maxItemWidth = 1.0;
	}

	public double getItemMargin() {
		return org.jfree.chart.renderer.category.LevelRenderer.this.itemMargin;
	}

	public void setItemMargin(double percent) {
		org.jfree.chart.renderer.category.LevelRenderer.this.itemMargin = percent;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.category.LevelRenderer.this));
	}

	public double getMaximumItemWidth() {
		return org.jfree.chart.renderer.category.LevelRenderer.this.maxItemWidth;
	}

	public void setMaximumItemWidth(double percent) {
		org.jfree.chart.renderer.category.LevelRenderer.this.maxItemWidth = percent;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.category.LevelRenderer.this));
	}

	public org.jfree.chart.renderer.category.CategoryItemRendererState initialise(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, int rendererIndex, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.renderer.category.CategoryItemRendererState state = super.initialise(g2, dataArea, plot, rendererIndex, info);
		calculateItemWidth(plot, dataArea, rendererIndex, state);
		return state;
	}

	protected void calculateItemWidth(org.jfree.chart.plot.CategoryPlot plot, java.awt.geom.Rectangle2D dataArea, int rendererIndex, org.jfree.chart.renderer.category.CategoryItemRendererState state) {
		org.jfree.chart.axis.CategoryAxis domainAxis = getDomainAxis(plot, rendererIndex);
		org.jfree.data.category.CategoryDataset dataset = plot.getDataset(rendererIndex);
		if (dataset != null) {
			int columns = dataset.getColumnCount();
			int rows = dataset.getRowCount();
			double space = 0.0;
			org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				space = dataArea.getHeight();
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					space = dataArea.getWidth();
				}
			
			double maxWidth = space * (getMaximumItemWidth());
			double categoryMargin = 0.0;
			double currentItemMargin = 0.0;
			if (columns > 1) {
				categoryMargin = domainAxis.getCategoryMargin();
			}
			if (rows > 1) {
				currentItemMargin = getItemMargin();
			}
			double used = space * ((((1 - (domainAxis.getLowerMargin())) - (domainAxis.getUpperMargin())) - categoryMargin) - currentItemMargin);
			if ((rows * columns) > 0) {
				state.setBarWidth(java.lang.Math.min((used / (rows * columns)), maxWidth));
			}else {
				state.setBarWidth(java.lang.Math.min(used, maxWidth));
			}
		}
	}

	protected double calculateBarW0(org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.plot.PlotOrientation orientation, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.renderer.category.CategoryItemRendererState state, int row, int column) {
		double space = 0.0;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			space = dataArea.getHeight();
		}else {
			space = dataArea.getWidth();
		}
		double barW0 = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, plot.getDomainAxisEdge());
		int seriesCount = getRowCount();
		int categoryCount = getColumnCount();
		if (seriesCount > 1) {
			double seriesGap = (space * (getItemMargin())) / (categoryCount * (seriesCount - 1));
			double seriesW = calculateSeriesWidth(space, domainAxis, categoryCount, seriesCount);
			barW0 = ((barW0 + (row * (seriesW + seriesGap))) + (seriesW / 2.0)) - ((state.getBarWidth()) / 2.0);
		}else {
			barW0 = (domainAxis.getCategoryMiddle(column, getColumnCount(), dataArea, plot.getDomainAxisEdge())) - ((state.getBarWidth()) / 2.0);
		}
		return barW0;
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, int pass) {
		java.lang.Number dataValue = dataset.getValue(row, column);
		if (dataValue == null) {
			return ;
		}
		double value = dataValue.doubleValue();
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		double barW0 = calculateBarW0(plot, orientation, dataArea, domainAxis, state, row, column);
		org.jfree.chart.util.RectangleEdge edge = plot.getRangeAxisEdge();
		double barL = rangeAxis.valueToJava2D(value, dataArea, edge);
		java.awt.geom.Line2D line = null;
		double x = 0.0;
		double y = 0.0;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			x = barL;
			y = barW0 + ((state.getBarWidth()) / 2.0);
			line = new java.awt.geom.Line2D.Double(barL, barW0, barL, (barW0 + (state.getBarWidth())));
		}else {
			x = barW0 + ((state.getBarWidth()) / 2.0);
			y = barL;
			line = new java.awt.geom.Line2D.Double(barW0, barL, (barW0 + (state.getBarWidth())), barL);
		}
		java.awt.Stroke itemStroke = getItemStroke(row, column);
		java.awt.Paint itemPaint = getItemPaint(row, column);
		g2.setStroke(itemStroke);
		g2.setPaint(itemPaint);
		g2.draw(line);
		org.jfree.chart.labels.CategoryItemLabelGenerator generator = getItemLabelGenerator(row, column);
		if ((generator != null) && (isItemLabelVisible(row, column))) {
			drawItemLabel(g2, orientation, dataset, row, column, x, y, (value < 0.0));
		}
		org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
		if (entities != null) {
			addItemEntity(entities, dataset, row, column, line.getBounds());
		}
	}

	protected double calculateSeriesWidth(double space, org.jfree.chart.axis.CategoryAxis axis, int categories, int series) {
		double factor = ((1.0 - (getItemMargin())) - (axis.getLowerMargin())) - (axis.getUpperMargin());
		if (categories > 1) {
			factor = factor - (axis.getCategoryMargin());
		}
		return (space * factor) / (categories * series);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.category.LevelRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.category.LevelRenderer)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.renderer.category.LevelRenderer that = ((org.jfree.chart.renderer.category.LevelRenderer) (obj));
		if ((org.jfree.chart.renderer.category.LevelRenderer.this.itemMargin) != (that.itemMargin)) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.LevelRenderer.this.maxItemWidth) != (that.maxItemWidth)) {
			return false;
		}
		return true;
	}
}


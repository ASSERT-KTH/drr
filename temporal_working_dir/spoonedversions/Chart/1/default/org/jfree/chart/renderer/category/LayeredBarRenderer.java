

package org.jfree.chart.renderer.category;


public class LayeredBarRenderer extends org.jfree.chart.renderer.category.BarRenderer implements java.io.Serializable {
	private static final long serialVersionUID = -8716572894780469487L;

	protected org.jfree.chart.util.ObjectList seriesBarWidthList;

	public LayeredBarRenderer() {
		super();
		org.jfree.chart.renderer.category.LayeredBarRenderer.this.seriesBarWidthList = new org.jfree.chart.util.ObjectList();
	}

	public double getSeriesBarWidth(int series) {
		double result = java.lang.Double.NaN;
		java.lang.Number n = ((java.lang.Number) (org.jfree.chart.renderer.category.LayeredBarRenderer.this.seriesBarWidthList.get(series)));
		if (n != null) {
			result = n.doubleValue();
		}
		return result;
	}

	public void setSeriesBarWidth(int series, double width) {
		org.jfree.chart.renderer.category.LayeredBarRenderer.this.seriesBarWidthList.set(series, new java.lang.Double(width));
	}

	protected void calculateBarWidth(org.jfree.chart.plot.CategoryPlot plot, java.awt.geom.Rectangle2D dataArea, org.jfree.data.category.CategoryDataset dataset, org.jfree.chart.renderer.category.CategoryItemRendererState state) {
		org.jfree.chart.axis.CategoryAxis domainAxis = getDomainAxis(plot, dataset);
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
			
			double maxWidth = space * (getMaximumBarWidth());
			double categoryMargin = 0.0;
			if (columns > 1) {
				categoryMargin = domainAxis.getCategoryMargin();
			}
			double used = space * (((1 - (domainAxis.getLowerMargin())) - (domainAxis.getUpperMargin())) - categoryMargin);
			if ((rows * columns) > 0) {
				state.setBarWidth(java.lang.Math.min((used / (dataset.getColumnCount())), maxWidth));
			}else {
				state.setBarWidth(java.lang.Math.min(used, maxWidth));
			}
		}
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, boolean selected, int pass) {
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			drawHorizontalItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, row, column, selected);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				drawVerticalItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, row, column, selected);
			}
		
	}

	protected void drawHorizontalItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, boolean selected) {
		java.lang.Number dataValue = dataset.getValue(row, column);
		if (dataValue == null) {
			return ;
		}
		double value = dataValue.doubleValue();
		double base = 0.0;
		double lclip = rangeAxis.getLowerBound();
		double uclip = rangeAxis.getUpperBound();
		if (uclip <= 0.0) {
			if (value >= uclip) {
				return ;
			}
			base = uclip;
			if (value <= lclip) {
				value = lclip;
			}
		}else
			if (lclip <= 0.0) {
				if (value >= uclip) {
					value = uclip;
				}else {
					if (value <= lclip) {
						value = lclip;
					}
				}
			}else {
				if (value <= lclip) {
					return ;
				}
				base = lclip;
				if (value >= uclip) {
					value = uclip;
				}
			}
		
		org.jfree.chart.util.RectangleEdge edge = plot.getRangeAxisEdge();
		double transX1 = rangeAxis.valueToJava2D(base, dataArea, edge);
		double transX2 = rangeAxis.valueToJava2D(value, dataArea, edge);
		double rectX = java.lang.Math.min(transX1, transX2);
		double rectWidth = java.lang.Math.abs((transX2 - transX1));
		double rectY = (domainAxis.getCategoryMiddle(column, getColumnCount(), dataArea, plot.getDomainAxisEdge())) - ((state.getBarWidth()) / 2.0);
		int seriesCount = getRowCount();
		double shift = 0.0;
		double rectHeight = 0.0;
		double widthFactor = 1.0;
		double seriesBarWidth = getSeriesBarWidth(row);
		if (!(java.lang.Double.isNaN(seriesBarWidth))) {
			widthFactor = seriesBarWidth;
		}
		rectHeight = widthFactor * (state.getBarWidth());
		rectY = rectY + (((1 - widthFactor) * (state.getBarWidth())) / 2.0);
		if (seriesCount > 1) {
			shift = (rectHeight * 0.2) / (seriesCount - 1);
		}
		java.awt.geom.Rectangle2D bar = new java.awt.geom.Rectangle2D.Double(rectX, (rectY + (((seriesCount - 1) - row) * shift)), rectWidth, (rectHeight - ((((seriesCount - 1) - row) * shift) * 2)));
		java.awt.Paint itemPaint = getItemPaint(row, column, selected);
		org.jfree.chart.util.GradientPaintTransformer t = getGradientPaintTransformer();
		if ((t != null) && (itemPaint instanceof java.awt.GradientPaint)) {
			itemPaint = t.transform(((java.awt.GradientPaint) (itemPaint)), bar);
		}
		g2.setPaint(itemPaint);
		g2.fill(bar);
		if ((isDrawBarOutline()) && ((state.getBarWidth()) > (org.jfree.chart.renderer.category.BarRenderer.BAR_OUTLINE_WIDTH_THRESHOLD))) {
			java.awt.Stroke stroke = getItemOutlineStroke(row, column, selected);
			java.awt.Paint paint = getItemOutlinePaint(row, column, selected);
			if ((stroke != null) && (paint != null)) {
				g2.setStroke(stroke);
				g2.setPaint(paint);
				g2.draw(bar);
			}
		}
		org.jfree.chart.labels.CategoryItemLabelGenerator generator = getItemLabelGenerator(row, column, selected);
		if ((generator != null) && (isItemLabelVisible(row, column, selected))) {
			drawItemLabelForBar(g2, plot, dataset, row, column, selected, generator, bar, (transX1 > transX2));
		}
		org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
		if (entities != null) {
			addEntity(entities, bar, dataset, row, column, selected);
		}
	}

	protected void drawVerticalItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, boolean selected) {
		java.lang.Number dataValue = dataset.getValue(row, column);
		if (dataValue == null) {
			return ;
		}
		double rectX = (domainAxis.getCategoryMiddle(column, getColumnCount(), dataArea, plot.getDomainAxisEdge())) - ((state.getBarWidth()) / 2.0);
		int seriesCount = getRowCount();
		double value = dataValue.doubleValue();
		double base = 0.0;
		double lclip = rangeAxis.getLowerBound();
		double uclip = rangeAxis.getUpperBound();
		if (uclip <= 0.0) {
			if (value >= uclip) {
				return ;
			}
			base = uclip;
			if (value <= lclip) {
				value = lclip;
			}
		}else
			if (lclip <= 0.0) {
				if (value >= uclip) {
					value = uclip;
				}else {
					if (value <= lclip) {
						value = lclip;
					}
				}
			}else {
				if (value <= lclip) {
					return ;
				}
				base = rangeAxis.getLowerBound();
				if (value >= uclip) {
					value = uclip;
				}
			}
		
		org.jfree.chart.util.RectangleEdge edge = plot.getRangeAxisEdge();
		double transY1 = rangeAxis.valueToJava2D(base, dataArea, edge);
		double transY2 = rangeAxis.valueToJava2D(value, dataArea, edge);
		double rectY = java.lang.Math.min(transY2, transY1);
		double rectWidth = state.getBarWidth();
		double rectHeight = java.lang.Math.abs((transY2 - transY1));
		double shift = 0.0;
		rectWidth = 0.0;
		double widthFactor = 1.0;
		double seriesBarWidth = getSeriesBarWidth(row);
		if (!(java.lang.Double.isNaN(seriesBarWidth))) {
			widthFactor = seriesBarWidth;
		}
		rectWidth = widthFactor * (state.getBarWidth());
		rectX = rectX + (((1 - widthFactor) * (state.getBarWidth())) / 2.0);
		if (seriesCount > 1) {
			shift = (rectWidth * 0.2) / (seriesCount - 1);
		}
		java.awt.geom.Rectangle2D bar = new java.awt.geom.Rectangle2D.Double((rectX + (((seriesCount - 1) - row) * shift)), rectY, (rectWidth - ((((seriesCount - 1) - row) * shift) * 2)), rectHeight);
		java.awt.Paint itemPaint = getItemPaint(row, column, selected);
		org.jfree.chart.util.GradientPaintTransformer t = getGradientPaintTransformer();
		if ((t != null) && (itemPaint instanceof java.awt.GradientPaint)) {
			itemPaint = t.transform(((java.awt.GradientPaint) (itemPaint)), bar);
		}
		g2.setPaint(itemPaint);
		g2.fill(bar);
		if ((isDrawBarOutline()) && ((state.getBarWidth()) > (org.jfree.chart.renderer.category.BarRenderer.BAR_OUTLINE_WIDTH_THRESHOLD))) {
			java.awt.Stroke stroke = getItemOutlineStroke(row, column, selected);
			java.awt.Paint paint = getItemOutlinePaint(row, column, selected);
			if ((stroke != null) && (paint != null)) {
				g2.setStroke(stroke);
				g2.setPaint(paint);
				g2.draw(bar);
			}
		}
		double transX1 = rangeAxis.valueToJava2D(base, dataArea, edge);
		double transX2 = rangeAxis.valueToJava2D(value, dataArea, edge);
		org.jfree.chart.labels.CategoryItemLabelGenerator generator = getItemLabelGenerator(row, column, selected);
		if ((generator != null) && (isItemLabelVisible(row, column, selected))) {
			drawItemLabelForBar(g2, plot, dataset, row, column, selected, generator, bar, (transX1 > transX2));
		}
		org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
		if (entities != null) {
			addEntity(entities, bar, dataset, row, column, selected);
		}
	}
}


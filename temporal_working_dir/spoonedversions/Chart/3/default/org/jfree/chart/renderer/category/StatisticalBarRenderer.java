

package org.jfree.chart.renderer.category;


public class StatisticalBarRenderer extends org.jfree.chart.renderer.category.BarRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.renderer.category.CategoryItemRenderer , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -4986038395414039117L;

	private transient java.awt.Paint errorIndicatorPaint;

	private transient java.awt.Stroke errorIndicatorStroke;

	public StatisticalBarRenderer() {
		super();
		org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorPaint = java.awt.Color.gray;
		org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorStroke = new java.awt.BasicStroke(0.5F);
	}

	public java.awt.Paint getErrorIndicatorPaint() {
		return org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorPaint;
	}

	public void setErrorIndicatorPaint(java.awt.Paint paint) {
		org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorPaint = paint;
		fireChangeEvent();
	}

	public java.awt.Stroke getErrorIndicatorStroke() {
		return org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorStroke;
	}

	public void setErrorIndicatorStroke(java.awt.Stroke stroke) {
		org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorStroke = stroke;
		fireChangeEvent();
	}

	public org.jfree.data.Range findRangeBounds(org.jfree.data.category.CategoryDataset dataset) {
		return findRangeBounds(dataset, true);
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, boolean selected, int pass) {
		int visibleRow = state.getVisibleSeriesIndex(row);
		if (visibleRow < 0) {
			return ;
		}
		if (!(dataset instanceof org.jfree.data.statistics.StatisticalCategoryDataset)) {
			throw new java.lang.IllegalArgumentException("Requires StatisticalCategoryDataset.");
		}
		org.jfree.data.statistics.StatisticalCategoryDataset statDataset = ((org.jfree.data.statistics.StatisticalCategoryDataset) (dataset));
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			drawHorizontalItem(g2, state, dataArea, plot, domainAxis, rangeAxis, statDataset, visibleRow, row, column, selected);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				drawVerticalItem(g2, state, dataArea, plot, domainAxis, rangeAxis, statDataset, visibleRow, row, column, selected);
			}
		
	}

	protected void drawHorizontalItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.statistics.StatisticalCategoryDataset dataset, int visibleRow, int row, int column, boolean selected) {
		org.jfree.chart.util.RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
		double rectY = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, xAxisLocation);
		int seriesCount = (state.getVisibleSeriesCount()) >= 0 ? state.getVisibleSeriesCount() : getRowCount();
		int categoryCount = getColumnCount();
		if (seriesCount > 1) {
			double seriesGap = ((dataArea.getHeight()) * (getItemMargin())) / (categoryCount * (seriesCount - 1));
			rectY = rectY + (visibleRow * ((state.getBarWidth()) + seriesGap));
		}else {
			rectY = rectY + (visibleRow * (state.getBarWidth()));
		}
		java.lang.Number meanValue = dataset.getMeanValue(row, column);
		if (meanValue == null) {
			return ;
		}
		double value = meanValue.doubleValue();
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
		
		org.jfree.chart.util.RectangleEdge yAxisLocation = plot.getRangeAxisEdge();
		double transY1 = rangeAxis.valueToJava2D(base, dataArea, yAxisLocation);
		double transY2 = rangeAxis.valueToJava2D(value, dataArea, yAxisLocation);
		double rectX = java.lang.Math.min(transY2, transY1);
		double rectHeight = state.getBarWidth();
		double rectWidth = java.lang.Math.abs((transY2 - transY1));
		java.awt.geom.Rectangle2D bar = new java.awt.geom.Rectangle2D.Double(rectX, rectY, rectWidth, rectHeight);
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
		java.lang.Number n = dataset.getStdDevValue(row, column);
		if (n != null) {
			double valueDelta = n.doubleValue();
			double highVal = rangeAxis.valueToJava2D(((meanValue.doubleValue()) + valueDelta), dataArea, yAxisLocation);
			double lowVal = rangeAxis.valueToJava2D(((meanValue.doubleValue()) - valueDelta), dataArea, yAxisLocation);
			if ((org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorPaint) != null) {
				g2.setPaint(org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorPaint);
			}else {
				g2.setPaint(getItemOutlinePaint(row, column, selected));
			}
			if ((org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorStroke) != null) {
				g2.setStroke(org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorStroke);
			}else {
				g2.setStroke(getItemOutlineStroke(row, column, selected));
			}
			java.awt.geom.Line2D line = null;
			line = new java.awt.geom.Line2D.Double(lowVal, (rectY + (rectHeight / 2.0)), highVal, (rectY + (rectHeight / 2.0)));
			g2.draw(line);
			line = new java.awt.geom.Line2D.Double(highVal, (rectY + (rectHeight * 0.25)), highVal, (rectY + (rectHeight * 0.75)));
			g2.draw(line);
			line = new java.awt.geom.Line2D.Double(lowVal, (rectY + (rectHeight * 0.25)), lowVal, (rectY + (rectHeight * 0.75)));
			g2.draw(line);
		}
		org.jfree.chart.labels.CategoryItemLabelGenerator generator = getItemLabelGenerator(row, column, selected);
		if ((generator != null) && (isItemLabelVisible(row, column, selected))) {
			drawItemLabelForBar(g2, plot, dataset, row, column, selected, generator, bar, (value < 0.0));
		}
		org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
		if (entities != null) {
			addEntity(entities, bar, dataset, row, column, selected);
		}
	}

	protected void drawVerticalItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.statistics.StatisticalCategoryDataset dataset, int visibleRow, int row, int column, boolean selected) {
		org.jfree.chart.util.RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
		double rectX = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, xAxisLocation);
		int seriesCount = (state.getVisibleSeriesCount()) >= 0 ? state.getVisibleSeriesCount() : getRowCount();
		int categoryCount = getColumnCount();
		if (seriesCount > 1) {
			double seriesGap = ((dataArea.getWidth()) * (getItemMargin())) / (categoryCount * (seriesCount - 1));
			rectX = rectX + (visibleRow * ((state.getBarWidth()) + seriesGap));
		}else {
			rectX = rectX + (visibleRow * (state.getBarWidth()));
		}
		java.lang.Number meanValue = dataset.getMeanValue(row, column);
		if (meanValue == null) {
			return ;
		}
		double value = meanValue.doubleValue();
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
		
		org.jfree.chart.util.RectangleEdge yAxisLocation = plot.getRangeAxisEdge();
		double transY1 = rangeAxis.valueToJava2D(base, dataArea, yAxisLocation);
		double transY2 = rangeAxis.valueToJava2D(value, dataArea, yAxisLocation);
		double rectY = java.lang.Math.min(transY2, transY1);
		double rectWidth = state.getBarWidth();
		double rectHeight = java.lang.Math.abs((transY2 - transY1));
		java.awt.geom.Rectangle2D bar = new java.awt.geom.Rectangle2D.Double(rectX, rectY, rectWidth, rectHeight);
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
		java.lang.Number n = dataset.getStdDevValue(row, column);
		if (n != null) {
			double valueDelta = n.doubleValue();
			double highVal = rangeAxis.valueToJava2D(((meanValue.doubleValue()) + valueDelta), dataArea, yAxisLocation);
			double lowVal = rangeAxis.valueToJava2D(((meanValue.doubleValue()) - valueDelta), dataArea, yAxisLocation);
			if ((org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorPaint) != null) {
				g2.setPaint(org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorPaint);
			}else {
				g2.setPaint(getItemOutlinePaint(row, column, selected));
			}
			if ((org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorStroke) != null) {
				g2.setStroke(org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorStroke);
			}else {
				g2.setStroke(getItemOutlineStroke(row, column, selected));
			}
			java.awt.geom.Line2D line = null;
			line = new java.awt.geom.Line2D.Double((rectX + (rectWidth / 2.0)), lowVal, (rectX + (rectWidth / 2.0)), highVal);
			g2.draw(line);
			line = new java.awt.geom.Line2D.Double(((rectX + (rectWidth / 2.0)) - 5.0), highVal, ((rectX + (rectWidth / 2.0)) + 5.0), highVal);
			g2.draw(line);
			line = new java.awt.geom.Line2D.Double(((rectX + (rectWidth / 2.0)) - 5.0), lowVal, ((rectX + (rectWidth / 2.0)) + 5.0), lowVal);
			g2.draw(line);
		}
		org.jfree.chart.labels.CategoryItemLabelGenerator generator = getItemLabelGenerator(row, column, selected);
		if ((generator != null) && (isItemLabelVisible(row, column, selected))) {
			drawItemLabelForBar(g2, plot, dataset, row, column, selected, generator, bar, (value < 0.0));
		}
		org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
		if (entities != null) {
			addEntity(entities, bar, dataset, row, column, selected);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.category.StatisticalBarRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.category.StatisticalBarRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.category.StatisticalBarRenderer that = ((org.jfree.chart.renderer.category.StatisticalBarRenderer) (obj));
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorPaint, that.errorIndicatorPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorStroke, that.errorIndicatorStroke))) {
			return false;
		}
		return super.equals(obj);
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorPaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorStroke, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
	}
}


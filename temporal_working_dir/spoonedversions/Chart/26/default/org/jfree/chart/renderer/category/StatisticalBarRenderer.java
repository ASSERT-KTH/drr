

package org.jfree.chart.renderer.category;


public class StatisticalBarRenderer extends org.jfree.chart.renderer.category.BarRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.renderer.category.CategoryItemRenderer , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -4986038395414039117L;

	private transient java.awt.Paint errorIndicatorPaint;

	public StatisticalBarRenderer() {
		super();
		org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorPaint = java.awt.Color.gray;
	}

	public java.awt.Paint getErrorIndicatorPaint() {
		return org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorPaint;
	}

	public void setErrorIndicatorPaint(java.awt.Paint paint) {
		org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorPaint = paint;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.category.StatisticalBarRenderer.this));
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset data, int row, int column, int pass) {
		if (!(data instanceof org.jfree.data.statistics.StatisticalCategoryDataset)) {
			throw new java.lang.IllegalArgumentException("Requires StatisticalCategoryDataset.");
		}
		org.jfree.data.statistics.StatisticalCategoryDataset statData = ((org.jfree.data.statistics.StatisticalCategoryDataset) (data));
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			drawHorizontalItem(g2, state, dataArea, plot, domainAxis, rangeAxis, statData, row, column);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				drawVerticalItem(g2, state, dataArea, plot, domainAxis, rangeAxis, statData, row, column);
			}
		
	}

	protected void drawHorizontalItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.statistics.StatisticalCategoryDataset dataset, int row, int column) {
		org.jfree.chart.util.RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
		double rectY = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, xAxisLocation);
		int seriesCount = getRowCount();
		int categoryCount = getColumnCount();
		if (seriesCount > 1) {
			double seriesGap = ((dataArea.getHeight()) * (getItemMargin())) / (categoryCount * (seriesCount - 1));
			rectY = rectY + (row * ((state.getBarWidth()) + seriesGap));
		}else {
			rectY = rectY + (row * (state.getBarWidth()));
		}
		java.lang.Number meanValue = dataset.getMeanValue(row, column);
		double value = meanValue.doubleValue();
		double base = 0.0;
		double lclip = getLowerClip();
		double uclip = getUpperClip();
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
				base = getLowerClip();
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
		java.awt.Paint seriesPaint = getItemPaint(row, column);
		g2.setPaint(seriesPaint);
		g2.fill(bar);
		if ((state.getBarWidth()) > 3) {
			g2.setStroke(getItemStroke(row, column));
			g2.setPaint(getItemOutlinePaint(row, column));
			g2.draw(bar);
		}
		double valueDelta = dataset.getStdDevValue(row, column).doubleValue();
		double highVal = rangeAxis.valueToJava2D(((meanValue.doubleValue()) + valueDelta), dataArea, yAxisLocation);
		double lowVal = rangeAxis.valueToJava2D(((meanValue.doubleValue()) - valueDelta), dataArea, yAxisLocation);
		if ((org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorPaint) != null) {
			g2.setPaint(org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorPaint);
		}else {
			g2.setPaint(getItemOutlinePaint(row, column));
		}
		java.awt.geom.Line2D line = null;
		line = new java.awt.geom.Line2D.Double(lowVal, (rectY + (rectHeight / 2.0)), highVal, (rectY + (rectHeight / 2.0)));
		g2.draw(line);
		line = new java.awt.geom.Line2D.Double(highVal, (rectY + (rectHeight * 0.25)), highVal, (rectY + (rectHeight * 0.75)));
		g2.draw(line);
		line = new java.awt.geom.Line2D.Double(lowVal, (rectY + (rectHeight * 0.25)), lowVal, (rectY + (rectHeight * 0.75)));
		g2.draw(line);
		org.jfree.chart.labels.CategoryItemLabelGenerator generator = getItemLabelGenerator(row, column);
		if ((generator != null) && (isItemLabelVisible(row, column))) {
			drawItemLabel(g2, dataset, row, column, plot, generator, bar, (value < 0.0));
		}
		org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
		if (entities != null) {
			addItemEntity(entities, dataset, row, column, bar);
		}
	}

	protected void drawVerticalItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.statistics.StatisticalCategoryDataset dataset, int row, int column) {
		org.jfree.chart.util.RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
		double rectX = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, xAxisLocation);
		int seriesCount = getRowCount();
		int categoryCount = getColumnCount();
		if (seriesCount > 1) {
			double seriesGap = ((dataArea.getWidth()) * (getItemMargin())) / (categoryCount * (seriesCount - 1));
			rectX = rectX + (row * ((state.getBarWidth()) + seriesGap));
		}else {
			rectX = rectX + (row * (state.getBarWidth()));
		}
		java.lang.Number meanValue = dataset.getMeanValue(row, column);
		double value = meanValue.doubleValue();
		double base = 0.0;
		double lclip = getLowerClip();
		double uclip = getUpperClip();
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
				base = getLowerClip();
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
		java.awt.Paint seriesPaint = getItemPaint(row, column);
		g2.setPaint(seriesPaint);
		g2.fill(bar);
		if ((state.getBarWidth()) > 3) {
			g2.setStroke(getItemStroke(row, column));
			g2.setPaint(getItemOutlinePaint(row, column));
			g2.draw(bar);
		}
		double valueDelta = dataset.getStdDevValue(row, column).doubleValue();
		double highVal = rangeAxis.valueToJava2D(((meanValue.doubleValue()) + valueDelta), dataArea, yAxisLocation);
		double lowVal = rangeAxis.valueToJava2D(((meanValue.doubleValue()) - valueDelta), dataArea, yAxisLocation);
		if ((org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorPaint) != null) {
			g2.setPaint(org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorPaint);
		}else {
			g2.setPaint(getItemOutlinePaint(row, column));
		}
		java.awt.geom.Line2D line = null;
		line = new java.awt.geom.Line2D.Double((rectX + (rectWidth / 2.0)), lowVal, (rectX + (rectWidth / 2.0)), highVal);
		g2.draw(line);
		line = new java.awt.geom.Line2D.Double(((rectX + (rectWidth / 2.0)) - 5.0), highVal, ((rectX + (rectWidth / 2.0)) + 5.0), highVal);
		g2.draw(line);
		line = new java.awt.geom.Line2D.Double(((rectX + (rectWidth / 2.0)) - 5.0), lowVal, ((rectX + (rectWidth / 2.0)) + 5.0), lowVal);
		g2.draw(line);
		org.jfree.chart.labels.CategoryItemLabelGenerator generator = getItemLabelGenerator(row, column);
		if ((generator != null) && (isItemLabelVisible(row, column))) {
			drawItemLabel(g2, dataset, row, column, plot, generator, bar, (value < 0.0));
		}
		org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
		if (entities != null) {
			addItemEntity(entities, dataset, row, column, bar);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.category.StatisticalBarRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.category.StatisticalBarRenderer)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.renderer.category.StatisticalBarRenderer that = ((org.jfree.chart.renderer.category.StatisticalBarRenderer) (obj));
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorPaint, that.errorIndicatorPaint))) {
			return false;
		}
		return true;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.category.StatisticalBarRenderer.this.errorIndicatorPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}




package org.jfree.chart.renderer.category;


public class StatisticalLineAndShapeRenderer extends org.jfree.chart.renderer.category.LineAndShapeRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -3557517173697777579L;

	private transient java.awt.Paint errorIndicatorPaint;

	public StatisticalLineAndShapeRenderer() {
		this(true, true);
	}

	public StatisticalLineAndShapeRenderer(boolean linesVisible, boolean shapesVisible) {
		super(linesVisible, shapesVisible);
		org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.this.errorIndicatorPaint = null;
	}

	public java.awt.Paint getErrorIndicatorPaint() {
		return org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.this.errorIndicatorPaint;
	}

	public void setErrorIndicatorPaint(java.awt.Paint paint) {
		org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.this.errorIndicatorPaint = paint;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.this));
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, int pass) {
		if (!(getItemVisible(row, column))) {
			return ;
		}
		java.lang.Number v = dataset.getValue(row, column);
		if (v == null) {
			return ;
		}
		if (!(dataset instanceof org.jfree.data.statistics.StatisticalCategoryDataset)) {
			super.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, row, column, pass);
			return ;
		}
		org.jfree.data.statistics.StatisticalCategoryDataset statData = ((org.jfree.data.statistics.StatisticalCategoryDataset) (dataset));
		java.lang.Number meanValue = statData.getMeanValue(row, column);
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		double x1 = domainAxis.getCategoryMiddle(column, getColumnCount(), dataArea, plot.getDomainAxisEdge());
		double y1 = rangeAxis.valueToJava2D(meanValue.doubleValue(), dataArea, plot.getRangeAxisEdge());
		java.awt.Shape shape = getItemShape(row, column);
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			shape = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape, y1, x1);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				shape = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape, x1, y1);
			}
		
		if (getItemShapeVisible(row, column)) {
			if (getItemShapeFilled(row, column)) {
				g2.setPaint(getItemPaint(row, column));
				g2.fill(shape);
			}else {
				if (getUseOutlinePaint()) {
					g2.setPaint(getItemOutlinePaint(row, column));
				}else {
					g2.setPaint(getItemPaint(row, column));
				}
				g2.setStroke(getItemOutlineStroke(row, column));
				g2.draw(shape);
			}
		}
		if (getItemLineVisible(row, column)) {
			if (column != 0) {
				java.lang.Number previousValue = statData.getValue(row, (column - 1));
				if (previousValue != null) {
					double previous = previousValue.doubleValue();
					double x0 = domainAxis.getCategoryMiddle((column - 1), getColumnCount(), dataArea, plot.getDomainAxisEdge());
					double y0 = rangeAxis.valueToJava2D(previous, dataArea, plot.getRangeAxisEdge());
					java.awt.geom.Line2D line = null;
					if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
						line = new java.awt.geom.Line2D.Double(y0, x0, y1, x1);
					}else
						if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
							line = new java.awt.geom.Line2D.Double(x0, y0, x1, y1);
						}
					
					g2.setPaint(getItemPaint(row, column));
					g2.setStroke(getItemStroke(row, column));
					g2.draw(line);
				}
			}
		}
		org.jfree.chart.util.RectangleEdge yAxisLocation = plot.getRangeAxisEdge();
		org.jfree.chart.util.RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
		double rectX = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, xAxisLocation);
		rectX = rectX + (row * (state.getBarWidth()));
		g2.setPaint(getItemPaint(row, column));
		double valueDelta = statData.getStdDevValue(row, column).doubleValue();
		double highVal;
		double lowVal;
		if (((meanValue.doubleValue()) + valueDelta) > (rangeAxis.getRange().getUpperBound())) {
			highVal = rangeAxis.valueToJava2D(rangeAxis.getRange().getUpperBound(), dataArea, yAxisLocation);
		}else {
			highVal = rangeAxis.valueToJava2D(((meanValue.doubleValue()) + valueDelta), dataArea, yAxisLocation);
		}
		if (((meanValue.doubleValue()) + valueDelta) < (rangeAxis.getRange().getLowerBound())) {
			lowVal = rangeAxis.valueToJava2D(rangeAxis.getRange().getLowerBound(), dataArea, yAxisLocation);
		}else {
			lowVal = rangeAxis.valueToJava2D(((meanValue.doubleValue()) - valueDelta), dataArea, yAxisLocation);
		}
		if ((org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.this.errorIndicatorPaint) != null) {
			g2.setPaint(org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.this.errorIndicatorPaint);
		}else {
			g2.setPaint(getItemPaint(row, column));
		}
		java.awt.geom.Line2D line = new java.awt.geom.Line2D.Double();
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			line.setLine(lowVal, x1, highVal, x1);
			g2.draw(line);
			line.setLine(lowVal, (x1 - 5.0), lowVal, (x1 + 5.0));
			g2.draw(line);
			line.setLine(highVal, (x1 - 5.0), highVal, (x1 + 5.0));
			g2.draw(line);
		}else {
			line.setLine(x1, lowVal, x1, highVal);
			g2.draw(line);
			line.setLine((x1 - 5.0), highVal, (x1 + 5.0), highVal);
			g2.draw(line);
			line.setLine((x1 - 5.0), lowVal, (x1 + 5.0), lowVal);
			g2.draw(line);
		}
		if (isItemLabelVisible(row, column)) {
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				drawItemLabel(g2, orientation, dataset, row, column, y1, x1, ((meanValue.doubleValue()) < 0.0));
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					drawItemLabel(g2, orientation, dataset, row, column, x1, y1, ((meanValue.doubleValue()) < 0.0));
				}
			
		}
		org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
		if (entities != null) {
			addItemEntity(entities, dataset, row, column, shape);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer that = ((org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer) (obj));
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.this.errorIndicatorPaint, that.errorIndicatorPaint))) {
			return false;
		}
		return super.equals(obj);
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.this.errorIndicatorPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.this.errorIndicatorPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}




package org.jfree.chart.renderer.category;


public class StatisticalLineAndShapeRenderer extends org.jfree.chart.renderer.category.LineAndShapeRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -3557517173697777579L;

	private transient java.awt.Paint errorIndicatorPaint;

	private transient java.awt.Stroke errorIndicatorStroke;

	public StatisticalLineAndShapeRenderer() {
		this(true, true);
	}

	public StatisticalLineAndShapeRenderer(boolean linesVisible, boolean shapesVisible) {
		super(linesVisible, shapesVisible);
		org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.this.errorIndicatorPaint = null;
		org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.this.errorIndicatorStroke = null;
	}

	public java.awt.Paint getErrorIndicatorPaint() {
		return org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.this.errorIndicatorPaint;
	}

	public void setErrorIndicatorPaint(java.awt.Paint paint) {
		org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.this.errorIndicatorPaint = paint;
		fireChangeEvent();
	}

	public java.awt.Stroke getErrorIndicatorStroke() {
		return org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.this.errorIndicatorStroke;
	}

	public void setErrorIndicatorStroke(java.awt.Stroke stroke) {
		org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.this.errorIndicatorStroke = stroke;
		fireChangeEvent();
	}

	public org.jfree.data.Range findRangeBounds(org.jfree.data.category.CategoryDataset dataset) {
		return findRangeBounds(dataset, true);
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, boolean selected, int pass) {
		if (!(getItemVisible(row, column))) {
			return ;
		}
		if (!(dataset instanceof org.jfree.data.statistics.StatisticalCategoryDataset)) {
			super.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, row, column, selected, pass);
			return ;
		}
		int visibleRow = state.getVisibleSeriesIndex(row);
		if (visibleRow < 0) {
			return ;
		}
		int visibleRowCount = state.getVisibleSeriesCount();
		org.jfree.data.statistics.StatisticalCategoryDataset statDataset = ((org.jfree.data.statistics.StatisticalCategoryDataset) (dataset));
		java.lang.Number meanValue = statDataset.getMeanValue(row, column);
		if (meanValue == null) {
			return ;
		}
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		double x1;
		if (getUseSeriesOffset()) {
			x1 = domainAxis.getCategorySeriesMiddle(column, dataset.getColumnCount(), visibleRow, visibleRowCount, getItemMargin(), dataArea, plot.getDomainAxisEdge());
		}else {
			x1 = domainAxis.getCategoryMiddle(column, getColumnCount(), dataArea, plot.getDomainAxisEdge());
		}
		double y1 = rangeAxis.valueToJava2D(meanValue.doubleValue(), dataArea, plot.getRangeAxisEdge());
		java.lang.Number sdv = statDataset.getStdDevValue(row, column);
		if ((pass == 1) && (sdv != null)) {
			org.jfree.chart.util.RectangleEdge yAxisLocation = plot.getRangeAxisEdge();
			double valueDelta = sdv.doubleValue();
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
				g2.setPaint(getItemPaint(row, column, selected));
			}
			if ((org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.this.errorIndicatorStroke) != null) {
				g2.setStroke(org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.this.errorIndicatorStroke);
			}else {
				g2.setStroke(getItemOutlineStroke(row, column, selected));
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
		}
		java.awt.Shape hotspot = null;
		if ((pass == 1) && (getItemShapeVisible(row, column))) {
			java.awt.Shape shape = getItemShape(row, column, selected);
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				shape = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape, y1, x1);
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					shape = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape, x1, y1);
				}
			
			hotspot = shape;
			if (getItemShapeFilled(row, column)) {
				if (getUseFillPaint()) {
					g2.setPaint(getItemFillPaint(row, column, selected));
				}else {
					g2.setPaint(getItemPaint(row, column, selected));
				}
				g2.fill(shape);
			}
			if (getDrawOutlines()) {
				if (getUseOutlinePaint()) {
					g2.setPaint(getItemOutlinePaint(row, column, selected));
				}else {
					g2.setPaint(getItemPaint(row, column, selected));
				}
				g2.setStroke(getItemOutlineStroke(row, column, selected));
				g2.draw(shape);
			}
			if (isItemLabelVisible(row, column, selected)) {
				if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					drawItemLabel(g2, orientation, dataset, row, column, selected, y1, x1, ((meanValue.doubleValue()) < 0.0));
				}else
					if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
						drawItemLabel(g2, orientation, dataset, row, column, selected, x1, y1, ((meanValue.doubleValue()) < 0.0));
					}
				
			}
		}
		if ((pass == 0) && (getItemLineVisible(row, column))) {
			if (column != 0) {
				java.lang.Number previousValue = statDataset.getValue(row, (column - 1));
				if (previousValue != null) {
					double previous = previousValue.doubleValue();
					double x0;
					if (getUseSeriesOffset()) {
						x0 = domainAxis.getCategorySeriesMiddle((column - 1), dataset.getColumnCount(), visibleRow, visibleRowCount, getItemMargin(), dataArea, plot.getDomainAxisEdge());
					}else {
						x0 = domainAxis.getCategoryMiddle((column - 1), getColumnCount(), dataArea, plot.getDomainAxisEdge());
					}
					double y0 = rangeAxis.valueToJava2D(previous, dataArea, plot.getRangeAxisEdge());
					java.awt.geom.Line2D line = null;
					if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
						line = new java.awt.geom.Line2D.Double(y0, x0, y1, x1);
					}else
						if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
							line = new java.awt.geom.Line2D.Double(x0, y0, x1, y1);
						}
					
					g2.setPaint(getItemPaint(row, column, selected));
					g2.setStroke(getItemStroke(row, column, selected));
					g2.draw(line);
				}
			}
		}
		if (pass == 1) {
			org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
			if (entities != null) {
				addEntity(entities, hotspot, dataset, row, column, selected, x1, y1);
			}
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
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.this.errorIndicatorStroke, that.errorIndicatorStroke))) {
			return false;
		}
		return super.equals(obj);
	}

	public int hashCode() {
		int hash = super.hashCode();
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.this.errorIndicatorPaint);
		return hash;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.this.errorIndicatorPaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.this.errorIndicatorStroke, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.this.errorIndicatorPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer.this.errorIndicatorStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
	}
}


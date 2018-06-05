

package org.jfree.chart.renderer.category;


public class ScatterRenderer extends org.jfree.chart.renderer.category.AbstractCategoryItemRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private org.jfree.chart.util.BooleanList seriesShapesFilled;

	private boolean baseShapesFilled;

	private boolean useFillPaint;

	private boolean drawOutlines;

	private boolean useOutlinePaint;

	private boolean useSeriesOffset;

	private double itemMargin;

	public ScatterRenderer() {
		org.jfree.chart.renderer.category.ScatterRenderer.this.seriesShapesFilled = new org.jfree.chart.util.BooleanList();
		org.jfree.chart.renderer.category.ScatterRenderer.this.baseShapesFilled = true;
		org.jfree.chart.renderer.category.ScatterRenderer.this.useFillPaint = false;
		org.jfree.chart.renderer.category.ScatterRenderer.this.drawOutlines = false;
		org.jfree.chart.renderer.category.ScatterRenderer.this.useOutlinePaint = false;
		org.jfree.chart.renderer.category.ScatterRenderer.this.useSeriesOffset = true;
		org.jfree.chart.renderer.category.ScatterRenderer.this.itemMargin = 0.2;
	}

	public boolean getUseSeriesOffset() {
		return org.jfree.chart.renderer.category.ScatterRenderer.this.useSeriesOffset;
	}

	public void setUseSeriesOffset(boolean offset) {
		org.jfree.chart.renderer.category.ScatterRenderer.this.useSeriesOffset = offset;
		fireChangeEvent();
	}

	public double getItemMargin() {
		return org.jfree.chart.renderer.category.ScatterRenderer.this.itemMargin;
	}

	public void setItemMargin(double margin) {
		if ((margin < 0.0) || (margin >= 1.0)) {
			throw new java.lang.IllegalArgumentException("Requires 0.0 <= margin < 1.0.");
		}
		org.jfree.chart.renderer.category.ScatterRenderer.this.itemMargin = margin;
		fireChangeEvent();
	}

	public boolean getDrawOutlines() {
		return org.jfree.chart.renderer.category.ScatterRenderer.this.drawOutlines;
	}

	public void setDrawOutlines(boolean flag) {
		org.jfree.chart.renderer.category.ScatterRenderer.this.drawOutlines = flag;
		fireChangeEvent();
	}

	public boolean getUseOutlinePaint() {
		return org.jfree.chart.renderer.category.ScatterRenderer.this.useOutlinePaint;
	}

	public void setUseOutlinePaint(boolean use) {
		org.jfree.chart.renderer.category.ScatterRenderer.this.useOutlinePaint = use;
		fireChangeEvent();
	}

	public boolean getItemShapeFilled(int series, int item) {
		return getSeriesShapesFilled(series);
	}

	public boolean getSeriesShapesFilled(int series) {
		java.lang.Boolean flag = org.jfree.chart.renderer.category.ScatterRenderer.this.seriesShapesFilled.getBoolean(series);
		if (flag != null) {
			return flag.booleanValue();
		}else {
			return org.jfree.chart.renderer.category.ScatterRenderer.this.baseShapesFilled;
		}
	}

	public void setSeriesShapesFilled(int series, java.lang.Boolean filled) {
		org.jfree.chart.renderer.category.ScatterRenderer.this.seriesShapesFilled.setBoolean(series, filled);
		fireChangeEvent();
	}

	public void setSeriesShapesFilled(int series, boolean filled) {
		org.jfree.chart.renderer.category.ScatterRenderer.this.seriesShapesFilled.setBoolean(series, java.lang.Boolean.valueOf(filled));
		fireChangeEvent();
	}

	public boolean getBaseShapesFilled() {
		return org.jfree.chart.renderer.category.ScatterRenderer.this.baseShapesFilled;
	}

	public void setBaseShapesFilled(boolean flag) {
		org.jfree.chart.renderer.category.ScatterRenderer.this.baseShapesFilled = flag;
		fireChangeEvent();
	}

	public boolean getUseFillPaint() {
		return org.jfree.chart.renderer.category.ScatterRenderer.this.useFillPaint;
	}

	public void setUseFillPaint(boolean flag) {
		org.jfree.chart.renderer.category.ScatterRenderer.this.useFillPaint = flag;
		fireChangeEvent();
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, int pass) {
		if (!(getItemVisible(row, column))) {
			return ;
		}
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		org.jfree.data.statistics.MultiValueCategoryDataset d = ((org.jfree.data.statistics.MultiValueCategoryDataset) (dataset));
		java.util.List values = d.getValues(row, column);
		if (values == null) {
			return ;
		}
		int valueCount = values.size();
		for (int i = 0; i < valueCount; i++) {
			double x1;
			if (org.jfree.chart.renderer.category.ScatterRenderer.this.useSeriesOffset) {
				x1 = domainAxis.getCategorySeriesMiddle(dataset.getColumnKey(column), dataset.getRowKey(row), dataset, org.jfree.chart.renderer.category.ScatterRenderer.this.itemMargin, dataArea, plot.getDomainAxisEdge());
			}else {
				x1 = domainAxis.getCategoryMiddle(column, getColumnCount(), dataArea, plot.getDomainAxisEdge());
			}
			java.lang.Number n = ((java.lang.Number) (values.get(i)));
			double value = n.doubleValue();
			double y1 = rangeAxis.valueToJava2D(value, dataArea, plot.getRangeAxisEdge());
			java.awt.Shape shape = getItemShape(row, column);
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				shape = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape, y1, x1);
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					shape = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape, x1, y1);
				}
			
			if (getItemShapeFilled(row, column)) {
				if (org.jfree.chart.renderer.category.ScatterRenderer.this.useFillPaint) {
					g2.setPaint(getItemFillPaint(row, column));
				}else {
					g2.setPaint(getItemPaint(row, column));
				}
				g2.fill(shape);
			}
			if (org.jfree.chart.renderer.category.ScatterRenderer.this.drawOutlines) {
				if (org.jfree.chart.renderer.category.ScatterRenderer.this.useOutlinePaint) {
					g2.setPaint(getItemOutlinePaint(row, column));
				}else {
					g2.setPaint(getItemPaint(row, column));
				}
				g2.setStroke(getItemOutlineStroke(row, column));
				g2.draw(shape);
			}
		}
	}

	public org.jfree.chart.LegendItem getLegendItem(int datasetIndex, int series) {
		org.jfree.chart.plot.CategoryPlot cp = getPlot();
		if (cp == null) {
			return null;
		}
		if ((isSeriesVisible(series)) && (isSeriesVisibleInLegend(series))) {
			org.jfree.data.category.CategoryDataset dataset = cp.getDataset(datasetIndex);
			java.lang.String label = getLegendItemLabelGenerator().generateLabel(dataset, series);
			java.lang.String description = label;
			java.lang.String toolTipText = null;
			if ((getLegendItemToolTipGenerator()) != null) {
				toolTipText = getLegendItemToolTipGenerator().generateLabel(dataset, series);
			}
			java.lang.String urlText = null;
			if ((getLegendItemURLGenerator()) != null) {
				urlText = getLegendItemURLGenerator().generateLabel(dataset, series);
			}
			java.awt.Shape shape = lookupLegendShape(series);
			java.awt.Paint paint = lookupSeriesPaint(series);
			java.awt.Paint fillPaint = org.jfree.chart.renderer.category.ScatterRenderer.this.useFillPaint ? getItemFillPaint(series, 0) : paint;
			boolean shapeOutlineVisible = org.jfree.chart.renderer.category.ScatterRenderer.this.drawOutlines;
			java.awt.Paint outlinePaint = org.jfree.chart.renderer.category.ScatterRenderer.this.useOutlinePaint ? getItemOutlinePaint(series, 0) : paint;
			java.awt.Stroke outlineStroke = lookupSeriesOutlineStroke(series);
			org.jfree.chart.LegendItem result = new org.jfree.chart.LegendItem(label, description, toolTipText, urlText, true, shape, getItemShapeFilled(series, 0), fillPaint, shapeOutlineVisible, outlinePaint, outlineStroke, false, new java.awt.geom.Line2D.Double((-7.0), 0.0, 7.0, 0.0), getItemStroke(series, 0), getItemPaint(series, 0));
			result.setLabelFont(lookupLegendTextFont(series));
			java.awt.Paint labelPaint = lookupLegendTextPaint(series);
			if (labelPaint != null) {
				result.setLabelPaint(labelPaint);
			}
			result.setDataset(dataset);
			result.setDatasetIndex(datasetIndex);
			result.setSeriesKey(dataset.getRowKey(series));
			result.setSeriesIndex(series);
			return result;
		}
		return null;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.category.ScatterRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.category.ScatterRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.category.ScatterRenderer that = ((org.jfree.chart.renderer.category.ScatterRenderer) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.category.ScatterRenderer.this.seriesShapesFilled, that.seriesShapesFilled))) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.ScatterRenderer.this.baseShapesFilled) != (that.baseShapesFilled)) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.ScatterRenderer.this.useFillPaint) != (that.useFillPaint)) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.ScatterRenderer.this.drawOutlines) != (that.drawOutlines)) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.ScatterRenderer.this.useOutlinePaint) != (that.useOutlinePaint)) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.ScatterRenderer.this.useSeriesOffset) != (that.useSeriesOffset)) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.ScatterRenderer.this.itemMargin) != (that.itemMargin)) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.renderer.category.ScatterRenderer clone = ((org.jfree.chart.renderer.category.ScatterRenderer) (super.clone()));
		clone.seriesShapesFilled = ((org.jfree.chart.util.BooleanList) (org.jfree.chart.renderer.category.ScatterRenderer.this.seriesShapesFilled.clone()));
		return clone;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
	}
}


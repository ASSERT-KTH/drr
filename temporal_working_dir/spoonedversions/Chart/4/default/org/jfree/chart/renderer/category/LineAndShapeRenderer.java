

package org.jfree.chart.renderer.category;


public class LineAndShapeRenderer extends org.jfree.chart.renderer.category.AbstractCategoryItemRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -197749519869226398L;

	private org.jfree.chart.util.BooleanList seriesLinesVisible;

	private boolean baseLinesVisible;

	private org.jfree.chart.util.BooleanList seriesShapesVisible;

	private boolean baseShapesVisible;

	private org.jfree.chart.util.BooleanList seriesShapesFilled;

	private boolean baseShapesFilled;

	private boolean useFillPaint;

	private boolean drawOutlines;

	private boolean useOutlinePaint;

	private boolean useSeriesOffset;

	private double itemMargin;

	public LineAndShapeRenderer() {
		this(true, true);
	}

	public LineAndShapeRenderer(boolean lines, boolean shapes) {
		super();
		org.jfree.chart.renderer.category.LineAndShapeRenderer.this.seriesLinesVisible = new org.jfree.chart.util.BooleanList();
		org.jfree.chart.renderer.category.LineAndShapeRenderer.this.baseLinesVisible = lines;
		org.jfree.chart.renderer.category.LineAndShapeRenderer.this.seriesShapesVisible = new org.jfree.chart.util.BooleanList();
		org.jfree.chart.renderer.category.LineAndShapeRenderer.this.baseShapesVisible = shapes;
		org.jfree.chart.renderer.category.LineAndShapeRenderer.this.seriesShapesFilled = new org.jfree.chart.util.BooleanList();
		org.jfree.chart.renderer.category.LineAndShapeRenderer.this.baseShapesFilled = true;
		org.jfree.chart.renderer.category.LineAndShapeRenderer.this.useFillPaint = false;
		org.jfree.chart.renderer.category.LineAndShapeRenderer.this.drawOutlines = true;
		org.jfree.chart.renderer.category.LineAndShapeRenderer.this.useOutlinePaint = false;
		org.jfree.chart.renderer.category.LineAndShapeRenderer.this.useSeriesOffset = false;
		org.jfree.chart.renderer.category.LineAndShapeRenderer.this.itemMargin = 0.0;
	}

	public boolean getItemLineVisible(int series, int item) {
		java.lang.Boolean flag = getSeriesLinesVisible(series);
		if (flag != null) {
			return flag.booleanValue();
		}else {
			return org.jfree.chart.renderer.category.LineAndShapeRenderer.this.baseLinesVisible;
		}
	}

	public java.lang.Boolean getSeriesLinesVisible(int series) {
		return org.jfree.chart.renderer.category.LineAndShapeRenderer.this.seriesLinesVisible.getBoolean(series);
	}

	public void setSeriesLinesVisible(int series, java.lang.Boolean flag) {
		org.jfree.chart.renderer.category.LineAndShapeRenderer.this.seriesLinesVisible.setBoolean(series, flag);
		fireChangeEvent();
	}

	public void setSeriesLinesVisible(int series, boolean visible) {
		setSeriesLinesVisible(series, java.lang.Boolean.valueOf(visible));
	}

	public boolean getBaseLinesVisible() {
		return org.jfree.chart.renderer.category.LineAndShapeRenderer.this.baseLinesVisible;
	}

	public void setBaseLinesVisible(boolean flag) {
		org.jfree.chart.renderer.category.LineAndShapeRenderer.this.baseLinesVisible = flag;
		fireChangeEvent();
	}

	public boolean getItemShapeVisible(int series, int item) {
		java.lang.Boolean flag = getSeriesShapesVisible(series);
		if (flag != null) {
			return flag.booleanValue();
		}else {
			return org.jfree.chart.renderer.category.LineAndShapeRenderer.this.baseShapesVisible;
		}
	}

	public java.lang.Boolean getSeriesShapesVisible(int series) {
		return org.jfree.chart.renderer.category.LineAndShapeRenderer.this.seriesShapesVisible.getBoolean(series);
	}

	public void setSeriesShapesVisible(int series, boolean visible) {
		setSeriesShapesVisible(series, java.lang.Boolean.valueOf(visible));
	}

	public void setSeriesShapesVisible(int series, java.lang.Boolean flag) {
		org.jfree.chart.renderer.category.LineAndShapeRenderer.this.seriesShapesVisible.setBoolean(series, flag);
		fireChangeEvent();
	}

	public boolean getBaseShapesVisible() {
		return org.jfree.chart.renderer.category.LineAndShapeRenderer.this.baseShapesVisible;
	}

	public void setBaseShapesVisible(boolean flag) {
		org.jfree.chart.renderer.category.LineAndShapeRenderer.this.baseShapesVisible = flag;
		fireChangeEvent();
	}

	public boolean getDrawOutlines() {
		return org.jfree.chart.renderer.category.LineAndShapeRenderer.this.drawOutlines;
	}

	public void setDrawOutlines(boolean flag) {
		org.jfree.chart.renderer.category.LineAndShapeRenderer.this.drawOutlines = flag;
		fireChangeEvent();
	}

	public boolean getUseOutlinePaint() {
		return org.jfree.chart.renderer.category.LineAndShapeRenderer.this.useOutlinePaint;
	}

	public void setUseOutlinePaint(boolean use) {
		org.jfree.chart.renderer.category.LineAndShapeRenderer.this.useOutlinePaint = use;
		fireChangeEvent();
	}

	public boolean getItemShapeFilled(int series, int item) {
		java.lang.Boolean flag = getSeriesShapesFilled(series);
		if (flag != null) {
			return flag.booleanValue();
		}else {
			return org.jfree.chart.renderer.category.LineAndShapeRenderer.this.baseShapesFilled;
		}
	}

	public java.lang.Boolean getSeriesShapesFilled(int series) {
		return org.jfree.chart.renderer.category.LineAndShapeRenderer.this.seriesShapesFilled.getBoolean(series);
	}

	public void setSeriesShapesFilled(int series, java.lang.Boolean filled) {
		org.jfree.chart.renderer.category.LineAndShapeRenderer.this.seriesShapesFilled.setBoolean(series, filled);
		fireChangeEvent();
	}

	public void setSeriesShapesFilled(int series, boolean filled) {
		setSeriesShapesFilled(series, java.lang.Boolean.valueOf(filled));
	}

	public boolean getBaseShapesFilled() {
		return org.jfree.chart.renderer.category.LineAndShapeRenderer.this.baseShapesFilled;
	}

	public void setBaseShapesFilled(boolean flag) {
		org.jfree.chart.renderer.category.LineAndShapeRenderer.this.baseShapesFilled = flag;
		fireChangeEvent();
	}

	public boolean getUseFillPaint() {
		return org.jfree.chart.renderer.category.LineAndShapeRenderer.this.useFillPaint;
	}

	public void setUseFillPaint(boolean flag) {
		org.jfree.chart.renderer.category.LineAndShapeRenderer.this.useFillPaint = flag;
		fireChangeEvent();
	}

	public boolean getUseSeriesOffset() {
		return org.jfree.chart.renderer.category.LineAndShapeRenderer.this.useSeriesOffset;
	}

	public void setUseSeriesOffset(boolean offset) {
		org.jfree.chart.renderer.category.LineAndShapeRenderer.this.useSeriesOffset = offset;
		fireChangeEvent();
	}

	public double getItemMargin() {
		return org.jfree.chart.renderer.category.LineAndShapeRenderer.this.itemMargin;
	}

	public void setItemMargin(double margin) {
		if ((margin < 0.0) || (margin >= 1.0)) {
			throw new java.lang.IllegalArgumentException("Requires 0.0 <= margin < 1.0.");
		}
		org.jfree.chart.renderer.category.LineAndShapeRenderer.this.itemMargin = margin;
		fireChangeEvent();
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
			java.awt.Paint fillPaint = org.jfree.chart.renderer.category.LineAndShapeRenderer.this.useFillPaint ? getItemFillPaint(series, 0, false) : paint;
			boolean shapeOutlineVisible = org.jfree.chart.renderer.category.LineAndShapeRenderer.this.drawOutlines;
			java.awt.Paint outlinePaint = org.jfree.chart.renderer.category.LineAndShapeRenderer.this.useOutlinePaint ? getItemOutlinePaint(series, 0, false) : paint;
			java.awt.Stroke outlineStroke = lookupSeriesOutlineStroke(series);
			boolean lineVisible = getItemLineVisible(series, 0);
			boolean shapeVisible = getItemShapeVisible(series, 0);
			org.jfree.chart.LegendItem result = new org.jfree.chart.LegendItem(label, description, toolTipText, urlText, shapeVisible, shape, getItemShapeFilled(series, 0), fillPaint, shapeOutlineVisible, outlinePaint, outlineStroke, lineVisible, new java.awt.geom.Line2D.Double((-7.0), 0.0, 7.0, 0.0), getItemStroke(series, 0, false), getItemPaint(series, 0, false));
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

	public int getPassCount() {
		return 2;
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, boolean selected, int pass) {
		if (!(getItemVisible(row, column))) {
			return ;
		}
		if ((!(getItemLineVisible(row, column))) && (!(getItemShapeVisible(row, column)))) {
			return ;
		}
		java.lang.Number v = dataset.getValue(row, column);
		if (v == null) {
			return ;
		}
		int visibleRow = state.getVisibleSeriesIndex(row);
		if (visibleRow < 0) {
			return ;
		}
		int visibleRowCount = state.getVisibleSeriesCount();
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		double x1;
		if (org.jfree.chart.renderer.category.LineAndShapeRenderer.this.useSeriesOffset) {
			x1 = domainAxis.getCategorySeriesMiddle(column, dataset.getColumnCount(), visibleRow, visibleRowCount, org.jfree.chart.renderer.category.LineAndShapeRenderer.this.itemMargin, dataArea, plot.getDomainAxisEdge());
		}else {
			x1 = domainAxis.getCategoryMiddle(column, getColumnCount(), dataArea, plot.getDomainAxisEdge());
		}
		double value = v.doubleValue();
		double y1 = rangeAxis.valueToJava2D(value, dataArea, plot.getRangeAxisEdge());
		if ((pass == 0) && (getItemLineVisible(row, column))) {
			if (column != 0) {
				java.lang.Number previousValue = dataset.getValue(row, (column - 1));
				if (previousValue != null) {
					double previous = previousValue.doubleValue();
					double x0;
					if (org.jfree.chart.renderer.category.LineAndShapeRenderer.this.useSeriesOffset) {
						x0 = domainAxis.getCategorySeriesMiddle((column - 1), dataset.getColumnCount(), visibleRow, visibleRowCount, org.jfree.chart.renderer.category.LineAndShapeRenderer.this.itemMargin, dataArea, plot.getDomainAxisEdge());
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
			java.awt.Shape shape = getItemShape(row, column, selected);
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				shape = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape, y1, x1);
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					shape = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape, x1, y1);
				}
			
			if (getItemShapeVisible(row, column)) {
				if (getItemShapeFilled(row, column)) {
					if (org.jfree.chart.renderer.category.LineAndShapeRenderer.this.useFillPaint) {
						g2.setPaint(getItemFillPaint(row, column, selected));
					}else {
						g2.setPaint(getItemPaint(row, column, selected));
					}
					g2.fill(shape);
				}
				if (org.jfree.chart.renderer.category.LineAndShapeRenderer.this.drawOutlines) {
					if (org.jfree.chart.renderer.category.LineAndShapeRenderer.this.useOutlinePaint) {
						g2.setPaint(getItemOutlinePaint(row, column, selected));
					}else {
						g2.setPaint(getItemPaint(row, column, selected));
					}
					g2.setStroke(getItemOutlineStroke(row, column, selected));
					g2.draw(shape);
				}
			}
			if (isItemLabelVisible(row, column, selected)) {
				if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					drawItemLabel(g2, orientation, dataset, row, column, selected, y1, x1, (value < 0.0));
				}else
					if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
						drawItemLabel(g2, orientation, dataset, row, column, selected, x1, y1, (value < 0.0));
					}
				
			}
			int datasetIndex = plot.indexOf(dataset);
			updateCrosshairValues(state.getCrosshairState(), dataset.getRowKey(row), dataset.getColumnKey(column), value, datasetIndex, x1, y1, orientation);
			org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
			if (entities != null) {
				addEntity(entities, shape, dataset, row, column, selected);
			}
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.category.LineAndShapeRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.category.LineAndShapeRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.category.LineAndShapeRenderer that = ((org.jfree.chart.renderer.category.LineAndShapeRenderer) (obj));
		if ((org.jfree.chart.renderer.category.LineAndShapeRenderer.this.baseLinesVisible) != (that.baseLinesVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.category.LineAndShapeRenderer.this.seriesLinesVisible, that.seriesLinesVisible))) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.LineAndShapeRenderer.this.baseShapesVisible) != (that.baseShapesVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.category.LineAndShapeRenderer.this.seriesShapesVisible, that.seriesShapesVisible))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.category.LineAndShapeRenderer.this.seriesShapesFilled, that.seriesShapesFilled))) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.LineAndShapeRenderer.this.baseShapesFilled) != (that.baseShapesFilled)) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.LineAndShapeRenderer.this.useOutlinePaint) != (that.useOutlinePaint)) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.LineAndShapeRenderer.this.useSeriesOffset) != (that.useSeriesOffset)) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.LineAndShapeRenderer.this.itemMargin) != (that.itemMargin)) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.renderer.category.LineAndShapeRenderer clone = ((org.jfree.chart.renderer.category.LineAndShapeRenderer) (super.clone()));
		clone.seriesLinesVisible = ((org.jfree.chart.util.BooleanList) (org.jfree.chart.renderer.category.LineAndShapeRenderer.this.seriesLinesVisible.clone()));
		clone.seriesShapesVisible = ((org.jfree.chart.util.BooleanList) (org.jfree.chart.renderer.category.LineAndShapeRenderer.this.seriesShapesVisible.clone()));
		clone.seriesShapesFilled = ((org.jfree.chart.util.BooleanList) (org.jfree.chart.renderer.category.LineAndShapeRenderer.this.seriesShapesFilled.clone()));
		return clone;
	}
}




package org.jfree.chart.renderer.category;


public class AreaRenderer extends org.jfree.chart.renderer.category.AbstractCategoryItemRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -4231878281385812757L;

	private org.jfree.chart.renderer.AreaRendererEndType endType;

	public AreaRenderer() {
		super();
		org.jfree.chart.renderer.category.AreaRenderer.this.endType = org.jfree.chart.renderer.AreaRendererEndType.TAPER;
		setBaseLegendShape(new java.awt.geom.Rectangle2D.Double((-4.0), (-4.0), 8.0, 8.0));
	}

	public org.jfree.chart.renderer.AreaRendererEndType getEndType() {
		return org.jfree.chart.renderer.category.AreaRenderer.this.endType;
	}

	public void setEndType(org.jfree.chart.renderer.AreaRendererEndType type) {
		if (type == null) {
			throw new java.lang.IllegalArgumentException("Null 'type' argument.");
		}
		org.jfree.chart.renderer.category.AreaRenderer.this.endType = type;
		fireChangeEvent();
	}

	public org.jfree.chart.LegendItem getLegendItem(int datasetIndex, int series) {
		org.jfree.chart.plot.CategoryPlot cp = getPlot();
		if (cp == null) {
			return null;
		}
		if ((!(isSeriesVisible(series))) || (!(isSeriesVisibleInLegend(series)))) {
			return null;
		}
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
		java.awt.Paint outlinePaint = lookupSeriesOutlinePaint(series);
		java.awt.Stroke outlineStroke = lookupSeriesOutlineStroke(series);
		org.jfree.chart.LegendItem result = new org.jfree.chart.LegendItem(label, description, toolTipText, urlText, shape, paint, outlineStroke, outlinePaint);
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

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, int pass) {
		if (!(getItemVisible(row, column))) {
			return ;
		}
		java.lang.Number value = dataset.getValue(row, column);
		if (value != null) {
			org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
			org.jfree.chart.util.RectangleEdge axisEdge = plot.getDomainAxisEdge();
			int count = dataset.getColumnCount();
			float x0 = ((float) (domainAxis.getCategoryStart(column, count, dataArea, axisEdge)));
			float x1 = ((float) (domainAxis.getCategoryMiddle(column, count, dataArea, axisEdge)));
			float x2 = ((float) (domainAxis.getCategoryEnd(column, count, dataArea, axisEdge)));
			x0 = java.lang.Math.round(x0);
			x1 = java.lang.Math.round(x1);
			x2 = java.lang.Math.round(x2);
			if ((org.jfree.chart.renderer.category.AreaRenderer.this.endType) == (org.jfree.chart.renderer.AreaRendererEndType.TRUNCATE)) {
				if (column == 0) {
					x0 = x1;
				}else
					if (column == ((getColumnCount()) - 1)) {
						x2 = x1;
					}
				
			}
			double yy1 = value.doubleValue();
			double yy0 = 0.0;
			if (column > 0) {
				java.lang.Number n0 = dataset.getValue(row, (column - 1));
				if (n0 != null) {
					yy0 = ((n0.doubleValue()) + yy1) / 2.0;
				}
			}
			double yy2 = 0.0;
			if (column < ((dataset.getColumnCount()) - 1)) {
				java.lang.Number n2 = dataset.getValue(row, (column + 1));
				if (n2 != null) {
					yy2 = ((n2.doubleValue()) + yy1) / 2.0;
				}
			}
			org.jfree.chart.util.RectangleEdge edge = plot.getRangeAxisEdge();
			float y0 = ((float) (rangeAxis.valueToJava2D(yy0, dataArea, edge)));
			float y1 = ((float) (rangeAxis.valueToJava2D(yy1, dataArea, edge)));
			float y2 = ((float) (rangeAxis.valueToJava2D(yy2, dataArea, edge)));
			float yz = ((float) (rangeAxis.valueToJava2D(0.0, dataArea, edge)));
			g2.setPaint(getItemPaint(row, column));
			g2.setStroke(getItemStroke(row, column));
			java.awt.geom.GeneralPath area = new java.awt.geom.GeneralPath();
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				area.moveTo(x0, yz);
				area.lineTo(x0, y0);
				area.lineTo(x1, y1);
				area.lineTo(x2, y2);
				area.lineTo(x2, yz);
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					area.moveTo(yz, x0);
					area.lineTo(y0, x0);
					area.lineTo(y1, x1);
					area.lineTo(y2, x2);
					area.lineTo(yz, x2);
				}
			
			area.closePath();
			g2.setPaint(getItemPaint(row, column));
			g2.fill(area);
			if (isItemLabelVisible(row, column)) {
				drawItemLabel(g2, orientation, dataset, row, column, x1, y1, ((value.doubleValue()) < 0.0));
			}
			int datasetIndex = plot.indexOf(dataset);
			updateCrosshairValues(state.getCrosshairState(), dataset.getRowKey(row), dataset.getColumnKey(column), yy1, datasetIndex, x1, y1, orientation);
			org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
			if (entities != null) {
				addItemEntity(entities, dataset, row, column, area);
			}
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.category.AreaRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.category.AreaRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.category.AreaRenderer that = ((org.jfree.chart.renderer.category.AreaRenderer) (obj));
		if (!(org.jfree.chart.renderer.category.AreaRenderer.this.endType.equals(that.endType))) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}


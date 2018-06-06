

package org.jfree.chart.renderer.category;


public class CategoryStepRenderer extends org.jfree.chart.renderer.category.AbstractCategoryItemRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	protected static class State extends org.jfree.chart.renderer.category.CategoryItemRendererState {
		public java.awt.geom.Line2D line;

		public State(org.jfree.chart.plot.PlotRenderingInfo info) {
			super(info);
			org.jfree.chart.renderer.category.CategoryStepRenderer.State.this.line = new java.awt.geom.Line2D.Double();
		}
	}

	private static final long serialVersionUID = -5121079703118261470L;

	public static final int STAGGER_WIDTH = 5;

	private boolean stagger = false;

	public CategoryStepRenderer() {
		this(false);
	}

	public CategoryStepRenderer(boolean stagger) {
		org.jfree.chart.renderer.category.CategoryStepRenderer.this.stagger = stagger;
	}

	public boolean getStagger() {
		return org.jfree.chart.renderer.category.CategoryStepRenderer.this.stagger;
	}

	public void setStagger(boolean shouldStagger) {
		org.jfree.chart.renderer.category.CategoryStepRenderer.this.stagger = shouldStagger;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.category.CategoryStepRenderer.this));
	}

	public org.jfree.chart.LegendItem getLegendItem(int datasetIndex, int series) {
		org.jfree.chart.plot.CategoryPlot p = getPlot();
		if (p == null) {
			return null;
		}
		if ((!(isSeriesVisible(series))) || (!(isSeriesVisibleInLegend(series)))) {
			return null;
		}
		org.jfree.data.category.CategoryDataset dataset = p.getDataset(datasetIndex);
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
		java.awt.Shape shape = new java.awt.geom.Rectangle2D.Double((-4.0), (-3.0), 8.0, 6.0);
		java.awt.Paint paint = lookupSeriesPaint(series);
		org.jfree.chart.LegendItem item = new org.jfree.chart.LegendItem(label, description, toolTipText, urlText, shape, paint);
		item.setSeriesKey(dataset.getRowKey(series));
		item.setSeriesIndex(series);
		item.setDataset(dataset);
		item.setDatasetIndex(datasetIndex);
		return item;
	}

	protected org.jfree.chart.renderer.category.CategoryItemRendererState createState(org.jfree.chart.plot.PlotRenderingInfo info) {
		return new org.jfree.chart.renderer.category.CategoryStepRenderer.State(info);
	}

	protected void drawLine(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryStepRenderer.State state, org.jfree.chart.plot.PlotOrientation orientation, double x0, double y0, double x1, double y1) {
		if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
			state.line.setLine(x0, y0, x1, y1);
			g2.draw(state.line);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				state.line.setLine(y0, x0, y1, x1);
				g2.draw(state.line);
			}
		
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, int pass) {
		if (!(getItemVisible(row, column))) {
			return ;
		}
		java.lang.Number value = dataset.getValue(row, column);
		if (value == null) {
			return ;
		}
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		double x1s = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, plot.getDomainAxisEdge());
		double x1 = domainAxis.getCategoryMiddle(column, getColumnCount(), dataArea, plot.getDomainAxisEdge());
		double x1e = (2 * x1) - x1s;
		double y1 = rangeAxis.valueToJava2D(value.doubleValue(), dataArea, plot.getRangeAxisEdge());
		g2.setPaint(getItemPaint(row, column));
		g2.setStroke(getItemStroke(row, column));
		if (column != 0) {
			java.lang.Number previousValue = dataset.getValue(row, (column - 1));
			if (previousValue != null) {
				double previous = previousValue.doubleValue();
				double x0s = domainAxis.getCategoryStart((column - 1), getColumnCount(), dataArea, plot.getDomainAxisEdge());
				double x0 = domainAxis.getCategoryMiddle((column - 1), getColumnCount(), dataArea, plot.getDomainAxisEdge());
				double x0e = (2 * x0) - x0s;
				double y0 = rangeAxis.valueToJava2D(previous, dataArea, plot.getRangeAxisEdge());
				if (getStagger()) {
					int xStagger = row * (org.jfree.chart.renderer.category.CategoryStepRenderer.STAGGER_WIDTH);
					if (xStagger > (x1s - x0e)) {
						xStagger = ((int) (x1s - x0e));
					}
					x1s = x0e + xStagger;
				}
				drawLine(g2, ((org.jfree.chart.renderer.category.CategoryStepRenderer.State) (state)), orientation, x0e, y0, x1s, y0);
				drawLine(g2, ((org.jfree.chart.renderer.category.CategoryStepRenderer.State) (state)), orientation, x1s, y0, x1s, y1);
			}
		}
		drawLine(g2, ((org.jfree.chart.renderer.category.CategoryStepRenderer.State) (state)), orientation, x1s, y1, x1e, y1);
		if (isItemLabelVisible(row, column)) {
			drawItemLabel(g2, orientation, dataset, row, column, x1, y1, ((value.doubleValue()) < 0.0));
		}
		org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
		if (entities != null) {
			java.awt.geom.Rectangle2D hotspot = new java.awt.geom.Rectangle2D.Double();
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				hotspot.setRect(x1s, y1, (x1e - x1s), 4.0);
			}else {
				hotspot.setRect((y1 - 2.0), x1s, 4.0, (x1e - x1s));
			}
			addItemEntity(entities, dataset, row, column, hotspot);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.category.CategoryStepRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.category.CategoryStepRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.category.CategoryStepRenderer that = ((org.jfree.chart.renderer.category.CategoryStepRenderer) (obj));
		if ((org.jfree.chart.renderer.category.CategoryStepRenderer.this.stagger) != (that.stagger)) {
			return false;
		}
		return super.equals(obj);
	}
}




package org.jfree.chart.renderer.category;


public class StackedBarRenderer extends org.jfree.chart.renderer.category.BarRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	static final long serialVersionUID = 6402943811500067531L;

	private boolean renderAsPercentages;

	public StackedBarRenderer() {
		this(false);
	}

	public StackedBarRenderer(boolean renderAsPercentages) {
		super();
		org.jfree.chart.renderer.category.StackedBarRenderer.this.renderAsPercentages = renderAsPercentages;
		org.jfree.chart.labels.ItemLabelPosition p = new org.jfree.chart.labels.ItemLabelPosition(org.jfree.chart.labels.ItemLabelAnchor.CENTER, org.jfree.chart.text.TextAnchor.CENTER);
		setBasePositiveItemLabelPosition(p);
		setBaseNegativeItemLabelPosition(p);
		setPositiveItemLabelPositionFallback(null);
		setNegativeItemLabelPositionFallback(null);
	}

	public boolean getRenderAsPercentages() {
		return org.jfree.chart.renderer.category.StackedBarRenderer.this.renderAsPercentages;
	}

	public void setRenderAsPercentages(boolean asPercentages) {
		org.jfree.chart.renderer.category.StackedBarRenderer.this.renderAsPercentages = asPercentages;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.category.StackedBarRenderer.this));
	}

	public int getPassCount() {
		return 2;
	}

	public org.jfree.data.Range findRangeBounds(org.jfree.data.category.CategoryDataset dataset) {
		if (org.jfree.chart.renderer.category.StackedBarRenderer.this.renderAsPercentages) {
			return new org.jfree.data.Range(0.0, 1.0);
		}else {
			return org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(dataset, getBase());
		}
	}

	protected void calculateBarWidth(org.jfree.chart.plot.CategoryPlot plot, java.awt.geom.Rectangle2D dataArea, int rendererIndex, org.jfree.chart.renderer.category.CategoryItemRendererState state) {
		org.jfree.chart.axis.CategoryAxis xAxis = plot.getDomainAxisForDataset(rendererIndex);
		org.jfree.data.category.CategoryDataset data = plot.getDataset(rendererIndex);
		if (data != null) {
			org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
			double space = 0.0;
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				space = dataArea.getHeight();
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					space = dataArea.getWidth();
				}
			
			double maxWidth = space * (getMaximumBarWidth());
			int columns = data.getColumnCount();
			double categoryMargin = 0.0;
			if (columns > 1) {
				categoryMargin = xAxis.getCategoryMargin();
			}
			double used = space * (((1 - (xAxis.getLowerMargin())) - (xAxis.getUpperMargin())) - categoryMargin);
			if (columns > 0) {
				state.setBarWidth(java.lang.Math.min((used / columns), maxWidth));
			}else {
				state.setBarWidth(java.lang.Math.min(used, maxWidth));
			}
		}
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, int pass) {
		java.lang.Number dataValue = dataset.getValue(row, column);
		if (dataValue == null) {
			return ;
		}
		double value = dataValue.doubleValue();
		double total = 0.0;
		if (org.jfree.chart.renderer.category.StackedBarRenderer.this.renderAsPercentages) {
			total = org.jfree.data.DataUtilities.calculateColumnTotal(dataset, column);
			value = value / total;
		}
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		double barW0 = (domainAxis.getCategoryMiddle(column, getColumnCount(), dataArea, plot.getDomainAxisEdge())) - ((state.getBarWidth()) / 2.0);
		double positiveBase = getBase();
		double negativeBase = positiveBase;
		for (int i = 0; i < row; i++) {
			java.lang.Number v = dataset.getValue(i, column);
			if (v != null) {
				double d = v.doubleValue();
				if (org.jfree.chart.renderer.category.StackedBarRenderer.this.renderAsPercentages) {
					d = d / total;
				}
				if (d > 0) {
					positiveBase = positiveBase + d;
				}else {
					negativeBase = negativeBase + d;
				}
			}
		}
		double translatedBase;
		double translatedValue;
		org.jfree.chart.util.RectangleEdge location = plot.getRangeAxisEdge();
		if (value >= 0.0) {
			translatedBase = rangeAxis.valueToJava2D(positiveBase, dataArea, location);
			translatedValue = rangeAxis.valueToJava2D((positiveBase + value), dataArea, location);
		}else {
			translatedBase = rangeAxis.valueToJava2D(negativeBase, dataArea, location);
			translatedValue = rangeAxis.valueToJava2D((negativeBase + value), dataArea, location);
		}
		double barL0 = java.lang.Math.min(translatedBase, translatedValue);
		double barLength = java.lang.Math.max(java.lang.Math.abs((translatedValue - translatedBase)), getMinimumBarLength());
		java.awt.geom.Rectangle2D bar = null;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			bar = new java.awt.geom.Rectangle2D.Double(barL0, barW0, barLength, state.getBarWidth());
		}else {
			bar = new java.awt.geom.Rectangle2D.Double(barW0, barL0, state.getBarWidth(), barLength);
		}
		if (pass == 0) {
			java.awt.Paint itemPaint = getItemPaint(row, column);
			org.jfree.chart.util.GradientPaintTransformer t = getGradientPaintTransformer();
			if ((t != null) && (itemPaint instanceof java.awt.GradientPaint)) {
				itemPaint = t.transform(((java.awt.GradientPaint) (itemPaint)), bar);
			}
			g2.setPaint(itemPaint);
			g2.fill(bar);
			if ((isDrawBarOutline()) && ((state.getBarWidth()) > (org.jfree.chart.renderer.category.BarRenderer.BAR_OUTLINE_WIDTH_THRESHOLD))) {
				g2.setStroke(getItemOutlineStroke(row, column));
				g2.setPaint(getItemOutlinePaint(row, column));
				g2.draw(bar);
			}
			org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
			if (entities != null) {
				addItemEntity(entities, dataset, row, column, bar);
			}
		}else
			if (pass == 1) {
				org.jfree.chart.labels.CategoryItemLabelGenerator generator = getItemLabelGenerator(row, column);
				if ((generator != null) && (isItemLabelVisible(row, column))) {
					drawItemLabel(g2, dataset, row, column, plot, generator, bar, (value < 0.0));
				}
			}
		
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.category.StackedBarRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.category.StackedBarRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.category.StackedBarRenderer that = ((org.jfree.chart.renderer.category.StackedBarRenderer) (obj));
		if ((org.jfree.chart.renderer.category.StackedBarRenderer.this.renderAsPercentages) != (that.renderAsPercentages)) {
			return false;
		}
		return super.equals(obj);
	}
}


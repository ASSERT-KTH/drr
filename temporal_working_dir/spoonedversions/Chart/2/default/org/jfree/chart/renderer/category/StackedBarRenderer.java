

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
		fireChangeEvent();
	}

	public int getPassCount() {
		return 3;
	}

	public org.jfree.data.Range findRangeBounds(org.jfree.data.category.CategoryDataset dataset) {
		if (dataset == null) {
			return null;
		}
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

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, boolean selected, int pass) {
		if (!(isSeriesVisible(row))) {
			return ;
		}
		java.lang.Number dataValue = dataset.getValue(row, column);
		if (dataValue == null) {
			return ;
		}
		double value = dataValue.doubleValue();
		double total = 0.0;
		if (org.jfree.chart.renderer.category.StackedBarRenderer.this.renderAsPercentages) {
			total = org.jfree.data.DataUtilities.calculateColumnTotal(dataset, column, state.getVisibleSeriesArray());
			value = value / total;
		}
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		double barW0 = (domainAxis.getCategoryMiddle(column, getColumnCount(), dataArea, plot.getDomainAxisEdge())) - ((state.getBarWidth()) / 2.0);
		double positiveBase = getBase();
		double negativeBase = positiveBase;
		for (int i = 0; i < row; i++) {
			java.lang.Number v = dataset.getValue(i, column);
			if ((v != null) && (isSeriesVisible(i))) {
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
		boolean positive = value > 0.0;
		boolean inverted = rangeAxis.isInverted();
		org.jfree.chart.util.RectangleEdge barBase;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			if ((positive && inverted) || ((!positive) && (!inverted))) {
				barBase = org.jfree.chart.util.RectangleEdge.RIGHT;
			}else {
				barBase = org.jfree.chart.util.RectangleEdge.LEFT;
			}
		}else {
			if ((positive && (!inverted)) || ((!positive) && inverted)) {
				barBase = org.jfree.chart.util.RectangleEdge.BOTTOM;
			}else {
				barBase = org.jfree.chart.util.RectangleEdge.TOP;
			}
		}
		org.jfree.chart.util.RectangleEdge location = plot.getRangeAxisEdge();
		if (positive) {
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
			if (getShadowsVisible()) {
				boolean pegToBase = (positive && (positiveBase == (getBase()))) || ((!positive) && (negativeBase == (getBase())));
				getBarPainter().paintBarShadow(g2, org.jfree.chart.renderer.category.StackedBarRenderer.this, row, column, selected, bar, barBase, pegToBase);
			}
		}else
			if (pass == 1) {
				getBarPainter().paintBar(g2, org.jfree.chart.renderer.category.StackedBarRenderer.this, row, column, selected, bar, barBase);
				org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
				if (entities != null) {
					addEntity(entities, bar, dataset, row, column, selected);
				}
			}else
				if (pass == 2) {
					org.jfree.chart.labels.CategoryItemLabelGenerator generator = getItemLabelGenerator(row, column, selected);
					if ((generator != null) && (isItemLabelVisible(row, column, selected))) {
						drawItemLabelForBar(g2, plot, dataset, row, column, selected, generator, bar, (value < 0.0));
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


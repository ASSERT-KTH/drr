

package org.jfree.chart.renderer.category;


public class GroupedStackedBarRenderer extends org.jfree.chart.renderer.category.StackedBarRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -2725921399005922939L;

	private org.jfree.data.KeyToGroupMap seriesToGroupMap;

	public GroupedStackedBarRenderer() {
		super();
		org.jfree.chart.renderer.category.GroupedStackedBarRenderer.this.seriesToGroupMap = new org.jfree.data.KeyToGroupMap();
	}

	public void setSeriesToGroupMap(org.jfree.data.KeyToGroupMap map) {
		if (map == null) {
			throw new java.lang.IllegalArgumentException("Null 'map' argument.");
		}
		org.jfree.chart.renderer.category.GroupedStackedBarRenderer.this.seriesToGroupMap = map;
		fireChangeEvent();
	}

	public org.jfree.data.Range findRangeBounds(org.jfree.data.category.CategoryDataset dataset) {
		org.jfree.data.Range r = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(dataset, org.jfree.chart.renderer.category.GroupedStackedBarRenderer.this.seriesToGroupMap);
		return r;
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
			int groups = org.jfree.chart.renderer.category.GroupedStackedBarRenderer.this.seriesToGroupMap.getGroupCount();
			int categories = data.getColumnCount();
			int columns = groups * categories;
			double categoryMargin = 0.0;
			double itemMargin = 0.0;
			if (categories > 1) {
				categoryMargin = xAxis.getCategoryMargin();
			}
			if (groups > 1) {
				itemMargin = getItemMargin();
			}
			double used = space * ((((1 - (xAxis.getLowerMargin())) - (xAxis.getUpperMargin())) - categoryMargin) - itemMargin);
			if (columns > 0) {
				state.setBarWidth(java.lang.Math.min((used / columns), maxWidth));
			}else {
				state.setBarWidth(java.lang.Math.min(used, maxWidth));
			}
		}
	}

	protected double calculateBarW0(org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.plot.PlotOrientation orientation, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.renderer.category.CategoryItemRendererState state, int row, int column) {
		double space = 0.0;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			space = dataArea.getHeight();
		}else {
			space = dataArea.getWidth();
		}
		double barW0 = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, plot.getDomainAxisEdge());
		int groupCount = org.jfree.chart.renderer.category.GroupedStackedBarRenderer.this.seriesToGroupMap.getGroupCount();
		int groupIndex = org.jfree.chart.renderer.category.GroupedStackedBarRenderer.this.seriesToGroupMap.getGroupIndex(org.jfree.chart.renderer.category.GroupedStackedBarRenderer.this.seriesToGroupMap.getGroup(plot.getDataset(plot.getIndexOf(org.jfree.chart.renderer.category.GroupedStackedBarRenderer.this)).getRowKey(row)));
		int categoryCount = getColumnCount();
		if (groupCount > 1) {
			double groupGap = (space * (getItemMargin())) / (categoryCount * (groupCount - 1));
			double groupW = calculateSeriesWidth(space, domainAxis, categoryCount, groupCount);
			barW0 = ((barW0 + (groupIndex * (groupW + groupGap))) + (groupW / 2.0)) - ((state.getBarWidth()) / 2.0);
		}else {
			barW0 = (domainAxis.getCategoryMiddle(column, getColumnCount(), dataArea, plot.getDomainAxisEdge())) - ((state.getBarWidth()) / 2.0);
		}
		return barW0;
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, int pass) {
		java.lang.Number dataValue = dataset.getValue(row, column);
		if (dataValue == null) {
			return ;
		}
		double value = dataValue.doubleValue();
		java.lang.Comparable group = org.jfree.chart.renderer.category.GroupedStackedBarRenderer.this.seriesToGroupMap.getGroup(dataset.getRowKey(row));
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		double barW0 = calculateBarW0(plot, orientation, dataArea, domainAxis, state, row, column);
		double positiveBase = 0.0;
		double negativeBase = 0.0;
		for (int i = 0; i < row; i++) {
			if (group.equals(org.jfree.chart.renderer.category.GroupedStackedBarRenderer.this.seriesToGroupMap.getGroup(dataset.getRowKey(i)))) {
				java.lang.Number v = dataset.getValue(i, column);
				if (v != null) {
					double d = v.doubleValue();
					if (d > 0) {
						positiveBase = positiveBase + d;
					}else {
						negativeBase = negativeBase + d;
					}
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
		if (value > 0.0) {
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
		getBarPainter().paintBar(g2, org.jfree.chart.renderer.category.GroupedStackedBarRenderer.this, row, column, bar, barBase);
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
		if (obj == (org.jfree.chart.renderer.category.GroupedStackedBarRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.category.GroupedStackedBarRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.category.GroupedStackedBarRenderer that = ((org.jfree.chart.renderer.category.GroupedStackedBarRenderer) (obj));
		if (!(org.jfree.chart.renderer.category.GroupedStackedBarRenderer.this.seriesToGroupMap.equals(that.seriesToGroupMap))) {
			return false;
		}
		return super.equals(obj);
	}
}


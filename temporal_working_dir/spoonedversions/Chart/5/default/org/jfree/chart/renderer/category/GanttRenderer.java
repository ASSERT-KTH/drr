

package org.jfree.chart.renderer.category;


public class GanttRenderer extends org.jfree.chart.renderer.category.IntervalBarRenderer implements java.io.Serializable {
	private static final long serialVersionUID = -4010349116350119512L;

	private transient java.awt.Paint completePaint;

	private transient java.awt.Paint incompletePaint;

	private double startPercent;

	private double endPercent;

	public GanttRenderer() {
		super();
		setIncludeBaseInRange(false);
		org.jfree.chart.renderer.category.GanttRenderer.this.completePaint = java.awt.Color.green;
		org.jfree.chart.renderer.category.GanttRenderer.this.incompletePaint = java.awt.Color.red;
		org.jfree.chart.renderer.category.GanttRenderer.this.startPercent = 0.35;
		org.jfree.chart.renderer.category.GanttRenderer.this.endPercent = 0.65;
	}

	public java.awt.Paint getCompletePaint() {
		return org.jfree.chart.renderer.category.GanttRenderer.this.completePaint;
	}

	public void setCompletePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.renderer.category.GanttRenderer.this.completePaint = paint;
		fireChangeEvent();
	}

	public java.awt.Paint getIncompletePaint() {
		return org.jfree.chart.renderer.category.GanttRenderer.this.incompletePaint;
	}

	public void setIncompletePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.renderer.category.GanttRenderer.this.incompletePaint = paint;
		fireChangeEvent();
	}

	public double getStartPercent() {
		return org.jfree.chart.renderer.category.GanttRenderer.this.startPercent;
	}

	public void setStartPercent(double percent) {
		org.jfree.chart.renderer.category.GanttRenderer.this.startPercent = percent;
		fireChangeEvent();
	}

	public double getEndPercent() {
		return org.jfree.chart.renderer.category.GanttRenderer.this.endPercent;
	}

	public void setEndPercent(double percent) {
		org.jfree.chart.renderer.category.GanttRenderer.this.endPercent = percent;
		fireChangeEvent();
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, int pass) {
		if (dataset instanceof org.jfree.data.gantt.GanttCategoryDataset) {
			org.jfree.data.gantt.GanttCategoryDataset gcd = ((org.jfree.data.gantt.GanttCategoryDataset) (dataset));
			drawTasks(g2, state, dataArea, plot, domainAxis, rangeAxis, gcd, row, column);
		}else {
			super.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, row, column, pass);
		}
	}

	protected void drawTasks(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.gantt.GanttCategoryDataset dataset, int row, int column) {
		int count = dataset.getSubIntervalCount(row, column);
		if (count == 0) {
			drawTask(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, row, column);
		}
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		for (int subinterval = 0; subinterval < count; subinterval++) {
			org.jfree.chart.util.RectangleEdge rangeAxisLocation = plot.getRangeAxisEdge();
			java.lang.Number value0 = dataset.getStartValue(row, column, subinterval);
			if (value0 == null) {
				return ;
			}
			double translatedValue0 = rangeAxis.valueToJava2D(value0.doubleValue(), dataArea, rangeAxisLocation);
			java.lang.Number value1 = dataset.getEndValue(row, column, subinterval);
			if (value1 == null) {
				return ;
			}
			double translatedValue1 = rangeAxis.valueToJava2D(value1.doubleValue(), dataArea, rangeAxisLocation);
			if (translatedValue1 < translatedValue0) {
				double temp = translatedValue1;
				translatedValue1 = translatedValue0;
				translatedValue0 = temp;
			}
			double rectStart = calculateBarW0(plot, plot.getOrientation(), dataArea, domainAxis, state, row, column);
			double rectLength = java.lang.Math.abs((translatedValue1 - translatedValue0));
			double rectBreadth = state.getBarWidth();
			java.awt.geom.Rectangle2D bar = null;
			org.jfree.chart.util.RectangleEdge barBase = null;
			if ((plot.getOrientation()) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				bar = new java.awt.geom.Rectangle2D.Double(translatedValue0, rectStart, rectLength, rectBreadth);
				barBase = org.jfree.chart.util.RectangleEdge.LEFT;
			}else
				if ((plot.getOrientation()) == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					bar = new java.awt.geom.Rectangle2D.Double(rectStart, translatedValue0, rectBreadth, rectLength);
					barBase = org.jfree.chart.util.RectangleEdge.BOTTOM;
				}
			
			java.awt.geom.Rectangle2D completeBar = null;
			java.awt.geom.Rectangle2D incompleteBar = null;
			java.lang.Number percent = dataset.getPercentComplete(row, column, subinterval);
			double start = getStartPercent();
			double end = getEndPercent();
			if (percent != null) {
				double p = percent.doubleValue();
				if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					completeBar = new java.awt.geom.Rectangle2D.Double(translatedValue0, (rectStart + (start * rectBreadth)), (rectLength * p), (rectBreadth * (end - start)));
					incompleteBar = new java.awt.geom.Rectangle2D.Double((translatedValue0 + (rectLength * p)), (rectStart + (start * rectBreadth)), (rectLength * (1 - p)), (rectBreadth * (end - start)));
				}else
					if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
						completeBar = new java.awt.geom.Rectangle2D.Double((rectStart + (start * rectBreadth)), (translatedValue0 + (rectLength * (1 - p))), (rectBreadth * (end - start)), (rectLength * p));
						incompleteBar = new java.awt.geom.Rectangle2D.Double((rectStart + (start * rectBreadth)), translatedValue0, (rectBreadth * (end - start)), (rectLength * (1 - p)));
					}
				
			}
			if (getShadowsVisible()) {
				getBarPainter().paintBarShadow(g2, org.jfree.chart.renderer.category.GanttRenderer.this, row, column, bar, barBase, true);
			}
			getBarPainter().paintBar(g2, org.jfree.chart.renderer.category.GanttRenderer.this, row, column, bar, barBase);
			if (completeBar != null) {
				g2.setPaint(getCompletePaint());
				g2.fill(completeBar);
			}
			if (incompleteBar != null) {
				g2.setPaint(getIncompletePaint());
				g2.fill(incompleteBar);
			}
			if ((isDrawBarOutline()) && ((state.getBarWidth()) > (org.jfree.chart.renderer.category.BarRenderer.BAR_OUTLINE_WIDTH_THRESHOLD))) {
				g2.setStroke(getItemStroke(row, column));
				g2.setPaint(getItemOutlinePaint(row, column));
				g2.draw(bar);
			}
			if (subinterval == (count - 1)) {
				int datasetIndex = plot.indexOf(dataset);
				java.lang.Comparable columnKey = dataset.getColumnKey(column);
				java.lang.Comparable rowKey = dataset.getRowKey(row);
				double xx = domainAxis.getCategorySeriesMiddle(columnKey, rowKey, dataset, getItemMargin(), dataArea, plot.getDomainAxisEdge());
				updateCrosshairValues(state.getCrosshairState(), dataset.getRowKey(row), dataset.getColumnKey(column), value1.doubleValue(), datasetIndex, xx, translatedValue1, orientation);
			}
			if ((state.getInfo()) != null) {
				org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
				if (entities != null) {
					addItemEntity(entities, dataset, row, column, bar);
				}
			}
		}
	}

	protected void drawTask(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.gantt.GanttCategoryDataset dataset, int row, int column) {
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		org.jfree.chart.util.RectangleEdge rangeAxisLocation = plot.getRangeAxisEdge();
		java.lang.Number value0 = dataset.getEndValue(row, column);
		if (value0 == null) {
			return ;
		}
		double java2dValue0 = rangeAxis.valueToJava2D(value0.doubleValue(), dataArea, rangeAxisLocation);
		java.lang.Number value1 = dataset.getStartValue(row, column);
		if (value1 == null) {
			return ;
		}
		double java2dValue1 = rangeAxis.valueToJava2D(value1.doubleValue(), dataArea, rangeAxisLocation);
		if (java2dValue1 < java2dValue0) {
			double temp = java2dValue1;
			java2dValue1 = java2dValue0;
			java2dValue0 = temp;
			java.lang.Number tempNum = value1;
			value1 = value0;
			value0 = tempNum;
		}
		double rectStart = calculateBarW0(plot, orientation, dataArea, domainAxis, state, row, column);
		double rectBreadth = state.getBarWidth();
		double rectLength = java.lang.Math.abs((java2dValue1 - java2dValue0));
		java.awt.geom.Rectangle2D bar = null;
		org.jfree.chart.util.RectangleEdge barBase = null;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			bar = new java.awt.geom.Rectangle2D.Double(java2dValue0, rectStart, rectLength, rectBreadth);
			barBase = org.jfree.chart.util.RectangleEdge.LEFT;
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				bar = new java.awt.geom.Rectangle2D.Double(rectStart, java2dValue1, rectBreadth, rectLength);
				barBase = org.jfree.chart.util.RectangleEdge.BOTTOM;
			}
		
		java.awt.geom.Rectangle2D completeBar = null;
		java.awt.geom.Rectangle2D incompleteBar = null;
		java.lang.Number percent = dataset.getPercentComplete(row, column);
		double start = getStartPercent();
		double end = getEndPercent();
		if (percent != null) {
			double p = percent.doubleValue();
			if ((plot.getOrientation()) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				completeBar = new java.awt.geom.Rectangle2D.Double(java2dValue0, (rectStart + (start * rectBreadth)), (rectLength * p), (rectBreadth * (end - start)));
				incompleteBar = new java.awt.geom.Rectangle2D.Double((java2dValue0 + (rectLength * p)), (rectStart + (start * rectBreadth)), (rectLength * (1 - p)), (rectBreadth * (end - start)));
			}else
				if ((plot.getOrientation()) == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					completeBar = new java.awt.geom.Rectangle2D.Double((rectStart + (start * rectBreadth)), (java2dValue1 + (rectLength * (1 - p))), (rectBreadth * (end - start)), (rectLength * p));
					incompleteBar = new java.awt.geom.Rectangle2D.Double((rectStart + (start * rectBreadth)), java2dValue1, (rectBreadth * (end - start)), (rectLength * (1 - p)));
				}
			
		}
		if (getShadowsVisible()) {
			getBarPainter().paintBarShadow(g2, org.jfree.chart.renderer.category.GanttRenderer.this, row, column, bar, barBase, true);
		}
		getBarPainter().paintBar(g2, org.jfree.chart.renderer.category.GanttRenderer.this, row, column, bar, barBase);
		if (completeBar != null) {
			g2.setPaint(getCompletePaint());
			g2.fill(completeBar);
		}
		if (incompleteBar != null) {
			g2.setPaint(getIncompletePaint());
			g2.fill(incompleteBar);
		}
		if ((isDrawBarOutline()) && ((state.getBarWidth()) > (org.jfree.chart.renderer.category.BarRenderer.BAR_OUTLINE_WIDTH_THRESHOLD))) {
			java.awt.Stroke stroke = getItemOutlineStroke(row, column);
			java.awt.Paint paint = getItemOutlinePaint(row, column);
			if ((stroke != null) && (paint != null)) {
				g2.setStroke(stroke);
				g2.setPaint(paint);
				g2.draw(bar);
			}
		}
		org.jfree.chart.labels.CategoryItemLabelGenerator generator = getItemLabelGenerator(row, column);
		if ((generator != null) && (isItemLabelVisible(row, column))) {
			drawItemLabel(g2, dataset, row, column, plot, generator, bar, false);
		}
		int datasetIndex = plot.indexOf(dataset);
		java.lang.Comparable columnKey = dataset.getColumnKey(column);
		java.lang.Comparable rowKey = dataset.getRowKey(row);
		double xx = domainAxis.getCategorySeriesMiddle(columnKey, rowKey, dataset, getItemMargin(), dataArea, plot.getDomainAxisEdge());
		updateCrosshairValues(state.getCrosshairState(), dataset.getRowKey(row), dataset.getColumnKey(column), value1.doubleValue(), datasetIndex, xx, java2dValue1, orientation);
		org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
		if (entities != null) {
			addItemEntity(entities, dataset, row, column, bar);
		}
	}

	public double getItemMiddle(java.lang.Comparable rowKey, java.lang.Comparable columnKey, org.jfree.data.category.CategoryDataset dataset, org.jfree.chart.axis.CategoryAxis axis, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge) {
		return axis.getCategorySeriesMiddle(columnKey, rowKey, dataset, getItemMargin(), area, edge);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.category.GanttRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.category.GanttRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.category.GanttRenderer that = ((org.jfree.chart.renderer.category.GanttRenderer) (obj));
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.category.GanttRenderer.this.completePaint, that.completePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.category.GanttRenderer.this.incompletePaint, that.incompletePaint))) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.GanttRenderer.this.startPercent) != (that.startPercent)) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.GanttRenderer.this.endPercent) != (that.endPercent)) {
			return false;
		}
		return super.equals(obj);
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.category.GanttRenderer.this.completePaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.category.GanttRenderer.this.incompletePaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.category.GanttRenderer.this.completePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.renderer.category.GanttRenderer.this.incompletePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}


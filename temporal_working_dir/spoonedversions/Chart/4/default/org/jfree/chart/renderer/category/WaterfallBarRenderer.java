

package org.jfree.chart.renderer.category;


public class WaterfallBarRenderer extends org.jfree.chart.renderer.category.BarRenderer {
	private static final long serialVersionUID = -2482910643727230911L;

	private transient java.awt.Paint firstBarPaint;

	private transient java.awt.Paint lastBarPaint;

	private transient java.awt.Paint positiveBarPaint;

	private transient java.awt.Paint negativeBarPaint;

	public WaterfallBarRenderer() {
		this(new java.awt.GradientPaint(0.0F, 0.0F, new java.awt.Color(34, 34, 255), 0.0F, 0.0F, new java.awt.Color(102, 102, 255)), new java.awt.GradientPaint(0.0F, 0.0F, new java.awt.Color(34, 255, 34), 0.0F, 0.0F, new java.awt.Color(102, 255, 102)), new java.awt.GradientPaint(0.0F, 0.0F, new java.awt.Color(255, 34, 34), 0.0F, 0.0F, new java.awt.Color(255, 102, 102)), new java.awt.GradientPaint(0.0F, 0.0F, new java.awt.Color(255, 255, 34), 0.0F, 0.0F, new java.awt.Color(255, 255, 102)));
	}

	public WaterfallBarRenderer(java.awt.Paint firstBarPaint, java.awt.Paint positiveBarPaint, java.awt.Paint negativeBarPaint, java.awt.Paint lastBarPaint) {
		super();
		if (firstBarPaint == null) {
			throw new java.lang.IllegalArgumentException("Null 'firstBarPaint' argument");
		}
		if (positiveBarPaint == null) {
			throw new java.lang.IllegalArgumentException("Null 'positiveBarPaint' argument");
		}
		if (negativeBarPaint == null) {
			throw new java.lang.IllegalArgumentException("Null 'negativeBarPaint' argument");
		}
		if (lastBarPaint == null) {
			throw new java.lang.IllegalArgumentException("Null 'lastBarPaint' argument");
		}
		org.jfree.chart.renderer.category.WaterfallBarRenderer.this.firstBarPaint = firstBarPaint;
		org.jfree.chart.renderer.category.WaterfallBarRenderer.this.lastBarPaint = lastBarPaint;
		org.jfree.chart.renderer.category.WaterfallBarRenderer.this.positiveBarPaint = positiveBarPaint;
		org.jfree.chart.renderer.category.WaterfallBarRenderer.this.negativeBarPaint = negativeBarPaint;
		setGradientPaintTransformer(new org.jfree.chart.util.StandardGradientPaintTransformer(org.jfree.chart.util.GradientPaintTransformType.CENTER_VERTICAL));
		setMinimumBarLength(1.0);
	}

	public java.awt.Paint getFirstBarPaint() {
		return org.jfree.chart.renderer.category.WaterfallBarRenderer.this.firstBarPaint;
	}

	public void setFirstBarPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument");
		}
		org.jfree.chart.renderer.category.WaterfallBarRenderer.this.firstBarPaint = paint;
		fireChangeEvent();
	}

	public java.awt.Paint getLastBarPaint() {
		return org.jfree.chart.renderer.category.WaterfallBarRenderer.this.lastBarPaint;
	}

	public void setLastBarPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument");
		}
		org.jfree.chart.renderer.category.WaterfallBarRenderer.this.lastBarPaint = paint;
		fireChangeEvent();
	}

	public java.awt.Paint getPositiveBarPaint() {
		return org.jfree.chart.renderer.category.WaterfallBarRenderer.this.positiveBarPaint;
	}

	public void setPositiveBarPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument");
		}
		org.jfree.chart.renderer.category.WaterfallBarRenderer.this.positiveBarPaint = paint;
		fireChangeEvent();
	}

	public java.awt.Paint getNegativeBarPaint() {
		return org.jfree.chart.renderer.category.WaterfallBarRenderer.this.negativeBarPaint;
	}

	public void setNegativeBarPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument");
		}
		org.jfree.chart.renderer.category.WaterfallBarRenderer.this.negativeBarPaint = paint;
		fireChangeEvent();
	}

	public org.jfree.data.Range findRangeBounds(org.jfree.data.category.CategoryDataset dataset) {
		if (dataset == null) {
			return null;
		}
		boolean allItemsNull = true;
		double minimum = 0.0;
		double maximum = 0.0;
		int columnCount = dataset.getColumnCount();
		for (int row = 0; row < (dataset.getRowCount()); row++) {
			double runningTotal = 0.0;
			for (int column = 0; column <= (columnCount - 1); column++) {
				java.lang.Number n = dataset.getValue(row, column);
				if (n != null) {
					allItemsNull = false;
					double value = n.doubleValue();
					if (column == (columnCount - 1)) {
						runningTotal = value;
					}else {
						runningTotal = runningTotal + value;
					}
					minimum = java.lang.Math.min(minimum, runningTotal);
					maximum = java.lang.Math.max(maximum, runningTotal);
				}
			}
		}
		if (!allItemsNull) {
			return new org.jfree.data.Range(minimum, maximum);
		}else {
			return null;
		}
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, boolean selected, int pass) {
		double previous = state.getSeriesRunningTotal();
		if (column == ((dataset.getColumnCount()) - 1)) {
			previous = 0.0;
		}
		double current = 0.0;
		java.lang.Number n = dataset.getValue(row, column);
		if (n != null) {
			current = previous + (n.doubleValue());
		}
		state.setSeriesRunningTotal(current);
		int categoryCount = getColumnCount();
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		double rectX = 0.0;
		double rectY = 0.0;
		org.jfree.chart.util.RectangleEdge rangeAxisLocation = plot.getRangeAxisEdge();
		double j2dy0 = rangeAxis.valueToJava2D(previous, dataArea, rangeAxisLocation);
		double j2dy1 = rangeAxis.valueToJava2D(current, dataArea, rangeAxisLocation);
		double valDiff = current - previous;
		if (j2dy1 < j2dy0) {
			double temp = j2dy1;
			j2dy1 = j2dy0;
			j2dy0 = temp;
		}
		double rectWidth = state.getBarWidth();
		double rectHeight = java.lang.Math.max(getMinimumBarLength(), java.lang.Math.abs((j2dy1 - j2dy0)));
		java.lang.Comparable seriesKey = dataset.getRowKey(row);
		java.lang.Comparable categoryKey = dataset.getColumnKey(column);
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			rectY = domainAxis.getCategorySeriesMiddle(categoryKey, seriesKey, dataset, getItemMargin(), dataArea, org.jfree.chart.util.RectangleEdge.LEFT);
			rectX = j2dy0;
			rectHeight = state.getBarWidth();
			rectY = rectY - (rectHeight / 2.0);
			rectWidth = java.lang.Math.max(getMinimumBarLength(), java.lang.Math.abs((j2dy1 - j2dy0)));
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				rectX = domainAxis.getCategorySeriesMiddle(categoryKey, seriesKey, dataset, getItemMargin(), dataArea, org.jfree.chart.util.RectangleEdge.TOP);
				rectX = rectX - (rectWidth / 2.0);
				rectY = j2dy0;
			}
		
		java.awt.geom.Rectangle2D bar = new java.awt.geom.Rectangle2D.Double(rectX, rectY, rectWidth, rectHeight);
		java.awt.Paint seriesPaint = getFirstBarPaint();
		if (column == 0) {
			seriesPaint = getFirstBarPaint();
		}else
			if (column == (categoryCount - 1)) {
				seriesPaint = getLastBarPaint();
			}else {
				if (valDiff < 0.0) {
					seriesPaint = getNegativeBarPaint();
				}else
					if (valDiff > 0.0) {
						seriesPaint = getPositiveBarPaint();
					}else {
						seriesPaint = getLastBarPaint();
					}
				
			}
		
		if (((getGradientPaintTransformer()) != null) && (seriesPaint instanceof java.awt.GradientPaint)) {
			java.awt.GradientPaint gp = ((java.awt.GradientPaint) (seriesPaint));
			seriesPaint = getGradientPaintTransformer().transform(gp, bar);
		}
		g2.setPaint(seriesPaint);
		g2.fill(bar);
		if ((isDrawBarOutline()) && ((state.getBarWidth()) > (org.jfree.chart.renderer.category.BarRenderer.BAR_OUTLINE_WIDTH_THRESHOLD))) {
			java.awt.Stroke stroke = getItemOutlineStroke(row, column, selected);
			java.awt.Paint paint = getItemOutlinePaint(row, column, selected);
			if ((stroke != null) && (paint != null)) {
				g2.setStroke(stroke);
				g2.setPaint(paint);
				g2.draw(bar);
			}
		}
		org.jfree.chart.labels.CategoryItemLabelGenerator generator = getItemLabelGenerator(row, column, selected);
		if ((generator != null) && (isItemLabelVisible(row, column, selected))) {
			drawItemLabelForBar(g2, plot, dataset, row, column, selected, generator, bar, (valDiff < 0.0));
		}
		org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
		if (entities != null) {
			addEntity(entities, bar, dataset, row, column, selected);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.category.WaterfallBarRenderer.this)) {
			return true;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		if (!(obj instanceof org.jfree.chart.renderer.category.WaterfallBarRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.category.WaterfallBarRenderer that = ((org.jfree.chart.renderer.category.WaterfallBarRenderer) (obj));
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.category.WaterfallBarRenderer.this.firstBarPaint, that.firstBarPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.category.WaterfallBarRenderer.this.lastBarPaint, that.lastBarPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.category.WaterfallBarRenderer.this.positiveBarPaint, that.positiveBarPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.category.WaterfallBarRenderer.this.negativeBarPaint, that.negativeBarPaint))) {
			return false;
		}
		return true;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.category.WaterfallBarRenderer.this.firstBarPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.category.WaterfallBarRenderer.this.lastBarPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.category.WaterfallBarRenderer.this.positiveBarPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.category.WaterfallBarRenderer.this.negativeBarPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.category.WaterfallBarRenderer.this.firstBarPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.renderer.category.WaterfallBarRenderer.this.lastBarPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.renderer.category.WaterfallBarRenderer.this.positiveBarPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.renderer.category.WaterfallBarRenderer.this.negativeBarPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}


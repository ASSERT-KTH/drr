

package org.jfree.chart.renderer.xy;


public class ClusteredXYBarRenderer extends org.jfree.chart.renderer.xy.XYBarRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 5864462149177133147L;

	private boolean centerBarAtStartValue;

	public ClusteredXYBarRenderer() {
		this(0.0, false);
	}

	public ClusteredXYBarRenderer(double margin, boolean centerBarAtStartValue) {
		super(margin);
		org.jfree.chart.renderer.xy.ClusteredXYBarRenderer.this.centerBarAtStartValue = centerBarAtStartValue;
	}

	public int getPassCount() {
		return 2;
	}

	public org.jfree.data.Range findDomainBounds(org.jfree.data.xy.XYDataset dataset) {
		if (dataset == null) {
			return null;
		}
		if (org.jfree.chart.renderer.xy.ClusteredXYBarRenderer.this.centerBarAtStartValue) {
			return findDomainBoundsWithOffset(((org.jfree.data.xy.IntervalXYDataset) (dataset)));
		}else {
			return super.findDomainBounds(dataset);
		}
	}

	protected org.jfree.data.Range findDomainBoundsWithOffset(org.jfree.data.xy.IntervalXYDataset dataset) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		double minimum = java.lang.Double.POSITIVE_INFINITY;
		double maximum = java.lang.Double.NEGATIVE_INFINITY;
		int seriesCount = dataset.getSeriesCount();
		double lvalue;
		double uvalue;
		for (int series = 0; series < seriesCount; series++) {
			int itemCount = dataset.getItemCount(series);
			for (int item = 0; item < itemCount; item++) {
				lvalue = dataset.getStartXValue(series, item);
				uvalue = dataset.getEndXValue(series, item);
				double offset = (uvalue - lvalue) / 2.0;
				lvalue = lvalue - offset;
				uvalue = uvalue - offset;
				minimum = java.lang.Math.min(minimum, lvalue);
				maximum = java.lang.Math.max(maximum, uvalue);
			}
		}
		if (minimum > maximum) {
			return null;
		}else {
			return new org.jfree.data.Range(minimum, maximum);
		}
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo info, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, org.jfree.chart.plot.CrosshairState crosshairState, int pass) {
		org.jfree.data.xy.IntervalXYDataset intervalDataset = ((org.jfree.data.xy.IntervalXYDataset) (dataset));
		double y0;
		double y1;
		if (getUseYInterval()) {
			y0 = intervalDataset.getStartYValue(series, item);
			y1 = intervalDataset.getEndYValue(series, item);
		}else {
			y0 = getBase();
			y1 = intervalDataset.getYValue(series, item);
		}
		if ((java.lang.Double.isNaN(y0)) || (java.lang.Double.isNaN(y1))) {
			return ;
		}
		double yy0 = rangeAxis.valueToJava2D(y0, dataArea, plot.getRangeAxisEdge());
		double yy1 = rangeAxis.valueToJava2D(y1, dataArea, plot.getRangeAxisEdge());
		org.jfree.chart.util.RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
		double x0 = intervalDataset.getStartXValue(series, item);
		double xx0 = domainAxis.valueToJava2D(x0, dataArea, xAxisLocation);
		double x1 = intervalDataset.getEndXValue(series, item);
		double xx1 = domainAxis.valueToJava2D(x1, dataArea, xAxisLocation);
		double intervalW = xx1 - xx0;
		double baseX = xx0;
		if (org.jfree.chart.renderer.xy.ClusteredXYBarRenderer.this.centerBarAtStartValue) {
			baseX = baseX - (intervalW / 2.0);
		}
		double m = getMargin();
		if (m > 0.0) {
			double cut = intervalW * (getMargin());
			intervalW = intervalW - cut;
			baseX = baseX + (cut / 2);
		}
		double intervalH = java.lang.Math.abs((yy0 - yy1));
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		int numSeries = dataset.getSeriesCount();
		double seriesBarWidth = intervalW / numSeries;
		java.awt.geom.Rectangle2D bar = null;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			double barY0 = baseX + (seriesBarWidth * series);
			double barY1 = barY0 + seriesBarWidth;
			double rx = java.lang.Math.min(yy0, yy1);
			double rw = intervalH;
			double ry = java.lang.Math.min(barY0, barY1);
			double rh = java.lang.Math.abs((barY1 - barY0));
			bar = new java.awt.geom.Rectangle2D.Double(rx, ry, rw, rh);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				double barX0 = baseX + (seriesBarWidth * series);
				double barX1 = barX0 + seriesBarWidth;
				double rx = java.lang.Math.min(barX0, barX1);
				double rw = java.lang.Math.abs((barX1 - barX0));
				double ry = java.lang.Math.min(yy0, yy1);
				double rh = intervalH;
				bar = new java.awt.geom.Rectangle2D.Double(rx, ry, rw, rh);
			}
		
		boolean positive = y1 > 0.0;
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
		if ((pass == 0) && (getShadowsVisible())) {
			getBarPainter().paintBarShadow(g2, org.jfree.chart.renderer.xy.ClusteredXYBarRenderer.this, series, item, bar, barBase, (!(getUseYInterval())));
		}
		if (pass == 1) {
			getBarPainter().paintBar(g2, org.jfree.chart.renderer.xy.ClusteredXYBarRenderer.this, series, item, bar, barBase);
			if (isItemLabelVisible(series, item)) {
				org.jfree.chart.labels.XYItemLabelGenerator generator = getItemLabelGenerator(series, item);
				drawItemLabel(g2, dataset, series, item, plot, generator, bar, (y1 < 0.0));
			}
			if (info != null) {
				org.jfree.chart.entity.EntityCollection entities = info.getOwner().getEntityCollection();
				if (entities != null) {
					addEntity(entities, bar, dataset, series, item, bar.getCenterX(), bar.getCenterY());
				}
			}
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.ClusteredXYBarRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.ClusteredXYBarRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.xy.ClusteredXYBarRenderer that = ((org.jfree.chart.renderer.xy.ClusteredXYBarRenderer) (obj));
		if ((org.jfree.chart.renderer.xy.ClusteredXYBarRenderer.this.centerBarAtStartValue) != (that.centerBarAtStartValue)) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}


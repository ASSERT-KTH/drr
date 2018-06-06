

package org.jfree.chart.renderer.xy;


public class StackedXYBarRenderer extends org.jfree.chart.renderer.xy.XYBarRenderer {
	private static final long serialVersionUID = -7049101055533436444L;

	private boolean renderAsPercentages;

	public StackedXYBarRenderer() {
		this(0.0);
	}

	public StackedXYBarRenderer(double margin) {
		super(margin);
		org.jfree.chart.renderer.xy.StackedXYBarRenderer.this.renderAsPercentages = false;
		org.jfree.chart.labels.ItemLabelPosition p = new org.jfree.chart.labels.ItemLabelPosition(org.jfree.chart.labels.ItemLabelAnchor.CENTER, org.jfree.chart.text.TextAnchor.CENTER);
		setBasePositiveItemLabelPosition(p);
		setBaseNegativeItemLabelPosition(p);
		setPositiveItemLabelPositionFallback(null);
		setNegativeItemLabelPositionFallback(null);
	}

	public boolean getRenderAsPercentages() {
		return org.jfree.chart.renderer.xy.StackedXYBarRenderer.this.renderAsPercentages;
	}

	public void setRenderAsPercentages(boolean asPercentages) {
		org.jfree.chart.renderer.xy.StackedXYBarRenderer.this.renderAsPercentages = asPercentages;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.StackedXYBarRenderer.this));
	}

	public int getPassCount() {
		return 2;
	}

	public org.jfree.chart.renderer.xy.XYItemRendererState initialise(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.XYPlot plot, org.jfree.data.xy.XYDataset data, org.jfree.chart.plot.PlotRenderingInfo info) {
		return new org.jfree.chart.renderer.xy.XYBarRenderer.XYBarRendererState(info);
	}

	public org.jfree.data.Range findRangeBounds(org.jfree.data.xy.XYDataset dataset) {
		if (dataset != null) {
			if (org.jfree.chart.renderer.xy.StackedXYBarRenderer.this.renderAsPercentages) {
				return new org.jfree.data.Range(0.0, 1.0);
			}else {
				return org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.xy.TableXYDataset) (dataset)));
			}
		}else {
			return null;
		}
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo info, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, org.jfree.chart.plot.CrosshairState crosshairState, int pass) {
		if (!((dataset instanceof org.jfree.data.xy.IntervalXYDataset) && (dataset instanceof org.jfree.data.xy.TableXYDataset))) {
			java.lang.String message = ("dataset (type " + (dataset.getClass().getName())) + ") has wrong type:";
			boolean and = false;
			if (!(org.jfree.data.xy.IntervalXYDataset.class.isAssignableFrom(dataset.getClass()))) {
				message += " it is no IntervalXYDataset";
				and = true;
			}
			if (!(org.jfree.data.xy.TableXYDataset.class.isAssignableFrom(dataset.getClass()))) {
				if (and) {
					message += " and";
				}
				message += " it is no TableXYDataset";
			}
			throw new java.lang.IllegalArgumentException(message);
		}
		org.jfree.data.xy.IntervalXYDataset intervalDataset = ((org.jfree.data.xy.IntervalXYDataset) (dataset));
		double value = intervalDataset.getYValue(series, item);
		if (java.lang.Double.isNaN(value)) {
			return ;
		}
		double total = 0.0;
		if (org.jfree.chart.renderer.xy.StackedXYBarRenderer.this.renderAsPercentages) {
			total = org.jfree.data.general.DatasetUtilities.calculateStackTotal(((org.jfree.data.xy.TableXYDataset) (dataset)), item);
			value = value / total;
		}
		double positiveBase = 0.0;
		double negativeBase = 0.0;
		for (int i = 0; i < series; i++) {
			double v = dataset.getYValue(i, item);
			if (!(java.lang.Double.isNaN(v))) {
				if (org.jfree.chart.renderer.xy.StackedXYBarRenderer.this.renderAsPercentages) {
					v = v / total;
				}
				if (v > 0) {
					positiveBase = positiveBase + v;
				}else {
					negativeBase = negativeBase + v;
				}
			}
		}
		double translatedBase;
		double translatedValue;
		org.jfree.chart.util.RectangleEdge edgeR = plot.getRangeAxisEdge();
		if (value > 0.0) {
			translatedBase = rangeAxis.valueToJava2D(positiveBase, dataArea, edgeR);
			translatedValue = rangeAxis.valueToJava2D((positiveBase + value), dataArea, edgeR);
		}else {
			translatedBase = rangeAxis.valueToJava2D(negativeBase, dataArea, edgeR);
			translatedValue = rangeAxis.valueToJava2D((negativeBase + value), dataArea, edgeR);
		}
		org.jfree.chart.util.RectangleEdge edgeD = plot.getDomainAxisEdge();
		double startX = intervalDataset.getStartXValue(series, item);
		if (java.lang.Double.isNaN(startX)) {
			return ;
		}
		double translatedStartX = domainAxis.valueToJava2D(startX, dataArea, edgeD);
		double endX = intervalDataset.getEndXValue(series, item);
		if (java.lang.Double.isNaN(endX)) {
			return ;
		}
		double translatedEndX = domainAxis.valueToJava2D(endX, dataArea, edgeD);
		double translatedWidth = java.lang.Math.max(1, java.lang.Math.abs((translatedEndX - translatedStartX)));
		double translatedHeight = java.lang.Math.abs((translatedValue - translatedBase));
		if ((getMargin()) > 0.0) {
			double cut = translatedWidth * (getMargin());
			translatedWidth = translatedWidth - cut;
			translatedStartX = translatedStartX + (cut / 2);
		}
		java.awt.geom.Rectangle2D bar = null;
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			bar = new java.awt.geom.Rectangle2D.Double(java.lang.Math.min(translatedBase, translatedValue), translatedEndX, translatedHeight, translatedWidth);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				bar = new java.awt.geom.Rectangle2D.Double(translatedStartX, java.lang.Math.min(translatedBase, translatedValue), translatedWidth, translatedHeight);
			}
		
		if (pass == 0) {
			java.awt.Paint itemPaint = getItemPaint(series, item);
			if (((getGradientPaintTransformer()) != null) && (itemPaint instanceof java.awt.GradientPaint)) {
				java.awt.GradientPaint gp = ((java.awt.GradientPaint) (itemPaint));
				itemPaint = getGradientPaintTransformer().transform(gp, bar);
			}
			g2.setPaint(itemPaint);
			g2.fill(bar);
			if ((isDrawBarOutline()) && ((java.lang.Math.abs((translatedEndX - translatedStartX))) > 3)) {
				g2.setStroke(getItemStroke(series, item));
				g2.setPaint(getItemOutlinePaint(series, item));
				g2.draw(bar);
			}
			if (info != null) {
				org.jfree.chart.entity.EntityCollection entities = info.getOwner().getEntityCollection();
				if (entities != null) {
					addEntity(entities, bar, dataset, series, item, bar.getCenterX(), bar.getCenterY());
				}
			}
		}else
			if (pass == 1) {
				if (isItemLabelVisible(series, item)) {
					org.jfree.chart.labels.XYItemLabelGenerator generator = getItemLabelGenerator(series, item);
					drawItemLabel(g2, dataset, series, item, plot, generator, bar, (value < 0.0));
				}
			}
		
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.StackedXYBarRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.StackedXYBarRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.xy.StackedXYBarRenderer that = ((org.jfree.chart.renderer.xy.StackedXYBarRenderer) (obj));
		if ((org.jfree.chart.renderer.xy.StackedXYBarRenderer.this.renderAsPercentages) != (that.renderAsPercentages)) {
			return false;
		}
		return super.equals(obj);
	}

	public int hashCode() {
		int result = super.hashCode();
		result = (result * 37) + (org.jfree.chart.renderer.xy.StackedXYBarRenderer.this.renderAsPercentages ? 1 : 0);
		return result;
	}
}


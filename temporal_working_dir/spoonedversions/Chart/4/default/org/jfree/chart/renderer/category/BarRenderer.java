

package org.jfree.chart.renderer.category;


public class BarRenderer extends org.jfree.chart.renderer.category.AbstractCategoryItemRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 6000649414965887481L;

	public static final double DEFAULT_ITEM_MARGIN = 0.2;

	public static final double BAR_OUTLINE_WIDTH_THRESHOLD = 3.0;

	private static org.jfree.chart.renderer.category.BarPainter defaultBarPainter = new org.jfree.chart.renderer.category.GradientBarPainter();

	public static org.jfree.chart.renderer.category.BarPainter getDefaultBarPainter() {
		return org.jfree.chart.renderer.category.BarRenderer.defaultBarPainter;
	}

	public static void setDefaultBarPainter(org.jfree.chart.renderer.category.BarPainter painter) {
		if (painter == null) {
			throw new java.lang.IllegalArgumentException("Null 'painter' argument.");
		}
		org.jfree.chart.renderer.category.BarRenderer.defaultBarPainter = painter;
	}

	private static boolean defaultShadowsVisible = true;

	public static boolean getDefaultShadowsVisible() {
		return org.jfree.chart.renderer.category.BarRenderer.defaultShadowsVisible;
	}

	public static void setDefaultShadowsVisible(boolean visible) {
		org.jfree.chart.renderer.category.BarRenderer.defaultShadowsVisible = visible;
	}

	private double itemMargin;

	private boolean drawBarOutline;

	private double maximumBarWidth;

	private double minimumBarLength;

	private org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer;

	private org.jfree.chart.labels.ItemLabelPosition positiveItemLabelPositionFallback;

	private org.jfree.chart.labels.ItemLabelPosition negativeItemLabelPositionFallback;

	private double upperClip;

	private double lowerClip;

	private double base;

	private boolean includeBaseInRange;

	private org.jfree.chart.renderer.category.BarPainter barPainter;

	private boolean shadowsVisible;

	private transient java.awt.Paint shadowPaint;

	private double shadowXOffset;

	private double shadowYOffset;

	public BarRenderer() {
		super();
		org.jfree.chart.renderer.category.BarRenderer.this.base = 0.0;
		org.jfree.chart.renderer.category.BarRenderer.this.includeBaseInRange = true;
		org.jfree.chart.renderer.category.BarRenderer.this.itemMargin = org.jfree.chart.renderer.category.BarRenderer.DEFAULT_ITEM_MARGIN;
		org.jfree.chart.renderer.category.BarRenderer.this.drawBarOutline = false;
		org.jfree.chart.renderer.category.BarRenderer.this.maximumBarWidth = 1.0;
		org.jfree.chart.renderer.category.BarRenderer.this.positiveItemLabelPositionFallback = null;
		org.jfree.chart.renderer.category.BarRenderer.this.negativeItemLabelPositionFallback = null;
		org.jfree.chart.renderer.category.BarRenderer.this.gradientPaintTransformer = new org.jfree.chart.util.StandardGradientPaintTransformer();
		org.jfree.chart.renderer.category.BarRenderer.this.minimumBarLength = 0.0;
		setBaseLegendShape(new java.awt.geom.Rectangle2D.Double((-4.0), (-4.0), 8.0, 8.0));
		org.jfree.chart.renderer.category.BarRenderer.this.barPainter = org.jfree.chart.renderer.category.BarRenderer.getDefaultBarPainter();
		org.jfree.chart.renderer.category.BarRenderer.this.shadowsVisible = org.jfree.chart.renderer.category.BarRenderer.getDefaultShadowsVisible();
		org.jfree.chart.renderer.category.BarRenderer.this.shadowPaint = java.awt.Color.gray;
		org.jfree.chart.renderer.category.BarRenderer.this.shadowXOffset = 4.0;
		org.jfree.chart.renderer.category.BarRenderer.this.shadowYOffset = 4.0;
	}

	public double getBase() {
		return org.jfree.chart.renderer.category.BarRenderer.this.base;
	}

	public void setBase(double base) {
		org.jfree.chart.renderer.category.BarRenderer.this.base = base;
		fireChangeEvent();
	}

	public double getItemMargin() {
		return org.jfree.chart.renderer.category.BarRenderer.this.itemMargin;
	}

	public void setItemMargin(double percent) {
		org.jfree.chart.renderer.category.BarRenderer.this.itemMargin = percent;
		fireChangeEvent();
	}

	public boolean isDrawBarOutline() {
		return org.jfree.chart.renderer.category.BarRenderer.this.drawBarOutline;
	}

	public void setDrawBarOutline(boolean draw) {
		org.jfree.chart.renderer.category.BarRenderer.this.drawBarOutline = draw;
		fireChangeEvent();
	}

	public double getMaximumBarWidth() {
		return org.jfree.chart.renderer.category.BarRenderer.this.maximumBarWidth;
	}

	public void setMaximumBarWidth(double percent) {
		org.jfree.chart.renderer.category.BarRenderer.this.maximumBarWidth = percent;
		fireChangeEvent();
	}

	public double getMinimumBarLength() {
		return org.jfree.chart.renderer.category.BarRenderer.this.minimumBarLength;
	}

	public void setMinimumBarLength(double min) {
		if (min < 0.0) {
			throw new java.lang.IllegalArgumentException("Requires 'min' >= 0.0");
		}
		org.jfree.chart.renderer.category.BarRenderer.this.minimumBarLength = min;
		fireChangeEvent();
	}

	public org.jfree.chart.util.GradientPaintTransformer getGradientPaintTransformer() {
		return org.jfree.chart.renderer.category.BarRenderer.this.gradientPaintTransformer;
	}

	public void setGradientPaintTransformer(org.jfree.chart.util.GradientPaintTransformer transformer) {
		org.jfree.chart.renderer.category.BarRenderer.this.gradientPaintTransformer = transformer;
		fireChangeEvent();
	}

	public org.jfree.chart.labels.ItemLabelPosition getPositiveItemLabelPositionFallback() {
		return org.jfree.chart.renderer.category.BarRenderer.this.positiveItemLabelPositionFallback;
	}

	public void setPositiveItemLabelPositionFallback(org.jfree.chart.labels.ItemLabelPosition position) {
		org.jfree.chart.renderer.category.BarRenderer.this.positiveItemLabelPositionFallback = position;
		fireChangeEvent();
	}

	public org.jfree.chart.labels.ItemLabelPosition getNegativeItemLabelPositionFallback() {
		return org.jfree.chart.renderer.category.BarRenderer.this.negativeItemLabelPositionFallback;
	}

	public void setNegativeItemLabelPositionFallback(org.jfree.chart.labels.ItemLabelPosition position) {
		org.jfree.chart.renderer.category.BarRenderer.this.negativeItemLabelPositionFallback = position;
		fireChangeEvent();
	}

	public boolean getIncludeBaseInRange() {
		return org.jfree.chart.renderer.category.BarRenderer.this.includeBaseInRange;
	}

	public void setIncludeBaseInRange(boolean include) {
		if ((org.jfree.chart.renderer.category.BarRenderer.this.includeBaseInRange) != include) {
			org.jfree.chart.renderer.category.BarRenderer.this.includeBaseInRange = include;
			fireChangeEvent();
		}
	}

	public org.jfree.chart.renderer.category.BarPainter getBarPainter() {
		return org.jfree.chart.renderer.category.BarRenderer.this.barPainter;
	}

	public void setBarPainter(org.jfree.chart.renderer.category.BarPainter painter) {
		if (painter == null) {
			throw new java.lang.IllegalArgumentException("Null 'painter' argument.");
		}
		org.jfree.chart.renderer.category.BarRenderer.this.barPainter = painter;
		fireChangeEvent();
	}

	public boolean getShadowsVisible() {
		return org.jfree.chart.renderer.category.BarRenderer.this.shadowsVisible;
	}

	public void setShadowVisible(boolean visible) {
		org.jfree.chart.renderer.category.BarRenderer.this.shadowsVisible = visible;
		fireChangeEvent();
	}

	public java.awt.Paint getShadowPaint() {
		return org.jfree.chart.renderer.category.BarRenderer.this.shadowPaint;
	}

	public void setShadowPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.renderer.category.BarRenderer.this.shadowPaint = paint;
		fireChangeEvent();
	}

	public double getShadowXOffset() {
		return org.jfree.chart.renderer.category.BarRenderer.this.shadowXOffset;
	}

	public void setShadowXOffset(double offset) {
		org.jfree.chart.renderer.category.BarRenderer.this.shadowXOffset = offset;
		fireChangeEvent();
	}

	public double getShadowYOffset() {
		return org.jfree.chart.renderer.category.BarRenderer.this.shadowYOffset;
	}

	public void setShadowYOffset(double offset) {
		org.jfree.chart.renderer.category.BarRenderer.this.shadowYOffset = offset;
		fireChangeEvent();
	}

	public double getLowerClip() {
		return org.jfree.chart.renderer.category.BarRenderer.this.lowerClip;
	}

	public double getUpperClip() {
		return org.jfree.chart.renderer.category.BarRenderer.this.upperClip;
	}

	public org.jfree.chart.renderer.category.CategoryItemRendererState initialise(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, int rendererIndex, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.renderer.category.CategoryItemRendererState state = super.initialise(g2, dataArea, plot, rendererIndex, info);
		org.jfree.chart.axis.ValueAxis rangeAxis = plot.getRangeAxisForDataset(rendererIndex);
		org.jfree.chart.renderer.category.BarRenderer.this.lowerClip = rangeAxis.getRange().getLowerBound();
		org.jfree.chart.renderer.category.BarRenderer.this.upperClip = rangeAxis.getRange().getUpperBound();
		calculateBarWidth(plot, dataArea, rendererIndex, state);
		return state;
	}

	protected void calculateBarWidth(org.jfree.chart.plot.CategoryPlot plot, java.awt.geom.Rectangle2D dataArea, int rendererIndex, org.jfree.chart.renderer.category.CategoryItemRendererState state) {
		org.jfree.chart.axis.CategoryAxis domainAxis = getDomainAxis(plot, rendererIndex);
		org.jfree.data.category.CategoryDataset dataset = plot.getDataset(rendererIndex);
		if (dataset != null) {
			int columns = dataset.getColumnCount();
			int rows = (state.getVisibleSeriesCount()) >= 0 ? state.getVisibleSeriesCount() : dataset.getRowCount();
			double space = 0.0;
			org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				space = dataArea.getHeight();
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					space = dataArea.getWidth();
				}
			
			double maxWidth = space * (getMaximumBarWidth());
			double categoryMargin = 0.0;
			double currentItemMargin = 0.0;
			if (columns > 1) {
				categoryMargin = domainAxis.getCategoryMargin();
			}
			if (rows > 1) {
				currentItemMargin = getItemMargin();
			}
			double used = space * ((((1 - (domainAxis.getLowerMargin())) - (domainAxis.getUpperMargin())) - categoryMargin) - currentItemMargin);
			if ((rows * columns) > 0) {
				state.setBarWidth(java.lang.Math.min((used / (rows * columns)), maxWidth));
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
		int seriesCount = (state.getVisibleSeriesCount()) >= 0 ? state.getVisibleSeriesCount() : getRowCount();
		int categoryCount = getColumnCount();
		if (seriesCount > 1) {
			double seriesGap = (space * (getItemMargin())) / (categoryCount * (seriesCount - 1));
			double seriesW = calculateSeriesWidth(space, domainAxis, categoryCount, seriesCount);
			barW0 = ((barW0 + (row * (seriesW + seriesGap))) + (seriesW / 2.0)) - ((state.getBarWidth()) / 2.0);
		}else {
			barW0 = (domainAxis.getCategoryMiddle(column, getColumnCount(), dataArea, plot.getDomainAxisEdge())) - ((state.getBarWidth()) / 2.0);
		}
		return barW0;
	}

	protected double[] calculateBarL0L1(double value) {
		double lclip = getLowerClip();
		double uclip = getUpperClip();
		double barLow = java.lang.Math.min(org.jfree.chart.renderer.category.BarRenderer.this.base, value);
		double barHigh = java.lang.Math.max(org.jfree.chart.renderer.category.BarRenderer.this.base, value);
		if (barHigh < lclip) {
			return null;
		}
		if (barLow > uclip) {
			return null;
		}
		barLow = java.lang.Math.max(barLow, lclip);
		barHigh = java.lang.Math.min(barHigh, uclip);
		return new double[]{ barLow , barHigh };
	}

	public org.jfree.data.Range findRangeBounds(org.jfree.data.category.CategoryDataset dataset, boolean includeInterval) {
		if (dataset == null) {
			return null;
		}
		org.jfree.data.Range result = super.findRangeBounds(dataset, includeInterval);
		if (result != null) {
			if (org.jfree.chart.renderer.category.BarRenderer.this.includeBaseInRange) {
				result = org.jfree.data.Range.expandToInclude(result, org.jfree.chart.renderer.category.BarRenderer.this.base);
			}
		}
		return result;
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
		org.jfree.chart.LegendItem result = new org.jfree.chart.LegendItem(label, description, toolTipText, urlText, true, shape, true, paint, isDrawBarOutline(), outlinePaint, outlineStroke, false, new java.awt.geom.Line2D.Float(), new java.awt.BasicStroke(1.0F), java.awt.Color.black);
		result.setLabelFont(lookupLegendTextFont(series));
		java.awt.Paint labelPaint = lookupLegendTextPaint(series);
		if (labelPaint != null) {
			result.setLabelPaint(labelPaint);
		}
		result.setDataset(dataset);
		result.setDatasetIndex(datasetIndex);
		result.setSeriesKey(dataset.getRowKey(series));
		result.setSeriesIndex(series);
		if ((org.jfree.chart.renderer.category.BarRenderer.this.gradientPaintTransformer) != null) {
			result.setFillPaintTransformer(org.jfree.chart.renderer.category.BarRenderer.this.gradientPaintTransformer);
		}
		return result;
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, boolean selected, int pass) {
		int visibleRow = state.getVisibleSeriesIndex(row);
		if (visibleRow < 0) {
			return ;
		}
		java.lang.Number dataValue = dataset.getValue(row, column);
		if (dataValue == null) {
			return ;
		}
		final double value = dataValue.doubleValue();
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		double barW0 = calculateBarW0(plot, orientation, dataArea, domainAxis, state, visibleRow, column);
		double[] barL0L1 = calculateBarL0L1(value);
		if (barL0L1 == null) {
			return ;
		}
		org.jfree.chart.util.RectangleEdge edge = plot.getRangeAxisEdge();
		double transL0 = rangeAxis.valueToJava2D(barL0L1[0], dataArea, edge);
		double transL1 = rangeAxis.valueToJava2D(barL0L1[1], dataArea, edge);
		boolean positive = value >= (org.jfree.chart.renderer.category.BarRenderer.this.base);
		boolean inverted = rangeAxis.isInverted();
		double barL0 = java.lang.Math.min(transL0, transL1);
		double barLength = java.lang.Math.abs((transL1 - transL0));
		double barLengthAdj = 0.0;
		if ((barLength > 0.0) && (barLength < (getMinimumBarLength()))) {
			barLengthAdj = (getMinimumBarLength()) - barLength;
		}
		double barL0Adj = 0.0;
		org.jfree.chart.util.RectangleEdge barBase;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			if ((positive && inverted) || ((!positive) && (!inverted))) {
				barL0Adj = barLengthAdj;
				barBase = org.jfree.chart.util.RectangleEdge.RIGHT;
			}else {
				barBase = org.jfree.chart.util.RectangleEdge.LEFT;
			}
		}else {
			if ((positive && (!inverted)) || ((!positive) && inverted)) {
				barL0Adj = barLengthAdj;
				barBase = org.jfree.chart.util.RectangleEdge.BOTTOM;
			}else {
				barBase = org.jfree.chart.util.RectangleEdge.TOP;
			}
		}
		java.awt.geom.Rectangle2D bar = null;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			bar = new java.awt.geom.Rectangle2D.Double((barL0 - barL0Adj), barW0, (barLength + barLengthAdj), state.getBarWidth());
		}else {
			bar = new java.awt.geom.Rectangle2D.Double(barW0, (barL0 - barL0Adj), state.getBarWidth(), (barLength + barLengthAdj));
		}
		if (getShadowsVisible()) {
			org.jfree.chart.renderer.category.BarRenderer.this.barPainter.paintBarShadow(g2, org.jfree.chart.renderer.category.BarRenderer.this, row, column, selected, bar, barBase, true);
		}
		org.jfree.chart.renderer.category.BarRenderer.this.barPainter.paintBar(g2, org.jfree.chart.renderer.category.BarRenderer.this, row, column, selected, bar, barBase);
		org.jfree.chart.labels.CategoryItemLabelGenerator generator = getItemLabelGenerator(row, column, selected);
		if ((generator != null) && (isItemLabelVisible(row, column, selected))) {
			drawItemLabelForBar(g2, plot, dataset, row, column, selected, generator, bar, (value < 0.0));
		}
		int datasetIndex = plot.indexOf(dataset);
		updateCrosshairValues(state.getCrosshairState(), dataset.getRowKey(row), dataset.getColumnKey(column), value, datasetIndex, barW0, barL0, orientation);
		org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
		if (entities != null) {
			addEntity(entities, bar, dataset, row, column, selected);
		}
	}

	protected double calculateSeriesWidth(double space, org.jfree.chart.axis.CategoryAxis axis, int categories, int series) {
		double factor = ((1.0 - (getItemMargin())) - (axis.getLowerMargin())) - (axis.getUpperMargin());
		if (categories > 1) {
			factor = factor - (axis.getCategoryMargin());
		}
		return (space * factor) / (categories * series);
	}

	protected void drawItemLabelForBar(java.awt.Graphics2D g2, org.jfree.chart.plot.CategoryPlot plot, org.jfree.data.category.CategoryDataset dataset, int row, int column, boolean selected, org.jfree.chart.labels.CategoryItemLabelGenerator generator, java.awt.geom.Rectangle2D bar, boolean negative) {
		java.lang.String label = generator.generateLabel(dataset, row, column);
		if (label == null) {
			return ;
		}
		java.awt.Font labelFont = getItemLabelFont(row, column, selected);
		g2.setFont(labelFont);
		java.awt.Paint paint = getItemLabelPaint(row, column, selected);
		g2.setPaint(paint);
		org.jfree.chart.labels.ItemLabelPosition position = null;
		if (!negative) {
			position = getPositiveItemLabelPosition(row, column, selected);
		}else {
			position = getNegativeItemLabelPosition(row, column, selected);
		}
		java.awt.geom.Point2D anchorPoint = calculateLabelAnchorPoint(position.getItemLabelAnchor(), bar, plot.getOrientation());
		if (isInternalAnchor(position.getItemLabelAnchor())) {
			java.awt.Shape bounds = org.jfree.chart.text.TextUtilities.calculateRotatedStringBounds(label, g2, ((float) (anchorPoint.getX())), ((float) (anchorPoint.getY())), position.getTextAnchor(), position.getAngle(), position.getRotationAnchor());
			if (bounds != null) {
				if (!(bar.contains(bounds.getBounds2D()))) {
					if (!negative) {
						position = getPositiveItemLabelPositionFallback();
					}else {
						position = getNegativeItemLabelPositionFallback();
					}
					if (position != null) {
						anchorPoint = calculateLabelAnchorPoint(position.getItemLabelAnchor(), bar, plot.getOrientation());
					}
				}
			}
		}
		if (position != null) {
			org.jfree.chart.text.TextUtilities.drawRotatedString(label, g2, ((float) (anchorPoint.getX())), ((float) (anchorPoint.getY())), position.getTextAnchor(), position.getAngle(), position.getRotationAnchor());
		}
	}

	private java.awt.geom.Point2D calculateLabelAnchorPoint(org.jfree.chart.labels.ItemLabelAnchor anchor, java.awt.geom.Rectangle2D bar, org.jfree.chart.plot.PlotOrientation orientation) {
		java.awt.geom.Point2D result = null;
		double offset = getItemLabelAnchorOffset();
		double x0 = (bar.getX()) - offset;
		double x1 = bar.getX();
		double x2 = (bar.getX()) + offset;
		double x3 = bar.getCenterX();
		double x4 = (bar.getMaxX()) - offset;
		double x5 = bar.getMaxX();
		double x6 = (bar.getMaxX()) + offset;
		double y0 = (bar.getMaxY()) + offset;
		double y1 = bar.getMaxY();
		double y2 = (bar.getMaxY()) - offset;
		double y3 = bar.getCenterY();
		double y4 = (bar.getMinY()) + offset;
		double y5 = bar.getMinY();
		double y6 = (bar.getMinY()) - offset;
		if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.CENTER)) {
			result = new java.awt.geom.Point2D.Double(x3, y3);
		}else
			if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE1)) {
				result = new java.awt.geom.Point2D.Double(x4, y4);
			}else
				if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE2)) {
					result = new java.awt.geom.Point2D.Double(x4, y4);
				}else
					if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE3)) {
						result = new java.awt.geom.Point2D.Double(x4, y3);
					}else
						if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE4)) {
							result = new java.awt.geom.Point2D.Double(x4, y2);
						}else
							if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE5)) {
								result = new java.awt.geom.Point2D.Double(x4, y2);
							}else
								if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE6)) {
									result = new java.awt.geom.Point2D.Double(x3, y2);
								}else
									if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE7)) {
										result = new java.awt.geom.Point2D.Double(x2, y2);
									}else
										if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE8)) {
											result = new java.awt.geom.Point2D.Double(x2, y2);
										}else
											if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE9)) {
												result = new java.awt.geom.Point2D.Double(x2, y3);
											}else
												if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE10)) {
													result = new java.awt.geom.Point2D.Double(x2, y4);
												}else
													if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE11)) {
														result = new java.awt.geom.Point2D.Double(x2, y4);
													}else
														if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE12)) {
															result = new java.awt.geom.Point2D.Double(x3, y4);
														}else
															if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE1)) {
																result = new java.awt.geom.Point2D.Double(x5, y6);
															}else
																if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE2)) {
																	result = new java.awt.geom.Point2D.Double(x6, y5);
																}else
																	if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE3)) {
																		result = new java.awt.geom.Point2D.Double(x6, y3);
																	}else
																		if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE4)) {
																			result = new java.awt.geom.Point2D.Double(x6, y1);
																		}else
																			if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE5)) {
																				result = new java.awt.geom.Point2D.Double(x5, y0);
																			}else
																				if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE6)) {
																					result = new java.awt.geom.Point2D.Double(x3, y0);
																				}else
																					if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE7)) {
																						result = new java.awt.geom.Point2D.Double(x1, y0);
																					}else
																						if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE8)) {
																							result = new java.awt.geom.Point2D.Double(x0, y1);
																						}else
																							if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE9)) {
																								result = new java.awt.geom.Point2D.Double(x0, y3);
																							}else
																								if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE10)) {
																									result = new java.awt.geom.Point2D.Double(x0, y5);
																								}else
																									if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE11)) {
																										result = new java.awt.geom.Point2D.Double(x1, y6);
																									}else
																										if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE12)) {
																											result = new java.awt.geom.Point2D.Double(x3, y6);
																										}
																									
																								
																							
																						
																					
																				
																			
																		
																	
																
															
														
													
												
											
										
									
								
							
						
					
				
			
		
		return result;
	}

	private boolean isInternalAnchor(org.jfree.chart.labels.ItemLabelAnchor anchor) {
		return ((((((((((((anchor == (org.jfree.chart.labels.ItemLabelAnchor.CENTER)) || (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE1))) || (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE2))) || (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE3))) || (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE4))) || (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE5))) || (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE6))) || (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE7))) || (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE8))) || (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE9))) || (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE10))) || (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE11))) || (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE12));
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.category.BarRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.category.BarRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.category.BarRenderer that = ((org.jfree.chart.renderer.category.BarRenderer) (obj));
		if ((org.jfree.chart.renderer.category.BarRenderer.this.base) != (that.base)) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.BarRenderer.this.itemMargin) != (that.itemMargin)) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.BarRenderer.this.drawBarOutline) != (that.drawBarOutline)) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.BarRenderer.this.maximumBarWidth) != (that.maximumBarWidth)) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.BarRenderer.this.minimumBarLength) != (that.minimumBarLength)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.category.BarRenderer.this.gradientPaintTransformer, that.gradientPaintTransformer))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.category.BarRenderer.this.positiveItemLabelPositionFallback, that.positiveItemLabelPositionFallback))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.category.BarRenderer.this.negativeItemLabelPositionFallback, that.negativeItemLabelPositionFallback))) {
			return false;
		}
		if (!(org.jfree.chart.renderer.category.BarRenderer.this.barPainter.equals(that.barPainter))) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.BarRenderer.this.shadowsVisible) != (that.shadowsVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.category.BarRenderer.this.shadowPaint, that.shadowPaint))) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.BarRenderer.this.shadowXOffset) != (that.shadowXOffset)) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.BarRenderer.this.shadowYOffset) != (that.shadowYOffset)) {
			return false;
		}
		return super.equals(obj);
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.category.BarRenderer.this.shadowPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.category.BarRenderer.this.shadowPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}


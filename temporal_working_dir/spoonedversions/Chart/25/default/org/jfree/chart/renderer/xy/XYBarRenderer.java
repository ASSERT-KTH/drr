

package org.jfree.chart.renderer.xy;


public class XYBarRenderer extends org.jfree.chart.renderer.xy.AbstractXYItemRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.renderer.xy.XYItemRenderer , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 770559577251370036L;

	protected class XYBarRendererState extends org.jfree.chart.renderer.xy.XYItemRendererState {
		private double g2Base;

		public XYBarRendererState(org.jfree.chart.plot.PlotRenderingInfo info) {
			super(info);
		}

		public double getG2Base() {
			return org.jfree.chart.renderer.xy.XYBarRenderer.XYBarRendererState.this.g2Base;
		}

		public void setG2Base(double value) {
			org.jfree.chart.renderer.xy.XYBarRenderer.XYBarRendererState.this.g2Base = value;
		}
	}

	private double base;

	private boolean useYInterval;

	private double margin;

	private boolean drawBarOutline;

	private org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer;

	private transient java.awt.Shape legendBar;

	private org.jfree.chart.labels.ItemLabelPosition positiveItemLabelPositionFallback;

	private org.jfree.chart.labels.ItemLabelPosition negativeItemLabelPositionFallback;

	public XYBarRenderer() {
		this(0.0);
	}

	public XYBarRenderer(double margin) {
		super();
		org.jfree.chart.renderer.xy.XYBarRenderer.this.margin = margin;
		org.jfree.chart.renderer.xy.XYBarRenderer.this.base = 0.0;
		org.jfree.chart.renderer.xy.XYBarRenderer.this.useYInterval = false;
		org.jfree.chart.renderer.xy.XYBarRenderer.this.gradientPaintTransformer = new org.jfree.chart.util.StandardGradientPaintTransformer();
		org.jfree.chart.renderer.xy.XYBarRenderer.this.drawBarOutline = false;
		org.jfree.chart.renderer.xy.XYBarRenderer.this.legendBar = new java.awt.geom.Rectangle2D.Double((-3.0), (-5.0), 6.0, 10.0);
	}

	public double getBase() {
		return org.jfree.chart.renderer.xy.XYBarRenderer.this.base;
	}

	public void setBase(double base) {
		org.jfree.chart.renderer.xy.XYBarRenderer.this.base = base;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.XYBarRenderer.this));
	}

	public boolean getUseYInterval() {
		return org.jfree.chart.renderer.xy.XYBarRenderer.this.useYInterval;
	}

	public void setUseYInterval(boolean use) {
		if ((org.jfree.chart.renderer.xy.XYBarRenderer.this.useYInterval) != use) {
			org.jfree.chart.renderer.xy.XYBarRenderer.this.useYInterval = use;
			notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.XYBarRenderer.this));
		}
	}

	public double getMargin() {
		return org.jfree.chart.renderer.xy.XYBarRenderer.this.margin;
	}

	public void setMargin(double margin) {
		org.jfree.chart.renderer.xy.XYBarRenderer.this.margin = margin;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.XYBarRenderer.this));
	}

	public boolean isDrawBarOutline() {
		return org.jfree.chart.renderer.xy.XYBarRenderer.this.drawBarOutline;
	}

	public void setDrawBarOutline(boolean draw) {
		org.jfree.chart.renderer.xy.XYBarRenderer.this.drawBarOutline = draw;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.XYBarRenderer.this));
	}

	public org.jfree.chart.util.GradientPaintTransformer getGradientPaintTransformer() {
		return org.jfree.chart.renderer.xy.XYBarRenderer.this.gradientPaintTransformer;
	}

	public void setGradientPaintTransformer(org.jfree.chart.util.GradientPaintTransformer transformer) {
		org.jfree.chart.renderer.xy.XYBarRenderer.this.gradientPaintTransformer = transformer;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.XYBarRenderer.this));
	}

	public java.awt.Shape getLegendBar() {
		return org.jfree.chart.renderer.xy.XYBarRenderer.this.legendBar;
	}

	public void setLegendBar(java.awt.Shape bar) {
		if (bar == null) {
			throw new java.lang.IllegalArgumentException("Null 'bar' argument.");
		}
		org.jfree.chart.renderer.xy.XYBarRenderer.this.legendBar = bar;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.XYBarRenderer.this));
	}

	public org.jfree.chart.labels.ItemLabelPosition getPositiveItemLabelPositionFallback() {
		return org.jfree.chart.renderer.xy.XYBarRenderer.this.positiveItemLabelPositionFallback;
	}

	public void setPositiveItemLabelPositionFallback(org.jfree.chart.labels.ItemLabelPosition position) {
		org.jfree.chart.renderer.xy.XYBarRenderer.this.positiveItemLabelPositionFallback = position;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.XYBarRenderer.this));
	}

	public org.jfree.chart.labels.ItemLabelPosition getNegativeItemLabelPositionFallback() {
		return org.jfree.chart.renderer.xy.XYBarRenderer.this.negativeItemLabelPositionFallback;
	}

	public void setNegativeItemLabelPositionFallback(org.jfree.chart.labels.ItemLabelPosition position) {
		org.jfree.chart.renderer.xy.XYBarRenderer.this.negativeItemLabelPositionFallback = position;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.XYBarRenderer.this));
	}

	public org.jfree.chart.renderer.xy.XYItemRendererState initialise(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.XYPlot plot, org.jfree.data.xy.XYDataset dataset, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.renderer.xy.XYBarRenderer.XYBarRendererState state = new org.jfree.chart.renderer.xy.XYBarRenderer.XYBarRendererState(info);
		org.jfree.chart.axis.ValueAxis rangeAxis = plot.getRangeAxisForDataset(plot.indexOf(dataset));
		state.setG2Base(rangeAxis.valueToJava2D(org.jfree.chart.renderer.xy.XYBarRenderer.this.base, dataArea, plot.getRangeAxisEdge()));
		return state;
	}

	public org.jfree.chart.LegendItem getLegendItem(int datasetIndex, int series) {
		org.jfree.chart.LegendItem result = null;
		org.jfree.chart.plot.XYPlot xyplot = getPlot();
		if (xyplot != null) {
			org.jfree.data.xy.XYDataset dataset = xyplot.getDataset(datasetIndex);
			if (dataset != null) {
				org.jfree.chart.labels.XYSeriesLabelGenerator lg = getLegendItemLabelGenerator();
				java.lang.String label = lg.generateLabel(dataset, series);
				java.lang.String description = label;
				java.lang.String toolTipText = null;
				if ((getLegendItemToolTipGenerator()) != null) {
					toolTipText = getLegendItemToolTipGenerator().generateLabel(dataset, series);
				}
				java.lang.String urlText = null;
				if ((getLegendItemURLGenerator()) != null) {
					urlText = getLegendItemURLGenerator().generateLabel(dataset, series);
				}
				java.awt.Shape shape = org.jfree.chart.renderer.xy.XYBarRenderer.this.legendBar;
				java.awt.Paint paint = lookupSeriesPaint(series);
				java.awt.Paint outlinePaint = lookupSeriesOutlinePaint(series);
				java.awt.Stroke outlineStroke = lookupSeriesOutlineStroke(series);
				if (org.jfree.chart.renderer.xy.XYBarRenderer.this.drawBarOutline) {
					result = new org.jfree.chart.LegendItem(label, description, toolTipText, urlText, shape, paint, outlineStroke, outlinePaint);
				}else {
					result = new org.jfree.chart.LegendItem(label, description, toolTipText, urlText, shape, paint);
				}
				result.setDataset(dataset);
				result.setDatasetIndex(datasetIndex);
				result.setSeriesKey(dataset.getSeriesKey(series));
				result.setSeriesIndex(series);
				if ((getGradientPaintTransformer()) != null) {
					result.setFillPaintTransformer(getGradientPaintTransformer());
				}
			}
		}
		return result;
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo info, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, org.jfree.chart.plot.CrosshairState crosshairState, int pass) {
		if (!(getItemVisible(series, item))) {
			return ;
		}
		org.jfree.data.xy.IntervalXYDataset intervalDataset = ((org.jfree.data.xy.IntervalXYDataset) (dataset));
		double value0;
		double value1;
		if (org.jfree.chart.renderer.xy.XYBarRenderer.this.useYInterval) {
			value0 = intervalDataset.getStartYValue(series, item);
			value1 = intervalDataset.getEndYValue(series, item);
		}else {
			value0 = org.jfree.chart.renderer.xy.XYBarRenderer.this.base;
			value1 = intervalDataset.getYValue(series, item);
		}
		if ((java.lang.Double.isNaN(value0)) || (java.lang.Double.isNaN(value1))) {
			return ;
		}
		if (value0 <= value1) {
			if (!(rangeAxis.getRange().intersects(value0, value1))) {
				return ;
			}
		}else {
			if (!(rangeAxis.getRange().intersects(value1, value0))) {
				return ;
			}
		}
		double translatedValue0 = rangeAxis.valueToJava2D(value0, dataArea, plot.getRangeAxisEdge());
		double translatedValue1 = rangeAxis.valueToJava2D(value1, dataArea, plot.getRangeAxisEdge());
		double bottom = java.lang.Math.min(translatedValue0, translatedValue1);
		double top = java.lang.Math.max(translatedValue0, translatedValue1);
		double startX = intervalDataset.getStartXValue(series, item);
		if (java.lang.Double.isNaN(startX)) {
			return ;
		}
		double endX = intervalDataset.getEndXValue(series, item);
		if (java.lang.Double.isNaN(endX)) {
			return ;
		}
		if (startX <= endX) {
			if (!(domainAxis.getRange().intersects(startX, endX))) {
				return ;
			}
		}else {
			if (!(domainAxis.getRange().intersects(endX, startX))) {
				return ;
			}
		}
		org.jfree.chart.util.RectangleEdge location = plot.getDomainAxisEdge();
		double translatedStartX = domainAxis.valueToJava2D(startX, dataArea, location);
		double translatedEndX = domainAxis.valueToJava2D(endX, dataArea, location);
		double translatedWidth = java.lang.Math.max(1, java.lang.Math.abs((translatedEndX - translatedStartX)));
		if ((getMargin()) > 0.0) {
			double cut = translatedWidth * (getMargin());
			translatedWidth = translatedWidth - cut;
			translatedStartX = translatedStartX + (cut / 2);
		}
		java.awt.geom.Rectangle2D bar = null;
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			bottom = java.lang.Math.max(bottom, dataArea.getMinX());
			top = java.lang.Math.min(top, dataArea.getMaxX());
			bar = new java.awt.geom.Rectangle2D.Double(bottom, java.lang.Math.min(translatedStartX, translatedEndX), (top - bottom), translatedWidth);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				bottom = java.lang.Math.max(bottom, dataArea.getMinY());
				top = java.lang.Math.min(top, dataArea.getMaxY());
				bar = new java.awt.geom.Rectangle2D.Double(java.lang.Math.min(translatedStartX, translatedEndX), bottom, translatedWidth, (top - bottom));
			}
		
		java.awt.Paint itemPaint = getItemPaint(series, item);
		if (((getGradientPaintTransformer()) != null) && (itemPaint instanceof java.awt.GradientPaint)) {
			java.awt.GradientPaint gp = ((java.awt.GradientPaint) (itemPaint));
			itemPaint = getGradientPaintTransformer().transform(gp, bar);
		}
		g2.setPaint(itemPaint);
		g2.fill(bar);
		if ((isDrawBarOutline()) && ((java.lang.Math.abs((translatedEndX - translatedStartX))) > 3)) {
			java.awt.Stroke stroke = getItemOutlineStroke(series, item);
			java.awt.Paint paint = getItemOutlinePaint(series, item);
			if ((stroke != null) && (paint != null)) {
				g2.setStroke(stroke);
				g2.setPaint(paint);
				g2.draw(bar);
			}
		}
		if (isItemLabelVisible(series, item)) {
			org.jfree.chart.labels.XYItemLabelGenerator generator = getItemLabelGenerator(series, item);
			drawItemLabel(g2, dataset, series, item, plot, generator, bar, (value1 < 0.0));
		}
		double x1 = (startX + endX) / 2.0;
		double y1 = dataset.getYValue(series, item);
		double transX1 = domainAxis.valueToJava2D(x1, dataArea, location);
		double transY1 = rangeAxis.valueToJava2D(y1, dataArea, plot.getRangeAxisEdge());
		int domainAxisIndex = plot.getDomainAxisIndex(domainAxis);
		int rangeAxisIndex = plot.getRangeAxisIndex(rangeAxis);
		updateCrosshairValues(crosshairState, x1, y1, domainAxisIndex, rangeAxisIndex, transX1, transY1, plot.getOrientation());
		org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
		if (entities != null) {
			addEntity(entities, bar, dataset, series, item, 0.0, 0.0);
		}
	}

	protected void drawItemLabel(java.awt.Graphics2D g2, org.jfree.data.xy.XYDataset dataset, int series, int item, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.labels.XYItemLabelGenerator generator, java.awt.geom.Rectangle2D bar, boolean negative) {
		java.lang.String label = generator.generateLabel(dataset, series, item);
		if (label == null) {
			return ;
		}
		java.awt.Font labelFont = getItemLabelFont(series, item);
		g2.setFont(labelFont);
		java.awt.Paint paint = getItemLabelPaint(series, item);
		g2.setPaint(paint);
		org.jfree.chart.labels.ItemLabelPosition position = null;
		if (!negative) {
			position = getPositiveItemLabelPosition(series, item);
		}else {
			position = getNegativeItemLabelPosition(series, item);
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

	public org.jfree.data.Range findDomainBounds(org.jfree.data.xy.XYDataset dataset) {
		if (dataset != null) {
			return org.jfree.data.general.DatasetUtilities.findDomainBounds(dataset, true);
		}else {
			return null;
		}
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.renderer.xy.XYBarRenderer result = ((org.jfree.chart.renderer.xy.XYBarRenderer) (super.clone()));
		if ((org.jfree.chart.renderer.xy.XYBarRenderer.this.gradientPaintTransformer) != null) {
			result.gradientPaintTransformer = ((org.jfree.chart.util.GradientPaintTransformer) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.renderer.xy.XYBarRenderer.this.gradientPaintTransformer)));
		}
		result.legendBar = org.jfree.chart.util.ShapeUtilities.clone(org.jfree.chart.renderer.xy.XYBarRenderer.this.legendBar);
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.XYBarRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.XYBarRenderer)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.renderer.xy.XYBarRenderer that = ((org.jfree.chart.renderer.xy.XYBarRenderer) (obj));
		if ((org.jfree.chart.renderer.xy.XYBarRenderer.this.base) != (that.base)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYBarRenderer.this.drawBarOutline) != (that.drawBarOutline)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYBarRenderer.this.margin) != (that.margin)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYBarRenderer.this.useYInterval) != (that.useYInterval)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.xy.XYBarRenderer.this.gradientPaintTransformer, that.gradientPaintTransformer))) {
			return false;
		}
		if (!(org.jfree.chart.util.ShapeUtilities.equal(org.jfree.chart.renderer.xy.XYBarRenderer.this.legendBar, that.legendBar))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.xy.XYBarRenderer.this.positiveItemLabelPositionFallback, that.positiveItemLabelPositionFallback))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.xy.XYBarRenderer.this.negativeItemLabelPositionFallback, that.negativeItemLabelPositionFallback))) {
			return false;
		}
		return true;
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.xy.XYBarRenderer.this.legendBar = org.jfree.chart.util.SerialUtilities.readShape(stream);
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.renderer.xy.XYBarRenderer.this.legendBar, stream);
	}
}


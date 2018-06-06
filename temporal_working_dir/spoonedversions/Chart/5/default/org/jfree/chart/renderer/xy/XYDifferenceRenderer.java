

package org.jfree.chart.renderer.xy;


public class XYDifferenceRenderer extends org.jfree.chart.renderer.xy.AbstractXYItemRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.renderer.xy.XYItemRenderer , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -8447915602375584857L;

	private transient java.awt.Paint positivePaint;

	private transient java.awt.Paint negativePaint;

	private boolean shapesVisible;

	private transient java.awt.Shape legendLine;

	private boolean roundXCoordinates;

	public XYDifferenceRenderer() {
		this(java.awt.Color.green, java.awt.Color.red, false);
	}

	public XYDifferenceRenderer(java.awt.Paint positivePaint, java.awt.Paint negativePaint, boolean shapes) {
		if (positivePaint == null) {
			throw new java.lang.IllegalArgumentException("Null 'positivePaint' argument.");
		}
		if (negativePaint == null) {
			throw new java.lang.IllegalArgumentException("Null 'negativePaint' argument.");
		}
		org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.positivePaint = positivePaint;
		org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.negativePaint = negativePaint;
		org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.shapesVisible = shapes;
		org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.legendLine = new java.awt.geom.Line2D.Double((-7.0), 0.0, 7.0, 0.0);
		org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.roundXCoordinates = false;
	}

	public java.awt.Paint getPositivePaint() {
		return org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.positivePaint;
	}

	public void setPositivePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.positivePaint = paint;
		fireChangeEvent();
	}

	public java.awt.Paint getNegativePaint() {
		return org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.negativePaint;
	}

	public void setNegativePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.negativePaint = paint;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.XYDifferenceRenderer.this));
	}

	public boolean getShapesVisible() {
		return org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.shapesVisible;
	}

	public void setShapesVisible(boolean flag) {
		org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.shapesVisible = flag;
		fireChangeEvent();
	}

	public java.awt.Shape getLegendLine() {
		return org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.legendLine;
	}

	public void setLegendLine(java.awt.Shape line) {
		if (line == null) {
			throw new java.lang.IllegalArgumentException("Null 'line' argument.");
		}
		org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.legendLine = line;
		fireChangeEvent();
	}

	public boolean getRoundXCoordinates() {
		return org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.roundXCoordinates;
	}

	public void setRoundXCoordinates(boolean round) {
		org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.roundXCoordinates = round;
		fireChangeEvent();
	}

	public org.jfree.chart.renderer.xy.XYItemRendererState initialise(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.XYPlot plot, org.jfree.data.xy.XYDataset data, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.renderer.xy.XYItemRendererState state = super.initialise(g2, dataArea, plot, data, info);
		state.setProcessVisibleItemsOnly(false);
		return state;
	}

	public int getPassCount() {
		return 2;
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo info, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, org.jfree.chart.plot.CrosshairState crosshairState, int pass) {
		if (pass == 0) {
			drawItemPass0(g2, dataArea, info, plot, domainAxis, rangeAxis, dataset, series, item, crosshairState);
		}else
			if (pass == 1) {
				drawItemPass1(g2, dataArea, info, plot, domainAxis, rangeAxis, dataset, series, item, crosshairState);
			}
		
	}

	protected void drawItemPass0(java.awt.Graphics2D x_graphics, java.awt.geom.Rectangle2D x_dataArea, org.jfree.chart.plot.PlotRenderingInfo x_info, org.jfree.chart.plot.XYPlot x_plot, org.jfree.chart.axis.ValueAxis x_domainAxis, org.jfree.chart.axis.ValueAxis x_rangeAxis, org.jfree.data.xy.XYDataset x_dataset, int x_series, int x_item, org.jfree.chart.plot.CrosshairState x_crosshairState) {
		if (!((0 == x_series) && (0 == x_item))) {
			return ;
		}
		boolean b_impliedZeroSubtrahend = 1 == (x_dataset.getSeriesCount());
		if (isEitherSeriesDegenerate(x_dataset, b_impliedZeroSubtrahend)) {
			return ;
		}
		if ((!b_impliedZeroSubtrahend) && (areSeriesDisjoint(x_dataset))) {
			return ;
		}
		java.util.LinkedList l_minuendXs = new java.util.LinkedList();
		java.util.LinkedList l_minuendYs = new java.util.LinkedList();
		java.util.LinkedList l_subtrahendXs = new java.util.LinkedList();
		java.util.LinkedList l_subtrahendYs = new java.util.LinkedList();
		java.util.LinkedList l_polygonXs = new java.util.LinkedList();
		java.util.LinkedList l_polygonYs = new java.util.LinkedList();
		int l_minuendItem = 0;
		int l_minuendItemCount = x_dataset.getItemCount(0);
		java.lang.Double l_minuendCurX = null;
		java.lang.Double l_minuendNextX = null;
		java.lang.Double l_minuendCurY = null;
		java.lang.Double l_minuendNextY = null;
		double l_minuendMaxY = java.lang.Double.NEGATIVE_INFINITY;
		double l_minuendMinY = java.lang.Double.POSITIVE_INFINITY;
		int l_subtrahendItem = 0;
		int l_subtrahendItemCount = 0;
		java.lang.Double l_subtrahendCurX = null;
		java.lang.Double l_subtrahendNextX = null;
		java.lang.Double l_subtrahendCurY = null;
		java.lang.Double l_subtrahendNextY = null;
		double l_subtrahendMaxY = java.lang.Double.NEGATIVE_INFINITY;
		double l_subtrahendMinY = java.lang.Double.POSITIVE_INFINITY;
		if (b_impliedZeroSubtrahend) {
			l_subtrahendItem = 0;
			l_subtrahendItemCount = 2;
			l_subtrahendCurX = new java.lang.Double(x_dataset.getXValue(0, 0));
			l_subtrahendNextX = new java.lang.Double(x_dataset.getXValue(0, (l_minuendItemCount - 1)));
			l_subtrahendCurY = new java.lang.Double(0.0);
			l_subtrahendNextY = new java.lang.Double(0.0);
			l_subtrahendMaxY = 0.0;
			l_subtrahendMinY = 0.0;
			l_subtrahendXs.add(l_subtrahendCurX);
			l_subtrahendYs.add(l_subtrahendCurY);
		}else {
			l_subtrahendItemCount = x_dataset.getItemCount(1);
		}
		boolean b_minuendDone = false;
		boolean b_minuendAdvanced = true;
		boolean b_minuendAtIntersect = false;
		boolean b_minuendFastForward = false;
		boolean b_subtrahendDone = false;
		boolean b_subtrahendAdvanced = true;
		boolean b_subtrahendAtIntersect = false;
		boolean b_subtrahendFastForward = false;
		boolean b_colinear = false;
		boolean b_positive;
		double l_x1 = 0.0;
		double l_y1 = 0.0;
		double l_x2 = 0.0;
		double l_y2 = 0.0;
		double l_x3 = 0.0;
		double l_y3 = 0.0;
		double l_x4 = 0.0;
		double l_y4 = 0.0;
		boolean b_fastForwardDone = false;
		while (!b_fastForwardDone) {
			l_x1 = x_dataset.getXValue(0, l_minuendItem);
			l_y1 = x_dataset.getYValue(0, l_minuendItem);
			l_x2 = x_dataset.getXValue(0, (l_minuendItem + 1));
			l_y2 = x_dataset.getYValue(0, (l_minuendItem + 1));
			l_minuendCurX = new java.lang.Double(l_x1);
			l_minuendCurY = new java.lang.Double(l_y1);
			l_minuendNextX = new java.lang.Double(l_x2);
			l_minuendNextY = new java.lang.Double(l_y2);
			if (b_impliedZeroSubtrahend) {
				l_x3 = l_subtrahendCurX.doubleValue();
				l_y3 = l_subtrahendCurY.doubleValue();
				l_x4 = l_subtrahendNextX.doubleValue();
				l_y4 = l_subtrahendNextY.doubleValue();
			}else {
				l_x3 = x_dataset.getXValue(1, l_subtrahendItem);
				l_y3 = x_dataset.getYValue(1, l_subtrahendItem);
				l_x4 = x_dataset.getXValue(1, (l_subtrahendItem + 1));
				l_y4 = x_dataset.getYValue(1, (l_subtrahendItem + 1));
				l_subtrahendCurX = new java.lang.Double(l_x3);
				l_subtrahendCurY = new java.lang.Double(l_y3);
				l_subtrahendNextX = new java.lang.Double(l_x4);
				l_subtrahendNextY = new java.lang.Double(l_y4);
			}
			if (l_x2 <= l_x3) {
				l_minuendItem++;
				b_minuendFastForward = true;
				continue;
			}
			if (l_x4 <= l_x1) {
				l_subtrahendItem++;
				b_subtrahendFastForward = true;
				continue;
			}
			if ((l_x3 < l_x1) && (l_x1 < l_x4)) {
				double l_slope = (l_y4 - l_y3) / (l_x4 - l_x3);
				l_subtrahendCurX = l_minuendCurX;
				l_subtrahendCurY = new java.lang.Double(((l_slope * l_x1) + (l_y3 - (l_slope * l_x3))));
				l_subtrahendXs.add(l_subtrahendCurX);
				l_subtrahendYs.add(l_subtrahendCurY);
			}
			if ((l_x1 < l_x3) && (l_x3 < l_x2)) {
				double l_slope = (l_y2 - l_y1) / (l_x2 - l_x1);
				l_minuendCurX = l_subtrahendCurX;
				l_minuendCurY = new java.lang.Double(((l_slope * l_x3) + (l_y1 - (l_slope * l_x1))));
				l_minuendXs.add(l_minuendCurX);
				l_minuendYs.add(l_minuendCurY);
			}
			l_minuendMaxY = l_minuendCurY.doubleValue();
			l_minuendMinY = l_minuendCurY.doubleValue();
			l_subtrahendMaxY = l_subtrahendCurY.doubleValue();
			l_subtrahendMinY = l_subtrahendCurY.doubleValue();
			b_fastForwardDone = true;
		} 
		while ((!b_minuendDone) && (!b_subtrahendDone)) {
			if (((!b_minuendDone) && (!b_minuendFastForward)) && b_minuendAdvanced) {
				l_x1 = x_dataset.getXValue(0, l_minuendItem);
				l_y1 = x_dataset.getYValue(0, l_minuendItem);
				l_minuendCurX = new java.lang.Double(l_x1);
				l_minuendCurY = new java.lang.Double(l_y1);
				if (!b_minuendAtIntersect) {
					l_minuendXs.add(l_minuendCurX);
					l_minuendYs.add(l_minuendCurY);
				}
				l_minuendMaxY = java.lang.Math.max(l_minuendMaxY, l_y1);
				l_minuendMinY = java.lang.Math.min(l_minuendMinY, l_y1);
				l_x2 = x_dataset.getXValue(0, (l_minuendItem + 1));
				l_y2 = x_dataset.getYValue(0, (l_minuendItem + 1));
				l_minuendNextX = new java.lang.Double(l_x2);
				l_minuendNextY = new java.lang.Double(l_y2);
			}
			if ((((!b_impliedZeroSubtrahend) && (!b_subtrahendDone)) && (!b_subtrahendFastForward)) && b_subtrahendAdvanced) {
				l_x3 = x_dataset.getXValue(1, l_subtrahendItem);
				l_y3 = x_dataset.getYValue(1, l_subtrahendItem);
				l_subtrahendCurX = new java.lang.Double(l_x3);
				l_subtrahendCurY = new java.lang.Double(l_y3);
				if (!b_subtrahendAtIntersect) {
					l_subtrahendXs.add(l_subtrahendCurX);
					l_subtrahendYs.add(l_subtrahendCurY);
				}
				l_subtrahendMaxY = java.lang.Math.max(l_subtrahendMaxY, l_y3);
				l_subtrahendMinY = java.lang.Math.min(l_subtrahendMinY, l_y3);
				l_x4 = x_dataset.getXValue(1, (l_subtrahendItem + 1));
				l_y4 = x_dataset.getYValue(1, (l_subtrahendItem + 1));
				l_subtrahendNextX = new java.lang.Double(l_x4);
				l_subtrahendNextY = new java.lang.Double(l_y4);
			}
			b_minuendFastForward = false;
			b_subtrahendFastForward = false;
			java.lang.Double l_intersectX = null;
			java.lang.Double l_intersectY = null;
			boolean b_intersect = false;
			b_minuendAtIntersect = false;
			b_subtrahendAtIntersect = false;
			if ((l_x2 == l_x4) && (l_y2 == l_y4)) {
				if ((l_x1 == l_x3) && (l_y1 == l_y3)) {
					b_colinear = true;
				}else {
					l_intersectX = new java.lang.Double(l_x2);
					l_intersectY = new java.lang.Double(l_y2);
					b_intersect = true;
					b_minuendAtIntersect = true;
					b_subtrahendAtIntersect = true;
				}
			}else {
				double l_denominator = ((l_y4 - l_y3) * (l_x2 - l_x1)) - ((l_x4 - l_x3) * (l_y2 - l_y1));
				double l_deltaY = l_y1 - l_y3;
				double l_deltaX = l_x1 - l_x3;
				double l_numeratorA = ((l_x4 - l_x3) * l_deltaY) - ((l_y4 - l_y3) * l_deltaX);
				double l_numeratorB = ((l_x2 - l_x1) * l_deltaY) - ((l_y2 - l_y1) * l_deltaX);
				if (((0 == l_numeratorA) && (0 == l_numeratorB)) && (0 == l_denominator)) {
					b_colinear = true;
				}else {
					if (b_colinear) {
						l_minuendXs.clear();
						l_minuendYs.clear();
						l_subtrahendXs.clear();
						l_subtrahendYs.clear();
						l_polygonXs.clear();
						l_polygonYs.clear();
						b_colinear = false;
						boolean b_useMinuend = (l_x3 <= l_x1) && (l_x1 <= l_x4);
						l_polygonXs.add((b_useMinuend ? l_minuendCurX : l_subtrahendCurX));
						l_polygonYs.add((b_useMinuend ? l_minuendCurY : l_subtrahendCurY));
					}
					double l_slopeA = l_numeratorA / l_denominator;
					double l_slopeB = l_numeratorB / l_denominator;
					if ((((0 < l_slopeA) && (l_slopeA <= 1)) && (0 < l_slopeB)) && (l_slopeB <= 1)) {
						double l_xi = l_x1 + (l_slopeA * (l_x2 - l_x1));
						double l_yi = l_y1 + (l_slopeA * (l_y2 - l_y1));
						l_intersectX = new java.lang.Double(l_xi);
						l_intersectY = new java.lang.Double(l_yi);
						b_intersect = true;
						b_minuendAtIntersect = (l_xi == l_x2) && (l_yi == l_y2);
						b_subtrahendAtIntersect = (l_xi == l_x4) && (l_yi == l_y4);
						l_minuendCurX = l_intersectX;
						l_minuendCurY = l_intersectY;
						l_subtrahendCurX = l_intersectX;
						l_subtrahendCurY = l_intersectY;
					}
				}
			}
			if (b_intersect) {
				l_polygonXs.addAll(l_minuendXs);
				l_polygonYs.addAll(l_minuendYs);
				l_polygonXs.add(l_intersectX);
				l_polygonYs.add(l_intersectY);
				java.util.Collections.reverse(l_subtrahendXs);
				java.util.Collections.reverse(l_subtrahendYs);
				l_polygonXs.addAll(l_subtrahendXs);
				l_polygonYs.addAll(l_subtrahendYs);
				b_positive = (l_subtrahendMaxY <= l_minuendMaxY) && (l_subtrahendMinY <= l_minuendMinY);
				createPolygon(x_graphics, x_dataArea, x_plot, x_domainAxis, x_rangeAxis, b_positive, l_polygonXs, l_polygonYs);
				l_minuendXs.clear();
				l_minuendYs.clear();
				l_subtrahendXs.clear();
				l_subtrahendYs.clear();
				l_polygonXs.clear();
				l_polygonYs.clear();
				double l_y = l_intersectY.doubleValue();
				l_minuendMaxY = l_y;
				l_subtrahendMaxY = l_y;
				l_minuendMinY = l_y;
				l_subtrahendMinY = l_y;
				l_polygonXs.add(l_intersectX);
				l_polygonYs.add(l_intersectY);
			}
			if (l_x2 <= l_x4) {
				l_minuendItem++;
				b_minuendAdvanced = true;
			}else {
				b_minuendAdvanced = false;
			}
			if (l_x4 <= l_x2) {
				l_subtrahendItem++;
				b_subtrahendAdvanced = true;
			}else {
				b_subtrahendAdvanced = false;
			}
			b_minuendDone = l_minuendItem == (l_minuendItemCount - 1);
			b_subtrahendDone = l_subtrahendItem == (l_subtrahendItemCount - 1);
		} 
		if ((b_minuendDone && (l_x3 < l_x2)) && (l_x2 < l_x4)) {
			double l_slope = (l_y4 - l_y3) / (l_x4 - l_x3);
			l_subtrahendNextX = l_minuendNextX;
			l_subtrahendNextY = new java.lang.Double(((l_slope * l_x2) + (l_y3 - (l_slope * l_x3))));
		}
		if ((b_subtrahendDone && (l_x1 < l_x4)) && (l_x4 < l_x2)) {
			double l_slope = (l_y2 - l_y1) / (l_x2 - l_x1);
			l_minuendNextX = l_subtrahendNextX;
			l_minuendNextY = new java.lang.Double(((l_slope * l_x4) + (l_y1 - (l_slope * l_x1))));
		}
		l_minuendMaxY = java.lang.Math.max(l_minuendMaxY, l_minuendNextY.doubleValue());
		l_subtrahendMaxY = java.lang.Math.max(l_subtrahendMaxY, l_subtrahendNextY.doubleValue());
		l_minuendMinY = java.lang.Math.min(l_minuendMinY, l_minuendNextY.doubleValue());
		l_subtrahendMinY = java.lang.Math.min(l_subtrahendMinY, l_subtrahendNextY.doubleValue());
		l_minuendXs.add(l_minuendNextX);
		l_minuendYs.add(l_minuendNextY);
		l_subtrahendXs.add(l_subtrahendNextX);
		l_subtrahendYs.add(l_subtrahendNextY);
		l_polygonXs.addAll(l_minuendXs);
		l_polygonYs.addAll(l_minuendYs);
		java.util.Collections.reverse(l_subtrahendXs);
		java.util.Collections.reverse(l_subtrahendYs);
		l_polygonXs.addAll(l_subtrahendXs);
		l_polygonYs.addAll(l_subtrahendYs);
		b_positive = (l_subtrahendMaxY <= l_minuendMaxY) && (l_subtrahendMinY <= l_minuendMinY);
		createPolygon(x_graphics, x_dataArea, x_plot, x_domainAxis, x_rangeAxis, b_positive, l_polygonXs, l_polygonYs);
	}

	protected void drawItemPass1(java.awt.Graphics2D x_graphics, java.awt.geom.Rectangle2D x_dataArea, org.jfree.chart.plot.PlotRenderingInfo x_info, org.jfree.chart.plot.XYPlot x_plot, org.jfree.chart.axis.ValueAxis x_domainAxis, org.jfree.chart.axis.ValueAxis x_rangeAxis, org.jfree.data.xy.XYDataset x_dataset, int x_series, int x_item, org.jfree.chart.plot.CrosshairState x_crosshairState) {
		java.awt.Shape l_entityArea = null;
		org.jfree.chart.entity.EntityCollection l_entities = null;
		if (null != x_info) {
			l_entities = x_info.getOwner().getEntityCollection();
		}
		java.awt.Paint l_seriesPaint = getItemPaint(x_series, x_item);
		java.awt.Stroke l_seriesStroke = getItemStroke(x_series, x_item);
		x_graphics.setPaint(l_seriesPaint);
		x_graphics.setStroke(l_seriesStroke);
		org.jfree.chart.plot.PlotOrientation l_orientation = x_plot.getOrientation();
		org.jfree.chart.util.RectangleEdge l_domainAxisLocation = x_plot.getDomainAxisEdge();
		org.jfree.chart.util.RectangleEdge l_rangeAxisLocation = x_plot.getRangeAxisEdge();
		double l_x0 = x_dataset.getXValue(x_series, x_item);
		double l_y0 = x_dataset.getYValue(x_series, x_item);
		double l_x1 = x_domainAxis.valueToJava2D(l_x0, x_dataArea, l_domainAxisLocation);
		double l_y1 = x_rangeAxis.valueToJava2D(l_y0, x_dataArea, l_rangeAxisLocation);
		if (getShapesVisible()) {
			java.awt.Shape l_shape = getItemShape(x_series, x_item);
			if (l_orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				l_shape = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(l_shape, l_y1, l_x1);
			}else {
				l_shape = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(l_shape, l_x1, l_y1);
			}
			if (l_shape.intersects(x_dataArea)) {
				x_graphics.setPaint(getItemPaint(x_series, x_item));
				x_graphics.fill(l_shape);
			}
			l_entityArea = l_shape;
		}
		if (null != l_entities) {
			if (null == l_entityArea) {
				l_entityArea = new java.awt.geom.Rectangle2D.Double((l_x1 - 2), (l_y1 - 2), 4, 4);
			}
			java.lang.String l_tip = null;
			org.jfree.chart.labels.XYToolTipGenerator l_tipGenerator = getToolTipGenerator(x_series, x_item);
			if (null != l_tipGenerator) {
				l_tip = l_tipGenerator.generateToolTip(x_dataset, x_series, x_item);
			}
			java.lang.String l_url = null;
			org.jfree.chart.urls.XYURLGenerator l_urlGenerator = getURLGenerator(x_series, x_item);
			if (null != l_urlGenerator) {
				l_url = l_urlGenerator.generateURL(x_dataset, x_series, x_item);
			}
			org.jfree.chart.entity.XYItemEntity l_entity = new org.jfree.chart.entity.XYItemEntity(l_entityArea, x_dataset, x_series, x_item, l_tip, l_url);
			l_entities.add(l_entity);
		}
		if (isItemLabelVisible(x_series, x_item)) {
			drawItemLabel(x_graphics, l_orientation, x_dataset, x_series, x_item, l_x1, l_y1, (l_y1 < 0.0));
		}
		int l_domainAxisIndex = x_plot.getDomainAxisIndex(x_domainAxis);
		int l_rangeAxisIndex = x_plot.getRangeAxisIndex(x_rangeAxis);
		updateCrosshairValues(x_crosshairState, l_x0, l_y0, l_domainAxisIndex, l_rangeAxisIndex, l_x1, l_y1, l_orientation);
		if (0 == x_item) {
			return ;
		}
		double l_x2 = x_domainAxis.valueToJava2D(x_dataset.getXValue(x_series, (x_item - 1)), x_dataArea, l_domainAxisLocation);
		double l_y2 = x_rangeAxis.valueToJava2D(x_dataset.getYValue(x_series, (x_item - 1)), x_dataArea, l_rangeAxisLocation);
		java.awt.geom.Line2D l_line = null;
		if ((org.jfree.chart.plot.PlotOrientation.HORIZONTAL) == l_orientation) {
			l_line = new java.awt.geom.Line2D.Double(l_y1, l_x1, l_y2, l_x2);
		}else
			if ((org.jfree.chart.plot.PlotOrientation.VERTICAL) == l_orientation) {
				l_line = new java.awt.geom.Line2D.Double(l_x1, l_y1, l_x2, l_y2);
			}
		
		if ((null != l_line) && (l_line.intersects(x_dataArea))) {
			x_graphics.setPaint(getItemPaint(x_series, x_item));
			x_graphics.setStroke(getItemStroke(x_series, x_item));
			x_graphics.draw(l_line);
		}
	}

	private boolean isEitherSeriesDegenerate(org.jfree.data.xy.XYDataset x_dataset, boolean x_impliedZeroSubtrahend) {
		if (x_impliedZeroSubtrahend) {
			return (x_dataset.getItemCount(0)) < 2;
		}
		return ((x_dataset.getItemCount(0)) < 2) || ((x_dataset.getItemCount(1)) < 2);
	}

	private boolean areSeriesDisjoint(org.jfree.data.xy.XYDataset x_dataset) {
		int l_minuendItemCount = x_dataset.getItemCount(0);
		double l_minuendFirst = x_dataset.getXValue(0, 0);
		double l_minuendLast = x_dataset.getXValue(0, (l_minuendItemCount - 1));
		int l_subtrahendItemCount = x_dataset.getItemCount(1);
		double l_subtrahendFirst = x_dataset.getXValue(1, 0);
		double l_subtrahendLast = x_dataset.getXValue(1, (l_subtrahendItemCount - 1));
		return (l_minuendLast < l_subtrahendFirst) || (l_subtrahendLast < l_minuendFirst);
	}

	private void createPolygon(java.awt.Graphics2D x_graphics, java.awt.geom.Rectangle2D x_dataArea, org.jfree.chart.plot.XYPlot x_plot, org.jfree.chart.axis.ValueAxis x_domainAxis, org.jfree.chart.axis.ValueAxis x_rangeAxis, boolean x_positive, java.util.LinkedList x_xValues, java.util.LinkedList x_yValues) {
		org.jfree.chart.plot.PlotOrientation l_orientation = x_plot.getOrientation();
		org.jfree.chart.util.RectangleEdge l_domainAxisLocation = x_plot.getDomainAxisEdge();
		org.jfree.chart.util.RectangleEdge l_rangeAxisLocation = x_plot.getRangeAxisEdge();
		java.lang.Object[] l_xValues = x_xValues.toArray();
		java.lang.Object[] l_yValues = x_yValues.toArray();
		java.awt.geom.GeneralPath l_path = new java.awt.geom.GeneralPath();
		if ((org.jfree.chart.plot.PlotOrientation.VERTICAL) == l_orientation) {
			double l_x = x_domainAxis.valueToJava2D(((java.lang.Double) (l_xValues[0])).doubleValue(), x_dataArea, l_domainAxisLocation);
			if (org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.roundXCoordinates) {
				l_x = java.lang.Math.rint(l_x);
			}
			double l_y = x_rangeAxis.valueToJava2D(((java.lang.Double) (l_yValues[0])).doubleValue(), x_dataArea, l_rangeAxisLocation);
			l_path.moveTo(((float) (l_x)), ((float) (l_y)));
			for (int i = 1; i < (l_xValues.length); i++) {
				l_x = x_domainAxis.valueToJava2D(((java.lang.Double) (l_xValues[i])).doubleValue(), x_dataArea, l_domainAxisLocation);
				if (org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.roundXCoordinates) {
					l_x = java.lang.Math.rint(l_x);
				}
				l_y = x_rangeAxis.valueToJava2D(((java.lang.Double) (l_yValues[i])).doubleValue(), x_dataArea, l_rangeAxisLocation);
				l_path.lineTo(((float) (l_x)), ((float) (l_y)));
			}
			l_path.closePath();
		}else {
			double l_x = x_domainAxis.valueToJava2D(((java.lang.Double) (l_xValues[0])).doubleValue(), x_dataArea, l_domainAxisLocation);
			if (org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.roundXCoordinates) {
				l_x = java.lang.Math.rint(l_x);
			}
			double l_y = x_rangeAxis.valueToJava2D(((java.lang.Double) (l_yValues[0])).doubleValue(), x_dataArea, l_rangeAxisLocation);
			l_path.moveTo(((float) (l_y)), ((float) (l_x)));
			for (int i = 1; i < (l_xValues.length); i++) {
				l_x = x_domainAxis.valueToJava2D(((java.lang.Double) (l_xValues[i])).doubleValue(), x_dataArea, l_domainAxisLocation);
				if (org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.roundXCoordinates) {
					l_x = java.lang.Math.rint(l_x);
				}
				l_y = x_rangeAxis.valueToJava2D(((java.lang.Double) (l_yValues[i])).doubleValue(), x_dataArea, l_rangeAxisLocation);
				l_path.lineTo(((float) (l_y)), ((float) (l_x)));
			}
			l_path.closePath();
		}
		if (l_path.intersects(x_dataArea)) {
			x_graphics.setPaint((x_positive ? getPositivePaint() : getNegativePaint()));
			x_graphics.fill(l_path);
		}
	}

	public org.jfree.chart.LegendItem getLegendItem(int datasetIndex, int series) {
		org.jfree.chart.LegendItem result = null;
		org.jfree.chart.plot.XYPlot p = getPlot();
		if (p != null) {
			org.jfree.data.xy.XYDataset dataset = p.getDataset(datasetIndex);
			if (dataset != null) {
				if (getItemVisible(series, 0)) {
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
					java.awt.Paint paint = lookupSeriesPaint(series);
					java.awt.Stroke stroke = lookupSeriesStroke(series);
					java.awt.Shape line = getLegendLine();
					result = new org.jfree.chart.LegendItem(label, description, toolTipText, urlText, line, stroke, paint);
					result.setLabelFont(lookupLegendTextFont(series));
					java.awt.Paint labelPaint = lookupLegendTextPaint(series);
					if (labelPaint != null) {
						result.setLabelPaint(labelPaint);
					}
					result.setDataset(dataset);
					result.setDatasetIndex(datasetIndex);
					result.setSeriesKey(dataset.getSeriesKey(series));
					result.setSeriesIndex(series);
				}
			}
		}
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.XYDifferenceRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.XYDifferenceRenderer)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.renderer.xy.XYDifferenceRenderer that = ((org.jfree.chart.renderer.xy.XYDifferenceRenderer) (obj));
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.positivePaint, that.positivePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.negativePaint, that.negativePaint))) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.shapesVisible) != (that.shapesVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.ShapeUtilities.equal(org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.legendLine, that.legendLine))) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.roundXCoordinates) != (that.roundXCoordinates)) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.renderer.xy.XYDifferenceRenderer clone = ((org.jfree.chart.renderer.xy.XYDifferenceRenderer) (super.clone()));
		clone.legendLine = org.jfree.chart.util.ShapeUtilities.clone(org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.legendLine);
		return clone;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.positivePaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.negativePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.legendLine, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.positivePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.negativePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.renderer.xy.XYDifferenceRenderer.this.legendLine = org.jfree.chart.util.SerialUtilities.readShape(stream);
	}
}


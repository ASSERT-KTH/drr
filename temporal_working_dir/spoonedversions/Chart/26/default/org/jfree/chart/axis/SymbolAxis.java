

package org.jfree.chart.axis;


public class SymbolAxis extends org.jfree.chart.axis.NumberAxis implements java.io.Serializable {
	private static final long serialVersionUID = 7216330468770619716L;

	public static final java.awt.Paint DEFAULT_GRID_BAND_PAINT = new java.awt.Color(232, 234, 232, 128);

	private java.util.List symbols;

	private transient java.awt.Paint gridBandPaint;

	private boolean gridBandsVisible;

	public SymbolAxis(java.lang.String label, java.lang.String[] sv) {
		super(label);
		org.jfree.chart.axis.SymbolAxis.this.symbols = java.util.Arrays.asList(sv);
		org.jfree.chart.axis.SymbolAxis.this.gridBandsVisible = true;
		org.jfree.chart.axis.SymbolAxis.this.gridBandPaint = org.jfree.chart.axis.SymbolAxis.DEFAULT_GRID_BAND_PAINT;
		setAutoTickUnitSelection(false, false);
		setAutoRangeStickyZero(false);
	}

	public java.lang.String[] getSymbols() {
		java.lang.String[] result = new java.lang.String[org.jfree.chart.axis.SymbolAxis.this.symbols.size()];
		result = ((java.lang.String[]) (org.jfree.chart.axis.SymbolAxis.this.symbols.toArray(result)));
		return result;
	}

	public java.awt.Paint getGridBandPaint() {
		return org.jfree.chart.axis.SymbolAxis.this.gridBandPaint;
	}

	public void setGridBandPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.axis.SymbolAxis.this.gridBandPaint = paint;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.SymbolAxis.this));
	}

	public boolean isGridBandsVisible() {
		return org.jfree.chart.axis.SymbolAxis.this.gridBandsVisible;
	}

	public void setGridBandsVisible(boolean flag) {
		if ((org.jfree.chart.axis.SymbolAxis.this.gridBandsVisible) != flag) {
			org.jfree.chart.axis.SymbolAxis.this.gridBandsVisible = flag;
			notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.SymbolAxis.this));
		}
	}

	protected void selectAutoTickUnit(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		throw new java.lang.UnsupportedOperationException();
	}

	public org.jfree.chart.axis.AxisState draw(java.awt.Graphics2D g2, double cursor, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge, org.jfree.chart.plot.PlotRenderingInfo plotState) {
		org.jfree.chart.axis.AxisState info = new org.jfree.chart.axis.AxisState(cursor);
		if (isVisible()) {
			info = super.draw(g2, cursor, plotArea, dataArea, edge, plotState);
		}
		if (org.jfree.chart.axis.SymbolAxis.this.gridBandsVisible) {
			drawGridBands(g2, plotArea, dataArea, edge, info.getTicks());
		}
		return info;
	}

	protected void drawGridBands(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge, java.util.List ticks) {
		java.awt.Shape savedClip = g2.getClip();
		g2.clip(dataArea);
		if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(edge)) {
			drawGridBandsHorizontal(g2, plotArea, dataArea, true, ticks);
		}else
			if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
				drawGridBandsVertical(g2, plotArea, dataArea, true, ticks);
			}
		
		g2.setClip(savedClip);
	}

	protected void drawGridBandsHorizontal(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Rectangle2D dataArea, boolean firstGridBandIsDark, java.util.List ticks) {
		boolean currentGridBandIsDark = firstGridBandIsDark;
		double yy = dataArea.getY();
		double xx1;
		double xx2;
		double outlineStrokeWidth;
		if ((getPlot().getOutlineStroke()) != null) {
			outlineStrokeWidth = ((java.awt.BasicStroke) (getPlot().getOutlineStroke())).getLineWidth();
		}else {
			outlineStrokeWidth = 1.0;
		}
		java.util.Iterator iterator = ticks.iterator();
		org.jfree.chart.axis.ValueTick tick;
		java.awt.geom.Rectangle2D band;
		while (iterator.hasNext()) {
			tick = ((org.jfree.chart.axis.ValueTick) (iterator.next()));
			xx1 = valueToJava2D(((tick.getValue()) - 0.5), dataArea, org.jfree.chart.util.RectangleEdge.BOTTOM);
			xx2 = valueToJava2D(((tick.getValue()) + 0.5), dataArea, org.jfree.chart.util.RectangleEdge.BOTTOM);
			if (currentGridBandIsDark) {
				g2.setPaint(org.jfree.chart.axis.SymbolAxis.this.gridBandPaint);
			}else {
				g2.setPaint(java.awt.Color.white);
			}
			band = new java.awt.geom.Rectangle2D.Double(xx1, (yy + outlineStrokeWidth), (xx2 - xx1), (((dataArea.getMaxY()) - yy) - outlineStrokeWidth));
			g2.fill(band);
			currentGridBandIsDark = !currentGridBandIsDark;
		} 
		g2.setPaintMode();
	}

	protected void drawGridBandsVertical(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D drawArea, java.awt.geom.Rectangle2D plotArea, boolean firstGridBandIsDark, java.util.List ticks) {
		boolean currentGridBandIsDark = firstGridBandIsDark;
		double xx = plotArea.getX();
		double yy1;
		double yy2;
		double outlineStrokeWidth;
		java.awt.Stroke outlineStroke = getPlot().getOutlineStroke();
		if ((outlineStroke != null) && (outlineStroke instanceof java.awt.BasicStroke)) {
			outlineStrokeWidth = ((java.awt.BasicStroke) (outlineStroke)).getLineWidth();
		}else {
			outlineStrokeWidth = 1.0;
		}
		java.util.Iterator iterator = ticks.iterator();
		org.jfree.chart.axis.ValueTick tick;
		java.awt.geom.Rectangle2D band;
		while (iterator.hasNext()) {
			tick = ((org.jfree.chart.axis.ValueTick) (iterator.next()));
			yy1 = valueToJava2D(((tick.getValue()) + 0.5), plotArea, org.jfree.chart.util.RectangleEdge.LEFT);
			yy2 = valueToJava2D(((tick.getValue()) - 0.5), plotArea, org.jfree.chart.util.RectangleEdge.LEFT);
			if (currentGridBandIsDark) {
				g2.setPaint(org.jfree.chart.axis.SymbolAxis.this.gridBandPaint);
			}else {
				g2.setPaint(java.awt.Color.white);
			}
			band = new java.awt.geom.Rectangle2D.Double((xx + outlineStrokeWidth), yy1, (((plotArea.getMaxX()) - xx) - outlineStrokeWidth), (yy2 - yy1));
			g2.fill(band);
			currentGridBandIsDark = !currentGridBandIsDark;
		} 
		g2.setPaintMode();
	}

	protected void autoAdjustRange() {
		org.jfree.chart.plot.Plot plot = getPlot();
		if (plot == null) {
			return ;
		}
		if (plot instanceof org.jfree.chart.plot.ValueAxisPlot) {
			double upper = (org.jfree.chart.axis.SymbolAxis.this.symbols.size()) - 1;
			double lower = 0;
			double range = upper - lower;
			double minRange = getAutoRangeMinimumSize();
			if (range < minRange) {
				upper = ((upper + lower) + minRange) / 2;
				lower = ((upper + lower) - minRange) / 2;
			}
			double upperMargin = 0.5;
			double lowerMargin = 0.5;
			if (getAutoRangeIncludesZero()) {
				if (getAutoRangeStickyZero()) {
					if (upper <= 0.0) {
						upper = 0.0;
					}else {
						upper = upper + upperMargin;
					}
					if (lower >= 0.0) {
						lower = 0.0;
					}else {
						lower = lower - lowerMargin;
					}
				}else {
					upper = java.lang.Math.max(0.0, (upper + upperMargin));
					lower = java.lang.Math.min(0.0, (lower - lowerMargin));
				}
			}else {
				if (getAutoRangeStickyZero()) {
					if (upper <= 0.0) {
						upper = java.lang.Math.min(0.0, (upper + upperMargin));
					}else {
						upper = upper + (upperMargin * range);
					}
					if (lower >= 0.0) {
						lower = java.lang.Math.max(0.0, (lower - lowerMargin));
					}else {
						lower = lower - lowerMargin;
					}
				}else {
					upper = upper + upperMargin;
					lower = lower - lowerMargin;
				}
			}
			setRange(new org.jfree.data.Range(lower, upper), false, false);
		}
	}

	public java.util.List refreshTicks(java.awt.Graphics2D g2, org.jfree.chart.axis.AxisState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		java.util.List ticks = null;
		if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(edge)) {
			ticks = refreshTicksHorizontal(g2, dataArea, edge);
		}else
			if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
				ticks = refreshTicksVertical(g2, dataArea, edge);
			}
		
		return ticks;
	}

	protected java.util.List refreshTicksHorizontal(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		java.util.List ticks = new java.util.ArrayList();
		java.awt.Font tickLabelFont = getTickLabelFont();
		g2.setFont(tickLabelFont);
		double size = getTickUnit().getSize();
		int count = calculateVisibleTickCount();
		double lowestTickValue = calculateLowestVisibleTickValue();
		double previousDrawnTickLabelPos = 0.0;
		double previousDrawnTickLabelLength = 0.0;
		if (count <= (org.jfree.chart.axis.ValueAxis.MAXIMUM_TICK_COUNT)) {
			for (int i = 0; i < count; i++) {
				double currentTickValue = lowestTickValue + (i * size);
				double xx = valueToJava2D(currentTickValue, dataArea, edge);
				java.lang.String tickLabel;
				java.text.NumberFormat formatter = getNumberFormatOverride();
				if (formatter != null) {
					tickLabel = formatter.format(currentTickValue);
				}else {
					tickLabel = valueToString(currentTickValue);
				}
				java.awt.geom.Rectangle2D bounds = org.jfree.chart.text.TextUtilities.getTextBounds(tickLabel, g2, g2.getFontMetrics());
				double tickLabelLength = isVerticalTickLabels() ? bounds.getHeight() : bounds.getWidth();
				boolean tickLabelsOverlapping = false;
				if (i > 0) {
					double avgTickLabelLength = (previousDrawnTickLabelLength + tickLabelLength) / 2.0;
					if ((java.lang.Math.abs((xx - previousDrawnTickLabelPos))) < avgTickLabelLength) {
						tickLabelsOverlapping = true;
					}
				}
				if (tickLabelsOverlapping) {
					tickLabel = "";
				}else {
					previousDrawnTickLabelPos = xx;
					previousDrawnTickLabelLength = tickLabelLength;
				}
				org.jfree.chart.text.TextAnchor anchor = null;
				org.jfree.chart.text.TextAnchor rotationAnchor = null;
				double angle = 0.0;
				if (isVerticalTickLabels()) {
					anchor = org.jfree.chart.text.TextAnchor.CENTER_RIGHT;
					rotationAnchor = org.jfree.chart.text.TextAnchor.CENTER_RIGHT;
					if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
						angle = (java.lang.Math.PI) / 2.0;
					}else {
						angle = (-(java.lang.Math.PI)) / 2.0;
					}
				}else {
					if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
						anchor = org.jfree.chart.text.TextAnchor.BOTTOM_CENTER;
						rotationAnchor = org.jfree.chart.text.TextAnchor.BOTTOM_CENTER;
					}else {
						anchor = org.jfree.chart.text.TextAnchor.TOP_CENTER;
						rotationAnchor = org.jfree.chart.text.TextAnchor.TOP_CENTER;
					}
				}
				org.jfree.chart.axis.Tick tick = new org.jfree.chart.axis.NumberTick(new java.lang.Double(currentTickValue), tickLabel, anchor, rotationAnchor, angle);
				ticks.add(tick);
			}
		}
		return ticks;
	}

	protected java.util.List refreshTicksVertical(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		java.util.List ticks = new java.util.ArrayList();
		java.awt.Font tickLabelFont = getTickLabelFont();
		g2.setFont(tickLabelFont);
		double size = getTickUnit().getSize();
		int count = calculateVisibleTickCount();
		double lowestTickValue = calculateLowestVisibleTickValue();
		double previousDrawnTickLabelPos = 0.0;
		double previousDrawnTickLabelLength = 0.0;
		if (count <= (org.jfree.chart.axis.ValueAxis.MAXIMUM_TICK_COUNT)) {
			for (int i = 0; i < count; i++) {
				double currentTickValue = lowestTickValue + (i * size);
				double yy = valueToJava2D(currentTickValue, dataArea, edge);
				java.lang.String tickLabel;
				java.text.NumberFormat formatter = getNumberFormatOverride();
				if (formatter != null) {
					tickLabel = formatter.format(currentTickValue);
				}else {
					tickLabel = valueToString(currentTickValue);
				}
				java.awt.geom.Rectangle2D bounds = org.jfree.chart.text.TextUtilities.getTextBounds(tickLabel, g2, g2.getFontMetrics());
				double tickLabelLength = isVerticalTickLabels() ? bounds.getWidth() : bounds.getHeight();
				boolean tickLabelsOverlapping = false;
				if (i > 0) {
					double avgTickLabelLength = (previousDrawnTickLabelLength + tickLabelLength) / 2.0;
					if ((java.lang.Math.abs((yy - previousDrawnTickLabelPos))) < avgTickLabelLength) {
						tickLabelsOverlapping = true;
					}
				}
				if (tickLabelsOverlapping) {
					tickLabel = "";
				}else {
					previousDrawnTickLabelPos = yy;
					previousDrawnTickLabelLength = tickLabelLength;
				}
				org.jfree.chart.text.TextAnchor anchor = null;
				org.jfree.chart.text.TextAnchor rotationAnchor = null;
				double angle = 0.0;
				if (isVerticalTickLabels()) {
					anchor = org.jfree.chart.text.TextAnchor.BOTTOM_CENTER;
					rotationAnchor = org.jfree.chart.text.TextAnchor.BOTTOM_CENTER;
					if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
						angle = (-(java.lang.Math.PI)) / 2.0;
					}else {
						angle = (java.lang.Math.PI) / 2.0;
					}
				}else {
					if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
						anchor = org.jfree.chart.text.TextAnchor.CENTER_RIGHT;
						rotationAnchor = org.jfree.chart.text.TextAnchor.CENTER_RIGHT;
					}else {
						anchor = org.jfree.chart.text.TextAnchor.CENTER_LEFT;
						rotationAnchor = org.jfree.chart.text.TextAnchor.CENTER_LEFT;
					}
				}
				org.jfree.chart.axis.Tick tick = new org.jfree.chart.axis.NumberTick(new java.lang.Double(currentTickValue), tickLabel, anchor, rotationAnchor, angle);
				ticks.add(tick);
			}
		}
		return ticks;
	}

	public java.lang.String valueToString(double value) {
		java.lang.String strToReturn;
		try {
			strToReturn = ((java.lang.String) (org.jfree.chart.axis.SymbolAxis.this.symbols.get(((int) (value)))));
		} catch (java.lang.IndexOutOfBoundsException ex) {
			strToReturn = "";
		}
		return strToReturn;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.axis.SymbolAxis.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.SymbolAxis)) {
			return false;
		}
		org.jfree.chart.axis.SymbolAxis that = ((org.jfree.chart.axis.SymbolAxis) (obj));
		if (!(org.jfree.chart.axis.SymbolAxis.this.symbols.equals(that.symbols))) {
			return false;
		}
		if ((org.jfree.chart.axis.SymbolAxis.this.gridBandsVisible) != (that.gridBandsVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.axis.SymbolAxis.this.gridBandPaint, that.gridBandPaint))) {
			return false;
		}
		return super.equals(obj);
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.axis.SymbolAxis.this.gridBandPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.axis.SymbolAxis.this.gridBandPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}


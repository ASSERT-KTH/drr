

package org.jfree.chart.axis;


public class CyclicNumberAxis extends org.jfree.chart.axis.NumberAxis {
	static final long serialVersionUID = -7514160997164582554L;

	public static java.awt.Stroke DEFAULT_ADVANCE_LINE_STROKE = new java.awt.BasicStroke(1.0F);

	public static final java.awt.Paint DEFAULT_ADVANCE_LINE_PAINT = java.awt.Color.gray;

	protected double offset;

	protected double period;

	protected boolean boundMappedToLastCycle;

	protected boolean advanceLineVisible;

	protected transient java.awt.Stroke advanceLineStroke = org.jfree.chart.axis.CyclicNumberAxis.DEFAULT_ADVANCE_LINE_STROKE;

	protected transient java.awt.Paint advanceLinePaint;

	private transient boolean internalMarkerWhenTicksOverlap;

	private transient org.jfree.chart.axis.Tick internalMarkerCycleBoundTick;

	public CyclicNumberAxis(double period) {
		this(period, 0.0);
	}

	public CyclicNumberAxis(double period, double offset) {
		this(period, offset, null);
	}

	public CyclicNumberAxis(double period, java.lang.String label) {
		this(0, period, label);
	}

	public CyclicNumberAxis(double period, double offset, java.lang.String label) {
		super(label);
		org.jfree.chart.axis.CyclicNumberAxis.this.period = period;
		org.jfree.chart.axis.CyclicNumberAxis.this.offset = offset;
		setFixedAutoRange(period);
		org.jfree.chart.axis.CyclicNumberAxis.this.advanceLineVisible = true;
		org.jfree.chart.axis.CyclicNumberAxis.this.advanceLinePaint = org.jfree.chart.axis.CyclicNumberAxis.DEFAULT_ADVANCE_LINE_PAINT;
	}

	public boolean isAdvanceLineVisible() {
		return org.jfree.chart.axis.CyclicNumberAxis.this.advanceLineVisible;
	}

	public void setAdvanceLineVisible(boolean visible) {
		org.jfree.chart.axis.CyclicNumberAxis.this.advanceLineVisible = visible;
	}

	public java.awt.Paint getAdvanceLinePaint() {
		return org.jfree.chart.axis.CyclicNumberAxis.this.advanceLinePaint;
	}

	public void setAdvanceLinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.axis.CyclicNumberAxis.this.advanceLinePaint = paint;
	}

	public java.awt.Stroke getAdvanceLineStroke() {
		return org.jfree.chart.axis.CyclicNumberAxis.this.advanceLineStroke;
	}

	public void setAdvanceLineStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.axis.CyclicNumberAxis.this.advanceLineStroke = stroke;
	}

	public boolean isBoundMappedToLastCycle() {
		return org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle;
	}

	public void setBoundMappedToLastCycle(boolean boundMappedToLastCycle) {
		org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle = boundMappedToLastCycle;
	}

	protected void selectHorizontalAutoTickUnit(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D drawArea, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		double tickLabelWidth = estimateMaximumTickLabelWidth(g2, getTickUnit());
		double n = ((getRange().getLength()) * tickLabelWidth) / (dataArea.getWidth());
		setTickUnit(((org.jfree.chart.axis.NumberTickUnit) (getStandardTickUnits().getCeilingTickUnit(n))), false, false);
	}

	protected void selectVerticalAutoTickUnit(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D drawArea, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		double tickLabelWidth = estimateMaximumTickLabelWidth(g2, getTickUnit());
		double n = ((getRange().getLength()) * tickLabelWidth) / (dataArea.getHeight());
		setTickUnit(((org.jfree.chart.axis.NumberTickUnit) (getStandardTickUnits().getCeilingTickUnit(n))), false, false);
	}

	protected static class CycleBoundTick extends org.jfree.chart.axis.NumberTick {
		public boolean mapToLastCycle;

		public CycleBoundTick(boolean mapToLastCycle, java.lang.Number number, java.lang.String label, org.jfree.chart.text.TextAnchor textAnchor, org.jfree.chart.text.TextAnchor rotationAnchor, double angle) {
			super(number, label, textAnchor, rotationAnchor, angle);
			org.jfree.chart.axis.CyclicNumberAxis.CycleBoundTick.this.mapToLastCycle = mapToLastCycle;
		}
	}

	protected float[] calculateAnchorPoint(org.jfree.chart.axis.ValueTick tick, double cursor, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		if (tick instanceof org.jfree.chart.axis.CyclicNumberAxis.CycleBoundTick) {
			boolean mapsav = org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle;
			org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle = ((org.jfree.chart.axis.CyclicNumberAxis.CycleBoundTick) (tick)).mapToLastCycle;
			float[] ret = super.calculateAnchorPoint(tick, cursor, dataArea, edge);
			org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle = mapsav;
			return ret;
		}
		return super.calculateAnchorPoint(tick, cursor, dataArea, edge);
	}

	protected java.util.List refreshTicksHorizontal(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		java.util.List result = new java.util.ArrayList();
		java.awt.Font tickLabelFont = getTickLabelFont();
		g2.setFont(tickLabelFont);
		if (isAutoTickUnitSelection()) {
			selectAutoTickUnit(g2, dataArea, edge);
		}
		double unit = getTickUnit().getSize();
		double cycleBound = getCycleBound();
		double currentTickValue = (java.lang.Math.ceil((cycleBound / unit))) * unit;
		double upperValue = getRange().getUpperBound();
		boolean cycled = false;
		boolean boundMapping = org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle;
		org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle = false;
		org.jfree.chart.axis.CyclicNumberAxis.CycleBoundTick lastTick = null;
		float lastX = 0.0F;
		if (upperValue == cycleBound) {
			currentTickValue = calculateLowestVisibleTickValue();
			cycled = true;
			org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle = true;
		}
		while (currentTickValue <= upperValue) {
			boolean cyclenow = false;
			if (((currentTickValue + unit) > upperValue) && (!cycled)) {
				cyclenow = true;
			}
			double xx = valueToJava2D(currentTickValue, dataArea, edge);
			java.lang.String tickLabel;
			java.text.NumberFormat formatter = getNumberFormatOverride();
			if (formatter != null) {
				tickLabel = formatter.format(currentTickValue);
			}else {
				tickLabel = getTickUnit().valueToString(currentTickValue);
			}
			float x = ((float) (xx));
			org.jfree.chart.text.TextAnchor anchor = null;
			org.jfree.chart.text.TextAnchor rotationAnchor = null;
			double angle = 0.0;
			if (isVerticalTickLabels()) {
				if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
					angle = (java.lang.Math.PI) / 2.0;
				}else {
					angle = (-(java.lang.Math.PI)) / 2.0;
				}
				anchor = org.jfree.chart.text.TextAnchor.CENTER_RIGHT;
				if (((lastTick != null) && (lastX == x)) && (currentTickValue != cycleBound)) {
					anchor = (isInverted()) ? org.jfree.chart.text.TextAnchor.TOP_RIGHT : org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT;
					result.remove(((result.size()) - 1));
					result.add(new org.jfree.chart.axis.CyclicNumberAxis.CycleBoundTick(org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle, lastTick.getNumber(), lastTick.getText(), anchor, anchor, lastTick.getAngle()));
					org.jfree.chart.axis.CyclicNumberAxis.this.internalMarkerWhenTicksOverlap = true;
					anchor = (isInverted()) ? org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT : org.jfree.chart.text.TextAnchor.TOP_RIGHT;
				}
				rotationAnchor = anchor;
			}else {
				if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
					anchor = org.jfree.chart.text.TextAnchor.BOTTOM_CENTER;
					if (((lastTick != null) && (lastX == x)) && (currentTickValue != cycleBound)) {
						anchor = (isInverted()) ? org.jfree.chart.text.TextAnchor.BOTTOM_LEFT : org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT;
						result.remove(((result.size()) - 1));
						result.add(new org.jfree.chart.axis.CyclicNumberAxis.CycleBoundTick(org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle, lastTick.getNumber(), lastTick.getText(), anchor, anchor, lastTick.getAngle()));
						org.jfree.chart.axis.CyclicNumberAxis.this.internalMarkerWhenTicksOverlap = true;
						anchor = (isInverted()) ? org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT : org.jfree.chart.text.TextAnchor.BOTTOM_LEFT;
					}
					rotationAnchor = anchor;
				}else {
					anchor = org.jfree.chart.text.TextAnchor.TOP_CENTER;
					if (((lastTick != null) && (lastX == x)) && (currentTickValue != cycleBound)) {
						anchor = (isInverted()) ? org.jfree.chart.text.TextAnchor.TOP_LEFT : org.jfree.chart.text.TextAnchor.TOP_RIGHT;
						result.remove(((result.size()) - 1));
						result.add(new org.jfree.chart.axis.CyclicNumberAxis.CycleBoundTick(org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle, lastTick.getNumber(), lastTick.getText(), anchor, anchor, lastTick.getAngle()));
						org.jfree.chart.axis.CyclicNumberAxis.this.internalMarkerWhenTicksOverlap = true;
						anchor = (isInverted()) ? org.jfree.chart.text.TextAnchor.TOP_RIGHT : org.jfree.chart.text.TextAnchor.TOP_LEFT;
					}
					rotationAnchor = anchor;
				}
			}
			org.jfree.chart.axis.CyclicNumberAxis.CycleBoundTick tick = new org.jfree.chart.axis.CyclicNumberAxis.CycleBoundTick(org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle, new java.lang.Double(currentTickValue), tickLabel, anchor, rotationAnchor, angle);
			if (currentTickValue == cycleBound) {
				org.jfree.chart.axis.CyclicNumberAxis.this.internalMarkerCycleBoundTick = tick;
			}
			result.add(tick);
			lastTick = tick;
			lastX = x;
			currentTickValue += unit;
			if (cyclenow) {
				currentTickValue = calculateLowestVisibleTickValue();
				upperValue = cycleBound;
				cycled = true;
				org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle = true;
			}
		} 
		org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle = boundMapping;
		return result;
	}

	protected java.util.List refreshVerticalTicks(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		java.util.List result = new java.util.ArrayList();
		result.clear();
		java.awt.Font tickLabelFont = getTickLabelFont();
		g2.setFont(tickLabelFont);
		if (isAutoTickUnitSelection()) {
			selectAutoTickUnit(g2, dataArea, edge);
		}
		double unit = getTickUnit().getSize();
		double cycleBound = getCycleBound();
		double currentTickValue = (java.lang.Math.ceil((cycleBound / unit))) * unit;
		double upperValue = getRange().getUpperBound();
		boolean cycled = false;
		boolean boundMapping = org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle;
		org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle = true;
		org.jfree.chart.axis.NumberTick lastTick = null;
		float lastY = 0.0F;
		if (upperValue == cycleBound) {
			currentTickValue = calculateLowestVisibleTickValue();
			cycled = true;
			org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle = true;
		}
		while (currentTickValue <= upperValue) {
			boolean cyclenow = false;
			if (((currentTickValue + unit) > upperValue) && (!cycled)) {
				cyclenow = true;
			}
			double yy = valueToJava2D(currentTickValue, dataArea, edge);
			java.lang.String tickLabel;
			java.text.NumberFormat formatter = getNumberFormatOverride();
			if (formatter != null) {
				tickLabel = formatter.format(currentTickValue);
			}else {
				tickLabel = getTickUnit().valueToString(currentTickValue);
			}
			float y = ((float) (yy));
			org.jfree.chart.text.TextAnchor anchor = null;
			org.jfree.chart.text.TextAnchor rotationAnchor = null;
			double angle = 0.0;
			if (isVerticalTickLabels()) {
				if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
					anchor = org.jfree.chart.text.TextAnchor.BOTTOM_CENTER;
					if (((lastTick != null) && (lastY == y)) && (currentTickValue != cycleBound)) {
						anchor = (isInverted()) ? org.jfree.chart.text.TextAnchor.BOTTOM_LEFT : org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT;
						result.remove(((result.size()) - 1));
						result.add(new org.jfree.chart.axis.CyclicNumberAxis.CycleBoundTick(org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle, lastTick.getNumber(), lastTick.getText(), anchor, anchor, lastTick.getAngle()));
						org.jfree.chart.axis.CyclicNumberAxis.this.internalMarkerWhenTicksOverlap = true;
						anchor = (isInverted()) ? org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT : org.jfree.chart.text.TextAnchor.BOTTOM_LEFT;
					}
					rotationAnchor = anchor;
					angle = (-(java.lang.Math.PI)) / 2.0;
				}else {
					anchor = org.jfree.chart.text.TextAnchor.BOTTOM_CENTER;
					if (((lastTick != null) && (lastY == y)) && (currentTickValue != cycleBound)) {
						anchor = (isInverted()) ? org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT : org.jfree.chart.text.TextAnchor.BOTTOM_LEFT;
						result.remove(((result.size()) - 1));
						result.add(new org.jfree.chart.axis.CyclicNumberAxis.CycleBoundTick(org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle, lastTick.getNumber(), lastTick.getText(), anchor, anchor, lastTick.getAngle()));
						org.jfree.chart.axis.CyclicNumberAxis.this.internalMarkerWhenTicksOverlap = true;
						anchor = (isInverted()) ? org.jfree.chart.text.TextAnchor.BOTTOM_LEFT : org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT;
					}
					rotationAnchor = anchor;
					angle = (java.lang.Math.PI) / 2.0;
				}
			}else {
				if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
					anchor = org.jfree.chart.text.TextAnchor.CENTER_RIGHT;
					if (((lastTick != null) && (lastY == y)) && (currentTickValue != cycleBound)) {
						anchor = (isInverted()) ? org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT : org.jfree.chart.text.TextAnchor.TOP_RIGHT;
						result.remove(((result.size()) - 1));
						result.add(new org.jfree.chart.axis.CyclicNumberAxis.CycleBoundTick(org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle, lastTick.getNumber(), lastTick.getText(), anchor, anchor, lastTick.getAngle()));
						org.jfree.chart.axis.CyclicNumberAxis.this.internalMarkerWhenTicksOverlap = true;
						anchor = (isInverted()) ? org.jfree.chart.text.TextAnchor.TOP_RIGHT : org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT;
					}
					rotationAnchor = anchor;
				}else {
					anchor = org.jfree.chart.text.TextAnchor.CENTER_LEFT;
					if (((lastTick != null) && (lastY == y)) && (currentTickValue != cycleBound)) {
						anchor = (isInverted()) ? org.jfree.chart.text.TextAnchor.BOTTOM_LEFT : org.jfree.chart.text.TextAnchor.TOP_LEFT;
						result.remove(((result.size()) - 1));
						result.add(new org.jfree.chart.axis.CyclicNumberAxis.CycleBoundTick(org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle, lastTick.getNumber(), lastTick.getText(), anchor, anchor, lastTick.getAngle()));
						org.jfree.chart.axis.CyclicNumberAxis.this.internalMarkerWhenTicksOverlap = true;
						anchor = (isInverted()) ? org.jfree.chart.text.TextAnchor.TOP_LEFT : org.jfree.chart.text.TextAnchor.BOTTOM_LEFT;
					}
					rotationAnchor = anchor;
				}
			}
			org.jfree.chart.axis.CyclicNumberAxis.CycleBoundTick tick = new org.jfree.chart.axis.CyclicNumberAxis.CycleBoundTick(org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle, new java.lang.Double(currentTickValue), tickLabel, anchor, rotationAnchor, angle);
			if (currentTickValue == cycleBound) {
				org.jfree.chart.axis.CyclicNumberAxis.this.internalMarkerCycleBoundTick = tick;
			}
			result.add(tick);
			lastTick = tick;
			lastY = y;
			if (currentTickValue == cycleBound) {
				org.jfree.chart.axis.CyclicNumberAxis.this.internalMarkerCycleBoundTick = tick;
			}
			currentTickValue += unit;
			if (cyclenow) {
				currentTickValue = calculateLowestVisibleTickValue();
				upperValue = cycleBound;
				cycled = true;
				org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle = false;
			}
		} 
		org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle = boundMapping;
		return result;
	}

	public double java2DToValue(double java2DValue, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		org.jfree.data.Range range = getRange();
		double vmax = range.getUpperBound();
		double vp = getCycleBound();
		double jmin = 0.0;
		double jmax = 0.0;
		if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(edge)) {
			jmin = dataArea.getMinX();
			jmax = dataArea.getMaxX();
		}else
			if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
				jmin = dataArea.getMaxY();
				jmax = dataArea.getMinY();
			}
		
		if (isInverted()) {
			double jbreak = jmax - (((vmax - vp) * (jmax - jmin)) / (org.jfree.chart.axis.CyclicNumberAxis.this.period));
			if (java2DValue >= jbreak) {
				return vp + (((jmax - java2DValue) * (org.jfree.chart.axis.CyclicNumberAxis.this.period)) / (jmax - jmin));
			}else {
				return vp - (((java2DValue - jmin) * (org.jfree.chart.axis.CyclicNumberAxis.this.period)) / (jmax - jmin));
			}
		}else {
			double jbreak = (((vmax - vp) * (jmax - jmin)) / (org.jfree.chart.axis.CyclicNumberAxis.this.period)) + jmin;
			if (java2DValue <= jbreak) {
				return vp + (((java2DValue - jmin) * (org.jfree.chart.axis.CyclicNumberAxis.this.period)) / (jmax - jmin));
			}else {
				return vp - (((jmax - java2DValue) * (org.jfree.chart.axis.CyclicNumberAxis.this.period)) / (jmax - jmin));
			}
		}
	}

	public double valueToJava2D(double value, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		org.jfree.data.Range range = getRange();
		double vmin = range.getLowerBound();
		double vmax = range.getUpperBound();
		double vp = getCycleBound();
		if ((value < vmin) || (value > vmax)) {
			return java.lang.Double.NaN;
		}
		double jmin = 0.0;
		double jmax = 0.0;
		if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(edge)) {
			jmin = dataArea.getMinX();
			jmax = dataArea.getMaxX();
		}else
			if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
				jmax = dataArea.getMinY();
				jmin = dataArea.getMaxY();
			}
		
		if (isInverted()) {
			if (value == vp) {
				return org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle ? jmin : jmax;
			}else
				if (value > vp) {
					return jmax - (((value - vp) * (jmax - jmin)) / (org.jfree.chart.axis.CyclicNumberAxis.this.period));
				}else {
					return jmin + (((vp - value) * (jmax - jmin)) / (org.jfree.chart.axis.CyclicNumberAxis.this.period));
				}
			
		}else {
			if (value == vp) {
				return org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle ? jmax : jmin;
			}else
				if (value >= vp) {
					return jmin + (((value - vp) * (jmax - jmin)) / (org.jfree.chart.axis.CyclicNumberAxis.this.period));
				}else {
					return jmax - (((vp - value) * (jmax - jmin)) / (org.jfree.chart.axis.CyclicNumberAxis.this.period));
				}
			
		}
	}

	public void centerRange(double value) {
		setRange((value - ((org.jfree.chart.axis.CyclicNumberAxis.this.period) / 2.0)), (value + ((org.jfree.chart.axis.CyclicNumberAxis.this.period) / 2.0)));
	}

	public void setAutoRangeMinimumSize(double size, boolean notify) {
		if (size > (org.jfree.chart.axis.CyclicNumberAxis.this.period)) {
			org.jfree.chart.axis.CyclicNumberAxis.this.period = size;
		}
		super.setAutoRangeMinimumSize(size, notify);
	}

	public void setFixedAutoRange(double length) {
		org.jfree.chart.axis.CyclicNumberAxis.this.period = length;
		super.setFixedAutoRange(length);
	}

	public void setRange(org.jfree.data.Range range, boolean turnOffAutoRange, boolean notify) {
		double size = (range.getUpperBound()) - (range.getLowerBound());
		if (size > (org.jfree.chart.axis.CyclicNumberAxis.this.period)) {
			org.jfree.chart.axis.CyclicNumberAxis.this.period = size;
		}
		super.setRange(range, turnOffAutoRange, notify);
	}

	public double getCycleBound() {
		return ((java.lang.Math.floor((((getRange().getUpperBound()) - (org.jfree.chart.axis.CyclicNumberAxis.this.offset)) / (org.jfree.chart.axis.CyclicNumberAxis.this.period)))) * (org.jfree.chart.axis.CyclicNumberAxis.this.period)) + (org.jfree.chart.axis.CyclicNumberAxis.this.offset);
	}

	public double getOffset() {
		return org.jfree.chart.axis.CyclicNumberAxis.this.offset;
	}

	public void setOffset(double offset) {
		org.jfree.chart.axis.CyclicNumberAxis.this.offset = offset;
	}

	public double getPeriod() {
		return org.jfree.chart.axis.CyclicNumberAxis.this.period;
	}

	public void setPeriod(double period) {
		org.jfree.chart.axis.CyclicNumberAxis.this.period = period;
	}

	protected org.jfree.chart.axis.AxisState drawTickMarksAndLabels(java.awt.Graphics2D g2, double cursor, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.axis.CyclicNumberAxis.this.internalMarkerWhenTicksOverlap = false;
		org.jfree.chart.axis.AxisState ret = super.drawTickMarksAndLabels(g2, cursor, plotArea, dataArea, edge, info);
		if (!(org.jfree.chart.axis.CyclicNumberAxis.this.internalMarkerWhenTicksOverlap)) {
			return ret;
		}
		double ol = getTickMarkOutsideLength();
		java.awt.FontMetrics fm = g2.getFontMetrics(getTickLabelFont());
		if (isVerticalTickLabels()) {
			ol = fm.getMaxAdvance();
		}else {
			ol = fm.getHeight();
		}
		double il = 0;
		if (isTickMarksVisible()) {
			float xx = ((float) (valueToJava2D(getRange().getUpperBound(), dataArea, edge)));
			java.awt.geom.Line2D mark = null;
			g2.setStroke(getTickMarkStroke());
			g2.setPaint(getTickMarkPaint());
			if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
				mark = new java.awt.geom.Line2D.Double((cursor - ol), xx, (cursor + il), xx);
			}else
				if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
					mark = new java.awt.geom.Line2D.Double((cursor + ol), xx, (cursor - il), xx);
				}else
					if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
						mark = new java.awt.geom.Line2D.Double(xx, (cursor - ol), xx, (cursor + il));
					}else
						if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
							mark = new java.awt.geom.Line2D.Double(xx, (cursor + ol), xx, (cursor - il));
						}
					
				
			
			g2.draw(mark);
		}
		return ret;
	}

	public org.jfree.chart.axis.AxisState draw(java.awt.Graphics2D g2, double cursor, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge, org.jfree.chart.plot.PlotRenderingInfo plotState) {
		org.jfree.chart.axis.AxisState ret = super.draw(g2, cursor, plotArea, dataArea, edge, plotState);
		if (isAdvanceLineVisible()) {
			double xx = valueToJava2D(getRange().getUpperBound(), dataArea, edge);
			java.awt.geom.Line2D mark = null;
			g2.setStroke(getAdvanceLineStroke());
			g2.setPaint(getAdvanceLinePaint());
			if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
				mark = new java.awt.geom.Line2D.Double(cursor, xx, (cursor + (dataArea.getWidth())), xx);
			}else
				if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
					mark = new java.awt.geom.Line2D.Double((cursor - (dataArea.getWidth())), xx, cursor, xx);
				}else
					if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
						mark = new java.awt.geom.Line2D.Double(xx, (cursor + (dataArea.getHeight())), xx, cursor);
					}else
						if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
							mark = new java.awt.geom.Line2D.Double(xx, cursor, xx, (cursor - (dataArea.getHeight())));
						}
					
				
			
			g2.draw(mark);
		}
		return ret;
	}

	public org.jfree.chart.axis.AxisSpace reserveSpace(java.awt.Graphics2D g2, org.jfree.chart.plot.Plot plot, java.awt.geom.Rectangle2D plotArea, org.jfree.chart.util.RectangleEdge edge, org.jfree.chart.axis.AxisSpace space) {
		org.jfree.chart.axis.CyclicNumberAxis.this.internalMarkerCycleBoundTick = null;
		org.jfree.chart.axis.AxisSpace ret = super.reserveSpace(g2, plot, plotArea, edge, space);
		if ((org.jfree.chart.axis.CyclicNumberAxis.this.internalMarkerCycleBoundTick) == null) {
			return ret;
		}
		java.awt.FontMetrics fm = g2.getFontMetrics(getTickLabelFont());
		java.awt.geom.Rectangle2D r = org.jfree.chart.text.TextUtilities.getTextBounds(org.jfree.chart.axis.CyclicNumberAxis.this.internalMarkerCycleBoundTick.getText(), g2, fm);
		if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(edge)) {
			if (isVerticalTickLabels()) {
				space.add(((r.getHeight()) / 2), org.jfree.chart.util.RectangleEdge.RIGHT);
			}else {
				space.add(((r.getWidth()) / 2), org.jfree.chart.util.RectangleEdge.RIGHT);
			}
		}else
			if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
				if (isVerticalTickLabels()) {
					space.add(((r.getWidth()) / 2), org.jfree.chart.util.RectangleEdge.TOP);
				}else {
					space.add(((r.getHeight()) / 2), org.jfree.chart.util.RectangleEdge.TOP);
				}
			}
		
		return ret;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.axis.CyclicNumberAxis.this.advanceLinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.axis.CyclicNumberAxis.this.advanceLineStroke, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.axis.CyclicNumberAxis.this.advanceLinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.axis.CyclicNumberAxis.this.advanceLineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.axis.CyclicNumberAxis.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.CyclicNumberAxis)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.axis.CyclicNumberAxis that = ((org.jfree.chart.axis.CyclicNumberAxis) (obj));
		if ((org.jfree.chart.axis.CyclicNumberAxis.this.period) != (that.period)) {
			return false;
		}
		if ((org.jfree.chart.axis.CyclicNumberAxis.this.offset) != (that.offset)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.axis.CyclicNumberAxis.this.advanceLinePaint, that.advanceLinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.CyclicNumberAxis.this.advanceLineStroke, that.advanceLineStroke))) {
			return false;
		}
		if ((org.jfree.chart.axis.CyclicNumberAxis.this.advanceLineVisible) != (that.advanceLineVisible)) {
			return false;
		}
		if ((org.jfree.chart.axis.CyclicNumberAxis.this.boundMappedToLastCycle) != (that.boundMappedToLastCycle)) {
			return false;
		}
		return true;
	}
}


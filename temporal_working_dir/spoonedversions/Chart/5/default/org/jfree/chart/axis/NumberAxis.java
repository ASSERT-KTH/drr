

package org.jfree.chart.axis;


public class NumberAxis extends org.jfree.chart.axis.ValueAxis implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = 2805933088476185789L;

	public static final boolean DEFAULT_AUTO_RANGE_INCLUDES_ZERO = true;

	public static final boolean DEFAULT_AUTO_RANGE_STICKY_ZERO = true;

	public static final org.jfree.chart.axis.NumberTickUnit DEFAULT_TICK_UNIT = new org.jfree.chart.axis.NumberTickUnit(1.0, new java.text.DecimalFormat("0"));

	public static final boolean DEFAULT_VERTICAL_TICK_LABELS = false;

	private org.jfree.data.RangeType rangeType;

	private boolean autoRangeIncludesZero;

	private boolean autoRangeStickyZero;

	private org.jfree.chart.axis.NumberTickUnit tickUnit;

	private java.text.NumberFormat numberFormatOverride;

	private org.jfree.chart.axis.MarkerAxisBand markerBand;

	public NumberAxis() {
		this(null);
	}

	public NumberAxis(java.lang.String label) {
		super(label, org.jfree.chart.axis.NumberAxis.createStandardTickUnits());
		org.jfree.chart.axis.NumberAxis.this.rangeType = org.jfree.data.RangeType.FULL;
		org.jfree.chart.axis.NumberAxis.this.autoRangeIncludesZero = org.jfree.chart.axis.NumberAxis.DEFAULT_AUTO_RANGE_INCLUDES_ZERO;
		org.jfree.chart.axis.NumberAxis.this.autoRangeStickyZero = org.jfree.chart.axis.NumberAxis.DEFAULT_AUTO_RANGE_STICKY_ZERO;
		org.jfree.chart.axis.NumberAxis.this.tickUnit = org.jfree.chart.axis.NumberAxis.DEFAULT_TICK_UNIT;
		org.jfree.chart.axis.NumberAxis.this.numberFormatOverride = null;
		org.jfree.chart.axis.NumberAxis.this.markerBand = null;
	}

	public org.jfree.data.RangeType getRangeType() {
		return org.jfree.chart.axis.NumberAxis.this.rangeType;
	}

	public void setRangeType(org.jfree.data.RangeType rangeType) {
		if (rangeType == null) {
			throw new java.lang.IllegalArgumentException("Null 'rangeType' argument.");
		}
		org.jfree.chart.axis.NumberAxis.this.rangeType = rangeType;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.NumberAxis.this));
	}

	public boolean getAutoRangeIncludesZero() {
		return org.jfree.chart.axis.NumberAxis.this.autoRangeIncludesZero;
	}

	public void setAutoRangeIncludesZero(boolean flag) {
		if ((org.jfree.chart.axis.NumberAxis.this.autoRangeIncludesZero) != flag) {
			org.jfree.chart.axis.NumberAxis.this.autoRangeIncludesZero = flag;
			if (isAutoRange()) {
				autoAdjustRange();
			}
			notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.NumberAxis.this));
		}
	}

	public boolean getAutoRangeStickyZero() {
		return org.jfree.chart.axis.NumberAxis.this.autoRangeStickyZero;
	}

	public void setAutoRangeStickyZero(boolean flag) {
		if ((org.jfree.chart.axis.NumberAxis.this.autoRangeStickyZero) != flag) {
			org.jfree.chart.axis.NumberAxis.this.autoRangeStickyZero = flag;
			if (isAutoRange()) {
				autoAdjustRange();
			}
			notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.NumberAxis.this));
		}
	}

	public org.jfree.chart.axis.NumberTickUnit getTickUnit() {
		return org.jfree.chart.axis.NumberAxis.this.tickUnit;
	}

	public void setTickUnit(org.jfree.chart.axis.NumberTickUnit unit) {
		setTickUnit(unit, true, true);
	}

	public void setTickUnit(org.jfree.chart.axis.NumberTickUnit unit, boolean notify, boolean turnOffAutoSelect) {
		if (unit == null) {
			throw new java.lang.IllegalArgumentException("Null 'unit' argument.");
		}
		org.jfree.chart.axis.NumberAxis.this.tickUnit = unit;
		if (turnOffAutoSelect) {
			setAutoTickUnitSelection(false, false);
		}
		if (notify) {
			notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.NumberAxis.this));
		}
	}

	public java.text.NumberFormat getNumberFormatOverride() {
		return org.jfree.chart.axis.NumberAxis.this.numberFormatOverride;
	}

	public void setNumberFormatOverride(java.text.NumberFormat formatter) {
		org.jfree.chart.axis.NumberAxis.this.numberFormatOverride = formatter;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.NumberAxis.this));
	}

	public org.jfree.chart.axis.MarkerAxisBand getMarkerBand() {
		return org.jfree.chart.axis.NumberAxis.this.markerBand;
	}

	public void setMarkerBand(org.jfree.chart.axis.MarkerAxisBand band) {
		org.jfree.chart.axis.NumberAxis.this.markerBand = band;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.NumberAxis.this));
	}

	public void configure() {
		if (isAutoRange()) {
			autoAdjustRange();
		}
	}

	protected void autoAdjustRange() {
		org.jfree.chart.plot.Plot plot = getPlot();
		if (plot == null) {
			return ;
		}
		if (plot instanceof org.jfree.chart.plot.ValueAxisPlot) {
			org.jfree.chart.plot.ValueAxisPlot vap = ((org.jfree.chart.plot.ValueAxisPlot) (plot));
			org.jfree.data.Range r = vap.getDataRange(org.jfree.chart.axis.NumberAxis.this);
			if (r == null) {
				r = getDefaultAutoRange();
			}
			double upper = r.getUpperBound();
			double lower = r.getLowerBound();
			if ((org.jfree.chart.axis.NumberAxis.this.rangeType) == (org.jfree.data.RangeType.POSITIVE)) {
				lower = java.lang.Math.max(0.0, lower);
				upper = java.lang.Math.max(0.0, upper);
			}else
				if ((org.jfree.chart.axis.NumberAxis.this.rangeType) == (org.jfree.data.RangeType.NEGATIVE)) {
					lower = java.lang.Math.min(0.0, lower);
					upper = java.lang.Math.min(0.0, upper);
				}
			
			if (getAutoRangeIncludesZero()) {
				lower = java.lang.Math.min(lower, 0.0);
				upper = java.lang.Math.max(upper, 0.0);
			}
			double range = upper - lower;
			double fixedAutoRange = getFixedAutoRange();
			if (fixedAutoRange > 0.0) {
				lower = upper - fixedAutoRange;
			}else {
				double minRange = getAutoRangeMinimumSize();
				if (range < minRange) {
					double expand = (minRange - range) / 2;
					upper = upper + expand;
					lower = lower - expand;
					if (lower == upper) {
						double adjust = (java.lang.Math.abs(lower)) / 10.0;
						lower = lower - adjust;
						upper = upper + adjust;
					}
					if ((org.jfree.chart.axis.NumberAxis.this.rangeType) == (org.jfree.data.RangeType.POSITIVE)) {
						if (lower < 0.0) {
							upper = upper - lower;
							lower = 0.0;
						}
					}else
						if ((org.jfree.chart.axis.NumberAxis.this.rangeType) == (org.jfree.data.RangeType.NEGATIVE)) {
							if (upper > 0.0) {
								lower = lower - upper;
								upper = 0.0;
							}
						}
					
				}
				if (getAutoRangeStickyZero()) {
					if (upper <= 0.0) {
						upper = java.lang.Math.min(0.0, (upper + ((getUpperMargin()) * range)));
					}else {
						upper = upper + ((getUpperMargin()) * range);
					}
					if (lower >= 0.0) {
						lower = java.lang.Math.max(0.0, (lower - ((getLowerMargin()) * range)));
					}else {
						lower = lower - ((getLowerMargin()) * range);
					}
				}else {
					upper = upper + ((getUpperMargin()) * range);
					lower = lower - ((getLowerMargin()) * range);
				}
			}
			setRange(new org.jfree.data.Range(lower, upper), false, false);
		}
	}

	public double valueToJava2D(double value, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge) {
		org.jfree.data.Range range = getRange();
		double axisMin = range.getLowerBound();
		double axisMax = range.getUpperBound();
		double min = 0.0;
		double max = 0.0;
		if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(edge)) {
			min = area.getX();
			max = area.getMaxX();
		}else
			if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
				max = area.getMinY();
				min = area.getMaxY();
			}
		
		if (isInverted()) {
			return max - (((value - axisMin) / (axisMax - axisMin)) * (max - min));
		}else {
			return min + (((value - axisMin) / (axisMax - axisMin)) * (max - min));
		}
	}

	public double java2DToValue(double java2DValue, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge) {
		org.jfree.data.Range range = getRange();
		double axisMin = range.getLowerBound();
		double axisMax = range.getUpperBound();
		double min = 0.0;
		double max = 0.0;
		if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(edge)) {
			min = area.getX();
			max = area.getMaxX();
		}else
			if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
				min = area.getMaxY();
				max = area.getY();
			}
		
		if (isInverted()) {
			return axisMax - (((java2DValue - min) / (max - min)) * (axisMax - axisMin));
		}else {
			return axisMin + (((java2DValue - min) / (max - min)) * (axisMax - axisMin));
		}
	}

	protected double calculateLowestVisibleTickValue() {
		double unit = getTickUnit().getSize();
		double index = java.lang.Math.ceil(((getRange().getLowerBound()) / unit));
		return index * unit;
	}

	protected double calculateHighestVisibleTickValue() {
		double unit = getTickUnit().getSize();
		double index = java.lang.Math.floor(((getRange().getUpperBound()) / unit));
		return index * unit;
	}

	protected int calculateVisibleTickCount() {
		double unit = getTickUnit().getSize();
		org.jfree.data.Range range = getRange();
		return ((int) (((java.lang.Math.floor(((range.getUpperBound()) / unit))) - (java.lang.Math.ceil(((range.getLowerBound()) / unit)))) + 1));
	}

	public org.jfree.chart.axis.AxisState draw(java.awt.Graphics2D g2, double cursor, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge, org.jfree.chart.plot.PlotRenderingInfo plotState) {
		org.jfree.chart.axis.AxisState state = null;
		if (!(isVisible())) {
			state = new org.jfree.chart.axis.AxisState(cursor);
			java.util.List ticks = refreshTicks(g2, state, dataArea, edge);
			state.setTicks(ticks);
			return state;
		}
		state = drawTickMarksAndLabels(g2, cursor, plotArea, dataArea, edge, plotState);
		state = drawLabel(getLabel(), g2, plotArea, dataArea, edge, state, plotState);
		return state;
	}

	public static org.jfree.chart.axis.TickUnitSource createStandardTickUnits() {
		org.jfree.chart.axis.TickUnits units = new org.jfree.chart.axis.TickUnits();
		java.text.DecimalFormat df0 = new java.text.DecimalFormat("0.00000000");
		java.text.DecimalFormat df1 = new java.text.DecimalFormat("0.0000000");
		java.text.DecimalFormat df2 = new java.text.DecimalFormat("0.000000");
		java.text.DecimalFormat df3 = new java.text.DecimalFormat("0.00000");
		java.text.DecimalFormat df4 = new java.text.DecimalFormat("0.0000");
		java.text.DecimalFormat df5 = new java.text.DecimalFormat("0.000");
		java.text.DecimalFormat df6 = new java.text.DecimalFormat("0.00");
		java.text.DecimalFormat df7 = new java.text.DecimalFormat("0.0");
		java.text.DecimalFormat df8 = new java.text.DecimalFormat("#,##0");
		java.text.DecimalFormat df9 = new java.text.DecimalFormat("#,###,##0");
		java.text.DecimalFormat df10 = new java.text.DecimalFormat("#,###,###,##0");
		units.add(new org.jfree.chart.axis.NumberTickUnit(1.0E-7, df1));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1.0E-6, df2));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1.0E-5, df3));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1.0E-4, df4));
		units.add(new org.jfree.chart.axis.NumberTickUnit(0.001, df5));
		units.add(new org.jfree.chart.axis.NumberTickUnit(0.01, df6));
		units.add(new org.jfree.chart.axis.NumberTickUnit(0.1, df7));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1, df8));
		units.add(new org.jfree.chart.axis.NumberTickUnit(10, df8));
		units.add(new org.jfree.chart.axis.NumberTickUnit(100, df8));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1000, df8));
		units.add(new org.jfree.chart.axis.NumberTickUnit(10000, df8));
		units.add(new org.jfree.chart.axis.NumberTickUnit(100000, df8));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1000000, df9));
		units.add(new org.jfree.chart.axis.NumberTickUnit(10000000, df9));
		units.add(new org.jfree.chart.axis.NumberTickUnit(100000000, df9));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1000000000, df10));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1.0E10, df10));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1.0E11, df10));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2.5E-7, df0));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2.5E-6, df1));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2.5E-5, df2));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2.5E-4, df3));
		units.add(new org.jfree.chart.axis.NumberTickUnit(0.0025, df4));
		units.add(new org.jfree.chart.axis.NumberTickUnit(0.025, df5));
		units.add(new org.jfree.chart.axis.NumberTickUnit(0.25, df6));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2.5, df7));
		units.add(new org.jfree.chart.axis.NumberTickUnit(25, df8));
		units.add(new org.jfree.chart.axis.NumberTickUnit(250, df8));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2500, df8));
		units.add(new org.jfree.chart.axis.NumberTickUnit(25000, df8));
		units.add(new org.jfree.chart.axis.NumberTickUnit(250000, df8));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2500000, df9));
		units.add(new org.jfree.chart.axis.NumberTickUnit(25000000, df9));
		units.add(new org.jfree.chart.axis.NumberTickUnit(250000000, df9));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2.5E9, df10));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2.5E10, df10));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2.5E11, df10));
		units.add(new org.jfree.chart.axis.NumberTickUnit(5.0E-7, df1));
		units.add(new org.jfree.chart.axis.NumberTickUnit(5.0E-6, df2));
		units.add(new org.jfree.chart.axis.NumberTickUnit(5.0E-5, df3));
		units.add(new org.jfree.chart.axis.NumberTickUnit(5.0E-4, df4));
		units.add(new org.jfree.chart.axis.NumberTickUnit(0.005, df5));
		units.add(new org.jfree.chart.axis.NumberTickUnit(0.05, df6));
		units.add(new org.jfree.chart.axis.NumberTickUnit(0.5, df7));
		units.add(new org.jfree.chart.axis.NumberTickUnit(5L, df8));
		units.add(new org.jfree.chart.axis.NumberTickUnit(50L, df8));
		units.add(new org.jfree.chart.axis.NumberTickUnit(500L, df8));
		units.add(new org.jfree.chart.axis.NumberTickUnit(5000L, df8));
		units.add(new org.jfree.chart.axis.NumberTickUnit(50000L, df8));
		units.add(new org.jfree.chart.axis.NumberTickUnit(500000L, df8));
		units.add(new org.jfree.chart.axis.NumberTickUnit(5000000L, df9));
		units.add(new org.jfree.chart.axis.NumberTickUnit(50000000L, df9));
		units.add(new org.jfree.chart.axis.NumberTickUnit(500000000L, df9));
		units.add(new org.jfree.chart.axis.NumberTickUnit(5000000000L, df10));
		units.add(new org.jfree.chart.axis.NumberTickUnit(50000000000L, df10));
		units.add(new org.jfree.chart.axis.NumberTickUnit(500000000000L, df10));
		return units;
	}

	public static org.jfree.chart.axis.TickUnitSource createIntegerTickUnits() {
		org.jfree.chart.axis.TickUnits units = new org.jfree.chart.axis.TickUnits();
		java.text.DecimalFormat df0 = new java.text.DecimalFormat("0");
		java.text.DecimalFormat df1 = new java.text.DecimalFormat("#,##0");
		units.add(new org.jfree.chart.axis.NumberTickUnit(1, df0));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2, df0));
		units.add(new org.jfree.chart.axis.NumberTickUnit(5, df0));
		units.add(new org.jfree.chart.axis.NumberTickUnit(10, df0));
		units.add(new org.jfree.chart.axis.NumberTickUnit(20, df0));
		units.add(new org.jfree.chart.axis.NumberTickUnit(50, df0));
		units.add(new org.jfree.chart.axis.NumberTickUnit(100, df0));
		units.add(new org.jfree.chart.axis.NumberTickUnit(200, df0));
		units.add(new org.jfree.chart.axis.NumberTickUnit(500, df0));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1000, df1));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2000, df1));
		units.add(new org.jfree.chart.axis.NumberTickUnit(5000, df1));
		units.add(new org.jfree.chart.axis.NumberTickUnit(10000, df1));
		units.add(new org.jfree.chart.axis.NumberTickUnit(20000, df1));
		units.add(new org.jfree.chart.axis.NumberTickUnit(50000, df1));
		units.add(new org.jfree.chart.axis.NumberTickUnit(100000, df1));
		units.add(new org.jfree.chart.axis.NumberTickUnit(200000, df1));
		units.add(new org.jfree.chart.axis.NumberTickUnit(500000, df1));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1000000, df1));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2000000, df1));
		units.add(new org.jfree.chart.axis.NumberTickUnit(5000000, df1));
		units.add(new org.jfree.chart.axis.NumberTickUnit(10000000, df1));
		units.add(new org.jfree.chart.axis.NumberTickUnit(20000000, df1));
		units.add(new org.jfree.chart.axis.NumberTickUnit(50000000, df1));
		units.add(new org.jfree.chart.axis.NumberTickUnit(100000000, df1));
		units.add(new org.jfree.chart.axis.NumberTickUnit(200000000, df1));
		units.add(new org.jfree.chart.axis.NumberTickUnit(500000000, df1));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1000000000, df1));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2000000000, df1));
		units.add(new org.jfree.chart.axis.NumberTickUnit(5.0E9, df1));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1.0E10, df1));
		return units;
	}

	public static org.jfree.chart.axis.TickUnitSource createStandardTickUnits(java.util.Locale locale) {
		org.jfree.chart.axis.TickUnits units = new org.jfree.chart.axis.TickUnits();
		java.text.NumberFormat numberFormat = java.text.NumberFormat.getNumberInstance(locale);
		units.add(new org.jfree.chart.axis.NumberTickUnit(1.0E-7, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1.0E-6, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1.0E-5, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1.0E-4, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(0.001, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(0.01, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(0.1, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(10, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(100, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(10000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(100000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1000000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(10000000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(100000000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1000000000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1.0E10, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2.5E-7, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2.5E-6, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2.5E-5, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2.5E-4, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(0.0025, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(0.025, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(0.25, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2.5, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(25, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(250, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2500, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(25000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(250000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2500000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(25000000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(250000000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2.5E9, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2.5E10, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(5.0E-7, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(5.0E-6, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(5.0E-5, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(5.0E-4, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(0.005, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(0.05, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(0.5, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(5L, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(50L, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(500L, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(5000L, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(50000L, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(500000L, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(5000000L, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(50000000L, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(500000000L, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(5000000000L, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(50000000000L, numberFormat));
		return units;
	}

	public static org.jfree.chart.axis.TickUnitSource createIntegerTickUnits(java.util.Locale locale) {
		org.jfree.chart.axis.TickUnits units = new org.jfree.chart.axis.TickUnits();
		java.text.NumberFormat numberFormat = java.text.NumberFormat.getNumberInstance(locale);
		units.add(new org.jfree.chart.axis.NumberTickUnit(1, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(5, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(10, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(20, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(50, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(100, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(200, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(500, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(5000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(10000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(20000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(50000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(100000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(200000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(500000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1000000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2000000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(5000000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(10000000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(20000000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(50000000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(100000000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(200000000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(500000000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1000000000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(2000000000, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(5.0E9, numberFormat));
		units.add(new org.jfree.chart.axis.NumberTickUnit(1.0E10, numberFormat));
		return units;
	}

	protected double estimateMaximumTickLabelHeight(java.awt.Graphics2D g2) {
		org.jfree.chart.util.RectangleInsets tickLabelInsets = getTickLabelInsets();
		double result = (tickLabelInsets.getTop()) + (tickLabelInsets.getBottom());
		java.awt.Font tickLabelFont = getTickLabelFont();
		java.awt.font.FontRenderContext frc = g2.getFontRenderContext();
		result += tickLabelFont.getLineMetrics("123", frc).getHeight();
		return result;
	}

	protected double estimateMaximumTickLabelWidth(java.awt.Graphics2D g2, org.jfree.chart.axis.TickUnit unit) {
		org.jfree.chart.util.RectangleInsets tickLabelInsets = getTickLabelInsets();
		double result = (tickLabelInsets.getLeft()) + (tickLabelInsets.getRight());
		if (isVerticalTickLabels()) {
			java.awt.font.FontRenderContext frc = g2.getFontRenderContext();
			java.awt.font.LineMetrics lm = getTickLabelFont().getLineMetrics("0", frc);
			result += lm.getHeight();
		}else {
			java.awt.FontMetrics fm = g2.getFontMetrics(getTickLabelFont());
			org.jfree.data.Range range = getRange();
			double lower = range.getLowerBound();
			double upper = range.getUpperBound();
			java.lang.String lowerStr = "";
			java.lang.String upperStr = "";
			java.text.NumberFormat formatter = getNumberFormatOverride();
			if (formatter != null) {
				lowerStr = formatter.format(lower);
				upperStr = formatter.format(upper);
			}else {
				lowerStr = unit.valueToString(lower);
				upperStr = unit.valueToString(upper);
			}
			double w1 = fm.stringWidth(lowerStr);
			double w2 = fm.stringWidth(upperStr);
			result += java.lang.Math.max(w1, w2);
		}
		return result;
	}

	protected void selectAutoTickUnit(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(edge)) {
			selectHorizontalAutoTickUnit(g2, dataArea, edge);
		}else
			if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
				selectVerticalAutoTickUnit(g2, dataArea, edge);
			}
		
	}

	protected void selectHorizontalAutoTickUnit(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		double tickLabelWidth = estimateMaximumTickLabelWidth(g2, getTickUnit());
		org.jfree.chart.axis.TickUnitSource tickUnits = getStandardTickUnits();
		org.jfree.chart.axis.TickUnit unit1 = tickUnits.getCeilingTickUnit(getTickUnit());
		double unit1Width = lengthToJava2D(unit1.getSize(), dataArea, edge);
		double guess = (tickLabelWidth / unit1Width) * (unit1.getSize());
		org.jfree.chart.axis.NumberTickUnit unit2 = ((org.jfree.chart.axis.NumberTickUnit) (tickUnits.getCeilingTickUnit(guess)));
		double unit2Width = lengthToJava2D(unit2.getSize(), dataArea, edge);
		tickLabelWidth = estimateMaximumTickLabelWidth(g2, unit2);
		if (tickLabelWidth > unit2Width) {
			unit2 = ((org.jfree.chart.axis.NumberTickUnit) (tickUnits.getLargerTickUnit(unit2)));
		}
		setTickUnit(unit2, false, false);
	}

	protected void selectVerticalAutoTickUnit(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		double tickLabelHeight = estimateMaximumTickLabelHeight(g2);
		org.jfree.chart.axis.TickUnitSource tickUnits = getStandardTickUnits();
		org.jfree.chart.axis.TickUnit unit1 = tickUnits.getCeilingTickUnit(getTickUnit());
		double unitHeight = lengthToJava2D(unit1.getSize(), dataArea, edge);
		double guess = (tickLabelHeight / unitHeight) * (unit1.getSize());
		org.jfree.chart.axis.NumberTickUnit unit2 = ((org.jfree.chart.axis.NumberTickUnit) (tickUnits.getCeilingTickUnit(guess)));
		double unit2Height = lengthToJava2D(unit2.getSize(), dataArea, edge);
		tickLabelHeight = estimateMaximumTickLabelHeight(g2);
		if (tickLabelHeight > unit2Height) {
			unit2 = ((org.jfree.chart.axis.NumberTickUnit) (tickUnits.getLargerTickUnit(unit2)));
		}
		setTickUnit(unit2, false, false);
	}

	public java.util.List refreshTicks(java.awt.Graphics2D g2, org.jfree.chart.axis.AxisState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		java.util.List result = new java.util.ArrayList();
		if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(edge)) {
			result = refreshTicksHorizontal(g2, dataArea, edge);
		}else
			if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
				result = refreshTicksVertical(g2, dataArea, edge);
			}
		
		return result;
	}

	protected java.util.List refreshTicksHorizontal(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		java.util.List result = new java.util.ArrayList();
		java.awt.Font tickLabelFont = getTickLabelFont();
		g2.setFont(tickLabelFont);
		if (isAutoTickUnitSelection()) {
			selectAutoTickUnit(g2, dataArea, edge);
		}
		double size = getTickUnit().getSize();
		int count = calculateVisibleTickCount();
		double lowestTickValue = calculateLowestVisibleTickValue();
		if (count <= (org.jfree.chart.axis.ValueAxis.MAXIMUM_TICK_COUNT)) {
			for (int minorTick = 1; minorTick < (getMinorTickCount()); minorTick++) {
				double minorTickValue = lowestTickValue - (((getTickUnit().getSize()) * minorTick) / (getMinorTickCount()));
				if (getRange().contains(minorTickValue)) {
					result.add(new org.jfree.chart.axis.NumberTick(org.jfree.chart.axis.TickType.MINOR, minorTickValue, "", org.jfree.chart.text.TextAnchor.TOP_CENTER, org.jfree.chart.text.TextAnchor.CENTER, 0.0));
				}
			}
			for (int i = 0; i < count; i++) {
				double currentTickValue = lowestTickValue + (i * size);
				java.lang.String tickLabel;
				java.text.NumberFormat formatter = getNumberFormatOverride();
				if (formatter != null) {
					tickLabel = formatter.format(currentTickValue);
				}else {
					tickLabel = getTickUnit().valueToString(currentTickValue);
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
				result.add(tick);
				double nextTickValue = lowestTickValue + ((i + 1) * size);
				for (int minorTick = 1; minorTick < (getMinorTickCount()); minorTick++) {
					double minorTickValue = currentTickValue + (((nextTickValue - currentTickValue) * minorTick) / (getMinorTickCount()));
					if (getRange().contains(minorTickValue)) {
						result.add(new org.jfree.chart.axis.NumberTick(org.jfree.chart.axis.TickType.MINOR, minorTickValue, "", org.jfree.chart.text.TextAnchor.TOP_CENTER, org.jfree.chart.text.TextAnchor.CENTER, 0.0));
					}
				}
			}
		}
		return result;
	}

	protected java.util.List refreshTicksVertical(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		java.util.List result = new java.util.ArrayList();
		result.clear();
		java.awt.Font tickLabelFont = getTickLabelFont();
		g2.setFont(tickLabelFont);
		if (isAutoTickUnitSelection()) {
			selectAutoTickUnit(g2, dataArea, edge);
		}
		double size = getTickUnit().getSize();
		int count = calculateVisibleTickCount();
		double lowestTickValue = calculateLowestVisibleTickValue();
		if (count <= (org.jfree.chart.axis.ValueAxis.MAXIMUM_TICK_COUNT)) {
			for (int minorTick = 1; minorTick < (getMinorTickCount()); minorTick++) {
				double minorTickValue = lowestTickValue - (((getTickUnit().getSize()) * minorTick) / (getMinorTickCount()));
				if (getRange().contains(minorTickValue)) {
					result.add(new org.jfree.chart.axis.NumberTick(org.jfree.chart.axis.TickType.MINOR, minorTickValue, "", org.jfree.chart.text.TextAnchor.TOP_CENTER, org.jfree.chart.text.TextAnchor.CENTER, 0.0));
				}
			}
			for (int i = 0; i < count; i++) {
				double currentTickValue = lowestTickValue + (i * size);
				java.lang.String tickLabel;
				java.text.NumberFormat formatter = getNumberFormatOverride();
				if (formatter != null) {
					tickLabel = formatter.format(currentTickValue);
				}else {
					tickLabel = getTickUnit().valueToString(currentTickValue);
				}
				org.jfree.chart.text.TextAnchor anchor = null;
				org.jfree.chart.text.TextAnchor rotationAnchor = null;
				double angle = 0.0;
				if (isVerticalTickLabels()) {
					if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
						anchor = org.jfree.chart.text.TextAnchor.BOTTOM_CENTER;
						rotationAnchor = org.jfree.chart.text.TextAnchor.BOTTOM_CENTER;
						angle = (-(java.lang.Math.PI)) / 2.0;
					}else {
						anchor = org.jfree.chart.text.TextAnchor.BOTTOM_CENTER;
						rotationAnchor = org.jfree.chart.text.TextAnchor.BOTTOM_CENTER;
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
				result.add(tick);
				double nextTickValue = lowestTickValue + ((i + 1) * size);
				for (int minorTick = 1; minorTick < (getMinorTickCount()); minorTick++) {
					double minorTickValue = currentTickValue + (((nextTickValue - currentTickValue) * minorTick) / (getMinorTickCount()));
					if (getRange().contains(minorTickValue)) {
						result.add(new org.jfree.chart.axis.NumberTick(org.jfree.chart.axis.TickType.MINOR, minorTickValue, "", org.jfree.chart.text.TextAnchor.TOP_CENTER, org.jfree.chart.text.TextAnchor.CENTER, 0.0));
					}
				}
			}
		}
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.axis.NumberAxis clone = ((org.jfree.chart.axis.NumberAxis) (super.clone()));
		if ((org.jfree.chart.axis.NumberAxis.this.numberFormatOverride) != null) {
			clone.numberFormatOverride = ((java.text.NumberFormat) (org.jfree.chart.axis.NumberAxis.this.numberFormatOverride.clone()));
		}
		return clone;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.axis.NumberAxis.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.NumberAxis)) {
			return false;
		}
		org.jfree.chart.axis.NumberAxis that = ((org.jfree.chart.axis.NumberAxis) (obj));
		if ((org.jfree.chart.axis.NumberAxis.this.autoRangeIncludesZero) != (that.autoRangeIncludesZero)) {
			return false;
		}
		if ((org.jfree.chart.axis.NumberAxis.this.autoRangeStickyZero) != (that.autoRangeStickyZero)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.NumberAxis.this.tickUnit, that.tickUnit))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.NumberAxis.this.numberFormatOverride, that.numberFormatOverride))) {
			return false;
		}
		if (!(org.jfree.chart.axis.NumberAxis.this.rangeType.equals(that.rangeType))) {
			return false;
		}
		return super.equals(obj);
	}

	public int hashCode() {
		if ((getLabel()) != null) {
			return getLabel().hashCode();
		}else {
			return 0;
		}
	}
}


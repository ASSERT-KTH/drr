

package org.jfree.chart.axis;


public class LogAxis extends org.jfree.chart.axis.ValueAxis {
	private double base = 10.0;

	private double baseLog = java.lang.Math.log(10.0);

	private double smallestValue = 1.0E-100;

	private org.jfree.chart.axis.NumberTickUnit tickUnit;

	private java.text.NumberFormat numberFormatOverride;

	private int minorTickCount;

	public LogAxis() {
		this(null);
	}

	public LogAxis(java.lang.String label) {
		super(label, org.jfree.chart.axis.LogAxis.createLogTickUnits(java.util.Locale.getDefault()));
		setDefaultAutoRange(new org.jfree.data.Range(0.01, 1.0));
		org.jfree.chart.axis.LogAxis.this.tickUnit = new org.jfree.chart.axis.NumberTickUnit(1.0, new java.text.DecimalFormat("0.#"));
		org.jfree.chart.axis.LogAxis.this.minorTickCount = 9;
	}

	public double getBase() {
		return org.jfree.chart.axis.LogAxis.this.base;
	}

	public void setBase(double base) {
		if (base <= 1.0) {
			throw new java.lang.IllegalArgumentException("Requires 'base' > 1.0.");
		}
		org.jfree.chart.axis.LogAxis.this.base = base;
		org.jfree.chart.axis.LogAxis.this.baseLog = java.lang.Math.log(base);
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.LogAxis.this));
	}

	public double getSmallestValue() {
		return org.jfree.chart.axis.LogAxis.this.smallestValue;
	}

	public void setSmallestValue(double value) {
		if (value <= 0.0) {
			throw new java.lang.IllegalArgumentException("Requires 'value' > 0.0.");
		}
		org.jfree.chart.axis.LogAxis.this.smallestValue = value;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.LogAxis.this));
	}

	public org.jfree.chart.axis.NumberTickUnit getTickUnit() {
		return org.jfree.chart.axis.LogAxis.this.tickUnit;
	}

	public void setTickUnit(org.jfree.chart.axis.NumberTickUnit unit) {
		setTickUnit(unit, true, true);
	}

	public void setTickUnit(org.jfree.chart.axis.NumberTickUnit unit, boolean notify, boolean turnOffAutoSelect) {
		if (unit == null) {
			throw new java.lang.IllegalArgumentException("Null 'unit' argument.");
		}
		org.jfree.chart.axis.LogAxis.this.tickUnit = unit;
		if (turnOffAutoSelect) {
			setAutoTickUnitSelection(false, false);
		}
		if (notify) {
			notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.LogAxis.this));
		}
	}

	public java.text.NumberFormat getNumberFormatOverride() {
		return org.jfree.chart.axis.LogAxis.this.numberFormatOverride;
	}

	public void setNumberFormatOverride(java.text.NumberFormat formatter) {
		org.jfree.chart.axis.LogAxis.this.numberFormatOverride = formatter;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.LogAxis.this));
	}

	public int getMinorTickCount() {
		return org.jfree.chart.axis.LogAxis.this.minorTickCount;
	}

	public void setMinorTickCount(int count) {
		if (count <= 0) {
			throw new java.lang.IllegalArgumentException("Requires 'count' > 0.");
		}
		org.jfree.chart.axis.LogAxis.this.minorTickCount = count;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.LogAxis.this));
	}

	public double calculateLog(double value) {
		return (java.lang.Math.log(value)) / (org.jfree.chart.axis.LogAxis.this.baseLog);
	}

	public double calculateValue(double log) {
		return java.lang.Math.pow(org.jfree.chart.axis.LogAxis.this.base, log);
	}

	public double java2DToValue(double java2DValue, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge) {
		org.jfree.data.Range range = getRange();
		double axisMin = calculateLog(range.getLowerBound());
		double axisMax = calculateLog(range.getUpperBound());
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
		
		double log = 0.0;
		if (isInverted()) {
			log = axisMax - (((java2DValue - min) / (max - min)) * (axisMax - axisMin));
		}else {
			log = axisMin + (((java2DValue - min) / (max - min)) * (axisMax - axisMin));
		}
		return calculateValue(log);
	}

	public double valueToJava2D(double value, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge) {
		org.jfree.data.Range range = getRange();
		double axisMin = calculateLog(range.getLowerBound());
		double axisMax = calculateLog(range.getUpperBound());
		value = calculateLog(value);
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
			org.jfree.data.Range r = vap.getDataRange(org.jfree.chart.axis.LogAxis.this);
			if (r == null) {
				r = getDefaultAutoRange();
			}
			double upper = r.getUpperBound();
			double lower = java.lang.Math.max(r.getLowerBound(), org.jfree.chart.axis.LogAxis.this.smallestValue);
			double range = upper - lower;
			double fixedAutoRange = getFixedAutoRange();
			if (fixedAutoRange > 0.0) {
				lower = java.lang.Math.max((upper - fixedAutoRange), org.jfree.chart.axis.LogAxis.this.smallestValue);
			}else {
				double minRange = getAutoRangeMinimumSize();
				if (range < minRange) {
					double expand = (minRange - range) / 2;
					upper = upper + expand;
					lower = lower - expand;
				}
				double logUpper = calculateLog(upper);
				double logLower = calculateLog(lower);
				double logRange = logUpper - logLower;
				logUpper = logUpper + ((getUpperMargin()) * logRange);
				logLower = logLower - ((getLowerMargin()) * logRange);
				upper = calculateValue(logUpper);
				lower = calculateValue(logLower);
			}
			setRange(new org.jfree.data.Range(lower, upper), false, false);
		}
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
		org.jfree.data.Range range = getRange();
		java.util.List ticks = new java.util.ArrayList();
		java.awt.Font tickLabelFont = getTickLabelFont();
		g2.setFont(tickLabelFont);
		org.jfree.chart.text.TextAnchor textAnchor;
		if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
			textAnchor = org.jfree.chart.text.TextAnchor.BOTTOM_CENTER;
		}else {
			textAnchor = org.jfree.chart.text.TextAnchor.TOP_CENTER;
		}
		if (isAutoTickUnitSelection()) {
			selectAutoTickUnit(g2, dataArea, edge);
		}
		double start = java.lang.Math.floor(calculateLog(getLowerBound()));
		double end = java.lang.Math.ceil(calculateLog(getUpperBound()));
		double current = start;
		while (current <= end) {
			double v = calculateValue(current);
			if (range.contains(v)) {
				ticks.add(new org.jfree.chart.axis.NumberTick(org.jfree.chart.axis.TickType.MAJOR, v, createTickLabel(v), textAnchor, org.jfree.chart.text.TextAnchor.CENTER, 0.0));
			}
			double next = java.lang.Math.pow(org.jfree.chart.axis.LogAxis.this.base, (current + (org.jfree.chart.axis.LogAxis.this.tickUnit.getSize())));
			for (int i = 1; i < (org.jfree.chart.axis.LogAxis.this.minorTickCount); i++) {
				double minorV = v + (i * ((next - v) / (org.jfree.chart.axis.LogAxis.this.minorTickCount)));
				if (range.contains(minorV)) {
					ticks.add(new org.jfree.chart.axis.NumberTick(org.jfree.chart.axis.TickType.MINOR, minorV, "", textAnchor, org.jfree.chart.text.TextAnchor.CENTER, 0.0));
				}
			}
			current = current + (org.jfree.chart.axis.LogAxis.this.tickUnit.getSize());
		} 
		return ticks;
	}

	protected java.util.List refreshTicksVertical(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		org.jfree.data.Range range = getRange();
		java.util.List ticks = new java.util.ArrayList();
		java.awt.Font tickLabelFont = getTickLabelFont();
		g2.setFont(tickLabelFont);
		org.jfree.chart.text.TextAnchor textAnchor;
		if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
			textAnchor = org.jfree.chart.text.TextAnchor.CENTER_LEFT;
		}else {
			textAnchor = org.jfree.chart.text.TextAnchor.CENTER_RIGHT;
		}
		if (isAutoTickUnitSelection()) {
			selectAutoTickUnit(g2, dataArea, edge);
		}
		double start = java.lang.Math.floor(calculateLog(getLowerBound()));
		double end = java.lang.Math.ceil(calculateLog(getUpperBound()));
		double current = start;
		while (current <= end) {
			double v = calculateValue(current);
			if (range.contains(v)) {
				ticks.add(new org.jfree.chart.axis.NumberTick(org.jfree.chart.axis.TickType.MAJOR, v, createTickLabel(v), textAnchor, org.jfree.chart.text.TextAnchor.CENTER, 0.0));
			}
			double next = java.lang.Math.pow(org.jfree.chart.axis.LogAxis.this.base, (current + (org.jfree.chart.axis.LogAxis.this.tickUnit.getSize())));
			for (int i = 1; i < (org.jfree.chart.axis.LogAxis.this.minorTickCount); i++) {
				double minorV = v + (i * ((next - v) / (org.jfree.chart.axis.LogAxis.this.minorTickCount)));
				if (range.contains(minorV)) {
					ticks.add(new org.jfree.chart.axis.NumberTick(org.jfree.chart.axis.TickType.MINOR, minorV, "", textAnchor, org.jfree.chart.text.TextAnchor.CENTER, 0.0));
				}
			}
			current = current + (org.jfree.chart.axis.LogAxis.this.tickUnit.getSize());
		} 
		return ticks;
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
		double unit1Width = exponentLengthToJava2D(unit1.getSize(), dataArea, edge);
		double guess = (tickLabelWidth / unit1Width) * (unit1.getSize());
		org.jfree.chart.axis.NumberTickUnit unit2 = ((org.jfree.chart.axis.NumberTickUnit) (tickUnits.getCeilingTickUnit(guess)));
		double unit2Width = exponentLengthToJava2D(unit2.getSize(), dataArea, edge);
		tickLabelWidth = estimateMaximumTickLabelWidth(g2, unit2);
		if (tickLabelWidth > unit2Width) {
			unit2 = ((org.jfree.chart.axis.NumberTickUnit) (tickUnits.getLargerTickUnit(unit2)));
		}
		setTickUnit(unit2, false, false);
	}

	public double exponentLengthToJava2D(double length, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge) {
		double one = valueToJava2D(calculateValue(1.0), area, edge);
		double l = valueToJava2D(calculateValue((length + 1.0)), area, edge);
		return java.lang.Math.abs((l - one));
	}

	protected void selectVerticalAutoTickUnit(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		double tickLabelHeight = estimateMaximumTickLabelHeight(g2);
		org.jfree.chart.axis.TickUnitSource tickUnits = getStandardTickUnits();
		org.jfree.chart.axis.TickUnit unit1 = tickUnits.getCeilingTickUnit(getTickUnit());
		double unitHeight = exponentLengthToJava2D(unit1.getSize(), dataArea, edge);
		double guess = (tickLabelHeight / unitHeight) * (unit1.getSize());
		org.jfree.chart.axis.NumberTickUnit unit2 = ((org.jfree.chart.axis.NumberTickUnit) (tickUnits.getCeilingTickUnit(guess)));
		double unit2Height = exponentLengthToJava2D(unit2.getSize(), dataArea, edge);
		tickLabelHeight = estimateMaximumTickLabelHeight(g2);
		if (tickLabelHeight > unit2Height) {
			unit2 = ((org.jfree.chart.axis.NumberTickUnit) (tickUnits.getLargerTickUnit(unit2)));
		}
		setTickUnit(unit2, false, false);
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

	public void zoomRange(double lowerPercent, double upperPercent) {
		org.jfree.data.Range range = getRange();
		double start = range.getLowerBound();
		double end = range.getUpperBound();
		double log1 = calculateLog(start);
		double log2 = calculateLog(end);
		double length = log2 - log1;
		org.jfree.data.Range adjusted = null;
		if (isInverted()) {
			double logA = log1 + (length * (1 - upperPercent));
			double logB = log1 + (length * (1 - lowerPercent));
			adjusted = new org.jfree.data.Range(calculateValue(logA), calculateValue(logB));
		}else {
			double logA = log1 + (length * lowerPercent);
			double logB = log1 + (length * upperPercent);
			adjusted = new org.jfree.data.Range(calculateValue(logA), calculateValue(logB));
		}
		setRange(adjusted);
	}

	protected java.lang.String createTickLabel(double value) {
		if ((org.jfree.chart.axis.LogAxis.this.numberFormatOverride) != null) {
			return org.jfree.chart.axis.LogAxis.this.numberFormatOverride.format(value);
		}else {
			return org.jfree.chart.axis.LogAxis.this.tickUnit.valueToString(value);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.axis.LogAxis.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.LogAxis)) {
			return false;
		}
		org.jfree.chart.axis.LogAxis that = ((org.jfree.chart.axis.LogAxis) (obj));
		if ((org.jfree.chart.axis.LogAxis.this.base) != (that.base)) {
			return false;
		}
		if ((org.jfree.chart.axis.LogAxis.this.smallestValue) != (that.smallestValue)) {
			return false;
		}
		if ((org.jfree.chart.axis.LogAxis.this.minorTickCount) != (that.minorTickCount)) {
			return false;
		}
		return super.equals(obj);
	}

	public int hashCode() {
		int result = 193;
		long temp = java.lang.Double.doubleToLongBits(org.jfree.chart.axis.LogAxis.this.base);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		result = (37 * result) + (org.jfree.chart.axis.LogAxis.this.minorTickCount);
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.axis.LogAxis.this.smallestValue);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		if ((org.jfree.chart.axis.LogAxis.this.numberFormatOverride) != null) {
			result = (37 * result) + (org.jfree.chart.axis.LogAxis.this.numberFormatOverride.hashCode());
		}
		result = (37 * result) + (org.jfree.chart.axis.LogAxis.this.tickUnit.hashCode());
		return result;
	}

	public static org.jfree.chart.axis.TickUnitSource createLogTickUnits(java.util.Locale locale) {
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
}


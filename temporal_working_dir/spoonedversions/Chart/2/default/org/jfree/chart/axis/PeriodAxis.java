

package org.jfree.chart.axis;


public class PeriodAxis extends org.jfree.chart.axis.ValueAxis implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 8353295532075872069L;

	private org.jfree.data.time.RegularTimePeriod first;

	private org.jfree.data.time.RegularTimePeriod last;

	private java.util.TimeZone timeZone;

	private java.util.Locale locale;

	private java.util.Calendar calendar;

	private java.lang.Class autoRangeTimePeriodClass;

	private java.lang.Class majorTickTimePeriodClass;

	private boolean minorTickMarksVisible;

	private java.lang.Class minorTickTimePeriodClass;

	private float minorTickMarkInsideLength = 0.0F;

	private float minorTickMarkOutsideLength = 2.0F;

	private transient java.awt.Stroke minorTickMarkStroke = new java.awt.BasicStroke(0.5F);

	private transient java.awt.Paint minorTickMarkPaint = java.awt.Color.black;

	private org.jfree.chart.axis.PeriodAxisLabelInfo[] labelInfo;

	public PeriodAxis(java.lang.String label) {
		this(label, new org.jfree.data.time.Day(), new org.jfree.data.time.Day());
	}

	public PeriodAxis(java.lang.String label, org.jfree.data.time.RegularTimePeriod first, org.jfree.data.time.RegularTimePeriod last) {
		this(label, first, last, java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
	}

	public PeriodAxis(java.lang.String label, org.jfree.data.time.RegularTimePeriod first, org.jfree.data.time.RegularTimePeriod last, java.util.TimeZone timeZone, java.util.Locale locale) {
		super(label, null);
		if (timeZone == null) {
			throw new java.lang.IllegalArgumentException("Null 'timeZone' argument.");
		}
		if (locale == null) {
			throw new java.lang.IllegalArgumentException("Null 'locale' argument.");
		}
		org.jfree.chart.axis.PeriodAxis.this.first = first;
		org.jfree.chart.axis.PeriodAxis.this.last = last;
		org.jfree.chart.axis.PeriodAxis.this.timeZone = timeZone;
		org.jfree.chart.axis.PeriodAxis.this.locale = locale;
		org.jfree.chart.axis.PeriodAxis.this.calendar = java.util.Calendar.getInstance(timeZone, locale);
		org.jfree.chart.axis.PeriodAxis.this.first.peg(org.jfree.chart.axis.PeriodAxis.this.calendar);
		org.jfree.chart.axis.PeriodAxis.this.last.peg(org.jfree.chart.axis.PeriodAxis.this.calendar);
		org.jfree.chart.axis.PeriodAxis.this.autoRangeTimePeriodClass = first.getClass();
		org.jfree.chart.axis.PeriodAxis.this.majorTickTimePeriodClass = first.getClass();
		org.jfree.chart.axis.PeriodAxis.this.minorTickMarksVisible = false;
		org.jfree.chart.axis.PeriodAxis.this.minorTickTimePeriodClass = org.jfree.data.time.RegularTimePeriod.downsize(org.jfree.chart.axis.PeriodAxis.this.majorTickTimePeriodClass);
		setAutoRange(true);
		org.jfree.chart.axis.PeriodAxis.this.labelInfo = new org.jfree.chart.axis.PeriodAxisLabelInfo[2];
		org.jfree.chart.axis.PeriodAxis.this.labelInfo[0] = new org.jfree.chart.axis.PeriodAxisLabelInfo(org.jfree.data.time.Month.class, new java.text.SimpleDateFormat("MMM", locale));
		org.jfree.chart.axis.PeriodAxis.this.labelInfo[1] = new org.jfree.chart.axis.PeriodAxisLabelInfo(org.jfree.data.time.Year.class, new java.text.SimpleDateFormat("yyyy", locale));
	}

	public org.jfree.data.time.RegularTimePeriod getFirst() {
		return org.jfree.chart.axis.PeriodAxis.this.first;
	}

	public void setFirst(org.jfree.data.time.RegularTimePeriod first) {
		if (first == null) {
			throw new java.lang.IllegalArgumentException("Null 'first' argument.");
		}
		org.jfree.chart.axis.PeriodAxis.this.first = first;
		org.jfree.chart.axis.PeriodAxis.this.first.peg(org.jfree.chart.axis.PeriodAxis.this.calendar);
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.PeriodAxis.this));
	}

	public org.jfree.data.time.RegularTimePeriod getLast() {
		return org.jfree.chart.axis.PeriodAxis.this.last;
	}

	public void setLast(org.jfree.data.time.RegularTimePeriod last) {
		if (last == null) {
			throw new java.lang.IllegalArgumentException("Null 'last' argument.");
		}
		org.jfree.chart.axis.PeriodAxis.this.last = last;
		org.jfree.chart.axis.PeriodAxis.this.last.peg(org.jfree.chart.axis.PeriodAxis.this.calendar);
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.PeriodAxis.this));
	}

	public java.util.TimeZone getTimeZone() {
		return org.jfree.chart.axis.PeriodAxis.this.timeZone;
	}

	public void setTimeZone(java.util.TimeZone zone) {
		if (zone == null) {
			throw new java.lang.IllegalArgumentException("Null 'zone' argument.");
		}
		org.jfree.chart.axis.PeriodAxis.this.timeZone = zone;
		org.jfree.chart.axis.PeriodAxis.this.calendar = java.util.Calendar.getInstance(zone, org.jfree.chart.axis.PeriodAxis.this.locale);
		org.jfree.chart.axis.PeriodAxis.this.first.peg(org.jfree.chart.axis.PeriodAxis.this.calendar);
		org.jfree.chart.axis.PeriodAxis.this.last.peg(org.jfree.chart.axis.PeriodAxis.this.calendar);
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.PeriodAxis.this));
	}

	public java.util.Locale getLocale() {
		return org.jfree.chart.axis.PeriodAxis.this.locale;
	}

	public java.lang.Class getAutoRangeTimePeriodClass() {
		return org.jfree.chart.axis.PeriodAxis.this.autoRangeTimePeriodClass;
	}

	public void setAutoRangeTimePeriodClass(java.lang.Class c) {
		if (c == null) {
			throw new java.lang.IllegalArgumentException("Null 'c' argument.");
		}
		org.jfree.chart.axis.PeriodAxis.this.autoRangeTimePeriodClass = c;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.PeriodAxis.this));
	}

	public java.lang.Class getMajorTickTimePeriodClass() {
		return org.jfree.chart.axis.PeriodAxis.this.majorTickTimePeriodClass;
	}

	public void setMajorTickTimePeriodClass(java.lang.Class c) {
		if (c == null) {
			throw new java.lang.IllegalArgumentException("Null 'c' argument.");
		}
		org.jfree.chart.axis.PeriodAxis.this.majorTickTimePeriodClass = c;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.PeriodAxis.this));
	}

	public boolean isMinorTickMarksVisible() {
		return org.jfree.chart.axis.PeriodAxis.this.minorTickMarksVisible;
	}

	public void setMinorTickMarksVisible(boolean visible) {
		org.jfree.chart.axis.PeriodAxis.this.minorTickMarksVisible = visible;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.PeriodAxis.this));
	}

	public java.lang.Class getMinorTickTimePeriodClass() {
		return org.jfree.chart.axis.PeriodAxis.this.minorTickTimePeriodClass;
	}

	public void setMinorTickTimePeriodClass(java.lang.Class c) {
		if (c == null) {
			throw new java.lang.IllegalArgumentException("Null 'c' argument.");
		}
		org.jfree.chart.axis.PeriodAxis.this.minorTickTimePeriodClass = c;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.PeriodAxis.this));
	}

	public java.awt.Stroke getMinorTickMarkStroke() {
		return org.jfree.chart.axis.PeriodAxis.this.minorTickMarkStroke;
	}

	public void setMinorTickMarkStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.axis.PeriodAxis.this.minorTickMarkStroke = stroke;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.PeriodAxis.this));
	}

	public java.awt.Paint getMinorTickMarkPaint() {
		return org.jfree.chart.axis.PeriodAxis.this.minorTickMarkPaint;
	}

	public void setMinorTickMarkPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.axis.PeriodAxis.this.minorTickMarkPaint = paint;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.PeriodAxis.this));
	}

	public float getMinorTickMarkInsideLength() {
		return org.jfree.chart.axis.PeriodAxis.this.minorTickMarkInsideLength;
	}

	public void setMinorTickMarkInsideLength(float length) {
		org.jfree.chart.axis.PeriodAxis.this.minorTickMarkInsideLength = length;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.PeriodAxis.this));
	}

	public float getMinorTickMarkOutsideLength() {
		return org.jfree.chart.axis.PeriodAxis.this.minorTickMarkOutsideLength;
	}

	public void setMinorTickMarkOutsideLength(float length) {
		org.jfree.chart.axis.PeriodAxis.this.minorTickMarkOutsideLength = length;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.PeriodAxis.this));
	}

	public org.jfree.chart.axis.PeriodAxisLabelInfo[] getLabelInfo() {
		return org.jfree.chart.axis.PeriodAxis.this.labelInfo;
	}

	public void setLabelInfo(org.jfree.chart.axis.PeriodAxisLabelInfo[] info) {
		org.jfree.chart.axis.PeriodAxis.this.labelInfo = info;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.PeriodAxis.this));
	}

	public org.jfree.data.Range getRange() {
		return new org.jfree.data.Range(org.jfree.chart.axis.PeriodAxis.this.first.getFirstMillisecond(org.jfree.chart.axis.PeriodAxis.this.calendar), org.jfree.chart.axis.PeriodAxis.this.last.getLastMillisecond(org.jfree.chart.axis.PeriodAxis.this.calendar));
	}

	public void setRange(org.jfree.data.Range range, boolean turnOffAutoRange, boolean notify) {
		long upper = java.lang.Math.round(range.getUpperBound());
		long lower = java.lang.Math.round(range.getLowerBound());
		org.jfree.chart.axis.PeriodAxis.this.first = createInstance(org.jfree.chart.axis.PeriodAxis.this.autoRangeTimePeriodClass, new java.util.Date(lower), org.jfree.chart.axis.PeriodAxis.this.timeZone, org.jfree.chart.axis.PeriodAxis.this.locale);
		org.jfree.chart.axis.PeriodAxis.this.last = createInstance(org.jfree.chart.axis.PeriodAxis.this.autoRangeTimePeriodClass, new java.util.Date(upper), org.jfree.chart.axis.PeriodAxis.this.timeZone, org.jfree.chart.axis.PeriodAxis.this.locale);
		super.setRange(new org.jfree.data.Range(org.jfree.chart.axis.PeriodAxis.this.first.getFirstMillisecond(), ((org.jfree.chart.axis.PeriodAxis.this.last.getLastMillisecond()) + 1.0)), turnOffAutoRange, notify);
	}

	public void configure() {
		if (org.jfree.chart.axis.PeriodAxis.this.isAutoRange()) {
			autoAdjustRange();
		}
	}

	public org.jfree.chart.axis.AxisSpace reserveSpace(java.awt.Graphics2D g2, org.jfree.chart.plot.Plot plot, java.awt.geom.Rectangle2D plotArea, org.jfree.chart.util.RectangleEdge edge, org.jfree.chart.axis.AxisSpace space) {
		if (space == null) {
			space = new org.jfree.chart.axis.AxisSpace();
		}
		if (!(isVisible())) {
			return space;
		}
		double dimension = getFixedDimension();
		if (dimension > 0.0) {
			space.ensureAtLeast(dimension, edge);
		}
		java.awt.geom.Rectangle2D labelEnclosure = getLabelEnclosure(g2, edge);
		double labelHeight = 0.0;
		double labelWidth = 0.0;
		double tickLabelBandsDimension = 0.0;
		for (int i = 0; i < (org.jfree.chart.axis.PeriodAxis.this.labelInfo.length); i++) {
			org.jfree.chart.axis.PeriodAxisLabelInfo info = org.jfree.chart.axis.PeriodAxis.this.labelInfo[i];
			java.awt.FontMetrics fm = g2.getFontMetrics(info.getLabelFont());
			tickLabelBandsDimension += info.getPadding().extendHeight(fm.getHeight());
		}
		if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(edge)) {
			labelHeight = labelEnclosure.getHeight();
			space.add((labelHeight + tickLabelBandsDimension), edge);
		}else
			if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
				labelWidth = labelEnclosure.getWidth();
				space.add((labelWidth + tickLabelBandsDimension), edge);
			}
		
		double tickMarkSpace = 0.0;
		if (isTickMarksVisible()) {
			tickMarkSpace = getTickMarkOutsideLength();
		}
		if (org.jfree.chart.axis.PeriodAxis.this.minorTickMarksVisible) {
			tickMarkSpace = java.lang.Math.max(tickMarkSpace, org.jfree.chart.axis.PeriodAxis.this.minorTickMarkOutsideLength);
		}
		space.add(tickMarkSpace, edge);
		return space;
	}

	public org.jfree.chart.axis.AxisState draw(java.awt.Graphics2D g2, double cursor, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge, org.jfree.chart.plot.PlotRenderingInfo plotState) {
		org.jfree.chart.axis.AxisState axisState = new org.jfree.chart.axis.AxisState(cursor);
		if (isAxisLineVisible()) {
			drawAxisLine(g2, cursor, dataArea, edge);
		}
		if (isTickMarksVisible()) {
			drawTickMarks(g2, axisState, dataArea, edge);
		}
		if (isTickLabelsVisible()) {
			for (int band = 0; band < (org.jfree.chart.axis.PeriodAxis.this.labelInfo.length); band++) {
				axisState = drawTickLabels(band, g2, axisState, dataArea, edge);
			}
		}
		axisState = drawLabel(getLabel(), g2, plotArea, dataArea, edge, axisState, plotState);
		return axisState;
	}

	protected void drawTickMarks(java.awt.Graphics2D g2, org.jfree.chart.axis.AxisState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(edge)) {
			drawTickMarksHorizontal(g2, state, dataArea, edge);
		}else
			if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
				drawTickMarksVertical(g2, state, dataArea, edge);
			}
		
	}

	protected void drawTickMarksHorizontal(java.awt.Graphics2D g2, org.jfree.chart.axis.AxisState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		java.util.List ticks = new java.util.ArrayList();
		double x0 = dataArea.getX();
		double y0 = state.getCursor();
		double insideLength = getTickMarkInsideLength();
		double outsideLength = getTickMarkOutsideLength();
		org.jfree.data.time.RegularTimePeriod t = createInstance(org.jfree.chart.axis.PeriodAxis.this.majorTickTimePeriodClass, org.jfree.chart.axis.PeriodAxis.this.first.getStart(), getTimeZone(), org.jfree.chart.axis.PeriodAxis.this.locale);
		long t0 = t.getFirstMillisecond();
		java.awt.geom.Line2D inside = null;
		java.awt.geom.Line2D outside = null;
		long firstOnAxis = getFirst().getFirstMillisecond();
		long lastOnAxis = (getLast().getLastMillisecond()) + 1;
		while (t0 <= lastOnAxis) {
			ticks.add(new org.jfree.chart.axis.NumberTick(new java.lang.Double(t0), "", org.jfree.chart.text.TextAnchor.CENTER, org.jfree.chart.text.TextAnchor.CENTER, 0.0));
			x0 = valueToJava2D(t0, dataArea, edge);
			if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
				inside = new java.awt.geom.Line2D.Double(x0, y0, x0, (y0 + insideLength));
				outside = new java.awt.geom.Line2D.Double(x0, y0, x0, (y0 - outsideLength));
			}else
				if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
					inside = new java.awt.geom.Line2D.Double(x0, y0, x0, (y0 - insideLength));
					outside = new java.awt.geom.Line2D.Double(x0, y0, x0, (y0 + outsideLength));
				}
			
			if (t0 >= firstOnAxis) {
				g2.setPaint(getTickMarkPaint());
				g2.setStroke(getTickMarkStroke());
				g2.draw(inside);
				g2.draw(outside);
			}
			if (org.jfree.chart.axis.PeriodAxis.this.minorTickMarksVisible) {
				org.jfree.data.time.RegularTimePeriod tminor = createInstance(org.jfree.chart.axis.PeriodAxis.this.minorTickTimePeriodClass, new java.util.Date(t0), getTimeZone(), org.jfree.chart.axis.PeriodAxis.this.locale);
				long tt0 = tminor.getFirstMillisecond();
				while ((tt0 < (t.getLastMillisecond())) && (tt0 < lastOnAxis)) {
					double xx0 = valueToJava2D(tt0, dataArea, edge);
					if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
						inside = new java.awt.geom.Line2D.Double(xx0, y0, xx0, (y0 + (org.jfree.chart.axis.PeriodAxis.this.minorTickMarkInsideLength)));
						outside = new java.awt.geom.Line2D.Double(xx0, y0, xx0, (y0 - (org.jfree.chart.axis.PeriodAxis.this.minorTickMarkOutsideLength)));
					}else
						if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
							inside = new java.awt.geom.Line2D.Double(xx0, y0, xx0, (y0 - (org.jfree.chart.axis.PeriodAxis.this.minorTickMarkInsideLength)));
							outside = new java.awt.geom.Line2D.Double(xx0, y0, xx0, (y0 + (org.jfree.chart.axis.PeriodAxis.this.minorTickMarkOutsideLength)));
						}
					
					if (tt0 >= firstOnAxis) {
						g2.setPaint(org.jfree.chart.axis.PeriodAxis.this.minorTickMarkPaint);
						g2.setStroke(org.jfree.chart.axis.PeriodAxis.this.minorTickMarkStroke);
						g2.draw(inside);
						g2.draw(outside);
					}
					tminor = tminor.next();
					tminor.peg(org.jfree.chart.axis.PeriodAxis.this.calendar);
					tt0 = tminor.getFirstMillisecond();
				} 
			}
			t = t.next();
			t.peg(org.jfree.chart.axis.PeriodAxis.this.calendar);
			t0 = t.getFirstMillisecond();
		} 
		if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
			state.cursorUp(java.lang.Math.max(outsideLength, org.jfree.chart.axis.PeriodAxis.this.minorTickMarkOutsideLength));
		}else
			if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
				state.cursorDown(java.lang.Math.max(outsideLength, org.jfree.chart.axis.PeriodAxis.this.minorTickMarkOutsideLength));
			}
		
		state.setTicks(ticks);
	}

	protected void drawTickMarksVertical(java.awt.Graphics2D g2, org.jfree.chart.axis.AxisState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
	}

	protected org.jfree.chart.axis.AxisState drawTickLabels(int band, java.awt.Graphics2D g2, org.jfree.chart.axis.AxisState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		double delta1 = 0.0;
		java.awt.FontMetrics fm = g2.getFontMetrics(org.jfree.chart.axis.PeriodAxis.this.labelInfo[band].getLabelFont());
		if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
			delta1 = org.jfree.chart.axis.PeriodAxis.this.labelInfo[band].getPadding().calculateTopOutset(fm.getHeight());
		}else
			if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
				delta1 = org.jfree.chart.axis.PeriodAxis.this.labelInfo[band].getPadding().calculateBottomOutset(fm.getHeight());
			}
		
		state.moveCursor(delta1, edge);
		long axisMin = org.jfree.chart.axis.PeriodAxis.this.first.getFirstMillisecond();
		long axisMax = org.jfree.chart.axis.PeriodAxis.this.last.getLastMillisecond();
		g2.setFont(org.jfree.chart.axis.PeriodAxis.this.labelInfo[band].getLabelFont());
		g2.setPaint(org.jfree.chart.axis.PeriodAxis.this.labelInfo[band].getLabelPaint());
		org.jfree.data.time.RegularTimePeriod p1 = org.jfree.chart.axis.PeriodAxis.this.labelInfo[band].createInstance(new java.util.Date(axisMin), org.jfree.chart.axis.PeriodAxis.this.timeZone, org.jfree.chart.axis.PeriodAxis.this.locale);
		org.jfree.data.time.RegularTimePeriod p2 = org.jfree.chart.axis.PeriodAxis.this.labelInfo[band].createInstance(new java.util.Date(axisMax), org.jfree.chart.axis.PeriodAxis.this.timeZone, org.jfree.chart.axis.PeriodAxis.this.locale);
		java.lang.String label1 = org.jfree.chart.axis.PeriodAxis.this.labelInfo[band].getDateFormat().format(new java.util.Date(p1.getMiddleMillisecond()));
		java.lang.String label2 = org.jfree.chart.axis.PeriodAxis.this.labelInfo[band].getDateFormat().format(new java.util.Date(p2.getMiddleMillisecond()));
		java.awt.geom.Rectangle2D b1 = org.jfree.chart.text.TextUtilities.getTextBounds(label1, g2, g2.getFontMetrics());
		java.awt.geom.Rectangle2D b2 = org.jfree.chart.text.TextUtilities.getTextBounds(label2, g2, g2.getFontMetrics());
		double w = java.lang.Math.max(b1.getWidth(), b2.getWidth());
		long ww = java.lang.Math.round(java2DToValue((((dataArea.getX()) + w) + 5.0), dataArea, edge));
		if (isInverted()) {
			ww = axisMax - ww;
		}else {
			ww = ww - axisMin;
		}
		long length = (p1.getLastMillisecond()) - (p1.getFirstMillisecond());
		int periods = ((int) (ww / length)) + 1;
		org.jfree.data.time.RegularTimePeriod p = org.jfree.chart.axis.PeriodAxis.this.labelInfo[band].createInstance(new java.util.Date(axisMin), org.jfree.chart.axis.PeriodAxis.this.timeZone, org.jfree.chart.axis.PeriodAxis.this.locale);
		java.awt.geom.Rectangle2D b = null;
		long lastXX = 0L;
		float y = ((float) (state.getCursor()));
		org.jfree.chart.text.TextAnchor anchor = org.jfree.chart.text.TextAnchor.TOP_CENTER;
		float yDelta = ((float) (b1.getHeight()));
		if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
			anchor = org.jfree.chart.text.TextAnchor.BOTTOM_CENTER;
			yDelta = -yDelta;
		}
		while ((p.getFirstMillisecond()) <= axisMax) {
			float x = ((float) (valueToJava2D(p.getMiddleMillisecond(), dataArea, edge)));
			java.text.DateFormat df = org.jfree.chart.axis.PeriodAxis.this.labelInfo[band].getDateFormat();
			java.lang.String label = df.format(new java.util.Date(p.getMiddleMillisecond()));
			long first = p.getFirstMillisecond();
			long last = p.getLastMillisecond();
			if (last > axisMax) {
				java.awt.geom.Rectangle2D bb = org.jfree.chart.text.TextUtilities.getTextBounds(label, g2, g2.getFontMetrics());
				if ((x + ((bb.getWidth()) / 2)) > (dataArea.getMaxX())) {
					float xstart = ((float) (valueToJava2D(java.lang.Math.max(first, axisMin), dataArea, edge)));
					if ((bb.getWidth()) < ((dataArea.getMaxX()) - xstart)) {
						x = (((float) (dataArea.getMaxX())) + xstart) / 2.0F;
					}else {
						label = null;
					}
				}
			}
			if (first < axisMin) {
				java.awt.geom.Rectangle2D bb = org.jfree.chart.text.TextUtilities.getTextBounds(label, g2, g2.getFontMetrics());
				if ((x - ((bb.getWidth()) / 2)) < (dataArea.getX())) {
					float xlast = ((float) (valueToJava2D(java.lang.Math.min(last, axisMax), dataArea, edge)));
					if ((bb.getWidth()) < (xlast - (dataArea.getX()))) {
						x = (xlast + ((float) (dataArea.getX()))) / 2.0F;
					}else {
						label = null;
					}
				}
			}
			if (label != null) {
				g2.setPaint(org.jfree.chart.axis.PeriodAxis.this.labelInfo[band].getLabelPaint());
				b = org.jfree.chart.text.TextUtilities.drawAlignedString(label, g2, x, y, anchor);
			}
			if (lastXX > 0L) {
				if (org.jfree.chart.axis.PeriodAxis.this.labelInfo[band].getDrawDividers()) {
					long nextXX = p.getFirstMillisecond();
					long mid = (lastXX + nextXX) / 2;
					float mid2d = ((float) (valueToJava2D(mid, dataArea, edge)));
					g2.setStroke(org.jfree.chart.axis.PeriodAxis.this.labelInfo[band].getDividerStroke());
					g2.setPaint(org.jfree.chart.axis.PeriodAxis.this.labelInfo[band].getDividerPaint());
					g2.draw(new java.awt.geom.Line2D.Float(mid2d, y, mid2d, (y + yDelta)));
				}
			}
			lastXX = last;
			for (int i = 0; i < periods; i++) {
				p = p.next();
			}
			p.peg(org.jfree.chart.axis.PeriodAxis.this.calendar);
		} 
		double used = 0.0;
		if (b != null) {
			used = b.getHeight();
			if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
				used += org.jfree.chart.axis.PeriodAxis.this.labelInfo[band].getPadding().calculateBottomOutset(fm.getHeight());
			}else
				if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
					used += org.jfree.chart.axis.PeriodAxis.this.labelInfo[band].getPadding().calculateTopOutset(fm.getHeight());
				}
			
		}
		state.moveCursor(used, edge);
		return state;
	}

	public java.util.List refreshTicks(java.awt.Graphics2D g2, org.jfree.chart.axis.AxisState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		return java.util.Collections.EMPTY_LIST;
	}

	public double valueToJava2D(double value, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge) {
		double result = java.lang.Double.NaN;
		double axisMin = org.jfree.chart.axis.PeriodAxis.this.first.getFirstMillisecond();
		double axisMax = org.jfree.chart.axis.PeriodAxis.this.last.getLastMillisecond();
		if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(edge)) {
			double minX = area.getX();
			double maxX = area.getMaxX();
			if (isInverted()) {
				result = maxX + (((value - axisMin) / (axisMax - axisMin)) * (minX - maxX));
			}else {
				result = minX + (((value - axisMin) / (axisMax - axisMin)) * (maxX - minX));
			}
		}else
			if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
				double minY = area.getMinY();
				double maxY = area.getMaxY();
				if (isInverted()) {
					result = minY + (((value - axisMin) / (axisMax - axisMin)) * (maxY - minY));
				}else {
					result = maxY - (((value - axisMin) / (axisMax - axisMin)) * (maxY - minY));
				}
			}
		
		return result;
	}

	public double java2DToValue(double java2DValue, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge) {
		double result = java.lang.Double.NaN;
		double min = 0.0;
		double max = 0.0;
		double axisMin = org.jfree.chart.axis.PeriodAxis.this.first.getFirstMillisecond();
		double axisMax = org.jfree.chart.axis.PeriodAxis.this.last.getLastMillisecond();
		if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(edge)) {
			min = area.getX();
			max = area.getMaxX();
		}else
			if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
				min = area.getMaxY();
				max = area.getY();
			}
		
		if (isInverted()) {
			result = axisMax - (((java2DValue - min) / (max - min)) * (axisMax - axisMin));
		}else {
			result = axisMin + (((java2DValue - min) / (max - min)) * (axisMax - axisMin));
		}
		return result;
	}

	protected void autoAdjustRange() {
		org.jfree.chart.plot.Plot plot = getPlot();
		if (plot == null) {
			return ;
		}
		if (plot instanceof org.jfree.chart.plot.ValueAxisPlot) {
			org.jfree.chart.plot.ValueAxisPlot vap = ((org.jfree.chart.plot.ValueAxisPlot) (plot));
			org.jfree.data.Range r = vap.getDataRange(org.jfree.chart.axis.PeriodAxis.this);
			if (r == null) {
				r = getDefaultAutoRange();
			}
			long upper = java.lang.Math.round(r.getUpperBound());
			long lower = java.lang.Math.round(r.getLowerBound());
			org.jfree.chart.axis.PeriodAxis.this.first = createInstance(org.jfree.chart.axis.PeriodAxis.this.autoRangeTimePeriodClass, new java.util.Date(lower), org.jfree.chart.axis.PeriodAxis.this.timeZone, org.jfree.chart.axis.PeriodAxis.this.locale);
			org.jfree.chart.axis.PeriodAxis.this.last = createInstance(org.jfree.chart.axis.PeriodAxis.this.autoRangeTimePeriodClass, new java.util.Date(upper), org.jfree.chart.axis.PeriodAxis.this.timeZone, org.jfree.chart.axis.PeriodAxis.this.locale);
			setRange(r, false, false);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.axis.PeriodAxis.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.PeriodAxis)) {
			return false;
		}
		org.jfree.chart.axis.PeriodAxis that = ((org.jfree.chart.axis.PeriodAxis) (obj));
		if (!(org.jfree.chart.axis.PeriodAxis.this.first.equals(that.first))) {
			return false;
		}
		if (!(org.jfree.chart.axis.PeriodAxis.this.last.equals(that.last))) {
			return false;
		}
		if (!(org.jfree.chart.axis.PeriodAxis.this.timeZone.equals(that.timeZone))) {
			return false;
		}
		if (!(org.jfree.chart.axis.PeriodAxis.this.locale.equals(that.locale))) {
			return false;
		}
		if (!(org.jfree.chart.axis.PeriodAxis.this.autoRangeTimePeriodClass.equals(that.autoRangeTimePeriodClass))) {
			return false;
		}
		if (!((isMinorTickMarksVisible()) == (that.isMinorTickMarksVisible()))) {
			return false;
		}
		if (!(org.jfree.chart.axis.PeriodAxis.this.majorTickTimePeriodClass.equals(that.majorTickTimePeriodClass))) {
			return false;
		}
		if (!(org.jfree.chart.axis.PeriodAxis.this.minorTickTimePeriodClass.equals(that.minorTickTimePeriodClass))) {
			return false;
		}
		if (!(org.jfree.chart.axis.PeriodAxis.this.minorTickMarkPaint.equals(that.minorTickMarkPaint))) {
			return false;
		}
		if (!(org.jfree.chart.axis.PeriodAxis.this.minorTickMarkStroke.equals(that.minorTickMarkStroke))) {
			return false;
		}
		if (!(java.util.Arrays.equals(org.jfree.chart.axis.PeriodAxis.this.labelInfo, that.labelInfo))) {
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

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.axis.PeriodAxis clone = ((org.jfree.chart.axis.PeriodAxis) (super.clone()));
		clone.timeZone = ((java.util.TimeZone) (org.jfree.chart.axis.PeriodAxis.this.timeZone.clone()));
		clone.labelInfo = new org.jfree.chart.axis.PeriodAxisLabelInfo[org.jfree.chart.axis.PeriodAxis.this.labelInfo.length];
		for (int i = 0; i < (org.jfree.chart.axis.PeriodAxis.this.labelInfo.length); i++) {
			clone.labelInfo[i] = org.jfree.chart.axis.PeriodAxis.this.labelInfo[i];
		}
		return clone;
	}

	private org.jfree.data.time.RegularTimePeriod createInstance(java.lang.Class periodClass, java.util.Date millisecond, java.util.TimeZone zone, java.util.Locale locale) {
		org.jfree.data.time.RegularTimePeriod result = null;
		try {
			java.lang.reflect.Constructor c = periodClass.getDeclaredConstructor(new java.lang.Class[]{ java.util.Date.class , java.util.TimeZone.class , java.util.Locale.class });
			result = ((org.jfree.data.time.RegularTimePeriod) (c.newInstance(new java.lang.Object[]{ millisecond , zone , locale })));
		} catch (java.lang.Exception e) {
			try {
				java.lang.reflect.Constructor c = periodClass.getDeclaredConstructor(new java.lang.Class[]{ java.util.Date.class });
				result = ((org.jfree.data.time.RegularTimePeriod) (c.newInstance(new java.lang.Object[]{ millisecond })));
			} catch (java.lang.Exception e2) {
			}
		}
		return result;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.axis.PeriodAxis.this.minorTickMarkStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.axis.PeriodAxis.this.minorTickMarkPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.axis.PeriodAxis.this.minorTickMarkStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.axis.PeriodAxis.this.minorTickMarkPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}


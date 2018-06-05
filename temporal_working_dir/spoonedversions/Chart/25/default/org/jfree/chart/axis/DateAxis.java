

package org.jfree.chart.axis;


public class DateAxis extends org.jfree.chart.axis.ValueAxis implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = -1013460999649007604L;

	public static final org.jfree.data.time.DateRange DEFAULT_DATE_RANGE = new org.jfree.data.time.DateRange();

	public static final double DEFAULT_AUTO_RANGE_MINIMUM_SIZE_IN_MILLISECONDS = 2.0;

	public static final org.jfree.chart.axis.DateTickUnit DEFAULT_DATE_TICK_UNIT = new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.DAY, 1, new java.text.SimpleDateFormat());

	public static final java.util.Date DEFAULT_ANCHOR_DATE = new java.util.Date();

	private org.jfree.chart.axis.DateTickUnit tickUnit;

	private java.text.DateFormat dateFormatOverride;

	private org.jfree.chart.axis.DateTickMarkPosition tickMarkPosition = org.jfree.chart.axis.DateTickMarkPosition.START;

	private static class DefaultTimeline implements java.io.Serializable , org.jfree.chart.axis.Timeline {
		public long toTimelineValue(long millisecond) {
			return millisecond;
		}

		public long toTimelineValue(java.util.Date date) {
			return date.getTime();
		}

		public long toMillisecond(long value) {
			return value;
		}

		public boolean containsDomainValue(long millisecond) {
			return true;
		}

		public boolean containsDomainValue(java.util.Date date) {
			return true;
		}

		public boolean containsDomainRange(long from, long to) {
			return true;
		}

		public boolean containsDomainRange(java.util.Date from, java.util.Date to) {
			return true;
		}

		public boolean equals(java.lang.Object object) {
			if (object == null) {
				return false;
			}
			if (object == (org.jfree.chart.axis.DateAxis.DefaultTimeline.this)) {
				return true;
			}
			if (object instanceof org.jfree.chart.axis.DateAxis.DefaultTimeline) {
				return true;
			}
			return false;
		}
	}

	private static final org.jfree.chart.axis.Timeline DEFAULT_TIMELINE = new org.jfree.chart.axis.DateAxis.DefaultTimeline();

	private java.util.TimeZone timeZone;

	private org.jfree.chart.axis.Timeline timeline;

	public DateAxis() {
		this(null);
	}

	public DateAxis(java.lang.String label) {
		this(label, java.util.TimeZone.getDefault());
	}

	public DateAxis(java.lang.String label, java.util.TimeZone zone) {
		super(label, org.jfree.chart.axis.DateAxis.createStandardDateTickUnits(zone));
		setTickUnit(org.jfree.chart.axis.DateAxis.DEFAULT_DATE_TICK_UNIT, false, false);
		setAutoRangeMinimumSize(org.jfree.chart.axis.DateAxis.DEFAULT_AUTO_RANGE_MINIMUM_SIZE_IN_MILLISECONDS);
		setRange(org.jfree.chart.axis.DateAxis.DEFAULT_DATE_RANGE, false, false);
		org.jfree.chart.axis.DateAxis.this.dateFormatOverride = null;
		org.jfree.chart.axis.DateAxis.this.timeZone = zone;
		org.jfree.chart.axis.DateAxis.this.timeline = org.jfree.chart.axis.DateAxis.DEFAULT_TIMELINE;
	}

	public java.util.TimeZone getTimeZone() {
		return org.jfree.chart.axis.DateAxis.this.timeZone;
	}

	public void setTimeZone(java.util.TimeZone zone) {
		if (!(org.jfree.chart.axis.DateAxis.this.timeZone.equals(zone))) {
			org.jfree.chart.axis.DateAxis.this.timeZone = zone;
			setStandardTickUnits(org.jfree.chart.axis.DateAxis.createStandardDateTickUnits(zone));
			notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.DateAxis.this));
		}
	}

	public org.jfree.chart.axis.Timeline getTimeline() {
		return org.jfree.chart.axis.DateAxis.this.timeline;
	}

	public void setTimeline(org.jfree.chart.axis.Timeline timeline) {
		if ((org.jfree.chart.axis.DateAxis.this.timeline) != timeline) {
			org.jfree.chart.axis.DateAxis.this.timeline = timeline;
			notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.DateAxis.this));
		}
	}

	public org.jfree.chart.axis.DateTickUnit getTickUnit() {
		return org.jfree.chart.axis.DateAxis.this.tickUnit;
	}

	public void setTickUnit(org.jfree.chart.axis.DateTickUnit unit) {
		setTickUnit(unit, true, true);
	}

	public void setTickUnit(org.jfree.chart.axis.DateTickUnit unit, boolean notify, boolean turnOffAutoSelection) {
		org.jfree.chart.axis.DateAxis.this.tickUnit = unit;
		if (turnOffAutoSelection) {
			setAutoTickUnitSelection(false, false);
		}
		if (notify) {
			notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.DateAxis.this));
		}
	}

	public java.text.DateFormat getDateFormatOverride() {
		return org.jfree.chart.axis.DateAxis.this.dateFormatOverride;
	}

	public void setDateFormatOverride(java.text.DateFormat formatter) {
		org.jfree.chart.axis.DateAxis.this.dateFormatOverride = formatter;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.DateAxis.this));
	}

	public void setRange(org.jfree.data.Range range) {
		setRange(range, true, true);
	}

	public void setRange(org.jfree.data.Range range, boolean turnOffAutoRange, boolean notify) {
		if (range == null) {
			throw new java.lang.IllegalArgumentException("Null 'range' argument.");
		}
		if (!(range instanceof org.jfree.data.time.DateRange)) {
			range = new org.jfree.data.time.DateRange(range);
		}
		super.setRange(range, turnOffAutoRange, notify);
	}

	public void setRange(java.util.Date lower, java.util.Date upper) {
		if ((lower.getTime()) >= (upper.getTime())) {
			throw new java.lang.IllegalArgumentException("Requires 'lower' < 'upper'.");
		}
		setRange(new org.jfree.data.time.DateRange(lower, upper));
	}

	public void setRange(double lower, double upper) {
		if (lower >= upper) {
			throw new java.lang.IllegalArgumentException("Requires 'lower' < 'upper'.");
		}
		setRange(new org.jfree.data.time.DateRange(lower, upper));
	}

	public java.util.Date getMinimumDate() {
		java.util.Date result = null;
		org.jfree.data.Range range = getRange();
		if (range instanceof org.jfree.data.time.DateRange) {
			org.jfree.data.time.DateRange r = ((org.jfree.data.time.DateRange) (range));
			result = r.getLowerDate();
		}else {
			result = new java.util.Date(((long) (range.getLowerBound())));
		}
		return result;
	}

	public void setMinimumDate(java.util.Date date) {
		if (date == null) {
			throw new java.lang.IllegalArgumentException("Null 'date' argument.");
		}
		java.util.Date maxDate = getMaximumDate();
		long maxMillis = maxDate.getTime();
		long newMinMillis = date.getTime();
		if (maxMillis <= newMinMillis) {
			java.util.Date oldMin = getMinimumDate();
			long length = maxMillis - (oldMin.getTime());
			maxDate = new java.util.Date((newMinMillis + length));
		}
		setRange(new org.jfree.data.time.DateRange(date, maxDate), true, false);
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.DateAxis.this));
	}

	public java.util.Date getMaximumDate() {
		java.util.Date result = null;
		org.jfree.data.Range range = getRange();
		if (range instanceof org.jfree.data.time.DateRange) {
			org.jfree.data.time.DateRange r = ((org.jfree.data.time.DateRange) (range));
			result = r.getUpperDate();
		}else {
			result = new java.util.Date(((long) (range.getUpperBound())));
		}
		return result;
	}

	public void setMaximumDate(java.util.Date maximumDate) {
		if (maximumDate == null) {
			throw new java.lang.IllegalArgumentException("Null 'maximumDate' argument.");
		}
		java.util.Date minDate = getMinimumDate();
		long minMillis = minDate.getTime();
		long newMaxMillis = maximumDate.getTime();
		if (minMillis >= newMaxMillis) {
			java.util.Date oldMax = getMaximumDate();
			long length = (oldMax.getTime()) - minMillis;
			minDate = new java.util.Date((newMaxMillis - length));
		}
		setRange(new org.jfree.data.time.DateRange(minDate, maximumDate), true, false);
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.DateAxis.this));
	}

	public org.jfree.chart.axis.DateTickMarkPosition getTickMarkPosition() {
		return org.jfree.chart.axis.DateAxis.this.tickMarkPosition;
	}

	public void setTickMarkPosition(org.jfree.chart.axis.DateTickMarkPosition position) {
		if (position == null) {
			throw new java.lang.IllegalArgumentException("Null 'position' argument.");
		}
		org.jfree.chart.axis.DateAxis.this.tickMarkPosition = position;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.DateAxis.this));
	}

	public void configure() {
		if (isAutoRange()) {
			autoAdjustRange();
		}
	}

	public boolean isHiddenValue(long millis) {
		return !(org.jfree.chart.axis.DateAxis.this.timeline.containsDomainValue(new java.util.Date(millis)));
	}

	public double valueToJava2D(double value, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge) {
		value = org.jfree.chart.axis.DateAxis.this.timeline.toTimelineValue(((long) (value)));
		org.jfree.data.time.DateRange range = ((org.jfree.data.time.DateRange) (getRange()));
		double axisMin = org.jfree.chart.axis.DateAxis.this.timeline.toTimelineValue(range.getLowerDate());
		double axisMax = org.jfree.chart.axis.DateAxis.this.timeline.toTimelineValue(range.getUpperDate());
		double result = 0.0;
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

	public double dateToJava2D(java.util.Date date, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge) {
		double value = date.getTime();
		return valueToJava2D(value, area, edge);
	}

	public double java2DToValue(double java2DValue, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge) {
		org.jfree.data.time.DateRange range = ((org.jfree.data.time.DateRange) (getRange()));
		double axisMin = org.jfree.chart.axis.DateAxis.this.timeline.toTimelineValue(range.getLowerDate());
		double axisMax = org.jfree.chart.axis.DateAxis.this.timeline.toTimelineValue(range.getUpperDate());
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
		
		double result;
		if (isInverted()) {
			result = axisMax - (((java2DValue - min) / (max - min)) * (axisMax - axisMin));
		}else {
			result = axisMin + (((java2DValue - min) / (max - min)) * (axisMax - axisMin));
		}
		return org.jfree.chart.axis.DateAxis.this.timeline.toMillisecond(((long) (result)));
	}

	public java.util.Date calculateLowestVisibleTickValue(org.jfree.chart.axis.DateTickUnit unit) {
		return nextStandardDate(getMinimumDate(), unit);
	}

	public java.util.Date calculateHighestVisibleTickValue(org.jfree.chart.axis.DateTickUnit unit) {
		return previousStandardDate(getMaximumDate(), unit);
	}

	protected java.util.Date previousStandardDate(java.util.Date date, org.jfree.chart.axis.DateTickUnit unit) {
		int milliseconds;
		int seconds;
		int minutes;
		int hours;
		int days;
		int months;
		int years;
		java.util.Calendar calendar = java.util.Calendar.getInstance(org.jfree.chart.axis.DateAxis.this.timeZone);
		calendar.setTime(date);
		int count = unit.getCount();
		int current = calendar.get(unit.getCalendarField());
		int value = count * (current / count);
		switch (unit.getUnit()) {
			case org.jfree.chart.axis.DateTickUnit.MILLISECOND :
				years = calendar.get(java.util.Calendar.YEAR);
				months = calendar.get(java.util.Calendar.MONTH);
				days = calendar.get(java.util.Calendar.DATE);
				hours = calendar.get(java.util.Calendar.HOUR_OF_DAY);
				minutes = calendar.get(java.util.Calendar.MINUTE);
				seconds = calendar.get(java.util.Calendar.SECOND);
				calendar.set(years, months, days, hours, minutes, seconds);
				calendar.set(java.util.Calendar.MILLISECOND, value);
				java.util.Date mm = calendar.getTime();
				if ((mm.getTime()) >= (date.getTime())) {
					calendar.set(java.util.Calendar.MILLISECOND, (value - 1));
					mm = calendar.getTime();
				}
				return calendar.getTime();
			case org.jfree.chart.axis.DateTickUnit.SECOND :
				years = calendar.get(java.util.Calendar.YEAR);
				months = calendar.get(java.util.Calendar.MONTH);
				days = calendar.get(java.util.Calendar.DATE);
				hours = calendar.get(java.util.Calendar.HOUR_OF_DAY);
				minutes = calendar.get(java.util.Calendar.MINUTE);
				if ((org.jfree.chart.axis.DateAxis.this.tickMarkPosition) == (org.jfree.chart.axis.DateTickMarkPosition.START)) {
					milliseconds = 0;
				}else
					if ((org.jfree.chart.axis.DateAxis.this.tickMarkPosition) == (org.jfree.chart.axis.DateTickMarkPosition.MIDDLE)) {
						milliseconds = 500;
					}else {
						milliseconds = 999;
					}
				
				calendar.set(java.util.Calendar.MILLISECOND, milliseconds);
				calendar.set(years, months, days, hours, minutes, value);
				java.util.Date dd = calendar.getTime();
				if ((dd.getTime()) >= (date.getTime())) {
					calendar.set(java.util.Calendar.SECOND, (value - 1));
					dd = calendar.getTime();
				}
				return calendar.getTime();
			case org.jfree.chart.axis.DateTickUnit.MINUTE :
				years = calendar.get(java.util.Calendar.YEAR);
				months = calendar.get(java.util.Calendar.MONTH);
				days = calendar.get(java.util.Calendar.DATE);
				hours = calendar.get(java.util.Calendar.HOUR_OF_DAY);
				if ((org.jfree.chart.axis.DateAxis.this.tickMarkPosition) == (org.jfree.chart.axis.DateTickMarkPosition.START)) {
					seconds = 0;
				}else
					if ((org.jfree.chart.axis.DateAxis.this.tickMarkPosition) == (org.jfree.chart.axis.DateTickMarkPosition.MIDDLE)) {
						seconds = 30;
					}else {
						seconds = 59;
					}
				
				calendar.clear(java.util.Calendar.MILLISECOND);
				calendar.set(years, months, days, hours, value, seconds);
				java.util.Date d0 = calendar.getTime();
				if ((d0.getTime()) >= (date.getTime())) {
					calendar.set(java.util.Calendar.MINUTE, (value - 1));
					d0 = calendar.getTime();
				}
				return d0;
			case org.jfree.chart.axis.DateTickUnit.HOUR :
				years = calendar.get(java.util.Calendar.YEAR);
				months = calendar.get(java.util.Calendar.MONTH);
				days = calendar.get(java.util.Calendar.DATE);
				if ((org.jfree.chart.axis.DateAxis.this.tickMarkPosition) == (org.jfree.chart.axis.DateTickMarkPosition.START)) {
					minutes = 0;
					seconds = 0;
				}else
					if ((org.jfree.chart.axis.DateAxis.this.tickMarkPosition) == (org.jfree.chart.axis.DateTickMarkPosition.MIDDLE)) {
						minutes = 30;
						seconds = 0;
					}else {
						minutes = 59;
						seconds = 59;
					}
				
				calendar.clear(java.util.Calendar.MILLISECOND);
				calendar.set(years, months, days, value, minutes, seconds);
				java.util.Date d1 = calendar.getTime();
				if ((d1.getTime()) >= (date.getTime())) {
					calendar.set(java.util.Calendar.HOUR_OF_DAY, (value - 1));
					d1 = calendar.getTime();
				}
				return d1;
			case org.jfree.chart.axis.DateTickUnit.DAY :
				years = calendar.get(java.util.Calendar.YEAR);
				months = calendar.get(java.util.Calendar.MONTH);
				if ((org.jfree.chart.axis.DateAxis.this.tickMarkPosition) == (org.jfree.chart.axis.DateTickMarkPosition.START)) {
					hours = 0;
					minutes = 0;
					seconds = 0;
				}else
					if ((org.jfree.chart.axis.DateAxis.this.tickMarkPosition) == (org.jfree.chart.axis.DateTickMarkPosition.MIDDLE)) {
						hours = 12;
						minutes = 0;
						seconds = 0;
					}else {
						hours = 23;
						minutes = 59;
						seconds = 59;
					}
				
				calendar.clear(java.util.Calendar.MILLISECOND);
				calendar.set(years, months, value, hours, 0, 0);
				java.util.Date d2 = calendar.getTime();
				if ((d2.getTime()) >= (date.getTime())) {
					calendar.set(java.util.Calendar.DATE, (value - 1));
					d2 = calendar.getTime();
				}
				return d2;
			case org.jfree.chart.axis.DateTickUnit.MONTH :
				years = calendar.get(java.util.Calendar.YEAR);
				calendar.clear(java.util.Calendar.MILLISECOND);
				calendar.set(years, value, 1, 0, 0, 0);
				org.jfree.data.time.Month month = new org.jfree.data.time.Month(calendar.getTime(), org.jfree.chart.axis.DateAxis.this.timeZone);
				java.util.Date standardDate = calculateDateForPosition(month, org.jfree.chart.axis.DateAxis.this.tickMarkPosition);
				long millis = standardDate.getTime();
				if (millis >= (date.getTime())) {
					month = ((org.jfree.data.time.Month) (month.previous()));
					standardDate = calculateDateForPosition(month, org.jfree.chart.axis.DateAxis.this.tickMarkPosition);
				}
				return standardDate;
			case org.jfree.chart.axis.DateTickUnit.YEAR :
				if ((org.jfree.chart.axis.DateAxis.this.tickMarkPosition) == (org.jfree.chart.axis.DateTickMarkPosition.START)) {
					months = 0;
					days = 1;
				}else
					if ((org.jfree.chart.axis.DateAxis.this.tickMarkPosition) == (org.jfree.chart.axis.DateTickMarkPosition.MIDDLE)) {
						months = 6;
						days = 1;
					}else {
						months = 11;
						days = 31;
					}
				
				calendar.clear(java.util.Calendar.MILLISECOND);
				calendar.set(value, months, days, 0, 0, 0);
				java.util.Date d3 = calendar.getTime();
				if ((d3.getTime()) >= (date.getTime())) {
					calendar.set(java.util.Calendar.YEAR, (value - 1));
					d3 = calendar.getTime();
				}
				return d3;
			default :
				return null;
		}
	}

	private java.util.Date calculateDateForPosition(org.jfree.data.time.RegularTimePeriod period, org.jfree.chart.axis.DateTickMarkPosition position) {
		if (position == null) {
			throw new java.lang.IllegalArgumentException("Null 'position' argument.");
		}
		java.util.Date result = null;
		if (position == (org.jfree.chart.axis.DateTickMarkPosition.START)) {
			result = new java.util.Date(period.getFirstMillisecond());
		}else
			if (position == (org.jfree.chart.axis.DateTickMarkPosition.MIDDLE)) {
				result = new java.util.Date(period.getMiddleMillisecond());
			}else
				if (position == (org.jfree.chart.axis.DateTickMarkPosition.END)) {
					result = new java.util.Date(period.getLastMillisecond());
				}
			
		
		return result;
	}

	protected java.util.Date nextStandardDate(java.util.Date date, org.jfree.chart.axis.DateTickUnit unit) {
		java.util.Date previous = previousStandardDate(date, unit);
		java.util.Calendar calendar = java.util.Calendar.getInstance(org.jfree.chart.axis.DateAxis.this.timeZone);
		calendar.setTime(previous);
		calendar.add(unit.getCalendarField(), unit.getCount());
		return calendar.getTime();
	}

	public static org.jfree.chart.axis.TickUnitSource createStandardDateTickUnits() {
		return org.jfree.chart.axis.DateAxis.createStandardDateTickUnits(java.util.TimeZone.getDefault());
	}

	public static org.jfree.chart.axis.TickUnitSource createStandardDateTickUnits(java.util.TimeZone zone) {
		if (zone == null) {
			throw new java.lang.IllegalArgumentException("Null 'zone' argument.");
		}
		org.jfree.chart.axis.TickUnits units = new org.jfree.chart.axis.TickUnits();
		java.text.DateFormat f1 = new java.text.SimpleDateFormat("HH:mm:ss.SSS");
		java.text.DateFormat f2 = new java.text.SimpleDateFormat("HH:mm:ss");
		java.text.DateFormat f3 = new java.text.SimpleDateFormat("HH:mm");
		java.text.DateFormat f4 = new java.text.SimpleDateFormat("d-MMM, HH:mm");
		java.text.DateFormat f5 = new java.text.SimpleDateFormat("d-MMM");
		java.text.DateFormat f6 = new java.text.SimpleDateFormat("MMM-yyyy");
		java.text.DateFormat f7 = new java.text.SimpleDateFormat("yyyy");
		f1.setTimeZone(zone);
		f2.setTimeZone(zone);
		f3.setTimeZone(zone);
		f4.setTimeZone(zone);
		f5.setTimeZone(zone);
		f6.setTimeZone(zone);
		f7.setTimeZone(zone);
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.MILLISECOND, 1, f1));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.MILLISECOND, 5, org.jfree.chart.axis.DateTickUnit.MILLISECOND, 1, f1));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.MILLISECOND, 10, org.jfree.chart.axis.DateTickUnit.MILLISECOND, 1, f1));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.MILLISECOND, 25, org.jfree.chart.axis.DateTickUnit.MILLISECOND, 5, f1));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.MILLISECOND, 50, org.jfree.chart.axis.DateTickUnit.MILLISECOND, 10, f1));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.MILLISECOND, 100, org.jfree.chart.axis.DateTickUnit.MILLISECOND, 10, f1));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.MILLISECOND, 250, org.jfree.chart.axis.DateTickUnit.MILLISECOND, 10, f1));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.MILLISECOND, 500, org.jfree.chart.axis.DateTickUnit.MILLISECOND, 50, f1));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.SECOND, 1, org.jfree.chart.axis.DateTickUnit.MILLISECOND, 50, f2));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.SECOND, 5, org.jfree.chart.axis.DateTickUnit.SECOND, 1, f2));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.SECOND, 10, org.jfree.chart.axis.DateTickUnit.SECOND, 1, f2));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.SECOND, 30, org.jfree.chart.axis.DateTickUnit.SECOND, 5, f2));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.MINUTE, 1, org.jfree.chart.axis.DateTickUnit.SECOND, 5, f3));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.MINUTE, 2, org.jfree.chart.axis.DateTickUnit.SECOND, 10, f3));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.MINUTE, 5, org.jfree.chart.axis.DateTickUnit.MINUTE, 1, f3));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.MINUTE, 10, org.jfree.chart.axis.DateTickUnit.MINUTE, 1, f3));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.MINUTE, 15, org.jfree.chart.axis.DateTickUnit.MINUTE, 5, f3));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.MINUTE, 20, org.jfree.chart.axis.DateTickUnit.MINUTE, 5, f3));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.MINUTE, 30, org.jfree.chart.axis.DateTickUnit.MINUTE, 5, f3));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.HOUR, 1, org.jfree.chart.axis.DateTickUnit.MINUTE, 5, f3));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.HOUR, 2, org.jfree.chart.axis.DateTickUnit.MINUTE, 10, f3));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.HOUR, 4, org.jfree.chart.axis.DateTickUnit.MINUTE, 30, f3));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.HOUR, 6, org.jfree.chart.axis.DateTickUnit.HOUR, 1, f3));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.HOUR, 12, org.jfree.chart.axis.DateTickUnit.HOUR, 1, f4));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.DAY, 1, org.jfree.chart.axis.DateTickUnit.HOUR, 1, f5));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.DAY, 2, org.jfree.chart.axis.DateTickUnit.HOUR, 1, f5));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.DAY, 7, org.jfree.chart.axis.DateTickUnit.DAY, 1, f5));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.DAY, 15, org.jfree.chart.axis.DateTickUnit.DAY, 1, f5));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.MONTH, 1, org.jfree.chart.axis.DateTickUnit.DAY, 1, f6));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.MONTH, 2, org.jfree.chart.axis.DateTickUnit.DAY, 1, f6));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.MONTH, 3, org.jfree.chart.axis.DateTickUnit.MONTH, 1, f6));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.MONTH, 4, org.jfree.chart.axis.DateTickUnit.MONTH, 1, f6));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.MONTH, 6, org.jfree.chart.axis.DateTickUnit.MONTH, 1, f6));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.YEAR, 1, org.jfree.chart.axis.DateTickUnit.MONTH, 1, f7));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.YEAR, 2, org.jfree.chart.axis.DateTickUnit.MONTH, 3, f7));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.YEAR, 5, org.jfree.chart.axis.DateTickUnit.YEAR, 1, f7));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.YEAR, 10, org.jfree.chart.axis.DateTickUnit.YEAR, 1, f7));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.YEAR, 25, org.jfree.chart.axis.DateTickUnit.YEAR, 5, f7));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.YEAR, 50, org.jfree.chart.axis.DateTickUnit.YEAR, 10, f7));
		units.add(new org.jfree.chart.axis.DateTickUnit(org.jfree.chart.axis.DateTickUnit.YEAR, 100, org.jfree.chart.axis.DateTickUnit.YEAR, 20, f7));
		return units;
	}

	protected void autoAdjustRange() {
		org.jfree.chart.plot.Plot plot = getPlot();
		if (plot == null) {
			return ;
		}
		if (plot instanceof org.jfree.chart.plot.ValueAxisPlot) {
			org.jfree.chart.plot.ValueAxisPlot vap = ((org.jfree.chart.plot.ValueAxisPlot) (plot));
			org.jfree.data.Range r = vap.getDataRange(org.jfree.chart.axis.DateAxis.this);
			if (r == null) {
				if ((org.jfree.chart.axis.DateAxis.this.timeline) instanceof org.jfree.chart.axis.SegmentedTimeline) {
					r = new org.jfree.data.time.DateRange(((org.jfree.chart.axis.SegmentedTimeline) (org.jfree.chart.axis.DateAxis.this.timeline)).getStartTime(), ((((org.jfree.chart.axis.SegmentedTimeline) (org.jfree.chart.axis.DateAxis.this.timeline)).getStartTime()) + 1));
				}else {
					r = new org.jfree.data.time.DateRange();
				}
			}
			long upper = org.jfree.chart.axis.DateAxis.this.timeline.toTimelineValue(((long) (r.getUpperBound())));
			long lower;
			long fixedAutoRange = ((long) (getFixedAutoRange()));
			if (fixedAutoRange > 0.0) {
				lower = upper - fixedAutoRange;
			}else {
				lower = org.jfree.chart.axis.DateAxis.this.timeline.toTimelineValue(((long) (r.getLowerBound())));
				double range = upper - lower;
				long minRange = ((long) (getAutoRangeMinimumSize()));
				if (range < minRange) {
					long expand = ((long) (minRange - range)) / 2;
					upper = upper + expand;
					lower = lower - expand;
				}
				upper = upper + ((long) (range * (getUpperMargin())));
				lower = lower - ((long) (range * (getLowerMargin())));
			}
			upper = org.jfree.chart.axis.DateAxis.this.timeline.toMillisecond(upper);
			lower = org.jfree.chart.axis.DateAxis.this.timeline.toMillisecond(lower);
			org.jfree.data.time.DateRange dr = new org.jfree.data.time.DateRange(new java.util.Date(lower), new java.util.Date(upper));
			setRange(dr, false, false);
		}
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
		long shift = 0;
		if ((org.jfree.chart.axis.DateAxis.this.timeline) instanceof org.jfree.chart.axis.SegmentedTimeline) {
			shift = ((org.jfree.chart.axis.SegmentedTimeline) (org.jfree.chart.axis.DateAxis.this.timeline)).getStartTime();
		}
		double zero = valueToJava2D((shift + 0.0), dataArea, edge);
		double tickLabelWidth = estimateMaximumTickLabelWidth(g2, getTickUnit());
		org.jfree.chart.axis.TickUnitSource tickUnits = getStandardTickUnits();
		org.jfree.chart.axis.TickUnit unit1 = tickUnits.getCeilingTickUnit(getTickUnit());
		double x1 = valueToJava2D((shift + (unit1.getSize())), dataArea, edge);
		double unit1Width = java.lang.Math.abs((x1 - zero));
		double guess = (tickLabelWidth / unit1Width) * (unit1.getSize());
		org.jfree.chart.axis.DateTickUnit unit2 = ((org.jfree.chart.axis.DateTickUnit) (tickUnits.getCeilingTickUnit(guess)));
		double x2 = valueToJava2D((shift + (unit2.getSize())), dataArea, edge);
		double unit2Width = java.lang.Math.abs((x2 - zero));
		tickLabelWidth = estimateMaximumTickLabelWidth(g2, unit2);
		if (tickLabelWidth > unit2Width) {
			unit2 = ((org.jfree.chart.axis.DateTickUnit) (tickUnits.getLargerTickUnit(unit2)));
		}
		setTickUnit(unit2, false, false);
	}

	protected void selectVerticalAutoTickUnit(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		org.jfree.chart.axis.TickUnitSource tickUnits = getStandardTickUnits();
		double zero = valueToJava2D(0.0, dataArea, edge);
		double estimate1 = (getRange().getLength()) / 10.0;
		org.jfree.chart.axis.DateTickUnit candidate1 = ((org.jfree.chart.axis.DateTickUnit) (tickUnits.getCeilingTickUnit(estimate1)));
		double labelHeight1 = estimateMaximumTickLabelHeight(g2, candidate1);
		double y1 = valueToJava2D(candidate1.getSize(), dataArea, edge);
		double candidate1UnitHeight = java.lang.Math.abs((y1 - zero));
		double estimate2 = (labelHeight1 / candidate1UnitHeight) * (candidate1.getSize());
		org.jfree.chart.axis.DateTickUnit candidate2 = ((org.jfree.chart.axis.DateTickUnit) (tickUnits.getCeilingTickUnit(estimate2)));
		double labelHeight2 = estimateMaximumTickLabelHeight(g2, candidate2);
		double y2 = valueToJava2D(candidate2.getSize(), dataArea, edge);
		double unit2Height = java.lang.Math.abs((y2 - zero));
		org.jfree.chart.axis.DateTickUnit finalUnit;
		if (labelHeight2 < unit2Height) {
			finalUnit = candidate2;
		}else {
			finalUnit = ((org.jfree.chart.axis.DateTickUnit) (tickUnits.getLargerTickUnit(candidate2)));
		}
		setTickUnit(finalUnit, false, false);
	}

	private double estimateMaximumTickLabelWidth(java.awt.Graphics2D g2, org.jfree.chart.axis.DateTickUnit unit) {
		org.jfree.chart.util.RectangleInsets tickLabelInsets = getTickLabelInsets();
		double result = (tickLabelInsets.getLeft()) + (tickLabelInsets.getRight());
		java.awt.Font tickLabelFont = getTickLabelFont();
		java.awt.font.FontRenderContext frc = g2.getFontRenderContext();
		java.awt.font.LineMetrics lm = tickLabelFont.getLineMetrics("ABCxyz", frc);
		if (isVerticalTickLabels()) {
			result += lm.getHeight();
		}else {
			org.jfree.data.time.DateRange range = ((org.jfree.data.time.DateRange) (getRange()));
			java.util.Date lower = range.getLowerDate();
			java.util.Date upper = range.getUpperDate();
			java.lang.String lowerStr = null;
			java.lang.String upperStr = null;
			java.text.DateFormat formatter = getDateFormatOverride();
			if (formatter != null) {
				lowerStr = formatter.format(lower);
				upperStr = formatter.format(upper);
			}else {
				lowerStr = unit.dateToString(lower);
				upperStr = unit.dateToString(upper);
			}
			java.awt.FontMetrics fm = g2.getFontMetrics(tickLabelFont);
			double w1 = fm.stringWidth(lowerStr);
			double w2 = fm.stringWidth(upperStr);
			result += java.lang.Math.max(w1, w2);
		}
		return result;
	}

	private double estimateMaximumTickLabelHeight(java.awt.Graphics2D g2, org.jfree.chart.axis.DateTickUnit unit) {
		org.jfree.chart.util.RectangleInsets tickLabelInsets = getTickLabelInsets();
		double result = (tickLabelInsets.getTop()) + (tickLabelInsets.getBottom());
		java.awt.Font tickLabelFont = getTickLabelFont();
		java.awt.font.FontRenderContext frc = g2.getFontRenderContext();
		java.awt.font.LineMetrics lm = tickLabelFont.getLineMetrics("ABCxyz", frc);
		if (!(isVerticalTickLabels())) {
			result += lm.getHeight();
		}else {
			org.jfree.data.time.DateRange range = ((org.jfree.data.time.DateRange) (getRange()));
			java.util.Date lower = range.getLowerDate();
			java.util.Date upper = range.getUpperDate();
			java.lang.String lowerStr = null;
			java.lang.String upperStr = null;
			java.text.DateFormat formatter = getDateFormatOverride();
			if (formatter != null) {
				lowerStr = formatter.format(lower);
				upperStr = formatter.format(upper);
			}else {
				lowerStr = unit.dateToString(lower);
				upperStr = unit.dateToString(upper);
			}
			java.awt.FontMetrics fm = g2.getFontMetrics(tickLabelFont);
			double w1 = fm.stringWidth(lowerStr);
			double w2 = fm.stringWidth(upperStr);
			result += java.lang.Math.max(w1, w2);
		}
		return result;
	}

	public java.util.List refreshTicks(java.awt.Graphics2D g2, org.jfree.chart.axis.AxisState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		java.util.List result = null;
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
		org.jfree.chart.axis.DateTickUnit unit = getTickUnit();
		java.util.Date tickDate = calculateLowestVisibleTickValue(unit);
		java.util.Date upperDate = getMaximumDate();
		while (tickDate.before(upperDate)) {
			if (!(isHiddenValue(tickDate.getTime()))) {
				java.lang.String tickLabel;
				java.text.DateFormat formatter = getDateFormatOverride();
				if (formatter != null) {
					tickLabel = formatter.format(tickDate);
				}else {
					tickLabel = org.jfree.chart.axis.DateAxis.this.tickUnit.dateToString(tickDate);
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
				org.jfree.chart.axis.Tick tick = new org.jfree.chart.axis.DateTick(tickDate, tickLabel, anchor, rotationAnchor, angle);
				result.add(tick);
				tickDate = unit.addToDate(tickDate, org.jfree.chart.axis.DateAxis.this.timeZone);
			}else {
				tickDate = unit.rollDate(tickDate, org.jfree.chart.axis.DateAxis.this.timeZone);
				continue;
			}
			switch (unit.getUnit()) {
				case org.jfree.chart.axis.DateTickUnit.MILLISECOND :
				case org.jfree.chart.axis.DateTickUnit.SECOND :
				case org.jfree.chart.axis.DateTickUnit.MINUTE :
				case org.jfree.chart.axis.DateTickUnit.HOUR :
				case org.jfree.chart.axis.DateTickUnit.DAY :
					break;
				case org.jfree.chart.axis.DateTickUnit.MONTH :
					tickDate = calculateDateForPosition(new org.jfree.data.time.Month(tickDate, org.jfree.chart.axis.DateAxis.this.timeZone), org.jfree.chart.axis.DateAxis.this.tickMarkPosition);
					break;
				case org.jfree.chart.axis.DateTickUnit.YEAR :
					tickDate = calculateDateForPosition(new org.jfree.data.time.Year(tickDate, org.jfree.chart.axis.DateAxis.this.timeZone), org.jfree.chart.axis.DateAxis.this.tickMarkPosition);
					break;
				default :
					break;
			}
		} 
		return result;
	}

	protected java.util.List refreshTicksVertical(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		java.util.List result = new java.util.ArrayList();
		java.awt.Font tickLabelFont = getTickLabelFont();
		g2.setFont(tickLabelFont);
		if (isAutoTickUnitSelection()) {
			selectAutoTickUnit(g2, dataArea, edge);
		}
		org.jfree.chart.axis.DateTickUnit unit = getTickUnit();
		java.util.Date tickDate = calculateLowestVisibleTickValue(unit);
		java.util.Date upperDate = getMaximumDate();
		while (tickDate.before(upperDate)) {
			if (!(isHiddenValue(tickDate.getTime()))) {
				java.lang.String tickLabel;
				java.text.DateFormat formatter = getDateFormatOverride();
				if (formatter != null) {
					tickLabel = formatter.format(tickDate);
				}else {
					tickLabel = org.jfree.chart.axis.DateAxis.this.tickUnit.dateToString(tickDate);
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
				org.jfree.chart.axis.Tick tick = new org.jfree.chart.axis.DateTick(tickDate, tickLabel, anchor, rotationAnchor, angle);
				result.add(tick);
				tickDate = unit.addToDate(tickDate, org.jfree.chart.axis.DateAxis.this.timeZone);
			}else {
				tickDate = unit.rollDate(tickDate, org.jfree.chart.axis.DateAxis.this.timeZone);
			}
		} 
		return result;
	}

	public org.jfree.chart.axis.AxisState draw(java.awt.Graphics2D g2, double cursor, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge, org.jfree.chart.plot.PlotRenderingInfo plotState) {
		if (!(isVisible())) {
			org.jfree.chart.axis.AxisState state = new org.jfree.chart.axis.AxisState(cursor);
			java.util.List ticks = refreshTicks(g2, state, dataArea, edge);
			state.setTicks(ticks);
			return state;
		}
		org.jfree.chart.axis.AxisState state = drawTickMarksAndLabels(g2, cursor, plotArea, dataArea, edge, plotState);
		state = drawLabel(getLabel(), g2, plotArea, dataArea, edge, state, plotState);
		return state;
	}

	public void zoomRange(double lowerPercent, double upperPercent) {
		double start = org.jfree.chart.axis.DateAxis.this.timeline.toTimelineValue(((long) (getRange().getLowerBound())));
		double length = (org.jfree.chart.axis.DateAxis.this.timeline.toTimelineValue(((long) (getRange().getUpperBound())))) - (org.jfree.chart.axis.DateAxis.this.timeline.toTimelineValue(((long) (getRange().getLowerBound()))));
		org.jfree.data.Range adjusted = null;
		if (isInverted()) {
			adjusted = new org.jfree.data.time.DateRange(org.jfree.chart.axis.DateAxis.this.timeline.toMillisecond(((long) (start + (length * (1 - upperPercent))))), org.jfree.chart.axis.DateAxis.this.timeline.toMillisecond(((long) (start + (length * (1 - lowerPercent))))));
		}else {
			adjusted = new org.jfree.data.time.DateRange(org.jfree.chart.axis.DateAxis.this.timeline.toMillisecond(((long) (start + (length * lowerPercent)))), org.jfree.chart.axis.DateAxis.this.timeline.toMillisecond(((long) (start + (length * upperPercent)))));
		}
		setRange(adjusted);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.axis.DateAxis.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.DateAxis)) {
			return false;
		}
		org.jfree.chart.axis.DateAxis that = ((org.jfree.chart.axis.DateAxis) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.DateAxis.this.tickUnit, that.tickUnit))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.DateAxis.this.dateFormatOverride, that.dateFormatOverride))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.DateAxis.this.tickMarkPosition, that.tickMarkPosition))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.DateAxis.this.timeline, that.timeline))) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		if ((getLabel()) != null) {
			return getLabel().hashCode();
		}else {
			return 0;
		}
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.axis.DateAxis clone = ((org.jfree.chart.axis.DateAxis) (super.clone()));
		if ((org.jfree.chart.axis.DateAxis.this.dateFormatOverride) != null) {
			clone.dateFormatOverride = ((java.text.DateFormat) (org.jfree.chart.axis.DateAxis.this.dateFormatOverride.clone()));
		}
		return clone;
	}
}


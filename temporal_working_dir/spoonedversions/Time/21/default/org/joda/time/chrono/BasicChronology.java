

package org.joda.time.chrono;


abstract class BasicChronology extends org.joda.time.chrono.AssembledChronology {
	private static final long serialVersionUID = 8283225332206808863L;

	private static final org.joda.time.DurationField cMillisField;

	private static final org.joda.time.DurationField cSecondsField;

	private static final org.joda.time.DurationField cMinutesField;

	private static final org.joda.time.DurationField cHoursField;

	private static final org.joda.time.DurationField cHalfdaysField;

	private static final org.joda.time.DurationField cDaysField;

	private static final org.joda.time.DurationField cWeeksField;

	private static final org.joda.time.DateTimeField cMillisOfSecondField;

	private static final org.joda.time.DateTimeField cMillisOfDayField;

	private static final org.joda.time.DateTimeField cSecondOfMinuteField;

	private static final org.joda.time.DateTimeField cSecondOfDayField;

	private static final org.joda.time.DateTimeField cMinuteOfHourField;

	private static final org.joda.time.DateTimeField cMinuteOfDayField;

	private static final org.joda.time.DateTimeField cHourOfDayField;

	private static final org.joda.time.DateTimeField cHourOfHalfdayField;

	private static final org.joda.time.DateTimeField cClockhourOfDayField;

	private static final org.joda.time.DateTimeField cClockhourOfHalfdayField;

	private static final org.joda.time.DateTimeField cHalfdayOfDayField;

	static {
		cMillisField = org.joda.time.field.MillisDurationField.INSTANCE;
		cSecondsField = new org.joda.time.field.PreciseDurationField(org.joda.time.DurationFieldType.seconds(), org.joda.time.DateTimeConstants.MILLIS_PER_SECOND);
		cMinutesField = new org.joda.time.field.PreciseDurationField(org.joda.time.DurationFieldType.minutes(), org.joda.time.DateTimeConstants.MILLIS_PER_MINUTE);
		cHoursField = new org.joda.time.field.PreciseDurationField(org.joda.time.DurationFieldType.hours(), org.joda.time.DateTimeConstants.MILLIS_PER_HOUR);
		cHalfdaysField = new org.joda.time.field.PreciseDurationField(org.joda.time.DurationFieldType.halfdays(), ((org.joda.time.DateTimeConstants.MILLIS_PER_DAY) / 2));
		cDaysField = new org.joda.time.field.PreciseDurationField(org.joda.time.DurationFieldType.days(), org.joda.time.DateTimeConstants.MILLIS_PER_DAY);
		cWeeksField = new org.joda.time.field.PreciseDurationField(org.joda.time.DurationFieldType.weeks(), org.joda.time.DateTimeConstants.MILLIS_PER_WEEK);
		cMillisOfSecondField = new org.joda.time.field.PreciseDateTimeField(org.joda.time.DateTimeFieldType.millisOfSecond(), org.joda.time.chrono.BasicChronology.cMillisField, org.joda.time.chrono.BasicChronology.cSecondsField);
		cMillisOfDayField = new org.joda.time.field.PreciseDateTimeField(org.joda.time.DateTimeFieldType.millisOfDay(), org.joda.time.chrono.BasicChronology.cMillisField, org.joda.time.chrono.BasicChronology.cDaysField);
		cSecondOfMinuteField = new org.joda.time.field.PreciseDateTimeField(org.joda.time.DateTimeFieldType.secondOfMinute(), org.joda.time.chrono.BasicChronology.cSecondsField, org.joda.time.chrono.BasicChronology.cMinutesField);
		cSecondOfDayField = new org.joda.time.field.PreciseDateTimeField(org.joda.time.DateTimeFieldType.secondOfDay(), org.joda.time.chrono.BasicChronology.cSecondsField, org.joda.time.chrono.BasicChronology.cDaysField);
		cMinuteOfHourField = new org.joda.time.field.PreciseDateTimeField(org.joda.time.DateTimeFieldType.minuteOfHour(), org.joda.time.chrono.BasicChronology.cMinutesField, org.joda.time.chrono.BasicChronology.cHoursField);
		cMinuteOfDayField = new org.joda.time.field.PreciseDateTimeField(org.joda.time.DateTimeFieldType.minuteOfDay(), org.joda.time.chrono.BasicChronology.cMinutesField, org.joda.time.chrono.BasicChronology.cDaysField);
		cHourOfDayField = new org.joda.time.field.PreciseDateTimeField(org.joda.time.DateTimeFieldType.hourOfDay(), org.joda.time.chrono.BasicChronology.cHoursField, org.joda.time.chrono.BasicChronology.cDaysField);
		cHourOfHalfdayField = new org.joda.time.field.PreciseDateTimeField(org.joda.time.DateTimeFieldType.hourOfHalfday(), org.joda.time.chrono.BasicChronology.cHoursField, org.joda.time.chrono.BasicChronology.cHalfdaysField);
		cClockhourOfDayField = new org.joda.time.field.ZeroIsMaxDateTimeField(org.joda.time.chrono.BasicChronology.cHourOfDayField, org.joda.time.DateTimeFieldType.clockhourOfDay());
		cClockhourOfHalfdayField = new org.joda.time.field.ZeroIsMaxDateTimeField(org.joda.time.chrono.BasicChronology.cHourOfHalfdayField, org.joda.time.DateTimeFieldType.clockhourOfHalfday());
		cHalfdayOfDayField = new org.joda.time.chrono.BasicChronology.HalfdayField();
	}

	private static final int CACHE_SIZE = 1 << 10;

	private static final int CACHE_MASK = (org.joda.time.chrono.BasicChronology.CACHE_SIZE) - 1;

	private final transient org.joda.time.chrono.BasicChronology.YearInfo[] iYearInfoCache = new org.joda.time.chrono.BasicChronology.YearInfo[org.joda.time.chrono.BasicChronology.CACHE_SIZE];

	private final int iMinDaysInFirstWeek;

	BasicChronology(org.joda.time.Chronology base, java.lang.Object param, int minDaysInFirstWeek) {
		super(base, param);
		if ((minDaysInFirstWeek < 1) || (minDaysInFirstWeek > 7)) {
			throw new java.lang.IllegalArgumentException(("Invalid min days in first week: " + minDaysInFirstWeek));
		}
		iMinDaysInFirstWeek = minDaysInFirstWeek;
	}

	public org.joda.time.DateTimeZone getZone() {
		org.joda.time.Chronology base;
		if ((base = getBase()) != null) {
			return base.getZone();
		}
		return org.joda.time.DateTimeZone.UTC;
	}

	public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int millisOfDay) throws java.lang.IllegalArgumentException {
		org.joda.time.Chronology base;
		if ((base = getBase()) != null) {
			return base.getDateTimeMillis(year, monthOfYear, dayOfMonth, millisOfDay);
		}
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.DateTimeFieldType.millisOfDay(), millisOfDay, 0, org.joda.time.DateTimeConstants.MILLIS_PER_DAY);
		return (getDateMidnightMillis(year, monthOfYear, dayOfMonth)) + millisOfDay;
	}

	public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) throws java.lang.IllegalArgumentException {
		org.joda.time.Chronology base;
		if ((base = getBase()) != null) {
			return base.getDateTimeMillis(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
		}
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.DateTimeFieldType.hourOfDay(), hourOfDay, 0, 23);
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.DateTimeFieldType.minuteOfHour(), minuteOfHour, 0, 59);
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.DateTimeFieldType.secondOfMinute(), secondOfMinute, 0, 59);
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.DateTimeFieldType.millisOfSecond(), millisOfSecond, 0, 999);
		return ((((getDateMidnightMillis(year, monthOfYear, dayOfMonth)) + (hourOfDay * (org.joda.time.DateTimeConstants.MILLIS_PER_HOUR))) + (minuteOfHour * (org.joda.time.DateTimeConstants.MILLIS_PER_MINUTE))) + (secondOfMinute * (org.joda.time.DateTimeConstants.MILLIS_PER_SECOND))) + millisOfSecond;
	}

	public int getMinimumDaysInFirstWeek() {
		return iMinDaysInFirstWeek;
	}

	public boolean equals(java.lang.Object obj) {
		return super.equals(obj);
	}

	public int hashCode() {
		return (((getClass().getName().hashCode()) * 11) + (getZone().hashCode())) + (getMinimumDaysInFirstWeek());
	}

	public java.lang.String toString() {
		java.lang.StringBuffer sb = new java.lang.StringBuffer(60);
		java.lang.String name = getClass().getName();
		int index = name.lastIndexOf('.');
		if (index >= 0) {
			name = name.substring((index + 1));
		}
		sb.append(name);
		sb.append('[');
		org.joda.time.DateTimeZone zone = getZone();
		if (zone != null) {
			sb.append(zone.getID());
		}
		if ((getMinimumDaysInFirstWeek()) != 4) {
			sb.append(",mdfw=");
			sb.append(getMinimumDaysInFirstWeek());
		}
		sb.append(']');
		return sb.toString();
	}

	protected void assemble(org.joda.time.chrono.AssembledChronology.Fields fields) {
		fields.millis = org.joda.time.chrono.BasicChronology.cMillisField;
		fields.seconds = org.joda.time.chrono.BasicChronology.cSecondsField;
		fields.minutes = org.joda.time.chrono.BasicChronology.cMinutesField;
		fields.hours = org.joda.time.chrono.BasicChronology.cHoursField;
		fields.halfdays = org.joda.time.chrono.BasicChronology.cHalfdaysField;
		fields.days = org.joda.time.chrono.BasicChronology.cDaysField;
		fields.weeks = org.joda.time.chrono.BasicChronology.cWeeksField;
		fields.millisOfSecond = org.joda.time.chrono.BasicChronology.cMillisOfSecondField;
		fields.millisOfDay = org.joda.time.chrono.BasicChronology.cMillisOfDayField;
		fields.secondOfMinute = org.joda.time.chrono.BasicChronology.cSecondOfMinuteField;
		fields.secondOfDay = org.joda.time.chrono.BasicChronology.cSecondOfDayField;
		fields.minuteOfHour = org.joda.time.chrono.BasicChronology.cMinuteOfHourField;
		fields.minuteOfDay = org.joda.time.chrono.BasicChronology.cMinuteOfDayField;
		fields.hourOfDay = org.joda.time.chrono.BasicChronology.cHourOfDayField;
		fields.hourOfHalfday = org.joda.time.chrono.BasicChronology.cHourOfHalfdayField;
		fields.clockhourOfDay = org.joda.time.chrono.BasicChronology.cClockhourOfDayField;
		fields.clockhourOfHalfday = org.joda.time.chrono.BasicChronology.cClockhourOfHalfdayField;
		fields.halfdayOfDay = org.joda.time.chrono.BasicChronology.cHalfdayOfDayField;
		fields.year = new org.joda.time.chrono.BasicYearDateTimeField(org.joda.time.chrono.BasicChronology.this);
		fields.yearOfEra = new org.joda.time.chrono.GJYearOfEraDateTimeField(fields.year, org.joda.time.chrono.BasicChronology.this);
		org.joda.time.DateTimeField field = new org.joda.time.field.OffsetDateTimeField(fields.yearOfEra, 99);
		fields.centuryOfEra = new org.joda.time.field.DividedDateTimeField(field, org.joda.time.DateTimeFieldType.centuryOfEra(), 100);
		field = new org.joda.time.field.RemainderDateTimeField(((org.joda.time.field.DividedDateTimeField) (fields.centuryOfEra)));
		fields.yearOfCentury = new org.joda.time.field.OffsetDateTimeField(field, org.joda.time.DateTimeFieldType.yearOfCentury(), 1);
		fields.era = new org.joda.time.chrono.GJEraDateTimeField(org.joda.time.chrono.BasicChronology.this);
		fields.dayOfWeek = new org.joda.time.chrono.GJDayOfWeekDateTimeField(org.joda.time.chrono.BasicChronology.this, fields.days);
		fields.dayOfMonth = new org.joda.time.chrono.BasicDayOfMonthDateTimeField(org.joda.time.chrono.BasicChronology.this, fields.days);
		fields.dayOfYear = new org.joda.time.chrono.BasicDayOfYearDateTimeField(org.joda.time.chrono.BasicChronology.this, fields.days);
		fields.monthOfYear = new org.joda.time.chrono.GJMonthOfYearDateTimeField(org.joda.time.chrono.BasicChronology.this);
		fields.weekyear = new org.joda.time.chrono.BasicWeekyearDateTimeField(org.joda.time.chrono.BasicChronology.this);
		fields.weekOfWeekyear = new org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField(org.joda.time.chrono.BasicChronology.this, fields.weeks);
		field = new org.joda.time.field.RemainderDateTimeField(fields.weekyear, org.joda.time.DateTimeFieldType.weekyearOfCentury(), 100);
		fields.weekyearOfCentury = new org.joda.time.field.OffsetDateTimeField(field, org.joda.time.DateTimeFieldType.weekyearOfCentury(), 1);
		fields.years = fields.year.getDurationField();
		fields.centuries = fields.centuryOfEra.getDurationField();
		fields.months = fields.monthOfYear.getDurationField();
		fields.weekyears = fields.weekyear.getDurationField();
	}

	int getDaysInYearMax() {
		return 366;
	}

	int getDaysInYear(int year) {
		return isLeapYear(year) ? 366 : 365;
	}

	int getWeeksInYear(int year) {
		long firstWeekMillis1 = getFirstWeekOfYearMillis(year);
		long firstWeekMillis2 = getFirstWeekOfYearMillis((year + 1));
		return ((int) ((firstWeekMillis2 - firstWeekMillis1) / (org.joda.time.DateTimeConstants.MILLIS_PER_WEEK)));
	}

	long getFirstWeekOfYearMillis(int year) {
		long jan1millis = getYearMillis(year);
		int jan1dayOfWeek = getDayOfWeek(jan1millis);
		if (jan1dayOfWeek > (8 - (iMinDaysInFirstWeek))) {
			return jan1millis + ((8 - jan1dayOfWeek) * ((long) (org.joda.time.DateTimeConstants.MILLIS_PER_DAY)));
		}else {
			return jan1millis - ((jan1dayOfWeek - 1) * ((long) (org.joda.time.DateTimeConstants.MILLIS_PER_DAY)));
		}
	}

	long getYearMillis(int year) {
		return getYearInfo(year).iFirstDayMillis;
	}

	long getYearMonthMillis(int year, int month) {
		long millis = getYearMillis(year);
		millis += getTotalMillisByYearMonth(year, month);
		return millis;
	}

	long getYearMonthDayMillis(int year, int month, int dayOfMonth) {
		long millis = getYearMillis(year);
		millis += getTotalMillisByYearMonth(year, month);
		return millis + ((dayOfMonth - 1) * ((long) (org.joda.time.DateTimeConstants.MILLIS_PER_DAY)));
	}

	int getYear(long instant) {
		long unitMillis = getAverageMillisPerYearDividedByTwo();
		long i2 = (instant >> 1) + (getApproxMillisAtEpochDividedByTwo());
		if (i2 < 0) {
			i2 = (i2 - unitMillis) + 1;
		}
		int year = ((int) (i2 / unitMillis));
		long yearStart = getYearMillis(year);
		long diff = instant - yearStart;
		if (diff < 0) {
			year--;
		}else
			if (diff >= ((org.joda.time.DateTimeConstants.MILLIS_PER_DAY) * 365L)) {
				long oneYear;
				if (isLeapYear(year)) {
					oneYear = (org.joda.time.DateTimeConstants.MILLIS_PER_DAY) * 366L;
				}else {
					oneYear = (org.joda.time.DateTimeConstants.MILLIS_PER_DAY) * 365L;
				}
				yearStart += oneYear;
				if (yearStart <= instant) {
					year++;
				}
			}
		
		return year;
	}

	int getMonthOfYear(long millis) {
		return getMonthOfYear(millis, getYear(millis));
	}

	abstract int getMonthOfYear(long millis, int year);

	int getDayOfMonth(long millis) {
		int year = getYear(millis);
		int month = getMonthOfYear(millis, year);
		return getDayOfMonth(millis, year, month);
	}

	int getDayOfMonth(long millis, int year) {
		int month = getMonthOfYear(millis, year);
		return getDayOfMonth(millis, year, month);
	}

	int getDayOfMonth(long millis, int year, int month) {
		long dateMillis = getYearMillis(year);
		dateMillis += getTotalMillisByYearMonth(year, month);
		return ((int) ((millis - dateMillis) / (org.joda.time.DateTimeConstants.MILLIS_PER_DAY))) + 1;
	}

	int getDayOfYear(long instant) {
		return getDayOfYear(instant, getYear(instant));
	}

	int getDayOfYear(long instant, int year) {
		long yearStart = getYearMillis(year);
		return ((int) ((instant - yearStart) / (org.joda.time.DateTimeConstants.MILLIS_PER_DAY))) + 1;
	}

	int getWeekyear(long instant) {
		int year = getYear(instant);
		int week = getWeekOfWeekyear(instant, year);
		if (week == 1) {
			return getYear((instant + (org.joda.time.DateTimeConstants.MILLIS_PER_WEEK)));
		}else
			if (week > 51) {
				return getYear((instant - (2 * (org.joda.time.DateTimeConstants.MILLIS_PER_WEEK))));
			}else {
				return year;
			}
		
	}

	int getWeekOfWeekyear(long instant) {
		return getWeekOfWeekyear(instant, getYear(instant));
	}

	int getWeekOfWeekyear(long instant, int year) {
		long firstWeekMillis1 = getFirstWeekOfYearMillis(year);
		if (instant < firstWeekMillis1) {
			return getWeeksInYear((year - 1));
		}
		long firstWeekMillis2 = getFirstWeekOfYearMillis((year + 1));
		if (instant >= firstWeekMillis2) {
			return 1;
		}
		return ((int) ((instant - firstWeekMillis1) / (org.joda.time.DateTimeConstants.MILLIS_PER_WEEK))) + 1;
	}

	int getDayOfWeek(long instant) {
		long daysSince19700101;
		if (instant >= 0) {
			daysSince19700101 = instant / (org.joda.time.DateTimeConstants.MILLIS_PER_DAY);
		}else {
			daysSince19700101 = (instant - ((org.joda.time.DateTimeConstants.MILLIS_PER_DAY) - 1)) / (org.joda.time.DateTimeConstants.MILLIS_PER_DAY);
			if (daysSince19700101 < (-3)) {
				return 7 + ((int) ((daysSince19700101 + 4) % 7));
			}
		}
		return 1 + ((int) ((daysSince19700101 + 3) % 7));
	}

	int getMillisOfDay(long instant) {
		if (instant >= 0) {
			return ((int) (instant % (org.joda.time.DateTimeConstants.MILLIS_PER_DAY)));
		}else {
			return ((org.joda.time.DateTimeConstants.MILLIS_PER_DAY) - 1) + ((int) ((instant + 1) % (org.joda.time.DateTimeConstants.MILLIS_PER_DAY)));
		}
	}

	int getDaysInMonthMax() {
		return 31;
	}

	int getDaysInMonthMax(long instant) {
		int thisYear = getYear(instant);
		int thisMonth = getMonthOfYear(instant, thisYear);
		return getDaysInYearMonth(thisYear, thisMonth);
	}

	int getDaysInMonthMaxForSet(long instant, int value) {
		return getDaysInMonthMax(instant);
	}

	long getDateMidnightMillis(int year, int monthOfYear, int dayOfMonth) {
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.DateTimeFieldType.year(), year, getMinYear(), getMaxYear());
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.DateTimeFieldType.monthOfYear(), monthOfYear, 1, getMaxMonth(year));
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.DateTimeFieldType.dayOfMonth(), dayOfMonth, 1, getDaysInYearMonth(year, monthOfYear));
		return getYearMonthDayMillis(year, monthOfYear, dayOfMonth);
	}

	abstract long getYearDifference(long minuendInstant, long subtrahendInstant);

	abstract boolean isLeapYear(int year);

	abstract int getDaysInYearMonth(int year, int month);

	abstract int getDaysInMonthMax(int month);

	abstract long getTotalMillisByYearMonth(int year, int month);

	abstract long calculateFirstDayOfYearMillis(int year);

	abstract int getMinYear();

	abstract int getMaxYear();

	int getMaxMonth(int year) {
		return getMaxMonth();
	}

	int getMaxMonth() {
		return 12;
	}

	abstract long getAverageMillisPerYear();

	abstract long getAverageMillisPerYearDividedByTwo();

	abstract long getAverageMillisPerMonth();

	abstract long getApproxMillisAtEpochDividedByTwo();

	abstract long setYear(long instant, int year);

	private org.joda.time.chrono.BasicChronology.YearInfo getYearInfo(int year) {
		org.joda.time.chrono.BasicChronology.YearInfo info = iYearInfoCache[(year & (org.joda.time.chrono.BasicChronology.CACHE_MASK))];
		if ((info == null) || ((info.iYear) != year)) {
			info = new org.joda.time.chrono.BasicChronology.YearInfo(year, calculateFirstDayOfYearMillis(year));
			iYearInfoCache[(year & (org.joda.time.chrono.BasicChronology.CACHE_MASK))] = info;
		}
		return info;
	}

	private static class HalfdayField extends org.joda.time.field.PreciseDateTimeField {
		private static final long serialVersionUID = 581601443656929254L;

		HalfdayField() {
			super(org.joda.time.DateTimeFieldType.halfdayOfDay(), org.joda.time.chrono.BasicChronology.cHalfdaysField, org.joda.time.chrono.BasicChronology.cDaysField);
		}

		public java.lang.String getAsText(int fieldValue, java.util.Locale locale) {
			return org.joda.time.chrono.GJLocaleSymbols.forLocale(locale).halfdayValueToText(fieldValue);
		}

		public long set(long millis, java.lang.String text, java.util.Locale locale) {
			return set(millis, org.joda.time.chrono.GJLocaleSymbols.forLocale(locale).halfdayTextToValue(text));
		}

		public int getMaximumTextLength(java.util.Locale locale) {
			return org.joda.time.chrono.GJLocaleSymbols.forLocale(locale).getHalfdayMaxTextLength();
		}
	}

	private static class YearInfo {
		public final int iYear;

		public final long iFirstDayMillis;

		YearInfo(int year, long firstDayMillis) {
			iYear = year;
			iFirstDayMillis = firstDayMillis;
		}
	}
}


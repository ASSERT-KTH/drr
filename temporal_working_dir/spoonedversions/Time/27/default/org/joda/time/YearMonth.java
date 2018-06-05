

package org.joda.time;


public final class YearMonth extends org.joda.time.base.BasePartial implements java.io.Serializable , org.joda.time.ReadablePartial {
	private static final long serialVersionUID = 797544782896179L;

	private static final org.joda.time.DateTimeFieldType[] FIELD_TYPES = new org.joda.time.DateTimeFieldType[]{ org.joda.time.DateTimeFieldType.year() , org.joda.time.DateTimeFieldType.monthOfYear() };

	public static final int YEAR = 0;

	public static final int MONTH_OF_YEAR = 1;

	public static org.joda.time.YearMonth fromCalendarFields(java.util.Calendar calendar) {
		if (calendar == null) {
			throw new java.lang.IllegalArgumentException("The calendar must not be null");
		}
		return new org.joda.time.YearMonth(calendar.get(java.util.Calendar.YEAR), ((calendar.get(java.util.Calendar.MONTH)) + 1));
	}

	@java.lang.SuppressWarnings(value = "deprecation")
	public static org.joda.time.YearMonth fromDateFields(java.util.Date date) {
		if (date == null) {
			throw new java.lang.IllegalArgumentException("The date must not be null");
		}
		return new org.joda.time.YearMonth(((date.getYear()) + 1900), ((date.getMonth()) + 1));
	}

	public YearMonth() {
		super();
	}

	public YearMonth(org.joda.time.DateTimeZone zone) {
		super(org.joda.time.chrono.ISOChronology.getInstance(zone));
	}

	public YearMonth(org.joda.time.Chronology chronology) {
		super(chronology);
	}

	public YearMonth(long instant) {
		super(instant);
	}

	public YearMonth(long instant, org.joda.time.Chronology chronology) {
		super(instant, chronology);
	}

	public YearMonth(java.lang.Object instant) {
		super(instant, null, org.joda.time.format.ISODateTimeFormat.dateOptionalTimeParser());
	}

	public YearMonth(java.lang.Object instant, org.joda.time.Chronology chronology) {
		super(instant, org.joda.time.DateTimeUtils.getChronology(chronology), org.joda.time.format.ISODateTimeFormat.dateOptionalTimeParser());
	}

	public YearMonth(int year, int monthOfYear) {
		this(year, monthOfYear, null);
	}

	public YearMonth(int year, int monthOfYear, org.joda.time.Chronology chronology) {
		super(new int[]{ year , monthOfYear }, chronology);
	}

	YearMonth(org.joda.time.YearMonth partial, int[] values) {
		super(partial, values);
	}

	YearMonth(org.joda.time.YearMonth partial, org.joda.time.Chronology chrono) {
		super(partial, chrono);
	}

	public int size() {
		return 2;
	}

	protected org.joda.time.DateTimeField getField(int index, org.joda.time.Chronology chrono) {
		switch (index) {
			case org.joda.time.YearMonth.YEAR :
				return chrono.year();
			case org.joda.time.YearMonth.MONTH_OF_YEAR :
				return chrono.monthOfYear();
			default :
				throw new java.lang.IndexOutOfBoundsException(("Invalid index: " + index));
		}
	}

	public org.joda.time.DateTimeFieldType getFieldType(int index) {
		return org.joda.time.YearMonth.FIELD_TYPES[index];
	}

	public org.joda.time.DateTimeFieldType[] getFieldTypes() {
		return ((org.joda.time.DateTimeFieldType[]) (org.joda.time.YearMonth.FIELD_TYPES.clone()));
	}

	public org.joda.time.YearMonth withChronologyRetainFields(org.joda.time.Chronology newChronology) {
		newChronology = org.joda.time.DateTimeUtils.getChronology(newChronology);
		newChronology = newChronology.withUTC();
		if (newChronology == (getChronology())) {
			return org.joda.time.YearMonth.this;
		}else {
			org.joda.time.YearMonth newYearMonth = new org.joda.time.YearMonth(org.joda.time.YearMonth.this, newChronology);
			newChronology.validate(newYearMonth, getValues());
			return newYearMonth;
		}
	}

	public org.joda.time.YearMonth withField(org.joda.time.DateTimeFieldType fieldType, int value) {
		int index = indexOfSupported(fieldType);
		if (value == (getValue(index))) {
			return org.joda.time.YearMonth.this;
		}
		int[] newValues = getValues();
		newValues = getField(index).set(org.joda.time.YearMonth.this, index, newValues, value);
		return new org.joda.time.YearMonth(org.joda.time.YearMonth.this, newValues);
	}

	public org.joda.time.YearMonth withFieldAdded(org.joda.time.DurationFieldType fieldType, int amount) {
		int index = indexOfSupported(fieldType);
		if (amount == 0) {
			return org.joda.time.YearMonth.this;
		}
		int[] newValues = getValues();
		newValues = getField(index).add(org.joda.time.YearMonth.this, index, newValues, amount);
		return new org.joda.time.YearMonth(org.joda.time.YearMonth.this, newValues);
	}

	public org.joda.time.YearMonth withPeriodAdded(org.joda.time.ReadablePeriod period, int scalar) {
		if ((period == null) || (scalar == 0)) {
			return org.joda.time.YearMonth.this;
		}
		int[] newValues = getValues();
		for (int i = 0; i < (period.size()); i++) {
			org.joda.time.DurationFieldType fieldType = period.getFieldType(i);
			int index = indexOf(fieldType);
			if (index >= 0) {
				newValues = getField(index).add(org.joda.time.YearMonth.this, index, newValues, org.joda.time.field.FieldUtils.safeMultiply(period.getValue(i), scalar));
			}
		}
		return new org.joda.time.YearMonth(org.joda.time.YearMonth.this, newValues);
	}

	public org.joda.time.YearMonth plus(org.joda.time.ReadablePeriod period) {
		return withPeriodAdded(period, 1);
	}

	public org.joda.time.YearMonth plusYears(int years) {
		return withFieldAdded(org.joda.time.DurationFieldType.years(), years);
	}

	public org.joda.time.YearMonth plusMonths(int months) {
		return withFieldAdded(org.joda.time.DurationFieldType.months(), months);
	}

	public org.joda.time.YearMonth minus(org.joda.time.ReadablePeriod period) {
		return withPeriodAdded(period, (-1));
	}

	public org.joda.time.YearMonth minusYears(int years) {
		return withFieldAdded(org.joda.time.DurationFieldType.years(), org.joda.time.field.FieldUtils.safeNegate(years));
	}

	public org.joda.time.YearMonth minusMonths(int months) {
		return withFieldAdded(org.joda.time.DurationFieldType.months(), org.joda.time.field.FieldUtils.safeNegate(months));
	}

	public org.joda.time.LocalDate toLocalDate(int dayOfMonth) {
		return new org.joda.time.LocalDate(getYear(), getMonthOfYear(), dayOfMonth, getChronology());
	}

	public org.joda.time.Interval toInterval() {
		return toInterval(null);
	}

	public org.joda.time.Interval toInterval(org.joda.time.DateTimeZone zone) {
		zone = org.joda.time.DateTimeUtils.getZone(zone);
		org.joda.time.DateTime start = toLocalDate(1).toDateTimeAtStartOfDay(zone);
		org.joda.time.DateTime end = plusMonths(1).toLocalDate(1).toDateTimeAtStartOfDay(zone);
		return new org.joda.time.Interval(start, end);
	}

	public int getYear() {
		return getValue(org.joda.time.YearMonth.YEAR);
	}

	public int getMonthOfYear() {
		return getValue(org.joda.time.YearMonth.MONTH_OF_YEAR);
	}

	public org.joda.time.YearMonth withYear(int year) {
		int[] newValues = getValues();
		newValues = getChronology().year().set(org.joda.time.YearMonth.this, org.joda.time.YearMonth.YEAR, newValues, year);
		return new org.joda.time.YearMonth(org.joda.time.YearMonth.this, newValues);
	}

	public org.joda.time.YearMonth withMonthOfYear(int monthOfYear) {
		int[] newValues = getValues();
		newValues = getChronology().monthOfYear().set(org.joda.time.YearMonth.this, org.joda.time.YearMonth.MONTH_OF_YEAR, newValues, monthOfYear);
		return new org.joda.time.YearMonth(org.joda.time.YearMonth.this, newValues);
	}

	public org.joda.time.YearMonth.Property property(org.joda.time.DateTimeFieldType type) {
		return new org.joda.time.YearMonth.Property(org.joda.time.YearMonth.this, indexOfSupported(type));
	}

	public org.joda.time.YearMonth.Property year() {
		return new org.joda.time.YearMonth.Property(org.joda.time.YearMonth.this, org.joda.time.YearMonth.YEAR);
	}

	public org.joda.time.YearMonth.Property monthOfYear() {
		return new org.joda.time.YearMonth.Property(org.joda.time.YearMonth.this, org.joda.time.YearMonth.MONTH_OF_YEAR);
	}

	public java.lang.String toString() {
		return org.joda.time.format.ISODateTimeFormat.yearMonth().print(org.joda.time.YearMonth.this);
	}

	public java.lang.String toString(java.lang.String pattern) {
		if (pattern == null) {
			return toString();
		}
		return org.joda.time.format.DateTimeFormat.forPattern(pattern).print(org.joda.time.YearMonth.this);
	}

	public java.lang.String toString(java.lang.String pattern, java.util.Locale locale) throws java.lang.IllegalArgumentException {
		if (pattern == null) {
			return toString();
		}
		return org.joda.time.format.DateTimeFormat.forPattern(pattern).withLocale(locale).print(org.joda.time.YearMonth.this);
	}

	public static class Property extends org.joda.time.field.AbstractPartialFieldProperty implements java.io.Serializable {
		private static final long serialVersionUID = 5727734012190224363L;

		private final org.joda.time.YearMonth iBase;

		private final int iFieldIndex;

		Property(org.joda.time.YearMonth partial, int fieldIndex) {
			super();
			iBase = partial;
			iFieldIndex = fieldIndex;
		}

		public org.joda.time.DateTimeField getField() {
			return iBase.getField(iFieldIndex);
		}

		protected org.joda.time.ReadablePartial getReadablePartial() {
			return iBase;
		}

		public org.joda.time.YearMonth getYearMonth() {
			return iBase;
		}

		public int get() {
			return iBase.getValue(iFieldIndex);
		}

		public org.joda.time.YearMonth addToCopy(int valueToAdd) {
			int[] newValues = iBase.getValues();
			newValues = getField().add(iBase, iFieldIndex, newValues, valueToAdd);
			return new org.joda.time.YearMonth(iBase, newValues);
		}

		public org.joda.time.YearMonth addWrapFieldToCopy(int valueToAdd) {
			int[] newValues = iBase.getValues();
			newValues = getField().addWrapField(iBase, iFieldIndex, newValues, valueToAdd);
			return new org.joda.time.YearMonth(iBase, newValues);
		}

		public org.joda.time.YearMonth setCopy(int value) {
			int[] newValues = iBase.getValues();
			newValues = getField().set(iBase, iFieldIndex, newValues, value);
			return new org.joda.time.YearMonth(iBase, newValues);
		}

		public org.joda.time.YearMonth setCopy(java.lang.String text, java.util.Locale locale) {
			int[] newValues = iBase.getValues();
			newValues = getField().set(iBase, iFieldIndex, newValues, text, locale);
			return new org.joda.time.YearMonth(iBase, newValues);
		}

		public org.joda.time.YearMonth setCopy(java.lang.String text) {
			return setCopy(text, null);
		}
	}
}


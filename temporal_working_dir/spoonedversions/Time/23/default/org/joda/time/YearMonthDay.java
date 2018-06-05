

package org.joda.time;


public final class YearMonthDay extends org.joda.time.base.BasePartial implements java.io.Serializable , org.joda.time.ReadablePartial {
	private static final long serialVersionUID = 797544782896179L;

	private static final org.joda.time.DateTimeFieldType[] FIELD_TYPES = new org.joda.time.DateTimeFieldType[]{ org.joda.time.DateTimeFieldType.year() , org.joda.time.DateTimeFieldType.monthOfYear() , org.joda.time.DateTimeFieldType.dayOfMonth() };

	public static final int YEAR = 0;

	public static final int MONTH_OF_YEAR = 1;

	public static final int DAY_OF_MONTH = 2;

	public static org.joda.time.YearMonthDay fromCalendarFields(java.util.Calendar calendar) {
		if (calendar == null) {
			throw new java.lang.IllegalArgumentException("The calendar must not be null");
		}
		return new org.joda.time.YearMonthDay(calendar.get(java.util.Calendar.YEAR), ((calendar.get(java.util.Calendar.MONTH)) + 1), calendar.get(java.util.Calendar.DAY_OF_MONTH));
	}

	public static org.joda.time.YearMonthDay fromDateFields(java.util.Date date) {
		if (date == null) {
			throw new java.lang.IllegalArgumentException("The date must not be null");
		}
		return new org.joda.time.YearMonthDay(((date.getYear()) + 1900), ((date.getMonth()) + 1), date.getDate());
	}

	public YearMonthDay() {
		super();
	}

	public YearMonthDay(org.joda.time.DateTimeZone zone) {
		super(org.joda.time.chrono.ISOChronology.getInstance(zone));
	}

	public YearMonthDay(org.joda.time.Chronology chronology) {
		super(chronology);
	}

	public YearMonthDay(long instant) {
		super(instant);
	}

	public YearMonthDay(long instant, org.joda.time.Chronology chronology) {
		super(instant, chronology);
	}

	public YearMonthDay(java.lang.Object instant) {
		super(instant, null, org.joda.time.format.ISODateTimeFormat.dateOptionalTimeParser());
	}

	public YearMonthDay(java.lang.Object instant, org.joda.time.Chronology chronology) {
		super(instant, org.joda.time.DateTimeUtils.getChronology(chronology), org.joda.time.format.ISODateTimeFormat.dateOptionalTimeParser());
	}

	public YearMonthDay(int year, int monthOfYear, int dayOfMonth) {
		this(year, monthOfYear, dayOfMonth, null);
	}

	public YearMonthDay(int year, int monthOfYear, int dayOfMonth, org.joda.time.Chronology chronology) {
		super(new int[]{ year , monthOfYear , dayOfMonth }, chronology);
	}

	YearMonthDay(org.joda.time.YearMonthDay partial, int[] values) {
		super(partial, values);
	}

	YearMonthDay(org.joda.time.YearMonthDay partial, org.joda.time.Chronology chrono) {
		super(partial, chrono);
	}

	public int size() {
		return 3;
	}

	protected org.joda.time.DateTimeField getField(int index, org.joda.time.Chronology chrono) {
		switch (index) {
			case org.joda.time.YearMonthDay.YEAR :
				return chrono.year();
			case org.joda.time.YearMonthDay.MONTH_OF_YEAR :
				return chrono.monthOfYear();
			case org.joda.time.YearMonthDay.DAY_OF_MONTH :
				return chrono.dayOfMonth();
			default :
				throw new java.lang.IndexOutOfBoundsException(("Invalid index: " + index));
		}
	}

	public org.joda.time.DateTimeFieldType getFieldType(int index) {
		return org.joda.time.YearMonthDay.FIELD_TYPES[index];
	}

	public org.joda.time.DateTimeFieldType[] getFieldTypes() {
		return ((org.joda.time.DateTimeFieldType[]) (org.joda.time.YearMonthDay.FIELD_TYPES.clone()));
	}

	public org.joda.time.YearMonthDay withChronologyRetainFields(org.joda.time.Chronology newChronology) {
		newChronology = org.joda.time.DateTimeUtils.getChronology(newChronology);
		newChronology = newChronology.withUTC();
		if (newChronology == (getChronology())) {
			return org.joda.time.YearMonthDay.this;
		}else {
			org.joda.time.YearMonthDay newYearMonthDay = new org.joda.time.YearMonthDay(org.joda.time.YearMonthDay.this, newChronology);
			newChronology.validate(newYearMonthDay, getValues());
			return newYearMonthDay;
		}
	}

	public org.joda.time.YearMonthDay withField(org.joda.time.DateTimeFieldType fieldType, int value) {
		int index = indexOfSupported(fieldType);
		if (value == (getValue(index))) {
			return org.joda.time.YearMonthDay.this;
		}
		int[] newValues = getValues();
		newValues = getField(index).set(org.joda.time.YearMonthDay.this, index, newValues, value);
		return new org.joda.time.YearMonthDay(org.joda.time.YearMonthDay.this, newValues);
	}

	public org.joda.time.YearMonthDay withFieldAdded(org.joda.time.DurationFieldType fieldType, int amount) {
		int index = indexOfSupported(fieldType);
		if (amount == 0) {
			return org.joda.time.YearMonthDay.this;
		}
		int[] newValues = getValues();
		newValues = getField(index).add(org.joda.time.YearMonthDay.this, index, newValues, amount);
		return new org.joda.time.YearMonthDay(org.joda.time.YearMonthDay.this, newValues);
	}

	public org.joda.time.YearMonthDay withPeriodAdded(org.joda.time.ReadablePeriod period, int scalar) {
		if ((period == null) || (scalar == 0)) {
			return org.joda.time.YearMonthDay.this;
		}
		int[] newValues = getValues();
		for (int i = 0; i < (period.size()); i++) {
			org.joda.time.DurationFieldType fieldType = period.getFieldType(i);
			int index = indexOf(fieldType);
			if (index >= 0) {
				newValues = getField(index).add(org.joda.time.YearMonthDay.this, index, newValues, org.joda.time.field.FieldUtils.safeMultiply(period.getValue(i), scalar));
			}
		}
		return new org.joda.time.YearMonthDay(org.joda.time.YearMonthDay.this, newValues);
	}

	public org.joda.time.YearMonthDay plus(org.joda.time.ReadablePeriod period) {
		return withPeriodAdded(period, 1);
	}

	public org.joda.time.YearMonthDay plusYears(int years) {
		return withFieldAdded(org.joda.time.DurationFieldType.years(), years);
	}

	public org.joda.time.YearMonthDay plusMonths(int months) {
		return withFieldAdded(org.joda.time.DurationFieldType.months(), months);
	}

	public org.joda.time.YearMonthDay plusDays(int days) {
		return withFieldAdded(org.joda.time.DurationFieldType.days(), days);
	}

	public org.joda.time.YearMonthDay minus(org.joda.time.ReadablePeriod period) {
		return withPeriodAdded(period, (-1));
	}

	public org.joda.time.YearMonthDay minusYears(int years) {
		return withFieldAdded(org.joda.time.DurationFieldType.years(), org.joda.time.field.FieldUtils.safeNegate(years));
	}

	public org.joda.time.YearMonthDay minusMonths(int months) {
		return withFieldAdded(org.joda.time.DurationFieldType.months(), org.joda.time.field.FieldUtils.safeNegate(months));
	}

	public org.joda.time.YearMonthDay minusDays(int days) {
		return withFieldAdded(org.joda.time.DurationFieldType.days(), org.joda.time.field.FieldUtils.safeNegate(days));
	}

	public org.joda.time.YearMonthDay.Property property(org.joda.time.DateTimeFieldType type) {
		return new org.joda.time.YearMonthDay.Property(org.joda.time.YearMonthDay.this, indexOfSupported(type));
	}

	public org.joda.time.LocalDate toLocalDate() {
		return new org.joda.time.LocalDate(getYear(), getMonthOfYear(), getDayOfMonth(), getChronology());
	}

	public org.joda.time.DateTime toDateTimeAtMidnight() {
		return toDateTimeAtMidnight(null);
	}

	public org.joda.time.DateTime toDateTimeAtMidnight(org.joda.time.DateTimeZone zone) {
		org.joda.time.Chronology chrono = getChronology().withZone(zone);
		return new org.joda.time.DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), 0, 0, 0, 0, chrono);
	}

	public org.joda.time.DateTime toDateTimeAtCurrentTime() {
		return toDateTimeAtCurrentTime(null);
	}

	public org.joda.time.DateTime toDateTimeAtCurrentTime(org.joda.time.DateTimeZone zone) {
		org.joda.time.Chronology chrono = getChronology().withZone(zone);
		long instantMillis = org.joda.time.DateTimeUtils.currentTimeMillis();
		long resolved = chrono.set(org.joda.time.YearMonthDay.this, instantMillis);
		return new org.joda.time.DateTime(resolved, chrono);
	}

	public org.joda.time.DateMidnight toDateMidnight() {
		return toDateMidnight(null);
	}

	public org.joda.time.DateMidnight toDateMidnight(org.joda.time.DateTimeZone zone) {
		org.joda.time.Chronology chrono = getChronology().withZone(zone);
		return new org.joda.time.DateMidnight(getYear(), getMonthOfYear(), getDayOfMonth(), chrono);
	}

	public org.joda.time.DateTime toDateTime(org.joda.time.TimeOfDay time) {
		return toDateTime(time, null);
	}

	public org.joda.time.DateTime toDateTime(org.joda.time.TimeOfDay time, org.joda.time.DateTimeZone zone) {
		org.joda.time.Chronology chrono = getChronology().withZone(zone);
		long instant = org.joda.time.DateTimeUtils.currentTimeMillis();
		instant = chrono.set(org.joda.time.YearMonthDay.this, instant);
		if (time != null) {
			instant = chrono.set(time, instant);
		}
		return new org.joda.time.DateTime(instant, chrono);
	}

	public org.joda.time.Interval toInterval() {
		return toInterval(null);
	}

	public org.joda.time.Interval toInterval(org.joda.time.DateTimeZone zone) {
		zone = org.joda.time.DateTimeUtils.getZone(zone);
		return toDateMidnight(zone).toInterval();
	}

	public int getYear() {
		return getValue(org.joda.time.YearMonthDay.YEAR);
	}

	public int getMonthOfYear() {
		return getValue(org.joda.time.YearMonthDay.MONTH_OF_YEAR);
	}

	public int getDayOfMonth() {
		return getValue(org.joda.time.YearMonthDay.DAY_OF_MONTH);
	}

	public org.joda.time.YearMonthDay withYear(int year) {
		int[] newValues = getValues();
		newValues = getChronology().year().set(org.joda.time.YearMonthDay.this, org.joda.time.YearMonthDay.YEAR, newValues, year);
		return new org.joda.time.YearMonthDay(org.joda.time.YearMonthDay.this, newValues);
	}

	public org.joda.time.YearMonthDay withMonthOfYear(int monthOfYear) {
		int[] newValues = getValues();
		newValues = getChronology().monthOfYear().set(org.joda.time.YearMonthDay.this, org.joda.time.YearMonthDay.MONTH_OF_YEAR, newValues, monthOfYear);
		return new org.joda.time.YearMonthDay(org.joda.time.YearMonthDay.this, newValues);
	}

	public org.joda.time.YearMonthDay withDayOfMonth(int dayOfMonth) {
		int[] newValues = getValues();
		newValues = getChronology().dayOfMonth().set(org.joda.time.YearMonthDay.this, org.joda.time.YearMonthDay.DAY_OF_MONTH, newValues, dayOfMonth);
		return new org.joda.time.YearMonthDay(org.joda.time.YearMonthDay.this, newValues);
	}

	public org.joda.time.YearMonthDay.Property year() {
		return new org.joda.time.YearMonthDay.Property(org.joda.time.YearMonthDay.this, org.joda.time.YearMonthDay.YEAR);
	}

	public org.joda.time.YearMonthDay.Property monthOfYear() {
		return new org.joda.time.YearMonthDay.Property(org.joda.time.YearMonthDay.this, org.joda.time.YearMonthDay.MONTH_OF_YEAR);
	}

	public org.joda.time.YearMonthDay.Property dayOfMonth() {
		return new org.joda.time.YearMonthDay.Property(org.joda.time.YearMonthDay.this, org.joda.time.YearMonthDay.DAY_OF_MONTH);
	}

	public java.lang.String toString() {
		return org.joda.time.format.ISODateTimeFormat.yearMonthDay().print(org.joda.time.YearMonthDay.this);
	}

	public static class Property extends org.joda.time.field.AbstractPartialFieldProperty implements java.io.Serializable {
		private static final long serialVersionUID = 5727734012190224363L;

		private final org.joda.time.YearMonthDay iYearMonthDay;

		private final int iFieldIndex;

		Property(org.joda.time.YearMonthDay partial, int fieldIndex) {
			super();
			iYearMonthDay = partial;
			iFieldIndex = fieldIndex;
		}

		public org.joda.time.DateTimeField getField() {
			return iYearMonthDay.getField(iFieldIndex);
		}

		protected org.joda.time.ReadablePartial getReadablePartial() {
			return iYearMonthDay;
		}

		public org.joda.time.YearMonthDay getYearMonthDay() {
			return iYearMonthDay;
		}

		public int get() {
			return iYearMonthDay.getValue(iFieldIndex);
		}

		public org.joda.time.YearMonthDay addToCopy(int valueToAdd) {
			int[] newValues = iYearMonthDay.getValues();
			newValues = getField().add(iYearMonthDay, iFieldIndex, newValues, valueToAdd);
			return new org.joda.time.YearMonthDay(iYearMonthDay, newValues);
		}

		public org.joda.time.YearMonthDay addWrapFieldToCopy(int valueToAdd) {
			int[] newValues = iYearMonthDay.getValues();
			newValues = getField().addWrapField(iYearMonthDay, iFieldIndex, newValues, valueToAdd);
			return new org.joda.time.YearMonthDay(iYearMonthDay, newValues);
		}

		public org.joda.time.YearMonthDay setCopy(int value) {
			int[] newValues = iYearMonthDay.getValues();
			newValues = getField().set(iYearMonthDay, iFieldIndex, newValues, value);
			return new org.joda.time.YearMonthDay(iYearMonthDay, newValues);
		}

		public org.joda.time.YearMonthDay setCopy(java.lang.String text, java.util.Locale locale) {
			int[] newValues = iYearMonthDay.getValues();
			newValues = getField().set(iYearMonthDay, iFieldIndex, newValues, text, locale);
			return new org.joda.time.YearMonthDay(iYearMonthDay, newValues);
		}

		public org.joda.time.YearMonthDay setCopy(java.lang.String text) {
			return setCopy(text, null);
		}

		public org.joda.time.YearMonthDay withMaximumValue() {
			return setCopy(getMaximumValue());
		}

		public org.joda.time.YearMonthDay withMinimumValue() {
			return setCopy(getMinimumValue());
		}
	}
}


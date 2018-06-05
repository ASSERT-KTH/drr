

package org.joda.time;


public final class TimeOfDay extends org.joda.time.base.BasePartial implements java.io.Serializable , org.joda.time.ReadablePartial {
	private static final long serialVersionUID = 3633353405803318660L;

	private static final org.joda.time.DateTimeFieldType[] FIELD_TYPES = new org.joda.time.DateTimeFieldType[]{ org.joda.time.DateTimeFieldType.hourOfDay() , org.joda.time.DateTimeFieldType.minuteOfHour() , org.joda.time.DateTimeFieldType.secondOfMinute() , org.joda.time.DateTimeFieldType.millisOfSecond() };

	public static final org.joda.time.TimeOfDay MIDNIGHT = new org.joda.time.TimeOfDay(0, 0, 0, 0);

	public static final int HOUR_OF_DAY = 0;

	public static final int MINUTE_OF_HOUR = 1;

	public static final int SECOND_OF_MINUTE = 2;

	public static final int MILLIS_OF_SECOND = 3;

	public static org.joda.time.TimeOfDay fromCalendarFields(java.util.Calendar calendar) {
		if (calendar == null) {
			throw new java.lang.IllegalArgumentException("The calendar must not be null");
		}
		return new org.joda.time.TimeOfDay(calendar.get(java.util.Calendar.HOUR_OF_DAY), calendar.get(java.util.Calendar.MINUTE), calendar.get(java.util.Calendar.SECOND), calendar.get(java.util.Calendar.MILLISECOND));
	}

	public static org.joda.time.TimeOfDay fromDateFields(java.util.Date date) {
		if (date == null) {
			throw new java.lang.IllegalArgumentException("The date must not be null");
		}
		return new org.joda.time.TimeOfDay(date.getHours(), date.getMinutes(), date.getSeconds(), ((((int) ((date.getTime()) % 1000)) + 1000) % 1000));
	}

	public static org.joda.time.TimeOfDay fromMillisOfDay(long millisOfDay) {
		return org.joda.time.TimeOfDay.fromMillisOfDay(millisOfDay, null);
	}

	public static org.joda.time.TimeOfDay fromMillisOfDay(long millisOfDay, org.joda.time.Chronology chrono) {
		chrono = org.joda.time.DateTimeUtils.getChronology(chrono);
		chrono = chrono.withUTC();
		return new org.joda.time.TimeOfDay(millisOfDay, chrono);
	}

	public TimeOfDay() {
		super();
	}

	public TimeOfDay(org.joda.time.DateTimeZone zone) {
		super(org.joda.time.chrono.ISOChronology.getInstance(zone));
	}

	public TimeOfDay(org.joda.time.Chronology chronology) {
		super(chronology);
	}

	public TimeOfDay(long instant) {
		super(instant);
	}

	public TimeOfDay(long instant, org.joda.time.Chronology chronology) {
		super(instant, chronology);
	}

	public TimeOfDay(java.lang.Object instant) {
		super(instant, null, org.joda.time.format.ISODateTimeFormat.timeParser());
	}

	public TimeOfDay(java.lang.Object instant, org.joda.time.Chronology chronology) {
		super(instant, org.joda.time.DateTimeUtils.getChronology(chronology), org.joda.time.format.ISODateTimeFormat.timeParser());
	}

	public TimeOfDay(int hourOfDay, int minuteOfHour) {
		this(hourOfDay, minuteOfHour, 0, 0, null);
	}

	public TimeOfDay(int hourOfDay, int minuteOfHour, org.joda.time.Chronology chronology) {
		this(hourOfDay, minuteOfHour, 0, 0, chronology);
	}

	public TimeOfDay(int hourOfDay, int minuteOfHour, int secondOfMinute) {
		this(hourOfDay, minuteOfHour, secondOfMinute, 0, null);
	}

	public TimeOfDay(int hourOfDay, int minuteOfHour, int secondOfMinute, org.joda.time.Chronology chronology) {
		this(hourOfDay, minuteOfHour, secondOfMinute, 0, chronology);
	}

	public TimeOfDay(int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) {
		this(hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, null);
	}

	public TimeOfDay(int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond, org.joda.time.Chronology chronology) {
		super(new int[]{ hourOfDay , minuteOfHour , secondOfMinute , millisOfSecond }, chronology);
	}

	TimeOfDay(org.joda.time.TimeOfDay partial, int[] values) {
		super(partial, values);
	}

	TimeOfDay(org.joda.time.TimeOfDay partial, org.joda.time.Chronology chrono) {
		super(partial, chrono);
	}

	public int size() {
		return 4;
	}

	protected org.joda.time.DateTimeField getField(int index, org.joda.time.Chronology chrono) {
		switch (index) {
			case org.joda.time.TimeOfDay.HOUR_OF_DAY :
				return chrono.hourOfDay();
			case org.joda.time.TimeOfDay.MINUTE_OF_HOUR :
				return chrono.minuteOfHour();
			case org.joda.time.TimeOfDay.SECOND_OF_MINUTE :
				return chrono.secondOfMinute();
			case org.joda.time.TimeOfDay.MILLIS_OF_SECOND :
				return chrono.millisOfSecond();
			default :
				throw new java.lang.IndexOutOfBoundsException(("Invalid index: " + index));
		}
	}

	public org.joda.time.DateTimeFieldType getFieldType(int index) {
		return org.joda.time.TimeOfDay.FIELD_TYPES[index];
	}

	public org.joda.time.DateTimeFieldType[] getFieldTypes() {
		return ((org.joda.time.DateTimeFieldType[]) (org.joda.time.TimeOfDay.FIELD_TYPES.clone()));
	}

	public org.joda.time.TimeOfDay withChronologyRetainFields(org.joda.time.Chronology newChronology) {
		newChronology = org.joda.time.DateTimeUtils.getChronology(newChronology);
		newChronology = newChronology.withUTC();
		if (newChronology == (getChronology())) {
			return org.joda.time.TimeOfDay.this;
		}else {
			org.joda.time.TimeOfDay newTimeOfDay = new org.joda.time.TimeOfDay(org.joda.time.TimeOfDay.this, newChronology);
			newChronology.validate(newTimeOfDay, getValues());
			return newTimeOfDay;
		}
	}

	public org.joda.time.TimeOfDay withField(org.joda.time.DateTimeFieldType fieldType, int value) {
		int index = indexOfSupported(fieldType);
		if (value == (getValue(index))) {
			return org.joda.time.TimeOfDay.this;
		}
		int[] newValues = getValues();
		newValues = getField(index).set(org.joda.time.TimeOfDay.this, index, newValues, value);
		return new org.joda.time.TimeOfDay(org.joda.time.TimeOfDay.this, newValues);
	}

	public org.joda.time.TimeOfDay withFieldAdded(org.joda.time.DurationFieldType fieldType, int amount) {
		int index = indexOfSupported(fieldType);
		if (amount == 0) {
			return org.joda.time.TimeOfDay.this;
		}
		int[] newValues = getValues();
		newValues = getField(index).addWrapPartial(org.joda.time.TimeOfDay.this, index, newValues, amount);
		return new org.joda.time.TimeOfDay(org.joda.time.TimeOfDay.this, newValues);
	}

	public org.joda.time.TimeOfDay withPeriodAdded(org.joda.time.ReadablePeriod period, int scalar) {
		if ((period == null) || (scalar == 0)) {
			return org.joda.time.TimeOfDay.this;
		}
		int[] newValues = getValues();
		for (int i = 0; i < (period.size()); i++) {
			org.joda.time.DurationFieldType fieldType = period.getFieldType(i);
			int index = indexOf(fieldType);
			if (index >= 0) {
				newValues = getField(index).addWrapPartial(org.joda.time.TimeOfDay.this, index, newValues, org.joda.time.field.FieldUtils.safeMultiply(period.getValue(i), scalar));
			}
		}
		return new org.joda.time.TimeOfDay(org.joda.time.TimeOfDay.this, newValues);
	}

	public org.joda.time.TimeOfDay plus(org.joda.time.ReadablePeriod period) {
		return withPeriodAdded(period, 1);
	}

	public org.joda.time.TimeOfDay plusHours(int hours) {
		return withFieldAdded(org.joda.time.DurationFieldType.hours(), hours);
	}

	public org.joda.time.TimeOfDay plusMinutes(int minutes) {
		return withFieldAdded(org.joda.time.DurationFieldType.minutes(), minutes);
	}

	public org.joda.time.TimeOfDay plusSeconds(int seconds) {
		return withFieldAdded(org.joda.time.DurationFieldType.seconds(), seconds);
	}

	public org.joda.time.TimeOfDay plusMillis(int millis) {
		return withFieldAdded(org.joda.time.DurationFieldType.millis(), millis);
	}

	public org.joda.time.TimeOfDay minus(org.joda.time.ReadablePeriod period) {
		return withPeriodAdded(period, (-1));
	}

	public org.joda.time.TimeOfDay minusHours(int hours) {
		return withFieldAdded(org.joda.time.DurationFieldType.hours(), org.joda.time.field.FieldUtils.safeNegate(hours));
	}

	public org.joda.time.TimeOfDay minusMinutes(int minutes) {
		return withFieldAdded(org.joda.time.DurationFieldType.minutes(), org.joda.time.field.FieldUtils.safeNegate(minutes));
	}

	public org.joda.time.TimeOfDay minusSeconds(int seconds) {
		return withFieldAdded(org.joda.time.DurationFieldType.seconds(), org.joda.time.field.FieldUtils.safeNegate(seconds));
	}

	public org.joda.time.TimeOfDay minusMillis(int millis) {
		return withFieldAdded(org.joda.time.DurationFieldType.millis(), org.joda.time.field.FieldUtils.safeNegate(millis));
	}

	public org.joda.time.TimeOfDay.Property property(org.joda.time.DateTimeFieldType type) {
		return new org.joda.time.TimeOfDay.Property(org.joda.time.TimeOfDay.this, indexOfSupported(type));
	}

	public org.joda.time.LocalTime toLocalTime() {
		return new org.joda.time.LocalTime(getHourOfDay(), getMinuteOfHour(), getSecondOfMinute(), getMillisOfSecond(), getChronology());
	}

	public org.joda.time.DateTime toDateTimeToday() {
		return toDateTimeToday(null);
	}

	public org.joda.time.DateTime toDateTimeToday(org.joda.time.DateTimeZone zone) {
		org.joda.time.Chronology chrono = getChronology().withZone(zone);
		long instantMillis = org.joda.time.DateTimeUtils.currentTimeMillis();
		long resolved = chrono.set(org.joda.time.TimeOfDay.this, instantMillis);
		return new org.joda.time.DateTime(resolved, chrono);
	}

	public int getHourOfDay() {
		return getValue(org.joda.time.TimeOfDay.HOUR_OF_DAY);
	}

	public int getMinuteOfHour() {
		return getValue(org.joda.time.TimeOfDay.MINUTE_OF_HOUR);
	}

	public int getSecondOfMinute() {
		return getValue(org.joda.time.TimeOfDay.SECOND_OF_MINUTE);
	}

	public int getMillisOfSecond() {
		return getValue(org.joda.time.TimeOfDay.MILLIS_OF_SECOND);
	}

	public org.joda.time.TimeOfDay withHourOfDay(int hour) {
		int[] newValues = getValues();
		newValues = getChronology().hourOfDay().set(org.joda.time.TimeOfDay.this, org.joda.time.TimeOfDay.HOUR_OF_DAY, newValues, hour);
		return new org.joda.time.TimeOfDay(org.joda.time.TimeOfDay.this, newValues);
	}

	public org.joda.time.TimeOfDay withMinuteOfHour(int minute) {
		int[] newValues = getValues();
		newValues = getChronology().minuteOfHour().set(org.joda.time.TimeOfDay.this, org.joda.time.TimeOfDay.MINUTE_OF_HOUR, newValues, minute);
		return new org.joda.time.TimeOfDay(org.joda.time.TimeOfDay.this, newValues);
	}

	public org.joda.time.TimeOfDay withSecondOfMinute(int second) {
		int[] newValues = getValues();
		newValues = getChronology().secondOfMinute().set(org.joda.time.TimeOfDay.this, org.joda.time.TimeOfDay.SECOND_OF_MINUTE, newValues, second);
		return new org.joda.time.TimeOfDay(org.joda.time.TimeOfDay.this, newValues);
	}

	public org.joda.time.TimeOfDay withMillisOfSecond(int millis) {
		int[] newValues = getValues();
		newValues = getChronology().millisOfSecond().set(org.joda.time.TimeOfDay.this, org.joda.time.TimeOfDay.MILLIS_OF_SECOND, newValues, millis);
		return new org.joda.time.TimeOfDay(org.joda.time.TimeOfDay.this, newValues);
	}

	public org.joda.time.TimeOfDay.Property hourOfDay() {
		return new org.joda.time.TimeOfDay.Property(org.joda.time.TimeOfDay.this, org.joda.time.TimeOfDay.HOUR_OF_DAY);
	}

	public org.joda.time.TimeOfDay.Property minuteOfHour() {
		return new org.joda.time.TimeOfDay.Property(org.joda.time.TimeOfDay.this, org.joda.time.TimeOfDay.MINUTE_OF_HOUR);
	}

	public org.joda.time.TimeOfDay.Property secondOfMinute() {
		return new org.joda.time.TimeOfDay.Property(org.joda.time.TimeOfDay.this, org.joda.time.TimeOfDay.SECOND_OF_MINUTE);
	}

	public org.joda.time.TimeOfDay.Property millisOfSecond() {
		return new org.joda.time.TimeOfDay.Property(org.joda.time.TimeOfDay.this, org.joda.time.TimeOfDay.MILLIS_OF_SECOND);
	}

	public java.lang.String toString() {
		return org.joda.time.format.ISODateTimeFormat.tTime().print(org.joda.time.TimeOfDay.this);
	}

	public static class Property extends org.joda.time.field.AbstractPartialFieldProperty implements java.io.Serializable {
		private static final long serialVersionUID = 5598459141741063833L;

		private final org.joda.time.TimeOfDay iTimeOfDay;

		private final int iFieldIndex;

		Property(org.joda.time.TimeOfDay partial, int fieldIndex) {
			super();
			iTimeOfDay = partial;
			iFieldIndex = fieldIndex;
		}

		public org.joda.time.DateTimeField getField() {
			return iTimeOfDay.getField(iFieldIndex);
		}

		protected org.joda.time.ReadablePartial getReadablePartial() {
			return iTimeOfDay;
		}

		public org.joda.time.TimeOfDay getTimeOfDay() {
			return iTimeOfDay;
		}

		public int get() {
			return iTimeOfDay.getValue(iFieldIndex);
		}

		public org.joda.time.TimeOfDay addToCopy(int valueToAdd) {
			int[] newValues = iTimeOfDay.getValues();
			newValues = getField().addWrapPartial(iTimeOfDay, iFieldIndex, newValues, valueToAdd);
			return new org.joda.time.TimeOfDay(iTimeOfDay, newValues);
		}

		public org.joda.time.TimeOfDay addNoWrapToCopy(int valueToAdd) {
			int[] newValues = iTimeOfDay.getValues();
			newValues = getField().add(iTimeOfDay, iFieldIndex, newValues, valueToAdd);
			return new org.joda.time.TimeOfDay(iTimeOfDay, newValues);
		}

		public org.joda.time.TimeOfDay addWrapFieldToCopy(int valueToAdd) {
			int[] newValues = iTimeOfDay.getValues();
			newValues = getField().addWrapField(iTimeOfDay, iFieldIndex, newValues, valueToAdd);
			return new org.joda.time.TimeOfDay(iTimeOfDay, newValues);
		}

		public org.joda.time.TimeOfDay setCopy(int value) {
			int[] newValues = iTimeOfDay.getValues();
			newValues = getField().set(iTimeOfDay, iFieldIndex, newValues, value);
			return new org.joda.time.TimeOfDay(iTimeOfDay, newValues);
		}

		public org.joda.time.TimeOfDay setCopy(java.lang.String text, java.util.Locale locale) {
			int[] newValues = iTimeOfDay.getValues();
			newValues = getField().set(iTimeOfDay, iFieldIndex, newValues, text, locale);
			return new org.joda.time.TimeOfDay(iTimeOfDay, newValues);
		}

		public org.joda.time.TimeOfDay setCopy(java.lang.String text) {
			return setCopy(text, null);
		}

		public org.joda.time.TimeOfDay withMaximumValue() {
			return setCopy(getMaximumValue());
		}

		public org.joda.time.TimeOfDay withMinimumValue() {
			return setCopy(getMinimumValue());
		}
	}
}


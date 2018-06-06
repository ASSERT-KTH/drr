

package org.joda.time;


public final class LocalTime extends org.joda.time.base.BaseLocal implements java.io.Serializable , org.joda.time.ReadablePartial {
	private static final long serialVersionUID = -12873158713873L;

	public static final org.joda.time.LocalTime MIDNIGHT = new org.joda.time.LocalTime(0, 0, 0, 0);

	private static final int HOUR_OF_DAY = 0;

	private static final int MINUTE_OF_HOUR = 1;

	private static final int SECOND_OF_MINUTE = 2;

	private static final int MILLIS_OF_SECOND = 3;

	private static final java.util.Set<org.joda.time.DurationFieldType> TIME_DURATION_TYPES = new java.util.HashSet<org.joda.time.DurationFieldType>();

	static {
		org.joda.time.LocalTime.TIME_DURATION_TYPES.add(org.joda.time.DurationFieldType.millis());
		org.joda.time.LocalTime.TIME_DURATION_TYPES.add(org.joda.time.DurationFieldType.seconds());
		org.joda.time.LocalTime.TIME_DURATION_TYPES.add(org.joda.time.DurationFieldType.minutes());
		org.joda.time.LocalTime.TIME_DURATION_TYPES.add(org.joda.time.DurationFieldType.hours());
	}

	private long iLocalMillis;

	private org.joda.time.Chronology iChronology;

	public static org.joda.time.LocalTime fromMillisOfDay(long millisOfDay) {
		return org.joda.time.LocalTime.fromMillisOfDay(millisOfDay, null);
	}

	public static org.joda.time.LocalTime fromMillisOfDay(long millisOfDay, org.joda.time.Chronology chrono) {
		chrono = org.joda.time.DateTimeUtils.getChronology(chrono).withUTC();
		return new org.joda.time.LocalTime(millisOfDay, chrono);
	}

	public static org.joda.time.LocalTime fromCalendarFields(java.util.Calendar calendar) {
		if (calendar == null) {
			throw new java.lang.IllegalArgumentException("The calendar must not be null");
		}
		return new org.joda.time.LocalTime(calendar.get(java.util.Calendar.HOUR_OF_DAY), calendar.get(java.util.Calendar.MINUTE), calendar.get(java.util.Calendar.SECOND), calendar.get(java.util.Calendar.MILLISECOND));
	}

	@java.lang.SuppressWarnings(value = "deprecation")
	public static org.joda.time.LocalTime fromDateFields(java.util.Date date) {
		if (date == null) {
			throw new java.lang.IllegalArgumentException("The date must not be null");
		}
		return new org.joda.time.LocalTime(date.getHours(), date.getMinutes(), date.getSeconds(), ((((int) ((date.getTime()) % 1000)) + 1000) % 1000));
	}

	public LocalTime() {
		this(org.joda.time.DateTimeUtils.currentTimeMillis(), org.joda.time.chrono.ISOChronology.getInstance());
	}

	public LocalTime(org.joda.time.DateTimeZone zone) {
		this(org.joda.time.DateTimeUtils.currentTimeMillis(), org.joda.time.chrono.ISOChronology.getInstance(zone));
	}

	public LocalTime(org.joda.time.Chronology chronology) {
		this(org.joda.time.DateTimeUtils.currentTimeMillis(), chronology);
	}

	public LocalTime(long instant) {
		this(instant, org.joda.time.chrono.ISOChronology.getInstance());
	}

	public LocalTime(long instant, org.joda.time.DateTimeZone zone) {
		this(instant, org.joda.time.chrono.ISOChronology.getInstance(zone));
	}

	public LocalTime(long instant, org.joda.time.Chronology chronology) {
		chronology = org.joda.time.DateTimeUtils.getChronology(chronology);
		long localMillis = chronology.getZone().getMillisKeepLocal(org.joda.time.DateTimeZone.UTC, instant);
		chronology = chronology.withUTC();
		iLocalMillis = chronology.millisOfDay().get(localMillis);
		iChronology = chronology;
	}

	public LocalTime(java.lang.Object instant) {
		this(instant, ((org.joda.time.Chronology) (null)));
	}

	public LocalTime(java.lang.Object instant, org.joda.time.DateTimeZone zone) {
		org.joda.time.convert.PartialConverter converter = org.joda.time.convert.ConverterManager.getInstance().getPartialConverter(instant);
		org.joda.time.Chronology chronology = converter.getChronology(instant, zone);
		chronology = org.joda.time.DateTimeUtils.getChronology(chronology);
		iChronology = chronology.withUTC();
		int[] values = converter.getPartialValues(org.joda.time.LocalTime.this, instant, chronology, org.joda.time.format.ISODateTimeFormat.localTimeParser());
		iLocalMillis = iChronology.getDateTimeMillis(0L, values[0], values[1], values[2], values[3]);
	}

	public LocalTime(java.lang.Object instant, org.joda.time.Chronology chronology) {
		org.joda.time.convert.PartialConverter converter = org.joda.time.convert.ConverterManager.getInstance().getPartialConverter(instant);
		chronology = converter.getChronology(instant, chronology);
		chronology = org.joda.time.DateTimeUtils.getChronology(chronology);
		iChronology = chronology.withUTC();
		int[] values = converter.getPartialValues(org.joda.time.LocalTime.this, instant, chronology, org.joda.time.format.ISODateTimeFormat.localTimeParser());
		iLocalMillis = iChronology.getDateTimeMillis(0L, values[0], values[1], values[2], values[3]);
	}

	public LocalTime(int hourOfDay, int minuteOfHour) {
		this(hourOfDay, minuteOfHour, 0, 0, org.joda.time.chrono.ISOChronology.getInstanceUTC());
	}

	public LocalTime(int hourOfDay, int minuteOfHour, int secondOfMinute) {
		this(hourOfDay, minuteOfHour, secondOfMinute, 0, org.joda.time.chrono.ISOChronology.getInstanceUTC());
	}

	public LocalTime(int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) {
		this(hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, org.joda.time.chrono.ISOChronology.getInstanceUTC());
	}

	public LocalTime(int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond, org.joda.time.Chronology chronology) {
		super();
		chronology = org.joda.time.DateTimeUtils.getChronology(chronology).withUTC();
		long instant = chronology.getDateTimeMillis(0L, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
		iChronology = chronology;
		iLocalMillis = instant;
	}

	public int size() {
		return 4;
	}

	protected org.joda.time.DateTimeField getField(int index, org.joda.time.Chronology chrono) {
		switch (index) {
			case org.joda.time.LocalTime.HOUR_OF_DAY :
				return chrono.hourOfDay();
			case org.joda.time.LocalTime.MINUTE_OF_HOUR :
				return chrono.minuteOfHour();
			case org.joda.time.LocalTime.SECOND_OF_MINUTE :
				return chrono.secondOfMinute();
			case org.joda.time.LocalTime.MILLIS_OF_SECOND :
				return chrono.millisOfSecond();
			default :
				throw new java.lang.IndexOutOfBoundsException(("Invalid index: " + index));
		}
	}

	public int getValue(int index) {
		switch (index) {
			case org.joda.time.LocalTime.HOUR_OF_DAY :
				return getChronology().hourOfDay().get(getLocalMillis());
			case org.joda.time.LocalTime.MINUTE_OF_HOUR :
				return getChronology().minuteOfHour().get(getLocalMillis());
			case org.joda.time.LocalTime.SECOND_OF_MINUTE :
				return getChronology().secondOfMinute().get(getLocalMillis());
			case org.joda.time.LocalTime.MILLIS_OF_SECOND :
				return getChronology().millisOfSecond().get(getLocalMillis());
			default :
				throw new java.lang.IndexOutOfBoundsException(("Invalid index: " + index));
		}
	}

	public int get(org.joda.time.DateTimeFieldType fieldType) {
		if (fieldType == null) {
			throw new java.lang.IllegalArgumentException("The DateTimeFieldType must not be null");
		}
		if ((isSupported(fieldType)) == false) {
			throw new java.lang.IllegalArgumentException((("Field '" + fieldType) + "' is not supported"));
		}
		return fieldType.getField(getChronology()).get(getLocalMillis());
	}

	public boolean isSupported(org.joda.time.DateTimeFieldType type) {
		if (type == null) {
			return false;
		}
		if ((isSupported(type.getDurationType())) == false) {
			return false;
		}
		org.joda.time.DurationFieldType range = type.getRangeDurationType();
		return (isSupported(range)) || (range == (org.joda.time.DurationFieldType.days()));
	}

	public boolean isSupported(org.joda.time.DurationFieldType type) {
		if (type == null) {
			return false;
		}
		org.joda.time.DurationField field = type.getField(getChronology());
		if ((org.joda.time.LocalTime.TIME_DURATION_TYPES.contains(type)) || ((field.getUnitMillis()) < (getChronology().days().getUnitMillis()))) {
			return field.isSupported();
		}
		return false;
	}

	protected long getLocalMillis() {
		return iLocalMillis;
	}

	public org.joda.time.Chronology getChronology() {
		return iChronology;
	}

	public boolean equals(java.lang.Object partial) {
		if ((org.joda.time.LocalTime.this) == partial) {
			return true;
		}
		if (partial instanceof org.joda.time.LocalTime) {
			org.joda.time.LocalTime other = ((org.joda.time.LocalTime) (partial));
			if (iChronology.equals(other.iChronology)) {
				return (iLocalMillis) == (other.iLocalMillis);
			}
		}
		return super.equals(partial);
	}

	public int compareTo(org.joda.time.ReadablePartial partial) {
		if ((org.joda.time.LocalTime.this) == partial) {
			return 0;
		}
		if (partial instanceof org.joda.time.LocalTime) {
			org.joda.time.LocalTime other = ((org.joda.time.LocalTime) (partial));
			if (iChronology.equals(other.iChronology)) {
				return (iLocalMillis) < (other.iLocalMillis) ? -1 : (iLocalMillis) == (other.iLocalMillis) ? 0 : 1;
			}
		}
		return super.compareTo(partial);
	}

	org.joda.time.LocalTime withLocalMillis(long newMillis) {
		return newMillis == (getLocalMillis()) ? org.joda.time.LocalTime.this : new org.joda.time.LocalTime(newMillis, getChronology());
	}

	public org.joda.time.LocalTime withFields(org.joda.time.ReadablePartial partial) {
		if (partial == null) {
			return org.joda.time.LocalTime.this;
		}
		return withLocalMillis(getChronology().set(partial, getLocalMillis()));
	}

	public org.joda.time.LocalTime withField(org.joda.time.DateTimeFieldType fieldType, int value) {
		if (fieldType == null) {
			throw new java.lang.IllegalArgumentException("Field must not be null");
		}
		if ((isSupported(fieldType)) == false) {
			throw new java.lang.IllegalArgumentException((("Field '" + fieldType) + "' is not supported"));
		}
		long instant = fieldType.getField(getChronology()).set(getLocalMillis(), value);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalTime withFieldAdded(org.joda.time.DurationFieldType fieldType, int amount) {
		if (fieldType == null) {
			throw new java.lang.IllegalArgumentException("Field must not be null");
		}
		if ((isSupported(fieldType)) == false) {
			throw new java.lang.IllegalArgumentException((("Field '" + fieldType) + "' is not supported"));
		}
		if (amount == 0) {
			return org.joda.time.LocalTime.this;
		}
		long instant = fieldType.getField(getChronology()).add(getLocalMillis(), amount);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalTime withPeriodAdded(org.joda.time.ReadablePeriod period, int scalar) {
		if ((period == null) || (scalar == 0)) {
			return org.joda.time.LocalTime.this;
		}
		long instant = getChronology().add(period, getLocalMillis(), scalar);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalTime plus(org.joda.time.ReadablePeriod period) {
		return withPeriodAdded(period, 1);
	}

	public org.joda.time.LocalTime plusHours(int hours) {
		if (hours == 0) {
			return org.joda.time.LocalTime.this;
		}
		long instant = getChronology().hours().add(getLocalMillis(), hours);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalTime plusMinutes(int minutes) {
		if (minutes == 0) {
			return org.joda.time.LocalTime.this;
		}
		long instant = getChronology().minutes().add(getLocalMillis(), minutes);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalTime plusSeconds(int seconds) {
		if (seconds == 0) {
			return org.joda.time.LocalTime.this;
		}
		long instant = getChronology().seconds().add(getLocalMillis(), seconds);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalTime plusMillis(int millis) {
		if (millis == 0) {
			return org.joda.time.LocalTime.this;
		}
		long instant = getChronology().millis().add(getLocalMillis(), millis);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalTime minus(org.joda.time.ReadablePeriod period) {
		return withPeriodAdded(period, (-1));
	}

	public org.joda.time.LocalTime minusHours(int hours) {
		if (hours == 0) {
			return org.joda.time.LocalTime.this;
		}
		long instant = getChronology().hours().subtract(getLocalMillis(), hours);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalTime minusMinutes(int minutes) {
		if (minutes == 0) {
			return org.joda.time.LocalTime.this;
		}
		long instant = getChronology().minutes().subtract(getLocalMillis(), minutes);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalTime minusSeconds(int seconds) {
		if (seconds == 0) {
			return org.joda.time.LocalTime.this;
		}
		long instant = getChronology().seconds().subtract(getLocalMillis(), seconds);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalTime minusMillis(int millis) {
		if (millis == 0) {
			return org.joda.time.LocalTime.this;
		}
		long instant = getChronology().millis().subtract(getLocalMillis(), millis);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalTime.Property property(org.joda.time.DateTimeFieldType fieldType) {
		if (fieldType == null) {
			throw new java.lang.IllegalArgumentException("The DateTimeFieldType must not be null");
		}
		if ((isSupported(fieldType)) == false) {
			throw new java.lang.IllegalArgumentException((("Field '" + fieldType) + "' is not supported"));
		}
		return new org.joda.time.LocalTime.Property(org.joda.time.LocalTime.this, fieldType.getField(getChronology()));
	}

	public int getHourOfDay() {
		return getChronology().hourOfDay().get(getLocalMillis());
	}

	public int getMinuteOfHour() {
		return getChronology().minuteOfHour().get(getLocalMillis());
	}

	public int getSecondOfMinute() {
		return getChronology().secondOfMinute().get(getLocalMillis());
	}

	public int getMillisOfSecond() {
		return getChronology().millisOfSecond().get(getLocalMillis());
	}

	public int getMillisOfDay() {
		return getChronology().millisOfDay().get(getLocalMillis());
	}

	public org.joda.time.LocalTime withHourOfDay(int hour) {
		return withLocalMillis(getChronology().hourOfDay().set(getLocalMillis(), hour));
	}

	public org.joda.time.LocalTime withMinuteOfHour(int minute) {
		return withLocalMillis(getChronology().minuteOfHour().set(getLocalMillis(), minute));
	}

	public org.joda.time.LocalTime withSecondOfMinute(int second) {
		return withLocalMillis(getChronology().secondOfMinute().set(getLocalMillis(), second));
	}

	public org.joda.time.LocalTime withMillisOfSecond(int millis) {
		return withLocalMillis(getChronology().millisOfSecond().set(getLocalMillis(), millis));
	}

	public org.joda.time.LocalTime withMillisOfDay(int millis) {
		return withLocalMillis(getChronology().millisOfDay().set(getLocalMillis(), millis));
	}

	public org.joda.time.LocalTime.Property hourOfDay() {
		return new org.joda.time.LocalTime.Property(org.joda.time.LocalTime.this, getChronology().hourOfDay());
	}

	public org.joda.time.LocalTime.Property minuteOfHour() {
		return new org.joda.time.LocalTime.Property(org.joda.time.LocalTime.this, getChronology().minuteOfHour());
	}

	public org.joda.time.LocalTime.Property secondOfMinute() {
		return new org.joda.time.LocalTime.Property(org.joda.time.LocalTime.this, getChronology().secondOfMinute());
	}

	public org.joda.time.LocalTime.Property millisOfSecond() {
		return new org.joda.time.LocalTime.Property(org.joda.time.LocalTime.this, getChronology().millisOfSecond());
	}

	public org.joda.time.LocalTime.Property millisOfDay() {
		return new org.joda.time.LocalTime.Property(org.joda.time.LocalTime.this, getChronology().millisOfDay());
	}

	public org.joda.time.DateTime toDateTimeToday() {
		return toDateTimeToday(null);
	}

	public org.joda.time.DateTime toDateTimeToday(org.joda.time.DateTimeZone zone) {
		org.joda.time.Chronology chrono = getChronology().withZone(zone);
		long instantMillis = org.joda.time.DateTimeUtils.currentTimeMillis();
		long resolved = chrono.set(org.joda.time.LocalTime.this, instantMillis);
		return new org.joda.time.DateTime(resolved, chrono);
	}

	public java.lang.String toString() {
		return org.joda.time.format.ISODateTimeFormat.time().print(org.joda.time.LocalTime.this);
	}

	public java.lang.String toString(java.lang.String pattern) {
		if (pattern == null) {
			return toString();
		}
		return org.joda.time.format.DateTimeFormat.forPattern(pattern).print(org.joda.time.LocalTime.this);
	}

	public java.lang.String toString(java.lang.String pattern, java.util.Locale locale) throws java.lang.IllegalArgumentException {
		if (pattern == null) {
			return toString();
		}
		return org.joda.time.format.DateTimeFormat.forPattern(pattern).withLocale(locale).print(org.joda.time.LocalTime.this);
	}

	public static final class Property extends org.joda.time.field.AbstractReadableInstantFieldProperty {
		private static final long serialVersionUID = -325842547277223L;

		private transient org.joda.time.LocalTime iInstant;

		private transient org.joda.time.DateTimeField iField;

		Property(org.joda.time.LocalTime instant, org.joda.time.DateTimeField field) {
			super();
			iInstant = instant;
			iField = field;
		}

		private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException {
			oos.writeObject(iInstant);
			oos.writeObject(iField.getType());
		}

		private void readObject(java.io.ObjectInputStream oos) throws java.io.IOException, java.lang.ClassNotFoundException {
			iInstant = ((org.joda.time.LocalTime) (oos.readObject()));
			org.joda.time.DateTimeFieldType type = ((org.joda.time.DateTimeFieldType) (oos.readObject()));
			iField = type.getField(iInstant.getChronology());
		}

		public org.joda.time.DateTimeField getField() {
			return iField;
		}

		protected long getMillis() {
			return iInstant.getLocalMillis();
		}

		protected org.joda.time.Chronology getChronology() {
			return iInstant.getChronology();
		}

		public org.joda.time.LocalTime getLocalTime() {
			return iInstant;
		}

		public org.joda.time.LocalTime addCopy(int value) {
			return iInstant.withLocalMillis(iField.add(iInstant.getLocalMillis(), value));
		}

		public org.joda.time.LocalTime addCopy(long value) {
			return iInstant.withLocalMillis(iField.add(iInstant.getLocalMillis(), value));
		}

		public org.joda.time.LocalTime addNoWrapToCopy(int value) {
			long millis = iField.add(iInstant.getLocalMillis(), value);
			long rounded = iInstant.getChronology().millisOfDay().get(millis);
			if (rounded != millis) {
				throw new java.lang.IllegalArgumentException("The addition exceeded the boundaries of LocalTime");
			}
			return iInstant.withLocalMillis(millis);
		}

		public org.joda.time.LocalTime addWrapFieldToCopy(int value) {
			return iInstant.withLocalMillis(iField.addWrapField(iInstant.getLocalMillis(), value));
		}

		public org.joda.time.LocalTime setCopy(int value) {
			return iInstant.withLocalMillis(iField.set(iInstant.getLocalMillis(), value));
		}

		public org.joda.time.LocalTime setCopy(java.lang.String text, java.util.Locale locale) {
			return iInstant.withLocalMillis(iField.set(iInstant.getLocalMillis(), text, locale));
		}

		public org.joda.time.LocalTime setCopy(java.lang.String text) {
			return setCopy(text, null);
		}

		public org.joda.time.LocalTime withMaximumValue() {
			return setCopy(getMaximumValue());
		}

		public org.joda.time.LocalTime withMinimumValue() {
			return setCopy(getMinimumValue());
		}

		public org.joda.time.LocalTime roundFloorCopy() {
			return iInstant.withLocalMillis(iField.roundFloor(iInstant.getLocalMillis()));
		}

		public org.joda.time.LocalTime roundCeilingCopy() {
			return iInstant.withLocalMillis(iField.roundCeiling(iInstant.getLocalMillis()));
		}

		public org.joda.time.LocalTime roundHalfFloorCopy() {
			return iInstant.withLocalMillis(iField.roundHalfFloor(iInstant.getLocalMillis()));
		}

		public org.joda.time.LocalTime roundHalfCeilingCopy() {
			return iInstant.withLocalMillis(iField.roundHalfCeiling(iInstant.getLocalMillis()));
		}

		public org.joda.time.LocalTime roundHalfEvenCopy() {
			return iInstant.withLocalMillis(iField.roundHalfEven(iInstant.getLocalMillis()));
		}
	}
}


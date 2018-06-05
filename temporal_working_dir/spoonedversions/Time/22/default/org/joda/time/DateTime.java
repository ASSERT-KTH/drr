

package org.joda.time;


public final class DateTime extends org.joda.time.base.BaseDateTime implements java.io.Serializable , org.joda.time.ReadableDateTime {
	private static final long serialVersionUID = -5171125899451703815L;

	@org.joda.convert.FromString
	public static org.joda.time.DateTime parse(java.lang.String str) {
		return org.joda.time.DateTime.parse(str, org.joda.time.format.ISODateTimeFormat.dateTimeParser().withOffsetParsed());
	}

	public static org.joda.time.DateTime parse(java.lang.String str, org.joda.time.format.DateTimeFormatter formatter) {
		return formatter.parseDateTime(str);
	}

	public DateTime() {
		super();
	}

	public DateTime(org.joda.time.DateTimeZone zone) {
		super(zone);
	}

	public DateTime(org.joda.time.Chronology chronology) {
		super(chronology);
	}

	public DateTime(long instant) {
		super(instant);
	}

	public DateTime(long instant, org.joda.time.DateTimeZone zone) {
		super(instant, zone);
	}

	public DateTime(long instant, org.joda.time.Chronology chronology) {
		super(instant, chronology);
	}

	public DateTime(java.lang.Object instant) {
		super(instant, ((org.joda.time.Chronology) (null)));
	}

	public DateTime(java.lang.Object instant, org.joda.time.DateTimeZone zone) {
		super(instant, zone);
	}

	public DateTime(java.lang.Object instant, org.joda.time.Chronology chronology) {
		super(instant, org.joda.time.DateTimeUtils.getChronology(chronology));
	}

	public DateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour) {
		super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, 0, 0);
	}

	public DateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, org.joda.time.DateTimeZone zone) {
		super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, 0, 0, zone);
	}

	public DateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, org.joda.time.Chronology chronology) {
		super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, 0, 0, chronology);
	}

	public DateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute) {
		super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, 0);
	}

	public DateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, org.joda.time.DateTimeZone zone) {
		super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, 0, zone);
	}

	public DateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, org.joda.time.Chronology chronology) {
		super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, 0, chronology);
	}

	public DateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) {
		super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
	}

	public DateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond, org.joda.time.DateTimeZone zone) {
		super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, zone);
	}

	public DateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond, org.joda.time.Chronology chronology) {
		super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, chronology);
	}

	public org.joda.time.DateTime toDateTime() {
		return org.joda.time.DateTime.this;
	}

	public org.joda.time.DateTime toDateTimeISO() {
		if ((getChronology()) == (org.joda.time.chrono.ISOChronology.getInstance())) {
			return org.joda.time.DateTime.this;
		}
		return super.toDateTimeISO();
	}

	public org.joda.time.DateTime toDateTime(org.joda.time.DateTimeZone zone) {
		zone = org.joda.time.DateTimeUtils.getZone(zone);
		if ((getZone()) == zone) {
			return org.joda.time.DateTime.this;
		}
		return super.toDateTime(zone);
	}

	public org.joda.time.DateTime toDateTime(org.joda.time.Chronology chronology) {
		chronology = org.joda.time.DateTimeUtils.getChronology(chronology);
		if ((getChronology()) == chronology) {
			return org.joda.time.DateTime.this;
		}
		return super.toDateTime(chronology);
	}

	public org.joda.time.DateTime withMillis(long newMillis) {
		return newMillis == (getMillis()) ? org.joda.time.DateTime.this : new org.joda.time.DateTime(newMillis, getChronology());
	}

	public org.joda.time.DateTime withChronology(org.joda.time.Chronology newChronology) {
		newChronology = org.joda.time.DateTimeUtils.getChronology(newChronology);
		return newChronology == (getChronology()) ? org.joda.time.DateTime.this : new org.joda.time.DateTime(getMillis(), newChronology);
	}

	public org.joda.time.DateTime withZone(org.joda.time.DateTimeZone newZone) {
		return withChronology(getChronology().withZone(newZone));
	}

	public org.joda.time.DateTime withZoneRetainFields(org.joda.time.DateTimeZone newZone) {
		newZone = org.joda.time.DateTimeUtils.getZone(newZone);
		org.joda.time.DateTimeZone originalZone = org.joda.time.DateTimeUtils.getZone(getZone());
		if (newZone == originalZone) {
			return org.joda.time.DateTime.this;
		}
		long millis = originalZone.getMillisKeepLocal(newZone, getMillis());
		return new org.joda.time.DateTime(millis, getChronology().withZone(newZone));
	}

	public org.joda.time.DateTime withEarlierOffsetAtOverlap() {
		long newMillis = getZone().adjustOffset(getMillis(), false);
		return withMillis(newMillis);
	}

	public org.joda.time.DateTime withLaterOffsetAtOverlap() {
		long newMillis = getZone().adjustOffset(getMillis(), true);
		return withMillis(newMillis);
	}

	public org.joda.time.DateTime withDate(int year, int monthOfYear, int dayOfMonth) {
		org.joda.time.Chronology chrono = getChronology();
		long instant = getMillis();
		instant = chrono.year().set(instant, year);
		instant = chrono.monthOfYear().set(instant, monthOfYear);
		instant = chrono.dayOfMonth().set(instant, dayOfMonth);
		return withMillis(instant);
	}

	public org.joda.time.DateTime withTime(int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) {
		org.joda.time.Chronology chrono = getChronology();
		long instant = getMillis();
		instant = chrono.hourOfDay().set(instant, hourOfDay);
		instant = chrono.minuteOfHour().set(instant, minuteOfHour);
		instant = chrono.secondOfMinute().set(instant, secondOfMinute);
		instant = chrono.millisOfSecond().set(instant, millisOfSecond);
		return withMillis(instant);
	}

	public org.joda.time.DateTime withFields(org.joda.time.ReadablePartial partial) {
		if (partial == null) {
			return org.joda.time.DateTime.this;
		}
		return withMillis(getChronology().set(partial, getMillis()));
	}

	public org.joda.time.DateTime withField(org.joda.time.DateTimeFieldType fieldType, int value) {
		if (fieldType == null) {
			throw new java.lang.IllegalArgumentException("Field must not be null");
		}
		long instant = fieldType.getField(getChronology()).set(getMillis(), value);
		return withMillis(instant);
	}

	public org.joda.time.DateTime withFieldAdded(org.joda.time.DurationFieldType fieldType, int amount) {
		if (fieldType == null) {
			throw new java.lang.IllegalArgumentException("Field must not be null");
		}
		if (amount == 0) {
			return org.joda.time.DateTime.this;
		}
		long instant = fieldType.getField(getChronology()).add(getMillis(), amount);
		return withMillis(instant);
	}

	public org.joda.time.DateTime withDurationAdded(long durationToAdd, int scalar) {
		if ((durationToAdd == 0) || (scalar == 0)) {
			return org.joda.time.DateTime.this;
		}
		long instant = getChronology().add(getMillis(), durationToAdd, scalar);
		return withMillis(instant);
	}

	public org.joda.time.DateTime withDurationAdded(org.joda.time.ReadableDuration durationToAdd, int scalar) {
		if ((durationToAdd == null) || (scalar == 0)) {
			return org.joda.time.DateTime.this;
		}
		return withDurationAdded(durationToAdd.getMillis(), scalar);
	}

	public org.joda.time.DateTime withPeriodAdded(org.joda.time.ReadablePeriod period, int scalar) {
		if ((period == null) || (scalar == 0)) {
			return org.joda.time.DateTime.this;
		}
		long instant = getChronology().add(period, getMillis(), scalar);
		return withMillis(instant);
	}

	public org.joda.time.DateTime plus(long duration) {
		return withDurationAdded(duration, 1);
	}

	public org.joda.time.DateTime plus(org.joda.time.ReadableDuration duration) {
		return withDurationAdded(duration, 1);
	}

	public org.joda.time.DateTime plus(org.joda.time.ReadablePeriod period) {
		return withPeriodAdded(period, 1);
	}

	public org.joda.time.DateTime plusYears(int years) {
		if (years == 0) {
			return org.joda.time.DateTime.this;
		}
		long instant = getChronology().years().add(getMillis(), years);
		return withMillis(instant);
	}

	public org.joda.time.DateTime plusMonths(int months) {
		if (months == 0) {
			return org.joda.time.DateTime.this;
		}
		long instant = getChronology().months().add(getMillis(), months);
		return withMillis(instant);
	}

	public org.joda.time.DateTime plusWeeks(int weeks) {
		if (weeks == 0) {
			return org.joda.time.DateTime.this;
		}
		long instant = getChronology().weeks().add(getMillis(), weeks);
		return withMillis(instant);
	}

	public org.joda.time.DateTime plusDays(int days) {
		if (days == 0) {
			return org.joda.time.DateTime.this;
		}
		long instant = getChronology().days().add(getMillis(), days);
		return withMillis(instant);
	}

	public org.joda.time.DateTime plusHours(int hours) {
		if (hours == 0) {
			return org.joda.time.DateTime.this;
		}
		long instant = getChronology().hours().add(getMillis(), hours);
		return withMillis(instant);
	}

	public org.joda.time.DateTime plusMinutes(int minutes) {
		if (minutes == 0) {
			return org.joda.time.DateTime.this;
		}
		long instant = getChronology().minutes().add(getMillis(), minutes);
		return withMillis(instant);
	}

	public org.joda.time.DateTime plusSeconds(int seconds) {
		if (seconds == 0) {
			return org.joda.time.DateTime.this;
		}
		long instant = getChronology().seconds().add(getMillis(), seconds);
		return withMillis(instant);
	}

	public org.joda.time.DateTime plusMillis(int millis) {
		if (millis == 0) {
			return org.joda.time.DateTime.this;
		}
		long instant = getChronology().millis().add(getMillis(), millis);
		return withMillis(instant);
	}

	public org.joda.time.DateTime minus(long duration) {
		return withDurationAdded(duration, (-1));
	}

	public org.joda.time.DateTime minus(org.joda.time.ReadableDuration duration) {
		return withDurationAdded(duration, (-1));
	}

	public org.joda.time.DateTime minus(org.joda.time.ReadablePeriod period) {
		return withPeriodAdded(period, (-1));
	}

	public org.joda.time.DateTime minusYears(int years) {
		if (years == 0) {
			return org.joda.time.DateTime.this;
		}
		long instant = getChronology().years().subtract(getMillis(), years);
		return withMillis(instant);
	}

	public org.joda.time.DateTime minusMonths(int months) {
		if (months == 0) {
			return org.joda.time.DateTime.this;
		}
		long instant = getChronology().months().subtract(getMillis(), months);
		return withMillis(instant);
	}

	public org.joda.time.DateTime minusWeeks(int weeks) {
		if (weeks == 0) {
			return org.joda.time.DateTime.this;
		}
		long instant = getChronology().weeks().subtract(getMillis(), weeks);
		return withMillis(instant);
	}

	public org.joda.time.DateTime minusDays(int days) {
		if (days == 0) {
			return org.joda.time.DateTime.this;
		}
		long instant = getChronology().days().subtract(getMillis(), days);
		return withMillis(instant);
	}

	public org.joda.time.DateTime minusHours(int hours) {
		if (hours == 0) {
			return org.joda.time.DateTime.this;
		}
		long instant = getChronology().hours().subtract(getMillis(), hours);
		return withMillis(instant);
	}

	public org.joda.time.DateTime minusMinutes(int minutes) {
		if (minutes == 0) {
			return org.joda.time.DateTime.this;
		}
		long instant = getChronology().minutes().subtract(getMillis(), minutes);
		return withMillis(instant);
	}

	public org.joda.time.DateTime minusSeconds(int seconds) {
		if (seconds == 0) {
			return org.joda.time.DateTime.this;
		}
		long instant = getChronology().seconds().subtract(getMillis(), seconds);
		return withMillis(instant);
	}

	public org.joda.time.DateTime minusMillis(int millis) {
		if (millis == 0) {
			return org.joda.time.DateTime.this;
		}
		long instant = getChronology().millis().subtract(getMillis(), millis);
		return withMillis(instant);
	}

	public org.joda.time.DateTime.Property property(org.joda.time.DateTimeFieldType type) {
		if (type == null) {
			throw new java.lang.IllegalArgumentException("The DateTimeFieldType must not be null");
		}
		org.joda.time.DateTimeField field = type.getField(getChronology());
		if ((field.isSupported()) == false) {
			throw new java.lang.IllegalArgumentException((("Field '" + type) + "' is not supported"));
		}
		return new org.joda.time.DateTime.Property(org.joda.time.DateTime.this, field);
	}

	public org.joda.time.DateMidnight toDateMidnight() {
		return new org.joda.time.DateMidnight(getMillis(), getChronology());
	}

	public org.joda.time.YearMonthDay toYearMonthDay() {
		return new org.joda.time.YearMonthDay(getMillis(), getChronology());
	}

	public org.joda.time.TimeOfDay toTimeOfDay() {
		return new org.joda.time.TimeOfDay(getMillis(), getChronology());
	}

	public org.joda.time.LocalDateTime toLocalDateTime() {
		return new org.joda.time.LocalDateTime(getMillis(), getChronology());
	}

	public org.joda.time.LocalDate toLocalDate() {
		return new org.joda.time.LocalDate(getMillis(), getChronology());
	}

	public org.joda.time.LocalTime toLocalTime() {
		return new org.joda.time.LocalTime(getMillis(), getChronology());
	}

	public org.joda.time.DateTime withEra(int era) {
		return withMillis(getChronology().era().set(getMillis(), era));
	}

	public org.joda.time.DateTime withCenturyOfEra(int centuryOfEra) {
		return withMillis(getChronology().centuryOfEra().set(getMillis(), centuryOfEra));
	}

	public org.joda.time.DateTime withYearOfEra(int yearOfEra) {
		return withMillis(getChronology().yearOfEra().set(getMillis(), yearOfEra));
	}

	public org.joda.time.DateTime withYearOfCentury(int yearOfCentury) {
		return withMillis(getChronology().yearOfCentury().set(getMillis(), yearOfCentury));
	}

	public org.joda.time.DateTime withYear(int year) {
		return withMillis(getChronology().year().set(getMillis(), year));
	}

	public org.joda.time.DateTime withWeekyear(int weekyear) {
		return withMillis(getChronology().weekyear().set(getMillis(), weekyear));
	}

	public org.joda.time.DateTime withMonthOfYear(int monthOfYear) {
		return withMillis(getChronology().monthOfYear().set(getMillis(), monthOfYear));
	}

	public org.joda.time.DateTime withWeekOfWeekyear(int weekOfWeekyear) {
		return withMillis(getChronology().weekOfWeekyear().set(getMillis(), weekOfWeekyear));
	}

	public org.joda.time.DateTime withDayOfYear(int dayOfYear) {
		return withMillis(getChronology().dayOfYear().set(getMillis(), dayOfYear));
	}

	public org.joda.time.DateTime withDayOfMonth(int dayOfMonth) {
		return withMillis(getChronology().dayOfMonth().set(getMillis(), dayOfMonth));
	}

	public org.joda.time.DateTime withDayOfWeek(int dayOfWeek) {
		return withMillis(getChronology().dayOfWeek().set(getMillis(), dayOfWeek));
	}

	public org.joda.time.DateTime withHourOfDay(int hour) {
		return withMillis(getChronology().hourOfDay().set(getMillis(), hour));
	}

	public org.joda.time.DateTime withMinuteOfHour(int minute) {
		return withMillis(getChronology().minuteOfHour().set(getMillis(), minute));
	}

	public org.joda.time.DateTime withSecondOfMinute(int second) {
		return withMillis(getChronology().secondOfMinute().set(getMillis(), second));
	}

	public org.joda.time.DateTime withMillisOfSecond(int millis) {
		return withMillis(getChronology().millisOfSecond().set(getMillis(), millis));
	}

	public org.joda.time.DateTime withMillisOfDay(int millis) {
		return withMillis(getChronology().millisOfDay().set(getMillis(), millis));
	}

	public org.joda.time.DateTime.Property era() {
		return new org.joda.time.DateTime.Property(org.joda.time.DateTime.this, getChronology().era());
	}

	public org.joda.time.DateTime.Property centuryOfEra() {
		return new org.joda.time.DateTime.Property(org.joda.time.DateTime.this, getChronology().centuryOfEra());
	}

	public org.joda.time.DateTime.Property yearOfCentury() {
		return new org.joda.time.DateTime.Property(org.joda.time.DateTime.this, getChronology().yearOfCentury());
	}

	public org.joda.time.DateTime.Property yearOfEra() {
		return new org.joda.time.DateTime.Property(org.joda.time.DateTime.this, getChronology().yearOfEra());
	}

	public org.joda.time.DateTime.Property year() {
		return new org.joda.time.DateTime.Property(org.joda.time.DateTime.this, getChronology().year());
	}

	public org.joda.time.DateTime.Property weekyear() {
		return new org.joda.time.DateTime.Property(org.joda.time.DateTime.this, getChronology().weekyear());
	}

	public org.joda.time.DateTime.Property monthOfYear() {
		return new org.joda.time.DateTime.Property(org.joda.time.DateTime.this, getChronology().monthOfYear());
	}

	public org.joda.time.DateTime.Property weekOfWeekyear() {
		return new org.joda.time.DateTime.Property(org.joda.time.DateTime.this, getChronology().weekOfWeekyear());
	}

	public org.joda.time.DateTime.Property dayOfYear() {
		return new org.joda.time.DateTime.Property(org.joda.time.DateTime.this, getChronology().dayOfYear());
	}

	public org.joda.time.DateTime.Property dayOfMonth() {
		return new org.joda.time.DateTime.Property(org.joda.time.DateTime.this, getChronology().dayOfMonth());
	}

	public org.joda.time.DateTime.Property dayOfWeek() {
		return new org.joda.time.DateTime.Property(org.joda.time.DateTime.this, getChronology().dayOfWeek());
	}

	public org.joda.time.DateTime.Property hourOfDay() {
		return new org.joda.time.DateTime.Property(org.joda.time.DateTime.this, getChronology().hourOfDay());
	}

	public org.joda.time.DateTime.Property minuteOfDay() {
		return new org.joda.time.DateTime.Property(org.joda.time.DateTime.this, getChronology().minuteOfDay());
	}

	public org.joda.time.DateTime.Property minuteOfHour() {
		return new org.joda.time.DateTime.Property(org.joda.time.DateTime.this, getChronology().minuteOfHour());
	}

	public org.joda.time.DateTime.Property secondOfDay() {
		return new org.joda.time.DateTime.Property(org.joda.time.DateTime.this, getChronology().secondOfDay());
	}

	public org.joda.time.DateTime.Property secondOfMinute() {
		return new org.joda.time.DateTime.Property(org.joda.time.DateTime.this, getChronology().secondOfMinute());
	}

	public org.joda.time.DateTime.Property millisOfDay() {
		return new org.joda.time.DateTime.Property(org.joda.time.DateTime.this, getChronology().millisOfDay());
	}

	public org.joda.time.DateTime.Property millisOfSecond() {
		return new org.joda.time.DateTime.Property(org.joda.time.DateTime.this, getChronology().millisOfSecond());
	}

	public static final class Property extends org.joda.time.field.AbstractReadableInstantFieldProperty {
		private static final long serialVersionUID = -6983323811635733510L;

		private org.joda.time.DateTime iInstant;

		private org.joda.time.DateTimeField iField;

		Property(org.joda.time.DateTime instant, org.joda.time.DateTimeField field) {
			super();
			iInstant = instant;
			iField = field;
		}

		private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException {
			oos.writeObject(iInstant);
			oos.writeObject(iField.getType());
		}

		private void readObject(java.io.ObjectInputStream oos) throws java.io.IOException, java.lang.ClassNotFoundException {
			iInstant = ((org.joda.time.DateTime) (oos.readObject()));
			org.joda.time.DateTimeFieldType type = ((org.joda.time.DateTimeFieldType) (oos.readObject()));
			iField = type.getField(iInstant.getChronology());
		}

		public org.joda.time.DateTimeField getField() {
			return iField;
		}

		protected long getMillis() {
			return iInstant.getMillis();
		}

		protected org.joda.time.Chronology getChronology() {
			return iInstant.getChronology();
		}

		public org.joda.time.DateTime getDateTime() {
			return iInstant;
		}

		public org.joda.time.DateTime addToCopy(int value) {
			return iInstant.withMillis(iField.add(iInstant.getMillis(), value));
		}

		public org.joda.time.DateTime addToCopy(long value) {
			return iInstant.withMillis(iField.add(iInstant.getMillis(), value));
		}

		public org.joda.time.DateTime addWrapFieldToCopy(int value) {
			return iInstant.withMillis(iField.addWrapField(iInstant.getMillis(), value));
		}

		public org.joda.time.DateTime setCopy(int value) {
			return iInstant.withMillis(iField.set(iInstant.getMillis(), value));
		}

		public org.joda.time.DateTime setCopy(java.lang.String text, java.util.Locale locale) {
			return iInstant.withMillis(iField.set(iInstant.getMillis(), text, locale));
		}

		public org.joda.time.DateTime setCopy(java.lang.String text) {
			return setCopy(text, null);
		}

		public org.joda.time.DateTime withMaximumValue() {
			return setCopy(getMaximumValue());
		}

		public org.joda.time.DateTime withMinimumValue() {
			return setCopy(getMinimumValue());
		}

		public org.joda.time.DateTime roundFloorCopy() {
			return iInstant.withMillis(iField.roundFloor(iInstant.getMillis()));
		}

		public org.joda.time.DateTime roundCeilingCopy() {
			return iInstant.withMillis(iField.roundCeiling(iInstant.getMillis()));
		}

		public org.joda.time.DateTime roundHalfFloorCopy() {
			return iInstant.withMillis(iField.roundHalfFloor(iInstant.getMillis()));
		}

		public org.joda.time.DateTime roundHalfCeilingCopy() {
			return iInstant.withMillis(iField.roundHalfCeiling(iInstant.getMillis()));
		}

		public org.joda.time.DateTime roundHalfEvenCopy() {
			return iInstant.withMillis(iField.roundHalfEven(iInstant.getMillis()));
		}
	}
}


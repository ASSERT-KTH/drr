

package org.joda.time;


public final class DateMidnight extends org.joda.time.base.BaseDateTime implements java.io.Serializable , org.joda.time.ReadableDateTime {
	private static final long serialVersionUID = 156371964018738L;

	public DateMidnight() {
		super();
	}

	public DateMidnight(org.joda.time.DateTimeZone zone) {
		super(zone);
	}

	public DateMidnight(org.joda.time.Chronology chronology) {
		super(chronology);
	}

	public DateMidnight(long instant) {
		super(instant);
	}

	public DateMidnight(long instant, org.joda.time.DateTimeZone zone) {
		super(instant, zone);
	}

	public DateMidnight(long instant, org.joda.time.Chronology chronology) {
		super(instant, chronology);
	}

	public DateMidnight(java.lang.Object instant) {
		super(instant, ((org.joda.time.Chronology) (null)));
	}

	public DateMidnight(java.lang.Object instant, org.joda.time.DateTimeZone zone) {
		super(instant, zone);
	}

	public DateMidnight(java.lang.Object instant, org.joda.time.Chronology chronology) {
		super(instant, org.joda.time.DateTimeUtils.getChronology(chronology));
	}

	public DateMidnight(int year, int monthOfYear, int dayOfMonth) {
		super(year, monthOfYear, dayOfMonth, 0, 0, 0, 0);
	}

	public DateMidnight(int year, int monthOfYear, int dayOfMonth, org.joda.time.DateTimeZone zone) {
		super(year, monthOfYear, dayOfMonth, 0, 0, 0, 0, zone);
	}

	public DateMidnight(int year, int monthOfYear, int dayOfMonth, org.joda.time.Chronology chronology) {
		super(year, monthOfYear, dayOfMonth, 0, 0, 0, 0, chronology);
	}

	protected long checkInstant(long instant, org.joda.time.Chronology chronology) {
		return chronology.dayOfMonth().roundFloor(instant);
	}

	public org.joda.time.DateMidnight withMillis(long newMillis) {
		org.joda.time.Chronology chrono = getChronology();
		newMillis = checkInstant(newMillis, chrono);
		return newMillis == (getMillis()) ? org.joda.time.DateMidnight.this : new org.joda.time.DateMidnight(newMillis, chrono);
	}

	public org.joda.time.DateMidnight withChronology(org.joda.time.Chronology newChronology) {
		return newChronology == (getChronology()) ? org.joda.time.DateMidnight.this : new org.joda.time.DateMidnight(getMillis(), newChronology);
	}

	public org.joda.time.DateMidnight withZoneRetainFields(org.joda.time.DateTimeZone newZone) {
		newZone = org.joda.time.DateTimeUtils.getZone(newZone);
		org.joda.time.DateTimeZone originalZone = org.joda.time.DateTimeUtils.getZone(getZone());
		if (newZone == originalZone) {
			return org.joda.time.DateMidnight.this;
		}
		long millis = originalZone.getMillisKeepLocal(newZone, getMillis());
		return new org.joda.time.DateMidnight(millis, getChronology().withZone(newZone));
	}

	public org.joda.time.DateMidnight withFields(org.joda.time.ReadablePartial partial) {
		if (partial == null) {
			return org.joda.time.DateMidnight.this;
		}
		return withMillis(getChronology().set(partial, getMillis()));
	}

	public org.joda.time.DateMidnight withField(org.joda.time.DateTimeFieldType fieldType, int value) {
		if (fieldType == null) {
			throw new java.lang.IllegalArgumentException("Field must not be null");
		}
		long instant = fieldType.getField(getChronology()).set(getMillis(), value);
		return withMillis(instant);
	}

	public org.joda.time.DateMidnight withFieldAdded(org.joda.time.DurationFieldType fieldType, int amount) {
		if (fieldType == null) {
			throw new java.lang.IllegalArgumentException("Field must not be null");
		}
		if (amount == 0) {
			return org.joda.time.DateMidnight.this;
		}
		long instant = fieldType.getField(getChronology()).add(getMillis(), amount);
		return withMillis(instant);
	}

	public org.joda.time.DateMidnight withDurationAdded(long durationToAdd, int scalar) {
		if ((durationToAdd == 0) || (scalar == 0)) {
			return org.joda.time.DateMidnight.this;
		}
		long instant = getChronology().add(getMillis(), durationToAdd, scalar);
		return withMillis(instant);
	}

	public org.joda.time.DateMidnight withDurationAdded(org.joda.time.ReadableDuration durationToAdd, int scalar) {
		if ((durationToAdd == null) || (scalar == 0)) {
			return org.joda.time.DateMidnight.this;
		}
		return withDurationAdded(durationToAdd.getMillis(), scalar);
	}

	public org.joda.time.DateMidnight withPeriodAdded(org.joda.time.ReadablePeriod period, int scalar) {
		if ((period == null) || (scalar == 0)) {
			return org.joda.time.DateMidnight.this;
		}
		long instant = getChronology().add(period, getMillis(), scalar);
		return withMillis(instant);
	}

	public org.joda.time.DateMidnight plus(long duration) {
		return withDurationAdded(duration, 1);
	}

	public org.joda.time.DateMidnight plus(org.joda.time.ReadableDuration duration) {
		return withDurationAdded(duration, 1);
	}

	public org.joda.time.DateMidnight plus(org.joda.time.ReadablePeriod period) {
		return withPeriodAdded(period, 1);
	}

	public org.joda.time.DateMidnight plusYears(int years) {
		if (years == 0) {
			return org.joda.time.DateMidnight.this;
		}
		long instant = getChronology().years().add(getMillis(), years);
		return withMillis(instant);
	}

	public org.joda.time.DateMidnight plusMonths(int months) {
		if (months == 0) {
			return org.joda.time.DateMidnight.this;
		}
		long instant = getChronology().months().add(getMillis(), months);
		return withMillis(instant);
	}

	public org.joda.time.DateMidnight plusWeeks(int weeks) {
		if (weeks == 0) {
			return org.joda.time.DateMidnight.this;
		}
		long instant = getChronology().weeks().add(getMillis(), weeks);
		return withMillis(instant);
	}

	public org.joda.time.DateMidnight plusDays(int days) {
		if (days == 0) {
			return org.joda.time.DateMidnight.this;
		}
		long instant = getChronology().days().add(getMillis(), days);
		return withMillis(instant);
	}

	public org.joda.time.DateMidnight minus(long duration) {
		return withDurationAdded(duration, (-1));
	}

	public org.joda.time.DateMidnight minus(org.joda.time.ReadableDuration duration) {
		return withDurationAdded(duration, (-1));
	}

	public org.joda.time.DateMidnight minus(org.joda.time.ReadablePeriod period) {
		return withPeriodAdded(period, (-1));
	}

	public org.joda.time.DateMidnight minusYears(int years) {
		if (years == 0) {
			return org.joda.time.DateMidnight.this;
		}
		long instant = getChronology().years().subtract(getMillis(), years);
		return withMillis(instant);
	}

	public org.joda.time.DateMidnight minusMonths(int months) {
		if (months == 0) {
			return org.joda.time.DateMidnight.this;
		}
		long instant = getChronology().months().subtract(getMillis(), months);
		return withMillis(instant);
	}

	public org.joda.time.DateMidnight minusWeeks(int weeks) {
		if (weeks == 0) {
			return org.joda.time.DateMidnight.this;
		}
		long instant = getChronology().weeks().subtract(getMillis(), weeks);
		return withMillis(instant);
	}

	public org.joda.time.DateMidnight minusDays(int days) {
		if (days == 0) {
			return org.joda.time.DateMidnight.this;
		}
		long instant = getChronology().days().subtract(getMillis(), days);
		return withMillis(instant);
	}

	public org.joda.time.DateMidnight.Property property(org.joda.time.DateTimeFieldType type) {
		if (type == null) {
			throw new java.lang.IllegalArgumentException("The DateTimeFieldType must not be null");
		}
		org.joda.time.DateTimeField field = type.getField(getChronology());
		if ((field.isSupported()) == false) {
			throw new java.lang.IllegalArgumentException((("Field '" + type) + "' is not supported"));
		}
		return new org.joda.time.DateMidnight.Property(org.joda.time.DateMidnight.this, field);
	}

	public org.joda.time.YearMonthDay toYearMonthDay() {
		return new org.joda.time.YearMonthDay(getMillis(), getChronology());
	}

	public org.joda.time.LocalDate toLocalDate() {
		return new org.joda.time.LocalDate(getMillis(), getChronology());
	}

	public org.joda.time.Interval toInterval() {
		org.joda.time.Chronology chrono = getChronology();
		long start = getMillis();
		long end = org.joda.time.DurationFieldType.days().getField(chrono).add(start, 1);
		return new org.joda.time.Interval(start, end, chrono);
	}

	public org.joda.time.DateMidnight withEra(int era) {
		return withMillis(getChronology().era().set(getMillis(), era));
	}

	public org.joda.time.DateMidnight withCenturyOfEra(int centuryOfEra) {
		return withMillis(getChronology().centuryOfEra().set(getMillis(), centuryOfEra));
	}

	public org.joda.time.DateMidnight withYearOfEra(int yearOfEra) {
		return withMillis(getChronology().yearOfEra().set(getMillis(), yearOfEra));
	}

	public org.joda.time.DateMidnight withYearOfCentury(int yearOfCentury) {
		return withMillis(getChronology().yearOfCentury().set(getMillis(), yearOfCentury));
	}

	public org.joda.time.DateMidnight withYear(int year) {
		return withMillis(getChronology().year().set(getMillis(), year));
	}

	public org.joda.time.DateMidnight withWeekyear(int weekyear) {
		return withMillis(getChronology().weekyear().set(getMillis(), weekyear));
	}

	public org.joda.time.DateMidnight withMonthOfYear(int monthOfYear) {
		return withMillis(getChronology().monthOfYear().set(getMillis(), monthOfYear));
	}

	public org.joda.time.DateMidnight withWeekOfWeekyear(int weekOfWeekyear) {
		return withMillis(getChronology().weekOfWeekyear().set(getMillis(), weekOfWeekyear));
	}

	public org.joda.time.DateMidnight withDayOfYear(int dayOfYear) {
		return withMillis(getChronology().dayOfYear().set(getMillis(), dayOfYear));
	}

	public org.joda.time.DateMidnight withDayOfMonth(int dayOfMonth) {
		return withMillis(getChronology().dayOfMonth().set(getMillis(), dayOfMonth));
	}

	public org.joda.time.DateMidnight withDayOfWeek(int dayOfWeek) {
		return withMillis(getChronology().dayOfWeek().set(getMillis(), dayOfWeek));
	}

	public org.joda.time.DateMidnight.Property era() {
		return new org.joda.time.DateMidnight.Property(org.joda.time.DateMidnight.this, getChronology().era());
	}

	public org.joda.time.DateMidnight.Property centuryOfEra() {
		return new org.joda.time.DateMidnight.Property(org.joda.time.DateMidnight.this, getChronology().centuryOfEra());
	}

	public org.joda.time.DateMidnight.Property yearOfCentury() {
		return new org.joda.time.DateMidnight.Property(org.joda.time.DateMidnight.this, getChronology().yearOfCentury());
	}

	public org.joda.time.DateMidnight.Property yearOfEra() {
		return new org.joda.time.DateMidnight.Property(org.joda.time.DateMidnight.this, getChronology().yearOfEra());
	}

	public org.joda.time.DateMidnight.Property year() {
		return new org.joda.time.DateMidnight.Property(org.joda.time.DateMidnight.this, getChronology().year());
	}

	public org.joda.time.DateMidnight.Property weekyear() {
		return new org.joda.time.DateMidnight.Property(org.joda.time.DateMidnight.this, getChronology().weekyear());
	}

	public org.joda.time.DateMidnight.Property monthOfYear() {
		return new org.joda.time.DateMidnight.Property(org.joda.time.DateMidnight.this, getChronology().monthOfYear());
	}

	public org.joda.time.DateMidnight.Property weekOfWeekyear() {
		return new org.joda.time.DateMidnight.Property(org.joda.time.DateMidnight.this, getChronology().weekOfWeekyear());
	}

	public org.joda.time.DateMidnight.Property dayOfYear() {
		return new org.joda.time.DateMidnight.Property(org.joda.time.DateMidnight.this, getChronology().dayOfYear());
	}

	public org.joda.time.DateMidnight.Property dayOfMonth() {
		return new org.joda.time.DateMidnight.Property(org.joda.time.DateMidnight.this, getChronology().dayOfMonth());
	}

	public org.joda.time.DateMidnight.Property dayOfWeek() {
		return new org.joda.time.DateMidnight.Property(org.joda.time.DateMidnight.this, getChronology().dayOfWeek());
	}

	public static final class Property extends org.joda.time.field.AbstractReadableInstantFieldProperty {
		private static final long serialVersionUID = 257629620L;

		private org.joda.time.DateMidnight iInstant;

		private org.joda.time.DateTimeField iField;

		Property(org.joda.time.DateMidnight instant, org.joda.time.DateTimeField field) {
			super();
			iInstant = instant;
			iField = field;
		}

		private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException {
			oos.writeObject(iInstant);
			oos.writeObject(iField.getType());
		}

		private void readObject(java.io.ObjectInputStream oos) throws java.io.IOException, java.lang.ClassNotFoundException {
			iInstant = ((org.joda.time.DateMidnight) (oos.readObject()));
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

		public org.joda.time.DateMidnight getDateMidnight() {
			return iInstant;
		}

		public org.joda.time.DateMidnight addToCopy(int value) {
			return iInstant.withMillis(iField.add(iInstant.getMillis(), value));
		}

		public org.joda.time.DateMidnight addToCopy(long value) {
			return iInstant.withMillis(iField.add(iInstant.getMillis(), value));
		}

		public org.joda.time.DateMidnight addWrapFieldToCopy(int value) {
			return iInstant.withMillis(iField.addWrapField(iInstant.getMillis(), value));
		}

		public org.joda.time.DateMidnight setCopy(int value) {
			return iInstant.withMillis(iField.set(iInstant.getMillis(), value));
		}

		public org.joda.time.DateMidnight setCopy(java.lang.String text, java.util.Locale locale) {
			return iInstant.withMillis(iField.set(iInstant.getMillis(), text, locale));
		}

		public org.joda.time.DateMidnight setCopy(java.lang.String text) {
			return setCopy(text, null);
		}

		public org.joda.time.DateMidnight withMaximumValue() {
			return setCopy(getMaximumValue());
		}

		public org.joda.time.DateMidnight withMinimumValue() {
			return setCopy(getMinimumValue());
		}

		public org.joda.time.DateMidnight roundFloorCopy() {
			return iInstant.withMillis(iField.roundFloor(iInstant.getMillis()));
		}

		public org.joda.time.DateMidnight roundCeilingCopy() {
			return iInstant.withMillis(iField.roundCeiling(iInstant.getMillis()));
		}

		public org.joda.time.DateMidnight roundHalfFloorCopy() {
			return iInstant.withMillis(iField.roundHalfFloor(iInstant.getMillis()));
		}

		public org.joda.time.DateMidnight roundHalfCeilingCopy() {
			return iInstant.withMillis(iField.roundHalfCeiling(iInstant.getMillis()));
		}

		public org.joda.time.DateMidnight roundHalfEvenCopy() {
			return iInstant.withMillis(iField.roundHalfEven(iInstant.getMillis()));
		}
	}
}


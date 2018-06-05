

package org.joda.time;


public class MutableDateTime extends org.joda.time.base.BaseDateTime implements java.io.Serializable , java.lang.Cloneable , org.joda.time.ReadWritableDateTime {
	private static final long serialVersionUID = 2852608688135209575L;

	public static final int ROUND_NONE = 0;

	public static final int ROUND_FLOOR = 1;

	public static final int ROUND_CEILING = 2;

	public static final int ROUND_HALF_FLOOR = 3;

	public static final int ROUND_HALF_CEILING = 4;

	public static final int ROUND_HALF_EVEN = 5;

	private org.joda.time.DateTimeField iRoundingField;

	private int iRoundingMode;

	public static org.joda.time.MutableDateTime now() {
		return new org.joda.time.MutableDateTime();
	}

	public static org.joda.time.MutableDateTime now(org.joda.time.DateTimeZone zone) {
		if (zone == null) {
			throw new java.lang.NullPointerException("Zone must not be null");
		}
		return new org.joda.time.MutableDateTime(zone);
	}

	public static org.joda.time.MutableDateTime now(org.joda.time.Chronology chronology) {
		if (chronology == null) {
			throw new java.lang.NullPointerException("Chronology must not be null");
		}
		return new org.joda.time.MutableDateTime(chronology);
	}

	@org.joda.convert.FromString
	public static org.joda.time.MutableDateTime parse(java.lang.String str) {
		return org.joda.time.MutableDateTime.parse(str, org.joda.time.format.ISODateTimeFormat.dateTimeParser().withOffsetParsed());
	}

	public static org.joda.time.MutableDateTime parse(java.lang.String str, org.joda.time.format.DateTimeFormatter formatter) {
		return formatter.parseDateTime(str).toMutableDateTime();
	}

	public MutableDateTime() {
		super();
	}

	public MutableDateTime(org.joda.time.DateTimeZone zone) {
		super(zone);
	}

	public MutableDateTime(org.joda.time.Chronology chronology) {
		super(chronology);
	}

	public MutableDateTime(long instant) {
		super(instant);
	}

	public MutableDateTime(long instant, org.joda.time.DateTimeZone zone) {
		super(instant, zone);
	}

	public MutableDateTime(long instant, org.joda.time.Chronology chronology) {
		super(instant, chronology);
	}

	public MutableDateTime(java.lang.Object instant) {
		super(instant, ((org.joda.time.Chronology) (null)));
	}

	public MutableDateTime(java.lang.Object instant, org.joda.time.DateTimeZone zone) {
		super(instant, zone);
	}

	public MutableDateTime(java.lang.Object instant, org.joda.time.Chronology chronology) {
		super(instant, org.joda.time.DateTimeUtils.getChronology(chronology));
	}

	public MutableDateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) {
		super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
	}

	public MutableDateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond, org.joda.time.DateTimeZone zone) {
		super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, zone);
	}

	public MutableDateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond, org.joda.time.Chronology chronology) {
		super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, chronology);
	}

	public org.joda.time.DateTimeField getRoundingField() {
		return iRoundingField;
	}

	public int getRoundingMode() {
		return iRoundingMode;
	}

	public void setRounding(org.joda.time.DateTimeField field) {
		setRounding(field, org.joda.time.MutableDateTime.ROUND_FLOOR);
	}

	public void setRounding(org.joda.time.DateTimeField field, int mode) {
		if ((field != null) && ((mode < (org.joda.time.MutableDateTime.ROUND_NONE)) || (mode > (org.joda.time.MutableDateTime.ROUND_HALF_EVEN)))) {
			throw new java.lang.IllegalArgumentException(("Illegal rounding mode: " + mode));
		}
		iRoundingField = (mode == (org.joda.time.MutableDateTime.ROUND_NONE)) ? null : field;
		iRoundingMode = (field == null) ? org.joda.time.MutableDateTime.ROUND_NONE : mode;
		setMillis(getMillis());
	}

	public void setMillis(long instant) {
		switch (iRoundingMode) {
			case org.joda.time.MutableDateTime.ROUND_NONE :
				break;
			case org.joda.time.MutableDateTime.ROUND_FLOOR :
				instant = iRoundingField.roundFloor(instant);
				break;
			case org.joda.time.MutableDateTime.ROUND_CEILING :
				instant = iRoundingField.roundCeiling(instant);
				break;
			case org.joda.time.MutableDateTime.ROUND_HALF_FLOOR :
				instant = iRoundingField.roundHalfFloor(instant);
				break;
			case org.joda.time.MutableDateTime.ROUND_HALF_CEILING :
				instant = iRoundingField.roundHalfCeiling(instant);
				break;
			case org.joda.time.MutableDateTime.ROUND_HALF_EVEN :
				instant = iRoundingField.roundHalfEven(instant);
				break;
		}
		super.setMillis(instant);
	}

	public void setMillis(org.joda.time.ReadableInstant instant) {
		long instantMillis = org.joda.time.DateTimeUtils.getInstantMillis(instant);
		setMillis(instantMillis);
	}

	public void add(long duration) {
		setMillis(org.joda.time.field.FieldUtils.safeAdd(getMillis(), duration));
	}

	public void add(org.joda.time.ReadableDuration duration) {
		add(duration, 1);
	}

	public void add(org.joda.time.ReadableDuration duration, int scalar) {
		if (duration != null) {
			add(org.joda.time.field.FieldUtils.safeMultiply(duration.getMillis(), scalar));
		}
	}

	public void add(org.joda.time.ReadablePeriod period) {
		add(period, 1);
	}

	public void add(org.joda.time.ReadablePeriod period, int scalar) {
		if (period != null) {
			setMillis(getChronology().add(period, getMillis(), scalar));
		}
	}

	public void setChronology(org.joda.time.Chronology chronology) {
		super.setChronology(chronology);
	}

	public void setZone(org.joda.time.DateTimeZone newZone) {
		newZone = org.joda.time.DateTimeUtils.getZone(newZone);
		org.joda.time.Chronology chrono = getChronology();
		if ((chrono.getZone()) != newZone) {
			setChronology(chrono.withZone(newZone));
		}
	}

	public void setZoneRetainFields(org.joda.time.DateTimeZone newZone) {
		newZone = org.joda.time.DateTimeUtils.getZone(newZone);
		org.joda.time.DateTimeZone originalZone = org.joda.time.DateTimeUtils.getZone(getZone());
		if (newZone == originalZone) {
			return ;
		}
		long millis = originalZone.getMillisKeepLocal(newZone, getMillis());
		setChronology(getChronology().withZone(newZone));
		setMillis(millis);
	}

	public void set(org.joda.time.DateTimeFieldType type, int value) {
		if (type == null) {
			throw new java.lang.IllegalArgumentException("Field must not be null");
		}
		setMillis(type.getField(getChronology()).set(getMillis(), value));
	}

	public void add(org.joda.time.DurationFieldType type, int amount) {
		if (type == null) {
			throw new java.lang.IllegalArgumentException("Field must not be null");
		}
		setMillis(type.getField(getChronology()).add(getMillis(), amount));
	}

	public void setYear(final int year) {
		setMillis(getChronology().year().set(getMillis(), year));
	}

	public void addYears(final int years) {
		setMillis(getChronology().years().add(getMillis(), years));
	}

	public void setWeekyear(final int weekyear) {
		setMillis(getChronology().weekyear().set(getMillis(), weekyear));
	}

	public void addWeekyears(final int weekyears) {
		setMillis(getChronology().weekyears().add(getMillis(), weekyears));
	}

	public void setMonthOfYear(final int monthOfYear) {
		setMillis(getChronology().monthOfYear().set(getMillis(), monthOfYear));
	}

	public void addMonths(final int months) {
		setMillis(getChronology().months().add(getMillis(), months));
	}

	public void setWeekOfWeekyear(final int weekOfWeekyear) {
		setMillis(getChronology().weekOfWeekyear().set(getMillis(), weekOfWeekyear));
	}

	public void addWeeks(final int weeks) {
		setMillis(getChronology().weeks().add(getMillis(), weeks));
	}

	public void setDayOfYear(final int dayOfYear) {
		setMillis(getChronology().dayOfYear().set(getMillis(), dayOfYear));
	}

	public void setDayOfMonth(final int dayOfMonth) {
		setMillis(getChronology().dayOfMonth().set(getMillis(), dayOfMonth));
	}

	public void setDayOfWeek(final int dayOfWeek) {
		setMillis(getChronology().dayOfWeek().set(getMillis(), dayOfWeek));
	}

	public void addDays(final int days) {
		setMillis(getChronology().days().add(getMillis(), days));
	}

	public void setHourOfDay(final int hourOfDay) {
		setMillis(getChronology().hourOfDay().set(getMillis(), hourOfDay));
	}

	public void addHours(final int hours) {
		setMillis(getChronology().hours().add(getMillis(), hours));
	}

	public void setMinuteOfDay(final int minuteOfDay) {
		setMillis(getChronology().minuteOfDay().set(getMillis(), minuteOfDay));
	}

	public void setMinuteOfHour(final int minuteOfHour) {
		setMillis(getChronology().minuteOfHour().set(getMillis(), minuteOfHour));
	}

	public void addMinutes(final int minutes) {
		setMillis(getChronology().minutes().add(getMillis(), minutes));
	}

	public void setSecondOfDay(final int secondOfDay) {
		setMillis(getChronology().secondOfDay().set(getMillis(), secondOfDay));
	}

	public void setSecondOfMinute(final int secondOfMinute) {
		setMillis(getChronology().secondOfMinute().set(getMillis(), secondOfMinute));
	}

	public void addSeconds(final int seconds) {
		setMillis(getChronology().seconds().add(getMillis(), seconds));
	}

	public void setMillisOfDay(final int millisOfDay) {
		setMillis(getChronology().millisOfDay().set(getMillis(), millisOfDay));
	}

	public void setMillisOfSecond(final int millisOfSecond) {
		setMillis(getChronology().millisOfSecond().set(getMillis(), millisOfSecond));
	}

	public void addMillis(final int millis) {
		setMillis(getChronology().millis().add(getMillis(), millis));
	}

	public void setDate(final long instant) {
		setMillis(getChronology().millisOfDay().set(instant, getMillisOfDay()));
	}

	public void setDate(final org.joda.time.ReadableInstant instant) {
		long instantMillis = org.joda.time.DateTimeUtils.getInstantMillis(instant);
		org.joda.time.Chronology instantChrono = org.joda.time.DateTimeUtils.getInstantChronology(instant);
		org.joda.time.DateTimeZone zone = instantChrono.getZone();
		if (zone != null) {
			instantMillis = zone.getMillisKeepLocal(org.joda.time.DateTimeZone.UTC, instantMillis);
		}
		setDate(instantMillis);
	}

	public void setDate(final int year, final int monthOfYear, final int dayOfMonth) {
		org.joda.time.Chronology c = getChronology();
		long instantMidnight = c.getDateTimeMillis(year, monthOfYear, dayOfMonth, 0);
		setDate(instantMidnight);
	}

	public void setTime(final long millis) {
		int millisOfDay = org.joda.time.chrono.ISOChronology.getInstanceUTC().millisOfDay().get(millis);
		setMillis(getChronology().millisOfDay().set(getMillis(), millisOfDay));
	}

	public void setTime(final org.joda.time.ReadableInstant instant) {
		long instantMillis = org.joda.time.DateTimeUtils.getInstantMillis(instant);
		org.joda.time.Chronology instantChrono = org.joda.time.DateTimeUtils.getInstantChronology(instant);
		org.joda.time.DateTimeZone zone = instantChrono.getZone();
		if (zone != null) {
			instantMillis = zone.getMillisKeepLocal(org.joda.time.DateTimeZone.UTC, instantMillis);
		}
		setTime(instantMillis);
	}

	public void setTime(final int hour, final int minuteOfHour, final int secondOfMinute, final int millisOfSecond) {
		long instant = getChronology().getDateTimeMillis(getMillis(), hour, minuteOfHour, secondOfMinute, millisOfSecond);
		setMillis(instant);
	}

	public void setDateTime(final int year, final int monthOfYear, final int dayOfMonth, final int hourOfDay, final int minuteOfHour, final int secondOfMinute, final int millisOfSecond) {
		long instant = getChronology().getDateTimeMillis(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
		setMillis(instant);
	}

	public org.joda.time.MutableDateTime.Property property(org.joda.time.DateTimeFieldType type) {
		if (type == null) {
			throw new java.lang.IllegalArgumentException("The DateTimeFieldType must not be null");
		}
		org.joda.time.DateTimeField field = type.getField(getChronology());
		if ((field.isSupported()) == false) {
			throw new java.lang.IllegalArgumentException((("Field '" + type) + "' is not supported"));
		}
		return new org.joda.time.MutableDateTime.Property(org.joda.time.MutableDateTime.this, field);
	}

	public org.joda.time.MutableDateTime.Property era() {
		return new org.joda.time.MutableDateTime.Property(org.joda.time.MutableDateTime.this, getChronology().era());
	}

	public org.joda.time.MutableDateTime.Property centuryOfEra() {
		return new org.joda.time.MutableDateTime.Property(org.joda.time.MutableDateTime.this, getChronology().centuryOfEra());
	}

	public org.joda.time.MutableDateTime.Property yearOfCentury() {
		return new org.joda.time.MutableDateTime.Property(org.joda.time.MutableDateTime.this, getChronology().yearOfCentury());
	}

	public org.joda.time.MutableDateTime.Property yearOfEra() {
		return new org.joda.time.MutableDateTime.Property(org.joda.time.MutableDateTime.this, getChronology().yearOfEra());
	}

	public org.joda.time.MutableDateTime.Property year() {
		return new org.joda.time.MutableDateTime.Property(org.joda.time.MutableDateTime.this, getChronology().year());
	}

	public org.joda.time.MutableDateTime.Property weekyear() {
		return new org.joda.time.MutableDateTime.Property(org.joda.time.MutableDateTime.this, getChronology().weekyear());
	}

	public org.joda.time.MutableDateTime.Property monthOfYear() {
		return new org.joda.time.MutableDateTime.Property(org.joda.time.MutableDateTime.this, getChronology().monthOfYear());
	}

	public org.joda.time.MutableDateTime.Property weekOfWeekyear() {
		return new org.joda.time.MutableDateTime.Property(org.joda.time.MutableDateTime.this, getChronology().weekOfWeekyear());
	}

	public org.joda.time.MutableDateTime.Property dayOfYear() {
		return new org.joda.time.MutableDateTime.Property(org.joda.time.MutableDateTime.this, getChronology().dayOfYear());
	}

	public org.joda.time.MutableDateTime.Property dayOfMonth() {
		return new org.joda.time.MutableDateTime.Property(org.joda.time.MutableDateTime.this, getChronology().dayOfMonth());
	}

	public org.joda.time.MutableDateTime.Property dayOfWeek() {
		return new org.joda.time.MutableDateTime.Property(org.joda.time.MutableDateTime.this, getChronology().dayOfWeek());
	}

	public org.joda.time.MutableDateTime.Property hourOfDay() {
		return new org.joda.time.MutableDateTime.Property(org.joda.time.MutableDateTime.this, getChronology().hourOfDay());
	}

	public org.joda.time.MutableDateTime.Property minuteOfDay() {
		return new org.joda.time.MutableDateTime.Property(org.joda.time.MutableDateTime.this, getChronology().minuteOfDay());
	}

	public org.joda.time.MutableDateTime.Property minuteOfHour() {
		return new org.joda.time.MutableDateTime.Property(org.joda.time.MutableDateTime.this, getChronology().minuteOfHour());
	}

	public org.joda.time.MutableDateTime.Property secondOfDay() {
		return new org.joda.time.MutableDateTime.Property(org.joda.time.MutableDateTime.this, getChronology().secondOfDay());
	}

	public org.joda.time.MutableDateTime.Property secondOfMinute() {
		return new org.joda.time.MutableDateTime.Property(org.joda.time.MutableDateTime.this, getChronology().secondOfMinute());
	}

	public org.joda.time.MutableDateTime.Property millisOfDay() {
		return new org.joda.time.MutableDateTime.Property(org.joda.time.MutableDateTime.this, getChronology().millisOfDay());
	}

	public org.joda.time.MutableDateTime.Property millisOfSecond() {
		return new org.joda.time.MutableDateTime.Property(org.joda.time.MutableDateTime.this, getChronology().millisOfSecond());
	}

	public org.joda.time.MutableDateTime copy() {
		return ((org.joda.time.MutableDateTime) (clone()));
	}

	public java.lang.Object clone() {
		try {
			return super.clone();
		} catch (java.lang.CloneNotSupportedException ex) {
			throw new java.lang.InternalError("Clone error");
		}
	}

	@org.joda.convert.ToString
	public java.lang.String toString() {
		return org.joda.time.format.ISODateTimeFormat.dateTime().print(org.joda.time.MutableDateTime.this);
	}

	public static final class Property extends org.joda.time.field.AbstractReadableInstantFieldProperty {
		private static final long serialVersionUID = -4481126543819298617L;

		private org.joda.time.MutableDateTime iInstant;

		private org.joda.time.DateTimeField iField;

		Property(org.joda.time.MutableDateTime instant, org.joda.time.DateTimeField field) {
			super();
			iInstant = instant;
			iField = field;
		}

		private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException {
			oos.writeObject(iInstant);
			oos.writeObject(iField.getType());
		}

		private void readObject(java.io.ObjectInputStream oos) throws java.io.IOException, java.lang.ClassNotFoundException {
			iInstant = ((org.joda.time.MutableDateTime) (oos.readObject()));
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

		public org.joda.time.MutableDateTime getMutableDateTime() {
			return iInstant;
		}

		public org.joda.time.MutableDateTime add(int value) {
			iInstant.setMillis(getField().add(iInstant.getMillis(), value));
			return iInstant;
		}

		public org.joda.time.MutableDateTime add(long value) {
			iInstant.setMillis(getField().add(iInstant.getMillis(), value));
			return iInstant;
		}

		public org.joda.time.MutableDateTime addWrapField(int value) {
			iInstant.setMillis(getField().addWrapField(iInstant.getMillis(), value));
			return iInstant;
		}

		public org.joda.time.MutableDateTime set(int value) {
			iInstant.setMillis(getField().set(iInstant.getMillis(), value));
			return iInstant;
		}

		public org.joda.time.MutableDateTime set(java.lang.String text, java.util.Locale locale) {
			iInstant.setMillis(getField().set(iInstant.getMillis(), text, locale));
			return iInstant;
		}

		public org.joda.time.MutableDateTime set(java.lang.String text) {
			set(text, null);
			return iInstant;
		}

		public org.joda.time.MutableDateTime roundFloor() {
			iInstant.setMillis(getField().roundFloor(iInstant.getMillis()));
			return iInstant;
		}

		public org.joda.time.MutableDateTime roundCeiling() {
			iInstant.setMillis(getField().roundCeiling(iInstant.getMillis()));
			return iInstant;
		}

		public org.joda.time.MutableDateTime roundHalfFloor() {
			iInstant.setMillis(getField().roundHalfFloor(iInstant.getMillis()));
			return iInstant;
		}

		public org.joda.time.MutableDateTime roundHalfCeiling() {
			iInstant.setMillis(getField().roundHalfCeiling(iInstant.getMillis()));
			return iInstant;
		}

		public org.joda.time.MutableDateTime roundHalfEven() {
			iInstant.setMillis(getField().roundHalfEven(iInstant.getMillis()));
			return iInstant;
		}
	}
}


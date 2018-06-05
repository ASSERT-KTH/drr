

package org.joda.time;


public final class LocalDateTime extends org.joda.time.base.BaseLocal implements java.io.Serializable , org.joda.time.ReadablePartial {
	private static final long serialVersionUID = -268716875315837168L;

	private static final int YEAR = 0;

	private static final int MONTH_OF_YEAR = 1;

	private static final int DAY_OF_MONTH = 2;

	private static final int MILLIS_OF_DAY = 3;

	private final long iLocalMillis;

	private final org.joda.time.Chronology iChronology;

	public static org.joda.time.LocalDateTime now() {
		return new org.joda.time.LocalDateTime();
	}

	public static org.joda.time.LocalDateTime now(org.joda.time.DateTimeZone zone) {
		if (zone == null) {
			throw new java.lang.NullPointerException("Zone must not be null");
		}
		return new org.joda.time.LocalDateTime(zone);
	}

	public static org.joda.time.LocalDateTime now(org.joda.time.Chronology chronology) {
		if (chronology == null) {
			throw new java.lang.NullPointerException("Chronology must not be null");
		}
		return new org.joda.time.LocalDateTime(chronology);
	}

	@org.joda.convert.FromString
	public static org.joda.time.LocalDateTime parse(java.lang.String str) {
		return org.joda.time.LocalDateTime.parse(str, org.joda.time.format.ISODateTimeFormat.localDateOptionalTimeParser());
	}

	public static org.joda.time.LocalDateTime parse(java.lang.String str, org.joda.time.format.DateTimeFormatter formatter) {
		return formatter.parseLocalDateTime(str);
	}

	public static org.joda.time.LocalDateTime fromCalendarFields(java.util.Calendar calendar) {
		if (calendar == null) {
			throw new java.lang.IllegalArgumentException("The calendar must not be null");
		}
		return new org.joda.time.LocalDateTime(calendar.get(java.util.Calendar.YEAR), ((calendar.get(java.util.Calendar.MONTH)) + 1), calendar.get(java.util.Calendar.DAY_OF_MONTH), calendar.get(java.util.Calendar.HOUR_OF_DAY), calendar.get(java.util.Calendar.MINUTE), calendar.get(java.util.Calendar.SECOND), calendar.get(java.util.Calendar.MILLISECOND));
	}

	@java.lang.SuppressWarnings(value = "deprecation")
	public static org.joda.time.LocalDateTime fromDateFields(java.util.Date date) {
		if (date == null) {
			throw new java.lang.IllegalArgumentException("The date must not be null");
		}
		return new org.joda.time.LocalDateTime(((date.getYear()) + 1900), ((date.getMonth()) + 1), date.getDate(), date.getHours(), date.getMinutes(), date.getSeconds(), ((int) ((date.getTime()) % 1000)));
	}

	public LocalDateTime() {
		this(org.joda.time.DateTimeUtils.currentTimeMillis(), org.joda.time.chrono.ISOChronology.getInstance());
	}

	public LocalDateTime(org.joda.time.DateTimeZone zone) {
		this(org.joda.time.DateTimeUtils.currentTimeMillis(), org.joda.time.chrono.ISOChronology.getInstance(zone));
	}

	public LocalDateTime(org.joda.time.Chronology chronology) {
		this(org.joda.time.DateTimeUtils.currentTimeMillis(), chronology);
	}

	public LocalDateTime(long instant) {
		this(instant, org.joda.time.chrono.ISOChronology.getInstance());
	}

	public LocalDateTime(long instant, org.joda.time.DateTimeZone zone) {
		this(instant, org.joda.time.chrono.ISOChronology.getInstance(zone));
	}

	public LocalDateTime(long instant, org.joda.time.Chronology chronology) {
		chronology = org.joda.time.DateTimeUtils.getChronology(chronology);
		long localMillis = chronology.getZone().getMillisKeepLocal(org.joda.time.DateTimeZone.UTC, instant);
		iLocalMillis = localMillis;
		iChronology = chronology.withUTC();
	}

	public LocalDateTime(java.lang.Object instant) {
		this(instant, ((org.joda.time.Chronology) (null)));
	}

	public LocalDateTime(java.lang.Object instant, org.joda.time.DateTimeZone zone) {
		org.joda.time.convert.PartialConverter converter = org.joda.time.convert.ConverterManager.getInstance().getPartialConverter(instant);
		org.joda.time.Chronology chronology = converter.getChronology(instant, zone);
		chronology = org.joda.time.DateTimeUtils.getChronology(chronology);
		iChronology = chronology.withUTC();
		int[] values = converter.getPartialValues(org.joda.time.LocalDateTime.this, instant, chronology, org.joda.time.format.ISODateTimeFormat.localDateOptionalTimeParser());
		iLocalMillis = iChronology.getDateTimeMillis(values[0], values[1], values[2], values[3]);
	}

	public LocalDateTime(java.lang.Object instant, org.joda.time.Chronology chronology) {
		org.joda.time.convert.PartialConverter converter = org.joda.time.convert.ConverterManager.getInstance().getPartialConverter(instant);
		chronology = converter.getChronology(instant, chronology);
		chronology = org.joda.time.DateTimeUtils.getChronology(chronology);
		iChronology = chronology.withUTC();
		int[] values = converter.getPartialValues(org.joda.time.LocalDateTime.this, instant, chronology, org.joda.time.format.ISODateTimeFormat.localDateOptionalTimeParser());
		iLocalMillis = iChronology.getDateTimeMillis(values[0], values[1], values[2], values[3]);
	}

	public LocalDateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour) {
		this(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, 0, 0, org.joda.time.chrono.ISOChronology.getInstanceUTC());
	}

	public LocalDateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute) {
		this(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, 0, org.joda.time.chrono.ISOChronology.getInstanceUTC());
	}

	public LocalDateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) {
		this(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, org.joda.time.chrono.ISOChronology.getInstanceUTC());
	}

	public LocalDateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond, org.joda.time.Chronology chronology) {
		super();
		chronology = org.joda.time.DateTimeUtils.getChronology(chronology).withUTC();
		long instant = chronology.getDateTimeMillis(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
		iChronology = chronology;
		iLocalMillis = instant;
	}

	private java.lang.Object readResolve() {
		if ((iChronology) == null) {
			return new org.joda.time.LocalDateTime(iLocalMillis, org.joda.time.chrono.ISOChronology.getInstanceUTC());
		}
		if ((org.joda.time.DateTimeZone.UTC.equals(iChronology.getZone())) == false) {
			return new org.joda.time.LocalDateTime(iLocalMillis, iChronology.withUTC());
		}
		return org.joda.time.LocalDateTime.this;
	}

	public int size() {
		return 4;
	}

	protected org.joda.time.DateTimeField getField(int index, org.joda.time.Chronology chrono) {
		switch (index) {
			case org.joda.time.LocalDateTime.YEAR :
				return chrono.year();
			case org.joda.time.LocalDateTime.MONTH_OF_YEAR :
				return chrono.monthOfYear();
			case org.joda.time.LocalDateTime.DAY_OF_MONTH :
				return chrono.dayOfMonth();
			case org.joda.time.LocalDateTime.MILLIS_OF_DAY :
				return chrono.millisOfDay();
			default :
				throw new java.lang.IndexOutOfBoundsException(("Invalid index: " + index));
		}
	}

	public int getValue(int index) {
		switch (index) {
			case org.joda.time.LocalDateTime.YEAR :
				return getChronology().year().get(getLocalMillis());
			case org.joda.time.LocalDateTime.MONTH_OF_YEAR :
				return getChronology().monthOfYear().get(getLocalMillis());
			case org.joda.time.LocalDateTime.DAY_OF_MONTH :
				return getChronology().dayOfMonth().get(getLocalMillis());
			case org.joda.time.LocalDateTime.MILLIS_OF_DAY :
				return getChronology().millisOfDay().get(getLocalMillis());
			default :
				throw new java.lang.IndexOutOfBoundsException(("Invalid index: " + index));
		}
	}

	public int get(org.joda.time.DateTimeFieldType type) {
		if (type == null) {
			throw new java.lang.IllegalArgumentException("The DateTimeFieldType must not be null");
		}
		return type.getField(getChronology()).get(getLocalMillis());
	}

	public boolean isSupported(org.joda.time.DateTimeFieldType type) {
		if (type == null) {
			return false;
		}
		return type.getField(getChronology()).isSupported();
	}

	public boolean isSupported(org.joda.time.DurationFieldType type) {
		if (type == null) {
			return false;
		}
		return type.getField(getChronology()).isSupported();
	}

	protected long getLocalMillis() {
		return iLocalMillis;
	}

	public org.joda.time.Chronology getChronology() {
		return iChronology;
	}

	public boolean equals(java.lang.Object partial) {
		if ((org.joda.time.LocalDateTime.this) == partial) {
			return true;
		}
		if (partial instanceof org.joda.time.LocalDateTime) {
			org.joda.time.LocalDateTime other = ((org.joda.time.LocalDateTime) (partial));
			if (iChronology.equals(other.iChronology)) {
				return (iLocalMillis) == (other.iLocalMillis);
			}
		}
		return super.equals(partial);
	}

	public int compareTo(org.joda.time.ReadablePartial partial) {
		if ((org.joda.time.LocalDateTime.this) == partial) {
			return 0;
		}
		if (partial instanceof org.joda.time.LocalDateTime) {
			org.joda.time.LocalDateTime other = ((org.joda.time.LocalDateTime) (partial));
			if (iChronology.equals(other.iChronology)) {
				return (iLocalMillis) < (other.iLocalMillis) ? -1 : (iLocalMillis) == (other.iLocalMillis) ? 0 : 1;
			}
		}
		return super.compareTo(partial);
	}

	public org.joda.time.DateTime toDateTime() {
		return toDateTime(((org.joda.time.DateTimeZone) (null)));
	}

	public org.joda.time.DateTime toDateTime(org.joda.time.DateTimeZone zone) {
		zone = org.joda.time.DateTimeUtils.getZone(zone);
		org.joda.time.Chronology chrono = iChronology.withZone(zone);
		return new org.joda.time.DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), getHourOfDay(), getMinuteOfHour(), getSecondOfMinute(), getMillisOfSecond(), chrono);
	}

	public org.joda.time.LocalDate toLocalDate() {
		return new org.joda.time.LocalDate(getLocalMillis(), getChronology());
	}

	public org.joda.time.LocalTime toLocalTime() {
		return new org.joda.time.LocalTime(getLocalMillis(), getChronology());
	}

	@java.lang.SuppressWarnings(value = "deprecation")
	public java.util.Date toDate() {
		int dom = getDayOfMonth();
		java.util.Date date = new java.util.Date(((getYear()) - 1900), ((getMonthOfYear()) - 1), dom, getHourOfDay(), getMinuteOfHour(), getSecondOfMinute());
		date.setTime(((date.getTime()) + (getMillisOfSecond())));
		org.joda.time.LocalDateTime check = org.joda.time.LocalDateTime.fromDateFields(date);
		if (check.isBefore(org.joda.time.LocalDateTime.this)) {
			while (check.isBefore(org.joda.time.LocalDateTime.this)) {
				date.setTime(((date.getTime()) + 60000));
				check = org.joda.time.LocalDateTime.fromDateFields(date);
			} 
			while ((check.isBefore(org.joda.time.LocalDateTime.this)) == false) {
				date.setTime(((date.getTime()) - 1000));
				check = org.joda.time.LocalDateTime.fromDateFields(date);
			} 
			date.setTime(((date.getTime()) + 1000));
		}else
			if (check.equals(org.joda.time.LocalDateTime.this)) {
				java.util.Date earlier = new java.util.Date(((date.getTime()) - (java.util.TimeZone.getDefault().getDSTSavings())));
				check = org.joda.time.LocalDateTime.fromDateFields(earlier);
				if (check.equals(org.joda.time.LocalDateTime.this)) {
					date = earlier;
				}
			}
		
		return date;
	}

	org.joda.time.LocalDateTime withLocalMillis(long newMillis) {
		return newMillis == (getLocalMillis()) ? org.joda.time.LocalDateTime.this : new org.joda.time.LocalDateTime(newMillis, getChronology());
	}

	public org.joda.time.LocalDateTime withDate(int year, int monthOfYear, int dayOfMonth) {
		org.joda.time.Chronology chrono = getChronology();
		long instant = getLocalMillis();
		instant = chrono.year().set(instant, year);
		instant = chrono.monthOfYear().set(instant, monthOfYear);
		instant = chrono.dayOfMonth().set(instant, dayOfMonth);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalDateTime withTime(int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) {
		org.joda.time.Chronology chrono = getChronology();
		long instant = getLocalMillis();
		instant = chrono.hourOfDay().set(instant, hourOfDay);
		instant = chrono.minuteOfHour().set(instant, minuteOfHour);
		instant = chrono.secondOfMinute().set(instant, secondOfMinute);
		instant = chrono.millisOfSecond().set(instant, millisOfSecond);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalDateTime withFields(org.joda.time.ReadablePartial partial) {
		if (partial == null) {
			return org.joda.time.LocalDateTime.this;
		}
		return withLocalMillis(getChronology().set(partial, getLocalMillis()));
	}

	public org.joda.time.LocalDateTime withField(org.joda.time.DateTimeFieldType fieldType, int value) {
		if (fieldType == null) {
			throw new java.lang.IllegalArgumentException("Field must not be null");
		}
		long instant = fieldType.getField(getChronology()).set(getLocalMillis(), value);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalDateTime withFieldAdded(org.joda.time.DurationFieldType fieldType, int amount) {
		if (fieldType == null) {
			throw new java.lang.IllegalArgumentException("Field must not be null");
		}
		if (amount == 0) {
			return org.joda.time.LocalDateTime.this;
		}
		long instant = fieldType.getField(getChronology()).add(getLocalMillis(), amount);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalDateTime withDurationAdded(org.joda.time.ReadableDuration durationToAdd, int scalar) {
		if ((durationToAdd == null) || (scalar == 0)) {
			return org.joda.time.LocalDateTime.this;
		}
		long instant = getChronology().add(getLocalMillis(), durationToAdd.getMillis(), scalar);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalDateTime withPeriodAdded(org.joda.time.ReadablePeriod period, int scalar) {
		if ((period == null) || (scalar == 0)) {
			return org.joda.time.LocalDateTime.this;
		}
		long instant = getChronology().add(period, getLocalMillis(), scalar);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalDateTime plus(org.joda.time.ReadableDuration duration) {
		return withDurationAdded(duration, 1);
	}

	public org.joda.time.LocalDateTime plus(org.joda.time.ReadablePeriod period) {
		return withPeriodAdded(period, 1);
	}

	public org.joda.time.LocalDateTime plusYears(int years) {
		if (years == 0) {
			return org.joda.time.LocalDateTime.this;
		}
		long instant = getChronology().years().add(getLocalMillis(), years);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalDateTime plusMonths(int months) {
		if (months == 0) {
			return org.joda.time.LocalDateTime.this;
		}
		long instant = getChronology().months().add(getLocalMillis(), months);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalDateTime plusWeeks(int weeks) {
		if (weeks == 0) {
			return org.joda.time.LocalDateTime.this;
		}
		long instant = getChronology().weeks().add(getLocalMillis(), weeks);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalDateTime plusDays(int days) {
		if (days == 0) {
			return org.joda.time.LocalDateTime.this;
		}
		long instant = getChronology().days().add(getLocalMillis(), days);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalDateTime plusHours(int hours) {
		if (hours == 0) {
			return org.joda.time.LocalDateTime.this;
		}
		long instant = getChronology().hours().add(getLocalMillis(), hours);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalDateTime plusMinutes(int minutes) {
		if (minutes == 0) {
			return org.joda.time.LocalDateTime.this;
		}
		long instant = getChronology().minutes().add(getLocalMillis(), minutes);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalDateTime plusSeconds(int seconds) {
		if (seconds == 0) {
			return org.joda.time.LocalDateTime.this;
		}
		long instant = getChronology().seconds().add(getLocalMillis(), seconds);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalDateTime plusMillis(int millis) {
		if (millis == 0) {
			return org.joda.time.LocalDateTime.this;
		}
		long instant = getChronology().millis().add(getLocalMillis(), millis);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalDateTime minus(org.joda.time.ReadableDuration duration) {
		return withDurationAdded(duration, (-1));
	}

	public org.joda.time.LocalDateTime minus(org.joda.time.ReadablePeriod period) {
		return withPeriodAdded(period, (-1));
	}

	public org.joda.time.LocalDateTime minusYears(int years) {
		if (years == 0) {
			return org.joda.time.LocalDateTime.this;
		}
		long instant = getChronology().years().subtract(getLocalMillis(), years);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalDateTime minusMonths(int months) {
		if (months == 0) {
			return org.joda.time.LocalDateTime.this;
		}
		long instant = getChronology().months().subtract(getLocalMillis(), months);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalDateTime minusWeeks(int weeks) {
		if (weeks == 0) {
			return org.joda.time.LocalDateTime.this;
		}
		long instant = getChronology().weeks().subtract(getLocalMillis(), weeks);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalDateTime minusDays(int days) {
		if (days == 0) {
			return org.joda.time.LocalDateTime.this;
		}
		long instant = getChronology().days().subtract(getLocalMillis(), days);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalDateTime minusHours(int hours) {
		if (hours == 0) {
			return org.joda.time.LocalDateTime.this;
		}
		long instant = getChronology().hours().subtract(getLocalMillis(), hours);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalDateTime minusMinutes(int minutes) {
		if (minutes == 0) {
			return org.joda.time.LocalDateTime.this;
		}
		long instant = getChronology().minutes().subtract(getLocalMillis(), minutes);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalDateTime minusSeconds(int seconds) {
		if (seconds == 0) {
			return org.joda.time.LocalDateTime.this;
		}
		long instant = getChronology().seconds().subtract(getLocalMillis(), seconds);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalDateTime minusMillis(int millis) {
		if (millis == 0) {
			return org.joda.time.LocalDateTime.this;
		}
		long instant = getChronology().millis().subtract(getLocalMillis(), millis);
		return withLocalMillis(instant);
	}

	public org.joda.time.LocalDateTime.Property property(org.joda.time.DateTimeFieldType fieldType) {
		if (fieldType == null) {
			throw new java.lang.IllegalArgumentException("The DateTimeFieldType must not be null");
		}
		if ((isSupported(fieldType)) == false) {
			throw new java.lang.IllegalArgumentException((("Field '" + fieldType) + "' is not supported"));
		}
		return new org.joda.time.LocalDateTime.Property(org.joda.time.LocalDateTime.this, fieldType.getField(getChronology()));
	}

	public int getEra() {
		return getChronology().era().get(getLocalMillis());
	}

	public int getCenturyOfEra() {
		return getChronology().centuryOfEra().get(getLocalMillis());
	}

	public int getYearOfEra() {
		return getChronology().yearOfEra().get(getLocalMillis());
	}

	public int getYearOfCentury() {
		return getChronology().yearOfCentury().get(getLocalMillis());
	}

	public int getYear() {
		return getChronology().year().get(getLocalMillis());
	}

	public int getWeekyear() {
		return getChronology().weekyear().get(getLocalMillis());
	}

	public int getMonthOfYear() {
		return getChronology().monthOfYear().get(getLocalMillis());
	}

	public int getWeekOfWeekyear() {
		return getChronology().weekOfWeekyear().get(getLocalMillis());
	}

	public int getDayOfYear() {
		return getChronology().dayOfYear().get(getLocalMillis());
	}

	public int getDayOfMonth() {
		return getChronology().dayOfMonth().get(getLocalMillis());
	}

	public int getDayOfWeek() {
		return getChronology().dayOfWeek().get(getLocalMillis());
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

	public org.joda.time.LocalDateTime withEra(int era) {
		return withLocalMillis(getChronology().era().set(getLocalMillis(), era));
	}

	public org.joda.time.LocalDateTime withCenturyOfEra(int centuryOfEra) {
		return withLocalMillis(getChronology().centuryOfEra().set(getLocalMillis(), centuryOfEra));
	}

	public org.joda.time.LocalDateTime withYearOfEra(int yearOfEra) {
		return withLocalMillis(getChronology().yearOfEra().set(getLocalMillis(), yearOfEra));
	}

	public org.joda.time.LocalDateTime withYearOfCentury(int yearOfCentury) {
		return withLocalMillis(getChronology().yearOfCentury().set(getLocalMillis(), yearOfCentury));
	}

	public org.joda.time.LocalDateTime withYear(int year) {
		return withLocalMillis(getChronology().year().set(getLocalMillis(), year));
	}

	public org.joda.time.LocalDateTime withWeekyear(int weekyear) {
		return withLocalMillis(getChronology().weekyear().set(getLocalMillis(), weekyear));
	}

	public org.joda.time.LocalDateTime withMonthOfYear(int monthOfYear) {
		return withLocalMillis(getChronology().monthOfYear().set(getLocalMillis(), monthOfYear));
	}

	public org.joda.time.LocalDateTime withWeekOfWeekyear(int weekOfWeekyear) {
		return withLocalMillis(getChronology().weekOfWeekyear().set(getLocalMillis(), weekOfWeekyear));
	}

	public org.joda.time.LocalDateTime withDayOfYear(int dayOfYear) {
		return withLocalMillis(getChronology().dayOfYear().set(getLocalMillis(), dayOfYear));
	}

	public org.joda.time.LocalDateTime withDayOfMonth(int dayOfMonth) {
		return withLocalMillis(getChronology().dayOfMonth().set(getLocalMillis(), dayOfMonth));
	}

	public org.joda.time.LocalDateTime withDayOfWeek(int dayOfWeek) {
		return withLocalMillis(getChronology().dayOfWeek().set(getLocalMillis(), dayOfWeek));
	}

	public org.joda.time.LocalDateTime withHourOfDay(int hour) {
		return withLocalMillis(getChronology().hourOfDay().set(getLocalMillis(), hour));
	}

	public org.joda.time.LocalDateTime withMinuteOfHour(int minute) {
		return withLocalMillis(getChronology().minuteOfHour().set(getLocalMillis(), minute));
	}

	public org.joda.time.LocalDateTime withSecondOfMinute(int second) {
		return withLocalMillis(getChronology().secondOfMinute().set(getLocalMillis(), second));
	}

	public org.joda.time.LocalDateTime withMillisOfSecond(int millis) {
		return withLocalMillis(getChronology().millisOfSecond().set(getLocalMillis(), millis));
	}

	public org.joda.time.LocalDateTime withMillisOfDay(int millis) {
		return withLocalMillis(getChronology().millisOfDay().set(getLocalMillis(), millis));
	}

	public org.joda.time.LocalDateTime.Property era() {
		return new org.joda.time.LocalDateTime.Property(org.joda.time.LocalDateTime.this, getChronology().era());
	}

	public org.joda.time.LocalDateTime.Property centuryOfEra() {
		return new org.joda.time.LocalDateTime.Property(org.joda.time.LocalDateTime.this, getChronology().centuryOfEra());
	}

	public org.joda.time.LocalDateTime.Property yearOfCentury() {
		return new org.joda.time.LocalDateTime.Property(org.joda.time.LocalDateTime.this, getChronology().yearOfCentury());
	}

	public org.joda.time.LocalDateTime.Property yearOfEra() {
		return new org.joda.time.LocalDateTime.Property(org.joda.time.LocalDateTime.this, getChronology().yearOfEra());
	}

	public org.joda.time.LocalDateTime.Property year() {
		return new org.joda.time.LocalDateTime.Property(org.joda.time.LocalDateTime.this, getChronology().year());
	}

	public org.joda.time.LocalDateTime.Property weekyear() {
		return new org.joda.time.LocalDateTime.Property(org.joda.time.LocalDateTime.this, getChronology().weekyear());
	}

	public org.joda.time.LocalDateTime.Property monthOfYear() {
		return new org.joda.time.LocalDateTime.Property(org.joda.time.LocalDateTime.this, getChronology().monthOfYear());
	}

	public org.joda.time.LocalDateTime.Property weekOfWeekyear() {
		return new org.joda.time.LocalDateTime.Property(org.joda.time.LocalDateTime.this, getChronology().weekOfWeekyear());
	}

	public org.joda.time.LocalDateTime.Property dayOfYear() {
		return new org.joda.time.LocalDateTime.Property(org.joda.time.LocalDateTime.this, getChronology().dayOfYear());
	}

	public org.joda.time.LocalDateTime.Property dayOfMonth() {
		return new org.joda.time.LocalDateTime.Property(org.joda.time.LocalDateTime.this, getChronology().dayOfMonth());
	}

	public org.joda.time.LocalDateTime.Property dayOfWeek() {
		return new org.joda.time.LocalDateTime.Property(org.joda.time.LocalDateTime.this, getChronology().dayOfWeek());
	}

	public org.joda.time.LocalDateTime.Property hourOfDay() {
		return new org.joda.time.LocalDateTime.Property(org.joda.time.LocalDateTime.this, getChronology().hourOfDay());
	}

	public org.joda.time.LocalDateTime.Property minuteOfHour() {
		return new org.joda.time.LocalDateTime.Property(org.joda.time.LocalDateTime.this, getChronology().minuteOfHour());
	}

	public org.joda.time.LocalDateTime.Property secondOfMinute() {
		return new org.joda.time.LocalDateTime.Property(org.joda.time.LocalDateTime.this, getChronology().secondOfMinute());
	}

	public org.joda.time.LocalDateTime.Property millisOfSecond() {
		return new org.joda.time.LocalDateTime.Property(org.joda.time.LocalDateTime.this, getChronology().millisOfSecond());
	}

	public org.joda.time.LocalDateTime.Property millisOfDay() {
		return new org.joda.time.LocalDateTime.Property(org.joda.time.LocalDateTime.this, getChronology().millisOfDay());
	}

	@org.joda.convert.ToString
	public java.lang.String toString() {
		return org.joda.time.format.ISODateTimeFormat.dateTime().print(org.joda.time.LocalDateTime.this);
	}

	public java.lang.String toString(java.lang.String pattern) {
		if (pattern == null) {
			return toString();
		}
		return org.joda.time.format.DateTimeFormat.forPattern(pattern).print(org.joda.time.LocalDateTime.this);
	}

	public java.lang.String toString(java.lang.String pattern, java.util.Locale locale) throws java.lang.IllegalArgumentException {
		if (pattern == null) {
			return toString();
		}
		return org.joda.time.format.DateTimeFormat.forPattern(pattern).withLocale(locale).print(org.joda.time.LocalDateTime.this);
	}

	public static final class Property extends org.joda.time.field.AbstractReadableInstantFieldProperty {
		private static final long serialVersionUID = -358138762846288L;

		private transient org.joda.time.LocalDateTime iInstant;

		private transient org.joda.time.DateTimeField iField;

		Property(org.joda.time.LocalDateTime instant, org.joda.time.DateTimeField field) {
			super();
			iInstant = instant;
			iField = field;
		}

		private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException {
			oos.writeObject(iInstant);
			oos.writeObject(iField.getType());
		}

		private void readObject(java.io.ObjectInputStream oos) throws java.io.IOException, java.lang.ClassNotFoundException {
			iInstant = ((org.joda.time.LocalDateTime) (oos.readObject()));
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

		public org.joda.time.LocalDateTime getLocalDateTime() {
			return iInstant;
		}

		public org.joda.time.LocalDateTime addToCopy(int value) {
			return iInstant.withLocalMillis(iField.add(iInstant.getLocalMillis(), value));
		}

		public org.joda.time.LocalDateTime addToCopy(long value) {
			return iInstant.withLocalMillis(iField.add(iInstant.getLocalMillis(), value));
		}

		public org.joda.time.LocalDateTime addWrapFieldToCopy(int value) {
			return iInstant.withLocalMillis(iField.addWrapField(iInstant.getLocalMillis(), value));
		}

		public org.joda.time.LocalDateTime setCopy(int value) {
			return iInstant.withLocalMillis(iField.set(iInstant.getLocalMillis(), value));
		}

		public org.joda.time.LocalDateTime setCopy(java.lang.String text, java.util.Locale locale) {
			return iInstant.withLocalMillis(iField.set(iInstant.getLocalMillis(), text, locale));
		}

		public org.joda.time.LocalDateTime setCopy(java.lang.String text) {
			return setCopy(text, null);
		}

		public org.joda.time.LocalDateTime withMaximumValue() {
			return setCopy(getMaximumValue());
		}

		public org.joda.time.LocalDateTime withMinimumValue() {
			return setCopy(getMinimumValue());
		}

		public org.joda.time.LocalDateTime roundFloorCopy() {
			return iInstant.withLocalMillis(iField.roundFloor(iInstant.getLocalMillis()));
		}

		public org.joda.time.LocalDateTime roundCeilingCopy() {
			return iInstant.withLocalMillis(iField.roundCeiling(iInstant.getLocalMillis()));
		}

		public org.joda.time.LocalDateTime roundHalfFloorCopy() {
			return iInstant.withLocalMillis(iField.roundHalfFloor(iInstant.getLocalMillis()));
		}

		public org.joda.time.LocalDateTime roundHalfCeilingCopy() {
			return iInstant.withLocalMillis(iField.roundHalfCeiling(iInstant.getLocalMillis()));
		}

		public org.joda.time.LocalDateTime roundHalfEvenCopy() {
			return iInstant.withLocalMillis(iField.roundHalfEven(iInstant.getLocalMillis()));
		}
	}
}


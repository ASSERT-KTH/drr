

package org.joda.time;


public abstract class DateTimeFieldType implements java.io.Serializable {
	private static final long serialVersionUID = -42615285973990L;

	static final byte ERA = 1;

	static final byte YEAR_OF_ERA = 2;

	static final byte CENTURY_OF_ERA = 3;

	static final byte YEAR_OF_CENTURY = 4;

	static final byte YEAR = 5;

	static final byte DAY_OF_YEAR = 6;

	static final byte MONTH_OF_YEAR = 7;

	static final byte DAY_OF_MONTH = 8;

	static final byte WEEKYEAR_OF_CENTURY = 9;

	static final byte WEEKYEAR = 10;

	static final byte WEEK_OF_WEEKYEAR = 11;

	static final byte DAY_OF_WEEK = 12;

	static final byte HALFDAY_OF_DAY = 13;

	static final byte HOUR_OF_HALFDAY = 14;

	static final byte CLOCKHOUR_OF_HALFDAY = 15;

	static final byte CLOCKHOUR_OF_DAY = 16;

	static final byte HOUR_OF_DAY = 17;

	static final byte MINUTE_OF_DAY = 18;

	static final byte MINUTE_OF_HOUR = 19;

	static final byte SECOND_OF_DAY = 20;

	static final byte SECOND_OF_MINUTE = 21;

	static final byte MILLIS_OF_DAY = 22;

	static final byte MILLIS_OF_SECOND = 23;

	private static final org.joda.time.DateTimeFieldType ERA_TYPE = new org.joda.time.DateTimeFieldType.StandardDateTimeFieldType("era", org.joda.time.DateTimeFieldType.ERA, org.joda.time.DurationFieldType.eras(), null);

	private static final org.joda.time.DateTimeFieldType YEAR_OF_ERA_TYPE = new org.joda.time.DateTimeFieldType.StandardDateTimeFieldType("yearOfEra", org.joda.time.DateTimeFieldType.YEAR_OF_ERA, org.joda.time.DurationFieldType.years(), org.joda.time.DurationFieldType.eras());

	private static final org.joda.time.DateTimeFieldType CENTURY_OF_ERA_TYPE = new org.joda.time.DateTimeFieldType.StandardDateTimeFieldType("centuryOfEra", org.joda.time.DateTimeFieldType.CENTURY_OF_ERA, org.joda.time.DurationFieldType.centuries(), org.joda.time.DurationFieldType.eras());

	private static final org.joda.time.DateTimeFieldType YEAR_OF_CENTURY_TYPE = new org.joda.time.DateTimeFieldType.StandardDateTimeFieldType("yearOfCentury", org.joda.time.DateTimeFieldType.YEAR_OF_CENTURY, org.joda.time.DurationFieldType.years(), org.joda.time.DurationFieldType.centuries());

	private static final org.joda.time.DateTimeFieldType YEAR_TYPE = new org.joda.time.DateTimeFieldType.StandardDateTimeFieldType("year", org.joda.time.DateTimeFieldType.YEAR, org.joda.time.DurationFieldType.years(), null);

	private static final org.joda.time.DateTimeFieldType DAY_OF_YEAR_TYPE = new org.joda.time.DateTimeFieldType.StandardDateTimeFieldType("dayOfYear", org.joda.time.DateTimeFieldType.DAY_OF_YEAR, org.joda.time.DurationFieldType.days(), org.joda.time.DurationFieldType.years());

	private static final org.joda.time.DateTimeFieldType MONTH_OF_YEAR_TYPE = new org.joda.time.DateTimeFieldType.StandardDateTimeFieldType("monthOfYear", org.joda.time.DateTimeFieldType.MONTH_OF_YEAR, org.joda.time.DurationFieldType.months(), org.joda.time.DurationFieldType.years());

	private static final org.joda.time.DateTimeFieldType DAY_OF_MONTH_TYPE = new org.joda.time.DateTimeFieldType.StandardDateTimeFieldType("dayOfMonth", org.joda.time.DateTimeFieldType.DAY_OF_MONTH, org.joda.time.DurationFieldType.days(), org.joda.time.DurationFieldType.months());

	private static final org.joda.time.DateTimeFieldType WEEKYEAR_OF_CENTURY_TYPE = new org.joda.time.DateTimeFieldType.StandardDateTimeFieldType("weekyearOfCentury", org.joda.time.DateTimeFieldType.WEEKYEAR_OF_CENTURY, org.joda.time.DurationFieldType.weekyears(), org.joda.time.DurationFieldType.centuries());

	private static final org.joda.time.DateTimeFieldType WEEKYEAR_TYPE = new org.joda.time.DateTimeFieldType.StandardDateTimeFieldType("weekyear", org.joda.time.DateTimeFieldType.WEEKYEAR, org.joda.time.DurationFieldType.weekyears(), null);

	private static final org.joda.time.DateTimeFieldType WEEK_OF_WEEKYEAR_TYPE = new org.joda.time.DateTimeFieldType.StandardDateTimeFieldType("weekOfWeekyear", org.joda.time.DateTimeFieldType.WEEK_OF_WEEKYEAR, org.joda.time.DurationFieldType.weeks(), org.joda.time.DurationFieldType.weekyears());

	private static final org.joda.time.DateTimeFieldType DAY_OF_WEEK_TYPE = new org.joda.time.DateTimeFieldType.StandardDateTimeFieldType("dayOfWeek", org.joda.time.DateTimeFieldType.DAY_OF_WEEK, org.joda.time.DurationFieldType.days(), org.joda.time.DurationFieldType.weeks());

	private static final org.joda.time.DateTimeFieldType HALFDAY_OF_DAY_TYPE = new org.joda.time.DateTimeFieldType.StandardDateTimeFieldType("halfdayOfDay", org.joda.time.DateTimeFieldType.HALFDAY_OF_DAY, org.joda.time.DurationFieldType.halfdays(), org.joda.time.DurationFieldType.days());

	private static final org.joda.time.DateTimeFieldType HOUR_OF_HALFDAY_TYPE = new org.joda.time.DateTimeFieldType.StandardDateTimeFieldType("hourOfHalfday", org.joda.time.DateTimeFieldType.HOUR_OF_HALFDAY, org.joda.time.DurationFieldType.hours(), org.joda.time.DurationFieldType.halfdays());

	private static final org.joda.time.DateTimeFieldType CLOCKHOUR_OF_HALFDAY_TYPE = new org.joda.time.DateTimeFieldType.StandardDateTimeFieldType("clockhourOfHalfday", org.joda.time.DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, org.joda.time.DurationFieldType.hours(), org.joda.time.DurationFieldType.halfdays());

	private static final org.joda.time.DateTimeFieldType CLOCKHOUR_OF_DAY_TYPE = new org.joda.time.DateTimeFieldType.StandardDateTimeFieldType("clockhourOfDay", org.joda.time.DateTimeFieldType.CLOCKHOUR_OF_DAY, org.joda.time.DurationFieldType.hours(), org.joda.time.DurationFieldType.days());

	private static final org.joda.time.DateTimeFieldType HOUR_OF_DAY_TYPE = new org.joda.time.DateTimeFieldType.StandardDateTimeFieldType("hourOfDay", org.joda.time.DateTimeFieldType.HOUR_OF_DAY, org.joda.time.DurationFieldType.hours(), org.joda.time.DurationFieldType.days());

	private static final org.joda.time.DateTimeFieldType MINUTE_OF_DAY_TYPE = new org.joda.time.DateTimeFieldType.StandardDateTimeFieldType("minuteOfDay", org.joda.time.DateTimeFieldType.MINUTE_OF_DAY, org.joda.time.DurationFieldType.minutes(), org.joda.time.DurationFieldType.days());

	private static final org.joda.time.DateTimeFieldType MINUTE_OF_HOUR_TYPE = new org.joda.time.DateTimeFieldType.StandardDateTimeFieldType("minuteOfHour", org.joda.time.DateTimeFieldType.MINUTE_OF_HOUR, org.joda.time.DurationFieldType.minutes(), org.joda.time.DurationFieldType.hours());

	private static final org.joda.time.DateTimeFieldType SECOND_OF_DAY_TYPE = new org.joda.time.DateTimeFieldType.StandardDateTimeFieldType("secondOfDay", org.joda.time.DateTimeFieldType.SECOND_OF_DAY, org.joda.time.DurationFieldType.seconds(), org.joda.time.DurationFieldType.days());

	private static final org.joda.time.DateTimeFieldType SECOND_OF_MINUTE_TYPE = new org.joda.time.DateTimeFieldType.StandardDateTimeFieldType("secondOfMinute", org.joda.time.DateTimeFieldType.SECOND_OF_MINUTE, org.joda.time.DurationFieldType.seconds(), org.joda.time.DurationFieldType.minutes());

	private static final org.joda.time.DateTimeFieldType MILLIS_OF_DAY_TYPE = new org.joda.time.DateTimeFieldType.StandardDateTimeFieldType("millisOfDay", org.joda.time.DateTimeFieldType.MILLIS_OF_DAY, org.joda.time.DurationFieldType.millis(), org.joda.time.DurationFieldType.days());

	private static final org.joda.time.DateTimeFieldType MILLIS_OF_SECOND_TYPE = new org.joda.time.DateTimeFieldType.StandardDateTimeFieldType("millisOfSecond", org.joda.time.DateTimeFieldType.MILLIS_OF_SECOND, org.joda.time.DurationFieldType.millis(), org.joda.time.DurationFieldType.seconds());

	private final java.lang.String iName;

	protected DateTimeFieldType(java.lang.String name) {
		super();
		iName = name;
	}

	public static org.joda.time.DateTimeFieldType millisOfSecond() {
		return org.joda.time.DateTimeFieldType.MILLIS_OF_SECOND_TYPE;
	}

	public static org.joda.time.DateTimeFieldType millisOfDay() {
		return org.joda.time.DateTimeFieldType.MILLIS_OF_DAY_TYPE;
	}

	public static org.joda.time.DateTimeFieldType secondOfMinute() {
		return org.joda.time.DateTimeFieldType.SECOND_OF_MINUTE_TYPE;
	}

	public static org.joda.time.DateTimeFieldType secondOfDay() {
		return org.joda.time.DateTimeFieldType.SECOND_OF_DAY_TYPE;
	}

	public static org.joda.time.DateTimeFieldType minuteOfHour() {
		return org.joda.time.DateTimeFieldType.MINUTE_OF_HOUR_TYPE;
	}

	public static org.joda.time.DateTimeFieldType minuteOfDay() {
		return org.joda.time.DateTimeFieldType.MINUTE_OF_DAY_TYPE;
	}

	public static org.joda.time.DateTimeFieldType hourOfDay() {
		return org.joda.time.DateTimeFieldType.HOUR_OF_DAY_TYPE;
	}

	public static org.joda.time.DateTimeFieldType clockhourOfDay() {
		return org.joda.time.DateTimeFieldType.CLOCKHOUR_OF_DAY_TYPE;
	}

	public static org.joda.time.DateTimeFieldType hourOfHalfday() {
		return org.joda.time.DateTimeFieldType.HOUR_OF_HALFDAY_TYPE;
	}

	public static org.joda.time.DateTimeFieldType clockhourOfHalfday() {
		return org.joda.time.DateTimeFieldType.CLOCKHOUR_OF_HALFDAY_TYPE;
	}

	public static org.joda.time.DateTimeFieldType halfdayOfDay() {
		return org.joda.time.DateTimeFieldType.HALFDAY_OF_DAY_TYPE;
	}

	public static org.joda.time.DateTimeFieldType dayOfWeek() {
		return org.joda.time.DateTimeFieldType.DAY_OF_WEEK_TYPE;
	}

	public static org.joda.time.DateTimeFieldType dayOfMonth() {
		return org.joda.time.DateTimeFieldType.DAY_OF_MONTH_TYPE;
	}

	public static org.joda.time.DateTimeFieldType dayOfYear() {
		return org.joda.time.DateTimeFieldType.DAY_OF_YEAR_TYPE;
	}

	public static org.joda.time.DateTimeFieldType weekOfWeekyear() {
		return org.joda.time.DateTimeFieldType.WEEK_OF_WEEKYEAR_TYPE;
	}

	public static org.joda.time.DateTimeFieldType weekyear() {
		return org.joda.time.DateTimeFieldType.WEEKYEAR_TYPE;
	}

	public static org.joda.time.DateTimeFieldType weekyearOfCentury() {
		return org.joda.time.DateTimeFieldType.WEEKYEAR_OF_CENTURY_TYPE;
	}

	public static org.joda.time.DateTimeFieldType monthOfYear() {
		return org.joda.time.DateTimeFieldType.MONTH_OF_YEAR_TYPE;
	}

	public static org.joda.time.DateTimeFieldType year() {
		return org.joda.time.DateTimeFieldType.YEAR_TYPE;
	}

	public static org.joda.time.DateTimeFieldType yearOfEra() {
		return org.joda.time.DateTimeFieldType.YEAR_OF_ERA_TYPE;
	}

	public static org.joda.time.DateTimeFieldType yearOfCentury() {
		return org.joda.time.DateTimeFieldType.YEAR_OF_CENTURY_TYPE;
	}

	public static org.joda.time.DateTimeFieldType centuryOfEra() {
		return org.joda.time.DateTimeFieldType.CENTURY_OF_ERA_TYPE;
	}

	public static org.joda.time.DateTimeFieldType era() {
		return org.joda.time.DateTimeFieldType.ERA_TYPE;
	}

	public java.lang.String getName() {
		return iName;
	}

	public abstract org.joda.time.DurationFieldType getDurationType();

	public abstract org.joda.time.DurationFieldType getRangeDurationType();

	public abstract org.joda.time.DateTimeField getField(org.joda.time.Chronology chronology);

	public boolean isSupported(org.joda.time.Chronology chronology) {
		return getField(chronology).isSupported();
	}

	public java.lang.String toString() {
		return getName();
	}

	private static class StandardDateTimeFieldType extends org.joda.time.DateTimeFieldType {
		private static final long serialVersionUID = -9937958251642L;

		private final byte iOrdinal;

		private final transient org.joda.time.DurationFieldType iUnitType;

		private final transient org.joda.time.DurationFieldType iRangeType;

		StandardDateTimeFieldType(java.lang.String name, byte ordinal, org.joda.time.DurationFieldType unitType, org.joda.time.DurationFieldType rangeType) {
			super(name);
			iOrdinal = ordinal;
			iUnitType = unitType;
			iRangeType = rangeType;
		}

		public org.joda.time.DurationFieldType getDurationType() {
			return iUnitType;
		}

		public org.joda.time.DurationFieldType getRangeDurationType() {
			return iRangeType;
		}

		@java.lang.Override
		public boolean equals(java.lang.Object obj) {
			if ((org.joda.time.DateTimeFieldType.StandardDateTimeFieldType.this) == obj) {
				return true;
			}
			if (obj instanceof org.joda.time.DateTimeFieldType.StandardDateTimeFieldType) {
				return (iOrdinal) == (((org.joda.time.DateTimeFieldType.StandardDateTimeFieldType) (obj)).iOrdinal);
			}
			return false;
		}

		@java.lang.Override
		public int hashCode() {
			return iOrdinal;
		}

		public org.joda.time.DateTimeField getField(org.joda.time.Chronology chronology) {
			chronology = org.joda.time.DateTimeUtils.getChronology(chronology);
			switch (iOrdinal) {
				case org.joda.time.DateTimeFieldType.ERA :
					return chronology.era();
				case org.joda.time.DateTimeFieldType.YEAR_OF_ERA :
					return chronology.yearOfEra();
				case org.joda.time.DateTimeFieldType.CENTURY_OF_ERA :
					return chronology.centuryOfEra();
				case org.joda.time.DateTimeFieldType.YEAR_OF_CENTURY :
					return chronology.yearOfCentury();
				case org.joda.time.DateTimeFieldType.YEAR :
					return chronology.year();
				case org.joda.time.DateTimeFieldType.DAY_OF_YEAR :
					return chronology.dayOfYear();
				case org.joda.time.DateTimeFieldType.MONTH_OF_YEAR :
					return chronology.monthOfYear();
				case org.joda.time.DateTimeFieldType.DAY_OF_MONTH :
					return chronology.dayOfMonth();
				case org.joda.time.DateTimeFieldType.WEEKYEAR_OF_CENTURY :
					return chronology.weekyearOfCentury();
				case org.joda.time.DateTimeFieldType.WEEKYEAR :
					return chronology.weekyear();
				case org.joda.time.DateTimeFieldType.WEEK_OF_WEEKYEAR :
					return chronology.weekOfWeekyear();
				case org.joda.time.DateTimeFieldType.DAY_OF_WEEK :
					return chronology.dayOfWeek();
				case org.joda.time.DateTimeFieldType.HALFDAY_OF_DAY :
					return chronology.halfdayOfDay();
				case org.joda.time.DateTimeFieldType.HOUR_OF_HALFDAY :
					return chronology.hourOfHalfday();
				case org.joda.time.DateTimeFieldType.CLOCKHOUR_OF_HALFDAY :
					return chronology.clockhourOfHalfday();
				case org.joda.time.DateTimeFieldType.CLOCKHOUR_OF_DAY :
					return chronology.clockhourOfDay();
				case org.joda.time.DateTimeFieldType.HOUR_OF_DAY :
					return chronology.hourOfDay();
				case org.joda.time.DateTimeFieldType.MINUTE_OF_DAY :
					return chronology.minuteOfDay();
				case org.joda.time.DateTimeFieldType.MINUTE_OF_HOUR :
					return chronology.minuteOfHour();
				case org.joda.time.DateTimeFieldType.SECOND_OF_DAY :
					return chronology.secondOfDay();
				case org.joda.time.DateTimeFieldType.SECOND_OF_MINUTE :
					return chronology.secondOfMinute();
				case org.joda.time.DateTimeFieldType.MILLIS_OF_DAY :
					return chronology.millisOfDay();
				case org.joda.time.DateTimeFieldType.MILLIS_OF_SECOND :
					return chronology.millisOfSecond();
				default :
					throw new java.lang.InternalError();
			}
		}

		private java.lang.Object readResolve() {
			switch (iOrdinal) {
				case org.joda.time.DateTimeFieldType.ERA :
					return org.joda.time.DateTimeFieldType.ERA_TYPE;
				case org.joda.time.DateTimeFieldType.YEAR_OF_ERA :
					return org.joda.time.DateTimeFieldType.YEAR_OF_ERA_TYPE;
				case org.joda.time.DateTimeFieldType.CENTURY_OF_ERA :
					return org.joda.time.DateTimeFieldType.CENTURY_OF_ERA_TYPE;
				case org.joda.time.DateTimeFieldType.YEAR_OF_CENTURY :
					return org.joda.time.DateTimeFieldType.YEAR_OF_CENTURY_TYPE;
				case org.joda.time.DateTimeFieldType.YEAR :
					return org.joda.time.DateTimeFieldType.YEAR_TYPE;
				case org.joda.time.DateTimeFieldType.DAY_OF_YEAR :
					return org.joda.time.DateTimeFieldType.DAY_OF_YEAR_TYPE;
				case org.joda.time.DateTimeFieldType.MONTH_OF_YEAR :
					return org.joda.time.DateTimeFieldType.MONTH_OF_YEAR_TYPE;
				case org.joda.time.DateTimeFieldType.DAY_OF_MONTH :
					return org.joda.time.DateTimeFieldType.DAY_OF_MONTH_TYPE;
				case org.joda.time.DateTimeFieldType.WEEKYEAR_OF_CENTURY :
					return org.joda.time.DateTimeFieldType.WEEKYEAR_OF_CENTURY_TYPE;
				case org.joda.time.DateTimeFieldType.WEEKYEAR :
					return org.joda.time.DateTimeFieldType.WEEKYEAR_TYPE;
				case org.joda.time.DateTimeFieldType.WEEK_OF_WEEKYEAR :
					return org.joda.time.DateTimeFieldType.WEEK_OF_WEEKYEAR_TYPE;
				case org.joda.time.DateTimeFieldType.DAY_OF_WEEK :
					return org.joda.time.DateTimeFieldType.DAY_OF_WEEK_TYPE;
				case org.joda.time.DateTimeFieldType.HALFDAY_OF_DAY :
					return org.joda.time.DateTimeFieldType.HALFDAY_OF_DAY_TYPE;
				case org.joda.time.DateTimeFieldType.HOUR_OF_HALFDAY :
					return org.joda.time.DateTimeFieldType.HOUR_OF_HALFDAY_TYPE;
				case org.joda.time.DateTimeFieldType.CLOCKHOUR_OF_HALFDAY :
					return org.joda.time.DateTimeFieldType.CLOCKHOUR_OF_HALFDAY_TYPE;
				case org.joda.time.DateTimeFieldType.CLOCKHOUR_OF_DAY :
					return org.joda.time.DateTimeFieldType.CLOCKHOUR_OF_DAY_TYPE;
				case org.joda.time.DateTimeFieldType.HOUR_OF_DAY :
					return org.joda.time.DateTimeFieldType.HOUR_OF_DAY_TYPE;
				case org.joda.time.DateTimeFieldType.MINUTE_OF_DAY :
					return org.joda.time.DateTimeFieldType.MINUTE_OF_DAY_TYPE;
				case org.joda.time.DateTimeFieldType.MINUTE_OF_HOUR :
					return org.joda.time.DateTimeFieldType.MINUTE_OF_HOUR_TYPE;
				case org.joda.time.DateTimeFieldType.SECOND_OF_DAY :
					return org.joda.time.DateTimeFieldType.SECOND_OF_DAY_TYPE;
				case org.joda.time.DateTimeFieldType.SECOND_OF_MINUTE :
					return org.joda.time.DateTimeFieldType.SECOND_OF_MINUTE_TYPE;
				case org.joda.time.DateTimeFieldType.MILLIS_OF_DAY :
					return org.joda.time.DateTimeFieldType.MILLIS_OF_DAY_TYPE;
				case org.joda.time.DateTimeFieldType.MILLIS_OF_SECOND :
					return org.joda.time.DateTimeFieldType.MILLIS_OF_SECOND_TYPE;
				default :
					return org.joda.time.DateTimeFieldType.StandardDateTimeFieldType.this;
			}
		}
	}
}


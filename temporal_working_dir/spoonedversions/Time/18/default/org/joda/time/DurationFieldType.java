

package org.joda.time;


public abstract class DurationFieldType implements java.io.Serializable {
	private static final long serialVersionUID = 8765135187319L;

	static final byte ERAS = 1;

	static final byte CENTURIES = 2;

	static final byte WEEKYEARS = 3;

	static final byte YEARS = 4;

	static final byte MONTHS = 5;

	static final byte WEEKS = 6;

	static final byte DAYS = 7;

	static final byte HALFDAYS = 8;

	static final byte HOURS = 9;

	static final byte MINUTES = 10;

	static final byte SECONDS = 11;

	static final byte MILLIS = 12;

	static final org.joda.time.DurationFieldType ERAS_TYPE = new org.joda.time.DurationFieldType.StandardDurationFieldType("eras", org.joda.time.DurationFieldType.ERAS);

	static final org.joda.time.DurationFieldType CENTURIES_TYPE = new org.joda.time.DurationFieldType.StandardDurationFieldType("centuries", org.joda.time.DurationFieldType.CENTURIES);

	static final org.joda.time.DurationFieldType WEEKYEARS_TYPE = new org.joda.time.DurationFieldType.StandardDurationFieldType("weekyears", org.joda.time.DurationFieldType.WEEKYEARS);

	static final org.joda.time.DurationFieldType YEARS_TYPE = new org.joda.time.DurationFieldType.StandardDurationFieldType("years", org.joda.time.DurationFieldType.YEARS);

	static final org.joda.time.DurationFieldType MONTHS_TYPE = new org.joda.time.DurationFieldType.StandardDurationFieldType("months", org.joda.time.DurationFieldType.MONTHS);

	static final org.joda.time.DurationFieldType WEEKS_TYPE = new org.joda.time.DurationFieldType.StandardDurationFieldType("weeks", org.joda.time.DurationFieldType.WEEKS);

	static final org.joda.time.DurationFieldType DAYS_TYPE = new org.joda.time.DurationFieldType.StandardDurationFieldType("days", org.joda.time.DurationFieldType.DAYS);

	static final org.joda.time.DurationFieldType HALFDAYS_TYPE = new org.joda.time.DurationFieldType.StandardDurationFieldType("halfdays", org.joda.time.DurationFieldType.HALFDAYS);

	static final org.joda.time.DurationFieldType HOURS_TYPE = new org.joda.time.DurationFieldType.StandardDurationFieldType("hours", org.joda.time.DurationFieldType.HOURS);

	static final org.joda.time.DurationFieldType MINUTES_TYPE = new org.joda.time.DurationFieldType.StandardDurationFieldType("minutes", org.joda.time.DurationFieldType.MINUTES);

	static final org.joda.time.DurationFieldType SECONDS_TYPE = new org.joda.time.DurationFieldType.StandardDurationFieldType("seconds", org.joda.time.DurationFieldType.SECONDS);

	static final org.joda.time.DurationFieldType MILLIS_TYPE = new org.joda.time.DurationFieldType.StandardDurationFieldType("millis", org.joda.time.DurationFieldType.MILLIS);

	private final java.lang.String iName;

	protected DurationFieldType(java.lang.String name) {
		super();
		iName = name;
	}

	public static org.joda.time.DurationFieldType millis() {
		return org.joda.time.DurationFieldType.MILLIS_TYPE;
	}

	public static org.joda.time.DurationFieldType seconds() {
		return org.joda.time.DurationFieldType.SECONDS_TYPE;
	}

	public static org.joda.time.DurationFieldType minutes() {
		return org.joda.time.DurationFieldType.MINUTES_TYPE;
	}

	public static org.joda.time.DurationFieldType hours() {
		return org.joda.time.DurationFieldType.HOURS_TYPE;
	}

	public static org.joda.time.DurationFieldType halfdays() {
		return org.joda.time.DurationFieldType.HALFDAYS_TYPE;
	}

	public static org.joda.time.DurationFieldType days() {
		return org.joda.time.DurationFieldType.DAYS_TYPE;
	}

	public static org.joda.time.DurationFieldType weeks() {
		return org.joda.time.DurationFieldType.WEEKS_TYPE;
	}

	public static org.joda.time.DurationFieldType weekyears() {
		return org.joda.time.DurationFieldType.WEEKYEARS_TYPE;
	}

	public static org.joda.time.DurationFieldType months() {
		return org.joda.time.DurationFieldType.MONTHS_TYPE;
	}

	public static org.joda.time.DurationFieldType years() {
		return org.joda.time.DurationFieldType.YEARS_TYPE;
	}

	public static org.joda.time.DurationFieldType centuries() {
		return org.joda.time.DurationFieldType.CENTURIES_TYPE;
	}

	public static org.joda.time.DurationFieldType eras() {
		return org.joda.time.DurationFieldType.ERAS_TYPE;
	}

	public java.lang.String getName() {
		return iName;
	}

	public abstract org.joda.time.DurationField getField(org.joda.time.Chronology chronology);

	public boolean isSupported(org.joda.time.Chronology chronology) {
		return getField(chronology).isSupported();
	}

	public java.lang.String toString() {
		return getName();
	}

	private static class StandardDurationFieldType extends org.joda.time.DurationFieldType {
		private static final long serialVersionUID = 31156755687123L;

		private final byte iOrdinal;

		StandardDurationFieldType(java.lang.String name, byte ordinal) {
			super(name);
			iOrdinal = ordinal;
		}

		@java.lang.Override
		public boolean equals(java.lang.Object obj) {
			if ((org.joda.time.DurationFieldType.StandardDurationFieldType.this) == obj) {
				return true;
			}
			if (obj instanceof org.joda.time.DurationFieldType.StandardDurationFieldType) {
				return (iOrdinal) == (((org.joda.time.DurationFieldType.StandardDurationFieldType) (obj)).iOrdinal);
			}
			return false;
		}

		@java.lang.Override
		public int hashCode() {
			return iOrdinal;
		}

		public org.joda.time.DurationField getField(org.joda.time.Chronology chronology) {
			chronology = org.joda.time.DateTimeUtils.getChronology(chronology);
			switch (iOrdinal) {
				case org.joda.time.DurationFieldType.ERAS :
					return chronology.eras();
				case org.joda.time.DurationFieldType.CENTURIES :
					return chronology.centuries();
				case org.joda.time.DurationFieldType.WEEKYEARS :
					return chronology.weekyears();
				case org.joda.time.DurationFieldType.YEARS :
					return chronology.years();
				case org.joda.time.DurationFieldType.MONTHS :
					return chronology.months();
				case org.joda.time.DurationFieldType.WEEKS :
					return chronology.weeks();
				case org.joda.time.DurationFieldType.DAYS :
					return chronology.days();
				case org.joda.time.DurationFieldType.HALFDAYS :
					return chronology.halfdays();
				case org.joda.time.DurationFieldType.HOURS :
					return chronology.hours();
				case org.joda.time.DurationFieldType.MINUTES :
					return chronology.minutes();
				case org.joda.time.DurationFieldType.SECONDS :
					return chronology.seconds();
				case org.joda.time.DurationFieldType.MILLIS :
					return chronology.millis();
				default :
					throw new java.lang.InternalError();
			}
		}

		private java.lang.Object readResolve() {
			switch (iOrdinal) {
				case org.joda.time.DurationFieldType.ERAS :
					return org.joda.time.DurationFieldType.ERAS_TYPE;
				case org.joda.time.DurationFieldType.CENTURIES :
					return org.joda.time.DurationFieldType.CENTURIES_TYPE;
				case org.joda.time.DurationFieldType.WEEKYEARS :
					return org.joda.time.DurationFieldType.WEEKYEARS_TYPE;
				case org.joda.time.DurationFieldType.YEARS :
					return org.joda.time.DurationFieldType.YEARS_TYPE;
				case org.joda.time.DurationFieldType.MONTHS :
					return org.joda.time.DurationFieldType.MONTHS_TYPE;
				case org.joda.time.DurationFieldType.WEEKS :
					return org.joda.time.DurationFieldType.WEEKS_TYPE;
				case org.joda.time.DurationFieldType.DAYS :
					return org.joda.time.DurationFieldType.DAYS_TYPE;
				case org.joda.time.DurationFieldType.HALFDAYS :
					return org.joda.time.DurationFieldType.HALFDAYS_TYPE;
				case org.joda.time.DurationFieldType.HOURS :
					return org.joda.time.DurationFieldType.HOURS_TYPE;
				case org.joda.time.DurationFieldType.MINUTES :
					return org.joda.time.DurationFieldType.MINUTES_TYPE;
				case org.joda.time.DurationFieldType.SECONDS :
					return org.joda.time.DurationFieldType.SECONDS_TYPE;
				case org.joda.time.DurationFieldType.MILLIS :
					return org.joda.time.DurationFieldType.MILLIS_TYPE;
				default :
					return org.joda.time.DurationFieldType.StandardDurationFieldType.this;
			}
		}
	}
}


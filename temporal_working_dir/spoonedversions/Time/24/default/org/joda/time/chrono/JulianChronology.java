

package org.joda.time.chrono;


public final class JulianChronology extends org.joda.time.chrono.BasicGJChronology {
	private static final long serialVersionUID = -8731039522547897247L;

	private static final long MILLIS_PER_YEAR = ((long) (365.25 * (org.joda.time.DateTimeConstants.MILLIS_PER_DAY)));

	private static final long MILLIS_PER_MONTH = ((long) ((365.25 * (org.joda.time.DateTimeConstants.MILLIS_PER_DAY)) / 12));

	private static final int MIN_YEAR = -292269054;

	private static final int MAX_YEAR = 292272992;

	private static final org.joda.time.chrono.JulianChronology INSTANCE_UTC;

	private static final java.util.Map<org.joda.time.DateTimeZone, org.joda.time.chrono.JulianChronology[]> cCache = new java.util.HashMap<org.joda.time.DateTimeZone, org.joda.time.chrono.JulianChronology[]>();

	static {
		INSTANCE_UTC = org.joda.time.chrono.JulianChronology.getInstance(org.joda.time.DateTimeZone.UTC);
	}

	static int adjustYearForSet(int year) {
		if (year <= 0) {
			if (year == 0) {
				throw new org.joda.time.IllegalFieldValueException(org.joda.time.DateTimeFieldType.year(), new java.lang.Integer(year), null, null);
			}
			year++;
		}
		return year;
	}

	public static org.joda.time.chrono.JulianChronology getInstanceUTC() {
		return org.joda.time.chrono.JulianChronology.INSTANCE_UTC;
	}

	public static org.joda.time.chrono.JulianChronology getInstance() {
		return org.joda.time.chrono.JulianChronology.getInstance(org.joda.time.DateTimeZone.getDefault(), 4);
	}

	public static org.joda.time.chrono.JulianChronology getInstance(org.joda.time.DateTimeZone zone) {
		return org.joda.time.chrono.JulianChronology.getInstance(zone, 4);
	}

	public static org.joda.time.chrono.JulianChronology getInstance(org.joda.time.DateTimeZone zone, int minDaysInFirstWeek) {
		if (zone == null) {
			zone = org.joda.time.DateTimeZone.getDefault();
		}
		org.joda.time.chrono.JulianChronology chrono;
		synchronized(org.joda.time.chrono.JulianChronology.cCache) {
			org.joda.time.chrono.JulianChronology[] chronos = org.joda.time.chrono.JulianChronology.cCache.get(zone);
			if (chronos == null) {
				chronos = new org.joda.time.chrono.JulianChronology[7];
				org.joda.time.chrono.JulianChronology.cCache.put(zone, chronos);
			}
			try {
				chrono = chronos[(minDaysInFirstWeek - 1)];
			} catch (java.lang.ArrayIndexOutOfBoundsException e) {
				throw new java.lang.IllegalArgumentException(("Invalid min days in first week: " + minDaysInFirstWeek));
			}
			if (chrono == null) {
				if (zone == (org.joda.time.DateTimeZone.UTC)) {
					chrono = new org.joda.time.chrono.JulianChronology(null, null, minDaysInFirstWeek);
				}else {
					chrono = org.joda.time.chrono.JulianChronology.getInstance(org.joda.time.DateTimeZone.UTC, minDaysInFirstWeek);
					chrono = new org.joda.time.chrono.JulianChronology(org.joda.time.chrono.ZonedChronology.getInstance(chrono, zone), null, minDaysInFirstWeek);
				}
				chronos[(minDaysInFirstWeek - 1)] = chrono;
			}
		}
		return chrono;
	}

	JulianChronology(org.joda.time.Chronology base, java.lang.Object param, int minDaysInFirstWeek) {
		super(base, param, minDaysInFirstWeek);
	}

	private java.lang.Object readResolve() {
		org.joda.time.Chronology base = getBase();
		int minDays = getMinimumDaysInFirstWeek();
		minDays = (minDays == 0) ? 4 : minDays;
		return base == null ? org.joda.time.chrono.JulianChronology.getInstance(org.joda.time.DateTimeZone.UTC, minDays) : org.joda.time.chrono.JulianChronology.getInstance(base.getZone(), minDays);
	}

	public org.joda.time.Chronology withUTC() {
		return org.joda.time.chrono.JulianChronology.INSTANCE_UTC;
	}

	public org.joda.time.Chronology withZone(org.joda.time.DateTimeZone zone) {
		if (zone == null) {
			zone = org.joda.time.DateTimeZone.getDefault();
		}
		if (zone == (getZone())) {
			return org.joda.time.chrono.JulianChronology.this;
		}
		return org.joda.time.chrono.JulianChronology.getInstance(zone);
	}

	long getDateMidnightMillis(int year, int monthOfYear, int dayOfMonth) throws java.lang.IllegalArgumentException {
		return super.getDateMidnightMillis(org.joda.time.chrono.JulianChronology.adjustYearForSet(year), monthOfYear, dayOfMonth);
	}

	boolean isLeapYear(int year) {
		return (year & 3) == 0;
	}

	long calculateFirstDayOfYearMillis(int year) {
		int relativeYear = year - 1968;
		int leapYears;
		if (relativeYear <= 0) {
			leapYears = (relativeYear + 3) >> 2;
		}else {
			leapYears = relativeYear >> 2;
			if (!(isLeapYear(year))) {
				leapYears++;
			}
		}
		long millis = ((relativeYear * 365L) + leapYears) * ((long) (org.joda.time.DateTimeConstants.MILLIS_PER_DAY));
		return millis - ((366L + 352) * (org.joda.time.DateTimeConstants.MILLIS_PER_DAY));
	}

	int getMinYear() {
		return org.joda.time.chrono.JulianChronology.MIN_YEAR;
	}

	int getMaxYear() {
		return org.joda.time.chrono.JulianChronology.MAX_YEAR;
	}

	long getAverageMillisPerYear() {
		return org.joda.time.chrono.JulianChronology.MILLIS_PER_YEAR;
	}

	long getAverageMillisPerYearDividedByTwo() {
		return (org.joda.time.chrono.JulianChronology.MILLIS_PER_YEAR) / 2;
	}

	long getAverageMillisPerMonth() {
		return org.joda.time.chrono.JulianChronology.MILLIS_PER_MONTH;
	}

	long getApproxMillisAtEpochDividedByTwo() {
		return ((1969L * (org.joda.time.chrono.JulianChronology.MILLIS_PER_YEAR)) + (352L * (org.joda.time.DateTimeConstants.MILLIS_PER_DAY))) / 2;
	}

	protected void assemble(org.joda.time.chrono.AssembledChronology.Fields fields) {
		if ((getBase()) == null) {
			super.assemble(fields);
			fields.year = new org.joda.time.field.SkipDateTimeField(org.joda.time.chrono.JulianChronology.this, fields.year);
			fields.weekyear = new org.joda.time.field.SkipDateTimeField(org.joda.time.chrono.JulianChronology.this, fields.weekyear);
		}
	}
}


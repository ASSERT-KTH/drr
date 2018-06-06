

package org.joda.time.chrono;


public final class GregorianChronology extends org.joda.time.chrono.BasicGJChronology {
	private static final long serialVersionUID = -861407383323710522L;

	private static final long MILLIS_PER_YEAR = ((long) (365.2425 * (org.joda.time.DateTimeConstants.MILLIS_PER_DAY)));

	private static final long MILLIS_PER_MONTH = ((long) ((365.2425 * (org.joda.time.DateTimeConstants.MILLIS_PER_DAY)) / 12));

	private static final int DAYS_0000_TO_1970 = 719527;

	private static final int MIN_YEAR = -292275054;

	private static final int MAX_YEAR = 292278993;

	private static final org.joda.time.chrono.GregorianChronology INSTANCE_UTC;

	private static final java.util.Map<org.joda.time.DateTimeZone, org.joda.time.chrono.GregorianChronology[]> cCache = new java.util.HashMap<org.joda.time.DateTimeZone, org.joda.time.chrono.GregorianChronology[]>();

	static {
		INSTANCE_UTC = org.joda.time.chrono.GregorianChronology.getInstance(org.joda.time.DateTimeZone.UTC);
	}

	public static org.joda.time.chrono.GregorianChronology getInstanceUTC() {
		return org.joda.time.chrono.GregorianChronology.INSTANCE_UTC;
	}

	public static org.joda.time.chrono.GregorianChronology getInstance() {
		return org.joda.time.chrono.GregorianChronology.getInstance(org.joda.time.DateTimeZone.getDefault(), 4);
	}

	public static org.joda.time.chrono.GregorianChronology getInstance(org.joda.time.DateTimeZone zone) {
		return org.joda.time.chrono.GregorianChronology.getInstance(zone, 4);
	}

	public static org.joda.time.chrono.GregorianChronology getInstance(org.joda.time.DateTimeZone zone, int minDaysInFirstWeek) {
		if (zone == null) {
			zone = org.joda.time.DateTimeZone.getDefault();
		}
		org.joda.time.chrono.GregorianChronology chrono;
		synchronized(org.joda.time.chrono.GregorianChronology.cCache) {
			org.joda.time.chrono.GregorianChronology[] chronos = org.joda.time.chrono.GregorianChronology.cCache.get(zone);
			if (chronos == null) {
				chronos = new org.joda.time.chrono.GregorianChronology[7];
				org.joda.time.chrono.GregorianChronology.cCache.put(zone, chronos);
			}
			try {
				chrono = chronos[(minDaysInFirstWeek - 1)];
			} catch (java.lang.ArrayIndexOutOfBoundsException e) {
				throw new java.lang.IllegalArgumentException(("Invalid min days in first week: " + minDaysInFirstWeek));
			}
			if (chrono == null) {
				if (zone == (org.joda.time.DateTimeZone.UTC)) {
					chrono = new org.joda.time.chrono.GregorianChronology(null, null, minDaysInFirstWeek);
				}else {
					chrono = org.joda.time.chrono.GregorianChronology.getInstance(org.joda.time.DateTimeZone.UTC, minDaysInFirstWeek);
					chrono = new org.joda.time.chrono.GregorianChronology(org.joda.time.chrono.ZonedChronology.getInstance(chrono, zone), null, minDaysInFirstWeek);
				}
				chronos[(minDaysInFirstWeek - 1)] = chrono;
			}
		}
		return chrono;
	}

	private GregorianChronology(org.joda.time.Chronology base, java.lang.Object param, int minDaysInFirstWeek) {
		super(base, param, minDaysInFirstWeek);
	}

	private java.lang.Object readResolve() {
		org.joda.time.Chronology base = getBase();
		int minDays = getMinimumDaysInFirstWeek();
		minDays = (minDays == 0) ? 4 : minDays;
		return base == null ? org.joda.time.chrono.GregorianChronology.getInstance(org.joda.time.DateTimeZone.UTC, minDays) : org.joda.time.chrono.GregorianChronology.getInstance(base.getZone(), minDays);
	}

	public org.joda.time.Chronology withUTC() {
		return org.joda.time.chrono.GregorianChronology.INSTANCE_UTC;
	}

	public org.joda.time.Chronology withZone(org.joda.time.DateTimeZone zone) {
		if (zone == null) {
			zone = org.joda.time.DateTimeZone.getDefault();
		}
		if (zone == (getZone())) {
			return org.joda.time.chrono.GregorianChronology.this;
		}
		return org.joda.time.chrono.GregorianChronology.getInstance(zone);
	}

	protected void assemble(org.joda.time.chrono.AssembledChronology.Fields fields) {
		if ((getBase()) == null) {
			super.assemble(fields);
		}
	}

	boolean isLeapYear(int year) {
		return ((year & 3) == 0) && (((year % 100) != 0) || ((year % 400) == 0));
	}

	long calculateFirstDayOfYearMillis(int year) {
		int leapYears = year / 100;
		if (year < 0) {
			leapYears = ((((year + 3) >> 2) - leapYears) + ((leapYears + 3) >> 2)) - 1;
		}else {
			leapYears = ((year >> 2) - leapYears) + (leapYears >> 2);
			if (isLeapYear(year)) {
				leapYears--;
			}
		}
		return ((year * 365L) + (leapYears - (org.joda.time.chrono.GregorianChronology.DAYS_0000_TO_1970))) * (org.joda.time.DateTimeConstants.MILLIS_PER_DAY);
	}

	int getMinYear() {
		return org.joda.time.chrono.GregorianChronology.MIN_YEAR;
	}

	int getMaxYear() {
		return org.joda.time.chrono.GregorianChronology.MAX_YEAR;
	}

	long getAverageMillisPerYear() {
		return org.joda.time.chrono.GregorianChronology.MILLIS_PER_YEAR;
	}

	long getAverageMillisPerYearDividedByTwo() {
		return (org.joda.time.chrono.GregorianChronology.MILLIS_PER_YEAR) / 2;
	}

	long getAverageMillisPerMonth() {
		return org.joda.time.chrono.GregorianChronology.MILLIS_PER_MONTH;
	}

	long getApproxMillisAtEpochDividedByTwo() {
		return (1970L * (org.joda.time.chrono.GregorianChronology.MILLIS_PER_YEAR)) / 2;
	}
}


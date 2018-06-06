

package org.joda.time.chrono;


public final class IslamicChronology extends org.joda.time.chrono.BasicChronology {
	private static final long serialVersionUID = -3663823829888L;

	public static final int AH = org.joda.time.DateTimeConstants.CE;

	private static final org.joda.time.DateTimeField ERA_FIELD = new org.joda.time.chrono.BasicSingleEraDateTimeField("AH");

	public static final org.joda.time.chrono.IslamicChronology.LeapYearPatternType LEAP_YEAR_15_BASED = new org.joda.time.chrono.IslamicChronology.LeapYearPatternType(0, 623158436);

	public static final org.joda.time.chrono.IslamicChronology.LeapYearPatternType LEAP_YEAR_16_BASED = new org.joda.time.chrono.IslamicChronology.LeapYearPatternType(1, 623191204);

	public static final org.joda.time.chrono.IslamicChronology.LeapYearPatternType LEAP_YEAR_INDIAN = new org.joda.time.chrono.IslamicChronology.LeapYearPatternType(2, 690562340);

	public static final org.joda.time.chrono.IslamicChronology.LeapYearPatternType LEAP_YEAR_HABASH_AL_HASIB = new org.joda.time.chrono.IslamicChronology.LeapYearPatternType(3, 153692453);

	private static final int MIN_YEAR = -292269337;

	private static final int MAX_YEAR = 292271022;

	private static final int MONTH_PAIR_LENGTH = 59;

	private static final int LONG_MONTH_LENGTH = 30;

	private static final int SHORT_MONTH_LENGTH = 29;

	private static final long MILLIS_PER_MONTH_PAIR = 59L * (org.joda.time.DateTimeConstants.MILLIS_PER_DAY);

	private static final long MILLIS_PER_MONTH = ((long) (29.53056 * (org.joda.time.DateTimeConstants.MILLIS_PER_DAY)));

	private static final long MILLIS_PER_LONG_MONTH = 30L * (org.joda.time.DateTimeConstants.MILLIS_PER_DAY);

	private static final long MILLIS_PER_YEAR = ((long) (354.36667 * (org.joda.time.DateTimeConstants.MILLIS_PER_DAY)));

	private static final long MILLIS_PER_SHORT_YEAR = 354L * (org.joda.time.DateTimeConstants.MILLIS_PER_DAY);

	private static final long MILLIS_PER_LONG_YEAR = 355L * (org.joda.time.DateTimeConstants.MILLIS_PER_DAY);

	private static final long MILLIS_YEAR_1 = -42521587200000L;

	private static final int CYCLE = 30;

	private static final long MILLIS_PER_CYCLE = ((19L * 354L) + (11L * 355L)) * (org.joda.time.DateTimeConstants.MILLIS_PER_DAY);

	private static final java.util.Map<org.joda.time.DateTimeZone, org.joda.time.chrono.IslamicChronology[]> cCache = new java.util.HashMap<org.joda.time.DateTimeZone, org.joda.time.chrono.IslamicChronology[]>();

	private static final org.joda.time.chrono.IslamicChronology INSTANCE_UTC;

	static {
		INSTANCE_UTC = org.joda.time.chrono.IslamicChronology.getInstance(org.joda.time.DateTimeZone.UTC);
	}

	private final org.joda.time.chrono.IslamicChronology.LeapYearPatternType iLeapYears;

	public static org.joda.time.chrono.IslamicChronology getInstanceUTC() {
		return org.joda.time.chrono.IslamicChronology.INSTANCE_UTC;
	}

	public static org.joda.time.chrono.IslamicChronology getInstance() {
		return org.joda.time.chrono.IslamicChronology.getInstance(org.joda.time.DateTimeZone.getDefault(), org.joda.time.chrono.IslamicChronology.LEAP_YEAR_16_BASED);
	}

	public static org.joda.time.chrono.IslamicChronology getInstance(org.joda.time.DateTimeZone zone) {
		return org.joda.time.chrono.IslamicChronology.getInstance(zone, org.joda.time.chrono.IslamicChronology.LEAP_YEAR_16_BASED);
	}

	public static org.joda.time.chrono.IslamicChronology getInstance(org.joda.time.DateTimeZone zone, org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYears) {
		if (zone == null) {
			zone = org.joda.time.DateTimeZone.getDefault();
		}
		org.joda.time.chrono.IslamicChronology chrono;
		synchronized(org.joda.time.chrono.IslamicChronology.cCache) {
			org.joda.time.chrono.IslamicChronology[] chronos = org.joda.time.chrono.IslamicChronology.cCache.get(zone);
			if (chronos == null) {
				chronos = new org.joda.time.chrono.IslamicChronology[4];
				org.joda.time.chrono.IslamicChronology.cCache.put(zone, chronos);
			}
			chrono = chronos[leapYears.index];
			if (chrono == null) {
				if (zone == (org.joda.time.DateTimeZone.UTC)) {
					chrono = new org.joda.time.chrono.IslamicChronology(null, null, leapYears);
					org.joda.time.DateTime lowerLimit = new org.joda.time.DateTime(1, 1, 1, 0, 0, 0, 0, chrono);
					chrono = new org.joda.time.chrono.IslamicChronology(org.joda.time.chrono.LimitChronology.getInstance(chrono, lowerLimit, null), null, leapYears);
				}else {
					chrono = org.joda.time.chrono.IslamicChronology.getInstance(org.joda.time.DateTimeZone.UTC, leapYears);
					chrono = new org.joda.time.chrono.IslamicChronology(org.joda.time.chrono.ZonedChronology.getInstance(chrono, zone), null, leapYears);
				}
				chronos[leapYears.index] = chrono;
			}
		}
		return chrono;
	}

	IslamicChronology(org.joda.time.Chronology base, java.lang.Object param, org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYears) {
		super(base, param, 4);
		this.iLeapYears = leapYears;
	}

	private java.lang.Object readResolve() {
		org.joda.time.Chronology base = getBase();
		return base == null ? org.joda.time.chrono.IslamicChronology.getInstanceUTC() : org.joda.time.chrono.IslamicChronology.getInstance(base.getZone());
	}

	public org.joda.time.chrono.IslamicChronology.LeapYearPatternType getLeapYearPatternType() {
		return iLeapYears;
	}

	public org.joda.time.Chronology withUTC() {
		return org.joda.time.chrono.IslamicChronology.INSTANCE_UTC;
	}

	public org.joda.time.Chronology withZone(org.joda.time.DateTimeZone zone) {
		if (zone == null) {
			zone = org.joda.time.DateTimeZone.getDefault();
		}
		if (zone == (getZone())) {
			return org.joda.time.chrono.IslamicChronology.this;
		}
		return org.joda.time.chrono.IslamicChronology.getInstance(zone);
	}

	public int hashCode() {
		return ((super.hashCode()) * 13) + (getLeapYearPatternType().hashCode());
	}

	int getYear(long instant) {
		long millisIslamic = instant - (org.joda.time.chrono.IslamicChronology.MILLIS_YEAR_1);
		long cycles = millisIslamic / (org.joda.time.chrono.IslamicChronology.MILLIS_PER_CYCLE);
		long cycleRemainder = millisIslamic % (org.joda.time.chrono.IslamicChronology.MILLIS_PER_CYCLE);
		int year = ((int) ((cycles * (org.joda.time.chrono.IslamicChronology.CYCLE)) + 1L));
		long yearMillis = isLeapYear(year) ? org.joda.time.chrono.IslamicChronology.MILLIS_PER_LONG_YEAR : org.joda.time.chrono.IslamicChronology.MILLIS_PER_SHORT_YEAR;
		while (cycleRemainder >= yearMillis) {
			cycleRemainder -= yearMillis;
			yearMillis = (isLeapYear((++year))) ? org.joda.time.chrono.IslamicChronology.MILLIS_PER_LONG_YEAR : org.joda.time.chrono.IslamicChronology.MILLIS_PER_SHORT_YEAR;
		} 
		return year;
	}

	long setYear(long instant, int year) {
		int thisYear = getYear(instant);
		int dayOfYear = getDayOfYear(instant, thisYear);
		int millisOfDay = getMillisOfDay(instant);
		if (dayOfYear > 354) {
			if (!(isLeapYear(year))) {
				dayOfYear--;
			}
		}
		instant = getYearMonthDayMillis(year, 1, dayOfYear);
		instant += millisOfDay;
		return instant;
	}

	long getYearDifference(long minuendInstant, long subtrahendInstant) {
		int minuendYear = getYear(minuendInstant);
		int subtrahendYear = getYear(subtrahendInstant);
		long minuendRem = minuendInstant - (getYearMillis(minuendYear));
		long subtrahendRem = subtrahendInstant - (getYearMillis(subtrahendYear));
		int difference = minuendYear - subtrahendYear;
		if (minuendRem < subtrahendRem) {
			difference--;
		}
		return difference;
	}

	long getTotalMillisByYearMonth(int year, int month) {
		if (((--month) % 2) == 1) {
			month /= 2;
			return (month * (org.joda.time.chrono.IslamicChronology.MILLIS_PER_MONTH_PAIR)) + (org.joda.time.chrono.IslamicChronology.MILLIS_PER_LONG_MONTH);
		}else {
			month /= 2;
			return month * (org.joda.time.chrono.IslamicChronology.MILLIS_PER_MONTH_PAIR);
		}
	}

	int getDayOfMonth(long millis) {
		int doy = (getDayOfYear(millis)) - 1;
		if (doy == 354) {
			return 30;
		}
		return ((doy % (org.joda.time.chrono.IslamicChronology.MONTH_PAIR_LENGTH)) % (org.joda.time.chrono.IslamicChronology.LONG_MONTH_LENGTH)) + 1;
	}

	boolean isLeapYear(int year) {
		return iLeapYears.isLeapYear(year);
	}

	int getDaysInYearMax() {
		return 355;
	}

	int getDaysInYear(int year) {
		return isLeapYear(year) ? 355 : 354;
	}

	int getDaysInYearMonth(int year, int month) {
		if ((month == 12) && (isLeapYear(year))) {
			return org.joda.time.chrono.IslamicChronology.LONG_MONTH_LENGTH;
		}
		return ((--month) % 2) == 0 ? org.joda.time.chrono.IslamicChronology.LONG_MONTH_LENGTH : org.joda.time.chrono.IslamicChronology.SHORT_MONTH_LENGTH;
	}

	int getDaysInMonthMax() {
		return org.joda.time.chrono.IslamicChronology.LONG_MONTH_LENGTH;
	}

	int getDaysInMonthMax(int month) {
		if (month == 12) {
			return org.joda.time.chrono.IslamicChronology.LONG_MONTH_LENGTH;
		}
		return ((--month) % 2) == 0 ? org.joda.time.chrono.IslamicChronology.LONG_MONTH_LENGTH : org.joda.time.chrono.IslamicChronology.SHORT_MONTH_LENGTH;
	}

	int getMonthOfYear(long millis, int year) {
		int doyZeroBased = ((int) ((millis - (getYearMillis(year))) / (org.joda.time.DateTimeConstants.MILLIS_PER_DAY)));
		if (doyZeroBased == 354) {
			return 12;
		}
		return ((doyZeroBased * 2) / (org.joda.time.chrono.IslamicChronology.MONTH_PAIR_LENGTH)) + 1;
	}

	long getAverageMillisPerYear() {
		return org.joda.time.chrono.IslamicChronology.MILLIS_PER_YEAR;
	}

	long getAverageMillisPerYearDividedByTwo() {
		return (org.joda.time.chrono.IslamicChronology.MILLIS_PER_YEAR) / 2;
	}

	long getAverageMillisPerMonth() {
		return org.joda.time.chrono.IslamicChronology.MILLIS_PER_MONTH;
	}

	long calculateFirstDayOfYearMillis(int year) {
		if (year > (org.joda.time.chrono.IslamicChronology.MAX_YEAR)) {
			throw new java.lang.ArithmeticException(((("Year is too large: " + year) + " > ") + (org.joda.time.chrono.IslamicChronology.MAX_YEAR)));
		}
		if (year < (org.joda.time.chrono.IslamicChronology.MIN_YEAR)) {
			throw new java.lang.ArithmeticException(((("Year is too small: " + year) + " < ") + (org.joda.time.chrono.IslamicChronology.MIN_YEAR)));
		}
		year--;
		long cycle = year / (org.joda.time.chrono.IslamicChronology.CYCLE);
		long millis = (org.joda.time.chrono.IslamicChronology.MILLIS_YEAR_1) + (cycle * (org.joda.time.chrono.IslamicChronology.MILLIS_PER_CYCLE));
		int cycleRemainder = (year % (org.joda.time.chrono.IslamicChronology.CYCLE)) + 1;
		for (int i = 1; i < cycleRemainder; i++) {
			millis += (isLeapYear(i)) ? org.joda.time.chrono.IslamicChronology.MILLIS_PER_LONG_YEAR : org.joda.time.chrono.IslamicChronology.MILLIS_PER_SHORT_YEAR;
		}
		return millis;
	}

	int getMinYear() {
		return 1;
	}

	int getMaxYear() {
		return org.joda.time.chrono.IslamicChronology.MAX_YEAR;
	}

	long getApproxMillisAtEpochDividedByTwo() {
		return (-(org.joda.time.chrono.IslamicChronology.MILLIS_YEAR_1)) / 2;
	}

	protected void assemble(org.joda.time.chrono.AssembledChronology.Fields fields) {
		if ((getBase()) == null) {
			super.assemble(fields);
			fields.era = org.joda.time.chrono.IslamicChronology.ERA_FIELD;
			fields.monthOfYear = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(org.joda.time.chrono.IslamicChronology.this, 12);
			fields.months = fields.monthOfYear.getDurationField();
		}
	}

	public static class LeapYearPatternType implements java.io.Serializable {
		private static final long serialVersionUID = 26581275372698L;

		final byte index;

		final int pattern;

		LeapYearPatternType(int index, int pattern) {
			super();
			this.index = ((byte) (index));
			this.pattern = pattern;
		}

		boolean isLeapYear(int year) {
			int key = 1 << (year % 30);
			return ((pattern) & key) > 0;
		}

		private java.lang.Object readResolve() {
			switch (index) {
				case 0 :
					return org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
				case 1 :
					return org.joda.time.chrono.IslamicChronology.LEAP_YEAR_16_BASED;
				case 2 :
					return org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
				case 3 :
					return org.joda.time.chrono.IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
				default :
					return org.joda.time.chrono.IslamicChronology.LeapYearPatternType.this;
			}
		}
	}
}


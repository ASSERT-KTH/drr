

package org.joda.time.chrono;


public final class EthiopicChronology extends org.joda.time.chrono.BasicFixedMonthChronology {
	private static final long serialVersionUID = -5972804258688333942L;

	public static final int EE = org.joda.time.DateTimeConstants.CE;

	private static final org.joda.time.DateTimeField ERA_FIELD = new org.joda.time.chrono.BasicSingleEraDateTimeField("EE");

	private static final int MIN_YEAR = -292269337;

	private static final int MAX_YEAR = 292272984;

	private static final java.util.Map<org.joda.time.DateTimeZone, org.joda.time.chrono.EthiopicChronology[]> cCache = new java.util.HashMap<org.joda.time.DateTimeZone, org.joda.time.chrono.EthiopicChronology[]>();

	private static final org.joda.time.chrono.EthiopicChronology INSTANCE_UTC;

	static {
		INSTANCE_UTC = org.joda.time.chrono.EthiopicChronology.getInstance(org.joda.time.DateTimeZone.UTC);
	}

	public static org.joda.time.chrono.EthiopicChronology getInstanceUTC() {
		return org.joda.time.chrono.EthiopicChronology.INSTANCE_UTC;
	}

	public static org.joda.time.chrono.EthiopicChronology getInstance() {
		return org.joda.time.chrono.EthiopicChronology.getInstance(org.joda.time.DateTimeZone.getDefault(), 4);
	}

	public static org.joda.time.chrono.EthiopicChronology getInstance(org.joda.time.DateTimeZone zone) {
		return org.joda.time.chrono.EthiopicChronology.getInstance(zone, 4);
	}

	public static org.joda.time.chrono.EthiopicChronology getInstance(org.joda.time.DateTimeZone zone, int minDaysInFirstWeek) {
		if (zone == null) {
			zone = org.joda.time.DateTimeZone.getDefault();
		}
		org.joda.time.chrono.EthiopicChronology chrono;
		synchronized(org.joda.time.chrono.EthiopicChronology.cCache) {
			org.joda.time.chrono.EthiopicChronology[] chronos = org.joda.time.chrono.EthiopicChronology.cCache.get(zone);
			if (chronos == null) {
				chronos = new org.joda.time.chrono.EthiopicChronology[7];
				org.joda.time.chrono.EthiopicChronology.cCache.put(zone, chronos);
			}
			try {
				chrono = chronos[(minDaysInFirstWeek - 1)];
			} catch (java.lang.ArrayIndexOutOfBoundsException e) {
				throw new java.lang.IllegalArgumentException(("Invalid min days in first week: " + minDaysInFirstWeek));
			}
			if (chrono == null) {
				if (zone == (org.joda.time.DateTimeZone.UTC)) {
					chrono = new org.joda.time.chrono.EthiopicChronology(null, null, minDaysInFirstWeek);
					org.joda.time.DateTime lowerLimit = new org.joda.time.DateTime(1, 1, 1, 0, 0, 0, 0, chrono);
					chrono = new org.joda.time.chrono.EthiopicChronology(org.joda.time.chrono.LimitChronology.getInstance(chrono, lowerLimit, null), null, minDaysInFirstWeek);
				}else {
					chrono = org.joda.time.chrono.EthiopicChronology.getInstance(org.joda.time.DateTimeZone.UTC, minDaysInFirstWeek);
					chrono = new org.joda.time.chrono.EthiopicChronology(org.joda.time.chrono.ZonedChronology.getInstance(chrono, zone), null, minDaysInFirstWeek);
				}
				chronos[(minDaysInFirstWeek - 1)] = chrono;
			}
		}
		return chrono;
	}

	EthiopicChronology(org.joda.time.Chronology base, java.lang.Object param, int minDaysInFirstWeek) {
		super(base, param, minDaysInFirstWeek);
	}

	private java.lang.Object readResolve() {
		org.joda.time.Chronology base = getBase();
		return base == null ? org.joda.time.chrono.EthiopicChronology.getInstance(org.joda.time.DateTimeZone.UTC, getMinimumDaysInFirstWeek()) : org.joda.time.chrono.EthiopicChronology.getInstance(base.getZone(), getMinimumDaysInFirstWeek());
	}

	public org.joda.time.Chronology withUTC() {
		return org.joda.time.chrono.EthiopicChronology.INSTANCE_UTC;
	}

	public org.joda.time.Chronology withZone(org.joda.time.DateTimeZone zone) {
		if (zone == null) {
			zone = org.joda.time.DateTimeZone.getDefault();
		}
		if (zone == (getZone())) {
			return org.joda.time.chrono.EthiopicChronology.this;
		}
		return org.joda.time.chrono.EthiopicChronology.getInstance(zone);
	}

	long calculateFirstDayOfYearMillis(int year) {
		int relativeYear = year - 1963;
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
		return millis + ((365L - 112) * (org.joda.time.DateTimeConstants.MILLIS_PER_DAY));
	}

	int getMinYear() {
		return org.joda.time.chrono.EthiopicChronology.MIN_YEAR;
	}

	int getMaxYear() {
		return org.joda.time.chrono.EthiopicChronology.MAX_YEAR;
	}

	long getApproxMillisAtEpochDividedByTwo() {
		return ((1962L * (org.joda.time.chrono.BasicFixedMonthChronology.MILLIS_PER_YEAR)) + (112L * (org.joda.time.DateTimeConstants.MILLIS_PER_DAY))) / 2;
	}

	protected void assemble(org.joda.time.chrono.AssembledChronology.Fields fields) {
		if ((getBase()) == null) {
			super.assemble(fields);
			fields.year = new org.joda.time.field.SkipDateTimeField(org.joda.time.chrono.EthiopicChronology.this, fields.year);
			fields.weekyear = new org.joda.time.field.SkipDateTimeField(org.joda.time.chrono.EthiopicChronology.this, fields.weekyear);
			fields.era = org.joda.time.chrono.EthiopicChronology.ERA_FIELD;
			fields.monthOfYear = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(org.joda.time.chrono.EthiopicChronology.this, 13);
			fields.months = fields.monthOfYear.getDurationField();
		}
	}
}


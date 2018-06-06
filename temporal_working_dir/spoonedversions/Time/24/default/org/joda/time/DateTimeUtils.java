

package org.joda.time;


public class DateTimeUtils {
	private static final org.joda.time.DateTimeUtils.SystemMillisProvider SYSTEM_MILLIS_PROVIDER = new org.joda.time.DateTimeUtils.SystemMillisProvider();

	private static volatile org.joda.time.DateTimeUtils.MillisProvider cMillisProvider = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;

	protected DateTimeUtils() {
		super();
	}

	public static final long currentTimeMillis() {
		return org.joda.time.DateTimeUtils.cMillisProvider.getMillis();
	}

	public static final void setCurrentMillisSystem() throws java.lang.SecurityException {
		org.joda.time.DateTimeUtils.checkPermission();
		org.joda.time.DateTimeUtils.cMillisProvider = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
	}

	public static final void setCurrentMillisFixed(long fixedMillis) throws java.lang.SecurityException {
		org.joda.time.DateTimeUtils.checkPermission();
		org.joda.time.DateTimeUtils.cMillisProvider = new org.joda.time.DateTimeUtils.FixedMillisProvider(fixedMillis);
	}

	public static final void setCurrentMillisOffset(long offsetMillis) throws java.lang.SecurityException {
		org.joda.time.DateTimeUtils.checkPermission();
		if (offsetMillis == 0) {
			org.joda.time.DateTimeUtils.cMillisProvider = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
		}else {
			org.joda.time.DateTimeUtils.cMillisProvider = new org.joda.time.DateTimeUtils.OffsetMillisProvider(offsetMillis);
		}
	}

	public static final void setCurrentMillisProvider(org.joda.time.DateTimeUtils.MillisProvider millisProvider) throws java.lang.SecurityException {
		if (millisProvider == null) {
			throw new java.lang.IllegalArgumentException("The MillisProvider must not be null");
		}
		org.joda.time.DateTimeUtils.checkPermission();
		org.joda.time.DateTimeUtils.cMillisProvider = millisProvider;
	}

	private static void checkPermission() throws java.lang.SecurityException {
		java.lang.SecurityManager sm = java.lang.System.getSecurityManager();
		if (sm != null) {
			sm.checkPermission(new org.joda.time.JodaTimePermission("CurrentTime.setProvider"));
		}
	}

	public static final long getInstantMillis(org.joda.time.ReadableInstant instant) {
		if (instant == null) {
			return org.joda.time.DateTimeUtils.currentTimeMillis();
		}
		return instant.getMillis();
	}

	public static final org.joda.time.Chronology getInstantChronology(org.joda.time.ReadableInstant instant) {
		if (instant == null) {
			return org.joda.time.chrono.ISOChronology.getInstance();
		}
		org.joda.time.Chronology chrono = instant.getChronology();
		if (chrono == null) {
			return org.joda.time.chrono.ISOChronology.getInstance();
		}
		return chrono;
	}

	public static final org.joda.time.Chronology getIntervalChronology(org.joda.time.ReadableInstant start, org.joda.time.ReadableInstant end) {
		org.joda.time.Chronology chrono = null;
		if (start != null) {
			chrono = start.getChronology();
		}else
			if (end != null) {
				chrono = end.getChronology();
			}
		
		if (chrono == null) {
			chrono = org.joda.time.chrono.ISOChronology.getInstance();
		}
		return chrono;
	}

	public static final org.joda.time.Chronology getIntervalChronology(org.joda.time.ReadableInterval interval) {
		if (interval == null) {
			return org.joda.time.chrono.ISOChronology.getInstance();
		}
		org.joda.time.Chronology chrono = interval.getChronology();
		if (chrono == null) {
			return org.joda.time.chrono.ISOChronology.getInstance();
		}
		return chrono;
	}

	public static final org.joda.time.ReadableInterval getReadableInterval(org.joda.time.ReadableInterval interval) {
		if (interval == null) {
			long now = org.joda.time.DateTimeUtils.currentTimeMillis();
			interval = new org.joda.time.Interval(now, now);
		}
		return interval;
	}

	public static final org.joda.time.Chronology getChronology(org.joda.time.Chronology chrono) {
		if (chrono == null) {
			return org.joda.time.chrono.ISOChronology.getInstance();
		}
		return chrono;
	}

	public static final org.joda.time.DateTimeZone getZone(org.joda.time.DateTimeZone zone) {
		if (zone == null) {
			return org.joda.time.DateTimeZone.getDefault();
		}
		return zone;
	}

	public static final org.joda.time.PeriodType getPeriodType(org.joda.time.PeriodType type) {
		if (type == null) {
			return org.joda.time.PeriodType.standard();
		}
		return type;
	}

	public static final long getDurationMillis(org.joda.time.ReadableDuration duration) {
		if (duration == null) {
			return 0L;
		}
		return duration.getMillis();
	}

	public static final boolean isContiguous(org.joda.time.ReadablePartial partial) {
		if (partial == null) {
			throw new java.lang.IllegalArgumentException("Partial must not be null");
		}
		org.joda.time.DurationFieldType lastType = null;
		for (int i = 0; i < (partial.size()); i++) {
			org.joda.time.DateTimeField loopField = partial.getField(i);
			if (i > 0) {
				if ((loopField.getRangeDurationField().getType()) != lastType) {
					return false;
				}
			}
			lastType = loopField.getDurationField().getType();
		}
		return true;
	}

	public static final java.text.DateFormatSymbols getDateFormatSymbols(java.util.Locale locale) {
		try {
			java.lang.reflect.Method method = java.text.DateFormatSymbols.class.getMethod("getInstance", new java.lang.Class[]{ java.util.Locale.class });
			return ((java.text.DateFormatSymbols) (method.invoke(null, new java.lang.Object[]{ locale })));
		} catch (java.lang.Exception ex) {
			return new java.text.DateFormatSymbols(locale);
		}
	}

	public static interface MillisProvider {
		long getMillis();
	}

	static class SystemMillisProvider implements org.joda.time.DateTimeUtils.MillisProvider {
		public long getMillis() {
			return java.lang.System.currentTimeMillis();
		}
	}

	static class FixedMillisProvider implements org.joda.time.DateTimeUtils.MillisProvider {
		private final long iMillis;

		FixedMillisProvider(long fixedMillis) {
			iMillis = fixedMillis;
		}

		public long getMillis() {
			return iMillis;
		}
	}

	static class OffsetMillisProvider implements org.joda.time.DateTimeUtils.MillisProvider {
		private final long iMillis;

		OffsetMillisProvider(long offsetMillis) {
			iMillis = offsetMillis;
		}

		public long getMillis() {
			return (java.lang.System.currentTimeMillis()) + (iMillis);
		}
	}
}


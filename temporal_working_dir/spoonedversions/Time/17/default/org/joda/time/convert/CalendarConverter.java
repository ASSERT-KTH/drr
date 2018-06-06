

package org.joda.time.convert;


final class CalendarConverter extends org.joda.time.convert.AbstractConverter implements org.joda.time.convert.InstantConverter , org.joda.time.convert.PartialConverter {
	static final org.joda.time.convert.CalendarConverter INSTANCE = new org.joda.time.convert.CalendarConverter();

	protected CalendarConverter() {
		super();
	}

	public org.joda.time.Chronology getChronology(java.lang.Object object, org.joda.time.Chronology chrono) {
		if (chrono != null) {
			return chrono;
		}
		java.util.Calendar cal = ((java.util.Calendar) (object));
		org.joda.time.DateTimeZone zone = null;
		try {
			zone = org.joda.time.DateTimeZone.forTimeZone(cal.getTimeZone());
		} catch (java.lang.IllegalArgumentException ex) {
			zone = org.joda.time.DateTimeZone.getDefault();
		}
		return getChronology(cal, zone);
	}

	public org.joda.time.Chronology getChronology(java.lang.Object object, org.joda.time.DateTimeZone zone) {
		if (object.getClass().getName().endsWith(".BuddhistCalendar")) {
			return org.joda.time.chrono.BuddhistChronology.getInstance(zone);
		}else
			if (object instanceof java.util.GregorianCalendar) {
				java.util.GregorianCalendar gc = ((java.util.GregorianCalendar) (object));
				long cutover = gc.getGregorianChange().getTime();
				if (cutover == (java.lang.Long.MIN_VALUE)) {
					return org.joda.time.chrono.GregorianChronology.getInstance(zone);
				}else
					if (cutover == (java.lang.Long.MAX_VALUE)) {
						return org.joda.time.chrono.JulianChronology.getInstance(zone);
					}else {
						return org.joda.time.chrono.GJChronology.getInstance(zone, cutover, 4);
					}
				
			}else {
				return org.joda.time.chrono.ISOChronology.getInstance(zone);
			}
		
	}

	public long getInstantMillis(java.lang.Object object, org.joda.time.Chronology chrono) {
		java.util.Calendar calendar = ((java.util.Calendar) (object));
		return calendar.getTime().getTime();
	}

	public java.lang.Class<?> getSupportedType() {
		return java.util.Calendar.class;
	}
}


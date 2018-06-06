

package org.joda.time.convert;


class ReadableInstantConverter extends org.joda.time.convert.AbstractConverter implements org.joda.time.convert.InstantConverter , org.joda.time.convert.PartialConverter {
	static final org.joda.time.convert.ReadableInstantConverter INSTANCE = new org.joda.time.convert.ReadableInstantConverter();

	protected ReadableInstantConverter() {
		super();
	}

	public org.joda.time.Chronology getChronology(java.lang.Object object, org.joda.time.DateTimeZone zone) {
		org.joda.time.Chronology chrono = ((org.joda.time.ReadableInstant) (object)).getChronology();
		if (chrono == null) {
			return org.joda.time.chrono.ISOChronology.getInstance(zone);
		}
		org.joda.time.DateTimeZone chronoZone = chrono.getZone();
		if (chronoZone != zone) {
			chrono = chrono.withZone(zone);
			if (chrono == null) {
				return org.joda.time.chrono.ISOChronology.getInstance(zone);
			}
		}
		return chrono;
	}

	public org.joda.time.Chronology getChronology(java.lang.Object object, org.joda.time.Chronology chrono) {
		if (chrono == null) {
			chrono = ((org.joda.time.ReadableInstant) (object)).getChronology();
			chrono = org.joda.time.DateTimeUtils.getChronology(chrono);
		}
		return chrono;
	}

	public long getInstantMillis(java.lang.Object object, org.joda.time.Chronology chrono) {
		return ((org.joda.time.ReadableInstant) (object)).getMillis();
	}

	public java.lang.Class<?> getSupportedType() {
		return org.joda.time.ReadableInstant.class;
	}
}


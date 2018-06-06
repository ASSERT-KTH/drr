

package org.joda.time.convert;


public abstract class AbstractConverter implements org.joda.time.convert.Converter {
	protected AbstractConverter() {
		super();
	}

	public long getInstantMillis(java.lang.Object object, org.joda.time.Chronology chrono) {
		return org.joda.time.DateTimeUtils.currentTimeMillis();
	}

	public org.joda.time.Chronology getChronology(java.lang.Object object, org.joda.time.DateTimeZone zone) {
		return org.joda.time.chrono.ISOChronology.getInstance(zone);
	}

	public org.joda.time.Chronology getChronology(java.lang.Object object, org.joda.time.Chronology chrono) {
		return org.joda.time.DateTimeUtils.getChronology(chrono);
	}

	public int[] getPartialValues(org.joda.time.ReadablePartial fieldSource, java.lang.Object object, org.joda.time.Chronology chrono) {
		long instant = getInstantMillis(object, chrono);
		return chrono.get(fieldSource, instant);
	}

	public int[] getPartialValues(org.joda.time.ReadablePartial fieldSource, java.lang.Object object, org.joda.time.Chronology chrono, org.joda.time.format.DateTimeFormatter parser) {
		return getPartialValues(fieldSource, object, chrono);
	}

	public org.joda.time.PeriodType getPeriodType(java.lang.Object object) {
		return org.joda.time.PeriodType.standard();
	}

	public boolean isReadableInterval(java.lang.Object object, org.joda.time.Chronology chrono) {
		return false;
	}

	public java.lang.String toString() {
		return ("Converter[" + ((getSupportedType()) == null ? "null" : getSupportedType().getName())) + "]";
	}
}


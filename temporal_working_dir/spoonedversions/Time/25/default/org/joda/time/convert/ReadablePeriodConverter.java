

package org.joda.time.convert;


class ReadablePeriodConverter extends org.joda.time.convert.AbstractConverter implements org.joda.time.convert.PeriodConverter {
	static final org.joda.time.convert.ReadablePeriodConverter INSTANCE = new org.joda.time.convert.ReadablePeriodConverter();

	protected ReadablePeriodConverter() {
		super();
	}

	public void setInto(org.joda.time.ReadWritablePeriod duration, java.lang.Object object, org.joda.time.Chronology chrono) {
		duration.setPeriod(((org.joda.time.ReadablePeriod) (object)));
	}

	public org.joda.time.PeriodType getPeriodType(java.lang.Object object) {
		org.joda.time.ReadablePeriod period = ((org.joda.time.ReadablePeriod) (object));
		return period.getPeriodType();
	}

	public java.lang.Class<?> getSupportedType() {
		return org.joda.time.ReadablePeriod.class;
	}
}


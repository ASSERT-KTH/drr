

package org.joda.time.convert;


final class DateConverter extends org.joda.time.convert.AbstractConverter implements org.joda.time.convert.InstantConverter , org.joda.time.convert.PartialConverter {
	static final org.joda.time.convert.DateConverter INSTANCE = new org.joda.time.convert.DateConverter();

	protected DateConverter() {
		super();
	}

	public long getInstantMillis(java.lang.Object object, org.joda.time.Chronology chrono) {
		java.util.Date date = ((java.util.Date) (object));
		return date.getTime();
	}

	public java.lang.Class<?> getSupportedType() {
		return java.util.Date.class;
	}
}


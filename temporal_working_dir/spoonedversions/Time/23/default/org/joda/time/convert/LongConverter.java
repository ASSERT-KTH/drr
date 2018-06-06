

package org.joda.time.convert;


class LongConverter extends org.joda.time.convert.AbstractConverter implements org.joda.time.convert.DurationConverter , org.joda.time.convert.InstantConverter , org.joda.time.convert.PartialConverter {
	static final org.joda.time.convert.LongConverter INSTANCE = new org.joda.time.convert.LongConverter();

	protected LongConverter() {
		super();
	}

	public long getInstantMillis(java.lang.Object object, org.joda.time.Chronology chrono) {
		return ((java.lang.Long) (object)).longValue();
	}

	public long getDurationMillis(java.lang.Object object) {
		return ((java.lang.Long) (object)).longValue();
	}

	public java.lang.Class<?> getSupportedType() {
		return java.lang.Long.class;
	}
}


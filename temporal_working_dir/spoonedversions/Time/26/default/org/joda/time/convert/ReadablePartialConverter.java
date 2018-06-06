

package org.joda.time.convert;


class ReadablePartialConverter extends org.joda.time.convert.AbstractConverter implements org.joda.time.convert.PartialConverter {
	static final org.joda.time.convert.ReadablePartialConverter INSTANCE = new org.joda.time.convert.ReadablePartialConverter();

	protected ReadablePartialConverter() {
		super();
	}

	public org.joda.time.Chronology getChronology(java.lang.Object object, org.joda.time.DateTimeZone zone) {
		return getChronology(object, ((org.joda.time.Chronology) (null))).withZone(zone);
	}

	public org.joda.time.Chronology getChronology(java.lang.Object object, org.joda.time.Chronology chrono) {
		if (chrono == null) {
			chrono = ((org.joda.time.ReadablePartial) (object)).getChronology();
			chrono = org.joda.time.DateTimeUtils.getChronology(chrono);
		}
		return chrono;
	}

	public int[] getPartialValues(org.joda.time.ReadablePartial fieldSource, java.lang.Object object, org.joda.time.Chronology chrono) {
		org.joda.time.ReadablePartial input = ((org.joda.time.ReadablePartial) (object));
		int size = fieldSource.size();
		int[] values = new int[size];
		for (int i = 0; i < size; i++) {
			values[i] = input.get(fieldSource.getFieldType(i));
		}
		chrono.validate(fieldSource, values);
		return values;
	}

	public java.lang.Class<?> getSupportedType() {
		return org.joda.time.ReadablePartial.class;
	}
}


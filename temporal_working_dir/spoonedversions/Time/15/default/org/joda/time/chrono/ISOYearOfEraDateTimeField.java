

package org.joda.time.chrono;


class ISOYearOfEraDateTimeField extends org.joda.time.field.DecoratedDateTimeField {
	private static final long serialVersionUID = 7037524068969447317L;

	static final org.joda.time.DateTimeField INSTANCE = new org.joda.time.chrono.ISOYearOfEraDateTimeField();

	private ISOYearOfEraDateTimeField() {
		super(org.joda.time.chrono.GregorianChronology.getInstanceUTC().year(), org.joda.time.DateTimeFieldType.yearOfEra());
	}

	public int get(long instant) {
		int year = getWrappedField().get(instant);
		return year < 0 ? -year : year;
	}

	public long add(long instant, int years) {
		return getWrappedField().add(instant, years);
	}

	public long add(long instant, long years) {
		return getWrappedField().add(instant, years);
	}

	public long addWrapField(long instant, int years) {
		return getWrappedField().addWrapField(instant, years);
	}

	public int[] addWrapField(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, int years) {
		return getWrappedField().addWrapField(instant, fieldIndex, values, years);
	}

	public int getDifference(long minuendInstant, long subtrahendInstant) {
		return getWrappedField().getDifference(minuendInstant, subtrahendInstant);
	}

	public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
		return getWrappedField().getDifferenceAsLong(minuendInstant, subtrahendInstant);
	}

	public long set(long instant, int year) {
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.chrono.ISOYearOfEraDateTimeField.this, year, 0, getMaximumValue());
		if ((getWrappedField().get(instant)) < 0) {
			year = -year;
		}
		return super.set(instant, year);
	}

	public int getMinimumValue() {
		return 0;
	}

	public int getMaximumValue() {
		return getWrappedField().getMaximumValue();
	}

	public long roundFloor(long instant) {
		return getWrappedField().roundFloor(instant);
	}

	public long roundCeiling(long instant) {
		return getWrappedField().roundCeiling(instant);
	}

	public long remainder(long instant) {
		return getWrappedField().remainder(instant);
	}

	private java.lang.Object readResolve() {
		return org.joda.time.chrono.ISOYearOfEraDateTimeField.INSTANCE;
	}
}


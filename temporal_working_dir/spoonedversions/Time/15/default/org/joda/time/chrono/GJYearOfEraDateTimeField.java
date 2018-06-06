

package org.joda.time.chrono;


final class GJYearOfEraDateTimeField extends org.joda.time.field.DecoratedDateTimeField {
	private static final long serialVersionUID = -5961050944769862059L;

	private final org.joda.time.chrono.BasicChronology iChronology;

	GJYearOfEraDateTimeField(org.joda.time.DateTimeField yearField, org.joda.time.chrono.BasicChronology chronology) {
		super(yearField, org.joda.time.DateTimeFieldType.yearOfEra());
		iChronology = chronology;
	}

	public int get(long instant) {
		int year = getWrappedField().get(instant);
		if (year <= 0) {
			year = 1 - year;
		}
		return year;
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
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.chrono.GJYearOfEraDateTimeField.this, year, 1, getMaximumValue());
		if ((iChronology.getYear(instant)) <= 0) {
			year = 1 - year;
		}
		return super.set(instant, year);
	}

	public int getMinimumValue() {
		return 1;
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
		return iChronology.yearOfEra();
	}
}


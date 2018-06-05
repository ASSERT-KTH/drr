

package org.joda.time.field;


public class RemainderDateTimeField extends org.joda.time.field.DecoratedDateTimeField {
	private static final long serialVersionUID = 5708241235177666790L;

	final int iDivisor;

	final org.joda.time.DurationField iRangeField;

	public RemainderDateTimeField(org.joda.time.DateTimeField field, org.joda.time.DateTimeFieldType type, int divisor) {
		super(field, type);
		if (divisor < 2) {
			throw new java.lang.IllegalArgumentException("The divisor must be at least 2");
		}
		org.joda.time.DurationField rangeField = field.getDurationField();
		if (rangeField == null) {
			iRangeField = null;
		}else {
			iRangeField = new org.joda.time.field.ScaledDurationField(rangeField, type.getRangeDurationType(), divisor);
		}
		iDivisor = divisor;
	}

	public RemainderDateTimeField(org.joda.time.field.DividedDateTimeField dividedField) {
		this(dividedField, dividedField.getType());
	}

	public RemainderDateTimeField(org.joda.time.field.DividedDateTimeField dividedField, org.joda.time.DateTimeFieldType type) {
		super(dividedField.getWrappedField(), type);
		iDivisor = dividedField.iDivisor;
		iRangeField = dividedField.iDurationField;
	}

	public int get(long instant) {
		int value = getWrappedField().get(instant);
		if (value >= 0) {
			return value % (iDivisor);
		}else {
			return ((iDivisor) - 1) + ((value + 1) % (iDivisor));
		}
	}

	public long addWrapField(long instant, int amount) {
		return set(instant, org.joda.time.field.FieldUtils.getWrappedValue(get(instant), amount, 0, ((iDivisor) - 1)));
	}

	public long set(long instant, int value) {
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.field.RemainderDateTimeField.this, value, 0, ((iDivisor) - 1));
		int divided = getDivided(getWrappedField().get(instant));
		return getWrappedField().set(instant, ((divided * (iDivisor)) + value));
	}

	public org.joda.time.DurationField getRangeDurationField() {
		return iRangeField;
	}

	public int getMinimumValue() {
		return 0;
	}

	public int getMaximumValue() {
		return (iDivisor) - 1;
	}

	public long roundFloor(long instant) {
		return getWrappedField().roundFloor(instant);
	}

	public long roundCeiling(long instant) {
		return getWrappedField().roundCeiling(instant);
	}

	public long roundHalfFloor(long instant) {
		return getWrappedField().roundHalfFloor(instant);
	}

	public long roundHalfCeiling(long instant) {
		return getWrappedField().roundHalfCeiling(instant);
	}

	public long roundHalfEven(long instant) {
		return getWrappedField().roundHalfEven(instant);
	}

	public long remainder(long instant) {
		return getWrappedField().remainder(instant);
	}

	public int getDivisor() {
		return iDivisor;
	}

	private int getDivided(int value) {
		if (value >= 0) {
			return value / (iDivisor);
		}else {
			return ((value + 1) / (iDivisor)) - 1;
		}
	}
}


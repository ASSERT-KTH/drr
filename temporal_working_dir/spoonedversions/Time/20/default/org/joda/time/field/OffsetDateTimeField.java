

package org.joda.time.field;


public class OffsetDateTimeField extends org.joda.time.field.DecoratedDateTimeField {
	private static final long serialVersionUID = 3145790132623583142L;

	private final int iOffset;

	private final int iMin;

	private final int iMax;

	public OffsetDateTimeField(org.joda.time.DateTimeField field, int offset) {
		this(field, (field == null ? null : field.getType()), offset, java.lang.Integer.MIN_VALUE, java.lang.Integer.MAX_VALUE);
	}

	public OffsetDateTimeField(org.joda.time.DateTimeField field, org.joda.time.DateTimeFieldType type, int offset) {
		this(field, type, offset, java.lang.Integer.MIN_VALUE, java.lang.Integer.MAX_VALUE);
	}

	public OffsetDateTimeField(org.joda.time.DateTimeField field, org.joda.time.DateTimeFieldType type, int offset, int minValue, int maxValue) {
		super(field, type);
		if (offset == 0) {
			throw new java.lang.IllegalArgumentException("The offset cannot be zero");
		}
		iOffset = offset;
		if (minValue < ((field.getMinimumValue()) + offset)) {
			iMin = (field.getMinimumValue()) + offset;
		}else {
			iMin = minValue;
		}
		if (maxValue > ((field.getMaximumValue()) + offset)) {
			iMax = (field.getMaximumValue()) + offset;
		}else {
			iMax = maxValue;
		}
	}

	public int get(long instant) {
		return (super.get(instant)) + (iOffset);
	}

	public long add(long instant, int amount) {
		instant = super.add(instant, amount);
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.field.OffsetDateTimeField.this, get(instant), iMin, iMax);
		return instant;
	}

	public long add(long instant, long amount) {
		instant = super.add(instant, amount);
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.field.OffsetDateTimeField.this, get(instant), iMin, iMax);
		return instant;
	}

	public long addWrapField(long instant, int amount) {
		return set(instant, org.joda.time.field.FieldUtils.getWrappedValue(get(instant), amount, iMin, iMax));
	}

	public long set(long instant, int value) {
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.field.OffsetDateTimeField.this, value, iMin, iMax);
		return super.set(instant, (value - (iOffset)));
	}

	public boolean isLeap(long instant) {
		return getWrappedField().isLeap(instant);
	}

	public int getLeapAmount(long instant) {
		return getWrappedField().getLeapAmount(instant);
	}

	public org.joda.time.DurationField getLeapDurationField() {
		return getWrappedField().getLeapDurationField();
	}

	public int getMinimumValue() {
		return iMin;
	}

	public int getMaximumValue() {
		return iMax;
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

	public int getOffset() {
		return iOffset;
	}
}




package org.joda.time.field;


public abstract class PreciseDurationDateTimeField extends org.joda.time.field.BaseDateTimeField {
	private static final long serialVersionUID = 5004523158306266035L;

	final long iUnitMillis;

	private final org.joda.time.DurationField iUnitField;

	public PreciseDurationDateTimeField(org.joda.time.DateTimeFieldType type, org.joda.time.DurationField unit) {
		super(type);
		if (!(unit.isPrecise())) {
			throw new java.lang.IllegalArgumentException("Unit duration field must be precise");
		}
		iUnitMillis = unit.getUnitMillis();
		if ((iUnitMillis) < 1) {
			throw new java.lang.IllegalArgumentException("The unit milliseconds must be at least 1");
		}
		iUnitField = unit;
	}

	public boolean isLenient() {
		return false;
	}

	public long set(long instant, int value) {
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.field.PreciseDurationDateTimeField.this, value, getMinimumValue(), getMaximumValueForSet(instant, value));
		return instant + ((value - (get(instant))) * (iUnitMillis));
	}

	public long roundFloor(long instant) {
		if (instant >= 0) {
			return instant - (instant % (iUnitMillis));
		}else {
			instant += 1;
			return (instant - (instant % (iUnitMillis))) - (iUnitMillis);
		}
	}

	public long roundCeiling(long instant) {
		if (instant > 0) {
			instant -= 1;
			return (instant - (instant % (iUnitMillis))) + (iUnitMillis);
		}else {
			return instant - (instant % (iUnitMillis));
		}
	}

	public long remainder(long instant) {
		if (instant >= 0) {
			return instant % (iUnitMillis);
		}else {
			return (((instant + 1) % (iUnitMillis)) + (iUnitMillis)) - 1;
		}
	}

	public org.joda.time.DurationField getDurationField() {
		return iUnitField;
	}

	public int getMinimumValue() {
		return 0;
	}

	public final long getUnitMillis() {
		return iUnitMillis;
	}

	protected int getMaximumValueForSet(long instant, int value) {
		return getMaximumValue(instant);
	}
}


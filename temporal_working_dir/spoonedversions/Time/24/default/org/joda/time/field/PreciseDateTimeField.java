

package org.joda.time.field;


public class PreciseDateTimeField extends org.joda.time.field.PreciseDurationDateTimeField {
	private static final long serialVersionUID = -5586801265774496376L;

	private final int iRange;

	private final org.joda.time.DurationField iRangeField;

	public PreciseDateTimeField(org.joda.time.DateTimeFieldType type, org.joda.time.DurationField unit, org.joda.time.DurationField range) {
		super(type, unit);
		if (!(range.isPrecise())) {
			throw new java.lang.IllegalArgumentException("Range duration field must be precise");
		}
		long rangeMillis = range.getUnitMillis();
		iRange = ((int) (rangeMillis / (getUnitMillis())));
		if ((iRange) < 2) {
			throw new java.lang.IllegalArgumentException("The effective range must be at least 2");
		}
		iRangeField = range;
	}

	public int get(long instant) {
		if (instant >= 0) {
			return ((int) ((instant / (getUnitMillis())) % (iRange)));
		}else {
			return ((iRange) - 1) + ((int) (((instant + 1) / (getUnitMillis())) % (iRange)));
		}
	}

	public long addWrapField(long instant, int amount) {
		int thisValue = get(instant);
		int wrappedValue = org.joda.time.field.FieldUtils.getWrappedValue(thisValue, amount, getMinimumValue(), getMaximumValue());
		return instant + ((wrappedValue - thisValue) * (getUnitMillis()));
	}

	public long set(long instant, int value) {
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.field.PreciseDateTimeField.this, value, getMinimumValue(), getMaximumValue());
		return instant + ((value - (get(instant))) * (iUnitMillis));
	}

	public org.joda.time.DurationField getRangeDurationField() {
		return iRangeField;
	}

	public int getMaximumValue() {
		return (iRange) - 1;
	}

	public int getRange() {
		return iRange;
	}
}


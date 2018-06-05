

package org.joda.time.field;


public abstract class BaseDurationField extends org.joda.time.DurationField implements java.io.Serializable {
	private static final long serialVersionUID = -2554245107589433218L;

	private final org.joda.time.DurationFieldType iType;

	protected BaseDurationField(org.joda.time.DurationFieldType type) {
		super();
		if (type == null) {
			throw new java.lang.IllegalArgumentException("The type must not be null");
		}
		iType = type;
	}

	public final org.joda.time.DurationFieldType getType() {
		return iType;
	}

	public final java.lang.String getName() {
		return iType.getName();
	}

	public final boolean isSupported() {
		return true;
	}

	public int getValue(long duration) {
		return org.joda.time.field.FieldUtils.safeToInt(getValueAsLong(duration));
	}

	public long getValueAsLong(long duration) {
		return duration / (getUnitMillis());
	}

	public int getValue(long duration, long instant) {
		return org.joda.time.field.FieldUtils.safeToInt(getValueAsLong(duration, instant));
	}

	public long getMillis(int value) {
		return value * (getUnitMillis());
	}

	public long getMillis(long value) {
		return org.joda.time.field.FieldUtils.safeMultiply(value, getUnitMillis());
	}

	public int getDifference(long minuendInstant, long subtrahendInstant) {
		return org.joda.time.field.FieldUtils.safeToInt(getDifferenceAsLong(minuendInstant, subtrahendInstant));
	}

	public int compareTo(org.joda.time.DurationField otherField) {
		long otherMillis = otherField.getUnitMillis();
		long thisMillis = getUnitMillis();
		if (thisMillis == otherMillis) {
			return 0;
		}
		if (thisMillis < otherMillis) {
			return -1;
		}else {
			return 1;
		}
	}

	public java.lang.String toString() {
		return ("DurationField[" + (getName())) + ']';
	}
}


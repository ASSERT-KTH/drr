

package org.joda.time.field;


public final class MillisDurationField extends org.joda.time.DurationField implements java.io.Serializable {
	private static final long serialVersionUID = 2656707858124633367L;

	public static final org.joda.time.DurationField INSTANCE = new org.joda.time.field.MillisDurationField();

	private MillisDurationField() {
		super();
	}

	public org.joda.time.DurationFieldType getType() {
		return org.joda.time.DurationFieldType.millis();
	}

	public java.lang.String getName() {
		return "millis";
	}

	public boolean isSupported() {
		return true;
	}

	public final boolean isPrecise() {
		return true;
	}

	public final long getUnitMillis() {
		return 1;
	}

	public int getValue(long duration) {
		return org.joda.time.field.FieldUtils.safeToInt(duration);
	}

	public long getValueAsLong(long duration) {
		return duration;
	}

	public int getValue(long duration, long instant) {
		return org.joda.time.field.FieldUtils.safeToInt(duration);
	}

	public long getValueAsLong(long duration, long instant) {
		return duration;
	}

	public long getMillis(int value) {
		return value;
	}

	public long getMillis(long value) {
		return value;
	}

	public long getMillis(int value, long instant) {
		return value;
	}

	public long getMillis(long value, long instant) {
		return value;
	}

	public long add(long instant, int value) {
		return org.joda.time.field.FieldUtils.safeAdd(instant, value);
	}

	public long add(long instant, long value) {
		return org.joda.time.field.FieldUtils.safeAdd(instant, value);
	}

	public int getDifference(long minuendInstant, long subtrahendInstant) {
		return org.joda.time.field.FieldUtils.safeToInt(org.joda.time.field.FieldUtils.safeSubtract(minuendInstant, subtrahendInstant));
	}

	public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
		return org.joda.time.field.FieldUtils.safeSubtract(minuendInstant, subtrahendInstant);
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

	public boolean equals(java.lang.Object obj) {
		if (obj instanceof org.joda.time.field.MillisDurationField) {
			return (getUnitMillis()) == (((org.joda.time.field.MillisDurationField) (obj)).getUnitMillis());
		}
		return false;
	}

	public int hashCode() {
		return ((int) (getUnitMillis()));
	}

	public java.lang.String toString() {
		return "DurationField[millis]";
	}

	private java.lang.Object readResolve() {
		return org.joda.time.field.MillisDurationField.INSTANCE;
	}
}


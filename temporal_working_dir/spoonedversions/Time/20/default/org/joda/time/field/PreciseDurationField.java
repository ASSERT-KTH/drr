

package org.joda.time.field;


public class PreciseDurationField extends org.joda.time.field.BaseDurationField {
	private static final long serialVersionUID = -8346152187724495365L;

	private final long iUnitMillis;

	public PreciseDurationField(org.joda.time.DurationFieldType type, long unitMillis) {
		super(type);
		iUnitMillis = unitMillis;
	}

	public final boolean isPrecise() {
		return true;
	}

	public final long getUnitMillis() {
		return iUnitMillis;
	}

	public long getValueAsLong(long duration, long instant) {
		return duration / (iUnitMillis);
	}

	public long getMillis(int value, long instant) {
		return value * (iUnitMillis);
	}

	public long getMillis(long value, long instant) {
		return org.joda.time.field.FieldUtils.safeMultiply(value, iUnitMillis);
	}

	public long add(long instant, int value) {
		long addition = value * (iUnitMillis);
		return org.joda.time.field.FieldUtils.safeAdd(instant, addition);
	}

	public long add(long instant, long value) {
		long addition = org.joda.time.field.FieldUtils.safeMultiply(value, iUnitMillis);
		return org.joda.time.field.FieldUtils.safeAdd(instant, addition);
	}

	public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
		long difference = org.joda.time.field.FieldUtils.safeSubtract(minuendInstant, subtrahendInstant);
		return difference / (iUnitMillis);
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.joda.time.field.PreciseDurationField.this) == obj) {
			return true;
		}else
			if (obj instanceof org.joda.time.field.PreciseDurationField) {
				org.joda.time.field.PreciseDurationField other = ((org.joda.time.field.PreciseDurationField) (obj));
				return ((getType()) == (other.getType())) && ((iUnitMillis) == (other.iUnitMillis));
			}
		
		return false;
	}

	public int hashCode() {
		long millis = iUnitMillis;
		int hash = ((int) (millis ^ (millis >>> 32)));
		hash += getType().hashCode();
		return hash;
	}
}


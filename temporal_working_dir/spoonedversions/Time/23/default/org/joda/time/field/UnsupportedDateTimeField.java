

package org.joda.time.field;


public final class UnsupportedDateTimeField extends org.joda.time.DateTimeField implements java.io.Serializable {
	private static final long serialVersionUID = -1934618396111902255L;

	private static java.util.HashMap<org.joda.time.DateTimeFieldType, org.joda.time.field.UnsupportedDateTimeField> cCache;

	public static synchronized org.joda.time.field.UnsupportedDateTimeField getInstance(org.joda.time.DateTimeFieldType type, org.joda.time.DurationField durationField) {
		org.joda.time.field.UnsupportedDateTimeField field;
		if ((org.joda.time.field.UnsupportedDateTimeField.cCache) == null) {
			org.joda.time.field.UnsupportedDateTimeField.cCache = new java.util.HashMap<org.joda.time.DateTimeFieldType, org.joda.time.field.UnsupportedDateTimeField>(7);
			field = null;
		}else {
			field = org.joda.time.field.UnsupportedDateTimeField.cCache.get(type);
			if ((field != null) && ((field.getDurationField()) != durationField)) {
				field = null;
			}
		}
		if (field == null) {
			field = new org.joda.time.field.UnsupportedDateTimeField(type, durationField);
			org.joda.time.field.UnsupportedDateTimeField.cCache.put(type, field);
		}
		return field;
	}

	private final org.joda.time.DateTimeFieldType iType;

	private final org.joda.time.DurationField iDurationField;

	private UnsupportedDateTimeField(org.joda.time.DateTimeFieldType type, org.joda.time.DurationField durationField) {
		if ((type == null) || (durationField == null)) {
			throw new java.lang.IllegalArgumentException();
		}
		iType = type;
		iDurationField = durationField;
	}

	public org.joda.time.DateTimeFieldType getType() {
		return iType;
	}

	public java.lang.String getName() {
		return iType.getName();
	}

	public boolean isSupported() {
		return false;
	}

	public boolean isLenient() {
		return false;
	}

	public int get(long instant) {
		throw unsupported();
	}

	public java.lang.String getAsText(long instant, java.util.Locale locale) {
		throw unsupported();
	}

	public java.lang.String getAsText(long instant) {
		throw unsupported();
	}

	public java.lang.String getAsText(org.joda.time.ReadablePartial partial, int fieldValue, java.util.Locale locale) {
		throw unsupported();
	}

	public java.lang.String getAsText(org.joda.time.ReadablePartial partial, java.util.Locale locale) {
		throw unsupported();
	}

	public java.lang.String getAsText(int fieldValue, java.util.Locale locale) {
		throw unsupported();
	}

	public java.lang.String getAsShortText(long instant, java.util.Locale locale) {
		throw unsupported();
	}

	public java.lang.String getAsShortText(long instant) {
		throw unsupported();
	}

	public java.lang.String getAsShortText(org.joda.time.ReadablePartial partial, int fieldValue, java.util.Locale locale) {
		throw unsupported();
	}

	public java.lang.String getAsShortText(org.joda.time.ReadablePartial partial, java.util.Locale locale) {
		throw unsupported();
	}

	public java.lang.String getAsShortText(int fieldValue, java.util.Locale locale) {
		throw unsupported();
	}

	public long add(long instant, int value) {
		return getDurationField().add(instant, value);
	}

	public long add(long instant, long value) {
		return getDurationField().add(instant, value);
	}

	public int[] add(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {
		throw unsupported();
	}

	public int[] addWrapPartial(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {
		throw unsupported();
	}

	public long addWrapField(long instant, int value) {
		throw unsupported();
	}

	public int[] addWrapField(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {
		throw unsupported();
	}

	public int getDifference(long minuendInstant, long subtrahendInstant) {
		return getDurationField().getDifference(minuendInstant, subtrahendInstant);
	}

	public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
		return getDurationField().getDifferenceAsLong(minuendInstant, subtrahendInstant);
	}

	public long set(long instant, int value) {
		throw unsupported();
	}

	public int[] set(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, int newValue) {
		throw unsupported();
	}

	public long set(long instant, java.lang.String text, java.util.Locale locale) {
		throw unsupported();
	}

	public long set(long instant, java.lang.String text) {
		throw unsupported();
	}

	public int[] set(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, java.lang.String text, java.util.Locale locale) {
		throw unsupported();
	}

	public org.joda.time.DurationField getDurationField() {
		return iDurationField;
	}

	public org.joda.time.DurationField getRangeDurationField() {
		return null;
	}

	public boolean isLeap(long instant) {
		throw unsupported();
	}

	public int getLeapAmount(long instant) {
		throw unsupported();
	}

	public org.joda.time.DurationField getLeapDurationField() {
		return null;
	}

	public int getMinimumValue() {
		throw unsupported();
	}

	public int getMinimumValue(long instant) {
		throw unsupported();
	}

	public int getMinimumValue(org.joda.time.ReadablePartial instant) {
		throw unsupported();
	}

	public int getMinimumValue(org.joda.time.ReadablePartial instant, int[] values) {
		throw unsupported();
	}

	public int getMaximumValue() {
		throw unsupported();
	}

	public int getMaximumValue(long instant) {
		throw unsupported();
	}

	public int getMaximumValue(org.joda.time.ReadablePartial instant) {
		throw unsupported();
	}

	public int getMaximumValue(org.joda.time.ReadablePartial instant, int[] values) {
		throw unsupported();
	}

	public int getMaximumTextLength(java.util.Locale locale) {
		throw unsupported();
	}

	public int getMaximumShortTextLength(java.util.Locale locale) {
		throw unsupported();
	}

	public long roundFloor(long instant) {
		throw unsupported();
	}

	public long roundCeiling(long instant) {
		throw unsupported();
	}

	public long roundHalfFloor(long instant) {
		throw unsupported();
	}

	public long roundHalfCeiling(long instant) {
		throw unsupported();
	}

	public long roundHalfEven(long instant) {
		throw unsupported();
	}

	public long remainder(long instant) {
		throw unsupported();
	}

	public java.lang.String toString() {
		return "UnsupportedDateTimeField";
	}

	private java.lang.Object readResolve() {
		return org.joda.time.field.UnsupportedDateTimeField.getInstance(iType, iDurationField);
	}

	private java.lang.UnsupportedOperationException unsupported() {
		return new java.lang.UnsupportedOperationException(((iType) + " field is unsupported"));
	}
}


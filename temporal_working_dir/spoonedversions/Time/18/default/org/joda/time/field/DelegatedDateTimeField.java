

package org.joda.time.field;


public class DelegatedDateTimeField extends org.joda.time.DateTimeField implements java.io.Serializable {
	private static final long serialVersionUID = -4730164440214502503L;

	private final org.joda.time.DateTimeField iField;

	private final org.joda.time.DateTimeFieldType iType;

	public DelegatedDateTimeField(org.joda.time.DateTimeField field) {
		this(field, null);
	}

	public DelegatedDateTimeField(org.joda.time.DateTimeField field, org.joda.time.DateTimeFieldType type) {
		super();
		if (field == null) {
			throw new java.lang.IllegalArgumentException("The field must not be null");
		}
		iField = field;
		iType = (type == null) ? field.getType() : type;
	}

	public final org.joda.time.DateTimeField getWrappedField() {
		return iField;
	}

	public org.joda.time.DateTimeFieldType getType() {
		return iType;
	}

	public java.lang.String getName() {
		return iType.getName();
	}

	public boolean isSupported() {
		return iField.isSupported();
	}

	public boolean isLenient() {
		return iField.isLenient();
	}

	public int get(long instant) {
		return iField.get(instant);
	}

	public java.lang.String getAsText(long instant, java.util.Locale locale) {
		return iField.getAsText(instant, locale);
	}

	public java.lang.String getAsText(long instant) {
		return iField.getAsText(instant);
	}

	public java.lang.String getAsText(org.joda.time.ReadablePartial partial, int fieldValue, java.util.Locale locale) {
		return iField.getAsText(partial, fieldValue, locale);
	}

	public java.lang.String getAsText(org.joda.time.ReadablePartial partial, java.util.Locale locale) {
		return iField.getAsText(partial, locale);
	}

	public java.lang.String getAsText(int fieldValue, java.util.Locale locale) {
		return iField.getAsText(fieldValue, locale);
	}

	public java.lang.String getAsShortText(long instant, java.util.Locale locale) {
		return iField.getAsShortText(instant, locale);
	}

	public java.lang.String getAsShortText(long instant) {
		return iField.getAsShortText(instant);
	}

	public java.lang.String getAsShortText(org.joda.time.ReadablePartial partial, int fieldValue, java.util.Locale locale) {
		return iField.getAsShortText(partial, fieldValue, locale);
	}

	public java.lang.String getAsShortText(org.joda.time.ReadablePartial partial, java.util.Locale locale) {
		return iField.getAsShortText(partial, locale);
	}

	public java.lang.String getAsShortText(int fieldValue, java.util.Locale locale) {
		return iField.getAsShortText(fieldValue, locale);
	}

	public long add(long instant, int value) {
		return iField.add(instant, value);
	}

	public long add(long instant, long value) {
		return iField.add(instant, value);
	}

	public int[] add(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {
		return iField.add(instant, fieldIndex, values, valueToAdd);
	}

	public int[] addWrapPartial(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {
		return iField.addWrapPartial(instant, fieldIndex, values, valueToAdd);
	}

	public long addWrapField(long instant, int value) {
		return iField.addWrapField(instant, value);
	}

	public int[] addWrapField(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {
		return iField.addWrapField(instant, fieldIndex, values, valueToAdd);
	}

	public int getDifference(long minuendInstant, long subtrahendInstant) {
		return iField.getDifference(minuendInstant, subtrahendInstant);
	}

	public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
		return iField.getDifferenceAsLong(minuendInstant, subtrahendInstant);
	}

	public long set(long instant, int value) {
		return iField.set(instant, value);
	}

	public long set(long instant, java.lang.String text, java.util.Locale locale) {
		return iField.set(instant, text, locale);
	}

	public long set(long instant, java.lang.String text) {
		return iField.set(instant, text);
	}

	public int[] set(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, int newValue) {
		return iField.set(instant, fieldIndex, values, newValue);
	}

	public int[] set(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, java.lang.String text, java.util.Locale locale) {
		return iField.set(instant, fieldIndex, values, text, locale);
	}

	public org.joda.time.DurationField getDurationField() {
		return iField.getDurationField();
	}

	public org.joda.time.DurationField getRangeDurationField() {
		return iField.getRangeDurationField();
	}

	public boolean isLeap(long instant) {
		return iField.isLeap(instant);
	}

	public int getLeapAmount(long instant) {
		return iField.getLeapAmount(instant);
	}

	public org.joda.time.DurationField getLeapDurationField() {
		return iField.getLeapDurationField();
	}

	public int getMinimumValue() {
		return iField.getMinimumValue();
	}

	public int getMinimumValue(long instant) {
		return iField.getMinimumValue(instant);
	}

	public int getMinimumValue(org.joda.time.ReadablePartial instant) {
		return iField.getMinimumValue(instant);
	}

	public int getMinimumValue(org.joda.time.ReadablePartial instant, int[] values) {
		return iField.getMinimumValue(instant, values);
	}

	public int getMaximumValue() {
		return iField.getMaximumValue();
	}

	public int getMaximumValue(long instant) {
		return iField.getMaximumValue(instant);
	}

	public int getMaximumValue(org.joda.time.ReadablePartial instant) {
		return iField.getMaximumValue(instant);
	}

	public int getMaximumValue(org.joda.time.ReadablePartial instant, int[] values) {
		return iField.getMaximumValue(instant, values);
	}

	public int getMaximumTextLength(java.util.Locale locale) {
		return iField.getMaximumTextLength(locale);
	}

	public int getMaximumShortTextLength(java.util.Locale locale) {
		return iField.getMaximumShortTextLength(locale);
	}

	public long roundFloor(long instant) {
		return iField.roundFloor(instant);
	}

	public long roundCeiling(long instant) {
		return iField.roundCeiling(instant);
	}

	public long roundHalfFloor(long instant) {
		return iField.roundHalfFloor(instant);
	}

	public long roundHalfCeiling(long instant) {
		return iField.roundHalfCeiling(instant);
	}

	public long roundHalfEven(long instant) {
		return iField.roundHalfEven(instant);
	}

	public long remainder(long instant) {
		return iField.remainder(instant);
	}

	public java.lang.String toString() {
		return ("DateTimeField[" + (getName())) + ']';
	}
}


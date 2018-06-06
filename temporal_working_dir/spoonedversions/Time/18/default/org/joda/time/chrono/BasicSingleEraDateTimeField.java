

package org.joda.time.chrono;


final class BasicSingleEraDateTimeField extends org.joda.time.field.BaseDateTimeField {
	private static final int ERA_VALUE = org.joda.time.DateTimeConstants.CE;

	private final java.lang.String iEraText;

	BasicSingleEraDateTimeField(java.lang.String text) {
		super(org.joda.time.DateTimeFieldType.era());
		iEraText = text;
	}

	public boolean isLenient() {
		return false;
	}

	public int get(long instant) {
		return org.joda.time.chrono.BasicSingleEraDateTimeField.ERA_VALUE;
	}

	public long set(long instant, int era) {
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.chrono.BasicSingleEraDateTimeField.this, era, org.joda.time.chrono.BasicSingleEraDateTimeField.ERA_VALUE, org.joda.time.chrono.BasicSingleEraDateTimeField.ERA_VALUE);
		return instant;
	}

	public long set(long instant, java.lang.String text, java.util.Locale locale) {
		if (((iEraText.equals(text)) == false) && (("1".equals(text)) == false)) {
			throw new org.joda.time.IllegalFieldValueException(org.joda.time.DateTimeFieldType.era(), text);
		}
		return instant;
	}

	public long roundFloor(long instant) {
		return java.lang.Long.MIN_VALUE;
	}

	public long roundCeiling(long instant) {
		return java.lang.Long.MAX_VALUE;
	}

	public long roundHalfFloor(long instant) {
		return java.lang.Long.MIN_VALUE;
	}

	public long roundHalfCeiling(long instant) {
		return java.lang.Long.MIN_VALUE;
	}

	public long roundHalfEven(long instant) {
		return java.lang.Long.MIN_VALUE;
	}

	public org.joda.time.DurationField getDurationField() {
		return org.joda.time.field.UnsupportedDurationField.getInstance(org.joda.time.DurationFieldType.eras());
	}

	public org.joda.time.DurationField getRangeDurationField() {
		return null;
	}

	public int getMinimumValue() {
		return org.joda.time.chrono.BasicSingleEraDateTimeField.ERA_VALUE;
	}

	public int getMaximumValue() {
		return org.joda.time.chrono.BasicSingleEraDateTimeField.ERA_VALUE;
	}

	public java.lang.String getAsText(int fieldValue, java.util.Locale locale) {
		return iEraText;
	}

	public int getMaximumTextLength(java.util.Locale locale) {
		return iEraText.length();
	}
}


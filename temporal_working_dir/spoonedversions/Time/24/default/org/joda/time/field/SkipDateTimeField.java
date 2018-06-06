

package org.joda.time.field;


public final class SkipDateTimeField extends org.joda.time.field.DelegatedDateTimeField {
	private static final long serialVersionUID = -8869148464118507846L;

	private final org.joda.time.Chronology iChronology;

	private final int iSkip;

	private transient int iMinValue;

	public SkipDateTimeField(org.joda.time.Chronology chronology, org.joda.time.DateTimeField field) {
		this(chronology, field, 0);
	}

	public SkipDateTimeField(org.joda.time.Chronology chronology, org.joda.time.DateTimeField field, int skip) {
		super(field);
		iChronology = chronology;
		int min = super.getMinimumValue();
		if (min < skip) {
			iMinValue = min - 1;
		}else
			if (min == skip) {
				iMinValue = skip + 1;
			}else {
				iMinValue = min;
			}
		
		iSkip = skip;
	}

	public int get(long millis) {
		int value = super.get(millis);
		if (value <= (iSkip)) {
			value--;
		}
		return value;
	}

	public long set(long millis, int value) {
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.field.SkipDateTimeField.this, value, iMinValue, getMaximumValue());
		if (value <= (iSkip)) {
			if (value == (iSkip)) {
				throw new org.joda.time.IllegalFieldValueException(org.joda.time.DateTimeFieldType.year(), new java.lang.Integer(value), null, null);
			}
			value++;
		}
		return super.set(millis, value);
	}

	public int getMinimumValue() {
		return iMinValue;
	}

	private java.lang.Object readResolve() {
		return getType().getField(iChronology);
	}
}




package org.joda.time.field;


public final class SkipUndoDateTimeField extends org.joda.time.field.DelegatedDateTimeField {
	private static final long serialVersionUID = -5875876968979L;

	private final org.joda.time.Chronology iChronology;

	private final int iSkip;

	private transient int iMinValue;

	public SkipUndoDateTimeField(org.joda.time.Chronology chronology, org.joda.time.DateTimeField field) {
		this(chronology, field, 0);
	}

	public SkipUndoDateTimeField(org.joda.time.Chronology chronology, org.joda.time.DateTimeField field, int skip) {
		super(field);
		iChronology = chronology;
		int min = super.getMinimumValue();
		if (min < skip) {
			iMinValue = min + 1;
		}else
			if (min == (skip + 1)) {
				iMinValue = skip;
			}else {
				iMinValue = min;
			}
		
		iSkip = skip;
	}

	public int get(long millis) {
		int value = super.get(millis);
		if (value < (iSkip)) {
			value++;
		}
		return value;
	}

	public long set(long millis, int value) {
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.field.SkipUndoDateTimeField.this, value, iMinValue, getMaximumValue());
		if (value <= (iSkip)) {
			value--;
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




package org.joda.time.field;


public abstract class DecoratedDateTimeField extends org.joda.time.field.BaseDateTimeField {
	private static final long serialVersionUID = 203115783733757597L;

	private final org.joda.time.DateTimeField iField;

	protected DecoratedDateTimeField(org.joda.time.DateTimeField field, org.joda.time.DateTimeFieldType type) {
		super(type);
		if (field == null) {
			throw new java.lang.IllegalArgumentException("The field must not be null");
		}
		if (!(field.isSupported())) {
			throw new java.lang.IllegalArgumentException("The field must be supported");
		}
		iField = field;
	}

	public final org.joda.time.DateTimeField getWrappedField() {
		return iField;
	}

	public boolean isLenient() {
		return iField.isLenient();
	}

	public int get(long instant) {
		return iField.get(instant);
	}

	public long set(long instant, int value) {
		return iField.set(instant, value);
	}

	public org.joda.time.DurationField getDurationField() {
		return iField.getDurationField();
	}

	public org.joda.time.DurationField getRangeDurationField() {
		return iField.getRangeDurationField();
	}

	public int getMinimumValue() {
		return iField.getMinimumValue();
	}

	public int getMaximumValue() {
		return iField.getMaximumValue();
	}

	public long roundFloor(long instant) {
		return iField.roundFloor(instant);
	}
}


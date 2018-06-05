

package org.joda.time.field;


public class StrictDateTimeField extends org.joda.time.field.DelegatedDateTimeField {
	private static final long serialVersionUID = 3154803964207950910L;

	public static org.joda.time.DateTimeField getInstance(org.joda.time.DateTimeField field) {
		if (field == null) {
			return null;
		}
		if (field instanceof org.joda.time.field.LenientDateTimeField) {
			field = ((org.joda.time.field.LenientDateTimeField) (field)).getWrappedField();
		}
		if (!(field.isLenient())) {
			return field;
		}
		return new org.joda.time.field.StrictDateTimeField(field);
	}

	protected StrictDateTimeField(org.joda.time.DateTimeField field) {
		super(field);
	}

	public final boolean isLenient() {
		return false;
	}

	public long set(long instant, int value) {
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.field.StrictDateTimeField.this, value, getMinimumValue(instant), getMaximumValue(instant));
		return super.set(instant, value);
	}
}


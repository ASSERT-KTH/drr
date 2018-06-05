

package org.joda.time.field;


public abstract class AbstractPartialFieldProperty {
	protected AbstractPartialFieldProperty() {
		super();
	}

	public abstract org.joda.time.DateTimeField getField();

	public org.joda.time.DateTimeFieldType getFieldType() {
		return getField().getType();
	}

	public java.lang.String getName() {
		return getField().getName();
	}

	protected abstract org.joda.time.ReadablePartial getReadablePartial();

	public abstract int get();

	public java.lang.String getAsString() {
		return java.lang.Integer.toString(get());
	}

	public java.lang.String getAsText() {
		return getAsText(null);
	}

	public java.lang.String getAsText(java.util.Locale locale) {
		return getField().getAsText(getReadablePartial(), get(), locale);
	}

	public java.lang.String getAsShortText() {
		return getAsShortText(null);
	}

	public java.lang.String getAsShortText(java.util.Locale locale) {
		return getField().getAsShortText(getReadablePartial(), get(), locale);
	}

	public org.joda.time.DurationField getDurationField() {
		return getField().getDurationField();
	}

	public org.joda.time.DurationField getRangeDurationField() {
		return getField().getRangeDurationField();
	}

	public int getMinimumValueOverall() {
		return getField().getMinimumValue();
	}

	public int getMinimumValue() {
		return getField().getMinimumValue(getReadablePartial());
	}

	public int getMaximumValueOverall() {
		return getField().getMaximumValue();
	}

	public int getMaximumValue() {
		return getField().getMaximumValue(getReadablePartial());
	}

	public int getMaximumTextLength(java.util.Locale locale) {
		return getField().getMaximumTextLength(locale);
	}

	public int getMaximumShortTextLength(java.util.Locale locale) {
		return getField().getMaximumShortTextLength(locale);
	}

	public int compareTo(org.joda.time.ReadableInstant instant) {
		if (instant == null) {
			throw new java.lang.IllegalArgumentException("The instant must not be null");
		}
		int thisValue = get();
		int otherValue = instant.get(getFieldType());
		if (thisValue < otherValue) {
			return -1;
		}else
			if (thisValue > otherValue) {
				return 1;
			}else {
				return 0;
			}
		
	}

	public int compareTo(org.joda.time.ReadablePartial partial) {
		if (partial == null) {
			throw new java.lang.IllegalArgumentException("The instant must not be null");
		}
		int thisValue = get();
		int otherValue = partial.get(getFieldType());
		if (thisValue < otherValue) {
			return -1;
		}else
			if (thisValue > otherValue) {
				return 1;
			}else {
				return 0;
			}
		
	}

	public boolean equals(java.lang.Object object) {
		if ((org.joda.time.field.AbstractPartialFieldProperty.this) == object) {
			return true;
		}
		if ((object instanceof org.joda.time.field.AbstractPartialFieldProperty) == false) {
			return false;
		}
		org.joda.time.field.AbstractPartialFieldProperty other = ((org.joda.time.field.AbstractPartialFieldProperty) (object));
		return (((get()) == (other.get())) && ((getFieldType()) == (other.getFieldType()))) && (org.joda.time.field.FieldUtils.equals(getReadablePartial().getChronology(), other.getReadablePartial().getChronology()));
	}

	public int hashCode() {
		int hash = 19;
		hash = (13 * hash) + (get());
		hash = (13 * hash) + (getFieldType().hashCode());
		hash = (13 * hash) + (getReadablePartial().getChronology().hashCode());
		return hash;
	}

	public java.lang.String toString() {
		return ("Property[" + (getName())) + "]";
	}
}


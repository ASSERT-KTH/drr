

package org.joda.time.field;


public abstract class AbstractReadableInstantFieldProperty implements java.io.Serializable {
	private static final long serialVersionUID = 1971226328211649661L;

	public AbstractReadableInstantFieldProperty() {
		super();
	}

	public abstract org.joda.time.DateTimeField getField();

	public org.joda.time.DateTimeFieldType getFieldType() {
		return getField().getType();
	}

	public java.lang.String getName() {
		return getField().getName();
	}

	protected abstract long getMillis();

	protected org.joda.time.Chronology getChronology() {
		throw new java.lang.UnsupportedOperationException(("The method getChronology() was added in v1.4 and needs " + "to be implemented by subclasses of AbstractReadableInstantFieldProperty"));
	}

	public int get() {
		return getField().get(getMillis());
	}

	public java.lang.String getAsString() {
		return java.lang.Integer.toString(get());
	}

	public java.lang.String getAsText() {
		return getAsText(null);
	}

	public java.lang.String getAsText(java.util.Locale locale) {
		return getField().getAsText(getMillis(), locale);
	}

	public java.lang.String getAsShortText() {
		return getAsShortText(null);
	}

	public java.lang.String getAsShortText(java.util.Locale locale) {
		return getField().getAsShortText(getMillis(), locale);
	}

	public int getDifference(org.joda.time.ReadableInstant instant) {
		if (instant == null) {
			return getField().getDifference(getMillis(), org.joda.time.DateTimeUtils.currentTimeMillis());
		}
		return getField().getDifference(getMillis(), instant.getMillis());
	}

	public long getDifferenceAsLong(org.joda.time.ReadableInstant instant) {
		if (instant == null) {
			return getField().getDifferenceAsLong(getMillis(), org.joda.time.DateTimeUtils.currentTimeMillis());
		}
		return getField().getDifferenceAsLong(getMillis(), instant.getMillis());
	}

	public org.joda.time.DurationField getDurationField() {
		return getField().getDurationField();
	}

	public org.joda.time.DurationField getRangeDurationField() {
		return getField().getRangeDurationField();
	}

	public boolean isLeap() {
		return getField().isLeap(getMillis());
	}

	public int getLeapAmount() {
		return getField().getLeapAmount(getMillis());
	}

	public org.joda.time.DurationField getLeapDurationField() {
		return getField().getLeapDurationField();
	}

	public int getMinimumValueOverall() {
		return getField().getMinimumValue();
	}

	public int getMinimumValue() {
		return getField().getMinimumValue(getMillis());
	}

	public int getMaximumValueOverall() {
		return getField().getMaximumValue();
	}

	public int getMaximumValue() {
		return getField().getMaximumValue(getMillis());
	}

	public int getMaximumTextLength(java.util.Locale locale) {
		return getField().getMaximumTextLength(locale);
	}

	public int getMaximumShortTextLength(java.util.Locale locale) {
		return getField().getMaximumShortTextLength(locale);
	}

	public long remainder() {
		return getField().remainder(getMillis());
	}

	public org.joda.time.Interval toInterval() {
		org.joda.time.DateTimeField field = getField();
		long start = field.roundFloor(getMillis());
		long end = field.add(start, 1);
		org.joda.time.Interval interval = new org.joda.time.Interval(start, end);
		return interval;
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
			throw new java.lang.IllegalArgumentException("The partial must not be null");
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
		if ((org.joda.time.field.AbstractReadableInstantFieldProperty.this) == object) {
			return true;
		}
		if ((object instanceof org.joda.time.field.AbstractReadableInstantFieldProperty) == false) {
			return false;
		}
		org.joda.time.field.AbstractReadableInstantFieldProperty other = ((org.joda.time.field.AbstractReadableInstantFieldProperty) (object));
		return (((get()) == (other.get())) && (getFieldType().equals(other.getFieldType()))) && (org.joda.time.field.FieldUtils.equals(getChronology(), other.getChronology()));
	}

	public int hashCode() {
		return (((get()) * 17) + (getFieldType().hashCode())) + (getChronology().hashCode());
	}

	public java.lang.String toString() {
		return ("Property[" + (getName())) + "]";
	}
}




package org.joda.time.field;


public class DelegatedDurationField extends org.joda.time.DurationField implements java.io.Serializable {
	private static final long serialVersionUID = -5576443481242007829L;

	private final org.joda.time.DurationField iField;

	private final org.joda.time.DurationFieldType iType;

	protected DelegatedDurationField(org.joda.time.DurationField field) {
		this(field, null);
	}

	protected DelegatedDurationField(org.joda.time.DurationField field, org.joda.time.DurationFieldType type) {
		super();
		if (field == null) {
			throw new java.lang.IllegalArgumentException("The field must not be null");
		}
		iField = field;
		iType = (type == null) ? field.getType() : type;
	}

	public final org.joda.time.DurationField getWrappedField() {
		return iField;
	}

	public org.joda.time.DurationFieldType getType() {
		return iType;
	}

	public java.lang.String getName() {
		return iType.getName();
	}

	public boolean isSupported() {
		return iField.isSupported();
	}

	public boolean isPrecise() {
		return iField.isPrecise();
	}

	public int getValue(long duration) {
		return iField.getValue(duration);
	}

	public long getValueAsLong(long duration) {
		return iField.getValueAsLong(duration);
	}

	public int getValue(long duration, long instant) {
		return iField.getValue(duration, instant);
	}

	public long getValueAsLong(long duration, long instant) {
		return iField.getValueAsLong(duration, instant);
	}

	public long getMillis(int value) {
		return iField.getMillis(value);
	}

	public long getMillis(long value) {
		return iField.getMillis(value);
	}

	public long getMillis(int value, long instant) {
		return iField.getMillis(value, instant);
	}

	public long getMillis(long value, long instant) {
		return iField.getMillis(value, instant);
	}

	public long add(long instant, int value) {
		return iField.add(instant, value);
	}

	public long add(long instant, long value) {
		return iField.add(instant, value);
	}

	public int getDifference(long minuendInstant, long subtrahendInstant) {
		return iField.getDifference(minuendInstant, subtrahendInstant);
	}

	public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
		return iField.getDifferenceAsLong(minuendInstant, subtrahendInstant);
	}

	public long getUnitMillis() {
		return iField.getUnitMillis();
	}

	public int compareTo(org.joda.time.DurationField durationField) {
		return iField.compareTo(durationField);
	}

	public java.lang.String toString() {
		return (iType) == null ? iField.toString() : ("DurationField[" + (iType)) + ']';
	}
}


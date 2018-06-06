

package org.joda.time.field;


public class DividedDateTimeField extends org.joda.time.field.DecoratedDateTimeField {
	private static final long serialVersionUID = 8318475124230605365L;

	final int iDivisor;

	final org.joda.time.DurationField iDurationField;

	private final int iMin;

	private final int iMax;

	public DividedDateTimeField(org.joda.time.DateTimeField field, org.joda.time.DateTimeFieldType type, int divisor) {
		super(field, type);
		if (divisor < 2) {
			throw new java.lang.IllegalArgumentException("The divisor must be at least 2");
		}
		org.joda.time.DurationField unitField = field.getDurationField();
		if (unitField == null) {
			iDurationField = null;
		}else {
			iDurationField = new org.joda.time.field.ScaledDurationField(unitField, type.getDurationType(), divisor);
		}
		iDivisor = divisor;
		int i = field.getMinimumValue();
		int min = i >= 0 ? i / divisor : ((i + 1) / divisor) - 1;
		int j = field.getMaximumValue();
		int max = j >= 0 ? j / divisor : ((j + 1) / divisor) - 1;
		iMin = min;
		iMax = max;
	}

	public DividedDateTimeField(org.joda.time.field.RemainderDateTimeField remainderField, org.joda.time.DateTimeFieldType type) {
		super(remainderField.getWrappedField(), type);
		int divisor = iDivisor = remainderField.iDivisor;
		iDurationField = remainderField.iRangeField;
		org.joda.time.DateTimeField field = getWrappedField();
		int i = field.getMinimumValue();
		int min = i >= 0 ? i / divisor : ((i + 1) / divisor) - 1;
		int j = field.getMaximumValue();
		int max = j >= 0 ? j / divisor : ((j + 1) / divisor) - 1;
		iMin = min;
		iMax = max;
	}

	public int get(long instant) {
		int value = getWrappedField().get(instant);
		if (value >= 0) {
			return value / (iDivisor);
		}else {
			return ((value + 1) / (iDivisor)) - 1;
		}
	}

	public long add(long instant, int amount) {
		return getWrappedField().add(instant, (amount * (iDivisor)));
	}

	public long add(long instant, long amount) {
		return getWrappedField().add(instant, (amount * (iDivisor)));
	}

	public long addWrapField(long instant, int amount) {
		return set(instant, org.joda.time.field.FieldUtils.getWrappedValue(get(instant), amount, iMin, iMax));
	}

	public int getDifference(long minuendInstant, long subtrahendInstant) {
		return (getWrappedField().getDifference(minuendInstant, subtrahendInstant)) / (iDivisor);
	}

	public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
		return (getWrappedField().getDifferenceAsLong(minuendInstant, subtrahendInstant)) / (iDivisor);
	}

	public long set(long instant, int value) {
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.field.DividedDateTimeField.this, value, iMin, iMax);
		int remainder = getRemainder(getWrappedField().get(instant));
		return getWrappedField().set(instant, ((value * (iDivisor)) + remainder));
	}

	public org.joda.time.DurationField getDurationField() {
		return iDurationField;
	}

	public int getMinimumValue() {
		return iMin;
	}

	public int getMaximumValue() {
		return iMax;
	}

	public long roundFloor(long instant) {
		org.joda.time.DateTimeField field = getWrappedField();
		return field.roundFloor(field.set(instant, ((get(instant)) * (iDivisor))));
	}

	public long remainder(long instant) {
		return set(instant, get(getWrappedField().remainder(instant)));
	}

	public int getDivisor() {
		return iDivisor;
	}

	private int getRemainder(int value) {
		if (value >= 0) {
			return value % (iDivisor);
		}else {
			return ((iDivisor) - 1) + ((value + 1) % (iDivisor));
		}
	}
}




package org.joda.time.base;


public abstract class BaseSingleFieldPeriod implements java.io.Serializable , java.lang.Comparable<org.joda.time.base.BaseSingleFieldPeriod> , org.joda.time.ReadablePeriod {
	private static final long serialVersionUID = 9386874258972L;

	private volatile int iPeriod;

	protected static int between(org.joda.time.ReadableInstant start, org.joda.time.ReadableInstant end, org.joda.time.DurationFieldType field) {
		if ((start == null) || (end == null)) {
			throw new java.lang.IllegalArgumentException("ReadableInstant objects must not be null");
		}
		org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getInstantChronology(start);
		int amount = field.getField(chrono).getDifference(end.getMillis(), start.getMillis());
		return amount;
	}

	protected static int between(org.joda.time.ReadablePartial start, org.joda.time.ReadablePartial end, org.joda.time.ReadablePeriod zeroInstance) {
		if ((start == null) || (end == null)) {
			throw new java.lang.IllegalArgumentException("ReadablePartial objects must not be null");
		}
		if ((start.size()) != (end.size())) {
			throw new java.lang.IllegalArgumentException("ReadablePartial objects must have the same set of fields");
		}
		for (int i = 0, isize = start.size(); i < isize; i++) {
			if ((start.getFieldType(i)) != (end.getFieldType(i))) {
				throw new java.lang.IllegalArgumentException("ReadablePartial objects must have the same set of fields");
			}
		}
		if ((org.joda.time.DateTimeUtils.isContiguous(start)) == false) {
			throw new java.lang.IllegalArgumentException("ReadablePartial objects must be contiguous");
		}
		org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getChronology(start.getChronology()).withUTC();
		int[] values = chrono.get(zeroInstance, chrono.set(start, 0L), chrono.set(end, 0L));
		return values[0];
	}

	protected static int standardPeriodIn(org.joda.time.ReadablePeriod period, long millisPerUnit) {
		if (period == null) {
			return 0;
		}
		org.joda.time.Chronology iso = org.joda.time.chrono.ISOChronology.getInstanceUTC();
		long duration = 0L;
		for (int i = 0; i < (period.size()); i++) {
			int value = period.getValue(i);
			if (value != 0) {
				org.joda.time.DurationField field = period.getFieldType(i).getField(iso);
				if ((field.isPrecise()) == false) {
					throw new java.lang.IllegalArgumentException(((("Cannot convert period to duration as " + (field.getName())) + " is not precise in the period ") + period));
				}
				duration = org.joda.time.field.FieldUtils.safeAdd(duration, org.joda.time.field.FieldUtils.safeMultiply(field.getUnitMillis(), value));
			}
		}
		return org.joda.time.field.FieldUtils.safeToInt((duration / millisPerUnit));
	}

	protected BaseSingleFieldPeriod(int period) {
		super();
		iPeriod = period;
	}

	protected int getValue() {
		return iPeriod;
	}

	protected void setValue(int value) {
		iPeriod = value;
	}

	public abstract org.joda.time.DurationFieldType getFieldType();

	public abstract org.joda.time.PeriodType getPeriodType();

	public int size() {
		return 1;
	}

	public org.joda.time.DurationFieldType getFieldType(int index) {
		if (index != 0) {
			throw new java.lang.IndexOutOfBoundsException(java.lang.String.valueOf(index));
		}
		return getFieldType();
	}

	public int getValue(int index) {
		if (index != 0) {
			throw new java.lang.IndexOutOfBoundsException(java.lang.String.valueOf(index));
		}
		return getValue();
	}

	public int get(org.joda.time.DurationFieldType type) {
		if (type == (getFieldType())) {
			return getValue();
		}
		return 0;
	}

	public boolean isSupported(org.joda.time.DurationFieldType type) {
		return type == (getFieldType());
	}

	public org.joda.time.Period toPeriod() {
		return org.joda.time.Period.ZERO.withFields(org.joda.time.base.BaseSingleFieldPeriod.this);
	}

	public org.joda.time.MutablePeriod toMutablePeriod() {
		org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
		period.add(org.joda.time.base.BaseSingleFieldPeriod.this);
		return period;
	}

	public boolean equals(java.lang.Object period) {
		if ((org.joda.time.base.BaseSingleFieldPeriod.this) == period) {
			return true;
		}
		if ((period instanceof org.joda.time.ReadablePeriod) == false) {
			return false;
		}
		org.joda.time.ReadablePeriod other = ((org.joda.time.ReadablePeriod) (period));
		return ((other.getPeriodType()) == (getPeriodType())) && ((other.getValue(0)) == (getValue()));
	}

	public int hashCode() {
		int total = 17;
		total = (27 * total) + (getValue());
		total = (27 * total) + (getFieldType().hashCode());
		return total;
	}

	public int compareTo(org.joda.time.base.BaseSingleFieldPeriod other) {
		if ((other.getClass()) != (getClass())) {
			throw new java.lang.ClassCastException((((getClass()) + " cannot be compared to ") + (other.getClass())));
		}
		int otherValue = other.getValue();
		int thisValue = getValue();
		if (thisValue > otherValue) {
			return 1;
		}
		if (thisValue < otherValue) {
			return -1;
		}
		return 0;
	}
}


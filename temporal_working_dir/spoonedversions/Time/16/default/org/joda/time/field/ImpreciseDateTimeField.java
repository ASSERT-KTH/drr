

package org.joda.time.field;


public abstract class ImpreciseDateTimeField extends org.joda.time.field.BaseDateTimeField {
	private static final long serialVersionUID = 7190739608550251860L;

	final long iUnitMillis;

	private final org.joda.time.DurationField iDurationField;

	public ImpreciseDateTimeField(org.joda.time.DateTimeFieldType type, long unitMillis) {
		super(type);
		iUnitMillis = unitMillis;
		iDurationField = new org.joda.time.field.ImpreciseDateTimeField.LinkedDurationField(type.getDurationType());
	}

	public abstract int get(long instant);

	public abstract long set(long instant, int value);

	public abstract long add(long instant, int value);

	public abstract long add(long instant, long value);

	public int getDifference(long minuendInstant, long subtrahendInstant) {
		return org.joda.time.field.FieldUtils.safeToInt(getDifferenceAsLong(minuendInstant, subtrahendInstant));
	}

	public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
		if (minuendInstant < subtrahendInstant) {
			return -(getDifferenceAsLong(subtrahendInstant, minuendInstant));
		}
		long difference = (minuendInstant - subtrahendInstant) / (iUnitMillis);
		if ((add(subtrahendInstant, difference)) < minuendInstant) {
			do {
				difference++;
			} while ((add(subtrahendInstant, difference)) <= minuendInstant );
			difference--;
		}else
			if ((add(subtrahendInstant, difference)) > minuendInstant) {
				do {
					difference--;
				} while ((add(subtrahendInstant, difference)) > minuendInstant );
			}
		
		return difference;
	}

	public final org.joda.time.DurationField getDurationField() {
		return iDurationField;
	}

	public abstract org.joda.time.DurationField getRangeDurationField();

	public abstract long roundFloor(long instant);

	protected final long getDurationUnitMillis() {
		return iUnitMillis;
	}

	private final class LinkedDurationField extends org.joda.time.field.BaseDurationField {
		private static final long serialVersionUID = -203813474600094134L;

		LinkedDurationField(org.joda.time.DurationFieldType type) {
			super(type);
		}

		public boolean isPrecise() {
			return false;
		}

		public long getUnitMillis() {
			return iUnitMillis;
		}

		public int getValue(long duration, long instant) {
			return org.joda.time.field.ImpreciseDateTimeField.this.getDifference((instant + duration), instant);
		}

		public long getValueAsLong(long duration, long instant) {
			return org.joda.time.field.ImpreciseDateTimeField.this.getDifferenceAsLong((instant + duration), instant);
		}

		public long getMillis(int value, long instant) {
			return (org.joda.time.field.ImpreciseDateTimeField.this.add(instant, value)) - instant;
		}

		public long getMillis(long value, long instant) {
			return (org.joda.time.field.ImpreciseDateTimeField.this.add(instant, value)) - instant;
		}

		public long add(long instant, int value) {
			return org.joda.time.field.ImpreciseDateTimeField.this.add(instant, value);
		}

		public long add(long instant, long value) {
			return org.joda.time.field.ImpreciseDateTimeField.this.add(instant, value);
		}

		public int getDifference(long minuendInstant, long subtrahendInstant) {
			return org.joda.time.field.ImpreciseDateTimeField.this.getDifference(minuendInstant, subtrahendInstant);
		}

		public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
			return org.joda.time.field.ImpreciseDateTimeField.this.getDifferenceAsLong(minuendInstant, subtrahendInstant);
		}
	}
}


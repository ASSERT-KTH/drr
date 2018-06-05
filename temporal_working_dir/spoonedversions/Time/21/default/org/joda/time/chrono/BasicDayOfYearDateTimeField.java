

package org.joda.time.chrono;


final class BasicDayOfYearDateTimeField extends org.joda.time.field.PreciseDurationDateTimeField {
	private static final long serialVersionUID = -6821236822336841037L;

	private final org.joda.time.chrono.BasicChronology iChronology;

	BasicDayOfYearDateTimeField(org.joda.time.chrono.BasicChronology chronology, org.joda.time.DurationField days) {
		super(org.joda.time.DateTimeFieldType.dayOfYear(), days);
		iChronology = chronology;
	}

	public int get(long instant) {
		return iChronology.getDayOfYear(instant);
	}

	public org.joda.time.DurationField getRangeDurationField() {
		return iChronology.years();
	}

	public int getMinimumValue() {
		return 1;
	}

	public int getMaximumValue() {
		return iChronology.getDaysInYearMax();
	}

	public int getMaximumValue(long instant) {
		int year = iChronology.getYear(instant);
		return iChronology.getDaysInYear(year);
	}

	public int getMaximumValue(org.joda.time.ReadablePartial partial) {
		if (partial.isSupported(org.joda.time.DateTimeFieldType.year())) {
			int year = partial.get(org.joda.time.DateTimeFieldType.year());
			return iChronology.getDaysInYear(year);
		}
		return iChronology.getDaysInYearMax();
	}

	public int getMaximumValue(org.joda.time.ReadablePartial partial, int[] values) {
		int size = partial.size();
		for (int i = 0; i < size; i++) {
			if ((partial.getFieldType(i)) == (org.joda.time.DateTimeFieldType.year())) {
				int year = values[i];
				return iChronology.getDaysInYear(year);
			}
		}
		return iChronology.getDaysInYearMax();
	}

	protected int getMaximumValueForSet(long instant, int value) {
		int maxLessOne = (iChronology.getDaysInYearMax()) - 1;
		return (value > maxLessOne) || (value < 1) ? getMaximumValue(instant) : maxLessOne;
	}

	private java.lang.Object readResolve() {
		return iChronology.dayOfYear();
	}
}


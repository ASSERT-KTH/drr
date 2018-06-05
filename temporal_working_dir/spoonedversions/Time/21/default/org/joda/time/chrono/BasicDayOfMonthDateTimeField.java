

package org.joda.time.chrono;


final class BasicDayOfMonthDateTimeField extends org.joda.time.field.PreciseDurationDateTimeField {
	private static final long serialVersionUID = -4677223814028011723L;

	private final org.joda.time.chrono.BasicChronology iChronology;

	BasicDayOfMonthDateTimeField(org.joda.time.chrono.BasicChronology chronology, org.joda.time.DurationField days) {
		super(org.joda.time.DateTimeFieldType.dayOfMonth(), days);
		iChronology = chronology;
	}

	public int get(long instant) {
		return iChronology.getDayOfMonth(instant);
	}

	public org.joda.time.DurationField getRangeDurationField() {
		return iChronology.months();
	}

	public int getMinimumValue() {
		return 1;
	}

	public int getMaximumValue() {
		return iChronology.getDaysInMonthMax();
	}

	public int getMaximumValue(long instant) {
		return iChronology.getDaysInMonthMax(instant);
	}

	public int getMaximumValue(org.joda.time.ReadablePartial partial) {
		if (partial.isSupported(org.joda.time.DateTimeFieldType.monthOfYear())) {
			int month = partial.get(org.joda.time.DateTimeFieldType.monthOfYear());
			if (partial.isSupported(org.joda.time.DateTimeFieldType.year())) {
				int year = partial.get(org.joda.time.DateTimeFieldType.year());
				return iChronology.getDaysInYearMonth(year, month);
			}
			return iChronology.getDaysInMonthMax(month);
		}
		return getMaximumValue();
	}

	public int getMaximumValue(org.joda.time.ReadablePartial partial, int[] values) {
		int size = partial.size();
		for (int i = 0; i < size; i++) {
			if ((partial.getFieldType(i)) == (org.joda.time.DateTimeFieldType.monthOfYear())) {
				int month = values[i];
				for (int j = 0; j < size; j++) {
					if ((partial.getFieldType(j)) == (org.joda.time.DateTimeFieldType.year())) {
						int year = values[j];
						return iChronology.getDaysInYearMonth(year, month);
					}
				}
				return iChronology.getDaysInMonthMax(month);
			}
		}
		return getMaximumValue();
	}

	protected int getMaximumValueForSet(long instant, int value) {
		return iChronology.getDaysInMonthMaxForSet(instant, value);
	}

	private java.lang.Object readResolve() {
		return iChronology.dayOfMonth();
	}
}


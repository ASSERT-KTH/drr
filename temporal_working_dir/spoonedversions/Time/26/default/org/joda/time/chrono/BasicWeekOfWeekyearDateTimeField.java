

package org.joda.time.chrono;


final class BasicWeekOfWeekyearDateTimeField extends org.joda.time.field.PreciseDurationDateTimeField {
	private static final long serialVersionUID = -1587436826395135328L;

	private final org.joda.time.chrono.BasicChronology iChronology;

	BasicWeekOfWeekyearDateTimeField(org.joda.time.chrono.BasicChronology chronology, org.joda.time.DurationField weeks) {
		super(org.joda.time.DateTimeFieldType.weekOfWeekyear(), weeks);
		iChronology = chronology;
	}

	public int get(long instant) {
		return iChronology.getWeekOfWeekyear(instant);
	}

	public org.joda.time.DurationField getRangeDurationField() {
		return iChronology.weekyears();
	}

	public long roundFloor(long instant) {
		return (super.roundFloor((instant + (3 * (org.joda.time.DateTimeConstants.MILLIS_PER_DAY))))) - (3 * (org.joda.time.DateTimeConstants.MILLIS_PER_DAY));
	}

	public long roundCeiling(long instant) {
		return (super.roundCeiling((instant + (3 * (org.joda.time.DateTimeConstants.MILLIS_PER_DAY))))) - (3 * (org.joda.time.DateTimeConstants.MILLIS_PER_DAY));
	}

	public long remainder(long instant) {
		return super.remainder((instant + (3 * (org.joda.time.DateTimeConstants.MILLIS_PER_DAY))));
	}

	public int getMinimumValue() {
		return 1;
	}

	public int getMaximumValue() {
		return 53;
	}

	public int getMaximumValue(long instant) {
		int weekyear = iChronology.getWeekyear(instant);
		return iChronology.getWeeksInYear(weekyear);
	}

	public int getMaximumValue(org.joda.time.ReadablePartial partial) {
		if (partial.isSupported(org.joda.time.DateTimeFieldType.weekyear())) {
			int weekyear = partial.get(org.joda.time.DateTimeFieldType.weekyear());
			return iChronology.getWeeksInYear(weekyear);
		}
		return 53;
	}

	public int getMaximumValue(org.joda.time.ReadablePartial partial, int[] values) {
		int size = partial.size();
		for (int i = 0; i < size; i++) {
			if ((partial.getFieldType(i)) == (org.joda.time.DateTimeFieldType.weekyear())) {
				int weekyear = values[i];
				return iChronology.getWeeksInYear(weekyear);
			}
		}
		return 53;
	}

	protected int getMaximumValueForSet(long instant, int value) {
		return value > 52 ? getMaximumValue(instant) : 52;
	}

	private java.lang.Object readResolve() {
		return iChronology.weekOfWeekyear();
	}
}


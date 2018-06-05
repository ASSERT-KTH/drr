

package org.joda.time;


public abstract class DateTimeField {
	public abstract org.joda.time.DateTimeFieldType getType();

	public abstract java.lang.String getName();

	public abstract boolean isSupported();

	public abstract boolean isLenient();

	public abstract int get(long instant);

	public abstract java.lang.String getAsText(long instant, java.util.Locale locale);

	public abstract java.lang.String getAsText(long instant);

	public abstract java.lang.String getAsText(org.joda.time.ReadablePartial partial, int fieldValue, java.util.Locale locale);

	public abstract java.lang.String getAsText(org.joda.time.ReadablePartial partial, java.util.Locale locale);

	public abstract java.lang.String getAsText(int fieldValue, java.util.Locale locale);

	public abstract java.lang.String getAsShortText(long instant, java.util.Locale locale);

	public abstract java.lang.String getAsShortText(long instant);

	public abstract java.lang.String getAsShortText(org.joda.time.ReadablePartial partial, int fieldValue, java.util.Locale locale);

	public abstract java.lang.String getAsShortText(org.joda.time.ReadablePartial partial, java.util.Locale locale);

	public abstract java.lang.String getAsShortText(int fieldValue, java.util.Locale locale);

	public abstract long add(long instant, int value);

	public abstract long add(long instant, long value);

	public abstract int[] add(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd);

	public abstract int[] addWrapPartial(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd);

	public abstract long addWrapField(long instant, int value);

	public abstract int[] addWrapField(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd);

	public abstract int getDifference(long minuendInstant, long subtrahendInstant);

	public abstract long getDifferenceAsLong(long minuendInstant, long subtrahendInstant);

	public abstract long set(long instant, int value);

	public abstract int[] set(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, int newValue);

	public abstract long set(long instant, java.lang.String text, java.util.Locale locale);

	public abstract long set(long instant, java.lang.String text);

	public abstract int[] set(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, java.lang.String text, java.util.Locale locale);

	public abstract org.joda.time.DurationField getDurationField();

	public abstract org.joda.time.DurationField getRangeDurationField();

	public abstract boolean isLeap(long instant);

	public abstract int getLeapAmount(long instant);

	public abstract org.joda.time.DurationField getLeapDurationField();

	public abstract int getMinimumValue();

	public abstract int getMinimumValue(long instant);

	public abstract int getMinimumValue(org.joda.time.ReadablePartial instant);

	public abstract int getMinimumValue(org.joda.time.ReadablePartial instant, int[] values);

	public abstract int getMaximumValue();

	public abstract int getMaximumValue(long instant);

	public abstract int getMaximumValue(org.joda.time.ReadablePartial instant);

	public abstract int getMaximumValue(org.joda.time.ReadablePartial instant, int[] values);

	public abstract int getMaximumTextLength(java.util.Locale locale);

	public abstract int getMaximumShortTextLength(java.util.Locale locale);

	public abstract long roundFloor(long instant);

	public abstract long roundCeiling(long instant);

	public abstract long roundHalfFloor(long instant);

	public abstract long roundHalfCeiling(long instant);

	public abstract long roundHalfEven(long instant);

	public abstract long remainder(long instant);

	public abstract java.lang.String toString();
}


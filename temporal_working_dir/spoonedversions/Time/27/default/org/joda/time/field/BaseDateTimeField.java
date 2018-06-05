

package org.joda.time.field;


public abstract class BaseDateTimeField extends org.joda.time.DateTimeField {
	private final org.joda.time.DateTimeFieldType iType;

	protected BaseDateTimeField(org.joda.time.DateTimeFieldType type) {
		super();
		if (type == null) {
			throw new java.lang.IllegalArgumentException("The type must not be null");
		}
		iType = type;
	}

	public final org.joda.time.DateTimeFieldType getType() {
		return iType;
	}

	public final java.lang.String getName() {
		return iType.getName();
	}

	public final boolean isSupported() {
		return true;
	}

	public abstract int get(long instant);

	public java.lang.String getAsText(long instant, java.util.Locale locale) {
		return getAsText(get(instant), locale);
	}

	public final java.lang.String getAsText(long instant) {
		return getAsText(instant, null);
	}

	public java.lang.String getAsText(org.joda.time.ReadablePartial partial, int fieldValue, java.util.Locale locale) {
		return getAsText(fieldValue, locale);
	}

	public final java.lang.String getAsText(org.joda.time.ReadablePartial partial, java.util.Locale locale) {
		return getAsText(partial, partial.get(getType()), locale);
	}

	public java.lang.String getAsText(int fieldValue, java.util.Locale locale) {
		return java.lang.Integer.toString(fieldValue);
	}

	public java.lang.String getAsShortText(long instant, java.util.Locale locale) {
		return getAsShortText(get(instant), locale);
	}

	public final java.lang.String getAsShortText(long instant) {
		return getAsShortText(instant, null);
	}

	public java.lang.String getAsShortText(org.joda.time.ReadablePartial partial, int fieldValue, java.util.Locale locale) {
		return getAsShortText(fieldValue, locale);
	}

	public final java.lang.String getAsShortText(org.joda.time.ReadablePartial partial, java.util.Locale locale) {
		return getAsShortText(partial, partial.get(getType()), locale);
	}

	public java.lang.String getAsShortText(int fieldValue, java.util.Locale locale) {
		return getAsText(fieldValue, locale);
	}

	public long add(long instant, int value) {
		return getDurationField().add(instant, value);
	}

	public long add(long instant, long value) {
		return getDurationField().add(instant, value);
	}

	public int[] add(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {
		if (valueToAdd == 0) {
			return values;
		}
		org.joda.time.DateTimeField nextField = null;
		while (valueToAdd > 0) {
			int max = getMaximumValue(instant, values);
			long proposed = (values[fieldIndex]) + valueToAdd;
			if (proposed <= max) {
				values[fieldIndex] = ((int) (proposed));
				break;
			}
			if (nextField == null) {
				if (fieldIndex == 0) {
					throw new java.lang.IllegalArgumentException("Maximum value exceeded for add");
				}
				nextField = instant.getField((fieldIndex - 1));
				if ((getRangeDurationField().getType()) != (nextField.getDurationField().getType())) {
					throw new java.lang.IllegalArgumentException("Fields invalid for add");
				}
			}
			valueToAdd -= (max + 1) - (values[fieldIndex]);
			values = nextField.add(instant, (fieldIndex - 1), values, 1);
			values[fieldIndex] = getMinimumValue(instant, values);
		} 
		while (valueToAdd < 0) {
			int min = getMinimumValue(instant, values);
			long proposed = (values[fieldIndex]) + valueToAdd;
			if (proposed >= min) {
				values[fieldIndex] = ((int) (proposed));
				break;
			}
			if (nextField == null) {
				if (fieldIndex == 0) {
					throw new java.lang.IllegalArgumentException("Maximum value exceeded for add");
				}
				nextField = instant.getField((fieldIndex - 1));
				if ((getRangeDurationField().getType()) != (nextField.getDurationField().getType())) {
					throw new java.lang.IllegalArgumentException("Fields invalid for add");
				}
			}
			valueToAdd -= (min - 1) - (values[fieldIndex]);
			values = nextField.add(instant, (fieldIndex - 1), values, (-1));
			values[fieldIndex] = getMaximumValue(instant, values);
		} 
		return set(instant, fieldIndex, values, values[fieldIndex]);
	}

	public int[] addWrapPartial(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {
		if (valueToAdd == 0) {
			return values;
		}
		org.joda.time.DateTimeField nextField = null;
		while (valueToAdd > 0) {
			int max = getMaximumValue(instant, values);
			long proposed = (values[fieldIndex]) + valueToAdd;
			if (proposed <= max) {
				values[fieldIndex] = ((int) (proposed));
				break;
			}
			if (nextField == null) {
				if (fieldIndex == 0) {
					valueToAdd -= (max + 1) - (values[fieldIndex]);
					values[fieldIndex] = getMinimumValue(instant, values);
					continue;
				}
				nextField = instant.getField((fieldIndex - 1));
				if ((getRangeDurationField().getType()) != (nextField.getDurationField().getType())) {
					throw new java.lang.IllegalArgumentException("Fields invalid for add");
				}
			}
			valueToAdd -= (max + 1) - (values[fieldIndex]);
			values = nextField.addWrapPartial(instant, (fieldIndex - 1), values, 1);
			values[fieldIndex] = getMinimumValue(instant, values);
		} 
		while (valueToAdd < 0) {
			int min = getMinimumValue(instant, values);
			long proposed = (values[fieldIndex]) + valueToAdd;
			if (proposed >= min) {
				values[fieldIndex] = ((int) (proposed));
				break;
			}
			if (nextField == null) {
				if (fieldIndex == 0) {
					valueToAdd -= (min - 1) - (values[fieldIndex]);
					values[fieldIndex] = getMaximumValue(instant, values);
					continue;
				}
				nextField = instant.getField((fieldIndex - 1));
				if ((getRangeDurationField().getType()) != (nextField.getDurationField().getType())) {
					throw new java.lang.IllegalArgumentException("Fields invalid for add");
				}
			}
			valueToAdd -= (min - 1) - (values[fieldIndex]);
			values = nextField.addWrapPartial(instant, (fieldIndex - 1), values, (-1));
			values[fieldIndex] = getMaximumValue(instant, values);
		} 
		return set(instant, fieldIndex, values, values[fieldIndex]);
	}

	public long addWrapField(long instant, int value) {
		int current = get(instant);
		int wrapped = org.joda.time.field.FieldUtils.getWrappedValue(current, value, getMinimumValue(instant), getMaximumValue(instant));
		return set(instant, wrapped);
	}

	public int[] addWrapField(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {
		int current = values[fieldIndex];
		int wrapped = org.joda.time.field.FieldUtils.getWrappedValue(current, valueToAdd, getMinimumValue(instant), getMaximumValue(instant));
		return set(instant, fieldIndex, values, wrapped);
	}

	public int getDifference(long minuendInstant, long subtrahendInstant) {
		return getDurationField().getDifference(minuendInstant, subtrahendInstant);
	}

	public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
		return getDurationField().getDifferenceAsLong(minuendInstant, subtrahendInstant);
	}

	public abstract long set(long instant, int value);

	public int[] set(org.joda.time.ReadablePartial partial, int fieldIndex, int[] values, int newValue) {
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.field.BaseDateTimeField.this, newValue, getMinimumValue(partial, values), getMaximumValue(partial, values));
		values[fieldIndex] = newValue;
		for (int i = fieldIndex + 1; i < (partial.size()); i++) {
			org.joda.time.DateTimeField field = partial.getField(i);
			if ((values[i]) > (field.getMaximumValue(partial, values))) {
				values[i] = field.getMaximumValue(partial, values);
			}
			if ((values[i]) < (field.getMinimumValue(partial, values))) {
				values[i] = field.getMinimumValue(partial, values);
			}
		}
		return values;
	}

	public long set(long instant, java.lang.String text, java.util.Locale locale) {
		int value = convertText(text, locale);
		return set(instant, value);
	}

	public final long set(long instant, java.lang.String text) {
		return set(instant, text, null);
	}

	public int[] set(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, java.lang.String text, java.util.Locale locale) {
		int value = convertText(text, locale);
		return set(instant, fieldIndex, values, value);
	}

	protected int convertText(java.lang.String text, java.util.Locale locale) {
		try {
			return java.lang.Integer.parseInt(text);
		} catch (java.lang.NumberFormatException ex) {
			throw new org.joda.time.IllegalFieldValueException(getType(), text);
		}
	}

	public abstract org.joda.time.DurationField getDurationField();

	public abstract org.joda.time.DurationField getRangeDurationField();

	public boolean isLeap(long instant) {
		return false;
	}

	public int getLeapAmount(long instant) {
		return 0;
	}

	public org.joda.time.DurationField getLeapDurationField() {
		return null;
	}

	public abstract int getMinimumValue();

	public int getMinimumValue(long instant) {
		return getMinimumValue();
	}

	public int getMinimumValue(org.joda.time.ReadablePartial instant) {
		return getMinimumValue();
	}

	public int getMinimumValue(org.joda.time.ReadablePartial instant, int[] values) {
		return getMinimumValue(instant);
	}

	public abstract int getMaximumValue();

	public int getMaximumValue(long instant) {
		return getMaximumValue();
	}

	public int getMaximumValue(org.joda.time.ReadablePartial instant) {
		return getMaximumValue();
	}

	public int getMaximumValue(org.joda.time.ReadablePartial instant, int[] values) {
		return getMaximumValue(instant);
	}

	public int getMaximumTextLength(java.util.Locale locale) {
		int max = getMaximumValue();
		if (max >= 0) {
			if (max < 10) {
				return 1;
			}else
				if (max < 100) {
					return 2;
				}else
					if (max < 1000) {
						return 3;
					}
				
			
		}
		return java.lang.Integer.toString(max).length();
	}

	public int getMaximumShortTextLength(java.util.Locale locale) {
		return getMaximumTextLength(locale);
	}

	public abstract long roundFloor(long instant);

	public long roundCeiling(long instant) {
		long newInstant = roundFloor(instant);
		if (newInstant != instant) {
			instant = add(newInstant, 1);
		}
		return instant;
	}

	public long roundHalfFloor(long instant) {
		long floor = roundFloor(instant);
		long ceiling = roundCeiling(instant);
		long diffFromFloor = instant - floor;
		long diffToCeiling = ceiling - instant;
		if (diffFromFloor <= diffToCeiling) {
			return floor;
		}else {
			return ceiling;
		}
	}

	public long roundHalfCeiling(long instant) {
		long floor = roundFloor(instant);
		long ceiling = roundCeiling(instant);
		long diffFromFloor = instant - floor;
		long diffToCeiling = ceiling - instant;
		if (diffToCeiling <= diffFromFloor) {
			return ceiling;
		}else {
			return floor;
		}
	}

	public long roundHalfEven(long instant) {
		long floor = roundFloor(instant);
		long ceiling = roundCeiling(instant);
		long diffFromFloor = instant - floor;
		long diffToCeiling = ceiling - instant;
		if (diffFromFloor < diffToCeiling) {
			return floor;
		}else
			if (diffToCeiling < diffFromFloor) {
				return ceiling;
			}else {
				if (((get(ceiling)) & 1) == 0) {
					return ceiling;
				}
				return floor;
			}
		
	}

	public long remainder(long instant) {
		return instant - (roundFloor(instant));
	}

	public java.lang.String toString() {
		return ("DateTimeField[" + (getName())) + ']';
	}
}


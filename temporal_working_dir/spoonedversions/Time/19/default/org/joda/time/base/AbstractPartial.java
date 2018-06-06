

package org.joda.time.base;


public abstract class AbstractPartial implements java.lang.Comparable<org.joda.time.ReadablePartial> , org.joda.time.ReadablePartial {
	protected AbstractPartial() {
		super();
	}

	protected abstract org.joda.time.DateTimeField getField(int index, org.joda.time.Chronology chrono);

	public org.joda.time.DateTimeFieldType getFieldType(int index) {
		return getField(index, getChronology()).getType();
	}

	public org.joda.time.DateTimeFieldType[] getFieldTypes() {
		org.joda.time.DateTimeFieldType[] result = new org.joda.time.DateTimeFieldType[size()];
		for (int i = 0; i < (result.length); i++) {
			result[i] = getFieldType(i);
		}
		return result;
	}

	public org.joda.time.DateTimeField getField(int index) {
		return getField(index, getChronology());
	}

	public org.joda.time.DateTimeField[] getFields() {
		org.joda.time.DateTimeField[] result = new org.joda.time.DateTimeField[size()];
		for (int i = 0; i < (result.length); i++) {
			result[i] = getField(i);
		}
		return result;
	}

	public int[] getValues() {
		int[] result = new int[size()];
		for (int i = 0; i < (result.length); i++) {
			result[i] = getValue(i);
		}
		return result;
	}

	public int get(org.joda.time.DateTimeFieldType type) {
		return getValue(indexOfSupported(type));
	}

	public boolean isSupported(org.joda.time.DateTimeFieldType type) {
		return (indexOf(type)) != (-1);
	}

	public int indexOf(org.joda.time.DateTimeFieldType type) {
		for (int i = 0, isize = size(); i < isize; i++) {
			if ((getFieldType(i)) == type) {
				return i;
			}
		}
		return -1;
	}

	protected int indexOfSupported(org.joda.time.DateTimeFieldType type) {
		int index = indexOf(type);
		if (index == (-1)) {
			throw new java.lang.IllegalArgumentException((("Field '" + type) + "' is not supported"));
		}
		return index;
	}

	protected int indexOf(org.joda.time.DurationFieldType type) {
		for (int i = 0, isize = size(); i < isize; i++) {
			if ((getFieldType(i).getDurationType()) == type) {
				return i;
			}
		}
		return -1;
	}

	protected int indexOfSupported(org.joda.time.DurationFieldType type) {
		int index = indexOf(type);
		if (index == (-1)) {
			throw new java.lang.IllegalArgumentException((("Field '" + type) + "' is not supported"));
		}
		return index;
	}

	public org.joda.time.DateTime toDateTime(org.joda.time.ReadableInstant baseInstant) {
		org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getInstantChronology(baseInstant);
		long instantMillis = org.joda.time.DateTimeUtils.getInstantMillis(baseInstant);
		long resolved = chrono.set(org.joda.time.base.AbstractPartial.this, instantMillis);
		return new org.joda.time.DateTime(resolved, chrono);
	}

	public boolean equals(java.lang.Object partial) {
		if ((org.joda.time.base.AbstractPartial.this) == partial) {
			return true;
		}
		if ((partial instanceof org.joda.time.ReadablePartial) == false) {
			return false;
		}
		org.joda.time.ReadablePartial other = ((org.joda.time.ReadablePartial) (partial));
		if ((size()) != (other.size())) {
			return false;
		}
		for (int i = 0, isize = size(); i < isize; i++) {
			if (((getValue(i)) != (other.getValue(i))) || ((getFieldType(i)) != (other.getFieldType(i)))) {
				return false;
			}
		}
		return org.joda.time.field.FieldUtils.equals(getChronology(), other.getChronology());
	}

	public int hashCode() {
		int total = 157;
		for (int i = 0, isize = size(); i < isize; i++) {
			total = (23 * total) + (getValue(i));
			total = (23 * total) + (getFieldType(i).hashCode());
		}
		total += getChronology().hashCode();
		return total;
	}

	public int compareTo(org.joda.time.ReadablePartial other) {
		if ((org.joda.time.base.AbstractPartial.this) == other) {
			return 0;
		}
		if ((size()) != (other.size())) {
			throw new java.lang.ClassCastException("ReadablePartial objects must have matching field types");
		}
		for (int i = 0, isize = size(); i < isize; i++) {
			if ((getFieldType(i)) != (other.getFieldType(i))) {
				throw new java.lang.ClassCastException("ReadablePartial objects must have matching field types");
			}
		}
		for (int i = 0, isize = size(); i < isize; i++) {
			if ((getValue(i)) > (other.getValue(i))) {
				return 1;
			}
			if ((getValue(i)) < (other.getValue(i))) {
				return -1;
			}
		}
		return 0;
	}

	public boolean isAfter(org.joda.time.ReadablePartial partial) {
		if (partial == null) {
			throw new java.lang.IllegalArgumentException("Partial cannot be null");
		}
		return (compareTo(partial)) > 0;
	}

	public boolean isBefore(org.joda.time.ReadablePartial partial) {
		if (partial == null) {
			throw new java.lang.IllegalArgumentException("Partial cannot be null");
		}
		return (compareTo(partial)) < 0;
	}

	public boolean isEqual(org.joda.time.ReadablePartial partial) {
		if (partial == null) {
			throw new java.lang.IllegalArgumentException("Partial cannot be null");
		}
		return (compareTo(partial)) == 0;
	}

	public java.lang.String toString(org.joda.time.format.DateTimeFormatter formatter) {
		if (formatter == null) {
			return toString();
		}
		return formatter.print(org.joda.time.base.AbstractPartial.this);
	}
}


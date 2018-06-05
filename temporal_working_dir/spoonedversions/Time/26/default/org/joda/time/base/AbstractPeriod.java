

package org.joda.time.base;


public abstract class AbstractPeriod implements org.joda.time.ReadablePeriod {
	protected AbstractPeriod() {
		super();
	}

	public org.joda.time.DurationFieldType[] getFieldTypes() {
		org.joda.time.DurationFieldType[] result = new org.joda.time.DurationFieldType[size()];
		for (int i = 0; i < (result.length); i++) {
			result[i] = getFieldType(i);
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

	public int get(org.joda.time.DurationFieldType type) {
		int index = indexOf(type);
		if (index == (-1)) {
			return 0;
		}
		return getValue(index);
	}

	public boolean isSupported(org.joda.time.DurationFieldType type) {
		return getPeriodType().isSupported(type);
	}

	public int indexOf(org.joda.time.DurationFieldType type) {
		return getPeriodType().indexOf(type);
	}

	public org.joda.time.Period toPeriod() {
		return new org.joda.time.Period(org.joda.time.base.AbstractPeriod.this);
	}

	public org.joda.time.MutablePeriod toMutablePeriod() {
		return new org.joda.time.MutablePeriod(org.joda.time.base.AbstractPeriod.this);
	}

	public boolean equals(java.lang.Object period) {
		if ((org.joda.time.base.AbstractPeriod.this) == period) {
			return true;
		}
		if ((period instanceof org.joda.time.ReadablePeriod) == false) {
			return false;
		}
		org.joda.time.ReadablePeriod other = ((org.joda.time.ReadablePeriod) (period));
		if ((size()) != (other.size())) {
			return false;
		}
		for (int i = 0, isize = size(); i < isize; i++) {
			if (((getValue(i)) != (other.getValue(i))) || ((getFieldType(i)) != (other.getFieldType(i)))) {
				return false;
			}
		}
		return true;
	}

	public int hashCode() {
		int total = 17;
		for (int i = 0, isize = size(); i < isize; i++) {
			total = (27 * total) + (getValue(i));
			total = (27 * total) + (getFieldType(i).hashCode());
		}
		return total;
	}

	@org.joda.convert.ToString
	public java.lang.String toString() {
		return org.joda.time.format.ISOPeriodFormat.standard().print(org.joda.time.base.AbstractPeriod.this);
	}

	public java.lang.String toString(org.joda.time.format.PeriodFormatter formatter) {
		if (formatter == null) {
			return toString();
		}
		return formatter.print(org.joda.time.base.AbstractPeriod.this);
	}
}


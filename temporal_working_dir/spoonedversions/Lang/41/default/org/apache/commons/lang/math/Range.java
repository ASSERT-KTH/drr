

package org.apache.commons.lang.math;


public abstract class Range {
	public Range() {
		super();
	}

	public abstract java.lang.Number getMinimumNumber();

	public long getMinimumLong() {
		return getMinimumNumber().longValue();
	}

	public int getMinimumInteger() {
		return getMinimumNumber().intValue();
	}

	public double getMinimumDouble() {
		return getMinimumNumber().doubleValue();
	}

	public float getMinimumFloat() {
		return getMinimumNumber().floatValue();
	}

	public abstract java.lang.Number getMaximumNumber();

	public long getMaximumLong() {
		return getMaximumNumber().longValue();
	}

	public int getMaximumInteger() {
		return getMaximumNumber().intValue();
	}

	public double getMaximumDouble() {
		return getMaximumNumber().doubleValue();
	}

	public float getMaximumFloat() {
		return getMaximumNumber().floatValue();
	}

	public abstract boolean containsNumber(java.lang.Number number);

	public boolean containsLong(java.lang.Number value) {
		if (value == null) {
			return false;
		}
		return containsLong(value.longValue());
	}

	public boolean containsLong(long value) {
		return (value >= (getMinimumLong())) && (value <= (getMaximumLong()));
	}

	public boolean containsInteger(java.lang.Number value) {
		if (value == null) {
			return false;
		}
		return containsInteger(value.intValue());
	}

	public boolean containsInteger(int value) {
		return (value >= (getMinimumInteger())) && (value <= (getMaximumInteger()));
	}

	public boolean containsDouble(java.lang.Number value) {
		if (value == null) {
			return false;
		}
		return containsDouble(value.doubleValue());
	}

	public boolean containsDouble(double value) {
		int compareMin = java.lang.Double.compare(getMinimumDouble(), value);
		int compareMax = java.lang.Double.compare(getMaximumDouble(), value);
		return (compareMin <= 0) && (compareMax >= 0);
	}

	public boolean containsFloat(java.lang.Number value) {
		if (value == null) {
			return false;
		}
		return containsFloat(value.floatValue());
	}

	public boolean containsFloat(float value) {
		int compareMin = java.lang.Float.compare(getMinimumFloat(), value);
		int compareMax = java.lang.Float.compare(getMaximumFloat(), value);
		return (compareMin <= 0) && (compareMax >= 0);
	}

	public boolean containsRange(org.apache.commons.lang.math.Range range) {
		if (range == null) {
			return false;
		}
		return (containsNumber(range.getMinimumNumber())) && (containsNumber(range.getMaximumNumber()));
	}

	public boolean overlapsRange(org.apache.commons.lang.math.Range range) {
		if (range == null) {
			return false;
		}
		return ((range.containsNumber(getMinimumNumber())) || (range.containsNumber(getMaximumNumber()))) || (containsNumber(range.getMinimumNumber()));
	}

	@java.lang.Override
	public boolean equals(java.lang.Object obj) {
		if (obj == (org.apache.commons.lang.math.Range.this)) {
			return true;
		}else
			if ((obj == null) || ((obj.getClass()) != (getClass()))) {
				return false;
			}else {
				org.apache.commons.lang.math.Range range = ((org.apache.commons.lang.math.Range) (obj));
				return (getMinimumNumber().equals(range.getMinimumNumber())) && (getMaximumNumber().equals(range.getMaximumNumber()));
			}
		
	}

	@java.lang.Override
	public int hashCode() {
		int result = 17;
		result = (37 * result) + (getClass().hashCode());
		result = (37 * result) + (getMinimumNumber().hashCode());
		result = (37 * result) + (getMaximumNumber().hashCode());
		return result;
	}

	@java.lang.Override
	public java.lang.String toString() {
		java.lang.StringBuffer buf = new java.lang.StringBuffer(32);
		buf.append("Range[");
		buf.append(getMinimumNumber());
		buf.append(',');
		buf.append(getMaximumNumber());
		buf.append(']');
		return buf.toString();
	}
}


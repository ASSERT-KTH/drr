

package org.apache.commons.lang.math;


public final class LongRange extends org.apache.commons.lang.math.Range implements java.io.Serializable {
	private static final long serialVersionUID = 71849363892720L;

	private final long min;

	private final long max;

	private transient java.lang.Long minObject = null;

	private transient java.lang.Long maxObject = null;

	private transient int hashCode = 0;

	private transient java.lang.String toString = null;

	public LongRange(long number) {
		super();
		this.min = number;
		this.max = number;
	}

	public LongRange(java.lang.Number number) {
		super();
		if (number == null) {
			throw new java.lang.IllegalArgumentException("The number must not be null");
		}
		this.min = number.longValue();
		this.max = number.longValue();
		if (number instanceof java.lang.Long) {
			org.apache.commons.lang.math.LongRange.this.minObject = ((java.lang.Long) (number));
			org.apache.commons.lang.math.LongRange.this.maxObject = ((java.lang.Long) (number));
		}
	}

	public LongRange(long number1, long number2) {
		super();
		if (number2 < number1) {
			this.min = number2;
			this.max = number1;
		}else {
			this.min = number1;
			this.max = number2;
		}
	}

	public LongRange(java.lang.Number number1, java.lang.Number number2) {
		super();
		if ((number1 == null) || (number2 == null)) {
			throw new java.lang.IllegalArgumentException("The numbers must not be null");
		}
		long number1val = number1.longValue();
		long number2val = number2.longValue();
		if (number2val < number1val) {
			this.min = number2val;
			this.max = number1val;
			if (number2 instanceof java.lang.Long) {
				org.apache.commons.lang.math.LongRange.this.minObject = ((java.lang.Long) (number2));
			}
			if (number1 instanceof java.lang.Long) {
				org.apache.commons.lang.math.LongRange.this.maxObject = ((java.lang.Long) (number1));
			}
		}else {
			this.min = number1val;
			this.max = number2val;
			if (number1 instanceof java.lang.Long) {
				org.apache.commons.lang.math.LongRange.this.minObject = ((java.lang.Long) (number1));
			}
			if (number2 instanceof java.lang.Long) {
				org.apache.commons.lang.math.LongRange.this.maxObject = ((java.lang.Long) (number2));
			}
		}
	}

	public java.lang.Number getMinimumNumber() {
		if ((minObject) == null) {
			minObject = new java.lang.Long(min);
		}
		return minObject;
	}

	public long getMinimumLong() {
		return min;
	}

	public int getMinimumInteger() {
		return ((int) (min));
	}

	public double getMinimumDouble() {
		return min;
	}

	public float getMinimumFloat() {
		return min;
	}

	public java.lang.Number getMaximumNumber() {
		if ((maxObject) == null) {
			maxObject = new java.lang.Long(max);
		}
		return maxObject;
	}

	public long getMaximumLong() {
		return max;
	}

	public int getMaximumInteger() {
		return ((int) (max));
	}

	public double getMaximumDouble() {
		return max;
	}

	public float getMaximumFloat() {
		return max;
	}

	public boolean containsNumber(java.lang.Number number) {
		if (number == null) {
			return false;
		}
		return containsLong(number.longValue());
	}

	public boolean containsLong(long value) {
		return (value >= (min)) && (value <= (max));
	}

	public boolean containsRange(org.apache.commons.lang.math.Range range) {
		if (range == null) {
			return false;
		}
		return (containsLong(range.getMinimumLong())) && (containsLong(range.getMaximumLong()));
	}

	public boolean overlapsRange(org.apache.commons.lang.math.Range range) {
		if (range == null) {
			return false;
		}
		return ((range.containsLong(min)) || (range.containsLong(max))) || (containsLong(range.getMinimumLong()));
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.apache.commons.lang.math.LongRange.this)) {
			return true;
		}
		if ((obj instanceof org.apache.commons.lang.math.LongRange) == false) {
			return false;
		}
		org.apache.commons.lang.math.LongRange range = ((org.apache.commons.lang.math.LongRange) (obj));
		return ((min) == (range.min)) && ((max) == (range.max));
	}

	public int hashCode() {
		if ((hashCode) == 0) {
			hashCode = 17;
			hashCode = (37 * (hashCode)) + (getClass().hashCode());
			hashCode = (37 * (hashCode)) + ((int) ((min) ^ ((min) >> 32)));
			hashCode = (37 * (hashCode)) + ((int) ((max) ^ ((max) >> 32)));
		}
		return hashCode;
	}

	public java.lang.String toString() {
		if ((toString) == null) {
			java.lang.StringBuffer buf = new java.lang.StringBuffer(32);
			buf.append("Range[");
			buf.append(min);
			buf.append(',');
			buf.append(max);
			buf.append(']');
			toString = buf.toString();
		}
		return toString;
	}
}


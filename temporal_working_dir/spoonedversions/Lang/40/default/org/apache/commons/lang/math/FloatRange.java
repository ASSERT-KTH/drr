

package org.apache.commons.lang.math;


public final class FloatRange extends org.apache.commons.lang.math.Range implements java.io.Serializable {
	private static final long serialVersionUID = 71849363892750L;

	private final float min;

	private final float max;

	private transient java.lang.Float minObject = null;

	private transient java.lang.Float maxObject = null;

	private transient int hashCode = 0;

	private transient java.lang.String toString = null;

	public FloatRange(float number) {
		super();
		if (java.lang.Float.isNaN(number)) {
			throw new java.lang.IllegalArgumentException("The number must not be NaN");
		}
		this.min = number;
		this.max = number;
	}

	public FloatRange(java.lang.Number number) {
		super();
		if (number == null) {
			throw new java.lang.IllegalArgumentException("The number must not be null");
		}
		this.min = number.floatValue();
		this.max = number.floatValue();
		if ((java.lang.Float.isNaN(min)) || (java.lang.Float.isNaN(max))) {
			throw new java.lang.IllegalArgumentException("The number must not be NaN");
		}
		if (number instanceof java.lang.Float) {
			org.apache.commons.lang.math.FloatRange.this.minObject = ((java.lang.Float) (number));
			org.apache.commons.lang.math.FloatRange.this.maxObject = ((java.lang.Float) (number));
		}
	}

	public FloatRange(float number1, float number2) {
		super();
		if ((java.lang.Float.isNaN(number1)) || (java.lang.Float.isNaN(number2))) {
			throw new java.lang.IllegalArgumentException("The numbers must not be NaN");
		}
		if (number2 < number1) {
			this.min = number2;
			this.max = number1;
		}else {
			this.min = number1;
			this.max = number2;
		}
	}

	public FloatRange(java.lang.Number number1, java.lang.Number number2) {
		super();
		if ((number1 == null) || (number2 == null)) {
			throw new java.lang.IllegalArgumentException("The numbers must not be null");
		}
		float number1val = number1.floatValue();
		float number2val = number2.floatValue();
		if ((java.lang.Float.isNaN(number1val)) || (java.lang.Float.isNaN(number2val))) {
			throw new java.lang.IllegalArgumentException("The numbers must not be NaN");
		}
		if (number2val < number1val) {
			this.min = number2val;
			this.max = number1val;
			if (number2 instanceof java.lang.Float) {
				org.apache.commons.lang.math.FloatRange.this.minObject = ((java.lang.Float) (number2));
			}
			if (number1 instanceof java.lang.Float) {
				org.apache.commons.lang.math.FloatRange.this.maxObject = ((java.lang.Float) (number1));
			}
		}else {
			this.min = number1val;
			this.max = number2val;
			if (number1 instanceof java.lang.Float) {
				org.apache.commons.lang.math.FloatRange.this.minObject = ((java.lang.Float) (number1));
			}
			if (number2 instanceof java.lang.Float) {
				org.apache.commons.lang.math.FloatRange.this.maxObject = ((java.lang.Float) (number2));
			}
		}
	}

	@java.lang.Override
	public java.lang.Number getMinimumNumber() {
		if ((minObject) == null) {
			minObject = new java.lang.Float(min);
		}
		return minObject;
	}

	@java.lang.Override
	public long getMinimumLong() {
		return ((long) (min));
	}

	@java.lang.Override
	public int getMinimumInteger() {
		return ((int) (min));
	}

	@java.lang.Override
	public double getMinimumDouble() {
		return min;
	}

	@java.lang.Override
	public float getMinimumFloat() {
		return min;
	}

	@java.lang.Override
	public java.lang.Number getMaximumNumber() {
		if ((maxObject) == null) {
			maxObject = new java.lang.Float(max);
		}
		return maxObject;
	}

	@java.lang.Override
	public long getMaximumLong() {
		return ((long) (max));
	}

	@java.lang.Override
	public int getMaximumInteger() {
		return ((int) (max));
	}

	@java.lang.Override
	public double getMaximumDouble() {
		return max;
	}

	@java.lang.Override
	public float getMaximumFloat() {
		return max;
	}

	@java.lang.Override
	public boolean containsNumber(java.lang.Number number) {
		if (number == null) {
			return false;
		}
		return containsFloat(number.floatValue());
	}

	@java.lang.Override
	public boolean containsFloat(float value) {
		return (value >= (min)) && (value <= (max));
	}

	@java.lang.Override
	public boolean containsRange(org.apache.commons.lang.math.Range range) {
		if (range == null) {
			return false;
		}
		return (containsFloat(range.getMinimumFloat())) && (containsFloat(range.getMaximumFloat()));
	}

	@java.lang.Override
	public boolean overlapsRange(org.apache.commons.lang.math.Range range) {
		if (range == null) {
			return false;
		}
		return ((range.containsFloat(min)) || (range.containsFloat(max))) || (containsFloat(range.getMinimumFloat()));
	}

	@java.lang.Override
	public boolean equals(java.lang.Object obj) {
		if (obj == (org.apache.commons.lang.math.FloatRange.this)) {
			return true;
		}
		if ((obj instanceof org.apache.commons.lang.math.FloatRange) == false) {
			return false;
		}
		org.apache.commons.lang.math.FloatRange range = ((org.apache.commons.lang.math.FloatRange) (obj));
		return ((java.lang.Float.floatToIntBits(min)) == (java.lang.Float.floatToIntBits(range.min))) && ((java.lang.Float.floatToIntBits(max)) == (java.lang.Float.floatToIntBits(range.max)));
	}

	@java.lang.Override
	public int hashCode() {
		int temp = hashCode;
		if (temp == 0) {
			temp = 17;
			temp = (37 * temp) + (getClass().hashCode());
			temp = (37 * temp) + (java.lang.Float.floatToIntBits(min));
			temp = (37 * temp) + (java.lang.Float.floatToIntBits(max));
			hashCode = temp;
		}
		return hashCode;
	}

	@java.lang.Override
	public java.lang.String toString() {
		if ((toString) == null) {
			java.lang.StringBuilder buf = new java.lang.StringBuilder(32);
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


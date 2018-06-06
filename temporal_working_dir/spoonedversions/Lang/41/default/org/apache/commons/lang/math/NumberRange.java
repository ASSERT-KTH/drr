

package org.apache.commons.lang.math;


public final class NumberRange extends org.apache.commons.lang.math.Range implements java.io.Serializable {
	private static final long serialVersionUID = 71849363892710L;

	private final java.lang.Number min;

	private final java.lang.Number max;

	private transient int hashCode = 0;

	private transient java.lang.String toString = null;

	public NumberRange(java.lang.Number num) {
		if (num == null) {
			throw new java.lang.IllegalArgumentException("The number must not be null");
		}
		if ((num instanceof java.lang.Comparable<?>) == false) {
			throw new java.lang.IllegalArgumentException("The number must implement Comparable");
		}
		if ((num instanceof java.lang.Double) && (((java.lang.Double) (num)).isNaN())) {
			throw new java.lang.IllegalArgumentException("The number must not be NaN");
		}
		if ((num instanceof java.lang.Float) && (((java.lang.Float) (num)).isNaN())) {
			throw new java.lang.IllegalArgumentException("The number must not be NaN");
		}
		this.min = num;
		this.max = num;
	}

	public NumberRange(java.lang.Number num1, java.lang.Number num2) {
		if ((num1 == null) || (num2 == null)) {
			throw new java.lang.IllegalArgumentException("The numbers must not be null");
		}
		if ((num1.getClass()) != (num2.getClass())) {
			throw new java.lang.IllegalArgumentException("The numbers must be of the same type");
		}
		if ((num1 instanceof java.lang.Comparable<?>) == false) {
			throw new java.lang.IllegalArgumentException("The numbers must implement Comparable");
		}
		if (num1 instanceof java.lang.Double) {
			if ((((java.lang.Double) (num1)).isNaN()) || (((java.lang.Double) (num2)).isNaN())) {
				throw new java.lang.IllegalArgumentException("The number must not be NaN");
			}
		}else
			if (num1 instanceof java.lang.Float) {
				if ((((java.lang.Float) (num1)).isNaN()) || (((java.lang.Float) (num2)).isNaN())) {
					throw new java.lang.IllegalArgumentException("The number must not be NaN");
				}
			}
		
		int compare = ((java.lang.Comparable<java.lang.Number>) (num1)).compareTo(num2);
		if (compare == 0) {
			this.min = num1;
			this.max = num1;
		}else
			if (compare > 0) {
				this.min = num2;
				this.max = num1;
			}else {
				this.min = num1;
				this.max = num2;
			}
		
	}

	@java.lang.Override
	public java.lang.Number getMinimumNumber() {
		return min;
	}

	@java.lang.Override
	public java.lang.Number getMaximumNumber() {
		return max;
	}

	@java.lang.Override
	public boolean containsNumber(java.lang.Number number) {
		if (number == null) {
			return false;
		}
		if ((number.getClass()) != (min.getClass())) {
			throw new java.lang.IllegalArgumentException("The number must be of the same type as the range numbers");
		}
		int compareMin = ((java.lang.Comparable<java.lang.Number>) (min)).compareTo(number);
		int compareMax = ((java.lang.Comparable<java.lang.Number>) (max)).compareTo(number);
		return (compareMin <= 0) && (compareMax >= 0);
	}

	@java.lang.Override
	public boolean equals(java.lang.Object obj) {
		if (obj == (org.apache.commons.lang.math.NumberRange.this)) {
			return true;
		}
		if ((obj instanceof org.apache.commons.lang.math.NumberRange) == false) {
			return false;
		}
		org.apache.commons.lang.math.NumberRange range = ((org.apache.commons.lang.math.NumberRange) (obj));
		return (min.equals(range.min)) && (max.equals(range.max));
	}

	@java.lang.Override
	public int hashCode() {
		int temp = hashCode;
		if (temp == 0) {
			temp = 17;
			temp = (37 * temp) + (getClass().hashCode());
			temp = (37 * temp) + (min.hashCode());
			temp = (37 * temp) + (max.hashCode());
			hashCode = temp;
		}
		return hashCode;
	}

	@java.lang.Override
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


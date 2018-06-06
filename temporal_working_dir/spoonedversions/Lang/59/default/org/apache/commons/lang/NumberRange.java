

package org.apache.commons.lang;


public final class NumberRange {
	private final java.lang.Number min;

	private final java.lang.Number max;

	public NumberRange(java.lang.Number num) {
		if (num == null) {
			throw new java.lang.NullPointerException("The number must not be null");
		}
		this.min = num;
		this.max = num;
	}

	public NumberRange(java.lang.Number min, java.lang.Number max) {
		if (min == null) {
			throw new java.lang.NullPointerException("The minimum value must not be null");
		}else
			if (max == null) {
				throw new java.lang.NullPointerException("The maximum value must not be null");
			}
		
		if ((max.doubleValue()) < (min.doubleValue())) {
			this.min = this.max = min;
		}else {
			this.min = min;
			this.max = max;
		}
	}

	public java.lang.Number getMinimum() {
		return min;
	}

	public java.lang.Number getMaximum() {
		return max;
	}

	public boolean includesNumber(java.lang.Number number) {
		if (number == null) {
			return false;
		}else {
			return (!((min.doubleValue()) > (number.doubleValue()))) && (!((max.doubleValue()) < (number.doubleValue())));
		}
	}

	public boolean includesRange(org.apache.commons.lang.NumberRange range) {
		if (range == null) {
			return false;
		}else {
			return (includesNumber(range.min)) && (includesNumber(range.max));
		}
	}

	public boolean overlaps(org.apache.commons.lang.NumberRange range) {
		if (range == null) {
			return false;
		}else {
			return ((range.includesNumber(min)) || (range.includesNumber(max))) || (includesRange(range));
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.apache.commons.lang.NumberRange.this)) {
			return true;
		}else
			if (!(obj instanceof org.apache.commons.lang.NumberRange)) {
				return false;
			}else {
				org.apache.commons.lang.NumberRange range = ((org.apache.commons.lang.NumberRange) (obj));
				return (min.equals(range.min)) && (max.equals(range.max));
			}
		
	}

	public int hashCode() {
		int result = 17;
		result = (37 * result) + (min.hashCode());
		result = (37 * result) + (max.hashCode());
		return result;
	}

	public java.lang.String toString() {
		java.lang.StringBuffer sb = new java.lang.StringBuffer();
		if ((min.doubleValue()) < 0) {
			sb.append('(').append(min).append(')');
		}else {
			sb.append(min);
		}
		sb.append('-');
		if ((max.doubleValue()) < 0) {
			sb.append('(').append(max).append(')');
		}else {
			sb.append(max);
		}
		return sb.toString();
	}
}


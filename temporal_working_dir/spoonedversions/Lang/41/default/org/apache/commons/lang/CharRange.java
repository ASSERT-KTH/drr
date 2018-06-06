

package org.apache.commons.lang;


public final class CharRange implements java.io.Serializable {
	private static final long serialVersionUID = 8270183163158333422L;

	private final char start;

	private final char end;

	private final boolean negated;

	private transient java.lang.String iToString;

	public CharRange(char ch) {
		this(ch, ch, false);
	}

	public CharRange(char ch, boolean negated) {
		this(ch, ch, negated);
	}

	public CharRange(char start, char end) {
		this(start, end, false);
	}

	public CharRange(char start, char end, boolean negated) {
		super();
		if (start > end) {
			char temp = start;
			start = end;
			end = temp;
		}
		this.start = start;
		this.end = end;
		this.negated = negated;
	}

	public char getStart() {
		return org.apache.commons.lang.CharRange.this.start;
	}

	public char getEnd() {
		return org.apache.commons.lang.CharRange.this.end;
	}

	public boolean isNegated() {
		return negated;
	}

	public boolean contains(char ch) {
		return ((ch >= (start)) && (ch <= (end))) != (negated);
	}

	public boolean contains(org.apache.commons.lang.CharRange range) {
		if (range == null) {
			throw new java.lang.IllegalArgumentException("The Range must not be null");
		}
		if (negated) {
			if (range.negated) {
				return ((start) >= (range.start)) && ((end) <= (range.end));
			}
			return ((range.end) < (start)) || ((range.start) > (end));
		}
		if (range.negated) {
			return ((start) == 0) && ((end) == (java.lang.Character.MAX_VALUE));
		}
		return ((start) <= (range.start)) && ((end) >= (range.end));
	}

	@java.lang.Override
	public boolean equals(java.lang.Object obj) {
		if (obj == (org.apache.commons.lang.CharRange.this)) {
			return true;
		}
		if ((obj instanceof org.apache.commons.lang.CharRange) == false) {
			return false;
		}
		org.apache.commons.lang.CharRange other = ((org.apache.commons.lang.CharRange) (obj));
		return (((start) == (other.start)) && ((end) == (other.end))) && ((negated) == (other.negated));
	}

	@java.lang.Override
	public int hashCode() {
		return ((83 + (start)) + (7 * (end))) + (negated ? 1 : 0);
	}

	@java.lang.Override
	public java.lang.String toString() {
		if ((iToString) == null) {
			java.lang.StringBuffer buf = new java.lang.StringBuffer(4);
			if (isNegated()) {
				buf.append('^');
			}
			buf.append(start);
			if ((start) != (end)) {
				buf.append('-');
				buf.append(end);
			}
			iToString = buf.toString();
		}
		return iToString;
	}
}


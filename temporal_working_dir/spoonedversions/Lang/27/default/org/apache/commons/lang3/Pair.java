

package org.apache.commons.lang3;


public final class Pair<L, R> implements java.io.Serializable {
	private static final long serialVersionUID = 4954918890077093841L;

	public final L left;

	public final R right;

	public Pair(L left, R right) {
		this.left = left;
		this.right = right;
	}

	@java.lang.Override
	public boolean equals(java.lang.Object obj) {
		if (obj == (org.apache.commons.lang3.Pair.this)) {
			return true;
		}
		if ((obj instanceof org.apache.commons.lang3.Pair<?, ?>) == false) {
			return false;
		}
		org.apache.commons.lang3.Pair<?, ?> other = ((org.apache.commons.lang3.Pair<?, ?>) (obj));
		return (org.apache.commons.lang3.ObjectUtils.equals(left, other.left)) && (org.apache.commons.lang3.ObjectUtils.equals(right, other.right));
	}

	@java.lang.Override
	public int hashCode() {
		return new org.apache.commons.lang3.builder.HashCodeBuilder().append(left).append(right).toHashCode();
	}

	@java.lang.Override
	public java.lang.String toString() {
		java.lang.StringBuilder builder = new java.lang.StringBuilder();
		builder.append("(");
		builder.append(left);
		builder.append(",");
		builder.append(right);
		builder.append(")");
		return builder.toString();
	}

	public static <L, R> org.apache.commons.lang3.Pair<L, R> of(L left, R right) {
		return new org.apache.commons.lang3.Pair<L, R>(left, right);
	}
}


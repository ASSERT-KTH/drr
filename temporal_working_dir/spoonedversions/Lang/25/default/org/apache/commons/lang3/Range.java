

package org.apache.commons.lang3;


public final class Range<T> implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private final java.util.Comparator<T> comparator;

	private final T minimum;

	private final T maximum;

	private transient int hashCode = 0;

	private transient java.lang.String toString = null;

	public static <T extends java.lang.Comparable<T>> org.apache.commons.lang3.Range<T> is(T element) {
		return new org.apache.commons.lang3.Range<T>(element, element, org.apache.commons.lang3.Range.ComparableComparator.<T>getInstance());
	}

	public static <T extends java.lang.Comparable<T>> org.apache.commons.lang3.Range<T> between(T element1, T element2) {
		return new org.apache.commons.lang3.Range<T>(element1, element2, org.apache.commons.lang3.Range.ComparableComparator.<T>getInstance());
	}

	public static <T> org.apache.commons.lang3.Range<T> is(T element, java.util.Comparator<T> c) {
		return new org.apache.commons.lang3.Range<T>(element, element, c);
	}

	public static <T> org.apache.commons.lang3.Range<T> between(T element1, T element2, java.util.Comparator<T> c) {
		return new org.apache.commons.lang3.Range<T>(element1, element2, c);
	}

	private Range(T element1, T element2, java.util.Comparator<T> c) {
		if ((element1 == null) || (element2 == null)) {
			throw new java.lang.IllegalArgumentException(((("Elements in a range must not be null: element1=" + element1) + ", element2=") + element2));
		}
		if (c == null) {
			throw new java.lang.IllegalArgumentException("Comparator must not be null");
		}
		if ((c.compare(element1, element2)) < 1) {
			this.minimum = element1;
			this.maximum = element2;
		}else {
			this.minimum = element2;
			this.maximum = element1;
		}
		this.comparator = c;
	}

	public T getMinimum() {
		return org.apache.commons.lang3.Range.this.minimum;
	}

	public T getMaximum() {
		return org.apache.commons.lang3.Range.this.maximum;
	}

	public java.util.Comparator<T> getComparator() {
		return org.apache.commons.lang3.Range.this.comparator;
	}

	public boolean isDefaultNaturalOrdering() {
		return (org.apache.commons.lang3.Range.this.comparator) == (org.apache.commons.lang3.Range.ComparableComparator.INSTANCE);
	}

	public boolean contains(T element) {
		if (element == null) {
			return false;
		}
		return ((comparator.compare(element, org.apache.commons.lang3.Range.this.minimum)) > (-1)) && ((comparator.compare(element, org.apache.commons.lang3.Range.this.maximum)) < 1);
	}

	public boolean elementBefore(T element) {
		if (element == null) {
			return false;
		}
		return (org.apache.commons.lang3.Range.this.comparator.compare(element, org.apache.commons.lang3.Range.this.minimum)) < 0;
	}

	public boolean elementAfter(T element) {
		if (element == null) {
			return false;
		}
		return (org.apache.commons.lang3.Range.this.comparator.compare(element, org.apache.commons.lang3.Range.this.maximum)) > 0;
	}

	public int elementCompareTo(T element) {
		if (element == null) {
			throw new java.lang.NullPointerException("Element is null");
		}
		if (elementBefore(element)) {
			return -1;
		}else
			if (elementAfter(element)) {
				return 1;
			}else {
				return 0;
			}
		
	}

	public boolean containsRange(org.apache.commons.lang3.Range<T> range) {
		if (range == null) {
			return false;
		}
		return (contains(range.getMinimum())) && (contains(range.getMaximum()));
	}

	public boolean overlapsRange(org.apache.commons.lang3.Range<T> range) {
		if (range == null) {
			return false;
		}
		return ((range.contains(org.apache.commons.lang3.Range.this.minimum)) || (range.contains(org.apache.commons.lang3.Range.this.maximum))) || (contains(range.getMinimum()));
	}

	@java.lang.Override
	public boolean equals(java.lang.Object obj) {
		if (obj == (org.apache.commons.lang3.Range.this)) {
			return true;
		}else
			if ((obj == null) || ((obj.getClass()) != (getClass()))) {
				return false;
			}else {
				@java.lang.SuppressWarnings(value = "unchecked")
				org.apache.commons.lang3.Range<T> range = ((org.apache.commons.lang3.Range<T>) (obj));
				return (getMinimum().equals(range.getMinimum())) && (getMaximum().equals(range.getMaximum()));
			}
		
	}

	@java.lang.Override
	public int hashCode() {
		int result = hashCode;
		if ((hashCode) == 0) {
			result = 17;
			result = (37 * result) + (getClass().hashCode());
			result = (37 * result) + (org.apache.commons.lang3.Range.this.minimum.hashCode());
			result = (37 * result) + (org.apache.commons.lang3.Range.this.maximum.hashCode());
			hashCode = result;
		}
		return result;
	}

	@java.lang.Override
	public java.lang.String toString() {
		java.lang.String result = toString;
		if (result == null) {
			java.lang.StringBuilder buf = new java.lang.StringBuilder(32);
			buf.append("Range[");
			buf.append(org.apache.commons.lang3.Range.this.minimum);
			buf.append(',');
			buf.append(org.apache.commons.lang3.Range.this.maximum);
			buf.append(']');
			result = buf.toString();
			toString = result;
		}
		return result;
	}

	private static class ComparableComparator<E extends java.lang.Comparable<? super E>> implements java.io.Serializable , java.util.Comparator<E> {
		private static final long serialVersionUID = 1L;

		@java.lang.SuppressWarnings(value = "rawtypes")
		public static final org.apache.commons.lang3.Range.ComparableComparator<?> INSTANCE = new org.apache.commons.lang3.Range.ComparableComparator();

		@java.lang.SuppressWarnings(value = "unchecked")
		public static <E extends java.lang.Comparable<? super E>> org.apache.commons.lang3.Range.ComparableComparator<E> getInstance() {
			return ((org.apache.commons.lang3.Range.ComparableComparator<E>) (org.apache.commons.lang3.Range.ComparableComparator.INSTANCE));
		}

		public ComparableComparator() {
			super();
		}

		public int compare(E obj1, E obj2) {
			return obj1.compareTo(obj2);
		}

		@java.lang.Override
		public int hashCode() {
			return "ComparableComparator".hashCode();
		}

		@java.lang.Override
		public boolean equals(java.lang.Object object) {
			return ((org.apache.commons.lang3.Range.ComparableComparator.this) == object) || ((null != object) && (object.getClass().equals(org.apache.commons.lang3.Range.ComparableComparator.this.getClass())));
		}
	}
}


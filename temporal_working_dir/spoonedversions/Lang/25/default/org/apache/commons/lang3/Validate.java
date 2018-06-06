

package org.apache.commons.lang3;


public class Validate {
	private static final java.lang.String DEFAULT_EXCLUSIVE_BETWEEN_EX_MESSAGE = "The value %s is not in the specified exclusive range of %s to %s";

	private static final java.lang.String DEFAULT_INCLUSIVE_BETWEEN_EX_MESSAGE = "The value %s is not in the specified inclusive range of %s to %s";

	private static final java.lang.String DEFAULT_MATCHES_PATTERN_EX = "The string %s does not match the pattern %s";

	private static final java.lang.String DEFAULT_IS_NULL_EX_MESSAGE = "The validated object is null";

	private static final java.lang.String DEFAULT_IS_TRUE_EX_MESSAGE = "The validated expression is false";

	private static final java.lang.String DEFAULT_NO_NULL_ELEMENTS_ARRAY_EX_MESSAGE = "The validated array contains null element at index: %d";

	private static final java.lang.String DEFAULT_NO_NULL_ELEMENTS_COLLECTION_EX_MESSAGE = "The validated collection contains null element at index: %d";

	private static final java.lang.String DEFAULT_NOT_BLANK_EX_MESSAGE = "The validated character sequence is blank";

	private static final java.lang.String DEFAULT_NOT_EMPTY_ARRAY_EX_MESSAGE = "The validated array is empty";

	private static final java.lang.String DEFAULT_NOT_EMPTY_CHAR_SEQUENCE_EX_MESSAGE = "The validated character sequence is empty";

	private static final java.lang.String DEFAULT_NOT_EMPTY_COLLECTION_EX_MESSAGE = "The validated collection is empty";

	private static final java.lang.String DEFAULT_NOT_EMPTY_MAP_EX_MESSAGE = "The validated map is empty";

	private static final java.lang.String DEFAULT_VALID_INDEX_ARRAY_EX_MESSAGE = "The validated array index is invalid: %d";

	private static final java.lang.String DEFAULT_VALID_INDEX_CHAR_SEQUENCE_EX_MESSAGE = "The validated character sequence index is invalid: %d";

	private static final java.lang.String DEFAULT_VALID_INDEX_COLLECTION_EX_MESSAGE = "The validated collection index is invalid: %d";

	private static final java.lang.String DEFAULT_VALID_STATE_EX_MESSAGE = "The validated state is false";

	private static final java.lang.String DEFAULT_IS_ASSIGNABLE_EX_MESSAGE = "The validated class can not be converted to the %s class";

	private static final java.lang.String DEFAULT_IS_INSTANCE_OF_EX_MESSAGE = "The validated object is not an instance of %s";

	public Validate() {
		super();
	}

	public static void isTrue(boolean expression, java.lang.String message, long value) {
		if (expression == false) {
			throw new java.lang.IllegalArgumentException(java.lang.String.format(message, java.lang.Long.valueOf(value)));
		}
	}

	public static void isTrue(boolean expression, java.lang.String message, double value) {
		if (expression == false) {
			throw new java.lang.IllegalArgumentException(java.lang.String.format(message, new java.lang.Double(value)));
		}
	}

	public static void isTrue(boolean expression, java.lang.String message, java.lang.Object... values) {
		if (expression == false) {
			throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values));
		}
	}

	public static void isTrue(boolean expression) {
		if (expression == false) {
			throw new java.lang.IllegalArgumentException(org.apache.commons.lang3.Validate.DEFAULT_IS_TRUE_EX_MESSAGE);
		}
	}

	public static <T> T notNull(T object) {
		return org.apache.commons.lang3.Validate.notNull(object, org.apache.commons.lang3.Validate.DEFAULT_IS_NULL_EX_MESSAGE);
	}

	public static <T> T notNull(T object, java.lang.String message, java.lang.Object... values) {
		if (object == null) {
			throw new java.lang.NullPointerException(java.lang.String.format(message, values));
		}
		return object;
	}

	public static <T> T[] notEmpty(T[] array, java.lang.String message, java.lang.Object... values) {
		if (array == null) {
			throw new java.lang.NullPointerException(java.lang.String.format(message, values));
		}
		if ((array.length) == 0) {
			throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values));
		}
		return array;
	}

	public static <T> T[] notEmpty(T[] array) {
		return org.apache.commons.lang3.Validate.notEmpty(array, org.apache.commons.lang3.Validate.DEFAULT_NOT_EMPTY_ARRAY_EX_MESSAGE);
	}

	public static <T extends java.util.Collection<?>> T notEmpty(T collection, java.lang.String message, java.lang.Object... values) {
		if (collection == null) {
			throw new java.lang.NullPointerException(java.lang.String.format(message, values));
		}
		if ((collection.size()) == 0) {
			throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values));
		}
		return collection;
	}

	public static <T extends java.util.Collection<?>> T notEmpty(T collection) {
		return org.apache.commons.lang3.Validate.notEmpty(collection, org.apache.commons.lang3.Validate.DEFAULT_NOT_EMPTY_COLLECTION_EX_MESSAGE);
	}

	public static <T extends java.util.Map<?, ?>> T notEmpty(T map, java.lang.String message, java.lang.Object... values) {
		if (map == null) {
			throw new java.lang.NullPointerException(java.lang.String.format(message, values));
		}
		if ((map.size()) == 0) {
			throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values));
		}
		return map;
	}

	public static <T extends java.util.Map<?, ?>> T notEmpty(T map) {
		return org.apache.commons.lang3.Validate.notEmpty(map, org.apache.commons.lang3.Validate.DEFAULT_NOT_EMPTY_MAP_EX_MESSAGE);
	}

	public static <T extends java.lang.CharSequence> T notEmpty(T chars, java.lang.String message, java.lang.Object... values) {
		if (chars == null) {
			throw new java.lang.NullPointerException(java.lang.String.format(message, values));
		}
		if ((chars.length()) == 0) {
			throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values));
		}
		return chars;
	}

	public static <T extends java.lang.CharSequence> T notEmpty(T chars) {
		return org.apache.commons.lang3.Validate.notEmpty(chars, org.apache.commons.lang3.Validate.DEFAULT_NOT_EMPTY_CHAR_SEQUENCE_EX_MESSAGE);
	}

	public static <T extends java.lang.CharSequence> T notBlank(T chars, java.lang.String message, java.lang.Object... values) {
		if (chars == null) {
			throw new java.lang.NullPointerException(java.lang.String.format(message, values));
		}
		if (org.apache.commons.lang3.StringUtils.isBlank(chars)) {
			throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values));
		}
		return chars;
	}

	public static <T extends java.lang.CharSequence> T notBlank(T chars) {
		return org.apache.commons.lang3.Validate.notBlank(chars, org.apache.commons.lang3.Validate.DEFAULT_NOT_BLANK_EX_MESSAGE);
	}

	public static <T> T[] noNullElements(T[] array, java.lang.String message, java.lang.Object... values) {
		org.apache.commons.lang3.Validate.notNull(array);
		for (int i = 0; i < (array.length); i++) {
			if ((array[i]) == null) {
				java.lang.Object[] values2 = org.apache.commons.lang3.ArrayUtils.add(values, java.lang.Integer.valueOf(i));
				throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values2));
			}
		}
		return array;
	}

	public static <T> T[] noNullElements(T[] array) {
		return org.apache.commons.lang3.Validate.noNullElements(array, org.apache.commons.lang3.Validate.DEFAULT_NO_NULL_ELEMENTS_ARRAY_EX_MESSAGE);
	}

	public static <T extends java.lang.Iterable<?>> T noNullElements(T iterable, java.lang.String message, java.lang.Object... values) {
		org.apache.commons.lang3.Validate.notNull(iterable);
		int i = 0;
		for (java.util.Iterator<?> it = iterable.iterator(); it.hasNext(); i++) {
			if ((it.next()) == null) {
				java.lang.Object[] values2 = org.apache.commons.lang3.ArrayUtils.addAll(values, java.lang.Integer.valueOf(i));
				throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values2));
			}
		}
		return iterable;
	}

	public static <T extends java.lang.Iterable<?>> T noNullElements(T iterable) {
		return org.apache.commons.lang3.Validate.noNullElements(iterable, org.apache.commons.lang3.Validate.DEFAULT_NO_NULL_ELEMENTS_COLLECTION_EX_MESSAGE);
	}

	public static <T> T[] validIndex(T[] array, int index, java.lang.String message, java.lang.Object... values) {
		org.apache.commons.lang3.Validate.notNull(array);
		if ((index < 0) || (index >= (array.length))) {
			throw new java.lang.IndexOutOfBoundsException(java.lang.String.format(message, values));
		}
		return array;
	}

	public static <T> T[] validIndex(T[] array, int index) {
		return org.apache.commons.lang3.Validate.validIndex(array, index, org.apache.commons.lang3.Validate.DEFAULT_VALID_INDEX_ARRAY_EX_MESSAGE, java.lang.Integer.valueOf(index));
	}

	public static <T extends java.util.Collection<?>> T validIndex(T collection, int index, java.lang.String message, java.lang.Object... values) {
		org.apache.commons.lang3.Validate.notNull(collection);
		if ((index < 0) || (index >= (collection.size()))) {
			throw new java.lang.IndexOutOfBoundsException(java.lang.String.format(message, values));
		}
		return collection;
	}

	public static <T extends java.util.Collection<?>> T validIndex(T collection, int index) {
		return org.apache.commons.lang3.Validate.validIndex(collection, index, org.apache.commons.lang3.Validate.DEFAULT_VALID_INDEX_COLLECTION_EX_MESSAGE, java.lang.Integer.valueOf(index));
	}

	public static <T extends java.lang.CharSequence> T validIndex(T chars, int index, java.lang.String message, java.lang.Object... values) {
		org.apache.commons.lang3.Validate.notNull(chars);
		if ((index < 0) || (index >= (chars.length()))) {
			throw new java.lang.IndexOutOfBoundsException(java.lang.String.format(message, values));
		}
		return chars;
	}

	public static <T extends java.lang.CharSequence> T validIndex(T chars, int index) {
		return org.apache.commons.lang3.Validate.validIndex(chars, index, org.apache.commons.lang3.Validate.DEFAULT_VALID_INDEX_CHAR_SEQUENCE_EX_MESSAGE, java.lang.Integer.valueOf(index));
	}

	public static void validState(boolean expression) {
		if (expression == false) {
			throw new java.lang.IllegalStateException(org.apache.commons.lang3.Validate.DEFAULT_VALID_STATE_EX_MESSAGE);
		}
	}

	public static void validState(boolean expression, java.lang.String message, java.lang.Object... values) {
		if (expression == false) {
			throw new java.lang.IllegalStateException(java.lang.String.format(message, values));
		}
	}

	public static void matchesPattern(java.lang.CharSequence input, java.lang.String pattern) {
		if ((java.util.regex.Pattern.matches(pattern, input)) == false) {
			throw new java.lang.IllegalArgumentException(java.lang.String.format(org.apache.commons.lang3.Validate.DEFAULT_MATCHES_PATTERN_EX, input, pattern));
		}
	}

	public static void matchesPattern(java.lang.CharSequence input, java.lang.String pattern, java.lang.String message, java.lang.Object... values) {
		if ((java.util.regex.Pattern.matches(pattern, input)) == false) {
			throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values));
		}
	}

	public static <T> void inclusiveBetween(T start, T end, java.lang.Comparable<T> value) {
		if (((value.compareTo(start)) < 0) || ((value.compareTo(end)) > 0)) {
			throw new java.lang.IllegalArgumentException(java.lang.String.format(org.apache.commons.lang3.Validate.DEFAULT_INCLUSIVE_BETWEEN_EX_MESSAGE, value, start, end));
		}
	}

	public static <T> void inclusiveBetween(T start, T end, java.lang.Comparable<T> value, java.lang.String message, java.lang.Object... values) {
		if (((value.compareTo(start)) < 0) || ((value.compareTo(end)) > 0)) {
			throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values));
		}
	}

	public static <T> void exclusiveBetween(T start, T end, java.lang.Comparable<T> value) {
		if (((value.compareTo(start)) <= 0) || ((value.compareTo(end)) >= 0)) {
			throw new java.lang.IllegalArgumentException(java.lang.String.format(org.apache.commons.lang3.Validate.DEFAULT_EXCLUSIVE_BETWEEN_EX_MESSAGE, value, start, end));
		}
	}

	public static <T> void exclusiveBetween(T start, T end, java.lang.Comparable<T> value, java.lang.String message, java.lang.Object... values) {
		if (((value.compareTo(start)) <= 0) || ((value.compareTo(end)) >= 0)) {
			throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values));
		}
	}

	public static void isInstanceOf(java.lang.Class<?> type, java.lang.Object o) {
		if ((type.isInstance(o)) == false) {
			throw new java.lang.IllegalArgumentException(java.lang.String.format(org.apache.commons.lang3.Validate.DEFAULT_IS_INSTANCE_OF_EX_MESSAGE, type.getName()));
		}
	}

	public static void isInstanceOf(java.lang.Class<?> type, java.lang.Object o, java.lang.String message, java.lang.Object... values) {
		if ((type.isInstance(o)) == false) {
			throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values));
		}
	}

	public static void isAssignableFrom(java.lang.Class<?> superType, java.lang.Class<?> type) {
		if ((superType.isAssignableFrom(type)) == false) {
			throw new java.lang.IllegalArgumentException(java.lang.String.format(org.apache.commons.lang3.Validate.DEFAULT_IS_ASSIGNABLE_EX_MESSAGE, superType.getName()));
		}
	}

	public static void isAssignableFrom(java.lang.Class<?> superType, java.lang.Class<?> type, java.lang.String message, java.lang.Object... values) {
		if ((superType.isAssignableFrom(type)) == false) {
			throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values));
		}
	}
}


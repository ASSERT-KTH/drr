

package org.apache.commons.lang;


public class Validate {
	public Validate() {
		super();
	}

	public static void isTrue(boolean expression, java.lang.String message, java.lang.Object value) {
		if (expression == false) {
			throw new java.lang.IllegalArgumentException((message + value));
		}
	}

	public static void isTrue(boolean expression, java.lang.String message, long value) {
		if (expression == false) {
			throw new java.lang.IllegalArgumentException((message + value));
		}
	}

	public static void isTrue(boolean expression, java.lang.String message, double value) {
		if (expression == false) {
			throw new java.lang.IllegalArgumentException((message + value));
		}
	}

	public static void isTrue(boolean expression, java.lang.String message) {
		if (expression == false) {
			throw new java.lang.IllegalArgumentException(message);
		}
	}

	public static void isTrue(boolean expression) {
		if (expression == false) {
			throw new java.lang.IllegalArgumentException("The validated expression is false");
		}
	}

	public static void notNull(java.lang.Object object, java.lang.String message) {
		if (object == null) {
			throw new java.lang.IllegalArgumentException(message);
		}
	}

	public static void notNull(java.lang.Object object) {
		if (object == null) {
			throw new java.lang.IllegalArgumentException("The validated object is null");
		}
	}

	public static void notEmpty(java.lang.Object[] array, java.lang.String message) {
		if ((array == null) || ((array.length) == 0)) {
			throw new java.lang.IllegalArgumentException(message);
		}
	}

	public static void notEmpty(java.lang.Object[] array) {
		if ((array == null) || ((array.length) == 0)) {
			throw new java.lang.IllegalArgumentException("The validated array is empty");
		}
	}

	public static void notEmpty(java.util.Collection collection, java.lang.String message) {
		if ((collection == null) || ((collection.size()) == 0)) {
			throw new java.lang.IllegalArgumentException(message);
		}
	}

	public static void notEmpty(java.util.Collection collection) {
		if ((collection == null) || ((collection.size()) == 0)) {
			throw new java.lang.IllegalArgumentException("The validated collection is empty");
		}
	}

	public static void notEmpty(java.util.Map map, java.lang.String message) {
		if ((map == null) || ((map.size()) == 0)) {
			throw new java.lang.IllegalArgumentException(message);
		}
	}

	public static void notEmpty(java.util.Map map) {
		if ((map == null) || ((map.size()) == 0)) {
			throw new java.lang.IllegalArgumentException("The validated map is empty");
		}
	}

	public static void notEmpty(java.lang.String string, java.lang.String message) {
		if ((string == null) || ((string.length()) == 0)) {
			throw new java.lang.IllegalArgumentException(message);
		}
	}

	public static void notEmpty(java.lang.String string) {
		if ((string == null) || ((string.length()) == 0)) {
			throw new java.lang.IllegalArgumentException("The validated string is empty");
		}
	}

	public static void noNullElements(java.lang.Object[] array, java.lang.String message) {
		org.apache.commons.lang.Validate.notNull(array);
		for (int i = 0; i < (array.length); i++) {
			if ((array[i]) == null) {
				throw new java.lang.IllegalArgumentException(message);
			}
		}
	}

	public static void noNullElements(java.lang.Object[] array) {
		org.apache.commons.lang.Validate.notNull(array);
		for (int i = 0; i < (array.length); i++) {
			if ((array[i]) == null) {
				throw new java.lang.IllegalArgumentException(("The validated array contains null element at index: " + i));
			}
		}
	}

	public static void noNullElements(java.util.Collection collection, java.lang.String message) {
		org.apache.commons.lang.Validate.notNull(collection);
		for (java.util.Iterator it = collection.iterator(); it.hasNext();) {
			if ((it.next()) == null) {
				throw new java.lang.IllegalArgumentException(message);
			}
		}
	}

	public static void noNullElements(java.util.Collection collection) {
		org.apache.commons.lang.Validate.notNull(collection);
		int i = 0;
		for (java.util.Iterator it = collection.iterator(); it.hasNext(); i++) {
			if ((it.next()) == null) {
				throw new java.lang.IllegalArgumentException(("The validated collection contains null element at index: " + i));
			}
		}
	}

	public static void allElementsOfType(java.util.Collection collection, java.lang.Class clazz, java.lang.String message) {
		org.apache.commons.lang.Validate.notNull(collection);
		org.apache.commons.lang.Validate.notNull(clazz);
		for (java.util.Iterator it = collection.iterator(); it.hasNext();) {
			if ((clazz.isInstance(it.next())) == false) {
				throw new java.lang.IllegalArgumentException(message);
			}
		}
	}

	public static void allElementsOfType(java.util.Collection collection, java.lang.Class clazz) {
		org.apache.commons.lang.Validate.notNull(collection);
		org.apache.commons.lang.Validate.notNull(clazz);
		int i = 0;
		for (java.util.Iterator it = collection.iterator(); it.hasNext(); i++) {
			if ((clazz.isInstance(it.next())) == false) {
				throw new java.lang.IllegalArgumentException(((("The validated collection contains an element not of type " + (clazz.getName())) + " at index: ") + i));
			}
		}
	}
}


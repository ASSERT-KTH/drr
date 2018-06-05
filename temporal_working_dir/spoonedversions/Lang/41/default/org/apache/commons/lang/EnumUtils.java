

package org.apache.commons.lang;


public class EnumUtils {
	public EnumUtils() {
	}

	public static <E extends java.lang.Enum<E>> java.util.Map<java.lang.String, java.lang.Enum<E>> getEnumMap(java.lang.Class<E> enumClass) {
		java.util.Map<java.lang.String, java.lang.Enum<E>> map = new java.util.LinkedHashMap<java.lang.String, java.lang.Enum<E>>();
		for (E e : java.util.EnumSet.allOf(enumClass)) {
			map.put(e.name(), e);
		}
		return map;
	}
}


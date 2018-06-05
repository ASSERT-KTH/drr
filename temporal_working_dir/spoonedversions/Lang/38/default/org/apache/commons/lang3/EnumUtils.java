

package org.apache.commons.lang3;


public class EnumUtils {
	public EnumUtils() {
	}

	public static <E extends java.lang.Enum<E>> java.util.Map<java.lang.String, E> getEnumMap(java.lang.Class<E> enumClass) {
		java.util.Map<java.lang.String, E> map = new java.util.LinkedHashMap<java.lang.String, E>();
		for (E e : enumClass.getEnumConstants()) {
			map.put(e.name(), e);
		}
		return map;
	}

	public static <E extends java.lang.Enum<E>> java.util.List<E> getEnumList(java.lang.Class<E> enumClass) {
		return new java.util.ArrayList<E>(java.util.Arrays.asList(enumClass.getEnumConstants()));
	}

	public static <E extends java.lang.Enum<E>> boolean isValidEnum(java.lang.Class<E> enumClass, java.lang.String enumName) {
		try {
			java.lang.Enum.valueOf(enumClass, enumName);
			return true;
		} catch (java.lang.IllegalArgumentException ex) {
			return false;
		}
	}

	public static <E extends java.lang.Enum<E>> E getEnum(java.lang.Class<E> enumClass, java.lang.String enumName) {
		try {
			return java.lang.Enum.valueOf(enumClass, enumName);
		} catch (java.lang.IllegalArgumentException ex) {
			return null;
		}
	}
}


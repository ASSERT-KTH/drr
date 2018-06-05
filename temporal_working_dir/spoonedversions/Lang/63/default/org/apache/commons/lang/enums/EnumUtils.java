

package org.apache.commons.lang.enums;


public class EnumUtils {
	public EnumUtils() {
		super();
	}

	public static org.apache.commons.lang.enums.Enum getEnum(java.lang.Class enumClass, java.lang.String name) {
		return org.apache.commons.lang.enums.Enum.getEnum(enumClass, name);
	}

	public static org.apache.commons.lang.enums.ValuedEnum getEnum(java.lang.Class enumClass, int value) {
		return ((org.apache.commons.lang.enums.ValuedEnum) (org.apache.commons.lang.enums.ValuedEnum.getEnum(enumClass, value)));
	}

	public static java.util.Map getEnumMap(java.lang.Class enumClass) {
		return org.apache.commons.lang.enums.Enum.getEnumMap(enumClass);
	}

	public static java.util.List getEnumList(java.lang.Class enumClass) {
		return org.apache.commons.lang.enums.Enum.getEnumList(enumClass);
	}

	public static java.util.Iterator iterator(java.lang.Class enumClass) {
		return org.apache.commons.lang.enums.Enum.getEnumList(enumClass).iterator();
	}
}


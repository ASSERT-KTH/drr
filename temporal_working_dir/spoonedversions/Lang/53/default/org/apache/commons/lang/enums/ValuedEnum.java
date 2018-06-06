

package org.apache.commons.lang.enums;


public abstract class ValuedEnum extends org.apache.commons.lang.enums.Enum {
	private static final long serialVersionUID = -7129650521543789085L;

	private final int iValue;

	protected ValuedEnum(java.lang.String name, int value) {
		super(name);
		iValue = value;
	}

	protected static org.apache.commons.lang.enums.Enum getEnum(java.lang.Class enumClass, int value) {
		if (enumClass == null) {
			throw new java.lang.IllegalArgumentException("The Enum Class must not be null");
		}
		java.util.List list = org.apache.commons.lang.enums.Enum.getEnumList(enumClass);
		for (java.util.Iterator it = list.iterator(); it.hasNext();) {
			org.apache.commons.lang.enums.ValuedEnum enumeration = ((org.apache.commons.lang.enums.ValuedEnum) (it.next()));
			if ((enumeration.getValue()) == value) {
				return enumeration;
			}
		}
		return null;
	}

	public final int getValue() {
		return iValue;
	}

	public int compareTo(java.lang.Object other) {
		if (other == (org.apache.commons.lang.enums.ValuedEnum.this)) {
			return 0;
		}
		if ((other.getClass()) != (org.apache.commons.lang.enums.ValuedEnum.this.getClass())) {
			if (other.getClass().getName().equals(org.apache.commons.lang.enums.ValuedEnum.this.getClass().getName())) {
				return (iValue) - (getValueInOtherClassLoader(other));
			}
			throw new java.lang.ClassCastException((("Different enum class '" + (org.apache.commons.lang.ClassUtils.getShortClassName(other.getClass()))) + "'"));
		}
		return (iValue) - (((org.apache.commons.lang.enums.ValuedEnum) (other)).iValue);
	}

	private int getValueInOtherClassLoader(java.lang.Object other) {
		try {
			java.lang.reflect.Method mth = other.getClass().getMethod("getValue", null);
			java.lang.Integer value = ((java.lang.Integer) (mth.invoke(other, null)));
			return value.intValue();
		} catch (java.lang.NoSuchMethodException e) {
		} catch (java.lang.IllegalAccessException e) {
		} catch (java.lang.reflect.InvocationTargetException e) {
		}
		throw new java.lang.IllegalStateException("This should not happen");
	}

	public java.lang.String toString() {
		if ((iToString) == null) {
			java.lang.String shortName = org.apache.commons.lang.ClassUtils.getShortClassName(getEnumClass());
			iToString = ((((shortName + "[") + (getName())) + "=") + (getValue())) + "]";
		}
		return iToString;
	}
}


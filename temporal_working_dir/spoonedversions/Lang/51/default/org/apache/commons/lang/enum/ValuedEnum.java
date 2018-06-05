

package org.apache.commons.lang.enum;


public abstract class ValuedEnum extends org.apache.commons.lang.enum.Enum {
	private static final long serialVersionUID = -7129650521543789085L;

	private final int iValue;

	protected ValuedEnum(java.lang.String name, int value) {
		super(name);
		iValue = value;
	}

	protected static org.apache.commons.lang.enum.Enum getEnum(java.lang.Class enumClass, int value) {
		if (enumClass == null) {
			throw new java.lang.IllegalArgumentException("The Enum Class must not be null");
		}
		java.util.List list = org.apache.commons.lang.enum.Enum.getEnumList(enumClass);
		for (java.util.Iterator it = list.iterator(); it.hasNext();) {
			org.apache.commons.lang.enum.ValuedEnum enumeration = ((org.apache.commons.lang.enum.ValuedEnum) (it.next()));
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
		return (iValue) - (((org.apache.commons.lang.enum.ValuedEnum) (other)).iValue);
	}

	public java.lang.String toString() {
		if ((iToString) == null) {
			java.lang.String shortName = org.apache.commons.lang.ClassUtils.getShortClassName(getEnumClass());
			iToString = ((((shortName + "[") + (getName())) + "=") + (getValue())) + "]";
		}
		return iToString;
	}
}




package org.apache.commons.lang.builder;


public class CompareToBuilder {
	private int comparison;

	public CompareToBuilder() {
		super();
		comparison = 0;
	}

	public static int reflectionCompare(java.lang.Object lhs, java.lang.Object rhs) {
		return org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(lhs, rhs, false, null, null);
	}

	public static int reflectionCompare(java.lang.Object lhs, java.lang.Object rhs, boolean compareTransients) {
		return org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(lhs, rhs, compareTransients, null, null);
	}

	public static int reflectionCompare(java.lang.Object lhs, java.lang.Object rhs, java.util.Collection excludeFields) {
		return org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(lhs, rhs, org.apache.commons.lang.builder.ReflectionToStringBuilder.toNoNullStringArray(excludeFields));
	}

	public static int reflectionCompare(java.lang.Object lhs, java.lang.Object rhs, java.lang.String[] excludeFields) {
		return org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(lhs, rhs, false, null, excludeFields);
	}

	public static int reflectionCompare(java.lang.Object lhs, java.lang.Object rhs, boolean compareTransients, java.lang.Class reflectUpToClass) {
		return org.apache.commons.lang.builder.CompareToBuilder.reflectionCompare(lhs, rhs, false, reflectUpToClass, null);
	}

	public static int reflectionCompare(java.lang.Object lhs, java.lang.Object rhs, boolean compareTransients, java.lang.Class reflectUpToClass, java.lang.String[] excludeFields) {
		if (lhs == rhs) {
			return 0;
		}
		if ((lhs == null) || (rhs == null)) {
			throw new java.lang.NullPointerException();
		}
		java.lang.Class lhsClazz = lhs.getClass();
		if (!(lhsClazz.isInstance(rhs))) {
			throw new java.lang.ClassCastException();
		}
		org.apache.commons.lang.builder.CompareToBuilder compareToBuilder = new org.apache.commons.lang.builder.CompareToBuilder();
		org.apache.commons.lang.builder.CompareToBuilder.reflectionAppend(lhs, rhs, lhsClazz, compareToBuilder, compareTransients, excludeFields);
		while (((lhsClazz.getSuperclass()) != null) && (lhsClazz != reflectUpToClass)) {
			lhsClazz = lhsClazz.getSuperclass();
			org.apache.commons.lang.builder.CompareToBuilder.reflectionAppend(lhs, rhs, lhsClazz, compareToBuilder, compareTransients, excludeFields);
		} 
		return compareToBuilder.toComparison();
	}

	private static void reflectionAppend(java.lang.Object lhs, java.lang.Object rhs, java.lang.Class clazz, org.apache.commons.lang.builder.CompareToBuilder builder, boolean useTransients, java.lang.String[] excludeFields) {
		java.lang.reflect.Field[] fields = clazz.getDeclaredFields();
		java.util.List excludedFieldList = excludeFields != null ? java.util.Arrays.asList(excludeFields) : java.util.Collections.EMPTY_LIST;
		java.lang.reflect.AccessibleObject.setAccessible(fields, true);
		for (int i = 0; (i < (fields.length)) && ((builder.comparison) == 0); i++) {
			java.lang.reflect.Field f = fields[i];
			if ((((!(excludedFieldList.contains(f.getName()))) && ((f.getName().indexOf('$')) == (-1))) && (useTransients || (!(java.lang.reflect.Modifier.isTransient(f.getModifiers()))))) && (!(java.lang.reflect.Modifier.isStatic(f.getModifiers())))) {
				try {
					builder.append(f.get(lhs), f.get(rhs));
				} catch (java.lang.IllegalAccessException e) {
					throw new java.lang.InternalError("Unexpected IllegalAccessException");
				}
			}
		}
	}

	public org.apache.commons.lang.builder.CompareToBuilder appendSuper(int superCompareTo) {
		if ((comparison) != 0) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		comparison = superCompareTo;
		return org.apache.commons.lang.builder.CompareToBuilder.this;
	}

	public org.apache.commons.lang.builder.CompareToBuilder append(java.lang.Object lhs, java.lang.Object rhs) {
		return append(lhs, rhs, null);
	}

	public org.apache.commons.lang.builder.CompareToBuilder append(java.lang.Object lhs, java.lang.Object rhs, java.util.Comparator comparator) {
		if ((comparison) != 0) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (lhs == rhs) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (lhs == null) {
			comparison = -1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (rhs == null) {
			comparison = +1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (lhs.getClass().isArray()) {
			if (lhs instanceof long[]) {
				append(((long[]) (lhs)), ((long[]) (rhs)));
			}else
				if (lhs instanceof int[]) {
					append(((int[]) (lhs)), ((int[]) (rhs)));
				}else
					if (lhs instanceof short[]) {
						append(((short[]) (lhs)), ((short[]) (rhs)));
					}else
						if (lhs instanceof char[]) {
							append(((char[]) (lhs)), ((char[]) (rhs)));
						}else
							if (lhs instanceof byte[]) {
								append(((byte[]) (lhs)), ((byte[]) (rhs)));
							}else
								if (lhs instanceof double[]) {
									append(((double[]) (lhs)), ((double[]) (rhs)));
								}else
									if (lhs instanceof float[]) {
										append(((float[]) (lhs)), ((float[]) (rhs)));
									}else
										if (lhs instanceof boolean[]) {
											append(((boolean[]) (lhs)), ((boolean[]) (rhs)));
										}else {
											append(((java.lang.Object[]) (lhs)), ((java.lang.Object[]) (rhs)), comparator);
										}
									
								
							
						
					
				
			
		}else {
			if (comparator == null) {
				comparison = ((java.lang.Comparable) (lhs)).compareTo(rhs);
			}else {
				comparison = comparator.compare(lhs, rhs);
			}
		}
		return org.apache.commons.lang.builder.CompareToBuilder.this;
	}

	public org.apache.commons.lang.builder.CompareToBuilder append(long lhs, long rhs) {
		if ((comparison) != 0) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		comparison = (lhs < rhs) ? -1 : lhs > rhs ? 1 : 0;
		return org.apache.commons.lang.builder.CompareToBuilder.this;
	}

	public org.apache.commons.lang.builder.CompareToBuilder append(int lhs, int rhs) {
		if ((comparison) != 0) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		comparison = (lhs < rhs) ? -1 : lhs > rhs ? 1 : 0;
		return org.apache.commons.lang.builder.CompareToBuilder.this;
	}

	public org.apache.commons.lang.builder.CompareToBuilder append(short lhs, short rhs) {
		if ((comparison) != 0) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		comparison = (lhs < rhs) ? -1 : lhs > rhs ? 1 : 0;
		return org.apache.commons.lang.builder.CompareToBuilder.this;
	}

	public org.apache.commons.lang.builder.CompareToBuilder append(char lhs, char rhs) {
		if ((comparison) != 0) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		comparison = (lhs < rhs) ? -1 : lhs > rhs ? 1 : 0;
		return org.apache.commons.lang.builder.CompareToBuilder.this;
	}

	public org.apache.commons.lang.builder.CompareToBuilder append(byte lhs, byte rhs) {
		if ((comparison) != 0) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		comparison = (lhs < rhs) ? -1 : lhs > rhs ? 1 : 0;
		return org.apache.commons.lang.builder.CompareToBuilder.this;
	}

	public org.apache.commons.lang.builder.CompareToBuilder append(double lhs, double rhs) {
		if ((comparison) != 0) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		comparison = org.apache.commons.lang.math.NumberUtils.compare(lhs, rhs);
		return org.apache.commons.lang.builder.CompareToBuilder.this;
	}

	public org.apache.commons.lang.builder.CompareToBuilder append(float lhs, float rhs) {
		if ((comparison) != 0) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		comparison = org.apache.commons.lang.math.NumberUtils.compare(lhs, rhs);
		return org.apache.commons.lang.builder.CompareToBuilder.this;
	}

	public org.apache.commons.lang.builder.CompareToBuilder append(boolean lhs, boolean rhs) {
		if ((comparison) != 0) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (lhs == rhs) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (lhs == false) {
			comparison = -1;
		}else {
			comparison = +1;
		}
		return org.apache.commons.lang.builder.CompareToBuilder.this;
	}

	public org.apache.commons.lang.builder.CompareToBuilder append(java.lang.Object[] lhs, java.lang.Object[] rhs) {
		return append(lhs, rhs, null);
	}

	public org.apache.commons.lang.builder.CompareToBuilder append(java.lang.Object[] lhs, java.lang.Object[] rhs, java.util.Comparator comparator) {
		if ((comparison) != 0) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (lhs == rhs) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (lhs == null) {
			comparison = -1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (rhs == null) {
			comparison = +1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if ((lhs.length) != (rhs.length)) {
			comparison = ((lhs.length) < (rhs.length)) ? -1 : +1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		for (int i = 0; (i < (lhs.length)) && ((comparison) == 0); i++) {
			append(lhs[i], rhs[i], comparator);
		}
		return org.apache.commons.lang.builder.CompareToBuilder.this;
	}

	public org.apache.commons.lang.builder.CompareToBuilder append(long[] lhs, long[] rhs) {
		if ((comparison) != 0) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (lhs == rhs) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (lhs == null) {
			comparison = -1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (rhs == null) {
			comparison = +1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if ((lhs.length) != (rhs.length)) {
			comparison = ((lhs.length) < (rhs.length)) ? -1 : +1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		for (int i = 0; (i < (lhs.length)) && ((comparison) == 0); i++) {
			append(lhs[i], rhs[i]);
		}
		return org.apache.commons.lang.builder.CompareToBuilder.this;
	}

	public org.apache.commons.lang.builder.CompareToBuilder append(int[] lhs, int[] rhs) {
		if ((comparison) != 0) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (lhs == rhs) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (lhs == null) {
			comparison = -1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (rhs == null) {
			comparison = +1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if ((lhs.length) != (rhs.length)) {
			comparison = ((lhs.length) < (rhs.length)) ? -1 : +1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		for (int i = 0; (i < (lhs.length)) && ((comparison) == 0); i++) {
			append(lhs[i], rhs[i]);
		}
		return org.apache.commons.lang.builder.CompareToBuilder.this;
	}

	public org.apache.commons.lang.builder.CompareToBuilder append(short[] lhs, short[] rhs) {
		if ((comparison) != 0) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (lhs == rhs) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (lhs == null) {
			comparison = -1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (rhs == null) {
			comparison = +1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if ((lhs.length) != (rhs.length)) {
			comparison = ((lhs.length) < (rhs.length)) ? -1 : +1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		for (int i = 0; (i < (lhs.length)) && ((comparison) == 0); i++) {
			append(lhs[i], rhs[i]);
		}
		return org.apache.commons.lang.builder.CompareToBuilder.this;
	}

	public org.apache.commons.lang.builder.CompareToBuilder append(char[] lhs, char[] rhs) {
		if ((comparison) != 0) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (lhs == rhs) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (lhs == null) {
			comparison = -1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (rhs == null) {
			comparison = +1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if ((lhs.length) != (rhs.length)) {
			comparison = ((lhs.length) < (rhs.length)) ? -1 : +1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		for (int i = 0; (i < (lhs.length)) && ((comparison) == 0); i++) {
			append(lhs[i], rhs[i]);
		}
		return org.apache.commons.lang.builder.CompareToBuilder.this;
	}

	public org.apache.commons.lang.builder.CompareToBuilder append(byte[] lhs, byte[] rhs) {
		if ((comparison) != 0) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (lhs == rhs) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (lhs == null) {
			comparison = -1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (rhs == null) {
			comparison = +1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if ((lhs.length) != (rhs.length)) {
			comparison = ((lhs.length) < (rhs.length)) ? -1 : +1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		for (int i = 0; (i < (lhs.length)) && ((comparison) == 0); i++) {
			append(lhs[i], rhs[i]);
		}
		return org.apache.commons.lang.builder.CompareToBuilder.this;
	}

	public org.apache.commons.lang.builder.CompareToBuilder append(double[] lhs, double[] rhs) {
		if ((comparison) != 0) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (lhs == rhs) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (lhs == null) {
			comparison = -1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (rhs == null) {
			comparison = +1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if ((lhs.length) != (rhs.length)) {
			comparison = ((lhs.length) < (rhs.length)) ? -1 : +1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		for (int i = 0; (i < (lhs.length)) && ((comparison) == 0); i++) {
			append(lhs[i], rhs[i]);
		}
		return org.apache.commons.lang.builder.CompareToBuilder.this;
	}

	public org.apache.commons.lang.builder.CompareToBuilder append(float[] lhs, float[] rhs) {
		if ((comparison) != 0) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (lhs == rhs) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (lhs == null) {
			comparison = -1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (rhs == null) {
			comparison = +1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if ((lhs.length) != (rhs.length)) {
			comparison = ((lhs.length) < (rhs.length)) ? -1 : +1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		for (int i = 0; (i < (lhs.length)) && ((comparison) == 0); i++) {
			append(lhs[i], rhs[i]);
		}
		return org.apache.commons.lang.builder.CompareToBuilder.this;
	}

	public org.apache.commons.lang.builder.CompareToBuilder append(boolean[] lhs, boolean[] rhs) {
		if ((comparison) != 0) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (lhs == rhs) {
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (lhs == null) {
			comparison = -1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if (rhs == null) {
			comparison = +1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		if ((lhs.length) != (rhs.length)) {
			comparison = ((lhs.length) < (rhs.length)) ? -1 : +1;
			return org.apache.commons.lang.builder.CompareToBuilder.this;
		}
		for (int i = 0; (i < (lhs.length)) && ((comparison) == 0); i++) {
			append(lhs[i], rhs[i]);
		}
		return org.apache.commons.lang.builder.CompareToBuilder.this;
	}

	public int toComparison() {
		return comparison;
	}
}


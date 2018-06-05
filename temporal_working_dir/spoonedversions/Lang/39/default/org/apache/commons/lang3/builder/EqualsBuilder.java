

package org.apache.commons.lang3.builder;


public class EqualsBuilder {
	private boolean isEquals = true;

	public EqualsBuilder() {
	}

	public static boolean reflectionEquals(java.lang.Object lhs, java.lang.Object rhs) {
		return org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(lhs, rhs, false, null, null);
	}

	public static boolean reflectionEquals(java.lang.Object lhs, java.lang.Object rhs, java.util.Collection<java.lang.String> excludeFields) {
		return org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(lhs, rhs, org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(excludeFields));
	}

	public static boolean reflectionEquals(java.lang.Object lhs, java.lang.Object rhs, java.lang.String[] excludeFields) {
		return org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(lhs, rhs, false, null, excludeFields);
	}

	public static boolean reflectionEquals(java.lang.Object lhs, java.lang.Object rhs, boolean testTransients) {
		return org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(lhs, rhs, testTransients, null, null);
	}

	public static boolean reflectionEquals(java.lang.Object lhs, java.lang.Object rhs, boolean testTransients, java.lang.Class<?> reflectUpToClass) {
		return org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(lhs, rhs, testTransients, reflectUpToClass, null);
	}

	public static boolean reflectionEquals(java.lang.Object lhs, java.lang.Object rhs, boolean testTransients, java.lang.Class<?> reflectUpToClass, java.lang.String[] excludeFields) {
		if (lhs == rhs) {
			return true;
		}
		if ((lhs == null) || (rhs == null)) {
			return false;
		}
		java.lang.Class<?> lhsClass = lhs.getClass();
		java.lang.Class<?> rhsClass = rhs.getClass();
		java.lang.Class<?> testClass;
		if (lhsClass.isInstance(rhs)) {
			testClass = lhsClass;
			if (!(rhsClass.isInstance(lhs))) {
				testClass = rhsClass;
			}
		}else
			if (rhsClass.isInstance(lhs)) {
				testClass = rhsClass;
				if (!(lhsClass.isInstance(rhs))) {
					testClass = lhsClass;
				}
			}else {
				return false;
			}
		
		org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder = new org.apache.commons.lang3.builder.EqualsBuilder();
		try {
			org.apache.commons.lang3.builder.EqualsBuilder.reflectionAppend(lhs, rhs, testClass, equalsBuilder, testTransients, excludeFields);
			while (((testClass.getSuperclass()) != null) && (testClass != reflectUpToClass)) {
				testClass = testClass.getSuperclass();
				org.apache.commons.lang3.builder.EqualsBuilder.reflectionAppend(lhs, rhs, testClass, equalsBuilder, testTransients, excludeFields);
			} 
		} catch (java.lang.IllegalArgumentException e) {
			return false;
		}
		return equalsBuilder.isEquals();
	}

	private static void reflectionAppend(java.lang.Object lhs, java.lang.Object rhs, java.lang.Class<?> clazz, org.apache.commons.lang3.builder.EqualsBuilder builder, boolean useTransients, java.lang.String[] excludeFields) {
		java.lang.reflect.Field[] fields = clazz.getDeclaredFields();
		java.util.List<java.lang.String> excludedFieldList = excludeFields != null ? java.util.Arrays.asList(excludeFields) : java.util.Collections.<java.lang.String>emptyList();
		java.lang.reflect.AccessibleObject.setAccessible(fields, true);
		for (int i = 0; (i < (fields.length)) && (builder.isEquals); i++) {
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

	public org.apache.commons.lang3.builder.EqualsBuilder appendSuper(boolean superEquals) {
		if ((isEquals) == false) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		isEquals = superEquals;
		return org.apache.commons.lang3.builder.EqualsBuilder.this;
	}

	public org.apache.commons.lang3.builder.EqualsBuilder append(java.lang.Object lhs, java.lang.Object rhs) {
		if ((isEquals) == false) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if (lhs == rhs) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if ((lhs == null) || (rhs == null)) {
			org.apache.commons.lang3.builder.EqualsBuilder.this.setEquals(false);
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		java.lang.Class<?> lhsClass = lhs.getClass();
		if (!(lhsClass.isArray())) {
			isEquals = lhs.equals(rhs);
		}else
			if ((lhs.getClass()) != (rhs.getClass())) {
				org.apache.commons.lang3.builder.EqualsBuilder.this.setEquals(false);
			}else
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
												append(((java.lang.Object[]) (lhs)), ((java.lang.Object[]) (rhs)));
											}
										
									
								
							
						
					
				
			
		
		return org.apache.commons.lang3.builder.EqualsBuilder.this;
	}

	public org.apache.commons.lang3.builder.EqualsBuilder append(long lhs, long rhs) {
		if ((isEquals) == false) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		isEquals = lhs == rhs;
		return org.apache.commons.lang3.builder.EqualsBuilder.this;
	}

	public org.apache.commons.lang3.builder.EqualsBuilder append(int lhs, int rhs) {
		if ((isEquals) == false) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		isEquals = lhs == rhs;
		return org.apache.commons.lang3.builder.EqualsBuilder.this;
	}

	public org.apache.commons.lang3.builder.EqualsBuilder append(short lhs, short rhs) {
		if ((isEquals) == false) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		isEquals = lhs == rhs;
		return org.apache.commons.lang3.builder.EqualsBuilder.this;
	}

	public org.apache.commons.lang3.builder.EqualsBuilder append(char lhs, char rhs) {
		if ((isEquals) == false) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		isEquals = lhs == rhs;
		return org.apache.commons.lang3.builder.EqualsBuilder.this;
	}

	public org.apache.commons.lang3.builder.EqualsBuilder append(byte lhs, byte rhs) {
		if ((isEquals) == false) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		isEquals = lhs == rhs;
		return org.apache.commons.lang3.builder.EqualsBuilder.this;
	}

	public org.apache.commons.lang3.builder.EqualsBuilder append(double lhs, double rhs) {
		if ((isEquals) == false) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		return append(java.lang.Double.doubleToLongBits(lhs), java.lang.Double.doubleToLongBits(rhs));
	}

	public org.apache.commons.lang3.builder.EqualsBuilder append(float lhs, float rhs) {
		if ((isEquals) == false) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		return append(java.lang.Float.floatToIntBits(lhs), java.lang.Float.floatToIntBits(rhs));
	}

	public org.apache.commons.lang3.builder.EqualsBuilder append(boolean lhs, boolean rhs) {
		if ((isEquals) == false) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		isEquals = lhs == rhs;
		return org.apache.commons.lang3.builder.EqualsBuilder.this;
	}

	public org.apache.commons.lang3.builder.EqualsBuilder append(java.lang.Object[] lhs, java.lang.Object[] rhs) {
		if ((isEquals) == false) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if (lhs == rhs) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if ((lhs == null) || (rhs == null)) {
			org.apache.commons.lang3.builder.EqualsBuilder.this.setEquals(false);
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if ((lhs.length) != (rhs.length)) {
			org.apache.commons.lang3.builder.EqualsBuilder.this.setEquals(false);
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		for (int i = 0; (i < (lhs.length)) && (isEquals); ++i) {
			append(lhs[i], rhs[i]);
		}
		return org.apache.commons.lang3.builder.EqualsBuilder.this;
	}

	public org.apache.commons.lang3.builder.EqualsBuilder append(long[] lhs, long[] rhs) {
		if ((isEquals) == false) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if (lhs == rhs) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if ((lhs == null) || (rhs == null)) {
			org.apache.commons.lang3.builder.EqualsBuilder.this.setEquals(false);
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if ((lhs.length) != (rhs.length)) {
			org.apache.commons.lang3.builder.EqualsBuilder.this.setEquals(false);
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		for (int i = 0; (i < (lhs.length)) && (isEquals); ++i) {
			append(lhs[i], rhs[i]);
		}
		return org.apache.commons.lang3.builder.EqualsBuilder.this;
	}

	public org.apache.commons.lang3.builder.EqualsBuilder append(int[] lhs, int[] rhs) {
		if ((isEquals) == false) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if (lhs == rhs) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if ((lhs == null) || (rhs == null)) {
			org.apache.commons.lang3.builder.EqualsBuilder.this.setEquals(false);
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if ((lhs.length) != (rhs.length)) {
			org.apache.commons.lang3.builder.EqualsBuilder.this.setEquals(false);
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		for (int i = 0; (i < (lhs.length)) && (isEquals); ++i) {
			append(lhs[i], rhs[i]);
		}
		return org.apache.commons.lang3.builder.EqualsBuilder.this;
	}

	public org.apache.commons.lang3.builder.EqualsBuilder append(short[] lhs, short[] rhs) {
		if ((isEquals) == false) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if (lhs == rhs) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if ((lhs == null) || (rhs == null)) {
			org.apache.commons.lang3.builder.EqualsBuilder.this.setEquals(false);
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if ((lhs.length) != (rhs.length)) {
			org.apache.commons.lang3.builder.EqualsBuilder.this.setEquals(false);
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		for (int i = 0; (i < (lhs.length)) && (isEquals); ++i) {
			append(lhs[i], rhs[i]);
		}
		return org.apache.commons.lang3.builder.EqualsBuilder.this;
	}

	public org.apache.commons.lang3.builder.EqualsBuilder append(char[] lhs, char[] rhs) {
		if ((isEquals) == false) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if (lhs == rhs) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if ((lhs == null) || (rhs == null)) {
			org.apache.commons.lang3.builder.EqualsBuilder.this.setEquals(false);
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if ((lhs.length) != (rhs.length)) {
			org.apache.commons.lang3.builder.EqualsBuilder.this.setEquals(false);
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		for (int i = 0; (i < (lhs.length)) && (isEquals); ++i) {
			append(lhs[i], rhs[i]);
		}
		return org.apache.commons.lang3.builder.EqualsBuilder.this;
	}

	public org.apache.commons.lang3.builder.EqualsBuilder append(byte[] lhs, byte[] rhs) {
		if ((isEquals) == false) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if (lhs == rhs) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if ((lhs == null) || (rhs == null)) {
			org.apache.commons.lang3.builder.EqualsBuilder.this.setEquals(false);
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if ((lhs.length) != (rhs.length)) {
			org.apache.commons.lang3.builder.EqualsBuilder.this.setEquals(false);
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		for (int i = 0; (i < (lhs.length)) && (isEquals); ++i) {
			append(lhs[i], rhs[i]);
		}
		return org.apache.commons.lang3.builder.EqualsBuilder.this;
	}

	public org.apache.commons.lang3.builder.EqualsBuilder append(double[] lhs, double[] rhs) {
		if ((isEquals) == false) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if (lhs == rhs) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if ((lhs == null) || (rhs == null)) {
			org.apache.commons.lang3.builder.EqualsBuilder.this.setEquals(false);
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if ((lhs.length) != (rhs.length)) {
			org.apache.commons.lang3.builder.EqualsBuilder.this.setEquals(false);
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		for (int i = 0; (i < (lhs.length)) && (isEquals); ++i) {
			append(lhs[i], rhs[i]);
		}
		return org.apache.commons.lang3.builder.EqualsBuilder.this;
	}

	public org.apache.commons.lang3.builder.EqualsBuilder append(float[] lhs, float[] rhs) {
		if ((isEquals) == false) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if (lhs == rhs) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if ((lhs == null) || (rhs == null)) {
			org.apache.commons.lang3.builder.EqualsBuilder.this.setEquals(false);
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if ((lhs.length) != (rhs.length)) {
			org.apache.commons.lang3.builder.EqualsBuilder.this.setEquals(false);
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		for (int i = 0; (i < (lhs.length)) && (isEquals); ++i) {
			append(lhs[i], rhs[i]);
		}
		return org.apache.commons.lang3.builder.EqualsBuilder.this;
	}

	public org.apache.commons.lang3.builder.EqualsBuilder append(boolean[] lhs, boolean[] rhs) {
		if ((isEquals) == false) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if (lhs == rhs) {
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if ((lhs == null) || (rhs == null)) {
			org.apache.commons.lang3.builder.EqualsBuilder.this.setEquals(false);
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		if ((lhs.length) != (rhs.length)) {
			org.apache.commons.lang3.builder.EqualsBuilder.this.setEquals(false);
			return org.apache.commons.lang3.builder.EqualsBuilder.this;
		}
		for (int i = 0; (i < (lhs.length)) && (isEquals); ++i) {
			append(lhs[i], rhs[i]);
		}
		return org.apache.commons.lang3.builder.EqualsBuilder.this;
	}

	public boolean isEquals() {
		return org.apache.commons.lang3.builder.EqualsBuilder.this.isEquals;
	}

	protected void setEquals(boolean isEquals) {
		org.apache.commons.lang3.builder.EqualsBuilder.this.isEquals = isEquals;
	}

	public void reset() {
		org.apache.commons.lang3.builder.EqualsBuilder.this.isEquals = true;
	}
}


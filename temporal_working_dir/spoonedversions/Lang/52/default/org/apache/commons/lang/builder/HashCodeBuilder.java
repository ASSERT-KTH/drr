

package org.apache.commons.lang.builder;


public class HashCodeBuilder {
	private static java.lang.ThreadLocal registry = new java.lang.ThreadLocal() {
		protected java.lang.Object initialValue() {
			return new java.util.HashSet();
		}
	};

	static java.util.Set getRegistry() {
		return ((java.util.Set) (org.apache.commons.lang.builder.HashCodeBuilder.registry.get()));
	}

	static boolean isRegistered(java.lang.Object value) {
		return org.apache.commons.lang.builder.HashCodeBuilder.getRegistry().contains(org.apache.commons.lang.builder.HashCodeBuilder.toIdentityHashCodeInteger(value));
	}

	private static void reflectionAppend(java.lang.Object object, java.lang.Class clazz, org.apache.commons.lang.builder.HashCodeBuilder builder, boolean useTransients, java.lang.String[] excludeFields) {
		if (org.apache.commons.lang.builder.HashCodeBuilder.isRegistered(object)) {
			return ;
		}
		try {
			org.apache.commons.lang.builder.HashCodeBuilder.register(object);
			java.lang.reflect.Field[] fields = clazz.getDeclaredFields();
			java.util.List excludedFieldList = excludeFields != null ? java.util.Arrays.asList(excludeFields) : java.util.Collections.EMPTY_LIST;
			java.lang.reflect.AccessibleObject.setAccessible(fields, true);
			for (int i = 0; i < (fields.length); i++) {
				java.lang.reflect.Field field = fields[i];
				if ((((!(excludedFieldList.contains(field.getName()))) && ((field.getName().indexOf('$')) == (-1))) && (useTransients || (!(java.lang.reflect.Modifier.isTransient(field.getModifiers()))))) && (!(java.lang.reflect.Modifier.isStatic(field.getModifiers())))) {
					try {
						java.lang.Object fieldValue = field.get(object);
						builder.append(fieldValue);
					} catch (java.lang.IllegalAccessException e) {
						throw new java.lang.InternalError("Unexpected IllegalAccessException");
					}
				}
			}
		} finally {
			org.apache.commons.lang.builder.HashCodeBuilder.unregister(object);
		}
	}

	public static int reflectionHashCode(int initialNonZeroOddNumber, int multiplierNonZeroOddNumber, java.lang.Object object) {
		return org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(initialNonZeroOddNumber, multiplierNonZeroOddNumber, object, false, null, null);
	}

	public static int reflectionHashCode(int initialNonZeroOddNumber, int multiplierNonZeroOddNumber, java.lang.Object object, boolean testTransients) {
		return org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(initialNonZeroOddNumber, multiplierNonZeroOddNumber, object, testTransients, null, null);
	}

	public static int reflectionHashCode(int initialNonZeroOddNumber, int multiplierNonZeroOddNumber, java.lang.Object object, boolean testTransients, java.lang.Class reflectUpToClass) {
		return org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(initialNonZeroOddNumber, multiplierNonZeroOddNumber, object, testTransients, reflectUpToClass, null);
	}

	public static int reflectionHashCode(int initialNonZeroOddNumber, int multiplierNonZeroOddNumber, java.lang.Object object, boolean testTransients, java.lang.Class reflectUpToClass, java.lang.String[] excludeFields) {
		if (object == null) {
			throw new java.lang.IllegalArgumentException("The object to build a hash code for must not be null");
		}
		org.apache.commons.lang.builder.HashCodeBuilder builder = new org.apache.commons.lang.builder.HashCodeBuilder(initialNonZeroOddNumber, multiplierNonZeroOddNumber);
		java.lang.Class clazz = object.getClass();
		org.apache.commons.lang.builder.HashCodeBuilder.reflectionAppend(object, clazz, builder, testTransients, excludeFields);
		while (((clazz.getSuperclass()) != null) && (clazz != reflectUpToClass)) {
			clazz = clazz.getSuperclass();
			org.apache.commons.lang.builder.HashCodeBuilder.reflectionAppend(object, clazz, builder, testTransients, excludeFields);
		} 
		return builder.toHashCode();
	}

	public static int reflectionHashCode(java.lang.Object object) {
		return org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(17, 37, object, false, null, null);
	}

	public static int reflectionHashCode(java.lang.Object object, boolean testTransients) {
		return org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(17, 37, object, testTransients, null, null);
	}

	public static int reflectionHashCode(java.lang.Object object, java.util.Collection excludeFields) {
		return org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(object, org.apache.commons.lang.builder.ReflectionToStringBuilder.toNoNullStringArray(excludeFields));
	}

	public static int reflectionHashCode(java.lang.Object object, java.lang.String[] excludeFields) {
		return org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(17, 37, object, false, null, excludeFields);
	}

	static void register(java.lang.Object value) {
		org.apache.commons.lang.builder.HashCodeBuilder.getRegistry().add(org.apache.commons.lang.builder.HashCodeBuilder.toIdentityHashCodeInteger(value));
	}

	private static java.lang.Integer toIdentityHashCodeInteger(java.lang.Object value) {
		return new java.lang.Integer(java.lang.System.identityHashCode(value));
	}

	static void unregister(java.lang.Object value) {
		org.apache.commons.lang.builder.HashCodeBuilder.getRegistry().remove(org.apache.commons.lang.builder.HashCodeBuilder.toIdentityHashCodeInteger(value));
	}

	private final int iConstant;

	private int iTotal = 0;

	public HashCodeBuilder() {
		iConstant = 37;
		iTotal = 17;
	}

	public HashCodeBuilder(int initialNonZeroOddNumber, int multiplierNonZeroOddNumber) {
		if (initialNonZeroOddNumber == 0) {
			throw new java.lang.IllegalArgumentException("HashCodeBuilder requires a non zero initial value");
		}
		if ((initialNonZeroOddNumber % 2) == 0) {
			throw new java.lang.IllegalArgumentException("HashCodeBuilder requires an odd initial value");
		}
		if (multiplierNonZeroOddNumber == 0) {
			throw new java.lang.IllegalArgumentException("HashCodeBuilder requires a non zero multiplier");
		}
		if ((multiplierNonZeroOddNumber % 2) == 0) {
			throw new java.lang.IllegalArgumentException("HashCodeBuilder requires an odd multiplier");
		}
		iConstant = multiplierNonZeroOddNumber;
		iTotal = initialNonZeroOddNumber;
	}

	public org.apache.commons.lang.builder.HashCodeBuilder append(boolean value) {
		iTotal = ((iTotal) * (iConstant)) + (value ? 0 : 1);
		return org.apache.commons.lang.builder.HashCodeBuilder.this;
	}

	public org.apache.commons.lang.builder.HashCodeBuilder append(boolean[] array) {
		if (array == null) {
			iTotal = (iTotal) * (iConstant);
		}else {
			for (int i = 0; i < (array.length); i++) {
				append(array[i]);
			}
		}
		return org.apache.commons.lang.builder.HashCodeBuilder.this;
	}

	public org.apache.commons.lang.builder.HashCodeBuilder append(byte value) {
		iTotal = ((iTotal) * (iConstant)) + value;
		return org.apache.commons.lang.builder.HashCodeBuilder.this;
	}

	public org.apache.commons.lang.builder.HashCodeBuilder append(byte[] array) {
		if (array == null) {
			iTotal = (iTotal) * (iConstant);
		}else {
			for (int i = 0; i < (array.length); i++) {
				append(array[i]);
			}
		}
		return org.apache.commons.lang.builder.HashCodeBuilder.this;
	}

	public org.apache.commons.lang.builder.HashCodeBuilder append(char value) {
		iTotal = ((iTotal) * (iConstant)) + value;
		return org.apache.commons.lang.builder.HashCodeBuilder.this;
	}

	public org.apache.commons.lang.builder.HashCodeBuilder append(char[] array) {
		if (array == null) {
			iTotal = (iTotal) * (iConstant);
		}else {
			for (int i = 0; i < (array.length); i++) {
				append(array[i]);
			}
		}
		return org.apache.commons.lang.builder.HashCodeBuilder.this;
	}

	public org.apache.commons.lang.builder.HashCodeBuilder append(double value) {
		return append(java.lang.Double.doubleToLongBits(value));
	}

	public org.apache.commons.lang.builder.HashCodeBuilder append(double[] array) {
		if (array == null) {
			iTotal = (iTotal) * (iConstant);
		}else {
			for (int i = 0; i < (array.length); i++) {
				append(array[i]);
			}
		}
		return org.apache.commons.lang.builder.HashCodeBuilder.this;
	}

	public org.apache.commons.lang.builder.HashCodeBuilder append(float value) {
		iTotal = ((iTotal) * (iConstant)) + (java.lang.Float.floatToIntBits(value));
		return org.apache.commons.lang.builder.HashCodeBuilder.this;
	}

	public org.apache.commons.lang.builder.HashCodeBuilder append(float[] array) {
		if (array == null) {
			iTotal = (iTotal) * (iConstant);
		}else {
			for (int i = 0; i < (array.length); i++) {
				append(array[i]);
			}
		}
		return org.apache.commons.lang.builder.HashCodeBuilder.this;
	}

	public org.apache.commons.lang.builder.HashCodeBuilder append(int value) {
		iTotal = ((iTotal) * (iConstant)) + value;
		return org.apache.commons.lang.builder.HashCodeBuilder.this;
	}

	public org.apache.commons.lang.builder.HashCodeBuilder append(int[] array) {
		if (array == null) {
			iTotal = (iTotal) * (iConstant);
		}else {
			for (int i = 0; i < (array.length); i++) {
				append(array[i]);
			}
		}
		return org.apache.commons.lang.builder.HashCodeBuilder.this;
	}

	public org.apache.commons.lang.builder.HashCodeBuilder append(long value) {
		iTotal = ((iTotal) * (iConstant)) + ((int) (value ^ (value >> 32)));
		return org.apache.commons.lang.builder.HashCodeBuilder.this;
	}

	public org.apache.commons.lang.builder.HashCodeBuilder append(long[] array) {
		if (array == null) {
			iTotal = (iTotal) * (iConstant);
		}else {
			for (int i = 0; i < (array.length); i++) {
				append(array[i]);
			}
		}
		return org.apache.commons.lang.builder.HashCodeBuilder.this;
	}

	public org.apache.commons.lang.builder.HashCodeBuilder append(java.lang.Object object) {
		if (object == null) {
			iTotal = (iTotal) * (iConstant);
		}else {
			if (object instanceof long[]) {
				append(((long[]) (object)));
			}else
				if (object instanceof int[]) {
					append(((int[]) (object)));
				}else
					if (object instanceof short[]) {
						append(((short[]) (object)));
					}else
						if (object instanceof char[]) {
							append(((char[]) (object)));
						}else
							if (object instanceof byte[]) {
								append(((byte[]) (object)));
							}else
								if (object instanceof double[]) {
									append(((double[]) (object)));
								}else
									if (object instanceof float[]) {
										append(((float[]) (object)));
									}else
										if (object instanceof boolean[]) {
											append(((boolean[]) (object)));
										}else
											if (object instanceof java.lang.Object[]) {
												append(((java.lang.Object[]) (object)));
											}else {
												iTotal = ((iTotal) * (iConstant)) + (object.hashCode());
											}
										
									
								
							
						
					
				
			
		}
		return org.apache.commons.lang.builder.HashCodeBuilder.this;
	}

	public org.apache.commons.lang.builder.HashCodeBuilder append(java.lang.Object[] array) {
		if (array == null) {
			iTotal = (iTotal) * (iConstant);
		}else {
			for (int i = 0; i < (array.length); i++) {
				append(array[i]);
			}
		}
		return org.apache.commons.lang.builder.HashCodeBuilder.this;
	}

	public org.apache.commons.lang.builder.HashCodeBuilder append(short value) {
		iTotal = ((iTotal) * (iConstant)) + value;
		return org.apache.commons.lang.builder.HashCodeBuilder.this;
	}

	public org.apache.commons.lang.builder.HashCodeBuilder append(short[] array) {
		if (array == null) {
			iTotal = (iTotal) * (iConstant);
		}else {
			for (int i = 0; i < (array.length); i++) {
				append(array[i]);
			}
		}
		return org.apache.commons.lang.builder.HashCodeBuilder.this;
	}

	public org.apache.commons.lang.builder.HashCodeBuilder appendSuper(int superHashCode) {
		iTotal = ((iTotal) * (iConstant)) + superHashCode;
		return org.apache.commons.lang.builder.HashCodeBuilder.this;
	}

	public int toHashCode() {
		return iTotal;
	}
}


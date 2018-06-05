

package org.apache.commons.lang.builder;


public class ReflectionToStringBuilder<T> extends org.apache.commons.lang.builder.ToStringBuilder<T> {
	public static java.lang.String toString(java.lang.Object object) {
		return org.apache.commons.lang.builder.ReflectionToStringBuilder.toString(object, null, false, false, null);
	}

	public static java.lang.String toString(java.lang.Object object, org.apache.commons.lang.builder.ToStringStyle style) {
		return org.apache.commons.lang.builder.ReflectionToStringBuilder.toString(object, style, false, false, null);
	}

	public static java.lang.String toString(java.lang.Object object, org.apache.commons.lang.builder.ToStringStyle style, boolean outputTransients) {
		return org.apache.commons.lang.builder.ReflectionToStringBuilder.toString(object, style, outputTransients, false, null);
	}

	public static java.lang.String toString(java.lang.Object object, org.apache.commons.lang.builder.ToStringStyle style, boolean outputTransients, boolean outputStatics) {
		return org.apache.commons.lang.builder.ReflectionToStringBuilder.toString(object, style, outputTransients, outputStatics, null);
	}

	public static <T> java.lang.String toString(T object, org.apache.commons.lang.builder.ToStringStyle style, boolean outputTransients, boolean outputStatics, java.lang.Class<? super T> reflectUpToClass) {
		return new org.apache.commons.lang.builder.ReflectionToStringBuilder<T>(object, style, null, reflectUpToClass, outputTransients, outputStatics).toString();
	}

	public static java.lang.String toStringExclude(java.lang.Object object, final java.lang.String excludeFieldName) {
		return org.apache.commons.lang.builder.ReflectionToStringBuilder.toStringExclude(object, new java.lang.String[]{ excludeFieldName });
	}

	public static java.lang.String toStringExclude(java.lang.Object object, java.util.Collection<java.lang.String> excludeFieldNames) {
		return org.apache.commons.lang.builder.ReflectionToStringBuilder.toStringExclude(object, org.apache.commons.lang.builder.ReflectionToStringBuilder.toNoNullStringArray(excludeFieldNames));
	}

	static java.lang.String[] toNoNullStringArray(java.util.Collection<java.lang.String> collection) {
		if (collection == null) {
			return org.apache.commons.lang.ArrayUtils.EMPTY_STRING_ARRAY;
		}
		return org.apache.commons.lang.builder.ReflectionToStringBuilder.toNoNullStringArray(collection.toArray());
	}

	static java.lang.String[] toNoNullStringArray(java.lang.Object[] array) {
		java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>(array.length);
		for (java.lang.Object e : array) {
			if (e != null) {
				list.add(e.toString());
			}
		}
		return list.toArray(org.apache.commons.lang.ArrayUtils.EMPTY_STRING_ARRAY);
	}

	public static <T> java.lang.String toStringExclude(T object, java.lang.String[] excludeFieldNames) {
		return new org.apache.commons.lang.builder.ReflectionToStringBuilder<T>(object).setExcludeFieldNames(excludeFieldNames).toString();
	}

	private boolean appendStatics = false;

	private boolean appendTransients = false;

	protected java.lang.String[] excludeFieldNames;

	private java.lang.Class<? super T> upToClass = null;

	public ReflectionToStringBuilder(T object) {
		super(object);
	}

	public ReflectionToStringBuilder(T object, org.apache.commons.lang.builder.ToStringStyle style) {
		super(object, style);
	}

	public ReflectionToStringBuilder(T object, org.apache.commons.lang.builder.ToStringStyle style, java.lang.StringBuffer buffer) {
		super(object, style, buffer);
	}

	public ReflectionToStringBuilder(T object, org.apache.commons.lang.builder.ToStringStyle style, java.lang.StringBuffer buffer, java.lang.Class<? super T> reflectUpToClass, boolean outputTransients, boolean outputStatics) {
		super(object, style, buffer);
		org.apache.commons.lang.builder.ReflectionToStringBuilder.this.setUpToClass(reflectUpToClass);
		org.apache.commons.lang.builder.ReflectionToStringBuilder.this.setAppendTransients(outputTransients);
		org.apache.commons.lang.builder.ReflectionToStringBuilder.this.setAppendStatics(outputStatics);
	}

	protected boolean accept(java.lang.reflect.Field field) {
		if ((field.getName().indexOf(org.apache.commons.lang.ClassUtils.INNER_CLASS_SEPARATOR_CHAR)) != (-1)) {
			return false;
		}
		if ((java.lang.reflect.Modifier.isTransient(field.getModifiers())) && (!(org.apache.commons.lang.builder.ReflectionToStringBuilder.this.isAppendTransients()))) {
			return false;
		}
		if ((java.lang.reflect.Modifier.isStatic(field.getModifiers())) && (!(org.apache.commons.lang.builder.ReflectionToStringBuilder.this.isAppendStatics()))) {
			return false;
		}
		if (((org.apache.commons.lang.builder.ReflectionToStringBuilder.this.excludeFieldNames) != null) && ((java.util.Arrays.binarySearch(org.apache.commons.lang.builder.ReflectionToStringBuilder.this.excludeFieldNames, field.getName())) >= 0)) {
			return false;
		}
		return true;
	}

	protected void appendFieldsIn(java.lang.Class<?> clazz) {
		if (clazz.isArray()) {
			org.apache.commons.lang.builder.ReflectionToStringBuilder.this.reflectionAppendArray(org.apache.commons.lang.builder.ReflectionToStringBuilder.this.getObject());
			return ;
		}
		java.lang.reflect.Field[] fields = clazz.getDeclaredFields();
		java.lang.reflect.AccessibleObject.setAccessible(fields, true);
		for (java.lang.reflect.Field field : fields) {
			java.lang.String fieldName = field.getName();
			if (org.apache.commons.lang.builder.ReflectionToStringBuilder.this.accept(field)) {
				try {
					java.lang.Object fieldValue = org.apache.commons.lang.builder.ReflectionToStringBuilder.this.getValue(field);
					org.apache.commons.lang.builder.ReflectionToStringBuilder.this.append(fieldName, fieldValue);
				} catch (java.lang.IllegalAccessException ex) {
					throw new java.lang.InternalError(("Unexpected IllegalAccessException: " + (ex.getMessage())));
				}
			}
		}
	}

	public java.lang.String[] getExcludeFieldNames() {
		return org.apache.commons.lang.builder.ReflectionToStringBuilder.this.excludeFieldNames.clone();
	}

	public java.lang.Class<?> getUpToClass() {
		return org.apache.commons.lang.builder.ReflectionToStringBuilder.this.upToClass;
	}

	protected java.lang.Object getValue(java.lang.reflect.Field field) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
		return field.get(org.apache.commons.lang.builder.ReflectionToStringBuilder.this.getObject());
	}

	public boolean isAppendStatics() {
		return org.apache.commons.lang.builder.ReflectionToStringBuilder.this.appendStatics;
	}

	public boolean isAppendTransients() {
		return org.apache.commons.lang.builder.ReflectionToStringBuilder.this.appendTransients;
	}

	public org.apache.commons.lang.builder.ToStringBuilder<T> reflectionAppendArray(java.lang.Object array) {
		org.apache.commons.lang.builder.ReflectionToStringBuilder.this.getStyle().reflectionAppendArrayDetail(org.apache.commons.lang.builder.ReflectionToStringBuilder.this.getStringBuffer(), null, array);
		return org.apache.commons.lang.builder.ReflectionToStringBuilder.this;
	}

	public void setAppendStatics(boolean appendStatics) {
		org.apache.commons.lang.builder.ReflectionToStringBuilder.this.appendStatics = appendStatics;
	}

	public void setAppendTransients(boolean appendTransients) {
		org.apache.commons.lang.builder.ReflectionToStringBuilder.this.appendTransients = appendTransients;
	}

	public org.apache.commons.lang.builder.ReflectionToStringBuilder<T> setExcludeFieldNames(java.lang.String[] excludeFieldNamesParam) {
		if (excludeFieldNamesParam == null) {
			org.apache.commons.lang.builder.ReflectionToStringBuilder.this.excludeFieldNames = null;
		}else {
			org.apache.commons.lang.builder.ReflectionToStringBuilder.this.excludeFieldNames = org.apache.commons.lang.builder.ReflectionToStringBuilder.toNoNullStringArray(excludeFieldNamesParam);
			java.util.Arrays.sort(org.apache.commons.lang.builder.ReflectionToStringBuilder.this.excludeFieldNames);
		}
		return org.apache.commons.lang.builder.ReflectionToStringBuilder.this;
	}

	public void setUpToClass(java.lang.Class<? super T> clazz) {
		org.apache.commons.lang.builder.ReflectionToStringBuilder.this.upToClass = clazz;
	}

	@java.lang.Override
	public java.lang.String toString() {
		if ((org.apache.commons.lang.builder.ReflectionToStringBuilder.this.getObject()) == null) {
			return org.apache.commons.lang.builder.ReflectionToStringBuilder.this.getStyle().getNullText();
		}
		java.lang.Class<?> clazz = org.apache.commons.lang.builder.ReflectionToStringBuilder.this.getObject().getClass();
		org.apache.commons.lang.builder.ReflectionToStringBuilder.this.appendFieldsIn(clazz);
		while (((clazz.getSuperclass()) != null) && (clazz != (org.apache.commons.lang.builder.ReflectionToStringBuilder.this.getUpToClass()))) {
			clazz = clazz.getSuperclass();
			org.apache.commons.lang.builder.ReflectionToStringBuilder.this.appendFieldsIn(clazz);
		} 
		return super.toString();
	}
}


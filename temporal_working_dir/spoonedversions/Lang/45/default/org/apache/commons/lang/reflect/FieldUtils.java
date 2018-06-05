

package org.apache.commons.lang.reflect;


public class FieldUtils {
	public FieldUtils() {
		super();
	}

	public static java.lang.reflect.Field getField(java.lang.Class cls, java.lang.String fieldName) {
		java.lang.reflect.Field field = org.apache.commons.lang.reflect.FieldUtils.getField(cls, fieldName, false);
		org.apache.commons.lang.reflect.MemberUtils.setAccessibleWorkaround(field);
		return field;
	}

	public static java.lang.reflect.Field getField(final java.lang.Class cls, java.lang.String fieldName, boolean forceAccess) {
		if (cls == null) {
			throw new java.lang.IllegalArgumentException("The class must not be null");
		}
		if (fieldName == null) {
			throw new java.lang.IllegalArgumentException("The field name must not be null");
		}
		for (java.lang.Class acls = cls; acls != null; acls = acls.getSuperclass()) {
			try {
				java.lang.reflect.Field field = acls.getDeclaredField(fieldName);
				if (!(java.lang.reflect.Modifier.isPublic(field.getModifiers()))) {
					if (forceAccess) {
						field.setAccessible(true);
					}else {
						continue;
					}
				}
				return field;
			} catch (java.lang.NoSuchFieldException ex) {
			}
		}
		java.lang.reflect.Field match = null;
		for (java.util.Iterator intf = org.apache.commons.lang.ClassUtils.getAllInterfaces(cls).iterator(); intf.hasNext();) {
			try {
				java.lang.reflect.Field test = ((java.lang.Class) (intf.next())).getField(fieldName);
				if (match != null) {
					throw new java.lang.IllegalArgumentException((((("Reference to field " + fieldName) + " is ambiguous relative to ") + cls) + "; a matching field exists on two or more implemented interfaces."));
				}
				match = test;
			} catch (java.lang.NoSuchFieldException ex) {
			}
		}
		return match;
	}

	public static java.lang.reflect.Field getDeclaredField(java.lang.Class cls, java.lang.String fieldName) {
		return org.apache.commons.lang.reflect.FieldUtils.getDeclaredField(cls, fieldName, false);
	}

	public static java.lang.reflect.Field getDeclaredField(java.lang.Class cls, java.lang.String fieldName, boolean forceAccess) {
		if (cls == null) {
			throw new java.lang.IllegalArgumentException("The class must not be null");
		}
		if (fieldName == null) {
			throw new java.lang.IllegalArgumentException("The field name must not be null");
		}
		try {
			java.lang.reflect.Field field = cls.getDeclaredField(fieldName);
			if (!(org.apache.commons.lang.reflect.MemberUtils.isAccessible(field))) {
				if (forceAccess) {
					field.setAccessible(true);
				}else {
					return null;
				}
			}
			return field;
		} catch (java.lang.NoSuchFieldException e) {
		}
		return null;
	}

	public static java.lang.Object readStaticField(java.lang.reflect.Field field) throws java.lang.IllegalAccessException {
		return org.apache.commons.lang.reflect.FieldUtils.readStaticField(field, false);
	}

	public static java.lang.Object readStaticField(java.lang.reflect.Field field, boolean forceAccess) throws java.lang.IllegalAccessException {
		if (field == null) {
			throw new java.lang.IllegalArgumentException("The field must not be null");
		}
		if (!(java.lang.reflect.Modifier.isStatic(field.getModifiers()))) {
			throw new java.lang.IllegalArgumentException((("The field '" + (field.getName())) + "' is not static"));
		}
		return org.apache.commons.lang.reflect.FieldUtils.readField(field, ((java.lang.Object) (null)), forceAccess);
	}

	public static java.lang.Object readStaticField(java.lang.Class cls, java.lang.String fieldName) throws java.lang.IllegalAccessException {
		return org.apache.commons.lang.reflect.FieldUtils.readStaticField(cls, fieldName, false);
	}

	public static java.lang.Object readStaticField(java.lang.Class cls, java.lang.String fieldName, boolean forceAccess) throws java.lang.IllegalAccessException {
		java.lang.reflect.Field field = org.apache.commons.lang.reflect.FieldUtils.getField(cls, fieldName, forceAccess);
		if (field == null) {
			throw new java.lang.IllegalArgumentException(((("Cannot locate field " + fieldName) + " on ") + cls));
		}
		return org.apache.commons.lang.reflect.FieldUtils.readStaticField(field, false);
	}

	public static java.lang.Object readDeclaredStaticField(java.lang.Class cls, java.lang.String fieldName) throws java.lang.IllegalAccessException {
		return org.apache.commons.lang.reflect.FieldUtils.readDeclaredStaticField(cls, fieldName, false);
	}

	public static java.lang.Object readDeclaredStaticField(java.lang.Class cls, java.lang.String fieldName, boolean forceAccess) throws java.lang.IllegalAccessException {
		java.lang.reflect.Field field = org.apache.commons.lang.reflect.FieldUtils.getDeclaredField(cls, fieldName, forceAccess);
		if (field == null) {
			throw new java.lang.IllegalArgumentException(((("Cannot locate declared field " + (cls.getName())) + ".") + fieldName));
		}
		return org.apache.commons.lang.reflect.FieldUtils.readStaticField(field, false);
	}

	public static java.lang.Object readField(java.lang.reflect.Field field, java.lang.Object target) throws java.lang.IllegalAccessException {
		return org.apache.commons.lang.reflect.FieldUtils.readField(field, target, false);
	}

	public static java.lang.Object readField(java.lang.reflect.Field field, java.lang.Object target, boolean forceAccess) throws java.lang.IllegalAccessException {
		if (field == null) {
			throw new java.lang.IllegalArgumentException("The field must not be null");
		}
		if (forceAccess && (!(field.isAccessible()))) {
			field.setAccessible(true);
		}else {
			org.apache.commons.lang.reflect.MemberUtils.setAccessibleWorkaround(field);
		}
		return field.get(target);
	}

	public static java.lang.Object readField(java.lang.Object target, java.lang.String fieldName) throws java.lang.IllegalAccessException {
		return org.apache.commons.lang.reflect.FieldUtils.readField(target, fieldName, false);
	}

	public static java.lang.Object readField(java.lang.Object target, java.lang.String fieldName, boolean forceAccess) throws java.lang.IllegalAccessException {
		if (target == null) {
			throw new java.lang.IllegalArgumentException("target object must not be null");
		}
		java.lang.Class cls = target.getClass();
		java.lang.reflect.Field field = org.apache.commons.lang.reflect.FieldUtils.getField(cls, fieldName, forceAccess);
		if (field == null) {
			throw new java.lang.IllegalArgumentException(((("Cannot locate field " + fieldName) + " on ") + cls));
		}
		return org.apache.commons.lang.reflect.FieldUtils.readField(field, target);
	}

	public static java.lang.Object readDeclaredField(java.lang.Object target, java.lang.String fieldName) throws java.lang.IllegalAccessException {
		return org.apache.commons.lang.reflect.FieldUtils.readDeclaredField(target, fieldName, false);
	}

	public static java.lang.Object readDeclaredField(java.lang.Object target, java.lang.String fieldName, boolean forceAccess) throws java.lang.IllegalAccessException {
		if (target == null) {
			throw new java.lang.IllegalArgumentException("target object must not be null");
		}
		java.lang.Class cls = target.getClass();
		java.lang.reflect.Field field = org.apache.commons.lang.reflect.FieldUtils.getDeclaredField(cls, fieldName, forceAccess);
		if (field == null) {
			throw new java.lang.IllegalArgumentException(((("Cannot locate declared field " + (cls.getName())) + ".") + fieldName));
		}
		return org.apache.commons.lang.reflect.FieldUtils.readField(field, target);
	}

	public static void writeStaticField(java.lang.reflect.Field field, java.lang.Object value) throws java.lang.IllegalAccessException {
		org.apache.commons.lang.reflect.FieldUtils.writeStaticField(field, value, false);
	}

	public static void writeStaticField(java.lang.reflect.Field field, java.lang.Object value, boolean forceAccess) throws java.lang.IllegalAccessException {
		if (field == null) {
			throw new java.lang.IllegalArgumentException("The field must not be null");
		}
		if (!(java.lang.reflect.Modifier.isStatic(field.getModifiers()))) {
			throw new java.lang.IllegalArgumentException((("The field '" + (field.getName())) + "' is not static"));
		}
		org.apache.commons.lang.reflect.FieldUtils.writeField(field, ((java.lang.Object) (null)), value, forceAccess);
	}

	public static void writeStaticField(java.lang.Class cls, java.lang.String fieldName, java.lang.Object value) throws java.lang.IllegalAccessException {
		org.apache.commons.lang.reflect.FieldUtils.writeStaticField(cls, fieldName, value, false);
	}

	public static void writeStaticField(java.lang.Class cls, java.lang.String fieldName, java.lang.Object value, boolean forceAccess) throws java.lang.IllegalAccessException {
		java.lang.reflect.Field field = org.apache.commons.lang.reflect.FieldUtils.getField(cls, fieldName, forceAccess);
		if (field == null) {
			throw new java.lang.IllegalArgumentException(((("Cannot locate field " + fieldName) + " on ") + cls));
		}
		org.apache.commons.lang.reflect.FieldUtils.writeStaticField(field, value);
	}

	public static void writeDeclaredStaticField(java.lang.Class cls, java.lang.String fieldName, java.lang.Object value) throws java.lang.IllegalAccessException {
		org.apache.commons.lang.reflect.FieldUtils.writeDeclaredStaticField(cls, fieldName, value, false);
	}

	public static void writeDeclaredStaticField(java.lang.Class cls, java.lang.String fieldName, java.lang.Object value, boolean forceAccess) throws java.lang.IllegalAccessException {
		java.lang.reflect.Field field = org.apache.commons.lang.reflect.FieldUtils.getDeclaredField(cls, fieldName, forceAccess);
		if (field == null) {
			throw new java.lang.IllegalArgumentException(((("Cannot locate declared field " + (cls.getName())) + ".") + fieldName));
		}
		org.apache.commons.lang.reflect.FieldUtils.writeField(field, ((java.lang.Object) (null)), value);
	}

	public static void writeField(java.lang.reflect.Field field, java.lang.Object target, java.lang.Object value) throws java.lang.IllegalAccessException {
		org.apache.commons.lang.reflect.FieldUtils.writeField(field, target, value, false);
	}

	public static void writeField(java.lang.reflect.Field field, java.lang.Object target, java.lang.Object value, boolean forceAccess) throws java.lang.IllegalAccessException {
		if (field == null) {
			throw new java.lang.IllegalArgumentException("The field must not be null");
		}
		if (forceAccess && (!(field.isAccessible()))) {
			field.setAccessible(true);
		}else {
			org.apache.commons.lang.reflect.MemberUtils.setAccessibleWorkaround(field);
		}
		field.set(target, value);
	}

	public static void writeField(java.lang.Object target, java.lang.String fieldName, java.lang.Object value) throws java.lang.IllegalAccessException {
		org.apache.commons.lang.reflect.FieldUtils.writeField(target, fieldName, value, false);
	}

	public static void writeField(java.lang.Object target, java.lang.String fieldName, java.lang.Object value, boolean forceAccess) throws java.lang.IllegalAccessException {
		if (target == null) {
			throw new java.lang.IllegalArgumentException("target object must not be null");
		}
		java.lang.Class cls = target.getClass();
		java.lang.reflect.Field field = org.apache.commons.lang.reflect.FieldUtils.getField(cls, fieldName, forceAccess);
		if (field == null) {
			throw new java.lang.IllegalArgumentException(((("Cannot locate declared field " + (cls.getName())) + ".") + fieldName));
		}
		org.apache.commons.lang.reflect.FieldUtils.writeField(field, target, value);
	}

	public static void writeDeclaredField(java.lang.Object target, java.lang.String fieldName, java.lang.Object value) throws java.lang.IllegalAccessException {
		org.apache.commons.lang.reflect.FieldUtils.writeDeclaredField(target, fieldName, value, false);
	}

	public static void writeDeclaredField(java.lang.Object target, java.lang.String fieldName, java.lang.Object value, boolean forceAccess) throws java.lang.IllegalAccessException {
		if (target == null) {
			throw new java.lang.IllegalArgumentException("target object must not be null");
		}
		java.lang.Class cls = target.getClass();
		java.lang.reflect.Field field = org.apache.commons.lang.reflect.FieldUtils.getDeclaredField(cls, fieldName, forceAccess);
		if (field == null) {
			throw new java.lang.IllegalArgumentException(((("Cannot locate declared field " + (cls.getName())) + ".") + fieldName));
		}
		org.apache.commons.lang.reflect.FieldUtils.writeField(field, target, value);
	}
}


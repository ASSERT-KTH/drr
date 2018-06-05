

package org.apache.commons.lang.reflect;


public class ConstructorUtils {
	public ConstructorUtils() {
		super();
	}

	public static java.lang.Object invokeConstructor(java.lang.Class cls, java.lang.Object arg) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
		return org.apache.commons.lang.reflect.ConstructorUtils.invokeConstructor(cls, new java.lang.Object[]{ arg });
	}

	public static java.lang.Object invokeConstructor(java.lang.Class cls, java.lang.Object[] args) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
		if (null == args) {
			args = org.apache.commons.lang.ArrayUtils.EMPTY_OBJECT_ARRAY;
		}
		java.lang.Class[] parameterTypes = new java.lang.Class[args.length];
		for (int i = 0; i < (args.length); i++) {
			parameterTypes[i] = args[i].getClass();
		}
		return org.apache.commons.lang.reflect.ConstructorUtils.invokeConstructor(cls, args, parameterTypes);
	}

	public static java.lang.Object invokeConstructor(java.lang.Class cls, java.lang.Object[] args, java.lang.Class[] parameterTypes) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
		if (parameterTypes == null) {
			parameterTypes = org.apache.commons.lang.ArrayUtils.EMPTY_CLASS_ARRAY;
		}
		if (args == null) {
			args = org.apache.commons.lang.ArrayUtils.EMPTY_OBJECT_ARRAY;
		}
		java.lang.reflect.Constructor ctor = org.apache.commons.lang.reflect.ConstructorUtils.getMatchingAccessibleConstructor(cls, parameterTypes);
		if (null == ctor) {
			throw new java.lang.NoSuchMethodException(("No such accessible constructor on object: " + (cls.getName())));
		}
		return ctor.newInstance(args);
	}

	public static java.lang.Object invokeExactConstructor(java.lang.Class cls, java.lang.Object arg) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
		return org.apache.commons.lang.reflect.ConstructorUtils.invokeExactConstructor(cls, new java.lang.Object[]{ arg });
	}

	public static java.lang.Object invokeExactConstructor(java.lang.Class cls, java.lang.Object[] args) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
		if (null == args) {
			args = org.apache.commons.lang.ArrayUtils.EMPTY_OBJECT_ARRAY;
		}
		int arguments = args.length;
		java.lang.Class[] parameterTypes = new java.lang.Class[arguments];
		for (int i = 0; i < arguments; i++) {
			parameterTypes[i] = args[i].getClass();
		}
		return org.apache.commons.lang.reflect.ConstructorUtils.invokeExactConstructor(cls, args, parameterTypes);
	}

	public static java.lang.Object invokeExactConstructor(java.lang.Class cls, java.lang.Object[] args, java.lang.Class[] parameterTypes) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
		if (args == null) {
			args = org.apache.commons.lang.ArrayUtils.EMPTY_OBJECT_ARRAY;
		}
		if (parameterTypes == null) {
			parameterTypes = org.apache.commons.lang.ArrayUtils.EMPTY_CLASS_ARRAY;
		}
		java.lang.reflect.Constructor ctor = org.apache.commons.lang.reflect.ConstructorUtils.getAccessibleConstructor(cls, parameterTypes);
		if (null == ctor) {
			throw new java.lang.NoSuchMethodException(("No such accessible constructor on object: " + (cls.getName())));
		}
		return ctor.newInstance(args);
	}

	public static java.lang.reflect.Constructor getAccessibleConstructor(java.lang.Class cls, java.lang.Class parameterType) {
		return org.apache.commons.lang.reflect.ConstructorUtils.getAccessibleConstructor(cls, new java.lang.Class[]{ parameterType });
	}

	public static java.lang.reflect.Constructor getAccessibleConstructor(java.lang.Class cls, java.lang.Class[] parameterTypes) {
		try {
			return org.apache.commons.lang.reflect.ConstructorUtils.getAccessibleConstructor(cls.getConstructor(parameterTypes));
		} catch (java.lang.NoSuchMethodException e) {
			return null;
		}
	}

	public static java.lang.reflect.Constructor getAccessibleConstructor(java.lang.reflect.Constructor ctor) {
		return (org.apache.commons.lang.reflect.MemberUtils.isAccessible(ctor)) && (java.lang.reflect.Modifier.isPublic(ctor.getDeclaringClass().getModifiers())) ? ctor : null;
	}

	public static java.lang.reflect.Constructor getMatchingAccessibleConstructor(java.lang.Class cls, java.lang.Class[] parameterTypes) {
		try {
			java.lang.reflect.Constructor ctor = cls.getConstructor(parameterTypes);
			org.apache.commons.lang.reflect.MemberUtils.setAccessibleWorkaround(ctor);
			return ctor;
		} catch (java.lang.NoSuchMethodException e) {
		}
		java.lang.reflect.Constructor result = null;
		java.lang.reflect.Constructor[] ctors = cls.getConstructors();
		for (int i = 0; i < (ctors.length); i++) {
			if (org.apache.commons.lang.ClassUtils.isAssignable(parameterTypes, ctors[i].getParameterTypes(), true)) {
				java.lang.reflect.Constructor ctor = org.apache.commons.lang.reflect.ConstructorUtils.getAccessibleConstructor(ctors[i]);
				if (ctor != null) {
					org.apache.commons.lang.reflect.MemberUtils.setAccessibleWorkaround(ctor);
					if ((result == null) || ((org.apache.commons.lang.reflect.MemberUtils.compareParameterTypes(ctor.getParameterTypes(), result.getParameterTypes(), parameterTypes)) < 0)) {
						result = ctor;
					}
				}
			}
		}
		return result;
	}
}




package org.apache.commons.lang3.reflect;


public class MethodUtils {
	public MethodUtils() {
		super();
	}

	public static java.lang.Object invokeMethod(java.lang.Object object, java.lang.String methodName, java.lang.Object... args) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
		if (args == null) {
			args = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY;
		}
		int arguments = args.length;
		java.lang.Class<?>[] parameterTypes = new java.lang.Class[arguments];
		for (int i = 0; i < arguments; i++) {
			parameterTypes[i] = args[i].getClass();
		}
		return org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(object, methodName, args, parameterTypes);
	}

	public static java.lang.Object invokeMethod(java.lang.Object object, java.lang.String methodName, java.lang.Object[] args, java.lang.Class<?>[] parameterTypes) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
		if (parameterTypes == null) {
			parameterTypes = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
		}
		if (args == null) {
			args = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY;
		}
		java.lang.reflect.Method method = org.apache.commons.lang3.reflect.MethodUtils.getMatchingAccessibleMethod(object.getClass(), methodName, parameterTypes);
		if (method == null) {
			throw new java.lang.NoSuchMethodException(((("No such accessible method: " + methodName) + "() on object: ") + (object.getClass().getName())));
		}
		return method.invoke(object, args);
	}

	public static java.lang.Object invokeExactMethod(java.lang.Object object, java.lang.String methodName, java.lang.Object... args) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
		if (args == null) {
			args = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY;
		}
		int arguments = args.length;
		java.lang.Class<?>[] parameterTypes = new java.lang.Class[arguments];
		for (int i = 0; i < arguments; i++) {
			parameterTypes[i] = args[i].getClass();
		}
		return org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(object, methodName, args, parameterTypes);
	}

	public static java.lang.Object invokeExactMethod(java.lang.Object object, java.lang.String methodName, java.lang.Object[] args, java.lang.Class<?>[] parameterTypes) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
		if (args == null) {
			args = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY;
		}
		if (parameterTypes == null) {
			parameterTypes = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
		}
		java.lang.reflect.Method method = org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(object.getClass(), methodName, parameterTypes);
		if (method == null) {
			throw new java.lang.NoSuchMethodException(((("No such accessible method: " + methodName) + "() on object: ") + (object.getClass().getName())));
		}
		return method.invoke(object, args);
	}

	public static java.lang.Object invokeExactStaticMethod(java.lang.Class<?> cls, java.lang.String methodName, java.lang.Object[] args, java.lang.Class<?>[] parameterTypes) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
		if (args == null) {
			args = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY;
		}
		if (parameterTypes == null) {
			parameterTypes = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
		}
		java.lang.reflect.Method method = org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(cls, methodName, parameterTypes);
		if (method == null) {
			throw new java.lang.NoSuchMethodException(((("No such accessible method: " + methodName) + "() on class: ") + (cls.getName())));
		}
		return method.invoke(null, args);
	}

	public static java.lang.Object invokeStaticMethod(java.lang.Class<?> cls, java.lang.String methodName, java.lang.Object... args) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
		if (args == null) {
			args = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY;
		}
		int arguments = args.length;
		java.lang.Class<?>[] parameterTypes = new java.lang.Class[arguments];
		for (int i = 0; i < arguments; i++) {
			parameterTypes[i] = args[i].getClass();
		}
		return org.apache.commons.lang3.reflect.MethodUtils.invokeStaticMethod(cls, methodName, args, parameterTypes);
	}

	public static java.lang.Object invokeStaticMethod(java.lang.Class<?> cls, java.lang.String methodName, java.lang.Object[] args, java.lang.Class<?>[] parameterTypes) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
		if (parameterTypes == null) {
			parameterTypes = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
		}
		if (args == null) {
			args = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY;
		}
		java.lang.reflect.Method method = org.apache.commons.lang3.reflect.MethodUtils.getMatchingAccessibleMethod(cls, methodName, parameterTypes);
		if (method == null) {
			throw new java.lang.NoSuchMethodException(((("No such accessible method: " + methodName) + "() on class: ") + (cls.getName())));
		}
		return method.invoke(null, args);
	}

	public static java.lang.Object invokeExactStaticMethod(java.lang.Class<?> cls, java.lang.String methodName, java.lang.Object... args) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
		if (args == null) {
			args = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY;
		}
		int arguments = args.length;
		java.lang.Class<?>[] parameterTypes = new java.lang.Class[arguments];
		for (int i = 0; i < arguments; i++) {
			parameterTypes[i] = args[i].getClass();
		}
		return org.apache.commons.lang3.reflect.MethodUtils.invokeExactStaticMethod(cls, methodName, args, parameterTypes);
	}

	public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class<?> cls, java.lang.String methodName, java.lang.Class<?>... parameterTypes) {
		try {
			return org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(cls.getMethod(methodName, parameterTypes));
		} catch (java.lang.NoSuchMethodException e) {
			return null;
		}
	}

	public static java.lang.reflect.Method getAccessibleMethod(java.lang.reflect.Method method) {
		if (!(org.apache.commons.lang3.reflect.MemberUtils.isAccessible(method))) {
			return null;
		}
		java.lang.Class<?> cls = method.getDeclaringClass();
		if (java.lang.reflect.Modifier.isPublic(cls.getModifiers())) {
			return method;
		}
		java.lang.String methodName = method.getName();
		java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
		method = org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethodFromInterfaceNest(cls, methodName, parameterTypes);
		if (method == null) {
			method = org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethodFromSuperclass(cls, methodName, parameterTypes);
		}
		return method;
	}

	private static java.lang.reflect.Method getAccessibleMethodFromSuperclass(java.lang.Class<?> cls, java.lang.String methodName, java.lang.Class<?>... parameterTypes) {
		java.lang.Class<?> parentClass = cls.getSuperclass();
		while (parentClass != null) {
			if (java.lang.reflect.Modifier.isPublic(parentClass.getModifiers())) {
				try {
					return parentClass.getMethod(methodName, parameterTypes);
				} catch (java.lang.NoSuchMethodException e) {
					return null;
				}
			}
			parentClass = parentClass.getSuperclass();
		} 
		return null;
	}

	private static java.lang.reflect.Method getAccessibleMethodFromInterfaceNest(java.lang.Class<?> cls, java.lang.String methodName, java.lang.Class<?>... parameterTypes) {
		java.lang.reflect.Method method = null;
		for (; cls != null; cls = cls.getSuperclass()) {
			java.lang.Class<?>[] interfaces = cls.getInterfaces();
			for (int i = 0; i < (interfaces.length); i++) {
				if (!(java.lang.reflect.Modifier.isPublic(interfaces[i].getModifiers()))) {
					continue;
				}
				try {
					method = interfaces[i].getDeclaredMethod(methodName, parameterTypes);
				} catch (java.lang.NoSuchMethodException e) {
				}
				if (method != null) {
					break;
				}
				method = org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethodFromInterfaceNest(interfaces[i], methodName, parameterTypes);
				if (method != null) {
					break;
				}
			}
		}
		return method;
	}

	public static java.lang.reflect.Method getMatchingAccessibleMethod(java.lang.Class<?> cls, java.lang.String methodName, java.lang.Class<?>... parameterTypes) {
		try {
			java.lang.reflect.Method method = cls.getMethod(methodName, parameterTypes);
			org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(method);
			return method;
		} catch (java.lang.NoSuchMethodException e) {
		}
		java.lang.reflect.Method bestMatch = null;
		java.lang.reflect.Method[] methods = cls.getMethods();
		for (int i = 0, size = methods.length; i < size; i++) {
			if (methods[i].getName().equals(methodName)) {
				if (org.apache.commons.lang3.ClassUtils.isAssignable(parameterTypes, methods[i].getParameterTypes(), true)) {
					java.lang.reflect.Method accessibleMethod = org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(methods[i]);
					if (accessibleMethod != null) {
						if ((bestMatch == null) || ((org.apache.commons.lang3.reflect.MemberUtils.compareParameterTypes(accessibleMethod.getParameterTypes(), bestMatch.getParameterTypes(), parameterTypes)) < 0)) {
							bestMatch = accessibleMethod;
						}
					}
				}
			}
		}
		if (bestMatch != null) {
			org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(bestMatch);
		}
		return bestMatch;
	}
}


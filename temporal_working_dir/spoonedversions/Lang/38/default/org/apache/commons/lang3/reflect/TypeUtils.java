

package org.apache.commons.lang3.reflect;


public class TypeUtils {
	public static java.lang.Class<?> getRawType(java.lang.reflect.Type enclosingType, java.lang.reflect.Type type) {
		if (type instanceof java.lang.Class<?>) {
			return ((java.lang.Class<?>) (type));
		}
		if (type instanceof java.lang.reflect.ParameterizedType) {
			return ((java.lang.Class<?>) (((java.lang.reflect.ParameterizedType) (type)).getRawType()));
		}
		if (type instanceof java.lang.reflect.TypeVariable<?>) {
			org.apache.commons.lang3.Validate.notNull(enclosingType, "Cannot get raw type of TypeVariable without enclosing type");
			return ((java.lang.Class<?>) (org.apache.commons.lang3.reflect.TypeUtils.resolveVariable(enclosingType, ((java.lang.reflect.TypeVariable<?>) (type)))));
		}
		if (type instanceof java.lang.reflect.GenericArrayType) {
			org.apache.commons.lang3.Validate.notNull(enclosingType, "Cannot get raw type of GenericArrayType without enclosing type");
			java.lang.Class<?> rawComponentType = org.apache.commons.lang3.reflect.TypeUtils.getRawType(enclosingType, ((java.lang.reflect.GenericArrayType) (type)).getGenericComponentType());
			return java.lang.reflect.Array.newInstance(rawComponentType, 0).getClass();
		}
		throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(type));
	}

	private static java.lang.reflect.Type resolveVariable(java.lang.reflect.Type enclosingType, java.lang.reflect.TypeVariable<?> typeVar) {
		if (enclosingType instanceof java.lang.reflect.ParameterizedType) {
			java.lang.reflect.ParameterizedType parameterizedEnclosingType = ((java.lang.reflect.ParameterizedType) (enclosingType));
			java.lang.reflect.TypeVariable<?>[] typeVariables = org.apache.commons.lang3.reflect.TypeUtils.getRawType(null, parameterizedEnclosingType.getRawType()).getTypeParameters();
			for (int i = 0; i < (typeVariables.length); i++) {
				if (typeVariables[i].equals(typeVar)) {
					return parameterizedEnclosingType.getActualTypeArguments()[i];
				}
			}
			java.lang.reflect.Type result = org.apache.commons.lang3.reflect.TypeUtils.resolveVariable(parameterizedEnclosingType.getRawType(), typeVar);
			if (result instanceof java.lang.reflect.TypeVariable<?>) {
				return org.apache.commons.lang3.reflect.TypeUtils.resolveVariable(enclosingType, ((java.lang.reflect.TypeVariable<?>) (result)));
			}
			return result;
		}
		if (enclosingType instanceof java.lang.Class<?>) {
			java.lang.Class<?> enclosingClass = ((java.lang.Class<?>) (enclosingType));
			java.lang.reflect.Type result = null;
			java.lang.reflect.Type genericSuperclass = enclosingClass.getGenericSuperclass();
			if ((genericSuperclass != null) && (!(java.lang.Object.class.equals(genericSuperclass)))) {
				result = org.apache.commons.lang3.reflect.TypeUtils.resolveVariable(genericSuperclass, typeVar);
			}
			if (result == null) {
				for (java.lang.reflect.Type genericInterface : enclosingClass.getGenericInterfaces()) {
					result = org.apache.commons.lang3.reflect.TypeUtils.resolveVariable(genericInterface, typeVar);
					if (result != null) {
						break;
					}
				}
			}
			if (result != null) {
				return result;
			}
		}
		throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(typeVar));
	}
}


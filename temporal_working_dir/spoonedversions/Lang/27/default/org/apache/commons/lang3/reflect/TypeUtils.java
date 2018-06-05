

package org.apache.commons.lang3.reflect;


public class TypeUtils {
	public TypeUtils() {
		super();
	}

	public static boolean isAssignable(java.lang.reflect.Type type, java.lang.reflect.Type toType) {
		return org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, toType, null);
	}

	private static boolean isAssignable(java.lang.reflect.Type type, java.lang.reflect.Type toType, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
		if ((toType == null) || (toType instanceof java.lang.Class<?>)) {
			return org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, ((java.lang.Class<?>) (toType)));
		}
		if (toType instanceof java.lang.reflect.ParameterizedType) {
			return org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, ((java.lang.reflect.ParameterizedType) (toType)), typeVarAssigns);
		}
		if (toType instanceof java.lang.reflect.GenericArrayType) {
			return org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, ((java.lang.reflect.GenericArrayType) (toType)), typeVarAssigns);
		}
		if (toType instanceof java.lang.reflect.WildcardType) {
			return org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, ((java.lang.reflect.WildcardType) (toType)), typeVarAssigns);
		}
		if (toType instanceof java.lang.reflect.TypeVariable<?>) {
			return org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, ((java.lang.reflect.TypeVariable<?>) (toType)), typeVarAssigns);
		}
		throw new java.lang.IllegalStateException(("found an unhandled type: " + toType));
	}

	private static boolean isAssignable(java.lang.reflect.Type type, java.lang.Class<?> toClass) {
		if (type == null) {
			return (toClass == null) || (!(toClass.isPrimitive()));
		}
		if (toClass == null) {
			return false;
		}
		if (toClass.equals(type)) {
			return true;
		}
		if (type instanceof java.lang.Class<?>) {
			return org.apache.commons.lang3.ClassUtils.isAssignable(((java.lang.Class<?>) (type)), toClass);
		}
		if (type instanceof java.lang.reflect.ParameterizedType) {
			return org.apache.commons.lang3.reflect.TypeUtils.isAssignable(org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.ParameterizedType) (type))), toClass);
		}
		if (type instanceof java.lang.reflect.TypeVariable<?>) {
			for (java.lang.reflect.Type bound : ((java.lang.reflect.TypeVariable<?>) (type)).getBounds()) {
				if (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toClass)) {
					return true;
				}
			}
			return false;
		}
		if (type instanceof java.lang.reflect.GenericArrayType) {
			return (toClass.equals(java.lang.Object.class)) || ((toClass.isArray()) && (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(((java.lang.reflect.GenericArrayType) (type)).getGenericComponentType(), toClass.getComponentType())));
		}
		if (type instanceof java.lang.reflect.WildcardType) {
			return false;
		}
		throw new java.lang.IllegalStateException(("found an unhandled type: " + type));
	}

	private static boolean isAssignable(java.lang.reflect.Type type, java.lang.reflect.ParameterizedType toParameterizedType, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
		if (type == null) {
			return true;
		}
		if (toParameterizedType == null) {
			return false;
		}
		if (toParameterizedType.equals(type)) {
			return true;
		}
		java.lang.Class<?> toClass = org.apache.commons.lang3.reflect.TypeUtils.getRawType(toParameterizedType);
		java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> fromTypeVarAssigns = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(type, toClass, null);
		if (fromTypeVarAssigns == null) {
			return false;
		}
		if (fromTypeVarAssigns.isEmpty()) {
			return true;
		}
		java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> toTypeVarAssigns = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(toParameterizedType, toClass, typeVarAssigns);
		for (java.util.Map.Entry<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> entry : toTypeVarAssigns.entrySet()) {
			java.lang.reflect.Type toTypeArg = entry.getValue();
			java.lang.reflect.Type fromTypeArg = fromTypeVarAssigns.get(entry.getKey());
			if (((fromTypeArg != null) && (!(toTypeArg.equals(fromTypeArg)))) && (!((toTypeArg instanceof java.lang.reflect.WildcardType) && (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(fromTypeArg, toTypeArg, typeVarAssigns))))) {
				return false;
			}
		}
		return true;
	}

	private static boolean isAssignable(java.lang.reflect.Type type, java.lang.reflect.GenericArrayType toGenericArrayType, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
		if (type == null) {
			return true;
		}
		if (toGenericArrayType == null) {
			return false;
		}
		if (toGenericArrayType.equals(type)) {
			return true;
		}
		java.lang.reflect.Type toComponentType = toGenericArrayType.getGenericComponentType();
		if (type instanceof java.lang.Class<?>) {
			java.lang.Class<?> cls = ((java.lang.Class<?>) (type));
			return (cls.isArray()) && (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(cls.getComponentType(), toComponentType, typeVarAssigns));
		}
		if (type instanceof java.lang.reflect.GenericArrayType) {
			return org.apache.commons.lang3.reflect.TypeUtils.isAssignable(((java.lang.reflect.GenericArrayType) (type)).getGenericComponentType(), toComponentType, typeVarAssigns);
		}
		if (type instanceof java.lang.reflect.WildcardType) {
			for (java.lang.reflect.Type bound : org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(((java.lang.reflect.WildcardType) (type)))) {
				if (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toGenericArrayType)) {
					return true;
				}
			}
			return false;
		}
		if (type instanceof java.lang.reflect.TypeVariable<?>) {
			for (java.lang.reflect.Type bound : org.apache.commons.lang3.reflect.TypeUtils.getImplicitBounds(((java.lang.reflect.TypeVariable<?>) (type)))) {
				if (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toGenericArrayType)) {
					return true;
				}
			}
			return false;
		}
		if (type instanceof java.lang.reflect.ParameterizedType) {
			return false;
		}
		throw new java.lang.IllegalStateException(("found an unhandled type: " + type));
	}

	private static boolean isAssignable(java.lang.reflect.Type type, java.lang.reflect.WildcardType toWildcardType, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
		if (type == null) {
			return true;
		}
		if (toWildcardType == null) {
			return false;
		}
		if (toWildcardType.equals(type)) {
			return true;
		}
		java.lang.reflect.Type[] toUpperBounds = org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(toWildcardType);
		java.lang.reflect.Type[] toLowerBounds = org.apache.commons.lang3.reflect.TypeUtils.getImplicitLowerBounds(toWildcardType);
		if (type instanceof java.lang.reflect.WildcardType) {
			java.lang.reflect.WildcardType wildcardType = ((java.lang.reflect.WildcardType) (type));
			java.lang.reflect.Type[] upperBounds = org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(wildcardType);
			java.lang.reflect.Type[] lowerBounds = org.apache.commons.lang3.reflect.TypeUtils.getImplicitLowerBounds(wildcardType);
			for (java.lang.reflect.Type toBound : toUpperBounds) {
				toBound = org.apache.commons.lang3.reflect.TypeUtils.substituteTypeVariables(toBound, typeVarAssigns);
				for (java.lang.reflect.Type bound : upperBounds) {
					if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toBound, typeVarAssigns))) {
						return false;
					}
				}
			}
			for (java.lang.reflect.Type toBound : toLowerBounds) {
				toBound = org.apache.commons.lang3.reflect.TypeUtils.substituteTypeVariables(toBound, typeVarAssigns);
				for (java.lang.reflect.Type bound : lowerBounds) {
					if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(toBound, bound, typeVarAssigns))) {
						return false;
					}
				}
			}
			return true;
		}
		for (java.lang.reflect.Type toBound : toUpperBounds) {
			if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, org.apache.commons.lang3.reflect.TypeUtils.substituteTypeVariables(toBound, typeVarAssigns), typeVarAssigns))) {
				return false;
			}
		}
		for (java.lang.reflect.Type toBound : toLowerBounds) {
			if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(org.apache.commons.lang3.reflect.TypeUtils.substituteTypeVariables(toBound, typeVarAssigns), type, typeVarAssigns))) {
				return false;
			}
		}
		return true;
	}

	private static boolean isAssignable(java.lang.reflect.Type type, java.lang.reflect.TypeVariable<?> toTypeVariable, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
		if (type == null) {
			return true;
		}
		if (toTypeVariable == null) {
			return false;
		}
		if (toTypeVariable.equals(type)) {
			return true;
		}
		if (type instanceof java.lang.reflect.TypeVariable<?>) {
			java.lang.reflect.Type[] bounds = org.apache.commons.lang3.reflect.TypeUtils.getImplicitBounds(((java.lang.reflect.TypeVariable<?>) (type)));
			for (java.lang.reflect.Type bound : bounds) {
				if (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toTypeVariable, typeVarAssigns)) {
					return true;
				}
			}
		}
		if ((((type instanceof java.lang.Class<?>) || (type instanceof java.lang.reflect.ParameterizedType)) || (type instanceof java.lang.reflect.GenericArrayType)) || (type instanceof java.lang.reflect.WildcardType)) {
			return false;
		}
		throw new java.lang.IllegalStateException(("found an unhandled type: " + type));
	}

	private static java.lang.reflect.Type substituteTypeVariables(java.lang.reflect.Type type, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
		if ((type instanceof java.lang.reflect.TypeVariable<?>) && (typeVarAssigns != null)) {
			java.lang.reflect.Type replacementType = typeVarAssigns.get(type);
			if (replacementType == null) {
				throw new java.lang.IllegalArgumentException(("missing assignment type for type variable " + type));
			}
			return replacementType;
		}
		return type;
	}

	public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(java.lang.reflect.ParameterizedType type) {
		return org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(type, org.apache.commons.lang3.reflect.TypeUtils.getRawType(type), null);
	}

	public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(java.lang.reflect.Type type, java.lang.Class<?> toClass) {
		return org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(type, toClass, null);
	}

	private static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(java.lang.reflect.Type type, java.lang.Class<?> toClass, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> subtypeVarAssigns) {
		if (type instanceof java.lang.Class<?>) {
			return org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(((java.lang.Class<?>) (type)), toClass, subtypeVarAssigns);
		}
		if (type instanceof java.lang.reflect.ParameterizedType) {
			return org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(((java.lang.reflect.ParameterizedType) (type)), toClass, subtypeVarAssigns);
		}
		if (type instanceof java.lang.reflect.GenericArrayType) {
			return org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(((java.lang.reflect.GenericArrayType) (type)).getGenericComponentType(), (toClass.isArray() ? toClass.getComponentType() : toClass), subtypeVarAssigns);
		}
		if (type instanceof java.lang.reflect.WildcardType) {
			for (java.lang.reflect.Type bound : org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(((java.lang.reflect.WildcardType) (type)))) {
				if (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toClass)) {
					return org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(bound, toClass, subtypeVarAssigns);
				}
			}
			return null;
		}
		if (type instanceof java.lang.reflect.TypeVariable<?>) {
			for (java.lang.reflect.Type bound : org.apache.commons.lang3.reflect.TypeUtils.getImplicitBounds(((java.lang.reflect.TypeVariable<?>) (type)))) {
				if (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toClass)) {
					return org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(bound, toClass, subtypeVarAssigns);
				}
			}
			return null;
		}
		throw new java.lang.IllegalStateException(("found an unhandled type: " + type));
	}

	private static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(java.lang.reflect.ParameterizedType parameterizedType, java.lang.Class<?> toClass, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> subtypeVarAssigns) {
		java.lang.Class<?> cls = org.apache.commons.lang3.reflect.TypeUtils.getRawType(parameterizedType);
		if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(cls, toClass))) {
			return null;
		}
		java.lang.reflect.Type ownerType = parameterizedType.getOwnerType();
		java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns;
		if (ownerType instanceof java.lang.reflect.ParameterizedType) {
			java.lang.reflect.ParameterizedType parameterizedOwnerType = ((java.lang.reflect.ParameterizedType) (ownerType));
			typeVarAssigns = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(parameterizedOwnerType, org.apache.commons.lang3.reflect.TypeUtils.getRawType(parameterizedOwnerType), subtypeVarAssigns);
		}else {
			typeVarAssigns = (subtypeVarAssigns == null) ? new java.util.HashMap<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>() : new java.util.HashMap<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>(subtypeVarAssigns);
		}
		java.lang.reflect.Type[] typeArgs = parameterizedType.getActualTypeArguments();
		java.lang.reflect.TypeVariable<?>[] typeParams = cls.getTypeParameters();
		for (int i = 0; i < (typeParams.length); i++) {
			java.lang.reflect.Type typeArg = typeArgs[i];
			typeVarAssigns.put(typeParams[i], (typeVarAssigns.containsKey(typeArg) ? typeVarAssigns.get(typeArg) : typeArg));
		}
		if (toClass.equals(cls)) {
			return typeVarAssigns;
		}
		return org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(org.apache.commons.lang3.reflect.TypeUtils.getClosestParentType(cls, toClass), toClass, typeVarAssigns);
	}

	private static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(java.lang.Class<?> cls, java.lang.Class<?> toClass, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> subtypeVarAssigns) {
		if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(cls, toClass))) {
			return null;
		}
		if (cls.isPrimitive()) {
			if (toClass.isPrimitive()) {
				return new java.util.HashMap<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>();
			}
			cls = org.apache.commons.lang3.ClassUtils.primitiveToWrapper(cls);
		}
		java.util.HashMap<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns = subtypeVarAssigns == null ? new java.util.HashMap<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>() : new java.util.HashMap<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>(subtypeVarAssigns);
		if (((cls.getTypeParameters().length) > 0) || (toClass.equals(cls))) {
			return typeVarAssigns;
		}
		return org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(org.apache.commons.lang3.reflect.TypeUtils.getClosestParentType(cls, toClass), toClass, typeVarAssigns);
	}

	public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> determineTypeArguments(java.lang.Class<?> cls, java.lang.reflect.ParameterizedType superType) {
		java.lang.Class<?> superClass = org.apache.commons.lang3.reflect.TypeUtils.getRawType(superType);
		if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(cls, superClass))) {
			return null;
		}
		if (cls.equals(superClass)) {
			return org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(superType, superClass, null);
		}
		java.lang.reflect.Type midType = org.apache.commons.lang3.reflect.TypeUtils.getClosestParentType(cls, superClass);
		if (midType instanceof java.lang.Class<?>) {
			return org.apache.commons.lang3.reflect.TypeUtils.determineTypeArguments(((java.lang.Class<?>) (midType)), superType);
		}
		java.lang.reflect.ParameterizedType midParameterizedType = ((java.lang.reflect.ParameterizedType) (midType));
		java.lang.Class<?> midClass = org.apache.commons.lang3.reflect.TypeUtils.getRawType(midParameterizedType);
		java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns = org.apache.commons.lang3.reflect.TypeUtils.determineTypeArguments(midClass, superType);
		org.apache.commons.lang3.reflect.TypeUtils.mapTypeVariablesToArguments(cls, midParameterizedType, typeVarAssigns);
		return typeVarAssigns;
	}

	private static <T> void mapTypeVariablesToArguments(java.lang.Class<T> cls, java.lang.reflect.ParameterizedType parameterizedType, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
		java.lang.reflect.Type ownerType = parameterizedType.getOwnerType();
		if (ownerType instanceof java.lang.reflect.ParameterizedType) {
			org.apache.commons.lang3.reflect.TypeUtils.mapTypeVariablesToArguments(cls, ((java.lang.reflect.ParameterizedType) (ownerType)), typeVarAssigns);
		}
		java.lang.reflect.Type[] typeArgs = parameterizedType.getActualTypeArguments();
		java.lang.reflect.TypeVariable<?>[] typeVars = org.apache.commons.lang3.reflect.TypeUtils.getRawType(parameterizedType).getTypeParameters();
		java.util.List<java.lang.reflect.TypeVariable<java.lang.Class<T>>> typeVarList = java.util.Arrays.asList(cls.getTypeParameters());
		for (int i = 0; i < (typeArgs.length); i++) {
			java.lang.reflect.TypeVariable<?> typeVar = typeVars[i];
			java.lang.reflect.Type typeArg = typeArgs[i];
			if ((typeVarList.contains(typeArg)) && (typeVarAssigns.containsKey(typeVar))) {
				typeVarAssigns.put(((java.lang.reflect.TypeVariable<?>) (typeArg)), typeVarAssigns.get(typeVar));
			}
		}
	}

	private static java.lang.reflect.Type getClosestParentType(java.lang.Class<?> cls, java.lang.Class<?> superClass) {
		if (superClass.isInterface()) {
			java.lang.reflect.Type[] interfaceTypes = cls.getGenericInterfaces();
			java.lang.reflect.Type genericInterface = null;
			for (int i = 0; i < (interfaceTypes.length); i++) {
				java.lang.reflect.Type midType = interfaceTypes[i];
				java.lang.Class<?> midClass = null;
				if (midType instanceof java.lang.reflect.ParameterizedType) {
					midClass = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.ParameterizedType) (midType)));
				}else
					if (midType instanceof java.lang.Class<?>) {
						midClass = ((java.lang.Class<?>) (midType));
					}else {
						throw new java.lang.IllegalStateException((("Unexpected generic" + " interface type found: ") + midType));
					}
				
				if ((org.apache.commons.lang3.reflect.TypeUtils.isAssignable(midClass, superClass)) && (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(genericInterface, ((java.lang.reflect.Type) (midClass))))) {
					genericInterface = midType;
				}
			}
			if (genericInterface != null) {
				return genericInterface;
			}
		}
		return cls.getGenericSuperclass();
	}

	public static boolean isInstance(java.lang.Object value, java.lang.reflect.Type type) {
		if (type == null) {
			return false;
		}
		return value == null ? (!(type instanceof java.lang.Class<?>)) || (!(((java.lang.Class<?>) (type)).isPrimitive())) : org.apache.commons.lang3.reflect.TypeUtils.isAssignable(value.getClass(), type, null);
	}

	public static java.lang.reflect.Type[] normalizeUpperBounds(java.lang.reflect.Type[] bounds) {
		if ((bounds.length) < 2) {
			return bounds;
		}
		java.util.Set<java.lang.reflect.Type> types = new java.util.HashSet<java.lang.reflect.Type>(bounds.length);
		for (java.lang.reflect.Type type1 : bounds) {
			boolean subtypeFound = false;
			for (java.lang.reflect.Type type2 : bounds) {
				if ((type1 != type2) && (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type2, type1, null))) {
					subtypeFound = true;
					break;
				}
			}
			if (!subtypeFound) {
				types.add(type1);
			}
		}
		return types.toArray(new java.lang.reflect.Type[0]);
	}

	public static java.lang.reflect.Type[] getImplicitBounds(java.lang.reflect.TypeVariable<?> typeVariable) {
		java.lang.reflect.Type[] bounds = typeVariable.getBounds();
		return (bounds.length) == 0 ? new java.lang.reflect.Type[]{ java.lang.Object.class } : org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(bounds);
	}

	public static java.lang.reflect.Type[] getImplicitUpperBounds(java.lang.reflect.WildcardType wildcardType) {
		java.lang.reflect.Type[] bounds = wildcardType.getUpperBounds();
		return (bounds.length) == 0 ? new java.lang.reflect.Type[]{ java.lang.Object.class } : org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(bounds);
	}

	public static java.lang.reflect.Type[] getImplicitLowerBounds(java.lang.reflect.WildcardType wildcardType) {
		java.lang.reflect.Type[] bounds = wildcardType.getLowerBounds();
		return (bounds.length) == 0 ? new java.lang.reflect.Type[]{ null } : bounds;
	}

	public static boolean typesSatisfyVariables(java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
		for (java.util.Map.Entry<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> entry : typeVarAssigns.entrySet()) {
			java.lang.reflect.TypeVariable<?> typeVar = entry.getKey();
			java.lang.reflect.Type type = entry.getValue();
			for (java.lang.reflect.Type bound : org.apache.commons.lang3.reflect.TypeUtils.getImplicitBounds(typeVar)) {
				if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, org.apache.commons.lang3.reflect.TypeUtils.substituteTypeVariables(bound, typeVarAssigns), typeVarAssigns))) {
					return false;
				}
			}
		}
		return true;
	}

	private static java.lang.Class<?> getRawType(java.lang.reflect.ParameterizedType parameterizedType) {
		java.lang.reflect.Type rawType = parameterizedType.getRawType();
		if (!(rawType instanceof java.lang.Class<?>)) {
			throw new java.lang.IllegalStateException(("Wait... What!? Type of rawType: " + rawType));
		}
		return ((java.lang.Class<?>) (rawType));
	}

	public static java.lang.Class<?> getRawType(java.lang.reflect.Type type, java.lang.reflect.Type assigningType) {
		if (type instanceof java.lang.Class<?>) {
			return ((java.lang.Class<?>) (type));
		}
		if (type instanceof java.lang.reflect.ParameterizedType) {
			return org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.ParameterizedType) (type)));
		}
		if (type instanceof java.lang.reflect.TypeVariable<?>) {
			if (assigningType == null) {
				return null;
			}
			java.lang.Object genericDeclaration = ((java.lang.reflect.TypeVariable<?>) (type)).getGenericDeclaration();
			if (!(genericDeclaration instanceof java.lang.Class<?>)) {
				return null;
			}
			java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(assigningType, ((java.lang.Class<?>) (genericDeclaration)));
			if (typeVarAssigns == null) {
				return null;
			}
			java.lang.reflect.Type typeArgument = typeVarAssigns.get(type);
			if (typeArgument == null) {
				return null;
			}
			return org.apache.commons.lang3.reflect.TypeUtils.getRawType(typeArgument, assigningType);
		}
		if (type instanceof java.lang.reflect.GenericArrayType) {
			java.lang.Class<?> rawComponentType = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.GenericArrayType) (type)).getGenericComponentType(), assigningType);
			return java.lang.reflect.Array.newInstance(rawComponentType, 0).getClass();
		}
		if (type instanceof java.lang.reflect.WildcardType) {
			return null;
		}
		throw new java.lang.IllegalArgumentException(("unknown type: " + type));
	}

	public static boolean isArrayType(java.lang.reflect.Type type) {
		return (type instanceof java.lang.reflect.GenericArrayType) || ((type instanceof java.lang.Class<?>) && (((java.lang.Class<?>) (type)).isArray()));
	}

	public static java.lang.reflect.Type getArrayComponentType(java.lang.reflect.Type type) {
		if (type instanceof java.lang.Class<?>) {
			java.lang.Class<?> clazz = ((java.lang.Class<?>) (type));
			return clazz.isArray() ? clazz.getComponentType() : null;
		}
		if (type instanceof java.lang.reflect.GenericArrayType) {
			return ((java.lang.reflect.GenericArrayType) (type)).getGenericComponentType();
		}
		return null;
	}
}




package com.google.javascript.rhino.jstype;


public abstract class JSType implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private boolean resolved = false;

	private com.google.javascript.rhino.jstype.JSType resolveResult = null;

	public static final java.lang.String UNKNOWN_NAME = "Unknown class name";

	public static final java.lang.String NOT_A_CLASS = "Not declared as a constructor";

	public static final java.lang.String NOT_A_TYPE = "Not declared as a type name";

	public static final java.lang.String EMPTY_TYPE_COMPONENT = "Named type with empty name component";

	static final java.util.Comparator<com.google.javascript.rhino.jstype.JSType> ALPHA = new java.util.Comparator<com.google.javascript.rhino.jstype.JSType>() {
		@java.lang.Override
		public int compare(com.google.javascript.rhino.jstype.JSType t1, com.google.javascript.rhino.jstype.JSType t2) {
			return t1.toString().compareTo(t2.toString());
		}
	};

	public static final int ENUMDECL = 1;

	public static final int NOT_ENUMDECL = 0;

	final com.google.javascript.rhino.jstype.JSTypeRegistry registry;

	JSType(com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
		this.registry = registry;
	}

	com.google.javascript.rhino.jstype.JSType getNativeType(com.google.javascript.rhino.jstype.JSTypeNative typeId) {
		return registry.getNativeType(typeId);
	}

	public com.google.javascript.rhino.JSDocInfo getJSDocInfo() {
		return null;
	}

	public java.lang.String getDisplayName() {
		return null;
	}

	public boolean hasDisplayName() {
		java.lang.String displayName = getDisplayName();
		return (displayName != null) && (!(displayName.isEmpty()));
	}

	public boolean isNoType() {
		return false;
	}

	public boolean isNoResolvedType() {
		return false;
	}

	public boolean isNoObjectType() {
		return false;
	}

	public final boolean isEmptyType() {
		return (((isNoType()) || (isNoObjectType())) || (isNoResolvedType())) || ((registry.getNativeFunctionType(com.google.javascript.rhino.jstype.JSTypeNative.LEAST_FUNCTION_TYPE)) == (com.google.javascript.rhino.jstype.JSType.this));
	}

	public boolean isNumberObjectType() {
		return false;
	}

	public boolean isNumberValueType() {
		return false;
	}

	public boolean isFunctionPrototypeType() {
		return false;
	}

	public boolean isStringObjectType() {
		return false;
	}

	boolean isTheObjectType() {
		return false;
	}

	public boolean isStringValueType() {
		return false;
	}

	public final boolean isString() {
		return com.google.javascript.rhino.jstype.JSType.this.isSubtype(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_VALUE_OR_OBJECT_TYPE));
	}

	public final boolean isNumber() {
		return com.google.javascript.rhino.jstype.JSType.this.isSubtype(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_VALUE_OR_OBJECT_TYPE));
	}

	public boolean isArrayType() {
		return false;
	}

	public boolean isBooleanObjectType() {
		return false;
	}

	public boolean isBooleanValueType() {
		return false;
	}

	public boolean isRegexpType() {
		return false;
	}

	public boolean isDateType() {
		return false;
	}

	public boolean isNullType() {
		return false;
	}

	public boolean isVoidType() {
		return false;
	}

	public boolean isAllType() {
		return false;
	}

	public boolean isUnknownType() {
		return false;
	}

	public boolean isCheckedUnknownType() {
		return false;
	}

	public final boolean isUnionType() {
		return (toMaybeUnionType()) != null;
	}

	public com.google.javascript.rhino.jstype.UnionType toMaybeUnionType() {
		return null;
	}

	public final boolean isGlobalThisType() {
		return (com.google.javascript.rhino.jstype.JSType.this) == (registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.GLOBAL_THIS));
	}

	public final boolean isFunctionType() {
		return (toMaybeFunctionType()) != null;
	}

	public com.google.javascript.rhino.jstype.FunctionType toMaybeFunctionType() {
		return null;
	}

	public static com.google.javascript.rhino.jstype.FunctionType toMaybeFunctionType(com.google.javascript.rhino.jstype.JSType type) {
		return type == null ? null : type.toMaybeFunctionType();
	}

	public final boolean isEnumElementType() {
		return (toMaybeEnumElementType()) != null;
	}

	public com.google.javascript.rhino.jstype.EnumElementType toMaybeEnumElementType() {
		return null;
	}

	public boolean isEnumType() {
		return false;
	}

	boolean isNamedType() {
		return false;
	}

	public boolean isRecordType() {
		return (toMaybeRecordType()) != null;
	}

	com.google.javascript.rhino.jstype.RecordType toMaybeRecordType() {
		return null;
	}

	public boolean isTemplateType() {
		return false;
	}

	public boolean isObject() {
		return false;
	}

	public boolean isConstructor() {
		return false;
	}

	public boolean isNominalType() {
		return false;
	}

	public final boolean isNominalConstructor() {
		if ((isConstructor()) || (isInterface())) {
			com.google.javascript.rhino.jstype.FunctionType fn = toMaybeFunctionType();
			if (fn == null) {
				return false;
			}
			if ((fn.getSource()) != null) {
				return true;
			}
			return fn.isNativeObjectType();
		}
		return false;
	}

	public boolean isInstanceType() {
		return false;
	}

	public boolean isInterface() {
		return false;
	}

	public boolean isOrdinaryFunction() {
		return false;
	}

	public boolean isEquivalentTo(com.google.javascript.rhino.jstype.JSType jsType) {
		if (jsType instanceof com.google.javascript.rhino.jstype.ProxyObjectType) {
			return jsType.isEquivalentTo(com.google.javascript.rhino.jstype.JSType.this);
		}
		return (com.google.javascript.rhino.jstype.JSType.this) == jsType;
	}

	public static boolean isEquivalent(com.google.javascript.rhino.jstype.JSType typeA, com.google.javascript.rhino.jstype.JSType typeB) {
		return (typeA == null) || (typeB == null) ? typeA == typeB : typeA.isEquivalentTo(typeB);
	}

	@java.lang.Override
	public boolean equals(java.lang.Object jsType) {
		return jsType instanceof com.google.javascript.rhino.jstype.JSType ? isEquivalentTo(((com.google.javascript.rhino.jstype.JSType) (jsType))) : false;
	}

	@java.lang.Override
	public int hashCode() {
		return java.lang.System.identityHashCode(com.google.javascript.rhino.jstype.JSType.this);
	}

	public final boolean matchesInt32Context() {
		return matchesNumberContext();
	}

	public final boolean matchesUint32Context() {
		return matchesNumberContext();
	}

	public boolean matchesNumberContext() {
		return false;
	}

	public boolean matchesStringContext() {
		return false;
	}

	public boolean matchesObjectContext() {
		return false;
	}

	public com.google.javascript.rhino.jstype.JSType findPropertyType(java.lang.String propertyName) {
		com.google.javascript.rhino.jstype.ObjectType autoboxObjType = com.google.javascript.rhino.jstype.ObjectType.cast(autoboxesTo());
		if (autoboxObjType != null) {
			return autoboxObjType.findPropertyType(propertyName);
		}
		return null;
	}

	public boolean canBeCalled() {
		return false;
	}

	public boolean canAssignTo(com.google.javascript.rhino.jstype.JSType that) {
		if (com.google.javascript.rhino.jstype.JSType.this.isSubtype(that)) {
			return true;
		}
		return false;
	}

	public com.google.javascript.rhino.jstype.JSType autoboxesTo() {
		return null;
	}

	public com.google.javascript.rhino.jstype.JSType unboxesTo() {
		return null;
	}

	public com.google.javascript.rhino.jstype.ObjectType toObjectType() {
		return (com.google.javascript.rhino.jstype.JSType.this) instanceof com.google.javascript.rhino.jstype.ObjectType ? ((com.google.javascript.rhino.jstype.ObjectType) (com.google.javascript.rhino.jstype.JSType.this)) : null;
	}

	public com.google.javascript.rhino.jstype.JSType autobox() {
		com.google.javascript.rhino.jstype.JSType restricted = restrictByNotNullOrUndefined();
		com.google.javascript.rhino.jstype.JSType autobox = restricted.autoboxesTo();
		return autobox == null ? restricted : autobox;
	}

	public final com.google.javascript.rhino.jstype.ObjectType dereference() {
		return com.google.javascript.rhino.jstype.ObjectType.cast(autobox());
	}

	public final boolean canTestForEqualityWith(com.google.javascript.rhino.jstype.JSType that) {
		return com.google.javascript.rhino.jstype.JSType.this.testForEquality(that).equals(com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN);
	}

	public com.google.javascript.rhino.jstype.TernaryValue testForEquality(com.google.javascript.rhino.jstype.JSType that) {
		return testForEqualityHelper(com.google.javascript.rhino.jstype.JSType.this, that);
	}

	com.google.javascript.rhino.jstype.TernaryValue testForEqualityHelper(com.google.javascript.rhino.jstype.JSType aType, com.google.javascript.rhino.jstype.JSType bType) {
		if ((((((bType.isAllType()) || (bType.isUnknownType())) || (bType.isNoResolvedType())) || (aType.isAllType())) || (aType.isUnknownType())) || (aType.isNoResolvedType())) {
			return com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
		}
		boolean aIsEmpty = aType.isEmptyType();
		boolean bIsEmpty = bType.isEmptyType();
		if (aIsEmpty || bIsEmpty) {
			if (aIsEmpty && bIsEmpty) {
				return com.google.javascript.rhino.jstype.TernaryValue.TRUE;
			}else {
				return com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
			}
		}
		if ((aType.isFunctionType()) || (bType.isFunctionType())) {
			com.google.javascript.rhino.jstype.JSType otherType = aType.isFunctionType() ? bType : aType;
			com.google.javascript.rhino.jstype.JSType meet = otherType.getGreatestSubtype(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE));
			if ((meet.isNoType()) || (meet.isNoObjectType())) {
				return com.google.javascript.rhino.jstype.TernaryValue.FALSE;
			}else {
				return com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
			}
		}
		if ((bType.isEnumElementType()) || (bType.isUnionType())) {
			return bType.testForEquality(aType);
		}
		return null;
	}

	public final boolean canTestForShallowEqualityWith(com.google.javascript.rhino.jstype.JSType that) {
		return (com.google.javascript.rhino.jstype.JSType.this.isSubtype(that)) || (that.isSubtype(com.google.javascript.rhino.jstype.JSType.this));
	}

	public boolean isNullable() {
		return com.google.javascript.rhino.jstype.JSType.this.isSubtype(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE));
	}

	public com.google.javascript.rhino.jstype.JSType getLeastSupertype(com.google.javascript.rhino.jstype.JSType that) {
		if (that.isUnionType()) {
			return that.toMaybeUnionType().getLeastSupertype(com.google.javascript.rhino.jstype.JSType.this);
		}
		return com.google.javascript.rhino.jstype.JSType.getLeastSupertype(com.google.javascript.rhino.jstype.JSType.this, that);
	}

	static com.google.javascript.rhino.jstype.JSType getLeastSupertype(com.google.javascript.rhino.jstype.JSType thisType, com.google.javascript.rhino.jstype.JSType thatType) {
		boolean areEquivalent = thisType.isEquivalentTo(thatType);
		return areEquivalent ? thisType : com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(thisType.registry.createUnionType(thisType, thatType));
	}

	public com.google.javascript.rhino.jstype.JSType getGreatestSubtype(com.google.javascript.rhino.jstype.JSType that) {
		return com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(com.google.javascript.rhino.jstype.JSType.this, that);
	}

	static com.google.javascript.rhino.jstype.JSType getGreatestSubtype(com.google.javascript.rhino.jstype.JSType thisType, com.google.javascript.rhino.jstype.JSType thatType) {
		if (thisType.isEquivalentTo(thatType)) {
			return thisType;
		}else
			if ((thisType.isUnknownType()) || (thatType.isUnknownType())) {
				return thisType.isEquivalentTo(thatType) ? thisType : thisType.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
			}else
				if (thisType.isSubtype(thatType)) {
					return com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(thisType);
				}else
					if (thatType.isSubtype(thisType)) {
						return com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(thatType);
					}else
						if (thisType.isUnionType()) {
							return thisType.toMaybeUnionType().meet(thatType);
						}else
							if (thatType.isUnionType()) {
								return thatType.toMaybeUnionType().meet(thisType);
							}else
								if (thisType.isRecordType()) {
									return thisType.toMaybeRecordType().getGreatestSubtypeHelper(thatType);
								}else
									if (thatType.isRecordType()) {
										return thatType.toMaybeRecordType().getGreatestSubtypeHelper(thisType);
									}
								
							
						
					
				
			
		
		if (thisType.isEnumElementType()) {
			com.google.javascript.rhino.jstype.JSType inf = thisType.toMaybeEnumElementType().meet(thatType);
			if (inf != null) {
				return inf;
			}
		}else
			if (thatType.isEnumElementType()) {
				com.google.javascript.rhino.jstype.JSType inf = thatType.toMaybeEnumElementType().meet(thisType);
				if (inf != null) {
					return inf;
				}
			}
		
		if ((thisType.isObject()) && (thatType.isObject())) {
			return thisType.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE);
		}
		return thisType.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
	}

	static com.google.javascript.rhino.jstype.JSType filterNoResolvedType(com.google.javascript.rhino.jstype.JSType type) {
		if (type.isNoResolvedType()) {
			return type.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_RESOLVED_TYPE);
		}else
			if (type.isUnionType()) {
				com.google.javascript.rhino.jstype.UnionType unionType = type.toMaybeUnionType();
				boolean needsFiltering = false;
				for (com.google.javascript.rhino.jstype.JSType alt : unionType.getAlternates()) {
					if (alt.isNoResolvedType()) {
						needsFiltering = true;
						break;
					}
				}
				if (needsFiltering) {
					com.google.javascript.rhino.jstype.UnionTypeBuilder builder = new com.google.javascript.rhino.jstype.UnionTypeBuilder(type.registry);
					for (com.google.javascript.rhino.jstype.JSType alt : unionType.getAlternates()) {
						if (!(alt.isNoResolvedType())) {
							builder.addAlternate(alt);
						}
					}
					return builder.build();
				}
			}
		
		return type;
	}

	public com.google.javascript.rhino.jstype.JSType getRestrictedTypeGivenToBooleanOutcome(boolean outcome) {
		com.google.javascript.rhino.jstype.BooleanLiteralSet literals = getPossibleToBooleanOutcomes();
		if (literals.contains(outcome)) {
			return com.google.javascript.rhino.jstype.JSType.this;
		}else {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
		}
	}

	public abstract com.google.javascript.rhino.jstype.BooleanLiteralSet getPossibleToBooleanOutcomes();

	public com.google.javascript.rhino.jstype.JSType.TypePair getTypesUnderEquality(com.google.javascript.rhino.jstype.JSType that) {
		if (that.isUnionType()) {
			com.google.javascript.rhino.jstype.JSType.TypePair p = that.toMaybeUnionType().getTypesUnderEquality(com.google.javascript.rhino.jstype.JSType.this);
			return new com.google.javascript.rhino.jstype.JSType.TypePair(p.typeB, p.typeA);
		}
		switch (com.google.javascript.rhino.jstype.JSType.this.testForEquality(that)) {
			case FALSE :
				return new com.google.javascript.rhino.jstype.JSType.TypePair(null, null);
			case TRUE :
			case UNKNOWN :
				return new com.google.javascript.rhino.jstype.JSType.TypePair(com.google.javascript.rhino.jstype.JSType.this, that);
		}
		throw new java.lang.IllegalStateException();
	}

	public com.google.javascript.rhino.jstype.JSType.TypePair getTypesUnderInequality(com.google.javascript.rhino.jstype.JSType that) {
		if (that.isUnionType()) {
			com.google.javascript.rhino.jstype.JSType.TypePair p = that.toMaybeUnionType().getTypesUnderInequality(com.google.javascript.rhino.jstype.JSType.this);
			return new com.google.javascript.rhino.jstype.JSType.TypePair(p.typeB, p.typeA);
		}
		switch (com.google.javascript.rhino.jstype.JSType.this.testForEquality(that)) {
			case TRUE :
				com.google.javascript.rhino.jstype.JSType noType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
				return new com.google.javascript.rhino.jstype.JSType.TypePair(noType, noType);
			case FALSE :
			case UNKNOWN :
				return new com.google.javascript.rhino.jstype.JSType.TypePair(com.google.javascript.rhino.jstype.JSType.this, that);
		}
		throw new java.lang.IllegalStateException();
	}

	public com.google.javascript.rhino.jstype.JSType.TypePair getTypesUnderShallowEquality(com.google.javascript.rhino.jstype.JSType that) {
		com.google.javascript.rhino.jstype.JSType commonType = getGreatestSubtype(that);
		return new com.google.javascript.rhino.jstype.JSType.TypePair(commonType, commonType);
	}

	public com.google.javascript.rhino.jstype.JSType.TypePair getTypesUnderShallowInequality(com.google.javascript.rhino.jstype.JSType that) {
		if (that.isUnionType()) {
			com.google.javascript.rhino.jstype.JSType.TypePair p = that.toMaybeUnionType().getTypesUnderShallowInequality(com.google.javascript.rhino.jstype.JSType.this);
			return new com.google.javascript.rhino.jstype.JSType.TypePair(p.typeB, p.typeA);
		}
		if (((com.google.javascript.rhino.jstype.JSType.this.isNullType()) && (that.isNullType())) || ((com.google.javascript.rhino.jstype.JSType.this.isVoidType()) && (that.isVoidType()))) {
			return new com.google.javascript.rhino.jstype.JSType.TypePair(null, null);
		}else {
			return new com.google.javascript.rhino.jstype.JSType.TypePair(com.google.javascript.rhino.jstype.JSType.this, that);
		}
	}

	public com.google.javascript.rhino.jstype.JSType restrictByNotNullOrUndefined() {
		return com.google.javascript.rhino.jstype.JSType.this;
	}

	public boolean isSubtype(com.google.javascript.rhino.jstype.JSType that) {
		return com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(com.google.javascript.rhino.jstype.JSType.this, that);
	}

	public boolean differsFrom(com.google.javascript.rhino.jstype.JSType that) {
		if ((!(com.google.javascript.rhino.jstype.JSType.this.isUnknownType())) && (!(that.isUnknownType()))) {
			return !(com.google.javascript.rhino.jstype.JSType.this.isEquivalentTo(that));
		}
		return (com.google.javascript.rhino.jstype.JSType.this.isUnknownType()) ^ (that.isUnknownType());
	}

	static boolean isSubtypeHelper(com.google.javascript.rhino.jstype.JSType thisType, com.google.javascript.rhino.jstype.JSType thatType) {
		if (thatType.isUnknownType()) {
			return true;
		}
		if (thisType.isEquivalentTo(thatType)) {
			return true;
		}
		if (thatType.isAllType()) {
			return true;
		}
		if (thatType.isUnionType()) {
			com.google.javascript.rhino.jstype.UnionType union = thatType.toMaybeUnionType();
			for (com.google.javascript.rhino.jstype.JSType element : union.alternates) {
				if (thisType.isSubtype(element)) {
					return true;
				}
			}
		}
		if (thatType instanceof com.google.javascript.rhino.jstype.ProxyObjectType) {
			return thisType.isSubtype(((com.google.javascript.rhino.jstype.ProxyObjectType) (thatType)).getReferencedTypeInternal());
		}
		return false;
	}

	public abstract <T> T visit(com.google.javascript.rhino.jstype.Visitor<T> visitor);

	public final com.google.javascript.rhino.jstype.JSType forceResolve(com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope) {
		com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode oldResolveMode = registry.getResolveMode();
		registry.setResolveMode(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE);
		com.google.javascript.rhino.jstype.JSType result = resolve(t, scope);
		registry.setResolveMode(oldResolveMode);
		return result;
	}

	public final com.google.javascript.rhino.jstype.JSType resolve(com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope) {
		if (resolved) {
			if ((resolveResult) == null) {
				return registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
			}
			return resolveResult;
		}
		resolved = true;
		resolveResult = resolveInternal(t, scope);
		resolveResult.setResolvedTypeInternal(resolveResult);
		return resolveResult;
	}

	abstract com.google.javascript.rhino.jstype.JSType resolveInternal(com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope);

	void setResolvedTypeInternal(com.google.javascript.rhino.jstype.JSType type) {
		resolveResult = type;
		resolved = true;
	}

	public final boolean isResolved() {
		return resolved;
	}

	public final void clearResolved() {
		resolved = false;
		resolveResult = null;
	}

	static final com.google.javascript.rhino.jstype.JSType safeResolve(com.google.javascript.rhino.jstype.JSType type, com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope) {
		return type == null ? null : type.resolve(t, scope);
	}

	public boolean setValidator(com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> validator) {
		return validator.apply(com.google.javascript.rhino.jstype.JSType.this);
	}

	public static class TypePair {
		public final com.google.javascript.rhino.jstype.JSType typeA;

		public final com.google.javascript.rhino.jstype.JSType typeB;

		public TypePair(com.google.javascript.rhino.jstype.JSType typeA, com.google.javascript.rhino.jstype.JSType typeB) {
			this.typeA = typeA;
			this.typeB = typeB;
		}
	}

	public java.lang.String toDebugHashCodeString() {
		return ("{" + (com.google.javascript.rhino.jstype.JSType.this.hashCode())) + "}";
	}
}


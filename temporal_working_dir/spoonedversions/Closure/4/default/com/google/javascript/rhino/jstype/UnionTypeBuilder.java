

package com.google.javascript.rhino.jstype;


class UnionTypeBuilder implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private static final int DEFAULT_MAX_UNION_SIZE = 20;

	private final com.google.javascript.rhino.jstype.JSTypeRegistry registry;

	private final java.util.List<com.google.javascript.rhino.jstype.JSType> alternates = com.google.common.collect.Lists.newArrayList();

	private boolean isAllType = false;

	private boolean isNativeUnknownType = false;

	private boolean areAllUnknownsChecked = true;

	private final int maxUnionSize;

	private int functionTypePosition = -1;

	private com.google.javascript.rhino.jstype.JSType result = null;

	UnionTypeBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
		this(registry, com.google.javascript.rhino.jstype.UnionTypeBuilder.DEFAULT_MAX_UNION_SIZE);
	}

	UnionTypeBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry registry, int maxUnionSize) {
		this.registry = registry;
		this.maxUnionSize = maxUnionSize;
	}

	java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> getAlternates() {
		com.google.javascript.rhino.jstype.JSType specialCaseType = reduceAlternatesWithoutUnion();
		if (specialCaseType != null) {
			return com.google.common.collect.ImmutableList.of(specialCaseType);
		}
		return java.util.Collections.unmodifiableList(alternates);
	}

	com.google.javascript.rhino.jstype.UnionTypeBuilder addAlternate(com.google.javascript.rhino.jstype.JSType alternate) {
		if (alternate.isNoType()) {
			return com.google.javascript.rhino.jstype.UnionTypeBuilder.this;
		}
		isAllType = (isAllType) || (alternate.isAllType());
		boolean isAlternateUnknown = alternate instanceof com.google.javascript.rhino.jstype.UnknownType;
		isNativeUnknownType = (isNativeUnknownType) || isAlternateUnknown;
		if (isAlternateUnknown) {
			areAllUnknownsChecked = (areAllUnknownsChecked) && (alternate.isCheckedUnknownType());
		}
		if ((!(isAllType)) && (!(isNativeUnknownType))) {
			if (alternate.isUnionType()) {
				com.google.javascript.rhino.jstype.UnionType union = alternate.toMaybeUnionType();
				for (com.google.javascript.rhino.jstype.JSType unionAlt : union.getAlternates()) {
					addAlternate(unionAlt);
				}
			}else {
				if ((alternates.size()) > (maxUnionSize)) {
					return com.google.javascript.rhino.jstype.UnionTypeBuilder.this;
				}
				if ((alternate.isFunctionType()) && ((functionTypePosition) != (-1))) {
					com.google.javascript.rhino.jstype.FunctionType other = alternates.get(functionTypePosition).toMaybeFunctionType();
					com.google.javascript.rhino.jstype.FunctionType supremum = alternate.toMaybeFunctionType().supAndInfHelper(other, true);
					alternates.set(functionTypePosition, supremum);
					result = null;
					return com.google.javascript.rhino.jstype.UnionTypeBuilder.this;
				}
				int currentIndex = 0;
				java.util.Iterator<com.google.javascript.rhino.jstype.JSType> it = alternates.iterator();
				while (it.hasNext()) {
					boolean removeCurrent = false;
					com.google.javascript.rhino.jstype.JSType current = it.next();
					if ((((((alternate.isUnknownType()) || (current.isUnknownType())) || (alternate.isNoResolvedType())) || (current.isNoResolvedType())) || (alternate.hasAnyTemplateTypes())) || (current.hasAnyTemplateTypes())) {
						if (alternate.isEquivalentTo(current)) {
							return com.google.javascript.rhino.jstype.UnionTypeBuilder.this;
						}
					}else {
						if ((alternate.isParameterizedType()) || (current.isParameterizedType())) {
							if (!(current.isParameterizedType())) {
								if (alternate.isSubtype(current)) {
									return com.google.javascript.rhino.jstype.UnionTypeBuilder.this;
								}
							}else
								if (!(alternate.isParameterizedType())) {
									if (current.isSubtype(alternate)) {
										removeCurrent = true;
									}
								}else {
									com.google.common.base.Preconditions.checkState(((current.isParameterizedType()) && (alternate.isParameterizedType())));
									com.google.javascript.rhino.jstype.ParameterizedType parameterizedAlternate = alternate.toMaybeParameterizedType();
									com.google.javascript.rhino.jstype.ParameterizedType parameterizedCurrent = current.toMaybeParameterizedType();
									if (parameterizedCurrent.wrapsSameRawType(parameterizedAlternate)) {
										com.google.javascript.rhino.jstype.JSType alternateTypeParameter = parameterizedAlternate.getParameterType();
										com.google.javascript.rhino.jstype.JSType currentTypeParameter = parameterizedCurrent.getParameterType();
										if (currentTypeParameter.isEquivalentTo(parameterizedCurrent)) {
											return com.google.javascript.rhino.jstype.UnionTypeBuilder.this;
										}else {
											com.google.javascript.rhino.jstype.JSType merged = parameterizedCurrent.getReferencedObjTypeInternal();
											return addAlternate(merged);
										}
									}
								}
							
						}else
							if (alternate.isSubtype(current)) {
								return com.google.javascript.rhino.jstype.UnionTypeBuilder.this;
							}else
								if (current.isSubtype(alternate)) {
									removeCurrent = true;
								}
							
						
					}
					if (removeCurrent) {
						it.remove();
						if (currentIndex == (functionTypePosition)) {
							functionTypePosition = -1;
						}else
							if (currentIndex < (functionTypePosition)) {
								(functionTypePosition)--;
								currentIndex--;
							}
						
					}
					currentIndex++;
				} 
				if (alternate.isFunctionType()) {
					com.google.common.base.Preconditions.checkState(((functionTypePosition) == (-1)));
					functionTypePosition = alternates.size();
				}
				alternates.add(alternate);
				result = null;
			}
		}else {
			result = null;
		}
		return com.google.javascript.rhino.jstype.UnionTypeBuilder.this;
	}

	private com.google.javascript.rhino.jstype.JSType reduceAlternatesWithoutUnion() {
		if (isAllType) {
			return registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE);
		}else
			if (isNativeUnknownType) {
				if (areAllUnknownsChecked) {
					return registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.CHECKED_UNKNOWN_TYPE);
				}else {
					return registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
				}
			}else {
				int size = alternates.size();
				if (size > (maxUnionSize)) {
					return registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
				}else
					if (size > 1) {
						return null;
					}else
						if (size == 1) {
							return alternates.iterator().next();
						}else {
							return registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
						}
					
				
			}
		
	}

	com.google.javascript.rhino.jstype.JSType build() {
		if ((result) == null) {
			result = reduceAlternatesWithoutUnion();
			if ((result) == null) {
				result = new com.google.javascript.rhino.jstype.UnionType(registry, getAlternateListCopy());
			}
		}
		return result;
	}

	private java.util.Collection<com.google.javascript.rhino.jstype.JSType> getAlternateListCopy() {
		return com.google.common.collect.ImmutableList.copyOf(alternates);
	}
}


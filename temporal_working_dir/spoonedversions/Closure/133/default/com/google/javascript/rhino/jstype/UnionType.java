

package com.google.javascript.rhino.jstype;


public class UnionType extends com.google.javascript.rhino.jstype.JSType {
	private static final long serialVersionUID = 1L;

	java.util.Collection<com.google.javascript.rhino.jstype.JSType> alternates;

	private int hashcode;

	UnionType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, java.util.Collection<com.google.javascript.rhino.jstype.JSType> alternates) {
		super(registry);
		com.google.javascript.rhino.jstype.UnionType.this.alternates = alternates;
		com.google.javascript.rhino.jstype.UnionType.this.hashcode = com.google.javascript.rhino.jstype.UnionType.this.alternates.hashCode();
	}

	public java.util.Collection<com.google.javascript.rhino.jstype.JSType> getAlternates() {
		for (com.google.javascript.rhino.jstype.JSType t : alternates) {
			if (t.isUnionType()) {
				rebuildAlternates();
				break;
			}
		}
		return alternates;
	}

	private void rebuildAlternates() {
		com.google.javascript.rhino.jstype.UnionTypeBuilder builder = new com.google.javascript.rhino.jstype.UnionTypeBuilder(registry);
		for (com.google.javascript.rhino.jstype.JSType alternate : alternates) {
			builder.addAlternate(alternate);
		}
		alternates = builder.getAlternates();
		hashcode = alternates.hashCode();
	}

	@java.lang.Override
	public boolean matchesNumberContext() {
		for (com.google.javascript.rhino.jstype.JSType t : alternates) {
			if (t.matchesNumberContext()) {
				return true;
			}
		}
		return false;
	}

	@java.lang.Override
	public boolean matchesStringContext() {
		for (com.google.javascript.rhino.jstype.JSType t : alternates) {
			if (t.matchesStringContext()) {
				return true;
			}
		}
		return false;
	}

	@java.lang.Override
	public boolean matchesObjectContext() {
		for (com.google.javascript.rhino.jstype.JSType t : alternates) {
			if (t.matchesObjectContext()) {
				return true;
			}
		}
		return false;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType findPropertyType(java.lang.String propertyName) {
		com.google.javascript.rhino.jstype.JSType propertyType = null;
		for (com.google.javascript.rhino.jstype.JSType alternate : getAlternates()) {
			if ((alternate.isNullType()) || (alternate.isVoidType())) {
				continue;
			}
			com.google.javascript.rhino.jstype.JSType altPropertyType = alternate.findPropertyType(propertyName);
			if (altPropertyType == null) {
				continue;
			}
			if (propertyType == null) {
				propertyType = altPropertyType;
			}else {
				propertyType = propertyType.getLeastSupertype(altPropertyType);
			}
		}
		return propertyType;
	}

	@java.lang.Override
	public boolean canBeCalled() {
		for (com.google.javascript.rhino.jstype.JSType t : alternates) {
			if (!(t.canBeCalled())) {
				return false;
			}
		}
		return true;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType autobox() {
		com.google.javascript.rhino.jstype.UnionTypeBuilder restricted = new com.google.javascript.rhino.jstype.UnionTypeBuilder(registry);
		for (com.google.javascript.rhino.jstype.JSType t : alternates) {
			restricted.addAlternate(t.autobox());
		}
		return restricted.build();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType restrictByNotNullOrUndefined() {
		com.google.javascript.rhino.jstype.UnionTypeBuilder restricted = new com.google.javascript.rhino.jstype.UnionTypeBuilder(registry);
		for (com.google.javascript.rhino.jstype.JSType t : alternates) {
			restricted.addAlternate(t.restrictByNotNullOrUndefined());
		}
		return restricted.build();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.TernaryValue testForEquality(com.google.javascript.rhino.jstype.JSType that) {
		com.google.javascript.rhino.jstype.TernaryValue result = null;
		for (com.google.javascript.rhino.jstype.JSType t : alternates) {
			com.google.javascript.rhino.jstype.TernaryValue test = t.testForEquality(that);
			if (result == null) {
				result = test;
			}else
				if (!(result.equals(test))) {
					return com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
				}
			
		}
		return result;
	}

	@java.lang.Override
	public boolean isNullable() {
		for (com.google.javascript.rhino.jstype.JSType t : alternates) {
			if (t.isNullable()) {
				return true;
			}
		}
		return false;
	}

	@java.lang.Override
	public boolean isUnknownType() {
		for (com.google.javascript.rhino.jstype.JSType t : alternates) {
			if (t.isUnknownType()) {
				return true;
			}
		}
		return false;
	}

	@java.lang.Override
	public boolean isStruct() {
		for (com.google.javascript.rhino.jstype.JSType typ : getAlternates()) {
			if (typ.isStruct()) {
				return true;
			}
		}
		return false;
	}

	@java.lang.Override
	public boolean isDict() {
		for (com.google.javascript.rhino.jstype.JSType typ : getAlternates()) {
			if (typ.isDict()) {
				return true;
			}
		}
		return false;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getLeastSupertype(com.google.javascript.rhino.jstype.JSType that) {
		if ((!(that.isUnknownType())) && (!(that.isUnionType()))) {
			for (com.google.javascript.rhino.jstype.JSType alternate : alternates) {
				if ((!(alternate.isUnknownType())) && (that.isSubtype(alternate))) {
					return com.google.javascript.rhino.jstype.UnionType.this;
				}
			}
		}
		return com.google.javascript.rhino.jstype.JSType.getLeastSupertype(com.google.javascript.rhino.jstype.UnionType.this, that);
	}

	com.google.javascript.rhino.jstype.JSType meet(com.google.javascript.rhino.jstype.JSType that) {
		com.google.javascript.rhino.jstype.UnionTypeBuilder builder = new com.google.javascript.rhino.jstype.UnionTypeBuilder(registry);
		for (com.google.javascript.rhino.jstype.JSType alternate : alternates) {
			if (alternate.isSubtype(that)) {
				builder.addAlternate(alternate);
			}
		}
		if (that.isUnionType()) {
			for (com.google.javascript.rhino.jstype.JSType otherAlternate : that.toMaybeUnionType().alternates) {
				if (otherAlternate.isSubtype(com.google.javascript.rhino.jstype.UnionType.this)) {
					builder.addAlternate(otherAlternate);
				}
			}
		}else
			if (that.isSubtype(com.google.javascript.rhino.jstype.UnionType.this)) {
				builder.addAlternate(that);
			}
		
		com.google.javascript.rhino.jstype.JSType result = builder.build();
		if (!(result.isNoType())) {
			return result;
		}else
			if ((com.google.javascript.rhino.jstype.UnionType.this.isObject()) && ((that.isObject()) && (!(that.isNoType())))) {
				return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE);
			}else {
				return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
			}
		
	}

	boolean checkUnionEquivalenceHelper(com.google.javascript.rhino.jstype.UnionType that, com.google.javascript.rhino.jstype.EquivalenceMethod eqMethod) {
		java.util.Collection<com.google.javascript.rhino.jstype.JSType> thatAlternates = that.getAlternates();
		if ((eqMethod == (com.google.javascript.rhino.jstype.EquivalenceMethod.IDENTITY)) && ((getAlternates().size()) != (thatAlternates.size()))) {
			return false;
		}
		for (com.google.javascript.rhino.jstype.JSType alternate : thatAlternates) {
			if (!(hasAlternate(alternate, eqMethod))) {
				return false;
			}
		}
		return true;
	}

	private boolean hasAlternate(com.google.javascript.rhino.jstype.JSType type, com.google.javascript.rhino.jstype.EquivalenceMethod eqMethod) {
		for (com.google.javascript.rhino.jstype.JSType alternate : getAlternates()) {
			if (alternate.checkEquivalenceHelper(type, eqMethod)) {
				return true;
			}
		}
		return false;
	}

	@java.lang.Override
	public boolean hasProperty(java.lang.String pname) {
		for (com.google.javascript.rhino.jstype.JSType alternate : alternates) {
			if (alternate.hasProperty(pname)) {
				return true;
			}
		}
		return false;
	}

	@java.lang.Override
	public int hashCode() {
		return com.google.javascript.rhino.jstype.UnionType.this.hashcode;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.UnionType toMaybeUnionType() {
		return com.google.javascript.rhino.jstype.UnionType.this;
	}

	@java.lang.Override
	public boolean isObject() {
		for (com.google.javascript.rhino.jstype.JSType alternate : alternates) {
			if (!(alternate.isObject())) {
				return false;
			}
		}
		return true;
	}

	public boolean contains(com.google.javascript.rhino.jstype.JSType type) {
		for (com.google.javascript.rhino.jstype.JSType alt : alternates) {
			if (alt.isEquivalentTo(type)) {
				return true;
			}
		}
		return false;
	}

	public com.google.javascript.rhino.jstype.JSType getRestrictedUnion(com.google.javascript.rhino.jstype.JSType type) {
		com.google.javascript.rhino.jstype.UnionTypeBuilder restricted = new com.google.javascript.rhino.jstype.UnionTypeBuilder(registry);
		for (com.google.javascript.rhino.jstype.JSType t : alternates) {
			if (((t.isUnknownType()) || (t.isNoResolvedType())) || (!(t.isSubtype(type)))) {
				restricted.addAlternate(t);
			}
		}
		return restricted.build();
	}

	@java.lang.Override
	java.lang.String toStringHelper(boolean forAnnotations) {
		java.lang.StringBuilder result = new java.lang.StringBuilder();
		boolean firstAlternate = true;
		result.append("(");
		java.util.SortedSet<com.google.javascript.rhino.jstype.JSType> sorted = new java.util.TreeSet<com.google.javascript.rhino.jstype.JSType>(com.google.javascript.rhino.jstype.JSType.ALPHA);
		sorted.addAll(alternates);
		for (com.google.javascript.rhino.jstype.JSType t : sorted) {
			if (!firstAlternate) {
				result.append("|");
			}
			result.append(t.toStringHelper(forAnnotations));
			firstAlternate = false;
		}
		result.append(")");
		return result.toString();
	}

	@java.lang.Override
	public boolean isSubtype(com.google.javascript.rhino.jstype.JSType that) {
		if (that.isUnknownType()) {
			return true;
		}
		if (that.isAllType()) {
			return true;
		}
		for (com.google.javascript.rhino.jstype.JSType element : alternates) {
			if (!(element.isSubtype(that))) {
				return false;
			}
		}
		return true;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getRestrictedTypeGivenToBooleanOutcome(boolean outcome) {
		com.google.javascript.rhino.jstype.UnionTypeBuilder restricted = new com.google.javascript.rhino.jstype.UnionTypeBuilder(registry);
		for (com.google.javascript.rhino.jstype.JSType element : alternates) {
			restricted.addAlternate(element.getRestrictedTypeGivenToBooleanOutcome(outcome));
		}
		return restricted.build();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.BooleanLiteralSet getPossibleToBooleanOutcomes() {
		com.google.javascript.rhino.jstype.BooleanLiteralSet literals = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
		for (com.google.javascript.rhino.jstype.JSType element : alternates) {
			literals = literals.union(element.getPossibleToBooleanOutcomes());
			if (literals == (com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH)) {
				break;
			}
		}
		return literals;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType.TypePair getTypesUnderEquality(com.google.javascript.rhino.jstype.JSType that) {
		com.google.javascript.rhino.jstype.UnionTypeBuilder thisRestricted = new com.google.javascript.rhino.jstype.UnionTypeBuilder(registry);
		com.google.javascript.rhino.jstype.UnionTypeBuilder thatRestricted = new com.google.javascript.rhino.jstype.UnionTypeBuilder(registry);
		for (com.google.javascript.rhino.jstype.JSType element : alternates) {
			com.google.javascript.rhino.jstype.JSType.TypePair p = element.getTypesUnderEquality(that);
			if ((p.typeA) != null) {
				thisRestricted.addAlternate(p.typeA);
			}
			if ((p.typeB) != null) {
				thatRestricted.addAlternate(p.typeB);
			}
		}
		return new com.google.javascript.rhino.jstype.JSType.TypePair(thisRestricted.build(), thatRestricted.build());
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType.TypePair getTypesUnderInequality(com.google.javascript.rhino.jstype.JSType that) {
		com.google.javascript.rhino.jstype.UnionTypeBuilder thisRestricted = new com.google.javascript.rhino.jstype.UnionTypeBuilder(registry);
		com.google.javascript.rhino.jstype.UnionTypeBuilder thatRestricted = new com.google.javascript.rhino.jstype.UnionTypeBuilder(registry);
		for (com.google.javascript.rhino.jstype.JSType element : alternates) {
			com.google.javascript.rhino.jstype.JSType.TypePair p = element.getTypesUnderInequality(that);
			if ((p.typeA) != null) {
				thisRestricted.addAlternate(p.typeA);
			}
			if ((p.typeB) != null) {
				thatRestricted.addAlternate(p.typeB);
			}
		}
		return new com.google.javascript.rhino.jstype.JSType.TypePair(thisRestricted.build(), thatRestricted.build());
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType.TypePair getTypesUnderShallowInequality(com.google.javascript.rhino.jstype.JSType that) {
		com.google.javascript.rhino.jstype.UnionTypeBuilder thisRestricted = new com.google.javascript.rhino.jstype.UnionTypeBuilder(registry);
		com.google.javascript.rhino.jstype.UnionTypeBuilder thatRestricted = new com.google.javascript.rhino.jstype.UnionTypeBuilder(registry);
		for (com.google.javascript.rhino.jstype.JSType element : alternates) {
			com.google.javascript.rhino.jstype.JSType.TypePair p = element.getTypesUnderShallowInequality(that);
			if ((p.typeA) != null) {
				thisRestricted.addAlternate(p.typeA);
			}
			if ((p.typeB) != null) {
				thatRestricted.addAlternate(p.typeB);
			}
		}
		return new com.google.javascript.rhino.jstype.JSType.TypePair(thisRestricted.build(), thatRestricted.build());
	}

	@java.lang.Override
	public <T> T visit(com.google.javascript.rhino.jstype.Visitor<T> visitor) {
		return visitor.caseUnionType(com.google.javascript.rhino.jstype.UnionType.this);
	}

	@java.lang.Override
	<T> T visit(com.google.javascript.rhino.jstype.RelationshipVisitor<T> visitor, com.google.javascript.rhino.jstype.JSType that) {
		return visitor.caseUnionType(com.google.javascript.rhino.jstype.UnionType.this, that);
	}

	@java.lang.Override
	com.google.javascript.rhino.jstype.JSType resolveInternal(com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope) {
		setResolvedTypeInternal(com.google.javascript.rhino.jstype.UnionType.this);
		boolean changed = false;
		com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.JSType> resolvedTypes = com.google.common.collect.ImmutableList.builder();
		for (com.google.javascript.rhino.jstype.JSType alternate : alternates) {
			com.google.javascript.rhino.jstype.JSType newAlternate = alternate.resolve(t, scope);
			changed |= alternate != newAlternate;
			resolvedTypes.add(alternate);
		}
		if (changed) {
			java.util.Collection<com.google.javascript.rhino.jstype.JSType> newAlternates = resolvedTypes.build();
			com.google.common.base.Preconditions.checkState(((newAlternates.hashCode()) == (com.google.javascript.rhino.jstype.UnionType.this.hashcode)));
			alternates = newAlternates;
		}
		return com.google.javascript.rhino.jstype.UnionType.this;
	}

	@java.lang.Override
	public java.lang.String toDebugHashCodeString() {
		java.util.List<java.lang.String> hashCodes = com.google.common.collect.Lists.newArrayList();
		for (com.google.javascript.rhino.jstype.JSType a : alternates) {
			hashCodes.add(a.toDebugHashCodeString());
		}
		return ("{(" + (com.google.common.base.Joiner.on(",").join(hashCodes))) + ")}";
	}

	@java.lang.Override
	public boolean setValidator(com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> validator) {
		for (com.google.javascript.rhino.jstype.JSType a : alternates) {
			a.setValidator(validator);
		}
		return true;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType collapseUnion() {
		com.google.javascript.rhino.jstype.JSType currentValue = null;
		com.google.javascript.rhino.jstype.ObjectType currentCommonSuper = null;
		for (com.google.javascript.rhino.jstype.JSType a : alternates) {
			if (a.isUnknownType()) {
				return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
			}
			com.google.javascript.rhino.jstype.ObjectType obj = a.toObjectType();
			if (obj == null) {
				if ((currentValue == null) && (currentCommonSuper == null)) {
					currentValue = a;
				}else {
					return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE);
				}
			}else
				if (currentValue != null) {
					return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE);
				}else
					if (currentCommonSuper == null) {
						currentCommonSuper = obj;
					}else {
						currentCommonSuper = registry.findCommonSuperObject(currentCommonSuper, obj);
					}
				
			
		}
		return currentCommonSuper;
	}

	@java.lang.Override
	public void matchConstraint(com.google.javascript.rhino.jstype.JSType constraint) {
		for (com.google.javascript.rhino.jstype.JSType alternate : alternates) {
			alternate.matchConstraint(constraint);
		}
	}

	@java.lang.Override
	public boolean hasAnyTemplateTypesInternal() {
		for (com.google.javascript.rhino.jstype.JSType alternate : alternates) {
			if (alternate.hasAnyTemplateTypes()) {
				return true;
			}
		}
		return false;
	}
}


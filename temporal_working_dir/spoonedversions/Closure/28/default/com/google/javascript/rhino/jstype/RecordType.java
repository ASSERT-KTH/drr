

package com.google.javascript.rhino.jstype;


class RecordType extends com.google.javascript.rhino.jstype.PrototypeObjectType {
	private static final long serialVersionUID = 1L;

	private final java.util.SortedMap<java.lang.String, com.google.javascript.rhino.jstype.JSType> properties = com.google.common.collect.Maps.newTreeMap();

	private boolean isFrozen = false;

	RecordType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty> properties) {
		super(registry, null, null);
		setPrettyPrint(true);
		for (java.lang.String property : properties.keySet()) {
			com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty prop = properties.get(property);
			if (prop == null) {
				throw new java.lang.IllegalStateException("RecordProperty associated with a property should not be null!");
			}
			defineDeclaredProperty(property, prop.getType(), prop.getPropertyNode());
		}
		isFrozen = true;
	}

	@java.lang.Override
	public boolean isEquivalentTo(com.google.javascript.rhino.jstype.JSType other) {
		if (!(other.isRecordType())) {
			return false;
		}
		com.google.javascript.rhino.jstype.RecordType otherRecord = other.toMaybeRecordType();
		if (otherRecord == (com.google.javascript.rhino.jstype.RecordType.this)) {
			return true;
		}
		java.util.Set<java.lang.String> keySet = properties.keySet();
		java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.JSType> otherProps = otherRecord.properties;
		if (!(otherProps.keySet().equals(keySet))) {
			return false;
		}
		for (java.lang.String key : keySet) {
			if (!(otherProps.get(key).isEquivalentTo(properties.get(key)))) {
				return false;
			}
		}
		return true;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.ObjectType getImplicitPrototype() {
		return registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE);
	}

	@java.lang.Override
	boolean defineProperty(java.lang.String propertyName, com.google.javascript.rhino.jstype.JSType type, boolean inferred, com.google.javascript.rhino.Node propertyNode) {
		if (isFrozen) {
			return false;
		}
		if (!inferred) {
			properties.put(propertyName, type);
		}
		return super.defineProperty(propertyName, type, inferred, propertyNode);
	}

	com.google.javascript.rhino.jstype.JSType getGreatestSubtypeHelper(com.google.javascript.rhino.jstype.JSType that) {
		if (that.isRecordType()) {
			com.google.javascript.rhino.jstype.RecordType thatRecord = that.toMaybeRecordType();
			com.google.javascript.rhino.jstype.RecordTypeBuilder builder = new com.google.javascript.rhino.jstype.RecordTypeBuilder(registry);
			for (java.lang.String property : properties.keySet()) {
				if ((thatRecord.hasProperty(property)) && (!(thatRecord.getPropertyType(property).isEquivalentTo(getPropertyType(property))))) {
					return registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
				}
				builder.addProperty(property, getPropertyType(property), getPropertyNode(property));
			}
			for (java.lang.String property : thatRecord.properties.keySet()) {
				if (!(hasProperty(property))) {
					builder.addProperty(property, thatRecord.getPropertyType(property), thatRecord.getPropertyNode(property));
				}
			}
			return builder.build();
		}
		com.google.javascript.rhino.jstype.JSType greatestSubtype = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE);
		com.google.javascript.rhino.jstype.JSType thatRestrictedToObj = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE).getGreatestSubtype(that);
		if (!(thatRestrictedToObj.isEmptyType())) {
			for (java.util.Map.Entry<java.lang.String, com.google.javascript.rhino.jstype.JSType> entry : properties.entrySet()) {
				java.lang.String propName = entry.getKey();
				com.google.javascript.rhino.jstype.JSType propType = entry.getValue();
				com.google.javascript.rhino.jstype.UnionTypeBuilder builder = new com.google.javascript.rhino.jstype.UnionTypeBuilder(registry);
				for (com.google.javascript.rhino.jstype.ObjectType alt : registry.getEachReferenceTypeWithProperty(propName)) {
					com.google.javascript.rhino.jstype.JSType altPropType = alt.getPropertyType(propName);
					if ((((altPropType != null) && (!(alt.isEquivalentTo(com.google.javascript.rhino.jstype.RecordType.this)))) && (alt.isSubtype(that))) && (((propType.isUnknownType()) || (altPropType.isUnknownType())) || (altPropType.isEquivalentTo(propType)))) {
						builder.addAlternate(alt);
					}
				}
				greatestSubtype = greatestSubtype.getLeastSupertype(builder.build());
			}
		}
		return greatestSubtype;
	}

	@java.lang.Override
	com.google.javascript.rhino.jstype.RecordType toMaybeRecordType() {
		return com.google.javascript.rhino.jstype.RecordType.this;
	}

	@java.lang.Override
	public boolean isSubtype(com.google.javascript.rhino.jstype.JSType that) {
		if (com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(com.google.javascript.rhino.jstype.RecordType.this, that)) {
			return true;
		}
		if (registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE).isSubtype(that)) {
			return true;
		}
		if (!(that.isRecordType())) {
			return false;
		}
		return com.google.javascript.rhino.jstype.RecordType.isSubtype(com.google.javascript.rhino.jstype.RecordType.this, that.toMaybeRecordType());
	}

	static boolean isSubtype(com.google.javascript.rhino.jstype.ObjectType typeA, com.google.javascript.rhino.jstype.RecordType typeB) {
		for (java.lang.String property : typeB.properties.keySet()) {
			if (!(typeA.hasProperty(property))) {
				return false;
			}
			com.google.javascript.rhino.jstype.JSType propA = typeA.getPropertyType(property);
			com.google.javascript.rhino.jstype.JSType propB = typeB.getPropertyType(property);
			if ((!(propA.isUnknownType())) && (!(propB.isUnknownType()))) {
				if (typeA.isPropertyTypeDeclared(property)) {
					if (!(propA.isEquivalentTo(propB))) {
						return false;
					}
				}else {
					if (!(propA.isSubtype(propB))) {
						return false;
					}
				}
			}
		}
		return true;
	}

	@java.lang.Override
	com.google.javascript.rhino.jstype.JSType resolveInternal(com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope) {
		for (java.util.Map.Entry<java.lang.String, com.google.javascript.rhino.jstype.JSType> entry : properties.entrySet()) {
			com.google.javascript.rhino.jstype.JSType type = entry.getValue();
			com.google.javascript.rhino.jstype.JSType resolvedType = type.resolve(t, scope);
			if (type != resolvedType) {
				properties.put(entry.getKey(), resolvedType);
			}
		}
		return super.resolveInternal(t, scope);
	}
}


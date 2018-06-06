

package com.google.javascript.rhino.jstype;


class RecordType extends com.google.javascript.rhino.jstype.PrototypeObjectType {
	private static final long serialVersionUID = 1L;

	private final boolean declared;

	private boolean isFrozen = false;

	RecordType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty> properties) {
		this(registry, properties, true);
	}

	RecordType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty> properties, boolean declared) {
		super(registry, null, null);
		setPrettyPrint(true);
		this.declared = declared;
		for (java.lang.String property : properties.keySet()) {
			com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty prop = properties.get(property);
			if (prop == null) {
				throw new java.lang.IllegalStateException("RecordProperty associated with a property should not be null!");
			}
			if (declared) {
				defineDeclaredProperty(property, prop.getType(), prop.getPropertyNode());
			}else {
				defineSynthesizedProperty(property, prop.getType(), prop.getPropertyNode());
			}
		}
		isFrozen = true;
	}

	boolean isSynthetic() {
		return !(declared);
	}

	boolean checkRecordEquivalenceHelper(com.google.javascript.rhino.jstype.RecordType otherRecord, com.google.javascript.rhino.jstype.EquivalenceMethod eqMethod) {
		java.util.Set<java.lang.String> keySet = getOwnPropertyNames();
		java.util.Set<java.lang.String> otherKeySet = otherRecord.getOwnPropertyNames();
		if (!(otherKeySet.equals(keySet))) {
			return false;
		}
		for (java.lang.String key : keySet) {
			if (!(otherRecord.getPropertyType(key).checkEquivalenceHelper(getPropertyType(key), eqMethod))) {
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
		return super.defineProperty(propertyName, type, inferred, propertyNode);
	}

	com.google.javascript.rhino.jstype.JSType getGreatestSubtypeHelper(com.google.javascript.rhino.jstype.JSType that) {
		if (that.isRecordType()) {
			com.google.javascript.rhino.jstype.RecordType thatRecord = that.toMaybeRecordType();
			com.google.javascript.rhino.jstype.RecordTypeBuilder builder = new com.google.javascript.rhino.jstype.RecordTypeBuilder(registry);
			builder.setSynthesized(true);
			for (java.lang.String property : getOwnPropertyNames()) {
				if ((thatRecord.hasProperty(property)) && (!(thatRecord.getPropertyType(property).isInvariant(getPropertyType(property))))) {
					return registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
				}
				builder.addProperty(property, getPropertyType(property), getPropertyNode(property));
			}
			for (java.lang.String property : thatRecord.getOwnPropertyNames()) {
				if (!(hasProperty(property))) {
					builder.addProperty(property, thatRecord.getPropertyType(property), thatRecord.getPropertyNode(property));
				}
			}
			return builder.build();
		}
		com.google.javascript.rhino.jstype.JSType greatestSubtype = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE);
		com.google.javascript.rhino.jstype.JSType thatRestrictedToObj = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE).getGreatestSubtype(that);
		if (!(thatRestrictedToObj.isEmptyType())) {
			for (java.lang.String propName : getOwnPropertyNames()) {
				com.google.javascript.rhino.jstype.JSType propType = getPropertyType(propName);
				com.google.javascript.rhino.jstype.UnionTypeBuilder builder = new com.google.javascript.rhino.jstype.UnionTypeBuilder(registry);
				for (com.google.javascript.rhino.jstype.ObjectType alt : registry.getEachReferenceTypeWithProperty(propName)) {
					com.google.javascript.rhino.jstype.JSType altPropType = alt.getPropertyType(propName);
					if ((((altPropType != null) && (!(alt.isEquivalentTo(com.google.javascript.rhino.jstype.RecordType.this)))) && (alt.isSubtype(that))) && (propType.isInvariant(altPropType))) {
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
		for (java.lang.String property : typeB.getOwnPropertyNames()) {
			if (!(typeA.hasProperty(property))) {
				return false;
			}
			com.google.javascript.rhino.jstype.JSType propA = typeA.getPropertyType(property);
			com.google.javascript.rhino.jstype.JSType propB = typeB.getPropertyType(property);
			if (typeA.isPropertyTypeDeclared(property)) {
				if (!(propA.isInvariant(propB))) {
					return false;
				}
			}else {
				if (!(propA.isSubtype(propB))) {
					return false;
				}
			}
		}
		return true;
	}
}


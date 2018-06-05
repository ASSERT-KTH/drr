

package com.google.javascript.rhino.jstype;


class PrototypeObjectType extends com.google.javascript.rhino.jstype.ObjectType {
	private static final long serialVersionUID = 1L;

	private final java.lang.String className;

	private final java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.ObjectType.Property> properties;

	private final boolean nativeType;

	private com.google.javascript.rhino.jstype.ObjectType implicitPrototypeFallback;

	private com.google.javascript.rhino.jstype.FunctionType ownerFunction = null;

	private boolean prettyPrint = false;

	private static final int MAX_PRETTY_PRINTED_PROPERTIES = 4;

	PrototypeObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, java.lang.String className, com.google.javascript.rhino.jstype.ObjectType implicitPrototype) {
		this(registry, className, implicitPrototype, false);
	}

	PrototypeObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, java.lang.String className, com.google.javascript.rhino.jstype.ObjectType implicitPrototype, boolean nativeType) {
		super(registry);
		this.properties = com.google.common.collect.Maps.newTreeMap();
		this.className = className;
		this.nativeType = nativeType;
		if (nativeType || (implicitPrototype != null)) {
			setImplicitPrototype(implicitPrototype);
		}else {
			setImplicitPrototype(registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE));
		}
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.ObjectType.Property getSlot(java.lang.String name) {
		if (properties.containsKey(name)) {
			return properties.get(name);
		}
		com.google.javascript.rhino.jstype.ObjectType implicitPrototype = getImplicitPrototype();
		if (implicitPrototype != null) {
			com.google.javascript.rhino.jstype.ObjectType.Property prop = implicitPrototype.getSlot(name);
			if (prop != null) {
				return prop;
			}
		}
		for (com.google.javascript.rhino.jstype.ObjectType interfaceType : getCtorExtendedInterfaces()) {
			com.google.javascript.rhino.jstype.ObjectType.Property prop = interfaceType.getSlot(name);
			if (prop != null) {
				return prop;
			}
		}
		return null;
	}

	@java.lang.Override
	public int getPropertiesCount() {
		com.google.javascript.rhino.jstype.ObjectType implicitPrototype = getImplicitPrototype();
		if (implicitPrototype == null) {
			return com.google.javascript.rhino.jstype.PrototypeObjectType.this.properties.size();
		}
		int localCount = 0;
		for (java.lang.String property : properties.keySet()) {
			if (!(implicitPrototype.hasProperty(property))) {
				localCount++;
			}
		}
		return (implicitPrototype.getPropertiesCount()) + localCount;
	}

	@java.lang.Override
	public boolean hasProperty(java.lang.String propertyName) {
		return (isUnknownType()) || ((getSlot(propertyName)) != null);
	}

	@java.lang.Override
	public boolean hasOwnProperty(java.lang.String propertyName) {
		return (properties.get(propertyName)) != null;
	}

	@java.lang.Override
	public java.util.Set<java.lang.String> getOwnPropertyNames() {
		return properties.keySet();
	}

	@java.lang.Override
	public boolean isPropertyTypeDeclared(java.lang.String property) {
		com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> slot = getSlot(property);
		if (slot == null) {
			return false;
		}
		return !(slot.isTypeInferred());
	}

	@java.lang.Override
	void collectPropertyNames(java.util.Set<java.lang.String> props) {
		for (java.lang.String prop : properties.keySet()) {
			props.add(prop);
		}
		com.google.javascript.rhino.jstype.ObjectType implicitPrototype = getImplicitPrototype();
		if (implicitPrototype != null) {
			implicitPrototype.collectPropertyNames(props);
		}
	}

	@java.lang.Override
	public boolean isPropertyTypeInferred(java.lang.String property) {
		com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> slot = getSlot(property);
		if (slot == null) {
			return false;
		}
		return slot.isTypeInferred();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getPropertyType(java.lang.String property) {
		com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> slot = getSlot(property);
		if (slot == null) {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
		}
		return slot.getType();
	}

	@java.lang.Override
	public boolean isPropertyInExterns(java.lang.String propertyName) {
		com.google.javascript.rhino.jstype.ObjectType.Property p = properties.get(propertyName);
		if (p != null) {
			return p.isFromExterns();
		}
		com.google.javascript.rhino.jstype.ObjectType implicitPrototype = getImplicitPrototype();
		if (implicitPrototype != null) {
			return implicitPrototype.isPropertyInExterns(propertyName);
		}
		return false;
	}

	@java.lang.Override
	boolean defineProperty(java.lang.String name, com.google.javascript.rhino.jstype.JSType type, boolean inferred, com.google.javascript.rhino.Node propertyNode) {
		if (hasOwnDeclaredProperty(name)) {
			return false;
		}
		com.google.javascript.rhino.jstype.ObjectType.Property newProp = new com.google.javascript.rhino.jstype.ObjectType.Property(name, type, inferred, propertyNode);
		com.google.javascript.rhino.jstype.ObjectType.Property oldProp = properties.get(name);
		if (oldProp != null) {
			newProp.setJSDocInfo(oldProp.getJSDocInfo());
		}
		properties.put(name, newProp);
		return true;
	}

	@java.lang.Override
	public boolean removeProperty(java.lang.String name) {
		return (properties.remove(name)) != null;
	}

	@java.lang.Override
	public com.google.javascript.rhino.Node getPropertyNode(java.lang.String propertyName) {
		com.google.javascript.rhino.jstype.ObjectType.Property p = properties.get(propertyName);
		if (p != null) {
			return p.getNode();
		}
		com.google.javascript.rhino.jstype.ObjectType implicitPrototype = getImplicitPrototype();
		if (implicitPrototype != null) {
			return implicitPrototype.getPropertyNode(propertyName);
		}
		return null;
	}

	@java.lang.Override
	public com.google.javascript.rhino.JSDocInfo getOwnPropertyJSDocInfo(java.lang.String propertyName) {
		com.google.javascript.rhino.jstype.ObjectType.Property p = properties.get(propertyName);
		if (p != null) {
			return p.getJSDocInfo();
		}
		return null;
	}

	@java.lang.Override
	public void setPropertyJSDocInfo(java.lang.String propertyName, com.google.javascript.rhino.JSDocInfo info) {
		if (info != null) {
			if (!(properties.containsKey(propertyName))) {
				defineInferredProperty(propertyName, getPropertyType(propertyName), null);
			}
			com.google.javascript.rhino.jstype.ObjectType.Property property = properties.get(propertyName);
			if (property != null) {
				property.setJSDocInfo(info);
			}
		}
	}

	@java.lang.Override
	public boolean matchesNumberContext() {
		return ((((isNumberObjectType()) || (isDateType())) || (isBooleanObjectType())) || (isStringObjectType())) || (hasOverridenNativeProperty("valueOf"));
	}

	@java.lang.Override
	public boolean matchesStringContext() {
		return (((((((isTheObjectType()) || (isStringObjectType())) || (isDateType())) || (isRegexpType())) || (isArrayType())) || (isNumberObjectType())) || (isBooleanObjectType())) || (hasOverridenNativeProperty("toString"));
	}

	private boolean hasOverridenNativeProperty(java.lang.String propertyName) {
		if (isNativeObjectType()) {
			return false;
		}
		com.google.javascript.rhino.jstype.JSType propertyType = getPropertyType(propertyName);
		com.google.javascript.rhino.jstype.ObjectType nativeType = com.google.javascript.rhino.jstype.PrototypeObjectType.this.isFunctionType() ? registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_PROTOTYPE) : registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_PROTOTYPE);
		com.google.javascript.rhino.jstype.JSType nativePropertyType = nativeType.getPropertyType(propertyName);
		return propertyType != nativePropertyType;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType unboxesTo() {
		if (isStringObjectType()) {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
		}else
			if (isBooleanObjectType()) {
				return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE);
			}else
				if (isNumberObjectType()) {
					return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
				}else {
					return super.unboxesTo();
				}
			
		
	}

	@java.lang.Override
	public boolean matchesObjectContext() {
		return true;
	}

	@java.lang.Override
	public boolean canBeCalled() {
		return isRegexpType();
	}

	@java.lang.Override
	java.lang.String toStringHelper(boolean forAnnotations) {
		if (hasReferenceName()) {
			return getReferenceName();
		}else
			if (prettyPrint) {
				prettyPrint = false;
				java.util.Set<java.lang.String> propertyNames = com.google.common.collect.Sets.newTreeSet();
				for (com.google.javascript.rhino.jstype.ObjectType current = com.google.javascript.rhino.jstype.PrototypeObjectType.this; ((current != null) && (!(current.isNativeObjectType()))) && ((propertyNames.size()) <= (com.google.javascript.rhino.jstype.PrototypeObjectType.MAX_PRETTY_PRINTED_PROPERTIES)); current = current.getImplicitPrototype()) {
					propertyNames.addAll(current.getOwnPropertyNames());
				}
				java.lang.StringBuilder sb = new java.lang.StringBuilder();
				sb.append("{");
				int i = 0;
				for (java.lang.String property : propertyNames) {
					if (i > 0) {
						sb.append(", ");
					}
					sb.append(property);
					sb.append(": ");
					sb.append(getPropertyType(property).toStringHelper(forAnnotations));
					++i;
					if ((!forAnnotations) && (i == (com.google.javascript.rhino.jstype.PrototypeObjectType.MAX_PRETTY_PRINTED_PROPERTIES))) {
						sb.append(", ...");
						break;
					}
				}
				sb.append("}");
				prettyPrint = true;
				return sb.toString();
			}else {
				return forAnnotations ? "?" : "{...}";
			}
		
	}

	void setPrettyPrint(boolean prettyPrint) {
		com.google.javascript.rhino.jstype.PrototypeObjectType.this.prettyPrint = prettyPrint;
	}

	boolean isPrettyPrint() {
		return prettyPrint;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.FunctionType getConstructor() {
		return null;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.ObjectType getImplicitPrototype() {
		return implicitPrototypeFallback;
	}

	final void setImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType implicitPrototype) {
		com.google.common.base.Preconditions.checkState((!(hasCachedValues())));
		com.google.javascript.rhino.jstype.PrototypeObjectType.this.implicitPrototypeFallback = implicitPrototype;
	}

	@java.lang.Override
	public java.lang.String getReferenceName() {
		if ((className) != null) {
			return className;
		}else
			if ((ownerFunction) != null) {
				return (ownerFunction.getReferenceName()) + ".prototype";
			}else {
				return null;
			}
		
	}

	@java.lang.Override
	public boolean hasReferenceName() {
		return ((className) != null) || ((ownerFunction) != null);
	}

	@java.lang.Override
	public boolean isSubtype(com.google.javascript.rhino.jstype.JSType that) {
		if (com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(com.google.javascript.rhino.jstype.PrototypeObjectType.this, that)) {
			return true;
		}
		if (that.isUnionType()) {
			return false;
		}
		if (that.isRecordType()) {
			return com.google.javascript.rhino.jstype.RecordType.isSubtype(com.google.javascript.rhino.jstype.PrototypeObjectType.this, that.toMaybeRecordType());
		}
		com.google.javascript.rhino.jstype.ObjectType thatObj = that.toObjectType();
		com.google.javascript.rhino.jstype.ObjectType thatCtor = thatObj == null ? null : thatObj.getConstructor();
		if ((thatCtor != null) && (thatCtor.isInterface())) {
			java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> thisInterfaces = getCtorImplementedInterfaces();
			for (com.google.javascript.rhino.jstype.ObjectType thisInterface : thisInterfaces) {
				if (thisInterface.isSubtype(that)) {
					return true;
				}
			}
		}
		if (((getConstructor()) != null) && (getConstructor().isInterface())) {
			for (com.google.javascript.rhino.jstype.ObjectType thisInterface : getCtorExtendedInterfaces()) {
				if (thisInterface.isSubtype(that)) {
					return true;
				}
			}
		}
		if ((isUnknownType()) || (implicitPrototypeChainIsUnknown())) {
			return true;
		}
		return com.google.javascript.rhino.jstype.PrototypeObjectType.this.isImplicitPrototype(thatObj);
	}

	private boolean implicitPrototypeChainIsUnknown() {
		com.google.javascript.rhino.jstype.ObjectType p = getImplicitPrototype();
		while (p != null) {
			if (p.isUnknownType()) {
				return true;
			}
			p = p.getImplicitPrototype();
		} 
		return false;
	}

	@java.lang.Override
	public boolean hasCachedValues() {
		return super.hasCachedValues();
	}

	@java.lang.Override
	public boolean isNativeObjectType() {
		return nativeType;
	}

	@java.lang.Override
	void setOwnerFunction(com.google.javascript.rhino.jstype.FunctionType type) {
		com.google.common.base.Preconditions.checkState((((ownerFunction) == null) || (type == null)));
		ownerFunction = type;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.FunctionType getOwnerFunction() {
		return ownerFunction;
	}

	@java.lang.Override
	public java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> getCtorImplementedInterfaces() {
		return isFunctionPrototypeType() ? getOwnerFunction().getImplementedInterfaces() : com.google.common.collect.ImmutableList.<com.google.javascript.rhino.jstype.ObjectType>of();
	}

	@java.lang.Override
	public java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> getCtorExtendedInterfaces() {
		return isFunctionPrototypeType() ? getOwnerFunction().getExtendedInterfaces() : com.google.common.collect.ImmutableList.<com.google.javascript.rhino.jstype.ObjectType>of();
	}

	@java.lang.Override
	com.google.javascript.rhino.jstype.JSType resolveInternal(com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope) {
		setResolvedTypeInternal(com.google.javascript.rhino.jstype.PrototypeObjectType.this);
		com.google.javascript.rhino.jstype.ObjectType implicitPrototype = getImplicitPrototype();
		if (implicitPrototype != null) {
			implicitPrototypeFallback = ((com.google.javascript.rhino.jstype.ObjectType) (implicitPrototype.resolve(t, scope)));
		}
		for (com.google.javascript.rhino.jstype.ObjectType.Property prop : properties.values()) {
			prop.setType(com.google.javascript.rhino.jstype.JSType.safeResolve(prop.getType(), t, scope));
		}
		return com.google.javascript.rhino.jstype.PrototypeObjectType.this;
	}

	@java.lang.Override
	public void matchConstraint(com.google.javascript.rhino.jstype.JSType constraint) {
		if (hasReferenceName()) {
			return ;
		}
		if (constraint.isRecordType()) {
			matchRecordTypeConstraint(constraint.toObjectType());
		}else
			if (constraint.isUnionType()) {
				for (com.google.javascript.rhino.jstype.JSType alt : constraint.toMaybeUnionType().getAlternates()) {
					if (alt.isRecordType()) {
						matchRecordTypeConstraint(alt.toObjectType());
					}
				}
			}
		
	}

	public void matchRecordTypeConstraint(com.google.javascript.rhino.jstype.ObjectType constraintObj) {
		for (java.lang.String prop : constraintObj.getOwnPropertyNames()) {
			com.google.javascript.rhino.jstype.JSType propType = constraintObj.getPropertyType(prop);
			if (!(isPropertyTypeDeclared(prop))) {
				com.google.javascript.rhino.jstype.JSType typeToInfer = propType;
				if (!(hasProperty(prop))) {
					typeToInfer = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE).getLeastSupertype(propType);
				}
				defineInferredProperty(prop, typeToInfer, null);
			}
		}
	}
}


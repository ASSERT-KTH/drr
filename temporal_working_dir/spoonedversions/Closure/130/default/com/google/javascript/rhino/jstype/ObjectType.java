

package com.google.javascript.rhino.jstype;


public abstract class ObjectType extends com.google.javascript.rhino.jstype.JSType implements com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> {
	private boolean visited;

	private com.google.javascript.rhino.JSDocInfo docInfo = null;

	private boolean unknown = true;

	ObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
		super(registry);
	}

	ObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, com.google.javascript.rhino.jstype.TemplateTypeMap templateTypeMap) {
		super(registry, templateTypeMap);
	}

	@java.lang.Override
	public com.google.javascript.rhino.Node getRootNode() {
		return null;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.ObjectType getParentScope() {
		return getImplicitPrototype();
	}

	com.google.javascript.rhino.jstype.PropertyMap getPropertyMap() {
		return com.google.javascript.rhino.jstype.PropertyMap.immutableEmptyMap();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.Property getSlot(java.lang.String name) {
		return getPropertyMap().getSlot(name);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.Property getOwnSlot(java.lang.String name) {
		return getPropertyMap().getOwnProperty(name);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getTypeOfThis() {
		return null;
	}

	public com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSType> getTemplateTypes() {
		return null;
	}

	@java.lang.Override
	public com.google.javascript.rhino.JSDocInfo getJSDocInfo() {
		return docInfo;
	}

	public void setJSDocInfo(com.google.javascript.rhino.JSDocInfo info) {
		docInfo = info;
	}

	final boolean detectImplicitPrototypeCycle() {
		com.google.javascript.rhino.jstype.ObjectType.this.visited = true;
		com.google.javascript.rhino.jstype.ObjectType p = getImplicitPrototype();
		while (p != null) {
			if (p.visited) {
				return true;
			}else {
				p.visited = true;
			}
			p = p.getImplicitPrototype();
		} 
		p = com.google.javascript.rhino.jstype.ObjectType.this;
		do {
			p.visited = false;
			p = p.getImplicitPrototype();
		} while (p != null );
		return false;
	}

	final boolean detectInheritanceCycle() {
		return ((detectImplicitPrototypeCycle()) || (com.google.common.collect.Iterables.contains(com.google.javascript.rhino.jstype.ObjectType.this.getCtorImplementedInterfaces(), com.google.javascript.rhino.jstype.ObjectType.this))) || (com.google.common.collect.Iterables.contains(com.google.javascript.rhino.jstype.ObjectType.this.getCtorExtendedInterfaces(), com.google.javascript.rhino.jstype.ObjectType.this));
	}

	public abstract java.lang.String getReferenceName();

	public java.lang.String getNormalizedReferenceName() {
		java.lang.String name = getReferenceName();
		if (name != null) {
			int pos = name.indexOf("(");
			if (pos != (-1)) {
				return name.substring(0, pos);
			}
		}
		return name;
	}

	@java.lang.Override
	public java.lang.String getDisplayName() {
		return getNormalizedReferenceName();
	}

	public static java.lang.String createDelegateSuffix(java.lang.String suffix) {
		return ("(" + suffix) + ")";
	}

	public boolean hasReferenceName() {
		return false;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.TernaryValue testForEquality(com.google.javascript.rhino.jstype.JSType that) {
		com.google.javascript.rhino.jstype.TernaryValue result = super.testForEquality(that);
		if (result != null) {
			return result;
		}
		if (that.isSubtype(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_NUMBER_STRING_BOOLEAN))) {
			return com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
		}else {
			return com.google.javascript.rhino.jstype.TernaryValue.FALSE;
		}
	}

	public abstract com.google.javascript.rhino.jstype.FunctionType getConstructor();

	public abstract com.google.javascript.rhino.jstype.ObjectType getImplicitPrototype();

	public final boolean defineDeclaredProperty(java.lang.String propertyName, com.google.javascript.rhino.jstype.JSType type, com.google.javascript.rhino.Node propertyNode) {
		boolean result = defineProperty(propertyName, type, false, propertyNode);
		registry.registerPropertyOnType(propertyName, com.google.javascript.rhino.jstype.ObjectType.this);
		return result;
	}

	public final boolean defineSynthesizedProperty(java.lang.String propertyName, com.google.javascript.rhino.jstype.JSType type, com.google.javascript.rhino.Node propertyNode) {
		return defineProperty(propertyName, type, false, propertyNode);
	}

	public final boolean defineInferredProperty(java.lang.String propertyName, com.google.javascript.rhino.jstype.JSType type, com.google.javascript.rhino.Node propertyNode) {
		com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> originalSlot = getSlot(propertyName);
		if (hasProperty(propertyName)) {
			if (isPropertyTypeDeclared(propertyName)) {
				return true;
			}
			com.google.javascript.rhino.jstype.JSType originalType = getPropertyType(propertyName);
			type = (originalType == null) ? type : originalType.getLeastSupertype(type);
		}
		boolean result = defineProperty(propertyName, type, true, propertyNode);
		registry.registerPropertyOnType(propertyName, com.google.javascript.rhino.jstype.ObjectType.this);
		return result;
	}

	abstract boolean defineProperty(java.lang.String propertyName, com.google.javascript.rhino.jstype.JSType type, boolean inferred, com.google.javascript.rhino.Node propertyNode);

	public boolean removeProperty(java.lang.String propertyName) {
		return false;
	}

	public com.google.javascript.rhino.Node getPropertyNode(java.lang.String propertyName) {
		com.google.javascript.rhino.jstype.Property p = getSlot(propertyName);
		return p == null ? null : p.getNode();
	}

	public com.google.javascript.rhino.JSDocInfo getOwnPropertyJSDocInfo(java.lang.String propertyName) {
		com.google.javascript.rhino.jstype.Property p = getOwnSlot(propertyName);
		return p == null ? null : p.getJSDocInfo();
	}

	public void setPropertyJSDocInfo(java.lang.String propertyName, com.google.javascript.rhino.JSDocInfo info) {
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType findPropertyType(java.lang.String propertyName) {
		return hasProperty(propertyName) ? getPropertyType(propertyName) : null;
	}

	public com.google.javascript.rhino.jstype.JSType getPropertyType(java.lang.String propertyName) {
		com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> slot = getSlot(propertyName);
		if (slot == null) {
			if ((isNoResolvedType()) || (isCheckedUnknownType())) {
				return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.CHECKED_UNKNOWN_TYPE);
			}else
				if (isEmptyType()) {
					return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
				}
			
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
		}
		return slot.getType();
	}

	@java.lang.Override
	public boolean hasProperty(java.lang.String propertyName) {
		return ((isEmptyType()) || (isUnknownType())) || ((getSlot(propertyName)) != null);
	}

	public boolean hasOwnProperty(java.lang.String propertyName) {
		return (getOwnSlot(propertyName)) != null;
	}

	public java.util.Set<java.lang.String> getOwnPropertyNames() {
		return getPropertyMap().getOwnPropertyNames();
	}

	public boolean isPropertyTypeInferred(java.lang.String propertyName) {
		com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> slot = getSlot(propertyName);
		return slot == null ? false : slot.isTypeInferred();
	}

	public boolean isPropertyTypeDeclared(java.lang.String propertyName) {
		com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> slot = getSlot(propertyName);
		return slot == null ? false : !(slot.isTypeInferred());
	}

	final boolean hasOwnDeclaredProperty(java.lang.String name) {
		return (hasOwnProperty(name)) && (isPropertyTypeDeclared(name));
	}

	public boolean isPropertyInExterns(java.lang.String propertyName) {
		com.google.javascript.rhino.jstype.Property p = getSlot(propertyName);
		return p == null ? false : p.isFromExterns();
	}

	public int getPropertiesCount() {
		return getPropertyMap().getPropertiesCount();
	}

	public java.util.Set<java.lang.String> getPropertyNames() {
		java.util.Set<java.lang.String> props = com.google.common.collect.Sets.newTreeSet();
		collectPropertyNames(props);
		return props;
	}

	final void collectPropertyNames(java.util.Set<java.lang.String> props) {
		getPropertyMap().collectPropertyNames(props);
	}

	@java.lang.Override
	public <T> T visit(com.google.javascript.rhino.jstype.Visitor<T> visitor) {
		return visitor.caseObjectType(com.google.javascript.rhino.jstype.ObjectType.this);
	}

	@java.lang.Override
	<T> T visit(com.google.javascript.rhino.jstype.RelationshipVisitor<T> visitor, com.google.javascript.rhino.jstype.JSType that) {
		return visitor.caseObjectType(com.google.javascript.rhino.jstype.ObjectType.this, that);
	}

	final boolean isImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType prototype) {
		for (com.google.javascript.rhino.jstype.ObjectType current = com.google.javascript.rhino.jstype.ObjectType.this; current != null; current = current.getImplicitPrototype()) {
			if (current.isEquivalentTo(prototype)) {
				return true;
			}
		}
		return false;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.BooleanLiteralSet getPossibleToBooleanOutcomes() {
		return com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
	}

	@java.lang.Override
	public boolean isUnknownType() {
		if (unknown) {
			com.google.javascript.rhino.jstype.ObjectType implicitProto = getImplicitPrototype();
			if ((implicitProto == null) || (implicitProto.isNativeObjectType())) {
				unknown = false;
				for (com.google.javascript.rhino.jstype.ObjectType interfaceType : getCtorExtendedInterfaces()) {
					if (interfaceType.isUnknownType()) {
						unknown = true;
						break;
					}
				}
			}else {
				unknown = implicitProto.isUnknownType();
			}
		}
		return unknown;
	}

	@java.lang.Override
	public boolean isObject() {
		return true;
	}

	public boolean hasCachedValues() {
		return !(unknown);
	}

	public void clearCachedValues() {
		unknown = true;
	}

	public boolean isNativeObjectType() {
		return false;
	}

	public static com.google.javascript.rhino.jstype.ObjectType cast(com.google.javascript.rhino.jstype.JSType type) {
		return type == null ? null : type.toObjectType();
	}

	@java.lang.Override
	public final boolean isFunctionPrototypeType() {
		return (getOwnerFunction()) != null;
	}

	public com.google.javascript.rhino.jstype.FunctionType getOwnerFunction() {
		return null;
	}

	void setOwnerFunction(com.google.javascript.rhino.jstype.FunctionType type) {
	}

	public java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> getCtorImplementedInterfaces() {
		return com.google.common.collect.ImmutableSet.of();
	}

	public java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> getCtorExtendedInterfaces() {
		return com.google.common.collect.ImmutableSet.of();
	}
}


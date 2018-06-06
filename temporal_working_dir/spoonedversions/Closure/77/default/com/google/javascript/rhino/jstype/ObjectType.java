

package com.google.javascript.rhino.jstype;


public abstract class ObjectType extends com.google.javascript.rhino.jstype.JSType {
	private boolean visited;

	private com.google.javascript.rhino.JSDocInfo docInfo = null;

	private boolean unknown = true;

	ObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
		super(registry);
	}

	public com.google.javascript.rhino.jstype.JSType getParameterType() {
		return null;
	}

	public com.google.javascript.rhino.jstype.JSType getIndexType() {
		return null;
	}

	@java.lang.Override
	public com.google.javascript.rhino.JSDocInfo getJSDocInfo() {
		if ((docInfo) != null) {
			return docInfo;
		}else
			if ((getImplicitPrototype()) != null) {
				return getImplicitPrototype().getJSDocInfo();
			}else {
				return super.getJSDocInfo();
			}
		
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

	public final boolean defineDeclaredProperty(java.lang.String propertyName, com.google.javascript.rhino.jstype.JSType type, boolean inExterns, com.google.javascript.rhino.Node propertyNode) {
		boolean result = defineProperty(propertyName, type, false, inExterns, propertyNode);
		registry.registerPropertyOnType(propertyName, com.google.javascript.rhino.jstype.ObjectType.this);
		return result;
	}

	public final boolean defineInferredProperty(java.lang.String propertyName, com.google.javascript.rhino.jstype.JSType type, boolean inExterns, com.google.javascript.rhino.Node propertyNode) {
		if (hasProperty(propertyName)) {
			com.google.javascript.rhino.jstype.JSType originalType = getPropertyType(propertyName);
			type = (originalType == null) ? type : originalType.getLeastSupertype(type);
		}
		boolean result = defineProperty(propertyName, type, true, inExterns, propertyNode);
		registry.registerPropertyOnType(propertyName, com.google.javascript.rhino.jstype.ObjectType.this);
		return result;
	}

	abstract boolean defineProperty(java.lang.String propertyName, com.google.javascript.rhino.jstype.JSType type, boolean inferred, boolean inExterns, com.google.javascript.rhino.Node propertyNode);

	public com.google.javascript.rhino.Node getPropertyNode(java.lang.String propertyName) {
		return null;
	}

	public com.google.javascript.rhino.JSDocInfo getOwnPropertyJSDocInfo(java.lang.String propertyName) {
		return null;
	}

	public void setPropertyJSDocInfo(java.lang.String propertyName, com.google.javascript.rhino.JSDocInfo info, boolean inExterns) {
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType findPropertyType(java.lang.String propertyName) {
		return hasProperty(propertyName) ? getPropertyType(propertyName) : null;
	}

	public abstract com.google.javascript.rhino.jstype.JSType getPropertyType(java.lang.String propertyName);

	public abstract boolean hasProperty(java.lang.String propertyName);

	public boolean hasOwnProperty(java.lang.String propertyName) {
		return hasProperty(propertyName);
	}

	public java.util.Set<java.lang.String> getOwnPropertyNames() {
		return com.google.common.collect.ImmutableSet.of();
	}

	public abstract boolean isPropertyTypeInferred(java.lang.String propertyName);

	public abstract boolean isPropertyTypeDeclared(java.lang.String propertyName);

	boolean hasOwnDeclaredProperty(java.lang.String name) {
		return (hasOwnProperty(name)) && (isPropertyTypeDeclared(name));
	}

	public boolean isPropertyInExterns(java.lang.String propertyName) {
		return false;
	}

	public abstract int getPropertiesCount();

	public java.util.Set<java.lang.String> getPropertyNames() {
		java.util.Set<java.lang.String> props = com.google.common.collect.Sets.newTreeSet();
		collectPropertyNames(props);
		return props;
	}

	abstract void collectPropertyNames(java.util.Set<java.lang.String> props);

	@java.lang.Override
	public <T> T visit(com.google.javascript.rhino.jstype.Visitor<T> visitor) {
		return visitor.caseObjectType(com.google.javascript.rhino.jstype.ObjectType.this);
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

	public java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> getCtorImplementedInterfaces() {
		return com.google.common.collect.ImmutableSet.of();
	}
}


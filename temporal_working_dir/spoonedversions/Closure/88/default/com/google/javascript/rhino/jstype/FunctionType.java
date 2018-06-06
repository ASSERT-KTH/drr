

package com.google.javascript.rhino.jstype;


public class FunctionType extends com.google.javascript.rhino.jstype.PrototypeObjectType {
	private static final long serialVersionUID = 1L;

	private enum Kind {
ORDINARY, CONSTRUCTOR, INTERFACE;	}

	private com.google.javascript.rhino.jstype.ArrowType call;

	private com.google.javascript.rhino.jstype.FunctionPrototypeType prototype;

	private final com.google.javascript.rhino.jstype.FunctionType.Kind kind;

	private com.google.javascript.rhino.jstype.ObjectType typeOfThis;

	private com.google.javascript.rhino.Node source;

	private java.util.List<com.google.javascript.rhino.jstype.ObjectType> implementedInterfaces = com.google.common.collect.ImmutableList.of();

	private java.util.List<com.google.javascript.rhino.jstype.FunctionType> subTypes;

	private java.lang.String templateTypeName;

	FunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, java.lang.String name, com.google.javascript.rhino.Node source, com.google.javascript.rhino.jstype.ArrowType arrowType, com.google.javascript.rhino.jstype.ObjectType typeOfThis, java.lang.String templateTypeName, boolean isConstructor, boolean nativeType) {
		super(registry, name, registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_INSTANCE_TYPE), nativeType);
		com.google.common.base.Preconditions.checkArgument(((source == null) || ((com.google.javascript.rhino.Token.FUNCTION) == (source.getType()))));
		com.google.common.base.Preconditions.checkNotNull(arrowType);
		com.google.javascript.rhino.jstype.FunctionType.this.source = source;
		this.kind = (isConstructor) ? com.google.javascript.rhino.jstype.FunctionType.Kind.CONSTRUCTOR : com.google.javascript.rhino.jstype.FunctionType.Kind.ORDINARY;
		if (isConstructor) {
			com.google.javascript.rhino.jstype.FunctionType.this.typeOfThis = ((typeOfThis != null) && (typeOfThis.isNoObjectType())) ? typeOfThis : new com.google.javascript.rhino.jstype.InstanceObjectType(registry, com.google.javascript.rhino.jstype.FunctionType.this, nativeType);
		}else {
			com.google.javascript.rhino.jstype.FunctionType.this.typeOfThis = (typeOfThis != null) ? typeOfThis : registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
		}
		com.google.javascript.rhino.jstype.FunctionType.this.call = arrowType;
		com.google.javascript.rhino.jstype.FunctionType.this.templateTypeName = templateTypeName;
	}

	private FunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, java.lang.String name, com.google.javascript.rhino.Node source) {
		super(registry, name, registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_INSTANCE_TYPE));
		com.google.common.base.Preconditions.checkArgument(((source == null) || ((com.google.javascript.rhino.Token.FUNCTION) == (source.getType()))));
		com.google.common.base.Preconditions.checkArgument((name != null));
		com.google.javascript.rhino.jstype.FunctionType.this.source = source;
		com.google.javascript.rhino.jstype.FunctionType.this.call = new com.google.javascript.rhino.jstype.ArrowType(registry, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.LP), null);
		this.kind = com.google.javascript.rhino.jstype.FunctionType.Kind.INTERFACE;
		com.google.javascript.rhino.jstype.FunctionType.this.typeOfThis = new com.google.javascript.rhino.jstype.InstanceObjectType(registry, com.google.javascript.rhino.jstype.FunctionType.this);
	}

	static com.google.javascript.rhino.jstype.FunctionType forInterface(com.google.javascript.rhino.jstype.JSTypeRegistry registry, java.lang.String name, com.google.javascript.rhino.Node source) {
		return new com.google.javascript.rhino.jstype.FunctionType(registry, name, source);
	}

	@java.lang.Override
	public boolean isInstanceType() {
		return isEquivalentTo(registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.U2U_CONSTRUCTOR_TYPE));
	}

	@java.lang.Override
	public boolean isConstructor() {
		return (kind) == (com.google.javascript.rhino.jstype.FunctionType.Kind.CONSTRUCTOR);
	}

	@java.lang.Override
	public boolean isInterface() {
		return (kind) == (com.google.javascript.rhino.jstype.FunctionType.Kind.INTERFACE);
	}

	@java.lang.Override
	public boolean isOrdinaryFunction() {
		return (kind) == (com.google.javascript.rhino.jstype.FunctionType.Kind.ORDINARY);
	}

	@java.lang.Override
	public boolean isFunctionType() {
		return true;
	}

	@java.lang.Override
	public boolean canBeCalled() {
		return true;
	}

	public java.lang.Iterable<com.google.javascript.rhino.Node> getParameters() {
		com.google.javascript.rhino.Node n = getParametersNode();
		if (n != null) {
			return n.children();
		}else {
			return java.util.Collections.emptySet();
		}
	}

	public com.google.javascript.rhino.Node getParametersNode() {
		return call.parameters;
	}

	public int getMinArguments() {
		int i = 0;
		int min = 0;
		for (com.google.javascript.rhino.Node n : getParameters()) {
			i++;
			if ((!(n.isOptionalArg())) && (!(n.isVarArgs()))) {
				min = i;
			}
		}
		return min;
	}

	public int getMaxArguments() {
		com.google.javascript.rhino.Node params = getParametersNode();
		if (params != null) {
			com.google.javascript.rhino.Node lastParam = params.getLastChild();
			if ((lastParam == null) || (!(lastParam.isVarArgs()))) {
				return params.getChildCount();
			}
		}
		return java.lang.Integer.MAX_VALUE;
	}

	public com.google.javascript.rhino.jstype.JSType getReturnType() {
		return call.returnType;
	}

	public boolean isReturnTypeInferred() {
		return call.returnTypeInferred;
	}

	com.google.javascript.rhino.jstype.ArrowType getInternalArrowType() {
		return call;
	}

	public com.google.javascript.rhino.jstype.FunctionPrototypeType getPrototype() {
		if ((prototype) == null) {
			setPrototype(new com.google.javascript.rhino.jstype.FunctionPrototypeType(registry, com.google.javascript.rhino.jstype.FunctionType.this, null));
		}
		return prototype;
	}

	public void setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType baseType) {
		if ((prototype) == null) {
			setPrototype(new com.google.javascript.rhino.jstype.FunctionPrototypeType(registry, com.google.javascript.rhino.jstype.FunctionType.this, baseType, isNativeObjectType()));
		}else {
			prototype.setImplicitPrototype(baseType);
		}
	}

	public boolean setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType prototype) {
		if (prototype == null) {
			return false;
		}
		if ((isConstructor()) && (prototype == (getInstanceType()))) {
			return false;
		}
		com.google.javascript.rhino.jstype.FunctionType.this.prototype = prototype;
		if ((isConstructor()) || (isInterface())) {
			com.google.javascript.rhino.jstype.FunctionType superClass = getSuperClassConstructor();
			if (superClass != null) {
				superClass.addSubType(com.google.javascript.rhino.jstype.FunctionType.this);
			}
		}
		return true;
	}

	public java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> getAllImplementedInterfaces() {
		java.util.Set<com.google.javascript.rhino.jstype.ObjectType> interfaces = com.google.common.collect.Sets.newLinkedHashSet();
		for (com.google.javascript.rhino.jstype.ObjectType type : getImplementedInterfaces()) {
			addRelatedInterfaces(type, interfaces);
		}
		return interfaces;
	}

	private void addRelatedInterfaces(com.google.javascript.rhino.jstype.ObjectType instance, java.util.Set<com.google.javascript.rhino.jstype.ObjectType> set) {
		com.google.javascript.rhino.jstype.FunctionType constructor = instance.getConstructor();
		if (constructor != null) {
			if (!(constructor.isInterface())) {
				return ;
			}
			set.add(instance);
			if ((constructor.getSuperClassConstructor()) != null) {
				addRelatedInterfaces(constructor.getSuperClassConstructor().getInstanceType(), set);
			}
		}
	}

	public java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> getImplementedInterfaces() {
		com.google.javascript.rhino.jstype.FunctionType superCtor = isConstructor() ? getSuperClassConstructor() : null;
		if (superCtor == null) {
			return implementedInterfaces;
		}else {
			return com.google.common.collect.Iterables.concat(implementedInterfaces, superCtor.getImplementedInterfaces());
		}
	}

	public void setImplementedInterfaces(java.util.List<com.google.javascript.rhino.jstype.ObjectType> implementedInterfaces) {
		for (com.google.javascript.rhino.jstype.ObjectType type : implementedInterfaces) {
			registry.registerTypeImplementingInterface(com.google.javascript.rhino.jstype.FunctionType.this, type);
		}
		com.google.javascript.rhino.jstype.FunctionType.this.implementedInterfaces = com.google.common.collect.ImmutableList.copyOf(implementedInterfaces);
	}

	@java.lang.Override
	public boolean hasProperty(java.lang.String name) {
		return (super.hasProperty(name)) || ("prototype".equals(name));
	}

	@java.lang.Override
	public boolean hasOwnProperty(java.lang.String name) {
		return (super.hasOwnProperty(name)) || ("prototype".equals(name));
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getPropertyType(java.lang.String name) {
		if ("prototype".equals(name)) {
			return getPrototype();
		}else {
			if (!(hasOwnProperty(name))) {
				if ("call".equals(name)) {
					com.google.javascript.rhino.Node params = getParametersNode();
					if (params == null) {
						defineDeclaredProperty(name, new com.google.javascript.rhino.jstype.FunctionBuilder(registry).withReturnType(getReturnType()).build(), false);
					}else {
						params = params.cloneTree();
						com.google.javascript.rhino.Node thisTypeNode = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, "thisType");
						thisTypeNode.setJSType(registry.createOptionalNullableType(getTypeOfThis()));
						params.addChildToFront(thisTypeNode);
						thisTypeNode.setOptionalArg(true);
						defineDeclaredProperty(name, new com.google.javascript.rhino.jstype.FunctionBuilder(registry).withParamsNode(params).withReturnType(getReturnType()).build(), false);
					}
				}else
					if ("apply".equals(name)) {
						com.google.javascript.rhino.jstype.FunctionParamBuilder builder = new com.google.javascript.rhino.jstype.FunctionParamBuilder(registry);
						builder.addOptionalParams(registry.createNullableType(getTypeOfThis()), registry.createNullableType(registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE)));
						defineDeclaredProperty(name, new com.google.javascript.rhino.jstype.FunctionBuilder(registry).withParams(builder).withReturnType(getReturnType()).build(), false);
					}
				
			}
			return super.getPropertyType(name);
		}
	}

	@java.lang.Override
	boolean defineProperty(java.lang.String name, com.google.javascript.rhino.jstype.JSType type, boolean inferred, boolean inExterns) {
		if ("prototype".equals(name)) {
			com.google.javascript.rhino.jstype.ObjectType objType = type.toObjectType();
			if (objType != null) {
				if (objType.isEquivalentTo(prototype)) {
					return true;
				}
				return setPrototype(new com.google.javascript.rhino.jstype.FunctionPrototypeType(registry, com.google.javascript.rhino.jstype.FunctionType.this, objType, isNativeObjectType()));
			}else {
				return false;
			}
		}
		return super.defineProperty(name, type, inferred, inExterns);
	}

	@java.lang.Override
	public boolean isPropertyTypeInferred(java.lang.String property) {
		return ("prototype".equals(property)) || (super.isPropertyTypeInferred(property));
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getLeastSupertype(com.google.javascript.rhino.jstype.JSType that) {
		return supAndInfHelper(that, true);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getGreatestSubtype(com.google.javascript.rhino.jstype.JSType that) {
		return supAndInfHelper(that, false);
	}

	private com.google.javascript.rhino.jstype.JSType supAndInfHelper(com.google.javascript.rhino.jstype.JSType that, boolean leastSuper) {
		if ((isFunctionType()) && (that.isFunctionType())) {
			if (isEquivalentTo(that)) {
				return com.google.javascript.rhino.jstype.FunctionType.this;
			}
			com.google.javascript.rhino.jstype.FunctionType other = null;
			if (that instanceof com.google.javascript.rhino.jstype.FunctionType) {
				other = ((com.google.javascript.rhino.jstype.FunctionType) (that));
			}
			if (((((other != null) && (isOrdinaryFunction())) && (that.isOrdinaryFunction())) && (!(com.google.javascript.rhino.jstype.FunctionType.this.call.hasUnknownParamsOrReturn()))) && (!(other.call.hasUnknownParamsOrReturn()))) {
				boolean isSubtypeOfThat = com.google.javascript.rhino.jstype.FunctionType.this.isSubtype(that);
				boolean isSubtypeOfThis = that.isSubtype(com.google.javascript.rhino.jstype.FunctionType.this);
				if (isSubtypeOfThat && (!isSubtypeOfThis)) {
					return leastSuper ? that : com.google.javascript.rhino.jstype.FunctionType.this;
				}else
					if (isSubtypeOfThis && (!isSubtypeOfThat)) {
						return leastSuper ? com.google.javascript.rhino.jstype.FunctionType.this : that;
					}
				
				com.google.javascript.rhino.jstype.FunctionType merged = tryMergeFunctionPiecewise(other, leastSuper);
				if (merged != null) {
					return merged;
				}
			}
			com.google.javascript.rhino.jstype.JSType functionInstance = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_INSTANCE_TYPE);
			if (functionInstance.isEquivalentTo(that)) {
				return leastSuper ? that : com.google.javascript.rhino.jstype.FunctionType.this;
			}else
				if (functionInstance.isEquivalentTo(com.google.javascript.rhino.jstype.FunctionType.this)) {
					return leastSuper ? com.google.javascript.rhino.jstype.FunctionType.this : that;
				}
			
			com.google.javascript.rhino.jstype.FunctionType greatestFn = registry.getNativeFunctionType(com.google.javascript.rhino.jstype.JSTypeNative.U2U_CONSTRUCTOR_TYPE);
			com.google.javascript.rhino.jstype.FunctionType leastFn = registry.getNativeFunctionType(com.google.javascript.rhino.jstype.JSTypeNative.LEAST_FUNCTION_TYPE);
			return leastSuper ? greatestFn : leastFn;
		}
		return leastSuper ? super.getLeastSupertype(that) : super.getGreatestSubtype(that);
	}

	private com.google.javascript.rhino.jstype.FunctionType tryMergeFunctionPiecewise(com.google.javascript.rhino.jstype.FunctionType other, boolean leastSuper) {
		com.google.javascript.rhino.Node newParamsNode = null;
		if (call.hasEqualParameters(other.call)) {
			newParamsNode = call.parameters;
		}else {
			return null;
		}
		com.google.javascript.rhino.jstype.JSType newReturnType = leastSuper ? call.returnType.getLeastSupertype(other.call.returnType) : call.returnType.getGreatestSubtype(other.call.returnType);
		com.google.javascript.rhino.jstype.ObjectType newTypeOfThis = null;
		if (com.google.javascript.rhino.jstype.JSType.isEquivalent(typeOfThis, other.typeOfThis)) {
			newTypeOfThis = typeOfThis;
		}else {
			com.google.javascript.rhino.jstype.JSType maybeNewTypeOfThis = leastSuper ? typeOfThis.getLeastSupertype(other.typeOfThis) : typeOfThis.getGreatestSubtype(other.typeOfThis);
			if (maybeNewTypeOfThis instanceof com.google.javascript.rhino.jstype.ObjectType) {
				newTypeOfThis = ((com.google.javascript.rhino.jstype.ObjectType) (maybeNewTypeOfThis));
			}else {
				newTypeOfThis = (leastSuper) ? registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE) : registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE);
			}
		}
		boolean newReturnTypeInferred = (call.returnTypeInferred) || (other.call.returnTypeInferred);
		return new com.google.javascript.rhino.jstype.FunctionType(registry, null, null, new com.google.javascript.rhino.jstype.ArrowType(registry, newParamsNode, newReturnType, newReturnTypeInferred), newTypeOfThis, null, false, false);
	}

	public com.google.javascript.rhino.jstype.FunctionType getSuperClassConstructor() {
		com.google.common.base.Preconditions.checkArgument(((isConstructor()) || (isInterface())));
		com.google.javascript.rhino.jstype.ObjectType maybeSuperInstanceType = getPrototype().getImplicitPrototype();
		if (maybeSuperInstanceType == null) {
			return null;
		}
		return maybeSuperInstanceType.getConstructor();
	}

	public boolean hasUnknownSupertype() {
		com.google.common.base.Preconditions.checkArgument(((isConstructor()) || (isInterface())));
		com.google.common.base.Preconditions.checkArgument((!(com.google.javascript.rhino.jstype.FunctionType.this.isUnknownType())));
		com.google.javascript.rhino.jstype.FunctionType ctor = com.google.javascript.rhino.jstype.FunctionType.this;
		while (true) {
			com.google.javascript.rhino.jstype.ObjectType maybeSuperInstanceType = ctor.getPrototype().getImplicitPrototype();
			if (maybeSuperInstanceType == null) {
				return false;
			}
			if (maybeSuperInstanceType.isUnknownType()) {
				return true;
			}
			ctor = maybeSuperInstanceType.getConstructor();
			if (ctor == null) {
				return false;
			}
			com.google.common.base.Preconditions.checkState(((ctor.isConstructor()) || (ctor.isInterface())));
		} 
	}

	public com.google.javascript.rhino.jstype.JSType getTopMostDefiningType(java.lang.String propertyName) {
		com.google.common.base.Preconditions.checkState(((isConstructor()) || (isInterface())));
		com.google.common.base.Preconditions.checkArgument(getPrototype().hasProperty(propertyName));
		com.google.javascript.rhino.jstype.FunctionType ctor = com.google.javascript.rhino.jstype.FunctionType.this;
		com.google.javascript.rhino.jstype.JSType topInstanceType;
		do {
			topInstanceType = ctor.getInstanceType();
			ctor = ctor.getSuperClassConstructor();
		} while ((ctor != null) && (ctor.getPrototype().hasProperty(propertyName)) );
		return topInstanceType;
	}

	@java.lang.Override
	public boolean isEquivalentTo(com.google.javascript.rhino.jstype.JSType otherType) {
		if (!(otherType instanceof com.google.javascript.rhino.jstype.FunctionType)) {
			return false;
		}
		com.google.javascript.rhino.jstype.FunctionType that = ((com.google.javascript.rhino.jstype.FunctionType) (otherType));
		if (!(that.isFunctionType())) {
			return false;
		}
		if (com.google.javascript.rhino.jstype.FunctionType.this.isConstructor()) {
			if (that.isConstructor()) {
				return (com.google.javascript.rhino.jstype.FunctionType.this) == that;
			}
			return false;
		}
		if (com.google.javascript.rhino.jstype.FunctionType.this.isInterface()) {
			if (that.isInterface()) {
				return com.google.javascript.rhino.jstype.FunctionType.this.getReferenceName().equals(that.getReferenceName());
			}
			return false;
		}
		if (that.isInterface()) {
			return false;
		}
		return (com.google.javascript.rhino.jstype.FunctionType.this.typeOfThis.isEquivalentTo(that.typeOfThis)) && (com.google.javascript.rhino.jstype.FunctionType.this.call.isEquivalentTo(that.call));
	}

	@java.lang.Override
	public int hashCode() {
		return isInterface() ? getReferenceName().hashCode() : call.hashCode();
	}

	public boolean hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType otherType) {
		return com.google.javascript.rhino.jstype.FunctionType.this.call.isEquivalentTo(otherType.call);
	}

	@java.lang.Override
	public java.lang.String toString() {
		if ((com.google.javascript.rhino.jstype.FunctionType.this) == (registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_INSTANCE_TYPE))) {
			return "Function";
		}
		java.lang.StringBuilder b = new java.lang.StringBuilder(32);
		b.append("function (");
		int paramNum = call.parameters.getChildCount();
		boolean hasKnownTypeOfThis = !(typeOfThis.isUnknownType());
		if (hasKnownTypeOfThis) {
			b.append("this:");
			b.append(typeOfThis.toString());
		}
		if (paramNum > 0) {
			if (hasKnownTypeOfThis) {
				b.append(", ");
			}
			com.google.javascript.rhino.Node p = call.parameters.getFirstChild();
			if (p.isVarArgs()) {
				appendVarArgsString(b, p.getJSType());
			}else {
				b.append(p.getJSType().toString());
			}
			p = p.getNext();
			while (p != null) {
				b.append(", ");
				if (p.isVarArgs()) {
					appendVarArgsString(b, p.getJSType());
				}else {
					b.append(p.getJSType().toString());
				}
				p = p.getNext();
			} 
		}
		b.append("): ");
		b.append(call.returnType);
		return b.toString();
	}

	private void appendVarArgsString(java.lang.StringBuilder builder, com.google.javascript.rhino.jstype.JSType paramType) {
		if (paramType.isUnionType()) {
			paramType = ((com.google.javascript.rhino.jstype.UnionType) (paramType)).getRestrictedUnion(registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE));
		}
		builder.append("...[").append(paramType.toString()).append("]");
	}

	@java.lang.Override
	public boolean isSubtype(com.google.javascript.rhino.jstype.JSType that) {
		if (com.google.javascript.rhino.jstype.JSType.isSubtype(com.google.javascript.rhino.jstype.FunctionType.this, that)) {
			return true;
		}
		if (that.isFunctionType()) {
			if (((com.google.javascript.rhino.jstype.FunctionType) (that)).isInterface()) {
				return true;
			}
			if (com.google.javascript.rhino.jstype.FunctionType.this.isInterface()) {
				return false;
			}
			com.google.javascript.rhino.jstype.FunctionType other = ((com.google.javascript.rhino.jstype.FunctionType) (that));
			boolean treatThisTypesAsCovariant = ((((com.google.javascript.rhino.jstype.FunctionType.this.isConstructor()) || (other.isConstructor())) || (((other.typeOfThis.getConstructor()) != null) && (other.typeOfThis.getConstructor().isInterface()))) || (other.typeOfThis.isSubtype(com.google.javascript.rhino.jstype.FunctionType.this.typeOfThis))) || (com.google.javascript.rhino.jstype.FunctionType.this.typeOfThis.isSubtype(other.typeOfThis));
			return treatThisTypesAsCovariant && (com.google.javascript.rhino.jstype.FunctionType.this.call.isSubtype(other.call));
		}
		return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_PROTOTYPE).isSubtype(that);
	}

	@java.lang.Override
	public <T> T visit(com.google.javascript.rhino.jstype.Visitor<T> visitor) {
		return visitor.caseFunctionType(com.google.javascript.rhino.jstype.FunctionType.this);
	}

	public com.google.javascript.rhino.jstype.ObjectType getInstanceType() {
		com.google.common.base.Preconditions.checkState(hasInstanceType());
		return typeOfThis;
	}

	void setInstanceType(com.google.javascript.rhino.jstype.ObjectType instanceType) {
		typeOfThis = instanceType;
	}

	public boolean hasInstanceType() {
		return (isConstructor()) || (isInterface());
	}

	public com.google.javascript.rhino.jstype.ObjectType getTypeOfThis() {
		return typeOfThis.isNoObjectType() ? registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE) : typeOfThis;
	}

	public com.google.javascript.rhino.Node getSource() {
		return source;
	}

	public void setSource(com.google.javascript.rhino.Node source) {
		com.google.javascript.rhino.jstype.FunctionType.this.source = source;
	}

	private void addSubType(com.google.javascript.rhino.jstype.FunctionType subType) {
		if ((subTypes) == null) {
			subTypes = com.google.common.collect.Lists.newArrayList();
		}
		subTypes.add(subType);
	}

	public java.util.List<com.google.javascript.rhino.jstype.FunctionType> getSubTypes() {
		return subTypes;
	}

	@java.lang.Override
	public boolean hasCachedValues() {
		return ((prototype) != null) || (super.hasCachedValues());
	}

	public java.lang.String getTemplateTypeName() {
		return templateTypeName;
	}

	@java.lang.Override
	com.google.javascript.rhino.jstype.JSType resolveInternal(com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope) {
		setResolvedTypeInternal(com.google.javascript.rhino.jstype.FunctionType.this);
		call = ((com.google.javascript.rhino.jstype.ArrowType) (com.google.javascript.rhino.jstype.JSType.safeResolve(call, t, scope)));
		prototype = ((com.google.javascript.rhino.jstype.FunctionPrototypeType) (com.google.javascript.rhino.jstype.JSType.safeResolve(prototype, t, scope)));
		com.google.javascript.rhino.jstype.JSType maybeTypeOfThis = com.google.javascript.rhino.jstype.JSType.safeResolve(typeOfThis, t, scope);
		if (maybeTypeOfThis != null) {
			maybeTypeOfThis = maybeTypeOfThis.restrictByNotNullOrUndefined();
		}
		if (maybeTypeOfThis instanceof com.google.javascript.rhino.jstype.ObjectType) {
			typeOfThis = ((com.google.javascript.rhino.jstype.ObjectType) (maybeTypeOfThis));
		}
		boolean changed = false;
		com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> resolvedInterfaces = com.google.common.collect.ImmutableList.builder();
		for (com.google.javascript.rhino.jstype.ObjectType iface : implementedInterfaces) {
			com.google.javascript.rhino.jstype.ObjectType resolvedIface = ((com.google.javascript.rhino.jstype.ObjectType) (iface.resolve(t, scope)));
			resolvedInterfaces.add(resolvedIface);
			changed |= resolvedIface != iface;
		}
		if (changed) {
			implementedInterfaces = resolvedInterfaces.build();
		}
		if ((subTypes) != null) {
			for (int i = 0; i < (subTypes.size()); i++) {
				subTypes.set(i, ((com.google.javascript.rhino.jstype.FunctionType) (subTypes.get(i).resolve(t, scope))));
			}
		}
		return super.resolveInternal(t, scope);
	}

	@java.lang.Override
	public java.lang.String toDebugHashCodeString() {
		if ((com.google.javascript.rhino.jstype.FunctionType.this) == (registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_INSTANCE_TYPE))) {
			return super.toDebugHashCodeString();
		}
		java.lang.StringBuilder b = new java.lang.StringBuilder(32);
		b.append("function (");
		int paramNum = call.parameters.getChildCount();
		boolean hasKnownTypeOfThis = !(typeOfThis.isUnknownType());
		if (hasKnownTypeOfThis) {
			b.append("this:");
			b.append(getDebugHashCodeStringOf(typeOfThis));
		}
		if (paramNum > 0) {
			if (hasKnownTypeOfThis) {
				b.append(", ");
			}
			com.google.javascript.rhino.Node p = call.parameters.getFirstChild();
			b.append(getDebugHashCodeStringOf(p.getJSType()));
			p = p.getNext();
			while (p != null) {
				b.append(", ");
				b.append(getDebugHashCodeStringOf(p.getJSType()));
				p = p.getNext();
			} 
		}
		b.append(")");
		b.append(": ");
		b.append(getDebugHashCodeStringOf(call.returnType));
		return b.toString();
	}

	private java.lang.String getDebugHashCodeStringOf(com.google.javascript.rhino.jstype.JSType type) {
		if (type == (com.google.javascript.rhino.jstype.FunctionType.this)) {
			return "me";
		}else {
			return type.toDebugHashCodeString();
		}
	}
}


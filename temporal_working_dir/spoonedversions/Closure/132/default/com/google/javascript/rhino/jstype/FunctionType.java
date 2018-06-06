

package com.google.javascript.rhino.jstype;


public class FunctionType extends com.google.javascript.rhino.jstype.PrototypeObjectType {
	private static final long serialVersionUID = 1L;

	private enum Kind {
ORDINARY, CONSTRUCTOR, INTERFACE;	}

	private enum PropAccess {
ANY, STRUCT, DICT;	}

	private com.google.javascript.rhino.jstype.ArrowType call;

	private com.google.javascript.rhino.jstype.Property prototypeSlot;

	private final com.google.javascript.rhino.jstype.FunctionType.Kind kind;

	private com.google.javascript.rhino.jstype.FunctionType.PropAccess propAccess;

	private com.google.javascript.rhino.jstype.JSType typeOfThis;

	private com.google.javascript.rhino.Node source;

	private java.util.List<com.google.javascript.rhino.jstype.ObjectType> implementedInterfaces = com.google.common.collect.ImmutableList.of();

	private java.util.List<com.google.javascript.rhino.jstype.ObjectType> extendedInterfaces = com.google.common.collect.ImmutableList.of();

	private java.util.List<com.google.javascript.rhino.jstype.FunctionType> subTypes;

	FunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, java.lang.String name, com.google.javascript.rhino.Node source, com.google.javascript.rhino.jstype.ArrowType arrowType, com.google.javascript.rhino.jstype.JSType typeOfThis, com.google.javascript.rhino.jstype.TemplateTypeMap templateTypeMap, boolean isConstructor, boolean nativeType) {
		super(registry, name, registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_INSTANCE_TYPE), nativeType, templateTypeMap);
		setPrettyPrint(true);
		com.google.common.base.Preconditions.checkArgument(((source == null) || ((com.google.javascript.rhino.Token.FUNCTION) == (source.getType()))));
		com.google.common.base.Preconditions.checkNotNull(arrowType);
		com.google.javascript.rhino.jstype.FunctionType.this.source = source;
		if (isConstructor) {
			this.kind = com.google.javascript.rhino.jstype.FunctionType.Kind.CONSTRUCTOR;
			com.google.javascript.rhino.jstype.FunctionType.this.propAccess = com.google.javascript.rhino.jstype.FunctionType.PropAccess.ANY;
			com.google.javascript.rhino.jstype.FunctionType.this.typeOfThis = (typeOfThis != null) ? typeOfThis : new com.google.javascript.rhino.jstype.InstanceObjectType(registry, com.google.javascript.rhino.jstype.FunctionType.this, nativeType);
		}else {
			this.kind = com.google.javascript.rhino.jstype.FunctionType.Kind.ORDINARY;
			com.google.javascript.rhino.jstype.FunctionType.this.typeOfThis = (typeOfThis != null) ? typeOfThis : registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
		}
		com.google.javascript.rhino.jstype.FunctionType.this.call = arrowType;
	}

	private FunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, java.lang.String name, com.google.javascript.rhino.Node source) {
		super(registry, name, registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_INSTANCE_TYPE));
		setPrettyPrint(true);
		com.google.common.base.Preconditions.checkArgument(((source == null) || ((com.google.javascript.rhino.Token.FUNCTION) == (source.getType()))));
		com.google.common.base.Preconditions.checkArgument((name != null));
		com.google.javascript.rhino.jstype.FunctionType.this.source = source;
		com.google.javascript.rhino.jstype.FunctionType.this.call = new com.google.javascript.rhino.jstype.ArrowType(registry, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.PARAM_LIST), null);
		this.kind = com.google.javascript.rhino.jstype.FunctionType.Kind.INTERFACE;
		com.google.javascript.rhino.jstype.FunctionType.this.typeOfThis = new com.google.javascript.rhino.jstype.InstanceObjectType(registry, com.google.javascript.rhino.jstype.FunctionType.this);
	}

	static com.google.javascript.rhino.jstype.FunctionType forInterface(com.google.javascript.rhino.jstype.JSTypeRegistry registry, java.lang.String name, com.google.javascript.rhino.Node source) {
		return new com.google.javascript.rhino.jstype.FunctionType(registry, name, source);
	}

	@java.lang.Override
	public boolean isInstanceType() {
		return (com.google.javascript.rhino.jstype.FunctionType.this) == (registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.U2U_CONSTRUCTOR_TYPE));
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

	public boolean makesStructs() {
		if (!(isConstructor())) {
			return false;
		}
		if ((propAccess) == (com.google.javascript.rhino.jstype.FunctionType.PropAccess.STRUCT)) {
			return true;
		}
		com.google.javascript.rhino.jstype.FunctionType superc = getSuperClassConstructor();
		if ((superc != null) && (superc.makesStructs())) {
			setStruct();
			return true;
		}
		return false;
	}

	public boolean makesDicts() {
		if (!(isConstructor())) {
			return false;
		}
		if ((propAccess) == (com.google.javascript.rhino.jstype.FunctionType.PropAccess.DICT)) {
			return true;
		}
		com.google.javascript.rhino.jstype.FunctionType superc = getSuperClassConstructor();
		if ((superc != null) && (superc.makesDicts())) {
			setDict();
			return true;
		}
		return false;
	}

	public void setStruct() {
		propAccess = com.google.javascript.rhino.jstype.FunctionType.PropAccess.STRUCT;
	}

	public void setDict() {
		propAccess = com.google.javascript.rhino.jstype.FunctionType.PropAccess.DICT;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.FunctionType toMaybeFunctionType() {
		return com.google.javascript.rhino.jstype.FunctionType.this;
	}

	@java.lang.Override
	public boolean canBeCalled() {
		return true;
	}

	public boolean hasImplementedInterfaces() {
		if (!(implementedInterfaces.isEmpty())) {
			return true;
		}
		com.google.javascript.rhino.jstype.FunctionType superCtor = isConstructor() ? getSuperClassConstructor() : null;
		if (superCtor != null) {
			return superCtor.hasImplementedInterfaces();
		}
		return false;
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

	@java.lang.Override
	public com.google.javascript.rhino.jstype.Property getSlot(java.lang.String name) {
		if ("prototype".equals(name)) {
			getPrototype();
			return prototypeSlot;
		}else {
			return super.getSlot(name);
		}
	}

	@java.lang.Override
	public java.util.Set<java.lang.String> getOwnPropertyNames() {
		if ((prototypeSlot) == null) {
			return super.getOwnPropertyNames();
		}else {
			java.util.Set<java.lang.String> names = com.google.common.collect.Sets.newHashSet("prototype");
			names.addAll(super.getOwnPropertyNames());
			return names;
		}
	}

	public com.google.javascript.rhino.jstype.ObjectType getPrototype() {
		if ((prototypeSlot) == null) {
			java.lang.String refName = getReferenceName();
			if (refName == null) {
				setPrototypeNoCheck(registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE), null);
			}else {
				setPrototype(new com.google.javascript.rhino.jstype.PrototypeObjectType(registry, ((getReferenceName()) + ".prototype"), registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE), isNativeObjectType(), null), null);
			}
		}
		return ((com.google.javascript.rhino.jstype.ObjectType) (prototypeSlot.getType()));
	}

	public void setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType baseType) {
		setPrototypeBasedOn(baseType, null);
	}

	void setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType baseType, com.google.javascript.rhino.Node propertyNode) {
		if (((baseType.hasReferenceName()) || (isNativeObjectType())) || (baseType.isFunctionPrototypeType())) {
			baseType = new com.google.javascript.rhino.jstype.PrototypeObjectType(registry, ((getReferenceName()) + ".prototype"), baseType);
		}
		setPrototype(baseType, propertyNode);
	}

	boolean setPrototype(com.google.javascript.rhino.jstype.ObjectType prototype, com.google.javascript.rhino.Node propertyNode) {
		if (prototype == null) {
			return false;
		}
		if ((isConstructor()) && (prototype == (getInstanceType()))) {
			return false;
		}
		return setPrototypeNoCheck(prototype, propertyNode);
	}

	private boolean setPrototypeNoCheck(com.google.javascript.rhino.jstype.ObjectType prototype, com.google.javascript.rhino.Node propertyNode) {
		com.google.javascript.rhino.jstype.ObjectType oldPrototype = (prototypeSlot) == null ? null : ((com.google.javascript.rhino.jstype.ObjectType) (prototypeSlot.getType()));
		boolean replacedPrototype = oldPrototype != null;
		com.google.javascript.rhino.jstype.FunctionType.this.prototypeSlot = new com.google.javascript.rhino.jstype.Property("prototype", prototype, true, (propertyNode == null ? source : propertyNode));
		prototype.setOwnerFunction(com.google.javascript.rhino.jstype.FunctionType.this);
		if (oldPrototype != null) {
			oldPrototype.setOwnerFunction(null);
		}
		if ((isConstructor()) || (isInterface())) {
			com.google.javascript.rhino.jstype.FunctionType superClass = getSuperClassConstructor();
			if (superClass != null) {
				superClass.addSubType(com.google.javascript.rhino.jstype.FunctionType.this);
			}
			if (isInterface()) {
				for (com.google.javascript.rhino.jstype.ObjectType interfaceType : getExtendedInterfaces()) {
					if ((interfaceType.getConstructor()) != null) {
						interfaceType.getConstructor().addSubType(com.google.javascript.rhino.jstype.FunctionType.this);
					}
				}
			}
		}
		if (replacedPrototype) {
			clearCachedValues();
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
			for (com.google.javascript.rhino.jstype.ObjectType interfaceType : instance.getCtorExtendedInterfaces()) {
				addRelatedInterfaces(interfaceType, set);
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

	public java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> getOwnImplementedInterfaces() {
		return implementedInterfaces;
	}

	public void setImplementedInterfaces(java.util.List<com.google.javascript.rhino.jstype.ObjectType> implementedInterfaces) {
		if (isConstructor()) {
			for (com.google.javascript.rhino.jstype.ObjectType type : implementedInterfaces) {
				registry.registerTypeImplementingInterface(com.google.javascript.rhino.jstype.FunctionType.this, type);
			}
			com.google.javascript.rhino.jstype.FunctionType.this.implementedInterfaces = com.google.common.collect.ImmutableList.copyOf(implementedInterfaces);
		}else {
			throw new java.lang.UnsupportedOperationException();
		}
	}

	public java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> getAllExtendedInterfaces() {
		java.util.Set<com.google.javascript.rhino.jstype.ObjectType> extendedInterfaces = com.google.common.collect.Sets.newLinkedHashSet();
		for (com.google.javascript.rhino.jstype.ObjectType interfaceType : getExtendedInterfaces()) {
			addRelatedExtendedInterfaces(interfaceType, extendedInterfaces);
		}
		return extendedInterfaces;
	}

	private void addRelatedExtendedInterfaces(com.google.javascript.rhino.jstype.ObjectType instance, java.util.Set<com.google.javascript.rhino.jstype.ObjectType> set) {
		com.google.javascript.rhino.jstype.FunctionType constructor = instance.getConstructor();
		if (constructor != null) {
			set.add(instance);
			for (com.google.javascript.rhino.jstype.ObjectType interfaceType : constructor.getExtendedInterfaces()) {
				addRelatedExtendedInterfaces(interfaceType, set);
			}
		}
	}

	public java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> getExtendedInterfaces() {
		return extendedInterfaces;
	}

	public int getExtendedInterfacesCount() {
		return extendedInterfaces.size();
	}

	public void setExtendedInterfaces(java.util.List<com.google.javascript.rhino.jstype.ObjectType> extendedInterfaces) throws java.lang.UnsupportedOperationException {
		if (isInterface()) {
			com.google.javascript.rhino.jstype.FunctionType.this.extendedInterfaces = com.google.common.collect.ImmutableList.copyOf(extendedInterfaces);
		}else {
			throw new java.lang.UnsupportedOperationException();
		}
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getPropertyType(java.lang.String name) {
		if (!(hasOwnProperty(name))) {
			boolean isCall = "call".equals(name);
			boolean isBind = "bind".equals(name);
			if (isCall || isBind) {
				defineDeclaredProperty(name, getCallOrBindSignature(isCall), source);
			}else
				if ("apply".equals(name)) {
					com.google.javascript.rhino.jstype.FunctionParamBuilder builder = new com.google.javascript.rhino.jstype.FunctionParamBuilder(registry);
					builder.addOptionalParams(registry.createNullableType(getTypeOfThis()), registry.createNullableType(registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE)));
					defineDeclaredProperty(name, new com.google.javascript.rhino.jstype.FunctionBuilder(registry).withParams(builder).withReturnType(getReturnType()).withTemplateKeys(getTemplateTypeMap().getTemplateKeys()).build(), source);
				}
			
		}
		return super.getPropertyType(name);
	}

	public com.google.javascript.rhino.jstype.FunctionType getBindReturnType(int argsToBind) {
		com.google.javascript.rhino.jstype.FunctionBuilder builder = new com.google.javascript.rhino.jstype.FunctionBuilder(registry).withReturnType(getReturnType()).withTemplateKeys(getTemplateTypeMap().getTemplateKeys());
		if (argsToBind >= 0) {
			com.google.javascript.rhino.Node origParams = getParametersNode();
			if (origParams != null) {
				com.google.javascript.rhino.Node params = origParams.cloneTree();
				for (int i = 1; (i < argsToBind) && ((params.getFirstChild()) != null); i++) {
					if (params.getFirstChild().isVarArgs()) {
						break;
					}
					params.removeFirstChild();
				}
				builder.withParamsNode(params);
			}
		}
		return builder.build();
	}

	private com.google.javascript.rhino.jstype.FunctionType getCallOrBindSignature(boolean isCall) {
		boolean isBind = !isCall;
		com.google.javascript.rhino.jstype.FunctionBuilder builder = new com.google.javascript.rhino.jstype.FunctionBuilder(registry).withReturnType((isCall ? getReturnType() : getBindReturnType((-1)))).withTemplateKeys(getTemplateTypeMap().getTemplateKeys());
		com.google.javascript.rhino.Node origParams = getParametersNode();
		if (origParams != null) {
			com.google.javascript.rhino.Node params = origParams.cloneTree();
			com.google.javascript.rhino.Node thisTypeNode = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, "thisType");
			thisTypeNode.setJSType(registry.createOptionalNullableType(getTypeOfThis()));
			params.addChildToFront(thisTypeNode);
			if (isBind) {
				for (com.google.javascript.rhino.Node current = thisTypeNode.getNext(); current != null; current = current.getNext()) {
					current.setOptionalArg(true);
				}
			}else
				if (isCall) {
					com.google.javascript.rhino.Node firstArg = thisTypeNode.getNext();
					if (((firstArg == null) || (firstArg.isOptionalArg())) || (firstArg.isVarArgs())) {
						thisTypeNode.setOptionalArg(true);
					}
				}
			
			builder.withParamsNode(params);
		}
		return builder.build();
	}

	@java.lang.Override
	boolean defineProperty(java.lang.String name, com.google.javascript.rhino.jstype.JSType type, boolean inferred, com.google.javascript.rhino.Node propertyNode) {
		if ("prototype".equals(name)) {
			com.google.javascript.rhino.jstype.ObjectType objType = type.toObjectType();
			if (objType != null) {
				if (((prototypeSlot) != null) && (objType.isEquivalentTo(prototypeSlot.getType()))) {
					return true;
				}
				setPrototypeBasedOn(objType, propertyNode);
				return true;
			}else {
				return false;
			}
		}
		return super.defineProperty(name, type, inferred, propertyNode);
	}

	com.google.javascript.rhino.jstype.FunctionType supAndInfHelper(com.google.javascript.rhino.jstype.FunctionType that, boolean leastSuper) {
		com.google.common.base.Preconditions.checkNotNull(that);
		if (isEquivalentTo(that)) {
			return com.google.javascript.rhino.jstype.FunctionType.this;
		}
		if ((((isOrdinaryFunction()) && (that.isOrdinaryFunction())) && (!(com.google.javascript.rhino.jstype.FunctionType.this.call.hasUnknownParamsOrReturn()))) && (!(that.call.hasUnknownParamsOrReturn()))) {
			boolean isSubtypeOfThat = isSubtype(that);
			boolean isSubtypeOfThis = that.isSubtype(com.google.javascript.rhino.jstype.FunctionType.this);
			if (isSubtypeOfThat && (!isSubtypeOfThis)) {
				return leastSuper ? that : com.google.javascript.rhino.jstype.FunctionType.this;
			}else
				if (isSubtypeOfThis && (!isSubtypeOfThat)) {
					return leastSuper ? com.google.javascript.rhino.jstype.FunctionType.this : that;
				}
			
			com.google.javascript.rhino.jstype.FunctionType merged = tryMergeFunctionPiecewise(that, leastSuper);
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

	private com.google.javascript.rhino.jstype.FunctionType tryMergeFunctionPiecewise(com.google.javascript.rhino.jstype.FunctionType other, boolean leastSuper) {
		com.google.javascript.rhino.Node newParamsNode = null;
		if (call.hasEqualParameters(other.call, com.google.javascript.rhino.jstype.EquivalenceMethod.IDENTITY)) {
			newParamsNode = call.parameters;
		}else {
			return null;
		}
		com.google.javascript.rhino.jstype.JSType newReturnType = leastSuper ? call.returnType.getLeastSupertype(other.call.returnType) : call.returnType.getGreatestSubtype(other.call.returnType);
		com.google.javascript.rhino.jstype.JSType newTypeOfThis = null;
		if (com.google.javascript.rhino.jstype.JSType.isEquivalent(typeOfThis, other.typeOfThis)) {
			newTypeOfThis = typeOfThis;
		}else {
			com.google.javascript.rhino.jstype.JSType maybeNewTypeOfThis = leastSuper ? typeOfThis.getLeastSupertype(other.typeOfThis) : typeOfThis.getGreatestSubtype(other.typeOfThis);
			newTypeOfThis = maybeNewTypeOfThis;
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

	public static com.google.javascript.rhino.jstype.ObjectType getTopDefiningInterface(com.google.javascript.rhino.jstype.ObjectType type, java.lang.String propertyName) {
		com.google.javascript.rhino.jstype.ObjectType foundType = null;
		if (type.hasProperty(propertyName)) {
			foundType = type;
		}
		for (com.google.javascript.rhino.jstype.ObjectType interfaceType : type.getCtorExtendedInterfaces()) {
			if (interfaceType.hasProperty(propertyName)) {
				foundType = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(interfaceType, propertyName);
			}
		}
		return foundType;
	}

	public com.google.javascript.rhino.jstype.ObjectType getTopMostDefiningType(java.lang.String propertyName) {
		com.google.common.base.Preconditions.checkState(((isConstructor()) || (isInterface())));
		com.google.common.base.Preconditions.checkArgument(getInstanceType().hasProperty(propertyName));
		com.google.javascript.rhino.jstype.FunctionType ctor = com.google.javascript.rhino.jstype.FunctionType.this;
		if (isInterface()) {
			return com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(getInstanceType(), propertyName);
		}
		com.google.javascript.rhino.jstype.ObjectType topInstanceType = null;
		do {
			topInstanceType = ctor.getInstanceType();
			ctor = ctor.getSuperClassConstructor();
		} while ((ctor != null) && (ctor.getPrototype().hasProperty(propertyName)) );
		return topInstanceType;
	}

	boolean checkFunctionEquivalenceHelper(com.google.javascript.rhino.jstype.FunctionType that, com.google.javascript.rhino.jstype.EquivalenceMethod eqMethod) {
		if (isConstructor()) {
			if (that.isConstructor()) {
				return (com.google.javascript.rhino.jstype.FunctionType.this) == that;
			}
			return false;
		}
		if (isInterface()) {
			if (that.isInterface()) {
				return getReferenceName().equals(that.getReferenceName());
			}
			return false;
		}
		if (that.isInterface()) {
			return false;
		}
		return (typeOfThis.checkEquivalenceHelper(that.typeOfThis, eqMethod)) && (call.checkArrowEquivalenceHelper(that.call, eqMethod));
	}

	@java.lang.Override
	public int hashCode() {
		return isInterface() ? getReferenceName().hashCode() : call.hashCode();
	}

	public boolean hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType otherType) {
		return com.google.javascript.rhino.jstype.FunctionType.this.call.checkArrowEquivalenceHelper(otherType.call, com.google.javascript.rhino.jstype.EquivalenceMethod.IDENTITY);
	}

	@java.lang.Override
	java.lang.String toStringHelper(boolean forAnnotations) {
		if ((!(isPrettyPrint())) || ((com.google.javascript.rhino.jstype.FunctionType.this) == (registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_INSTANCE_TYPE)))) {
			return "Function";
		}
		setPrettyPrint(false);
		java.lang.StringBuilder b = new java.lang.StringBuilder(32);
		b.append("function (");
		int paramNum = call.parameters.getChildCount();
		boolean hasKnownTypeOfThis = !((typeOfThis) instanceof com.google.javascript.rhino.jstype.UnknownType);
		if (hasKnownTypeOfThis) {
			if (isConstructor()) {
				b.append("new:");
			}else {
				b.append("this:");
			}
			b.append(typeOfThis.toStringHelper(forAnnotations));
		}
		if (paramNum > 0) {
			if (hasKnownTypeOfThis) {
				b.append(", ");
			}
			com.google.javascript.rhino.Node p = call.parameters.getFirstChild();
			appendArgString(b, p, forAnnotations);
			p = p.getNext();
			while (p != null) {
				b.append(", ");
				appendArgString(b, p, forAnnotations);
				p = p.getNext();
			} 
		}
		b.append("): ");
		b.append(call.returnType.toStringHelper(forAnnotations));
		setPrettyPrint(true);
		return b.toString();
	}

	private void appendArgString(java.lang.StringBuilder b, com.google.javascript.rhino.Node p, boolean forAnnotations) {
		if (p.isVarArgs()) {
			appendVarArgsString(b, p.getJSType(), forAnnotations);
		}else
			if (p.isOptionalArg()) {
				appendOptionalArgString(b, p.getJSType(), forAnnotations);
			}else {
				b.append(p.getJSType().toStringHelper(forAnnotations));
			}
		
	}

	private void appendVarArgsString(java.lang.StringBuilder builder, com.google.javascript.rhino.jstype.JSType paramType, boolean forAnnotations) {
		if (paramType.isUnionType()) {
			paramType = paramType.toMaybeUnionType().getRestrictedUnion(registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE));
		}
		builder.append("...[").append(paramType.toStringHelper(forAnnotations)).append("]");
	}

	private void appendOptionalArgString(java.lang.StringBuilder builder, com.google.javascript.rhino.jstype.JSType paramType, boolean forAnnotations) {
		if (paramType.isUnionType()) {
			paramType = paramType.toMaybeUnionType().getRestrictedUnion(registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE));
		}
		builder.append(paramType.toStringHelper(forAnnotations)).append("=");
	}

	@java.lang.Override
	public boolean isSubtype(com.google.javascript.rhino.jstype.JSType that) {
		if (com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(com.google.javascript.rhino.jstype.FunctionType.this, that)) {
			return true;
		}
		if (that.isFunctionType()) {
			com.google.javascript.rhino.jstype.FunctionType other = that.toMaybeFunctionType();
			if (other.isInterface()) {
				return true;
			}
			if (isInterface()) {
				return false;
			}
			boolean treatThisTypesAsCovariant = (((((other.typeOfThis.toObjectType()) != null) && ((other.typeOfThis.toObjectType().getConstructor()) != null)) && (other.typeOfThis.toObjectType().getConstructor().isInterface())) || (other.typeOfThis.isSubtype(com.google.javascript.rhino.jstype.FunctionType.this.typeOfThis))) || (com.google.javascript.rhino.jstype.FunctionType.this.typeOfThis.isSubtype(other.typeOfThis));
			return treatThisTypesAsCovariant && (com.google.javascript.rhino.jstype.FunctionType.this.call.isSubtype(other.call));
		}
		return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_PROTOTYPE).isSubtype(that);
	}

	@java.lang.Override
	public <T> T visit(com.google.javascript.rhino.jstype.Visitor<T> visitor) {
		return visitor.caseFunctionType(com.google.javascript.rhino.jstype.FunctionType.this);
	}

	@java.lang.Override
	<T> T visit(com.google.javascript.rhino.jstype.RelationshipVisitor<T> visitor, com.google.javascript.rhino.jstype.JSType that) {
		return visitor.caseFunctionType(com.google.javascript.rhino.jstype.FunctionType.this, that);
	}

	public com.google.javascript.rhino.jstype.ObjectType getInstanceType() {
		com.google.common.base.Preconditions.checkState(hasInstanceType());
		return typeOfThis.toObjectType();
	}

	void setInstanceType(com.google.javascript.rhino.jstype.ObjectType instanceType) {
		typeOfThis = instanceType;
	}

	public boolean hasInstanceType() {
		return (isConstructor()) || (isInterface());
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getTypeOfThis() {
		return typeOfThis.isEmptyType() ? registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE) : typeOfThis;
	}

	public com.google.javascript.rhino.Node getSource() {
		return source;
	}

	public void setSource(com.google.javascript.rhino.Node source) {
		if ((prototypeSlot) != null) {
			if ((source == null) || ((prototypeSlot.getNode()) == null)) {
				prototypeSlot = new com.google.javascript.rhino.jstype.Property(prototypeSlot.getName(), prototypeSlot.getType(), prototypeSlot.isTypeInferred(), source);
			}
		}
		com.google.javascript.rhino.jstype.FunctionType.this.source = source;
	}

	private void addSubType(com.google.javascript.rhino.jstype.FunctionType subType) {
		if ((subTypes) == null) {
			subTypes = com.google.common.collect.Lists.newArrayList();
		}
		subTypes.add(subType);
	}

	@java.lang.Override
	public void clearCachedValues() {
		super.clearCachedValues();
		if ((subTypes) != null) {
			for (com.google.javascript.rhino.jstype.FunctionType subType : subTypes) {
				subType.clearCachedValues();
			}
		}
		if (!(isNativeObjectType())) {
			if (hasInstanceType()) {
				getInstanceType().clearCachedValues();
			}
			if ((prototypeSlot) != null) {
				((com.google.javascript.rhino.jstype.ObjectType) (prototypeSlot.getType())).clearCachedValues();
			}
		}
	}

	public java.util.List<com.google.javascript.rhino.jstype.FunctionType> getSubTypes() {
		return subTypes;
	}

	@java.lang.Override
	public boolean hasCachedValues() {
		return ((prototypeSlot) != null) || (super.hasCachedValues());
	}

	@java.lang.Override
	com.google.javascript.rhino.jstype.JSType resolveInternal(com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope) {
		setResolvedTypeInternal(com.google.javascript.rhino.jstype.FunctionType.this);
		call = ((com.google.javascript.rhino.jstype.ArrowType) (com.google.javascript.rhino.jstype.JSType.safeResolve(call, t, scope)));
		if ((prototypeSlot) != null) {
			prototypeSlot.setType(com.google.javascript.rhino.jstype.JSType.safeResolve(prototypeSlot.getType(), t, scope));
		}
		com.google.javascript.rhino.jstype.JSType maybeTypeOfThis = com.google.javascript.rhino.jstype.JSType.safeResolve(typeOfThis, t, scope);
		if (maybeTypeOfThis != null) {
			maybeTypeOfThis = maybeTypeOfThis.restrictByNotNullOrUndefined();
		}
		if (maybeTypeOfThis instanceof com.google.javascript.rhino.jstype.ObjectType) {
			typeOfThis = maybeTypeOfThis;
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
				subTypes.set(i, com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(subTypes.get(i).resolve(t, scope)));
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

	public com.google.javascript.rhino.jstype.FunctionType cloneWithoutArrowType() {
		com.google.javascript.rhino.jstype.FunctionType result = new com.google.javascript.rhino.jstype.FunctionType(registry, getReferenceName(), source, registry.createArrowType(null, null), getInstanceType(), null, true, false);
		result.setPrototypeBasedOn(getInstanceType());
		return result;
	}

	@java.lang.Override
	public boolean hasAnyTemplateTypesInternal() {
		return (((getTemplateTypeMap().numUnfilledTemplateKeys()) > 0) || (typeOfThis.hasAnyTemplateTypes())) || (call.hasAnyTemplateTypes());
	}
}




package com.google.javascript.jscomp;


class TypeValidator {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.rhino.jstype.JSTypeRegistry typeRegistry;

	private final com.google.javascript.rhino.jstype.JSType allValueTypes;

	private boolean shouldReport = true;

	private final com.google.javascript.rhino.jstype.JSType nullOrUndefined;

	private final java.util.List<com.google.javascript.jscomp.TypeValidator.TypeMismatch> mismatches = com.google.common.collect.Lists.newArrayList();

	private static final java.lang.String FOUND_REQUIRED = "{0}\n" + ("found   : {1}\n" + "required: {2}");

	static final com.google.javascript.jscomp.DiagnosticType INVALID_CAST = com.google.javascript.jscomp.DiagnosticType.disabled("JSC_INVALID_CAST", ("invalid cast - must be a subtype or supertype\n" + ("from: {0}\n" + "to  : {1}")));

	static final com.google.javascript.jscomp.DiagnosticType TYPE_MISMATCH_WARNING = com.google.javascript.jscomp.DiagnosticType.warning("JSC_TYPE_MISMATCH", "{0}");

	static final com.google.javascript.jscomp.DiagnosticType MISSING_EXTENDS_TAG_WARNING = com.google.javascript.jscomp.DiagnosticType.warning("JSC_MISSING_EXTENDS_TAG", "Missing @extends tag on type {0}");

	static final com.google.javascript.jscomp.DiagnosticType DUP_VAR_DECLARATION = com.google.javascript.jscomp.DiagnosticType.warning("JSC_DUP_VAR_DECLARATION", ("variable {0} redefined with type {1}, " + "original definition at {2}:{3} with type {4}"));

	static final com.google.javascript.jscomp.DiagnosticType HIDDEN_PROPERTY_MISMATCH = com.google.javascript.jscomp.DiagnosticType.warning("JSC_HIDDEN_PROPERTY_MISMATCH", ("mismatch of the {0} property type and the type " + (("of the property it overrides from superclass {1}\n" + "original: {2}\n") + "override: {3}")));

	static final com.google.javascript.jscomp.DiagnosticType INTERFACE_METHOD_NOT_IMPLEMENTED = com.google.javascript.jscomp.DiagnosticType.warning("JSC_INTERFACE_METHOD_NOT_IMPLEMENTED", "property {0} on interface {1} is not implemented by type {2}");

	static final com.google.javascript.jscomp.DiagnosticType HIDDEN_INTERFACE_PROPERTY_MISMATCH = com.google.javascript.jscomp.DiagnosticType.warning("JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH", ("mismatch of the {0} property type and the type " + (("of the property it overrides from interface {1}\n" + "original: {2}\n") + "override: {3}")));

	static final com.google.javascript.jscomp.DiagnosticType UNKNOWN_TYPEOF_VALUE = com.google.javascript.jscomp.DiagnosticType.warning("JSC_UNKNOWN_TYPEOF_VALUE", "unknown type: {0}");

	static final com.google.javascript.jscomp.DiagnosticType ILLEGAL_PROPERTY_ACCESS = com.google.javascript.jscomp.DiagnosticType.warning("JSC_ILLEGAL_PROPERTY_ACCESS", "Cannot do {0} access on a {1}");

	static final com.google.javascript.jscomp.DiagnosticGroup ALL_DIAGNOSTICS = new com.google.javascript.jscomp.DiagnosticGroup(com.google.javascript.jscomp.TypeValidator.INVALID_CAST, com.google.javascript.jscomp.TypeValidator.TYPE_MISMATCH_WARNING, com.google.javascript.jscomp.TypeValidator.MISSING_EXTENDS_TAG_WARNING, com.google.javascript.jscomp.TypeValidator.DUP_VAR_DECLARATION, com.google.javascript.jscomp.TypeValidator.HIDDEN_PROPERTY_MISMATCH, com.google.javascript.jscomp.TypeValidator.INTERFACE_METHOD_NOT_IMPLEMENTED, com.google.javascript.jscomp.TypeValidator.HIDDEN_INTERFACE_PROPERTY_MISMATCH, com.google.javascript.jscomp.TypeValidator.UNKNOWN_TYPEOF_VALUE, com.google.javascript.jscomp.TypeValidator.ILLEGAL_PROPERTY_ACCESS);

	TypeValidator(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
		this.typeRegistry = compiler.getTypeRegistry();
		this.allValueTypes = typeRegistry.createUnionType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE);
		this.nullOrUndefined = typeRegistry.createUnionType(com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE);
	}

	java.lang.Iterable<com.google.javascript.jscomp.TypeValidator.TypeMismatch> getMismatches() {
		return mismatches;
	}

	void setShouldReport(boolean report) {
		com.google.javascript.jscomp.TypeValidator.this.shouldReport = report;
	}

	void expectValidTypeofName(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, java.lang.String found) {
		report(com.google.javascript.jscomp.JSError.make(t.getSourceName(), n, com.google.javascript.jscomp.TypeValidator.UNKNOWN_TYPEOF_VALUE, found));
	}

	boolean expectObject(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSType type, java.lang.String msg) {
		if (!(type.matchesObjectContext())) {
			mismatch(t, n, msg, type, com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE);
			return false;
		}
		return true;
	}

	void expectActualObject(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSType type, java.lang.String msg) {
		if (!(type.isObject())) {
			mismatch(t, n, msg, type, com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE);
		}
	}

	void expectAnyObject(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSType type, java.lang.String msg) {
		com.google.javascript.rhino.jstype.JSType anyObjectType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE);
		if ((!(anyObjectType.isSubtype(type))) && (!(type.isEmptyType()))) {
			mismatch(t, n, msg, type, anyObjectType);
		}
	}

	void expectString(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSType type, java.lang.String msg) {
		if (!(type.matchesStringContext())) {
			mismatch(t, n, msg, type, com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
		}
	}

	void expectNumber(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSType type, java.lang.String msg) {
		if (!(type.matchesNumberContext())) {
			mismatch(t, n, msg, type, com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
		}
	}

	void expectBitwiseable(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSType type, java.lang.String msg) {
		if ((!(type.matchesNumberContext())) && (!(type.isSubtype(allValueTypes)))) {
			mismatch(t, n, msg, type, allValueTypes);
		}
	}

	void expectStringOrNumber(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSType type, java.lang.String msg) {
		if ((!(type.matchesNumberContext())) && (!(type.matchesStringContext()))) {
			mismatch(t, n, msg, type, com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_STRING);
		}
	}

	boolean expectNotNullOrUndefined(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSType type, java.lang.String msg, com.google.javascript.rhino.jstype.JSType expectedType) {
		if ((((!(type.isNoType())) && (!(type.isUnknownType()))) && (type.isSubtype(nullOrUndefined))) && (!(containsForwardDeclaredUnresolvedName(type)))) {
			if (((n.isGetProp()) && (!(t.inGlobalScope()))) && (type.isNullType())) {
				return true;
			}
			mismatch(t, n, msg, type, expectedType);
			return false;
		}
		return true;
	}

	private boolean containsForwardDeclaredUnresolvedName(com.google.javascript.rhino.jstype.JSType type) {
		if (type.isUnionType()) {
			for (com.google.javascript.rhino.jstype.JSType alt : type.toMaybeUnionType().getAlternates()) {
				if (containsForwardDeclaredUnresolvedName(alt)) {
					return true;
				}
			}
		}
		return type.isNoResolvedType();
	}

	void expectSwitchMatchesCase(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSType switchType, com.google.javascript.rhino.jstype.JSType caseType) {
		if ((!(switchType.canTestForShallowEqualityWith(caseType))) && (((caseType.autoboxesTo()) == null) || (!(caseType.autoboxesTo().isSubtype(switchType))))) {
			mismatch(t, n.getFirstChild(), "case expression doesn't match switch", caseType, switchType);
		}
	}

	void expectIndexMatch(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSType objType, com.google.javascript.rhino.jstype.JSType indexType) {
		com.google.common.base.Preconditions.checkState(n.isGetElem());
		com.google.javascript.rhino.Node indexNode = n.getLastChild();
		if (objType.isStruct()) {
			report(com.google.javascript.jscomp.JSError.make(t.getSourceName(), indexNode, com.google.javascript.jscomp.TypeValidator.ILLEGAL_PROPERTY_ACCESS, "'[]'", "struct"));
		}
		if (objType.isUnknownType()) {
			expectStringOrNumber(t, indexNode, indexType, "property access");
		}else {
			com.google.javascript.rhino.jstype.ObjectType dereferenced = objType.dereference();
			if ((dereferenced != null) && ((dereferenced.getIndexType()) != null)) {
				expectCanAssignTo(t, indexNode, indexType, dereferenced.getIndexType(), "restricted index type");
			}else
				if ((dereferenced != null) && (dereferenced.isArrayType())) {
					expectNumber(t, indexNode, indexType, "array access");
				}else
					if (objType.matchesObjectContext()) {
						expectString(t, indexNode, indexType, "property access");
					}else {
						mismatch(t, n, "only arrays or objects can be accessed", objType, typeRegistry.createUnionType(com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE));
					}
				
			
		}
	}

	boolean expectCanAssignToPropertyOf(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSType rightType, com.google.javascript.rhino.jstype.JSType leftType, com.google.javascript.rhino.Node owner, java.lang.String propName) {
		if ((!(leftType.isNoType())) && (!(rightType.isSubtype(leftType)))) {
			com.google.javascript.rhino.jstype.JSType ownerType = getJSType(owner);
			if (ownerType.isFunctionPrototypeType()) {
				com.google.javascript.rhino.jstype.FunctionType ownerFn = ownerType.toObjectType().getOwnerFunction();
				if (((ownerFn.isInterface()) && (rightType.isFunctionType())) && (leftType.isFunctionType())) {
					return true;
				}
			}
			mismatch(t, n, ((("assignment to property " + propName) + " of ") + (getReadableJSTypeName(owner, true))), rightType, leftType);
			return false;
		}
		return true;
	}

	boolean expectCanAssignTo(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSType rightType, com.google.javascript.rhino.jstype.JSType leftType, java.lang.String msg) {
		if (!(rightType.isSubtype(leftType))) {
			mismatch(t, n, msg, rightType, leftType);
			return false;
		}
		return true;
	}

	void expectArgumentMatchesParameter(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSType argType, com.google.javascript.rhino.jstype.JSType paramType, com.google.javascript.rhino.Node callNode, int ordinal) {
		if (!(argType.isSubtype(paramType))) {
			mismatch(t, n, java.lang.String.format(("actual parameter %d of %s does not match " + "formal parameter"), ordinal, getReadableJSTypeName(callNode.getFirstChild(), false)), argType, paramType);
		}
	}

	void expectCanOverride(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSType overridingType, com.google.javascript.rhino.jstype.JSType hiddenType, java.lang.String propertyName, com.google.javascript.rhino.jstype.JSType ownerType) {
		if (!(overridingType.isSubtype(hiddenType))) {
			registerMismatch(overridingType, hiddenType, report(t.makeError(n, com.google.javascript.jscomp.TypeValidator.HIDDEN_PROPERTY_MISMATCH, propertyName, ownerType.toString(), hiddenType.toString(), overridingType.toString())));
		}
	}

	void expectSuperType(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.ObjectType superObject, com.google.javascript.rhino.jstype.ObjectType subObject) {
		com.google.javascript.rhino.jstype.FunctionType subCtor = subObject.getConstructor();
		com.google.javascript.rhino.jstype.ObjectType implicitProto = subObject.getImplicitPrototype();
		com.google.javascript.rhino.jstype.ObjectType declaredSuper = implicitProto == null ? null : implicitProto.getImplicitPrototype();
		if (((declaredSuper != null) && (!(superObject instanceof com.google.javascript.rhino.jstype.UnknownType))) && (!(declaredSuper.isEquivalentTo(superObject)))) {
			if (declaredSuper.isEquivalentTo(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE))) {
				registerMismatch(superObject, declaredSuper, report(t.makeError(n, com.google.javascript.jscomp.TypeValidator.MISSING_EXTENDS_TAG_WARNING, subObject.toString())));
			}else {
				mismatch(t.getSourceName(), n, "mismatch in declaration of superclass type", superObject, declaredSuper);
			}
			if (!(subCtor.hasCachedValues())) {
				subCtor.setPrototypeBasedOn(superObject);
			}
		}
	}

	void expectCanCast(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSType castType, com.google.javascript.rhino.jstype.JSType type) {
		if (!(type.canCastTo(castType))) {
			registerMismatch(type, castType, report(t.makeError(n, com.google.javascript.jscomp.TypeValidator.INVALID_CAST, type.toString(), castType.toString())));
		}
	}

	com.google.javascript.jscomp.Scope.Var expectUndeclaredVariable(java.lang.String sourceName, com.google.javascript.jscomp.CompilerInput input, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent, com.google.javascript.jscomp.Scope.Var var, java.lang.String variableName, com.google.javascript.rhino.jstype.JSType newType) {
		com.google.javascript.jscomp.Scope.Var newVar = var;
		boolean allowDupe = false;
		if ((n.isGetProp()) || (com.google.javascript.jscomp.NodeUtil.isObjectLitKey(n, parent))) {
			com.google.javascript.rhino.JSDocInfo info = n.getJSDocInfo();
			if (info == null) {
				info = parent.getJSDocInfo();
			}
			allowDupe = (info != null) && (info.getSuppressions().contains("duplicate"));
		}
		com.google.javascript.rhino.jstype.JSType varType = var.getType();
		if ((((varType != null) && (varType != (typeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE)))) && (newType != null)) && (newType != (typeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE)))) {
			if ((var.input) == null) {
				com.google.javascript.jscomp.Scope s = var.getScope();
				s.undeclare(var);
				newVar = s.declare(variableName, n, varType, input, false);
				n.setJSType(varType);
				if (parent.isVar()) {
					if ((n.getFirstChild()) != null) {
						n.getFirstChild().setJSType(varType);
					}
				}else {
					com.google.common.base.Preconditions.checkState(parent.isFunction());
					parent.setJSType(varType);
				}
			}else {
				if ((!(allowDupe || (var.getParentNode().isExprResult()))) || (!(newType.isEquivalentTo(varType)))) {
					report(com.google.javascript.jscomp.JSError.make(sourceName, n, com.google.javascript.jscomp.TypeValidator.DUP_VAR_DECLARATION, variableName, newType.toString(), var.getInputName(), java.lang.String.valueOf(var.nameNode.getLineno()), varType.toString()));
				}
			}
		}
		return newVar;
	}

	void expectAllInterfaceProperties(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.FunctionType type) {
		com.google.javascript.rhino.jstype.ObjectType instance = type.getInstanceType();
		for (com.google.javascript.rhino.jstype.ObjectType implemented : type.getAllImplementedInterfaces()) {
			if ((implemented.getImplicitPrototype()) != null) {
				for (java.lang.String prop : implemented.getImplicitPrototype().getOwnPropertyNames()) {
					expectInterfaceProperty(t, n, instance, implemented, prop);
				}
			}
		}
	}

	private void expectInterfaceProperty(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.ObjectType instance, com.google.javascript.rhino.jstype.ObjectType implementedInterface, java.lang.String prop) {
		com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> propSlot = instance.getSlot(prop);
		if (propSlot == null) {
			java.lang.String sourceName = n.getSourceFileName();
			sourceName = (sourceName == null) ? "" : sourceName;
			registerMismatch(instance, implementedInterface, report(com.google.javascript.jscomp.JSError.make(sourceName, n, com.google.javascript.jscomp.TypeValidator.INTERFACE_METHOD_NOT_IMPLEMENTED, prop, implementedInterface.toString(), instance.toString())));
		}else {
			com.google.javascript.rhino.Node propNode = (propSlot.getDeclaration()) == null ? null : propSlot.getDeclaration().getNode();
			propNode = (propNode == null) ? n : propNode;
			com.google.javascript.rhino.jstype.JSType found = propSlot.getType();
			com.google.javascript.rhino.jstype.JSType required = implementedInterface.getImplicitPrototype().getPropertyType(prop);
			found = found.restrictByNotNullOrUndefined();
			required = required.restrictByNotNullOrUndefined();
			if (!(found.isSubtype(required))) {
				com.google.javascript.rhino.jstype.FunctionType constructor = implementedInterface.toObjectType().getConstructor();
				registerMismatch(found, required, report(t.makeError(propNode, com.google.javascript.jscomp.TypeValidator.HIDDEN_INTERFACE_PROPERTY_MISMATCH, prop, constructor.getTopMostDefiningType(prop).toString(), required.toString(), found.toString())));
			}
		}
	}

	private void mismatch(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, java.lang.String msg, com.google.javascript.rhino.jstype.JSType found, com.google.javascript.rhino.jstype.JSType required) {
		mismatch(t.getSourceName(), n, msg, found, required);
	}

	private void mismatch(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, java.lang.String msg, com.google.javascript.rhino.jstype.JSType found, com.google.javascript.rhino.jstype.JSTypeNative required) {
		mismatch(t, n, msg, found, getNativeType(required));
	}

	private void mismatch(java.lang.String sourceName, com.google.javascript.rhino.Node n, java.lang.String msg, com.google.javascript.rhino.jstype.JSType found, com.google.javascript.rhino.jstype.JSType required) {
		registerMismatch(found, required, report(com.google.javascript.jscomp.JSError.make(sourceName, n, com.google.javascript.jscomp.TypeValidator.TYPE_MISMATCH_WARNING, formatFoundRequired(msg, found, required))));
	}

	private void registerMismatch(com.google.javascript.rhino.jstype.JSType found, com.google.javascript.rhino.jstype.JSType required, com.google.javascript.jscomp.JSError error) {
		found = found.restrictByNotNullOrUndefined();
		required = required.restrictByNotNullOrUndefined();
		if ((found.isSubtype(required)) || (required.isSubtype(found))) {
			return ;
		}
		mismatches.add(new com.google.javascript.jscomp.TypeValidator.TypeMismatch(found, required, error));
		if ((found.isFunctionType()) && (required.isFunctionType())) {
			com.google.javascript.rhino.jstype.FunctionType fnTypeA = found.toMaybeFunctionType();
			com.google.javascript.rhino.jstype.FunctionType fnTypeB = required.toMaybeFunctionType();
			java.util.Iterator<com.google.javascript.rhino.Node> paramItA = fnTypeA.getParameters().iterator();
			java.util.Iterator<com.google.javascript.rhino.Node> paramItB = fnTypeB.getParameters().iterator();
			while ((paramItA.hasNext()) && (paramItB.hasNext())) {
				registerIfMismatch(paramItA.next().getJSType(), paramItB.next().getJSType(), error);
			} 
			registerIfMismatch(fnTypeA.getReturnType(), fnTypeB.getReturnType(), error);
		}
	}

	private void registerIfMismatch(com.google.javascript.rhino.jstype.JSType found, com.google.javascript.rhino.jstype.JSType required, com.google.javascript.jscomp.JSError error) {
		if (((found != null) && (required != null)) && (!(found.isSubtype(required)))) {
			registerMismatch(found, required, error);
		}
	}

	private java.lang.String formatFoundRequired(java.lang.String description, com.google.javascript.rhino.jstype.JSType found, com.google.javascript.rhino.jstype.JSType required) {
		return java.text.MessageFormat.format(com.google.javascript.jscomp.TypeValidator.FOUND_REQUIRED, description, found, required);
	}

	java.lang.String getReadableJSTypeName(com.google.javascript.rhino.Node n, boolean dereference) {
		if (n.isGetProp()) {
			com.google.javascript.rhino.jstype.ObjectType objectType = getJSType(n.getFirstChild()).dereference();
			if (objectType != null) {
				java.lang.String propName = n.getLastChild().getString();
				if (((objectType.getConstructor()) != null) && (objectType.getConstructor().isInterface())) {
					objectType = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType, propName);
				}else {
					while ((objectType != null) && (!(objectType.hasOwnProperty(propName)))) {
						objectType = objectType.getImplicitPrototype();
					} 
				}
				if ((objectType != null) && (((objectType.getConstructor()) != null) || (objectType.isFunctionPrototypeType()))) {
					return ((objectType.toString()) + ".") + propName;
				}
			}
		}
		com.google.javascript.rhino.jstype.JSType type = getJSType(n);
		if (dereference) {
			com.google.javascript.rhino.jstype.ObjectType dereferenced = type.dereference();
			if (dereferenced != null) {
				type = dereferenced;
			}
		}
		java.lang.String qualifiedName = n.getQualifiedName();
		if ((type.isFunctionPrototypeType()) || (((type.toObjectType()) != null) && ((type.toObjectType().getConstructor()) != null))) {
			return type.toString();
		}else
			if (qualifiedName != null) {
				return qualifiedName;
			}else
				if (type.isFunctionType()) {
					return "function";
				}else {
					return type.toString();
				}
			
		
	}

	private com.google.javascript.rhino.jstype.JSType getJSType(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.jstype.JSType jsType = n.getJSType();
		if (jsType == null) {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
		}else {
			return jsType;
		}
	}

	private com.google.javascript.rhino.jstype.JSType getNativeType(com.google.javascript.rhino.jstype.JSTypeNative typeId) {
		return typeRegistry.getNativeType(typeId);
	}

	private com.google.javascript.jscomp.JSError report(com.google.javascript.jscomp.JSError error) {
		if (shouldReport) {
			compiler.report(error);
		}
		return error;
	}

	static class TypeMismatch {
		final com.google.javascript.rhino.jstype.JSType typeA;

		final com.google.javascript.rhino.jstype.JSType typeB;

		final com.google.javascript.jscomp.JSError src;

		TypeMismatch(com.google.javascript.rhino.jstype.JSType a, com.google.javascript.rhino.jstype.JSType b, com.google.javascript.jscomp.JSError src) {
			this.typeA = a;
			this.typeB = b;
			this.src = src;
		}

		@java.lang.Override
		public boolean equals(java.lang.Object object) {
			if (object instanceof com.google.javascript.jscomp.TypeValidator.TypeMismatch) {
				com.google.javascript.jscomp.TypeValidator.TypeMismatch that = ((com.google.javascript.jscomp.TypeValidator.TypeMismatch) (object));
				return ((that.typeA.isEquivalentTo(com.google.javascript.jscomp.TypeValidator.TypeMismatch.this.typeA)) && (that.typeB.isEquivalentTo(com.google.javascript.jscomp.TypeValidator.TypeMismatch.this.typeB))) || ((that.typeB.isEquivalentTo(com.google.javascript.jscomp.TypeValidator.TypeMismatch.this.typeA)) && (that.typeA.isEquivalentTo(com.google.javascript.jscomp.TypeValidator.TypeMismatch.this.typeB)));
			}
			return false;
		}

		@java.lang.Override
		public int hashCode() {
			return com.google.common.base.Objects.hashCode(typeA, typeB);
		}

		@java.lang.Override
		public java.lang.String toString() {
			return ((("(" + (typeA)) + ", ") + (typeB)) + ")";
		}
	}
}




package com.google.javascript.jscomp;


class TypeValidator {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.rhino.jstype.JSTypeRegistry typeRegistry;

	private final com.google.javascript.rhino.jstype.JSType allValueTypes;

	private boolean shouldReport = true;

	private final com.google.javascript.rhino.jstype.JSType nullOrUndefined;

	private final java.util.List<com.google.javascript.jscomp.TypeValidator.TypeMismatch> mismatches = com.google.common.collect.Lists.newArrayList();

	private static final java.lang.String FOUND_REQUIRED = "{0}\n" + ("found   : {1}\n" + "required: {2}");

	static final com.google.javascript.jscomp.DiagnosticType INVALID_CAST = com.google.javascript.jscomp.DiagnosticType.warning("JSC_INVALID_CAST", ("invalid cast - must be a subtype or supertype\n" + ("from: {0}\n" + "to  : {1}")));

	static final com.google.javascript.jscomp.DiagnosticType TYPE_MISMATCH_WARNING = com.google.javascript.jscomp.DiagnosticType.warning("JSC_TYPE_MISMATCH", "{0}");

	static final com.google.javascript.jscomp.DiagnosticType MISSING_EXTENDS_TAG_WARNING = com.google.javascript.jscomp.DiagnosticType.warning("JSC_MISSING_EXTENDS_TAG", "Missing @extends tag on type {0}");

	static final com.google.javascript.jscomp.DiagnosticType DUP_VAR_DECLARATION = com.google.javascript.jscomp.DiagnosticType.warning("JSC_DUP_VAR_DECLARATION", ("variable {0} redefined with type {1}, " + "original definition at {2}:{3} with type {4}"));

	static final com.google.javascript.jscomp.DiagnosticType HIDDEN_PROPERTY_MISMATCH = com.google.javascript.jscomp.DiagnosticType.warning("JSC_HIDDEN_PROPERTY_MISMATCH", ("mismatch of the {0} property type and the type " + (("of the property it overrides from superclass {1}\n" + "original: {2}\n") + "override: {3}")));

	static final com.google.javascript.jscomp.DiagnosticType INTERFACE_METHOD_NOT_IMPLEMENTED = com.google.javascript.jscomp.DiagnosticType.warning("JSC_INTERFACE_METHOD_NOT_IMPLEMENTED", "property {0} on interface {1} is not implemented by type {2}");

	static final com.google.javascript.jscomp.DiagnosticType HIDDEN_INTERFACE_PROPERTY_MISMATCH = com.google.javascript.jscomp.DiagnosticType.warning("JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH", ("mismatch of the {0} property type and the type " + (("of the property it overrides from interface {1}\n" + "original: {2}\n") + "override: {3}")));

	static final com.google.javascript.jscomp.DiagnosticGroup ALL_DIAGNOSTICS = new com.google.javascript.jscomp.DiagnosticGroup(com.google.javascript.jscomp.TypeValidator.INVALID_CAST, com.google.javascript.jscomp.TypeValidator.TYPE_MISMATCH_WARNING, com.google.javascript.jscomp.TypeValidator.MISSING_EXTENDS_TAG_WARNING, com.google.javascript.jscomp.TypeValidator.DUP_VAR_DECLARATION, com.google.javascript.jscomp.TypeValidator.HIDDEN_PROPERTY_MISMATCH, com.google.javascript.jscomp.TypeValidator.INTERFACE_METHOD_NOT_IMPLEMENTED, com.google.javascript.jscomp.TypeValidator.HIDDEN_INTERFACE_PROPERTY_MISMATCH);

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
			if ((((n.getType()) == (com.google.javascript.rhino.Token.GETPROP)) && (!(t.inGlobalScope()))) && (type.isNullType())) {
				return true;
			}
			mismatch(t, n, msg, type, expectedType);
			return false;
		}
		return true;
	}

	private boolean containsForwardDeclaredUnresolvedName(com.google.javascript.rhino.jstype.JSType type) {
		if (type instanceof com.google.javascript.rhino.jstype.UnionType) {
			for (com.google.javascript.rhino.jstype.JSType alt : ((com.google.javascript.rhino.jstype.UnionType) (type)).getAlternates()) {
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
		if (objType.isUnknownType()) {
			expectStringOrNumber(t, n, indexType, "property access");
		}else
			if (((objType.toObjectType()) != null) && ((objType.toObjectType().getIndexType()) != null)) {
				expectCanAssignTo(t, n, indexType, objType.toObjectType().getIndexType(), "restricted index type");
			}else
				if (objType.isArrayType()) {
					expectNumber(t, n, indexType, "array access");
				}else
					if (objType.matchesObjectContext()) {
						expectString(t, n, indexType, "property access");
					}else {
						mismatch(t, n, "only arrays or objects can be accessed", objType, typeRegistry.createUnionType(com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE));
					}
				
			
		
	}

	boolean expectCanAssignToPropertyOf(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSType rightType, com.google.javascript.rhino.jstype.JSType leftType, com.google.javascript.rhino.Node owner, java.lang.String propName) {
		if ((!(leftType.isNoType())) && (!(rightType.canAssignTo(leftType)))) {
			if (bothIntrinsics(rightType, leftType)) {
				registerMismatch(rightType, leftType);
			}else {
				mismatch(t, n, ((("assignment to property " + propName) + " of ") + (getReadableJSTypeName(owner, true))), rightType, leftType);
			}
			return false;
		}
		return true;
	}

	boolean expectCanAssignTo(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSType rightType, com.google.javascript.rhino.jstype.JSType leftType, java.lang.String msg) {
		if (!(rightType.canAssignTo(leftType))) {
			if (bothIntrinsics(rightType, leftType)) {
				registerMismatch(rightType, leftType);
			}else {
				mismatch(t, n, msg, rightType, leftType);
			}
			return false;
		}
		return true;
	}

	private boolean bothIntrinsics(com.google.javascript.rhino.jstype.JSType rightType, com.google.javascript.rhino.jstype.JSType leftType) {
		return ((leftType.isConstructor()) || (leftType.isEnumType())) && ((rightType.isConstructor()) || (rightType.isEnumType()));
	}

	void expectArgumentMatchesParameter(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSType argType, com.google.javascript.rhino.jstype.JSType paramType, com.google.javascript.rhino.Node callNode, int ordinal) {
		if (!(argType.canAssignTo(paramType))) {
			mismatch(t, n, java.lang.String.format(("actual parameter %d of %s does not match " + "formal parameter"), ordinal, getReadableJSTypeName(callNode.getFirstChild(), false)), argType, paramType);
		}
	}

	void expectCanOverride(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSType overridingType, com.google.javascript.rhino.jstype.JSType hiddenType, java.lang.String propertyName, com.google.javascript.rhino.jstype.JSType ownerType) {
		if (!(overridingType.canAssignTo(hiddenType))) {
			registerMismatch(overridingType, hiddenType);
			if (shouldReport) {
				compiler.report(t.makeError(n, com.google.javascript.jscomp.TypeValidator.HIDDEN_PROPERTY_MISMATCH, propertyName, ownerType.toString(), hiddenType.toString(), overridingType.toString()));
			}
		}
	}

	void expectSuperType(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.ObjectType superObject, com.google.javascript.rhino.jstype.ObjectType subObject) {
		com.google.javascript.rhino.jstype.FunctionType subCtor = subObject.getConstructor();
		com.google.javascript.rhino.jstype.ObjectType declaredSuper = subObject.getImplicitPrototype().getImplicitPrototype();
		if (!(declaredSuper.equals(superObject))) {
			if (declaredSuper.equals(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE))) {
				if (shouldReport) {
					compiler.report(t.makeError(n, com.google.javascript.jscomp.TypeValidator.MISSING_EXTENDS_TAG_WARNING, subObject.toString()));
				}
				registerMismatch(superObject, declaredSuper);
			}else {
				mismatch(t.getSourceName(), n, "mismatch in declaration of superclass type", superObject, declaredSuper);
			}
			if (!(subCtor.hasCachedValues())) {
				subCtor.setPrototypeBasedOn(superObject);
			}
		}
	}

	void expectCanCast(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSType type, com.google.javascript.rhino.jstype.JSType castType) {
		castType = castType.restrictByNotNullOrUndefined();
		type = type.restrictByNotNullOrUndefined();
		if ((!(type.canAssignTo(castType))) && (!(castType.canAssignTo(type)))) {
			if (shouldReport) {
				compiler.report(t.makeError(n, com.google.javascript.jscomp.TypeValidator.INVALID_CAST, castType.toString(), type.toString()));
			}
			registerMismatch(type, castType);
		}
	}

	void expectUndeclaredVariable(java.lang.String sourceName, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent, com.google.javascript.jscomp.Scope.Var var, java.lang.String variableName, com.google.javascript.rhino.jstype.JSType newType) {
		boolean allowDupe = false;
		if (((n.getType()) == (com.google.javascript.rhino.Token.GETPROP)) || (com.google.javascript.jscomp.NodeUtil.isObjectLitKey(n, parent))) {
			com.google.javascript.rhino.JSDocInfo info = n.getJSDocInfo();
			if (info == null) {
				info = parent.getJSDocInfo();
			}
			allowDupe = (info != null) && (info.getSuppressions().contains("duplicate"));
		}
		com.google.javascript.rhino.jstype.JSType varType = var.getType();
		if ((((varType != null) && (varType != (typeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE)))) && (newType != null)) && (newType != (typeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE)))) {
			if ((var.input) == null) {
				n.setJSType(varType);
				if ((parent.getType()) == (com.google.javascript.rhino.Token.VAR)) {
					if ((n.getFirstChild()) != null) {
						n.getFirstChild().setJSType(varType);
					}
				}else {
					com.google.common.base.Preconditions.checkState(((parent.getType()) == (com.google.javascript.rhino.Token.FUNCTION)));
					parent.setJSType(varType);
				}
			}else {
				if ((!(allowDupe || ((var.getParentNode().getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT)))) || (!(newType.equals(varType)))) {
					if (shouldReport) {
						compiler.report(com.google.javascript.jscomp.JSError.make(sourceName, n, com.google.javascript.jscomp.TypeValidator.DUP_VAR_DECLARATION, variableName, newType.toString(), var.getInputName(), java.lang.String.valueOf(var.nameNode.getLineno()), varType.toString()));
					}
				}
			}
		}
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
		if (!(instance.hasProperty(prop))) {
			java.lang.String sourceName = n.getSourceFileName();
			sourceName = (sourceName == null) ? "" : sourceName;
			if (shouldReport) {
				compiler.report(com.google.javascript.jscomp.JSError.make(sourceName, n, com.google.javascript.jscomp.TypeValidator.INTERFACE_METHOD_NOT_IMPLEMENTED, prop, implementedInterface.toString(), instance.toString()));
			}
			registerMismatch(instance, implementedInterface);
		}else {
			com.google.javascript.rhino.jstype.JSType found = instance.getPropertyType(prop);
			com.google.javascript.rhino.jstype.JSType required = implementedInterface.getImplicitPrototype().getPropertyType(prop);
			found = found.restrictByNotNullOrUndefined();
			required = required.restrictByNotNullOrUndefined();
			if (!(found.canAssignTo(required))) {
				if (shouldReport) {
					com.google.javascript.rhino.jstype.FunctionType constructor = implementedInterface.toObjectType().getConstructor();
					compiler.report(t.makeError(n, com.google.javascript.jscomp.TypeValidator.HIDDEN_INTERFACE_PROPERTY_MISMATCH, prop, constructor.getTopMostDefiningType(prop).toString(), required.toString(), found.toString()));
				}
				registerMismatch(found, required);
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
		registerMismatch(found, required);
		if (shouldReport) {
			compiler.report(com.google.javascript.jscomp.JSError.make(sourceName, n, com.google.javascript.jscomp.TypeValidator.TYPE_MISMATCH_WARNING, formatFoundRequired(msg, found, required)));
		}
	}

	private void registerMismatch(com.google.javascript.rhino.jstype.JSType found, com.google.javascript.rhino.jstype.JSType required) {
		found = found.restrictByNotNullOrUndefined();
		required = required.restrictByNotNullOrUndefined();
		if ((found.canAssignTo(required)) || (required.canAssignTo(found))) {
			return ;
		}
		mismatches.add(new com.google.javascript.jscomp.TypeValidator.TypeMismatch(found, required));
		if ((found instanceof com.google.javascript.rhino.jstype.FunctionType) && (required instanceof com.google.javascript.rhino.jstype.FunctionType)) {
			com.google.javascript.rhino.jstype.FunctionType fnTypeA = ((com.google.javascript.rhino.jstype.FunctionType) (found));
			com.google.javascript.rhino.jstype.FunctionType fnTypeB = ((com.google.javascript.rhino.jstype.FunctionType) (required));
			java.util.Iterator<com.google.javascript.rhino.Node> paramItA = fnTypeA.getParameters().iterator();
			java.util.Iterator<com.google.javascript.rhino.Node> paramItB = fnTypeB.getParameters().iterator();
			while ((paramItA.hasNext()) && (paramItB.hasNext())) {
				registerIfMismatch(paramItA.next().getJSType(), paramItB.next().getJSType());
			} 
			registerIfMismatch(fnTypeA.getReturnType(), fnTypeB.getReturnType());
		}
	}

	private void registerIfMismatch(com.google.javascript.rhino.jstype.JSType found, com.google.javascript.rhino.jstype.JSType required) {
		if (((found != null) && (required != null)) && (!(found.canAssignTo(required)))) {
			registerMismatch(found, required);
		}
	}

	private java.lang.String formatFoundRequired(java.lang.String description, com.google.javascript.rhino.jstype.JSType found, com.google.javascript.rhino.jstype.JSType required) {
		return java.text.MessageFormat.format(com.google.javascript.jscomp.TypeValidator.FOUND_REQUIRED, description, found, required);
	}

	java.lang.String getReadableJSTypeName(com.google.javascript.rhino.Node n, boolean dereference) {
		if ((n.getType()) == (com.google.javascript.rhino.Token.GETPROP)) {
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
				if (type instanceof com.google.javascript.rhino.jstype.FunctionType) {
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

	static class TypeMismatch {
		final com.google.javascript.rhino.jstype.JSType typeA;

		final com.google.javascript.rhino.jstype.JSType typeB;

		TypeMismatch(com.google.javascript.rhino.jstype.JSType a, com.google.javascript.rhino.jstype.JSType b) {
			this.typeA = a;
			this.typeB = b;
		}

		@java.lang.Override
		public boolean equals(java.lang.Object object) {
			if (object instanceof com.google.javascript.jscomp.TypeValidator.TypeMismatch) {
				com.google.javascript.jscomp.TypeValidator.TypeMismatch that = ((com.google.javascript.jscomp.TypeValidator.TypeMismatch) (object));
				return ((that.typeA.equals(com.google.javascript.jscomp.TypeValidator.TypeMismatch.this.typeA)) && (that.typeB.equals(com.google.javascript.jscomp.TypeValidator.TypeMismatch.this.typeB))) || ((that.typeB.equals(com.google.javascript.jscomp.TypeValidator.TypeMismatch.this.typeA)) && (that.typeA.equals(com.google.javascript.jscomp.TypeValidator.TypeMismatch.this.typeB)));
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


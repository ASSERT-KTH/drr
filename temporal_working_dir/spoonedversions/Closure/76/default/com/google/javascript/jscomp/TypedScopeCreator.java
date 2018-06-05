

package com.google.javascript.jscomp;


final class TypedScopeCreator implements com.google.javascript.jscomp.ScopeCreator {
	static final java.lang.String DELEGATE_PROXY_SUFFIX = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("Proxy");

	private static final java.lang.String LEGACY_TYPEDEF = "goog.typedef";

	static final com.google.javascript.jscomp.DiagnosticType MALFORMED_TYPEDEF = com.google.javascript.jscomp.DiagnosticType.warning("JSC_MALFORMED_TYPEDEF", "Typedef for {0} does not have any type information");

	static final com.google.javascript.jscomp.DiagnosticType ENUM_INITIALIZER = com.google.javascript.jscomp.DiagnosticType.warning("JSC_ENUM_INITIALIZER_NOT_ENUM", "enum initializer must be an object literal or an enum");

	static final com.google.javascript.jscomp.DiagnosticType CTOR_INITIALIZER = com.google.javascript.jscomp.DiagnosticType.warning("JSC_CTOR_INITIALIZER_NOT_CTOR", "Constructor {0} must be initialized at declaration");

	static final com.google.javascript.jscomp.DiagnosticType IFACE_INITIALIZER = com.google.javascript.jscomp.DiagnosticType.warning("JSC_IFACE_INITIALIZER_NOT_IFACE", "Interface {0} must be initialized at declaration");

	static final com.google.javascript.jscomp.DiagnosticType CONSTRUCTOR_EXPECTED = com.google.javascript.jscomp.DiagnosticType.warning("JSC_REFLECT_CONSTRUCTOR_EXPECTED", "Constructor expected as first argument");

	static final com.google.javascript.jscomp.DiagnosticType UNKNOWN_LENDS = com.google.javascript.jscomp.DiagnosticType.warning("JSC_UNKNOWN_LENDS", "Variable {0} not declared before @lends annotation.");

	static final com.google.javascript.jscomp.DiagnosticType LENDS_ON_NON_OBJECT = com.google.javascript.jscomp.DiagnosticType.warning("JSC_LENDS_ON_NON_OBJECT", "May only lend properties to object types. {0} has type {1}.");

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.rhino.ErrorReporter typeParsingErrorReporter;

	private final com.google.javascript.jscomp.TypeValidator validator;

	private final com.google.javascript.jscomp.CodingConvention codingConvention;

	private final com.google.javascript.rhino.jstype.JSTypeRegistry typeRegistry;

	private final java.util.List<com.google.javascript.rhino.jstype.ObjectType> delegateProxyPrototypes = com.google.common.collect.Lists.newArrayList();

	private class DeferredSetType {
		final com.google.javascript.rhino.Node node;

		final com.google.javascript.rhino.jstype.JSType type;

		DeferredSetType(com.google.javascript.rhino.Node node, com.google.javascript.rhino.jstype.JSType type) {
			com.google.common.base.Preconditions.checkNotNull(node);
			com.google.common.base.Preconditions.checkNotNull(type);
			this.node = node;
			this.type = type;
			node.setJSType(type);
		}

		void resolve(com.google.javascript.jscomp.Scope scope) {
			node.setJSType(type.resolve(typeParsingErrorReporter, scope));
		}
	}

	TypedScopeCreator(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this(compiler, compiler.getCodingConvention());
	}

	TypedScopeCreator(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.CodingConvention codingConvention) {
		this.compiler = compiler;
		this.validator = compiler.getTypeValidator();
		this.codingConvention = codingConvention;
		this.typeRegistry = compiler.getTypeRegistry();
		this.typeParsingErrorReporter = typeRegistry.getErrorReporter();
	}

	public com.google.javascript.jscomp.Scope createScope(com.google.javascript.rhino.Node root, com.google.javascript.jscomp.Scope parent) {
		com.google.javascript.jscomp.Scope newScope = null;
		com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder scopeBuilder = null;
		if (parent == null) {
			newScope = createInitialScope(root);
			com.google.javascript.jscomp.TypedScopeCreator.GlobalScopeBuilder globalScopeBuilder = new com.google.javascript.jscomp.TypedScopeCreator.GlobalScopeBuilder(newScope);
			scopeBuilder = globalScopeBuilder;
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, scopeBuilder);
		}else {
			newScope = new com.google.javascript.jscomp.Scope(parent, root);
			com.google.javascript.jscomp.TypedScopeCreator.LocalScopeBuilder localScopeBuilder = new com.google.javascript.jscomp.TypedScopeCreator.LocalScopeBuilder(newScope);
			scopeBuilder = localScopeBuilder;
			localScopeBuilder.build();
		}
		scopeBuilder.resolveStubDeclarations();
		scopeBuilder.resolveTypes();
		for (com.google.javascript.rhino.Node functionNode : scopeBuilder.nonExternFunctions) {
			com.google.javascript.rhino.jstype.JSType type = functionNode.getJSType();
			if ((type != null) && (type instanceof com.google.javascript.rhino.jstype.FunctionType)) {
				com.google.javascript.rhino.jstype.FunctionType fnType = ((com.google.javascript.rhino.jstype.FunctionType) (type));
				com.google.javascript.rhino.jstype.ObjectType fnThisType = fnType.getTypeOfThis();
				if (!(fnThisType.isUnknownType())) {
					com.google.javascript.jscomp.NodeTraversal.traverse(compiler, functionNode.getLastChild(), scopeBuilder.new CollectProperties(fnThisType));
				}
			}
		}
		if (parent == null) {
			codingConvention.defineDelegateProxyPrototypeProperties(typeRegistry, newScope, delegateProxyPrototypes);
		}
		return newScope;
	}

	@com.google.common.annotations.VisibleForTesting
	com.google.javascript.jscomp.Scope createInitialScope(com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.TypedScopeCreator.DiscoverEnumsAndTypedefs(typeRegistry));
		com.google.javascript.jscomp.Scope s = new com.google.javascript.jscomp.Scope(root, compiler);
		declareNativeFunctionType(s, com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_FUNCTION_TYPE);
		declareNativeFunctionType(s, com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_OBJECT_FUNCTION_TYPE);
		declareNativeFunctionType(s, com.google.javascript.rhino.jstype.JSTypeNative.DATE_FUNCTION_TYPE);
		declareNativeFunctionType(s, com.google.javascript.rhino.jstype.JSTypeNative.ERROR_FUNCTION_TYPE);
		declareNativeFunctionType(s, com.google.javascript.rhino.jstype.JSTypeNative.EVAL_ERROR_FUNCTION_TYPE);
		declareNativeFunctionType(s, com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE);
		declareNativeFunctionType(s, com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_OBJECT_FUNCTION_TYPE);
		declareNativeFunctionType(s, com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_FUNCTION_TYPE);
		declareNativeFunctionType(s, com.google.javascript.rhino.jstype.JSTypeNative.RANGE_ERROR_FUNCTION_TYPE);
		declareNativeFunctionType(s, com.google.javascript.rhino.jstype.JSTypeNative.REFERENCE_ERROR_FUNCTION_TYPE);
		declareNativeFunctionType(s, com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_FUNCTION_TYPE);
		declareNativeFunctionType(s, com.google.javascript.rhino.jstype.JSTypeNative.STRING_OBJECT_FUNCTION_TYPE);
		declareNativeFunctionType(s, com.google.javascript.rhino.jstype.JSTypeNative.SYNTAX_ERROR_FUNCTION_TYPE);
		declareNativeFunctionType(s, com.google.javascript.rhino.jstype.JSTypeNative.TYPE_ERROR_FUNCTION_TYPE);
		declareNativeFunctionType(s, com.google.javascript.rhino.jstype.JSTypeNative.URI_ERROR_FUNCTION_TYPE);
		declareNativeValueType(s, "undefined", com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE);
		declareNativeValueType(s, com.google.javascript.jscomp.TypedScopeCreator.LEGACY_TYPEDEF, com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
		declareNativeValueType(s, "ActiveXObject", com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE);
		return s;
	}

	private void declareNativeFunctionType(com.google.javascript.jscomp.Scope scope, com.google.javascript.rhino.jstype.JSTypeNative tId) {
		com.google.javascript.rhino.jstype.FunctionType t = typeRegistry.getNativeFunctionType(tId);
		declareNativeType(scope, t.getInstanceType().getReferenceName(), t);
		declareNativeType(scope, t.getPrototype().getReferenceName(), t.getPrototype());
	}

	private void declareNativeValueType(com.google.javascript.jscomp.Scope scope, java.lang.String name, com.google.javascript.rhino.jstype.JSTypeNative tId) {
		declareNativeType(scope, name, typeRegistry.getNativeType(tId));
	}

	private void declareNativeType(com.google.javascript.jscomp.Scope scope, java.lang.String name, com.google.javascript.rhino.jstype.JSType t) {
		scope.declare(name, null, t, null, false);
	}

	private static class DiscoverEnumsAndTypedefs extends com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback {
		private final com.google.javascript.rhino.jstype.JSTypeRegistry registry;

		DiscoverEnumsAndTypedefs(com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
			this.registry = registry;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
			com.google.javascript.rhino.Node nameNode = null;
			switch (node.getType()) {
				case com.google.javascript.rhino.Token.VAR :
					for (com.google.javascript.rhino.Node child = node.getFirstChild(); child != null; child = child.getNext()) {
						identifyNameNode(child, child.getFirstChild(), com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(child));
					}
					break;
				case com.google.javascript.rhino.Token.EXPR_RESULT :
					com.google.javascript.rhino.Node firstChild = node.getFirstChild();
					if ((firstChild.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) {
						identifyNameNode(firstChild.getFirstChild(), firstChild.getLastChild(), firstChild.getJSDocInfo());
					}else {
						identifyNameNode(firstChild, null, firstChild.getJSDocInfo());
					}
					break;
			}
		}

		private void identifyNameNode(com.google.javascript.rhino.Node nameNode, com.google.javascript.rhino.Node valueNode, com.google.javascript.rhino.JSDocInfo info) {
			if (nameNode.isQualifiedName()) {
				if (info != null) {
					if (info.hasEnumParameterType()) {
						registry.identifyNonNullableName(nameNode.getQualifiedName());
					}else
						if (info.hasTypedefType()) {
							registry.identifyNonNullableName(nameNode.getQualifiedName());
						}
					
				}
				if ((valueNode != null) && (com.google.javascript.jscomp.TypedScopeCreator.LEGACY_TYPEDEF.equals(valueNode.getQualifiedName()))) {
					registry.identifyNonNullableName(nameNode.getQualifiedName());
				}
			}
		}
	}

	private static com.google.javascript.rhino.Node getPrototypePropertyOwner(com.google.javascript.rhino.Node n) {
		if ((n.getType()) == (com.google.javascript.rhino.Token.GETPROP)) {
			com.google.javascript.rhino.Node firstChild = n.getFirstChild();
			if (((firstChild.getType()) == (com.google.javascript.rhino.Token.GETPROP)) && (firstChild.getLastChild().getString().equals("prototype"))) {
				com.google.javascript.rhino.Node maybeOwner = firstChild.getFirstChild();
				if (maybeOwner.isQualifiedName()) {
					return maybeOwner;
				}
			}
		}
		return null;
	}

	private com.google.javascript.rhino.jstype.JSType getNativeType(com.google.javascript.rhino.jstype.JSTypeNative nativeType) {
		return typeRegistry.getNativeType(nativeType);
	}

	private abstract class AbstractScopeBuilder implements com.google.javascript.jscomp.NodeTraversal.Callback {
		final com.google.javascript.jscomp.Scope scope;

		private final java.util.List<com.google.javascript.jscomp.TypedScopeCreator.DeferredSetType> deferredSetTypes = com.google.common.collect.Lists.newArrayList();

		private final java.util.List<com.google.javascript.rhino.Node> nonExternFunctions = com.google.common.collect.Lists.newArrayList();

		private final java.util.List<com.google.javascript.jscomp.TypedScopeCreator.StubDeclaration> stubDeclarations = com.google.common.collect.Lists.newArrayList();

		private java.lang.String sourceName = null;

		private AbstractScopeBuilder(com.google.javascript.jscomp.Scope scope) {
			this.scope = scope;
		}

		void setDeferredType(com.google.javascript.rhino.Node node, com.google.javascript.rhino.jstype.JSType type) {
			deferredSetTypes.add(new com.google.javascript.jscomp.TypedScopeCreator.DeferredSetType(node, type));
		}

		void resolveTypes() {
			for (com.google.javascript.jscomp.TypedScopeCreator.DeferredSetType deferred : deferredSetTypes) {
				deferred.resolve(scope);
			}
			java.util.Iterator<com.google.javascript.jscomp.Scope.Var> vars = scope.getVars();
			while (vars.hasNext()) {
				vars.next().resolveType(typeParsingErrorReporter);
			} 
			typeRegistry.resolveTypesInScope(scope);
		}

		@java.lang.Override
		public final boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal nodeTraversal, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (((n.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) || ((n.getType()) == (com.google.javascript.rhino.Token.SCRIPT))) {
				sourceName = ((java.lang.String) (n.getProp(com.google.javascript.rhino.Node.SOURCENAME_PROP)));
			}
			boolean descend = (((parent == null) || ((parent.getType()) != (com.google.javascript.rhino.Token.FUNCTION))) || (n == (parent.getFirstChild()))) || (parent == (scope.getRootNode()));
			if (descend) {
				if (com.google.javascript.jscomp.NodeUtil.isStatementParent(n)) {
					for (com.google.javascript.rhino.Node child = n.getFirstChild(); child != null; child = child.getNext()) {
						if (com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(child)) {
							defineFunctionLiteral(child, n);
						}
					}
				}
			}
			return descend;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			attachLiteralTypes(t, n);
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.CALL :
					checkForClassDefiningCalls(t, n, parent);
					break;
				case com.google.javascript.rhino.Token.FUNCTION :
					if (((t.getInput()) == null) || (!(t.getInput().isExtern()))) {
						nonExternFunctions.add(n);
					}
					if (!(com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(n))) {
						defineFunctionLiteral(n, parent);
					}
					break;
				case com.google.javascript.rhino.Token.ASSIGN :
					com.google.javascript.rhino.Node firstChild = n.getFirstChild();
					if (((firstChild.getType()) == (com.google.javascript.rhino.Token.GETPROP)) && (firstChild.isQualifiedName())) {
						maybeDeclareQualifiedName(t, n.getJSDocInfo(), firstChild, n, firstChild.getNext());
					}
					break;
				case com.google.javascript.rhino.Token.CATCH :
					defineCatch(n, parent);
					break;
				case com.google.javascript.rhino.Token.VAR :
					defineVar(n, parent);
					break;
				case com.google.javascript.rhino.Token.GETPROP :
					if (((parent.getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT)) && (n.isQualifiedName())) {
						maybeDeclareQualifiedName(t, n.getJSDocInfo(), n, parent, null);
					}
					break;
			}
		}

		private void attachLiteralTypes(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.NULL :
					n.setJSType(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE));
					break;
				case com.google.javascript.rhino.Token.VOID :
					n.setJSType(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE));
					break;
				case com.google.javascript.rhino.Token.STRING :
					if (!(com.google.javascript.jscomp.NodeUtil.isObjectLitKey(n, n.getParent()))) {
						n.setJSType(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE));
					}
					break;
				case com.google.javascript.rhino.Token.NUMBER :
					if (!(com.google.javascript.jscomp.NodeUtil.isObjectLitKey(n, n.getParent()))) {
						n.setJSType(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE));
					}
					break;
				case com.google.javascript.rhino.Token.TRUE :
				case com.google.javascript.rhino.Token.FALSE :
					n.setJSType(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE));
					break;
				case com.google.javascript.rhino.Token.REGEXP :
					n.setJSType(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_TYPE));
					break;
				case com.google.javascript.rhino.Token.REF_SPECIAL :
					n.setJSType(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE));
					break;
				case com.google.javascript.rhino.Token.OBJECTLIT :
					defineObjectLiteral(t, n);
					break;
			}
		}

		private void defineObjectLiteral(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node objectLit) {
			com.google.javascript.rhino.jstype.JSType type = null;
			com.google.javascript.rhino.JSDocInfo info = objectLit.getJSDocInfo();
			if ((info != null) && ((info.getLendsName()) != null)) {
				java.lang.String lendsName = info.getLendsName();
				com.google.javascript.jscomp.Scope.Var lendsVar = scope.getVar(lendsName);
				if (lendsVar == null) {
					compiler.report(com.google.javascript.jscomp.JSError.make(sourceName, objectLit, com.google.javascript.jscomp.TypedScopeCreator.UNKNOWN_LENDS, lendsName));
				}else {
					type = lendsVar.getType();
					if (type == null) {
						type = typeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
					}
					if (!(type.isSubtype(typeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE)))) {
						compiler.report(com.google.javascript.jscomp.JSError.make(sourceName, objectLit, com.google.javascript.jscomp.TypedScopeCreator.LENDS_ON_NON_OBJECT, lendsName, type.toString()));
						type = null;
					}else {
						objectLit.setJSType(type);
					}
				}
			}
			info = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(objectLit);
			com.google.javascript.rhino.Node lValue = com.google.javascript.jscomp.TypedScopeCreator.getBestLValue(objectLit);
			java.lang.String lValueName = com.google.javascript.jscomp.TypedScopeCreator.getBestLValueName(lValue);
			boolean createdEnumType = false;
			if ((info != null) && (info.hasEnumParameterType())) {
				type = createEnumTypeFromNodes(objectLit, lValueName, info, lValue);
				createdEnumType = true;
			}
			if (type == null) {
				type = typeRegistry.createAnonymousObjectType();
			}
			setDeferredType(objectLit, type);
			if (!createdEnumType) {
				processObjectLitProperties(t, objectLit, com.google.javascript.rhino.jstype.ObjectType.cast(objectLit.getJSType()));
			}
		}

		void processObjectLitProperties(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node objLit, com.google.javascript.rhino.jstype.ObjectType objLitType) {
			for (com.google.javascript.rhino.Node keyNode = objLit.getFirstChild(); keyNode != null; keyNode = keyNode.getNext()) {
				com.google.javascript.rhino.Node value = keyNode.getFirstChild();
				java.lang.String memberName = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyName(keyNode);
				com.google.javascript.rhino.JSDocInfo info = keyNode.getJSDocInfo();
				com.google.javascript.rhino.jstype.JSType valueType = getDeclaredType(t.getSourceName(), info, keyNode, value);
				com.google.javascript.rhino.jstype.JSType keyType = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(keyNode, valueType);
				if (keyType != null) {
					java.lang.String qualifiedName = com.google.javascript.jscomp.TypedScopeCreator.getBestLValueName(keyNode);
					if (qualifiedName != null) {
						defineSlot(keyNode, objLit, qualifiedName, keyType, false);
					}else {
						setDeferredType(keyNode, keyType);
					}
					if (objLitType != null) {
						boolean isExtern = ((t.getInput()) != null) && (t.getInput().isExtern());
						objLitType.defineDeclaredProperty(memberName, keyType, isExtern, keyNode);
					}
				}
			}
		}

		private com.google.javascript.rhino.jstype.JSType getDeclaredTypeInAnnotation(java.lang.String sourceName, com.google.javascript.rhino.Node node, com.google.javascript.rhino.JSDocInfo info) {
			com.google.javascript.rhino.jstype.JSType jsType = null;
			com.google.javascript.rhino.Node objNode = (node.getType()) == (com.google.javascript.rhino.Token.GETPROP) ? node.getFirstChild() : com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node, node.getParent()) ? node.getParent() : null;
			if (info != null) {
				if (info.hasType()) {
					jsType = info.getType().evaluate(scope, typeRegistry);
				}else
					if (com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(info)) {
						java.lang.String fnName = node.getQualifiedName();
						jsType = createFunctionTypeFromNodes(null, fnName, info, node);
					}
				
			}
			return jsType;
		}

		void assertDefinitionNode(com.google.javascript.rhino.Node n, int type) {
			com.google.common.base.Preconditions.checkState(((sourceName) != null));
			com.google.common.base.Preconditions.checkState(((n.getType()) == type));
		}

		void defineCatch(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			assertDefinitionNode(n, com.google.javascript.rhino.Token.CATCH);
			com.google.javascript.rhino.Node catchName = n.getFirstChild();
			defineSlot(catchName, n, null);
		}

		void defineVar(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			assertDefinitionNode(n, com.google.javascript.rhino.Token.VAR);
			com.google.javascript.rhino.JSDocInfo info = n.getJSDocInfo();
			if (n.hasMoreThanOneChild()) {
				if (info != null) {
					compiler.report(com.google.javascript.jscomp.JSError.make(sourceName, n, com.google.javascript.jscomp.TypeCheck.MULTIPLE_VAR_DEF));
				}
				for (com.google.javascript.rhino.Node name : n.children()) {
					defineName(name, n, parent, name.getJSDocInfo());
				}
			}else {
				com.google.javascript.rhino.Node name = n.getFirstChild();
				defineName(name, n, parent, (info != null ? info : name.getJSDocInfo()));
			}
		}

		void defineFunctionLiteral(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			assertDefinitionNode(n, com.google.javascript.rhino.Token.FUNCTION);
			com.google.javascript.rhino.Node lValue = com.google.javascript.jscomp.TypedScopeCreator.getBestLValue(n);
			com.google.javascript.rhino.JSDocInfo info = com.google.javascript.jscomp.TypedScopeCreator.getBestJSDocInfo(n);
			java.lang.String functionName = com.google.javascript.jscomp.TypedScopeCreator.getBestLValueName(lValue);
			com.google.javascript.rhino.jstype.FunctionType functionType = createFunctionTypeFromNodes(n, functionName, info, lValue);
			setDeferredType(n, functionType);
			if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n)) {
				defineSlot(n.getFirstChild(), n, functionType);
			}
		}

		private void defineName(com.google.javascript.rhino.Node name, com.google.javascript.rhino.Node var, com.google.javascript.rhino.Node parent, com.google.javascript.rhino.JSDocInfo info) {
			com.google.javascript.rhino.Node value = name.getFirstChild();
			com.google.javascript.rhino.jstype.JSType type = getDeclaredType(sourceName, info, name, value);
			if (type == null) {
				com.google.javascript.jscomp.CompilerInput input = compiler.getInput(sourceName);
				com.google.common.base.Preconditions.checkNotNull(input, sourceName);
				type = (input.isExtern()) ? getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE) : null;
			}
			defineSlot(name, var, type);
		}

		private boolean shouldUseFunctionLiteralType(com.google.javascript.rhino.jstype.FunctionType type, com.google.javascript.rhino.JSDocInfo info, com.google.javascript.rhino.Node lValue) {
			if (info != null) {
				return true;
			}
			if ((lValue != null) && (com.google.javascript.jscomp.NodeUtil.isObjectLitKey(lValue, lValue.getParent()))) {
				return false;
			}
			return (scope.isGlobal()) || (!(type.isReturnTypeInferred()));
		}

		private com.google.javascript.rhino.jstype.FunctionType createFunctionTypeFromNodes(@javax.annotation.Nullable
		com.google.javascript.rhino.Node rValue, @javax.annotation.Nullable
		java.lang.String name, @javax.annotation.Nullable
		com.google.javascript.rhino.JSDocInfo info, @javax.annotation.Nullable
		com.google.javascript.rhino.Node lvalueNode) {
			com.google.javascript.rhino.jstype.FunctionType functionType = null;
			if (((rValue != null) && (rValue.isQualifiedName())) && (scope.isGlobal())) {
				com.google.javascript.jscomp.Scope.Var var = scope.getVar(rValue.getQualifiedName());
				if ((var != null) && ((var.getType()) instanceof com.google.javascript.rhino.jstype.FunctionType)) {
					com.google.javascript.rhino.jstype.FunctionType aliasedType = ((com.google.javascript.rhino.jstype.FunctionType) (var.getType()));
					if (((aliasedType.isConstructor()) || (aliasedType.isInterface())) && (!(aliasedType.isNativeObjectType()))) {
						functionType = aliasedType;
						if ((name != null) && (scope.isGlobal())) {
							typeRegistry.declareType(name, functionType.getInstanceType());
						}
					}
				}
			}
			if (functionType == null) {
				com.google.javascript.rhino.Node errorRoot = rValue == null ? lvalueNode : rValue;
				boolean isFnLiteral = (rValue != null) && ((rValue.getType()) == (com.google.javascript.rhino.Token.FUNCTION));
				com.google.javascript.rhino.Node fnRoot = isFnLiteral ? rValue : null;
				com.google.javascript.rhino.Node parametersNode = isFnLiteral ? rValue.getFirstChild().getNext() : null;
				com.google.javascript.rhino.Node fnBlock = isFnLiteral ? parametersNode.getNext() : null;
				if ((info != null) && (info.hasType())) {
					com.google.javascript.rhino.jstype.JSType type = info.getType().evaluate(scope, typeRegistry);
					type = type.restrictByNotNullOrUndefined();
					if (type.isFunctionType()) {
						functionType = ((com.google.javascript.rhino.jstype.FunctionType) (type));
						functionType.setJSDocInfo(info);
					}
				}
				if (functionType == null) {
					com.google.javascript.rhino.jstype.FunctionType overriddenPropType = null;
					if (((lvalueNode != null) && ((lvalueNode.getType()) == (com.google.javascript.rhino.Token.GETPROP))) && (lvalueNode.isQualifiedName())) {
						com.google.javascript.jscomp.Scope.Var var = scope.getVar(lvalueNode.getFirstChild().getQualifiedName());
						if (var != null) {
							com.google.javascript.rhino.jstype.ObjectType ownerType = com.google.javascript.rhino.jstype.ObjectType.cast(var.getType());
							if (ownerType != null) {
								java.lang.String propName = lvalueNode.getLastChild().getString();
								overriddenPropType = findOverriddenFunction(ownerType, propName);
							}
						}
					}
					com.google.javascript.jscomp.FunctionTypeBuilder builder = new com.google.javascript.jscomp.FunctionTypeBuilder(name, compiler, errorRoot, sourceName, scope).setSourceNode(fnRoot).inferFromOverriddenFunction(overriddenPropType, parametersNode).inferTemplateTypeName(info).inferReturnType(info).inferInheritance(info);
					boolean searchedForThisType = false;
					if ((lvalueNode != null) && ((lvalueNode.getType()) == (com.google.javascript.rhino.Token.GETPROP))) {
						com.google.javascript.rhino.Node objNode = lvalueNode.getFirstChild();
						if (((objNode.getType()) == (com.google.javascript.rhino.Token.GETPROP)) && (objNode.getLastChild().getString().equals("prototype"))) {
							builder.inferThisType(info, objNode.getFirstChild());
							searchedForThisType = true;
						}else
							if ((objNode.getType()) == (com.google.javascript.rhino.Token.THIS)) {
								builder.inferThisType(info, objNode.getJSType());
								searchedForThisType = true;
							}
						
					}
					if (!searchedForThisType) {
						builder.inferThisType(info, ((com.google.javascript.rhino.Node) (null)));
					}
					functionType = builder.inferParameterTypes(parametersNode, info).inferReturnStatementsAsLastResort(fnBlock).buildAndRegister();
				}
			}
			return functionType;
		}

		private com.google.javascript.rhino.jstype.FunctionType findOverriddenFunction(com.google.javascript.rhino.jstype.ObjectType ownerType, java.lang.String propName) {
			com.google.javascript.rhino.jstype.JSType propType = ownerType.getPropertyType(propName);
			if (propType instanceof com.google.javascript.rhino.jstype.FunctionType) {
				return ((com.google.javascript.rhino.jstype.FunctionType) (propType));
			}else {
				for (com.google.javascript.rhino.jstype.ObjectType iface : ownerType.getCtorImplementedInterfaces()) {
					propType = iface.getPropertyType(propName);
					if (propType instanceof com.google.javascript.rhino.jstype.FunctionType) {
						return ((com.google.javascript.rhino.jstype.FunctionType) (propType));
					}
				}
			}
			return null;
		}

		private com.google.javascript.rhino.jstype.EnumType createEnumTypeFromNodes(com.google.javascript.rhino.Node rValue, java.lang.String name, com.google.javascript.rhino.JSDocInfo info, com.google.javascript.rhino.Node lValueNode) {
			com.google.common.base.Preconditions.checkNotNull(info);
			com.google.common.base.Preconditions.checkState(info.hasEnumParameterType());
			com.google.javascript.rhino.jstype.EnumType enumType = null;
			if ((rValue != null) && (rValue.isQualifiedName())) {
				com.google.javascript.jscomp.Scope.Var var = scope.getVar(rValue.getQualifiedName());
				if ((var != null) && ((var.getType()) instanceof com.google.javascript.rhino.jstype.EnumType)) {
					enumType = ((com.google.javascript.rhino.jstype.EnumType) (var.getType()));
				}
			}
			if (enumType == null) {
				com.google.javascript.rhino.jstype.JSType elementsType = info.getEnumParameterType().evaluate(scope, typeRegistry);
				enumType = typeRegistry.createEnumType(name, elementsType);
				if ((rValue != null) && ((rValue.getType()) == (com.google.javascript.rhino.Token.OBJECTLIT))) {
					com.google.javascript.rhino.Node key = rValue.getFirstChild();
					while (key != null) {
						java.lang.String keyName = com.google.javascript.jscomp.NodeUtil.getStringValue(key);
						if (keyName == null) {
							compiler.report(com.google.javascript.jscomp.JSError.make(sourceName, key, com.google.javascript.jscomp.TypeCheck.ENUM_NOT_CONSTANT, keyName));
						}else
							if (enumType.hasOwnProperty(keyName)) {
								compiler.report(com.google.javascript.jscomp.JSError.make(sourceName, key, com.google.javascript.jscomp.TypeCheck.ENUM_DUP, keyName));
							}else
								if (!(codingConvention.isValidEnumKey(keyName))) {
									compiler.report(com.google.javascript.jscomp.JSError.make(sourceName, key, com.google.javascript.jscomp.TypeCheck.ENUM_NOT_CONSTANT, keyName));
								}else {
									enumType.defineElement(keyName, key);
								}
							
						
						key = key.getNext();
					} 
				}
			}
			if ((name != null) && (scope.isGlobal())) {
				typeRegistry.declareType(name, enumType.getElementsType());
			}
			return enumType;
		}

		private void defineSlot(com.google.javascript.rhino.Node name, com.google.javascript.rhino.Node parent, com.google.javascript.rhino.jstype.JSType type) {
			defineSlot(name, parent, type, (type == null));
		}

		void defineSlot(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent, com.google.javascript.rhino.jstype.JSType type, boolean inferred) {
			com.google.common.base.Preconditions.checkArgument((inferred || (type != null)));
			if ((n.getType()) == (com.google.javascript.rhino.Token.NAME)) {
				com.google.common.base.Preconditions.checkArgument((((((parent.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) || ((parent.getType()) == (com.google.javascript.rhino.Token.VAR))) || ((parent.getType()) == (com.google.javascript.rhino.Token.LP))) || ((parent.getType()) == (com.google.javascript.rhino.Token.CATCH))));
			}else {
				com.google.common.base.Preconditions.checkArgument((((n.getType()) == (com.google.javascript.rhino.Token.GETPROP)) && (((parent.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) || ((parent.getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT)))));
			}
			defineSlot(n, parent, n.getQualifiedName(), type, inferred);
		}

		void defineSlot(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent, java.lang.String variableName, com.google.javascript.rhino.jstype.JSType type, boolean inferred) {
			com.google.common.base.Preconditions.checkArgument((!(variableName.isEmpty())));
			boolean isGlobalVar = ((n.getType()) == (com.google.javascript.rhino.Token.NAME)) && (scope.isGlobal());
			boolean shouldDeclareOnGlobalThis = isGlobalVar && (((parent.getType()) == (com.google.javascript.rhino.Token.VAR)) || ((parent.getType()) == (com.google.javascript.rhino.Token.FUNCTION)));
			com.google.javascript.jscomp.Scope scopeToDeclareIn = scope;
			if ((((n.getType()) == (com.google.javascript.rhino.Token.GETPROP)) && (!(scope.isGlobal()))) && (isQnameRootedInGlobalScope(n))) {
				com.google.javascript.jscomp.Scope globalScope = scope.getGlobalScope();
				if (!(globalScope.isDeclared(variableName, false))) {
					scopeToDeclareIn = scope.getGlobalScope();
				}
			}
			if (scopeToDeclareIn.isDeclared(variableName, false)) {
				com.google.javascript.jscomp.Scope.Var oldVar = scopeToDeclareIn.getVar(variableName);
				validator.expectUndeclaredVariable(sourceName, n, parent, oldVar, variableName, type);
			}else {
				if (!inferred) {
					setDeferredType(n, type);
				}
				com.google.javascript.jscomp.CompilerInput input = compiler.getInput(sourceName);
				boolean isExtern = input.isExtern();
				com.google.javascript.jscomp.Scope.Var newVar = scopeToDeclareIn.declare(variableName, n, type, input, inferred);
				if (shouldDeclareOnGlobalThis) {
					com.google.javascript.rhino.jstype.ObjectType globalThis = typeRegistry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.GLOBAL_THIS);
					if (inferred) {
						globalThis.defineInferredProperty(variableName, (type == null ? getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE) : type), isExtern, n);
					}else {
						globalThis.defineDeclaredProperty(variableName, type, isExtern, n);
					}
				}
				if (type instanceof com.google.javascript.rhino.jstype.EnumType) {
					com.google.javascript.rhino.Node initialValue = newVar.getInitialValue();
					boolean isValidValue = (initialValue != null) && (((initialValue.getType()) == (com.google.javascript.rhino.Token.OBJECTLIT)) || (initialValue.isQualifiedName()));
					if (!isValidValue) {
						compiler.report(com.google.javascript.jscomp.JSError.make(sourceName, n, com.google.javascript.jscomp.TypedScopeCreator.ENUM_INITIALIZER));
					}
				}
				if ((type instanceof com.google.javascript.rhino.jstype.FunctionType) && (!(type.isEmptyType()))) {
					com.google.javascript.rhino.jstype.FunctionType fnType = ((com.google.javascript.rhino.jstype.FunctionType) (type));
					if (((fnType.isConstructor()) || (fnType.isInterface())) && (!(fnType.equals(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.U2U_CONSTRUCTOR_TYPE))))) {
						com.google.javascript.rhino.jstype.FunctionType superClassCtor = fnType.getSuperClassConstructor();
						scopeToDeclareIn.declare((variableName + ".prototype"), n, fnType.getPrototype(), input, ((superClassCtor == null) || (superClassCtor.getInstanceType().equals(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE)))));
						if ((((newVar.getInitialValue()) == null) && (!isExtern)) && (variableName.equals(fnType.getInstanceType().getReferenceName()))) {
							compiler.report(com.google.javascript.jscomp.JSError.make(sourceName, n, (fnType.isConstructor() ? com.google.javascript.jscomp.TypedScopeCreator.CTOR_INITIALIZER : com.google.javascript.jscomp.TypedScopeCreator.IFACE_INITIALIZER), variableName));
						}
					}
				}
			}
			if (((isGlobalVar && ("Window".equals(variableName))) && (type instanceof com.google.javascript.rhino.jstype.FunctionType)) && (type.isConstructor())) {
				com.google.javascript.rhino.jstype.FunctionType globalThisCtor = typeRegistry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.GLOBAL_THIS).getConstructor();
				globalThisCtor.getInstanceType().clearCachedValues();
				globalThisCtor.getPrototype().clearCachedValues();
				globalThisCtor.setPrototypeBasedOn(((com.google.javascript.rhino.jstype.FunctionType) (type)).getInstanceType());
			}
		}

		private boolean isQnameRootedInGlobalScope(com.google.javascript.rhino.Node n) {
			com.google.javascript.rhino.Node root = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(n);
			if ((root.getType()) == (com.google.javascript.rhino.Token.NAME)) {
				com.google.javascript.jscomp.Scope.Var var = scope.getVar(root.getString());
				if (var != null) {
					return var.isGlobal();
				}
			}
			return false;
		}

		private com.google.javascript.rhino.jstype.JSType getDeclaredType(java.lang.String sourceName, com.google.javascript.rhino.JSDocInfo info, com.google.javascript.rhino.Node lValue, @javax.annotation.Nullable
		com.google.javascript.rhino.Node rValue) {
			if ((info != null) && (info.hasType())) {
				return getDeclaredTypeInAnnotation(sourceName, lValue, info);
			}else
				if (((rValue != null) && ((rValue.getType()) == (com.google.javascript.rhino.Token.FUNCTION))) && (shouldUseFunctionLiteralType(((com.google.javascript.rhino.jstype.FunctionType) (rValue.getJSType())), info, lValue))) {
					return rValue.getJSType();
				}else
					if (info != null) {
						if (info.hasEnumParameterType()) {
							if ((rValue != null) && ((rValue.getType()) == (com.google.javascript.rhino.Token.OBJECTLIT))) {
								return rValue.getJSType();
							}else {
								return createEnumTypeFromNodes(rValue, lValue.getQualifiedName(), info, lValue);
							}
						}else
							if ((info.isConstructor()) || (info.isInterface())) {
								return createFunctionTypeFromNodes(rValue, lValue.getQualifiedName(), info, lValue);
							}else {
								if (info.isConstant()) {
									com.google.javascript.rhino.jstype.JSType knownType = null;
									if (rValue != null) {
										if (((rValue.getJSType()) != null) && (!(rValue.getJSType().isUnknownType()))) {
											return rValue.getJSType();
										}else
											if ((rValue.getType()) == (com.google.javascript.rhino.Token.OR)) {
												com.google.javascript.rhino.Node firstClause = rValue.getFirstChild();
												com.google.javascript.rhino.Node secondClause = firstClause.getNext();
												boolean namesMatch = (((firstClause.getType()) == (com.google.javascript.rhino.Token.NAME)) && ((lValue.getType()) == (com.google.javascript.rhino.Token.NAME))) && (firstClause.getString().equals(lValue.getString()));
												if ((namesMatch && ((secondClause.getJSType()) != null)) && (!(secondClause.getJSType().isUnknownType()))) {
													return secondClause.getJSType();
												}
											}
										
									}
								}
							}
						
					}
				
			
			return getDeclaredTypeInAnnotation(sourceName, lValue, info);
		}

		private void checkForClassDefiningCalls(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			com.google.javascript.jscomp.CodingConvention.SubclassRelationship relationship = codingConvention.getClassesDefinedByCall(n);
			if (relationship != null) {
				com.google.javascript.rhino.jstype.ObjectType superClass = com.google.javascript.rhino.jstype.ObjectType.cast(typeRegistry.getType(relationship.superclassName));
				com.google.javascript.rhino.jstype.ObjectType subClass = com.google.javascript.rhino.jstype.ObjectType.cast(typeRegistry.getType(relationship.subclassName));
				if ((superClass != null) && (subClass != null)) {
					com.google.javascript.rhino.jstype.FunctionType superCtor = superClass.getConstructor();
					com.google.javascript.rhino.jstype.FunctionType subCtor = subClass.getConstructor();
					if ((relationship.type) == (com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS)) {
						validator.expectSuperType(t, n, superClass, subClass);
					}
					if ((superCtor != null) && (subCtor != null)) {
						codingConvention.applySubclassRelationship(superCtor, subCtor, relationship.type);
					}
				}
			}
			java.lang.String singletonGetterClassName = codingConvention.getSingletonGetterClassName(n);
			if (singletonGetterClassName != null) {
				com.google.javascript.rhino.jstype.ObjectType objectType = com.google.javascript.rhino.jstype.ObjectType.cast(typeRegistry.getType(singletonGetterClassName));
				if (objectType != null) {
					com.google.javascript.rhino.jstype.FunctionType functionType = objectType.getConstructor();
					if (functionType != null) {
						com.google.javascript.rhino.jstype.FunctionType getterType = typeRegistry.createFunctionType(objectType);
						codingConvention.applySingletonGetter(functionType, getterType, objectType);
					}
				}
			}
			com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship = codingConvention.getDelegateRelationship(n);
			if (delegateRelationship != null) {
				applyDelegateRelationship(delegateRelationship);
			}
			com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast objectLiteralCast = codingConvention.getObjectLiteralCast(t, n);
			if (objectLiteralCast != null) {
				com.google.javascript.rhino.jstype.ObjectType type = com.google.javascript.rhino.jstype.ObjectType.cast(typeRegistry.getType(objectLiteralCast.typeName));
				if ((type != null) && ((type.getConstructor()) != null)) {
					setDeferredType(objectLiteralCast.objectNode, type);
				}else {
					compiler.report(com.google.javascript.jscomp.JSError.make(t.getSourceName(), n, com.google.javascript.jscomp.TypedScopeCreator.CONSTRUCTOR_EXPECTED));
				}
			}
		}

		private void applyDelegateRelationship(com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship) {
			com.google.javascript.rhino.jstype.ObjectType delegatorObject = com.google.javascript.rhino.jstype.ObjectType.cast(typeRegistry.getType(delegateRelationship.delegator));
			com.google.javascript.rhino.jstype.ObjectType delegateBaseObject = com.google.javascript.rhino.jstype.ObjectType.cast(typeRegistry.getType(delegateRelationship.delegateBase));
			com.google.javascript.rhino.jstype.ObjectType delegateSuperObject = com.google.javascript.rhino.jstype.ObjectType.cast(typeRegistry.getType(codingConvention.getDelegateSuperclassName()));
			if (((delegatorObject != null) && (delegateBaseObject != null)) && (delegateSuperObject != null)) {
				com.google.javascript.rhino.jstype.FunctionType delegatorCtor = delegatorObject.getConstructor();
				com.google.javascript.rhino.jstype.FunctionType delegateBaseCtor = delegateBaseObject.getConstructor();
				com.google.javascript.rhino.jstype.FunctionType delegateSuperCtor = delegateSuperObject.getConstructor();
				if (((delegatorCtor != null) && (delegateBaseCtor != null)) && (delegateSuperCtor != null)) {
					com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder = new com.google.javascript.rhino.jstype.FunctionParamBuilder(typeRegistry);
					functionParamBuilder.addRequiredParams(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.U2U_CONSTRUCTOR_TYPE));
					com.google.javascript.rhino.jstype.FunctionType findDelegate = typeRegistry.createFunctionType(typeRegistry.createDefaultObjectUnion(delegateBaseObject), functionParamBuilder.build());
					com.google.javascript.rhino.jstype.FunctionType delegateProxy = typeRegistry.createConstructorType(((delegateBaseObject.getReferenceName()) + (com.google.javascript.jscomp.TypedScopeCreator.DELEGATE_PROXY_SUFFIX)), null, null, null);
					delegateProxy.setPrototypeBasedOn(delegateBaseObject);
					codingConvention.applyDelegateRelationship(delegateSuperObject, delegateBaseObject, delegatorObject, delegateProxy, findDelegate);
					delegateProxyPrototypes.add(delegateProxy.getPrototype());
				}
			}
		}

		void maybeDeclareQualifiedName(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.JSDocInfo info, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node rhsValue) {
			com.google.javascript.rhino.Node ownerNode = n.getFirstChild();
			java.lang.String ownerName = ownerNode.getQualifiedName();
			java.lang.String qName = n.getQualifiedName();
			java.lang.String propName = n.getLastChild().getString();
			com.google.common.base.Preconditions.checkArgument(((qName != null) && (ownerName != null)));
			if ("prototype".equals(propName)) {
				com.google.javascript.jscomp.Scope.Var qVar = scope.getVar(qName);
				if (qVar != null) {
					if (!(qVar.isTypeInferred())) {
						return ;
					}
					if ((qVar.getScope()) == (scope)) {
						scope.undeclare(qVar);
					}
				}
			}
			com.google.javascript.rhino.jstype.JSType valueType = getDeclaredType(t.getSourceName(), info, n, rhsValue);
			if ((valueType == null) && (rhsValue != null)) {
				valueType = rhsValue.getJSType();
			}
			if (valueType == null) {
				if ((parent.getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT)) {
					stubDeclarations.add(new com.google.javascript.jscomp.TypedScopeCreator.StubDeclaration(n, (((t.getInput()) != null) && (t.getInput().isExtern())), ownerName));
				}
				return ;
			}
			boolean inferred = true;
			if (info != null) {
				inferred = !((((info.hasType()) || (info.hasEnumParameterType())) || (((info.isConstant()) && (valueType != null)) && (!(valueType.isUnknownType())))) || (com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(info)));
			}
			if (inferred) {
				inferred = !(((rhsValue != null) && ((rhsValue.getType()) == (com.google.javascript.rhino.Token.FUNCTION))) && (!(scope.isDeclared(qName, false))));
			}
			if (!inferred) {
				com.google.javascript.rhino.jstype.ObjectType ownerType = getObjectSlot(ownerName);
				if (ownerType != null) {
					boolean isExtern = ((t.getInput()) != null) && (t.getInput().isExtern());
					if (((!(ownerType.hasOwnProperty(propName))) || (ownerType.isPropertyTypeInferred(propName))) && ((isExtern && (!(ownerType.isNativeObjectType()))) || (!(ownerType.isInstanceType())))) {
						ownerType.defineDeclaredProperty(propName, valueType, isExtern, n);
					}
				}
				defineSlot(n, parent, valueType, inferred);
			}else
				if ((rhsValue != null) && ((rhsValue.getType()) == (com.google.javascript.rhino.Token.TRUE))) {
					com.google.javascript.rhino.jstype.ObjectType ownerType = getObjectSlot(ownerName);
					if (ownerType instanceof com.google.javascript.rhino.jstype.FunctionType) {
						com.google.javascript.rhino.jstype.JSType ownerTypeOfThis = ((com.google.javascript.rhino.jstype.FunctionType) (ownerType)).getTypeOfThis();
						java.lang.String delegateName = codingConvention.getDelegateSuperclassName();
						com.google.javascript.rhino.jstype.JSType delegateType = delegateName == null ? null : typeRegistry.getType(delegateName);
						if ((delegateType != null) && (ownerTypeOfThis.isSubtype(delegateType))) {
							defineSlot(n, parent, getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE), true);
						}
					}
				}
			
		}

		private com.google.javascript.rhino.jstype.ObjectType getObjectSlot(java.lang.String slotName) {
			com.google.javascript.jscomp.Scope.Var ownerVar = scope.getVar(slotName);
			if (ownerVar != null) {
				com.google.javascript.rhino.jstype.JSType ownerVarType = ownerVar.getType();
				return com.google.javascript.rhino.jstype.ObjectType.cast((ownerVarType == null ? null : ownerVarType.restrictByNotNullOrUndefined()));
			}
			return null;
		}

		void resolveStubDeclarations() {
			for (com.google.javascript.jscomp.TypedScopeCreator.StubDeclaration stub : stubDeclarations) {
				com.google.javascript.rhino.Node n = stub.node;
				com.google.javascript.rhino.Node parent = n.getParent();
				java.lang.String qName = n.getQualifiedName();
				java.lang.String propName = n.getLastChild().getString();
				java.lang.String ownerName = stub.ownerName;
				boolean isExtern = stub.isExtern;
				if (scope.isDeclared(qName, false)) {
					continue;
				}
				com.google.javascript.rhino.jstype.ObjectType ownerType = getObjectSlot(ownerName);
				com.google.javascript.rhino.jstype.ObjectType unknownType = typeRegistry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
				defineSlot(n, parent, unknownType, true);
				if ((ownerType != null) && (isExtern || (ownerType.isFunctionPrototypeType()))) {
					ownerType.defineInferredProperty(propName, unknownType, isExtern, n);
				}else {
					typeRegistry.registerPropertyOnType(propName, (ownerType == null ? unknownType : ownerType));
				}
			}
		}

		private final class CollectProperties extends com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback {
			private final com.google.javascript.rhino.jstype.ObjectType thisType;

			CollectProperties(com.google.javascript.rhino.jstype.ObjectType thisType) {
				this.thisType = thisType;
			}

			public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
				if ((n.getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT)) {
					com.google.javascript.rhino.Node child = n.getFirstChild();
					switch (child.getType()) {
						case com.google.javascript.rhino.Token.ASSIGN :
							maybeCollectMember(t, child.getFirstChild(), child, child.getLastChild());
							break;
						case com.google.javascript.rhino.Token.GETPROP :
							maybeCollectMember(t, child, child, null);
							break;
					}
				}
			}

			private void maybeCollectMember(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node member, com.google.javascript.rhino.Node nodeWithJsDocInfo, @javax.annotation.Nullable
			com.google.javascript.rhino.Node value) {
				com.google.javascript.rhino.JSDocInfo info = nodeWithJsDocInfo.getJSDocInfo();
				if (((info == null) || ((member.getType()) != (com.google.javascript.rhino.Token.GETPROP))) || ((member.getFirstChild().getType()) != (com.google.javascript.rhino.Token.THIS))) {
					return ;
				}
				member.getFirstChild().setJSType(thisType);
				com.google.javascript.rhino.jstype.JSType jsType = getDeclaredType(t.getSourceName(), info, member, value);
				com.google.javascript.rhino.Node name = member.getLastChild();
				if ((jsType != null) && (((name.getType()) == (com.google.javascript.rhino.Token.NAME)) || ((name.getType()) == (com.google.javascript.rhino.Token.STRING)))) {
					thisType.defineDeclaredProperty(name.getString(), jsType, false, member);
				}
			}
		}
	}

	private static final class StubDeclaration {
		private final com.google.javascript.rhino.Node node;

		private final boolean isExtern;

		private final java.lang.String ownerName;

		private StubDeclaration(com.google.javascript.rhino.Node node, boolean isExtern, java.lang.String ownerName) {
			this.node = node;
			this.isExtern = isExtern;
			this.ownerName = ownerName;
		}
	}

	private final class GlobalScopeBuilder extends com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder {
		private GlobalScopeBuilder(com.google.javascript.jscomp.Scope scope) {
			super(scope);
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			super.visit(t, n, parent);
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.ASSIGN :
					checkForOldStyleTypedef(t, n);
					break;
				case com.google.javascript.rhino.Token.VAR :
					if (n.hasOneChild()) {
						checkForOldStyleTypedef(t, n);
						checkForTypedef(t, n.getFirstChild(), n.getJSDocInfo());
					}
					break;
			}
		}

		@java.lang.Override
		void maybeDeclareQualifiedName(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.JSDocInfo info, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node rhsValue) {
			checkForTypedef(t, n, info);
			super.maybeDeclareQualifiedName(t, info, n, parent, rhsValue);
		}

		private void checkForTypedef(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node candidate, com.google.javascript.rhino.JSDocInfo info) {
			if ((info == null) || (!(info.hasTypedefType()))) {
				return ;
			}
			java.lang.String typedef = candidate.getQualifiedName();
			if (typedef == null) {
				return ;
			}
			typeRegistry.declareType(typedef, getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE));
			com.google.javascript.rhino.jstype.JSType realType = info.getTypedefType().evaluate(scope, typeRegistry);
			if (realType == null) {
				compiler.report(com.google.javascript.jscomp.JSError.make(t.getSourceName(), candidate, com.google.javascript.jscomp.TypedScopeCreator.MALFORMED_TYPEDEF, typedef));
			}
			typeRegistry.overwriteDeclaredType(typedef, realType);
			if ((candidate.getType()) == (com.google.javascript.rhino.Token.GETPROP)) {
				defineSlot(candidate, candidate.getParent(), getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE), false);
			}
		}

		private void checkForOldStyleTypedef(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node candidate) {
			java.lang.String typedef = codingConvention.identifyTypeDefAssign(candidate);
			if (typedef != null) {
				typeRegistry.declareType(typedef, getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE));
				com.google.javascript.rhino.JSDocInfo info = candidate.getJSDocInfo();
				com.google.javascript.rhino.jstype.JSType realType = null;
				if ((info != null) && ((info.getType()) != null)) {
					realType = info.getType().evaluate(scope, typeRegistry);
				}
				if (realType == null) {
					compiler.report(com.google.javascript.jscomp.JSError.make(t.getSourceName(), candidate, com.google.javascript.jscomp.TypedScopeCreator.MALFORMED_TYPEDEF, typedef));
				}
				typeRegistry.overwriteDeclaredType(typedef, realType);
			}
		}
	}

	private final class LocalScopeBuilder extends com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder {
		private LocalScopeBuilder(com.google.javascript.jscomp.Scope scope) {
			super(scope);
		}

		void build() {
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, scope.getRootNode(), com.google.javascript.jscomp.TypedScopeCreator.LocalScopeBuilder.this);
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (n == (scope.getRootNode()))
				return ;
			
			if (((n.getType()) == (com.google.javascript.rhino.Token.LP)) && (parent == (scope.getRootNode()))) {
				handleFunctionInputs(parent);
				return ;
			}
			super.visit(t, n, parent);
		}

		private void handleFunctionInputs(com.google.javascript.rhino.Node fnNode) {
			com.google.javascript.rhino.Node fnNameNode = fnNode.getFirstChild();
			java.lang.String fnName = fnNameNode.getString();
			if (!(fnName.isEmpty())) {
				com.google.javascript.jscomp.Scope.Var fnVar = scope.getVar(fnName);
				if ((fnVar == null) || (((fnVar.getNameNode()) != null) && ((fnVar.getInitialValue()) != fnNode))) {
					defineSlot(fnNameNode, fnNode, fnNode.getJSType(), false);
				}
			}
			declareArguments(fnNode);
		}

		private void declareArguments(com.google.javascript.rhino.Node functionNode) {
			com.google.javascript.rhino.Node astParameters = functionNode.getFirstChild().getNext();
			com.google.javascript.rhino.Node body = astParameters.getNext();
			com.google.javascript.rhino.jstype.FunctionType functionType = ((com.google.javascript.rhino.jstype.FunctionType) (functionNode.getJSType()));
			if (functionType != null) {
				com.google.javascript.rhino.Node jsDocParameters = functionType.getParametersNode();
				if (jsDocParameters != null) {
					com.google.javascript.rhino.Node jsDocParameter = jsDocParameters.getFirstChild();
					for (com.google.javascript.rhino.Node astParameter : astParameters.children()) {
						if (jsDocParameter != null) {
							defineSlot(astParameter, functionNode, jsDocParameter.getJSType(), true);
							jsDocParameter = jsDocParameter.getNext();
						}else {
							defineSlot(astParameter, functionNode, null, true);
						}
					}
				}
			}
		}
	}

	static com.google.javascript.rhino.JSDocInfo getBestJSDocInfo(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.JSDocInfo info = n.getJSDocInfo();
		if (info == null) {
			com.google.javascript.rhino.Node parent = n.getParent();
			int parentType = parent.getType();
			if (parentType == (com.google.javascript.rhino.Token.NAME)) {
				info = parent.getJSDocInfo();
				if ((info == null) && (parent.getParent().hasOneChild())) {
					info = parent.getParent().getJSDocInfo();
				}
			}else
				if (parentType == (com.google.javascript.rhino.Token.ASSIGN)) {
					info = parent.getJSDocInfo();
				}else
					if (com.google.javascript.jscomp.NodeUtil.isObjectLitKey(parent, parent.getParent())) {
						info = parent.getJSDocInfo();
					}
				
			
		}
		return info;
	}

	private static com.google.javascript.rhino.Node getBestLValue(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node parent = n.getParent();
		int parentType = parent.getType();
		boolean isFunctionDeclaration = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n);
		if (isFunctionDeclaration) {
			return n.getFirstChild();
		}else
			if (parentType == (com.google.javascript.rhino.Token.NAME)) {
				return parent;
			}else
				if (parentType == (com.google.javascript.rhino.Token.ASSIGN)) {
					return parent.getFirstChild();
				}else
					if (com.google.javascript.jscomp.NodeUtil.isObjectLitKey(parent, parent.getParent())) {
						return parent;
					}
				
			
		
		return null;
	}

	private static java.lang.String getBestLValueName(@javax.annotation.Nullable
	com.google.javascript.rhino.Node lValue) {
		if ((lValue == null) || ((lValue.getParent()) == null)) {
			return null;
		}
		if (com.google.javascript.jscomp.NodeUtil.isObjectLitKey(lValue, lValue.getParent())) {
			com.google.javascript.rhino.Node owner = com.google.javascript.jscomp.TypedScopeCreator.getBestLValue(lValue.getParent());
			if (owner != null) {
				java.lang.String ownerName = com.google.javascript.jscomp.TypedScopeCreator.getBestLValueName(owner);
				if (ownerName != null) {
					return (ownerName + ".") + (com.google.javascript.jscomp.NodeUtil.getObjectLitKeyName(lValue));
				}
			}
			return null;
		}
		return lValue.getQualifiedName();
	}
}


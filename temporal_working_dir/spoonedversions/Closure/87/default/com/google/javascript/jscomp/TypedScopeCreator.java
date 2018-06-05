

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

	private java.util.List<com.google.javascript.rhino.jstype.ObjectType> delegateProxyPrototypes = com.google.common.collect.Lists.newArrayList();

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
			return (((parent == null) || ((parent.getType()) != (com.google.javascript.rhino.Token.FUNCTION))) || (n == (parent.getFirstChild()))) || (parent == (scope.getRootNode()));
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			attachLiteralTypes(n);
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.CALL :
					checkForClassDefiningCalls(t, n, parent);
					break;
				case com.google.javascript.rhino.Token.FUNCTION :
					if (((t.getInput()) == null) || (!(t.getInput().isExtern()))) {
						nonExternFunctions.add(n);
					}
					if (((parent.getType()) != (com.google.javascript.rhino.Token.ASSIGN)) && ((parent.getType()) != (com.google.javascript.rhino.Token.NAME))) {
						defineDeclaredFunction(n, parent);
					}
					break;
				case com.google.javascript.rhino.Token.ASSIGN :
					defineNamedTypeAssign(n, parent);
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

		private void attachLiteralTypes(com.google.javascript.rhino.Node n) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.NULL :
					n.setJSType(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE));
					break;
				case com.google.javascript.rhino.Token.VOID :
					n.setJSType(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE));
					break;
				case com.google.javascript.rhino.Token.STRING :
					n.setJSType(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE));
					break;
				case com.google.javascript.rhino.Token.NUMBER :
					n.setJSType(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE));
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
					processObjectLit(n);
					break;
			}
		}

		private void processObjectLit(com.google.javascript.rhino.Node objectLit) {
			com.google.javascript.rhino.JSDocInfo info = objectLit.getJSDocInfo();
			if ((info != null) && ((info.getLendsName()) != null)) {
				java.lang.String lendsName = info.getLendsName();
				com.google.javascript.jscomp.Scope.Var lendsVar = scope.getVar(lendsName);
				if (lendsVar == null) {
					compiler.report(com.google.javascript.jscomp.JSError.make(sourceName, objectLit, com.google.javascript.jscomp.TypedScopeCreator.UNKNOWN_LENDS, lendsName));
				}else {
					com.google.javascript.rhino.jstype.JSType type = lendsVar.getType();
					if (type == null) {
						type = typeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
					}
					if (!(type.isSubtype(typeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE)))) {
						compiler.report(com.google.javascript.jscomp.JSError.make(sourceName, objectLit, com.google.javascript.jscomp.TypedScopeCreator.LENDS_ON_NON_OBJECT, lendsName, type.toString()));
					}else {
						objectLit.setJSType(type);
					}
				}
			}
			if ((objectLit.getJSType()) == null) {
				objectLit.setJSType(typeRegistry.createAnonymousObjectType());
			}
		}

		com.google.javascript.rhino.jstype.JSType getDeclaredTypeInAnnotation(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node node, com.google.javascript.rhino.JSDocInfo info) {
			return getDeclaredTypeInAnnotation(t.getSourceName(), node, info);
		}

		com.google.javascript.rhino.jstype.JSType getDeclaredTypeInAnnotation(java.lang.String sourceName, com.google.javascript.rhino.Node node, com.google.javascript.rhino.JSDocInfo info) {
			com.google.javascript.rhino.jstype.JSType jsType = null;
			com.google.javascript.rhino.Node objNode = (node.getType()) == (com.google.javascript.rhino.Token.GETPROP) ? node.getFirstChild() : null;
			if (info != null) {
				if (info.hasType()) {
					jsType = info.getType().evaluate(scope, typeRegistry);
				}else
					if (com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(info)) {
						java.lang.String fnName = node.getQualifiedName();
						if ((info.isConstructor()) && ((typeRegistry.getType(fnName)) != null)) {
							return null;
						}
						com.google.javascript.jscomp.FunctionTypeBuilder builder = new com.google.javascript.jscomp.FunctionTypeBuilder(fnName, compiler, node, sourceName, scope).inferTemplateTypeName(info).inferReturnType(info).inferParameterTypes(info).inferInheritance(info);
						boolean searchedForThisType = false;
						if (objNode != null) {
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
						jsType = builder.buildAndRegister();
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

		void defineDeclaredFunction(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			assertDefinitionNode(n, com.google.javascript.rhino.Token.FUNCTION);
			com.google.javascript.rhino.JSDocInfo info = n.getJSDocInfo();
			int parentType = parent.getType();
			com.google.common.base.Preconditions.checkState((((scope.isLocal()) || (parentType != (com.google.javascript.rhino.Token.ASSIGN))) && (parentType != (com.google.javascript.rhino.Token.NAME))), ("function defined as standalone function when it is being " + "assigned"));
			java.lang.String functionName = n.getFirstChild().getString();
			com.google.javascript.rhino.jstype.FunctionType functionType = getFunctionType(functionName, n, info, null);
			if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n)) {
				defineSlot(n.getFirstChild(), n, functionType);
			}
		}

		void defineNamedTypeAssign(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			assertDefinitionNode(n, com.google.javascript.rhino.Token.ASSIGN);
			com.google.javascript.rhino.JSDocInfo info = n.getJSDocInfo();
			com.google.javascript.rhino.Node rvalue = n.getLastChild();
			com.google.javascript.rhino.Node lvalue = n.getFirstChild();
			info = (info != null) ? info : rvalue.getJSDocInfo();
			if (((rvalue.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) || ((info != null) && (info.isConstructor()))) {
				getFunctionType(lvalue.getQualifiedName(), rvalue, info, lvalue);
			}else
				if ((info != null) && (info.hasEnumParameterType())) {
					com.google.javascript.rhino.jstype.JSType type = getEnumType(lvalue.getQualifiedName(), n, rvalue, info.getEnumParameterType().evaluate(scope, typeRegistry));
					if (type != null) {
						setDeferredType(lvalue, type);
					}
				}
			
		}

		private void defineName(com.google.javascript.rhino.Node name, com.google.javascript.rhino.Node var, com.google.javascript.rhino.Node parent, com.google.javascript.rhino.JSDocInfo info) {
			com.google.javascript.rhino.Node value = name.getFirstChild();
			if ((value != null) && ((value.getType()) == (com.google.javascript.rhino.Token.FUNCTION))) {
				java.lang.String functionName = name.getString();
				com.google.javascript.rhino.jstype.FunctionType functionType = getFunctionType(functionName, value, info, null);
				if ((functionType.isReturnTypeInferred()) && (scope.isLocal())) {
					defineSlot(name, var, null);
				}else {
					defineSlot(name, var, functionType);
				}
			}else {
				com.google.javascript.rhino.jstype.JSType type = null;
				if (info == null) {
					com.google.javascript.jscomp.CompilerInput input = compiler.getInput(sourceName);
					com.google.common.base.Preconditions.checkNotNull(input, sourceName);
					type = (input.isExtern()) ? getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE) : null;
				}else
					if (info.hasEnumParameterType()) {
						type = getEnumType(name.getString(), var, value, info.getEnumParameterType().evaluate(scope, typeRegistry));
					}else
						if (info.isConstructor()) {
							type = getFunctionType(name.getString(), value, info, name);
						}else {
							type = getDeclaredTypeInAnnotation(sourceName, name, info);
						}
					
				
				defineSlot(name, var, type);
			}
		}

		private com.google.javascript.rhino.jstype.FunctionType getFunctionType(java.lang.String name, com.google.javascript.rhino.Node rValue, com.google.javascript.rhino.JSDocInfo info, @javax.annotation.Nullable
		com.google.javascript.rhino.Node lvalueNode) {
			com.google.javascript.rhino.jstype.FunctionType functionType = null;
			if (((rValue != null) && (rValue.isQualifiedName())) && (scope.isGlobal())) {
				com.google.javascript.jscomp.Scope.Var var = scope.getVar(rValue.getQualifiedName());
				if ((var != null) && ((var.getType()) instanceof com.google.javascript.rhino.jstype.FunctionType)) {
					functionType = ((com.google.javascript.rhino.jstype.FunctionType) (var.getType()));
					if ((functionType != null) && ((functionType.isConstructor()) || (functionType.isInterface()))) {
						typeRegistry.declareType(name, functionType.getInstanceType());
					}
				}
				return functionType;
			}
			com.google.javascript.rhino.Node owner = null;
			if (lvalueNode != null) {
				owner = com.google.javascript.jscomp.TypedScopeCreator.getPrototypePropertyOwner(lvalueNode);
			}
			com.google.javascript.rhino.Node errorRoot = rValue == null ? lvalueNode : rValue;
			boolean isFnLiteral = (rValue != null) && ((rValue.getType()) == (com.google.javascript.rhino.Token.FUNCTION));
			com.google.javascript.rhino.Node fnRoot = isFnLiteral ? rValue : null;
			com.google.javascript.rhino.Node parametersNode = isFnLiteral ? rValue.getFirstChild().getNext() : null;
			com.google.javascript.rhino.Node fnBlock = isFnLiteral ? parametersNode.getNext() : null;
			if (((functionType == null) && (info != null)) && (info.hasType())) {
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
				functionType = new com.google.javascript.jscomp.FunctionTypeBuilder(name, compiler, errorRoot, sourceName, scope).setSourceNode(fnRoot).inferFromOverriddenFunction(overriddenPropType, parametersNode).inferTemplateTypeName(info).inferReturnType(info).inferInheritance(info).inferThisType(info, owner).inferParameterTypes(parametersNode, info).inferReturnStatementsAsLastResort(fnBlock).buildAndRegister();
			}
			if (rValue != null) {
				setDeferredType(rValue, functionType);
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

		private com.google.javascript.rhino.jstype.EnumType getEnumType(java.lang.String name, com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node value, com.google.javascript.rhino.jstype.JSType elementsType) {
			com.google.javascript.rhino.jstype.EnumType enumType = null;
			if (value != null) {
				if ((value.getType()) == (com.google.javascript.rhino.Token.OBJECTLIT)) {
					enumType = typeRegistry.createEnumType(name, elementsType);
					com.google.javascript.rhino.Node key = value.getFirstChild();
					while (key != null) {
						java.lang.String keyName = com.google.javascript.jscomp.NodeUtil.getStringValue(key);
						if (enumType.hasOwnProperty(keyName)) {
							compiler.report(com.google.javascript.jscomp.JSError.make(sourceName, key, com.google.javascript.jscomp.TypeCheck.ENUM_DUP, keyName));
						}else
							if (!(codingConvention.isValidEnumKey(keyName))) {
								compiler.report(com.google.javascript.jscomp.JSError.make(sourceName, key, com.google.javascript.jscomp.TypeCheck.ENUM_NOT_CONSTANT, keyName));
							}else {
								enumType.defineElement(keyName);
							}
						
						key = key.getNext();
					} 
				}else
					if (value.isQualifiedName()) {
						com.google.javascript.jscomp.Scope.Var var = scope.getVar(value.getQualifiedName());
						if ((var != null) && ((var.getType()) instanceof com.google.javascript.rhino.jstype.EnumType)) {
							enumType = ((com.google.javascript.rhino.jstype.EnumType) (var.getType()));
						}
					}
				
			}
			if (enumType == null) {
				compiler.report(com.google.javascript.jscomp.JSError.make(sourceName, parent, com.google.javascript.jscomp.TypedScopeCreator.ENUM_INITIALIZER));
			}else
				if (scope.isGlobal()) {
					if ((name != null) && (!(name.isEmpty()))) {
						typeRegistry.declareType(name, enumType.getElementsType());
					}
				}
			
			return enumType;
		}

		private void defineSlot(com.google.javascript.rhino.Node name, com.google.javascript.rhino.Node parent, com.google.javascript.rhino.jstype.JSType type) {
			defineSlot(name, parent, type, (type == null));
		}

		void defineSlot(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent, com.google.javascript.rhino.jstype.JSType type, boolean inferred) {
			com.google.common.base.Preconditions.checkArgument((inferred || (type != null)));
			boolean shouldDeclareOnGlobalThis = false;
			if ((n.getType()) == (com.google.javascript.rhino.Token.NAME)) {
				com.google.common.base.Preconditions.checkArgument((((((parent.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) || ((parent.getType()) == (com.google.javascript.rhino.Token.VAR))) || ((parent.getType()) == (com.google.javascript.rhino.Token.LP))) || ((parent.getType()) == (com.google.javascript.rhino.Token.CATCH))));
				shouldDeclareOnGlobalThis = (scope.isGlobal()) && (((parent.getType()) == (com.google.javascript.rhino.Token.VAR)) || ((parent.getType()) == (com.google.javascript.rhino.Token.FUNCTION)));
			}else {
				com.google.common.base.Preconditions.checkArgument((((n.getType()) == (com.google.javascript.rhino.Token.GETPROP)) && (((parent.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) || ((parent.getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT)))));
			}
			java.lang.String variableName = n.getQualifiedName();
			com.google.common.base.Preconditions.checkArgument((!(variableName.isEmpty())));
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
						globalThis.defineInferredProperty(variableName, (type == null ? getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE) : type), isExtern);
					}else {
						globalThis.defineDeclaredProperty(variableName, type, isExtern);
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

		private com.google.javascript.rhino.jstype.JSType getDeclaredGetPropType(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.JSDocInfo info, com.google.javascript.rhino.Node n, @javax.annotation.Nullable
		com.google.javascript.rhino.Node rhsValue) {
			if ((info != null) && (info.hasType())) {
				return getDeclaredTypeInAnnotation(t, n, info);
			}else
				if ((info != null) && (info.hasEnumParameterType())) {
					return n.getJSType();
				}else
					if ((rhsValue != null) && ((rhsValue.getType()) == (com.google.javascript.rhino.Token.FUNCTION))) {
						return rhsValue.getJSType();
					}else {
						return getDeclaredTypeInAnnotation(t, n, info);
					}
				
			
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
			com.google.javascript.rhino.jstype.JSType valueType = getDeclaredGetPropType(t, info, n, rhsValue);
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
				inferred = !(((info.hasType()) || (info.hasEnumParameterType())) || (com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(info)));
			}
			if (inferred) {
				inferred = !(((rhsValue != null) && ((rhsValue.getType()) == (com.google.javascript.rhino.Token.FUNCTION))) && (!(scope.isDeclared(qName, false))));
			}
			if (!inferred) {
				com.google.javascript.rhino.jstype.ObjectType ownerType = getObjectSlot(ownerName);
				if (ownerType != null) {
					boolean isExtern = ((t.getInput()) != null) && (t.getInput().isExtern());
					if (((!(ownerType.hasOwnProperty(propName))) || (ownerType.isPropertyTypeInferred(propName))) && ((isExtern && (!(ownerType.isNativeObjectType()))) || (!(ownerType.isInstanceType())))) {
						ownerType.defineDeclaredProperty(propName, valueType, isExtern);
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
					ownerType.defineInferredProperty(propName, unknownType, isExtern);
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
				com.google.javascript.rhino.jstype.JSType jsType = getDeclaredGetPropType(t, info, member, value);
				com.google.javascript.rhino.Node name = member.getLastChild();
				if ((jsType != null) && (((name.getType()) == (com.google.javascript.rhino.Token.NAME)) || ((name.getType()) == (com.google.javascript.rhino.Token.STRING)))) {
					thisType.defineDeclaredProperty(name.getString(), jsType, false);
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
}


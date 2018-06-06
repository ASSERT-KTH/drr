

package com.google.javascript.jscomp;


final class FunctionTypeBuilder {
	private final java.lang.String fnName;

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.CodingConvention codingConvention;

	private final com.google.javascript.rhino.jstype.JSTypeRegistry typeRegistry;

	private final com.google.javascript.rhino.Node errorRoot;

	private final java.lang.String sourceName;

	private final com.google.javascript.jscomp.Scope scope;

	private com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents contents = com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents.get();

	private com.google.javascript.rhino.jstype.JSType returnType = null;

	private boolean returnTypeInferred = false;

	private java.util.List<com.google.javascript.rhino.jstype.ObjectType> implementedInterfaces = null;

	private java.util.List<com.google.javascript.rhino.jstype.ObjectType> extendedInterfaces = null;

	private com.google.javascript.rhino.jstype.ObjectType baseType = null;

	private com.google.javascript.rhino.jstype.ObjectType thisType = null;

	private boolean isConstructor = false;

	private boolean isInterface = false;

	private com.google.javascript.rhino.Node parametersNode = null;

	private java.lang.String templateTypeName = null;

	static final com.google.javascript.jscomp.DiagnosticType EXTENDS_WITHOUT_TYPEDEF = com.google.javascript.jscomp.DiagnosticType.warning("JSC_EXTENDS_WITHOUT_TYPEDEF", "@extends used without @constructor or @interface for {0}");

	static final com.google.javascript.jscomp.DiagnosticType EXTENDS_NON_OBJECT = com.google.javascript.jscomp.DiagnosticType.warning("JSC_EXTENDS_NON_OBJECT", "{0} @extends non-object type {1}");

	static final com.google.javascript.jscomp.DiagnosticType RESOLVED_TAG_EMPTY = com.google.javascript.jscomp.DiagnosticType.warning("JSC_RESOLVED_TAG_EMPTY", "Could not resolve type in {0} tag of {1}");

	static final com.google.javascript.jscomp.DiagnosticType IMPLEMENTS_WITHOUT_CONSTRUCTOR = com.google.javascript.jscomp.DiagnosticType.warning("JSC_IMPLEMENTS_WITHOUT_CONSTRUCTOR", "@implements used without @constructor or @interface for {0}");

	static final com.google.javascript.jscomp.DiagnosticType VAR_ARGS_MUST_BE_LAST = com.google.javascript.jscomp.DiagnosticType.warning("JSC_VAR_ARGS_MUST_BE_LAST", "variable length argument must be last");

	static final com.google.javascript.jscomp.DiagnosticType OPTIONAL_ARG_AT_END = com.google.javascript.jscomp.DiagnosticType.warning("JSC_OPTIONAL_ARG_AT_END", "optional arguments must be at the end");

	static final com.google.javascript.jscomp.DiagnosticType INEXISTANT_PARAM = com.google.javascript.jscomp.DiagnosticType.warning("JSC_INEXISTANT_PARAM", "parameter {0} does not appear in {1}''s parameter list");

	static final com.google.javascript.jscomp.DiagnosticType TYPE_REDEFINITION = com.google.javascript.jscomp.DiagnosticType.warning("JSC_TYPE_REDEFINITION", ("attempted re-definition of type {0}\n" + ("found   : {1}\n" + "expected: {2}")));

	static final com.google.javascript.jscomp.DiagnosticType TEMPLATE_TYPE_DUPLICATED = com.google.javascript.jscomp.DiagnosticType.warning("JSC_TEMPLATE_TYPE_DUPLICATED", "Only one parameter type must be the template type");

	static final com.google.javascript.jscomp.DiagnosticType TEMPLATE_TYPE_EXPECTED = com.google.javascript.jscomp.DiagnosticType.warning("JSC_TEMPLATE_TYPE_EXPECTED", "The template type must be a parameter type");

	static final com.google.javascript.jscomp.DiagnosticType THIS_TYPE_NON_OBJECT = com.google.javascript.jscomp.DiagnosticType.warning("JSC_THIS_TYPE_NON_OBJECT", ("@this type of a function must be an object\n" + "Actual type: {0}"));

	private class ExtendedTypeValidator implements com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> {
		@java.lang.Override
		public boolean apply(com.google.javascript.rhino.jstype.JSType type) {
			com.google.javascript.rhino.jstype.ObjectType objectType = com.google.javascript.rhino.jstype.ObjectType.cast(type);
			if (objectType == null) {
				reportWarning(com.google.javascript.jscomp.FunctionTypeBuilder.EXTENDS_NON_OBJECT, fnName, type.toString());
				return false;
			}else
				if (objectType.isEmptyType()) {
					reportWarning(com.google.javascript.jscomp.FunctionTypeBuilder.RESOLVED_TAG_EMPTY, "@extends", fnName);
					return false;
				}else
					if (objectType.isUnknownType()) {
						if (com.google.javascript.jscomp.FunctionTypeBuilder.hasMoreTagsToResolve(objectType)) {
							return true;
						}else {
							reportWarning(com.google.javascript.jscomp.FunctionTypeBuilder.RESOLVED_TAG_EMPTY, "@extends", fnName);
							return false;
						}
					}else {
						return true;
					}
				
			
		}
	}

	private class ImplementedTypeValidator implements com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> {
		@java.lang.Override
		public boolean apply(com.google.javascript.rhino.jstype.JSType type) {
			com.google.javascript.rhino.jstype.ObjectType objectType = com.google.javascript.rhino.jstype.ObjectType.cast(type);
			if (objectType == null) {
				reportError(com.google.javascript.jscomp.TypeCheck.BAD_IMPLEMENTED_TYPE, fnName);
				return false;
			}else
				if (objectType.isEmptyType()) {
					reportWarning(com.google.javascript.jscomp.FunctionTypeBuilder.RESOLVED_TAG_EMPTY, "@implements", fnName);
					return false;
				}else
					if (objectType.isUnknownType()) {
						if (com.google.javascript.jscomp.FunctionTypeBuilder.hasMoreTagsToResolve(objectType)) {
							return true;
						}else {
							reportWarning(com.google.javascript.jscomp.FunctionTypeBuilder.RESOLVED_TAG_EMPTY, "@implements", fnName);
							return false;
						}
					}else {
						return true;
					}
				
			
		}
	}

	private class ThisTypeValidator implements com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> {
		@java.lang.Override
		public boolean apply(com.google.javascript.rhino.jstype.JSType type) {
			if (!(type.restrictByNotNullOrUndefined().isSubtype(typeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE)))) {
				reportWarning(com.google.javascript.jscomp.FunctionTypeBuilder.THIS_TYPE_NON_OBJECT, type.toString());
				return false;
			}
			return true;
		}
	}

	FunctionTypeBuilder(java.lang.String fnName, com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.rhino.Node errorRoot, java.lang.String sourceName, com.google.javascript.jscomp.Scope scope) {
		com.google.common.base.Preconditions.checkNotNull(errorRoot);
		this.fnName = (fnName == null) ? "" : fnName;
		this.codingConvention = compiler.getCodingConvention();
		this.typeRegistry = compiler.getTypeRegistry();
		this.errorRoot = errorRoot;
		this.sourceName = sourceName;
		this.compiler = compiler;
		this.scope = scope;
	}

	com.google.javascript.jscomp.FunctionTypeBuilder setContents(@javax.annotation.Nullable
	com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents contents) {
		if (contents != null) {
			com.google.javascript.jscomp.FunctionTypeBuilder.this.contents = contents;
		}
		return com.google.javascript.jscomp.FunctionTypeBuilder.this;
	}

	com.google.javascript.jscomp.FunctionTypeBuilder inferFromOverriddenFunction(@javax.annotation.Nullable
	com.google.javascript.rhino.jstype.FunctionType oldType, @javax.annotation.Nullable
	com.google.javascript.rhino.Node paramsParent) {
		if (oldType == null) {
			return com.google.javascript.jscomp.FunctionTypeBuilder.this;
		}
		returnType = oldType.getReturnType();
		returnTypeInferred = oldType.isReturnTypeInferred();
		if (paramsParent == null) {
			parametersNode = oldType.getParametersNode();
			if ((parametersNode) == null) {
				parametersNode = new com.google.javascript.rhino.jstype.FunctionParamBuilder(typeRegistry).build();
			}
		}else {
			com.google.javascript.rhino.jstype.FunctionParamBuilder paramBuilder = new com.google.javascript.rhino.jstype.FunctionParamBuilder(typeRegistry);
			java.util.Iterator<com.google.javascript.rhino.Node> oldParams = oldType.getParameters().iterator();
			boolean warnedAboutArgList = false;
			boolean oldParamsListHitOptArgs = false;
			for (com.google.javascript.rhino.Node currentParam = paramsParent.getFirstChild(); currentParam != null; currentParam = currentParam.getNext()) {
				if (oldParams.hasNext()) {
					com.google.javascript.rhino.Node oldParam = oldParams.next();
					com.google.javascript.rhino.Node newParam = paramBuilder.newParameterFromNode(oldParam);
					oldParamsListHitOptArgs = (oldParamsListHitOptArgs || (oldParam.isVarArgs())) || (oldParam.isOptionalArg());
					if (((currentParam.getNext()) != null) && (newParam.isVarArgs())) {
						newParam.setVarArgs(false);
						newParam.setOptionalArg(true);
					}
				}else {
					warnedAboutArgList |= addParameter(paramBuilder, typeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE), warnedAboutArgList, ((codingConvention.isOptionalParameter(currentParam)) || oldParamsListHitOptArgs), codingConvention.isVarArgsParameter(currentParam));
				}
			}
			while (oldParams.hasNext()) {
				paramBuilder.newOptionalParameterFromNode(oldParams.next());
			} 
			parametersNode = paramBuilder.build();
		}
		return com.google.javascript.jscomp.FunctionTypeBuilder.this;
	}

	com.google.javascript.jscomp.FunctionTypeBuilder inferReturnType(@javax.annotation.Nullable
	com.google.javascript.rhino.JSDocInfo info) {
		if ((info != null) && (info.hasReturnType())) {
			returnType = info.getReturnType().evaluate(scope, typeRegistry);
			returnTypeInferred = false;
		}
		if ((((templateTypeName) != null) && ((returnType) != null)) && (returnType.restrictByNotNullOrUndefined().isTemplateType())) {
			reportError(com.google.javascript.jscomp.FunctionTypeBuilder.TEMPLATE_TYPE_EXPECTED, fnName);
		}
		return com.google.javascript.jscomp.FunctionTypeBuilder.this;
	}

	com.google.javascript.jscomp.FunctionTypeBuilder inferInheritance(@javax.annotation.Nullable
	com.google.javascript.rhino.JSDocInfo info) {
		if (info != null) {
			isConstructor = info.isConstructor();
			isInterface = info.isInterface();
			if (info.hasBaseType()) {
				if (isConstructor) {
					com.google.javascript.rhino.jstype.JSType maybeBaseType = info.getBaseType().evaluate(scope, typeRegistry);
					if ((maybeBaseType != null) && (maybeBaseType.setValidator(new com.google.javascript.jscomp.FunctionTypeBuilder.ExtendedTypeValidator()))) {
						baseType = ((com.google.javascript.rhino.jstype.ObjectType) (maybeBaseType));
					}
				}else {
					reportWarning(com.google.javascript.jscomp.FunctionTypeBuilder.EXTENDS_WITHOUT_TYPEDEF, fnName);
				}
			}
			if ((isConstructor) || (isInterface)) {
				implementedInterfaces = com.google.common.collect.Lists.newArrayList();
				for (com.google.javascript.rhino.JSTypeExpression t : info.getImplementedInterfaces()) {
					com.google.javascript.rhino.jstype.JSType maybeInterType = t.evaluate(scope, typeRegistry);
					if ((maybeInterType != null) && (maybeInterType.setValidator(new com.google.javascript.jscomp.FunctionTypeBuilder.ImplementedTypeValidator()))) {
						implementedInterfaces.add(((com.google.javascript.rhino.jstype.ObjectType) (maybeInterType)));
					}
				}
			}else
				if ((info.getImplementedInterfaceCount()) > 0) {
					reportWarning(com.google.javascript.jscomp.FunctionTypeBuilder.IMPLEMENTS_WITHOUT_CONSTRUCTOR, fnName);
				}
			
			if (isInterface) {
				extendedInterfaces = com.google.common.collect.Lists.newArrayList();
				for (com.google.javascript.rhino.JSTypeExpression t : info.getExtendedInterfaces()) {
					com.google.javascript.rhino.jstype.JSType maybeInterfaceType = t.evaluate(scope, typeRegistry);
					if ((maybeInterfaceType != null) && (maybeInterfaceType.setValidator(new com.google.javascript.jscomp.FunctionTypeBuilder.ExtendedTypeValidator()))) {
						extendedInterfaces.add(((com.google.javascript.rhino.jstype.ObjectType) (maybeInterfaceType)));
					}
				}
			}
		}
		return com.google.javascript.jscomp.FunctionTypeBuilder.this;
	}

	com.google.javascript.jscomp.FunctionTypeBuilder inferThisType(com.google.javascript.rhino.JSDocInfo info, com.google.javascript.rhino.jstype.JSType type) {
		inferThisType(info);
		if ((thisType) == null) {
			com.google.javascript.rhino.jstype.ObjectType objType = com.google.javascript.rhino.jstype.ObjectType.cast(type);
			if ((objType != null) && ((info == null) || (!(info.hasType())))) {
				thisType = objType;
			}
		}
		return com.google.javascript.jscomp.FunctionTypeBuilder.this;
	}

	com.google.javascript.jscomp.FunctionTypeBuilder inferThisType(com.google.javascript.rhino.JSDocInfo info) {
		com.google.javascript.rhino.jstype.ObjectType maybeThisType = null;
		if ((info != null) && (info.hasThisType())) {
			maybeThisType = com.google.javascript.rhino.jstype.ObjectType.cast(info.getThisType().evaluate(scope, typeRegistry));
		}
		if (maybeThisType != null) {
			thisType = maybeThisType;
			thisType.setValidator(new com.google.javascript.jscomp.FunctionTypeBuilder.ThisTypeValidator());
		}
		return com.google.javascript.jscomp.FunctionTypeBuilder.this;
	}

	com.google.javascript.jscomp.FunctionTypeBuilder inferParameterTypes(com.google.javascript.rhino.JSDocInfo info) {
		com.google.javascript.rhino.Node lp = com.google.javascript.rhino.IR.paramList();
		for (java.lang.String name : info.getParameterNames()) {
			lp.addChildToBack(com.google.javascript.rhino.IR.name(name));
		}
		return inferParameterTypes(lp, info);
	}

	com.google.javascript.jscomp.FunctionTypeBuilder inferParameterTypes(@javax.annotation.Nullable
	com.google.javascript.rhino.Node argsParent, @javax.annotation.Nullable
	com.google.javascript.rhino.JSDocInfo info) {
		if (argsParent == null) {
			if (info == null) {
				return com.google.javascript.jscomp.FunctionTypeBuilder.this;
			}else {
				return inferParameterTypes(info);
			}
		}
		com.google.javascript.rhino.Node oldParameterType = null;
		if ((parametersNode) != null) {
			oldParameterType = parametersNode.getFirstChild();
		}
		com.google.javascript.rhino.jstype.FunctionParamBuilder builder = new com.google.javascript.rhino.jstype.FunctionParamBuilder(typeRegistry);
		boolean warnedAboutArgList = false;
		java.util.Set<java.lang.String> allJsDocParams = info == null ? com.google.common.collect.Sets.<java.lang.String>newHashSet() : com.google.common.collect.Sets.newHashSet(info.getParameterNames());
		boolean foundTemplateType = false;
		boolean isVarArgs = false;
		for (com.google.javascript.rhino.Node arg : argsParent.children()) {
			java.lang.String argumentName = arg.getString();
			allJsDocParams.remove(argumentName);
			com.google.javascript.rhino.jstype.JSType parameterType = null;
			boolean isOptionalParam = isOptionalParameter(arg, info);
			isVarArgs = isVarArgsParameter(arg, info);
			if ((info != null) && (info.hasParameterType(argumentName))) {
				parameterType = info.getParameterType(argumentName).evaluate(scope, typeRegistry);
			}else
				if ((oldParameterType != null) && ((oldParameterType.getJSType()) != null)) {
					parameterType = oldParameterType.getJSType();
					isOptionalParam = oldParameterType.isOptionalArg();
					isVarArgs = oldParameterType.isVarArgs();
				}else {
					parameterType = typeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
				}
			
			if (((templateTypeName) != null) && (parameterType.restrictByNotNullOrUndefined().isTemplateType())) {
				if (foundTemplateType) {
					reportError(com.google.javascript.jscomp.FunctionTypeBuilder.TEMPLATE_TYPE_DUPLICATED, fnName);
				}
				foundTemplateType = true;
			}
			warnedAboutArgList |= addParameter(builder, parameterType, warnedAboutArgList, isOptionalParam, isVarArgs);
			if (oldParameterType != null) {
				oldParameterType = oldParameterType.getNext();
			}
		}
		if (!isVarArgs) {
			while ((oldParameterType != null) && (!isVarArgs)) {
				builder.newParameterFromNode(oldParameterType);
				oldParameterType = oldParameterType.getNext();
			} 
		}
		if (((templateTypeName) != null) && (!foundTemplateType)) {
			reportError(com.google.javascript.jscomp.FunctionTypeBuilder.TEMPLATE_TYPE_EXPECTED, fnName);
		}
		for (java.lang.String inexistentName : allJsDocParams) {
			reportWarning(com.google.javascript.jscomp.FunctionTypeBuilder.INEXISTANT_PARAM, inexistentName, fnName);
		}
		parametersNode = builder.build();
		return com.google.javascript.jscomp.FunctionTypeBuilder.this;
	}

	private boolean isOptionalParameter(com.google.javascript.rhino.Node param, @javax.annotation.Nullable
	com.google.javascript.rhino.JSDocInfo info) {
		if (codingConvention.isOptionalParameter(param)) {
			return true;
		}
		java.lang.String paramName = param.getString();
		return ((info != null) && (info.hasParameterType(paramName))) && (info.getParameterType(paramName).isOptionalArg());
	}

	private boolean isVarArgsParameter(com.google.javascript.rhino.Node param, @javax.annotation.Nullable
	com.google.javascript.rhino.JSDocInfo info) {
		if (codingConvention.isVarArgsParameter(param)) {
			return true;
		}
		java.lang.String paramName = param.getString();
		return ((info != null) && (info.hasParameterType(paramName))) && (info.getParameterType(paramName).isVarArgs());
	}

	com.google.javascript.jscomp.FunctionTypeBuilder inferTemplateTypeName(@javax.annotation.Nullable
	com.google.javascript.rhino.JSDocInfo info) {
		if (info != null) {
			templateTypeName = info.getTemplateTypeName();
			typeRegistry.setTemplateTypeName(templateTypeName);
		}
		return com.google.javascript.jscomp.FunctionTypeBuilder.this;
	}

	private boolean addParameter(com.google.javascript.rhino.jstype.FunctionParamBuilder builder, com.google.javascript.rhino.jstype.JSType paramType, boolean warnedAboutArgList, boolean isOptional, boolean isVarArgs) {
		boolean emittedWarning = false;
		if (isOptional) {
			if ((!(builder.addOptionalParams(paramType))) && (!warnedAboutArgList)) {
				reportWarning(com.google.javascript.jscomp.FunctionTypeBuilder.VAR_ARGS_MUST_BE_LAST);
				emittedWarning = true;
			}
		}else
			if (isVarArgs) {
				if ((!(builder.addVarArgs(paramType))) && (!warnedAboutArgList)) {
					reportWarning(com.google.javascript.jscomp.FunctionTypeBuilder.VAR_ARGS_MUST_BE_LAST);
					emittedWarning = true;
				}
			}else {
				if ((!(builder.addRequiredParams(paramType))) && (!warnedAboutArgList)) {
					if (builder.hasVarArgs()) {
						reportWarning(com.google.javascript.jscomp.FunctionTypeBuilder.VAR_ARGS_MUST_BE_LAST);
					}else {
						reportWarning(com.google.javascript.jscomp.FunctionTypeBuilder.OPTIONAL_ARG_AT_END);
					}
					emittedWarning = true;
				}
			}
		
		return emittedWarning;
	}

	com.google.javascript.rhino.jstype.FunctionType buildAndRegister() {
		if ((((returnType) == null) && (!(contents.mayHaveNonEmptyReturns()))) && (!(contents.mayBeFromExterns()))) {
			returnType = typeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE);
			returnTypeInferred = true;
		}
		if ((returnType) == null) {
			returnType = typeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
		}
		if ((parametersNode) == null) {
			throw new java.lang.IllegalStateException("All Function types must have params and a return type");
		}
		com.google.javascript.rhino.jstype.FunctionType fnType;
		if (isConstructor) {
			fnType = getOrCreateConstructor();
		}else
			if (isInterface) {
				fnType = typeRegistry.createInterfaceType(fnName, contents.getSourceNode());
				if ((getScopeDeclaredIn().isGlobal()) && (!(fnName.isEmpty()))) {
					typeRegistry.declareType(fnName, fnType.getInstanceType());
				}
				maybeSetBaseType(fnType);
			}else {
				fnType = new com.google.javascript.rhino.jstype.FunctionBuilder(typeRegistry).withName(fnName).withSourceNode(contents.getSourceNode()).withParamsNode(parametersNode).withReturnType(returnType, returnTypeInferred).withTypeOfThis(thisType).withTemplateName(templateTypeName).build();
				maybeSetBaseType(fnType);
			}
		
		if ((implementedInterfaces) != null) {
			fnType.setImplementedInterfaces(implementedInterfaces);
		}
		if ((extendedInterfaces) != null) {
			fnType.setExtendedInterfaces(extendedInterfaces);
		}
		typeRegistry.clearTemplateTypeName();
		return fnType;
	}

	private void maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType fnType) {
		if ((!(fnType.isInterface())) && ((baseType) != null)) {
			fnType.setPrototypeBasedOn(baseType);
		}
	}

	private com.google.javascript.rhino.jstype.FunctionType getOrCreateConstructor() {
		com.google.javascript.rhino.jstype.FunctionType fnType = typeRegistry.createConstructorType(fnName, contents.getSourceNode(), parametersNode, returnType);
		com.google.javascript.rhino.jstype.JSType existingType = typeRegistry.getType(fnName);
		if (existingType != null) {
			boolean isInstanceObject = existingType.isInstanceType();
			if (isInstanceObject || (fnName.equals("Function"))) {
				com.google.javascript.rhino.jstype.FunctionType existingFn = isInstanceObject ? existingType.toObjectType().getConstructor() : typeRegistry.getNativeFunctionType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE);
				if ((existingFn.getSource()) == null) {
					existingFn.setSource(contents.getSourceNode());
				}
				if (!(existingFn.hasEqualCallType(fnType))) {
					reportWarning(com.google.javascript.jscomp.FunctionTypeBuilder.TYPE_REDEFINITION, fnName, fnType.toString(), existingFn.toString());
				}
				return existingFn;
			}else {
			}
		}
		maybeSetBaseType(fnType);
		if ((getScopeDeclaredIn().isGlobal()) && (!(fnName.isEmpty()))) {
			typeRegistry.declareType(fnName, fnType.getInstanceType());
		}
		return fnType;
	}

	private void reportWarning(com.google.javascript.jscomp.DiagnosticType warning, java.lang.String... args) {
		compiler.report(com.google.javascript.jscomp.JSError.make(sourceName, errorRoot, warning, args));
	}

	private void reportError(com.google.javascript.jscomp.DiagnosticType error, java.lang.String... args) {
		compiler.report(com.google.javascript.jscomp.JSError.make(sourceName, errorRoot, error, args));
	}

	static boolean isFunctionTypeDeclaration(com.google.javascript.rhino.JSDocInfo info) {
		return (((((info.getParameterCount()) > 0) || (info.hasReturnType())) || (info.hasThisType())) || (info.isConstructor())) || (info.isInterface());
	}

	private com.google.javascript.jscomp.Scope getScopeDeclaredIn() {
		int dotIndex = fnName.indexOf(".");
		if (dotIndex != (-1)) {
			java.lang.String rootVarName = fnName.substring(0, dotIndex);
			com.google.javascript.jscomp.Scope.Var rootVar = scope.getVar(rootVarName);
			if (rootVar != null) {
				return rootVar.getScope();
			}
		}
		return scope;
	}

	private static boolean hasMoreTagsToResolve(com.google.javascript.rhino.jstype.ObjectType objectType) {
		com.google.common.base.Preconditions.checkArgument(objectType.isUnknownType());
		if ((objectType.getImplicitPrototype()) != null) {
			if (objectType.getImplicitPrototype().isResolved()) {
				return false;
			}else {
				return true;
			}
		}else {
			com.google.javascript.rhino.jstype.FunctionType ctor = objectType.getConstructor();
			if (ctor != null) {
				for (com.google.javascript.rhino.jstype.ObjectType interfaceType : ctor.getExtendedInterfaces()) {
					if (!(interfaceType.isResolved())) {
						return true;
					}
				}
			}
			return false;
		}
	}

	static interface FunctionContents {
		com.google.javascript.rhino.Node getSourceNode();

		boolean mayBeFromExterns();

		boolean mayHaveNonEmptyReturns();

		java.lang.Iterable<java.lang.String> getEscapedVarNames();
	}

	static class UnknownFunctionContents implements com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents {
		private static com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents singleton = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();

		static com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents get() {
			return com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents.singleton;
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getSourceNode() {
			return null;
		}

		@java.lang.Override
		public boolean mayBeFromExterns() {
			return true;
		}

		@java.lang.Override
		public boolean mayHaveNonEmptyReturns() {
			return true;
		}

		@java.lang.Override
		public java.lang.Iterable<java.lang.String> getEscapedVarNames() {
			return com.google.common.collect.ImmutableList.of();
		}
	}

	static class AstFunctionContents implements com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents {
		private final com.google.javascript.rhino.Node n;

		private boolean hasNonEmptyReturns = false;

		private java.util.Set<java.lang.String> escapedVarNames;

		AstFunctionContents(com.google.javascript.rhino.Node n) {
			this.n = n;
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getSourceNode() {
			return n;
		}

		@java.lang.Override
		public boolean mayBeFromExterns() {
			return n.isFromExterns();
		}

		@java.lang.Override
		public boolean mayHaveNonEmptyReturns() {
			return hasNonEmptyReturns;
		}

		void recordNonEmptyReturn() {
			hasNonEmptyReturns = true;
		}

		@java.lang.Override
		public java.lang.Iterable<java.lang.String> getEscapedVarNames() {
			return (escapedVarNames) == null ? com.google.common.collect.ImmutableList.<java.lang.String>of() : escapedVarNames;
		}

		void recordEscapedVarName(java.lang.String name) {
			if ((escapedVarNames) == null) {
				escapedVarNames = com.google.common.collect.Sets.newHashSet();
			}
			escapedVarNames.add(name);
		}
	}
}


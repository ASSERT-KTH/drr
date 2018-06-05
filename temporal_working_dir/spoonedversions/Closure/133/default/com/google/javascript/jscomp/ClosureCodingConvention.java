

package com.google.javascript.jscomp;


public class ClosureCodingConvention extends com.google.javascript.jscomp.CodingConventions.Proxy {
	private static final long serialVersionUID = 1L;

	static final com.google.javascript.jscomp.DiagnosticType OBJECTLIT_EXPECTED = com.google.javascript.jscomp.DiagnosticType.warning("JSC_REFLECT_OBJECTLIT_EXPECTED", "Object literal expected as second argument");

	private final java.util.Set<java.lang.String> indirectlyDeclaredProperties;

	public ClosureCodingConvention() {
		this(com.google.javascript.jscomp.CodingConventions.getDefault());
	}

	public ClosureCodingConvention(com.google.javascript.jscomp.CodingConvention wrapped) {
		super(wrapped);
		java.util.Set<java.lang.String> props = com.google.common.collect.Sets.newHashSet("superClass_", "instance_", "getInstance");
		props.addAll(wrapped.getIndirectlyDeclaredProperties());
		indirectlyDeclaredProperties = com.google.common.collect.ImmutableSet.copyOf(props);
	}

	@java.lang.Override
	public void applySubclassRelationship(com.google.javascript.rhino.jstype.FunctionType parentCtor, com.google.javascript.rhino.jstype.FunctionType childCtor, com.google.javascript.jscomp.CodingConvention.SubclassType type) {
		super.applySubclassRelationship(parentCtor, childCtor, type);
		if (type == (com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS)) {
			childCtor.defineDeclaredProperty("superClass_", parentCtor.getPrototype(), childCtor.getSource());
			childCtor.getPrototype().defineDeclaredProperty("constructor", childCtor.cloneWithoutArrowType(), childCtor.getSource());
		}
	}

	@java.lang.Override
	public com.google.javascript.jscomp.CodingConvention.SubclassRelationship getClassesDefinedByCall(com.google.javascript.rhino.Node callNode) {
		com.google.javascript.jscomp.CodingConvention.SubclassRelationship relationship = super.getClassesDefinedByCall(callNode);
		if (relationship != null)
			return relationship;
		
		com.google.javascript.rhino.Node callName = callNode.getFirstChild();
		com.google.javascript.jscomp.CodingConvention.SubclassType type = typeofClassDefiningName(callName);
		if (type != null) {
			com.google.javascript.rhino.Node subclass = null;
			com.google.javascript.rhino.Node superclass = callNode.getLastChild();
			boolean isDeprecatedCall = ((callNode.getChildCount()) == 2) && (callName.isGetProp());
			if (isDeprecatedCall) {
				subclass = callName.getFirstChild();
			}else
				if ((callNode.getChildCount()) == 3) {
					subclass = callName.getNext();
				}else {
					return null;
				}
			
			if (type == (com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN)) {
				if (!(endsWithPrototype(superclass))) {
					return null;
				}
				if (!isDeprecatedCall) {
					if (!(endsWithPrototype(subclass))) {
						return null;
					}
					subclass = subclass.getFirstChild();
				}
				superclass = superclass.getFirstChild();
			}
			if (((subclass != null) && (subclass.isUnscopedQualifiedName())) && (superclass.isUnscopedQualifiedName())) {
				return new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(type, subclass, superclass);
			}
		}
		return null;
	}

	private com.google.javascript.jscomp.CodingConvention.SubclassType typeofClassDefiningName(com.google.javascript.rhino.Node callName) {
		java.lang.String methodName = null;
		if (callName.isGetProp()) {
			methodName = callName.getLastChild().getString();
		}else
			if (callName.isName()) {
				java.lang.String name = callName.getString();
				int dollarIndex = name.lastIndexOf('$');
				if (dollarIndex != (-1)) {
					methodName = name.substring((dollarIndex + 1));
				}
			}
		
		if (methodName != null) {
			if (methodName.equals("inherits")) {
				return com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
			}else
				if (methodName.equals("mixin")) {
					return com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
				}
			
		}
		return null;
	}

	@java.lang.Override
	public boolean isSuperClassReference(java.lang.String propertyName) {
		return ("superClass_".equals(propertyName)) || (super.isSuperClassReference(propertyName));
	}

	private boolean endsWithPrototype(com.google.javascript.rhino.Node qualifiedName) {
		return (qualifiedName.isGetProp()) && (qualifiedName.getLastChild().getString().equals("prototype"));
	}

	@java.lang.Override
	public java.lang.String extractClassNameIfProvide(com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
		return com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfGoog(node, parent, "goog.provide");
	}

	@java.lang.Override
	public java.lang.String extractClassNameIfRequire(com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
		return com.google.javascript.jscomp.ClosureCodingConvention.extractClassNameIfGoog(node, parent, "goog.require");
	}

	private static java.lang.String extractClassNameIfGoog(com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent, java.lang.String functionName) {
		java.lang.String className = null;
		if (com.google.javascript.jscomp.NodeUtil.isExprCall(parent)) {
			com.google.javascript.rhino.Node callee = node.getFirstChild();
			if ((callee != null) && (callee.isGetProp())) {
				java.lang.String qualifiedName = callee.getQualifiedName();
				if (functionName.equals(qualifiedName)) {
					com.google.javascript.rhino.Node target = callee.getNext();
					if ((target != null) && (target.isString())) {
						className = target.getString();
					}
				}
			}
		}
		return className;
	}

	@java.lang.Override
	public java.lang.String getExportPropertyFunction() {
		return "goog.exportProperty";
	}

	@java.lang.Override
	public java.lang.String getExportSymbolFunction() {
		return "goog.exportSymbol";
	}

	@java.lang.Override
	public java.util.List<java.lang.String> identifyTypeDeclarationCall(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node callName = n.getFirstChild();
		if (("goog.addDependency".equals(callName.getQualifiedName())) && ((n.getChildCount()) >= 3)) {
			com.google.javascript.rhino.Node typeArray = callName.getNext().getNext();
			if (typeArray.isArrayLit()) {
				java.util.List<java.lang.String> typeNames = com.google.common.collect.Lists.newArrayList();
				for (com.google.javascript.rhino.Node name = typeArray.getFirstChild(); name != null; name = name.getNext()) {
					if (name.isString()) {
						typeNames.add(name.getString());
					}
				}
				return typeNames;
			}
		}
		return super.identifyTypeDeclarationCall(n);
	}

	@java.lang.Override
	public java.lang.String getAbstractMethodName() {
		return "goog.abstractMethod";
	}

	@java.lang.Override
	public java.lang.String getSingletonGetterClassName(com.google.javascript.rhino.Node callNode) {
		com.google.javascript.rhino.Node callArg = callNode.getFirstChild();
		java.lang.String callName = callArg.getQualifiedName();
		if ((!(("goog.addSingletonGetter".equals(callName)) || ("goog$addSingletonGetter".equals(callName)))) || ((callNode.getChildCount()) != 2)) {
			return super.getSingletonGetterClassName(callNode);
		}
		return callArg.getNext().getQualifiedName();
	}

	@java.lang.Override
	public void applySingletonGetter(com.google.javascript.rhino.jstype.FunctionType functionType, com.google.javascript.rhino.jstype.FunctionType getterType, com.google.javascript.rhino.jstype.ObjectType objectType) {
		super.applySingletonGetter(functionType, getterType, objectType);
		functionType.defineDeclaredProperty("getInstance", getterType, functionType.getSource());
		functionType.defineDeclaredProperty("instance_", objectType, functionType.getSource());
	}

	@java.lang.Override
	public java.lang.String getGlobalObject() {
		return "goog.global";
	}

	private final java.util.Set<java.lang.String> propertyTestFunctions = com.google.common.collect.ImmutableSet.of("goog.isDef", "goog.isNull", "goog.isDefAndNotNull", "goog.isString", "goog.isNumber", "goog.isBoolean", "goog.isFunction", "goog.isArray", "goog.isObject");

	@java.lang.Override
	public boolean isPropertyTestFunction(com.google.javascript.rhino.Node call) {
		com.google.common.base.Preconditions.checkArgument(call.isCall());
		return (propertyTestFunctions.contains(call.getFirstChild().getQualifiedName())) || (super.isPropertyTestFunction(call));
	}

	@java.lang.Override
	public com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast getObjectLiteralCast(com.google.javascript.rhino.Node callNode) {
		com.google.common.base.Preconditions.checkArgument(callNode.isCall());
		com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast proxyCast = super.getObjectLiteralCast(callNode);
		if (proxyCast != null) {
			return proxyCast;
		}
		com.google.javascript.rhino.Node callName = callNode.getFirstChild();
		if ((!("goog.reflect.object".equals(callName.getQualifiedName()))) || ((callNode.getChildCount()) != 3)) {
			return null;
		}
		com.google.javascript.rhino.Node typeNode = callName.getNext();
		if (!(typeNode.isQualifiedName())) {
			return null;
		}
		com.google.javascript.rhino.Node objectNode = typeNode.getNext();
		if (!(objectNode.isObjectLit())) {
			return new com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast(null, null, com.google.javascript.jscomp.ClosureCodingConvention.OBJECTLIT_EXPECTED);
		}
		return new com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast(typeNode.getQualifiedName(), typeNode.getNext(), null);
	}

	@java.lang.Override
	public boolean isOptionalParameter(com.google.javascript.rhino.Node parameter) {
		return false;
	}

	@java.lang.Override
	public boolean isVarArgsParameter(com.google.javascript.rhino.Node parameter) {
		return false;
	}

	@java.lang.Override
	public boolean isPrivate(java.lang.String name) {
		return false;
	}

	@java.lang.Override
	public java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> getAssertionFunctions() {
		return com.google.common.collect.ImmutableList.<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec>of(new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("goog.asserts.assert"), new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("goog.asserts.assertNumber", com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE), new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("goog.asserts.assertString", com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE), new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("goog.asserts.assertFunction", com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_INSTANCE_TYPE), new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("goog.asserts.assertObject", com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE), new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("goog.asserts.assertArray", com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE), new com.google.javascript.jscomp.ClosureCodingConvention.AssertInstanceofSpec("goog.asserts.assertInstanceof"));
	}

	@java.lang.Override
	public com.google.javascript.jscomp.CodingConvention.Bind describeFunctionBind(com.google.javascript.rhino.Node n, boolean useTypeInfo) {
		com.google.javascript.jscomp.CodingConvention.Bind result = super.describeFunctionBind(n, useTypeInfo);
		if (result != null) {
			return result;
		}
		if (!(n.isCall())) {
			return null;
		}
		com.google.javascript.rhino.Node callTarget = n.getFirstChild();
		java.lang.String name = callTarget.getQualifiedName();
		if (name != null) {
			if ((name.equals("goog.bind")) || (name.equals("goog$bind"))) {
				com.google.javascript.rhino.Node fn = callTarget.getNext();
				if (fn == null) {
					return null;
				}
				com.google.javascript.rhino.Node thisValue = safeNext(fn);
				com.google.javascript.rhino.Node parameters = safeNext(thisValue);
				return new com.google.javascript.jscomp.CodingConvention.Bind(fn, thisValue, parameters);
			}
			if ((name.equals("goog.partial")) || (name.equals("goog$partial"))) {
				com.google.javascript.rhino.Node fn = callTarget.getNext();
				if (fn == null) {
					return null;
				}
				com.google.javascript.rhino.Node thisValue = null;
				com.google.javascript.rhino.Node parameters = safeNext(fn);
				return new com.google.javascript.jscomp.CodingConvention.Bind(fn, thisValue, parameters);
			}
		}
		return null;
	}

	@java.lang.Override
	public java.util.Collection<java.lang.String> getIndirectlyDeclaredProperties() {
		return indirectlyDeclaredProperties;
	}

	private com.google.javascript.rhino.Node safeNext(com.google.javascript.rhino.Node n) {
		if (n != null) {
			return n.getNext();
		}
		return null;
	}

	public static class AssertInstanceofSpec extends com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec {
		public AssertInstanceofSpec(java.lang.String functionName) {
			super(functionName, com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType getAssertedType(com.google.javascript.rhino.Node call, com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
			if ((call.getChildCount()) > 2) {
				com.google.javascript.rhino.Node constructor = call.getFirstChild().getNext().getNext();
				if (constructor != null) {
					com.google.javascript.rhino.jstype.JSType ownerType = constructor.getJSType();
					if (((ownerType != null) && (ownerType.isFunctionType())) && (ownerType.isConstructor())) {
						com.google.javascript.rhino.jstype.FunctionType functionType = ((com.google.javascript.rhino.jstype.FunctionType) (ownerType));
						return functionType.getInstanceType();
					}
				}
			}
			return super.getAssertedType(call, registry);
		}
	}
}


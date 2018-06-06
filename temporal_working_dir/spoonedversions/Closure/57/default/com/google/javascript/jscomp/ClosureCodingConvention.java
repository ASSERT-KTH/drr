

package com.google.javascript.jscomp;


public class ClosureCodingConvention extends com.google.javascript.jscomp.DefaultCodingConvention {
	private static final long serialVersionUID = 1L;

	static final com.google.javascript.jscomp.DiagnosticType OBJECTLIT_EXPECTED = com.google.javascript.jscomp.DiagnosticType.warning("JSC_REFLECT_OBJECTLIT_EXPECTED", "Object literal expected as second argument");

	@java.lang.Override
	public void applySubclassRelationship(com.google.javascript.rhino.jstype.FunctionType parentCtor, com.google.javascript.rhino.jstype.FunctionType childCtor, com.google.javascript.jscomp.CodingConvention.SubclassType type) {
		if (type == (com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS)) {
			childCtor.defineDeclaredProperty("superClass_", parentCtor.getPrototype(), parentCtor.getSource());
			childCtor.getPrototype().defineDeclaredProperty("constructor", childCtor, parentCtor.getSource());
		}
	}

	@java.lang.Override
	public com.google.javascript.jscomp.CodingConvention.SubclassRelationship getClassesDefinedByCall(com.google.javascript.rhino.Node callNode) {
		com.google.javascript.rhino.Node callName = callNode.getFirstChild();
		com.google.javascript.jscomp.CodingConvention.SubclassType type = typeofClassDefiningName(callName);
		if (type != null) {
			com.google.javascript.rhino.Node subclass = null;
			com.google.javascript.rhino.Node superclass = callNode.getLastChild();
			boolean isDeprecatedCall = ((callNode.getChildCount()) == 2) && ((callName.getType()) == (com.google.javascript.rhino.Token.GETPROP));
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
		if ((callName.getType()) == (com.google.javascript.rhino.Token.GETPROP)) {
			methodName = callName.getLastChild().getString();
		}else
			if ((callName.getType()) == (com.google.javascript.rhino.Token.NAME)) {
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
		return "superClass_".equals(propertyName);
	}

	private boolean endsWithPrototype(com.google.javascript.rhino.Node qualifiedName) {
		return ((qualifiedName.getType()) == (com.google.javascript.rhino.Token.GETPROP)) && (qualifiedName.getLastChild().getString().equals("prototype"));
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
			if ((callee != null) && ((callee.getType()) == (com.google.javascript.rhino.Token.GETPROP))) {
				java.lang.String qualifiedName = callee.getQualifiedName();
				if (functionName.equals(qualifiedName)) {
					com.google.javascript.rhino.Node target = callee.getNext();
					if (target != null) {
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
			if ((typeArray.getType()) == (com.google.javascript.rhino.Token.ARRAYLIT)) {
				java.util.List<java.lang.String> typeNames = com.google.common.collect.Lists.newArrayList();
				for (com.google.javascript.rhino.Node name = typeArray.getFirstChild(); name != null; name = name.getNext()) {
					if ((name.getType()) == (com.google.javascript.rhino.Token.STRING)) {
						typeNames.add(name.getString());
					}
				}
				return typeNames;
			}
		}
		return null;
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
			return null;
		}
		return callArg.getNext().getQualifiedName();
	}

	@java.lang.Override
	public void applySingletonGetter(com.google.javascript.rhino.jstype.FunctionType functionType, com.google.javascript.rhino.jstype.FunctionType getterType, com.google.javascript.rhino.jstype.ObjectType objectType) {
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
		com.google.common.base.Preconditions.checkArgument(((call.getType()) == (com.google.javascript.rhino.Token.CALL)));
		return propertyTestFunctions.contains(call.getFirstChild().getQualifiedName());
	}

	@java.lang.Override
	public com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast getObjectLiteralCast(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node callNode) {
		com.google.common.base.Preconditions.checkArgument(((callNode.getType()) == (com.google.javascript.rhino.Token.CALL)));
		com.google.javascript.rhino.Node callName = callNode.getFirstChild();
		if ((!("goog.reflect.object".equals(callName.getQualifiedName()))) || ((callNode.getChildCount()) != 3)) {
			return null;
		}
		com.google.javascript.rhino.Node typeNode = callName.getNext();
		if (!(typeNode.isQualifiedName())) {
			return null;
		}
		com.google.javascript.rhino.Node objectNode = typeNode.getNext();
		if ((objectNode.getType()) != (com.google.javascript.rhino.Token.OBJECTLIT)) {
			t.getCompiler().report(com.google.javascript.jscomp.JSError.make(t.getSourceName(), callNode, com.google.javascript.jscomp.ClosureCodingConvention.OBJECTLIT_EXPECTED));
			return null;
		}
		return new com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast(typeNode.getQualifiedName(), typeNode.getNext());
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
		return com.google.common.collect.ImmutableList.<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec>of(new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("goog.asserts.assert"), new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("goog.asserts.assertNumber", com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE), new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("goog.asserts.assertString", com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE), new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("goog.asserts.assertFunction", com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_INSTANCE_TYPE), new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("goog.asserts.assertObject", com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE), new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("goog.asserts.assertArray", com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE), new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("goog.asserts.assertInstanceof", com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE));
	}

	@java.lang.Override
	public com.google.javascript.jscomp.CodingConvention.Bind describeFunctionBind(com.google.javascript.rhino.Node n) {
		com.google.javascript.jscomp.CodingConvention.Bind result = super.describeFunctionBind(n);
		if (result != null) {
			return result;
		}
		if ((n.getType()) != (com.google.javascript.rhino.Token.CALL)) {
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

	private com.google.javascript.rhino.Node safeNext(com.google.javascript.rhino.Node n) {
		if (n != null) {
			return n.getNext();
		}
		return null;
	}
}


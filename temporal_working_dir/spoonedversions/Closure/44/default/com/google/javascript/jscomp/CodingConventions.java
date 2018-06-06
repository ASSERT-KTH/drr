

package com.google.javascript.jscomp;


public class CodingConventions {
	private CodingConventions() {
	}

	public static com.google.javascript.jscomp.CodingConvention getDefault() {
		return new com.google.javascript.jscomp.CodingConventions.DefaultCodingConvention();
	}

	public static class Proxy implements com.google.javascript.jscomp.CodingConvention {
		protected final com.google.javascript.jscomp.CodingConvention nextConvention;

		protected Proxy(com.google.javascript.jscomp.CodingConvention convention) {
			this.nextConvention = convention;
		}

		@java.lang.Override
		public boolean isConstant(java.lang.String variableName) {
			return nextConvention.isConstant(variableName);
		}

		@java.lang.Override
		public boolean isConstantKey(java.lang.String keyName) {
			return nextConvention.isConstantKey(keyName);
		}

		@java.lang.Override
		public boolean isValidEnumKey(java.lang.String key) {
			return nextConvention.isValidEnumKey(key);
		}

		@java.lang.Override
		public boolean isOptionalParameter(com.google.javascript.rhino.Node parameter) {
			return nextConvention.isOptionalParameter(parameter);
		}

		@java.lang.Override
		public boolean isVarArgsParameter(com.google.javascript.rhino.Node parameter) {
			return nextConvention.isVarArgsParameter(parameter);
		}

		@java.lang.Override
		public boolean isExported(java.lang.String name, boolean local) {
			return nextConvention.isExported(name, local);
		}

		@java.lang.Override
		public final boolean isExported(java.lang.String name) {
			return (isExported(name, false)) || (isExported(name, true));
		}

		@java.lang.Override
		public boolean isPrivate(java.lang.String name) {
			return nextConvention.isPrivate(name);
		}

		@java.lang.Override
		public com.google.javascript.jscomp.CodingConvention.SubclassRelationship getClassesDefinedByCall(com.google.javascript.rhino.Node callNode) {
			return nextConvention.getClassesDefinedByCall(callNode);
		}

		@java.lang.Override
		public boolean isSuperClassReference(java.lang.String propertyName) {
			return nextConvention.isSuperClassReference(propertyName);
		}

		@java.lang.Override
		public java.lang.String extractClassNameIfProvide(com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
			return nextConvention.extractClassNameIfProvide(node, parent);
		}

		@java.lang.Override
		public java.lang.String extractClassNameIfRequire(com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
			return nextConvention.extractClassNameIfRequire(node, parent);
		}

		@java.lang.Override
		public java.lang.String getExportPropertyFunction() {
			return nextConvention.getExportPropertyFunction();
		}

		@java.lang.Override
		public java.lang.String getExportSymbolFunction() {
			return nextConvention.getExportSymbolFunction();
		}

		@java.lang.Override
		public java.util.List<java.lang.String> identifyTypeDeclarationCall(com.google.javascript.rhino.Node n) {
			return nextConvention.identifyTypeDeclarationCall(n);
		}

		@java.lang.Override
		public void applySubclassRelationship(com.google.javascript.rhino.jstype.FunctionType parentCtor, com.google.javascript.rhino.jstype.FunctionType childCtor, com.google.javascript.jscomp.CodingConvention.SubclassType type) {
			nextConvention.applySubclassRelationship(parentCtor, childCtor, type);
		}

		@java.lang.Override
		public java.lang.String getAbstractMethodName() {
			return nextConvention.getAbstractMethodName();
		}

		@java.lang.Override
		public java.lang.String getSingletonGetterClassName(com.google.javascript.rhino.Node callNode) {
			return nextConvention.getSingletonGetterClassName(callNode);
		}

		@java.lang.Override
		public void applySingletonGetter(com.google.javascript.rhino.jstype.FunctionType functionType, com.google.javascript.rhino.jstype.FunctionType getterType, com.google.javascript.rhino.jstype.ObjectType objectType) {
			nextConvention.applySingletonGetter(functionType, getterType, objectType);
		}

		@java.lang.Override
		public com.google.javascript.jscomp.CodingConvention.DelegateRelationship getDelegateRelationship(com.google.javascript.rhino.Node callNode) {
			return nextConvention.getDelegateRelationship(callNode);
		}

		@java.lang.Override
		public void applyDelegateRelationship(com.google.javascript.rhino.jstype.ObjectType delegateSuperclass, com.google.javascript.rhino.jstype.ObjectType delegateBase, com.google.javascript.rhino.jstype.ObjectType delegator, com.google.javascript.rhino.jstype.FunctionType delegateProxy, com.google.javascript.rhino.jstype.FunctionType findDelegate) {
			nextConvention.applyDelegateRelationship(delegateSuperclass, delegateBase, delegator, delegateProxy, findDelegate);
		}

		@java.lang.Override
		public java.lang.String getDelegateSuperclassName() {
			return nextConvention.getDelegateSuperclassName();
		}

		@java.lang.Override
		public void checkForCallingConventionDefiningCalls(com.google.javascript.rhino.Node n, java.util.Map<java.lang.String, java.lang.String> delegateCallingConventions) {
			nextConvention.checkForCallingConventionDefiningCalls(n, delegateCallingConventions);
		}

		@java.lang.Override
		public void defineDelegateProxyPrototypeProperties(com.google.javascript.rhino.jstype.JSTypeRegistry registry, com.google.javascript.jscomp.Scope scope, java.util.List<com.google.javascript.rhino.jstype.ObjectType> delegateProxyPrototypes, java.util.Map<java.lang.String, java.lang.String> delegateCallingConventions) {
			nextConvention.defineDelegateProxyPrototypeProperties(registry, scope, delegateProxyPrototypes, delegateCallingConventions);
		}

		@java.lang.Override
		public java.lang.String getGlobalObject() {
			return nextConvention.getGlobalObject();
		}

		@java.lang.Override
		public java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> getAssertionFunctions() {
			return nextConvention.getAssertionFunctions();
		}

		@java.lang.Override
		public com.google.javascript.jscomp.CodingConvention.Bind describeFunctionBind(com.google.javascript.rhino.Node n) {
			return nextConvention.describeFunctionBind(n);
		}

		@java.lang.Override
		public boolean isPropertyTestFunction(com.google.javascript.rhino.Node call) {
			return nextConvention.isPropertyTestFunction(call);
		}

		@java.lang.Override
		public boolean isPrototypeAlias(com.google.javascript.rhino.Node getProp) {
			return false;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast getObjectLiteralCast(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node callNode) {
			return nextConvention.getObjectLiteralCast(t, callNode);
		}
	}

	private static class DefaultCodingConvention implements com.google.javascript.jscomp.CodingConvention {
		private static final long serialVersionUID = 1L;

		@java.lang.Override
		public boolean isConstant(java.lang.String variableName) {
			return false;
		}

		@java.lang.Override
		public boolean isConstantKey(java.lang.String variableName) {
			return false;
		}

		@java.lang.Override
		public boolean isValidEnumKey(java.lang.String key) {
			return (key != null) && ((key.length()) > 0);
		}

		@java.lang.Override
		public boolean isOptionalParameter(com.google.javascript.rhino.Node parameter) {
			return !(isVarArgsParameter(parameter));
		}

		@java.lang.Override
		public boolean isVarArgsParameter(com.google.javascript.rhino.Node parameter) {
			return (parameter.getParent().getLastChild()) == parameter;
		}

		@java.lang.Override
		public boolean isExported(java.lang.String name, boolean local) {
			return local && (name.startsWith("$super"));
		}

		@java.lang.Override
		public boolean isExported(java.lang.String name) {
			return (isExported(name, false)) || (isExported(name, true));
		}

		@java.lang.Override
		public boolean isPrivate(java.lang.String name) {
			return false;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.CodingConvention.SubclassRelationship getClassesDefinedByCall(com.google.javascript.rhino.Node callNode) {
			return null;
		}

		@java.lang.Override
		public boolean isSuperClassReference(java.lang.String propertyName) {
			return false;
		}

		@java.lang.Override
		public java.lang.String extractClassNameIfProvide(com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
			java.lang.String message = "only implemented in GoogleCodingConvention";
			throw new java.lang.UnsupportedOperationException(message);
		}

		@java.lang.Override
		public java.lang.String extractClassNameIfRequire(com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
			java.lang.String message = "only implemented in GoogleCodingConvention";
			throw new java.lang.UnsupportedOperationException(message);
		}

		@java.lang.Override
		public java.lang.String getExportPropertyFunction() {
			return null;
		}

		@java.lang.Override
		public java.lang.String getExportSymbolFunction() {
			return null;
		}

		@java.lang.Override
		public java.util.List<java.lang.String> identifyTypeDeclarationCall(com.google.javascript.rhino.Node n) {
			return null;
		}

		@java.lang.Override
		public void applySubclassRelationship(com.google.javascript.rhino.jstype.FunctionType parentCtor, com.google.javascript.rhino.jstype.FunctionType childCtor, com.google.javascript.jscomp.CodingConvention.SubclassType type) {
		}

		@java.lang.Override
		public java.lang.String getAbstractMethodName() {
			return null;
		}

		@java.lang.Override
		public java.lang.String getSingletonGetterClassName(com.google.javascript.rhino.Node callNode) {
			return null;
		}

		@java.lang.Override
		public void applySingletonGetter(com.google.javascript.rhino.jstype.FunctionType functionType, com.google.javascript.rhino.jstype.FunctionType getterType, com.google.javascript.rhino.jstype.ObjectType objectType) {
		}

		@java.lang.Override
		public com.google.javascript.jscomp.CodingConvention.DelegateRelationship getDelegateRelationship(com.google.javascript.rhino.Node callNode) {
			return null;
		}

		@java.lang.Override
		public void applyDelegateRelationship(com.google.javascript.rhino.jstype.ObjectType delegateSuperclass, com.google.javascript.rhino.jstype.ObjectType delegateBase, com.google.javascript.rhino.jstype.ObjectType delegator, com.google.javascript.rhino.jstype.FunctionType delegateProxy, com.google.javascript.rhino.jstype.FunctionType findDelegate) {
		}

		@java.lang.Override
		public java.lang.String getDelegateSuperclassName() {
			return null;
		}

		@java.lang.Override
		public void checkForCallingConventionDefiningCalls(com.google.javascript.rhino.Node n, java.util.Map<java.lang.String, java.lang.String> delegateCallingConventions) {
		}

		@java.lang.Override
		public void defineDelegateProxyPrototypeProperties(com.google.javascript.rhino.jstype.JSTypeRegistry registry, com.google.javascript.jscomp.Scope scope, java.util.List<com.google.javascript.rhino.jstype.ObjectType> delegateProxyPrototypes, java.util.Map<java.lang.String, java.lang.String> delegateCallingConventions) {
		}

		@java.lang.Override
		public java.lang.String getGlobalObject() {
			return "window";
		}

		@java.lang.Override
		public boolean isPropertyTestFunction(com.google.javascript.rhino.Node call) {
			return false;
		}

		@java.lang.Override
		public boolean isPrototypeAlias(com.google.javascript.rhino.Node getProp) {
			return false;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast getObjectLiteralCast(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node callNode) {
			return null;
		}

		@java.lang.Override
		public java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> getAssertionFunctions() {
			return java.util.Collections.emptySet();
		}

		@java.lang.Override
		public com.google.javascript.jscomp.CodingConvention.Bind describeFunctionBind(com.google.javascript.rhino.Node n) {
			if (!(n.isCall())) {
				return null;
			}
			com.google.javascript.rhino.Node callTarget = n.getFirstChild();
			java.lang.String name = callTarget.getQualifiedName();
			if (name != null) {
				if (name.equals("Function.prototype.bind.call")) {
					com.google.javascript.rhino.Node fn = callTarget.getNext();
					if (fn == null) {
						return null;
					}
					com.google.javascript.rhino.Node thisValue = safeNext(fn);
					com.google.javascript.rhino.Node parameters = safeNext(thisValue);
					return new com.google.javascript.jscomp.CodingConvention.Bind(fn, thisValue, parameters);
				}
			}
			if (((callTarget.isGetProp()) && (callTarget.getLastChild().getString().equals("bind"))) && (callTarget.getFirstChild().isFunction())) {
				com.google.javascript.rhino.Node fn = callTarget.getFirstChild();
				com.google.javascript.rhino.Node thisValue = callTarget.getNext();
				com.google.javascript.rhino.Node parameters = safeNext(thisValue);
				return new com.google.javascript.jscomp.CodingConvention.Bind(fn, thisValue, parameters);
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
}


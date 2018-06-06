

package com.google.javascript.jscomp;


public interface CodingConvention extends java.io.Serializable {
	public boolean isConstant(java.lang.String variableName);

	public boolean isConstantKey(java.lang.String keyName);

	public boolean isValidEnumKey(java.lang.String key);

	public boolean isOptionalParameter(com.google.javascript.rhino.Node parameter);

	public boolean isVarArgsParameter(com.google.javascript.rhino.Node parameter);

	public boolean isExported(java.lang.String name, boolean local);

	public boolean isExported(java.lang.String name);

	public boolean isPrivate(java.lang.String name);

	public com.google.javascript.jscomp.CodingConvention.SubclassRelationship getClassesDefinedByCall(com.google.javascript.rhino.Node callNode);

	public boolean isSuperClassReference(java.lang.String propertyName);

	public java.lang.String extractClassNameIfProvide(com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent);

	public java.lang.String extractClassNameIfRequire(com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent);

	public java.lang.String getExportPropertyFunction();

	public java.lang.String getExportSymbolFunction();

	public java.util.List<java.lang.String> identifyTypeDeclarationCall(com.google.javascript.rhino.Node n);

	public void applySubclassRelationship(com.google.javascript.rhino.jstype.FunctionType parentCtor, com.google.javascript.rhino.jstype.FunctionType childCtor, com.google.javascript.jscomp.CodingConvention.SubclassType type);

	public java.lang.String getAbstractMethodName();

	public java.lang.String getSingletonGetterClassName(com.google.javascript.rhino.Node callNode);

	public void applySingletonGetter(com.google.javascript.rhino.jstype.FunctionType functionType, com.google.javascript.rhino.jstype.FunctionType getterType, com.google.javascript.rhino.jstype.ObjectType objectType);

	public com.google.javascript.jscomp.CodingConvention.DelegateRelationship getDelegateRelationship(com.google.javascript.rhino.Node callNode);

	public void applyDelegateRelationship(com.google.javascript.rhino.jstype.ObjectType delegateSuperclass, com.google.javascript.rhino.jstype.ObjectType delegateBase, com.google.javascript.rhino.jstype.ObjectType delegator, com.google.javascript.rhino.jstype.FunctionType delegateProxy, com.google.javascript.rhino.jstype.FunctionType findDelegate);

	public java.lang.String getDelegateSuperclassName();

	public void checkForCallingConventionDefiningCalls(com.google.javascript.rhino.Node n, java.util.Map<java.lang.String, java.lang.String> delegateCallingConventions);

	public void defineDelegateProxyPrototypeProperties(com.google.javascript.rhino.jstype.JSTypeRegistry registry, com.google.javascript.jscomp.Scope scope, java.util.List<com.google.javascript.rhino.jstype.ObjectType> delegateProxyPrototypes, java.util.Map<java.lang.String, java.lang.String> delegateCallingConventions);

	public java.lang.String getGlobalObject();

	public com.google.javascript.jscomp.CodingConvention.Bind describeFunctionBind(com.google.javascript.rhino.Node n);

	public static class Bind {
		final com.google.javascript.rhino.Node target;

		final com.google.javascript.rhino.Node thisValue;

		final com.google.javascript.rhino.Node parameters;

		public Bind(com.google.javascript.rhino.Node target, com.google.javascript.rhino.Node thisValue, com.google.javascript.rhino.Node parameters) {
			this.target = target;
			this.thisValue = thisValue;
			this.parameters = parameters;
		}
	}

	public boolean isPropertyTestFunction(com.google.javascript.rhino.Node call);

	public boolean isPrototypeAlias(com.google.javascript.rhino.Node getProp);

	public com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast getObjectLiteralCast(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node callNode);

	public java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> getAssertionFunctions();

	static enum SubclassType {
INHERITS, MIXIN;	}

	static class SubclassRelationship {
		final com.google.javascript.jscomp.CodingConvention.SubclassType type;

		final java.lang.String subclassName;

		final java.lang.String superclassName;

		public SubclassRelationship(com.google.javascript.jscomp.CodingConvention.SubclassType type, com.google.javascript.rhino.Node subclassNode, com.google.javascript.rhino.Node superclassNode) {
			this.type = type;
			this.subclassName = subclassNode.getQualifiedName();
			this.superclassName = superclassNode.getQualifiedName();
		}
	}

	static class DelegateRelationship {
		final java.lang.String delegateBase;

		final java.lang.String delegator;

		DelegateRelationship(java.lang.String delegateBase, java.lang.String delegator) {
			this.delegateBase = delegateBase;
			this.delegator = delegator;
		}
	}

	static class ObjectLiteralCast {
		final java.lang.String typeName;

		final com.google.javascript.rhino.Node objectNode;

		ObjectLiteralCast(java.lang.String typeName, com.google.javascript.rhino.Node objectNode) {
			this.typeName = typeName;
			this.objectNode = objectNode;
		}
	}

	public class AssertionFunctionSpec {
		private final java.lang.String functionName;

		private final com.google.javascript.rhino.jstype.JSTypeNative assertedType;

		public AssertionFunctionSpec(java.lang.String functionName) {
			this(functionName, null);
		}

		public AssertionFunctionSpec(java.lang.String functionName, com.google.javascript.rhino.jstype.JSTypeNative assertedType) {
			this.functionName = functionName;
			this.assertedType = assertedType;
		}

		public java.lang.String getFunctionName() {
			return functionName;
		}

		public com.google.javascript.rhino.Node getAssertedParam(com.google.javascript.rhino.Node firstParam) {
			return firstParam;
		}

		public com.google.javascript.rhino.jstype.JSTypeNative getAssertedType() {
			return assertedType;
		}
	}
}




package com.google.javascript.rhino.jstype;


public final class FunctionBuilder {
	private final com.google.javascript.rhino.jstype.JSTypeRegistry registry;

	private java.lang.String name = null;

	private com.google.javascript.rhino.Node sourceNode = null;

	private com.google.javascript.rhino.Node parametersNode = null;

	private com.google.javascript.rhino.jstype.JSType returnType = null;

	private com.google.javascript.rhino.jstype.JSType typeOfThis = null;

	private com.google.common.collect.ImmutableList<java.lang.String> templateKeys = com.google.common.collect.ImmutableList.of();

	private boolean inferredReturnType = false;

	private boolean isConstructor = false;

	private boolean isNativeType = false;

	public FunctionBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
		this.registry = registry;
	}

	public com.google.javascript.rhino.jstype.FunctionBuilder withName(java.lang.String name) {
		com.google.javascript.rhino.jstype.FunctionBuilder.this.name = name;
		return com.google.javascript.rhino.jstype.FunctionBuilder.this;
	}

	public com.google.javascript.rhino.jstype.FunctionBuilder withSourceNode(com.google.javascript.rhino.Node sourceNode) {
		com.google.javascript.rhino.jstype.FunctionBuilder.this.sourceNode = sourceNode;
		return com.google.javascript.rhino.jstype.FunctionBuilder.this;
	}

	public com.google.javascript.rhino.jstype.FunctionBuilder withParams(com.google.javascript.rhino.jstype.FunctionParamBuilder params) {
		com.google.javascript.rhino.jstype.FunctionBuilder.this.parametersNode = params.build();
		return com.google.javascript.rhino.jstype.FunctionBuilder.this;
	}

	public com.google.javascript.rhino.jstype.FunctionBuilder withParamsNode(com.google.javascript.rhino.Node parametersNode) {
		com.google.javascript.rhino.jstype.FunctionBuilder.this.parametersNode = parametersNode;
		return com.google.javascript.rhino.jstype.FunctionBuilder.this;
	}

	public com.google.javascript.rhino.jstype.FunctionBuilder withReturnType(com.google.javascript.rhino.jstype.JSType returnType) {
		com.google.javascript.rhino.jstype.FunctionBuilder.this.returnType = returnType;
		return com.google.javascript.rhino.jstype.FunctionBuilder.this;
	}

	public com.google.javascript.rhino.jstype.FunctionBuilder withReturnType(com.google.javascript.rhino.jstype.JSType returnType, boolean inferred) {
		com.google.javascript.rhino.jstype.FunctionBuilder.this.returnType = returnType;
		com.google.javascript.rhino.jstype.FunctionBuilder.this.inferredReturnType = inferred;
		return com.google.javascript.rhino.jstype.FunctionBuilder.this;
	}

	public com.google.javascript.rhino.jstype.FunctionBuilder withInferredReturnType(com.google.javascript.rhino.jstype.JSType returnType) {
		com.google.javascript.rhino.jstype.FunctionBuilder.this.returnType = returnType;
		com.google.javascript.rhino.jstype.FunctionBuilder.this.inferredReturnType = true;
		return com.google.javascript.rhino.jstype.FunctionBuilder.this;
	}

	public com.google.javascript.rhino.jstype.FunctionBuilder withTypeOfThis(com.google.javascript.rhino.jstype.JSType typeOfThis) {
		com.google.javascript.rhino.jstype.FunctionBuilder.this.typeOfThis = typeOfThis;
		return com.google.javascript.rhino.jstype.FunctionBuilder.this;
	}

	public com.google.javascript.rhino.jstype.FunctionBuilder withTemplateKeys(com.google.common.collect.ImmutableList<java.lang.String> templateKeys) {
		com.google.javascript.rhino.jstype.FunctionBuilder.this.templateKeys = templateKeys;
		return com.google.javascript.rhino.jstype.FunctionBuilder.this;
	}

	public com.google.javascript.rhino.jstype.FunctionBuilder forConstructor() {
		com.google.javascript.rhino.jstype.FunctionBuilder.this.isConstructor = true;
		return com.google.javascript.rhino.jstype.FunctionBuilder.this;
	}

	public com.google.javascript.rhino.jstype.FunctionBuilder setIsConstructor(boolean isConstructor) {
		com.google.javascript.rhino.jstype.FunctionBuilder.this.isConstructor = isConstructor;
		return com.google.javascript.rhino.jstype.FunctionBuilder.this;
	}

	com.google.javascript.rhino.jstype.FunctionBuilder forNativeType() {
		com.google.javascript.rhino.jstype.FunctionBuilder.this.isNativeType = true;
		return com.google.javascript.rhino.jstype.FunctionBuilder.this;
	}

	public com.google.javascript.rhino.jstype.FunctionBuilder copyFromOtherFunction(com.google.javascript.rhino.jstype.FunctionType otherType) {
		com.google.javascript.rhino.jstype.FunctionBuilder.this.name = otherType.getReferenceName();
		com.google.javascript.rhino.jstype.FunctionBuilder.this.sourceNode = otherType.getSource();
		com.google.javascript.rhino.jstype.FunctionBuilder.this.parametersNode = otherType.getParametersNode();
		com.google.javascript.rhino.jstype.FunctionBuilder.this.returnType = otherType.getReturnType();
		com.google.javascript.rhino.jstype.FunctionBuilder.this.typeOfThis = otherType.getTypeOfThis();
		com.google.javascript.rhino.jstype.FunctionBuilder.this.templateKeys = otherType.getTemplateKeys();
		com.google.javascript.rhino.jstype.FunctionBuilder.this.isConstructor = otherType.isConstructor();
		com.google.javascript.rhino.jstype.FunctionBuilder.this.isNativeType = otherType.isNativeObjectType();
		return com.google.javascript.rhino.jstype.FunctionBuilder.this;
	}

	public com.google.javascript.rhino.jstype.FunctionType build() {
		return new com.google.javascript.rhino.jstype.FunctionType(registry, name, sourceNode, new com.google.javascript.rhino.jstype.ArrowType(registry, parametersNode, returnType, inferredReturnType), typeOfThis, templateKeys, isConstructor, isNativeType);
	}
}


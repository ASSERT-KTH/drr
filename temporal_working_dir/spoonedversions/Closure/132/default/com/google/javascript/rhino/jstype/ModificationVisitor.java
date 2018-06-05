

package com.google.javascript.rhino.jstype;


public class ModificationVisitor implements com.google.javascript.rhino.jstype.Visitor<com.google.javascript.rhino.jstype.JSType> {
	private final com.google.javascript.rhino.jstype.JSTypeRegistry registry;

	public ModificationVisitor(com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
		this.registry = registry;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType caseNoType() {
		return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType caseEnumElementType(com.google.javascript.rhino.jstype.EnumElementType type) {
		return type;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType caseAllType() {
		return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType caseBooleanType() {
		return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType caseNoObjectType() {
		return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType caseFunctionType(com.google.javascript.rhino.jstype.FunctionType type) {
		if (isNativeFunctionType(type)) {
			return type;
		}
		if (!(type.isOrdinaryFunction())) {
			return type;
		}
		boolean changed = false;
		com.google.javascript.rhino.jstype.JSType beforeThis = type.getTypeOfThis();
		com.google.javascript.rhino.jstype.JSType afterThis = coerseToThisType(beforeThis.visit(com.google.javascript.rhino.jstype.ModificationVisitor.this));
		if (beforeThis != afterThis) {
			changed = true;
		}
		com.google.javascript.rhino.jstype.JSType beforeReturn = type.getReturnType();
		com.google.javascript.rhino.jstype.JSType afterReturn = beforeReturn.visit(com.google.javascript.rhino.jstype.ModificationVisitor.this);
		if (beforeReturn != afterReturn) {
			changed = true;
		}
		com.google.javascript.rhino.jstype.FunctionParamBuilder paramBuilder = new com.google.javascript.rhino.jstype.FunctionParamBuilder(registry);
		for (com.google.javascript.rhino.Node paramNode : type.getParameters()) {
			com.google.javascript.rhino.jstype.JSType beforeParamType = paramNode.getJSType();
			com.google.javascript.rhino.jstype.JSType afterParamType = beforeParamType.visit(com.google.javascript.rhino.jstype.ModificationVisitor.this);
			if (beforeParamType != afterParamType) {
				changed = true;
			}
			if (paramNode.isOptionalArg()) {
				paramBuilder.addOptionalParams(afterParamType);
			}else
				if (paramNode.isVarArgs()) {
					paramBuilder.addVarArgs(afterParamType);
				}else {
					paramBuilder.addRequiredParams(afterParamType);
				}
			
		}
		if (changed) {
			com.google.javascript.rhino.jstype.FunctionBuilder builder = new com.google.javascript.rhino.jstype.FunctionBuilder(registry);
			builder.withParams(paramBuilder);
			builder.withReturnType(afterReturn);
			builder.withTypeOfThis(afterThis);
			return builder.build();
		}
		return type;
	}

	private com.google.javascript.rhino.jstype.JSType coerseToThisType(com.google.javascript.rhino.jstype.JSType type) {
		return type != null ? type : registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType caseObjectType(com.google.javascript.rhino.jstype.ObjectType objType) {
		return objType;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType caseTemplatizedType(com.google.javascript.rhino.jstype.TemplatizedType type) {
		boolean changed = false;
		com.google.javascript.rhino.jstype.ObjectType beforeBaseType = type.getReferencedType();
		com.google.javascript.rhino.jstype.ObjectType afterBaseType = com.google.javascript.rhino.jstype.ObjectType.cast(beforeBaseType.visit(com.google.javascript.rhino.jstype.ModificationVisitor.this));
		if (beforeBaseType != afterBaseType) {
			changed = true;
		}
		com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.JSType> builder = com.google.common.collect.ImmutableList.builder();
		for (com.google.javascript.rhino.jstype.JSType beforeTemplateType : type.getTemplateTypes()) {
			com.google.javascript.rhino.jstype.JSType afterTemplateType = beforeTemplateType.visit(com.google.javascript.rhino.jstype.ModificationVisitor.this);
			if (beforeTemplateType != afterTemplateType) {
				changed = true;
			}
			builder.add(afterTemplateType);
		}
		if (changed) {
			type = registry.createTemplatizedType(afterBaseType, builder.build());
		}
		return type;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType caseUnknownType() {
		return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType caseNullType() {
		return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType caseNumberType() {
		return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType caseStringType() {
		return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType caseVoidType() {
		return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType caseUnionType(com.google.javascript.rhino.jstype.UnionType type) {
		boolean changed = false;
		java.util.List<com.google.javascript.rhino.jstype.JSType> results = com.google.common.collect.Lists.newArrayList();
		for (com.google.javascript.rhino.jstype.JSType alternative : type.getAlternates()) {
			com.google.javascript.rhino.jstype.JSType replacement = alternative.visit(com.google.javascript.rhino.jstype.ModificationVisitor.this);
			if (replacement != alternative) {
				changed = true;
			}
			results.add(replacement);
		}
		if (changed) {
			com.google.javascript.rhino.jstype.UnionTypeBuilder builder = new com.google.javascript.rhino.jstype.UnionTypeBuilder(registry);
			for (com.google.javascript.rhino.jstype.JSType alternate : results) {
				builder.addAlternate(alternate);
			}
			return builder.build();
		}
		return type;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType caseTemplateType(com.google.javascript.rhino.jstype.TemplateType type) {
		return type;
	}

	private com.google.javascript.rhino.jstype.JSType getNativeType(com.google.javascript.rhino.jstype.JSTypeNative nativeType) {
		return registry.getNativeType(nativeType);
	}

	private boolean isNativeFunctionType(com.google.javascript.rhino.jstype.FunctionType type) {
		return type.isNativeObjectType();
	}
}


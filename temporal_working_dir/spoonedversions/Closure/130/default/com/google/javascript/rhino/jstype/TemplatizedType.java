

package com.google.javascript.rhino.jstype;


public final class TemplatizedType extends com.google.javascript.rhino.jstype.ProxyObjectType {
	private static final long serialVersionUID = 1L;

	final com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSType> templateTypes;

	TemplatizedType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, com.google.javascript.rhino.jstype.ObjectType objectType, com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSType> templateTypes) {
		super(registry, objectType, objectType.getTemplateTypeMap().extendValues(templateTypes));
		com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.TemplateType> filledTemplateKeys = objectType.getTemplateTypeMap().getUnfilledTemplateKeys();
		com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.JSType> builder = com.google.common.collect.ImmutableList.builder();
		for (com.google.javascript.rhino.jstype.TemplateType filledTemplateKey : filledTemplateKeys) {
			builder.add(getTemplateTypeMap().getTemplateType(filledTemplateKey));
		}
		this.templateTypes = builder.build();
	}

	@java.lang.Override
	java.lang.String toStringHelper(boolean forAnnotations) {
		java.lang.String typeString = super.toStringHelper(forAnnotations);
		if (!(templateTypes.isEmpty())) {
			typeString += (".<" + (com.google.common.base.Joiner.on(",").join(templateTypes))) + ">";
		}
		return typeString;
	}

	@java.lang.Override
	public <T> T visit(com.google.javascript.rhino.jstype.Visitor<T> visitor) {
		return visitor.caseTemplatizedType(com.google.javascript.rhino.jstype.TemplatizedType.this);
	}

	@java.lang.Override
	<T> T visit(com.google.javascript.rhino.jstype.RelationshipVisitor<T> visitor, com.google.javascript.rhino.jstype.JSType that) {
		return visitor.caseTemplatizedType(com.google.javascript.rhino.jstype.TemplatizedType.this, that);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.TemplatizedType toMaybeTemplatizedType() {
		return com.google.javascript.rhino.jstype.TemplatizedType.this;
	}

	@java.lang.Override
	public com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSType> getTemplateTypes() {
		return templateTypes;
	}

	@java.lang.Override
	public boolean isSubtype(com.google.javascript.rhino.jstype.JSType that) {
		return com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(com.google.javascript.rhino.jstype.TemplatizedType.this, that);
	}

	boolean wrapsSameRawType(com.google.javascript.rhino.jstype.JSType that) {
		return (that.isTemplatizedType()) && (com.google.javascript.rhino.jstype.TemplatizedType.this.getReferencedTypeInternal().isEquivalentTo(that.toMaybeTemplatizedType().getReferencedTypeInternal()));
	}

	boolean wrapsRawType(com.google.javascript.rhino.jstype.JSType that) {
		return com.google.javascript.rhino.jstype.TemplatizedType.this.getReferencedTypeInternal().isEquivalentTo(that);
	}

	com.google.javascript.rhino.jstype.JSType getGreatestSubtypeHelper(com.google.javascript.rhino.jstype.JSType rawThat) {
		com.google.common.base.Preconditions.checkNotNull(rawThat);
		if (!(wrapsSameRawType(rawThat))) {
			if (!(rawThat.isTemplatizedType())) {
				if (com.google.javascript.rhino.jstype.TemplatizedType.this.isSubtype(rawThat)) {
					return com.google.javascript.rhino.jstype.TemplatizedType.this;
				}else
					if (rawThat.isSubtype(com.google.javascript.rhino.jstype.TemplatizedType.this)) {
						return com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(rawThat);
					}
				
			}
			if ((com.google.javascript.rhino.jstype.TemplatizedType.this.isObject()) && (rawThat.isObject())) {
				return com.google.javascript.rhino.jstype.TemplatizedType.this.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE);
			}
			return com.google.javascript.rhino.jstype.TemplatizedType.this.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
		}
		com.google.javascript.rhino.jstype.TemplatizedType that = rawThat.toMaybeTemplatizedType();
		com.google.common.base.Preconditions.checkNotNull(that);
		if (getTemplateTypeMap().checkEquivalenceHelper(that.getTemplateTypeMap(), com.google.javascript.rhino.jstype.EquivalenceMethod.INVARIANT)) {
			return com.google.javascript.rhino.jstype.TemplatizedType.this;
		}
		return getReferencedObjTypeInternal();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.TemplateTypeMap getTemplateTypeMap() {
		return templateTypeMap;
	}

	@java.lang.Override
	public boolean hasAnyTemplateTypesInternal() {
		return templateTypeMap.hasAnyTemplateTypesInternal();
	}

	public com.google.javascript.rhino.jstype.ObjectType getReferencedType() {
		return getReferencedObjTypeInternal();
	}
}


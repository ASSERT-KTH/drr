

package com.google.javascript.rhino.jstype;


public final class ParameterizedType extends com.google.javascript.rhino.jstype.ProxyObjectType {
	private static final long serialVersionUID = 1L;

	final com.google.javascript.rhino.jstype.JSType parameterType;

	ParameterizedType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, com.google.javascript.rhino.jstype.ObjectType objectType, com.google.javascript.rhino.jstype.JSType parameterType) {
		super(registry, objectType);
		this.parameterType = parameterType;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getParameterType() {
		return parameterType;
	}

	@java.lang.Override
	java.lang.String toStringHelper(boolean forAnnotations) {
		java.lang.String result = super.toStringHelper(forAnnotations);
		return ((result + ".<") + (parameterType.toStringHelper(forAnnotations))) + ">";
	}

	@java.lang.Override
	public <T> T visit(com.google.javascript.rhino.jstype.Visitor<T> visitor) {
		return visitor.caseParameterizedType(com.google.javascript.rhino.jstype.ParameterizedType.this);
	}

	@java.lang.Override
	<T> T visit(com.google.javascript.rhino.jstype.RelationshipVisitor<T> visitor, com.google.javascript.rhino.jstype.JSType that) {
		return visitor.caseParameterizedType(com.google.javascript.rhino.jstype.ParameterizedType.this, that);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.ParameterizedType toMaybeParameterizedType() {
		return com.google.javascript.rhino.jstype.ParameterizedType.this;
	}

	@java.lang.Override
	public boolean hasAnyTemplateTypesInternal() {
		return (super.hasAnyTemplateTypes()) || (parameterType.hasAnyTemplateTypes());
	}

	@java.lang.Override
	public boolean isSubtype(com.google.javascript.rhino.jstype.JSType that) {
		return com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(com.google.javascript.rhino.jstype.ParameterizedType.this, that);
	}

	boolean isParameterizeSubtypeOf(com.google.javascript.rhino.jstype.JSType thatType) {
		if (thatType.isParameterizedType()) {
			com.google.javascript.rhino.jstype.JSType thisParameter = com.google.javascript.rhino.jstype.ParameterizedType.this.parameterType;
			com.google.javascript.rhino.jstype.JSType thatParameter = thatType.toMaybeParameterizedType().parameterType;
			return (com.google.javascript.rhino.jstype.ParameterizedType.this.wrapsSameRawType(thatType)) && ((thisParameter.isSubtype(thatParameter)) || (thatParameter.isSubtype(thisParameter)));
		}else {
			return com.google.javascript.rhino.jstype.ParameterizedType.this.getReferencedTypeInternal().isSubtype(thatType);
		}
	}

	boolean wrapsSameRawType(com.google.javascript.rhino.jstype.JSType that) {
		return (that.isParameterizedType()) && (com.google.javascript.rhino.jstype.ParameterizedType.this.getReferencedTypeInternal().isEquivalentTo(that.toMaybeParameterizedType().getReferencedTypeInternal()));
	}

	boolean wrapsRawType(com.google.javascript.rhino.jstype.JSType that) {
		return com.google.javascript.rhino.jstype.ParameterizedType.this.getReferencedTypeInternal().isEquivalentTo(that);
	}

	com.google.javascript.rhino.jstype.JSType getGreatestSubtypeHelper(com.google.javascript.rhino.jstype.JSType rawThat) {
		com.google.common.base.Preconditions.checkNotNull(rawThat);
		if (!(wrapsSameRawType(rawThat))) {
			if (!(rawThat.isParameterizedType())) {
				if (com.google.javascript.rhino.jstype.ParameterizedType.this.isSubtype(rawThat)) {
					return com.google.javascript.rhino.jstype.ParameterizedType.this;
				}else
					if (rawThat.isSubtype(com.google.javascript.rhino.jstype.ParameterizedType.this)) {
						return com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(rawThat);
					}
				
			}
			if ((com.google.javascript.rhino.jstype.ParameterizedType.this.isObject()) && (rawThat.isObject())) {
				return com.google.javascript.rhino.jstype.ParameterizedType.this.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE);
			}
			return com.google.javascript.rhino.jstype.ParameterizedType.this.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
		}
		com.google.javascript.rhino.jstype.ParameterizedType that = rawThat.toMaybeParameterizedType();
		com.google.common.base.Preconditions.checkNotNull(that);
		if (com.google.javascript.rhino.jstype.ParameterizedType.this.parameterType.isEquivalentTo(that.parameterType)) {
			return com.google.javascript.rhino.jstype.ParameterizedType.this;
		}
		return getReferencedObjTypeInternal();
	}
}


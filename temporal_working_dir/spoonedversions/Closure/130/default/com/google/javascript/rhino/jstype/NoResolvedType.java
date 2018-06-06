

package com.google.javascript.rhino.jstype;


class NoResolvedType extends com.google.javascript.rhino.jstype.NoType {
	private static final long serialVersionUID = 1L;

	NoResolvedType(com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
		super(registry);
	}

	@java.lang.Override
	public boolean isNoResolvedType() {
		return true;
	}

	@java.lang.Override
	public boolean isNoType() {
		return false;
	}

	@java.lang.Override
	public boolean isSubtype(com.google.javascript.rhino.jstype.JSType that) {
		if (com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(com.google.javascript.rhino.jstype.NoResolvedType.this, that)) {
			return true;
		}else {
			return !(that.isNoType());
		}
	}

	@java.lang.Override
	java.lang.String toStringHelper(boolean forAnnotations) {
		return forAnnotations ? "?" : "NoResolvedType";
	}
}


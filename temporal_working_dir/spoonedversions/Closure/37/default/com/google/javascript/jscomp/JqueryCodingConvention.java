

package com.google.javascript.jscomp;


public class JqueryCodingConvention extends com.google.javascript.jscomp.CodingConventions.Proxy {
	private static final long serialVersionUID = 1L;

	public JqueryCodingConvention() {
		this(com.google.javascript.jscomp.CodingConventions.getDefault());
	}

	public JqueryCodingConvention(com.google.javascript.jscomp.CodingConvention wrapped) {
		super(wrapped);
	}

	@java.lang.Override
	public java.lang.String getGlobalObject() {
		return "window";
	}

	private final java.util.Set<java.lang.String> propertyTestFunctions = com.google.common.collect.ImmutableSet.of("jQuery.isPlainObject", "jQuery.isFunction", "jQuery.isNumeric", "jQuery.isEmptyObject");

	@java.lang.Override
	public boolean isPropertyTestFunction(com.google.javascript.rhino.Node call) {
		com.google.common.base.Preconditions.checkArgument(call.isCall());
		return propertyTestFunctions.contains(call.getFirstChild().getQualifiedName());
	}

	private final java.util.Set<java.lang.String> prototypeAliases = com.google.common.collect.ImmutableSet.of("jQuery.fn", "jQuerySub.fn");

	@java.lang.Override
	public boolean isPrototypeAlias(com.google.javascript.rhino.Node n) {
		if (n.isGetProp()) {
			if (((n.isName()) || (n.isGetProp())) || (n.isGetElem())) {
				return (!(com.google.javascript.jscomp.NodeUtil.isLValue(n))) && (prototypeAliases.contains(n.getQualifiedName()));
			}else {
				return prototypeAliases.contains(n.getQualifiedName());
			}
		}
		return false;
	}
}


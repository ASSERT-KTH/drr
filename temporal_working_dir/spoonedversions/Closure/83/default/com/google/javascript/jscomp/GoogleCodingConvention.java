

package com.google.javascript.jscomp;


public class GoogleCodingConvention extends com.google.javascript.jscomp.ClosureCodingConvention {
	private static final long serialVersionUID = 1L;

	private static final java.lang.String OPTIONAL_ARG_PREFIX = "opt_";

	private static final java.lang.String VAR_ARGS_NAME = "var_args";

	private static final java.util.regex.Pattern ENUM_KEY_PATTERN = java.util.regex.Pattern.compile("[A-Z0-9][A-Z0-9_]*");

	@java.lang.Override
	public boolean isConstant(java.lang.String name) {
		if ((name.length()) <= 1) {
			return false;
		}
		int pos = name.lastIndexOf('$');
		if (pos >= 0) {
			name = name.substring((pos + 1));
			if ((name.length()) == 0) {
				return false;
			}
		}
		return isConstantKey(name);
	}

	@java.lang.Override
	public boolean isConstantKey(java.lang.String name) {
		if ((name.isEmpty()) || (!(java.lang.Character.isUpperCase(name.charAt(0))))) {
			return false;
		}
		return name.toUpperCase().equals(name);
	}

	@java.lang.Override
	public boolean isValidEnumKey(java.lang.String key) {
		return com.google.javascript.jscomp.GoogleCodingConvention.ENUM_KEY_PATTERN.matcher(key).matches();
	}

	@java.lang.Override
	public boolean isOptionalParameter(com.google.javascript.rhino.Node parameter) {
		return parameter.getString().startsWith(com.google.javascript.jscomp.GoogleCodingConvention.OPTIONAL_ARG_PREFIX);
	}

	@java.lang.Override
	public boolean isVarArgsParameter(com.google.javascript.rhino.Node parameter) {
		return com.google.javascript.jscomp.GoogleCodingConvention.VAR_ARGS_NAME.equals(parameter.getString());
	}

	@java.lang.Override
	public boolean isExported(java.lang.String name, boolean local) {
		return (super.isExported(name, local)) || ((!local) && (name.startsWith("_")));
	}

	@java.lang.Override
	public boolean isPrivate(java.lang.String name) {
		return (name.endsWith("_")) && (!(isExported(name)));
	}
}


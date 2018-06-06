

package com.google.javascript.jscomp;


class ReplaceCssNames implements com.google.javascript.jscomp.CompilerPass {
	static final java.lang.String GET_CSS_NAME_FUNCTION = "goog.getCssName";

	static final com.google.javascript.jscomp.DiagnosticType INVALID_NUM_ARGUMENTS_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_GETCSSNAME_NUM_ARGS", "goog.getCssName called with \"{0}\" arguments, expected 1 or 2.");

	static final com.google.javascript.jscomp.DiagnosticType STRING_LITERAL_EXPECTED_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_GETCSSNAME_STRING_LITERAL_EXPECTED", ("goog.getCssName called with invalid argument, string literal " + "expected.  Was \"{0}\"."));

	static final com.google.javascript.jscomp.DiagnosticType UNEXPECTED_STRING_LITERAL_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_GETCSSNAME_UNEXPECTED_STRING_LITERAL", ("goog.getCssName called with invalid arguments, string literal " + ("passed as first of two arguments.  Did you mean " + "goog.getCssName(\"{0}-{1}\")?")));

	static final com.google.javascript.jscomp.DiagnosticType UNKNOWN_SYMBOL_WARNING = com.google.javascript.jscomp.DiagnosticType.warning("JSC_GETCSSNAME_UNKNOWN_CSS_SYMBOL", ("goog.getCssName called with unrecognized symbol \"{0}\" in class " + "\"{1}\"."));

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.Map<java.lang.String, java.lang.Integer> cssNames;

	private com.google.javascript.jscomp.CssRenamingMap symbolMap;

	private final com.google.javascript.rhino.jstype.JSType nativeStringType;

	ReplaceCssNames(com.google.javascript.jscomp.AbstractCompiler compiler, @javax.annotation.Nullable
	java.util.Map<java.lang.String, java.lang.Integer> cssNames) {
		this.compiler = compiler;
		this.cssNames = cssNames;
		this.nativeStringType = compiler.getTypeRegistry().getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		symbolMap = getCssRenamingMap();
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.ReplaceCssNames.Traversal());
	}

	@com.google.common.annotations.VisibleForTesting
	protected com.google.javascript.jscomp.CssRenamingMap getCssRenamingMap() {
		return compiler.getCssRenamingMap();
	}

	private class Traversal extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.isCall()) && (com.google.javascript.jscomp.ReplaceCssNames.GET_CSS_NAME_FUNCTION.equals(n.getFirstChild().getQualifiedName()))) {
				int count = n.getChildCount();
				com.google.javascript.rhino.Node first = n.getFirstChild().getNext();
				switch (count) {
					case 2 :
						if (first.isString()) {
							processStringNode(t, first);
							n.removeChild(first);
							parent.replaceChild(n, first);
							compiler.reportCodeChange();
						}else {
							compiler.report(t.makeError(n, com.google.javascript.jscomp.ReplaceCssNames.STRING_LITERAL_EXPECTED_ERROR, com.google.javascript.rhino.Token.name(first.getType())));
						}
						break;
					case 3 :
						com.google.javascript.rhino.Node second = first.getNext();
						if (!(second.isString())) {
							compiler.report(t.makeError(n, com.google.javascript.jscomp.ReplaceCssNames.STRING_LITERAL_EXPECTED_ERROR, com.google.javascript.rhino.Token.name(second.getType())));
						}else
							if (first.isString()) {
								compiler.report(t.makeError(n, com.google.javascript.jscomp.ReplaceCssNames.UNEXPECTED_STRING_LITERAL_ERROR, first.getString(), second.getString()));
							}else {
								processStringNode(t, second);
								n.removeChild(first);
								com.google.javascript.rhino.Node replacement = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ADD, first, com.google.javascript.rhino.Node.newString(("-" + (second.getString()))).copyInformationFrom(second)).copyInformationFrom(n);
								replacement.setJSType(nativeStringType);
								parent.replaceChild(n, replacement);
								compiler.reportCodeChange();
							}
						
						break;
					default :
						compiler.report(t.makeError(n, com.google.javascript.jscomp.ReplaceCssNames.INVALID_NUM_ARGUMENTS_ERROR, java.lang.String.valueOf(count)));
				}
			}
		}

		private void processStringNode(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
			java.lang.String name = n.getString();
			java.lang.String[] parts = name.split("-");
			if ((symbolMap) != null) {
				java.lang.String replacement = null;
				switch (symbolMap.getStyle()) {
					case BY_WHOLE :
						replacement = symbolMap.get(name);
						if (replacement == null) {
							compiler.report(t.makeError(n, com.google.javascript.jscomp.ReplaceCssNames.UNKNOWN_SYMBOL_WARNING, name, name));
							return ;
						}
						break;
					case BY_PART :
						java.lang.String[] replaced = new java.lang.String[parts.length];
						for (int i = 0; i < (parts.length); i++) {
							java.lang.String part = symbolMap.get(parts[i]);
							if (part == null) {
								compiler.report(t.makeError(n, com.google.javascript.jscomp.ReplaceCssNames.UNKNOWN_SYMBOL_WARNING, parts[i], name));
								return ;
							}
							replaced[i] = part;
						}
						replacement = com.google.common.base.Joiner.on("-").join(replaced);
						break;
					default :
						throw new java.lang.IllegalStateException(("Unknown replacement style: " + (symbolMap.getStyle())));
				}
				n.setString(replacement);
			}
			if ((cssNames) != null) {
				for (int i = 0; i < (parts.length); i++) {
					java.lang.Integer count = cssNames.get(parts[i]);
					if (count == null) {
						count = java.lang.Integer.valueOf(0);
					}
					cssNames.put(parts[i], ((count.intValue()) + 1));
				}
			}
		}
	}
}


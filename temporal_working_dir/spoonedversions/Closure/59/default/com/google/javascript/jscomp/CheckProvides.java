

package com.google.javascript.jscomp;


class CheckProvides implements com.google.javascript.jscomp.HotSwapCompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.CheckLevel checkLevel;

	private final com.google.javascript.jscomp.CodingConvention codingConvention;

	static final com.google.javascript.jscomp.DiagnosticType MISSING_PROVIDE_WARNING = com.google.javascript.jscomp.DiagnosticType.disabled("JSC_MISSING_PROVIDE", "missing goog.provide(''{0}'')");

	CheckProvides(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.CheckLevel checkLevel) {
		this.compiler = compiler;
		this.checkLevel = checkLevel;
		this.codingConvention = compiler.getCodingConvention();
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		hotSwapScript(root);
	}

	@java.lang.Override
	public void hotSwapScript(com.google.javascript.rhino.Node scriptRoot) {
		com.google.javascript.jscomp.CheckProvides.CheckProvidesCallback callback = new com.google.javascript.jscomp.CheckProvides.CheckProvidesCallback(codingConvention);
		new com.google.javascript.jscomp.NodeTraversal(compiler, callback).traverse(scriptRoot);
	}

	private class CheckProvidesCallback extends com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback {
		private final java.util.Map<java.lang.String, com.google.javascript.rhino.Node> provides = com.google.common.collect.Maps.newHashMap();

		private final java.util.Map<java.lang.String, com.google.javascript.rhino.Node> ctors = com.google.common.collect.Maps.newHashMap();

		private final com.google.javascript.jscomp.CodingConvention convention;

		CheckProvidesCallback(com.google.javascript.jscomp.CodingConvention convention) {
			this.convention = convention;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.CALL :
					java.lang.String providedClassName = codingConvention.extractClassNameIfProvide(n, parent);
					if (providedClassName != null) {
						provides.put(providedClassName, n);
					}
					break;
				case com.google.javascript.rhino.Token.FUNCTION :
					visitFunctionNode(n, parent);
					break;
				case com.google.javascript.rhino.Token.SCRIPT :
					visitScriptNode(t, n);
			}
		}

		private void visitFunctionNode(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			com.google.javascript.rhino.Node name = null;
			com.google.javascript.rhino.JSDocInfo info = parent.getJSDocInfo();
			if ((info != null) && (info.isConstructor())) {
				name = parent.getFirstChild();
			}else {
				info = n.getJSDocInfo();
				if ((info != null) && (info.isConstructor())) {
					name = n.getFirstChild();
				}
			}
			if ((name != null) && (name.isQualifiedName())) {
				java.lang.String qualifiedName = name.getQualifiedName();
				if (!(com.google.javascript.jscomp.CheckProvides.CheckProvidesCallback.this.convention.isPrivate(qualifiedName))) {
					com.google.javascript.rhino.JSDocInfo.Visibility visibility = info.getVisibility();
					if (!(visibility.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE))) {
						ctors.put(qualifiedName, name);
					}
				}
			}
		}

		private void visitScriptNode(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
			for (java.util.Map.Entry<java.lang.String, com.google.javascript.rhino.Node> ctorEntry : ctors.entrySet()) {
				if (!(provides.containsKey(ctorEntry.getKey()))) {
					compiler.report(t.makeError(ctorEntry.getValue(), checkLevel, com.google.javascript.jscomp.CheckProvides.MISSING_PROVIDE_WARNING, ctorEntry.getKey()));
				}
			}
			provides.clear();
			ctors.clear();
		}
	}
}


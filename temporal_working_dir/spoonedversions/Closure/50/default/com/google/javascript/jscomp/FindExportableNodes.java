

package com.google.javascript.jscomp;


public class FindExportableNodes extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
	static final com.google.javascript.jscomp.DiagnosticType NON_GLOBAL_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_NON_GLOBAL_ERROR", ("@export only applies to symbols/properties defined in the " + "global scope."));

	private final java.util.LinkedHashMap<java.lang.String, com.google.javascript.jscomp.FindExportableNodes.GenerateNodeContext> exports;

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	public FindExportableNodes(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
		this.exports = com.google.common.collect.Maps.newLinkedHashMap();
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		com.google.javascript.rhino.JSDocInfo docInfo = n.getJSDocInfo();
		if ((docInfo != null) && (docInfo.isExport())) {
			java.lang.String export = null;
			com.google.javascript.jscomp.FindExportableNodes.GenerateNodeContext context = null;
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.FUNCTION :
					if ((parent.getType()) == (com.google.javascript.rhino.Token.SCRIPT)) {
						export = com.google.javascript.jscomp.NodeUtil.getFunctionName(n);
						context = new com.google.javascript.jscomp.FindExportableNodes.GenerateNodeContext(n, parent, n);
					}
					break;
				case com.google.javascript.rhino.Token.ASSIGN :
					com.google.javascript.rhino.Node grandparent = parent.getParent();
					if ((((grandparent != null) && ((grandparent.getType()) == (com.google.javascript.rhino.Token.SCRIPT))) && ((parent.getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT))) && ((n.getLastChild().getType()) != (com.google.javascript.rhino.Token.ASSIGN))) {
						export = n.getFirstChild().getQualifiedName();
						context = new com.google.javascript.jscomp.FindExportableNodes.GenerateNodeContext(n, grandparent, parent);
					}
					break;
				case com.google.javascript.rhino.Token.VAR :
					if ((parent.getType()) == (com.google.javascript.rhino.Token.SCRIPT)) {
						if ((n.getFirstChild().hasChildren()) && ((n.getFirstChild().getFirstChild().getType()) != (com.google.javascript.rhino.Token.ASSIGN))) {
							export = n.getFirstChild().getString();
							context = new com.google.javascript.jscomp.FindExportableNodes.GenerateNodeContext(n, parent, n);
						}
					}
			}
			if (export != null) {
				exports.put(export, context);
			}else {
				compiler.report(t.makeError(n, com.google.javascript.jscomp.FindExportableNodes.NON_GLOBAL_ERROR));
			}
		}
	}

	public java.util.LinkedHashMap<java.lang.String, com.google.javascript.jscomp.FindExportableNodes.GenerateNodeContext> getExports() {
		return exports;
	}

	public static class GenerateNodeContext {
		private final com.google.javascript.rhino.Node scriptNode;

		private final com.google.javascript.rhino.Node contextNode;

		private final com.google.javascript.rhino.Node node;

		public GenerateNodeContext(com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node scriptNode, com.google.javascript.rhino.Node contextNode) {
			this.node = node;
			this.scriptNode = scriptNode;
			this.contextNode = contextNode;
		}

		public com.google.javascript.rhino.Node getNode() {
			return node;
		}

		public com.google.javascript.rhino.Node getScriptNode() {
			return scriptNode;
		}

		public com.google.javascript.rhino.Node getContextNode() {
			return contextNode;
		}
	}
}


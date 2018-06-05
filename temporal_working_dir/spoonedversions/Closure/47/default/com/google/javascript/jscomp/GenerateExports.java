

package com.google.javascript.jscomp;


class GenerateExports implements com.google.javascript.jscomp.CompilerPass {
	private static final java.lang.String PROTOTYPE_PROPERTY = "prototype";

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.lang.String exportSymbolFunction;

	private final java.lang.String exportPropertyFunction;

	GenerateExports(com.google.javascript.jscomp.AbstractCompiler compiler, java.lang.String exportSymbolFunction, java.lang.String exportPropertyFunction) {
		com.google.common.base.Preconditions.checkNotNull(compiler);
		com.google.common.base.Preconditions.checkNotNull(exportSymbolFunction);
		com.google.common.base.Preconditions.checkNotNull(exportPropertyFunction);
		this.compiler = compiler;
		this.exportSymbolFunction = exportSymbolFunction;
		this.exportPropertyFunction = exportPropertyFunction;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.FindExportableNodes findExportableNodes = new com.google.javascript.jscomp.FindExportableNodes(compiler);
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, findExportableNodes);
		java.util.Map<java.lang.String, com.google.javascript.jscomp.FindExportableNodes.GenerateNodeContext> exports = findExportableNodes.getExports();
		for (java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.FindExportableNodes.GenerateNodeContext> entry : exports.entrySet()) {
			java.lang.String export = entry.getKey();
			com.google.javascript.jscomp.FindExportableNodes.GenerateNodeContext context = entry.getValue();
			java.lang.String parent = null;
			java.lang.String grandparent = null;
			com.google.javascript.rhino.Node node = context.getNode().getFirstChild();
			if (node.isGetProp()) {
				parent = node.getFirstChild().getQualifiedName();
				if ((node.getFirstChild().isGetProp()) && (getPropertyName(node.getFirstChild()).equals(com.google.javascript.jscomp.GenerateExports.PROTOTYPE_PROPERTY))) {
					grandparent = node.getFirstChild().getFirstChild().getQualifiedName();
				}
			}
			boolean useExportSymbol = true;
			if ((grandparent != null) && (exports.containsKey(grandparent))) {
				useExportSymbol = false;
			}else
				if ((parent != null) && (exports.containsKey(parent))) {
					useExportSymbol = false;
				}
			
			com.google.javascript.rhino.Node call;
			if (useExportSymbol) {
				call = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CALL, com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), exportSymbolFunction, context.getNode(), export));
				call.addChildToBack(com.google.javascript.rhino.Node.newString(export));
				call.addChildToBack(com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), export, context.getNode(), export));
			}else {
				java.lang.String property = getPropertyName(node);
				call = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CALL, new com.google.javascript.rhino.Node[]{ com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), exportPropertyFunction, context.getNode(), exportPropertyFunction) , com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), parent, context.getNode(), exportPropertyFunction) , com.google.javascript.rhino.Node.newString(property) , com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), export, context.getNode(), exportPropertyFunction) });
			}
			com.google.javascript.rhino.Node expression = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT, call);
			annotate(expression);
			com.google.javascript.rhino.Node insertionPoint = context.getContextNode().getNext();
			com.google.javascript.jscomp.CodingConvention convention = compiler.getCodingConvention();
			while (((insertionPoint != null) && (com.google.javascript.jscomp.NodeUtil.isExprCall(insertionPoint))) && ((convention.getClassesDefinedByCall(insertionPoint.getFirstChild())) != null)) {
				insertionPoint = insertionPoint.getNext();
			} 
			if (insertionPoint == null) {
				context.getScriptNode().addChildToBack(expression);
			}else {
				context.getScriptNode().addChildBefore(expression, insertionPoint);
			}
			compiler.reportCodeChange();
		}
	}

	private void annotate(com.google.javascript.rhino.Node node) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, node, new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations(compiler));
	}

	private java.lang.String getPropertyName(com.google.javascript.rhino.Node node) {
		com.google.common.base.Preconditions.checkArgument(node.isGetProp());
		return node.getLastChild().getString();
	}
}




package com.google.javascript.jscomp;


class RemoveUnusedNames implements com.google.javascript.jscomp.CompilerPass {
	private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.javascript.jscomp.RemoveUnusedNames.class.getName());

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final boolean canModifyExterns;

	RemoveUnusedNames(com.google.javascript.jscomp.AbstractCompiler compiler, boolean canModifyExterns) {
		this.compiler = compiler;
		this.canModifyExterns = canModifyExterns;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externRoot, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.AnalyzeNameReferences analyzer = new com.google.javascript.jscomp.AnalyzeNameReferences(compiler);
		analyzer.process(externRoot, root);
		removeUnusedProperties(analyzer.getGraph());
	}

	private void removeUnusedProperties(com.google.javascript.jscomp.NameReferenceGraph graph) {
		for (com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference> node : graph.getNodes()) {
			com.google.javascript.jscomp.NameReferenceGraph.Name name = node.getValue();
			com.google.javascript.jscomp.AnalyzeNameReferences.NameInfo nameInfo = node.getAnnotation();
			if ((nameInfo == null) || (!(nameInfo.isReferenced()))) {
				if ((canModifyExterns) || (!(name.isExtern()))) {
					name.remove();
					compiler.reportCodeChange();
					com.google.javascript.jscomp.RemoveUnusedNames.logger.fine(("Removed unused name" + name));
				}
			}
		}
	}
}




package com.google.javascript.jscomp;


class GatherRawExports extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private static final java.lang.String[] GLOBAL_THIS_NAMES = new java.lang.String[]{ "window" , "top" };

	private final java.util.Set<java.lang.String> exportedVariables = com.google.common.collect.Sets.newHashSet();

	GatherRawExports(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.common.base.Preconditions.checkState(compiler.getLifeCycleStage().isNormalized());
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.GatherRawExports.this);
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		com.google.javascript.rhino.Node sibling = n.getNext();
		if (((sibling != null) && (sibling.isString())) && (com.google.javascript.jscomp.NodeUtil.isGet(parent))) {
			if (isGlobalThisObject(t, n)) {
				exportedVariables.add(sibling.getString());
			}
		}
	}

	private boolean isGlobalThisObject(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
		if (n.isThis()) {
			return t.inGlobalScope();
		}else
			if (n.isName()) {
				java.lang.String varName = n.getString();
				int items = com.google.javascript.jscomp.GatherRawExports.GLOBAL_THIS_NAMES.length;
				for (int i = 0; i < items; i++) {
					if (varName.equals(com.google.javascript.jscomp.GatherRawExports.GLOBAL_THIS_NAMES[i])) {
						return true;
					}
				}
			}
		
		return false;
	}

	public java.util.Set<java.lang.String> getExportedVariableNames() {
		return exportedVariables;
	}
}


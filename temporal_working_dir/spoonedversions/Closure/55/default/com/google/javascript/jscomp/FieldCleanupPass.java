

package com.google.javascript.jscomp;


public class FieldCleanupPass implements com.google.javascript.jscomp.HotSwapCompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	public FieldCleanupPass(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	public void hotSwapScript(com.google.javascript.rhino.Node scriptRoot, com.google.javascript.rhino.Node originalRoot) {
		java.lang.String srcName = originalRoot.getSourceFileName();
		com.google.javascript.jscomp.NodeTraversal.Callback cb = new com.google.javascript.jscomp.FieldCleanupPass.QualifiedNameSearchTraversal(compiler.getTypeRegistry(), srcName);
		new com.google.javascript.jscomp.NodeTraversal(compiler, cb).traverse(originalRoot);
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
	}

	static class QualifiedNameSearchTraversal extends com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback {
		private final com.google.javascript.rhino.jstype.JSTypeRegistry typeRegistry;

		private final java.lang.String srcName;

		public QualifiedNameSearchTraversal(com.google.javascript.rhino.jstype.JSTypeRegistry typeRegistry, java.lang.String srcName) {
			this.typeRegistry = typeRegistry;
			this.srcName = srcName;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node p) {
			if ((com.google.javascript.jscomp.NodeUtil.isGetProp(n)) && (!(com.google.javascript.jscomp.NodeUtil.isGetProp(p)))) {
				java.lang.String propName = getFieldName(n);
				java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> types = com.google.common.collect.ImmutableList.copyOf(typeRegistry.getEachReferenceTypeWithProperty(propName));
				for (com.google.javascript.rhino.jstype.ObjectType type : types) {
					com.google.javascript.rhino.Node pNode = type.getPropertyNode(propName);
					if ((pNode != null) && (srcName.equals(pNode.getSourceFileName()))) {
						typeRegistry.unregisterPropertyOnType(propName, type);
						type.removeProperty(propName);
					}
				}
			}
		}

		private java.lang.String getFieldName(com.google.javascript.rhino.Node n) {
			return n.getLastChild().getString();
		}
	}
}


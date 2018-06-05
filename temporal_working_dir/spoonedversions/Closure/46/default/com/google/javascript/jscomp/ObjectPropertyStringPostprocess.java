

package com.google.javascript.jscomp;


class ObjectPropertyStringPostprocess implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	public ObjectPropertyStringPostprocess(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.ObjectPropertyStringPostprocess.Callback());
	}

	private class Callback extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (!(n.isNew())) {
				return ;
			}
			com.google.javascript.rhino.Node objectName = n.getFirstChild();
			if (!(com.google.javascript.jscomp.ObjectPropertyStringPreprocess.EXTERN_OBJECT_PROPERTY_STRING.equals(objectName.getQualifiedName()))) {
				return ;
			}
			com.google.javascript.rhino.Node firstArgument = objectName.getNext();
			com.google.javascript.rhino.Node secondArgument = firstArgument.getNext();
			int secondArgumentType = secondArgument.getType();
			if (secondArgumentType == (com.google.javascript.rhino.Token.GETPROP)) {
				com.google.javascript.rhino.Node newChild = secondArgument.getFirstChild();
				secondArgument.removeChild(newChild);
				n.replaceChild(firstArgument, newChild);
				n.replaceChild(secondArgument, com.google.javascript.rhino.Node.newString(secondArgument.getFirstChild().getString()));
			}else
				if (secondArgumentType == (com.google.javascript.rhino.Token.GETELEM)) {
					com.google.javascript.rhino.Node newFirstArgument = secondArgument.getFirstChild();
					secondArgument.removeChild(newFirstArgument);
					com.google.javascript.rhino.Node newSecondArgument = secondArgument.getLastChild();
					secondArgument.removeChild(newSecondArgument);
					n.replaceChild(firstArgument, newFirstArgument);
					n.replaceChild(secondArgument, newSecondArgument);
				}else {
					n.replaceChild(secondArgument, com.google.javascript.rhino.Node.newString(secondArgument.getString()));
				}
			
			compiler.reportCodeChange();
		}
	}
}


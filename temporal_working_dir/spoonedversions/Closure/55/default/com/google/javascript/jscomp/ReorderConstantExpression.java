

package com.google.javascript.jscomp;


class ReorderConstantExpression implements com.google.javascript.jscomp.CompilerPass {
	private com.google.javascript.jscomp.AbstractCompiler compiler;

	ReorderConstantExpression(com.google.javascript.jscomp.AbstractCompiler compiler) {
		com.google.javascript.jscomp.ReorderConstantExpression.this.compiler = compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node node) {
		if ((com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node)) || (com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node))) {
			if ((com.google.javascript.jscomp.NodeUtil.isImmutableValue(node.getLastChild())) && (!(com.google.javascript.jscomp.NodeUtil.isImmutableValue(node.getFirstChild())))) {
				if (com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node)) {
					int inverseOperator = com.google.javascript.jscomp.NodeUtil.getInverseOperator(node.getType());
					node.setType(inverseOperator);
				}
				com.google.javascript.rhino.Node firstNode = node.getFirstChild().detachFromParent();
				com.google.javascript.rhino.Node lastNode = node.getLastChild().detachFromParent();
				node.addChildrenToFront(lastNode);
				node.addChildrenToBack(firstNode);
				com.google.javascript.jscomp.ReorderConstantExpression.this.compiler.reportCodeChange();
			}
		}
		if (node.hasChildren()) {
			com.google.javascript.rhino.Node child = node.getFirstChild();
			while (child != null) {
				process(externs, child);
				child = child.getNext();
			} 
		}
	}
}


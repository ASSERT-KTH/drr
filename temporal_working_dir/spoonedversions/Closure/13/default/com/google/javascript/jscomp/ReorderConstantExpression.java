

package com.google.javascript.jscomp;


class ReorderConstantExpression extends com.google.javascript.jscomp.AbstractPeepholeOptimization {
	@java.lang.Override
	com.google.javascript.rhino.Node optimizeSubtree(com.google.javascript.rhino.Node subtree) {
		if ((com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(subtree)) || (com.google.javascript.jscomp.NodeUtil.isRelationalOperation(subtree))) {
			if ((com.google.javascript.jscomp.NodeUtil.isImmutableValue(subtree.getLastChild())) && (!(com.google.javascript.jscomp.NodeUtil.isImmutableValue(subtree.getFirstChild())))) {
				if (com.google.javascript.jscomp.NodeUtil.isRelationalOperation(subtree)) {
					int inverseOperator = com.google.javascript.jscomp.NodeUtil.getInverseOperator(subtree.getType());
					subtree.setType(inverseOperator);
				}
				com.google.javascript.rhino.Node firstNode = subtree.getFirstChild().detachFromParent();
				com.google.javascript.rhino.Node lastNode = subtree.getLastChild().detachFromParent();
				subtree.addChildrenToFront(lastNode);
				subtree.addChildrenToBack(firstNode);
				reportCodeChange();
			}
		}
		return subtree;
	}
}


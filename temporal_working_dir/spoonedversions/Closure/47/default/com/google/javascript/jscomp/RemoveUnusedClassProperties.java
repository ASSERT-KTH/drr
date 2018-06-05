

package com.google.javascript.jscomp;


class RemoveUnusedClassProperties implements com.google.javascript.jscomp.CompilerPass , com.google.javascript.jscomp.NodeTraversal.Callback {
	final com.google.javascript.jscomp.AbstractCompiler compiler;

	private boolean inExterns;

	private java.util.Set<java.lang.String> used = com.google.common.collect.Sets.newHashSet();

	private java.util.List<com.google.javascript.rhino.Node> candidates = com.google.common.collect.Lists.newArrayList();

	RemoveUnusedClassProperties(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverseRoots(compiler, com.google.javascript.jscomp.RemoveUnusedClassProperties.this, externs, root);
		removeUnused();
	}

	private void removeUnused() {
		for (com.google.javascript.rhino.Node n : candidates) {
			com.google.common.base.Preconditions.checkState(n.isGetProp());
			if (!(used.contains(n.getLastChild().getString()))) {
				com.google.javascript.rhino.Node parent = n.getParent();
				if (com.google.javascript.jscomp.NodeUtil.isAssignmentOp(parent)) {
					com.google.javascript.rhino.Node assign = parent;
					com.google.common.base.Preconditions.checkState((((assign != null) && (com.google.javascript.jscomp.NodeUtil.isAssignmentOp(assign))) && ((assign.getFirstChild()) == n)));
					assign.getParent().replaceChild(assign, assign.getLastChild().detachFromParent());
				}else
					if ((parent.isInc()) || (parent.isDec())) {
						parent.getParent().replaceChild(parent, com.google.javascript.rhino.Node.newNumber(0));
					}else {
						throw new java.lang.IllegalStateException(("unexpected: " + parent));
					}
				
				compiler.reportCodeChange();
			}
		}
	}

	@java.lang.Override
	public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if (n.isScript()) {
			com.google.javascript.jscomp.RemoveUnusedClassProperties.this.inExterns = n.getStaticSourceFile().isExtern();
		}
		return true;
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.GETPROP :
				if ((inExterns) || (isPinningPropertyUse(n))) {
					used.add(n.getLastChild().getString());
				}else {
					if (n.getFirstChild().isThis()) {
						candidates.add(n);
					}
				}
				break;
			case com.google.javascript.rhino.Token.CALL :
				com.google.javascript.rhino.Node target = n.getFirstChild();
				if (((n.hasMoreThanOneChild()) && (target.isName())) && (target.getString().equals(com.google.javascript.jscomp.NodeUtil.JSC_PROPERTY_NAME_FN))) {
					com.google.javascript.rhino.Node propName = target.getNext();
					if (propName.isString()) {
						used.add(propName.getString());
					}
				}
				break;
		}
	}

	private boolean isPinningPropertyUse(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node parent = n.getParent();
		if (n == (parent.getFirstChild())) {
			if (parent.isAssign()) {
				return false;
			}else
				if (((com.google.javascript.jscomp.NodeUtil.isAssignmentOp(parent)) || (parent.isInc())) || (parent.isDec())) {
					return com.google.javascript.jscomp.NodeUtil.isExpressionResultUsed(parent);
				}
			
		}
		return true;
	}
}


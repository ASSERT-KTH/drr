

package com.google.javascript.jscomp;


final class ClosureCodeRemoval implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	static final java.lang.String ABSTRACT_METHOD_NAME = "goog.abstractMethod";

	private final boolean removeAbstractMethods;

	private final boolean removeAssertionCalls;

	private final java.util.List<com.google.javascript.jscomp.ClosureCodeRemoval.RemovableAssignment> abstractMethodAssignmentNodes = com.google.common.collect.Lists.newArrayList();

	private final java.util.List<com.google.javascript.rhino.Node> assertionCalls = com.google.common.collect.Lists.newArrayList();

	private class RemovableAssignment {
		final com.google.javascript.rhino.Node node;

		final com.google.javascript.rhino.Node parent;

		final java.util.List<com.google.javascript.rhino.Node> assignAncestors = com.google.common.collect.Lists.newArrayList();

		final com.google.javascript.rhino.Node lastAncestor;

		public RemovableAssignment(com.google.javascript.rhino.Node nameNode, com.google.javascript.rhino.Node assignNode, com.google.javascript.jscomp.NodeTraversal traversal) {
			this.node = nameNode;
			this.parent = assignNode;
			com.google.javascript.rhino.Node ancestor = assignNode;
			do {
				ancestor = ancestor.getParent();
				assignAncestors.add(ancestor);
			} while ((ancestor.isAssign()) && (ancestor.getFirstChild().isQualifiedName()) );
			lastAncestor = ancestor.getParent();
		}

		public void remove() {
			com.google.javascript.rhino.Node rhs = node.getNext();
			com.google.javascript.rhino.Node last = parent;
			for (com.google.javascript.rhino.Node ancestor : assignAncestors) {
				if (com.google.javascript.jscomp.NodeUtil.isExpressionNode(ancestor)) {
					lastAncestor.removeChild(ancestor);
				}else {
					rhs.detachFromParent();
					ancestor.replaceChild(last, rhs);
				}
				last = ancestor;
			}
			compiler.reportCodeChange();
		}
	}

	private class FindAbstractMethods extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (n.isAssign()) {
				com.google.javascript.rhino.Node nameNode = n.getFirstChild();
				com.google.javascript.rhino.Node valueNode = n.getLastChild();
				if (((nameNode.isQualifiedName()) && (valueNode.isQualifiedName())) && (com.google.javascript.jscomp.ClosureCodeRemoval.ABSTRACT_METHOD_NAME.equals(valueNode.getQualifiedName()))) {
					abstractMethodAssignmentNodes.add(new com.google.javascript.jscomp.ClosureCodeRemoval.RemovableAssignment(n.getFirstChild(), n, t));
				}
			}
		}
	}

	private class FindAssertionCalls extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		java.util.Set<java.lang.String> assertionNames = com.google.common.collect.Sets.newHashSet();

		FindAssertionCalls() {
			for (com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec spec : compiler.getCodingConvention().getAssertionFunctions()) {
				assertionNames.add(spec.getFunctionName());
			}
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (n.isCall()) {
				java.lang.String fnName = n.getFirstChild().getQualifiedName();
				if (assertionNames.contains(fnName)) {
					assertionCalls.add(n);
				}
			}
		}
	}

	ClosureCodeRemoval(com.google.javascript.jscomp.AbstractCompiler compiler, boolean removeAbstractMethods, boolean removeAssertionCalls) {
		this.compiler = compiler;
		this.removeAbstractMethods = removeAbstractMethods;
		this.removeAssertionCalls = removeAssertionCalls;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		java.util.List<com.google.javascript.jscomp.NodeTraversal.Callback> passes = com.google.common.collect.Lists.newArrayList();
		if (removeAbstractMethods) {
			passes.add(new com.google.javascript.jscomp.ClosureCodeRemoval.FindAbstractMethods());
		}
		if (removeAssertionCalls) {
			passes.add(new com.google.javascript.jscomp.ClosureCodeRemoval.FindAssertionCalls());
		}
		com.google.javascript.jscomp.CombinedCompilerPass.traverse(compiler, root, passes);
		for (com.google.javascript.jscomp.ClosureCodeRemoval.RemovableAssignment assignment : abstractMethodAssignmentNodes) {
			assignment.remove();
		}
		for (com.google.javascript.rhino.Node call : assertionCalls) {
			com.google.javascript.rhino.Node parent = call.getParent();
			if (com.google.javascript.jscomp.NodeUtil.isExpressionNode(parent)) {
				parent.getParent().removeChild(parent);
			}else {
				com.google.javascript.rhino.Node firstArg = call.getFirstChild().getNext();
				if (firstArg == null) {
					parent.replaceChild(call, com.google.javascript.jscomp.NodeUtil.newUndefinedNode(call));
				}else {
					parent.replaceChild(call, firstArg.detachFromParent());
				}
			}
			compiler.reportCodeChange();
		}
	}
}


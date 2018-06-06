

package com.google.javascript.jscomp;


class GatherSideEffectSubexpressionsCallback implements com.google.javascript.jscomp.NodeTraversal.Callback {
	interface SideEffectAccumulator {
		boolean classDefiningCallsHaveSideEffects();

		void keepSubTree(com.google.javascript.rhino.Node original);

		void keepSimplifiedShortCircuitExpression(com.google.javascript.rhino.Node original);

		void keepSimplifiedHookExpression(com.google.javascript.rhino.Node hook, boolean thenHasSideEffects, boolean elseHasSideEffects);
	}

	static final class CopySideEffectSubexpressions implements com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.SideEffectAccumulator {
		private final com.google.javascript.jscomp.AbstractCompiler compiler;

		private final java.util.List<com.google.javascript.rhino.Node> replacements;

		CopySideEffectSubexpressions(com.google.javascript.jscomp.AbstractCompiler compiler, java.util.List<com.google.javascript.rhino.Node> replacements) {
			this.compiler = compiler;
			this.replacements = replacements;
		}

		@java.lang.Override
		public boolean classDefiningCallsHaveSideEffects() {
			return true;
		}

		@java.lang.Override
		public void keepSubTree(com.google.javascript.rhino.Node original) {
			replacements.add(original.cloneTree());
		}

		@java.lang.Override
		public void keepSimplifiedShortCircuitExpression(com.google.javascript.rhino.Node original) {
			com.google.common.base.Preconditions.checkArgument((((original.getType()) == (com.google.javascript.rhino.Token.AND)) || ((original.getType()) == (com.google.javascript.rhino.Token.OR))), "Expected: AND or OR, Got: %s", com.google.javascript.rhino.Token.name(original.getType()));
			com.google.javascript.rhino.Node left = original.getFirstChild();
			com.google.javascript.rhino.Node right = left.getNext();
			com.google.javascript.rhino.Node simplifiedRight = simplifyShortCircuitBranch(right);
			com.google.javascript.rhino.Node simplified = original.cloneNode();
			simplified.addChildToBack(left.cloneTree());
			simplified.addChildToBack(simplifiedRight);
			replacements.add(simplified);
		}

		@java.lang.Override
		public void keepSimplifiedHookExpression(com.google.javascript.rhino.Node hook, boolean thenHasSideEffects, boolean elseHasSideEffects) {
			com.google.common.base.Preconditions.checkArgument(((hook.getType()) == (com.google.javascript.rhino.Token.HOOK)), "Expected: HOOK, Got: %s", com.google.javascript.rhino.Token.name(hook.getType()));
			com.google.javascript.rhino.Node condition = hook.getFirstChild();
			com.google.javascript.rhino.Node thenBranch = condition.getNext();
			com.google.javascript.rhino.Node elseBranch = thenBranch.getNext();
			if (thenHasSideEffects && elseHasSideEffects) {
				com.google.javascript.rhino.Node simplified = hook.cloneNode();
				simplified.addChildToBack(condition.cloneTree());
				simplified.addChildToBack(simplifyShortCircuitBranch(thenBranch));
				simplified.addChildToBack(simplifyShortCircuitBranch(elseBranch));
				replacements.add(simplified);
			}else
				if (thenHasSideEffects || elseHasSideEffects) {
					int type = thenHasSideEffects ? com.google.javascript.rhino.Token.AND : com.google.javascript.rhino.Token.OR;
					com.google.javascript.rhino.Node body = thenHasSideEffects ? thenBranch : elseBranch;
					com.google.javascript.rhino.Node simplified = new com.google.javascript.rhino.Node(type, condition.cloneTree(), simplifyShortCircuitBranch(body)).copyInformationFrom(hook);
					replacements.add(simplified);
				}else {
					throw new java.lang.IllegalArgumentException("keepSimplifiedHookExpression must keep at least 1 branch");
				}
			
		}

		private com.google.javascript.rhino.Node simplifyShortCircuitBranch(com.google.javascript.rhino.Node node) {
			java.util.List<com.google.javascript.rhino.Node> parts = com.google.common.collect.Lists.newArrayList();
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, node, new com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback(compiler, new com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.CopySideEffectSubexpressions(compiler, parts)));
			com.google.javascript.rhino.Node ret = null;
			for (com.google.javascript.rhino.Node part : parts) {
				if (ret != null) {
					ret = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.COMMA, ret, part).copyInformationFrom(node);
				}else {
					ret = part;
				}
			}
			if (ret == null) {
				throw new java.lang.IllegalArgumentException(("expected at least one side effect subexpression in short " + "circuit branch."));
			}
			return ret;
		}
	}

	private static final java.util.Set<java.lang.Integer> FORBIDDEN_TYPES = com.google.common.collect.ImmutableSet.of(com.google.javascript.rhino.Token.BLOCK, com.google.javascript.rhino.Token.SCRIPT, com.google.javascript.rhino.Token.VAR, com.google.javascript.rhino.Token.EXPR_RESULT, com.google.javascript.rhino.Token.RETURN);

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.SideEffectAccumulator accumulator;

	GatherSideEffectSubexpressionsCallback(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.SideEffectAccumulator accumulator) {
		this.compiler = compiler;
		this.accumulator = accumulator;
	}

	private boolean isClassDefiningCall(com.google.javascript.rhino.Node callNode) {
		com.google.javascript.jscomp.CodingConvention.SubclassRelationship classes = compiler.getCodingConvention().getClassesDefinedByCall(callNode);
		return classes != null;
	}

	@java.lang.Override
	public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal traversal, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
		if ((com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.FORBIDDEN_TYPES.contains(node.getType())) || (com.google.javascript.jscomp.NodeUtil.isControlStructure(node))) {
			throw new java.lang.IllegalArgumentException(((com.google.javascript.rhino.Token.name(node.getType())) + " nodes are not supported."));
		}
		if ((node.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) {
			return false;
		}
		if ((node.getType()) == (com.google.javascript.rhino.Token.HOOK)) {
			return processHook(node);
		}
		if (((node.getType()) == (com.google.javascript.rhino.Token.AND)) || ((node.getType()) == (com.google.javascript.rhino.Token.OR))) {
			return processShortCircuitExpression(node);
		}
		if (!(com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node))) {
			return true;
		}else {
			if ((node.getType()) == (com.google.javascript.rhino.Token.CALL)) {
				return processFunctionCall(node);
			}else
				if ((node.getType()) == (com.google.javascript.rhino.Token.NEW)) {
					return processConstructorCall(node);
				}else {
					accumulator.keepSubTree(node);
					return false;
				}
			
		}
	}

	boolean processShortCircuitExpression(com.google.javascript.rhino.Node node) {
		com.google.common.base.Preconditions.checkArgument((((node.getType()) == (com.google.javascript.rhino.Token.AND)) || ((node.getType()) == (com.google.javascript.rhino.Token.OR))), "Expected: AND or OR, Got: %s", com.google.javascript.rhino.Token.name(node.getType()));
		com.google.javascript.rhino.Node left = node.getFirstChild();
		com.google.javascript.rhino.Node right = left.getNext();
		if (com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(right)) {
			accumulator.keepSimplifiedShortCircuitExpression(node);
			return false;
		}else {
			return true;
		}
	}

	boolean processHook(com.google.javascript.rhino.Node node) {
		com.google.common.base.Preconditions.checkArgument(((node.getType()) == (com.google.javascript.rhino.Token.HOOK)), "Expected: HOOK, Got: %s", com.google.javascript.rhino.Token.name(node.getType()));
		com.google.javascript.rhino.Node condition = node.getFirstChild();
		com.google.javascript.rhino.Node ifBranch = condition.getNext();
		com.google.javascript.rhino.Node elseBranch = ifBranch.getNext();
		boolean thenHasSideEffects = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(ifBranch);
		boolean elseHasSideEffects = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(elseBranch);
		if (thenHasSideEffects || elseHasSideEffects) {
			accumulator.keepSimplifiedHookExpression(node, thenHasSideEffects, elseHasSideEffects);
			return false;
		}else {
			return true;
		}
	}

	boolean processFunctionCall(com.google.javascript.rhino.Node node) {
		com.google.common.base.Preconditions.checkArgument(((node.getType()) == (com.google.javascript.rhino.Token.CALL)), "Expected: CALL, Got: %s", com.google.javascript.rhino.Token.name(node.getType()));
		com.google.javascript.rhino.Node functionName = node.getFirstChild();
		if ((com.google.javascript.jscomp.NodeUtil.isName(functionName)) || (com.google.javascript.jscomp.NodeUtil.isGetProp(functionName))) {
			if ((!(accumulator.classDefiningCallsHaveSideEffects())) && (isClassDefiningCall(node))) {
				return true;
			}
		}
		if (!(com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(node))) {
			return true;
		}
		accumulator.keepSubTree(node);
		return false;
	}

	boolean processConstructorCall(com.google.javascript.rhino.Node node) {
		com.google.common.base.Preconditions.checkArgument(((node.getType()) == (com.google.javascript.rhino.Token.NEW)), "Expected: NEW, Got: %s", com.google.javascript.rhino.Token.name(node.getType()));
		if (!(com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(node))) {
			return true;
		}
		accumulator.keepSubTree(node);
		return false;
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal traversal, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
	}
}




package com.google.javascript.jscomp;


final class CheckSideEffects extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.HotSwapCompilerPass {
	static final com.google.javascript.jscomp.DiagnosticType USELESS_CODE_ERROR = com.google.javascript.jscomp.DiagnosticType.warning("JSC_USELESS_CODE", "Suspicious code. {0}");

	static final java.lang.String PROTECTOR_FN = "JSCOMPILER_PRESERVE";

	private final com.google.javascript.jscomp.CheckLevel level;

	private final java.util.List<com.google.javascript.rhino.Node> problemNodes = com.google.common.collect.Lists.newArrayList();

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final boolean protectSideEffectFreeCode;

	CheckSideEffects(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.CheckLevel level, boolean protectSideEffectFreeCode) {
		this.compiler = compiler;
		this.level = level;
		this.protectSideEffectFreeCode = protectSideEffectFreeCode;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.CheckSideEffects.this);
		if (protectSideEffectFreeCode) {
			protectSideEffects();
		}
	}

	@java.lang.Override
	public void hotSwapScript(com.google.javascript.rhino.Node scriptRoot, com.google.javascript.rhino.Node originalRoot) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, scriptRoot, com.google.javascript.jscomp.CheckSideEffects.this);
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if ((n.isEmpty()) || (n.isComma())) {
			return ;
		}
		if (parent == null) {
			return ;
		}
		if ((n.isExprResult()) || (n.isBlock())) {
			return ;
		}
		if ((n.isQualifiedName()) && ((n.getJSDocInfo()) != null)) {
			return ;
		}
		boolean isResultUsed = com.google.javascript.jscomp.NodeUtil.isExpressionResultUsed(n);
		boolean isSimpleOp = com.google.javascript.jscomp.NodeUtil.isSimpleOperatorType(n.getType());
		if ((!isResultUsed) && (isSimpleOp || (!(com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(n, t.getCompiler()))))) {
			java.lang.String msg = "This code lacks side-effects. Is there a bug?";
			if (n.isString()) {
				msg = "Is there a missing '+' on the previous line?";
			}else
				if (isSimpleOp) {
					msg = ("The result of the '" + (com.google.javascript.rhino.Token.name(n.getType()).toLowerCase())) + "' operator is not being used.";
				}
			
			t.getCompiler().report(t.makeError(n, level, com.google.javascript.jscomp.CheckSideEffects.USELESS_CODE_ERROR, msg));
			if (!(com.google.javascript.jscomp.NodeUtil.isStatement(n))) {
				problemNodes.add(n);
			}
		}
	}

	private void protectSideEffects() {
		if (!(problemNodes.isEmpty())) {
			addExtern();
			for (com.google.javascript.rhino.Node n : problemNodes) {
				com.google.javascript.rhino.Node name = com.google.javascript.rhino.IR.name(com.google.javascript.jscomp.CheckSideEffects.PROTECTOR_FN).srcref(n);
				name.putBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME, true);
				com.google.javascript.rhino.Node replacement = com.google.javascript.rhino.IR.call(name).srcref(n);
				replacement.putBooleanProp(com.google.javascript.rhino.Node.FREE_CALL, true);
				n.getParent().replaceChild(n, replacement);
				replacement.addChildToBack(n);
			}
			compiler.reportCodeChange();
		}
	}

	private void addExtern() {
		com.google.javascript.rhino.Node name = com.google.javascript.rhino.IR.name(com.google.javascript.jscomp.CheckSideEffects.PROTECTOR_FN);
		name.putBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME, true);
		com.google.javascript.rhino.Node var = com.google.javascript.rhino.IR.var(name);
		com.google.javascript.rhino.JSDocInfoBuilder builder = new com.google.javascript.rhino.JSDocInfoBuilder(false);
		builder.recordNoAlias();
		var.setJSDocInfo(builder.build(var));
		com.google.javascript.jscomp.CompilerInput input = compiler.getSynthesizedExternsInput();
		input.getAstRoot(compiler).addChildrenToBack(var);
		compiler.reportCodeChange();
	}

	static class StripProtection extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
		private final com.google.javascript.jscomp.AbstractCompiler compiler;

		StripProtection(com.google.javascript.jscomp.AbstractCompiler compiler) {
			this.compiler = compiler;
		}

		@java.lang.Override
		public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.CheckSideEffects.StripProtection.this);
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (n.isCall()) {
				com.google.javascript.rhino.Node target = n.getFirstChild();
				if ((target.isName()) && (target.getString().equals(com.google.javascript.jscomp.CheckSideEffects.PROTECTOR_FN))) {
					com.google.javascript.rhino.Node expr = n.getLastChild();
					n.detachChildren();
					parent.replaceChild(n, expr);
				}
			}
		}
	}
}




package com.google.javascript.jscomp;


class PrepareAst implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final boolean checkOnly;

	PrepareAst(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this(compiler, false);
	}

	PrepareAst(com.google.javascript.jscomp.AbstractCompiler compiler, boolean checkOnly) {
		this.compiler = compiler;
		this.checkOnly = checkOnly;
	}

	private void reportChange() {
		if (checkOnly) {
			com.google.common.base.Preconditions.checkState(false, "normalizeNodeType constraints violated");
		}
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		if (checkOnly) {
			normalizeNodeTypes(root);
		}else {
			if (externs != null) {
				com.google.javascript.jscomp.NodeTraversal.traverse(compiler, externs, new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations(compiler));
			}
			if (root != null) {
				com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations(compiler));
			}
		}
	}

	private void normalizeNodeTypes(com.google.javascript.rhino.Node n) {
		normalizeBlocks(n);
		for (com.google.javascript.rhino.Node child = n.getFirstChild(); child != null; child = child.getNext()) {
			com.google.common.base.Preconditions.checkState(((child.getParent()) == n));
			normalizeNodeTypes(child);
		}
	}

	private void normalizeBlocks(com.google.javascript.rhino.Node n) {
		if (((com.google.javascript.jscomp.NodeUtil.isControlStructure(n)) && (!(n.isLabel()))) && (!(n.isSwitch()))) {
			for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
				if ((com.google.javascript.jscomp.NodeUtil.isControlStructureCodeBlock(n, c)) && (!(c.isBlock()))) {
					com.google.javascript.rhino.Node newBlock = com.google.javascript.rhino.IR.block().srcref(n);
					n.replaceChild(c, newBlock);
					if (!(c.isEmpty())) {
						newBlock.addChildrenToFront(c);
					}else {
						newBlock.setWasEmptyNode(true);
					}
					c = newBlock;
					reportChange();
				}
			}
		}
	}

	static class PrepareAnnotations implements com.google.javascript.jscomp.NodeTraversal.Callback {
		private final com.google.javascript.jscomp.CodingConvention convention;

		PrepareAnnotations(com.google.javascript.jscomp.AbstractCompiler compiler) {
			this.convention = compiler.getCodingConvention();
		}

		@java.lang.Override
		public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (n.isObjectLit()) {
				normalizeObjectLiteralAnnotations(n);
			}
			return true;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.CALL :
					annotateCalls(n);
					break;
				case com.google.javascript.rhino.Token.FUNCTION :
					annotateFunctions(n, parent);
					annotateDispatchers(n, parent);
					break;
			}
		}

		private void normalizeObjectLiteralAnnotations(com.google.javascript.rhino.Node objlit) {
			com.google.common.base.Preconditions.checkState(objlit.isObjectLit());
			for (com.google.javascript.rhino.Node key = objlit.getFirstChild(); key != null; key = key.getNext()) {
				com.google.javascript.rhino.Node value = key.getFirstChild();
				normalizeObjectLiteralKeyAnnotations(objlit, key, value);
			}
		}

		private void annotateCalls(com.google.javascript.rhino.Node n) {
			com.google.common.base.Preconditions.checkState(n.isCall());
			com.google.javascript.rhino.Node first = n.getFirstChild();
			if (!(com.google.javascript.jscomp.NodeUtil.isGet(first))) {
				n.putBooleanProp(com.google.javascript.rhino.Node.FREE_CALL, true);
			}
			if ((first.isName()) && ("eval".equals(first.getString()))) {
				first.putBooleanProp(com.google.javascript.rhino.Node.DIRECT_EVAL, true);
			}
		}

		private void annotateDispatchers(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			com.google.common.base.Preconditions.checkState(n.isFunction());
			if (((parent.getJSDocInfo()) != null) && (parent.getJSDocInfo().isJavaDispatch())) {
				if (parent.isAssign()) {
					com.google.common.base.Preconditions.checkState(((parent.getLastChild()) == n));
					n.putBooleanProp(com.google.javascript.rhino.Node.IS_DISPATCHER, true);
				}
			}
		}

		private void normalizeObjectLiteralKeyAnnotations(com.google.javascript.rhino.Node objlit, com.google.javascript.rhino.Node key, com.google.javascript.rhino.Node value) {
			com.google.common.base.Preconditions.checkState(objlit.isObjectLit());
			if (((key.getJSDocInfo()) != null) && (value.isFunction())) {
				value.setJSDocInfo(key.getJSDocInfo());
			}
		}

		private void annotateFunctions(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			com.google.javascript.rhino.JSDocInfo fnInfo = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(n);
			com.google.javascript.rhino.Node args = n.getFirstChild().getNext();
			for (com.google.javascript.rhino.Node arg = args.getFirstChild(); arg != null; arg = arg.getNext()) {
				java.lang.String argName = arg.getString();
				com.google.javascript.rhino.JSTypeExpression typeExpr = fnInfo == null ? null : fnInfo.getParameterType(argName);
				if ((convention.isOptionalParameter(arg)) || ((typeExpr != null) && (typeExpr.isOptionalArg()))) {
					arg.putBooleanProp(com.google.javascript.rhino.Node.IS_OPTIONAL_PARAM, true);
				}
				if ((convention.isVarArgsParameter(arg)) || ((typeExpr != null) && (typeExpr.isVarArgs()))) {
					arg.putBooleanProp(com.google.javascript.rhino.Node.IS_VAR_ARGS_PARAM, true);
				}
			}
		}
	}
}




package com.google.javascript.jscomp;


class CheckRequiresForConstructors implements com.google.javascript.jscomp.HotSwapCompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.CodingConvention codingConvention;

	private final com.google.javascript.jscomp.CheckLevel level;

	static final com.google.javascript.jscomp.DiagnosticType MISSING_REQUIRE_WARNING = com.google.javascript.jscomp.DiagnosticType.disabled("JSC_MISSING_REQUIRE_WARNING", "''{0}'' used but not goog.require''d");

	CheckRequiresForConstructors(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.CheckLevel level) {
		this.compiler = compiler;
		this.codingConvention = compiler.getCodingConvention();
		this.level = level;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.Callback callback = new com.google.javascript.jscomp.CheckRequiresForConstructors.CheckRequiresForConstructorsCallback();
		new com.google.javascript.jscomp.NodeTraversal(compiler, callback).traverseRoots(externs, root);
	}

	@java.lang.Override
	public void hotSwapScript(com.google.javascript.rhino.Node scriptRoot) {
		com.google.javascript.jscomp.NodeTraversal.Callback callback = new com.google.javascript.jscomp.CheckRequiresForConstructors.CheckRequiresForConstructorsCallback();
		new com.google.javascript.jscomp.NodeTraversal(compiler, callback).traverseWithScope(scriptRoot, com.google.javascript.jscomp.SyntacticScopeCreator.generateUntypedTopScope(compiler));
	}

	private class CheckRequiresForConstructorsCallback implements com.google.javascript.jscomp.NodeTraversal.Callback {
		private final java.util.List<java.lang.String> constructors = com.google.common.collect.Lists.newArrayList();

		private final java.util.List<java.lang.String> requires = com.google.common.collect.Lists.newArrayList();

		private final java.util.List<com.google.javascript.rhino.Node> newNodes = com.google.common.collect.Lists.newArrayList();

		@java.lang.Override
		public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			return ((parent == null) || ((parent.getType()) != (com.google.javascript.rhino.Token.SCRIPT))) || (!(t.getInput().isExtern()));
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			com.google.javascript.rhino.JSDocInfo info;
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.ASSIGN :
					info = ((com.google.javascript.rhino.JSDocInfo) (n.getProp(com.google.javascript.rhino.Node.JSDOC_INFO_PROP)));
					if ((info != null) && (info.isConstructor())) {
						java.lang.String qualifiedName = n.getFirstChild().getQualifiedName();
						constructors.add(qualifiedName);
					}
					break;
				case com.google.javascript.rhino.Token.FUNCTION :
					if (com.google.javascript.jscomp.NodeUtil.isFunctionExpression(n)) {
						if ((parent.getType()) == (com.google.javascript.rhino.Token.NAME)) {
							java.lang.String functionName = parent.getString();
							info = ((com.google.javascript.rhino.JSDocInfo) (parent.getProp(com.google.javascript.rhino.Node.JSDOC_INFO_PROP)));
							if ((info != null) && (info.isConstructor())) {
								constructors.add(functionName);
							}else {
								com.google.javascript.rhino.Node gramps = parent.getParent();
								com.google.common.base.Preconditions.checkState(((gramps != null) && ((gramps.getType()) == (com.google.javascript.rhino.Token.VAR))));
								info = ((com.google.javascript.rhino.JSDocInfo) (gramps.getProp(com.google.javascript.rhino.Node.JSDOC_INFO_PROP)));
								if ((info != null) && (info.isConstructor())) {
									constructors.add(functionName);
								}
							}
						}
					}else {
						info = ((com.google.javascript.rhino.JSDocInfo) (n.getProp(com.google.javascript.rhino.Node.JSDOC_INFO_PROP)));
						if ((info != null) && (info.isConstructor())) {
							java.lang.String functionName = n.getFirstChild().getString();
							constructors.add(functionName);
						}
					}
					break;
				case com.google.javascript.rhino.Token.CALL :
					visitCallNode(n, parent);
					break;
				case com.google.javascript.rhino.Token.SCRIPT :
					visitScriptNode(t);
					break;
				case com.google.javascript.rhino.Token.NEW :
					visitNewNode(t, n);
			}
		}

		private void visitScriptNode(com.google.javascript.jscomp.NodeTraversal t) {
			java.util.Set<java.lang.String> classNames = com.google.common.collect.Sets.newHashSet();
			for (com.google.javascript.rhino.Node node : newNodes) {
				java.lang.String className = node.getFirstChild().getQualifiedName();
				if (((((constructors) == null) || (!(constructors.contains(className)))) && (((requires) == null) || (!(requires.contains(className))))) && (!(classNames.contains(className)))) {
					compiler.report(t.makeError(node, level, com.google.javascript.jscomp.CheckRequiresForConstructors.MISSING_REQUIRE_WARNING, className));
					classNames.add(className);
				}
			}
			com.google.javascript.jscomp.CheckRequiresForConstructors.CheckRequiresForConstructorsCallback.this.newNodes.clear();
			com.google.javascript.jscomp.CheckRequiresForConstructors.CheckRequiresForConstructorsCallback.this.requires.clear();
			com.google.javascript.jscomp.CheckRequiresForConstructors.CheckRequiresForConstructorsCallback.this.constructors.clear();
		}

		private void visitCallNode(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			java.lang.String required = codingConvention.extractClassNameIfRequire(n, parent);
			if (required != null) {
				requires.add(required);
			}
		}

		private void visitNewNode(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
			com.google.javascript.rhino.Node qNameNode = n.getFirstChild();
			java.lang.String qName = qNameNode.getQualifiedName();
			if ((qName == null) || (qName.isEmpty())) {
				return ;
			}
			com.google.javascript.rhino.Node nameNode = qNameNode;
			for (; nameNode.hasChildren(); nameNode = nameNode.getFirstChild()) {
			}
			if ((nameNode.getType()) != (com.google.javascript.rhino.Token.NAME)) {
				return ;
			}
			java.lang.String name = nameNode.getString();
			com.google.javascript.jscomp.Scope.Var var = t.getScope().getVar(name);
			if (((var == null) || (var.isLocal())) || (var.isExtern())) {
				return ;
			}
			newNodes.add(n);
		}
	}
}


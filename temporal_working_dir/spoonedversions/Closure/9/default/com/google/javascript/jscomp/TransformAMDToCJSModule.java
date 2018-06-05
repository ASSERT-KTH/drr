

package com.google.javascript.jscomp;


class TransformAMDToCJSModule implements com.google.javascript.jscomp.CompilerPass {
	@com.google.common.annotations.VisibleForTesting
	static final com.google.javascript.jscomp.DiagnosticType UNSUPPORTED_DEFINE_SIGNATURE_ERROR = com.google.javascript.jscomp.DiagnosticType.error("UNSUPPORTED_DEFINE_SIGNATURE", ("Only define(function() ...), define(OBJECT_LITERAL) and define(" + ("['dep', 'dep1'], function(d0, d2, [exports, module]) ...) forms " + "are currently supported.")));

	static final com.google.javascript.jscomp.DiagnosticType NON_TOP_LEVEL_STATEMENT_DEFINE_ERROR = com.google.javascript.jscomp.DiagnosticType.error("NON_TOP_LEVEL_STATEMENT_DEFINE", "The define function must be called as a top-level statement.");

	static final com.google.javascript.jscomp.DiagnosticType REQUIREJS_PLUGINS_NOT_SUPPORTED_WARNING = com.google.javascript.jscomp.DiagnosticType.warning("REQUIREJS_PLUGINS_NOT_SUPPORTED", "Plugins in define requirements are not supported: {0}");

	static final java.lang.String VAR_RENAME_SUFFIX = "__alias";

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private int renameIndex = 0;

	TransformAMDToCJSModule(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.TransformAMDToCJSModule.TransformAMDModulesCallback());
	}

	private void unsupportedDefineError(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
		t.report(n, com.google.javascript.jscomp.TransformAMDToCJSModule.UNSUPPORTED_DEFINE_SIGNATURE_ERROR);
	}

	private boolean isVirtualModuleName(java.lang.String moduleName) {
		return (("exports".equals(moduleName)) || ("require".equals(moduleName))) || ("module".equals(moduleName));
	}

	private class TransformAMDModulesCallback extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((((n.isCall()) && ((n.getFirstChild()) != null)) && (n.getFirstChild().isName())) && ("define".equals(n.getFirstChild().getString()))) {
				com.google.javascript.jscomp.Scope.Var define = t.getScope().getVar(n.getFirstChild().getString());
				if ((define != null) && (!(define.isGlobal()))) {
					return ;
				}
				if (!((parent.isExprResult()) && (parent.getParent().isScript()))) {
					t.report(n, com.google.javascript.jscomp.TransformAMDToCJSModule.NON_TOP_LEVEL_STATEMENT_DEFINE_ERROR);
					return ;
				}
				com.google.javascript.rhino.Node script = parent.getParent();
				com.google.javascript.rhino.Node requiresNode = null;
				com.google.javascript.rhino.Node callback = null;
				int defineArity = (n.getChildCount()) - 1;
				if (defineArity == 0) {
					unsupportedDefineError(t, n);
					return ;
				}else
					if (defineArity == 1) {
						callback = n.getChildAtIndex(1);
						if (callback.isObjectLit()) {
							handleDefineObjectLiteral(parent, callback, script);
							return ;
						}
					}else
						if (defineArity == 2) {
							requiresNode = n.getChildAtIndex(1);
							callback = n.getChildAtIndex(2);
						}else
							if (defineArity >= 3) {
								unsupportedDefineError(t, n);
								return ;
							}
						
					
				
				if ((!(callback.isFunction())) || ((requiresNode != null) && (!(requiresNode.isArrayLit())))) {
					unsupportedDefineError(t, n);
					return ;
				}
				handleRequiresAndParamList(t, n, script, requiresNode, callback);
				com.google.javascript.rhino.Node callbackBlock = callback.getChildAtIndex(2);
				com.google.javascript.jscomp.NodeTraversal.traverse(compiler, callbackBlock, new com.google.javascript.jscomp.TransformAMDToCJSModule.DefineCallbackReturnCallback());
				moveCallbackContentToTopLevel(parent, script, callbackBlock);
				compiler.reportCodeChange();
			}
		}

		private void handleDefineObjectLiteral(com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node onlyExport, com.google.javascript.rhino.Node script) {
			onlyExport.getParent().removeChild(onlyExport);
			script.replaceChild(parent, com.google.javascript.rhino.IR.exprResult(com.google.javascript.rhino.IR.assign(com.google.javascript.rhino.IR.name("exports"), onlyExport)).copyInformationFromForTree(onlyExport));
			compiler.reportCodeChange();
		}

		private void handleRequiresAndParamList(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node defineNode, com.google.javascript.rhino.Node script, com.google.javascript.rhino.Node requiresNode, com.google.javascript.rhino.Node callback) {
			java.util.Iterator<com.google.javascript.rhino.Node> paramList = callback.getChildAtIndex(1).children().iterator();
			java.util.Iterator<com.google.javascript.rhino.Node> requires = requiresNode != null ? requiresNode.children().iterator() : com.google.common.collect.Iterators.<com.google.javascript.rhino.Node>emptyIterator();
			while ((paramList.hasNext()) || (requires.hasNext())) {
				com.google.javascript.rhino.Node aliasNode = paramList.hasNext() ? paramList.next() : null;
				com.google.javascript.rhino.Node modNode = requires.hasNext() ? requires.next() : null;
				handleRequire(t, defineNode, script, callback, aliasNode, modNode);
			} 
		}

		private void handleRequire(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node defineNode, com.google.javascript.rhino.Node script, com.google.javascript.rhino.Node callback, com.google.javascript.rhino.Node aliasNode, com.google.javascript.rhino.Node modNode) {
			java.lang.String moduleName = null;
			if (modNode != null) {
				moduleName = handlePlugins(t, script, modNode.getString(), modNode);
			}
			if (isVirtualModuleName(moduleName)) {
				return ;
			}
			java.lang.String aliasName = aliasNode != null ? aliasNode.getString() : null;
			com.google.javascript.jscomp.Scope globalScope = t.getScope();
			if ((aliasName != null) && (globalScope.isDeclared(aliasName, true))) {
				while (true) {
					java.lang.String renamed = (aliasName + (com.google.javascript.jscomp.TransformAMDToCJSModule.VAR_RENAME_SUFFIX)) + (renameIndex);
					if (!(globalScope.isDeclared(renamed, true))) {
						com.google.javascript.jscomp.NodeTraversal.traverse(compiler, callback, new com.google.javascript.jscomp.TransformAMDToCJSModule.RenameCallback(aliasName, renamed));
						aliasName = renamed;
						break;
					}
					(renameIndex)++;
				} 
			}
			com.google.javascript.rhino.Node requireNode;
			if (moduleName != null) {
				com.google.javascript.rhino.Node call = com.google.javascript.rhino.IR.call(com.google.javascript.rhino.IR.name("require"), com.google.javascript.rhino.IR.string(moduleName));
				call.putBooleanProp(com.google.javascript.rhino.Node.FREE_CALL, true);
				if (aliasName != null) {
					requireNode = com.google.javascript.rhino.IR.var(com.google.javascript.rhino.IR.name(aliasName), call).copyInformationFromForTree(aliasNode);
				}else {
					requireNode = com.google.javascript.rhino.IR.exprResult(call).copyInformationFromForTree(modNode);
				}
			}else {
				if (isVirtualModuleName(aliasName)) {
					return ;
				}
				requireNode = com.google.javascript.rhino.IR.var(com.google.javascript.rhino.IR.name(aliasName), com.google.javascript.rhino.IR.nullNode()).copyInformationFromForTree(aliasNode);
			}
			script.addChildBefore(requireNode, defineNode.getParent());
		}

		private java.lang.String handlePlugins(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node script, java.lang.String moduleName, com.google.javascript.rhino.Node modNode) {
			if (moduleName.contains("!")) {
				t.report(modNode, com.google.javascript.jscomp.TransformAMDToCJSModule.REQUIREJS_PLUGINS_NOT_SUPPORTED_WARNING, moduleName);
				int condition = moduleName.indexOf('?');
				if (condition > 0) {
					if (moduleName.contains(":")) {
						return null;
					}
					return handlePlugins(t, script, moduleName.substring((condition + 1)), modNode);
				}
				moduleName = null;
			}
			return moduleName;
		}

		private void moveCallbackContentToTopLevel(com.google.javascript.rhino.Node defineParent, com.google.javascript.rhino.Node script, com.google.javascript.rhino.Node callbackBlock) {
			int curIndex = script.getIndexOfChild(defineParent);
			script.removeChild(defineParent);
			callbackBlock.getParent().removeChild(callbackBlock);
			com.google.javascript.rhino.Node before = script.getChildAtIndex(curIndex);
			if (before != null) {
				script.addChildBefore(callbackBlock, before);
			}
			script.addChildToBack(callbackBlock);
			com.google.javascript.jscomp.NodeUtil.tryMergeBlock(callbackBlock);
		}
	}

	private class DefineCallbackReturnCallback extends com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.isReturn()) && (n.hasChildren())) {
				com.google.javascript.rhino.Node retVal = n.getFirstChild();
				n.removeChild(retVal);
				parent.replaceChild(n, com.google.javascript.rhino.IR.exprResult(com.google.javascript.rhino.IR.assign(com.google.javascript.rhino.IR.getprop(com.google.javascript.rhino.IR.name("module"), com.google.javascript.rhino.IR.string("exports")), retVal)).useSourceInfoFromForTree(n));
			}
		}
	}

	private class RenameCallback extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		private final java.lang.String from;

		private final java.lang.String to;

		public RenameCallback(java.lang.String from, java.lang.String to) {
			this.from = from;
			this.to = to;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.isName()) && (from.equals(n.getString()))) {
				n.setString(to);
				n.putProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP, from);
			}
		}
	}
}


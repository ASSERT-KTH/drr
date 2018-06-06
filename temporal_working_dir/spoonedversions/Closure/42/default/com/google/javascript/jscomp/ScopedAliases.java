

package com.google.javascript.jscomp;


class ScopedAliases implements com.google.javascript.jscomp.HotSwapCompilerPass {
	static final java.lang.String SCOPING_METHOD_NAME = "goog.scope";

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.PreprocessorSymbolTable preprocessorSymbolTable;

	private final com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler transformationHandler;

	static final com.google.javascript.jscomp.DiagnosticType GOOG_SCOPE_USED_IMPROPERLY = com.google.javascript.jscomp.DiagnosticType.error("JSC_GOOG_SCOPE_USED_IMPROPERLY", "The call to goog.scope must be alone in a single statement.");

	static final com.google.javascript.jscomp.DiagnosticType GOOG_SCOPE_HAS_BAD_PARAMETERS = com.google.javascript.jscomp.DiagnosticType.error("JSC_GOOG_SCOPE_HAS_BAD_PARAMETERS", ("The call to goog.scope must take only a single parameter.  It must" + " be an anonymous function that itself takes no parameters."));

	static final com.google.javascript.jscomp.DiagnosticType GOOG_SCOPE_REFERENCES_THIS = com.google.javascript.jscomp.DiagnosticType.error("JSC_GOOG_SCOPE_REFERENCES_THIS", "The body of a goog.scope function cannot reference 'this'.");

	static final com.google.javascript.jscomp.DiagnosticType GOOG_SCOPE_USES_RETURN = com.google.javascript.jscomp.DiagnosticType.error("JSC_GOOG_SCOPE_USES_RETURN", "The body of a goog.scope function cannot use 'return'.");

	static final com.google.javascript.jscomp.DiagnosticType GOOG_SCOPE_USES_THROW = com.google.javascript.jscomp.DiagnosticType.error("JSC_GOOG_SCOPE_USES_THROW", "The body of a goog.scope function cannot use 'throw'.");

	static final com.google.javascript.jscomp.DiagnosticType GOOG_SCOPE_ALIAS_REDEFINED = com.google.javascript.jscomp.DiagnosticType.error("JSC_GOOG_SCOPE_ALIAS_REDEFINED", "The alias {0} is assigned a value more than once.");

	static final com.google.javascript.jscomp.DiagnosticType GOOG_SCOPE_NON_ALIAS_LOCAL = com.google.javascript.jscomp.DiagnosticType.error("JSC_GOOG_SCOPE_NON_ALIAS_LOCAL", "The local variable {0} is in a goog.scope and is not an alias.");

	ScopedAliases(com.google.javascript.jscomp.AbstractCompiler compiler, @javax.annotation.Nullable
	com.google.javascript.jscomp.PreprocessorSymbolTable preprocessorSymbolTable, com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler transformationHandler) {
		this.compiler = compiler;
		this.preprocessorSymbolTable = preprocessorSymbolTable;
		this.transformationHandler = transformationHandler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		hotSwapScript(root, null);
	}

	@java.lang.Override
	public void hotSwapScript(com.google.javascript.rhino.Node root, com.google.javascript.rhino.Node originalRoot) {
		com.google.javascript.jscomp.ScopedAliases.Traversal traversal = new com.google.javascript.jscomp.ScopedAliases.Traversal();
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, traversal);
		if (!(traversal.hasErrors())) {
			for (com.google.javascript.jscomp.ScopedAliases.AliasUsage aliasUsage : traversal.getAliasUsages()) {
				aliasUsage.applyAlias();
			}
			for (com.google.javascript.rhino.Node aliasDefinition : traversal.getAliasDefinitionsInOrder()) {
				if ((aliasDefinition.getParent().isVar()) && (aliasDefinition.getParent().hasOneChild())) {
					aliasDefinition.getParent().detachFromParent();
				}else {
					aliasDefinition.detachFromParent();
				}
			}
			for (com.google.javascript.rhino.Node scopeCall : traversal.getScopeCalls()) {
				com.google.javascript.rhino.Node expressionWithScopeCall = scopeCall.getParent();
				com.google.javascript.rhino.Node scopeClosureBlock = scopeCall.getLastChild().getLastChild();
				scopeClosureBlock.detachFromParent();
				expressionWithScopeCall.getParent().replaceChild(expressionWithScopeCall, scopeClosureBlock);
				com.google.javascript.jscomp.NodeUtil.tryMergeBlock(scopeClosureBlock);
			}
			if ((((traversal.getAliasUsages().size()) > 0) || ((traversal.getAliasDefinitionsInOrder().size()) > 0)) || ((traversal.getScopeCalls().size()) > 0)) {
				compiler.reportCodeChange();
			}
		}
	}

	private interface AliasUsage {
		public void applyAlias();
	}

	private class AliasedNode implements com.google.javascript.jscomp.ScopedAliases.AliasUsage {
		private final com.google.javascript.rhino.Node aliasReference;

		private final com.google.javascript.rhino.Node aliasDefinition;

		AliasedNode(com.google.javascript.rhino.Node aliasReference, com.google.javascript.rhino.Node aliasDefinition) {
			this.aliasReference = aliasReference;
			this.aliasDefinition = aliasDefinition;
		}

		@java.lang.Override
		public void applyAlias() {
			aliasReference.getParent().replaceChild(aliasReference, aliasDefinition.cloneTree());
		}
	}

	private class AliasedTypeNode implements com.google.javascript.jscomp.ScopedAliases.AliasUsage {
		private final com.google.javascript.rhino.Node aliasReference;

		private final java.lang.String correctedType;

		AliasedTypeNode(com.google.javascript.rhino.Node aliasReference, java.lang.String correctedType) {
			this.aliasReference = aliasReference;
			this.correctedType = correctedType;
		}

		@java.lang.Override
		public void applyAlias() {
			aliasReference.setString(correctedType);
		}
	}

	private class Traversal implements com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
		private final java.util.List<com.google.javascript.rhino.Node> aliasDefinitionsInOrder = com.google.common.collect.Lists.newArrayList();

		private final java.util.List<com.google.javascript.rhino.Node> scopeCalls = com.google.common.collect.Lists.newArrayList();

		private final java.util.List<com.google.javascript.jscomp.ScopedAliases.AliasUsage> aliasUsages = com.google.common.collect.Lists.newArrayList();

		private final java.util.Map<java.lang.String, com.google.javascript.jscomp.Scope.Var> aliases = com.google.common.collect.Maps.newHashMap();

		private boolean hasErrors = false;

		private com.google.javascript.jscomp.CompilerOptions.AliasTransformation transformation = null;

		java.util.Collection<com.google.javascript.rhino.Node> getAliasDefinitionsInOrder() {
			return aliasDefinitionsInOrder;
		}

		private java.util.List<com.google.javascript.jscomp.ScopedAliases.AliasUsage> getAliasUsages() {
			return aliasUsages;
		}

		java.util.List<com.google.javascript.rhino.Node> getScopeCalls() {
			return scopeCalls;
		}

		boolean hasErrors() {
			return hasErrors;
		}

		private boolean isCallToScopeMethod(com.google.javascript.rhino.Node n) {
			return (n.isCall()) && (com.google.javascript.jscomp.ScopedAliases.SCOPING_METHOD_NAME.equals(n.getFirstChild().getQualifiedName()));
		}

		@java.lang.Override
		public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
			com.google.javascript.rhino.Node n = t.getCurrentNode().getParent();
			if ((n != null) && (isCallToScopeMethod(n))) {
				transformation = transformationHandler.logAliasTransformation(n.getSourceFileName(), getSourceRegion(n));
				findAliases(t);
			}
		}

		@java.lang.Override
		public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
			if ((t.getScopeDepth()) == 2) {
				aliases.clear();
				transformation = null;
			}
		}

		@java.lang.Override
		public final boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.isFunction()) && (t.inGlobalScope())) {
				if ((parent == null) || (!(isCallToScopeMethod(parent)))) {
					return false;
				}
			}
			return true;
		}

		private com.google.javascript.rhino.SourcePosition<com.google.javascript.jscomp.CompilerOptions.AliasTransformation> getSourceRegion(com.google.javascript.rhino.Node n) {
			com.google.javascript.rhino.Node testNode = n;
			com.google.javascript.rhino.Node next = null;
			for (; (next != null) || (testNode.isScript());) {
				next = testNode.getNext();
				testNode = testNode.getParent();
			}
			int endLine = next == null ? java.lang.Integer.MAX_VALUE : next.getLineno();
			int endChar = next == null ? java.lang.Integer.MAX_VALUE : next.getCharno();
			com.google.javascript.rhino.SourcePosition<com.google.javascript.jscomp.CompilerOptions.AliasTransformation> pos = new com.google.javascript.rhino.SourcePosition<com.google.javascript.jscomp.CompilerOptions.AliasTransformation>() {			};
			pos.setPositionInformation(n.getLineno(), n.getCharno(), endLine, endChar);
			return pos;
		}

		private void report(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.jscomp.DiagnosticType error, java.lang.String... arguments) {
			compiler.report(t.makeError(n, error, arguments));
			hasErrors = true;
		}

		private void findAliases(com.google.javascript.jscomp.NodeTraversal t) {
			com.google.javascript.jscomp.Scope scope = t.getScope();
			for (com.google.javascript.jscomp.Scope.Var v : scope.getVarIterable()) {
				com.google.javascript.rhino.Node n = v.getNode();
				int type = n.getType();
				com.google.javascript.rhino.Node parent = n.getParent();
				if (parent.isVar()) {
					if ((n.hasChildren()) && (n.getFirstChild().isQualifiedName())) {
						java.lang.String name = n.getString();
						com.google.javascript.jscomp.Scope.Var aliasVar = scope.getVar(name);
						aliases.put(name, aliasVar);
						java.lang.String qualifiedName = aliasVar.getInitialValue().getQualifiedName();
						transformation.addAlias(name, qualifiedName);
					}else {
						report(t, n, com.google.javascript.jscomp.ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL, n.getString());
					}
				}
			}
		}

		private void validateScopeCall(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((preprocessorSymbolTable) != null) {
				preprocessorSymbolTable.addReference(n.getFirstChild());
			}
			if (!(parent.isExprResult())) {
				report(t, n, com.google.javascript.jscomp.ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY);
			}
			if ((n.getChildCount()) != 2) {
				report(t, n, com.google.javascript.jscomp.ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
			}else {
				com.google.javascript.rhino.Node anonymousFnNode = n.getChildAtIndex(1);
				if (((!(anonymousFnNode.isFunction())) || ((com.google.javascript.jscomp.NodeUtil.getFunctionName(anonymousFnNode)) != null)) || (com.google.javascript.jscomp.NodeUtil.getFunctionParameters(anonymousFnNode).hasChildren())) {
					report(t, anonymousFnNode, com.google.javascript.jscomp.ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
				}else {
					scopeCalls.add(n);
				}
			}
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (isCallToScopeMethod(n)) {
				validateScopeCall(t, n, n.getParent());
			}
			if ((t.getScopeDepth()) < 2) {
				return ;
			}
			int type = n.getType();
			com.google.javascript.jscomp.Scope.Var aliasVar = null;
			if (type == (com.google.javascript.rhino.Token.NAME)) {
				java.lang.String name = n.getString();
				com.google.javascript.jscomp.Scope.Var lexicalVar = t.getScope().getVar(n.getString());
				if ((lexicalVar != null) && (lexicalVar == (aliases.get(name)))) {
					aliasVar = lexicalVar;
				}
			}
			if ((t.getScopeDepth()) == 2) {
				if ((aliasVar != null) && (com.google.javascript.jscomp.NodeUtil.isLValue(n))) {
					if ((aliasVar.getNode()) == n) {
						aliasDefinitionsInOrder.add(n);
						return ;
					}else {
						report(t, n, com.google.javascript.jscomp.ScopedAliases.GOOG_SCOPE_ALIAS_REDEFINED, n.getString());
					}
				}
				if (type == (com.google.javascript.rhino.Token.RETURN)) {
					report(t, n, com.google.javascript.jscomp.ScopedAliases.GOOG_SCOPE_USES_RETURN);
				}else
					if (type == (com.google.javascript.rhino.Token.THIS)) {
						report(t, n, com.google.javascript.jscomp.ScopedAliases.GOOG_SCOPE_REFERENCES_THIS);
					}else
						if (type == (com.google.javascript.rhino.Token.THROW)) {
							report(t, n, com.google.javascript.jscomp.ScopedAliases.GOOG_SCOPE_USES_THROW);
						}
					
				
			}
			if ((t.getScopeDepth()) >= 2) {
				if (aliasVar != null) {
					com.google.javascript.rhino.Node aliasedNode = aliasVar.getInitialValue();
					aliasUsages.add(new com.google.javascript.jscomp.ScopedAliases.AliasedNode(n, aliasedNode));
				}
				com.google.javascript.rhino.JSDocInfo info = n.getJSDocInfo();
				if (info != null) {
					for (com.google.javascript.rhino.Node node : info.getTypeNodes()) {
						fixTypeNode(node);
					}
				}
			}
		}

		private void fixTypeNode(com.google.javascript.rhino.Node typeNode) {
			if (typeNode.isString()) {
				java.lang.String name = typeNode.getString();
				int endIndex = name.indexOf('.');
				if (endIndex == (-1)) {
					endIndex = name.length();
				}
				java.lang.String baseName = name.substring(0, endIndex);
				com.google.javascript.jscomp.Scope.Var aliasVar = aliases.get(baseName);
				if (aliasVar != null) {
					com.google.javascript.rhino.Node aliasedNode = aliasVar.getInitialValue();
					aliasUsages.add(new com.google.javascript.jscomp.ScopedAliases.AliasedTypeNode(typeNode, ((aliasedNode.getQualifiedName()) + (name.substring(endIndex)))));
				}
			}
			for (com.google.javascript.rhino.Node child = typeNode.getFirstChild(); child != null; child = child.getNext()) {
				fixTypeNode(child);
			}
		}
	}
}


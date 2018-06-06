

package com.google.javascript.jscomp;


class SyntacticScopeCreator implements com.google.javascript.jscomp.ScopeCreator {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private com.google.javascript.jscomp.Scope scope;

	private java.lang.String sourceName;

	private final com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler redeclarationHandler;

	private static final java.lang.String ARGUMENTS = "arguments";

	public static final com.google.javascript.jscomp.DiagnosticType VAR_MULTIPLY_DECLARED_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_VAR_MULTIPLY_DECLARED_ERROR", "Variable {0} first declared in {1}");

	public static final com.google.javascript.jscomp.DiagnosticType VAR_ARGUMENTS_SHADOWED_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_VAR_ARGUMENTS_SHADOWED_ERROR", "Shadowing \"arguments\" is not allowed");

	SyntacticScopeCreator(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
		this.redeclarationHandler = new com.google.javascript.jscomp.SyntacticScopeCreator.DefaultRedeclarationHandler();
	}

	SyntacticScopeCreator(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler redeclarationHandler) {
		this.compiler = compiler;
		this.redeclarationHandler = redeclarationHandler;
	}

	public com.google.javascript.jscomp.Scope createScope(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.Scope parent) {
		sourceName = null;
		if (parent == null) {
			scope = new com.google.javascript.jscomp.Scope(n, compiler);
		}else {
			scope = new com.google.javascript.jscomp.Scope(parent, n);
		}
		scanRoot(n, parent);
		sourceName = null;
		com.google.javascript.jscomp.Scope returnedScope = scope;
		scope = null;
		return returnedScope;
	}

	private void scanRoot(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.Scope parent) {
		if ((n.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) {
			sourceName = ((java.lang.String) (n.getProp(com.google.javascript.rhino.Node.SOURCENAME_PROP)));
			final com.google.javascript.rhino.Node fnNameNode = n.getFirstChild();
			final com.google.javascript.rhino.Node args = fnNameNode.getNext();
			final com.google.javascript.rhino.Node body = args.getNext();
			java.lang.String fnName = fnNameNode.getString();
			if ((!(fnName.isEmpty())) && (com.google.javascript.jscomp.NodeUtil.isFunctionExpression(n))) {
				declareVar(fnNameNode);
			}
			com.google.common.base.Preconditions.checkState(((args.getType()) == (com.google.javascript.rhino.Token.LP)));
			for (com.google.javascript.rhino.Node a = args.getFirstChild(); a != null; a = a.getNext()) {
				com.google.common.base.Preconditions.checkState(((a.getType()) == (com.google.javascript.rhino.Token.NAME)));
				declareVar(a);
			}
			scanVars(body, n);
		}else {
			com.google.common.base.Preconditions.checkState(((scope.getParent()) == null));
			scanVars(n, null);
		}
	}

	private void scanVars(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.VAR :
				for (com.google.javascript.rhino.Node child = n.getFirstChild(); child != null;) {
					com.google.javascript.rhino.Node next = child.getNext();
					declareVar(child);
					child = next;
				}
				return ;
			case com.google.javascript.rhino.Token.FUNCTION :
				if (com.google.javascript.jscomp.NodeUtil.isFunctionExpression(n)) {
					return ;
				}
				java.lang.String fnName = n.getFirstChild().getString();
				if (fnName.isEmpty()) {
					return ;
				}
				declareVar(n.getFirstChild());
				return ;
			case com.google.javascript.rhino.Token.CATCH :
				com.google.common.base.Preconditions.checkState(((n.getChildCount()) == 2));
				com.google.common.base.Preconditions.checkState(((n.getFirstChild().getType()) == (com.google.javascript.rhino.Token.NAME)));
				final com.google.javascript.rhino.Node var = n.getFirstChild();
				final com.google.javascript.rhino.Node block = var.getNext();
				declareVar(var);
				scanVars(block, n);
				return ;
			case com.google.javascript.rhino.Token.SCRIPT :
				sourceName = ((java.lang.String) (n.getProp(com.google.javascript.rhino.Node.SOURCENAME_PROP)));
				break;
		}
		if ((com.google.javascript.jscomp.NodeUtil.isControlStructure(n)) || (com.google.javascript.jscomp.NodeUtil.isStatementBlock(n))) {
			for (com.google.javascript.rhino.Node child = n.getFirstChild(); child != null;) {
				com.google.javascript.rhino.Node next = child.getNext();
				scanVars(child, n);
				child = next;
			}
		}
	}

	interface RedeclarationHandler {
		void onRedeclaration(com.google.javascript.jscomp.Scope s, java.lang.String name, com.google.javascript.rhino.Node n, com.google.javascript.jscomp.CompilerInput input);
	}

	private class DefaultRedeclarationHandler implements com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler {
		public void onRedeclaration(com.google.javascript.jscomp.Scope s, java.lang.String name, com.google.javascript.rhino.Node n, com.google.javascript.jscomp.CompilerInput input) {
			com.google.javascript.rhino.Node parent = n.getParent();
			if (scope.isGlobal()) {
				com.google.javascript.jscomp.Scope.Var origVar = scope.getVar(name);
				com.google.javascript.rhino.Node origParent = origVar.getParentNode();
				if (((origParent.getType()) == (com.google.javascript.rhino.Token.CATCH)) && ((parent.getType()) == (com.google.javascript.rhino.Token.CATCH))) {
					return ;
				}
				boolean allowDupe = false;
				com.google.javascript.rhino.JSDocInfo info = n.getJSDocInfo();
				if (info == null) {
					info = parent.getJSDocInfo();
				}
				allowDupe = (info != null) && (info.getSuppressions().contains("duplicate"));
				info = origVar.nameNode.getJSDocInfo();
				if (info == null) {
					info = origParent.getJSDocInfo();
				}
				allowDupe |= (info != null) && (info.getSuppressions().contains("duplicate"));
				if (!allowDupe) {
					compiler.report(com.google.javascript.jscomp.JSError.make(sourceName, n, com.google.javascript.jscomp.SyntacticScopeCreator.VAR_MULTIPLY_DECLARED_ERROR, name, ((origVar.input) != null ? origVar.input.getName() : "??")));
				}
			}else
				if ((name.equals(com.google.javascript.jscomp.SyntacticScopeCreator.ARGUMENTS)) && (!(com.google.javascript.jscomp.NodeUtil.isVarDeclaration(n)))) {
					compiler.report(com.google.javascript.jscomp.JSError.make(sourceName, n, com.google.javascript.jscomp.SyntacticScopeCreator.VAR_ARGUMENTS_SHADOWED_ERROR));
				}
			
		}
	}

	private void declareVar(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkState(((n.getType()) == (com.google.javascript.rhino.Token.NAME)));
		com.google.javascript.jscomp.CompilerInput input = compiler.getInput(sourceName);
		java.lang.String name = n.getString();
		if ((scope.isDeclared(name, false)) || ((scope.isLocal()) && (name.equals(com.google.javascript.jscomp.SyntacticScopeCreator.ARGUMENTS)))) {
			redeclarationHandler.onRedeclaration(scope, name, n, input);
		}else {
			scope.declare(name, n, null, input);
		}
	}
}


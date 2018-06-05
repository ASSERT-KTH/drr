

package com.google.javascript.jscomp;


class VarCheck extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.HotSwapCompilerPass {
	static final com.google.javascript.jscomp.DiagnosticType UNDEFINED_VAR_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_UNDEFINED_VARIABLE", "variable {0} is undeclared");

	static final com.google.javascript.jscomp.DiagnosticType VIOLATED_MODULE_DEP_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_VIOLATED_MODULE_DEPENDENCY", ("module {0} cannot reference {2}, defined in " + "module {1}, since {1} loads after {0}"));

	static final com.google.javascript.jscomp.DiagnosticType MISSING_MODULE_DEP_ERROR = com.google.javascript.jscomp.DiagnosticType.warning("JSC_MISSING_MODULE_DEPENDENCY", ("missing module dependency; module {0} should depend " + "on module {1} because it references {2}"));

	static final com.google.javascript.jscomp.DiagnosticType STRICT_MODULE_DEP_ERROR = com.google.javascript.jscomp.DiagnosticType.disabled("JSC_STRICT_MODULE_DEPENDENCY", ("module {0} cannot reference {2}, defined in " + "module {1}"));

	static final com.google.javascript.jscomp.DiagnosticType NAME_REFERENCE_IN_EXTERNS_ERROR = com.google.javascript.jscomp.DiagnosticType.warning("JSC_NAME_REFERENCE_IN_EXTERNS", "accessing name {0} in externs has no effect");

	static final com.google.javascript.jscomp.DiagnosticType UNDEFINED_EXTERN_VAR_ERROR = com.google.javascript.jscomp.DiagnosticType.warning("JSC_UNDEFINED_EXTERN_VAR_ERROR", "name {0} is not undefined in the externs.");

	private com.google.javascript.rhino.Node synthesizedExternsRoot = null;

	private final java.util.Set<java.lang.String> varsToDeclareInExterns = com.google.common.collect.Sets.newHashSet();

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final boolean sanityCheck;

	private final boolean strictExternCheck;

	VarCheck(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this(compiler, false);
	}

	VarCheck(com.google.javascript.jscomp.AbstractCompiler compiler, boolean sanityCheck) {
		this.compiler = compiler;
		this.strictExternCheck = (compiler.getErrorLevel(com.google.javascript.jscomp.JSError.make("", 0, 0, com.google.javascript.jscomp.VarCheck.UNDEFINED_EXTERN_VAR_ERROR))) == (com.google.javascript.jscomp.CheckLevel.ERROR);
		this.sanityCheck = sanityCheck;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		if (!(sanityCheck)) {
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, externs, new com.google.javascript.jscomp.VarCheck.NameRefInExternsCheck());
		}
		com.google.javascript.jscomp.NodeTraversal.traverseRoots(compiler, com.google.common.collect.Lists.newArrayList(externs, root), com.google.javascript.jscomp.VarCheck.this);
		for (java.lang.String varName : varsToDeclareInExterns) {
			createSynthesizedExternVar(varName);
		}
	}

	@java.lang.Override
	public void hotSwapScript(com.google.javascript.rhino.Node scriptRoot, com.google.javascript.rhino.Node originalRoot) {
		com.google.common.base.Preconditions.checkState(scriptRoot.isScript());
		com.google.javascript.jscomp.NodeTraversal t = new com.google.javascript.jscomp.NodeTraversal(compiler, com.google.javascript.jscomp.VarCheck.this);
		t.traverseWithScope(scriptRoot, com.google.javascript.jscomp.SyntacticScopeCreator.generateUntypedTopScope(compiler));
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if (!(n.isName())) {
			return ;
		}
		java.lang.String varName = n.getString();
		if (varName.isEmpty()) {
			com.google.common.base.Preconditions.checkState(parent.isFunction());
			com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.NodeUtil.isFunctionExpression(parent));
			return ;
		}
		if (((parent.isVar()) || (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(parent))) && (varsToDeclareInExterns.contains(varName))) {
			createSynthesizedExternVar(varName);
			n.addSuppression("duplicate");
		}
		com.google.javascript.jscomp.Scope scope = t.getScope();
		com.google.javascript.jscomp.Scope.Var var = scope.getVar(varName);
		if (var == null) {
			if (com.google.javascript.jscomp.NodeUtil.isFunctionExpression(parent)) {
			}else {
				if ((!(strictExternCheck)) || (!(t.getInput().isExtern()))) {
					t.report(n, com.google.javascript.jscomp.VarCheck.UNDEFINED_VAR_ERROR, varName);
				}
				if (sanityCheck) {
					throw new java.lang.IllegalStateException(("Unexpected variable " + varName));
				}else {
					createSynthesizedExternVar(varName);
					scope.getGlobalScope().declare(varName, n, null, getSynthesizedExternsInput());
				}
			}
			return ;
		}
		com.google.javascript.jscomp.CompilerInput currInput = t.getInput();
		com.google.javascript.jscomp.CompilerInput varInput = var.input;
		if (((currInput == varInput) || (currInput == null)) || (varInput == null)) {
			return ;
		}
		com.google.javascript.jscomp.JSModule currModule = currInput.getModule();
		com.google.javascript.jscomp.JSModule varModule = varInput.getModule();
		com.google.javascript.jscomp.JSModuleGraph moduleGraph = compiler.getModuleGraph();
		if (((varModule != currModule) && (varModule != null)) && (currModule != null)) {
			if (moduleGraph.dependsOn(currModule, varModule)) {
			}else {
				if ((!(sanityCheck)) && (scope.isGlobal())) {
					if (moduleGraph.dependsOn(varModule, currModule)) {
						t.report(n, com.google.javascript.jscomp.VarCheck.VIOLATED_MODULE_DEP_ERROR, currModule.getName(), varModule.getName(), varName);
					}else {
						t.report(n, com.google.javascript.jscomp.VarCheck.MISSING_MODULE_DEP_ERROR, currModule.getName(), varModule.getName(), varName);
					}
				}else {
					t.report(n, com.google.javascript.jscomp.VarCheck.STRICT_MODULE_DEP_ERROR, currModule.getName(), varModule.getName(), varName);
				}
			}
		}
	}

	private void createSynthesizedExternVar(java.lang.String varName) {
		com.google.javascript.rhino.Node nameNode = com.google.javascript.rhino.IR.name(varName);
		if (compiler.getCodingConvention().isConstant(varName)) {
			nameNode.putBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME, true);
		}
		getSynthesizedExternsRoot().addChildToBack(com.google.javascript.rhino.IR.var(nameNode));
		varsToDeclareInExterns.remove(varName);
		compiler.reportCodeChange();
	}

	private class NameRefInExternsCheck extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (n.isName()) {
				switch (parent.getType()) {
					case com.google.javascript.rhino.Token.VAR :
					case com.google.javascript.rhino.Token.FUNCTION :
					case com.google.javascript.rhino.Token.PARAM_LIST :
						break;
					case com.google.javascript.rhino.Token.GETPROP :
						if (n == (parent.getFirstChild())) {
							com.google.javascript.jscomp.Scope scope = t.getScope();
							com.google.javascript.jscomp.Scope.Var var = scope.getVar(n.getString());
							if (var == null) {
								t.report(n, com.google.javascript.jscomp.VarCheck.UNDEFINED_EXTERN_VAR_ERROR, n.getString());
								varsToDeclareInExterns.add(n.getString());
							}
						}
						break;
					default :
						t.report(n, com.google.javascript.jscomp.VarCheck.NAME_REFERENCE_IN_EXTERNS_ERROR, n.getString());
						com.google.javascript.jscomp.Scope scope = t.getScope();
						com.google.javascript.jscomp.Scope.Var var = scope.getVar(n.getString());
						if (var == null) {
							varsToDeclareInExterns.add(n.getString());
						}
						break;
				}
			}
		}
	}

	private com.google.javascript.jscomp.CompilerInput getSynthesizedExternsInput() {
		return compiler.getSynthesizedExternsInput();
	}

	private com.google.javascript.rhino.Node getSynthesizedExternsRoot() {
		if ((synthesizedExternsRoot) == null) {
			com.google.javascript.jscomp.CompilerInput synthesizedExterns = getSynthesizedExternsInput();
			synthesizedExternsRoot = synthesizedExterns.getAstRoot(compiler);
		}
		return synthesizedExternsRoot;
	}
}


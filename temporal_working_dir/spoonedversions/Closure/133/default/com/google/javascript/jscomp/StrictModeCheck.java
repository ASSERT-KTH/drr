

package com.google.javascript.jscomp;


class StrictModeCheck extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
	static final com.google.javascript.jscomp.DiagnosticType UNKNOWN_VARIABLE = com.google.javascript.jscomp.DiagnosticType.warning("JSC_UNKNOWN_VARIABLE", "unknown variable {0}");

	static final com.google.javascript.jscomp.DiagnosticType EVAL_USE = com.google.javascript.jscomp.DiagnosticType.error("JSC_EVAL_USE", "\"eval\" cannot be used in Caja");

	static final com.google.javascript.jscomp.DiagnosticType EVAL_DECLARATION = com.google.javascript.jscomp.DiagnosticType.warning("JSC_EVAL_DECLARATION", "\"eval\" cannot be redeclared in ES5 strict mode");

	static final com.google.javascript.jscomp.DiagnosticType EVAL_ASSIGNMENT = com.google.javascript.jscomp.DiagnosticType.warning("JSC_EVAL_ASSIGNMENT", "the \"eval\" object cannot be reassigned in ES5 strict mode");

	static final com.google.javascript.jscomp.DiagnosticType ARGUMENTS_DECLARATION = com.google.javascript.jscomp.DiagnosticType.warning("JSC_ARGUMENTS_DECLARATION", "\"arguments\" cannot be redeclared in ES5 strict mode");

	static final com.google.javascript.jscomp.DiagnosticType ARGUMENTS_ASSIGNMENT = com.google.javascript.jscomp.DiagnosticType.warning("JSC_ARGUMENTS_ASSIGNMENT", "the \"arguments\" object cannot be reassigned in ES5 strict mode");

	static final com.google.javascript.jscomp.DiagnosticType DELETE_VARIABLE = com.google.javascript.jscomp.DiagnosticType.warning("JSC_DELETE_VARIABLE", ("variables, functions, and arguments cannot be deleted in " + "ES5 strict mode"));

	static final com.google.javascript.jscomp.DiagnosticType ILLEGAL_NAME = com.google.javascript.jscomp.DiagnosticType.error("JSC_ILLEGAL_NAME", "identifiers ending in '__' cannot be used in Caja");

	static final com.google.javascript.jscomp.DiagnosticType DUPLICATE_OBJECT_KEY = com.google.javascript.jscomp.DiagnosticType.warning("JSC_DUPLICATE_OBJECT_KEY", "object literals cannot contain duplicate keys in ES5 strict mode");

	static final com.google.javascript.jscomp.DiagnosticType BAD_FUNCTION_DECLARATION = com.google.javascript.jscomp.DiagnosticType.error("JSC_BAD_FUNCTION_DECLARATION", ("functions can only be declared at top level or immediately within " + "another function in ES5 strict mode"));

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final boolean noVarCheck;

	private final boolean noCajaChecks;

	StrictModeCheck(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this(compiler, false, false);
	}

	StrictModeCheck(com.google.javascript.jscomp.AbstractCompiler compiler, boolean noVarCheck, boolean noCajaChecks) {
		this.compiler = compiler;
		this.noVarCheck = noVarCheck;
		this.noCajaChecks = noCajaChecks;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverseRoots(compiler, com.google.common.collect.Lists.newArrayList(externs, root), com.google.javascript.jscomp.StrictModeCheck.this);
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.StrictModeCheck.NonExternChecks());
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if (n.isFunction()) {
			checkFunctionUse(t, n);
		}else
			if (n.isName()) {
				if (!(com.google.javascript.jscomp.StrictModeCheck.isDeclaration(n))) {
					checkNameUse(t, n);
				}
			}else
				if (n.isAssign()) {
					checkAssignment(t, n);
				}else
					if (n.isDelProp()) {
						checkDelete(t, n);
					}else
						if (n.isObjectLit()) {
							checkObjectLiteral(t, n);
						}else
							if (n.isLabel()) {
								checkLabel(t, n);
							}
						
					
				
			
		
	}

	private void checkFunctionUse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
		if ((com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n)) && (!(com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(n)))) {
			t.report(n, com.google.javascript.jscomp.StrictModeCheck.BAD_FUNCTION_DECLARATION);
		}
	}

	private static boolean isDeclaration(com.google.javascript.rhino.Node n) {
		switch (n.getParent().getType()) {
			case com.google.javascript.rhino.Token.VAR :
			case com.google.javascript.rhino.Token.FUNCTION :
			case com.google.javascript.rhino.Token.CATCH :
				return true;
			case com.google.javascript.rhino.Token.PARAM_LIST :
				return n.getParent().getParent().isFunction();
			default :
				return false;
		}
	}

	private void checkNameUse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
		com.google.javascript.jscomp.Scope.Var v = t.getScope().getVar(n.getString());
		if (v == null) {
			if (!(noVarCheck)) {
				t.report(n, com.google.javascript.jscomp.StrictModeCheck.UNKNOWN_VARIABLE, n.getString());
			}
		}
		if (!(noCajaChecks)) {
			if ("eval".equals(n.getString())) {
				t.report(n, com.google.javascript.jscomp.StrictModeCheck.EVAL_USE);
			}else
				if (n.getString().endsWith("__")) {
					t.report(n, com.google.javascript.jscomp.StrictModeCheck.ILLEGAL_NAME);
				}
			
		}
	}

	private void checkAssignment(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
		if (n.getFirstChild().isName()) {
			if ("arguments".equals(n.getFirstChild().getString())) {
				t.report(n, com.google.javascript.jscomp.StrictModeCheck.ARGUMENTS_ASSIGNMENT);
			}else
				if ("eval".equals(n.getFirstChild().getString())) {
					if (noCajaChecks) {
						t.report(n, com.google.javascript.jscomp.StrictModeCheck.EVAL_ASSIGNMENT);
					}
				}
			
		}
	}

	private void checkDelete(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
		if (n.getFirstChild().isName()) {
			com.google.javascript.jscomp.Scope.Var v = t.getScope().getVar(n.getFirstChild().getString());
			if (v != null) {
				t.report(n, com.google.javascript.jscomp.StrictModeCheck.DELETE_VARIABLE);
			}
		}
	}

	private void checkObjectLiteral(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
		java.util.Set<java.lang.String> getters = com.google.common.collect.Sets.newHashSet();
		java.util.Set<java.lang.String> setters = com.google.common.collect.Sets.newHashSet();
		for (com.google.javascript.rhino.Node key = n.getFirstChild(); key != null; key = key.getNext()) {
			if ((!(noCajaChecks)) && (key.getString().endsWith("__"))) {
				t.report(key, com.google.javascript.jscomp.StrictModeCheck.ILLEGAL_NAME);
			}
			if (!(key.isSetterDef())) {
				if (getters.contains(key.getString())) {
					t.report(key, com.google.javascript.jscomp.StrictModeCheck.DUPLICATE_OBJECT_KEY);
				}else {
					getters.add(key.getString());
				}
			}
			if (!(key.isGetterDef())) {
				if (setters.contains(key.getString())) {
					t.report(key, com.google.javascript.jscomp.StrictModeCheck.DUPLICATE_OBJECT_KEY);
				}else {
					setters.add(key.getString());
				}
			}
		}
	}

	private void checkLabel(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
		if (n.getFirstChild().getString().endsWith("__")) {
			if (!(noCajaChecks)) {
				t.report(n.getFirstChild(), com.google.javascript.jscomp.StrictModeCheck.ILLEGAL_NAME);
			}
		}
	}

	private class NonExternChecks extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.isName()) && (com.google.javascript.jscomp.StrictModeCheck.isDeclaration(n))) {
				checkDeclaration(t, n);
			}else
				if (n.isGetProp()) {
					checkProperty(t, n);
				}
			
		}

		private void checkDeclaration(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
			if ("eval".equals(n.getString())) {
				t.report(n, com.google.javascript.jscomp.StrictModeCheck.EVAL_DECLARATION);
			}else
				if ("arguments".equals(n.getString())) {
					t.report(n, com.google.javascript.jscomp.StrictModeCheck.ARGUMENTS_DECLARATION);
				}else
					if (n.getString().endsWith("__")) {
						if (!(noCajaChecks)) {
							t.report(n, com.google.javascript.jscomp.StrictModeCheck.ILLEGAL_NAME);
						}
					}
				
			
		}

		private void checkProperty(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
			if (n.getLastChild().getString().endsWith("__")) {
				if (!(noCajaChecks)) {
					t.report(n.getLastChild(), com.google.javascript.jscomp.StrictModeCheck.ILLEGAL_NAME);
				}
			}
		}
	}
}


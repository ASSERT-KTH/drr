

package com.google.javascript.jscomp;


class ConstCheck extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
	static final com.google.javascript.jscomp.DiagnosticType CONST_REASSIGNED_VALUE_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_CONSTANT_REASSIGNED_VALUE_ERROR", "constant {0} assigned a value more than once");

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.Set<com.google.javascript.jscomp.Scope.Var> initializedConstants;

	public ConstCheck(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
		this.initializedConstants = new java.util.HashSet<com.google.javascript.jscomp.Scope.Var>();
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.common.base.Preconditions.checkState(compiler.isNormalized());
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.ConstCheck.this);
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.NAME :
				if (((parent != null) && ((parent.getType()) == (com.google.javascript.rhino.Token.VAR))) && (n.hasChildren())) {
					java.lang.String name = n.getString();
					com.google.javascript.jscomp.Scope.Var var = t.getScope().getVar(name);
					if (isConstant(var)) {
						if (initializedConstants.contains(var)) {
							reportError(t, n, name);
						}else {
							initializedConstants.add(var);
						}
					}
				}
				break;
			case com.google.javascript.rhino.Token.ASSIGN :
			case com.google.javascript.rhino.Token.ASSIGN_BITOR :
			case com.google.javascript.rhino.Token.ASSIGN_BITXOR :
			case com.google.javascript.rhino.Token.ASSIGN_BITAND :
			case com.google.javascript.rhino.Token.ASSIGN_LSH :
			case com.google.javascript.rhino.Token.ASSIGN_RSH :
			case com.google.javascript.rhino.Token.ASSIGN_URSH :
			case com.google.javascript.rhino.Token.ASSIGN_ADD :
			case com.google.javascript.rhino.Token.ASSIGN_SUB :
			case com.google.javascript.rhino.Token.ASSIGN_MUL :
			case com.google.javascript.rhino.Token.ASSIGN_DIV :
			case com.google.javascript.rhino.Token.ASSIGN_MOD :
				{
					com.google.javascript.rhino.Node lhs = n.getFirstChild();
					if ((lhs.getType()) == (com.google.javascript.rhino.Token.NAME)) {
						java.lang.String name = lhs.getString();
						com.google.javascript.jscomp.Scope.Var var = t.getScope().getVar(name);
						if (isConstant(var)) {
							if (initializedConstants.contains(var)) {
								reportError(t, n, name);
							}else {
								initializedConstants.add(var);
							}
						}
					}
					break;
				}
			case com.google.javascript.rhino.Token.INC :
			case com.google.javascript.rhino.Token.DEC :
				{
					com.google.javascript.rhino.Node lhs = n.getFirstChild();
					if ((lhs.getType()) == (com.google.javascript.rhino.Token.NAME)) {
						java.lang.String name = lhs.getString();
						com.google.javascript.jscomp.Scope.Var var = t.getScope().getVar(name);
						if (isConstant(var)) {
							reportError(t, n, name);
						}
					}
					break;
				}
		}
	}

	private boolean isConstant(com.google.javascript.jscomp.Scope.Var var) {
		return (var != null) && (var.isConst());
	}

	void reportError(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, java.lang.String name) {
		compiler.report(t.makeError(n, com.google.javascript.jscomp.ConstCheck.CONST_REASSIGNED_VALUE_ERROR, name));
	}
}


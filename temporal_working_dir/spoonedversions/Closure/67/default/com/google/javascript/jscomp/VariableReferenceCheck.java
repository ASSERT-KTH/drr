

package com.google.javascript.jscomp;


class VariableReferenceCheck implements com.google.javascript.jscomp.HotSwapCompilerPass {
	static final com.google.javascript.jscomp.DiagnosticType UNDECLARED_REFERENCE = com.google.javascript.jscomp.DiagnosticType.warning("JSC_REFERENCE_BEFORE_DECLARE", "Variable referenced before declaration: {0}");

	static final com.google.javascript.jscomp.DiagnosticType REDECLARED_VARIABLE = com.google.javascript.jscomp.DiagnosticType.warning("JSC_REDECLARED_VARIABLE", "Redeclared variable: {0}");

	static final com.google.javascript.jscomp.DiagnosticType AMBIGUOUS_FUNCTION_DECL = com.google.javascript.jscomp.DiagnosticType.disabled("AMBIGUOUS_FUNCTION_DECL", "Ambiguous use of a named function: {0}.");

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.CheckLevel checkLevel;

	private final java.util.Set<com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock> blocksWithDeclarations = com.google.common.collect.Sets.newHashSet();

	public VariableReferenceCheck(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.CheckLevel checkLevel) {
		this.compiler = compiler;
		this.checkLevel = checkLevel;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.ReferenceCollectingCallback callback = new com.google.javascript.jscomp.ReferenceCollectingCallback(compiler, new com.google.javascript.jscomp.VariableReferenceCheck.ReferenceCheckingBehavior());
		callback.process(externs, root);
	}

	@java.lang.Override
	public void hotSwapScript(com.google.javascript.rhino.Node scriptRoot) {
		com.google.javascript.jscomp.ReferenceCollectingCallback callback = new com.google.javascript.jscomp.ReferenceCollectingCallback(compiler, new com.google.javascript.jscomp.VariableReferenceCheck.ReferenceCheckingBehavior());
		callback.hotSwapScript(scriptRoot);
	}

	private class ReferenceCheckingBehavior implements com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior {
		@java.lang.Override
		public void afterExitScope(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap) {
			for (java.util.Iterator<com.google.javascript.jscomp.Scope.Var> it = t.getScope().getVars(); it.hasNext();) {
				com.google.javascript.jscomp.Scope.Var v = it.next();
				checkVar(t, v, referenceMap.getReferences(v).references);
			}
		}

		private void checkVar(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.jscomp.Scope.Var v, java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> references) {
			blocksWithDeclarations.clear();
			boolean isDeclaredInScope = false;
			boolean isUnhoistedNamedFunction = false;
			com.google.javascript.jscomp.ReferenceCollectingCallback.Reference hoistedFn = null;
			for (com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference : references) {
				if (reference.isHoistedFunction()) {
					blocksWithDeclarations.add(reference.getBasicBlock());
					isDeclaredInScope = true;
					hoistedFn = reference;
					break;
				}else
					if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(reference.getNameNode().getParent())) {
						isUnhoistedNamedFunction = true;
					}
				
			}
			for (com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference : references) {
				if (reference == hoistedFn) {
					continue;
				}
				com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock basicBlock = reference.getBasicBlock();
				boolean isDeclaration = reference.isDeclaration();
				if (isDeclaration) {
					for (com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock declaredBlock : blocksWithDeclarations) {
						if (declaredBlock.provablyExecutesBefore(basicBlock)) {
							compiler.report(com.google.javascript.jscomp.JSError.make(reference.getSourceName(), reference.getNameNode(), checkLevel, com.google.javascript.jscomp.VariableReferenceCheck.REDECLARED_VARIABLE, v.name));
							break;
						}
					}
				}
				if ((isUnhoistedNamedFunction && (!isDeclaration)) && isDeclaredInScope) {
					for (com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock declaredBlock : blocksWithDeclarations) {
						if (!(declaredBlock.provablyExecutesBefore(basicBlock))) {
							compiler.report(com.google.javascript.jscomp.JSError.make(reference.getSourceName(), reference.getNameNode(), com.google.javascript.jscomp.VariableReferenceCheck.AMBIGUOUS_FUNCTION_DECL, v.name));
							break;
						}
					}
				}
				if ((!isDeclaration) && (!isDeclaredInScope)) {
					com.google.javascript.rhino.Node grandparent = reference.getGrandparent();
					if (((grandparent.getType()) == (com.google.javascript.rhino.Token.NAME)) && ((grandparent.getString()) == (v.name))) {
						continue;
					}
					if ((reference.getScope()) == (v.scope)) {
						compiler.report(com.google.javascript.jscomp.JSError.make(reference.getSourceName(), reference.getNameNode(), checkLevel, com.google.javascript.jscomp.VariableReferenceCheck.UNDECLARED_REFERENCE, v.name));
					}
				}
				if (isDeclaration) {
					blocksWithDeclarations.add(basicBlock);
					isDeclaredInScope = true;
				}
			}
		}
	}
}




package com.google.javascript.jscomp;


class MarkNoSideEffectCalls implements com.google.javascript.jscomp.CompilerPass {
	static final com.google.javascript.jscomp.DiagnosticType INVALID_NO_SIDE_EFFECT_ANNOTATION = com.google.javascript.jscomp.DiagnosticType.error("JSC_INVALID_NO_SIDE_EFFECT_ANNOTATION", "@nosideeffects may only appear in externs files.");

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.Set<com.google.javascript.rhino.Node> noSideEffectFunctionNames;

	MarkNoSideEffectCalls(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
		this.noSideEffectFunctionNames = com.google.common.collect.Sets.newHashSet();
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.SimpleDefinitionFinder defFinder = new com.google.javascript.jscomp.SimpleDefinitionFinder(compiler);
		defFinder.process(externs, root);
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, externs, new com.google.javascript.jscomp.MarkNoSideEffectCalls.GatherNoSideEffectFunctions(true));
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.MarkNoSideEffectCalls.GatherNoSideEffectFunctions(false));
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.MarkNoSideEffectCalls.SetNoSideEffectCallProperty(defFinder));
	}

	private static boolean definitionTypeContainsFunctionType(com.google.javascript.jscomp.DefinitionsRemover.Definition def) {
		com.google.javascript.rhino.Node rhs = def.getRValue();
		if (rhs == null) {
			return true;
		}
		switch (rhs.getType()) {
			case com.google.javascript.rhino.Token.ASSIGN :
			case com.google.javascript.rhino.Token.AND :
			case com.google.javascript.rhino.Token.CALL :
			case com.google.javascript.rhino.Token.GETPROP :
			case com.google.javascript.rhino.Token.GETELEM :
			case com.google.javascript.rhino.Token.FUNCTION :
			case com.google.javascript.rhino.Token.HOOK :
			case com.google.javascript.rhino.Token.NAME :
			case com.google.javascript.rhino.Token.NEW :
			case com.google.javascript.rhino.Token.OR :
				return true;
			default :
				return false;
		}
	}

	private static boolean hasNoSideEffectsAnnotation(com.google.javascript.rhino.Node node) {
		com.google.javascript.rhino.JSDocInfo docInfo = node.getJSDocInfo();
		return (docInfo != null) && (docInfo.isNoSideEffects());
	}

	private class GatherNoSideEffectFunctions extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		private final boolean inExterns;

		GatherNoSideEffectFunctions(boolean inExterns) {
			this.inExterns = inExterns;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal traversal, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
			if ((!(inExterns)) && (com.google.javascript.jscomp.MarkNoSideEffectCalls.hasNoSideEffectsAnnotation(node))) {
				traversal.report(node, com.google.javascript.jscomp.MarkNoSideEffectCalls.INVALID_NO_SIDE_EFFECT_ANNOTATION);
			}
			if (node.isGetProp()) {
				if ((parent.isExprResult()) && (com.google.javascript.jscomp.MarkNoSideEffectCalls.hasNoSideEffectsAnnotation(node))) {
					noSideEffectFunctionNames.add(node);
				}
			}else
				if (node.isFunction()) {
					boolean hasAnnotation = com.google.javascript.jscomp.MarkNoSideEffectCalls.hasNoSideEffectsAnnotation(node);
					java.util.List<com.google.javascript.rhino.Node> nameNodes = com.google.common.collect.Lists.newArrayList();
					nameNodes.add(node.getFirstChild());
					if (parent.isName()) {
						com.google.javascript.rhino.Node gramp = parent.getParent();
						if (((gramp.isVar()) && (gramp.hasOneChild())) && (com.google.javascript.jscomp.MarkNoSideEffectCalls.hasNoSideEffectsAnnotation(gramp))) {
							hasAnnotation = true;
						}
						nameNodes.add(parent);
					}else
						if (parent.isAssign()) {
							if (com.google.javascript.jscomp.MarkNoSideEffectCalls.hasNoSideEffectsAnnotation(parent)) {
								hasAnnotation = true;
							}
							nameNodes.add(parent.getFirstChild());
						}
					
					if (hasAnnotation) {
						noSideEffectFunctionNames.addAll(nameNodes);
					}
				}
			
		}
	}

	private class SetNoSideEffectCallProperty extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		private final com.google.javascript.jscomp.SimpleDefinitionFinder defFinder;

		SetNoSideEffectCallProperty(com.google.javascript.jscomp.SimpleDefinitionFinder defFinder) {
			this.defFinder = defFinder;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal traversal, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
			if ((!(node.isCall())) && (!(node.isNew()))) {
				return ;
			}
			java.util.Collection<com.google.javascript.jscomp.DefinitionsRemover.Definition> definitions = defFinder.getDefinitionsReferencedAt(node.getFirstChild());
			if (definitions == null) {
				return ;
			}
			for (com.google.javascript.jscomp.DefinitionsRemover.Definition def : definitions) {
				com.google.javascript.rhino.Node lValue = def.getLValue();
				com.google.common.base.Preconditions.checkNotNull(lValue);
				if ((!(noSideEffectFunctionNames.contains(lValue))) && (com.google.javascript.jscomp.MarkNoSideEffectCalls.definitionTypeContainsFunctionType(def))) {
					return ;
				}
			}
			node.setSideEffectFlags(com.google.javascript.rhino.Node.NO_SIDE_EFFECTS);
		}
	}
}


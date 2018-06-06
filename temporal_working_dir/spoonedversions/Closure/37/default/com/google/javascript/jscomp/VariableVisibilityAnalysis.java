

package com.google.javascript.jscomp;


class VariableVisibilityAnalysis implements com.google.javascript.jscomp.CompilerPass {
	enum VariableVisibility {
LOCAL, CAPTURED_LOCAL, PARAMETER, GLOBAL;	}

	private com.google.javascript.jscomp.AbstractCompiler compiler;

	private java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.VariableVisibilityAnalysis.VariableVisibility> visibilityByDeclaringNameNode;

	public VariableVisibilityAnalysis(com.google.javascript.jscomp.AbstractCompiler compiler) {
		com.google.javascript.jscomp.VariableVisibilityAnalysis.this.compiler = compiler;
		visibilityByDeclaringNameNode = com.google.common.collect.Maps.newHashMap();
	}

	public com.google.javascript.jscomp.VariableVisibilityAnalysis.VariableVisibility getVariableVisibility(com.google.javascript.rhino.Node declaringNameNode) {
		com.google.javascript.rhino.Node parent = declaringNameNode.getParent();
		com.google.common.base.Preconditions.checkArgument((((parent.isVar()) || (parent.isFunction())) || (parent.isParamList())));
		return visibilityByDeclaringNameNode.get(declaringNameNode);
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.ReferenceCollectingCallback callback = new com.google.javascript.jscomp.ReferenceCollectingCallback(compiler, com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, callback);
		for (com.google.javascript.jscomp.Scope.Var variable : callback.getAllSymbols()) {
			com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection = callback.getReferences(variable);
			com.google.javascript.jscomp.VariableVisibilityAnalysis.VariableVisibility visibility;
			if (com.google.javascript.jscomp.VariableVisibilityAnalysis.variableIsParameter(variable)) {
				visibility = com.google.javascript.jscomp.VariableVisibilityAnalysis.VariableVisibility.PARAMETER;
			}else
				if (variable.isLocal()) {
					if (referenceCollection.isEscaped()) {
						visibility = com.google.javascript.jscomp.VariableVisibilityAnalysis.VariableVisibility.CAPTURED_LOCAL;
					}else {
						visibility = com.google.javascript.jscomp.VariableVisibilityAnalysis.VariableVisibility.LOCAL;
					}
				}else
					if (variable.isGlobal()) {
						visibility = com.google.javascript.jscomp.VariableVisibilityAnalysis.VariableVisibility.GLOBAL;
					}else {
						throw new java.lang.IllegalStateException(("Un-handled variable visibility for " + variable));
					}
				
			
			visibilityByDeclaringNameNode.put(variable.getNameNode(), visibility);
		}
	}

	private static boolean variableIsParameter(com.google.javascript.jscomp.Scope.Var variable) {
		com.google.javascript.rhino.Node variableParent = variable.getParentNode();
		return (variableParent != null) && (variableParent.isParamList());
	}
}


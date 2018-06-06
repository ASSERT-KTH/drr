

package com.google.javascript.jscomp;


class RemoveUnusedPrototypeProperties implements com.google.javascript.jscomp.SpecializationAwareCompilerPass {
	private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.javascript.jscomp.RemoveUnusedPrototypeProperties.class.getName());

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final boolean canModifyExterns;

	private final boolean anchorUnusedVars;

	private com.google.javascript.jscomp.SpecializeModule.SpecializationState specializationState;

	RemoveUnusedPrototypeProperties(com.google.javascript.jscomp.AbstractCompiler compiler, boolean canModifyExterns, boolean anchorUnusedVars) {
		this.compiler = compiler;
		this.canModifyExterns = canModifyExterns;
		this.anchorUnusedVars = anchorUnusedVars;
	}

	@java.lang.Override
	public void enableSpecialization(com.google.javascript.jscomp.SpecializeModule.SpecializationState state) {
		com.google.javascript.jscomp.RemoveUnusedPrototypeProperties.this.specializationState = state;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externRoot, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.AnalyzePrototypeProperties analyzer = new com.google.javascript.jscomp.AnalyzePrototypeProperties(compiler, null, canModifyExterns, anchorUnusedVars);
		analyzer.process(externRoot, root);
		removeUnusedSymbols(analyzer.getAllNameInfo());
	}

	private void removeUnusedSymbols(java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> allNameInfo) {
		boolean changed = false;
		for (com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo : allNameInfo) {
			if (!(nameInfo.isReferenced())) {
				for (com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol declaration : nameInfo.getDeclarations()) {
					boolean canRemove = false;
					if ((specializationState) == null) {
						canRemove = true;
					}else {
						com.google.javascript.rhino.Node specializableFunction = getSpecializableFunctionFromSymbol(declaration);
						if (specializableFunction != null) {
							specializationState.reportRemovedFunction(specializableFunction, null);
							canRemove = true;
						}
					}
					if (canRemove) {
						declaration.remove();
						changed = true;
					}
				}
				com.google.javascript.jscomp.RemoveUnusedPrototypeProperties.logger.fine(("Removed unused prototype property: " + (nameInfo.name)));
			}
		}
		if (changed) {
			compiler.reportCodeChange();
		}
	}

	private com.google.javascript.rhino.Node getSpecializableFunctionFromSymbol(com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol symbol) {
		com.google.common.base.Preconditions.checkNotNull(specializationState);
		com.google.javascript.rhino.Node specializableFunction = null;
		if (symbol instanceof com.google.javascript.jscomp.AnalyzePrototypeProperties.GlobalFunction) {
			specializableFunction = ((com.google.javascript.jscomp.AnalyzePrototypeProperties.GlobalFunction) (symbol)).getFunctionNode();
		}else
			if (symbol instanceof com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty) {
				com.google.javascript.rhino.Node propertyValue = ((com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty) (symbol)).getValue();
				if (propertyValue.isFunction()) {
					specializableFunction = propertyValue;
				}
			}else
				if (symbol instanceof com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty) {
					return null;
				}else {
					com.google.common.base.Preconditions.checkState(false, "Should be unreachable.");
				}
			
		
		if ((specializableFunction != null) && (specializationState.canFixupFunction(specializableFunction))) {
			return specializableFunction;
		}else {
			return null;
		}
	}
}


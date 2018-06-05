

package com.google.javascript.jscomp;


public enum CompilationLevel {
WHITESPACE_ONLY, SIMPLE_OPTIMIZATIONS, ADVANCED_OPTIMIZATIONS;
	private CompilationLevel() {
	}

	public void setOptionsForCompilationLevel(com.google.javascript.jscomp.CompilerOptions options) {
		switch (com.google.javascript.jscomp.CompilationLevel.this) {
			case WHITESPACE_ONLY :
				com.google.javascript.jscomp.CompilationLevel.applyBasicCompilationOptions(options);
				break;
			case SIMPLE_OPTIMIZATIONS :
				com.google.javascript.jscomp.CompilationLevel.applySafeCompilationOptions(options);
				break;
			case ADVANCED_OPTIMIZATIONS :
				com.google.javascript.jscomp.CompilationLevel.applyFullCompilationOptions(options);
				break;
			default :
				throw new java.lang.RuntimeException("Unknown compilation level.");
		}
	}

	public void setDebugOptionsForCompilationLevel(com.google.javascript.jscomp.CompilerOptions options) {
		options.anonymousFunctionNaming = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.UNMAPPED;
		options.generatePseudoNames = true;
	}

	private static void applyBasicCompilationOptions(com.google.javascript.jscomp.CompilerOptions options) {
		options.skipAllCompilerPasses();
		options.setWarningLevel(com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC, com.google.javascript.jscomp.CheckLevel.OFF);
	}

	private static void applySafeCompilationOptions(com.google.javascript.jscomp.CompilerOptions options) {
		options.closurePass = true;
		options.variableRenaming = com.google.javascript.jscomp.VariableRenamingPolicy.LOCAL;
		options.inlineLocalVariables = true;
		options.flowSensitiveInlineVariables = true;
		options.inlineLocalFunctions = true;
		options.checkGlobalThisLevel = com.google.javascript.jscomp.CheckLevel.OFF;
		options.foldConstants = true;
		options.coalesceVariableNames = true;
		options.deadAssignmentElimination = true;
		options.collapseVariableDeclarations = true;
		options.convertToDottedProperties = true;
		options.labelRenaming = true;
		options.removeDeadCode = true;
		options.optimizeArgumentsArray = true;
		options.removeUnusedVars = false;
		options.removeUnusedLocalVars = true;
		options.setWarningLevel(com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC, com.google.javascript.jscomp.CheckLevel.OFF);
	}

	private static void applyFullCompilationOptions(com.google.javascript.jscomp.CompilerOptions options) {
		options.closurePass = true;
		options.foldConstants = true;
		options.coalesceVariableNames = true;
		options.deadAssignmentElimination = true;
		options.extractPrototypeMemberDeclarations = true;
		options.collapseVariableDeclarations = true;
		options.convertToDottedProperties = true;
		options.rewriteFunctionExpressions = true;
		options.labelRenaming = true;
		options.removeDeadCode = true;
		options.optimizeArgumentsArray = true;
		options.aliasKeywords = true;
		options.reserveRawExports = true;
		options.variableRenaming = com.google.javascript.jscomp.VariableRenamingPolicy.ALL;
		options.propertyRenaming = com.google.javascript.jscomp.PropertyRenamingPolicy.ALL_UNQUOTED;
		options.removeUnusedPrototypeProperties = true;
		options.removeUnusedPrototypePropertiesInExterns = true;
		options.collapseAnonymousFunctions = true;
		options.collapseProperties = true;
		options.checkGlobalThisLevel = com.google.javascript.jscomp.CheckLevel.WARNING;
		options.rewriteFunctionExpressions = true;
		options.smartNameRemoval = true;
		options.inlineConstantVars = true;
		options.inlineFunctions = true;
		options.inlineLocalFunctions = true;
		options.inlineGetters = true;
		options.inlineVariables = true;
		options.flowSensitiveInlineVariables = true;
		options.computeFunctionSideEffects = true;
		options.removeUnusedVars = true;
		options.removeUnusedLocalVars = true;
		options.crossModuleCodeMotion = true;
		options.crossModuleMethodMotion = true;
		options.devirtualizePrototypeMethods = true;
		options.optimizeParameters = true;
		options.optimizeReturns = true;
		options.optimizeCalls = true;
		options.setWarningLevel(com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC, com.google.javascript.jscomp.CheckLevel.WARNING);
	}
}


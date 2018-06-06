

package com.google.javascript.jscomp;


public enum WarningLevel {
QUIET, DEFAULT, VERBOSE;
	public void setOptionsForWarningLevel(com.google.javascript.jscomp.CompilerOptions options) {
		switch (com.google.javascript.jscomp.WarningLevel.this) {
			case QUIET :
				com.google.javascript.jscomp.WarningLevel.silenceAllWarnings(options);
				break;
			case DEFAULT :
				com.google.javascript.jscomp.WarningLevel.addDefaultWarnings(options);
				break;
			case VERBOSE :
				com.google.javascript.jscomp.WarningLevel.addVerboseWarnings(options);
				break;
			default :
				throw new java.lang.RuntimeException("Unknown warning level.");
		}
	}

	private static void silenceAllWarnings(com.google.javascript.jscomp.CompilerOptions options) {
		options.addWarningsGuard(new com.google.javascript.jscomp.ShowByPathWarningsGuard("the_longest_path_that_cannot_be_expressed_as_a_string"));
		options.checkRequires = com.google.javascript.jscomp.CheckLevel.OFF;
		options.checkProvides = com.google.javascript.jscomp.CheckLevel.OFF;
		options.checkMissingGetCssNameLevel = com.google.javascript.jscomp.CheckLevel.OFF;
		options.aggressiveVarCheck = com.google.javascript.jscomp.CheckLevel.OFF;
		options.checkTypes = false;
		options.setWarningLevel(com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES, com.google.javascript.jscomp.CheckLevel.OFF);
		options.checkUnreachableCode = com.google.javascript.jscomp.CheckLevel.OFF;
		options.checkMissingReturn = com.google.javascript.jscomp.CheckLevel.OFF;
		options.setWarningLevel(com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS, com.google.javascript.jscomp.CheckLevel.OFF);
		options.setWarningLevel(com.google.javascript.jscomp.DiagnosticGroups.CONST, com.google.javascript.jscomp.CheckLevel.OFF);
		options.setWarningLevel(com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY, com.google.javascript.jscomp.CheckLevel.OFF);
		options.checkGlobalNamesLevel = com.google.javascript.jscomp.CheckLevel.OFF;
		options.checkSuspiciousCode = false;
		options.checkGlobalThisLevel = com.google.javascript.jscomp.CheckLevel.OFF;
		options.setWarningLevel(com.google.javascript.jscomp.DiagnosticGroups.GLOBAL_THIS, com.google.javascript.jscomp.CheckLevel.OFF);
		options.setWarningLevel(com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT, com.google.javascript.jscomp.CheckLevel.OFF);
		options.checkCaja = false;
	}

	private static void addDefaultWarnings(com.google.javascript.jscomp.CompilerOptions options) {
		options.checkSuspiciousCode = true;
		options.checkUnreachableCode = com.google.javascript.jscomp.CheckLevel.WARNING;
		options.checkControlStructures = true;
	}

	private static void addVerboseWarnings(com.google.javascript.jscomp.CompilerOptions options) {
		com.google.javascript.jscomp.WarningLevel.addDefaultWarnings(options);
		options.checkSuspiciousCode = true;
		options.checkGlobalThisLevel = com.google.javascript.jscomp.CheckLevel.WARNING;
		options.checkSymbols = true;
		options.checkMissingReturn = com.google.javascript.jscomp.CheckLevel.WARNING;
		options.checkTypes = true;
		options.checkGlobalNamesLevel = com.google.javascript.jscomp.CheckLevel.WARNING;
		options.aggressiveVarCheck = com.google.javascript.jscomp.CheckLevel.WARNING;
		options.setWarningLevel(com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES, com.google.javascript.jscomp.CheckLevel.WARNING);
		options.setWarningLevel(com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED, com.google.javascript.jscomp.CheckLevel.WARNING);
	}
}


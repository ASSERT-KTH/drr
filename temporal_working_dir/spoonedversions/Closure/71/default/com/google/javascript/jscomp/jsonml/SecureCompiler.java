

package com.google.javascript.jscomp.jsonml;


public class SecureCompiler {
	private static final java.lang.String COMPILATION_UNCOMPLETED_MSG = "No compilation has been completed yet.";

	private static final java.lang.String COMPILATION_UNSUCCESSFUL_MSG = "The last compilation was not successful.";

	private static final java.lang.String COMPILATION_ALREADY_COMPLETED_MSG = "This instance has already compiled one source.";

	private com.google.javascript.jscomp.Compiler compiler;

	private com.google.javascript.jscomp.CompilerOptions options;

	private com.google.javascript.jscomp.jsonml.JsonMLAst sourceAst;

	private com.google.javascript.jscomp.jsonml.SecureCompiler.Report report;

	public SecureCompiler() {
		compiler = new com.google.javascript.jscomp.Compiler();
		options = getSecureCompilerOptions();
	}

	public com.google.javascript.jscomp.jsonml.JsonML getJsonML() {
		com.google.common.base.Preconditions.checkState(((report) != null), com.google.javascript.jscomp.jsonml.SecureCompiler.COMPILATION_UNCOMPLETED_MSG);
		com.google.common.base.Preconditions.checkState(report.success, com.google.javascript.jscomp.jsonml.SecureCompiler.COMPILATION_UNSUCCESSFUL_MSG);
		return sourceAst.convertToJsonML();
	}

	public java.lang.String getString() {
		com.google.common.base.Preconditions.checkState(((report) != null), com.google.javascript.jscomp.jsonml.SecureCompiler.COMPILATION_UNCOMPLETED_MSG);
		com.google.common.base.Preconditions.checkState(report.success, com.google.javascript.jscomp.jsonml.SecureCompiler.COMPILATION_UNSUCCESSFUL_MSG);
		return compiler.toSource();
	}

	public com.google.javascript.jscomp.jsonml.SecureCompiler.Report getReport() {
		com.google.common.base.Preconditions.checkState(((report) != null), com.google.javascript.jscomp.jsonml.SecureCompiler.COMPILATION_UNCOMPLETED_MSG);
		return report;
	}

	public void compile(com.google.javascript.jscomp.jsonml.JsonML source) {
		if ((report) != null) {
			throw new java.lang.IllegalStateException(com.google.javascript.jscomp.jsonml.SecureCompiler.COMPILATION_ALREADY_COMPLETED_MSG);
		}
		sourceAst = new com.google.javascript.jscomp.jsonml.JsonMLAst(source);
		com.google.javascript.jscomp.CompilerInput input = new com.google.javascript.jscomp.CompilerInput(sourceAst, "[[jsonmlsource]]", false);
		com.google.javascript.jscomp.JSModule module = new com.google.javascript.jscomp.JSModule("[[jsonmlmodule]]");
		module.add(input);
		com.google.javascript.jscomp.Result result = compiler.compile(new com.google.javascript.jscomp.JSSourceFile[]{  }, new com.google.javascript.jscomp.JSModule[]{ module }, options);
		report = generateReport(result);
	}

	private com.google.javascript.jscomp.CompilerOptions getSecureCompilerOptions() {
		com.google.javascript.jscomp.CompilerOptions options = new com.google.javascript.jscomp.CompilerOptions();
		options.variableRenaming = com.google.javascript.jscomp.VariableRenamingPolicy.OFF;
		options.inlineLocalVariables = true;
		options.inlineLocalFunctions = true;
		options.checkGlobalThisLevel = com.google.javascript.jscomp.CheckLevel.OFF;
		options.coalesceVariableNames = true;
		options.deadAssignmentElimination = true;
		options.collapseVariableDeclarations = true;
		options.convertToDottedProperties = true;
		options.labelRenaming = true;
		options.removeDeadCode = true;
		options.optimizeArgumentsArray = true;
		options.removeUnusedVars = false;
		options.removeUnusedLocalVars = true;
		return options;
	}

	public void enableFoldConstant() {
		options.foldConstants = true;
	}

	com.google.javascript.jscomp.jsonml.SecureCompiler.Report generateReport(com.google.javascript.jscomp.Result result) {
		if (result == null) {
			return null;
		}
		java.util.ArrayList<com.google.javascript.jscomp.jsonml.JsonMLError> errors = com.google.common.collect.Lists.newArrayList();
		for (com.google.javascript.jscomp.JSError error : result.errors) {
			errors.add(com.google.javascript.jscomp.jsonml.JsonMLError.make(error, sourceAst));
		}
		java.util.ArrayList<com.google.javascript.jscomp.jsonml.JsonMLError> warnings = com.google.common.collect.Lists.newArrayList();
		for (com.google.javascript.jscomp.JSError warning : result.warnings) {
			warnings.add(com.google.javascript.jscomp.jsonml.JsonMLError.make(warning, sourceAst));
		}
		return new com.google.javascript.jscomp.jsonml.SecureCompiler.Report(errors.toArray(new com.google.javascript.jscomp.jsonml.JsonMLError[0]), warnings.toArray(new com.google.javascript.jscomp.jsonml.JsonMLError[0]));
	}

	public class Report {
		private final boolean success;

		private final com.google.javascript.jscomp.jsonml.JsonMLError[] errors;

		private final com.google.javascript.jscomp.jsonml.JsonMLError[] warnings;

		private Report(com.google.javascript.jscomp.jsonml.JsonMLError[] errors, com.google.javascript.jscomp.jsonml.JsonMLError[] warnings) {
			this.success = (errors.length) == 0;
			this.errors = errors;
			this.warnings = warnings;
		}

		public boolean isSuccessful() {
			return success;
		}

		public com.google.javascript.jscomp.jsonml.JsonMLError[] getErrors() {
			return errors;
		}

		public com.google.javascript.jscomp.jsonml.JsonMLError[] getWarnings() {
			return warnings;
		}
	}
}


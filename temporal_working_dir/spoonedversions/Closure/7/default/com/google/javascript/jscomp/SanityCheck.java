

package com.google.javascript.jscomp;


class SanityCheck implements com.google.javascript.jscomp.CompilerPass {
	static final com.google.javascript.jscomp.DiagnosticType CANNOT_PARSE_GENERATED_CODE = com.google.javascript.jscomp.DiagnosticType.error("JSC_CANNOT_PARSE_GENERATED_CODE", "Internal compiler error. Cannot parse generated code: {0}");

	static final com.google.javascript.jscomp.DiagnosticType GENERATED_BAD_CODE = com.google.javascript.jscomp.DiagnosticType.error("JSC_GENERATED_BAD_CODE", ("Internal compiler error. Generated bad code." + ((("----------------------------------------\n" + "Expected:\n{0}\n") + "----------------------------------------\n") + "Actual:\n{1}")));

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.AstValidator astValidator = new com.google.javascript.jscomp.AstValidator();

	SanityCheck(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		sanityCheckAst(externs, root);
		sanityCheckNormalization(externs, root);
		sanityCheckCodeGeneration(root);
		sanityCheckVars(externs, root);
	}

	private void sanityCheckAst(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		astValidator.validateCodeRoot(externs);
		astValidator.validateCodeRoot(root);
	}

	private void sanityCheckVars(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		if (compiler.getLifeCycleStage().isNormalized()) {
			new com.google.javascript.jscomp.VarCheck(compiler, true).process(externs, root);
		}
	}

	private com.google.javascript.rhino.Node sanityCheckCodeGeneration(com.google.javascript.rhino.Node root) {
		if (compiler.hasHaltingErrors()) {
			return null;
		}
		java.lang.String source = compiler.toSource(root);
		com.google.javascript.rhino.Node root2 = compiler.parseSyntheticCode(source);
		if (compiler.hasHaltingErrors()) {
			compiler.report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.SanityCheck.CANNOT_PARSE_GENERATED_CODE, com.google.javascript.jscomp.Strings.truncateAtMaxLength(source, 100, true)));
			throw new java.lang.IllegalStateException("Sanity Check failed");
		}
		java.lang.String source2 = compiler.toSource(root2);
		if (!(source.equals(source2))) {
			compiler.report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.SanityCheck.GENERATED_BAD_CODE, source, source2));
			throw new java.lang.IllegalStateException("Sanity Check failed");
		}
		return root2;
	}

	private void sanityCheckNormalization(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.CodeChangeHandler handler = new com.google.javascript.jscomp.CodeChangeHandler.ForbiddenChange();
		compiler.addChangeHandler(handler);
		new com.google.javascript.jscomp.PrepareAst(compiler, true).process(null, root);
		if (compiler.getLifeCycleStage().isNormalized()) {
			new com.google.javascript.jscomp.Normalize(compiler, true).process(externs, root);
			if (compiler.getLifeCycleStage().isNormalizedUnobfuscated()) {
				boolean checkUserDeclarations = true;
				com.google.javascript.jscomp.CompilerPass pass = new com.google.javascript.jscomp.Normalize.VerifyConstants(compiler, checkUserDeclarations);
				pass.process(externs, root);
			}
		}
		compiler.removeChangeHandler(handler);
	}
}


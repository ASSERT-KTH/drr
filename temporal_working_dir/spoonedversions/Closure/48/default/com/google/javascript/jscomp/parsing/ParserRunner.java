

package com.google.javascript.jscomp.parsing;


public class ParserRunner {
	private static final java.lang.String configResource = "com.google.javascript.jscomp.parsing.ParserConfig";

	private static java.util.Set<java.lang.String> annotationNames = null;

	private static java.util.Set<java.lang.String> suppressionNames = null;

	private ParserRunner() {
	}

	@java.lang.Deprecated
	public static com.google.javascript.jscomp.parsing.Config createConfig(boolean isIdeMode) {
		return com.google.javascript.jscomp.parsing.ParserRunner.createConfig(isIdeMode, com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT3, false);
	}

	public static com.google.javascript.jscomp.parsing.Config createConfig(boolean isIdeMode, com.google.javascript.jscomp.parsing.Config.LanguageMode languageMode, boolean acceptConstKeyword) {
		return com.google.javascript.jscomp.parsing.ParserRunner.createConfig(isIdeMode, languageMode, acceptConstKeyword, null);
	}

	public static com.google.javascript.jscomp.parsing.Config createConfig(boolean isIdeMode, com.google.javascript.jscomp.parsing.Config.LanguageMode languageMode, boolean acceptConstKeyword, java.util.Set<java.lang.String> extraAnnotationNames) {
		com.google.javascript.jscomp.parsing.ParserRunner.initResourceConfig();
		java.util.Set<java.lang.String> effectiveAnnotationNames;
		if (extraAnnotationNames == null) {
			effectiveAnnotationNames = com.google.javascript.jscomp.parsing.ParserRunner.annotationNames;
		}else {
			effectiveAnnotationNames = new java.util.HashSet<java.lang.String>(com.google.javascript.jscomp.parsing.ParserRunner.annotationNames);
			effectiveAnnotationNames.addAll(extraAnnotationNames);
		}
		return new com.google.javascript.jscomp.parsing.Config(effectiveAnnotationNames, com.google.javascript.jscomp.parsing.ParserRunner.suppressionNames, isIdeMode, languageMode, acceptConstKeyword);
	}

	private static synchronized void initResourceConfig() {
		if ((com.google.javascript.jscomp.parsing.ParserRunner.annotationNames) != null) {
			return ;
		}
		java.util.ResourceBundle config = java.util.ResourceBundle.getBundle(com.google.javascript.jscomp.parsing.ParserRunner.configResource);
		com.google.javascript.jscomp.parsing.ParserRunner.annotationNames = com.google.javascript.jscomp.parsing.ParserRunner.extractList(config.getString("jsdoc.annotations"));
		com.google.javascript.jscomp.parsing.ParserRunner.suppressionNames = com.google.javascript.jscomp.parsing.ParserRunner.extractList(config.getString("jsdoc.suppressions"));
	}

	private static java.util.Set<java.lang.String> extractList(java.lang.String configProp) {
		java.lang.String[] names = configProp.split(",");
		java.util.Set<java.lang.String> trimmedNames = com.google.common.collect.Sets.newHashSet();
		for (java.lang.String name : names) {
			trimmedNames.add(name.trim());
		}
		return com.google.common.collect.ImmutableSet.copyOf(trimmedNames);
	}

	public static com.google.javascript.rhino.Node parse(com.google.javascript.rhino.jstype.StaticSourceFile sourceFile, java.lang.String sourceString, com.google.javascript.jscomp.parsing.Config config, com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter, java.util.logging.Logger logger) throws java.io.IOException {
		com.google.javascript.jscomp.mozilla.rhino.Context cx = com.google.javascript.jscomp.mozilla.rhino.Context.enter();
		cx.setErrorReporter(errorReporter);
		cx.setLanguageVersion(com.google.javascript.jscomp.mozilla.rhino.Context.VERSION_1_5);
		com.google.javascript.jscomp.mozilla.rhino.CompilerEnvirons compilerEnv = new com.google.javascript.jscomp.mozilla.rhino.CompilerEnvirons();
		compilerEnv.initFromContext(cx);
		compilerEnv.setRecordingComments(true);
		compilerEnv.setRecordingLocalJsDocComments(true);
		compilerEnv.setWarnTrailingComma(((config.languageMode) == (com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT3)));
		if ((config.isIdeMode) || ((config.languageMode) != (com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT3))) {
			compilerEnv.setReservedKeywordAsIdentifier(true);
			compilerEnv.setAllowKeywordAsObjectPropertyName(true);
		}
		if (config.isIdeMode) {
			compilerEnv.setAllowMemberExprAsFunctionName(true);
		}
		compilerEnv.setIdeMode(config.isIdeMode);
		com.google.javascript.jscomp.mozilla.rhino.Parser p = new com.google.javascript.jscomp.mozilla.rhino.Parser(compilerEnv, errorReporter);
		com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot = null;
		try {
			astRoot = p.parse(sourceString, sourceFile.getName(), 1);
		} catch (com.google.javascript.jscomp.mozilla.rhino.EvaluatorException e) {
			logger.info(((("Error parsing " + (sourceFile.getName())) + ": ") + (e.getMessage())));
		} finally {
			com.google.javascript.jscomp.mozilla.rhino.Context.exit();
		}
		com.google.javascript.rhino.Node root = null;
		if (astRoot != null) {
			root = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot, sourceFile, sourceString, config, errorReporter);
			root.setIsSyntheticBlock(true);
		}
		return root;
	}
}


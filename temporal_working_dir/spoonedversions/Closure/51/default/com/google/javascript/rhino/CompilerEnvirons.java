

package com.google.javascript.rhino;


public class CompilerEnvirons {
	public CompilerEnvirons() {
		languageVersion = com.google.javascript.rhino.Context.VERSION_DEFAULT;
		generateDebugInfo = true;
		useDynamicScope = false;
		reservedKeywordAsIdentifier = false;
		allowMemberExprAsFunctionName = false;
		xmlAvailable = true;
		optimizationLevel = 0;
		generatingSource = true;
		strictMode = false;
		warningAsError = false;
		parseJSDocDocumentation = false;
	}

	public void initFromContext(com.google.javascript.rhino.Context cx) {
		setErrorReporter(cx.getErrorReporter());
		com.google.javascript.rhino.CompilerEnvirons.this.languageVersion = cx.getLanguageVersion();
		useDynamicScope = cx.compileFunctionsWithDynamicScopeFlag;
		generateDebugInfo = (!(cx.isGeneratingDebugChanged())) || (cx.isGeneratingDebug());
		reservedKeywordAsIdentifier = cx.hasFeature(com.google.javascript.rhino.Context.FEATURE_RESERVED_KEYWORD_AS_IDENTIFIER);
		allowMemberExprAsFunctionName = cx.hasFeature(com.google.javascript.rhino.Context.FEATURE_MEMBER_EXPR_AS_FUNCTION_NAME);
		strictMode = cx.hasFeature(com.google.javascript.rhino.Context.FEATURE_STRICT_MODE);
		warningAsError = cx.hasFeature(com.google.javascript.rhino.Context.FEATURE_WARNING_AS_ERROR);
		xmlAvailable = cx.hasFeature(com.google.javascript.rhino.Context.FEATURE_E4X);
		optimizationLevel = cx.getOptimizationLevel();
		generatingSource = cx.isGeneratingSource();
		activationNames = cx.activationNames;
	}

	public final com.google.javascript.rhino.ErrorReporter getErrorReporter() {
		return errorReporter;
	}

	public void setErrorReporter(com.google.javascript.rhino.ErrorReporter errorReporter) {
		if (errorReporter == null)
			throw new java.lang.IllegalArgumentException();
		
		com.google.javascript.rhino.CompilerEnvirons.this.errorReporter = errorReporter;
	}

	public final int getLanguageVersion() {
		return languageVersion;
	}

	public void setLanguageVersion(int languageVersion) {
		com.google.javascript.rhino.Context.checkLanguageVersion(languageVersion);
		com.google.javascript.rhino.CompilerEnvirons.this.languageVersion = languageVersion;
	}

	public final boolean isGenerateDebugInfo() {
		return generateDebugInfo;
	}

	public void setGenerateDebugInfo(boolean flag) {
		com.google.javascript.rhino.CompilerEnvirons.this.generateDebugInfo = flag;
	}

	public final boolean isUseDynamicScope() {
		return useDynamicScope;
	}

	public final boolean isReservedKeywordAsIdentifier() {
		return reservedKeywordAsIdentifier;
	}

	public void setReservedKeywordAsIdentifier(boolean flag) {
		reservedKeywordAsIdentifier = flag;
	}

	public final boolean isAllowMemberExprAsFunctionName() {
		return allowMemberExprAsFunctionName;
	}

	public void setAllowMemberExprAsFunctionName(boolean flag) {
		allowMemberExprAsFunctionName = flag;
	}

	public final boolean isXmlAvailable() {
		return xmlAvailable;
	}

	public void setXmlAvailable(boolean flag) {
		xmlAvailable = flag;
	}

	public final int getOptimizationLevel() {
		return optimizationLevel;
	}

	public void setOptimizationLevel(int level) {
		com.google.javascript.rhino.Context.checkOptimizationLevel(level);
		com.google.javascript.rhino.CompilerEnvirons.this.optimizationLevel = level;
	}

	public boolean getAnnotateTypes() {
		return annotateTypes;
	}

	public void setAnnotateTypes(boolean flag) {
		annotateTypes = flag;
	}

	public final boolean getParseJSDocDocumentation() {
		return parseJSDocDocumentation;
	}

	public void setParseJSDocDocumentation(boolean flag) {
		parseJSDocDocumentation = flag;
	}

	public boolean getParseJSDoc() {
		return parseJSDoc;
	}

	public void setParseJSDoc(boolean flag) {
		parseJSDoc = flag;
	}

	public final boolean isGeneratingSource() {
		return generatingSource;
	}

	public final boolean isStrictMode() {
		return strictMode;
	}

	public final boolean reportWarningAsError() {
		return warningAsError;
	}

	public void setGeneratingSource(boolean generatingSource) {
		com.google.javascript.rhino.CompilerEnvirons.this.generatingSource = generatingSource;
	}

	private com.google.javascript.rhino.ErrorReporter errorReporter;

	private int languageVersion;

	private boolean generateDebugInfo;

	private boolean useDynamicScope;

	private boolean reservedKeywordAsIdentifier;

	private boolean allowMemberExprAsFunctionName;

	private boolean xmlAvailable;

	private int optimizationLevel;

	private boolean generatingSource;

	private boolean strictMode;

	private boolean warningAsError;

	private boolean annotateTypes;

	private boolean parseJSDoc;

	private boolean parseJSDocDocumentation;

	java.util.Hashtable<java.lang.Object, java.lang.Object> activationNames;
}


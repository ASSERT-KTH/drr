

package com.google.javascript.jscomp;


public abstract class AbstractCompiler implements com.google.javascript.jscomp.SourceExcerptProvider {
	static final com.google.javascript.jscomp.DiagnosticType READ_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_READ_ERROR", "Cannot read: {0}");

	public abstract com.google.javascript.jscomp.CompilerInput getInput(java.lang.String sourceName);

	abstract com.google.javascript.jscomp.CompilerInput newExternInput(java.lang.String name);

	abstract com.google.javascript.jscomp.JSModuleGraph getModuleGraph();

	abstract java.util.List<com.google.javascript.jscomp.CompilerInput> getInputsInOrder();

	public abstract com.google.javascript.rhino.jstype.JSTypeRegistry getTypeRegistry();

	abstract com.google.javascript.jscomp.ScopeCreator getScopeCreator();

	public abstract com.google.javascript.jscomp.Scope getTopScope();

	public abstract void report(com.google.javascript.jscomp.JSError error);

	abstract void throwInternalError(java.lang.String msg, java.lang.Exception cause);

	public abstract com.google.javascript.jscomp.CodingConvention getCodingConvention();

	public abstract void reportCodeChange();

	abstract void addToDebugLog(java.lang.String message);

	abstract void setCssRenamingMap(com.google.javascript.jscomp.CssRenamingMap map);

	abstract com.google.javascript.jscomp.CssRenamingMap getCssRenamingMap();

	abstract com.google.javascript.rhino.Node getNodeForCodeInsertion(com.google.javascript.jscomp.JSModule module);

	abstract com.google.javascript.jscomp.TypeValidator getTypeValidator();

	abstract com.google.javascript.rhino.Node parseSyntheticCode(java.lang.String code);

	abstract com.google.javascript.rhino.Node parseSyntheticCode(java.lang.String filename, java.lang.String code);

	abstract com.google.javascript.rhino.Node parseTestCode(java.lang.String code);

	abstract java.lang.String toSource(com.google.javascript.rhino.Node root);

	abstract com.google.javascript.jscomp.mozilla.rhino.ErrorReporter getDefaultErrorReporter();

	public abstract com.google.javascript.jscomp.ReverseAbstractInterpreter getReverseAbstractInterpreter();

	abstract boolean isNormalized();

	abstract com.google.common.base.Supplier<java.lang.String> getUniqueNameIdSupplier();

	abstract boolean hasHaltingErrors();

	abstract void addChangeHandler(com.google.javascript.jscomp.CodeChangeHandler handler);

	abstract void removeChangeHandler(com.google.javascript.jscomp.CodeChangeHandler handler);

	abstract boolean isIdeMode();

	abstract com.google.javascript.jscomp.parsing.Config getParserConfig();

	abstract boolean isTypeCheckingEnabled();

	abstract void prepareAst(com.google.javascript.rhino.Node root);

	public abstract com.google.javascript.jscomp.ErrorManager getErrorManager();

	abstract void setNormalized();

	abstract void setUnnormalized();

	abstract boolean areNodesEqualForInlining(com.google.javascript.rhino.Node n1, com.google.javascript.rhino.Node n2);

	abstract void setHasRegExpGlobalReferences(boolean references);

	abstract boolean hasRegExpGlobalReferences();

	abstract com.google.javascript.jscomp.CheckLevel getErrorLevel(com.google.javascript.jscomp.JSError error);
}


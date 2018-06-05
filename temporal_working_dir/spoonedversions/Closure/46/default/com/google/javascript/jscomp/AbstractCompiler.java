

package com.google.javascript.jscomp;


public abstract class AbstractCompiler implements com.google.javascript.jscomp.SourceExcerptProvider {
	static final com.google.javascript.jscomp.DiagnosticType READ_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_READ_ERROR", "Cannot read: {0}");

	private com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage stage = com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage.RAW;

	public abstract com.google.javascript.jscomp.CompilerInput getInput(com.google.javascript.rhino.InputId inputId);

	abstract com.google.javascript.jscomp.CompilerInput newExternInput(java.lang.String name);

	abstract com.google.javascript.jscomp.JSModuleGraph getModuleGraph();

	abstract java.util.List<com.google.javascript.jscomp.CompilerInput> getInputsInOrder();

	public abstract com.google.javascript.rhino.jstype.JSTypeRegistry getTypeRegistry();

	abstract com.google.javascript.jscomp.ScopeCreator getTypedScopeCreator();

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

	com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage getLifeCycleStage() {
		return stage;
	}

	abstract com.google.common.base.Supplier<java.lang.String> getUniqueNameIdSupplier();

	abstract boolean hasHaltingErrors();

	abstract void addChangeHandler(com.google.javascript.jscomp.CodeChangeHandler handler);

	abstract void removeChangeHandler(com.google.javascript.jscomp.CodeChangeHandler handler);

	abstract boolean isIdeMode();

	abstract boolean acceptEcmaScript5();

	abstract boolean acceptConstKeyword();

	abstract com.google.javascript.jscomp.parsing.Config getParserConfig();

	abstract boolean isTypeCheckingEnabled();

	abstract void prepareAst(com.google.javascript.rhino.Node root);

	public abstract com.google.javascript.jscomp.ErrorManager getErrorManager();

	void setLifeCycleStage(com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage stage) {
		com.google.javascript.jscomp.AbstractCompiler.this.stage = stage;
	}

	abstract boolean areNodesEqualForInlining(com.google.javascript.rhino.Node n1, com.google.javascript.rhino.Node n2);

	abstract void setHasRegExpGlobalReferences(boolean references);

	abstract boolean hasRegExpGlobalReferences();

	abstract com.google.javascript.jscomp.CheckLevel getErrorLevel(com.google.javascript.jscomp.JSError error);

	static enum LifeCycleStage {
RAW, NORMALIZED, NORMALIZED_OBFUSCATED;
		boolean isNormalized() {
			return ((com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage.this) == (com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage.NORMALIZED)) || ((com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage.this) == (com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED));
		}

		boolean isNormalizedUnobfuscated() {
			return (com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage.this) == (com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage.NORMALIZED);
		}

		boolean isNormalizedObfuscated() {
			return (com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage.this) == (com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED);
		}
	}

	abstract void process(com.google.javascript.jscomp.CompilerPass pass);

	abstract com.google.javascript.rhino.Node getRoot();

	abstract void updateGlobalVarReferences(java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> refMapPatch, com.google.javascript.rhino.Node collectionRoot);

	abstract com.google.javascript.jscomp.GlobalVarReferenceMap getGlobalVarReferences();
}




package com.google.javascript.jscomp;


public class CompilerOptions implements java.io.Serializable , java.lang.Cloneable {
	public enum Reach {
ALL, LOCAL_ONLY, NONE;	}

	private static final long serialVersionUID = 7L;

	private com.google.javascript.jscomp.CompilerOptions.LanguageMode languageIn;

	private com.google.javascript.jscomp.CompilerOptions.LanguageMode languageOut;

	boolean acceptConstKeyword;

	private boolean assumeStrictThis;

	public boolean ideMode;

	boolean inferTypes;

	boolean skipAllPasses;

	boolean nameAnonymousFunctionsOnly;

	com.google.javascript.jscomp.CompilerOptions.DevMode devMode;

	com.google.javascript.jscomp.DependencyOptions dependencyOptions = new com.google.javascript.jscomp.DependencyOptions();

	public transient com.google.javascript.jscomp.MessageBundle messageBundle = null;

	public boolean checkSymbols;

	public com.google.javascript.jscomp.CheckLevel aggressiveVarCheck;

	public void setAggressiveVarCheck(com.google.javascript.jscomp.CheckLevel level) {
		com.google.javascript.jscomp.CompilerOptions.this.aggressiveVarCheck = level;
	}

	public boolean checkSuspiciousCode;

	public boolean checkControlStructures;

	public boolean checkTypes;

	boolean tightenTypes;

	public void setTightenTypes(boolean tighten) {
		com.google.javascript.jscomp.CompilerOptions.this.tightenTypes = tighten;
	}

	public com.google.javascript.jscomp.CheckLevel reportMissingOverride;

	public void setReportMissingOverride(com.google.javascript.jscomp.CheckLevel level) {
		com.google.javascript.jscomp.CompilerOptions.this.reportMissingOverride = level;
	}

	com.google.javascript.jscomp.CheckLevel reportUnknownTypes;

	public void setReportUnknownTypes(com.google.javascript.jscomp.CheckLevel level) {
		com.google.javascript.jscomp.CompilerOptions.this.reportUnknownTypes = level;
	}

	public com.google.javascript.jscomp.CheckLevel checkRequires;

	public void setCheckRequires(com.google.javascript.jscomp.CheckLevel level) {
		com.google.javascript.jscomp.CompilerOptions.this.checkRequires = level;
	}

	public com.google.javascript.jscomp.CheckLevel checkProvides;

	public void setCheckProvides(com.google.javascript.jscomp.CheckLevel level) {
		com.google.javascript.jscomp.CompilerOptions.this.checkProvides = level;
	}

	public com.google.javascript.jscomp.CheckLevel checkGlobalNamesLevel;

	public void setCheckGlobalNamesLevel(com.google.javascript.jscomp.CheckLevel level) {
		com.google.javascript.jscomp.CompilerOptions.this.checkGlobalNamesLevel = level;
	}

	public com.google.javascript.jscomp.CheckLevel brokenClosureRequiresLevel;

	public void setBrokenClosureRequiresLevel(com.google.javascript.jscomp.CheckLevel level) {
		com.google.javascript.jscomp.CompilerOptions.this.brokenClosureRequiresLevel = level;
	}

	public com.google.javascript.jscomp.CheckLevel checkGlobalThisLevel;

	public void setCheckGlobalThisLevel(com.google.javascript.jscomp.CheckLevel level) {
		com.google.javascript.jscomp.CompilerOptions.this.checkGlobalThisLevel = level;
	}

	public com.google.javascript.jscomp.CheckLevel checkMissingGetCssNameLevel;

	public void setCheckMissingGetCssNameLevel(com.google.javascript.jscomp.CheckLevel level) {
		com.google.javascript.jscomp.CompilerOptions.this.checkMissingGetCssNameLevel = level;
	}

	public java.lang.String checkMissingGetCssNameBlacklist;

	boolean checkCaja;

	public void setCheckCaja(boolean check) {
		checkCaja = check;
	}

	java.util.Set<java.lang.String> extraAnnotationNames;

	public boolean foldConstants;

	public boolean deadAssignmentElimination;

	public boolean inlineConstantVars;

	public boolean inlineFunctions;

	public boolean inlineLocalFunctions;

	boolean assumeClosuresOnlyCaptureReferences;

	public boolean crossModuleCodeMotion;

	public boolean coalesceVariableNames;

	public boolean crossModuleMethodMotion;

	public boolean inlineGetters;

	public boolean inlineVariables;

	boolean inlineLocalVariables;

	public boolean flowSensitiveInlineVariables;

	public boolean smartNameRemoval;

	public boolean removeDeadCode;

	public com.google.javascript.jscomp.CheckLevel checkUnreachableCode;

	public void setCheckUnreachableCode(com.google.javascript.jscomp.CheckLevel level) {
		com.google.javascript.jscomp.CompilerOptions.this.checkUnreachableCode = level;
	}

	public com.google.javascript.jscomp.CheckLevel checkMissingReturn;

	public void setCheckMissingReturn(com.google.javascript.jscomp.CheckLevel level) {
		com.google.javascript.jscomp.CompilerOptions.this.checkMissingReturn = level;
	}

	public boolean extractPrototypeMemberDeclarations;

	public boolean removeEmptyFunctions;

	public boolean removeUnusedPrototypeProperties;

	public boolean removeUnusedPrototypePropertiesInExterns;

	public boolean removeUnusedVars;

	public boolean removeUnusedLocalVars;

	public boolean aliasExternals;

	java.lang.String aliasableGlobals;

	public void setAliasableGlobals(java.lang.String names) {
		aliasableGlobals = names;
	}

	java.lang.String unaliasableGlobals;

	public void setUnaliasableGlobals(java.lang.String names) {
		unaliasableGlobals = names;
	}

	public boolean collapseVariableDeclarations;

	boolean groupVariableDeclarations;

	public void groupVariableDeclarations(boolean enabled) {
		groupVariableDeclarations = enabled;
	}

	public boolean collapseAnonymousFunctions;

	public java.util.Set<java.lang.String> aliasableStrings;

	public java.lang.String aliasStringsBlacklist;

	public boolean aliasAllStrings;

	boolean outputJsStringUsage;

	public boolean convertToDottedProperties;

	public boolean rewriteFunctionExpressions;

	public boolean optimizeParameters;

	public boolean optimizeReturns;

	public boolean optimizeCalls;

	public boolean optimizeArgumentsArray;

	boolean chainCalls;

	public com.google.javascript.jscomp.VariableRenamingPolicy variableRenaming;

	public com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenaming;

	boolean propertyAffinity;

	public boolean labelRenaming;

	public boolean reserveRawExports;

	boolean shadowVariables;

	public boolean generatePseudoNames;

	public java.lang.String renamePrefix;

	public java.lang.String renamePrefixNamespace;

	public boolean aliasKeywords;

	public boolean collapseProperties;

	boolean collapseObjectLiterals;

	public void setCollapseObjectLiterals(boolean enabled) {
		collapseObjectLiterals = true;
	}

	boolean collapsePropertiesOnExternTypes;

	public boolean devirtualizePrototypeMethods;

	public boolean computeFunctionSideEffects;

	java.lang.String debugFunctionSideEffectsPath;

	public boolean disambiguateProperties;

	public boolean ambiguateProperties;

	public com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNaming;

	public byte[] inputVariableMapSerialized;

	public byte[] inputPropertyMapSerialized;

	public boolean exportTestFunctions;

	boolean specializeInitialModule;

	public void setSpecializeInitialModule(boolean enabled) {
		specializeInitialModule = enabled;
	}

	boolean runtimeTypeCheck;

	java.lang.String runtimeTypeCheckLogFunction;

	private com.google.javascript.jscomp.CodingConvention codingConvention;

	boolean ignoreCajaProperties;

	public void setIgnoreCajaProperties(boolean enabled) {
		ignoreCajaProperties = enabled;
	}

	public java.lang.String syntheticBlockStartMarker;

	public java.lang.String syntheticBlockEndMarker;

	public java.lang.String locale;

	public boolean markAsCompiled;

	public boolean removeTryCatchFinally;

	public boolean closurePass;

	public boolean jqueryPass;

	boolean rewriteNewDateGoogNow;

	boolean removeAbstractMethods;

	boolean removeClosureAsserts;

	public boolean gatherCssNames;

	public java.util.Set<java.lang.String> stripTypes;

	public java.util.Set<java.lang.String> stripNameSuffixes;

	public java.util.Set<java.lang.String> stripNamePrefixes;

	public java.util.Set<java.lang.String> stripTypePrefixes;

	public transient com.google.common.collect.Multimap<com.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass> customPasses;

	public boolean markNoSideEffectCalls;

	private java.util.Map<java.lang.String, java.lang.Object> defineReplacements;

	private com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing;

	private java.util.Map<java.lang.String, java.lang.Object> tweakReplacements;

	public boolean moveFunctionDeclarations;

	public java.lang.String instrumentationTemplate;

	java.lang.String appNameStr;

	public void setAppNameStr(java.lang.String appNameStr) {
		com.google.javascript.jscomp.CompilerOptions.this.appNameStr = appNameStr;
	}

	public boolean recordFunctionInformation;

	public boolean generateExports;

	public com.google.javascript.jscomp.CssRenamingMap cssRenamingMap;

	boolean processObjectPropertyString;

	boolean replaceIdGenerators = true;

	java.util.Set<java.lang.String> idGenerators;

	java.util.List<java.lang.String> replaceStringsFunctionDescriptions;

	java.lang.String replaceStringsPlaceholderToken;

	java.util.Set<java.lang.String> replaceStringsReservedStrings;

	java.util.Map<java.lang.String, com.google.javascript.jscomp.CheckLevel> propertyInvalidationErrors;

	public boolean prettyPrint;

	public boolean lineBreak;

	public boolean printInputDelimiter;

	public java.lang.String inputDelimiter = "// Input %num%";

	java.lang.String reportPath;

	public void setReportPath(java.lang.String reportPath) {
		com.google.javascript.jscomp.CompilerOptions.this.reportPath = reportPath;
	}

	com.google.javascript.jscomp.CompilerOptions.TracerMode tracer;

	public void setTracerMode(com.google.javascript.jscomp.CompilerOptions.TracerMode mode) {
		tracer = mode;
	}

	private boolean colorizeErrorOutput;

	public com.google.javascript.jscomp.ErrorFormat errorFormat;

	private com.google.javascript.jscomp.ComposeWarningsGuard warningsGuard = new com.google.javascript.jscomp.ComposeWarningsGuard();

	int summaryDetailLevel = 1;

	int lineLengthThreshold = com.google.javascript.jscomp.CodePrinter.DEFAULT_LINE_LENGTH_THRESHOLD;

	private boolean externExports;

	java.lang.String externExportsPath;

	java.lang.String nameReferenceReportPath;

	public void setNameReferenceReportPath(java.lang.String filePath) {
		nameReferenceReportPath = filePath;
	}

	java.lang.String nameReferenceGraphPath;

	public void setNameReferenceGraphPath(java.lang.String filePath) {
		nameReferenceGraphPath = filePath;
	}

	public java.lang.String sourceMapOutputPath;

	public com.google.javascript.jscomp.SourceMap.DetailLevel sourceMapDetailLevel = com.google.javascript.jscomp.SourceMap.DetailLevel.SYMBOLS;

	public com.google.javascript.jscomp.SourceMap.Format sourceMapFormat = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;

	public java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping> sourceMapLocationMappings = java.util.Collections.emptyList();

	java.lang.String outputCharset;

	boolean looseTypes;

	private transient com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasHandler;

	public CompilerOptions() {
		languageIn = com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3;
		acceptConstKeyword = false;
		skipAllPasses = false;
		nameAnonymousFunctionsOnly = false;
		devMode = com.google.javascript.jscomp.CompilerOptions.DevMode.OFF;
		checkSymbols = false;
		aggressiveVarCheck = com.google.javascript.jscomp.CheckLevel.OFF;
		checkSuspiciousCode = false;
		checkControlStructures = false;
		checkTypes = false;
		tightenTypes = false;
		reportMissingOverride = com.google.javascript.jscomp.CheckLevel.OFF;
		reportUnknownTypes = com.google.javascript.jscomp.CheckLevel.OFF;
		checkRequires = com.google.javascript.jscomp.CheckLevel.OFF;
		checkProvides = com.google.javascript.jscomp.CheckLevel.OFF;
		checkGlobalNamesLevel = com.google.javascript.jscomp.CheckLevel.OFF;
		brokenClosureRequiresLevel = com.google.javascript.jscomp.CheckLevel.ERROR;
		checkGlobalThisLevel = com.google.javascript.jscomp.CheckLevel.OFF;
		checkUnreachableCode = com.google.javascript.jscomp.CheckLevel.OFF;
		checkMissingReturn = com.google.javascript.jscomp.CheckLevel.OFF;
		checkMissingGetCssNameLevel = com.google.javascript.jscomp.CheckLevel.OFF;
		checkMissingGetCssNameBlacklist = null;
		checkCaja = false;
		computeFunctionSideEffects = false;
		chainCalls = false;
		extraAnnotationNames = null;
		foldConstants = false;
		coalesceVariableNames = false;
		deadAssignmentElimination = false;
		inlineConstantVars = false;
		inlineFunctions = false;
		inlineLocalFunctions = false;
		assumeStrictThis = false;
		assumeClosuresOnlyCaptureReferences = false;
		crossModuleCodeMotion = false;
		crossModuleMethodMotion = false;
		inlineGetters = false;
		inlineVariables = false;
		inlineLocalVariables = false;
		smartNameRemoval = false;
		removeDeadCode = false;
		extractPrototypeMemberDeclarations = false;
		removeUnusedPrototypeProperties = false;
		removeUnusedPrototypePropertiesInExterns = false;
		removeUnusedVars = false;
		removeUnusedLocalVars = false;
		aliasExternals = false;
		collapseVariableDeclarations = false;
		groupVariableDeclarations = false;
		collapseAnonymousFunctions = false;
		aliasableStrings = java.util.Collections.emptySet();
		aliasStringsBlacklist = "";
		aliasAllStrings = false;
		outputJsStringUsage = false;
		convertToDottedProperties = false;
		rewriteFunctionExpressions = false;
		optimizeParameters = false;
		optimizeReturns = false;
		variableRenaming = com.google.javascript.jscomp.VariableRenamingPolicy.OFF;
		propertyRenaming = com.google.javascript.jscomp.PropertyRenamingPolicy.OFF;
		propertyAffinity = false;
		labelRenaming = false;
		generatePseudoNames = false;
		shadowVariables = false;
		renamePrefix = null;
		aliasKeywords = false;
		collapseProperties = false;
		collapsePropertiesOnExternTypes = false;
		collapseObjectLiterals = false;
		devirtualizePrototypeMethods = false;
		disambiguateProperties = false;
		ambiguateProperties = false;
		anonymousFunctionNaming = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF;
		exportTestFunctions = false;
		runtimeTypeCheck = false;
		runtimeTypeCheckLogFunction = null;
		ignoreCajaProperties = false;
		syntheticBlockStartMarker = null;
		syntheticBlockEndMarker = null;
		locale = null;
		markAsCompiled = false;
		removeTryCatchFinally = false;
		closurePass = false;
		jqueryPass = false;
		rewriteNewDateGoogNow = true;
		removeAbstractMethods = true;
		removeClosureAsserts = false;
		stripTypes = java.util.Collections.emptySet();
		stripNameSuffixes = java.util.Collections.emptySet();
		stripNamePrefixes = java.util.Collections.emptySet();
		stripTypePrefixes = java.util.Collections.emptySet();
		customPasses = null;
		markNoSideEffectCalls = false;
		defineReplacements = com.google.common.collect.Maps.newHashMap();
		tweakProcessing = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF;
		tweakReplacements = com.google.common.collect.Maps.newHashMap();
		moveFunctionDeclarations = false;
		instrumentationTemplate = null;
		appNameStr = "";
		recordFunctionInformation = false;
		generateExports = false;
		cssRenamingMap = null;
		processObjectPropertyString = false;
		idGenerators = java.util.Collections.emptySet();
		replaceStringsFunctionDescriptions = java.util.Collections.emptyList();
		replaceStringsPlaceholderToken = "";
		replaceStringsReservedStrings = java.util.Collections.emptySet();
		propertyInvalidationErrors = com.google.common.collect.Maps.newHashMap();
		printInputDelimiter = false;
		prettyPrint = false;
		lineBreak = false;
		reportPath = null;
		tracer = com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF;
		colorizeErrorOutput = false;
		errorFormat = com.google.javascript.jscomp.ErrorFormat.SINGLELINE;
		debugFunctionSideEffectsPath = null;
		externExports = false;
		nameReferenceReportPath = null;
		nameReferenceGraphPath = null;
		aliasHandler = com.google.javascript.jscomp.CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER;
	}

	public java.util.Map<java.lang.String, com.google.javascript.rhino.Node> getDefineReplacements() {
		return com.google.javascript.jscomp.CompilerOptions.getReplacementsHelper(defineReplacements);
	}

	public java.util.Map<java.lang.String, com.google.javascript.rhino.Node> getTweakReplacements() {
		return com.google.javascript.jscomp.CompilerOptions.getReplacementsHelper(tweakReplacements);
	}

	private static java.util.Map<java.lang.String, com.google.javascript.rhino.Node> getReplacementsHelper(java.util.Map<java.lang.String, java.lang.Object> source) {
		java.util.Map<java.lang.String, com.google.javascript.rhino.Node> map = com.google.common.collect.Maps.newHashMap();
		for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : source.entrySet()) {
			java.lang.String name = entry.getKey();
			java.lang.Object value = entry.getValue();
			if (value instanceof java.lang.Boolean) {
				map.put(name, com.google.javascript.jscomp.NodeUtil.booleanNode(((java.lang.Boolean) (value)).booleanValue()));
			}else
				if (value instanceof java.lang.Integer) {
					map.put(name, com.google.javascript.rhino.IR.number(((java.lang.Integer) (value)).intValue()));
				}else
					if (value instanceof java.lang.Double) {
						map.put(name, com.google.javascript.rhino.IR.number(((java.lang.Double) (value)).doubleValue()));
					}else {
						com.google.common.base.Preconditions.checkState((value instanceof java.lang.String));
						map.put(name, com.google.javascript.rhino.IR.string(((java.lang.String) (value))));
					}
				
			
		}
		return map;
	}

	public void setDefineToBooleanLiteral(java.lang.String defineName, boolean value) {
		defineReplacements.put(defineName, new java.lang.Boolean(value));
	}

	public void setDefineToStringLiteral(java.lang.String defineName, java.lang.String value) {
		defineReplacements.put(defineName, value);
	}

	public void setDefineToNumberLiteral(java.lang.String defineName, int value) {
		defineReplacements.put(defineName, new java.lang.Integer(value));
	}

	public void setDefineToDoubleLiteral(java.lang.String defineName, double value) {
		defineReplacements.put(defineName, new java.lang.Double(value));
	}

	public void setTweakToBooleanLiteral(java.lang.String tweakId, boolean value) {
		tweakReplacements.put(tweakId, new java.lang.Boolean(value));
	}

	public void setTweakToStringLiteral(java.lang.String tweakId, java.lang.String value) {
		tweakReplacements.put(tweakId, value);
	}

	public void setTweakToNumberLiteral(java.lang.String tweakId, int value) {
		tweakReplacements.put(tweakId, new java.lang.Integer(value));
	}

	public void setTweakToDoubleLiteral(java.lang.String tweakId, double value) {
		tweakReplacements.put(tweakId, new java.lang.Double(value));
	}

	public void skipAllCompilerPasses() {
		skipAllPasses = true;
	}

	boolean enables(com.google.javascript.jscomp.DiagnosticGroup type) {
		return warningsGuard.enables(type);
	}

	boolean disables(com.google.javascript.jscomp.DiagnosticGroup type) {
		return warningsGuard.disables(type);
	}

	public void setWarningLevel(com.google.javascript.jscomp.DiagnosticGroup type, com.google.javascript.jscomp.CheckLevel level) {
		addWarningsGuard(new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(type, level));
	}

	com.google.javascript.jscomp.WarningsGuard getWarningsGuard() {
		return warningsGuard;
	}

	public void resetWarningsGuard() {
		warningsGuard = new com.google.javascript.jscomp.ComposeWarningsGuard();
	}

	void useEmergencyFailSafe() {
		warningsGuard = warningsGuard.makeEmergencyFailSafeGuard();
	}

	public void addWarningsGuard(com.google.javascript.jscomp.WarningsGuard guard) {
		warningsGuard.addGuard(guard);
	}

	public void setRenamingPolicy(com.google.javascript.jscomp.VariableRenamingPolicy newVariablePolicy, com.google.javascript.jscomp.PropertyRenamingPolicy newPropertyPolicy) {
		com.google.javascript.jscomp.CompilerOptions.this.variableRenaming = newVariablePolicy;
		com.google.javascript.jscomp.CompilerOptions.this.propertyRenaming = newPropertyPolicy;
	}

	public void setPropertyAffinity(boolean useAffinity) {
		com.google.javascript.jscomp.CompilerOptions.this.propertyAffinity = useAffinity;
	}

	public void setShadowVariables(boolean shadow) {
		com.google.javascript.jscomp.CompilerOptions.this.shadowVariables = shadow;
	}

	public void setCollapsePropertiesOnExternTypes(boolean collapse) {
		collapsePropertiesOnExternTypes = collapse;
	}

	public void setProcessObjectPropertyString(boolean process) {
		processObjectPropertyString = process;
	}

	public void setReplaceIdGenerators(boolean replaceIdGenerators) {
		com.google.javascript.jscomp.CompilerOptions.this.replaceIdGenerators = replaceIdGenerators;
	}

	public void setIdGenerators(java.util.Set<java.lang.String> idGenerators) {
		com.google.javascript.jscomp.CompilerOptions.this.idGenerators = com.google.common.collect.Sets.newHashSet(idGenerators);
	}

	public void setInlineFunctions(com.google.javascript.jscomp.CompilerOptions.Reach reach) {
		switch (reach) {
			case ALL :
				com.google.javascript.jscomp.CompilerOptions.this.inlineFunctions = true;
				com.google.javascript.jscomp.CompilerOptions.this.inlineLocalFunctions = true;
				break;
			case LOCAL_ONLY :
				com.google.javascript.jscomp.CompilerOptions.this.inlineFunctions = false;
				com.google.javascript.jscomp.CompilerOptions.this.inlineLocalFunctions = true;
				break;
			case NONE :
				com.google.javascript.jscomp.CompilerOptions.this.inlineFunctions = false;
				com.google.javascript.jscomp.CompilerOptions.this.inlineLocalFunctions = false;
				break;
			default :
				throw new java.lang.IllegalStateException("unexpected");
		}
	}

	public void setInlineVariables(com.google.javascript.jscomp.CompilerOptions.Reach reach) {
		switch (reach) {
			case ALL :
				com.google.javascript.jscomp.CompilerOptions.this.inlineVariables = true;
				com.google.javascript.jscomp.CompilerOptions.this.inlineLocalVariables = true;
				break;
			case LOCAL_ONLY :
				com.google.javascript.jscomp.CompilerOptions.this.inlineVariables = false;
				com.google.javascript.jscomp.CompilerOptions.this.inlineLocalVariables = true;
				break;
			case NONE :
				com.google.javascript.jscomp.CompilerOptions.this.inlineVariables = false;
				com.google.javascript.jscomp.CompilerOptions.this.inlineLocalVariables = false;
				break;
			default :
				throw new java.lang.IllegalStateException("unexpected");
		}
	}

	public void setRemoveUnusedVariable(com.google.javascript.jscomp.CompilerOptions.Reach reach) {
		switch (reach) {
			case ALL :
				com.google.javascript.jscomp.CompilerOptions.this.removeUnusedVars = true;
				com.google.javascript.jscomp.CompilerOptions.this.removeUnusedLocalVars = true;
				break;
			case LOCAL_ONLY :
				com.google.javascript.jscomp.CompilerOptions.this.removeUnusedVars = false;
				com.google.javascript.jscomp.CompilerOptions.this.removeUnusedLocalVars = true;
				break;
			case NONE :
				com.google.javascript.jscomp.CompilerOptions.this.removeUnusedVars = false;
				com.google.javascript.jscomp.CompilerOptions.this.removeUnusedLocalVars = false;
				break;
			default :
				throw new java.lang.IllegalStateException("unexpected");
		}
	}

	public void setReplaceStringsConfiguration(java.lang.String placeholderToken, java.util.List<java.lang.String> functionDescriptors) {
		com.google.javascript.jscomp.CompilerOptions.this.replaceStringsPlaceholderToken = placeholderToken;
		com.google.javascript.jscomp.CompilerOptions.this.replaceStringsFunctionDescriptions = com.google.common.collect.Lists.newArrayList(functionDescriptors);
	}

	public void setRewriteNewDateGoogNow(boolean rewrite) {
		com.google.javascript.jscomp.CompilerOptions.this.rewriteNewDateGoogNow = rewrite;
	}

	public void setRemoveAbstractMethods(boolean remove) {
		com.google.javascript.jscomp.CompilerOptions.this.removeAbstractMethods = remove;
	}

	public void setRemoveClosureAsserts(boolean remove) {
		com.google.javascript.jscomp.CompilerOptions.this.removeClosureAsserts = remove;
	}

	public void setNameAnonymousFunctionsOnly(boolean value) {
		com.google.javascript.jscomp.CompilerOptions.this.nameAnonymousFunctionsOnly = value;
	}

	public void lineLengthThreshold(int value) {
		com.google.javascript.jscomp.CompilerOptions.this.lineLengthThreshold = value;
	}

	public void setColorizeErrorOutput(boolean colorizeErrorOutput) {
		com.google.javascript.jscomp.CompilerOptions.this.colorizeErrorOutput = colorizeErrorOutput;
	}

	public boolean shouldColorizeErrorOutput() {
		return colorizeErrorOutput;
	}

	public void setChainCalls(boolean value) {
		com.google.javascript.jscomp.CompilerOptions.this.chainCalls = value;
	}

	public void setAcceptConstKeyword(boolean value) {
		com.google.javascript.jscomp.CompilerOptions.this.acceptConstKeyword = value;
	}

	public void enableRuntimeTypeCheck(java.lang.String logFunction) {
		com.google.javascript.jscomp.CompilerOptions.this.runtimeTypeCheck = true;
		com.google.javascript.jscomp.CompilerOptions.this.runtimeTypeCheckLogFunction = logFunction;
	}

	public void disableRuntimeTypeCheck() {
		com.google.javascript.jscomp.CompilerOptions.this.runtimeTypeCheck = false;
	}

	public void setGenerateExports(boolean generateExports) {
		com.google.javascript.jscomp.CompilerOptions.this.generateExports = generateExports;
	}

	public void setCodingConvention(com.google.javascript.jscomp.CodingConvention codingConvention) {
		com.google.javascript.jscomp.CompilerOptions.this.codingConvention = codingConvention;
	}

	public com.google.javascript.jscomp.CodingConvention getCodingConvention() {
		return codingConvention;
	}

	public void setDependencyOptions(com.google.javascript.jscomp.DependencyOptions options) {
		com.google.javascript.jscomp.CompilerOptions.this.dependencyOptions = options;
	}

	public void setManageClosureDependencies(boolean newVal) {
		dependencyOptions.setDependencySorting(newVal);
		dependencyOptions.setDependencyPruning(newVal);
		dependencyOptions.setMoocherDropping(false);
	}

	public void setManageClosureDependencies(java.util.List<java.lang.String> entryPoints) {
		com.google.common.base.Preconditions.checkNotNull(entryPoints);
		setManageClosureDependencies(true);
		dependencyOptions.setEntryPoints(entryPoints);
	}

	public void setSummaryDetailLevel(int summaryDetailLevel) {
		com.google.javascript.jscomp.CompilerOptions.this.summaryDetailLevel = summaryDetailLevel;
	}

	public void enableExternExports(boolean enable) {
		com.google.javascript.jscomp.CompilerOptions.this.externExports = enable;
	}

	public void setExtraAnnotationNames(java.util.Set<java.lang.String> extraAnnotationNames) {
		com.google.javascript.jscomp.CompilerOptions.this.extraAnnotationNames = com.google.common.collect.Sets.newHashSet(extraAnnotationNames);
	}

	public boolean isExternExportsEnabled() {
		return externExports;
	}

	public void setOutputCharset(java.lang.String charsetName) {
		com.google.javascript.jscomp.CompilerOptions.this.outputCharset = charsetName;
	}

	public void setTweakProcessing(com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing) {
		com.google.javascript.jscomp.CompilerOptions.this.tweakProcessing = tweakProcessing;
	}

	public com.google.javascript.jscomp.CompilerOptions.TweakProcessing getTweakProcessing() {
		return tweakProcessing;
	}

	public void setLanguageIn(com.google.javascript.jscomp.CompilerOptions.LanguageMode languageIn) {
		com.google.javascript.jscomp.CompilerOptions.this.languageIn = languageIn;
		com.google.javascript.jscomp.CompilerOptions.this.languageOut = languageIn;
	}

	public com.google.javascript.jscomp.CompilerOptions.LanguageMode getLanguageIn() {
		return languageIn;
	}

	public com.google.javascript.jscomp.CompilerOptions.LanguageMode getLanguageOut() {
		return languageOut;
	}

	public void setLooseTypes(boolean looseTypes) {
		com.google.javascript.jscomp.CompilerOptions.this.looseTypes = looseTypes;
	}

	@java.lang.Override
	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		com.google.javascript.jscomp.CompilerOptions clone = ((com.google.javascript.jscomp.CompilerOptions) (super.clone()));
		return clone;
	}

	public void setAliasTransformationHandler(com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler changes) {
		com.google.javascript.jscomp.CompilerOptions.this.aliasHandler = changes;
	}

	public com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler getAliasTransformationHandler() {
		return com.google.javascript.jscomp.CompilerOptions.this.aliasHandler;
	}

	public void setInferTypes(boolean enable) {
		inferTypes = enable;
	}

	public boolean getInferTypes() {
		return inferTypes;
	}

	public boolean assumeStrictThis() {
		return assumeStrictThis;
	}

	public void setAssumeStrictThis(boolean enable) {
		com.google.javascript.jscomp.CompilerOptions.this.assumeStrictThis = enable;
	}

	public boolean assumeClosuresOnlyCaptureReferences() {
		return assumeClosuresOnlyCaptureReferences;
	}

	public void setAssumeClosuresOnlyCaptureReferences(boolean enable) {
		com.google.javascript.jscomp.CompilerOptions.this.assumeClosuresOnlyCaptureReferences = enable;
	}

	public void setPropertyInvalidationErrors(java.util.Map<java.lang.String, com.google.javascript.jscomp.CheckLevel> propertyInvalidationErrors) {
		com.google.javascript.jscomp.CompilerOptions.this.propertyInvalidationErrors = com.google.common.collect.Maps.newHashMap(propertyInvalidationErrors);
	}

	public static enum LanguageMode {
ECMASCRIPT3, ECMASCRIPT5, ECMASCRIPT5_STRICT;	}

	static enum DevMode {
OFF, START, START_AND_END, EVERY_PASS;	}

	public static enum TracerMode {
ALL, FAST, OFF;
		boolean isOn() {
			return (com.google.javascript.jscomp.CompilerOptions.TracerMode.this) != (com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF);
		}
	}

	public static enum TweakProcessing {
OFF, CHECK, STRIP;
		public boolean isOn() {
			return (com.google.javascript.jscomp.CompilerOptions.TweakProcessing.this) != (com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF);
		}

		public boolean shouldStrip() {
			return (com.google.javascript.jscomp.CompilerOptions.TweakProcessing.this) == (com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP);
		}
	}

	public interface AliasTransformationHandler {
		public com.google.javascript.jscomp.CompilerOptions.AliasTransformation logAliasTransformation(java.lang.String sourceFile, com.google.javascript.rhino.SourcePosition<com.google.javascript.jscomp.CompilerOptions.AliasTransformation> position);
	}

	public interface AliasTransformation {
		void addAlias(java.lang.String alias, java.lang.String definition);
	}

	static final com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler NULL_ALIAS_TRANSFORMATION_HANDLER = new com.google.javascript.jscomp.CompilerOptions.NullAliasTransformationHandler();

	private static class NullAliasTransformationHandler implements com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler , java.io.Serializable {
		private static final long serialVersionUID = 0L;

		private static final com.google.javascript.jscomp.CompilerOptions.AliasTransformation NULL_ALIAS_TRANSFORMATION = new com.google.javascript.jscomp.CompilerOptions.NullAliasTransformationHandler.NullAliasTransformation();

		@java.lang.Override
		public com.google.javascript.jscomp.CompilerOptions.AliasTransformation logAliasTransformation(java.lang.String sourceFile, com.google.javascript.rhino.SourcePosition<com.google.javascript.jscomp.CompilerOptions.AliasTransformation> position) {
			position.setItem(com.google.javascript.jscomp.CompilerOptions.NullAliasTransformationHandler.NULL_ALIAS_TRANSFORMATION);
			return com.google.javascript.jscomp.CompilerOptions.NullAliasTransformationHandler.NULL_ALIAS_TRANSFORMATION;
		}

		private static class NullAliasTransformation implements com.google.javascript.jscomp.CompilerOptions.AliasTransformation , java.io.Serializable {
			private static final long serialVersionUID = 0L;

			@java.lang.Override
			public void addAlias(java.lang.String alias, java.lang.String definition) {
			}
		}
	}
}




package com.google.javascript.jscomp;


public class DefaultPassConfig extends com.google.javascript.jscomp.PassConfig {
	private static final java.lang.String COMPILED_CONSTANT_NAME = "COMPILED";

	private static final java.lang.String CLOSURE_LOCALE_CONSTANT_NAME = "goog.LOCALE";

	static final com.google.javascript.jscomp.DiagnosticType TIGHTEN_TYPES_WITHOUT_TYPE_CHECK = com.google.javascript.jscomp.DiagnosticType.error("JSC_TIGHTEN_TYPES_WITHOUT_TYPE_CHECK", "TightenTypes requires type checking. Please use --check_types.");

	static final com.google.javascript.jscomp.DiagnosticType CANNOT_USE_PROTOTYPE_AND_VAR = com.google.javascript.jscomp.DiagnosticType.error("JSC_CANNOT_USE_PROTOTYPE_AND_VAR", "Rename prototypes and inline variables cannot be used together");

	static final com.google.javascript.jscomp.DiagnosticType REPORT_PATH_IO_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_REPORT_PATH_IO_ERROR", "Error writing compiler report to {0}");

	private static final com.google.javascript.jscomp.DiagnosticType INPUT_MAP_PROP_PARSE = com.google.javascript.jscomp.DiagnosticType.error("JSC_INPUT_MAP_PROP_PARSE", "Input property map parse error: {0}");

	private static final com.google.javascript.jscomp.DiagnosticType INPUT_MAP_VAR_PARSE = com.google.javascript.jscomp.DiagnosticType.error("JSC_INPUT_MAP_VAR_PARSE", "Input variable map parse error: {0}");

	private static final com.google.javascript.jscomp.DiagnosticType NAME_REF_GRAPH_FILE_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_NAME_REF_GRAPH_FILE_ERROR", "Error \"{1}\" writing name reference graph to \"{0}\".");

	private static final com.google.javascript.jscomp.DiagnosticType NAME_REF_REPORT_FILE_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_NAME_REF_REPORT_FILE_ERROR", "Error \"{1}\" writing name reference report to \"{0}\".");

	private com.google.javascript.jscomp.GlobalNamespace namespaceForChecks = null;

	private com.google.javascript.jscomp.TightenTypes tightenTypes = null;

	private java.util.Set<java.lang.String> exportedNames = null;

	private com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator crossModuleIdGenerator = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();

	private java.util.Map<java.lang.String, java.lang.Integer> cssNames = null;

	private com.google.javascript.jscomp.VariableMap variableMap = null;

	private com.google.javascript.jscomp.VariableMap propertyMap = null;

	private com.google.javascript.jscomp.VariableMap anonymousFunctionNameMap = null;

	private com.google.javascript.jscomp.FunctionNames functionNames = null;

	private com.google.javascript.jscomp.VariableMap stringMap = null;

	private java.lang.String idGeneratorMap = null;

	public DefaultPassConfig(com.google.javascript.jscomp.CompilerOptions options) {
		super(options);
	}

	@java.lang.Override
	com.google.javascript.jscomp.PassConfig.State getIntermediateState() {
		return new com.google.javascript.jscomp.PassConfig.State(((cssNames) == null ? null : com.google.common.collect.Maps.newHashMap(cssNames)), ((exportedNames) == null ? null : java.util.Collections.unmodifiableSet(exportedNames)), crossModuleIdGenerator, variableMap, propertyMap, anonymousFunctionNameMap, stringMap, functionNames, idGeneratorMap);
	}

	@java.lang.Override
	void setIntermediateState(com.google.javascript.jscomp.PassConfig.State state) {
		com.google.javascript.jscomp.DefaultPassConfig.this.cssNames = ((state.cssNames) == null) ? null : com.google.common.collect.Maps.newHashMap(state.cssNames);
		com.google.javascript.jscomp.DefaultPassConfig.this.exportedNames = ((state.exportedNames) == null) ? null : com.google.common.collect.Sets.newHashSet(state.exportedNames);
		com.google.javascript.jscomp.DefaultPassConfig.this.crossModuleIdGenerator = state.crossModuleIdGenerator;
		com.google.javascript.jscomp.DefaultPassConfig.this.variableMap = state.variableMap;
		com.google.javascript.jscomp.DefaultPassConfig.this.propertyMap = state.propertyMap;
		com.google.javascript.jscomp.DefaultPassConfig.this.anonymousFunctionNameMap = state.anonymousFunctionNameMap;
		com.google.javascript.jscomp.DefaultPassConfig.this.stringMap = state.stringMap;
		com.google.javascript.jscomp.DefaultPassConfig.this.functionNames = state.functionNames;
		com.google.javascript.jscomp.DefaultPassConfig.this.idGeneratorMap = state.idGeneratorMap;
	}

	@java.lang.Override
	protected java.util.List<com.google.javascript.jscomp.PassFactory> getChecks() {
		java.util.List<com.google.javascript.jscomp.PassFactory> checks = com.google.common.collect.Lists.newArrayList();
		if (options.closurePass) {
			checks.add(closureGoogScopeAliases);
		}
		if (options.nameAnonymousFunctionsOnly) {
			if ((options.anonymousFunctionNaming) == (com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.MAPPED)) {
				checks.add(nameMappedAnonymousFunctions);
			}else
				if ((options.anonymousFunctionNaming) == (com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.UNMAPPED)) {
					checks.add(nameUnmappedAnonymousFunctions);
				}
			
			return checks;
		}
		if ((options.checkSuspiciousCode) || (options.enables(com.google.javascript.jscomp.DiagnosticGroups.GLOBAL_THIS))) {
			checks.add(suspiciousCode);
		}
		if (options.checkControlStructures) {
			checks.add(checkControlStructures);
		}
		if (options.checkRequires.isOn()) {
			checks.add(checkRequires);
		}
		if (options.checkProvides.isOn()) {
			checks.add(checkProvides);
		}
		if (options.generateExports) {
			checks.add(generateExports);
		}
		if (options.exportTestFunctions) {
			checks.add(exportTestFunctions);
		}
		if (options.closurePass) {
			checks.add(closurePrimitives.makeOneTimePass());
		}
		if ((options.closurePass) && (options.checkMissingGetCssNameLevel.isOn())) {
			checks.add(closureCheckGetCssName);
		}
		if ((options.syntheticBlockStartMarker) != null) {
			checks.add(createSyntheticBlocks);
		}
		checks.add(checkVars);
		if (options.computeFunctionSideEffects) {
			checks.add(checkRegExp);
		}
		if (options.checkShadowVars.isOn()) {
			checks.add(checkShadowVars);
		}
		if (options.aggressiveVarCheck.isOn()) {
			checks.add(checkVariableReferences);
		}
		if (options.processObjectPropertyString) {
			checks.add(objectPropertyStringPreprocess);
		}
		if ((options.checkTypes) || (options.inferTypes)) {
			checks.add(resolveTypes.makeOneTimePass());
			checks.add(inferTypes.makeOneTimePass());
			if (options.checkTypes) {
				checks.add(checkTypes.makeOneTimePass());
			}else {
				checks.add(inferJsDocInfo.makeOneTimePass());
			}
		}
		if ((options.checkUnreachableCode.isOn()) || ((options.checkTypes) && (options.checkMissingReturn.isOn()))) {
			checks.add(checkControlFlow);
		}
		if ((options.checkTypes) && ((options.enables(com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS)) || (options.enables(com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY)))) {
			checks.add(checkAccessControls);
		}
		if (options.checkGlobalNamesLevel.isOn()) {
			checks.add(checkGlobalNames);
		}
		if ((options.checkUndefinedProperties.isOn()) || (options.checkUnusedPropertiesEarly)) {
			checks.add(checkSuspiciousProperties);
		}
		if ((((options.getLanguageIn()) == (com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT)) || (options.checkCaja)) || (options.checkEs5Strict)) {
			checks.add(checkStrictMode);
		}
		if (options.closurePass) {
			checks.add(closureReplaceGetCssName);
		}
		checks.add(((options.messageBundle) != null ? replaceMessages : com.google.javascript.jscomp.DefaultPassConfig.createEmptyPass("replaceMessages")));
		if (options.getTweakProcessing().isOn()) {
			checks.add(processTweaks);
		}
		checks.add(processDefines);
		if (((options.instrumentationTemplate) != null) || (options.recordFunctionInformation)) {
			checks.add(computeFunctionNames);
		}
		if (((options.nameReferenceGraphPath) != null) && (!(options.nameReferenceGraphPath.isEmpty()))) {
			checks.add(printNameReferenceGraph);
		}
		if (((options.nameReferenceReportPath) != null) && (!(options.nameReferenceReportPath.isEmpty()))) {
			checks.add(printNameReferenceReport);
		}
		assertAllOneTimePasses(checks);
		return checks;
	}

	@java.lang.Override
	protected java.util.List<com.google.javascript.jscomp.PassFactory> getOptimizations() {
		java.util.List<com.google.javascript.jscomp.PassFactory> passes = com.google.common.collect.Lists.newArrayList();
		if (options.runtimeTypeCheck) {
			passes.add(runtimeTypeCheck);
		}
		passes.add(com.google.javascript.jscomp.DefaultPassConfig.createEmptyPass("beforeStandardOptimizations"));
		if (!(options.idGenerators.isEmpty())) {
			passes.add(replaceIdGenerators);
		}
		if (options.optimizeArgumentsArray) {
			passes.add(optimizeArgumentsArray);
		}
		if ((options.closurePass) && ((options.removeAbstractMethods) || (options.removeClosureAsserts))) {
			passes.add(closureCodeRemoval);
		}
		if (options.collapseProperties) {
			passes.add(collapseProperties);
		}
		if (!(options.replaceStringsFunctionDescriptions.isEmpty())) {
			passes.add(replaceStrings);
		}
		if (options.tightenTypes) {
			passes.add(tightenTypesBuilder);
		}
		if (options.disambiguateProperties) {
			passes.add(disambiguateProperties);
		}
		if (options.computeFunctionSideEffects) {
			passes.add(markPureFunctions);
		}else
			if (options.markNoSideEffectCalls) {
				passes.add(markNoSideEffectCalls);
			}
		
		if (options.chainCalls) {
			passes.add(chainCalls);
		}
		if (options.inlineConstantVars) {
			passes.add(checkConsts);
		}
		if (options.ignoreCajaProperties) {
			passes.add(ignoreCajaProperties);
		}
		assertAllOneTimePasses(passes);
		if ((options.smartNameRemoval) || ((options.reportPath) != null)) {
			passes.addAll(getCodeRemovingPasses());
			passes.add(smartNamePass);
		}
		if (options.closurePass) {
			passes.add(closureOptimizePrimitives);
		}
		if (options.crossModuleCodeMotion) {
			passes.add(crossModuleCodeMotion);
		}
		if (options.devirtualizePrototypeMethods) {
			passes.add(devirtualizePrototypeMethods);
		}
		if ((options.customPasses) != null) {
			passes.add(getCustomPasses(com.google.javascript.jscomp.CustomPassExecutionTime.BEFORE_OPTIMIZATION_LOOP));
		}
		passes.add(com.google.javascript.jscomp.DefaultPassConfig.createEmptyPass("beforeMainOptimizations"));
		if (options.specializeInitialModule) {
			passes.addAll(getMainOptimizationLoop());
			if (options.crossModuleCodeMotion) {
				passes.add(crossModuleCodeMotion);
			}
			if (options.crossModuleMethodMotion) {
				passes.add(crossModuleMethodMotion);
			}
			passes.add(specializeInitialModule.makeOneTimePass());
		}
		passes.addAll(getMainOptimizationLoop());
		passes.add(com.google.javascript.jscomp.DefaultPassConfig.createEmptyPass("beforeModuleMotion"));
		if (options.crossModuleCodeMotion) {
			passes.add(crossModuleCodeMotion);
		}
		if (options.crossModuleMethodMotion) {
			passes.add(crossModuleMethodMotion);
		}
		passes.add(com.google.javascript.jscomp.DefaultPassConfig.createEmptyPass("afterModuleMotion"));
		if ((options.customPasses) != null) {
			passes.add(getCustomPasses(com.google.javascript.jscomp.CustomPassExecutionTime.AFTER_OPTIMIZATION_LOOP));
		}
		if (options.flowSensitiveInlineVariables) {
			passes.add(flowSensitiveInlineVariables);
			if (options.removeUnusedVars) {
				passes.add(removeUnusedVars);
			}
		}
		if (options.smartNameRemoval) {
			passes.add(smartNamePass2);
		}
		if (options.collapseAnonymousFunctions) {
			passes.add(collapseAnonymousFunctions);
		}
		if (options.moveFunctionDeclarations) {
			passes.add(moveFunctionDeclarations);
		}
		if ((options.anonymousFunctionNaming) == (com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.MAPPED)) {
			passes.add(nameMappedAnonymousFunctions);
		}
		if ((options.extractPrototypeMemberDeclarations) && (((options.propertyRenaming) != (com.google.javascript.jscomp.PropertyRenamingPolicy.HEURISTIC)) && ((options.propertyRenaming) != (com.google.javascript.jscomp.PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC)))) {
			passes.add(extractPrototypeMemberDeclarations);
		}
		if ((options.ambiguateProperties) && ((options.propertyRenaming) == (com.google.javascript.jscomp.PropertyRenamingPolicy.ALL_UNQUOTED))) {
			passes.add(ambiguateProperties);
		}
		if ((options.propertyRenaming) != (com.google.javascript.jscomp.PropertyRenamingPolicy.OFF)) {
			passes.add(renameProperties);
		}
		if (options.reserveRawExports) {
			passes.add(gatherRawExports);
		}
		if (options.convertToDottedProperties) {
			passes.add(convertToDottedProperties);
		}
		if (options.rewriteFunctionExpressions) {
			passes.add(rewriteFunctionExpressions);
		}
		if ((!(options.aliasableStrings.isEmpty())) || (options.aliasAllStrings)) {
			passes.add(aliasStrings);
		}
		if (options.aliasExternals) {
			passes.add(aliasExternals);
		}
		if (options.aliasKeywords) {
			passes.add(aliasKeywords);
		}
		passes.add(markUnnormalized);
		if (options.coalesceVariableNames) {
			passes.add(coalesceVariableNames);
			if (options.foldConstants) {
				passes.add(peepholeOptimizations);
			}
		}
		if (options.collapseVariableDeclarations) {
			passes.add(exploitAssign);
			passes.add(collapseVariableDeclarations);
		}
		passes.add(denormalize);
		if ((options.instrumentationTemplate) != null) {
			passes.add(instrumentFunctions);
		}
		if ((options.variableRenaming) != (com.google.javascript.jscomp.VariableRenamingPolicy.ALL)) {
			passes.add(invertContextualRenaming);
		}
		if ((options.variableRenaming) != (com.google.javascript.jscomp.VariableRenamingPolicy.OFF)) {
			passes.add(renameVars);
		}
		if (options.groupVariableDeclarations) {
			passes.add(groupVariableDeclarations);
		}
		if (options.processObjectPropertyString) {
			passes.add(objectPropertyStringPostprocess);
		}
		if (options.labelRenaming) {
			passes.add(renameLabels);
		}
		if (options.foldConstants) {
			passes.add(latePeepholeOptimizations);
		}
		if ((options.anonymousFunctionNaming) == (com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.UNMAPPED)) {
			passes.add(nameUnmappedAnonymousFunctions);
		}
		if (options.operaCompoundAssignFix) {
			passes.add(operaCompoundAssignFix);
		}
		passes.add(sanityCheckAst);
		passes.add(sanityCheckVars);
		return passes;
	}

	private java.util.List<com.google.javascript.jscomp.PassFactory> getMainOptimizationLoop() {
		java.util.List<com.google.javascript.jscomp.PassFactory> passes = com.google.common.collect.Lists.newArrayList();
		if (options.inlineGetters) {
			passes.add(inlineSimpleMethods);
		}
		passes.addAll(getCodeRemovingPasses());
		if ((options.inlineFunctions) || (options.inlineLocalFunctions)) {
			passes.add(inlineFunctions);
		}
		boolean runOptimizeCalls = ((options.optimizeCalls) || (options.optimizeParameters)) || (options.optimizeReturns);
		if ((options.removeUnusedVars) || (options.removeUnusedLocalVars)) {
			if (options.deadAssignmentElimination) {
				passes.add(deadAssignmentsElimination);
			}
			if (!runOptimizeCalls) {
				passes.add(removeUnusedVars);
			}
		}
		if (runOptimizeCalls) {
			passes.add(optimizeCallsAndRemoveUnusedVars);
		}
		assertAllLoopablePasses(passes);
		return passes;
	}

	private java.util.List<com.google.javascript.jscomp.PassFactory> getCodeRemovingPasses() {
		java.util.List<com.google.javascript.jscomp.PassFactory> passes = com.google.common.collect.Lists.newArrayList();
		if ((options.inlineVariables) || (options.inlineLocalVariables)) {
			passes.add(inlineVariables);
		}else
			if (options.inlineConstantVars) {
				passes.add(inlineConstants);
			}
		
		if (options.foldConstants) {
			passes.add(minimizeExitPoints);
			passes.add(peepholeOptimizations);
		}
		if (options.removeDeadCode) {
			passes.add(removeUnreachableCode);
		}
		if (options.removeUnusedPrototypeProperties) {
			passes.add(removeUnusedPrototypeProperties);
		}
		assertAllLoopablePasses(passes);
		return passes;
	}

	final com.google.javascript.jscomp.PassFactory suspiciousCode = new com.google.javascript.jscomp.PassFactory("suspiciousCode", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
			java.util.List<com.google.javascript.jscomp.NodeTraversal.Callback> sharedCallbacks = com.google.common.collect.Lists.newArrayList();
			if (options.checkSuspiciousCode) {
				sharedCallbacks.add(new com.google.javascript.jscomp.CheckAccidentalSemicolon(com.google.javascript.jscomp.CheckLevel.WARNING));
				sharedCallbacks.add(new com.google.javascript.jscomp.CheckSideEffects(com.google.javascript.jscomp.CheckLevel.WARNING));
			}
			if (options.enables(com.google.javascript.jscomp.DiagnosticGroups.GLOBAL_THIS)) {
				sharedCallbacks.add(new com.google.javascript.jscomp.CheckGlobalThis(compiler));
			}
			return com.google.javascript.jscomp.DefaultPassConfig.combineChecks(compiler, sharedCallbacks);
		}
	};

	private void assertAllOneTimePasses(java.util.List<com.google.javascript.jscomp.PassFactory> passes) {
		for (com.google.javascript.jscomp.PassFactory pass : passes) {
			com.google.common.base.Preconditions.checkState(pass.isOneTimePass());
		}
	}

	private void assertAllLoopablePasses(java.util.List<com.google.javascript.jscomp.PassFactory> passes) {
		for (com.google.javascript.jscomp.PassFactory pass : passes) {
			com.google.common.base.Preconditions.checkState((!(pass.isOneTimePass())));
		}
	}

	private final com.google.javascript.jscomp.PassFactory checkControlStructures = new com.google.javascript.jscomp.PassFactory("checkControlStructures", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.ControlStructureCheck(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory checkRequires = new com.google.javascript.jscomp.PassFactory("checkRequires", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CheckRequiresForConstructors(compiler, options.checkRequires);
		}
	};

	private final com.google.javascript.jscomp.PassFactory checkProvides = new com.google.javascript.jscomp.PassFactory("checkProvides", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CheckProvides(compiler, options.checkProvides);
		}
	};

	private static final com.google.javascript.jscomp.DiagnosticType GENERATE_EXPORTS_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_GENERATE_EXPORTS_ERROR", ("Exports can only be generated if export symbol/property " + "functions are set."));

	private final com.google.javascript.jscomp.PassFactory generateExports = new com.google.javascript.jscomp.PassFactory("generateExports", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			com.google.javascript.jscomp.CodingConvention convention = compiler.getCodingConvention();
			if (((convention.getExportSymbolFunction()) != null) && ((convention.getExportPropertyFunction()) != null)) {
				return new com.google.javascript.jscomp.GenerateExports(compiler, convention.getExportSymbolFunction(), convention.getExportPropertyFunction());
			}else {
				return new com.google.javascript.jscomp.ErrorPass(compiler, com.google.javascript.jscomp.DefaultPassConfig.GENERATE_EXPORTS_ERROR);
			}
		}
	};

	private final com.google.javascript.jscomp.PassFactory exportTestFunctions = new com.google.javascript.jscomp.PassFactory("exportTestFunctions", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			com.google.javascript.jscomp.CodingConvention convention = compiler.getCodingConvention();
			if ((convention.getExportSymbolFunction()) != null) {
				return new com.google.javascript.jscomp.ExportTestFunctions(compiler, convention.getExportSymbolFunction());
			}else {
				return new com.google.javascript.jscomp.ErrorPass(compiler, com.google.javascript.jscomp.DefaultPassConfig.GENERATE_EXPORTS_ERROR);
			}
		}
	};

	final com.google.javascript.jscomp.PassFactory gatherRawExports = new com.google.javascript.jscomp.PassFactory("gatherRawExports", false) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			final com.google.javascript.jscomp.GatherRawExports pass = new com.google.javascript.jscomp.GatherRawExports(compiler);
			return new com.google.javascript.jscomp.CompilerPass() {
				@java.lang.Override
				public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
					pass.process(externs, root);
					if ((exportedNames) == null) {
						exportedNames = com.google.common.collect.Sets.newHashSet();
					}
					exportedNames.addAll(pass.getExportedVariableNames());
				}
			};
		}
	};

	@java.lang.SuppressWarnings(value = "deprecation")
	final com.google.javascript.jscomp.DefaultPassConfig.HotSwapPassFactory closurePrimitives = new com.google.javascript.jscomp.DefaultPassConfig.HotSwapPassFactory("processProvidesAndRequires", false) {
		@java.lang.Override
		protected com.google.javascript.jscomp.HotSwapCompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			final com.google.javascript.jscomp.ProcessClosurePrimitives pass = new com.google.javascript.jscomp.ProcessClosurePrimitives(compiler, options.brokenClosureRequiresLevel, options.rewriteNewDateGoogNow);
			return new com.google.javascript.jscomp.HotSwapCompilerPass() {
				@java.lang.Override
				public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
					pass.process(externs, root);
					exportedNames = pass.getExportedVariableNames();
				}

				@java.lang.Override
				public void hotSwapScript(com.google.javascript.rhino.Node scriptRoot) {
					pass.hotSwapScript(scriptRoot);
				}
			};
		}
	};

	private final com.google.javascript.jscomp.PassFactory replaceMessages = new com.google.javascript.jscomp.PassFactory("replaceMessages", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.ReplaceMessages(compiler, options.messageBundle, true, com.google.javascript.jscomp.JsMessage.Style.getFromParams(true, false), false);
		}
	};

	final com.google.javascript.jscomp.PassFactory closureGoogScopeAliases = new com.google.javascript.jscomp.PassFactory("processGoogScopeAliases", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.ScopedAliases(compiler, options.getAliasTransformationHandler());
		}
	};

	private final com.google.javascript.jscomp.PassFactory closureCheckGetCssName = new com.google.javascript.jscomp.PassFactory("checkMissingGetCssName", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			java.lang.String blacklist = options.checkMissingGetCssNameBlacklist;
			com.google.common.base.Preconditions.checkState(((blacklist != null) && (!(blacklist.isEmpty()))), "Not checking use of goog.getCssName because of empty blacklist.");
			return new com.google.javascript.jscomp.CheckMissingGetCssName(compiler, options.checkMissingGetCssNameLevel, blacklist);
		}
	};

	private final com.google.javascript.jscomp.PassFactory closureReplaceGetCssName = new com.google.javascript.jscomp.PassFactory("renameCssNames", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CompilerPass() {
				@java.lang.Override
				public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node jsRoot) {
					java.util.Map<java.lang.String, java.lang.Integer> newCssNames = null;
					if (options.gatherCssNames) {
						newCssNames = com.google.common.collect.Maps.newHashMap();
					}
					new com.google.javascript.jscomp.ReplaceCssNames(compiler, newCssNames).process(externs, jsRoot);
					cssNames = newCssNames;
				}
			};
		}
	};

	private final com.google.javascript.jscomp.PassFactory createSyntheticBlocks = new com.google.javascript.jscomp.PassFactory("createSyntheticBlocks", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CreateSyntheticBlocks(compiler, options.syntheticBlockStartMarker, options.syntheticBlockEndMarker);
		}
	};

	private final com.google.javascript.jscomp.PassFactory peepholeOptimizations = new com.google.javascript.jscomp.PassFactory("peepholeOptimizations", false) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.PeepholeOptimizationsPass(compiler, new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true), new com.google.javascript.jscomp.PeepholeRemoveDeadCode(), new com.google.javascript.jscomp.PeepholeFoldConstants(), new com.google.javascript.jscomp.PeepholeCollectPropertyAssignments());
		}
	};

	private final com.google.javascript.jscomp.PassFactory latePeepholeOptimizations = new com.google.javascript.jscomp.PassFactory("peepholeOptimizations", false) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.PeepholeOptimizationsPass(compiler, new com.google.javascript.jscomp.StatementFusion(), new com.google.javascript.jscomp.PeepholeRemoveDeadCode(), new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false), new com.google.javascript.jscomp.PeepholeFoldConstants());
		}
	};

	private final com.google.javascript.jscomp.DefaultPassConfig.HotSwapPassFactory checkVars = new com.google.javascript.jscomp.DefaultPassConfig.HotSwapPassFactory("checkVars", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.HotSwapCompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.VarCheck(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory checkRegExp = new com.google.javascript.jscomp.PassFactory("checkRegExp", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
			final com.google.javascript.jscomp.CheckRegExp pass = new com.google.javascript.jscomp.CheckRegExp(compiler);
			return new com.google.javascript.jscomp.CompilerPass() {
				@java.lang.Override
				public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
					pass.process(externs, root);
					compiler.setHasRegExpGlobalReferences(pass.isGlobalRegExpPropertiesUsed());
				}
			};
		}
	};

	private final com.google.javascript.jscomp.PassFactory checkShadowVars = new com.google.javascript.jscomp.PassFactory("variableShadowDeclarationCheck", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.VariableShadowDeclarationCheck(compiler, options.checkShadowVars);
		}
	};

	private final com.google.javascript.jscomp.PassFactory checkVariableReferences = new com.google.javascript.jscomp.PassFactory("checkVariableReferences", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.VariableReferenceCheck(compiler, options.aggressiveVarCheck);
		}
	};

	private final com.google.javascript.jscomp.PassFactory objectPropertyStringPreprocess = new com.google.javascript.jscomp.PassFactory("ObjectPropertyStringPreprocess", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.ObjectPropertyStringPreprocess(compiler);
		}
	};

	final com.google.javascript.jscomp.DefaultPassConfig.HotSwapPassFactory resolveTypes = new com.google.javascript.jscomp.DefaultPassConfig.HotSwapPassFactory("resolveTypes", false) {
		@java.lang.Override
		protected com.google.javascript.jscomp.HotSwapCompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.DefaultPassConfig.GlobalTypeResolver(compiler);
		}
	};

	final com.google.javascript.jscomp.DefaultPassConfig.HotSwapPassFactory inferTypes = new com.google.javascript.jscomp.DefaultPassConfig.HotSwapPassFactory("inferTypes", false) {
		@java.lang.Override
		protected com.google.javascript.jscomp.HotSwapCompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.HotSwapCompilerPass() {
				@java.lang.Override
				public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
					com.google.common.base.Preconditions.checkNotNull(topScope);
					com.google.common.base.Preconditions.checkNotNull(getTypedScopeCreator());
					makeTypeInference(compiler).process(externs, root);
				}

				@java.lang.Override
				public void hotSwapScript(com.google.javascript.rhino.Node scriptRoot) {
					makeTypeInference(compiler).inferTypes(scriptRoot);
				}
			};
		}
	};

	final com.google.javascript.jscomp.PassFactory inferJsDocInfo = new com.google.javascript.jscomp.PassFactory("inferJsDocInfo", false) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CompilerPass() {
				@java.lang.Override
				public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
					com.google.common.base.Preconditions.checkNotNull(topScope);
					com.google.common.base.Preconditions.checkNotNull(getTypedScopeCreator());
					makeInferJsDocInfo(compiler).process(externs, root);
				}
			};
		}
	};

	private final com.google.javascript.jscomp.DefaultPassConfig.HotSwapPassFactory checkTypes = new com.google.javascript.jscomp.DefaultPassConfig.HotSwapPassFactory("checkTypes", false) {
		@java.lang.Override
		protected com.google.javascript.jscomp.HotSwapCompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.HotSwapCompilerPass() {
				@java.lang.Override
				public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
					com.google.common.base.Preconditions.checkNotNull(topScope);
					com.google.common.base.Preconditions.checkNotNull(getTypedScopeCreator());
					com.google.javascript.jscomp.TypeCheck check = makeTypeCheck(compiler);
					check.process(externs, root);
					compiler.getErrorManager().setTypedPercent(check.getTypedPercent());
				}

				@java.lang.Override
				public void hotSwapScript(com.google.javascript.rhino.Node scriptRoot) {
					makeTypeCheck(compiler).check(scriptRoot, false);
				}
			};
		}
	};

	private final com.google.javascript.jscomp.PassFactory checkControlFlow = new com.google.javascript.jscomp.PassFactory("checkControlFlow", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			java.util.List<com.google.javascript.jscomp.NodeTraversal.Callback> callbacks = com.google.common.collect.Lists.newArrayList();
			if (options.checkUnreachableCode.isOn()) {
				callbacks.add(new com.google.javascript.jscomp.CheckUnreachableCode(compiler, options.checkUnreachableCode));
			}
			if ((options.checkMissingReturn.isOn()) && (options.checkTypes)) {
				callbacks.add(new com.google.javascript.jscomp.CheckMissingReturn(compiler, options.checkMissingReturn));
			}
			return com.google.javascript.jscomp.DefaultPassConfig.combineChecks(compiler, callbacks);
		}
	};

	private final com.google.javascript.jscomp.DefaultPassConfig.HotSwapPassFactory checkAccessControls = new com.google.javascript.jscomp.DefaultPassConfig.HotSwapPassFactory("checkAccessControls", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.HotSwapCompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CheckAccessControls(compiler);
		}
	};

	private static com.google.javascript.jscomp.CompilerPass combineChecks(com.google.javascript.jscomp.AbstractCompiler compiler, java.util.List<com.google.javascript.jscomp.NodeTraversal.Callback> callbacks) {
		com.google.common.base.Preconditions.checkArgument(((callbacks.size()) > 0));
		com.google.javascript.jscomp.NodeTraversal.Callback[] array = callbacks.toArray(new com.google.javascript.jscomp.NodeTraversal.Callback[callbacks.size()]);
		return new com.google.javascript.jscomp.CombinedCompilerPass(compiler, array);
	}

	private class GlobalTypeResolver implements com.google.javascript.jscomp.HotSwapCompilerPass {
		private final com.google.javascript.jscomp.AbstractCompiler compiler;

		GlobalTypeResolver(com.google.javascript.jscomp.AbstractCompiler compiler) {
			this.compiler = compiler;
		}

		@java.lang.Override
		public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
			if ((topScope) == null) {
				regenerateGlobalTypedScope(compiler, root.getParent());
			}else {
				compiler.getTypeRegistry().resolveTypesInScope(topScope);
			}
		}

		@java.lang.Override
		public void hotSwapScript(com.google.javascript.rhino.Node scriptRoot) {
			regenerateGlobalTypedScope(compiler, compiler.getRoot());
		}
	}

	private final com.google.javascript.jscomp.PassFactory checkGlobalNames = new com.google.javascript.jscomp.PassFactory("Check names", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CompilerPass() {
				@java.lang.Override
				public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node jsRoot) {
					namespaceForChecks = new com.google.javascript.jscomp.GlobalNamespace(compiler, jsRoot);
					new com.google.javascript.jscomp.CheckGlobalNames(compiler, options.checkGlobalNamesLevel).injectNamespace(namespaceForChecks).process(externs, jsRoot);
				}
			};
		}
	};

	private final com.google.javascript.jscomp.PassFactory checkSuspiciousProperties = new com.google.javascript.jscomp.PassFactory("checkSuspiciousProperties", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.SuspiciousPropertiesCheck(compiler, options.checkUndefinedProperties, (options.checkUnusedPropertiesEarly ? com.google.javascript.jscomp.CheckLevel.WARNING : com.google.javascript.jscomp.CheckLevel.OFF));
		}
	};

	private final com.google.javascript.jscomp.PassFactory checkStrictMode = new com.google.javascript.jscomp.PassFactory("checkStrictMode", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.StrictModeCheck(compiler, (!(options.checkSymbols)), (!(options.checkCaja)));
		}
	};

	final com.google.javascript.jscomp.PassFactory processTweaks = new com.google.javascript.jscomp.PassFactory("processTweaks", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CompilerPass() {
				@java.lang.Override
				public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node jsRoot) {
					new com.google.javascript.jscomp.ProcessTweaks(compiler, options.getTweakProcessing().shouldStrip(), options.getTweakReplacements()).process(externs, jsRoot);
				}
			};
		}
	};

	final com.google.javascript.jscomp.PassFactory processDefines = new com.google.javascript.jscomp.PassFactory("processDefines", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CompilerPass() {
				@java.lang.Override
				public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node jsRoot) {
					java.util.Map<java.lang.String, com.google.javascript.rhino.Node> replacements = com.google.javascript.jscomp.DefaultPassConfig.getAdditionalReplacements(options);
					replacements.putAll(options.getDefineReplacements());
					new com.google.javascript.jscomp.ProcessDefines(compiler, replacements).injectNamespace(namespaceForChecks).process(externs, jsRoot);
					namespaceForChecks = null;
				}
			};
		}
	};

	private final com.google.javascript.jscomp.PassFactory checkConsts = new com.google.javascript.jscomp.PassFactory("checkConsts", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.ConstCheck(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory computeFunctionNames = new com.google.javascript.jscomp.PassFactory("computeFunctionNames", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return functionNames = new com.google.javascript.jscomp.FunctionNames(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory ignoreCajaProperties = new com.google.javascript.jscomp.PassFactory("ignoreCajaProperties", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.IgnoreCajaProperties(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory runtimeTypeCheck = new com.google.javascript.jscomp.PassFactory("runtimeTypeCheck", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.RuntimeTypeCheck(compiler, options.runtimeTypeCheckLogFunction);
		}
	};

	private final com.google.javascript.jscomp.PassFactory replaceIdGenerators = new com.google.javascript.jscomp.PassFactory("replaceIdGenerators", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CompilerPass() {
				@java.lang.Override
				public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
					com.google.javascript.jscomp.ReplaceIdGenerators pass = new com.google.javascript.jscomp.ReplaceIdGenerators(compiler, options.idGenerators);
					pass.process(externs, root);
					idGeneratorMap = pass.getIdGeneratorMap();
				}
			};
		}
	};

	private final com.google.javascript.jscomp.PassFactory replaceStrings = new com.google.javascript.jscomp.PassFactory("replaceStrings", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CompilerPass() {
				@java.lang.Override
				public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
					com.google.javascript.jscomp.ReplaceStrings pass = new com.google.javascript.jscomp.ReplaceStrings(compiler, options.replaceStringsPlaceholderToken, options.replaceStringsFunctionDescriptions, options.replaceStringsReservedStrings);
					pass.process(externs, root);
					stringMap = pass.getStringMap();
				}
			};
		}
	};

	private final com.google.javascript.jscomp.PassFactory optimizeArgumentsArray = new com.google.javascript.jscomp.PassFactory("optimizeArgumentsArray", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.OptimizeArgumentsArray(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory closureCodeRemoval = new com.google.javascript.jscomp.PassFactory("closureCodeRemoval", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.ClosureCodeRemoval(compiler, options.removeAbstractMethods, options.removeClosureAsserts);
		}
	};

	private final com.google.javascript.jscomp.PassFactory closureOptimizePrimitives = new com.google.javascript.jscomp.PassFactory("closureOptimizePrimitives", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.ClosureOptimizePrimitives(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory collapseProperties = new com.google.javascript.jscomp.PassFactory("collapseProperties", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CollapseProperties(compiler, options.collapsePropertiesOnExternTypes, (!(isInliningForbidden())));
		}
	};

	private final com.google.javascript.jscomp.PassFactory tightenTypesBuilder = new com.google.javascript.jscomp.PassFactory("tightenTypes", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			if (!(options.checkTypes)) {
				return new com.google.javascript.jscomp.ErrorPass(compiler, com.google.javascript.jscomp.DefaultPassConfig.TIGHTEN_TYPES_WITHOUT_TYPE_CHECK);
			}
			tightenTypes = new com.google.javascript.jscomp.TightenTypes(compiler);
			return tightenTypes;
		}
	};

	private final com.google.javascript.jscomp.PassFactory disambiguateProperties = new com.google.javascript.jscomp.PassFactory("disambiguateProperties", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			if ((tightenTypes) == null) {
				return com.google.javascript.jscomp.DisambiguateProperties.forJSTypeSystem(compiler);
			}else {
				return com.google.javascript.jscomp.DisambiguateProperties.forConcreteTypeSystem(compiler, tightenTypes);
			}
		}
	};

	private final com.google.javascript.jscomp.PassFactory chainCalls = new com.google.javascript.jscomp.PassFactory("chainCalls", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.ChainCalls(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory devirtualizePrototypeMethods = new com.google.javascript.jscomp.PassFactory("devirtualizePrototypeMethods", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.DevirtualizePrototypeMethods(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory optimizeCallsAndRemoveUnusedVars = new com.google.javascript.jscomp.PassFactory("optimizeCalls_and_removeUnusedVars", false) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			com.google.javascript.jscomp.OptimizeCalls passes = new com.google.javascript.jscomp.OptimizeCalls(compiler);
			if (options.optimizeReturns) {
				passes.addPass(new com.google.javascript.jscomp.OptimizeReturns(compiler));
			}
			if (options.optimizeParameters) {
				passes.addPass(new com.google.javascript.jscomp.OptimizeParameters(compiler));
			}
			if (options.optimizeCalls) {
				boolean removeOnlyLocals = (options.removeUnusedLocalVars) && (!(options.removeUnusedVars));
				boolean preserveAnonymousFunctionNames = (options.anonymousFunctionNaming) != (com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF);
				passes.addPass(new com.google.javascript.jscomp.RemoveUnusedVars(compiler, (!removeOnlyLocals), preserveAnonymousFunctionNames, true));
			}
			return passes;
		}
	};

	private final com.google.javascript.jscomp.PassFactory markPureFunctions = new com.google.javascript.jscomp.PassFactory("markPureFunctions", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.PureFunctionIdentifier.Driver(compiler, options.debugFunctionSideEffectsPath, false);
		}
	};

	private final com.google.javascript.jscomp.PassFactory markNoSideEffectCalls = new com.google.javascript.jscomp.PassFactory("markNoSideEffectCalls", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.MarkNoSideEffectCalls(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory inlineVariables = new com.google.javascript.jscomp.PassFactory("inlineVariables", false) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			if (isInliningForbidden()) {
				return new com.google.javascript.jscomp.ErrorPass(compiler, com.google.javascript.jscomp.DefaultPassConfig.CANNOT_USE_PROTOTYPE_AND_VAR);
			}else {
				com.google.javascript.jscomp.InlineVariables.Mode mode;
				if (options.inlineVariables) {
					mode = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
				}else
					if (options.inlineLocalVariables) {
						mode = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
					}else {
						throw new java.lang.IllegalStateException("No variable inlining option set.");
					}
				
				return new com.google.javascript.jscomp.InlineVariables(compiler, mode, true);
			}
		}
	};

	private final com.google.javascript.jscomp.PassFactory inlineConstants = new com.google.javascript.jscomp.PassFactory("inlineConstants", false) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.InlineVariables(compiler, com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY, true);
		}
	};

	private final com.google.javascript.jscomp.PassFactory minimizeExitPoints = new com.google.javascript.jscomp.PassFactory("minimizeExitPoints", false) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.MinimizeExitPoints(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory removeUnreachableCode = new com.google.javascript.jscomp.PassFactory("removeUnreachableCode", false) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.UnreachableCodeElimination(compiler, true);
		}
	};

	private final com.google.javascript.jscomp.PassFactory removeUnusedPrototypeProperties = new com.google.javascript.jscomp.PassFactory("removeUnusedPrototypeProperties", false) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.RemoveUnusedPrototypeProperties(compiler, options.removeUnusedPrototypePropertiesInExterns, (!(options.removeUnusedVars)));
		}
	};

	private final com.google.javascript.jscomp.PassFactory smartNamePass = new com.google.javascript.jscomp.PassFactory("smartNamePass", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CompilerPass() {
				@java.lang.Override
				public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
					com.google.javascript.jscomp.NameAnalyzer na = new com.google.javascript.jscomp.NameAnalyzer(compiler, false);
					na.process(externs, root);
					java.lang.String reportPath = options.reportPath;
					if (reportPath != null) {
						try {
							com.google.common.io.Files.write(na.getHtmlReport(), new java.io.File(reportPath), com.google.common.base.Charsets.UTF_8);
						} catch (java.io.IOException e) {
							compiler.report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.DefaultPassConfig.REPORT_PATH_IO_ERROR, reportPath));
						}
					}
					if (options.smartNameRemoval) {
						na.removeUnreferenced();
					}
				}
			};
		}
	};

	private final com.google.javascript.jscomp.PassFactory smartNamePass2 = new com.google.javascript.jscomp.PassFactory("smartNamePass", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CompilerPass() {
				@java.lang.Override
				public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
					com.google.javascript.jscomp.NameAnalyzer na = new com.google.javascript.jscomp.NameAnalyzer(compiler, false);
					na.process(externs, root);
					na.removeUnreferenced();
				}
			};
		}
	};

	private final com.google.javascript.jscomp.PassFactory inlineSimpleMethods = new com.google.javascript.jscomp.PassFactory("inlineSimpleMethods", false) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.InlineSimpleMethods(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory deadAssignmentsElimination = new com.google.javascript.jscomp.PassFactory("deadAssignmentsElimination", false) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.DeadAssignmentsElimination(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory inlineFunctions = new com.google.javascript.jscomp.PassFactory("inlineFunctions", false) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			boolean enableBlockInlining = !(isInliningForbidden());
			return new com.google.javascript.jscomp.InlineFunctions(compiler, compiler.getUniqueNameIdSupplier(), options.inlineFunctions, options.inlineLocalFunctions, enableBlockInlining);
		}
	};

	private final com.google.javascript.jscomp.PassFactory removeUnusedVars = new com.google.javascript.jscomp.PassFactory("removeUnusedVars", false) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			boolean removeOnlyLocals = (options.removeUnusedLocalVars) && (!(options.removeUnusedVars));
			boolean preserveAnonymousFunctionNames = (options.anonymousFunctionNaming) != (com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF);
			return new com.google.javascript.jscomp.RemoveUnusedVars(compiler, (!removeOnlyLocals), preserveAnonymousFunctionNames, false);
		}
	};

	private final com.google.javascript.jscomp.PassFactory crossModuleCodeMotion = new com.google.javascript.jscomp.PassFactory("crossModuleCodeMotion", false) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CrossModuleCodeMotion(compiler, compiler.getModuleGraph());
		}
	};

	private final com.google.javascript.jscomp.PassFactory crossModuleMethodMotion = new com.google.javascript.jscomp.PassFactory("crossModuleMethodMotion", false) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CrossModuleMethodMotion(compiler, crossModuleIdGenerator, options.removeUnusedPrototypePropertiesInExterns);
		}
	};

	private final com.google.javascript.jscomp.PassFactory specializeInitialModule = new com.google.javascript.jscomp.PassFactory("specializeInitialModule", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.SpecializeModule(compiler, devirtualizePrototypeMethods, inlineFunctions, removeUnusedPrototypeProperties);
		}
	};

	private final com.google.javascript.jscomp.PassFactory flowSensitiveInlineVariables = new com.google.javascript.jscomp.PassFactory("flowSensitiveInlineVariables", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.FlowSensitiveInlineVariables(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory coalesceVariableNames = new com.google.javascript.jscomp.PassFactory("coalesceVariableNames", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CoalesceVariableNames(compiler, options.generatePseudoNames);
		}
	};

	private final com.google.javascript.jscomp.PassFactory exploitAssign = new com.google.javascript.jscomp.PassFactory("expointAssign", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.PeepholeOptimizationsPass(compiler, new com.google.javascript.jscomp.ExploitAssigns());
		}
	};

	private final com.google.javascript.jscomp.PassFactory collapseVariableDeclarations = new com.google.javascript.jscomp.PassFactory("collapseVariableDeclarations", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CollapseVariableDeclarations(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory groupVariableDeclarations = new com.google.javascript.jscomp.PassFactory("groupVariableDeclarations", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.GroupVariableDeclarations(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory extractPrototypeMemberDeclarations = new com.google.javascript.jscomp.PassFactory("extractPrototypeMemberDeclarations", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory rewriteFunctionExpressions = new com.google.javascript.jscomp.PassFactory("rewriteFunctionExpressions", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.FunctionRewriter(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory collapseAnonymousFunctions = new com.google.javascript.jscomp.PassFactory("collapseAnonymousFunctions", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CollapseAnonymousFunctions(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory moveFunctionDeclarations = new com.google.javascript.jscomp.PassFactory("moveFunctionDeclarations", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.MoveFunctionDeclarations(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory nameUnmappedAnonymousFunctions = new com.google.javascript.jscomp.PassFactory("nameAnonymousFunctions", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.NameAnonymousFunctions(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory nameMappedAnonymousFunctions = new com.google.javascript.jscomp.PassFactory("nameAnonymousFunctions", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CompilerPass() {
				@java.lang.Override
				public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
					com.google.javascript.jscomp.NameAnonymousFunctionsMapped naf = new com.google.javascript.jscomp.NameAnonymousFunctionsMapped(compiler);
					naf.process(externs, root);
					anonymousFunctionNameMap = naf.getFunctionMap();
				}
			};
		}
	};

	private final com.google.javascript.jscomp.PassFactory operaCompoundAssignFix = new com.google.javascript.jscomp.PassFactory("operaCompoundAssignFix", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.OperaCompoundAssignFix(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory aliasExternals = new com.google.javascript.jscomp.PassFactory("aliasExternals", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.AliasExternals(compiler, compiler.getModuleGraph(), options.unaliasableGlobals, options.aliasableGlobals);
		}
	};

	private final com.google.javascript.jscomp.PassFactory aliasStrings = new com.google.javascript.jscomp.PassFactory("aliasStrings", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.AliasStrings(compiler, compiler.getModuleGraph(), (options.aliasAllStrings ? null : options.aliasableStrings), options.aliasStringsBlacklist, options.outputJsStringUsage);
		}
	};

	private final com.google.javascript.jscomp.PassFactory aliasKeywords = new com.google.javascript.jscomp.PassFactory("aliasKeywords", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.AliasKeywords(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory objectPropertyStringPostprocess = new com.google.javascript.jscomp.PassFactory("ObjectPropertyStringPostprocess", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.ObjectPropertyStringPostprocess(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory ambiguateProperties = new com.google.javascript.jscomp.PassFactory("ambiguateProperties", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.AmbiguateProperties(compiler, options.anonymousFunctionNaming.getReservedCharacters());
		}
	};

	private final com.google.javascript.jscomp.PassFactory markUnnormalized = new com.google.javascript.jscomp.PassFactory("markUnnormalized", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CompilerPass() {
				@java.lang.Override
				public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
					compiler.setLifeCycleStage(com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage.RAW);
				}
			};
		}
	};

	private final com.google.javascript.jscomp.PassFactory denormalize = new com.google.javascript.jscomp.PassFactory("denormalize", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.Denormalize(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory invertContextualRenaming = new com.google.javascript.jscomp.PassFactory("invertNames", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return com.google.javascript.jscomp.MakeDeclaredNamesUnique.getContextualRenameInverter(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory renameProperties = new com.google.javascript.jscomp.PassFactory("renameProperties", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
			com.google.javascript.jscomp.VariableMap map = null;
			if ((options.inputPropertyMapSerialized) != null) {
				try {
					map = com.google.javascript.jscomp.VariableMap.fromBytes(options.inputPropertyMapSerialized);
				} catch (java.text.ParseException e) {
					return new com.google.javascript.jscomp.ErrorPass(compiler, com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.DefaultPassConfig.INPUT_MAP_PROP_PARSE, e.getMessage()));
				}
			}
			final com.google.javascript.jscomp.VariableMap prevPropertyMap = map;
			return new com.google.javascript.jscomp.CompilerPass() {
				@java.lang.Override
				public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
					propertyMap = runPropertyRenaming(compiler, prevPropertyMap, externs, root);
				}
			};
		}
	};

	private com.google.javascript.jscomp.VariableMap runPropertyRenaming(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.VariableMap prevPropertyMap, com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		char[] reservedChars = options.anonymousFunctionNaming.getReservedCharacters();
		switch (options.propertyRenaming) {
			case HEURISTIC :
				com.google.javascript.jscomp.RenamePrototypes rproto = new com.google.javascript.jscomp.RenamePrototypes(compiler, false, reservedChars, prevPropertyMap);
				rproto.process(externs, root);
				return rproto.getPropertyMap();
			case AGGRESSIVE_HEURISTIC :
				com.google.javascript.jscomp.RenamePrototypes rproto2 = new com.google.javascript.jscomp.RenamePrototypes(compiler, true, reservedChars, prevPropertyMap);
				rproto2.process(externs, root);
				return rproto2.getPropertyMap();
			case ALL_UNQUOTED :
				com.google.javascript.jscomp.RenameProperties rprop = new com.google.javascript.jscomp.RenameProperties(compiler, options.propertyAffinity, options.generatePseudoNames, prevPropertyMap, reservedChars);
				rprop.process(externs, root);
				return rprop.getPropertyMap();
			default :
				throw new java.lang.IllegalStateException("Unrecognized property renaming policy");
		}
	}

	private final com.google.javascript.jscomp.PassFactory renameVars = new com.google.javascript.jscomp.PassFactory("renameVars", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
			com.google.javascript.jscomp.VariableMap map = null;
			if ((options.inputVariableMapSerialized) != null) {
				try {
					map = com.google.javascript.jscomp.VariableMap.fromBytes(options.inputVariableMapSerialized);
				} catch (java.text.ParseException e) {
					return new com.google.javascript.jscomp.ErrorPass(compiler, com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.DefaultPassConfig.INPUT_MAP_VAR_PARSE, e.getMessage()));
				}
			}
			final com.google.javascript.jscomp.VariableMap prevVariableMap = map;
			return new com.google.javascript.jscomp.CompilerPass() {
				@java.lang.Override
				public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
					variableMap = runVariableRenaming(compiler, prevVariableMap, externs, root);
				}
			};
		}
	};

	private com.google.javascript.jscomp.VariableMap runVariableRenaming(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.VariableMap prevVariableMap, com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		char[] reservedChars = options.anonymousFunctionNaming.getReservedCharacters();
		boolean preserveAnonymousFunctionNames = (options.anonymousFunctionNaming) != (com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF);
		com.google.javascript.jscomp.RenameVars rn = new com.google.javascript.jscomp.RenameVars(compiler, options.renamePrefix, ((options.variableRenaming) == (com.google.javascript.jscomp.VariableRenamingPolicy.LOCAL)), preserveAnonymousFunctionNames, options.generatePseudoNames, options.shadowVariables, prevVariableMap, reservedChars, exportedNames);
		rn.process(externs, root);
		return rn.getVariableMap();
	}

	private final com.google.javascript.jscomp.PassFactory renameLabels = new com.google.javascript.jscomp.PassFactory("renameLabels", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.RenameLabels(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory convertToDottedProperties = new com.google.javascript.jscomp.PassFactory("convertToDottedProperties", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.ConvertToDottedProperties(compiler);
		}
	};

	private final com.google.javascript.jscomp.PassFactory sanityCheckAst = new com.google.javascript.jscomp.PassFactory("sanityCheckAst", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.AstValidator();
		}
	};

	private final com.google.javascript.jscomp.PassFactory sanityCheckVars = new com.google.javascript.jscomp.PassFactory("sanityCheckVars", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.VarCheck(compiler, true);
		}
	};

	private final com.google.javascript.jscomp.PassFactory instrumentFunctions = new com.google.javascript.jscomp.PassFactory("instrumentFunctions", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CompilerPass() {
				@java.lang.Override
				public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
					try {
						java.io.FileReader templateFile = new java.io.FileReader(options.instrumentationTemplate);
						new com.google.javascript.jscomp.InstrumentFunctions(compiler, functionNames, options.instrumentationTemplate, options.appNameStr, templateFile).process(externs, root);
					} catch (java.io.IOException e) {
						compiler.report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.AbstractCompiler.READ_ERROR, options.instrumentationTemplate));
					}
				}
			};
		}
	};

	private static com.google.javascript.jscomp.PassFactory createEmptyPass(java.lang.String name) {
		return new com.google.javascript.jscomp.PassFactory(name, true) {
			@java.lang.Override
			protected com.google.javascript.jscomp.CompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
				return com.google.javascript.jscomp.DefaultPassConfig.runInSerial();
			}
		};
	}

	private com.google.javascript.jscomp.PassFactory getCustomPasses(final com.google.javascript.jscomp.CustomPassExecutionTime executionTime) {
		return new com.google.javascript.jscomp.PassFactory("runCustomPasses", true) {
			@java.lang.Override
			protected com.google.javascript.jscomp.CompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
				return com.google.javascript.jscomp.DefaultPassConfig.runInSerial(options.customPasses.get(executionTime));
			}
		};
	}

	private boolean isInliningForbidden() {
		return ((options.propertyRenaming) == (com.google.javascript.jscomp.PropertyRenamingPolicy.HEURISTIC)) || ((options.propertyRenaming) == (com.google.javascript.jscomp.PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC));
	}

	private static com.google.javascript.jscomp.CompilerPass runInSerial(final com.google.javascript.jscomp.CompilerPass... passes) {
		return com.google.javascript.jscomp.DefaultPassConfig.runInSerial(com.google.common.collect.Lists.newArrayList(passes));
	}

	private static com.google.javascript.jscomp.CompilerPass runInSerial(final java.util.Collection<com.google.javascript.jscomp.CompilerPass> passes) {
		return new com.google.javascript.jscomp.CompilerPass() {
			@java.lang.Override
			public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
				for (com.google.javascript.jscomp.CompilerPass pass : passes) {
					pass.process(externs, root);
				}
			}
		};
	}

	@com.google.common.annotations.VisibleForTesting
	static java.util.Map<java.lang.String, com.google.javascript.rhino.Node> getAdditionalReplacements(com.google.javascript.jscomp.CompilerOptions options) {
		java.util.Map<java.lang.String, com.google.javascript.rhino.Node> additionalReplacements = com.google.common.collect.Maps.newHashMap();
		if ((options.markAsCompiled) || (options.closurePass)) {
			additionalReplacements.put(com.google.javascript.jscomp.DefaultPassConfig.COMPILED_CONSTANT_NAME, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.TRUE));
		}
		if ((options.closurePass) && ((options.locale) != null)) {
			additionalReplacements.put(com.google.javascript.jscomp.DefaultPassConfig.CLOSURE_LOCALE_CONSTANT_NAME, com.google.javascript.rhino.Node.newString(options.locale));
		}
		return additionalReplacements;
	}

	private final com.google.javascript.jscomp.PassFactory printNameReferenceGraph = new com.google.javascript.jscomp.PassFactory("printNameReferenceGraph", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CompilerPass() {
				@java.lang.Override
				public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node jsRoot) {
					com.google.javascript.jscomp.NameReferenceGraphConstruction gc = new com.google.javascript.jscomp.NameReferenceGraphConstruction(compiler);
					gc.process(externs, jsRoot);
					java.lang.String graphFileName = options.nameReferenceGraphPath;
					try {
						com.google.common.io.Files.write(com.google.javascript.jscomp.DotFormatter.toDot(gc.getNameReferenceGraph()), new java.io.File(graphFileName), com.google.common.base.Charsets.UTF_8);
					} catch (java.io.IOException e) {
						compiler.report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.DefaultPassConfig.NAME_REF_GRAPH_FILE_ERROR, e.getMessage(), graphFileName));
					}
				}
			};
		}
	};

	private final com.google.javascript.jscomp.PassFactory printNameReferenceReport = new com.google.javascript.jscomp.PassFactory("printNameReferenceReport", true) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass createInternal(final com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.CompilerPass() {
				@java.lang.Override
				public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node jsRoot) {
					com.google.javascript.jscomp.NameReferenceGraphConstruction gc = new com.google.javascript.jscomp.NameReferenceGraphConstruction(compiler);
					java.lang.String reportFileName = options.nameReferenceReportPath;
					try {
						com.google.javascript.jscomp.NameReferenceGraphReport report = new com.google.javascript.jscomp.NameReferenceGraphReport(gc.getNameReferenceGraph());
						com.google.common.io.Files.write(report.getHtmlReport(), new java.io.File(reportFileName), com.google.common.base.Charsets.UTF_8);
					} catch (java.io.IOException e) {
						compiler.report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.DefaultPassConfig.NAME_REF_REPORT_FILE_ERROR, e.getMessage(), reportFileName));
					}
				}
			};
		}
	};

	abstract static class HotSwapPassFactory extends com.google.javascript.jscomp.PassFactory {
		HotSwapPassFactory(java.lang.String name, boolean isOneTimePass) {
			super(name, isOneTimePass);
		}

		@java.lang.Override
		protected abstract com.google.javascript.jscomp.HotSwapCompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler);

		@java.lang.Override
		com.google.javascript.jscomp.HotSwapCompilerPass getHotSwapPass(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return com.google.javascript.jscomp.DefaultPassConfig.HotSwapPassFactory.this.createInternal(compiler);
		}
	}
}


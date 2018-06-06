

package com.google.javascript.jscomp;


public class Compiler extends com.google.javascript.jscomp.AbstractCompiler {
	static final java.lang.String SINGLETON_MODULE_NAME = "[singleton]";

	static final com.google.javascript.jscomp.DiagnosticType MODULE_DEPENDENCY_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_MODULE_DEPENDENCY_ERROR", ("Bad dependency: {0} -> {1}. " + "Modules must be listed in dependency order."));

	static final com.google.javascript.jscomp.DiagnosticType MISSING_ENTRY_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_MISSING_ENTRY_ERROR", "required entry point \"{0}\" never provided");

	static final com.google.javascript.jscomp.DiagnosticType MISSING_MODULE_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_MISSING_ENTRY_ERROR", "unknown module \"{0}\" specified in entry point spec");

	static final java.lang.String PARSING_PASS_NAME = "parseInputs";

	private static final java.lang.String CONFIG_RESOURCE = "com.google.javascript.jscomp.parsing.ParserConfig";

	com.google.javascript.jscomp.CompilerOptions options = null;

	private com.google.javascript.jscomp.PassConfig passes = null;

	private java.util.List<com.google.javascript.jscomp.CompilerInput> externs;

	private java.util.List<com.google.javascript.jscomp.JSModule> modules;

	private com.google.javascript.jscomp.JSModuleGraph moduleGraph;

	private java.util.List<com.google.javascript.jscomp.CompilerInput> inputs;

	private com.google.javascript.jscomp.ErrorManager errorManager;

	private com.google.javascript.jscomp.WarningsGuard warningsGuard;

	private final java.util.Map<java.lang.String, com.google.javascript.rhino.Node> injectedLibraries = com.google.common.collect.Maps.newLinkedHashMap();

	com.google.javascript.rhino.Node externsRoot;

	com.google.javascript.rhino.Node jsRoot;

	com.google.javascript.rhino.Node externAndJsRoot;

	private java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputsById;

	private com.google.javascript.jscomp.SourceMap sourceMap;

	private java.lang.String externExports = null;

	private int uniqueNameId = 0;

	private boolean hasRegExpGlobalReferences = true;

	private com.google.javascript.jscomp.FunctionInformationMap functionInformationMap;

	private final java.lang.StringBuilder debugLog = new java.lang.StringBuilder();

	com.google.javascript.jscomp.CodingConvention defaultCodingConvention = new com.google.javascript.jscomp.ClosureCodingConvention();

	private com.google.javascript.rhino.jstype.JSTypeRegistry typeRegistry;

	private com.google.javascript.jscomp.parsing.Config parserConfig = null;

	private com.google.javascript.jscomp.type.ReverseAbstractInterpreter abstractInterpreter;

	private com.google.javascript.jscomp.TypeValidator typeValidator;

	public com.google.javascript.jscomp.PerformanceTracker tracker;

	private final com.google.javascript.rhino.ErrorReporter oldErrorReporter = com.google.javascript.jscomp.RhinoErrorReporter.forOldRhino(com.google.javascript.jscomp.Compiler.this);

	private final com.google.javascript.rhino.head.ErrorReporter defaultErrorReporter = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(com.google.javascript.jscomp.Compiler.this);

	public static final com.google.javascript.jscomp.DiagnosticType OPTIMIZE_LOOP_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_OPTIMIZE_LOOP_ERROR", "Exceeded max number of optimization iterations: {0}");

	public static final com.google.javascript.jscomp.DiagnosticType MOTION_ITERATIONS_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_OPTIMIZE_LOOP_ERROR", "Exceeded max number of code motion iterations: {0}");

	private static final long COMPILER_STACK_SIZE = 1 << 21;

	private static final java.util.concurrent.ExecutorService compilerExecutor = java.util.concurrent.Executors.newCachedThreadPool(new java.util.concurrent.ThreadFactory() {
		@java.lang.Override
		public java.lang.Thread newThread(java.lang.Runnable r) {
			return new java.lang.Thread(null, r, "jscompiler", com.google.javascript.jscomp.Compiler.COMPILER_STACK_SIZE);
		}
	});

	private java.lang.Thread compilerThread = null;

	private boolean useThreads = true;

	private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger("com.google.javascript.jscomp");

	private final java.io.PrintStream outStream;

	private com.google.javascript.jscomp.GlobalVarReferenceMap globalRefMap = null;

	private volatile double progress = 0.0;

	private java.lang.String lastPassName;

	public Compiler() {
		this(((java.io.PrintStream) (null)));
	}

	public Compiler(java.io.PrintStream stream) {
		addChangeHandler(recentChange);
		outStream = stream;
	}

	public Compiler(com.google.javascript.jscomp.ErrorManager errorManager) {
		this();
		setErrorManager(errorManager);
	}

	public void setErrorManager(com.google.javascript.jscomp.ErrorManager errorManager) {
		com.google.common.base.Preconditions.checkNotNull(errorManager, "the error manager cannot be null");
		com.google.javascript.jscomp.Compiler.this.errorManager = errorManager;
	}

	private com.google.javascript.jscomp.MessageFormatter createMessageFormatter() {
		boolean colorize = options.shouldColorizeErrorOutput();
		return options.errorFormat.toFormatter(com.google.javascript.jscomp.Compiler.this, colorize);
	}

	public void initOptions(com.google.javascript.jscomp.CompilerOptions options) {
		com.google.javascript.jscomp.Compiler.this.options = options;
		if ((errorManager) == null) {
			if ((outStream) == null) {
				setErrorManager(new com.google.javascript.jscomp.LoggerErrorManager(createMessageFormatter(), com.google.javascript.jscomp.Compiler.logger));
			}else {
				com.google.javascript.jscomp.PrintStreamErrorManager printer = new com.google.javascript.jscomp.PrintStreamErrorManager(createMessageFormatter(), outStream);
				printer.setSummaryDetailLevel(options.summaryDetailLevel);
				setErrorManager(printer);
			}
		}
		reconcileOptionsWithGuards();
		java.util.List<com.google.javascript.jscomp.WarningsGuard> guards = com.google.common.collect.Lists.newArrayList();
		guards.add(new com.google.javascript.jscomp.SuppressDocWarningsGuard(getDiagnosticGroups().getRegisteredGroups()));
		guards.add(options.getWarningsGuard());
		com.google.javascript.jscomp.Compiler.this.warningsGuard = new com.google.javascript.jscomp.ComposeWarningsGuard(guards);
	}

	protected void reconcileOptionsWithGuards() {
		if (options.enables(com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES)) {
			options.checkTypes = true;
		}else
			if (options.disables(com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES)) {
				options.checkTypes = false;
			}else
				if (!(options.checkTypes)) {
					options.setWarningLevel(com.google.javascript.jscomp.DiagnosticGroup.forType(com.google.javascript.jscomp.RhinoErrorReporter.TYPE_PARSE_ERROR), com.google.javascript.jscomp.CheckLevel.OFF);
				}
			
		
		if ((options.checkGlobalThisLevel.isOn()) && (!(options.disables(com.google.javascript.jscomp.DiagnosticGroups.GLOBAL_THIS)))) {
			options.setWarningLevel(com.google.javascript.jscomp.DiagnosticGroups.GLOBAL_THIS, options.checkGlobalThisLevel);
		}
		if ((options.getLanguageIn()) == (com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT)) {
			options.setWarningLevel(com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT, com.google.javascript.jscomp.CheckLevel.ERROR);
		}
		if ((!(options.checkSymbols)) && (!(options.enables(com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES)))) {
			options.setWarningLevel(com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES, com.google.javascript.jscomp.CheckLevel.OFF);
		}
	}

	@java.lang.Deprecated
	public void init(com.google.javascript.jscomp.JSSourceFile[] externs, com.google.javascript.jscomp.JSSourceFile[] inputs, com.google.javascript.jscomp.CompilerOptions options) {
		init(com.google.common.collect.Lists.<com.google.javascript.jscomp.JSSourceFile>newArrayList(externs), com.google.common.collect.Lists.<com.google.javascript.jscomp.JSSourceFile>newArrayList(inputs), options);
	}

	public <T1 extends com.google.javascript.jscomp.SourceFile, T2 extends com.google.javascript.jscomp.SourceFile> void init(java.util.List<T1> externs, java.util.List<T2> inputs, com.google.javascript.jscomp.CompilerOptions options) {
		com.google.javascript.jscomp.JSModule module = new com.google.javascript.jscomp.JSModule(com.google.javascript.jscomp.Compiler.SINGLETON_MODULE_NAME);
		for (com.google.javascript.jscomp.SourceFile input : inputs) {
			module.add(input);
		}
		initModules(externs, com.google.common.collect.Lists.newArrayList(module), options);
	}

	@java.lang.Deprecated
	public void init(com.google.javascript.jscomp.JSSourceFile[] externs, com.google.javascript.jscomp.JSModule[] modules, com.google.javascript.jscomp.CompilerOptions options) {
		initModules(com.google.common.collect.Lists.<com.google.javascript.jscomp.SourceFile>newArrayList(externs), com.google.common.collect.Lists.<com.google.javascript.jscomp.JSModule>newArrayList(modules), options);
	}

	public <T extends com.google.javascript.jscomp.SourceFile> void initModules(java.util.List<T> externs, java.util.List<com.google.javascript.jscomp.JSModule> modules, com.google.javascript.jscomp.CompilerOptions options) {
		initOptions(options);
		checkFirstModule(modules);
		com.google.javascript.jscomp.Compiler.fillEmptyModules(modules);
		com.google.javascript.jscomp.Compiler.this.externs = makeCompilerInput(externs, true);
		com.google.javascript.jscomp.Compiler.this.modules = modules;
		if ((modules.size()) > 1) {
			try {
				com.google.javascript.jscomp.Compiler.this.moduleGraph = new com.google.javascript.jscomp.JSModuleGraph(modules);
			} catch (com.google.javascript.jscomp.JSModuleGraph.ModuleDependenceException e) {
				report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.Compiler.MODULE_DEPENDENCY_ERROR, e.getModule().getName(), e.getDependentModule().getName()));
				return ;
			}
		}else {
			com.google.javascript.jscomp.Compiler.this.moduleGraph = null;
		}
		com.google.javascript.jscomp.Compiler.this.inputs = com.google.javascript.jscomp.Compiler.getAllInputsFromModules(modules);
		initBasedOnOptions();
		initInputsByIdMap();
	}

	private void initBasedOnOptions() {
		if ((options.sourceMapOutputPath) != null) {
			sourceMap = options.sourceMapFormat.getInstance();
			sourceMap.setPrefixMappings(options.sourceMapLocationMappings);
		}
	}

	private <T extends com.google.javascript.jscomp.SourceFile> java.util.List<com.google.javascript.jscomp.CompilerInput> makeCompilerInput(java.util.List<T> files, boolean isExtern) {
		java.util.List<com.google.javascript.jscomp.CompilerInput> inputs = com.google.common.collect.Lists.newArrayList();
		for (T file : files) {
			inputs.add(new com.google.javascript.jscomp.CompilerInput(file, isExtern));
		}
		return inputs;
	}

	private static final com.google.javascript.jscomp.DiagnosticType EMPTY_MODULE_LIST_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_EMPTY_MODULE_LIST_ERROR", "At least one module must be provided");

	private static final com.google.javascript.jscomp.DiagnosticType EMPTY_ROOT_MODULE_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_EMPTY_ROOT_MODULE_ERROR", "Root module '{0}' must contain at least one source code input");

	private void checkFirstModule(java.util.List<com.google.javascript.jscomp.JSModule> modules) {
		if (modules.isEmpty()) {
			report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.Compiler.EMPTY_MODULE_LIST_ERROR));
		}else
			if ((modules.get(0).getInputs().isEmpty()) && ((modules.size()) > 1)) {
				report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.Compiler.EMPTY_ROOT_MODULE_ERROR, modules.get(0).getName()));
			}
		
	}

	static java.lang.String createFillFileName(java.lang.String moduleName) {
		return ("[" + moduleName) + "]";
	}

	private static void fillEmptyModules(java.util.List<com.google.javascript.jscomp.JSModule> modules) {
		for (com.google.javascript.jscomp.JSModule module : modules) {
			if (module.getInputs().isEmpty()) {
				module.add(com.google.javascript.jscomp.SourceFile.fromCode(com.google.javascript.jscomp.Compiler.createFillFileName(module.getName()), ""));
			}
		}
	}

	public void rebuildInputsFromModules() {
		inputs = com.google.javascript.jscomp.Compiler.getAllInputsFromModules(modules);
		initInputsByIdMap();
	}

	private static java.util.List<com.google.javascript.jscomp.CompilerInput> getAllInputsFromModules(java.util.List<com.google.javascript.jscomp.JSModule> modules) {
		java.util.List<com.google.javascript.jscomp.CompilerInput> inputs = com.google.common.collect.Lists.newArrayList();
		java.util.Map<java.lang.String, com.google.javascript.jscomp.JSModule> inputMap = com.google.common.collect.Maps.newHashMap();
		for (com.google.javascript.jscomp.JSModule module : modules) {
			for (com.google.javascript.jscomp.CompilerInput input : module.getInputs()) {
				java.lang.String inputName = input.getName();
				inputs.add(input);
				inputMap.put(inputName, module);
			}
		}
		return inputs;
	}

	static final com.google.javascript.jscomp.DiagnosticType DUPLICATE_INPUT = com.google.javascript.jscomp.DiagnosticType.error("JSC_DUPLICATE_INPUT", "Duplicate input: {0}");

	static final com.google.javascript.jscomp.DiagnosticType DUPLICATE_EXTERN_INPUT = com.google.javascript.jscomp.DiagnosticType.error("JSC_DUPLICATE_EXTERN_INPUT", "Duplicate extern input: {0}");

	void initInputsByIdMap() {
		inputsById = new java.util.HashMap<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput>();
		for (com.google.javascript.jscomp.CompilerInput input : externs) {
			com.google.javascript.rhino.InputId id = input.getInputId();
			com.google.javascript.jscomp.CompilerInput previous = putCompilerInput(id, input);
			if (previous != null) {
				report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.Compiler.DUPLICATE_EXTERN_INPUT, input.getName()));
			}
		}
		for (com.google.javascript.jscomp.CompilerInput input : inputs) {
			com.google.javascript.rhino.InputId id = input.getInputId();
			com.google.javascript.jscomp.CompilerInput previous = putCompilerInput(id, input);
			if (previous != null) {
				report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.Compiler.DUPLICATE_INPUT, input.getName()));
			}
		}
	}

	public com.google.javascript.jscomp.Result compile(com.google.javascript.jscomp.SourceFile extern, com.google.javascript.jscomp.SourceFile input, com.google.javascript.jscomp.CompilerOptions options) {
		return compile(com.google.common.collect.Lists.newArrayList(extern), com.google.common.collect.Lists.newArrayList(input), options);
	}

	@java.lang.Deprecated
	public com.google.javascript.jscomp.Result compile(com.google.javascript.jscomp.SourceFile extern, com.google.javascript.jscomp.JSSourceFile[] input, com.google.javascript.jscomp.CompilerOptions options) {
		return compile(com.google.common.collect.Lists.newArrayList(extern), com.google.common.collect.Lists.newArrayList(input), options);
	}

	@java.lang.Deprecated
	public com.google.javascript.jscomp.Result compile(com.google.javascript.jscomp.JSSourceFile extern, com.google.javascript.jscomp.JSModule[] modules, com.google.javascript.jscomp.CompilerOptions options) {
		return compileModules(com.google.common.collect.Lists.newArrayList(extern), com.google.common.collect.Lists.newArrayList(modules), options);
	}

	@java.lang.Deprecated
	public com.google.javascript.jscomp.Result compile(com.google.javascript.jscomp.JSSourceFile[] externs, com.google.javascript.jscomp.JSSourceFile[] inputs, com.google.javascript.jscomp.CompilerOptions options) {
		return compile(com.google.common.collect.Lists.<com.google.javascript.jscomp.SourceFile>newArrayList(externs), com.google.common.collect.Lists.<com.google.javascript.jscomp.SourceFile>newArrayList(inputs), options);
	}

	public <T1 extends com.google.javascript.jscomp.SourceFile, T2 extends com.google.javascript.jscomp.SourceFile> com.google.javascript.jscomp.Result compile(java.util.List<T1> externs, java.util.List<T2> inputs, com.google.javascript.jscomp.CompilerOptions options) {
		com.google.common.base.Preconditions.checkState(((jsRoot) == null));
		try {
			init(externs, inputs, options);
			if (hasErrors()) {
				return getResult();
			}
			return compile();
		} finally {
			com.google.javascript.jscomp.Tracer t = newTracer("generateReport");
			errorManager.generateReport();
			stopTracer(t, "generateReport");
		}
	}

	@java.lang.Deprecated
	public com.google.javascript.jscomp.Result compile(com.google.javascript.jscomp.JSSourceFile[] externs, com.google.javascript.jscomp.JSModule[] modules, com.google.javascript.jscomp.CompilerOptions options) {
		return compileModules(com.google.common.collect.Lists.<com.google.javascript.jscomp.SourceFile>newArrayList(externs), com.google.common.collect.Lists.<com.google.javascript.jscomp.JSModule>newArrayList(modules), options);
	}

	public <T extends com.google.javascript.jscomp.SourceFile> com.google.javascript.jscomp.Result compileModules(java.util.List<T> externs, java.util.List<com.google.javascript.jscomp.JSModule> modules, com.google.javascript.jscomp.CompilerOptions options) {
		com.google.common.base.Preconditions.checkState(((jsRoot) == null));
		try {
			initModules(externs, modules, options);
			if (hasErrors()) {
				return getResult();
			}
			return compile();
		} finally {
			com.google.javascript.jscomp.Tracer t = newTracer("generateReport");
			errorManager.generateReport();
			stopTracer(t, "generateReport");
		}
	}

	private com.google.javascript.jscomp.Result compile() {
		return runInCompilerThread(new java.util.concurrent.Callable<com.google.javascript.jscomp.Result>() {
			@java.lang.Override
			public com.google.javascript.jscomp.Result call() throws java.lang.Exception {
				compileInternal();
				return getResult();
			}
		});
	}

	public void disableThreads() {
		useThreads = false;
	}

	@java.lang.SuppressWarnings(value = "unchecked")
	<T> T runInCompilerThread(final java.util.concurrent.Callable<T> callable) {
		final boolean dumpTraceReport = ((options) != null) && (options.tracer.isOn());
		T result = null;
		final java.lang.Throwable[] exception = new java.lang.Throwable[1];
		java.util.concurrent.Callable<T> bootCompilerThread = new java.util.concurrent.Callable<T>() {
			@java.lang.Override
			public T call() {
				try {
					compilerThread = java.lang.Thread.currentThread();
					if (dumpTraceReport) {
						com.google.javascript.jscomp.Tracer.initCurrentThreadTrace();
					}
					return callable.call();
				} catch (java.lang.Throwable e) {
					exception[0] = e;
				} finally {
					compilerThread = null;
					if (dumpTraceReport) {
						com.google.javascript.jscomp.Tracer.logAndClearCurrentThreadTrace();
						tracker.outputTracerReport(((outStream) == null ? java.lang.System.out : outStream));
					}
				}
				return null;
			}
		};
		com.google.common.base.Preconditions.checkState((((compilerThread) == null) || ((compilerThread) == (java.lang.Thread.currentThread()))), "Please do not share the Compiler across threads");
		if ((useThreads) && ((compilerThread) == null)) {
			try {
				result = com.google.javascript.jscomp.Compiler.compilerExecutor.submit(bootCompilerThread).get();
			} catch (java.lang.InterruptedException e) {
				throw com.google.common.base.Throwables.propagate(e);
			} catch (java.util.concurrent.ExecutionException e) {
				throw com.google.common.base.Throwables.propagate(e);
			}
		}else {
			try {
				result = callable.call();
			} catch (java.lang.Exception e) {
				exception[0] = e;
			}
		}
		if ((exception[0]) != null) {
			throw new java.lang.RuntimeException(exception[0]);
		}
		return result;
	}

	private void compileInternal() {
		setProgress(0.0, null);
		parse();
		setProgress(0.15, "parse");
		if (hasErrors()) {
			return ;
		}
		if (!(precheck())) {
			return ;
		}
		if (options.nameAnonymousFunctionsOnly) {
			check();
			return ;
		}
		if (!(options.skipAllPasses)) {
			check();
			if (hasErrors()) {
				return ;
			}
			if ((options.isExternExportsEnabled()) || ((options.externExportsPath) != null)) {
				externExports();
			}
			if (!(options.ideMode)) {
				optimize();
			}
		}
		if (options.recordFunctionInformation) {
			recordFunctionInformation();
		}
		if ((options.devMode) == (com.google.javascript.jscomp.CompilerOptions.DevMode.START_AND_END)) {
			runSanityCheck();
		}
		setProgress(1.0, "recordFunctionInformation");
	}

	public void parse() {
		parseInputs();
	}

	com.google.javascript.jscomp.PassConfig getPassConfig() {
		if ((passes) == null) {
			passes = createPassConfigInternal();
		}
		return passes;
	}

	com.google.javascript.jscomp.PassConfig createPassConfigInternal() {
		return new com.google.javascript.jscomp.DefaultPassConfig(options);
	}

	public void setPassConfig(com.google.javascript.jscomp.PassConfig passes) {
		com.google.common.base.Preconditions.checkNotNull(passes);
		if ((com.google.javascript.jscomp.Compiler.this.passes) != null) {
			throw new java.lang.IllegalStateException("this.passes has already been assigned");
		}
		com.google.javascript.jscomp.Compiler.this.passes = passes;
	}

	boolean precheck() {
		return true;
	}

	public void check() {
		runCustomPasses(com.google.javascript.jscomp.CustomPassExecutionTime.BEFORE_CHECKS);
		com.google.javascript.jscomp.PhaseOptimizer phaseOptimizer = new com.google.javascript.jscomp.PhaseOptimizer(com.google.javascript.jscomp.Compiler.this, tracker, new com.google.javascript.jscomp.PhaseOptimizer.ProgressRange(getProgress(), 1.0));
		if ((options.devMode) == (com.google.javascript.jscomp.CompilerOptions.DevMode.EVERY_PASS)) {
			phaseOptimizer.setSanityCheck(sanityCheck);
		}
		if (options.getCheckDeterminism()) {
			phaseOptimizer.setPrintAstHashcodes(true);
		}
		phaseOptimizer.consume(getPassConfig().getChecks());
		phaseOptimizer.process(externsRoot, jsRoot);
		if (hasErrors()) {
			return ;
		}
		if (options.nameAnonymousFunctionsOnly) {
			return ;
		}
		if (options.removeTryCatchFinally) {
			removeTryCatchFinally();
		}
		if (((((options.getTweakProcessing().shouldStrip()) || (!(options.stripTypes.isEmpty()))) || (!(options.stripNameSuffixes.isEmpty()))) || (!(options.stripTypePrefixes.isEmpty()))) || (!(options.stripNamePrefixes.isEmpty()))) {
			stripCode(options.stripTypes, options.stripNameSuffixes, options.stripTypePrefixes, options.stripNamePrefixes);
		}
		runCustomPasses(com.google.javascript.jscomp.CustomPassExecutionTime.BEFORE_OPTIMIZATIONS);
	}

	private void externExports() {
		com.google.javascript.jscomp.Compiler.logger.fine("Creating extern file for exports");
		startPass("externExports");
		com.google.javascript.jscomp.ExternExportsPass pass = new com.google.javascript.jscomp.ExternExportsPass(com.google.javascript.jscomp.Compiler.this);
		process(pass);
		externExports = pass.getGeneratedExterns();
		endPass();
	}

	@java.lang.Override
	void process(com.google.javascript.jscomp.CompilerPass p) {
		p.process(externsRoot, jsRoot);
	}

	private final com.google.javascript.jscomp.PassFactory sanityCheck = new com.google.javascript.jscomp.PassFactory("sanityCheck", false) {
		@java.lang.Override
		protected com.google.javascript.jscomp.CompilerPass create(com.google.javascript.jscomp.AbstractCompiler compiler) {
			return new com.google.javascript.jscomp.SanityCheck(compiler);
		}
	};

	private void maybeSanityCheck() {
		if ((options.devMode) == (com.google.javascript.jscomp.CompilerOptions.DevMode.EVERY_PASS)) {
			runSanityCheck();
		}
	}

	private void runSanityCheck() {
		sanityCheck.create(com.google.javascript.jscomp.Compiler.this).process(externsRoot, jsRoot);
	}

	void removeTryCatchFinally() {
		com.google.javascript.jscomp.Compiler.logger.fine("Remove try/catch/finally");
		startPass("removeTryCatchFinally");
		com.google.javascript.jscomp.RemoveTryCatch r = new com.google.javascript.jscomp.RemoveTryCatch(com.google.javascript.jscomp.Compiler.this);
		process(r);
		endPass();
	}

	void stripCode(java.util.Set<java.lang.String> stripTypes, java.util.Set<java.lang.String> stripNameSuffixes, java.util.Set<java.lang.String> stripTypePrefixes, java.util.Set<java.lang.String> stripNamePrefixes) {
		com.google.javascript.jscomp.Compiler.logger.fine("Strip code");
		startPass("stripCode");
		com.google.javascript.jscomp.StripCode r = new com.google.javascript.jscomp.StripCode(com.google.javascript.jscomp.Compiler.this, stripTypes, stripNameSuffixes, stripTypePrefixes, stripNamePrefixes);
		if (options.getTweakProcessing().shouldStrip()) {
			r.enableTweakStripping();
		}
		process(r);
		endPass();
	}

	private void runCustomPasses(com.google.javascript.jscomp.CustomPassExecutionTime executionTime) {
		if ((options.customPasses) != null) {
			com.google.javascript.jscomp.Tracer t = newTracer("runCustomPasses");
			try {
				for (com.google.javascript.jscomp.CompilerPass p : options.customPasses.get(executionTime)) {
					process(p);
				}
			} finally {
				stopTracer(t, "runCustomPasses");
			}
		}
	}

	private com.google.javascript.jscomp.Tracer currentTracer = null;

	private java.lang.String currentPassName = null;

	void startPass(java.lang.String passName) {
		com.google.common.base.Preconditions.checkState(((currentTracer) == null));
		currentPassName = passName;
		currentTracer = newTracer(passName);
	}

	void endPass() {
		com.google.common.base.Preconditions.checkState(((currentTracer) != null), "Tracer should not be null at the end of a pass.");
		stopTracer(currentTracer, currentPassName);
		currentPassName = null;
		currentTracer = null;
		maybeSanityCheck();
	}

	com.google.javascript.jscomp.Tracer newTracer(java.lang.String passName) {
		java.lang.String comment = passName + (recentChange.hasCodeChanged() ? " on recently changed AST" : "");
		if (options.tracer.isOn()) {
			tracker.recordPassStart(passName, true);
		}
		return new com.google.javascript.jscomp.Tracer("Compiler", comment);
	}

	void stopTracer(com.google.javascript.jscomp.Tracer t, java.lang.String passName) {
		long result = t.stop();
		if (options.tracer.isOn()) {
			tracker.recordPassStop(passName, result);
		}
	}

	public com.google.javascript.jscomp.Result getResult() {
		com.google.javascript.jscomp.PassConfig.State state = getPassConfig().getIntermediateState();
		return new com.google.javascript.jscomp.Result(getErrors(), getWarnings(), debugLog.toString(), state.variableMap, state.propertyMap, state.anonymousFunctionNameMap, state.stringMap, functionInformationMap, sourceMap, externExports, state.cssNames, state.idGeneratorMap);
	}

	public com.google.javascript.jscomp.JSError[] getMessages() {
		return getErrors();
	}

	public com.google.javascript.jscomp.JSError[] getErrors() {
		return errorManager.getErrors();
	}

	public com.google.javascript.jscomp.JSError[] getWarnings() {
		return errorManager.getWarnings();
	}

	@java.lang.Override
	public com.google.javascript.rhino.Node getRoot() {
		return externAndJsRoot;
	}

	private int nextUniqueNameId() {
		return (uniqueNameId)++;
	}

	@com.google.common.annotations.VisibleForTesting
	void resetUniqueNameId() {
		uniqueNameId = 0;
	}

	@java.lang.Override
	com.google.common.base.Supplier<java.lang.String> getUniqueNameIdSupplier() {
		final com.google.javascript.jscomp.Compiler self = com.google.javascript.jscomp.Compiler.this;
		return new com.google.common.base.Supplier<java.lang.String>() {
			@java.lang.Override
			public java.lang.String get() {
				return java.lang.String.valueOf(self.nextUniqueNameId());
			}
		};
	}

	@java.lang.Override
	boolean areNodesEqualForInlining(com.google.javascript.rhino.Node n1, com.google.javascript.rhino.Node n2) {
		if ((options.ambiguateProperties) || (options.disambiguateProperties)) {
			return n1.isEquivalentToTyped(n2);
		}else {
			return n1.isEquivalentTo(n2);
		}
	}

	@java.lang.Override
	public com.google.javascript.jscomp.CompilerInput getInput(com.google.javascript.rhino.InputId id) {
		return inputsById.get(id);
	}

	protected void removeExternInput(com.google.javascript.rhino.InputId id) {
		com.google.javascript.jscomp.CompilerInput input = getInput(id);
		if (input == null) {
			return ;
		}
		com.google.common.base.Preconditions.checkState(input.isExtern(), "Not an extern input: %s", input.getName());
		inputsById.remove(id);
		externs.remove(input);
		com.google.javascript.rhino.Node root = input.getAstRoot(com.google.javascript.jscomp.Compiler.this);
		if (root != null) {
			root.detachFromParent();
		}
	}

	@java.lang.Override
	public com.google.javascript.jscomp.CompilerInput newExternInput(java.lang.String name) {
		com.google.javascript.jscomp.SourceAst ast = new com.google.javascript.jscomp.SyntheticAst(name);
		if (inputsById.containsKey(ast.getInputId())) {
			throw new java.lang.IllegalArgumentException(("Conflicting externs name: " + name));
		}
		com.google.javascript.jscomp.CompilerInput input = new com.google.javascript.jscomp.CompilerInput(ast, true);
		putCompilerInput(input.getInputId(), input);
		externsRoot.addChildToFront(ast.getAstRoot(com.google.javascript.jscomp.Compiler.this));
		externs.add(0, input);
		return input;
	}

	private com.google.javascript.jscomp.CompilerInput putCompilerInput(com.google.javascript.rhino.InputId id, com.google.javascript.jscomp.CompilerInput input) {
		input.setCompiler(com.google.javascript.jscomp.Compiler.this);
		return inputsById.put(id, input);
	}

	void addIncrementalSourceAst(com.google.javascript.jscomp.JsAst ast) {
		com.google.javascript.rhino.InputId id = ast.getInputId();
		com.google.common.base.Preconditions.checkState(((getInput(id)) == null), "Duplicate input %s", id.getIdName());
		putCompilerInput(id, new com.google.javascript.jscomp.CompilerInput(ast));
	}

	boolean replaceIncrementalSourceAst(com.google.javascript.jscomp.JsAst ast) {
		com.google.javascript.jscomp.CompilerInput oldInput = getInput(ast.getInputId());
		com.google.common.base.Preconditions.checkNotNull(oldInput, "No input to replace: %s", ast.getInputId().getIdName());
		com.google.javascript.rhino.Node newRoot = ast.getAstRoot(com.google.javascript.jscomp.Compiler.this);
		if (newRoot == null) {
			return false;
		}
		com.google.javascript.rhino.Node oldRoot = oldInput.getAstRoot(com.google.javascript.jscomp.Compiler.this);
		if (oldRoot != null) {
			oldRoot.getParent().replaceChild(oldRoot, newRoot);
		}else {
			getRoot().getLastChild().addChildToBack(newRoot);
		}
		com.google.javascript.jscomp.CompilerInput newInput = new com.google.javascript.jscomp.CompilerInput(ast);
		putCompilerInput(ast.getInputId(), newInput);
		com.google.javascript.jscomp.JSModule module = oldInput.getModule();
		if (module != null) {
			module.addAfter(newInput, oldInput);
			module.remove(oldInput);
		}
		com.google.common.base.Preconditions.checkState(newInput.getInputId().equals(oldInput.getInputId()));
		com.google.javascript.rhino.InputId inputIdOnAst = newInput.getAstRoot(com.google.javascript.jscomp.Compiler.this).getInputId();
		com.google.common.base.Preconditions.checkState(newInput.getInputId().equals(inputIdOnAst));
		inputs.remove(oldInput);
		return true;
	}

	boolean addNewSourceAst(com.google.javascript.jscomp.JsAst ast) {
		com.google.javascript.jscomp.CompilerInput oldInput = getInput(ast.getInputId());
		if (oldInput != null) {
			throw new java.lang.IllegalStateException(("Input already exists: " + (ast.getInputId().getIdName())));
		}
		com.google.javascript.rhino.Node newRoot = ast.getAstRoot(com.google.javascript.jscomp.Compiler.this);
		if (newRoot == null) {
			return false;
		}
		getRoot().getLastChild().addChildToBack(newRoot);
		com.google.javascript.jscomp.CompilerInput newInput = new com.google.javascript.jscomp.CompilerInput(ast);
		if (((moduleGraph) == null) && (!(modules.isEmpty()))) {
			modules.get(0).add(newInput);
		}
		putCompilerInput(ast.getInputId(), newInput);
		return true;
	}

	@java.lang.Override
	com.google.javascript.jscomp.JSModuleGraph getModuleGraph() {
		return moduleGraph;
	}

	com.google.javascript.jscomp.JSModuleGraph getDegenerateModuleGraph() {
		return (moduleGraph) == null ? new com.google.javascript.jscomp.JSModuleGraph(modules) : moduleGraph;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSTypeRegistry getTypeRegistry() {
		if ((typeRegistry) == null) {
			typeRegistry = new com.google.javascript.rhino.jstype.JSTypeRegistry(oldErrorReporter, options.looseTypes);
		}
		return typeRegistry;
	}

	@java.lang.Override
	public com.google.javascript.jscomp.MemoizedScopeCreator getTypedScopeCreator() {
		return getPassConfig().getTypedScopeCreator();
	}

	@java.lang.SuppressWarnings(value = "unchecked")
	com.google.javascript.jscomp.DefaultPassConfig ensureDefaultPassConfig() {
		com.google.javascript.jscomp.PassConfig passes = getPassConfig().getBasePassConfig();
		com.google.common.base.Preconditions.checkState((passes instanceof com.google.javascript.jscomp.DefaultPassConfig), "PassConfigs must eventually delegate to the DefaultPassConfig");
		return ((com.google.javascript.jscomp.DefaultPassConfig) (passes));
	}

	public com.google.javascript.jscomp.SymbolTable buildKnownSymbolTable() {
		com.google.javascript.jscomp.SymbolTable symbolTable = new com.google.javascript.jscomp.SymbolTable(getTypeRegistry());
		com.google.javascript.jscomp.MemoizedScopeCreator typedScopeCreator = getTypedScopeCreator();
		if (typedScopeCreator != null) {
			symbolTable.addScopes(typedScopeCreator.getAllMemoizedScopes());
			symbolTable.addSymbolsFrom(typedScopeCreator);
		}else {
			symbolTable.findScopes(com.google.javascript.jscomp.Compiler.this, externsRoot, jsRoot);
		}
		com.google.javascript.jscomp.GlobalNamespace globalNamespace = ensureDefaultPassConfig().getGlobalNamespace();
		if (globalNamespace != null) {
			symbolTable.addSymbolsFrom(globalNamespace);
		}
		com.google.javascript.jscomp.ReferenceCollectingCallback refCollector = new com.google.javascript.jscomp.ReferenceCollectingCallback(com.google.javascript.jscomp.Compiler.this, com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
		com.google.javascript.jscomp.NodeTraversal.traverse(com.google.javascript.jscomp.Compiler.this, getRoot(), refCollector);
		symbolTable.addSymbolsFrom(refCollector);
		com.google.javascript.jscomp.PreprocessorSymbolTable preprocessorSymbolTable = ensureDefaultPassConfig().getPreprocessorSymbolTable();
		if (preprocessorSymbolTable != null) {
			symbolTable.addSymbolsFrom(preprocessorSymbolTable);
		}
		symbolTable.fillNamespaceReferences();
		symbolTable.fillPropertyScopes();
		symbolTable.fillThisReferences(com.google.javascript.jscomp.Compiler.this, externsRoot, jsRoot);
		symbolTable.fillPropertySymbols(com.google.javascript.jscomp.Compiler.this, externsRoot, jsRoot);
		symbolTable.fillJSDocInfo(com.google.javascript.jscomp.Compiler.this, externsRoot, jsRoot);
		return symbolTable;
	}

	@java.lang.Override
	public com.google.javascript.jscomp.Scope getTopScope() {
		return getPassConfig().getTopScope();
	}

	@java.lang.Override
	public com.google.javascript.jscomp.type.ReverseAbstractInterpreter getReverseAbstractInterpreter() {
		if ((abstractInterpreter) == null) {
			com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter interpreter = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(getCodingConvention(), getTypeRegistry());
			if (options.closurePass) {
				interpreter = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(getCodingConvention(), getTypeRegistry()).append(interpreter).getFirst();
			}
			abstractInterpreter = interpreter;
		}
		return abstractInterpreter;
	}

	@java.lang.Override
	com.google.javascript.jscomp.TypeValidator getTypeValidator() {
		if ((typeValidator) == null) {
			typeValidator = new com.google.javascript.jscomp.TypeValidator(com.google.javascript.jscomp.Compiler.this);
		}
		return typeValidator;
	}

	com.google.javascript.rhino.Node parseInputs() {
		boolean devMode = (options.devMode) != (com.google.javascript.jscomp.CompilerOptions.DevMode.OFF);
		if ((externsRoot) != null) {
			externsRoot.detachChildren();
		}
		if ((jsRoot) != null) {
			jsRoot.detachChildren();
		}
		jsRoot = com.google.javascript.rhino.IR.block();
		jsRoot.setIsSyntheticBlock(true);
		externsRoot = com.google.javascript.rhino.IR.block();
		externsRoot.setIsSyntheticBlock(true);
		externAndJsRoot = com.google.javascript.rhino.IR.block(externsRoot, jsRoot);
		externAndJsRoot.setIsSyntheticBlock(true);
		if (options.tracer.isOn()) {
			tracker = new com.google.javascript.jscomp.PerformanceTracker(jsRoot, options.tracer);
			addChangeHandler(tracker.getCodeChangeHandler());
		}
		com.google.javascript.jscomp.Tracer tracer = newTracer(com.google.javascript.jscomp.Compiler.PARSING_PASS_NAME);
		try {
			for (com.google.javascript.jscomp.CompilerInput input : externs) {
				com.google.javascript.rhino.Node n = input.getAstRoot(com.google.javascript.jscomp.Compiler.this);
				if (hasErrors()) {
					return null;
				}
				externsRoot.addChildToBack(n);
			}
			if ((options.transformAMDToCJSModules) || (options.processCommonJSModules)) {
				processAMDAndCommonJSModules();
			}
			hoistExterns(externsRoot);
			boolean staleInputs = false;
			if (options.dependencyOptions.needsManagement()) {
				for (com.google.javascript.jscomp.CompilerInput input : inputs) {
					for (java.lang.String provide : input.getProvides()) {
						getTypeRegistry().forwardDeclareType(provide);
					}
				}
				try {
					inputs = ((moduleGraph) == null ? new com.google.javascript.jscomp.JSModuleGraph(modules) : moduleGraph).manageDependencies(options.dependencyOptions, inputs);
					staleInputs = true;
				} catch (com.google.javascript.jscomp.deps.SortedDependencies.CircularDependencyException e) {
					report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.JSModule.CIRCULAR_DEPENDENCY_ERROR, e.getMessage()));
				} catch (com.google.javascript.jscomp.deps.SortedDependencies.MissingProvideException e) {
					report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.Compiler.MISSING_ENTRY_ERROR, e.getMessage()));
				} catch (com.google.javascript.jscomp.JSModuleGraph.MissingModuleException e) {
					report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.Compiler.MISSING_MODULE_ERROR, e.getMessage()));
				}
				if (hasErrors()) {
					return null;
				}
			}
			hoistNoCompileFiles();
			if (staleInputs) {
				repartitionInputs();
			}
			for (com.google.javascript.jscomp.CompilerInput input : inputs) {
				com.google.javascript.rhino.Node n = input.getAstRoot(com.google.javascript.jscomp.Compiler.this);
				if (n == null) {
					continue;
				}
				if (devMode) {
					runSanityCheck();
					if (hasErrors()) {
						return null;
					}
				}
				if (((options.sourceMapOutputPath) != null) || ((options.nameReferenceReportPath) != null)) {
					com.google.javascript.jscomp.SourceInformationAnnotator sia = new com.google.javascript.jscomp.SourceInformationAnnotator(input.getName(), ((options.devMode) != (com.google.javascript.jscomp.CompilerOptions.DevMode.OFF)));
					com.google.javascript.jscomp.NodeTraversal.traverse(com.google.javascript.jscomp.Compiler.this, n, sia);
				}
				jsRoot.addChildToBack(n);
			}
			if (hasErrors()) {
				return null;
			}
			return externAndJsRoot;
		} finally {
			stopTracer(tracer, com.google.javascript.jscomp.Compiler.PARSING_PASS_NAME);
		}
	}

	private void hoistExterns(com.google.javascript.rhino.Node externsRoot) {
		boolean staleInputs = false;
		for (com.google.javascript.jscomp.CompilerInput input : inputs) {
			if (options.dependencyOptions.needsManagement()) {
				if ((!(input.getProvides().isEmpty())) || (!(input.getRequires().isEmpty()))) {
					continue;
				}
			}
			com.google.javascript.rhino.Node n = input.getAstRoot(com.google.javascript.jscomp.Compiler.this);
			if (n == null) {
				continue;
			}
			com.google.javascript.rhino.JSDocInfo info = n.getJSDocInfo();
			if ((info != null) && (info.isExterns())) {
				externsRoot.addChildToBack(n);
				input.setIsExtern(true);
				input.getModule().remove(input);
				externs.add(input);
				staleInputs = true;
			}
		}
		if (staleInputs) {
			repartitionInputs();
		}
	}

	private void hoistNoCompileFiles() {
		boolean staleInputs = false;
		for (com.google.javascript.jscomp.CompilerInput input : inputs) {
			com.google.javascript.rhino.Node n = input.getAstRoot(com.google.javascript.jscomp.Compiler.this);
			if (n == null) {
				continue;
			}
			com.google.javascript.rhino.JSDocInfo info = n.getJSDocInfo();
			if ((info != null) && (info.isNoCompile())) {
				input.getModule().remove(input);
				staleInputs = true;
			}
		}
		if (staleInputs) {
			repartitionInputs();
		}
	}

	private void repartitionInputs() {
		com.google.javascript.jscomp.Compiler.fillEmptyModules(modules);
		rebuildInputsFromModules();
	}

	void processAMDAndCommonJSModules() {
		java.util.Map<java.lang.String, com.google.javascript.jscomp.JSModule> modulesByName = com.google.common.collect.Maps.newLinkedHashMap();
		java.util.Map<com.google.javascript.jscomp.CompilerInput, com.google.javascript.jscomp.JSModule> modulesByInput = com.google.common.collect.Maps.newLinkedHashMap();
		for (com.google.javascript.jscomp.CompilerInput input : inputs) {
			input.setCompiler(com.google.javascript.jscomp.Compiler.this);
			com.google.javascript.rhino.Node root = input.getAstRoot(com.google.javascript.jscomp.Compiler.this);
			if (root == null) {
				continue;
			}
			if (options.transformAMDToCJSModules) {
				new com.google.javascript.jscomp.TransformAMDToCJSModule(com.google.javascript.jscomp.Compiler.this).process(null, root);
			}
			if (options.processCommonJSModules) {
				com.google.javascript.jscomp.ProcessCommonJSModules cjs = new com.google.javascript.jscomp.ProcessCommonJSModules(com.google.javascript.jscomp.Compiler.this, options.commonJSModulePathPrefix);
				cjs.process(null, root);
				com.google.javascript.jscomp.JSModule m = cjs.getModule();
				if (m != null) {
					modulesByName.put(m.getName(), m);
					modulesByInput.put(input, m);
				}
			}
		}
		if (options.processCommonJSModules) {
			java.util.List<com.google.javascript.jscomp.JSModule> modules = com.google.common.collect.Lists.newArrayList(modulesByName.values());
			if (!(modules.isEmpty())) {
				com.google.javascript.jscomp.Compiler.this.modules = modules;
				com.google.javascript.jscomp.Compiler.this.moduleGraph = new com.google.javascript.jscomp.JSModuleGraph(com.google.javascript.jscomp.Compiler.this.modules);
			}
			for (com.google.javascript.jscomp.JSModule module : modules) {
				for (com.google.javascript.jscomp.CompilerInput input : module.getInputs()) {
					for (java.lang.String require : input.getRequires()) {
						com.google.javascript.jscomp.JSModule dependency = modulesByName.get(require);
						if (dependency == null) {
							report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.Compiler.MISSING_ENTRY_ERROR, require));
						}else {
							module.addDependency(dependency);
						}
					}
				}
			}
			try {
				modules = com.google.common.collect.Lists.newArrayList();
				for (com.google.javascript.jscomp.CompilerInput input : com.google.javascript.jscomp.Compiler.this.moduleGraph.manageDependencies(options.dependencyOptions, inputs)) {
					modules.add(modulesByInput.get(input));
				}
				com.google.javascript.jscomp.JSModule root = new com.google.javascript.jscomp.JSModule("root");
				for (com.google.javascript.jscomp.JSModule m : modules) {
					m.addDependency(root);
				}
				modules.add(0, root);
				com.google.javascript.jscomp.deps.SortedDependencies<com.google.javascript.jscomp.JSModule> sorter = new com.google.javascript.jscomp.deps.SortedDependencies<com.google.javascript.jscomp.JSModule>(modules);
				modules = sorter.getDependenciesOf(modules, true);
				com.google.javascript.jscomp.Compiler.this.modules = modules;
				com.google.javascript.jscomp.Compiler.this.moduleGraph = new com.google.javascript.jscomp.JSModuleGraph(modules);
			} catch (java.lang.Exception e) {
				com.google.common.base.Throwables.propagate(e);
			}
		}
	}

	public com.google.javascript.rhino.Node parse(com.google.javascript.jscomp.SourceFile file) {
		initCompilerOptionsIfTesting();
		addToDebugLog(("Parsing: " + (file.getName())));
		return new com.google.javascript.jscomp.JsAst(file).getAstRoot(com.google.javascript.jscomp.Compiler.this);
	}

	private int syntheticCodeId = 0;

	@java.lang.Override
	com.google.javascript.rhino.Node parseSyntheticCode(java.lang.String js) {
		com.google.javascript.jscomp.CompilerInput input = new com.google.javascript.jscomp.CompilerInput(com.google.javascript.jscomp.SourceFile.fromCode(((" [synthetic:" + (++(syntheticCodeId))) + "] "), js));
		putCompilerInput(input.getInputId(), input);
		return input.getAstRoot(com.google.javascript.jscomp.Compiler.this);
	}

	protected com.google.javascript.jscomp.CompilerOptions newCompilerOptions() {
		return new com.google.javascript.jscomp.CompilerOptions();
	}

	void initCompilerOptionsIfTesting() {
		if ((options) == null) {
			initOptions(newCompilerOptions());
		}
	}

	@java.lang.Override
	com.google.javascript.rhino.Node parseSyntheticCode(java.lang.String fileName, java.lang.String js) {
		initCompilerOptionsIfTesting();
		return parse(com.google.javascript.jscomp.SourceFile.fromCode(fileName, js));
	}

	@java.lang.Override
	com.google.javascript.rhino.Node parseTestCode(java.lang.String js) {
		initCompilerOptionsIfTesting();
		com.google.javascript.jscomp.CompilerInput input = new com.google.javascript.jscomp.CompilerInput(com.google.javascript.jscomp.SourceFile.fromCode("[testcode]", js));
		if ((inputsById) == null) {
			inputsById = com.google.common.collect.Maps.newHashMap();
		}
		putCompilerInput(input.getInputId(), input);
		return input.getAstRoot(com.google.javascript.jscomp.Compiler.this);
	}

	@java.lang.Override
	com.google.javascript.rhino.head.ErrorReporter getDefaultErrorReporter() {
		return defaultErrorReporter;
	}

	public java.lang.String toSource() {
		return runInCompilerThread(new java.util.concurrent.Callable<java.lang.String>() {
			@java.lang.Override
			public java.lang.String call() throws java.lang.Exception {
				com.google.javascript.jscomp.Tracer tracer = newTracer("toSource");
				try {
					com.google.javascript.jscomp.Compiler.CodeBuilder cb = new com.google.javascript.jscomp.Compiler.CodeBuilder();
					if ((jsRoot) != null) {
						int i = 0;
						for (com.google.javascript.rhino.Node scriptNode = jsRoot.getFirstChild(); scriptNode != null; scriptNode = scriptNode.getNext()) {
							toSource(cb, (i++), scriptNode);
						}
					}
					return cb.toString();
				} finally {
					stopTracer(tracer, "toSource");
				}
			}
		});
	}

	public java.lang.String[] toSourceArray() {
		return runInCompilerThread(new java.util.concurrent.Callable<java.lang.String[]>() {
			@java.lang.Override
			public java.lang.String[] call() throws java.lang.Exception {
				com.google.javascript.jscomp.Tracer tracer = newTracer("toSourceArray");
				try {
					int numInputs = inputs.size();
					java.lang.String[] sources = new java.lang.String[numInputs];
					com.google.javascript.jscomp.Compiler.CodeBuilder cb = new com.google.javascript.jscomp.Compiler.CodeBuilder();
					for (int i = 0; i < numInputs; i++) {
						com.google.javascript.rhino.Node scriptNode = inputs.get(i).getAstRoot(com.google.javascript.jscomp.Compiler.this);
						cb.reset();
						toSource(cb, i, scriptNode);
						sources[i] = cb.toString();
					}
					return sources;
				} finally {
					stopTracer(tracer, "toSourceArray");
				}
			}
		});
	}

	public java.lang.String toSource(final com.google.javascript.jscomp.JSModule module) {
		return runInCompilerThread(new java.util.concurrent.Callable<java.lang.String>() {
			@java.lang.Override
			public java.lang.String call() throws java.lang.Exception {
				java.util.List<com.google.javascript.jscomp.CompilerInput> inputs = module.getInputs();
				int numInputs = inputs.size();
				if (numInputs == 0) {
					return "";
				}
				com.google.javascript.jscomp.Compiler.CodeBuilder cb = new com.google.javascript.jscomp.Compiler.CodeBuilder();
				for (int i = 0; i < numInputs; i++) {
					com.google.javascript.rhino.Node scriptNode = inputs.get(i).getAstRoot(com.google.javascript.jscomp.Compiler.this);
					if (scriptNode == null) {
						throw new java.lang.IllegalArgumentException(("Bad module: " + (module.getName())));
					}
					toSource(cb, i, scriptNode);
				}
				return cb.toString();
			}
		});
	}

	public java.lang.String[] toSourceArray(final com.google.javascript.jscomp.JSModule module) {
		return runInCompilerThread(new java.util.concurrent.Callable<java.lang.String[]>() {
			@java.lang.Override
			public java.lang.String[] call() throws java.lang.Exception {
				java.util.List<com.google.javascript.jscomp.CompilerInput> inputs = module.getInputs();
				int numInputs = inputs.size();
				if (numInputs == 0) {
					return new java.lang.String[0];
				}
				java.lang.String[] sources = new java.lang.String[numInputs];
				com.google.javascript.jscomp.Compiler.CodeBuilder cb = new com.google.javascript.jscomp.Compiler.CodeBuilder();
				for (int i = 0; i < numInputs; i++) {
					com.google.javascript.rhino.Node scriptNode = inputs.get(i).getAstRoot(com.google.javascript.jscomp.Compiler.this);
					if (scriptNode == null) {
						throw new java.lang.IllegalArgumentException(("Bad module input: " + (inputs.get(i).getName())));
					}
					cb.reset();
					toSource(cb, i, scriptNode);
					sources[i] = cb.toString();
				}
				return sources;
			}
		});
	}

	public void toSource(final com.google.javascript.jscomp.Compiler.CodeBuilder cb, final int inputSeqNum, final com.google.javascript.rhino.Node root) {
		runInCompilerThread(new java.util.concurrent.Callable<java.lang.Void>() {
			@java.lang.Override
			public java.lang.Void call() throws java.lang.Exception {
				if (options.printInputDelimiter) {
					if (((cb.getLength()) > 0) && (!(cb.endsWith("\n")))) {
						cb.append("\n");
					}
					com.google.common.base.Preconditions.checkState(root.isScript());
					java.lang.String delimiter = options.inputDelimiter;
					java.lang.String inputName = root.getInputId().getIdName();
					java.lang.String sourceName = root.getSourceFileName();
					com.google.common.base.Preconditions.checkState((sourceName != null));
					com.google.common.base.Preconditions.checkState((!(sourceName.isEmpty())));
					delimiter = delimiter.replaceAll("%name%", java.util.regex.Matcher.quoteReplacement(inputName)).replaceAll("%num%", java.lang.String.valueOf(inputSeqNum));
					cb.append(delimiter).append("\n");
				}
				if (((root.getJSDocInfo()) != null) && ((root.getJSDocInfo().getLicense()) != null)) {
					cb.append("/*\n").append(root.getJSDocInfo().getLicense()).append("*/\n");
				}
				if ((options.sourceMapOutputPath) != null) {
					sourceMap.setStartingPosition(cb.getLineIndex(), cb.getColumnIndex());
				}
				java.lang.String code = toSource(root, sourceMap, (inputSeqNum == 0));
				if (!(code.isEmpty())) {
					cb.append(code);
					int length = code.length();
					char lastChar = code.charAt((length - 1));
					char secondLastChar = length >= 2 ? code.charAt((length - 2)) : ' ';
					boolean hasSemiColon = (lastChar == ';') || ((lastChar == '\n') && (secondLastChar == ';'));
					if (!hasSemiColon) {
						cb.append(";");
					}
				}
				return null;
			}
		});
	}

	@java.lang.Override
	java.lang.String toSource(com.google.javascript.rhino.Node n) {
		initCompilerOptionsIfTesting();
		return toSource(n, null, true);
	}

	private java.lang.String toSource(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.SourceMap sourceMap, boolean firstOutput) {
		com.google.javascript.jscomp.CodePrinter.Builder builder = new com.google.javascript.jscomp.CodePrinter.Builder(n);
		builder.setCompilerOptions(options);
		builder.setSourceMap(sourceMap);
		builder.setTagAsStrict((firstOutput && ((options.getLanguageOut()) == (com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT))));
		return builder.build();
	}

	public static class CodeBuilder {
		private final java.lang.StringBuilder sb = new java.lang.StringBuilder();

		private int lineCount = 0;

		private int colCount = 0;

		void reset() {
			sb.setLength(0);
		}

		com.google.javascript.jscomp.Compiler.CodeBuilder append(java.lang.String str) {
			sb.append(str);
			int index = -1;
			int lastIndex = index;
			while ((index = str.indexOf('\n', (index + 1))) >= 0) {
				++(lineCount);
				lastIndex = index;
			} 
			if (lastIndex == (-1)) {
				colCount += str.length();
			}else {
				colCount = (str.length()) - (lastIndex + 1);
			}
			return com.google.javascript.jscomp.Compiler.CodeBuilder.this;
		}

		@java.lang.Override
		public java.lang.String toString() {
			return sb.toString();
		}

		public int getLength() {
			return sb.length();
		}

		int getLineIndex() {
			return lineCount;
		}

		int getColumnIndex() {
			return colCount;
		}

		boolean endsWith(java.lang.String suffix) {
			return ((sb.length()) > (suffix.length())) && (suffix.equals(sb.substring(((sb.length()) - (suffix.length())))));
		}
	}

	public void optimize() {
		normalize();
		com.google.javascript.jscomp.PhaseOptimizer phaseOptimizer = new com.google.javascript.jscomp.PhaseOptimizer(com.google.javascript.jscomp.Compiler.this, tracker, null);
		if ((options.devMode) == (com.google.javascript.jscomp.CompilerOptions.DevMode.EVERY_PASS)) {
			phaseOptimizer.setSanityCheck(sanityCheck);
		}
		if (options.getCheckDeterminism()) {
			phaseOptimizer.setPrintAstHashcodes(true);
		}
		phaseOptimizer.consume(getPassConfig().getOptimizations());
		phaseOptimizer.process(externsRoot, jsRoot);
	}

	@java.lang.Override
	void setCssRenamingMap(com.google.javascript.jscomp.CssRenamingMap map) {
		options.cssRenamingMap = map;
	}

	@java.lang.Override
	com.google.javascript.jscomp.CssRenamingMap getCssRenamingMap() {
		return options.cssRenamingMap;
	}

	public void processDefines() {
		new com.google.javascript.jscomp.DefaultPassConfig(options).processDefines.create(com.google.javascript.jscomp.Compiler.this).process(externsRoot, jsRoot);
	}

	boolean isInliningForbidden() {
		return ((options.propertyRenaming) == (com.google.javascript.jscomp.PropertyRenamingPolicy.HEURISTIC)) || ((options.propertyRenaming) == (com.google.javascript.jscomp.PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC));
	}

	com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> computeCFG() {
		com.google.javascript.jscomp.Compiler.logger.fine("Computing Control Flow Graph");
		com.google.javascript.jscomp.Tracer tracer = newTracer("computeCFG");
		com.google.javascript.jscomp.ControlFlowAnalysis cfa = new com.google.javascript.jscomp.ControlFlowAnalysis(com.google.javascript.jscomp.Compiler.this, true, false);
		process(cfa);
		stopTracer(tracer, "computeCFG");
		return cfa.getCfg();
	}

	public void normalize() {
		com.google.javascript.jscomp.Compiler.logger.fine("Normalizing");
		startPass("normalize");
		process(new com.google.javascript.jscomp.Normalize(com.google.javascript.jscomp.Compiler.this, false));
		endPass();
	}

	@java.lang.Override
	void prepareAst(com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.CompilerPass pass = new com.google.javascript.jscomp.PrepareAst(com.google.javascript.jscomp.Compiler.this);
		pass.process(null, root);
	}

	void recordFunctionInformation() {
		com.google.javascript.jscomp.Compiler.logger.fine("Recording function information");
		startPass("recordFunctionInformation");
		com.google.javascript.jscomp.RecordFunctionInformation recordFunctionInfoPass = new com.google.javascript.jscomp.RecordFunctionInformation(com.google.javascript.jscomp.Compiler.this, getPassConfig().getIntermediateState().functionNames);
		process(recordFunctionInfoPass);
		functionInformationMap = recordFunctionInfoPass.getMap();
		endPass();
	}

	protected final com.google.javascript.jscomp.CodeChangeHandler recentChange = new com.google.javascript.jscomp.CodeChangeHandler();

	private final java.util.List<com.google.javascript.jscomp.CodeChangeHandler> codeChangeHandlers = com.google.common.collect.Lists.<com.google.javascript.jscomp.CodeChangeHandler>newArrayList();

	static final java.lang.String SYNTHETIC_EXTERNS = "{SyntheticVarsDeclar}";

	private com.google.javascript.jscomp.CompilerInput synthesizedExternsInput = null;

	@java.lang.Override
	void addChangeHandler(com.google.javascript.jscomp.CodeChangeHandler handler) {
		codeChangeHandlers.add(handler);
	}

	@java.lang.Override
	void removeChangeHandler(com.google.javascript.jscomp.CodeChangeHandler handler) {
		codeChangeHandlers.remove(handler);
	}

	@java.lang.Override
	public void reportCodeChange() {
		for (com.google.javascript.jscomp.CodeChangeHandler handler : codeChangeHandlers) {
			handler.reportChange();
		}
	}

	@java.lang.Override
	public com.google.javascript.jscomp.CodingConvention getCodingConvention() {
		com.google.javascript.jscomp.CodingConvention convention = options.getCodingConvention();
		convention = (convention != null) ? convention : defaultCodingConvention;
		return convention;
	}

	@java.lang.Override
	public boolean isIdeMode() {
		return options.ideMode;
	}

	@java.lang.Override
	public boolean acceptEcmaScript5() {
		switch (options.getLanguageIn()) {
			case ECMASCRIPT5 :
			case ECMASCRIPT5_STRICT :
				return true;
			case ECMASCRIPT3 :
				return false;
		}
		throw new java.lang.IllegalStateException("unexpected language mode");
	}

	public com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode() {
		return options.getLanguageIn();
	}

	@java.lang.Override
	public boolean acceptConstKeyword() {
		return options.acceptConstKeyword;
	}

	@java.lang.Override
	com.google.javascript.jscomp.parsing.Config getParserConfig() {
		if ((parserConfig) == null) {
			com.google.javascript.jscomp.parsing.Config.LanguageMode mode;
			switch (options.getLanguageIn()) {
				case ECMASCRIPT3 :
					mode = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT3;
					break;
				case ECMASCRIPT5 :
					mode = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
					break;
				case ECMASCRIPT5_STRICT :
					mode = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
					break;
				default :
					throw new java.lang.IllegalStateException("unexpected language mode");
			}
			parserConfig = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(isIdeMode(), mode, acceptConstKeyword(), options.extraAnnotationNames);
		}
		return parserConfig;
	}

	@java.lang.Override
	public boolean isTypeCheckingEnabled() {
		return options.checkTypes;
	}

	protected com.google.javascript.jscomp.DiagnosticGroups getDiagnosticGroups() {
		return new com.google.javascript.jscomp.DiagnosticGroups();
	}

	@java.lang.Override
	public void report(com.google.javascript.jscomp.JSError error) {
		com.google.javascript.jscomp.CheckLevel level = error.getDefaultLevel();
		if ((warningsGuard) != null) {
			com.google.javascript.jscomp.CheckLevel newLevel = warningsGuard.level(error);
			if (newLevel != null) {
				level = newLevel;
			}
		}
		if (level.isOn()) {
			if ((getOptions().errorHandler) != null) {
				getOptions().errorHandler.report(level, error);
			}
			errorManager.report(level, error);
		}
	}

	@java.lang.Override
	public com.google.javascript.jscomp.CheckLevel getErrorLevel(com.google.javascript.jscomp.JSError error) {
		com.google.common.base.Preconditions.checkNotNull(options);
		return warningsGuard.level(error);
	}

	@java.lang.Override
	void throwInternalError(java.lang.String message, java.lang.Exception cause) {
		java.lang.String finalMessage = ("INTERNAL COMPILER ERROR.\n" + "Please report this problem.\n") + message;
		java.lang.RuntimeException e = new java.lang.RuntimeException(finalMessage, cause);
		if (cause != null) {
			e.setStackTrace(cause.getStackTrace());
		}
		throw e;
	}

	public int getErrorCount() {
		return errorManager.getErrorCount();
	}

	public int getWarningCount() {
		return errorManager.getWarningCount();
	}

	@java.lang.Override
	boolean hasHaltingErrors() {
		return (!(isIdeMode())) && ((getErrorCount()) > 0);
	}

	public boolean hasErrors() {
		return hasHaltingErrors();
	}

	@java.lang.Override
	void addToDebugLog(java.lang.String str) {
		debugLog.append(str);
		debugLog.append('\n');
		com.google.javascript.jscomp.Compiler.logger.fine(str);
	}

	@java.lang.Override
	com.google.javascript.jscomp.SourceFile getSourceFileByName(java.lang.String sourceName) {
		if (sourceName != null) {
			com.google.javascript.jscomp.CompilerInput input = inputsById.get(new com.google.javascript.rhino.InputId(sourceName));
			if (input != null) {
				return input.getSourceFile();
			}
		}
		return null;
	}

	@java.lang.Override
	public java.lang.String getSourceLine(java.lang.String sourceName, int lineNumber) {
		if (lineNumber < 1) {
			return null;
		}
		com.google.javascript.jscomp.SourceFile input = getSourceFileByName(sourceName);
		if (input != null) {
			return input.getLine(lineNumber);
		}
		return null;
	}

	@java.lang.Override
	public com.google.javascript.jscomp.Region getSourceRegion(java.lang.String sourceName, int lineNumber) {
		if (lineNumber < 1) {
			return null;
		}
		com.google.javascript.jscomp.SourceFile input = getSourceFileByName(sourceName);
		if (input != null) {
			return input.getRegion(lineNumber);
		}
		return null;
	}

	@java.lang.Override
	com.google.javascript.rhino.Node getNodeForCodeInsertion(com.google.javascript.jscomp.JSModule module) {
		if (module == null) {
			if (inputs.isEmpty()) {
				throw new java.lang.IllegalStateException("No inputs");
			}
			return inputs.get(0).getAstRoot(com.google.javascript.jscomp.Compiler.this);
		}
		java.util.List<com.google.javascript.jscomp.CompilerInput> moduleInputs = module.getInputs();
		if ((moduleInputs.size()) > 0) {
			return moduleInputs.get(0).getAstRoot(com.google.javascript.jscomp.Compiler.this);
		}
		throw new java.lang.IllegalStateException("Root module has no inputs");
	}

	public com.google.javascript.jscomp.SourceMap getSourceMap() {
		return sourceMap;
	}

	com.google.javascript.jscomp.VariableMap getVariableMap() {
		return getPassConfig().getIntermediateState().variableMap;
	}

	com.google.javascript.jscomp.VariableMap getPropertyMap() {
		return getPassConfig().getIntermediateState().propertyMap;
	}

	com.google.javascript.jscomp.CompilerOptions getOptions() {
		return options;
	}

	com.google.javascript.jscomp.FunctionInformationMap getFunctionalInformationMap() {
		return functionInformationMap;
	}

	public static void setLoggingLevel(java.util.logging.Level level) {
		com.google.javascript.jscomp.Compiler.logger.setLevel(level);
	}

	public java.lang.String getAstDotGraph() throws java.io.IOException {
		if ((jsRoot) != null) {
			com.google.javascript.jscomp.ControlFlowAnalysis cfa = new com.google.javascript.jscomp.ControlFlowAnalysis(com.google.javascript.jscomp.Compiler.this, true, false);
			cfa.process(null, jsRoot);
			return com.google.javascript.jscomp.DotFormatter.toDot(jsRoot, cfa.getCfg());
		}else {
			return "";
		}
	}

	@java.lang.Override
	public com.google.javascript.jscomp.ErrorManager getErrorManager() {
		if ((options) == null) {
			initOptions(newCompilerOptions());
		}
		return errorManager;
	}

	@java.lang.Override
	java.util.List<com.google.javascript.jscomp.CompilerInput> getInputsInOrder() {
		return java.util.Collections.<com.google.javascript.jscomp.CompilerInput>unmodifiableList(inputs);
	}

	public java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> getInputsById() {
		return java.util.Collections.unmodifiableMap(inputsById);
	}

	java.util.List<com.google.javascript.jscomp.CompilerInput> getExternsInOrder() {
		return java.util.Collections.<com.google.javascript.jscomp.CompilerInput>unmodifiableList(externs);
	}

	public static class IntermediateState implements java.io.Serializable {
		private static final long serialVersionUID = 1L;

		com.google.javascript.rhino.Node externsRoot;

		private com.google.javascript.rhino.Node jsRoot;

		private java.util.List<com.google.javascript.jscomp.CompilerInput> externs;

		private java.util.List<com.google.javascript.jscomp.CompilerInput> inputs;

		private java.util.List<com.google.javascript.jscomp.JSModule> modules;

		private com.google.javascript.jscomp.PassConfig.State passConfigState;

		private com.google.javascript.rhino.jstype.JSTypeRegistry typeRegistry;

		private com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage lifeCycleStage;

		private java.util.Map<java.lang.String, com.google.javascript.rhino.Node> injectedLibraries;

		private IntermediateState() {
		}
	}

	public com.google.javascript.jscomp.Compiler.IntermediateState getState() {
		com.google.javascript.jscomp.Compiler.IntermediateState state = new com.google.javascript.jscomp.Compiler.IntermediateState();
		state.externsRoot = externsRoot;
		state.jsRoot = jsRoot;
		state.externs = externs;
		state.inputs = inputs;
		state.modules = modules;
		state.passConfigState = getPassConfig().getIntermediateState();
		state.typeRegistry = typeRegistry;
		state.lifeCycleStage = getLifeCycleStage();
		state.injectedLibraries = com.google.common.collect.Maps.newLinkedHashMap(injectedLibraries);
		return state;
	}

	public void setState(com.google.javascript.jscomp.Compiler.IntermediateState state) {
		externsRoot = state.externsRoot;
		jsRoot = state.jsRoot;
		externs = state.externs;
		inputs = state.inputs;
		modules = state.modules;
		passes = createPassConfigInternal();
		getPassConfig().setIntermediateState(state.passConfigState);
		typeRegistry = state.typeRegistry;
		setLifeCycleStage(state.lifeCycleStage);
		injectedLibraries.clear();
		injectedLibraries.putAll(state.injectedLibraries);
	}

	@com.google.common.annotations.VisibleForTesting
	java.util.List<com.google.javascript.jscomp.CompilerInput> getInputsForTesting() {
		return inputs;
	}

	@com.google.common.annotations.VisibleForTesting
	java.util.List<com.google.javascript.jscomp.CompilerInput> getExternsForTesting() {
		return externs;
	}

	@java.lang.Override
	boolean hasRegExpGlobalReferences() {
		return hasRegExpGlobalReferences;
	}

	@java.lang.Override
	void setHasRegExpGlobalReferences(boolean references) {
		hasRegExpGlobalReferences = references;
	}

	@java.lang.Override
	void updateGlobalVarReferences(java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> refMapPatch, com.google.javascript.rhino.Node collectionRoot) {
		com.google.common.base.Preconditions.checkState(((collectionRoot.isScript()) || (collectionRoot.isBlock())));
		if ((globalRefMap) == null) {
			globalRefMap = new com.google.javascript.jscomp.GlobalVarReferenceMap(getInputsInOrder(), getExternsInOrder());
		}
		globalRefMap.updateGlobalVarReferences(refMapPatch, collectionRoot);
	}

	@java.lang.Override
	com.google.javascript.jscomp.GlobalVarReferenceMap getGlobalVarReferences() {
		return globalRefMap;
	}

	@java.lang.Override
	com.google.javascript.jscomp.CompilerInput getSynthesizedExternsInput() {
		if ((synthesizedExternsInput) == null) {
			synthesizedExternsInput = newExternInput(com.google.javascript.jscomp.Compiler.SYNTHETIC_EXTERNS);
		}
		return synthesizedExternsInput;
	}

	@java.lang.Override
	public double getProgress() {
		return progress;
	}

	@java.lang.Override
	java.lang.String getLastPassName() {
		return lastPassName;
	}

	@java.lang.Override
	void setProgress(double newProgress, java.lang.String passName) {
		com.google.javascript.jscomp.Compiler.this.lastPassName = passName;
		if (newProgress > 1.0) {
			progress = 1.0;
		}else {
			progress = newProgress;
		}
	}

	public void replaceScript(com.google.javascript.jscomp.JsAst ast) {
		com.google.javascript.jscomp.CompilerInput input = com.google.javascript.jscomp.Compiler.this.getInput(ast.getInputId());
		if (!(replaceIncrementalSourceAst(ast))) {
			return ;
		}
		com.google.javascript.rhino.Node originalRoot = input.getAstRoot(com.google.javascript.jscomp.Compiler.this);
		processNewScript(ast, originalRoot);
	}

	public void addNewScript(com.google.javascript.jscomp.JsAst ast) {
		if (!(addNewSourceAst(ast))) {
			return ;
		}
		com.google.javascript.rhino.Node emptyScript = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.SCRIPT);
		com.google.javascript.rhino.InputId inputId = ast.getInputId();
		emptyScript.setInputId(inputId);
		emptyScript.setStaticSourceFile(com.google.javascript.jscomp.SourceFile.fromCode(inputId.getIdName(), ""));
		processNewScript(ast, emptyScript);
	}

	private void processNewScript(com.google.javascript.jscomp.JsAst ast, com.google.javascript.rhino.Node originalRoot) {
		com.google.javascript.rhino.Node js = ast.getAstRoot(com.google.javascript.jscomp.Compiler.this);
		com.google.common.base.Preconditions.checkNotNull(js);
		runHotSwap(originalRoot, js, com.google.javascript.jscomp.Compiler.this.getCleanupPassConfig());
		runHotSwapPass(null, null, ensureDefaultPassConfig().garbageCollectChecks);
		com.google.javascript.jscomp.Compiler.this.getTypeRegistry().clearNamedTypes();
		com.google.javascript.jscomp.Compiler.this.removeSyntheticVarsInput();
		runHotSwap(originalRoot, js, com.google.javascript.jscomp.Compiler.this.ensureDefaultPassConfig());
	}

	private void runHotSwap(com.google.javascript.rhino.Node originalRoot, com.google.javascript.rhino.Node js, com.google.javascript.jscomp.PassConfig passConfig) {
		for (com.google.javascript.jscomp.PassFactory passFactory : passConfig.getChecks()) {
			runHotSwapPass(originalRoot, js, passFactory);
		}
	}

	private void runHotSwapPass(com.google.javascript.rhino.Node originalRoot, com.google.javascript.rhino.Node js, com.google.javascript.jscomp.PassFactory passFactory) {
		com.google.javascript.jscomp.HotSwapCompilerPass pass = passFactory.getHotSwapPass(com.google.javascript.jscomp.Compiler.this);
		if (pass != null) {
			com.google.javascript.jscomp.Compiler.logger.info(("Performing HotSwap for pass " + (passFactory.getName())));
			pass.hotSwapScript(js, originalRoot);
		}
	}

	private com.google.javascript.jscomp.PassConfig getCleanupPassConfig() {
		return new com.google.javascript.jscomp.CleanupPasses(getOptions());
	}

	private void removeSyntheticVarsInput() {
		java.lang.String sourceName = com.google.javascript.jscomp.Compiler.SYNTHETIC_EXTERNS;
		removeExternInput(new com.google.javascript.rhino.InputId(sourceName));
	}

	@java.lang.Override
	com.google.javascript.rhino.Node ensureLibraryInjected(java.lang.String resourceName) {
		if (injectedLibraries.containsKey(resourceName)) {
			return null;
		}
		boolean isBase = "base".equals(resourceName);
		if (!isBase) {
			ensureLibraryInjected("base");
		}
		com.google.javascript.rhino.Node firstChild = loadLibraryCode(resourceName).removeChildren();
		com.google.javascript.rhino.Node lastChild = firstChild.getLastSibling();
		com.google.javascript.rhino.Node parent = getNodeForCodeInsertion(null);
		if (isBase) {
			parent.addChildrenToFront(firstChild);
		}else {
			parent.addChildrenAfter(firstChild, injectedLibraries.get("base"));
		}
		reportCodeChange();
		injectedLibraries.put(resourceName, lastChild);
		return lastChild;
	}

	@com.google.common.annotations.VisibleForTesting
	com.google.javascript.rhino.Node loadLibraryCode(java.lang.String resourceName) {
		java.lang.String originalCode;
		try {
			originalCode = com.google.common.io.CharStreams.toString(new java.io.InputStreamReader(com.google.javascript.jscomp.Compiler.class.getResourceAsStream(java.lang.String.format("js/%s.js", resourceName)), com.google.common.base.Charsets.UTF_8));
		} catch (java.io.IOException e) {
			throw new java.lang.RuntimeException(e);
		}
		return com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(com.google.javascript.jscomp.Compiler.this, originalCode, java.lang.String.format("jscomp_%s_", resourceName));
	}

	public static java.lang.String getReleaseVersion() {
		java.util.ResourceBundle config = java.util.ResourceBundle.getBundle(com.google.javascript.jscomp.Compiler.CONFIG_RESOURCE);
		return config.getString("compiler.version");
	}

	public static java.lang.String getReleaseDate() {
		java.util.ResourceBundle config = java.util.ResourceBundle.getBundle(com.google.javascript.jscomp.Compiler.CONFIG_RESOURCE);
		return config.getString("compiler.date");
	}

	@java.lang.Override
	public void setOldParseTree(java.lang.String sourceName, com.google.javascript.rhino.head.ast.AstRoot oldAst) {
	}

	@java.lang.Override
	public com.google.javascript.rhino.head.ast.AstRoot getOldParseTreeByName(java.lang.String sourceName) {
		return null;
	}
}


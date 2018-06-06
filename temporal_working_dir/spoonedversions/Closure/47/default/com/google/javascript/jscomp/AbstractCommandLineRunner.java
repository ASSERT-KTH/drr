

package com.google.javascript.jscomp;


abstract class AbstractCommandLineRunner<A extends com.google.javascript.jscomp.Compiler, B extends com.google.javascript.jscomp.CompilerOptions> {
	private final com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig config;

	private java.lang.Appendable jsOutput;

	private final java.io.PrintStream err;

	private A compiler;

	private java.nio.charset.Charset inputCharset;

	private java.nio.charset.Charset outputCharset2;

	private java.lang.String legacyOutputCharset;

	private boolean testMode = false;

	private com.google.common.base.Supplier<java.util.List<com.google.javascript.jscomp.JSSourceFile>> externsSupplierForTesting = null;

	private com.google.common.base.Supplier<java.util.List<com.google.javascript.jscomp.JSSourceFile>> inputsSupplierForTesting = null;

	private com.google.common.base.Supplier<java.util.List<com.google.javascript.jscomp.JSModule>> modulesSupplierForTesting = null;

	private com.google.common.base.Function<java.lang.Integer, java.lang.Boolean> exitCodeReceiverForTesting = null;

	private java.util.Map<java.lang.String, java.lang.String> rootRelativePathsMap = null;

	private java.util.Map<java.lang.String, java.lang.String> parsedModuleWrappers = null;

	private static final int NUM_RUNS_TO_DETERMINE_OPTIMAL_ORDER = 100;

	private static final java.lang.String OUTPUT_WRAPPER_MARKER = "%output%";

	private final com.google.javascript.jscomp.AbstractCommandLineRunner<A, B>.RunTimeStats runTimeStats = new RunTimeStats();

	AbstractCommandLineRunner() {
		this(java.lang.System.out, java.lang.System.err);
	}

	AbstractCommandLineRunner(java.io.PrintStream out, java.io.PrintStream err) {
		this.config = new com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig();
		com.google.javascript.jscomp.AbstractCommandLineRunner.this.jsOutput = com.google.common.base.Preconditions.checkNotNull(out);
		this.err = com.google.common.base.Preconditions.checkNotNull(err);
	}

	@com.google.common.annotations.VisibleForTesting
	void enableTestMode(com.google.common.base.Supplier<java.util.List<com.google.javascript.jscomp.JSSourceFile>> externsSupplier, com.google.common.base.Supplier<java.util.List<com.google.javascript.jscomp.JSSourceFile>> inputsSupplier, com.google.common.base.Supplier<java.util.List<com.google.javascript.jscomp.JSModule>> modulesSupplier, com.google.common.base.Function<java.lang.Integer, java.lang.Boolean> exitCodeReceiver) {
		com.google.common.base.Preconditions.checkArgument(((inputsSupplier == null) ^ (modulesSupplier == null)));
		testMode = true;
		com.google.javascript.jscomp.AbstractCommandLineRunner.this.externsSupplierForTesting = externsSupplier;
		com.google.javascript.jscomp.AbstractCommandLineRunner.this.inputsSupplierForTesting = inputsSupplier;
		com.google.javascript.jscomp.AbstractCommandLineRunner.this.modulesSupplierForTesting = modulesSupplier;
		com.google.javascript.jscomp.AbstractCommandLineRunner.this.exitCodeReceiverForTesting = exitCodeReceiver;
	}

	protected boolean isInTestMode() {
		return testMode;
	}

	protected com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig getCommandLineConfig() {
		return config;
	}

	protected abstract A createCompiler();

	protected abstract B createOptions();

	protected com.google.javascript.jscomp.DiagnosticGroups getDiagnosticGroups() {
		if ((compiler) == null) {
			return new com.google.javascript.jscomp.DiagnosticGroups();
		}
		return compiler.getDiagnosticGroups();
	}

	@java.lang.Deprecated
	protected void initOptionsFromFlags(com.google.javascript.jscomp.CompilerOptions options) {
	}

	protected void setRunOptions(com.google.javascript.jscomp.CompilerOptions options) throws com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException, java.io.IOException {
		com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups = getDiagnosticGroups();
		if ((config.warningGuards) != null) {
			for (com.google.javascript.jscomp.AbstractCommandLineRunner.WarningGuardSpec.Entry entry : config.warningGuards.entries) {
				diagnosticGroups.setWarningLevel(options, entry.groupName, entry.level);
			}
		}
		com.google.javascript.jscomp.AbstractCommandLineRunner.createDefineOrTweakReplacements(config.define, options, false);
		options.setTweakProcessing(config.tweakProcessing);
		com.google.javascript.jscomp.AbstractCommandLineRunner.createDefineOrTweakReplacements(config.tweak, options, true);
		options.manageClosureDependencies = config.manageClosureDependencies;
		if ((config.closureEntryPoints.size()) > 0) {
			options.setManageClosureDependencies(config.closureEntryPoints);
		}
		options.devMode = config.jscompDevMode;
		options.setCodingConvention(config.codingConvention);
		options.setSummaryDetailLevel(config.summaryDetailLevel);
		legacyOutputCharset = options.outputCharset = getLegacyOutputCharset();
		outputCharset2 = getOutputCharset2();
		inputCharset = getInputCharset();
		if ((config.jsOutputFile.length()) > 0) {
			if (config.skipNormalOutputs) {
				throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException(("skip_normal_outputs and js_output_file" + " cannot be used together."));
			}else {
				options.jsOutputFile = config.jsOutputFile;
			}
		}
		if ((config.skipNormalOutputs) && (config.printAst)) {
			throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException(("skip_normal_outputs and print_ast cannot" + " be used together."));
		}
		if ((config.skipNormalOutputs) && (config.printTree)) {
			throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException(("skip_normal_outputs and print_tree cannot" + " be used together."));
		}
		if ((config.createSourceMap.length()) > 0) {
			options.sourceMapOutputPath = config.createSourceMap;
		}
		options.sourceMapDetailLevel = config.sourceMapDetailLevel;
		options.sourceMapFormat = config.sourceMapFormat;
		if (!(config.variableMapInputFile.equals(""))) {
			options.inputVariableMapSerialized = com.google.javascript.jscomp.VariableMap.load(config.variableMapInputFile).toBytes();
		}
		if (!(config.propertyMapInputFile.equals(""))) {
			options.inputPropertyMapSerialized = com.google.javascript.jscomp.VariableMap.load(config.propertyMapInputFile).toBytes();
		}
		if ((config.languageIn.length()) > 0) {
			if ((config.languageIn.equals("ECMASCRIPT5_STRICT")) || (config.languageIn.equals("ES5_STRICT"))) {
				options.setLanguageIn(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT);
			}else
				if ((config.languageIn.equals("ECMASCRIPT5")) || (config.languageIn.equals("ES5"))) {
					options.setLanguageIn(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5);
				}else
					if ((config.languageIn.equals("ECMASCRIPT3")) || (config.languageIn.equals("ES3"))) {
						options.setLanguageIn(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3);
					}else {
						throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException((("Unknown language `" + (config.languageIn)) + "' specified."));
					}
				
			
		}
		if (!(config.outputManifests.isEmpty())) {
			java.util.Set<java.lang.String> uniqueNames = com.google.common.collect.Sets.newHashSet();
			for (java.lang.String filename : config.outputManifests) {
				if (!(uniqueNames.add(filename))) {
					throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException((("output_manifest flags specify " + "duplicate file names: ") + filename));
				}
			}
		}
		if (!(config.outputBundles.isEmpty())) {
			java.util.Set<java.lang.String> uniqueNames = com.google.common.collect.Sets.newHashSet();
			for (java.lang.String filename : config.outputBundles) {
				if (!(uniqueNames.add(filename))) {
					throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException((("output_bundle flags specify " + "duplicate file names: ") + filename));
				}
			}
		}
		options.acceptConstKeyword = config.acceptConstKeyword;
	}

	protected final A getCompiler() {
		return compiler;
	}

	public final void run() {
		int result = 0;
		int runs = 1;
		if (config.computePhaseOrdering) {
			runs = com.google.javascript.jscomp.AbstractCommandLineRunner.NUM_RUNS_TO_DETERMINE_OPTIMAL_ORDER;
			com.google.javascript.jscomp.PhaseOptimizer.randomizeLoops();
		}
		try {
			for (int i = 0; (i < runs) && (result == 0); i++) {
				runTimeStats.recordStartRun();
				result = doRun();
				runTimeStats.recordEndRun();
			}
		} catch (com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException e) {
			java.lang.System.err.println(e.getMessage());
			result = -1;
		} catch (java.lang.Throwable t) {
			t.printStackTrace();
			result = -2;
		}
		if (config.computePhaseOrdering) {
			runTimeStats.outputBestPhaseOrdering();
		}
		try {
			if ((jsOutput) instanceof java.io.Closeable) {
				((java.io.Closeable) (jsOutput)).close();
			}
		} catch (java.io.IOException e) {
			throw com.google.common.base.Throwables.propagate(e);
		}
		if (testMode) {
			exitCodeReceiverForTesting.apply(result);
		}else {
			java.lang.System.exit(result);
		}
	}

	protected java.io.PrintStream getErrorPrintStream() {
		return err;
	}

	public static class FlagUsageException extends java.lang.Exception {
		private static final long serialVersionUID = 1L;

		public FlagUsageException(java.lang.String message) {
			super(message);
		}
	}

	protected java.util.List<com.google.javascript.jscomp.JSSourceFile> createInputs(java.util.List<java.lang.String> files, boolean allowStdIn) throws com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException, java.io.IOException {
		java.util.List<com.google.javascript.jscomp.JSSourceFile> inputs = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>(files.size());
		boolean usingStdin = false;
		for (java.lang.String filename : files) {
			if (!("-".equals(filename))) {
				com.google.javascript.jscomp.JSSourceFile newFile = com.google.javascript.jscomp.JSSourceFile.fromFile(filename, inputCharset);
				inputs.add(newFile);
			}else {
				if (!allowStdIn) {
					throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException("Can't specify stdin.");
				}
				if (usingStdin) {
					throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException("Can't specify stdin twice.");
				}
				if (!(config.outputManifests.isEmpty())) {
					throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException(("Manifest files cannot be generated " + "when the input is from stdin."));
				}
				if (!(config.outputBundles.isEmpty())) {
					throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException(("Bundle files cannot be generated " + "when the input is from stdin."));
				}
				inputs.add(com.google.javascript.jscomp.JSSourceFile.fromInputStream("stdin", java.lang.System.in));
				usingStdin = true;
			}
		}
		return inputs;
	}

	private java.util.List<com.google.javascript.jscomp.JSSourceFile> createSourceInputs(java.util.List<java.lang.String> files) throws com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException, java.io.IOException {
		if (isInTestMode()) {
			return inputsSupplierForTesting.get();
		}
		if (files.isEmpty()) {
			files = java.util.Collections.singletonList("-");
		}
		try {
			return createInputs(files, true);
		} catch (com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException e) {
			throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException(("Bad --js flag. " + (e.getMessage())));
		}
	}

	private java.util.List<com.google.javascript.jscomp.JSSourceFile> createExternInputs(java.util.List<java.lang.String> files) throws com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException, java.io.IOException {
		if (files.isEmpty()) {
			return com.google.common.collect.ImmutableList.of(com.google.javascript.jscomp.JSSourceFile.fromCode("/dev/null", ""));
		}
		try {
			return createInputs(files, false);
		} catch (com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException e) {
			throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException(("Bad --externs flag. " + (e.getMessage())));
		}
	}

	java.util.List<com.google.javascript.jscomp.JSModule> createJsModules(java.util.List<java.lang.String> specs, java.util.List<java.lang.String> jsFiles) throws com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException, java.io.IOException {
		if (isInTestMode()) {
			return modulesSupplierForTesting.get();
		}
		com.google.common.base.Preconditions.checkState((specs != null));
		com.google.common.base.Preconditions.checkState((!(specs.isEmpty())));
		com.google.common.base.Preconditions.checkState((jsFiles != null));
		final int totalNumJsFiles = jsFiles.size();
		int nextJsFileIndex = 0;
		java.util.Map<java.lang.String, com.google.javascript.jscomp.JSModule> modulesByName = com.google.common.collect.Maps.newLinkedHashMap();
		for (java.lang.String spec : specs) {
			java.lang.String[] parts = spec.split(":");
			if (((parts.length) < 2) || ((parts.length) > 4)) {
				throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException((("Expected 2-4 colon-delimited parts in " + "module spec: ") + spec));
			}
			java.lang.String name = parts[0];
			checkModuleName(name);
			if (modulesByName.containsKey(name)) {
				throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException(("Duplicate module name: " + name));
			}
			com.google.javascript.jscomp.JSModule module = new com.google.javascript.jscomp.JSModule(name);
			int numJsFiles = -1;
			try {
				numJsFiles = java.lang.Integer.parseInt(parts[1]);
			} catch (java.lang.NumberFormatException ignored) {
				numJsFiles = -1;
			}
			if (numJsFiles < 0) {
				throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException(((("Invalid js file count '" + (parts[1])) + "' for module: ") + name));
			}
			if ((nextJsFileIndex + numJsFiles) > totalNumJsFiles) {
				throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException(((("Not enough js files specified. Expected " + ((nextJsFileIndex + numJsFiles) - totalNumJsFiles)) + " more in module:") + name));
			}
			java.util.List<java.lang.String> moduleJsFiles = jsFiles.subList(nextJsFileIndex, (nextJsFileIndex + numJsFiles));
			for (com.google.javascript.jscomp.JSSourceFile input : createInputs(moduleJsFiles, false)) {
				module.add(input);
			}
			nextJsFileIndex += numJsFiles;
			if ((parts.length) > 2) {
				java.lang.String depList = parts[2];
				if ((depList.length()) > 0) {
					java.lang.String[] deps = depList.split(",");
					for (java.lang.String dep : deps) {
						com.google.javascript.jscomp.JSModule other = modulesByName.get(dep);
						if (other == null) {
							throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException((((("Module '" + name) + "' depends on unknown module '") + dep) + "'. Be sure to list modules in dependency order."));
						}
						module.addDependency(other);
					}
				}
			}
			modulesByName.put(name, module);
		}
		if (nextJsFileIndex < totalNumJsFiles) {
			throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException(((("Too many js files specified. Expected " + nextJsFileIndex) + " but found ") + totalNumJsFiles));
		}
		return com.google.common.collect.Lists.newArrayList(modulesByName.values());
	}

	protected void checkModuleName(java.lang.String name) throws com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException {
		if (!(com.google.javascript.rhino.TokenStream.isJSIdentifier(name))) {
			throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException((("Invalid module name: '" + name) + "'"));
		}
	}

	static java.util.Map<java.lang.String, java.lang.String> parseModuleWrappers(java.util.List<java.lang.String> specs, java.util.List<com.google.javascript.jscomp.JSModule> modules) throws com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException {
		com.google.common.base.Preconditions.checkState((specs != null));
		java.util.Map<java.lang.String, java.lang.String> wrappers = com.google.common.collect.Maps.newHashMapWithExpectedSize(modules.size());
		for (com.google.javascript.jscomp.JSModule m : modules) {
			wrappers.put(m.getName(), "");
		}
		for (java.lang.String spec : specs) {
			int pos = spec.indexOf(':');
			if (pos == (-1)) {
				throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException((("Expected module wrapper to have " + "<name>:<wrapper> format: ") + spec));
			}
			java.lang.String name = spec.substring(0, pos);
			if (!(wrappers.containsKey(name))) {
				throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException((("Unknown module: '" + name) + "'"));
			}
			java.lang.String wrapper = spec.substring((pos + 1));
			if (!(wrapper.contains("%s"))) {
				throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException((("No %s placeholder in module wrapper: '" + wrapper) + "'"));
			}
			wrappers.put(name, wrapper);
		}
		return wrappers;
	}

	private java.lang.String getModuleOutputFileName(com.google.javascript.jscomp.JSModule m) {
		return ((config.moduleOutputPathPrefix) + (m.getName())) + ".js";
	}

	@com.google.common.annotations.VisibleForTesting
	void writeModuleOutput(java.lang.Appendable out, com.google.javascript.jscomp.JSModule m) throws com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException, java.io.IOException {
		if ((parsedModuleWrappers) == null) {
			parsedModuleWrappers = com.google.javascript.jscomp.AbstractCommandLineRunner.parseModuleWrappers(config.moduleWrapper, com.google.common.collect.Lists.newArrayList(compiler.getModuleGraph().getAllModules()));
		}
		java.lang.String fileName = getModuleOutputFileName(m);
		java.lang.String baseName = new java.io.File(fileName).getName();
		com.google.javascript.jscomp.AbstractCommandLineRunner.writeOutput(out, compiler, compiler.toSource(m), parsedModuleWrappers.get(m.getName()).replace("%basename%", baseName), "%s");
	}

	static void writeOutput(java.lang.Appendable out, com.google.javascript.jscomp.Compiler compiler, java.lang.String code, java.lang.String wrapper, java.lang.String codePlaceholder) throws java.io.IOException {
		int pos = wrapper.indexOf(codePlaceholder);
		if (pos != (-1)) {
			java.lang.String prefix = "";
			if (pos > 0) {
				prefix = wrapper.substring(0, pos);
				out.append(prefix);
			}
			out.append(code);
			int suffixStart = pos + (codePlaceholder.length());
			if (suffixStart != (wrapper.length())) {
				out.append(wrapper.substring(suffixStart));
			}
			out.append('\n');
			if ((compiler != null) && ((compiler.getSourceMap()) != null)) {
				compiler.getSourceMap().setWrapperPrefix(prefix);
			}
		}else {
			out.append(code);
			out.append('\n');
		}
	}

	private static void maybeCreateDirsForPath(java.lang.String pathPrefix) {
		if ((pathPrefix.length()) > 0) {
			java.lang.String dirName = (pathPrefix.charAt(((pathPrefix.length()) - 1))) == (java.io.File.separatorChar) ? pathPrefix.substring(0, ((pathPrefix.length()) - 1)) : new java.io.File(pathPrefix).getParent();
			if (dirName != null) {
				new java.io.File(dirName).mkdirs();
			}
		}
	}

	protected int doRun() throws com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException, java.io.IOException {
		com.google.javascript.jscomp.Compiler.setLoggingLevel(java.util.logging.Level.parse(config.loggingLevel));
		java.util.List<com.google.javascript.jscomp.JSSourceFile> externs = createExterns();
		compiler = createCompiler();
		B options = createOptions();
		java.util.List<com.google.javascript.jscomp.JSModule> modules = null;
		com.google.javascript.jscomp.Result result = null;
		setRunOptions(options);
		boolean writeOutputToFile = !(options.jsOutputFile.isEmpty());
		if (writeOutputToFile) {
			jsOutput = fileNameToLegacyOutputWriter(options.jsOutputFile);
		}else
			if ((jsOutput) instanceof java.io.OutputStream) {
				jsOutput = streamToLegacyOutputWriter(((java.io.OutputStream) (jsOutput)));
			}
		
		java.util.List<java.lang.String> jsFiles = config.js;
		java.util.List<java.lang.String> moduleSpecs = config.module;
		if (!(moduleSpecs.isEmpty())) {
			modules = createJsModules(moduleSpecs, jsFiles);
			if (config.skipNormalOutputs) {
				compiler.initModules(externs, modules, options);
			}else {
				result = compiler.compileModules(externs, modules, options);
			}
		}else {
			java.util.List<com.google.javascript.jscomp.JSSourceFile> inputs = createSourceInputs(jsFiles);
			if (config.skipNormalOutputs) {
				compiler.init(externs, inputs, options);
			}else {
				result = compiler.compile(externs, inputs, options);
			}
		}
		int errCode = processResults(result, modules, options);
		if ((jsOutput) instanceof java.io.Flushable) {
			((java.io.Flushable) (jsOutput)).flush();
		}
		return errCode;
	}

	int processResults(com.google.javascript.jscomp.Result result, java.util.List<com.google.javascript.jscomp.JSModule> modules, B options) throws com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException, java.io.IOException {
		if (config.computePhaseOrdering) {
			return 0;
		}
		if (config.printPassGraph) {
			if ((compiler.getRoot()) == null) {
				return 1;
			}else {
				jsOutput.append(com.google.javascript.jscomp.DotFormatter.toDot(compiler.getPassConfig().getPassGraph()));
				jsOutput.append('\n');
				return 0;
			}
		}
		if (config.printAst) {
			if ((compiler.getRoot()) == null) {
				return 1;
			}else {
				com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> cfg = compiler.computeCFG();
				com.google.javascript.jscomp.DotFormatter.appendDot(compiler.getRoot().getLastChild(), cfg, jsOutput);
				jsOutput.append('\n');
				return 0;
			}
		}
		if (config.printTree) {
			if ((compiler.getRoot()) == null) {
				jsOutput.append("Code contains errors; no tree was generated.\n");
				return 1;
			}else {
				compiler.getRoot().appendStringTree(jsOutput);
				jsOutput.append("\n");
				return 0;
			}
		}
		rootRelativePathsMap = constructRootRelativePathsMap();
		if (config.skipNormalOutputs) {
			outputManifest();
			outputBundle();
			return 0;
		}else
			if (result.success) {
				if (modules == null) {
					com.google.javascript.jscomp.AbstractCommandLineRunner.writeOutput(jsOutput, compiler, compiler.toSource(), config.outputWrapper, com.google.javascript.jscomp.AbstractCommandLineRunner.OUTPUT_WRAPPER_MARKER);
					outputSourceMap(options, options.jsOutputFile);
				}else {
					parsedModuleWrappers = com.google.javascript.jscomp.AbstractCommandLineRunner.parseModuleWrappers(config.moduleWrapper, modules);
					com.google.javascript.jscomp.AbstractCommandLineRunner.maybeCreateDirsForPath(config.moduleOutputPathPrefix);
					java.io.Writer mapOut = null;
					if (!(shouldGenerateMapPerModule(options))) {
						mapOut = fileNameToOutputWriter2(expandSourceMapPath(options, null));
					}
					for (com.google.javascript.jscomp.JSModule m : modules) {
						if (shouldGenerateMapPerModule(options)) {
							mapOut = fileNameToOutputWriter2(expandSourceMapPath(options, m));
						}
						java.io.Writer writer = fileNameToLegacyOutputWriter(getModuleOutputFileName(m));
						if ((options.sourceMapOutputPath) != null) {
							compiler.getSourceMap().reset();
						}
						writeModuleOutput(writer, m);
						if ((options.sourceMapOutputPath) != null) {
							compiler.getSourceMap().appendTo(mapOut, m.getName());
						}
						writer.close();
						if ((shouldGenerateMapPerModule(options)) && (mapOut != null)) {
							mapOut.close();
							mapOut = null;
						}
					}
					if (mapOut != null) {
						mapOut.close();
					}
				}
				if ((options.externExportsPath) != null) {
					java.io.Writer eeOut = openExternExportsStream(options, options.jsOutputFile);
					eeOut.append(result.externExport);
					eeOut.close();
				}
				outputNameMaps(options);
				outputManifest();
				outputBundle();
			}
		
		return java.lang.Math.min(result.errors.length, 127);
	}

	private java.nio.charset.Charset getInputCharset() throws com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException {
		if (!(config.charset.isEmpty())) {
			if (!(java.nio.charset.Charset.isSupported(config.charset))) {
				throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException(((config.charset) + " is not a valid charset name."));
			}
			return java.nio.charset.Charset.forName(config.charset);
		}
		return com.google.common.base.Charsets.UTF_8;
	}

	private java.lang.String getLegacyOutputCharset() throws com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException {
		if (!(config.charset.isEmpty())) {
			if (!(java.nio.charset.Charset.isSupported(config.charset))) {
				throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException(((config.charset) + " is not a valid charset name."));
			}
			return config.charset;
		}
		return "US-ASCII";
	}

	private java.nio.charset.Charset getOutputCharset2() throws com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException {
		if (!(config.charset.isEmpty())) {
			if (!(java.nio.charset.Charset.isSupported(config.charset))) {
				throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException(((config.charset) + " is not a valid charset name."));
			}
			return java.nio.charset.Charset.forName(config.charset);
		}
		return com.google.common.base.Charsets.UTF_8;
	}

	protected java.util.List<com.google.javascript.jscomp.JSSourceFile> createExterns() throws com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException, java.io.IOException {
		return isInTestMode() ? externsSupplierForTesting.get() : createExternInputs(config.externs);
	}

	private boolean shouldGenerateMapPerModule(B options) {
		return ((options.sourceMapOutputPath) != null) && (options.sourceMapOutputPath.contains("%outname%"));
	}

	private java.io.Writer openExternExportsStream(B options, java.lang.String path) throws java.io.IOException {
		if ((options.externExportsPath) == null) {
			return null;
		}
		java.lang.String exPath = options.externExportsPath;
		if (!(exPath.contains(java.io.File.separator))) {
			java.io.File outputFile = new java.io.File(path);
			exPath = ((outputFile.getParent()) + (java.io.File.separatorChar)) + exPath;
		}
		return fileNameToOutputWriter2(exPath);
	}

	private java.lang.String expandCommandLinePath(java.lang.String path, com.google.javascript.jscomp.JSModule forModule) {
		java.lang.String sub;
		if (forModule != null) {
			sub = ((config.moduleOutputPathPrefix) + (forModule.getName())) + ".js";
		}else
			if (!(config.module.isEmpty())) {
				sub = config.moduleOutputPathPrefix;
			}else {
				sub = config.jsOutputFile;
			}
		
		return path.replace("%outname%", sub);
	}

	@com.google.common.annotations.VisibleForTesting
	java.lang.String expandSourceMapPath(B options, com.google.javascript.jscomp.JSModule forModule) {
		if (com.google.javascript.jscomp.Strings.isEmpty(options.sourceMapOutputPath)) {
			return null;
		}
		return expandCommandLinePath(options.sourceMapOutputPath, forModule);
	}

	private java.io.Writer fileNameToLegacyOutputWriter(java.lang.String fileName) throws java.io.IOException {
		if (fileName == null) {
			return null;
		}
		if (testMode) {
			return new java.io.StringWriter();
		}
		return streamToLegacyOutputWriter(filenameToOutputStream(fileName));
	}

	private java.io.Writer fileNameToOutputWriter2(java.lang.String fileName) throws java.io.IOException {
		if (fileName == null) {
			return null;
		}
		if (testMode) {
			return new java.io.StringWriter();
		}
		return streamToOutputWriter2(filenameToOutputStream(fileName));
	}

	protected java.io.OutputStream filenameToOutputStream(java.lang.String fileName) throws java.io.IOException {
		if (fileName == null) {
			return null;
		}
		return new java.io.FileOutputStream(fileName);
	}

	private java.io.Writer streamToLegacyOutputWriter(java.io.OutputStream stream) throws java.io.IOException {
		if ((legacyOutputCharset) == null) {
			return new java.io.BufferedWriter(new java.io.OutputStreamWriter(stream));
		}else {
			return new java.io.BufferedWriter(new java.io.OutputStreamWriter(stream, legacyOutputCharset));
		}
	}

	private java.io.Writer streamToOutputWriter2(java.io.OutputStream stream) {
		if ((outputCharset2) == null) {
			return new java.io.BufferedWriter(new java.io.OutputStreamWriter(stream));
		}else {
			return new java.io.BufferedWriter(new java.io.OutputStreamWriter(stream, outputCharset2));
		}
	}

	private void outputSourceMap(B options, java.lang.String associatedName) throws java.io.IOException {
		if (com.google.javascript.jscomp.Strings.isEmpty(options.sourceMapOutputPath)) {
			return ;
		}
		java.lang.String outName = expandSourceMapPath(options, null);
		java.io.Writer out = fileNameToOutputWriter2(outName);
		compiler.getSourceMap().appendTo(out, associatedName);
		out.close();
	}

	private java.lang.String getMapPath(java.lang.String outputFile) {
		java.lang.String basePath = "";
		if (outputFile.equals("")) {
			if (!(config.moduleOutputPathPrefix.equals(""))) {
				basePath = config.moduleOutputPathPrefix;
			}else {
				basePath = "jscompiler";
			}
		}else {
			java.io.File file = new java.io.File(outputFile);
			java.lang.String outputFileName = file.getName();
			if (outputFileName.endsWith(".js")) {
				outputFileName = outputFileName.substring(0, ((outputFileName.length()) - 3));
			}
			basePath = ((file.getParent()) + (java.io.File.separatorChar)) + outputFileName;
		}
		return basePath;
	}

	private void outputNameMaps(B options) throws com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException, java.io.IOException {
		java.lang.String propertyMapOutputPath = null;
		java.lang.String variableMapOutputPath = null;
		java.lang.String functionInformationMapOutputPath = null;
		if (config.createNameMapFiles) {
			java.lang.String basePath = getMapPath(options.jsOutputFile);
			propertyMapOutputPath = basePath + "_props_map.out";
			variableMapOutputPath = basePath + "_vars_map.out";
			functionInformationMapOutputPath = basePath + "_functions_map.out";
		}
		if (!(config.variableMapOutputFile.equals(""))) {
			if (variableMapOutputPath != null) {
				throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException(("The flags variable_map_output_file and " + "create_name_map_files cannot both be used simultaniously."));
			}
			variableMapOutputPath = config.variableMapOutputFile;
		}
		if (!(config.propertyMapOutputFile.equals(""))) {
			if (propertyMapOutputPath != null) {
				throw new com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException(("The flags property_map_output_file and " + "create_name_map_files cannot both be used simultaniously."));
			}
			propertyMapOutputPath = config.propertyMapOutputFile;
		}
		if (variableMapOutputPath != null) {
			if ((compiler.getVariableMap()) != null) {
				compiler.getVariableMap().save(variableMapOutputPath);
			}
		}
		if (propertyMapOutputPath != null) {
			if ((compiler.getPropertyMap()) != null) {
				compiler.getPropertyMap().save(propertyMapOutputPath);
			}
		}
		if (functionInformationMapOutputPath != null) {
			if ((compiler.getFunctionalInformationMap()) != null) {
				java.io.OutputStream file = filenameToOutputStream(functionInformationMapOutputPath);
				com.google.protobuf.CodedOutputStream outputStream = com.google.protobuf.CodedOutputStream.newInstance(file);
				compiler.getFunctionalInformationMap().writeTo(outputStream);
				outputStream.flush();
				file.flush();
				file.close();
			}
		}
	}

	@com.google.common.annotations.VisibleForTesting
	static void createDefineOrTweakReplacements(java.util.List<java.lang.String> definitions, com.google.javascript.jscomp.CompilerOptions options, boolean tweaks) {
		for (java.lang.String override : definitions) {
			java.lang.String[] assignment = override.split("=", 2);
			java.lang.String defName = assignment[0];
			if ((defName.length()) > 0) {
				java.lang.String defValue = (assignment.length) == 1 ? "true" : assignment[1];
				boolean isTrue = defValue.equals("true");
				boolean isFalse = defValue.equals("false");
				if (isTrue || isFalse) {
					if (tweaks) {
						options.setTweakToBooleanLiteral(defName, isTrue);
					}else {
						options.setDefineToBooleanLiteral(defName, isTrue);
					}
					continue;
				}else
					if (((defValue.length()) > 1) && ((((defValue.charAt(0)) == '\'') && ((defValue.charAt(((defValue.length()) - 1))) == '\'')) || (((defValue.charAt(0)) == '\"') && ((defValue.charAt(((defValue.length()) - 1))) == '\"')))) {
						java.lang.String maybeStringVal = defValue.substring(1, ((defValue.length()) - 1));
						if ((maybeStringVal.indexOf(defValue.charAt(0))) == (-1)) {
							if (tweaks) {
								options.setTweakToStringLiteral(defName, maybeStringVal);
							}else {
								options.setDefineToStringLiteral(defName, maybeStringVal);
							}
							continue;
						}
					}else {
						try {
							double value = java.lang.Double.parseDouble(defValue);
							if (tweaks) {
								options.setTweakToDoubleLiteral(defName, value);
							}else {
								options.setDefineToDoubleLiteral(defName, value);
							}
							continue;
						} catch (java.lang.NumberFormatException e) {
						}
					}
				
			}
			if (tweaks) {
				throw new java.lang.RuntimeException(("--tweak flag syntax invalid: " + override));
			}
			throw new java.lang.RuntimeException(("--define flag syntax invalid: " + override));
		}
	}

	private boolean shouldGenerateOutputPerModule(java.lang.String output) {
		return ((!(config.module.isEmpty())) && (output != null)) && (output.contains("%outname%"));
	}

	private void outputManifest() throws java.io.IOException {
		outputManifestOrBundle(config.outputManifests, true);
	}

	private void outputBundle() throws java.io.IOException {
		outputManifestOrBundle(config.outputBundles, false);
	}

	private void outputManifestOrBundle(java.util.List<java.lang.String> outputFiles, boolean isManifest) throws java.io.IOException {
		if (outputFiles.isEmpty()) {
			return ;
		}
		for (java.lang.String output : outputFiles) {
			if (output.isEmpty()) {
				continue;
			}
			com.google.javascript.jscomp.JSModuleGraph graph = compiler.getModuleGraph();
			if (shouldGenerateOutputPerModule(output)) {
				java.lang.Iterable<com.google.javascript.jscomp.JSModule> modules = graph.getAllModules();
				for (com.google.javascript.jscomp.JSModule module : modules) {
					java.io.Writer out = fileNameToOutputWriter2(expandCommandLinePath(output, module));
					if (isManifest) {
						printManifestTo(module.getInputs(), out);
					}else {
						printBundleTo(module.getInputs(), out);
					}
					out.close();
				}
			}else {
				java.io.Writer out = fileNameToOutputWriter2(expandCommandLinePath(output, null));
				if (graph == null) {
					if (isManifest) {
						printManifestTo(compiler.getInputsInOrder(), out);
					}else {
						printBundleTo(compiler.getInputsInOrder(), out);
					}
				}else {
					printModuleGraphManifestOrBundleTo(graph, out, isManifest);
				}
				out.close();
			}
		}
	}

	@com.google.common.annotations.VisibleForTesting
	void printModuleGraphManifestOrBundleTo(com.google.javascript.jscomp.JSModuleGraph graph, java.lang.Appendable out, boolean isManifest) throws java.io.IOException {
		com.google.common.base.Joiner commas = com.google.common.base.Joiner.on(",");
		boolean requiresNewline = false;
		for (com.google.javascript.jscomp.JSModule module : graph.getAllModulesInDependencyOrder()) {
			if (requiresNewline) {
				out.append("\n");
			}
			if (isManifest) {
				java.lang.String dependencies = commas.join(module.getSortedDependencyNames());
				out.append(java.lang.String.format("{%s%s}\n", module.getName(), (dependencies.isEmpty() ? "" : ":" + dependencies)));
				printManifestTo(module.getInputs(), out);
			}else {
				printBundleTo(module.getInputs(), out);
			}
			requiresNewline = true;
		}
	}

	private void printManifestTo(java.lang.Iterable<com.google.javascript.jscomp.CompilerInput> inputs, java.lang.Appendable out) throws java.io.IOException {
		for (com.google.javascript.jscomp.CompilerInput input : inputs) {
			java.lang.String rootRelativePath = rootRelativePathsMap.get(input.getName());
			java.lang.String displayName = rootRelativePath != null ? rootRelativePath : input.getName();
			out.append(displayName);
			out.append("\n");
		}
	}

	private void printBundleTo(java.lang.Iterable<com.google.javascript.jscomp.CompilerInput> inputs, java.lang.Appendable out) throws java.io.IOException {
		for (com.google.javascript.jscomp.CompilerInput input : inputs) {
			java.lang.String rootRelativePath = rootRelativePathsMap.get(input.getName());
			java.lang.String displayName = rootRelativePath != null ? rootRelativePath : input.getName();
			java.io.File file = new java.io.File(input.getName());
			out.append("//");
			out.append(displayName);
			out.append("\n");
			com.google.common.io.Files.copy(file, inputCharset, out);
			out.append("\n");
		}
	}

	private java.util.Map<java.lang.String, java.lang.String> constructRootRelativePathsMap() {
		java.util.Map<java.lang.String, java.lang.String> rootRelativePathsMap = com.google.common.collect.Maps.newLinkedHashMap();
		for (java.lang.String mapString : config.manifestMaps) {
			int colonIndex = mapString.indexOf(':');
			com.google.common.base.Preconditions.checkState((colonIndex > 0));
			java.lang.String execPath = mapString.substring(0, colonIndex);
			java.lang.String rootRelativePath = mapString.substring((colonIndex + 1));
			com.google.common.base.Preconditions.checkState(((rootRelativePath.indexOf(':')) == (-1)));
			rootRelativePathsMap.put(execPath, rootRelativePath);
		}
		return rootRelativePathsMap;
	}

	private class RunTimeStats {
		private long bestRunTime = java.lang.Long.MAX_VALUE;

		private long worstRunTime = java.lang.Long.MIN_VALUE;

		private long lastStartTime = 0;

		private java.util.List<java.util.List<java.lang.String>> loopedPassesInBestRun = null;

		private void recordStartRun() {
			lastStartTime = java.lang.System.currentTimeMillis();
			com.google.javascript.jscomp.PhaseOptimizer.clearLoopsRun();
		}

		private void recordEndRun() {
			long endTime = java.lang.System.currentTimeMillis();
			long length = endTime - (lastStartTime);
			worstRunTime = java.lang.Math.max(length, worstRunTime);
			if (length < (bestRunTime)) {
				loopedPassesInBestRun = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
				bestRunTime = length;
			}
		}

		private void outputBestPhaseOrdering() {
			try {
				jsOutput.append((("Best time: " + (bestRunTime)) + "\n"));
				jsOutput.append((("Worst time: " + (worstRunTime)) + "\n"));
				int i = 1;
				for (java.util.List<java.lang.String> loop : loopedPassesInBestRun) {
					jsOutput.append((((("\nLoop " + i) + ":\n") + (com.google.common.base.Joiner.on("\n").join(loop))) + "\n"));
					i++;
				}
			} catch (java.io.IOException e) {
				throw new java.lang.RuntimeException("unexpected exception", e);
			}
		}
	}

	static class CommandLineConfig {
		private boolean printTree = false;

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setPrintTree(boolean printTree) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.printTree = printTree;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private boolean computePhaseOrdering = false;

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setComputePhaseOrdering(boolean computePhaseOrdering) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.computePhaseOrdering = computePhaseOrdering;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private boolean printAst = false;

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setPrintAst(boolean printAst) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.printAst = printAst;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private boolean printPassGraph = false;

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setPrintPassGraph(boolean printPassGraph) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.printPassGraph = printPassGraph;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private com.google.javascript.jscomp.CompilerOptions.DevMode jscompDevMode = com.google.javascript.jscomp.CompilerOptions.DevMode.OFF;

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setJscompDevMode(com.google.javascript.jscomp.CompilerOptions.DevMode jscompDevMode) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.jscompDevMode = jscompDevMode;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private java.lang.String loggingLevel = java.util.logging.Level.WARNING.getName();

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setLoggingLevel(java.lang.String loggingLevel) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.loggingLevel = loggingLevel;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private final java.util.List<java.lang.String> externs = com.google.common.collect.Lists.newArrayList();

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setExterns(java.util.List<java.lang.String> externs) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.externs.clear();
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.externs.addAll(externs);
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private final java.util.List<java.lang.String> js = com.google.common.collect.Lists.newArrayList();

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setJs(java.util.List<java.lang.String> js) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.js.clear();
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.js.addAll(js);
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private java.lang.String jsOutputFile = "";

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setJsOutputFile(java.lang.String jsOutputFile) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.jsOutputFile = jsOutputFile;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private final java.util.List<java.lang.String> module = com.google.common.collect.Lists.newArrayList();

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setModule(java.util.List<java.lang.String> module) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.module.clear();
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.module.addAll(module);
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private java.lang.String variableMapInputFile = "";

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setVariableMapInputFile(java.lang.String variableMapInputFile) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.variableMapInputFile = variableMapInputFile;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private java.lang.String propertyMapInputFile = "";

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setPropertyMapInputFile(java.lang.String propertyMapInputFile) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.propertyMapInputFile = propertyMapInputFile;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private java.lang.String variableMapOutputFile = "";

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setVariableMapOutputFile(java.lang.String variableMapOutputFile) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.variableMapOutputFile = variableMapOutputFile;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private boolean createNameMapFiles = false;

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setCreateNameMapFiles(boolean createNameMapFiles) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.createNameMapFiles = createNameMapFiles;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private java.lang.String propertyMapOutputFile = "";

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setPropertyMapOutputFile(java.lang.String propertyMapOutputFile) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.propertyMapOutputFile = propertyMapOutputFile;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private com.google.javascript.jscomp.CodingConvention codingConvention = com.google.javascript.jscomp.CodingConventions.getDefault();

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setCodingConvention(com.google.javascript.jscomp.CodingConvention codingConvention) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.codingConvention = codingConvention;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private int summaryDetailLevel = 1;

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setSummaryDetailLevel(int summaryDetailLevel) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.summaryDetailLevel = summaryDetailLevel;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private java.lang.String outputWrapper = "";

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setOutputWrapper(java.lang.String outputWrapper) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.outputWrapper = outputWrapper;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private final java.util.List<java.lang.String> moduleWrapper = com.google.common.collect.Lists.newArrayList();

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setModuleWrapper(java.util.List<java.lang.String> moduleWrapper) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.moduleWrapper.clear();
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.moduleWrapper.addAll(moduleWrapper);
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private java.lang.String moduleOutputPathPrefix = "";

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setModuleOutputPathPrefix(java.lang.String moduleOutputPathPrefix) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.moduleOutputPathPrefix = moduleOutputPathPrefix;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private java.lang.String createSourceMap = "";

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setCreateSourceMap(java.lang.String createSourceMap) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.createSourceMap = createSourceMap;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private com.google.javascript.jscomp.SourceMap.DetailLevel sourceMapDetailLevel = com.google.javascript.jscomp.SourceMap.DetailLevel.ALL;

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setSourceMapDetailLevel(com.google.javascript.jscomp.SourceMap.DetailLevel level) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.sourceMapDetailLevel = level;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private com.google.javascript.jscomp.SourceMap.Format sourceMapFormat = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setSourceMapFormat(com.google.javascript.jscomp.SourceMap.Format format) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.sourceMapFormat = format;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private com.google.javascript.jscomp.AbstractCommandLineRunner.WarningGuardSpec warningGuards = null;

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setWarningGuardSpec(com.google.javascript.jscomp.AbstractCommandLineRunner.WarningGuardSpec spec) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.warningGuards = spec;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private final java.util.List<java.lang.String> define = com.google.common.collect.Lists.newArrayList();

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setDefine(java.util.List<java.lang.String> define) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.define.clear();
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.define.addAll(define);
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private final java.util.List<java.lang.String> tweak = com.google.common.collect.Lists.newArrayList();

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setTweak(java.util.List<java.lang.String> tweak) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.tweak.clear();
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.tweak.addAll(tweak);
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF;

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setTweakProcessing(com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.tweakProcessing = tweakProcessing;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private java.lang.String charset = "";

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setCharset(java.lang.String charset) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.charset = charset;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private boolean manageClosureDependencies = false;

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setManageClosureDependencies(boolean newVal) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.manageClosureDependencies = newVal;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private java.util.List<java.lang.String> closureEntryPoints = com.google.common.collect.ImmutableList.of();

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setClosureEntryPoints(java.util.List<java.lang.String> entryPoints) {
			com.google.common.base.Preconditions.checkNotNull(entryPoints);
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.closureEntryPoints = entryPoints;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private java.util.List<java.lang.String> outputManifests = com.google.common.collect.ImmutableList.of();

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setOutputManifest(java.util.List<java.lang.String> outputManifests) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.outputManifests = com.google.common.collect.Lists.newArrayList();
			for (java.lang.String manifestName : outputManifests) {
				if (!(manifestName.isEmpty())) {
					com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.outputManifests.add(manifestName);
				}
			}
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.outputManifests = com.google.common.collect.ImmutableList.copyOf(com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.outputManifests);
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private java.util.List<java.lang.String> outputBundles = com.google.common.collect.ImmutableList.of();

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setOutputBundle(java.util.List<java.lang.String> outputBundles) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.outputBundles = outputBundles;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private boolean acceptConstKeyword = false;

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setAcceptConstKeyword(boolean acceptConstKeyword) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.acceptConstKeyword = acceptConstKeyword;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private java.lang.String languageIn = "";

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setLanguageIn(java.lang.String languageIn) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.languageIn = languageIn;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private boolean skipNormalOutputs = false;

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setSkipNormalOutputs(boolean skipNormalOutputs) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.skipNormalOutputs = skipNormalOutputs;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}

		private java.util.List<java.lang.String> manifestMaps = com.google.common.collect.ImmutableList.of();

		com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig setManifestMaps(java.util.List<java.lang.String> manifestMaps) {
			com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this.manifestMaps = manifestMaps;
			return com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.this;
		}
	}

	protected static class WarningGuardSpec {
		private static class Entry {
			private final com.google.javascript.jscomp.CheckLevel level;

			private final java.lang.String groupName;

			private Entry(com.google.javascript.jscomp.CheckLevel level, java.lang.String groupName) {
				this.level = level;
				this.groupName = groupName;
			}
		}

		private final java.util.List<com.google.javascript.jscomp.AbstractCommandLineRunner.WarningGuardSpec.Entry> entries = com.google.common.collect.Lists.newArrayList();

		protected void add(com.google.javascript.jscomp.CheckLevel level, java.lang.String groupName) {
			entries.add(new com.google.javascript.jscomp.AbstractCommandLineRunner.WarningGuardSpec.Entry(level, groupName));
		}

		protected void clear() {
			entries.clear();
		}
	}
}




package com.google.javascript.jscomp;


public class CommandLineRunner extends com.google.javascript.jscomp.AbstractCommandLineRunner<com.google.javascript.jscomp.Compiler, com.google.javascript.jscomp.CompilerOptions> {
	@java.lang.SuppressWarnings(value = "unchecked")
	private static class Flags {
		private static final com.google.javascript.jscomp.AbstractCommandLineRunner.WarningGuardSpec warningGuardSpec = new com.google.javascript.jscomp.AbstractCommandLineRunner.WarningGuardSpec();

		@org.kohsuke.args4j.Option(handler = com.google.javascript.jscomp.CommandLineRunner.Flags.BooleanOptionHandler.class, name = "--help", usage = "Displays this message")
		private boolean display_help = false;

		@org.kohsuke.args4j.Option(handler = com.google.javascript.jscomp.CommandLineRunner.Flags.BooleanOptionHandler.class, name = "--print_tree", usage = "Prints out the parse tree and exits")
		private boolean print_tree = false;

		@org.kohsuke.args4j.Option(handler = com.google.javascript.jscomp.CommandLineRunner.Flags.BooleanOptionHandler.class, name = "--print_ast", usage = "Prints a dot file describing the internal abstract syntax" + " tree and exits")
		private boolean print_ast = false;

		@org.kohsuke.args4j.Option(handler = com.google.javascript.jscomp.CommandLineRunner.Flags.BooleanOptionHandler.class, name = "--print_pass_graph", usage = "Prints a dot file describing the passes that will get run" + " and exits")
		private boolean print_pass_graph = false;

		@org.kohsuke.args4j.Option(aliases = { "--dev_mode" }, name = "--jscomp_dev_mode")
		private com.google.javascript.jscomp.CompilerOptions.DevMode jscomp_dev_mode = com.google.javascript.jscomp.CompilerOptions.DevMode.OFF;

		@org.kohsuke.args4j.Option(name = "--logging_level", usage = "The logging level (standard java.util.logging.Level" + (" values) for Compiler progress. Does not control errors or" + " warnings for the JavaScript code under compilation"))
		private java.lang.String logging_level = java.util.logging.Level.WARNING.getName();

		@org.kohsuke.args4j.Option(name = "--externs", usage = "The file containing javascript externs. You may specify" + " multiple")
		private java.util.List<java.lang.String> externs = com.google.common.collect.Lists.newArrayList();

		@org.kohsuke.args4j.Option(name = "--js", usage = "The javascript filename. You may specify multiple")
		private java.util.List<java.lang.String> js = com.google.common.collect.Lists.newArrayList();

		@org.kohsuke.args4j.Option(name = "--js_output_file", usage = "Primary output filename. If not specified, output is " + "written to stdout")
		private java.lang.String js_output_file = "";

		@org.kohsuke.args4j.Option(name = "--module", usage = "A javascript module specification. The format is " + (((("<name>:<num-js-files>[:[<dep>,...][:]]]. Module names must be " + "unique. Each dep is the name of a module that this module ") + "depends on. Modules must be listed in dependency order, and js ") + "source files must be listed in the corresponding order. Where ") + "--module flags occur in relation to --js flags is unimportant"))
		private java.util.List<java.lang.String> module = com.google.common.collect.Lists.newArrayList();

		@org.kohsuke.args4j.Option(name = "--variable_map_input_file", usage = "File containing the serialized version of the variable " + "renaming map produced by a previous compilation")
		private java.lang.String variable_map_input_file = "";

		@org.kohsuke.args4j.Option(name = "--property_map_input_file", usage = "File containing the serialized version of the property " + "renaming map produced by a previous compilation")
		private java.lang.String property_map_input_file = "";

		@org.kohsuke.args4j.Option(name = "--variable_map_output_file", usage = "File where the serialized version of the variable " + "renaming map produced should be saved")
		private java.lang.String variable_map_output_file = "";

		@org.kohsuke.args4j.Option(handler = com.google.javascript.jscomp.CommandLineRunner.Flags.BooleanOptionHandler.class, name = "--create_name_map_files", usage = "If true, variable renaming and property renaming map " + ((("files will be produced as {binary name}_vars_map.out and " + "{binary name}_props_map.out. Note that this flag cannot be used ") + "in conjunction with either variable_map_output_file or ") + "property_map_output_file"))
		private boolean create_name_map_files = false;

		@org.kohsuke.args4j.Option(name = "--property_map_output_file", usage = "File where the serialized version of the property " + "renaming map produced should be saved")
		private java.lang.String property_map_output_file = "";

		@org.kohsuke.args4j.Option(handler = com.google.javascript.jscomp.CommandLineRunner.Flags.BooleanOptionHandler.class, name = "--third_party", usage = "Check source validity but do not enforce Closure style " + "rules and conventions")
		private boolean third_party = false;

		@org.kohsuke.args4j.Option(name = "--summary_detail_level", usage = "Controls how detailed the compilation summary is. Values:" + (((" 0 (never print summary), 1 (print summary only if there are " + "errors or warnings), 2 (print summary if type checking is on, ") + "see --check_types), 3 (always print summary). The default level ") + "is 1"))
		private int summary_detail_level = 1;

		@org.kohsuke.args4j.Option(name = "--output_wrapper", usage = "Interpolate output into this string at the place denoted" + " by the marker token %output%. See --output_wrapper_marker")
		private java.lang.String output_wrapper = "";

		@org.kohsuke.args4j.Option(name = "--module_wrapper", usage = "An output wrapper for a javascript module (optional). " + ((("The format is <name>:<wrapper>. The module name must correspond " + "with a module specified using --module. The wrapper must ") + "contain %s as the code placeholder. The %basename% placeholder can ") + "also be used to substitute the base name of the module output file."))
		private java.util.List<java.lang.String> module_wrapper = com.google.common.collect.Lists.newArrayList();

		@org.kohsuke.args4j.Option(name = "--module_output_path_prefix", usage = "Prefix for filenames of compiled js modules. " + ("<module-name>.js will be appended to this prefix. Directories " + "will be created as needed. Use with --module"))
		private java.lang.String module_output_path_prefix = "./";

		@org.kohsuke.args4j.Option(name = "--create_source_map", usage = "If specified, a source map file mapping the generated " + ((("source files back to the original source file will be " + "output to the specified path. The %outname% placeholder will ") + "expand to the name of the output file that the source map ") + "corresponds to."))
		private java.lang.String create_source_map = "";

		@org.kohsuke.args4j.Option(name = "--source_map_format", usage = "The source map format to produce. " + "Options: V1, V2, V3, DEFAULT. DEFAULT produces V2.")
		private com.google.javascript.jscomp.SourceMap.Format source_map_format = com.google.javascript.jscomp.SourceMap.Format.DEFAULT;

		@java.lang.SuppressWarnings(value = "unused")
		@org.kohsuke.args4j.Option(handler = com.google.javascript.jscomp.CommandLineRunner.Flags.WarningGuardErrorOptionHandler.class, name = "--jscomp_error", usage = "Make the named class of warnings an error. Options:" + (com.google.javascript.jscomp.DiagnosticGroups.DIAGNOSTIC_GROUP_NAMES))
		private java.util.List<java.lang.String> jscomp_error = com.google.common.collect.Lists.newArrayList();

		@java.lang.SuppressWarnings(value = "unused")
		@org.kohsuke.args4j.Option(handler = com.google.javascript.jscomp.CommandLineRunner.Flags.WarningGuardWarningOptionHandler.class, name = "--jscomp_warning", usage = ("Make the named class of warnings a normal warning. " + "Options:") + (com.google.javascript.jscomp.DiagnosticGroups.DIAGNOSTIC_GROUP_NAMES))
		private java.util.List<java.lang.String> jscomp_warning = com.google.common.collect.Lists.newArrayList();

		@java.lang.SuppressWarnings(value = "unused")
		@org.kohsuke.args4j.Option(handler = com.google.javascript.jscomp.CommandLineRunner.Flags.WarningGuardOffOptionHandler.class, name = "--jscomp_off", usage = "Turn off the named class of warnings. Options:" + (com.google.javascript.jscomp.DiagnosticGroups.DIAGNOSTIC_GROUP_NAMES))
		private java.util.List<java.lang.String> jscomp_off = com.google.common.collect.Lists.newArrayList();

		@org.kohsuke.args4j.Option(aliases = { "--D" , "-D" }, name = "--define", usage = "Override the value of a variable annotated @define. " + ((("The format is <name>[=<val>], where <name> is the name of a @define " + "variable and <val> is a boolean, number, or a single-quoted string ") + "that contains no single quotes. If [=<val>] is omitted, ") + "the variable is marked true"))
		private java.util.List<java.lang.String> define = com.google.common.collect.Lists.newArrayList();

		@org.kohsuke.args4j.Option(name = "--charset", usage = "Input and output charset for all files. By default, we " + "accept UTF-8 as input and output US_ASCII")
		private java.lang.String charset = "";

		@org.kohsuke.args4j.Option(name = "--compilation_level", usage = "Specifies the compilation level to use. Options: " + "WHITESPACE_ONLY, SIMPLE_OPTIMIZATIONS, ADVANCED_OPTIMIZATIONS")
		private com.google.javascript.jscomp.CompilationLevel compilation_level = com.google.javascript.jscomp.CompilationLevel.SIMPLE_OPTIMIZATIONS;

		@org.kohsuke.args4j.Option(name = "--warning_level", usage = "Specifies the warning level to use. Options: " + "QUIET, DEFAULT, VERBOSE")
		private com.google.javascript.jscomp.WarningLevel warning_level = com.google.javascript.jscomp.WarningLevel.DEFAULT;

		@org.kohsuke.args4j.Option(handler = com.google.javascript.jscomp.CommandLineRunner.Flags.BooleanOptionHandler.class, name = "--use_only_custom_externs", usage = "Specifies whether the default externs should be excluded")
		private boolean use_only_custom_externs = false;

		@org.kohsuke.args4j.Option(handler = com.google.javascript.jscomp.CommandLineRunner.Flags.BooleanOptionHandler.class, name = "--debug", usage = "Enable debugging options")
		private boolean debug = false;

		@org.kohsuke.args4j.Option(handler = com.google.javascript.jscomp.CommandLineRunner.Flags.BooleanOptionHandler.class, name = "--generate_exports", usage = "Generates export code for those marked with @export")
		private boolean generate_exports = false;

		@org.kohsuke.args4j.Option(name = "--formatting", usage = "Specifies which formatting options, if any, should be " + ("applied to the output JS. Options: " + "PRETTY_PRINT, PRINT_INPUT_DELIMITER"))
		private java.util.List<com.google.javascript.jscomp.CommandLineRunner.FormattingOption> formatting = com.google.common.collect.Lists.newArrayList();

		@org.kohsuke.args4j.Option(name = "--process_common_js_modules", usage = "Process Common JS modules to a concatenable form.")
		private boolean process_common_js_modules = false;

		@org.kohsuke.args4j.Option(name = "--common_js_module_path_prefix", usage = "Path prefix to be removed from Common JS module names.")
		private java.lang.String common_js_path_prefix = com.google.javascript.jscomp.ProcessCommonJSModules.DEFAULT_FILENAME_PREFIX;

		@org.kohsuke.args4j.Option(name = "--common_js_entry_module", usage = "Root of your common JS dependency hierarchy. " + "Your main script.")
		private java.lang.String common_js_entry_module;

		@org.kohsuke.args4j.Option(name = "--transform_amd_modules", usage = "Transform AMD to Common JS modules.")
		private boolean transform_amd_modules = false;

		@org.kohsuke.args4j.Option(handler = com.google.javascript.jscomp.CommandLineRunner.Flags.BooleanOptionHandler.class, name = "--process_closure_primitives", usage = "Processes built-ins from the Closure library, such as " + "goog.require(), goog.provide(), and goog.exportSymbol()")
		private boolean process_closure_primitives = true;

		@org.kohsuke.args4j.Option(handler = com.google.javascript.jscomp.CommandLineRunner.Flags.BooleanOptionHandler.class, name = "--manage_closure_dependencies", usage = "Automatically sort dependencies so that a file that " + ((("goog.provides symbol X will always come before a file that " + "goog.requires symbol X. If an input provides symbols, and ") + "those symbols are never required, then that input will not ") + "be included in the compilation."))
		private boolean manage_closure_dependencies = false;

		@org.kohsuke.args4j.Option(name = "--closure_entry_point", usage = "Entry points to the program. Must be goog.provide'd " + ((((("symbols. Any goog.provide'd symbols that are not a transitive " + "dependency of the entry points will be removed. Files without ") + "goog.provides, and their dependencies, will always be left in. ") + "If any entry points are specified, then the ") + "manage_closure_dependencies option will be set to true and ") + "all files will be sorted in dependency order."))
		private java.util.List<java.lang.String> closure_entry_point = com.google.common.collect.Lists.newArrayList();

		@org.kohsuke.args4j.Option(handler = com.google.javascript.jscomp.CommandLineRunner.Flags.BooleanOptionHandler.class, name = "--process_jquery_primitives", usage = "Processes built-ins from the Jquery library, such as " + "jQuery.fn and jQuery.extend()")
		private boolean process_jquery_primitives = false;

		@org.kohsuke.args4j.Option(name = "--output_manifest", usage = "Prints out a list of all the files in the compilation. " + (((("If --manage_closure_dependencies is on, this will not include " + "files that got dropped because they were not required. ") + "The %outname% placeholder expands to the js output file. ") + "If you're using modularization, using %outname% will create ") + "a manifest for each module."))
		private java.lang.String output_manifest = "";

		@org.kohsuke.args4j.Option(name = "--accept_const_keyword", usage = "Allows usage of const keyword.")
		private boolean accept_const_keyword = false;

		@org.kohsuke.args4j.Option(name = "--language_in", usage = "Sets what language spec that input sources conform. " + "Options: ECMASCRIPT3 (default), ECMASCRIPT5, ECMASCRIPT5_STRICT")
		private java.lang.String language_in = "ECMASCRIPT3";

		@org.kohsuke.args4j.Option(handler = com.google.javascript.jscomp.CommandLineRunner.Flags.BooleanOptionHandler.class, name = "--version", usage = "Prints the compiler version to stderr.")
		private boolean version = false;

		@org.kohsuke.args4j.Option(name = "--translations_file", usage = "Source of translated messages. Currently only supports XTB.")
		private java.lang.String translationsFile = "";

		@org.kohsuke.args4j.Option(name = "--translations_project", usage = "Scopes all translations to the specified project." + ("When specified, we will use different message ids so that messages " + "in different projects can have different translations."))
		private java.lang.String translationsProject = null;

		@org.kohsuke.args4j.Option(name = "--flagfile", usage = "A file containing additional command-line options.")
		private java.lang.String flag_file = "";

		@org.kohsuke.args4j.Argument
		private java.util.List<java.lang.String> arguments = com.google.common.collect.Lists.newArrayList();

		java.util.List<java.lang.String> getJsFiles() {
			java.util.List<java.lang.String> allJsInputs = com.google.common.collect.Lists.newArrayListWithCapacity(((js.size()) + (arguments.size())));
			allJsInputs.addAll(js);
			allJsInputs.addAll(arguments);
			return allJsInputs;
		}

		public static class BooleanOptionHandler extends org.kohsuke.args4j.spi.OptionHandler<java.lang.Boolean> {
			private static final java.util.Set<java.lang.String> TRUES = com.google.common.collect.Sets.newHashSet("true", "on", "yes", "1");

			private static final java.util.Set<java.lang.String> FALSES = com.google.common.collect.Sets.newHashSet("false", "off", "no", "0");

			public BooleanOptionHandler(org.kohsuke.args4j.CmdLineParser parser, org.kohsuke.args4j.OptionDef option, org.kohsuke.args4j.spi.Setter<? super java.lang.Boolean> setter) {
				super(parser, option, setter);
			}

			@java.lang.Override
			public int parseArguments(org.kohsuke.args4j.spi.Parameters params) throws org.kohsuke.args4j.CmdLineException {
				java.lang.String param = null;
				try {
					param = params.getParameter(0);
				} catch (org.kohsuke.args4j.CmdLineException e) {
				}
				if (param == null) {
					setter.addValue(true);
					return 0;
				}else {
					java.lang.String lowerParam = param.toLowerCase();
					if (com.google.javascript.jscomp.CommandLineRunner.Flags.BooleanOptionHandler.TRUES.contains(lowerParam)) {
						setter.addValue(true);
					}else
						if (com.google.javascript.jscomp.CommandLineRunner.Flags.BooleanOptionHandler.FALSES.contains(lowerParam)) {
							setter.addValue(false);
						}else {
							setter.addValue(true);
							return 0;
						}
					
					return 1;
				}
			}

			@java.lang.Override
			public java.lang.String getDefaultMetaVariable() {
				return null;
			}
		}

		public static class WarningGuardErrorOptionHandler extends org.kohsuke.args4j.spi.StringOptionHandler {
			public WarningGuardErrorOptionHandler(org.kohsuke.args4j.CmdLineParser parser, org.kohsuke.args4j.OptionDef option, org.kohsuke.args4j.spi.Setter<? super java.lang.String> setter) {
				super(parser, option, new com.google.javascript.jscomp.CommandLineRunner.Flags.WarningGuardSetter(setter, com.google.javascript.jscomp.CheckLevel.ERROR));
			}
		}

		public static class WarningGuardWarningOptionHandler extends org.kohsuke.args4j.spi.StringOptionHandler {
			public WarningGuardWarningOptionHandler(org.kohsuke.args4j.CmdLineParser parser, org.kohsuke.args4j.OptionDef option, org.kohsuke.args4j.spi.Setter<? super java.lang.String> setter) {
				super(parser, option, new com.google.javascript.jscomp.CommandLineRunner.Flags.WarningGuardSetter(setter, com.google.javascript.jscomp.CheckLevel.WARNING));
			}
		}

		public static class WarningGuardOffOptionHandler extends org.kohsuke.args4j.spi.StringOptionHandler {
			public WarningGuardOffOptionHandler(org.kohsuke.args4j.CmdLineParser parser, org.kohsuke.args4j.OptionDef option, org.kohsuke.args4j.spi.Setter<? super java.lang.String> setter) {
				super(parser, option, new com.google.javascript.jscomp.CommandLineRunner.Flags.WarningGuardSetter(setter, com.google.javascript.jscomp.CheckLevel.OFF));
			}
		}

		private static class WarningGuardSetter implements org.kohsuke.args4j.spi.Setter<java.lang.String> {
			private final org.kohsuke.args4j.spi.Setter<? super java.lang.String> proxy;

			private final com.google.javascript.jscomp.CheckLevel level;

			private WarningGuardSetter(org.kohsuke.args4j.spi.Setter<? super java.lang.String> proxy, com.google.javascript.jscomp.CheckLevel level) {
				this.proxy = proxy;
				this.level = level;
			}

			@java.lang.Override
			public boolean isMultiValued() {
				return proxy.isMultiValued();
			}

			@java.lang.Override
			public java.lang.Class<java.lang.String> getType() {
				return ((java.lang.Class<java.lang.String>) (proxy.getType()));
			}

			@java.lang.Override
			public void addValue(java.lang.String value) throws org.kohsuke.args4j.CmdLineException {
				proxy.addValue(value);
				com.google.javascript.jscomp.CommandLineRunner.Flags.warningGuardSpec.add(level, value);
			}
		}
	}

	private static enum FormattingOption {
PRETTY_PRINT, PRINT_INPUT_DELIMITER;
		private void applyToOptions(com.google.javascript.jscomp.CompilerOptions options) {
			switch (com.google.javascript.jscomp.CommandLineRunner.FormattingOption.this) {
				case PRETTY_PRINT :
					options.prettyPrint = true;
					break;
				case PRINT_INPUT_DELIMITER :
					options.printInputDelimiter = true;
					break;
				default :
					throw new java.lang.RuntimeException(("Unknown formatting option: " + (com.google.javascript.jscomp.CommandLineRunner.FormattingOption.this)));
			}
		}
	}

	private final com.google.javascript.jscomp.CommandLineRunner.Flags flags = new com.google.javascript.jscomp.CommandLineRunner.Flags();

	private static final java.lang.String configResource = "com.google.javascript.jscomp.parsing.ParserConfig";

	private boolean isConfigValid = false;

	protected CommandLineRunner(java.lang.String[] args) {
		super();
		initConfigFromFlags(args, java.lang.System.err);
	}

	protected CommandLineRunner(java.lang.String[] args, java.io.PrintStream out, java.io.PrintStream err) {
		super(out, err);
		initConfigFromFlags(args, err);
	}

	private java.util.List<java.lang.String> processArgs(java.lang.String[] args) {
		java.util.regex.Pattern argPattern = java.util.regex.Pattern.compile("(--[a-zA-Z_]+)=(.*)");
		java.util.regex.Pattern quotesPattern = java.util.regex.Pattern.compile("^[\'\"](.*)[\'\"]$");
		java.util.List<java.lang.String> processedArgs = com.google.common.collect.Lists.newArrayList();
		for (java.lang.String arg : args) {
			java.util.regex.Matcher matcher = argPattern.matcher(arg);
			if (matcher.matches()) {
				processedArgs.add(matcher.group(1));
				java.lang.String value = matcher.group(2);
				java.util.regex.Matcher quotesMatcher = quotesPattern.matcher(value);
				if (quotesMatcher.matches()) {
					processedArgs.add(quotesMatcher.group(1));
				}else {
					processedArgs.add(value);
				}
			}else {
				processedArgs.add(arg);
			}
		}
		return processedArgs;
	}

	private void processFlagFile(java.io.PrintStream err) throws java.io.IOException, org.kohsuke.args4j.CmdLineException {
		java.util.List<java.lang.String> argsInFile = com.google.common.collect.Lists.newArrayList();
		java.io.File flagFileInput = new java.io.File(flags.flag_file);
		java.util.StringTokenizer tokenizer = new java.util.StringTokenizer(com.google.common.io.Files.toString(flagFileInput, java.nio.charset.Charset.defaultCharset()));
		while (tokenizer.hasMoreTokens()) {
			argsInFile.add(tokenizer.nextToken());
		} 
		flags.flag_file = "";
		java.util.List<java.lang.String> processedFileArgs = processArgs(argsInFile.toArray(new java.lang.String[]{  }));
		org.kohsuke.args4j.CmdLineParser parserFileArgs = new org.kohsuke.args4j.CmdLineParser(flags);
		com.google.javascript.jscomp.CommandLineRunner.Flags.warningGuardSpec.clear();
		parserFileArgs.parseArgument(processedFileArgs.toArray(new java.lang.String[]{  }));
		if (!(flags.flag_file.equals(""))) {
			err.println(("ERROR - Arguments in the file cannot contain " + "--flagfile option."));
			isConfigValid = false;
		}
	}

	private void initConfigFromFlags(java.lang.String[] args, java.io.PrintStream err) {
		java.util.List<java.lang.String> processedArgs = processArgs(args);
		org.kohsuke.args4j.CmdLineParser parser = new org.kohsuke.args4j.CmdLineParser(flags);
		com.google.javascript.jscomp.CommandLineRunner.Flags.warningGuardSpec.clear();
		isConfigValid = true;
		try {
			parser.parseArgument(processedArgs.toArray(new java.lang.String[]{  }));
			if (!(flags.flag_file.equals(""))) {
				processFlagFile(err);
			}
		} catch (org.kohsuke.args4j.CmdLineException e) {
			err.println(e.getMessage());
			isConfigValid = false;
		} catch (java.io.IOException ioErr) {
			err.println((("ERROR - " + (flags.flag_file)) + " read error."));
			isConfigValid = false;
		}
		if (flags.version) {
			java.util.ResourceBundle config = java.util.ResourceBundle.getBundle(com.google.javascript.jscomp.CommandLineRunner.configResource);
			err.println(((((("Closure Compiler (http://code.google.com/closure/compiler)\n" + "Version: ") + (config.getString("compiler.version"))) + "\n") + "Built on: ") + (config.getString("compiler.date"))));
			err.flush();
		}
		if (flags.process_common_js_modules) {
			flags.process_closure_primitives = true;
			flags.manage_closure_dependencies = true;
			if ((flags.common_js_entry_module) == null) {
				err.println("Please specify --common_js_entry_module.");
				err.flush();
				isConfigValid = false;
			}
			flags.closure_entry_point = com.google.common.collect.Lists.newArrayList(com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(flags.common_js_entry_module));
		}
		if ((!(isConfigValid)) || (flags.display_help)) {
			isConfigValid = false;
			parser.printUsage(err);
		}else {
			getCommandLineConfig().setPrintTree(flags.print_tree).setPrintAst(flags.print_ast).setPrintPassGraph(flags.print_pass_graph).setJscompDevMode(flags.jscomp_dev_mode).setLoggingLevel(flags.logging_level).setExterns(flags.externs).setJs(flags.getJsFiles()).setJsOutputFile(flags.js_output_file).setModule(flags.module).setVariableMapInputFile(flags.variable_map_input_file).setPropertyMapInputFile(flags.property_map_input_file).setVariableMapOutputFile(flags.variable_map_output_file).setCreateNameMapFiles(flags.create_name_map_files).setPropertyMapOutputFile(flags.property_map_output_file).setCodingConvention((flags.third_party ? com.google.javascript.jscomp.CodingConventions.getDefault() : new com.google.javascript.jscomp.ClosureCodingConvention())).setSummaryDetailLevel(flags.summary_detail_level).setOutputWrapper(flags.output_wrapper).setModuleWrapper(flags.module_wrapper).setModuleOutputPathPrefix(flags.module_output_path_prefix).setCreateSourceMap(flags.create_source_map).setSourceMapFormat(flags.source_map_format).setWarningGuardSpec(com.google.javascript.jscomp.CommandLineRunner.Flags.warningGuardSpec).setDefine(flags.define).setCharset(flags.charset).setManageClosureDependencies(flags.manage_closure_dependencies).setClosureEntryPoints(flags.closure_entry_point).setOutputManifest(com.google.common.collect.ImmutableList.of(flags.output_manifest)).setAcceptConstKeyword(flags.accept_const_keyword).setLanguageIn(flags.language_in).setProcessCommonJSModules(flags.process_common_js_modules).setCommonJSModulePathPrefix(flags.common_js_path_prefix).setTransformAMDToCJSModules(flags.transform_amd_modules);
		}
	}

	@java.lang.Override
	protected com.google.javascript.jscomp.CompilerOptions createOptions() {
		com.google.javascript.jscomp.CompilerOptions options = new com.google.javascript.jscomp.CompilerOptions();
		options.setCodingConvention(new com.google.javascript.jscomp.ClosureCodingConvention());
		com.google.javascript.jscomp.CompilationLevel level = flags.compilation_level;
		level.setOptionsForCompilationLevel(options);
		if (flags.debug) {
			level.setDebugOptionsForCompilationLevel(options);
		}
		if (flags.generate_exports) {
			options.setGenerateExports(flags.generate_exports);
		}
		com.google.javascript.jscomp.WarningLevel wLevel = flags.warning_level;
		wLevel.setOptionsForWarningLevel(options);
		for (com.google.javascript.jscomp.CommandLineRunner.FormattingOption formattingOption : flags.formatting) {
			formattingOption.applyToOptions(options);
		}
		options.closurePass = flags.process_closure_primitives;
		options.jqueryPass = (flags.process_jquery_primitives) && ((com.google.javascript.jscomp.CompilationLevel.ADVANCED_OPTIMIZATIONS) == level);
		if (flags.process_jquery_primitives) {
			options.setCodingConvention(new com.google.javascript.jscomp.JqueryCodingConvention());
		}
		if (!(flags.translationsFile.isEmpty())) {
			try {
				options.messageBundle = new com.google.javascript.jscomp.XtbMessageBundle(new java.io.FileInputStream(flags.translationsFile), flags.translationsProject);
			} catch (java.io.IOException e) {
				throw new java.lang.RuntimeException("Reading XTB file", e);
			}
		}else
			if ((com.google.javascript.jscomp.CompilationLevel.ADVANCED_OPTIMIZATIONS) == level) {
				options.messageBundle = new com.google.javascript.jscomp.EmptyMessageBundle();
			}
		
		return options;
	}

	@java.lang.Override
	protected com.google.javascript.jscomp.Compiler createCompiler() {
		return new com.google.javascript.jscomp.Compiler(getErrorPrintStream());
	}

	@java.lang.Override
	protected java.util.List<com.google.javascript.jscomp.JSSourceFile> createExterns() throws com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException, java.io.IOException {
		java.util.List<com.google.javascript.jscomp.JSSourceFile> externs = super.createExterns();
		if ((flags.use_only_custom_externs) || (isInTestMode())) {
			return externs;
		}else {
			java.util.List<com.google.javascript.jscomp.JSSourceFile> defaultExterns = com.google.javascript.jscomp.CommandLineRunner.getDefaultExterns();
			defaultExterns.addAll(externs);
			return defaultExterns;
		}
	}

	private static final java.util.List<java.lang.String> DEFAULT_EXTERNS_NAMES = com.google.common.collect.ImmutableList.of("es3.js", "es5.js", "w3c_event.js", "w3c_event3.js", "gecko_event.js", "ie_event.js", "webkit_event.js", "w3c_dom1.js", "w3c_dom2.js", "w3c_dom3.js", "gecko_dom.js", "ie_dom.js", "webkit_dom.js", "w3c_css.js", "gecko_css.js", "ie_css.js", "webkit_css.js", "google.js", "deprecated.js", "fileapi.js", "flash.js", "gears_symbols.js", "gears_types.js", "gecko_xml.js", "html5.js", "ie_vml.js", "iphone.js", "webstorage.js", "w3c_anim_timing.js", "w3c_css3d.js", "w3c_elementtraversal.js", "w3c_geolocation.js", "w3c_indexeddb.js", "w3c_navigation_timing.js", "w3c_range.js", "w3c_selectors.js", "w3c_xml.js", "window.js", "webkit_notifications.js", "webgl.js");

	public static java.util.List<com.google.javascript.jscomp.JSSourceFile> getDefaultExterns() throws java.io.IOException {
		java.io.InputStream input = com.google.javascript.jscomp.CommandLineRunner.class.getResourceAsStream("/externs.zip");
		java.util.zip.ZipInputStream zip = new java.util.zip.ZipInputStream(input);
		java.util.Map<java.lang.String, com.google.javascript.jscomp.JSSourceFile> externsMap = com.google.common.collect.Maps.newHashMap();
		for (java.util.zip.ZipEntry entry = null; (entry = zip.getNextEntry()) != null;) {
			java.io.BufferedInputStream entryStream = new java.io.BufferedInputStream(new com.google.common.io.LimitInputStream(zip, entry.getSize()));
			externsMap.put(entry.getName(), com.google.javascript.jscomp.JSSourceFile.fromInputStream(("externs.zip//" + (entry.getName())), entryStream));
		}
		com.google.common.base.Preconditions.checkState(externsMap.keySet().equals(com.google.common.collect.Sets.newHashSet(com.google.javascript.jscomp.CommandLineRunner.DEFAULT_EXTERNS_NAMES)), "Externs zip must match our hard-coded list of externs.");
		java.util.List<com.google.javascript.jscomp.JSSourceFile> externs = com.google.common.collect.Lists.newArrayList();
		for (java.lang.String key : com.google.javascript.jscomp.CommandLineRunner.DEFAULT_EXTERNS_NAMES) {
			externs.add(externsMap.get(key));
		}
		return externs;
	}

	public boolean shouldRunCompiler() {
		return com.google.javascript.jscomp.CommandLineRunner.this.isConfigValid;
	}

	public static void main(java.lang.String[] args) {
		com.google.javascript.jscomp.CommandLineRunner runner = new com.google.javascript.jscomp.CommandLineRunner(args);
		if (runner.shouldRunCompiler()) {
			runner.run();
		}else {
			java.lang.System.exit((-1));
		}
	}
}


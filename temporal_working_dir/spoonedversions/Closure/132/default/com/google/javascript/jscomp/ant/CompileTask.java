

package com.google.javascript.jscomp.ant;


public final class CompileTask extends org.apache.tools.ant.Task {
	private com.google.javascript.jscomp.CompilerOptions.LanguageMode languageIn;

	private com.google.javascript.jscomp.WarningLevel warningLevel;

	private boolean debugOptions;

	private java.lang.String encoding = "UTF-8";

	private java.lang.String outputEncoding = "UTF-8";

	private com.google.javascript.jscomp.CompilationLevel compilationLevel;

	private boolean customExternsOnly;

	private boolean manageDependencies;

	private boolean prettyPrint;

	private boolean printInputDelimiter;

	private boolean generateExports;

	private boolean replaceProperties;

	private boolean forceRecompile;

	private java.lang.String replacePropertiesPrefix;

	private java.io.File outputFile;

	private final java.util.List<org.apache.tools.ant.types.Parameter> defineParams;

	private final java.util.List<org.apache.tools.ant.types.FileList> externFileLists;

	private final java.util.List<org.apache.tools.ant.types.FileList> sourceFileLists;

	private final java.util.List<org.apache.tools.ant.types.Path> sourcePaths;

	private final java.util.List<com.google.javascript.jscomp.ant.Warning> warnings;

	private java.lang.String sourceMapFormat;

	private java.io.File sourceMapOutputFile;

	public CompileTask() {
		com.google.javascript.jscomp.ant.CompileTask.this.languageIn = com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3;
		com.google.javascript.jscomp.ant.CompileTask.this.warningLevel = com.google.javascript.jscomp.WarningLevel.DEFAULT;
		com.google.javascript.jscomp.ant.CompileTask.this.debugOptions = false;
		com.google.javascript.jscomp.ant.CompileTask.this.compilationLevel = com.google.javascript.jscomp.CompilationLevel.SIMPLE_OPTIMIZATIONS;
		com.google.javascript.jscomp.ant.CompileTask.this.customExternsOnly = false;
		com.google.javascript.jscomp.ant.CompileTask.this.manageDependencies = false;
		com.google.javascript.jscomp.ant.CompileTask.this.prettyPrint = false;
		com.google.javascript.jscomp.ant.CompileTask.this.printInputDelimiter = false;
		com.google.javascript.jscomp.ant.CompileTask.this.generateExports = false;
		com.google.javascript.jscomp.ant.CompileTask.this.replaceProperties = false;
		com.google.javascript.jscomp.ant.CompileTask.this.forceRecompile = false;
		com.google.javascript.jscomp.ant.CompileTask.this.replacePropertiesPrefix = "closure.define.";
		this.defineParams = com.google.common.collect.Lists.newLinkedList();
		this.externFileLists = com.google.common.collect.Lists.newLinkedList();
		this.sourceFileLists = com.google.common.collect.Lists.newLinkedList();
		this.sourcePaths = com.google.common.collect.Lists.newLinkedList();
		this.warnings = com.google.common.collect.Lists.newLinkedList();
	}

	public void setLanguageIn(java.lang.String value) {
		if ((value.equals("ECMASCRIPT5_STRICT")) || (value.equals("ES5_STRICT"))) {
			com.google.javascript.jscomp.ant.CompileTask.this.languageIn = com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT;
		}else
			if ((value.equals("ECMASCRIPT5")) || (value.equals("ES5"))) {
				com.google.javascript.jscomp.ant.CompileTask.this.languageIn = com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5;
			}else
				if ((value.equals("ECMASCRIPT3")) || (value.equals("ES3"))) {
					com.google.javascript.jscomp.ant.CompileTask.this.languageIn = com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3;
				}else {
					throw new org.apache.tools.ant.BuildException((("Unrecognized 'languageIn' option value (" + value) + ")"));
				}
			
		
	}

	public void setWarning(java.lang.String value) {
		if ("default".equalsIgnoreCase(value)) {
			com.google.javascript.jscomp.ant.CompileTask.this.warningLevel = com.google.javascript.jscomp.WarningLevel.DEFAULT;
		}else
			if ("quiet".equalsIgnoreCase(value)) {
				com.google.javascript.jscomp.ant.CompileTask.this.warningLevel = com.google.javascript.jscomp.WarningLevel.QUIET;
			}else
				if ("verbose".equalsIgnoreCase(value)) {
					com.google.javascript.jscomp.ant.CompileTask.this.warningLevel = com.google.javascript.jscomp.WarningLevel.VERBOSE;
				}else {
					throw new org.apache.tools.ant.BuildException((("Unrecognized 'warning' option value (" + value) + ")"));
				}
			
		
	}

	public void setDebug(boolean value) {
		com.google.javascript.jscomp.ant.CompileTask.this.debugOptions = value;
	}

	public void setCompilationLevel(java.lang.String value) {
		if ("simple".equalsIgnoreCase(value)) {
			com.google.javascript.jscomp.ant.CompileTask.this.compilationLevel = com.google.javascript.jscomp.CompilationLevel.SIMPLE_OPTIMIZATIONS;
		}else
			if ("advanced".equalsIgnoreCase(value)) {
				com.google.javascript.jscomp.ant.CompileTask.this.compilationLevel = com.google.javascript.jscomp.CompilationLevel.ADVANCED_OPTIMIZATIONS;
			}else
				if ("whitespace".equalsIgnoreCase(value)) {
					com.google.javascript.jscomp.ant.CompileTask.this.compilationLevel = com.google.javascript.jscomp.CompilationLevel.WHITESPACE_ONLY;
				}else {
					throw new org.apache.tools.ant.BuildException((("Unrecognized 'compilation' option value (" + value) + ")"));
				}
			
		
	}

	public void setManageDependencies(boolean value) {
		com.google.javascript.jscomp.ant.CompileTask.this.manageDependencies = value;
	}

	public void setCustomExternsOnly(boolean value) {
		com.google.javascript.jscomp.ant.CompileTask.this.customExternsOnly = value;
	}

	public void setOutput(java.io.File value) {
		com.google.javascript.jscomp.ant.CompileTask.this.outputFile = value;
	}

	public void setReplacePropertiesPrefix(java.lang.String value) {
		com.google.javascript.jscomp.ant.CompileTask.this.replacePropertiesPrefix = value;
	}

	public void setReplaceProperties(boolean value) {
		com.google.javascript.jscomp.ant.CompileTask.this.replaceProperties = value;
	}

	public void setEncoding(java.lang.String encoding) {
		com.google.javascript.jscomp.ant.CompileTask.this.encoding = encoding;
	}

	public void setOutputEncoding(java.lang.String outputEncoding) {
		com.google.javascript.jscomp.ant.CompileTask.this.outputEncoding = outputEncoding;
	}

	public void setPrettyPrint(boolean pretty) {
		com.google.javascript.jscomp.ant.CompileTask.this.prettyPrint = pretty;
	}

	public void setPrintInputDelimiter(boolean print) {
		com.google.javascript.jscomp.ant.CompileTask.this.printInputDelimiter = print;
	}

	public void setForceRecompile(boolean forceRecompile) {
		com.google.javascript.jscomp.ant.CompileTask.this.forceRecompile = forceRecompile;
	}

	public void setGenerateExports(boolean generateExports) {
		com.google.javascript.jscomp.ant.CompileTask.this.generateExports = generateExports;
	}

	public void addExterns(org.apache.tools.ant.types.FileList list) {
		com.google.javascript.jscomp.ant.CompileTask.this.externFileLists.add(list);
	}

	public void addWarning(com.google.javascript.jscomp.ant.Warning warning) {
		com.google.javascript.jscomp.ant.CompileTask.this.warnings.add(warning);
	}

	public void addSources(org.apache.tools.ant.types.FileList list) {
		com.google.javascript.jscomp.ant.CompileTask.this.sourceFileLists.add(list);
	}

	public void addPath(org.apache.tools.ant.types.Path list) {
		com.google.javascript.jscomp.ant.CompileTask.this.sourcePaths.add(list);
	}

	@java.lang.Override
	public void execute() {
		if ((com.google.javascript.jscomp.ant.CompileTask.this.outputFile) == null) {
			throw new org.apache.tools.ant.BuildException("outputFile attribute must be set");
		}
		com.google.javascript.jscomp.Compiler.setLoggingLevel(java.util.logging.Level.OFF);
		com.google.javascript.jscomp.CompilerOptions options = createCompilerOptions();
		com.google.javascript.jscomp.Compiler compiler = createCompiler(options);
		java.util.List<com.google.javascript.jscomp.SourceFile> externs = findExternFiles();
		java.util.List<com.google.javascript.jscomp.SourceFile> sources = findSourceFiles();
		if ((isStale()) || (forceRecompile)) {
			log((((("Compiling " + (sources.size())) + " file(s) with ") + (externs.size())) + " extern(s)"));
			com.google.javascript.jscomp.Result result = compiler.compile(externs, sources, options);
			if (result.success) {
				java.lang.StringBuilder source = new java.lang.StringBuilder(compiler.toSource());
				if ((result.sourceMap) != null) {
					flushSourceMap(result.sourceMap);
					source.append(java.lang.System.getProperty("line.separator"));
					source.append(("//@ sourceMappingURL=" + (sourceMapOutputFile.getName())));
				}
				writeResult(source.toString());
			}else {
				throw new org.apache.tools.ant.BuildException("Compilation failed.");
			}
		}else {
			log("None of the files changed. Compilation skipped.");
		}
	}

	private void flushSourceMap(com.google.javascript.jscomp.SourceMap sourceMap) {
		try {
			java.io.FileWriter out = new java.io.FileWriter(sourceMapOutputFile);
			sourceMap.appendTo(out, sourceMapOutputFile.getName());
			out.close();
		} catch (java.io.IOException e) {
			throw new org.apache.tools.ant.BuildException("Cannot write sourcemap to file.", e);
		}
	}

	private com.google.javascript.jscomp.CompilerOptions createCompilerOptions() {
		com.google.javascript.jscomp.CompilerOptions options = new com.google.javascript.jscomp.CompilerOptions();
		com.google.javascript.jscomp.ant.CompileTask.this.compilationLevel.setOptionsForCompilationLevel(options);
		if (com.google.javascript.jscomp.ant.CompileTask.this.debugOptions) {
			com.google.javascript.jscomp.ant.CompileTask.this.compilationLevel.setDebugOptionsForCompilationLevel(options);
		}
		options.prettyPrint = com.google.javascript.jscomp.ant.CompileTask.this.prettyPrint;
		options.printInputDelimiter = com.google.javascript.jscomp.ant.CompileTask.this.printInputDelimiter;
		options.generateExports = com.google.javascript.jscomp.ant.CompileTask.this.generateExports;
		options.setLanguageIn(com.google.javascript.jscomp.ant.CompileTask.this.languageIn);
		com.google.javascript.jscomp.ant.CompileTask.this.warningLevel.setOptionsForWarningLevel(options);
		options.setManageClosureDependencies(manageDependencies);
		if (replaceProperties) {
			convertPropertiesMap(options);
		}
		convertDefineParameters(options);
		for (com.google.javascript.jscomp.ant.Warning warning : warnings) {
			com.google.javascript.jscomp.CheckLevel level = warning.getLevel();
			java.lang.String groupName = warning.getGroup();
			com.google.javascript.jscomp.DiagnosticGroup group = new com.google.javascript.jscomp.DiagnosticGroups().forName(groupName);
			if (group == null) {
				throw new org.apache.tools.ant.BuildException((("Unrecognized 'warning' option value (" + groupName) + ")"));
			}
			options.setWarningLevel(group, level);
		}
		if (!(com.google.common.base.Strings.isNullOrEmpty(sourceMapFormat))) {
			options.sourceMapFormat = com.google.javascript.jscomp.SourceMap.Format.valueOf(sourceMapFormat);
		}
		if ((sourceMapOutputFile) != null) {
			java.io.File parentFile = sourceMapOutputFile.getParentFile();
			if (parentFile.mkdirs()) {
				log(("Created missing parent directory " + parentFile), org.apache.tools.ant.Project.MSG_DEBUG);
			}
			options.sourceMapOutputPath = parentFile.getAbsolutePath();
		}
		return options;
	}

	public org.apache.tools.ant.types.Parameter createDefine() {
		org.apache.tools.ant.types.Parameter param = new org.apache.tools.ant.types.Parameter();
		defineParams.add(param);
		return param;
	}

	private void convertDefineParameters(com.google.javascript.jscomp.CompilerOptions options) {
		for (org.apache.tools.ant.types.Parameter p : defineParams) {
			java.lang.String key = p.getName();
			java.lang.Object value = p.getValue();
			if (!(setDefine(options, key, value))) {
				log(((("Unexpected @define value for name=" + key) + "; value=") + value));
			}
		}
	}

	private void convertPropertiesMap(com.google.javascript.jscomp.CompilerOptions options) {
		@java.lang.SuppressWarnings(value = "unchecked")
		java.util.Map<java.lang.String, java.lang.Object> props = getProject().getProperties();
		for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : props.entrySet()) {
			java.lang.String key = entry.getKey();
			java.lang.Object value = entry.getValue();
			if (key.startsWith(replacePropertiesPrefix)) {
				key = key.substring(replacePropertiesPrefix.length());
				if (!(setDefine(options, key, value))) {
					log(((("Unexpected property value for key=" + key) + "; value=") + value));
				}
			}
		}
	}

	private boolean setDefine(com.google.javascript.jscomp.CompilerOptions options, java.lang.String key, java.lang.Object value) {
		boolean success = false;
		if (value instanceof java.lang.String) {
			final boolean isTrue = "true".equals(value);
			final boolean isFalse = "false".equals(value);
			if (isTrue || isFalse) {
				options.setDefineToBooleanLiteral(key, isTrue);
			}else {
				try {
					double dblTemp = java.lang.Double.parseDouble(((java.lang.String) (value)));
					options.setDefineToDoubleLiteral(key, dblTemp);
				} catch (java.lang.NumberFormatException nfe) {
					options.setDefineToStringLiteral(key, ((java.lang.String) (value)));
				}
			}
			success = true;
		}else
			if (value instanceof java.lang.Boolean) {
				options.setDefineToBooleanLiteral(key, ((java.lang.Boolean) (value)));
				success = true;
			}else
				if (value instanceof java.lang.Integer) {
					options.setDefineToNumberLiteral(key, ((java.lang.Integer) (value)));
					success = true;
				}else
					if (value instanceof java.lang.Double) {
						options.setDefineToDoubleLiteral(key, ((java.lang.Double) (value)));
						success = true;
					}
				
			
		
		return success;
	}

	private com.google.javascript.jscomp.Compiler createCompiler(com.google.javascript.jscomp.CompilerOptions options) {
		com.google.javascript.jscomp.Compiler compiler = new com.google.javascript.jscomp.Compiler();
		com.google.javascript.jscomp.MessageFormatter formatter = options.errorFormat.toFormatter(compiler, false);
		com.google.javascript.jscomp.ant.AntErrorManager errorManager = new com.google.javascript.jscomp.ant.AntErrorManager(formatter, com.google.javascript.jscomp.ant.CompileTask.this);
		compiler.setErrorManager(errorManager);
		return compiler;
	}

	private java.util.List<com.google.javascript.jscomp.SourceFile> findExternFiles() {
		java.util.List<com.google.javascript.jscomp.SourceFile> files = com.google.common.collect.Lists.newLinkedList();
		if (!(com.google.javascript.jscomp.ant.CompileTask.this.customExternsOnly)) {
			files.addAll(getDefaultExterns());
		}
		for (org.apache.tools.ant.types.FileList list : com.google.javascript.jscomp.ant.CompileTask.this.externFileLists) {
			files.addAll(findJavaScriptFiles(list));
		}
		return files;
	}

	private java.util.List<com.google.javascript.jscomp.SourceFile> findSourceFiles() {
		java.util.List<com.google.javascript.jscomp.SourceFile> files = com.google.common.collect.Lists.newLinkedList();
		for (org.apache.tools.ant.types.FileList list : com.google.javascript.jscomp.ant.CompileTask.this.sourceFileLists) {
			files.addAll(findJavaScriptFiles(list));
		}
		for (org.apache.tools.ant.types.Path list : com.google.javascript.jscomp.ant.CompileTask.this.sourcePaths) {
			files.addAll(findJavaScriptFiles(list));
		}
		return files;
	}

	private java.util.List<com.google.javascript.jscomp.SourceFile> findJavaScriptFiles(org.apache.tools.ant.types.FileList fileList) {
		java.util.List<com.google.javascript.jscomp.SourceFile> files = com.google.common.collect.Lists.newLinkedList();
		java.io.File baseDir = fileList.getDir(getProject());
		for (java.lang.String included : fileList.getFiles(getProject())) {
			files.add(com.google.javascript.jscomp.SourceFile.fromFile(new java.io.File(baseDir, included), java.nio.charset.Charset.forName(encoding)));
		}
		return files;
	}

	private java.util.List<com.google.javascript.jscomp.SourceFile> findJavaScriptFiles(org.apache.tools.ant.types.Path path) {
		java.util.List<com.google.javascript.jscomp.SourceFile> files = com.google.common.collect.Lists.newArrayList();
		for (java.lang.String included : path.list()) {
			files.add(com.google.javascript.jscomp.SourceFile.fromFile(new java.io.File(included), java.nio.charset.Charset.forName(encoding)));
		}
		return files;
	}

	private java.util.List<com.google.javascript.jscomp.SourceFile> getDefaultExterns() {
		try {
			return com.google.javascript.jscomp.CommandLineRunner.getDefaultExterns();
		} catch (java.io.IOException e) {
			throw new org.apache.tools.ant.BuildException(e);
		}
	}

	private void writeResult(java.lang.String source) {
		if (com.google.javascript.jscomp.ant.CompileTask.this.outputFile.getParentFile().mkdirs()) {
			log(("Created missing parent directory " + (com.google.javascript.jscomp.ant.CompileTask.this.outputFile.getParentFile())), org.apache.tools.ant.Project.MSG_DEBUG);
		}
		try {
			java.io.OutputStreamWriter out = new java.io.OutputStreamWriter(new java.io.FileOutputStream(com.google.javascript.jscomp.ant.CompileTask.this.outputFile), outputEncoding);
			out.append(source);
			out.flush();
			out.close();
		} catch (java.io.IOException e) {
			throw new org.apache.tools.ant.BuildException(e);
		}
		log(("Compiled JavaScript written to " + (com.google.javascript.jscomp.ant.CompileTask.this.outputFile.getAbsolutePath())), org.apache.tools.ant.Project.MSG_DEBUG);
	}

	private boolean isStale() {
		long lastRun = outputFile.lastModified();
		long sourcesLastModified = java.lang.Math.max(getLastModifiedTime(com.google.javascript.jscomp.ant.CompileTask.this.sourceFileLists), getLastModifiedTime(com.google.javascript.jscomp.ant.CompileTask.this.sourcePaths));
		long externsLastModified = getLastModifiedTime(com.google.javascript.jscomp.ant.CompileTask.this.externFileLists);
		return (lastRun <= sourcesLastModified) || (lastRun <= externsLastModified);
	}

	private long getLastModifiedTime(java.util.List<?> fileLists) {
		long lastModified = 0;
		for (java.lang.Object entry : fileLists) {
			if (entry instanceof org.apache.tools.ant.types.FileList) {
				org.apache.tools.ant.types.FileList list = ((org.apache.tools.ant.types.FileList) (entry));
				for (java.lang.String fileName : list.getFiles(com.google.javascript.jscomp.ant.CompileTask.this.getProject())) {
					java.io.File path = list.getDir(com.google.javascript.jscomp.ant.CompileTask.this.getProject());
					java.io.File file = new java.io.File(path, fileName);
					lastModified = java.lang.Math.max(getLastModifiedTime(file), lastModified);
				}
			}else
				if (entry instanceof org.apache.tools.ant.types.Path) {
					org.apache.tools.ant.types.Path path = ((org.apache.tools.ant.types.Path) (entry));
					for (java.lang.String src : path.list()) {
						java.io.File file = new java.io.File(src);
						lastModified = java.lang.Math.max(getLastModifiedTime(file), lastModified);
					}
				}
			
		}
		return lastModified;
	}

	private long getLastModifiedTime(java.io.File file) {
		long fileLastModified = file.lastModified();
		if (fileLastModified == 0) {
			fileLastModified = new java.util.Date().getTime();
		}
		return fileLastModified;
	}

	public void setSourceMapFormat(java.lang.String format) {
		com.google.javascript.jscomp.ant.CompileTask.this.sourceMapFormat = format;
	}

	public void setSourceMapOutputFile(java.io.File sourceMapOutputFile) {
		com.google.javascript.jscomp.ant.CompileTask.this.sourceMapOutputFile = sourceMapOutputFile;
	}
}


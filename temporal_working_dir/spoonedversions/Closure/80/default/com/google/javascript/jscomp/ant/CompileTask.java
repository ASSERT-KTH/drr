

package com.google.javascript.jscomp.ant;


public final class CompileTask extends org.apache.tools.ant.Task {
	private com.google.javascript.jscomp.WarningLevel warningLevel;

	private boolean debugOptions;

	private java.lang.String encoding = "UTF-8";

	private java.lang.String outputEncoding = "UTF-8";

	private com.google.javascript.jscomp.CompilationLevel compilationLevel;

	private boolean customExternsOnly;

	private boolean manageDependencies;

	private boolean prettyPrint;

	private boolean printInputDelimiter;

	private java.io.File outputFile;

	private final java.util.List<org.apache.tools.ant.types.FileList> externFileLists;

	private final java.util.List<org.apache.tools.ant.types.FileList> sourceFileLists;

	public CompileTask() {
		com.google.javascript.jscomp.ant.CompileTask.this.warningLevel = com.google.javascript.jscomp.WarningLevel.DEFAULT;
		com.google.javascript.jscomp.ant.CompileTask.this.debugOptions = false;
		com.google.javascript.jscomp.ant.CompileTask.this.compilationLevel = com.google.javascript.jscomp.CompilationLevel.SIMPLE_OPTIMIZATIONS;
		com.google.javascript.jscomp.ant.CompileTask.this.customExternsOnly = false;
		com.google.javascript.jscomp.ant.CompileTask.this.manageDependencies = false;
		com.google.javascript.jscomp.ant.CompileTask.this.prettyPrint = false;
		com.google.javascript.jscomp.ant.CompileTask.this.printInputDelimiter = false;
		this.externFileLists = com.google.common.collect.Lists.newLinkedList();
		this.sourceFileLists = com.google.common.collect.Lists.newLinkedList();
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

	public void addExterns(org.apache.tools.ant.types.FileList list) {
		com.google.javascript.jscomp.ant.CompileTask.this.externFileLists.add(list);
	}

	public void addSources(org.apache.tools.ant.types.FileList list) {
		com.google.javascript.jscomp.ant.CompileTask.this.sourceFileLists.add(list);
	}

	public void execute() {
		if ((com.google.javascript.jscomp.ant.CompileTask.this.outputFile) == null) {
			throw new org.apache.tools.ant.BuildException("outputFile attribute must be set");
		}
		com.google.javascript.jscomp.Compiler.setLoggingLevel(java.util.logging.Level.OFF);
		com.google.javascript.jscomp.CompilerOptions options = createCompilerOptions();
		com.google.javascript.jscomp.Compiler compiler = createCompiler(options);
		com.google.javascript.jscomp.JSSourceFile[] externs = findExternFiles();
		com.google.javascript.jscomp.JSSourceFile[] sources = findSourceFiles();
		if (isStale()) {
			log((((("Compiling " + (sources.length)) + " file(s) with ") + (externs.length)) + " extern(s)"));
			com.google.javascript.jscomp.Result result = compiler.compile(externs, sources, options);
			if (result.success) {
				writeResult(compiler.toSource());
			}else {
				throw new org.apache.tools.ant.BuildException("Compilation failed.");
			}
		}else {
			log("None of the files changed. Compilation skipped.");
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
		com.google.javascript.jscomp.ant.CompileTask.this.warningLevel.setOptionsForWarningLevel(options);
		options.setManageClosureDependencies(manageDependencies);
		return options;
	}

	private com.google.javascript.jscomp.Compiler createCompiler(com.google.javascript.jscomp.CompilerOptions options) {
		com.google.javascript.jscomp.Compiler compiler = new com.google.javascript.jscomp.Compiler();
		com.google.javascript.jscomp.MessageFormatter formatter = options.errorFormat.toFormatter(compiler, false);
		com.google.javascript.jscomp.ant.AntErrorManager errorManager = new com.google.javascript.jscomp.ant.AntErrorManager(formatter, com.google.javascript.jscomp.ant.CompileTask.this);
		compiler.setErrorManager(errorManager);
		return compiler;
	}

	private com.google.javascript.jscomp.JSSourceFile[] findExternFiles() {
		java.util.List<com.google.javascript.jscomp.JSSourceFile> files = com.google.common.collect.Lists.newLinkedList();
		if (!(com.google.javascript.jscomp.ant.CompileTask.this.customExternsOnly)) {
			files.addAll(getDefaultExterns());
		}
		for (org.apache.tools.ant.types.FileList list : com.google.javascript.jscomp.ant.CompileTask.this.externFileLists) {
			files.addAll(findJavaScriptFiles(list));
		}
		return files.toArray(new com.google.javascript.jscomp.JSSourceFile[files.size()]);
	}

	private com.google.javascript.jscomp.JSSourceFile[] findSourceFiles() {
		java.util.List<com.google.javascript.jscomp.JSSourceFile> files = com.google.common.collect.Lists.newLinkedList();
		for (org.apache.tools.ant.types.FileList list : com.google.javascript.jscomp.ant.CompileTask.this.sourceFileLists) {
			files.addAll(findJavaScriptFiles(list));
		}
		return files.toArray(new com.google.javascript.jscomp.JSSourceFile[files.size()]);
	}

	private java.util.List<com.google.javascript.jscomp.JSSourceFile> findJavaScriptFiles(org.apache.tools.ant.types.FileList fileList) {
		java.util.List<com.google.javascript.jscomp.JSSourceFile> files = com.google.common.collect.Lists.newLinkedList();
		java.io.File baseDir = fileList.getDir(getProject());
		for (java.lang.String included : fileList.getFiles(getProject())) {
			files.add(com.google.javascript.jscomp.JSSourceFile.fromFile(new java.io.File(baseDir, included), java.nio.charset.Charset.forName(encoding)));
		}
		return files;
	}

	private java.util.List<com.google.javascript.jscomp.JSSourceFile> getDefaultExterns() {
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
		log(("Compiled javascript written to " + (com.google.javascript.jscomp.ant.CompileTask.this.outputFile.getAbsolutePath())), org.apache.tools.ant.Project.MSG_DEBUG);
	}

	private boolean isStale() {
		long lastRun = outputFile.lastModified();
		long sourcesLastModified = getLastModifiedTime(com.google.javascript.jscomp.ant.CompileTask.this.sourceFileLists);
		long externsLastModified = getLastModifiedTime(com.google.javascript.jscomp.ant.CompileTask.this.externFileLists);
		return (lastRun <= sourcesLastModified) || (lastRun <= externsLastModified);
	}

	private long getLastModifiedTime(java.util.List<org.apache.tools.ant.types.FileList> fileLists) {
		long lastModified = 0;
		for (org.apache.tools.ant.types.FileList list : fileLists) {
			for (java.lang.String fileName : list.getFiles(com.google.javascript.jscomp.ant.CompileTask.this.getProject())) {
				java.io.File path = list.getDir(com.google.javascript.jscomp.ant.CompileTask.this.getProject());
				java.io.File file = new java.io.File(path, fileName);
				long fileLastModified = file.lastModified();
				if (fileLastModified == 0) {
					fileLastModified = new java.util.Date().getTime();
				}
				lastModified = java.lang.Math.max(fileLastModified, lastModified);
			}
		}
		return lastModified;
	}
}


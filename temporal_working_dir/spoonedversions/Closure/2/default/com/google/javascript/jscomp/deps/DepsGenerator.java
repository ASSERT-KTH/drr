

package com.google.javascript.jscomp.deps;


public class DepsGenerator {
	public static enum InclusionStrategy {
ALWAYS, WHEN_IN_SRCS, DO_NOT_DUPLICATE;	}

	private static java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.javascript.jscomp.deps.DepsGenerator.class.getName());

	private final java.util.Collection<com.google.javascript.jscomp.SourceFile> srcs;

	private final java.util.Collection<com.google.javascript.jscomp.SourceFile> deps;

	private final java.lang.String closurePathAbs;

	private final com.google.javascript.jscomp.deps.DepsGenerator.InclusionStrategy mergeStrategy;

	final com.google.javascript.jscomp.ErrorManager errorManager;

	static final com.google.javascript.jscomp.DiagnosticType SAME_FILE_WARNING = com.google.javascript.jscomp.DiagnosticType.warning("DEPS_SAME_FILE", "Namespace \"{0}\" is both required and provided in the same file.");

	static final com.google.javascript.jscomp.DiagnosticType NEVER_PROVIDED_ERROR = com.google.javascript.jscomp.DiagnosticType.error("DEPS_NEVER_PROVIDED", "Namespace \"{0}\" is required but never provided.");

	static final com.google.javascript.jscomp.DiagnosticType DUPE_PROVIDES_WARNING = com.google.javascript.jscomp.DiagnosticType.warning("DEPS_DUPE_PROVIDES", "Multiple calls to goog.provide(\"{0}\")");

	static final com.google.javascript.jscomp.DiagnosticType MULTIPLE_PROVIDES_ERROR = com.google.javascript.jscomp.DiagnosticType.error("DEPS_DUPE_PROVIDES", "Namespace \"{0}\" is already provided in other file {1}");

	static final com.google.javascript.jscomp.DiagnosticType DUPE_REQUIRE_WARNING = com.google.javascript.jscomp.DiagnosticType.warning("DEPS_DUPE_REQUIRES", "Namespace \"{0}\" is required multiple times");

	static final com.google.javascript.jscomp.DiagnosticType NO_DEPS_WARNING = com.google.javascript.jscomp.DiagnosticType.warning("DEPS_NO_DEPS", "No dependencies found in file");

	public DepsGenerator(java.util.Collection<com.google.javascript.jscomp.SourceFile> deps, java.util.Collection<com.google.javascript.jscomp.SourceFile> srcs, com.google.javascript.jscomp.deps.DepsGenerator.InclusionStrategy mergeStrategy, java.lang.String closurePathAbs, com.google.javascript.jscomp.ErrorManager errorManager) {
		this.deps = deps;
		this.srcs = srcs;
		this.mergeStrategy = mergeStrategy;
		this.closurePathAbs = closurePathAbs;
		this.errorManager = errorManager;
	}

	public java.lang.String computeDependencyCalls() throws java.io.IOException {
		java.util.Map<java.lang.String, com.google.javascript.jscomp.deps.DependencyInfo> depsFiles = parseDepsFiles();
		com.google.javascript.jscomp.deps.DepsGenerator.logger.fine(("preparsedFiles: " + depsFiles));
		java.util.Map<java.lang.String, com.google.javascript.jscomp.deps.DependencyInfo> jsFiles = parseSources(depsFiles.keySet());
		if ((errorManager.getErrorCount()) > 0) {
			return null;
		}
		cleanUpDuplicatedFiles(depsFiles, jsFiles);
		validateDependencies(depsFiles.values(), jsFiles.values());
		if ((errorManager.getErrorCount()) > 0) {
			return null;
		}
		java.io.ByteArrayOutputStream output = new java.io.ByteArrayOutputStream();
		writeDepsContent(depsFiles, jsFiles, new java.io.PrintStream(output));
		return new java.lang.String(output.toByteArray());
	}

	protected void cleanUpDuplicatedFiles(java.util.Map<java.lang.String, com.google.javascript.jscomp.deps.DependencyInfo> depsFiles, java.util.Map<java.lang.String, com.google.javascript.jscomp.deps.DependencyInfo> jsFiles) {
		java.util.Set<java.lang.String> depsPathsCopy = com.google.common.collect.Sets.newHashSet(depsFiles.keySet());
		for (java.lang.String path : depsPathsCopy) {
			if ((mergeStrategy) != (com.google.javascript.jscomp.deps.DepsGenerator.InclusionStrategy.WHEN_IN_SRCS)) {
				jsFiles.remove(path);
			}
		}
		for (java.lang.String path : jsFiles.keySet()) {
			depsFiles.remove(path);
		}
	}

	private void validateDependencies(java.lang.Iterable<com.google.javascript.jscomp.deps.DependencyInfo> preparsedFileDepedencies, java.lang.Iterable<com.google.javascript.jscomp.deps.DependencyInfo> parsedFileDependencies) {
		java.util.Map<java.lang.String, com.google.javascript.jscomp.deps.DependencyInfo> providesMap = com.google.common.collect.Maps.newHashMap();
		addToProvideMap(preparsedFileDepedencies, providesMap);
		addToProvideMap(parsedFileDependencies, providesMap);
		for (com.google.javascript.jscomp.deps.DependencyInfo depInfo : parsedFileDependencies) {
			java.util.List<java.lang.String> requires = com.google.common.collect.Lists.newArrayList(depInfo.getRequires());
			for (int i = 0, l = requires.size(); i < l; ++i) {
				java.lang.String namespace = requires.get(i);
				if (requires.subList((i + 1), l).contains(namespace)) {
					reportDuplicateRequire(namespace, depInfo);
				}
				com.google.javascript.jscomp.deps.DependencyInfo provider = providesMap.get(namespace);
				if (provider == null) {
					reportUndefinedNamespace(namespace, depInfo);
				}else
					if (provider == depInfo) {
						reportSameFile(namespace, depInfo);
					}
				
			}
		}
	}

	private void reportSameFile(java.lang.String namespace, com.google.javascript.jscomp.deps.DependencyInfo depInfo) {
		errorManager.report(com.google.javascript.jscomp.CheckLevel.WARNING, com.google.javascript.jscomp.JSError.make(depInfo.getName(), (-1), (-1), com.google.javascript.jscomp.deps.DepsGenerator.SAME_FILE_WARNING, namespace));
	}

	private void reportUndefinedNamespace(java.lang.String namespace, com.google.javascript.jscomp.deps.DependencyInfo depInfo) {
		errorManager.report(com.google.javascript.jscomp.CheckLevel.ERROR, com.google.javascript.jscomp.JSError.make(depInfo.getName(), (-1), (-1), com.google.javascript.jscomp.deps.DepsGenerator.NEVER_PROVIDED_ERROR, namespace));
	}

	private void reportDuplicateProvide(java.lang.String namespace, com.google.javascript.jscomp.deps.DependencyInfo firstDep, com.google.javascript.jscomp.deps.DependencyInfo secondDep) {
		if (firstDep == secondDep) {
			errorManager.report(com.google.javascript.jscomp.CheckLevel.WARNING, com.google.javascript.jscomp.JSError.make(firstDep.getName(), (-1), (-1), com.google.javascript.jscomp.deps.DepsGenerator.DUPE_PROVIDES_WARNING, namespace));
		}else {
			errorManager.report(com.google.javascript.jscomp.CheckLevel.ERROR, com.google.javascript.jscomp.JSError.make(secondDep.getName(), (-1), (-1), com.google.javascript.jscomp.deps.DepsGenerator.MULTIPLE_PROVIDES_ERROR, namespace, firstDep.getName()));
		}
	}

	private void reportDuplicateRequire(java.lang.String namespace, com.google.javascript.jscomp.deps.DependencyInfo depInfo) {
		errorManager.report(com.google.javascript.jscomp.CheckLevel.WARNING, com.google.javascript.jscomp.JSError.make(depInfo.getName(), (-1), (-1), com.google.javascript.jscomp.deps.DepsGenerator.DUPE_REQUIRE_WARNING, namespace));
	}

	private void reportNoDepsInDepsFile(java.lang.String filePath) {
		errorManager.report(com.google.javascript.jscomp.CheckLevel.WARNING, com.google.javascript.jscomp.JSError.make(filePath, (-1), (-1), com.google.javascript.jscomp.deps.DepsGenerator.NO_DEPS_WARNING));
	}

	private void addToProvideMap(java.lang.Iterable<com.google.javascript.jscomp.deps.DependencyInfo> depInfos, java.util.Map<java.lang.String, com.google.javascript.jscomp.deps.DependencyInfo> providesMap) {
		for (com.google.javascript.jscomp.deps.DependencyInfo depInfo : depInfos) {
			for (java.lang.String provide : depInfo.getProvides()) {
				com.google.javascript.jscomp.deps.DependencyInfo prevValue = providesMap.put(provide, depInfo);
				if (prevValue != null) {
					reportDuplicateProvide(provide, prevValue, depInfo);
				}
			}
		}
	}

	protected com.google.javascript.jscomp.deps.DepsFileParser createDepsFileParser() {
		com.google.javascript.jscomp.deps.DepsFileParser depsParser = new com.google.javascript.jscomp.deps.DepsFileParser(errorManager);
		depsParser.setShortcutMode(true);
		return depsParser;
	}

	protected boolean shouldSkipDepsFile(com.google.javascript.jscomp.SourceFile file) {
		return false;
	}

	private java.util.Map<java.lang.String, com.google.javascript.jscomp.deps.DependencyInfo> parseDepsFiles() throws java.io.IOException {
		com.google.javascript.jscomp.deps.DepsFileParser depsParser = createDepsFileParser();
		java.util.Map<java.lang.String, com.google.javascript.jscomp.deps.DependencyInfo> depsFiles = com.google.common.collect.Maps.newHashMap();
		for (com.google.javascript.jscomp.SourceFile file : deps) {
			if (!(shouldSkipDepsFile(file))) {
				java.util.List<com.google.javascript.jscomp.deps.DependencyInfo> depInfos = depsParser.parseFileReader(file.getName(), file.getCodeReader());
				if (depInfos.isEmpty()) {
					reportNoDepsInDepsFile(file.getName());
				}else {
					for (com.google.javascript.jscomp.deps.DependencyInfo info : depInfos) {
						depsFiles.put(info.getPathRelativeToClosureBase(), info);
					}
				}
			}
		}
		for (com.google.javascript.jscomp.SourceFile src : srcs) {
			if ((new java.io.File(src.getName()).exists()) && (!(shouldSkipDepsFile(src)))) {
				java.util.List<com.google.javascript.jscomp.deps.DependencyInfo> srcInfos = depsParser.parseFileReader(src.getName(), src.getCodeReader());
				for (com.google.javascript.jscomp.deps.DependencyInfo info : srcInfos) {
					depsFiles.put(info.getPathRelativeToClosureBase(), info);
				}
			}
		}
		return depsFiles;
	}

	private java.util.Map<java.lang.String, com.google.javascript.jscomp.deps.DependencyInfo> parseSources(java.util.Set<java.lang.String> preparsedFiles) throws java.io.IOException {
		java.util.Map<java.lang.String, com.google.javascript.jscomp.deps.DependencyInfo> parsedFiles = com.google.common.collect.Maps.newHashMap();
		com.google.javascript.jscomp.deps.JsFileParser jsParser = new com.google.javascript.jscomp.deps.JsFileParser(errorManager);
		for (com.google.javascript.jscomp.SourceFile file : srcs) {
			java.lang.String closureRelativePath = com.google.javascript.jscomp.deps.PathUtil.makeRelative(closurePathAbs, com.google.javascript.jscomp.deps.PathUtil.makeAbsolute(file.getName()));
			com.google.javascript.jscomp.deps.DepsGenerator.logger.fine(("Closure-relative path: " + closureRelativePath));
			if (((com.google.javascript.jscomp.deps.DepsGenerator.InclusionStrategy.WHEN_IN_SRCS) == (mergeStrategy)) || (!(preparsedFiles.contains(closureRelativePath)))) {
				com.google.javascript.jscomp.deps.DependencyInfo depInfo = jsParser.parseFile(file.getName(), closureRelativePath, file.getCode());
				file.clearCachedSource();
				parsedFiles.put(closureRelativePath, depInfo);
			}
		}
		return parsedFiles;
	}

	private void writeDepsContent(java.util.Map<java.lang.String, com.google.javascript.jscomp.deps.DependencyInfo> depsFiles, java.util.Map<java.lang.String, com.google.javascript.jscomp.deps.DependencyInfo> jsFiles, java.io.PrintStream out) throws java.io.IOException {
		writeDepInfos(out, jsFiles.values());
		if ((mergeStrategy) == (com.google.javascript.jscomp.deps.DepsGenerator.InclusionStrategy.ALWAYS)) {
			com.google.common.collect.Multimap<java.lang.String, com.google.javascript.jscomp.deps.DependencyInfo> infosIndex = com.google.common.collect.Multimaps.index(depsFiles.values(), new com.google.common.base.Function<com.google.javascript.jscomp.deps.DependencyInfo, java.lang.String>() {
				@java.lang.Override
				public java.lang.String apply(com.google.javascript.jscomp.deps.DependencyInfo from) {
					return from.getName();
				}
			});
			for (java.lang.String depsPath : infosIndex.keySet()) {
				java.lang.String path = formatPathToDepsFile(depsPath);
				out.println(("\n// Included from: " + path));
				writeDepInfos(out, infosIndex.get(depsPath));
			}
		}
	}

	protected java.lang.String formatPathToDepsFile(java.lang.String path) {
		return path;
	}

	private void writeDepInfos(java.io.PrintStream out, java.util.Collection<com.google.javascript.jscomp.deps.DependencyInfo> depInfos) throws java.io.IOException {
		for (com.google.javascript.jscomp.deps.DependencyInfo depInfo : depInfos) {
			java.util.Collection<java.lang.String> provides = depInfo.getProvides();
			java.util.Collection<java.lang.String> requires = depInfo.getRequires();
			out.print((("goog.addDependency('" + (depInfo.getPathRelativeToClosureBase())) + "', "));
			com.google.javascript.jscomp.deps.DepsGenerator.writeJsArray(out, provides);
			out.print(", ");
			com.google.javascript.jscomp.deps.DepsGenerator.writeJsArray(out, requires);
			out.println(");");
		}
	}

	private static void writeJsArray(java.io.PrintStream out, java.util.Collection<java.lang.String> values) {
		if (values.isEmpty()) {
			out.print("[]");
		}else {
			out.print("['");
			out.print(com.google.common.base.Joiner.on("', '").join(values));
			out.print("']");
		}
	}

	static java.util.List<com.google.javascript.jscomp.SourceFile> createSourceFilesFromPaths(java.util.Collection<java.lang.String> paths) {
		java.util.List<com.google.javascript.jscomp.SourceFile> files = com.google.common.collect.Lists.newArrayList();
		for (java.lang.String path : paths) {
			files.add(com.google.javascript.jscomp.SourceFile.fromFile(path));
		}
		return files;
	}

	static java.util.List<com.google.javascript.jscomp.SourceFile> createSourceFilesFromPaths(java.lang.String... paths) {
		return com.google.javascript.jscomp.deps.DepsGenerator.createSourceFilesFromPaths(java.util.Arrays.asList(paths));
	}
}


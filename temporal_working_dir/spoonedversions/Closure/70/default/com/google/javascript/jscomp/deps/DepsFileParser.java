

package com.google.javascript.jscomp.deps;


public class DepsFileParser extends com.google.javascript.jscomp.deps.JsFileLineParser {
	private static java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.javascript.jscomp.deps.DepsFileParser.class.getName());

	private final java.util.regex.Matcher depMatcher = java.util.regex.Pattern.compile("\\s*goog.addDependency\\((.*)\\);?\\s*").matcher("");

	private final java.util.regex.Matcher depArgsMatch = java.util.regex.Pattern.compile("\\s*([^,]*), (\\[[^\\]]*\\]), (\\[[^\\]]*\\])\\s*").matcher("");

	private java.util.List<com.google.javascript.jscomp.deps.DependencyInfo> depInfos;

	public DepsFileParser(com.google.javascript.jscomp.ErrorManager errorManager) {
		super(errorManager);
	}

	public java.util.List<com.google.javascript.jscomp.deps.DependencyInfo> parseFile(java.lang.String filePath) throws java.io.IOException {
		return parseFileReader(filePath, new java.io.FileReader(filePath));
	}

	public java.util.List<com.google.javascript.jscomp.deps.DependencyInfo> parseFile(java.lang.String filePath, java.lang.String fileContents) {
		return parseFileReader(filePath, new java.io.StringReader(fileContents));
	}

	public java.util.List<com.google.javascript.jscomp.deps.DependencyInfo> parseFileReader(java.lang.String filePath, java.io.Reader reader) {
		depInfos = com.google.common.collect.Lists.newArrayList();
		com.google.javascript.jscomp.deps.DepsFileParser.logger.info(("Parsing Dep: " + filePath));
		doParse(filePath, reader);
		return depInfos;
	}

	@java.lang.Override
	protected boolean parseLine(java.lang.String line) throws com.google.javascript.jscomp.deps.JsFileLineParser.ParseException {
		boolean hasDependencies = false;
		if ((line.indexOf("addDependency")) != (-1)) {
			depMatcher.reset(line);
			if (depMatcher.matches()) {
				hasDependencies = true;
				java.lang.String addDependencyParams = depMatcher.group(1);
				depArgsMatch.reset(addDependencyParams);
				if (!(depArgsMatch.matches())) {
					throw new com.google.javascript.jscomp.deps.JsFileLineParser.ParseException(("Invalid arguments to goog.addDependency(). Found: " + addDependencyParams), true);
				}
				java.lang.String path = parseJsString(depArgsMatch.group(1));
				com.google.javascript.jscomp.deps.DependencyInfo depInfo = new com.google.javascript.jscomp.deps.SimpleDependencyInfo(path, filePath, parseJsStringArray(depArgsMatch.group(2)), parseJsStringArray(depArgsMatch.group(3)));
				if (com.google.javascript.jscomp.deps.DepsFileParser.logger.isLoggable(java.util.logging.Level.FINE)) {
					com.google.javascript.jscomp.deps.DepsFileParser.logger.fine(("Found dep: " + depInfo));
				}
				depInfos.add(depInfo);
			}
		}
		return ((!(shortcutMode)) || hasDependencies) || (com.google.common.base.CharMatcher.WHITESPACE.matchesAllOf(line));
	}
}


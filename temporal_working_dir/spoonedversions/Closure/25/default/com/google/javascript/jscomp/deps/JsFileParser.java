

package com.google.javascript.jscomp.deps;


public class JsFileParser extends com.google.javascript.jscomp.deps.JsFileLineParser {
	private static java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.javascript.jscomp.deps.JsFileParser.class.getName());

	private static final java.util.regex.Pattern GOOG_PROVIDE_REQUIRE_PATTERN = java.util.regex.Pattern.compile("(?:^|;)\\s*goog\\.(provide|require|addDependency)\\s*\\((.*?)\\)");

	private static final java.lang.String BASE_JS_START = "var COMPILED = false;";

	private java.util.regex.Matcher googMatcher = com.google.javascript.jscomp.deps.JsFileParser.GOOG_PROVIDE_REQUIRE_PATTERN.matcher("");

	private java.util.List<java.lang.String> provides;

	private java.util.List<java.lang.String> requires;

	private boolean fileHasProvidesOrRequires;

	private boolean includeGoogBase = false;

	public JsFileParser(com.google.javascript.jscomp.ErrorManager errorManager) {
		super(errorManager);
	}

	public com.google.javascript.jscomp.deps.JsFileParser setIncludeGoogBase(boolean include) {
		includeGoogBase = include;
		return com.google.javascript.jscomp.deps.JsFileParser.this;
	}

	public com.google.javascript.jscomp.deps.DependencyInfo parseFile(java.lang.String filePath, java.lang.String closureRelativePath) throws java.io.IOException {
		return parseReader(filePath, closureRelativePath, new java.io.FileReader(filePath));
	}

	public com.google.javascript.jscomp.deps.DependencyInfo parseFile(java.lang.String filePath, java.lang.String closureRelativePath, java.lang.String fileContents) {
		return parseReader(filePath, closureRelativePath, new java.io.StringReader(fileContents));
	}

	private com.google.javascript.jscomp.deps.DependencyInfo parseReader(java.lang.String filePath, java.lang.String closureRelativePath, java.io.Reader fileContents) {
		provides = com.google.common.collect.Lists.newArrayList();
		requires = com.google.common.collect.Lists.newArrayList();
		fileHasProvidesOrRequires = false;
		com.google.javascript.jscomp.deps.JsFileParser.logger.fine(("Parsing Source: " + filePath));
		doParse(filePath, fileContents);
		com.google.javascript.jscomp.deps.DependencyInfo dependencyInfo = new com.google.javascript.jscomp.deps.SimpleDependencyInfo(closureRelativePath, filePath, provides, requires);
		com.google.javascript.jscomp.deps.JsFileParser.logger.fine(("DepInfo: " + dependencyInfo));
		return dependencyInfo;
	}

	@java.lang.Override
	protected boolean parseLine(java.lang.String line) throws com.google.javascript.jscomp.deps.JsFileLineParser.ParseException {
		boolean lineHasProvidesOrRequires = false;
		if ((((line.indexOf("provide")) != (-1)) || ((line.indexOf("require")) != (-1))) || ((line.indexOf("addDependency")) != (-1))) {
			googMatcher.reset(line);
			while (googMatcher.find()) {
				lineHasProvidesOrRequires = true;
				if ((includeGoogBase) && (!(fileHasProvidesOrRequires))) {
					fileHasProvidesOrRequires = true;
					requires.add("goog");
				}
				char firstChar = googMatcher.group(1).charAt(0);
				boolean isProvide = firstChar == 'p';
				boolean isRequire = firstChar == 'r';
				if (isProvide || isRequire) {
					java.lang.String arg = parseJsString(googMatcher.group(2));
					if (isRequire) {
						if (!("goog".equals(arg))) {
							requires.add(arg);
						}
					}else {
						provides.add(arg);
					}
				}
			} 
		}else
			if ((((includeGoogBase) && (line.startsWith(com.google.javascript.jscomp.deps.JsFileParser.BASE_JS_START))) && (provides.isEmpty())) && (requires.isEmpty())) {
				provides.add("goog");
				return false;
			}
		
		return ((!(shortcutMode)) || lineHasProvidesOrRequires) || (com.google.common.base.CharMatcher.WHITESPACE.matchesAllOf(line));
	}
}


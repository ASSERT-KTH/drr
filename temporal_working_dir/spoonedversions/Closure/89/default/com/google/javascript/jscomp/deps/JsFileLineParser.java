

package com.google.javascript.jscomp.deps;


public abstract class JsFileLineParser {
	static final com.google.javascript.jscomp.DiagnosticType PARSE_WARNING = com.google.javascript.jscomp.DiagnosticType.warning("DEPS_PARSE_WARNING", "{0}\n{1}");

	static final com.google.javascript.jscomp.DiagnosticType PARSE_ERROR = com.google.javascript.jscomp.DiagnosticType.error("DEPS_PARSE_ERROR", "{0}\n{1}");

	boolean shortcutMode = false;

	static class ParseException extends java.lang.Exception {
		public static final long serialVersionUID = 1L;

		private boolean fatal;

		public ParseException(java.lang.String message, boolean fatal) {
			super(message);
			com.google.javascript.jscomp.deps.JsFileLineParser.ParseException.this.fatal = fatal;
		}

		public boolean isFatal() {
			return fatal;
		}
	}

	private static final java.util.regex.Pattern STRING_LITERAL_PATTERN = java.util.regex.Pattern.compile("\\s*(?:\'((?:\\\\\'|[^\'])*?)\'|\"((?:\\\\\"|[^\"])*?)\")\\s*");

	private java.util.regex.Matcher valueMatcher = com.google.javascript.jscomp.deps.JsFileLineParser.STRING_LITERAL_PATTERN.matcher("");

	java.lang.String filePath;

	int lineNum;

	com.google.javascript.jscomp.ErrorManager errorManager;

	boolean parseSucceeded;

	public JsFileLineParser(com.google.javascript.jscomp.ErrorManager errorManager) {
		com.google.javascript.jscomp.deps.JsFileLineParser.this.errorManager = errorManager;
	}

	public void setShortcutMode(boolean mode) {
		com.google.javascript.jscomp.deps.JsFileLineParser.this.shortcutMode = mode;
	}

	public boolean didParseSucceed() {
		return parseSucceeded;
	}

	void doParse(java.lang.String filePath, java.io.Reader fileContents) {
		com.google.javascript.jscomp.deps.JsFileLineParser.this.filePath = filePath;
		parseSucceeded = true;
		java.io.BufferedReader lineBuffer = new java.io.BufferedReader(fileContents);
		java.lang.String line = null;
		lineNum = 0;
		boolean inMultilineComment = false;
		try {
			while (null != (line = lineBuffer.readLine())) {
				++(lineNum);
				try {
					java.lang.String revisedLine = line;
					if (inMultilineComment) {
						int endOfComment = revisedLine.indexOf("*/");
						if (endOfComment != (-1)) {
							revisedLine = revisedLine.substring((endOfComment + 2));
							inMultilineComment = false;
						}else {
							revisedLine = "";
						}
					}
					if (!inMultilineComment) {
						while (true) {
							int startOfLineComment = revisedLine.indexOf("//");
							int startOfMultilineComment = revisedLine.indexOf("/*");
							if ((startOfLineComment != (-1)) && ((startOfMultilineComment == (-1)) || (startOfLineComment < startOfMultilineComment))) {
								revisedLine = revisedLine.substring(0, startOfLineComment);
								break;
							}else
								if (startOfMultilineComment != (-1)) {
									int endOfMultilineComment = revisedLine.indexOf("*/", (startOfMultilineComment + 2));
									if (endOfMultilineComment == (-1)) {
										revisedLine = revisedLine.substring(0, startOfMultilineComment);
										inMultilineComment = true;
										break;
									}else {
										revisedLine = (revisedLine.substring(0, startOfMultilineComment)) + (revisedLine.substring((endOfMultilineComment + 2)));
									}
								}else {
									break;
								}
							
						} 
					}
					if (!(revisedLine.isEmpty())) {
						if ((!(parseLine(revisedLine))) && (shortcutMode)) {
							break;
						}
					}
				} catch (com.google.javascript.jscomp.deps.JsFileLineParser.ParseException e) {
					errorManager.report((e.isFatal() ? com.google.javascript.jscomp.CheckLevel.ERROR : com.google.javascript.jscomp.CheckLevel.WARNING), com.google.javascript.jscomp.JSError.make(filePath, lineNum, 0, (e.isFatal() ? com.google.javascript.jscomp.deps.JsFileLineParser.PARSE_ERROR : com.google.javascript.jscomp.deps.JsFileLineParser.PARSE_WARNING), e.getMessage(), line));
					parseSucceeded = (parseSucceeded) && (!(e.isFatal()));
				}
			} 
		} catch (java.io.IOException e) {
			errorManager.report(com.google.javascript.jscomp.CheckLevel.ERROR, com.google.javascript.jscomp.JSError.make(filePath, 0, 0, com.google.javascript.jscomp.deps.JsFileLineParser.PARSE_ERROR, ("Error reading file: " + filePath)));
			parseSucceeded = false;
		}
	}

	abstract boolean parseLine(java.lang.String line) throws com.google.javascript.jscomp.deps.JsFileLineParser.ParseException;

	java.lang.String parseJsString(java.lang.String jsStringLiteral) throws com.google.javascript.jscomp.deps.JsFileLineParser.ParseException {
		valueMatcher.reset(jsStringLiteral);
		if (!(valueMatcher.matches())) {
			throw new com.google.javascript.jscomp.deps.JsFileLineParser.ParseException("Syntax error in JS String literal", true);
		}
		return (valueMatcher.group(1)) != null ? valueMatcher.group(1) : valueMatcher.group(2);
	}

	java.util.List<java.lang.String> parseJsStringArray(java.lang.String input) throws com.google.javascript.jscomp.deps.JsFileLineParser.ParseException {
		java.util.List<java.lang.String> results = com.google.common.collect.Lists.newArrayList();
		int indexStart = input.indexOf('[');
		int indexEnd = input.lastIndexOf(']');
		if ((indexStart == (-1)) || (indexEnd == (-1))) {
			throw new com.google.javascript.jscomp.deps.JsFileLineParser.ParseException("Syntax error when parsing JS array", true);
		}
		java.lang.String innerValues = input.substring((indexStart + 1), indexEnd);
		if (!(innerValues.trim().isEmpty())) {
			valueMatcher.reset(innerValues);
			for (; ;) {
				if (!(valueMatcher.lookingAt())) {
					throw new com.google.javascript.jscomp.deps.JsFileLineParser.ParseException("Syntax error in JS String literal", true);
				}
				results.add(((valueMatcher.group(1)) != null ? valueMatcher.group(1) : valueMatcher.group(2)));
				if (valueMatcher.hitEnd()) {
					break;
				}
				if ((innerValues.charAt(valueMatcher.end())) != ',') {
					throw new com.google.javascript.jscomp.deps.JsFileLineParser.ParseException("Missing comma in string array", true);
				}
				valueMatcher.region(((valueMatcher.end()) + 1), valueMatcher.regionEnd());
			}
		}
		return results;
	}
}


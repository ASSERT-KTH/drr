

package com.google.javascript.jscomp.deps;


public class JsFunctionParser extends com.google.javascript.jscomp.deps.JsFileLineParser {
	public static class SymbolInfo {
		public final java.lang.String functionName;

		public final java.lang.String symbol;

		private SymbolInfo(java.lang.String functionName, java.lang.String symbol) {
			this.functionName = functionName;
			this.symbol = symbol;
		}
	}

	private static java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.javascript.jscomp.deps.JsFunctionParser.class.getName());

	private java.util.regex.Pattern pattern;

	private java.util.regex.Matcher matcher;

	private java.util.Collection<com.google.javascript.jscomp.deps.JsFunctionParser.SymbolInfo> symbols;

	private java.util.Collection<java.lang.String> functionsToParse;

	public JsFunctionParser(java.util.Collection<java.lang.String> functions, com.google.javascript.jscomp.ErrorManager errorManager) {
		super(errorManager);
		functionsToParse = functions;
		pattern = getPattern(functions);
		matcher = pattern.matcher("");
	}

	private java.util.regex.Pattern getPattern(java.util.Collection<java.lang.String> functions) {
		java.lang.StringBuilder sb = new java.lang.StringBuilder("(?:^|;)\\s*(");
		for (java.lang.String function : functions) {
			sb.append(((java.util.regex.Pattern.quote(function)) + "|"));
		}
		sb.deleteCharAt(((sb.length()) - 1));
		sb.append(")\\s*\\((.*?)\\)");
		return java.util.regex.Pattern.compile(sb.toString());
	}

	public java.util.Collection<com.google.javascript.jscomp.deps.JsFunctionParser.SymbolInfo> parseFile(java.lang.String filePath, java.lang.String fileContents) {
		return parseReader(filePath, new java.io.StringReader(fileContents));
	}

	private java.util.Collection<com.google.javascript.jscomp.deps.JsFunctionParser.SymbolInfo> parseReader(java.lang.String filePath, java.io.Reader fileContents) {
		symbols = com.google.common.collect.Lists.newArrayList();
		com.google.javascript.jscomp.deps.JsFunctionParser.logger.fine(("Parsing Source: " + filePath));
		doParse(filePath, fileContents);
		return symbols;
	}

	@java.lang.Override
	protected boolean parseLine(java.lang.String line) throws com.google.javascript.jscomp.deps.JsFileLineParser.ParseException {
		boolean hasFunctions = false;
		boolean parseLine = false;
		for (java.lang.String function : functionsToParse) {
			if ((line.indexOf(function)) != (-1)) {
				parseLine = true;
				break;
			}
		}
		if (parseLine) {
			matcher.reset(line);
			while (matcher.find()) {
				hasFunctions = true;
				java.lang.String functionName = matcher.group(1);
				java.lang.String arg = parseJsString(matcher.group(2));
				symbols.add(new com.google.javascript.jscomp.deps.JsFunctionParser.SymbolInfo(functionName, arg));
			} 
		}
		return ((!(shortcutMode)) || hasFunctions) || (com.google.common.base.CharMatcher.WHITESPACE.matchesAllOf(line));
	}
}


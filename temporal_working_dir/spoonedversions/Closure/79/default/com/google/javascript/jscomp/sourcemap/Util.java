

package com.google.javascript.jscomp.sourcemap;


class Util {
	private static final char[] HEX_CHARS = new char[]{ '0' , '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9' , 'a' , 'b' , 'c' , 'd' , 'e' , 'f' };

	static java.lang.String escapeString(java.lang.String s) {
		return com.google.javascript.jscomp.sourcemap.Util.escapeString(s, '"', "\\\"", "\'", "\\\\", null);
	}

	static java.lang.String escapeString(java.lang.String s, char quote, java.lang.String doublequoteEscape, java.lang.String singlequoteEscape, java.lang.String backslashEscape, java.nio.charset.CharsetEncoder outputCharsetEncoder) {
		java.lang.StringBuilder sb = new java.lang.StringBuilder(((s.length()) + 2));
		sb.append(quote);
		for (int i = 0; i < (s.length()); i++) {
			char c = s.charAt(i);
			switch (c) {
				case '\n' :
					sb.append("\\n");
					break;
				case '\r' :
					sb.append("\\r");
					break;
				case '\t' :
					sb.append("\\t");
					break;
				case '\\' :
					sb.append(backslashEscape);
					break;
				case '\"' :
					sb.append(doublequoteEscape);
					break;
				case '\'' :
					sb.append(singlequoteEscape);
					break;
				case '>' :
					if ((i >= 2) && ((((s.charAt((i - 1))) == '-') && ((s.charAt((i - 2))) == '-')) || (((s.charAt((i - 1))) == ']') && ((s.charAt((i - 2))) == ']')))) {
						sb.append("\\>");
					}else {
						sb.append(c);
					}
					break;
				case '<' :
					final java.lang.String END_SCRIPT = "/script";
					final java.lang.String START_COMMENT = "!--";
					if (s.regionMatches(true, (i + 1), END_SCRIPT, 0, END_SCRIPT.length())) {
						sb.append("<\\");
					}else
						if (s.regionMatches(false, (i + 1), START_COMMENT, 0, START_COMMENT.length())) {
							sb.append("<\\");
						}else {
							sb.append(c);
						}
					
					break;
				default :
					if (outputCharsetEncoder != null) {
						if (outputCharsetEncoder.canEncode(c)) {
							sb.append(c);
						}else {
							com.google.javascript.jscomp.sourcemap.Util.appendCharAsHex(sb, c);
						}
					}else {
						if ((c > 31) && (c <= 127)) {
							sb.append(c);
						}else {
							com.google.javascript.jscomp.sourcemap.Util.appendCharAsHex(sb, c);
						}
					}
			}
		}
		sb.append(quote);
		return sb.toString();
	}

	@java.lang.SuppressWarnings(value = "cast")
	private static void appendCharAsHex(java.lang.StringBuilder sb, char c) {
		try {
			com.google.javascript.jscomp.sourcemap.Util.appendHexJavaScriptRepresentation(sb, ((int) (c)));
		} catch (java.io.IOException ex) {
			throw new java.lang.RuntimeException(ex);
		}
	}

	private static void appendHexJavaScriptRepresentation(java.lang.Appendable out, int codePoint) throws java.io.IOException {
		if (java.lang.Character.isSupplementaryCodePoint(codePoint)) {
			char[] surrogates = java.lang.Character.toChars(codePoint);
			com.google.javascript.jscomp.sourcemap.Util.appendHexJavaScriptRepresentation(out, surrogates[0]);
			com.google.javascript.jscomp.sourcemap.Util.appendHexJavaScriptRepresentation(out, surrogates[1]);
			return ;
		}
		out.append("\\u").append(com.google.javascript.jscomp.sourcemap.Util.HEX_CHARS[((codePoint >>> 12) & 15)]).append(com.google.javascript.jscomp.sourcemap.Util.HEX_CHARS[((codePoint >>> 8) & 15)]).append(com.google.javascript.jscomp.sourcemap.Util.HEX_CHARS[((codePoint >>> 4) & 15)]).append(com.google.javascript.jscomp.sourcemap.Util.HEX_CHARS[(codePoint & 15)]);
	}
}


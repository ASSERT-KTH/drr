

package com.google.javascript.jscomp.parsing;


class JsDocTokenStream {
	private static final int EOF_CHAR = -1;

	JsDocTokenStream(java.lang.String sourceString) {
		this(sourceString, 0);
	}

	JsDocTokenStream(java.lang.String sourceString, int lineno) {
		this(sourceString, lineno, 0);
	}

	JsDocTokenStream(java.lang.String sourceString, int lineno, int initCharno) {
		com.google.common.base.Preconditions.checkNotNull(sourceString);
		com.google.javascript.jscomp.parsing.JsDocTokenStream.this.lineno = lineno;
		com.google.javascript.jscomp.parsing.JsDocTokenStream.this.sourceString = sourceString;
		com.google.javascript.jscomp.parsing.JsDocTokenStream.this.sourceEnd = sourceString.length();
		com.google.javascript.jscomp.parsing.JsDocTokenStream.this.sourceCursor = com.google.javascript.jscomp.parsing.JsDocTokenStream.this.cursor = 0;
		com.google.javascript.jscomp.parsing.JsDocTokenStream.this.initLineno = lineno;
		com.google.javascript.jscomp.parsing.JsDocTokenStream.this.initCharno = initCharno;
	}

	@java.lang.SuppressWarnings(value = "fallthrough")
	final com.google.javascript.jscomp.parsing.JsDocToken getJsDocToken() {
		int c;
		stringBufferTop = 0;
		for (; ;) {
			for (; ;) {
				charno = -1;
				c = getChar();
				if (c == (com.google.javascript.jscomp.parsing.JsDocTokenStream.EOF_CHAR)) {
					return com.google.javascript.jscomp.parsing.JsDocToken.EOF;
				}else
					if (c == '\n') {
						return com.google.javascript.jscomp.parsing.JsDocToken.EOL;
					}else
						if (!(com.google.javascript.jscomp.parsing.JsDocTokenStream.isJSSpace(c))) {
							break;
						}
					
				
			}
			switch (c) {
				case '@' :
					do {
						c = getChar();
						if (com.google.javascript.jscomp.parsing.JsDocTokenStream.isAlpha(c)) {
							addToString(c);
						}else {
							ungetChar(c);
							com.google.javascript.jscomp.parsing.JsDocTokenStream.this.string = getStringFromBuffer();
							stringBufferTop = 0;
							return com.google.javascript.jscomp.parsing.JsDocToken.ANNOTATION;
						}
					} while (true );
				case '*' :
					if (matchChar('/')) {
						return com.google.javascript.jscomp.parsing.JsDocToken.EOC;
					}else {
						return com.google.javascript.jscomp.parsing.JsDocToken.STAR;
					}
				case ',' :
					return com.google.javascript.jscomp.parsing.JsDocToken.COMMA;
				case '>' :
					return com.google.javascript.jscomp.parsing.JsDocToken.GT;
				case '(' :
					return com.google.javascript.jscomp.parsing.JsDocToken.LP;
				case ')' :
					return com.google.javascript.jscomp.parsing.JsDocToken.RP;
				case '{' :
					return com.google.javascript.jscomp.parsing.JsDocToken.LC;
				case '}' :
					return com.google.javascript.jscomp.parsing.JsDocToken.RC;
				case '[' :
					return com.google.javascript.jscomp.parsing.JsDocToken.LB;
				case ']' :
					return com.google.javascript.jscomp.parsing.JsDocToken.RB;
				case '?' :
					return com.google.javascript.jscomp.parsing.JsDocToken.QMARK;
				case '!' :
					return com.google.javascript.jscomp.parsing.JsDocToken.BANG;
				case ':' :
					return com.google.javascript.jscomp.parsing.JsDocToken.COLON;
				case '=' :
					return com.google.javascript.jscomp.parsing.JsDocToken.EQUALS;
				case '|' :
					matchChar('|');
					return com.google.javascript.jscomp.parsing.JsDocToken.PIPE;
				case '.' :
					c = getChar();
					if (c == '<') {
						return com.google.javascript.jscomp.parsing.JsDocToken.LT;
					}else {
						if (c == '.') {
							c = getChar();
							if (c == '.') {
								return com.google.javascript.jscomp.parsing.JsDocToken.ELLIPSIS;
							}else {
								addToString('.');
							}
						}
						ungetBuffer[((ungetCursor)++)] = c;
						c = '.';
					}
				default :
					{
						int c1 = c;
						addToString(c);
						int c2 = getChar();
						if (!(isJSDocString(c2))) {
							ungetChar(c2);
							com.google.javascript.jscomp.parsing.JsDocTokenStream.this.string = getStringFromBuffer();
							stringBufferTop = 0;
							return com.google.javascript.jscomp.parsing.JsDocToken.STRING;
						}else {
							do {
								c1 = c2;
								c2 = getChar();
								if ((c1 == '.') && (c2 == '<')) {
									ungetChar(c2);
									ungetChar(c1);
									com.google.javascript.jscomp.parsing.JsDocTokenStream.this.string = getStringFromBuffer();
									stringBufferTop = 0;
									return com.google.javascript.jscomp.parsing.JsDocToken.STRING;
								}else {
									if (isJSDocString(c2)) {
										addToString(c1);
									}else {
										ungetChar(c2);
										addToString(c1);
										com.google.javascript.jscomp.parsing.JsDocTokenStream.this.string = getStringFromBuffer();
										stringBufferTop = 0;
										return com.google.javascript.jscomp.parsing.JsDocToken.STRING;
									}
								}
							} while (true );
						}
					}
			}
		}
	}

	@java.lang.SuppressWarnings(value = "fallthrough")
	java.lang.String getRemainingJSDocLine() {
		int c;
		for (; ;) {
			c = getChar();
			switch (c) {
				case '*' :
					if ((peekChar()) != '/') {
						addToString(c);
						break;
					}
				case com.google.javascript.jscomp.parsing.JsDocTokenStream.EOF_CHAR :
				case '\n' :
					ungetChar(c);
					com.google.javascript.jscomp.parsing.JsDocTokenStream.this.string = getStringFromBuffer();
					stringBufferTop = 0;
					return com.google.javascript.jscomp.parsing.JsDocTokenStream.this.string;
				default :
					addToString(c);
					break;
			}
		}
	}

	final int getLineno() {
		return lineno;
	}

	final int getCharno() {
		return (lineno) == (initLineno) ? (initCharno) + (charno) : charno;
	}

	final java.lang.String getString() {
		return string;
	}

	final boolean eof() {
		return hitEOF;
	}

	private java.lang.String getStringFromBuffer() {
		tokenEnd = cursor;
		return new java.lang.String(stringBuffer, 0, stringBufferTop);
	}

	private void addToString(int c) {
		int N = stringBufferTop;
		if (N == (stringBuffer.length)) {
			char[] tmp = new char[(stringBuffer.length) * 2];
			java.lang.System.arraycopy(stringBuffer, 0, tmp, 0, N);
			stringBuffer = tmp;
		}
		stringBuffer[N] = ((char) (c));
		stringBufferTop = N + 1;
	}

	void ungetChar(int c) {
		assert !(((ungetCursor) != 0) && ((ungetBuffer[((ungetCursor) - 1)]) == '\n'));
		ungetBuffer[((ungetCursor)++)] = c;
		(cursor)--;
	}

	private boolean matchChar(int test) {
		int c = getCharIgnoreLineEnd();
		if (c == test) {
			tokenEnd = cursor;
			return true;
		}else {
			ungetCharIgnoreLineEnd(c);
			return false;
		}
	}

	private static boolean isAlpha(int c) {
		if (c <= 'Z') {
			return 'A' <= c;
		}else {
			return ('a' <= c) && (c <= 'z');
		}
	}

	private boolean isJSDocString(int c) {
		switch (c) {
			case '@' :
			case '*' :
			case ',' :
			case '>' :
			case ':' :
			case '(' :
			case ')' :
			case '{' :
			case '}' :
			case '[' :
			case ']' :
			case '?' :
			case '!' :
			case '|' :
			case '=' :
			case com.google.javascript.jscomp.parsing.JsDocTokenStream.EOF_CHAR :
			case '\n' :
				return false;
			default :
				return !(com.google.javascript.jscomp.parsing.JsDocTokenStream.isJSSpace(c));
		}
	}

	static boolean isJSSpace(int c) {
		if (c <= 127) {
			return (((c == 32) || (c == 9)) || (c == 12)) || (c == 11);
		}else {
			return (c == 160) || ((java.lang.Character.getType(((char) (c)))) == (java.lang.Character.SPACE_SEPARATOR));
		}
	}

	private static boolean isJSFormatChar(int c) {
		return (c > 127) && ((java.lang.Character.getType(((char) (c)))) == (java.lang.Character.FORMAT));
	}

	void update() {
		charno = getOffset();
	}

	private int peekChar() {
		int c = getChar();
		ungetChar(c);
		return c;
	}

	protected int getChar() {
		if ((ungetCursor) != 0) {
			(cursor)++;
			--(ungetCursor);
			if ((charno) == (-1)) {
				charno = getOffset();
			}
			return ungetBuffer[ungetCursor];
		}
		for (; ;) {
			int c;
			if ((sourceCursor) == (sourceEnd)) {
				hitEOF = true;
				if ((charno) == (-1)) {
					charno = getOffset();
				}
				return com.google.javascript.jscomp.parsing.JsDocTokenStream.EOF_CHAR;
			}
			(cursor)++;
			c = sourceString.charAt(((sourceCursor)++));
			if ((lineEndChar) >= 0) {
				if (((lineEndChar) == '\r') && (c == '\n')) {
					lineEndChar = '\n';
					continue;
				}
				lineEndChar = -1;
				lineStart = (sourceCursor) - 1;
				(lineno)++;
			}
			if (c <= 127) {
				if ((c == '\n') || (c == '\r')) {
					lineEndChar = c;
					c = '\n';
				}
			}else {
				if (com.google.javascript.jscomp.parsing.JsDocTokenStream.isJSFormatChar(c)) {
					continue;
				}
				if (com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime.isJSLineTerminator(c)) {
					lineEndChar = c;
					c = '\n';
				}
			}
			if ((charno) == (-1)) {
				charno = getOffset();
			}
			return c;
		}
	}

	private int getCharIgnoreLineEnd() {
		if ((ungetCursor) != 0) {
			(cursor)++;
			--(ungetCursor);
			if ((charno) == (-1)) {
				charno = getOffset();
			}
			return ungetBuffer[ungetCursor];
		}
		for (; ;) {
			int c;
			if ((sourceCursor) == (sourceEnd)) {
				hitEOF = true;
				if ((charno) == (-1)) {
					charno = getOffset();
				}
				return com.google.javascript.jscomp.parsing.JsDocTokenStream.EOF_CHAR;
			}
			(cursor)++;
			c = sourceString.charAt(((sourceCursor)++));
			if (c <= 127) {
				if ((c == '\n') || (c == '\r')) {
					lineEndChar = c;
					c = '\n';
				}
			}else {
				if (com.google.javascript.jscomp.parsing.JsDocTokenStream.isJSFormatChar(c)) {
					continue;
				}
				if (com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime.isJSLineTerminator(c)) {
					lineEndChar = c;
					c = '\n';
				}
			}
			if ((charno) == (-1)) {
				charno = getOffset();
			}
			return c;
		}
	}

	private void ungetCharIgnoreLineEnd(int c) {
		ungetBuffer[((ungetCursor)++)] = c;
		(cursor)--;
	}

	final int getOffset() {
		return (((sourceCursor) - (lineStart)) - (ungetCursor)) - 1;
	}

	private java.lang.String string = "";

	private char[] stringBuffer = new char[128];

	private int stringBufferTop;

	private final int[] ungetBuffer = new int[3];

	private int ungetCursor;

	private boolean hitEOF = false;

	private int lineStart = 0;

	private int lineEndChar = -1;

	int lineno;

	private int charno = -1;

	private int initCharno;

	private int initLineno;

	private java.lang.String sourceString;

	private int sourceEnd;

	int sourceCursor;

	int cursor;

	int tokenBeg;

	int tokenEnd;
}


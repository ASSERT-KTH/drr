

package com.google.javascript.rhino;


public class TokenStream {
	private static final int EOF_CHAR = -1;

	public TokenStream(com.google.javascript.rhino.Parser parser, java.io.Reader sourceReader, java.lang.String sourceString, int lineno) {
		com.google.javascript.rhino.TokenStream.this.parser = parser;
		com.google.javascript.rhino.TokenStream.this.lineno = lineno;
		if (sourceReader != null) {
			if (sourceString != null)
				com.google.javascript.rhino.Kit.codeBug();
			
			com.google.javascript.rhino.TokenStream.this.sourceReader = sourceReader;
			com.google.javascript.rhino.TokenStream.this.sourceBuffer = new char[512];
			com.google.javascript.rhino.TokenStream.this.sourceEnd = 0;
		}else {
			if (sourceString == null)
				com.google.javascript.rhino.Kit.codeBug();
			
			com.google.javascript.rhino.TokenStream.this.sourceString = sourceString;
			com.google.javascript.rhino.TokenStream.this.sourceEnd = sourceString.length();
		}
		com.google.javascript.rhino.TokenStream.this.sourceCursor = 0;
	}

	java.lang.String tokenToString(int token) {
		if (com.google.javascript.rhino.Token.shouldPrintTrees()) {
			java.lang.String name = com.google.javascript.rhino.Token.name(token);
			switch (token) {
				case com.google.javascript.rhino.Token.STRING :
				case com.google.javascript.rhino.Token.REGEXP :
				case com.google.javascript.rhino.Token.NAME :
					return ((name + " `") + (com.google.javascript.rhino.TokenStream.this.string)) + "'";
				case com.google.javascript.rhino.Token.NUMBER :
					return "NUMBER " + (com.google.javascript.rhino.TokenStream.this.number);
			}
			return name;
		}
		return "";
	}

	public static boolean isKeyword(java.lang.String s) {
		return (com.google.javascript.rhino.Token.EOF) != (com.google.javascript.rhino.TokenStream.stringToKeyword(s));
	}

	private static int stringToKeyword(java.lang.String name) {
		final int Id_break = com.google.javascript.rhino.Token.BREAK;
		final int Id_case = com.google.javascript.rhino.Token.CASE;
		final int Id_continue = com.google.javascript.rhino.Token.CONTINUE;
		final int Id_default = com.google.javascript.rhino.Token.DEFAULT;
		final int Id_delete = com.google.javascript.rhino.Token.DELPROP;
		final int Id_do = com.google.javascript.rhino.Token.DO;
		final int Id_else = com.google.javascript.rhino.Token.ELSE;
		final int Id_export = com.google.javascript.rhino.Token.EXPORT;
		final int Id_false = com.google.javascript.rhino.Token.FALSE;
		final int Id_for = com.google.javascript.rhino.Token.FOR;
		final int Id_function = com.google.javascript.rhino.Token.FUNCTION;
		final int Id_if = com.google.javascript.rhino.Token.IF;
		final int Id_in = com.google.javascript.rhino.Token.IN;
		final int Id_new = com.google.javascript.rhino.Token.NEW;
		final int Id_null = com.google.javascript.rhino.Token.NULL;
		final int Id_return = com.google.javascript.rhino.Token.RETURN;
		final int Id_switch = com.google.javascript.rhino.Token.SWITCH;
		final int Id_this = com.google.javascript.rhino.Token.THIS;
		final int Id_true = com.google.javascript.rhino.Token.TRUE;
		final int Id_typeof = com.google.javascript.rhino.Token.TYPEOF;
		final int Id_var = com.google.javascript.rhino.Token.VAR;
		final int Id_void = com.google.javascript.rhino.Token.VOID;
		final int Id_while = com.google.javascript.rhino.Token.WHILE;
		final int Id_with = com.google.javascript.rhino.Token.WITH;
		final int Id_abstract = com.google.javascript.rhino.Token.RESERVED;
		final int Id_boolean = com.google.javascript.rhino.Token.RESERVED;
		final int Id_byte = com.google.javascript.rhino.Token.RESERVED;
		final int Id_catch = com.google.javascript.rhino.Token.CATCH;
		final int Id_char = com.google.javascript.rhino.Token.RESERVED;
		final int Id_class = com.google.javascript.rhino.Token.RESERVED;
		final int Id_const = com.google.javascript.rhino.Token.CONST;
		final int Id_debugger = com.google.javascript.rhino.Token.DEBUGGER;
		final int Id_double = com.google.javascript.rhino.Token.RESERVED;
		final int Id_enum = com.google.javascript.rhino.Token.RESERVED;
		final int Id_extends = com.google.javascript.rhino.Token.RESERVED;
		final int Id_final = com.google.javascript.rhino.Token.RESERVED;
		final int Id_finally = com.google.javascript.rhino.Token.FINALLY;
		final int Id_float = com.google.javascript.rhino.Token.RESERVED;
		final int Id_goto = com.google.javascript.rhino.Token.RESERVED;
		final int Id_implements = com.google.javascript.rhino.Token.RESERVED;
		final int Id_import = com.google.javascript.rhino.Token.IMPORT;
		final int Id_instanceof = com.google.javascript.rhino.Token.INSTANCEOF;
		final int Id_int = com.google.javascript.rhino.Token.RESERVED;
		final int Id_interface = com.google.javascript.rhino.Token.RESERVED;
		final int Id_long = com.google.javascript.rhino.Token.RESERVED;
		final int Id_native = com.google.javascript.rhino.Token.RESERVED;
		final int Id_package = com.google.javascript.rhino.Token.RESERVED;
		final int Id_private = com.google.javascript.rhino.Token.RESERVED;
		final int Id_protected = com.google.javascript.rhino.Token.RESERVED;
		final int Id_public = com.google.javascript.rhino.Token.RESERVED;
		final int Id_short = com.google.javascript.rhino.Token.RESERVED;
		final int Id_static = com.google.javascript.rhino.Token.RESERVED;
		final int Id_super = com.google.javascript.rhino.Token.RESERVED;
		final int Id_synchronized = com.google.javascript.rhino.Token.RESERVED;
		final int Id_throw = com.google.javascript.rhino.Token.THROW;
		final int Id_throws = com.google.javascript.rhino.Token.RESERVED;
		final int Id_transient = com.google.javascript.rhino.Token.RESERVED;
		final int Id_try = com.google.javascript.rhino.Token.TRY;
		final int Id_volatile = com.google.javascript.rhino.Token.RESERVED;
		int id;
		java.lang.String s = name;
		L0 : {
			id = 0;
			java.lang.String X = null;
			int c;
			L : switch (s.length()) {
				case 2 :
					c = s.charAt(1);
					if (c == 'f') {
						if ((s.charAt(0)) == 'i') {
							id = Id_if;
							break L0;
						}
					}else
						if (c == 'n') {
							if ((s.charAt(0)) == 'i') {
								id = Id_in;
								break L0;
							}
						}else
							if (c == 'o') {
								if ((s.charAt(0)) == 'd') {
									id = Id_do;
									break L0;
								}
							}
						
					
					break L;
				case 3 :
					switch (s.charAt(0)) {
						case 'f' :
							if (((s.charAt(2)) == 'r') && ((s.charAt(1)) == 'o')) {
								id = Id_for;
								break L0;
							}
							break L;
						case 'i' :
							if (((s.charAt(2)) == 't') && ((s.charAt(1)) == 'n')) {
								id = Id_int;
								break L0;
							}
							break L;
						case 'n' :
							if (((s.charAt(2)) == 'w') && ((s.charAt(1)) == 'e')) {
								id = Id_new;
								break L0;
							}
							break L;
						case 't' :
							if (((s.charAt(2)) == 'y') && ((s.charAt(1)) == 'r')) {
								id = Id_try;
								break L0;
							}
							break L;
						case 'v' :
							if (((s.charAt(2)) == 'r') && ((s.charAt(1)) == 'a')) {
								id = Id_var;
								break L0;
							}
							break L;
					}
					break L;
				case 4 :
					switch (s.charAt(0)) {
						case 'b' :
							X = "byte";
							id = Id_byte;
							break L;
						case 'c' :
							c = s.charAt(3);
							if (c == 'e') {
								if (((s.charAt(2)) == 's') && ((s.charAt(1)) == 'a')) {
									id = Id_case;
									break L0;
								}
							}else
								if (c == 'r') {
									if (((s.charAt(2)) == 'a') && ((s.charAt(1)) == 'h')) {
										id = Id_char;
										break L0;
									}
								}
							
							break L;
						case 'e' :
							c = s.charAt(3);
							if (c == 'e') {
								if (((s.charAt(2)) == 's') && ((s.charAt(1)) == 'l')) {
									id = Id_else;
									break L0;
								}
							}else
								if (c == 'm') {
									if (((s.charAt(2)) == 'u') && ((s.charAt(1)) == 'n')) {
										id = Id_enum;
										break L0;
									}
								}
							
							break L;
						case 'g' :
							X = "goto";
							id = Id_goto;
							break L;
						case 'l' :
							X = "long";
							id = Id_long;
							break L;
						case 'n' :
							X = "null";
							id = Id_null;
							break L;
						case 't' :
							c = s.charAt(3);
							if (c == 'e') {
								if (((s.charAt(2)) == 'u') && ((s.charAt(1)) == 'r')) {
									id = Id_true;
									break L0;
								}
							}else
								if (c == 's') {
									if (((s.charAt(2)) == 'i') && ((s.charAt(1)) == 'h')) {
										id = Id_this;
										break L0;
									}
								}
							
							break L;
						case 'v' :
							X = "void";
							id = Id_void;
							break L;
						case 'w' :
							X = "with";
							id = Id_with;
							break L;
					}
					break L;
				case 5 :
					switch (s.charAt(2)) {
						case 'a' :
							X = "class";
							id = Id_class;
							break L;
						case 'e' :
							X = "break";
							id = Id_break;
							break L;
						case 'i' :
							X = "while";
							id = Id_while;
							break L;
						case 'l' :
							X = "false";
							id = Id_false;
							break L;
						case 'n' :
							c = s.charAt(0);
							if (c == 'c') {
								X = "const";
								id = Id_const;
							}else
								if (c == 'f') {
									X = "final";
									id = Id_final;
								}
							
							break L;
						case 'o' :
							c = s.charAt(0);
							if (c == 'f') {
								X = "float";
								id = Id_float;
							}else
								if (c == 's') {
									X = "short";
									id = Id_short;
								}
							
							break L;
						case 'p' :
							X = "super";
							id = Id_super;
							break L;
						case 'r' :
							X = "throw";
							id = Id_throw;
							break L;
						case 't' :
							X = "catch";
							id = Id_catch;
							break L;
					}
					break L;
				case 6 :
					switch (s.charAt(1)) {
						case 'a' :
							X = "native";
							id = Id_native;
							break L;
						case 'e' :
							c = s.charAt(0);
							if (c == 'd') {
								X = "delete";
								id = Id_delete;
							}else
								if (c == 'r') {
									X = "return";
									id = Id_return;
								}
							
							break L;
						case 'h' :
							X = "throws";
							id = Id_throws;
							break L;
						case 'm' :
							X = "import";
							id = Id_import;
							break L;
						case 'o' :
							X = "double";
							id = Id_double;
							break L;
						case 't' :
							X = "static";
							id = Id_static;
							break L;
						case 'u' :
							X = "public";
							id = Id_public;
							break L;
						case 'w' :
							X = "switch";
							id = Id_switch;
							break L;
						case 'x' :
							X = "export";
							id = Id_export;
							break L;
						case 'y' :
							X = "typeof";
							id = Id_typeof;
							break L;
					}
					break L;
				case 7 :
					switch (s.charAt(1)) {
						case 'a' :
							X = "package";
							id = Id_package;
							break L;
						case 'e' :
							X = "default";
							id = Id_default;
							break L;
						case 'i' :
							X = "finally";
							id = Id_finally;
							break L;
						case 'o' :
							X = "boolean";
							id = Id_boolean;
							break L;
						case 'r' :
							X = "private";
							id = Id_private;
							break L;
						case 'x' :
							X = "extends";
							id = Id_extends;
							break L;
					}
					break L;
				case 8 :
					switch (s.charAt(0)) {
						case 'a' :
							X = "abstract";
							id = Id_abstract;
							break L;
						case 'c' :
							X = "continue";
							id = Id_continue;
							break L;
						case 'd' :
							X = "debugger";
							id = Id_debugger;
							break L;
						case 'f' :
							X = "function";
							id = Id_function;
							break L;
						case 'v' :
							X = "volatile";
							id = Id_volatile;
							break L;
					}
					break L;
				case 9 :
					c = s.charAt(0);
					if (c == 'i') {
						X = "interface";
						id = Id_interface;
					}else
						if (c == 'p') {
							X = "protected";
							id = Id_protected;
						}else
							if (c == 't') {
								X = "transient";
								id = Id_transient;
							}
						
					
					break L;
				case 10 :
					c = s.charAt(1);
					if (c == 'm') {
						X = "implements";
						id = Id_implements;
					}else
						if (c == 'n') {
							X = "instanceof";
							id = Id_instanceof;
						}
					
					break L;
				case 12 :
					X = "synchronized";
					id = Id_synchronized;
					break L;
			}
			if (((X != null) && (X != s)) && (!(X.equals(s))))
				id = 0;
			
		}
		if (id == 0) {
			return com.google.javascript.rhino.Token.EOF;
		}
		return id & 255;
	}

	public static boolean isJSIdentifier(java.lang.String s) {
		int length = s.length();
		if ((length == 0) || (!(java.lang.Character.isJavaIdentifierStart(s.charAt(0)))))
			return false;
		
		for (int i = 1; i < length; i++) {
			char c = s.charAt(i);
			if (!(java.lang.Character.isJavaIdentifierPart(c))) {
				if (c == '\\') {
					if ((((((!((i + 5) < length)) && ((s.charAt((i + 1))) == 'u')) && (0 <= (com.google.javascript.rhino.Kit.xDigitToInt(s.charAt((i + 2)), 0)))) && (0 <= (com.google.javascript.rhino.Kit.xDigitToInt(s.charAt((i + 3)), 0)))) && (0 <= (com.google.javascript.rhino.Kit.xDigitToInt(s.charAt((i + 4)), 0)))) && (0 <= (com.google.javascript.rhino.Kit.xDigitToInt(s.charAt((i + 5)), 0)))) {
						return true;
					}
				}
				return false;
			}
		}
		return true;
	}

	protected final int getLineno() {
		return lineno;
	}

	protected final int getCharno() {
		return charno;
	}

	final java.lang.String getString() {
		return string;
	}

	final double getNumber() {
		return number;
	}

	final boolean eof() {
		return hitEOF;
	}

	public final int getToken() throws java.io.IOException {
		(tokenno)++;
		if ((com.google.javascript.rhino.TokenStream.this.pushbackToken) != (com.google.javascript.rhino.Token.EOF)) {
			int result = com.google.javascript.rhino.TokenStream.this.pushbackToken;
			com.google.javascript.rhino.TokenStream.this.pushbackToken = com.google.javascript.rhino.Token.EOF;
			return result;
		}
		int c;
		retry : for (; ;) {
			for (; ;) {
				charno = -1;
				c = getChar();
				if (c == (com.google.javascript.rhino.TokenStream.EOF_CHAR)) {
					return com.google.javascript.rhino.Token.EOF;
				}else
					if (c == '\n') {
						dirtyLine = false;
						return com.google.javascript.rhino.Token.EOL;
					}else
						if (!(com.google.javascript.rhino.TokenStream.isJSSpace(c))) {
							if (c != '-') {
								dirtyLine = true;
							}
							break;
						}
					
				
			}
			if (c == '@')
				return com.google.javascript.rhino.Token.XMLATTR;
			
			boolean identifierStart;
			boolean isUnicodeEscapeStart = false;
			if (c == '\\') {
				c = getChar();
				if (c == 'u') {
					identifierStart = true;
					isUnicodeEscapeStart = true;
					stringBufferTop = 0;
				}else {
					identifierStart = false;
					ungetChar(c);
					c = '\\';
				}
			}else {
				identifierStart = java.lang.Character.isJavaIdentifierStart(((char) (c)));
				if (identifierStart) {
					stringBufferTop = 0;
					addToString(c);
				}
			}
			if (identifierStart) {
				boolean containsEscape = isUnicodeEscapeStart;
				for (; ;) {
					if (isUnicodeEscapeStart) {
						int escapeVal = 0;
						for (int i = 0; i != 4; ++i) {
							c = getChar();
							escapeVal = com.google.javascript.rhino.Kit.xDigitToInt(c, escapeVal);
							if (escapeVal < 0) {
								break;
							}
						}
						if (escapeVal < 0) {
							parser.addError("msg.invalid.escape");
							return com.google.javascript.rhino.Token.ERROR;
						}
						addToString(escapeVal);
						isUnicodeEscapeStart = false;
					}else {
						c = getChar();
						if (c == '\\') {
							c = getChar();
							if (c == 'u') {
								isUnicodeEscapeStart = true;
								containsEscape = true;
							}else {
								parser.addError("msg.illegal.character");
								return com.google.javascript.rhino.Token.ERROR;
							}
						}else {
							if ((c == (com.google.javascript.rhino.TokenStream.EOF_CHAR)) || (!(java.lang.Character.isJavaIdentifierPart(((char) (c)))))) {
								break;
							}
							addToString(c);
						}
					}
				}
				ungetChar(c);
				java.lang.String str = getStringFromBuffer();
				if (!containsEscape) {
					int result = com.google.javascript.rhino.TokenStream.stringToKeyword(str);
					if (result != (com.google.javascript.rhino.Token.EOF)) {
						if (result != (com.google.javascript.rhino.Token.RESERVED)) {
							return result;
						}else
							if (!(parser.compilerEnv.isReservedKeywordAsIdentifier())) {
								return result;
							}else {
								parser.addWarning("msg.reserved.keyword", str);
							}
						
					}
				}
				com.google.javascript.rhino.TokenStream.this.string = ((java.lang.String) (allStrings.intern(str)));
				return com.google.javascript.rhino.Token.NAME;
			}
			if ((com.google.javascript.rhino.TokenStream.isDigit(c)) || ((c == '.') && (com.google.javascript.rhino.TokenStream.isDigit(peekChar())))) {
				stringBufferTop = 0;
				int base = 10;
				if (c == '0') {
					c = getChar();
					if ((c == 'x') || (c == 'X')) {
						base = 16;
						c = getChar();
					}else
						if (com.google.javascript.rhino.TokenStream.isDigit(c)) {
							base = 8;
						}else {
							addToString('0');
						}
					
				}
				if (base == 16) {
					while (0 <= (com.google.javascript.rhino.Kit.xDigitToInt(c, 0))) {
						addToString(c);
						c = getChar();
					} 
				}else {
					while (('0' <= c) && (c <= '9')) {
						if ((base == 8) && (c >= '8')) {
							parser.addWarning("msg.bad.octal.literal", (c == '8' ? "8" : "9"));
							base = 10;
						}
						addToString(c);
						c = getChar();
					} 
				}
				boolean isInteger = true;
				if ((base == 10) && (((c == '.') || (c == 'e')) || (c == 'E'))) {
					isInteger = false;
					if (c == '.') {
						do {
							addToString(c);
							c = getChar();
						} while (com.google.javascript.rhino.TokenStream.isDigit(c) );
					}
					if ((c == 'e') || (c == 'E')) {
						addToString(c);
						c = getChar();
						if ((c == '+') || (c == '-')) {
							addToString(c);
							c = getChar();
						}
						if (!(com.google.javascript.rhino.TokenStream.isDigit(c))) {
							parser.addError("msg.missing.exponent");
							return com.google.javascript.rhino.Token.ERROR;
						}
						do {
							addToString(c);
							c = getChar();
						} while (com.google.javascript.rhino.TokenStream.isDigit(c) );
					}
				}
				ungetChar(c);
				java.lang.String numString = getStringFromBuffer();
				double dval;
				if ((base == 10) && (!isInteger)) {
					try {
						dval = java.lang.Double.valueOf(numString).doubleValue();
					} catch (java.lang.NumberFormatException ex) {
						parser.addError("msg.caught.nfe");
						return com.google.javascript.rhino.Token.ERROR;
					}
				}else {
					dval = com.google.javascript.rhino.ScriptRuntime.stringToNumber(numString, 0, base);
				}
				com.google.javascript.rhino.TokenStream.this.number = dval;
				return com.google.javascript.rhino.Token.NUMBER;
			}
			if ((c == '"') || (c == '\'')) {
				int quoteChar = c;
				stringBufferTop = 0;
				c = getChar();
				strLoop : while (c != quoteChar) {
					if ((c == '\n') || (c == (com.google.javascript.rhino.TokenStream.EOF_CHAR))) {
						ungetChar(c);
						parser.addError("msg.unterminated.string.lit");
						return com.google.javascript.rhino.Token.ERROR;
					}
					if (c == '\\') {
						int escapeVal;
						c = getChar();
						switch (c) {
							case 'b' :
								c = '\b';
								break;
							case 'f' :
								c = '\f';
								break;
							case 'n' :
								c = '\n';
								break;
							case 'r' :
								c = '\r';
								break;
							case 't' :
								c = '\t';
								break;
							case 'v' :
								c = 11;
								break;
							case 'u' :
								int escapeStart = stringBufferTop;
								addToString('u');
								escapeVal = 0;
								for (int i = 0; i != 4; ++i) {
									c = getChar();
									escapeVal = com.google.javascript.rhino.Kit.xDigitToInt(c, escapeVal);
									if (escapeVal < 0) {
										continue strLoop;
									}
									addToString(c);
								}
								stringBufferTop = escapeStart;
								c = escapeVal;
								break;
							case 'x' :
								c = getChar();
								escapeVal = com.google.javascript.rhino.Kit.xDigitToInt(c, 0);
								if (escapeVal < 0) {
									addToString('x');
									continue strLoop;
								}else {
									int c1 = c;
									c = getChar();
									escapeVal = com.google.javascript.rhino.Kit.xDigitToInt(c, escapeVal);
									if (escapeVal < 0) {
										addToString('x');
										addToString(c1);
										continue strLoop;
									}else {
										c = escapeVal;
									}
								}
								break;
							case '\n' :
								c = getChar();
								continue strLoop;
							default :
								if (('0' <= c) && (c < '8')) {
									int val = c - '0';
									c = getChar();
									if (('0' <= c) && (c < '8')) {
										val = ((8 * val) + c) - '0';
										c = getChar();
										if ((('0' <= c) && (c < '8')) && (val <= 31)) {
											val = ((8 * val) + c) - '0';
											c = getChar();
										}
									}
									ungetChar(c);
									c = val;
								}
						}
					}
					addToString(c);
					c = getChar();
				} 
				java.lang.String str = getStringFromBuffer();
				com.google.javascript.rhino.TokenStream.this.string = ((java.lang.String) (allStrings.intern(str)));
				return com.google.javascript.rhino.Token.STRING;
			}
			switch (c) {
				case ';' :
					return com.google.javascript.rhino.Token.SEMI;
				case '[' :
					return com.google.javascript.rhino.Token.LB;
				case ']' :
					return com.google.javascript.rhino.Token.RB;
				case '{' :
					return com.google.javascript.rhino.Token.LC;
				case '}' :
					return com.google.javascript.rhino.Token.RC;
				case '(' :
					return com.google.javascript.rhino.Token.LP;
				case ')' :
					return com.google.javascript.rhino.Token.RP;
				case ',' :
					return com.google.javascript.rhino.Token.COMMA;
				case '?' :
					return com.google.javascript.rhino.Token.HOOK;
				case ':' :
					if (matchChar(':')) {
						return com.google.javascript.rhino.Token.COLONCOLON;
					}else {
						return com.google.javascript.rhino.Token.COLON;
					}
				case '.' :
					if (matchChar('.')) {
						return com.google.javascript.rhino.Token.DOTDOT;
					}else
						if (matchChar('(')) {
							return com.google.javascript.rhino.Token.DOTQUERY;
						}else {
							return com.google.javascript.rhino.Token.DOT;
						}
					
				case '|' :
					if (matchChar('|')) {
						return com.google.javascript.rhino.Token.OR;
					}else
						if (matchChar('=')) {
							return com.google.javascript.rhino.Token.ASSIGN_BITOR;
						}else {
							return com.google.javascript.rhino.Token.BITOR;
						}
					
				case '^' :
					if (matchChar('=')) {
						return com.google.javascript.rhino.Token.ASSIGN_BITXOR;
					}else {
						return com.google.javascript.rhino.Token.BITXOR;
					}
				case '&' :
					if (matchChar('&')) {
						return com.google.javascript.rhino.Token.AND;
					}else
						if (matchChar('=')) {
							return com.google.javascript.rhino.Token.ASSIGN_BITAND;
						}else {
							return com.google.javascript.rhino.Token.BITAND;
						}
					
				case '=' :
					if (matchChar('=')) {
						if (matchChar('='))
							return com.google.javascript.rhino.Token.SHEQ;
						else
							return com.google.javascript.rhino.Token.EQ;
						
					}else {
						return com.google.javascript.rhino.Token.ASSIGN;
					}
				case '!' :
					if (matchChar('=')) {
						if (matchChar('='))
							return com.google.javascript.rhino.Token.SHNE;
						else
							return com.google.javascript.rhino.Token.NE;
						
					}else {
						return com.google.javascript.rhino.Token.NOT;
					}
				case '<' :
					if (matchChar('!')) {
						if (matchChar('-')) {
							if (matchChar('-')) {
								skipLine();
								continue retry;
							}
							ungetChar('-');
						}
						ungetChar('!');
					}
					if (matchChar('<')) {
						if (matchChar('=')) {
							return com.google.javascript.rhino.Token.ASSIGN_LSH;
						}else {
							return com.google.javascript.rhino.Token.LSH;
						}
					}else {
						if (matchChar('=')) {
							return com.google.javascript.rhino.Token.LE;
						}else {
							return com.google.javascript.rhino.Token.LT;
						}
					}
				case '>' :
					if (matchChar('>')) {
						if (matchChar('>')) {
							if (matchChar('=')) {
								return com.google.javascript.rhino.Token.ASSIGN_URSH;
							}else {
								return com.google.javascript.rhino.Token.URSH;
							}
						}else {
							if (matchChar('=')) {
								return com.google.javascript.rhino.Token.ASSIGN_RSH;
							}else {
								return com.google.javascript.rhino.Token.RSH;
							}
						}
					}else {
						if (matchChar('=')) {
							return com.google.javascript.rhino.Token.GE;
						}else {
							return com.google.javascript.rhino.Token.GT;
						}
					}
				case '*' :
					if (matchChar('=')) {
						return com.google.javascript.rhino.Token.ASSIGN_MUL;
					}else {
						return com.google.javascript.rhino.Token.MUL;
					}
				case '/' :
					if (matchChar('/')) {
						skipLine();
						continue retry;
					}
					if (matchChar('*')) {
						while (((c = getChar()) != (com.google.javascript.rhino.TokenStream.EOF_CHAR)) && (!((c == '*') && (matchChar('/'))))) {
						} 
						if (c == (com.google.javascript.rhino.TokenStream.EOF_CHAR)) {
							parser.addError("msg.unterminated.comment");
							return com.google.javascript.rhino.Token.ERROR;
						}
						continue retry;
					}
					if (matchChar('=')) {
						return com.google.javascript.rhino.Token.ASSIGN_DIV;
					}else {
						return com.google.javascript.rhino.Token.DIV;
					}
				case '%' :
					if (matchChar('=')) {
						return com.google.javascript.rhino.Token.ASSIGN_MOD;
					}else {
						return com.google.javascript.rhino.Token.MOD;
					}
				case '~' :
					return com.google.javascript.rhino.Token.BITNOT;
				case '+' :
					if (matchChar('=')) {
						return com.google.javascript.rhino.Token.ASSIGN_ADD;
					}else
						if (matchChar('+')) {
							return com.google.javascript.rhino.Token.INC;
						}else {
							return com.google.javascript.rhino.Token.ADD;
						}
					
				case '-' :
					if (matchChar('=')) {
						c = com.google.javascript.rhino.Token.ASSIGN_SUB;
					}else
						if (matchChar('-')) {
							if (!(dirtyLine)) {
								if (matchChar('>')) {
									skipLine();
									continue retry;
								}
							}
							c = com.google.javascript.rhino.Token.DEC;
						}else {
							c = com.google.javascript.rhino.Token.SUB;
						}
					
					dirtyLine = true;
					return c;
				default :
					parser.addError("msg.illegal.character");
					return com.google.javascript.rhino.Token.ERROR;
			}
		}
	}

	@java.lang.SuppressWarnings(value = "fallthrough")
	final int getJSDocToken() throws java.io.IOException {
		int c;
		stringBufferTop = 0;
		for (; ;) {
			for (; ;) {
				charno = -1;
				c = getChar();
				if (c == (com.google.javascript.rhino.TokenStream.EOF_CHAR)) {
					return com.google.javascript.rhino.Token.EOF;
				}else
					if (c == '\n') {
						return com.google.javascript.rhino.Token.EOL;
					}else
						if (!(com.google.javascript.rhino.TokenStream.isJSSpace(c))) {
							break;
						}
					
				
			}
			switch (c) {
				case '@' :
					do {
						c = getChar();
						if (com.google.javascript.rhino.TokenStream.isAlpha(c)) {
							addToString(c);
						}else {
							ungetChar(c);
							com.google.javascript.rhino.TokenStream.this.string = getStringFromBuffer();
							stringBufferTop = 0;
							return com.google.javascript.rhino.Token.ANNOTATION;
						}
					} while (true );
				case '*' :
					if (matchChar('/')) {
						return com.google.javascript.rhino.Token.EOC;
					}else {
						return com.google.javascript.rhino.Token.STAR;
					}
				case ',' :
					return com.google.javascript.rhino.Token.COMMA;
				case '>' :
					return com.google.javascript.rhino.Token.GT;
				case '(' :
					return com.google.javascript.rhino.Token.LP;
				case ')' :
					return com.google.javascript.rhino.Token.RP;
				case '{' :
					return com.google.javascript.rhino.Token.LC;
				case '}' :
					return com.google.javascript.rhino.Token.RC;
				case '[' :
					return com.google.javascript.rhino.Token.LB;
				case ']' :
					return com.google.javascript.rhino.Token.RB;
				case '?' :
					return com.google.javascript.rhino.Token.QMARK;
				case '!' :
					return com.google.javascript.rhino.Token.BANG;
				case ':' :
					return com.google.javascript.rhino.Token.COLON;
				case '=' :
					return com.google.javascript.rhino.Token.EQUALS;
				case '|' :
					matchChar('|');
					return com.google.javascript.rhino.Token.PIPE;
				case '.' :
					c = getChar();
					if (c == '<') {
						return com.google.javascript.rhino.Token.LT;
					}else {
						if (c == '.') {
							c = getChar();
							if (c == '.') {
								return com.google.javascript.rhino.Token.ELLIPSIS;
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
							com.google.javascript.rhino.TokenStream.this.string = getStringFromBuffer();
							stringBufferTop = 0;
							return com.google.javascript.rhino.Token.STRING;
						}else {
							do {
								c1 = c2;
								c2 = getChar();
								if ((c1 == '.') && (c2 == '<')) {
									ungetChar(c2);
									ungetChar(c1);
									com.google.javascript.rhino.TokenStream.this.string = getStringFromBuffer();
									stringBufferTop = 0;
									return com.google.javascript.rhino.Token.STRING;
								}else {
									if (isJSDocString(c2)) {
										addToString(c1);
									}else {
										ungetChar(c2);
										addToString(c1);
										com.google.javascript.rhino.TokenStream.this.string = getStringFromBuffer();
										stringBufferTop = 0;
										return com.google.javascript.rhino.Token.STRING;
									}
								}
							} while (true );
						}
					}
			}
		}
	}

	@java.lang.SuppressWarnings(value = "fallthrough")
	java.lang.String getRemainingJSDocLine() throws java.io.IOException {
		int c;
		for (; ;) {
			c = getChar();
			switch (c) {
				case '*' :
					if ((peekChar()) != '/') {
						addToString(c);
						break;
					}
				case com.google.javascript.rhino.TokenStream.EOF_CHAR :
				case '\n' :
					ungetChar(c);
					com.google.javascript.rhino.TokenStream.this.string = getStringFromBuffer();
					stringBufferTop = 0;
					return com.google.javascript.rhino.TokenStream.this.string;
				default :
					addToString(c);
					break;
			}
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
			case com.google.javascript.rhino.TokenStream.EOF_CHAR :
			case '\n' :
				return false;
			default :
				return !(com.google.javascript.rhino.TokenStream.isJSSpace(c));
		}
	}

	private static boolean isAlpha(int c) {
		if (c <= 'Z') {
			return 'A' <= c;
		}else {
			return ('a' <= c) && (c <= 'z');
		}
	}

	static boolean isDigit(int c) {
		return ('0' <= c) && (c <= '9');
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

	com.google.javascript.rhino.JSDocInfo getAndResetJSDocInfo() {
		return null;
	}

	com.google.javascript.rhino.JSDocInfo getFileOverviewJSDocInfo() {
		return null;
	}

	boolean isPopulated() {
		return false;
	}

	void readRegExp(int startToken) throws java.io.IOException {
		stringBufferTop = 0;
		if (startToken == (com.google.javascript.rhino.Token.ASSIGN_DIV)) {
			addToString('=');
		}else {
			if (startToken != (com.google.javascript.rhino.Token.DIV))
				com.google.javascript.rhino.Kit.codeBug();
			
		}
		boolean inCharSet = false;
		int c;
		while (((c = getChar()) != '/') || inCharSet) {
			if ((c == '\n') || (c == (com.google.javascript.rhino.TokenStream.EOF_CHAR))) {
				ungetChar(c);
				throw parser.reportError("msg.unterminated.re.lit");
			}
			if (c == '\\') {
				addToString(c);
				c = getChar();
			}else
				if (c == '[') {
					inCharSet = true;
				}else
					if (c == ']') {
						inCharSet = false;
					}
				
			
			addToString(c);
		} 
		int reEnd = stringBufferTop;
		while (true) {
			if (matchChar('g'))
				addToString('g');
			else
				if (matchChar('i'))
					addToString('i');
				else
					if (matchChar('m'))
						addToString('m');
					else
						break;
					
				
			
		} 
		if (com.google.javascript.rhino.TokenStream.isAlpha(peekChar())) {
			throw parser.reportError("msg.invalid.re.flag");
		}
		com.google.javascript.rhino.TokenStream.this.string = new java.lang.String(stringBuffer, 0, reEnd);
		com.google.javascript.rhino.TokenStream.this.regExpFlags = new java.lang.String(stringBuffer, reEnd, ((stringBufferTop) - reEnd));
	}

	boolean isXMLAttribute() {
		return xmlIsAttribute;
	}

	int getFirstXMLToken() throws java.io.IOException {
		xmlOpenTagsCount = 0;
		xmlIsAttribute = false;
		xmlIsTagContent = false;
		ungetChar('<');
		return getNextXMLToken();
	}

	int getNextXMLToken() throws java.io.IOException {
		stringBufferTop = 0;
		for (int c = getChar(); c != (com.google.javascript.rhino.TokenStream.EOF_CHAR); c = getChar()) {
			if (xmlIsTagContent) {
				switch (c) {
					case '>' :
						addToString(c);
						xmlIsTagContent = false;
						xmlIsAttribute = false;
						break;
					case '/' :
						addToString(c);
						if ((peekChar()) == '>') {
							c = getChar();
							addToString(c);
							xmlIsTagContent = false;
							(xmlOpenTagsCount)--;
						}
						break;
					case '{' :
						ungetChar(c);
						com.google.javascript.rhino.TokenStream.this.string = getStringFromBuffer();
						return com.google.javascript.rhino.Token.XML;
					case '\'' :
					case '"' :
						addToString(c);
						if (!(readQuotedString(c)))
							return com.google.javascript.rhino.Token.ERROR;
						
						break;
					case '=' :
						addToString(c);
						xmlIsAttribute = true;
						break;
					case ' ' :
					case '\t' :
					case '\r' :
					case '\n' :
						addToString(c);
						break;
					default :
						addToString(c);
						xmlIsAttribute = false;
						break;
				}
				if ((!(xmlIsTagContent)) && ((xmlOpenTagsCount) == 0)) {
					com.google.javascript.rhino.TokenStream.this.string = getStringFromBuffer();
					return com.google.javascript.rhino.Token.XMLEND;
				}
			}else {
				switch (c) {
					case '<' :
						addToString(c);
						c = peekChar();
						switch (c) {
							case '!' :
								c = getChar();
								addToString(c);
								c = peekChar();
								switch (c) {
									case '-' :
										c = getChar();
										addToString(c);
										c = getChar();
										if (c == '-') {
											addToString(c);
											if (!(readXmlComment()))
												return com.google.javascript.rhino.Token.ERROR;
											
										}else {
											stringBufferTop = 0;
											com.google.javascript.rhino.TokenStream.this.string = null;
											parser.addError("msg.XML.bad.form");
											return com.google.javascript.rhino.Token.ERROR;
										}
										break;
									case '[' :
										c = getChar();
										addToString(c);
										if (((((((getChar()) == 'C') && ((getChar()) == 'D')) && ((getChar()) == 'A')) && ((getChar()) == 'T')) && ((getChar()) == 'A')) && ((getChar()) == '[')) {
											addToString('C');
											addToString('D');
											addToString('A');
											addToString('T');
											addToString('A');
											addToString('[');
											if (!(readCDATA()))
												return com.google.javascript.rhino.Token.ERROR;
											
										}else {
											stringBufferTop = 0;
											com.google.javascript.rhino.TokenStream.this.string = null;
											parser.addError("msg.XML.bad.form");
											return com.google.javascript.rhino.Token.ERROR;
										}
										break;
									default :
										if (!(readEntity()))
											return com.google.javascript.rhino.Token.ERROR;
										
										break;
								}
								break;
							case '?' :
								c = getChar();
								addToString(c);
								if (!(readPI()))
									return com.google.javascript.rhino.Token.ERROR;
								
								break;
							case '/' :
								c = getChar();
								addToString(c);
								if ((xmlOpenTagsCount) == 0) {
									stringBufferTop = 0;
									com.google.javascript.rhino.TokenStream.this.string = null;
									parser.addError("msg.XML.bad.form");
									return com.google.javascript.rhino.Token.ERROR;
								}
								xmlIsTagContent = true;
								(xmlOpenTagsCount)--;
								break;
							default :
								xmlIsTagContent = true;
								(xmlOpenTagsCount)++;
								break;
						}
						break;
					case '{' :
						ungetChar(c);
						com.google.javascript.rhino.TokenStream.this.string = getStringFromBuffer();
						return com.google.javascript.rhino.Token.XML;
					default :
						addToString(c);
						break;
				}
			}
		}
		stringBufferTop = 0;
		com.google.javascript.rhino.TokenStream.this.string = null;
		parser.addError("msg.XML.bad.form");
		return com.google.javascript.rhino.Token.ERROR;
	}

	private boolean readQuotedString(int quote) throws java.io.IOException {
		for (int c = getChar(); c != (com.google.javascript.rhino.TokenStream.EOF_CHAR); c = getChar()) {
			addToString(c);
			if (c == quote)
				return true;
			
		}
		stringBufferTop = 0;
		com.google.javascript.rhino.TokenStream.this.string = null;
		parser.addError("msg.XML.bad.form");
		return false;
	}

	private boolean readXmlComment() throws java.io.IOException {
		for (int c = getChar(); c != (com.google.javascript.rhino.TokenStream.EOF_CHAR);) {
			addToString(c);
			if ((c == '-') && ((peekChar()) == '-')) {
				c = getChar();
				addToString(c);
				if ((peekChar()) == '>') {
					c = getChar();
					addToString(c);
					return true;
				}else {
					continue;
				}
			}
			c = getChar();
		}
		stringBufferTop = 0;
		com.google.javascript.rhino.TokenStream.this.string = null;
		parser.addError("msg.XML.bad.form");
		return false;
	}

	private boolean readCDATA() throws java.io.IOException {
		for (int c = getChar(); c != (com.google.javascript.rhino.TokenStream.EOF_CHAR);) {
			addToString(c);
			if ((c == ']') && ((peekChar()) == ']')) {
				c = getChar();
				addToString(c);
				if ((peekChar()) == '>') {
					c = getChar();
					addToString(c);
					return true;
				}else {
					continue;
				}
			}
			c = getChar();
		}
		stringBufferTop = 0;
		com.google.javascript.rhino.TokenStream.this.string = null;
		parser.addError("msg.XML.bad.form");
		return false;
	}

	private boolean readEntity() throws java.io.IOException {
		int declTags = 1;
		for (int c = getChar(); c != (com.google.javascript.rhino.TokenStream.EOF_CHAR); c = getChar()) {
			addToString(c);
			switch (c) {
				case '<' :
					declTags++;
					break;
				case '>' :
					declTags--;
					if (declTags == 0)
						return true;
					
					break;
			}
		}
		stringBufferTop = 0;
		com.google.javascript.rhino.TokenStream.this.string = null;
		parser.addError("msg.XML.bad.form");
		return false;
	}

	private boolean readPI() throws java.io.IOException {
		for (int c = getChar(); c != (com.google.javascript.rhino.TokenStream.EOF_CHAR); c = getChar()) {
			addToString(c);
			if ((c == '?') && ((peekChar()) == '>')) {
				c = getChar();
				addToString(c);
				return true;
			}
		}
		stringBufferTop = 0;
		com.google.javascript.rhino.TokenStream.this.string = null;
		parser.addError("msg.XML.bad.form");
		return false;
	}

	private java.lang.String getStringFromBuffer() {
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

	public int getTokenno() {
		return tokenno;
	}

	protected void ungetChar(int c) {
		if (((ungetCursor) != 0) && ((ungetBuffer[((ungetCursor) - 1)]) == '\n'))
			com.google.javascript.rhino.Kit.codeBug();
		
		ungetBuffer[((ungetCursor)++)] = c;
	}

	private boolean matchChar(int test) throws java.io.IOException {
		int c = getChar();
		if (c == test) {
			return true;
		}else {
			ungetChar(c);
			return false;
		}
	}

	private int peekChar() throws java.io.IOException {
		int c = getChar();
		ungetChar(c);
		return c;
	}

	protected int getChar() throws java.io.IOException {
		if ((ungetCursor) != 0) {
			--(ungetCursor);
			if ((charno) == (-1)) {
				charno = getOffset();
			}
			return ungetBuffer[ungetCursor];
		}
		for (; ;) {
			int c;
			if ((sourceString) != null) {
				if ((sourceCursor) == (sourceEnd)) {
					hitEOF = true;
					if ((charno) == (-1)) {
						charno = getOffset();
					}
					return com.google.javascript.rhino.TokenStream.EOF_CHAR;
				}
				c = sourceString.charAt(((sourceCursor)++));
			}else {
				if ((sourceCursor) == (sourceEnd)) {
					if (!(fillSourceBuffer())) {
						hitEOF = true;
						if ((charno) == (-1)) {
							charno = getOffset();
						}
						return com.google.javascript.rhino.TokenStream.EOF_CHAR;
					}
				}
				c = sourceBuffer[((sourceCursor)++)];
			}
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
				if (com.google.javascript.rhino.TokenStream.isJSFormatChar(c)) {
					continue;
				}
				if (com.google.javascript.rhino.ScriptRuntime.isJSLineTerminator(c)) {
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

	private void skipLine() throws java.io.IOException {
		int c;
		while (((c = getChar()) != (com.google.javascript.rhino.TokenStream.EOF_CHAR)) && (c != '\n')) {
		} 
		ungetChar(c);
	}

	final int getOffset() {
		return (((sourceCursor) - (lineStart)) - (ungetCursor)) - 1;
	}

	final java.lang.String getLine() {
		if ((sourceString) != null) {
			int lineEnd = sourceCursor;
			if ((lineEndChar) >= 0) {
				--lineEnd;
			}else {
				for (; lineEnd != (sourceEnd); ++lineEnd) {
					int c = sourceString.charAt(lineEnd);
					if (com.google.javascript.rhino.ScriptRuntime.isJSLineTerminator(c)) {
						break;
					}
				}
			}
			return sourceString.substring(lineStart, lineEnd);
		}else {
			int lineLength = (sourceCursor) - (lineStart);
			if ((lineEndChar) >= 0) {
				--lineLength;
			}else {
				for (; ; ++lineLength) {
					int i = (lineStart) + lineLength;
					if (i == (sourceEnd)) {
						try {
							if (!(fillSourceBuffer())) {
								break;
							}
						} catch (java.io.IOException ioe) {
							break;
						}
						i = (lineStart) + lineLength;
					}
					int c = sourceBuffer[i];
					if (com.google.javascript.rhino.ScriptRuntime.isJSLineTerminator(c)) {
						break;
					}
				}
			}
			return new java.lang.String(sourceBuffer, lineStart, lineLength);
		}
	}

	private boolean fillSourceBuffer() throws java.io.IOException {
		if ((sourceString) != null)
			com.google.javascript.rhino.Kit.codeBug();
		
		if ((sourceEnd) == (sourceBuffer.length)) {
			if ((lineStart) != 0) {
				java.lang.System.arraycopy(sourceBuffer, lineStart, sourceBuffer, 0, ((sourceEnd) - (lineStart)));
				sourceEnd -= lineStart;
				sourceCursor -= lineStart;
				lineStart = 0;
			}else {
				char[] tmp = new char[(sourceBuffer.length) * 2];
				java.lang.System.arraycopy(sourceBuffer, 0, tmp, 0, sourceEnd);
				sourceBuffer = tmp;
			}
		}
		int n = sourceReader.read(sourceBuffer, sourceEnd, ((sourceBuffer.length) - (sourceEnd)));
		if (n < 0) {
			return false;
		}
		sourceEnd += n;
		return true;
	}

	public void setFileLevelJsDocBuilder(com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder) {
	}

	private boolean dirtyLine;

	java.lang.String regExpFlags;

	private int pushbackToken;

	private int tokenno;

	private java.lang.String string = "";

	private double number;

	private char[] stringBuffer = new char[128];

	private int stringBufferTop;

	private com.google.javascript.rhino.ObjToIntMap allStrings = new com.google.javascript.rhino.ObjToIntMap(50);

	private final int[] ungetBuffer = new int[3];

	private int ungetCursor;

	private boolean hitEOF = false;

	private int lineStart = 0;

	private int lineno;

	private int charno = -1;

	private int lineEndChar = -1;

	private java.lang.String sourceString;

	private java.io.Reader sourceReader;

	private char[] sourceBuffer;

	private int sourceEnd;

	private int sourceCursor;

	private boolean xmlIsAttribute;

	private boolean xmlIsTagContent;

	private int xmlOpenTagsCount;

	private com.google.javascript.rhino.Parser parser;
}


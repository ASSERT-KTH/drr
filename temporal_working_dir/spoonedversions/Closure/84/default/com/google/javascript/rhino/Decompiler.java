

package com.google.javascript.rhino;


public class Decompiler {
	public static final int ONLY_BODY_FLAG = 1 << 0;

	public static final int TO_SOURCE_FLAG = 1 << 1;

	public static final int INITIAL_INDENT_PROP = 1;

	public static final int INDENT_GAP_PROP = 2;

	public static final int CASE_GAP_PROP = 3;

	private static final int FUNCTION_END = (com.google.javascript.rhino.Token.LAST_TOKEN) + 1;

	java.lang.String getEncodedSource() {
		return sourceToString(0);
	}

	int getCurrentOffset() {
		return sourceTop;
	}

	int markFunctionStart(int functionType) {
		int savedOffset = getCurrentOffset();
		addToken(com.google.javascript.rhino.Token.FUNCTION);
		append(((char) (functionType)));
		return savedOffset;
	}

	int markFunctionEnd(int functionStart) {
		int offset = getCurrentOffset();
		append(((char) (com.google.javascript.rhino.Decompiler.FUNCTION_END)));
		return offset;
	}

	void addToken(int token) {
		if (!((0 <= token) && (token <= (com.google.javascript.rhino.Token.LAST_TOKEN))))
			throw new java.lang.IllegalArgumentException();
		
		append(((char) (token)));
	}

	void addEOL(int token) {
		if (!((0 <= token) && (token <= (com.google.javascript.rhino.Token.LAST_TOKEN))))
			throw new java.lang.IllegalArgumentException();
		
		append(((char) (token)));
		append(((char) (com.google.javascript.rhino.Token.EOL)));
	}

	void addName(java.lang.String str) {
		addToken(com.google.javascript.rhino.Token.NAME);
		appendString(str);
	}

	void addString(java.lang.String str) {
		addToken(com.google.javascript.rhino.Token.STRING);
		appendString(str);
	}

	void addRegexp(java.lang.String regexp, java.lang.String flags) {
		addToken(com.google.javascript.rhino.Token.REGEXP);
		appendString(((('/' + regexp) + '/') + flags));
	}

	void addNumber(double n) {
		addToken(com.google.javascript.rhino.Token.NUMBER);
		long lbits = ((long) (n));
		if (lbits != n) {
			lbits = java.lang.Double.doubleToLongBits(n);
			append('D');
			append(((char) (lbits >> 48)));
			append(((char) (lbits >> 32)));
			append(((char) (lbits >> 16)));
			append(((char) (lbits)));
		}else {
			if (lbits < 0)
				com.google.javascript.rhino.Kit.codeBug();
			
			if (lbits <= (java.lang.Character.MAX_VALUE)) {
				append('S');
				append(((char) (lbits)));
			}else {
				append('J');
				append(((char) (lbits >> 48)));
				append(((char) (lbits >> 32)));
				append(((char) (lbits >> 16)));
				append(((char) (lbits)));
			}
		}
	}

	private void appendString(java.lang.String str) {
		int L = str.length();
		int lengthEncodingSize = 1;
		if (L >= 32768) {
			lengthEncodingSize = 2;
		}
		int nextTop = ((sourceTop) + lengthEncodingSize) + L;
		if (nextTop > (sourceBuffer.length)) {
			increaseSourceCapacity(nextTop);
		}
		if (L >= 32768) {
			sourceBuffer[sourceTop] = ((char) (32768 | (L >>> 16)));
			++(sourceTop);
		}
		sourceBuffer[sourceTop] = ((char) (L));
		++(sourceTop);
		str.getChars(0, L, sourceBuffer, sourceTop);
		sourceTop = nextTop;
	}

	private void append(char c) {
		if ((sourceTop) == (sourceBuffer.length)) {
			increaseSourceCapacity(((sourceTop) + 1));
		}
		sourceBuffer[sourceTop] = c;
		++(sourceTop);
	}

	private void increaseSourceCapacity(int minimalCapacity) {
		if (minimalCapacity <= (sourceBuffer.length))
			com.google.javascript.rhino.Kit.codeBug();
		
		int newCapacity = (sourceBuffer.length) * 2;
		if (newCapacity < minimalCapacity) {
			newCapacity = minimalCapacity;
		}
		char[] tmp = new char[newCapacity];
		java.lang.System.arraycopy(sourceBuffer, 0, tmp, 0, sourceTop);
		sourceBuffer = tmp;
	}

	private java.lang.String sourceToString(int offset) {
		if ((offset < 0) || ((sourceTop) < offset))
			com.google.javascript.rhino.Kit.codeBug();
		
		return new java.lang.String(sourceBuffer, offset, ((sourceTop) - offset));
	}

	public static java.lang.String decompile(java.lang.String source, int flags, com.google.javascript.rhino.UintMap properties) {
		int length = source.length();
		if (length == 0) {
			return "";
		}
		int indent = properties.getInt(com.google.javascript.rhino.Decompiler.INITIAL_INDENT_PROP, 0);
		if (indent < 0)
			throw new java.lang.IllegalArgumentException();
		
		int indentGap = properties.getInt(com.google.javascript.rhino.Decompiler.INDENT_GAP_PROP, 4);
		if (indentGap < 0)
			throw new java.lang.IllegalArgumentException();
		
		int caseGap = properties.getInt(com.google.javascript.rhino.Decompiler.CASE_GAP_PROP, 2);
		if (caseGap < 0)
			throw new java.lang.IllegalArgumentException();
		
		java.lang.StringBuffer result = new java.lang.StringBuffer();
		boolean justFunctionBody = 0 != (flags & (com.google.javascript.rhino.Decompiler.ONLY_BODY_FLAG));
		boolean toSource = 0 != (flags & (com.google.javascript.rhino.Decompiler.TO_SOURCE_FLAG));
		if (com.google.javascript.rhino.Decompiler.printSource) {
			java.lang.System.err.println(("length:" + length));
			for (int i = 0; i < length; ++i) {
				java.lang.String tokenname = null;
				if (com.google.javascript.rhino.Token.printNames) {
					tokenname = com.google.javascript.rhino.Token.name(source.charAt(i));
				}
				if (tokenname == null) {
					tokenname = "---";
				}
				java.lang.String pad = (tokenname.length()) > 7 ? "\t" : "\t\t";
				java.lang.System.err.println((((((tokenname + pad) + ((int) (source.charAt(i)))) + "\t\'") + (com.google.javascript.rhino.ScriptRuntime.escapeString(source.substring(i, (i + 1))))) + "'"));
			}
			java.lang.System.err.println();
		}
		int braceNesting = 0;
		boolean afterFirstEOL = false;
		int i = 0;
		int topFunctionType;
		if ((source.charAt(i)) == (com.google.javascript.rhino.Token.SCRIPT)) {
			++i;
			topFunctionType = -1;
		}else {
			topFunctionType = source.charAt((i + 1));
		}
		if (!toSource) {
			result.append('\n');
			for (int j = 0; j < indent; j++)
				result.append(' ');
			
		}else {
			if (topFunctionType == (com.google.javascript.rhino.FunctionNode.FUNCTION_EXPRESSION)) {
				result.append('(');
			}
		}
		while (i < length) {
			switch (source.charAt(i)) {
				case com.google.javascript.rhino.Token.GET :
				case com.google.javascript.rhino.Token.SET :
					result.append(((source.charAt(i)) == (com.google.javascript.rhino.Token.GET) ? "get " : "set "));
					++i;
					i = com.google.javascript.rhino.Decompiler.printSourceString(source, (i + 1), false, result);
					++i;
					break;
				case com.google.javascript.rhino.Token.NAME :
				case com.google.javascript.rhino.Token.REGEXP :
					i = com.google.javascript.rhino.Decompiler.printSourceString(source, (i + 1), false, result);
					continue;
				case com.google.javascript.rhino.Token.STRING :
					i = com.google.javascript.rhino.Decompiler.printSourceString(source, (i + 1), true, result);
					continue;
				case com.google.javascript.rhino.Token.NUMBER :
					i = com.google.javascript.rhino.Decompiler.printSourceNumber(source, (i + 1), result);
					continue;
				case com.google.javascript.rhino.Token.TRUE :
					result.append("true");
					break;
				case com.google.javascript.rhino.Token.FALSE :
					result.append("false");
					break;
				case com.google.javascript.rhino.Token.NULL :
					result.append("null");
					break;
				case com.google.javascript.rhino.Token.THIS :
					result.append("this");
					break;
				case com.google.javascript.rhino.Token.FUNCTION :
					++i;
					result.append("function ");
					break;
				case com.google.javascript.rhino.Decompiler.FUNCTION_END :
					break;
				case com.google.javascript.rhino.Token.COMMA :
					result.append(", ");
					break;
				case com.google.javascript.rhino.Token.LC :
					++braceNesting;
					if ((com.google.javascript.rhino.Token.EOL) == (com.google.javascript.rhino.Decompiler.getNext(source, length, i)))
						indent += indentGap;
					
					result.append('{');
					break;
				case com.google.javascript.rhino.Token.RC :
					{
						--braceNesting;
						if (justFunctionBody && (braceNesting == 0))
							break;
						
						result.append('}');
						switch (com.google.javascript.rhino.Decompiler.getNext(source, length, i)) {
							case com.google.javascript.rhino.Token.EOL :
							case com.google.javascript.rhino.Decompiler.FUNCTION_END :
								indent -= indentGap;
								break;
							case com.google.javascript.rhino.Token.WHILE :
							case com.google.javascript.rhino.Token.ELSE :
								indent -= indentGap;
								result.append(' ');
								break;
						}
						break;
					}
				case com.google.javascript.rhino.Token.LP :
					result.append('(');
					break;
				case com.google.javascript.rhino.Token.RP :
					result.append(')');
					if ((com.google.javascript.rhino.Token.LC) == (com.google.javascript.rhino.Decompiler.getNext(source, length, i)))
						result.append(' ');
					
					break;
				case com.google.javascript.rhino.Token.LB :
					result.append('[');
					break;
				case com.google.javascript.rhino.Token.RB :
					result.append(']');
					break;
				case com.google.javascript.rhino.Token.EOL :
					{
						if (toSource)
							break;
						
						boolean newLine = true;
						if (!afterFirstEOL) {
							afterFirstEOL = true;
							if (justFunctionBody) {
								result.setLength(0);
								indent -= indentGap;
								newLine = false;
							}
						}
						if (newLine) {
							result.append('\n');
						}
						if ((i + 1) < length) {
							int less = 0;
							int nextToken = source.charAt((i + 1));
							if ((nextToken == (com.google.javascript.rhino.Token.CASE)) || (nextToken == (com.google.javascript.rhino.Token.DEFAULT))) {
								less = indentGap - caseGap;
							}else
								if (nextToken == (com.google.javascript.rhino.Token.RC)) {
									less = indentGap;
								}else
									if (nextToken == (com.google.javascript.rhino.Token.NAME)) {
										int afterName = com.google.javascript.rhino.Decompiler.getSourceStringEnd(source, (i + 2));
										if ((source.charAt(afterName)) == (com.google.javascript.rhino.Token.COLON))
											less = indentGap;
										
									}
								
							
							for (; less < indent; less++)
								result.append(' ');
							
						}
						break;
					}
				case com.google.javascript.rhino.Token.DOT :
					result.append('.');
					break;
				case com.google.javascript.rhino.Token.NEW :
					result.append("new ");
					break;
				case com.google.javascript.rhino.Token.DELPROP :
					result.append("delete ");
					break;
				case com.google.javascript.rhino.Token.IF :
					result.append("if ");
					break;
				case com.google.javascript.rhino.Token.ELSE :
					result.append("else ");
					break;
				case com.google.javascript.rhino.Token.FOR :
					result.append("for ");
					break;
				case com.google.javascript.rhino.Token.IN :
					result.append(" in ");
					break;
				case com.google.javascript.rhino.Token.WITH :
					result.append("with ");
					break;
				case com.google.javascript.rhino.Token.WHILE :
					result.append("while ");
					break;
				case com.google.javascript.rhino.Token.DO :
					result.append("do ");
					break;
				case com.google.javascript.rhino.Token.TRY :
					result.append("try ");
					break;
				case com.google.javascript.rhino.Token.CATCH :
					result.append("catch ");
					break;
				case com.google.javascript.rhino.Token.FINALLY :
					result.append("finally ");
					break;
				case com.google.javascript.rhino.Token.THROW :
					result.append("throw ");
					break;
				case com.google.javascript.rhino.Token.SWITCH :
					result.append("switch ");
					break;
				case com.google.javascript.rhino.Token.BREAK :
					result.append("break");
					if ((com.google.javascript.rhino.Token.NAME) == (com.google.javascript.rhino.Decompiler.getNext(source, length, i)))
						result.append(' ');
					
					break;
				case com.google.javascript.rhino.Token.CONTINUE :
					result.append("continue");
					if ((com.google.javascript.rhino.Token.NAME) == (com.google.javascript.rhino.Decompiler.getNext(source, length, i)))
						result.append(' ');
					
					break;
				case com.google.javascript.rhino.Token.CASE :
					result.append("case ");
					break;
				case com.google.javascript.rhino.Token.DEFAULT :
					result.append("default");
					break;
				case com.google.javascript.rhino.Token.RETURN :
					result.append("return");
					if ((com.google.javascript.rhino.Token.SEMI) != (com.google.javascript.rhino.Decompiler.getNext(source, length, i)))
						result.append(' ');
					
					break;
				case com.google.javascript.rhino.Token.VAR :
					result.append("var ");
					break;
				case com.google.javascript.rhino.Token.SEMI :
					result.append(';');
					if ((com.google.javascript.rhino.Token.EOL) != (com.google.javascript.rhino.Decompiler.getNext(source, length, i))) {
						result.append(' ');
					}
					break;
				case com.google.javascript.rhino.Token.ASSIGN :
					result.append(" = ");
					break;
				case com.google.javascript.rhino.Token.ASSIGN_ADD :
					result.append(" += ");
					break;
				case com.google.javascript.rhino.Token.ASSIGN_SUB :
					result.append(" -= ");
					break;
				case com.google.javascript.rhino.Token.ASSIGN_MUL :
					result.append(" *= ");
					break;
				case com.google.javascript.rhino.Token.ASSIGN_DIV :
					result.append(" /= ");
					break;
				case com.google.javascript.rhino.Token.ASSIGN_MOD :
					result.append(" %= ");
					break;
				case com.google.javascript.rhino.Token.ASSIGN_BITOR :
					result.append(" |= ");
					break;
				case com.google.javascript.rhino.Token.ASSIGN_BITXOR :
					result.append(" ^= ");
					break;
				case com.google.javascript.rhino.Token.ASSIGN_BITAND :
					result.append(" &= ");
					break;
				case com.google.javascript.rhino.Token.ASSIGN_LSH :
					result.append(" <<= ");
					break;
				case com.google.javascript.rhino.Token.ASSIGN_RSH :
					result.append(" >>= ");
					break;
				case com.google.javascript.rhino.Token.ASSIGN_URSH :
					result.append(" >>>= ");
					break;
				case com.google.javascript.rhino.Token.HOOK :
					result.append(" ? ");
					break;
				case com.google.javascript.rhino.Token.OBJECTLIT :
					result.append(':');
					break;
				case com.google.javascript.rhino.Token.COLON :
					if ((com.google.javascript.rhino.Token.EOL) == (com.google.javascript.rhino.Decompiler.getNext(source, length, i)))
						result.append(':');
					else
						result.append(" : ");
					
					break;
				case com.google.javascript.rhino.Token.OR :
					result.append(" || ");
					break;
				case com.google.javascript.rhino.Token.AND :
					result.append(" && ");
					break;
				case com.google.javascript.rhino.Token.BITOR :
					result.append(" | ");
					break;
				case com.google.javascript.rhino.Token.BITXOR :
					result.append(" ^ ");
					break;
				case com.google.javascript.rhino.Token.BITAND :
					result.append(" & ");
					break;
				case com.google.javascript.rhino.Token.SHEQ :
					result.append(" === ");
					break;
				case com.google.javascript.rhino.Token.SHNE :
					result.append(" !== ");
					break;
				case com.google.javascript.rhino.Token.EQ :
					result.append(" == ");
					break;
				case com.google.javascript.rhino.Token.NE :
					result.append(" != ");
					break;
				case com.google.javascript.rhino.Token.LE :
					result.append(" <= ");
					break;
				case com.google.javascript.rhino.Token.LT :
					result.append(" < ");
					break;
				case com.google.javascript.rhino.Token.GE :
					result.append(" >= ");
					break;
				case com.google.javascript.rhino.Token.GT :
					result.append(" > ");
					break;
				case com.google.javascript.rhino.Token.INSTANCEOF :
					result.append(" instanceof ");
					break;
				case com.google.javascript.rhino.Token.LSH :
					result.append(" << ");
					break;
				case com.google.javascript.rhino.Token.RSH :
					result.append(" >> ");
					break;
				case com.google.javascript.rhino.Token.URSH :
					result.append(" >>> ");
					break;
				case com.google.javascript.rhino.Token.TYPEOF :
					result.append("typeof ");
					break;
				case com.google.javascript.rhino.Token.VOID :
					result.append("void ");
					break;
				case com.google.javascript.rhino.Token.CONST :
					result.append("const ");
					break;
				case com.google.javascript.rhino.Token.NOT :
					result.append('!');
					break;
				case com.google.javascript.rhino.Token.BITNOT :
					result.append('~');
					break;
				case com.google.javascript.rhino.Token.POS :
					result.append('+');
					break;
				case com.google.javascript.rhino.Token.NEG :
					result.append('-');
					break;
				case com.google.javascript.rhino.Token.INC :
					result.append("++");
					break;
				case com.google.javascript.rhino.Token.DEC :
					result.append("--");
					break;
				case com.google.javascript.rhino.Token.ADD :
					result.append(" + ");
					break;
				case com.google.javascript.rhino.Token.SUB :
					result.append(" - ");
					break;
				case com.google.javascript.rhino.Token.MUL :
					result.append(" * ");
					break;
				case com.google.javascript.rhino.Token.DIV :
					result.append(" / ");
					break;
				case com.google.javascript.rhino.Token.MOD :
					result.append(" % ");
					break;
				case com.google.javascript.rhino.Token.COLONCOLON :
					result.append("::");
					break;
				case com.google.javascript.rhino.Token.DOTDOT :
					result.append("..");
					break;
				case com.google.javascript.rhino.Token.DOTQUERY :
					result.append(".(");
					break;
				case com.google.javascript.rhino.Token.XMLATTR :
					result.append('@');
					break;
				default :
					throw new java.lang.RuntimeException(("Token: " + (com.google.javascript.rhino.Token.name(source.charAt(i)))));
			}
			++i;
		} 
		if (!toSource) {
			if (!justFunctionBody)
				result.append('\n');
			
		}else {
			if (topFunctionType == (com.google.javascript.rhino.FunctionNode.FUNCTION_EXPRESSION)) {
				result.append(')');
			}
		}
		return result.toString();
	}

	private static int getNext(java.lang.String source, int length, int i) {
		return (i + 1) < length ? source.charAt((i + 1)) : com.google.javascript.rhino.Token.EOF;
	}

	private static int getSourceStringEnd(java.lang.String source, int offset) {
		return com.google.javascript.rhino.Decompiler.printSourceString(source, offset, false, null);
	}

	private static int printSourceString(java.lang.String source, int offset, boolean asQuotedString, java.lang.StringBuffer sb) {
		int length = source.charAt(offset);
		++offset;
		if ((32768 & length) != 0) {
			length = ((32767 & length) << 16) | (source.charAt(offset));
			++offset;
		}
		if (sb != null) {
			java.lang.String str = source.substring(offset, (offset + length));
			if (!asQuotedString) {
				sb.append(str);
			}else {
				sb.append('"');
				sb.append(com.google.javascript.rhino.ScriptRuntime.escapeString(str));
				sb.append('"');
			}
		}
		return offset + length;
	}

	private static int printSourceNumber(java.lang.String source, int offset, java.lang.StringBuffer sb) {
		double number = 0.0;
		char type = source.charAt(offset);
		++offset;
		if (type == 'S') {
			if (sb != null) {
				int ival = source.charAt(offset);
				number = ival;
			}
			++offset;
		}else
			if ((type == 'J') || (type == 'D')) {
				if (sb != null) {
					long lbits;
					lbits = ((long) (source.charAt(offset))) << 48;
					lbits |= ((long) (source.charAt((offset + 1)))) << 32;
					lbits |= ((long) (source.charAt((offset + 2)))) << 16;
					lbits |= source.charAt((offset + 3));
					if (type == 'J') {
						number = lbits;
					}else {
						number = java.lang.Double.longBitsToDouble(lbits);
					}
				}
				offset += 4;
			}else {
				throw new java.lang.RuntimeException();
			}
		
		if (sb != null) {
			sb.append(com.google.javascript.rhino.ScriptRuntime.numberToString(number, 10));
		}
		return offset;
	}

	private char[] sourceBuffer = new char[128];

	private int sourceTop;

	private static final boolean printSource = false;
}


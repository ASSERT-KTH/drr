

package org.apache.commons.lang;


public class StringEscapeUtils {
	public StringEscapeUtils() {
		super();
	}

	public static java.lang.String escapeJava(java.lang.String str) {
		return org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(str, false);
	}

	public static void escapeJava(java.io.Writer out, java.lang.String str) throws java.io.IOException {
		org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(out, str, false);
	}

	public static java.lang.String escapeJavaScript(java.lang.String str) {
		return org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(str, true);
	}

	public static void escapeJavaScript(java.io.Writer out, java.lang.String str) throws java.io.IOException {
		org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(out, str, true);
	}

	private static java.lang.String escapeJavaStyleString(java.lang.String str, boolean escapeSingleQuotes) {
		if (str == null) {
			return null;
		}
		try {
			java.io.StringWriter writer = new java.io.StringWriter(((str.length()) * 2));
			org.apache.commons.lang.StringEscapeUtils.escapeJavaStyleString(writer, str, escapeSingleQuotes);
			return writer.toString();
		} catch (java.io.IOException ioe) {
			ioe.printStackTrace();
			return null;
		}
	}

	private static void escapeJavaStyleString(java.io.Writer out, java.lang.String str, boolean escapeSingleQuote) throws java.io.IOException {
		if (out == null) {
			throw new java.lang.IllegalArgumentException("The Writer must not be null");
		}
		if (str == null) {
			return ;
		}
		int sz;
		sz = str.length();
		for (int i = 0; i < sz; i++) {
			char ch = str.charAt(i);
			if (ch > 4095) {
				out.write(("\\u" + (org.apache.commons.lang.StringEscapeUtils.hex(ch))));
			}else
				if (ch > 255) {
					out.write(("\\u0" + (org.apache.commons.lang.StringEscapeUtils.hex(ch))));
				}else
					if (ch > 127) {
						out.write(("\\u00" + (org.apache.commons.lang.StringEscapeUtils.hex(ch))));
					}else
						if (ch < 32) {
							switch (ch) {
								case '\b' :
									out.write('\\');
									out.write('b');
									break;
								case '\n' :
									out.write('\\');
									out.write('n');
									break;
								case '\t' :
									out.write('\\');
									out.write('t');
									break;
								case '\f' :
									out.write('\\');
									out.write('f');
									break;
								case '\r' :
									out.write('\\');
									out.write('r');
									break;
								default :
									if (ch > 15) {
										out.write(("\\u00" + (org.apache.commons.lang.StringEscapeUtils.hex(ch))));
									}else {
										out.write(("\\u000" + (org.apache.commons.lang.StringEscapeUtils.hex(ch))));
									}
									break;
							}
						}else {
							switch (ch) {
								case '\'' :
									if (escapeSingleQuote) {
										out.write('\\');
									}
									out.write('\'');
									break;
								case '"' :
									out.write('\\');
									out.write('"');
									break;
								case '\\' :
									out.write('\\');
									out.write('\\');
									break;
								case '/' :
									out.write('\\');
									out.write('/');
									break;
								default :
									out.write(ch);
									break;
							}
						}
					
				
			
		}
	}

	private static java.lang.String hex(char ch) {
		return java.lang.Integer.toHexString(ch).toUpperCase();
	}

	public static java.lang.String unescapeJava(java.lang.String str) {
		if (str == null) {
			return null;
		}
		try {
			java.io.StringWriter writer = new java.io.StringWriter(str.length());
			org.apache.commons.lang.StringEscapeUtils.unescapeJava(writer, str);
			return writer.toString();
		} catch (java.io.IOException ioe) {
			ioe.printStackTrace();
			return null;
		}
	}

	public static void unescapeJava(java.io.Writer out, java.lang.String str) throws java.io.IOException {
		if (out == null) {
			throw new java.lang.IllegalArgumentException("The Writer must not be null");
		}
		if (str == null) {
			return ;
		}
		int sz = str.length();
		java.lang.StringBuffer unicode = new java.lang.StringBuffer(4);
		boolean hadSlash = false;
		boolean inUnicode = false;
		for (int i = 0; i < sz; i++) {
			char ch = str.charAt(i);
			if (inUnicode) {
				unicode.append(ch);
				if ((unicode.length()) == 4) {
					try {
						int value = java.lang.Integer.parseInt(unicode.toString(), 16);
						out.write(((char) (value)));
						unicode.setLength(0);
						inUnicode = false;
						hadSlash = false;
					} catch (java.lang.NumberFormatException nfe) {
						throw new org.apache.commons.lang.exception.NestableRuntimeException(("Unable to parse unicode value: " + unicode), nfe);
					}
				}
				continue;
			}
			if (hadSlash) {
				hadSlash = false;
				switch (ch) {
					case '\\' :
						out.write('\\');
						break;
					case '\'' :
						out.write('\'');
						break;
					case '\"' :
						out.write('"');
						break;
					case 'r' :
						out.write('\r');
						break;
					case 'f' :
						out.write('\f');
						break;
					case 't' :
						out.write('\t');
						break;
					case 'n' :
						out.write('\n');
						break;
					case 'b' :
						out.write('\b');
						break;
					case 'u' :
						{
							inUnicode = true;
							break;
						}
					default :
						out.write(ch);
						break;
				}
				continue;
			}else
				if (ch == '\\') {
					hadSlash = true;
					continue;
				}
			
			out.write(ch);
		}
		if (hadSlash) {
			out.write('\\');
		}
	}

	public static java.lang.String unescapeJavaScript(java.lang.String str) {
		return org.apache.commons.lang.StringEscapeUtils.unescapeJava(str);
	}

	public static void unescapeJavaScript(java.io.Writer out, java.lang.String str) throws java.io.IOException {
		org.apache.commons.lang.StringEscapeUtils.unescapeJava(out, str);
	}

	public static java.lang.String escapeHtml(java.lang.String str) {
		if (str == null) {
			return null;
		}
		try {
			java.io.StringWriter writer = new java.io.StringWriter(((int) ((str.length()) * 1.5)));
			org.apache.commons.lang.StringEscapeUtils.escapeHtml(writer, str);
			return writer.toString();
		} catch (java.io.IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void escapeHtml(java.io.Writer writer, java.lang.String string) throws java.io.IOException {
		if (writer == null) {
			throw new java.lang.IllegalArgumentException("The Writer must not be null.");
		}
		if (string == null) {
			return ;
		}
		org.apache.commons.lang.Entities.HTML40.escape(writer, string);
	}

	public static java.lang.String unescapeHtml(java.lang.String str) {
		if (str == null) {
			return null;
		}
		try {
			java.io.StringWriter writer = new java.io.StringWriter(((int) ((str.length()) * 1.5)));
			org.apache.commons.lang.StringEscapeUtils.unescapeHtml(writer, str);
			return writer.toString();
		} catch (java.io.IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void unescapeHtml(java.io.Writer writer, java.lang.String string) throws java.io.IOException {
		if (writer == null) {
			throw new java.lang.IllegalArgumentException("The Writer must not be null.");
		}
		if (string == null) {
			return ;
		}
		org.apache.commons.lang.Entities.HTML40.unescape(writer, string);
	}

	public static void escapeXml(java.io.Writer writer, java.lang.String str) throws java.io.IOException {
		if (writer == null) {
			throw new java.lang.IllegalArgumentException("The Writer must not be null.");
		}
		if (str == null) {
			return ;
		}
		org.apache.commons.lang.Entities.XML.escape(writer, str);
	}

	public static java.lang.String escapeXml(java.lang.String str) {
		if (str == null) {
			return null;
		}
		return org.apache.commons.lang.Entities.XML.escape(str);
	}

	public static void unescapeXml(java.io.Writer writer, java.lang.String str) throws java.io.IOException {
		if (writer == null) {
			throw new java.lang.IllegalArgumentException("The Writer must not be null.");
		}
		if (str == null) {
			return ;
		}
		org.apache.commons.lang.Entities.XML.unescape(writer, str);
	}

	public static java.lang.String unescapeXml(java.lang.String str) {
		if (str == null) {
			return null;
		}
		return org.apache.commons.lang.Entities.XML.unescape(str);
	}

	public static java.lang.String escapeSql(java.lang.String str) {
		if (str == null) {
			return null;
		}
		return org.apache.commons.lang.StringUtils.replace(str, "'", "''");
	}
}


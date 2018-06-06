

package org.apache.commons.lang;


@java.lang.Deprecated
public class StringEscapeUtils {
	public StringEscapeUtils() {
		super();
	}

	public static java.lang.String escapeJava(java.lang.String str) {
		return org.apache.commons.lang.text.translate.EscapeUtils.escapeJava(str);
	}

	public static void escapeJava(java.io.Writer out, java.lang.String str) throws java.io.IOException {
		org.apache.commons.lang.text.translate.EscapeUtils.ESCAPE_JAVA.translate(str, out);
	}

	public static java.lang.String escapeJavaScript(java.lang.String str) {
		return org.apache.commons.lang.text.translate.EscapeUtils.escapeEcmaScript(str);
	}

	public static void escapeJavaScript(java.io.Writer out, java.lang.String str) throws java.io.IOException {
		org.apache.commons.lang.text.translate.EscapeUtils.ESCAPE_ECMASCRIPT.translate(str, out);
	}

	public static java.lang.String unescapeJava(java.lang.String str) {
		return org.apache.commons.lang.text.translate.UnescapeUtils.unescapeJava(str);
	}

	public static void unescapeJava(java.io.Writer out, java.lang.String str) throws java.io.IOException {
		org.apache.commons.lang.text.translate.UnescapeUtils.UNESCAPE_JAVA.translate(str, out);
	}

	public static java.lang.String unescapeJavaScript(java.lang.String str) {
		return org.apache.commons.lang.text.translate.UnescapeUtils.unescapeEcmaScript(str);
	}

	public static void unescapeJavaScript(java.io.Writer out, java.lang.String str) throws java.io.IOException {
		org.apache.commons.lang.text.translate.UnescapeUtils.UNESCAPE_ECMASCRIPT.translate(str, out);
	}

	public static java.lang.String escapeHtml(java.lang.String str) {
		return org.apache.commons.lang.text.translate.EscapeUtils.escapeHtml4(str);
	}

	public static void escapeHtml(java.io.Writer writer, java.lang.String string) throws java.io.IOException {
		org.apache.commons.lang.text.translate.EscapeUtils.ESCAPE_HTML4.translate(string, writer);
	}

	public static java.lang.String unescapeHtml(java.lang.String str) {
		return org.apache.commons.lang.text.translate.UnescapeUtils.unescapeHtml4(str);
	}

	public static void unescapeHtml(java.io.Writer writer, java.lang.String string) throws java.io.IOException {
		org.apache.commons.lang.text.translate.UnescapeUtils.UNESCAPE_HTML4.translate(string, writer);
	}

	public static void escapeXml(java.io.Writer writer, java.lang.String str) throws java.io.IOException {
		org.apache.commons.lang.text.translate.EscapeUtils.ESCAPE_XML.translate(str, writer);
	}

	public static java.lang.String escapeXml(java.lang.String str) {
		return org.apache.commons.lang.text.translate.EscapeUtils.escapeXml(str);
	}

	public static void unescapeXml(java.io.Writer writer, java.lang.String str) throws java.io.IOException {
		org.apache.commons.lang.text.translate.UnescapeUtils.UNESCAPE_XML.translate(str, writer);
	}

	public static java.lang.String unescapeXml(java.lang.String str) {
		return org.apache.commons.lang.text.translate.UnescapeUtils.unescapeXml(str);
	}

	public static java.lang.String escapeCsv(java.lang.String str) {
		return org.apache.commons.lang.text.translate.EscapeUtils.escapeCsv(str);
	}

	public static void escapeCsv(java.io.Writer out, java.lang.String str) throws java.io.IOException {
		org.apache.commons.lang.text.translate.EscapeUtils.ESCAPE_CSV.translate(str, out);
	}

	public static java.lang.String unescapeCsv(java.lang.String str) {
		return org.apache.commons.lang.text.translate.UnescapeUtils.unescapeCsv(str);
	}

	public static void unescapeCsv(java.io.Writer out, java.lang.String str) throws java.io.IOException {
		org.apache.commons.lang.text.translate.UnescapeUtils.UNESCAPE_CSV.translate(str, out);
	}
}


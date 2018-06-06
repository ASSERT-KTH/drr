

package org.apache.commons.lang.text.translate;


public class EscapeUtils {
	public static final org.apache.commons.lang.text.translate.CharSequenceTranslator ESCAPE_JAVA = new org.apache.commons.lang.text.translate.LookupTranslator(new java.lang.String[][]{ new java.lang.String[]{ "\"" , "\\\"" } , new java.lang.String[]{ "\\" , "\\\\" } }).with(new org.apache.commons.lang.text.translate.LookupTranslator(org.apache.commons.lang.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE())).with(org.apache.commons.lang.text.translate.UnicodeEscaper.outsideOf(32, 127));

	public static final java.lang.String escapeJava(java.lang.String input) {
		return org.apache.commons.lang.text.translate.EscapeUtils.ESCAPE_JAVA.translate(input);
	}

	public static final org.apache.commons.lang.text.translate.CharSequenceTranslator ESCAPE_ECMASCRIPT = new org.apache.commons.lang.text.translate.AggregateTranslator(new org.apache.commons.lang.text.translate.LookupTranslator(new java.lang.String[][]{ new java.lang.String[]{ "'" , "\\\'" } , new java.lang.String[]{ "\"" , "\\\"" } , new java.lang.String[]{ "\\" , "\\\\" } , new java.lang.String[]{ "/" , "\\/" } }), new org.apache.commons.lang.text.translate.LookupTranslator(org.apache.commons.lang.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE()), org.apache.commons.lang.text.translate.UnicodeEscaper.outsideOf(32, 127));

	public static final java.lang.String escapeEcmaScript(java.lang.String input) {
		return org.apache.commons.lang.text.translate.EscapeUtils.ESCAPE_ECMASCRIPT.translate(input);
	}

	public static final org.apache.commons.lang.text.translate.CharSequenceTranslator ESCAPE_XML = new org.apache.commons.lang.text.translate.AggregateTranslator(new org.apache.commons.lang.text.translate.LookupTranslator(org.apache.commons.lang.text.translate.EntityArrays.BASIC_ESCAPE()), new org.apache.commons.lang.text.translate.LookupTranslator(org.apache.commons.lang.text.translate.EntityArrays.APOS_ESCAPE()), org.apache.commons.lang.text.translate.NumericEntityEscaper.above(127));

	public static final java.lang.String escapeXml(java.lang.String input) {
		return org.apache.commons.lang.text.translate.EscapeUtils.ESCAPE_XML.translate(input);
	}

	public static final org.apache.commons.lang.text.translate.CharSequenceTranslator ESCAPE_HTML3 = new org.apache.commons.lang.text.translate.AggregateTranslator(new org.apache.commons.lang.text.translate.LookupTranslator(org.apache.commons.lang.text.translate.EntityArrays.BASIC_ESCAPE()), new org.apache.commons.lang.text.translate.LookupTranslator(org.apache.commons.lang.text.translate.EntityArrays.ISO8859_1_ESCAPE()), org.apache.commons.lang.text.translate.NumericEntityEscaper.above(127));

	public static final java.lang.String escapeHtml3(java.lang.String input) {
		return org.apache.commons.lang.text.translate.EscapeUtils.ESCAPE_HTML3.translate(input);
	}

	public static final org.apache.commons.lang.text.translate.CharSequenceTranslator ESCAPE_HTML4 = new org.apache.commons.lang.text.translate.AggregateTranslator(new org.apache.commons.lang.text.translate.LookupTranslator(org.apache.commons.lang.text.translate.EntityArrays.BASIC_ESCAPE()), new org.apache.commons.lang.text.translate.LookupTranslator(org.apache.commons.lang.text.translate.EntityArrays.ISO8859_1_ESCAPE()), new org.apache.commons.lang.text.translate.LookupTranslator(org.apache.commons.lang.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE()), org.apache.commons.lang.text.translate.NumericEntityEscaper.above(127));

	public static final java.lang.String escapeHtml4(java.lang.String input) {
		return org.apache.commons.lang.text.translate.EscapeUtils.ESCAPE_HTML4.translate(input);
	}

	public static final org.apache.commons.lang.text.translate.CharSequenceTranslator ESCAPE_CSV = new org.apache.commons.lang.text.translate.EscapeUtils.CsvEscaper();

	public static final java.lang.String escapeCsv(java.lang.String input) {
		return org.apache.commons.lang.text.translate.EscapeUtils.ESCAPE_CSV.translate(input);
	}

	static class CsvEscaper extends org.apache.commons.lang.text.translate.CharSequenceTranslator {
		private static final char CSV_DELIMITER = ',';

		private static final char CSV_QUOTE = '"';

		private static final java.lang.String CSV_QUOTE_STR = java.lang.String.valueOf(org.apache.commons.lang.text.translate.EscapeUtils.CsvEscaper.CSV_QUOTE);

		private static final char[] CSV_SEARCH_CHARS = new char[]{ org.apache.commons.lang.text.translate.EscapeUtils.CsvEscaper.CSV_DELIMITER , org.apache.commons.lang.text.translate.EscapeUtils.CsvEscaper.CSV_QUOTE , org.apache.commons.lang.CharUtils.CR , org.apache.commons.lang.CharUtils.LF };

		public int translate(java.lang.CharSequence input, int index, java.io.Writer out) throws java.io.IOException {
			if (index != 0) {
				throw new java.lang.IllegalStateException("CsvEscaper should never reach the [1] index");
			}
			if (org.apache.commons.lang.StringUtils.containsNone(input.toString(), org.apache.commons.lang.text.translate.EscapeUtils.CsvEscaper.CSV_SEARCH_CHARS)) {
				out.write(input.toString());
			}else {
				out.write(org.apache.commons.lang.text.translate.EscapeUtils.CsvEscaper.CSV_QUOTE);
				out.write(org.apache.commons.lang.StringUtils.replace(input.toString(), org.apache.commons.lang.text.translate.EscapeUtils.CsvEscaper.CSV_QUOTE_STR, ((org.apache.commons.lang.text.translate.EscapeUtils.CsvEscaper.CSV_QUOTE_STR) + (org.apache.commons.lang.text.translate.EscapeUtils.CsvEscaper.CSV_QUOTE_STR))));
				out.write(org.apache.commons.lang.text.translate.EscapeUtils.CsvEscaper.CSV_QUOTE);
			}
			return input.length();
		}
	}
}


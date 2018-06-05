

package org.apache.commons.lang.text.translate;


public class UnescapeUtils {
	public static final org.apache.commons.lang.text.translate.CharSequenceTranslator UNESCAPE_JAVA = new org.apache.commons.lang.text.translate.AggregateTranslator(new org.apache.commons.lang.text.translate.UnicodeUnescaper(), new org.apache.commons.lang.text.translate.LookupTranslator(org.apache.commons.lang.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE()), new org.apache.commons.lang.text.translate.LookupTranslator(new java.lang.String[][]{ new java.lang.String[]{ "\\\\" , "\\" } , new java.lang.String[]{ "\\\"" , "\"" } , new java.lang.String[]{ "\\\'" , "'" } , new java.lang.String[]{ "\\" , "" } }));

	public static final java.lang.String unescapeJava(java.lang.String input) {
		return org.apache.commons.lang.text.translate.UnescapeUtils.UNESCAPE_JAVA.translate(input);
	}

	public static final org.apache.commons.lang.text.translate.CharSequenceTranslator UNESCAPE_ECMASCRIPT = org.apache.commons.lang.text.translate.UnescapeUtils.UNESCAPE_JAVA;

	public static final java.lang.String unescapeEcmaScript(java.lang.String input) {
		return org.apache.commons.lang.text.translate.UnescapeUtils.UNESCAPE_ECMASCRIPT.translate(input);
	}

	public static final org.apache.commons.lang.text.translate.CharSequenceTranslator UNESCAPE_HTML3 = new org.apache.commons.lang.text.translate.AggregateTranslator(new org.apache.commons.lang.text.translate.LookupTranslator(org.apache.commons.lang.text.translate.EntityArrays.BASIC_UNESCAPE()), new org.apache.commons.lang.text.translate.LookupTranslator(org.apache.commons.lang.text.translate.EntityArrays.ISO8859_1_UNESCAPE()), new org.apache.commons.lang.text.translate.NumericEntityUnescaper());

	public static final java.lang.String unescapeHtml3(java.lang.String input) {
		return org.apache.commons.lang.text.translate.UnescapeUtils.UNESCAPE_HTML3.translate(input);
	}

	public static final org.apache.commons.lang.text.translate.CharSequenceTranslator UNESCAPE_HTML4 = new org.apache.commons.lang.text.translate.AggregateTranslator(new org.apache.commons.lang.text.translate.LookupTranslator(org.apache.commons.lang.text.translate.EntityArrays.BASIC_UNESCAPE()), new org.apache.commons.lang.text.translate.LookupTranslator(org.apache.commons.lang.text.translate.EntityArrays.ISO8859_1_UNESCAPE()), new org.apache.commons.lang.text.translate.LookupTranslator(org.apache.commons.lang.text.translate.EntityArrays.HTML40_EXTENDED_UNESCAPE()), new org.apache.commons.lang.text.translate.NumericEntityUnescaper());

	public static final java.lang.String unescapeHtml4(java.lang.String input) {
		return org.apache.commons.lang.text.translate.UnescapeUtils.UNESCAPE_HTML4.translate(input);
	}

	public static final org.apache.commons.lang.text.translate.CharSequenceTranslator UNESCAPE_XML = new org.apache.commons.lang.text.translate.AggregateTranslator(new org.apache.commons.lang.text.translate.LookupTranslator(org.apache.commons.lang.text.translate.EntityArrays.BASIC_UNESCAPE()), new org.apache.commons.lang.text.translate.LookupTranslator(org.apache.commons.lang.text.translate.EntityArrays.APOS_UNESCAPE()), new org.apache.commons.lang.text.translate.NumericEntityUnescaper());

	public static final java.lang.String unescapeXml(java.lang.String input) {
		return org.apache.commons.lang.text.translate.UnescapeUtils.UNESCAPE_XML.translate(input);
	}

	public static final org.apache.commons.lang.text.translate.CharSequenceTranslator UNESCAPE_CSV = new org.apache.commons.lang.text.translate.UnescapeUtils.CsvUnescaper();

	public static final java.lang.String unescapeCsv(java.lang.String input) {
		return org.apache.commons.lang.text.translate.UnescapeUtils.UNESCAPE_CSV.translate(input);
	}

	static class CsvUnescaper extends org.apache.commons.lang.text.translate.CharSequenceTranslator {
		private static final char CSV_DELIMITER = ',';

		private static final char CSV_QUOTE = '"';

		private static final java.lang.String CSV_QUOTE_STR = java.lang.String.valueOf(org.apache.commons.lang.text.translate.UnescapeUtils.CsvUnescaper.CSV_QUOTE);

		private static final char[] CSV_SEARCH_CHARS = new char[]{ org.apache.commons.lang.text.translate.UnescapeUtils.CsvUnescaper.CSV_DELIMITER , org.apache.commons.lang.text.translate.UnescapeUtils.CsvUnescaper.CSV_QUOTE , org.apache.commons.lang.CharUtils.CR , org.apache.commons.lang.CharUtils.LF };

		@java.lang.Override
		public int translate(java.lang.CharSequence input, int index, java.io.Writer out) throws java.io.IOException {
			if (index != 0) {
				throw new java.lang.IllegalStateException("CsvUnescaper should never reach the [1] index");
			}
			if (((input.charAt(0)) != (org.apache.commons.lang.text.translate.UnescapeUtils.CsvUnescaper.CSV_QUOTE)) || ((input.charAt(((input.length()) - 1))) != (org.apache.commons.lang.text.translate.UnescapeUtils.CsvUnescaper.CSV_QUOTE))) {
				out.write(input.toString());
				return input.length();
			}
			java.lang.String quoteless = input.subSequence(1, ((input.length()) - 1)).toString();
			if (org.apache.commons.lang.StringUtils.containsAny(quoteless, org.apache.commons.lang.text.translate.UnescapeUtils.CsvUnescaper.CSV_SEARCH_CHARS)) {
				out.write(org.apache.commons.lang.StringUtils.replace(quoteless, ((org.apache.commons.lang.text.translate.UnescapeUtils.CsvUnescaper.CSV_QUOTE_STR) + (org.apache.commons.lang.text.translate.UnescapeUtils.CsvUnescaper.CSV_QUOTE_STR)), org.apache.commons.lang.text.translate.UnescapeUtils.CsvUnescaper.CSV_QUOTE_STR));
			}else {
				out.write(input.toString());
			}
			return input.length();
		}
	}
}


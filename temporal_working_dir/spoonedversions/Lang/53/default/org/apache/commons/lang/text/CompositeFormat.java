

package org.apache.commons.lang.text;


public class CompositeFormat extends java.text.Format {
	private static final long serialVersionUID = -4329119827877627683L;

	private final java.text.Format parser;

	private final java.text.Format formatter;

	public CompositeFormat(java.text.Format parser, java.text.Format formatter) {
		this.parser = parser;
		this.formatter = formatter;
	}

	public java.lang.StringBuffer format(java.lang.Object obj, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) {
		return formatter.format(obj, toAppendTo, pos);
	}

	public java.lang.Object parseObject(java.lang.String source, java.text.ParsePosition pos) {
		return parser.parseObject(source, pos);
	}

	public java.text.Format getParser() {
		return org.apache.commons.lang.text.CompositeFormat.this.parser;
	}

	public java.text.Format getFormatter() {
		return org.apache.commons.lang.text.CompositeFormat.this.formatter;
	}

	public java.lang.String reformat(java.lang.String input) throws java.text.ParseException {
		return format(parseObject(input));
	}
}


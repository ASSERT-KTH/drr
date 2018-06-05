

package org.apache.commons.lang.text;


public class ChoiceMetaFormat extends org.apache.commons.lang.text.MetaFormatSupport {
	private static final long serialVersionUID = 3802197832963795129L;

	public static final org.apache.commons.lang.text.ChoiceMetaFormat INSTANCE = new org.apache.commons.lang.text.ChoiceMetaFormat();

	public ChoiceMetaFormat() {
		super();
	}

	public java.lang.StringBuffer format(java.lang.Object obj, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) {
		if (obj instanceof java.text.ChoiceFormat) {
			return toAppendTo.append(((java.text.ChoiceFormat) (obj)).toPattern());
		}
		throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
	}

	public java.lang.Object parseObject(java.lang.String source, java.text.ParsePosition pos) {
		int start = pos.getIndex();
		seekFormatElementEnd(source, pos);
		return new java.text.ChoiceFormat(source.substring(start, pos.getIndex()));
	}
}


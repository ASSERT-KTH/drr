

package org.apache.commons.lang.text;


class DefaultMetaFormatFactory {
	public static final java.lang.String NUMBER_KEY = "number";

	public static final java.lang.String DATE_KEY = "date";

	public static final java.lang.String TIME_KEY = "time";

	public static final java.lang.String CHOICE_KEY = "choice";

	private static final java.lang.String[] NO_SUBFORMAT_KEYS = new java.lang.String[]{ org.apache.commons.lang.text.DefaultMetaFormatFactory.NUMBER_KEY , org.apache.commons.lang.text.DefaultMetaFormatFactory.DATE_KEY , org.apache.commons.lang.text.DefaultMetaFormatFactory.TIME_KEY };

	private static final java.lang.String[] NO_PATTERN_KEYS = new java.lang.String[]{ org.apache.commons.lang.text.DefaultMetaFormatFactory.NUMBER_KEY , org.apache.commons.lang.text.DefaultMetaFormatFactory.DATE_KEY , org.apache.commons.lang.text.DefaultMetaFormatFactory.TIME_KEY , org.apache.commons.lang.text.DefaultMetaFormatFactory.CHOICE_KEY };

	private static final java.lang.String[] PATTERN_KEYS = new java.lang.String[]{ org.apache.commons.lang.text.DefaultMetaFormatFactory.DATE_KEY , org.apache.commons.lang.text.DefaultMetaFormatFactory.TIME_KEY };

	private static class OrderedNameKeyedMetaFormat extends org.apache.commons.lang.text.NameKeyedMetaFormat {
		private static final long serialVersionUID = -7688772075239431055L;

		private java.util.List keys;

		private OrderedNameKeyedMetaFormat(java.lang.String[] names, java.text.Format[] formats) {
			super(org.apache.commons.lang.text.DefaultMetaFormatFactory.OrderedNameKeyedMetaFormat.createMap(names, formats));
			org.apache.commons.lang.text.DefaultMetaFormatFactory.OrderedNameKeyedMetaFormat.this.keys = java.util.Arrays.asList(names);
		}

		private static java.util.Map createMap(java.lang.String[] names, java.text.Format[] formats) {
			org.apache.commons.lang.Validate.isTrue(org.apache.commons.lang.ArrayUtils.isSameLength(names, formats));
			java.util.HashMap result = new java.util.HashMap(names.length);
			for (int i = 0; i < (names.length); i++) {
				result.put(names[i], formats[i]);
			}
			return result;
		}

		protected java.util.Iterator iterateKeys() {
			return keys.iterator();
		}
	}

	public static java.text.Format getFormat(final java.util.Locale locale) {
		java.text.Format nmf = new org.apache.commons.lang.text.NumberMetaFormat(locale);
		java.text.Format dmf = new org.apache.commons.lang.text.DateMetaFormat(locale).setHandlePatterns(false);
		java.text.Format tmf = new org.apache.commons.lang.text.TimeMetaFormat(locale).setHandlePatterns(false);
		return new org.apache.commons.lang.text.MultiFormat(new java.text.Format[]{ new org.apache.commons.lang.text.DefaultMetaFormatFactory.OrderedNameKeyedMetaFormat(org.apache.commons.lang.text.DefaultMetaFormatFactory.NO_SUBFORMAT_KEYS, new java.text.Format[]{ org.apache.commons.lang.text.DefaultMetaFormatFactory.getDefaultFormat(nmf) , org.apache.commons.lang.text.DefaultMetaFormatFactory.getDefaultFormat(dmf) , org.apache.commons.lang.text.DefaultMetaFormatFactory.getDefaultFormat(tmf) }) , new org.apache.commons.lang.text.DefaultMetaFormatFactory.OrderedNameKeyedMetaFormat(org.apache.commons.lang.text.DefaultMetaFormatFactory.NO_PATTERN_KEYS, new java.text.Format[]{ nmf , dmf , tmf , org.apache.commons.lang.text.ChoiceMetaFormat.INSTANCE }) , new org.apache.commons.lang.text.DefaultMetaFormatFactory.OrderedNameKeyedMetaFormat(org.apache.commons.lang.text.DefaultMetaFormatFactory.PATTERN_KEYS, new java.text.Format[]{ new org.apache.commons.lang.text.DateMetaFormat(locale) , new org.apache.commons.lang.text.TimeMetaFormat(locale) }) });
	}

	private static java.text.Format getDefaultFormat(java.text.Format metaformat) {
		java.text.ParsePosition pos = new java.text.ParsePosition(0);
		java.lang.Object o = metaformat.parseObject("", pos);
		return (pos.getErrorIndex()) < 0 ? ((java.text.Format) (o)) : null;
	}
}




package org.apache.commons.lang.text;


public class NumberMetaFormat extends org.apache.commons.lang.text.MetaFormatSupport {
	private static final long serialVersionUID = -5876397363537288952L;

	private static final java.lang.String DEFAULT = "";

	private static final java.lang.String INTEGER = "integer";

	private static final java.lang.String CURRENCY = "currency";

	private static final java.lang.String PERCENT = "percent";

	private static final java.lang.reflect.Method GET_INTEGER_INSTANCE;

	static {
		java.lang.reflect.Method m = null;
		try {
			java.lang.reflect.Method mm = java.text.NumberFormat.class.getDeclaredMethod("getIntegerInstance", new java.lang.Class[]{ java.util.Locale.class });
			if (java.lang.reflect.Modifier.isStatic(mm.getModifiers())) {
				m = mm;
			}
		} catch (java.lang.Exception e) {
		}
		GET_INTEGER_INSTANCE = m;
	}

	private java.util.Locale locale;

	private transient java.util.Map subformats;

	private transient java.util.Map reverseSubformats;

	private transient java.text.DecimalFormatSymbols decimalFormatSymbols;

	public NumberMetaFormat() {
		this(java.util.Locale.getDefault());
	}

	public NumberMetaFormat(java.util.Locale locale) {
		super();
		org.apache.commons.lang.text.NumberMetaFormat.this.locale = locale;
	}

	public java.lang.StringBuffer format(java.lang.Object obj, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) {
		initialize();
		java.lang.String subformat = ((java.lang.String) (reverseSubformats.get(obj)));
		if (subformat != null) {
			return toAppendTo.append(subformat);
		}
		if (obj instanceof java.text.DecimalFormat) {
			java.text.DecimalFormat df = ((java.text.DecimalFormat) (obj));
			if (df.getDecimalFormatSymbols().equals(decimalFormatSymbols)) {
				return toAppendTo.append(df.toPattern());
			}
		}
		throw new java.lang.IllegalArgumentException();
	}

	public java.lang.Object parseObject(java.lang.String source, java.text.ParsePosition pos) {
		int start = pos.getIndex();
		seekFormatElementEnd(source, pos);
		if ((pos.getErrorIndex()) >= 0) {
			return null;
		}
		java.lang.String subformat = source.substring(start, pos.getIndex()).trim();
		initialize();
		java.lang.Object result = subformats.get(subformat);
		if (result != null) {
			return result;
		}
		return new java.text.DecimalFormat(subformat, decimalFormatSymbols);
	}

	public java.util.Locale getLocale() {
		return locale;
	}

	private synchronized void initialize() {
		if ((subformats) == null) {
			subformats = new java.util.HashMap();
			subformats.put(org.apache.commons.lang.text.NumberMetaFormat.DEFAULT, java.text.NumberFormat.getInstance(getLocale()));
			subformats.put(org.apache.commons.lang.text.NumberMetaFormat.INTEGER, org.apache.commons.lang.text.NumberMetaFormat.createIntegerInstance(getLocale()));
			subformats.put(org.apache.commons.lang.text.NumberMetaFormat.CURRENCY, java.text.NumberFormat.getCurrencyInstance(getLocale()));
			subformats.put(org.apache.commons.lang.text.NumberMetaFormat.PERCENT, java.text.NumberFormat.getPercentInstance(getLocale()));
			reverseSubformats = invert(subformats);
			decimalFormatSymbols = new java.text.DecimalFormatSymbols(getLocale());
		}
	}

	private static java.text.NumberFormat createIntegerInstance(java.util.Locale locale) {
		if ((org.apache.commons.lang.text.NumberMetaFormat.GET_INTEGER_INSTANCE) != null) {
			try {
				return ((java.text.NumberFormat) (org.apache.commons.lang.text.NumberMetaFormat.GET_INTEGER_INSTANCE.invoke(null, new java.lang.Object[]{ locale })));
			} catch (java.lang.IllegalAccessException e) {
			} catch (java.lang.reflect.InvocationTargetException e) {
			}
		}
		java.text.NumberFormat result = java.text.NumberFormat.getInstance(locale);
		result.setMaximumFractionDigits(0);
		result.setParseIntegerOnly(true);
		return result;
	}
}


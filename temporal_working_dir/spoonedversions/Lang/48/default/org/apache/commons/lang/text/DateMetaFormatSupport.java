

package org.apache.commons.lang.text;


public abstract class DateMetaFormatSupport extends org.apache.commons.lang.text.MetaFormatSupport {
	protected static final java.lang.String DEFAULT = "";

	protected static final java.lang.String SHORT = "short";

	protected static final java.lang.String MEDIUM = "medium";

	protected static final java.lang.String LONG = "long";

	protected static final java.lang.String FULL = "full";

	private java.util.Locale locale;

	private boolean handlePatterns = true;

	private transient boolean initialized;

	private transient java.util.Map styleMap;

	private transient java.util.Map inverseStyleMap;

	private transient java.util.Map subformats;

	private transient java.util.Map reverseSubformats;

	private transient java.text.DateFormatSymbols dateFormatSymbols;

	public DateMetaFormatSupport() {
		this(java.util.Locale.getDefault());
	}

	public DateMetaFormatSupport(java.util.Locale locale) {
		super();
		org.apache.commons.lang.text.DateMetaFormatSupport.this.locale = locale;
	}

	public java.lang.StringBuffer format(java.lang.Object obj, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) {
		java.lang.String subformat = getSubformatName(obj);
		if (subformat != null) {
			return toAppendTo.append(subformat);
		}
		if ((isHandlePatterns()) && (obj instanceof java.text.SimpleDateFormat)) {
			java.text.SimpleDateFormat sdf = ((java.text.SimpleDateFormat) (obj));
			if (sdf.getDateFormatSymbols().equals(dateFormatSymbols)) {
				return toAppendTo.append(sdf.toPattern());
			}
		}
		throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
	}

	private java.lang.String getSubformatName(java.lang.Object subformat) {
		initialize();
		if (reverseSubformats.containsKey(subformat)) {
			return ((java.lang.String) (inverseStyleMap.get(reverseSubformats.get(subformat))));
		}
		return null;
	}

	public java.lang.Object parseObject(java.lang.String source, java.text.ParsePosition pos) {
		int start = pos.getIndex();
		seekFormatElementEnd(source, pos);
		if ((pos.getErrorIndex()) >= 0) {
			return null;
		}
		java.lang.String subformat = source.substring(start, pos.getIndex()).trim();
		java.lang.Object result = getSubformat(subformat);
		if (result != null) {
			return result;
		}
		if (isHandlePatterns()) {
			return new java.text.SimpleDateFormat(subformat, getLocale());
		}
		pos.setErrorIndex(start);
		return null;
	}

	private java.text.Format getSubformat(java.lang.String subformat) {
		initialize();
		if (!(styleMap.containsKey(subformat))) {
			return null;
		}
		initialize();
		return ((java.text.Format) (subformats.get(styleMap.get(subformat))));
	}

	public java.util.Locale getLocale() {
		return locale;
	}

	private synchronized void initialize() {
		if (!(initialized)) {
			styleMap = createStyleMap();
			inverseStyleMap = createInverseStyleMap();
			subformats = new java.util.HashMap();
			reverseSubformats = new java.util.HashMap();
			for (java.util.Iterator iter = styleMap.values().iterator(); iter.hasNext();) {
				java.lang.Integer style = ((java.lang.Integer) (iter.next()));
				if (subformats.containsKey(style)) {
					continue;
				}
				java.text.Format sf = createSubformatInstance(style.intValue());
				subformats.put(style, sf);
				if (inverseStyleMap.containsKey(style)) {
					reverseSubformats.put(sf, style);
				}
			}
			dateFormatSymbols = new java.text.DateFormatSymbols(getLocale());
		}
		initialized = true;
	}

	protected abstract java.text.DateFormat createSubformatInstance(int style);

	public boolean isHandlePatterns() {
		return handlePatterns;
	}

	public org.apache.commons.lang.text.DateMetaFormatSupport setHandlePatterns(boolean handlePatterns) {
		org.apache.commons.lang.text.DateMetaFormatSupport.this.handlePatterns = handlePatterns;
		return org.apache.commons.lang.text.DateMetaFormatSupport.this;
	}

	protected java.util.Map createStyleMap() {
		java.util.HashMap result = new java.util.HashMap();
		result.put(org.apache.commons.lang.text.DateMetaFormatSupport.SHORT, new java.lang.Integer(java.text.DateFormat.SHORT));
		result.put(org.apache.commons.lang.text.DateMetaFormatSupport.MEDIUM, new java.lang.Integer(java.text.DateFormat.MEDIUM));
		result.put(org.apache.commons.lang.text.DateMetaFormatSupport.LONG, new java.lang.Integer(java.text.DateFormat.LONG));
		result.put(org.apache.commons.lang.text.DateMetaFormatSupport.FULL, new java.lang.Integer(java.text.DateFormat.FULL));
		result.put(org.apache.commons.lang.text.DateMetaFormatSupport.DEFAULT, new java.lang.Integer(java.text.DateFormat.DEFAULT));
		return result;
	}

	protected java.util.Map createInverseStyleMap() {
		java.util.Map invertMe = createStyleMap();
		invertMe.remove(org.apache.commons.lang.text.DateMetaFormatSupport.DEFAULT);
		return invert(invertMe);
	}
}


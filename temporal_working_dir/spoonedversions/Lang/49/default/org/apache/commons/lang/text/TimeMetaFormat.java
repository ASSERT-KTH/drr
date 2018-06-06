

package org.apache.commons.lang.text;


public class TimeMetaFormat extends org.apache.commons.lang.text.DateMetaFormatSupport {
	private static final long serialVersionUID = -4959095416302142342L;

	public TimeMetaFormat() {
		super();
	}

	public TimeMetaFormat(java.util.Locale locale) {
		super(locale);
	}

	protected java.text.DateFormat createSubformatInstance(int style) {
		return java.text.DateFormat.getTimeInstance(style, getLocale());
	}

	protected java.util.Map createInverseStyleMap() {
		java.util.Map invertMe = createStyleMap();
		invertMe.remove(org.apache.commons.lang.text.DateMetaFormatSupport.DEFAULT);
		java.text.DateFormat longDf = java.text.DateFormat.getTimeInstance(java.text.DateFormat.LONG, getLocale());
		java.text.DateFormat fullDf = java.text.DateFormat.getTimeInstance(java.text.DateFormat.FULL, getLocale());
		if (fullDf.equals(longDf)) {
			invertMe.remove(org.apache.commons.lang.text.DateMetaFormatSupport.FULL);
		}
		return invert(invertMe);
	}
}


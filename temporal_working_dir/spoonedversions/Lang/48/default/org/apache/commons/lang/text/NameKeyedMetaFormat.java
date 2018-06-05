

package org.apache.commons.lang.text;


public class NameKeyedMetaFormat extends org.apache.commons.lang.text.MetaFormatSupport {
	private static final long serialVersionUID = 5963121202601122213L;

	private static final char TRIGGER_END = '}';

	private static final char TRIGGER_SUBFORMAT = ',';

	public static class Builder {
		private java.util.HashMap keyedFormats = new java.util.HashMap();

		public org.apache.commons.lang.text.NameKeyedMetaFormat.Builder put(java.lang.String key, java.text.Format format) {
			keyedFormats.put(key, format);
			return org.apache.commons.lang.text.NameKeyedMetaFormat.Builder.this;
		}

		public org.apache.commons.lang.text.NameKeyedMetaFormat toNameKeyedMetaFormat() {
			return new org.apache.commons.lang.text.NameKeyedMetaFormat(keyedFormats);
		}
	}

	private java.util.Map keyedFormats = new java.util.HashMap();

	public NameKeyedMetaFormat(java.util.Map keyedFormats) {
		org.apache.commons.lang.text.NameKeyedMetaFormat.this.keyedFormats = keyedFormats;
	}

	public java.lang.StringBuffer format(java.lang.Object obj, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) {
		int start = toAppendTo.length();
		for (java.util.Iterator iter = iterateKeys(); iter.hasNext();) {
			java.lang.Object key = iter.next();
			if (org.apache.commons.lang.ObjectUtils.equals(keyedFormats.get(key), obj)) {
				return toAppendTo.append(key);
			}
		}
		for (java.util.Iterator iter = iterateKeys(); iter.hasNext();) {
			java.lang.Object key = iter.next();
			try {
				((java.text.Format) (keyedFormats.get(key))).format(obj, toAppendTo, pos);
				if ((toAppendTo.length()) > start) {
					toAppendTo.insert(start, ',');
				}
				return toAppendTo.insert(start, key);
			} catch (java.lang.Exception e) {
				continue;
			}
		}
		throw new java.lang.IllegalArgumentException(("Cannot format " + obj));
	}

	public java.lang.Object parseObject(java.lang.String source, java.text.ParsePosition pos) {
		int start = pos.getIndex();
		boolean subformat = false;
		for (; (pos.getIndex()) < (source.length()); next(pos)) {
			char c = source.charAt(pos.getIndex());
			if (c == (org.apache.commons.lang.text.NameKeyedMetaFormat.TRIGGER_SUBFORMAT)) {
				subformat = true;
				break;
			}
			if (c == (org.apache.commons.lang.text.NameKeyedMetaFormat.TRIGGER_END)) {
				break;
			}
		}
		java.lang.String key = source.substring(start, pos.getIndex());
		java.text.Format format = ((java.text.Format) (keyedFormats.get(key)));
		if (format == null) {
			format = ((java.text.Format) (keyedFormats.get(key.trim())));
			if (format == null) {
				pos.setErrorIndex(start);
				return null;
			}
		}
		if (subformat) {
			return format.parseObject(source, next(pos));
		}
		return format;
	}

	protected java.util.Iterator iterateKeys() {
		return keyedFormats.keySet().iterator();
	}
}


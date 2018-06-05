

package org.apache.commons.lang.text;


public class MultiFormat extends java.text.Format {
	private static final long serialVersionUID = -6128683973856547540L;

	public static class Builder {
		private java.util.ArrayList delegates = new java.util.ArrayList();

		public org.apache.commons.lang.text.MultiFormat.Builder add(java.text.Format delegate) {
			org.apache.commons.lang.Validate.notNull(delegate, "delegate format is null");
			delegates.add(delegate);
			return org.apache.commons.lang.text.MultiFormat.Builder.this;
		}

		public org.apache.commons.lang.text.MultiFormat toMultiFormat() {
			return new org.apache.commons.lang.text.MultiFormat(((java.text.Format[]) (delegates.toArray(new java.text.Format[delegates.size()]))));
		}
	}

	private java.text.Format[] delegates;

	public MultiFormat() {
	}

	public MultiFormat(java.text.Format[] delegates) {
		setDelegates(delegates);
	}

	public java.lang.StringBuffer format(java.lang.Object obj, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) {
		java.text.Format[] d = getValidDelegates();
		for (int i = 0; i < (d.length); i++) {
			try {
				return d[i].format(obj, toAppendTo, pos);
			} catch (java.lang.IllegalArgumentException e) {
				continue;
			}
		}
		throw new java.lang.IllegalArgumentException(("No delegate Format can parse " + obj));
	}

	public java.lang.Object parseObject(java.lang.String source, java.text.ParsePosition pos) {
		int start = pos.getIndex();
		java.text.Format[] d = getDelegates();
		for (int i = 0; i < (d.length); i++) {
			java.lang.Object o = d[i].parseObject(source, pos);
			if ((pos.getErrorIndex()) < 0) {
				return o;
			}
			pos.setIndex(start);
			pos.setErrorIndex((-1));
		}
		pos.setErrorIndex(start);
		return null;
	}

	public void setDelegates(java.text.Format[] delegates) {
		org.apache.commons.lang.Validate.noNullElements(delegates, "Null elements present in delegates Format[]");
		org.apache.commons.lang.text.MultiFormat.this.delegates = delegates;
	}

	public java.text.Format[] getDelegates() {
		return delegates;
	}

	private java.text.Format[] getValidDelegates() {
		java.text.Format[] result = getDelegates();
		org.apache.commons.lang.Validate.notEmpty(result, "No delegate Formats configured");
		return result;
	}
}


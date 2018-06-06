

package org.apache.commons.math.exception.util;


public class ExceptionContext implements java.io.Serializable {
	private static final long serialVersionUID = -6024911025449780478L;

	private java.util.List<org.apache.commons.math.exception.util.Localizable> msgPatterns = new java.util.ArrayList<org.apache.commons.math.exception.util.Localizable>();

	private java.util.List<java.lang.Object[]> msgArguments = new java.util.ArrayList<java.lang.Object[]>();

	private java.util.Map<java.lang.String, java.lang.Object> context = new java.util.HashMap<java.lang.String, java.lang.Object>();

	public void addMessage(org.apache.commons.math.exception.util.Localizable pattern, java.lang.Object... arguments) {
		msgPatterns.add(pattern);
		msgArguments.add(org.apache.commons.math.exception.util.ArgUtils.flatten(arguments));
	}

	public void setValue(java.lang.String key, java.lang.Object value) {
		context.put(key, value);
	}

	public java.lang.Object getValue(java.lang.String key) {
		return context.get(key);
	}

	public java.util.Set<java.lang.String> getKeys() {
		return context.keySet();
	}

	public java.lang.String getMessage() {
		return getMessage(java.util.Locale.US);
	}

	public java.lang.String getLocalizedMessage() {
		return getMessage(java.util.Locale.getDefault());
	}

	public java.lang.String getMessage(final java.util.Locale locale) {
		return buildMessage(locale, ": ");
	}

	public java.lang.String getMessage(final java.util.Locale locale, final java.lang.String separator) {
		return buildMessage(locale, separator);
	}

	private java.lang.String buildMessage(java.util.Locale locale, java.lang.String separator) {
		final java.lang.StringBuilder sb = new java.lang.StringBuilder();
		int count = 0;
		final int len = msgPatterns.size();
		for (int i = 0; i < len; i++) {
			final org.apache.commons.math.exception.util.Localizable pat = msgPatterns.get(i);
			final java.lang.Object[] args = msgArguments.get(i);
			final java.text.MessageFormat fmt = new java.text.MessageFormat(pat.getLocalizedString(locale), locale);
			sb.append(fmt.format(args));
			if ((++count) < len) {
				sb.append(separator);
			}
		}
		return sb.toString();
	}

	private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
		serializeMessages(out);
		serializeContext(out);
	}

	private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
		deSerializeMessages(in);
		deSerializeContext(in);
	}

	private void serializeMessages(java.io.ObjectOutputStream out) throws java.io.IOException {
		final int len = msgPatterns.size();
		out.writeInt(len);
		for (int i = 0; i < len; i++) {
			final org.apache.commons.math.exception.util.Localizable pat = msgPatterns.get(i);
			out.writeObject(pat);
			final java.lang.Object[] args = msgArguments.get(i);
			final int aLen = args.length;
			out.writeInt(aLen);
			for (int j = 0; j < aLen; j++) {
				if ((args[j]) instanceof java.io.Serializable) {
					out.writeObject(args[j]);
				}else {
					out.writeObject(nonSerializableReplacement(args[j]));
				}
			}
		}
	}

	private void deSerializeMessages(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
		final int len = in.readInt();
		msgPatterns = new java.util.ArrayList<org.apache.commons.math.exception.util.Localizable>(len);
		msgArguments = new java.util.ArrayList<java.lang.Object[]>(len);
		for (int i = 0; i < len; i++) {
			final org.apache.commons.math.exception.util.Localizable pat = ((org.apache.commons.math.exception.util.Localizable) (in.readObject()));
			msgPatterns.add(pat);
			final int aLen = in.readInt();
			final java.lang.Object[] args = new java.lang.Object[aLen];
			for (int j = 0; j < aLen; j++) {
				args[j] = in.readObject();
			}
			msgArguments.add(args);
		}
	}

	private void serializeContext(java.io.ObjectOutputStream out) throws java.io.IOException {
		final int len = context.keySet().size();
		out.writeInt(len);
		for (java.lang.String key : context.keySet()) {
			out.writeObject(key);
			final java.lang.Object value = context.get(key);
			if (value instanceof java.io.Serializable) {
				out.writeObject(value);
			}else {
				out.writeObject(nonSerializableReplacement(value));
			}
		}
	}

	private void deSerializeContext(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
		final int len = in.readInt();
		context = new java.util.HashMap<java.lang.String, java.lang.Object>();
		for (int i = 0; i < len; i++) {
			final java.lang.String key = ((java.lang.String) (in.readObject()));
			final java.lang.Object value = in.readObject();
			context.put(key, value);
		}
	}

	private java.lang.String nonSerializableReplacement(java.lang.Object obj) {
		return ("[Object could not be serialized: " + (obj.getClass().getName())) + "]";
	}
}




package org.apache.commons.math.exception;


public class MathRuntimeException extends java.lang.RuntimeException implements org.apache.commons.math.exception.MathThrowable {
	private static final long serialVersionUID = -6024911025449780478L;

	private java.util.List<org.apache.commons.math.util.SerializablePair<org.apache.commons.math.exception.util.Localizable, java.lang.Object[]>> messages = new java.util.ArrayList<org.apache.commons.math.util.SerializablePair<org.apache.commons.math.exception.util.Localizable, java.lang.Object[]>>();

	private java.util.Map<java.lang.String, java.lang.Object> context = new java.util.HashMap<java.lang.String, java.lang.Object>();

	public MathRuntimeException() {
	}

	public MathRuntimeException(final java.lang.Throwable cause) {
		super(cause);
	}

	public void addMessage(org.apache.commons.math.exception.util.Localizable pattern) {
		messages.add(new org.apache.commons.math.util.SerializablePair<org.apache.commons.math.exception.util.Localizable, java.lang.Object[]>(pattern, ((java.lang.Object[]) (null))));
	}

	public void addMessage(org.apache.commons.math.exception.util.Localizable pattern, java.lang.Object... arguments) {
		messages.add(new org.apache.commons.math.util.SerializablePair<org.apache.commons.math.exception.util.Localizable, java.lang.Object[]>(pattern, org.apache.commons.math.exception.util.ArgUtils.flatten(arguments)));
	}

	public void setContext(java.lang.String key, java.lang.Object value) {
		context.put(key, value);
	}

	public java.lang.Object getContext(java.lang.String key) {
		return context.get(key);
	}

	public java.util.Set<java.lang.String> getContextKeys() {
		return context.keySet();
	}

	public java.lang.String getMessage(final java.util.Locale locale) {
		return buildMessage(locale, ": ");
	}

	public java.lang.String getMessage(final java.util.Locale locale, final java.lang.String separator) {
		return buildMessage(locale, separator);
	}

	@java.lang.Override
	public java.lang.String getMessage() {
		return getMessage(java.util.Locale.US);
	}

	@java.lang.Override
	public java.lang.String getLocalizedMessage() {
		return getMessage(java.util.Locale.getDefault());
	}

	private java.lang.String buildMessage(java.util.Locale locale, java.lang.String separator) {
		final java.lang.StringBuilder sb = new java.lang.StringBuilder();
		int count = 0;
		final int len = messages.size();
		for (org.apache.commons.math.util.SerializablePair<org.apache.commons.math.exception.util.Localizable, java.lang.Object[]> pair : messages) {
			final java.text.MessageFormat fmt = new java.text.MessageFormat(pair.getKey().getLocalizedString(locale), locale);
			sb.append(fmt.format(pair.getValue()));
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
		final int len = messages.size();
		out.writeInt(len);
		for (int i = 0; i < len; i++) {
			org.apache.commons.math.util.SerializablePair<org.apache.commons.math.exception.util.Localizable, java.lang.Object[]> pair = messages.get(i);
			out.writeObject(pair.getKey());
			final java.lang.Object[] args = pair.getValue();
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
		messages = new java.util.ArrayList<org.apache.commons.math.util.SerializablePair<org.apache.commons.math.exception.util.Localizable, java.lang.Object[]>>(len);
		for (int i = 0; i < len; i++) {
			final org.apache.commons.math.exception.util.Localizable key = ((org.apache.commons.math.exception.util.Localizable) (in.readObject()));
			final int aLen = in.readInt();
			final java.lang.Object[] args = new java.lang.Object[aLen];
			for (int j = 0; j < aLen; j++) {
				args[j] = in.readObject();
			}
			messages.add(new org.apache.commons.math.util.SerializablePair<org.apache.commons.math.exception.util.Localizable, java.lang.Object[]>(key, args));
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


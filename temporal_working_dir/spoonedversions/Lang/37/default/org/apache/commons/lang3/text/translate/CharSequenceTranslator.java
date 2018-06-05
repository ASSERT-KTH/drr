

package org.apache.commons.lang3.text.translate;


public abstract class CharSequenceTranslator {
	public abstract int translate(java.lang.CharSequence input, int index, java.io.Writer out) throws java.io.IOException;

	public final java.lang.String translate(java.lang.CharSequence input) {
		if (input == null) {
			return null;
		}
		try {
			java.io.StringWriter writer = new java.io.StringWriter(((input.length()) * 2));
			translate(input, writer);
			return writer.toString();
		} catch (java.io.IOException ioe) {
			throw new java.lang.RuntimeException(ioe);
		}
	}

	public final void translate(java.lang.CharSequence input, java.io.Writer out) throws java.io.IOException {
		if (out == null) {
			throw new java.lang.IllegalArgumentException("The Writer must not be null");
		}
		if (input == null) {
			return ;
		}
		int sz = java.lang.Character.codePointCount(input, 0, input.length());
		for (int i = 0; i < sz; i++) {
			int consumed = translate(input, i, out);
			if (consumed == 0) {
				out.write(java.lang.Character.toChars(java.lang.Character.codePointAt(input, i)));
			}else {
				for (int j = 0; j < consumed; j++) {
					if (i < (sz - 2)) {
						i += java.lang.Character.charCount(java.lang.Character.codePointAt(input, i));
					}else {
						i++;
					}
				}
				i--;
			}
		}
	}

	public final org.apache.commons.lang3.text.translate.CharSequenceTranslator with(org.apache.commons.lang3.text.translate.CharSequenceTranslator... translators) {
		org.apache.commons.lang3.text.translate.CharSequenceTranslator[] newArray = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[(translators.length) + 1];
		newArray[0] = org.apache.commons.lang3.text.translate.CharSequenceTranslator.this;
		java.lang.System.arraycopy(translators, 0, newArray, 1, translators.length);
		return new org.apache.commons.lang3.text.translate.AggregateTranslator(newArray);
	}

	public static java.lang.String hex(int codepoint) {
		return java.lang.Integer.toHexString(codepoint).toUpperCase(java.util.Locale.ENGLISH);
	}
}




package org.apache.commons.lang3.text.translate;


public abstract class CodePointTranslator extends org.apache.commons.lang3.text.translate.CharSequenceTranslator {
	@java.lang.Override
	public final int translate(java.lang.CharSequence input, int index, java.io.Writer out) throws java.io.IOException {
		int codepoint = java.lang.Character.codePointAt(input, index);
		boolean consumed = translate(codepoint, out);
		if (consumed) {
			return 1;
		}else {
			return 0;
		}
	}

	public abstract boolean translate(int codepoint, java.io.Writer out) throws java.io.IOException;
}


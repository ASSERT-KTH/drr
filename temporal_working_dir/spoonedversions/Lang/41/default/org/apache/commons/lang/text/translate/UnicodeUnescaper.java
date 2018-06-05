

package org.apache.commons.lang.text.translate;


public class UnicodeUnescaper extends org.apache.commons.lang.text.translate.CharSequenceTranslator {
	public int translate(java.lang.CharSequence input, int index, java.io.Writer out) throws java.io.IOException {
		if ((input.charAt(index)) == '\\') {
			if (((index + 1) < (input.length())) && ((input.charAt((index + 1))) == 'u')) {
				int i = 2;
				while (((index + i) < (input.length())) && ((input.charAt((index + i))) == 'u')) {
					i++;
				} 
				if (((index + i) + 4) <= (input.length())) {
					java.lang.CharSequence unicode = input.subSequence((index + i), ((index + i) + 4));
					try {
						int value = java.lang.Integer.parseInt(unicode.toString(), 16);
						out.write(((char) (value)));
					} catch (java.lang.NumberFormatException nfe) {
						throw new java.lang.RuntimeException(("Unable to parse unicode value: " + unicode), nfe);
					}
					return i + 4;
				}else {
					throw new java.lang.IllegalArgumentException((("Less than 4 hex digits in unicode value: '" + (input.subSequence(index, input.length()))) + "' due to end of CharSequence"));
				}
			}
		}
		return 0;
	}
}


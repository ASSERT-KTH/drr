

package org.apache.commons.lang.text.translate;


public class NumericEntityUnescaper extends org.apache.commons.lang.text.translate.CharSequenceTranslator {
	@java.lang.Override
	public int translate(java.lang.CharSequence input, int index, java.io.Writer out) throws java.io.IOException {
		if (((input.charAt(index)) == '&') && ((input.charAt((index + 1))) == '#')) {
			int start = index + 2;
			boolean isHex = false;
			char firstChar = input.charAt(start);
			if ((firstChar == 'x') || (firstChar == 'X')) {
				start++;
				isHex = true;
			}
			int end = start;
			while ((input.charAt(end)) != ';') {
				end++;
			} 
			int entityValue;
			try {
				if (isHex) {
					entityValue = java.lang.Integer.parseInt(input.subSequence(start, end).toString(), 16);
				}else {
					entityValue = java.lang.Integer.parseInt(input.subSequence(start, end).toString(), 10);
				}
			} catch (java.lang.NumberFormatException nfe) {
				return 0;
			}
			out.write(entityValue);
			return ((2 + (end - start)) + (isHex ? 1 : 0)) + 1;
		}
		return 0;
	}
}


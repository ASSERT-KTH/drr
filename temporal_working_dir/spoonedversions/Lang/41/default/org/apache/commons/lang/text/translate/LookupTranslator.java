

package org.apache.commons.lang.text.translate;


public class LookupTranslator extends org.apache.commons.lang.text.translate.CharSequenceTranslator {
	private java.util.HashMap<java.lang.CharSequence, java.lang.CharSequence> lookupMap;

	private int shortest = java.lang.Integer.MAX_VALUE;

	private int longest = 0;

	public LookupTranslator(java.lang.CharSequence[][] lookup) {
		lookupMap = new java.util.HashMap<java.lang.CharSequence, java.lang.CharSequence>();
		for (java.lang.CharSequence[] seq : lookup) {
			org.apache.commons.lang.text.translate.LookupTranslator.this.lookupMap.put(seq[0], seq[1]);
			int sz = seq[0].length();
			if (sz < (shortest)) {
				shortest = sz;
			}
			if (sz > (longest)) {
				longest = sz;
			}
		}
	}

	public int translate(java.lang.CharSequence input, int index, java.io.Writer out) throws java.io.IOException {
		int max = longest;
		if ((index + (longest)) > (input.length())) {
			max = (input.length()) - index;
		}
		for (int i = max; i >= (shortest); i--) {
			java.lang.CharSequence subSeq = input.subSequence(index, (index + i));
			java.lang.CharSequence result = lookupMap.get(subSeq);
			if (result != null) {
				out.write(result.toString());
				return i;
			}
		}
		return 0;
	}
}


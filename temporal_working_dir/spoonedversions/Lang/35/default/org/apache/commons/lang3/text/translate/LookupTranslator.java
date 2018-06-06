

package org.apache.commons.lang3.text.translate;


public class LookupTranslator extends org.apache.commons.lang3.text.translate.CharSequenceTranslator {
	private final java.util.HashMap<java.lang.CharSequence, java.lang.CharSequence> lookupMap;

	private final int shortest;

	private final int longest;

	public LookupTranslator(java.lang.CharSequence[][] lookup) {
		lookupMap = new java.util.HashMap<java.lang.CharSequence, java.lang.CharSequence>();
		int _shortest = java.lang.Integer.MAX_VALUE;
		int _longest = 0;
		for (java.lang.CharSequence[] seq : lookup) {
			org.apache.commons.lang3.text.translate.LookupTranslator.this.lookupMap.put(seq[0], seq[1]);
			int sz = seq[0].length();
			if (sz < _shortest) {
				_shortest = sz;
			}
			if (sz > _longest) {
				_longest = sz;
			}
		}
		shortest = _shortest;
		longest = _longest;
	}

	@java.lang.Override
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


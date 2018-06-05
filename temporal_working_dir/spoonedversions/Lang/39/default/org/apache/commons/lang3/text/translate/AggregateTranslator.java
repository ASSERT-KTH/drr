

package org.apache.commons.lang3.text.translate;


public class AggregateTranslator extends org.apache.commons.lang3.text.translate.CharSequenceTranslator {
	private final org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators;

	public AggregateTranslator(org.apache.commons.lang3.text.translate.CharSequenceTranslator... translators) {
		this.translators = org.apache.commons.lang3.ArrayUtils.clone(translators);
	}

	@java.lang.Override
	public int translate(java.lang.CharSequence input, int index, java.io.Writer out) throws java.io.IOException {
		for (org.apache.commons.lang3.text.translate.CharSequenceTranslator translator : translators) {
			int consumed = translator.translate(input, index, out);
			if (consumed != 0) {
				return consumed;
			}
		}
		return 0;
	}
}




package org.apache.commons.lang.text.translate;


public class AggregateTranslator extends org.apache.commons.lang.text.translate.CharSequenceTranslator {
	private org.apache.commons.lang.text.translate.CharSequenceTranslator[] translators;

	public AggregateTranslator(org.apache.commons.lang.text.translate.CharSequenceTranslator... translators) {
		org.apache.commons.lang.text.translate.AggregateTranslator.this.translators = translators;
	}

	@java.lang.Override
	public int translate(java.lang.CharSequence input, int index, java.io.Writer out) throws java.io.IOException {
		for (org.apache.commons.lang.text.translate.CharSequenceTranslator translator : translators) {
			int consumed = translator.translate(input, index, out);
			if (consumed != 0) {
				return consumed;
			}
		}
		return 0;
	}
}




package org.apache.commons.lang.text.translate;


public class NumericEntityEscaper extends org.apache.commons.lang.text.translate.CodePointTranslator {
	private int below = 0;

	private int above = java.lang.Integer.MAX_VALUE;

	private boolean between = true;

	public static org.apache.commons.lang.text.translate.NumericEntityEscaper below(int codepoint) {
		return org.apache.commons.lang.text.translate.NumericEntityEscaper.outsideOf(codepoint, java.lang.Integer.MAX_VALUE);
	}

	public static org.apache.commons.lang.text.translate.NumericEntityEscaper above(int codepoint) {
		return org.apache.commons.lang.text.translate.NumericEntityEscaper.outsideOf(0, codepoint);
	}

	public static org.apache.commons.lang.text.translate.NumericEntityEscaper between(int codepointLow, int codepointHigh) {
		org.apache.commons.lang.text.translate.NumericEntityEscaper escaper = new org.apache.commons.lang.text.translate.NumericEntityEscaper();
		escaper.above = codepointHigh;
		escaper.below = codepointLow;
		return escaper;
	}

	public static org.apache.commons.lang.text.translate.NumericEntityEscaper outsideOf(int codepointLow, int codepointHigh) {
		org.apache.commons.lang.text.translate.NumericEntityEscaper escaper = new org.apache.commons.lang.text.translate.NumericEntityEscaper();
		escaper.above = codepointHigh;
		escaper.below = codepointLow;
		escaper.between = false;
		return escaper;
	}

	public boolean translate(int codepoint, java.io.Writer out) throws java.io.IOException {
		if (between) {
			if ((codepoint < (below)) || (codepoint > (above))) {
				return false;
			}
		}else {
			if ((codepoint >= (below)) && (codepoint <= (above))) {
				return false;
			}
		}
		out.write("&#");
		out.write(java.lang.Integer.toString(codepoint, 10));
		out.write(';');
		return true;
	}
}


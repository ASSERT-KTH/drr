

package org.apache.commons.lang.text.translate;


public class NumericEntityEscaper extends org.apache.commons.lang.text.translate.CodePointTranslator {
	private final int below;

	private final int above;

	private final boolean between;

	private NumericEntityEscaper(int below, int above, boolean between) {
		this.below = below;
		this.above = above;
		this.between = between;
	}

	public static org.apache.commons.lang.text.translate.NumericEntityEscaper below(int codepoint) {
		return org.apache.commons.lang.text.translate.NumericEntityEscaper.outsideOf(codepoint, java.lang.Integer.MAX_VALUE);
	}

	public static org.apache.commons.lang.text.translate.NumericEntityEscaper above(int codepoint) {
		return org.apache.commons.lang.text.translate.NumericEntityEscaper.outsideOf(0, codepoint);
	}

	public static org.apache.commons.lang.text.translate.NumericEntityEscaper between(int codepointLow, int codepointHigh) {
		return new org.apache.commons.lang.text.translate.NumericEntityEscaper(codepointLow, codepointHigh, true);
	}

	public static org.apache.commons.lang.text.translate.NumericEntityEscaper outsideOf(int codepointLow, int codepointHigh) {
		return new org.apache.commons.lang.text.translate.NumericEntityEscaper(codepointLow, codepointHigh, false);
	}

	@java.lang.Override
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


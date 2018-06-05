

package org.apache.commons.lang.text.translate;


public class UnicodeEscaper extends org.apache.commons.lang.text.translate.CodePointTranslator {
	private int below = 0;

	private int above = java.lang.Integer.MAX_VALUE;

	private boolean between = true;

	public static org.apache.commons.lang.text.translate.UnicodeEscaper below(int codepoint) {
		return org.apache.commons.lang.text.translate.UnicodeEscaper.outsideOf(codepoint, java.lang.Integer.MAX_VALUE);
	}

	public static org.apache.commons.lang.text.translate.UnicodeEscaper above(int codepoint) {
		return org.apache.commons.lang.text.translate.UnicodeEscaper.outsideOf(0, codepoint);
	}

	public static org.apache.commons.lang.text.translate.UnicodeEscaper outsideOf(int codepointLow, int codepointHigh) {
		org.apache.commons.lang.text.translate.UnicodeEscaper escaper = new org.apache.commons.lang.text.translate.UnicodeEscaper();
		escaper.above = codepointHigh;
		escaper.below = codepointLow;
		escaper.between = false;
		return escaper;
	}

	public static org.apache.commons.lang.text.translate.UnicodeEscaper between(int codepointLow, int codepointHigh) {
		org.apache.commons.lang.text.translate.UnicodeEscaper escaper = new org.apache.commons.lang.text.translate.UnicodeEscaper();
		escaper.above = codepointHigh;
		escaper.below = codepointLow;
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
		if (codepoint > 65535) {
			out.write(("\\u" + (org.apache.commons.lang.text.translate.CharSequenceTranslator.hex(codepoint))));
		}else
			if (codepoint > 4095) {
				out.write(("\\u" + (org.apache.commons.lang.text.translate.CharSequenceTranslator.hex(codepoint))));
			}else
				if (codepoint > 255) {
					out.write(("\\u0" + (org.apache.commons.lang.text.translate.CharSequenceTranslator.hex(codepoint))));
				}else
					if (codepoint > 15) {
						out.write(("\\u00" + (org.apache.commons.lang.text.translate.CharSequenceTranslator.hex(codepoint))));
					}else {
						out.write(("\\u000" + (org.apache.commons.lang.text.translate.CharSequenceTranslator.hex(codepoint))));
					}
				
			
		
		return true;
	}
}


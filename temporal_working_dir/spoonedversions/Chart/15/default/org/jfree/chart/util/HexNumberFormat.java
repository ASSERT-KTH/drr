

package org.jfree.chart.util;


public class HexNumberFormat extends java.text.NumberFormat {
	public static final int BYTE = 2;

	public static final int WORD = 4;

	public static final int DWORD = 8;

	public static final int QWORD = 16;

	private int m_numDigits = org.jfree.chart.util.HexNumberFormat.DWORD;

	public HexNumberFormat() {
		this(org.jfree.chart.util.HexNumberFormat.DWORD);
	}

	public HexNumberFormat(int digits) {
		super();
		org.jfree.chart.util.HexNumberFormat.this.m_numDigits = digits;
	}

	public final int getNumberOfDigits() {
		return org.jfree.chart.util.HexNumberFormat.this.m_numDigits;
	}

	public void setNumberOfDigits(int digits) {
		org.jfree.chart.util.HexNumberFormat.this.m_numDigits = digits;
	}

	public java.lang.StringBuffer format(double number, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) {
		return format(((long) (number)), toAppendTo, pos);
	}

	public java.lang.StringBuffer format(long number, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) {
		java.lang.String l_hex = java.lang.Long.toHexString(number).toUpperCase();
		int l_pad = (org.jfree.chart.util.HexNumberFormat.this.m_numDigits) - (l_hex.length());
		l_pad = (0 < l_pad) ? l_pad : 0;
		java.lang.StringBuffer l_extended = new java.lang.StringBuffer("0x");
		for (int i = 0; i < l_pad; i++) {
			l_extended.append(0);
		}
		l_extended.append(l_hex);
		return l_extended;
	}

	public java.lang.Number parse(java.lang.String source, java.text.ParsePosition parsePosition) {
		return null;
	}
}




package org.joda.time.format;


public class FormatUtils {
	private static final double LOG_10 = java.lang.Math.log(10);

	private FormatUtils() {
	}

	public static void appendPaddedInteger(java.lang.StringBuffer buf, int value, int size) {
		if (value < 0) {
			buf.append('-');
			if (value != (java.lang.Integer.MIN_VALUE)) {
				value = -value;
			}else {
				for (; size > 10; size--) {
					buf.append('0');
				}
				buf.append(("" + (-((long) (java.lang.Integer.MIN_VALUE)))));
				return ;
			}
		}
		if (value < 10) {
			for (; size > 1; size--) {
				buf.append('0');
			}
			buf.append(((char) (value + '0')));
		}else
			if (value < 100) {
				for (; size > 2; size--) {
					buf.append('0');
				}
				int d = ((value + 1) * 13421772) >> 27;
				buf.append(((char) (d + '0')));
				buf.append(((char) (((value - (d << 3)) - (d << 1)) + '0')));
			}else {
				int digits;
				if (value < 1000) {
					digits = 3;
				}else
					if (value < 10000) {
						digits = 4;
					}else {
						digits = ((int) ((java.lang.Math.log(value)) / (org.joda.time.format.FormatUtils.LOG_10))) + 1;
					}
				
				for (; size > digits; size--) {
					buf.append('0');
				}
				buf.append(java.lang.Integer.toString(value));
			}
		
	}

	public static void appendPaddedInteger(java.lang.StringBuffer buf, long value, int size) {
		int intValue = ((int) (value));
		if (intValue == value) {
			org.joda.time.format.FormatUtils.appendPaddedInteger(buf, intValue, size);
		}else
			if (size <= 19) {
				buf.append(java.lang.Long.toString(value));
			}else {
				if (value < 0) {
					buf.append('-');
					if (value != (java.lang.Long.MIN_VALUE)) {
						value = -value;
					}else {
						for (; size > 19; size--) {
							buf.append('0');
						}
						buf.append("9223372036854775808");
						return ;
					}
				}
				int digits = ((int) ((java.lang.Math.log(value)) / (org.joda.time.format.FormatUtils.LOG_10))) + 1;
				for (; size > digits; size--) {
					buf.append('0');
				}
				buf.append(java.lang.Long.toString(value));
			}
		
	}

	public static void writePaddedInteger(java.io.Writer out, int value, int size) throws java.io.IOException {
		if (value < 0) {
			out.write('-');
			if (value != (java.lang.Integer.MIN_VALUE)) {
				value = -value;
			}else {
				for (; size > 10; size--) {
					out.write('0');
				}
				out.write(("" + (-((long) (java.lang.Integer.MIN_VALUE)))));
				return ;
			}
		}
		if (value < 10) {
			for (; size > 1; size--) {
				out.write('0');
			}
			out.write((value + '0'));
		}else
			if (value < 100) {
				for (; size > 2; size--) {
					out.write('0');
				}
				int d = ((value + 1) * 13421772) >> 27;
				out.write((d + '0'));
				out.write((((value - (d << 3)) - (d << 1)) + '0'));
			}else {
				int digits;
				if (value < 1000) {
					digits = 3;
				}else
					if (value < 10000) {
						digits = 4;
					}else {
						digits = ((int) ((java.lang.Math.log(value)) / (org.joda.time.format.FormatUtils.LOG_10))) + 1;
					}
				
				for (; size > digits; size--) {
					out.write('0');
				}
				out.write(java.lang.Integer.toString(value));
			}
		
	}

	public static void writePaddedInteger(java.io.Writer out, long value, int size) throws java.io.IOException {
		int intValue = ((int) (value));
		if (intValue == value) {
			org.joda.time.format.FormatUtils.writePaddedInteger(out, intValue, size);
		}else
			if (size <= 19) {
				out.write(java.lang.Long.toString(value));
			}else {
				if (value < 0) {
					out.write('-');
					if (value != (java.lang.Long.MIN_VALUE)) {
						value = -value;
					}else {
						for (; size > 19; size--) {
							out.write('0');
						}
						out.write("9223372036854775808");
						return ;
					}
				}
				int digits = ((int) ((java.lang.Math.log(value)) / (org.joda.time.format.FormatUtils.LOG_10))) + 1;
				for (; size > digits; size--) {
					out.write('0');
				}
				out.write(java.lang.Long.toString(value));
			}
		
	}

	public static void appendUnpaddedInteger(java.lang.StringBuffer buf, int value) {
		if (value < 0) {
			buf.append('-');
			if (value != (java.lang.Integer.MIN_VALUE)) {
				value = -value;
			}else {
				buf.append(("" + (-((long) (java.lang.Integer.MIN_VALUE)))));
				return ;
			}
		}
		if (value < 10) {
			buf.append(((char) (value + '0')));
		}else
			if (value < 100) {
				int d = ((value + 1) * 13421772) >> 27;
				buf.append(((char) (d + '0')));
				buf.append(((char) (((value - (d << 3)) - (d << 1)) + '0')));
			}else {
				buf.append(java.lang.Integer.toString(value));
			}
		
	}

	public static void appendUnpaddedInteger(java.lang.StringBuffer buf, long value) {
		int intValue = ((int) (value));
		if (intValue == value) {
			org.joda.time.format.FormatUtils.appendUnpaddedInteger(buf, intValue);
		}else {
			buf.append(java.lang.Long.toString(value));
		}
	}

	public static void writeUnpaddedInteger(java.io.Writer out, int value) throws java.io.IOException {
		if (value < 0) {
			out.write('-');
			if (value != (java.lang.Integer.MIN_VALUE)) {
				value = -value;
			}else {
				out.write(("" + (-((long) (java.lang.Integer.MIN_VALUE)))));
				return ;
			}
		}
		if (value < 10) {
			out.write((value + '0'));
		}else
			if (value < 100) {
				int d = ((value + 1) * 13421772) >> 27;
				out.write((d + '0'));
				out.write((((value - (d << 3)) - (d << 1)) + '0'));
			}else {
				out.write(java.lang.Integer.toString(value));
			}
		
	}

	public static void writeUnpaddedInteger(java.io.Writer out, long value) throws java.io.IOException {
		int intValue = ((int) (value));
		if (intValue == value) {
			org.joda.time.format.FormatUtils.writeUnpaddedInteger(out, intValue);
		}else {
			out.write(java.lang.Long.toString(value));
		}
	}

	public static int calculateDigitCount(long value) {
		if (value < 0) {
			if (value != (java.lang.Long.MIN_VALUE)) {
				return (org.joda.time.format.FormatUtils.calculateDigitCount((-value))) + 1;
			}else {
				return 20;
			}
		}
		return value < 10 ? 1 : value < 100 ? 2 : value < 1000 ? 3 : value < 10000 ? 4 : ((int) ((java.lang.Math.log(value)) / (org.joda.time.format.FormatUtils.LOG_10))) + 1;
	}

	static int parseTwoDigits(java.lang.String text, int position) {
		int value = (text.charAt(position)) - '0';
		return (((value << 3) + (value << 1)) + (text.charAt((position + 1)))) - '0';
	}

	static java.lang.String createErrorMessage(final java.lang.String text, final int errorPos) {
		int sampleLen = errorPos + 32;
		java.lang.String sampleText;
		if ((text.length()) <= (sampleLen + 3)) {
			sampleText = text;
		}else {
			sampleText = text.substring(0, sampleLen).concat("...");
		}
		if (errorPos <= 0) {
			return ("Invalid format: \"" + sampleText) + '"';
		}
		if (errorPos >= (text.length())) {
			return ("Invalid format: \"" + sampleText) + "\" is too short";
		}
		return ((("Invalid format: \"" + sampleText) + "\" is malformed at \"") + (sampleText.substring(errorPos))) + '"';
	}
}


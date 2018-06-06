

package org.apache.commons.math.dfp;


public class DfpField implements org.apache.commons.math.Field<org.apache.commons.math.dfp.Dfp> {
	public enum RoundingMode {
ROUND_DOWN, ROUND_UP, ROUND_HALF_UP, ROUND_HALF_DOWN, ROUND_HALF_EVEN, ROUND_HALF_ODD, ROUND_CEIL, ROUND_FLOOR;	}

	public static final int FLAG_INVALID = 1;

	public static final int FLAG_DIV_ZERO = 2;

	public static final int FLAG_OVERFLOW = 4;

	public static final int FLAG_UNDERFLOW = 8;

	public static final int FLAG_INEXACT = 16;

	private static java.lang.String sqr2String;

	private static java.lang.String sqr2ReciprocalString;

	private static java.lang.String sqr3String;

	private static java.lang.String sqr3ReciprocalString;

	private static java.lang.String piString;

	private static java.lang.String eString;

	private static java.lang.String ln2String;

	private static java.lang.String ln5String;

	private static java.lang.String ln10String;

	private final int radixDigits;

	private final org.apache.commons.math.dfp.Dfp zero;

	private final org.apache.commons.math.dfp.Dfp one;

	private final org.apache.commons.math.dfp.Dfp two;

	private final org.apache.commons.math.dfp.Dfp sqr2;

	private final org.apache.commons.math.dfp.Dfp[] sqr2Split;

	private final org.apache.commons.math.dfp.Dfp sqr2Reciprocal;

	private final org.apache.commons.math.dfp.Dfp sqr3;

	private final org.apache.commons.math.dfp.Dfp sqr3Reciprocal;

	private final org.apache.commons.math.dfp.Dfp pi;

	private final org.apache.commons.math.dfp.Dfp[] piSplit;

	private final org.apache.commons.math.dfp.Dfp e;

	private final org.apache.commons.math.dfp.Dfp[] eSplit;

	private final org.apache.commons.math.dfp.Dfp ln2;

	private final org.apache.commons.math.dfp.Dfp[] ln2Split;

	private final org.apache.commons.math.dfp.Dfp ln5;

	private final org.apache.commons.math.dfp.Dfp[] ln5Split;

	private final org.apache.commons.math.dfp.Dfp ln10;

	private org.apache.commons.math.dfp.DfpField.RoundingMode rMode;

	private int ieeeFlags;

	public DfpField(final int decimalDigits) {
		this(decimalDigits, true);
	}

	private DfpField(final int decimalDigits, final boolean computeConstants) {
		this.radixDigits = (decimalDigits < 13) ? 4 : (decimalDigits + 3) / 4;
		org.apache.commons.math.dfp.DfpField.this.rMode = org.apache.commons.math.dfp.DfpField.RoundingMode.ROUND_HALF_EVEN;
		org.apache.commons.math.dfp.DfpField.this.ieeeFlags = 0;
		this.zero = new org.apache.commons.math.dfp.Dfp(org.apache.commons.math.dfp.DfpField.this, 0);
		this.one = new org.apache.commons.math.dfp.Dfp(org.apache.commons.math.dfp.DfpField.this, 1);
		this.two = new org.apache.commons.math.dfp.Dfp(org.apache.commons.math.dfp.DfpField.this, 2);
		if (computeConstants) {
			synchronized(org.apache.commons.math.dfp.DfpField.class) {
				org.apache.commons.math.dfp.DfpField.computeStringConstants((decimalDigits < 67 ? 200 : 3 * decimalDigits));
				sqr2 = new org.apache.commons.math.dfp.Dfp(org.apache.commons.math.dfp.DfpField.this, org.apache.commons.math.dfp.DfpField.sqr2String);
				sqr2Split = split(org.apache.commons.math.dfp.DfpField.sqr2String);
				sqr2Reciprocal = new org.apache.commons.math.dfp.Dfp(org.apache.commons.math.dfp.DfpField.this, org.apache.commons.math.dfp.DfpField.sqr2ReciprocalString);
				sqr3 = new org.apache.commons.math.dfp.Dfp(org.apache.commons.math.dfp.DfpField.this, org.apache.commons.math.dfp.DfpField.sqr3String);
				sqr3Reciprocal = new org.apache.commons.math.dfp.Dfp(org.apache.commons.math.dfp.DfpField.this, org.apache.commons.math.dfp.DfpField.sqr3ReciprocalString);
				pi = new org.apache.commons.math.dfp.Dfp(org.apache.commons.math.dfp.DfpField.this, org.apache.commons.math.dfp.DfpField.piString);
				piSplit = split(org.apache.commons.math.dfp.DfpField.piString);
				e = new org.apache.commons.math.dfp.Dfp(org.apache.commons.math.dfp.DfpField.this, org.apache.commons.math.dfp.DfpField.eString);
				eSplit = split(org.apache.commons.math.dfp.DfpField.eString);
				ln2 = new org.apache.commons.math.dfp.Dfp(org.apache.commons.math.dfp.DfpField.this, org.apache.commons.math.dfp.DfpField.ln2String);
				ln2Split = split(org.apache.commons.math.dfp.DfpField.ln2String);
				ln5 = new org.apache.commons.math.dfp.Dfp(org.apache.commons.math.dfp.DfpField.this, org.apache.commons.math.dfp.DfpField.ln5String);
				ln5Split = split(org.apache.commons.math.dfp.DfpField.ln5String);
				ln10 = new org.apache.commons.math.dfp.Dfp(org.apache.commons.math.dfp.DfpField.this, org.apache.commons.math.dfp.DfpField.ln10String);
			}
		}else {
			sqr2 = null;
			sqr2Split = null;
			sqr2Reciprocal = null;
			sqr3 = null;
			sqr3Reciprocal = null;
			pi = null;
			piSplit = null;
			e = null;
			eSplit = null;
			ln2 = null;
			ln2Split = null;
			ln5 = null;
			ln5Split = null;
			ln10 = null;
		}
	}

	public int getRadixDigits() {
		return radixDigits;
	}

	public void setRoundingMode(final org.apache.commons.math.dfp.DfpField.RoundingMode mode) {
		rMode = mode;
	}

	public org.apache.commons.math.dfp.DfpField.RoundingMode getRoundingMode() {
		return rMode;
	}

	public int getIEEEFlags() {
		return ieeeFlags;
	}

	public void clearIEEEFlags() {
		ieeeFlags = 0;
	}

	public void setIEEEFlags(final int flags) {
		ieeeFlags = flags & (((((org.apache.commons.math.dfp.DfpField.FLAG_INVALID) | (org.apache.commons.math.dfp.DfpField.FLAG_DIV_ZERO)) | (org.apache.commons.math.dfp.DfpField.FLAG_OVERFLOW)) | (org.apache.commons.math.dfp.DfpField.FLAG_UNDERFLOW)) | (org.apache.commons.math.dfp.DfpField.FLAG_INEXACT));
	}

	public void setIEEEFlagsBits(final int bits) {
		ieeeFlags |= bits & (((((org.apache.commons.math.dfp.DfpField.FLAG_INVALID) | (org.apache.commons.math.dfp.DfpField.FLAG_DIV_ZERO)) | (org.apache.commons.math.dfp.DfpField.FLAG_OVERFLOW)) | (org.apache.commons.math.dfp.DfpField.FLAG_UNDERFLOW)) | (org.apache.commons.math.dfp.DfpField.FLAG_INEXACT));
	}

	public org.apache.commons.math.dfp.Dfp newDfp() {
		return new org.apache.commons.math.dfp.Dfp(org.apache.commons.math.dfp.DfpField.this);
	}

	public org.apache.commons.math.dfp.Dfp newDfp(final byte x) {
		return new org.apache.commons.math.dfp.Dfp(org.apache.commons.math.dfp.DfpField.this, x);
	}

	public org.apache.commons.math.dfp.Dfp newDfp(final int x) {
		return new org.apache.commons.math.dfp.Dfp(org.apache.commons.math.dfp.DfpField.this, x);
	}

	public org.apache.commons.math.dfp.Dfp newDfp(final long x) {
		return new org.apache.commons.math.dfp.Dfp(org.apache.commons.math.dfp.DfpField.this, x);
	}

	public org.apache.commons.math.dfp.Dfp newDfp(final double x) {
		return new org.apache.commons.math.dfp.Dfp(org.apache.commons.math.dfp.DfpField.this, x);
	}

	public org.apache.commons.math.dfp.Dfp newDfp(org.apache.commons.math.dfp.Dfp d) {
		return new org.apache.commons.math.dfp.Dfp(d);
	}

	public org.apache.commons.math.dfp.Dfp newDfp(final java.lang.String s) {
		return new org.apache.commons.math.dfp.Dfp(org.apache.commons.math.dfp.DfpField.this, s);
	}

	public org.apache.commons.math.dfp.Dfp newDfp(final byte sign, final byte nans) {
		return new org.apache.commons.math.dfp.Dfp(org.apache.commons.math.dfp.DfpField.this, sign, nans);
	}

	public org.apache.commons.math.dfp.Dfp getZero() {
		return zero;
	}

	public org.apache.commons.math.dfp.Dfp getOne() {
		return one;
	}

	public java.lang.Class<? extends org.apache.commons.math.FieldElement<org.apache.commons.math.dfp.Dfp>> getRuntimeClass() {
		return org.apache.commons.math.dfp.Dfp.class;
	}

	public org.apache.commons.math.dfp.Dfp getTwo() {
		return two;
	}

	public org.apache.commons.math.dfp.Dfp getSqr2() {
		return sqr2;
	}

	public org.apache.commons.math.dfp.Dfp[] getSqr2Split() {
		return sqr2Split.clone();
	}

	public org.apache.commons.math.dfp.Dfp getSqr2Reciprocal() {
		return sqr2Reciprocal;
	}

	public org.apache.commons.math.dfp.Dfp getSqr3() {
		return sqr3;
	}

	public org.apache.commons.math.dfp.Dfp getSqr3Reciprocal() {
		return sqr3Reciprocal;
	}

	public org.apache.commons.math.dfp.Dfp getPi() {
		return pi;
	}

	public org.apache.commons.math.dfp.Dfp[] getPiSplit() {
		return piSplit.clone();
	}

	public org.apache.commons.math.dfp.Dfp getE() {
		return e;
	}

	public org.apache.commons.math.dfp.Dfp[] getESplit() {
		return eSplit.clone();
	}

	public org.apache.commons.math.dfp.Dfp getLn2() {
		return ln2;
	}

	public org.apache.commons.math.dfp.Dfp[] getLn2Split() {
		return ln2Split.clone();
	}

	public org.apache.commons.math.dfp.Dfp getLn5() {
		return ln5;
	}

	public org.apache.commons.math.dfp.Dfp[] getLn5Split() {
		return ln5Split.clone();
	}

	public org.apache.commons.math.dfp.Dfp getLn10() {
		return ln10;
	}

	private org.apache.commons.math.dfp.Dfp[] split(final java.lang.String a) {
		org.apache.commons.math.dfp.Dfp[] result = new org.apache.commons.math.dfp.Dfp[2];
		boolean leading = true;
		int sp = 0;
		int sig = 0;
		char[] buf = new char[a.length()];
		for (int i = 0; i < (buf.length); i++) {
			buf[i] = a.charAt(i);
			if (((buf[i]) >= '1') && ((buf[i]) <= '9')) {
				leading = false;
			}
			if ((buf[i]) == '.') {
				sig += (400 - sig) % 4;
				leading = false;
			}
			if (sig == (((radixDigits) / 2) * 4)) {
				sp = i;
				break;
			}
			if ((((buf[i]) >= '0') && ((buf[i]) <= '9')) && (!leading)) {
				sig++;
			}
		}
		result[0] = new org.apache.commons.math.dfp.Dfp(org.apache.commons.math.dfp.DfpField.this, new java.lang.String(buf, 0, sp));
		for (int i = 0; i < (buf.length); i++) {
			buf[i] = a.charAt(i);
			if ((((buf[i]) >= '0') && ((buf[i]) <= '9')) && (i < sp)) {
				buf[i] = '0';
			}
		}
		result[1] = new org.apache.commons.math.dfp.Dfp(org.apache.commons.math.dfp.DfpField.this, new java.lang.String(buf));
		return result;
	}

	private static void computeStringConstants(final int highPrecisionDecimalDigits) {
		if (((org.apache.commons.math.dfp.DfpField.sqr2String) == null) || ((org.apache.commons.math.dfp.DfpField.sqr2String.length()) < (highPrecisionDecimalDigits - 3))) {
			final org.apache.commons.math.dfp.DfpField highPrecisionField = new org.apache.commons.math.dfp.DfpField(highPrecisionDecimalDigits, false);
			final org.apache.commons.math.dfp.Dfp highPrecisionOne = new org.apache.commons.math.dfp.Dfp(highPrecisionField, 1);
			final org.apache.commons.math.dfp.Dfp highPrecisionTwo = new org.apache.commons.math.dfp.Dfp(highPrecisionField, 2);
			final org.apache.commons.math.dfp.Dfp highPrecisionThree = new org.apache.commons.math.dfp.Dfp(highPrecisionField, 3);
			final org.apache.commons.math.dfp.Dfp highPrecisionSqr2 = highPrecisionTwo.sqrt();
			org.apache.commons.math.dfp.DfpField.sqr2String = highPrecisionSqr2.toString();
			org.apache.commons.math.dfp.DfpField.sqr2ReciprocalString = highPrecisionOne.divide(highPrecisionSqr2).toString();
			final org.apache.commons.math.dfp.Dfp highPrecisionSqr3 = highPrecisionThree.sqrt();
			org.apache.commons.math.dfp.DfpField.sqr3String = highPrecisionSqr3.toString();
			org.apache.commons.math.dfp.DfpField.sqr3ReciprocalString = highPrecisionOne.divide(highPrecisionSqr3).toString();
			org.apache.commons.math.dfp.DfpField.piString = org.apache.commons.math.dfp.DfpField.computePi(highPrecisionOne, highPrecisionTwo, highPrecisionThree).toString();
			org.apache.commons.math.dfp.DfpField.eString = org.apache.commons.math.dfp.DfpField.computeExp(highPrecisionOne, highPrecisionOne).toString();
			org.apache.commons.math.dfp.DfpField.ln2String = org.apache.commons.math.dfp.DfpField.computeLn(highPrecisionTwo, highPrecisionOne, highPrecisionTwo).toString();
			org.apache.commons.math.dfp.DfpField.ln5String = org.apache.commons.math.dfp.DfpField.computeLn(new org.apache.commons.math.dfp.Dfp(highPrecisionField, 5), highPrecisionOne, highPrecisionTwo).toString();
			org.apache.commons.math.dfp.DfpField.ln10String = org.apache.commons.math.dfp.DfpField.computeLn(new org.apache.commons.math.dfp.Dfp(highPrecisionField, 10), highPrecisionOne, highPrecisionTwo).toString();
		}
	}

	private static org.apache.commons.math.dfp.Dfp computePi(final org.apache.commons.math.dfp.Dfp one, final org.apache.commons.math.dfp.Dfp two, final org.apache.commons.math.dfp.Dfp three) {
		org.apache.commons.math.dfp.Dfp sqrt2 = two.sqrt();
		org.apache.commons.math.dfp.Dfp yk = sqrt2.subtract(one);
		org.apache.commons.math.dfp.Dfp four = two.add(two);
		org.apache.commons.math.dfp.Dfp two2kp3 = two;
		org.apache.commons.math.dfp.Dfp ak = two.multiply(three.subtract(two.multiply(sqrt2)));
		for (int i = 1; i < 20; i++) {
			final org.apache.commons.math.dfp.Dfp ykM1 = yk;
			final org.apache.commons.math.dfp.Dfp y2 = yk.multiply(yk);
			final org.apache.commons.math.dfp.Dfp oneMinusY4 = one.subtract(y2.multiply(y2));
			final org.apache.commons.math.dfp.Dfp s = oneMinusY4.sqrt().sqrt();
			yk = one.subtract(s).divide(one.add(s));
			two2kp3 = two2kp3.multiply(four);
			final org.apache.commons.math.dfp.Dfp p = one.add(yk);
			final org.apache.commons.math.dfp.Dfp p2 = p.multiply(p);
			ak = ak.multiply(p2.multiply(p2)).subtract(two2kp3.multiply(yk).multiply(one.add(yk).add(yk.multiply(yk))));
			if (yk.equals(ykM1)) {
				break;
			}
		}
		return one.divide(ak);
	}

	public static org.apache.commons.math.dfp.Dfp computeExp(final org.apache.commons.math.dfp.Dfp a, final org.apache.commons.math.dfp.Dfp one) {
		org.apache.commons.math.dfp.Dfp y = new org.apache.commons.math.dfp.Dfp(one);
		org.apache.commons.math.dfp.Dfp py = new org.apache.commons.math.dfp.Dfp(one);
		org.apache.commons.math.dfp.Dfp f = new org.apache.commons.math.dfp.Dfp(one);
		org.apache.commons.math.dfp.Dfp fi = new org.apache.commons.math.dfp.Dfp(one);
		org.apache.commons.math.dfp.Dfp x = new org.apache.commons.math.dfp.Dfp(one);
		for (int i = 0; i < 10000; i++) {
			x = x.multiply(a);
			y = y.add(x.divide(f));
			fi = fi.add(one);
			f = f.multiply(fi);
			if (y.equals(py)) {
				break;
			}
			py = new org.apache.commons.math.dfp.Dfp(y);
		}
		return y;
	}

	public static org.apache.commons.math.dfp.Dfp computeLn(final org.apache.commons.math.dfp.Dfp a, final org.apache.commons.math.dfp.Dfp one, final org.apache.commons.math.dfp.Dfp two) {
		int den = 1;
		org.apache.commons.math.dfp.Dfp x = a.add(new org.apache.commons.math.dfp.Dfp(a.getField(), (-1))).divide(a.add(one));
		org.apache.commons.math.dfp.Dfp y = new org.apache.commons.math.dfp.Dfp(x);
		org.apache.commons.math.dfp.Dfp num = new org.apache.commons.math.dfp.Dfp(x);
		org.apache.commons.math.dfp.Dfp py = new org.apache.commons.math.dfp.Dfp(y);
		for (int i = 0; i < 10000; i++) {
			num = num.multiply(x);
			num = num.multiply(x);
			den = den + 2;
			org.apache.commons.math.dfp.Dfp t = num.divide(den);
			y = y.add(t);
			if (y.equals(py)) {
				break;
			}
			py = new org.apache.commons.math.dfp.Dfp(y);
		}
		return y.multiply(two);
	}
}




package org.apache.commons.math.dfp;


public class Dfp implements org.apache.commons.math.FieldElement<org.apache.commons.math.dfp.Dfp> {
	public static final int RADIX = 10000;

	public static final int MIN_EXP = -32767;

	public static final int MAX_EXP = 32768;

	public static final int ERR_SCALE = 32760;

	public static final byte FINITE = 0;

	public static final byte INFINITE = 1;

	public static final byte SNAN = 2;

	public static final byte QNAN = 3;

	private static final java.lang.String NAN_STRING = "NaN";

	private static final java.lang.String POS_INFINITY_STRING = "Infinity";

	private static final java.lang.String NEG_INFINITY_STRING = "-Infinity";

	private static final java.lang.String ADD_TRAP = "add";

	private static final java.lang.String MULTIPLY_TRAP = "multiply";

	private static final java.lang.String DIVIDE_TRAP = "divide";

	private static final java.lang.String SQRT_TRAP = "sqrt";

	private static final java.lang.String ALIGN_TRAP = "align";

	private static final java.lang.String TRUNC_TRAP = "trunc";

	private static final java.lang.String NEXT_AFTER_TRAP = "nextAfter";

	private static final java.lang.String LESS_THAN_TRAP = "lessThan";

	private static final java.lang.String GREATER_THAN_TRAP = "greaterThan";

	private static final java.lang.String NEW_INSTANCE_TRAP = "newInstance";

	protected int[] mant;

	protected byte sign;

	protected int exp;

	protected byte nans;

	private final org.apache.commons.math.dfp.DfpField field;

	protected Dfp(final org.apache.commons.math.dfp.DfpField field) {
		mant = new int[field.getRadixDigits()];
		sign = 1;
		exp = 0;
		nans = org.apache.commons.math.dfp.Dfp.FINITE;
		this.field = field;
	}

	protected Dfp(final org.apache.commons.math.dfp.DfpField field, byte x) {
		this(field, ((long) (x)));
	}

	protected Dfp(final org.apache.commons.math.dfp.DfpField field, int x) {
		this(field, ((long) (x)));
	}

	protected Dfp(final org.apache.commons.math.dfp.DfpField field, long x) {
		mant = new int[field.getRadixDigits()];
		nans = org.apache.commons.math.dfp.Dfp.FINITE;
		this.field = field;
		boolean isLongMin = false;
		if (x == (java.lang.Long.MIN_VALUE)) {
			isLongMin = true;
			++x;
		}
		if (x < 0) {
			sign = -1;
			x = -x;
		}else {
			sign = 1;
		}
		exp = 0;
		while (x != 0) {
			java.lang.System.arraycopy(mant, ((mant.length) - (exp)), mant, (((mant.length) - 1) - (exp)), exp);
			mant[((mant.length) - 1)] = ((int) (x % (org.apache.commons.math.dfp.Dfp.RADIX)));
			x /= org.apache.commons.math.dfp.Dfp.RADIX;
			(exp)++;
		} 
		if (isLongMin) {
			for (int i = 0; i < ((mant.length) - 1); i++) {
				if ((mant[i]) != 0) {
					(mant[i])++;
					break;
				}
			}
		}
	}

	protected Dfp(final org.apache.commons.math.dfp.DfpField field, double x) {
		mant = new int[field.getRadixDigits()];
		sign = 1;
		exp = 0;
		nans = org.apache.commons.math.dfp.Dfp.FINITE;
		this.field = field;
		long bits = java.lang.Double.doubleToLongBits(x);
		long mantissa = bits & 4503599627370495L;
		int exponent = ((int) ((bits & 9218868437227405312L) >> 52)) - 1023;
		if (exponent == (-1023)) {
			if (x == 0) {
				if ((bits & -9223372036854775808L) != 0) {
					sign = -1;
				}
				return ;
			}
			exponent++;
			while ((mantissa & 4503599627370496L) == 0) {
				exponent--;
				mantissa <<= 1;
			} 
			mantissa &= 4503599627370495L;
		}
		if (exponent == 1024) {
			if (x != x) {
				sign = ((byte) (1));
				nans = org.apache.commons.math.dfp.Dfp.QNAN;
			}else
				if (x < 0) {
					sign = ((byte) (-1));
					nans = org.apache.commons.math.dfp.Dfp.INFINITE;
				}else {
					sign = ((byte) (1));
					nans = org.apache.commons.math.dfp.Dfp.INFINITE;
				}
			
			return ;
		}
		org.apache.commons.math.dfp.Dfp xdfp = new org.apache.commons.math.dfp.Dfp(field, mantissa);
		xdfp = xdfp.divide(new org.apache.commons.math.dfp.Dfp(field, 4503599627370496L)).add(field.getOne());
		xdfp = xdfp.multiply(org.apache.commons.math.dfp.DfpMath.pow(field.getTwo(), exponent));
		if ((bits & -9223372036854775808L) != 0) {
			xdfp = xdfp.negate();
		}
		java.lang.System.arraycopy(xdfp.mant, 0, mant, 0, mant.length);
		sign = xdfp.sign;
		exp = xdfp.exp;
		nans = xdfp.nans;
	}

	public Dfp(final org.apache.commons.math.dfp.Dfp d) {
		mant = d.mant.clone();
		sign = d.sign;
		exp = d.exp;
		nans = d.nans;
		field = d.field;
	}

	protected Dfp(final org.apache.commons.math.dfp.DfpField field, final java.lang.String s) {
		mant = new int[field.getRadixDigits()];
		sign = 1;
		exp = 0;
		nans = org.apache.commons.math.dfp.Dfp.FINITE;
		this.field = field;
		boolean decimalFound = false;
		final int rsize = 4;
		final int offset = 4;
		final char[] striped = new char[((getRadixDigits()) * rsize) + (offset * 2)];
		if (s.equals(org.apache.commons.math.dfp.Dfp.POS_INFINITY_STRING)) {
			sign = ((byte) (1));
			nans = org.apache.commons.math.dfp.Dfp.INFINITE;
			return ;
		}
		if (s.equals(org.apache.commons.math.dfp.Dfp.NEG_INFINITY_STRING)) {
			sign = ((byte) (-1));
			nans = org.apache.commons.math.dfp.Dfp.INFINITE;
			return ;
		}
		if (s.equals(org.apache.commons.math.dfp.Dfp.NAN_STRING)) {
			sign = ((byte) (1));
			nans = org.apache.commons.math.dfp.Dfp.QNAN;
			return ;
		}
		int p = s.indexOf("e");
		if (p == (-1)) {
			p = s.indexOf("E");
		}
		final java.lang.String fpdecimal;
		int sciexp = 0;
		if (p != (-1)) {
			fpdecimal = s.substring(0, p);
			java.lang.String fpexp = s.substring((p + 1));
			boolean negative = false;
			for (int i = 0; i < (fpexp.length()); i++) {
				if ((fpexp.charAt(i)) == '-') {
					negative = true;
					continue;
				}
				if (((fpexp.charAt(i)) >= '0') && ((fpexp.charAt(i)) <= '9')) {
					sciexp = ((sciexp * 10) + (fpexp.charAt(i))) - '0';
				}
			}
			if (negative) {
				sciexp = -sciexp;
			}
		}else {
			fpdecimal = s;
		}
		if ((fpdecimal.indexOf("-")) != (-1)) {
			sign = -1;
		}
		p = 0;
		int decimalPos = 0;
		for (; ;) {
			if (((fpdecimal.charAt(p)) >= '1') && ((fpdecimal.charAt(p)) <= '9')) {
				break;
			}
			if (decimalFound && ((fpdecimal.charAt(p)) == '0')) {
				decimalPos--;
			}
			if ((fpdecimal.charAt(p)) == '.') {
				decimalFound = true;
			}
			p++;
			if (p == (fpdecimal.length())) {
				break;
			}
		}
		int q = offset;
		striped[0] = '0';
		striped[1] = '0';
		striped[2] = '0';
		striped[3] = '0';
		int significantDigits = 0;
		for (; ;) {
			if (p == (fpdecimal.length())) {
				break;
			}
			if (q == ((((mant.length) * rsize) + offset) + 1)) {
				break;
			}
			if ((fpdecimal.charAt(p)) == '.') {
				decimalFound = true;
				decimalPos = significantDigits;
				p++;
				continue;
			}
			if (((fpdecimal.charAt(p)) < '0') || ((fpdecimal.charAt(p)) > '9')) {
				p++;
				continue;
			}
			striped[q] = fpdecimal.charAt(p);
			q++;
			p++;
			significantDigits++;
		}
		if (decimalFound && (q != offset)) {
			for (; ;) {
				q--;
				if (q == offset) {
					break;
				}
				if ((striped[q]) == '0') {
					significantDigits--;
				}else {
					break;
				}
			}
		}
		if (decimalFound && (significantDigits == 0)) {
			decimalPos = 0;
		}
		if (!decimalFound) {
			decimalPos = q - offset;
		}
		q = offset;
		p = (significantDigits - 1) + offset;
		while (p > q) {
			if ((striped[p]) != '0') {
				break;
			}
			p--;
		} 
		int i = (((rsize * 100) - decimalPos) - (sciexp % rsize)) % rsize;
		q -= i;
		decimalPos += i;
		while ((p - q) < ((mant.length) * rsize)) {
			for (i = 0; i < rsize; i++) {
				striped[(++p)] = '0';
			}
		} 
		for (i = (mant.length) - 1; i >= 0; i--) {
			mant[i] = (((((striped[q]) - '0') * 1000) + (((striped[(q + 1)]) - '0') * 100)) + (((striped[(q + 2)]) - '0') * 10)) + ((striped[(q + 3)]) - '0');
			q += 4;
		}
		exp = (decimalPos + sciexp) / rsize;
		if (q < (striped.length)) {
			round((((striped[q]) - '0') * 1000));
		}
	}

	protected Dfp(final org.apache.commons.math.dfp.DfpField field, final byte sign, final byte nans) {
		this.field = field;
		org.apache.commons.math.dfp.Dfp.this.mant = new int[field.getRadixDigits()];
		org.apache.commons.math.dfp.Dfp.this.sign = sign;
		org.apache.commons.math.dfp.Dfp.this.exp = 0;
		org.apache.commons.math.dfp.Dfp.this.nans = nans;
	}

	public org.apache.commons.math.dfp.Dfp newInstance() {
		return new org.apache.commons.math.dfp.Dfp(getField());
	}

	public org.apache.commons.math.dfp.Dfp newInstance(final byte x) {
		return new org.apache.commons.math.dfp.Dfp(getField(), x);
	}

	public org.apache.commons.math.dfp.Dfp newInstance(final int x) {
		return new org.apache.commons.math.dfp.Dfp(getField(), x);
	}

	public org.apache.commons.math.dfp.Dfp newInstance(final long x) {
		return new org.apache.commons.math.dfp.Dfp(getField(), x);
	}

	public org.apache.commons.math.dfp.Dfp newInstance(final double x) {
		return new org.apache.commons.math.dfp.Dfp(getField(), x);
	}

	public org.apache.commons.math.dfp.Dfp newInstance(final org.apache.commons.math.dfp.Dfp d) {
		if ((field.getRadixDigits()) != (d.field.getRadixDigits())) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
			final org.apache.commons.math.dfp.Dfp result = newInstance(getZero());
			result.nans = org.apache.commons.math.dfp.Dfp.QNAN;
			return dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.Dfp.NEW_INSTANCE_TRAP, d, result);
		}
		return new org.apache.commons.math.dfp.Dfp(d);
	}

	public org.apache.commons.math.dfp.Dfp newInstance(final java.lang.String s) {
		return new org.apache.commons.math.dfp.Dfp(field, s);
	}

	public org.apache.commons.math.dfp.Dfp newInstance(final byte sig, final byte code) {
		return field.newDfp(sig, code);
	}

	public org.apache.commons.math.dfp.DfpField getField() {
		return field;
	}

	public int getRadixDigits() {
		return field.getRadixDigits();
	}

	public org.apache.commons.math.dfp.Dfp getZero() {
		return field.getZero();
	}

	public org.apache.commons.math.dfp.Dfp getOne() {
		return field.getOne();
	}

	public org.apache.commons.math.dfp.Dfp getTwo() {
		return field.getTwo();
	}

	protected void shiftLeft() {
		for (int i = (mant.length) - 1; i > 0; i--) {
			mant[i] = mant[(i - 1)];
		}
		mant[0] = 0;
		(exp)--;
	}

	protected void shiftRight() {
		for (int i = 0; i < ((mant.length) - 1); i++) {
			mant[i] = mant[(i + 1)];
		}
		mant[((mant.length) - 1)] = 0;
		(exp)++;
	}

	protected int align(int e) {
		int lostdigit = 0;
		boolean inexact = false;
		int diff = (exp) - e;
		int adiff = diff;
		if (adiff < 0) {
			adiff = -adiff;
		}
		if (diff == 0) {
			return 0;
		}
		if (adiff > ((mant.length) + 1)) {
			java.util.Arrays.fill(mant, 0);
			exp = e;
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INEXACT);
			dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INEXACT, org.apache.commons.math.dfp.Dfp.ALIGN_TRAP, org.apache.commons.math.dfp.Dfp.this, org.apache.commons.math.dfp.Dfp.this);
			return 0;
		}
		for (int i = 0; i < adiff; i++) {
			if (diff < 0) {
				if (lostdigit != 0) {
					inexact = true;
				}
				lostdigit = mant[0];
				shiftRight();
			}else {
				shiftLeft();
			}
		}
		if (inexact) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INEXACT);
			dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INEXACT, org.apache.commons.math.dfp.Dfp.ALIGN_TRAP, org.apache.commons.math.dfp.Dfp.this, org.apache.commons.math.dfp.Dfp.this);
		}
		return lostdigit;
	}

	public boolean lessThan(final org.apache.commons.math.dfp.Dfp x) {
		if ((field.getRadixDigits()) != (x.field.getRadixDigits())) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
			final org.apache.commons.math.dfp.Dfp result = newInstance(getZero());
			result.nans = org.apache.commons.math.dfp.Dfp.QNAN;
			dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.Dfp.LESS_THAN_TRAP, x, result);
			return false;
		}
		if ((isNaN()) || (x.isNaN())) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
			dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.Dfp.LESS_THAN_TRAP, x, newInstance(getZero()));
			return false;
		}
		return (org.apache.commons.math.dfp.Dfp.compare(org.apache.commons.math.dfp.Dfp.this, x)) < 0;
	}

	public boolean greaterThan(final org.apache.commons.math.dfp.Dfp x) {
		if ((field.getRadixDigits()) != (x.field.getRadixDigits())) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
			final org.apache.commons.math.dfp.Dfp result = newInstance(getZero());
			result.nans = org.apache.commons.math.dfp.Dfp.QNAN;
			dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.Dfp.GREATER_THAN_TRAP, x, result);
			return false;
		}
		if ((isNaN()) || (x.isNaN())) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
			dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.Dfp.GREATER_THAN_TRAP, x, newInstance(getZero()));
			return false;
		}
		return (org.apache.commons.math.dfp.Dfp.compare(org.apache.commons.math.dfp.Dfp.this, x)) > 0;
	}

	public boolean negativeOrNull() {
		if (isNaN()) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
			dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.Dfp.LESS_THAN_TRAP, org.apache.commons.math.dfp.Dfp.this, newInstance(getZero()));
			return false;
		}
		return ((sign) < 0) || (((mant[((mant.length) - 1)]) == 0) && (!(isInfinite())));
	}

	public boolean strictlyNegative() {
		if (isNaN()) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
			dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.Dfp.LESS_THAN_TRAP, org.apache.commons.math.dfp.Dfp.this, newInstance(getZero()));
			return false;
		}
		return ((sign) < 0) && (((mant[((mant.length) - 1)]) != 0) || (isInfinite()));
	}

	public boolean positiveOrNull() {
		if (isNaN()) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
			dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.Dfp.LESS_THAN_TRAP, org.apache.commons.math.dfp.Dfp.this, newInstance(getZero()));
			return false;
		}
		return ((sign) > 0) || (((mant[((mant.length) - 1)]) == 0) && (!(isInfinite())));
	}

	public boolean strictlyPositive() {
		if (isNaN()) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
			dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.Dfp.LESS_THAN_TRAP, org.apache.commons.math.dfp.Dfp.this, newInstance(getZero()));
			return false;
		}
		return ((sign) > 0) && (((mant[((mant.length) - 1)]) != 0) || (isInfinite()));
	}

	public org.apache.commons.math.dfp.Dfp abs() {
		org.apache.commons.math.dfp.Dfp result = newInstance(org.apache.commons.math.dfp.Dfp.this);
		result.sign = 1;
		return result;
	}

	public boolean isInfinite() {
		return (nans) == (org.apache.commons.math.dfp.Dfp.INFINITE);
	}

	public boolean isNaN() {
		return ((nans) == (org.apache.commons.math.dfp.Dfp.QNAN)) || ((nans) == (org.apache.commons.math.dfp.Dfp.SNAN));
	}

	public boolean isZero() {
		if (isNaN()) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
			dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.Dfp.LESS_THAN_TRAP, org.apache.commons.math.dfp.Dfp.this, newInstance(getZero()));
			return false;
		}
		return ((mant[((mant.length) - 1)]) == 0) && (!(isInfinite()));
	}

	@java.lang.Override
	public boolean equals(final java.lang.Object other) {
		if (other instanceof org.apache.commons.math.dfp.Dfp) {
			final org.apache.commons.math.dfp.Dfp x = ((org.apache.commons.math.dfp.Dfp) (other));
			if (((isNaN()) || (x.isNaN())) || ((field.getRadixDigits()) != (x.field.getRadixDigits()))) {
				return false;
			}
			return (org.apache.commons.math.dfp.Dfp.compare(org.apache.commons.math.dfp.Dfp.this, x)) == 0;
		}
		return false;
	}

	@java.lang.Override
	public int hashCode() {
		return (((17 + ((sign) << 8)) + ((nans) << 16)) + (exp)) + (java.util.Arrays.hashCode(mant));
	}

	public boolean unequal(final org.apache.commons.math.dfp.Dfp x) {
		if (((isNaN()) || (x.isNaN())) || ((field.getRadixDigits()) != (x.field.getRadixDigits()))) {
			return false;
		}
		return (greaterThan(x)) || (lessThan(x));
	}

	private static int compare(final org.apache.commons.math.dfp.Dfp a, final org.apache.commons.math.dfp.Dfp b) {
		if (((((a.mant[((a.mant.length) - 1)]) == 0) && ((b.mant[((b.mant.length) - 1)]) == 0)) && ((a.nans) == (org.apache.commons.math.dfp.Dfp.FINITE))) && ((b.nans) == (org.apache.commons.math.dfp.Dfp.FINITE))) {
			return 0;
		}
		if ((a.sign) != (b.sign)) {
			if ((a.sign) == (-1)) {
				return -1;
			}else {
				return 1;
			}
		}
		if (((a.nans) == (org.apache.commons.math.dfp.Dfp.INFINITE)) && ((b.nans) == (org.apache.commons.math.dfp.Dfp.FINITE))) {
			return a.sign;
		}
		if (((a.nans) == (org.apache.commons.math.dfp.Dfp.FINITE)) && ((b.nans) == (org.apache.commons.math.dfp.Dfp.INFINITE))) {
			return -(b.sign);
		}
		if (((a.nans) == (org.apache.commons.math.dfp.Dfp.INFINITE)) && ((b.nans) == (org.apache.commons.math.dfp.Dfp.INFINITE))) {
			return 0;
		}
		if (((b.mant[((b.mant.length) - 1)]) != 0) && ((a.mant[((b.mant.length) - 1)]) != 0)) {
			if ((a.exp) < (b.exp)) {
				return -(a.sign);
			}
			if ((a.exp) > (b.exp)) {
				return a.sign;
			}
		}
		for (int i = (a.mant.length) - 1; i >= 0; i--) {
			if ((a.mant[i]) > (b.mant[i])) {
				return a.sign;
			}
			if ((a.mant[i]) < (b.mant[i])) {
				return -(a.sign);
			}
		}
		return 0;
	}

	public org.apache.commons.math.dfp.Dfp rint() {
		return trunc(org.apache.commons.math.dfp.DfpField.RoundingMode.ROUND_HALF_EVEN);
	}

	public org.apache.commons.math.dfp.Dfp floor() {
		return trunc(org.apache.commons.math.dfp.DfpField.RoundingMode.ROUND_FLOOR);
	}

	public org.apache.commons.math.dfp.Dfp ceil() {
		return trunc(org.apache.commons.math.dfp.DfpField.RoundingMode.ROUND_CEIL);
	}

	public org.apache.commons.math.dfp.Dfp remainder(final org.apache.commons.math.dfp.Dfp d) {
		final org.apache.commons.math.dfp.Dfp result = org.apache.commons.math.dfp.Dfp.this.subtract(org.apache.commons.math.dfp.Dfp.this.divide(d).rint().multiply(d));
		if ((result.mant[((mant.length) - 1)]) == 0) {
			result.sign = sign;
		}
		return result;
	}

	protected org.apache.commons.math.dfp.Dfp trunc(final org.apache.commons.math.dfp.DfpField.RoundingMode rmode) {
		boolean changed = false;
		if (isNaN()) {
			return newInstance(org.apache.commons.math.dfp.Dfp.this);
		}
		if ((nans) == (org.apache.commons.math.dfp.Dfp.INFINITE)) {
			return newInstance(org.apache.commons.math.dfp.Dfp.this);
		}
		if ((mant[((mant.length) - 1)]) == 0) {
			return newInstance(org.apache.commons.math.dfp.Dfp.this);
		}
		if ((exp) < 0) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INEXACT);
			org.apache.commons.math.dfp.Dfp result = newInstance(getZero());
			result = dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INEXACT, org.apache.commons.math.dfp.Dfp.TRUNC_TRAP, org.apache.commons.math.dfp.Dfp.this, result);
			return result;
		}
		if ((exp) >= (mant.length)) {
			return newInstance(org.apache.commons.math.dfp.Dfp.this);
		}
		org.apache.commons.math.dfp.Dfp result = newInstance(org.apache.commons.math.dfp.Dfp.this);
		for (int i = 0; i < ((mant.length) - (result.exp)); i++) {
			changed |= (result.mant[i]) != 0;
			result.mant[i] = 0;
		}
		if (changed) {
			switch (rmode) {
				case ROUND_FLOOR :
					if ((result.sign) == (-1)) {
						result = result.add(newInstance((-1)));
					}
					break;
				case ROUND_CEIL :
					if ((result.sign) == 1) {
						result = result.add(getOne());
					}
					break;
				case ROUND_HALF_EVEN :
				default :
					final org.apache.commons.math.dfp.Dfp half = newInstance("0.5");
					org.apache.commons.math.dfp.Dfp a = subtract(result);
					a.sign = 1;
					if (a.greaterThan(half)) {
						a = newInstance(getOne());
						a.sign = sign;
						result = result.add(a);
					}
					if (((a.equals(half)) && ((result.exp) > 0)) && (((result.mant[((mant.length) - (result.exp))]) & 1) != 0)) {
						a = newInstance(getOne());
						a.sign = sign;
						result = result.add(a);
					}
					break;
			}
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INEXACT);
			result = dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INEXACT, org.apache.commons.math.dfp.Dfp.TRUNC_TRAP, org.apache.commons.math.dfp.Dfp.this, result);
			return result;
		}
		return result;
	}

	public int intValue() {
		org.apache.commons.math.dfp.Dfp rounded;
		int result = 0;
		rounded = rint();
		if (rounded.greaterThan(newInstance(2147483647))) {
			return 2147483647;
		}
		if (rounded.lessThan(newInstance(-2147483648))) {
			return -2147483648;
		}
		for (int i = (mant.length) - 1; i >= ((mant.length) - (rounded.exp)); i--) {
			result = (result * (org.apache.commons.math.dfp.Dfp.RADIX)) + (rounded.mant[i]);
		}
		if ((rounded.sign) == (-1)) {
			result = -result;
		}
		return result;
	}

	public int log10K() {
		return (exp) - 1;
	}

	public org.apache.commons.math.dfp.Dfp power10K(final int e) {
		org.apache.commons.math.dfp.Dfp d = newInstance(getOne());
		d.exp = e + 1;
		return d;
	}

	public int log10() {
		if ((mant[((mant.length) - 1)]) > 1000) {
			return ((exp) * 4) - 1;
		}
		if ((mant[((mant.length) - 1)]) > 100) {
			return ((exp) * 4) - 2;
		}
		if ((mant[((mant.length) - 1)]) > 10) {
			return ((exp) * 4) - 3;
		}
		return ((exp) * 4) - 4;
	}

	public org.apache.commons.math.dfp.Dfp power10(final int e) {
		org.apache.commons.math.dfp.Dfp d = newInstance(getOne());
		if (e >= 0) {
			d.exp = (e / 4) + 1;
		}else {
			d.exp = (e + 1) / 4;
		}
		switch (((e % 4) + 4) % 4) {
			case 0 :
				break;
			case 1 :
				d = d.multiply(10);
				break;
			case 2 :
				d = d.multiply(100);
				break;
			default :
				d = d.multiply(1000);
		}
		return d;
	}

	protected int complement(int extra) {
		extra = (org.apache.commons.math.dfp.Dfp.RADIX) - extra;
		for (int i = 0; i < (mant.length); i++) {
			mant[i] = ((org.apache.commons.math.dfp.Dfp.RADIX) - (mant[i])) - 1;
		}
		int rh = extra / (org.apache.commons.math.dfp.Dfp.RADIX);
		extra = extra - (rh * (org.apache.commons.math.dfp.Dfp.RADIX));
		for (int i = 0; i < (mant.length); i++) {
			final int r = (mant[i]) + rh;
			rh = r / (org.apache.commons.math.dfp.Dfp.RADIX);
			mant[i] = r - (rh * (org.apache.commons.math.dfp.Dfp.RADIX));
		}
		return extra;
	}

	public org.apache.commons.math.dfp.Dfp add(final org.apache.commons.math.dfp.Dfp x) {
		if ((field.getRadixDigits()) != (x.field.getRadixDigits())) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
			final org.apache.commons.math.dfp.Dfp result = newInstance(getZero());
			result.nans = org.apache.commons.math.dfp.Dfp.QNAN;
			return dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.Dfp.ADD_TRAP, x, result);
		}
		if (((nans) != (org.apache.commons.math.dfp.Dfp.FINITE)) || ((x.nans) != (org.apache.commons.math.dfp.Dfp.FINITE))) {
			if (isNaN()) {
				return org.apache.commons.math.dfp.Dfp.this;
			}
			if (x.isNaN()) {
				return x;
			}
			if (((nans) == (org.apache.commons.math.dfp.Dfp.INFINITE)) && ((x.nans) == (org.apache.commons.math.dfp.Dfp.FINITE))) {
				return org.apache.commons.math.dfp.Dfp.this;
			}
			if (((x.nans) == (org.apache.commons.math.dfp.Dfp.INFINITE)) && ((nans) == (org.apache.commons.math.dfp.Dfp.FINITE))) {
				return x;
			}
			if ((((x.nans) == (org.apache.commons.math.dfp.Dfp.INFINITE)) && ((nans) == (org.apache.commons.math.dfp.Dfp.INFINITE))) && ((sign) == (x.sign))) {
				return x;
			}
			if ((((x.nans) == (org.apache.commons.math.dfp.Dfp.INFINITE)) && ((nans) == (org.apache.commons.math.dfp.Dfp.INFINITE))) && ((sign) != (x.sign))) {
				field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
				org.apache.commons.math.dfp.Dfp result = newInstance(getZero());
				result.nans = org.apache.commons.math.dfp.Dfp.QNAN;
				result = dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.Dfp.ADD_TRAP, x, result);
				return result;
			}
		}
		org.apache.commons.math.dfp.Dfp a = newInstance(org.apache.commons.math.dfp.Dfp.this);
		org.apache.commons.math.dfp.Dfp b = newInstance(x);
		org.apache.commons.math.dfp.Dfp result = newInstance(getZero());
		final byte asign = a.sign;
		final byte bsign = b.sign;
		a.sign = 1;
		b.sign = 1;
		byte rsign = bsign;
		if ((org.apache.commons.math.dfp.Dfp.compare(a, b)) > 0) {
			rsign = asign;
		}
		if ((b.mant[((mant.length) - 1)]) == 0) {
			b.exp = a.exp;
		}
		if ((a.mant[((mant.length) - 1)]) == 0) {
			a.exp = b.exp;
		}
		int aextradigit = 0;
		int bextradigit = 0;
		if ((a.exp) < (b.exp)) {
			aextradigit = a.align(b.exp);
		}else {
			bextradigit = b.align(a.exp);
		}
		if (asign != bsign) {
			if (asign == rsign) {
				bextradigit = b.complement(bextradigit);
			}else {
				aextradigit = a.complement(aextradigit);
			}
		}
		int rh = 0;
		for (int i = 0; i < (mant.length); i++) {
			final int r = ((a.mant[i]) + (b.mant[i])) + rh;
			rh = r / (org.apache.commons.math.dfp.Dfp.RADIX);
			result.mant[i] = r - (rh * (org.apache.commons.math.dfp.Dfp.RADIX));
		}
		result.exp = a.exp;
		result.sign = rsign;
		if ((rh != 0) && (asign == bsign)) {
			final int lostdigit = result.mant[0];
			result.shiftRight();
			result.mant[((mant.length) - 1)] = rh;
			final int excp = result.round(lostdigit);
			if (excp != 0) {
				result = dotrap(excp, org.apache.commons.math.dfp.Dfp.ADD_TRAP, x, result);
			}
		}
		for (int i = 0; i < (mant.length); i++) {
			if ((result.mant[((mant.length) - 1)]) != 0) {
				break;
			}
			result.shiftLeft();
			if (i == 0) {
				result.mant[0] = aextradigit + bextradigit;
				aextradigit = 0;
				bextradigit = 0;
			}
		}
		if ((result.mant[((mant.length) - 1)]) == 0) {
			result.exp = 0;
			if (asign != bsign) {
				result.sign = 1;
			}
		}
		final int excp = result.round((aextradigit + bextradigit));
		if (excp != 0) {
			result = dotrap(excp, org.apache.commons.math.dfp.Dfp.ADD_TRAP, x, result);
		}
		return result;
	}

	public org.apache.commons.math.dfp.Dfp negate() {
		org.apache.commons.math.dfp.Dfp result = newInstance(org.apache.commons.math.dfp.Dfp.this);
		result.sign = ((byte) (-(result.sign)));
		return result;
	}

	public org.apache.commons.math.dfp.Dfp subtract(final org.apache.commons.math.dfp.Dfp x) {
		return add(x.negate());
	}

	protected int round(int n) {
		boolean inc = false;
		switch (field.getRoundingMode()) {
			case ROUND_DOWN :
				inc = false;
				break;
			case ROUND_UP :
				inc = n != 0;
				break;
			case ROUND_HALF_UP :
				inc = n >= 5000;
				break;
			case ROUND_HALF_DOWN :
				inc = n > 5000;
				break;
			case ROUND_HALF_EVEN :
				inc = (n > 5000) || ((n == 5000) && (((mant[0]) & 1) == 1));
				break;
			case ROUND_HALF_ODD :
				inc = (n > 5000) || ((n == 5000) && (((mant[0]) & 1) == 0));
				break;
			case ROUND_CEIL :
				inc = ((sign) == 1) && (n != 0);
				break;
			case ROUND_FLOOR :
			default :
				inc = ((sign) == (-1)) && (n != 0);
				break;
		}
		if (inc) {
			int rh = 1;
			for (int i = 0; i < (mant.length); i++) {
				final int r = (mant[i]) + rh;
				rh = r / (org.apache.commons.math.dfp.Dfp.RADIX);
				mant[i] = r - (rh * (org.apache.commons.math.dfp.Dfp.RADIX));
			}
			if (rh != 0) {
				shiftRight();
				mant[((mant.length) - 1)] = rh;
			}
		}
		if ((exp) < (org.apache.commons.math.dfp.Dfp.MIN_EXP)) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_UNDERFLOW);
			return org.apache.commons.math.dfp.DfpField.FLAG_UNDERFLOW;
		}
		if ((exp) > (org.apache.commons.math.dfp.Dfp.MAX_EXP)) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_OVERFLOW);
			return org.apache.commons.math.dfp.DfpField.FLAG_OVERFLOW;
		}
		if (n != 0) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INEXACT);
			return org.apache.commons.math.dfp.DfpField.FLAG_INEXACT;
		}
		return 0;
	}

	public org.apache.commons.math.dfp.Dfp multiply(final org.apache.commons.math.dfp.Dfp x) {
		if ((field.getRadixDigits()) != (x.field.getRadixDigits())) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
			final org.apache.commons.math.dfp.Dfp result = newInstance(getZero());
			result.nans = org.apache.commons.math.dfp.Dfp.QNAN;
			return dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.Dfp.MULTIPLY_TRAP, x, result);
		}
		org.apache.commons.math.dfp.Dfp result = newInstance(getZero());
		if (((nans) != (org.apache.commons.math.dfp.Dfp.FINITE)) || ((x.nans) != (org.apache.commons.math.dfp.Dfp.FINITE))) {
			if (isNaN()) {
				return org.apache.commons.math.dfp.Dfp.this;
			}
			if (x.isNaN()) {
				return x;
			}
			if ((((nans) == (org.apache.commons.math.dfp.Dfp.INFINITE)) && ((x.nans) == (org.apache.commons.math.dfp.Dfp.FINITE))) && ((x.mant[((mant.length) - 1)]) != 0)) {
				result = newInstance(org.apache.commons.math.dfp.Dfp.this);
				result.sign = ((byte) ((sign) * (x.sign)));
				return result;
			}
			if ((((x.nans) == (org.apache.commons.math.dfp.Dfp.INFINITE)) && ((nans) == (org.apache.commons.math.dfp.Dfp.FINITE))) && ((mant[((mant.length) - 1)]) != 0)) {
				result = newInstance(x);
				result.sign = ((byte) ((sign) * (x.sign)));
				return result;
			}
			if (((x.nans) == (org.apache.commons.math.dfp.Dfp.INFINITE)) && ((nans) == (org.apache.commons.math.dfp.Dfp.INFINITE))) {
				result = newInstance(org.apache.commons.math.dfp.Dfp.this);
				result.sign = ((byte) ((sign) * (x.sign)));
				return result;
			}
			if (((((x.nans) == (org.apache.commons.math.dfp.Dfp.INFINITE)) && ((nans) == (org.apache.commons.math.dfp.Dfp.FINITE))) && ((mant[((mant.length) - 1)]) == 0)) || ((((nans) == (org.apache.commons.math.dfp.Dfp.INFINITE)) && ((x.nans) == (org.apache.commons.math.dfp.Dfp.FINITE))) && ((x.mant[((mant.length) - 1)]) == 0))) {
				field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
				result = newInstance(getZero());
				result.nans = org.apache.commons.math.dfp.Dfp.QNAN;
				result = dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.Dfp.MULTIPLY_TRAP, x, result);
				return result;
			}
		}
		int[] product = new int[(mant.length) * 2];
		for (int i = 0; i < (mant.length); i++) {
			int rh = 0;
			for (int j = 0; j < (mant.length); j++) {
				int r = (mant[i]) * (x.mant[j]);
				r = (r + (product[(i + j)])) + rh;
				rh = r / (org.apache.commons.math.dfp.Dfp.RADIX);
				product[(i + j)] = r - (rh * (org.apache.commons.math.dfp.Dfp.RADIX));
			}
			product[(i + (mant.length))] = rh;
		}
		int md = ((mant.length) * 2) - 1;
		for (int i = ((mant.length) * 2) - 1; i >= 0; i--) {
			if ((product[i]) != 0) {
				md = i;
				break;
			}
		}
		for (int i = 0; i < (mant.length); i++) {
			result.mant[(((mant.length) - i) - 1)] = product[(md - i)];
		}
		result.exp = ((((exp) + (x.exp)) + md) - (2 * (mant.length))) + 1;
		result.sign = ((byte) (((sign) == (x.sign)) ? 1 : -1));
		if ((result.mant[((mant.length) - 1)]) == 0) {
			result.exp = 0;
		}
		final int excp;
		if (md > ((mant.length) - 1)) {
			excp = result.round(product[(md - (mant.length))]);
		}else {
			excp = result.round(0);
		}
		if (excp != 0) {
			result = dotrap(excp, org.apache.commons.math.dfp.Dfp.MULTIPLY_TRAP, x, result);
		}
		return result;
	}

	public org.apache.commons.math.dfp.Dfp multiply(final int x) {
		org.apache.commons.math.dfp.Dfp result = newInstance(org.apache.commons.math.dfp.Dfp.this);
		if ((nans) != (org.apache.commons.math.dfp.Dfp.FINITE)) {
			if (isNaN()) {
				return org.apache.commons.math.dfp.Dfp.this;
			}
			if (((nans) == (org.apache.commons.math.dfp.Dfp.INFINITE)) && (x != 0)) {
				result = newInstance(org.apache.commons.math.dfp.Dfp.this);
				return result;
			}
			if (((nans) == (org.apache.commons.math.dfp.Dfp.INFINITE)) && (x == 0)) {
				field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
				result = newInstance(getZero());
				result.nans = org.apache.commons.math.dfp.Dfp.QNAN;
				result = dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.Dfp.MULTIPLY_TRAP, newInstance(getZero()), result);
				return result;
			}
		}
		if ((x < 0) || (x >= (org.apache.commons.math.dfp.Dfp.RADIX))) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
			result = newInstance(getZero());
			result.nans = org.apache.commons.math.dfp.Dfp.QNAN;
			result = dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.Dfp.MULTIPLY_TRAP, result, result);
			return result;
		}
		int rh = 0;
		for (int i = 0; i < (mant.length); i++) {
			final int r = ((mant[i]) * x) + rh;
			rh = r / (org.apache.commons.math.dfp.Dfp.RADIX);
			result.mant[i] = r - (rh * (org.apache.commons.math.dfp.Dfp.RADIX));
		}
		int lostdigit = 0;
		if (rh != 0) {
			lostdigit = result.mant[0];
			result.shiftRight();
			result.mant[((mant.length) - 1)] = rh;
		}
		if ((result.mant[((mant.length) - 1)]) == 0) {
			result.exp = 0;
		}
		final int excp = result.round(lostdigit);
		if (excp != 0) {
			result = dotrap(excp, org.apache.commons.math.dfp.Dfp.MULTIPLY_TRAP, result, result);
		}
		return result;
	}

	public org.apache.commons.math.dfp.Dfp divide(org.apache.commons.math.dfp.Dfp divisor) {
		int[] dividend;
		int[] quotient;
		int[] remainder;
		int qd;
		int nsqd;
		int trial = 0;
		int minadj;
		boolean trialgood;
		int md = 0;
		int excp;
		if ((field.getRadixDigits()) != (divisor.field.getRadixDigits())) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
			final org.apache.commons.math.dfp.Dfp result = newInstance(getZero());
			result.nans = org.apache.commons.math.dfp.Dfp.QNAN;
			return dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.Dfp.DIVIDE_TRAP, divisor, result);
		}
		org.apache.commons.math.dfp.Dfp result = newInstance(getZero());
		if (((nans) != (org.apache.commons.math.dfp.Dfp.FINITE)) || ((divisor.nans) != (org.apache.commons.math.dfp.Dfp.FINITE))) {
			if (isNaN()) {
				return org.apache.commons.math.dfp.Dfp.this;
			}
			if (divisor.isNaN()) {
				return divisor;
			}
			if (((nans) == (org.apache.commons.math.dfp.Dfp.INFINITE)) && ((divisor.nans) == (org.apache.commons.math.dfp.Dfp.FINITE))) {
				result = newInstance(org.apache.commons.math.dfp.Dfp.this);
				result.sign = ((byte) ((sign) * (divisor.sign)));
				return result;
			}
			if (((divisor.nans) == (org.apache.commons.math.dfp.Dfp.INFINITE)) && ((nans) == (org.apache.commons.math.dfp.Dfp.FINITE))) {
				result = newInstance(getZero());
				result.sign = ((byte) ((sign) * (divisor.sign)));
				return result;
			}
			if (((divisor.nans) == (org.apache.commons.math.dfp.Dfp.INFINITE)) && ((nans) == (org.apache.commons.math.dfp.Dfp.INFINITE))) {
				field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
				result = newInstance(getZero());
				result.nans = org.apache.commons.math.dfp.Dfp.QNAN;
				result = dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.Dfp.DIVIDE_TRAP, divisor, result);
				return result;
			}
		}
		if ((divisor.mant[((mant.length) - 1)]) == 0) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_DIV_ZERO);
			result = newInstance(getZero());
			result.sign = ((byte) ((sign) * (divisor.sign)));
			result.nans = org.apache.commons.math.dfp.Dfp.INFINITE;
			result = dotrap(org.apache.commons.math.dfp.DfpField.FLAG_DIV_ZERO, org.apache.commons.math.dfp.Dfp.DIVIDE_TRAP, divisor, result);
			return result;
		}
		dividend = new int[(mant.length) + 1];
		quotient = new int[(mant.length) + 2];
		remainder = new int[(mant.length) + 1];
		dividend[mant.length] = 0;
		quotient[mant.length] = 0;
		quotient[((mant.length) + 1)] = 0;
		remainder[mant.length] = 0;
		for (int i = 0; i < (mant.length); i++) {
			dividend[i] = mant[i];
			quotient[i] = 0;
			remainder[i] = 0;
		}
		nsqd = 0;
		for (qd = (mant.length) + 1; qd >= 0; qd--) {
			final int divMsb = ((dividend[mant.length]) * (org.apache.commons.math.dfp.Dfp.RADIX)) + (dividend[((mant.length) - 1)]);
			int min = divMsb / ((divisor.mant[((mant.length) - 1)]) + 1);
			int max = (divMsb + 1) / (divisor.mant[((mant.length) - 1)]);
			trialgood = false;
			while (!trialgood) {
				trial = (min + max) / 2;
				int rh = 0;
				for (int i = 0; i < ((mant.length) + 1); i++) {
					int dm = i < (mant.length) ? divisor.mant[i] : 0;
					final int r = (dm * trial) + rh;
					rh = r / (org.apache.commons.math.dfp.Dfp.RADIX);
					remainder[i] = r - (rh * (org.apache.commons.math.dfp.Dfp.RADIX));
				}
				rh = 1;
				for (int i = 0; i < ((mant.length) + 1); i++) {
					final int r = ((((org.apache.commons.math.dfp.Dfp.RADIX) - 1) - (remainder[i])) + (dividend[i])) + rh;
					rh = r / (org.apache.commons.math.dfp.Dfp.RADIX);
					remainder[i] = r - (rh * (org.apache.commons.math.dfp.Dfp.RADIX));
				}
				if (rh == 0) {
					max = trial - 1;
					continue;
				}
				minadj = ((remainder[mant.length]) * (org.apache.commons.math.dfp.Dfp.RADIX)) + (remainder[((mant.length) - 1)]);
				minadj = minadj / ((divisor.mant[((mant.length) - 1)]) + 1);
				if (minadj >= 2) {
					min = trial + minadj;
					continue;
				}
				trialgood = false;
				for (int i = (mant.length) - 1; i >= 0; i--) {
					if ((divisor.mant[i]) > (remainder[i])) {
						trialgood = true;
					}
					if ((divisor.mant[i]) < (remainder[i])) {
						break;
					}
				}
				if ((remainder[mant.length]) != 0) {
					trialgood = false;
				}
				if (trialgood == false) {
					min = trial + 1;
				}
			} 
			quotient[qd] = trial;
			if ((trial != 0) || (nsqd != 0)) {
				nsqd++;
			}
			if (((field.getRoundingMode()) == (org.apache.commons.math.dfp.DfpField.RoundingMode.ROUND_DOWN)) && (nsqd == (mant.length))) {
				break;
			}
			if (nsqd > (mant.length)) {
				break;
			}
			dividend[0] = 0;
			for (int i = 0; i < (mant.length); i++) {
				dividend[(i + 1)] = remainder[i];
			}
		}
		md = mant.length;
		for (int i = (mant.length) + 1; i >= 0; i--) {
			if ((quotient[i]) != 0) {
				md = i;
				break;
			}
		}
		for (int i = 0; i < (mant.length); i++) {
			result.mant[(((mant.length) - i) - 1)] = quotient[(md - i)];
		}
		result.exp = (((exp) - (divisor.exp)) + md) - (mant.length);
		result.sign = ((byte) (((sign) == (divisor.sign)) ? 1 : -1));
		if ((result.mant[((mant.length) - 1)]) == 0) {
			result.exp = 0;
		}
		if (md > ((mant.length) - 1)) {
			excp = result.round(quotient[(md - (mant.length))]);
		}else {
			excp = result.round(0);
		}
		if (excp != 0) {
			result = dotrap(excp, org.apache.commons.math.dfp.Dfp.DIVIDE_TRAP, divisor, result);
		}
		return result;
	}

	public org.apache.commons.math.dfp.Dfp divide(int divisor) {
		if ((nans) != (org.apache.commons.math.dfp.Dfp.FINITE)) {
			if (isNaN()) {
				return org.apache.commons.math.dfp.Dfp.this;
			}
			if ((nans) == (org.apache.commons.math.dfp.Dfp.INFINITE)) {
				return newInstance(org.apache.commons.math.dfp.Dfp.this);
			}
		}
		if (divisor == 0) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_DIV_ZERO);
			org.apache.commons.math.dfp.Dfp result = newInstance(getZero());
			result.sign = sign;
			result.nans = org.apache.commons.math.dfp.Dfp.INFINITE;
			result = dotrap(org.apache.commons.math.dfp.DfpField.FLAG_DIV_ZERO, org.apache.commons.math.dfp.Dfp.DIVIDE_TRAP, getZero(), result);
			return result;
		}
		if ((divisor < 0) || (divisor >= (org.apache.commons.math.dfp.Dfp.RADIX))) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
			org.apache.commons.math.dfp.Dfp result = newInstance(getZero());
			result.nans = org.apache.commons.math.dfp.Dfp.QNAN;
			result = dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.Dfp.DIVIDE_TRAP, result, result);
			return result;
		}
		org.apache.commons.math.dfp.Dfp result = newInstance(org.apache.commons.math.dfp.Dfp.this);
		int rl = 0;
		for (int i = (mant.length) - 1; i >= 0; i--) {
			final int r = (rl * (org.apache.commons.math.dfp.Dfp.RADIX)) + (result.mant[i]);
			final int rh = r / divisor;
			rl = r - (rh * divisor);
			result.mant[i] = rh;
		}
		if ((result.mant[((mant.length) - 1)]) == 0) {
			result.shiftLeft();
			final int r = rl * (org.apache.commons.math.dfp.Dfp.RADIX);
			final int rh = r / divisor;
			rl = r - (rh * divisor);
			result.mant[0] = rh;
		}
		final int excp = result.round(((rl * (org.apache.commons.math.dfp.Dfp.RADIX)) / divisor));
		if (excp != 0) {
			result = dotrap(excp, org.apache.commons.math.dfp.Dfp.DIVIDE_TRAP, result, result);
		}
		return result;
	}

	public org.apache.commons.math.dfp.Dfp reciprocal() {
		return field.getOne().divide(org.apache.commons.math.dfp.Dfp.this);
	}

	public org.apache.commons.math.dfp.Dfp sqrt() {
		if (((nans) == (org.apache.commons.math.dfp.Dfp.FINITE)) && ((mant[((mant.length) - 1)]) == 0)) {
			return newInstance(org.apache.commons.math.dfp.Dfp.this);
		}
		if ((nans) != (org.apache.commons.math.dfp.Dfp.FINITE)) {
			if (((nans) == (org.apache.commons.math.dfp.Dfp.INFINITE)) && ((sign) == 1)) {
				return newInstance(org.apache.commons.math.dfp.Dfp.this);
			}
			if ((nans) == (org.apache.commons.math.dfp.Dfp.QNAN)) {
				return newInstance(org.apache.commons.math.dfp.Dfp.this);
			}
			if ((nans) == (org.apache.commons.math.dfp.Dfp.SNAN)) {
				org.apache.commons.math.dfp.Dfp result;
				field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
				result = newInstance(org.apache.commons.math.dfp.Dfp.this);
				result = dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.Dfp.SQRT_TRAP, null, result);
				return result;
			}
		}
		if ((sign) == (-1)) {
			org.apache.commons.math.dfp.Dfp result;
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
			result = newInstance(org.apache.commons.math.dfp.Dfp.this);
			result.nans = org.apache.commons.math.dfp.Dfp.QNAN;
			result = dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.Dfp.SQRT_TRAP, null, result);
			return result;
		}
		org.apache.commons.math.dfp.Dfp x = newInstance(org.apache.commons.math.dfp.Dfp.this);
		if (((x.exp) < (-1)) || ((x.exp) > 1)) {
			x.exp = (org.apache.commons.math.dfp.Dfp.this.exp) / 2;
		}
		switch ((x.mant[((mant.length) - 1)]) / 2000) {
			case 0 :
				x.mant[((mant.length) - 1)] = ((x.mant[((mant.length) - 1)]) / 2) + 1;
				break;
			case 2 :
				x.mant[((mant.length) - 1)] = 1500;
				break;
			case 3 :
				x.mant[((mant.length) - 1)] = 2200;
				break;
			default :
				x.mant[((mant.length) - 1)] = 3000;
		}
		org.apache.commons.math.dfp.Dfp dx = newInstance(x);
		org.apache.commons.math.dfp.Dfp px = getZero();
		org.apache.commons.math.dfp.Dfp ppx = getZero();
		while (x.unequal(px)) {
			dx = newInstance(x);
			dx.sign = -1;
			dx = dx.add(org.apache.commons.math.dfp.Dfp.this.divide(x));
			dx = dx.divide(2);
			ppx = px;
			px = x;
			x = x.add(dx);
			if (x.equals(ppx)) {
				break;
			}
			if ((dx.mant[((mant.length) - 1)]) == 0) {
				break;
			}
		} 
		return x;
	}

	@java.lang.Override
	public java.lang.String toString() {
		if ((nans) != (org.apache.commons.math.dfp.Dfp.FINITE)) {
			if ((nans) == (org.apache.commons.math.dfp.Dfp.INFINITE)) {
				return (sign) < 0 ? org.apache.commons.math.dfp.Dfp.NEG_INFINITY_STRING : org.apache.commons.math.dfp.Dfp.POS_INFINITY_STRING;
			}else {
				return org.apache.commons.math.dfp.Dfp.NAN_STRING;
			}
		}
		if (((exp) > (mant.length)) || ((exp) < (-1))) {
			return dfp2sci();
		}
		return dfp2string();
	}

	protected java.lang.String dfp2sci() {
		char[] rawdigits = new char[(mant.length) * 4];
		char[] outputbuffer = new char[((mant.length) * 4) + 20];
		int p;
		int q;
		int e;
		int ae;
		int shf;
		p = 0;
		for (int i = (mant.length) - 1; i >= 0; i--) {
			rawdigits[(p++)] = ((char) (((mant[i]) / 1000) + '0'));
			rawdigits[(p++)] = ((char) ((((mant[i]) / 100) % 10) + '0'));
			rawdigits[(p++)] = ((char) ((((mant[i]) / 10) % 10) + '0'));
			rawdigits[(p++)] = ((char) (((mant[i]) % 10) + '0'));
		}
		for (p = 0; p < (rawdigits.length); p++) {
			if ((rawdigits[p]) != '0') {
				break;
			}
		}
		shf = p;
		q = 0;
		if ((sign) == (-1)) {
			outputbuffer[(q++)] = '-';
		}
		if (p != (rawdigits.length)) {
			outputbuffer[(q++)] = rawdigits[(p++)];
			outputbuffer[(q++)] = '.';
			while (p < (rawdigits.length)) {
				outputbuffer[(q++)] = rawdigits[(p++)];
			} 
		}else {
			outputbuffer[(q++)] = '0';
			outputbuffer[(q++)] = '.';
			outputbuffer[(q++)] = '0';
			outputbuffer[(q++)] = 'e';
			outputbuffer[(q++)] = '0';
			return new java.lang.String(outputbuffer, 0, 5);
		}
		outputbuffer[(q++)] = 'e';
		e = (((exp) * 4) - shf) - 1;
		ae = e;
		if (e < 0) {
			ae = -e;
		}
		for (p = 1000000000; p > ae; p /= 10) {
		}
		if (e < 0) {
			outputbuffer[(q++)] = '-';
		}
		while (p > 0) {
			outputbuffer[(q++)] = ((char) ((ae / p) + '0'));
			ae = ae % p;
			p = p / 10;
		} 
		return new java.lang.String(outputbuffer, 0, q);
	}

	protected java.lang.String dfp2string() {
		char[] buffer = new char[((mant.length) * 4) + 20];
		int p = 1;
		int q;
		int e = exp;
		boolean pointInserted = false;
		buffer[0] = ' ';
		if (e <= 0) {
			buffer[(p++)] = '0';
			buffer[(p++)] = '.';
			pointInserted = true;
		}
		while (e < 0) {
			buffer[(p++)] = '0';
			buffer[(p++)] = '0';
			buffer[(p++)] = '0';
			buffer[(p++)] = '0';
			e++;
		} 
		for (int i = (mant.length) - 1; i >= 0; i--) {
			buffer[(p++)] = ((char) (((mant[i]) / 1000) + '0'));
			buffer[(p++)] = ((char) ((((mant[i]) / 100) % 10) + '0'));
			buffer[(p++)] = ((char) ((((mant[i]) / 10) % 10) + '0'));
			buffer[(p++)] = ((char) (((mant[i]) % 10) + '0'));
			if ((--e) == 0) {
				buffer[(p++)] = '.';
				pointInserted = true;
			}
		}
		while (e > 0) {
			buffer[(p++)] = '0';
			buffer[(p++)] = '0';
			buffer[(p++)] = '0';
			buffer[(p++)] = '0';
			e--;
		} 
		if (!pointInserted) {
			buffer[(p++)] = '.';
		}
		q = 1;
		while ((buffer[q]) == '0') {
			q++;
		} 
		if ((buffer[q]) == '.') {
			q--;
		}
		while ((buffer[(p - 1)]) == '0') {
			p--;
		} 
		if ((sign) < 0) {
			buffer[(--q)] = '-';
		}
		return new java.lang.String(buffer, q, (p - q));
	}

	public org.apache.commons.math.dfp.Dfp dotrap(int type, java.lang.String what, org.apache.commons.math.dfp.Dfp oper, org.apache.commons.math.dfp.Dfp result) {
		org.apache.commons.math.dfp.Dfp def = result;
		switch (type) {
			case org.apache.commons.math.dfp.DfpField.FLAG_INVALID :
				def = newInstance(getZero());
				def.sign = result.sign;
				def.nans = org.apache.commons.math.dfp.Dfp.QNAN;
				break;
			case org.apache.commons.math.dfp.DfpField.FLAG_DIV_ZERO :
				if (((nans) == (org.apache.commons.math.dfp.Dfp.FINITE)) && ((mant[((mant.length) - 1)]) != 0)) {
					def = newInstance(getZero());
					def.sign = ((byte) ((sign) * (oper.sign)));
					def.nans = org.apache.commons.math.dfp.Dfp.INFINITE;
				}
				if (((nans) == (org.apache.commons.math.dfp.Dfp.FINITE)) && ((mant[((mant.length) - 1)]) == 0)) {
					def = newInstance(getZero());
					def.nans = org.apache.commons.math.dfp.Dfp.QNAN;
				}
				if (((nans) == (org.apache.commons.math.dfp.Dfp.INFINITE)) || ((nans) == (org.apache.commons.math.dfp.Dfp.QNAN))) {
					def = newInstance(getZero());
					def.nans = org.apache.commons.math.dfp.Dfp.QNAN;
				}
				if (((nans) == (org.apache.commons.math.dfp.Dfp.INFINITE)) || ((nans) == (org.apache.commons.math.dfp.Dfp.SNAN))) {
					def = newInstance(getZero());
					def.nans = org.apache.commons.math.dfp.Dfp.QNAN;
				}
				break;
			case org.apache.commons.math.dfp.DfpField.FLAG_UNDERFLOW :
				if (((result.exp) + (mant.length)) < (org.apache.commons.math.dfp.Dfp.MIN_EXP)) {
					def = newInstance(getZero());
					def.sign = result.sign;
				}else {
					def = newInstance(result);
				}
				result.exp = (result.exp) + (org.apache.commons.math.dfp.Dfp.ERR_SCALE);
				break;
			case org.apache.commons.math.dfp.DfpField.FLAG_OVERFLOW :
				result.exp = (result.exp) - (org.apache.commons.math.dfp.Dfp.ERR_SCALE);
				def = newInstance(getZero());
				def.sign = result.sign;
				def.nans = org.apache.commons.math.dfp.Dfp.INFINITE;
				break;
			default :
				def = result;
				break;
		}
		return trap(type, what, oper, def, result);
	}

	protected org.apache.commons.math.dfp.Dfp trap(int type, java.lang.String what, org.apache.commons.math.dfp.Dfp oper, org.apache.commons.math.dfp.Dfp def, org.apache.commons.math.dfp.Dfp result) {
		return def;
	}

	public int classify() {
		return nans;
	}

	public static org.apache.commons.math.dfp.Dfp copysign(final org.apache.commons.math.dfp.Dfp x, final org.apache.commons.math.dfp.Dfp y) {
		org.apache.commons.math.dfp.Dfp result = x.newInstance(x);
		result.sign = y.sign;
		return result;
	}

	public org.apache.commons.math.dfp.Dfp nextAfter(final org.apache.commons.math.dfp.Dfp x) {
		if ((field.getRadixDigits()) != (x.field.getRadixDigits())) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
			final org.apache.commons.math.dfp.Dfp result = newInstance(getZero());
			result.nans = org.apache.commons.math.dfp.Dfp.QNAN;
			return dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.Dfp.NEXT_AFTER_TRAP, x, result);
		}
		boolean up = false;
		if (org.apache.commons.math.dfp.Dfp.this.lessThan(x)) {
			up = true;
		}
		if ((org.apache.commons.math.dfp.Dfp.compare(org.apache.commons.math.dfp.Dfp.this, x)) == 0) {
			return newInstance(x);
		}
		if (lessThan(getZero())) {
			up = !up;
		}
		final org.apache.commons.math.dfp.Dfp inc;
		org.apache.commons.math.dfp.Dfp result;
		if (up) {
			inc = newInstance(getOne());
			inc.exp = ((org.apache.commons.math.dfp.Dfp.this.exp) - (mant.length)) + 1;
			inc.sign = org.apache.commons.math.dfp.Dfp.this.sign;
			if (org.apache.commons.math.dfp.Dfp.this.equals(getZero())) {
				inc.exp = (org.apache.commons.math.dfp.Dfp.MIN_EXP) - (mant.length);
			}
			result = add(inc);
		}else {
			inc = newInstance(getOne());
			inc.exp = org.apache.commons.math.dfp.Dfp.this.exp;
			inc.sign = org.apache.commons.math.dfp.Dfp.this.sign;
			if (org.apache.commons.math.dfp.Dfp.this.equals(inc)) {
				inc.exp = (org.apache.commons.math.dfp.Dfp.this.exp) - (mant.length);
			}else {
				inc.exp = ((org.apache.commons.math.dfp.Dfp.this.exp) - (mant.length)) + 1;
			}
			if (org.apache.commons.math.dfp.Dfp.this.equals(getZero())) {
				inc.exp = (org.apache.commons.math.dfp.Dfp.MIN_EXP) - (mant.length);
			}
			result = org.apache.commons.math.dfp.Dfp.this.subtract(inc);
		}
		if (((result.classify()) == (org.apache.commons.math.dfp.Dfp.INFINITE)) && ((org.apache.commons.math.dfp.Dfp.this.classify()) != (org.apache.commons.math.dfp.Dfp.INFINITE))) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INEXACT);
			result = dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INEXACT, org.apache.commons.math.dfp.Dfp.NEXT_AFTER_TRAP, x, result);
		}
		if ((result.equals(getZero())) && ((org.apache.commons.math.dfp.Dfp.this.equals(getZero())) == false)) {
			field.setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INEXACT);
			result = dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INEXACT, org.apache.commons.math.dfp.Dfp.NEXT_AFTER_TRAP, x, result);
		}
		return result;
	}

	public double toDouble() {
		if (isInfinite()) {
			if (lessThan(getZero())) {
				return java.lang.Double.NEGATIVE_INFINITY;
			}else {
				return java.lang.Double.POSITIVE_INFINITY;
			}
		}
		if (isNaN()) {
			return java.lang.Double.NaN;
		}
		org.apache.commons.math.dfp.Dfp y = org.apache.commons.math.dfp.Dfp.this;
		boolean negate = false;
		int cmp0 = org.apache.commons.math.dfp.Dfp.compare(org.apache.commons.math.dfp.Dfp.this, getZero());
		if (cmp0 == 0) {
			return (sign) < 0 ? -0.0 : +0.0;
		}else
			if (cmp0 < 0) {
				y = negate();
				negate = true;
			}
		
		int exponent = ((int) ((y.log10()) * 3.32));
		if (exponent < 0) {
			exponent--;
		}
		org.apache.commons.math.dfp.Dfp tempDfp = org.apache.commons.math.dfp.DfpMath.pow(getTwo(), exponent);
		while ((tempDfp.lessThan(y)) || (tempDfp.equals(y))) {
			tempDfp = tempDfp.multiply(2);
			exponent++;
		} 
		exponent--;
		y = y.divide(org.apache.commons.math.dfp.DfpMath.pow(getTwo(), exponent));
		if (exponent > (-1023)) {
			y = y.subtract(getOne());
		}
		if (exponent < (-1074)) {
			return 0;
		}
		if (exponent > 1023) {
			return negate ? java.lang.Double.NEGATIVE_INFINITY : java.lang.Double.POSITIVE_INFINITY;
		}
		y = y.multiply(newInstance(4503599627370496L)).rint();
		java.lang.String str = y.toString();
		str = str.substring(0, ((str.length()) - 1));
		long mantissa = java.lang.Long.parseLong(str);
		if (mantissa == 4503599627370496L) {
			mantissa = 0;
			exponent++;
		}
		if (exponent <= (-1023)) {
			exponent--;
		}
		while (exponent < (-1023)) {
			exponent++;
			mantissa >>>= 1;
		} 
		long bits = mantissa | ((exponent + 1023L) << 52);
		double x = java.lang.Double.longBitsToDouble(bits);
		if (negate) {
			x = -x;
		}
		return x;
	}

	public double[] toSplitDouble() {
		double[] split = new double[2];
		long mask = -1073741824L;
		split[0] = java.lang.Double.longBitsToDouble(((java.lang.Double.doubleToLongBits(toDouble())) & mask));
		split[1] = subtract(newInstance(split[0])).toDouble();
		return split;
	}
}


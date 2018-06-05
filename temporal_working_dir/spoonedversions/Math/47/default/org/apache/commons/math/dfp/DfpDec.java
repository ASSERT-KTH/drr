

package org.apache.commons.math.dfp;


public class DfpDec extends org.apache.commons.math.dfp.Dfp {
	protected DfpDec(final org.apache.commons.math.dfp.DfpField factory) {
		super(factory);
	}

	protected DfpDec(final org.apache.commons.math.dfp.DfpField factory, byte x) {
		super(factory, x);
	}

	protected DfpDec(final org.apache.commons.math.dfp.DfpField factory, int x) {
		super(factory, x);
	}

	protected DfpDec(final org.apache.commons.math.dfp.DfpField factory, long x) {
		super(factory, x);
	}

	protected DfpDec(final org.apache.commons.math.dfp.DfpField factory, double x) {
		super(factory, x);
		round(0);
	}

	public DfpDec(final org.apache.commons.math.dfp.Dfp d) {
		super(d);
		round(0);
	}

	protected DfpDec(final org.apache.commons.math.dfp.DfpField factory, final java.lang.String s) {
		super(factory, s);
		round(0);
	}

	protected DfpDec(final org.apache.commons.math.dfp.DfpField factory, final byte sign, final byte nans) {
		super(factory, sign, nans);
	}

	@java.lang.Override
	public org.apache.commons.math.dfp.Dfp newInstance() {
		return new org.apache.commons.math.dfp.DfpDec(getField());
	}

	@java.lang.Override
	public org.apache.commons.math.dfp.Dfp newInstance(final byte x) {
		return new org.apache.commons.math.dfp.DfpDec(getField(), x);
	}

	@java.lang.Override
	public org.apache.commons.math.dfp.Dfp newInstance(final int x) {
		return new org.apache.commons.math.dfp.DfpDec(getField(), x);
	}

	@java.lang.Override
	public org.apache.commons.math.dfp.Dfp newInstance(final long x) {
		return new org.apache.commons.math.dfp.DfpDec(getField(), x);
	}

	@java.lang.Override
	public org.apache.commons.math.dfp.Dfp newInstance(final double x) {
		return new org.apache.commons.math.dfp.DfpDec(getField(), x);
	}

	@java.lang.Override
	public org.apache.commons.math.dfp.Dfp newInstance(final org.apache.commons.math.dfp.Dfp d) {
		if ((getField().getRadixDigits()) != (d.getField().getRadixDigits())) {
			getField().setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
			final org.apache.commons.math.dfp.Dfp result = newInstance(getZero());
			result.nans = org.apache.commons.math.dfp.Dfp.QNAN;
			return dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, "newInstance", d, result);
		}
		return new org.apache.commons.math.dfp.DfpDec(d);
	}

	@java.lang.Override
	public org.apache.commons.math.dfp.Dfp newInstance(final java.lang.String s) {
		return new org.apache.commons.math.dfp.DfpDec(getField(), s);
	}

	@java.lang.Override
	public org.apache.commons.math.dfp.Dfp newInstance(final byte sign, final byte nans) {
		return new org.apache.commons.math.dfp.DfpDec(getField(), sign, nans);
	}

	protected int getDecimalDigits() {
		return ((getRadixDigits()) * 4) - 3;
	}

	@java.lang.Override
	protected int round(int in) {
		int msb = mant[((mant.length) - 1)];
		if (msb == 0) {
			return 0;
		}
		int cmaxdigits = (mant.length) * 4;
		int lsbthreshold = 1000;
		while (lsbthreshold > msb) {
			lsbthreshold /= 10;
			cmaxdigits--;
		} 
		final int digits = getDecimalDigits();
		final int lsbshift = cmaxdigits - digits;
		final int lsd = lsbshift / 4;
		lsbthreshold = 1;
		for (int i = 0; i < (lsbshift % 4); i++) {
			lsbthreshold *= 10;
		}
		final int lsb = mant[lsd];
		if ((lsbthreshold <= 1) && (digits == ((4 * (mant.length)) - 3))) {
			return super.round(in);
		}
		int discarded = in;
		final int n;
		if (lsbthreshold == 1) {
			n = ((mant[(lsd - 1)]) / 1000) % 10;
			mant[(lsd - 1)] %= 1000;
			discarded |= mant[(lsd - 1)];
		}else {
			n = ((lsb * 10) / lsbthreshold) % 10;
			discarded |= lsb % (lsbthreshold / 10);
		}
		for (int i = 0; i < lsd; i++) {
			discarded |= mant[i];
			mant[i] = 0;
		}
		mant[lsd] = (lsb / lsbthreshold) * lsbthreshold;
		final boolean inc;
		switch (getField().getRoundingMode()) {
			case ROUND_DOWN :
				inc = false;
				break;
			case ROUND_UP :
				inc = (n != 0) || (discarded != 0);
				break;
			case ROUND_HALF_UP :
				inc = n >= 5;
				break;
			case ROUND_HALF_DOWN :
				inc = n > 5;
				break;
			case ROUND_HALF_EVEN :
				inc = ((n > 5) || ((n == 5) && (discarded != 0))) || (((n == 5) && (discarded == 0)) && (((lsb / lsbthreshold) & 1) == 1));
				break;
			case ROUND_HALF_ODD :
				inc = ((n > 5) || ((n == 5) && (discarded != 0))) || (((n == 5) && (discarded == 0)) && (((lsb / lsbthreshold) & 1) == 0));
				break;
			case ROUND_CEIL :
				inc = ((sign) == 1) && ((n != 0) || (discarded != 0));
				break;
			case ROUND_FLOOR :
			default :
				inc = ((sign) == (-1)) && ((n != 0) || (discarded != 0));
				break;
		}
		if (inc) {
			int rh = lsbthreshold;
			for (int i = lsd; i < (mant.length); i++) {
				final int r = (mant[i]) + rh;
				rh = r / (org.apache.commons.math.dfp.Dfp.RADIX);
				mant[i] = r % (org.apache.commons.math.dfp.Dfp.RADIX);
			}
			if (rh != 0) {
				shiftRight();
				mant[((mant.length) - 1)] = rh;
			}
		}
		if ((exp) < (org.apache.commons.math.dfp.Dfp.MIN_EXP)) {
			getField().setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_UNDERFLOW);
			return org.apache.commons.math.dfp.DfpField.FLAG_UNDERFLOW;
		}
		if ((exp) > (org.apache.commons.math.dfp.Dfp.MAX_EXP)) {
			getField().setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_OVERFLOW);
			return org.apache.commons.math.dfp.DfpField.FLAG_OVERFLOW;
		}
		if ((n != 0) || (discarded != 0)) {
			getField().setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INEXACT);
			return org.apache.commons.math.dfp.DfpField.FLAG_INEXACT;
		}
		return 0;
	}

	@java.lang.Override
	public org.apache.commons.math.dfp.Dfp nextAfter(org.apache.commons.math.dfp.Dfp x) {
		final java.lang.String trapName = "nextAfter";
		if ((getField().getRadixDigits()) != (x.getField().getRadixDigits())) {
			getField().setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
			final org.apache.commons.math.dfp.Dfp result = newInstance(getZero());
			result.nans = org.apache.commons.math.dfp.Dfp.QNAN;
			return dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, trapName, x, result);
		}
		boolean up = false;
		org.apache.commons.math.dfp.Dfp result;
		org.apache.commons.math.dfp.Dfp inc;
		if (org.apache.commons.math.dfp.DfpDec.this.lessThan(x)) {
			up = true;
		}
		if (equals(x)) {
			return newInstance(x);
		}
		if (lessThan(getZero())) {
			up = !up;
		}
		if (up) {
			inc = power10((((log10()) - (getDecimalDigits())) + 1));
			inc = org.apache.commons.math.dfp.Dfp.copysign(inc, org.apache.commons.math.dfp.DfpDec.this);
			if (org.apache.commons.math.dfp.DfpDec.this.equals(getZero())) {
				inc = power10K((((org.apache.commons.math.dfp.Dfp.MIN_EXP) - (mant.length)) - 1));
			}
			if (inc.equals(getZero())) {
				result = org.apache.commons.math.dfp.Dfp.copysign(newInstance(getZero()), org.apache.commons.math.dfp.DfpDec.this);
			}else {
				result = add(inc);
			}
		}else {
			inc = power10(log10());
			inc = org.apache.commons.math.dfp.Dfp.copysign(inc, org.apache.commons.math.dfp.DfpDec.this);
			if (org.apache.commons.math.dfp.DfpDec.this.equals(inc)) {
				inc = inc.divide(power10(getDecimalDigits()));
			}else {
				inc = inc.divide(power10(((getDecimalDigits()) - 1)));
			}
			if (org.apache.commons.math.dfp.DfpDec.this.equals(getZero())) {
				inc = power10K((((org.apache.commons.math.dfp.Dfp.MIN_EXP) - (mant.length)) - 1));
			}
			if (inc.equals(getZero())) {
				result = org.apache.commons.math.dfp.Dfp.copysign(newInstance(getZero()), org.apache.commons.math.dfp.DfpDec.this);
			}else {
				result = subtract(inc);
			}
		}
		if (((result.classify()) == (org.apache.commons.math.dfp.Dfp.INFINITE)) && ((org.apache.commons.math.dfp.DfpDec.this.classify()) != (org.apache.commons.math.dfp.Dfp.INFINITE))) {
			getField().setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INEXACT);
			result = dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INEXACT, trapName, x, result);
		}
		if ((result.equals(getZero())) && ((org.apache.commons.math.dfp.DfpDec.this.equals(getZero())) == false)) {
			getField().setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INEXACT);
			result = dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INEXACT, trapName, x, result);
		}
		return result;
	}
}




package org.apache.commons.math.dfp;


public class DfpMath {
	private static final java.lang.String POW_TRAP = "pow";

	private DfpMath() {
	}

	protected static org.apache.commons.math.dfp.Dfp[] split(final org.apache.commons.math.dfp.DfpField field, final java.lang.String a) {
		org.apache.commons.math.dfp.Dfp[] result = new org.apache.commons.math.dfp.Dfp[2];
		char[] buf;
		boolean leading = true;
		int sp = 0;
		int sig = 0;
		buf = new char[a.length()];
		for (int i = 0; i < (buf.length); i++) {
			buf[i] = a.charAt(i);
			if (((buf[i]) >= '1') && ((buf[i]) <= '9')) {
				leading = false;
			}
			if ((buf[i]) == '.') {
				sig += (400 - sig) % 4;
				leading = false;
			}
			if (sig == (((field.getRadixDigits()) / 2) * 4)) {
				sp = i;
				break;
			}
			if ((((buf[i]) >= '0') && ((buf[i]) <= '9')) && (!leading)) {
				sig++;
			}
		}
		result[0] = field.newDfp(new java.lang.String(buf, 0, sp));
		for (int i = 0; i < (buf.length); i++) {
			buf[i] = a.charAt(i);
			if ((((buf[i]) >= '0') && ((buf[i]) <= '9')) && (i < sp)) {
				buf[i] = '0';
			}
		}
		result[1] = field.newDfp(new java.lang.String(buf));
		return result;
	}

	protected static org.apache.commons.math.dfp.Dfp[] split(final org.apache.commons.math.dfp.Dfp a) {
		final org.apache.commons.math.dfp.Dfp[] result = new org.apache.commons.math.dfp.Dfp[2];
		final org.apache.commons.math.dfp.Dfp shift = a.multiply(a.power10K(((a.getRadixDigits()) / 2)));
		result[0] = a.add(shift).subtract(shift);
		result[1] = a.subtract(result[0]);
		return result;
	}

	protected static org.apache.commons.math.dfp.Dfp[] splitMult(final org.apache.commons.math.dfp.Dfp[] a, final org.apache.commons.math.dfp.Dfp[] b) {
		final org.apache.commons.math.dfp.Dfp[] result = new org.apache.commons.math.dfp.Dfp[2];
		result[1] = a[0].getZero();
		result[0] = a[0].multiply(b[0]);
		if (((result[0].classify()) == (org.apache.commons.math.dfp.Dfp.INFINITE)) || (result[0].equals(result[1]))) {
			return result;
		}
		result[1] = a[0].multiply(b[1]).add(a[1].multiply(b[0])).add(a[1].multiply(b[1]));
		return result;
	}

	protected static org.apache.commons.math.dfp.Dfp[] splitDiv(final org.apache.commons.math.dfp.Dfp[] a, final org.apache.commons.math.dfp.Dfp[] b) {
		final org.apache.commons.math.dfp.Dfp[] result;
		result = new org.apache.commons.math.dfp.Dfp[2];
		result[0] = a[0].divide(b[0]);
		result[1] = a[1].multiply(b[0]).subtract(a[0].multiply(b[1]));
		result[1] = result[1].divide(b[0].multiply(b[0]).add(b[0].multiply(b[1])));
		return result;
	}

	protected static org.apache.commons.math.dfp.Dfp splitPow(final org.apache.commons.math.dfp.Dfp[] base, int a) {
		boolean invert = false;
		org.apache.commons.math.dfp.Dfp[] r = new org.apache.commons.math.dfp.Dfp[2];
		org.apache.commons.math.dfp.Dfp[] result = new org.apache.commons.math.dfp.Dfp[2];
		result[0] = base[0].getOne();
		result[1] = base[0].getZero();
		if (a == 0) {
			return result[0].add(result[1]);
		}
		if (a < 0) {
			invert = true;
			a = -a;
		}
		do {
			r[0] = new org.apache.commons.math.dfp.Dfp(base[0]);
			r[1] = new org.apache.commons.math.dfp.Dfp(base[1]);
			int trial = 1;
			int prevtrial;
			while (true) {
				prevtrial = trial;
				trial = trial * 2;
				if (trial > a) {
					break;
				}
				r = org.apache.commons.math.dfp.DfpMath.splitMult(r, r);
			} 
			trial = prevtrial;
			a -= trial;
			result = org.apache.commons.math.dfp.DfpMath.splitMult(result, r);
		} while (a >= 1 );
		result[0] = result[0].add(result[1]);
		if (invert) {
			result[0] = base[0].getOne().divide(result[0]);
		}
		return result[0];
	}

	public static org.apache.commons.math.dfp.Dfp pow(org.apache.commons.math.dfp.Dfp base, int a) {
		boolean invert = false;
		org.apache.commons.math.dfp.Dfp result = base.getOne();
		if (a == 0) {
			return result;
		}
		if (a < 0) {
			invert = true;
			a = -a;
		}
		do {
			org.apache.commons.math.dfp.Dfp r = new org.apache.commons.math.dfp.Dfp(base);
			org.apache.commons.math.dfp.Dfp prevr;
			int trial = 1;
			int prevtrial;
			do {
				prevr = new org.apache.commons.math.dfp.Dfp(r);
				prevtrial = trial;
				r = r.multiply(r);
				trial = trial * 2;
			} while (a > trial );
			r = prevr;
			trial = prevtrial;
			a = a - trial;
			result = result.multiply(r);
		} while (a >= 1 );
		if (invert) {
			result = base.getOne().divide(result);
		}
		return base.newInstance(result);
	}

	public static org.apache.commons.math.dfp.Dfp exp(final org.apache.commons.math.dfp.Dfp a) {
		final org.apache.commons.math.dfp.Dfp inta = a.rint();
		final org.apache.commons.math.dfp.Dfp fraca = a.subtract(inta);
		final int ia = inta.intValue();
		if (ia > 2147483646) {
			return a.newInstance(((byte) (1)), ((byte) (org.apache.commons.math.dfp.Dfp.INFINITE)));
		}
		if (ia < (-2147483646)) {
			return a.newInstance();
		}
		final org.apache.commons.math.dfp.Dfp einta = org.apache.commons.math.dfp.DfpMath.splitPow(a.getField().getESplit(), ia);
		final org.apache.commons.math.dfp.Dfp efraca = org.apache.commons.math.dfp.DfpMath.expInternal(fraca);
		return einta.multiply(efraca);
	}

	protected static org.apache.commons.math.dfp.Dfp expInternal(final org.apache.commons.math.dfp.Dfp a) {
		org.apache.commons.math.dfp.Dfp y = a.getOne();
		org.apache.commons.math.dfp.Dfp x = a.getOne();
		org.apache.commons.math.dfp.Dfp fact = a.getOne();
		org.apache.commons.math.dfp.Dfp py = new org.apache.commons.math.dfp.Dfp(y);
		for (int i = 1; i < 90; i++) {
			x = x.multiply(a);
			fact = fact.divide(i);
			y = y.add(x.multiply(fact));
			if (y.equals(py)) {
				break;
			}
			py = new org.apache.commons.math.dfp.Dfp(y);
		}
		return y;
	}

	public static org.apache.commons.math.dfp.Dfp log(org.apache.commons.math.dfp.Dfp a) {
		int lr;
		org.apache.commons.math.dfp.Dfp x;
		int ix;
		int p2 = 0;
		if (((a.equals(a.getZero())) || (a.lessThan(a.getZero()))) || (a.isNaN())) {
			a.getField().setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
			return a.dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, "ln", a, a.newInstance(((byte) (1)), ((byte) (org.apache.commons.math.dfp.Dfp.QNAN))));
		}
		if ((a.classify()) == (org.apache.commons.math.dfp.Dfp.INFINITE)) {
			return a;
		}
		x = new org.apache.commons.math.dfp.Dfp(a);
		lr = x.log10K();
		x = x.divide(org.apache.commons.math.dfp.DfpMath.pow(a.newInstance(10000), lr));
		ix = x.floor().intValue();
		while (ix > 2) {
			ix >>= 1;
			p2++;
		} 
		org.apache.commons.math.dfp.Dfp[] spx = org.apache.commons.math.dfp.DfpMath.split(x);
		org.apache.commons.math.dfp.Dfp[] spy = new org.apache.commons.math.dfp.Dfp[2];
		spy[0] = org.apache.commons.math.dfp.DfpMath.pow(a.getTwo(), p2);
		spx[0] = spx[0].divide(spy[0]);
		spx[1] = spx[1].divide(spy[0]);
		spy[0] = a.newInstance("1.33333");
		while (spx[0].add(spx[1]).greaterThan(spy[0])) {
			spx[0] = spx[0].divide(2);
			spx[1] = spx[1].divide(2);
			p2++;
		} 
		org.apache.commons.math.dfp.Dfp[] spz = org.apache.commons.math.dfp.DfpMath.logInternal(spx);
		spx[0] = a.newInstance(new java.lang.StringBuffer().append((p2 + (4 * lr))).toString());
		spx[1] = a.getZero();
		spy = org.apache.commons.math.dfp.DfpMath.splitMult(a.getField().getLn2Split(), spx);
		spz[0] = spz[0].add(spy[0]);
		spz[1] = spz[1].add(spy[1]);
		spx[0] = a.newInstance(new java.lang.StringBuffer().append((4 * lr)).toString());
		spx[1] = a.getZero();
		spy = org.apache.commons.math.dfp.DfpMath.splitMult(a.getField().getLn5Split(), spx);
		spz[0] = spz[0].add(spy[0]);
		spz[1] = spz[1].add(spy[1]);
		return a.newInstance(spz[0].add(spz[1]));
	}

	protected static org.apache.commons.math.dfp.Dfp[] logInternal(final org.apache.commons.math.dfp.Dfp[] a) {
		org.apache.commons.math.dfp.Dfp t = a[0].divide(4).add(a[1].divide(4));
		org.apache.commons.math.dfp.Dfp x = t.add(a[0].newInstance("-0.25")).divide(t.add(a[0].newInstance("0.25")));
		org.apache.commons.math.dfp.Dfp y = new org.apache.commons.math.dfp.Dfp(x);
		org.apache.commons.math.dfp.Dfp num = new org.apache.commons.math.dfp.Dfp(x);
		org.apache.commons.math.dfp.Dfp py = new org.apache.commons.math.dfp.Dfp(y);
		int den = 1;
		for (int i = 0; i < 10000; i++) {
			num = num.multiply(x);
			num = num.multiply(x);
			den = den + 2;
			t = num.divide(den);
			y = y.add(t);
			if (y.equals(py)) {
				break;
			}
			py = new org.apache.commons.math.dfp.Dfp(y);
		}
		y = y.multiply(a[0].getTwo());
		return org.apache.commons.math.dfp.DfpMath.split(y);
	}

	public static org.apache.commons.math.dfp.Dfp pow(org.apache.commons.math.dfp.Dfp x, final org.apache.commons.math.dfp.Dfp y) {
		if ((x.getField().getRadixDigits()) != (y.getField().getRadixDigits())) {
			x.getField().setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
			final org.apache.commons.math.dfp.Dfp result = x.newInstance(x.getZero());
			result.nans = org.apache.commons.math.dfp.Dfp.QNAN;
			return x.dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.DfpMath.POW_TRAP, x, result);
		}
		final org.apache.commons.math.dfp.Dfp zero = x.getZero();
		final org.apache.commons.math.dfp.Dfp one = x.getOne();
		final org.apache.commons.math.dfp.Dfp two = x.getTwo();
		boolean invert = false;
		int ui;
		if (y.equals(zero)) {
			return x.newInstance(one);
		}
		if (y.equals(one)) {
			if (x.isNaN()) {
				x.getField().setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
				return x.dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.DfpMath.POW_TRAP, x, x);
			}
			return x;
		}
		if ((x.isNaN()) || (y.isNaN())) {
			x.getField().setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
			return x.dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.DfpMath.POW_TRAP, x, x.newInstance(((byte) (1)), ((byte) (org.apache.commons.math.dfp.Dfp.QNAN))));
		}
		if (x.equals(zero)) {
			if (org.apache.commons.math.dfp.Dfp.copysign(one, x).greaterThan(zero)) {
				if (y.greaterThan(zero)) {
					return x.newInstance(zero);
				}else {
					return x.newInstance(x.newInstance(((byte) (1)), ((byte) (org.apache.commons.math.dfp.Dfp.INFINITE))));
				}
			}else {
				if ((((y.classify()) == (org.apache.commons.math.dfp.Dfp.FINITE)) && (y.rint().equals(y))) && (!(y.remainder(two).equals(zero)))) {
					if (y.greaterThan(zero)) {
						return x.newInstance(zero.negate());
					}else {
						return x.newInstance(x.newInstance(((byte) (-1)), ((byte) (org.apache.commons.math.dfp.Dfp.INFINITE))));
					}
				}else {
					if (y.greaterThan(zero)) {
						return x.newInstance(zero);
					}else {
						return x.newInstance(x.newInstance(((byte) (1)), ((byte) (org.apache.commons.math.dfp.Dfp.INFINITE))));
					}
				}
			}
		}
		if (x.lessThan(zero)) {
			x = x.negate();
			invert = true;
		}
		if ((x.greaterThan(one)) && ((y.classify()) == (org.apache.commons.math.dfp.Dfp.INFINITE))) {
			if (y.greaterThan(zero)) {
				return y;
			}else {
				return x.newInstance(zero);
			}
		}
		if ((x.lessThan(one)) && ((y.classify()) == (org.apache.commons.math.dfp.Dfp.INFINITE))) {
			if (y.greaterThan(zero)) {
				return x.newInstance(zero);
			}else {
				return x.newInstance(org.apache.commons.math.dfp.Dfp.copysign(y, one));
			}
		}
		if ((x.equals(one)) && ((y.classify()) == (org.apache.commons.math.dfp.Dfp.INFINITE))) {
			x.getField().setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
			return x.dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.DfpMath.POW_TRAP, x, x.newInstance(((byte) (1)), ((byte) (org.apache.commons.math.dfp.Dfp.QNAN))));
		}
		if ((x.classify()) == (org.apache.commons.math.dfp.Dfp.INFINITE)) {
			if (invert) {
				if ((((y.classify()) == (org.apache.commons.math.dfp.Dfp.FINITE)) && (y.rint().equals(y))) && (!(y.remainder(two).equals(zero)))) {
					if (y.greaterThan(zero)) {
						return x.newInstance(x.newInstance(((byte) (-1)), ((byte) (org.apache.commons.math.dfp.Dfp.INFINITE))));
					}else {
						return x.newInstance(zero.negate());
					}
				}else {
					if (y.greaterThan(zero)) {
						return x.newInstance(x.newInstance(((byte) (1)), ((byte) (org.apache.commons.math.dfp.Dfp.INFINITE))));
					}else {
						return x.newInstance(zero);
					}
				}
			}else {
				if (y.greaterThan(zero)) {
					return x;
				}else {
					return x.newInstance(zero);
				}
			}
		}
		if (invert && (!(y.rint().equals(y)))) {
			x.getField().setIEEEFlagsBits(org.apache.commons.math.dfp.DfpField.FLAG_INVALID);
			return x.dotrap(org.apache.commons.math.dfp.DfpField.FLAG_INVALID, org.apache.commons.math.dfp.DfpMath.POW_TRAP, x, x.newInstance(((byte) (1)), ((byte) (org.apache.commons.math.dfp.Dfp.QNAN))));
		}
		org.apache.commons.math.dfp.Dfp r;
		if ((y.lessThan(x.newInstance(100000000))) && (y.greaterThan(x.newInstance((-100000000))))) {
			final org.apache.commons.math.dfp.Dfp u = y.rint();
			ui = u.intValue();
			final org.apache.commons.math.dfp.Dfp v = y.subtract(u);
			if (v.unequal(zero)) {
				final org.apache.commons.math.dfp.Dfp a = v.multiply(org.apache.commons.math.dfp.DfpMath.log(x));
				final org.apache.commons.math.dfp.Dfp b = a.divide(x.getField().getLn2()).rint();
				final org.apache.commons.math.dfp.Dfp c = a.subtract(b.multiply(x.getField().getLn2()));
				r = org.apache.commons.math.dfp.DfpMath.splitPow(org.apache.commons.math.dfp.DfpMath.split(x), ui);
				r = r.multiply(org.apache.commons.math.dfp.DfpMath.pow(two, b.intValue()));
				r = r.multiply(org.apache.commons.math.dfp.DfpMath.exp(c));
			}else {
				r = org.apache.commons.math.dfp.DfpMath.splitPow(org.apache.commons.math.dfp.DfpMath.split(x), ui);
			}
		}else {
			r = org.apache.commons.math.dfp.DfpMath.exp(org.apache.commons.math.dfp.DfpMath.log(x).multiply(y));
		}
		if (invert) {
			if ((y.rint().equals(y)) && (!(y.remainder(two).equals(zero)))) {
				r = r.negate();
			}
		}
		return x.newInstance(r);
	}

	protected static org.apache.commons.math.dfp.Dfp sinInternal(org.apache.commons.math.dfp.Dfp[] a) {
		org.apache.commons.math.dfp.Dfp c = a[0].add(a[1]);
		org.apache.commons.math.dfp.Dfp y = c;
		c = c.multiply(c);
		org.apache.commons.math.dfp.Dfp x = y;
		org.apache.commons.math.dfp.Dfp fact = a[0].getOne();
		org.apache.commons.math.dfp.Dfp py = new org.apache.commons.math.dfp.Dfp(y);
		for (int i = 3; i < 90; i += 2) {
			x = x.multiply(c);
			x = x.negate();
			fact = fact.divide(((i - 1) * i));
			y = y.add(x.multiply(fact));
			if (y.equals(py))
				break;
			
			py = new org.apache.commons.math.dfp.Dfp(y);
		}
		return y;
	}

	protected static org.apache.commons.math.dfp.Dfp cosInternal(org.apache.commons.math.dfp.Dfp[] a) {
		final org.apache.commons.math.dfp.Dfp one = a[0].getOne();
		org.apache.commons.math.dfp.Dfp x = one;
		org.apache.commons.math.dfp.Dfp y = one;
		org.apache.commons.math.dfp.Dfp c = a[0].add(a[1]);
		c = c.multiply(c);
		org.apache.commons.math.dfp.Dfp fact = one;
		org.apache.commons.math.dfp.Dfp py = new org.apache.commons.math.dfp.Dfp(y);
		for (int i = 2; i < 90; i += 2) {
			x = x.multiply(c);
			x = x.negate();
			fact = fact.divide(((i - 1) * i));
			y = y.add(x.multiply(fact));
			if (y.equals(py)) {
				break;
			}
			py = new org.apache.commons.math.dfp.Dfp(y);
		}
		return y;
	}

	public static org.apache.commons.math.dfp.Dfp sin(final org.apache.commons.math.dfp.Dfp a) {
		final org.apache.commons.math.dfp.Dfp pi = a.getField().getPi();
		final org.apache.commons.math.dfp.Dfp zero = a.getField().getZero();
		boolean neg = false;
		org.apache.commons.math.dfp.Dfp x = a.remainder(pi.multiply(2));
		if (x.lessThan(zero)) {
			x = x.negate();
			neg = true;
		}
		if (x.greaterThan(pi.divide(2))) {
			x = pi.subtract(x);
		}
		org.apache.commons.math.dfp.Dfp y;
		if (x.lessThan(pi.divide(4))) {
			org.apache.commons.math.dfp.Dfp[] c = new org.apache.commons.math.dfp.Dfp[2];
			c[0] = x;
			c[1] = zero;
			y = org.apache.commons.math.dfp.DfpMath.sinInternal(org.apache.commons.math.dfp.DfpMath.split(x));
		}else {
			final org.apache.commons.math.dfp.Dfp[] c = new org.apache.commons.math.dfp.Dfp[2];
			final org.apache.commons.math.dfp.Dfp[] piSplit = a.getField().getPiSplit();
			c[0] = piSplit[0].divide(2).subtract(x);
			c[1] = piSplit[1].divide(2);
			y = org.apache.commons.math.dfp.DfpMath.cosInternal(c);
		}
		if (neg) {
			y = y.negate();
		}
		return a.newInstance(y);
	}

	public static org.apache.commons.math.dfp.Dfp cos(org.apache.commons.math.dfp.Dfp a) {
		final org.apache.commons.math.dfp.Dfp pi = a.getField().getPi();
		final org.apache.commons.math.dfp.Dfp zero = a.getField().getZero();
		boolean neg = false;
		org.apache.commons.math.dfp.Dfp x = a.remainder(pi.multiply(2));
		if (x.lessThan(zero)) {
			x = x.negate();
		}
		if (x.greaterThan(pi.divide(2))) {
			x = pi.subtract(x);
			neg = true;
		}
		org.apache.commons.math.dfp.Dfp y;
		if (x.lessThan(pi.divide(4))) {
			org.apache.commons.math.dfp.Dfp[] c = new org.apache.commons.math.dfp.Dfp[2];
			c[0] = x;
			c[1] = zero;
			y = org.apache.commons.math.dfp.DfpMath.cosInternal(c);
		}else {
			final org.apache.commons.math.dfp.Dfp[] c = new org.apache.commons.math.dfp.Dfp[2];
			final org.apache.commons.math.dfp.Dfp[] piSplit = a.getField().getPiSplit();
			c[0] = piSplit[0].divide(2).subtract(x);
			c[1] = piSplit[1].divide(2);
			y = org.apache.commons.math.dfp.DfpMath.sinInternal(c);
		}
		if (neg) {
			y = y.negate();
		}
		return a.newInstance(y);
	}

	public static org.apache.commons.math.dfp.Dfp tan(final org.apache.commons.math.dfp.Dfp a) {
		return org.apache.commons.math.dfp.DfpMath.sin(a).divide(org.apache.commons.math.dfp.DfpMath.cos(a));
	}

	protected static org.apache.commons.math.dfp.Dfp atanInternal(final org.apache.commons.math.dfp.Dfp a) {
		org.apache.commons.math.dfp.Dfp y = new org.apache.commons.math.dfp.Dfp(a);
		org.apache.commons.math.dfp.Dfp x = new org.apache.commons.math.dfp.Dfp(y);
		org.apache.commons.math.dfp.Dfp py = new org.apache.commons.math.dfp.Dfp(y);
		for (int i = 3; i < 90; i += 2) {
			x = x.multiply(a);
			x = x.multiply(a);
			x = x.negate();
			y = y.add(x.divide(i));
			if (y.equals(py)) {
				break;
			}
			py = new org.apache.commons.math.dfp.Dfp(y);
		}
		return y;
	}

	public static org.apache.commons.math.dfp.Dfp atan(final org.apache.commons.math.dfp.Dfp a) {
		final org.apache.commons.math.dfp.Dfp zero = a.getField().getZero();
		final org.apache.commons.math.dfp.Dfp one = a.getField().getOne();
		final org.apache.commons.math.dfp.Dfp[] sqr2Split = a.getField().getSqr2Split();
		final org.apache.commons.math.dfp.Dfp[] piSplit = a.getField().getPiSplit();
		boolean recp = false;
		boolean neg = false;
		boolean sub = false;
		final org.apache.commons.math.dfp.Dfp ty = sqr2Split[0].subtract(one).add(sqr2Split[1]);
		org.apache.commons.math.dfp.Dfp x = new org.apache.commons.math.dfp.Dfp(a);
		if (x.lessThan(zero)) {
			neg = true;
			x = x.negate();
		}
		if (x.greaterThan(one)) {
			recp = true;
			x = one.divide(x);
		}
		if (x.greaterThan(ty)) {
			org.apache.commons.math.dfp.Dfp[] sty = new org.apache.commons.math.dfp.Dfp[2];
			sub = true;
			sty[0] = sqr2Split[0].subtract(one);
			sty[1] = sqr2Split[1];
			org.apache.commons.math.dfp.Dfp[] xs = org.apache.commons.math.dfp.DfpMath.split(x);
			org.apache.commons.math.dfp.Dfp[] ds = org.apache.commons.math.dfp.DfpMath.splitMult(xs, sty);
			ds[0] = ds[0].add(one);
			xs[0] = xs[0].subtract(sty[0]);
			xs[1] = xs[1].subtract(sty[1]);
			xs = org.apache.commons.math.dfp.DfpMath.splitDiv(xs, ds);
			x = xs[0].add(xs[1]);
		}
		org.apache.commons.math.dfp.Dfp y = org.apache.commons.math.dfp.DfpMath.atanInternal(x);
		if (sub) {
			y = y.add(piSplit[0].divide(8)).add(piSplit[1].divide(8));
		}
		if (recp) {
			y = piSplit[0].divide(2).subtract(y).add(piSplit[1].divide(2));
		}
		if (neg) {
			y = y.negate();
		}
		return a.newInstance(y);
	}

	public static org.apache.commons.math.dfp.Dfp asin(final org.apache.commons.math.dfp.Dfp a) {
		return org.apache.commons.math.dfp.DfpMath.atan(a.divide(a.getOne().subtract(a.multiply(a)).sqrt()));
	}

	public static org.apache.commons.math.dfp.Dfp acos(org.apache.commons.math.dfp.Dfp a) {
		org.apache.commons.math.dfp.Dfp result;
		boolean negative = false;
		if (a.lessThan(a.getZero())) {
			negative = true;
		}
		a = org.apache.commons.math.dfp.Dfp.copysign(a, a.getOne());
		result = org.apache.commons.math.dfp.DfpMath.atan(a.getOne().subtract(a.multiply(a)).sqrt().divide(a));
		if (negative) {
			result = a.getField().getPi().subtract(result);
		}
		return a.newInstance(result);
	}
}


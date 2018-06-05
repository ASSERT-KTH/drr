

package org.apache.commons.lang.math;


public final class Fraction extends java.lang.Number implements java.lang.Comparable {
	private static final long serialVersionUID = 65382027393090L;

	public static final org.apache.commons.lang.math.Fraction ZERO = new org.apache.commons.lang.math.Fraction(0, 1);

	public static final org.apache.commons.lang.math.Fraction ONE = new org.apache.commons.lang.math.Fraction(1, 1);

	public static final org.apache.commons.lang.math.Fraction ONE_HALF = new org.apache.commons.lang.math.Fraction(1, 2);

	public static final org.apache.commons.lang.math.Fraction ONE_THIRD = new org.apache.commons.lang.math.Fraction(1, 3);

	public static final org.apache.commons.lang.math.Fraction TWO_THIRDS = new org.apache.commons.lang.math.Fraction(2, 3);

	public static final org.apache.commons.lang.math.Fraction ONE_QUARTER = new org.apache.commons.lang.math.Fraction(1, 4);

	public static final org.apache.commons.lang.math.Fraction TWO_QUARTERS = new org.apache.commons.lang.math.Fraction(2, 4);

	public static final org.apache.commons.lang.math.Fraction THREE_QUARTERS = new org.apache.commons.lang.math.Fraction(3, 4);

	public static final org.apache.commons.lang.math.Fraction ONE_FIFTH = new org.apache.commons.lang.math.Fraction(1, 5);

	public static final org.apache.commons.lang.math.Fraction TWO_FIFTHS = new org.apache.commons.lang.math.Fraction(2, 5);

	public static final org.apache.commons.lang.math.Fraction THREE_FIFTHS = new org.apache.commons.lang.math.Fraction(3, 5);

	public static final org.apache.commons.lang.math.Fraction FOUR_FIFTHS = new org.apache.commons.lang.math.Fraction(4, 5);

	private final int numerator;

	private final int denominator;

	private transient int hashCode = 0;

	private transient java.lang.String toString = null;

	private transient java.lang.String toProperString = null;

	private Fraction(int numerator, int denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public static org.apache.commons.lang.math.Fraction getFraction(int numerator, int denominator) {
		if (denominator == 0) {
			throw new java.lang.ArithmeticException("The denominator must not be zero");
		}
		if (denominator < 0) {
			if ((numerator == (java.lang.Integer.MIN_VALUE)) || (denominator == (java.lang.Integer.MIN_VALUE))) {
				throw new java.lang.ArithmeticException("overflow: can't negate");
			}
			numerator = -numerator;
			denominator = -denominator;
		}
		return new org.apache.commons.lang.math.Fraction(numerator, denominator);
	}

	public static org.apache.commons.lang.math.Fraction getFraction(int whole, int numerator, int denominator) {
		if (denominator == 0) {
			throw new java.lang.ArithmeticException("The denominator must not be zero");
		}
		if (denominator < 0) {
			throw new java.lang.ArithmeticException("The denominator must not be negative");
		}
		if (numerator < 0) {
			throw new java.lang.ArithmeticException("The numerator must not be negative");
		}
		long numeratorValue;
		if (whole < 0) {
			numeratorValue = (whole * ((long) (denominator))) - numerator;
		}else {
			numeratorValue = (whole * ((long) (denominator))) + numerator;
		}
		if ((numeratorValue < (java.lang.Integer.MIN_VALUE)) || (numeratorValue > (java.lang.Integer.MAX_VALUE))) {
			throw new java.lang.ArithmeticException("Numerator too large to represent as an Integer.");
		}
		return new org.apache.commons.lang.math.Fraction(((int) (numeratorValue)), denominator);
	}

	public static org.apache.commons.lang.math.Fraction getReducedFraction(int numerator, int denominator) {
		if (denominator == 0) {
			throw new java.lang.ArithmeticException("The denominator must not be zero");
		}
		if (numerator == 0) {
			return org.apache.commons.lang.math.Fraction.ZERO;
		}
		if ((denominator == (java.lang.Integer.MIN_VALUE)) && ((numerator & 1) == 0)) {
			numerator /= 2;
			denominator /= 2;
		}
		if (denominator < 0) {
			if ((numerator == (java.lang.Integer.MIN_VALUE)) || (denominator == (java.lang.Integer.MIN_VALUE))) {
				throw new java.lang.ArithmeticException("overflow: can't negate");
			}
			numerator = -numerator;
			denominator = -denominator;
		}
		int gcd = org.apache.commons.lang.math.Fraction.greatestCommonDivisor(numerator, denominator);
		numerator /= gcd;
		denominator /= gcd;
		return new org.apache.commons.lang.math.Fraction(numerator, denominator);
	}

	public static org.apache.commons.lang.math.Fraction getFraction(double value) {
		int sign = value < 0 ? -1 : 1;
		value = java.lang.Math.abs(value);
		if ((value > (java.lang.Integer.MAX_VALUE)) || (java.lang.Double.isNaN(value))) {
			throw new java.lang.ArithmeticException("The value must not be greater than Integer.MAX_VALUE or NaN");
		}
		int wholeNumber = ((int) (value));
		value -= wholeNumber;
		int numer0 = 0;
		int denom0 = 1;
		int numer1 = 1;
		int denom1 = 0;
		int numer2 = 0;
		int denom2 = 0;
		int a1 = ((int) (value));
		int a2 = 0;
		double x1 = 1;
		double x2 = 0;
		double y1 = value - a1;
		double y2 = 0;
		double delta1;
		double delta2 = java.lang.Double.MAX_VALUE;
		double fraction;
		int i = 1;
		do {
			delta1 = delta2;
			a2 = ((int) (x1 / y1));
			x2 = y1;
			y2 = x1 - (a2 * y1);
			numer2 = (a1 * numer1) + numer0;
			denom2 = (a1 * denom1) + denom0;
			fraction = ((double) (numer2)) / ((double) (denom2));
			delta2 = java.lang.Math.abs((value - fraction));
			a1 = a2;
			x1 = x2;
			y1 = y2;
			numer0 = numer1;
			denom0 = denom1;
			numer1 = numer2;
			denom1 = denom2;
			i++;
		} while ((((delta1 > delta2) && (denom2 <= 10000)) && (denom2 > 0)) && (i < 25) );
		if (i == 25) {
			throw new java.lang.ArithmeticException("Unable to convert double to fraction");
		}
		return org.apache.commons.lang.math.Fraction.getReducedFraction(((numer0 + (wholeNumber * denom0)) * sign), denom0);
	}

	public static org.apache.commons.lang.math.Fraction getFraction(java.lang.String str) {
		if (str == null) {
			throw new java.lang.IllegalArgumentException("The string must not be null");
		}
		int pos = str.indexOf('.');
		if (pos >= 0) {
			return org.apache.commons.lang.math.Fraction.getFraction(java.lang.Double.parseDouble(str));
		}
		pos = str.indexOf(' ');
		if (pos > 0) {
			int whole = java.lang.Integer.parseInt(str.substring(0, pos));
			str = str.substring((pos + 1));
			pos = str.indexOf('/');
			if (pos < 0) {
				throw new java.lang.NumberFormatException("The fraction could not be parsed as the format X Y/Z");
			}else {
				int numer = java.lang.Integer.parseInt(str.substring(0, pos));
				int denom = java.lang.Integer.parseInt(str.substring((pos + 1)));
				return org.apache.commons.lang.math.Fraction.getFraction(whole, numer, denom);
			}
		}
		pos = str.indexOf('/');
		if (pos < 0) {
			return org.apache.commons.lang.math.Fraction.getFraction(java.lang.Integer.parseInt(str), 1);
		}else {
			int numer = java.lang.Integer.parseInt(str.substring(0, pos));
			int denom = java.lang.Integer.parseInt(str.substring((pos + 1)));
			return org.apache.commons.lang.math.Fraction.getFraction(numer, denom);
		}
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public int getProperNumerator() {
		return java.lang.Math.abs(((numerator) % (denominator)));
	}

	public int getProperWhole() {
		return (numerator) / (denominator);
	}

	public int intValue() {
		return (numerator) / (denominator);
	}

	public long longValue() {
		return ((long) (numerator)) / (denominator);
	}

	public float floatValue() {
		return ((float) (numerator)) / ((float) (denominator));
	}

	public double doubleValue() {
		return ((double) (numerator)) / ((double) (denominator));
	}

	public org.apache.commons.lang.math.Fraction reduce() {
		int gcd = org.apache.commons.lang.math.Fraction.greatestCommonDivisor(java.lang.Math.abs(numerator), denominator);
		if (gcd == 1) {
			return org.apache.commons.lang.math.Fraction.this;
		}
		return org.apache.commons.lang.math.Fraction.getFraction(((numerator) / gcd), ((denominator) / gcd));
	}

	public org.apache.commons.lang.math.Fraction invert() {
		if ((numerator) == 0) {
			throw new java.lang.ArithmeticException("Unable to invert zero.");
		}
		if ((numerator) == (java.lang.Integer.MIN_VALUE)) {
			throw new java.lang.ArithmeticException("overflow: can't negate numerator");
		}
		if ((numerator) < 0) {
			return new org.apache.commons.lang.math.Fraction((-(denominator)), (-(numerator)));
		}else {
			return new org.apache.commons.lang.math.Fraction(denominator, numerator);
		}
	}

	public org.apache.commons.lang.math.Fraction negate() {
		if ((numerator) == (java.lang.Integer.MIN_VALUE)) {
			throw new java.lang.ArithmeticException("overflow: too large to negate");
		}
		return new org.apache.commons.lang.math.Fraction((-(numerator)), denominator);
	}

	public org.apache.commons.lang.math.Fraction abs() {
		if ((numerator) >= 0) {
			return org.apache.commons.lang.math.Fraction.this;
		}
		return negate();
	}

	public org.apache.commons.lang.math.Fraction pow(int power) {
		if (power == 1) {
			return org.apache.commons.lang.math.Fraction.this;
		}else
			if (power == 0) {
				return org.apache.commons.lang.math.Fraction.ONE;
			}else
				if (power < 0) {
					if (power == (java.lang.Integer.MIN_VALUE)) {
						return org.apache.commons.lang.math.Fraction.this.invert().pow(2).pow((-(power / 2)));
					}
					return org.apache.commons.lang.math.Fraction.this.invert().pow((-power));
				}else {
					org.apache.commons.lang.math.Fraction f = org.apache.commons.lang.math.Fraction.this.multiplyBy(org.apache.commons.lang.math.Fraction.this);
					if ((power % 2) == 0) {
						return f.pow((power / 2));
					}else {
						return f.pow((power / 2)).multiplyBy(org.apache.commons.lang.math.Fraction.this);
					}
				}
			
		
	}

	private static int greatestCommonDivisor(int u, int v) {
		if (u > 0) {
			u = -u;
		}
		if (v > 0) {
			v = -v;
		}
		int k = 0;
		while ((((u & 1) == 0) && ((v & 1) == 0)) && (k < 31)) {
			u /= 2;
			v /= 2;
			k++;
		} 
		if (k == 31) {
			throw new java.lang.ArithmeticException("overflow: gcd is 2^31");
		}
		int t = (u & 1) == 1 ? v : -(u / 2);
		do {
			while ((t & 1) == 0) {
				t /= 2;
			} 
			if (t > 0) {
				u = -t;
			}else {
				v = t;
			}
			t = (v - u) / 2;
		} while (t != 0 );
		return (-u) * (1 << k);
	}

	private static int mulAndCheck(int x, int y) {
		long m = ((long) (x)) * ((long) (y));
		if ((m < (java.lang.Integer.MIN_VALUE)) || (m > (java.lang.Integer.MAX_VALUE))) {
			throw new java.lang.ArithmeticException("overflow: mul");
		}
		return ((int) (m));
	}

	private static int mulPosAndCheck(int x, int y) {
		long m = ((long) (x)) * ((long) (y));
		if (m > (java.lang.Integer.MAX_VALUE)) {
			throw new java.lang.ArithmeticException("overflow: mulPos");
		}
		return ((int) (m));
	}

	private static int addAndCheck(int x, int y) {
		long s = ((long) (x)) + ((long) (y));
		if ((s < (java.lang.Integer.MIN_VALUE)) || (s > (java.lang.Integer.MAX_VALUE))) {
			throw new java.lang.ArithmeticException("overflow: add");
		}
		return ((int) (s));
	}

	private static int subAndCheck(int x, int y) {
		long s = ((long) (x)) - ((long) (y));
		if ((s < (java.lang.Integer.MIN_VALUE)) || (s > (java.lang.Integer.MAX_VALUE))) {
			throw new java.lang.ArithmeticException("overflow: add");
		}
		return ((int) (s));
	}

	public org.apache.commons.lang.math.Fraction add(org.apache.commons.lang.math.Fraction fraction) {
		return addSub(fraction, true);
	}

	public org.apache.commons.lang.math.Fraction subtract(org.apache.commons.lang.math.Fraction fraction) {
		return addSub(fraction, false);
	}

	private org.apache.commons.lang.math.Fraction addSub(org.apache.commons.lang.math.Fraction fraction, boolean isAdd) {
		if (fraction == null) {
			throw new java.lang.IllegalArgumentException("The fraction must not be null");
		}
		if ((numerator) == 0) {
			return isAdd ? fraction : fraction.negate();
		}
		if ((fraction.numerator) == 0) {
			return org.apache.commons.lang.math.Fraction.this;
		}
		int d1 = org.apache.commons.lang.math.Fraction.greatestCommonDivisor(denominator, fraction.denominator);
		if (d1 == 1) {
			int uvp = org.apache.commons.lang.math.Fraction.mulAndCheck(numerator, fraction.denominator);
			int upv = org.apache.commons.lang.math.Fraction.mulAndCheck(fraction.numerator, denominator);
			return new org.apache.commons.lang.math.Fraction((isAdd ? org.apache.commons.lang.math.Fraction.addAndCheck(uvp, upv) : org.apache.commons.lang.math.Fraction.subAndCheck(uvp, upv)), org.apache.commons.lang.math.Fraction.mulPosAndCheck(denominator, fraction.denominator));
		}
		java.math.BigInteger uvp = java.math.BigInteger.valueOf(numerator).multiply(java.math.BigInteger.valueOf(((fraction.denominator) / d1)));
		java.math.BigInteger upv = java.math.BigInteger.valueOf(fraction.numerator).multiply(java.math.BigInteger.valueOf(((denominator) / d1)));
		java.math.BigInteger t = isAdd ? uvp.add(upv) : uvp.subtract(upv);
		int tmodd1 = t.mod(java.math.BigInteger.valueOf(d1)).intValue();
		int d2 = tmodd1 == 0 ? d1 : org.apache.commons.lang.math.Fraction.greatestCommonDivisor(tmodd1, d1);
		java.math.BigInteger w = t.divide(java.math.BigInteger.valueOf(d2));
		if ((w.bitLength()) > 31) {
			throw new java.lang.ArithmeticException("overflow: numerator too large after multiply");
		}
		return new org.apache.commons.lang.math.Fraction(w.intValue(), org.apache.commons.lang.math.Fraction.mulPosAndCheck(((denominator) / d1), ((fraction.denominator) / d2)));
	}

	public org.apache.commons.lang.math.Fraction multiplyBy(org.apache.commons.lang.math.Fraction fraction) {
		if (fraction == null) {
			throw new java.lang.IllegalArgumentException("The fraction must not be null");
		}
		if (((numerator) == 0) || ((fraction.numerator) == 0)) {
			return org.apache.commons.lang.math.Fraction.ZERO;
		}
		int d1 = org.apache.commons.lang.math.Fraction.greatestCommonDivisor(numerator, fraction.denominator);
		int d2 = org.apache.commons.lang.math.Fraction.greatestCommonDivisor(fraction.numerator, denominator);
		return org.apache.commons.lang.math.Fraction.getReducedFraction(org.apache.commons.lang.math.Fraction.mulAndCheck(((numerator) / d1), ((fraction.numerator) / d2)), org.apache.commons.lang.math.Fraction.mulPosAndCheck(((denominator) / d2), ((fraction.denominator) / d1)));
	}

	public org.apache.commons.lang.math.Fraction divideBy(org.apache.commons.lang.math.Fraction fraction) {
		if (fraction == null) {
			throw new java.lang.IllegalArgumentException("The fraction must not be null");
		}
		if ((fraction.numerator) == 0) {
			throw new java.lang.ArithmeticException("The fraction to divide by must not be zero");
		}
		return multiplyBy(fraction.invert());
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.apache.commons.lang.math.Fraction.this)) {
			return true;
		}
		if ((obj instanceof org.apache.commons.lang.math.Fraction) == false) {
			return false;
		}
		org.apache.commons.lang.math.Fraction other = ((org.apache.commons.lang.math.Fraction) (obj));
		return ((getNumerator()) == (other.getNumerator())) && ((getDenominator()) == (other.getDenominator()));
	}

	public int hashCode() {
		if ((hashCode) == 0) {
			hashCode = (37 * ((37 * 17) + (getNumerator()))) + (getDenominator());
		}
		return hashCode;
	}

	public int compareTo(java.lang.Object object) {
		org.apache.commons.lang.math.Fraction other = ((org.apache.commons.lang.math.Fraction) (object));
		if ((org.apache.commons.lang.math.Fraction.this) == other) {
			return 0;
		}
		if (((numerator) == (other.numerator)) && ((denominator) == (other.denominator))) {
			return 0;
		}
		long first = ((long) (numerator)) * ((long) (other.denominator));
		long second = ((long) (other.numerator)) * ((long) (denominator));
		if (first == second) {
			return 0;
		}else
			if (first < second) {
				return -1;
			}else {
				return 1;
			}
		
	}

	public java.lang.String toString() {
		if ((toString) == null) {
			toString = new java.lang.StringBuffer(32).append(getNumerator()).append('/').append(getDenominator()).toString();
		}
		return toString;
	}

	public java.lang.String toProperString() {
		if ((toProperString) == null) {
			if ((numerator) == 0) {
				toProperString = "0";
			}else
				if ((numerator) == (denominator)) {
					toProperString = "1";
				}else
					if ((numerator) == ((-1) * (denominator))) {
						toProperString = "-1";
					}else
						if (((numerator) > 0 ? -(numerator) : numerator) < (-(denominator))) {
							int properNumerator = getProperNumerator();
							if (properNumerator == 0) {
								toProperString = java.lang.Integer.toString(getProperWhole());
							}else {
								toProperString = new java.lang.StringBuffer(32).append(getProperWhole()).append(' ').append(properNumerator).append('/').append(getDenominator()).toString();
							}
						}else {
							toProperString = new java.lang.StringBuffer(32).append(getNumerator()).append('/').append(getDenominator()).toString();
						}
					
				
			
		}
		return toProperString;
	}
}


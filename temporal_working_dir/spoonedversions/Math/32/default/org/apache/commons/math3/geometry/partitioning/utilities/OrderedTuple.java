

package org.apache.commons.math3.geometry.partitioning.utilities;


public class OrderedTuple implements java.lang.Comparable<org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple> {
	private static final long SIGN_MASK = -9223372036854775808L;

	private static final long EXPONENT_MASK = 9218868437227405312L;

	private static final long MANTISSA_MASK = 4503599627370495L;

	private static final long IMPLICIT_ONE = 4503599627370496L;

	private double[] components;

	private int offset;

	private int lsb;

	private long[] encoding;

	private boolean posInf;

	private boolean negInf;

	private boolean nan;

	public OrderedTuple(final double... components) {
		org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.this.components = components.clone();
		int msb = java.lang.Integer.MIN_VALUE;
		lsb = java.lang.Integer.MAX_VALUE;
		posInf = false;
		negInf = false;
		nan = false;
		for (int i = 0; i < (components.length); ++i) {
			if (java.lang.Double.isInfinite(components[i])) {
				if ((components[i]) < 0) {
					negInf = true;
				}else {
					posInf = true;
				}
			}else
				if (java.lang.Double.isNaN(components[i])) {
					nan = true;
				}else {
					final long b = java.lang.Double.doubleToLongBits(components[i]);
					final long m = org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.mantissa(b);
					if (m != 0) {
						final int e = org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.exponent(b);
						msb = org.apache.commons.math3.util.FastMath.max(msb, (e + (org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.computeMSB(m))));
						lsb = org.apache.commons.math3.util.FastMath.min(lsb, (e + (org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.computeLSB(m))));
					}
				}
			
		}
		if ((posInf) && (negInf)) {
			posInf = false;
			negInf = false;
			nan = true;
		}
		if ((lsb) <= msb) {
			encode((msb + 16));
		}else {
			encoding = new long[]{ 0L };
		}
	}

	private void encode(final int minOffset) {
		offset = minOffset + 31;
		offset -= (offset) % 32;
		if ((((encoding) != null) && ((encoding.length) == 1)) && ((encoding[0]) == 0L)) {
			return ;
		}
		final int neededBits = ((offset) + 1) - (lsb);
		final int neededLongs = (neededBits + 62) / 63;
		encoding = new long[(components.length) * neededLongs];
		int eIndex = 0;
		int shift = 62;
		long word = 0L;
		for (int k = offset; eIndex < (encoding.length); --k) {
			for (int vIndex = 0; vIndex < (components.length); ++vIndex) {
				if ((getBit(vIndex, k)) != 0) {
					word |= 1L << shift;
				}
				if ((shift--) == 0) {
					encoding[(eIndex++)] = word;
					word = 0L;
					shift = 62;
				}
			}
		}
	}

	public int compareTo(final org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple ot) {
		if ((components.length) == (ot.components.length)) {
			if (nan) {
				return +1;
			}else
				if (ot.nan) {
					return -1;
				}else
					if ((negInf) || (ot.posInf)) {
						return -1;
					}else
						if ((posInf) || (ot.negInf)) {
							return +1;
						}else {
							if ((offset) < (ot.offset)) {
								encode(ot.offset);
							}else
								if ((offset) > (ot.offset)) {
									ot.encode(offset);
								}
							
							final int limit = org.apache.commons.math3.util.FastMath.min(encoding.length, ot.encoding.length);
							for (int i = 0; i < limit; ++i) {
								if ((encoding[i]) < (ot.encoding[i])) {
									return -1;
								}else
									if ((encoding[i]) > (ot.encoding[i])) {
										return +1;
									}
								
							}
							if ((encoding.length) < (ot.encoding.length)) {
								return -1;
							}else
								if ((encoding.length) > (ot.encoding.length)) {
									return +1;
								}else {
									return 0;
								}
							
						}
					
				
			
		}
		return (components.length) - (ot.components.length);
	}

	@java.lang.Override
	public boolean equals(final java.lang.Object other) {
		if ((org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.this) == other) {
			return true;
		}else
			if (other instanceof org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple) {
				return (compareTo(((org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple) (other)))) == 0;
			}else {
				return false;
			}
		
	}

	@java.lang.Override
	public int hashCode() {
		return (((((java.util.Arrays.hashCode(components)) ^ (((java.lang.Integer) (offset)).hashCode())) ^ (((java.lang.Integer) (lsb)).hashCode())) ^ (((java.lang.Boolean) (posInf)).hashCode())) ^ (((java.lang.Boolean) (negInf)).hashCode())) ^ (((java.lang.Boolean) (nan)).hashCode());
	}

	public double[] getComponents() {
		return components.clone();
	}

	private static long sign(final long bits) {
		return bits & (org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.SIGN_MASK);
	}

	private static int exponent(final long bits) {
		return ((int) ((bits & (org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.EXPONENT_MASK)) >> 52)) - 1075;
	}

	private static long mantissa(final long bits) {
		return (bits & (org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.EXPONENT_MASK)) == 0 ? (bits & (org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.MANTISSA_MASK)) << 1 : (org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.IMPLICIT_ONE) | (bits & (org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.MANTISSA_MASK));
	}

	private static int computeMSB(final long l) {
		long ll = l;
		long mask = 4294967295L;
		int scale = 32;
		int msb = 0;
		while (scale != 0) {
			if ((ll & mask) != ll) {
				msb |= scale;
				ll = ll >> scale;
			}
			scale = scale >> 1;
			mask = mask >> scale;
		} 
		return msb;
	}

	private static int computeLSB(final long l) {
		long ll = l;
		long mask = -4294967296L;
		int scale = 32;
		int lsb = 0;
		while (scale != 0) {
			if ((ll & mask) == ll) {
				lsb |= scale;
				ll = ll >> scale;
			}
			scale = scale >> 1;
			mask = mask >> scale;
		} 
		return lsb;
	}

	private int getBit(final int i, final int k) {
		final long bits = java.lang.Double.doubleToLongBits(components[i]);
		final int e = org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.exponent(bits);
		if ((k < e) || (k > (offset))) {
			return 0;
		}else
			if (k == (offset)) {
				return (org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.sign(bits)) == 0L ? 1 : 0;
			}else
				if (k > (e + 52)) {
					return (org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.sign(bits)) == 0L ? 0 : 1;
				}else {
					final long m = (org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.sign(bits)) == 0L ? org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.mantissa(bits) : -(org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple.mantissa(bits));
					return ((int) ((m >> (k - e)) & 1L));
				}
			
		
	}
}


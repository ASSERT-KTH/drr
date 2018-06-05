

package com.google.javascript.rhino;


class DToA {
	private static final int DTOBASESTR_BUFFER_SIZE = 1078;

	private static char BASEDIGIT(int digit) {
		return ((char) (digit >= 10 ? ('a' - 10) + digit : '0' + digit));
	}

	static final int DTOSTR_STANDARD = 0;

	static final int DTOSTR_STANDARD_EXPONENTIAL = 1;

	static final int DTOSTR_FIXED = 2;

	static final int DTOSTR_EXPONENTIAL = 3;

	static final int DTOSTR_PRECISION = 4;

	private static final int Frac_mask = 1048575;

	private static final int Exp_shift = 20;

	private static final int Exp_msk1 = 1048576;

	private static final long Frac_maskL = 4503599627370495L;

	private static final int Exp_shiftL = 52;

	private static final long Exp_msk1L = 4503599627370496L;

	private static final int Bias = 1023;

	private static final int P = 53;

	private static final int Exp_shift1 = 20;

	private static final int Exp_mask = 2146435072;

	private static final int Exp_mask_shifted = 2047;

	private static final int Bndry_mask = 1048575;

	private static final int Log2P = 1;

	private static final int Sign_bit = -2147483648;

	private static final int Exp_11 = 1072693248;

	private static final int Ten_pmax = 22;

	private static final int Quick_max = 14;

	private static final int Bletch = 16;

	private static final int Frac_mask1 = 1048575;

	private static final int Int_max = 14;

	private static final int n_bigtens = 5;

	private static final double[] tens = new double[]{ 1.0 , 10.0 , 100.0 , 1000.0 , 10000.0 , 100000.0 , 1000000.0 , 1.0E7 , 1.0E8 , 1.0E9 , 1.0E10 , 1.0E11 , 1.0E12 , 1.0E13 , 1.0E14 , 1.0E15 , 1.0E16 , 1.0E17 , 1.0E18 , 1.0E19 , 1.0E20 , 1.0E21 , 1.0E22 };

	private static final double[] bigtens = new double[]{ 1.0E16 , 1.0E32 , 1.0E64 , 1.0E128 , 1.0E256 };

	@java.lang.SuppressWarnings(value = "fallthrough")
	private static int lo0bits(int y) {
		int k;
		int x = y;
		if ((x & 7) != 0) {
			if ((x & 1) != 0)
				return 0;
			
			if ((x & 2) != 0) {
				return 1;
			}
			return 2;
		}
		k = 0;
		if ((x & 65535) == 0) {
			k = 16;
			x >>>= 16;
		}
		if ((x & 255) == 0) {
			k += 8;
			x >>>= 8;
		}
		if ((x & 15) == 0) {
			k += 4;
			x >>>= 4;
		}
		if ((x & 3) == 0) {
			k += 2;
			x >>>= 2;
		}
		if ((x & 1) == 0) {
			k++;
			x >>>= 1;
			if ((x & 1) == 0)
				return 32;
			
		}
		return k;
	}

	private static int hi0bits(int x) {
		int k = 0;
		if ((x & -65536) == 0) {
			k = 16;
			x <<= 16;
		}
		if ((x & -16777216) == 0) {
			k += 8;
			x <<= 8;
		}
		if ((x & -268435456) == 0) {
			k += 4;
			x <<= 4;
		}
		if ((x & -1073741824) == 0) {
			k += 2;
			x <<= 2;
		}
		if ((x & -2147483648) == 0) {
			k++;
			if ((x & 1073741824) == 0)
				return 32;
			
		}
		return k;
	}

	private static void stuffBits(byte[] bits, int offset, int val) {
		bits[offset] = ((byte) (val >> 24));
		bits[(offset + 1)] = ((byte) (val >> 16));
		bits[(offset + 2)] = ((byte) (val >> 8));
		bits[(offset + 3)] = ((byte) (val));
	}

	private static java.math.BigInteger d2b(double d, int[] e, int[] bits) {
		byte[] dbl_bits;
		int i;
		int k;
		int y;
		int z;
		int de;
		long dBits = java.lang.Double.doubleToLongBits(d);
		int d0 = ((int) (dBits >>> 32));
		int d1 = ((int) (dBits));
		z = d0 & (com.google.javascript.rhino.DToA.Frac_mask);
		d0 &= 2147483647;
		if ((de = d0 >>> (com.google.javascript.rhino.DToA.Exp_shift)) != 0)
			z |= com.google.javascript.rhino.DToA.Exp_msk1;
		
		if ((y = d1) != 0) {
			dbl_bits = new byte[8];
			k = com.google.javascript.rhino.DToA.lo0bits(y);
			y >>>= k;
			if (k != 0) {
				com.google.javascript.rhino.DToA.stuffBits(dbl_bits, 4, (y | (z << (32 - k))));
				z >>= k;
			}else
				com.google.javascript.rhino.DToA.stuffBits(dbl_bits, 4, y);
			
			com.google.javascript.rhino.DToA.stuffBits(dbl_bits, 0, z);
			i = (z != 0) ? 2 : 1;
		}else {
			dbl_bits = new byte[4];
			k = com.google.javascript.rhino.DToA.lo0bits(z);
			z >>>= k;
			com.google.javascript.rhino.DToA.stuffBits(dbl_bits, 0, z);
			k += 32;
			i = 1;
		}
		if (de != 0) {
			e[0] = ((de - (com.google.javascript.rhino.DToA.Bias)) - ((com.google.javascript.rhino.DToA.P) - 1)) + k;
			bits[0] = (com.google.javascript.rhino.DToA.P) - k;
		}else {
			e[0] = (((de - (com.google.javascript.rhino.DToA.Bias)) - ((com.google.javascript.rhino.DToA.P) - 1)) + 1) + k;
			bits[0] = (32 * i) - (com.google.javascript.rhino.DToA.hi0bits(z));
		}
		return new java.math.BigInteger(dbl_bits);
	}

	static java.lang.String JS_dtobasestr(int base, double d) {
		if (!((2 <= base) && (base <= 36)))
			throw new java.lang.IllegalArgumentException(("Bad base: " + base));
		
		if (java.lang.Double.isNaN(d)) {
			return "NaN";
		}else
			if (java.lang.Double.isInfinite(d)) {
				return d > 0.0 ? "Infinity" : "-Infinity";
			}else
				if (d == 0) {
					return "0";
				}
			
		
		boolean negative;
		if (d >= 0.0) {
			negative = false;
		}else {
			negative = true;
			d = -d;
		}
		java.lang.String intDigits;
		double dfloor = java.lang.Math.floor(d);
		long lfloor = ((long) (dfloor));
		if (lfloor == dfloor) {
			intDigits = java.lang.Long.toString((negative ? -lfloor : lfloor), base);
		}else {
			long floorBits = java.lang.Double.doubleToLongBits(dfloor);
			int exp = ((int) (floorBits >> (com.google.javascript.rhino.DToA.Exp_shiftL))) & (com.google.javascript.rhino.DToA.Exp_mask_shifted);
			long mantissa;
			if (exp == 0) {
				mantissa = (floorBits & (com.google.javascript.rhino.DToA.Frac_maskL)) << 1;
			}else {
				mantissa = (floorBits & (com.google.javascript.rhino.DToA.Frac_maskL)) | (com.google.javascript.rhino.DToA.Exp_msk1L);
			}
			if (negative) {
				mantissa = -mantissa;
			}
			exp -= 1075;
			java.math.BigInteger x = java.math.BigInteger.valueOf(mantissa);
			if (exp > 0) {
				x = x.shiftLeft(exp);
			}else
				if (exp < 0) {
					x = x.shiftRight((-exp));
				}
			
			intDigits = x.toString(base);
		}
		if (d == dfloor) {
			return intDigits;
		}else {
			char[] buffer;
			int p;
			int q;
			int digit;
			double df;
			java.math.BigInteger b;
			buffer = new char[com.google.javascript.rhino.DToA.DTOBASESTR_BUFFER_SIZE];
			p = 0;
			df = d - dfloor;
			long dBits = java.lang.Double.doubleToLongBits(d);
			int word0 = ((int) (dBits >> 32));
			int word1 = ((int) (dBits));
			int[] e = new int[1];
			int[] bbits = new int[1];
			b = com.google.javascript.rhino.DToA.d2b(df, e, bbits);
			int s2 = -((word0 >>> (com.google.javascript.rhino.DToA.Exp_shift1)) & ((com.google.javascript.rhino.DToA.Exp_mask) >> (com.google.javascript.rhino.DToA.Exp_shift1)));
			if (s2 == 0)
				s2 = -1;
			
			s2 += (com.google.javascript.rhino.DToA.Bias) + (com.google.javascript.rhino.DToA.P);
			java.math.BigInteger mlo = java.math.BigInteger.valueOf(1);
			java.math.BigInteger mhi = mlo;
			if (((word1 == 0) && ((word0 & (com.google.javascript.rhino.DToA.Bndry_mask)) == 0)) && ((word0 & ((com.google.javascript.rhino.DToA.Exp_mask) & ((com.google.javascript.rhino.DToA.Exp_mask) << 1))) != 0)) {
				s2 += com.google.javascript.rhino.DToA.Log2P;
				mhi = java.math.BigInteger.valueOf((1 << (com.google.javascript.rhino.DToA.Log2P)));
			}
			b = b.shiftLeft(((e[0]) + s2));
			java.math.BigInteger s = java.math.BigInteger.valueOf(1);
			s = s.shiftLeft(s2);
			java.math.BigInteger bigBase = java.math.BigInteger.valueOf(base);
			boolean done = false;
			do {
				b = b.multiply(bigBase);
				java.math.BigInteger[] divResult = b.divideAndRemainder(s);
				b = divResult[1];
				digit = ((char) (divResult[0].intValue()));
				if (mlo == mhi)
					mlo = mhi = mlo.multiply(bigBase);
				else {
					mlo = mlo.multiply(bigBase);
					mhi = mhi.multiply(bigBase);
				}
				int j = b.compareTo(mlo);
				java.math.BigInteger delta = s.subtract(mhi);
				int j1 = (delta.signum()) <= 0 ? 1 : b.compareTo(delta);
				if ((j1 == 0) && ((word1 & 1) == 0)) {
					if (j > 0)
						digit++;
					
					done = true;
				}else
					if ((j < 0) || ((j == 0) && ((word1 & 1) == 0))) {
						if (j1 > 0) {
							b = b.shiftLeft(1);
							j1 = b.compareTo(s);
							if (j1 > 0)
								digit++;
							
						}
						done = true;
					}else
						if (j1 > 0) {
							digit++;
							done = true;
						}
					
				
				buffer[(p++)] = com.google.javascript.rhino.DToA.BASEDIGIT(digit);
			} while (!done );
			java.lang.StringBuffer sb = new java.lang.StringBuffer((((intDigits.length()) + 1) + p));
			sb.append(intDigits);
			sb.append('.');
			sb.append(buffer, 0, p);
			return sb.toString();
		}
	}

	static int word0(double d) {
		long dBits = java.lang.Double.doubleToLongBits(d);
		return ((int) (dBits >> 32));
	}

	static double setWord0(double d, int i) {
		long dBits = java.lang.Double.doubleToLongBits(d);
		dBits = (((long) (i)) << 32) | (dBits & 4294967295L);
		return java.lang.Double.longBitsToDouble(dBits);
	}

	static int word1(double d) {
		long dBits = java.lang.Double.doubleToLongBits(d);
		return ((int) (dBits));
	}

	static java.math.BigInteger pow5mult(java.math.BigInteger b, int k) {
		return b.multiply(java.math.BigInteger.valueOf(5).pow(k));
	}

	static boolean roundOff(java.lang.StringBuffer buf) {
		int i = buf.length();
		while (i != 0) {
			--i;
			char c = buf.charAt(i);
			if (c != '9') {
				buf.setCharAt(i, ((char) (c + 1)));
				buf.setLength((i + 1));
				return false;
			}
		} 
		buf.setLength(0);
		return true;
	}

	@java.lang.SuppressWarnings(value = "fallthrough")
	static int JS_dtoa(double d, int mode, boolean biasUp, int ndigits, boolean[] sign, java.lang.StringBuffer buf) {
		int b2;
		int b5;
		int i;
		int ieps;
		int ilim;
		int ilim0;
		int ilim1;
		int j;
		int j1;
		int k;
		int k0;
		int m2;
		int m5;
		int s2;
		int s5;
		char dig;
		long L;
		long x;
		java.math.BigInteger b;
		java.math.BigInteger b1;
		java.math.BigInteger delta;
		java.math.BigInteger mlo;
		java.math.BigInteger mhi;
		java.math.BigInteger S;
		int[] be = new int[1];
		int[] bbits = new int[1];
		double d2;
		double ds;
		double eps;
		boolean spec_case;
		boolean denorm;
		boolean k_check;
		boolean try_quick;
		boolean leftright;
		if (((com.google.javascript.rhino.DToA.word0(d)) & (com.google.javascript.rhino.DToA.Sign_bit)) != 0) {
			sign[0] = true;
			d = com.google.javascript.rhino.DToA.setWord0(d, ((com.google.javascript.rhino.DToA.word0(d)) & (~(com.google.javascript.rhino.DToA.Sign_bit))));
		}else
			sign[0] = false;
		
		if (((com.google.javascript.rhino.DToA.word0(d)) & (com.google.javascript.rhino.DToA.Exp_mask)) == (com.google.javascript.rhino.DToA.Exp_mask)) {
			buf.append((((com.google.javascript.rhino.DToA.word1(d)) == 0) && (((com.google.javascript.rhino.DToA.word0(d)) & (com.google.javascript.rhino.DToA.Frac_mask)) == 0) ? "Infinity" : "NaN"));
			return 9999;
		}
		if (d == 0) {
			buf.setLength(0);
			buf.append('0');
			return 1;
		}
		b = com.google.javascript.rhino.DToA.d2b(d, be, bbits);
		if ((i = ((com.google.javascript.rhino.DToA.word0(d)) >>> (com.google.javascript.rhino.DToA.Exp_shift1)) & ((com.google.javascript.rhino.DToA.Exp_mask) >> (com.google.javascript.rhino.DToA.Exp_shift1))) != 0) {
			d2 = com.google.javascript.rhino.DToA.setWord0(d, (((com.google.javascript.rhino.DToA.word0(d)) & (com.google.javascript.rhino.DToA.Frac_mask1)) | (com.google.javascript.rhino.DToA.Exp_11)));
			i -= com.google.javascript.rhino.DToA.Bias;
			denorm = false;
		}else {
			i = ((bbits[0]) + (be[0])) + (((com.google.javascript.rhino.DToA.Bias) + ((com.google.javascript.rhino.DToA.P) - 1)) - 1);
			x = (i > 32) ? ((com.google.javascript.rhino.DToA.word0(d)) << (64 - i)) | ((com.google.javascript.rhino.DToA.word1(d)) >>> (i - 32)) : (com.google.javascript.rhino.DToA.word1(d)) << (32 - i);
			d2 = com.google.javascript.rhino.DToA.setWord0(x, ((com.google.javascript.rhino.DToA.word0(x)) - (31 * (com.google.javascript.rhino.DToA.Exp_msk1))));
			i -= (((com.google.javascript.rhino.DToA.Bias) + ((com.google.javascript.rhino.DToA.P) - 1)) - 1) + 1;
			denorm = true;
		}
		ds = (((d2 - 1.5) * 0.289529654602168) + 0.1760912590558) + (i * 0.301029995663981);
		k = ((int) (ds));
		if ((ds < 0.0) && (ds != k))
			k--;
		
		k_check = true;
		if ((k >= 0) && (k <= (com.google.javascript.rhino.DToA.Ten_pmax))) {
			if (d < (com.google.javascript.rhino.DToA.tens[k]))
				k--;
			
			k_check = false;
		}
		j = ((bbits[0]) - i) - 1;
		if (j >= 0) {
			b2 = 0;
			s2 = j;
		}else {
			b2 = -j;
			s2 = 0;
		}
		if (k >= 0) {
			b5 = 0;
			s5 = k;
			s2 += k;
		}else {
			b2 -= k;
			b5 = -k;
			s5 = 0;
		}
		if ((mode < 0) || (mode > 9))
			mode = 0;
		
		try_quick = true;
		if (mode > 5) {
			mode -= 4;
			try_quick = false;
		}
		leftright = true;
		ilim = ilim1 = 0;
		switch (mode) {
			case 0 :
			case 1 :
				ilim = ilim1 = -1;
				i = 18;
				ndigits = 0;
				break;
			case 2 :
				leftright = false;
			case 4 :
				if (ndigits <= 0)
					ndigits = 1;
				
				ilim = ilim1 = i = ndigits;
				break;
			case 3 :
				leftright = false;
			case 5 :
				i = (ndigits + k) + 1;
				ilim = i;
				ilim1 = i - 1;
				if (i <= 0)
					i = 1;
				
		}
		boolean fast_failed = false;
		if (((ilim >= 0) && (ilim <= (com.google.javascript.rhino.DToA.Quick_max))) && try_quick) {
			i = 0;
			d2 = d;
			k0 = k;
			ilim0 = ilim;
			ieps = 2;
			if (k > 0) {
				ds = com.google.javascript.rhino.DToA.tens[(k & 15)];
				j = k >> 4;
				if ((j & (com.google.javascript.rhino.DToA.Bletch)) != 0) {
					j &= (com.google.javascript.rhino.DToA.Bletch) - 1;
					d /= com.google.javascript.rhino.DToA.bigtens[((com.google.javascript.rhino.DToA.n_bigtens) - 1)];
					ieps++;
				}
				for (; j != 0; j >>= 1 , i++)
					if ((j & 1) != 0) {
						ieps++;
						ds *= com.google.javascript.rhino.DToA.bigtens[i];
					}
				
				d /= ds;
			}else
				if ((j1 = -k) != 0) {
					d *= com.google.javascript.rhino.DToA.tens[(j1 & 15)];
					for (j = j1 >> 4; j != 0; j >>= 1 , i++)
						if ((j & 1) != 0) {
							ieps++;
							d *= com.google.javascript.rhino.DToA.bigtens[i];
						}
					
				}
			
			if ((k_check && (d < 1.0)) && (ilim > 0)) {
				if (ilim1 <= 0)
					fast_failed = true;
				else {
					ilim = ilim1;
					k--;
					d *= 10.0;
					ieps++;
				}
			}
			eps = (ieps * d) + 7.0;
			eps = com.google.javascript.rhino.DToA.setWord0(eps, ((com.google.javascript.rhino.DToA.word0(eps)) - (((com.google.javascript.rhino.DToA.P) - 1) * (com.google.javascript.rhino.DToA.Exp_msk1))));
			if (ilim == 0) {
				S = mhi = null;
				d -= 5.0;
				if (d > eps) {
					buf.append('1');
					k++;
					return k + 1;
				}
				if (d < (-eps)) {
					buf.setLength(0);
					buf.append('0');
					return 1;
				}
				fast_failed = true;
			}
			if (!fast_failed) {
				fast_failed = true;
				if (leftright) {
					eps = (0.5 / (com.google.javascript.rhino.DToA.tens[(ilim - 1)])) - eps;
					for (i = 0; ;) {
						L = ((long) (d));
						d -= L;
						buf.append(((char) ('0' + L)));
						if (d < eps) {
							return k + 1;
						}
						if ((1.0 - d) < eps) {
							char lastCh;
							while (true) {
								lastCh = buf.charAt(((buf.length()) - 1));
								buf.setLength(((buf.length()) - 1));
								if (lastCh != '9')
									break;
								
								if ((buf.length()) == 0) {
									k++;
									lastCh = '0';
									break;
								}
							} 
							buf.append(((char) (lastCh + 1)));
							return k + 1;
						}
						if ((++i) >= ilim)
							break;
						
						eps *= 10.0;
						d *= 10.0;
					}
				}else {
					eps *= com.google.javascript.rhino.DToA.tens[(ilim - 1)];
					for (i = 1; ; i++ , d *= 10.0) {
						L = ((long) (d));
						d -= L;
						buf.append(((char) ('0' + L)));
						if (i == ilim) {
							if (d > (0.5 + eps)) {
								char lastCh;
								while (true) {
									lastCh = buf.charAt(((buf.length()) - 1));
									buf.setLength(((buf.length()) - 1));
									if (lastCh != '9')
										break;
									
									if ((buf.length()) == 0) {
										k++;
										lastCh = '0';
										break;
									}
								} 
								buf.append(((char) (lastCh + 1)));
								return k + 1;
							}else
								if (d < (0.5 - eps)) {
									com.google.javascript.rhino.DToA.stripTrailingZeroes(buf);
									return k + 1;
								}
							
							break;
						}
					}
				}
			}
			if (fast_failed) {
				buf.setLength(0);
				d = d2;
				k = k0;
				ilim = ilim0;
			}
		}
		if (((be[0]) >= 0) && (k <= (com.google.javascript.rhino.DToA.Int_max))) {
			ds = com.google.javascript.rhino.DToA.tens[k];
			if ((ndigits < 0) && (ilim <= 0)) {
				S = mhi = null;
				if (((ilim < 0) || (d < (5 * ds))) || ((!biasUp) && (d == (5 * ds)))) {
					buf.setLength(0);
					buf.append('0');
					return 1;
				}
				buf.append('1');
				k++;
				return k + 1;
			}
			for (i = 1; ; i++) {
				L = ((long) (d / ds));
				d -= L * ds;
				buf.append(((char) ('0' + L)));
				if (i == ilim) {
					d += d;
					if ((d > ds) || ((d == ds) && (((L & 1) != 0) || biasUp))) {
						char lastCh;
						while (true) {
							lastCh = buf.charAt(((buf.length()) - 1));
							buf.setLength(((buf.length()) - 1));
							if (lastCh != '9')
								break;
							
							if ((buf.length()) == 0) {
								k++;
								lastCh = '0';
								break;
							}
						} 
						buf.append(((char) (lastCh + 1)));
					}
					break;
				}
				d *= 10.0;
				if (d == 0)
					break;
				
			}
			return k + 1;
		}
		m2 = b2;
		m5 = b5;
		mhi = mlo = null;
		if (leftright) {
			if (mode < 2) {
				i = (denorm) ? (be[0]) + ((((com.google.javascript.rhino.DToA.Bias) + ((com.google.javascript.rhino.DToA.P) - 1)) - 1) + 1) : (1 + (com.google.javascript.rhino.DToA.P)) - (bbits[0]);
			}else {
				j = ilim - 1;
				if (m5 >= j)
					m5 -= j;
				else {
					s5 += j -= m5;
					b5 += j;
					m5 = 0;
				}
				if ((i = ilim) < 0) {
					m2 -= i;
					i = 0;
				}
			}
			b2 += i;
			s2 += i;
			mhi = java.math.BigInteger.valueOf(1);
		}
		if ((m2 > 0) && (s2 > 0)) {
			i = (m2 < s2) ? m2 : s2;
			b2 -= i;
			m2 -= i;
			s2 -= i;
		}
		if (b5 > 0) {
			if (leftright) {
				if (m5 > 0) {
					mhi = com.google.javascript.rhino.DToA.pow5mult(mhi, m5);
					b1 = mhi.multiply(b);
					b = b1;
				}
				if ((j = b5 - m5) != 0)
					b = com.google.javascript.rhino.DToA.pow5mult(b, j);
				
			}else
				b = com.google.javascript.rhino.DToA.pow5mult(b, b5);
			
		}
		S = java.math.BigInteger.valueOf(1);
		if (s5 > 0)
			S = com.google.javascript.rhino.DToA.pow5mult(S, s5);
		
		spec_case = false;
		if (mode < 2) {
			if ((((com.google.javascript.rhino.DToA.word1(d)) == 0) && (((com.google.javascript.rhino.DToA.word0(d)) & (com.google.javascript.rhino.DToA.Bndry_mask)) == 0)) && (((com.google.javascript.rhino.DToA.word0(d)) & ((com.google.javascript.rhino.DToA.Exp_mask) & ((com.google.javascript.rhino.DToA.Exp_mask) << 1))) != 0)) {
				b2 += com.google.javascript.rhino.DToA.Log2P;
				s2 += com.google.javascript.rhino.DToA.Log2P;
				spec_case = true;
			}
		}
		byte[] S_bytes = S.toByteArray();
		int S_hiWord = 0;
		for (int idx = 0; idx < 4; idx++) {
			S_hiWord = S_hiWord << 8;
			if (idx < (S_bytes.length))
				S_hiWord |= (S_bytes[idx]) & 255;
			
		}
		if ((i = ((s5 != 0 ? 32 - (com.google.javascript.rhino.DToA.hi0bits(S_hiWord)) : 1) + s2) & 31) != 0)
			i = 32 - i;
		
		if (i > 4) {
			i -= 4;
			b2 += i;
			m2 += i;
			s2 += i;
		}else
			if (i < 4) {
				i += 28;
				b2 += i;
				m2 += i;
				s2 += i;
			}
		
		if (b2 > 0)
			b = b.shiftLeft(b2);
		
		if (s2 > 0)
			S = S.shiftLeft(s2);
		
		if (k_check) {
			if ((b.compareTo(S)) < 0) {
				k--;
				b = b.multiply(java.math.BigInteger.valueOf(10));
				if (leftright)
					mhi = mhi.multiply(java.math.BigInteger.valueOf(10));
				
				ilim = ilim1;
			}
		}
		if ((ilim <= 0) && (mode > 2)) {
			if (((ilim < 0) || ((i = b.compareTo((S = S.multiply(java.math.BigInteger.valueOf(5))))) < 0)) || ((i == 0) && (!biasUp))) {
				buf.setLength(0);
				buf.append('0');
				return 1;
			}
			buf.append('1');
			k++;
			return k + 1;
		}
		if (leftright) {
			if (m2 > 0)
				mhi = mhi.shiftLeft(m2);
			
			mlo = mhi;
			if (spec_case) {
				mhi = mlo;
				mhi = mhi.shiftLeft(com.google.javascript.rhino.DToA.Log2P);
			}
			for (i = 1; ; i++) {
				java.math.BigInteger[] divResult = b.divideAndRemainder(S);
				b = divResult[1];
				dig = ((char) ((divResult[0].intValue()) + '0'));
				j = b.compareTo(mlo);
				delta = S.subtract(mhi);
				j1 = ((delta.signum()) <= 0) ? 1 : b.compareTo(delta);
				if (((j1 == 0) && (mode == 0)) && (((com.google.javascript.rhino.DToA.word1(d)) & 1) == 0)) {
					if (dig == '9') {
						buf.append('9');
						if (com.google.javascript.rhino.DToA.roundOff(buf)) {
							k++;
							buf.append('1');
						}
						return k + 1;
					}
					if (j > 0)
						dig++;
					
					buf.append(dig);
					return k + 1;
				}
				if ((j < 0) || (((j == 0) && (mode == 0)) && (((com.google.javascript.rhino.DToA.word1(d)) & 1) == 0))) {
					if (j1 > 0) {
						b = b.shiftLeft(1);
						j1 = b.compareTo(S);
						if (((j1 > 0) || ((j1 == 0) && (((dig & 1) == 1) || biasUp))) && ((dig++) == '9')) {
							buf.append('9');
							if (com.google.javascript.rhino.DToA.roundOff(buf)) {
								k++;
								buf.append('1');
							}
							return k + 1;
						}
					}
					buf.append(dig);
					return k + 1;
				}
				if (j1 > 0) {
					if (dig == '9') {
						buf.append('9');
						if (com.google.javascript.rhino.DToA.roundOff(buf)) {
							k++;
							buf.append('1');
						}
						return k + 1;
					}
					buf.append(((char) (dig + 1)));
					return k + 1;
				}
				buf.append(dig);
				if (i == ilim)
					break;
				
				b = b.multiply(java.math.BigInteger.valueOf(10));
				if (mlo == mhi)
					mlo = mhi = mhi.multiply(java.math.BigInteger.valueOf(10));
				else {
					mlo = mlo.multiply(java.math.BigInteger.valueOf(10));
					mhi = mhi.multiply(java.math.BigInteger.valueOf(10));
				}
			}
		}else
			for (i = 1; ; i++) {
				java.math.BigInteger[] divResult = b.divideAndRemainder(S);
				b = divResult[1];
				dig = ((char) ((divResult[0].intValue()) + '0'));
				buf.append(dig);
				if (i >= ilim)
					break;
				
				b = b.multiply(java.math.BigInteger.valueOf(10));
			}
		
		b = b.shiftLeft(1);
		j = b.compareTo(S);
		if ((j > 0) || ((j == 0) && (((dig & 1) == 1) || biasUp))) {
			if (com.google.javascript.rhino.DToA.roundOff(buf)) {
				k++;
				buf.append('1');
				return k + 1;
			}
		}else {
			com.google.javascript.rhino.DToA.stripTrailingZeroes(buf);
		}
		return k + 1;
	}

	private static void stripTrailingZeroes(java.lang.StringBuffer buf) {
		int bl = buf.length();
		while (((bl--) > 0) && ((buf.charAt(bl)) == '0')) {
		} 
		buf.setLength((bl + 1));
	}

	private static final int[] dtoaModes = new int[]{ 0 , 0 , 3 , 2 , 2 };

	@java.lang.SuppressWarnings(value = "fallthrough")
	static void JS_dtostr(java.lang.StringBuffer buffer, int mode, int precision, double d) {
		int decPt;
		boolean[] sign = new boolean[1];
		int nDigits;
		if ((mode == (com.google.javascript.rhino.DToA.DTOSTR_FIXED)) && ((d >= 1.0E21) || (d <= (-1.0E21))))
			mode = com.google.javascript.rhino.DToA.DTOSTR_STANDARD;
		
		decPt = com.google.javascript.rhino.DToA.JS_dtoa(d, com.google.javascript.rhino.DToA.dtoaModes[mode], (mode >= (com.google.javascript.rhino.DToA.DTOSTR_FIXED)), precision, sign, buffer);
		nDigits = buffer.length();
		if (decPt != 9999) {
			boolean exponentialNotation = false;
			int minNDigits = 0;
			int p;
			int q;
			switch (mode) {
				case com.google.javascript.rhino.DToA.DTOSTR_STANDARD :
					if ((decPt < (-5)) || (decPt > 21))
						exponentialNotation = true;
					else
						minNDigits = decPt;
					
					break;
				case com.google.javascript.rhino.DToA.DTOSTR_FIXED :
					if (precision >= 0)
						minNDigits = decPt + precision;
					else
						minNDigits = decPt;
					
					break;
				case com.google.javascript.rhino.DToA.DTOSTR_EXPONENTIAL :
					minNDigits = precision;
				case com.google.javascript.rhino.DToA.DTOSTR_STANDARD_EXPONENTIAL :
					exponentialNotation = true;
					break;
				case com.google.javascript.rhino.DToA.DTOSTR_PRECISION :
					minNDigits = precision;
					if ((decPt < (-5)) || (decPt > precision))
						exponentialNotation = true;
					
					break;
			}
			if (nDigits < minNDigits) {
				p = minNDigits;
				nDigits = minNDigits;
				do {
					buffer.append('0');
				} while ((buffer.length()) != p );
			}
			if (exponentialNotation) {
				if (nDigits != 1) {
					buffer.insert(1, '.');
				}
				buffer.append('e');
				if ((decPt - 1) >= 0)
					buffer.append('+');
				
				buffer.append((decPt - 1));
			}else
				if (decPt != nDigits) {
					if (decPt > 0) {
						buffer.insert(decPt, '.');
					}else {
						for (int i = 0; i < (1 - decPt); i++)
							buffer.insert(0, '0');
						
						buffer.insert(1, '.');
					}
				}
			
		}
		if (((sign[0]) && (!(((com.google.javascript.rhino.DToA.word0(d)) == (com.google.javascript.rhino.DToA.Sign_bit)) && ((com.google.javascript.rhino.DToA.word1(d)) == 0)))) && (!((((com.google.javascript.rhino.DToA.word0(d)) & (com.google.javascript.rhino.DToA.Exp_mask)) == (com.google.javascript.rhino.DToA.Exp_mask)) && (((com.google.javascript.rhino.DToA.word1(d)) != 0) || (((com.google.javascript.rhino.DToA.word0(d)) & (com.google.javascript.rhino.DToA.Frac_mask)) != 0))))) {
			buffer.insert(0, '-');
		}
	}
}


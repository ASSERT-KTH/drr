

package org.apache.commons.math.util;


public class FastMath {
	public static final double PI = (1.05414357E8 / 3.3554432E7) + 1.984187159361081E-9;

	public static final double E = (2850325.0 / 1048576.0) + 8.254840070411029E-8;

	private static final double[] EXP_INT_TABLE_A = new double[1500];

	private static final double[] EXP_INT_TABLE_B = new double[1500];

	private static final double[] EXP_FRAC_TABLE_A = new double[1025];

	private static final double[] EXP_FRAC_TABLE_B = new double[1025];

	private static final double[] FACT = new double[20];

	private static final double[][] LN_MANT = new double[1024][];

	private static final double LN_2_A = 0.6931470632553101;

	private static final double LN_2_B = 1.1730463525082348E-7;

	private static final double[][] LN_SPLIT_COEF = new double[][]{ new double[]{ 2.0 , 0.0 } , new double[]{ 0.6666666269302368 , 3.9736429850260626E-8 } , new double[]{ 0.3999999761581421 , 2.3841857910019882E-8 } , new double[]{ 0.2857142686843872 , 1.7029898543501842E-8 } , new double[]{ 0.2222222089767456 , 1.3245471311735498E-8 } , new double[]{ 0.1818181574344635 , 2.4384203044354907E-8 } , new double[]{ 0.1538461446762085 , 9.140260083262505E-9 } , new double[]{ 0.13333332538604736 , 9.220590270857665E-9 } , new double[]{ 0.11764700710773468 , 1.2393345855018391E-8 } , new double[]{ 0.10526403784751892 , 8.251545029714408E-9 } , new double[]{ 0.0952233225107193 , 1.2675934823758863E-8 } , new double[]{ 0.08713622391223907 , 1.1430250008909141E-8 } , new double[]{ 0.07842259109020233 , 2.404307984052299E-9 } , new double[]{ 0.08371849358081818 , 1.176342548272881E-8 } , new double[]{ 0.030589580535888672 , 1.2958646899018938E-9 } , new double[]{ 0.14982303977012634 , 1.225743062930824E-8 } };

	private static final double[][] LN_QUICK_COEF = new double[][]{ new double[]{ 1.0 , 5.669184079525E-24 } , new double[]{ -0.25 , -0.25 } , new double[]{ 0.3333333134651184 , 1.986821492305628E-8 } , new double[]{ -0.25 , -6.663542893624021E-14 } , new double[]{ 0.19999998807907104 , 1.1921056801463227E-8 } , new double[]{ -0.1666666567325592 , -7.800414592973399E-9 } , new double[]{ 0.1428571343421936 , 5.650007086920087E-9 } , new double[]{ -0.12502530217170715 , -7.44321345601866E-11 } , new double[]{ 0.11113807559013367 , 9.219544613762692E-9 } };

	private static final double[][] LN_HI_PREC_COEF = new double[][]{ new double[]{ 1.0 , -6.032174644509064E-23 } , new double[]{ -0.25 , -0.25 } , new double[]{ 0.3333333134651184 , 1.9868161777724352E-8 } , new double[]{ -0.2499999701976776 , -2.957007209750105E-8 } , new double[]{ 0.19999954104423523 , 1.5830993332061267E-10 } , new double[]{ -0.16624879837036133 , -2.6033824355191673E-8 } };

	private static final double[] SINE_TABLE_A = new double[14];

	private static final double[] SINE_TABLE_B = new double[14];

	private static final double[] COSINE_TABLE_A = new double[14];

	private static final double[] COSINE_TABLE_B = new double[14];

	private static final double[] TANGENT_TABLE_A = new double[14];

	private static final double[] TANGENT_TABLE_B = new double[14];

	private static long[] RECIP_2PI = new long[]{ (683565275L << 32) | 2475754826L , (2131351028L << 32) | 2102212464L , (920167782L << 32) | 1326507024L , (2140428522L << 32) | 4155437400L , (1841896334L << 32) | 2425582776L , (26364858L << 32) | 2188665991L , (1065843399L << 32) | 743074255L , (3122695549L << 32) | 1269748001L , (979835913L << 32) | 2904022928L , (1315206542L << 32) | 1624559229L , (656480226L << 32) | 4018031118L , (3355321855L << 32) | 4152452611L , (4224435298L << 32) | 3598883655L , (3679297459L << 32) | 3388129901L , (3553726425L << 32) | 2811755147L , (1565126321L << 32) | 4210654302L , (3477196413L << 32) | 3801392314L , 2600392684L << 32 };

	private static long[] PI_O_4_BITS = new long[]{ (3373259426L << 32) | 560513588L , (3301335691L << 32) | 2161908945L };

	private static final double[] EIGHTHES = new double[]{ 0 , 0.125 , 0.25 , 0.375 , 0.5 , 0.625 , 0.75 , 0.875 , 1.0 , 1.125 , 1.25 , 1.375 , 1.5 , 1.625 };

	static {
		int i;
		org.apache.commons.math.util.FastMath.FACT[0] = 1.0;
		for (i = 1; i < 20; i++) {
			org.apache.commons.math.util.FastMath.FACT[i] = (org.apache.commons.math.util.FastMath.FACT[(i - 1)]) * i;
		}
		double[] tmp = new double[2];
		double[] recip = new double[2];
		for (i = 0; i < 750; i++) {
			org.apache.commons.math.util.FastMath.expint(i, tmp);
			org.apache.commons.math.util.FastMath.EXP_INT_TABLE_A[(i + 750)] = tmp[0];
			org.apache.commons.math.util.FastMath.EXP_INT_TABLE_B[(i + 750)] = tmp[1];
			if (i != 0) {
				org.apache.commons.math.util.FastMath.splitReciprocal(tmp, recip);
				org.apache.commons.math.util.FastMath.EXP_INT_TABLE_A[(750 - i)] = recip[0];
				org.apache.commons.math.util.FastMath.EXP_INT_TABLE_B[(750 - i)] = recip[1];
			}
		}
		for (i = 0; i < 1025; i++) {
			org.apache.commons.math.util.FastMath.slowexp((i / 1024.0), tmp);
			org.apache.commons.math.util.FastMath.EXP_FRAC_TABLE_A[i] = tmp[0];
			org.apache.commons.math.util.FastMath.EXP_FRAC_TABLE_B[i] = tmp[1];
		}
		for (i = 0; i < 1024; i++) {
			double d = java.lang.Double.longBitsToDouble(((((long) (i)) << 42) | 4607182418800017408L));
			org.apache.commons.math.util.FastMath.LN_MANT[i] = org.apache.commons.math.util.FastMath.slowLog(d);
		}
		org.apache.commons.math.util.FastMath.buildSinCosTables();
	}

	private FastMath() {
	}

	public static double acos(final double a) {
		return java.lang.Math.acos(a);
	}

	public static double asin(final double a) {
		return java.lang.Math.asin(a);
	}

	public static double sqrt(final double a) {
		return java.lang.Math.sqrt(a);
	}

	public static double cbrt(final double a) {
		return java.lang.Math.cbrt(a);
	}

	public static double cosh(final double a) {
		return 0.5 * ((org.apache.commons.math.util.FastMath.exp(a)) + (org.apache.commons.math.util.FastMath.exp((-a))));
	}

	public static double sinh(double a) {
		boolean negative = false;
		if (a < 0) {
			negative = true;
			a = -a;
		}
		double absSinh;
		if (a > 0.3) {
			absSinh = 0.5 * ((org.apache.commons.math.util.FastMath.exp(a)) - (org.apache.commons.math.util.FastMath.exp((-a))));
		}else {
			final double a2 = a * a;
			if (a > 0.05) {
				absSinh = a * (1 + ((a2 * (1 + ((a2 * (1 + ((a2 * (1 + ((a2 * (1 + (a2 / 110))) / 72))) / 42))) / 20))) / 6));
			}else {
				absSinh = a * (1 + ((a2 * (1 + ((a2 * (1 + (a2 / 42))) / 20))) / 6));
			}
		}
		return negative ? -absSinh : absSinh;
	}

	public static double tanh(double a) {
		boolean negative = false;
		if (a < 0) {
			negative = true;
			a = -a;
		}
		double absTanh;
		if (a > 0.074) {
			final double twoA = 2 * a;
			absTanh = (org.apache.commons.math.util.FastMath.expm1(twoA)) / ((org.apache.commons.math.util.FastMath.exp(twoA)) + 1);
		}else {
			final double a2 = a * a;
			if (a > 0.016) {
				absTanh = a * (1 - ((a2 * (1 - ((a2 * (2 - ((a2 * (17 - ((a2 * (62 - ((a2 * 1382) / 55))) / 9))) / 21))) / 5))) / 3));
			}else {
				absTanh = a * (1 - ((a2 * (1 - ((a2 * (2 - ((a2 * 17) / 21))) / 5))) / 3));
			}
		}
		return negative ? -absTanh : absTanh;
	}

	public static double acosh(final double a) {
		return org.apache.commons.math.util.FastMath.log((a + (org.apache.commons.math.util.FastMath.sqrt(((a * a) - 1)))));
	}

	public static double asinh(double a) {
		boolean negative = false;
		if (a < 0) {
			negative = true;
			a = -a;
		}
		double absAsinh;
		if (a > 0.167) {
			absAsinh = org.apache.commons.math.util.FastMath.log(((org.apache.commons.math.util.FastMath.sqrt(((a * a) + 1))) + a));
		}else {
			final double a2 = a * a;
			if (a > 0.097) {
				absAsinh = a * (1 - ((a2 * ((1 / 3.0) - (((a2 * ((1 / 5.0) - (((a2 * ((1 / 7.0) - (((a2 * ((1 / 9.0) - (((a2 * ((1.0 / 11.0) - (((a2 * ((1.0 / 13.0) - (((a2 * ((1.0 / 15.0) - (((a2 * (1.0 / 17.0)) * 15.0) / 16.0))) * 13.0) / 14.0))) * 11.0) / 12.0))) * 9.0) / 10.0))) * 7.0) / 8.0))) * 5.0) / 6.0))) * 3.0) / 4.0))) / 2.0));
			}else
				if (a > 0.036) {
					absAsinh = a * (1 - ((a2 * ((1 / 3.0) - (((a2 * ((1 / 5.0) - (((a2 * ((1 / 7.0) - (((a2 * ((1 / 9.0) - (((a2 * ((1.0 / 11.0) - (((a2 * (1.0 / 13.0)) * 11.0) / 12.0))) * 9.0) / 10.0))) * 7.0) / 8.0))) * 5.0) / 6.0))) * 3.0) / 4.0))) / 2.0));
				}else
					if (a > 0.0036) {
						absAsinh = a * (1 - ((a2 * ((1 / 3.0) - (((a2 * ((1 / 5.0) - (((a2 * ((1 / 7.0) - (((a2 * (1 / 9.0)) * 7.0) / 8.0))) * 5.0) / 6.0))) * 3.0) / 4.0))) / 2.0));
					}else {
						absAsinh = a * (1 - ((a2 * ((1 / 3.0) - (((a2 * (1 / 5.0)) * 3.0) / 4.0))) / 2.0));
					}
				
			
		}
		return negative ? -absAsinh : absAsinh;
	}

	public static double atanh(double a) {
		boolean negative = false;
		if (a < 0) {
			negative = true;
			a = -a;
		}
		double absAtanh;
		if (a > 0.15) {
			absAtanh = 0.5 * (org.apache.commons.math.util.FastMath.log(((1 + a) / (1 - a))));
		}else {
			final double a2 = a * a;
			if (a > 0.087) {
				absAtanh = a * (1 + (a2 * ((1.0 / 3.0) + (a2 * ((1.0 / 5.0) + (a2 * ((1.0 / 7.0) + (a2 * ((1.0 / 9.0) + (a2 * ((1.0 / 11.0) + (a2 * ((1.0 / 13.0) + (a2 * ((1.0 / 15.0) + (a2 * (1.0 / 17.0)))))))))))))))));
			}else
				if (a > 0.031) {
					absAtanh = a * (1 + (a2 * ((1.0 / 3.0) + (a2 * ((1.0 / 5.0) + (a2 * ((1.0 / 7.0) + (a2 * ((1.0 / 9.0) + (a2 * ((1.0 / 11.0) + (a2 * (1.0 / 13.0)))))))))))));
				}else
					if (a > 0.003) {
						absAtanh = a * (1 + (a2 * ((1.0 / 3.0) + (a2 * ((1.0 / 5.0) + (a2 * ((1.0 / 7.0) + (a2 * (1.0 / 9.0)))))))));
					}else {
						absAtanh = a * (1 + (a2 * ((1.0 / 3.0) + (a2 * (1.0 / 5.0)))));
					}
				
			
		}
		return negative ? -absAtanh : absAtanh;
	}

	public static double signum(final double a) {
		return a < 0.0 ? -1.0 : a > 0.0 ? 1.0 : java.lang.Double.isNaN(a) ? java.lang.Double.NaN : 0.0;
	}

	public static double nextUp(final double a) {
		return org.apache.commons.math.util.FastMath.nextAfter(a, java.lang.Double.POSITIVE_INFINITY);
	}

	public static double random() {
		return java.lang.Math.random();
	}

	public static double exp(double x) {
		return org.apache.commons.math.util.FastMath.exp(x, 0.0, null);
	}

	private static double exp(double x, double extra, double[] hiPrec) {
		double intPartA;
		double intPartB;
		int intVal;
		if (x < 0.0) {
			intVal = ((int) (-x));
			if (intVal > 746) {
				return 0.0;
			}
			if (intVal > 709) {
				final double result = (org.apache.commons.math.util.FastMath.exp((x + 40.19140625), extra, hiPrec)) / 2.85040095144011776E17;
				if (hiPrec != null) {
					hiPrec[0] /= 2.85040095144011776E17;
					hiPrec[1] /= 2.85040095144011776E17;
				}
				return result;
			}
			if (intVal == 709) {
				final double result = (org.apache.commons.math.util.FastMath.exp((x + 1.494140625), extra, hiPrec)) / 4.455505956692757;
				if (hiPrec != null) {
					hiPrec[0] /= 4.455505956692757;
					hiPrec[1] /= 4.455505956692757;
				}
				return result;
			}
			intVal++;
			intPartA = org.apache.commons.math.util.FastMath.EXP_INT_TABLE_A[(750 - intVal)];
			intPartB = org.apache.commons.math.util.FastMath.EXP_INT_TABLE_B[(750 - intVal)];
			intVal = -intVal;
		}else {
			intVal = ((int) (x));
			if (intVal > 709) {
				return java.lang.Double.POSITIVE_INFINITY;
			}
			intPartA = org.apache.commons.math.util.FastMath.EXP_INT_TABLE_A[(750 + intVal)];
			intPartB = org.apache.commons.math.util.FastMath.EXP_INT_TABLE_B[(750 + intVal)];
		}
		final int intFrac = ((int) ((x - intVal) * 1024.0));
		final double fracPartA = org.apache.commons.math.util.FastMath.EXP_FRAC_TABLE_A[intFrac];
		final double fracPartB = org.apache.commons.math.util.FastMath.EXP_FRAC_TABLE_B[intFrac];
		final double epsilon = x - (intVal + (intFrac / 1024.0));
		double z = 0.04168701738764507;
		z = (z * epsilon) + 0.1666666505023083;
		z = (z * epsilon) + 0.5000000000042687;
		z = (z * epsilon) + 1.0;
		z = (z * epsilon) + (-3.940510424527919E-20);
		double tempA = intPartA * fracPartA;
		double tempB = ((intPartA * fracPartB) + (intPartB * fracPartA)) + (intPartB * fracPartB);
		final double tempC = tempB + tempA;
		final double result;
		if (extra != 0.0) {
			result = (((((tempC * extra) * z) + (tempC * extra)) + (tempC * z)) + tempB) + tempA;
		}else {
			result = ((tempC * z) + tempB) + tempA;
		}
		if (hiPrec != null) {
			hiPrec[0] = tempA;
			hiPrec[1] = ((((tempC * extra) * z) + (tempC * extra)) + (tempC * z)) + tempB;
		}
		return result;
	}

	public static double expm1(double x) {
		if ((x != x) || (x == 0.0)) {
			return x;
		}
		if ((x <= (-1.0)) || (x >= 1.0)) {
			double[] hiPrec = new double[2];
			org.apache.commons.math.util.FastMath.exp(x, 0.0, hiPrec);
			if (x > 0.0) {
				return ((-1.0) + (hiPrec[0])) + (hiPrec[1]);
			}else {
				final double ra = (-1.0) + (hiPrec[0]);
				double rb = -((ra + 1.0) - (hiPrec[0]));
				rb += hiPrec[1];
				return ra + rb;
			}
		}
		double baseA;
		double baseB;
		double epsilon;
		boolean negative = false;
		if (x < 0.0) {
			x = -x;
			negative = true;
		}
		{
			int intFrac = ((int) (x * 1024.0));
			double tempA = (org.apache.commons.math.util.FastMath.EXP_FRAC_TABLE_A[intFrac]) - 1.0;
			double tempB = org.apache.commons.math.util.FastMath.EXP_FRAC_TABLE_B[intFrac];
			double temp = tempA + tempB;
			tempB = -((temp - tempA) - tempB);
			tempA = temp;
			temp = tempA * 1.073741824E9;
			baseA = (tempA + temp) - temp;
			baseB = tempB + (tempA - baseA);
			epsilon = x - (intFrac / 1024.0);
		}
		double zb = 0.008336750013465571;
		zb = (zb * epsilon) + 0.041666663879186654;
		zb = (zb * epsilon) + 0.16666666666745392;
		zb = (zb * epsilon) + 0.49999999999999994;
		zb = zb * epsilon;
		zb = zb * epsilon;
		double za = epsilon;
		double temp = za + zb;
		zb = -((temp - za) - zb);
		za = temp;
		temp = za * 1.073741824E9;
		temp = (za + temp) - temp;
		zb += za - temp;
		za = temp;
		double ya = za * baseA;
		temp = ya + (za * baseB);
		double yb = -((temp - ya) - (za * baseB));
		ya = temp;
		temp = ya + (zb * baseA);
		yb += -((temp - ya) - (zb * baseA));
		ya = temp;
		temp = ya + (zb * baseB);
		yb += -((temp - ya) - (zb * baseB));
		ya = temp;
		temp = ya + baseA;
		yb += -((temp - baseA) - ya);
		ya = temp;
		temp = ya + za;
		yb += -((temp - ya) - za);
		ya = temp;
		temp = ya + baseB;
		yb += -((temp - ya) - baseB);
		ya = temp;
		temp = ya + zb;
		yb += -((temp - ya) - zb);
		ya = temp;
		if (negative) {
			double denom = 1.0 + ya;
			double denomr = 1.0 / denom;
			double denomb = (-((denom - 1.0) - ya)) + yb;
			double ratio = ya * denomr;
			temp = ratio * 1.073741824E9;
			final double ra = (ratio + temp) - temp;
			double rb = ratio - ra;
			temp = denom * 1.073741824E9;
			za = (denom + temp) - temp;
			zb = denom - za;
			rb += ((((ya - (za * ra)) - (za * rb)) - (zb * ra)) - (zb * rb)) * denomr;
			rb += yb * denomr;
			rb += (((-ya) * denomb) * denomr) * denomr;
			ya = -ra;
			yb = -rb;
		}
		return ya + yb;
	}

	private static double slowexp(final double x, final double[] result) {
		final double[] xs = new double[2];
		final double[] ys = new double[2];
		final double[] facts = new double[2];
		final double[] as = new double[2];
		org.apache.commons.math.util.FastMath.split(x, xs);
		ys[0] = ys[1] = 0.0;
		for (int i = 19; i >= 0; i--) {
			org.apache.commons.math.util.FastMath.splitMult(xs, ys, as);
			ys[0] = as[0];
			ys[1] = as[1];
			org.apache.commons.math.util.FastMath.split(org.apache.commons.math.util.FastMath.FACT[i], as);
			org.apache.commons.math.util.FastMath.splitReciprocal(as, facts);
			org.apache.commons.math.util.FastMath.splitAdd(ys, facts, as);
			ys[0] = as[0];
			ys[1] = as[1];
		}
		if (result != null) {
			result[0] = ys[0];
			result[1] = ys[1];
		}
		return (ys[0]) + (ys[1]);
	}

	private static void split(final double d, final double[] split) {
		if ((d < 8.0E298) && (d > (-8.0E298))) {
			final double a = d * 1.073741824E9;
			split[0] = (d + a) - a;
			split[1] = d - (split[0]);
		}else {
			final double a = d * 9.313225746154785E-10;
			split[0] = ((d + a) - d) * 1.073741824E9;
			split[1] = d - (split[0]);
		}
	}

	private static void resplit(final double[] a) {
		final double c = (a[0]) + (a[1]);
		final double d = -((c - (a[0])) - (a[1]));
		if ((c < 8.0E298) && (c > (-8.0E298))) {
			double z = c * 1.073741824E9;
			a[0] = (c + z) - z;
			a[1] = (c - (a[0])) + d;
		}else {
			double z = c * 9.313225746154785E-10;
			a[0] = ((c + z) - c) * 1.073741824E9;
			a[1] = (c - (a[0])) + d;
		}
	}

	private static void splitMult(double[] a, double[] b, double[] ans) {
		ans[0] = (a[0]) * (b[0]);
		ans[1] = (((a[0]) * (b[1])) + ((a[1]) * (b[0]))) + ((a[1]) * (b[1]));
		org.apache.commons.math.util.FastMath.resplit(ans);
	}

	private static void splitAdd(final double[] a, final double[] b, final double[] ans) {
		ans[0] = (a[0]) + (b[0]);
		ans[1] = (a[1]) + (b[1]);
		org.apache.commons.math.util.FastMath.resplit(ans);
	}

	private static void splitReciprocal(final double[] in, final double[] result) {
		final double b = 1.0 / 4194304.0;
		final double a = 1.0 - b;
		if ((in[0]) == 0.0) {
			in[0] = in[1];
			in[1] = 0.0;
		}
		result[0] = a / (in[0]);
		result[1] = ((b * (in[0])) - (a * (in[1]))) / (((in[0]) * (in[0])) + ((in[0]) * (in[1])));
		if ((result[1]) != (result[1])) {
			result[1] = 0.0;
		}
		org.apache.commons.math.util.FastMath.resplit(result);
		for (int i = 0; i < 2; i++) {
			double err = (((1.0 - ((result[0]) * (in[0]))) - ((result[0]) * (in[1]))) - ((result[1]) * (in[0]))) - ((result[1]) * (in[1]));
			err = err * ((result[0]) + (result[1]));
			result[1] += err;
		}
	}

	private static void quadMult(final double[] a, final double[] b, final double[] result) {
		final double[] xs = new double[2];
		final double[] ys = new double[2];
		final double[] zs = new double[2];
		org.apache.commons.math.util.FastMath.split(a[0], xs);
		org.apache.commons.math.util.FastMath.split(b[0], ys);
		org.apache.commons.math.util.FastMath.splitMult(xs, ys, zs);
		result[0] = zs[0];
		result[1] = zs[1];
		org.apache.commons.math.util.FastMath.split(b[1], ys);
		org.apache.commons.math.util.FastMath.splitMult(xs, ys, zs);
		double tmp = (result[0]) + (zs[0]);
		result[1] = (result[1]) - ((tmp - (result[0])) - (zs[0]));
		result[0] = tmp;
		tmp = (result[0]) + (zs[1]);
		result[1] = (result[1]) - ((tmp - (result[0])) - (zs[1]));
		result[0] = tmp;
		org.apache.commons.math.util.FastMath.split(a[1], xs);
		org.apache.commons.math.util.FastMath.split(b[0], ys);
		org.apache.commons.math.util.FastMath.splitMult(xs, ys, zs);
		tmp = (result[0]) + (zs[0]);
		result[1] = (result[1]) - ((tmp - (result[0])) - (zs[0]));
		result[0] = tmp;
		tmp = (result[0]) + (zs[1]);
		result[1] = (result[1]) - ((tmp - (result[0])) - (zs[1]));
		result[0] = tmp;
		org.apache.commons.math.util.FastMath.split(a[1], xs);
		org.apache.commons.math.util.FastMath.split(b[1], ys);
		org.apache.commons.math.util.FastMath.splitMult(xs, ys, zs);
		tmp = (result[0]) + (zs[0]);
		result[1] = (result[1]) - ((tmp - (result[0])) - (zs[0]));
		result[0] = tmp;
		tmp = (result[0]) + (zs[1]);
		result[1] = (result[1]) - ((tmp - (result[0])) - (zs[1]));
		result[0] = tmp;
	}

	private static double expint(int p, final double[] result) {
		final double[] xs = new double[2];
		final double[] as = new double[2];
		final double[] ys = new double[2];
		xs[0] = 2.718281828459045;
		xs[1] = 1.4456468917292502E-16;
		org.apache.commons.math.util.FastMath.split(1.0, ys);
		while (p > 0) {
			if ((p & 1) != 0) {
				org.apache.commons.math.util.FastMath.quadMult(ys, xs, as);
				ys[0] = as[0];
				ys[1] = as[1];
			}
			org.apache.commons.math.util.FastMath.quadMult(xs, xs, as);
			xs[0] = as[0];
			xs[1] = as[1];
			p >>= 1;
		} 
		if (result != null) {
			result[0] = ys[0];
			result[1] = ys[1];
			org.apache.commons.math.util.FastMath.resplit(result);
		}
		return (ys[0]) + (ys[1]);
	}

	public static double log(final double x) {
		return org.apache.commons.math.util.FastMath.log(x, null);
	}

	private static double log(final double x, final double[] hiPrec) {
		long bits = java.lang.Double.doubleToLongBits(x);
		if (((bits & -9223372036854775808L) != 0) || (x != x)) {
			if (x != 0.0) {
				if (hiPrec != null) {
					hiPrec[0] = java.lang.Double.NaN;
				}
				return java.lang.Double.NaN;
			}
		}
		if (x == (java.lang.Double.POSITIVE_INFINITY)) {
			if (hiPrec != null) {
				hiPrec[0] = java.lang.Double.POSITIVE_INFINITY;
			}
			return java.lang.Double.POSITIVE_INFINITY;
		}
		int exp = ((int) (bits >> 52)) - 1023;
		if ((bits & 9218868437227405312L) == 0) {
			if (x == 0) {
				if (hiPrec != null) {
					hiPrec[0] = java.lang.Double.NEGATIVE_INFINITY;
				}
				return java.lang.Double.NEGATIVE_INFINITY;
			}
			bits <<= 1;
			while ((bits & 4503599627370496L) == 0) {
				exp--;
				bits <<= 1;
			} 
		}
		if ((exp == (-1)) || (exp == 0)) {
			if (((x < 1.01) && (x > 0.99)) && (hiPrec == null)) {
				double xa = x - 1.0;
				double xb = (xa - x) + 1.0;
				double tmp = xa * 1.073741824E9;
				double aa = (xa + tmp) - tmp;
				double ab = xa - aa;
				xa = aa;
				xb = ab;
				double ya = org.apache.commons.math.util.FastMath.LN_QUICK_COEF[((org.apache.commons.math.util.FastMath.LN_QUICK_COEF.length) - 1)][0];
				double yb = org.apache.commons.math.util.FastMath.LN_QUICK_COEF[((org.apache.commons.math.util.FastMath.LN_QUICK_COEF.length) - 1)][1];
				for (int i = (org.apache.commons.math.util.FastMath.LN_QUICK_COEF.length) - 2; i >= 0; i--) {
					aa = ya * xa;
					ab = ((ya * xb) + (yb * xa)) + (yb * xb);
					tmp = aa * 1.073741824E9;
					ya = (aa + tmp) - tmp;
					yb = (aa - ya) + ab;
					aa = ya + (org.apache.commons.math.util.FastMath.LN_QUICK_COEF[i][0]);
					ab = yb + (org.apache.commons.math.util.FastMath.LN_QUICK_COEF[i][1]);
					tmp = aa * 1.073741824E9;
					ya = (aa + tmp) - tmp;
					yb = (aa - ya) + ab;
				}
				aa = ya * xa;
				ab = ((ya * xb) + (yb * xa)) + (yb * xb);
				tmp = aa * 1.073741824E9;
				ya = (aa + tmp) - tmp;
				yb = (aa - ya) + ab;
				if (hiPrec != null) {
					hiPrec[0] = ya;
					hiPrec[1] = yb;
				}
				return ya + yb;
			}
		}
		double[] lnm = org.apache.commons.math.util.FastMath.LN_MANT[((int) ((bits & 4499201580859392L) >> 42))];
		double epsilon = ((double) (bits & 4398046511103L)) / (4.503599627370496E15 + (bits & 4499201580859392L));
		double lnza = 0.0;
		double lnzb = 0.0;
		if (hiPrec != null) {
			double tmp = epsilon * 1.073741824E9;
			double aa = (epsilon + tmp) - tmp;
			double ab = epsilon - aa;
			double xa = aa;
			double xb = ab;
			double numer = ((double) (bits & 4398046511103L));
			double denom = 4.503599627370496E15 + (bits & 4499201580859392L);
			aa = (numer - (xa * denom)) - (xb * denom);
			xb += aa / denom;
			double ya = org.apache.commons.math.util.FastMath.LN_HI_PREC_COEF[((org.apache.commons.math.util.FastMath.LN_HI_PREC_COEF.length) - 1)][0];
			double yb = org.apache.commons.math.util.FastMath.LN_HI_PREC_COEF[((org.apache.commons.math.util.FastMath.LN_HI_PREC_COEF.length) - 1)][1];
			for (int i = (org.apache.commons.math.util.FastMath.LN_HI_PREC_COEF.length) - 2; i >= 0; i--) {
				aa = ya * xa;
				ab = ((ya * xb) + (yb * xa)) + (yb * xb);
				tmp = aa * 1.073741824E9;
				ya = (aa + tmp) - tmp;
				yb = (aa - ya) + ab;
				aa = ya + (org.apache.commons.math.util.FastMath.LN_HI_PREC_COEF[i][0]);
				ab = yb + (org.apache.commons.math.util.FastMath.LN_HI_PREC_COEF[i][1]);
				tmp = aa * 1.073741824E9;
				ya = (aa + tmp) - tmp;
				yb = (aa - ya) + ab;
			}
			aa = ya * xa;
			ab = ((ya * xb) + (yb * xa)) + (yb * xb);
			lnza = aa + ab;
			lnzb = -((lnza - aa) - ab);
		}else {
			lnza = -0.16624882440418567;
			lnza = (lnza * epsilon) + 0.19999954120254515;
			lnza = (lnza * epsilon) + (-0.2499999997677497);
			lnza = (lnza * epsilon) + 0.3333333333332802;
			lnza = (lnza * epsilon) + (-0.5);
			lnza = (lnza * epsilon) + 1.0;
			lnza = lnza * epsilon;
		}
		double a = (org.apache.commons.math.util.FastMath.LN_2_A) * exp;
		double b = 0.0;
		double c = a + (lnm[0]);
		double d = -((c - a) - (lnm[0]));
		a = c;
		b = b + d;
		c = a + lnza;
		d = -((c - a) - lnza);
		a = c;
		b = b + d;
		c = a + ((org.apache.commons.math.util.FastMath.LN_2_B) * exp);
		d = -((c - a) - ((org.apache.commons.math.util.FastMath.LN_2_B) * exp));
		a = c;
		b = b + d;
		c = a + (lnm[1]);
		d = -((c - a) - (lnm[1]));
		a = c;
		b = b + d;
		c = a + lnzb;
		d = -((c - a) - lnzb);
		a = c;
		b = b + d;
		if (hiPrec != null) {
			hiPrec[0] = a;
			hiPrec[1] = b;
		}
		return a + b;
	}

	public static double log1p(final double x) {
		double xpa = 1.0 + x;
		double xpb = -((xpa - 1.0) - x);
		if ((x > 1.0E-6) || (x < (-1.0E-6))) {
			double[] hiPrec = new double[2];
			org.apache.commons.math.util.FastMath.log(xpa, hiPrec);
			double fx1 = xpb / xpa;
			double epsilon = (0.5 * fx1) + 1.0;
			epsilon = epsilon * fx1;
			return (epsilon + (hiPrec[1])) + (hiPrec[0]);
		}
		double y = (x * 0.333333333333333) - 0.5;
		y = (y * x) + 1.0;
		y = y * x;
		return y;
	}

	public static double log10(final double x) {
		final double[] hiPrec = new double[2];
		org.apache.commons.math.util.FastMath.log(x, hiPrec);
		final double tmp = (hiPrec[0]) * 1.073741824E9;
		final double lna = ((hiPrec[0]) + tmp) - tmp;
		final double lnb = ((hiPrec[0]) - lna) + (hiPrec[1]);
		final double rln10a = 0.4342944622039795;
		final double rln10b = 1.9699272335463627E-8;
		return (((rln10b * lnb) + (rln10b * lna)) + (rln10a * lnb)) + (rln10a * lna);
	}

	public static double pow(double x, double y) {
		final double[] lns = new double[2];
		if (y == 0.0) {
			return 1.0;
		}
		if (x < 0) {
			if (y == ((long) (y))) {
				return (((long) (y)) & 1) == 0 ? org.apache.commons.math.util.FastMath.pow((-x), y) : -(org.apache.commons.math.util.FastMath.pow((-x), y));
			}else {
				return java.lang.Double.NaN;
			}
		}
		if (x == 0) {
			long bits = java.lang.Double.doubleToLongBits(x);
			if ((bits & -9223372036854775808L) != 0) {
				if ((y < 0) && (y == ((long) (y))))
					return java.lang.Double.NEGATIVE_INFINITY;
				
			}
			if (y < 0) {
				return java.lang.Double.POSITIVE_INFINITY;
			}
			if (y > 0) {
				return 0.0;
			}
			return java.lang.Double.NaN;
		}
		if (x == (java.lang.Double.POSITIVE_INFINITY)) {
			if (y < 0.0) {
				return 0.0;
			}else {
				return java.lang.Double.POSITIVE_INFINITY;
			}
		}
		if (y == (java.lang.Double.POSITIVE_INFINITY)) {
			if ((x * x) > 1.0) {
				return java.lang.Double.POSITIVE_INFINITY;
			}else {
				return 0.0;
			}
		}
		if (y == (java.lang.Double.NEGATIVE_INFINITY)) {
			if ((x * x) < 1.0) {
				return java.lang.Double.NEGATIVE_INFINITY;
			}else {
				return 0.0;
			}
		}
		double tmp1 = y * 1.073741824E9;
		final double ya = (y + tmp1) - tmp1;
		final double yb = y - ya;
		org.apache.commons.math.util.FastMath.log(x, lns);
		double lna = lns[0];
		double lnb = lns[1];
		tmp1 = lna * 1.073741824E9;
		final double tmp2 = (lna + tmp1) - tmp1;
		lnb += lna - tmp2;
		lna = tmp2;
		final double aa = lna * ya;
		final double ab = ((lna * yb) + (lnb * ya)) + (lnb * yb);
		lna = aa + ab;
		lnb = -((lna - aa) - ab);
		double z = 1.0 / 120.0;
		z = (z * lnb) + (1.0 / 24.0);
		z = (z * lnb) + (1.0 / 6.0);
		z = (z * lnb) + 0.5;
		z = (z * lnb) + 1.0;
		z = z * lnb;
		final double result = org.apache.commons.math.util.FastMath.exp(lna, z, null);
		return result;
	}

	private static double[] slowLog(double xi) {
		double[] x = new double[2];
		double[] x2 = new double[2];
		double[] y = new double[2];
		double[] a = new double[2];
		org.apache.commons.math.util.FastMath.split(xi, x);
		x[0] += 1.0;
		org.apache.commons.math.util.FastMath.resplit(x);
		org.apache.commons.math.util.FastMath.splitReciprocal(x, a);
		x[0] -= 2.0;
		org.apache.commons.math.util.FastMath.resplit(x);
		org.apache.commons.math.util.FastMath.splitMult(x, a, y);
		x[0] = y[0];
		x[1] = y[1];
		org.apache.commons.math.util.FastMath.splitMult(x, x, x2);
		y[0] = org.apache.commons.math.util.FastMath.LN_SPLIT_COEF[((org.apache.commons.math.util.FastMath.LN_SPLIT_COEF.length) - 1)][0];
		y[1] = org.apache.commons.math.util.FastMath.LN_SPLIT_COEF[((org.apache.commons.math.util.FastMath.LN_SPLIT_COEF.length) - 1)][1];
		for (int i = (org.apache.commons.math.util.FastMath.LN_SPLIT_COEF.length) - 2; i >= 0; i--) {
			org.apache.commons.math.util.FastMath.splitMult(y, x2, a);
			y[0] = a[0];
			y[1] = a[1];
			org.apache.commons.math.util.FastMath.splitAdd(y, org.apache.commons.math.util.FastMath.LN_SPLIT_COEF[i], a);
			y[0] = a[0];
			y[1] = a[1];
		}
		org.apache.commons.math.util.FastMath.splitMult(y, x, a);
		y[0] = a[0];
		y[1] = a[1];
		return y;
	}

	private static double slowSin(final double x, final double[] result) {
		final double[] xs = new double[2];
		final double[] ys = new double[2];
		final double[] facts = new double[2];
		final double[] as = new double[2];
		org.apache.commons.math.util.FastMath.split(x, xs);
		ys[0] = ys[1] = 0.0;
		for (int i = 19; i >= 0; i--) {
			org.apache.commons.math.util.FastMath.splitMult(xs, ys, as);
			ys[0] = as[0];
			ys[1] = as[1];
			if ((i & 1) == 0) {
				continue;
			}
			org.apache.commons.math.util.FastMath.split(org.apache.commons.math.util.FastMath.FACT[i], as);
			org.apache.commons.math.util.FastMath.splitReciprocal(as, facts);
			if ((i & 2) != 0) {
				facts[0] = -(facts[0]);
				facts[1] = -(facts[1]);
			}
			org.apache.commons.math.util.FastMath.splitAdd(ys, facts, as);
			ys[0] = as[0];
			ys[1] = as[1];
		}
		if (result != null) {
			result[0] = ys[0];
			result[1] = ys[1];
		}
		return (ys[0]) + (ys[1]);
	}

	private static double slowCos(final double x, final double[] result) {
		final double[] xs = new double[2];
		final double[] ys = new double[2];
		final double[] facts = new double[2];
		final double[] as = new double[2];
		org.apache.commons.math.util.FastMath.split(x, xs);
		ys[0] = ys[1] = 0.0;
		for (int i = 19; i >= 0; i--) {
			org.apache.commons.math.util.FastMath.splitMult(xs, ys, as);
			ys[0] = as[0];
			ys[1] = as[1];
			if ((i & 1) != 0) {
				continue;
			}
			org.apache.commons.math.util.FastMath.split(org.apache.commons.math.util.FastMath.FACT[i], as);
			org.apache.commons.math.util.FastMath.splitReciprocal(as, facts);
			if ((i & 2) != 0) {
				facts[0] = -(facts[0]);
				facts[1] = -(facts[1]);
			}
			org.apache.commons.math.util.FastMath.splitAdd(ys, facts, as);
			ys[0] = as[0];
			ys[1] = as[1];
		}
		if (result != null) {
			result[0] = ys[0];
			result[1] = ys[1];
		}
		return (ys[0]) + (ys[1]);
	}

	private static void buildSinCosTables() {
		final double[] result = new double[2];
		for (int i = 0; i < 7; i++) {
			double x = i / 8.0;
			org.apache.commons.math.util.FastMath.slowSin(x, result);
			org.apache.commons.math.util.FastMath.SINE_TABLE_A[i] = result[0];
			org.apache.commons.math.util.FastMath.SINE_TABLE_B[i] = result[1];
			org.apache.commons.math.util.FastMath.slowCos(x, result);
			org.apache.commons.math.util.FastMath.COSINE_TABLE_A[i] = result[0];
			org.apache.commons.math.util.FastMath.COSINE_TABLE_B[i] = result[1];
		}
		for (int i = 7; i < 14; i++) {
			double[] xs = new double[2];
			double[] ys = new double[2];
			double[] as = new double[2];
			double[] bs = new double[2];
			double[] temps = new double[2];
			if ((i & 1) == 0) {
				xs[0] = org.apache.commons.math.util.FastMath.SINE_TABLE_A[(i / 2)];
				xs[1] = org.apache.commons.math.util.FastMath.SINE_TABLE_B[(i / 2)];
				ys[0] = org.apache.commons.math.util.FastMath.COSINE_TABLE_A[(i / 2)];
				ys[1] = org.apache.commons.math.util.FastMath.COSINE_TABLE_B[(i / 2)];
				org.apache.commons.math.util.FastMath.splitMult(xs, ys, result);
				org.apache.commons.math.util.FastMath.SINE_TABLE_A[i] = (result[0]) * 2.0;
				org.apache.commons.math.util.FastMath.SINE_TABLE_B[i] = (result[1]) * 2.0;
				org.apache.commons.math.util.FastMath.splitMult(ys, ys, as);
				org.apache.commons.math.util.FastMath.splitMult(xs, xs, temps);
				temps[0] = -(temps[0]);
				temps[1] = -(temps[1]);
				org.apache.commons.math.util.FastMath.splitAdd(as, temps, result);
				org.apache.commons.math.util.FastMath.COSINE_TABLE_A[i] = result[0];
				org.apache.commons.math.util.FastMath.COSINE_TABLE_B[i] = result[1];
			}else {
				xs[0] = org.apache.commons.math.util.FastMath.SINE_TABLE_A[(i / 2)];
				xs[1] = org.apache.commons.math.util.FastMath.SINE_TABLE_B[(i / 2)];
				ys[0] = org.apache.commons.math.util.FastMath.COSINE_TABLE_A[(i / 2)];
				ys[1] = org.apache.commons.math.util.FastMath.COSINE_TABLE_B[(i / 2)];
				as[0] = org.apache.commons.math.util.FastMath.SINE_TABLE_A[((i / 2) + 1)];
				as[1] = org.apache.commons.math.util.FastMath.SINE_TABLE_B[((i / 2) + 1)];
				bs[0] = org.apache.commons.math.util.FastMath.COSINE_TABLE_A[((i / 2) + 1)];
				bs[1] = org.apache.commons.math.util.FastMath.COSINE_TABLE_B[((i / 2) + 1)];
				org.apache.commons.math.util.FastMath.splitMult(xs, bs, temps);
				org.apache.commons.math.util.FastMath.splitMult(ys, as, result);
				org.apache.commons.math.util.FastMath.splitAdd(result, temps, result);
				org.apache.commons.math.util.FastMath.SINE_TABLE_A[i] = result[0];
				org.apache.commons.math.util.FastMath.SINE_TABLE_B[i] = result[1];
				org.apache.commons.math.util.FastMath.splitMult(ys, bs, result);
				org.apache.commons.math.util.FastMath.splitMult(xs, as, temps);
				temps[0] = -(temps[0]);
				temps[1] = -(temps[1]);
				org.apache.commons.math.util.FastMath.splitAdd(result, temps, result);
				org.apache.commons.math.util.FastMath.COSINE_TABLE_A[i] = result[0];
				org.apache.commons.math.util.FastMath.COSINE_TABLE_B[i] = result[1];
			}
		}
		for (int i = 0; i < 14; i++) {
			double[] xs = new double[2];
			double[] ys = new double[2];
			double[] as = new double[2];
			as[0] = org.apache.commons.math.util.FastMath.COSINE_TABLE_A[i];
			as[1] = org.apache.commons.math.util.FastMath.COSINE_TABLE_B[i];
			org.apache.commons.math.util.FastMath.splitReciprocal(as, ys);
			xs[0] = org.apache.commons.math.util.FastMath.SINE_TABLE_A[i];
			xs[1] = org.apache.commons.math.util.FastMath.SINE_TABLE_B[i];
			org.apache.commons.math.util.FastMath.splitMult(xs, ys, as);
			org.apache.commons.math.util.FastMath.TANGENT_TABLE_A[i] = as[0];
			org.apache.commons.math.util.FastMath.TANGENT_TABLE_B[i] = as[1];
		}
	}

	private static double polySine(final double x) {
		double x2 = x * x;
		double p = 2.7553817452272217E-6;
		p = (p * x2) + (-1.9841269659586505E-4);
		p = (p * x2) + 0.008333333333329196;
		p = (p * x2) + (-0.16666666666666666);
		p = (p * x2) * x;
		return p;
	}

	private static double polyCosine(double x) {
		double x2 = x * x;
		double p = 2.479773539153719E-5;
		p = (p * x2) + (-0.0013888888689039883);
		p = (p * x2) + 0.041666666666621166;
		p = (p * x2) + (-0.49999999999999994);
		p *= x2;
		return p;
	}

	private static double sinQ(double xa, double xb) {
		int idx = ((int) ((xa * 8.0) + 0.5));
		final double epsilon = xa - (org.apache.commons.math.util.FastMath.EIGHTHES[idx]);
		final double sintA = org.apache.commons.math.util.FastMath.SINE_TABLE_A[idx];
		final double sintB = org.apache.commons.math.util.FastMath.SINE_TABLE_B[idx];
		final double costA = org.apache.commons.math.util.FastMath.COSINE_TABLE_A[idx];
		final double costB = org.apache.commons.math.util.FastMath.COSINE_TABLE_B[idx];
		double sinEpsA = epsilon;
		double sinEpsB = org.apache.commons.math.util.FastMath.polySine(epsilon);
		final double cosEpsA = 1.0;
		final double cosEpsB = org.apache.commons.math.util.FastMath.polyCosine(epsilon);
		final double temp = sinEpsA * 1.073741824E9;
		double temp2 = (sinEpsA + temp) - temp;
		sinEpsB += sinEpsA - temp2;
		sinEpsA = temp2;
		double result;
		double a = 0;
		double b = 0;
		double t = sintA;
		double c = a + t;
		double d = -((c - a) - t);
		a = c;
		b = b + d;
		t = costA * sinEpsA;
		c = a + t;
		d = -((c - a) - t);
		a = c;
		b = b + d;
		b = (b + (sintA * cosEpsB)) + (costA * sinEpsB);
		b = (((b + sintB) + (costB * sinEpsA)) + (sintB * cosEpsB)) + (costB * sinEpsB);
		if (xb != 0.0) {
			t = (((costA + costB) * (cosEpsA + cosEpsB)) - ((sintA + sintB) * (sinEpsA + sinEpsB))) * xb;
			c = a + t;
			d = -((c - a) - t);
			a = c;
			b = b + d;
		}
		result = a + b;
		return result;
	}

	private static double cosQ(double xa, double xb) {
		final double pi2a = 1.5707963267948966;
		final double pi2b = 6.123233995736766E-17;
		final double a = pi2a - xa;
		double b = -((a - pi2a) + xa);
		b += pi2b - xb;
		return org.apache.commons.math.util.FastMath.sinQ(a, b);
	}

	private static double tanQ(double xa, double xb, boolean cotanFlag) {
		int idx = ((int) ((xa * 8.0) + 0.5));
		final double epsilon = xa - (org.apache.commons.math.util.FastMath.EIGHTHES[idx]);
		final double sintA = org.apache.commons.math.util.FastMath.SINE_TABLE_A[idx];
		final double sintB = org.apache.commons.math.util.FastMath.SINE_TABLE_B[idx];
		final double costA = org.apache.commons.math.util.FastMath.COSINE_TABLE_A[idx];
		final double costB = org.apache.commons.math.util.FastMath.COSINE_TABLE_B[idx];
		double sinEpsA = epsilon;
		double sinEpsB = org.apache.commons.math.util.FastMath.polySine(epsilon);
		final double cosEpsA = 1.0;
		final double cosEpsB = org.apache.commons.math.util.FastMath.polyCosine(epsilon);
		double temp = sinEpsA * 1.073741824E9;
		double temp2 = (sinEpsA + temp) - temp;
		sinEpsB += sinEpsA - temp2;
		sinEpsA = temp2;
		double a = 0;
		double b = 0;
		double t = sintA;
		double c = a + t;
		double d = -((c - a) - t);
		a = c;
		b = b + d;
		t = costA * sinEpsA;
		c = a + t;
		d = -((c - a) - t);
		a = c;
		b = b + d;
		b = (b + (sintA * cosEpsB)) + (costA * sinEpsB);
		b = (((b + sintB) + (costB * sinEpsA)) + (sintB * cosEpsB)) + (costB * sinEpsB);
		double sina = a + b;
		double sinb = -((sina - a) - b);
		a = b = c = d = 0.0;
		t = costA * cosEpsA;
		c = a + t;
		d = -((c - a) - t);
		a = c;
		b = b + d;
		t = (-sintA) * sinEpsA;
		c = a + t;
		d = -((c - a) - t);
		a = c;
		b = b + d;
		b = ((b + (costB * cosEpsA)) + (costA * cosEpsB)) + (costB * cosEpsB);
		b = b - (((sintB * sinEpsA) + (sintA * sinEpsB)) + (sintB * sinEpsB));
		double cosa = a + b;
		double cosb = -((cosa - a) - b);
		if (cotanFlag) {
			double tmp;
			tmp = cosa;
			cosa = sina;
			sina = tmp;
			tmp = cosb;
			cosb = sinb;
			sinb = tmp;
		}
		double est = sina / cosa;
		temp = est * 1.073741824E9;
		double esta = (est + temp) - temp;
		double estb = est - esta;
		temp = cosa * 1.073741824E9;
		double cosaa = (cosa + temp) - temp;
		double cosab = cosa - cosaa;
		double err = ((((sina - (esta * cosaa)) - (esta * cosab)) - (estb * cosaa)) - (estb * cosab)) / cosa;
		err += sinb / cosa;
		err += (((-sina) * cosb) / cosa) / cosa;
		if (xb != 0.0) {
			double xbadj = xb + ((est * est) * xb);
			if (cotanFlag) {
				xbadj = -xbadj;
			}
			err += xbadj;
		}
		return est + err;
	}

	private static void reducePayneHanek(double x, double[] result) {
		long inbits = java.lang.Double.doubleToLongBits(x);
		int exponent = ((int) ((inbits >> 52) & 2047)) - 1023;
		inbits &= 4503599627370495L;
		inbits |= 4503599627370496L;
		exponent++;
		inbits <<= 11;
		long shpi0;
		long shpiA;
		long shpiB;
		int idx = exponent >> 6;
		int shift = exponent - (idx << 6);
		if (shift != 0) {
			shpi0 = (idx == 0) ? 0 : (org.apache.commons.math.util.FastMath.RECIP_2PI[(idx - 1)]) << shift;
			shpi0 |= (org.apache.commons.math.util.FastMath.RECIP_2PI[idx]) >>> (64 - shift);
			shpiA = ((org.apache.commons.math.util.FastMath.RECIP_2PI[idx]) << shift) | ((org.apache.commons.math.util.FastMath.RECIP_2PI[(idx + 1)]) >>> (64 - shift));
			shpiB = ((org.apache.commons.math.util.FastMath.RECIP_2PI[(idx + 1)]) << shift) | ((org.apache.commons.math.util.FastMath.RECIP_2PI[(idx + 2)]) >>> (64 - shift));
		}else {
			shpi0 = (idx == 0) ? 0 : org.apache.commons.math.util.FastMath.RECIP_2PI[(idx - 1)];
			shpiA = org.apache.commons.math.util.FastMath.RECIP_2PI[idx];
			shpiB = org.apache.commons.math.util.FastMath.RECIP_2PI[(idx + 1)];
		}
		long a = inbits >>> 32;
		long b = inbits & 4294967295L;
		long c = shpiA >>> 32;
		long d = shpiA & 4294967295L;
		long ac = a * c;
		long bd = b * d;
		long bc = b * c;
		long ad = a * d;
		long prodB = bd + (ad << 32);
		long prodA = ac + (ad >>> 32);
		boolean bita = (bd & -9223372036854775808L) != 0;
		boolean bitb = (ad & 2147483648L) != 0;
		boolean bitsum = (prodB & -9223372036854775808L) != 0;
		if ((bita && bitb) || ((bita || bitb) && (!bitsum))) {
			prodA++;
		}
		bita = (prodB & -9223372036854775808L) != 0;
		bitb = (bc & 2147483648L) != 0;
		prodB = prodB + (bc << 32);
		prodA = prodA + (bc >>> 32);
		bitsum = (prodB & -9223372036854775808L) != 0;
		if ((bita && bitb) || ((bita || bitb) && (!bitsum))) {
			prodA++;
		}
		c = shpiB >>> 32;
		d = shpiB & 4294967295L;
		ac = a * c;
		bc = b * c;
		ad = a * d;
		ac = ac + ((bc + ad) >>> 32);
		bita = (prodB & -9223372036854775808L) != 0;
		bitb = (ac & -9223372036854775808L) != 0;
		prodB += ac;
		bitsum = (prodB & -9223372036854775808L) != 0;
		if ((bita && bitb) || ((bita || bitb) && (!bitsum))) {
			prodA++;
		}
		c = shpi0 >>> 32;
		d = shpi0 & 4294967295L;
		bd = b * d;
		bc = b * c;
		ad = a * d;
		prodA += bd + ((bc + ad) << 32);
		int intPart = ((int) (prodA >>> 62));
		prodA <<= 2;
		prodA |= prodB >>> 62;
		prodB <<= 2;
		a = prodA >>> 32;
		b = prodA & 4294967295L;
		c = (org.apache.commons.math.util.FastMath.PI_O_4_BITS[0]) >>> 32;
		d = (org.apache.commons.math.util.FastMath.PI_O_4_BITS[0]) & 4294967295L;
		ac = a * c;
		bd = b * d;
		bc = b * c;
		ad = a * d;
		long prod2B = bd + (ad << 32);
		long prod2A = ac + (ad >>> 32);
		bita = (bd & -9223372036854775808L) != 0;
		bitb = (ad & 2147483648L) != 0;
		bitsum = (prod2B & -9223372036854775808L) != 0;
		if ((bita && bitb) || ((bita || bitb) && (!bitsum))) {
			prod2A++;
		}
		bita = (prod2B & -9223372036854775808L) != 0;
		bitb = (bc & 2147483648L) != 0;
		prod2B = prod2B + (bc << 32);
		prod2A = prod2A + (bc >>> 32);
		bitsum = (prod2B & -9223372036854775808L) != 0;
		if ((bita && bitb) || ((bita || bitb) && (!bitsum))) {
			prod2A++;
		}
		c = (org.apache.commons.math.util.FastMath.PI_O_4_BITS[1]) >>> 32;
		d = (org.apache.commons.math.util.FastMath.PI_O_4_BITS[1]) & 4294967295L;
		ac = a * c;
		bc = b * c;
		ad = a * d;
		ac = ac + ((bc + ad) >>> 32);
		bita = (prod2B & -9223372036854775808L) != 0;
		bitb = (ac & -9223372036854775808L) != 0;
		prod2B += ac;
		bitsum = (prod2B & -9223372036854775808L) != 0;
		if ((bita && bitb) || ((bita || bitb) && (!bitsum))) {
			prod2A++;
		}
		a = prodB >>> 32;
		b = prodB & 4294967295L;
		c = (org.apache.commons.math.util.FastMath.PI_O_4_BITS[0]) >>> 32;
		d = (org.apache.commons.math.util.FastMath.PI_O_4_BITS[0]) & 4294967295L;
		ac = a * c;
		bc = b * c;
		ad = a * d;
		ac = ac + ((bc + ad) >>> 32);
		bita = (prod2B & -9223372036854775808L) != 0;
		bitb = (ac & -9223372036854775808L) != 0;
		prod2B += ac;
		bitsum = (prod2B & -9223372036854775808L) != 0;
		if ((bita && bitb) || ((bita || bitb) && (!bitsum))) {
			prod2A++;
		}
		double tmpA = (prod2A >>> 12) / 4.503599627370496E15;
		double tmpB = ((((prod2A & 4095L) << 40) + (prod2B >>> 24)) / 4.503599627370496E15) / 4.503599627370496E15;
		double sumA = tmpA + tmpB;
		double sumB = -((sumA - tmpA) - tmpB);
		result[0] = intPart;
		result[1] = sumA * 2.0;
		result[2] = sumB * 2.0;
	}

	public static double sin(double x) {
		boolean negative = false;
		int quadrant = 0;
		double xa;
		double xb = 0.0;
		xa = x;
		if (x < 0) {
			negative = true;
			xa = -xa;
		}
		if (xa == 0.0) {
			long bits = java.lang.Double.doubleToLongBits(x);
			if (bits < 0) {
				return -0.0;
			}
			return 0.0;
		}
		if ((xa != xa) || (xa == (java.lang.Double.POSITIVE_INFINITY))) {
			return java.lang.Double.NaN;
		}
		if (xa > 3294198.0) {
			double[] reduceResults = new double[3];
			org.apache.commons.math.util.FastMath.reducePayneHanek(xa, reduceResults);
			quadrant = ((int) (reduceResults[0])) & 3;
			xa = reduceResults[1];
			xb = reduceResults[2];
		}else
			if (xa > 1.5707963267948966) {
				int k = ((int) (xa * 0.6366197723675814));
				double remA;
				double remB;
				while (true) {
					double a = (-k) * 1.570796251296997;
					remA = xa + a;
					remB = -((remA - xa) - a);
					a = (-k) * 7.549789948768648E-8;
					double b = remA;
					remA = a + b;
					remB += -((remA - b) - a);
					a = (-k) * 6.123233995736766E-17;
					b = remA;
					remA = a + b;
					remB += -((remA - b) - a);
					if (remA > 0.0)
						break;
					
					k--;
				} 
				quadrant = k & 3;
				xa = remA;
				xb = remB;
			}
		
		if (negative) {
			quadrant ^= 2;
		}
		switch (quadrant) {
			case 0 :
				return org.apache.commons.math.util.FastMath.sinQ(xa, xb);
			case 1 :
				return org.apache.commons.math.util.FastMath.cosQ(xa, xb);
			case 2 :
				return -(org.apache.commons.math.util.FastMath.sinQ(xa, xb));
			case 3 :
				return -(org.apache.commons.math.util.FastMath.cosQ(xa, xb));
			default :
				return java.lang.Double.NaN;
		}
	}

	public static double cos(double x) {
		int quadrant = 0;
		double xa = x;
		if (x < 0) {
			xa = -xa;
		}
		if ((xa != xa) || (xa == (java.lang.Double.POSITIVE_INFINITY))) {
			return java.lang.Double.NaN;
		}
		double xb = 0;
		if (xa > 3294198.0) {
			double[] reduceResults = new double[3];
			org.apache.commons.math.util.FastMath.reducePayneHanek(xa, reduceResults);
			quadrant = ((int) (reduceResults[0])) & 3;
			xa = reduceResults[1];
			xb = reduceResults[2];
		}else
			if (xa > 1.5707963267948966) {
				int k = ((int) (xa * 0.6366197723675814));
				double remA;
				double remB;
				while (true) {
					double a = (-k) * 1.570796251296997;
					remA = xa + a;
					remB = -((remA - xa) - a);
					a = (-k) * 7.549789948768648E-8;
					double b = remA;
					remA = a + b;
					remB += -((remA - b) - a);
					a = (-k) * 6.123233995736766E-17;
					b = remA;
					remA = a + b;
					remB += -((remA - b) - a);
					if (remA > 0.0)
						break;
					
					k--;
				} 
				quadrant = k & 3;
				xa = remA;
				xb = remB;
			}
		
		switch (quadrant) {
			case 0 :
				return org.apache.commons.math.util.FastMath.cosQ(xa, xb);
			case 1 :
				return -(org.apache.commons.math.util.FastMath.sinQ(xa, xb));
			case 2 :
				return -(org.apache.commons.math.util.FastMath.cosQ(xa, xb));
			case 3 :
				return org.apache.commons.math.util.FastMath.sinQ(xa, xb);
			default :
				return java.lang.Double.NaN;
		}
	}

	public static double tan(double x) {
		boolean negative = false;
		int quadrant = 0;
		double xa = x;
		if (x < 0) {
			negative = true;
			xa = -xa;
		}
		if (xa == 0.0) {
			long bits = java.lang.Double.doubleToLongBits(x);
			if (bits < 0) {
				return -0.0;
			}
			return 0.0;
		}
		if ((xa != xa) || (xa == (java.lang.Double.POSITIVE_INFINITY))) {
			return java.lang.Double.NaN;
		}
		double xb = 0;
		if (xa > 3294198.0) {
			double[] reduceResults = new double[3];
			org.apache.commons.math.util.FastMath.reducePayneHanek(xa, reduceResults);
			quadrant = ((int) (reduceResults[0])) & 3;
			xa = reduceResults[1];
			xb = reduceResults[2];
		}else
			if (xa > 1.5707963267948966) {
				int k = ((int) (xa * 0.6366197723675814));
				double remA;
				double remB;
				while (true) {
					double a = (-k) * 1.570796251296997;
					remA = xa + a;
					remB = -((remA - xa) - a);
					a = (-k) * 7.549789948768648E-8;
					double b = remA;
					remA = a + b;
					remB += -((remA - b) - a);
					a = (-k) * 6.123233995736766E-17;
					b = remA;
					remA = a + b;
					remB += -((remA - b) - a);
					if (remA > 0.0)
						break;
					
					k--;
				} 
				quadrant = k & 3;
				xa = remA;
				xb = remB;
			}
		
		if (xa > 1.5) {
			final double pi2a = 1.5707963267948966;
			final double pi2b = 6.123233995736766E-17;
			final double a = pi2a - xa;
			double b = -((a - pi2a) + xa);
			b += pi2b - xb;
			xa = a;
			xb = b;
			quadrant ^= 1;
			negative ^= true;
		}
		double result;
		if ((quadrant & 1) == 0) {
			result = org.apache.commons.math.util.FastMath.tanQ(xa, xb, false);
		}else {
			result = -(org.apache.commons.math.util.FastMath.tanQ(xa, xb, true));
		}
		if (negative) {
			result = -result;
		}
		return result;
	}

	public static double atan(double x) {
		return org.apache.commons.math.util.FastMath.atan(x, 0.0, false);
	}

	private static double atan(double xa, double xb, boolean leftPlane) {
		boolean negate = false;
		boolean recip = false;
		int idx;
		if (xa < 0) {
			xa = -xa;
			xb = -xb;
			negate = true;
		}
		if (xa > 1.633123935319537E16) {
			return negate ^ leftPlane ? (-(java.lang.Math.PI)) / 2.0 : (java.lang.Math.PI) / 2.0;
		}
		if (xa < 1.0) {
			idx = ((int) ((((((-1.7168146928204135) * xa) * xa) + 8.0) * xa) + 0.5));
		}else {
			double temp = 1.0 / xa;
			idx = ((int) ((-(((((-1.7168146928204135) * temp) * temp) + 8.0) * temp)) + 13.07));
		}
		double epsA = xa - (org.apache.commons.math.util.FastMath.TANGENT_TABLE_A[idx]);
		double epsB = -((epsA - xa) + (org.apache.commons.math.util.FastMath.TANGENT_TABLE_A[idx]));
		epsB += xb - (org.apache.commons.math.util.FastMath.TANGENT_TABLE_B[idx]);
		double temp = epsA + epsB;
		epsB = -((temp - epsA) - epsB);
		epsA = temp;
		temp = xa * 1.073741824E9;
		double ya = (xa + temp) - temp;
		double yb = (xb + xa) - ya;
		xa = ya;
		xb += yb;
		if (idx == 0) {
			double denom = 1.0 / (1.0 + ((xa + xb) * ((org.apache.commons.math.util.FastMath.TANGENT_TABLE_A[idx]) + (org.apache.commons.math.util.FastMath.TANGENT_TABLE_B[idx]))));
			ya = epsA * denom;
			yb = epsB * denom;
		}else {
			double temp2 = xa * (org.apache.commons.math.util.FastMath.TANGENT_TABLE_A[idx]);
			double za = 1.0 + temp2;
			double zb = -((za - 1.0) - temp2);
			temp2 = (xb * (org.apache.commons.math.util.FastMath.TANGENT_TABLE_A[idx])) + (xa * (org.apache.commons.math.util.FastMath.TANGENT_TABLE_B[idx]));
			temp = za + temp2;
			zb += -((temp - za) - temp2);
			za = temp;
			zb += xb * (org.apache.commons.math.util.FastMath.TANGENT_TABLE_B[idx]);
			ya = epsA / za;
			temp = ya * 1.073741824E9;
			final double yaa = (ya + temp) - temp;
			final double yab = ya - yaa;
			temp = za * 1.073741824E9;
			final double zaa = (za + temp) - temp;
			final double zab = za - zaa;
			yb = ((((epsA - (yaa * zaa)) - (yaa * zab)) - (yab * zaa)) - (yab * zab)) / za;
			yb += (((-epsA) * zb) / za) / za;
			yb += epsB / za;
		}
		epsA = ya;
		epsB = yb;
		double epsA2 = epsA * epsA;
		yb = 0.07490822288864472;
		yb = (yb * epsA2) + (-0.09088450866185192);
		yb = (yb * epsA2) + 0.11111095942313305;
		yb = (yb * epsA2) + (-0.1428571423679182);
		yb = (yb * epsA2) + 0.19999999999923582;
		yb = (yb * epsA2) + (-0.33333333333333287);
		yb = (yb * epsA2) * epsA;
		ya = epsA;
		temp = ya + yb;
		yb = -((temp - ya) - yb);
		ya = temp;
		yb += epsB / (1.0 + (epsA * epsA));
		double result;
		double resultb;
		if (recip) {
			final double pi2a = 1.5707963267948966;
			final double pi2b = 6.123233995736766E-17;
			double za = pi2a - ya;
			double zb = -((za - pi2a) + ya);
			temp = za - (org.apache.commons.math.util.FastMath.EIGHTHES[idx]);
			zb += -((temp - za) + (org.apache.commons.math.util.FastMath.EIGHTHES[idx]));
			za = temp;
			zb += pi2b - yb;
			ya = za;
			yb = zb;
			result = yb + ya;
			resultb = -((result - yb) - ya);
		}else {
			double za = (org.apache.commons.math.util.FastMath.EIGHTHES[idx]) + ya;
			double zb = -((za - (org.apache.commons.math.util.FastMath.EIGHTHES[idx])) - ya);
			temp = za + yb;
			zb += -((temp - za) - yb);
			za = temp;
			result = za + zb;
			resultb = -((result - za) - zb);
		}
		if (leftPlane) {
			final double pia = 1.5707963267948966 * 2.0;
			final double pib = 6.123233995736766E-17 * 2.0;
			final double za = pia - result;
			double zb = -((za - pia) + result);
			zb += pib - resultb;
			result = za + zb;
			resultb = -((result - za) - zb);
		}
		if (negate ^ leftPlane) {
			result = -result;
		}
		return result;
	}

	public static double atan2(double y, double x) {
		if ((x != x) || (y != y)) {
			return java.lang.Double.NaN;
		}
		if (y == 0.0) {
			double result = x * y;
			double invx = 1.0 / x;
			double invy = 1.0 / y;
			if (invx == 0.0) {
				return 0.0;
			}
			if (result != result) {
				return x / y;
			}
			if ((x < 0.0) || (invx < 0.0)) {
				if ((y < 0.0) || (invy < 0.0)) {
					return -(java.lang.Math.PI);
				}else {
					return java.lang.Math.PI;
				}
			}else {
				return result;
			}
		}
		if (y == (java.lang.Double.POSITIVE_INFINITY)) {
			if (x == (java.lang.Double.POSITIVE_INFINITY)) {
				return (java.lang.Math.PI) / 4.0;
			}
			if (x == (java.lang.Double.NEGATIVE_INFINITY)) {
				return ((java.lang.Math.PI) * 3.0) / 4.0;
			}
			return (java.lang.Math.PI) / 2.0;
		}
		if (y == (java.lang.Double.NEGATIVE_INFINITY)) {
			if (x == (java.lang.Double.POSITIVE_INFINITY)) {
				return (-(java.lang.Math.PI)) / 4.0;
			}
			if (x == (java.lang.Double.NEGATIVE_INFINITY)) {
				return ((-(java.lang.Math.PI)) * 3.0) / 4.0;
			}
			return (-(java.lang.Math.PI)) / 2.0;
		}
		if (x == (java.lang.Double.POSITIVE_INFINITY)) {
			if ((y > 0.0) || ((1 / y) > 0.0)) {
				return 0.0;
			}
			if ((y < 0.0) || ((1 / y) < 0.0)) {
				return -0.0;
			}
		}
		if (x == (java.lang.Double.NEGATIVE_INFINITY)) {
			if ((y > 0.0) || ((1 / y) > 0.0)) {
				return java.lang.Math.PI;
			}
			if ((y < 0.0) || ((1 / y) < 0.0)) {
				return -(java.lang.Math.PI);
			}
		}
		if (x == 0) {
			if ((y > 0.0) || ((1 / y) > 0.0)) {
				return (java.lang.Math.PI) / 2.0;
			}
			if ((y < 0.0) || ((1 / y) < 0.0)) {
				return (-(java.lang.Math.PI)) / 2.0;
			}
		}
		if ((x > 8.0E298) || (x < (-8.0E298))) {
			x *= 9.313225746154785E-10;
			y *= 9.313225746154785E-10;
		}
		double temp = x * 1.073741824E9;
		final double xa = (x + temp) - temp;
		final double xb = x - xa;
		final double r = y / x;
		temp = r * 1.073741824E9;
		double ra = (r + temp) - temp;
		double rb = r - ra;
		rb += ((((y - (ra * xa)) - (ra * xb)) - (rb * xa)) - (rb * xb)) / x;
		temp = ra + rb;
		rb = -((temp - ra) - rb);
		ra = temp;
		double result = org.apache.commons.math.util.FastMath.atan(ra, rb, (x < 0));
		return result;
	}

	public static double toRadians(double x) {
		final double facta = 0.01745329052209854;
		final double factb = 1.997844754509471E-9;
		double temp = x * 1.073741824E9;
		double xa = (x + temp) - temp;
		double xb = x - xa;
		return (((xb * factb) + (xb * facta)) + (xa * factb)) + (xa * facta);
	}

	public static double toDegrees(double x) {
		final double facta = 57.2957763671875;
		final double factb = 3.145894820876798E-6;
		double temp = x * 1.073741824E9;
		double xa = (x + temp) - temp;
		double xb = x - xa;
		return (((xb * factb) + (xb * facta)) + (xa * factb)) + (xa * facta);
	}

	public static int abs(final int x) {
		return x < 0 ? -x : x;
	}

	public static long abs(final long x) {
		return x < 0L ? -x : x;
	}

	public static float abs(final float x) {
		return x < 0.0F ? -x : x;
	}

	public static double abs(double x) {
		return x < 0.0 ? -x : x;
	}

	public static double ulp(double x) {
		return org.apache.commons.math.util.FastMath.abs((x - (java.lang.Double.longBitsToDouble(((java.lang.Double.doubleToLongBits(x)) ^ 1)))));
	}

	public static double nextAfter(double d, double direction) {
		if ((java.lang.Double.isNaN(d)) || (java.lang.Double.isInfinite(d))) {
			return d;
		}else
			if (d == 0) {
				return direction < 0 ? -(java.lang.Double.MIN_VALUE) : java.lang.Double.MIN_VALUE;
			}
		
		long bits = java.lang.Double.doubleToLongBits(d);
		long sign = bits & -9223372036854775808L;
		long exponent = bits & 9218868437227405312L;
		long mantissa = bits & 4503599627370495L;
		if ((d * (direction - d)) >= 0) {
			if (mantissa == 4503599627370495L) {
				return java.lang.Double.longBitsToDouble((sign | (exponent + 4503599627370496L)));
			}else {
				return java.lang.Double.longBitsToDouble(((sign | exponent) | (mantissa + 1)));
			}
		}else {
			if (mantissa == 0L) {
				return java.lang.Double.longBitsToDouble(((sign | (exponent - 4503599627370496L)) | 4503599627370495L));
			}else {
				return java.lang.Double.longBitsToDouble(((sign | exponent) | (mantissa - 1)));
			}
		}
	}

	public static double floor(double x) {
		long y;
		if ((x >= 4.503599627370496E15) || (x <= (-4.503599627370496E15))) {
			return x;
		}
		y = ((long) (x));
		if (x < 0) {
			y--;
		}
		return ((double) (y));
	}

	public static double ceil(double x) {
		double y;
		y = org.apache.commons.math.util.FastMath.floor(x);
		if (y == x) {
			return y;
		}
		return y + 1.0;
	}

	public static double rint(double x) {
		double y = org.apache.commons.math.util.FastMath.floor(x);
		double d = x - y;
		if (d > 0.5) {
			return y + 1.0;
		}
		if (d < 0.5) {
			return y;
		}
		long z = ((long) (y));
		return (z & 1) == 0 ? y : y + 1.0;
	}

	public static long round(double x) {
		return ((long) (org.apache.commons.math.util.FastMath.floor((x + 0.5))));
	}

	public static int round(final float x) {
		return java.lang.Math.round(x);
	}

	public static int min(final int a, final int b) {
		return a <= b ? a : b;
	}

	public static long min(final long a, final long b) {
		return a <= b ? a : b;
	}

	public static float min(final float a, final float b) {
		return a <= b ? a : java.lang.Float.isNaN((a + b)) ? java.lang.Float.NaN : b;
	}

	public static double min(final double a, final double b) {
		return a <= b ? a : java.lang.Double.isNaN((a + b)) ? java.lang.Double.NaN : b;
	}

	public static int max(final int a, final int b) {
		return a <= b ? b : a;
	}

	public static long max(final long a, final long b) {
		return a <= b ? b : a;
	}

	public static float max(final float a, final float b) {
		return a <= b ? b : java.lang.Float.isNaN((a + b)) ? java.lang.Float.NaN : b;
	}

	public static double max(final double a, final double b) {
		return a <= b ? b : java.lang.Double.isNaN((a + b)) ? java.lang.Double.NaN : a;
	}
}


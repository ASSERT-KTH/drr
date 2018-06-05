

package org.apache.commons.math.util;


class FastMathCalc {
	private static final long HEX_40000000 = 1073741824L;

	private static final double[] FACT = new double[]{ +1.0 , +1.0 , +2.0 , +6.0 , +24.0 , +120.0 , +720.0 , +5040.0 , +40320.0 , +362880.0 , +3628800.0 , +3.99168E7 , +4.790016E8 , +6.2270208E9 , +8.71782912E10 , +1.307674368E12 , +2.0922789888E13 , +3.55687428096E14 , +6.402373705728E15 , +1.21645100408832E17 };

	private static final double[][] LN_SPLIT_COEF = new double[][]{ new double[]{ 2.0 , 0.0 } , new double[]{ 0.6666666269302368 , 3.9736429850260626E-8 } , new double[]{ 0.3999999761581421 , 2.3841857910019882E-8 } , new double[]{ 0.2857142686843872 , 1.7029898543501842E-8 } , new double[]{ 0.2222222089767456 , 1.3245471311735498E-8 } , new double[]{ 0.1818181574344635 , 2.4384203044354907E-8 } , new double[]{ 0.1538461446762085 , 9.140260083262505E-9 } , new double[]{ 0.13333332538604736 , 9.220590270857665E-9 } , new double[]{ 0.11764700710773468 , 1.2393345855018391E-8 } , new double[]{ 0.10526403784751892 , 8.251545029714408E-9 } , new double[]{ 0.0952233225107193 , 1.2675934823758863E-8 } , new double[]{ 0.08713622391223907 , 1.1430250008909141E-8 } , new double[]{ 0.07842259109020233 , 2.404307984052299E-9 } , new double[]{ 0.08371849358081818 , 1.176342548272881E-8 } , new double[]{ 0.030589580535888672 , 1.2958646899018938E-9 } , new double[]{ 0.14982303977012634 , 1.225743062930824E-8 } };

	private static final java.lang.String TABLE_START_DECL = "    {";

	private static final java.lang.String TABLE_END_DECL = "    };";

	private FastMathCalc() {
	}

	@java.lang.SuppressWarnings(value = "unused")
	private static void buildSinCosTables(double[] SINE_TABLE_A, double[] SINE_TABLE_B, double[] COSINE_TABLE_A, double[] COSINE_TABLE_B, int SINE_TABLE_LEN, double[] TANGENT_TABLE_A, double[] TANGENT_TABLE_B) {
		final double[] result = new double[2];
		for (int i = 0; i < 7; i++) {
			double x = i / 8.0;
			org.apache.commons.math.util.FastMathCalc.slowSin(x, result);
			SINE_TABLE_A[i] = result[0];
			SINE_TABLE_B[i] = result[1];
			org.apache.commons.math.util.FastMathCalc.slowCos(x, result);
			COSINE_TABLE_A[i] = result[0];
			COSINE_TABLE_B[i] = result[1];
		}
		for (int i = 7; i < SINE_TABLE_LEN; i++) {
			double[] xs = new double[2];
			double[] ys = new double[2];
			double[] as = new double[2];
			double[] bs = new double[2];
			double[] temps = new double[2];
			if ((i & 1) == 0) {
				xs[0] = SINE_TABLE_A[(i / 2)];
				xs[1] = SINE_TABLE_B[(i / 2)];
				ys[0] = COSINE_TABLE_A[(i / 2)];
				ys[1] = COSINE_TABLE_B[(i / 2)];
				org.apache.commons.math.util.FastMathCalc.splitMult(xs, ys, result);
				SINE_TABLE_A[i] = (result[0]) * 2.0;
				SINE_TABLE_B[i] = (result[1]) * 2.0;
				org.apache.commons.math.util.FastMathCalc.splitMult(ys, ys, as);
				org.apache.commons.math.util.FastMathCalc.splitMult(xs, xs, temps);
				temps[0] = -(temps[0]);
				temps[1] = -(temps[1]);
				org.apache.commons.math.util.FastMathCalc.splitAdd(as, temps, result);
				COSINE_TABLE_A[i] = result[0];
				COSINE_TABLE_B[i] = result[1];
			}else {
				xs[0] = SINE_TABLE_A[(i / 2)];
				xs[1] = SINE_TABLE_B[(i / 2)];
				ys[0] = COSINE_TABLE_A[(i / 2)];
				ys[1] = COSINE_TABLE_B[(i / 2)];
				as[0] = SINE_TABLE_A[((i / 2) + 1)];
				as[1] = SINE_TABLE_B[((i / 2) + 1)];
				bs[0] = COSINE_TABLE_A[((i / 2) + 1)];
				bs[1] = COSINE_TABLE_B[((i / 2) + 1)];
				org.apache.commons.math.util.FastMathCalc.splitMult(xs, bs, temps);
				org.apache.commons.math.util.FastMathCalc.splitMult(ys, as, result);
				org.apache.commons.math.util.FastMathCalc.splitAdd(result, temps, result);
				SINE_TABLE_A[i] = result[0];
				SINE_TABLE_B[i] = result[1];
				org.apache.commons.math.util.FastMathCalc.splitMult(ys, bs, result);
				org.apache.commons.math.util.FastMathCalc.splitMult(xs, as, temps);
				temps[0] = -(temps[0]);
				temps[1] = -(temps[1]);
				org.apache.commons.math.util.FastMathCalc.splitAdd(result, temps, result);
				COSINE_TABLE_A[i] = result[0];
				COSINE_TABLE_B[i] = result[1];
			}
		}
		for (int i = 0; i < SINE_TABLE_LEN; i++) {
			double[] xs = new double[2];
			double[] ys = new double[2];
			double[] as = new double[2];
			as[0] = COSINE_TABLE_A[i];
			as[1] = COSINE_TABLE_B[i];
			org.apache.commons.math.util.FastMathCalc.splitReciprocal(as, ys);
			xs[0] = SINE_TABLE_A[i];
			xs[1] = SINE_TABLE_B[i];
			org.apache.commons.math.util.FastMathCalc.splitMult(xs, ys, as);
			TANGENT_TABLE_A[i] = as[0];
			TANGENT_TABLE_B[i] = as[1];
		}
	}

	static double slowCos(final double x, final double[] result) {
		final double[] xs = new double[2];
		final double[] ys = new double[2];
		final double[] facts = new double[2];
		final double[] as = new double[2];
		org.apache.commons.math.util.FastMathCalc.split(x, xs);
		ys[0] = ys[1] = 0.0;
		for (int i = (org.apache.commons.math.util.FastMathCalc.FACT.length) - 1; i >= 0; i--) {
			org.apache.commons.math.util.FastMathCalc.splitMult(xs, ys, as);
			ys[0] = as[0];
			ys[1] = as[1];
			if ((i & 1) != 0) {
				continue;
			}
			org.apache.commons.math.util.FastMathCalc.split(org.apache.commons.math.util.FastMathCalc.FACT[i], as);
			org.apache.commons.math.util.FastMathCalc.splitReciprocal(as, facts);
			if ((i & 2) != 0) {
				facts[0] = -(facts[0]);
				facts[1] = -(facts[1]);
			}
			org.apache.commons.math.util.FastMathCalc.splitAdd(ys, facts, as);
			ys[0] = as[0];
			ys[1] = as[1];
		}
		if (result != null) {
			result[0] = ys[0];
			result[1] = ys[1];
		}
		return (ys[0]) + (ys[1]);
	}

	static double slowSin(final double x, final double[] result) {
		final double[] xs = new double[2];
		final double[] ys = new double[2];
		final double[] facts = new double[2];
		final double[] as = new double[2];
		org.apache.commons.math.util.FastMathCalc.split(x, xs);
		ys[0] = ys[1] = 0.0;
		for (int i = (org.apache.commons.math.util.FastMathCalc.FACT.length) - 1; i >= 0; i--) {
			org.apache.commons.math.util.FastMathCalc.splitMult(xs, ys, as);
			ys[0] = as[0];
			ys[1] = as[1];
			if ((i & 1) == 0) {
				continue;
			}
			org.apache.commons.math.util.FastMathCalc.split(org.apache.commons.math.util.FastMathCalc.FACT[i], as);
			org.apache.commons.math.util.FastMathCalc.splitReciprocal(as, facts);
			if ((i & 2) != 0) {
				facts[0] = -(facts[0]);
				facts[1] = -(facts[1]);
			}
			org.apache.commons.math.util.FastMathCalc.splitAdd(ys, facts, as);
			ys[0] = as[0];
			ys[1] = as[1];
		}
		if (result != null) {
			result[0] = ys[0];
			result[1] = ys[1];
		}
		return (ys[0]) + (ys[1]);
	}

	static double slowexp(final double x, final double[] result) {
		final double[] xs = new double[2];
		final double[] ys = new double[2];
		final double[] facts = new double[2];
		final double[] as = new double[2];
		org.apache.commons.math.util.FastMathCalc.split(x, xs);
		ys[0] = ys[1] = 0.0;
		for (int i = (org.apache.commons.math.util.FastMathCalc.FACT.length) - 1; i >= 0; i--) {
			org.apache.commons.math.util.FastMathCalc.splitMult(xs, ys, as);
			ys[0] = as[0];
			ys[1] = as[1];
			org.apache.commons.math.util.FastMathCalc.split(org.apache.commons.math.util.FastMathCalc.FACT[i], as);
			org.apache.commons.math.util.FastMathCalc.splitReciprocal(as, facts);
			org.apache.commons.math.util.FastMathCalc.splitAdd(ys, facts, as);
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
			final double a = d * (org.apache.commons.math.util.FastMathCalc.HEX_40000000);
			split[0] = (d + a) - a;
			split[1] = d - (split[0]);
		}else {
			final double a = d * 9.313225746154785E-10;
			split[0] = ((d + a) - d) * (org.apache.commons.math.util.FastMathCalc.HEX_40000000);
			split[1] = d - (split[0]);
		}
	}

	private static void resplit(final double[] a) {
		final double c = (a[0]) + (a[1]);
		final double d = -((c - (a[0])) - (a[1]));
		if ((c < 8.0E298) && (c > (-8.0E298))) {
			double z = c * (org.apache.commons.math.util.FastMathCalc.HEX_40000000);
			a[0] = (c + z) - z;
			a[1] = (c - (a[0])) + d;
		}else {
			double z = c * 9.313225746154785E-10;
			a[0] = ((c + z) - c) * (org.apache.commons.math.util.FastMathCalc.HEX_40000000);
			a[1] = (c - (a[0])) + d;
		}
	}

	private static void splitMult(double[] a, double[] b, double[] ans) {
		ans[0] = (a[0]) * (b[0]);
		ans[1] = (((a[0]) * (b[1])) + ((a[1]) * (b[0]))) + ((a[1]) * (b[1]));
		org.apache.commons.math.util.FastMathCalc.resplit(ans);
	}

	private static void splitAdd(final double[] a, final double[] b, final double[] ans) {
		ans[0] = (a[0]) + (b[0]);
		ans[1] = (a[1]) + (b[1]);
		org.apache.commons.math.util.FastMathCalc.resplit(ans);
	}

	static void splitReciprocal(final double[] in, final double[] result) {
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
		org.apache.commons.math.util.FastMathCalc.resplit(result);
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
		org.apache.commons.math.util.FastMathCalc.split(a[0], xs);
		org.apache.commons.math.util.FastMathCalc.split(b[0], ys);
		org.apache.commons.math.util.FastMathCalc.splitMult(xs, ys, zs);
		result[0] = zs[0];
		result[1] = zs[1];
		org.apache.commons.math.util.FastMathCalc.split(b[1], ys);
		org.apache.commons.math.util.FastMathCalc.splitMult(xs, ys, zs);
		double tmp = (result[0]) + (zs[0]);
		result[1] = (result[1]) - ((tmp - (result[0])) - (zs[0]));
		result[0] = tmp;
		tmp = (result[0]) + (zs[1]);
		result[1] = (result[1]) - ((tmp - (result[0])) - (zs[1]));
		result[0] = tmp;
		org.apache.commons.math.util.FastMathCalc.split(a[1], xs);
		org.apache.commons.math.util.FastMathCalc.split(b[0], ys);
		org.apache.commons.math.util.FastMathCalc.splitMult(xs, ys, zs);
		tmp = (result[0]) + (zs[0]);
		result[1] = (result[1]) - ((tmp - (result[0])) - (zs[0]));
		result[0] = tmp;
		tmp = (result[0]) + (zs[1]);
		result[1] = (result[1]) - ((tmp - (result[0])) - (zs[1]));
		result[0] = tmp;
		org.apache.commons.math.util.FastMathCalc.split(a[1], xs);
		org.apache.commons.math.util.FastMathCalc.split(b[1], ys);
		org.apache.commons.math.util.FastMathCalc.splitMult(xs, ys, zs);
		tmp = (result[0]) + (zs[0]);
		result[1] = (result[1]) - ((tmp - (result[0])) - (zs[0]));
		result[0] = tmp;
		tmp = (result[0]) + (zs[1]);
		result[1] = (result[1]) - ((tmp - (result[0])) - (zs[1]));
		result[0] = tmp;
	}

	static double expint(int p, final double[] result) {
		final double[] xs = new double[2];
		final double[] as = new double[2];
		final double[] ys = new double[2];
		xs[0] = 2.718281828459045;
		xs[1] = 1.4456468917292502E-16;
		org.apache.commons.math.util.FastMathCalc.split(1.0, ys);
		while (p > 0) {
			if ((p & 1) != 0) {
				org.apache.commons.math.util.FastMathCalc.quadMult(ys, xs, as);
				ys[0] = as[0];
				ys[1] = as[1];
			}
			org.apache.commons.math.util.FastMathCalc.quadMult(xs, xs, as);
			xs[0] = as[0];
			xs[1] = as[1];
			p >>= 1;
		} 
		if (result != null) {
			result[0] = ys[0];
			result[1] = ys[1];
			org.apache.commons.math.util.FastMathCalc.resplit(result);
		}
		return (ys[0]) + (ys[1]);
	}

	static double[] slowLog(double xi) {
		double[] x = new double[2];
		double[] x2 = new double[2];
		double[] y = new double[2];
		double[] a = new double[2];
		org.apache.commons.math.util.FastMathCalc.split(xi, x);
		x[0] += 1.0;
		org.apache.commons.math.util.FastMathCalc.resplit(x);
		org.apache.commons.math.util.FastMathCalc.splitReciprocal(x, a);
		x[0] -= 2.0;
		org.apache.commons.math.util.FastMathCalc.resplit(x);
		org.apache.commons.math.util.FastMathCalc.splitMult(x, a, y);
		x[0] = y[0];
		x[1] = y[1];
		org.apache.commons.math.util.FastMathCalc.splitMult(x, x, x2);
		y[0] = org.apache.commons.math.util.FastMathCalc.LN_SPLIT_COEF[((org.apache.commons.math.util.FastMathCalc.LN_SPLIT_COEF.length) - 1)][0];
		y[1] = org.apache.commons.math.util.FastMathCalc.LN_SPLIT_COEF[((org.apache.commons.math.util.FastMathCalc.LN_SPLIT_COEF.length) - 1)][1];
		for (int i = (org.apache.commons.math.util.FastMathCalc.LN_SPLIT_COEF.length) - 2; i >= 0; i--) {
			org.apache.commons.math.util.FastMathCalc.splitMult(y, x2, a);
			y[0] = a[0];
			y[1] = a[1];
			org.apache.commons.math.util.FastMathCalc.splitAdd(y, org.apache.commons.math.util.FastMathCalc.LN_SPLIT_COEF[i], a);
			y[0] = a[0];
			y[1] = a[1];
		}
		org.apache.commons.math.util.FastMathCalc.splitMult(y, x, a);
		y[0] = a[0];
		y[1] = a[1];
		return y;
	}

	static void printarray(java.io.PrintStream out, java.lang.String name, int expectedLen, double[][] array2d) {
		out.println(name);
		org.apache.commons.math.util.FastMathCalc.checkLen(expectedLen, array2d.length);
		out.println(((org.apache.commons.math.util.FastMathCalc.TABLE_START_DECL) + " "));
		int i = 0;
		for (double[] array : array2d) {
			out.print("        {");
			for (double d : array) {
				out.printf("%-25.25s", org.apache.commons.math.util.FastMathCalc.format(d));
			}
			out.println(("}, // " + (i++)));
		}
		out.println(org.apache.commons.math.util.FastMathCalc.TABLE_END_DECL);
	}

	static void printarray(java.io.PrintStream out, java.lang.String name, int expectedLen, double[] array) {
		out.println((name + "="));
		org.apache.commons.math.util.FastMathCalc.checkLen(expectedLen, array.length);
		out.println(org.apache.commons.math.util.FastMathCalc.TABLE_START_DECL);
		for (double d : array) {
			out.printf("        %s%n", org.apache.commons.math.util.FastMathCalc.format(d));
		}
		out.println(org.apache.commons.math.util.FastMathCalc.TABLE_END_DECL);
	}

	static java.lang.String format(double d) {
		if (d != d) {
			return "Double.NaN,";
		}else {
			return ((d >= 0 ? "+" : "") + (java.lang.Double.toString(d))) + "d,";
		}
	}

	private static void checkLen(int expectedLen, int actual) throws org.apache.commons.math.exception.DimensionMismatchException {
		if (expectedLen != actual) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(actual, expectedLen);
		}
	}
}


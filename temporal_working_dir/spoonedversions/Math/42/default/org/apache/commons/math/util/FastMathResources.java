

package org.apache.commons.math.util;


class FastMathResources {
	private static final java.lang.String RES_DIR = ("data/" + (org.apache.commons.math.util.FastMath.class.getPackage().getName().replace('.', '/'))) + "/";

	private static final java.lang.String RES_PREFIX = (org.apache.commons.math.util.FastMathResources.RES_DIR) + "FastMath__";

	private static final java.lang.String EXP_INT = "exp_int";

	private static final java.lang.String EXP_FRAC = "exp_frac";

	private static final java.lang.String LN_MANT = "ln_mant";

	private static final int BYTES_IN_DOUBLE = (java.lang.Double.SIZE) / (java.lang.Byte.SIZE);

	private FastMathResources() {
	}

	static void createAll() {
		final java.io.File resDir = new java.io.File(org.apache.commons.math.util.FastMathResources.RES_DIR);
		if (resDir.exists()) {
			if (!(resDir.isDirectory())) {
				throw new org.apache.commons.math.exception.MathInternalError();
			}
		}else {
			try {
				resDir.mkdirs();
			} catch (java.lang.SecurityException e) {
				throw new org.apache.commons.math.exception.MathInternalError(e);
			}
		}
		final double[] expIntA = new double[org.apache.commons.math.util.FastMath.EXP_INT_TABLE_LEN];
		final double[] expIntB = new double[org.apache.commons.math.util.FastMath.EXP_INT_TABLE_LEN];
		final double[] tmp = new double[2];
		final double[] recip = new double[2];
		for (int i = 0; i < (org.apache.commons.math.util.FastMath.EXP_INT_TABLE_MAX_INDEX); i++) {
			org.apache.commons.math.util.FastMathCalc.expint(i, tmp);
			expIntA[(i + (org.apache.commons.math.util.FastMath.EXP_INT_TABLE_MAX_INDEX))] = tmp[0];
			expIntB[(i + (org.apache.commons.math.util.FastMath.EXP_INT_TABLE_MAX_INDEX))] = tmp[1];
			if (i != 0) {
				org.apache.commons.math.util.FastMathCalc.splitReciprocal(tmp, recip);
				expIntA[((org.apache.commons.math.util.FastMath.EXP_INT_TABLE_MAX_INDEX) - i)] = recip[0];
				expIntB[((org.apache.commons.math.util.FastMath.EXP_INT_TABLE_MAX_INDEX) - i)] = recip[1];
			}
		}
		org.apache.commons.math.util.FastMathResources.saveTable2d(org.apache.commons.math.util.FastMathResources.EXP_INT, new double[][]{ expIntA , expIntB });
		final double[] expFracA = new double[org.apache.commons.math.util.FastMath.EXP_FRAC_TABLE_LEN];
		final double[] expFracB = new double[org.apache.commons.math.util.FastMath.EXP_FRAC_TABLE_LEN];
		for (int i = 0; i < (org.apache.commons.math.util.FastMath.EXP_FRAC_TABLE_LEN); i++) {
			org.apache.commons.math.util.FastMathCalc.slowexp((i / 1024.0), tmp);
			expFracA[i] = tmp[0];
			expFracB[i] = tmp[1];
		}
		org.apache.commons.math.util.FastMathResources.saveTable2d(org.apache.commons.math.util.FastMathResources.EXP_FRAC, new double[][]{ expFracA , expFracB });
		final double[][] lnMant = new double[org.apache.commons.math.util.FastMath.LN_MANT_LEN][];
		for (int i = 0; i < (org.apache.commons.math.util.FastMath.LN_MANT_LEN); i++) {
			final double d = java.lang.Double.longBitsToDouble(((((long) (i)) << 42) | 4607182418800017408L));
			lnMant[i] = org.apache.commons.math.util.FastMathCalc.slowLog(d);
		}
		org.apache.commons.math.util.FastMathResources.saveTable2d(org.apache.commons.math.util.FastMathResources.LN_MANT, org.apache.commons.math.util.FastMathResources.transpose(lnMant));
	}

	static double[][] loadExpInt() {
		return org.apache.commons.math.util.FastMathResources.loadTable2d(org.apache.commons.math.util.FastMathResources.EXP_INT, 2, org.apache.commons.math.util.FastMath.EXP_INT_TABLE_LEN);
	}

	static double[][] loadExpFrac() {
		return org.apache.commons.math.util.FastMathResources.loadTable2d(org.apache.commons.math.util.FastMathResources.EXP_FRAC, 2, org.apache.commons.math.util.FastMath.EXP_FRAC_TABLE_LEN);
	}

	static double[][] loadLnMant() {
		return org.apache.commons.math.util.FastMathResources.transpose(org.apache.commons.math.util.FastMathResources.loadTable2d(org.apache.commons.math.util.FastMathResources.LN_MANT, 2, org.apache.commons.math.util.FastMath.LN_MANT_LEN));
	}

	private static java.io.DataOutputStream out(java.lang.String name) throws java.io.FileNotFoundException {
		final java.lang.String fullName = (org.apache.commons.math.util.FastMathResources.RES_PREFIX) + name;
		return new java.io.DataOutputStream(new java.io.BufferedOutputStream(new java.io.FileOutputStream(fullName)));
	}

	private static void saveTable1d(java.lang.String name, double[] data) {
		final int len = data.length;
		try {
			final java.io.DataOutputStream out = org.apache.commons.math.util.FastMathResources.out(name);
			for (int i = 0; i < len; i++) {
				out.writeDouble(data[i]);
			}
			out.close();
		} catch (java.io.IOException e) {
			throw new org.apache.commons.math.exception.MathInternalError(e);
		}
	}

	private static void saveTable2d(java.lang.String name, double[][] data) {
		final int len = data.length;
		final int rowLen = data[0].length;
		try {
			final java.io.DataOutputStream out = org.apache.commons.math.util.FastMathResources.out(name);
			for (int i = 0; i < len; i++) {
				for (int j = 0; j < rowLen; j++) {
					out.writeDouble(data[i][j]);
				}
			}
			out.close();
		} catch (java.io.IOException e) {
			throw new org.apache.commons.math.exception.MathInternalError(e);
		}
	}

	private static java.io.DataInputStream in(java.lang.String name) throws java.io.FileNotFoundException {
		final java.lang.String fullName = ("/" + (org.apache.commons.math.util.FastMathResources.RES_PREFIX)) + name;
		final java.io.InputStream in = org.apache.commons.math.util.FastMathResources.class.getResourceAsStream(fullName);
		return new java.io.DataInputStream(new java.io.BufferedInputStream(in));
	}

	private static double[] loadTable1d(java.lang.String name, int len) {
		try {
			final java.io.DataInputStream in = org.apache.commons.math.util.FastMathResources.in(name);
			final double[] data = new double[len];
			for (int i = 0; i < len; i++) {
				data[i] = in.readDouble();
			}
			in.close();
			return data;
		} catch (java.io.IOException e) {
			throw new org.apache.commons.math.exception.MathInternalError(e);
		}
	}

	private static double[][] loadTable2d(java.lang.String name, int len, int rowLen) {
		try {
			final java.io.DataInputStream in = org.apache.commons.math.util.FastMathResources.in(name);
			final byte[] b = new byte[(org.apache.commons.math.util.FastMathResources.BYTES_IN_DOUBLE) * rowLen];
			final double[][] data = new double[len][rowLen];
			final java.nio.ByteBuffer bBuf = java.nio.ByteBuffer.wrap(b);
			for (int i = 0; i < len; i++) {
				in.readFully(b);
				final java.nio.DoubleBuffer dBuf = bBuf.asDoubleBuffer();
				for (int j = 0; j < rowLen; j++) {
					data[i][j] = dBuf.get();
				}
			}
			in.close();
			return data;
		} catch (java.io.IOException e) {
			throw new org.apache.commons.math.exception.MathInternalError(e);
		}
	}

	private static double[][] transpose(double[][] data) {
		final int rowLen = data.length;
		final int len = data[0].length;
		final double[][] tData = new double[len][rowLen];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < rowLen; j++) {
				tData[i][j] = data[j][i];
			}
		}
		return tData;
	}
}


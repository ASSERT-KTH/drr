

package org.apache.commons.math3.random;


public class MersenneTwister extends org.apache.commons.math3.random.BitsStreamGenerator implements java.io.Serializable {
	private static final long serialVersionUID = 8661194735290153518L;

	private static final int N = 624;

	private static final int M = 397;

	private static final int[] MAG01 = new int[]{ 0 , -1727483681 };

	private int[] mt;

	private int mti;

	public MersenneTwister() {
		mt = new int[org.apache.commons.math3.random.MersenneTwister.N];
		setSeed(((java.lang.System.currentTimeMillis()) + (java.lang.System.identityHashCode(org.apache.commons.math3.random.MersenneTwister.this))));
	}

	public MersenneTwister(int seed) {
		mt = new int[org.apache.commons.math3.random.MersenneTwister.N];
		setSeed(seed);
	}

	public MersenneTwister(int[] seed) {
		mt = new int[org.apache.commons.math3.random.MersenneTwister.N];
		setSeed(seed);
	}

	public MersenneTwister(long seed) {
		mt = new int[org.apache.commons.math3.random.MersenneTwister.N];
		setSeed(seed);
	}

	@java.lang.Override
	public void setSeed(int seed) {
		long longMT = seed;
		mt[0] = ((int) (longMT));
		for (mti = 1; (mti) < (org.apache.commons.math3.random.MersenneTwister.N); ++(mti)) {
			longMT = ((1812433253L * (longMT ^ (longMT >> 30))) + (mti)) & 4294967295L;
			mt[mti] = ((int) (longMT));
		}
		clear();
	}

	@java.lang.Override
	public void setSeed(int[] seed) {
		if (seed == null) {
			setSeed(((java.lang.System.currentTimeMillis()) + (java.lang.System.identityHashCode(org.apache.commons.math3.random.MersenneTwister.this))));
			return ;
		}
		setSeed(19650218);
		int i = 1;
		int j = 0;
		for (int k = org.apache.commons.math3.util.FastMath.max(org.apache.commons.math3.random.MersenneTwister.N, seed.length); k != 0; k--) {
			long l0 = ((mt[i]) & 2147483647L) | ((mt[i]) < 0 ? 2147483648L : 0L);
			long l1 = ((mt[(i - 1)]) & 2147483647L) | ((mt[(i - 1)]) < 0 ? 2147483648L : 0L);
			long l = ((l0 ^ ((l1 ^ (l1 >> 30)) * 1664525L)) + (seed[j])) + j;
			mt[i] = ((int) (l & 4294967295L));
			i++;
			j++;
			if (i >= (org.apache.commons.math3.random.MersenneTwister.N)) {
				mt[0] = mt[((org.apache.commons.math3.random.MersenneTwister.N) - 1)];
				i = 1;
			}
			if (j >= (seed.length)) {
				j = 0;
			}
		}
		for (int k = (org.apache.commons.math3.random.MersenneTwister.N) - 1; k != 0; k--) {
			long l0 = ((mt[i]) & 2147483647L) | ((mt[i]) < 0 ? 2147483648L : 0L);
			long l1 = ((mt[(i - 1)]) & 2147483647L) | ((mt[(i - 1)]) < 0 ? 2147483648L : 0L);
			long l = (l0 ^ ((l1 ^ (l1 >> 30)) * 1566083941L)) - i;
			mt[i] = ((int) (l & 4294967295L));
			i++;
			if (i >= (org.apache.commons.math3.random.MersenneTwister.N)) {
				mt[0] = mt[((org.apache.commons.math3.random.MersenneTwister.N) - 1)];
				i = 1;
			}
		}
		mt[0] = -2147483648;
		clear();
	}

	@java.lang.Override
	public void setSeed(long seed) {
		setSeed(new int[]{ ((int) (seed >>> 32)) , ((int) (seed & 4294967295L)) });
	}

	@java.lang.Override
	protected int next(int bits) {
		int y;
		if ((mti) >= (org.apache.commons.math3.random.MersenneTwister.N)) {
			int mtNext = mt[0];
			for (int k = 0; k < ((org.apache.commons.math3.random.MersenneTwister.N) - (org.apache.commons.math3.random.MersenneTwister.M)); ++k) {
				int mtCurr = mtNext;
				mtNext = mt[(k + 1)];
				y = (mtCurr & -2147483648) | (mtNext & 2147483647);
				mt[k] = ((mt[(k + (org.apache.commons.math3.random.MersenneTwister.M))]) ^ (y >>> 1)) ^ (org.apache.commons.math3.random.MersenneTwister.MAG01[(y & 1)]);
			}
			for (int k = (org.apache.commons.math3.random.MersenneTwister.N) - (org.apache.commons.math3.random.MersenneTwister.M); k < ((org.apache.commons.math3.random.MersenneTwister.N) - 1); ++k) {
				int mtCurr = mtNext;
				mtNext = mt[(k + 1)];
				y = (mtCurr & -2147483648) | (mtNext & 2147483647);
				mt[k] = ((mt[(k + ((org.apache.commons.math3.random.MersenneTwister.M) - (org.apache.commons.math3.random.MersenneTwister.N)))]) ^ (y >>> 1)) ^ (org.apache.commons.math3.random.MersenneTwister.MAG01[(y & 1)]);
			}
			y = (mtNext & -2147483648) | ((mt[0]) & 2147483647);
			mt[((org.apache.commons.math3.random.MersenneTwister.N) - 1)] = ((mt[((org.apache.commons.math3.random.MersenneTwister.M) - 1)]) ^ (y >>> 1)) ^ (org.apache.commons.math3.random.MersenneTwister.MAG01[(y & 1)]);
			mti = 0;
		}
		y = mt[((mti)++)];
		y ^= y >>> 11;
		y ^= (y << 7) & -1658038656;
		y ^= (y << 15) & -272236544;
		y ^= y >>> 18;
		return y >>> (32 - bits);
	}
}


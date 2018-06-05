

package org.apache.commons.math.random;


public class ISAACRandom extends org.apache.commons.math.random.BitsStreamGenerator implements java.io.Serializable {
	private static final long serialVersionUID = 7288197941165002400L;

	private static final int SIZE_L = 8;

	private static final int SIZE = 1 << (org.apache.commons.math.random.ISAACRandom.SIZE_L);

	private static final int H_SIZE = (org.apache.commons.math.random.ISAACRandom.SIZE) >> 1;

	private static final int MASK = ((org.apache.commons.math.random.ISAACRandom.SIZE) - 1) << 2;

	private static final int GLD_RATIO = -1640531527;

	private int[] rsl;

	private int[] mem;

	private int count;

	private int a;

	private int b;

	private int c;

	private transient int[] arr;

	private transient int x;

	private transient int i;

	private transient int j;

	public ISAACRandom() {
		allocArrays();
		setSeed(((java.lang.System.currentTimeMillis()) + (java.lang.System.identityHashCode(org.apache.commons.math.random.ISAACRandom.this))));
	}

	public ISAACRandom(long seed) {
		allocArrays();
		setSeed(seed);
	}

	public ISAACRandom(int[] seed) {
		allocArrays();
		setSeed(seed);
	}

	private void allocArrays() {
		rsl = new int[org.apache.commons.math.random.ISAACRandom.SIZE];
		mem = new int[org.apache.commons.math.random.ISAACRandom.SIZE];
		arr = new int[8];
	}

	@java.lang.Override
	public void setSeed(int seed) {
		setSeed(new int[]{ seed });
	}

	@java.lang.Override
	public void setSeed(long seed) {
		setSeed(new int[]{ ((int) (seed >>> 32)) , ((int) (seed & 4294967295L)) });
	}

	@java.lang.Override
	public void setSeed(int[] seed) {
		if (seed == null) {
			setSeed(((java.lang.System.currentTimeMillis()) + (java.lang.System.identityHashCode(org.apache.commons.math.random.ISAACRandom.this))));
			return ;
		}
		int seedLen = seed.length;
		int rslLen = rsl.length;
		java.lang.System.arraycopy(seed, 0, rsl, 0, java.lang.Math.min(seedLen, rslLen));
		if (seedLen < rslLen) {
			for (i = seedLen; (i) < rslLen; (i)++) {
				long k = rsl[((i) - seedLen)];
				rsl[i] = ((int) (((1812433253L * (k ^ (k >> 30))) + (i)) & 4294967295L));
			}
		}
		initState();
	}

	@java.lang.Override
	protected int next(int bits) {
		if ((count) < 0) {
			isaac();
			count = (org.apache.commons.math.random.ISAACRandom.SIZE) - 1;
		}
		return (rsl[((count)--)]) >>> (32 - bits);
	}

	private void isaac() {
		i = 0;
		j = org.apache.commons.math.random.ISAACRandom.H_SIZE;
		b += ++(c);
		while ((i) < (org.apache.commons.math.random.ISAACRandom.H_SIZE)) {
			isaac2();
		} 
		j = 0;
		while ((j) < (org.apache.commons.math.random.ISAACRandom.H_SIZE)) {
			isaac2();
		} 
	}

	private void isaac2() {
		x = mem[i];
		a ^= (a) << 13;
		a += mem[((j)++)];
		isaac3();
		x = mem[i];
		a ^= (a) >>> 6;
		a += mem[((j)++)];
		isaac3();
		x = mem[i];
		a ^= (a) << 2;
		a += mem[((j)++)];
		isaac3();
		x = mem[i];
		a ^= (a) >>> 16;
		a += mem[((j)++)];
		isaac3();
	}

	private void isaac3() {
		mem[i] = ((mem[(((x) & (org.apache.commons.math.random.ISAACRandom.MASK)) >> 2)]) + (a)) + (b);
		b = (mem[((((mem[i]) >> (org.apache.commons.math.random.ISAACRandom.SIZE_L)) & (org.apache.commons.math.random.ISAACRandom.MASK)) >> 2)]) + (x);
		rsl[((i)++)] = b;
	}

	private void initState() {
		a = b = c = 0;
		for (i = 0; (i) < (arr.length); (i)++) {
			arr[i] = org.apache.commons.math.random.ISAACRandom.GLD_RATIO;
		}
		for (i = 0; (i) < 4; (i)++) {
			shuffle();
		}
		for (i = 0; (i) < (org.apache.commons.math.random.ISAACRandom.SIZE); i += 8) {
			arr[0] += rsl[i];
			arr[1] += rsl[((i) + 1)];
			arr[2] += rsl[((i) + 2)];
			arr[3] += rsl[((i) + 3)];
			arr[4] += rsl[((i) + 4)];
			arr[5] += rsl[((i) + 5)];
			arr[6] += rsl[((i) + 6)];
			arr[7] += rsl[((i) + 7)];
			shuffle();
			setState();
		}
		for (i = 0; (i) < (org.apache.commons.math.random.ISAACRandom.SIZE); i += 8) {
			arr[0] += mem[i];
			arr[1] += mem[((i) + 1)];
			arr[2] += mem[((i) + 2)];
			arr[3] += mem[((i) + 3)];
			arr[4] += mem[((i) + 4)];
			arr[5] += mem[((i) + 5)];
			arr[6] += mem[((i) + 6)];
			arr[7] += mem[((i) + 7)];
			shuffle();
			setState();
		}
		isaac();
		count = (org.apache.commons.math.random.ISAACRandom.SIZE) - 1;
	}

	private void shuffle() {
		arr[0] ^= (arr[1]) << 11;
		arr[3] += arr[0];
		arr[1] += arr[2];
		arr[1] ^= (arr[2]) >>> 2;
		arr[4] += arr[1];
		arr[2] += arr[3];
		arr[2] ^= (arr[3]) << 8;
		arr[5] += arr[2];
		arr[3] += arr[4];
		arr[3] ^= (arr[4]) >>> 16;
		arr[6] += arr[3];
		arr[4] += arr[5];
		arr[4] ^= (arr[5]) << 10;
		arr[7] += arr[4];
		arr[5] += arr[6];
		arr[5] ^= (arr[6]) >>> 4;
		arr[0] += arr[5];
		arr[6] += arr[7];
		arr[6] ^= (arr[7]) << 8;
		arr[1] += arr[6];
		arr[7] += arr[0];
		arr[7] ^= (arr[0]) >>> 9;
		arr[2] += arr[7];
		arr[0] += arr[1];
	}

	private void setState() {
		mem[i] = arr[0];
		mem[((i) + 1)] = arr[1];
		mem[((i) + 2)] = arr[2];
		mem[((i) + 3)] = arr[3];
		mem[((i) + 4)] = arr[4];
		mem[((i) + 5)] = arr[5];
		mem[((i) + 6)] = arr[6];
		mem[((i) + 7)] = arr[7];
	}
}


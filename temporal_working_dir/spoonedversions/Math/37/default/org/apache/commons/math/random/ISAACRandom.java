

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

	private int isaacA;

	private int isaacB;

	private int isaacC;

	private transient int[] arr;

	private transient int isaacX;

	private transient int isaacI;

	private transient int isaacJ;

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
		final int seedLen = seed.length;
		final int rslLen = rsl.length;
		java.lang.System.arraycopy(seed, 0, rsl, 0, java.lang.Math.min(seedLen, rslLen));
		if (seedLen < rslLen) {
			for (int j = seedLen; j < rslLen; j++) {
				long k = rsl[(j - seedLen)];
				rsl[j] = ((int) (((1812433253L * (k ^ (k >> 30))) + j) & 4294967295L));
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
		isaacI = 0;
		isaacJ = org.apache.commons.math.random.ISAACRandom.H_SIZE;
		isaacB += ++(isaacC);
		while ((isaacI) < (org.apache.commons.math.random.ISAACRandom.H_SIZE)) {
			isaac2();
		} 
		isaacJ = 0;
		while ((isaacJ) < (org.apache.commons.math.random.ISAACRandom.H_SIZE)) {
			isaac2();
		} 
	}

	private void isaac2() {
		isaacX = mem[isaacI];
		isaacA ^= (isaacA) << 13;
		isaacA += mem[((isaacJ)++)];
		isaac3();
		isaacX = mem[isaacI];
		isaacA ^= (isaacA) >>> 6;
		isaacA += mem[((isaacJ)++)];
		isaac3();
		isaacX = mem[isaacI];
		isaacA ^= (isaacA) << 2;
		isaacA += mem[((isaacJ)++)];
		isaac3();
		isaacX = mem[isaacI];
		isaacA ^= (isaacA) >>> 16;
		isaacA += mem[((isaacJ)++)];
		isaac3();
	}

	private void isaac3() {
		mem[isaacI] = ((mem[(((isaacX) & (org.apache.commons.math.random.ISAACRandom.MASK)) >> 2)]) + (isaacA)) + (isaacB);
		isaacB = (mem[((((mem[isaacI]) >> (org.apache.commons.math.random.ISAACRandom.SIZE_L)) & (org.apache.commons.math.random.ISAACRandom.MASK)) >> 2)]) + (isaacX);
		rsl[((isaacI)++)] = isaacB;
	}

	private void initState() {
		isaacA = 0;
		isaacB = 0;
		isaacC = 0;
		for (int j = 0; j < (arr.length); j++) {
			arr[j] = org.apache.commons.math.random.ISAACRandom.GLD_RATIO;
		}
		for (int j = 0; j < 4; j++) {
			shuffle();
		}
		for (int j = 0; j < (org.apache.commons.math.random.ISAACRandom.SIZE); j += 8) {
			arr[0] += rsl[j];
			arr[1] += rsl[(j + 1)];
			arr[2] += rsl[(j + 2)];
			arr[3] += rsl[(j + 3)];
			arr[4] += rsl[(j + 4)];
			arr[5] += rsl[(j + 5)];
			arr[6] += rsl[(j + 6)];
			arr[7] += rsl[(j + 7)];
			shuffle();
			setState(j);
		}
		for (int j = 0; j < (org.apache.commons.math.random.ISAACRandom.SIZE); j += 8) {
			arr[0] += mem[j];
			arr[1] += mem[(j + 1)];
			arr[2] += mem[(j + 2)];
			arr[3] += mem[(j + 3)];
			arr[4] += mem[(j + 4)];
			arr[5] += mem[(j + 5)];
			arr[6] += mem[(j + 6)];
			arr[7] += mem[(j + 7)];
			shuffle();
			setState(j);
		}
		isaac();
		count = (org.apache.commons.math.random.ISAACRandom.SIZE) - 1;
		clear();
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

	private void setState(int start) {
		mem[start] = arr[0];
		mem[(start + 1)] = arr[1];
		mem[(start + 2)] = arr[2];
		mem[(start + 3)] = arr[3];
		mem[(start + 4)] = arr[4];
		mem[(start + 5)] = arr[5];
		mem[(start + 6)] = arr[6];
		mem[(start + 7)] = arr[7];
	}
}


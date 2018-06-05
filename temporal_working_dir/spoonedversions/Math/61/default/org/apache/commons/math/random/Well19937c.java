

package org.apache.commons.math.random;


public class Well19937c extends org.apache.commons.math.random.AbstractWell {
	private static final long serialVersionUID = -7203498180754925124L;

	private static final int K = 19937;

	private static final int M1 = 70;

	private static final int M2 = 179;

	private static final int M3 = 449;

	public Well19937c() {
		super(org.apache.commons.math.random.Well19937c.K, org.apache.commons.math.random.Well19937c.M1, org.apache.commons.math.random.Well19937c.M2, org.apache.commons.math.random.Well19937c.M3);
	}

	public Well19937c(int seed) {
		super(org.apache.commons.math.random.Well19937c.K, org.apache.commons.math.random.Well19937c.M1, org.apache.commons.math.random.Well19937c.M2, org.apache.commons.math.random.Well19937c.M3, seed);
	}

	public Well19937c(int[] seed) {
		super(org.apache.commons.math.random.Well19937c.K, org.apache.commons.math.random.Well19937c.M1, org.apache.commons.math.random.Well19937c.M2, org.apache.commons.math.random.Well19937c.M3, seed);
	}

	public Well19937c(long seed) {
		super(org.apache.commons.math.random.Well19937c.K, org.apache.commons.math.random.Well19937c.M1, org.apache.commons.math.random.Well19937c.M2, org.apache.commons.math.random.Well19937c.M3, seed);
	}

	protected int next(final int bits) {
		final int indexRm1 = iRm1[index];
		final int indexRm2 = iRm2[index];
		final int v0 = v[index];
		final int vM1 = v[i1[index]];
		final int vM2 = v[i2[index]];
		final int vM3 = v[i3[index]];
		final int z0 = (-2147483648 & (v[indexRm1])) ^ (2147483647 & (v[indexRm2]));
		final int z1 = (v0 ^ (v0 << 25)) ^ (vM1 ^ (vM1 >>> 27));
		final int z2 = (vM2 >>> 9) ^ (vM3 ^ (vM3 >>> 1));
		final int z3 = z1 ^ z2;
		int z4 = ((z0 ^ (z1 ^ (z1 << 9))) ^ (z2 ^ (z2 << 21))) ^ (z3 ^ (z3 >>> 21));
		v[index] = z3;
		v[indexRm1] = z4;
		v[indexRm2] &= -2147483648;
		index = indexRm1;
		z4 = z4 ^ ((z4 << 7) & -462547200);
		z4 = z4 ^ ((z4 << 15) & -1685684224);
		return z4 >>> (32 - bits);
	}
}


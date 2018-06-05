

package org.apache.commons.math.random;


public class Well44497a extends org.apache.commons.math.random.AbstractWell {
	private static final long serialVersionUID = -3859207588353972099L;

	private static final int K = 44497;

	private static final int M1 = 23;

	private static final int M2 = 481;

	private static final int M3 = 229;

	public Well44497a() {
		super(org.apache.commons.math.random.Well44497a.K, org.apache.commons.math.random.Well44497a.M1, org.apache.commons.math.random.Well44497a.M2, org.apache.commons.math.random.Well44497a.M3);
	}

	public Well44497a(int seed) {
		super(org.apache.commons.math.random.Well44497a.K, org.apache.commons.math.random.Well44497a.M1, org.apache.commons.math.random.Well44497a.M2, org.apache.commons.math.random.Well44497a.M3, seed);
	}

	public Well44497a(int[] seed) {
		super(org.apache.commons.math.random.Well44497a.K, org.apache.commons.math.random.Well44497a.M1, org.apache.commons.math.random.Well44497a.M2, org.apache.commons.math.random.Well44497a.M3, seed);
	}

	public Well44497a(long seed) {
		super(org.apache.commons.math.random.Well44497a.K, org.apache.commons.math.random.Well44497a.M1, org.apache.commons.math.random.Well44497a.M2, org.apache.commons.math.random.Well44497a.M3, seed);
	}

	@java.lang.Override
	protected int next(final int bits) {
		final int indexRm1 = iRm1[index];
		final int indexRm2 = iRm2[index];
		final int v0 = v[index];
		final int vM1 = v[i1[index]];
		final int vM2 = v[i2[index]];
		final int vM3 = v[i3[index]];
		final int z0 = (-32768 & (v[indexRm1])) ^ (32767 & (v[indexRm2]));
		final int z1 = (v0 ^ (v0 << 24)) ^ (vM1 ^ (vM1 >>> 30));
		final int z2 = (vM2 ^ (vM2 << 10)) ^ (vM3 << 26);
		final int z3 = z1 ^ z2;
		final int z2Prime = ((z2 << 9) ^ (z2 >>> 23)) & -67108865;
		final int z2Second = (z2 & 131072) != 0 ? z2Prime ^ -1221985044 : z2Prime;
		final int z4 = ((z0 ^ (z1 ^ (z1 >>> 20))) ^ z2Second) ^ z3;
		v[index] = z3;
		v[indexRm1] = z4;
		v[indexRm2] &= -32768;
		index = indexRm1;
		return z4 >>> (32 - bits);
	}
}


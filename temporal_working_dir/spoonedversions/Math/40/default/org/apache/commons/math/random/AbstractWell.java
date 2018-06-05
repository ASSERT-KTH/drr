

package org.apache.commons.math.random;


public abstract class AbstractWell extends org.apache.commons.math.random.BitsStreamGenerator implements java.io.Serializable {
	private static final long serialVersionUID = -817701723016583596L;

	protected int index;

	protected final int[] v;

	protected final int[] iRm1;

	protected final int[] iRm2;

	protected final int[] i1;

	protected final int[] i2;

	protected final int[] i3;

	protected AbstractWell(final int k, final int m1, final int m2, final int m3) {
		this(k, m1, m2, m3, null);
	}

	protected AbstractWell(final int k, final int m1, final int m2, final int m3, final int seed) {
		this(k, m1, m2, m3, new int[]{ seed });
	}

	protected AbstractWell(final int k, final int m1, final int m2, final int m3, final int[] seed) {
		final int w = 32;
		final int r = ((k + w) - 1) / w;
		this.v = new int[r];
		org.apache.commons.math.random.AbstractWell.this.index = 0;
		iRm1 = new int[r];
		iRm2 = new int[r];
		i1 = new int[r];
		i2 = new int[r];
		i3 = new int[r];
		for (int j = 0; j < r; ++j) {
			iRm1[j] = ((j + r) - 1) % r;
			iRm2[j] = ((j + r) - 2) % r;
			i1[j] = (j + m1) % r;
			i2[j] = (j + m2) % r;
			i3[j] = (j + m3) % r;
		}
		setSeed(seed);
	}

	protected AbstractWell(final int k, final int m1, final int m2, final int m3, final long seed) {
		this(k, m1, m2, m3, new int[]{ ((int) (seed >>> 32)) , ((int) (seed & 4294967295L)) });
	}

	@java.lang.Override
	public void setSeed(final int seed) {
		setSeed(new int[]{ seed });
	}

	@java.lang.Override
	public void setSeed(final int[] seed) {
		if (seed == null) {
			setSeed(((java.lang.System.currentTimeMillis()) + (java.lang.System.identityHashCode(org.apache.commons.math.random.AbstractWell.this))));
			return ;
		}
		java.lang.System.arraycopy(seed, 0, v, 0, java.lang.Math.min(seed.length, v.length));
		if ((seed.length) < (v.length)) {
			for (int i = seed.length; i < (v.length); ++i) {
				final long l = v[(i - (seed.length))];
				v[i] = ((int) (((1812433253L * (l ^ (l >> 30))) + i) & 4294967295L));
			}
		}
		index = 0;
	}

	@java.lang.Override
	public void setSeed(final long seed) {
		setSeed(new int[]{ ((int) (seed >>> 32)) , ((int) (seed & 4294967295L)) });
	}

	@java.lang.Override
	protected abstract int next(final int bits);
}


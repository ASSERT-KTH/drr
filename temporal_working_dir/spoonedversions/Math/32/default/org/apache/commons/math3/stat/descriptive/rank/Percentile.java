

package org.apache.commons.math3.stat.descriptive.rank;


public class Percentile extends org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic implements java.io.Serializable {
	private static final long serialVersionUID = -8091216485095130416L;

	private static final int MIN_SELECT_SIZE = 15;

	private static final int MAX_CACHED_LEVELS = 10;

	private double quantile = 0.0;

	private int[] cachedPivots;

	public Percentile() {
		this(50.0);
	}

	public Percentile(final double p) {
		setQuantile(p);
		cachedPivots = null;
	}

	public Percentile(org.apache.commons.math3.stat.descriptive.rank.Percentile original) {
		org.apache.commons.math3.stat.descriptive.rank.Percentile.copy(original, org.apache.commons.math3.stat.descriptive.rank.Percentile.this);
	}

	@java.lang.Override
	public void setData(final double[] values) {
		if (values == null) {
			cachedPivots = null;
		}else {
			cachedPivots = new int[(1 << (org.apache.commons.math3.stat.descriptive.rank.Percentile.MAX_CACHED_LEVELS)) - 1];
			java.util.Arrays.fill(cachedPivots, (-1));
		}
		super.setData(values);
	}

	@java.lang.Override
	public void setData(final double[] values, final int begin, final int length) {
		if (values == null) {
			cachedPivots = null;
		}else {
			cachedPivots = new int[(1 << (org.apache.commons.math3.stat.descriptive.rank.Percentile.MAX_CACHED_LEVELS)) - 1];
			java.util.Arrays.fill(cachedPivots, (-1));
		}
		super.setData(values, begin, length);
	}

	public double evaluate(final double p) {
		return evaluate(getDataRef(), p);
	}

	public double evaluate(final double[] values, final double p) {
		test(values, 0, 0);
		return evaluate(values, 0, values.length, p);
	}

	@java.lang.Override
	public double evaluate(final double[] values, final int start, final int length) {
		return evaluate(values, start, length, quantile);
	}

	public double evaluate(final double[] values, final int begin, final int length, final double p) {
		test(values, begin, length);
		if ((p > 100) || (p <= 0)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_BOUNDS_QUANTILE_VALUE, p, 0, 100);
		}
		if (length == 0) {
			return java.lang.Double.NaN;
		}
		if (length == 1) {
			return values[begin];
		}
		double n = length;
		double pos = (p * (n + 1)) / 100;
		double fpos = org.apache.commons.math3.util.FastMath.floor(pos);
		int intPos = ((int) (fpos));
		double dif = pos - fpos;
		double[] work;
		int[] pivotsHeap;
		if (values == (getDataRef())) {
			work = getDataRef();
			pivotsHeap = cachedPivots;
		}else {
			work = new double[length];
			java.lang.System.arraycopy(values, begin, work, 0, length);
			pivotsHeap = new int[(1 << (org.apache.commons.math3.stat.descriptive.rank.Percentile.MAX_CACHED_LEVELS)) - 1];
			java.util.Arrays.fill(pivotsHeap, (-1));
		}
		if (pos < 1) {
			return select(work, pivotsHeap, 0);
		}
		if (pos >= n) {
			return select(work, pivotsHeap, (length - 1));
		}
		double lower = select(work, pivotsHeap, (intPos - 1));
		double upper = select(work, pivotsHeap, intPos);
		return lower + (dif * (upper - lower));
	}

	private double select(final double[] work, final int[] pivotsHeap, final int k) {
		int begin = 0;
		int end = work.length;
		int node = 0;
		while ((end - begin) > (org.apache.commons.math3.stat.descriptive.rank.Percentile.MIN_SELECT_SIZE)) {
			final int pivot;
			if ((node < (pivotsHeap.length)) && ((pivotsHeap[node]) >= 0)) {
				pivot = pivotsHeap[node];
			}else {
				pivot = partition(work, begin, end, medianOf3(work, begin, end));
				if (node < (pivotsHeap.length)) {
					pivotsHeap[node] = pivot;
				}
			}
			if (k == pivot) {
				return work[k];
			}else
				if (k < pivot) {
					end = pivot;
					node = java.lang.Math.min(((2 * node) + 1), pivotsHeap.length);
				}else {
					begin = pivot + 1;
					node = java.lang.Math.min(((2 * node) + 2), pivotsHeap.length);
				}
			
		} 
		insertionSort(work, begin, end);
		return work[k];
	}

	int medianOf3(final double[] work, final int begin, final int end) {
		final int inclusiveEnd = end - 1;
		final int middle = begin + ((inclusiveEnd - begin) / 2);
		final double wBegin = work[begin];
		final double wMiddle = work[middle];
		final double wEnd = work[inclusiveEnd];
		if (wBegin < wMiddle) {
			if (wMiddle < wEnd) {
				return middle;
			}else {
				return wBegin < wEnd ? inclusiveEnd : begin;
			}
		}else {
			if (wBegin < wEnd) {
				return begin;
			}else {
				return wMiddle < wEnd ? inclusiveEnd : middle;
			}
		}
	}

	private int partition(final double[] work, final int begin, final int end, final int pivot) {
		final double value = work[pivot];
		work[pivot] = work[begin];
		int i = begin + 1;
		int j = end - 1;
		while (i < j) {
			while ((i < j) && ((work[j]) >= value)) {
				--j;
			} 
			while ((i < j) && ((work[i]) <= value)) {
				++i;
			} 
			if (i < j) {
				final double tmp = work[i];
				work[(i++)] = work[j];
				work[(j--)] = tmp;
			}
		} 
		if ((i >= end) || ((work[i]) > value)) {
			--i;
		}
		work[begin] = work[i];
		work[i] = value;
		return i;
	}

	private void insertionSort(final double[] work, final int begin, final int end) {
		for (int j = begin + 1; j < end; j++) {
			final double saved = work[j];
			int i = j - 1;
			while ((i >= begin) && (saved < (work[i]))) {
				work[(i + 1)] = work[i];
				i--;
			} 
			work[(i + 1)] = saved;
		}
	}

	public double getQuantile() {
		return quantile;
	}

	public void setQuantile(final double p) {
		if ((p <= 0) || (p > 100)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_BOUNDS_QUANTILE_VALUE, p, 0, 100);
		}
		quantile = p;
	}

	@java.lang.Override
	public org.apache.commons.math3.stat.descriptive.rank.Percentile copy() {
		org.apache.commons.math3.stat.descriptive.rank.Percentile result = new org.apache.commons.math3.stat.descriptive.rank.Percentile();
		org.apache.commons.math3.stat.descriptive.rank.Percentile.copy(org.apache.commons.math3.stat.descriptive.rank.Percentile.this, result);
		return result;
	}

	public static void copy(org.apache.commons.math3.stat.descriptive.rank.Percentile source, org.apache.commons.math3.stat.descriptive.rank.Percentile dest) throws org.apache.commons.math3.exception.NullArgumentException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(source);
		org.apache.commons.math3.util.MathUtils.checkNotNull(dest);
		dest.setData(source.getDataRef());
		if ((source.cachedPivots) != null) {
			java.lang.System.arraycopy(source.cachedPivots, 0, dest.cachedPivots, 0, source.cachedPivots.length);
		}
		dest.quantile = source.quantile;
	}
}


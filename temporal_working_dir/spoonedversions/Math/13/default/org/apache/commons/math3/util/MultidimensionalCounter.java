

package org.apache.commons.math3.util;


public class MultidimensionalCounter implements java.lang.Iterable<java.lang.Integer> {
	private final int dimension;

	private final int[] uniCounterOffset;

	private final int[] size;

	private final int totalSize;

	private final int last;

	public class Iterator implements java.util.Iterator<java.lang.Integer> {
		private final int[] counter = new int[dimension];

		private int count = -1;

		Iterator() {
			counter[last] = -1;
		}

		public boolean hasNext() {
			for (int i = 0; i < (dimension); i++) {
				if ((counter[i]) != ((size[i]) - 1)) {
					return true;
				}
			}
			return false;
		}

		public java.lang.Integer next() {
			for (int i = last; i >= 0; i--) {
				if ((counter[i]) == ((size[i]) - 1)) {
					counter[i] = 0;
				}else {
					++(counter[i]);
					break;
				}
			}
			return ++(count);
		}

		public int getCount() {
			return count;
		}

		public int[] getCounts() {
			return org.apache.commons.math3.util.MathArrays.copyOf(counter);
		}

		public int getCount(int dim) {
			return counter[dim];
		}

		public void remove() {
			throw new java.lang.UnsupportedOperationException();
		}
	}

	public MultidimensionalCounter(int... size) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		dimension = size.length;
		this.size = org.apache.commons.math3.util.MathArrays.copyOf(size);
		uniCounterOffset = new int[dimension];
		last = (dimension) - 1;
		int tS = size[last];
		for (int i = 0; i < (last); i++) {
			int count = 1;
			for (int j = i + 1; j < (dimension); j++) {
				count *= size[j];
			}
			uniCounterOffset[i] = count;
			tS *= size[i];
		}
		uniCounterOffset[last] = 0;
		if (tS <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(tS);
		}
		totalSize = tS;
	}

	public org.apache.commons.math3.util.MultidimensionalCounter.Iterator iterator() {
		return new org.apache.commons.math3.util.MultidimensionalCounter.Iterator();
	}

	public int getDimension() {
		return dimension;
	}

	public int[] getCounts(int index) throws org.apache.commons.math3.exception.OutOfRangeException {
		if ((index < 0) || (index >= (totalSize))) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(index, 0, totalSize);
		}
		final int[] indices = new int[dimension];
		int count = 0;
		for (int i = 0; i < (last); i++) {
			int idx = 0;
			final int offset = uniCounterOffset[i];
			while (count <= index) {
				count += offset;
				++idx;
			} 
			--idx;
			count -= offset;
			indices[i] = idx;
		}
		indices[last] = index - count;
		return indices;
	}

	public int getCount(int... c) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.OutOfRangeException {
		if ((c.length) != (dimension)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(c.length, dimension);
		}
		int count = 0;
		for (int i = 0; i < (dimension); i++) {
			final int index = c[i];
			if ((index < 0) || (index >= (size[i]))) {
				throw new org.apache.commons.math3.exception.OutOfRangeException(index, 0, ((size[i]) - 1));
			}
			count += (uniCounterOffset[i]) * (c[i]);
		}
		return count + (c[last]);
	}

	public int getSize() {
		return totalSize;
	}

	public int[] getSizes() {
		return org.apache.commons.math3.util.MathArrays.copyOf(size);
	}

	@java.lang.Override
	public java.lang.String toString() {
		final java.lang.StringBuilder sb = new java.lang.StringBuilder();
		for (int i = 0; i < (dimension); i++) {
			sb.append("[").append(getCount(i)).append("]");
		}
		return sb.toString();
	}
}




package org.apache.commons.math3.optim.univariate;


public class SearchInterval implements org.apache.commons.math3.optim.OptimizationData {
	private final double lower;

	private final double upper;

	private final double start;

	public SearchInterval(double lo, double hi, double init) {
		if (lo >= hi) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(lo, hi, false);
		}
		if ((init < lo) || (init > hi)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(init, lo, hi);
		}
		lower = lo;
		upper = hi;
		start = init;
	}

	public SearchInterval(double lo, double hi) {
		this(lo, hi, (0.5 * (lo + hi)));
	}

	public double getMin() {
		return lower;
	}

	public double getMax() {
		return upper;
	}

	public double getStartValue() {
		return start;
	}
}


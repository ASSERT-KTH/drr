

package org.apache.commons.math.util;


public class Incrementor {
	private int maximalCount;

	private int count = 0;

	private final org.apache.commons.math.util.Incrementor.MaxCountExceededCallback maxCountCallback;

	public Incrementor() {
		this(0);
	}

	public Incrementor(int max) {
		this(max, new org.apache.commons.math.util.Incrementor.MaxCountExceededCallback() {
			public void trigger(int max) {
				throw new org.apache.commons.math.exception.MaxCountExceededException(max);
			}
		});
	}

	public Incrementor(int max, org.apache.commons.math.util.Incrementor.MaxCountExceededCallback cb) {
		maximalCount = max;
		maxCountCallback = cb;
	}

	public void setMaximalCount(int max) {
		maximalCount = max;
	}

	public int getMaximalCount() {
		return maximalCount;
	}

	public int getCount() {
		return count;
	}

	public boolean canIncrement() {
		return (count) < (maximalCount);
	}

	public void incrementCount(int value) {
		for (int i = 0; i < value; i++) {
			incrementCount();
		}
	}

	public void incrementCount() {
		if ((++(count)) > (maximalCount)) {
			maxCountCallback.trigger(maximalCount);
		}
	}

	public void resetCount() {
		count = 0;
	}

	public interface MaxCountExceededCallback {
		void trigger(int maximalCount);
	}
}


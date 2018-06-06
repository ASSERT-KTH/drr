

package org.apache.commons.math.util;


public class Incrementor {
	private int maximalCount;

	private int count;

	public void setMaximalCount(int count) {
		maximalCount = count;
	}

	public int getMaximalCount() {
		return maximalCount;
	}

	public int getCount() {
		return count;
	}

	public void incrementCount(int value) {
		for (int i = 0; i < value; i++) {
			incrementCount();
		}
	}

	public void incrementCount() {
		if ((++(count)) > (maximalCount)) {
			throw new org.apache.commons.math.exception.MaxCountExceededException(maximalCount);
		}
	}

	public void resetCount() {
		count = 0;
	}
}


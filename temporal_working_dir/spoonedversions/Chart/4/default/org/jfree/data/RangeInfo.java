

package org.jfree.data;


public interface RangeInfo {
	public double getRangeLowerBound(boolean includeInterval);

	public double getRangeUpperBound(boolean includeInterval);

	public org.jfree.data.Range getRangeBounds(boolean includeInterval);
}


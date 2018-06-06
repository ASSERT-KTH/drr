

package org.jfree.data;


public interface DomainInfo {
	public double getDomainLowerBound(boolean includeInterval);

	public double getDomainUpperBound(boolean includeInterval);

	public org.jfree.data.Range getDomainBounds(boolean includeInterval);
}


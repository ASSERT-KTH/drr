

package org.jfree.data.xy;


public interface WindDataset extends org.jfree.data.xy.XYDataset {
	public java.lang.Number getWindDirection(int series, int item);

	public java.lang.Number getWindForce(int series, int item);
}


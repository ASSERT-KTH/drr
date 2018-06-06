

package org.jfree.chart.plot.dial;


public interface DialScale extends org.jfree.chart.plot.dial.DialLayer {
	public double valueToAngle(double value);

	public double angleToValue(double angle);
}


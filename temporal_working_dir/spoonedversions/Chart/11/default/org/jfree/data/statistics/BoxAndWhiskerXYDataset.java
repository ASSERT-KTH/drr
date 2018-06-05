

package org.jfree.data.statistics;


public interface BoxAndWhiskerXYDataset extends org.jfree.data.xy.XYDataset {
	public java.lang.Number getMeanValue(int series, int item);

	public java.lang.Number getMedianValue(int series, int item);

	public java.lang.Number getQ1Value(int series, int item);

	public java.lang.Number getQ3Value(int series, int item);

	public java.lang.Number getMinRegularValue(int series, int item);

	public java.lang.Number getMaxRegularValue(int series, int item);

	public java.lang.Number getMinOutlier(int series, int item);

	public java.lang.Number getMaxOutlier(int series, int item);

	public java.util.List getOutliers(int series, int item);

	public double getOutlierCoefficient();

	public double getFaroutCoefficient();
}


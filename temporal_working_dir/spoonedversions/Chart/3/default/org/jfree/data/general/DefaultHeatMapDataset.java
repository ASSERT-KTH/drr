

package org.jfree.data.general;


public class DefaultHeatMapDataset extends org.jfree.data.general.AbstractDataset implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable , org.jfree.data.general.HeatMapDataset {
	private int xSamples;

	private int ySamples;

	private double minX;

	private double maxX;

	private double minY;

	private double maxY;

	private double[][] zValues;

	public DefaultHeatMapDataset(int xSamples, int ySamples, double minX, double maxX, double minY, double maxY) {
		if (xSamples < 1) {
			throw new java.lang.IllegalArgumentException("Requires 'xSamples' > 0");
		}
		if (ySamples < 1) {
			throw new java.lang.IllegalArgumentException("Requires 'ySamples' > 0");
		}
		if ((java.lang.Double.isInfinite(minX)) || (java.lang.Double.isNaN(minX))) {
			throw new java.lang.IllegalArgumentException("'minX' cannot be INF or NaN.");
		}
		if ((java.lang.Double.isInfinite(maxX)) || (java.lang.Double.isNaN(maxX))) {
			throw new java.lang.IllegalArgumentException("'maxX' cannot be INF or NaN.");
		}
		if ((java.lang.Double.isInfinite(minY)) || (java.lang.Double.isNaN(minY))) {
			throw new java.lang.IllegalArgumentException("'minY' cannot be INF or NaN.");
		}
		if ((java.lang.Double.isInfinite(maxY)) || (java.lang.Double.isNaN(maxY))) {
			throw new java.lang.IllegalArgumentException("'maxY' cannot be INF or NaN.");
		}
		org.jfree.data.general.DefaultHeatMapDataset.this.xSamples = xSamples;
		org.jfree.data.general.DefaultHeatMapDataset.this.ySamples = ySamples;
		org.jfree.data.general.DefaultHeatMapDataset.this.minX = minX;
		org.jfree.data.general.DefaultHeatMapDataset.this.maxX = maxX;
		org.jfree.data.general.DefaultHeatMapDataset.this.minY = minY;
		org.jfree.data.general.DefaultHeatMapDataset.this.maxY = maxY;
		org.jfree.data.general.DefaultHeatMapDataset.this.zValues = new double[xSamples][];
		for (int x = 0; x < xSamples; x++) {
			org.jfree.data.general.DefaultHeatMapDataset.this.zValues[x] = new double[ySamples];
		}
	}

	public int getXSampleCount() {
		return org.jfree.data.general.DefaultHeatMapDataset.this.xSamples;
	}

	public int getYSampleCount() {
		return org.jfree.data.general.DefaultHeatMapDataset.this.ySamples;
	}

	public double getMinimumXValue() {
		return org.jfree.data.general.DefaultHeatMapDataset.this.minX;
	}

	public double getMaximumXValue() {
		return org.jfree.data.general.DefaultHeatMapDataset.this.maxX;
	}

	public double getMinimumYValue() {
		return org.jfree.data.general.DefaultHeatMapDataset.this.minY;
	}

	public double getMaximumYValue() {
		return org.jfree.data.general.DefaultHeatMapDataset.this.maxY;
	}

	public double getXValue(int xIndex) {
		double x = (org.jfree.data.general.DefaultHeatMapDataset.this.minX) + (((org.jfree.data.general.DefaultHeatMapDataset.this.maxX) - (org.jfree.data.general.DefaultHeatMapDataset.this.minX)) * (xIndex / ((double) (org.jfree.data.general.DefaultHeatMapDataset.this.xSamples))));
		return x;
	}

	public double getYValue(int yIndex) {
		double y = (org.jfree.data.general.DefaultHeatMapDataset.this.minY) + (((org.jfree.data.general.DefaultHeatMapDataset.this.maxY) - (org.jfree.data.general.DefaultHeatMapDataset.this.minY)) * (yIndex / ((double) (org.jfree.data.general.DefaultHeatMapDataset.this.ySamples))));
		return y;
	}

	public double getZValue(int xIndex, int yIndex) {
		return org.jfree.data.general.DefaultHeatMapDataset.this.zValues[xIndex][yIndex];
	}

	public java.lang.Number getZ(int xIndex, int yIndex) {
		return new java.lang.Double(getZValue(xIndex, yIndex));
	}

	public void setZValue(int xIndex, int yIndex, double z) {
		setZValue(xIndex, yIndex, z, true);
	}

	public void setZValue(int xIndex, int yIndex, double z, boolean notify) {
		org.jfree.data.general.DefaultHeatMapDataset.this.zValues[xIndex][yIndex] = z;
		if (notify) {
			fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.general.DefaultHeatMapDataset.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.general.DefaultHeatMapDataset)) {
			return false;
		}
		org.jfree.data.general.DefaultHeatMapDataset that = ((org.jfree.data.general.DefaultHeatMapDataset) (obj));
		if ((org.jfree.data.general.DefaultHeatMapDataset.this.xSamples) != (that.xSamples)) {
			return false;
		}
		if ((org.jfree.data.general.DefaultHeatMapDataset.this.ySamples) != (that.ySamples)) {
			return false;
		}
		if ((org.jfree.data.general.DefaultHeatMapDataset.this.minX) != (that.minX)) {
			return false;
		}
		if ((org.jfree.data.general.DefaultHeatMapDataset.this.maxX) != (that.maxX)) {
			return false;
		}
		if ((org.jfree.data.general.DefaultHeatMapDataset.this.minY) != (that.minY)) {
			return false;
		}
		if ((org.jfree.data.general.DefaultHeatMapDataset.this.maxY) != (that.maxY)) {
			return false;
		}
		if (!(org.jfree.data.DataUtilities.equal(org.jfree.data.general.DefaultHeatMapDataset.this.zValues, that.zValues))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.general.DefaultHeatMapDataset clone = ((org.jfree.data.general.DefaultHeatMapDataset) (super.clone()));
		clone.zValues = org.jfree.data.DataUtilities.clone(org.jfree.data.general.DefaultHeatMapDataset.this.zValues);
		return clone;
	}
}


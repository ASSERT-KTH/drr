

package org.jfree.data.xy;


public class DefaultXYDataset extends org.jfree.data.xy.AbstractXYDataset implements org.jfree.chart.util.PublicCloneable , org.jfree.data.xy.XYDataset {
	private java.util.List seriesKeys;

	private java.util.List seriesList;

	public DefaultXYDataset() {
		org.jfree.data.xy.DefaultXYDataset.this.seriesKeys = new java.util.ArrayList();
		org.jfree.data.xy.DefaultXYDataset.this.seriesList = new java.util.ArrayList();
	}

	public int getSeriesCount() {
		return org.jfree.data.xy.DefaultXYDataset.this.seriesList.size();
	}

	public java.lang.Comparable getSeriesKey(int series) {
		if ((series < 0) || (series >= (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException("Series index out of bounds");
		}
		return ((java.lang.Comparable) (org.jfree.data.xy.DefaultXYDataset.this.seriesKeys.get(series)));
	}

	public int indexOf(java.lang.Comparable seriesKey) {
		return org.jfree.data.xy.DefaultXYDataset.this.seriesKeys.indexOf(seriesKey);
	}

	public org.jfree.data.DomainOrder getDomainOrder() {
		return org.jfree.data.DomainOrder.NONE;
	}

	public int getItemCount(int series) {
		if ((series < 0) || (series >= (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException("Series index out of bounds");
		}
		double[][] seriesArray = ((double[][]) (org.jfree.data.xy.DefaultXYDataset.this.seriesList.get(series)));
		return seriesArray[0].length;
	}

	public double getXValue(int series, int item) {
		double[][] seriesData = ((double[][]) (org.jfree.data.xy.DefaultXYDataset.this.seriesList.get(series)));
		return seriesData[0][item];
	}

	public java.lang.Number getX(int series, int item) {
		return new java.lang.Double(getXValue(series, item));
	}

	public double getYValue(int series, int item) {
		double[][] seriesData = ((double[][]) (org.jfree.data.xy.DefaultXYDataset.this.seriesList.get(series)));
		return seriesData[1][item];
	}

	public java.lang.Number getY(int series, int item) {
		return new java.lang.Double(getYValue(series, item));
	}

	public void addSeries(java.lang.Comparable seriesKey, double[][] data) {
		if (seriesKey == null) {
			throw new java.lang.IllegalArgumentException("The 'seriesKey' cannot be null.");
		}
		if (data == null) {
			throw new java.lang.IllegalArgumentException("The 'data' is null.");
		}
		if ((data.length) != 2) {
			throw new java.lang.IllegalArgumentException("The 'data' array must have length == 2.");
		}
		if ((data[0].length) != (data[1].length)) {
			throw new java.lang.IllegalArgumentException("The 'data' array must contain two arrays with equal length.");
		}
		int seriesIndex = indexOf(seriesKey);
		if (seriesIndex == (-1)) {
			org.jfree.data.xy.DefaultXYDataset.this.seriesKeys.add(seriesKey);
			org.jfree.data.xy.DefaultXYDataset.this.seriesList.add(data);
		}else {
			org.jfree.data.xy.DefaultXYDataset.this.seriesList.remove(seriesIndex);
			org.jfree.data.xy.DefaultXYDataset.this.seriesList.add(seriesIndex, data);
		}
		notifyListeners(new org.jfree.data.general.DatasetChangeEvent(org.jfree.data.xy.DefaultXYDataset.this, org.jfree.data.xy.DefaultXYDataset.this));
	}

	public void removeSeries(java.lang.Comparable seriesKey) {
		int seriesIndex = indexOf(seriesKey);
		if (seriesIndex >= 0) {
			org.jfree.data.xy.DefaultXYDataset.this.seriesKeys.remove(seriesIndex);
			org.jfree.data.xy.DefaultXYDataset.this.seriesList.remove(seriesIndex);
			notifyListeners(new org.jfree.data.general.DatasetChangeEvent(org.jfree.data.xy.DefaultXYDataset.this, org.jfree.data.xy.DefaultXYDataset.this));
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.xy.DefaultXYDataset.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.xy.DefaultXYDataset)) {
			return false;
		}
		org.jfree.data.xy.DefaultXYDataset that = ((org.jfree.data.xy.DefaultXYDataset) (obj));
		if (!(org.jfree.data.xy.DefaultXYDataset.this.seriesKeys.equals(that.seriesKeys))) {
			return false;
		}
		for (int i = 0; i < (org.jfree.data.xy.DefaultXYDataset.this.seriesList.size()); i++) {
			double[][] d1 = ((double[][]) (org.jfree.data.xy.DefaultXYDataset.this.seriesList.get(i)));
			double[][] d2 = ((double[][]) (that.seriesList.get(i)));
			double[] d1x = d1[0];
			double[] d2x = d2[0];
			if (!(java.util.Arrays.equals(d1x, d2x))) {
				return false;
			}
			double[] d1y = d1[1];
			double[] d2y = d2[1];
			if (!(java.util.Arrays.equals(d1y, d2y))) {
				return false;
			}
		}
		return true;
	}

	public int hashCode() {
		int result;
		result = org.jfree.data.xy.DefaultXYDataset.this.seriesKeys.hashCode();
		result = (29 * result) + (org.jfree.data.xy.DefaultXYDataset.this.seriesList.hashCode());
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.xy.DefaultXYDataset clone = ((org.jfree.data.xy.DefaultXYDataset) (super.clone()));
		clone.seriesKeys = new java.util.ArrayList(org.jfree.data.xy.DefaultXYDataset.this.seriesKeys);
		clone.seriesList = new java.util.ArrayList(org.jfree.data.xy.DefaultXYDataset.this.seriesList.size());
		for (int i = 0; i < (org.jfree.data.xy.DefaultXYDataset.this.seriesList.size()); i++) {
			double[][] data = ((double[][]) (org.jfree.data.xy.DefaultXYDataset.this.seriesList.get(i)));
			double[] x = data[0];
			double[] y = data[1];
			double[] xx = new double[x.length];
			double[] yy = new double[y.length];
			java.lang.System.arraycopy(x, 0, xx, 0, x.length);
			java.lang.System.arraycopy(y, 0, yy, 0, y.length);
			clone.seriesList.add(i, new double[][]{ xx , yy });
		}
		return clone;
	}
}


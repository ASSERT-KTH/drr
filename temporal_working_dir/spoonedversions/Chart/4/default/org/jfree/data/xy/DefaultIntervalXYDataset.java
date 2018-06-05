

package org.jfree.data.xy;


public class DefaultIntervalXYDataset extends org.jfree.data.xy.AbstractIntervalXYDataset implements org.jfree.chart.util.PublicCloneable {
	private java.util.List seriesKeys;

	private java.util.List seriesList;

	public DefaultIntervalXYDataset() {
		org.jfree.data.xy.DefaultIntervalXYDataset.this.seriesKeys = new java.util.ArrayList();
		org.jfree.data.xy.DefaultIntervalXYDataset.this.seriesList = new java.util.ArrayList();
	}

	public int getSeriesCount() {
		return org.jfree.data.xy.DefaultIntervalXYDataset.this.seriesList.size();
	}

	public java.lang.Comparable getSeriesKey(int series) {
		if ((series < 0) || (series >= (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException("Series index out of bounds");
		}
		return ((java.lang.Comparable) (org.jfree.data.xy.DefaultIntervalXYDataset.this.seriesKeys.get(series)));
	}

	public int getItemCount(int series) {
		if ((series < 0) || (series >= (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException("Series index out of bounds");
		}
		double[][] seriesArray = ((double[][]) (org.jfree.data.xy.DefaultIntervalXYDataset.this.seriesList.get(series)));
		return seriesArray[0].length;
	}

	public double getXValue(int series, int item) {
		double[][] seriesData = ((double[][]) (org.jfree.data.xy.DefaultIntervalXYDataset.this.seriesList.get(series)));
		return seriesData[0][item];
	}

	public double getYValue(int series, int item) {
		double[][] seriesData = ((double[][]) (org.jfree.data.xy.DefaultIntervalXYDataset.this.seriesList.get(series)));
		return seriesData[3][item];
	}

	public double getStartXValue(int series, int item) {
		double[][] seriesData = ((double[][]) (org.jfree.data.xy.DefaultIntervalXYDataset.this.seriesList.get(series)));
		return seriesData[1][item];
	}

	public double getEndXValue(int series, int item) {
		double[][] seriesData = ((double[][]) (org.jfree.data.xy.DefaultIntervalXYDataset.this.seriesList.get(series)));
		return seriesData[2][item];
	}

	public double getStartYValue(int series, int item) {
		double[][] seriesData = ((double[][]) (org.jfree.data.xy.DefaultIntervalXYDataset.this.seriesList.get(series)));
		return seriesData[4][item];
	}

	public double getEndYValue(int series, int item) {
		double[][] seriesData = ((double[][]) (org.jfree.data.xy.DefaultIntervalXYDataset.this.seriesList.get(series)));
		return seriesData[5][item];
	}

	public java.lang.Number getEndX(int series, int item) {
		return new java.lang.Double(getEndXValue(series, item));
	}

	public java.lang.Number getEndY(int series, int item) {
		return new java.lang.Double(getEndYValue(series, item));
	}

	public java.lang.Number getStartX(int series, int item) {
		return new java.lang.Double(getStartXValue(series, item));
	}

	public java.lang.Number getStartY(int series, int item) {
		return new java.lang.Double(getStartYValue(series, item));
	}

	public java.lang.Number getX(int series, int item) {
		return new java.lang.Double(getXValue(series, item));
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
		if ((data.length) != 6) {
			throw new java.lang.IllegalArgumentException("The 'data' array must have length == 6.");
		}
		int length = data[0].length;
		if (((((length != (data[1].length)) || (length != (data[2].length))) || (length != (data[3].length))) || (length != (data[4].length))) || (length != (data[5].length))) {
			throw new java.lang.IllegalArgumentException("The 'data' array must contain two arrays with equal length.");
		}
		int seriesIndex = indexOf(seriesKey);
		if (seriesIndex == (-1)) {
			org.jfree.data.xy.DefaultIntervalXYDataset.this.seriesKeys.add(seriesKey);
			org.jfree.data.xy.DefaultIntervalXYDataset.this.seriesList.add(data);
		}else {
			org.jfree.data.xy.DefaultIntervalXYDataset.this.seriesList.remove(seriesIndex);
			org.jfree.data.xy.DefaultIntervalXYDataset.this.seriesList.add(seriesIndex, data);
		}
		notifyListeners(new org.jfree.data.general.DatasetChangeEvent(org.jfree.data.xy.DefaultIntervalXYDataset.this, org.jfree.data.xy.DefaultIntervalXYDataset.this));
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.xy.DefaultIntervalXYDataset.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.xy.DefaultIntervalXYDataset)) {
			return false;
		}
		org.jfree.data.xy.DefaultIntervalXYDataset that = ((org.jfree.data.xy.DefaultIntervalXYDataset) (obj));
		if (!(org.jfree.data.xy.DefaultIntervalXYDataset.this.seriesKeys.equals(that.seriesKeys))) {
			return false;
		}
		for (int i = 0; i < (org.jfree.data.xy.DefaultIntervalXYDataset.this.seriesList.size()); i++) {
			double[][] d1 = ((double[][]) (org.jfree.data.xy.DefaultIntervalXYDataset.this.seriesList.get(i)));
			double[][] d2 = ((double[][]) (that.seriesList.get(i)));
			double[] d1x = d1[0];
			double[] d2x = d2[0];
			if (!(java.util.Arrays.equals(d1x, d2x))) {
				return false;
			}
			double[] d1xs = d1[1];
			double[] d2xs = d2[1];
			if (!(java.util.Arrays.equals(d1xs, d2xs))) {
				return false;
			}
			double[] d1xe = d1[2];
			double[] d2xe = d2[2];
			if (!(java.util.Arrays.equals(d1xe, d2xe))) {
				return false;
			}
			double[] d1y = d1[3];
			double[] d2y = d2[3];
			if (!(java.util.Arrays.equals(d1y, d2y))) {
				return false;
			}
			double[] d1ys = d1[4];
			double[] d2ys = d2[4];
			if (!(java.util.Arrays.equals(d1ys, d2ys))) {
				return false;
			}
			double[] d1ye = d1[5];
			double[] d2ye = d2[5];
			if (!(java.util.Arrays.equals(d1ye, d2ye))) {
				return false;
			}
		}
		return true;
	}

	public int hashCode() {
		int result;
		result = org.jfree.data.xy.DefaultIntervalXYDataset.this.seriesKeys.hashCode();
		result = (29 * result) + (org.jfree.data.xy.DefaultIntervalXYDataset.this.seriesList.hashCode());
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.xy.DefaultIntervalXYDataset clone = ((org.jfree.data.xy.DefaultIntervalXYDataset) (super.clone()));
		clone.seriesKeys = new java.util.ArrayList(org.jfree.data.xy.DefaultIntervalXYDataset.this.seriesKeys);
		clone.seriesList = new java.util.ArrayList(org.jfree.data.xy.DefaultIntervalXYDataset.this.seriesList.size());
		for (int i = 0; i < (org.jfree.data.xy.DefaultIntervalXYDataset.this.seriesList.size()); i++) {
			double[][] data = ((double[][]) (org.jfree.data.xy.DefaultIntervalXYDataset.this.seriesList.get(i)));
			double[] x = data[0];
			double[] xStart = data[1];
			double[] xEnd = data[2];
			double[] y = data[3];
			double[] yStart = data[4];
			double[] yEnd = data[5];
			double[] xx = new double[x.length];
			double[] xxStart = new double[xStart.length];
			double[] xxEnd = new double[xEnd.length];
			double[] yy = new double[y.length];
			double[] yyStart = new double[yStart.length];
			double[] yyEnd = new double[yEnd.length];
			java.lang.System.arraycopy(x, 0, xx, 0, x.length);
			java.lang.System.arraycopy(xStart, 0, xxStart, 0, xStart.length);
			java.lang.System.arraycopy(xEnd, 0, xxEnd, 0, xEnd.length);
			java.lang.System.arraycopy(y, 0, yy, 0, y.length);
			java.lang.System.arraycopy(yStart, 0, yyStart, 0, yStart.length);
			java.lang.System.arraycopy(yEnd, 0, yyEnd, 0, yEnd.length);
			clone.seriesList.add(i, new double[][]{ xx , xxStart , xxEnd , yy , yyStart , yyEnd });
		}
		return clone;
	}
}


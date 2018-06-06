

package org.jfree.data.general;


public class CombinedDataset extends org.jfree.data.xy.AbstractIntervalXYDataset implements org.jfree.data.general.CombinationDataset , org.jfree.data.xy.IntervalXYDataset , org.jfree.data.xy.OHLCDataset , org.jfree.data.xy.XYDataset {
	private java.util.List datasetInfo = new java.util.ArrayList();

	public CombinedDataset() {
		super();
	}

	public CombinedDataset(org.jfree.data.general.SeriesDataset[] data) {
		add(data);
	}

	public void add(org.jfree.data.general.SeriesDataset data) {
		fastAdd(data);
		org.jfree.data.general.DatasetChangeEvent event = new org.jfree.data.general.DatasetChangeEvent(org.jfree.data.general.CombinedDataset.this, org.jfree.data.general.CombinedDataset.this);
		notifyListeners(event);
	}

	public void add(org.jfree.data.general.SeriesDataset[] data) {
		for (int i = 0; i < (data.length); i++) {
			fastAdd(data[i]);
		}
		org.jfree.data.general.DatasetChangeEvent event = new org.jfree.data.general.DatasetChangeEvent(org.jfree.data.general.CombinedDataset.this, org.jfree.data.general.CombinedDataset.this);
		notifyListeners(event);
	}

	public void add(org.jfree.data.general.SeriesDataset data, int series) {
		add(new org.jfree.data.general.SubSeriesDataset(data, series));
	}

	private void fastAdd(org.jfree.data.general.SeriesDataset data) {
		for (int i = 0; i < (data.getSeriesCount()); i++) {
			org.jfree.data.general.CombinedDataset.this.datasetInfo.add(new org.jfree.data.general.CombinedDataset.DatasetInfo(data, i));
		}
	}

	public int getSeriesCount() {
		return org.jfree.data.general.CombinedDataset.this.datasetInfo.size();
	}

	public java.lang.Comparable getSeriesKey(int series) {
		org.jfree.data.general.CombinedDataset.DatasetInfo di = getDatasetInfo(series);
		return di.data.getSeriesKey(di.series);
	}

	public java.lang.Number getX(int series, int item) {
		org.jfree.data.general.CombinedDataset.DatasetInfo di = getDatasetInfo(series);
		return ((org.jfree.data.xy.XYDataset) (di.data)).getX(di.series, item);
	}

	public java.lang.Number getY(int series, int item) {
		org.jfree.data.general.CombinedDataset.DatasetInfo di = getDatasetInfo(series);
		return ((org.jfree.data.xy.XYDataset) (di.data)).getY(di.series, item);
	}

	public int getItemCount(int series) {
		org.jfree.data.general.CombinedDataset.DatasetInfo di = getDatasetInfo(series);
		return ((org.jfree.data.xy.XYDataset) (di.data)).getItemCount(di.series);
	}

	public java.lang.Number getHigh(int series, int item) {
		org.jfree.data.general.CombinedDataset.DatasetInfo di = getDatasetInfo(series);
		return ((org.jfree.data.xy.OHLCDataset) (di.data)).getHigh(di.series, item);
	}

	public double getHighValue(int series, int item) {
		double result = java.lang.Double.NaN;
		java.lang.Number high = getHigh(series, item);
		if (high != null) {
			result = high.doubleValue();
		}
		return result;
	}

	public java.lang.Number getLow(int series, int item) {
		org.jfree.data.general.CombinedDataset.DatasetInfo di = getDatasetInfo(series);
		return ((org.jfree.data.xy.OHLCDataset) (di.data)).getLow(di.series, item);
	}

	public double getLowValue(int series, int item) {
		double result = java.lang.Double.NaN;
		java.lang.Number low = getLow(series, item);
		if (low != null) {
			result = low.doubleValue();
		}
		return result;
	}

	public java.lang.Number getOpen(int series, int item) {
		org.jfree.data.general.CombinedDataset.DatasetInfo di = getDatasetInfo(series);
		return ((org.jfree.data.xy.OHLCDataset) (di.data)).getOpen(di.series, item);
	}

	public double getOpenValue(int series, int item) {
		double result = java.lang.Double.NaN;
		java.lang.Number open = getOpen(series, item);
		if (open != null) {
			result = open.doubleValue();
		}
		return result;
	}

	public java.lang.Number getClose(int series, int item) {
		org.jfree.data.general.CombinedDataset.DatasetInfo di = getDatasetInfo(series);
		return ((org.jfree.data.xy.OHLCDataset) (di.data)).getClose(di.series, item);
	}

	public double getCloseValue(int series, int item) {
		double result = java.lang.Double.NaN;
		java.lang.Number close = getClose(series, item);
		if (close != null) {
			result = close.doubleValue();
		}
		return result;
	}

	public java.lang.Number getVolume(int series, int item) {
		org.jfree.data.general.CombinedDataset.DatasetInfo di = getDatasetInfo(series);
		return ((org.jfree.data.xy.OHLCDataset) (di.data)).getVolume(di.series, item);
	}

	public double getVolumeValue(int series, int item) {
		double result = java.lang.Double.NaN;
		java.lang.Number volume = getVolume(series, item);
		if (volume != null) {
			result = volume.doubleValue();
		}
		return result;
	}

	public java.lang.Number getStartX(int series, int item) {
		org.jfree.data.general.CombinedDataset.DatasetInfo di = getDatasetInfo(series);
		if ((di.data) instanceof org.jfree.data.xy.IntervalXYDataset) {
			return ((org.jfree.data.xy.IntervalXYDataset) (di.data)).getStartX(di.series, item);
		}else {
			return getX(series, item);
		}
	}

	public java.lang.Number getEndX(int series, int item) {
		org.jfree.data.general.CombinedDataset.DatasetInfo di = getDatasetInfo(series);
		if ((di.data) instanceof org.jfree.data.xy.IntervalXYDataset) {
			return ((org.jfree.data.xy.IntervalXYDataset) (di.data)).getEndX(di.series, item);
		}else {
			return getX(series, item);
		}
	}

	public java.lang.Number getStartY(int series, int item) {
		org.jfree.data.general.CombinedDataset.DatasetInfo di = getDatasetInfo(series);
		if ((di.data) instanceof org.jfree.data.xy.IntervalXYDataset) {
			return ((org.jfree.data.xy.IntervalXYDataset) (di.data)).getStartY(di.series, item);
		}else {
			return getY(series, item);
		}
	}

	public java.lang.Number getEndY(int series, int item) {
		org.jfree.data.general.CombinedDataset.DatasetInfo di = getDatasetInfo(series);
		if ((di.data) instanceof org.jfree.data.xy.IntervalXYDataset) {
			return ((org.jfree.data.xy.IntervalXYDataset) (di.data)).getEndY(di.series, item);
		}else {
			return getY(series, item);
		}
	}

	public org.jfree.data.general.SeriesDataset getParent() {
		org.jfree.data.general.SeriesDataset parent = null;
		for (int i = 0; i < (org.jfree.data.general.CombinedDataset.this.datasetInfo.size()); i++) {
			org.jfree.data.general.SeriesDataset child = getDatasetInfo(i).data;
			if (child instanceof org.jfree.data.general.CombinationDataset) {
				org.jfree.data.general.SeriesDataset childParent = ((org.jfree.data.general.CombinationDataset) (child)).getParent();
				if (parent == null) {
					parent = childParent;
				}else
					if (parent != childParent) {
						return null;
					}
				
			}else {
				return null;
			}
		}
		return parent;
	}

	public int[] getMap() {
		int[] map = null;
		for (int i = 0; i < (org.jfree.data.general.CombinedDataset.this.datasetInfo.size()); i++) {
			org.jfree.data.general.SeriesDataset child = getDatasetInfo(i).data;
			if (child instanceof org.jfree.data.general.CombinationDataset) {
				int[] childMap = ((org.jfree.data.general.CombinationDataset) (child)).getMap();
				if (childMap == null) {
					return null;
				}
				map = joinMap(map, childMap);
			}else {
				return null;
			}
		}
		return map;
	}

	public int getChildPosition(org.jfree.data.general.Dataset child) {
		int n = 0;
		for (int i = 0; i < (org.jfree.data.general.CombinedDataset.this.datasetInfo.size()); i++) {
			org.jfree.data.general.SeriesDataset childDataset = getDatasetInfo(i).data;
			if (childDataset instanceof org.jfree.data.general.CombinedDataset) {
				int m = ((org.jfree.data.general.CombinedDataset) (childDataset)).getChildPosition(child);
				if (m >= 0) {
					return n + m;
				}
				n++;
			}else {
				if (child == childDataset) {
					return n;
				}
				n++;
			}
		}
		return -1;
	}

	private org.jfree.data.general.CombinedDataset.DatasetInfo getDatasetInfo(int series) {
		return ((org.jfree.data.general.CombinedDataset.DatasetInfo) (org.jfree.data.general.CombinedDataset.this.datasetInfo.get(series)));
	}

	private int[] joinMap(int[] a, int[] b) {
		if (a == null) {
			return b;
		}
		if (b == null) {
			return a;
		}
		int[] result = new int[(a.length) + (b.length)];
		java.lang.System.arraycopy(a, 0, result, 0, a.length);
		java.lang.System.arraycopy(b, 0, result, a.length, b.length);
		return result;
	}

	private class DatasetInfo {
		private org.jfree.data.general.SeriesDataset data;

		private int series;

		DatasetInfo(org.jfree.data.general.SeriesDataset data, int series) {
			org.jfree.data.general.CombinedDataset.DatasetInfo.this.data = data;
			org.jfree.data.general.CombinedDataset.DatasetInfo.this.series = series;
		}
	}
}


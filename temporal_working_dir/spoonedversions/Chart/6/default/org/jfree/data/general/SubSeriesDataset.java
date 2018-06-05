

package org.jfree.data.general;


public class SubSeriesDataset extends org.jfree.data.xy.AbstractIntervalXYDataset implements org.jfree.data.general.CombinationDataset , org.jfree.data.xy.IntervalXYDataset , org.jfree.data.xy.OHLCDataset {
	private org.jfree.data.general.SeriesDataset parent = null;

	private int[] map;

	public SubSeriesDataset(org.jfree.data.general.SeriesDataset parent, int[] map) {
		org.jfree.data.general.SubSeriesDataset.this.parent = parent;
		org.jfree.data.general.SubSeriesDataset.this.map = map;
	}

	public SubSeriesDataset(org.jfree.data.general.SeriesDataset parent, int series) {
		this(parent, new int[]{ series });
	}

	public java.lang.Number getHigh(int series, int item) {
		return ((org.jfree.data.xy.OHLCDataset) (org.jfree.data.general.SubSeriesDataset.this.parent)).getHigh(org.jfree.data.general.SubSeriesDataset.this.map[series], item);
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
		return ((org.jfree.data.xy.OHLCDataset) (org.jfree.data.general.SubSeriesDataset.this.parent)).getLow(org.jfree.data.general.SubSeriesDataset.this.map[series], item);
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
		return ((org.jfree.data.xy.OHLCDataset) (org.jfree.data.general.SubSeriesDataset.this.parent)).getOpen(org.jfree.data.general.SubSeriesDataset.this.map[series], item);
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
		return ((org.jfree.data.xy.OHLCDataset) (org.jfree.data.general.SubSeriesDataset.this.parent)).getClose(org.jfree.data.general.SubSeriesDataset.this.map[series], item);
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
		return ((org.jfree.data.xy.OHLCDataset) (org.jfree.data.general.SubSeriesDataset.this.parent)).getVolume(org.jfree.data.general.SubSeriesDataset.this.map[series], item);
	}

	public double getVolumeValue(int series, int item) {
		double result = java.lang.Double.NaN;
		java.lang.Number volume = getVolume(series, item);
		if (volume != null) {
			result = volume.doubleValue();
		}
		return result;
	}

	public java.lang.Number getX(int series, int item) {
		return ((org.jfree.data.xy.XYDataset) (org.jfree.data.general.SubSeriesDataset.this.parent)).getX(org.jfree.data.general.SubSeriesDataset.this.map[series], item);
	}

	public java.lang.Number getY(int series, int item) {
		return ((org.jfree.data.xy.XYDataset) (org.jfree.data.general.SubSeriesDataset.this.parent)).getY(org.jfree.data.general.SubSeriesDataset.this.map[series], item);
	}

	public int getItemCount(int series) {
		return ((org.jfree.data.xy.XYDataset) (org.jfree.data.general.SubSeriesDataset.this.parent)).getItemCount(org.jfree.data.general.SubSeriesDataset.this.map[series]);
	}

	public int getSeriesCount() {
		return org.jfree.data.general.SubSeriesDataset.this.map.length;
	}

	public java.lang.Comparable getSeriesKey(int series) {
		return org.jfree.data.general.SubSeriesDataset.this.parent.getSeriesKey(org.jfree.data.general.SubSeriesDataset.this.map[series]);
	}

	public java.lang.Number getStartX(int series, int item) {
		if ((org.jfree.data.general.SubSeriesDataset.this.parent) instanceof org.jfree.data.xy.IntervalXYDataset) {
			return ((org.jfree.data.xy.IntervalXYDataset) (org.jfree.data.general.SubSeriesDataset.this.parent)).getStartX(org.jfree.data.general.SubSeriesDataset.this.map[series], item);
		}else {
			return getX(series, item);
		}
	}

	public java.lang.Number getEndX(int series, int item) {
		if ((org.jfree.data.general.SubSeriesDataset.this.parent) instanceof org.jfree.data.xy.IntervalXYDataset) {
			return ((org.jfree.data.xy.IntervalXYDataset) (org.jfree.data.general.SubSeriesDataset.this.parent)).getEndX(org.jfree.data.general.SubSeriesDataset.this.map[series], item);
		}else {
			return getX(series, item);
		}
	}

	public java.lang.Number getStartY(int series, int item) {
		if ((org.jfree.data.general.SubSeriesDataset.this.parent) instanceof org.jfree.data.xy.IntervalXYDataset) {
			return ((org.jfree.data.xy.IntervalXYDataset) (org.jfree.data.general.SubSeriesDataset.this.parent)).getStartY(org.jfree.data.general.SubSeriesDataset.this.map[series], item);
		}else {
			return getY(series, item);
		}
	}

	public java.lang.Number getEndY(int series, int item) {
		if ((org.jfree.data.general.SubSeriesDataset.this.parent) instanceof org.jfree.data.xy.IntervalXYDataset) {
			return ((org.jfree.data.xy.IntervalXYDataset) (org.jfree.data.general.SubSeriesDataset.this.parent)).getEndY(org.jfree.data.general.SubSeriesDataset.this.map[series], item);
		}else {
			return getY(series, item);
		}
	}

	public org.jfree.data.general.SeriesDataset getParent() {
		return org.jfree.data.general.SubSeriesDataset.this.parent;
	}

	public int[] getMap() {
		return ((int[]) (org.jfree.data.general.SubSeriesDataset.this.map.clone()));
	}
}


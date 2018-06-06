

package org.jfree.data.statistics;


public class HistogramDataset extends org.jfree.data.xy.AbstractIntervalXYDataset implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable , org.jfree.data.xy.IntervalXYDataset {
	private static final long serialVersionUID = -6341668077370231153L;

	private java.util.List list;

	private org.jfree.data.statistics.HistogramType type;

	public HistogramDataset() {
		org.jfree.data.statistics.HistogramDataset.this.list = new java.util.ArrayList();
		org.jfree.data.statistics.HistogramDataset.this.type = org.jfree.data.statistics.HistogramType.FREQUENCY;
	}

	public org.jfree.data.statistics.HistogramType getType() {
		return org.jfree.data.statistics.HistogramDataset.this.type;
	}

	public void setType(org.jfree.data.statistics.HistogramType type) {
		if (type == null) {
			throw new java.lang.IllegalArgumentException("Null 'type' argument");
		}
		org.jfree.data.statistics.HistogramDataset.this.type = type;
		notifyListeners(new org.jfree.data.general.DatasetChangeEvent(org.jfree.data.statistics.HistogramDataset.this, org.jfree.data.statistics.HistogramDataset.this));
	}

	public void addSeries(java.lang.Comparable key, double[] values, int bins) {
		double minimum = getMinimum(values);
		double maximum = getMaximum(values);
		addSeries(key, values, bins, minimum, maximum);
	}

	public void addSeries(java.lang.Comparable key, double[] values, int bins, double minimum, double maximum) {
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		if (values == null) {
			throw new java.lang.IllegalArgumentException("Null 'values' argument.");
		}else
			if (bins < 1) {
				throw new java.lang.IllegalArgumentException("The 'bins' value must be at least 1.");
			}
		
		double binWidth = (maximum - minimum) / bins;
		double lower = minimum;
		double upper;
		java.util.List binList = new java.util.ArrayList(bins);
		for (int i = 0; i < bins; i++) {
			org.jfree.data.statistics.HistogramBin bin;
			if (i == (bins - 1)) {
				bin = new org.jfree.data.statistics.HistogramBin(lower, maximum);
			}else {
				upper = minimum + ((i + 1) * binWidth);
				bin = new org.jfree.data.statistics.HistogramBin(lower, upper);
				lower = upper;
			}
			binList.add(bin);
		}
		for (int i = 0; i < (values.length); i++) {
			int binIndex = bins - 1;
			if ((values[i]) < maximum) {
				double fraction = ((values[i]) - minimum) / (maximum - minimum);
				if (fraction < 0.0) {
					fraction = 0.0;
				}
				binIndex = ((int) (fraction * bins));
				if (binIndex >= bins) {
					binIndex = bins - 1;
				}
			}
			org.jfree.data.statistics.HistogramBin bin = ((org.jfree.data.statistics.HistogramBin) (binList.get(binIndex)));
			bin.incrementCount();
		}
		java.util.Map map = new java.util.HashMap();
		map.put("key", key);
		map.put("bins", binList);
		map.put("values.length", new java.lang.Integer(values.length));
		map.put("bin width", new java.lang.Double(binWidth));
		org.jfree.data.statistics.HistogramDataset.this.list.add(map);
	}

	private double getMinimum(double[] values) {
		if ((values == null) || ((values.length) < 1)) {
			throw new java.lang.IllegalArgumentException("Null or zero length 'values' argument.");
		}
		double min = java.lang.Double.MAX_VALUE;
		for (int i = 0; i < (values.length); i++) {
			if ((values[i]) < min) {
				min = values[i];
			}
		}
		return min;
	}

	private double getMaximum(double[] values) {
		if ((values == null) || ((values.length) < 1)) {
			throw new java.lang.IllegalArgumentException("Null or zero length 'values' argument.");
		}
		double max = -(java.lang.Double.MAX_VALUE);
		for (int i = 0; i < (values.length); i++) {
			if ((values[i]) > max) {
				max = values[i];
			}
		}
		return max;
	}

	java.util.List getBins(int series) {
		java.util.Map map = ((java.util.Map) (org.jfree.data.statistics.HistogramDataset.this.list.get(series)));
		return ((java.util.List) (map.get("bins")));
	}

	private int getTotal(int series) {
		java.util.Map map = ((java.util.Map) (org.jfree.data.statistics.HistogramDataset.this.list.get(series)));
		return ((java.lang.Integer) (map.get("values.length"))).intValue();
	}

	private double getBinWidth(int series) {
		java.util.Map map = ((java.util.Map) (org.jfree.data.statistics.HistogramDataset.this.list.get(series)));
		return ((java.lang.Double) (map.get("bin width"))).doubleValue();
	}

	public int getSeriesCount() {
		return org.jfree.data.statistics.HistogramDataset.this.list.size();
	}

	public java.lang.Comparable getSeriesKey(int series) {
		java.util.Map map = ((java.util.Map) (org.jfree.data.statistics.HistogramDataset.this.list.get(series)));
		return ((java.lang.Comparable) (map.get("key")));
	}

	public int getItemCount(int series) {
		return getBins(series).size();
	}

	public java.lang.Number getX(int series, int item) {
		java.util.List bins = getBins(series);
		org.jfree.data.statistics.HistogramBin bin = ((org.jfree.data.statistics.HistogramBin) (bins.get(item)));
		double x = ((bin.getStartBoundary()) + (bin.getEndBoundary())) / 2.0;
		return new java.lang.Double(x);
	}

	public java.lang.Number getY(int series, int item) {
		java.util.List bins = getBins(series);
		org.jfree.data.statistics.HistogramBin bin = ((org.jfree.data.statistics.HistogramBin) (bins.get(item)));
		double total = getTotal(series);
		double binWidth = getBinWidth(series);
		if ((org.jfree.data.statistics.HistogramDataset.this.type) == (org.jfree.data.statistics.HistogramType.FREQUENCY)) {
			return new java.lang.Double(bin.getCount());
		}else
			if ((org.jfree.data.statistics.HistogramDataset.this.type) == (org.jfree.data.statistics.HistogramType.RELATIVE_FREQUENCY)) {
				return new java.lang.Double(((bin.getCount()) / total));
			}else
				if ((org.jfree.data.statistics.HistogramDataset.this.type) == (org.jfree.data.statistics.HistogramType.SCALE_AREA_TO_1)) {
					return new java.lang.Double(((bin.getCount()) / (binWidth * total)));
				}else {
					throw new java.lang.IllegalStateException();
				}
			
		
	}

	public java.lang.Number getStartX(int series, int item) {
		java.util.List bins = getBins(series);
		org.jfree.data.statistics.HistogramBin bin = ((org.jfree.data.statistics.HistogramBin) (bins.get(item)));
		return new java.lang.Double(bin.getStartBoundary());
	}

	public java.lang.Number getEndX(int series, int item) {
		java.util.List bins = getBins(series);
		org.jfree.data.statistics.HistogramBin bin = ((org.jfree.data.statistics.HistogramBin) (bins.get(item)));
		return new java.lang.Double(bin.getEndBoundary());
	}

	public java.lang.Number getStartY(int series, int item) {
		return getY(series, item);
	}

	public java.lang.Number getEndY(int series, int item) {
		return getY(series, item);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.statistics.HistogramDataset.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.statistics.HistogramDataset)) {
			return false;
		}
		org.jfree.data.statistics.HistogramDataset that = ((org.jfree.data.statistics.HistogramDataset) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.statistics.HistogramDataset.this.type, that.type))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.statistics.HistogramDataset.this.list, that.list))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.statistics.HistogramDataset clone = ((org.jfree.data.statistics.HistogramDataset) (super.clone()));
		int seriesCount = getSeriesCount();
		clone.list = new java.util.ArrayList(seriesCount);
		for (int i = 0; i < seriesCount; i++) {
			clone.list.add(new java.util.HashMap(((java.util.Map) (org.jfree.data.statistics.HistogramDataset.this.list.get(i)))));
		}
		return clone;
	}
}




package org.jfree.data.statistics;


public class SimpleHistogramDataset extends org.jfree.data.xy.AbstractIntervalXYDataset implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable , org.jfree.data.xy.IntervalXYDataset {
	private static final long serialVersionUID = 7997996479768018443L;

	private java.lang.Comparable key;

	private java.util.List bins;

	private boolean adjustForBinSize;

	public SimpleHistogramDataset(java.lang.Comparable key) {
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		org.jfree.data.statistics.SimpleHistogramDataset.this.key = key;
		org.jfree.data.statistics.SimpleHistogramDataset.this.bins = new java.util.ArrayList();
		org.jfree.data.statistics.SimpleHistogramDataset.this.adjustForBinSize = true;
	}

	public boolean getAdjustForBinSize() {
		return org.jfree.data.statistics.SimpleHistogramDataset.this.adjustForBinSize;
	}

	public void setAdjustForBinSize(boolean adjust) {
		org.jfree.data.statistics.SimpleHistogramDataset.this.adjustForBinSize = adjust;
		notifyListeners(new org.jfree.data.general.DatasetChangeEvent(org.jfree.data.statistics.SimpleHistogramDataset.this, org.jfree.data.statistics.SimpleHistogramDataset.this));
	}

	public int getSeriesCount() {
		return 1;
	}

	public java.lang.Comparable getSeriesKey(int series) {
		return org.jfree.data.statistics.SimpleHistogramDataset.this.key;
	}

	public org.jfree.data.DomainOrder getDomainOrder() {
		return org.jfree.data.DomainOrder.ASCENDING;
	}

	public int getItemCount(int series) {
		return org.jfree.data.statistics.SimpleHistogramDataset.this.bins.size();
	}

	public void addBin(org.jfree.data.statistics.SimpleHistogramBin bin) {
		java.util.Iterator iterator = org.jfree.data.statistics.SimpleHistogramDataset.this.bins.iterator();
		while (iterator.hasNext()) {
			org.jfree.data.statistics.SimpleHistogramBin existingBin = ((org.jfree.data.statistics.SimpleHistogramBin) (iterator.next()));
			if (bin.overlapsWith(existingBin)) {
				throw new java.lang.RuntimeException("Overlapping bin");
			}
		} 
		org.jfree.data.statistics.SimpleHistogramDataset.this.bins.add(bin);
		java.util.Collections.sort(org.jfree.data.statistics.SimpleHistogramDataset.this.bins);
	}

	public void addObservation(double value) {
		addObservation(value, true);
	}

	public void addObservation(double value, boolean notify) {
		boolean placed = false;
		java.util.Iterator iterator = org.jfree.data.statistics.SimpleHistogramDataset.this.bins.iterator();
		while ((iterator.hasNext()) && (!placed)) {
			org.jfree.data.statistics.SimpleHistogramBin bin = ((org.jfree.data.statistics.SimpleHistogramBin) (iterator.next()));
			if (bin.accepts(value)) {
				bin.setItemCount(((bin.getItemCount()) + 1));
				placed = true;
			}
		} 
		if (!placed) {
			throw new java.lang.RuntimeException("No bin.");
		}
		if (notify) {
			notifyListeners(new org.jfree.data.general.DatasetChangeEvent(org.jfree.data.statistics.SimpleHistogramDataset.this, org.jfree.data.statistics.SimpleHistogramDataset.this));
		}
	}

	public void addObservations(double[] values) {
		for (int i = 0; i < (values.length); i++) {
			addObservation(values[i], false);
		}
		notifyListeners(new org.jfree.data.general.DatasetChangeEvent(org.jfree.data.statistics.SimpleHistogramDataset.this, org.jfree.data.statistics.SimpleHistogramDataset.this));
	}

	public void clearObservations() {
		java.util.Iterator iterator = org.jfree.data.statistics.SimpleHistogramDataset.this.bins.iterator();
		while (iterator.hasNext()) {
			org.jfree.data.statistics.SimpleHistogramBin bin = ((org.jfree.data.statistics.SimpleHistogramBin) (iterator.next()));
			bin.setItemCount(0);
		} 
		notifyListeners(new org.jfree.data.general.DatasetChangeEvent(org.jfree.data.statistics.SimpleHistogramDataset.this, org.jfree.data.statistics.SimpleHistogramDataset.this));
	}

	public void removeAllBins() {
		org.jfree.data.statistics.SimpleHistogramDataset.this.bins = new java.util.ArrayList();
		notifyListeners(new org.jfree.data.general.DatasetChangeEvent(org.jfree.data.statistics.SimpleHistogramDataset.this, org.jfree.data.statistics.SimpleHistogramDataset.this));
	}

	public java.lang.Number getX(int series, int item) {
		return new java.lang.Double(getXValue(series, item));
	}

	public double getXValue(int series, int item) {
		org.jfree.data.statistics.SimpleHistogramBin bin = ((org.jfree.data.statistics.SimpleHistogramBin) (org.jfree.data.statistics.SimpleHistogramDataset.this.bins.get(item)));
		return ((bin.getLowerBound()) + (bin.getUpperBound())) / 2.0;
	}

	public java.lang.Number getY(int series, int item) {
		return new java.lang.Double(getYValue(series, item));
	}

	public double getYValue(int series, int item) {
		org.jfree.data.statistics.SimpleHistogramBin bin = ((org.jfree.data.statistics.SimpleHistogramBin) (org.jfree.data.statistics.SimpleHistogramDataset.this.bins.get(item)));
		if (org.jfree.data.statistics.SimpleHistogramDataset.this.adjustForBinSize) {
			return (bin.getItemCount()) / ((bin.getUpperBound()) - (bin.getLowerBound()));
		}else {
			return bin.getItemCount();
		}
	}

	public java.lang.Number getStartX(int series, int item) {
		return new java.lang.Double(getStartXValue(series, item));
	}

	public double getStartXValue(int series, int item) {
		org.jfree.data.statistics.SimpleHistogramBin bin = ((org.jfree.data.statistics.SimpleHistogramBin) (org.jfree.data.statistics.SimpleHistogramDataset.this.bins.get(item)));
		return bin.getLowerBound();
	}

	public java.lang.Number getEndX(int series, int item) {
		return new java.lang.Double(getEndXValue(series, item));
	}

	public double getEndXValue(int series, int item) {
		org.jfree.data.statistics.SimpleHistogramBin bin = ((org.jfree.data.statistics.SimpleHistogramBin) (org.jfree.data.statistics.SimpleHistogramDataset.this.bins.get(item)));
		return bin.getUpperBound();
	}

	public java.lang.Number getStartY(int series, int item) {
		return getY(series, item);
	}

	public double getStartYValue(int series, int item) {
		return getYValue(series, item);
	}

	public java.lang.Number getEndY(int series, int item) {
		return getY(series, item);
	}

	public double getEndYValue(int series, int item) {
		return getYValue(series, item);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.statistics.SimpleHistogramDataset.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.statistics.SimpleHistogramDataset)) {
			return false;
		}
		org.jfree.data.statistics.SimpleHistogramDataset that = ((org.jfree.data.statistics.SimpleHistogramDataset) (obj));
		if (!(org.jfree.data.statistics.SimpleHistogramDataset.this.key.equals(that.key))) {
			return false;
		}
		if ((org.jfree.data.statistics.SimpleHistogramDataset.this.adjustForBinSize) != (that.adjustForBinSize)) {
			return false;
		}
		if (!(org.jfree.data.statistics.SimpleHistogramDataset.this.bins.equals(that.bins))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.statistics.SimpleHistogramDataset clone = ((org.jfree.data.statistics.SimpleHistogramDataset) (super.clone()));
		clone.bins = ((java.util.List) (org.jfree.chart.util.ObjectUtilities.deepClone(org.jfree.data.statistics.SimpleHistogramDataset.this.bins)));
		return clone;
	}
}


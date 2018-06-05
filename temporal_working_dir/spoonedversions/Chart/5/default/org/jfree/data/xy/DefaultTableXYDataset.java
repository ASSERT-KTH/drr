

package org.jfree.data.xy;


public class DefaultTableXYDataset extends org.jfree.data.xy.AbstractIntervalXYDataset implements org.jfree.chart.util.PublicCloneable , org.jfree.data.DomainInfo , org.jfree.data.xy.IntervalXYDataset , org.jfree.data.xy.TableXYDataset {
	private java.util.List data = null;

	private java.util.HashSet xPoints = null;

	private boolean propagateEvents = true;

	private boolean autoPrune = false;

	private org.jfree.data.xy.IntervalXYDelegate intervalDelegate;

	public DefaultTableXYDataset() {
		this(false);
	}

	public DefaultTableXYDataset(boolean autoPrune) {
		org.jfree.data.xy.DefaultTableXYDataset.this.autoPrune = autoPrune;
		org.jfree.data.xy.DefaultTableXYDataset.this.data = new java.util.ArrayList();
		org.jfree.data.xy.DefaultTableXYDataset.this.xPoints = new java.util.HashSet();
		org.jfree.data.xy.DefaultTableXYDataset.this.intervalDelegate = new org.jfree.data.xy.IntervalXYDelegate(org.jfree.data.xy.DefaultTableXYDataset.this, false);
		addChangeListener(org.jfree.data.xy.DefaultTableXYDataset.this.intervalDelegate);
	}

	public boolean isAutoPrune() {
		return org.jfree.data.xy.DefaultTableXYDataset.this.autoPrune;
	}

	public void addSeries(org.jfree.data.xy.XYSeries series) {
		if (series == null) {
			throw new java.lang.IllegalArgumentException("Null 'series' argument.");
		}
		if (series.getAllowDuplicateXValues()) {
			throw new java.lang.IllegalArgumentException(("Cannot accept XYSeries that allow duplicate values. " + "Use XYSeries(seriesName, <sort>, false) constructor."));
		}
		updateXPoints(series);
		org.jfree.data.xy.DefaultTableXYDataset.this.data.add(series);
		series.addChangeListener(org.jfree.data.xy.DefaultTableXYDataset.this);
		fireDatasetChanged();
	}

	private void updateXPoints(org.jfree.data.xy.XYSeries series) {
		if (series == null) {
			throw new java.lang.IllegalArgumentException("Null 'series' not permitted.");
		}
		java.util.HashSet seriesXPoints = new java.util.HashSet();
		boolean savedState = org.jfree.data.xy.DefaultTableXYDataset.this.propagateEvents;
		org.jfree.data.xy.DefaultTableXYDataset.this.propagateEvents = false;
		for (int itemNo = 0; itemNo < (series.getItemCount()); itemNo++) {
			java.lang.Number xValue = series.getX(itemNo);
			seriesXPoints.add(xValue);
			if (!(org.jfree.data.xy.DefaultTableXYDataset.this.xPoints.contains(xValue))) {
				org.jfree.data.xy.DefaultTableXYDataset.this.xPoints.add(xValue);
				int seriesCount = org.jfree.data.xy.DefaultTableXYDataset.this.data.size();
				for (int seriesNo = 0; seriesNo < seriesCount; seriesNo++) {
					org.jfree.data.xy.XYSeries dataSeries = ((org.jfree.data.xy.XYSeries) (org.jfree.data.xy.DefaultTableXYDataset.this.data.get(seriesNo)));
					if (!(dataSeries.equals(series))) {
						dataSeries.add(xValue, null);
					}
				}
			}
		}
		java.util.Iterator iterator = org.jfree.data.xy.DefaultTableXYDataset.this.xPoints.iterator();
		while (iterator.hasNext()) {
			java.lang.Number xPoint = ((java.lang.Number) (iterator.next()));
			if (!(seriesXPoints.contains(xPoint))) {
				series.add(xPoint, null);
			}
		} 
		org.jfree.data.xy.DefaultTableXYDataset.this.propagateEvents = savedState;
	}

	public void updateXPoints() {
		org.jfree.data.xy.DefaultTableXYDataset.this.propagateEvents = false;
		for (int s = 0; s < (org.jfree.data.xy.DefaultTableXYDataset.this.data.size()); s++) {
			updateXPoints(((org.jfree.data.xy.XYSeries) (org.jfree.data.xy.DefaultTableXYDataset.this.data.get(s))));
		}
		if (org.jfree.data.xy.DefaultTableXYDataset.this.autoPrune) {
			prune();
		}
		org.jfree.data.xy.DefaultTableXYDataset.this.propagateEvents = true;
	}

	public int getSeriesCount() {
		return org.jfree.data.xy.DefaultTableXYDataset.this.data.size();
	}

	public int getItemCount() {
		if ((org.jfree.data.xy.DefaultTableXYDataset.this.xPoints) == null) {
			return 0;
		}else {
			return org.jfree.data.xy.DefaultTableXYDataset.this.xPoints.size();
		}
	}

	public org.jfree.data.xy.XYSeries getSeries(int series) {
		if ((series < 0) || (series >= (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException("Index outside valid range.");
		}
		return ((org.jfree.data.xy.XYSeries) (org.jfree.data.xy.DefaultTableXYDataset.this.data.get(series)));
	}

	public java.lang.Comparable getSeriesKey(int series) {
		return getSeries(series).getKey();
	}

	public int getItemCount(int series) {
		return getSeries(series).getItemCount();
	}

	public java.lang.Number getX(int series, int item) {
		org.jfree.data.xy.XYSeries s = ((org.jfree.data.xy.XYSeries) (org.jfree.data.xy.DefaultTableXYDataset.this.data.get(series)));
		org.jfree.data.xy.XYDataItem dataItem = s.getDataItem(item);
		return dataItem.getX();
	}

	public java.lang.Number getStartX(int series, int item) {
		return org.jfree.data.xy.DefaultTableXYDataset.this.intervalDelegate.getStartX(series, item);
	}

	public java.lang.Number getEndX(int series, int item) {
		return org.jfree.data.xy.DefaultTableXYDataset.this.intervalDelegate.getEndX(series, item);
	}

	public java.lang.Number getY(int series, int index) {
		org.jfree.data.xy.XYSeries ts = ((org.jfree.data.xy.XYSeries) (org.jfree.data.xy.DefaultTableXYDataset.this.data.get(series)));
		org.jfree.data.xy.XYDataItem dataItem = ts.getDataItem(index);
		return dataItem.getY();
	}

	public java.lang.Number getStartY(int series, int item) {
		return getY(series, item);
	}

	public java.lang.Number getEndY(int series, int item) {
		return getY(series, item);
	}

	public void removeAllSeries() {
		for (int i = 0; i < (org.jfree.data.xy.DefaultTableXYDataset.this.data.size()); i++) {
			org.jfree.data.xy.XYSeries series = ((org.jfree.data.xy.XYSeries) (org.jfree.data.xy.DefaultTableXYDataset.this.data.get(i)));
			series.removeChangeListener(org.jfree.data.xy.DefaultTableXYDataset.this);
		}
		org.jfree.data.xy.DefaultTableXYDataset.this.data.clear();
		org.jfree.data.xy.DefaultTableXYDataset.this.xPoints.clear();
		fireDatasetChanged();
	}

	public void removeSeries(org.jfree.data.xy.XYSeries series) {
		if (series == null) {
			throw new java.lang.IllegalArgumentException("Null 'series' argument.");
		}
		if (org.jfree.data.xy.DefaultTableXYDataset.this.data.contains(series)) {
			series.removeChangeListener(org.jfree.data.xy.DefaultTableXYDataset.this);
			org.jfree.data.xy.DefaultTableXYDataset.this.data.remove(series);
			if ((org.jfree.data.xy.DefaultTableXYDataset.this.data.size()) == 0) {
				org.jfree.data.xy.DefaultTableXYDataset.this.xPoints.clear();
			}
			fireDatasetChanged();
		}
	}

	public void removeSeries(int series) {
		if ((series < 0) || (series > (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException("Index outside valid range.");
		}
		org.jfree.data.xy.XYSeries s = ((org.jfree.data.xy.XYSeries) (org.jfree.data.xy.DefaultTableXYDataset.this.data.get(series)));
		s.removeChangeListener(org.jfree.data.xy.DefaultTableXYDataset.this);
		org.jfree.data.xy.DefaultTableXYDataset.this.data.remove(series);
		if ((org.jfree.data.xy.DefaultTableXYDataset.this.data.size()) == 0) {
			org.jfree.data.xy.DefaultTableXYDataset.this.xPoints.clear();
		}else
			if (org.jfree.data.xy.DefaultTableXYDataset.this.autoPrune) {
				prune();
			}
		
		fireDatasetChanged();
	}

	public void removeAllValuesForX(java.lang.Number x) {
		if (x == null) {
			throw new java.lang.IllegalArgumentException("Null 'x' argument.");
		}
		boolean savedState = org.jfree.data.xy.DefaultTableXYDataset.this.propagateEvents;
		org.jfree.data.xy.DefaultTableXYDataset.this.propagateEvents = false;
		for (int s = 0; s < (org.jfree.data.xy.DefaultTableXYDataset.this.data.size()); s++) {
			org.jfree.data.xy.XYSeries series = ((org.jfree.data.xy.XYSeries) (org.jfree.data.xy.DefaultTableXYDataset.this.data.get(s)));
			series.remove(x);
		}
		org.jfree.data.xy.DefaultTableXYDataset.this.propagateEvents = savedState;
		org.jfree.data.xy.DefaultTableXYDataset.this.xPoints.remove(x);
		fireDatasetChanged();
	}

	protected boolean canPrune(java.lang.Number x) {
		for (int s = 0; s < (org.jfree.data.xy.DefaultTableXYDataset.this.data.size()); s++) {
			org.jfree.data.xy.XYSeries series = ((org.jfree.data.xy.XYSeries) (org.jfree.data.xy.DefaultTableXYDataset.this.data.get(s)));
			if ((series.getY(series.indexOf(x))) != null) {
				return false;
			}
		}
		return true;
	}

	public void prune() {
		java.util.HashSet hs = ((java.util.HashSet) (org.jfree.data.xy.DefaultTableXYDataset.this.xPoints.clone()));
		java.util.Iterator iterator = hs.iterator();
		while (iterator.hasNext()) {
			java.lang.Number x = ((java.lang.Number) (iterator.next()));
			if (canPrune(x)) {
				removeAllValuesForX(x);
			}
		} 
	}

	public void seriesChanged(org.jfree.data.general.SeriesChangeEvent event) {
		if (org.jfree.data.xy.DefaultTableXYDataset.this.propagateEvents) {
			updateXPoints();
			fireDatasetChanged();
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.xy.DefaultTableXYDataset.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.xy.DefaultTableXYDataset)) {
			return false;
		}
		org.jfree.data.xy.DefaultTableXYDataset that = ((org.jfree.data.xy.DefaultTableXYDataset) (obj));
		if ((org.jfree.data.xy.DefaultTableXYDataset.this.autoPrune) != (that.autoPrune)) {
			return false;
		}
		if ((org.jfree.data.xy.DefaultTableXYDataset.this.propagateEvents) != (that.propagateEvents)) {
			return false;
		}
		if (!(org.jfree.data.xy.DefaultTableXYDataset.this.intervalDelegate.equals(that.intervalDelegate))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.xy.DefaultTableXYDataset.this.data, that.data))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result;
		result = ((org.jfree.data.xy.DefaultTableXYDataset.this.data) != null) ? org.jfree.data.xy.DefaultTableXYDataset.this.data.hashCode() : 0;
		result = (29 * result) + ((org.jfree.data.xy.DefaultTableXYDataset.this.xPoints) != null ? org.jfree.data.xy.DefaultTableXYDataset.this.xPoints.hashCode() : 0);
		result = (29 * result) + (org.jfree.data.xy.DefaultTableXYDataset.this.propagateEvents ? 1 : 0);
		result = (29 * result) + (org.jfree.data.xy.DefaultTableXYDataset.this.autoPrune ? 1 : 0);
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.xy.DefaultTableXYDataset clone = ((org.jfree.data.xy.DefaultTableXYDataset) (super.clone()));
		int seriesCount = org.jfree.data.xy.DefaultTableXYDataset.this.data.size();
		clone.data = new java.util.ArrayList(seriesCount);
		for (int i = 0; i < seriesCount; i++) {
			org.jfree.data.xy.XYSeries series = ((org.jfree.data.xy.XYSeries) (org.jfree.data.xy.DefaultTableXYDataset.this.data.get(i)));
			clone.data.add(series.clone());
		}
		clone.intervalDelegate = new org.jfree.data.xy.IntervalXYDelegate(clone);
		clone.intervalDelegate.setFixedIntervalWidth(getIntervalWidth());
		clone.intervalDelegate.setAutoWidth(isAutoWidth());
		clone.intervalDelegate.setIntervalPositionFactor(getIntervalPositionFactor());
		clone.updateXPoints();
		return clone;
	}

	public double getDomainLowerBound(boolean includeInterval) {
		return org.jfree.data.xy.DefaultTableXYDataset.this.intervalDelegate.getDomainLowerBound(includeInterval);
	}

	public double getDomainUpperBound(boolean includeInterval) {
		return org.jfree.data.xy.DefaultTableXYDataset.this.intervalDelegate.getDomainUpperBound(includeInterval);
	}

	public org.jfree.data.Range getDomainBounds(boolean includeInterval) {
		if (includeInterval) {
			return org.jfree.data.xy.DefaultTableXYDataset.this.intervalDelegate.getDomainBounds(includeInterval);
		}else {
			return org.jfree.data.general.DatasetUtilities.iterateDomainBounds(org.jfree.data.xy.DefaultTableXYDataset.this, includeInterval);
		}
	}

	public double getIntervalPositionFactor() {
		return org.jfree.data.xy.DefaultTableXYDataset.this.intervalDelegate.getIntervalPositionFactor();
	}

	public void setIntervalPositionFactor(double d) {
		org.jfree.data.xy.DefaultTableXYDataset.this.intervalDelegate.setIntervalPositionFactor(d);
		fireDatasetChanged();
	}

	public double getIntervalWidth() {
		return org.jfree.data.xy.DefaultTableXYDataset.this.intervalDelegate.getIntervalWidth();
	}

	public void setIntervalWidth(double d) {
		org.jfree.data.xy.DefaultTableXYDataset.this.intervalDelegate.setFixedIntervalWidth(d);
		fireDatasetChanged();
	}

	public boolean isAutoWidth() {
		return org.jfree.data.xy.DefaultTableXYDataset.this.intervalDelegate.isAutoWidth();
	}

	public void setAutoWidth(boolean b) {
		org.jfree.data.xy.DefaultTableXYDataset.this.intervalDelegate.setAutoWidth(b);
		fireDatasetChanged();
	}
}


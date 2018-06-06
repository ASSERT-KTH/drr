

package org.jfree.data.gantt;


public class XYTaskDataset extends org.jfree.data.xy.AbstractXYDataset implements org.jfree.data.event.DatasetChangeListener , org.jfree.data.xy.IntervalXYDataset {
	private org.jfree.data.gantt.TaskSeriesCollection underlying;

	private double seriesWidth;

	private boolean transposed;

	public XYTaskDataset(org.jfree.data.gantt.TaskSeriesCollection tasks) {
		if (tasks == null) {
			throw new java.lang.IllegalArgumentException("Null 'tasks' argument.");
		}
		org.jfree.data.gantt.XYTaskDataset.this.underlying = tasks;
		org.jfree.data.gantt.XYTaskDataset.this.seriesWidth = 0.8;
		org.jfree.data.gantt.XYTaskDataset.this.underlying.addChangeListener(org.jfree.data.gantt.XYTaskDataset.this);
	}

	public org.jfree.data.gantt.TaskSeriesCollection getTasks() {
		return org.jfree.data.gantt.XYTaskDataset.this.underlying;
	}

	public double getSeriesWidth() {
		return org.jfree.data.gantt.XYTaskDataset.this.seriesWidth;
	}

	public void setSeriesWidth(double w) {
		if (w <= 0.0) {
			throw new java.lang.IllegalArgumentException("Requires 'w' > 0.0.");
		}
		org.jfree.data.gantt.XYTaskDataset.this.seriesWidth = w;
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public boolean isTransposed() {
		return org.jfree.data.gantt.XYTaskDataset.this.transposed;
	}

	public void setTransposed(boolean transposed) {
		org.jfree.data.gantt.XYTaskDataset.this.transposed = transposed;
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public int getSeriesCount() {
		return org.jfree.data.gantt.XYTaskDataset.this.underlying.getSeriesCount();
	}

	public java.lang.Comparable getSeriesKey(int series) {
		return org.jfree.data.gantt.XYTaskDataset.this.underlying.getSeriesKey(series);
	}

	public int getItemCount(int series) {
		return org.jfree.data.gantt.XYTaskDataset.this.underlying.getSeries(series).getItemCount();
	}

	public double getXValue(int series, int item) {
		if (!(org.jfree.data.gantt.XYTaskDataset.this.transposed)) {
			return getSeriesValue(series);
		}else {
			return getItemValue(series, item);
		}
	}

	public double getStartXValue(int series, int item) {
		if (!(org.jfree.data.gantt.XYTaskDataset.this.transposed)) {
			return getSeriesStartValue(series);
		}else {
			return getItemStartValue(series, item);
		}
	}

	public double getEndXValue(int series, int item) {
		if (!(org.jfree.data.gantt.XYTaskDataset.this.transposed)) {
			return getSeriesEndValue(series);
		}else {
			return getItemEndValue(series, item);
		}
	}

	public java.lang.Number getX(int series, int item) {
		return new java.lang.Double(getXValue(series, item));
	}

	public java.lang.Number getStartX(int series, int item) {
		return new java.lang.Double(getStartXValue(series, item));
	}

	public java.lang.Number getEndX(int series, int item) {
		return new java.lang.Double(getEndXValue(series, item));
	}

	public double getYValue(int series, int item) {
		if (!(org.jfree.data.gantt.XYTaskDataset.this.transposed)) {
			return getItemValue(series, item);
		}else {
			return getSeriesValue(series);
		}
	}

	public double getStartYValue(int series, int item) {
		if (!(org.jfree.data.gantt.XYTaskDataset.this.transposed)) {
			return getItemStartValue(series, item);
		}else {
			return getSeriesStartValue(series);
		}
	}

	public double getEndYValue(int series, int item) {
		if (!(org.jfree.data.gantt.XYTaskDataset.this.transposed)) {
			return getItemEndValue(series, item);
		}else {
			return getSeriesEndValue(series);
		}
	}

	public java.lang.Number getY(int series, int item) {
		return new java.lang.Double(getYValue(series, item));
	}

	public java.lang.Number getStartY(int series, int item) {
		return new java.lang.Double(getStartYValue(series, item));
	}

	public java.lang.Number getEndY(int series, int item) {
		return new java.lang.Double(getEndYValue(series, item));
	}

	private double getSeriesValue(int series) {
		return series;
	}

	private double getSeriesStartValue(int series) {
		return series - ((org.jfree.data.gantt.XYTaskDataset.this.seriesWidth) / 2.0);
	}

	private double getSeriesEndValue(int series) {
		return series + ((org.jfree.data.gantt.XYTaskDataset.this.seriesWidth) / 2.0);
	}

	private double getItemValue(int series, int item) {
		org.jfree.data.gantt.TaskSeries s = org.jfree.data.gantt.XYTaskDataset.this.underlying.getSeries(series);
		org.jfree.data.gantt.Task t = s.get(item);
		org.jfree.data.time.TimePeriod duration = t.getDuration();
		java.util.Date start = duration.getStart();
		java.util.Date end = duration.getEnd();
		return ((start.getTime()) + (end.getTime())) / 2.0;
	}

	private double getItemStartValue(int series, int item) {
		org.jfree.data.gantt.TaskSeries s = org.jfree.data.gantt.XYTaskDataset.this.underlying.getSeries(series);
		org.jfree.data.gantt.Task t = s.get(item);
		org.jfree.data.time.TimePeriod duration = t.getDuration();
		java.util.Date start = duration.getStart();
		return start.getTime();
	}

	private double getItemEndValue(int series, int item) {
		org.jfree.data.gantt.TaskSeries s = org.jfree.data.gantt.XYTaskDataset.this.underlying.getSeries(series);
		org.jfree.data.gantt.Task t = s.get(item);
		org.jfree.data.time.TimePeriod duration = t.getDuration();
		java.util.Date end = duration.getEnd();
		return end.getTime();
	}

	public void datasetChanged(org.jfree.data.event.DatasetChangeEvent event) {
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.gantt.XYTaskDataset.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.gantt.XYTaskDataset)) {
			return false;
		}
		org.jfree.data.gantt.XYTaskDataset that = ((org.jfree.data.gantt.XYTaskDataset) (obj));
		if ((org.jfree.data.gantt.XYTaskDataset.this.seriesWidth) != (that.seriesWidth)) {
			return false;
		}
		if ((org.jfree.data.gantt.XYTaskDataset.this.transposed) != (that.transposed)) {
			return false;
		}
		if (!(org.jfree.data.gantt.XYTaskDataset.this.underlying.equals(that.underlying))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.gantt.XYTaskDataset clone = ((org.jfree.data.gantt.XYTaskDataset) (super.clone()));
		clone.underlying = ((org.jfree.data.gantt.TaskSeriesCollection) (org.jfree.data.gantt.XYTaskDataset.this.underlying.clone()));
		return clone;
	}
}




package org.jfree.data.gantt;


public class TaskSeriesCollection extends org.jfree.data.general.AbstractSeriesDataset implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable , org.jfree.data.gantt.GanttCategoryDataset {
	private static final long serialVersionUID = -2065799050738449903L;

	private java.util.List keys;

	private java.util.List data;

	public TaskSeriesCollection() {
		org.jfree.data.gantt.TaskSeriesCollection.this.keys = new java.util.ArrayList();
		org.jfree.data.gantt.TaskSeriesCollection.this.data = new java.util.ArrayList();
	}

	public org.jfree.data.gantt.TaskSeries getSeries(java.lang.Comparable key) {
		if (key == null) {
			throw new java.lang.NullPointerException("Null 'key' argument.");
		}
		org.jfree.data.gantt.TaskSeries result = null;
		int index = getRowIndex(key);
		if (index >= 0) {
			result = getSeries(index);
		}
		return result;
	}

	public org.jfree.data.gantt.TaskSeries getSeries(int series) {
		if ((series < 0) || (series >= (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException("Series index out of bounds");
		}
		return ((org.jfree.data.gantt.TaskSeries) (org.jfree.data.gantt.TaskSeriesCollection.this.data.get(series)));
	}

	public int getSeriesCount() {
		return getRowCount();
	}

	public java.lang.Comparable getSeriesKey(int series) {
		org.jfree.data.gantt.TaskSeries ts = ((org.jfree.data.gantt.TaskSeries) (org.jfree.data.gantt.TaskSeriesCollection.this.data.get(series)));
		return ts.getKey();
	}

	public int getRowCount() {
		return org.jfree.data.gantt.TaskSeriesCollection.this.data.size();
	}

	public java.util.List getRowKeys() {
		return org.jfree.data.gantt.TaskSeriesCollection.this.data;
	}

	public int getColumnCount() {
		return org.jfree.data.gantt.TaskSeriesCollection.this.keys.size();
	}

	public java.util.List getColumnKeys() {
		return org.jfree.data.gantt.TaskSeriesCollection.this.keys;
	}

	public java.lang.Comparable getColumnKey(int index) {
		return ((java.lang.Comparable) (org.jfree.data.gantt.TaskSeriesCollection.this.keys.get(index)));
	}

	public int getColumnIndex(java.lang.Comparable columnKey) {
		return org.jfree.data.gantt.TaskSeriesCollection.this.keys.indexOf(columnKey);
	}

	public int getRowIndex(java.lang.Comparable rowKey) {
		int result = -1;
		int count = org.jfree.data.gantt.TaskSeriesCollection.this.data.size();
		for (int i = 0; i < count; i++) {
			org.jfree.data.gantt.TaskSeries s = ((org.jfree.data.gantt.TaskSeries) (org.jfree.data.gantt.TaskSeriesCollection.this.data.get(i)));
			if (s.getKey().equals(rowKey)) {
				result = i;
				break;
			}
		}
		return result;
	}

	public java.lang.Comparable getRowKey(int index) {
		org.jfree.data.gantt.TaskSeries series = ((org.jfree.data.gantt.TaskSeries) (org.jfree.data.gantt.TaskSeriesCollection.this.data.get(index)));
		return series.getKey();
	}

	public void add(org.jfree.data.gantt.TaskSeries series) {
		if (series == null) {
			throw new java.lang.IllegalArgumentException("Null 'series' argument.");
		}
		org.jfree.data.gantt.TaskSeriesCollection.this.data.add(series);
		series.addChangeListener(org.jfree.data.gantt.TaskSeriesCollection.this);
		java.util.Iterator iterator = series.getTasks().iterator();
		while (iterator.hasNext()) {
			org.jfree.data.gantt.Task task = ((org.jfree.data.gantt.Task) (iterator.next()));
			java.lang.String key = task.getDescription();
			int index = org.jfree.data.gantt.TaskSeriesCollection.this.keys.indexOf(key);
			if (index < 0) {
				org.jfree.data.gantt.TaskSeriesCollection.this.keys.add(key);
			}
		} 
		fireDatasetChanged();
	}

	public void remove(org.jfree.data.gantt.TaskSeries series) {
		if (series == null) {
			throw new java.lang.IllegalArgumentException("Null 'series' argument.");
		}
		if (org.jfree.data.gantt.TaskSeriesCollection.this.data.contains(series)) {
			series.removeChangeListener(org.jfree.data.gantt.TaskSeriesCollection.this);
			org.jfree.data.gantt.TaskSeriesCollection.this.data.remove(series);
			fireDatasetChanged();
		}
	}

	public void remove(int series) {
		if ((series < 0) || (series >= (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException("TaskSeriesCollection.remove(): index outside valid range.");
		}
		org.jfree.data.gantt.TaskSeries ts = ((org.jfree.data.gantt.TaskSeries) (org.jfree.data.gantt.TaskSeriesCollection.this.data.get(series)));
		ts.removeChangeListener(org.jfree.data.gantt.TaskSeriesCollection.this);
		org.jfree.data.gantt.TaskSeriesCollection.this.data.remove(series);
		fireDatasetChanged();
	}

	public void removeAll() {
		java.util.Iterator iterator = org.jfree.data.gantt.TaskSeriesCollection.this.data.iterator();
		while (iterator.hasNext()) {
			org.jfree.data.gantt.TaskSeries series = ((org.jfree.data.gantt.TaskSeries) (iterator.next()));
			series.removeChangeListener(org.jfree.data.gantt.TaskSeriesCollection.this);
		} 
		org.jfree.data.gantt.TaskSeriesCollection.this.data.clear();
		fireDatasetChanged();
	}

	public java.lang.Number getValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		return getStartValue(rowKey, columnKey);
	}

	public java.lang.Number getValue(int row, int column) {
		return getStartValue(row, column);
	}

	public java.lang.Number getStartValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		java.lang.Number result = null;
		int row = getRowIndex(rowKey);
		org.jfree.data.gantt.TaskSeries series = ((org.jfree.data.gantt.TaskSeries) (org.jfree.data.gantt.TaskSeriesCollection.this.data.get(row)));
		org.jfree.data.gantt.Task task = series.get(columnKey.toString());
		if (task != null) {
			org.jfree.data.time.TimePeriod duration = task.getDuration();
			if (duration != null) {
				result = new java.lang.Long(duration.getStart().getTime());
			}
		}
		return result;
	}

	public java.lang.Number getStartValue(int row, int column) {
		java.lang.Comparable rowKey = getRowKey(row);
		java.lang.Comparable columnKey = getColumnKey(column);
		return getStartValue(rowKey, columnKey);
	}

	public java.lang.Number getEndValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		java.lang.Number result = null;
		int row = getRowIndex(rowKey);
		org.jfree.data.gantt.TaskSeries series = ((org.jfree.data.gantt.TaskSeries) (org.jfree.data.gantt.TaskSeriesCollection.this.data.get(row)));
		org.jfree.data.gantt.Task task = series.get(columnKey.toString());
		if (task != null) {
			org.jfree.data.time.TimePeriod duration = task.getDuration();
			if (duration != null) {
				result = new java.lang.Long(duration.getEnd().getTime());
			}
		}
		return result;
	}

	public java.lang.Number getEndValue(int row, int column) {
		java.lang.Comparable rowKey = getRowKey(row);
		java.lang.Comparable columnKey = getColumnKey(column);
		return getEndValue(rowKey, columnKey);
	}

	public java.lang.Number getPercentComplete(int row, int column) {
		java.lang.Comparable rowKey = getRowKey(row);
		java.lang.Comparable columnKey = getColumnKey(column);
		return getPercentComplete(rowKey, columnKey);
	}

	public java.lang.Number getPercentComplete(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		java.lang.Number result = null;
		int row = getRowIndex(rowKey);
		org.jfree.data.gantt.TaskSeries series = ((org.jfree.data.gantt.TaskSeries) (org.jfree.data.gantt.TaskSeriesCollection.this.data.get(row)));
		org.jfree.data.gantt.Task task = series.get(columnKey.toString());
		if (task != null) {
			result = task.getPercentComplete();
		}
		return result;
	}

	public int getSubIntervalCount(int row, int column) {
		java.lang.Comparable rowKey = getRowKey(row);
		java.lang.Comparable columnKey = getColumnKey(column);
		return getSubIntervalCount(rowKey, columnKey);
	}

	public int getSubIntervalCount(java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		int result = 0;
		int row = getRowIndex(rowKey);
		org.jfree.data.gantt.TaskSeries series = ((org.jfree.data.gantt.TaskSeries) (org.jfree.data.gantt.TaskSeriesCollection.this.data.get(row)));
		org.jfree.data.gantt.Task task = series.get(columnKey.toString());
		if (task != null) {
			result = task.getSubtaskCount();
		}
		return result;
	}

	public java.lang.Number getStartValue(int row, int column, int subinterval) {
		java.lang.Comparable rowKey = getRowKey(row);
		java.lang.Comparable columnKey = getColumnKey(column);
		return getStartValue(rowKey, columnKey, subinterval);
	}

	public java.lang.Number getStartValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey, int subinterval) {
		java.lang.Number result = null;
		int row = getRowIndex(rowKey);
		org.jfree.data.gantt.TaskSeries series = ((org.jfree.data.gantt.TaskSeries) (org.jfree.data.gantt.TaskSeriesCollection.this.data.get(row)));
		org.jfree.data.gantt.Task task = series.get(columnKey.toString());
		if (task != null) {
			org.jfree.data.gantt.Task sub = task.getSubtask(subinterval);
			if (sub != null) {
				org.jfree.data.time.TimePeriod duration = sub.getDuration();
				result = new java.lang.Long(duration.getStart().getTime());
			}
		}
		return result;
	}

	public java.lang.Number getEndValue(int row, int column, int subinterval) {
		java.lang.Comparable rowKey = getRowKey(row);
		java.lang.Comparable columnKey = getColumnKey(column);
		return getEndValue(rowKey, columnKey, subinterval);
	}

	public java.lang.Number getEndValue(java.lang.Comparable rowKey, java.lang.Comparable columnKey, int subinterval) {
		java.lang.Number result = null;
		int row = getRowIndex(rowKey);
		org.jfree.data.gantt.TaskSeries series = ((org.jfree.data.gantt.TaskSeries) (org.jfree.data.gantt.TaskSeriesCollection.this.data.get(row)));
		org.jfree.data.gantt.Task task = series.get(columnKey.toString());
		if (task != null) {
			org.jfree.data.gantt.Task sub = task.getSubtask(subinterval);
			if (sub != null) {
				org.jfree.data.time.TimePeriod duration = sub.getDuration();
				result = new java.lang.Long(duration.getEnd().getTime());
			}
		}
		return result;
	}

	public java.lang.Number getPercentComplete(int row, int column, int subinterval) {
		java.lang.Comparable rowKey = getRowKey(row);
		java.lang.Comparable columnKey = getColumnKey(column);
		return getPercentComplete(rowKey, columnKey, subinterval);
	}

	public java.lang.Number getPercentComplete(java.lang.Comparable rowKey, java.lang.Comparable columnKey, int subinterval) {
		java.lang.Number result = null;
		int row = getRowIndex(rowKey);
		org.jfree.data.gantt.TaskSeries series = ((org.jfree.data.gantt.TaskSeries) (org.jfree.data.gantt.TaskSeriesCollection.this.data.get(row)));
		org.jfree.data.gantt.Task task = series.get(columnKey.toString());
		if (task != null) {
			org.jfree.data.gantt.Task sub = task.getSubtask(subinterval);
			if (sub != null) {
				result = sub.getPercentComplete();
			}
		}
		return result;
	}

	public void seriesChanged(org.jfree.data.general.SeriesChangeEvent event) {
		refreshKeys();
		fireDatasetChanged();
	}

	private void refreshKeys() {
		org.jfree.data.gantt.TaskSeriesCollection.this.keys.clear();
		for (int i = 0; i < (getSeriesCount()); i++) {
			org.jfree.data.gantt.TaskSeries series = ((org.jfree.data.gantt.TaskSeries) (org.jfree.data.gantt.TaskSeriesCollection.this.data.get(i)));
			java.util.Iterator iterator = series.getTasks().iterator();
			while (iterator.hasNext()) {
				org.jfree.data.gantt.Task task = ((org.jfree.data.gantt.Task) (iterator.next()));
				java.lang.String key = task.getDescription();
				int index = org.jfree.data.gantt.TaskSeriesCollection.this.keys.indexOf(key);
				if (index < 0) {
					org.jfree.data.gantt.TaskSeriesCollection.this.keys.add(key);
				}
			} 
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.gantt.TaskSeriesCollection.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.gantt.TaskSeriesCollection)) {
			return false;
		}
		org.jfree.data.gantt.TaskSeriesCollection that = ((org.jfree.data.gantt.TaskSeriesCollection) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.gantt.TaskSeriesCollection.this.data, that.data))) {
			return false;
		}
		return true;
	}
}


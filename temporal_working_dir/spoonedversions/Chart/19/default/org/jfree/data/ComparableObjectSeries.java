

package org.jfree.data;


public class ComparableObjectSeries extends org.jfree.data.general.Series implements java.io.Serializable , java.lang.Cloneable {
	protected java.util.List data;

	private int maximumItemCount = java.lang.Integer.MAX_VALUE;

	private boolean autoSort;

	private boolean allowDuplicateXValues;

	public ComparableObjectSeries(java.lang.Comparable key) {
		this(key, true, true);
	}

	public ComparableObjectSeries(java.lang.Comparable key, boolean autoSort, boolean allowDuplicateXValues) {
		super(key);
		org.jfree.data.ComparableObjectSeries.this.data = new java.util.ArrayList();
		org.jfree.data.ComparableObjectSeries.this.autoSort = autoSort;
		org.jfree.data.ComparableObjectSeries.this.allowDuplicateXValues = allowDuplicateXValues;
	}

	public boolean getAutoSort() {
		return org.jfree.data.ComparableObjectSeries.this.autoSort;
	}

	public boolean getAllowDuplicateXValues() {
		return org.jfree.data.ComparableObjectSeries.this.allowDuplicateXValues;
	}

	public int getItemCount() {
		return org.jfree.data.ComparableObjectSeries.this.data.size();
	}

	public int getMaximumItemCount() {
		return org.jfree.data.ComparableObjectSeries.this.maximumItemCount;
	}

	public void setMaximumItemCount(int maximum) {
		org.jfree.data.ComparableObjectSeries.this.maximumItemCount = maximum;
		boolean dataRemoved = false;
		while ((org.jfree.data.ComparableObjectSeries.this.data.size()) > maximum) {
			org.jfree.data.ComparableObjectSeries.this.data.remove(0);
			dataRemoved = true;
		} 
		if (dataRemoved) {
			fireSeriesChanged();
		}
	}

	protected void add(java.lang.Comparable x, java.lang.Object y) {
		add(x, y, true);
	}

	protected void add(java.lang.Comparable x, java.lang.Object y, boolean notify) {
		org.jfree.data.ComparableObjectItem item = new org.jfree.data.ComparableObjectItem(x, y);
		add(item, notify);
	}

	protected void add(org.jfree.data.ComparableObjectItem item, boolean notify) {
		if (item == null) {
			throw new java.lang.IllegalArgumentException("Null 'item' argument.");
		}
		if (org.jfree.data.ComparableObjectSeries.this.autoSort) {
			int index = java.util.Collections.binarySearch(org.jfree.data.ComparableObjectSeries.this.data, item);
			if (index < 0) {
				org.jfree.data.ComparableObjectSeries.this.data.add(((-index) - 1), item);
			}else {
				if (org.jfree.data.ComparableObjectSeries.this.allowDuplicateXValues) {
					int size = org.jfree.data.ComparableObjectSeries.this.data.size();
					while ((index < size) && ((item.compareTo(org.jfree.data.ComparableObjectSeries.this.data.get(index))) == 0)) {
						index++;
					} 
					if (index < (org.jfree.data.ComparableObjectSeries.this.data.size())) {
						org.jfree.data.ComparableObjectSeries.this.data.add(index, item);
					}else {
						org.jfree.data.ComparableObjectSeries.this.data.add(item);
					}
				}else {
					throw new org.jfree.data.general.SeriesException("X-value already exists.");
				}
			}
		}else {
			if (!(org.jfree.data.ComparableObjectSeries.this.allowDuplicateXValues)) {
				int index = indexOf(item.getComparable());
				if (index >= 0) {
					throw new org.jfree.data.general.SeriesException("X-value already exists.");
				}
			}
			org.jfree.data.ComparableObjectSeries.this.data.add(item);
		}
		if ((getItemCount()) > (org.jfree.data.ComparableObjectSeries.this.maximumItemCount)) {
			org.jfree.data.ComparableObjectSeries.this.data.remove(0);
		}
		if (notify) {
			fireSeriesChanged();
		}
	}

	public int indexOf(java.lang.Comparable x) {
		if (org.jfree.data.ComparableObjectSeries.this.autoSort) {
			return java.util.Collections.binarySearch(org.jfree.data.ComparableObjectSeries.this.data, new org.jfree.data.ComparableObjectItem(x, null));
		}else {
			for (int i = 0; i < (org.jfree.data.ComparableObjectSeries.this.data.size()); i++) {
				org.jfree.data.ComparableObjectItem item = ((org.jfree.data.ComparableObjectItem) (org.jfree.data.ComparableObjectSeries.this.data.get(i)));
				if (item.getComparable().equals(x)) {
					return i;
				}
			}
			return -1;
		}
	}

	protected void update(java.lang.Comparable x, java.lang.Object y) {
		int index = indexOf(x);
		if (index < 0) {
			throw new org.jfree.data.general.SeriesException(("No observation for x = " + x));
		}else {
			org.jfree.data.ComparableObjectItem item = getDataItem(index);
			item.setObject(y);
			fireSeriesChanged();
		}
	}

	protected void updateByIndex(int index, java.lang.Object y) {
		org.jfree.data.ComparableObjectItem item = getDataItem(index);
		item.setObject(y);
		fireSeriesChanged();
	}

	protected org.jfree.data.ComparableObjectItem getDataItem(int index) {
		return ((org.jfree.data.ComparableObjectItem) (org.jfree.data.ComparableObjectSeries.this.data.get(index)));
	}

	protected void delete(int start, int end) {
		for (int i = start; i <= end; i++) {
			org.jfree.data.ComparableObjectSeries.this.data.remove(start);
		}
		fireSeriesChanged();
	}

	protected void clear() {
		if ((org.jfree.data.ComparableObjectSeries.this.data.size()) > 0) {
			org.jfree.data.ComparableObjectSeries.this.data.clear();
			fireSeriesChanged();
		}
	}

	protected org.jfree.data.ComparableObjectItem remove(int index) {
		org.jfree.data.ComparableObjectItem result = ((org.jfree.data.ComparableObjectItem) (org.jfree.data.ComparableObjectSeries.this.data.remove(index)));
		fireSeriesChanged();
		return result;
	}

	public org.jfree.data.ComparableObjectItem remove(java.lang.Comparable x) {
		return remove(indexOf(x));
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.ComparableObjectSeries.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.ComparableObjectSeries)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.data.ComparableObjectSeries that = ((org.jfree.data.ComparableObjectSeries) (obj));
		if ((org.jfree.data.ComparableObjectSeries.this.maximumItemCount) != (that.maximumItemCount)) {
			return false;
		}
		if ((org.jfree.data.ComparableObjectSeries.this.autoSort) != (that.autoSort)) {
			return false;
		}
		if ((org.jfree.data.ComparableObjectSeries.this.allowDuplicateXValues) != (that.allowDuplicateXValues)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.ComparableObjectSeries.this.data, that.data))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = super.hashCode();
		result = (29 * result) + ((org.jfree.data.ComparableObjectSeries.this.data) != null ? org.jfree.data.ComparableObjectSeries.this.data.hashCode() : 0);
		result = (29 * result) + (org.jfree.data.ComparableObjectSeries.this.maximumItemCount);
		result = (29 * result) + (org.jfree.data.ComparableObjectSeries.this.autoSort ? 1 : 0);
		result = (29 * result) + (org.jfree.data.ComparableObjectSeries.this.allowDuplicateXValues ? 1 : 0);
		return result;
	}
}




package org.jfree.data.xy;


public class XYSeries extends org.jfree.data.general.Series implements java.io.Serializable , java.lang.Cloneable {
	static final long serialVersionUID = -5908509288197150436L;

	protected java.util.List data;

	private int maximumItemCount = java.lang.Integer.MAX_VALUE;

	private boolean autoSort;

	private boolean allowDuplicateXValues;

	private double minX;

	private double maxX;

	private double minY;

	private double maxY;

	public XYSeries(java.lang.Comparable key) {
		this(key, true, true);
	}

	public XYSeries(java.lang.Comparable key, boolean autoSort) {
		this(key, autoSort, true);
	}

	public XYSeries(java.lang.Comparable key, boolean autoSort, boolean allowDuplicateXValues) {
		super(key);
		org.jfree.data.xy.XYSeries.this.data = new java.util.ArrayList();
		org.jfree.data.xy.XYSeries.this.autoSort = autoSort;
		org.jfree.data.xy.XYSeries.this.allowDuplicateXValues = allowDuplicateXValues;
		org.jfree.data.xy.XYSeries.this.minX = java.lang.Double.NaN;
		org.jfree.data.xy.XYSeries.this.maxX = java.lang.Double.NaN;
		org.jfree.data.xy.XYSeries.this.minY = java.lang.Double.NaN;
		org.jfree.data.xy.XYSeries.this.maxY = java.lang.Double.NaN;
	}

	public double getMinX() {
		return org.jfree.data.xy.XYSeries.this.minX;
	}

	public double getMaxX() {
		return org.jfree.data.xy.XYSeries.this.maxX;
	}

	public double getMinY() {
		return org.jfree.data.xy.XYSeries.this.minY;
	}

	public double getMaxY() {
		return org.jfree.data.xy.XYSeries.this.maxY;
	}

	private void updateBoundsForAddedItem(org.jfree.data.xy.XYDataItem item) {
		double x = item.getXValue();
		org.jfree.data.xy.XYSeries.this.minX = minIgnoreNaN(org.jfree.data.xy.XYSeries.this.minX, x);
		org.jfree.data.xy.XYSeries.this.maxX = maxIgnoreNaN(org.jfree.data.xy.XYSeries.this.maxX, x);
		if ((item.getY()) != null) {
			double y = item.getYValue();
			org.jfree.data.xy.XYSeries.this.minY = minIgnoreNaN(org.jfree.data.xy.XYSeries.this.minY, y);
			org.jfree.data.xy.XYSeries.this.maxY = maxIgnoreNaN(org.jfree.data.xy.XYSeries.this.maxY, y);
		}
	}

	private void updateBoundsForRemovedItem(org.jfree.data.xy.XYDataItem item) {
		boolean itemContributesToXBounds = false;
		boolean itemContributesToYBounds = false;
		double x = item.getXValue();
		if (!(java.lang.Double.isNaN(x))) {
			if ((x <= (org.jfree.data.xy.XYSeries.this.minX)) || (x >= (org.jfree.data.xy.XYSeries.this.maxX))) {
				itemContributesToXBounds = true;
			}
		}
		if ((item.getY()) != null) {
			double y = item.getYValue();
			if (!(java.lang.Double.isNaN(y))) {
				if ((y <= (org.jfree.data.xy.XYSeries.this.minY)) || (y >= (org.jfree.data.xy.XYSeries.this.maxY))) {
					itemContributesToYBounds = true;
				}
			}
		}
		if (itemContributesToYBounds) {
			findBoundsByIteration();
		}else
			if (itemContributesToXBounds) {
				if (getAutoSort()) {
					org.jfree.data.xy.XYSeries.this.minX = getX(0).doubleValue();
					org.jfree.data.xy.XYSeries.this.maxX = getX(((getItemCount()) - 1)).doubleValue();
				}else {
					findBoundsByIteration();
				}
			}
		
	}

	private void findBoundsByIteration() {
		org.jfree.data.xy.XYSeries.this.minX = java.lang.Double.NaN;
		org.jfree.data.xy.XYSeries.this.maxX = java.lang.Double.NaN;
		org.jfree.data.xy.XYSeries.this.minY = java.lang.Double.NaN;
		org.jfree.data.xy.XYSeries.this.maxY = java.lang.Double.NaN;
		java.util.Iterator iterator = org.jfree.data.xy.XYSeries.this.data.iterator();
		while (iterator.hasNext()) {
			org.jfree.data.xy.XYDataItem item = ((org.jfree.data.xy.XYDataItem) (iterator.next()));
			updateBoundsForAddedItem(item);
		} 
	}

	public boolean getAutoSort() {
		return org.jfree.data.xy.XYSeries.this.autoSort;
	}

	public boolean getAllowDuplicateXValues() {
		return org.jfree.data.xy.XYSeries.this.allowDuplicateXValues;
	}

	public int getItemCount() {
		return org.jfree.data.xy.XYSeries.this.data.size();
	}

	public java.util.List getItems() {
		return java.util.Collections.unmodifiableList(org.jfree.data.xy.XYSeries.this.data);
	}

	public int getMaximumItemCount() {
		return org.jfree.data.xy.XYSeries.this.maximumItemCount;
	}

	public void setMaximumItemCount(int maximum) {
		org.jfree.data.xy.XYSeries.this.maximumItemCount = maximum;
		int remove = (org.jfree.data.xy.XYSeries.this.data.size()) - maximum;
		if (remove > 0) {
			org.jfree.data.xy.XYSeries.this.data.subList(0, remove).clear();
			findBoundsByIteration();
			fireSeriesChanged();
		}
	}

	public void add(org.jfree.data.xy.XYDataItem item) {
		add(item, true);
	}

	public void add(double x, double y) {
		add(new java.lang.Double(x), new java.lang.Double(y), true);
	}

	public void add(double x, double y, boolean notify) {
		add(new java.lang.Double(x), new java.lang.Double(y), notify);
	}

	public void add(double x, java.lang.Number y) {
		add(new java.lang.Double(x), y);
	}

	public void add(double x, java.lang.Number y, boolean notify) {
		add(new java.lang.Double(x), y, notify);
	}

	public void add(java.lang.Number x, java.lang.Number y) {
		add(x, y, true);
	}

	public void add(java.lang.Number x, java.lang.Number y, boolean notify) {
		org.jfree.data.xy.XYDataItem item = new org.jfree.data.xy.XYDataItem(x, y);
		add(item, notify);
	}

	public void add(org.jfree.data.xy.XYDataItem item, boolean notify) {
		if (item == null) {
			throw new java.lang.IllegalArgumentException("Null 'item' argument.");
		}
		item = ((org.jfree.data.xy.XYDataItem) (item.clone()));
		if (org.jfree.data.xy.XYSeries.this.autoSort) {
			int index = java.util.Collections.binarySearch(org.jfree.data.xy.XYSeries.this.data, item);
			if (index < 0) {
				org.jfree.data.xy.XYSeries.this.data.add(((-index) - 1), item);
			}else {
				if (org.jfree.data.xy.XYSeries.this.allowDuplicateXValues) {
					int size = org.jfree.data.xy.XYSeries.this.data.size();
					while ((index < size) && ((item.compareTo(org.jfree.data.xy.XYSeries.this.data.get(index))) == 0)) {
						index++;
					} 
					if (index < (org.jfree.data.xy.XYSeries.this.data.size())) {
						org.jfree.data.xy.XYSeries.this.data.add(index, item);
					}else {
						org.jfree.data.xy.XYSeries.this.data.add(item);
					}
				}else {
					throw new org.jfree.data.general.SeriesException("X-value already exists.");
				}
			}
		}else {
			if (!(org.jfree.data.xy.XYSeries.this.allowDuplicateXValues)) {
				int index = indexOf(item.getX());
				if (index >= 0) {
					throw new org.jfree.data.general.SeriesException("X-value already exists.");
				}
			}
			org.jfree.data.xy.XYSeries.this.data.add(item);
		}
		updateBoundsForAddedItem(item);
		if ((getItemCount()) > (org.jfree.data.xy.XYSeries.this.maximumItemCount)) {
			org.jfree.data.xy.XYDataItem removed = ((org.jfree.data.xy.XYDataItem) (org.jfree.data.xy.XYSeries.this.data.remove(0)));
			updateBoundsForRemovedItem(removed);
		}
		if (notify) {
			fireSeriesChanged();
		}
	}

	public void delete(int start, int end) {
		org.jfree.data.xy.XYSeries.this.data.subList(start, (end + 1)).clear();
		findBoundsByIteration();
		fireSeriesChanged();
	}

	public org.jfree.data.xy.XYDataItem remove(int index) {
		org.jfree.data.xy.XYDataItem removed = ((org.jfree.data.xy.XYDataItem) (org.jfree.data.xy.XYSeries.this.data.remove(index)));
		updateBoundsForRemovedItem(removed);
		fireSeriesChanged();
		return removed;
	}

	public org.jfree.data.xy.XYDataItem remove(java.lang.Number x) {
		return remove(indexOf(x));
	}

	public void clear() {
		if ((org.jfree.data.xy.XYSeries.this.data.size()) > 0) {
			org.jfree.data.xy.XYSeries.this.data.clear();
			org.jfree.data.xy.XYSeries.this.minX = java.lang.Double.NaN;
			org.jfree.data.xy.XYSeries.this.maxX = java.lang.Double.NaN;
			org.jfree.data.xy.XYSeries.this.minY = java.lang.Double.NaN;
			org.jfree.data.xy.XYSeries.this.maxY = java.lang.Double.NaN;
			fireSeriesChanged();
		}
	}

	public org.jfree.data.xy.XYDataItem getDataItem(int index) {
		org.jfree.data.xy.XYDataItem item = ((org.jfree.data.xy.XYDataItem) (org.jfree.data.xy.XYSeries.this.data.get(index)));
		return ((org.jfree.data.xy.XYDataItem) (item.clone()));
	}

	org.jfree.data.xy.XYDataItem getRawDataItem(int index) {
		return ((org.jfree.data.xy.XYDataItem) (org.jfree.data.xy.XYSeries.this.data.get(index)));
	}

	public java.lang.Number getX(int index) {
		return getRawDataItem(index).getX();
	}

	public java.lang.Number getY(int index) {
		return getRawDataItem(index).getY();
	}

	public void updateByIndex(int index, java.lang.Number y) {
		org.jfree.data.xy.XYDataItem item = getRawDataItem(index);
		boolean iterate = false;
		double oldY = item.getYValue();
		if (!(java.lang.Double.isNaN(oldY))) {
			iterate = (oldY <= (org.jfree.data.xy.XYSeries.this.minY)) || (oldY >= (org.jfree.data.xy.XYSeries.this.maxY));
		}
		item.setY(y);
		if (iterate) {
			findBoundsByIteration();
		}else
			if (y != null) {
				double yy = y.doubleValue();
				org.jfree.data.xy.XYSeries.this.minY = minIgnoreNaN(org.jfree.data.xy.XYSeries.this.minY, yy);
				org.jfree.data.xy.XYSeries.this.maxY = maxIgnoreNaN(org.jfree.data.xy.XYSeries.this.maxY, yy);
			}
		
		fireSeriesChanged();
	}

	private double minIgnoreNaN(double a, double b) {
		if (java.lang.Double.isNaN(a)) {
			return b;
		}else {
			if (java.lang.Double.isNaN(b)) {
				return a;
			}else {
				return java.lang.Math.min(a, b);
			}
		}
	}

	private double maxIgnoreNaN(double a, double b) {
		if (java.lang.Double.isNaN(a)) {
			return b;
		}else {
			if (java.lang.Double.isNaN(b)) {
				return a;
			}else {
				return java.lang.Math.max(a, b);
			}
		}
	}

	public void update(java.lang.Number x, java.lang.Number y) {
		int index = indexOf(x);
		if (index < 0) {
			throw new org.jfree.data.general.SeriesException(("No observation for x = " + x));
		}else {
			updateByIndex(index, y);
		}
	}

	public org.jfree.data.xy.XYDataItem addOrUpdate(double x, double y) {
		return addOrUpdate(new java.lang.Double(x), new java.lang.Double(y));
	}

	public org.jfree.data.xy.XYDataItem addOrUpdate(java.lang.Number x, java.lang.Number y) {
		return addOrUpdate(new org.jfree.data.xy.XYDataItem(x, y));
	}

	public org.jfree.data.xy.XYDataItem addOrUpdate(org.jfree.data.xy.XYDataItem item) {
		if (item == null) {
			throw new java.lang.IllegalArgumentException("Null 'item' argument.");
		}
		if (org.jfree.data.xy.XYSeries.this.allowDuplicateXValues) {
			add(item);
			return null;
		}
		org.jfree.data.xy.XYDataItem overwritten = null;
		int index = indexOf(item.getX());
		if (index >= 0) {
			org.jfree.data.xy.XYDataItem existing = ((org.jfree.data.xy.XYDataItem) (org.jfree.data.xy.XYSeries.this.data.get(index)));
			overwritten = ((org.jfree.data.xy.XYDataItem) (existing.clone()));
			boolean iterate = false;
			double oldY = existing.getYValue();
			if (!(java.lang.Double.isNaN(oldY))) {
				iterate = (oldY <= (org.jfree.data.xy.XYSeries.this.minY)) || (oldY >= (org.jfree.data.xy.XYSeries.this.maxY));
			}
			existing.setY(item.getY());
			if (iterate) {
				findBoundsByIteration();
			}else
				if ((item.getY()) != null) {
					double yy = item.getY().doubleValue();
					org.jfree.data.xy.XYSeries.this.minY = minIgnoreNaN(org.jfree.data.xy.XYSeries.this.minY, yy);
					org.jfree.data.xy.XYSeries.this.maxY = minIgnoreNaN(org.jfree.data.xy.XYSeries.this.maxY, yy);
				}
			
		}else {
			item = ((org.jfree.data.xy.XYDataItem) (item.clone()));
			if (org.jfree.data.xy.XYSeries.this.autoSort) {
				org.jfree.data.xy.XYSeries.this.data.add(((-index) - 1), item);
			}else {
				org.jfree.data.xy.XYSeries.this.data.add(item);
			}
			updateBoundsForAddedItem(item);
			if ((getItemCount()) > (org.jfree.data.xy.XYSeries.this.maximumItemCount)) {
				org.jfree.data.xy.XYDataItem removed = ((org.jfree.data.xy.XYDataItem) (org.jfree.data.xy.XYSeries.this.data.remove(0)));
				updateBoundsForRemovedItem(removed);
			}
		}
		fireSeriesChanged();
		return overwritten;
	}

	public int indexOf(java.lang.Number x) {
		if (org.jfree.data.xy.XYSeries.this.autoSort) {
			return java.util.Collections.binarySearch(org.jfree.data.xy.XYSeries.this.data, new org.jfree.data.xy.XYDataItem(x, null));
		}else {
			for (int i = 0; i < (org.jfree.data.xy.XYSeries.this.data.size()); i++) {
				org.jfree.data.xy.XYDataItem item = ((org.jfree.data.xy.XYDataItem) (org.jfree.data.xy.XYSeries.this.data.get(i)));
				if (item.getX().equals(x)) {
					return i;
				}
			}
			return -1;
		}
	}

	public double[][] toArray() {
		int itemCount = getItemCount();
		double[][] result = new double[2][itemCount];
		for (int i = 0; i < itemCount; i++) {
			result[0][i] = org.jfree.data.xy.XYSeries.this.getX(i).doubleValue();
			java.lang.Number y = getY(i);
			if (y != null) {
				result[1][i] = y.doubleValue();
			}else {
				result[1][i] = java.lang.Double.NaN;
			}
		}
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.xy.XYSeries clone = ((org.jfree.data.xy.XYSeries) (super.clone()));
		clone.data = ((java.util.List) (org.jfree.chart.util.ObjectUtilities.deepClone(org.jfree.data.xy.XYSeries.this.data)));
		return clone;
	}

	public org.jfree.data.xy.XYSeries createCopy(int start, int end) throws java.lang.CloneNotSupportedException {
		org.jfree.data.xy.XYSeries copy = ((org.jfree.data.xy.XYSeries) (super.clone()));
		copy.data = new java.util.ArrayList();
		if ((org.jfree.data.xy.XYSeries.this.data.size()) > 0) {
			for (int index = start; index <= end; index++) {
				org.jfree.data.xy.XYDataItem item = ((org.jfree.data.xy.XYDataItem) (org.jfree.data.xy.XYSeries.this.data.get(index)));
				org.jfree.data.xy.XYDataItem clone = ((org.jfree.data.xy.XYDataItem) (item.clone()));
				try {
					copy.add(clone);
				} catch (org.jfree.data.general.SeriesException e) {
					java.lang.System.err.println("Unable to add cloned data item.");
				}
			}
		}
		return copy;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.xy.XYSeries.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.xy.XYSeries)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.data.xy.XYSeries that = ((org.jfree.data.xy.XYSeries) (obj));
		if ((org.jfree.data.xy.XYSeries.this.maximumItemCount) != (that.maximumItemCount)) {
			return false;
		}
		if ((org.jfree.data.xy.XYSeries.this.autoSort) != (that.autoSort)) {
			return false;
		}
		if ((org.jfree.data.xy.XYSeries.this.allowDuplicateXValues) != (that.allowDuplicateXValues)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.xy.XYSeries.this.data, that.data))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = super.hashCode();
		int count = getItemCount();
		if (count > 0) {
			org.jfree.data.xy.XYDataItem item = getRawDataItem(0);
			result = (29 * result) + (item.hashCode());
		}
		if (count > 1) {
			org.jfree.data.xy.XYDataItem item = getRawDataItem((count - 1));
			result = (29 * result) + (item.hashCode());
		}
		if (count > 2) {
			org.jfree.data.xy.XYDataItem item = getRawDataItem((count / 2));
			result = (29 * result) + (item.hashCode());
		}
		result = (29 * result) + (org.jfree.data.xy.XYSeries.this.maximumItemCount);
		result = (29 * result) + (org.jfree.data.xy.XYSeries.this.autoSort ? 1 : 0);
		result = (29 * result) + (org.jfree.data.xy.XYSeries.this.allowDuplicateXValues ? 1 : 0);
		return result;
	}
}


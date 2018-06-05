

package org.jfree.data.time;


public class TimeSeries extends org.jfree.data.general.Series implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = -5032960206869675528L;

	protected static final java.lang.String DEFAULT_DOMAIN_DESCRIPTION = "Time";

	protected static final java.lang.String DEFAULT_RANGE_DESCRIPTION = "Value";

	private java.lang.String domain;

	private java.lang.String range;

	protected java.lang.Class timePeriodClass;

	protected java.util.List data;

	private int maximumItemCount;

	private long maximumItemAge;

	private double minY;

	private double maxY;

	public TimeSeries(java.lang.Comparable name) {
		this(name, org.jfree.data.time.TimeSeries.DEFAULT_DOMAIN_DESCRIPTION, org.jfree.data.time.TimeSeries.DEFAULT_RANGE_DESCRIPTION);
	}

	public TimeSeries(java.lang.Comparable name, java.lang.String domain, java.lang.String range) {
		super(name);
		org.jfree.data.time.TimeSeries.this.domain = domain;
		org.jfree.data.time.TimeSeries.this.range = range;
		org.jfree.data.time.TimeSeries.this.timePeriodClass = null;
		org.jfree.data.time.TimeSeries.this.data = new java.util.ArrayList();
		org.jfree.data.time.TimeSeries.this.maximumItemCount = java.lang.Integer.MAX_VALUE;
		org.jfree.data.time.TimeSeries.this.maximumItemAge = java.lang.Long.MAX_VALUE;
		org.jfree.data.time.TimeSeries.this.minY = java.lang.Double.NaN;
		org.jfree.data.time.TimeSeries.this.maxY = java.lang.Double.NaN;
	}

	public java.lang.String getDomainDescription() {
		return org.jfree.data.time.TimeSeries.this.domain;
	}

	public void setDomainDescription(java.lang.String description) {
		java.lang.String old = org.jfree.data.time.TimeSeries.this.domain;
		org.jfree.data.time.TimeSeries.this.domain = description;
		firePropertyChange("Domain", old, description);
	}

	public java.lang.String getRangeDescription() {
		return org.jfree.data.time.TimeSeries.this.range;
	}

	public void setRangeDescription(java.lang.String description) {
		java.lang.String old = org.jfree.data.time.TimeSeries.this.range;
		org.jfree.data.time.TimeSeries.this.range = description;
		firePropertyChange("Range", old, description);
	}

	public int getItemCount() {
		return org.jfree.data.time.TimeSeries.this.data.size();
	}

	public java.util.List getItems() {
		return java.util.Collections.unmodifiableList(org.jfree.data.time.TimeSeries.this.data);
	}

	public int getMaximumItemCount() {
		return org.jfree.data.time.TimeSeries.this.maximumItemCount;
	}

	public void setMaximumItemCount(int maximum) {
		if (maximum < 0) {
			throw new java.lang.IllegalArgumentException("Negative 'maximum' argument.");
		}
		org.jfree.data.time.TimeSeries.this.maximumItemCount = maximum;
		int count = org.jfree.data.time.TimeSeries.this.data.size();
		if (count > maximum) {
			delete(0, ((count - maximum) - 1));
		}
	}

	public long getMaximumItemAge() {
		return org.jfree.data.time.TimeSeries.this.maximumItemAge;
	}

	public void setMaximumItemAge(long periods) {
		if (periods < 0) {
			throw new java.lang.IllegalArgumentException("Negative 'periods' argument.");
		}
		org.jfree.data.time.TimeSeries.this.maximumItemAge = periods;
		removeAgedItems(true);
	}

	public double getMinY() {
		return org.jfree.data.time.TimeSeries.this.minY;
	}

	public double getMaxY() {
		return org.jfree.data.time.TimeSeries.this.maxY;
	}

	public java.lang.Class getTimePeriodClass() {
		return org.jfree.data.time.TimeSeries.this.timePeriodClass;
	}

	public org.jfree.data.time.TimeSeriesDataItem getDataItem(int index) {
		org.jfree.data.time.TimeSeriesDataItem item = ((org.jfree.data.time.TimeSeriesDataItem) (org.jfree.data.time.TimeSeries.this.data.get(index)));
		return ((org.jfree.data.time.TimeSeriesDataItem) (item.clone()));
	}

	public org.jfree.data.time.TimeSeriesDataItem getDataItem(org.jfree.data.time.RegularTimePeriod period) {
		int index = getIndex(period);
		if (index >= 0) {
			return getDataItem(index);
		}else {
			return null;
		}
	}

	org.jfree.data.time.TimeSeriesDataItem getRawDataItem(int index) {
		return ((org.jfree.data.time.TimeSeriesDataItem) (org.jfree.data.time.TimeSeries.this.data.get(index)));
	}

	org.jfree.data.time.TimeSeriesDataItem getRawDataItem(org.jfree.data.time.RegularTimePeriod period) {
		int index = getIndex(period);
		if (index >= 0) {
			return ((org.jfree.data.time.TimeSeriesDataItem) (org.jfree.data.time.TimeSeries.this.data.get(index)));
		}else {
			return null;
		}
	}

	public org.jfree.data.time.RegularTimePeriod getTimePeriod(int index) {
		return getRawDataItem(index).getPeriod();
	}

	public org.jfree.data.time.RegularTimePeriod getNextTimePeriod() {
		org.jfree.data.time.RegularTimePeriod last = getTimePeriod(((getItemCount()) - 1));
		return last.next();
	}

	public java.util.Collection getTimePeriods() {
		java.util.Collection result = new java.util.ArrayList();
		for (int i = 0; i < (getItemCount()); i++) {
			result.add(getTimePeriod(i));
		}
		return result;
	}

	public java.util.Collection getTimePeriodsUniqueToOtherSeries(org.jfree.data.time.TimeSeries series) {
		java.util.Collection result = new java.util.ArrayList();
		for (int i = 0; i < (series.getItemCount()); i++) {
			org.jfree.data.time.RegularTimePeriod period = series.getTimePeriod(i);
			int index = getIndex(period);
			if (index < 0) {
				result.add(period);
			}
		}
		return result;
	}

	public int getIndex(org.jfree.data.time.RegularTimePeriod period) {
		if (period == null) {
			throw new java.lang.IllegalArgumentException("Null 'period' argument.");
		}
		org.jfree.data.time.TimeSeriesDataItem dummy = new org.jfree.data.time.TimeSeriesDataItem(period, java.lang.Integer.MIN_VALUE);
		return java.util.Collections.binarySearch(org.jfree.data.time.TimeSeries.this.data, dummy);
	}

	public java.lang.Number getValue(int index) {
		return getRawDataItem(index).getValue();
	}

	public java.lang.Number getValue(org.jfree.data.time.RegularTimePeriod period) {
		int index = getIndex(period);
		if (index >= 0) {
			return getValue(index);
		}else {
			return null;
		}
	}

	public void add(org.jfree.data.time.TimeSeriesDataItem item) {
		add(item, true);
	}

	public void add(org.jfree.data.time.TimeSeriesDataItem item, boolean notify) {
		if (item == null) {
			throw new java.lang.IllegalArgumentException("Null 'item' argument.");
		}
		item = ((org.jfree.data.time.TimeSeriesDataItem) (item.clone()));
		java.lang.Class c = item.getPeriod().getClass();
		if ((org.jfree.data.time.TimeSeries.this.timePeriodClass) == null) {
			org.jfree.data.time.TimeSeries.this.timePeriodClass = c;
		}else
			if (!(org.jfree.data.time.TimeSeries.this.timePeriodClass.equals(c))) {
				java.lang.StringBuffer b = new java.lang.StringBuffer();
				b.append("You are trying to add data where the time period class ");
				b.append("is ");
				b.append(item.getPeriod().getClass().getName());
				b.append(", but the TimeSeries is expecting an instance of ");
				b.append(org.jfree.data.time.TimeSeries.this.timePeriodClass.getName());
				b.append(".");
				throw new org.jfree.data.general.SeriesException(b.toString());
			}
		
		boolean added = false;
		int count = getItemCount();
		if (count == 0) {
			org.jfree.data.time.TimeSeries.this.data.add(item);
			added = true;
		}else {
			org.jfree.data.time.RegularTimePeriod last = getTimePeriod(((getItemCount()) - 1));
			if ((item.getPeriod().compareTo(last)) > 0) {
				org.jfree.data.time.TimeSeries.this.data.add(item);
				added = true;
			}else {
				int index = java.util.Collections.binarySearch(org.jfree.data.time.TimeSeries.this.data, item);
				if (index < 0) {
					org.jfree.data.time.TimeSeries.this.data.add(((-index) - 1), item);
					added = true;
				}else {
					java.lang.StringBuffer b = new java.lang.StringBuffer();
					b.append("You are attempting to add an observation for ");
					b.append("the time period ");
					b.append(item.getPeriod().toString());
					b.append(" but the series already contains an observation");
					b.append(" for that time period. Duplicates are not ");
					b.append("permitted.  Try using the addOrUpdate() method.");
					throw new org.jfree.data.general.SeriesException(b.toString());
				}
			}
		}
		if (added) {
			updateBoundsForAddedItem(item);
			if ((getItemCount()) > (org.jfree.data.time.TimeSeries.this.maximumItemCount)) {
				org.jfree.data.time.TimeSeriesDataItem d = ((org.jfree.data.time.TimeSeriesDataItem) (org.jfree.data.time.TimeSeries.this.data.remove(0)));
				updateBoundsForRemovedItem(d);
			}
			removeAgedItems(false);
			if (notify) {
				fireSeriesChanged();
			}
		}
	}

	public void add(org.jfree.data.time.RegularTimePeriod period, double value) {
		add(period, value, true);
	}

	public void add(org.jfree.data.time.RegularTimePeriod period, double value, boolean notify) {
		org.jfree.data.time.TimeSeriesDataItem item = new org.jfree.data.time.TimeSeriesDataItem(period, value);
		add(item, notify);
	}

	public void add(org.jfree.data.time.RegularTimePeriod period, java.lang.Number value) {
		add(period, value, true);
	}

	public void add(org.jfree.data.time.RegularTimePeriod period, java.lang.Number value, boolean notify) {
		org.jfree.data.time.TimeSeriesDataItem item = new org.jfree.data.time.TimeSeriesDataItem(period, value);
		add(item, notify);
	}

	public void update(org.jfree.data.time.RegularTimePeriod period, java.lang.Number value) {
		org.jfree.data.time.TimeSeriesDataItem temp = new org.jfree.data.time.TimeSeriesDataItem(period, value);
		int index = java.util.Collections.binarySearch(org.jfree.data.time.TimeSeries.this.data, temp);
		if (index < 0) {
			throw new org.jfree.data.general.SeriesException(("There is no existing value for the " + "specified 'period'."));
		}
		update(index, value);
	}

	public void update(int index, java.lang.Number value) {
		org.jfree.data.time.TimeSeriesDataItem item = ((org.jfree.data.time.TimeSeriesDataItem) (org.jfree.data.time.TimeSeries.this.data.get(index)));
		boolean iterate = false;
		java.lang.Number oldYN = item.getValue();
		if (oldYN != null) {
			double oldY = oldYN.doubleValue();
			if (!(java.lang.Double.isNaN(oldY))) {
				iterate = (oldY <= (org.jfree.data.time.TimeSeries.this.minY)) || (oldY >= (org.jfree.data.time.TimeSeries.this.maxY));
			}
		}
		item.setValue(value);
		if (iterate) {
			findBoundsByIteration();
		}else
			if (value != null) {
				double yy = value.doubleValue();
				org.jfree.data.time.TimeSeries.this.minY = minIgnoreNaN(org.jfree.data.time.TimeSeries.this.minY, yy);
				org.jfree.data.time.TimeSeries.this.maxY = maxIgnoreNaN(org.jfree.data.time.TimeSeries.this.maxY, yy);
			}
		
		fireSeriesChanged();
	}

	public org.jfree.data.time.TimeSeries addAndOrUpdate(org.jfree.data.time.TimeSeries series) {
		org.jfree.data.time.TimeSeries overwritten = new org.jfree.data.time.TimeSeries(("Overwritten values from: " + (getKey())));
		for (int i = 0; i < (series.getItemCount()); i++) {
			org.jfree.data.time.TimeSeriesDataItem item = series.getRawDataItem(i);
			org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue());
			if (oldItem != null) {
				overwritten.add(oldItem);
			}
		}
		return overwritten;
	}

	public org.jfree.data.time.TimeSeriesDataItem addOrUpdate(org.jfree.data.time.RegularTimePeriod period, double value) {
		return addOrUpdate(period, new java.lang.Double(value));
	}

	public org.jfree.data.time.TimeSeriesDataItem addOrUpdate(org.jfree.data.time.RegularTimePeriod period, java.lang.Number value) {
		return addOrUpdate(new org.jfree.data.time.TimeSeriesDataItem(period, value));
	}

	public org.jfree.data.time.TimeSeriesDataItem addOrUpdate(org.jfree.data.time.TimeSeriesDataItem item) {
		if (item == null) {
			throw new java.lang.IllegalArgumentException("Null 'period' argument.");
		}
		java.lang.Class periodClass = item.getPeriod().getClass();
		if ((org.jfree.data.time.TimeSeries.this.timePeriodClass) == null) {
			org.jfree.data.time.TimeSeries.this.timePeriodClass = periodClass;
		}else
			if (!(org.jfree.data.time.TimeSeries.this.timePeriodClass.equals(periodClass))) {
				java.lang.String msg = (((("You are trying to add data where the time " + "period class is ") + (periodClass.getName())) + ", but the TimeSeries is expecting an instance of ") + (org.jfree.data.time.TimeSeries.this.timePeriodClass.getName())) + ".";
				throw new org.jfree.data.general.SeriesException(msg);
			}
		
		org.jfree.data.time.TimeSeriesDataItem overwritten = null;
		int index = java.util.Collections.binarySearch(org.jfree.data.time.TimeSeries.this.data, item);
		if (index >= 0) {
			org.jfree.data.time.TimeSeriesDataItem existing = ((org.jfree.data.time.TimeSeriesDataItem) (org.jfree.data.time.TimeSeries.this.data.get(index)));
			overwritten = ((org.jfree.data.time.TimeSeriesDataItem) (existing.clone()));
			boolean iterate = false;
			java.lang.Number oldYN = existing.getValue();
			double oldY = oldYN != null ? oldYN.doubleValue() : java.lang.Double.NaN;
			if (!(java.lang.Double.isNaN(oldY))) {
				iterate = (oldY <= (org.jfree.data.time.TimeSeries.this.minY)) || (oldY >= (org.jfree.data.time.TimeSeries.this.maxY));
			}
			existing.setValue(item.getValue());
			if (iterate) {
				findBoundsByIteration();
			}else
				if ((item.getValue()) != null) {
					double yy = item.getValue().doubleValue();
					org.jfree.data.time.TimeSeries.this.minY = minIgnoreNaN(org.jfree.data.time.TimeSeries.this.minY, yy);
					org.jfree.data.time.TimeSeries.this.maxY = minIgnoreNaN(org.jfree.data.time.TimeSeries.this.maxY, yy);
				}
			
		}else {
			item = ((org.jfree.data.time.TimeSeriesDataItem) (item.clone()));
			org.jfree.data.time.TimeSeries.this.data.add(((-index) - 1), item);
			updateBoundsForAddedItem(item);
			if ((getItemCount()) > (org.jfree.data.time.TimeSeries.this.maximumItemCount)) {
				org.jfree.data.time.TimeSeriesDataItem d = ((org.jfree.data.time.TimeSeriesDataItem) (org.jfree.data.time.TimeSeries.this.data.remove(0)));
				updateBoundsForRemovedItem(d);
			}
		}
		removeAgedItems(false);
		fireSeriesChanged();
		return overwritten;
	}

	public void removeAgedItems(boolean notify) {
		if ((getItemCount()) > 1) {
			long latest = getTimePeriod(((getItemCount()) - 1)).getSerialIndex();
			boolean removed = false;
			while ((latest - (getTimePeriod(0).getSerialIndex())) > (org.jfree.data.time.TimeSeries.this.maximumItemAge)) {
				org.jfree.data.time.TimeSeries.this.data.remove(0);
				removed = true;
			} 
			if (removed) {
				findBoundsByIteration();
				if (notify) {
					fireSeriesChanged();
				}
			}
		}
	}

	public void removeAgedItems(long latest, boolean notify) {
		if (org.jfree.data.time.TimeSeries.this.data.isEmpty()) {
			return ;
		}
		long index = java.lang.Long.MAX_VALUE;
		try {
			java.lang.reflect.Method m = org.jfree.data.time.RegularTimePeriod.class.getDeclaredMethod("createInstance", new java.lang.Class[]{ java.lang.Class.class , java.util.Date.class , java.util.TimeZone.class });
			org.jfree.data.time.RegularTimePeriod newest = ((org.jfree.data.time.RegularTimePeriod) (m.invoke(org.jfree.data.time.TimeSeries.this.timePeriodClass, new java.lang.Object[]{ org.jfree.data.time.TimeSeries.this.timePeriodClass , new java.util.Date(latest) , java.util.TimeZone.getDefault() })));
			index = newest.getSerialIndex();
		} catch (java.lang.NoSuchMethodException e) {
			e.printStackTrace();
		} catch (java.lang.IllegalAccessException e) {
			e.printStackTrace();
		} catch (java.lang.reflect.InvocationTargetException e) {
			e.printStackTrace();
		}
		boolean removed = false;
		while (((getItemCount()) > 0) && ((index - (getTimePeriod(0).getSerialIndex())) > (org.jfree.data.time.TimeSeries.this.maximumItemAge))) {
			org.jfree.data.time.TimeSeries.this.data.remove(0);
			removed = true;
		} 
		if (removed) {
			findBoundsByIteration();
			if (notify) {
				fireSeriesChanged();
			}
		}
	}

	public void clear() {
		if ((org.jfree.data.time.TimeSeries.this.data.size()) > 0) {
			org.jfree.data.time.TimeSeries.this.data.clear();
			org.jfree.data.time.TimeSeries.this.timePeriodClass = null;
			org.jfree.data.time.TimeSeries.this.minY = java.lang.Double.NaN;
			org.jfree.data.time.TimeSeries.this.maxY = java.lang.Double.NaN;
			fireSeriesChanged();
		}
	}

	public void delete(org.jfree.data.time.RegularTimePeriod period) {
		int index = getIndex(period);
		if (index >= 0) {
			org.jfree.data.time.TimeSeriesDataItem item = ((org.jfree.data.time.TimeSeriesDataItem) (org.jfree.data.time.TimeSeries.this.data.remove(index)));
			updateBoundsForRemovedItem(item);
			if (org.jfree.data.time.TimeSeries.this.data.isEmpty()) {
				org.jfree.data.time.TimeSeries.this.timePeriodClass = null;
			}
			fireSeriesChanged();
		}
	}

	public void delete(int start, int end) {
		delete(start, end, true);
	}

	public void delete(int start, int end, boolean notify) {
		if (end < start) {
			throw new java.lang.IllegalArgumentException("Requires start <= end.");
		}
		for (int i = 0; i <= (end - start); i++) {
			org.jfree.data.time.TimeSeries.this.data.remove(start);
		}
		findBoundsByIteration();
		if (org.jfree.data.time.TimeSeries.this.data.isEmpty()) {
			org.jfree.data.time.TimeSeries.this.timePeriodClass = null;
		}
		if (notify) {
			fireSeriesChanged();
		}
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.time.TimeSeries clone = ((org.jfree.data.time.TimeSeries) (super.clone()));
		clone.data = ((java.util.List) (org.jfree.chart.util.ObjectUtilities.deepClone(org.jfree.data.time.TimeSeries.this.data)));
		return clone;
	}

	public org.jfree.data.time.TimeSeries createCopy(int start, int end) throws java.lang.CloneNotSupportedException {
		if (start < 0) {
			throw new java.lang.IllegalArgumentException("Requires start >= 0.");
		}
		if (end < start) {
			throw new java.lang.IllegalArgumentException("Requires start <= end.");
		}
		org.jfree.data.time.TimeSeries copy = ((org.jfree.data.time.TimeSeries) (super.clone()));
		copy.minY = java.lang.Double.NaN;
		copy.maxY = java.lang.Double.NaN;
		copy.data = new java.util.ArrayList();
		if ((org.jfree.data.time.TimeSeries.this.data.size()) > 0) {
			for (int index = start; index <= end; index++) {
				org.jfree.data.time.TimeSeriesDataItem item = ((org.jfree.data.time.TimeSeriesDataItem) (org.jfree.data.time.TimeSeries.this.data.get(index)));
				org.jfree.data.time.TimeSeriesDataItem clone = ((org.jfree.data.time.TimeSeriesDataItem) (item.clone()));
				try {
					copy.add(clone);
				} catch (org.jfree.data.general.SeriesException e) {
					e.printStackTrace();
				}
			}
		}
		return copy;
	}

	public org.jfree.data.time.TimeSeries createCopy(org.jfree.data.time.RegularTimePeriod start, org.jfree.data.time.RegularTimePeriod end) throws java.lang.CloneNotSupportedException {
		if (start == null) {
			throw new java.lang.IllegalArgumentException("Null 'start' argument.");
		}
		if (end == null) {
			throw new java.lang.IllegalArgumentException("Null 'end' argument.");
		}
		if ((start.compareTo(end)) > 0) {
			throw new java.lang.IllegalArgumentException("Requires start on or before end.");
		}
		boolean emptyRange = false;
		int startIndex = getIndex(start);
		if (startIndex < 0) {
			startIndex = -(startIndex + 1);
			if (startIndex == (org.jfree.data.time.TimeSeries.this.data.size())) {
				emptyRange = true;
			}
		}
		int endIndex = getIndex(end);
		if (endIndex < 0) {
			endIndex = -(endIndex + 1);
			endIndex = endIndex - 1;
		}
		if ((endIndex < 0) || (endIndex < startIndex)) {
			emptyRange = true;
		}
		if (emptyRange) {
			org.jfree.data.time.TimeSeries copy = ((org.jfree.data.time.TimeSeries) (super.clone()));
			copy.data = new java.util.ArrayList();
			return copy;
		}else {
			return createCopy(startIndex, endIndex);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.time.TimeSeries.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.time.TimeSeries)) {
			return false;
		}
		org.jfree.data.time.TimeSeries that = ((org.jfree.data.time.TimeSeries) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(getDomainDescription(), that.getDomainDescription()))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(getRangeDescription(), that.getRangeDescription()))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.time.TimeSeries.this.timePeriodClass, that.timePeriodClass))) {
			return false;
		}
		if ((getMaximumItemAge()) != (that.getMaximumItemAge())) {
			return false;
		}
		if ((getMaximumItemCount()) != (that.getMaximumItemCount())) {
			return false;
		}
		int count = getItemCount();
		if (count != (that.getItemCount())) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.time.TimeSeries.this.data, that.data))) {
			return false;
		}
		return super.equals(obj);
	}

	public int hashCode() {
		int result = super.hashCode();
		result = (29 * result) + ((org.jfree.data.time.TimeSeries.this.domain) != null ? org.jfree.data.time.TimeSeries.this.domain.hashCode() : 0);
		result = (29 * result) + ((org.jfree.data.time.TimeSeries.this.range) != null ? org.jfree.data.time.TimeSeries.this.range.hashCode() : 0);
		result = (29 * result) + ((org.jfree.data.time.TimeSeries.this.timePeriodClass) != null ? org.jfree.data.time.TimeSeries.this.timePeriodClass.hashCode() : 0);
		int count = getItemCount();
		if (count > 0) {
			org.jfree.data.time.TimeSeriesDataItem item = getRawDataItem(0);
			result = (29 * result) + (item.hashCode());
		}
		if (count > 1) {
			org.jfree.data.time.TimeSeriesDataItem item = getRawDataItem((count - 1));
			result = (29 * result) + (item.hashCode());
		}
		if (count > 2) {
			org.jfree.data.time.TimeSeriesDataItem item = getRawDataItem((count / 2));
			result = (29 * result) + (item.hashCode());
		}
		result = (29 * result) + (org.jfree.data.time.TimeSeries.this.maximumItemCount);
		result = (29 * result) + ((int) (org.jfree.data.time.TimeSeries.this.maximumItemAge));
		return result;
	}

	private void updateBoundsForAddedItem(org.jfree.data.time.TimeSeriesDataItem item) {
		java.lang.Number yN = item.getValue();
		if ((item.getValue()) != null) {
			double y = yN.doubleValue();
			org.jfree.data.time.TimeSeries.this.minY = minIgnoreNaN(org.jfree.data.time.TimeSeries.this.minY, y);
			org.jfree.data.time.TimeSeries.this.maxY = maxIgnoreNaN(org.jfree.data.time.TimeSeries.this.maxY, y);
		}
	}

	private void updateBoundsForRemovedItem(org.jfree.data.time.TimeSeriesDataItem item) {
		java.lang.Number yN = item.getValue();
		if (yN != null) {
			double y = yN.doubleValue();
			if (!(java.lang.Double.isNaN(y))) {
				if ((y <= (org.jfree.data.time.TimeSeries.this.minY)) || (y >= (org.jfree.data.time.TimeSeries.this.maxY))) {
					findBoundsByIteration();
				}
			}
		}
	}

	private void findBoundsByIteration() {
		org.jfree.data.time.TimeSeries.this.minY = java.lang.Double.NaN;
		org.jfree.data.time.TimeSeries.this.maxY = java.lang.Double.NaN;
		java.util.Iterator iterator = org.jfree.data.time.TimeSeries.this.data.iterator();
		while (iterator.hasNext()) {
			org.jfree.data.time.TimeSeriesDataItem item = ((org.jfree.data.time.TimeSeriesDataItem) (iterator.next()));
			updateBoundsForAddedItem(item);
		} 
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
}


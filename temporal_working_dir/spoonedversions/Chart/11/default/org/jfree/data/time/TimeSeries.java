

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

	public TimeSeries(java.lang.Comparable name) {
		this(name, org.jfree.data.time.TimeSeries.DEFAULT_DOMAIN_DESCRIPTION, org.jfree.data.time.TimeSeries.DEFAULT_RANGE_DESCRIPTION, org.jfree.data.time.Day.class);
	}

	public TimeSeries(java.lang.Comparable name, java.lang.Class timePeriodClass) {
		this(name, org.jfree.data.time.TimeSeries.DEFAULT_DOMAIN_DESCRIPTION, org.jfree.data.time.TimeSeries.DEFAULT_RANGE_DESCRIPTION, timePeriodClass);
	}

	public TimeSeries(java.lang.Comparable name, java.lang.String domain, java.lang.String range, java.lang.Class timePeriodClass) {
		super(name);
		org.jfree.data.time.TimeSeries.this.domain = domain;
		org.jfree.data.time.TimeSeries.this.range = range;
		org.jfree.data.time.TimeSeries.this.timePeriodClass = timePeriodClass;
		org.jfree.data.time.TimeSeries.this.data = new java.util.ArrayList();
		org.jfree.data.time.TimeSeries.this.maximumItemCount = java.lang.Integer.MAX_VALUE;
		org.jfree.data.time.TimeSeries.this.maximumItemAge = java.lang.Long.MAX_VALUE;
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

	public java.lang.Class getTimePeriodClass() {
		return org.jfree.data.time.TimeSeries.this.timePeriodClass;
	}

	public org.jfree.data.time.TimeSeriesDataItem getDataItem(int index) {
		return ((org.jfree.data.time.TimeSeriesDataItem) (org.jfree.data.time.TimeSeries.this.data.get(index)));
	}

	public org.jfree.data.time.TimeSeriesDataItem getDataItem(org.jfree.data.time.RegularTimePeriod period) {
		int index = getIndex(period);
		if (index >= 0) {
			return ((org.jfree.data.time.TimeSeriesDataItem) (org.jfree.data.time.TimeSeries.this.data.get(index)));
		}else {
			return null;
		}
	}

	public org.jfree.data.time.RegularTimePeriod getTimePeriod(int index) {
		return getDataItem(index).getPeriod();
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
		return getDataItem(index).getValue();
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
		if (!(item.getPeriod().getClass().equals(org.jfree.data.time.TimeSeries.this.timePeriodClass))) {
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
			if ((getItemCount()) > (org.jfree.data.time.TimeSeries.this.maximumItemCount)) {
				org.jfree.data.time.TimeSeries.this.data.remove(0);
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
		if (index >= 0) {
			org.jfree.data.time.TimeSeriesDataItem pair = ((org.jfree.data.time.TimeSeriesDataItem) (org.jfree.data.time.TimeSeries.this.data.get(index)));
			pair.setValue(value);
			fireSeriesChanged();
		}else {
			throw new org.jfree.data.general.SeriesException("TimeSeries.update(TimePeriod, Number):  period does not exist.");
		}
	}

	public void update(int index, java.lang.Number value) {
		org.jfree.data.time.TimeSeriesDataItem item = getDataItem(index);
		item.setValue(value);
		fireSeriesChanged();
	}

	public org.jfree.data.time.TimeSeries addAndOrUpdate(org.jfree.data.time.TimeSeries series) {
		org.jfree.data.time.TimeSeries overwritten = new org.jfree.data.time.TimeSeries(("Overwritten values from: " + (getKey())), series.getTimePeriodClass());
		for (int i = 0; i < (series.getItemCount()); i++) {
			org.jfree.data.time.TimeSeriesDataItem item = series.getDataItem(i);
			org.jfree.data.time.TimeSeriesDataItem oldItem = addOrUpdate(item.getPeriod(), item.getValue());
			if (oldItem != null) {
				overwritten.add(oldItem);
			}
		}
		return overwritten;
	}

	public org.jfree.data.time.TimeSeriesDataItem addOrUpdate(org.jfree.data.time.RegularTimePeriod period, double value) {
		return org.jfree.data.time.TimeSeries.this.addOrUpdate(period, new java.lang.Double(value));
	}

	public org.jfree.data.time.TimeSeriesDataItem addOrUpdate(org.jfree.data.time.RegularTimePeriod period, java.lang.Number value) {
		if (period == null) {
			throw new java.lang.IllegalArgumentException("Null 'period' argument.");
		}
		org.jfree.data.time.TimeSeriesDataItem overwritten = null;
		org.jfree.data.time.TimeSeriesDataItem key = new org.jfree.data.time.TimeSeriesDataItem(period, value);
		int index = java.util.Collections.binarySearch(org.jfree.data.time.TimeSeries.this.data, key);
		if (index >= 0) {
			org.jfree.data.time.TimeSeriesDataItem existing = ((org.jfree.data.time.TimeSeriesDataItem) (org.jfree.data.time.TimeSeries.this.data.get(index)));
			overwritten = ((org.jfree.data.time.TimeSeriesDataItem) (existing.clone()));
			existing.setValue(value);
			removeAgedItems(false);
			fireSeriesChanged();
		}else {
			org.jfree.data.time.TimeSeries.this.data.add(((-index) - 1), new org.jfree.data.time.TimeSeriesDataItem(period, value));
			if ((getItemCount()) > (org.jfree.data.time.TimeSeries.this.maximumItemCount)) {
				org.jfree.data.time.TimeSeries.this.data.remove(0);
			}
			removeAgedItems(false);
			fireSeriesChanged();
		}
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
			if (removed && notify) {
				fireSeriesChanged();
			}
		}
	}

	public void removeAgedItems(long latest, boolean notify) {
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
		if (removed && notify) {
			fireSeriesChanged();
		}
	}

	public void clear() {
		if ((org.jfree.data.time.TimeSeries.this.data.size()) > 0) {
			org.jfree.data.time.TimeSeries.this.data.clear();
			fireSeriesChanged();
		}
	}

	public void delete(org.jfree.data.time.RegularTimePeriod period) {
		int index = getIndex(period);
		if (index >= 0) {
			org.jfree.data.time.TimeSeries.this.data.remove(index);
			fireSeriesChanged();
		}
	}

	public void delete(int start, int end) {
		if (end < start) {
			throw new java.lang.IllegalArgumentException("Requires start <= end.");
		}
		for (int i = 0; i <= (end - start); i++) {
			org.jfree.data.time.TimeSeries.this.data.remove(start);
		}
		fireSeriesChanged();
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
		if (endIndex < 0) {
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

	public boolean equals(java.lang.Object object) {
		if (object == (org.jfree.data.time.TimeSeries.this)) {
			return true;
		}
		if ((!(object instanceof org.jfree.data.time.TimeSeries)) || (!(super.equals(object)))) {
			return false;
		}
		org.jfree.data.time.TimeSeries s = ((org.jfree.data.time.TimeSeries) (object));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(getDomainDescription(), s.getDomainDescription()))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(getRangeDescription(), s.getRangeDescription()))) {
			return false;
		}
		if (!(getClass().equals(s.getClass()))) {
			return false;
		}
		if ((getMaximumItemAge()) != (s.getMaximumItemAge())) {
			return false;
		}
		if ((getMaximumItemCount()) != (s.getMaximumItemCount())) {
			return false;
		}
		int count = getItemCount();
		if (count != (s.getItemCount())) {
			return false;
		}
		for (int i = 0; i < count; i++) {
			if (!(getDataItem(i).equals(s.getDataItem(i)))) {
				return false;
			}
		}
		return true;
	}

	public int hashCode() {
		int result = super.hashCode();
		result = (29 * result) + ((org.jfree.data.time.TimeSeries.this.domain) != null ? org.jfree.data.time.TimeSeries.this.domain.hashCode() : 0);
		result = (29 * result) + ((org.jfree.data.time.TimeSeries.this.range) != null ? org.jfree.data.time.TimeSeries.this.range.hashCode() : 0);
		result = (29 * result) + ((org.jfree.data.time.TimeSeries.this.timePeriodClass) != null ? org.jfree.data.time.TimeSeries.this.timePeriodClass.hashCode() : 0);
		int count = getItemCount();
		if (count > 0) {
			org.jfree.data.time.TimeSeriesDataItem item = getDataItem(0);
			result = (29 * result) + (item.hashCode());
		}
		if (count > 1) {
			org.jfree.data.time.TimeSeriesDataItem item = getDataItem((count - 1));
			result = (29 * result) + (item.hashCode());
		}
		if (count > 2) {
			org.jfree.data.time.TimeSeriesDataItem item = getDataItem((count / 2));
			result = (29 * result) + (item.hashCode());
		}
		result = (29 * result) + (org.jfree.data.time.TimeSeries.this.maximumItemCount);
		result = (29 * result) + ((int) (org.jfree.data.time.TimeSeries.this.maximumItemAge));
		return result;
	}
}


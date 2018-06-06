

package org.jfree.data.time;


public class TimePeriodValues extends org.jfree.data.general.Series implements java.io.Serializable {
	static final long serialVersionUID = -2210593619794989709L;

	protected static final java.lang.String DEFAULT_DOMAIN_DESCRIPTION = "Time";

	protected static final java.lang.String DEFAULT_RANGE_DESCRIPTION = "Value";

	private java.lang.String domain;

	private java.lang.String range;

	private java.util.List data;

	private int minStartIndex = -1;

	private int maxStartIndex = -1;

	private int minMiddleIndex = -1;

	private int maxMiddleIndex = -1;

	private int minEndIndex = -1;

	private int maxEndIndex = -1;

	public TimePeriodValues(java.lang.Comparable name) {
		this(name, org.jfree.data.time.TimePeriodValues.DEFAULT_DOMAIN_DESCRIPTION, org.jfree.data.time.TimePeriodValues.DEFAULT_RANGE_DESCRIPTION);
	}

	public TimePeriodValues(java.lang.Comparable name, java.lang.String domain, java.lang.String range) {
		super(name);
		org.jfree.data.time.TimePeriodValues.this.domain = domain;
		org.jfree.data.time.TimePeriodValues.this.range = range;
		org.jfree.data.time.TimePeriodValues.this.data = new java.util.ArrayList();
	}

	public java.lang.String getDomainDescription() {
		return org.jfree.data.time.TimePeriodValues.this.domain;
	}

	public void setDomainDescription(java.lang.String description) {
		java.lang.String old = org.jfree.data.time.TimePeriodValues.this.domain;
		org.jfree.data.time.TimePeriodValues.this.domain = description;
		firePropertyChange("Domain", old, description);
	}

	public java.lang.String getRangeDescription() {
		return org.jfree.data.time.TimePeriodValues.this.range;
	}

	public void setRangeDescription(java.lang.String description) {
		java.lang.String old = org.jfree.data.time.TimePeriodValues.this.range;
		org.jfree.data.time.TimePeriodValues.this.range = description;
		firePropertyChange("Range", old, description);
	}

	public int getItemCount() {
		return org.jfree.data.time.TimePeriodValues.this.data.size();
	}

	public org.jfree.data.time.TimePeriodValue getDataItem(int index) {
		return ((org.jfree.data.time.TimePeriodValue) (org.jfree.data.time.TimePeriodValues.this.data.get(index)));
	}

	public org.jfree.data.time.TimePeriod getTimePeriod(int index) {
		return getDataItem(index).getPeriod();
	}

	public java.lang.Number getValue(int index) {
		return getDataItem(index).getValue();
	}

	public void add(org.jfree.data.time.TimePeriodValue item) {
		if (item == null) {
			throw new java.lang.IllegalArgumentException("Null item not allowed.");
		}
		org.jfree.data.time.TimePeriodValues.this.data.add(item);
		updateBounds(item.getPeriod(), ((org.jfree.data.time.TimePeriodValues.this.data.size()) - 1));
		fireSeriesChanged();
	}

	private void updateBounds(org.jfree.data.time.TimePeriod period, int index) {
		long start = period.getStart().getTime();
		long end = period.getEnd().getTime();
		long middle = start + ((end - start) / 2);
		if ((org.jfree.data.time.TimePeriodValues.this.minStartIndex) >= 0) {
			long minStart = getDataItem(org.jfree.data.time.TimePeriodValues.this.minStartIndex).getPeriod().getStart().getTime();
			if (start < minStart) {
				org.jfree.data.time.TimePeriodValues.this.minStartIndex = index;
			}
		}else {
			org.jfree.data.time.TimePeriodValues.this.minStartIndex = index;
		}
		if ((org.jfree.data.time.TimePeriodValues.this.maxStartIndex) >= 0) {
			long maxStart = getDataItem(org.jfree.data.time.TimePeriodValues.this.maxStartIndex).getPeriod().getStart().getTime();
			if (start > maxStart) {
				org.jfree.data.time.TimePeriodValues.this.maxStartIndex = index;
			}
		}else {
			org.jfree.data.time.TimePeriodValues.this.maxStartIndex = index;
		}
		if ((org.jfree.data.time.TimePeriodValues.this.minMiddleIndex) >= 0) {
			long s = getDataItem(org.jfree.data.time.TimePeriodValues.this.minMiddleIndex).getPeriod().getStart().getTime();
			long e = getDataItem(org.jfree.data.time.TimePeriodValues.this.minMiddleIndex).getPeriod().getEnd().getTime();
			long minMiddle = s + ((e - s) / 2);
			if (middle < minMiddle) {
				org.jfree.data.time.TimePeriodValues.this.minMiddleIndex = index;
			}
		}else {
			org.jfree.data.time.TimePeriodValues.this.minMiddleIndex = index;
		}
		if ((org.jfree.data.time.TimePeriodValues.this.maxMiddleIndex) >= 0) {
			long s = getDataItem(org.jfree.data.time.TimePeriodValues.this.minMiddleIndex).getPeriod().getStart().getTime();
			long e = getDataItem(org.jfree.data.time.TimePeriodValues.this.minMiddleIndex).getPeriod().getEnd().getTime();
			long maxMiddle = s + ((e - s) / 2);
			if (middle > maxMiddle) {
				org.jfree.data.time.TimePeriodValues.this.maxMiddleIndex = index;
			}
		}else {
			org.jfree.data.time.TimePeriodValues.this.maxMiddleIndex = index;
		}
		if ((org.jfree.data.time.TimePeriodValues.this.minEndIndex) >= 0) {
			long minEnd = getDataItem(org.jfree.data.time.TimePeriodValues.this.minEndIndex).getPeriod().getEnd().getTime();
			if (end < minEnd) {
				org.jfree.data.time.TimePeriodValues.this.minEndIndex = index;
			}
		}else {
			org.jfree.data.time.TimePeriodValues.this.minEndIndex = index;
		}
		if ((org.jfree.data.time.TimePeriodValues.this.maxEndIndex) >= 0) {
			long maxEnd = getDataItem(org.jfree.data.time.TimePeriodValues.this.maxEndIndex).getPeriod().getEnd().getTime();
			if (end > maxEnd) {
				org.jfree.data.time.TimePeriodValues.this.maxEndIndex = index;
			}
		}else {
			org.jfree.data.time.TimePeriodValues.this.maxEndIndex = index;
		}
	}

	private void recalculateBounds() {
		org.jfree.data.time.TimePeriodValues.this.minStartIndex = -1;
		org.jfree.data.time.TimePeriodValues.this.minMiddleIndex = -1;
		org.jfree.data.time.TimePeriodValues.this.minEndIndex = -1;
		org.jfree.data.time.TimePeriodValues.this.maxStartIndex = -1;
		org.jfree.data.time.TimePeriodValues.this.maxMiddleIndex = -1;
		org.jfree.data.time.TimePeriodValues.this.maxEndIndex = -1;
		for (int i = 0; i < (org.jfree.data.time.TimePeriodValues.this.data.size()); i++) {
			org.jfree.data.time.TimePeriodValue tpv = ((org.jfree.data.time.TimePeriodValue) (org.jfree.data.time.TimePeriodValues.this.data.get(i)));
			updateBounds(tpv.getPeriod(), i);
		}
	}

	public void add(org.jfree.data.time.TimePeriod period, double value) {
		org.jfree.data.time.TimePeriodValue item = new org.jfree.data.time.TimePeriodValue(period, value);
		add(item);
	}

	public void add(org.jfree.data.time.TimePeriod period, java.lang.Number value) {
		org.jfree.data.time.TimePeriodValue item = new org.jfree.data.time.TimePeriodValue(period, value);
		add(item);
	}

	public void update(int index, java.lang.Number value) {
		org.jfree.data.time.TimePeriodValue item = getDataItem(index);
		item.setValue(value);
		fireSeriesChanged();
	}

	public void delete(int start, int end) {
		for (int i = 0; i <= (end - start); i++) {
			org.jfree.data.time.TimePeriodValues.this.data.remove(start);
		}
		recalculateBounds();
		fireSeriesChanged();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.time.TimePeriodValues.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.time.TimePeriodValues)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.data.time.TimePeriodValues that = ((org.jfree.data.time.TimePeriodValues) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.time.TimePeriodValues.this.getDomainDescription(), that.getDomainDescription()))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.time.TimePeriodValues.this.getRangeDescription(), that.getRangeDescription()))) {
			return false;
		}
		int count = getItemCount();
		if (count != (that.getItemCount())) {
			return false;
		}
		for (int i = 0; i < count; i++) {
			if (!(getDataItem(i).equals(that.getDataItem(i)))) {
				return false;
			}
		}
		return true;
	}

	public int hashCode() {
		int result;
		result = ((org.jfree.data.time.TimePeriodValues.this.domain) != null) ? org.jfree.data.time.TimePeriodValues.this.domain.hashCode() : 0;
		result = (29 * result) + ((org.jfree.data.time.TimePeriodValues.this.range) != null ? org.jfree.data.time.TimePeriodValues.this.range.hashCode() : 0);
		result = (29 * result) + (org.jfree.data.time.TimePeriodValues.this.data.hashCode());
		result = (29 * result) + (org.jfree.data.time.TimePeriodValues.this.minStartIndex);
		result = (29 * result) + (org.jfree.data.time.TimePeriodValues.this.maxStartIndex);
		result = (29 * result) + (org.jfree.data.time.TimePeriodValues.this.minMiddleIndex);
		result = (29 * result) + (org.jfree.data.time.TimePeriodValues.this.maxMiddleIndex);
		result = (29 * result) + (org.jfree.data.time.TimePeriodValues.this.minEndIndex);
		result = (29 * result) + (org.jfree.data.time.TimePeriodValues.this.maxEndIndex);
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		java.lang.Object clone = createCopy(0, ((getItemCount()) - 1));
		return clone;
	}

	public org.jfree.data.time.TimePeriodValues createCopy(int start, int end) throws java.lang.CloneNotSupportedException {
		org.jfree.data.time.TimePeriodValues copy = ((org.jfree.data.time.TimePeriodValues) (super.clone()));
		copy.data = new java.util.ArrayList();
		if ((org.jfree.data.time.TimePeriodValues.this.data.size()) > 0) {
			for (int index = start; index <= end; index++) {
				org.jfree.data.time.TimePeriodValue item = ((org.jfree.data.time.TimePeriodValue) (org.jfree.data.time.TimePeriodValues.this.data.get(index)));
				org.jfree.data.time.TimePeriodValue clone = ((org.jfree.data.time.TimePeriodValue) (item.clone()));
				try {
					copy.add(clone);
				} catch (org.jfree.data.general.SeriesException e) {
					java.lang.System.err.println("Failed to add cloned item.");
				}
			}
		}
		return copy;
	}

	public int getMinStartIndex() {
		return org.jfree.data.time.TimePeriodValues.this.minStartIndex;
	}

	public int getMaxStartIndex() {
		return org.jfree.data.time.TimePeriodValues.this.maxStartIndex;
	}

	public int getMinMiddleIndex() {
		return org.jfree.data.time.TimePeriodValues.this.minMiddleIndex;
	}

	public int getMaxMiddleIndex() {
		return org.jfree.data.time.TimePeriodValues.this.maxMiddleIndex;
	}

	public int getMinEndIndex() {
		return org.jfree.data.time.TimePeriodValues.this.minEndIndex;
	}

	public int getMaxEndIndex() {
		return org.jfree.data.time.TimePeriodValues.this.maxEndIndex;
	}
}


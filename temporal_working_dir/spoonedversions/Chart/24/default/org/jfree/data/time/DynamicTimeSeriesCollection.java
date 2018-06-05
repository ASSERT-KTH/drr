

package org.jfree.data.time;


public class DynamicTimeSeriesCollection extends org.jfree.data.xy.AbstractIntervalXYDataset implements org.jfree.data.DomainInfo , org.jfree.data.RangeInfo , org.jfree.data.xy.IntervalXYDataset {
	public static final int START = 0;

	public static final int MIDDLE = 1;

	public static final int END = 2;

	private int maximumItemCount = 2000;

	protected int historyCount;

	private java.lang.Comparable[] seriesKeys;

	private java.lang.Class timePeriodClass = org.jfree.data.time.Minute.class;

	protected org.jfree.data.time.RegularTimePeriod[] pointsInTime;

	private int seriesCount;

	protected class ValueSequence {
		float[] dataPoints;

		public ValueSequence() {
			this(org.jfree.data.time.DynamicTimeSeriesCollection.this.maximumItemCount);
		}

		public ValueSequence(int length) {
			org.jfree.data.time.DynamicTimeSeriesCollection.ValueSequence.this.dataPoints = new float[length];
			for (int i = 0; i < length; i++) {
				org.jfree.data.time.DynamicTimeSeriesCollection.ValueSequence.this.dataPoints[i] = 0.0F;
			}
		}

		public void enterData(int index, float value) {
			org.jfree.data.time.DynamicTimeSeriesCollection.ValueSequence.this.dataPoints[index] = value;
		}

		public float getData(int index) {
			return org.jfree.data.time.DynamicTimeSeriesCollection.ValueSequence.this.dataPoints[index];
		}
	}

	protected org.jfree.data.time.DynamicTimeSeriesCollection.ValueSequence[] valueHistory;

	protected java.util.Calendar workingCalendar;

	private int position;

	private boolean domainIsPointsInTime;

	private int oldestAt;

	private int newestAt;

	private long deltaTime;

	private java.lang.Long domainStart;

	private java.lang.Long domainEnd;

	private org.jfree.data.Range domainRange;

	private java.lang.Float minValue = new java.lang.Float(0.0F);

	private java.lang.Float maxValue = null;

	private org.jfree.data.Range valueRange;

	public DynamicTimeSeriesCollection(int nSeries, int nMoments) {
		this(nSeries, nMoments, new org.jfree.data.time.Millisecond(), java.util.TimeZone.getDefault());
		org.jfree.data.time.DynamicTimeSeriesCollection.this.newestAt = nMoments - 1;
	}

	public DynamicTimeSeriesCollection(int nSeries, int nMoments, java.util.TimeZone zone) {
		this(nSeries, nMoments, new org.jfree.data.time.Millisecond(), zone);
		org.jfree.data.time.DynamicTimeSeriesCollection.this.newestAt = nMoments - 1;
	}

	public DynamicTimeSeriesCollection(int nSeries, int nMoments, org.jfree.data.time.RegularTimePeriod timeSample) {
		this(nSeries, nMoments, timeSample, java.util.TimeZone.getDefault());
	}

	public DynamicTimeSeriesCollection(int nSeries, int nMoments, org.jfree.data.time.RegularTimePeriod timeSample, java.util.TimeZone zone) {
		org.jfree.data.time.DynamicTimeSeriesCollection.this.maximumItemCount = nMoments;
		org.jfree.data.time.DynamicTimeSeriesCollection.this.historyCount = nMoments;
		org.jfree.data.time.DynamicTimeSeriesCollection.this.seriesKeys = new java.lang.Comparable[nSeries];
		for (int i = 0; i < nSeries; i++) {
			org.jfree.data.time.DynamicTimeSeriesCollection.this.seriesKeys[i] = "";
		}
		org.jfree.data.time.DynamicTimeSeriesCollection.this.newestAt = nMoments - 1;
		org.jfree.data.time.DynamicTimeSeriesCollection.this.valueHistory = new org.jfree.data.time.DynamicTimeSeriesCollection.ValueSequence[nSeries];
		org.jfree.data.time.DynamicTimeSeriesCollection.this.timePeriodClass = timeSample.getClass();
		if ((org.jfree.data.time.DynamicTimeSeriesCollection.this.timePeriodClass) == (org.jfree.data.time.Second.class)) {
			org.jfree.data.time.DynamicTimeSeriesCollection.this.pointsInTime = new org.jfree.data.time.Second[nMoments];
		}else
			if ((org.jfree.data.time.DynamicTimeSeriesCollection.this.timePeriodClass) == (org.jfree.data.time.Minute.class)) {
				org.jfree.data.time.DynamicTimeSeriesCollection.this.pointsInTime = new org.jfree.data.time.Minute[nMoments];
			}else
				if ((org.jfree.data.time.DynamicTimeSeriesCollection.this.timePeriodClass) == (org.jfree.data.time.Hour.class)) {
					org.jfree.data.time.DynamicTimeSeriesCollection.this.pointsInTime = new org.jfree.data.time.Hour[nMoments];
				}
			
		
		org.jfree.data.time.DynamicTimeSeriesCollection.this.workingCalendar = java.util.Calendar.getInstance(zone);
		org.jfree.data.time.DynamicTimeSeriesCollection.this.position = org.jfree.data.time.DynamicTimeSeriesCollection.START;
		org.jfree.data.time.DynamicTimeSeriesCollection.this.domainIsPointsInTime = true;
	}

	public synchronized long setTimeBase(org.jfree.data.time.RegularTimePeriod start) {
		if ((org.jfree.data.time.DynamicTimeSeriesCollection.this.pointsInTime[0]) == null) {
			org.jfree.data.time.DynamicTimeSeriesCollection.this.pointsInTime[0] = start;
			for (int i = 1; i < (org.jfree.data.time.DynamicTimeSeriesCollection.this.historyCount); i++) {
				org.jfree.data.time.DynamicTimeSeriesCollection.this.pointsInTime[i] = org.jfree.data.time.DynamicTimeSeriesCollection.this.pointsInTime[(i - 1)].next();
			}
		}
		long oldestL = org.jfree.data.time.DynamicTimeSeriesCollection.this.pointsInTime[0].getFirstMillisecond(org.jfree.data.time.DynamicTimeSeriesCollection.this.workingCalendar);
		long nextL = org.jfree.data.time.DynamicTimeSeriesCollection.this.pointsInTime[1].getFirstMillisecond(org.jfree.data.time.DynamicTimeSeriesCollection.this.workingCalendar);
		org.jfree.data.time.DynamicTimeSeriesCollection.this.deltaTime = nextL - oldestL;
		org.jfree.data.time.DynamicTimeSeriesCollection.this.oldestAt = 0;
		org.jfree.data.time.DynamicTimeSeriesCollection.this.newestAt = (org.jfree.data.time.DynamicTimeSeriesCollection.this.historyCount) - 1;
		findDomainLimits();
		return org.jfree.data.time.DynamicTimeSeriesCollection.this.deltaTime;
	}

	protected void findDomainLimits() {
		long startL = getOldestTime().getFirstMillisecond(org.jfree.data.time.DynamicTimeSeriesCollection.this.workingCalendar);
		long endL;
		if (org.jfree.data.time.DynamicTimeSeriesCollection.this.domainIsPointsInTime) {
			endL = getNewestTime().getFirstMillisecond(org.jfree.data.time.DynamicTimeSeriesCollection.this.workingCalendar);
		}else {
			endL = getNewestTime().getLastMillisecond(org.jfree.data.time.DynamicTimeSeriesCollection.this.workingCalendar);
		}
		org.jfree.data.time.DynamicTimeSeriesCollection.this.domainStart = new java.lang.Long(startL);
		org.jfree.data.time.DynamicTimeSeriesCollection.this.domainEnd = new java.lang.Long(endL);
		org.jfree.data.time.DynamicTimeSeriesCollection.this.domainRange = new org.jfree.data.Range(startL, endL);
	}

	public int getPosition() {
		return org.jfree.data.time.DynamicTimeSeriesCollection.this.position;
	}

	public void setPosition(int position) {
		org.jfree.data.time.DynamicTimeSeriesCollection.this.position = position;
	}

	public void addSeries(float[] values, int seriesNumber, java.lang.Comparable seriesKey) {
		invalidateRangeInfo();
		int i;
		if (values == null) {
			throw new java.lang.IllegalArgumentException(("TimeSeriesDataset.addSeries(): " + "cannot add null array of values."));
		}
		if (seriesNumber >= (org.jfree.data.time.DynamicTimeSeriesCollection.this.valueHistory.length)) {
			throw new java.lang.IllegalArgumentException(("TimeSeriesDataset.addSeries(): " + "cannot add more series than specified in c'tor"));
		}
		if ((org.jfree.data.time.DynamicTimeSeriesCollection.this.valueHistory[seriesNumber]) == null) {
			org.jfree.data.time.DynamicTimeSeriesCollection.this.valueHistory[seriesNumber] = new org.jfree.data.time.DynamicTimeSeriesCollection.ValueSequence(org.jfree.data.time.DynamicTimeSeriesCollection.this.historyCount);
			(org.jfree.data.time.DynamicTimeSeriesCollection.this.seriesCount)++;
		}
		int srcLength = values.length;
		int copyLength = org.jfree.data.time.DynamicTimeSeriesCollection.this.historyCount;
		boolean fillNeeded = false;
		if (srcLength < (org.jfree.data.time.DynamicTimeSeriesCollection.this.historyCount)) {
			fillNeeded = true;
			copyLength = srcLength;
		}
		for (i = 0; i < copyLength; i++) {
			org.jfree.data.time.DynamicTimeSeriesCollection.this.valueHistory[seriesNumber].enterData(i, values[i]);
		}
		if (fillNeeded) {
			for (i = copyLength; i < (org.jfree.data.time.DynamicTimeSeriesCollection.this.historyCount); i++) {
				org.jfree.data.time.DynamicTimeSeriesCollection.this.valueHistory[seriesNumber].enterData(i, 0.0F);
			}
		}
		if (seriesKey != null) {
			org.jfree.data.time.DynamicTimeSeriesCollection.this.seriesKeys[seriesNumber] = seriesKey;
		}
		fireSeriesChanged();
	}

	public void setSeriesKey(int seriesNumber, java.lang.Comparable key) {
		org.jfree.data.time.DynamicTimeSeriesCollection.this.seriesKeys[seriesNumber] = key;
	}

	public void addValue(int seriesNumber, int index, float value) {
		invalidateRangeInfo();
		if (seriesNumber >= (org.jfree.data.time.DynamicTimeSeriesCollection.this.valueHistory.length)) {
			throw new java.lang.IllegalArgumentException((("TimeSeriesDataset.addValue(): series #" + seriesNumber) + "unspecified in c'tor"));
		}
		if ((org.jfree.data.time.DynamicTimeSeriesCollection.this.valueHistory[seriesNumber]) == null) {
			org.jfree.data.time.DynamicTimeSeriesCollection.this.valueHistory[seriesNumber] = new org.jfree.data.time.DynamicTimeSeriesCollection.ValueSequence(org.jfree.data.time.DynamicTimeSeriesCollection.this.historyCount);
			(org.jfree.data.time.DynamicTimeSeriesCollection.this.seriesCount)++;
		}
		org.jfree.data.time.DynamicTimeSeriesCollection.this.valueHistory[seriesNumber].enterData(index, value);
		fireSeriesChanged();
	}

	public int getSeriesCount() {
		return org.jfree.data.time.DynamicTimeSeriesCollection.this.seriesCount;
	}

	public int getItemCount(int series) {
		return org.jfree.data.time.DynamicTimeSeriesCollection.this.historyCount;
	}

	protected int translateGet(int toFetch) {
		if ((org.jfree.data.time.DynamicTimeSeriesCollection.this.oldestAt) == 0) {
			return toFetch;
		}
		int newIndex = toFetch + (org.jfree.data.time.DynamicTimeSeriesCollection.this.oldestAt);
		if (newIndex >= (org.jfree.data.time.DynamicTimeSeriesCollection.this.historyCount)) {
			newIndex -= org.jfree.data.time.DynamicTimeSeriesCollection.this.historyCount;
		}
		return newIndex;
	}

	public int offsetFromNewest(int delta) {
		return wrapOffset(((org.jfree.data.time.DynamicTimeSeriesCollection.this.newestAt) + delta));
	}

	public int offsetFromOldest(int delta) {
		return wrapOffset(((org.jfree.data.time.DynamicTimeSeriesCollection.this.oldestAt) + delta));
	}

	protected int wrapOffset(int protoIndex) {
		int tmp = protoIndex;
		if (tmp >= (org.jfree.data.time.DynamicTimeSeriesCollection.this.historyCount)) {
			tmp -= org.jfree.data.time.DynamicTimeSeriesCollection.this.historyCount;
		}else
			if (tmp < 0) {
				tmp += org.jfree.data.time.DynamicTimeSeriesCollection.this.historyCount;
			}
		
		return tmp;
	}

	public synchronized org.jfree.data.time.RegularTimePeriod advanceTime() {
		org.jfree.data.time.RegularTimePeriod nextInstant = org.jfree.data.time.DynamicTimeSeriesCollection.this.pointsInTime[org.jfree.data.time.DynamicTimeSeriesCollection.this.newestAt].next();
		org.jfree.data.time.DynamicTimeSeriesCollection.this.newestAt = org.jfree.data.time.DynamicTimeSeriesCollection.this.oldestAt;
		boolean extremaChanged = false;
		float oldMax = 0.0F;
		if ((org.jfree.data.time.DynamicTimeSeriesCollection.this.maxValue) != null) {
			oldMax = org.jfree.data.time.DynamicTimeSeriesCollection.this.maxValue.floatValue();
		}
		for (int s = 0; s < (getSeriesCount()); s++) {
			if ((org.jfree.data.time.DynamicTimeSeriesCollection.this.valueHistory[s].getData(org.jfree.data.time.DynamicTimeSeriesCollection.this.oldestAt)) == oldMax) {
				extremaChanged = true;
			}
			if (extremaChanged) {
				break;
			}
		}
		if (extremaChanged) {
			invalidateRangeInfo();
		}
		float wiper = ((float) (0.0));
		for (int s = 0; s < (getSeriesCount()); s++) {
			org.jfree.data.time.DynamicTimeSeriesCollection.this.valueHistory[s].enterData(org.jfree.data.time.DynamicTimeSeriesCollection.this.newestAt, wiper);
		}
		org.jfree.data.time.DynamicTimeSeriesCollection.this.pointsInTime[org.jfree.data.time.DynamicTimeSeriesCollection.this.newestAt] = nextInstant;
		(org.jfree.data.time.DynamicTimeSeriesCollection.this.oldestAt)++;
		if ((org.jfree.data.time.DynamicTimeSeriesCollection.this.oldestAt) >= (org.jfree.data.time.DynamicTimeSeriesCollection.this.historyCount)) {
			org.jfree.data.time.DynamicTimeSeriesCollection.this.oldestAt = 0;
		}
		long startL = org.jfree.data.time.DynamicTimeSeriesCollection.this.domainStart.longValue();
		org.jfree.data.time.DynamicTimeSeriesCollection.this.domainStart = new java.lang.Long((startL + (org.jfree.data.time.DynamicTimeSeriesCollection.this.deltaTime)));
		long endL = org.jfree.data.time.DynamicTimeSeriesCollection.this.domainEnd.longValue();
		org.jfree.data.time.DynamicTimeSeriesCollection.this.domainEnd = new java.lang.Long((endL + (org.jfree.data.time.DynamicTimeSeriesCollection.this.deltaTime)));
		org.jfree.data.time.DynamicTimeSeriesCollection.this.domainRange = new org.jfree.data.Range(startL, endL);
		fireSeriesChanged();
		return nextInstant;
	}

	public void invalidateRangeInfo() {
		org.jfree.data.time.DynamicTimeSeriesCollection.this.maxValue = null;
		org.jfree.data.time.DynamicTimeSeriesCollection.this.valueRange = null;
	}

	protected double findMaxValue() {
		double max = 0.0F;
		for (int s = 0; s < (getSeriesCount()); s++) {
			for (int i = 0; i < (org.jfree.data.time.DynamicTimeSeriesCollection.this.historyCount); i++) {
				double tmp = getYValue(s, i);
				if (tmp > max) {
					max = tmp;
				}
			}
		}
		return max;
	}

	public int getOldestIndex() {
		return org.jfree.data.time.DynamicTimeSeriesCollection.this.oldestAt;
	}

	public int getNewestIndex() {
		return org.jfree.data.time.DynamicTimeSeriesCollection.this.newestAt;
	}

	public void appendData(float[] newData) {
		int nDataPoints = newData.length;
		if (nDataPoints > (org.jfree.data.time.DynamicTimeSeriesCollection.this.valueHistory.length)) {
			throw new java.lang.IllegalArgumentException("More data than series to put them in");
		}
		int s;
		for (s = 0; s < nDataPoints; s++) {
			if ((org.jfree.data.time.DynamicTimeSeriesCollection.this.valueHistory[s]) == null) {
				org.jfree.data.time.DynamicTimeSeriesCollection.this.valueHistory[s] = new org.jfree.data.time.DynamicTimeSeriesCollection.ValueSequence(org.jfree.data.time.DynamicTimeSeriesCollection.this.historyCount);
			}
			org.jfree.data.time.DynamicTimeSeriesCollection.this.valueHistory[s].enterData(org.jfree.data.time.DynamicTimeSeriesCollection.this.newestAt, newData[s]);
		}
		fireSeriesChanged();
	}

	public void appendData(float[] newData, int insertionIndex, int refresh) {
		int nDataPoints = newData.length;
		if (nDataPoints > (org.jfree.data.time.DynamicTimeSeriesCollection.this.valueHistory.length)) {
			throw new java.lang.IllegalArgumentException(("More data than series to put them " + "in"));
		}
		for (int s = 0; s < nDataPoints; s++) {
			if ((org.jfree.data.time.DynamicTimeSeriesCollection.this.valueHistory[s]) == null) {
				org.jfree.data.time.DynamicTimeSeriesCollection.this.valueHistory[s] = new org.jfree.data.time.DynamicTimeSeriesCollection.ValueSequence(org.jfree.data.time.DynamicTimeSeriesCollection.this.historyCount);
			}
			org.jfree.data.time.DynamicTimeSeriesCollection.this.valueHistory[s].enterData(insertionIndex, newData[s]);
		}
		if (refresh > 0) {
			insertionIndex++;
			if ((insertionIndex % refresh) == 0) {
				fireSeriesChanged();
			}
		}
	}

	public org.jfree.data.time.RegularTimePeriod getNewestTime() {
		return org.jfree.data.time.DynamicTimeSeriesCollection.this.pointsInTime[org.jfree.data.time.DynamicTimeSeriesCollection.this.newestAt];
	}

	public org.jfree.data.time.RegularTimePeriod getOldestTime() {
		return org.jfree.data.time.DynamicTimeSeriesCollection.this.pointsInTime[org.jfree.data.time.DynamicTimeSeriesCollection.this.oldestAt];
	}

	public java.lang.Number getX(int series, int item) {
		org.jfree.data.time.RegularTimePeriod tp = org.jfree.data.time.DynamicTimeSeriesCollection.this.pointsInTime[translateGet(item)];
		return new java.lang.Long(getX(tp));
	}

	public double getYValue(int series, int item) {
		org.jfree.data.time.DynamicTimeSeriesCollection.ValueSequence values = org.jfree.data.time.DynamicTimeSeriesCollection.this.valueHistory[series];
		return values.getData(translateGet(item));
	}

	public java.lang.Number getY(int series, int item) {
		return new java.lang.Float(getYValue(series, item));
	}

	public java.lang.Number getStartX(int series, int item) {
		org.jfree.data.time.RegularTimePeriod tp = org.jfree.data.time.DynamicTimeSeriesCollection.this.pointsInTime[translateGet(item)];
		return new java.lang.Long(tp.getFirstMillisecond(org.jfree.data.time.DynamicTimeSeriesCollection.this.workingCalendar));
	}

	public java.lang.Number getEndX(int series, int item) {
		org.jfree.data.time.RegularTimePeriod tp = org.jfree.data.time.DynamicTimeSeriesCollection.this.pointsInTime[translateGet(item)];
		return new java.lang.Long(tp.getLastMillisecond(org.jfree.data.time.DynamicTimeSeriesCollection.this.workingCalendar));
	}

	public java.lang.Number getStartY(int series, int item) {
		return getY(series, item);
	}

	public java.lang.Number getEndY(int series, int item) {
		return getY(series, item);
	}

	public java.lang.Comparable getSeriesKey(int series) {
		return org.jfree.data.time.DynamicTimeSeriesCollection.this.seriesKeys[series];
	}

	protected void fireSeriesChanged() {
		seriesChanged(new org.jfree.data.general.SeriesChangeEvent(org.jfree.data.time.DynamicTimeSeriesCollection.this));
	}

	public double getDomainLowerBound(boolean includeInterval) {
		return org.jfree.data.time.DynamicTimeSeriesCollection.this.domainStart.doubleValue();
	}

	public double getDomainUpperBound(boolean includeInterval) {
		return org.jfree.data.time.DynamicTimeSeriesCollection.this.domainEnd.doubleValue();
	}

	public org.jfree.data.Range getDomainBounds(boolean includeInterval) {
		if ((org.jfree.data.time.DynamicTimeSeriesCollection.this.domainRange) == null) {
			findDomainLimits();
		}
		return org.jfree.data.time.DynamicTimeSeriesCollection.this.domainRange;
	}

	private long getX(org.jfree.data.time.RegularTimePeriod period) {
		switch (org.jfree.data.time.DynamicTimeSeriesCollection.this.position) {
			case org.jfree.data.time.DynamicTimeSeriesCollection.START :
				return period.getFirstMillisecond(org.jfree.data.time.DynamicTimeSeriesCollection.this.workingCalendar);
			case org.jfree.data.time.DynamicTimeSeriesCollection.MIDDLE :
				return period.getMiddleMillisecond(org.jfree.data.time.DynamicTimeSeriesCollection.this.workingCalendar);
			case org.jfree.data.time.DynamicTimeSeriesCollection.END :
				return period.getLastMillisecond(org.jfree.data.time.DynamicTimeSeriesCollection.this.workingCalendar);
			default :
				return period.getMiddleMillisecond(org.jfree.data.time.DynamicTimeSeriesCollection.this.workingCalendar);
		}
	}

	public double getRangeLowerBound(boolean includeInterval) {
		double result = java.lang.Double.NaN;
		if ((org.jfree.data.time.DynamicTimeSeriesCollection.this.minValue) != null) {
			result = org.jfree.data.time.DynamicTimeSeriesCollection.this.minValue.doubleValue();
		}
		return result;
	}

	public double getRangeUpperBound(boolean includeInterval) {
		double result = java.lang.Double.NaN;
		if ((org.jfree.data.time.DynamicTimeSeriesCollection.this.maxValue) != null) {
			result = org.jfree.data.time.DynamicTimeSeriesCollection.this.maxValue.doubleValue();
		}
		return result;
	}

	public org.jfree.data.Range getRangeBounds(boolean includeInterval) {
		if ((org.jfree.data.time.DynamicTimeSeriesCollection.this.valueRange) == null) {
			double max = getRangeUpperBound(includeInterval);
			org.jfree.data.time.DynamicTimeSeriesCollection.this.valueRange = new org.jfree.data.Range(0.0, max);
		}
		return org.jfree.data.time.DynamicTimeSeriesCollection.this.valueRange;
	}
}


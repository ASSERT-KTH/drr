



package org.jfree.data.xy;


public class DefaultWindDataset extends org.jfree.data.xy.AbstractXYDataset implements org.jfree.chart.util.PublicCloneable , org.jfree.data.xy.WindDataset {
	private java.util.List seriesKeys;

	private java.util.List allSeriesData;

	public DefaultWindDataset() {
		org.jfree.data.xy.DefaultWindDataset.this.seriesKeys = new java.util.ArrayList();
		org.jfree.data.xy.DefaultWindDataset.this.allSeriesData = new java.util.ArrayList();
	}

	public DefaultWindDataset(java.lang.Object[][][] data) {
		this(org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(data), data);
	}

	public DefaultWindDataset(java.lang.String[] seriesNames, java.lang.Object[][][] data) {
		this(java.util.Arrays.asList(seriesNames), data);
	}

	public DefaultWindDataset(java.util.List seriesKeys, java.lang.Object[][][] data) {
		if (seriesKeys == null) {
			throw new java.lang.IllegalArgumentException("Null 'seriesKeys' argument.");
		}
		if ((seriesKeys.size()) != (data.length)) {
			throw new java.lang.IllegalArgumentException(("The number of series keys does " + "not match the number of series in the data array."));
		}
		org.jfree.data.xy.DefaultWindDataset.this.seriesKeys = seriesKeys;
		int seriesCount = data.length;
		org.jfree.data.xy.DefaultWindDataset.this.allSeriesData = new java.util.ArrayList(seriesCount);
		for (int seriesIndex = 0; seriesIndex < seriesCount; seriesIndex++) {
			java.util.List oneSeriesData = new java.util.ArrayList();
			int maxItemCount = data[seriesIndex].length;
			for (int itemIndex = 0; itemIndex < maxItemCount; itemIndex++) {
				java.lang.Object xObject = data[seriesIndex][itemIndex][0];
				if (xObject != null) {
					java.lang.Number xNumber;
					if (xObject instanceof java.lang.Number) {
						xNumber = ((java.lang.Number) (xObject));
					}else {
						if (xObject instanceof java.util.Date) {
							java.util.Date xDate = ((java.util.Date) (xObject));
							xNumber = new java.lang.Long(xDate.getTime());
						}else {
							xNumber = new java.lang.Integer(0);
						}
					}
					java.lang.Number windDir = ((java.lang.Number) (data[seriesIndex][itemIndex][1]));
					java.lang.Number windForce = ((java.lang.Number) (data[seriesIndex][itemIndex][2]));
					oneSeriesData.add(new org.jfree.data.xy.WindDataItem(xNumber, windDir, windForce));
				}
			}
			java.util.Collections.sort(oneSeriesData);
			org.jfree.data.xy.DefaultWindDataset.this.allSeriesData.add(seriesIndex, oneSeriesData);
		}
	}

	public int getSeriesCount() {
		return org.jfree.data.xy.DefaultWindDataset.this.allSeriesData.size();
	}

	public int getItemCount(int series) {
		if ((series < 0) || (series >= (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException(("Invalid series index: " + series));
		}
		java.util.List oneSeriesData = ((java.util.List) (org.jfree.data.xy.DefaultWindDataset.this.allSeriesData.get(series)));
		return oneSeriesData.size();
	}

	public java.lang.Comparable getSeriesKey(int series) {
		if ((series < 0) || (series >= (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException(("Invalid series index: " + series));
		}
		return ((java.lang.Comparable) (org.jfree.data.xy.DefaultWindDataset.this.seriesKeys.get(series)));
	}

	public java.lang.Number getX(int series, int item) {
		java.util.List oneSeriesData = ((java.util.List) (org.jfree.data.xy.DefaultWindDataset.this.allSeriesData.get(series)));
		org.jfree.data.xy.WindDataItem windItem = ((org.jfree.data.xy.WindDataItem) (oneSeriesData.get(item)));
		return windItem.getX();
	}

	public java.lang.Number getY(int series, int item) {
		return getWindForce(series, item);
	}

	public java.lang.Number getWindDirection(int series, int item) {
		java.util.List oneSeriesData = ((java.util.List) (org.jfree.data.xy.DefaultWindDataset.this.allSeriesData.get(series)));
		org.jfree.data.xy.WindDataItem windItem = ((org.jfree.data.xy.WindDataItem) (oneSeriesData.get(item)));
		return windItem.getWindDirection();
	}

	public java.lang.Number getWindForce(int series, int item) {
		java.util.List oneSeriesData = ((java.util.List) (org.jfree.data.xy.DefaultWindDataset.this.allSeriesData.get(series)));
		org.jfree.data.xy.WindDataItem windItem = ((org.jfree.data.xy.WindDataItem) (oneSeriesData.get(item)));
		return windItem.getWindForce();
	}

	public static java.util.List seriesNameListFromDataArray(java.lang.Object[][] data) {
		int seriesCount = data.length;
		java.util.List seriesNameList = new java.util.ArrayList(seriesCount);
		for (int i = 0; i < seriesCount; i++) {
			seriesNameList.add(("Series " + (i + 1)));
		}
		return seriesNameList;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.data.xy.DefaultWindDataset.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.xy.DefaultWindDataset)) {
			return false;
		}
		org.jfree.data.xy.DefaultWindDataset that = ((org.jfree.data.xy.DefaultWindDataset) (obj));
		if (!(org.jfree.data.xy.DefaultWindDataset.this.seriesKeys.equals(that.seriesKeys))) {
			return false;
		}
		if (!(org.jfree.data.xy.DefaultWindDataset.this.allSeriesData.equals(that.allSeriesData))) {
			return false;
		}
		return true;
	}
}

class WindDataItem implements java.io.Serializable , java.lang.Comparable {
	private java.lang.Number x;

	private java.lang.Number windDir;

	private java.lang.Number windForce;

	public WindDataItem(java.lang.Number x, java.lang.Number windDir, java.lang.Number windForce) {
		org.jfree.data.xy.WindDataItem.this.x = x;
		org.jfree.data.xy.WindDataItem.this.windDir = windDir;
		org.jfree.data.xy.WindDataItem.this.windForce = windForce;
	}

	public java.lang.Number getX() {
		return org.jfree.data.xy.WindDataItem.this.x;
	}

	public java.lang.Number getWindDirection() {
		return org.jfree.data.xy.WindDataItem.this.windDir;
	}

	public java.lang.Number getWindForce() {
		return org.jfree.data.xy.WindDataItem.this.windForce;
	}

	public int compareTo(java.lang.Object object) {
		if (object instanceof org.jfree.data.xy.WindDataItem) {
			org.jfree.data.xy.WindDataItem item = ((org.jfree.data.xy.WindDataItem) (object));
			if ((org.jfree.data.xy.WindDataItem.this.x.doubleValue()) > (item.x.doubleValue())) {
				return 1;
			}else
				if (org.jfree.data.xy.WindDataItem.this.x.equals(item.x)) {
					return 0;
				}else {
					return -1;
				}
			
		}else {
			throw new java.lang.ClassCastException("WindDataItem.compareTo(error)");
		}
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.data.xy.WindDataItem.this) == obj) {
			return false;
		}
		if (!(obj instanceof org.jfree.data.xy.WindDataItem)) {
			return false;
		}
		org.jfree.data.xy.WindDataItem that = ((org.jfree.data.xy.WindDataItem) (obj));
		if (!(org.jfree.data.xy.WindDataItem.this.x.equals(that.x))) {
			return false;
		}
		if (!(org.jfree.data.xy.WindDataItem.this.windDir.equals(that.windDir))) {
			return false;
		}
		if (!(org.jfree.data.xy.WindDataItem.this.windForce.equals(that.windForce))) {
			return false;
		}
		return true;
	}
}


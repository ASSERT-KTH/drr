

package org.jfree.chart.urls;


public class TimeSeriesURLGenerator implements java.io.Serializable , org.jfree.chart.urls.XYURLGenerator {
	private static final long serialVersionUID = -9122773175671182445L;

	private java.text.DateFormat dateFormat = java.text.DateFormat.getInstance();

	private java.lang.String prefix = "index.html";

	private java.lang.String seriesParameterName = "series";

	private java.lang.String itemParameterName = "item";

	public TimeSeriesURLGenerator() {
		super();
	}

	public TimeSeriesURLGenerator(java.text.DateFormat dateFormat, java.lang.String prefix, java.lang.String seriesParameterName, java.lang.String itemParameterName) {
		if (dateFormat == null) {
			throw new java.lang.IllegalArgumentException("Null 'dateFormat' argument.");
		}
		if (prefix == null) {
			throw new java.lang.IllegalArgumentException("Null 'prefix' argument.");
		}
		if (seriesParameterName == null) {
			throw new java.lang.IllegalArgumentException("Null 'seriesParameterName' argument.");
		}
		if (itemParameterName == null) {
			throw new java.lang.IllegalArgumentException("Null 'itemParameterName' argument.");
		}
		org.jfree.chart.urls.TimeSeriesURLGenerator.this.dateFormat = ((java.text.DateFormat) (dateFormat.clone()));
		org.jfree.chart.urls.TimeSeriesURLGenerator.this.prefix = prefix;
		org.jfree.chart.urls.TimeSeriesURLGenerator.this.seriesParameterName = seriesParameterName;
		org.jfree.chart.urls.TimeSeriesURLGenerator.this.itemParameterName = itemParameterName;
	}

	public java.text.DateFormat getDateFormat() {
		return ((java.text.DateFormat) (org.jfree.chart.urls.TimeSeriesURLGenerator.this.dateFormat.clone()));
	}

	public java.lang.String getPrefix() {
		return org.jfree.chart.urls.TimeSeriesURLGenerator.this.prefix;
	}

	public java.lang.String getSeriesParameterName() {
		return org.jfree.chart.urls.TimeSeriesURLGenerator.this.seriesParameterName;
	}

	public java.lang.String getItemParameterName() {
		return org.jfree.chart.urls.TimeSeriesURLGenerator.this.itemParameterName;
	}

	public java.lang.String generateURL(org.jfree.data.xy.XYDataset dataset, int series, int item) {
		java.lang.String result = org.jfree.chart.urls.TimeSeriesURLGenerator.this.prefix;
		boolean firstParameter = (result.indexOf("?")) == (-1);
		java.lang.Comparable seriesKey = dataset.getSeriesKey(series);
		if (seriesKey != null) {
			result += (firstParameter) ? "?" : "&amp;";
			java.lang.String s = null;
			try {
				s = java.net.URLEncoder.encode(seriesKey.toString(), "UTF-8");
			} catch (java.io.UnsupportedEncodingException e) {
				s = seriesKey.toString();
			}
			result += ((org.jfree.chart.urls.TimeSeriesURLGenerator.this.seriesParameterName) + "=") + s;
			firstParameter = false;
		}
		long x = ((long) (dataset.getXValue(series, item)));
		java.lang.String xValue = org.jfree.chart.urls.TimeSeriesURLGenerator.this.dateFormat.format(new java.util.Date(x));
		result += (firstParameter) ? "?" : "&amp;";
		java.lang.String s = null;
		try {
			s = java.net.URLEncoder.encode(xValue, "UTF-8");
		} catch (java.io.UnsupportedEncodingException e) {
			s = xValue;
		}
		result += ((org.jfree.chart.urls.TimeSeriesURLGenerator.this.itemParameterName) + "=") + s;
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.urls.TimeSeriesURLGenerator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.urls.TimeSeriesURLGenerator)) {
			return false;
		}
		org.jfree.chart.urls.TimeSeriesURLGenerator that = ((org.jfree.chart.urls.TimeSeriesURLGenerator) (obj));
		if (!(org.jfree.chart.urls.TimeSeriesURLGenerator.this.dateFormat.equals(that.dateFormat))) {
			return false;
		}
		if (!(org.jfree.chart.urls.TimeSeriesURLGenerator.this.itemParameterName.equals(that.itemParameterName))) {
			return false;
		}
		if (!(org.jfree.chart.urls.TimeSeriesURLGenerator.this.prefix.equals(that.prefix))) {
			return false;
		}
		if (!(org.jfree.chart.urls.TimeSeriesURLGenerator.this.seriesParameterName.equals(that.seriesParameterName))) {
			return false;
		}
		return true;
	}
}


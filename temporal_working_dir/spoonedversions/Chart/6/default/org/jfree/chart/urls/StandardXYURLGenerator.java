

package org.jfree.chart.urls;


public class StandardXYURLGenerator implements java.io.Serializable , org.jfree.chart.urls.XYURLGenerator {
	private static final long serialVersionUID = -1771624523496595382L;

	public static final java.lang.String DEFAULT_PREFIX = "index.html";

	public static final java.lang.String DEFAULT_SERIES_PARAMETER = "series";

	public static final java.lang.String DEFAULT_ITEM_PARAMETER = "item";

	private java.lang.String prefix;

	private java.lang.String seriesParameterName;

	private java.lang.String itemParameterName;

	public StandardXYURLGenerator() {
		this(org.jfree.chart.urls.StandardXYURLGenerator.DEFAULT_PREFIX, org.jfree.chart.urls.StandardXYURLGenerator.DEFAULT_SERIES_PARAMETER, org.jfree.chart.urls.StandardXYURLGenerator.DEFAULT_ITEM_PARAMETER);
	}

	public StandardXYURLGenerator(java.lang.String prefix) {
		this(prefix, org.jfree.chart.urls.StandardXYURLGenerator.DEFAULT_SERIES_PARAMETER, org.jfree.chart.urls.StandardXYURLGenerator.DEFAULT_ITEM_PARAMETER);
	}

	public StandardXYURLGenerator(java.lang.String prefix, java.lang.String seriesParameterName, java.lang.String itemParameterName) {
		if (prefix == null) {
			throw new java.lang.IllegalArgumentException("Null 'prefix' argument.");
		}
		if (seriesParameterName == null) {
			throw new java.lang.IllegalArgumentException("Null 'seriesParameterName' argument.");
		}
		if (itemParameterName == null) {
			throw new java.lang.IllegalArgumentException("Null 'itemParameterName' argument.");
		}
		org.jfree.chart.urls.StandardXYURLGenerator.this.prefix = prefix;
		org.jfree.chart.urls.StandardXYURLGenerator.this.seriesParameterName = seriesParameterName;
		org.jfree.chart.urls.StandardXYURLGenerator.this.itemParameterName = itemParameterName;
	}

	public java.lang.String generateURL(org.jfree.data.xy.XYDataset dataset, int series, int item) {
		java.lang.String url = org.jfree.chart.urls.StandardXYURLGenerator.this.prefix;
		boolean firstParameter = (url.indexOf("?")) == (-1);
		url += (firstParameter) ? "?" : "&amp;";
		url += ((((((org.jfree.chart.urls.StandardXYURLGenerator.this.seriesParameterName) + "=") + series) + "&amp;") + (org.jfree.chart.urls.StandardXYURLGenerator.this.itemParameterName)) + "=") + item;
		return url;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.urls.StandardXYURLGenerator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.urls.StandardXYURLGenerator)) {
			return false;
		}
		org.jfree.chart.urls.StandardXYURLGenerator that = ((org.jfree.chart.urls.StandardXYURLGenerator) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(that.prefix, org.jfree.chart.urls.StandardXYURLGenerator.this.prefix))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(that.seriesParameterName, org.jfree.chart.urls.StandardXYURLGenerator.this.seriesParameterName))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(that.itemParameterName, org.jfree.chart.urls.StandardXYURLGenerator.this.itemParameterName))) {
			return false;
		}
		return true;
	}
}


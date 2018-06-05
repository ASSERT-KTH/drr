

package org.jfree.chart.urls;


public class StandardCategoryURLGenerator implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.urls.CategoryURLGenerator {
	private static final long serialVersionUID = 2276668053074881909L;

	private java.lang.String prefix = "index.html";

	private java.lang.String seriesParameterName = "series";

	private java.lang.String categoryParameterName = "category";

	public StandardCategoryURLGenerator() {
		super();
	}

	public StandardCategoryURLGenerator(java.lang.String prefix) {
		if (prefix == null) {
			throw new java.lang.IllegalArgumentException("Null 'prefix' argument.");
		}
		org.jfree.chart.urls.StandardCategoryURLGenerator.this.prefix = prefix;
	}

	public StandardCategoryURLGenerator(java.lang.String prefix, java.lang.String seriesParameterName, java.lang.String categoryParameterName) {
		if (prefix == null) {
			throw new java.lang.IllegalArgumentException("Null 'prefix' argument.");
		}
		if (seriesParameterName == null) {
			throw new java.lang.IllegalArgumentException("Null 'seriesParameterName' argument.");
		}
		if (categoryParameterName == null) {
			throw new java.lang.IllegalArgumentException("Null 'categoryParameterName' argument.");
		}
		org.jfree.chart.urls.StandardCategoryURLGenerator.this.prefix = prefix;
		org.jfree.chart.urls.StandardCategoryURLGenerator.this.seriesParameterName = seriesParameterName;
		org.jfree.chart.urls.StandardCategoryURLGenerator.this.categoryParameterName = categoryParameterName;
	}

	public java.lang.String generateURL(org.jfree.data.category.CategoryDataset dataset, int series, int category) {
		java.lang.String url = org.jfree.chart.urls.StandardCategoryURLGenerator.this.prefix;
		java.lang.Comparable seriesKey = dataset.getRowKey(series);
		java.lang.Comparable categoryKey = dataset.getColumnKey(category);
		boolean firstParameter = (url.indexOf("?")) == (-1);
		url += (firstParameter) ? "?" : "&amp;";
		url += (org.jfree.chart.urls.StandardCategoryURLGenerator.this.seriesParameterName) + "=";
		java.lang.String seriesKeyStr = null;
		try {
			seriesKeyStr = java.net.URLEncoder.encode(seriesKey.toString(), "UTF-8");
		} catch (java.io.UnsupportedEncodingException e) {
			seriesKeyStr = seriesKey.toString();
		}
		java.lang.String categoryKeyStr = null;
		try {
			categoryKeyStr = java.net.URLEncoder.encode(categoryKey.toString(), "UTF-8");
		} catch (java.io.UnsupportedEncodingException e) {
			categoryKeyStr = categoryKey.toString();
		}
		url += (((seriesKeyStr + "&amp;") + (org.jfree.chart.urls.StandardCategoryURLGenerator.this.categoryParameterName)) + "=") + categoryKeyStr;
		return url;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.urls.StandardCategoryURLGenerator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.urls.StandardCategoryURLGenerator)) {
			return false;
		}
		org.jfree.chart.urls.StandardCategoryURLGenerator that = ((org.jfree.chart.urls.StandardCategoryURLGenerator) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.urls.StandardCategoryURLGenerator.this.prefix, that.prefix))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.urls.StandardCategoryURLGenerator.this.seriesParameterName, that.seriesParameterName))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.urls.StandardCategoryURLGenerator.this.categoryParameterName, that.categoryParameterName))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result;
		result = ((org.jfree.chart.urls.StandardCategoryURLGenerator.this.prefix) != null) ? org.jfree.chart.urls.StandardCategoryURLGenerator.this.prefix.hashCode() : 0;
		result = (29 * result) + ((org.jfree.chart.urls.StandardCategoryURLGenerator.this.seriesParameterName) != null ? org.jfree.chart.urls.StandardCategoryURLGenerator.this.seriesParameterName.hashCode() : 0);
		result = (29 * result) + ((org.jfree.chart.urls.StandardCategoryURLGenerator.this.categoryParameterName) != null ? org.jfree.chart.urls.StandardCategoryURLGenerator.this.categoryParameterName.hashCode() : 0);
		return result;
	}
}


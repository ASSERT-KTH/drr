

package org.jfree.chart.urls;


public class StandardPieURLGenerator implements java.io.Serializable , org.jfree.chart.urls.PieURLGenerator {
	private static final long serialVersionUID = 1626966402065883419L;

	private java.lang.String prefix = "index.html";

	private java.lang.String categoryParameterName = "category";

	private java.lang.String indexParameterName = "pieIndex";

	public StandardPieURLGenerator() {
		this("index.html");
	}

	public StandardPieURLGenerator(java.lang.String prefix) {
		this(prefix, "category");
	}

	public StandardPieURLGenerator(java.lang.String prefix, java.lang.String categoryParameterName) {
		this(prefix, categoryParameterName, "pieIndex");
	}

	public StandardPieURLGenerator(java.lang.String prefix, java.lang.String categoryParameterName, java.lang.String indexParameterName) {
		if (prefix == null) {
			throw new java.lang.IllegalArgumentException("Null 'prefix' argument.");
		}
		if (categoryParameterName == null) {
			throw new java.lang.IllegalArgumentException("Null 'categoryParameterName' argument.");
		}
		org.jfree.chart.urls.StandardPieURLGenerator.this.prefix = prefix;
		org.jfree.chart.urls.StandardPieURLGenerator.this.categoryParameterName = categoryParameterName;
		org.jfree.chart.urls.StandardPieURLGenerator.this.indexParameterName = indexParameterName;
	}

	public java.lang.String generateURL(org.jfree.data.pie.PieDataset dataset, java.lang.Comparable key, int pieIndex) {
		java.lang.String url = org.jfree.chart.urls.StandardPieURLGenerator.this.prefix;
		java.lang.String encodedKey = null;
		try {
			encodedKey = java.net.URLEncoder.encode(key.toString(), "UTF-8");
		} catch (java.io.UnsupportedEncodingException e) {
			encodedKey = key.toString();
		}
		if ((url.indexOf("?")) > (-1)) {
			url += (("&amp;" + (org.jfree.chart.urls.StandardPieURLGenerator.this.categoryParameterName)) + "=") + encodedKey;
		}else {
			url += (("?" + (org.jfree.chart.urls.StandardPieURLGenerator.this.categoryParameterName)) + "=") + encodedKey;
		}
		if ((org.jfree.chart.urls.StandardPieURLGenerator.this.indexParameterName) != null) {
			url += (("&amp;" + (org.jfree.chart.urls.StandardPieURLGenerator.this.indexParameterName)) + "=") + (java.lang.String.valueOf(pieIndex));
		}
		return url;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.urls.StandardPieURLGenerator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.urls.StandardPieURLGenerator)) {
			return false;
		}
		org.jfree.chart.urls.StandardPieURLGenerator that = ((org.jfree.chart.urls.StandardPieURLGenerator) (obj));
		if (!(org.jfree.chart.urls.StandardPieURLGenerator.this.prefix.equals(that.prefix))) {
			return false;
		}
		if (!(org.jfree.chart.urls.StandardPieURLGenerator.this.categoryParameterName.equals(that.categoryParameterName))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.urls.StandardPieURLGenerator.this.indexParameterName, that.indexParameterName))) {
			return false;
		}
		return true;
	}
}




package org.jfree.chart.urls;


public class CustomCategoryURLGenerator implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.urls.CategoryURLGenerator , org.jfree.chart.util.PublicCloneable {
	private java.util.ArrayList urlSeries = new java.util.ArrayList();

	public CustomCategoryURLGenerator() {
		super();
	}

	public int getListCount() {
		return org.jfree.chart.urls.CustomCategoryURLGenerator.this.urlSeries.size();
	}

	public int getURLCount(int list) {
		int result = 0;
		java.util.List urls = ((java.util.List) (org.jfree.chart.urls.CustomCategoryURLGenerator.this.urlSeries.get(list)));
		if (urls != null) {
			result = urls.size();
		}
		return result;
	}

	public java.lang.String getURL(int series, int item) {
		java.lang.String result = null;
		if (series < (getListCount())) {
			java.util.List urls = ((java.util.List) (org.jfree.chart.urls.CustomCategoryURLGenerator.this.urlSeries.get(series)));
			if (urls != null) {
				if (item < (urls.size())) {
					result = ((java.lang.String) (urls.get(item)));
				}
			}
		}
		return result;
	}

	public java.lang.String generateURL(org.jfree.data.category.CategoryDataset dataset, int series, int item) {
		return getURL(series, item);
	}

	public void addURLSeries(java.util.List urls) {
		java.util.List listToAdd = null;
		if (urls != null) {
			listToAdd = new java.util.ArrayList(urls);
		}
		org.jfree.chart.urls.CustomCategoryURLGenerator.this.urlSeries.add(listToAdd);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.urls.CustomCategoryURLGenerator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.urls.CustomCategoryURLGenerator)) {
			return false;
		}
		org.jfree.chart.urls.CustomCategoryURLGenerator generator = ((org.jfree.chart.urls.CustomCategoryURLGenerator) (obj));
		int listCount = getListCount();
		if (listCount != (generator.getListCount())) {
			return false;
		}
		for (int series = 0; series < listCount; series++) {
			int urlCount = getURLCount(series);
			if (urlCount != (generator.getURLCount(series))) {
				return false;
			}
			for (int item = 0; item < urlCount; item++) {
				java.lang.String u1 = getURL(series, item);
				java.lang.String u2 = generator.getURL(series, item);
				if (u1 != null) {
					if (!(u1.equals(u2))) {
						return false;
					}
				}else {
					if (u2 != null) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.urls.CustomCategoryURLGenerator clone = ((org.jfree.chart.urls.CustomCategoryURLGenerator) (super.clone()));
		clone.urlSeries = new java.util.ArrayList(org.jfree.chart.urls.CustomCategoryURLGenerator.this.urlSeries);
		return clone;
	}
}




package org.jfree.chart.urls;


public class CustomPieURLGenerator implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.urls.PieURLGenerator , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 7100607670144900503L;

	private java.util.ArrayList urls;

	public CustomPieURLGenerator() {
		org.jfree.chart.urls.CustomPieURLGenerator.this.urls = new java.util.ArrayList();
	}

	public java.lang.String generateURL(org.jfree.data.general.PieDataset dataset, java.lang.Comparable key, int pieIndex) {
		return getURL(key, pieIndex);
	}

	public int getListCount() {
		return org.jfree.chart.urls.CustomPieURLGenerator.this.urls.size();
	}

	public int getURLCount(int list) {
		int result = 0;
		java.util.Map urlMap = ((java.util.Map) (org.jfree.chart.urls.CustomPieURLGenerator.this.urls.get(list)));
		if (urlMap != null) {
			result = urlMap.size();
		}
		return result;
	}

	public java.lang.String getURL(java.lang.Comparable key, int mapIndex) {
		java.lang.String result = null;
		if (mapIndex < (getListCount())) {
			java.util.Map urlMap = ((java.util.Map) (org.jfree.chart.urls.CustomPieURLGenerator.this.urls.get(mapIndex)));
			if (urlMap != null) {
				result = ((java.lang.String) (urlMap.get(key)));
			}
		}
		return result;
	}

	public void addURLs(java.util.Map urlMap) {
		org.jfree.chart.urls.CustomPieURLGenerator.this.urls.add(urlMap);
	}

	public boolean equals(java.lang.Object o) {
		if (o == (org.jfree.chart.urls.CustomPieURLGenerator.this)) {
			return true;
		}
		if (o instanceof org.jfree.chart.urls.CustomPieURLGenerator) {
			org.jfree.chart.urls.CustomPieURLGenerator generator = ((org.jfree.chart.urls.CustomPieURLGenerator) (o));
			if ((getListCount()) != (generator.getListCount())) {
				return false;
			}
			java.util.Set keySet;
			for (int pieItem = 0; pieItem < (getListCount()); pieItem++) {
				if ((getURLCount(pieItem)) != (generator.getURLCount(pieItem))) {
					return false;
				}
				keySet = ((java.util.HashMap) (org.jfree.chart.urls.CustomPieURLGenerator.this.urls.get(pieItem))).keySet();
				java.lang.String key;
				for (java.util.Iterator i = keySet.iterator(); i.hasNext();) {
					key = ((java.lang.String) (i.next()));
					if (!(getURL(key, pieItem).equals(generator.getURL(key, pieItem)))) {
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.urls.CustomPieURLGenerator urlGen = new org.jfree.chart.urls.CustomPieURLGenerator();
		java.util.Map map;
		java.util.Map newMap;
		java.lang.String key;
		for (java.util.Iterator i = org.jfree.chart.urls.CustomPieURLGenerator.this.urls.iterator(); i.hasNext();) {
			map = ((java.util.Map) (i.next()));
			newMap = new java.util.HashMap();
			for (java.util.Iterator j = map.keySet().iterator(); j.hasNext();) {
				key = ((java.lang.String) (j.next()));
				newMap.put(key, map.get(key));
			}
			urlGen.addURLs(newMap);
			newMap = null;
		}
		return urlGen;
	}
}


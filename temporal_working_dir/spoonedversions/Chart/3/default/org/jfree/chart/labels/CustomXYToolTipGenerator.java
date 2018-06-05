

package org.jfree.chart.labels;


public class CustomXYToolTipGenerator implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.labels.XYToolTipGenerator , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 8636030004670141362L;

	private java.util.List toolTipSeries = new java.util.ArrayList();

	public CustomXYToolTipGenerator() {
		super();
	}

	public int getListCount() {
		return org.jfree.chart.labels.CustomXYToolTipGenerator.this.toolTipSeries.size();
	}

	public int getToolTipCount(int list) {
		int result = 0;
		java.util.List tooltips = ((java.util.List) (org.jfree.chart.labels.CustomXYToolTipGenerator.this.toolTipSeries.get(list)));
		if (tooltips != null) {
			result = tooltips.size();
		}
		return result;
	}

	public java.lang.String getToolTipText(int series, int item) {
		java.lang.String result = null;
		if (series < (getListCount())) {
			java.util.List tooltips = ((java.util.List) (org.jfree.chart.labels.CustomXYToolTipGenerator.this.toolTipSeries.get(series)));
			if (tooltips != null) {
				if (item < (tooltips.size())) {
					result = ((java.lang.String) (tooltips.get(item)));
				}
			}
		}
		return result;
	}

	public void addToolTipSeries(java.util.List toolTips) {
		org.jfree.chart.labels.CustomXYToolTipGenerator.this.toolTipSeries.add(toolTips);
	}

	public java.lang.String generateToolTip(org.jfree.data.xy.XYDataset data, int series, int item) {
		return getToolTipText(series, item);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.labels.CustomXYToolTipGenerator clone = ((org.jfree.chart.labels.CustomXYToolTipGenerator) (super.clone()));
		if ((org.jfree.chart.labels.CustomXYToolTipGenerator.this.toolTipSeries) != null) {
			clone.toolTipSeries = new java.util.ArrayList(org.jfree.chart.labels.CustomXYToolTipGenerator.this.toolTipSeries);
		}
		return clone;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.labels.CustomXYToolTipGenerator.this)) {
			return true;
		}
		if (obj instanceof org.jfree.chart.labels.CustomXYToolTipGenerator) {
			org.jfree.chart.labels.CustomXYToolTipGenerator generator = ((org.jfree.chart.labels.CustomXYToolTipGenerator) (obj));
			boolean result = true;
			for (int series = 0; series < (getListCount()); series++) {
				for (int item = 0; item < (getToolTipCount(series)); item++) {
					java.lang.String t1 = getToolTipText(series, item);
					java.lang.String t2 = generator.getToolTipText(series, item);
					if (t1 != null) {
						result = result && (t1.equals(t2));
					}else {
						result = result && (t2 == null);
					}
				}
			}
			return result;
		}
		return false;
	}
}


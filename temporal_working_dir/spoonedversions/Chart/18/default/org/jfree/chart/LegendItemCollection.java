

package org.jfree.chart;


public class LegendItemCollection implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = 1365215565589815953L;

	private java.util.List items;

	public LegendItemCollection() {
		org.jfree.chart.LegendItemCollection.this.items = new java.util.ArrayList();
	}

	public void add(org.jfree.chart.LegendItem item) {
		org.jfree.chart.LegendItemCollection.this.items.add(item);
	}

	public void addAll(org.jfree.chart.LegendItemCollection collection) {
		org.jfree.chart.LegendItemCollection.this.items.addAll(collection.items);
	}

	public org.jfree.chart.LegendItem get(int index) {
		return ((org.jfree.chart.LegendItem) (org.jfree.chart.LegendItemCollection.this.items.get(index)));
	}

	public int getItemCount() {
		return org.jfree.chart.LegendItemCollection.this.items.size();
	}

	public java.util.Iterator iterator() {
		return org.jfree.chart.LegendItemCollection.this.items.iterator();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.LegendItemCollection.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.LegendItemCollection)) {
			return false;
		}
		org.jfree.chart.LegendItemCollection that = ((org.jfree.chart.LegendItemCollection) (obj));
		if (!(org.jfree.chart.LegendItemCollection.this.items.equals(that.items))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}


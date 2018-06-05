

package org.jfree.chart.renderer;


public class OutlierListCollection {
	private java.util.List outlierLists;

	private boolean highFarOut = false;

	private boolean lowFarOut = false;

	public OutlierListCollection() {
		org.jfree.chart.renderer.OutlierListCollection.this.outlierLists = new java.util.ArrayList();
	}

	public boolean isHighFarOut() {
		return org.jfree.chart.renderer.OutlierListCollection.this.highFarOut;
	}

	public void setHighFarOut(boolean farOut) {
		org.jfree.chart.renderer.OutlierListCollection.this.highFarOut = farOut;
	}

	public boolean isLowFarOut() {
		return org.jfree.chart.renderer.OutlierListCollection.this.lowFarOut;
	}

	public void setLowFarOut(boolean farOut) {
		org.jfree.chart.renderer.OutlierListCollection.this.lowFarOut = farOut;
	}

	public boolean add(org.jfree.chart.renderer.Outlier outlier) {
		if (org.jfree.chart.renderer.OutlierListCollection.this.outlierLists.isEmpty()) {
			return org.jfree.chart.renderer.OutlierListCollection.this.outlierLists.add(new org.jfree.chart.renderer.OutlierList(outlier));
		}else {
			boolean updated = false;
			for (java.util.Iterator iterator = org.jfree.chart.renderer.OutlierListCollection.this.outlierLists.iterator(); iterator.hasNext();) {
				org.jfree.chart.renderer.OutlierList list = ((org.jfree.chart.renderer.OutlierList) (iterator.next()));
				if (list.isOverlapped(outlier)) {
					updated = updateOutlierList(list, outlier);
				}
			}
			if (!updated) {
				updated = org.jfree.chart.renderer.OutlierListCollection.this.outlierLists.add(new org.jfree.chart.renderer.OutlierList(outlier));
			}
			return updated;
		}
	}

	public java.util.Iterator iterator() {
		return org.jfree.chart.renderer.OutlierListCollection.this.outlierLists.iterator();
	}

	private boolean updateOutlierList(org.jfree.chart.renderer.OutlierList list, org.jfree.chart.renderer.Outlier outlier) {
		boolean result = false;
		result = list.add(outlier);
		list.updateAveragedOutlier();
		list.setMultiple(true);
		return result;
	}
}


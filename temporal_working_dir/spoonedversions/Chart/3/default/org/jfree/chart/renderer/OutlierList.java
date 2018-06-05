

package org.jfree.chart.renderer;


public class OutlierList {
	private java.util.List outliers;

	private org.jfree.chart.renderer.Outlier averagedOutlier;

	private boolean multiple = false;

	public OutlierList(org.jfree.chart.renderer.Outlier outlier) {
		org.jfree.chart.renderer.OutlierList.this.outliers = new java.util.ArrayList();
		setAveragedOutlier(outlier);
	}

	public boolean add(org.jfree.chart.renderer.Outlier outlier) {
		return org.jfree.chart.renderer.OutlierList.this.outliers.add(outlier);
	}

	public int getItemCount() {
		return org.jfree.chart.renderer.OutlierList.this.outliers.size();
	}

	public org.jfree.chart.renderer.Outlier getAveragedOutlier() {
		return org.jfree.chart.renderer.OutlierList.this.averagedOutlier;
	}

	public void setAveragedOutlier(org.jfree.chart.renderer.Outlier averagedOutlier) {
		org.jfree.chart.renderer.OutlierList.this.averagedOutlier = averagedOutlier;
	}

	public boolean isMultiple() {
		return org.jfree.chart.renderer.OutlierList.this.multiple;
	}

	public void setMultiple(boolean multiple) {
		org.jfree.chart.renderer.OutlierList.this.multiple = multiple;
	}

	public boolean isOverlapped(org.jfree.chart.renderer.Outlier other) {
		if (other == null) {
			return false;
		}
		boolean result = other.overlaps(getAveragedOutlier());
		return result;
	}

	public void updateAveragedOutlier() {
		double totalXCoords = 0.0;
		double totalYCoords = 0.0;
		int size = getItemCount();
		for (java.util.Iterator iterator = org.jfree.chart.renderer.OutlierList.this.outliers.iterator(); iterator.hasNext();) {
			org.jfree.chart.renderer.Outlier o = ((org.jfree.chart.renderer.Outlier) (iterator.next()));
			totalXCoords += o.getX();
			totalYCoords += o.getY();
		}
		getAveragedOutlier().getPoint().setLocation(new java.awt.geom.Point2D.Double((totalXCoords / size), (totalYCoords / size)));
	}
}


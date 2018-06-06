

package org.jfree.data.pie;


public class PieDatasetChangeInfo extends org.jfree.chart.event.DatasetChangeInfo {
	private org.jfree.data.pie.PieDatasetChangeType changeType;

	private int index1;

	private int index2;

	public PieDatasetChangeInfo(org.jfree.data.pie.PieDatasetChangeType t, int index1, int index2) {
		org.jfree.data.pie.PieDatasetChangeInfo.this.changeType = t;
		org.jfree.data.pie.PieDatasetChangeInfo.this.index1 = index1;
		org.jfree.data.pie.PieDatasetChangeInfo.this.index2 = index2;
	}

	public org.jfree.data.pie.PieDatasetChangeType getChangeType() {
		return org.jfree.data.pie.PieDatasetChangeInfo.this.changeType;
	}

	public int getIndex1() {
		return org.jfree.data.pie.PieDatasetChangeInfo.this.index1;
	}

	public int getIndex2() {
		return org.jfree.data.pie.PieDatasetChangeInfo.this.index2;
	}
}


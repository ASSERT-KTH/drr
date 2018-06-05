

package org.jfree.data.general;


public class SeriesChangeInfo {
	private org.jfree.data.general.SeriesChangeType changeType;

	private int index1;

	private int index2;

	public SeriesChangeInfo(org.jfree.data.general.SeriesChangeType t, int index1, int index2) {
		org.jfree.data.general.SeriesChangeInfo.this.changeType = t;
		org.jfree.data.general.SeriesChangeInfo.this.index1 = index1;
		org.jfree.data.general.SeriesChangeInfo.this.index2 = index2;
	}

	public org.jfree.data.general.SeriesChangeType getChangeType() {
		return org.jfree.data.general.SeriesChangeInfo.this.changeType;
	}

	public int getIndex1() {
		return org.jfree.data.general.SeriesChangeInfo.this.index1;
	}

	public int getIndex2() {
		return org.jfree.data.general.SeriesChangeInfo.this.index2;
	}
}


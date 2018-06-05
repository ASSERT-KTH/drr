

package org.jfree.data.statistics;


public class HistogramBin implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = 7614685080015589931L;

	private int count;

	private double startBoundary;

	private double endBoundary;

	public HistogramBin(double startBoundary, double endBoundary) {
		if (startBoundary > endBoundary) {
			throw new java.lang.IllegalArgumentException("HistogramBin():  startBoundary > endBoundary.");
		}
		org.jfree.data.statistics.HistogramBin.this.count = 0;
		org.jfree.data.statistics.HistogramBin.this.startBoundary = startBoundary;
		org.jfree.data.statistics.HistogramBin.this.endBoundary = endBoundary;
	}

	public int getCount() {
		return org.jfree.data.statistics.HistogramBin.this.count;
	}

	public void incrementCount() {
		(org.jfree.data.statistics.HistogramBin.this.count)++;
	}

	public double getStartBoundary() {
		return org.jfree.data.statistics.HistogramBin.this.startBoundary;
	}

	public double getEndBoundary() {
		return org.jfree.data.statistics.HistogramBin.this.endBoundary;
	}

	public double getBinWidth() {
		return (org.jfree.data.statistics.HistogramBin.this.endBoundary) - (org.jfree.data.statistics.HistogramBin.this.startBoundary);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == (org.jfree.data.statistics.HistogramBin.this)) {
			return true;
		}
		if (obj instanceof org.jfree.data.statistics.HistogramBin) {
			org.jfree.data.statistics.HistogramBin bin = ((org.jfree.data.statistics.HistogramBin) (obj));
			boolean b0 = (bin.startBoundary) == (org.jfree.data.statistics.HistogramBin.this.startBoundary);
			boolean b1 = (bin.endBoundary) == (org.jfree.data.statistics.HistogramBin.this.endBoundary);
			boolean b2 = (bin.count) == (org.jfree.data.statistics.HistogramBin.this.count);
			return (b0 && b1) && b2;
		}
		return false;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}


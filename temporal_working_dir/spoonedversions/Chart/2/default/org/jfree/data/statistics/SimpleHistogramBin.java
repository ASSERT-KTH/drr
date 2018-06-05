

package org.jfree.data.statistics;


public class SimpleHistogramBin implements java.io.Serializable , java.lang.Cloneable , java.lang.Comparable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 3480862537505941742L;

	private double lowerBound;

	private double upperBound;

	private boolean includeLowerBound;

	private boolean includeUpperBound;

	private int itemCount;

	private boolean selected;

	public SimpleHistogramBin(double lowerBound, double upperBound) {
		this(lowerBound, upperBound, true, true);
	}

	public SimpleHistogramBin(double lowerBound, double upperBound, boolean includeLowerBound, boolean includeUpperBound) {
		if (lowerBound >= upperBound) {
			throw new java.lang.IllegalArgumentException(((("Invalid bounds; " + lowerBound) + " to ") + upperBound));
		}
		org.jfree.data.statistics.SimpleHistogramBin.this.lowerBound = lowerBound;
		org.jfree.data.statistics.SimpleHistogramBin.this.upperBound = upperBound;
		org.jfree.data.statistics.SimpleHistogramBin.this.includeLowerBound = includeLowerBound;
		org.jfree.data.statistics.SimpleHistogramBin.this.includeUpperBound = includeUpperBound;
		org.jfree.data.statistics.SimpleHistogramBin.this.itemCount = 0;
		org.jfree.data.statistics.SimpleHistogramBin.this.selected = false;
	}

	public double getLowerBound() {
		return org.jfree.data.statistics.SimpleHistogramBin.this.lowerBound;
	}

	public double getUpperBound() {
		return org.jfree.data.statistics.SimpleHistogramBin.this.upperBound;
	}

	public int getItemCount() {
		return org.jfree.data.statistics.SimpleHistogramBin.this.itemCount;
	}

	public void setItemCount(int count) {
		org.jfree.data.statistics.SimpleHistogramBin.this.itemCount = count;
	}

	public boolean isSelected() {
		return org.jfree.data.statistics.SimpleHistogramBin.this.selected;
	}

	public void setSelected(boolean selected) {
		org.jfree.data.statistics.SimpleHistogramBin.this.selected = selected;
	}

	public boolean accepts(double value) {
		if (java.lang.Double.isNaN(value)) {
			return false;
		}
		if (value < (org.jfree.data.statistics.SimpleHistogramBin.this.lowerBound)) {
			return false;
		}
		if (value > (org.jfree.data.statistics.SimpleHistogramBin.this.upperBound)) {
			return false;
		}
		if (value == (org.jfree.data.statistics.SimpleHistogramBin.this.lowerBound)) {
			return org.jfree.data.statistics.SimpleHistogramBin.this.includeLowerBound;
		}
		if (value == (org.jfree.data.statistics.SimpleHistogramBin.this.upperBound)) {
			return org.jfree.data.statistics.SimpleHistogramBin.this.includeUpperBound;
		}
		return true;
	}

	public boolean overlapsWith(org.jfree.data.statistics.SimpleHistogramBin bin) {
		if ((org.jfree.data.statistics.SimpleHistogramBin.this.upperBound) < (bin.lowerBound)) {
			return false;
		}
		if ((org.jfree.data.statistics.SimpleHistogramBin.this.lowerBound) > (bin.upperBound)) {
			return false;
		}
		if ((org.jfree.data.statistics.SimpleHistogramBin.this.upperBound) == (bin.lowerBound)) {
			return (org.jfree.data.statistics.SimpleHistogramBin.this.includeUpperBound) && (bin.includeLowerBound);
		}
		if ((org.jfree.data.statistics.SimpleHistogramBin.this.lowerBound) == (bin.upperBound)) {
			return (org.jfree.data.statistics.SimpleHistogramBin.this.includeLowerBound) && (bin.includeUpperBound);
		}
		return true;
	}

	public int compareTo(java.lang.Object obj) {
		if (!(obj instanceof org.jfree.data.statistics.SimpleHistogramBin)) {
			return 0;
		}
		org.jfree.data.statistics.SimpleHistogramBin bin = ((org.jfree.data.statistics.SimpleHistogramBin) (obj));
		if ((org.jfree.data.statistics.SimpleHistogramBin.this.lowerBound) < (bin.lowerBound)) {
			return -1;
		}
		if ((org.jfree.data.statistics.SimpleHistogramBin.this.lowerBound) > (bin.lowerBound)) {
			return 1;
		}
		if ((org.jfree.data.statistics.SimpleHistogramBin.this.upperBound) < (bin.upperBound)) {
			return -1;
		}
		if ((org.jfree.data.statistics.SimpleHistogramBin.this.upperBound) > (bin.upperBound)) {
			return 1;
		}
		return 0;
	}

	public boolean equals(java.lang.Object obj) {
		if (!(obj instanceof org.jfree.data.statistics.SimpleHistogramBin)) {
			return false;
		}
		org.jfree.data.statistics.SimpleHistogramBin that = ((org.jfree.data.statistics.SimpleHistogramBin) (obj));
		if ((org.jfree.data.statistics.SimpleHistogramBin.this.lowerBound) != (that.lowerBound)) {
			return false;
		}
		if ((org.jfree.data.statistics.SimpleHistogramBin.this.upperBound) != (that.upperBound)) {
			return false;
		}
		if ((org.jfree.data.statistics.SimpleHistogramBin.this.includeLowerBound) != (that.includeLowerBound)) {
			return false;
		}
		if ((org.jfree.data.statistics.SimpleHistogramBin.this.includeUpperBound) != (that.includeUpperBound)) {
			return false;
		}
		if ((org.jfree.data.statistics.SimpleHistogramBin.this.itemCount) != (that.itemCount)) {
			return false;
		}
		if ((org.jfree.data.statistics.SimpleHistogramBin.this.selected) != (that.selected)) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}


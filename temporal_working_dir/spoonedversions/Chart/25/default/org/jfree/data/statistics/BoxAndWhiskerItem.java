

package org.jfree.data.statistics;


public class BoxAndWhiskerItem implements java.io.Serializable {
	private static final long serialVersionUID = 7329649623148167423L;

	private java.lang.Number mean;

	private java.lang.Number median;

	private java.lang.Number q1;

	private java.lang.Number q3;

	private java.lang.Number minRegularValue;

	private java.lang.Number maxRegularValue;

	private java.lang.Number minOutlier;

	private java.lang.Number maxOutlier;

	private java.util.List outliers;

	public BoxAndWhiskerItem(java.lang.Number mean, java.lang.Number median, java.lang.Number q1, java.lang.Number q3, java.lang.Number minRegularValue, java.lang.Number maxRegularValue, java.lang.Number minOutlier, java.lang.Number maxOutlier, java.util.List outliers) {
		org.jfree.data.statistics.BoxAndWhiskerItem.this.mean = mean;
		org.jfree.data.statistics.BoxAndWhiskerItem.this.median = median;
		org.jfree.data.statistics.BoxAndWhiskerItem.this.q1 = q1;
		org.jfree.data.statistics.BoxAndWhiskerItem.this.q3 = q3;
		org.jfree.data.statistics.BoxAndWhiskerItem.this.minRegularValue = minRegularValue;
		org.jfree.data.statistics.BoxAndWhiskerItem.this.maxRegularValue = maxRegularValue;
		org.jfree.data.statistics.BoxAndWhiskerItem.this.minOutlier = minOutlier;
		org.jfree.data.statistics.BoxAndWhiskerItem.this.maxOutlier = maxOutlier;
		org.jfree.data.statistics.BoxAndWhiskerItem.this.outliers = outliers;
	}

	public java.lang.Number getMean() {
		return org.jfree.data.statistics.BoxAndWhiskerItem.this.mean;
	}

	public java.lang.Number getMedian() {
		return org.jfree.data.statistics.BoxAndWhiskerItem.this.median;
	}

	public java.lang.Number getQ1() {
		return org.jfree.data.statistics.BoxAndWhiskerItem.this.q1;
	}

	public java.lang.Number getQ3() {
		return org.jfree.data.statistics.BoxAndWhiskerItem.this.q3;
	}

	public java.lang.Number getMinRegularValue() {
		return org.jfree.data.statistics.BoxAndWhiskerItem.this.minRegularValue;
	}

	public java.lang.Number getMaxRegularValue() {
		return org.jfree.data.statistics.BoxAndWhiskerItem.this.maxRegularValue;
	}

	public java.lang.Number getMinOutlier() {
		return org.jfree.data.statistics.BoxAndWhiskerItem.this.minOutlier;
	}

	public java.lang.Number getMaxOutlier() {
		return org.jfree.data.statistics.BoxAndWhiskerItem.this.maxOutlier;
	}

	public java.util.List getOutliers() {
		if ((org.jfree.data.statistics.BoxAndWhiskerItem.this.outliers) == null) {
			return null;
		}
		return java.util.Collections.unmodifiableList(org.jfree.data.statistics.BoxAndWhiskerItem.this.outliers);
	}

	public java.lang.String toString() {
		return (((((((((super.toString()) + "[mean=") + (org.jfree.data.statistics.BoxAndWhiskerItem.this.mean)) + ",median=") + (org.jfree.data.statistics.BoxAndWhiskerItem.this.median)) + ",q1=") + (org.jfree.data.statistics.BoxAndWhiskerItem.this.q1)) + ",q3=") + (org.jfree.data.statistics.BoxAndWhiskerItem.this.q3)) + "]";
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.statistics.BoxAndWhiskerItem.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.statistics.BoxAndWhiskerItem)) {
			return false;
		}
		org.jfree.data.statistics.BoxAndWhiskerItem that = ((org.jfree.data.statistics.BoxAndWhiskerItem) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.statistics.BoxAndWhiskerItem.this.mean, that.mean))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.statistics.BoxAndWhiskerItem.this.median, that.median))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.statistics.BoxAndWhiskerItem.this.q1, that.q1))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.statistics.BoxAndWhiskerItem.this.q3, that.q3))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.statistics.BoxAndWhiskerItem.this.minRegularValue, that.minRegularValue))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.statistics.BoxAndWhiskerItem.this.maxRegularValue, that.maxRegularValue))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.statistics.BoxAndWhiskerItem.this.minOutlier, that.minOutlier))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.statistics.BoxAndWhiskerItem.this.maxOutlier, that.maxOutlier))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.statistics.BoxAndWhiskerItem.this.outliers, that.outliers))) {
			return false;
		}
		return true;
	}
}


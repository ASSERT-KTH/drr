

package org.jfree.data.statistics;


public class MeanAndStandardDeviation implements java.io.Serializable {
	private static final long serialVersionUID = 7413468697315721515L;

	private java.lang.Number mean;

	private java.lang.Number standardDeviation;

	public MeanAndStandardDeviation(double mean, double standardDeviation) {
		this(new java.lang.Double(mean), new java.lang.Double(standardDeviation));
	}

	public MeanAndStandardDeviation(java.lang.Number mean, java.lang.Number standardDeviation) {
		org.jfree.data.statistics.MeanAndStandardDeviation.this.mean = mean;
		org.jfree.data.statistics.MeanAndStandardDeviation.this.standardDeviation = standardDeviation;
	}

	public java.lang.Number getMean() {
		return org.jfree.data.statistics.MeanAndStandardDeviation.this.mean;
	}

	public java.lang.Number getStandardDeviation() {
		return org.jfree.data.statistics.MeanAndStandardDeviation.this.standardDeviation;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.statistics.MeanAndStandardDeviation.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.statistics.MeanAndStandardDeviation)) {
			return false;
		}
		org.jfree.data.statistics.MeanAndStandardDeviation that = ((org.jfree.data.statistics.MeanAndStandardDeviation) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.statistics.MeanAndStandardDeviation.this.mean, that.mean))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.statistics.MeanAndStandardDeviation.this.standardDeviation, that.standardDeviation))) {
			return false;
		}
		return true;
	}
}

